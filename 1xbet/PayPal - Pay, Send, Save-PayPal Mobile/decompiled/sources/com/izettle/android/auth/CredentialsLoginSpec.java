package com.izettle.android.auth;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u0000 \u000f2\u00020\u0001:\u0002\u0010\u000fB-\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\u000e\u0010\u000b"}, d2 = {"Lcom/izettle/android/auth/CredentialsLoginSpec;", "Lcom/izettle/android/auth/LoginSpec;", "", androidx.autofill.HintConstants.AUTOFILL_HINT_USERNAME, "password", "totp", "userUuid", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getPassword", "()Ljava/lang/String;", "getTotp", "getUserUuid", "getUsername", "Companion", "Builder"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CredentialsLoginSpec extends com.izettle.android.auth.LoginSpec {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.izettle.android.auth.CredentialsLoginSpec.Companion INSTANCE = new com.izettle.android.auth.CredentialsLoginSpec.Companion(null);
    private final java.lang.String password;
    private final java.lang.String totp;
    private final java.lang.String userUuid;
    private final java.lang.String username;

    public final java.lang.String getUsername() {
        return this.username;
    }

    public final java.lang.String getPassword() {
        return this.password;
    }

    public final java.lang.String getTotp() {
        return this.totp;
    }

    public final java.lang.String getUserUuid() {
        return this.userUuid;
    }

    private CredentialsLoginSpec(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        super(null);
        this.username = str;
        this.password = str2;
        this.totp = str3;
        this.userUuid = str4;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u000e\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000e\u0010\nJ\u0017\u0010\u0010\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0010\u0010\nR.\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0007@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\t\u0010\u0015R.\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014\"\u0004\b\f\u0010\u0015R.\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u000e\u0010\u0015R.\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0010\u0010\u0015"}, d2 = {"Lcom/izettle/android/auth/CredentialsLoginSpec$Builder;", "", "<init>", "()V", "Lcom/izettle/android/auth/CredentialsLoginSpec;", "build", "()Lcom/izettle/android/auth/CredentialsLoginSpec;", "", "password", "setPassword", "(Ljava/lang/String;)Lcom/izettle/android/auth/CredentialsLoginSpec$Builder;", "totp", "setTotp", "userUuid", "setUserUuid", androidx.autofill.HintConstants.AUTOFILL_HINT_USERNAME, "setUsername", "<set-?>", "Ljava/lang/String;", "getPassword", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "getTotp", "getUserUuid", "getUsername"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Builder {
        private java.lang.String password;
        private java.lang.String totp;
        private java.lang.String userUuid;
        private java.lang.String username;

        public final java.lang.String getUsername() {
            return this.username;
        }

        /* renamed from: setUsername, reason: collision with other method in class */
        public final /* synthetic */ void m10786setUsername(java.lang.String str) {
            this.username = str;
        }

        public final java.lang.String getPassword() {
            return this.password;
        }

        /* renamed from: setPassword, reason: collision with other method in class */
        public final /* synthetic */ void m10783setPassword(java.lang.String str) {
            this.password = str;
        }

        public final java.lang.String getTotp() {
            return this.totp;
        }

        /* renamed from: setTotp, reason: collision with other method in class */
        public final /* synthetic */ void m10784setTotp(java.lang.String str) {
            this.totp = str;
        }

        public final java.lang.String getUserUuid() {
            return this.userUuid;
        }

        /* renamed from: setUserUuid, reason: collision with other method in class */
        public final /* synthetic */ void m10785setUserUuid(java.lang.String str) {
            this.userUuid = str;
        }

        public final com.izettle.android.auth.CredentialsLoginSpec.Builder setUsername(java.lang.String username) {
            this.username = username;
            return this;
        }

        public final com.izettle.android.auth.CredentialsLoginSpec.Builder setPassword(java.lang.String password) {
            this.password = password;
            return this;
        }

        public final com.izettle.android.auth.CredentialsLoginSpec.Builder setTotp(java.lang.String totp) {
            this.totp = totp;
            return this;
        }

        public final com.izettle.android.auth.CredentialsLoginSpec.Builder setUserUuid(java.lang.String userUuid) {
            this.userUuid = userUuid;
            return this;
        }

        public final com.izettle.android.auth.CredentialsLoginSpec build() {
            java.lang.String str = this.username;
            if (str == null) {
                throw new java.lang.IllegalArgumentException("username must not be null".toString());
            }
            java.lang.String str2 = this.password;
            if (str2 != null) {
                return new com.izettle.android.auth.CredentialsLoginSpec(str, str2, this.totp, this.userUuid, null);
            }
            throw new java.lang.IllegalArgumentException("password m st not be null".toString());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/izettle/android/auth/CredentialsLoginSpec$Companion;", "", "<init>", "()V", "Lcom/izettle/android/auth/CredentialsLoginSpec$Builder;", "builder", "()Lcom/izettle/android/auth/CredentialsLoginSpec$Builder;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.izettle.android.auth.CredentialsLoginSpec.Builder builder() {
            return new com.izettle.android.auth.CredentialsLoginSpec.Builder();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CredentialsLoginSpec(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4);
    }
}
