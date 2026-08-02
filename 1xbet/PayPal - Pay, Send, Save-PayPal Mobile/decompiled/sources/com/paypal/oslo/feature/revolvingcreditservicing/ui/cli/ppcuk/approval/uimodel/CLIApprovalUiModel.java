package com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001e\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/uimodel/CLIApprovalUiModel;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "newCreditLimit", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "currentCreditLimitAmount", "newCreditLimitAmount", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "component2", "component3", "component4", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/approval/uimodel/CLIApprovalUiModel;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "getNewCreditLimit", "getDescription", "getCurrentCreditLimitAmount", "getNewCreditLimitAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class CLIApprovalUiModel {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString currentCreditLimitAmount;
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString description;
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString newCreditLimit;
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString newCreditLimitAmount;

    public CLIApprovalUiModel(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString3, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiString, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiString2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiString3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiString4, "");
        this.newCreditLimit = uiString;
        this.description = uiString2;
        this.currentCreditLimitAmount = uiString3;
        this.newCreditLimitAmount = uiString4;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getNewCreditLimit() {
        return this.newCreditLimit;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getDescription() {
        return this.description;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getCurrentCreditLimitAmount() {
        return this.currentCreditLimitAmount;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getNewCreditLimitAmount() {
        return this.newCreditLimitAmount;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString = this.newCreditLimit;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2 = this.description;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString3 = this.currentCreditLimitAmount;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString4 = this.newCreditLimitAmount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CLIApprovalUiModel(newCreditLimit=");
        sb.append(uiString);
        sb.append(", description=");
        sb.append(uiString2);
        sb.append(", currentCreditLimitAmount=");
        sb.append(uiString3);
        sb.append(", newCreditLimitAmount=");
        sb.append(uiString4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.newCreditLimit.hashCode() * 31) + this.description.hashCode()) * 31) + this.currentCreditLimitAmount.hashCode()) * 31) + this.newCreditLimitAmount.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIApprovalUiModel)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIApprovalUiModel cLIApprovalUiModel = (com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIApprovalUiModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.newCreditLimit, cLIApprovalUiModel.newCreditLimit) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, cLIApprovalUiModel.description) && kotlin.jvm.internal.Intrinsics.areEqual(this.currentCreditLimitAmount, cLIApprovalUiModel.currentCreditLimitAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.newCreditLimitAmount, cLIApprovalUiModel.newCreditLimitAmount);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIApprovalUiModel copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString newCreditLimit, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString description, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString currentCreditLimitAmount, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString newCreditLimitAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newCreditLimit, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentCreditLimitAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newCreditLimitAmount, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIApprovalUiModel(newCreditLimit, description, currentCreditLimitAmount, newCreditLimitAmount);
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getNewCreditLimitAmount() {
        return this.newCreditLimitAmount;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getCurrentCreditLimitAmount() {
        return this.currentCreditLimitAmount;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getDescription() {
        return this.description;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getNewCreditLimit() {
        return this.newCreditLimit;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIApprovalUiModel copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.uimodel.CLIApprovalUiModel cLIApprovalUiModel, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString3, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            uiString = cLIApprovalUiModel.newCreditLimit;
        }
        if ((i & 2) != 0) {
            uiString2 = cLIApprovalUiModel.description;
        }
        if ((i & 4) != 0) {
            uiString3 = cLIApprovalUiModel.currentCreditLimitAmount;
        }
        if ((i & 8) != 0) {
            uiString4 = cLIApprovalUiModel.newCreditLimitAmount;
        }
        return cLIApprovalUiModel.copy(uiString, uiString2, uiString3, uiString4);
    }
}
