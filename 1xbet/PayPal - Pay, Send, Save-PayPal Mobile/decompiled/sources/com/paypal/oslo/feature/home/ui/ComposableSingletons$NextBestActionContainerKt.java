package com.paypal.oslo.feature.home.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ComposableSingletons$NextBestActionContainerKt {
    public static final com.paypal.oslo.feature.home.ui.ComposableSingletons$NextBestActionContainerKt INSTANCE = new com.paypal.oslo.feature.home.ui.ComposableSingletons$NextBestActionContainerKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1491860048, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.home.ui.ComposableSingletons$NextBestActionContainerKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.home.ui.ComposableSingletons$NextBestActionContainerKt.$r8$lambda$5IGL96GWoZF6Mkmkzv38bVLMaMs((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$0xDbvecdbHKP3S8iU34JheJCFQo(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5IGL96GWoZF6Mkmkzv38bVLMaMs(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1491860048, i, -1, "com.paypal.oslo.feature.home.ui.ComposableSingletons$NextBestActionContainerKt.lambda$1491860048.<anonymous> (NextBestActionContainer.kt:113)");
            }
            com.paypal.oslo.feature.home.domain.model.Section createSection$home_prodRelease$default = com.paypal.oslo.feature.home.ui.preview.SectionPreviews.createSection$home_prodRelease$default(com.paypal.oslo.feature.home.ui.preview.SectionPreviews.INSTANCE, "preview-next-best-action", null, "Score bonus", "PayPal+ points", com.paypal.oslo.feature.home.ui.preview.NextBestActionPreviews.createSampleActionItems$home_prodRelease$default(com.paypal.oslo.feature.home.ui.preview.NextBestActionPreviews.INSTANCE, 0, 1, null), "View All", 2, null);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.home.ui.ComposableSingletons$NextBestActionContainerKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.home.ui.ComposableSingletons$NextBestActionContainerKt.$r8$lambda$0xDbvecdbHKP3S8iU34JheJCFQo((java.lang.String) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.home.ui.ComposableSingletons$NextBestActionContainerKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.feature.home.ui.NextBestActionContainerKt.NextBestActionContainer(createSection$home_prodRelease$default, function1, (kotlin.jvm.functions.Function0) rememberedValue2, null, composer, 432, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$1491860048$home_prodRelease() {
        return Camera2StreamConfigurationMap;
    }
}
