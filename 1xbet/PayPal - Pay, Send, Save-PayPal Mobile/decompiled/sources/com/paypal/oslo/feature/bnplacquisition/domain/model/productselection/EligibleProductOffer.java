package com.paypal.oslo.feature.bnplacquisition.domain.model.productselection;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J8\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/productselection/EligibleProductOffer;", "", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/productselection/CreditProductIdentifier;", "creditProductIdentifier", "", "id", "", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/offers/Offer;", "offers", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/productselection/CreditProductIdentifier;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/productselection/CreditProductIdentifier;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/productselection/CreditProductIdentifier;Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/productselection/EligibleProductOffer;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/productselection/CreditProductIdentifier;", "getCreditProductIdentifier", "Ljava/lang/String;", "getId", "Ljava/util/List;", "getOffers"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class EligibleProductOffer {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier creditProductIdentifier;
    private final java.lang.String id;
    private final java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.offers.Offer> offers;

    public EligibleProductOffer(com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier creditProductIdentifier, java.lang.String str, java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.offers.Offer> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        this.creditProductIdentifier = creditProductIdentifier;
        this.id = str;
        this.offers = list;
    }

    public /* synthetic */ EligibleProductOffer(com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier creditProductIdentifier, java.lang.String str, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(creditProductIdentifier, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list);
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier getCreditProductIdentifier() {
        return this.creditProductIdentifier;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.offers.Offer> getOffers() {
        return this.offers;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier creditProductIdentifier = this.creditProductIdentifier;
        java.lang.String str = this.id;
        java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.offers.Offer> list = this.offers;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EligibleProductOffer(creditProductIdentifier=");
        sb.append(creditProductIdentifier);
        sb.append(", id=");
        sb.append(str);
        sb.append(", offers=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.creditProductIdentifier.hashCode();
        java.lang.String str = this.id;
        int hashCode2 = str == null ? 0 : str.hashCode();
        java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.offers.Offer> list = this.offers;
        return (((hashCode * 31) + hashCode2) * 31) + (list != null ? list.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.EligibleProductOffer)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.EligibleProductOffer eligibleProductOffer = (com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.EligibleProductOffer) other;
        return this.creditProductIdentifier == eligibleProductOffer.creditProductIdentifier && kotlin.jvm.internal.Intrinsics.areEqual(this.id, eligibleProductOffer.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.offers, eligibleProductOffer.offers);
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.EligibleProductOffer copy(com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier creditProductIdentifier, java.lang.String id, java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.offers.Offer> offers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.EligibleProductOffer(creditProductIdentifier, id, offers);
    }

    public final java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.offers.Offer> component3() {
        return this.offers;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier getCreditProductIdentifier() {
        return this.creditProductIdentifier;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.EligibleProductOffer copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.EligibleProductOffer eligibleProductOffer, com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier creditProductIdentifier, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            creditProductIdentifier = eligibleProductOffer.creditProductIdentifier;
        }
        if ((i & 2) != 0) {
            str = eligibleProductOffer.id;
        }
        if ((i & 4) != 0) {
            list = eligibleProductOffer.offers;
        }
        return eligibleProductOffer.copy(creditProductIdentifier, str, list);
    }
}
