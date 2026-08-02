package com.paypal.oslo.feature.subscriptions.linkagreements.di;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ComposableSingletons$NavigationModuleKt {
    public static final com.paypal.oslo.feature.subscriptions.linkagreements.di.ComposableSingletons$NavigationModuleKt INSTANCE = new com.paypal.oslo.feature.subscriptions.linkagreements.di.ComposableSingletons$NavigationModuleKt();
    private static kotlin.jvm.functions.Function3<com.paypal.oslo.feature.subscriptions.shared.navigation.LinkAgreementHowToBottomSheetDestination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1409054408, false, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.di.ComposableSingletons$NavigationModuleKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return com.paypal.oslo.feature.subscriptions.linkagreements.di.ComposableSingletons$NavigationModuleKt.$r8$lambda$I3jwfFk0rs0s_uuvjC7svvcRtnk((com.paypal.oslo.feature.subscriptions.shared.navigation.LinkAgreementHowToBottomSheetDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$I3jwfFk0rs0s_uuvjC7svvcRtnk(com.paypal.oslo.feature.subscriptions.shared.navigation.LinkAgreementHowToBottomSheetDestination linkAgreementHowToBottomSheetDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkAgreementHowToBottomSheetDestination, "");
        if ((i & 6) == 0) {
            i |= composer.changed(linkAgreementHowToBottomSheetDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1409054408, i, -1, "com.paypal.oslo.feature.subscriptions.linkagreements.di.ComposableSingletons$NavigationModuleKt.lambda$-1409054408.<anonymous> (NavigationModule.kt:143)");
            }
            com.paypal.oslo.feature.subscriptions.linkagreements.howto.ui.HowToLinkContentKt.HowToLinkContent(com.paypal.oslo.feature.subscriptions.shared.domain.AgreementTypeMapperKt.agreementTypeFromString(linkAgreementHowToBottomSheetDestination.getAgreementType()), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), composer, 48, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getLambda$-1409054408$subscriptions_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function3<com.paypal.oslo.feature.subscriptions.shared.navigation.LinkAgreementHowToBottomSheetDestination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m19894getLambda$1409054408$subscriptions_prodRelease() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
