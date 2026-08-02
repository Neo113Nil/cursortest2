package com.paypal.oslo.feature.shoppingrewards.shopping.common.domain;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ4\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/BenefitTypeMetadata;", "", "", "", com.paypal.oslo.feature.debitcard.shared.analytics.TermsConditionsBottomSheetAnalytics.ACTION, "minPurchaseAmount", "maxPurchaseAmount", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/BenefitTypeMetadata;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/List;", "getTerms", "Ljava/lang/String;", "getMinPurchaseAmount", "getMaxPurchaseAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class BenefitTypeMetadata {
    public static final int $stable = 0;
    private final java.lang.String maxPurchaseAmount;
    private final java.lang.String minPurchaseAmount;
    private final java.util.List<java.lang.String> terms;

    public BenefitTypeMetadata(java.util.List<java.lang.String> list, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.terms = list;
        this.minPurchaseAmount = str;
        this.maxPurchaseAmount = str2;
    }

    public /* synthetic */ BenefitTypeMetadata(java.util.List list, java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
    }

    public final java.util.List<java.lang.String> getTerms() {
        return this.terms;
    }

    public final java.lang.String getMinPurchaseAmount() {
        return this.minPurchaseAmount;
    }

    public final java.lang.String getMaxPurchaseAmount() {
        return this.maxPurchaseAmount;
    }

    public final java.lang.String toString() {
        java.util.List<java.lang.String> list = this.terms;
        java.lang.String str = this.minPurchaseAmount;
        java.lang.String str2 = this.maxPurchaseAmount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BenefitTypeMetadata(terms=");
        sb.append(list);
        sb.append(", minPurchaseAmount=");
        sb.append(str);
        sb.append(", maxPurchaseAmount=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.terms.hashCode() * 31) + this.minPurchaseAmount.hashCode()) * 31) + this.maxPurchaseAmount.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitTypeMetadata)) {
            return false;
        }
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitTypeMetadata benefitTypeMetadata = (com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitTypeMetadata) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.terms, benefitTypeMetadata.terms) && kotlin.jvm.internal.Intrinsics.areEqual(this.minPurchaseAmount, benefitTypeMetadata.minPurchaseAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.maxPurchaseAmount, benefitTypeMetadata.maxPurchaseAmount);
    }

    public final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitTypeMetadata copy(java.util.List<java.lang.String> terms, java.lang.String minPurchaseAmount, java.lang.String maxPurchaseAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(terms, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minPurchaseAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maxPurchaseAmount, "");
        return new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitTypeMetadata(terms, minPurchaseAmount, maxPurchaseAmount);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getMaxPurchaseAmount() {
        return this.maxPurchaseAmount;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getMinPurchaseAmount() {
        return this.minPurchaseAmount;
    }

    public final java.util.List<java.lang.String> component1() {
        return this.terms;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitTypeMetadata copy$default(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitTypeMetadata benefitTypeMetadata, java.util.List list, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = benefitTypeMetadata.terms;
        }
        if ((i & 2) != 0) {
            str = benefitTypeMetadata.minPurchaseAmount;
        }
        if ((i & 4) != 0) {
            str2 = benefitTypeMetadata.maxPurchaseAmount;
        }
        return benefitTypeMetadata.copy(list, str, str2);
    }

    public BenefitTypeMetadata() {
        this(null, null, null, 7, null);
    }
}
