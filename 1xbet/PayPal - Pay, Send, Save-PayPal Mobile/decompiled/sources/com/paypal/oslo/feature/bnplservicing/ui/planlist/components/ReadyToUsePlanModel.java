package com.paypal.oslo.feature.bnplservicing.ui.planlist.components;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ>\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b \u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/components/ReadyToUsePlanModel;", "Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/components/PlanModel;", "", "creditAccountId", "amount", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "type", "validity", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;)Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/components/ReadyToUsePlanModel;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCreditAccountId", "getAmount", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getType", "getValidity"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ReadyToUsePlanModel implements com.paypal.oslo.feature.bnplservicing.ui.planlist.components.PlanModel {
    public static final int $stable;
    private final java.lang.String amount;
    private final java.lang.String creditAccountId;
    private final com.paypal.oslo.core.commonui.utils.RefText type;
    private final com.paypal.oslo.core.commonui.utils.RefText validity;

    public ReadyToUsePlanModel(java.lang.String str, java.lang.String str2, com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.creditAccountId = str;
        this.amount = str2;
        this.type = refText;
        this.validity = refText2;
    }

    public /* synthetic */ ReadyToUsePlanModel(java.lang.String str, java.lang.String str2, com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : refText, (i & 8) != 0 ? null : refText2);
    }

    public final java.lang.String getCreditAccountId() {
        return this.creditAccountId;
    }

    public final java.lang.String getAmount() {
        return this.amount;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getType() {
        return this.type;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getValidity() {
        return this.validity;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.creditAccountId;
        java.lang.String str2 = this.amount;
        com.paypal.oslo.core.commonui.utils.RefText refText = this.type;
        com.paypal.oslo.core.commonui.utils.RefText refText2 = this.validity;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ReadyToUsePlanModel(creditAccountId=");
        sb.append(str);
        sb.append(", amount=");
        sb.append(str2);
        sb.append(", type=");
        sb.append(refText);
        sb.append(", validity=");
        sb.append(refText2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.creditAccountId.hashCode();
        java.lang.String str = this.amount;
        int hashCode2 = str == null ? 0 : str.hashCode();
        com.paypal.oslo.core.commonui.utils.RefText refText = this.type;
        int hashCode3 = refText == null ? 0 : refText.hashCode();
        com.paypal.oslo.core.commonui.utils.RefText refText2 = this.validity;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (refText2 != null ? refText2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.planlist.components.ReadyToUsePlanModel)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.ui.planlist.components.ReadyToUsePlanModel readyToUsePlanModel = (com.paypal.oslo.feature.bnplservicing.ui.planlist.components.ReadyToUsePlanModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, readyToUsePlanModel.creditAccountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, readyToUsePlanModel.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.type, readyToUsePlanModel.type) && kotlin.jvm.internal.Intrinsics.areEqual(this.validity, readyToUsePlanModel.validity);
    }

    public final com.paypal.oslo.feature.bnplservicing.ui.planlist.components.ReadyToUsePlanModel copy(java.lang.String creditAccountId, java.lang.String amount, com.paypal.oslo.core.commonui.utils.RefText type, com.paypal.oslo.core.commonui.utils.RefText validity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
        return new com.paypal.oslo.feature.bnplservicing.ui.planlist.components.ReadyToUsePlanModel(creditAccountId, amount, type, validity);
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.core.commonui.utils.RefText getValidity() {
        return this.validity;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.core.commonui.utils.RefText getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getAmount() {
        return this.amount;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCreditAccountId() {
        return this.creditAccountId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.planlist.components.ReadyToUsePlanModel copy$default(com.paypal.oslo.feature.bnplservicing.ui.planlist.components.ReadyToUsePlanModel readyToUsePlanModel, java.lang.String str, java.lang.String str2, com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = readyToUsePlanModel.creditAccountId;
        }
        if ((i & 2) != 0) {
            str2 = readyToUsePlanModel.amount;
        }
        if ((i & 4) != 0) {
            refText = readyToUsePlanModel.type;
        }
        if ((i & 8) != 0) {
            refText2 = readyToUsePlanModel.validity;
        }
        return readyToUsePlanModel.copy(str, str2, refText, refText2);
    }

    public ReadyToUsePlanModel() {
        this(null, null, null, null, 15, null);
    }

    static {
        int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
        $stable = i | i;
    }
}
