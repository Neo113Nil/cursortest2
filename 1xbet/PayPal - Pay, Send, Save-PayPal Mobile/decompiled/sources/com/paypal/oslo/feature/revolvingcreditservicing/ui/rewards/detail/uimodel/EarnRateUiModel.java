package com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001e\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/uimodel/EarnRateUiModel;", "", "Lcom/paypal/pds/core/Icon;", "icon", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "title", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "<init>", "(Lcom/paypal/pds/core/Icon;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;)V", "component1", "()Lcom/paypal/pds/core/Icon;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "component3", "copy", "(Lcom/paypal/pds/core/Icon;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/uimodel/EarnRateUiModel;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/pds/core/Icon;", "getIcon", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "getTitle", "getDescription"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class EarnRateUiModel {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString description;
    private final com.paypal.pds.core.Icon icon;
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString title;

    public EarnRateUiModel(com.paypal.pds.core.Icon icon, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiString, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiString2, "");
        this.icon = icon;
        this.title = uiString;
        this.description = uiString2;
    }

    public final com.paypal.pds.core.Icon getIcon() {
        return this.icon;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getTitle() {
        return this.title;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getDescription() {
        return this.description;
    }

    public final java.lang.String toString() {
        com.paypal.pds.core.Icon icon = this.icon;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString = this.title;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2 = this.description;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EarnRateUiModel(icon=");
        sb.append(icon);
        sb.append(", title=");
        sb.append(uiString);
        sb.append(", description=");
        sb.append(uiString2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.icon.hashCode() * 31) + this.title.hashCode()) * 31) + this.description.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.EarnRateUiModel)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.EarnRateUiModel earnRateUiModel = (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.EarnRateUiModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.icon, earnRateUiModel.icon) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, earnRateUiModel.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, earnRateUiModel.description);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.EarnRateUiModel copy(com.paypal.pds.core.Icon icon, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString title, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString description) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.EarnRateUiModel(icon, title, description);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getDescription() {
        return this.description;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getTitle() {
        return this.title;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.pds.core.Icon getIcon() {
        return this.icon;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.EarnRateUiModel copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.EarnRateUiModel earnRateUiModel, com.paypal.pds.core.Icon icon, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            icon = earnRateUiModel.icon;
        }
        if ((i & 2) != 0) {
            uiString = earnRateUiModel.title;
        }
        if ((i & 4) != 0) {
            uiString2 = earnRateUiModel.description;
        }
        return earnRateUiModel.copy(icon, uiString, uiString2);
    }
}
