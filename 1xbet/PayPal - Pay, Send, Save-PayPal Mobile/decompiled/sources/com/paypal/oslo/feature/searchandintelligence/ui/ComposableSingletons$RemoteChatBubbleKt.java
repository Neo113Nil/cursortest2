package com.paypal.oslo.feature.searchandintelligence.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ComposableSingletons$RemoteChatBubbleKt {
    public static final com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$RemoteChatBubbleKt INSTANCE = new com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$RemoteChatBubbleKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1316286094, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$RemoteChatBubbleKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$RemoteChatBubbleKt.$r8$lambda$mdS6p4k4_IUfTtEEmopkXj5IG3w((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$mdS6p4k4_IUfTtEEmopkXj5IG3w(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1316286094, i, -1, "com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$RemoteChatBubbleKt.lambda$-1316286094.<anonymous> (RemoteChatBubble.kt:54)");
            }
            com.paypal.oslo.feature.searchandintelligence.ui.RemoteChatBubbleKt.RemoteChatBubble("Your current balance is $1,234.56", androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16()), false, 0, composer, 6, 12);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getLambda$-1316286094$search_and_intelligence_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m19145getLambda$1316286094$search_and_intelligence_prodRelease() {
        return Camera2StreamConfigurationMap;
    }
}
