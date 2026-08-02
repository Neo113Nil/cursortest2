package com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u000f\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u000f\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "OnViewCreated", "OnOptionChanged", "OnCustomAmountChanged", "OnPaymentMethodActionClicked", "OnConfirmClicked", "OnCancelClicked", "OnCancelAutopayConfirmed", "OnBackClicked", "OnTermsAndConditionsClicked", "OnPaymentMethodSelected", "OnDataFetched", "OnErrorFetchingData", "OnTryAgainClicked", "OnUpdateAutopaySuccess", "OnUpdateAutopayError", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayEvent$OnBackClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayEvent$OnCancelAutopayConfirmed;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayEvent$OnCancelClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayEvent$OnConfirmClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayEvent$OnCustomAmountChanged;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayEvent$OnDataFetched;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayEvent$OnErrorFetchingData;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayEvent$OnOptionChanged;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayEvent$OnPaymentMethodActionClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayEvent$OnPaymentMethodSelected;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayEvent$OnTermsAndConditionsClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayEvent$OnTryAgainClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayEvent$OnUpdateAutopayError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayEvent$OnUpdateAutopaySuccess;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayEvent$OnViewCreated;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class AutopayEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private AutopayEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayEvent$OnViewCreated;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayEvent;", "", "creditAccountId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayEvent$OnViewCreated;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCreditAccountId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnViewCreated extends com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent {
        public static final int $stable = 0;
        private final java.lang.String creditAccountId;

        public OnViewCreated(java.lang.String str) {
            super("OnViewCreated", null);
            this.creditAccountId = str;
        }

        public /* synthetic */ OnViewCreated(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.creditAccountId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnViewCreated(creditAccountId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.creditAccountId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnViewCreated) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnViewCreated) other).creditAccountId);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnViewCreated copy(java.lang.String creditAccountId) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnViewCreated(creditAccountId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnViewCreated copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnViewCreated onViewCreated, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onViewCreated.creditAccountId;
            }
            return onViewCreated.copy(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public OnViewCreated() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayEvent$OnOptionChanged;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentOption;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.OPTION, "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentOption;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentOption;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentOption;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayEvent$OnOptionChanged;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentOption;", "getOption"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnOptionChanged extends com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption option;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnOptionChanged(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption) {
            super("OnOptionChanged", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentOption, "");
            this.option = paymentOption;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption getOption() {
            return this.option;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption = this.option;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnOptionChanged(option=");
            sb.append(paymentOption);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.option.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnOptionChanged) && this.option == ((com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnOptionChanged) other).option;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnOptionChanged copy(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption option) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(option, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnOptionChanged(option);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption getOption() {
            return this.option;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnOptionChanged copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnOptionChanged onOptionChanged, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                paymentOption = onOptionChanged.option;
            }
            return onOptionChanged.copy(paymentOption);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayEvent$OnCustomAmountChanged;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayEvent;", "", "customAmount", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayEvent$OnCustomAmountChanged;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCustomAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnCustomAmountChanged extends com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent {
        public static final int $stable = 0;
        private final java.lang.String customAmount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnCustomAmountChanged(java.lang.String str) {
            super("OnCustomAmountChanged", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.customAmount = str;
        }

        public final java.lang.String getCustomAmount() {
            return this.customAmount;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.customAmount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnCustomAmountChanged(customAmount=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.customAmount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnCustomAmountChanged) && kotlin.jvm.internal.Intrinsics.areEqual(this.customAmount, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnCustomAmountChanged) other).customAmount);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnCustomAmountChanged copy(java.lang.String customAmount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customAmount, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnCustomAmountChanged(customAmount);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCustomAmount() {
            return this.customAmount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnCustomAmountChanged copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnCustomAmountChanged onCustomAmountChanged, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onCustomAmountChanged.customAmount;
            }
            return onCustomAmountChanged.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayEvent$OnPaymentMethodActionClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnPaymentMethodActionClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnPaymentMethodActionClicked INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnPaymentMethodActionClicked();

        public final int hashCode() {
            return -1236952659;
        }

        private OnPaymentMethodActionClicked() {
            super("OnPaymentMethodActionClicked", null);
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final java.lang.String toString() {
            return "OnPaymentMethodActionClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnPaymentMethodActionClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayEvent$OnConfirmClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnConfirmClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnConfirmClicked INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnConfirmClicked();

        public final int hashCode() {
            return -1667174998;
        }

        private OnConfirmClicked() {
            super("OnConfirmClicked", null);
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final java.lang.String toString() {
            return "OnConfirmClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnConfirmClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayEvent$OnCancelClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnCancelClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnCancelClicked INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnCancelClicked();

        public final int hashCode() {
            return -2086584438;
        }

        private OnCancelClicked() {
            super("OnCancelClicked", null);
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final java.lang.String toString() {
            return "OnCancelClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnCancelClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayEvent$OnCancelAutopayConfirmed;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnCancelAutopayConfirmed extends com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnCancelAutopayConfirmed INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnCancelAutopayConfirmed();

        public final int hashCode() {
            return 815509187;
        }

        private OnCancelAutopayConfirmed() {
            super("OnCancelAutopayConfirmed", null);
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final java.lang.String toString() {
            return "OnCancelAutopayConfirmed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnCancelAutopayConfirmed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayEvent$OnBackClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBackClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnBackClicked INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnBackClicked();

        public final int hashCode() {
            return -733319235;
        }

        private OnBackClicked() {
            super("OnBackClicked", null);
        }

        public final java.lang.String toString() {
            return "OnBackClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnBackClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayEvent$OnTermsAndConditionsClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayEvent;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayEvent$OnTermsAndConditionsClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnTermsAndConditionsClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent {
        public static final int $stable = 0;
        private final java.lang.String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnTermsAndConditionsClicked(java.lang.String str) {
            super("OnTermsAndConditionsClicked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnTermsAndConditionsClicked(url=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnTermsAndConditionsClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnTermsAndConditionsClicked) other).url);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnTermsAndConditionsClicked copy(java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnTermsAndConditionsClicked(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnTermsAndConditionsClicked copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnTermsAndConditionsClicked onTermsAndConditionsClicked, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onTermsAndConditionsClicked.url;
            }
            return onTermsAndConditionsClicked.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002BK\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000eJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000eJb\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u000eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b\"\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b#\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b$\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b%\u0010\u000eR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b&\u0010\u000eR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b'\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayEvent$OnPaymentMethodSelected;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "", "balanceId", "balanceAmount", "bankId", "bankName", "bankLastFour", "bankAccountType", "iconThumbnail", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayEvent$OnPaymentMethodSelected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getBalanceId", "getBalanceAmount", "getBankId", "getBankName", "getBankLastFour", "getBankAccountType", "getIconThumbnail"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnPaymentMethodSelected extends com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        private final java.lang.String balanceAmount;
        private final java.lang.String balanceId;
        private final java.lang.String bankAccountType;
        private final java.lang.String bankId;
        private final java.lang.String bankLastFour;
        private final java.lang.String bankName;
        private final java.lang.String iconThumbnail;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnPaymentMethodSelected(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
            super("OnPaymentMethodSelected", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.balanceId = str;
            this.balanceAmount = str2;
            this.bankId = str3;
            this.bankName = str4;
            this.bankLastFour = str5;
            this.bankAccountType = str6;
            this.iconThumbnail = str7;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final java.lang.String getBalanceId() {
            return this.balanceId;
        }

        public final java.lang.String getBalanceAmount() {
            return this.balanceAmount;
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
            java.lang.String str = this.balanceId;
            java.lang.String str2 = this.balanceAmount;
            java.lang.String str3 = this.bankId;
            java.lang.String str4 = this.bankName;
            java.lang.String str5 = this.bankLastFour;
            java.lang.String str6 = this.bankAccountType;
            java.lang.String str7 = this.iconThumbnail;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnPaymentMethodSelected(balanceId=");
            sb.append(str);
            sb.append(", balanceAmount=");
            sb.append(str2);
            sb.append(", bankId=");
            sb.append(str3);
            sb.append(", bankName=");
            sb.append(str4);
            sb.append(", bankLastFour=");
            sb.append(str5);
            sb.append(", bankAccountType=");
            sb.append(str6);
            sb.append(", iconThumbnail=");
            sb.append(str7);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.balanceId;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.balanceAmount;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            int hashCode3 = this.bankId.hashCode();
            java.lang.String str3 = this.bankName;
            int hashCode4 = str3 == null ? 0 : str3.hashCode();
            java.lang.String str4 = this.bankLastFour;
            int hashCode5 = str4 == null ? 0 : str4.hashCode();
            java.lang.String str5 = this.bankAccountType;
            int hashCode6 = str5 == null ? 0 : str5.hashCode();
            java.lang.String str6 = this.iconThumbnail;
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (str6 != null ? str6.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnPaymentMethodSelected)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnPaymentMethodSelected onPaymentMethodSelected = (com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnPaymentMethodSelected) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.balanceId, onPaymentMethodSelected.balanceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.balanceAmount, onPaymentMethodSelected.balanceAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.bankId, onPaymentMethodSelected.bankId) && kotlin.jvm.internal.Intrinsics.areEqual(this.bankName, onPaymentMethodSelected.bankName) && kotlin.jvm.internal.Intrinsics.areEqual(this.bankLastFour, onPaymentMethodSelected.bankLastFour) && kotlin.jvm.internal.Intrinsics.areEqual(this.bankAccountType, onPaymentMethodSelected.bankAccountType) && kotlin.jvm.internal.Intrinsics.areEqual(this.iconThumbnail, onPaymentMethodSelected.iconThumbnail);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnPaymentMethodSelected copy(java.lang.String balanceId, java.lang.String balanceAmount, java.lang.String bankId, java.lang.String bankName, java.lang.String bankLastFour, java.lang.String bankAccountType, java.lang.String iconThumbnail) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankId, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnPaymentMethodSelected(balanceId, balanceAmount, bankId, bankName, bankLastFour, bankAccountType, iconThumbnail);
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getIconThumbnail() {
            return this.iconThumbnail;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getBankAccountType() {
            return this.bankAccountType;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getBankLastFour() {
            return this.bankLastFour;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getBankName() {
            return this.bankName;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getBankId() {
            return this.bankId;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getBalanceAmount() {
            return this.balanceAmount;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getBalanceId() {
            return this.balanceId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnPaymentMethodSelected copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnPaymentMethodSelected onPaymentMethodSelected, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onPaymentMethodSelected.balanceId;
            }
            if ((i & 2) != 0) {
                str2 = onPaymentMethodSelected.balanceAmount;
            }
            java.lang.String str8 = str2;
            if ((i & 4) != 0) {
                str3 = onPaymentMethodSelected.bankId;
            }
            java.lang.String str9 = str3;
            if ((i & 8) != 0) {
                str4 = onPaymentMethodSelected.bankName;
            }
            java.lang.String str10 = str4;
            if ((i & 16) != 0) {
                str5 = onPaymentMethodSelected.bankLastFour;
            }
            java.lang.String str11 = str5;
            if ((i & 32) != 0) {
                str6 = onPaymentMethodSelected.bankAccountType;
            }
            java.lang.String str12 = str6;
            if ((i & 64) != 0) {
                str7 = onPaymentMethodSelected.iconThumbnail;
            }
            return onPaymentMethodSelected.copy(str, str8, str9, str10, str11, str12, str7);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002BC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018JX\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b&\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u0014R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b.\u0010\u0018R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b0\u0010\u001aR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010-\u001a\u0004\b1\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayEvent$OnDataFetched;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/uimodel/AutopayScreenUiModel;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "creditProductIdentifier", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/EligiblePaymentInstrument;", "eligibleFundingInstruments", "", "creditAccountId", "Ljava/math/BigDecimal;", "maxAllowableRepaymentAmount", "currencyCode", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/uimodel/AutopayScreenUiModel;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Ljava/util/List;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/uimodel/AutopayScreenUiModel;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "component3", "()Ljava/util/List;", "component4", "()Ljava/lang/String;", "component5", "()Ljava/math/BigDecimal;", "component6", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/uimodel/AutopayScreenUiModel;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Ljava/util/List;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayEvent$OnDataFetched;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/uimodel/AutopayScreenUiModel;", "getData", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "getCreditProductIdentifier", "Ljava/util/List;", "getEligibleFundingInstruments", "Ljava/lang/String;", "getCreditAccountId", "Ljava/math/BigDecimal;", "getMaxAllowableRepaymentAmount", "getCurrencyCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnDataFetched extends com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 8;
        private final java.lang.String creditAccountId;
        private final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier;
        private final java.lang.String currencyCode;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.AutopayScreenUiModel data;
        private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> eligibleFundingInstruments;
        private final java.math.BigDecimal maxAllowableRepaymentAmount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OnDataFetched(com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.AutopayScreenUiModel autopayScreenUiModel, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> list, java.lang.String str, java.math.BigDecimal bigDecimal, java.lang.String str2) {
            super("OnDataFetched", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autopayScreenUiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.data = autopayScreenUiModel;
            this.creditProductIdentifier = creditProductIdentifier;
            this.eligibleFundingInstruments = list;
            this.creditAccountId = str;
            this.maxAllowableRepaymentAmount = bigDecimal;
            this.currencyCode = str2;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.AutopayScreenUiModel getData() {
            return this.data;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCreditProductIdentifier() {
            return this.creditProductIdentifier;
        }

        public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> getEligibleFundingInstruments() {
            return this.eligibleFundingInstruments;
        }

        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public final java.math.BigDecimal getMaxAllowableRepaymentAmount() {
            return this.maxAllowableRepaymentAmount;
        }

        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.AutopayScreenUiModel autopayScreenUiModel = this.data;
            com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = this.creditProductIdentifier;
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> list = this.eligibleFundingInstruments;
            java.lang.String str = this.creditAccountId;
            java.math.BigDecimal bigDecimal = this.maxAllowableRepaymentAmount;
            java.lang.String str2 = this.currencyCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnDataFetched(data=");
            sb.append(autopayScreenUiModel);
            sb.append(", creditProductIdentifier=");
            sb.append(creditProductIdentifier);
            sb.append(", eligibleFundingInstruments=");
            sb.append(list);
            sb.append(", creditAccountId=");
            sb.append(str);
            sb.append(", maxAllowableRepaymentAmount=");
            sb.append(bigDecimal);
            sb.append(", currencyCode=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.data.hashCode();
            int hashCode2 = this.creditProductIdentifier.hashCode();
            int hashCode3 = this.eligibleFundingInstruments.hashCode();
            java.lang.String str = this.creditAccountId;
            int hashCode4 = str == null ? 0 : str.hashCode();
            java.math.BigDecimal bigDecimal = this.maxAllowableRepaymentAmount;
            int hashCode5 = bigDecimal == null ? 0 : bigDecimal.hashCode();
            java.lang.String str2 = this.currencyCode;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnDataFetched)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnDataFetched onDataFetched = (com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnDataFetched) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.data, onDataFetched.data) && this.creditProductIdentifier == onDataFetched.creditProductIdentifier && kotlin.jvm.internal.Intrinsics.areEqual(this.eligibleFundingInstruments, onDataFetched.eligibleFundingInstruments) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, onDataFetched.creditAccountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.maxAllowableRepaymentAmount, onDataFetched.maxAllowableRepaymentAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, onDataFetched.currencyCode);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnDataFetched copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.AutopayScreenUiModel data, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> eligibleFundingInstruments, java.lang.String creditAccountId, java.math.BigDecimal maxAllowableRepaymentAmount, java.lang.String currencyCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eligibleFundingInstruments, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnDataFetched(data, creditProductIdentifier, eligibleFundingInstruments, creditAccountId, maxAllowableRepaymentAmount, currencyCode);
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component5, reason: from getter */
        public final java.math.BigDecimal getMaxAllowableRepaymentAmount() {
            return this.maxAllowableRepaymentAmount;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> component3() {
            return this.eligibleFundingInstruments;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCreditProductIdentifier() {
            return this.creditProductIdentifier;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.AutopayScreenUiModel getData() {
            return this.data;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnDataFetched copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnDataFetched onDataFetched, com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.AutopayScreenUiModel autopayScreenUiModel, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.util.List list, java.lang.String str, java.math.BigDecimal bigDecimal, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                autopayScreenUiModel = onDataFetched.data;
            }
            if ((i & 2) != 0) {
                creditProductIdentifier = onDataFetched.creditProductIdentifier;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier2 = creditProductIdentifier;
            if ((i & 4) != 0) {
                list = onDataFetched.eligibleFundingInstruments;
            }
            java.util.List list2 = list;
            if ((i & 8) != 0) {
                str = onDataFetched.creditAccountId;
            }
            java.lang.String str3 = str;
            if ((i & 16) != 0) {
                bigDecimal = onDataFetched.maxAllowableRepaymentAmount;
            }
            java.math.BigDecimal bigDecimal2 = bigDecimal;
            if ((i & 32) != 0) {
                str2 = onDataFetched.currencyCode;
            }
            return onDataFetched.copy(autopayScreenUiModel, creditProductIdentifier2, list2, str3, bigDecimal2, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayEvent$OnErrorFetchingData;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "creditProductIdentifier", "", "creditAccountId", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayEvent$OnErrorFetchingData;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "getCreditProductIdentifier", "Ljava/lang/String;", "getCreditAccountId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnErrorFetchingData extends com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        private final java.lang.String creditAccountId;
        private final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnErrorFetchingData(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.lang.String str) {
            super("OnErrorFetchingData", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            this.creditProductIdentifier = creditProductIdentifier;
            this.creditAccountId = str;
        }

        public /* synthetic */ OnErrorFetchingData(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(creditProductIdentifier, (i & 2) != 0 ? null : str);
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCreditProductIdentifier() {
            return this.creditProductIdentifier;
        }

        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = this.creditProductIdentifier;
            java.lang.String str = this.creditAccountId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnErrorFetchingData(creditProductIdentifier=");
            sb.append(creditProductIdentifier);
            sb.append(", creditAccountId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.creditProductIdentifier.hashCode();
            java.lang.String str = this.creditAccountId;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnErrorFetchingData)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnErrorFetchingData onErrorFetchingData = (com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnErrorFetchingData) other;
            return this.creditProductIdentifier == onErrorFetchingData.creditProductIdentifier && kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, onErrorFetchingData.creditAccountId);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnErrorFetchingData copy(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.lang.String creditAccountId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnErrorFetchingData(creditProductIdentifier, creditAccountId);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCreditProductIdentifier() {
            return this.creditProductIdentifier;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnErrorFetchingData copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnErrorFetchingData onErrorFetchingData, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                creditProductIdentifier = onErrorFetchingData.creditProductIdentifier;
            }
            if ((i & 2) != 0) {
                str = onErrorFetchingData.creditAccountId;
            }
            return onErrorFetchingData.copy(creditProductIdentifier, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayEvent$OnTryAgainClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayState$ErrorContext;", "errorContext", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayState$ErrorContext;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayState$ErrorContext;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayState$ErrorContext;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayEvent$OnTryAgainClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayState$ErrorContext;", "getErrorContext"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnTryAgainClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.ErrorContext errorContext;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnTryAgainClicked(com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.ErrorContext errorContext) {
            super("OnTryAgainClicked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorContext, "");
            this.errorContext = errorContext;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.ErrorContext getErrorContext() {
            return this.errorContext;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.ErrorContext errorContext = this.errorContext;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnTryAgainClicked(errorContext=");
            sb.append(errorContext);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.errorContext.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnTryAgainClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorContext, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnTryAgainClicked) other).errorContext);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnTryAgainClicked copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.ErrorContext errorContext) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorContext, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnTryAgainClicked(errorContext);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.ErrorContext getErrorContext() {
            return this.errorContext;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnTryAgainClicked copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnTryAgainClicked onTryAgainClicked, com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.ErrorContext errorContext, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                errorContext = onTryAgainClicked.errorContext;
            }
            return onTryAgainClicked.copy(errorContext);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayEvent$OnUpdateAutopaySuccess;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "", "effectiveInCurrentBillingCycle", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayEvent$OnUpdateAutopaySuccess;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getEffectiveInCurrentBillingCycle"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnUpdateAutopaySuccess extends com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        private final boolean effectiveInCurrentBillingCycle;

        public OnUpdateAutopaySuccess(boolean z) {
            super("OnUpdateAutopaySuccess", null);
            this.effectiveInCurrentBillingCycle = z;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final boolean getEffectiveInCurrentBillingCycle() {
            return this.effectiveInCurrentBillingCycle;
        }

        public final java.lang.String toString() {
            boolean z = this.effectiveInCurrentBillingCycle;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnUpdateAutopaySuccess(effectiveInCurrentBillingCycle=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.effectiveInCurrentBillingCycle);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnUpdateAutopaySuccess) && this.effectiveInCurrentBillingCycle == ((com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnUpdateAutopaySuccess) other).effectiveInCurrentBillingCycle;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnUpdateAutopaySuccess copy(boolean effectiveInCurrentBillingCycle) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnUpdateAutopaySuccess(effectiveInCurrentBillingCycle);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getEffectiveInCurrentBillingCycle() {
            return this.effectiveInCurrentBillingCycle;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnUpdateAutopaySuccess copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnUpdateAutopaySuccess onUpdateAutopaySuccess, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = onUpdateAutopaySuccess.effectiveInCurrentBillingCycle;
            }
            return onUpdateAutopaySuccess.copy(z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayEvent$OnUpdateAutopayError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnUpdateAutopayError extends com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnUpdateAutopayError INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnUpdateAutopayError();

        public final int hashCode() {
            return -1079403717;
        }

        private OnUpdateAutopayError() {
            super("OnUpdateAutopayError", null);
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final java.lang.String toString() {
            return "OnUpdateAutopayError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayEvent.OnUpdateAutopayError)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ AutopayEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
