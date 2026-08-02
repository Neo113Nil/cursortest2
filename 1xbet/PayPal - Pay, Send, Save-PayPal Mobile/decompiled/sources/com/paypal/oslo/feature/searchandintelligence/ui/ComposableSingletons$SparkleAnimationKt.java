package com.paypal.oslo.feature.searchandintelligence.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ComposableSingletons$SparkleAnimationKt {
    public static final com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$SparkleAnimationKt INSTANCE = new com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$SparkleAnimationKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1326581718, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$SparkleAnimationKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$SparkleAnimationKt.$r8$lambda$jmOCIPKjwy_BvZtH9LrzRA7O53s((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$jmOCIPKjwy_BvZtH9LrzRA7O53s(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1326581718, i, -1, "com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$SparkleAnimationKt.lambda$-1326581718.<anonymous> (SparkleAnimation.kt:49)");
            }
            com.paypal.oslo.feature.searchandintelligence.ui.SparkleAnimationKt.SparkleAnimation(null, composer, 0, 1);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getLambda$-1326581718$search_and_intelligence_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m19153getLambda$1326581718$search_and_intelligence_prodRelease() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
