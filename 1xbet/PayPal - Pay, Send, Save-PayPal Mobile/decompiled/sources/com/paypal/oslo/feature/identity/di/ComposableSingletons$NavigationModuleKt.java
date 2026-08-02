package com.paypal.oslo.feature.identity.di;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ComposableSingletons$NavigationModuleKt {
    public static final com.paypal.oslo.feature.identity.di.ComposableSingletons$NavigationModuleKt INSTANCE = new com.paypal.oslo.feature.identity.di.ComposableSingletons$NavigationModuleKt();
    private static kotlin.jvm.functions.Function3<com.paypal.oslo.feature.identity.api.navigation.HowPasskeysWorkBottomSheetDestination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-81359344, false, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.identity.di.ComposableSingletons$NavigationModuleKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return com.paypal.oslo.feature.identity.di.ComposableSingletons$NavigationModuleKt.m15131$r8$lambda$2EHgMHJGqtBGbNGqfzNXNOnxRs((com.paypal.oslo.feature.identity.api.navigation.HowPasskeysWorkBottomSheetDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
        }
    });
    private static kotlin.jvm.functions.Function3<com.paypal.oslo.feature.identity.challenges.shared.navigation.ContactUsDestination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1936298095, false, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.identity.di.ComposableSingletons$NavigationModuleKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function3
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return com.paypal.oslo.feature.identity.di.ComposableSingletons$NavigationModuleKt.$r8$lambda$knmrznGcTyQPUJMUue2M4X9M82o((com.paypal.oslo.feature.identity.challenges.shared.navigation.ContactUsDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
        }
    });

    /* renamed from: $r8$lambda$2EHgMHJG-qtBGbNGqfzNXNOnxRs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15131$r8$lambda$2EHgMHJGqtBGbNGqfzNXNOnxRs(com.paypal.oslo.feature.identity.api.navigation.HowPasskeysWorkBottomSheetDestination howPasskeysWorkBottomSheetDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(howPasskeysWorkBottomSheetDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-81359344, i, -1, "com.paypal.oslo.feature.identity.di.ComposableSingletons$NavigationModuleKt.lambda$-81359344.<anonymous> (NavigationModule.kt:378)");
        }
        com.paypal.oslo.feature.identity.passkey.management.ui.HowPasskeysWorkBottomSheetKt.HowPasskeysWorkBottomSheet(null, composer, 0, 1);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$knmrznGcTyQPUJMUue2M4X9M82o(com.paypal.oslo.feature.identity.challenges.shared.navigation.ContactUsDestination contactUsDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactUsDestination, "");
        if ((i & 6) == 0) {
            i |= composer.changed(contactUsDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1936298095, i, -1, "com.paypal.oslo.feature.identity.di.ComposableSingletons$NavigationModuleKt.lambda$-1936298095.<anonymous> (NavigationModule.kt:431)");
            }
            com.paypal.oslo.feature.identity.challenges.shared.ui.ContactUsScreenKt.ContactUsScreen(contactUsDestination.getErrorType(), null, composer, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getLambda$-81359344$identity_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function3<com.paypal.oslo.feature.identity.api.navigation.HowPasskeysWorkBottomSheetDestination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m15133getLambda$81359344$identity_prodRelease() {
        return getHighSpeedVideoFpsRangesFor;
    }

    /* renamed from: getLambda$-1936298095$identity_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function3<com.paypal.oslo.feature.identity.challenges.shared.navigation.ContactUsDestination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m15132getLambda$1936298095$identity_prodRelease() {
        return Camera2StreamConfigurationMap;
    }
}
