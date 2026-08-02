package com.paypal.oslo.feature.wallet.cards.domain.rewards.model;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardStatus;", "", "Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardState;", "state", "Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardStateReason;", "reason", "<init>", "(Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardState;Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardStateReason;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardState;", "component2", "()Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardStateReason;", "copy", "(Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardState;Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardStateReason;)Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardStatus;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardState;", "getState", "Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardStateReason;", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CardRewardStatus {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardStateReason reason;
    private final com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardState state;

    public CardRewardStatus(com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardState cardRewardState, com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardStateReason cardRewardStateReason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardRewardState, "");
        this.state = cardRewardState;
        this.reason = cardRewardStateReason;
    }

    public final com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardState getState() {
        return this.state;
    }

    public final com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardStateReason getReason() {
        return this.reason;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardState cardRewardState = this.state;
        com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardStateReason cardRewardStateReason = this.reason;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CardRewardStatus(state=");
        sb.append(cardRewardState);
        sb.append(", reason=");
        sb.append(cardRewardStateReason);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.state.hashCode();
        com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardStateReason cardRewardStateReason = this.reason;
        return (hashCode * 31) + (cardRewardStateReason == null ? 0 : cardRewardStateReason.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardStatus)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardStatus cardRewardStatus = (com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardStatus) other;
        return this.state == cardRewardStatus.state && this.reason == cardRewardStatus.reason;
    }

    public final com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardStatus copy(com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardState state, com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardStateReason reason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        return new com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardStatus(state, reason);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardStateReason getReason() {
        return this.reason;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardState getState() {
        return this.state;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardStatus copy$default(com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardStatus cardRewardStatus, com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardState cardRewardState, com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardStateReason cardRewardStateReason, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            cardRewardState = cardRewardStatus.state;
        }
        if ((i & 2) != 0) {
            cardRewardStateReason = cardRewardStatus.reason;
        }
        return cardRewardStatus.copy(cardRewardState, cardRewardStateReason);
    }
}
