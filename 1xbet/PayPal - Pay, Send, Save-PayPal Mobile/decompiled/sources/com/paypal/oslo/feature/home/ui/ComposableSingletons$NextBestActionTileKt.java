package com.paypal.oslo.feature.home.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ComposableSingletons$NextBestActionTileKt {
    public static final com.paypal.oslo.feature.home.ui.ComposableSingletons$NextBestActionTileKt INSTANCE = new com.paypal.oslo.feature.home.ui.ComposableSingletons$NextBestActionTileKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1558966442, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.home.ui.ComposableSingletons$NextBestActionTileKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.home.ui.ComposableSingletons$NextBestActionTileKt.$r8$lambda$NclkR6L8LUJbZ8Ft7AUhYk0nA8g((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$NclkR6L8LUJbZ8Ft7AUhYk0nA8g(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1558966442, i, -1, "com.paypal.oslo.feature.home.ui.ComposableSingletons$NextBestActionTileKt.lambda$-1558966442.<anonymous> (NextBestActionTile.kt:107)");
            }
            com.paypal.oslo.feature.home.domain.model.NextBestAction createActionItem$home_prodRelease$default = com.paypal.oslo.feature.home.ui.preview.NextBestActionPreviews.createActionItem$home_prodRelease$default(com.paypal.oslo.feature.home.ui.preview.NextBestActionPreviews.INSTANCE, null, null, null, null, null, 31, null);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.home.ui.ComposableSingletons$NextBestActionTileKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.home.ui.NextBestActionTileKt.NextBestActionTile(createActionItem$home_prodRelease$default, (kotlin.jvm.functions.Function0) rememberedValue, null, composer, com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext.$stable | 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getLambda$-1558966442$home_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m14895getLambda$1558966442$home_prodRelease() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
