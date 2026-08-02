package com.paypal.oslo.feature.wallet.cards.ui.nickname;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ComposableSingletons$NicknameModalKt {
    public static final com.paypal.oslo.feature.wallet.cards.ui.nickname.ComposableSingletons$NicknameModalKt INSTANCE = new com.paypal.oslo.feature.wallet.cards.ui.nickname.ComposableSingletons$NicknameModalKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRanges = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1811198219, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.cards.ui.nickname.ComposableSingletons$NicknameModalKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.wallet.cards.ui.nickname.ComposableSingletons$NicknameModalKt.$r8$lambda$QFLajGOdv4ZiNmTkRWxW0t5iPDU((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$QFLajGOdv4ZiNmTkRWxW0t5iPDU(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1811198219, i, -1, "com.paypal.oslo.feature.wallet.cards.ui.nickname.ComposableSingletons$NicknameModalKt.lambda$-1811198219.<anonymous> (NicknameModal.kt:246)");
            }
            com.paypal.pds.components.AvatarKt.Avatar(new com.paypal.pds.components.AvatarSource.Icon(com.paypal.pds.core.Icon.Warning.INSTANCE), null, null, com.paypal.pds.components.AvatarEmphasis.Default.INSTANCE, null, null, composer, 3072, 54);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getLambda$-1811198219$wallet_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m21171getLambda$1811198219$wallet_prodRelease() {
        return getHighSpeedVideoFpsRanges;
    }
}
