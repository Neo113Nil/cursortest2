package com.onesignal.core.internal.application.impl;

import B2.b;
import D4.AbstractC0024y;
import J0.a;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.ViewTreeObserver;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.DeviceUtils;
import com.onesignal.common.events.EventProducer;
import com.onesignal.common.threading.Waiter;
import com.onesignal.core.internal.application.ActivityLifecycleHandlerBase;
import com.onesignal.core.internal.application.AppEntryAction;
import com.onesignal.core.internal.application.IActivityLifecycleHandler;
import com.onesignal.core.internal.application.IApplicationLifecycleHandler;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.debug.internal.logging.Logging;
import e5.g;
import java.lang.ref.WeakReference;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;

/* loaded from: classes.dex */
public final class ApplicationService implements IApplicationService, Application.ActivityLifecycleCallbacks, ViewTreeObserver.OnGlobalLayoutListener {
    private Context _appContext;
    private Activity _current;
    private int activityReferences;
    private boolean isActivityChangingConfigurations;
    private boolean nextResumeIsFirstActivity;
    private final EventProducer<IActivityLifecycleHandler> activityLifecycleNotifier = new EventProducer<>();
    private final EventProducer<IApplicationLifecycleHandler> applicationLifecycleNotifier = new EventProducer<>();
    private final EventProducer<ISystemConditionHandler> systemConditionNotifier = new EventProducer<>();
    private AppEntryAction entryState = AppEntryAction.APP_CLOSE;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void decorViewReady$lambda$1(final ApplicationService self, final Runnable runnable, final ApplicationService this$0) {
        i.e(self, "$self");
        i.e(runnable, "$runnable");
        i.e(this$0, "this$0");
        self.addActivityLifecycleHandler(new ActivityLifecycleHandlerBase() { // from class: com.onesignal.core.internal.application.impl.ApplicationService$decorViewReady$1$1
            @Override // com.onesignal.core.internal.application.ActivityLifecycleHandlerBase, com.onesignal.core.internal.application.IActivityLifecycleHandler
            public void onActivityAvailable(Activity currentActivity) {
                i.e(currentActivity, "currentActivity");
                ApplicationService.this.removeActivityLifecycleHandler(this);
                if (AndroidUtils.INSTANCE.isActivityFullyReady(currentActivity)) {
                    runnable.run();
                } else {
                    this$0.decorViewReady(currentActivity, runnable);
                }
            }
        });
    }

    private final boolean getWasInBackground() {
        return !isInForeground() || this.nextResumeIsFirstActivity;
    }

    private final void handleFocus() {
        if (!getWasInBackground()) {
            Logging.debug$default("ApplicationService.handleFocus: application never lost focus", null, 2, null);
            return;
        }
        Logging.debug$default("ApplicationService.handleFocus: application is now in focus, nextResumeIsFirstActivity=" + this.nextResumeIsFirstActivity, null, 2, null);
        this.nextResumeIsFirstActivity = false;
        if (getEntryState() != AppEntryAction.NOTIFICATION_CLICK) {
            setEntryState(AppEntryAction.APP_OPEN);
        }
        this.applicationLifecycleNotifier.fire(ApplicationService$handleFocus$1.INSTANCE);
    }

