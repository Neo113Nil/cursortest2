package com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/ui/transfer/component/planaccordion/internal/PlanBadge;", "", "", "text", "Lcom/paypal/oslo/feature/moneymovement/ui/transfer/component/planaccordion/internal/PlanBadgeStyle;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/moneymovement/ui/transfer/component/planaccordion/internal/PlanBadgeStyle;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/moneymovement/ui/transfer/component/planaccordion/internal/PlanBadgeStyle;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/moneymovement/ui/transfer/component/planaccordion/internal/PlanBadgeStyle;)Lcom/paypal/oslo/feature/moneymovement/ui/transfer/component/planaccordion/internal/PlanBadge;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getText", "Lcom/paypal/oslo/feature/moneymovement/ui/transfer/component/planaccordion/internal/PlanBadgeStyle;", "getStyle"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PlanBadge {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanBadgeStyle style;
    private final java.lang.String text;

    public PlanBadge(java.lang.String str, com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanBadgeStyle planBadgeStyle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planBadgeStyle, "");
        this.text = str;
        this.style = planBadgeStyle;
    }

    public final java.lang.String getText() {
        return this.text;
    }

    public /* synthetic */ PlanBadge(java.lang.String str, com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanBadgeStyle planBadgeStyle, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanBadgeStyle.NEUTRAL : planBadgeStyle);
    }

    public final com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanBadgeStyle getStyle() {
        return this.style;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.text;
        com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanBadgeStyle planBadgeStyle = this.style;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PlanBadge(text=");
        sb.append(str);
        sb.append(", style=");
        sb.append(planBadgeStyle);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.text.hashCode() * 31) + this.style.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanBadge)) {
            return false;
        }
        com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanBadge planBadge = (com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanBadge) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.text, planBadge.text) && this.style == planBadge.style;
    }

    public final com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanBadge copy(java.lang.String text, com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanBadgeStyle style) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(style, "");
        return new com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanBadge(text, style);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanBadgeStyle getStyle() {
        return this.style;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getText() {
        return this.text;
    }

    public static /* synthetic */ com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanBadge copy$default(com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanBadge planBadge, java.lang.String str, com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanBadgeStyle planBadgeStyle, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = planBadge.text;
        }
        if ((i & 2) != 0) {
            planBadgeStyle = planBadge.style;
        }
        return planBadge.copy(str, planBadgeStyle);
    }
}
