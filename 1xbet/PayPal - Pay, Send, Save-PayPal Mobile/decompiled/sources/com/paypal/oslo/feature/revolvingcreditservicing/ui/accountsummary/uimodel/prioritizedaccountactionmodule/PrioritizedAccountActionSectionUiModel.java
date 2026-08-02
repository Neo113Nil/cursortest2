package com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.prioritizedaccountactionmodule;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ0\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\tR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/prioritizedaccountactionmodule/PrioritizedAccountActionSectionUiModel;", "", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/PrioritizedAccountActionsUiModel;", "dismissible", "nonDismissible", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/prioritizedaccountactionmodule/PrioritizedAccountActionSectionUiModel;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getDismissible", "getNonDismissible", "firstDismissibleOrNull", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/PrioritizedAccountActionsUiModel;", "getFirstDismissibleOrNull", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/PrioritizedAccountActionsUiModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class PrioritizedAccountActionSectionUiModel {
    public static final int $stable = 0;
    private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel> dismissible;
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel firstDismissibleOrNull;
    private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel> nonDismissible;

    public PrioritizedAccountActionSectionUiModel(java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel> list, java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel> list2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        this.dismissible = list;
        this.nonDismissible = list2;
        this.firstDismissibleOrNull = (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) list);
    }

    public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel> getDismissible() {
        return this.dismissible;
    }

    public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel> getNonDismissible() {
        return this.nonDismissible;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel getFirstDismissibleOrNull() {
        return this.firstDismissibleOrNull;
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel> list = this.dismissible;
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel> list2 = this.nonDismissible;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PrioritizedAccountActionSectionUiModel(dismissible=");
        sb.append(list);
        sb.append(", nonDismissible=");
        sb.append(list2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.dismissible.hashCode() * 31) + this.nonDismissible.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.prioritizedaccountactionmodule.PrioritizedAccountActionSectionUiModel)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.prioritizedaccountactionmodule.PrioritizedAccountActionSectionUiModel prioritizedAccountActionSectionUiModel = (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.prioritizedaccountactionmodule.PrioritizedAccountActionSectionUiModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.dismissible, prioritizedAccountActionSectionUiModel.dismissible) && kotlin.jvm.internal.Intrinsics.areEqual(this.nonDismissible, prioritizedAccountActionSectionUiModel.nonDismissible);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.prioritizedaccountactionmodule.PrioritizedAccountActionSectionUiModel copy(java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel> dismissible, java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel> nonDismissible) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dismissible, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nonDismissible, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.prioritizedaccountactionmodule.PrioritizedAccountActionSectionUiModel(dismissible, nonDismissible);
    }

    public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel> component2() {
        return this.nonDismissible;
    }

    public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel> component1() {
        return this.dismissible;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.prioritizedaccountactionmodule.PrioritizedAccountActionSectionUiModel copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.prioritizedaccountactionmodule.PrioritizedAccountActionSectionUiModel prioritizedAccountActionSectionUiModel, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = prioritizedAccountActionSectionUiModel.dismissible;
        }
        if ((i & 2) != 0) {
            list2 = prioritizedAccountActionSectionUiModel.nonDismissible;
        }
        return prioritizedAccountActionSectionUiModel.copy(list, list2);
    }
}
