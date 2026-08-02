package com.paypal.android.taptopay.domain.repository.payment;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\t"}, d2 = {"Lcom/paypal/android/taptopay/domain/repository/payment/ChangeFundingPreferenceRequest;", "", "Lcom/paypal/android/taptopay/domain/repository/payment/FundingSource;", com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLs.FUNDING_SOURCE, "Lcom/paypal/android/taptopay/domain/repository/payment/FundingPreferenceResponseContext;", "context", "<init>", "(Lcom/paypal/android/taptopay/domain/repository/payment/FundingSource;Lcom/paypal/android/taptopay/domain/repository/payment/FundingPreferenceResponseContext;)V", "component1", "()Lcom/paypal/android/taptopay/domain/repository/payment/FundingSource;", "component2", "()Lcom/paypal/android/taptopay/domain/repository/payment/FundingPreferenceResponseContext;", "copy", "(Lcom/paypal/android/taptopay/domain/repository/payment/FundingSource;Lcom/paypal/android/taptopay/domain/repository/payment/FundingPreferenceResponseContext;)Lcom/paypal/android/taptopay/domain/repository/payment/ChangeFundingPreferenceRequest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/android/taptopay/domain/repository/payment/FundingPreferenceResponseContext;", "getContext", "Lcom/paypal/android/taptopay/domain/repository/payment/FundingSource;", "getFundingSource"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ChangeFundingPreferenceRequest {

    @com.google.gson.annotations.SerializedName("context")
    private final com.paypal.android.taptopay.domain.repository.payment.FundingPreferenceResponseContext context;

    @com.google.gson.annotations.SerializedName("funding_source")
    private final com.paypal.android.taptopay.domain.repository.payment.FundingSource fundingSource;

    public ChangeFundingPreferenceRequest(com.paypal.android.taptopay.domain.repository.payment.FundingSource fundingSource, com.paypal.android.taptopay.domain.repository.payment.FundingPreferenceResponseContext fundingPreferenceResponseContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingPreferenceResponseContext, "");
        this.fundingSource = fundingSource;
        this.context = fundingPreferenceResponseContext;
    }

    public final com.paypal.android.taptopay.domain.repository.payment.FundingSource getFundingSource() {
        return this.fundingSource;
    }

    public final com.paypal.android.taptopay.domain.repository.payment.FundingPreferenceResponseContext getContext() {
        return this.context;
    }

    public final java.lang.String toString() {
        com.paypal.android.taptopay.domain.repository.payment.FundingSource fundingSource = this.fundingSource;
        com.paypal.android.taptopay.domain.repository.payment.FundingPreferenceResponseContext fundingPreferenceResponseContext = this.context;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ChangeFundingPreferenceRequest(fundingSource=");
        sb.append(fundingSource);
        sb.append(", context=");
        sb.append(fundingPreferenceResponseContext);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.android.taptopay.domain.repository.payment.FundingSource fundingSource = this.fundingSource;
        return ((fundingSource == null ? 0 : fundingSource.hashCode()) * 31) + this.context.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.android.taptopay.domain.repository.payment.ChangeFundingPreferenceRequest)) {
            return false;
        }
        com.paypal.android.taptopay.domain.repository.payment.ChangeFundingPreferenceRequest changeFundingPreferenceRequest = (com.paypal.android.taptopay.domain.repository.payment.ChangeFundingPreferenceRequest) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.fundingSource, changeFundingPreferenceRequest.fundingSource) && kotlin.jvm.internal.Intrinsics.areEqual(this.context, changeFundingPreferenceRequest.context);
    }

    public final com.paypal.android.taptopay.domain.repository.payment.ChangeFundingPreferenceRequest copy(com.paypal.android.taptopay.domain.repository.payment.FundingSource fundingSource, com.paypal.android.taptopay.domain.repository.payment.FundingPreferenceResponseContext context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return new com.paypal.android.taptopay.domain.repository.payment.ChangeFundingPreferenceRequest(fundingSource, context);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.android.taptopay.domain.repository.payment.FundingPreferenceResponseContext getContext() {
        return this.context;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.android.taptopay.domain.repository.payment.FundingSource getFundingSource() {
        return this.fundingSource;
    }

    public static /* synthetic */ com.paypal.android.taptopay.domain.repository.payment.ChangeFundingPreferenceRequest copy$default(com.paypal.android.taptopay.domain.repository.payment.ChangeFundingPreferenceRequest changeFundingPreferenceRequest, com.paypal.android.taptopay.domain.repository.payment.FundingSource fundingSource, com.paypal.android.taptopay.domain.repository.payment.FundingPreferenceResponseContext fundingPreferenceResponseContext, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            fundingSource = changeFundingPreferenceRequest.fundingSource;
        }
        if ((i & 2) != 0) {
            fundingPreferenceResponseContext = changeFundingPreferenceRequest.context;
        }
        return changeFundingPreferenceRequest.copy(fundingSource, fundingPreferenceResponseContext);
    }
}
