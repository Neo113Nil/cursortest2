package com.paypal.oslo.feature.wallet.cards.domain.add.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0004\u001a\u00020\u0000*\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardStatus;", "", "statusName", "(Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardStatus;)Ljava/lang/String;", "toCardStatus", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardStatus;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CardStatusKt {
    public static final java.lang.String statusName(com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus cardStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardStatus, "");
        java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(cardStatus.getClass()).getSimpleName();
        return simpleName == null ? "" : simpleName;
    }

    public static final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus toCardStatus(java.lang.String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1929421986:
                    if (str.equals("OnHold")) {
                        return new com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus.OnHold(null);
                    }
                    break;
                case -1538478016:
                    if (str.equals("Removed")) {
                        return new com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus.Removed(null);
                    }
                    break;
                case -449256272:
                    if (str.equals("Actionable")) {
                        return new com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus.Actionable(null);
                    }
                    break;
                case 89309323:
                    if (str.equals("Inactive")) {
                        return new com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus.Inactive(null);
                    }
                    break;
                case 1643215308:
                    if (str.equals("Blocked")) {
                        return new com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus.Blocked(null);
                    }
                    break;
                case 1955883814:
                    if (str.equals("Active")) {
                        return new com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus.Active(null);
                    }
                    break;
            }
        }
        return new com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus.Unknown(null);
    }
}
