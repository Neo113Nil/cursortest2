package com.datadog.android.rum.tracking;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u00012\u00020\u0002B1\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\n\u0010\u000bB5\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001aR\u001b\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010\r\u001a\u00020\f8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b\"\u0010#R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&R\u001b\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00160\u001c8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b \u0010\u001fR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b(\u0010&R\u001a\u0010\u0004\u001a\u00020\u00038\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010+"}, d2 = {"Lcom/datadog/android/rum/tracking/FragmentViewTrackingStrategy;", "Lcom/datadog/android/rum/tracking/ActivityLifecycleTrackingStrategy;", "Lcom/datadog/android/rum/tracking/ViewTrackingStrategy;", "", "trackArguments", "Lcom/datadog/android/rum/tracking/ComponentPredicate;", "Landroidx/fragment/app/Fragment;", "supportFragmentComponentPredicate", "Landroid/app/Fragment;", "defaultFragmentComponentPredicate", "<init>", "(ZLcom/datadog/android/rum/tracking/ComponentPredicate;Lcom/datadog/android/rum/tracking/ComponentPredicate;)V", "Lcom/datadog/android/internal/system/BuildSdkVersionProvider;", "buildSdkVersionProvider", "(ZLcom/datadog/android/rum/tracking/ComponentPredicate;Lcom/datadog/android/rum/tracking/ComponentPredicate;Lcom/datadog/android/internal/system/BuildSdkVersionProvider;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/app/Activity;", "activity", "", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityStopped", "Lcom/datadog/android/rum/internal/tracking/FragmentLifecycleCallbacks;", "Landroidx/fragment/app/FragmentActivity;", "Camera2StreamConfigurationMap", "Lkotlin/Lazy;", "getHighSpeedVideoFpsRanges", "Lcom/datadog/android/internal/system/BuildSdkVersionProvider;", "getBuildSdkVersionProvider$dd_sdk_android_rum_release", "()Lcom/datadog/android/internal/system/BuildSdkVersionProvider;", "Lcom/datadog/android/rum/tracking/ComponentPredicate;", "getDefaultFragmentComponentPredicate$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/tracking/ComponentPredicate;", "getHighSpeedVideoSizes", "getSupportFragmentComponentPredicate$dd_sdk_android_rum_release", "Z", "getTrackArguments$dd_sdk_android_rum_release", "()Z"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FragmentViewTrackingStrategy extends com.datadog.android.rum.tracking.ActivityLifecycleTrackingStrategy implements com.datadog.android.rum.tracking.ViewTrackingStrategy {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoFpsRanges;
    private final com.datadog.android.internal.system.BuildSdkVersionProvider buildSdkVersionProvider;
    private final com.datadog.android.rum.tracking.ComponentPredicate<android.app.Fragment> defaultFragmentComponentPredicate;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoSizes;
    private final com.datadog.android.rum.tracking.ComponentPredicate<androidx.fragment.app.Fragment> supportFragmentComponentPredicate;
    private final boolean trackArguments;

    /* renamed from: getTrackArguments$dd_sdk_android_rum_release, reason: from getter */
    public final boolean getTrackArguments() {
        return this.trackArguments;
    }

    public final com.datadog.android.rum.tracking.ComponentPredicate<androidx.fragment.app.Fragment> getSupportFragmentComponentPredicate$dd_sdk_android_rum_release() {
        return this.supportFragmentComponentPredicate;
    }

    public final com.datadog.android.rum.tracking.ComponentPredicate<android.app.Fragment> getDefaultFragmentComponentPredicate$dd_sdk_android_rum_release() {
        return this.defaultFragmentComponentPredicate;
    }

    /* renamed from: getBuildSdkVersionProvider$dd_sdk_android_rum_release, reason: from getter */
    public final com.datadog.android.internal.system.BuildSdkVersionProvider getBuildSdkVersionProvider() {
        return this.buildSdkVersionProvider;
    }

    public FragmentViewTrackingStrategy(boolean z, com.datadog.android.rum.tracking.ComponentPredicate<androidx.fragment.app.Fragment> componentPredicate, com.datadog.android.rum.tracking.ComponentPredicate<android.app.Fragment> componentPredicate2, com.datadog.android.internal.system.BuildSdkVersionProvider buildSdkVersionProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentPredicate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentPredicate2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buildSdkVersionProvider, "");
        this.trackArguments = z;
        this.supportFragmentComponentPredicate = componentPredicate;
        this.defaultFragmentComponentPredicate = componentPredicate2;
        this.buildSdkVersionProvider = buildSdkVersionProvider;
        this.getHighSpeedVideoFpsRanges = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.datadog.android.rum.internal.tracking.FragmentLifecycleCallbacks<androidx.fragment.app.FragmentActivity>>() { // from class: com.datadog.android.rum.tracking.FragmentViewTrackingStrategy$androidXLifecycleCallbacks$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
            public final com.datadog.android.rum.internal.tracking.FragmentLifecycleCallbacks<androidx.fragment.app.FragmentActivity> invoke() {
                com.datadog.android.rum.internal.RumFeature rumFeature = (com.datadog.android.rum.internal.RumFeature) com.datadog.android.rum.tracking.FragmentViewTrackingStrategy.this.withSdkCore(new kotlin.jvm.functions.Function1<com.datadog.android.api.feature.FeatureSdkCore, com.datadog.android.rum.internal.RumFeature>() { // from class: com.datadog.android.rum.tracking.FragmentViewTrackingStrategy$androidXLifecycleCallbacks$2$rumFeature$1
                    @Override // kotlin.jvm.functions.Function1
                    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                    public final com.datadog.android.rum.internal.RumFeature invoke(com.datadog.android.api.feature.FeatureSdkCore featureSdkCore) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureSdkCore, "");
                        com.datadog.android.api.feature.FeatureScope feature = featureSdkCore.getFeature("rum");
                        if (feature != null) {
                            return (com.datadog.android.rum.internal.RumFeature) feature.unwrap();
                        }
                        return null;
                    }
                });
                com.datadog.android.rum.RumMonitor rumMonitor = (com.datadog.android.rum.RumMonitor) com.datadog.android.rum.tracking.FragmentViewTrackingStrategy.this.withSdkCore(new kotlin.jvm.functions.Function1<com.datadog.android.api.feature.FeatureSdkCore, com.datadog.android.rum.RumMonitor>() { // from class: com.datadog.android.rum.tracking.FragmentViewTrackingStrategy$androidXLifecycleCallbacks$2$rumMonitor$1
                    @Override // kotlin.jvm.functions.Function1
                    /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                    public final com.datadog.android.rum.RumMonitor invoke(com.datadog.android.api.feature.FeatureSdkCore featureSdkCore) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureSdkCore, "");
                        return com.datadog.android.rum.GlobalRumMonitor.get(featureSdkCore);
                    }
                });
                if (rumFeature != null && rumMonitor != null) {
                    com.datadog.android.rum.tracking.ComponentPredicate<androidx.fragment.app.Fragment> supportFragmentComponentPredicate$dd_sdk_android_rum_release = com.datadog.android.rum.tracking.FragmentViewTrackingStrategy.this.getSupportFragmentComponentPredicate$dd_sdk_android_rum_release();
                    final com.datadog.android.rum.tracking.FragmentViewTrackingStrategy fragmentViewTrackingStrategy = com.datadog.android.rum.tracking.FragmentViewTrackingStrategy.this;
                    return new com.datadog.android.rum.internal.tracking.AndroidXFragmentLifecycleCallbacks(new kotlin.jvm.functions.Function1<androidx.fragment.app.Fragment, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.datadog.android.rum.tracking.FragmentViewTrackingStrategy$androidXLifecycleCallbacks$2.1
                        @Override // kotlin.jvm.functions.Function1
                        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                        public final java.util.Map<java.lang.String, java.lang.Object> invoke(androidx.fragment.app.Fragment fragment) {
                            java.util.LinkedHashMap linkedHashMap;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "");
                            if (com.datadog.android.rum.tracking.FragmentViewTrackingStrategy.this.getTrackArguments()) {
                                linkedHashMap = kotlin.collections.MapsKt.toMutableMap(com.datadog.android.rum.tracking.BundleExtKt.convertToRumViewAttributes(fragment.getArguments()));
                            } else {
                                linkedHashMap = new java.util.LinkedHashMap();
                            }
                            return com.datadog.android.internal.attributes.LocalAttributeKt.enrichWithConstantAttribute(linkedHashMap, com.datadog.android.internal.attributes.ViewScopeInstrumentationType.Native.FRAGMENT);
                        }

                        {
                            super(1);
                        }
                    }, supportFragmentComponentPredicate$dd_sdk_android_rum_release, rumFeature, rumMonitor);
                }
                return new com.datadog.android.rum.internal.tracking.NoOpFragmentLifecycleCallbacks();
            }

            {
                super(0);
            }
        });
        this.getHighSpeedVideoSizes = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.datadog.android.rum.internal.tracking.FragmentLifecycleCallbacks<android.app.Activity>>() { // from class: com.datadog.android.rum.tracking.FragmentViewTrackingStrategy$oreoLifecycleCallbacks$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            public final com.datadog.android.rum.internal.tracking.FragmentLifecycleCallbacks<android.app.Activity> invoke() {
                com.datadog.android.rum.internal.RumFeature rumFeature = (com.datadog.android.rum.internal.RumFeature) com.datadog.android.rum.tracking.FragmentViewTrackingStrategy.this.withSdkCore(new kotlin.jvm.functions.Function1<com.datadog.android.api.feature.FeatureSdkCore, com.datadog.android.rum.internal.RumFeature>() { // from class: com.datadog.android.rum.tracking.FragmentViewTrackingStrategy$oreoLifecycleCallbacks$2$rumFeature$1
                    @Override // kotlin.jvm.functions.Function1
                    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                    public final com.datadog.android.rum.internal.RumFeature invoke(com.datadog.android.api.feature.FeatureSdkCore featureSdkCore) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureSdkCore, "");
                        com.datadog.android.api.feature.FeatureScope feature = featureSdkCore.getFeature("rum");
                        if (feature != null) {
                            return (com.datadog.android.rum.internal.RumFeature) feature.unwrap();
                        }
                        return null;
                    }
                });
                com.datadog.android.rum.RumMonitor rumMonitor = (com.datadog.android.rum.RumMonitor) com.datadog.android.rum.tracking.FragmentViewTrackingStrategy.this.withSdkCore(new kotlin.jvm.functions.Function1<com.datadog.android.api.feature.FeatureSdkCore, com.datadog.android.rum.RumMonitor>() { // from class: com.datadog.android.rum.tracking.FragmentViewTrackingStrategy$oreoLifecycleCallbacks$2$rumMonitor$1
                    @Override // kotlin.jvm.functions.Function1
                    /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                    public final com.datadog.android.rum.RumMonitor invoke(com.datadog.android.api.feature.FeatureSdkCore featureSdkCore) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureSdkCore, "");
                        return com.datadog.android.rum.GlobalRumMonitor.get(featureSdkCore);
                    }
                });
                if (com.datadog.android.rum.tracking.FragmentViewTrackingStrategy.this.getBuildSdkVersionProvider().getIsAtLeastO() && rumFeature != null && rumMonitor != null) {
                    com.datadog.android.rum.tracking.ComponentPredicate<android.app.Fragment> defaultFragmentComponentPredicate$dd_sdk_android_rum_release = com.datadog.android.rum.tracking.FragmentViewTrackingStrategy.this.getDefaultFragmentComponentPredicate$dd_sdk_android_rum_release();
                    com.datadog.android.internal.system.BuildSdkVersionProvider buildSdkVersionProvider2 = com.datadog.android.rum.tracking.FragmentViewTrackingStrategy.this.getBuildSdkVersionProvider();
                    final com.datadog.android.rum.tracking.FragmentViewTrackingStrategy fragmentViewTrackingStrategy = com.datadog.android.rum.tracking.FragmentViewTrackingStrategy.this;
                    return new com.datadog.android.rum.internal.tracking.OreoFragmentLifecycleCallbacks(new kotlin.jvm.functions.Function1<android.app.Fragment, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.datadog.android.rum.tracking.FragmentViewTrackingStrategy$oreoLifecycleCallbacks$2.1
                        @Override // kotlin.jvm.functions.Function1
                        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                        public final java.util.Map<java.lang.String, java.lang.Object> invoke(android.app.Fragment fragment) {
                            java.util.LinkedHashMap linkedHashMap;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "");
                            if (com.datadog.android.rum.tracking.FragmentViewTrackingStrategy.this.getTrackArguments()) {
                                linkedHashMap = kotlin.collections.MapsKt.toMutableMap(com.datadog.android.rum.tracking.BundleExtKt.convertToRumViewAttributes(fragment.getArguments()));
                            } else {
                                linkedHashMap = new java.util.LinkedHashMap();
                            }
                            return com.datadog.android.internal.attributes.LocalAttributeKt.enrichWithConstantAttribute(linkedHashMap, com.datadog.android.internal.attributes.ViewScopeInstrumentationType.Native.FRAGMENT);
                        }

                        {
                            super(1);
                        }
                    }, defaultFragmentComponentPredicate$dd_sdk_android_rum_release, rumFeature, rumMonitor, buildSdkVersionProvider2);
                }
                return new com.datadog.android.rum.internal.tracking.NoOpFragmentLifecycleCallbacks();
            }

            {
                super(0);
            }
        });
    }

    public /* synthetic */ FragmentViewTrackingStrategy(boolean z, com.datadog.android.rum.tracking.AcceptAllSupportFragments acceptAllSupportFragments, com.datadog.android.rum.tracking.AcceptAllDefaultFragment acceptAllDefaultFragment, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? new com.datadog.android.rum.tracking.AcceptAllSupportFragments() : acceptAllSupportFragments, (i & 4) != 0 ? new com.datadog.android.rum.tracking.AcceptAllDefaultFragment() : acceptAllDefaultFragment);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentViewTrackingStrategy(boolean z, com.datadog.android.rum.tracking.ComponentPredicate<androidx.fragment.app.Fragment> componentPredicate, com.datadog.android.rum.tracking.ComponentPredicate<android.app.Fragment> componentPredicate2) {
        this(z, componentPredicate, componentPredicate2, com.datadog.android.internal.system.BuildSdkVersionProvider.INSTANCE.getDEFAULT());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentPredicate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentPredicate2, "");
    }

    @Override // com.datadog.android.rum.tracking.ActivityLifecycleTrackingStrategy, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(final android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        super.onActivityStarted(activity);
        withSdkCore(new kotlin.jvm.functions.Function1<com.datadog.android.api.feature.FeatureSdkCore, kotlin.Unit>() { // from class: com.datadog.android.rum.tracking.FragmentViewTrackingStrategy$onActivityStarted$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(com.datadog.android.api.feature.FeatureSdkCore featureSdkCore) {
                getHighSpeedVideoFpsRanges(featureSdkCore);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoFpsRanges(com.datadog.android.api.feature.FeatureSdkCore featureSdkCore) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureSdkCore, "");
                if (androidx.fragment.app.FragmentActivity.class.isAssignableFrom(activity.getClass())) {
                    com.datadog.android.rum.internal.tracking.FragmentLifecycleCallbacks access$getAndroidXLifecycleCallbacks = com.datadog.android.rum.tracking.FragmentViewTrackingStrategy.access$getAndroidXLifecycleCallbacks(this);
                    android.app.Activity activity2 = activity;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(activity2, "");
                    access$getAndroidXLifecycleCallbacks.register((androidx.fragment.app.FragmentActivity) activity2, featureSdkCore);
                    return;
                }
                com.datadog.android.rum.tracking.FragmentViewTrackingStrategy.access$getOreoLifecycleCallbacks(this).register(activity, featureSdkCore);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
    }

    @Override // com.datadog.android.rum.tracking.ActivityLifecycleTrackingStrategy, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        super.onActivityStopped(activity);
        if (androidx.fragment.app.FragmentActivity.class.isAssignableFrom(activity.getClass())) {
            ((com.datadog.android.rum.internal.tracking.FragmentLifecycleCallbacks) this.getHighSpeedVideoFpsRanges.getValue()).unregister((androidx.fragment.app.FragmentActivity) activity);
        } else {
            ((com.datadog.android.rum.internal.tracking.FragmentLifecycleCallbacks) this.getHighSpeedVideoSizes.getValue()).unregister(activity);
        }
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(other, "");
        com.datadog.android.rum.tracking.FragmentViewTrackingStrategy fragmentViewTrackingStrategy = (com.datadog.android.rum.tracking.FragmentViewTrackingStrategy) other;
        return this.trackArguments == fragmentViewTrackingStrategy.trackArguments && kotlin.jvm.internal.Intrinsics.areEqual(this.supportFragmentComponentPredicate, fragmentViewTrackingStrategy.supportFragmentComponentPredicate) && kotlin.jvm.internal.Intrinsics.areEqual(this.defaultFragmentComponentPredicate, fragmentViewTrackingStrategy.defaultFragmentComponentPredicate);
    }

    public final int hashCode() {
        return (((java.lang.Boolean.hashCode(this.trackArguments) * 31) + this.supportFragmentComponentPredicate.hashCode()) * 31) + this.defaultFragmentComponentPredicate.hashCode();
    }

    public static final /* synthetic */ com.datadog.android.rum.internal.tracking.FragmentLifecycleCallbacks access$getAndroidXLifecycleCallbacks(com.datadog.android.rum.tracking.FragmentViewTrackingStrategy fragmentViewTrackingStrategy) {
        return (com.datadog.android.rum.internal.tracking.FragmentLifecycleCallbacks) fragmentViewTrackingStrategy.getHighSpeedVideoFpsRanges.getValue();
    }

    public static final /* synthetic */ com.datadog.android.rum.internal.tracking.FragmentLifecycleCallbacks access$getOreoLifecycleCallbacks(com.datadog.android.rum.tracking.FragmentViewTrackingStrategy fragmentViewTrackingStrategy) {
        return (com.datadog.android.rum.internal.tracking.FragmentLifecycleCallbacks) fragmentViewTrackingStrategy.getHighSpeedVideoSizes.getValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentViewTrackingStrategy(boolean z, com.datadog.android.rum.tracking.ComponentPredicate<androidx.fragment.app.Fragment> componentPredicate) {
        this(z, componentPredicate, null, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentPredicate, "");
    }

    public FragmentViewTrackingStrategy(boolean z) {
        this(z, null, null, 6, null);
    }
}
