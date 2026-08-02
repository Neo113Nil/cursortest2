package com.paypal.oslo.feature.wallet.banks.ui.consent.model;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ@\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001b\u0010\u000bR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/consent/model/AddBankConsentValuePropositions;", "", "", "", "titles", "descriptions", "Lcom/paypal/pds/core/Icon;", "propIcons", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "component3", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/wallet/banks/ui/consent/model/AddBankConsentValuePropositions;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getTitles", "getDescriptions", "getPropIcons"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class AddBankConsentValuePropositions {
    public static final int $stable = 8;
    private final java.util.List<java.lang.Integer> descriptions;
    private final java.util.List<com.paypal.pds.core.Icon> propIcons;
    private final java.util.List<java.lang.Integer> titles;

    /* JADX WARN: Multi-variable type inference failed */
    public AddBankConsentValuePropositions(java.util.List<java.lang.Integer> list, java.util.List<java.lang.Integer> list2, java.util.List<? extends com.paypal.pds.core.Icon> list3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list3, "");
        this.titles = list;
        this.descriptions = list2;
        this.propIcons = list3;
    }

    public final java.util.List<java.lang.Integer> getTitles() {
        return this.titles;
    }

    public final java.util.List<java.lang.Integer> getDescriptions() {
        return this.descriptions;
    }

    public final java.util.List<com.paypal.pds.core.Icon> getPropIcons() {
        return this.propIcons;
    }

    public final java.lang.String toString() {
        java.util.List<java.lang.Integer> list = this.titles;
        java.util.List<java.lang.Integer> list2 = this.descriptions;
        java.util.List<com.paypal.pds.core.Icon> list3 = this.propIcons;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AddBankConsentValuePropositions(titles=");
        sb.append(list);
        sb.append(", descriptions=");
        sb.append(list2);
        sb.append(", propIcons=");
        sb.append(list3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.titles.hashCode() * 31) + this.descriptions.hashCode()) * 31) + this.propIcons.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.banks.ui.consent.model.AddBankConsentValuePropositions)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.banks.ui.consent.model.AddBankConsentValuePropositions addBankConsentValuePropositions = (com.paypal.oslo.feature.wallet.banks.ui.consent.model.AddBankConsentValuePropositions) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.titles, addBankConsentValuePropositions.titles) && kotlin.jvm.internal.Intrinsics.areEqual(this.descriptions, addBankConsentValuePropositions.descriptions) && kotlin.jvm.internal.Intrinsics.areEqual(this.propIcons, addBankConsentValuePropositions.propIcons);
    }

    public final com.paypal.oslo.feature.wallet.banks.ui.consent.model.AddBankConsentValuePropositions copy(java.util.List<java.lang.Integer> titles, java.util.List<java.lang.Integer> descriptions, java.util.List<? extends com.paypal.pds.core.Icon> propIcons) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(titles, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptions, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(propIcons, "");
        return new com.paypal.oslo.feature.wallet.banks.ui.consent.model.AddBankConsentValuePropositions(titles, descriptions, propIcons);
    }

    public final java.util.List<com.paypal.pds.core.Icon> component3() {
        return this.propIcons;
    }

    public final java.util.List<java.lang.Integer> component2() {
        return this.descriptions;
    }

    public final java.util.List<java.lang.Integer> component1() {
        return this.titles;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.consent.model.AddBankConsentValuePropositions copy$default(com.paypal.oslo.feature.wallet.banks.ui.consent.model.AddBankConsentValuePropositions addBankConsentValuePropositions, java.util.List list, java.util.List list2, java.util.List list3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = addBankConsentValuePropositions.titles;
        }
        if ((i & 2) != 0) {
            list2 = addBankConsentValuePropositions.descriptions;
        }
        if ((i & 4) != 0) {
            list3 = addBankConsentValuePropositions.propIcons;
        }
        return addBankConsentValuePropositions.copy(list, list2, list3);
    }
}
