package com.paypal.android.taptopay.domain.repository.payment;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/android/taptopay/domain/repository/payment/ChangeFundingPreferenceResponse;", "", "Lcom/paypal/android/taptopay/domain/repository/payment/FundingSource;", com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLs.FUNDING_SOURCE, "Lcom/paypal/android/taptopay/domain/repository/payment/FundingPreferenceResponseContext;", "context", "", "updateTime", "<init>", "(Lcom/paypal/android/taptopay/domain/repository/payment/FundingSource;Lcom/paypal/android/taptopay/domain/repository/payment/FundingPreferenceResponseContext;Ljava/lang/String;)V", "component1", "()Lcom/paypal/android/taptopay/domain/repository/payment/FundingSource;", "component2", "()Lcom/paypal/android/taptopay/domain/repository/payment/FundingPreferenceResponseContext;", "component3", "()Ljava/lang/String;", "copy", "(Lcom/paypal/android/taptopay/domain/repository/payment/FundingSource;Lcom/paypal/android/taptopay/domain/repository/payment/FundingPreferenceResponseContext;Ljava/lang/String;)Lcom/paypal/android/taptopay/domain/repository/payment/ChangeFundingPreferenceResponse;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/android/taptopay/domain/repository/payment/FundingPreferenceResponseContext;", "getContext", "Lcom/paypal/android/taptopay/domain/repository/payment/FundingSource;", "getFundingSource", "Ljava/lang/String;", "getUpdateTime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ChangeFundingPreferenceResponse {

    @com.google.gson.annotations.SerializedName("context")
    private final com.paypal.android.taptopay.domain.repository.payment.FundingPreferenceResponseContext context;

    @com.google.gson.annotations.SerializedName("funding_source")
    private final com.paypal.android.taptopay.domain.repository.payment.FundingSource fundingSource;

    @com.google.gson.annotations.SerializedName("update_time")
    private final java.lang.String updateTime;

    public ChangeFundingPreferenceResponse(com.paypal.android.taptopay.domain.repository.payment.FundingSource fundingSource, com.paypal.android.taptopay.domain.repository.payment.FundingPreferenceResponseContext fundingPreferenceResponseContext, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingPreferenceResponseContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.fundingSource = fundingSource;
        this.context = fundingPreferenceResponseContext;
        this.updateTime = str;
    }

    public final com.paypal.android.taptopay.domain.repository.payment.FundingSource getFundingSource() {
        return this.fundingSource;
    }

    public final com.paypal.android.taptopay.domain.repository.payment.FundingPreferenceResponseContext getContext() {
        return this.context;
    }

    public final java.lang.String getUpdateTime() {
        return this.updateTime;
    }

    public final java.lang.String toString() {
        com.paypal.android.taptopay.domain.repository.payment.FundingSource fundingSource = this.fundingSource;
        com.paypal.android.taptopay.domain.repository.payment.FundingPreferenceResponseContext fundingPreferenceResponseContext = this.context;
        java.lang.String str = this.updateTime;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ChangeFundingPreferenceResponse(fundingSource=");
        sb.append(fundingSource);
        sb.append(", context=");
        sb.append(fundingPreferenceResponseContext);
        sb.append(", updateTime=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.android.taptopay.domain.repository.payment.FundingSource fundingSource = this.fundingSource;
        return ((((fundingSource == null ? 0 : fundingSource.hashCode()) * 31) + this.context.hashCode()) * 31) + this.updateTime.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.android.taptopay.domain.repository.payment.ChangeFundingPreferenceResponse)) {
            return false;
        }
        com.paypal.android.taptopay.domain.repository.payment.ChangeFundingPreferenceResponse changeFundingPreferenceResponse = (com.paypal.android.taptopay.domain.repository.payment.ChangeFundingPreferenceResponse) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.fundingSource, changeFundingPreferenceResponse.fundingSource) && kotlin.jvm.internal.Intrinsics.areEqual(this.context, changeFundingPreferenceResponse.context) && kotlin.jvm.internal.Intrinsics.areEqual(this.updateTime, changeFundingPreferenceResponse.updateTime);
    }

    public final com.paypal.android.taptopay.domain.repository.payment.ChangeFundingPreferenceResponse copy(com.paypal.android.taptopay.domain.repository.payment.FundingSource fundingSource, com.paypal.android.taptopay.domain.repository.payment.FundingPreferenceResponseContext context, java.lang.String updateTime) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateTime, "");
        return new com.paypal.android.taptopay.domain.repository.payment.ChangeFundingPreferenceResponse(fundingSource, context, updateTime);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getUpdateTime() {
        return this.updateTime;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.android.taptopay.domain.repository.payment.FundingPreferenceResponseContext getContext() {
        return this.context;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.android.taptopay.domain.repository.payment.FundingSource getFundingSource() {
        return this.fundingSource;
    }

    public static /* synthetic */ com.paypal.android.taptopay.domain.repository.payment.ChangeFundingPreferenceResponse copy$default(com.paypal.android.taptopay.domain.repository.payment.ChangeFundingPreferenceResponse changeFundingPreferenceResponse, com.paypal.android.taptopay.domain.repository.payment.FundingSource fundingSource, com.paypal.android.taptopay.domain.repository.payment.FundingPreferenceResponseContext fundingPreferenceResponseContext, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            fundingSource = changeFundingPreferenceResponse.fundingSource;
        }
        if ((i & 2) != 0) {
            fundingPreferenceResponseContext = changeFundingPreferenceResponse.context;
        }
        if ((i & 4) != 0) {
            str = changeFundingPreferenceResponse.updateTime;
        }
        return changeFundingPreferenceResponse.copy(fundingSource, fundingPreferenceResponseContext, str);
    }
}
