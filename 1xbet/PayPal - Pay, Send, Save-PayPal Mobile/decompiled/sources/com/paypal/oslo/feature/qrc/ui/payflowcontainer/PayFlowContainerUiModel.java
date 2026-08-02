package com.paypal.oslo.feature.qrc.ui.payflowcontainer;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B+\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b\u0007\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/payflowcontainer/PayFlowContainerUiModel;", "", "", "Lcom/paypal/oslo/feature/qrc/ui/payflowcontainer/QrcTab;", "availableTabs", "selectedTab", "", "isApiLoading", "<init>", "(Ljava/util/List;Lcom/paypal/oslo/feature/qrc/ui/payflowcontainer/QrcTab;Z)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/paypal/oslo/feature/qrc/ui/payflowcontainer/QrcTab;", "component3", "()Z", "copy", "(Ljava/util/List;Lcom/paypal/oslo/feature/qrc/ui/payflowcontainer/QrcTab;Z)Lcom/paypal/oslo/feature/qrc/ui/payflowcontainer/PayFlowContainerUiModel;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getAvailableTabs", "Lcom/paypal/oslo/feature/qrc/ui/payflowcontainer/QrcTab;", "getSelectedTab", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class PayFlowContainerUiModel {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.qrc.ui.payflowcontainer.QrcTab> availableTabs;
    private final boolean isApiLoading;
    private final com.paypal.oslo.feature.qrc.ui.payflowcontainer.QrcTab selectedTab;

    /* JADX WARN: Multi-variable type inference failed */
    public PayFlowContainerUiModel(java.util.List<? extends com.paypal.oslo.feature.qrc.ui.payflowcontainer.QrcTab> list, com.paypal.oslo.feature.qrc.ui.payflowcontainer.QrcTab qrcTab, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qrcTab, "");
        this.availableTabs = list;
        this.selectedTab = qrcTab;
        this.isApiLoading = z;
    }

    public /* synthetic */ PayFlowContainerUiModel(java.util.List list, com.paypal.oslo.feature.qrc.ui.payflowcontainer.QrcTab qrcTab, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.qrc.ui.payflowcontainer.QrcTab.Scanner) : list, (i & 2) != 0 ? com.paypal.oslo.feature.qrc.ui.payflowcontainer.QrcTab.Scanner : qrcTab, (i & 4) != 0 ? false : z);
    }

    public final java.util.List<com.paypal.oslo.feature.qrc.ui.payflowcontainer.QrcTab> getAvailableTabs() {
        return this.availableTabs;
    }

    public final com.paypal.oslo.feature.qrc.ui.payflowcontainer.QrcTab getSelectedTab() {
        return this.selectedTab;
    }

    public final boolean isApiLoading() {
        return this.isApiLoading;
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.qrc.ui.payflowcontainer.QrcTab> list = this.availableTabs;
        com.paypal.oslo.feature.qrc.ui.payflowcontainer.QrcTab qrcTab = this.selectedTab;
        boolean z = this.isApiLoading;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PayFlowContainerUiModel(availableTabs=");
        sb.append(list);
        sb.append(", selectedTab=");
        sb.append(qrcTab);
        sb.append(", isApiLoading=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.availableTabs.hashCode() * 31) + this.selectedTab.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isApiLoading);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerUiModel)) {
            return false;
        }
        com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerUiModel payFlowContainerUiModel = (com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerUiModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.availableTabs, payFlowContainerUiModel.availableTabs) && this.selectedTab == payFlowContainerUiModel.selectedTab && this.isApiLoading == payFlowContainerUiModel.isApiLoading;
    }

    public final com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerUiModel copy(java.util.List<? extends com.paypal.oslo.feature.qrc.ui.payflowcontainer.QrcTab> availableTabs, com.paypal.oslo.feature.qrc.ui.payflowcontainer.QrcTab selectedTab, boolean isApiLoading) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableTabs, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedTab, "");
        return new com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerUiModel(availableTabs, selectedTab, isApiLoading);
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsApiLoading() {
        return this.isApiLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.qrc.ui.payflowcontainer.QrcTab getSelectedTab() {
        return this.selectedTab;
    }

    public final java.util.List<com.paypal.oslo.feature.qrc.ui.payflowcontainer.QrcTab> component1() {
        return this.availableTabs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerUiModel copy$default(com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerUiModel payFlowContainerUiModel, java.util.List list, com.paypal.oslo.feature.qrc.ui.payflowcontainer.QrcTab qrcTab, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = payFlowContainerUiModel.availableTabs;
        }
        if ((i & 2) != 0) {
            qrcTab = payFlowContainerUiModel.selectedTab;
        }
        if ((i & 4) != 0) {
            z = payFlowContainerUiModel.isApiLoading;
        }
        return payFlowContainerUiModel.copy(list, qrcTab, z);
    }

    public PayFlowContainerUiModel() {
        this(null, null, false, 7, null);
    }
}
