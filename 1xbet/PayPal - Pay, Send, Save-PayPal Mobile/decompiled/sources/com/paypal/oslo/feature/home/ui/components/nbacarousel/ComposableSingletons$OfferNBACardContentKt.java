package com.paypal.oslo.feature.home.ui.components.nbacarousel;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ComposableSingletons$OfferNBACardContentKt {
    public static final com.paypal.oslo.feature.home.ui.components.nbacarousel.ComposableSingletons$OfferNBACardContentKt INSTANCE = new com.paypal.oslo.feature.home.ui.components.nbacarousel.ComposableSingletons$OfferNBACardContentKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-129084803, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.home.ui.components.nbacarousel.ComposableSingletons$OfferNBACardContentKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.home.ui.components.nbacarousel.ComposableSingletons$OfferNBACardContentKt.m14965$r8$lambda$6_EmSYP3UrPp49gFusULXslQkQ((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    /* renamed from: $r8$lambda$6_EmSYP3UrPp49gFusULXsl-QkQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14965$r8$lambda$6_EmSYP3UrPp49gFusULXslQkQ(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-129084803, i, -1, "com.paypal.oslo.feature.home.ui.components.nbacarousel.ComposableSingletons$OfferNBACardContentKt.lambda$-129084803.<anonymous> (OfferNBACardContent.kt:76)");
            }
            com.paypal.oslo.feature.home.ui.components.nbacarousel.OfferNBACardContentKt.OfferNBACardContent(com.paypal.oslo.feature.home.ui.preview.OfferNBAPreviews.INSTANCE.createCashbackMastercardOffer$home_prodRelease(), null, composer, com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext.$stable, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getLambda$-129084803$home_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m14966getLambda$129084803$home_prodRelease() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
