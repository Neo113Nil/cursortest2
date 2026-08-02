package com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0006\n\u000b\f\r\u000e\u000fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0006\u0010\u0011\u0012\u0013\u0014\u0015"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "NavigateBack", "NavigateToPaymentConfirmation", "NavigateToChangeBank", "NavigateToAddBackupPayment", "NavigateToTermsAndConditions", "ShowAfterDueDateBottomSheet", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentUiEffect$NavigateBack;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentUiEffect$NavigateToAddBackupPayment;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentUiEffect$NavigateToChangeBank;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentUiEffect$NavigateToPaymentConfirmation;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentUiEffect$NavigateToTermsAndConditions;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentUiEffect$ShowAfterDueDateBottomSheet;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class ReviewPaymentUiEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private ReviewPaymentUiEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentUiEffect$NavigateBack;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBack extends com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect.NavigateBack INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect.NavigateBack();

        public final int hashCode() {
            return -1309606546;
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
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect.NavigateBack)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentUiEffect$NavigateToPaymentConfirmation;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentUiEffect;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/PaymentConfirmationArgs;", "args", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/PaymentConfirmationArgs;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/PaymentConfirmationArgs;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/PaymentConfirmationArgs;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentUiEffect$NavigateToPaymentConfirmation;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/PaymentConfirmationArgs;", "getArgs"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToPaymentConfirmation extends com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.PaymentConfirmationArgs args;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToPaymentConfirmation(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.PaymentConfirmationArgs paymentConfirmationArgs) {
            super("NavigateToPaymentConfirmation", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentConfirmationArgs, "");
            this.args = paymentConfirmationArgs;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.PaymentConfirmationArgs getArgs() {
            return this.args;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.PaymentConfirmationArgs paymentConfirmationArgs = this.args;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToPaymentConfirmation(args=");
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
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect.NavigateToPaymentConfirmation) && kotlin.jvm.internal.Intrinsics.areEqual(this.args, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect.NavigateToPaymentConfirmation) other).args);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect.NavigateToPaymentConfirmation copy(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.PaymentConfirmationArgs args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect.NavigateToPaymentConfirmation(args);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.PaymentConfirmationArgs getArgs() {
            return this.args;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect.NavigateToPaymentConfirmation copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect.NavigateToPaymentConfirmation navigateToPaymentConfirmation, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.PaymentConfirmationArgs paymentConfirmationArgs, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                paymentConfirmationArgs = navigateToPaymentConfirmation.args;
            }
            return navigateToPaymentConfirmation.copy(paymentConfirmationArgs);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentUiEffect$NavigateToChangeBank;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentUiEffect;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ChooseWayToPayArgs;", "args", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ChooseWayToPayArgs;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ChooseWayToPayArgs;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ChooseWayToPayArgs;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentUiEffect$NavigateToChangeBank;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ChooseWayToPayArgs;", "getArgs"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToChangeBank extends com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ChooseWayToPayArgs args;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToChangeBank(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ChooseWayToPayArgs chooseWayToPayArgs) {
            super("NavigateToChangeBank", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chooseWayToPayArgs, "");
            this.args = chooseWayToPayArgs;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ChooseWayToPayArgs getArgs() {
            return this.args;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ChooseWayToPayArgs chooseWayToPayArgs = this.args;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToChangeBank(args=");
            sb.append(chooseWayToPayArgs);
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
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect.NavigateToChangeBank) && kotlin.jvm.internal.Intrinsics.areEqual(this.args, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect.NavigateToChangeBank) other).args);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect.NavigateToChangeBank copy(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ChooseWayToPayArgs args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect.NavigateToChangeBank(args);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ChooseWayToPayArgs getArgs() {
            return this.args;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect.NavigateToChangeBank copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect.NavigateToChangeBank navigateToChangeBank, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ChooseWayToPayArgs chooseWayToPayArgs, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                chooseWayToPayArgs = navigateToChangeBank.args;
            }
            return navigateToChangeBank.copy(chooseWayToPayArgs);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentUiEffect$NavigateToAddBackupPayment;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentUiEffect;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/FundingInstrument;", "fundingInstruments", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentUiEffect$NavigateToAddBackupPayment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getFundingInstruments"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToAddBackupPayment extends com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> fundingInstruments;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public NavigateToAddBackupPayment(java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> list) {
            super("NavigateToAddBackupPayment", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.fundingInstruments = list;
        }

        public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> getFundingInstruments() {
            return this.fundingInstruments;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> list = this.fundingInstruments;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToAddBackupPayment(fundingInstruments=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.fundingInstruments.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect.NavigateToAddBackupPayment) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingInstruments, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect.NavigateToAddBackupPayment) other).fundingInstruments);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect.NavigateToAddBackupPayment copy(java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> fundingInstruments) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstruments, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect.NavigateToAddBackupPayment(fundingInstruments);
        }

        public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> component1() {
            return this.fundingInstruments;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect.NavigateToAddBackupPayment copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect.NavigateToAddBackupPayment navigateToAddBackupPayment, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = navigateToAddBackupPayment.fundingInstruments;
            }
            return navigateToAddBackupPayment.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentUiEffect$NavigateToTermsAndConditions;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentUiEffect;", "", "termsUrl", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentUiEffect$NavigateToTermsAndConditions;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTermsUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToTermsAndConditions extends com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect {
        public static final int $stable = 0;
        private final java.lang.String termsUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToTermsAndConditions(java.lang.String str) {
            super("NavigateToTermsAndConditions", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.termsUrl = str;
        }

        public final java.lang.String getTermsUrl() {
            return this.termsUrl;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.termsUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToTermsAndConditions(termsUrl=");
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
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect.NavigateToTermsAndConditions) && kotlin.jvm.internal.Intrinsics.areEqual(this.termsUrl, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect.NavigateToTermsAndConditions) other).termsUrl);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect.NavigateToTermsAndConditions copy(java.lang.String termsUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(termsUrl, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect.NavigateToTermsAndConditions(termsUrl);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getTermsUrl() {
            return this.termsUrl;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect.NavigateToTermsAndConditions copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect.NavigateToTermsAndConditions navigateToTermsAndConditions, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToTermsAndConditions.termsUrl;
            }
            return navigateToTermsAndConditions.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentUiEffect$ShowAfterDueDateBottomSheet;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowAfterDueDateBottomSheet extends com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect.ShowAfterDueDateBottomSheet INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect.ShowAfterDueDateBottomSheet();

        public final int hashCode() {
            return -1263207973;
        }

        private ShowAfterDueDateBottomSheet() {
            super("ShowAfterDueDateBottomSheet", null);
        }

        public final java.lang.String toString() {
            return "ShowAfterDueDateBottomSheet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect.ShowAfterDueDateBottomSheet)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ ReviewPaymentUiEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
