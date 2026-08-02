package com.paypal.oslo.feature.bnplacquisition.domain.model.requests;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/ProductDetails;", "", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/productselection/CreditProductIdentifier;", "creditProductIdentifier", "", "offerId", "productOfferEvaluationId", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/productselection/CreditProductIdentifier;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/productselection/CreditProductIdentifier;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/productselection/CreditProductIdentifier;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/ProductDetails;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/productselection/CreditProductIdentifier;", "getCreditProductIdentifier", "Ljava/lang/String;", "getOfferId", "getProductOfferEvaluationId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ProductDetails {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier creditProductIdentifier;
    private final java.lang.String offerId;
    private final java.lang.String productOfferEvaluationId;

    public ProductDetails(com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier creditProductIdentifier, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.creditProductIdentifier = creditProductIdentifier;
        this.offerId = str;
        this.productOfferEvaluationId = str2;
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier getCreditProductIdentifier() {
        return this.creditProductIdentifier;
    }

    public final java.lang.String getOfferId() {
        return this.offerId;
    }

    public final java.lang.String getProductOfferEvaluationId() {
        return this.productOfferEvaluationId;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier creditProductIdentifier = this.creditProductIdentifier;
        java.lang.String str = this.offerId;
        java.lang.String str2 = this.productOfferEvaluationId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ProductDetails(creditProductIdentifier=");
        sb.append(creditProductIdentifier);
        sb.append(", offerId=");
        sb.append(str);
        sb.append(", productOfferEvaluationId=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.creditProductIdentifier.hashCode();
        java.lang.String str = this.offerId;
        return (((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.productOfferEvaluationId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.requests.ProductDetails)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.domain.model.requests.ProductDetails productDetails = (com.paypal.oslo.feature.bnplacquisition.domain.model.requests.ProductDetails) other;
        return this.creditProductIdentifier == productDetails.creditProductIdentifier && kotlin.jvm.internal.Intrinsics.areEqual(this.offerId, productDetails.offerId) && kotlin.jvm.internal.Intrinsics.areEqual(this.productOfferEvaluationId, productDetails.productOfferEvaluationId);
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.requests.ProductDetails copy(com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier creditProductIdentifier, java.lang.String offerId, java.lang.String productOfferEvaluationId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productOfferEvaluationId, "");
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.requests.ProductDetails(creditProductIdentifier, offerId, productOfferEvaluationId);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getProductOfferEvaluationId() {
        return this.productOfferEvaluationId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getOfferId() {
        return this.offerId;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier getCreditProductIdentifier() {
        return this.creditProductIdentifier;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.requests.ProductDetails copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.requests.ProductDetails productDetails, com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier creditProductIdentifier, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            creditProductIdentifier = productDetails.creditProductIdentifier;
        }
        if ((i & 2) != 0) {
            str = productDetails.offerId;
        }
        if ((i & 4) != 0) {
            str2 = productDetails.productOfferEvaluationId;
        }
        return productDetails.copy(creditProductIdentifier, str, str2);
    }
}
