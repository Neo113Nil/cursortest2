package com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.uimodel;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u0006\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/manage/uimodel/CreditLimitIncreaseToggleUiModel;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "title", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "", "isEnabled", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Z)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "component2", "component3", "()Z", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Z)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/manage/uimodel/CreditLimitIncreaseToggleUiModel;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "getTitle", "getDescription", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class CreditLimitIncreaseToggleUiModel {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString description;
    private final boolean isEnabled;
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString title;

    public CreditLimitIncreaseToggleUiModel(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiString, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiString2, "");
        this.title = uiString;
        this.description = uiString2;
        this.isEnabled = z;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getTitle() {
        return this.title;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getDescription() {
        return this.description;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString = this.title;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2 = this.description;
        boolean z = this.isEnabled;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CreditLimitIncreaseToggleUiModel(title=");
        sb.append(uiString);
        sb.append(", description=");
        sb.append(uiString2);
        sb.append(", isEnabled=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isEnabled);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.uimodel.CreditLimitIncreaseToggleUiModel)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.uimodel.CreditLimitIncreaseToggleUiModel creditLimitIncreaseToggleUiModel = (com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.uimodel.CreditLimitIncreaseToggleUiModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.title, creditLimitIncreaseToggleUiModel.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, creditLimitIncreaseToggleUiModel.description) && this.isEnabled == creditLimitIncreaseToggleUiModel.isEnabled;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.uimodel.CreditLimitIncreaseToggleUiModel copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString title, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString description, boolean isEnabled) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.uimodel.CreditLimitIncreaseToggleUiModel(title, description, isEnabled);
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getDescription() {
        return this.description;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getTitle() {
        return this.title;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.uimodel.CreditLimitIncreaseToggleUiModel copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.uimodel.CreditLimitIncreaseToggleUiModel creditLimitIncreaseToggleUiModel, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            uiString = creditLimitIncreaseToggleUiModel.title;
        }
        if ((i & 2) != 0) {
            uiString2 = creditLimitIncreaseToggleUiModel.description;
        }
        if ((i & 4) != 0) {
            z = creditLimitIncreaseToggleUiModel.isEnabled;
        }
        return creditLimitIncreaseToggleUiModel.copy(uiString, uiString2, z);
    }
}
