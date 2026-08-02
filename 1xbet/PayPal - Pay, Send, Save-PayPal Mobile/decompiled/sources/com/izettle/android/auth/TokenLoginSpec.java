package com.izettle.android.auth;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \t2\u00020\u0001:\u0002\n\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/izettle/android/auth/TokenLoginSpec;", "Lcom/izettle/android/auth/LoginSpec;", "", "refreshToken", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getRefreshToken", "()Ljava/lang/String;", "Companion", "Builder"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TokenLoginSpec extends com.izettle.android.auth.LoginSpec {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.izettle.android.auth.TokenLoginSpec.Companion INSTANCE = new com.izettle.android.auth.TokenLoginSpec.Companion(null);
    private final java.lang.String refreshToken;

    public final java.lang.String getRefreshToken() {
        return this.refreshToken;
    }

    private TokenLoginSpec(java.lang.String str) {
        super(null);
        this.refreshToken = str;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR.\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0007@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\t\u0010\u000f"}, d2 = {"Lcom/izettle/android/auth/TokenLoginSpec$Builder;", "", "<init>", "()V", "Lcom/izettle/android/auth/TokenLoginSpec;", "build", "()Lcom/izettle/android/auth/TokenLoginSpec;", "", "refreshToken", "setRefreshToken", "(Ljava/lang/String;)Lcom/izettle/android/auth/TokenLoginSpec$Builder;", "<set-?>", "Ljava/lang/String;", "getRefreshToken", "()Ljava/lang/String;", "(Ljava/lang/String;)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Builder {
        private java.lang.String refreshToken;

        public final java.lang.String getRefreshToken() {
            return this.refreshToken;
        }

        /* renamed from: setRefreshToken, reason: collision with other method in class */
        public final /* synthetic */ void m10795setRefreshToken(java.lang.String str) {
            this.refreshToken = str;
        }

        public final com.izettle.android.auth.TokenLoginSpec.Builder setRefreshToken(java.lang.String refreshToken) {
            this.refreshToken = refreshToken;
            return this;
        }

        public final com.izettle.android.auth.TokenLoginSpec build() {
            java.lang.String str = this.refreshToken;
            if (str != null) {
                return new com.izettle.android.auth.TokenLoginSpec(str, null);
            }
            throw new java.lang.IllegalArgumentException("refreshToken must not be null".toString());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/izettle/android/auth/TokenLoginSpec$Companion;", "", "<init>", "()V", "Lcom/izettle/android/auth/TokenLoginSpec$Builder;", "builder", "()Lcom/izettle/android/auth/TokenLoginSpec$Builder;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.izettle.android.auth.TokenLoginSpec.Builder builder() {
            return new com.izettle.android.auth.TokenLoginSpec.Builder();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ TokenLoginSpec(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
