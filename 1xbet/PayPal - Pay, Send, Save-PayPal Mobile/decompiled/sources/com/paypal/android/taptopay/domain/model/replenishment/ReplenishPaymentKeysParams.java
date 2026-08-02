package com.paypal.android.taptopay.domain.model.replenishment;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\t"}, d2 = {"Lcom/paypal/android/taptopay/domain/model/replenishment/ReplenishPaymentKeysParams;", "", "", "tokenizedCardId", "", "forceReplenishment", "<init>", "(Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/paypal/android/taptopay/domain/model/replenishment/ReplenishPaymentKeysParams;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Z", "getForceReplenishment", "Ljava/lang/String;", "getTokenizedCardId"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ReplenishPaymentKeysParams {
    private final boolean forceReplenishment;
    private final java.lang.String tokenizedCardId;

    public ReplenishPaymentKeysParams(java.lang.String str, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.tokenizedCardId = str;
        this.forceReplenishment = z;
    }

    public final java.lang.String getTokenizedCardId() {
        return this.tokenizedCardId;
    }

    public final boolean getForceReplenishment() {
        return this.forceReplenishment;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.tokenizedCardId;
        boolean z = this.forceReplenishment;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ReplenishPaymentKeysParams(tokenizedCardId=");
        sb.append(str);
        sb.append(", forceReplenishment=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.tokenizedCardId.hashCode() * 31) + java.lang.Boolean.hashCode(this.forceReplenishment);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.android.taptopay.domain.model.replenishment.ReplenishPaymentKeysParams)) {
            return false;
        }
        com.paypal.android.taptopay.domain.model.replenishment.ReplenishPaymentKeysParams replenishPaymentKeysParams = (com.paypal.android.taptopay.domain.model.replenishment.ReplenishPaymentKeysParams) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.tokenizedCardId, replenishPaymentKeysParams.tokenizedCardId) && this.forceReplenishment == replenishPaymentKeysParams.forceReplenishment;
    }

    public final com.paypal.android.taptopay.domain.model.replenishment.ReplenishPaymentKeysParams copy(java.lang.String tokenizedCardId, boolean forceReplenishment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenizedCardId, "");
        return new com.paypal.android.taptopay.domain.model.replenishment.ReplenishPaymentKeysParams(tokenizedCardId, forceReplenishment);
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getForceReplenishment() {
        return this.forceReplenishment;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTokenizedCardId() {
        return this.tokenizedCardId;
    }

    public static /* synthetic */ com.paypal.android.taptopay.domain.model.replenishment.ReplenishPaymentKeysParams copy$default(com.paypal.android.taptopay.domain.model.replenishment.ReplenishPaymentKeysParams replenishPaymentKeysParams, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = replenishPaymentKeysParams.tokenizedCardId;
        }
        if ((i & 2) != 0) {
            z = replenishPaymentKeysParams.forceReplenishment;
        }
        return replenishPaymentKeysParams.copy(str, z);
    }
}
