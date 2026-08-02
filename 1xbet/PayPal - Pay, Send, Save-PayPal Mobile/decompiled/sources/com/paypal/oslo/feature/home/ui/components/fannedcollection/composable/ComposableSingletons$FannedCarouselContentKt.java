package com.paypal.oslo.feature.home.ui.components.fannedcollection.composable;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ComposableSingletons$FannedCarouselContentKt {
    public static final com.paypal.oslo.feature.home.ui.components.fannedcollection.composable.ComposableSingletons$FannedCarouselContentKt INSTANCE = new com.paypal.oslo.feature.home.ui.components.fannedcollection.composable.ComposableSingletons$FannedCarouselContentKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(140645003, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.home.ui.components.fannedcollection.composable.ComposableSingletons$FannedCarouselContentKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.home.ui.components.fannedcollection.composable.ComposableSingletons$FannedCarouselContentKt.$r8$lambda$3mTurJh72kKLYotXuaRdjSQTm3M((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1797911436, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.home.ui.components.fannedcollection.composable.ComposableSingletons$FannedCarouselContentKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.home.ui.components.fannedcollection.composable.ComposableSingletons$FannedCarouselContentKt.$r8$lambda$kooatvIHymRkMwVu7Xa6C6PL6Nk((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$3mTurJh72kKLYotXuaRdjSQTm3M(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(140645003, i, -1, "com.paypal.oslo.feature.home.ui.components.fannedcollection.composable.ComposableSingletons$FannedCarouselContentKt.lambda$140645003.<anonymous> (FannedCarouselContent.kt:167)");
            }
            com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition.Middle middle = new com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition.Middle();
            com.paypal.oslo.feature.home.domain.model.FannedCarouselItemData fannedCarouselItemData = (com.paypal.oslo.feature.home.domain.model.FannedCarouselItemData) kotlin.collections.CollectionsKt.first((java.util.List) com.paypal.oslo.feature.home.ui.preview.FannedCarouselPreviews.INSTANCE.createFannedCarouselDataItems$home_prodRelease(1));
            androidx.compose.ui.Modifier m1745width3ABfNKs = androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(middle.getHeight())), androidx.compose.ui.unit.Dp.m8601constructorimpl(middle.getWidth()));
            com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition.Middle middle2 = middle;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.home.ui.components.fannedcollection.composable.ComposableSingletons$FannedCarouselContentKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.home.ui.components.fannedcollection.composable.FannedCarouselContentKt.FannedCarouselContent(fannedCarouselItemData, middle2, (kotlin.jvm.functions.Function0) rememberedValue, m1745width3ABfNKs, composer, 384, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$kooatvIHymRkMwVu7Xa6C6PL6Nk(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1797911436, i, -1, "com.paypal.oslo.feature.home.ui.components.fannedcollection.composable.ComposableSingletons$FannedCarouselContentKt.lambda$1797911436.<anonymous> (FannedCarouselContent.kt:184)");
            }
            com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition.LeftOuter leftOuter = new com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition.LeftOuter(false, 1, null);
            com.paypal.oslo.feature.home.domain.model.FannedCarouselItemData fannedCarouselItemData = (com.paypal.oslo.feature.home.domain.model.FannedCarouselItemData) kotlin.collections.CollectionsKt.first((java.util.List) com.paypal.oslo.feature.home.ui.preview.FannedCarouselPreviews.INSTANCE.createFannedCarouselDataItems$home_prodRelease(1));
            androidx.compose.ui.Modifier m1745width3ABfNKs = androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(leftOuter.getHeight())), androidx.compose.ui.unit.Dp.m8601constructorimpl(leftOuter.getWidth()));
            com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselPosition.LeftOuter leftOuter2 = leftOuter;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.home.ui.components.fannedcollection.composable.ComposableSingletons$FannedCarouselContentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.home.ui.components.fannedcollection.composable.FannedCarouselContentKt.FannedCarouselContent(fannedCarouselItemData, leftOuter2, (kotlin.jvm.functions.Function0) rememberedValue, m1745width3ABfNKs, composer, 384, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$1797911436$home_prodRelease() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$140645003$home_prodRelease() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
