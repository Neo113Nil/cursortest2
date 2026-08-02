package com.zettle.sdk.feature.taptopay.core.transaction.models;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/models/PaymentProperties;", "", "", "payeePricingTierId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/zettle/sdk/feature/taptopay/core/transaction/models/PaymentProperties;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPayeePricingTierId"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class PaymentProperties {
    private final java.lang.String payeePricingTierId;

    public PaymentProperties(java.lang.String str) {
        this.payeePricingTierId = str;
    }

    public /* synthetic */ PaymentProperties(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    public final java.lang.String getPayeePricingTierId() {
        return this.payeePricingTierId;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.payeePricingTierId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentProperties(payeePricingTierId=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.payeePricingTierId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.zettle.sdk.feature.taptopay.core.transaction.models.PaymentProperties) && kotlin.jvm.internal.Intrinsics.areEqual(this.payeePricingTierId, ((com.zettle.sdk.feature.taptopay.core.transaction.models.PaymentProperties) other).payeePricingTierId);
    }

    public final com.zettle.sdk.feature.taptopay.core.transaction.models.PaymentProperties copy(java.lang.String payeePricingTierId) {
        return new com.zettle.sdk.feature.taptopay.core.transaction.models.PaymentProperties(payeePricingTierId);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPayeePricingTierId() {
        return this.payeePricingTierId;
    }

    public static /* synthetic */ com.zettle.sdk.feature.taptopay.core.transaction.models.PaymentProperties copy$default(com.zettle.sdk.feature.taptopay.core.transaction.models.PaymentProperties paymentProperties, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = paymentProperties.payeePricingTierId;
        }
        return paymentProperties.copy(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentProperties() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
