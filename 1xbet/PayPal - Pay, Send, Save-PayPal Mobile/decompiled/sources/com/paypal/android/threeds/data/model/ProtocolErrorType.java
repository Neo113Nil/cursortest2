package com.paypal.android.threeds.data.model;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\f !\"#$%&'()*+B5\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\"\u0010\u0014\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\"\u0010\u0017\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R$\u0010\u001a\u001a\u0004\u0018\u00010\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f\u0082\u0001\f,-./01234567"}, d2 = {"Lcom/paypal/android/threeds/data/model/ProtocolErrorType;", "", "", "p0", "p1", "p2", "p3", "Lcom/paypal/android/threeds/data/model/ErrorMessage;", "p4", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/android/threeds/data/model/ErrorMessage;)V", "errorCode", "Ljava/lang/String;", "getErrorCode", "()Ljava/lang/String;", "setErrorCode", "(Ljava/lang/String;)V", "errorComponent", "getErrorComponent", "setErrorComponent", "errorDescription", "getErrorDescription", "setErrorDescription", "errorDetail", "getErrorDetail", "setErrorDetail", "errorMessage", "Lcom/paypal/android/threeds/data/model/ErrorMessage;", "getErrorMessage", "()Lcom/paypal/android/threeds/data/model/ErrorMessage;", "setErrorMessage", "(Lcom/paypal/android/threeds/data/model/ErrorMessage;)V", "InvalidMessageTypeProtocol", "MessageVersionNotSupported", "DataElementMissing", "DataElementInvalid", "CounterMismatch", "ValidationFailures", "UnrecognizedMessageExtension", "UnrecognizedTransactionId", "DecryptionFailure", "ACSError", "TransactionTimeout", "ConnectionFailure", "Lcom/paypal/android/threeds/data/model/ProtocolErrorType$ACSError;", "Lcom/paypal/android/threeds/data/model/ProtocolErrorType$ConnectionFailure;", "Lcom/paypal/android/threeds/data/model/ProtocolErrorType$CounterMismatch;", "Lcom/paypal/android/threeds/data/model/ProtocolErrorType$DataElementInvalid;", "Lcom/paypal/android/threeds/data/model/ProtocolErrorType$DataElementMissing;", "Lcom/paypal/android/threeds/data/model/ProtocolErrorType$DecryptionFailure;", "Lcom/paypal/android/threeds/data/model/ProtocolErrorType$InvalidMessageTypeProtocol;", "Lcom/paypal/android/threeds/data/model/ProtocolErrorType$MessageVersionNotSupported;", "Lcom/paypal/android/threeds/data/model/ProtocolErrorType$TransactionTimeout;", "Lcom/paypal/android/threeds/data/model/ProtocolErrorType$UnrecognizedMessageExtension;", "Lcom/paypal/android/threeds/data/model/ProtocolErrorType$UnrecognizedTransactionId;", "Lcom/paypal/android/threeds/data/model/ProtocolErrorType$ValidationFailures;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class ProtocolErrorType {
    public static final int $stable = 8;
    private java.lang.String errorCode;
    private java.lang.String errorComponent;
    private java.lang.String errorDescription;
    private java.lang.String errorDetail;
    private com.paypal.android.threeds.data.model.ErrorMessage errorMessage;

    private ProtocolErrorType(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.android.threeds.data.model.ErrorMessage errorMessage) {
        this.errorCode = str;
        this.errorComponent = str2;
        this.errorDescription = str3;
        this.errorDetail = str4;
        this.errorMessage = errorMessage;
    }

    public /* synthetic */ ProtocolErrorType(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.android.threeds.data.model.ErrorMessage errorMessage, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : errorMessage, null);
    }

    public final java.lang.String getErrorCode() {
        return this.errorCode;
    }

    public final void setErrorCode(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.errorCode = str;
    }

    public final java.lang.String getErrorComponent() {
        return this.errorComponent;
    }

    public final void setErrorComponent(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.errorComponent = str;
    }

    public final java.lang.String getErrorDescription() {
        return this.errorDescription;
    }

    public final void setErrorDescription(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.errorDescription = str;
    }

    public final java.lang.String getErrorDetail() {
        return this.errorDetail;
    }

    public final void setErrorDetail(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.errorDetail = str;
    }

    public final com.paypal.android.threeds.data.model.ErrorMessage getErrorMessage() {
        return this.errorMessage;
    }

    public final void setErrorMessage(com.paypal.android.threeds.data.model.ErrorMessage errorMessage) {
        this.errorMessage = errorMessage;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/android/threeds/data/model/ProtocolErrorType$InvalidMessageTypeProtocol;", "Lcom/paypal/android/threeds/data/model/ProtocolErrorType;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class InvalidMessageTypeProtocol extends com.paypal.android.threeds.data.model.ProtocolErrorType {
        public static final com.paypal.android.threeds.data.model.ProtocolErrorType.InvalidMessageTypeProtocol INSTANCE = new com.paypal.android.threeds.data.model.ProtocolErrorType.InvalidMessageTypeProtocol();
        public static final int $stable = 8;

        private InvalidMessageTypeProtocol() {
            super("101", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "Message not recognised", "Invalid Message Type", null, 16, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/android/threeds/data/model/ProtocolErrorType$MessageVersionNotSupported;", "Lcom/paypal/android/threeds/data/model/ProtocolErrorType;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class MessageVersionNotSupported extends com.paypal.android.threeds.data.model.ProtocolErrorType {
        public static final com.paypal.android.threeds.data.model.ProtocolErrorType.MessageVersionNotSupported INSTANCE = new com.paypal.android.threeds.data.model.ProtocolErrorType.MessageVersionNotSupported();
        public static final int $stable = 8;

        private MessageVersionNotSupported() {
            super("102", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "Message Version Number Not Supported", "Message Version Number received is not valid for the receiving component", null, 16, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/android/threeds/data/model/ProtocolErrorType$DataElementMissing;", "Lcom/paypal/android/threeds/data/model/ProtocolErrorType;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DataElementMissing extends com.paypal.android.threeds.data.model.ProtocolErrorType {
        public static final com.paypal.android.threeds.data.model.ProtocolErrorType.DataElementMissing INSTANCE = new com.paypal.android.threeds.data.model.ProtocolErrorType.DataElementMissing();
        public static final int $stable = 8;

        private DataElementMissing() {
            super("201", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "Required Data Element Missing", "Required Data Element Missing", null, 16, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/android/threeds/data/model/ProtocolErrorType$DataElementInvalid;", "Lcom/paypal/android/threeds/data/model/ProtocolErrorType;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DataElementInvalid extends com.paypal.android.threeds.data.model.ProtocolErrorType {
        public static final com.paypal.android.threeds.data.model.ProtocolErrorType.DataElementInvalid INSTANCE = new com.paypal.android.threeds.data.model.ProtocolErrorType.DataElementInvalid();
        public static final int $stable = 8;

        private DataElementInvalid() {
            super("203", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "Data Elements is Invalid", "Data element not in the required format or value is invalid", null, 16, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/android/threeds/data/model/ProtocolErrorType$CounterMismatch;", "Lcom/paypal/android/threeds/data/model/ProtocolErrorType;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CounterMismatch extends com.paypal.android.threeds.data.model.ProtocolErrorType {
        public static final com.paypal.android.threeds.data.model.ProtocolErrorType.CounterMismatch INSTANCE = new com.paypal.android.threeds.data.model.ProtocolErrorType.CounterMismatch();
        public static final int $stable = 8;

        private CounterMismatch() {
            super("302", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "Data Elements is Invalid", "ACS counter mismatch", null, 16, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/android/threeds/data/model/ProtocolErrorType$ValidationFailures;", "Lcom/paypal/android/threeds/data/model/ProtocolErrorType;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ValidationFailures extends com.paypal.android.threeds.data.model.ProtocolErrorType {
        public static final com.paypal.android.threeds.data.model.ProtocolErrorType.ValidationFailures INSTANCE = new com.paypal.android.threeds.data.model.ProtocolErrorType.ValidationFailures();
        public static final int $stable = 8;

        private ValidationFailures() {
            super("203", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "Data Elements is Invalid", "", null, 16, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/android/threeds/data/model/ProtocolErrorType$UnrecognizedMessageExtension;", "Lcom/paypal/android/threeds/data/model/ProtocolErrorType;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class UnrecognizedMessageExtension extends com.paypal.android.threeds.data.model.ProtocolErrorType {
        public static final com.paypal.android.threeds.data.model.ProtocolErrorType.UnrecognizedMessageExtension INSTANCE = new com.paypal.android.threeds.data.model.ProtocolErrorType.UnrecognizedMessageExtension();
        public static final int $stable = 8;

        private UnrecognizedMessageExtension() {
            super("202", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "Critical message extension not recognised", "", null, 16, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/android/threeds/data/model/ProtocolErrorType$UnrecognizedTransactionId;", "Lcom/paypal/android/threeds/data/model/ProtocolErrorType;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class UnrecognizedTransactionId extends com.paypal.android.threeds.data.model.ProtocolErrorType {
        public static final com.paypal.android.threeds.data.model.ProtocolErrorType.UnrecognizedTransactionId INSTANCE = new com.paypal.android.threeds.data.model.ProtocolErrorType.UnrecognizedTransactionId();
        public static final int $stable = 8;

        private UnrecognizedTransactionId() {
            super("301", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "Unrecognized transaction ID", "", null, 16, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/android/threeds/data/model/ProtocolErrorType$DecryptionFailure;", "Lcom/paypal/android/threeds/data/model/ProtocolErrorType;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DecryptionFailure extends com.paypal.android.threeds.data.model.ProtocolErrorType {
        public static final com.paypal.android.threeds.data.model.ProtocolErrorType.DecryptionFailure INSTANCE = new com.paypal.android.threeds.data.model.ProtocolErrorType.DecryptionFailure();
        public static final int $stable = 8;

        private DecryptionFailure() {
            super("302", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "Data Decryption Failure", "Data could not be decrypted by the receiving system due to technical or other reason", null, 16, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/android/threeds/data/model/ProtocolErrorType$ACSError;", "Lcom/paypal/android/threeds/data/model/ProtocolErrorType;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ACSError extends com.paypal.android.threeds.data.model.ProtocolErrorType {
        public static final com.paypal.android.threeds.data.model.ProtocolErrorType.ACSError INSTANCE = new com.paypal.android.threeds.data.model.ProtocolErrorType.ACSError();
        public static final int $stable = 8;

        private ACSError() {
            super("", "", "", "", null, 16, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/android/threeds/data/model/ProtocolErrorType$TransactionTimeout;", "Lcom/paypal/android/threeds/data/model/ProtocolErrorType;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class TransactionTimeout extends com.paypal.android.threeds.data.model.ProtocolErrorType {
        public static final com.paypal.android.threeds.data.model.ProtocolErrorType.TransactionTimeout INSTANCE = new com.paypal.android.threeds.data.model.ProtocolErrorType.TransactionTimeout();
        public static final int $stable = 8;

        private TransactionTimeout() {
            super("402", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "Transaction Timed Out", "Transaction Timed Out", null, 16, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/android/threeds/data/model/ProtocolErrorType$ConnectionFailure;", "Lcom/paypal/android/threeds/data/model/ProtocolErrorType;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ConnectionFailure extends com.paypal.android.threeds.data.model.ProtocolErrorType {
        public static final com.paypal.android.threeds.data.model.ProtocolErrorType.ConnectionFailure INSTANCE = new com.paypal.android.threeds.data.model.ProtocolErrorType.ConnectionFailure();
        public static final int $stable = 8;

        private ConnectionFailure() {
            super("405", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "Connection Failure", "Connection Failure", null, 16, null);
        }
    }

    public /* synthetic */ ProtocolErrorType(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.android.threeds.data.model.ErrorMessage errorMessage, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, errorMessage);
    }
}
