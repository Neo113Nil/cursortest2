package com.zettle.sdk.feature.taptopay.core.transaction;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0003\u001a\u001b\u001cJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\bJ7\u0010\u0014\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction;", "", "Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$TransactionListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "addListener", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$TransactionListener;)V", "cancelTransaction", "()V", "removeListener", "reset", "Landroid/app/Activity;", "activityContext", "", "amount", "gratuity", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReference;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_REFERENCE, "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/PaymentProperties;", "paymentProperties", "startTransaction", "(Landroid/app/Activity;JJLcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReference;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/PaymentProperties;)V", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/Signature;", "signature", "uploadSignature", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/models/Signature;)V", "ResultPayload", "State", "TransactionListener"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface Transaction {

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\bR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\bR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\bR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\bR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\bR\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0004R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\bR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\bR\u0016\u0010 \u001a\u0004\u0018\u00010\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\bR\u0016\u0010$\u001a\u0004\u0018\u00010!8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020!8'X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0016\u0010)\u001a\u0004\u0018\u00010\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\bR\u0016\u0010-\u001a\u0004\u0018\u00010*8'X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0016\u0010/\u001a\u0004\u0018\u00010\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\bR\u0016\u00101\u001a\u0004\u0018\u00010\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\bR\u0016\u00103\u001a\u0004\u0018\u00010\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\bR\u0016\u00105\u001a\u0004\u0018\u00010\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\bR\u0016\u00107\u001a\u0004\u0018\u00010\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\bR\u0016\u00109\u001a\u0004\u0018\u00010\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u0010\bR\u0016\u0010;\u001a\u0004\u0018\u00010\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b:\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$ResultPayload;", "Landroid/os/Parcelable;", "", "getAmount", "()J", "amount", "", "getApplicationIdentifier", "()Ljava/lang/String;", "applicationIdentifier", "getApplicationName", com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_INFO_APPLICATION_NAME, "getAuthorizationCode", "authorizationCode", "getCardIssuingBank", "cardIssuingBank", "getCardPaymentEntryMode", com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_INFO_ENTRY_MODE, "getCardType", com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_INFO_CARD_TYPE, "getCardholderVerificationMethod", "cardholderVerificationMethod", "getGratuityAmount", "()Ljava/lang/Long;", com.zettle.sdk.commons.network.JsonKt.KEY_REFERENCES_GRATUTITY_AMOUNT, "getInstallmentAmount", "installmentAmount", "getMaskedPan", "maskedPan", "getMxCardType", "mxCardType", "getMxFiid", "mxFiid", "", "getMxPaymentMethodCode", "()Ljava/lang/Integer;", "mxPaymentMethodCode", "getNrOfInstallments", "()I", "nrOfInstallments", "getPanHash", "panHash", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReference;", "getReference", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReference;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_REFERENCE, "getReferenceNumber", com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_INFO_REFERENCE_NUMBER, "getSuggestionEmail", "suggestionEmail", "getSuggestionPhone", "suggestionPhone", "getSuggestionPhoneCountryCode", "suggestionPhoneCountryCode", "getTransactionId", "transactionId", "getTsi", "tsi", "getTvr", "tvr"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface ResultPayload extends android.os.Parcelable {
        long getAmount();

        java.lang.String getApplicationIdentifier();

        java.lang.String getApplicationName();

        java.lang.String getAuthorizationCode();

        java.lang.String getCardIssuingBank();

        java.lang.String getCardPaymentEntryMode();

        java.lang.String getCardType();

        java.lang.String getCardholderVerificationMethod();

        java.lang.Long getGratuityAmount();

        long getInstallmentAmount();

        java.lang.String getMaskedPan();

        java.lang.String getMxCardType();

        java.lang.String getMxFiid();

        java.lang.Integer getMxPaymentMethodCode();

        int getNrOfInstallments();

        java.lang.String getPanHash();

        com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference getReference();

        java.lang.String getReferenceNumber();

        java.lang.String getSuggestionEmail();

        java.lang.String getSuggestionPhone();

        java.lang.String getSuggestionPhoneCountryCode();

        java.lang.String getTransactionId();

        java.lang.String getTsi();

        java.lang.String getTvr();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$TransactionListener;", "", "Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$State;", "state", "", "onStateChanged", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$State;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface TransactionListener {
        void onStateChanged(com.zettle.sdk.feature.taptopay.core.transaction.Transaction.State state);
    }

    void addListener(com.zettle.sdk.feature.taptopay.core.transaction.Transaction.TransactionListener listener);

    void cancelTransaction();

    void removeListener();

    void reset();

    void startTransaction(android.app.Activity activityContext, long amount, long gratuity, com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference reference, com.zettle.sdk.feature.taptopay.core.transaction.models.PaymentProperties paymentProperties);

    void uploadSignature(com.zettle.sdk.feature.taptopay.core.transaction.models.Signature signature);

    @kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0010\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0010\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$State;", "", "<init>", "()V", "Approved", "Authorizing", "CardReadOk", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.COMPLETE, "Failed", "Initial", "Initializing", "PermissiveSignature", "PinCodeEntered", "PresentCard", "ReInitialising", "ReadingCard", "Recovering", "RequestSignature", "Retry", "UploadingSignature", "Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$State$Approved;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$State$Authorizing;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$State$CardReadOk;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$State$Completed;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$State$Failed;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$State$Initial;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$State$Initializing;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$State$PermissiveSignature;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$State$PinCodeEntered;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$State$PresentCard;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$State$ReInitialising;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$State$ReadingCard;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$State$Recovering;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$State$RequestSignature;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$State$Retry;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$State$UploadingSignature;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class State {

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$State$Initial;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$State;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Initial extends com.zettle.sdk.feature.taptopay.core.transaction.Transaction.State {
            public static final com.zettle.sdk.feature.taptopay.core.transaction.Transaction.State.Initial INSTANCE = new com.zettle.sdk.feature.taptopay.core.transaction.Transaction.State.Initial();

            private Initial() {
                super(null);
            }
        }

        private State() {
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$State$Initializing;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$State;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Initializing extends com.zettle.sdk.feature.taptopay.core.transaction.Transaction.State {
            public static final com.zettle.sdk.feature.taptopay.core.transaction.Transaction.State.Initializing INSTANCE = new com.zettle.sdk.feature.taptopay.core.transaction.Transaction.State.Initializing();

            private Initializing() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$State$ReInitialising;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$State;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class ReInitialising extends com.zettle.sdk.feature.taptopay.core.transaction.Transaction.State {
            public static final com.zettle.sdk.feature.taptopay.core.transaction.Transaction.State.ReInitialising INSTANCE = new com.zettle.sdk.feature.taptopay.core.transaction.Transaction.State.ReInitialising();

            private ReInitialising() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$State$PresentCard;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$State;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "info", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;)V", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "getInfo", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class PresentCard extends com.zettle.sdk.feature.taptopay.core.transaction.Transaction.State {
            private final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo info;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PresentCard(com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo transactionInfo) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionInfo, "");
                this.info = transactionInfo;
            }

            public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo getInfo() {
                return this.info;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$State$ReadingCard;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$State;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "info", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;)V", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "getInfo", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class ReadingCard extends com.zettle.sdk.feature.taptopay.core.transaction.Transaction.State {
            private final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo info;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ReadingCard(com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo transactionInfo) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionInfo, "");
                this.info = transactionInfo;
            }

            public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo getInfo() {
                return this.info;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$State$Retry;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$State;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "info", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;)V", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "getInfo", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Retry extends com.zettle.sdk.feature.taptopay.core.transaction.Transaction.State {
            private final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo info;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Retry(com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo transactionInfo) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionInfo, "");
                this.info = transactionInfo;
            }

            public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo getInfo() {
                return this.info;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$State$CardReadOk;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$State;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "info", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;)V", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "getInfo", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class CardReadOk extends com.zettle.sdk.feature.taptopay.core.transaction.Transaction.State {
            private final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo info;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CardReadOk(com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo transactionInfo) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionInfo, "");
                this.info = transactionInfo;
            }

            public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo getInfo() {
                return this.info;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$State$Authorizing;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$State;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Authorizing extends com.zettle.sdk.feature.taptopay.core.transaction.Transaction.State {
            public static final com.zettle.sdk.feature.taptopay.core.transaction.Transaction.State.Authorizing INSTANCE = new com.zettle.sdk.feature.taptopay.core.transaction.Transaction.State.Authorizing();

            private Authorizing() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$State$Recovering;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$State;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Recovering extends com.zettle.sdk.feature.taptopay.core.transaction.Transaction.State {
            public static final com.zettle.sdk.feature.taptopay.core.transaction.Transaction.State.Recovering INSTANCE = new com.zettle.sdk.feature.taptopay.core.transaction.Transaction.State.Recovering();

            private Recovering() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$State$RequestSignature;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$State;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "info", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/CardInfo;", "cardInfo", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/CardInfo;)V", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/CardInfo;", "getCardInfo", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/CardInfo;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "getInfo", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class RequestSignature extends com.zettle.sdk.feature.taptopay.core.transaction.Transaction.State {
            private final com.zettle.sdk.feature.taptopay.core.transaction.models.CardInfo cardInfo;
            private final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo info;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RequestSignature(com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo transactionInfo, com.zettle.sdk.feature.taptopay.core.transaction.models.CardInfo cardInfo) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionInfo, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardInfo, "");
                this.info = transactionInfo;
                this.cardInfo = cardInfo;
            }

            public final com.zettle.sdk.feature.taptopay.core.transaction.models.CardInfo getCardInfo() {
                return this.cardInfo;
            }

            public final com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo getInfo() {
                return this.info;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$State$PermissiveSignature;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$State;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class PermissiveSignature extends com.zettle.sdk.feature.taptopay.core.transaction.Transaction.State {
            public static final com.zettle.sdk.feature.taptopay.core.transaction.Transaction.State.PermissiveSignature INSTANCE = new com.zettle.sdk.feature.taptopay.core.transaction.Transaction.State.PermissiveSignature();

            private PermissiveSignature() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$State$UploadingSignature;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$State;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class UploadingSignature extends com.zettle.sdk.feature.taptopay.core.transaction.Transaction.State {
            public static final com.zettle.sdk.feature.taptopay.core.transaction.Transaction.State.UploadingSignature INSTANCE = new com.zettle.sdk.feature.taptopay.core.transaction.Transaction.State.UploadingSignature();

            private UploadingSignature() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$State$PinCodeEntered;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$State;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class PinCodeEntered extends com.zettle.sdk.feature.taptopay.core.transaction.Transaction.State {
            public static final com.zettle.sdk.feature.taptopay.core.transaction.Transaction.State.PinCodeEntered INSTANCE = new com.zettle.sdk.feature.taptopay.core.transaction.Transaction.State.PinCodeEntered();

            private PinCodeEntered() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$State$Failed;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$State;", "Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason;", "reason", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason;)V", "Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason;", "getReason", "()Lcom/zettle/sdk/feature/taptopay/core/TransactionFailureReason;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Failed extends com.zettle.sdk.feature.taptopay.core.transaction.Transaction.State {
            private final com.zettle.sdk.feature.taptopay.core.TransactionFailureReason reason;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Failed(com.zettle.sdk.feature.taptopay.core.TransactionFailureReason transactionFailureReason) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionFailureReason, "");
                this.reason = transactionFailureReason;
            }

            public final com.zettle.sdk.feature.taptopay.core.TransactionFailureReason getReason() {
                return this.reason;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$State$Approved;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$State;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$ResultPayload;", "tapToPayResult", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$ResultPayload;)V", "Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$ResultPayload;", "getTapToPayResult", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$ResultPayload;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Approved extends com.zettle.sdk.feature.taptopay.core.transaction.Transaction.State {
            private final com.zettle.sdk.feature.taptopay.core.transaction.Transaction.ResultPayload tapToPayResult;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Approved(com.zettle.sdk.feature.taptopay.core.transaction.Transaction.ResultPayload resultPayload) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resultPayload, "");
                this.tapToPayResult = resultPayload;
            }

            public final com.zettle.sdk.feature.taptopay.core.transaction.Transaction.ResultPayload getTapToPayResult() {
                return this.tapToPayResult;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$State$Completed;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$State;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Completed extends com.zettle.sdk.feature.taptopay.core.transaction.Transaction.State {
            public static final com.zettle.sdk.feature.taptopay.core.transaction.Transaction.State.Completed INSTANCE = new com.zettle.sdk.feature.taptopay.core.transaction.Transaction.State.Completed();

            private Completed() {
                super(null);
            }
        }

        public /* synthetic */ State(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
