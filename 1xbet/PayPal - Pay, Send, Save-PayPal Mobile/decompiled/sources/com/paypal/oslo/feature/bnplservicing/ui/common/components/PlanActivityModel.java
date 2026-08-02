package com.paypal.oslo.feature.bnplservicing.ui.common.components;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/common/components/PlanActivityModel;", "", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "title", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "", "amount", "Lcom/paypal/oslo/feature/bnplservicing/ui/common/components/PlanActivityState;", "state", "<init>", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/ui/common/components/PlanActivityState;)V", "component1", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "component2", "component3", "()Ljava/lang/String;", "component4", "()Lcom/paypal/oslo/feature/bnplservicing/ui/common/components/PlanActivityState;", "copy", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/ui/common/components/PlanActivityState;)Lcom/paypal/oslo/feature/bnplservicing/ui/common/components/PlanActivityModel;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getTitle", "getDescription", "Ljava/lang/String;", "getAmount", "Lcom/paypal/oslo/feature/bnplservicing/ui/common/components/PlanActivityState;", "getState"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PlanActivityModel {
    public static final int $stable;
    private final java.lang.String amount;
    private final com.paypal.oslo.core.commonui.utils.RefText description;
    private final com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanActivityState state;
    private final com.paypal.oslo.core.commonui.utils.RefText title;

    public PlanActivityModel(com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, java.lang.String str, com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanActivityState planActivityState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planActivityState, "");
        this.title = refText;
        this.description = refText2;
        this.amount = str;
        this.state = planActivityState;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getTitle() {
        return this.title;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getDescription() {
        return this.description;
    }

    public final java.lang.String getAmount() {
        return this.amount;
    }

    public final com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanActivityState getState() {
        return this.state;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.core.commonui.utils.RefText refText = this.title;
        com.paypal.oslo.core.commonui.utils.RefText refText2 = this.description;
        java.lang.String str = this.amount;
        com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanActivityState planActivityState = this.state;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PlanActivityModel(title=");
        sb.append(refText);
        sb.append(", description=");
        sb.append(refText2);
        sb.append(", amount=");
        sb.append(str);
        sb.append(", state=");
        sb.append(planActivityState);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.state.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanActivityModel)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanActivityModel planActivityModel = (com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanActivityModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.title, planActivityModel.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, planActivityModel.description) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, planActivityModel.amount) && this.state == planActivityModel.state;
    }

    public final com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanActivityModel copy(com.paypal.oslo.core.commonui.utils.RefText title, com.paypal.oslo.core.commonui.utils.RefText description, java.lang.String amount, com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanActivityState state) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        return new com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanActivityModel(title, description, amount, state);
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanActivityState getState() {
        return this.state;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getAmount() {
        return this.amount;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.core.commonui.utils.RefText getDescription() {
        return this.description;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.core.commonui.utils.RefText getTitle() {
        return this.title;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanActivityModel copy$default(com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanActivityModel planActivityModel, com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, java.lang.String str, com.paypal.oslo.feature.bnplservicing.ui.common.components.PlanActivityState planActivityState, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            refText = planActivityModel.title;
        }
        if ((i & 2) != 0) {
            refText2 = planActivityModel.description;
        }
        if ((i & 4) != 0) {
            str = planActivityModel.amount;
        }
        if ((i & 8) != 0) {
            planActivityState = planActivityModel.state;
        }
        return planActivityModel.copy(refText, refText2, str, planActivityState);
    }

    static {
        int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
        $stable = i | i;
    }
}
