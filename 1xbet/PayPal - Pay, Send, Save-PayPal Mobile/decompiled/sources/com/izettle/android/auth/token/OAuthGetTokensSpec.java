package com.izettle.android.auth.token;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0002\u0010\u000fB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u000e\u0010\u000b"}, d2 = {"Lcom/izettle/android/auth/token/OAuthGetTokensSpec;", "Lcom/izettle/android/auth/token/GetTokensSpec;", "", "code", "clientId", "redirectUri", "codeVerifier", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getClientId", "()Ljava/lang/String;", "getCode", "getCodeVerifier", "getRedirectUri", "NewBuilder", "Builder"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class OAuthGetTokensSpec extends com.izettle.android.auth.token.GetTokensSpec {

    /* renamed from: NewBuilder, reason: from kotlin metadata */
    public static final com.izettle.android.auth.token.OAuthGetTokensSpec.Companion INSTANCE = new com.izettle.android.auth.token.OAuthGetTokensSpec.Companion(null);
    private final java.lang.String clientId;
    private final java.lang.String code;
    private final java.lang.String codeVerifier;
    private final java.lang.String redirectUri;

    public final java.lang.String getCode() {
        return this.code;
    }

    public final java.lang.String getClientId() {
        return this.clientId;
    }

    public final java.lang.String getRedirectUri() {
        return this.redirectUri;
    }

    public final java.lang.String getCodeVerifier() {
        return this.codeVerifier;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OAuthGetTokensSpec(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        super(null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        this.code = str;
        this.clientId = str2;
        this.redirectUri = str3;
        this.codeVerifier = str4;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u000e\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000e\u0010\nJ\u0017\u0010\u0010\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0010\u0010\nR.\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0007@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\t\u0010\u0015R.\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014\"\u0004\b\f\u0010\u0015R.\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u000e\u0010\u0015R.\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0010\u0010\u0015"}, d2 = {"Lcom/izettle/android/auth/token/OAuthGetTokensSpec$Builder;", "", "<init>", "()V", "Lcom/izettle/android/auth/token/OAuthGetTokensSpec;", "build", "()Lcom/izettle/android/auth/token/OAuthGetTokensSpec;", "", "clientId", "setClientId", "(Ljava/lang/String;)Lcom/izettle/android/auth/token/OAuthGetTokensSpec$Builder;", "code", "setCode", "codeVerifier", "setCodeVerifier", "redirectUri", "setRedirectUri", "<set-?>", "Ljava/lang/String;", "getClientId", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "getCode", "getCodeVerifier", "getRedirectUri"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Builder {
        private java.lang.String clientId;
        private java.lang.String code;
        private java.lang.String codeVerifier;
        private java.lang.String redirectUri;

        public final java.lang.String getCode() {
            return this.code;
        }

        /* renamed from: setCode, reason: collision with other method in class */
        public final /* synthetic */ void m10812setCode(java.lang.String str) {
            this.code = str;
        }

        public final java.lang.String getClientId() {
            return this.clientId;
        }

        /* renamed from: setClientId, reason: collision with other method in class */
        public final /* synthetic */ void m10811setClientId(java.lang.String str) {
            this.clientId = str;
        }

        public final java.lang.String getRedirectUri() {
            return this.redirectUri;
        }

        /* renamed from: setRedirectUri, reason: collision with other method in class */
        public final /* synthetic */ void m10814setRedirectUri(java.lang.String str) {
            this.redirectUri = str;
        }

        public final java.lang.String getCodeVerifier() {
            return this.codeVerifier;
        }

        /* renamed from: setCodeVerifier, reason: collision with other method in class */
        public final /* synthetic */ void m10813setCodeVerifier(java.lang.String str) {
            this.codeVerifier = str;
        }

        public final com.izettle.android.auth.token.OAuthGetTokensSpec.Builder setCode(java.lang.String code) {
            this.code = code;
            return this;
        }

        public final com.izettle.android.auth.token.OAuthGetTokensSpec.Builder setClientId(java.lang.String clientId) {
            this.clientId = clientId;
            return this;
        }

        public final com.izettle.android.auth.token.OAuthGetTokensSpec.Builder setRedirectUri(java.lang.String redirectUri) {
            this.redirectUri = redirectUri;
            return this;
        }

        public final com.izettle.android.auth.token.OAuthGetTokensSpec.Builder setCodeVerifier(java.lang.String codeVerifier) {
            this.codeVerifier = codeVerifier;
            return this;
        }

        public final com.izettle.android.auth.token.OAuthGetTokensSpec build() {
            java.lang.String str = this.code;
            if (str == null) {
                throw new java.lang.IllegalArgumentException("code must not be null".toString());
            }
            java.lang.String str2 = this.clientId;
            if (str2 == null) {
                throw new java.lang.IllegalArgumentException("clientId must not be null".toString());
            }
            java.lang.String str3 = this.redirectUri;
            if (str3 == null) {
                throw new java.lang.IllegalArgumentException("redirectUri must not be null".toString());
            }
            java.lang.String str4 = this.codeVerifier;
            if (str4 != null) {
                return new com.izettle.android.auth.token.OAuthGetTokensSpec(str, str2, str3, str4);
            }
            throw new java.lang.IllegalArgumentException("codeVerifier must not be null".toString());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/izettle/android/auth/token/OAuthGetTokensSpec$NewBuilder;", "Lkotlin/Function0;", "Lcom/izettle/android/auth/token/OAuthGetTokensSpec$Builder;", "<init>", "()V", "invoke", "()Lcom/izettle/android/auth/token/OAuthGetTokensSpec$Builder;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.izettle.android.auth.token.OAuthGetTokensSpec$NewBuilder, reason: from kotlin metadata */
    public static final class Companion implements kotlin.jvm.functions.Function0<com.izettle.android.auth.token.OAuthGetTokensSpec.Builder> {
        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final com.izettle.android.auth.token.OAuthGetTokensSpec.Builder invoke() {
            return new com.izettle.android.auth.token.OAuthGetTokensSpec.Builder();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
