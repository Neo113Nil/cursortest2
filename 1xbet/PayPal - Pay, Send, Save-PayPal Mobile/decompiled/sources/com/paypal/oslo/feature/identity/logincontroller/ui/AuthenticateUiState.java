package com.paypal.oslo.feature.identity.logincontroller.ui;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "PreparingNativeAuth", "UsingNativeAuth", "AuthenticationSuccess", "AuthenticationCancelled", "Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateUiState$AuthenticationCancelled;", "Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateUiState$AuthenticationSuccess;", "Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateUiState$PreparingNativeAuth;", "Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateUiState$UsingNativeAuth;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class AuthenticateUiState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    private AuthenticateUiState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateUiState$PreparingNativeAuth;", "Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PreparingNativeAuth extends com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState.PreparingNativeAuth INSTANCE = new com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState.PreparingNativeAuth();

        public final int hashCode() {
            return -1628502037;
        }

        private PreparingNativeAuth() {
            super("PreparingNativeAuth", null);
        }

        public final java.lang.String toString() {
            return "PreparingNativeAuth";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState.PreparingNativeAuth)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateUiState$UsingNativeAuth;", "Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateUiState;", "", "requestId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateUiState$UsingNativeAuth;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getRequestId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UsingNativeAuth extends com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState {
        public static final int $stable = 0;
        private final java.lang.String requestId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UsingNativeAuth(java.lang.String str) {
            super("UsingNativeAuth", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.requestId = str;
        }

        public final java.lang.String getRequestId() {
            return this.requestId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.requestId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UsingNativeAuth(requestId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.requestId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState.UsingNativeAuth) && kotlin.jvm.internal.Intrinsics.areEqual(this.requestId, ((com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState.UsingNativeAuth) other).requestId);
        }

        public final com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState.UsingNativeAuth copy(java.lang.String requestId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestId, "");
            return new com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState.UsingNativeAuth(requestId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getRequestId() {
            return this.requestId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState.UsingNativeAuth copy$default(com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState.UsingNativeAuth usingNativeAuth, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = usingNativeAuth.requestId;
            }
            return usingNativeAuth.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateUiState$AuthenticationSuccess;", "Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AuthenticationSuccess extends com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState.AuthenticationSuccess INSTANCE = new com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState.AuthenticationSuccess();

        public final int hashCode() {
            return -248683821;
        }

        private AuthenticationSuccess() {
            super("AuthenticationSuccess", null);
        }

        public final java.lang.String toString() {
            return "AuthenticationSuccess";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState.AuthenticationSuccess)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateUiState$AuthenticationCancelled;", "Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AuthenticationCancelled extends com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState.AuthenticationCancelled INSTANCE = new com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState.AuthenticationCancelled();

        public final int hashCode() {
            return 1063442465;
        }

        private AuthenticationCancelled() {
            super("AuthenticationCancelled", null);
        }

        public final java.lang.String toString() {
            return "AuthenticationCancelled";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiState.AuthenticationCancelled)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ AuthenticateUiState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
