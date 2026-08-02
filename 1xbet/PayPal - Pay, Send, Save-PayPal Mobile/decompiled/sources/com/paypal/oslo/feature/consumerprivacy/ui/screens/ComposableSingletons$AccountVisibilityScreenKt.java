package com.paypal.oslo.feature.consumerprivacy.ui.screens;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ComposableSingletons$AccountVisibilityScreenKt {
    public static final com.paypal.oslo.feature.consumerprivacy.ui.screens.ComposableSingletons$AccountVisibilityScreenKt INSTANCE = new com.paypal.oslo.feature.consumerprivacy.ui.screens.ComposableSingletons$AccountVisibilityScreenKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRanges = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1812686807, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ComposableSingletons$AccountVisibilityScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.consumerprivacy.ui.screens.ComposableSingletons$AccountVisibilityScreenKt.m13584$r8$lambda$H9uAJE8IVlz0qu7IEGv9KsKc((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    /* renamed from: $r8$lambda$H9uAJE8IVlz0qu-7IEGv9Ks--Kc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13584$r8$lambda$H9uAJE8IVlz0qu7IEGv9KsKc(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1812686807, i, -1, "com.paypal.oslo.feature.consumerprivacy.ui.screens.ComposableSingletons$AccountVisibilityScreenKt.lambda$-1812686807.<anonymous> (AccountVisibilityScreen.kt:169)");
            }
            com.paypal.oslo.feature.consumerprivacy.ui.components.LoadingScreenKt.LoadingScreen(null, "account_visibility_loading", composer, 48, 1);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getLambda$-1812686807$consumer_privacy_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m13585getLambda$1812686807$consumer_privacy_prodRelease() {
        return getHighSpeedVideoFpsRanges;
    }
}
