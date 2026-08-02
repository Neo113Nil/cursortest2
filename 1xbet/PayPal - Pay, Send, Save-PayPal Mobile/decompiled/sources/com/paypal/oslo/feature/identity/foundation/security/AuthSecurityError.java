package com.paypal.oslo.feature.identity.foundation.security;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/identity/foundation/security/AuthSecurityError;", "", "<init>", "()V", "KeyGenerationFailed", "SignatureOperationFailed", "KeyStoreOperationFailed", "UserAuthenticationRequired", "ValidationError", "DeviceCompatibilityError", "Unknown", "Lcom/paypal/oslo/feature/identity/foundation/security/AuthSecurityError$DeviceCompatibilityError;", "Lcom/paypal/oslo/feature/identity/foundation/security/AuthSecurityError$KeyGenerationFailed;", "Lcom/paypal/oslo/feature/identity/foundation/security/AuthSecurityError$KeyStoreOperationFailed;", "Lcom/paypal/oslo/feature/identity/foundation/security/AuthSecurityError$SignatureOperationFailed;", "Lcom/paypal/oslo/feature/identity/foundation/security/AuthSecurityError$Unknown;", "Lcom/paypal/oslo/feature/identity/foundation/security/AuthSecurityError$UserAuthenticationRequired;", "Lcom/paypal/oslo/feature/identity/foundation/security/AuthSecurityError$ValidationError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class AuthSecurityError {
    public static final int $stable = 0;

    private AuthSecurityError() {
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/foundation/security/AuthSecurityError$KeyGenerationFailed;", "Lcom/paypal/oslo/feature/identity/foundation/security/AuthSecurityError;", "", "reason", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/identity/foundation/security/AuthSecurityError$KeyGenerationFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getReason", "Ljava/lang/Throwable;", "getCause"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class KeyGenerationFailed extends com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError {
        public static final int $stable = 8;
        private final java.lang.Throwable cause;
        private final java.lang.String reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public KeyGenerationFailed(java.lang.String str, java.lang.Throwable th) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.reason = str;
            this.cause = th;
        }

        public /* synthetic */ KeyGenerationFailed(java.lang.String str, java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : th);
        }

        public final java.lang.String getReason() {
            return this.reason;
        }

        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.reason;
            java.lang.Throwable th = this.cause;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("KeyGenerationFailed(reason=");
            sb.append(str);
            sb.append(", cause=");
            sb.append(th);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.reason.hashCode();
            java.lang.Throwable th = this.cause;
            return (hashCode * 31) + (th == null ? 0 : th.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.KeyGenerationFailed)) {
                return false;
            }
            com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.KeyGenerationFailed keyGenerationFailed = (com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.KeyGenerationFailed) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.reason, keyGenerationFailed.reason) && kotlin.jvm.internal.Intrinsics.areEqual(this.cause, keyGenerationFailed.cause);
        }

        public final com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.KeyGenerationFailed copy(java.lang.String reason, java.lang.Throwable cause) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
            return new com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.KeyGenerationFailed(reason, cause);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getReason() {
            return this.reason;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.KeyGenerationFailed copy$default(com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.KeyGenerationFailed keyGenerationFailed, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = keyGenerationFailed.reason;
            }
            if ((i & 2) != 0) {
                th = keyGenerationFailed.cause;
            }
            return keyGenerationFailed.copy(str, th);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/foundation/security/AuthSecurityError$SignatureOperationFailed;", "Lcom/paypal/oslo/feature/identity/foundation/security/AuthSecurityError;", "", "reason", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/identity/foundation/security/AuthSecurityError$SignatureOperationFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getReason", "Ljava/lang/Throwable;", "getCause"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SignatureOperationFailed extends com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError {
        public static final int $stable = 8;
        private final java.lang.Throwable cause;
        private final java.lang.String reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SignatureOperationFailed(java.lang.String str, java.lang.Throwable th) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.reason = str;
            this.cause = th;
        }

        public /* synthetic */ SignatureOperationFailed(java.lang.String str, java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : th);
        }

        public final java.lang.String getReason() {
            return this.reason;
        }

        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.reason;
            java.lang.Throwable th = this.cause;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SignatureOperationFailed(reason=");
            sb.append(str);
            sb.append(", cause=");
            sb.append(th);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.reason.hashCode();
            java.lang.Throwable th = this.cause;
            return (hashCode * 31) + (th == null ? 0 : th.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.SignatureOperationFailed)) {
                return false;
            }
            com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.SignatureOperationFailed signatureOperationFailed = (com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.SignatureOperationFailed) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.reason, signatureOperationFailed.reason) && kotlin.jvm.internal.Intrinsics.areEqual(this.cause, signatureOperationFailed.cause);
        }

        public final com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.SignatureOperationFailed copy(java.lang.String reason, java.lang.Throwable cause) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
            return new com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.SignatureOperationFailed(reason, cause);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getReason() {
            return this.reason;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.SignatureOperationFailed copy$default(com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.SignatureOperationFailed signatureOperationFailed, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = signatureOperationFailed.reason;
            }
            if ((i & 2) != 0) {
                th = signatureOperationFailed.cause;
            }
            return signatureOperationFailed.copy(str, th);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/foundation/security/AuthSecurityError$KeyStoreOperationFailed;", "Lcom/paypal/oslo/feature/identity/foundation/security/AuthSecurityError;", "", "reason", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/identity/foundation/security/AuthSecurityError$KeyStoreOperationFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getReason", "Ljava/lang/Throwable;", "getCause"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class KeyStoreOperationFailed extends com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError {
        public static final int $stable = 8;
        private final java.lang.Throwable cause;
        private final java.lang.String reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public KeyStoreOperationFailed(java.lang.String str, java.lang.Throwable th) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.reason = str;
            this.cause = th;
        }

        public /* synthetic */ KeyStoreOperationFailed(java.lang.String str, java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : th);
        }

        public final java.lang.String getReason() {
            return this.reason;
        }

        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.reason;
            java.lang.Throwable th = this.cause;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("KeyStoreOperationFailed(reason=");
            sb.append(str);
            sb.append(", cause=");
            sb.append(th);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.reason.hashCode();
            java.lang.Throwable th = this.cause;
            return (hashCode * 31) + (th == null ? 0 : th.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.KeyStoreOperationFailed)) {
                return false;
            }
            com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.KeyStoreOperationFailed keyStoreOperationFailed = (com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.KeyStoreOperationFailed) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.reason, keyStoreOperationFailed.reason) && kotlin.jvm.internal.Intrinsics.areEqual(this.cause, keyStoreOperationFailed.cause);
        }

        public final com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.KeyStoreOperationFailed copy(java.lang.String reason, java.lang.Throwable cause) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
            return new com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.KeyStoreOperationFailed(reason, cause);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getReason() {
            return this.reason;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.KeyStoreOperationFailed copy$default(com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.KeyStoreOperationFailed keyStoreOperationFailed, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = keyStoreOperationFailed.reason;
            }
            if ((i & 2) != 0) {
                th = keyStoreOperationFailed.cause;
            }
            return keyStoreOperationFailed.copy(str, th);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/foundation/security/AuthSecurityError$UserAuthenticationRequired;", "Lcom/paypal/oslo/feature/identity/foundation/security/AuthSecurityError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UserAuthenticationRequired extends com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.UserAuthenticationRequired INSTANCE = new com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.UserAuthenticationRequired();

        public final int hashCode() {
            return 395215362;
        }

        private UserAuthenticationRequired() {
            super(null);
        }

        public final java.lang.String toString() {
            return "UserAuthenticationRequired";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.UserAuthenticationRequired)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/foundation/security/AuthSecurityError$ValidationError;", "Lcom/paypal/oslo/feature/identity/foundation/security/AuthSecurityError;", "<init>", "()V", "BlankKeyAlias", "NullContext", "NullSignature", "EmptyData", "Lcom/paypal/oslo/feature/identity/foundation/security/AuthSecurityError$ValidationError$BlankKeyAlias;", "Lcom/paypal/oslo/feature/identity/foundation/security/AuthSecurityError$ValidationError$EmptyData;", "Lcom/paypal/oslo/feature/identity/foundation/security/AuthSecurityError$ValidationError$NullContext;", "Lcom/paypal/oslo/feature/identity/foundation/security/AuthSecurityError$ValidationError$NullSignature;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class ValidationError extends com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError {
        public static final int $stable = 0;

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/foundation/security/AuthSecurityError$ValidationError$BlankKeyAlias;", "Lcom/paypal/oslo/feature/identity/foundation/security/AuthSecurityError$ValidationError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class BlankKeyAlias extends com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.ValidationError {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.ValidationError.BlankKeyAlias INSTANCE = new com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.ValidationError.BlankKeyAlias();

            public final int hashCode() {
                return -313487418;
            }

            private BlankKeyAlias() {
                super(null);
            }

            public final java.lang.String toString() {
                return "BlankKeyAlias";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.ValidationError.BlankKeyAlias)) {
                    return false;
                }
                return true;
            }
        }

        private ValidationError() {
            super(null);
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/foundation/security/AuthSecurityError$ValidationError$NullContext;", "Lcom/paypal/oslo/feature/identity/foundation/security/AuthSecurityError$ValidationError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes12.dex */
        public static final /* data */ class NullContext extends com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.ValidationError {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.ValidationError.NullContext INSTANCE = new com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.ValidationError.NullContext();

            public final int hashCode() {
                return 930245001;
            }

            private NullContext() {
                super(null);
            }

            public final java.lang.String toString() {
                return "NullContext";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.ValidationError.NullContext)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/foundation/security/AuthSecurityError$ValidationError$NullSignature;", "Lcom/paypal/oslo/feature/identity/foundation/security/AuthSecurityError$ValidationError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class NullSignature extends com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.ValidationError {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.ValidationError.NullSignature INSTANCE = new com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.ValidationError.NullSignature();

            public final int hashCode() {
                return 2092645906;
            }

            private NullSignature() {
                super(null);
            }

            public final java.lang.String toString() {
                return "NullSignature";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.ValidationError.NullSignature)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/foundation/security/AuthSecurityError$ValidationError$EmptyData;", "Lcom/paypal/oslo/feature/identity/foundation/security/AuthSecurityError$ValidationError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class EmptyData extends com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.ValidationError {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.ValidationError.EmptyData INSTANCE = new com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.ValidationError.EmptyData();

            public final int hashCode() {
                return 1009071672;
            }

            private EmptyData() {
                super(null);
            }

            public final java.lang.String toString() {
                return "EmptyData";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.ValidationError.EmptyData)) {
                    return false;
                }
                return true;
            }
        }

        public /* synthetic */ ValidationError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/foundation/security/AuthSecurityError$DeviceCompatibilityError;", "Lcom/paypal/oslo/feature/identity/foundation/security/AuthSecurityError;", "", "reason", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/identity/foundation/security/AuthSecurityError$DeviceCompatibilityError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getReason", "Ljava/lang/Throwable;", "getCause"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DeviceCompatibilityError extends com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError {
        public static final int $stable = 8;
        private final java.lang.Throwable cause;
        private final java.lang.String reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeviceCompatibilityError(java.lang.String str, java.lang.Throwable th) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.reason = str;
            this.cause = th;
        }

        public /* synthetic */ DeviceCompatibilityError(java.lang.String str, java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : th);
        }

        public final java.lang.String getReason() {
            return this.reason;
        }

        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.reason;
            java.lang.Throwable th = this.cause;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DeviceCompatibilityError(reason=");
            sb.append(str);
            sb.append(", cause=");
            sb.append(th);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.reason.hashCode();
            java.lang.Throwable th = this.cause;
            return (hashCode * 31) + (th == null ? 0 : th.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.DeviceCompatibilityError)) {
                return false;
            }
            com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.DeviceCompatibilityError deviceCompatibilityError = (com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.DeviceCompatibilityError) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.reason, deviceCompatibilityError.reason) && kotlin.jvm.internal.Intrinsics.areEqual(this.cause, deviceCompatibilityError.cause);
        }

        public final com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.DeviceCompatibilityError copy(java.lang.String reason, java.lang.Throwable cause) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
            return new com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.DeviceCompatibilityError(reason, cause);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getReason() {
            return this.reason;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.DeviceCompatibilityError copy$default(com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.DeviceCompatibilityError deviceCompatibilityError, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = deviceCompatibilityError.reason;
            }
            if ((i & 2) != 0) {
                th = deviceCompatibilityError.cause;
            }
            return deviceCompatibilityError.copy(str, th);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/foundation/security/AuthSecurityError$Unknown;", "Lcom/paypal/oslo/feature/identity/foundation/security/AuthSecurityError;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/identity/foundation/security/AuthSecurityError$Unknown;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "Ljava/lang/Throwable;", "getCause"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Unknown extends com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError {
        public static final int $stable = 8;
        private final java.lang.Throwable cause;
        private final java.lang.String message;

        public Unknown(java.lang.String str, java.lang.Throwable th) {
            super(null);
            this.message = str;
            this.cause = th;
        }

        public /* synthetic */ Unknown(java.lang.String str, java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th);
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.Throwable th = this.cause;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown(message=");
            sb.append(str);
            sb.append(", cause=");
            sb.append(th);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.message;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.Throwable th = this.cause;
            return (hashCode * 31) + (th != null ? th.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.Unknown)) {
                return false;
            }
            com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.Unknown unknown = (com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.Unknown) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.message, unknown.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.cause, unknown.cause);
        }

        public final com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.Unknown copy(java.lang.String message, java.lang.Throwable cause) {
            return new com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.Unknown(message, cause);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.Unknown copy$default(com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError.Unknown unknown, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = unknown.message;
            }
            if ((i & 2) != 0) {
                th = unknown.cause;
            }
            return unknown.copy(str, th);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Unknown() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    public /* synthetic */ AuthSecurityError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
