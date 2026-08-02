package com.paypal.oslo.feature.moneymovement.ui.summary;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ComposableSingletons$SummaryKt {
    public static final com.paypal.oslo.feature.moneymovement.ui.summary.ComposableSingletons$SummaryKt INSTANCE = new com.paypal.oslo.feature.moneymovement.ui.summary.ComposableSingletons$SummaryKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1358224682, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.summary.ComposableSingletons$SummaryKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.moneymovement.ui.summary.ComposableSingletons$SummaryKt.$r8$lambda$OOCCeTtdLsGEyVFTO67ysOBmDHI((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1698576192, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.summary.ComposableSingletons$SummaryKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.moneymovement.ui.summary.ComposableSingletons$SummaryKt.m15692$r8$lambda$bx6TPtQrL3fkqR4VyoL1dFSs2I((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$OOCCeTtdLsGEyVFTO67ysOBmDHI(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1358224682, i, -1, "com.paypal.oslo.feature.moneymovement.ui.summary.ComposableSingletons$SummaryKt.lambda$-1358224682.<anonymous> (Summary.kt:613)");
            }
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4("Summary Title Placeholder", null, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.TitleMedium.INSTANCE, composer, 6, 6, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$bx6TPtQrL3fkqR4VyoL1-dFSs2I, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15692$r8$lambda$bx6TPtQrL3fkqR4VyoL1dFSs2I(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1698576192, i, -1, "com.paypal.oslo.feature.moneymovement.ui.summary.ComposableSingletons$SummaryKt.lambda$-1698576192.<anonymous> (Summary.kt:626)");
            }
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4("Summary Body Placeholder", null, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer, 6, 6, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getLambda$-1698576192$money_movement_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m15694getLambda$1698576192$money_movement_prodRelease() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    /* renamed from: getLambda$-1358224682$money_movement_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m15693getLambda$1358224682$money_movement_prodRelease() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
