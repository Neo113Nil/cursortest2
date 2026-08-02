package com.paypal.oslo.feature.qrc.ui.review;

@kotlin.Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u001e\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u001e()*+,-./0123456789:;<=>?@ABCDE"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "LoadScreen", "LoadPaymentOptions", "LoadPaymentOptionsFailed", "PayNowPressed", "PaymentSuccess", "PaymentFailed", "RetryPayment", "BackPressed", "ClosePressed", "ConfirmCancelPayment", "FinishPaymentFlow", "BackToScanner", "DismissDialog", "SelectFundingInstrument", "ToggleFiAccordion", "TogglePPBalance", "SetTipExpanded", "SelectPresetTip", "OpenCustomTipInput", "SubmitCustomTip", "DismissBottomSheet", "AddPaymentMethodClicked", "TopUpBalanceClicked", "WalletFlowCompleted", "WalletFlowCancelled", "WalletFlowFailed", "ShowConversionOptions", "DismissConversionOptions", "ConversionOptionConfirmed", "SelectConversionTab", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$AddPaymentMethodClicked;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$BackPressed;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$BackToScanner;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$ClosePressed;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$ConfirmCancelPayment;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$ConversionOptionConfirmed;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$DismissBottomSheet;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$DismissConversionOptions;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$DismissDialog;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$FinishPaymentFlow;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$LoadPaymentOptions;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$LoadPaymentOptionsFailed;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$LoadScreen;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$OpenCustomTipInput;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$PayNowPressed;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$PaymentFailed;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$PaymentSuccess;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$RetryPayment;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$SelectConversionTab;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$SelectFundingInstrument;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$SelectPresetTip;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$SetTipExpanded;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$ShowConversionOptions;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$SubmitCustomTip;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$ToggleFiAccordion;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$TogglePPBalance;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$TopUpBalanceClicked;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$WalletFlowCancelled;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$WalletFlowCompleted;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$WalletFlowFailed;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class PaymentReviewEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private PaymentReviewEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$LoadScreen;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;", "navArgs", "<init>", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;)V", "component1", "()Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;", "copy", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;)Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$LoadScreen;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;", "getNavArgs"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoadScreen extends com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs navArgs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadScreen(com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs qrcSessionNavArgs) {
            super("PaymentReviewEvent.LoadScreen", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qrcSessionNavArgs, "");
            this.navArgs = qrcSessionNavArgs;
        }

        public final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs getNavArgs() {
            return this.navArgs;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs qrcSessionNavArgs = this.navArgs;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LoadScreen(navArgs=");
            sb.append(qrcSessionNavArgs);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.navArgs.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.LoadScreen) && kotlin.jvm.internal.Intrinsics.areEqual(this.navArgs, ((com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.LoadScreen) other).navArgs);
        }

        public final com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.LoadScreen copy(com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs navArgs) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navArgs, "");
            return new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.LoadScreen(navArgs);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs getNavArgs() {
            return this.navArgs;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.LoadScreen copy$default(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.LoadScreen loadScreen, com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs qrcSessionNavArgs, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                qrcSessionNavArgs = loadScreen.navArgs;
            }
            return loadScreen.copy(qrcSessionNavArgs);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$LoadPaymentOptions;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;", "navArgs", "Lcom/paypal/oslo/feature/qrc/domain/model/review/PaymentOptions;", "paymentOptions", "<init>", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;Lcom/paypal/oslo/feature/qrc/domain/model/review/PaymentOptions;)V", "component1", "()Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;", "component2", "()Lcom/paypal/oslo/feature/qrc/domain/model/review/PaymentOptions;", "copy", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;Lcom/paypal/oslo/feature/qrc/domain/model/review/PaymentOptions;)Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$LoadPaymentOptions;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;", "getNavArgs", "Lcom/paypal/oslo/feature/qrc/domain/model/review/PaymentOptions;", "getPaymentOptions"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoadPaymentOptions extends com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs navArgs;
        private final com.paypal.oslo.feature.qrc.domain.model.review.PaymentOptions paymentOptions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadPaymentOptions(com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs qrcSessionNavArgs, com.paypal.oslo.feature.qrc.domain.model.review.PaymentOptions paymentOptions) {
            super("PaymentReviewEvent.LoadPaymentOptions", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qrcSessionNavArgs, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentOptions, "");
            this.navArgs = qrcSessionNavArgs;
            this.paymentOptions = paymentOptions;
        }

        public final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs getNavArgs() {
            return this.navArgs;
        }

        public final com.paypal.oslo.feature.qrc.domain.model.review.PaymentOptions getPaymentOptions() {
            return this.paymentOptions;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs qrcSessionNavArgs = this.navArgs;
            com.paypal.oslo.feature.qrc.domain.model.review.PaymentOptions paymentOptions = this.paymentOptions;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LoadPaymentOptions(navArgs=");
            sb.append(qrcSessionNavArgs);
            sb.append(", paymentOptions=");
            sb.append(paymentOptions);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.navArgs.hashCode() * 31) + this.paymentOptions.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.LoadPaymentOptions)) {
                return false;
            }
            com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.LoadPaymentOptions loadPaymentOptions = (com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.LoadPaymentOptions) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.navArgs, loadPaymentOptions.navArgs) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentOptions, loadPaymentOptions.paymentOptions);
        }

        public final com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.LoadPaymentOptions copy(com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs navArgs, com.paypal.oslo.feature.qrc.domain.model.review.PaymentOptions paymentOptions) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navArgs, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentOptions, "");
            return new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.LoadPaymentOptions(navArgs, paymentOptions);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.qrc.domain.model.review.PaymentOptions getPaymentOptions() {
            return this.paymentOptions;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs getNavArgs() {
            return this.navArgs;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.LoadPaymentOptions copy$default(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.LoadPaymentOptions loadPaymentOptions, com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs qrcSessionNavArgs, com.paypal.oslo.feature.qrc.domain.model.review.PaymentOptions paymentOptions, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                qrcSessionNavArgs = loadPaymentOptions.navArgs;
            }
            if ((i & 2) != 0) {
                paymentOptions = loadPaymentOptions.paymentOptions;
            }
            return loadPaymentOptions.copy(qrcSessionNavArgs, paymentOptions);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0003\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$LoadPaymentOptionsFailed;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent;", "", "isRecoverable", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$LoadPaymentOptionsFailed;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoadPaymentOptionsFailed extends com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent {
        public static final int $stable = 0;
        private final boolean isRecoverable;

        public LoadPaymentOptionsFailed(boolean z) {
            super("PaymentReviewEvent.LoadPaymentOptionsFailed", null);
            this.isRecoverable = z;
        }

        public final boolean isRecoverable() {
            return this.isRecoverable;
        }

        public final java.lang.String toString() {
            boolean z = this.isRecoverable;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LoadPaymentOptionsFailed(isRecoverable=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.isRecoverable);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.LoadPaymentOptionsFailed) && this.isRecoverable == ((com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.LoadPaymentOptionsFailed) other).isRecoverable;
        }

        public final com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.LoadPaymentOptionsFailed copy(boolean isRecoverable) {
            return new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.LoadPaymentOptionsFailed(isRecoverable);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsRecoverable() {
            return this.isRecoverable;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.LoadPaymentOptionsFailed copy$default(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.LoadPaymentOptionsFailed loadPaymentOptionsFailed, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = loadPaymentOptionsFailed.isRecoverable;
            }
            return loadPaymentOptionsFailed.copy(z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$PayNowPressed;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PayNowPressed extends com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.PayNowPressed INSTANCE = new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.PayNowPressed();

        public final int hashCode() {
            return -1747382533;
        }

        private PayNowPressed() {
            super("PaymentReviewEvent.PayNowPressed", null);
        }

        public final java.lang.String toString() {
            return "PayNowPressed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.PayNowPressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$PaymentSuccess;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/PaymentResponse;", "paymentResponse", "<init>", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/PaymentResponse;)V", "component1", "()Lcom/paypal/oslo/feature/qrc/domain/model/session/PaymentResponse;", "copy", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/PaymentResponse;)Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$PaymentSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/PaymentResponse;", "getPaymentResponse"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PaymentSuccess extends com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.qrc.domain.model.session.PaymentResponse paymentResponse;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaymentSuccess(com.paypal.oslo.feature.qrc.domain.model.session.PaymentResponse paymentResponse) {
            super("PaymentReviewEvent.PaymentSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentResponse, "");
            this.paymentResponse = paymentResponse;
        }

        public final com.paypal.oslo.feature.qrc.domain.model.session.PaymentResponse getPaymentResponse() {
            return this.paymentResponse;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.qrc.domain.model.session.PaymentResponse paymentResponse = this.paymentResponse;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentSuccess(paymentResponse=");
            sb.append(paymentResponse);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.paymentResponse.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.PaymentSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentResponse, ((com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.PaymentSuccess) other).paymentResponse);
        }

        public final com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.PaymentSuccess copy(com.paypal.oslo.feature.qrc.domain.model.session.PaymentResponse paymentResponse) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentResponse, "");
            return new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.PaymentSuccess(paymentResponse);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.qrc.domain.model.session.PaymentResponse getPaymentResponse() {
            return this.paymentResponse;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.PaymentSuccess copy$default(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.PaymentSuccess paymentSuccess, com.paypal.oslo.feature.qrc.domain.model.session.PaymentResponse paymentResponse, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                paymentResponse = paymentSuccess.paymentResponse;
            }
            return paymentSuccess.copy(paymentResponse);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0003\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$PaymentFailed;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent;", "", "isRecoverable", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$PaymentFailed;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PaymentFailed extends com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent {
        public static final int $stable = 0;
        private final boolean isRecoverable;

        public PaymentFailed(boolean z) {
            super("PaymentReviewEvent.PaymentFailed", null);
            this.isRecoverable = z;
        }

        public /* synthetic */ PaymentFailed(boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        public final boolean isRecoverable() {
            return this.isRecoverable;
        }

        public final java.lang.String toString() {
            boolean z = this.isRecoverable;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentFailed(isRecoverable=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.isRecoverable);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.PaymentFailed) && this.isRecoverable == ((com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.PaymentFailed) other).isRecoverable;
        }

        public final com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.PaymentFailed copy(boolean isRecoverable) {
            return new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.PaymentFailed(isRecoverable);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsRecoverable() {
            return this.isRecoverable;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.PaymentFailed copy$default(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.PaymentFailed paymentFailed, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = paymentFailed.isRecoverable;
            }
            return paymentFailed.copy(z);
        }

        public PaymentFailed() {
            this(false, 1, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$RetryPayment;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RetryPayment extends com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.RetryPayment INSTANCE = new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.RetryPayment();

        public final int hashCode() {
            return 1045884311;
        }

        private RetryPayment() {
            super("PaymentReviewEvent.RetryPayment", null);
        }

        public final java.lang.String toString() {
            return "RetryPayment";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.RetryPayment)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$BackPressed;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BackPressed extends com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.BackPressed INSTANCE = new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.BackPressed();

        public final int hashCode() {
            return 1049352898;
        }

        private BackPressed() {
            super("PaymentReviewEvent.BackPressed", null);
        }

        public final java.lang.String toString() {
            return "BackPressed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.BackPressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$ClosePressed;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ClosePressed extends com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.ClosePressed INSTANCE = new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.ClosePressed();

        public final int hashCode() {
            return -1437052317;
        }

        private ClosePressed() {
            super("PaymentReviewEvent.ClosePressed", null);
        }

        public final java.lang.String toString() {
            return "ClosePressed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.ClosePressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$ConfirmCancelPayment;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ConfirmCancelPayment extends com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.ConfirmCancelPayment INSTANCE = new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.ConfirmCancelPayment();

        public final int hashCode() {
            return 1055533477;
        }

        private ConfirmCancelPayment() {
            super("PaymentReviewEvent.ConfirmCancelPayment", null);
        }

        public final java.lang.String toString() {
            return "ConfirmCancelPayment";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.ConfirmCancelPayment)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$FinishPaymentFlow;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FinishPaymentFlow extends com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.FinishPaymentFlow INSTANCE = new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.FinishPaymentFlow();

        public final int hashCode() {
            return 301064712;
        }

        private FinishPaymentFlow() {
            super("PaymentReviewEvent.FinishPaymentFlow", null);
        }

        public final java.lang.String toString() {
            return "FinishPaymentFlow";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.FinishPaymentFlow)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$BackToScanner;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BackToScanner extends com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.BackToScanner INSTANCE = new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.BackToScanner();

        public final int hashCode() {
            return 267867555;
        }

        private BackToScanner() {
            super("PaymentReviewEvent.BackToScanner", null);
        }

        public final java.lang.String toString() {
            return "BackToScanner";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.BackToScanner)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$DismissDialog;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DismissDialog extends com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.DismissDialog INSTANCE = new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.DismissDialog();

        public final int hashCode() {
            return -1831443399;
        }

        private DismissDialog() {
            super("PaymentReviewEvent.DismissDialog", null);
        }

        public final java.lang.String toString() {
            return "DismissDialog";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.DismissDialog)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$SelectFundingInstrument;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent;", "", "fiId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$SelectFundingInstrument;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFiId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SelectFundingInstrument extends com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent {
        public static final int $stable = 0;
        private final java.lang.String fiId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelectFundingInstrument(java.lang.String str) {
            super("PaymentReviewEvent.SelectFundingInstrument", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.fiId = str;
        }

        public final java.lang.String getFiId() {
            return this.fiId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.fiId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SelectFundingInstrument(fiId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.fiId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.SelectFundingInstrument) && kotlin.jvm.internal.Intrinsics.areEqual(this.fiId, ((com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.SelectFundingInstrument) other).fiId);
        }

        public final com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.SelectFundingInstrument copy(java.lang.String fiId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiId, "");
            return new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.SelectFundingInstrument(fiId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getFiId() {
            return this.fiId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.SelectFundingInstrument copy$default(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.SelectFundingInstrument selectFundingInstrument, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = selectFundingInstrument.fiId;
            }
            return selectFundingInstrument.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$ToggleFiAccordion;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ToggleFiAccordion extends com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.ToggleFiAccordion INSTANCE = new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.ToggleFiAccordion();

        public final int hashCode() {
            return -625741800;
        }

        private ToggleFiAccordion() {
            super("PaymentReviewEvent.ToggleFiAccordion", null);
        }

        public final java.lang.String toString() {
            return "ToggleFiAccordion";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.ToggleFiAccordion)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0003\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$TogglePPBalance;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent;", "", "isChecked", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$TogglePPBalance;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TogglePPBalance extends com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent {
        public static final int $stable = 0;
        private final boolean isChecked;

        public TogglePPBalance(boolean z) {
            super("PaymentReviewEvent.TogglePPBalance", null);
            this.isChecked = z;
        }

        public final boolean isChecked() {
            return this.isChecked;
        }

        public final java.lang.String toString() {
            boolean z = this.isChecked;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TogglePPBalance(isChecked=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.isChecked);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.TogglePPBalance) && this.isChecked == ((com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.TogglePPBalance) other).isChecked;
        }

        public final com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.TogglePPBalance copy(boolean isChecked) {
            return new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.TogglePPBalance(isChecked);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsChecked() {
            return this.isChecked;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.TogglePPBalance copy$default(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.TogglePPBalance togglePPBalance, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = togglePPBalance.isChecked;
            }
            return togglePPBalance.copy(z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$SetTipExpanded;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent;", "", "expanded", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$SetTipExpanded;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getExpanded"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SetTipExpanded extends com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent {
        public static final int $stable = 0;
        private final boolean expanded;

        public SetTipExpanded(boolean z) {
            super("PaymentReviewEvent.SetTipExpanded", null);
            this.expanded = z;
        }

        public final boolean getExpanded() {
            return this.expanded;
        }

        public final java.lang.String toString() {
            boolean z = this.expanded;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SetTipExpanded(expanded=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.expanded);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.SetTipExpanded) && this.expanded == ((com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.SetTipExpanded) other).expanded;
        }

        public final com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.SetTipExpanded copy(boolean expanded) {
            return new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.SetTipExpanded(expanded);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getExpanded() {
            return this.expanded;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.SetTipExpanded copy$default(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.SetTipExpanded setTipExpanded, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = setTipExpanded.expanded;
            }
            return setTipExpanded.copy(z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$SelectPresetTip;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent;", "", "optionId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$SelectPresetTip;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getOptionId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SelectPresetTip extends com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent {
        public static final int $stable = 0;
        private final java.lang.String optionId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelectPresetTip(java.lang.String str) {
            super("PaymentReviewEvent.SelectPresetTip", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.optionId = str;
        }

        public final java.lang.String getOptionId() {
            return this.optionId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.optionId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SelectPresetTip(optionId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.optionId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.SelectPresetTip) && kotlin.jvm.internal.Intrinsics.areEqual(this.optionId, ((com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.SelectPresetTip) other).optionId);
        }

        public final com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.SelectPresetTip copy(java.lang.String optionId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optionId, "");
            return new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.SelectPresetTip(optionId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getOptionId() {
            return this.optionId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.SelectPresetTip copy$default(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.SelectPresetTip selectPresetTip, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = selectPresetTip.optionId;
            }
            return selectPresetTip.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$OpenCustomTipInput;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OpenCustomTipInput extends com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.OpenCustomTipInput INSTANCE = new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.OpenCustomTipInput();

        public final int hashCode() {
            return 2056475651;
        }

        private OpenCustomTipInput() {
            super("PaymentReviewEvent.OpenCustomTipInput", null);
        }

        public final java.lang.String toString() {
            return "OpenCustomTipInput";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.OpenCustomTipInput)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$SubmitCustomTip;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent;", "", "enteredValue", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$SubmitCustomTip;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getEnteredValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SubmitCustomTip extends com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent {
        public static final int $stable = 0;
        private final java.lang.String enteredValue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SubmitCustomTip(java.lang.String str) {
            super("PaymentReviewEvent.SubmitCustomTip", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.enteredValue = str;
        }

        public final java.lang.String getEnteredValue() {
            return this.enteredValue;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.enteredValue;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SubmitCustomTip(enteredValue=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.enteredValue.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.SubmitCustomTip) && kotlin.jvm.internal.Intrinsics.areEqual(this.enteredValue, ((com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.SubmitCustomTip) other).enteredValue);
        }

        public final com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.SubmitCustomTip copy(java.lang.String enteredValue) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enteredValue, "");
            return new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.SubmitCustomTip(enteredValue);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getEnteredValue() {
            return this.enteredValue;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.SubmitCustomTip copy$default(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.SubmitCustomTip submitCustomTip, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = submitCustomTip.enteredValue;
            }
            return submitCustomTip.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$DismissBottomSheet;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DismissBottomSheet extends com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.DismissBottomSheet INSTANCE = new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.DismissBottomSheet();

        public final int hashCode() {
            return -1478967901;
        }

        private DismissBottomSheet() {
            super("PaymentReviewEvent.DismissBottomSheet", null);
        }

        public final java.lang.String toString() {
            return "DismissBottomSheet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.DismissBottomSheet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$AddPaymentMethodClicked;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AddPaymentMethodClicked extends com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.AddPaymentMethodClicked INSTANCE = new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.AddPaymentMethodClicked();

        public final int hashCode() {
            return 2014010600;
        }

        private AddPaymentMethodClicked() {
            super("PaymentReviewEvent.AddPaymentMethodClicked", null);
        }

        public final java.lang.String toString() {
            return "AddPaymentMethodClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.AddPaymentMethodClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$TopUpBalanceClicked;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TopUpBalanceClicked extends com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.TopUpBalanceClicked INSTANCE = new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.TopUpBalanceClicked();

        public final int hashCode() {
            return 545266466;
        }

        private TopUpBalanceClicked() {
            super("PaymentReviewEvent.TopUpBalanceClicked", null);
        }

        public final java.lang.String toString() {
            return "TopUpBalanceClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.TopUpBalanceClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$WalletFlowCompleted;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class WalletFlowCompleted extends com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.WalletFlowCompleted INSTANCE = new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.WalletFlowCompleted();

        public final int hashCode() {
            return -635205685;
        }

        private WalletFlowCompleted() {
            super("PaymentReviewEvent.WalletFlowCompleted", null);
        }

        public final java.lang.String toString() {
            return "WalletFlowCompleted";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.WalletFlowCompleted)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$WalletFlowCancelled;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class WalletFlowCancelled extends com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.WalletFlowCancelled INSTANCE = new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.WalletFlowCancelled();

        public final int hashCode() {
            return 1244314321;
        }

        private WalletFlowCancelled() {
            super("PaymentReviewEvent.WalletFlowCancelled", null);
        }

        public final java.lang.String toString() {
            return "WalletFlowCancelled";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.WalletFlowCancelled)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$WalletFlowFailed;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent;", "Lcom/paypal/oslo/feature/qrc/domain/model/cancelpayment/QrcPaymentCancellationReason;", "reason", "<init>", "(Lcom/paypal/oslo/feature/qrc/domain/model/cancelpayment/QrcPaymentCancellationReason;)V", "component1", "()Lcom/paypal/oslo/feature/qrc/domain/model/cancelpayment/QrcPaymentCancellationReason;", "copy", "(Lcom/paypal/oslo/feature/qrc/domain/model/cancelpayment/QrcPaymentCancellationReason;)Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$WalletFlowFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/qrc/domain/model/cancelpayment/QrcPaymentCancellationReason;", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class WalletFlowFailed extends com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.qrc.domain.model.cancelpayment.QrcPaymentCancellationReason reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WalletFlowFailed(com.paypal.oslo.feature.qrc.domain.model.cancelpayment.QrcPaymentCancellationReason qrcPaymentCancellationReason) {
            super("PaymentReviewEvent.WalletFlowFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qrcPaymentCancellationReason, "");
            this.reason = qrcPaymentCancellationReason;
        }

        public final com.paypal.oslo.feature.qrc.domain.model.cancelpayment.QrcPaymentCancellationReason getReason() {
            return this.reason;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.qrc.domain.model.cancelpayment.QrcPaymentCancellationReason qrcPaymentCancellationReason = this.reason;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("WalletFlowFailed(reason=");
            sb.append(qrcPaymentCancellationReason);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.reason.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.WalletFlowFailed) && this.reason == ((com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.WalletFlowFailed) other).reason;
        }

        public final com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.WalletFlowFailed copy(com.paypal.oslo.feature.qrc.domain.model.cancelpayment.QrcPaymentCancellationReason reason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
            return new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.WalletFlowFailed(reason);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.qrc.domain.model.cancelpayment.QrcPaymentCancellationReason getReason() {
            return this.reason;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.WalletFlowFailed copy$default(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.WalletFlowFailed walletFlowFailed, com.paypal.oslo.feature.qrc.domain.model.cancelpayment.QrcPaymentCancellationReason qrcPaymentCancellationReason, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                qrcPaymentCancellationReason = walletFlowFailed.reason;
            }
            return walletFlowFailed.copy(qrcPaymentCancellationReason);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$ShowConversionOptions;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowConversionOptions extends com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.ShowConversionOptions INSTANCE = new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.ShowConversionOptions();

        public final int hashCode() {
            return -1019030542;
        }

        private ShowConversionOptions() {
            super("PaymentReviewEvent.ShowConversionOptions", null);
        }

        public final java.lang.String toString() {
            return "ShowConversionOptions";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.ShowConversionOptions)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$DismissConversionOptions;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DismissConversionOptions extends com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.DismissConversionOptions INSTANCE = new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.DismissConversionOptions();

        public final int hashCode() {
            return -5464809;
        }

        private DismissConversionOptions() {
            super("PaymentReviewEvent.DismissConversionOptions", null);
        }

        public final java.lang.String toString() {
            return "DismissConversionOptions";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.DismissConversionOptions)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$ConversionOptionConfirmed;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent;", "Lcom/paypal/oslo/feature/qrc/ui/review/model/ConversionOptionTab;", "tab", "<init>", "(Lcom/paypal/oslo/feature/qrc/ui/review/model/ConversionOptionTab;)V", "component1", "()Lcom/paypal/oslo/feature/qrc/ui/review/model/ConversionOptionTab;", "copy", "(Lcom/paypal/oslo/feature/qrc/ui/review/model/ConversionOptionTab;)Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$ConversionOptionConfirmed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/qrc/ui/review/model/ConversionOptionTab;", "getTab"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ConversionOptionConfirmed extends com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.qrc.ui.review.model.ConversionOptionTab tab;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConversionOptionConfirmed(com.paypal.oslo.feature.qrc.ui.review.model.ConversionOptionTab conversionOptionTab) {
            super("PaymentReviewEvent.ConversionOptionConfirmed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(conversionOptionTab, "");
            this.tab = conversionOptionTab;
        }

        public final com.paypal.oslo.feature.qrc.ui.review.model.ConversionOptionTab getTab() {
            return this.tab;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.qrc.ui.review.model.ConversionOptionTab conversionOptionTab = this.tab;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ConversionOptionConfirmed(tab=");
            sb.append(conversionOptionTab);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.tab.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.ConversionOptionConfirmed) && this.tab == ((com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.ConversionOptionConfirmed) other).tab;
        }

        public final com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.ConversionOptionConfirmed copy(com.paypal.oslo.feature.qrc.ui.review.model.ConversionOptionTab tab) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tab, "");
            return new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.ConversionOptionConfirmed(tab);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.qrc.ui.review.model.ConversionOptionTab getTab() {
            return this.tab;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.ConversionOptionConfirmed copy$default(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.ConversionOptionConfirmed conversionOptionConfirmed, com.paypal.oslo.feature.qrc.ui.review.model.ConversionOptionTab conversionOptionTab, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                conversionOptionTab = conversionOptionConfirmed.tab;
            }
            return conversionOptionConfirmed.copy(conversionOptionTab);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$SelectConversionTab;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent;", "Lcom/paypal/oslo/feature/qrc/ui/review/model/ConversionOptionTab;", "tab", "<init>", "(Lcom/paypal/oslo/feature/qrc/ui/review/model/ConversionOptionTab;)V", "component1", "()Lcom/paypal/oslo/feature/qrc/ui/review/model/ConversionOptionTab;", "copy", "(Lcom/paypal/oslo/feature/qrc/ui/review/model/ConversionOptionTab;)Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent$SelectConversionTab;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/qrc/ui/review/model/ConversionOptionTab;", "getTab"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SelectConversionTab extends com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.qrc.ui.review.model.ConversionOptionTab tab;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelectConversionTab(com.paypal.oslo.feature.qrc.ui.review.model.ConversionOptionTab conversionOptionTab) {
            super("PaymentReviewEvent.SelectConversionTab", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(conversionOptionTab, "");
            this.tab = conversionOptionTab;
        }

        public final com.paypal.oslo.feature.qrc.ui.review.model.ConversionOptionTab getTab() {
            return this.tab;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.qrc.ui.review.model.ConversionOptionTab conversionOptionTab = this.tab;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SelectConversionTab(tab=");
            sb.append(conversionOptionTab);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.tab.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.SelectConversionTab) && this.tab == ((com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.SelectConversionTab) other).tab;
        }

        public final com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.SelectConversionTab copy(com.paypal.oslo.feature.qrc.ui.review.model.ConversionOptionTab tab) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tab, "");
            return new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.SelectConversionTab(tab);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.qrc.ui.review.model.ConversionOptionTab getTab() {
            return this.tab;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.SelectConversionTab copy$default(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.SelectConversionTab selectConversionTab, com.paypal.oslo.feature.qrc.ui.review.model.ConversionOptionTab conversionOptionTab, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                conversionOptionTab = selectConversionTab.tab;
            }
            return selectConversionTab.copy(conversionOptionTab);
        }
    }

    public /* synthetic */ PaymentReviewEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
