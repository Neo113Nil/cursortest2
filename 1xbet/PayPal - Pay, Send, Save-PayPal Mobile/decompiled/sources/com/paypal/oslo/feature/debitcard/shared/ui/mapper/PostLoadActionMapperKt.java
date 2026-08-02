package com.paypal.oslo.feature.debitcard.shared.ui.mapper;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext$PostLoadAction;", "", "toToastMessageRes", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext$PostLoadAction;)Ljava/lang/Integer;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PostLoadActionMapperKt {
    public static final java.lang.Integer toToastMessageRes(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction postLoadAction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postLoadAction, "");
        if (postLoadAction instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction.ShowCardLockedToast) {
            return java.lang.Integer.valueOf(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_toast_lock_card_success);
        }
        if (postLoadAction instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction.ShowCardAlreadyLockedToast) {
            return java.lang.Integer.valueOf(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_toast_card_already_locked);
        }
        if (postLoadAction instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction.ShowCardUnlockedToast) {
            return java.lang.Integer.valueOf(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_toast_unlock_card_success);
        }
        if (postLoadAction instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction.ShowCardAlreadyUnlockedToast) {
            return java.lang.Integer.valueOf(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_toast_card_already_unlocked);
        }
        return null;
    }
}
