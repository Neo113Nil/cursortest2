package com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0007\n\u000b\f\r\u000e\u000f\u0010B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0006\u0011\u0012\u0013\u0014\u0015\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initial", "Loading", com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY, "ProcessingAutopayPreferenceUpdate", "UpdateCompleted", "Error", "ErrorContext", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayState$Error;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayState$Initial;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayState$Loading;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayState$ProcessingAutopayPreferenceUpdate;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayState$Ready;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayState$UpdateCompleted;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class AutopayState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    private AutopayState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayState$Initial;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.Initial INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.Initial();

        public final int hashCode() {
            return 1319116055;
        }

        private Initial() {
            super("Initial", null);
        }

        public final java.lang.String toString() {
            return "Initial";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.Initial)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayState$Loading;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayState;", "", "creditAccountId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayState$Loading;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCreditAccountId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState {
        public static final int $stable = 0;
        private final java.lang.String creditAccountId;

        public Loading(java.lang.String str) {
            super("Loading", null);
            this.creditAccountId = str;
        }

        public /* synthetic */ Loading(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.creditAccountId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Loading(creditAccountId=");
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
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.Loading) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.Loading) other).creditAccountId);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.Loading copy(java.lang.String creditAccountId) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.Loading(creditAccountId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.Loading copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.Loading loading, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = loading.creditAccountId;
            }
            return loading.copy(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Loading() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002Bi\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0012\u0010!\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b#\u0010\u001dJ\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\n0\u0012HÆ\u0003¢\u0006\u0004\b$\u0010%J~\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\n2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u0012HÆ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010.\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b0\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b2\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b4\u0010\u0019R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b6\u0010\u001bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b8\u0010\u001dR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00109\u001a\u0004\b:\u0010\u001fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00107\u001a\u0004\b;\u0010\u001dR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010<\u001a\u0004\b=\u0010\"R\u001a\u0010\u0011\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00107\u001a\u0004\b>\u0010\u001dR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010?\u001a\u0004\b@\u0010%R\u0014\u0010D\u001a\u00020A8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0014\u0010G\u001a\u00020*8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bE\u0010F"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayState$Ready;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/uimodel/AutopayScreenUiModel;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "creditProductIdentifier", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/EligiblePaymentInstrument;", "eligibleFundingInstruments", "", "creditAccountId", "Ljava/math/BigDecimal;", "maxAllowableRepaymentAmount", "currencyCode", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentOption;", "originalSelectedOption", "originalCustomAmount", "", "originalFundingInstrumentIds", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/uimodel/AutopayScreenUiModel;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Ljava/util/List;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentOption;Ljava/lang/String;Ljava/util/Set;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/uimodel/AutopayScreenUiModel;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "component3", "()Ljava/util/List;", "component4", "()Ljava/lang/String;", "component5", "()Ljava/math/BigDecimal;", "component6", "component7", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentOption;", "component8", "component9", "()Ljava/util/Set;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/uimodel/AutopayScreenUiModel;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Ljava/util/List;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentOption;Ljava/lang/String;Ljava/util/Set;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayState$Ready;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/uimodel/AutopayScreenUiModel;", "getData", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "getCreditProductIdentifier", "Ljava/util/List;", "getEligibleFundingInstruments", "Ljava/lang/String;", "getCreditAccountId", "Ljava/math/BigDecimal;", "getMaxAllowableRepaymentAmount", "getCurrencyCode", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentOption;", "getOriginalSelectedOption", "getOriginalCustomAmount", "Ljava/util/Set;", "getOriginalFundingInstrumentIds", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "getButtonText$revolvingcredit_servicing_prodRelease", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "buttonText", "isSubmitRequired$revolvingcredit_servicing_prodRelease", "()Z", "isSubmitRequired"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Ready extends com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 8;
        private final java.lang.String creditAccountId;
        private final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier;
        private final java.lang.String currencyCode;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.AutopayScreenUiModel data;
        private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> eligibleFundingInstruments;
        private final java.math.BigDecimal maxAllowableRepaymentAmount;
        private final java.lang.String originalCustomAmount;
        private final java.util.Set<java.lang.String> originalFundingInstrumentIds;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption originalSelectedOption;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Ready(com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.AutopayScreenUiModel autopayScreenUiModel, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> list, java.lang.String str, java.math.BigDecimal bigDecimal, java.lang.String str2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption, java.lang.String str3, java.util.Set<java.lang.String> set) {
            super(com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autopayScreenUiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
            this.data = autopayScreenUiModel;
            this.creditProductIdentifier = creditProductIdentifier;
            this.eligibleFundingInstruments = list;
            this.creditAccountId = str;
            this.maxAllowableRepaymentAmount = bigDecimal;
            this.currencyCode = str2;
            this.originalSelectedOption = paymentOption;
            this.originalCustomAmount = str3;
            this.originalFundingInstrumentIds = set;
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

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption getOriginalSelectedOption() {
            return this.originalSelectedOption;
        }

        public /* synthetic */ Ready(com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.AutopayScreenUiModel autopayScreenUiModel, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.util.List list, java.lang.String str, java.math.BigDecimal bigDecimal, java.lang.String str2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption, java.lang.String str3, java.util.Set set, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(autopayScreenUiModel, creditProductIdentifier, list, str, bigDecimal, str2, (i & 64) != 0 ? null : paymentOption, (i & 128) != 0 ? "" : str3, (i & 256) != 0 ? kotlin.collections.SetsKt.emptySet() : set);
        }

        public final java.lang.String getOriginalCustomAmount() {
            return this.originalCustomAmount;
        }

        public final java.util.Set<java.lang.String> getOriginalFundingInstrumentIds() {
            return this.originalFundingInstrumentIds;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString getButtonText$revolvingcredit_servicing_prodRelease() {
            if (isSubmitRequired$revolvingcredit_servicing_prodRelease()) {
                return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_autopay_confirm_button, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            }
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_ok, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }

        public final boolean isSubmitRequired$revolvingcredit_servicing_prodRelease() {
            if (this.data.isEnrolled() && this.data.getSelectAmountData().getSelectedOption() == this.originalSelectedOption) {
                return (this.data.getSelectAmountData().getSelectedOption() == com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.CUSTOM_AMOUNT && !kotlin.jvm.internal.Intrinsics.areEqual(this.data.getSelectAmountData().getCustomAmount(), this.originalCustomAmount)) || !kotlin.jvm.internal.Intrinsics.areEqual(com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayStateKt.toIds(this.data.getPaymentMethodData().getFundingInstrument()), this.originalFundingInstrumentIds);
            }
            return true;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.AutopayScreenUiModel autopayScreenUiModel = this.data;
            com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = this.creditProductIdentifier;
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> list = this.eligibleFundingInstruments;
            java.lang.String str = this.creditAccountId;
            java.math.BigDecimal bigDecimal = this.maxAllowableRepaymentAmount;
            java.lang.String str2 = this.currencyCode;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption = this.originalSelectedOption;
            java.lang.String str3 = this.originalCustomAmount;
            java.util.Set<java.lang.String> set = this.originalFundingInstrumentIds;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Ready(data=");
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
            sb.append(", originalSelectedOption=");
            sb.append(paymentOption);
            sb.append(", originalCustomAmount=");
            sb.append(str3);
            sb.append(", originalFundingInstrumentIds=");
            sb.append(set);
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
            int hashCode6 = str2 == null ? 0 : str2.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption = this.originalSelectedOption;
            return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (paymentOption != null ? paymentOption.hashCode() : 0)) * 31) + this.originalCustomAmount.hashCode()) * 31) + this.originalFundingInstrumentIds.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.Ready)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.Ready ready = (com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.Ready) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.data, ready.data) && this.creditProductIdentifier == ready.creditProductIdentifier && kotlin.jvm.internal.Intrinsics.areEqual(this.eligibleFundingInstruments, ready.eligibleFundingInstruments) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, ready.creditAccountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.maxAllowableRepaymentAmount, ready.maxAllowableRepaymentAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, ready.currencyCode) && this.originalSelectedOption == ready.originalSelectedOption && kotlin.jvm.internal.Intrinsics.areEqual(this.originalCustomAmount, ready.originalCustomAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.originalFundingInstrumentIds, ready.originalFundingInstrumentIds);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.Ready copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.AutopayScreenUiModel data, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> eligibleFundingInstruments, java.lang.String creditAccountId, java.math.BigDecimal maxAllowableRepaymentAmount, java.lang.String currencyCode, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption originalSelectedOption, java.lang.String originalCustomAmount, java.util.Set<java.lang.String> originalFundingInstrumentIds) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eligibleFundingInstruments, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(originalCustomAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(originalFundingInstrumentIds, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.Ready(data, creditProductIdentifier, eligibleFundingInstruments, creditAccountId, maxAllowableRepaymentAmount, currencyCode, originalSelectedOption, originalCustomAmount, originalFundingInstrumentIds);
        }

        public final java.util.Set<java.lang.String> component9() {
            return this.originalFundingInstrumentIds;
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.String getOriginalCustomAmount() {
            return this.originalCustomAmount;
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption getOriginalSelectedOption() {
            return this.originalSelectedOption;
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
    }

    @kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B{\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0010\u0010#\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b(\u0010!J\u0018\u0010)\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b)\u0010\u001dJ\u0096\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020\u000f2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00101\u001a\u000200HÖ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b3\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b5\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b7\u0010\u001bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b9\u0010\u001dR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010:\u001a\u0004\b;\u0010\u001fR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010<\u001a\u0004\b=\u0010!R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010:\u001a\u0004\b>\u0010\u001fR\u001a\u0010\u0010\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010?\u001a\u0004\b@\u0010$R\u001a\u0010\u0011\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010?\u001a\u0004\b\u0011\u0010$R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010A\u001a\u0004\bB\u0010'R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010<\u001a\u0004\bC\u0010!R\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u00108\u001a\u0004\bD\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayState$ProcessingAutopayPreferenceUpdate;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/uimodel/AutopayScreenUiModel;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "creditProductIdentifier", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/EligiblePaymentInstrument;", "fundingInstruments", "", "creditAccountId", "Ljava/math/BigDecimal;", "maxAllowableRepaymentAmount", "currencyCode", "", "enrolled", "isNewEnrollment", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentOption;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.SELECTED_OPTION, "customAmount", "selectedFundingInstruments", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/uimodel/AutopayScreenUiModel;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Ljava/util/List;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;ZZLcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentOption;Ljava/math/BigDecimal;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/uimodel/AutopayScreenUiModel;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "component3", "()Ljava/util/List;", "component4", "()Ljava/lang/String;", "component5", "()Ljava/math/BigDecimal;", "component6", "component7", "()Z", "component8", "component9", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentOption;", "component10", "component11", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/uimodel/AutopayScreenUiModel;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Ljava/util/List;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;ZZLcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentOption;Ljava/math/BigDecimal;Ljava/util/List;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayState$ProcessingAutopayPreferenceUpdate;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/uimodel/AutopayScreenUiModel;", "getData", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "getCreditProductIdentifier", "Ljava/util/List;", "getFundingInstruments", "Ljava/lang/String;", "getCreditAccountId", "Ljava/math/BigDecimal;", "getMaxAllowableRepaymentAmount", "getCurrencyCode", "Z", "getEnrolled", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentOption;", "getSelectedOption", "getCustomAmount", "getSelectedFundingInstruments"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ProcessingAutopayPreferenceUpdate extends com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 8;
        private final java.lang.String creditAccountId;
        private final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier;
        private final java.lang.String currencyCode;
        private final java.math.BigDecimal customAmount;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.AutopayScreenUiModel data;
        private final boolean enrolled;
        private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> fundingInstruments;
        private final boolean isNewEnrollment;
        private final java.math.BigDecimal maxAllowableRepaymentAmount;
        private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> selectedFundingInstruments;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption selectedOption;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ProcessingAutopayPreferenceUpdate(com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.AutopayScreenUiModel autopayScreenUiModel, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> list, java.lang.String str, java.math.BigDecimal bigDecimal, java.lang.String str2, boolean z, boolean z2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption, java.math.BigDecimal bigDecimal2, java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> list2) {
            super("ProcessingAutopayPreferenceUpdate", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autopayScreenUiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.data = autopayScreenUiModel;
            this.creditProductIdentifier = creditProductIdentifier;
            this.fundingInstruments = list;
            this.creditAccountId = str;
            this.maxAllowableRepaymentAmount = bigDecimal;
            this.currencyCode = str2;
            this.enrolled = z;
            this.isNewEnrollment = z2;
            this.selectedOption = paymentOption;
            this.customAmount = bigDecimal2;
            this.selectedFundingInstruments = list2;
        }

        public /* synthetic */ ProcessingAutopayPreferenceUpdate(com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.AutopayScreenUiModel autopayScreenUiModel, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.util.List list, java.lang.String str, java.math.BigDecimal bigDecimal, java.lang.String str2, boolean z, boolean z2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption, java.math.BigDecimal bigDecimal2, java.util.List list2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(autopayScreenUiModel, creditProductIdentifier, list, str, bigDecimal, str2, z, (i & 128) != 0 ? false : z2, paymentOption, bigDecimal2, (i & 1024) != 0 ? null : list2);
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

        public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> getFundingInstruments() {
            return this.fundingInstruments;
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

        public final boolean getEnrolled() {
            return this.enrolled;
        }

        public final boolean isNewEnrollment() {
            return this.isNewEnrollment;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption getSelectedOption() {
            return this.selectedOption;
        }

        public final java.math.BigDecimal getCustomAmount() {
            return this.customAmount;
        }

        public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> getSelectedFundingInstruments() {
            return this.selectedFundingInstruments;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.AutopayScreenUiModel autopayScreenUiModel = this.data;
            com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = this.creditProductIdentifier;
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> list = this.fundingInstruments;
            java.lang.String str = this.creditAccountId;
            java.math.BigDecimal bigDecimal = this.maxAllowableRepaymentAmount;
            java.lang.String str2 = this.currencyCode;
            boolean z = this.enrolled;
            boolean z2 = this.isNewEnrollment;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption = this.selectedOption;
            java.math.BigDecimal bigDecimal2 = this.customAmount;
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> list2 = this.selectedFundingInstruments;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ProcessingAutopayPreferenceUpdate(data=");
            sb.append(autopayScreenUiModel);
            sb.append(", creditProductIdentifier=");
            sb.append(creditProductIdentifier);
            sb.append(", fundingInstruments=");
            sb.append(list);
            sb.append(", creditAccountId=");
            sb.append(str);
            sb.append(", maxAllowableRepaymentAmount=");
            sb.append(bigDecimal);
            sb.append(", currencyCode=");
            sb.append(str2);
            sb.append(", enrolled=");
            sb.append(z);
            sb.append(", isNewEnrollment=");
            sb.append(z2);
            sb.append(", selectedOption=");
            sb.append(paymentOption);
            sb.append(", customAmount=");
            sb.append(bigDecimal2);
            sb.append(", selectedFundingInstruments=");
            sb.append(list2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.data.hashCode();
            int hashCode2 = this.creditProductIdentifier.hashCode();
            int hashCode3 = this.fundingInstruments.hashCode();
            java.lang.String str = this.creditAccountId;
            int hashCode4 = str == null ? 0 : str.hashCode();
            java.math.BigDecimal bigDecimal = this.maxAllowableRepaymentAmount;
            int hashCode5 = bigDecimal == null ? 0 : bigDecimal.hashCode();
            java.lang.String str2 = this.currencyCode;
            int hashCode6 = str2 == null ? 0 : str2.hashCode();
            int hashCode7 = java.lang.Boolean.hashCode(this.enrolled);
            int hashCode8 = java.lang.Boolean.hashCode(this.isNewEnrollment);
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption = this.selectedOption;
            int hashCode9 = paymentOption == null ? 0 : paymentOption.hashCode();
            java.math.BigDecimal bigDecimal2 = this.customAmount;
            int hashCode10 = bigDecimal2 == null ? 0 : bigDecimal2.hashCode();
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> list = this.selectedFundingInstruments;
            return (((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + (list != null ? list.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.ProcessingAutopayPreferenceUpdate)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.ProcessingAutopayPreferenceUpdate processingAutopayPreferenceUpdate = (com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.ProcessingAutopayPreferenceUpdate) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.data, processingAutopayPreferenceUpdate.data) && this.creditProductIdentifier == processingAutopayPreferenceUpdate.creditProductIdentifier && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingInstruments, processingAutopayPreferenceUpdate.fundingInstruments) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, processingAutopayPreferenceUpdate.creditAccountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.maxAllowableRepaymentAmount, processingAutopayPreferenceUpdate.maxAllowableRepaymentAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, processingAutopayPreferenceUpdate.currencyCode) && this.enrolled == processingAutopayPreferenceUpdate.enrolled && this.isNewEnrollment == processingAutopayPreferenceUpdate.isNewEnrollment && this.selectedOption == processingAutopayPreferenceUpdate.selectedOption && kotlin.jvm.internal.Intrinsics.areEqual(this.customAmount, processingAutopayPreferenceUpdate.customAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedFundingInstruments, processingAutopayPreferenceUpdate.selectedFundingInstruments);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.ProcessingAutopayPreferenceUpdate copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.AutopayScreenUiModel data, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> fundingInstruments, java.lang.String creditAccountId, java.math.BigDecimal maxAllowableRepaymentAmount, java.lang.String currencyCode, boolean enrolled, boolean isNewEnrollment, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption selectedOption, java.math.BigDecimal customAmount, java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> selectedFundingInstruments) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstruments, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.ProcessingAutopayPreferenceUpdate(data, creditProductIdentifier, fundingInstruments, creditAccountId, maxAllowableRepaymentAmount, currencyCode, enrolled, isNewEnrollment, selectedOption, customAmount, selectedFundingInstruments);
        }

        /* renamed from: component9, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption getSelectedOption() {
            return this.selectedOption;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getIsNewEnrollment() {
            return this.isNewEnrollment;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getEnrolled() {
            return this.enrolled;
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
            return this.fundingInstruments;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCreditProductIdentifier() {
            return this.creditProductIdentifier;
        }

        public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> component11() {
            return this.selectedFundingInstruments;
        }

        /* renamed from: component10, reason: from getter */
        public final java.math.BigDecimal getCustomAmount() {
            return this.customAmount;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.AutopayScreenUiModel getData() {
            return this.data;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayState$UpdateCompleted;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdateCompleted extends com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.UpdateCompleted INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.UpdateCompleted();

        public final int hashCode() {
            return 1317859925;
        }

        private UpdateCompleted() {
            super("UpdateCompleted", null);
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final java.lang.String toString() {
            return "UpdateCompleted";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.UpdateCompleted)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayState$Error;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayState$ErrorContext;", "context", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayState$ErrorContext;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayState$ErrorContext;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayState$ErrorContext;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayState$ErrorContext;", "getContext"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.ErrorContext context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.ErrorContext errorContext) {
            super("Error", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorContext, "");
            this.context = errorContext;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.ErrorContext getContext() {
            return this.context;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.ErrorContext errorContext = this.context;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(context=");
            sb.append(errorContext);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.context.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.context, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.Error) other).context);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.Error copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.ErrorContext context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.Error(context);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.ErrorContext getContext() {
            return this.context;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.Error copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.Error error, com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.ErrorContext errorContext, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                errorContext = error.context;
            }
            return error.copy(errorContext);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayState$ErrorContext;", "", "<init>", "()V", "FetchingData", "ConfirmingAutopay", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayState$ErrorContext$ConfirmingAutopay;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayState$ErrorContext$FetchingData;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class ErrorContext {
        public static final int $stable = 0;

        @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayState$ErrorContext$FetchingData;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayState$ErrorContext;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "creditProductIdentifier", "", "creditAccountId", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayState$ErrorContext$FetchingData;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "getCreditProductIdentifier", "Ljava/lang/String;", "getCreditAccountId"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class FetchingData extends com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.ErrorContext {
            public static final int $stable = 0;
            private final java.lang.String creditAccountId;
            private final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FetchingData(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
                this.creditProductIdentifier = creditProductIdentifier;
                this.creditAccountId = str;
            }

            public /* synthetic */ FetchingData(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(creditProductIdentifier, (i & 2) != 0 ? null : str);
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
                java.lang.StringBuilder sb = new java.lang.StringBuilder("FetchingData(creditProductIdentifier=");
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
                if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.ErrorContext.FetchingData)) {
                    return false;
                }
                com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.ErrorContext.FetchingData fetchingData = (com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.ErrorContext.FetchingData) other;
                return this.creditProductIdentifier == fetchingData.creditProductIdentifier && kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, fetchingData.creditAccountId);
            }

            public final com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.ErrorContext.FetchingData copy(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.lang.String creditAccountId) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
                return new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.ErrorContext.FetchingData(creditProductIdentifier, creditAccountId);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getCreditAccountId() {
                return this.creditAccountId;
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCreditProductIdentifier() {
                return this.creditProductIdentifier;
            }

            public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.ErrorContext.FetchingData copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.ErrorContext.FetchingData fetchingData, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    creditProductIdentifier = fetchingData.creditProductIdentifier;
                }
                if ((i & 2) != 0) {
                    str = fetchingData.creditAccountId;
                }
                return fetchingData.copy(creditProductIdentifier, str);
            }
        }

        private ErrorContext() {
        }

        @kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b$\u0010#J\u0012\u0010%\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b'\u0010 J\u0018\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b(\u0010\u001cJ\u0096\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020\u000e2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020/HÖ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b2\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u0010\u001aR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b8\u0010\u001cR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b:\u0010\u001eR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\b<\u0010 R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00109\u001a\u0004\b=\u0010\u001eR\u001a\u0010\u000f\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010>\u001a\u0004\b?\u0010#R\u001a\u0010\u0010\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010>\u001a\u0004\b\u0010\u0010#R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010@\u001a\u0004\bA\u0010&R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010;\u001a\u0004\bB\u0010 R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u00107\u001a\u0004\bC\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayState$ErrorContext$ConfirmingAutopay;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayState$ErrorContext;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/uimodel/AutopayScreenUiModel;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "creditProductIdentifier", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/EligiblePaymentInstrument;", "fundingInstruments", "", "creditAccountId", "Ljava/math/BigDecimal;", "maxAllowableRepaymentAmount", "currencyCode", "", "enrolled", "isNewEnrollment", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentOption;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.SELECTED_OPTION, "customAmount", "selectedFundingInstruments", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/uimodel/AutopayScreenUiModel;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Ljava/util/List;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;ZZLcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentOption;Ljava/math/BigDecimal;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/uimodel/AutopayScreenUiModel;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "component3", "()Ljava/util/List;", "component4", "()Ljava/lang/String;", "component5", "()Ljava/math/BigDecimal;", "component6", "component7", "()Z", "component8", "component9", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentOption;", "component10", "component11", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/uimodel/AutopayScreenUiModel;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Ljava/util/List;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;ZZLcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentOption;Ljava/math/BigDecimal;Ljava/util/List;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/viewmodel/AutopayState$ErrorContext$ConfirmingAutopay;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/autopay/uimodel/AutopayScreenUiModel;", "getData", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "getCreditProductIdentifier", "Ljava/util/List;", "getFundingInstruments", "Ljava/lang/String;", "getCreditAccountId", "Ljava/math/BigDecimal;", "getMaxAllowableRepaymentAmount", "getCurrencyCode", "Z", "getEnrolled", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentOption;", "getSelectedOption", "getCustomAmount", "getSelectedFundingInstruments"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ConfirmingAutopay extends com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.ErrorContext {
            public static final int $stable = 8;
            private final java.lang.String creditAccountId;
            private final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier;
            private final java.lang.String currencyCode;
            private final java.math.BigDecimal customAmount;
            private final com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.AutopayScreenUiModel data;
            private final boolean enrolled;
            private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> fundingInstruments;
            private final boolean isNewEnrollment;
            private final java.math.BigDecimal maxAllowableRepaymentAmount;
            private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> selectedFundingInstruments;
            private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption selectedOption;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public ConfirmingAutopay(com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.AutopayScreenUiModel autopayScreenUiModel, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> list, java.lang.String str, java.math.BigDecimal bigDecimal, java.lang.String str2, boolean z, boolean z2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption, java.math.BigDecimal bigDecimal2, java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> list2) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autopayScreenUiModel, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
                this.data = autopayScreenUiModel;
                this.creditProductIdentifier = creditProductIdentifier;
                this.fundingInstruments = list;
                this.creditAccountId = str;
                this.maxAllowableRepaymentAmount = bigDecimal;
                this.currencyCode = str2;
                this.enrolled = z;
                this.isNewEnrollment = z2;
                this.selectedOption = paymentOption;
                this.customAmount = bigDecimal2;
                this.selectedFundingInstruments = list2;
            }

            public final com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.AutopayScreenUiModel getData() {
                return this.data;
            }

            public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCreditProductIdentifier() {
                return this.creditProductIdentifier;
            }

            public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> getFundingInstruments() {
                return this.fundingInstruments;
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

            public final boolean getEnrolled() {
                return this.enrolled;
            }

            public final boolean isNewEnrollment() {
                return this.isNewEnrollment;
            }

            public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption getSelectedOption() {
                return this.selectedOption;
            }

            public final java.math.BigDecimal getCustomAmount() {
                return this.customAmount;
            }

            public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> getSelectedFundingInstruments() {
                return this.selectedFundingInstruments;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.AutopayScreenUiModel autopayScreenUiModel = this.data;
                com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = this.creditProductIdentifier;
                java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> list = this.fundingInstruments;
                java.lang.String str = this.creditAccountId;
                java.math.BigDecimal bigDecimal = this.maxAllowableRepaymentAmount;
                java.lang.String str2 = this.currencyCode;
                boolean z = this.enrolled;
                boolean z2 = this.isNewEnrollment;
                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption = this.selectedOption;
                java.math.BigDecimal bigDecimal2 = this.customAmount;
                java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> list2 = this.selectedFundingInstruments;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("ConfirmingAutopay(data=");
                sb.append(autopayScreenUiModel);
                sb.append(", creditProductIdentifier=");
                sb.append(creditProductIdentifier);
                sb.append(", fundingInstruments=");
                sb.append(list);
                sb.append(", creditAccountId=");
                sb.append(str);
                sb.append(", maxAllowableRepaymentAmount=");
                sb.append(bigDecimal);
                sb.append(", currencyCode=");
                sb.append(str2);
                sb.append(", enrolled=");
                sb.append(z);
                sb.append(", isNewEnrollment=");
                sb.append(z2);
                sb.append(", selectedOption=");
                sb.append(paymentOption);
                sb.append(", customAmount=");
                sb.append(bigDecimal2);
                sb.append(", selectedFundingInstruments=");
                sb.append(list2);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = this.data.hashCode();
                int hashCode2 = this.creditProductIdentifier.hashCode();
                int hashCode3 = this.fundingInstruments.hashCode();
                java.lang.String str = this.creditAccountId;
                int hashCode4 = str == null ? 0 : str.hashCode();
                java.math.BigDecimal bigDecimal = this.maxAllowableRepaymentAmount;
                int hashCode5 = bigDecimal == null ? 0 : bigDecimal.hashCode();
                java.lang.String str2 = this.currencyCode;
                int hashCode6 = str2 == null ? 0 : str2.hashCode();
                int hashCode7 = java.lang.Boolean.hashCode(this.enrolled);
                int hashCode8 = java.lang.Boolean.hashCode(this.isNewEnrollment);
                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption = this.selectedOption;
                int hashCode9 = paymentOption == null ? 0 : paymentOption.hashCode();
                java.math.BigDecimal bigDecimal2 = this.customAmount;
                int hashCode10 = bigDecimal2 == null ? 0 : bigDecimal2.hashCode();
                java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> list = this.selectedFundingInstruments;
                return (((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + (list != null ? list.hashCode() : 0);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.ErrorContext.ConfirmingAutopay)) {
                    return false;
                }
                com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.ErrorContext.ConfirmingAutopay confirmingAutopay = (com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.ErrorContext.ConfirmingAutopay) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.data, confirmingAutopay.data) && this.creditProductIdentifier == confirmingAutopay.creditProductIdentifier && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingInstruments, confirmingAutopay.fundingInstruments) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, confirmingAutopay.creditAccountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.maxAllowableRepaymentAmount, confirmingAutopay.maxAllowableRepaymentAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, confirmingAutopay.currencyCode) && this.enrolled == confirmingAutopay.enrolled && this.isNewEnrollment == confirmingAutopay.isNewEnrollment && this.selectedOption == confirmingAutopay.selectedOption && kotlin.jvm.internal.Intrinsics.areEqual(this.customAmount, confirmingAutopay.customAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedFundingInstruments, confirmingAutopay.selectedFundingInstruments);
            }

            public final com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.ErrorContext.ConfirmingAutopay copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.AutopayScreenUiModel data, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> fundingInstruments, java.lang.String creditAccountId, java.math.BigDecimal maxAllowableRepaymentAmount, java.lang.String currencyCode, boolean enrolled, boolean isNewEnrollment, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption selectedOption, java.math.BigDecimal customAmount, java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> selectedFundingInstruments) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstruments, "");
                return new com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayState.ErrorContext.ConfirmingAutopay(data, creditProductIdentifier, fundingInstruments, creditAccountId, maxAllowableRepaymentAmount, currencyCode, enrolled, isNewEnrollment, selectedOption, customAmount, selectedFundingInstruments);
            }

            /* renamed from: component9, reason: from getter */
            public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption getSelectedOption() {
                return this.selectedOption;
            }

            /* renamed from: component8, reason: from getter */
            public final boolean getIsNewEnrollment() {
                return this.isNewEnrollment;
            }

            /* renamed from: component7, reason: from getter */
            public final boolean getEnrolled() {
                return this.enrolled;
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
                return this.fundingInstruments;
            }

            /* renamed from: component2, reason: from getter */
            public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCreditProductIdentifier() {
                return this.creditProductIdentifier;
            }

            public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> component11() {
                return this.selectedFundingInstruments;
            }

            /* renamed from: component10, reason: from getter */
            public final java.math.BigDecimal getCustomAmount() {
                return this.customAmount;
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.uimodel.AutopayScreenUiModel getData() {
                return this.data;
            }
        }

        public /* synthetic */ ErrorContext(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ AutopayState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
