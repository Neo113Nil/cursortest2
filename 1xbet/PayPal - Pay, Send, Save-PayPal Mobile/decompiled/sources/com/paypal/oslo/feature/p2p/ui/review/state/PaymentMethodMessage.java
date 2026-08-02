package com.paypal.oslo.feature.p2p.ui.review.state;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/state/PaymentMethodMessage;", "", "", "text", "Lcom/paypal/oslo/feature/p2p/ui/review/state/PaymentMethodMessageType;", "type", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/ui/review/state/PaymentMethodMessageType;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/p2p/ui/review/state/PaymentMethodMessageType;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/ui/review/state/PaymentMethodMessageType;)Lcom/paypal/oslo/feature/p2p/ui/review/state/PaymentMethodMessage;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getText", "Lcom/paypal/oslo/feature/p2p/ui/review/state/PaymentMethodMessageType;", "getType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PaymentMethodMessage {
    public static final int $stable = 0;
    private final java.lang.String text;
    private final com.paypal.oslo.feature.p2p.ui.review.state.PaymentMethodMessageType type;

    public PaymentMethodMessage(java.lang.String str, com.paypal.oslo.feature.p2p.ui.review.state.PaymentMethodMessageType paymentMethodMessageType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentMethodMessageType, "");
        this.text = str;
        this.type = paymentMethodMessageType;
    }

    public final java.lang.String getText() {
        return this.text;
    }

    public /* synthetic */ PaymentMethodMessage(java.lang.String str, com.paypal.oslo.feature.p2p.ui.review.state.PaymentMethodMessageType paymentMethodMessageType, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? com.paypal.oslo.feature.p2p.ui.review.state.PaymentMethodMessageType.WARNING : paymentMethodMessageType);
    }

    public final com.paypal.oslo.feature.p2p.ui.review.state.PaymentMethodMessageType getType() {
        return this.type;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.text;
        com.paypal.oslo.feature.p2p.ui.review.state.PaymentMethodMessageType paymentMethodMessageType = this.type;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentMethodMessage(text=");
        sb.append(str);
        sb.append(", type=");
        sb.append(paymentMethodMessageType);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.text.hashCode() * 31) + this.type.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.state.PaymentMethodMessage)) {
            return false;
        }
        com.paypal.oslo.feature.p2p.ui.review.state.PaymentMethodMessage paymentMethodMessage = (com.paypal.oslo.feature.p2p.ui.review.state.PaymentMethodMessage) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.text, paymentMethodMessage.text) && this.type == paymentMethodMessage.type;
    }

    public final com.paypal.oslo.feature.p2p.ui.review.state.PaymentMethodMessage copy(java.lang.String text, com.paypal.oslo.feature.p2p.ui.review.state.PaymentMethodMessageType type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return new com.paypal.oslo.feature.p2p.ui.review.state.PaymentMethodMessage(text, type);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.p2p.ui.review.state.PaymentMethodMessageType getType() {
        return this.type;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getText() {
        return this.text;
    }

    public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.state.PaymentMethodMessage copy$default(com.paypal.oslo.feature.p2p.ui.review.state.PaymentMethodMessage paymentMethodMessage, java.lang.String str, com.paypal.oslo.feature.p2p.ui.review.state.PaymentMethodMessageType paymentMethodMessageType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = paymentMethodMessage.text;
        }
        if ((i & 2) != 0) {
            paymentMethodMessageType = paymentMethodMessage.type;
        }
        return paymentMethodMessage.copy(str, paymentMethodMessageType);
    }
}
