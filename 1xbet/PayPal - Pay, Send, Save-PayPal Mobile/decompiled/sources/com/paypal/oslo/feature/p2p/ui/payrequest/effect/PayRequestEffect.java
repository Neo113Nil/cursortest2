package com.paypal.oslo.feature.p2p.ui.payrequest.effect;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/payrequest/effect/PayRequestEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "NavigateBack", "NavigateToPayment", "Lcom/paypal/oslo/feature/p2p/ui/payrequest/effect/PayRequestEffect$NavigateBack;", "Lcom/paypal/oslo/feature/p2p/ui/payrequest/effect/PayRequestEffect$NavigateToPayment;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class PayRequestEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private PayRequestEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/payrequest/effect/PayRequestEffect$NavigateBack;", "Lcom/paypal/oslo/feature/p2p/ui/payrequest/effect/PayRequestEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBack extends com.paypal.oslo.feature.p2p.ui.payrequest.effect.PayRequestEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.payrequest.effect.PayRequestEffect.NavigateBack INSTANCE = new com.paypal.oslo.feature.p2p.ui.payrequest.effect.PayRequestEffect.NavigateBack();

        public final int hashCode() {
            return 44594959;
        }

        private NavigateBack() {
            super("NavigateBack", null);
        }

        public final java.lang.String toString() {
            return "NavigateBack";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.payrequest.effect.PayRequestEffect.NavigateBack)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/payrequest/effect/PayRequestEffect$NavigateToPayment;", "Lcom/paypal/oslo/feature/p2p/ui/payrequest/effect/PayRequestEffect;", "", "amountValue", "intent", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/ui/payrequest/effect/PayRequestEffect$NavigateToPayment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAmountValue", "getIntent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToPayment extends com.paypal.oslo.feature.p2p.ui.payrequest.effect.PayRequestEffect {
        public static final int $stable = 0;
        private final java.lang.String amountValue;
        private final java.lang.String intent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToPayment(java.lang.String str, java.lang.String str2) {
            super("NavigateToPayment", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.amountValue = str;
            this.intent = str2;
        }

        public final java.lang.String getAmountValue() {
            return this.amountValue;
        }

        public final java.lang.String getIntent() {
            return this.intent;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.amountValue;
            java.lang.String str2 = this.intent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToPayment(amountValue=");
            sb.append(str);
            sb.append(", intent=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.amountValue.hashCode() * 31) + this.intent.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.payrequest.effect.PayRequestEffect.NavigateToPayment)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.ui.payrequest.effect.PayRequestEffect.NavigateToPayment navigateToPayment = (com.paypal.oslo.feature.p2p.ui.payrequest.effect.PayRequestEffect.NavigateToPayment) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.amountValue, navigateToPayment.amountValue) && kotlin.jvm.internal.Intrinsics.areEqual(this.intent, navigateToPayment.intent);
        }

        public final com.paypal.oslo.feature.p2p.ui.payrequest.effect.PayRequestEffect.NavigateToPayment copy(java.lang.String amountValue, java.lang.String intent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountValue, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
            return new com.paypal.oslo.feature.p2p.ui.payrequest.effect.PayRequestEffect.NavigateToPayment(amountValue, intent);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getIntent() {
            return this.intent;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAmountValue() {
            return this.amountValue;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.payrequest.effect.PayRequestEffect.NavigateToPayment copy$default(com.paypal.oslo.feature.p2p.ui.payrequest.effect.PayRequestEffect.NavigateToPayment navigateToPayment, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToPayment.amountValue;
            }
            if ((i & 2) != 0) {
                str2 = navigateToPayment.intent;
            }
            return navigateToPayment.copy(str, str2);
        }
    }

    public /* synthetic */ PayRequestEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
