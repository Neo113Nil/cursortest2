package com.zettle.sdk;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/zettle/sdk/OfflinePaymentForwardFailure;", "", "AuthRequired", "NetworkError", "NetworkTimeout", "PermissionDenied", "RejectedByBackend", "ServerError", "TooManyRequests", "Unknown", "Lcom/zettle/sdk/OfflinePaymentForwardFailure$AuthRequired;", "Lcom/zettle/sdk/OfflinePaymentForwardFailure$NetworkError;", "Lcom/zettle/sdk/OfflinePaymentForwardFailure$NetworkTimeout;", "Lcom/zettle/sdk/OfflinePaymentForwardFailure$PermissionDenied;", "Lcom/zettle/sdk/OfflinePaymentForwardFailure$RejectedByBackend;", "Lcom/zettle/sdk/OfflinePaymentForwardFailure$ServerError;", "Lcom/zettle/sdk/OfflinePaymentForwardFailure$TooManyRequests;", "Lcom/zettle/sdk/OfflinePaymentForwardFailure$Unknown;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface OfflinePaymentForwardFailure {

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/OfflinePaymentForwardFailure$NetworkError;", "Lcom/zettle/sdk/OfflinePaymentForwardFailure;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NetworkError implements com.zettle.sdk.OfflinePaymentForwardFailure {
        public static final com.zettle.sdk.OfflinePaymentForwardFailure.NetworkError INSTANCE = new com.zettle.sdk.OfflinePaymentForwardFailure.NetworkError();

        private NetworkError() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/OfflinePaymentForwardFailure$NetworkTimeout;", "Lcom/zettle/sdk/OfflinePaymentForwardFailure;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NetworkTimeout implements com.zettle.sdk.OfflinePaymentForwardFailure {
        public static final com.zettle.sdk.OfflinePaymentForwardFailure.NetworkTimeout INSTANCE = new com.zettle.sdk.OfflinePaymentForwardFailure.NetworkTimeout();

        private NetworkTimeout() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/OfflinePaymentForwardFailure$AuthRequired;", "Lcom/zettle/sdk/OfflinePaymentForwardFailure;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AuthRequired implements com.zettle.sdk.OfflinePaymentForwardFailure {
        public static final com.zettle.sdk.OfflinePaymentForwardFailure.AuthRequired INSTANCE = new com.zettle.sdk.OfflinePaymentForwardFailure.AuthRequired();

        private AuthRequired() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/OfflinePaymentForwardFailure$PermissionDenied;", "Lcom/zettle/sdk/OfflinePaymentForwardFailure;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PermissionDenied implements com.zettle.sdk.OfflinePaymentForwardFailure {
        public static final com.zettle.sdk.OfflinePaymentForwardFailure.PermissionDenied INSTANCE = new com.zettle.sdk.OfflinePaymentForwardFailure.PermissionDenied();

        private PermissionDenied() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/OfflinePaymentForwardFailure$TooManyRequests;", "Lcom/zettle/sdk/OfflinePaymentForwardFailure;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class TooManyRequests implements com.zettle.sdk.OfflinePaymentForwardFailure {
        public static final com.zettle.sdk.OfflinePaymentForwardFailure.TooManyRequests INSTANCE = new com.zettle.sdk.OfflinePaymentForwardFailure.TooManyRequests();

        private TooManyRequests() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/zettle/sdk/OfflinePaymentForwardFailure$RejectedByBackend;", "Lcom/zettle/sdk/OfflinePaymentForwardFailure;", "", "errorCode", "<init>", "(Ljava/lang/String;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class RejectedByBackend implements com.zettle.sdk.OfflinePaymentForwardFailure {
        public RejectedByBackend(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/OfflinePaymentForwardFailure$ServerError;", "Lcom/zettle/sdk/OfflinePaymentForwardFailure;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ServerError implements com.zettle.sdk.OfflinePaymentForwardFailure {
        public static final com.zettle.sdk.OfflinePaymentForwardFailure.ServerError INSTANCE = new com.zettle.sdk.OfflinePaymentForwardFailure.ServerError();

        private ServerError() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/zettle/sdk/OfflinePaymentForwardFailure$Unknown;", "Lcom/zettle/sdk/OfflinePaymentForwardFailure;", "", "error", "<init>", "(Ljava/lang/String;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Unknown implements com.zettle.sdk.OfflinePaymentForwardFailure {
        public Unknown(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        }
    }
}
