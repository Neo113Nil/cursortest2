package com.paypal.oslo.feature.wallet.fifo.transfer.ui.review;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0013J\u0010\u0010\u001a\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJh\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b$\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b\u0003\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0013R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u0015R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b*\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b,\u0010\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b-\u0010\u0013R\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b/\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/WithdrawFISection;", "", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.IS_EXPANDED, "Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentUiModel;", "selectedFundingInstrument", "", "fundingInstruments", "ineligibleFundingInstruments", "", "fundingInstrumentError", "ineligibleFiAdded", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/AddFIAvailability;", "addFIAvailability", "<init>", "(ZLcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentUiModel;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentUiModel;Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/AddFIAvailability;)V", "component1", "()Z", "component2", "()Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentUiModel;", "component3", "()Ljava/util/List;", "component4", "component5", "()Ljava/lang/String;", "component6", "component7", "()Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/AddFIAvailability;", "copy", "(ZLcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentUiModel;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentUiModel;Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/AddFIAvailability;)Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/WithdrawFISection;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Z", "Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentUiModel;", "getSelectedFundingInstrument", "Ljava/util/List;", "getFundingInstruments", "getIneligibleFundingInstruments", "Ljava/lang/String;", "getFundingInstrumentError", "getIneligibleFiAdded", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/AddFIAvailability;", "getAddFIAvailability"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class WithdrawFISection {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.AddFIAvailability addFIAvailability;
    private final java.lang.String fundingInstrumentError;
    private final java.util.List<com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel> fundingInstruments;
    private final com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel ineligibleFiAdded;
    private final java.util.List<com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel> ineligibleFundingInstruments;
    private final boolean isExpanded;
    private final com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel selectedFundingInstrument;

    public WithdrawFISection(boolean z, com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel fundingInstrumentUiModel, java.util.List<com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel> list, java.util.List<com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel> list2, java.lang.String str, com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel fundingInstrumentUiModel2, com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.AddFIAvailability addFIAvailability) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addFIAvailability, "");
        this.isExpanded = z;
        this.selectedFundingInstrument = fundingInstrumentUiModel;
        this.fundingInstruments = list;
        this.ineligibleFundingInstruments = list2;
        this.fundingInstrumentError = str;
        this.ineligibleFiAdded = fundingInstrumentUiModel2;
        this.addFIAvailability = addFIAvailability;
    }

    public final boolean isExpanded() {
        return this.isExpanded;
    }

    public final com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel getSelectedFundingInstrument() {
        return this.selectedFundingInstrument;
    }

    public /* synthetic */ WithdrawFISection(boolean z, com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel fundingInstrumentUiModel, java.util.List list, java.util.List list2, java.lang.String str, com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel fundingInstrumentUiModel2, com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.AddFIAvailability addFIAvailability, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : fundingInstrumentUiModel, (i & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 8) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2, (i & 16) != 0 ? null : str, (i & 32) == 0 ? fundingInstrumentUiModel2 : null, (i & 64) != 0 ? com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.AddFIAvailability.BANK_AND_CARD : addFIAvailability);
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel> getFundingInstruments() {
        return this.fundingInstruments;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel> getIneligibleFundingInstruments() {
        return this.ineligibleFundingInstruments;
    }

    public final java.lang.String getFundingInstrumentError() {
        return this.fundingInstrumentError;
    }

    public final com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel getIneligibleFiAdded() {
        return this.ineligibleFiAdded;
    }

    public final com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.AddFIAvailability getAddFIAvailability() {
        return this.addFIAvailability;
    }

    public final java.lang.String toString() {
        boolean z = this.isExpanded;
        com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel fundingInstrumentUiModel = this.selectedFundingInstrument;
        java.util.List<com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel> list = this.fundingInstruments;
        java.util.List<com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel> list2 = this.ineligibleFundingInstruments;
        java.lang.String str = this.fundingInstrumentError;
        com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel fundingInstrumentUiModel2 = this.ineligibleFiAdded;
        com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.AddFIAvailability addFIAvailability = this.addFIAvailability;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("WithdrawFISection(isExpanded=");
        sb.append(z);
        sb.append(", selectedFundingInstrument=");
        sb.append(fundingInstrumentUiModel);
        sb.append(", fundingInstruments=");
        sb.append(list);
        sb.append(", ineligibleFundingInstruments=");
        sb.append(list2);
        sb.append(", fundingInstrumentError=");
        sb.append(str);
        sb.append(", ineligibleFiAdded=");
        sb.append(fundingInstrumentUiModel2);
        sb.append(", addFIAvailability=");
        sb.append(addFIAvailability);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.isExpanded);
        com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel fundingInstrumentUiModel = this.selectedFundingInstrument;
        int hashCode2 = fundingInstrumentUiModel == null ? 0 : fundingInstrumentUiModel.hashCode();
        int hashCode3 = this.fundingInstruments.hashCode();
        int hashCode4 = this.ineligibleFundingInstruments.hashCode();
        java.lang.String str = this.fundingInstrumentError;
        int hashCode5 = str == null ? 0 : str.hashCode();
        com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel fundingInstrumentUiModel2 = this.ineligibleFiAdded;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (fundingInstrumentUiModel2 != null ? fundingInstrumentUiModel2.hashCode() : 0)) * 31) + this.addFIAvailability.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawFISection)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawFISection withdrawFISection = (com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawFISection) other;
        return this.isExpanded == withdrawFISection.isExpanded && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedFundingInstrument, withdrawFISection.selectedFundingInstrument) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingInstruments, withdrawFISection.fundingInstruments) && kotlin.jvm.internal.Intrinsics.areEqual(this.ineligibleFundingInstruments, withdrawFISection.ineligibleFundingInstruments) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingInstrumentError, withdrawFISection.fundingInstrumentError) && kotlin.jvm.internal.Intrinsics.areEqual(this.ineligibleFiAdded, withdrawFISection.ineligibleFiAdded) && this.addFIAvailability == withdrawFISection.addFIAvailability;
    }

    public final com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawFISection copy(boolean isExpanded, com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel selectedFundingInstrument, java.util.List<com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel> fundingInstruments, java.util.List<com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel> ineligibleFundingInstruments, java.lang.String fundingInstrumentError, com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel ineligibleFiAdded, com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.AddFIAvailability addFIAvailability) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstruments, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ineligibleFundingInstruments, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addFIAvailability, "");
        return new com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawFISection(isExpanded, selectedFundingInstrument, fundingInstruments, ineligibleFundingInstruments, fundingInstrumentError, ineligibleFiAdded, addFIAvailability);
    }

    /* renamed from: component7, reason: from getter */
    public final com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.AddFIAvailability getAddFIAvailability() {
        return this.addFIAvailability;
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel getIneligibleFiAdded() {
        return this.ineligibleFiAdded;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getFundingInstrumentError() {
        return this.fundingInstrumentError;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel> component4() {
        return this.ineligibleFundingInstruments;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel> component3() {
        return this.fundingInstruments;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel getSelectedFundingInstrument() {
        return this.selectedFundingInstrument;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawFISection copy$default(com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawFISection withdrawFISection, boolean z, com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel fundingInstrumentUiModel, java.util.List list, java.util.List list2, java.lang.String str, com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel fundingInstrumentUiModel2, com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.AddFIAvailability addFIAvailability, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = withdrawFISection.isExpanded;
        }
        if ((i & 2) != 0) {
            fundingInstrumentUiModel = withdrawFISection.selectedFundingInstrument;
        }
        com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel fundingInstrumentUiModel3 = fundingInstrumentUiModel;
        if ((i & 4) != 0) {
            list = withdrawFISection.fundingInstruments;
        }
        java.util.List list3 = list;
        if ((i & 8) != 0) {
            list2 = withdrawFISection.ineligibleFundingInstruments;
        }
        java.util.List list4 = list2;
        if ((i & 16) != 0) {
            str = withdrawFISection.fundingInstrumentError;
        }
        java.lang.String str2 = str;
        if ((i & 32) != 0) {
            fundingInstrumentUiModel2 = withdrawFISection.ineligibleFiAdded;
        }
        com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel fundingInstrumentUiModel4 = fundingInstrumentUiModel2;
        if ((i & 64) != 0) {
            addFIAvailability = withdrawFISection.addFIAvailability;
        }
        return withdrawFISection.copy(z, fundingInstrumentUiModel3, list3, list4, str2, fundingInstrumentUiModel4, addFIAvailability);
    }

    public WithdrawFISection() {
        this(false, null, null, null, null, null, null, 127, null);
    }
}
