package com.paypal.oslo.feature.wallet.fifo.transfer.ui.review;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JD\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u0003\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/WithdrawSpeedSection;", "", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.IS_EXPANDED, "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/WithdrawSpeedUIModel;", "selectedWithdrawSpeed", "", "withdrawSpeedItems", "", "withdrawSpeedError", "<init>", "(ZLcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/WithdrawSpeedUIModel;Ljava/util/List;Ljava/lang/String;)V", "component1", "()Z", "component2", "()Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/WithdrawSpeedUIModel;", "component3", "()Ljava/util/List;", "component4", "()Ljava/lang/String;", "copy", "(ZLcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/WithdrawSpeedUIModel;Ljava/util/List;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/WithdrawSpeedSection;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Z", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/WithdrawSpeedUIModel;", "getSelectedWithdrawSpeed", "Ljava/util/List;", "getWithdrawSpeedItems", "Ljava/lang/String;", "getWithdrawSpeedError"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class WithdrawSpeedSection {
    public static final int $stable = 8;
    private final boolean isExpanded;
    private final com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawSpeedUIModel selectedWithdrawSpeed;
    private final java.lang.String withdrawSpeedError;
    private final java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawSpeedUIModel> withdrawSpeedItems;

    public WithdrawSpeedSection(boolean z, com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawSpeedUIModel withdrawSpeedUIModel, java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawSpeedUIModel> list, java.lang.String str) {
        this.isExpanded = z;
        this.selectedWithdrawSpeed = withdrawSpeedUIModel;
        this.withdrawSpeedItems = list;
        this.withdrawSpeedError = str;
    }

    public /* synthetic */ WithdrawSpeedSection(boolean z, com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawSpeedUIModel withdrawSpeedUIModel, java.util.List list, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : withdrawSpeedUIModel, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : str);
    }

    public final boolean isExpanded() {
        return this.isExpanded;
    }

    public final com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawSpeedUIModel getSelectedWithdrawSpeed() {
        return this.selectedWithdrawSpeed;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawSpeedUIModel> getWithdrawSpeedItems() {
        return this.withdrawSpeedItems;
    }

    public final java.lang.String getWithdrawSpeedError() {
        return this.withdrawSpeedError;
    }

    public final java.lang.String toString() {
        boolean z = this.isExpanded;
        com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawSpeedUIModel withdrawSpeedUIModel = this.selectedWithdrawSpeed;
        java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawSpeedUIModel> list = this.withdrawSpeedItems;
        java.lang.String str = this.withdrawSpeedError;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("WithdrawSpeedSection(isExpanded=");
        sb.append(z);
        sb.append(", selectedWithdrawSpeed=");
        sb.append(withdrawSpeedUIModel);
        sb.append(", withdrawSpeedItems=");
        sb.append(list);
        sb.append(", withdrawSpeedError=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.isExpanded);
        com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawSpeedUIModel withdrawSpeedUIModel = this.selectedWithdrawSpeed;
        int hashCode2 = withdrawSpeedUIModel == null ? 0 : withdrawSpeedUIModel.hashCode();
        java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawSpeedUIModel> list = this.withdrawSpeedItems;
        int hashCode3 = list == null ? 0 : list.hashCode();
        java.lang.String str = this.withdrawSpeedError;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str != null ? str.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawSpeedSection)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawSpeedSection withdrawSpeedSection = (com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawSpeedSection) other;
        return this.isExpanded == withdrawSpeedSection.isExpanded && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedWithdrawSpeed, withdrawSpeedSection.selectedWithdrawSpeed) && kotlin.jvm.internal.Intrinsics.areEqual(this.withdrawSpeedItems, withdrawSpeedSection.withdrawSpeedItems) && kotlin.jvm.internal.Intrinsics.areEqual(this.withdrawSpeedError, withdrawSpeedSection.withdrawSpeedError);
    }

    public final com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawSpeedSection copy(boolean isExpanded, com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawSpeedUIModel selectedWithdrawSpeed, java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawSpeedUIModel> withdrawSpeedItems, java.lang.String withdrawSpeedError) {
        return new com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawSpeedSection(isExpanded, selectedWithdrawSpeed, withdrawSpeedItems, withdrawSpeedError);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getWithdrawSpeedError() {
        return this.withdrawSpeedError;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawSpeedUIModel> component3() {
        return this.withdrawSpeedItems;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawSpeedUIModel getSelectedWithdrawSpeed() {
        return this.selectedWithdrawSpeed;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawSpeedSection copy$default(com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawSpeedSection withdrawSpeedSection, boolean z, com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawSpeedUIModel withdrawSpeedUIModel, java.util.List list, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = withdrawSpeedSection.isExpanded;
        }
        if ((i & 2) != 0) {
            withdrawSpeedUIModel = withdrawSpeedSection.selectedWithdrawSpeed;
        }
        if ((i & 4) != 0) {
            list = withdrawSpeedSection.withdrawSpeedItems;
        }
        if ((i & 8) != 0) {
            str = withdrawSpeedSection.withdrawSpeedError;
        }
        return withdrawSpeedSection.copy(z, withdrawSpeedUIModel, list, str);
    }

    public WithdrawSpeedSection() {
        this(false, null, null, null, 15, null);
    }
}
