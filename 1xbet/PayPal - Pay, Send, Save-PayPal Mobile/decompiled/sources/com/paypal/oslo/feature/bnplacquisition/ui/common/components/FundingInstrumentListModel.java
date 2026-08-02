package com.paypal.oslo.feature.bnplacquisition.ui.common.components;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011JB\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\rR&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/FundingInstrumentListModel;", "", "", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/FundingInstrumentItemModel;", "fundingInstruments", "Lkotlin/Function1;", "", "", "onInstrumentSelect", "selectedIndex", "<init>", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Ljava/lang/Integer;)V", "component1", "()Ljava/util/List;", "component2", "()Lkotlin/jvm/functions/Function1;", "component3", "()Ljava/lang/Integer;", "copy", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Ljava/lang/Integer;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/FundingInstrumentListModel;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getFundingInstruments", "Lkotlin/jvm/functions/Function1;", "getOnInstrumentSelect", "Ljava/lang/Integer;", "getSelectedIndex"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class FundingInstrumentListModel {
    public static final int $stable = 0;
    private final java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.common.components.FundingInstrumentItemModel> fundingInstruments;
    private final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> onInstrumentSelect;
    private final java.lang.Integer selectedIndex;

    /* JADX WARN: Multi-variable type inference failed */
    public FundingInstrumentListModel(java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.common.components.FundingInstrumentItemModel> list, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function1, java.lang.Integer num) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.fundingInstruments = list;
        this.onInstrumentSelect = function1;
        this.selectedIndex = num;
    }

    public /* synthetic */ FundingInstrumentListModel(java.util.List list, kotlin.jvm.functions.Function1 function1, java.lang.Integer num, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list, function1, (i & 4) != 0 ? null : num);
    }

    public final java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.common.components.FundingInstrumentItemModel> getFundingInstruments() {
        return this.fundingInstruments;
    }

    public final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> getOnInstrumentSelect() {
        return this.onInstrumentSelect;
    }

    public final java.lang.Integer getSelectedIndex() {
        return this.selectedIndex;
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.common.components.FundingInstrumentItemModel> list = this.fundingInstruments;
        kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> function1 = this.onInstrumentSelect;
        java.lang.Integer num = this.selectedIndex;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FundingInstrumentListModel(fundingInstruments=");
        sb.append(list);
        sb.append(", onInstrumentSelect=");
        sb.append(function1);
        sb.append(", selectedIndex=");
        sb.append(num);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.fundingInstruments.hashCode();
        int hashCode2 = this.onInstrumentSelect.hashCode();
        java.lang.Integer num = this.selectedIndex;
        return (((hashCode * 31) + hashCode2) * 31) + (num == null ? 0 : num.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.components.FundingInstrumentListModel)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.FundingInstrumentListModel fundingInstrumentListModel = (com.paypal.oslo.feature.bnplacquisition.ui.common.components.FundingInstrumentListModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.fundingInstruments, fundingInstrumentListModel.fundingInstruments) && kotlin.jvm.internal.Intrinsics.areEqual(this.onInstrumentSelect, fundingInstrumentListModel.onInstrumentSelect) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedIndex, fundingInstrumentListModel.selectedIndex);
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.FundingInstrumentListModel copy(java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.common.components.FundingInstrumentItemModel> fundingInstruments, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onInstrumentSelect, java.lang.Integer selectedIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstruments, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onInstrumentSelect, "");
        return new com.paypal.oslo.feature.bnplacquisition.ui.common.components.FundingInstrumentListModel(fundingInstruments, onInstrumentSelect, selectedIndex);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Integer getSelectedIndex() {
        return this.selectedIndex;
    }

    public final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> component2() {
        return this.onInstrumentSelect;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.common.components.FundingInstrumentItemModel> component1() {
        return this.fundingInstruments;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.components.FundingInstrumentListModel copy$default(com.paypal.oslo.feature.bnplacquisition.ui.common.components.FundingInstrumentListModel fundingInstrumentListModel, java.util.List list, kotlin.jvm.functions.Function1 function1, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = fundingInstrumentListModel.fundingInstruments;
        }
        if ((i & 2) != 0) {
            function1 = fundingInstrumentListModel.onInstrumentSelect;
        }
        if ((i & 4) != 0) {
            num = fundingInstrumentListModel.selectedIndex;
        }
        return fundingInstrumentListModel.copy(list, function1, num);
    }
}
