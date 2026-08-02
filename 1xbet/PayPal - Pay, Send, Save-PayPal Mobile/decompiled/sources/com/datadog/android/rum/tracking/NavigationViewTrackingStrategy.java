package com.datadog.android.rum.tracking;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001/B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J)\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u000f¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u000f¢\u0006\u0004\b\u001d\u0010\u001cJ\u001d\u0010\u001f\u001a\u0004\u0018\u00010\u0014*\u00020\r2\u0006\u0010\u001e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\"\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020$0#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010!\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010(R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020)0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\"R\u0018\u0010*\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-"}, d2 = {"Lcom/datadog/android/rum/tracking/NavigationViewTrackingStrategy;", "Lcom/datadog/android/rum/tracking/ActivityLifecycleTrackingStrategy;", "Lcom/datadog/android/rum/tracking/ViewTrackingStrategy;", "Landroidx/navigation/NavController$OnDestinationChangedListener;", "", "navigationViewId", "", "trackArguments", "Lcom/datadog/android/rum/tracking/ComponentPredicate;", "Landroidx/navigation/NavDestination;", "componentPredicate", "<init>", "(IZLcom/datadog/android/rum/tracking/ComponentPredicate;)V", "Landroid/app/Activity;", "activity", "", "onActivityPaused", "(Landroid/app/Activity;)V", "onActivityStarted", "onActivityStopped", "Landroidx/navigation/NavController;", "controller", "destination", "Landroid/os/Bundle;", "arguments", "onDestinationChanged", "(Landroidx/navigation/NavController;Landroidx/navigation/NavDestination;Landroid/os/Bundle;)V", "startTracking", "()V", "stopTracking", "p0", "getHighSpeedVideoFpsRangesFor", "(Landroid/app/Activity;I)Landroidx/navigation/NavController;", "getHighSpeedVideoFpsRanges", "Lcom/datadog/android/rum/tracking/ComponentPredicate;", "Ljava/util/WeakHashMap;", "Lcom/datadog/android/rum/tracking/NavigationViewTrackingStrategy$NavControllerFragmentLifecycleCallbacks;", "getHighSpeedVideoSizes", "Ljava/util/WeakHashMap;", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "Landroidx/fragment/app/Fragment;", "Camera2StreamConfigurationMap", "Landroid/app/Activity;", "getOutputMinFrameDuration", "Z", "getInputFormats", "NavControllerFragmentLifecycleCallbacks"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NavigationViewTrackingStrategy extends com.datadog.android.rum.tracking.ActivityLifecycleTrackingStrategy implements com.datadog.android.rum.tracking.ViewTrackingStrategy, androidx.navigation.NavController.OnDestinationChangedListener {
    private android.app.Activity Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.rum.tracking.ComponentPredicate<androidx.fragment.app.Fragment> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.datadog.android.rum.tracking.ComponentPredicate<androidx.view.NavDestination> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private java.util.WeakHashMap<android.app.Activity, com.datadog.android.rum.tracking.NavigationViewTrackingStrategy.NavControllerFragmentLifecycleCallbacks> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final boolean getInputFormats;

    public /* synthetic */ NavigationViewTrackingStrategy(int i, boolean z, com.datadog.android.rum.tracking.AcceptAllNavDestinations acceptAllNavDestinations, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z, (i2 & 4) != 0 ? new com.datadog.android.rum.tracking.AcceptAllNavDestinations() : acceptAllNavDestinations);
    }

    public NavigationViewTrackingStrategy(int i, boolean z, com.datadog.android.rum.tracking.ComponentPredicate<androidx.view.NavDestination> componentPredicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentPredicate, "");
        this.getHighSpeedVideoFpsRanges = i;
        this.getInputFormats = z;
        this.getHighSpeedVideoFpsRangesFor = componentPredicate;
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.WeakHashMap<>();
        this.getHighSpeedVideoSizes = new com.datadog.android.rum.tracking.ComponentPredicate<androidx.fragment.app.Fragment>() { // from class: com.datadog.android.rum.tracking.NavigationViewTrackingStrategy$predicate$1
            @Override // com.datadog.android.rum.tracking.ComponentPredicate
            public final boolean accept(androidx.fragment.app.Fragment component) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(component, "");
                return !androidx.view.fragment.NavHostFragment.class.isAssignableFrom(component.getClass());
            }

            @Override // com.datadog.android.rum.tracking.ComponentPredicate
            public final java.lang.String getViewName(androidx.fragment.app.Fragment component) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(component, "");
                return null;
            }
        };
    }

    @Override // com.datadog.android.rum.tracking.ActivityLifecycleTrackingStrategy, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        super.onActivityStarted(activity);
        this.Camera2StreamConfigurationMap = activity;
        startTracking();
    }

    @Override // com.datadog.android.rum.tracking.ActivityLifecycleTrackingStrategy, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        super.onActivityStopped(activity);
        stopTracking();
        this.Camera2StreamConfigurationMap = null;
    }

    @Override // com.datadog.android.rum.tracking.ActivityLifecycleTrackingStrategy, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
        androidx.view.NavDestination currentDestination;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        super.onActivityPaused(activity);
        com.datadog.android.rum.RumMonitor rumMonitor = (com.datadog.android.rum.RumMonitor) withSdkCore(new kotlin.jvm.functions.Function1<com.datadog.android.api.feature.FeatureSdkCore, com.datadog.android.rum.RumMonitor>() { // from class: com.datadog.android.rum.tracking.NavigationViewTrackingStrategy$onActivityPaused$rumMonitor$1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            public final com.datadog.android.rum.RumMonitor invoke(com.datadog.android.api.feature.FeatureSdkCore featureSdkCore) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureSdkCore, "");
                return com.datadog.android.rum.GlobalRumMonitor.get(featureSdkCore);
            }
        });
        androidx.view.NavController highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(activity, this.getHighSpeedVideoFpsRanges);
        if (highSpeedVideoFpsRangesFor == null || (currentDestination = highSpeedVideoFpsRangesFor.getCurrentDestination()) == null || rumMonitor == null) {
            return;
        }
        com.datadog.android.rum.RumMonitor.DefaultImpls.stopView$default(rumMonitor, currentDestination, null, 2, null);
    }

    @Override // androidx.navigation.NavController.OnDestinationChangedListener
    public final void onDestinationChanged(androidx.view.NavController controller, androidx.view.NavDestination destination, android.os.Bundle arguments) {
        java.util.LinkedHashMap linkedHashMap;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(controller, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
        com.datadog.android.rum.RumMonitor rumMonitor = (com.datadog.android.rum.RumMonitor) withSdkCore(new kotlin.jvm.functions.Function1<com.datadog.android.api.feature.FeatureSdkCore, com.datadog.android.rum.RumMonitor>() { // from class: com.datadog.android.rum.tracking.NavigationViewTrackingStrategy$onDestinationChanged$rumMonitor$1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            public final com.datadog.android.rum.RumMonitor invoke(com.datadog.android.api.feature.FeatureSdkCore featureSdkCore) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureSdkCore, "");
                return com.datadog.android.rum.GlobalRumMonitor.get(featureSdkCore);
            }
        });
        com.datadog.android.rum.tracking.ComponentPredicate<androidx.view.NavDestination> componentPredicate = this.getHighSpeedVideoFpsRangesFor;
        com.datadog.android.api.InternalLogger internalLogger$dd_sdk_android_rum_release = getInternalLogger$dd_sdk_android_rum_release();
        if (componentPredicate.accept(destination)) {
            try {
                if (this.getInputFormats) {
                    linkedHashMap = kotlin.collections.MapsKt.toMutableMap(com.datadog.android.rum.tracking.BundleExtKt.convertToRumViewAttributes(arguments));
                } else {
                    linkedHashMap = new java.util.LinkedHashMap();
                }
                com.datadog.android.internal.attributes.LocalAttributeKt.enrichWithConstantAttribute(linkedHashMap, com.datadog.android.internal.attributes.ViewScopeInstrumentationType.Native.FRAGMENT);
                java.lang.String viewName = this.getHighSpeedVideoFpsRangesFor.getViewName(destination);
                java.lang.String str = viewName;
                if (str == null || kotlin.text.StringsKt.isBlank(str)) {
                    viewName = com.datadog.android.rum.internal.utils.ViewUtilsKt.resolveViewUrl(destination);
                }
                if (rumMonitor != null) {
                    rumMonitor.startView(destination, viewName, linkedHashMap);
                }
            } catch (java.lang.Exception e) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger$dd_sdk_android_rum_release, com.datadog.android.api.InternalLogger.Level.ERROR, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.MAINTAINER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) com.datadog.android.rum.internal.utils.ComponentPredicateExtKt$runIfValid$1.INSTANCE, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            }
        }
    }

    public final void startTracking() {
        final android.app.Activity activity = this.Camera2StreamConfigurationMap;
        if (activity == null) {
            return;
        }
        withSdkCore(new kotlin.jvm.functions.Function1<com.datadog.android.api.feature.FeatureSdkCore, kotlin.Unit>() { // from class: com.datadog.android.rum.tracking.NavigationViewTrackingStrategy$startTracking$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(com.datadog.android.api.feature.FeatureSdkCore featureSdkCore) {
                getHighResolutionOutputSizeshNQ4ISI(featureSdkCore);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighResolutionOutputSizeshNQ4ISI(com.datadog.android.api.feature.FeatureSdkCore featureSdkCore) {
                int i;
                androidx.view.NavController highSpeedVideoFpsRangesFor;
                com.datadog.android.rum.tracking.ComponentPredicate componentPredicate;
                android.app.Activity activity2;
                java.util.WeakHashMap weakHashMap;
                android.app.Activity activity3;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureSdkCore, "");
                com.datadog.android.api.feature.FeatureScope feature = featureSdkCore.getFeature("rum");
                com.datadog.android.rum.internal.RumFeature rumFeature = feature != null ? (com.datadog.android.rum.internal.RumFeature) feature.unwrap() : null;
                android.app.Activity activity4 = activity;
                androidx.fragment.app.FragmentActivity fragmentActivity = activity4 instanceof androidx.fragment.app.FragmentActivity ? (androidx.fragment.app.FragmentActivity) activity4 : null;
                i = this.getHighSpeedVideoFpsRanges;
                highSpeedVideoFpsRangesFor = com.datadog.android.rum.tracking.NavigationViewTrackingStrategy.getHighSpeedVideoFpsRangesFor(activity4, i);
                if (fragmentActivity == null || highSpeedVideoFpsRangesFor == null || rumFeature == null) {
                    return;
                }
                com.datadog.android.rum.tracking.NavigationViewTrackingStrategy$startTracking$1$navControllerFragmentCallbacks$1 navigationViewTrackingStrategy$startTracking$1$navControllerFragmentCallbacks$1 = new kotlin.jvm.functions.Function1<androidx.fragment.app.Fragment, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.datadog.android.rum.tracking.NavigationViewTrackingStrategy$startTracking$1$navControllerFragmentCallbacks$1
                    @Override // kotlin.jvm.functions.Function1
                    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                    public final java.util.Map<java.lang.String, java.lang.Object> invoke(androidx.fragment.app.Fragment fragment) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "");
                        return kotlin.collections.MapsKt.emptyMap();
                    }
                };
                componentPredicate = this.getHighSpeedVideoSizes;
                com.datadog.android.rum.tracking.NavigationViewTrackingStrategy.NavControllerFragmentLifecycleCallbacks navControllerFragmentLifecycleCallbacks = new com.datadog.android.rum.tracking.NavigationViewTrackingStrategy.NavControllerFragmentLifecycleCallbacks(highSpeedVideoFpsRangesFor, navigationViewTrackingStrategy$startTracking$1$navControllerFragmentCallbacks$1, componentPredicate, rumFeature);
                activity2 = this.Camera2StreamConfigurationMap;
                kotlin.jvm.internal.Intrinsics.checkNotNull(activity2, "");
                navControllerFragmentLifecycleCallbacks.register((androidx.fragment.app.FragmentActivity) activity2, (com.datadog.android.api.SdkCore) featureSdkCore);
                weakHashMap = this.getHighResolutionOutputSizeshNQ4ISI;
                activity3 = this.Camera2StreamConfigurationMap;
                weakHashMap.put(activity3, navControllerFragmentLifecycleCallbacks);
                highSpeedVideoFpsRangesFor.addOnDestinationChangedListener(this);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
    }

    public final void stopTracking() {
        androidx.view.NavController highSpeedVideoFpsRangesFor;
        com.datadog.android.rum.tracking.NavigationViewTrackingStrategy.NavControllerFragmentLifecycleCallbacks remove;
        android.app.Activity activity = this.Camera2StreamConfigurationMap;
        if (activity == null || (highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(activity, this.getHighSpeedVideoFpsRanges)) == null) {
            return;
        }
        highSpeedVideoFpsRangesFor.removeOnDestinationChangedListener(this);
        if (!androidx.fragment.app.FragmentActivity.class.isAssignableFrom(activity.getClass()) || (remove = this.getHighResolutionOutputSizeshNQ4ISI.remove(activity)) == null) {
            return;
        }
        remove.unregister((androidx.fragment.app.FragmentActivity) activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0022 A[Catch: IllegalArgumentException | IllegalStateException -> 0x0027, TRY_LEAVE, TryCatch #0 {IllegalArgumentException | IllegalStateException -> 0x0027, blocks: (B:12:0x0005, B:14:0x0014, B:16:0x001a, B:5:0x0022), top: B:11:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static androidx.view.NavController getHighSpeedVideoFpsRangesFor(android.app.Activity activity, int i) {
        androidx.view.NavController navController;
        if (activity instanceof androidx.fragment.app.FragmentActivity) {
            try {
                androidx.fragment.app.Fragment findFragmentById = ((androidx.fragment.app.FragmentActivity) activity).getSupportFragmentManager().findFragmentById(i);
                androidx.view.fragment.NavHostFragment navHostFragment = findFragmentById instanceof androidx.view.fragment.NavHostFragment ? (androidx.view.fragment.NavHostFragment) findFragmentById : null;
                if (navHostFragment != null) {
                    navController = navHostFragment.getNavController();
                    return navController != null ? androidx.view.Navigation.findNavController(activity, i) : navController;
                }
            } catch (java.lang.IllegalArgumentException | java.lang.IllegalStateException unused) {
                return null;
            }
        }
        navController = null;
        if (navController != null) {
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012 \u0010\t\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00060\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/datadog/android/rum/tracking/NavigationViewTrackingStrategy$NavControllerFragmentLifecycleCallbacks;", "Lcom/datadog/android/rum/internal/tracking/AndroidXFragmentLifecycleCallbacks;", "Landroidx/navigation/NavController;", "navController", "Lkotlin/Function1;", "Landroidx/fragment/app/Fragment;", "", "", "", "argumentsProvider", "Lcom/datadog/android/rum/tracking/ComponentPredicate;", "componentPredicate", "Lcom/datadog/android/rum/internal/RumFeature;", "rumFeature", "<init>", "(Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function1;Lcom/datadog/android/rum/tracking/ComponentPredicate;Lcom/datadog/android/rum/internal/RumFeature;)V", "fragment", "resolveKey", "(Landroidx/fragment/app/Fragment;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Landroidx/navigation/NavController;", "getHighSpeedVideoFpsRanges", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NavControllerFragmentLifecycleCallbacks extends com.datadog.android.rum.internal.tracking.AndroidXFragmentLifecycleCallbacks {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.tracking.NavigationViewTrackingStrategy.NavControllerFragmentLifecycleCallbacks.Companion INSTANCE = new com.datadog.android.rum.tracking.NavigationViewTrackingStrategy.NavControllerFragmentLifecycleCallbacks.Companion(null);
        private static final java.lang.Object NO_DESTINATION_FOUND = new java.lang.Object();

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final androidx.view.NavController getHighSpeedVideoFpsRanges;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavControllerFragmentLifecycleCallbacks(androidx.view.NavController navController, kotlin.jvm.functions.Function1<? super androidx.fragment.app.Fragment, ? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> function1, com.datadog.android.rum.tracking.ComponentPredicate<androidx.fragment.app.Fragment> componentPredicate, com.datadog.android.rum.internal.RumFeature rumFeature) {
            super(function1, componentPredicate, rumFeature, new com.datadog.android.rum.NoOpRumMonitor());
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navController, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentPredicate, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumFeature, "");
            this.getHighSpeedVideoFpsRanges = navController;
        }

        @Override // com.datadog.android.rum.internal.tracking.AndroidXFragmentLifecycleCallbacks
        public final java.lang.Object resolveKey(androidx.fragment.app.Fragment fragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "");
            androidx.view.NavDestination currentDestination = this.getHighSpeedVideoFpsRanges.getCurrentDestination();
            return currentDestination == null ? NO_DESTINATION_FOUND : currentDestination;
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/datadog/android/rum/tracking/NavigationViewTrackingStrategy$NavControllerFragmentLifecycleCallbacks$Companion;", "", "<init>", "()V", "NO_DESTINATION_FOUND", "Ljava/lang/Object;", "getNO_DESTINATION_FOUND", "()Ljava/lang/Object;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final java.lang.Object getNO_DESTINATION_FOUND() {
                return com.datadog.android.rum.tracking.NavigationViewTrackingStrategy.NavControllerFragmentLifecycleCallbacks.NO_DESTINATION_FOUND;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }
}
