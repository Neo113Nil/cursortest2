package com.zettle.sdk.core.auth;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/zettle/sdk/core/auth/ConnectionTokenProviderResult;", "", "<init>", "()V", "Failure", "Success", "Lcom/zettle/sdk/core/auth/ConnectionTokenProviderResult$Failure;", "Lcom/zettle/sdk/core/auth/ConnectionTokenProviderResult$Success;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class ConnectionTokenProviderResult {

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/core/auth/ConnectionTokenProviderResult$Success;", "Lcom/zettle/sdk/core/auth/ConnectionTokenProviderResult;", "Lcom/zettle/sdk/core/auth/ConnectionOAuthToken;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "<init>", "(Lcom/zettle/sdk/core/auth/ConnectionOAuthToken;)V", "component1", "()Lcom/zettle/sdk/core/auth/ConnectionOAuthToken;", "copy", "(Lcom/zettle/sdk/core/auth/ConnectionOAuthToken;)Lcom/zettle/sdk/core/auth/ConnectionTokenProviderResult$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/zettle/sdk/core/auth/ConnectionOAuthToken;", "getToken"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Success extends com.zettle.sdk.core.auth.ConnectionTokenProviderResult {
        private final com.zettle.sdk.core.auth.ConnectionOAuthToken token;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(com.zettle.sdk.core.auth.ConnectionOAuthToken connectionOAuthToken) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectionOAuthToken, "");
            this.token = connectionOAuthToken;
        }

        public final com.zettle.sdk.core.auth.ConnectionOAuthToken getToken() {
            return this.token;
        }

        public final java.lang.String toString() {
            com.zettle.sdk.core.auth.ConnectionOAuthToken connectionOAuthToken = this.token;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(token=");
            sb.append(connectionOAuthToken);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.token.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.zettle.sdk.core.auth.ConnectionTokenProviderResult.Success) && kotlin.jvm.internal.Intrinsics.areEqual(this.token, ((com.zettle.sdk.core.auth.ConnectionTokenProviderResult.Success) other).token);
        }

        public final com.zettle.sdk.core.auth.ConnectionTokenProviderResult.Success copy(com.zettle.sdk.core.auth.ConnectionOAuthToken token) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "");
            return new com.zettle.sdk.core.auth.ConnectionTokenProviderResult.Success(token);
        }

        /* renamed from: component1, reason: from getter */
        public final com.zettle.sdk.core.auth.ConnectionOAuthToken getToken() {
            return this.token;
        }

        public static /* synthetic */ com.zettle.sdk.core.auth.ConnectionTokenProviderResult.Success copy$default(com.zettle.sdk.core.auth.ConnectionTokenProviderResult.Success success, com.zettle.sdk.core.auth.ConnectionOAuthToken connectionOAuthToken, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                connectionOAuthToken = success.token;
            }
            return success.copy(connectionOAuthToken);
        }
    }

    private ConnectionTokenProviderResult() {
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/core/auth/ConnectionTokenProviderResult$Failure;", "Lcom/zettle/sdk/core/auth/ConnectionTokenProviderResult;", "Lcom/zettle/sdk/core/auth/TokenRetrievalException;", "exception", "<init>", "(Lcom/zettle/sdk/core/auth/TokenRetrievalException;)V", "component1", "()Lcom/zettle/sdk/core/auth/TokenRetrievalException;", "copy", "(Lcom/zettle/sdk/core/auth/TokenRetrievalException;)Lcom/zettle/sdk/core/auth/ConnectionTokenProviderResult$Failure;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/zettle/sdk/core/auth/TokenRetrievalException;", "getException"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Failure extends com.zettle.sdk.core.auth.ConnectionTokenProviderResult {
        private final com.zettle.sdk.core.auth.TokenRetrievalException exception;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(com.zettle.sdk.core.auth.TokenRetrievalException tokenRetrievalException) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenRetrievalException, "");
            this.exception = tokenRetrievalException;
        }

        public final com.zettle.sdk.core.auth.TokenRetrievalException getException() {
            return this.exception;
        }

        public final java.lang.String toString() {
            com.zettle.sdk.core.auth.TokenRetrievalException tokenRetrievalException = this.exception;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failure(exception=");
            sb.append(tokenRetrievalException);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.exception.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.zettle.sdk.core.auth.ConnectionTokenProviderResult.Failure) && kotlin.jvm.internal.Intrinsics.areEqual(this.exception, ((com.zettle.sdk.core.auth.ConnectionTokenProviderResult.Failure) other).exception);
        }

        public final com.zettle.sdk.core.auth.ConnectionTokenProviderResult.Failure copy(com.zettle.sdk.core.auth.TokenRetrievalException exception) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exception, "");
            return new com.zettle.sdk.core.auth.ConnectionTokenProviderResult.Failure(exception);
        }

        /* renamed from: component1, reason: from getter */
        public final com.zettle.sdk.core.auth.TokenRetrievalException getException() {
            return this.exception;
        }

        public static /* synthetic */ com.zettle.sdk.core.auth.ConnectionTokenProviderResult.Failure copy$default(com.zettle.sdk.core.auth.ConnectionTokenProviderResult.Failure failure, com.zettle.sdk.core.auth.TokenRetrievalException tokenRetrievalException, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                tokenRetrievalException = failure.exception;
            }
            return failure.copy(tokenRetrievalException);
        }
    }

    public /* synthetic */ ConnectionTokenProviderResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
