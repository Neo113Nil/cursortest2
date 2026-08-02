package com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0013\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001cB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0013\u001d\u001e\u001f !\"#$%&'()*+,-./"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "OnViewCreated", "OnViewUpdated", "OnBackPressed", "OnPayClick", "OnChangeBankClick", "OnChangeDateClick", "OnAddBackupPaymentClick", "OnDateSelected", "OnCalendarDismissed", "OnTermsClick", "PaymentRequestSuccess", "PaymentRequestError", "OnPaymentCreated", "OnPaymentFailed", "OnBackupPaymentMethodSelected", "OnPaymentMethodSelected", "PaymentValidationPassed", "PaymentValidationFailed", "OnScheduledPaymentAfterDueDate", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent$OnAddBackupPaymentClick;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent$OnBackPressed;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent$OnBackupPaymentMethodSelected;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent$OnCalendarDismissed;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent$OnChangeBankClick;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent$OnChangeDateClick;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent$OnDateSelected;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent$OnPayClick;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent$OnPaymentCreated;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent$OnPaymentFailed;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent$OnPaymentMethodSelected;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent$OnScheduledPaymentAfterDueDate;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent$OnTermsClick;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent$OnViewCreated;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent$OnViewUpdated;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent$PaymentRequestError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent$PaymentRequestSuccess;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent$PaymentValidationFailed;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent$PaymentValidationPassed;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class ReviewPaymentEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent$OnViewCreated;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ReviewPaymentArgs;", "args", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ReviewPaymentArgs;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ReviewPaymentArgs;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ReviewPaymentArgs;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent$OnViewCreated;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ReviewPaymentArgs;", "getArgs"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnViewCreated extends com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ReviewPaymentArgs args;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnViewCreated(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ReviewPaymentArgs reviewPaymentArgs) {
            super("OnViewCreated", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewPaymentArgs, "");
            this.args = reviewPaymentArgs;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ReviewPaymentArgs getArgs() {
            return this.args;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ReviewPaymentArgs reviewPaymentArgs = this.args;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnViewCreated(args=");
            sb.append(reviewPaymentArgs);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.args.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnViewCreated) && kotlin.jvm.internal.Intrinsics.areEqual(this.args, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnViewCreated) other).args);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnViewCreated copy(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ReviewPaymentArgs args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnViewCreated(args);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ReviewPaymentArgs getArgs() {
            return this.args;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnViewCreated copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnViewCreated onViewCreated, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ReviewPaymentArgs reviewPaymentArgs, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                reviewPaymentArgs = onViewCreated.args;
            }
            return onViewCreated.copy(reviewPaymentArgs);
        }
    }

    private ReviewPaymentEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent$OnViewUpdated;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ReviewPaymentArgs;", "args", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/uimodel/ReviewPaymentUiModel;", "uiModel", "Ljava/time/LocalDate;", "paymentDate", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ReviewPaymentArgs;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/uimodel/ReviewPaymentUiModel;Ljava/time/LocalDate;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ReviewPaymentArgs;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/uimodel/ReviewPaymentUiModel;", "component3", "()Ljava/time/LocalDate;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ReviewPaymentArgs;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/uimodel/ReviewPaymentUiModel;Ljava/time/LocalDate;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent$OnViewUpdated;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ReviewPaymentArgs;", "getArgs", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/uimodel/ReviewPaymentUiModel;", "getUiModel", "Ljava/time/LocalDate;", "getPaymentDate"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnViewUpdated extends com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ReviewPaymentArgs args;
        private final java.time.LocalDate paymentDate;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.uimodel.ReviewPaymentUiModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnViewUpdated(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ReviewPaymentArgs reviewPaymentArgs, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.uimodel.ReviewPaymentUiModel reviewPaymentUiModel, java.time.LocalDate localDate) {
            super("OnViewUpdated", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewPaymentArgs, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewPaymentUiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localDate, "");
            this.args = reviewPaymentArgs;
            this.uiModel = reviewPaymentUiModel;
            this.paymentDate = localDate;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ReviewPaymentArgs getArgs() {
            return this.args;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.uimodel.ReviewPaymentUiModel getUiModel() {
            return this.uiModel;
        }

        public final java.time.LocalDate getPaymentDate() {
            return this.paymentDate;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ReviewPaymentArgs reviewPaymentArgs = this.args;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.uimodel.ReviewPaymentUiModel reviewPaymentUiModel = this.uiModel;
            java.time.LocalDate localDate = this.paymentDate;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnViewUpdated(args=");
            sb.append(reviewPaymentArgs);
            sb.append(", uiModel=");
            sb.append(reviewPaymentUiModel);
            sb.append(", paymentDate=");
            sb.append(localDate);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.args.hashCode() * 31) + this.uiModel.hashCode()) * 31) + this.paymentDate.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnViewUpdated)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnViewUpdated onViewUpdated = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnViewUpdated) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.args, onViewUpdated.args) && kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, onViewUpdated.uiModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentDate, onViewUpdated.paymentDate);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnViewUpdated copy(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ReviewPaymentArgs args, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.uimodel.ReviewPaymentUiModel uiModel, java.time.LocalDate paymentDate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentDate, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnViewUpdated(args, uiModel, paymentDate);
        }

        /* renamed from: component3, reason: from getter */
        public final java.time.LocalDate getPaymentDate() {
            return this.paymentDate;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.uimodel.ReviewPaymentUiModel getUiModel() {
            return this.uiModel;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ReviewPaymentArgs getArgs() {
            return this.args;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnViewUpdated copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnViewUpdated onViewUpdated, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ReviewPaymentArgs reviewPaymentArgs, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.uimodel.ReviewPaymentUiModel reviewPaymentUiModel, java.time.LocalDate localDate, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                reviewPaymentArgs = onViewUpdated.args;
            }
            if ((i & 2) != 0) {
                reviewPaymentUiModel = onViewUpdated.uiModel;
            }
            if ((i & 4) != 0) {
                localDate = onViewUpdated.paymentDate;
            }
            return onViewUpdated.copy(reviewPaymentArgs, reviewPaymentUiModel, localDate);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent$OnBackPressed;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBackPressed extends com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnBackPressed INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnBackPressed();

        public final int hashCode() {
            return -1466656267;
        }

        private OnBackPressed() {
            super("OnBackPressed", null);
        }

        public final java.lang.String toString() {
            return "OnBackPressed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnBackPressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent$OnPayClick;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnPayClick extends com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnPayClick INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnPayClick();

        public final int hashCode() {
            return 1380432710;
        }

        private OnPayClick() {
            super("OnPayClick", null);
        }

        public final java.lang.String toString() {
            return "OnPayClick";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnPayClick)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent$OnChangeBankClick;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnChangeBankClick extends com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnChangeBankClick INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnChangeBankClick();

        public final int hashCode() {
            return -556271978;
        }

        private OnChangeBankClick() {
            super("OnChangeBankClick", null);
        }

        public final java.lang.String toString() {
            return "OnChangeBankClick";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnChangeBankClick)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent$OnChangeDateClick;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnChangeDateClick extends com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnChangeDateClick INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnChangeDateClick();

        public final int hashCode() {
            return 982066276;
        }

        private OnChangeDateClick() {
            super("OnChangeDateClick", null);
        }

        public final java.lang.String toString() {
            return "OnChangeDateClick";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnChangeDateClick)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent$OnAddBackupPaymentClick;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnAddBackupPaymentClick extends com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnAddBackupPaymentClick INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnAddBackupPaymentClick();

        public final int hashCode() {
            return 421992639;
        }

        private OnAddBackupPaymentClick() {
            super("OnAddBackupPaymentClick", null);
        }

        public final java.lang.String toString() {
            return "OnAddBackupPaymentClick";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnAddBackupPaymentClick)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent$OnDateSelected;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent;", "Ljava/time/LocalDate;", "date", "<init>", "(Ljava/time/LocalDate;)V", "component1", "()Ljava/time/LocalDate;", "copy", "(Ljava/time/LocalDate;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent$OnDateSelected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/time/LocalDate;", "getDate"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnDateSelected extends com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent {
        public static final int $stable = 8;
        private final java.time.LocalDate date;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnDateSelected(java.time.LocalDate localDate) {
            super("OnDateSelected", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localDate, "");
            this.date = localDate;
        }

        public final java.time.LocalDate getDate() {
            return this.date;
        }

        public final java.lang.String toString() {
            java.time.LocalDate localDate = this.date;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnDateSelected(date=");
            sb.append(localDate);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.date.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnDateSelected) && kotlin.jvm.internal.Intrinsics.areEqual(this.date, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnDateSelected) other).date);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnDateSelected copy(java.time.LocalDate date) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnDateSelected(date);
        }

        /* renamed from: component1, reason: from getter */
        public final java.time.LocalDate getDate() {
            return this.date;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnDateSelected copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnDateSelected onDateSelected, java.time.LocalDate localDate, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                localDate = onDateSelected.date;
            }
            return onDateSelected.copy(localDate);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JL\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b%\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b&\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent$OnCalendarDismissed;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent;", "Ljava/time/LocalDate;", "date", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "formattedDate", "formattedDateShort", "buttonText", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RevolvingCreditPaymentType;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.PAYMENT_TYPE, "<init>", "(Ljava/time/LocalDate;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RevolvingCreditPaymentType;)V", "component1", "()Ljava/time/LocalDate;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "component3", "component4", "component5", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RevolvingCreditPaymentType;", "copy", "(Ljava/time/LocalDate;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RevolvingCreditPaymentType;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent$OnCalendarDismissed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/time/LocalDate;", "getDate", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "getFormattedDate", "getFormattedDateShort", "getButtonText", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RevolvingCreditPaymentType;", "getPaymentType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnCalendarDismissed extends com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString buttonText;
        private final java.time.LocalDate date;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString formattedDate;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString formattedDateShort;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RevolvingCreditPaymentType paymentType;

        public OnCalendarDismissed(java.time.LocalDate localDate, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString3, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RevolvingCreditPaymentType revolvingCreditPaymentType) {
            super("OnCalendarDismissed", null);
            this.date = localDate;
            this.formattedDate = uiString;
            this.formattedDateShort = uiString2;
            this.buttonText = uiString3;
            this.paymentType = revolvingCreditPaymentType;
        }

        public /* synthetic */ OnCalendarDismissed(java.time.LocalDate localDate, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString3, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RevolvingCreditPaymentType revolvingCreditPaymentType, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : localDate, (i & 2) != 0 ? null : uiString, (i & 4) != 0 ? null : uiString2, (i & 8) != 0 ? null : uiString3, (i & 16) != 0 ? null : revolvingCreditPaymentType);
        }

        public final java.time.LocalDate getDate() {
            return this.date;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getFormattedDate() {
            return this.formattedDate;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getFormattedDateShort() {
            return this.formattedDateShort;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getButtonText() {
            return this.buttonText;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RevolvingCreditPaymentType getPaymentType() {
            return this.paymentType;
        }

        public final java.lang.String toString() {
            java.time.LocalDate localDate = this.date;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString = this.formattedDate;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2 = this.formattedDateShort;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString3 = this.buttonText;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RevolvingCreditPaymentType revolvingCreditPaymentType = this.paymentType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnCalendarDismissed(date=");
            sb.append(localDate);
            sb.append(", formattedDate=");
            sb.append(uiString);
            sb.append(", formattedDateShort=");
            sb.append(uiString2);
            sb.append(", buttonText=");
            sb.append(uiString3);
            sb.append(", paymentType=");
            sb.append(revolvingCreditPaymentType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.time.LocalDate localDate = this.date;
            int hashCode = localDate == null ? 0 : localDate.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString = this.formattedDate;
            int hashCode2 = uiString == null ? 0 : uiString.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2 = this.formattedDateShort;
            int hashCode3 = uiString2 == null ? 0 : uiString2.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString3 = this.buttonText;
            int hashCode4 = uiString3 == null ? 0 : uiString3.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RevolvingCreditPaymentType revolvingCreditPaymentType = this.paymentType;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (revolvingCreditPaymentType != null ? revolvingCreditPaymentType.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnCalendarDismissed)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnCalendarDismissed onCalendarDismissed = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnCalendarDismissed) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.date, onCalendarDismissed.date) && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedDate, onCalendarDismissed.formattedDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedDateShort, onCalendarDismissed.formattedDateShort) && kotlin.jvm.internal.Intrinsics.areEqual(this.buttonText, onCalendarDismissed.buttonText) && this.paymentType == onCalendarDismissed.paymentType;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnCalendarDismissed copy(java.time.LocalDate date, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString formattedDate, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString formattedDateShort, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString buttonText, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RevolvingCreditPaymentType paymentType) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnCalendarDismissed(date, formattedDate, formattedDateShort, buttonText, paymentType);
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RevolvingCreditPaymentType getPaymentType() {
            return this.paymentType;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getButtonText() {
            return this.buttonText;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getFormattedDateShort() {
            return this.formattedDateShort;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getFormattedDate() {
            return this.formattedDate;
        }

        /* renamed from: component1, reason: from getter */
        public final java.time.LocalDate getDate() {
            return this.date;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnCalendarDismissed copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnCalendarDismissed onCalendarDismissed, java.time.LocalDate localDate, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString3, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RevolvingCreditPaymentType revolvingCreditPaymentType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                localDate = onCalendarDismissed.date;
            }
            if ((i & 2) != 0) {
                uiString = onCalendarDismissed.formattedDate;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString4 = uiString;
            if ((i & 4) != 0) {
                uiString2 = onCalendarDismissed.formattedDateShort;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString5 = uiString2;
            if ((i & 8) != 0) {
                uiString3 = onCalendarDismissed.buttonText;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString6 = uiString3;
            if ((i & 16) != 0) {
                revolvingCreditPaymentType = onCalendarDismissed.paymentType;
            }
            return onCalendarDismissed.copy(localDate, uiString4, uiString5, uiString6, revolvingCreditPaymentType);
        }

        public OnCalendarDismissed() {
            this(null, null, null, null, null, 31, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent$OnTermsClick;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent;", "", "termsUrl", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent$OnTermsClick;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTermsUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnTermsClick extends com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent {
        public static final int $stable = 0;
        private final java.lang.String termsUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnTermsClick(java.lang.String str) {
            super("OnTermsClicked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.termsUrl = str;
        }

        public final java.lang.String getTermsUrl() {
            return this.termsUrl;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.termsUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnTermsClick(termsUrl=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.termsUrl.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnTermsClick) && kotlin.jvm.internal.Intrinsics.areEqual(this.termsUrl, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnTermsClick) other).termsUrl);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnTermsClick copy(java.lang.String termsUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(termsUrl, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnTermsClick(termsUrl);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getTermsUrl() {
            return this.termsUrl;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnTermsClick copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnTermsClick onTermsClick, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onTermsClick.termsUrl;
            }
            return onTermsClick.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent$PaymentRequestSuccess;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/PaymentConfirmationArgs;", "args", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/PaymentConfirmationArgs;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/PaymentConfirmationArgs;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/PaymentConfirmationArgs;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent$PaymentRequestSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/PaymentConfirmationArgs;", "getArgs"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PaymentRequestSuccess extends com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.PaymentConfirmationArgs args;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaymentRequestSuccess(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.PaymentConfirmationArgs paymentConfirmationArgs) {
            super("PaymentRequestSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentConfirmationArgs, "");
            this.args = paymentConfirmationArgs;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.PaymentConfirmationArgs getArgs() {
            return this.args;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.PaymentConfirmationArgs paymentConfirmationArgs = this.args;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentRequestSuccess(args=");
            sb.append(paymentConfirmationArgs);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.args.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.PaymentRequestSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.args, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.PaymentRequestSuccess) other).args);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.PaymentRequestSuccess copy(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.PaymentConfirmationArgs args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.PaymentRequestSuccess(args);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.PaymentConfirmationArgs getArgs() {
            return this.args;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.PaymentRequestSuccess copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.PaymentRequestSuccess paymentRequestSuccess, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.PaymentConfirmationArgs paymentConfirmationArgs, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                paymentConfirmationArgs = paymentRequestSuccess.args;
            }
            return paymentRequestSuccess.copy(paymentConfirmationArgs);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent$PaymentRequestError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "errorMessage", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent$PaymentRequestError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "getErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PaymentRequestError extends com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString errorMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaymentRequestError(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString) {
            super("PaymentRequestError", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiString, "");
            this.errorMessage = uiString;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getErrorMessage() {
            return this.errorMessage;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString = this.errorMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentRequestError(errorMessage=");
            sb.append(uiString);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.errorMessage.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.PaymentRequestError) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.PaymentRequestError) other).errorMessage);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.PaymentRequestError copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString errorMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.PaymentRequestError(errorMessage);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getErrorMessage() {
            return this.errorMessage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.PaymentRequestError copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.PaymentRequestError paymentRequestError, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                uiString = paymentRequestError.errorMessage;
            }
            return paymentRequestError.copy(uiString);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent$OnPaymentCreated;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/MakePaymentResponse;", "response", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/MakePaymentResponse;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/MakePaymentResponse;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/MakePaymentResponse;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent$OnPaymentCreated;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/MakePaymentResponse;", "getResponse"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnPaymentCreated extends com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.MakePaymentResponse response;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnPaymentCreated(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.MakePaymentResponse makePaymentResponse) {
            super("OnPaymentCreated", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(makePaymentResponse, "");
            this.response = makePaymentResponse;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.MakePaymentResponse getResponse() {
            return this.response;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.MakePaymentResponse makePaymentResponse = this.response;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnPaymentCreated(response=");
            sb.append(makePaymentResponse);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.response.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnPaymentCreated) && kotlin.jvm.internal.Intrinsics.areEqual(this.response, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnPaymentCreated) other).response);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnPaymentCreated copy(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.MakePaymentResponse response) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnPaymentCreated(response);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.MakePaymentResponse getResponse() {
            return this.response;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnPaymentCreated copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnPaymentCreated onPaymentCreated, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.MakePaymentResponse makePaymentResponse, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                makePaymentResponse = onPaymentCreated.response;
            }
            return onPaymentCreated.copy(makePaymentResponse);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent$OnPaymentFailed;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "errorMessage", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent$OnPaymentFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "getErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnPaymentFailed extends com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString errorMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnPaymentFailed(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString) {
            super("OnPaymentFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiString, "");
            this.errorMessage = uiString;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getErrorMessage() {
            return this.errorMessage;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString = this.errorMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnPaymentFailed(errorMessage=");
            sb.append(uiString);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.errorMessage.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnPaymentFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnPaymentFailed) other).errorMessage);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnPaymentFailed copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString errorMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnPaymentFailed(errorMessage);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getErrorMessage() {
            return this.errorMessage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnPaymentFailed copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnPaymentFailed onPaymentFailed, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                uiString = onPaymentFailed.errorMessage;
            }
            return onPaymentFailed.copy(uiString);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJJ\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001e\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001f\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b \u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent$OnBackupPaymentMethodSelected;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent;", "", "bankId", "bankName", "bankLastFour", "bankAccountType", "iconThumbnail", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent$OnBackupPaymentMethodSelected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getBankId", "getBankName", "getBankLastFour", "getBankAccountType", "getIconThumbnail"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBackupPaymentMethodSelected extends com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent {
        public static final int $stable = 0;
        private final java.lang.String bankAccountType;
        private final java.lang.String bankId;
        private final java.lang.String bankLastFour;
        private final java.lang.String bankName;
        private final java.lang.String iconThumbnail;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnBackupPaymentMethodSelected(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
            super("OnBackupPaymentMethodSelected", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.bankId = str;
            this.bankName = str2;
            this.bankLastFour = str3;
            this.bankAccountType = str4;
            this.iconThumbnail = str5;
        }

        public final java.lang.String getBankId() {
            return this.bankId;
        }

        public final java.lang.String getBankName() {
            return this.bankName;
        }

        public final java.lang.String getBankLastFour() {
            return this.bankLastFour;
        }

        public final java.lang.String getBankAccountType() {
            return this.bankAccountType;
        }

        public final java.lang.String getIconThumbnail() {
            return this.iconThumbnail;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.bankId;
            java.lang.String str2 = this.bankName;
            java.lang.String str3 = this.bankLastFour;
            java.lang.String str4 = this.bankAccountType;
            java.lang.String str5 = this.iconThumbnail;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnBackupPaymentMethodSelected(bankId=");
            sb.append(str);
            sb.append(", bankName=");
            sb.append(str2);
            sb.append(", bankLastFour=");
            sb.append(str3);
            sb.append(", bankAccountType=");
            sb.append(str4);
            sb.append(", iconThumbnail=");
            sb.append(str5);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.bankId.hashCode();
            java.lang.String str = this.bankName;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.bankLastFour;
            int hashCode3 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.bankAccountType;
            int hashCode4 = str3 == null ? 0 : str3.hashCode();
            java.lang.String str4 = this.iconThumbnail;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str4 != null ? str4.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnBackupPaymentMethodSelected)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnBackupPaymentMethodSelected onBackupPaymentMethodSelected = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnBackupPaymentMethodSelected) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.bankId, onBackupPaymentMethodSelected.bankId) && kotlin.jvm.internal.Intrinsics.areEqual(this.bankName, onBackupPaymentMethodSelected.bankName) && kotlin.jvm.internal.Intrinsics.areEqual(this.bankLastFour, onBackupPaymentMethodSelected.bankLastFour) && kotlin.jvm.internal.Intrinsics.areEqual(this.bankAccountType, onBackupPaymentMethodSelected.bankAccountType) && kotlin.jvm.internal.Intrinsics.areEqual(this.iconThumbnail, onBackupPaymentMethodSelected.iconThumbnail);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnBackupPaymentMethodSelected copy(java.lang.String bankId, java.lang.String bankName, java.lang.String bankLastFour, java.lang.String bankAccountType, java.lang.String iconThumbnail) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankId, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnBackupPaymentMethodSelected(bankId, bankName, bankLastFour, bankAccountType, iconThumbnail);
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getIconThumbnail() {
            return this.iconThumbnail;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getBankAccountType() {
            return this.bankAccountType;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getBankLastFour() {
            return this.bankLastFour;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getBankName() {
            return this.bankName;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getBankId() {
            return this.bankId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnBackupPaymentMethodSelected copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnBackupPaymentMethodSelected onBackupPaymentMethodSelected, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onBackupPaymentMethodSelected.bankId;
            }
            if ((i & 2) != 0) {
                str2 = onBackupPaymentMethodSelected.bankName;
            }
            java.lang.String str6 = str2;
            if ((i & 4) != 0) {
                str3 = onBackupPaymentMethodSelected.bankLastFour;
            }
            java.lang.String str7 = str3;
            if ((i & 8) != 0) {
                str4 = onBackupPaymentMethodSelected.bankAccountType;
            }
            java.lang.String str8 = str4;
            if ((i & 16) != 0) {
                str5 = onBackupPaymentMethodSelected.iconThumbnail;
            }
            return onBackupPaymentMethodSelected.copy(str, str6, str7, str8, str5);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent$OnPaymentMethodSelected;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent;", "", "fundingInstrumentId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent$OnPaymentMethodSelected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFundingInstrumentId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnPaymentMethodSelected extends com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent {
        public static final int $stable = 0;
        private final java.lang.String fundingInstrumentId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnPaymentMethodSelected(java.lang.String str) {
            super("OnPaymentMethodSelected", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.fundingInstrumentId = str;
        }

        public final java.lang.String getFundingInstrumentId() {
            return this.fundingInstrumentId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.fundingInstrumentId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnPaymentMethodSelected(fundingInstrumentId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.fundingInstrumentId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnPaymentMethodSelected) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingInstrumentId, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnPaymentMethodSelected) other).fundingInstrumentId);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnPaymentMethodSelected copy(java.lang.String fundingInstrumentId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentId, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnPaymentMethodSelected(fundingInstrumentId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getFundingInstrumentId() {
            return this.fundingInstrumentId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnPaymentMethodSelected copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnPaymentMethodSelected onPaymentMethodSelected, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onPaymentMethodSelected.fundingInstrumentId;
            }
            return onPaymentMethodSelected.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent$PaymentValidationPassed;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PaymentValidationPassed extends com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.PaymentValidationPassed INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.PaymentValidationPassed();

        public final int hashCode() {
            return -250029752;
        }

        private PaymentValidationPassed() {
            super("PaymentValidationPassed", null);
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final java.lang.String toString() {
            return "PaymentValidationPassed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.PaymentValidationPassed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ(\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001a\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent$PaymentValidationFailed;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "errorMessage", "errorPaymentMethod", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "component2", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent$PaymentValidationFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "getErrorMessage", "getErrorPaymentMethod"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PaymentValidationFailed extends com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString errorMessage;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString errorPaymentMethod;

        public PaymentValidationFailed(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2) {
            super("PaymentValidationFailed", null);
            this.errorMessage = uiString;
            this.errorPaymentMethod = uiString2;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getErrorMessage() {
            return this.errorMessage;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getErrorPaymentMethod() {
            return this.errorPaymentMethod;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString = this.errorMessage;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2 = this.errorPaymentMethod;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentValidationFailed(errorMessage=");
            sb.append(uiString);
            sb.append(", errorPaymentMethod=");
            sb.append(uiString2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString = this.errorMessage;
            int hashCode = uiString == null ? 0 : uiString.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2 = this.errorPaymentMethod;
            return (hashCode * 31) + (uiString2 != null ? uiString2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.PaymentValidationFailed)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.PaymentValidationFailed paymentValidationFailed = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.PaymentValidationFailed) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, paymentValidationFailed.errorMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorPaymentMethod, paymentValidationFailed.errorPaymentMethod);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.PaymentValidationFailed copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString errorMessage, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString errorPaymentMethod) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.PaymentValidationFailed(errorMessage, errorPaymentMethod);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getErrorPaymentMethod() {
            return this.errorPaymentMethod;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getErrorMessage() {
            return this.errorMessage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.PaymentValidationFailed copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.PaymentValidationFailed paymentValidationFailed, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                uiString = paymentValidationFailed.errorMessage;
            }
            if ((i & 2) != 0) {
                uiString2 = paymentValidationFailed.errorPaymentMethod;
            }
            return paymentValidationFailed.copy(uiString, uiString2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent$OnScheduledPaymentAfterDueDate;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnScheduledPaymentAfterDueDate extends com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnScheduledPaymentAfterDueDate INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnScheduledPaymentAfterDueDate();

        public final int hashCode() {
            return -485927931;
        }

        private OnScheduledPaymentAfterDueDate() {
            super("OnScheduledPaymentAfterDueDate", null);
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final java.lang.String toString() {
            return "OnScheduledPaymentAfterDueDate";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnScheduledPaymentAfterDueDate)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ ReviewPaymentEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
