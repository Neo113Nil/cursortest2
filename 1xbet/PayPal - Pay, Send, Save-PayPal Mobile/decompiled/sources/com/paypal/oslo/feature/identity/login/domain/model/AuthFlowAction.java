package com.paypal.oslo.feature.identity.login.domain.model;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/AuthFlowAction;", "", "<init>", "()V", "StartInteractiveAuth", com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames.INTENT_CANCEL, "Interrupt", "Reset", "BiometricResult", "PasskeyResult", "AuthOptionsResult", "CredentialEntryResult", "PostLoginResult", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthFlowAction$AuthOptionsResult;", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthFlowAction$BiometricResult;", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthFlowAction$Cancel;", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthFlowAction$CredentialEntryResult;", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthFlowAction$Interrupt;", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthFlowAction$PasskeyResult;", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthFlowAction$PostLoginResult;", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthFlowAction$Reset;", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthFlowAction$StartInteractiveAuth;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class AuthFlowAction {
    public static final int $stable = 0;

    private AuthFlowAction() {
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u0005\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/AuthFlowAction$StartInteractiveAuth;", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthFlowAction;", "Lcom/paypal/oslo/core/identity/domain/model/TokenType$UserAccessTokenType;", "tokenType", "", "isInContext", "Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/model/RememberedUser;", "rememberedUser", "<init>", "(Lcom/paypal/oslo/core/identity/domain/model/TokenType$UserAccessTokenType;ZLcom/paypal/oslo/feature/identity/rememberedlogin/domain/model/RememberedUser;)V", "component1", "()Lcom/paypal/oslo/core/identity/domain/model/TokenType$UserAccessTokenType;", "component2", "()Z", "component3", "()Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/model/RememberedUser;", "copy", "(Lcom/paypal/oslo/core/identity/domain/model/TokenType$UserAccessTokenType;ZLcom/paypal/oslo/feature/identity/rememberedlogin/domain/model/RememberedUser;)Lcom/paypal/oslo/feature/identity/login/domain/model/AuthFlowAction$StartInteractiveAuth;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/identity/domain/model/TokenType$UserAccessTokenType;", "getTokenType", "Z", "Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/model/RememberedUser;", "getRememberedUser"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class StartInteractiveAuth extends com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction {
        public static final int $stable = 8;
        private final boolean isInContext;
        private final com.paypal.oslo.feature.identity.rememberedlogin.domain.model.RememberedUser rememberedUser;
        private final com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType tokenType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StartInteractiveAuth(com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType userAccessTokenType, boolean z, com.paypal.oslo.feature.identity.rememberedlogin.domain.model.RememberedUser rememberedUser) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAccessTokenType, "");
            this.tokenType = userAccessTokenType;
            this.isInContext = z;
            this.rememberedUser = rememberedUser;
        }

        public final com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType getTokenType() {
            return this.tokenType;
        }

        public final boolean isInContext() {
            return this.isInContext;
        }

        public final com.paypal.oslo.feature.identity.rememberedlogin.domain.model.RememberedUser getRememberedUser() {
            return this.rememberedUser;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType userAccessTokenType = this.tokenType;
            boolean z = this.isInContext;
            com.paypal.oslo.feature.identity.rememberedlogin.domain.model.RememberedUser rememberedUser = this.rememberedUser;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("StartInteractiveAuth(tokenType=");
            sb.append(userAccessTokenType);
            sb.append(", isInContext=");
            sb.append(z);
            sb.append(", rememberedUser=");
            sb.append(rememberedUser);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.tokenType.hashCode();
            int hashCode2 = java.lang.Boolean.hashCode(this.isInContext);
            com.paypal.oslo.feature.identity.rememberedlogin.domain.model.RememberedUser rememberedUser = this.rememberedUser;
            return (((hashCode * 31) + hashCode2) * 31) + (rememberedUser == null ? 0 : rememberedUser.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.StartInteractiveAuth)) {
                return false;
            }
            com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.StartInteractiveAuth startInteractiveAuth = (com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.StartInteractiveAuth) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.tokenType, startInteractiveAuth.tokenType) && this.isInContext == startInteractiveAuth.isInContext && kotlin.jvm.internal.Intrinsics.areEqual(this.rememberedUser, startInteractiveAuth.rememberedUser);
        }

        public final com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.StartInteractiveAuth copy(com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType tokenType, boolean isInContext, com.paypal.oslo.feature.identity.rememberedlogin.domain.model.RememberedUser rememberedUser) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenType, "");
            return new com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.StartInteractiveAuth(tokenType, isInContext, rememberedUser);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.identity.rememberedlogin.domain.model.RememberedUser getRememberedUser() {
            return this.rememberedUser;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsInContext() {
            return this.isInContext;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType getTokenType() {
            return this.tokenType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.StartInteractiveAuth copy$default(com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.StartInteractiveAuth startInteractiveAuth, com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType userAccessTokenType, boolean z, com.paypal.oslo.feature.identity.rememberedlogin.domain.model.RememberedUser rememberedUser, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                userAccessTokenType = startInteractiveAuth.tokenType;
            }
            if ((i & 2) != 0) {
                z = startInteractiveAuth.isInContext;
            }
            if ((i & 4) != 0) {
                rememberedUser = startInteractiveAuth.rememberedUser;
            }
            return startInteractiveAuth.copy(userAccessTokenType, z, rememberedUser);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/AuthFlowAction$Cancel;", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthFlowAction;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Cancel extends com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.Cancel INSTANCE = new com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.Cancel();

        public final int hashCode() {
            return -1474033551;
        }

        private Cancel() {
            super(null);
        }

        public final java.lang.String toString() {
            return com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames.INTENT_CANCEL;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.Cancel)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/AuthFlowAction$Interrupt;", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthFlowAction;", "Lcom/paypal/oslo/feature/identity/login/domain/model/InterruptReason;", "reason", "<init>", "(Lcom/paypal/oslo/feature/identity/login/domain/model/InterruptReason;)V", "component1", "()Lcom/paypal/oslo/feature/identity/login/domain/model/InterruptReason;", "copy", "(Lcom/paypal/oslo/feature/identity/login/domain/model/InterruptReason;)Lcom/paypal/oslo/feature/identity/login/domain/model/AuthFlowAction$Interrupt;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/login/domain/model/InterruptReason;", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Interrupt extends com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.login.domain.model.InterruptReason reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Interrupt(com.paypal.oslo.feature.identity.login.domain.model.InterruptReason interruptReason) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interruptReason, "");
            this.reason = interruptReason;
        }

        public final com.paypal.oslo.feature.identity.login.domain.model.InterruptReason getReason() {
            return this.reason;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.login.domain.model.InterruptReason interruptReason = this.reason;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Interrupt(reason=");
            sb.append(interruptReason);
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
            return (other instanceof com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.Interrupt) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, ((com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.Interrupt) other).reason);
        }

        public final com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.Interrupt copy(com.paypal.oslo.feature.identity.login.domain.model.InterruptReason reason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
            return new com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.Interrupt(reason);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.login.domain.model.InterruptReason getReason() {
            return this.reason;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.Interrupt copy$default(com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.Interrupt interrupt, com.paypal.oslo.feature.identity.login.domain.model.InterruptReason interruptReason, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                interruptReason = interrupt.reason;
            }
            return interrupt.copy(interruptReason);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/AuthFlowAction$Reset;", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthFlowAction;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Reset extends com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.Reset INSTANCE = new com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.Reset();

        public final int hashCode() {
            return -172119944;
        }

        private Reset() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Reset";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.Reset)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/AuthFlowAction$BiometricResult;", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthFlowAction;", "Lcom/paypal/oslo/feature/identity/login/domain/model/SilentAuthResult;", "result", "<init>", "(Lcom/paypal/oslo/feature/identity/login/domain/model/SilentAuthResult;)V", "component1", "()Lcom/paypal/oslo/feature/identity/login/domain/model/SilentAuthResult;", "copy", "(Lcom/paypal/oslo/feature/identity/login/domain/model/SilentAuthResult;)Lcom/paypal/oslo/feature/identity/login/domain/model/AuthFlowAction$BiometricResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/login/domain/model/SilentAuthResult;", "getResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BiometricResult extends com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BiometricResult(com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult silentAuthResult) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(silentAuthResult, "");
            this.result = silentAuthResult;
        }

        public final com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult getResult() {
            return this.result;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult silentAuthResult = this.result;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BiometricResult(result=");
            sb.append(silentAuthResult);
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
            return (other instanceof com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.BiometricResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.result, ((com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.BiometricResult) other).result);
        }

        public final com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.BiometricResult copy(com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult result) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
            return new com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.BiometricResult(result);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult getResult() {
            return this.result;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.BiometricResult copy$default(com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.BiometricResult biometricResult, com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult silentAuthResult, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                silentAuthResult = biometricResult.result;
            }
            return biometricResult.copy(silentAuthResult);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/AuthFlowAction$PasskeyResult;", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthFlowAction;", "Lcom/paypal/oslo/feature/identity/login/domain/model/SilentAuthResult;", "result", "<init>", "(Lcom/paypal/oslo/feature/identity/login/domain/model/SilentAuthResult;)V", "component1", "()Lcom/paypal/oslo/feature/identity/login/domain/model/SilentAuthResult;", "copy", "(Lcom/paypal/oslo/feature/identity/login/domain/model/SilentAuthResult;)Lcom/paypal/oslo/feature/identity/login/domain/model/AuthFlowAction$PasskeyResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/login/domain/model/SilentAuthResult;", "getResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PasskeyResult extends com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PasskeyResult(com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult silentAuthResult) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(silentAuthResult, "");
            this.result = silentAuthResult;
        }

        public final com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult getResult() {
            return this.result;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult silentAuthResult = this.result;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PasskeyResult(result=");
            sb.append(silentAuthResult);
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
            return (other instanceof com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.PasskeyResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.result, ((com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.PasskeyResult) other).result);
        }

        public final com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.PasskeyResult copy(com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult result) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
            return new com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.PasskeyResult(result);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult getResult() {
            return this.result;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.PasskeyResult copy$default(com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.PasskeyResult passkeyResult, com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult silentAuthResult, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                silentAuthResult = passkeyResult.result;
            }
            return passkeyResult.copy(silentAuthResult);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/AuthFlowAction$AuthOptionsResult;", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthFlowAction;", "", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthOptions;", "options", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/identity/login/domain/model/AuthFlowAction$AuthOptionsResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getOptions"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AuthOptionsResult extends com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AuthOptionsResult(java.util.List<? extends com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.options = list;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> getOptions() {
            return this.options;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> list = this.options;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AuthOptionsResult(options=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.options.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.AuthOptionsResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.options, ((com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.AuthOptionsResult) other).options);
        }

        public final com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.AuthOptionsResult copy(java.util.List<? extends com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> options) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "");
            return new com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.AuthOptionsResult(options);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> component1() {
            return this.options;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.AuthOptionsResult copy$default(com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.AuthOptionsResult authOptionsResult, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = authOptionsResult.options;
            }
            return authOptionsResult.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ&\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/AuthFlowAction$CredentialEntryResult;", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthFlowAction;", "Larrow/core/Either;", "Lcom/paypal/oslo/core/identity/domain/model/TokenError;", "Lcom/paypal/oslo/core/identity/domain/model/Token;", "result", "<init>", "(Larrow/core/Either;)V", "component1", "()Larrow/core/Either;", "copy", "(Larrow/core/Either;)Lcom/paypal/oslo/feature/identity/login/domain/model/AuthFlowAction$CredentialEntryResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Larrow/core/Either;", "getResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CredentialEntryResult extends com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction {
        public static final int $stable = 8;
        private final arrow.core.Either<com.paypal.oslo.core.identity.domain.model.TokenError, com.paypal.oslo.core.identity.domain.model.Token> result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CredentialEntryResult(arrow.core.Either<? extends com.paypal.oslo.core.identity.domain.model.TokenError, ? extends com.paypal.oslo.core.identity.domain.model.Token> either) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(either, "");
            this.result = either;
        }

        public final arrow.core.Either<com.paypal.oslo.core.identity.domain.model.TokenError, com.paypal.oslo.core.identity.domain.model.Token> getResult() {
            return this.result;
        }

        public final java.lang.String toString() {
            arrow.core.Either<com.paypal.oslo.core.identity.domain.model.TokenError, com.paypal.oslo.core.identity.domain.model.Token> either = this.result;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CredentialEntryResult(result=");
            sb.append(either);
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
            return (other instanceof com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.CredentialEntryResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.result, ((com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.CredentialEntryResult) other).result);
        }

        public final com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.CredentialEntryResult copy(arrow.core.Either<? extends com.paypal.oslo.core.identity.domain.model.TokenError, ? extends com.paypal.oslo.core.identity.domain.model.Token> result) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
            return new com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.CredentialEntryResult(result);
        }

        public final arrow.core.Either<com.paypal.oslo.core.identity.domain.model.TokenError, com.paypal.oslo.core.identity.domain.model.Token> component1() {
            return this.result;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.CredentialEntryResult copy$default(com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.CredentialEntryResult credentialEntryResult, arrow.core.Either either, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                either = credentialEntryResult.result;
            }
            return credentialEntryResult.copy(either);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/AuthFlowAction$PostLoginResult;", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthFlowAction;", "Lcom/paypal/oslo/core/identity/domain/model/Token;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "<init>", "(Lcom/paypal/oslo/core/identity/domain/model/Token;)V", "component1", "()Lcom/paypal/oslo/core/identity/domain/model/Token;", "copy", "(Lcom/paypal/oslo/core/identity/domain/model/Token;)Lcom/paypal/oslo/feature/identity/login/domain/model/AuthFlowAction$PostLoginResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/identity/domain/model/Token;", "getToken"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PostLoginResult extends com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction {
        public static final int $stable = 8;
        private final com.paypal.oslo.core.identity.domain.model.Token token;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PostLoginResult(com.paypal.oslo.core.identity.domain.model.Token token) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "");
            this.token = token;
        }

        public final com.paypal.oslo.core.identity.domain.model.Token getToken() {
            return this.token;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.identity.domain.model.Token token = this.token;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PostLoginResult(token=");
            sb.append(token);
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
            return (other instanceof com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.PostLoginResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.token, ((com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.PostLoginResult) other).token);
        }

        public final com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.PostLoginResult copy(com.paypal.oslo.core.identity.domain.model.Token token) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "");
            return new com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.PostLoginResult(token);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.identity.domain.model.Token getToken() {
            return this.token;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.PostLoginResult copy$default(com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.PostLoginResult postLoginResult, com.paypal.oslo.core.identity.domain.model.Token token, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                token = postLoginResult.token;
            }
            return postLoginResult.copy(token);
        }
    }

    public /* synthetic */ AuthFlowAction(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
