package com.paypal.oslo.feature.identity.rememberedlogin.ui;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initial", "UserDataLoaded", "Loading", "Error", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginUiState$Error;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginUiState$Initial;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginUiState$Loading;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginUiState$UserDataLoaded;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class RememberedLoginUiState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    private RememberedLoginUiState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginUiState$Initial;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.Initial INSTANCE = new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.Initial();

        public final int hashCode() {
            return 745741760;
        }

        private Initial() {
            super("Initial", null);
        }

        public final java.lang.String toString() {
            return "Initial";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.Initial)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B£\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\n\u0012\b\b\u0002\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\nHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b#\u0010!J\u0010\u0010$\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b$\u0010!J\u0012\u0010%\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b'\u0010!J\u0010\u0010(\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b*\u0010)J\u0010\u0010+\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b+\u0010!J\u0010\u0010,\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b,\u0010!J°\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u00020\n2\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b3\u0010)J\u0010\u00104\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b4\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00105\u001a\u0004\b7\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b8\u0010\u001aR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b9\u0010\u001aR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010:\u001a\u0004\b;\u0010\u001fR\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010<\u001a\u0004\b\u000b\u0010!R\u001a\u0010\f\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010<\u001a\u0004\b\f\u0010!R\u001a\u0010\r\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010<\u001a\u0004\b=\u0010!R\u001a\u0010\u000e\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010<\u001a\u0004\b>\u0010!R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010?\u001a\u0004\b@\u0010&R\u001a\u0010\u0011\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010<\u001a\u0004\b\u0011\u0010!R\u001a\u0010\u0013\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010A\u001a\u0004\bB\u0010)R\u001a\u0010\u0014\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010A\u001a\u0004\bC\u0010)R\u001a\u0010\u0015\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010<\u001a\u0004\bD\u0010!R\u001a\u0010\u0016\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010<\u001a\u0004\bE\u0010!"}, d2 = {"Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginUiState$UserDataLoaded;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginUiState;", "", "displayName", "publicCredential", "loginCredential", "avatarUrl", "", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthOptions;", "availableAuthOptions", "", "isBiometricPromptShown", "isPasskeyPromptShown", "biometricAutoTriggered", "passkeyAutoTriggered", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/AuthMethod;", "authMethodBeingTriggered", "isVerifyingCredentials", "", "biometricAttemptCount", "passkeyAttemptCount", "biometricManualCancelled", "passkeyManualCancelled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZZZZLcom/paypal/oslo/feature/identity/rememberedlogin/ui/AuthMethod;ZIIZZ)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/List;", "component6", "()Z", "component7", "component8", "component9", "component10", "()Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/AuthMethod;", "component11", "component12", "()I", "component13", "component14", "component15", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZZZZLcom/paypal/oslo/feature/identity/rememberedlogin/ui/AuthMethod;ZIIZZ)Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginUiState$UserDataLoaded;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getDisplayName", "getPublicCredential", "getLoginCredential", "getAvatarUrl", "Ljava/util/List;", "getAvailableAuthOptions", "Z", "getBiometricAutoTriggered", "getPasskeyAutoTriggered", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/AuthMethod;", "getAuthMethodBeingTriggered", com.visa.cbp.getEncExpo.warmup, "getBiometricAttemptCount", "getPasskeyAttemptCount", "getBiometricManualCancelled", "getPasskeyManualCancelled"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UserDataLoaded extends com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.rememberedlogin.ui.AuthMethod authMethodBeingTriggered;
        private final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> availableAuthOptions;
        private final java.lang.String avatarUrl;
        private final int biometricAttemptCount;
        private final boolean biometricAutoTriggered;
        private final boolean biometricManualCancelled;
        private final java.lang.String displayName;
        private final boolean isBiometricPromptShown;
        private final boolean isPasskeyPromptShown;
        private final boolean isVerifyingCredentials;
        private final java.lang.String loginCredential;
        private final int passkeyAttemptCount;
        private final boolean passkeyAutoTriggered;
        private final boolean passkeyManualCancelled;
        private final java.lang.String publicCredential;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public UserDataLoaded(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List<? extends com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> list, boolean z, boolean z2, boolean z3, boolean z4, com.paypal.oslo.feature.identity.rememberedlogin.ui.AuthMethod authMethod, boolean z5, int i, int i2, boolean z6, boolean z7) {
            super("UserDataLoaded", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.displayName = str;
            this.publicCredential = str2;
            this.loginCredential = str3;
            this.avatarUrl = str4;
            this.availableAuthOptions = list;
            this.isBiometricPromptShown = z;
            this.isPasskeyPromptShown = z2;
            this.biometricAutoTriggered = z3;
            this.passkeyAutoTriggered = z4;
            this.authMethodBeingTriggered = authMethod;
            this.isVerifyingCredentials = z5;
            this.biometricAttemptCount = i;
            this.passkeyAttemptCount = i2;
            this.biometricManualCancelled = z6;
            this.passkeyManualCancelled = z7;
        }

        public final java.lang.String getDisplayName() {
            return this.displayName;
        }

        public final java.lang.String getPublicCredential() {
            return this.publicCredential;
        }

        public final java.lang.String getLoginCredential() {
            return this.loginCredential;
        }

        public final java.lang.String getAvatarUrl() {
            return this.avatarUrl;
        }

        public /* synthetic */ UserDataLoaded(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List list, boolean z, boolean z2, boolean z3, boolean z4, com.paypal.oslo.feature.identity.rememberedlogin.ui.AuthMethod authMethod, boolean z5, int i, int i2, boolean z6, boolean z7, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i3 & 4) != 0 ? str2 : str3, (i3 & 8) != 0 ? null : str4, (i3 & 16) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i3 & 32) != 0 ? false : z, (i3 & 64) != 0 ? false : z2, (i3 & 128) != 0 ? false : z3, (i3 & 256) != 0 ? false : z4, (i3 & 512) != 0 ? null : authMethod, (i3 & 1024) != 0 ? false : z5, (i3 & 2048) != 0 ? 0 : i, (i3 & 4096) != 0 ? 0 : i2, (i3 & 8192) != 0 ? false : z6, (i3 & 16384) != 0 ? false : z7);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> getAvailableAuthOptions() {
            return this.availableAuthOptions;
        }

        public final boolean isBiometricPromptShown() {
            return this.isBiometricPromptShown;
        }

        public final boolean isPasskeyPromptShown() {
            return this.isPasskeyPromptShown;
        }

        public final boolean getBiometricAutoTriggered() {
            return this.biometricAutoTriggered;
        }

        public final boolean getPasskeyAutoTriggered() {
            return this.passkeyAutoTriggered;
        }

        public final com.paypal.oslo.feature.identity.rememberedlogin.ui.AuthMethod getAuthMethodBeingTriggered() {
            return this.authMethodBeingTriggered;
        }

        public final boolean isVerifyingCredentials() {
            return this.isVerifyingCredentials;
        }

        public final int getBiometricAttemptCount() {
            return this.biometricAttemptCount;
        }

        public final int getPasskeyAttemptCount() {
            return this.passkeyAttemptCount;
        }

        public final boolean getBiometricManualCancelled() {
            return this.biometricManualCancelled;
        }

        public final boolean getPasskeyManualCancelled() {
            return this.passkeyManualCancelled;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.displayName;
            java.lang.String str2 = this.publicCredential;
            java.lang.String str3 = this.loginCredential;
            java.lang.String str4 = this.avatarUrl;
            java.util.List<com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> list = this.availableAuthOptions;
            boolean z = this.isBiometricPromptShown;
            boolean z2 = this.isPasskeyPromptShown;
            boolean z3 = this.biometricAutoTriggered;
            boolean z4 = this.passkeyAutoTriggered;
            com.paypal.oslo.feature.identity.rememberedlogin.ui.AuthMethod authMethod = this.authMethodBeingTriggered;
            boolean z5 = this.isVerifyingCredentials;
            int i = this.biometricAttemptCount;
            int i2 = this.passkeyAttemptCount;
            boolean z6 = this.biometricManualCancelled;
            boolean z7 = this.passkeyManualCancelled;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UserDataLoaded(displayName=");
            sb.append(str);
            sb.append(", publicCredential=");
            sb.append(str2);
            sb.append(", loginCredential=");
            sb.append(str3);
            sb.append(", avatarUrl=");
            sb.append(str4);
            sb.append(", availableAuthOptions=");
            sb.append(list);
            sb.append(", isBiometricPromptShown=");
            sb.append(z);
            sb.append(", isPasskeyPromptShown=");
            sb.append(z2);
            sb.append(", biometricAutoTriggered=");
            sb.append(z3);
            sb.append(", passkeyAutoTriggered=");
            sb.append(z4);
            sb.append(", authMethodBeingTriggered=");
            sb.append(authMethod);
            sb.append(", isVerifyingCredentials=");
            sb.append(z5);
            sb.append(", biometricAttemptCount=");
            sb.append(i);
            sb.append(", passkeyAttemptCount=");
            sb.append(i2);
            sb.append(", biometricManualCancelled=");
            sb.append(z6);
            sb.append(", passkeyManualCancelled=");
            sb.append(z7);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.displayName.hashCode();
            int hashCode2 = this.publicCredential.hashCode();
            int hashCode3 = this.loginCredential.hashCode();
            java.lang.String str = this.avatarUrl;
            int hashCode4 = str == null ? 0 : str.hashCode();
            int hashCode5 = this.availableAuthOptions.hashCode();
            int hashCode6 = java.lang.Boolean.hashCode(this.isBiometricPromptShown);
            int hashCode7 = java.lang.Boolean.hashCode(this.isPasskeyPromptShown);
            int hashCode8 = java.lang.Boolean.hashCode(this.biometricAutoTriggered);
            int hashCode9 = java.lang.Boolean.hashCode(this.passkeyAutoTriggered);
            com.paypal.oslo.feature.identity.rememberedlogin.ui.AuthMethod authMethod = this.authMethodBeingTriggered;
            return (((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + (authMethod != null ? authMethod.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.isVerifyingCredentials)) * 31) + java.lang.Integer.hashCode(this.biometricAttemptCount)) * 31) + java.lang.Integer.hashCode(this.passkeyAttemptCount)) * 31) + java.lang.Boolean.hashCode(this.biometricManualCancelled)) * 31) + java.lang.Boolean.hashCode(this.passkeyManualCancelled);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.UserDataLoaded)) {
                return false;
            }
            com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.UserDataLoaded userDataLoaded = (com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.UserDataLoaded) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.displayName, userDataLoaded.displayName) && kotlin.jvm.internal.Intrinsics.areEqual(this.publicCredential, userDataLoaded.publicCredential) && kotlin.jvm.internal.Intrinsics.areEqual(this.loginCredential, userDataLoaded.loginCredential) && kotlin.jvm.internal.Intrinsics.areEqual(this.avatarUrl, userDataLoaded.avatarUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.availableAuthOptions, userDataLoaded.availableAuthOptions) && this.isBiometricPromptShown == userDataLoaded.isBiometricPromptShown && this.isPasskeyPromptShown == userDataLoaded.isPasskeyPromptShown && this.biometricAutoTriggered == userDataLoaded.biometricAutoTriggered && this.passkeyAutoTriggered == userDataLoaded.passkeyAutoTriggered && this.authMethodBeingTriggered == userDataLoaded.authMethodBeingTriggered && this.isVerifyingCredentials == userDataLoaded.isVerifyingCredentials && this.biometricAttemptCount == userDataLoaded.biometricAttemptCount && this.passkeyAttemptCount == userDataLoaded.passkeyAttemptCount && this.biometricManualCancelled == userDataLoaded.biometricManualCancelled && this.passkeyManualCancelled == userDataLoaded.passkeyManualCancelled;
        }

        public final com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.UserDataLoaded copy(java.lang.String displayName, java.lang.String publicCredential, java.lang.String loginCredential, java.lang.String avatarUrl, java.util.List<? extends com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> availableAuthOptions, boolean isBiometricPromptShown, boolean isPasskeyPromptShown, boolean biometricAutoTriggered, boolean passkeyAutoTriggered, com.paypal.oslo.feature.identity.rememberedlogin.ui.AuthMethod authMethodBeingTriggered, boolean isVerifyingCredentials, int biometricAttemptCount, int passkeyAttemptCount, boolean biometricManualCancelled, boolean passkeyManualCancelled) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicCredential, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginCredential, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableAuthOptions, "");
            return new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.UserDataLoaded(displayName, publicCredential, loginCredential, avatarUrl, availableAuthOptions, isBiometricPromptShown, isPasskeyPromptShown, biometricAutoTriggered, passkeyAutoTriggered, authMethodBeingTriggered, isVerifyingCredentials, biometricAttemptCount, passkeyAttemptCount, biometricManualCancelled, passkeyManualCancelled);
        }

        /* renamed from: component9, reason: from getter */
        public final boolean getPasskeyAutoTriggered() {
            return this.passkeyAutoTriggered;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getBiometricAutoTriggered() {
            return this.biometricAutoTriggered;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getIsPasskeyPromptShown() {
            return this.isPasskeyPromptShown;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsBiometricPromptShown() {
            return this.isBiometricPromptShown;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> component5() {
            return this.availableAuthOptions;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getAvatarUrl() {
            return this.avatarUrl;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getLoginCredential() {
            return this.loginCredential;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getPublicCredential() {
            return this.publicCredential;
        }

        /* renamed from: component15, reason: from getter */
        public final boolean getPasskeyManualCancelled() {
            return this.passkeyManualCancelled;
        }

        /* renamed from: component14, reason: from getter */
        public final boolean getBiometricManualCancelled() {
            return this.biometricManualCancelled;
        }

        /* renamed from: component13, reason: from getter */
        public final int getPasskeyAttemptCount() {
            return this.passkeyAttemptCount;
        }

        /* renamed from: component12, reason: from getter */
        public final int getBiometricAttemptCount() {
            return this.biometricAttemptCount;
        }

        /* renamed from: component11, reason: from getter */
        public final boolean getIsVerifyingCredentials() {
            return this.isVerifyingCredentials;
        }

        /* renamed from: component10, reason: from getter */
        public final com.paypal.oslo.feature.identity.rememberedlogin.ui.AuthMethod getAuthMethodBeingTriggered() {
            return this.authMethodBeingTriggered;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDisplayName() {
            return this.displayName;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginUiState$Loading;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.Loading INSTANCE = new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.Loading();

        public final int hashCode() {
            return -865949768;
        }

        private Loading() {
            super("Loading", null);
        }

        public final java.lang.String toString() {
            return "Loading";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginUiState$Error;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginUiState;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginUiState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState {
        public static final int $stable = 0;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(java.lang.String str) {
            super("Error", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.Error) other).message);
        }

        public final com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.Error copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.Error(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.Error copy$default(com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginUiState.Error error, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = error.message;
            }
            return error.copy(str);
        }
    }

    public /* synthetic */ RememberedLoginUiState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
