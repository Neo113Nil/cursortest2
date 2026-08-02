package com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/connect/partnerlinking/domain/model/ValidateConnectError;", "", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "NetworkError", "InvalidInput", "UnknownError", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/domain/model/ValidateConnectError$InvalidInput;", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/domain/model/ValidateConnectError$NetworkError;", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/domain/model/ValidateConnectError$UnknownError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class ValidateConnectError {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\u0007\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\t\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/identity/connect/partnerlinking/domain/model/ValidateConnectError$NetworkError;", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/domain/model/ValidateConnectError;", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "exception", "<init>", "(Ljava/lang/Exception;)V", "component1", "()Ljava/lang/Exception;", "copy", "(Ljava/lang/Exception;)Lcom/paypal/oslo/feature/identity/connect/partnerlinking/domain/model/ValidateConnectError$NetworkError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Exception;", "getException"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NetworkError extends com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError {
        public static final int $stable = 8;
        private final java.lang.Exception exception;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NetworkError(java.lang.Exception exc) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exc, "");
            this.exception = exc;
        }

        public final java.lang.Exception getException() {
            return this.exception;
        }

        @Override // com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError
        public final java.lang.String toString() {
            java.lang.Exception exc = this.exception;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NetworkError(exception=");
            sb.append(exc);
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
            return (other instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError.NetworkError) && kotlin.jvm.internal.Intrinsics.areEqual(this.exception, ((com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError.NetworkError) other).exception);
        }

        public final com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError.NetworkError copy(java.lang.Exception exception) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exception, "");
            return new com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError.NetworkError(exception);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Exception getException() {
            return this.exception;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError.NetworkError copy$default(com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError.NetworkError networkError, java.lang.Exception exc, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                exc = networkError.exception;
            }
            return networkError.copy(exc);
        }
    }

    private ValidateConnectError() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/connect/partnerlinking/domain/model/ValidateConnectError$InvalidInput;", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/domain/model/ValidateConnectError;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/connect/partnerlinking/domain/model/ValidateConnectError$InvalidInput;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InvalidInput extends com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError {
        public static final int $stable = 0;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvalidInput(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        @Override // com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError
        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InvalidInput(message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError.InvalidInput) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError.InvalidInput) other).message);
        }

        public final com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError.InvalidInput copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError.InvalidInput(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError.InvalidInput copy$default(com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError.InvalidInput invalidInput, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = invalidInput.message;
            }
            return invalidInput.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/connect/partnerlinking/domain/model/ValidateConnectError$UnknownError;", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/domain/model/ValidateConnectError;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/connect/partnerlinking/domain/model/ValidateConnectError$UnknownError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnknownError extends com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError {
        public static final int $stable = 0;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnknownError(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        @Override // com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError
        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UnknownError(message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError.UnknownError) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError.UnknownError) other).message);
        }

        public final com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError.UnknownError copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError.UnknownError(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError.UnknownError copy$default(com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError.UnknownError unknownError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = unknownError.message;
            }
            return unknownError.copy(str);
        }
    }

    public java.lang.String toString() {
        if (this instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError.NetworkError) {
            return "Network error: ".concat(java.lang.String.valueOf(((com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError.NetworkError) this).getException().getMessage()));
        }
        if (this instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError.InvalidInput) {
            return "Invalid input: ".concat(java.lang.String.valueOf(((com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError.InvalidInput) this).getMessage()));
        }
        if (this instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError.UnknownError) {
            return "Unknown error: ".concat(java.lang.String.valueOf(((com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError.UnknownError) this).getMessage()));
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public /* synthetic */ ValidateConnectError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