    private final void handleLostFocus() {
        if (!isInForeground()) {
            Logging.debug$default("ApplicationService.handleLostFocus: application already out of focus", null, 2, null);
            return;
        }
        Logging.debug$default("ApplicationService.handleLostFocus: application is now out of focus", null, 2, null);
        setEntryState(AppEntryAction.APP_CLOSE);
        this.applicationLifecycleNotifier.fire(ApplicationService$handleLostFocus$1.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onOrientationChanged(int i2, Activity activity) {
        if (i2 == 1) {
            Logging.debug$default("ApplicationService.onOrientationChanged: Configuration Orientation Change: PORTRAIT (" + i2 + ") on activity: " + activity, null, 2, null);
        } else if (i2 == 2) {
            Logging.debug$default("ApplicationService.onOrientationChanged: Configuration Orientation Change: LANDSCAPE (" + i2 + ") on activity: " + activity, null, 2, null);
        }
        handleLostFocus();
        this.activityLifecycleNotifier.fire(new ApplicationService$onOrientationChanged$1(activity));
        this.activityLifecycleNotifier.fire(new ApplicationService$onOrientationChanged$2(activity));
        activity.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(this);
        handleFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void waitUntilActivityReady$lambda$0(Waiter waiter) {
        i.e(waiter, "$waiter");
        waiter.wake();
    }

    @Override // com.onesignal.core.internal.application.IApplicationService
    public void addActivityLifecycleHandler(IActivityLifecycleHandler handler) {
        i.e(handler, "handler");
        this.activityLifecycleNotifier.subscribe(handler);
        if (getCurrent() != null) {
            Activity current = getCurrent();
            i.b(current);
            handler.onActivityAvailable(current);
        }
    }

    @Override // com.onesignal.core.internal.application.IApplicationService
    public void addApplicationLifecycleHandler(IApplicationLifecycleHandler handler) {
        i.e(handler, "handler");
        this.applicationLifecycleNotifier.subscribe(handler);
        if (getCurrent() != null) {
            handler.onFocus(true);
        }
    }

    public final void decorViewReady(Activity activity, Runnable runnable) {
        i.e(activity, "activity");
        i.e(runnable, "runnable");
        runnable.toString();
        activity.getWindow().getDecorView().post(new a(this, runnable, this, 3));
    }

    @Override // com.onesignal.core.internal.application.IApplicationService
    public Context getAppContext() {
        Context context = this._appContext;
        i.b(context);
        return context;
    }

    @Override // com.onesignal.core.internal.application.IApplicationService
    public Activity getCurrent() {
        return this._current;
    }

    @Override // com.onesignal.core.internal.application.IApplicationService
    public AppEntryAction getEntryState() {
        return this.entryState;
    }

    @Override // com.onesignal.core.internal.application.IApplicationService
    public boolean isInForeground() {
        return getEntryState().isAppOpen() || getEntryState().isNotificationClick();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        i.e(activity, "activity");
        Logging.debug$default("ApplicationService.onActivityCreated(" + this.activityReferences + ',' + getEntryState() + "): " + activity, null, 2, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        i.e(activity, "activity");
        Logging.debug$default("ApplicationService.onActivityDestroyed(" + this.activityReferences + ',' + getEntryState() + "): " + activity, null, 2, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        i.e(activity, "activity");
        Logging.debug$default("ApplicationService.onActivityPaused(" + this.activityReferences + ',' + getEntryState() + "): " + activity, null, 2, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        i.e(activity, "activity");
        Logging.debug$default("ApplicationService.onActivityResumed(" + this.activityReferences + ',' + getEntryState() + "): " + activity, null, 2, null);
        if (!i.a(getCurrent(), activity)) {
            setCurrent(activity);
        }
        if (!getWasInBackground() || this.isActivityChangingConfigurations) {
            return;
        }
        this.activityReferences = 1;
        handleFocus();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity p02, Bundle p12) {
        i.e(p02, "p0");
        i.e(p12, "p1");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        i.e(activity, "activity");
        Logging.debug$default("ApplicationService.onActivityStarted(" + this.activityReferences + ',' + getEntryState() + "): " + activity, null, 2, null);
        if (i.a(getCurrent(), activity)) {
            return;
        }
        setCurrent(activity);
        if (!getWasInBackground() || this.isActivityChangingConfigurations) {
            this.activityReferences++;
        } else {
            this.activityReferences = 1;
            handleFocus();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        i.e(activity, "activity");
        Logging.debug$default("ApplicationService.onActivityStopped(" + this.activityReferences + ',' + getEntryState() + "): " + activity, null, 2, null);
        boolean isChangingConfigurations = activity.isChangingConfigurations();
        this.isActivityChangingConfigurations = isChangingConfigurations;
        if (!isChangingConfigurations) {
            int i2 = this.activityReferences - 1;
            this.activityReferences = i2;
            if (i2 <= 0) {
                setCurrent(null);
                this.activityReferences = 0;
                handleLostFocus();
            }
        }
        this.activityLifecycleNotifier.fire(new ApplicationService$onActivityStopped$1(activity));
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.systemConditionNotifier.fire(ApplicationService$onGlobalLayout$1.INSTANCE);
    }

    @Override // com.onesignal.core.internal.application.IApplicationService
    public void removeActivityLifecycleHandler(IActivityLifecycleHandler handler) {
        i.e(handler, "handler");
        this.activityLifecycleNotifier.unsubscribe(handler);
    }

    @Override // com.onesignal.core.internal.application.IApplicationService
    public void removeApplicationLifecycleHandler(IApplicationLifecycleHandler handler) {
        i.e(handler, "handler");
        this.applicationLifecycleNotifier.unsubscribe(handler);
    }

    public void setCurrent(Activity activity) {
        this._current = activity;
        Logging.debug$default("ApplicationService: current activity=" + getCurrent(), null, 2, null);
        if (activity != null) {
            this.activityLifecycleNotifier.fire(new ApplicationService$current$1(activity));
            try {
                activity.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(this);
            } catch (RuntimeException e3) {
                e3.printStackTrace();
            }
        }
    }

    @Override // com.onesignal.core.internal.application.IApplicationService
    public void setEntryState(AppEntryAction appEntryAction) {
        i.e(appEntryAction, "<set-?>");
        this.entryState = appEntryAction;
    }

    public final void start(Context context) {
        i.e(context, "context");
        this._appContext = context;
        Context applicationContext = context.getApplicationContext();
        i.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
        Application application = (Application) applicationContext;
        application.registerActivityLifecycleCallbacks(this);
        application.registerComponentCallbacks(new ComponentCallbacks() { // from class: com.onesignal.core.internal.application.impl.ApplicationService$start$configuration$1
            @Override // android.content.ComponentCallbacks
            public void onConfigurationChanged(Configuration newConfig) {
                i.e(newConfig, "newConfig");
                if (ApplicationService.this.getCurrent() != null) {
                    AndroidUtils androidUtils = AndroidUtils.INSTANCE;
                    Activity current = ApplicationService.this.getCurrent();
                    i.b(current);
                    if (androidUtils.hasConfigChangeFlag(current, 128)) {
                        ApplicationService applicationService = ApplicationService.this;
                        int i2 = newConfig.orientation;
                        Activity current2 = applicationService.getCurrent();
                        i.b(current2);
                        applicationService.onOrientationChanged(i2, current2);
                    }
                }
            }

            @Override // android.content.ComponentCallbacks
            public void onLowMemory() {
            }
        });
        boolean z = context instanceof Activity;
        boolean z5 = getCurrent() == null;
        if (!z5 || z) {
            setEntryState(AppEntryAction.APP_OPEN);
            if (z5 && z) {
                setCurrent((Activity) context);
                this.activityReferences = 1;
                this.nextResumeIsFirstActivity = false;
            }
        } else {
            this.nextResumeIsFirstActivity = true;
            setEntryState(AppEntryAction.APP_CLOSE);
        }
        Logging.debug$default("ApplicationService.init: entryState=" + getEntryState(), null, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.onesignal.core.internal.application.IApplicationService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object waitUntilActivityReady(InterfaceC1218d interfaceC1218d) {
        ApplicationService$waitUntilActivityReady$1 applicationService$waitUntilActivityReady$1;
        int i2;
        if (interfaceC1218d instanceof ApplicationService$waitUntilActivityReady$1) {
            applicationService$waitUntilActivityReady$1 = (ApplicationService$waitUntilActivityReady$1) interfaceC1218d;
            int i3 = applicationService$waitUntilActivityReady$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                applicationService$waitUntilActivityReady$1.label = i3 - Integer.MIN_VALUE;
                Object obj = applicationService$waitUntilActivityReady$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = applicationService$waitUntilActivityReady$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    Activity current = getCurrent();
                    if (current == null) {
                        return Boolean.FALSE;
                    }
                    Waiter waiter = new Waiter();
                    decorViewReady(current, new b(7, waiter));
                    applicationService$waitUntilActivityReady$1.label = 1;
                    if (waiter.waitForWake(applicationService$waitUntilActivityReady$1) == enumC1260a) {
                        return enumC1260a;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g.y(obj);
                }
                return Boolean.TRUE;
            }
        }
        applicationService$waitUntilActivityReady$1 = new ApplicationService$waitUntilActivityReady$1(this, interfaceC1218d);
        Object obj2 = applicationService$waitUntilActivityReady$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = applicationService$waitUntilActivityReady$1.label;
        if (i2 != 0) {
        }
        return Boolean.TRUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x009d -> B:32:0x006b). Please report as a decompilation issue!!! */
    @Override // com.onesignal.core.internal.application.IApplicationService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object waitUntilSystemConditionsAvailable(InterfaceC1218d interfaceC1218d) {
        ApplicationService$waitUntilSystemConditionsAvailable$1 applicationService$waitUntilSystemConditionsAvailable$1;
        int i2;
        ApplicationService applicationService;
        Activity current;
        int i3;
        ApplicationService$waitUntilSystemConditionsAvailable$1 applicationService$waitUntilSystemConditionsAvailable$12;
        final ApplicationService applicationService2;
        ISystemConditionHandler iSystemConditionHandler;
        ISystemConditionHandler iSystemConditionHandler2;
        if (interfaceC1218d instanceof ApplicationService$waitUntilSystemConditionsAvailable$1) {
            applicationService$waitUntilSystemConditionsAvailable$1 = (ApplicationService$waitUntilSystemConditionsAvailable$1) interfaceC1218d;
            int i6 = applicationService$waitUntilSystemConditionsAvailable$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                applicationService$waitUntilSystemConditionsAvailable$1.label = i6 - Integer.MIN_VALUE;
                Object obj = applicationService$waitUntilSystemConditionsAvailable$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = applicationService$waitUntilSystemConditionsAvailable$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    applicationService = this;
                    current = getCurrent();
                    i3 = AndroidUtils.INSTANCE.isRunningOnMainThread() ? 50 : 0;
                    if (current != null) {
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            iSystemConditionHandler2 = (ApplicationService$waitUntilSystemConditionsAvailable$systemConditionHandler$1) applicationService$waitUntilSystemConditionsAvailable$1.L$1;
                            applicationService2 = (ApplicationService) applicationService$waitUntilSystemConditionsAvailable$1.L$0;
                            g.y(obj);
                            iSystemConditionHandler = iSystemConditionHandler2;
                            applicationService2.systemConditionNotifier.unsubscribe(iSystemConditionHandler);
                            return Boolean.TRUE;
                        }
                        current = (Activity) applicationService$waitUntilSystemConditionsAvailable$1.L$1;
                        ApplicationService applicationService3 = (ApplicationService) applicationService$waitUntilSystemConditionsAvailable$1.L$0;
                        try {
                            g.y(obj);
                        } catch (NoClassDefFoundError e3) {
                            Logging.info$default("ApplicationService.waitUntilSystemConditionsAvailable: AppCompatActivity is not used in this app, skipping 'isDialogFragmentShowing' check: " + e3, null, 2, null);
                        }
                        applicationService$waitUntilSystemConditionsAvailable$12 = applicationService$waitUntilSystemConditionsAvailable$1;
                        applicationService2 = applicationService3;
                        final Waiter waiter = new Waiter();
                        iSystemConditionHandler = new ISystemConditionHandler() { // from class: com.onesignal.core.internal.application.impl.ApplicationService$waitUntilSystemConditionsAvailable$systemConditionHandler$1
                            @Override // com.onesignal.core.internal.application.impl.ISystemConditionHandler
                            public void systemConditionChanged() {
                                if (DeviceUtils.INSTANCE.isKeyboardUp(new WeakReference<>(ApplicationService.this.getCurrent()))) {
                                    return;
                                }
                                waiter.wake();
                            }
                        };
                        applicationService2.systemConditionNotifier.subscribe(iSystemConditionHandler);
                        if (DeviceUtils.INSTANCE.isKeyboardUp(new WeakReference<>(current))) {
                            Logging.warn$default("ApplicationService.waitUntilSystemConditionsAvailable: keyboard up detected", null, 2, null);
                            applicationService$waitUntilSystemConditionsAvailable$12.L$0 = applicationService2;
                            applicationService$waitUntilSystemConditionsAvailable$12.L$1 = iSystemConditionHandler;
                            applicationService$waitUntilSystemConditionsAvailable$12.label = 3;
                            if (waiter.waitForWake(applicationService$waitUntilSystemConditionsAvailable$12) == enumC1260a) {
                                return enumC1260a;
                            }
                            iSystemConditionHandler2 = iSystemConditionHandler;
                            iSystemConditionHandler = iSystemConditionHandler2;
                        }
                        applicationService2.systemConditionNotifier.unsubscribe(iSystemConditionHandler);
                        return Boolean.TRUE;
                    }
                    int i7 = applicationService$waitUntilSystemConditionsAvailable$1.I$0;
                    applicationService = (ApplicationService) applicationService$waitUntilSystemConditionsAvailable$1.L$0;
                    g.y(obj);
                    i3 = i7;
                    current = applicationService.getCurrent();
                    if (current != null) {
                        applicationService$waitUntilSystemConditionsAvailable$12 = applicationService$waitUntilSystemConditionsAvailable$1;
                        applicationService2 = applicationService;
                        final Waiter waiter2 = new Waiter();
                        iSystemConditionHandler = new ISystemConditionHandler() { // from class: com.onesignal.core.internal.application.impl.ApplicationService$waitUntilSystemConditionsAvailable$systemConditionHandler$1
                            @Override // com.onesignal.core.internal.application.impl.ISystemConditionHandler
                            public void systemConditionChanged() {
                                if (DeviceUtils.INSTANCE.isKeyboardUp(new WeakReference<>(ApplicationService.this.getCurrent()))) {
                                    return;
                                }
                                waiter2.wake();
                            }
                        };
                        applicationService2.systemConditionNotifier.subscribe(iSystemConditionHandler);
                        if (DeviceUtils.INSTANCE.isKeyboardUp(new WeakReference<>(current))) {
                        }
                        applicationService2.systemConditionNotifier.unsubscribe(iSystemConditionHandler);
                        return Boolean.TRUE;
                    }
                    i7 = i3 + 1;
                    if (i7 > 50) {
                        Logging.warn$default("ApplicationService.waitUntilSystemConditionsAvailable: current is null", null, 2, null);
                        return Boolean.FALSE;
                    }
                    applicationService$waitUntilSystemConditionsAvailable$1.L$0 = applicationService;
                    applicationService$waitUntilSystemConditionsAvailable$1.I$0 = i7;
                    applicationService$waitUntilSystemConditionsAvailable$1.label = 1;
                    if (AbstractC0024y.d(100L, applicationService$waitUntilSystemConditionsAvailable$1) == enumC1260a) {
                        return enumC1260a;
                    }
                    i3 = i7;
                    current = applicationService.getCurrent();
                    if (current != null) {
                    }
                }
            }
        }
        applicationService$waitUntilSystemConditionsAvailable$1 = new ApplicationService$waitUntilSystemConditionsAvailable$1(this, interfaceC1218d);
        Object obj2 = applicationService$waitUntilSystemConditionsAvailable$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = applicationService$waitUntilSystemConditionsAvailable$1.label;
        if (i2 != 0) {
        }
    }
}
