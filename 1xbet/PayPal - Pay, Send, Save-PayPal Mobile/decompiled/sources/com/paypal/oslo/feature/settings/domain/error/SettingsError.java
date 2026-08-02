package com.paypal.oslo.feature.settings.domain.error;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r"}, d2 = {"Lcom/paypal/oslo/feature/settings/domain/error/SettingsError;", "", "<init>", "()V", "GenericError", "LogoutError", "UserStoreError", "BiometricError", "LLSError", "Lcom/paypal/oslo/feature/settings/domain/error/SettingsError$BiometricError;", "Lcom/paypal/oslo/feature/settings/domain/error/SettingsError$GenericError;", "Lcom/paypal/oslo/feature/settings/domain/error/SettingsError$LLSError;", "Lcom/paypal/oslo/feature/settings/domain/error/SettingsError$LogoutError;", "Lcom/paypal/oslo/feature/settings/domain/error/SettingsError$UserStoreError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class SettingsError {
    public static final int $stable = 0;

    private SettingsError() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/settings/domain/error/SettingsError$GenericError;", "Lcom/paypal/oslo/feature/settings/domain/error/SettingsError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class GenericError extends com.paypal.oslo.feature.settings.domain.error.SettingsError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.settings.domain.error.SettingsError.GenericError INSTANCE = new com.paypal.oslo.feature.settings.domain.error.SettingsError.GenericError();

        public final int hashCode() {
            return 800578384;
        }

        private GenericError() {
            super(null);
        }

        public final java.lang.String toString() {
            return "GenericError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.settings.domain.error.SettingsError.GenericError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/settings/domain/error/SettingsError$LogoutError;", "Lcom/paypal/oslo/feature/settings/domain/error/SettingsError;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/settings/domain/error/SettingsError$LogoutError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LogoutError extends com.paypal.oslo.feature.settings.domain.error.SettingsError {
        public static final int $stable = 0;
        private final java.lang.String message;

        public LogoutError(java.lang.String str) {
            super(null);
            this.message = str;
        }

        public /* synthetic */ LogoutError(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LogoutError(message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.message;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.settings.domain.error.SettingsError.LogoutError) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.settings.domain.error.SettingsError.LogoutError) other).message);
        }

        public final com.paypal.oslo.feature.settings.domain.error.SettingsError.LogoutError copy(java.lang.String message) {
            return new com.paypal.oslo.feature.settings.domain.error.SettingsError.LogoutError(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.settings.domain.error.SettingsError.LogoutError copy$default(com.paypal.oslo.feature.settings.domain.error.SettingsError.LogoutError logoutError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = logoutError.message;
            }
            return logoutError.copy(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public LogoutError() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/settings/domain/error/SettingsError$UserStoreError;", "Lcom/paypal/oslo/feature/settings/domain/error/SettingsError;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/settings/domain/error/SettingsError$UserStoreError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Throwable;", "getCause"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UserStoreError extends com.paypal.oslo.feature.settings.domain.error.SettingsError {
        public static final int $stable = 8;
        private final java.lang.Throwable cause;

        public UserStoreError(java.lang.Throwable th) {
            super(null);
            this.cause = th;
        }

        public /* synthetic */ UserStoreError(java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : th);
        }

        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public final java.lang.String toString() {
            java.lang.Throwable th = this.cause;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UserStoreError(cause=");
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
            return (other instanceof com.paypal.oslo.feature.settings.domain.error.SettingsError.UserStoreError) && kotlin.jvm.internal.Intrinsics.areEqual(this.cause, ((com.paypal.oslo.feature.settings.domain.error.SettingsError.UserStoreError) other).cause);
        }

        public final com.paypal.oslo.feature.settings.domain.error.SettingsError.UserStoreError copy(java.lang.Throwable cause) {
            return new com.paypal.oslo.feature.settings.domain.error.SettingsError.UserStoreError(cause);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public static /* synthetic */ com.paypal.oslo.feature.settings.domain.error.SettingsError.UserStoreError copy$default(com.paypal.oslo.feature.settings.domain.error.SettingsError.UserStoreError userStoreError, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                th = userStoreError.cause;
            }
            return userStoreError.copy(th);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public UserStoreError() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/settings/domain/error/SettingsError$BiometricError;", "Lcom/paypal/oslo/feature/settings/domain/error/SettingsError;", "Lcom/paypal/oslo/feature/identity/api/model/IdentityManagementError;", "error", "<init>", "(Lcom/paypal/oslo/feature/identity/api/model/IdentityManagementError;)V", "component1", "()Lcom/paypal/oslo/feature/identity/api/model/IdentityManagementError;", "copy", "(Lcom/paypal/oslo/feature/identity/api/model/IdentityManagementError;)Lcom/paypal/oslo/feature/settings/domain/error/SettingsError$BiometricError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/api/model/IdentityManagementError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BiometricError extends com.paypal.oslo.feature.settings.domain.error.SettingsError {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.api.model.IdentityManagementError error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BiometricError(com.paypal.oslo.feature.identity.api.model.IdentityManagementError identityManagementError) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identityManagementError, "");
            this.error = identityManagementError;
        }

        public final com.paypal.oslo.feature.identity.api.model.IdentityManagementError getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.api.model.IdentityManagementError identityManagementError = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BiometricError(error=");
            sb.append(identityManagementError);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.error.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.settings.domain.error.SettingsError.BiometricError) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.settings.domain.error.SettingsError.BiometricError) other).error);
        }

        public final com.paypal.oslo.feature.settings.domain.error.SettingsError.BiometricError copy(com.paypal.oslo.feature.identity.api.model.IdentityManagementError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.settings.domain.error.SettingsError.BiometricError(error);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.api.model.IdentityManagementError getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.settings.domain.error.SettingsError.BiometricError copy$default(com.paypal.oslo.feature.settings.domain.error.SettingsError.BiometricError biometricError, com.paypal.oslo.feature.identity.api.model.IdentityManagementError identityManagementError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                identityManagementError = biometricError.error;
            }
            return biometricError.copy(identityManagementError);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/settings/domain/error/SettingsError$LLSError;", "Lcom/paypal/oslo/feature/settings/domain/error/SettingsError;", "Lcom/paypal/oslo/feature/identity/api/model/IdentityManagementError;", "error", "<init>", "(Lcom/paypal/oslo/feature/identity/api/model/IdentityManagementError;)V", "component1", "()Lcom/paypal/oslo/feature/identity/api/model/IdentityManagementError;", "copy", "(Lcom/paypal/oslo/feature/identity/api/model/IdentityManagementError;)Lcom/paypal/oslo/feature/settings/domain/error/SettingsError$LLSError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/api/model/IdentityManagementError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LLSError extends com.paypal.oslo.feature.settings.domain.error.SettingsError {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.api.model.IdentityManagementError error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LLSError(com.paypal.oslo.feature.identity.api.model.IdentityManagementError identityManagementError) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identityManagementError, "");
            this.error = identityManagementError;
        }

        public final com.paypal.oslo.feature.identity.api.model.IdentityManagementError getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.api.model.IdentityManagementError identityManagementError = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LLSError(error=");
            sb.append(identityManagementError);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.error.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.settings.domain.error.SettingsError.LLSError) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.settings.domain.error.SettingsError.LLSError) other).error);
        }

        public final com.paypal.oslo.feature.settings.domain.error.SettingsError.LLSError copy(com.paypal.oslo.feature.identity.api.model.IdentityManagementError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.settings.domain.error.SettingsError.LLSError(error);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.api.model.IdentityManagementError getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.settings.domain.error.SettingsError.LLSError copy$default(com.paypal.oslo.feature.settings.domain.error.SettingsError.LLSError lLSError, com.paypal.oslo.feature.identity.api.model.IdentityManagementError identityManagementError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                identityManagementError = lLSError.error;
            }
            return lLSError.copy(identityManagementError);
        }
    }

    public /* synthetic */ SettingsError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
