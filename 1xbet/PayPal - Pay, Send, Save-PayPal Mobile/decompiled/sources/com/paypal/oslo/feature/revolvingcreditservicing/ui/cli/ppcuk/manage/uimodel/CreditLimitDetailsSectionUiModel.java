package com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.uimodel;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/manage/uimodel/CreditLimitDetailsSectionUiModel;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "creditLimitLabel", "creditLimitValue", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "component2", "component3", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/manage/uimodel/CreditLimitDetailsSectionUiModel;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "getCreditLimitLabel", "getCreditLimitValue", "getDescription"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class CreditLimitDetailsSectionUiModel {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString creditLimitLabel;
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString creditLimitValue;
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString description;

    public CreditLimitDetailsSectionUiModel(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiString, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiString2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiString3, "");
        this.creditLimitLabel = uiString;
        this.creditLimitValue = uiString2;
        this.description = uiString3;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getCreditLimitLabel() {
        return this.creditLimitLabel;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getCreditLimitValue() {
        return this.creditLimitValue;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getDescription() {
        return this.description;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString = this.creditLimitLabel;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2 = this.creditLimitValue;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString3 = this.description;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CreditLimitDetailsSectionUiModel(creditLimitLabel=");
        sb.append(uiString);
        sb.append(", creditLimitValue=");
        sb.append(uiString2);
        sb.append(", description=");
        sb.append(uiString3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.creditLimitLabel.hashCode() * 31) + this.creditLimitValue.hashCode()) * 31) + this.description.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.uimodel.CreditLimitDetailsSectionUiModel)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.uimodel.CreditLimitDetailsSectionUiModel creditLimitDetailsSectionUiModel = (com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.uimodel.CreditLimitDetailsSectionUiModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.creditLimitLabel, creditLimitDetailsSectionUiModel.creditLimitLabel) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditLimitValue, creditLimitDetailsSectionUiModel.creditLimitValue) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, creditLimitDetailsSectionUiModel.description);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.uimodel.CreditLimitDetailsSectionUiModel copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString creditLimitLabel, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString creditLimitValue, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString description) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditLimitLabel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditLimitValue, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.uimodel.CreditLimitDetailsSectionUiModel(creditLimitLabel, creditLimitValue, description);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getDescription() {
        return this.description;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getCreditLimitValue() {
        return this.creditLimitValue;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getCreditLimitLabel() {
        return this.creditLimitLabel;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.uimodel.CreditLimitDetailsSectionUiModel copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.uimodel.CreditLimitDetailsSectionUiModel creditLimitDetailsSectionUiModel, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            uiString = creditLimitDetailsSectionUiModel.creditLimitLabel;
        }
        if ((i & 2) != 0) {
            uiString2 = creditLimitDetailsSectionUiModel.creditLimitValue;
        }
        if ((i & 4) != 0) {
            uiString3 = creditLimitDetailsSectionUiModel.description;
        }
        return creditLimitDetailsSectionUiModel.copy(uiString, uiString2, uiString3);
    }
}
