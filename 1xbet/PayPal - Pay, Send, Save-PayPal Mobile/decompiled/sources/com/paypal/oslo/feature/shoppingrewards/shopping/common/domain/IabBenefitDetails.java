package com.paypal.oslo.feature.shoppingrewards.shopping.common.domain;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabBenefitDetails;", "", "Lcom/paypal/pds/core/RichText;", "title", "", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/BenefitData;", "benefits", "<init>", "(Lcom/paypal/pds/core/RichText;Ljava/util/List;)V", "component1", "()Lcom/paypal/pds/core/RichText;", "component2", "()Ljava/util/List;", "copy", "(Lcom/paypal/pds/core/RichText;Ljava/util/List;)Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabBenefitDetails;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/pds/core/RichText;", "getTitle", "Ljava/util/List;", "getBenefits"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class IabBenefitDetails {
    public static final int $stable = 0;
    private final java.util.List<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitData> benefits;
    private final com.paypal.pds.core.RichText title;

    public IabBenefitDetails(com.paypal.pds.core.RichText richText, java.util.List<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitData> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.title = richText;
        this.benefits = list;
    }

    public final com.paypal.pds.core.RichText getTitle() {
        return this.title;
    }

    public /* synthetic */ IabBenefitDetails(com.paypal.pds.core.RichText richText, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : richText, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
    }

    public final java.util.List<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitData> getBenefits() {
        return this.benefits;
    }

    public final java.lang.String toString() {
        com.paypal.pds.core.RichText richText = this.title;
        java.util.List<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitData> list = this.benefits;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("IabBenefitDetails(title=");
        sb.append(richText);
        sb.append(", benefits=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.pds.core.RichText richText = this.title;
        return ((richText == null ? 0 : richText.hashCode()) * 31) + this.benefits.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabBenefitDetails)) {
            return false;
        }
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabBenefitDetails iabBenefitDetails = (com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabBenefitDetails) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.title, iabBenefitDetails.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.benefits, iabBenefitDetails.benefits);
    }

    public final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabBenefitDetails copy(com.paypal.pds.core.RichText title, java.util.List<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitData> benefits) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(benefits, "");
        return new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabBenefitDetails(title, benefits);
    }

    public final java.util.List<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitData> component2() {
        return this.benefits;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.pds.core.RichText getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabBenefitDetails copy$default(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabBenefitDetails iabBenefitDetails, com.paypal.pds.core.RichText richText, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            richText = iabBenefitDetails.title;
        }
        if ((i & 2) != 0) {
            list = iabBenefitDetails.benefits;
        }
        return iabBenefitDetails.copy(richText, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IabBenefitDetails() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
