package com.paypal.oslo.feature.shoppingrewards.shopping.common.domain;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011JF\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\rR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b#\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/BenefitData;", "", "", "title", "", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/BenefitListItem;", "items", "Lcom/paypal/pds/core/RichText;", com.paypal.oslo.feature.debitcard.shared.analytics.TermsConditionsBottomSheetAnalytics.ACTION, "disclosureTerms", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/paypal/pds/core/RichText;Lcom/paypal/pds/core/RichText;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lcom/paypal/pds/core/RichText;", "component4", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/paypal/pds/core/RichText;Lcom/paypal/pds/core/RichText;)Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/BenefitData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getItems", "Lcom/paypal/pds/core/RichText;", "getTerms", "getDisclosureTerms"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class BenefitData {
    public static final int $stable = 0;
    private final com.paypal.pds.core.RichText disclosureTerms;
    private final java.util.List<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitListItem> items;
    private final com.paypal.pds.core.RichText terms;
    private final java.lang.String title;

    public BenefitData(java.lang.String str, java.util.List<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitListItem> list, com.paypal.pds.core.RichText richText, com.paypal.pds.core.RichText richText2) {
        this.title = str;
        this.items = list;
        this.terms = richText;
        this.disclosureTerms = richText2;
    }

    public /* synthetic */ BenefitData(java.lang.String str, java.util.List list, com.paypal.pds.core.RichText richText, com.paypal.pds.core.RichText richText2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : richText, (i & 8) != 0 ? null : richText2);
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final java.util.List<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitListItem> getItems() {
        return this.items;
    }

    public final com.paypal.pds.core.RichText getTerms() {
        return this.terms;
    }

    public final com.paypal.pds.core.RichText getDisclosureTerms() {
        return this.disclosureTerms;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.title;
        java.util.List<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitListItem> list = this.items;
        com.paypal.pds.core.RichText richText = this.terms;
        com.paypal.pds.core.RichText richText2 = this.disclosureTerms;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BenefitData(title=");
        sb.append(str);
        sb.append(", items=");
        sb.append(list);
        sb.append(", terms=");
        sb.append(richText);
        sb.append(", disclosureTerms=");
        sb.append(richText2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.title;
        int hashCode = str == null ? 0 : str.hashCode();
        java.util.List<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitListItem> list = this.items;
        int hashCode2 = list == null ? 0 : list.hashCode();
        com.paypal.pds.core.RichText richText = this.terms;
        int hashCode3 = richText == null ? 0 : richText.hashCode();
        com.paypal.pds.core.RichText richText2 = this.disclosureTerms;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (richText2 != null ? richText2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitData)) {
            return false;
        }
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitData benefitData = (com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.title, benefitData.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.items, benefitData.items) && kotlin.jvm.internal.Intrinsics.areEqual(this.terms, benefitData.terms) && kotlin.jvm.internal.Intrinsics.areEqual(this.disclosureTerms, benefitData.disclosureTerms);
    }

    public final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitData copy(java.lang.String title, java.util.List<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitListItem> items, com.paypal.pds.core.RichText terms, com.paypal.pds.core.RichText disclosureTerms) {
        return new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitData(title, items, terms, disclosureTerms);
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.pds.core.RichText getDisclosureTerms() {
        return this.disclosureTerms;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.pds.core.RichText getTerms() {
        return this.terms;
    }

    public final java.util.List<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitListItem> component2() {
        return this.items;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitData copy$default(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitData benefitData, java.lang.String str, java.util.List list, com.paypal.pds.core.RichText richText, com.paypal.pds.core.RichText richText2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = benefitData.title;
        }
        if ((i & 2) != 0) {
            list = benefitData.items;
        }
        if ((i & 4) != 0) {
            richText = benefitData.terms;
        }
        if ((i & 8) != 0) {
            richText2 = benefitData.disclosureTerms;
        }
        return benefitData.copy(str, list, richText, richText2);
    }

    public BenefitData() {
        this(null, null, null, null, 15, null);
    }
}
