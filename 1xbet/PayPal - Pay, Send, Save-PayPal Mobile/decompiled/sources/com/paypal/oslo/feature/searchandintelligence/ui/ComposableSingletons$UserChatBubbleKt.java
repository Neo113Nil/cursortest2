package com.paypal.oslo.feature.searchandintelligence.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ComposableSingletons$UserChatBubbleKt {
    public static final com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$UserChatBubbleKt INSTANCE = new com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$UserChatBubbleKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRanges = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1675598824, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$UserChatBubbleKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$UserChatBubbleKt.$r8$lambda$9jhcUb3XXdMJPYjdbqVvba2EFQY((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$9jhcUb3XXdMJPYjdbqVvba2EFQY(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1675598824, i, -1, "com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$UserChatBubbleKt.lambda$1675598824.<anonymous> (UserChatBubble.kt:77)");
            }
            com.paypal.oslo.feature.searchandintelligence.ui.UserChatBubbleKt.UserChatBubble("What's my account balance?", androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16()), 0, composer, 6, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$1675598824$search_and_intelligence_prodRelease() {
        return getHighSpeedVideoFpsRanges;
    }
}
