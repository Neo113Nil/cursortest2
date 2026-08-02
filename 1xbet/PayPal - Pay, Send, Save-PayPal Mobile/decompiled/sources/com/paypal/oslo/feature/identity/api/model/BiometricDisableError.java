package com.paypal.oslo.feature.identity.api.model;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/model/BiometricDisableError;", "Lcom/paypal/oslo/feature/identity/api/model/IdentityManagementError;", "<init>", "()V", "NotEnabled", "NotSupported", "NetworkError", "UnknownError", "Lcom/paypal/oslo/feature/identity/api/model/BiometricDisableError$NetworkError;", "Lcom/paypal/oslo/feature/identity/api/model/BiometricDisableError$NotEnabled;", "Lcom/paypal/oslo/feature/identity/api/model/BiometricDisableError$NotSupported;", "Lcom/paypal/oslo/feature/identity/api/model/BiometricDisableError$UnknownError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class BiometricDisableError implements com.paypal.oslo.feature.identity.api.model.IdentityManagementError {
    private BiometricDisableError() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/model/BiometricDisableError$NotEnabled;", "Lcom/paypal/oslo/feature/identity/api/model/BiometricDisableError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NotEnabled extends com.paypal.oslo.feature.identity.api.model.BiometricDisableError {
        public static final com.paypal.oslo.feature.identity.api.model.BiometricDisableError.NotEnabled INSTANCE = new com.paypal.oslo.feature.identity.api.model.BiometricDisableError.NotEnabled();

        public final int hashCode() {
            return -514689572;
        }

        private NotEnabled() {
            super(null);
        }

        public final java.lang.String toString() {
            return "NotEnabled";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.api.model.BiometricDisableError.NotEnabled)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/model/BiometricDisableError$NotSupported;", "Lcom/paypal/oslo/feature/identity/api/model/BiometricDisableError;", "", "reason", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/api/model/BiometricDisableError$NotSupported;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NotSupported extends com.paypal.oslo.feature.identity.api.model.BiometricDisableError {
        private final java.lang.String reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotSupported(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.reason = str;
        }

        public final java.lang.String getReason() {
            return this.reason;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.reason;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NotSupported(reason=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.reason.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.api.model.BiometricDisableError.NotSupported) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, ((com.paypal.oslo.feature.identity.api.model.BiometricDisableError.NotSupported) other).reason);
        }

        public final com.paypal.oslo.feature.identity.api.model.BiometricDisableError.NotSupported copy(java.lang.String reason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
            return new com.paypal.oslo.feature.identity.api.model.BiometricDisableError.NotSupported(reason);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getReason() {
            return this.reason;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.api.model.BiometricDisableError.NotSupported copy$default(com.paypal.oslo.feature.identity.api.model.BiometricDisableError.NotSupported notSupported, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = notSupported.reason;
            }
            return notSupported.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/model/BiometricDisableError$NetworkError;", "Lcom/paypal/oslo/feature/identity/api/model/BiometricDisableError;", "", "message", "code", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/api/model/BiometricDisableError$NetworkError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "getCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NetworkError extends com.paypal.oslo.feature.identity.api.model.BiometricDisableError {
        private final java.lang.String code;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NetworkError(java.lang.String str, java.lang.String str2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.message = str;
            this.code = str2;
        }

        public final java.lang.String getCode() {
            return this.code;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.String str2 = this.code;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NetworkError(message=");
            sb.append(str);
            sb.append(", code=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.message;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.code.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.api.model.BiometricDisableError.NetworkError)) {
                return false;
            }
            com.paypal.oslo.feature.identity.api.model.BiometricDisableError.NetworkError networkError = (com.paypal.oslo.feature.identity.api.model.BiometricDisableError.NetworkError) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.message, networkError.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.code, networkError.code);
        }

        public final com.paypal.oslo.feature.identity.api.model.BiometricDisableError.NetworkError copy(java.lang.String message, java.lang.String code) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(code, "");
            return new com.paypal.oslo.feature.identity.api.model.BiometricDisableError.NetworkError(message, code);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCode() {
            return this.code;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.api.model.BiometricDisableError.NetworkError copy$default(com.paypal.oslo.feature.identity.api.model.BiometricDisableError.NetworkError networkError, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = networkError.message;
            }
            if ((i & 2) != 0) {
                str2 = networkError.code;
            }
            return networkError.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/model/BiometricDisableError$UnknownError;", "Lcom/paypal/oslo/feature/identity/api/model/BiometricDisableError;", "", "reason", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/api/model/BiometricDisableError$UnknownError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnknownError extends com.paypal.oslo.feature.identity.api.model.BiometricDisableError {
        private final java.lang.String reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnknownError(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.reason = str;
        }

        public final java.lang.String getReason() {
            return this.reason;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.reason;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UnknownError(reason=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.reason.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.api.model.BiometricDisableError.UnknownError) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, ((com.paypal.oslo.feature.identity.api.model.BiometricDisableError.UnknownError) other).reason);
        }

        public final com.paypal.oslo.feature.identity.api.model.BiometricDisableError.UnknownError copy(java.lang.String reason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
            return new com.paypal.oslo.feature.identity.api.model.BiometricDisableError.UnknownError(reason);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getReason() {
            return this.reason;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.api.model.BiometricDisableError.UnknownError copy$default(com.paypal.oslo.feature.identity.api.model.BiometricDisableError.UnknownError unknownError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = unknownError.reason;
            }
            return unknownError.copy(str);
        }
    }

    public /* synthetic */ BiometricDisableError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
