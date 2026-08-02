package com.paypal.oslo.feature.identity.logincontroller.ui;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "NativeAuthInitialized", "NativeAuthCompleted", "NativePassiveAuthSuccessfullyCompleted", "InContextAuthOptionsPrefetched", "Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateEvent$InContextAuthOptionsPrefetched;", "Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateEvent$NativeAuthCompleted;", "Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateEvent$NativeAuthInitialized;", "Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateEvent$NativePassiveAuthSuccessfullyCompleted;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class AuthenticateEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private AuthenticateEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u0006\u0010\fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateEvent$NativeAuthInitialized;", "Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateEvent;", "", "hasRememberedUser", "", "requestId", "isLinkAccountIntent", "Lcom/paypal/oslo/core/identity/domain/model/AuthenticationContext;", "authenticationContext", "<init>", "(ZLjava/lang/String;ZLcom/paypal/oslo/core/identity/domain/model/AuthenticationContext;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/paypal/oslo/core/identity/domain/model/AuthenticationContext;", "copy", "(ZLjava/lang/String;ZLcom/paypal/oslo/core/identity/domain/model/AuthenticationContext;)Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateEvent$NativeAuthInitialized;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Z", "getHasRememberedUser", "Ljava/lang/String;", "getRequestId", "Lcom/paypal/oslo/core/identity/domain/model/AuthenticationContext;", "getAuthenticationContext"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NativeAuthInitialized extends com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.core.identity.domain.model.AuthenticationContext authenticationContext;
        private final boolean hasRememberedUser;
        private final boolean isLinkAccountIntent;
        private final java.lang.String requestId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NativeAuthInitialized(boolean z, java.lang.String str, boolean z2, com.paypal.oslo.core.identity.domain.model.AuthenticationContext authenticationContext) {
            super("NativeAuthInitialized", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationContext, "");
            this.hasRememberedUser = z;
            this.requestId = str;
            this.isLinkAccountIntent = z2;
            this.authenticationContext = authenticationContext;
        }

        public final boolean getHasRememberedUser() {
            return this.hasRememberedUser;
        }

        public final java.lang.String getRequestId() {
            return this.requestId;
        }

        public final boolean isLinkAccountIntent() {
            return this.isLinkAccountIntent;
        }

        public final com.paypal.oslo.core.identity.domain.model.AuthenticationContext getAuthenticationContext() {
            return this.authenticationContext;
        }

        public final java.lang.String toString() {
            boolean z = this.hasRememberedUser;
            java.lang.String str = this.requestId;
            boolean z2 = this.isLinkAccountIntent;
            com.paypal.oslo.core.identity.domain.model.AuthenticationContext authenticationContext = this.authenticationContext;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NativeAuthInitialized(hasRememberedUser=");
            sb.append(z);
            sb.append(", requestId=");
            sb.append(str);
            sb.append(", isLinkAccountIntent=");
            sb.append(z2);
            sb.append(", authenticationContext=");
            sb.append(authenticationContext);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((java.lang.Boolean.hashCode(this.hasRememberedUser) * 31) + this.requestId.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isLinkAccountIntent)) * 31) + this.authenticationContext.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent.NativeAuthInitialized)) {
                return false;
            }
            com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent.NativeAuthInitialized nativeAuthInitialized = (com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent.NativeAuthInitialized) other;
            return this.hasRememberedUser == nativeAuthInitialized.hasRememberedUser && kotlin.jvm.internal.Intrinsics.areEqual(this.requestId, nativeAuthInitialized.requestId) && this.isLinkAccountIntent == nativeAuthInitialized.isLinkAccountIntent && kotlin.jvm.internal.Intrinsics.areEqual(this.authenticationContext, nativeAuthInitialized.authenticationContext);
        }

        public final com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent.NativeAuthInitialized copy(boolean hasRememberedUser, java.lang.String requestId, boolean isLinkAccountIntent, com.paypal.oslo.core.identity.domain.model.AuthenticationContext authenticationContext) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationContext, "");
            return new com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent.NativeAuthInitialized(hasRememberedUser, requestId, isLinkAccountIntent, authenticationContext);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.core.identity.domain.model.AuthenticationContext getAuthenticationContext() {
            return this.authenticationContext;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsLinkAccountIntent() {
            return this.isLinkAccountIntent;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getRequestId() {
            return this.requestId;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getHasRememberedUser() {
            return this.hasRememberedUser;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent.NativeAuthInitialized copy$default(com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent.NativeAuthInitialized nativeAuthInitialized, boolean z, java.lang.String str, boolean z2, com.paypal.oslo.core.identity.domain.model.AuthenticationContext authenticationContext, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = nativeAuthInitialized.hasRememberedUser;
            }
            if ((i & 2) != 0) {
                str = nativeAuthInitialized.requestId;
            }
            if ((i & 4) != 0) {
                z2 = nativeAuthInitialized.isLinkAccountIntent;
            }
            if ((i & 8) != 0) {
                authenticationContext = nativeAuthInitialized.authenticationContext;
            }
            return nativeAuthInitialized.copy(z, str, z2, authenticationContext);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ2\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateEvent$NativeAuthCompleted;", "Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateEvent;", "", "success", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "errorMessage", "<init>", "(ZLjava/lang/String;Ljava/lang/String;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "copy", "(ZLjava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateEvent$NativeAuthCompleted;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Z", "getSuccess", "Ljava/lang/String;", "getToken", "getErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NativeAuthCompleted extends com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent {
        public static final int $stable = 0;
        private final java.lang.String errorMessage;
        private final boolean success;
        private final java.lang.String token;

        public NativeAuthCompleted(boolean z, java.lang.String str, java.lang.String str2) {
            super("NativeAuthCompleted", null);
            this.success = z;
            this.token = str;
            this.errorMessage = str2;
        }

        public /* synthetic */ NativeAuthCompleted(boolean z, java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
        }

        public final boolean getSuccess() {
            return this.success;
        }

        public final java.lang.String getToken() {
            return this.token;
        }

        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public final java.lang.String toString() {
            boolean z = this.success;
            java.lang.String str = this.token;
            java.lang.String str2 = this.errorMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NativeAuthCompleted(success=");
            sb.append(z);
            sb.append(", token=");
            sb.append(str);
            sb.append(", errorMessage=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Boolean.hashCode(this.success);
            java.lang.String str = this.token;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.errorMessage;
            return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent.NativeAuthCompleted)) {
                return false;
            }
            com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent.NativeAuthCompleted nativeAuthCompleted = (com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent.NativeAuthCompleted) other;
            return this.success == nativeAuthCompleted.success && kotlin.jvm.internal.Intrinsics.areEqual(this.token, nativeAuthCompleted.token) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, nativeAuthCompleted.errorMessage);
        }

        public final com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent.NativeAuthCompleted copy(boolean success, java.lang.String token, java.lang.String errorMessage) {
            return new com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent.NativeAuthCompleted(success, token, errorMessage);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getToken() {
            return this.token;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getSuccess() {
            return this.success;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent.NativeAuthCompleted copy$default(com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent.NativeAuthCompleted nativeAuthCompleted, boolean z, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = nativeAuthCompleted.success;
            }
            if ((i & 2) != 0) {
                str = nativeAuthCompleted.token;
            }
            if ((i & 4) != 0) {
                str2 = nativeAuthCompleted.errorMessage;
            }
            return nativeAuthCompleted.copy(z, str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateEvent$NativePassiveAuthSuccessfullyCompleted;", "Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateEvent;", "Lcom/paypal/oslo/feature/identity/login/domain/model/PassiveLoginFlowType;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "<init>", "(Lcom/paypal/oslo/feature/identity/login/domain/model/PassiveLoginFlowType;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/identity/login/domain/model/PassiveLoginFlowType;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/identity/login/domain/model/PassiveLoginFlowType;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateEvent$NativePassiveAuthSuccessfullyCompleted;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/identity/login/domain/model/PassiveLoginFlowType;", "getFlowType", "Ljava/lang/String;", "getToken"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NativePassiveAuthSuccessfullyCompleted extends com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.login.domain.model.PassiveLoginFlowType flowType;
        private final java.lang.String token;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NativePassiveAuthSuccessfullyCompleted(com.paypal.oslo.feature.identity.login.domain.model.PassiveLoginFlowType passiveLoginFlowType, java.lang.String str) {
            super("NativePassiveAuthCompleted", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passiveLoginFlowType, "");
            this.flowType = passiveLoginFlowType;
            this.token = str;
        }

        public /* synthetic */ NativePassiveAuthSuccessfullyCompleted(com.paypal.oslo.feature.identity.login.domain.model.PassiveLoginFlowType passiveLoginFlowType, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(passiveLoginFlowType, (i & 2) != 0 ? null : str);
        }

        public final com.paypal.oslo.feature.identity.login.domain.model.PassiveLoginFlowType getFlowType() {
            return this.flowType;
        }

        public final java.lang.String getToken() {
            return this.token;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.login.domain.model.PassiveLoginFlowType passiveLoginFlowType = this.flowType;
            java.lang.String str = this.token;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NativePassiveAuthSuccessfullyCompleted(flowType=");
            sb.append(passiveLoginFlowType);
            sb.append(", token=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.flowType.hashCode();
            java.lang.String str = this.token;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent.NativePassiveAuthSuccessfullyCompleted)) {
                return false;
            }
            com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent.NativePassiveAuthSuccessfullyCompleted nativePassiveAuthSuccessfullyCompleted = (com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent.NativePassiveAuthSuccessfullyCompleted) other;
            return this.flowType == nativePassiveAuthSuccessfullyCompleted.flowType && kotlin.jvm.internal.Intrinsics.areEqual(this.token, nativePassiveAuthSuccessfullyCompleted.token);
        }

        public final com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent.NativePassiveAuthSuccessfullyCompleted copy(com.paypal.oslo.feature.identity.login.domain.model.PassiveLoginFlowType flowType, java.lang.String token) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowType, "");
            return new com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent.NativePassiveAuthSuccessfullyCompleted(flowType, token);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getToken() {
            return this.token;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.login.domain.model.PassiveLoginFlowType getFlowType() {
            return this.flowType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent.NativePassiveAuthSuccessfullyCompleted copy$default(com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent.NativePassiveAuthSuccessfullyCompleted nativePassiveAuthSuccessfullyCompleted, com.paypal.oslo.feature.identity.login.domain.model.PassiveLoginFlowType passiveLoginFlowType, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                passiveLoginFlowType = nativePassiveAuthSuccessfullyCompleted.flowType;
            }
            if ((i & 2) != 0) {
                str = nativePassiveAuthSuccessfullyCompleted.token;
            }
            return nativePassiveAuthSuccessfullyCompleted.copy(passiveLoginFlowType, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ>\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000eR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b \u0010\u000eR\u001a\u0010\b\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b!\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateEvent$InContextAuthOptionsPrefetched;", "Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateEvent;", "", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthOptions;", "availableMethods", "", "publicCredential", "displayName", "requestId", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/logincontroller/ui/AuthenticateEvent$InContextAuthOptionsPrefetched;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/List;", "getAvailableMethods", "Ljava/lang/String;", "getPublicCredential", "getDisplayName", "getRequestId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InContextAuthOptionsPrefetched extends com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> availableMethods;
        private final java.lang.String displayName;
        private final java.lang.String publicCredential;
        private final java.lang.String requestId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public InContextAuthOptionsPrefetched(java.util.List<? extends com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> list, java.lang.String str, java.lang.String str2, java.lang.String str3) {
            super("InContextAuthOptionsPrefetched", null);
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InContextAuthOptionsPrefetched(availableMethods=");
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
            if (!(other instanceof com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent.InContextAuthOptionsPrefetched)) {
                return false;
            }
            com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent.InContextAuthOptionsPrefetched inContextAuthOptionsPrefetched = (com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent.InContextAuthOptionsPrefetched) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.availableMethods, inContextAuthOptionsPrefetched.availableMethods) && kotlin.jvm.internal.Intrinsics.areEqual(this.publicCredential, inContextAuthOptionsPrefetched.publicCredential) && kotlin.jvm.internal.Intrinsics.areEqual(this.displayName, inContextAuthOptionsPrefetched.displayName) && kotlin.jvm.internal.Intrinsics.areEqual(this.requestId, inContextAuthOptionsPrefetched.requestId);
        }

        public final com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent.InContextAuthOptionsPrefetched copy(java.util.List<? extends com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> availableMethods, java.lang.String publicCredential, java.lang.String displayName, java.lang.String requestId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableMethods, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicCredential, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestId, "");
            return new com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent.InContextAuthOptionsPrefetched(availableMethods, publicCredential, displayName, requestId);
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
        public static /* synthetic */ com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent.InContextAuthOptionsPrefetched copy$default(com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent.InContextAuthOptionsPrefetched inContextAuthOptionsPrefetched, java.util.List list, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = inContextAuthOptionsPrefetched.availableMethods;
            }
            if ((i & 2) != 0) {
                str = inContextAuthOptionsPrefetched.publicCredential;
            }
            if ((i & 4) != 0) {
                str2 = inContextAuthOptionsPrefetched.displayName;
            }
            if ((i & 8) != 0) {
                str3 = inContextAuthOptionsPrefetched.requestId;
            }
            return inContextAuthOptionsPrefetched.copy(list, str, str2, str3);
        }
    }

    public /* synthetic */ AuthenticateEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
