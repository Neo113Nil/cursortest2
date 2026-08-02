package com.paypal.oslo.feature.identity.rememberedlogin.ui;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\t\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b"}, d2 = {"Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "ChangeUser", "NavigateToPasswordScreen", "ShowBiometricPrompt", "ShowPasskeyPrompt", "NavigateToAuthMethod", "FallbackToPasswordScreen", "RetryBiometricAuth", "RetryPasskeyAuth", "CallVerifyCredentials", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginUiEffect$CallVerifyCredentials;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginUiEffect$ChangeUser;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginUiEffect$FallbackToPasswordScreen;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginUiEffect$NavigateToAuthMethod;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginUiEffect$NavigateToPasswordScreen;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginUiEffect$RetryBiometricAuth;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginUiEffect$RetryPasskeyAuth;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginUiEffect$ShowBiometricPrompt;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginUiEffect$ShowPasskeyPrompt;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class RememberedLoginUiEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private RememberedLoginUiEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginUiEffect$ChangeUser;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ChangeUser extends com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.ChangeUser INSTANCE = new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.ChangeUser();

        public final int hashCode() {
            return 1842593457;
        }

        private ChangeUser() {
            super("ChangeUser", null);
        }

        public final java.lang.String toString() {
            return "ChangeUser";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.ChangeUser)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001d\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginUiEffect$NavigateToPasswordScreen;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginUiEffect;", "", "publicCredential", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthOptions;", "authOptions", "requestId", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/login/domain/model/AuthOptions;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/identity/login/domain/model/AuthOptions;", "component3", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/login/domain/model/AuthOptions;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginUiEffect$NavigateToPasswordScreen;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPublicCredential", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthOptions;", "getAuthOptions", "getRequestId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToPasswordScreen extends com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.login.domain.model.AuthOptions authOptions;
        private final java.lang.String publicCredential;
        private final java.lang.String requestId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToPasswordScreen(java.lang.String str, com.paypal.oslo.feature.identity.login.domain.model.AuthOptions authOptions, java.lang.String str2) {
            super("NavigateToPasswordScreen", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authOptions, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.publicCredential = str;
            this.authOptions = authOptions;
            this.requestId = str2;
        }

        public final java.lang.String getPublicCredential() {
            return this.publicCredential;
        }

        public final com.paypal.oslo.feature.identity.login.domain.model.AuthOptions getAuthOptions() {
            return this.authOptions;
        }

        public final java.lang.String getRequestId() {
            return this.requestId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.publicCredential;
            com.paypal.oslo.feature.identity.login.domain.model.AuthOptions authOptions = this.authOptions;
            java.lang.String str2 = this.requestId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToPasswordScreen(publicCredential=");
            sb.append(str);
            sb.append(", authOptions=");
            sb.append(authOptions);
            sb.append(", requestId=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.publicCredential.hashCode() * 31) + this.authOptions.hashCode()) * 31) + this.requestId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.NavigateToPasswordScreen)) {
                return false;
            }
            com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.NavigateToPasswordScreen navigateToPasswordScreen = (com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.NavigateToPasswordScreen) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.publicCredential, navigateToPasswordScreen.publicCredential) && kotlin.jvm.internal.Intrinsics.areEqual(this.authOptions, navigateToPasswordScreen.authOptions) && kotlin.jvm.internal.Intrinsics.areEqual(this.requestId, navigateToPasswordScreen.requestId);
        }

        public final com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.NavigateToPasswordScreen copy(java.lang.String publicCredential, com.paypal.oslo.feature.identity.login.domain.model.AuthOptions authOptions, java.lang.String requestId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicCredential, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authOptions, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestId, "");
            return new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.NavigateToPasswordScreen(publicCredential, authOptions, requestId);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getRequestId() {
            return this.requestId;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.identity.login.domain.model.AuthOptions getAuthOptions() {
            return this.authOptions;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPublicCredential() {
            return this.publicCredential;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.NavigateToPasswordScreen copy$default(com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.NavigateToPasswordScreen navigateToPasswordScreen, java.lang.String str, com.paypal.oslo.feature.identity.login.domain.model.AuthOptions authOptions, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToPasswordScreen.publicCredential;
            }
            if ((i & 2) != 0) {
                authOptions = navigateToPasswordScreen.authOptions;
            }
            if ((i & 4) != 0) {
                str2 = navigateToPasswordScreen.requestId;
            }
            return navigateToPasswordScreen.copy(str, authOptions, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginUiEffect$ShowBiometricPrompt;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginUiEffect;", "", "publicCredential", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginUiEffect$ShowBiometricPrompt;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPublicCredential"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowBiometricPrompt extends com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect {
        public static final int $stable = 0;
        private final java.lang.String publicCredential;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowBiometricPrompt(java.lang.String str) {
            super("ShowBiometricPrompt", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.publicCredential = str;
        }

        public final java.lang.String getPublicCredential() {
            return this.publicCredential;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.publicCredential;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowBiometricPrompt(publicCredential=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.publicCredential.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.ShowBiometricPrompt) && kotlin.jvm.internal.Intrinsics.areEqual(this.publicCredential, ((com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.ShowBiometricPrompt) other).publicCredential);
        }

        public final com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.ShowBiometricPrompt copy(java.lang.String publicCredential) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicCredential, "");
            return new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.ShowBiometricPrompt(publicCredential);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPublicCredential() {
            return this.publicCredential;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.ShowBiometricPrompt copy$default(com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.ShowBiometricPrompt showBiometricPrompt, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = showBiometricPrompt.publicCredential;
            }
            return showBiometricPrompt.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginUiEffect$ShowPasskeyPrompt;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginUiEffect;", "", "publicCredential", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginUiEffect$ShowPasskeyPrompt;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPublicCredential"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowPasskeyPrompt extends com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect {
        public static final int $stable = 0;
        private final java.lang.String publicCredential;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowPasskeyPrompt(java.lang.String str) {
            super("ShowPasskeyPrompt", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.publicCredential = str;
        }

        public final java.lang.String getPublicCredential() {
            return this.publicCredential;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.publicCredential;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowPasskeyPrompt(publicCredential=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.publicCredential.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.ShowPasskeyPrompt) && kotlin.jvm.internal.Intrinsics.areEqual(this.publicCredential, ((com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.ShowPasskeyPrompt) other).publicCredential);
        }

        public final com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.ShowPasskeyPrompt copy(java.lang.String publicCredential) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicCredential, "");
            return new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.ShowPasskeyPrompt(publicCredential);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPublicCredential() {
            return this.publicCredential;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.ShowPasskeyPrompt copy$default(com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.ShowPasskeyPrompt showPasskeyPrompt, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = showPasskeyPrompt.publicCredential;
            }
            return showPasskeyPrompt.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ4\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginUiEffect$NavigateToAuthMethod;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginUiEffect;", "", "publicCredential", "displayName", "", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthOptions;", "availableMethods", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginUiEffect$NavigateToAuthMethod;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPublicCredential", "getDisplayName", "Ljava/util/List;", "getAvailableMethods"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToAuthMethod extends com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> availableMethods;
        private final java.lang.String displayName;
        private final java.lang.String publicCredential;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public NavigateToAuthMethod(java.lang.String str, java.lang.String str2, java.util.List<? extends com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> list) {
            super("NavigateToAuthMethod", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.publicCredential = str;
            this.displayName = str2;
            this.availableMethods = list;
        }

        public final java.lang.String getPublicCredential() {
            return this.publicCredential;
        }

        public final java.lang.String getDisplayName() {
            return this.displayName;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> getAvailableMethods() {
            return this.availableMethods;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.publicCredential;
            java.lang.String str2 = this.displayName;
            java.util.List<com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> list = this.availableMethods;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToAuthMethod(publicCredential=");
            sb.append(str);
            sb.append(", displayName=");
            sb.append(str2);
            sb.append(", availableMethods=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.publicCredential.hashCode() * 31) + this.displayName.hashCode()) * 31) + this.availableMethods.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.NavigateToAuthMethod)) {
                return false;
            }
            com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.NavigateToAuthMethod navigateToAuthMethod = (com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.NavigateToAuthMethod) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.publicCredential, navigateToAuthMethod.publicCredential) && kotlin.jvm.internal.Intrinsics.areEqual(this.displayName, navigateToAuthMethod.displayName) && kotlin.jvm.internal.Intrinsics.areEqual(this.availableMethods, navigateToAuthMethod.availableMethods);
        }

        public final com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.NavigateToAuthMethod copy(java.lang.String publicCredential, java.lang.String displayName, java.util.List<? extends com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> availableMethods) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicCredential, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableMethods, "");
            return new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.NavigateToAuthMethod(publicCredential, displayName, availableMethods);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> component3() {
            return this.availableMethods;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getDisplayName() {
            return this.displayName;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPublicCredential() {
            return this.publicCredential;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.NavigateToAuthMethod copy$default(com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.NavigateToAuthMethod navigateToAuthMethod, java.lang.String str, java.lang.String str2, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToAuthMethod.publicCredential;
            }
            if ((i & 2) != 0) {
                str2 = navigateToAuthMethod.displayName;
            }
            if ((i & 4) != 0) {
                list = navigateToAuthMethod.availableMethods;
            }
            return navigateToAuthMethod.copy(str, str2, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginUiEffect$FallbackToPasswordScreen;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginUiEffect;", "", "publicCredential", "displayName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginUiEffect$FallbackToPasswordScreen;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPublicCredential", "getDisplayName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FallbackToPasswordScreen extends com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect {
        public static final int $stable = 0;
        private final java.lang.String displayName;
        private final java.lang.String publicCredential;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FallbackToPasswordScreen(java.lang.String str, java.lang.String str2) {
            super("FallbackToPasswordScreen", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.publicCredential = str;
            this.displayName = str2;
        }

        public final java.lang.String getPublicCredential() {
            return this.publicCredential;
        }

        public final java.lang.String getDisplayName() {
            return this.displayName;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.publicCredential;
            java.lang.String str2 = this.displayName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FallbackToPasswordScreen(publicCredential=");
            sb.append(str);
            sb.append(", displayName=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.publicCredential.hashCode() * 31) + this.displayName.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.FallbackToPasswordScreen)) {
                return false;
            }
            com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.FallbackToPasswordScreen fallbackToPasswordScreen = (com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.FallbackToPasswordScreen) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.publicCredential, fallbackToPasswordScreen.publicCredential) && kotlin.jvm.internal.Intrinsics.areEqual(this.displayName, fallbackToPasswordScreen.displayName);
        }

        public final com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.FallbackToPasswordScreen copy(java.lang.String publicCredential, java.lang.String displayName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicCredential, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayName, "");
            return new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.FallbackToPasswordScreen(publicCredential, displayName);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getDisplayName() {
            return this.displayName;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPublicCredential() {
            return this.publicCredential;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.FallbackToPasswordScreen copy$default(com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.FallbackToPasswordScreen fallbackToPasswordScreen, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = fallbackToPasswordScreen.publicCredential;
            }
            if ((i & 2) != 0) {
                str2 = fallbackToPasswordScreen.displayName;
            }
            return fallbackToPasswordScreen.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginUiEffect$RetryBiometricAuth;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginUiEffect;", "", "publicCredential", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginUiEffect$RetryBiometricAuth;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPublicCredential"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RetryBiometricAuth extends com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect {
        public static final int $stable = 0;
        private final java.lang.String publicCredential;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RetryBiometricAuth(java.lang.String str) {
            super("RetryBiometricAuth", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.publicCredential = str;
        }

        public final java.lang.String getPublicCredential() {
            return this.publicCredential;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.publicCredential;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RetryBiometricAuth(publicCredential=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.publicCredential.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.RetryBiometricAuth) && kotlin.jvm.internal.Intrinsics.areEqual(this.publicCredential, ((com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.RetryBiometricAuth) other).publicCredential);
        }

        public final com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.RetryBiometricAuth copy(java.lang.String publicCredential) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicCredential, "");
            return new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.RetryBiometricAuth(publicCredential);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPublicCredential() {
            return this.publicCredential;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.RetryBiometricAuth copy$default(com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.RetryBiometricAuth retryBiometricAuth, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = retryBiometricAuth.publicCredential;
            }
            return retryBiometricAuth.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginUiEffect$RetryPasskeyAuth;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginUiEffect;", "", "publicCredential", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginUiEffect$RetryPasskeyAuth;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPublicCredential"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RetryPasskeyAuth extends com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect {
        public static final int $stable = 0;
        private final java.lang.String publicCredential;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RetryPasskeyAuth(java.lang.String str) {
            super("RetryPasskeyAuth", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.publicCredential = str;
        }

        public final java.lang.String getPublicCredential() {
            return this.publicCredential;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.publicCredential;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RetryPasskeyAuth(publicCredential=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.publicCredential.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.RetryPasskeyAuth) && kotlin.jvm.internal.Intrinsics.areEqual(this.publicCredential, ((com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.RetryPasskeyAuth) other).publicCredential);
        }

        public final com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.RetryPasskeyAuth copy(java.lang.String publicCredential) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicCredential, "");
            return new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.RetryPasskeyAuth(publicCredential);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPublicCredential() {
            return this.publicCredential;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.RetryPasskeyAuth copy$default(com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.RetryPasskeyAuth retryPasskeyAuth, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = retryPasskeyAuth.publicCredential;
            }
            return retryPasskeyAuth.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginUiEffect$CallVerifyCredentials;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginUiEffect;", "", "publicCredential", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginUiEffect$CallVerifyCredentials;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPublicCredential"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CallVerifyCredentials extends com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect {
        public static final int $stable = 0;
        private final java.lang.String publicCredential;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CallVerifyCredentials(java.lang.String str) {
            super("CallVerifyCredentials", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.publicCredential = str;
        }

        public final java.lang.String getPublicCredential() {
            return this.publicCredential;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.publicCredential;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CallVerifyCredentials(publicCredential=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.publicCredential.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.CallVerifyCredentials) && kotlin.jvm.internal.Intrinsics.areEqual(this.publicCredential, ((com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.CallVerifyCredentials) other).publicCredential);
        }

        public final com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.CallVerifyCredentials copy(java.lang.String publicCredential) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicCredential, "");
            return new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.CallVerifyCredentials(publicCredential);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPublicCredential() {
            return this.publicCredential;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.CallVerifyCredentials copy$default(com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiEffect.CallVerifyCredentials callVerifyCredentials, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = callVerifyCredentials.publicCredential;
            }
            return callVerifyCredentials.copy(str);
        }
    }

    public /* synthetic */ RememberedLoginUiEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
