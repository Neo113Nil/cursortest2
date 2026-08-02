package com.paypal.oslo.feature.p2p.ui.components;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ComposableSingletons$P2pTooltipBannerKt {
    public static final com.paypal.oslo.feature.p2p.ui.components.ComposableSingletons$P2pTooltipBannerKt INSTANCE = new com.paypal.oslo.feature.p2p.ui.components.ComposableSingletons$P2pTooltipBannerKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1038788415, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.components.ComposableSingletons$P2pTooltipBannerKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.p2p.ui.components.ComposableSingletons$P2pTooltipBannerKt.m17253$r8$lambda$aGLsiniTiq1IU78qKaFjkJihJQ((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-915884478, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.components.ComposableSingletons$P2pTooltipBannerKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.p2p.ui.components.ComposableSingletons$P2pTooltipBannerKt.m17252$r8$lambda$S8mhFF39MLyKUo0_w4u0qGmJ9U((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    /* renamed from: $r8$lambda$S8m-hFF39MLyKUo0_w4u0qGmJ9U, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17252$r8$lambda$S8mhFF39MLyKUo0_w4u0qGmJ9U(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-915884478, i, -1, "com.paypal.oslo.feature.p2p.ui.components.ComposableSingletons$P2pTooltipBannerKt.lambda$-915884478.<anonymous> (P2pTooltipBanner.kt:526)");
            }
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4("This is a tooltip on top", null, null, null, null, null, false, 0, 0, null, null, composer, 6, 0, 2046);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$aGLsiniTiq-1IU78qKaFjkJihJQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17253$r8$lambda$aGLsiniTiq1IU78qKaFjkJihJQ(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1038788415, i, -1, "com.paypal.oslo.feature.p2p.ui.components.ComposableSingletons$P2pTooltipBannerKt.lambda$-1038788415.<anonymous> (P2pTooltipBanner.kt:520)");
            }
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.components.ComposableSingletons$P2pTooltipBannerKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue, "Click me", null, null, null, null, null, false, false, composer, 54, androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_CURVE_FIT);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getLambda$-915884478$p2p_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m17255getLambda$915884478$p2p_prodRelease() {
        return getHighSpeedVideoFpsRangesFor;
    }

    /* renamed from: getLambda$-1038788415$p2p_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m17254getLambda$1038788415$p2p_prodRelease() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
