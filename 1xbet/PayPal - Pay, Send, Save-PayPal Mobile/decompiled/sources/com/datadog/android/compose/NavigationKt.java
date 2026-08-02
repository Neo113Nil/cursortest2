package com.datadog.android.compose;

@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a9\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u000b\u001a9\u0010\f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u0003¢\u0006\u0002\u0010\u000b\u001a9\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\u0005X\u008a\u0084\u0002²\u0006\u0010\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u008a\u0084\u0002"}, d2 = {"InstrumentedNavigationViewTrackingEffect", "", "navController", "Landroidx/navigation/NavController;", "trackArguments", "", "destinationPredicate", "Lcom/datadog/android/rum/tracking/ComponentPredicate;", "Landroidx/navigation/NavDestination;", "sdkCore", "Lcom/datadog/android/api/SdkCore;", "(Landroidx/navigation/NavController;ZLcom/datadog/android/rum/tracking/ComponentPredicate;Lcom/datadog/android/api/SdkCore;Landroidx/compose/runtime/Composer;II)V", "InternalNavigationViewTrackingStrategy", "NavigationViewTrackingEffect", "dd-sdk-android-compose_release", "currentTrackArguments", "currentDestinationPredicate"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NavigationKt {
    public static final void NavigationViewTrackingEffect(androidx.view.NavController navController, boolean z, com.datadog.android.rum.tracking.ComponentPredicate<androidx.view.NavDestination> componentPredicate, com.datadog.android.api.SdkCore sdkCore, androidx.compose.runtime.Composer composer, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navController, "");
        composer.startReplaceableGroup(-1363672181);
        boolean z2 = (i2 & 2) != 0 ? true : z;
        if ((i2 & 4) != 0) {
            componentPredicate = new com.datadog.android.rum.tracking.AcceptAllNavDestinations();
        }
        com.datadog.android.rum.tracking.ComponentPredicate<androidx.view.NavDestination> componentPredicate2 = componentPredicate;
        if ((i2 & 8) != 0) {
            sdkCore = com.datadog.android.Datadog.getInstance$default(null, 1, null);
        }
        com.datadog.android.api.SdkCore sdkCore2 = sdkCore;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1363672181, i, -1, "com.datadog.android.compose.NavigationViewTrackingEffect (Navigation.kt:46)");
        }
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        composer.startReplaceableGroup(-685846387);
        boolean changedInstance = composer.changedInstance(sdkCore2);
        com.datadog.android.compose.NavigationKt$NavigationViewTrackingEffect$1$1 rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new com.datadog.android.compose.NavigationKt$NavigationViewTrackingEffect$1$1(sdkCore2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, composer, 6);
        getHighResolutionOutputSizeshNQ4ISI(navController, z2, componentPredicate2, sdkCore2, composer, i & 8190);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    public static final void InstrumentedNavigationViewTrackingEffect(androidx.view.NavController navController, boolean z, com.datadog.android.rum.tracking.ComponentPredicate<androidx.view.NavDestination> componentPredicate, com.datadog.android.api.SdkCore sdkCore, androidx.compose.runtime.Composer composer, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navController, "");
        composer.startReplaceableGroup(1029284197);
        boolean z2 = (i2 & 2) != 0 ? true : z;
        if ((i2 & 4) != 0) {
            componentPredicate = new com.datadog.android.rum.tracking.AcceptAllNavDestinations();
        }
        com.datadog.android.rum.tracking.ComponentPredicate<androidx.view.NavDestination> componentPredicate2 = componentPredicate;
        if ((i2 & 8) != 0) {
            sdkCore = com.datadog.android.Datadog.getInstance$default(null, 1, null);
        }
        com.datadog.android.api.SdkCore sdkCore2 = sdkCore;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1029284197, i, -1, "com.datadog.android.compose.InstrumentedNavigationViewTrackingEffect (Navigation.kt:80)");
        }
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        composer.startReplaceableGroup(-85176494);
        boolean changedInstance = composer.changedInstance(sdkCore2);
        com.datadog.android.compose.NavigationKt$InstrumentedNavigationViewTrackingEffect$1$1 rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new com.datadog.android.compose.NavigationKt$InstrumentedNavigationViewTrackingEffect$1$1(sdkCore2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, composer, 6);
        getHighResolutionOutputSizeshNQ4ISI(navController, z2, componentPredicate2, sdkCore2, composer, i & 8190);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    private static final void getHighResolutionOutputSizeshNQ4ISI(final androidx.view.NavController navController, boolean z, com.datadog.android.rum.tracking.ComponentPredicate<androidx.view.NavDestination> componentPredicate, final com.datadog.android.api.SdkCore sdkCore, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(1103673324);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1103673324, i, -1, "com.datadog.android.compose.InternalNavigationViewTrackingStrategy (Navigation.kt:104)");
        }
        final androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(java.lang.Boolean.valueOf(z), composer, (i >> 3) & 14);
        final androidx.compose.runtime.State rememberUpdatedState2 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(componentPredicate, composer, (i >> 6) & 14);
        final androidx.view.LifecycleOwner lifecycleOwner = (androidx.view.LifecycleOwner) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        composer.startReplaceableGroup(-171049608);
        boolean changed = composer.changed(rememberUpdatedState);
        boolean changed2 = composer.changed(rememberUpdatedState2);
        boolean changedInstance = composer.changedInstance(navController);
        boolean changedInstance2 = composer.changedInstance(sdkCore);
        boolean changedInstance3 = composer.changedInstance(lifecycleOwner);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((changed | changed2 | changedInstance | changedInstance2 | changedInstance3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.runtime.DisposableEffectScope, androidx.compose.runtime.DisposableEffectResult>() { // from class: com.datadog.android.compose.NavigationKt$InternalNavigationViewTrackingStrategy$1$1
                @Override // kotlin.jvm.functions.Function1
                /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                public final androidx.compose.runtime.DisposableEffectResult invoke(androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
                    boolean booleanValue;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disposableEffectScope, "");
                    booleanValue = ((java.lang.Boolean) rememberUpdatedState.getValue()).booleanValue();
                    final com.datadog.android.compose.internal.ComposeNavigationObserver composeNavigationObserver = new com.datadog.android.compose.internal.ComposeNavigationObserver(booleanValue, com.datadog.android.compose.NavigationKt.access$InternalNavigationViewTrackingStrategy$lambda$3(rememberUpdatedState2), androidx.view.NavController.this, com.datadog.android.rum.GlobalRumMonitor.get(sdkCore));
                    lifecycleOwner.getLifecycle().addObserver(composeNavigationObserver);
                    final androidx.view.LifecycleOwner lifecycleOwner2 = lifecycleOwner;
                    return new androidx.compose.runtime.DisposableEffectResult() { // from class: com.datadog.android.compose.NavigationKt$InternalNavigationViewTrackingStrategy$1$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public final void dispose() {
                            androidx.view.LifecycleOwner.this.getLifecycle().removeObserver(composeNavigationObserver);
                            composeNavigationObserver.onDispose$dd_sdk_android_compose_release();
                        }
                    };
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        androidx.compose.runtime.EffectsKt.DisposableEffect(lifecycleOwner, navController, (kotlin.jvm.functions.Function1) rememberedValue, composer, (i << 3) & 112);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    public static final /* synthetic */ com.datadog.android.rum.tracking.ComponentPredicate access$InternalNavigationViewTrackingStrategy$lambda$3(androidx.compose.runtime.State state) {
        return (com.datadog.android.rum.tracking.ComponentPredicate) state.getValue();
    }
}
