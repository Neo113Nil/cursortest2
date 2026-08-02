package com.paypal.oslo.feature.identity.login.domain.model;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/LoginFlowEffect;", "", "<init>", "()V", "NavigateToCredentialEntry", "NavigateToSignUp", "AuthMethodRequired", "LoginSuccess", "PassiveLoginSuccess", "ChallengeRequired", "LoginFailed", com.knotapi.knot.utilities.Constants.META_BACK_BUTTON, com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames.INTENT_CANCEL, "Lcom/paypal/oslo/feature/identity/login/domain/model/LoginFlowEffect$AuthMethodRequired;", "Lcom/paypal/oslo/feature/identity/login/domain/model/LoginFlowEffect$Back;", "Lcom/paypal/oslo/feature/identity/login/domain/model/LoginFlowEffect$Cancel;", "Lcom/paypal/oslo/feature/identity/login/domain/model/LoginFlowEffect$ChallengeRequired;", "Lcom/paypal/oslo/feature/identity/login/domain/model/LoginFlowEffect$LoginFailed;", "Lcom/paypal/oslo/feature/identity/login/domain/model/LoginFlowEffect$LoginSuccess;", "Lcom/paypal/oslo/feature/identity/login/domain/model/LoginFlowEffect$NavigateToCredentialEntry;", "Lcom/paypal/oslo/feature/identity/login/domain/model/LoginFlowEffect$NavigateToSignUp;", "Lcom/paypal/oslo/feature/identity/login/domain/model/LoginFlowEffect$PassiveLoginSuccess;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class LoginFlowEffect {
    public static final int $stable = 0;

    private LoginFlowEffect() {
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/LoginFlowEffect$NavigateToCredentialEntry;", "Lcom/paypal/oslo/feature/identity/login/domain/model/LoginFlowEffect;", "", "requestId", "", "replaceTop", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;", "authIntent", "<init>", "(Ljava/lang/String;ZLcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "()Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;", "copy", "(Ljava/lang/String;ZLcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;)Lcom/paypal/oslo/feature/identity/login/domain/model/LoginFlowEffect$NavigateToCredentialEntry;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getRequestId", "Z", "getReplaceTop", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;", "getAuthIntent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToCredentialEntry extends com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent;
        private final boolean replaceTop;
        private final java.lang.String requestId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToCredentialEntry(java.lang.String str, boolean z, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authIntent, "");
            this.requestId = str;
            this.replaceTop = z;
            this.authIntent = authIntent;
        }

        public final java.lang.String getRequestId() {
            return this.requestId;
        }

        public final boolean getReplaceTop() {
            return this.replaceTop;
        }

        public /* synthetic */ NavigateToCredentialEntry(java.lang.String str, boolean z, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? com.paypal.oslo.feature.identity.login.domain.model.AuthIntent.LOGIN : authIntent);
        }

        public final com.paypal.oslo.feature.identity.login.domain.model.AuthIntent getAuthIntent() {
            return this.authIntent;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.requestId;
            boolean z = this.replaceTop;
            com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent = this.authIntent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToCredentialEntry(requestId=");
            sb.append(str);
            sb.append(", replaceTop=");
            sb.append(z);
            sb.append(", authIntent=");
            sb.append(authIntent);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.requestId.hashCode() * 31) + java.lang.Boolean.hashCode(this.replaceTop)) * 31) + this.authIntent.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.NavigateToCredentialEntry)) {
                return false;
            }
            com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.NavigateToCredentialEntry navigateToCredentialEntry = (com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.NavigateToCredentialEntry) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.requestId, navigateToCredentialEntry.requestId) && this.replaceTop == navigateToCredentialEntry.replaceTop && this.authIntent == navigateToCredentialEntry.authIntent;
        }

        public final com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.NavigateToCredentialEntry copy(java.lang.String requestId, boolean replaceTop, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authIntent, "");
            return new com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.NavigateToCredentialEntry(requestId, replaceTop, authIntent);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.identity.login.domain.model.AuthIntent getAuthIntent() {
            return this.authIntent;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getReplaceTop() {
            return this.replaceTop;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getRequestId() {
            return this.requestId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.NavigateToCredentialEntry copy$default(com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.NavigateToCredentialEntry navigateToCredentialEntry, java.lang.String str, boolean z, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToCredentialEntry.requestId;
            }
            if ((i & 2) != 0) {
                z = navigateToCredentialEntry.replaceTop;
            }
            if ((i & 4) != 0) {
                authIntent = navigateToCredentialEntry.authIntent;
            }
            return navigateToCredentialEntry.copy(str, z, authIntent);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/LoginFlowEffect$NavigateToSignUp;", "Lcom/paypal/oslo/feature/identity/login/domain/model/LoginFlowEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToSignUp extends com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.NavigateToSignUp INSTANCE = new com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.NavigateToSignUp();

        public final int hashCode() {
            return 1924604725;
        }

        private NavigateToSignUp() {
            super(null);
        }

        public final java.lang.String toString() {
            return "NavigateToSignUp";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.NavigateToSignUp)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JT\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\"\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b'\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b(\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010\u0015R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/LoginFlowEffect$AuthMethodRequired;", "Lcom/paypal/oslo/feature/identity/login/domain/model/LoginFlowEffect;", "", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthOptions;", "availableMethods", "", "publicCredential", "displayName", "requestId", "preferredMethod", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;", "authIntent", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/identity/login/domain/model/AuthOptions;Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()Lcom/paypal/oslo/feature/identity/login/domain/model/AuthOptions;", "component6", "()Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/identity/login/domain/model/AuthOptions;Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;)Lcom/paypal/oslo/feature/identity/login/domain/model/LoginFlowEffect$AuthMethodRequired;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/List;", "getAvailableMethods", "Ljava/lang/String;", "getPublicCredential", "getDisplayName", "getRequestId", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthOptions;", "getPreferredMethod", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;", "getAuthIntent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AuthMethodRequired extends com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent;
        private final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> availableMethods;
        private final java.lang.String displayName;
        private final com.paypal.oslo.feature.identity.login.domain.model.AuthOptions preferredMethod;
        private final java.lang.String publicCredential;
        private final java.lang.String requestId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AuthMethodRequired(java.util.List<? extends com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> list, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.identity.login.domain.model.AuthOptions authOptions, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authIntent, "");
            this.availableMethods = list;
            this.publicCredential = str;
            this.displayName = str2;
            this.requestId = str3;
            this.preferredMethod = authOptions;
            this.authIntent = authIntent;
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

        public final com.paypal.oslo.feature.identity.login.domain.model.AuthOptions getPreferredMethod() {
            return this.preferredMethod;
        }

        public /* synthetic */ AuthMethodRequired(java.util.List list, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.identity.login.domain.model.AuthOptions authOptions, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(list, str, str2, str3, (i & 16) != 0 ? null : authOptions, (i & 32) != 0 ? com.paypal.oslo.feature.identity.login.domain.model.AuthIntent.LOGIN : authIntent);
        }

        public final com.paypal.oslo.feature.identity.login.domain.model.AuthIntent getAuthIntent() {
            return this.authIntent;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> list = this.availableMethods;
            java.lang.String str = this.publicCredential;
            java.lang.String str2 = this.displayName;
            java.lang.String str3 = this.requestId;
            com.paypal.oslo.feature.identity.login.domain.model.AuthOptions authOptions = this.preferredMethod;
            com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent = this.authIntent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AuthMethodRequired(availableMethods=");
            sb.append(list);
            sb.append(", publicCredential=");
            sb.append(str);
            sb.append(", displayName=");
            sb.append(str2);
            sb.append(", requestId=");
            sb.append(str3);
            sb.append(", preferredMethod=");
            sb.append(authOptions);
            sb.append(", authIntent=");
            sb.append(authIntent);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.availableMethods.hashCode();
            int hashCode2 = this.publicCredential.hashCode();
            int hashCode3 = this.displayName.hashCode();
            int hashCode4 = this.requestId.hashCode();
            com.paypal.oslo.feature.identity.login.domain.model.AuthOptions authOptions = this.preferredMethod;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (authOptions == null ? 0 : authOptions.hashCode())) * 31) + this.authIntent.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.AuthMethodRequired)) {
                return false;
            }
            com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.AuthMethodRequired authMethodRequired = (com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.AuthMethodRequired) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.availableMethods, authMethodRequired.availableMethods) && kotlin.jvm.internal.Intrinsics.areEqual(this.publicCredential, authMethodRequired.publicCredential) && kotlin.jvm.internal.Intrinsics.areEqual(this.displayName, authMethodRequired.displayName) && kotlin.jvm.internal.Intrinsics.areEqual(this.requestId, authMethodRequired.requestId) && kotlin.jvm.internal.Intrinsics.areEqual(this.preferredMethod, authMethodRequired.preferredMethod) && this.authIntent == authMethodRequired.authIntent;
        }

        public final com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.AuthMethodRequired copy(java.util.List<? extends com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> availableMethods, java.lang.String publicCredential, java.lang.String displayName, java.lang.String requestId, com.paypal.oslo.feature.identity.login.domain.model.AuthOptions preferredMethod, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableMethods, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicCredential, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authIntent, "");
            return new com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.AuthMethodRequired(availableMethods, publicCredential, displayName, requestId, preferredMethod, authIntent);
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.identity.login.domain.model.AuthIntent getAuthIntent() {
            return this.authIntent;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.identity.login.domain.model.AuthOptions getPreferredMethod() {
            return this.preferredMethod;
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

        public static /* synthetic */ com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.AuthMethodRequired copy$default(com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.AuthMethodRequired authMethodRequired, java.util.List list, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.identity.login.domain.model.AuthOptions authOptions, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = authMethodRequired.availableMethods;
            }
            if ((i & 2) != 0) {
                str = authMethodRequired.publicCredential;
            }
            java.lang.String str4 = str;
            if ((i & 4) != 0) {
                str2 = authMethodRequired.displayName;
            }
            java.lang.String str5 = str2;
            if ((i & 8) != 0) {
                str3 = authMethodRequired.requestId;
            }
            java.lang.String str6 = str3;
            if ((i & 16) != 0) {
                authOptions = authMethodRequired.preferredMethod;
            }
            com.paypal.oslo.feature.identity.login.domain.model.AuthOptions authOptions2 = authOptions;
            if ((i & 32) != 0) {
                authIntent = authMethodRequired.authIntent;
            }
            return authMethodRequired.copy(list, str4, str5, str6, authOptions2, authIntent);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J>\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u0012R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/LoginFlowEffect$LoginSuccess;", "Lcom/paypal/oslo/feature/identity/login/domain/model/LoginFlowEffect;", "", "requestId", "Lcom/paypal/oslo/feature/identity/foundation/model/Token;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;", "authIntent", "", "Lcom/paypal/oslo/feature/identity/login/domain/model/PostAuthenticationOperation;", "postAuthOperations", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/foundation/model/Token;Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/identity/foundation/model/Token;", "component3", "()Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/foundation/model/Token;Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;Ljava/util/List;)Lcom/paypal/oslo/feature/identity/login/domain/model/LoginFlowEffect$LoginSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getRequestId", "Lcom/paypal/oslo/feature/identity/foundation/model/Token;", "getToken", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;", "getAuthIntent", "Ljava/util/List;", "getPostAuthOperations"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoginSuccess extends com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent;
        private final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> postAuthOperations;
        private final java.lang.String requestId;
        private final com.paypal.oslo.feature.identity.foundation.model.Token token;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoginSuccess(java.lang.String str, com.paypal.oslo.feature.identity.foundation.model.Token token, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent, java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authIntent, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.requestId = str;
            this.token = token;
            this.authIntent = authIntent;
            this.postAuthOperations = list;
        }

        public final java.lang.String getRequestId() {
            return this.requestId;
        }

        public final com.paypal.oslo.feature.identity.foundation.model.Token getToken() {
            return this.token;
        }

        public /* synthetic */ LoginSuccess(java.lang.String str, com.paypal.oslo.feature.identity.foundation.model.Token token, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, token, (i & 4) != 0 ? com.paypal.oslo.feature.identity.login.domain.model.AuthIntent.LOGIN : authIntent, (i & 8) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
        }

        public final com.paypal.oslo.feature.identity.login.domain.model.AuthIntent getAuthIntent() {
            return this.authIntent;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> getPostAuthOperations() {
            return this.postAuthOperations;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.requestId;
            com.paypal.oslo.feature.identity.foundation.model.Token token = this.token;
            com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent = this.authIntent;
            java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> list = this.postAuthOperations;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LoginSuccess(requestId=");
            sb.append(str);
            sb.append(", token=");
            sb.append(token);
            sb.append(", authIntent=");
            sb.append(authIntent);
            sb.append(", postAuthOperations=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.requestId.hashCode() * 31) + this.token.hashCode()) * 31) + this.authIntent.hashCode()) * 31) + this.postAuthOperations.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.LoginSuccess)) {
                return false;
            }
            com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.LoginSuccess loginSuccess = (com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.LoginSuccess) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.requestId, loginSuccess.requestId) && kotlin.jvm.internal.Intrinsics.areEqual(this.token, loginSuccess.token) && this.authIntent == loginSuccess.authIntent && kotlin.jvm.internal.Intrinsics.areEqual(this.postAuthOperations, loginSuccess.postAuthOperations);
        }

        public final com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.LoginSuccess copy(java.lang.String requestId, com.paypal.oslo.feature.identity.foundation.model.Token token, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent, java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> postAuthOperations) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authIntent, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postAuthOperations, "");
            return new com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.LoginSuccess(requestId, token, authIntent, postAuthOperations);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> component4() {
            return this.postAuthOperations;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.identity.login.domain.model.AuthIntent getAuthIntent() {
            return this.authIntent;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.identity.foundation.model.Token getToken() {
            return this.token;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getRequestId() {
            return this.requestId;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.LoginSuccess copy$default(com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.LoginSuccess loginSuccess, java.lang.String str, com.paypal.oslo.feature.identity.foundation.model.Token token, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = loginSuccess.requestId;
            }
            if ((i & 2) != 0) {
                token = loginSuccess.token;
            }
            if ((i & 4) != 0) {
                authIntent = loginSuccess.authIntent;
            }
            if ((i & 8) != 0) {
                list = loginSuccess.postAuthOperations;
            }
            return loginSuccess.copy(str, token, authIntent, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/LoginFlowEffect$PassiveLoginSuccess;", "Lcom/paypal/oslo/feature/identity/login/domain/model/LoginFlowEffect;", "", "requestId", "Lcom/paypal/oslo/feature/identity/storage/model/UserAccessTokenData;", "userAccessTokenData", "Lcom/paypal/oslo/feature/identity/login/domain/model/PassiveLoginFlowType;", "passiveLoginFlowType", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/storage/model/UserAccessTokenData;Lcom/paypal/oslo/feature/identity/login/domain/model/PassiveLoginFlowType;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/identity/storage/model/UserAccessTokenData;", "component3", "()Lcom/paypal/oslo/feature/identity/login/domain/model/PassiveLoginFlowType;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/storage/model/UserAccessTokenData;Lcom/paypal/oslo/feature/identity/login/domain/model/PassiveLoginFlowType;)Lcom/paypal/oslo/feature/identity/login/domain/model/LoginFlowEffect$PassiveLoginSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getRequestId", "Lcom/paypal/oslo/feature/identity/storage/model/UserAccessTokenData;", "getUserAccessTokenData", "Lcom/paypal/oslo/feature/identity/login/domain/model/PassiveLoginFlowType;", "getPassiveLoginFlowType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PassiveLoginSuccess extends com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.login.domain.model.PassiveLoginFlowType passiveLoginFlowType;
        private final java.lang.String requestId;
        private final com.paypal.oslo.feature.identity.storage.model.UserAccessTokenData userAccessTokenData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PassiveLoginSuccess(java.lang.String str, com.paypal.oslo.feature.identity.storage.model.UserAccessTokenData userAccessTokenData, com.paypal.oslo.feature.identity.login.domain.model.PassiveLoginFlowType passiveLoginFlowType) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAccessTokenData, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passiveLoginFlowType, "");
            this.requestId = str;
            this.userAccessTokenData = userAccessTokenData;
            this.passiveLoginFlowType = passiveLoginFlowType;
        }

        public final java.lang.String getRequestId() {
            return this.requestId;
        }

        public final com.paypal.oslo.feature.identity.storage.model.UserAccessTokenData getUserAccessTokenData() {
            return this.userAccessTokenData;
        }

        public final com.paypal.oslo.feature.identity.login.domain.model.PassiveLoginFlowType getPassiveLoginFlowType() {
            return this.passiveLoginFlowType;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.requestId;
            com.paypal.oslo.feature.identity.storage.model.UserAccessTokenData userAccessTokenData = this.userAccessTokenData;
            com.paypal.oslo.feature.identity.login.domain.model.PassiveLoginFlowType passiveLoginFlowType = this.passiveLoginFlowType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PassiveLoginSuccess(requestId=");
            sb.append(str);
            sb.append(", userAccessTokenData=");
            sb.append(userAccessTokenData);
            sb.append(", passiveLoginFlowType=");
            sb.append(passiveLoginFlowType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.requestId.hashCode() * 31) + this.userAccessTokenData.hashCode()) * 31) + this.passiveLoginFlowType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.PassiveLoginSuccess)) {
                return false;
            }
            com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.PassiveLoginSuccess passiveLoginSuccess = (com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.PassiveLoginSuccess) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.requestId, passiveLoginSuccess.requestId) && kotlin.jvm.internal.Intrinsics.areEqual(this.userAccessTokenData, passiveLoginSuccess.userAccessTokenData) && this.passiveLoginFlowType == passiveLoginSuccess.passiveLoginFlowType;
        }

        public final com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.PassiveLoginSuccess copy(java.lang.String requestId, com.paypal.oslo.feature.identity.storage.model.UserAccessTokenData userAccessTokenData, com.paypal.oslo.feature.identity.login.domain.model.PassiveLoginFlowType passiveLoginFlowType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAccessTokenData, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passiveLoginFlowType, "");
            return new com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.PassiveLoginSuccess(requestId, userAccessTokenData, passiveLoginFlowType);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.identity.login.domain.model.PassiveLoginFlowType getPassiveLoginFlowType() {
            return this.passiveLoginFlowType;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.identity.storage.model.UserAccessTokenData getUserAccessTokenData() {
            return this.userAccessTokenData;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getRequestId() {
            return this.requestId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.PassiveLoginSuccess copy$default(com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.PassiveLoginSuccess passiveLoginSuccess, java.lang.String str, com.paypal.oslo.feature.identity.storage.model.UserAccessTokenData userAccessTokenData, com.paypal.oslo.feature.identity.login.domain.model.PassiveLoginFlowType passiveLoginFlowType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = passiveLoginSuccess.requestId;
            }
            if ((i & 2) != 0) {
                userAccessTokenData = passiveLoginSuccess.userAccessTokenData;
            }
            if ((i & 4) != 0) {
                passiveLoginFlowType = passiveLoginSuccess.passiveLoginFlowType;
            }
            return passiveLoginSuccess.copy(str, userAccessTokenData, passiveLoginFlowType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/LoginFlowEffect$ChallengeRequired;", "Lcom/paypal/oslo/feature/identity/login/domain/model/LoginFlowEffect;", "", "requestId", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeResult;", "challengeResult", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeResult;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeResult;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeResult;)Lcom/paypal/oslo/feature/identity/login/domain/model/LoginFlowEffect$ChallengeRequired;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getRequestId", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeResult;", "getChallengeResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ChallengeRequired extends com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult;
        private final java.lang.String requestId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChallengeRequired(java.lang.String str, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeResult, "");
            this.requestId = str;
            this.challengeResult = challengeResult;
        }

        public final java.lang.String getRequestId() {
            return this.requestId;
        }

        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult getChallengeResult() {
            return this.challengeResult;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.requestId;
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult = this.challengeResult;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ChallengeRequired(requestId=");
            sb.append(str);
            sb.append(", challengeResult=");
            sb.append(challengeResult);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.requestId.hashCode() * 31) + this.challengeResult.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.ChallengeRequired)) {
                return false;
            }
            com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.ChallengeRequired challengeRequired = (com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.ChallengeRequired) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.requestId, challengeRequired.requestId) && kotlin.jvm.internal.Intrinsics.areEqual(this.challengeResult, challengeRequired.challengeResult);
        }

        public final com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.ChallengeRequired copy(java.lang.String requestId, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeResult, "");
            return new com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.ChallengeRequired(requestId, challengeResult);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult getChallengeResult() {
            return this.challengeResult;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getRequestId() {
            return this.requestId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.ChallengeRequired copy$default(com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.ChallengeRequired challengeRequired, java.lang.String str, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = challengeRequired.requestId;
            }
            if ((i & 2) != 0) {
                challengeResult = challengeRequired.challengeResult;
            }
            return challengeRequired.copy(str, challengeResult);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/LoginFlowEffect$LoginFailed;", "Lcom/paypal/oslo/feature/identity/login/domain/model/LoginFlowEffect;", "", "requestId", "error", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/login/domain/model/LoginFlowEffect$LoginFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getRequestId", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoginFailed extends com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect {
        public static final int $stable = 0;
        private final java.lang.String error;
        private final java.lang.String requestId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoginFailed(java.lang.String str, java.lang.String str2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.requestId = str;
            this.error = str2;
        }

        public final java.lang.String getError() {
            return this.error;
        }

        public final java.lang.String getRequestId() {
            return this.requestId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.requestId;
            java.lang.String str2 = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LoginFailed(requestId=");
            sb.append(str);
            sb.append(", error=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.requestId.hashCode() * 31) + this.error.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.LoginFailed)) {
                return false;
            }
            com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.LoginFailed loginFailed = (com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.LoginFailed) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.requestId, loginFailed.requestId) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, loginFailed.error);
        }

        public final com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.LoginFailed copy(java.lang.String requestId, java.lang.String error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.LoginFailed(requestId, error);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getError() {
            return this.error;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getRequestId() {
            return this.requestId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.LoginFailed copy$default(com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.LoginFailed loginFailed, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = loginFailed.requestId;
            }
            if ((i & 2) != 0) {
                str2 = loginFailed.error;
            }
            return loginFailed.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/LoginFlowEffect$Back;", "Lcom/paypal/oslo/feature/identity/login/domain/model/LoginFlowEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Back extends com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.Back INSTANCE = new com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.Back();

        public final int hashCode() {
            return 1879978360;
        }

        private Back() {
            super(null);
        }

        public final java.lang.String toString() {
            return com.knotapi.knot.utilities.Constants.META_BACK_BUTTON;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.Back)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/LoginFlowEffect$Cancel;", "Lcom/paypal/oslo/feature/identity/login/domain/model/LoginFlowEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Cancel extends com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.Cancel INSTANCE = new com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.Cancel();

        public final int hashCode() {
            return -1493075253;
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
            if (!(other instanceof com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.Cancel)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ LoginFlowEffect(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
