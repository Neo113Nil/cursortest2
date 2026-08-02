package com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001a\u0010\u0001\u001a\u00020\u00008\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/domain/showcard/model/DebitCardDetails;", "placeholderCardDetails", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/showcard/model/DebitCardDetails;", "getPlaceholderCardDetails", "()Lcom/paypal/oslo/feature/debitcard/servicing/domain/showcard/model/DebitCardDetails;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ShowDebitCardStateKt {
    private static final com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.DebitCardDetails placeholderCardDetails = new com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.DebitCardDetails("", "••••  ••••  ••••  ••••", "••••", "•••", "••••", com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.DebitCardScheme.UNKNOWN, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState.UNKNOWN);

    public static final com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.DebitCardDetails getPlaceholderCardDetails() {
        return placeholderCardDetails;
    }
}
