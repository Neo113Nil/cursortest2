package com.datadog.android.rum.internal.tracking;

@kotlin.Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 :2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001:BQ\u0012 \u0010\t\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00060\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u001e\u0010\u001dJ\u001f\u0010\"\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b$\u0010%R.\u0010&\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00050\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0015\u0010.\u001a\u00020-8CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010(\u001a\u0002008CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u00101R\u0014\u00103\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u00102R\u0014\u00105\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b7\u00108"}, d2 = {"Lcom/datadog/android/rum/internal/tracking/OreoFragmentLifecycleCallbacks;", "Lcom/datadog/android/rum/internal/tracking/FragmentLifecycleCallbacks;", "Landroid/app/Activity;", "Landroid/app/FragmentManager$FragmentLifecycleCallbacks;", "Lkotlin/Function1;", "Landroid/app/Fragment;", "", "", "", "argumentsProvider", "Lcom/datadog/android/rum/tracking/ComponentPredicate;", "componentPredicate", "Lcom/datadog/android/rum/internal/RumFeature;", "rumFeature", "Lcom/datadog/android/rum/RumMonitor;", "rumMonitor", "Lcom/datadog/android/internal/system/BuildSdkVersionProvider;", "buildSdkVersionProvider", "<init>", "(Lkotlin/jvm/functions/Function1;Lcom/datadog/android/rum/tracking/ComponentPredicate;Lcom/datadog/android/rum/internal/RumFeature;Lcom/datadog/android/rum/RumMonitor;Lcom/datadog/android/internal/system/BuildSdkVersionProvider;)V", "Landroid/app/FragmentManager;", "fm", "f", "Landroid/os/Bundle;", "savedInstanceState", "", "onFragmentActivityCreated", "(Landroid/app/FragmentManager;Landroid/app/Fragment;Landroid/os/Bundle;)V", "onFragmentResumed", "(Landroid/app/FragmentManager;Landroid/app/Fragment;)V", "onFragmentStopped", "activity", "Lcom/datadog/android/api/SdkCore;", "sdkCore", "register", "(Landroid/app/Activity;Lcom/datadog/android/api/SdkCore;)V", "unregister", "(Landroid/app/Activity;)V", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function1;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/internal/system/BuildSdkVersionProvider;", "getHighSpeedVideoFpsRanges", "Lcom/datadog/android/rum/tracking/ComponentPredicate;", "Camera2StreamConfigurationMap", "Ljava/util/concurrent/ScheduledExecutorService;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/Lazy;", "Lcom/datadog/android/api/InternalLogger;", "()Lcom/datadog/android/api/InternalLogger;", "Lcom/datadog/android/rum/internal/RumFeature;", "getInputSizeshNQ4ISI", "Lcom/datadog/android/rum/RumMonitor;", "getInputFormats", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "getHighSpeedVideoSizesFor", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "getOutputFormats", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OreoFragmentLifecycleCallbacks extends android.app.FragmentManager.FragmentLifecycleCallbacks implements com.datadog.android.rum.internal.tracking.FragmentLifecycleCallbacks<android.app.Activity> {
    private static final com.datadog.android.rum.internal.tracking.OreoFragmentLifecycleCallbacks.Companion Companion = new com.datadog.android.rum.internal.tracking.OreoFragmentLifecycleCallbacks.Companion(null);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.datadog.android.rum.internal.RumFeature getInputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.internal.system.BuildSdkVersionProvider getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.datadog.android.rum.tracking.ComponentPredicate<android.app.Fragment> Camera2StreamConfigurationMap;
    private final kotlin.Lazy getHighSpeedVideoFpsRangesFor;
    private final kotlin.jvm.functions.Function1<android.app.Fragment, java.util.Map<java.lang.String, java.lang.Object>> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private com.datadog.android.api.feature.FeatureSdkCore getOutputFormats;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.rum.RumMonitor getInputFormats;

    public /* synthetic */ OreoFragmentLifecycleCallbacks(kotlin.jvm.functions.Function1 function1, com.datadog.android.rum.tracking.ComponentPredicate componentPredicate, com.datadog.android.rum.internal.RumFeature rumFeature, com.datadog.android.rum.RumMonitor rumMonitor, com.datadog.android.internal.system.BuildSdkVersionProvider buildSdkVersionProvider, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, componentPredicate, rumFeature, rumMonitor, (i & 16) != 0 ? com.datadog.android.internal.system.BuildSdkVersionProvider.INSTANCE.getDEFAULT() : buildSdkVersionProvider);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OreoFragmentLifecycleCallbacks(kotlin.jvm.functions.Function1<? super android.app.Fragment, ? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> function1, com.datadog.android.rum.tracking.ComponentPredicate<android.app.Fragment> componentPredicate, com.datadog.android.rum.internal.RumFeature rumFeature, com.datadog.android.rum.RumMonitor rumMonitor, com.datadog.android.internal.system.BuildSdkVersionProvider buildSdkVersionProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentPredicate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumFeature, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumMonitor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buildSdkVersionProvider, "");
        this.getHighSpeedVideoSizes = function1;
        this.Camera2StreamConfigurationMap = componentPredicate;
        this.getInputSizeshNQ4ISI = rumFeature;
        this.getInputFormats = rumMonitor;
        this.getHighSpeedVideoFpsRanges = buildSdkVersionProvider;
        this.getHighSpeedVideoFpsRangesFor = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<java.util.concurrent.ScheduledExecutorService>() { // from class: com.datadog.android.rum.internal.tracking.OreoFragmentLifecycleCallbacks$executor$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
            public final java.util.concurrent.ScheduledExecutorService invoke() {
                com.datadog.android.api.feature.FeatureSdkCore featureSdkCore;
                featureSdkCore = com.datadog.android.rum.internal.tracking.OreoFragmentLifecycleCallbacks.this.getOutputFormats;
                if (featureSdkCore == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    featureSdkCore = null;
                }
                return featureSdkCore.createScheduledExecutorService("rum-fragment-lifecycle");
            }

            {
                super(0);
            }
        });
    }

    private final com.datadog.android.api.InternalLogger Camera2StreamConfigurationMap() {
        com.datadog.android.api.feature.FeatureSdkCore featureSdkCore = this.getOutputFormats;
        if (featureSdkCore == null) {
            return com.datadog.android.api.InternalLogger.INSTANCE.getUNBOUND();
        }
        if (featureSdkCore == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            featureSdkCore = null;
        }
        return featureSdkCore.getInternalLogger();
    }

    @Override // com.datadog.android.rum.internal.tracking.FragmentLifecycleCallbacks
    public final void register(android.app.Activity activity, com.datadog.android.api.SdkCore sdkCore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkCore, "");
        this.getOutputFormats = (com.datadog.android.api.feature.FeatureSdkCore) sdkCore;
        if (this.getHighSpeedVideoFpsRanges.getIsAtLeastO()) {
            activity.getFragmentManager().registerFragmentLifecycleCallbacks(this, true);
        }
    }

    @Override // com.datadog.android.rum.internal.tracking.FragmentLifecycleCallbacks
    public final void unregister(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        if (this.getHighSpeedVideoFpsRanges.getIsAtLeastO()) {
            activity.getFragmentManager().unregisterFragmentLifecycleCallbacks(this);
        }
    }

    @Override // android.app.FragmentManager.FragmentLifecycleCallbacks
    @kotlin.Deprecated(message = "Deprecated in Java")
    public final void onFragmentActivityCreated(android.app.FragmentManager fm, android.app.Fragment f, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fm, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(f, "");
        super.onFragmentActivityCreated(fm, f, savedInstanceState);
        if (kotlin.jvm.internal.Intrinsics.areEqual(f.getClass().getName(), "androidx.lifecycle.ReportFragment")) {
            return;
        }
        android.content.Context context = f.getContext();
        if (!(f instanceof android.app.DialogFragment) || context == null || this.getOutputFormats == null) {
            return;
        }
        android.app.Dialog dialog = ((android.app.DialogFragment) f).getDialog();
        com.datadog.android.api.feature.FeatureSdkCore featureSdkCore = null;
        android.view.Window window = dialog != null ? dialog.getWindow() : null;
        com.datadog.android.rum.internal.instrumentation.gestures.GesturesTracker gesturesTracker = this.getInputSizeshNQ4ISI.getActionTrackingStrategy().getGesturesTracker();
        com.datadog.android.api.feature.FeatureSdkCore featureSdkCore2 = this.getOutputFormats;
        if (featureSdkCore2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            featureSdkCore = featureSdkCore2;
        }
        gesturesTracker.startTracking(window, context, featureSdkCore);
    }

    @Override // android.app.FragmentManager.FragmentLifecycleCallbacks
    @kotlin.Deprecated(message = "Deprecated in Java")
    public final void onFragmentResumed(android.app.FragmentManager fm, android.app.Fragment f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fm, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(f, "");
        super.onFragmentResumed(fm, f);
        if (kotlin.jvm.internal.Intrinsics.areEqual(f.getClass().getName(), "androidx.lifecycle.ReportFragment")) {
            return;
        }
        com.datadog.android.rum.tracking.ComponentPredicate<android.app.Fragment> componentPredicate = this.Camera2StreamConfigurationMap;
        com.datadog.android.api.InternalLogger Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
        if (componentPredicate.accept(f)) {
            try {
                java.lang.String viewName = this.Camera2StreamConfigurationMap.getViewName(f);
                java.lang.String str = viewName;
                if (str == null || kotlin.text.StringsKt.isBlank(str)) {
                    viewName = com.datadog.android.rum.internal.utils.ViewUtilsKt.resolveViewUrl(f);
                }
                this.getInputFormats.startView(f, viewName, (java.util.Map) this.getHighSpeedVideoSizes.invoke(f));
            } catch (java.lang.Exception e) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(Camera2StreamConfigurationMap, com.datadog.android.api.InternalLogger.Level.ERROR, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.MAINTAINER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) com.datadog.android.rum.internal.utils.ComponentPredicateExtKt$runIfValid$1.INSTANCE, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            }
        }
    }

    @Override // android.app.FragmentManager.FragmentLifecycleCallbacks
    @kotlin.Deprecated(message = "Deprecated in Java")
    public final void onFragmentStopped(android.app.FragmentManager fm, final android.app.Fragment f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fm, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(f, "");
        super.onFragmentStopped(fm, f);
        if (kotlin.jvm.internal.Intrinsics.areEqual(f.getClass().getName(), "androidx.lifecycle.ReportFragment")) {
            return;
        }
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = (java.util.concurrent.ScheduledExecutorService) this.getHighSpeedVideoFpsRangesFor.getValue();
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        com.datadog.android.api.feature.FeatureSdkCore featureSdkCore = this.getOutputFormats;
        if (featureSdkCore == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            featureSdkCore = null;
        }
        com.datadog.android.core.internal.utils.ConcurrencyExtKt.scheduleSafe(scheduledExecutorService, "Delayed view stop", 200L, timeUnit, featureSdkCore.getInternalLogger(), new java.lang.Runnable() { // from class: com.datadog.android.rum.internal.tracking.OreoFragmentLifecycleCallbacks$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.datadog.android.rum.internal.tracking.OreoFragmentLifecycleCallbacks.$r8$lambda$Zq8z7gG1RIAwttskATn5dHu2kjA(com.datadog.android.rum.internal.tracking.OreoFragmentLifecycleCallbacks.this, f);
            }
        });
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/datadog/android/rum/internal/tracking/OreoFragmentLifecycleCallbacks$Companion;", "", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ void $r8$lambda$Zq8z7gG1RIAwttskATn5dHu2kjA(com.datadog.android.rum.internal.tracking.OreoFragmentLifecycleCallbacks oreoFragmentLifecycleCallbacks, android.app.Fragment fragment) {
        com.datadog.android.rum.tracking.ComponentPredicate<android.app.Fragment> componentPredicate = oreoFragmentLifecycleCallbacks.Camera2StreamConfigurationMap;
        com.datadog.android.api.InternalLogger Camera2StreamConfigurationMap = oreoFragmentLifecycleCallbacks.Camera2StreamConfigurationMap();
        if (componentPredicate.accept(fragment)) {
            try {
                com.datadog.android.rum.RumMonitor.DefaultImpls.stopView$default(oreoFragmentLifecycleCallbacks.getInputFormats, fragment, null, 2, null);
            } catch (java.lang.Exception e) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(Camera2StreamConfigurationMap, com.datadog.android.api.InternalLogger.Level.ERROR, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.MAINTAINER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) com.datadog.android.rum.internal.utils.ComponentPredicateExtKt$runIfValid$1.INSTANCE, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            }
        }
    }
}
