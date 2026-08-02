package androidx.view;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 (2\u00020\u0001:\u0002()B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u0003J\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0013\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u001e\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010!R\u0014\u0010\u0010\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010#R\u0014\u0010'\u001a\u00020$8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleOwner;", "Landroidx/lifecycle/LifecycleOwner;", "<init>", "()V", "", "activityStarted$lifecycle_process", "activityResumed$lifecycle_process", "activityPaused$lifecycle_process", "activityStopped$lifecycle_process", "dispatchPauseIfNeeded$lifecycle_process", "dispatchStopIfNeeded$lifecycle_process", "Landroid/content/Context;", "context", "attach$lifecycle_process", "(Landroid/content/Context;)V", "", "getInputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "Camera2StreamConfigurationMap", "getHighSpeedVideoSizesFor", "getHighSpeedVideoFpsRangesFor", "", "getHighSpeedVideoFpsRanges", "Z", "getInputFormats", "getHighSpeedVideoSizes", "Landroid/os/Handler;", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/os/Handler;", "Landroidx/lifecycle/LifecycleRegistry;", "getOutputMinFrameDuration", "Landroidx/lifecycle/LifecycleRegistry;", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "Landroidx/lifecycle/ReportFragment$ActivityInitializationListener;", "Landroidx/lifecycle/ReportFragment$ActivityInitializationListener;", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", com.paypal.oslo.core.telemetry.AppLifecycleConstants.FEATURE, "Companion", "Api29Impl"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProcessLifecycleOwner implements androidx.view.LifecycleOwner {
    public static final long TIMEOUT_MS = 700;
    private android.os.Handler getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRangesFor;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private int Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.ProcessLifecycleOwner.Companion INSTANCE = new androidx.view.ProcessLifecycleOwner.Companion(null);
    private static final androidx.view.ProcessLifecycleOwner getHighSpeedVideoFpsRangesFor = new androidx.view.ProcessLifecycleOwner();
    private boolean getHighSpeedVideoFpsRanges = true;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private boolean getHighSpeedVideoSizes = true;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final androidx.view.LifecycleRegistry getHighSpeedVideoSizesFor = new androidx.view.LifecycleRegistry(this);

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.Runnable getOutputMinFrameDuration = new java.lang.Runnable() { // from class: androidx.lifecycle.ProcessLifecycleOwner$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            androidx.view.ProcessLifecycleOwner.m9164$r8$lambda$ArPpV1aF4irVIoizc48o3VfLys(androidx.view.ProcessLifecycleOwner.this);
        }
    };

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.lifecycle.ReportFragment.ActivityInitializationListener getInputSizeshNQ4ISI = new androidx.lifecycle.ReportFragment.ActivityInitializationListener() { // from class: androidx.lifecycle.ProcessLifecycleOwner$initializationListener$1
        @Override // androidx.lifecycle.ReportFragment.ActivityInitializationListener
        public final void onCreate() {
        }

        @Override // androidx.lifecycle.ReportFragment.ActivityInitializationListener
        public final void onStart() {
            androidx.view.ProcessLifecycleOwner.this.activityStarted$lifecycle_process();
        }

        @Override // androidx.lifecycle.ReportFragment.ActivityInitializationListener
        public final void onResume() {
            androidx.view.ProcessLifecycleOwner.this.activityResumed$lifecycle_process();
        }
    };

    private ProcessLifecycleOwner() {
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\u00020\f8\u0000X\u0080T¢\u0006\f\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u000f\u0010\u0003R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleOwner$Companion;", "", "<init>", "()V", "Landroidx/lifecycle/LifecycleOwner;", "get", "()Landroidx/lifecycle/LifecycleOwner;", "Landroid/content/Context;", "context", "", "init$lifecycle_process", "(Landroid/content/Context;)V", "", "TIMEOUT_MS", "J", "getTIMEOUT_MS$lifecycle_process$annotations", "Landroidx/lifecycle/ProcessLifecycleOwner;", "getHighSpeedVideoFpsRangesFor", "Landroidx/lifecycle/ProcessLifecycleOwner;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static /* synthetic */ void getTIMEOUT_MS$lifecycle_process$annotations() {
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.LifecycleOwner get() {
            return androidx.view.ProcessLifecycleOwner.getHighSpeedVideoFpsRangesFor;
        }

        @kotlin.jvm.JvmStatic
        public final void init$lifecycle_process(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            androidx.view.ProcessLifecycleOwner.getHighSpeedVideoFpsRangesFor.attach$lifecycle_process(context);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void activityStarted$lifecycle_process() {
        int i = this.Camera2StreamConfigurationMap + 1;
        this.Camera2StreamConfigurationMap = i;
        if (i == 1 && this.getHighSpeedVideoSizes) {
            this.getHighSpeedVideoSizesFor.handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_START);
            this.getHighSpeedVideoSizes = false;
        }
    }

    public final void activityResumed$lifecycle_process() {
        int i = this.getHighSpeedVideoFpsRangesFor + 1;
        this.getHighSpeedVideoFpsRangesFor = i;
        if (i == 1) {
            if (this.getHighSpeedVideoFpsRanges) {
                this.getHighSpeedVideoSizesFor.handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_RESUME);
                this.getHighSpeedVideoFpsRanges = false;
            } else {
                android.os.Handler handler = this.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.jvm.internal.Intrinsics.checkNotNull(handler);
                handler.removeCallbacks(this.getOutputMinFrameDuration);
            }
        }
    }

    public final void activityPaused$lifecycle_process() {
        int i = this.getHighSpeedVideoFpsRangesFor - 1;
        this.getHighSpeedVideoFpsRangesFor = i;
        if (i == 0) {
            android.os.Handler handler = this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.jvm.internal.Intrinsics.checkNotNull(handler);
            handler.postDelayed(this.getOutputMinFrameDuration, 700L);
        }
    }

    public final void activityStopped$lifecycle_process() {
        this.Camera2StreamConfigurationMap--;
        dispatchStopIfNeeded$lifecycle_process();
    }

    public final void dispatchPauseIfNeeded$lifecycle_process() {
        if (this.getHighSpeedVideoFpsRangesFor == 0) {
            this.getHighSpeedVideoFpsRanges = true;
            this.getHighSpeedVideoSizesFor.handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_PAUSE);
        }
    }

    public final void dispatchStopIfNeeded$lifecycle_process() {
        if (this.Camera2StreamConfigurationMap == 0 && this.getHighSpeedVideoFpsRanges) {
            this.getHighSpeedVideoSizesFor.handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_STOP);
            this.getHighSpeedVideoSizes = true;
        }
    }

    public final void attach$lifecycle_process(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighResolutionOutputSizeshNQ4ISI = new android.os.Handler();
        this.getHighSpeedVideoSizesFor.handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_CREATE);
        android.content.Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(applicationContext, "");
        ((android.app.Application) applicationContext).registerActivityLifecycleCallbacks(new androidx.view.EmptyActivityLifecycleCallbacks() { // from class: androidx.lifecycle.ProcessLifecycleOwner$attach$1
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPreCreated(android.app.Activity activity, android.os.Bundle savedInstanceState) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
                final androidx.view.ProcessLifecycleOwner processLifecycleOwner = androidx.view.ProcessLifecycleOwner.this;
                androidx.lifecycle.ProcessLifecycleOwner.Api29Impl.registerActivityLifecycleCallbacks(activity, new androidx.view.EmptyActivityLifecycleCallbacks() { // from class: androidx.lifecycle.ProcessLifecycleOwner$attach$1$onActivityPreCreated$1
                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityPostStarted(android.app.Activity activity2) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity2, "");
                        androidx.view.ProcessLifecycleOwner.this.activityStarted$lifecycle_process();
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityPostResumed(android.app.Activity activity2) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity2, "");
                        androidx.view.ProcessLifecycleOwner.this.activityResumed$lifecycle_process();
                    }
                });
            }

            @Override // androidx.view.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(android.app.Activity activity, android.os.Bundle savedInstanceState) {
                androidx.lifecycle.ReportFragment.ActivityInitializationListener activityInitializationListener;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
                if (android.os.Build.VERSION.SDK_INT < 29) {
                    androidx.view.ReportFragment reportFragment = androidx.view.ReportFragment.INSTANCE.get(activity);
                    activityInitializationListener = androidx.view.ProcessLifecycleOwner.this.getInputSizeshNQ4ISI;
                    reportFragment.setProcessListener(activityInitializationListener);
                }
            }

            @Override // androidx.view.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(android.app.Activity activity) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
                androidx.view.ProcessLifecycleOwner.this.activityPaused$lifecycle_process();
            }

            @Override // androidx.view.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStopped(android.app.Activity activity) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
                androidx.view.ProcessLifecycleOwner.this.activityStopped$lifecycle_process();
            }
        });
    }

    @Override // androidx.view.LifecycleOwner
    public final androidx.view.Lifecycle getLifecycle() {
        return this.getHighSpeedVideoSizesFor;
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleOwner$Api29Impl;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroid/app/Application$ActivityLifecycleCallbacks;", com.sun.jna.Callback.METHOD_NAME, "", "registerActivityLifecycleCallbacks", "(Landroid/app/Activity;Landroid/app/Application$ActivityLifecycleCallbacks;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Api29Impl {
        public static final androidx.lifecycle.ProcessLifecycleOwner.Api29Impl INSTANCE = new androidx.lifecycle.ProcessLifecycleOwner.Api29Impl();

        private Api29Impl() {
        }

        @kotlin.jvm.JvmStatic
        public static final void registerActivityLifecycleCallbacks(android.app.Activity activity, android.app.Application.ActivityLifecycleCallbacks callback) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
            activity.registerActivityLifecycleCallbacks(callback);
        }
    }

    /* renamed from: $r8$lambda$ArPpV1aF4irVI-oizc48o3VfLys, reason: not valid java name */
    public static /* synthetic */ void m9164$r8$lambda$ArPpV1aF4irVIoizc48o3VfLys(androidx.view.ProcessLifecycleOwner processLifecycleOwner) {
        processLifecycleOwner.dispatchPauseIfNeeded$lifecycle_process();
        processLifecycleOwner.dispatchStopIfNeeded$lifecycle_process();
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.LifecycleOwner get() {
        return INSTANCE.get();
    }
}
