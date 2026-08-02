package com.paypal.oslo.feature.identity.rememberedlogin.ui;

@kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0016\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0016 !\"#$%&'()*+,-./012345"}, d2 = {"Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "ChangeUser", "NextClicked", "LoadUserData", "UserDataSuccess", "UserDataError", "VerifyCredentialSuccess", "BiometricPromptTriggered", "BiometricAuthSuccess", "BiometricAuthError", "BiometricAuthCanceled", "PasskeyPromptTriggered", "PasskeyAuthSuccess", "PasskeyAuthError", "PasskeyAuthCanceled", "BiometricAutoTriggered", "PasskeyAutoTriggered", "VerifyCredentialStarted", "VerifyCredentialCompleted", "VerifyCredentialFailed", "BiometricAttemptFailed", "PasskeyAttemptFailed", "LoginButtonClicked", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent$BiometricAttemptFailed;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent$BiometricAuthCanceled;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent$BiometricAuthError;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent$BiometricAuthSuccess;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent$BiometricAutoTriggered;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent$BiometricPromptTriggered;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent$ChangeUser;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent$LoadUserData;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent$LoginButtonClicked;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent$NextClicked;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent$PasskeyAttemptFailed;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent$PasskeyAuthCanceled;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent$PasskeyAuthError;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent$PasskeyAuthSuccess;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent$PasskeyAutoTriggered;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent$PasskeyPromptTriggered;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent$UserDataError;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent$UserDataSuccess;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent$VerifyCredentialCompleted;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent$VerifyCredentialFailed;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent$VerifyCredentialStarted;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent$VerifyCredentialSuccess;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class RememberedLoginEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private RememberedLoginEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent$ChangeUser;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ChangeUser extends com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.ChangeUser INSTANCE = new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.ChangeUser();

        public final int hashCode() {
            return -575013886;
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
            if (!(other instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.ChangeUser)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent$NextClicked;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent;", "", "requestId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent$NextClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getRequestId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NextClicked extends com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent {
        public static final int $stable = 0;
        private final java.lang.String requestId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NextClicked(java.lang.String str) {
            super("NextClicked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.requestId = str;
        }

        public final java.lang.String getRequestId() {
            return this.requestId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.requestId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NextClicked(requestId=");
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
            return (other instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.NextClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.requestId, ((com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.NextClicked) other).requestId);
        }

        public final com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.NextClicked copy(java.lang.String requestId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestId, "");
            return new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.NextClicked(requestId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getRequestId() {
            return this.requestId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.NextClicked copy$default(com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.NextClicked nextClicked, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = nextClicked.requestId;
            }
            return nextClicked.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent$LoadUserData;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoadUserData extends com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.LoadUserData INSTANCE = new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.LoadUserData();

        public final int hashCode() {
            return -1779386430;
        }

        private LoadUserData() {
            super("LoadUserData", null);
        }

        public final java.lang.String toString() {
            return "LoadUserData";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.LoadUserData)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ:\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001c\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001d\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent$UserDataSuccess;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent;", "", "displayName", "publicCredential", "avatarUrl", "loginCredential", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent$UserDataSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDisplayName", "getPublicCredential", "getAvatarUrl", "getLoginCredential"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UserDataSuccess extends com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent {
        public static final int $stable = 0;
        private final java.lang.String avatarUrl;
        private final java.lang.String displayName;
        private final java.lang.String loginCredential;
        private final java.lang.String publicCredential;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserDataSuccess(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            super("UserDataSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            this.displayName = str;
            this.publicCredential = str2;
            this.avatarUrl = str3;
            this.loginCredential = str4;
        }

        public /* synthetic */ UserDataSuccess(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? str2 : str4);
        }

        public final java.lang.String getDisplayName() {
            return this.displayName;
        }

        public final java.lang.String getPublicCredential() {
            return this.publicCredential;
        }

        public final java.lang.String getAvatarUrl() {
            return this.avatarUrl;
        }

        public final java.lang.String getLoginCredential() {
            return this.loginCredential;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.displayName;
            java.lang.String str2 = this.publicCredential;
            java.lang.String str3 = this.avatarUrl;
            java.lang.String str4 = this.loginCredential;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UserDataSuccess(displayName=");
            sb.append(str);
            sb.append(", publicCredential=");
            sb.append(str2);
            sb.append(", avatarUrl=");
            sb.append(str3);
            sb.append(", loginCredential=");
            sb.append(str4);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.displayName.hashCode();
            int hashCode2 = this.publicCredential.hashCode();
            java.lang.String str = this.avatarUrl;
            return (((((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.loginCredential.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.UserDataSuccess)) {
                return false;
            }
            com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.UserDataSuccess userDataSuccess = (com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.UserDataSuccess) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.displayName, userDataSuccess.displayName) && kotlin.jvm.internal.Intrinsics.areEqual(this.publicCredential, userDataSuccess.publicCredential) && kotlin.jvm.internal.Intrinsics.areEqual(this.avatarUrl, userDataSuccess.avatarUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.loginCredential, userDataSuccess.loginCredential);
        }

        public final com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.UserDataSuccess copy(java.lang.String displayName, java.lang.String publicCredential, java.lang.String avatarUrl, java.lang.String loginCredential) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicCredential, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginCredential, "");
            return new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.UserDataSuccess(displayName, publicCredential, avatarUrl, loginCredential);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getLoginCredential() {
            return this.loginCredential;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getAvatarUrl() {
            return this.avatarUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getPublicCredential() {
            return this.publicCredential;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDisplayName() {
            return this.displayName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.UserDataSuccess copy$default(com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.UserDataSuccess userDataSuccess, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = userDataSuccess.displayName;
            }
            if ((i & 2) != 0) {
                str2 = userDataSuccess.publicCredential;
            }
            if ((i & 4) != 0) {
                str3 = userDataSuccess.avatarUrl;
            }
            if ((i & 8) != 0) {
                str4 = userDataSuccess.loginCredential;
            }
            return userDataSuccess.copy(str, str2, str3, str4);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent$UserDataError;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent$UserDataError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UserDataError extends com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent {
        public static final int $stable = 0;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserDataError(java.lang.String str) {
            super("UserDataError", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UserDataError(message=");
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
            return (other instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.UserDataError) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.UserDataError) other).message);
        }

        public final com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.UserDataError copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.UserDataError(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.UserDataError copy$default(com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.UserDataError userDataError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = userDataError.message;
            }
            return userDataError.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent$VerifyCredentialSuccess;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent;", "", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthOptions;", "authOptions", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent$VerifyCredentialSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getAuthOptions"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class VerifyCredentialSuccess extends com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> authOptions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public VerifyCredentialSuccess(java.util.List<? extends com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> list) {
            super("VerifyCredentialSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.authOptions = list;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> getAuthOptions() {
            return this.authOptions;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> list = this.authOptions;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("VerifyCredentialSuccess(authOptions=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.authOptions.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.VerifyCredentialSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.authOptions, ((com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.VerifyCredentialSuccess) other).authOptions);
        }

        public final com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.VerifyCredentialSuccess copy(java.util.List<? extends com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> authOptions) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authOptions, "");
            return new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.VerifyCredentialSuccess(authOptions);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> component1() {
            return this.authOptions;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.VerifyCredentialSuccess copy$default(com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.VerifyCredentialSuccess verifyCredentialSuccess, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = verifyCredentialSuccess.authOptions;
            }
            return verifyCredentialSuccess.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent$BiometricPromptTriggered;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BiometricPromptTriggered extends com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.BiometricPromptTriggered INSTANCE = new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.BiometricPromptTriggered();

        public final int hashCode() {
            return 1222029218;
        }

        private BiometricPromptTriggered() {
            super("BiometricPromptTriggered", null);
        }

        public final java.lang.String toString() {
            return "BiometricPromptTriggered";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.BiometricPromptTriggered)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent$BiometricAuthSuccess;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent;", "", "credential", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent$BiometricAuthSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCredential"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BiometricAuthSuccess extends com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent {
        public static final int $stable = 0;
        private final java.lang.String credential;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BiometricAuthSuccess(java.lang.String str) {
            super("BiometricAuthSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.credential = str;
        }

        public final java.lang.String getCredential() {
            return this.credential;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.credential;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BiometricAuthSuccess(credential=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.credential.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.BiometricAuthSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.credential, ((com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.BiometricAuthSuccess) other).credential);
        }

        public final com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.BiometricAuthSuccess copy(java.lang.String credential) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(credential, "");
            return new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.BiometricAuthSuccess(credential);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCredential() {
            return this.credential;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.BiometricAuthSuccess copy$default(com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.BiometricAuthSuccess biometricAuthSuccess, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = biometricAuthSuccess.credential;
            }
            return biometricAuthSuccess.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\tJ\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent$BiometricAuthError;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent;", "", "errorCode", "", "errorMessage", "<init>", "(ILjava/lang/String;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "copy", "(ILjava/lang/String;)Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent$BiometricAuthError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", com.visa.cbp.getEncExpo.warmup, "getErrorCode", "Ljava/lang/String;", "getErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BiometricAuthError extends com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent {
        public static final int $stable = 0;
        private final int errorCode;
        private final java.lang.String errorMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BiometricAuthError(int i, java.lang.String str) {
            super("BiometricAuthError", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.errorCode = i;
            this.errorMessage = str;
        }

        public final int getErrorCode() {
            return this.errorCode;
        }

        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public final java.lang.String toString() {
            int i = this.errorCode;
            java.lang.String str = this.errorMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BiometricAuthError(errorCode=");
            sb.append(i);
            sb.append(", errorMessage=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Integer.hashCode(this.errorCode) * 31) + this.errorMessage.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.BiometricAuthError)) {
                return false;
            }
            com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.BiometricAuthError biometricAuthError = (com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.BiometricAuthError) other;
            return this.errorCode == biometricAuthError.errorCode && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, biometricAuthError.errorMessage);
        }

        public final com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.BiometricAuthError copy(int errorCode, java.lang.String errorMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
            return new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.BiometricAuthError(errorCode, errorMessage);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        /* renamed from: component1, reason: from getter */
        public final int getErrorCode() {
            return this.errorCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.BiometricAuthError copy$default(com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.BiometricAuthError biometricAuthError, int i, java.lang.String str, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = biometricAuthError.errorCode;
            }
            if ((i2 & 2) != 0) {
                str = biometricAuthError.errorMessage;
            }
            return biometricAuthError.copy(i, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent$BiometricAuthCanceled;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BiometricAuthCanceled extends com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.BiometricAuthCanceled INSTANCE = new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.BiometricAuthCanceled();

        public final int hashCode() {
            return 1511773298;
        }

        private BiometricAuthCanceled() {
            super("BiometricAuthCanceled", null);
        }

        public final java.lang.String toString() {
            return "BiometricAuthCanceled";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.BiometricAuthCanceled)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent$PasskeyPromptTriggered;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PasskeyPromptTriggered extends com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.PasskeyPromptTriggered INSTANCE = new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.PasskeyPromptTriggered();

        public final int hashCode() {
            return 1295776428;
        }

        private PasskeyPromptTriggered() {
            super("PasskeyPromptTriggered", null);
        }

        public final java.lang.String toString() {
            return "PasskeyPromptTriggered";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.PasskeyPromptTriggered)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent$PasskeyAuthSuccess;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent;", "", "credential", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent$PasskeyAuthSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCredential"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PasskeyAuthSuccess extends com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent {
        public static final int $stable = 0;
        private final java.lang.String credential;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PasskeyAuthSuccess(java.lang.String str) {
            super("PasskeyAuthSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.credential = str;
        }

        public final java.lang.String getCredential() {
            return this.credential;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.credential;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PasskeyAuthSuccess(credential=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.credential.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.PasskeyAuthSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.credential, ((com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.PasskeyAuthSuccess) other).credential);
        }

        public final com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.PasskeyAuthSuccess copy(java.lang.String credential) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(credential, "");
            return new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.PasskeyAuthSuccess(credential);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCredential() {
            return this.credential;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.PasskeyAuthSuccess copy$default(com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.PasskeyAuthSuccess passkeyAuthSuccess, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = passkeyAuthSuccess.credential;
            }
            return passkeyAuthSuccess.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\tJ\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent$PasskeyAuthError;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent;", "", "errorCode", "", "errorMessage", "<init>", "(ILjava/lang/String;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "copy", "(ILjava/lang/String;)Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent$PasskeyAuthError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", com.visa.cbp.getEncExpo.warmup, "getErrorCode", "Ljava/lang/String;", "getErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PasskeyAuthError extends com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent {
        public static final int $stable = 0;
        private final int errorCode;
        private final java.lang.String errorMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PasskeyAuthError(int i, java.lang.String str) {
            super("PasskeyAuthError", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.errorCode = i;
            this.errorMessage = str;
        }

        public final int getErrorCode() {
            return this.errorCode;
        }

        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public final java.lang.String toString() {
            int i = this.errorCode;
            java.lang.String str = this.errorMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PasskeyAuthError(errorCode=");
            sb.append(i);
            sb.append(", errorMessage=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Integer.hashCode(this.errorCode) * 31) + this.errorMessage.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.PasskeyAuthError)) {
                return false;
            }
            com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.PasskeyAuthError passkeyAuthError = (com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.PasskeyAuthError) other;
            return this.errorCode == passkeyAuthError.errorCode && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, passkeyAuthError.errorMessage);
        }

        public final com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.PasskeyAuthError copy(int errorCode, java.lang.String errorMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
            return new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.PasskeyAuthError(errorCode, errorMessage);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        /* renamed from: component1, reason: from getter */
        public final int getErrorCode() {
            return this.errorCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.PasskeyAuthError copy$default(com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.PasskeyAuthError passkeyAuthError, int i, java.lang.String str, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = passkeyAuthError.errorCode;
            }
            if ((i2 & 2) != 0) {
                str = passkeyAuthError.errorMessage;
            }
            return passkeyAuthError.copy(i, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent$PasskeyAuthCanceled;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PasskeyAuthCanceled extends com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.PasskeyAuthCanceled INSTANCE = new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.PasskeyAuthCanceled();

        public final int hashCode() {
            return -1138788952;
        }

        private PasskeyAuthCanceled() {
            super("PasskeyAuthCanceled", null);
        }

        public final java.lang.String toString() {
            return "PasskeyAuthCanceled";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.PasskeyAuthCanceled)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent$BiometricAutoTriggered;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BiometricAutoTriggered extends com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.BiometricAutoTriggered INSTANCE = new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.BiometricAutoTriggered();

        public final int hashCode() {
            return 1414371191;
        }

        private BiometricAutoTriggered() {
            super("BiometricAutoTriggered", null);
        }

        public final java.lang.String toString() {
            return "BiometricAutoTriggered";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.BiometricAutoTriggered)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent$PasskeyAutoTriggered;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PasskeyAutoTriggered extends com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.PasskeyAutoTriggered INSTANCE = new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.PasskeyAutoTriggered();

        public final int hashCode() {
            return 851320065;
        }

        private PasskeyAutoTriggered() {
            super("PasskeyAutoTriggered", null);
        }

        public final java.lang.String toString() {
            return "PasskeyAutoTriggered";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.PasskeyAutoTriggered)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent$VerifyCredentialStarted;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class VerifyCredentialStarted extends com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.VerifyCredentialStarted INSTANCE = new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.VerifyCredentialStarted();

        public final int hashCode() {
            return -165279830;
        }

        private VerifyCredentialStarted() {
            super("VerifyCredentialStarted", null);
        }

        public final java.lang.String toString() {
            return "VerifyCredentialStarted";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.VerifyCredentialStarted)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent$VerifyCredentialCompleted;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class VerifyCredentialCompleted extends com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.VerifyCredentialCompleted INSTANCE = new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.VerifyCredentialCompleted();

        public final int hashCode() {
            return 805738292;
        }

        private VerifyCredentialCompleted() {
            super("VerifyCredentialCompleted", null);
        }

        public final java.lang.String toString() {
            return "VerifyCredentialCompleted";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.VerifyCredentialCompleted)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent$VerifyCredentialFailed;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class VerifyCredentialFailed extends com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.VerifyCredentialFailed INSTANCE = new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.VerifyCredentialFailed();

        public final int hashCode() {
            return 297911284;
        }

        private VerifyCredentialFailed() {
            super("VerifyCredentialFailed", null);
        }

        public final java.lang.String toString() {
            return "VerifyCredentialFailed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.VerifyCredentialFailed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent$BiometricAttemptFailed;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent;", "", "wasCancelled", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent$BiometricAttemptFailed;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getWasCancelled"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BiometricAttemptFailed extends com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent {
        public static final int $stable = 0;
        private final boolean wasCancelled;

        public BiometricAttemptFailed(boolean z) {
            super("BiometricAttemptFailed", null);
            this.wasCancelled = z;
        }

        public final boolean getWasCancelled() {
            return this.wasCancelled;
        }

        public final java.lang.String toString() {
            boolean z = this.wasCancelled;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BiometricAttemptFailed(wasCancelled=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.wasCancelled);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.BiometricAttemptFailed) && this.wasCancelled == ((com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.BiometricAttemptFailed) other).wasCancelled;
        }

        public final com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.BiometricAttemptFailed copy(boolean wasCancelled) {
            return new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.BiometricAttemptFailed(wasCancelled);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getWasCancelled() {
            return this.wasCancelled;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.BiometricAttemptFailed copy$default(com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.BiometricAttemptFailed biometricAttemptFailed, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = biometricAttemptFailed.wasCancelled;
            }
            return biometricAttemptFailed.copy(z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent$PasskeyAttemptFailed;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent;", "", "wasCancelled", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent$PasskeyAttemptFailed;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getWasCancelled"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PasskeyAttemptFailed extends com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent {
        public static final int $stable = 0;
        private final boolean wasCancelled;

        public PasskeyAttemptFailed(boolean z) {
            super("PasskeyAttemptFailed", null);
            this.wasCancelled = z;
        }

        public final boolean getWasCancelled() {
            return this.wasCancelled;
        }

        public final java.lang.String toString() {
            boolean z = this.wasCancelled;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PasskeyAttemptFailed(wasCancelled=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.wasCancelled);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.PasskeyAttemptFailed) && this.wasCancelled == ((com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.PasskeyAttemptFailed) other).wasCancelled;
        }

        public final com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.PasskeyAttemptFailed copy(boolean wasCancelled) {
            return new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.PasskeyAttemptFailed(wasCancelled);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getWasCancelled() {
            return this.wasCancelled;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.PasskeyAttemptFailed copy$default(com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.PasskeyAttemptFailed passkeyAttemptFailed, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = passkeyAttemptFailed.wasCancelled;
            }
            return passkeyAttemptFailed.copy(z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent$LoginButtonClicked;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoginButtonClicked extends com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.LoginButtonClicked INSTANCE = new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.LoginButtonClicked();

        public final int hashCode() {
            return 695451923;
        }

        private LoginButtonClicked() {
            super("LoginButtonClicked", null);
        }

        public final java.lang.String toString() {
            return "LoginButtonClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.LoginButtonClicked)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ RememberedLoginEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
