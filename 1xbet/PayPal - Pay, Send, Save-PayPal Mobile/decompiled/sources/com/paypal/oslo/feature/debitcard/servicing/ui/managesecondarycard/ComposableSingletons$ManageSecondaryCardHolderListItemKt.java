package com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ComposableSingletons$ManageSecondaryCardHolderListItemKt {
    public static final com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ComposableSingletons$ManageSecondaryCardHolderListItemKt INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ComposableSingletons$ManageSecondaryCardHolderListItemKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRanges = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1393890701, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ComposableSingletons$ManageSecondaryCardHolderListItemKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ComposableSingletons$ManageSecondaryCardHolderListItemKt.$r8$lambda$fHciUDLE1tPYSM2q8y0mwtq4gjU((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$fHciUDLE1tPYSM2q8y0mwtq4gjU(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1393890701, i, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ComposableSingletons$ManageSecondaryCardHolderListItemKt.lambda$-1393890701.<anonymous> (ManageSecondaryCardHolderListItem.kt:56)");
            }
            com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.ChevronRight.INSTANCE, null, null, null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, composer, 24630, 12);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getLambda$-1393890701$debit_card_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m14430getLambda$1393890701$debit_card_prodRelease() {
        return getHighSpeedVideoFpsRanges;
    }
}
