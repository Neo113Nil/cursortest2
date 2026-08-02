package com.paypal.oslo.feature.inappcheckout.graphql.checkout.fragment;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/fragment/DisallowedFields;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalFundingDisallowedReason;", "disallowedReasons", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/fragment/DisallowedFields;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getDisallowedReasons"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class DisallowedFields implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingDisallowedReason> disallowedReasons;

    /* JADX WARN: Multi-variable type inference failed */
    public DisallowedFields(java.util.List<? extends com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingDisallowedReason> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.disallowedReasons = list;
    }

    public final java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingDisallowedReason> getDisallowedReasons() {
        return this.disallowedReasons;
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingDisallowedReason> list = this.disallowedReasons;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DisallowedFields(disallowedReasons=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.disallowedReasons.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.inappcheckout.graphql.checkout.fragment.DisallowedFields) && kotlin.jvm.internal.Intrinsics.areEqual(this.disallowedReasons, ((com.paypal.oslo.feature.inappcheckout.graphql.checkout.fragment.DisallowedFields) other).disallowedReasons);
    }

    public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.fragment.DisallowedFields copy(java.util.List<? extends com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingDisallowedReason> disallowedReasons) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disallowedReasons, "");
        return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.fragment.DisallowedFields(disallowedReasons);
    }

    public final java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingDisallowedReason> component1() {
        return this.disallowedReasons;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.graphql.checkout.fragment.DisallowedFields copy$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.fragment.DisallowedFields disallowedFields, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = disallowedFields.disallowedReasons;
        }
        return disallowedFields.copy(list);
    }
}
