package com.paypal.oslo.feature.bnplacquisition.domain.model.enteramount;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ2\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enteramount/ProductOverview;", "", "", "creditProductIdentifier", "productImageUrl", "calculatorUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enteramount/ProductOverview;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCreditProductIdentifier", "getProductImageUrl", "getCalculatorUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ProductOverview {
    public static final int $stable = 0;
    private final java.lang.String calculatorUrl;
    private final java.lang.String creditProductIdentifier;
    private final java.lang.String productImageUrl;

    public ProductOverview(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.creditProductIdentifier = str;
        this.productImageUrl = str2;
        this.calculatorUrl = str3;
    }

    public /* synthetic */ ProductOverview(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public final java.lang.String getCreditProductIdentifier() {
        return this.creditProductIdentifier;
    }

    public final java.lang.String getProductImageUrl() {
        return this.productImageUrl;
    }

    public final java.lang.String getCalculatorUrl() {
        return this.calculatorUrl;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.creditProductIdentifier;
        java.lang.String str2 = this.productImageUrl;
        java.lang.String str3 = this.calculatorUrl;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ProductOverview(creditProductIdentifier=");
        sb.append(str);
        sb.append(", productImageUrl=");
        sb.append(str2);
        sb.append(", calculatorUrl=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.creditProductIdentifier.hashCode();
        java.lang.String str = this.productImageUrl;
        int hashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.calculatorUrl;
        return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.enteramount.ProductOverview)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.domain.model.enteramount.ProductOverview productOverview = (com.paypal.oslo.feature.bnplacquisition.domain.model.enteramount.ProductOverview) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.creditProductIdentifier, productOverview.creditProductIdentifier) && kotlin.jvm.internal.Intrinsics.areEqual(this.productImageUrl, productOverview.productImageUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.calculatorUrl, productOverview.calculatorUrl);
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.enteramount.ProductOverview copy(java.lang.String creditProductIdentifier, java.lang.String productImageUrl, java.lang.String calculatorUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.enteramount.ProductOverview(creditProductIdentifier, productImageUrl, calculatorUrl);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCalculatorUrl() {
        return this.calculatorUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getProductImageUrl() {
        return this.productImageUrl;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCreditProductIdentifier() {
        return this.creditProductIdentifier;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.enteramount.ProductOverview copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.enteramount.ProductOverview productOverview, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = productOverview.creditProductIdentifier;
        }
        if ((i & 2) != 0) {
            str2 = productOverview.productImageUrl;
        }
        if ((i & 4) != 0) {
            str3 = productOverview.calculatorUrl;
        }
        return productOverview.copy(str, str2, str3);
    }
}
