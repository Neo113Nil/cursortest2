package com.paypal.oslo.feature.identity.logincontroller.ui;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0006\n\u000b\f\r\u000e\u000fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0006\u0010\u0011\u0012\u0013\u0014\u0015"}, d2 = {"Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "NavigateToUserVerification", "NavigateToRememberedLogin", "TriggerAuthSuccess", "TriggerAuthCancelled", "TriggerPassiveAuthSuccess", "NavigateDirectlyToAuthMethod", "Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateUiEffect$NavigateDirectlyToAuthMethod;", "Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateUiEffect$NavigateToRememberedLogin;", "Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateUiEffect$NavigateToUserVerification;", "Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateUiEffect$TriggerAuthCancelled;", "Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateUiEffect$TriggerAuthSuccess;", "Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateUiEffect$TriggerPassiveAuthSuccess;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class AuthenticateUiEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private AuthenticateUiEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateUiEffect$NavigateToUserVerification;", "Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateUiEffect;", "", "requestId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateUiEffect$NavigateToUserVerification;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getRequestId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToUserVerification extends com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect {
        public static final int $stable = 0;
        private final java.lang.String requestId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToUserVerification(java.lang.String str) {
            super("NavigateToUserVerification", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.requestId = str;
        }

        public final java.lang.String getRequestId() {
            return this.requestId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.requestId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToUserVerification(requestId=");
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
            return (other instanceof com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect.NavigateToUserVerification) && kotlin.jvm.internal.Intrinsics.areEqual(this.requestId, ((com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect.NavigateToUserVerification) other).requestId);
        }

        public final com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect.NavigateToUserVerification copy(java.lang.String requestId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestId, "");
            return new com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect.NavigateToUserVerification(requestId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getRequestId() {
            return this.requestId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect.NavigateToUserVerification copy$default(com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect.NavigateToUserVerification navigateToUserVerification, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToUserVerification.requestId;
            }
            return navigateToUserVerification.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateUiEffect$NavigateToRememberedLogin;", "Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateUiEffect;", "", "requestId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateUiEffect$NavigateToRememberedLogin;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getRequestId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToRememberedLogin extends com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect {
        public static final int $stable = 0;
        private final java.lang.String requestId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToRememberedLogin(java.lang.String str) {
            super("NavigateToRememberedLogin", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.requestId = str;
        }

        public final java.lang.String getRequestId() {
            return this.requestId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.requestId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToRememberedLogin(requestId=");
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
            return (other instanceof com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect.NavigateToRememberedLogin) && kotlin.jvm.internal.Intrinsics.areEqual(this.requestId, ((com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect.NavigateToRememberedLogin) other).requestId);
        }

        public final com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect.NavigateToRememberedLogin copy(java.lang.String requestId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestId, "");
            return new com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect.NavigateToRememberedLogin(requestId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getRequestId() {
            return this.requestId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect.NavigateToRememberedLogin copy$default(com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect.NavigateToRememberedLogin navigateToRememberedLogin, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToRememberedLogin.requestId;
            }
            return navigateToRememberedLogin.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateUiEffect$TriggerAuthSuccess;", "Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateUiEffect;", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateUiEffect$TriggerAuthSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getToken"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TriggerAuthSuccess extends com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect {
        public static final int $stable = 0;
        private final java.lang.String token;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TriggerAuthSuccess(java.lang.String str) {
            super("TriggerAuthSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.token = str;
        }

        public final java.lang.String getToken() {
            return this.token;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.token;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TriggerAuthSuccess(token=");
            sb.append(str);
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
            return (other instanceof com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect.TriggerAuthSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.token, ((com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect.TriggerAuthSuccess) other).token);
        }

        public final com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect.TriggerAuthSuccess copy(java.lang.String token) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "");
            return new com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect.TriggerAuthSuccess(token);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getToken() {
            return this.token;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect.TriggerAuthSuccess copy$default(com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect.TriggerAuthSuccess triggerAuthSuccess, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = triggerAuthSuccess.token;
            }
            return triggerAuthSuccess.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateUiEffect$TriggerAuthCancelled;", "Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TriggerAuthCancelled extends com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect.TriggerAuthCancelled INSTANCE = new com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect.TriggerAuthCancelled();

        public final int hashCode() {
            return -421440461;
        }

        private TriggerAuthCancelled() {
            super("TriggerAuthCancelled", null);
        }

        public final java.lang.String toString() {
            return "TriggerAuthCancelled";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect.TriggerAuthCancelled)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateUiEffect$TriggerPassiveAuthSuccess;", "Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateUiEffect;", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateUiEffect$TriggerPassiveAuthSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getToken"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TriggerPassiveAuthSuccess extends com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect {
        public static final int $stable = 0;
        private final java.lang.String token;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TriggerPassiveAuthSuccess(java.lang.String str) {
            super("TriggerPassiveAuthSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.token = str;
        }

        public final java.lang.String getToken() {
            return this.token;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.token;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TriggerPassiveAuthSuccess(token=");
            sb.append(str);
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
            return (other instanceof com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect.TriggerPassiveAuthSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.token, ((com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect.TriggerPassiveAuthSuccess) other).token);
        }

        public final com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect.TriggerPassiveAuthSuccess copy(java.lang.String token) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "");
            return new com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect.TriggerPassiveAuthSuccess(token);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getToken() {
            return this.token;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect.TriggerPassiveAuthSuccess copy$default(com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect.TriggerPassiveAuthSuccess triggerPassiveAuthSuccess, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = triggerPassiveAuthSuccess.token;
            }
            return triggerPassiveAuthSuccess.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ>\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000eR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b \u0010\u000eR\u001a\u0010\b\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b!\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateUiEffect$NavigateDirectlyToAuthMethod;", "Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateUiEffect;", "", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthOptions;", "availableMethods", "", "publicCredential", "displayName", "requestId", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateUiEffect$NavigateDirectlyToAuthMethod;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/List;", "getAvailableMethods", "Ljava/lang/String;", "getPublicCredential", "getDisplayName", "getRequestId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateDirectlyToAuthMethod extends com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> availableMethods;
        private final java.lang.String displayName;
        private final java.lang.String publicCredential;
        private final java.lang.String requestId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public NavigateDirectlyToAuthMethod(java.util.List<? extends com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> list, java.lang.String str, java.lang.String str2, java.lang.String str3) {
            super("NavigateDirectlyToAuthMethod", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.availableMethods = list;
            this.publicCredential = str;
            this.displayName = str2;
            this.requestId = str3;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> getAvailableMethods() {
            return this.availableMethods;
        }

        public final java.lang.String getPublicCredential() {
            return this.publicCredential;
        }

        public final java.lang.String getDisplayName() {
            return this.displayName;
        }

        public final java.lang.String getRequestId() {
            return this.requestId;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> list = this.availableMethods;
            java.lang.String str = this.publicCredential;
            java.lang.String str2 = this.displayName;
            java.lang.String str3 = this.requestId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateDirectlyToAuthMethod(availableMethods=");
            sb.append(list);
            sb.append(", publicCredential=");
            sb.append(str);
            sb.append(", displayName=");
            sb.append(str2);
            sb.append(", requestId=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.availableMethods.hashCode() * 31) + this.publicCredential.hashCode()) * 31) + this.displayName.hashCode()) * 31) + this.requestId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect.NavigateDirectlyToAuthMethod)) {
                return false;
            }
            com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect.NavigateDirectlyToAuthMethod navigateDirectlyToAuthMethod = (com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect.NavigateDirectlyToAuthMethod) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.availableMethods, navigateDirectlyToAuthMethod.availableMethods) && kotlin.jvm.internal.Intrinsics.areEqual(this.publicCredential, navigateDirectlyToAuthMethod.publicCredential) && kotlin.jvm.internal.Intrinsics.areEqual(this.displayName, navigateDirectlyToAuthMethod.displayName) && kotlin.jvm.internal.Intrinsics.areEqual(this.requestId, navigateDirectlyToAuthMethod.requestId);
        }

        public final com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect.NavigateDirectlyToAuthMethod copy(java.util.List<? extends com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> availableMethods, java.lang.String publicCredential, java.lang.String displayName, java.lang.String requestId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableMethods, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicCredential, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestId, "");
            return new com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect.NavigateDirectlyToAuthMethod(availableMethods, publicCredential, displayName, requestId);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getRequestId() {
            return this.requestId;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getDisplayName() {
            return this.displayName;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getPublicCredential() {
            return this.publicCredential;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> component1() {
            return this.availableMethods;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect.NavigateDirectlyToAuthMethod copy$default(com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateUiEffect.NavigateDirectlyToAuthMethod navigateDirectlyToAuthMethod, java.util.List list, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = navigateDirectlyToAuthMethod.availableMethods;
            }
            if ((i & 2) != 0) {
                str = navigateDirectlyToAuthMethod.publicCredential;
            }
            if ((i & 4) != 0) {
                str2 = navigateDirectlyToAuthMethod.displayName;
            }
            if ((i & 8) != 0) {
                str3 = navigateDirectlyToAuthMethod.requestId;
            }
            return navigateDirectlyToAuthMethod.copy(list, str, str2, str3);
        }
    }

    public /* synthetic */ AuthenticateUiEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
