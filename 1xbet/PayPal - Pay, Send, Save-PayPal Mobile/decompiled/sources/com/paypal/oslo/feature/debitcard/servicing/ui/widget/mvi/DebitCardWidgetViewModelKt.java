package com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "resolveProductName", "(Lcom/paypal/oslo/core/userstore/UserStore;)Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitCardWidgetViewModelKt {
    public static final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName resolveProductName(com.paypal.oslo.core.userstore.UserStore userStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        com.paypal.oslo.core.userstore.model.UserState value = userStore.getUserState().getValue();
        if (value instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) {
            return kotlin.text.StringsKt.equals(((com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) value).getUser().getAccountType(), "BUSINESS", true) ? com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.BUSINESS_DEBIT_CARD : com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.CONSUMER_DEBIT_CARD;
        }
        return com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.CONSUMER_DEBIT_CARD;
    }
}
