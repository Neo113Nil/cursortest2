package com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.uimodel;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ2\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001e\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/uimodel/AutopayCardUiModel;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "title", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/autopaystatus/autopayRow/AutopayRowUiModel;", "status", "infoMessage", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/autopaystatus/autopayRow/AutopayRowUiModel;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/autopaystatus/autopayRow/AutopayRowUiModel;", "component3", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/autopaystatus/autopayRow/AutopayRowUiModel;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/uimodel/AutopayCardUiModel;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "getTitle", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/autopaystatus/autopayRow/AutopayRowUiModel;", "getStatus", "getInfoMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class AutopayCardUiModel {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString infoMessage;
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayRowUiModel status;
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString title;

    public AutopayCardUiModel(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayRowUiModel autopayRowUiModel, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autopayRowUiModel, "");
        this.title = uiString;
        this.status = autopayRowUiModel;
        this.infoMessage = uiString2;
    }

    public /* synthetic */ AutopayCardUiModel(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayRowUiModel autopayRowUiModel, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(uiString, autopayRowUiModel, (i & 4) != 0 ? null : uiString2);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getTitle() {
        return this.title;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayRowUiModel getStatus() {
        return this.status;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getInfoMessage() {
        return this.infoMessage;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString = this.title;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayRowUiModel autopayRowUiModel = this.status;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2 = this.infoMessage;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AutopayCardUiModel(title=");
        sb.append(uiString);
        sb.append(", status=");
        sb.append(autopayRowUiModel);
        sb.append(", infoMessage=");
        sb.append(uiString2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString = this.title;
        int hashCode = uiString == null ? 0 : uiString.hashCode();
        int hashCode2 = this.status.hashCode();
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2 = this.infoMessage;
        return (((hashCode * 31) + hashCode2) * 31) + (uiString2 != null ? uiString2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.uimodel.AutopayCardUiModel)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.uimodel.AutopayCardUiModel autopayCardUiModel = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.uimodel.AutopayCardUiModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.title, autopayCardUiModel.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.status, autopayCardUiModel.status) && kotlin.jvm.internal.Intrinsics.areEqual(this.infoMessage, autopayCardUiModel.infoMessage);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.uimodel.AutopayCardUiModel copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString title, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayRowUiModel status, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString infoMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.uimodel.AutopayCardUiModel(title, status, infoMessage);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getInfoMessage() {
        return this.infoMessage;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayRowUiModel getStatus() {
        return this.status;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getTitle() {
        return this.title;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.uimodel.AutopayCardUiModel copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.uimodel.AutopayCardUiModel autopayCardUiModel, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayRowUiModel autopayRowUiModel, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            uiString = autopayCardUiModel.title;
        }
        if ((i & 2) != 0) {
            autopayRowUiModel = autopayCardUiModel.status;
        }
        if ((i & 4) != 0) {
            uiString2 = autopayCardUiModel.infoMessage;
        }
        return autopayCardUiModel.copy(uiString, autopayRowUiModel, uiString2);
    }
}
