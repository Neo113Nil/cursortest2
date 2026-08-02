package com.paypal.oslo.feature.wallet.me.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ComposableSingletons$AccountsScreenKt {
    public static final com.paypal.oslo.feature.wallet.me.ui.ComposableSingletons$AccountsScreenKt INSTANCE = new com.paypal.oslo.feature.wallet.me.ui.ComposableSingletons$AccountsScreenKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1230563778, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.me.ui.ComposableSingletons$AccountsScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.wallet.me.ui.ComposableSingletons$AccountsScreenKt.$r8$lambda$CTgdLmBZMc6GWSk2krkEnrk7VbU((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoSizes = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1094050650, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.me.ui.ComposableSingletons$AccountsScreenKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.wallet.me.ui.ComposableSingletons$AccountsScreenKt.$r8$lambda$NgNj0UMV2VhYPr4qTfkgHXWZnQg((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$CTgdLmBZMc6GWSk2krkEnrk7VbU(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1230563778, i, -1, "com.paypal.oslo.feature.wallet.me.ui.ComposableSingletons$AccountsScreenKt.lambda$-1230563778.<anonymous> (AccountsScreen.kt:367)");
            }
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_linked_banks_and_card_empty, composer, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing4()), com.paypal.oslo.feature.wallet.me.ui.AccountsScreenKt.TestTagLinkedBanksAndCardsEmptyLabel), null, null, null, null, false, 0, 0, null, null, composer, 0, 0, 2044);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NgNj0UMV2VhYPr4qTfkgHXWZnQg(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1094050650, i, -1, "com.paypal.oslo.feature.wallet.me.ui.ComposableSingletons$AccountsScreenKt.lambda$-1094050650.<anonymous> (AccountsScreen.kt:433)");
            }
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_loyalty_cards_empty, composer, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing4()), com.paypal.oslo.feature.wallet.me.ui.AccountsScreenKt.TestTagLinkedLoyaltyCardsEmptyLabel), null, null, null, null, false, 0, 0, null, null, composer, 0, 0, 2044);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getLambda$-1230563778$wallet_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m21413getLambda$1230563778$wallet_prodRelease() {
        return Camera2StreamConfigurationMap;
    }

    /* renamed from: getLambda$-1094050650$wallet_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m21412getLambda$1094050650$wallet_prodRelease() {
        return getHighSpeedVideoSizes;
    }
}
