package com.paypal.oslo.feature.wallet.cards.domain.remove.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/remove/model/CardRemove;", "", "", "removed", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/wallet/cards/domain/remove/model/CardRemove;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getRemoved"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CardRemove {
    public static final int $stable = 0;
    private final boolean removed;

    public CardRemove(boolean z) {
        this.removed = z;
    }

    public final boolean getRemoved() {
        return this.removed;
    }

    public final java.lang.String toString() {
        boolean z = this.removed;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CardRemove(removed=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.removed);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.wallet.cards.domain.remove.model.CardRemove) && this.removed == ((com.paypal.oslo.feature.wallet.cards.domain.remove.model.CardRemove) other).removed;
    }

    public final com.paypal.oslo.feature.wallet.cards.domain.remove.model.CardRemove copy(boolean removed) {
        return new com.paypal.oslo.feature.wallet.cards.domain.remove.model.CardRemove(removed);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getRemoved() {
        return this.removed;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.domain.remove.model.CardRemove copy$default(com.paypal.oslo.feature.wallet.cards.domain.remove.model.CardRemove cardRemove, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = cardRemove.removed;
        }
        return cardRemove.copy(z);
    }
}
