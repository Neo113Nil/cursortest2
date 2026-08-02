package com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0012Jj\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\"\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b\u0003\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0012R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u0014R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b(\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b+\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b,\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/FundingSourceSection;", "", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.IS_EXPANDED, "Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentUiModel;", "selectedFundingSource", "", "fundingSources", "ineligibleFundingSources", "", "fundingSourceError", "selectedAmount", "ineligibleFiAdded", "<init>", "(ZLcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentUiModel;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentUiModel;)V", "component1", "()Z", "component2", "()Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentUiModel;", "component3", "()Ljava/util/List;", "component4", "component5", "()Ljava/lang/String;", "component6", "component7", "copy", "(ZLcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentUiModel;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentUiModel;)Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/FundingSourceSection;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Z", "Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentUiModel;", "getSelectedFundingSource", "Ljava/util/List;", "getFundingSources", "getIneligibleFundingSources", "Ljava/lang/String;", "getFundingSourceError", "getSelectedAmount", "getIneligibleFiAdded"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class FundingSourceSection {
    public static final int $stable = 0;
    private final java.lang.String fundingSourceError;
    private final java.util.List<com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel> fundingSources;
    private final com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel ineligibleFiAdded;
    private final java.util.List<com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel> ineligibleFundingSources;
    private final boolean isExpanded;
    private final java.lang.String selectedAmount;
    private final com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel selectedFundingSource;

    public FundingSourceSection(boolean z, com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel fundingInstrumentUiModel, java.util.List<com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel> list, java.util.List<com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel> list2, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel fundingInstrumentUiModel2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        this.isExpanded = z;
        this.selectedFundingSource = fundingInstrumentUiModel;
        this.fundingSources = list;
        this.ineligibleFundingSources = list2;
        this.fundingSourceError = str;
        this.selectedAmount = str2;
        this.ineligibleFiAdded = fundingInstrumentUiModel2;
    }

    public final boolean isExpanded() {
        return this.isExpanded;
    }

    public final com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel getSelectedFundingSource() {
        return this.selectedFundingSource;
    }

    public /* synthetic */ FundingSourceSection(boolean z, com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel fundingInstrumentUiModel, java.util.List list, java.util.List list2, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel fundingInstrumentUiModel2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : fundingInstrumentUiModel, (i & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 8) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : str2, (i & 64) == 0 ? fundingInstrumentUiModel2 : null);
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel> getFundingSources() {
        return this.fundingSources;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel> getIneligibleFundingSources() {
        return this.ineligibleFundingSources;
    }

    public final java.lang.String getFundingSourceError() {
        return this.fundingSourceError;
    }

    public final java.lang.String getSelectedAmount() {
        return this.selectedAmount;
    }

    public final com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel getIneligibleFiAdded() {
        return this.ineligibleFiAdded;
    }

    public final java.lang.String toString() {
        boolean z = this.isExpanded;
        com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel fundingInstrumentUiModel = this.selectedFundingSource;
        java.util.List<com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel> list = this.fundingSources;
        java.util.List<com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel> list2 = this.ineligibleFundingSources;
        java.lang.String str = this.fundingSourceError;
        java.lang.String str2 = this.selectedAmount;
        com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel fundingInstrumentUiModel2 = this.ineligibleFiAdded;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FundingSourceSection(isExpanded=");
        sb.append(z);
        sb.append(", selectedFundingSource=");
        sb.append(fundingInstrumentUiModel);
        sb.append(", fundingSources=");
        sb.append(list);
        sb.append(", ineligibleFundingSources=");
        sb.append(list2);
        sb.append(", fundingSourceError=");
        sb.append(str);
        sb.append(", selectedAmount=");
        sb.append(str2);
        sb.append(", ineligibleFiAdded=");
        sb.append(fundingInstrumentUiModel2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.isExpanded);
        com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel fundingInstrumentUiModel = this.selectedFundingSource;
        int hashCode2 = fundingInstrumentUiModel == null ? 0 : fundingInstrumentUiModel.hashCode();
        int hashCode3 = this.fundingSources.hashCode();
        int hashCode4 = this.ineligibleFundingSources.hashCode();
        java.lang.String str = this.fundingSourceError;
        int hashCode5 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.selectedAmount;
        int hashCode6 = str2 == null ? 0 : str2.hashCode();
        com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel fundingInstrumentUiModel2 = this.ineligibleFiAdded;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (fundingInstrumentUiModel2 != null ? fundingInstrumentUiModel2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.FundingSourceSection)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.FundingSourceSection fundingSourceSection = (com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.FundingSourceSection) other;
        return this.isExpanded == fundingSourceSection.isExpanded && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedFundingSource, fundingSourceSection.selectedFundingSource) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingSources, fundingSourceSection.fundingSources) && kotlin.jvm.internal.Intrinsics.areEqual(this.ineligibleFundingSources, fundingSourceSection.ineligibleFundingSources) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingSourceError, fundingSourceSection.fundingSourceError) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedAmount, fundingSourceSection.selectedAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.ineligibleFiAdded, fundingSourceSection.ineligibleFiAdded);
    }

    public final com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.FundingSourceSection copy(boolean isExpanded, com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel selectedFundingSource, java.util.List<com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel> fundingSources, java.util.List<com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel> ineligibleFundingSources, java.lang.String fundingSourceError, java.lang.String selectedAmount, com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel ineligibleFiAdded) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingSources, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ineligibleFundingSources, "");
        return new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.FundingSourceSection(isExpanded, selectedFundingSource, fundingSources, ineligibleFundingSources, fundingSourceError, selectedAmount, ineligibleFiAdded);
    }

    /* renamed from: component7, reason: from getter */
    public final com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel getIneligibleFiAdded() {
        return this.ineligibleFiAdded;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getSelectedAmount() {
        return this.selectedAmount;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getFundingSourceError() {
        return this.fundingSourceError;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel> component4() {
        return this.ineligibleFundingSources;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel> component3() {
        return this.fundingSources;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel getSelectedFundingSource() {
        return this.selectedFundingSource;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.FundingSourceSection copy$default(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.FundingSourceSection fundingSourceSection, boolean z, com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel fundingInstrumentUiModel, java.util.List list, java.util.List list2, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel fundingInstrumentUiModel2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = fundingSourceSection.isExpanded;
        }
        if ((i & 2) != 0) {
            fundingInstrumentUiModel = fundingSourceSection.selectedFundingSource;
        }
        com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel fundingInstrumentUiModel3 = fundingInstrumentUiModel;
        if ((i & 4) != 0) {
            list = fundingSourceSection.fundingSources;
        }
        java.util.List list3 = list;
        if ((i & 8) != 0) {
            list2 = fundingSourceSection.ineligibleFundingSources;
        }
        java.util.List list4 = list2;
        if ((i & 16) != 0) {
            str = fundingSourceSection.fundingSourceError;
        }
        java.lang.String str3 = str;
        if ((i & 32) != 0) {
            str2 = fundingSourceSection.selectedAmount;
        }
        java.lang.String str4 = str2;
        if ((i & 64) != 0) {
            fundingInstrumentUiModel2 = fundingSourceSection.ineligibleFiAdded;
        }
        return fundingSourceSection.copy(z, fundingInstrumentUiModel3, list3, list4, str3, str4, fundingInstrumentUiModel2);
    }

    public FundingSourceSection() {
        this(false, null, null, null, null, null, null, 127, null);
    }
}
