package com.paypal.oslo.feature.revolvingcreditacquisition.di;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ComposableSingletons$NavigationModuleKt {
    public static final com.paypal.oslo.feature.revolvingcreditacquisition.di.ComposableSingletons$NavigationModuleKt INSTANCE = new com.paypal.oslo.feature.revolvingcreditacquisition.di.ComposableSingletons$NavigationModuleKt();
    private static kotlin.jvm.functions.Function3<com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.AcquisitionNativeDestination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRanges = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(109696829, false, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.ComposableSingletons$NavigationModuleKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return com.paypal.oslo.feature.revolvingcreditacquisition.di.ComposableSingletons$NavigationModuleKt.$r8$lambda$_vdGy1lyRj3yUkciHz8nTroxC6Q((com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.AcquisitionNativeDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$_vdGy1lyRj3yUkciHz8nTroxC6Q(com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.AcquisitionNativeDestination acquisitionNativeDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(acquisitionNativeDestination, "");
        if ((i & 6) == 0) {
            i |= composer.changed(acquisitionNativeDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(109696829, i, -1, "com.paypal.oslo.feature.revolvingcreditacquisition.di.ComposableSingletons$NavigationModuleKt.lambda$109696829.<anonymous> (NavigationModule.kt:240)");
            }
            com.paypal.oslo.feature.revolvingcreditacquisition.ui.p002native.AcquisitionNativeScreenKt.AcquisitionNativeScreen(acquisitionNativeDestination.getNavigationArgs(), null, composer, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function3<com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.AcquisitionNativeDestination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$109696829$revolvingcredit_acquisition_prodRelease() {
        return getHighSpeedVideoFpsRanges;
    }
}
