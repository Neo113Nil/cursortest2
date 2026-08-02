package com.paypal.oslo.feature.bnplacquisition.ui.offers;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/PaymentTimelineItem;", "", "Lcom/paypal/pds/components/TimelineState;", "state", "", "amountText", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "dateLabel", "<init>", "(Lcom/paypal/pds/components/TimelineState;Ljava/lang/String;Lcom/paypal/oslo/core/commonui/utils/RefText;)V", "component1", "()Lcom/paypal/pds/components/TimelineState;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "copy", "(Lcom/paypal/pds/components/TimelineState;Ljava/lang/String;Lcom/paypal/oslo/core/commonui/utils/RefText;)Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/PaymentTimelineItem;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/pds/components/TimelineState;", "getState", "Ljava/lang/String;", "getAmountText", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getDateLabel"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PaymentTimelineItem {
    public static final int $stable = com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.pds.components.TimelineState.$stable;
    private final java.lang.String amountText;
    private final com.paypal.oslo.core.commonui.utils.RefText dateLabel;
    private final com.paypal.pds.components.TimelineState state;

    public PaymentTimelineItem(com.paypal.pds.components.TimelineState timelineState, java.lang.String str, com.paypal.oslo.core.commonui.utils.RefText refText) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timelineState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText, "");
        this.state = timelineState;
        this.amountText = str;
        this.dateLabel = refText;
    }

    public final com.paypal.pds.components.TimelineState getState() {
        return this.state;
    }

    public final java.lang.String getAmountText() {
        return this.amountText;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getDateLabel() {
        return this.dateLabel;
    }

    public final java.lang.String toString() {
        com.paypal.pds.components.TimelineState timelineState = this.state;
        java.lang.String str = this.amountText;
        com.paypal.oslo.core.commonui.utils.RefText refText = this.dateLabel;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentTimelineItem(state=");
        sb.append(timelineState);
        sb.append(", amountText=");
        sb.append(str);
        sb.append(", dateLabel=");
        sb.append(refText);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.state.hashCode() * 31) + this.amountText.hashCode()) * 31) + this.dateLabel.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.PaymentTimelineItem)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.ui.offers.PaymentTimelineItem paymentTimelineItem = (com.paypal.oslo.feature.bnplacquisition.ui.offers.PaymentTimelineItem) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.state, paymentTimelineItem.state) && kotlin.jvm.internal.Intrinsics.areEqual(this.amountText, paymentTimelineItem.amountText) && kotlin.jvm.internal.Intrinsics.areEqual(this.dateLabel, paymentTimelineItem.dateLabel);
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.offers.PaymentTimelineItem copy(com.paypal.pds.components.TimelineState state, java.lang.String amountText, com.paypal.oslo.core.commonui.utils.RefText dateLabel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountText, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateLabel, "");
        return new com.paypal.oslo.feature.bnplacquisition.ui.offers.PaymentTimelineItem(state, amountText, dateLabel);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.core.commonui.utils.RefText getDateLabel() {
        return this.dateLabel;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getAmountText() {
        return this.amountText;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.pds.components.TimelineState getState() {
        return this.state;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.offers.PaymentTimelineItem copy$default(com.paypal.oslo.feature.bnplacquisition.ui.offers.PaymentTimelineItem paymentTimelineItem, com.paypal.pds.components.TimelineState timelineState, java.lang.String str, com.paypal.oslo.core.commonui.utils.RefText refText, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            timelineState = paymentTimelineItem.state;
        }
        if ((i & 2) != 0) {
            str = paymentTimelineItem.amountText;
        }
        if ((i & 4) != 0) {
            refText = paymentTimelineItem.dateLabel;
        }
        return paymentTimelineItem.copy(timelineState, str, refText);
    }
}
