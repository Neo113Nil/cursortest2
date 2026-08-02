package com.datadog.android.rum.tracking;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0001$B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0014R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u001a\u001a\u00020\u00198CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010#\u001a\u0004\u0018\u00010 *\u00020\u001f8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\""}, d2 = {"Lcom/datadog/android/rum/tracking/ActivityViewTrackingStrategy;", "Lcom/datadog/android/rum/tracking/ActivityLifecycleTrackingStrategy;", "Lcom/datadog/android/rum/tracking/ViewTrackingStrategy;", "", "trackExtras", "Lcom/datadog/android/rum/tracking/ComponentPredicate;", "Landroid/app/Activity;", "componentPredicate", "<init>", "(ZLcom/datadog/android/rum/tracking/ComponentPredicate;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "activity", "", "onActivityResumed", "(Landroid/app/Activity;)V", "onActivityStopped", "Lcom/datadog/android/rum/tracking/ComponentPredicate;", "getComponentPredicate$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/tracking/ComponentPredicate;", "Ljava/util/concurrent/ScheduledExecutorService;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/Lazy;", "Z", "getTrackExtras$dd_sdk_android_rum_release", "()Z", "Landroid/content/Intent;", "Landroid/os/Bundle;", "getHighResolutionOutputSizeshNQ4ISI", "(Landroid/content/Intent;)Landroid/os/Bundle;", "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ActivityViewTrackingStrategy extends com.datadog.android.rum.tracking.ActivityLifecycleTrackingStrategy implements com.datadog.android.rum.tracking.ViewTrackingStrategy {
    public static final java.lang.String INTENT_ACTION_TAG = "view.intent.action";
    public static final java.lang.String INTENT_URI_TAG = "view.intent.uri";
    private final com.datadog.android.rum.tracking.ComponentPredicate<android.app.Activity> componentPredicate;
    private final kotlin.Lazy getHighSpeedVideoFpsRangesFor;
    private final boolean trackExtras;

    /* renamed from: getTrackExtras$dd_sdk_android_rum_release, reason: from getter */
    public final boolean getTrackExtras() {
        return this.trackExtras;
    }

    public /* synthetic */ ActivityViewTrackingStrategy(boolean z, com.datadog.android.rum.tracking.AcceptAllActivities acceptAllActivities, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? new com.datadog.android.rum.tracking.AcceptAllActivities() : acceptAllActivities);
    }

    public final com.datadog.android.rum.tracking.ComponentPredicate<android.app.Activity> getComponentPredicate$dd_sdk_android_rum_release() {
        return this.componentPredicate;
    }

    public ActivityViewTrackingStrategy(boolean z, com.datadog.android.rum.tracking.ComponentPredicate<android.app.Activity> componentPredicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentPredicate, "");
        this.trackExtras = z;
        this.componentPredicate = componentPredicate;
        this.getHighSpeedVideoFpsRangesFor = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<java.util.concurrent.ScheduledExecutorService>() { // from class: com.datadog.android.rum.tracking.ActivityViewTrackingStrategy$executor$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            public final java.util.concurrent.ScheduledExecutorService invoke() {
                return com.datadog.android.rum.tracking.ActivityViewTrackingStrategy.this.getSdkCore().createScheduledExecutorService("rum-activity-tracking");
            }

            {
                super(0);
            }
        });
    }

    @Override // com.datadog.android.rum.tracking.ActivityLifecycleTrackingStrategy, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
        java.util.LinkedHashMap emptyMap;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        super.onActivityResumed(activity);
        com.datadog.android.rum.tracking.ComponentPredicate<android.app.Activity> componentPredicate = this.componentPredicate;
        com.datadog.android.api.InternalLogger internalLogger$dd_sdk_android_rum_release = getInternalLogger$dd_sdk_android_rum_release();
        if (componentPredicate.accept(activity)) {
            try {
                java.lang.String viewName = this.componentPredicate.getViewName(activity);
                java.lang.String str = viewName;
                if (str == null || kotlin.text.StringsKt.isBlank(str)) {
                    viewName = com.datadog.android.rum.internal.utils.ViewUtilsKt.resolveViewUrl(activity);
                }
                if (this.trackExtras) {
                    android.content.Intent intent = activity.getIntent();
                    if (intent == null) {
                        emptyMap = kotlin.collections.MapsKt.emptyMap();
                    } else if (intent == null) {
                        emptyMap = new java.util.LinkedHashMap();
                    } else {
                        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                        java.lang.String action = intent.getAction();
                        if (action != null) {
                            linkedHashMap.put(INTENT_ACTION_TAG, action);
                        }
                        java.lang.String dataString = intent.getDataString();
                        if (dataString != null) {
                            linkedHashMap.put(INTENT_URI_TAG, dataString);
                        }
                        linkedHashMap.putAll(com.datadog.android.rum.tracking.BundleExtKt.convertToRumViewAttributes(getHighResolutionOutputSizeshNQ4ISI(intent)));
                        com.datadog.android.internal.attributes.LocalAttributeKt.enrichWithConstantAttribute(linkedHashMap, com.datadog.android.internal.attributes.ViewScopeInstrumentationType.Native.ACTIVITY);
                        emptyMap = linkedHashMap;
                    }
                } else {
                    emptyMap = kotlin.collections.MapsKt.emptyMap();
                }
                com.datadog.android.rum.RumMonitor rumMonitor = (com.datadog.android.rum.RumMonitor) withSdkCore(com.datadog.android.rum.tracking.ActivityViewTrackingStrategy$getRumMonitor$1.getHighSpeedVideoSizes);
                if (rumMonitor != null) {
                    rumMonitor.startView(activity, viewName, emptyMap);
                }
            } catch (java.lang.Exception e) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger$dd_sdk_android_rum_release, com.datadog.android.api.InternalLogger.Level.ERROR, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.MAINTAINER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) com.datadog.android.rum.internal.utils.ComponentPredicateExtKt$runIfValid$1.INSTANCE, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            }
        }
    }

    @Override // com.datadog.android.rum.tracking.ActivityLifecycleTrackingStrategy, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(final android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        super.onActivityStopped(activity);
        com.datadog.android.core.internal.utils.ConcurrencyExtKt.scheduleSafe((java.util.concurrent.ScheduledExecutorService) this.getHighSpeedVideoFpsRangesFor.getValue(), "Delayed view stop", 200L, java.util.concurrent.TimeUnit.MILLISECONDS, getInternalLogger$dd_sdk_android_rum_release(), new java.lang.Runnable() { // from class: com.datadog.android.rum.tracking.ActivityViewTrackingStrategy$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.datadog.android.rum.tracking.ActivityViewTrackingStrategy.$r8$lambda$AcH2yuRFx2dyYucUxr982kQI0SU(com.datadog.android.rum.tracking.ActivityViewTrackingStrategy.this, activity);
            }
        });
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(other, "");
        com.datadog.android.rum.tracking.ActivityViewTrackingStrategy activityViewTrackingStrategy = (com.datadog.android.rum.tracking.ActivityViewTrackingStrategy) other;
        return this.trackExtras == activityViewTrackingStrategy.trackExtras && kotlin.jvm.internal.Intrinsics.areEqual(this.componentPredicate, activityViewTrackingStrategy.componentPredicate);
    }

    public final int hashCode() {
        return (java.lang.Boolean.hashCode(this.trackExtras) * 31) + this.componentPredicate.hashCode();
    }

    private final android.os.Bundle getHighResolutionOutputSizeshNQ4ISI(android.content.Intent intent) {
        try {
            return intent.getExtras();
        } catch (java.lang.Exception e) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(getInternalLogger$dd_sdk_android_rum_release(), com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.tracking.ActivityViewTrackingStrategy$safeExtras$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return "Error getting Intent extras, ignoring it.";
                }
            }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return null;
        }
    }

    public static /* synthetic */ void $r8$lambda$AcH2yuRFx2dyYucUxr982kQI0SU(com.datadog.android.rum.tracking.ActivityViewTrackingStrategy activityViewTrackingStrategy, android.app.Activity activity) {
        com.datadog.android.rum.tracking.ComponentPredicate<android.app.Activity> componentPredicate = activityViewTrackingStrategy.componentPredicate;
        com.datadog.android.api.InternalLogger internalLogger$dd_sdk_android_rum_release = activityViewTrackingStrategy.getInternalLogger$dd_sdk_android_rum_release();
        if (componentPredicate.accept(activity)) {
            try {
                com.datadog.android.rum.RumMonitor rumMonitor = (com.datadog.android.rum.RumMonitor) activityViewTrackingStrategy.withSdkCore(com.datadog.android.rum.tracking.ActivityViewTrackingStrategy$getRumMonitor$1.getHighSpeedVideoSizes);
                if (rumMonitor != null) {
                    com.datadog.android.rum.RumMonitor.DefaultImpls.stopView$default(rumMonitor, activity, null, 2, null);
                }
            } catch (java.lang.Exception e) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger$dd_sdk_android_rum_release, com.datadog.android.api.InternalLogger.Level.ERROR, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.MAINTAINER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) com.datadog.android.rum.internal.utils.ComponentPredicateExtKt$runIfValid$1.INSTANCE, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ActivityViewTrackingStrategy(boolean z) {
        this(z, null, 2, 0 == true ? 1 : 0);
    }
}
