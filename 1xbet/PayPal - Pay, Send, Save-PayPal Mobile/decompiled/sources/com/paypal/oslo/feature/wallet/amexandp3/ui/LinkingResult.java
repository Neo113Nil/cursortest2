package com.paypal.oslo.feature.wallet.amexandp3.ui;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ:\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/amexandp3/ui/LinkingResult;", "", "", "Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/ProvisionInstrumentInfo;", "linkedInstruments", "nonLinkedInstruments", "", "partnerLink", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/util/List;", "component2", "component3", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/amexandp3/ui/LinkingResult;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/List;", "getLinkedInstruments", "getNonLinkedInstruments", "Ljava/lang/String;", "getPartnerLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class LinkingResult {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentInfo> linkedInstruments;
    private final java.util.List<com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentInfo> nonLinkedInstruments;
    private final java.lang.String partnerLink;

    /* JADX WARN: Multi-variable type inference failed */
    public LinkingResult(java.util.List<? extends com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentInfo> list, java.util.List<? extends com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentInfo> list2, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.linkedInstruments = list;
        this.nonLinkedInstruments = list2;
        this.partnerLink = str;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentInfo> getLinkedInstruments() {
        return this.linkedInstruments;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentInfo> getNonLinkedInstruments() {
        return this.nonLinkedInstruments;
    }

    public final java.lang.String getPartnerLink() {
        return this.partnerLink;
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentInfo> list = this.linkedInstruments;
        java.util.List<com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentInfo> list2 = this.nonLinkedInstruments;
        java.lang.String str = this.partnerLink;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LinkingResult(linkedInstruments=");
        sb.append(list);
        sb.append(", nonLinkedInstruments=");
        sb.append(list2);
        sb.append(", partnerLink=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.linkedInstruments.hashCode() * 31) + this.nonLinkedInstruments.hashCode()) * 31) + this.partnerLink.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.amexandp3.ui.LinkingResult)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.amexandp3.ui.LinkingResult linkingResult = (com.paypal.oslo.feature.wallet.amexandp3.ui.LinkingResult) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.linkedInstruments, linkingResult.linkedInstruments) && kotlin.jvm.internal.Intrinsics.areEqual(this.nonLinkedInstruments, linkingResult.nonLinkedInstruments) && kotlin.jvm.internal.Intrinsics.areEqual(this.partnerLink, linkingResult.partnerLink);
    }

    public final com.paypal.oslo.feature.wallet.amexandp3.ui.LinkingResult copy(java.util.List<? extends com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentInfo> linkedInstruments, java.util.List<? extends com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentInfo> nonLinkedInstruments, java.lang.String partnerLink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedInstruments, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nonLinkedInstruments, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(partnerLink, "");
        return new com.paypal.oslo.feature.wallet.amexandp3.ui.LinkingResult(linkedInstruments, nonLinkedInstruments, partnerLink);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getPartnerLink() {
        return this.partnerLink;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentInfo> component2() {
        return this.nonLinkedInstruments;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentInfo> component1() {
        return this.linkedInstruments;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.wallet.amexandp3.ui.LinkingResult copy$default(com.paypal.oslo.feature.wallet.amexandp3.ui.LinkingResult linkingResult, java.util.List list, java.util.List list2, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = linkingResult.linkedInstruments;
        }
        if ((i & 2) != 0) {
            list2 = linkingResult.nonLinkedInstruments;
        }
        if ((i & 4) != 0) {
            str = linkingResult.partnerLink;
        }
        return linkingResult.copy(list, list2, str);
    }
}
