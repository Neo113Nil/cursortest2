package com.onesignal.internal;

import B0.o;
import B3.c;
import B4.k;
import C1.b;
import D4.AbstractC0020u;
import D4.AbstractC0024y;
import D4.C0013m;
import D4.E;
import D4.InterfaceC0012l;
import a.AbstractC0169a;
import android.content.Context;
import b2.AbstractC0279e;
import com.onesignal.IOneSignal;
import com.onesignal.IUserJwtInvalidatedListener;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.OneSignalUtils;
import com.onesignal.common.modules.IModule;
import com.onesignal.common.services.IServiceProvider;
import com.onesignal.common.services.ServiceBuilder;
import com.onesignal.common.services.ServiceProvider;
import com.onesignal.common.threading.OneSignalDispatchers;
import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.core.CoreModule;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.application.impl.ApplicationService;
import com.onesignal.core.internal.config.ConfigModel;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.config.impl.IdentityVerificationService;
import com.onesignal.core.internal.features.FeatureFlag;
import com.onesignal.core.internal.features.IFeatureManager;
import com.onesignal.core.internal.operations.IOperationRepo;
import com.onesignal.core.internal.preferences.IPreferencesService;
import com.onesignal.core.internal.preferences.PreferenceStoreFix;
import com.onesignal.core.internal.startup.StartupService;
import com.onesignal.debug.IDebugManager;
import com.onesignal.debug.LogLevel;
import com.onesignal.debug.internal.DebugManager;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.inAppMessages.IInAppMessagesManager;
import com.onesignal.location.ILocationManager;
import com.onesignal.notifications.INotificationsManager;
import com.onesignal.session.ISessionManager;
import com.onesignal.session.SessionModule;
import com.onesignal.user.IUserManager;
import com.onesignal.user.UserModule;
import com.onesignal.user.internal.AppIdResolution;
import com.onesignal.user.internal.AppIdResolutionKt;
import com.onesignal.user.internal.LoginHelper;
import com.onesignal.user.internal.LogoutHelper;
import com.onesignal.user.internal.UserSwitcher;
import com.onesignal.user.internal.identity.IdentityModelStore;
import com.onesignal.user.internal.jwt.JwtTokenStore;
import com.onesignal.user.internal.properties.PropertiesModelStore;
import com.onesignal.user.internal.subscriptions.SubscriptionModelStore;
import e5.g;
import f4.InterfaceC0428e;
import f4.v;
import g4.AbstractC0466k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class OneSignalImp implements IOneSignal, IServiceProvider {
    private Boolean _consentGiven;
    private Boolean _consentRequired;
    private Boolean _disableGMSMissingPrompt;
    private final Object applicationServiceLock;
    private volatile boolean applicationServiceStarted;
    private final InterfaceC0428e configModel$delegate;
    private final IDebugManager debug;
    private final InterfaceC0428e featureManager$delegate;
    private final InterfaceC0428e identityModelStore$delegate;
    private final InterfaceC0428e identityVerificationService$delegate;
    private Exception initFailureException;
    private final Object initLock;
    private volatile InitState initState;
    private final AbstractC0020u ioDispatcher;
    private final InterfaceC0428e jwtTokenStore$delegate;
    private final List<String> listOfModules;
    private final InterfaceC0428e loginHelper$delegate;
    private final Object loginLogoutLock;
    private final InterfaceC0428e logoutHelper$delegate;
    private final InterfaceC0428e operationRepo$delegate;
    private OtelLifecycleManager otelManager;
    private final InterfaceC0428e preferencesService$delegate;
    private final InterfaceC0428e propertiesModelStore$delegate;
    private final String sdkVersion;
    private final ServiceProvider services;
    private final InterfaceC0428e subscriptionModelStore$delegate;
    private volatile InterfaceC0012l suspendCompletion;
    private final InterfaceC0428e userSwitcher$delegate;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InitState.values().length];
            try {
                iArr[InitState.NOT_STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InitState.IN_PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InitState.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InitState.SUCCESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public OneSignalImp() {
        this(null, 1, null);
    }

    private final <T> T blockingGet(InterfaceC1430a interfaceC1430a) {
        try {
            if (AndroidUtils.INSTANCE.isRunningOnMainThread()) {
                Logging.debug$default("This is called on main thread. This is not recommended.", null, 2, null);
            }
        } catch (RuntimeException e3) {
            Logging.debug$default("Could not check main thread status (likely in test environment): " + e3.getMessage(), null, 2, null);
        }
        return (T) AbstractC0024y.q(getRuntimeIoDispatcher(), new OneSignalImp$blockingGet$1(this, interfaceC1430a, null));
    }

    private final StartupService bootstrapServices() {
        StartupService startupService = new StartupService(this.services);
        startupService.bootstrap();
        return startupService;
    }

    private final void completeInit(InitState initState) {
        if (initState != InitState.SUCCESS && initState != InitState.FAILED) {
            throw new IllegalArgumentException(("completeInit requires a terminal state, got " + initState).toString());
        }
        synchronized (this.initLock) {
            this.initState = initState;
            ((C0013m) this.suspendCompletion).L(v.f5689a);
        }
    }

    private final void ensureApplicationServiceStarted(Context context) {
        if (this.applicationServiceStarted) {
            return;
        }
        synchronized (this.applicationServiceLock) {
            if (this.applicationServiceStarted) {
                return;
            }
            IApplicationService iApplicationService = (IApplicationService) this.services.getService(IApplicationService.class);
            i.c(iApplicationService, "null cannot be cast to non-null type com.onesignal.core.internal.application.impl.ApplicationService");
            ((ApplicationService) iApplicationService).start(context);
            Logging.INSTANCE.setApplicationService(iApplicationService);
            this.applicationServiceStarted = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ConfigModel getConfigModel() {
        return (ConfigModel) this.configModel$delegate.getValue();
    }

    private final IFeatureManager getFeatureManager() {
        return (IFeatureManager) this.featureManager$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IdentityModelStore getIdentityModelStore() {
        return (IdentityModelStore) this.identityModelStore$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IdentityVerificationService getIdentityVerificationService() {
        return (IdentityVerificationService) this.identityVerificationService$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JwtTokenStore getJwtTokenStore() {
        return (JwtTokenStore) this.jwtTokenStore$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LoginHelper getLoginHelper() {
        return (LoginHelper) this.loginHelper$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LogoutHelper getLogoutHelper() {
        return (LogoutHelper) this.logoutHelper$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IOperationRepo getOperationRepo() {
        return (IOperationRepo) this.operationRepo$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IPreferencesService getPreferencesService() {
        return (IPreferencesService) this.preferencesService$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PropertiesModelStore getPropertiesModelStore() {
        return (PropertiesModelStore) this.propertiesModelStore$delegate.getValue();
    }

    private final AbstractC0020u getRuntimeIoDispatcher() {
        return isBackgroundThreadingEnabled() ? OneSignalDispatchers.INSTANCE.getIO() : this.ioDispatcher;
    }

    private final <T> T getServiceWithFeatureGate(InterfaceC1430a interfaceC1430a) {
        if (isBackgroundThreadingEnabled()) {
            return (T) waitAndReturn(interfaceC1430a);
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.initState.ordinal()];
        if (i2 == 1) {
            throw new IllegalStateException("Must call 'initWithContext' before use");
        }
        if (i2 == 2) {
            warnIfBlockingOnMainThread(null);
            return (T) waitAndReturn(interfaceC1430a);
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return (T) interfaceC1430a.invoke();
            }
            throw new b();
        }
        Exception exc = this.initFailureException;
        if (exc != null) {
            throw exc;
        }
        throw new IllegalStateException("Initialization failed. Cannot proceed.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SubscriptionModelStore getSubscriptionModelStore() {
        return (SubscriptionModelStore) this.subscriptionModelStore$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UserSwitcher getUserSwitcher() {
        return (UserSwitcher) this.userSwitcher$delegate.getValue();
    }

    private final void initEssentials(Context context) {
        OtelLifecycleManager otelLifecycleManager = new OtelLifecycleManager(context, new OneSignalImp$initEssentials$1(this), null, null, null, null, null, 124, null);
        otelLifecycleManager.initializeFromCachedConfig();
        this.otelManager = otelLifecycleManager;
        PreferenceStoreFix.INSTANCE.ensureNoObfuscatedPrefStore(context);
        ensureApplicationServiceStarted(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean internalInit(Context context, String str) {
        try {
            if (!AndroidUtils.INSTANCE.isAndroidUserUnlocked(context)) {
                Logging.warn$default("initWithContext called when device storage is locked, no user data is accessible!", null, 2, null);
                completeInit(InitState.FAILED);
                return false;
            }
            initEssentials(context);
            StartupService bootstrapServices = bootstrapServices();
            OtelLifecycleManager otelLifecycleManager = this.otelManager;
            if (otelLifecycleManager != null) {
                otelLifecycleManager.subscribeToConfigStore((ConfigModelStore) this.services.getService(ConfigModelStore.class));
            }
            AppIdResolution resolveAppId = AppIdResolutionKt.resolveAppId(str, getConfigModel(), getPreferencesService());
            if (resolveAppId.getFailed()) {
                IllegalStateException illegalStateException = new IllegalStateException("suspendInitInternal: no appId provided or found in local storage. Please pass a valid appId to initWithContext().");
                Exception exc = this.initFailureException;
                if (exc != null) {
                    K1.b.C(exc, illegalStateException);
                }
                Logging.warn$default("suspendInitInternal: no appId provided or found in local storage. Please pass a valid appId to initWithContext().", null, 2, null);
                completeInit(InitState.FAILED);
                return false;
            }
            ConfigModel configModel = getConfigModel();
            String appId = resolveAppId.getAppId();
            i.b(appId);
            configModel.setAppId(appId);
            boolean forceCreateUser = resolveAppId.getForceCreateUser();
            updateConfig();
            getUserSwitcher().initUser(forceCreateUser);
            bootstrapServices.scheduleStart();
            completeInit(InitState.SUCCESS);
            return true;
        } catch (Exception e3) {
            Logging.error("OneSignal: internalInit threw unexpectedly; marking init FAILED", e3);
            Exception exc2 = this.initFailureException;
            if (exc2 != null) {
                K1.b.C(exc2, e3);
            }
            completeInit(InitState.FAILED);
            return false;
        }
    }

    private final boolean isBackgroundThreadingEnabled() {
        if (!this.applicationServiceStarted) {
            return false;
        }
        try {
            return getFeatureManager().isEnabled(FeatureFlag.SDK_BACKGROUND_THREADING);
        } catch (Throwable th) {
            Logging.warn("OneSignal: Failed to resolve BACKGROUND_THREADING feature, defaulting to legacy mode.", th);
            return false;
        }
    }

    private static /* synthetic */ void isBackgroundThreadingEnabled$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void login$lambda$4(OneSignalImp this$0, LoginHelper.LoginEnqueueContext context) {
        i.e(this$0, "this$0");
        i.e(context, "$context");
        AbstractC0024y.q(this$0.getRuntimeIoDispatcher(), new OneSignalImp$login$2$1(this$0, context, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void logout$lambda$5(OneSignalImp this$0, LogoutHelper.LogoutEnqueueContext context) {
        i.e(this$0, "this$0");
        i.e(context, "$context");
        AbstractC0024y.q(this$0.getRuntimeIoDispatcher(), new OneSignalImp$logout$2$1(this$0, context, null));
    }

    private final void requireInitForOperation(String str) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.initState.ordinal()];
        if (i2 == 1) {
            throw new IllegalStateException(o.j("Must call 'initWithContext' before '", str, '\''));
        }
        if (i2 == 2) {
            warnIfBlockingOnMainThread(str);
            waitForInit(str);
        } else {
            if (i2 != 3) {
                return;
            }
            Exception exc = this.initFailureException;
            if (exc == null) {
                throw new IllegalStateException(o.j("Initialization failed before '", str, '\''));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> Object suspendAndReturn(InterfaceC1430a interfaceC1430a, InterfaceC1218d interfaceC1218d) {
        OneSignalImp$suspendAndReturn$1 oneSignalImp$suspendAndReturn$1;
        int i2;
        if (interfaceC1218d instanceof OneSignalImp$suspendAndReturn$1) {
            oneSignalImp$suspendAndReturn$1 = (OneSignalImp$suspendAndReturn$1) interfaceC1218d;
            int i3 = oneSignalImp$suspendAndReturn$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                oneSignalImp$suspendAndReturn$1.label = i3 - Integer.MIN_VALUE;
                Object obj = oneSignalImp$suspendAndReturn$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = oneSignalImp$suspendAndReturn$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    oneSignalImp$suspendAndReturn$1.L$0 = interfaceC1430a;
                    oneSignalImp$suspendAndReturn$1.label = 1;
                    if (suspendUntilInit$default(this, null, oneSignalImp$suspendAndReturn$1, 1, null) == enumC1260a) {
                        return enumC1260a;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC1430a = (InterfaceC1430a) oneSignalImp$suspendAndReturn$1.L$0;
                    g.y(obj);
                }
                return interfaceC1430a.invoke();
            }
        }
        oneSignalImp$suspendAndReturn$1 = new OneSignalImp$suspendAndReturn$1(this, interfaceC1218d);
        Object obj2 = oneSignalImp$suspendAndReturn$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = oneSignalImp$suspendAndReturn$1.label;
        if (i2 != 0) {
        }
        return interfaceC1430a.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object suspendUntilInit(String str, InterfaceC1218d interfaceC1218d) {
        Object waitUntilInitInternal = waitUntilInitInternal(str, interfaceC1218d);
        return waitUntilInitInternal == EnumC1260a.f11058a ? waitUntilInitInternal : v.f5689a;
    }

    public static /* synthetic */ Object suspendUntilInit$default(OneSignalImp oneSignalImp, String str, InterfaceC1218d interfaceC1218d, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        return oneSignalImp.suspendUntilInit(str, interfaceC1218d);
    }

    private final void updateConfig() {
        if (this._consentRequired != null) {
            ConfigModel configModel = getConfigModel();
            Boolean bool = this._consentRequired;
            i.b(bool);
            configModel.setConsentRequired(bool);
        }
        if (this._consentGiven != null) {
            ConfigModel configModel2 = getConfigModel();
            Boolean bool2 = this._consentGiven;
            i.b(bool2);
            configModel2.setConsentGiven(bool2);
        }
        if (this._disableGMSMissingPrompt != null) {
            ConfigModel configModel3 = getConfigModel();
            Boolean bool3 = this._disableGMSMissingPrompt;
            i.b(bool3);
            configModel3.setDisableGMSMissingPrompt(bool3.booleanValue());
        }
    }

    private final <T> T waitAndReturn(InterfaceC1430a interfaceC1430a) {
        waitForInit$default(this, null, 1, null);
        return (T) interfaceC1430a.invoke();
    }

    private final void waitForInit(String str) {
        AbstractC0024y.q(getRuntimeIoDispatcher(), new OneSignalImp$waitForInit$1(this, str, null));
    }

    public static /* synthetic */ void waitForInit$default(OneSignalImp oneSignalImp, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        oneSignalImp.waitForInit(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object waitUntilInitInternal(String str, InterfaceC1218d interfaceC1218d) {
        OneSignalImp$waitUntilInitInternal$1 oneSignalImp$waitUntilInitInternal$1;
        int i2;
        InitState initState;
        InterfaceC0012l interfaceC0012l;
        OneSignalImp oneSignalImp;
        long j2;
        String str2;
        if (interfaceC1218d instanceof OneSignalImp$waitUntilInitInternal$1) {
            oneSignalImp$waitUntilInitInternal$1 = (OneSignalImp$waitUntilInitInternal$1) interfaceC1218d;
            int i3 = oneSignalImp$waitUntilInitInternal$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                oneSignalImp$waitUntilInitInternal$1.label = i3 - Integer.MIN_VALUE;
                Object obj = oneSignalImp$waitUntilInitInternal$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = oneSignalImp$waitUntilInitInternal$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    synchronized (this.initLock) {
                        initState = this.initState;
                        interfaceC0012l = initState == InitState.IN_PROGRESS ? this.suspendCompletion : null;
                    }
                    int i6 = WhenMappings.$EnumSwitchMapping$0[initState.ordinal()];
                    if (i6 == 1) {
                        throw new IllegalStateException(str != null ? o.j("Must call 'initWithContext' before '", str, '\'') : "Must call 'initWithContext' before use");
                    }
                    if (i6 != 2) {
                        if (i6 == 3) {
                            Exception exc = this.initFailureException;
                            if (exc != null) {
                                throw exc;
                            }
                            throw new IllegalStateException("Initialization failed. Cannot proceed.");
                        }
                        return v.f5689a;
                    }
                    Logging.debug$default("Waiting for init to complete...", null, 2, null);
                    long currentTimeMillis = System.currentTimeMillis();
                    i.b(interfaceC0012l);
                    oneSignalImp$waitUntilInitInternal$1.L$0 = this;
                    oneSignalImp$waitUntilInitInternal$1.L$1 = str;
                    oneSignalImp$waitUntilInitInternal$1.J$0 = currentTimeMillis;
                    oneSignalImp$waitUntilInitInternal$1.label = 1;
                    if (((C0013m) interfaceC0012l).W(oneSignalImp$waitUntilInitInternal$1) == enumC1260a) {
                        return enumC1260a;
                    }
                    oneSignalImp = this;
                    j2 = currentTimeMillis;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j2 = oneSignalImp$waitUntilInitInternal$1.J$0;
                    str = (String) oneSignalImp$waitUntilInitInternal$1.L$1;
                    oneSignalImp = (OneSignalImp) oneSignalImp$waitUntilInitInternal$1.L$0;
                    g.y(obj);
                }
                long currentTimeMillis2 = System.currentTimeMillis() - j2;
                if (str == null) {
                    str2 = "OneSignalImp initialization completed before '" + str + "' (took " + currentTimeMillis2 + "ms)";
                } else {
                    str2 = "OneSignalImp initialization completed (took " + currentTimeMillis2 + "ms)";
                }
                Logging.debug$default(str2, null, 2, null);
                if (oneSignalImp.initState == InitState.FAILED) {
                    Exception exc2 = oneSignalImp.initFailureException;
                    if (exc2 != null) {
                        throw exc2;
                    }
                    throw new IllegalStateException("Initialization failed. Cannot proceed.");
                }
                return v.f5689a;
            }
        }
        oneSignalImp$waitUntilInitInternal$1 = new OneSignalImp$waitUntilInitInternal$1(this, interfaceC1218d);
        Object obj2 = oneSignalImp$waitUntilInitInternal$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = oneSignalImp$waitUntilInitInternal$1.label;
        if (i2 != 0) {
        }
        long currentTimeMillis22 = System.currentTimeMillis() - j2;
        if (str == null) {
        }
        Logging.debug$default(str2, null, 2, null);
        if (oneSignalImp.initState == InitState.FAILED) {
        }
        return v.f5689a;
    }

    public static /* synthetic */ Object waitUntilInitInternal$default(OneSignalImp oneSignalImp, String str, InterfaceC1218d interfaceC1218d, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        return oneSignalImp.waitUntilInitInternal(str, interfaceC1218d);
    }

    private final void warnIfBlockingOnMainThread(String str) {
        String str2;
        if (isBackgroundThreadingEnabled()) {
            return;
        }
        try {
            if (AndroidUtils.INSTANCE.isRunningOnMainThread()) {
                if (str == null || (str2 = o.j("'", str, '\'')) == null) {
                    str2 = "this OneSignal API";
                }
                Logging.warn$default(AbstractC0279e.f("Calling ", str2, " on the main thread while OneSignal initialization is still in progress. This will block the UI thread until init completes (ANR risk on slow devices). Prefer calling from a background thread, or use the suspend API (OneSignal.initWithContextSuspend, OneSignal.getUser(), OneSignal.loginSuspend(), etc.) from a coroutine."), null, 2, null);
            }
        } catch (RuntimeException e3) {
            Logging.debug$default("Could not determine main-thread status; skipping ANR-risk warning: " + e3.getMessage(), null, 2, null);
        }
    }

    @Override // com.onesignal.IOneSignal
    public void addUserJwtInvalidatedListener(IUserJwtInvalidatedListener listener) {
        i.e(listener, "listener");
        if (isBackgroundThreadingEnabled()) {
            waitForInit("addUserJwtInvalidatedListener");
        } else if (!isInitialized()) {
            throw new IllegalStateException("Must call 'initWithContext' before 'addUserJwtInvalidatedListener'");
        }
        getJwtTokenStore().addUserJwtInvalidatedListener(listener);
    }

    @Override // com.onesignal.common.services.IServiceProvider
    public <T> List<T> getAllServices(Class<T> c2) {
        i.e(c2, "c");
        return this.services.getAllServices(c2);
    }

    @Override // com.onesignal.IOneSignal
    public boolean getConsentGiven() {
        return isInitialized() ? ((Boolean) blockingGet(new OneSignalImp$consentGiven$1(this))).booleanValue() : i.a(this._consentGiven, Boolean.TRUE);
    }

    @Override // com.onesignal.IOneSignal
    public boolean getConsentRequired() {
        return isInitialized() ? ((Boolean) blockingGet(new OneSignalImp$consentRequired$1(this))).booleanValue() : i.a(this._consentRequired, Boolean.TRUE);
    }

    @Override // com.onesignal.IOneSignal
    public IDebugManager getDebug() {
        return this.debug;
    }

    @Override // com.onesignal.IOneSignal
    public boolean getDisableGMSMissingPrompt() {
        return isInitialized() ? ((Boolean) blockingGet(new OneSignalImp$disableGMSMissingPrompt$1(this))).booleanValue() : i.a(this._disableGMSMissingPrompt, Boolean.TRUE);
    }

    @Override // com.onesignal.IOneSignal
    public IInAppMessagesManager getInAppMessages() {
        return (IInAppMessagesManager) getServiceWithFeatureGate(new OneSignalImp$inAppMessages$1(this));
    }

    @Override // com.onesignal.IOneSignal
    public ILocationManager getLocation() {
        return (ILocationManager) getServiceWithFeatureGate(new OneSignalImp$location$1(this));
    }

    @Override // com.onesignal.IOneSignal
    public INotificationsManager getNotifications() {
        return (INotificationsManager) getServiceWithFeatureGate(new OneSignalImp$notifications$1(this));
    }

    @Override // com.onesignal.IOneSignal
    public String getSdkVersion() {
        return this.sdkVersion;
    }

    @Override // com.onesignal.common.services.IServiceProvider
    public <T> T getService(Class<T> c2) {
        i.e(c2, "c");
        return (T) this.services.getService(c2);
    }

    @Override // com.onesignal.common.services.IServiceProvider
    public <T> T getServiceOrNull(Class<T> c2) {
        i.e(c2, "c");
        return (T) this.services.getServiceOrNull(c2);
    }

    @Override // com.onesignal.IOneSignal
    public ISessionManager getSession() {
        return (ISessionManager) getServiceWithFeatureGate(new OneSignalImp$session$1(this));
    }

    @Override // com.onesignal.IOneSignal
    public IUserManager getUser() {
        return (IUserManager) getServiceWithFeatureGate(new OneSignalImp$user$1(this));
    }

    @Override // com.onesignal.common.services.IServiceProvider
    public <T> boolean hasService(Class<T> c2) {
        i.e(c2, "c");
        return this.services.hasService(c2);
    }

    @Override // com.onesignal.IOneSignal
    public boolean initWithContext(Context context, String appId) {
        i.e(context, "context");
        i.e(appId, "appId");
        LogLevel logLevel = LogLevel.DEBUG;
        Logging.log(logLevel, "Calling deprecated initWithContext(context: " + context + ", appId: " + appId + ')');
        OneSignalDispatchers.INSTANCE.prewarm();
        synchronized (this.initLock) {
            if (this.initState.isSDKAccessible()) {
                Logging.log(logLevel, "initWithContext: SDK already initialized or in progress");
                return true;
            }
            this.initFailureException = new IllegalStateException("OneSignal initWithContext failed.");
            this.initState = InitState.IN_PROGRESS;
            this.suspendCompletion = AbstractC0024y.a();
            try {
                ensureApplicationServiceStarted(context);
                if (!isBackgroundThreadingEnabled()) {
                    return ((Boolean) AbstractC0024y.q(getRuntimeIoDispatcher(), new OneSignalImp$initWithContext$3(this, context, appId, null))).booleanValue();
                }
                ThreadUtilsKt.suspendifyOnIO(new OneSignalImp$initWithContext$2(this, context, appId, null));
                return true;
            } catch (Exception e3) {
                Exception exc = this.initFailureException;
                if (exc != null) {
                    K1.b.C(exc, e3);
                }
                completeInit(InitState.FAILED);
                throw e3;
            }
        }
    }

    @Override // com.onesignal.IOneSignal
    public Object initWithContextSuspend(Context context, String str, InterfaceC1218d interfaceC1218d) {
        Logging.log(LogLevel.DEBUG, "initWithContext(context: " + context + ", appId: " + str + ')');
        OneSignalDispatchers.INSTANCE.prewarm();
        return AbstractC0024y.w(getRuntimeIoDispatcher(), new OneSignalImp$initWithContextSuspend$2(this, context, str, null), interfaceC1218d);
    }

    @Override // com.onesignal.IOneSignal
    public boolean isInitialized() {
        return this.initState == InitState.SUCCESS;
    }

    @Override // com.onesignal.IOneSignal
    public void login(String str) {
        IOneSignal.DefaultImpls.login(this, str);
    }

    @Override // com.onesignal.IOneSignal
    public Object loginSuspend(String str, String str2, InterfaceC1218d interfaceC1218d) {
        Object w3 = AbstractC0024y.w(getRuntimeIoDispatcher(), new OneSignalImp$loginSuspend$2(str, str2, this, null), interfaceC1218d);
        return w3 == EnumC1260a.f11058a ? w3 : v.f5689a;
    }

    @Override // com.onesignal.IOneSignal
    public void logout() {
        Logging.log(LogLevel.DEBUG, "Calling deprecated logout()");
        if (isBackgroundThreadingEnabled()) {
            waitForInit("logout");
        } else {
            requireInitForOperation("logout");
        }
        LogoutHelper.LogoutEnqueueContext switchUser$com_onesignal_core = getLogoutHelper().switchUser$com_onesignal_core();
        if (switchUser$com_onesignal_core == null) {
            return;
        }
        if (isBackgroundThreadingEnabled()) {
            ThreadUtilsKt.suspendifyOnIO(new OneSignalImp$logout$1(this, switchUser$com_onesignal_core, null));
        } else {
            new Thread(new c(this, 10, switchUser$com_onesignal_core)).start();
        }
    }

    @Override // com.onesignal.IOneSignal
    public Object logoutSuspend(InterfaceC1218d interfaceC1218d) {
        Object w3 = AbstractC0024y.w(getRuntimeIoDispatcher(), new OneSignalImp$logoutSuspend$2(this, null), interfaceC1218d);
        return w3 == EnumC1260a.f11058a ? w3 : v.f5689a;
    }

    @Override // com.onesignal.IOneSignal
    public void removeUserJwtInvalidatedListener(IUserJwtInvalidatedListener listener) {
        i.e(listener, "listener");
        if (isBackgroundThreadingEnabled()) {
            waitForInit("removeUserJwtInvalidatedListener");
        } else if (!isInitialized()) {
            throw new IllegalStateException("Must call 'initWithContext' before 'removeUserJwtInvalidatedListener'");
        }
        getJwtTokenStore().removeUserJwtInvalidatedListener(listener);
    }

    @Override // com.onesignal.IOneSignal
    public void setConsentGiven(boolean z) {
        Boolean bool = this._consentGiven;
        this._consentGiven = Boolean.valueOf(z);
        if (isInitialized()) {
            getConfigModel().setConsentGiven(Boolean.valueOf(z));
            if (i.a(bool, Boolean.valueOf(z)) || !z) {
                return;
            }
            getOperationRepo().forceExecuteOperations();
        }
    }

    @Override // com.onesignal.IOneSignal
    public void setConsentRequired(boolean z) {
        this._consentRequired = Boolean.valueOf(z);
        if (isInitialized()) {
            getConfigModel().setConsentRequired(Boolean.valueOf(z));
        }
    }

    @Override // com.onesignal.IOneSignal
    public void setDisableGMSMissingPrompt(boolean z) {
        this._disableGMSMissingPrompt = Boolean.valueOf(z);
        if (isInitialized()) {
            getConfigModel().setDisableGMSMissingPrompt(z);
        }
    }

    @Override // com.onesignal.IOneSignal
    public void updateUserJwt(String externalId, String token) {
        i.e(externalId, "externalId");
        i.e(token, "token");
        Logging.log(LogLevel.DEBUG, "updateUserJwt(externalId: " + externalId + ", token: ..." + k.m0(token) + ')');
        if (isBackgroundThreadingEnabled()) {
            waitForInit("updateUserJwt");
        } else if (!isInitialized()) {
            throw new IllegalStateException("Must call 'initWithContext' before 'updateUserJwt'");
        }
        getJwtTokenStore().putJwt(externalId, token);
        getOperationRepo().forceExecuteOperations();
    }

    @Override // com.onesignal.IOneSignal
    public Object updateUserJwtSuspend(String str, String str2, InterfaceC1218d interfaceC1218d) {
        Object w3 = AbstractC0024y.w(getRuntimeIoDispatcher(), new OneSignalImp$updateUserJwtSuspend$2(str, str2, this, null), interfaceC1218d);
        return w3 == EnumC1260a.f11058a ? w3 : v.f5689a;
    }

    public OneSignalImp(AbstractC0020u ioDispatcher) {
        i.e(ioDispatcher, "ioDispatcher");
        this.ioDispatcher = ioDispatcher;
        this.suspendCompletion = AbstractC0024y.a();
        this.initState = InitState.NOT_STARTED;
        this.sdkVersion = OneSignalUtils.INSTANCE.getSdkVersion();
        this.debug = new DebugManager();
        this.operationRepo$delegate = AbstractC0169a.A(new OneSignalImp$operationRepo$2(this));
        this.identityModelStore$delegate = AbstractC0169a.A(new OneSignalImp$identityModelStore$2(this));
        this.propertiesModelStore$delegate = AbstractC0169a.A(new OneSignalImp$propertiesModelStore$2(this));
        this.subscriptionModelStore$delegate = AbstractC0169a.A(new OneSignalImp$subscriptionModelStore$2(this));
        this.preferencesService$delegate = AbstractC0169a.A(new OneSignalImp$preferencesService$2(this));
        this.jwtTokenStore$delegate = AbstractC0169a.A(new OneSignalImp$jwtTokenStore$2(this));
        this.identityVerificationService$delegate = AbstractC0169a.A(new OneSignalImp$identityVerificationService$2(this));
        List<String> A02 = AbstractC0466k.A0("com.onesignal.notifications.NotificationsModule", "com.onesignal.inAppMessages.InAppMessagesModule", "com.onesignal.location.LocationModule");
        this.listOfModules = A02;
        ServiceBuilder serviceBuilder = new ServiceBuilder();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new CoreModule());
        arrayList.add(new SessionModule());
        arrayList.add(new UserModule());
        Iterator<String> it = A02.iterator();
        while (it.hasNext()) {
            try {
                Object newInstance = Class.forName(it.next()).newInstance();
                i.c(newInstance, "null cannot be cast to non-null type com.onesignal.common.modules.IModule");
                arrayList.add((IModule) newInstance);
            } catch (ClassNotFoundException e3) {
                e3.printStackTrace();
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((IModule) it2.next()).register(serviceBuilder);
        }
        this.services = serviceBuilder.build();
        this.featureManager$delegate = AbstractC0169a.A(new OneSignalImp$featureManager$2(this));
        this.configModel$delegate = AbstractC0169a.A(new OneSignalImp$configModel$2(this));
        this.initLock = new Object();
        this.loginLogoutLock = new Object();
        this.applicationServiceLock = new Object();
        this.userSwitcher$delegate = AbstractC0169a.A(new OneSignalImp$userSwitcher$2(this));
        this.loginHelper$delegate = AbstractC0169a.A(new OneSignalImp$loginHelper$2(this));
        this.logoutHelper$delegate = AbstractC0169a.A(new OneSignalImp$logoutHelper$2(this));
    }

    @Override // com.onesignal.IOneSignal
    public Object getInAppMessages(InterfaceC1218d interfaceC1218d) {
        return AbstractC0024y.w(getRuntimeIoDispatcher(), new OneSignalImp$getInAppMessages$2(this, null), interfaceC1218d);
    }

    @Override // com.onesignal.IOneSignal
    public Object getLocation(InterfaceC1218d interfaceC1218d) {
        return AbstractC0024y.w(getRuntimeIoDispatcher(), new OneSignalImp$getLocation$2(this, null), interfaceC1218d);
    }

    @Override // com.onesignal.IOneSignal
    public Object getNotifications(InterfaceC1218d interfaceC1218d) {
        return AbstractC0024y.w(getRuntimeIoDispatcher(), new OneSignalImp$getNotifications$2(this, null), interfaceC1218d);
    }

    @Override // com.onesignal.IOneSignal
    public Object getSession(InterfaceC1218d interfaceC1218d) {
        return AbstractC0024y.w(getRuntimeIoDispatcher(), new OneSignalImp$getSession$2(this, null), interfaceC1218d);
    }

    @Override // com.onesignal.IOneSignal
    public Object getUser(InterfaceC1218d interfaceC1218d) {
        return AbstractC0024y.w(getRuntimeIoDispatcher(), new OneSignalImp$getUser$2(this, null), interfaceC1218d);
    }

    @Override // com.onesignal.IOneSignal
    public void login(String externalId, String str) {
        i.e(externalId, "externalId");
        LogLevel logLevel = LogLevel.DEBUG;
        StringBuilder sb = new StringBuilder("Calling deprecated login(externalId: ");
        sb.append(externalId);
        sb.append(", jwtBearerToken: ...");
        sb.append(str != null ? k.m0(str) : null);
        sb.append(')');
        Logging.log(logLevel, sb.toString());
        if (isBackgroundThreadingEnabled()) {
            waitForInit("login");
        } else {
            requireInitForOperation("login");
        }
        LoginHelper.LoginEnqueueContext switchUser$com_onesignal_core = getLoginHelper().switchUser$com_onesignal_core(externalId, str);
        if (switchUser$com_onesignal_core == null) {
            return;
        }
        if (isBackgroundThreadingEnabled()) {
            ThreadUtilsKt.suspendifyOnIO(new OneSignalImp$login$1(this, switchUser$com_onesignal_core, null));
        } else {
            new Thread(new c(this, 11, switchUser$com_onesignal_core)).start();
        }
    }

    @Override // com.onesignal.IOneSignal
    public Object getConsentGiven(InterfaceC1218d interfaceC1218d) {
        return AbstractC0024y.w(getRuntimeIoDispatcher(), new OneSignalImp$getConsentGiven$2(this, null), interfaceC1218d);
    }

    @Override // com.onesignal.IOneSignal
    public Object getConsentRequired(InterfaceC1218d interfaceC1218d) {
        return AbstractC0024y.w(getRuntimeIoDispatcher(), new OneSignalImp$getConsentRequired$2(this, null), interfaceC1218d);
    }

    @Override // com.onesignal.IOneSignal
    public Object getDisableGMSMissingPrompt(InterfaceC1218d interfaceC1218d) {
        return AbstractC0024y.w(getRuntimeIoDispatcher(), new OneSignalImp$getDisableGMSMissingPrompt$2(this, null), interfaceC1218d);
    }

    @Override // com.onesignal.IOneSignal
    public Object setConsentRequired(boolean z, InterfaceC1218d interfaceC1218d) {
        Object w3 = AbstractC0024y.w(getRuntimeIoDispatcher(), new OneSignalImp$setConsentRequired$2(this, z, null), interfaceC1218d);
        return w3 == EnumC1260a.f11058a ? w3 : v.f5689a;
    }

    @Override // com.onesignal.IOneSignal
    public Object setDisableGMSMissingPrompt(boolean z, InterfaceC1218d interfaceC1218d) {
        Object w3 = AbstractC0024y.w(getRuntimeIoDispatcher(), new OneSignalImp$setDisableGMSMissingPrompt$2(this, z, null), interfaceC1218d);
        return w3 == EnumC1260a.f11058a ? w3 : v.f5689a;
    }

    @Override // com.onesignal.IOneSignal
    public Object setConsentGiven(boolean z, InterfaceC1218d interfaceC1218d) {
        Object w3 = AbstractC0024y.w(getRuntimeIoDispatcher(), new OneSignalImp$setConsentGiven$2(this, z, null), interfaceC1218d);
        return w3 == EnumC1260a.f11058a ? w3 : v.f5689a;
    }

    @Override // com.onesignal.IOneSignal
    public Object initWithContext(Context context, InterfaceC1218d interfaceC1218d) {
        Logging.log(LogLevel.DEBUG, "initWithContext(context: " + context + ')');
        return initWithContextSuspend(context, null, interfaceC1218d);
    }

    public OneSignalImp(AbstractC0020u abstractC0020u, int i2, e eVar) {
        this((i2 & 1) != 0 ? E.f461c : abstractC0020u);
    }
}
