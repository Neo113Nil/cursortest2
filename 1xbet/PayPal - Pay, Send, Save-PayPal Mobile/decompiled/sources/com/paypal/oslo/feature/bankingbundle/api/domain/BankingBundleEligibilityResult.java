package com.paypal.oslo.feature.bankingbundle.api.domain;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/bankingbundle/api/domain/BankingBundleEligibilityResult;", "", "Lcom/paypal/oslo/feature/bankingbundle/api/domain/EligibilityStatus;", "status", "", "Lcom/paypal/oslo/feature/bankingbundle/api/domain/BundleProduct;", com.paypal.oslo.feature.businessinventory.analytics.UiContextValues.ModuleName.Products, "<init>", "(Lcom/paypal/oslo/feature/bankingbundle/api/domain/EligibilityStatus;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/bankingbundle/api/domain/EligibilityStatus;", "component2", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/bankingbundle/api/domain/EligibilityStatus;Ljava/util/List;)Lcom/paypal/oslo/feature/bankingbundle/api/domain/BankingBundleEligibilityResult;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bankingbundle/api/domain/EligibilityStatus;", "getStatus", "Ljava/util/List;", "getProducts"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BankingBundleEligibilityResult {
    private final java.util.List<com.paypal.oslo.feature.bankingbundle.api.domain.BundleProduct> products;
    private final com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityStatus status;

    /* JADX WARN: Multi-variable type inference failed */
    public BankingBundleEligibilityResult(com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityStatus eligibilityStatus, java.util.List<? extends com.paypal.oslo.feature.bankingbundle.api.domain.BundleProduct> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eligibilityStatus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.status = eligibilityStatus;
        this.products = list;
    }

    public final com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityStatus getStatus() {
        return this.status;
    }

    public final java.util.List<com.paypal.oslo.feature.bankingbundle.api.domain.BundleProduct> getProducts() {
        return this.products;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityStatus eligibilityStatus = this.status;
        java.util.List<com.paypal.oslo.feature.bankingbundle.api.domain.BundleProduct> list = this.products;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BankingBundleEligibilityResult(status=");
        sb.append(eligibilityStatus);
        sb.append(", products=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.status.hashCode() * 31) + this.products.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibilityResult)) {
            return false;
        }
        com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibilityResult bankingBundleEligibilityResult = (com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibilityResult) other;
        return this.status == bankingBundleEligibilityResult.status && kotlin.jvm.internal.Intrinsics.areEqual(this.products, bankingBundleEligibilityResult.products);
    }

    public final com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibilityResult copy(com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityStatus status, java.util.List<? extends com.paypal.oslo.feature.bankingbundle.api.domain.BundleProduct> products) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(products, "");
        return new com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibilityResult(status, products);
    }

    public final java.util.List<com.paypal.oslo.feature.bankingbundle.api.domain.BundleProduct> component2() {
        return this.products;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityStatus getStatus() {
        return this.status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibilityResult copy$default(com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibilityResult bankingBundleEligibilityResult, com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityStatus eligibilityStatus, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            eligibilityStatus = bankingBundleEligibilityResult.status;
        }
        if ((i & 2) != 0) {
            list = bankingBundleEligibilityResult.products;
        }
        return bankingBundleEligibilityResult.copy(eligibilityStatus, list);
    }
}
