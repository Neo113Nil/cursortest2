package com.paypal.oslo.feature.businesshome.domain.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/domain/model/CardDismissalInfo;", "", "", "cardId", "", "dismissedAtMillis", "<init>", "(Ljava/lang/String;J)V", "nowMillis", "", "shouldShowAgain", "(J)Z", "component1", "()Ljava/lang/String;", "component2", "()J", "copy", "(Ljava/lang/String;J)Lcom/paypal/oslo/feature/businesshome/domain/model/CardDismissalInfo;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCardId", "J", "getDismissedAtMillis"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CardDismissalInfo {
    public static final int $stable = 0;
    private final java.lang.String cardId;
    private final long dismissedAtMillis;

    public CardDismissalInfo(java.lang.String str, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.cardId = str;
        this.dismissedAtMillis = j;
    }

    public final java.lang.String getCardId() {
        return this.cardId;
    }

    public final long getDismissedAtMillis() {
        return this.dismissedAtMillis;
    }

    public static /* synthetic */ boolean shouldShowAgain$default(com.paypal.oslo.feature.businesshome.domain.model.CardDismissalInfo cardDismissalInfo, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = java.lang.System.currentTimeMillis();
        }
        return cardDismissalInfo.shouldShowAgain(j);
    }

    public final boolean shouldShowAgain(long nowMillis) {
        return (nowMillis - this.dismissedAtMillis) / 86400000 >= 14;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.cardId;
        long j = this.dismissedAtMillis;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CardDismissalInfo(cardId=");
        sb.append(str);
        sb.append(", dismissedAtMillis=");
        sb.append(j);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.cardId.hashCode() * 31) + java.lang.Long.hashCode(this.dismissedAtMillis);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.businesshome.domain.model.CardDismissalInfo)) {
            return false;
        }
        com.paypal.oslo.feature.businesshome.domain.model.CardDismissalInfo cardDismissalInfo = (com.paypal.oslo.feature.businesshome.domain.model.CardDismissalInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.cardId, cardDismissalInfo.cardId) && this.dismissedAtMillis == cardDismissalInfo.dismissedAtMillis;
    }

    public final com.paypal.oslo.feature.businesshome.domain.model.CardDismissalInfo copy(java.lang.String cardId, long dismissedAtMillis) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardId, "");
        return new com.paypal.oslo.feature.businesshome.domain.model.CardDismissalInfo(cardId, dismissedAtMillis);
    }

    /* renamed from: component2, reason: from getter */
    public final long getDismissedAtMillis() {
        return this.dismissedAtMillis;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCardId() {
        return this.cardId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businesshome.domain.model.CardDismissalInfo copy$default(com.paypal.oslo.feature.businesshome.domain.model.CardDismissalInfo cardDismissalInfo, java.lang.String str, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = cardDismissalInfo.cardId;
        }
        if ((i & 2) != 0) {
            j = cardDismissalInfo.dismissedAtMillis;
        }
        return cardDismissalInfo.copy(str, j);
    }
}
