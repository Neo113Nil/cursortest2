package com.datadog.android.rum.internal.vitals;

@kotlin.Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 B2\u00020\u00012\u00020\u0002:\u0002BCB1\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u0014J\u0017\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001b\u0010\u0016J\u0017\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001c\u0010\u0016J\u0017\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R2\u0010%\u001a\u001a\u0012\u0004\u0012\u00020\"\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0$0#0!8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R&\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020)0!8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b+\u0010(R\u0014\u0010.\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u0010-R$\u00100\u001a\u0004\u0018\u00010/8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0014\u00108\u001a\u0002068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b.\u00107R\u001c\u0010:\u001a\b\u0018\u000109R\u00020\u00008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b:\u0010;R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0005\u0010<\u001a\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b8\u0010?R\u0014\u0010,\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b@\u0010A"}, d2 = {"Lcom/datadog/android/rum/internal/vitals/FrameStatesAggregator;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroidx/metrics/performance/JankStats$OnFrameListener;", "", "Lcom/datadog/android/rum/internal/vitals/FrameStateListener;", "frameStateListeners", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lcom/datadog/android/rum/internal/vitals/JankStatsProvider;", "jankStatsProvider", "Lcom/datadog/android/internal/system/BuildSdkVersionProvider;", "buildSdkVersionProvider", "<init>", "(Ljava/util/List;Lcom/datadog/android/api/InternalLogger;Lcom/datadog/android/rum/internal/vitals/JankStatsProvider;Lcom/datadog/android/internal/system/BuildSdkVersionProvider;)V", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityDestroyed", "(Landroid/app/Activity;)V", "onActivityPaused", "onActivityResumed", "outState", "onActivitySaveInstanceState", "onActivityStarted", "onActivityStopped", "Landroidx/metrics/performance/FrameData;", "volatileFrameData", "onFrame", "(Landroidx/metrics/performance/FrameData;)V", "Ljava/util/WeakHashMap;", "Landroid/view/Window;", "", "Ljava/lang/ref/WeakReference;", "activeActivities", "Ljava/util/WeakHashMap;", "getActiveActivities$dd_sdk_android_rum_release", "()Ljava/util/WeakHashMap;", "Landroidx/metrics/performance/JankStats;", "activeWindowsListener", "getActiveWindowsListener$dd_sdk_android_rum_release", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/internal/system/BuildSdkVersionProvider;", "getHighSpeedVideoSizes", "Landroid/view/Display;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, "Landroid/view/Display;", "getDisplay$dd_sdk_android_rum_release", "()Landroid/view/Display;", "setDisplay$dd_sdk_android_rum_release", "(Landroid/view/Display;)V", "Lcom/datadog/android/rum/internal/domain/FrameMetricsData;", "Lcom/datadog/android/rum/internal/domain/FrameMetricsData;", "getHighSpeedVideoFpsRanges", "Lcom/datadog/android/rum/internal/vitals/FrameStatesAggregator$DDFrameMetricsListener;", "Camera2StreamConfigurationMap", "Lcom/datadog/android/rum/internal/vitals/FrameStatesAggregator$DDFrameMetricsListener;", "Ljava/util/List;", "getFrameStateListeners$dd_sdk_android_rum_release", "()Ljava/util/List;", "Lcom/datadog/android/api/InternalLogger;", "getHighSpeedVideoFpsRangesFor", "Lcom/datadog/android/rum/internal/vitals/JankStatsProvider;", "Companion", "DDFrameMetricsListener"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FrameStatesAggregator implements android.app.Application.ActivityLifecycleCallbacks, androidx.metrics.performance.JankStats.OnFrameListener {
    public static final java.lang.String JANK_STATS_TRACKING_ALREADY_DISABLED_ERROR = "Trying to disable JankStats instance which was already disabled before, this shouldn't happen.";
    public static final java.lang.String JANK_STATS_TRACKING_DISABLE_ERROR = "Failed to disable JankStats tracking";
    private com.datadog.android.rum.internal.vitals.FrameStatesAggregator.DDFrameMetricsListener Camera2StreamConfigurationMap;
    private final java.util.WeakHashMap<android.view.Window, java.util.List<java.lang.ref.WeakReference<android.app.Activity>>> activeActivities;
    private final java.util.WeakHashMap<android.view.Window, androidx.metrics.performance.JankStats> activeWindowsListener;
    private android.view.Display display;
    private final java.util.List<com.datadog.android.rum.internal.vitals.FrameStateListener> frameStateListeners;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.internal.system.BuildSdkVersionProvider getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.datadog.android.rum.internal.vitals.JankStatsProvider getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.datadog.android.rum.internal.domain.FrameMetricsData getHighSpeedVideoFpsRanges;

    /* JADX WARN: Multi-variable type inference failed */
    public FrameStatesAggregator(java.util.List<? extends com.datadog.android.rum.internal.vitals.FrameStateListener> list, com.datadog.android.api.InternalLogger internalLogger, com.datadog.android.rum.internal.vitals.JankStatsProvider jankStatsProvider, com.datadog.android.internal.system.BuildSdkVersionProvider buildSdkVersionProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jankStatsProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buildSdkVersionProvider, "");
        this.frameStateListeners = list;
        this.getHighSpeedVideoFpsRangesFor = internalLogger;
        this.getHighResolutionOutputSizeshNQ4ISI = jankStatsProvider;
        this.getHighSpeedVideoSizes = buildSdkVersionProvider;
        this.activeWindowsListener = new java.util.WeakHashMap<>();
        this.activeActivities = new java.util.WeakHashMap<>();
        this.getHighSpeedVideoFpsRanges = new com.datadog.android.rum.internal.domain.FrameMetricsData(0, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, false, 0L, 0L, 0L, 0L, 0.0d, 65535, null);
    }

    public final java.util.List<com.datadog.android.rum.internal.vitals.FrameStateListener> getFrameStateListeners$dd_sdk_android_rum_release() {
        return this.frameStateListeners;
    }

    public /* synthetic */ FrameStatesAggregator(java.util.List list, com.datadog.android.api.InternalLogger internalLogger, com.datadog.android.rum.internal.vitals.JankStatsProvider jankStatsProvider, com.datadog.android.internal.system.BuildSdkVersionProvider buildSdkVersionProvider, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list, internalLogger, (i & 4) != 0 ? com.datadog.android.rum.internal.vitals.JankStatsProvider.INSTANCE.getDEFAULT() : jankStatsProvider, (i & 8) != 0 ? com.datadog.android.internal.system.BuildSdkVersionProvider.INSTANCE.getDEFAULT() : buildSdkVersionProvider);
    }

    public final java.util.WeakHashMap<android.view.Window, androidx.metrics.performance.JankStats> getActiveWindowsListener$dd_sdk_android_rum_release() {
        return this.activeWindowsListener;
    }

    public final java.util.WeakHashMap<android.view.Window, java.util.List<java.lang.ref.WeakReference<android.app.Activity>>> getActiveActivities$dd_sdk_android_rum_release() {
        return this.activeActivities;
    }

    /* renamed from: getDisplay$dd_sdk_android_rum_release, reason: from getter */
    public final android.view.Display getDisplay() {
        return this.display;
    }

    public final void setDisplay$dd_sdk_android_rum_release(android.view.Display display) {
        this.display = display;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        final android.view.Window window = activity.getWindow();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(window, "");
        java.util.ArrayList arrayList = this.activeActivities.get(window);
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
        }
        java.util.Iterator<T> it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((java.lang.ref.WeakReference) obj).get(), activity)) {
                    break;
                }
            }
        }
        if (obj == null) {
            arrayList.add(new java.lang.ref.WeakReference<>(activity));
            this.activeActivities.put(window, arrayList);
        }
        boolean containsKey = this.activeWindowsListener.containsKey(window);
        androidx.metrics.performance.JankStats jankStats = this.activeWindowsListener.get(window);
        if (jankStats != null) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoFpsRangesFor, com.datadog.android.api.InternalLogger.Level.DEBUG, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.vitals.FrameStatesAggregator$trackWindowJankStats$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return "Resuming jankStats for window ".concat(java.lang.String.valueOf(window));
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            jankStats.setTrackingEnabled(true);
        } else {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoFpsRangesFor, com.datadog.android.api.InternalLogger.Level.DEBUG, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.vitals.FrameStatesAggregator$trackWindowJankStats$2
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return "Starting jankStats for window ".concat(java.lang.String.valueOf(window));
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            androidx.metrics.performance.JankStats createJankStatsAndTrack = this.getHighResolutionOutputSizeshNQ4ISI.createJankStatsAndTrack(window, this, this.getHighSpeedVideoFpsRangesFor);
            if (createJankStatsAndTrack == null) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoFpsRangesFor, com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.vitals.FrameStatesAggregator$trackWindowJankStats$3
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        return "Unable to create JankStats";
                    }
                }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            } else {
                this.activeWindowsListener.put(window, createJankStatsAndTrack);
            }
        }
        if (!this.getHighSpeedVideoSizes.getIsAtLeastS() || containsKey) {
            if (this.display == null && this.getHighSpeedVideoSizes.getVersion() == 30) {
                java.lang.Object systemService = activity.getSystemService(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
                kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
                this.display = ((android.hardware.display.DisplayManager) systemService).getDisplay(0);
                return;
            }
            return;
        }
        if (this.Camera2StreamConfigurationMap == null) {
            this.Camera2StreamConfigurationMap = new com.datadog.android.rum.internal.vitals.FrameStatesAggregator.DDFrameMetricsListener();
        }
        final android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
        final android.view.View peekDecorView = window.peekDecorView();
        if (peekDecorView == null) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoFpsRangesFor, com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.vitals.FrameStatesAggregator$registerMetricListener$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return "Unable to attach JankStatsListener to window, decorView is null";
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
        } else {
            peekDecorView.post(new java.lang.Runnable() { // from class: com.datadog.android.rum.internal.vitals.FrameStatesAggregator$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.datadog.android.rum.internal.vitals.FrameStatesAggregator.m10024$r8$lambda$_AHoxDBin5nStXsZf1nWw3uuLA(peekDecorView, this, window, handler);
                }
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(final android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        final android.view.Window window = activity.getWindow();
        if (!this.activeActivities.containsKey(window)) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoFpsRangesFor, com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.vitals.FrameStatesAggregator$onActivityStopped$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return "Activity stopped but window was not tracked";
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
        }
        java.util.ArrayList arrayList = this.activeActivities.get(window);
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
        }
        kotlin.collections.CollectionsKt.removeAll((java.util.List) arrayList, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<java.lang.ref.WeakReference<android.app.Activity>, java.lang.Boolean>() { // from class: com.datadog.android.rum.internal.vitals.FrameStatesAggregator$onActivityStopped$2
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean invoke(java.lang.ref.WeakReference<android.app.Activity> weakReference) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weakReference, "");
                return java.lang.Boolean.valueOf(weakReference.get() == null || kotlin.jvm.internal.Intrinsics.areEqual(weakReference.get(), activity));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
        this.activeActivities.put(window, arrayList);
        if (arrayList.isEmpty()) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoFpsRangesFor, com.datadog.android.api.InternalLogger.Level.DEBUG, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.vitals.FrameStatesAggregator$onActivityStopped$3
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return "Disabling jankStats for window ".concat(java.lang.String.valueOf(window));
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            try {
                androidx.metrics.performance.JankStats jankStats = this.activeWindowsListener.get(window);
                if (jankStats != null) {
                    if (jankStats.getIsTrackingEnabled()) {
                        jankStats.setTrackingEnabled(false);
                    } else {
                        com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoFpsRangesFor, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.TELEMETRY, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.vitals.FrameStatesAggregator$onActivityStopped$4$1
                            @Override // kotlin.jvm.functions.Function0
                            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                            public final java.lang.String invoke() {
                                return com.datadog.android.rum.internal.vitals.FrameStatesAggregator.JANK_STATS_TRACKING_ALREADY_DISABLED_ERROR;
                            }
                        }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
                    }
                }
            } catch (java.lang.IllegalArgumentException e) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoFpsRangesFor, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.TELEMETRY, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.vitals.FrameStatesAggregator$onActivityStopped$5
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        return com.datadog.android.rum.internal.vitals.FrameStatesAggregator.JANK_STATS_TRACKING_DISABLE_ERROR;
                    }
                }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            } catch (java.lang.NullPointerException e2) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoFpsRangesFor, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.TELEMETRY, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.vitals.FrameStatesAggregator$onActivityStopped$6
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        return com.datadog.android.rum.internal.vitals.FrameStatesAggregator.JANK_STATS_TRACKING_DISABLE_ERROR;
                    }
                }, (java.lang.Throwable) e2, false, (java.util.Map) null, 48, (java.lang.Object) null);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        java.util.List<java.lang.ref.WeakReference<android.app.Activity>> list = this.activeActivities.get(activity.getWindow());
        if (list == null || list.isEmpty()) {
            this.activeWindowsListener.remove(activity.getWindow());
            this.activeActivities.remove(activity.getWindow());
            if (this.getHighSpeedVideoSizes.getIsAtLeastS()) {
                android.view.Window window = activity.getWindow();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(window, "");
                try {
                    window.removeOnFrameMetricsAvailableListener(this.Camera2StreamConfigurationMap);
                } catch (java.lang.IllegalArgumentException e) {
                    com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoFpsRangesFor, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.vitals.FrameStatesAggregator$unregisterMetricListener$1
                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                        public final java.lang.String invoke() {
                            return "Unable to detach JankStatsListener to window, most probably because it wasn't attached";
                        }
                    }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
                }
            }
        }
    }

    @Override // androidx.metrics.performance.JankStats.OnFrameListener
    public final void onFrame(androidx.metrics.performance.FrameData volatileFrameData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(volatileFrameData, "");
        int size = this.frameStateListeners.size();
        for (int i = 0; i < size; i++) {
            this.frameStateListeners.get(i).onFrame(volatileFrameData);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/internal/vitals/FrameStatesAggregator$DDFrameMetricsListener;", "Landroid/view/Window$OnFrameMetricsAvailableListener;", "<init>", "(Lcom/datadog/android/rum/internal/vitals/FrameStatesAggregator;)V", "Landroid/view/Window;", com.datadog.android.sessionreplay.internal.recorder.mapper.DecorViewMapper.WINDOW_KEY_NAME, "Landroid/view/FrameMetrics;", "frameMetrics", "", "dropCountSinceLastInvocation", "", "onFrameMetricsAvailable", "(Landroid/view/Window;Landroid/view/FrameMetrics;I)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class DDFrameMetricsListener implements android.view.Window.OnFrameMetricsAvailableListener {
        public DDFrameMetricsListener() {
        }

        @Override // android.view.Window.OnFrameMetricsAvailableListener
        public final void onFrameMetricsAvailable(android.view.Window window, android.view.FrameMetrics frameMetrics, int dropCountSinceLastInvocation) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(window, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameMetrics, "");
            int size = com.datadog.android.rum.internal.vitals.FrameStatesAggregator.this.getFrameStateListeners$dd_sdk_android_rum_release().size();
            for (int i = 0; i < size; i++) {
                com.datadog.android.rum.internal.vitals.FrameStateListener frameStateListener = com.datadog.android.rum.internal.vitals.FrameStatesAggregator.this.getFrameStateListeners$dd_sdk_android_rum_release().get(i);
                com.datadog.android.rum.internal.vitals.FrameStatesAggregator frameStatesAggregator = com.datadog.android.rum.internal.vitals.FrameStatesAggregator.this;
                frameStateListener.onFrameMetricsData(com.datadog.android.rum.internal.vitals.FrameStatesAggregator.access$update(frameStatesAggregator, frameStatesAggregator.getHighSpeedVideoFpsRanges, frameMetrics, dropCountSinceLastInvocation));
            }
        }
    }

    /* renamed from: $r8$lambda$_AHoxDBin5nStXsZf1nWw3u-uLA, reason: not valid java name */
    public static /* synthetic */ void m10024$r8$lambda$_AHoxDBin5nStXsZf1nWw3uuLA(android.view.View view, com.datadog.android.rum.internal.vitals.FrameStatesAggregator frameStatesAggregator, android.view.Window window, android.os.Handler handler) {
        if (!view.isHardwareAccelerated()) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(frameStatesAggregator.getHighSpeedVideoFpsRangesFor, com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.vitals.FrameStatesAggregator$registerMetricListener$2$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return "Unable to attach JankStatsListener to window, decorView is not hardware accelerated";
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            return;
        }
        com.datadog.android.rum.internal.vitals.FrameStatesAggregator.DDFrameMetricsListener dDFrameMetricsListener = frameStatesAggregator.Camera2StreamConfigurationMap;
        if (dDFrameMetricsListener != null) {
            try {
                window.addOnFrameMetricsAvailableListener(dDFrameMetricsListener, handler);
            } catch (java.lang.IllegalStateException e) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(frameStatesAggregator.getHighSpeedVideoFpsRangesFor, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.vitals.FrameStatesAggregator$registerMetricListener$2$2$1
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        return "Unable to attach JankStatsListener to window";
                    }
                }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            }
        }
    }

    public static final /* synthetic */ com.datadog.android.rum.internal.domain.FrameMetricsData access$update(com.datadog.android.rum.internal.vitals.FrameStatesAggregator frameStatesAggregator, com.datadog.android.rum.internal.domain.FrameMetricsData frameMetricsData, android.view.FrameMetrics frameMetrics, int i) {
        frameMetricsData.setDisplayRefreshRate(frameStatesAggregator.display != null ? r0.getRefreshRate() : 60.0d);
        if (frameStatesAggregator.getHighSpeedVideoSizes.getIsAtLeastN()) {
            frameMetricsData.setDroppedFrames(i);
            frameMetricsData.setUnknownDelayDuration(frameMetrics.getMetric(0));
            frameMetricsData.setInputHandlingDuration(frameMetrics.getMetric(1));
            frameMetricsData.setAnimationDuration(frameMetrics.getMetric(2));
            frameMetricsData.setLayoutMeasureDuration(frameMetrics.getMetric(3));
            frameMetricsData.setDrawDuration(frameMetrics.getMetric(4));
            frameMetricsData.setSyncDuration(frameMetrics.getMetric(5));
            frameMetricsData.setCommandIssueDuration(frameMetrics.getMetric(6));
            frameMetricsData.setSwapBuffersDuration(frameMetrics.getMetric(7));
            frameMetricsData.setTotalDuration(frameMetrics.getMetric(8));
            frameMetricsData.setFirstDrawFrame(frameMetrics.getMetric(9) == 1);
        }
        if (frameStatesAggregator.getHighSpeedVideoSizes.getIsAtLeastO()) {
            frameMetricsData.setIntendedVsyncTimestamp(frameMetrics.getMetric(10));
            frameMetricsData.setVsyncTimestamp(frameMetrics.getMetric(11));
        }
        if (frameStatesAggregator.getHighSpeedVideoSizes.getIsAtLeastS()) {
            frameMetricsData.setGpuDuration(frameMetrics.getMetric(12));
            frameMetricsData.setDeadline(frameMetrics.getMetric(13));
        }
        return frameMetricsData;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle outState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outState, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
    }
}
