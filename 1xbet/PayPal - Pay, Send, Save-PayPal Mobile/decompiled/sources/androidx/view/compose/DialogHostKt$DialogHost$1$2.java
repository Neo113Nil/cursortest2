package androidx.view.compose;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class DialogHostKt$DialogHost$1$2 implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ androidx.view.NavBackStackEntry Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.view.compose.DialogNavigator getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.saveable.SaveableStateHolder getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.snapshots.SnapshotStateList<androidx.view.NavBackStackEntry> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.navigation.compose.DialogNavigator.Destination getHighSpeedVideoSizes;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        androidx.compose.runtime.Composer composer2 = composer;
        int intValue = num.intValue();
        if ((intValue & 3) != 2 || !composer2.getSkipping()) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1129586364, intValue, -1, "androidx.navigation.compose.DialogHost.<anonymous>.<anonymous> (DialogHost.kt:55)");
            }
            androidx.view.NavBackStackEntry navBackStackEntry = this.Camera2StreamConfigurationMap;
            boolean changedInstance = composer2.changedInstance(navBackStackEntry);
            boolean changedInstance2 = composer2.changedInstance(this.getHighResolutionOutputSizeshNQ4ISI);
            final androidx.compose.runtime.snapshots.SnapshotStateList<androidx.view.NavBackStackEntry> snapshotStateList = this.getHighSpeedVideoFpsRangesFor;
            final androidx.view.NavBackStackEntry navBackStackEntry2 = this.Camera2StreamConfigurationMap;
            final androidx.view.compose.DialogNavigator dialogNavigator = this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.Object rememberedValue = composer2.rememberedValue();
            if ((changedInstance | changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.navigation.compose.DialogHostKt$DialogHost$1$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.view.compose.DialogHostKt$DialogHost$1$2.getHighSpeedVideoFpsRanges(androidx.compose.runtime.snapshots.SnapshotStateList.this, navBackStackEntry2, dialogNavigator);
                    }
                };
                composer2.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.DisposableEffect(navBackStackEntry, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue, composer2, 0);
            androidx.view.NavBackStackEntry navBackStackEntry3 = this.Camera2StreamConfigurationMap;
            androidx.compose.runtime.saveable.SaveableStateHolder saveableStateHolder = this.getHighSpeedVideoFpsRanges;
            final androidx.navigation.compose.DialogNavigator.Destination destination = this.getHighSpeedVideoSizes;
            final androidx.view.NavBackStackEntry navBackStackEntry4 = this.Camera2StreamConfigurationMap;
            androidx.view.compose.NavBackStackEntryProviderKt.LocalOwnersProvider(navBackStackEntry3, saveableStateHolder, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-497631156, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.navigation.compose.DialogHostKt$DialogHost$1$2.2
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num2) {
                    androidx.compose.runtime.Composer composer4 = composer3;
                    int intValue2 = num2.intValue();
                    if ((intValue2 & 3) != 2 || !composer4.getSkipping()) {
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-497631156, intValue2, -1, "androidx.navigation.compose.DialogHost.<anonymous>.<anonymous>.<anonymous> (DialogHost.kt:66)");
                        }
                        androidx.navigation.compose.DialogNavigator.Destination.this.getContent$navigation_compose_release().invoke(navBackStackEntry4, composer4, 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer4.skipToGroupEnd();
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }, composer2, 54), composer2, 384);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer2.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.runtime.DisposableEffectResult getHighSpeedVideoFpsRanges(final androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList, final androidx.view.NavBackStackEntry navBackStackEntry, final androidx.view.compose.DialogNavigator dialogNavigator) {
        snapshotStateList.add(navBackStackEntry);
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.navigation.compose.DialogHostKt$DialogHost$1$2$invoke$lambda$2$lambda$1$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                androidx.view.compose.DialogNavigator.this.onTransitionComplete$navigation_compose_release(navBackStackEntry);
                snapshotStateList.remove(navBackStackEntry);
            }
        };
    }

    DialogHostKt$DialogHost$1$2(androidx.view.NavBackStackEntry navBackStackEntry, androidx.view.compose.DialogNavigator dialogNavigator, androidx.compose.runtime.saveable.SaveableStateHolder saveableStateHolder, androidx.compose.runtime.snapshots.SnapshotStateList<androidx.view.NavBackStackEntry> snapshotStateList, androidx.navigation.compose.DialogNavigator.Destination destination) {
        this.Camera2StreamConfigurationMap = navBackStackEntry;
        this.getHighResolutionOutputSizeshNQ4ISI = dialogNavigator;
        this.getHighSpeedVideoFpsRanges = saveableStateHolder;
        this.getHighSpeedVideoFpsRangesFor = snapshotStateList;
        this.getHighSpeedVideoSizes = destination;
    }
}
