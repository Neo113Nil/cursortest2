package com.paypal.oslo.feature.p2p.domain.model;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ@\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001d\u0010\fR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001e\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/FundingOptions;", "", "", "Lcom/paypal/oslo/feature/p2p/domain/model/FundingOption;", "allowedOptions", "Lcom/paypal/oslo/feature/p2p/domain/model/Disclosure;", "disclosures", "Lcom/paypal/oslo/feature/p2p/domain/model/Contingency;", "contingencies", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "component3", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/p2p/domain/model/FundingOptions;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getAllowedOptions", "getDisclosures", "getContingencies"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FundingOptions {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.p2p.domain.model.FundingOption> allowedOptions;
    private final java.util.List<com.paypal.oslo.feature.p2p.domain.model.Contingency> contingencies;
    private final java.util.List<com.paypal.oslo.feature.p2p.domain.model.Disclosure> disclosures;

    public FundingOptions(java.util.List<com.paypal.oslo.feature.p2p.domain.model.FundingOption> list, java.util.List<com.paypal.oslo.feature.p2p.domain.model.Disclosure> list2, java.util.List<com.paypal.oslo.feature.p2p.domain.model.Contingency> list3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list3, "");
        this.allowedOptions = list;
        this.disclosures = list2;
        this.contingencies = list3;
    }

    public final java.util.List<com.paypal.oslo.feature.p2p.domain.model.FundingOption> getAllowedOptions() {
        return this.allowedOptions;
    }

    public /* synthetic */ FundingOptions(java.util.List list, java.util.List list2, java.util.List list3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2, (i & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list3);
    }

    public final java.util.List<com.paypal.oslo.feature.p2p.domain.model.Disclosure> getDisclosures() {
        return this.disclosures;
    }

    public final java.util.List<com.paypal.oslo.feature.p2p.domain.model.Contingency> getContingencies() {
        return this.contingencies;
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.p2p.domain.model.FundingOption> list = this.allowedOptions;
        java.util.List<com.paypal.oslo.feature.p2p.domain.model.Disclosure> list2 = this.disclosures;
        java.util.List<com.paypal.oslo.feature.p2p.domain.model.Contingency> list3 = this.contingencies;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FundingOptions(allowedOptions=");
        sb.append(list);
        sb.append(", disclosures=");
        sb.append(list2);
        sb.append(", contingencies=");
        sb.append(list3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.allowedOptions.hashCode() * 31) + this.disclosures.hashCode()) * 31) + this.contingencies.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.p2p.domain.model.FundingOptions)) {
            return false;
        }
        com.paypal.oslo.feature.p2p.domain.model.FundingOptions fundingOptions = (com.paypal.oslo.feature.p2p.domain.model.FundingOptions) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.allowedOptions, fundingOptions.allowedOptions) && kotlin.jvm.internal.Intrinsics.areEqual(this.disclosures, fundingOptions.disclosures) && kotlin.jvm.internal.Intrinsics.areEqual(this.contingencies, fundingOptions.contingencies);
    }

    public final com.paypal.oslo.feature.p2p.domain.model.FundingOptions copy(java.util.List<com.paypal.oslo.feature.p2p.domain.model.FundingOption> allowedOptions, java.util.List<com.paypal.oslo.feature.p2p.domain.model.Disclosure> disclosures, java.util.List<com.paypal.oslo.feature.p2p.domain.model.Contingency> contingencies) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(allowedOptions, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disclosures, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contingencies, "");
        return new com.paypal.oslo.feature.p2p.domain.model.FundingOptions(allowedOptions, disclosures, contingencies);
    }

    public final java.util.List<com.paypal.oslo.feature.p2p.domain.model.Contingency> component3() {
        return this.contingencies;
    }

    public final java.util.List<com.paypal.oslo.feature.p2p.domain.model.Disclosure> component2() {
        return this.disclosures;
    }

    public final java.util.List<com.paypal.oslo.feature.p2p.domain.model.FundingOption> component1() {
        return this.allowedOptions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.FundingOptions copy$default(com.paypal.oslo.feature.p2p.domain.model.FundingOptions fundingOptions, java.util.List list, java.util.List list2, java.util.List list3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = fundingOptions.allowedOptions;
        }
        if ((i & 2) != 0) {
            list2 = fundingOptions.disclosures;
        }
        if ((i & 4) != 0) {
            list3 = fundingOptions.contingencies;
        }
        return fundingOptions.copy(list, list2, list3);
    }
}
