package com.paypal.oslo.feature.identity.biometriclogin.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/biometriclogin/domain/usecase/BiometricLoginState;", "", "AuthenticatingBiometric", "VerifyingWithServer", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.COMPLETE, "Failed", "Lcom/paypal/oslo/feature/identity/biometriclogin/domain/usecase/BiometricLoginState$AuthenticatingBiometric;", "Lcom/paypal/oslo/feature/identity/biometriclogin/domain/usecase/BiometricLoginState$Completed;", "Lcom/paypal/oslo/feature/identity/biometriclogin/domain/usecase/BiometricLoginState$Failed;", "Lcom/paypal/oslo/feature/identity/biometriclogin/domain/usecase/BiometricLoginState$VerifyingWithServer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface BiometricLoginState {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/biometriclogin/domain/usecase/BiometricLoginState$AuthenticatingBiometric;", "Lcom/paypal/oslo/feature/identity/biometriclogin/domain/usecase/BiometricLoginState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AuthenticatingBiometric implements com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginState.AuthenticatingBiometric INSTANCE = new com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginState.AuthenticatingBiometric();

        public final int hashCode() {
            return -1767720299;
        }

        private AuthenticatingBiometric() {
        }

        public final java.lang.String toString() {
            return "AuthenticatingBiometric";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginState.AuthenticatingBiometric)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/biometriclogin/domain/usecase/BiometricLoginState$VerifyingWithServer;", "Lcom/paypal/oslo/feature/identity/biometriclogin/domain/usecase/BiometricLoginState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class VerifyingWithServer implements com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginState.VerifyingWithServer INSTANCE = new com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginState.VerifyingWithServer();

        public final int hashCode() {
            return -1475036959;
        }

        private VerifyingWithServer() {
        }

        public final java.lang.String toString() {
            return "VerifyingWithServer";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginState.VerifyingWithServer)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/biometriclogin/domain/usecase/BiometricLoginState$Completed;", "Lcom/paypal/oslo/feature/identity/biometriclogin/domain/usecase/BiometricLoginState;", "Lcom/paypal/oslo/feature/identity/login/domain/model/LoginResult;", "result", "<init>", "(Lcom/paypal/oslo/feature/identity/login/domain/model/LoginResult;)V", "component1", "()Lcom/paypal/oslo/feature/identity/login/domain/model/LoginResult;", "copy", "(Lcom/paypal/oslo/feature/identity/login/domain/model/LoginResult;)Lcom/paypal/oslo/feature/identity/biometriclogin/domain/usecase/BiometricLoginState$Completed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/login/domain/model/LoginResult;", "getResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Completed implements com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.login.domain.model.LoginResult result;

        public Completed(com.paypal.oslo.feature.identity.login.domain.model.LoginResult loginResult) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginResult, "");
            this.result = loginResult;
        }

        public final com.paypal.oslo.feature.identity.login.domain.model.LoginResult getResult() {
            return this.result;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.login.domain.model.LoginResult loginResult = this.result;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Completed(result=");
            sb.append(loginResult);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.result.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginState.Completed) && kotlin.jvm.internal.Intrinsics.areEqual(this.result, ((com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginState.Completed) other).result);
        }

        public final com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginState.Completed copy(com.paypal.oslo.feature.identity.login.domain.model.LoginResult result) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
            return new com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginState.Completed(result);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.login.domain.model.LoginResult getResult() {
            return this.result;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginState.Completed copy$default(com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginState.Completed completed, com.paypal.oslo.feature.identity.login.domain.model.LoginResult loginResult, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                loginResult = completed.result;
            }
            return completed.copy(loginResult);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/biometriclogin/domain/usecase/BiometricLoginState$Failed;", "Lcom/paypal/oslo/feature/identity/biometriclogin/domain/usecase/BiometricLoginState;", "Lcom/paypal/oslo/feature/identity/biometriclogin/domain/model/BiometricLoginError;", "error", "<init>", "(Lcom/paypal/oslo/feature/identity/biometriclogin/domain/model/BiometricLoginError;)V", "component1", "()Lcom/paypal/oslo/feature/identity/biometriclogin/domain/model/BiometricLoginError;", "copy", "(Lcom/paypal/oslo/feature/identity/biometriclogin/domain/model/BiometricLoginError;)Lcom/paypal/oslo/feature/identity/biometriclogin/domain/usecase/BiometricLoginState$Failed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/biometriclogin/domain/model/BiometricLoginError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Failed implements com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError error;

        public Failed(com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError biometricLoginError) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(biometricLoginError, "");
            this.error = biometricLoginError;
        }

        public final com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError biometricLoginError = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed(error=");
            sb.append(biometricLoginError);
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
            return (other instanceof com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginState.Failed) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginState.Failed) other).error);
        }

        public final com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginState.Failed copy(com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginState.Failed(error);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginState.Failed copy$default(com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginState.Failed failed, com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError biometricLoginError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                biometricLoginError = failed.error;
            }
            return failed.copy(biometricLoginError);
        }
    }
}
