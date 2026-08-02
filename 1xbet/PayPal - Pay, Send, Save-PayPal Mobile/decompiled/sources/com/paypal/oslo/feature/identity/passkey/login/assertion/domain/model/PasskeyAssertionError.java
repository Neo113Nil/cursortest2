package com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u000e\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000e\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError;", "Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionResult;", "<init>", "()V", "UnsupportedPlatform", "InvalidCredentialType", "MissingCredentialId", "NetworkError", "AuthenticationError", "NotFoundError", "ServerError", "UserCancelled", "Interrupted", "ProcessCancelled", "NoCredentialsFound", "ValidationError", "SecurityError", "UnknownError", "Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError$AuthenticationError;", "Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError$Interrupted;", "Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError$InvalidCredentialType;", "Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError$MissingCredentialId;", "Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError$NetworkError;", "Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError$NoCredentialsFound;", "Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError$NotFoundError;", "Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError$ProcessCancelled;", "Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError$SecurityError;", "Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError$ServerError;", "Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError$UnknownError;", "Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError$UnsupportedPlatform;", "Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError$UserCancelled;", "Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError$ValidationError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class PasskeyAssertionError extends com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionResult {
    public static final int $stable = 0;

    private PasskeyAssertionError() {
        super(null);
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError$UnsupportedPlatform;", "Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError$UnsupportedPlatform;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Throwable;", "getCause"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnsupportedPlatform extends com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError {
        public static final int $stable = 8;
        private final java.lang.Throwable cause;

        public UnsupportedPlatform(java.lang.Throwable th) {
            super(null);
            this.cause = th;
        }

        public /* synthetic */ UnsupportedPlatform(java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : th);
        }

        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public final java.lang.String toString() {
            java.lang.Throwable th = this.cause;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UnsupportedPlatform(cause=");
            sb.append(th);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Throwable th = this.cause;
            if (th == null) {
                return 0;
            }
            return th.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.UnsupportedPlatform) && kotlin.jvm.internal.Intrinsics.areEqual(this.cause, ((com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.UnsupportedPlatform) other).cause);
        }

        public final com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.UnsupportedPlatform copy(java.lang.Throwable cause) {
            return new com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.UnsupportedPlatform(cause);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.UnsupportedPlatform copy$default(com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.UnsupportedPlatform unsupportedPlatform, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                th = unsupportedPlatform.cause;
            }
            return unsupportedPlatform.copy(th);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public UnsupportedPlatform() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError$InvalidCredentialType;", "Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError;", "", "expectedType", "actualType", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError$InvalidCredentialType;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getExpectedType", "getActualType", "Ljava/lang/Throwable;", "getCause"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InvalidCredentialType extends com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError {
        public static final int $stable = 8;
        private final java.lang.String actualType;
        private final java.lang.Throwable cause;
        private final java.lang.String expectedType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvalidCredentialType(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.expectedType = str;
            this.actualType = str2;
            this.cause = th;
        }

        public /* synthetic */ InvalidCredentialType(java.lang.String str, java.lang.String str2, java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "PublicKeyCredential" : str, str2, (i & 4) != 0 ? null : th);
        }

        public final java.lang.String getExpectedType() {
            return this.expectedType;
        }

        public final java.lang.String getActualType() {
            return this.actualType;
        }

        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.expectedType;
            java.lang.String str2 = this.actualType;
            java.lang.Throwable th = this.cause;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InvalidCredentialType(expectedType=");
            sb.append(str);
            sb.append(", actualType=");
            sb.append(str2);
            sb.append(", cause=");
            sb.append(th);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.expectedType.hashCode();
            int hashCode2 = this.actualType.hashCode();
            java.lang.Throwable th = this.cause;
            return (((hashCode * 31) + hashCode2) * 31) + (th == null ? 0 : th.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.InvalidCredentialType)) {
                return false;
            }
            com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.InvalidCredentialType invalidCredentialType = (com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.InvalidCredentialType) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.expectedType, invalidCredentialType.expectedType) && kotlin.jvm.internal.Intrinsics.areEqual(this.actualType, invalidCredentialType.actualType) && kotlin.jvm.internal.Intrinsics.areEqual(this.cause, invalidCredentialType.cause);
        }

        public final com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.InvalidCredentialType copy(java.lang.String expectedType, java.lang.String actualType, java.lang.Throwable cause) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(expectedType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actualType, "");
            return new com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.InvalidCredentialType(expectedType, actualType, cause);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getActualType() {
            return this.actualType;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getExpectedType() {
            return this.expectedType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.InvalidCredentialType copy$default(com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.InvalidCredentialType invalidCredentialType, java.lang.String str, java.lang.String str2, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = invalidCredentialType.expectedType;
            }
            if ((i & 2) != 0) {
                str2 = invalidCredentialType.actualType;
            }
            if ((i & 4) != 0) {
                th = invalidCredentialType.cause;
            }
            return invalidCredentialType.copy(str, str2, th);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError$MissingCredentialId;", "Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError$MissingCredentialId;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Throwable;", "getCause"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MissingCredentialId extends com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError {
        public static final int $stable = 8;
        private final java.lang.Throwable cause;

        public MissingCredentialId(java.lang.Throwable th) {
            super(null);
            this.cause = th;
        }

        public /* synthetic */ MissingCredentialId(java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : th);
        }

        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public final java.lang.String toString() {
            java.lang.Throwable th = this.cause;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MissingCredentialId(cause=");
            sb.append(th);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Throwable th = this.cause;
            if (th == null) {
                return 0;
            }
            return th.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.MissingCredentialId) && kotlin.jvm.internal.Intrinsics.areEqual(this.cause, ((com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.MissingCredentialId) other).cause);
        }

        public final com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.MissingCredentialId copy(java.lang.Throwable cause) {
            return new com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.MissingCredentialId(cause);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.MissingCredentialId copy$default(com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.MissingCredentialId missingCredentialId, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                th = missingCredentialId.cause;
            }
            return missingCredentialId.copy(th);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public MissingCredentialId() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError$NetworkError;", "Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError$NetworkError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Throwable;", "getCause"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NetworkError extends com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError {
        public static final int $stable = 8;
        private final java.lang.Throwable cause;

        public NetworkError(java.lang.Throwable th) {
            super(null);
            this.cause = th;
        }

        public /* synthetic */ NetworkError(java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : th);
        }

        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public final java.lang.String toString() {
            java.lang.Throwable th = this.cause;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NetworkError(cause=");
            sb.append(th);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Throwable th = this.cause;
            if (th == null) {
                return 0;
            }
            return th.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.NetworkError) && kotlin.jvm.internal.Intrinsics.areEqual(this.cause, ((com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.NetworkError) other).cause);
        }

        public final com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.NetworkError copy(java.lang.Throwable cause) {
            return new com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.NetworkError(cause);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.NetworkError copy$default(com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.NetworkError networkError, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                th = networkError.cause;
            }
            return networkError.copy(th);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public NetworkError() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError$AuthenticationError;", "Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError$AuthenticationError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Throwable;", "getCause"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AuthenticationError extends com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError {
        public static final int $stable = 8;
        private final java.lang.Throwable cause;

        public AuthenticationError(java.lang.Throwable th) {
            super(null);
            this.cause = th;
        }

        public /* synthetic */ AuthenticationError(java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : th);
        }

        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public final java.lang.String toString() {
            java.lang.Throwable th = this.cause;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AuthenticationError(cause=");
            sb.append(th);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Throwable th = this.cause;
            if (th == null) {
                return 0;
            }
            return th.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.AuthenticationError) && kotlin.jvm.internal.Intrinsics.areEqual(this.cause, ((com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.AuthenticationError) other).cause);
        }

        public final com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.AuthenticationError copy(java.lang.Throwable cause) {
            return new com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.AuthenticationError(cause);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.AuthenticationError copy$default(com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.AuthenticationError authenticationError, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                th = authenticationError.cause;
            }
            return authenticationError.copy(th);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AuthenticationError() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError$NotFoundError;", "Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError$NotFoundError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Throwable;", "getCause"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NotFoundError extends com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError {
        public static final int $stable = 8;
        private final java.lang.Throwable cause;

        public NotFoundError(java.lang.Throwable th) {
            super(null);
            this.cause = th;
        }

        public /* synthetic */ NotFoundError(java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : th);
        }

        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public final java.lang.String toString() {
            java.lang.Throwable th = this.cause;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NotFoundError(cause=");
            sb.append(th);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Throwable th = this.cause;
            if (th == null) {
                return 0;
            }
            return th.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.NotFoundError) && kotlin.jvm.internal.Intrinsics.areEqual(this.cause, ((com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.NotFoundError) other).cause);
        }

        public final com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.NotFoundError copy(java.lang.Throwable cause) {
            return new com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.NotFoundError(cause);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.NotFoundError copy$default(com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.NotFoundError notFoundError, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                th = notFoundError.cause;
            }
            return notFoundError.copy(th);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public NotFoundError() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError$ServerError;", "Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError;", "", "statusCode", "", "cause", "<init>", "(Ljava/lang/Integer;Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/Integer;Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError$ServerError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Integer;", "getStatusCode", "Ljava/lang/Throwable;", "getCause"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ServerError extends com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError {
        public static final int $stable = 8;
        private final java.lang.Throwable cause;
        private final java.lang.Integer statusCode;

        public ServerError(java.lang.Integer num, java.lang.Throwable th) {
            super(null);
            this.statusCode = num;
            this.cause = th;
        }

        public /* synthetic */ ServerError(java.lang.Integer num, java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : th);
        }

        public final java.lang.Integer getStatusCode() {
            return this.statusCode;
        }

        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public final java.lang.String toString() {
            java.lang.Integer num = this.statusCode;
            java.lang.Throwable th = this.cause;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ServerError(statusCode=");
            sb.append(num);
            sb.append(", cause=");
            sb.append(th);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Integer num = this.statusCode;
            int hashCode = num == null ? 0 : num.hashCode();
            java.lang.Throwable th = this.cause;
            return (hashCode * 31) + (th != null ? th.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.ServerError)) {
                return false;
            }
            com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.ServerError serverError = (com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.ServerError) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.statusCode, serverError.statusCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.cause, serverError.cause);
        }

        public final com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.ServerError copy(java.lang.Integer statusCode, java.lang.Throwable cause) {
            return new com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.ServerError(statusCode, cause);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Integer getStatusCode() {
            return this.statusCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.ServerError copy$default(com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.ServerError serverError, java.lang.Integer num, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                num = serverError.statusCode;
            }
            if ((i & 2) != 0) {
                th = serverError.cause;
            }
            return serverError.copy(num, th);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ServerError() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError$UserCancelled;", "Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError$UserCancelled;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Throwable;", "getCause"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UserCancelled extends com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError {
        public static final int $stable = 8;
        private final java.lang.Throwable cause;

        public UserCancelled(java.lang.Throwable th) {
            super(null);
            this.cause = th;
        }

        public /* synthetic */ UserCancelled(java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : th);
        }

        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public final java.lang.String toString() {
            java.lang.Throwable th = this.cause;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UserCancelled(cause=");
            sb.append(th);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Throwable th = this.cause;
            if (th == null) {
                return 0;
            }
            return th.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.UserCancelled) && kotlin.jvm.internal.Intrinsics.areEqual(this.cause, ((com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.UserCancelled) other).cause);
        }

        public final com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.UserCancelled copy(java.lang.Throwable cause) {
            return new com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.UserCancelled(cause);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.UserCancelled copy$default(com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.UserCancelled userCancelled, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                th = userCancelled.cause;
            }
            return userCancelled.copy(th);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public UserCancelled() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError$Interrupted;", "Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError$Interrupted;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Throwable;", "getCause"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Interrupted extends com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError {
        public static final int $stable = 8;
        private final java.lang.Throwable cause;

        public Interrupted(java.lang.Throwable th) {
            super(null);
            this.cause = th;
        }

        public /* synthetic */ Interrupted(java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : th);
        }

        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public final java.lang.String toString() {
            java.lang.Throwable th = this.cause;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Interrupted(cause=");
            sb.append(th);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Throwable th = this.cause;
            if (th == null) {
                return 0;
            }
            return th.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.Interrupted) && kotlin.jvm.internal.Intrinsics.areEqual(this.cause, ((com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.Interrupted) other).cause);
        }

        public final com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.Interrupted copy(java.lang.Throwable cause) {
            return new com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.Interrupted(cause);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.Interrupted copy$default(com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.Interrupted interrupted, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                th = interrupted.cause;
            }
            return interrupted.copy(th);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Interrupted() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError$ProcessCancelled;", "Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError$ProcessCancelled;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Throwable;", "getCause"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ProcessCancelled extends com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError {
        public static final int $stable = 8;
        private final java.lang.Throwable cause;

        public ProcessCancelled(java.lang.Throwable th) {
            super(null);
            this.cause = th;
        }

        public /* synthetic */ ProcessCancelled(java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : th);
        }

        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public final java.lang.String toString() {
            java.lang.Throwable th = this.cause;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ProcessCancelled(cause=");
            sb.append(th);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Throwable th = this.cause;
            if (th == null) {
                return 0;
            }
            return th.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.ProcessCancelled) && kotlin.jvm.internal.Intrinsics.areEqual(this.cause, ((com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.ProcessCancelled) other).cause);
        }

        public final com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.ProcessCancelled copy(java.lang.Throwable cause) {
            return new com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.ProcessCancelled(cause);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.ProcessCancelled copy$default(com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.ProcessCancelled processCancelled, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                th = processCancelled.cause;
            }
            return processCancelled.copy(th);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ProcessCancelled() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError$NoCredentialsFound;", "Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError$NoCredentialsFound;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Throwable;", "getCause"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NoCredentialsFound extends com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError {
        public static final int $stable = 8;
        private final java.lang.Throwable cause;

        public NoCredentialsFound(java.lang.Throwable th) {
            super(null);
            this.cause = th;
        }

        public /* synthetic */ NoCredentialsFound(java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : th);
        }

        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public final java.lang.String toString() {
            java.lang.Throwable th = this.cause;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NoCredentialsFound(cause=");
            sb.append(th);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Throwable th = this.cause;
            if (th == null) {
                return 0;
            }
            return th.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.NoCredentialsFound) && kotlin.jvm.internal.Intrinsics.areEqual(this.cause, ((com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.NoCredentialsFound) other).cause);
        }

        public final com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.NoCredentialsFound copy(java.lang.Throwable cause) {
            return new com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.NoCredentialsFound(cause);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.NoCredentialsFound copy$default(com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.NoCredentialsFound noCredentialsFound, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                th = noCredentialsFound.cause;
            }
            return noCredentialsFound.copy(th);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public NoCredentialsFound() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError$ValidationError;", "Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError$ValidationError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Throwable;", "getCause"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ValidationError extends com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError {
        public static final int $stable = 8;
        private final java.lang.Throwable cause;

        public ValidationError(java.lang.Throwable th) {
            super(null);
            this.cause = th;
        }

        public /* synthetic */ ValidationError(java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : th);
        }

        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public final java.lang.String toString() {
            java.lang.Throwable th = this.cause;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ValidationError(cause=");
            sb.append(th);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Throwable th = this.cause;
            if (th == null) {
                return 0;
            }
            return th.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.ValidationError) && kotlin.jvm.internal.Intrinsics.areEqual(this.cause, ((com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.ValidationError) other).cause);
        }

        public final com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.ValidationError copy(java.lang.Throwable cause) {
            return new com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.ValidationError(cause);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.ValidationError copy$default(com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.ValidationError validationError, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                th = validationError.cause;
            }
            return validationError.copy(th);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ValidationError() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError$SecurityError;", "Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError$SecurityError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Throwable;", "getCause"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SecurityError extends com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError {
        public static final int $stable = 8;
        private final java.lang.Throwable cause;

        public SecurityError(java.lang.Throwable th) {
            super(null);
            this.cause = th;
        }

        public /* synthetic */ SecurityError(java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : th);
        }

        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public final java.lang.String toString() {
            java.lang.Throwable th = this.cause;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SecurityError(cause=");
            sb.append(th);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Throwable th = this.cause;
            if (th == null) {
                return 0;
            }
            return th.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.SecurityError) && kotlin.jvm.internal.Intrinsics.areEqual(this.cause, ((com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.SecurityError) other).cause);
        }

        public final com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.SecurityError copy(java.lang.Throwable cause) {
            return new com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.SecurityError(cause);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.SecurityError copy$default(com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.SecurityError securityError, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                th = securityError.cause;
            }
            return securityError.copy(th);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SecurityError() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError$UnknownError;", "Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError;", "", "errorCode", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionError$UnknownError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorCode", "Ljava/lang/Throwable;", "getCause"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnknownError extends com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError {
        public static final int $stable = 8;
        private final java.lang.Throwable cause;
        private final java.lang.String errorCode;

        public UnknownError(java.lang.String str, java.lang.Throwable th) {
            super(null);
            this.errorCode = str;
            this.cause = th;
        }

        public /* synthetic */ UnknownError(java.lang.String str, java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th);
        }

        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.errorCode;
            java.lang.Throwable th = this.cause;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UnknownError(errorCode=");
            sb.append(str);
            sb.append(", cause=");
            sb.append(th);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.errorCode;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.Throwable th = this.cause;
            return (hashCode * 31) + (th != null ? th.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.UnknownError)) {
                return false;
            }
            com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.UnknownError unknownError = (com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.UnknownError) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, unknownError.errorCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.cause, unknownError.cause);
        }

        public final com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.UnknownError copy(java.lang.String errorCode, java.lang.Throwable cause) {
            return new com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.UnknownError(errorCode, cause);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.UnknownError copy$default(com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionError.UnknownError unknownError, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = unknownError.errorCode;
            }
            if ((i & 2) != 0) {
                th = unknownError.cause;
            }
            return unknownError.copy(str, th);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public UnknownError() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    public /* synthetic */ PasskeyAssertionError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
