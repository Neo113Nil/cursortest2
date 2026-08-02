package com.paypal.oslo.feature.home.ui.components.nbacarousel;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ComposableSingletons$OfferNBAContainerKt {
    public static final com.paypal.oslo.feature.home.ui.components.nbacarousel.ComposableSingletons$OfferNBAContainerKt INSTANCE = new com.paypal.oslo.feature.home.ui.components.nbacarousel.ComposableSingletons$OfferNBAContainerKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRanges = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-327896957, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.home.ui.components.nbacarousel.ComposableSingletons$OfferNBAContainerKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.home.ui.components.nbacarousel.ComposableSingletons$OfferNBAContainerKt.$r8$lambda$fp3m1XdqUXrB5Lw45jS3tS7hjkg((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$fp3m1XdqUXrB5Lw45jS3tS7hjkg(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-327896957, i, -1, "com.paypal.oslo.feature.home.ui.components.nbacarousel.ComposableSingletons$OfferNBAContainerKt.lambda$-327896957.<anonymous> (OfferNBAContainer.kt:171)");
            }
            com.paypal.oslo.feature.home.domain.model.Section section = new com.paypal.oslo.feature.home.domain.model.Section("nba-preview", com.paypal.oslo.feature.home.domain.model.SectionTypes.OFFER_NBA, "Get the most <strong>out of PayPal</strong>", (java.lang.String) null, com.paypal.oslo.feature.home.ui.preview.OfferNBAPreviews.INSTANCE.createSampleOfferNBAItems$home_prodRelease(), (java.lang.String) null, (java.lang.String) null, (com.paypal.oslo.feature.home.domain.model.SectionInstrumentation) null, 200, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.home.ui.components.nbacarousel.ComposableSingletons$OfferNBAContainerKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.home.ui.components.nbacarousel.ComposableSingletons$OfferNBAContainerKt.$r8$lambda$x2p_SFO1JIuHBpRUGs5nO0gMwrQ((com.paypal.oslo.feature.home.domain.model.OfferNBAItem) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.home.ui.components.nbacarousel.OfferNBAContainerKt.OfferNBAContainer(section, (kotlin.jvm.functions.Function1) rememberedValue, null, composer, 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$x2p_SFO1JIuHBpRUGs5nO0gMwrQ(com.paypal.oslo.feature.home.domain.model.OfferNBAItem offerNBAItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerNBAItem, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getLambda$-327896957$home_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m14967getLambda$327896957$home_prodRelease() {
        return getHighSpeedVideoFpsRanges;
    }
}
