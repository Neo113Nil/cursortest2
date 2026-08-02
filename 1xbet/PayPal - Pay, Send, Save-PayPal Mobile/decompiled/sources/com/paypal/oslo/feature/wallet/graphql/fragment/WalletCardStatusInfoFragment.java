package com.paypal.oslo.feature.wallet.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletCardStatusInfoFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/CardStatus;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "reason", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/CardStatus;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/CardStatus;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/CardStatus;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletCardStatusInfoFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/CardStatus;", "getValue", "Ljava/lang/String;", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class WalletCardStatusInfoFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 0;
    private final java.lang.String reason;
    private final com.paypal.oslo.api.graphql.schema.type.CardStatus value;

    public WalletCardStatusInfoFragment(com.paypal.oslo.api.graphql.schema.type.CardStatus cardStatus, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardStatus, "");
        this.value = cardStatus;
        this.reason = str;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CardStatus getValue() {
        return this.value;
    }

    public final java.lang.String getReason() {
        return this.reason;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.CardStatus cardStatus = this.value;
        java.lang.String str = this.reason;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("WalletCardStatusInfoFragment(value=");
        sb.append(cardStatus);
        sb.append(", reason=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.value.hashCode();
        java.lang.String str = this.reason;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardStatusInfoFragment)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardStatusInfoFragment walletCardStatusInfoFragment = (com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardStatusInfoFragment) other;
        return this.value == walletCardStatusInfoFragment.value && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, walletCardStatusInfoFragment.reason);
    }

    public final com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardStatusInfoFragment copy(com.paypal.oslo.api.graphql.schema.type.CardStatus value, java.lang.String reason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        return new com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardStatusInfoFragment(value, reason);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getReason() {
        return this.reason;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.CardStatus getValue() {
        return this.value;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardStatusInfoFragment copy$default(com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardStatusInfoFragment walletCardStatusInfoFragment, com.paypal.oslo.api.graphql.schema.type.CardStatus cardStatus, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            cardStatus = walletCardStatusInfoFragment.value;
        }
        if ((i & 2) != 0) {
            str = walletCardStatusInfoFragment.reason;
        }
        return walletCardStatusInfoFragment.copy(cardStatus, str);
    }
}
