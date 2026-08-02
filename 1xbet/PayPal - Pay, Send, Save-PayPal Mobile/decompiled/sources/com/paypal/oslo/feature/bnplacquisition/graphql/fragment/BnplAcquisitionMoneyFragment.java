package com.paypal.oslo.feature.bnplacquisition.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BnplAcquisitionMoneyFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final java.lang.Object currencyCode;
    private final java.lang.String value;

    public BnplAcquisitionMoneyFragment(java.lang.Object obj, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.currencyCode = obj;
        this.value = str;
    }

    public final java.lang.Object getCurrencyCode() {
        return this.currencyCode;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.currencyCode;
        java.lang.String str = this.value;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BnplAcquisitionMoneyFragment(currencyCode=");
        sb.append(obj);
        sb.append(", value=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.currencyCode.hashCode() * 31) + this.value.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment = (com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, bnplAcquisitionMoneyFragment.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, bnplAcquisitionMoneyFragment.value);
    }

    public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment copy(java.lang.Object currencyCode, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        return new com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment(currencyCode, value);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getValue() {
        return this.value;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Object getCurrencyCode() {
        return this.currencyCode;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = bnplAcquisitionMoneyFragment.currencyCode;
        }
        if ((i & 2) != 0) {
            str = bnplAcquisitionMoneyFragment.value;
        }
        return bnplAcquisitionMoneyFragment.copy(obj, str);
    }
}
