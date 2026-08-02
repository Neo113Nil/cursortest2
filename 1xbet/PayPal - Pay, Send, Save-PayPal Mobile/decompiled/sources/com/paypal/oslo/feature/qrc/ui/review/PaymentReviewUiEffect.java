package com.paypal.oslo.feature.qrc.ui.review;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0006\n\u000b\f\r\u000e\u000fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0006\u0010\u0011\u0012\u0013\u0014\u0015"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "NavigateToPaymentStatus", "NavigateBack", "FinishPaymentFlow", "PopToScanner", "NavigateToAddPaymentMethod", "NavigateToTopUpBalance", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewUiEffect$FinishPaymentFlow;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewUiEffect$NavigateBack;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewUiEffect$NavigateToAddPaymentMethod;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewUiEffect$NavigateToPaymentStatus;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewUiEffect$NavigateToTopUpBalance;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewUiEffect$PopToScanner;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class PaymentReviewUiEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewUiEffect$NavigateToPaymentStatus;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewUiEffect;", "Lcom/paypal/oslo/feature/qrc/ui/success/PaymentSuccessNavArgs;", "paymentSuccessNavArgs", "<init>", "(Lcom/paypal/oslo/feature/qrc/ui/success/PaymentSuccessNavArgs;)V", "component1", "()Lcom/paypal/oslo/feature/qrc/ui/success/PaymentSuccessNavArgs;", "copy", "(Lcom/paypal/oslo/feature/qrc/ui/success/PaymentSuccessNavArgs;)Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewUiEffect$NavigateToPaymentStatus;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/qrc/ui/success/PaymentSuccessNavArgs;", "getPaymentSuccessNavArgs"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToPaymentStatus extends com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessNavArgs paymentSuccessNavArgs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToPaymentStatus(com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessNavArgs paymentSuccessNavArgs) {
            super("PaymentReviewUiEffect.NavigateToPaymentStatus", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentSuccessNavArgs, "");
            this.paymentSuccessNavArgs = paymentSuccessNavArgs;
        }

        public final com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessNavArgs getPaymentSuccessNavArgs() {
            return this.paymentSuccessNavArgs;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessNavArgs paymentSuccessNavArgs = this.paymentSuccessNavArgs;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToPaymentStatus(paymentSuccessNavArgs=");
            sb.append(paymentSuccessNavArgs);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.paymentSuccessNavArgs.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiEffect.NavigateToPaymentStatus) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentSuccessNavArgs, ((com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiEffect.NavigateToPaymentStatus) other).paymentSuccessNavArgs);
        }

        public final com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiEffect.NavigateToPaymentStatus copy(com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessNavArgs paymentSuccessNavArgs) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentSuccessNavArgs, "");
            return new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiEffect.NavigateToPaymentStatus(paymentSuccessNavArgs);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessNavArgs getPaymentSuccessNavArgs() {
            return this.paymentSuccessNavArgs;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiEffect.NavigateToPaymentStatus copy$default(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiEffect.NavigateToPaymentStatus navigateToPaymentStatus, com.paypal.oslo.feature.qrc.ui.success.PaymentSuccessNavArgs paymentSuccessNavArgs, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                paymentSuccessNavArgs = navigateToPaymentStatus.paymentSuccessNavArgs;
            }
            return navigateToPaymentStatus.copy(paymentSuccessNavArgs);
        }
    }

    private PaymentReviewUiEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewUiEffect$NavigateBack;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBack extends com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiEffect.NavigateBack INSTANCE = new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiEffect.NavigateBack();

        public final int hashCode() {
            return -432845412;
        }

        private NavigateBack() {
            super("PaymentReviewUiEffect.NavigateBack", null);
        }

        public final java.lang.String toString() {
            return "NavigateBack";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiEffect.NavigateBack)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewUiEffect$FinishPaymentFlow;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FinishPaymentFlow extends com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiEffect.FinishPaymentFlow INSTANCE = new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiEffect.FinishPaymentFlow();

        public final int hashCode() {
            return -87065443;
        }

        private FinishPaymentFlow() {
            super("PaymentReviewUiEffect.FinishPaymentFlow", null);
        }

        public final java.lang.String toString() {
            return "FinishPaymentFlow";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiEffect.FinishPaymentFlow)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewUiEffect$PopToScanner;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PopToScanner extends com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiEffect.PopToScanner INSTANCE = new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiEffect.PopToScanner();

        public final int hashCode() {
            return 1947088726;
        }

        private PopToScanner() {
            super("PaymentReviewUiEffect.PopToScanner", null);
        }

        public final java.lang.String toString() {
            return "PopToScanner";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiEffect.PopToScanner)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewUiEffect$NavigateToAddPaymentMethod;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToAddPaymentMethod extends com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiEffect.NavigateToAddPaymentMethod INSTANCE = new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiEffect.NavigateToAddPaymentMethod();

        public final int hashCode() {
            return -682968074;
        }

        private NavigateToAddPaymentMethod() {
            super("PaymentReviewUiEffect.NavigateToAddPaymentMethod", null);
        }

        public final java.lang.String toString() {
            return "NavigateToAddPaymentMethod";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiEffect.NavigateToAddPaymentMethod)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewUiEffect$NavigateToTopUpBalance;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToTopUpBalance extends com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiEffect.NavigateToTopUpBalance INSTANCE = new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiEffect.NavigateToTopUpBalance();

        public final int hashCode() {
            return 819961468;
        }

        private NavigateToTopUpBalance() {
            super("PaymentReviewUiEffect.NavigateToTopUpBalance", null);
        }

        public final java.lang.String toString() {
            return "NavigateToTopUpBalance";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiEffect.NavigateToTopUpBalance)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ PaymentReviewUiEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
