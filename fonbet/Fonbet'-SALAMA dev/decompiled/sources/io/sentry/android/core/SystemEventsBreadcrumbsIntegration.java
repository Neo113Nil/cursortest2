package io.sentry.android.core;

import R5.c0;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC0745t;
import androidx.lifecycle.ProcessLifecycleOwner;
import io.sentry.Breadcrumb;
import io.sentry.Hint;
import io.sentry.IScopes;
import io.sentry.ISentryLifecycleToken;
import io.sentry.Integration;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.TypeCheckHint;
import io.sentry.android.core.SystemEventsBreadcrumbsIntegration;
import io.sentry.android.core.internal.util.AndroidCurrentDateProvider;
import io.sentry.android.core.internal.util.AndroidThreadChecker;
import io.sentry.android.core.internal.util.Debouncer;
import io.sentry.protocol.Device;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.IntegrationUtils;
import io.sentry.util.Objects;
import io.sentry.util.StringUtils;
import java.io.Closeable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class SystemEventsBreadcrumbsIntegration implements Integration, Closeable {
    private final String[] actions;
    private final Context context;
    private volatile IntentFilter filter;
    private final MainLooperHandler handler;
    private volatile boolean isClosed;
    private volatile boolean isStopped;
    volatile ReceiverLifecycleHandler lifecycleHandler;
    private SentryAndroidOptions options;
    volatile SystemEventsBroadcastReceiver receiver;
    private final AutoClosableReentrantLock receiverLock;
    private IScopes scopes;

    public final class ReceiverLifecycleHandler implements DefaultLifecycleObserver {
        public ReceiverLifecycleHandler() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStart(InterfaceC0745t interfaceC0745t) {
            if (SystemEventsBreadcrumbsIntegration.this.scopes == null || SystemEventsBreadcrumbsIntegration.this.options == null) {
                return;
            }
            ISentryLifecycleToken acquire = SystemEventsBreadcrumbsIntegration.this.receiverLock.acquire();
            try {
                SystemEventsBreadcrumbsIntegration.this.isStopped = false;
                if (acquire != null) {
                    acquire.close();
                }
                SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration = SystemEventsBreadcrumbsIntegration.this;
                systemEventsBreadcrumbsIntegration.registerReceiver(systemEventsBreadcrumbsIntegration.scopes, SystemEventsBreadcrumbsIntegration.this.options, false);
            } catch (Throwable th) {
                if (acquire != null) {
                    try {
                        acquire.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStop(InterfaceC0745t interfaceC0745t) {
            SystemEventsBreadcrumbsIntegration.this.unregisterReceiver();
        }
    }

    public static final class SystemEventsBroadcastReceiver extends BroadcastReceiver {
        private static final long DEBOUNCE_WAIT_TIME_MS = 60000;
        private final Debouncer batteryChangedDebouncer = new Debouncer(AndroidCurrentDateProvider.getInstance(), DEBOUNCE_WAIT_TIME_MS, 0);
        private final char[] buf = new char[64];
        private final SentryAndroidOptions options;
        private final IScopes scopes;

        public SystemEventsBroadcastReceiver(IScopes iScopes, SentryAndroidOptions sentryAndroidOptions) {
            this.scopes = iScopes;
            this.options = sentryAndroidOptions;
        }

        private Breadcrumb createBreadcrumb(long j, Intent intent, String str, boolean z4) {
            Breadcrumb breadcrumb = new Breadcrumb(j);
            breadcrumb.setType("system");
            breadcrumb.setCategory("device.event");
            String stringAfterDotFast = getStringAfterDotFast(str);
            if (stringAfterDotFast != null) {
                breadcrumb.setData("action", stringAfterDotFast);
            }
            if (z4) {
                Float batteryLevel = DeviceInfoUtil.getBatteryLevel(intent, this.options);
                if (batteryLevel != null) {
                    breadcrumb.setData("level", batteryLevel);
                }
                Boolean isCharging = DeviceInfoUtil.isCharging(intent, this.options);
                if (isCharging != null) {
                    breadcrumb.setData(Device.JsonKeys.CHARGING, isCharging);
                }
            } else {
                Bundle extras = intent.getExtras();
                HashMap hashMap = new HashMap();
                if (extras != null && !extras.isEmpty()) {
                    for (String str2 : extras.keySet()) {
                        try {
                            Object obj = extras.get(str2);
                            if (obj != null) {
                                hashMap.put(str2, obj.toString());
                            }
                        } catch (Throwable th) {
                            this.options.getLogger().log(SentryLevel.ERROR, th, "%s key of the %s action threw an error.", str2, str);
                        }
                    }
                    breadcrumb.setData("extras", hashMap);
                }
            }
            breadcrumb.setLevel(SentryLevel.INFO);
            return breadcrumb;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReceive$0(long j, Intent intent, String str, boolean z4) {
            Breadcrumb createBreadcrumb = createBreadcrumb(j, intent, str, z4);
            Hint hint = new Hint();
            hint.set(TypeCheckHint.ANDROID_INTENT, intent);
            this.scopes.addBreadcrumb(createBreadcrumb, hint);
        }

        public String getStringAfterDotFast(String str) {
            if (str == null) {
                return null;
            }
            int length = str.length();
            int length2 = this.buf.length;
            for (int i7 = length - 1; i7 >= 0; i7--) {
                char charAt = str.charAt(i7);
                if (charAt == '.') {
                    char[] cArr = this.buf;
                    return new String(cArr, length2, cArr.length - length2);
                }
                if (length2 == 0) {
                    return StringUtils.getStringAfterDot(str);
                }
                length2--;
                this.buf[length2] = charAt;
            }
            return str;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, final Intent intent) {
            final String action = intent.getAction();
            final boolean equals = "android.intent.action.BATTERY_CHANGED".equals(action);
            if (equals && this.batteryChangedDebouncer.checkForDebounce()) {
                return;
            }
            final long currentTimeMillis = System.currentTimeMillis();
            try {
                this.options.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.this.lambda$onReceive$0(currentTimeMillis, intent, action, equals);
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    public SystemEventsBreadcrumbsIntegration(Context context) {
        this(context, getDefaultActionsInternal());
    }

    private void addLifecycleObserver(SentryAndroidOptions sentryAndroidOptions) {
        try {
            ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.f9594z;
            if (AndroidThreadChecker.getInstance().isMainThread()) {
                lambda$addLifecycleObserver$1(sentryAndroidOptions);
            } else {
                this.handler.post(new b(2, this, sentryAndroidOptions));
            }
        } catch (ClassNotFoundException unused) {
            sentryAndroidOptions.getLogger().log(SentryLevel.WARNING, "androidx.lifecycle is not available, SystemEventsBreadcrumbsIntegration won't be able to register/unregister an internal BroadcastReceiver. This may result in an increased ANR rate on Android 14 and above.", new Object[0]);
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().log(SentryLevel.ERROR, "SystemEventsBreadcrumbsIntegration could not register lifecycle observer", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: addObserverInternal, reason: merged with bridge method [inline-methods] */
    public void lambda$addLifecycleObserver$1(SentryAndroidOptions sentryAndroidOptions) {
        this.lifecycleHandler = new ReceiverLifecycleHandler();
        try {
            ProcessLifecycleOwner.f9594z.f9600f.a(this.lifecycleHandler);
        } catch (Throwable th) {
            this.lifecycleHandler = null;
            sentryAndroidOptions.getLogger().log(SentryLevel.ERROR, "SystemEventsBreadcrumbsIntegration failed to get Lifecycle and could not install lifecycle observer.", th);
        }
    }

    public static List<String> getDefaultActions() {
        return Arrays.asList(getDefaultActionsInternal());
    }

    private static String[] getDefaultActionsInternal() {
        return new String[]{"android.intent.action.ACTION_SHUTDOWN", "android.intent.action.AIRPLANE_MODE", "android.intent.action.BATTERY_CHANGED", "android.intent.action.CAMERA_BUTTON", "android.intent.action.CONFIGURATION_CHANGED", "android.intent.action.DATE_CHANGED", "android.intent.action.DEVICE_STORAGE_LOW", "android.intent.action.DEVICE_STORAGE_OK", "android.intent.action.DOCK_EVENT", "android.intent.action.DREAMING_STARTED", "android.intent.action.DREAMING_STOPPED", "android.intent.action.INPUT_METHOD_CHANGED", "android.intent.action.LOCALE_CHANGED", "android.intent.action.SCREEN_OFF", "android.intent.action.SCREEN_ON", "android.intent.action.TIMEZONE_CHANGED", "android.intent.action.TIME_SET", "android.os.action.DEVICE_IDLE_MODE_CHANGED", "android.os.action.POWER_SAVE_MODE_CHANGED"};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006d, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0070, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void lambda$registerReceiver$0(IScopes iScopes, SentryAndroidOptions sentryAndroidOptions, boolean z4) {
        ISentryLifecycleToken acquire = this.receiverLock.acquire();
        try {
            if (!this.isClosed && !this.isStopped && this.receiver == null) {
                this.receiver = new SystemEventsBroadcastReceiver(iScopes, sentryAndroidOptions);
                if (this.filter == null) {
                    this.filter = new IntentFilter();
                    for (String str : this.actions) {
                        this.filter.addAction(str);
                    }
                }
                try {
                    ContextUtils.registerReceiver(this.context, sentryAndroidOptions, this.receiver, this.filter);
                    if (z4) {
                        sentryAndroidOptions.getLogger().log(SentryLevel.DEBUG, "SystemEventsBreadcrumbsIntegration installed.", new Object[0]);
                        IntegrationUtils.addIntegrationToSdkVersion("SystemEventsBreadcrumbs");
                    }
                } catch (Throwable th) {
                    sentryAndroidOptions.setEnableSystemEventBreadcrumbs(false);
                    sentryAndroidOptions.getLogger().log(SentryLevel.ERROR, "Failed to initialize SystemEventsBreadcrumbsIntegration.", th);
                }
                if (acquire != null) {
                    acquire.close();
                }
            }
        } catch (Throwable th2) {
            if (acquire != null) {
                try {
                    acquire.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void registerReceiver(IScopes iScopes, SentryAndroidOptions sentryAndroidOptions, boolean z4) {
        if (sentryAndroidOptions.isEnableSystemEventBreadcrumbs()) {
            ISentryLifecycleToken acquire = this.receiverLock.acquire();
            try {
                if (!this.isClosed && !this.isStopped) {
                    if (this.receiver == null) {
                        if (acquire != null) {
                            acquire.close();
                        }
                        try {
                            sentryAndroidOptions.getExecutorService().submit(new c0(1, this, iScopes, sentryAndroidOptions, z4));
                            return;
                        } catch (Throwable unused) {
                            sentryAndroidOptions.getLogger().log(SentryLevel.WARNING, "Failed to start SystemEventsBreadcrumbsIntegration on executor thread.", new Object[0]);
                            return;
                        }
                    }
                }
                if (acquire != null) {
                    acquire.close();
                }
            } catch (Throwable th) {
                if (acquire != null) {
                    try {
                        acquire.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    private void removeLifecycleObserver() {
        if (this.lifecycleHandler != null) {
            if (AndroidThreadChecker.getInstance().isMainThread()) {
                lambda$removeLifecycleObserver$2();
            } else {
                this.handler.post(new d(this, 6));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: removeObserverInternal, reason: merged with bridge method [inline-methods] */
    public void lambda$removeLifecycleObserver$2() {
        ReceiverLifecycleHandler receiverLifecycleHandler = this.lifecycleHandler;
        if (receiverLifecycleHandler != null) {
            ProcessLifecycleOwner.f9594z.f9600f.b(receiverLifecycleHandler);
        }
        this.lifecycleHandler = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void unregisterReceiver() {
        ISentryLifecycleToken acquire = this.receiverLock.acquire();
        try {
            this.isStopped = true;
            SystemEventsBroadcastReceiver systemEventsBroadcastReceiver = this.receiver;
            this.receiver = null;
            if (acquire != null) {
                acquire.close();
            }
            if (systemEventsBroadcastReceiver != null) {
                this.context.unregisterReceiver(systemEventsBroadcastReceiver);
            }
        } catch (Throwable th) {
            if (acquire != null) {
                try {
                    acquire.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ISentryLifecycleToken acquire = this.receiverLock.acquire();
        try {
            this.isClosed = true;
            this.filter = null;
            if (acquire != null) {
                acquire.close();
            }
            removeLifecycleObserver();
            unregisterReceiver();
            SentryAndroidOptions sentryAndroidOptions = this.options;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().log(SentryLevel.DEBUG, "SystemEventsBreadcrumbsIntegration remove.", new Object[0]);
            }
        } catch (Throwable th) {
            if (acquire != null) {
                try {
                    acquire.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // io.sentry.Integration
    public void register(IScopes iScopes, SentryOptions sentryOptions) {
        Objects.requireNonNull(iScopes, "Scopes are required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) Objects.requireNonNull(sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null, "SentryAndroidOptions is required");
        this.options = sentryAndroidOptions;
        this.scopes = iScopes;
        sentryAndroidOptions.getLogger().log(SentryLevel.DEBUG, "SystemEventsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.options.isEnableSystemEventBreadcrumbs()));
        if (this.options.isEnableSystemEventBreadcrumbs()) {
            addLifecycleObserver(this.options);
            registerReceiver(this.scopes, this.options, true);
        }
    }

    private SystemEventsBreadcrumbsIntegration(Context context, String[] strArr) {
        this(context, strArr, new MainLooperHandler());
    }

    public SystemEventsBreadcrumbsIntegration(Context context, String[] strArr, MainLooperHandler mainLooperHandler) {
        this.isClosed = false;
        this.isStopped = false;
        this.filter = null;
        this.receiverLock = new AutoClosableReentrantLock();
        this.context = ContextUtils.getApplicationContext(context);
        this.actions = strArr;
        this.handler = mainLooperHandler;
    }

    public SystemEventsBreadcrumbsIntegration(Context context, List<String> list) {
        this.isClosed = false;
        this.isStopped = false;
        this.filter = null;
        this.receiverLock = new AutoClosableReentrantLock();
        this.context = ContextUtils.getApplicationContext(context);
        String[] strArr = new String[list.size()];
        this.actions = strArr;
        list.toArray(strArr);
        this.handler = new MainLooperHandler();
    }
}
