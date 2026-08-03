package com.facebook;

/* compiled from: AuthenticationToken.kt */
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 +2\u00020\u0001:\u0001+B\u0017\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B\u000f\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u000f\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020\u001aH\u0016J(\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u0003H\u0002J\r\u0010%\u001a\u00020\nH\u0000¢\u0006\u0002\b&J\u0018\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u001aH\u0016R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011¨\u0006,"}, d2 = {"Lcom/facebook/AuthenticationToken;", "Landroid/os/Parcelable;", "token", "", "expectedNonce", "(Ljava/lang/String;Ljava/lang/String;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "jsonObject", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", com.facebook.AuthenticationToken.CLAIMS_KEY, "Lcom/facebook/AuthenticationTokenClaims;", "getClaims", "()Lcom/facebook/AuthenticationTokenClaims;", "getExpectedNonce", "()Ljava/lang/String;", com.facebook.AuthenticationToken.HEADER_KEY, "Lcom/facebook/AuthenticationTokenHeader;", "getHeader", "()Lcom/facebook/AuthenticationTokenHeader;", "signature", "getSignature", "getToken", "describeContents", "", "equals", "", "other", "", "hashCode", "isValidSignature", "headerString", "claimsString", "sigString", "kid", "toJSONObject", "toJSONObject$facebook_core_release", "writeToParcel", "", "dest", "flags", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class AuthenticationToken implements android.os.Parcelable {
    public static final java.lang.String AUTHENTICATION_TOKEN_KEY = "id_token";
    private static final java.lang.String CLAIMS_KEY = "claims";
    private static final java.lang.String EXPECTED_NONCE_KEY = "expected_nonce";
    private static final java.lang.String HEADER_KEY = "header";
    private static final java.lang.String SIGNATURE_KEY = "signature";
    private static final java.lang.String TOKEN_STRING_KEY = "token_string";
    private final com.facebook.AuthenticationTokenClaims claims;
    private final java.lang.String expectedNonce;
    private final com.facebook.AuthenticationTokenHeader header;
    private final java.lang.String signature;
    private final java.lang.String token;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.facebook.AuthenticationToken.Companion INSTANCE = new com.facebook.AuthenticationToken.Companion(null);
    public static final android.os.Parcelable.Creator<com.facebook.AuthenticationToken> CREATOR = new android.os.Parcelable.Creator<com.facebook.AuthenticationToken>() { // from class: com.facebook.AuthenticationToken$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.facebook.AuthenticationToken createFromParcel(android.os.Parcel source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
            return new com.facebook.AuthenticationToken(source);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.facebook.AuthenticationToken[] newArray(int size) {
            return new com.facebook.AuthenticationToken[size];
        }
    };

    @kotlin.jvm.JvmStatic
    public static final com.facebook.AuthenticationToken getCurrentAuthenticationToken() {
        return INSTANCE.getCurrentAuthenticationToken();
    }

    @kotlin.jvm.JvmStatic
    public static final void setCurrentAuthenticationToken(com.facebook.AuthenticationToken authenticationToken) {
        INSTANCE.setCurrentAuthenticationToken(authenticationToken);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final java.lang.String getToken() {
        return this.token;
    }

    public final java.lang.String getExpectedNonce() {
        return this.expectedNonce;
    }

    public final com.facebook.AuthenticationTokenHeader getHeader() {
        return this.header;
    }

    public final com.facebook.AuthenticationTokenClaims getClaims() {
        return this.claims;
    }

    public final java.lang.String getSignature() {
        return this.signature;
    }

    public AuthenticationToken(java.lang.String token, java.lang.String expectedNonce) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "token");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(expectedNonce, "expectedNonce");
        com.facebook.internal.Validate validate = com.facebook.internal.Validate.INSTANCE;
        com.facebook.internal.Validate.notEmpty(token, "token");
        com.facebook.internal.Validate validate2 = com.facebook.internal.Validate.INSTANCE;
        com.facebook.internal.Validate.notEmpty(expectedNonce, "expectedNonce");
        java.util.List split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) token, new java.lang.String[]{"."}, false, 0, 6, (java.lang.Object) null);
        if (!(split$default.size() == 3)) {
            throw new java.lang.IllegalArgumentException("Invalid IdToken string".toString());
        }
        java.lang.String str = (java.lang.String) split$default.get(0);
        java.lang.String str2 = (java.lang.String) split$default.get(1);
        java.lang.String str3 = (java.lang.String) split$default.get(2);
        this.token = token;
        this.expectedNonce = expectedNonce;
        com.facebook.AuthenticationTokenHeader authenticationTokenHeader = new com.facebook.AuthenticationTokenHeader(str);
        this.header = authenticationTokenHeader;
        this.claims = new com.facebook.AuthenticationTokenClaims(str2, expectedNonce);
        if (!isValidSignature(str, str2, str3, authenticationTokenHeader.getKid())) {
            throw new java.lang.IllegalArgumentException("Invalid Signature".toString());
        }
        this.signature = str3;
    }

    public AuthenticationToken(android.os.Parcel parcel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        java.lang.String readString = parcel.readString();
        com.facebook.internal.Validate validate = com.facebook.internal.Validate.INSTANCE;
        this.token = com.facebook.internal.Validate.notNullOrEmpty(readString, "token");
        java.lang.String readString2 = parcel.readString();
        com.facebook.internal.Validate validate2 = com.facebook.internal.Validate.INSTANCE;
        this.expectedNonce = com.facebook.internal.Validate.notNullOrEmpty(readString2, "expectedNonce");
        android.os.Parcelable readParcelable = parcel.readParcelable(com.facebook.AuthenticationTokenHeader.class.getClassLoader());
        if (readParcelable != null) {
            this.header = (com.facebook.AuthenticationTokenHeader) readParcelable;
            android.os.Parcelable readParcelable2 = parcel.readParcelable(com.facebook.AuthenticationTokenClaims.class.getClassLoader());
            if (readParcelable2 != null) {
                this.claims = (com.facebook.AuthenticationTokenClaims) readParcelable2;
                java.lang.String readString3 = parcel.readString();
                com.facebook.internal.Validate validate3 = com.facebook.internal.Validate.INSTANCE;
                this.signature = com.facebook.internal.Validate.notNullOrEmpty(readString3, "signature");
                return;
            }
            throw new java.lang.IllegalStateException("Required value was null.".toString());
        }
        throw new java.lang.IllegalStateException("Required value was null.".toString());
    }

    public AuthenticationToken(org.json.JSONObject jsonObject) throws org.json.JSONException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        java.lang.String string = jsonObject.getString(TOKEN_STRING_KEY);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(TOKEN_STRING_KEY)");
        this.token = string;
        java.lang.String string2 = jsonObject.getString(EXPECTED_NONCE_KEY);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "jsonObject.getString(EXPECTED_NONCE_KEY)");
        this.expectedNonce = string2;
        java.lang.String string3 = jsonObject.getString("signature");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "jsonObject.getString(SIGNATURE_KEY)");
        this.signature = string3;
        org.json.JSONObject headerJSONObject = jsonObject.getJSONObject(HEADER_KEY);
        org.json.JSONObject claimsJSONObject = jsonObject.getJSONObject(CLAIMS_KEY);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(headerJSONObject, "headerJSONObject");
        this.header = new com.facebook.AuthenticationTokenHeader(headerJSONObject);
        com.facebook.AuthenticationTokenClaims.Companion companion = com.facebook.AuthenticationTokenClaims.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(claimsJSONObject, "claimsJSONObject");
        this.claims = companion.createFromJSONObject$facebook_core_release(claimsJSONObject);
    }

    public final org.json.JSONObject toJSONObject$facebook_core_release() throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(TOKEN_STRING_KEY, this.token);
        jSONObject.put(EXPECTED_NONCE_KEY, this.expectedNonce);
        jSONObject.put(HEADER_KEY, this.header.toJSONObject$facebook_core_release());
        jSONObject.put(CLAIMS_KEY, this.claims.toJSONObject$facebook_core_release());
        jSONObject.put("signature", this.signature);
        return jSONObject;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.facebook.AuthenticationToken)) {
            return false;
        }
        com.facebook.AuthenticationToken authenticationToken = (com.facebook.AuthenticationToken) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.token, authenticationToken.token) && kotlin.jvm.internal.Intrinsics.areEqual(this.expectedNonce, authenticationToken.expectedNonce) && kotlin.jvm.internal.Intrinsics.areEqual(this.header, authenticationToken.header) && kotlin.jvm.internal.Intrinsics.areEqual(this.claims, authenticationToken.claims) && kotlin.jvm.internal.Intrinsics.areEqual(this.signature, authenticationToken.signature);
    }

    public int hashCode() {
        return ((((((((com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.token.hashCode()) * 31) + this.expectedNonce.hashCode()) * 31) + this.header.hashCode()) * 31) + this.claims.hashCode()) * 31) + this.signature.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.token);
        dest.writeString(this.expectedNonce);
        dest.writeParcelable(this.header, flags);
        dest.writeParcelable(this.claims, flags);
        dest.writeString(this.signature);
    }

    private final boolean isValidSignature(java.lang.String headerString, java.lang.String claimsString, java.lang.String sigString, java.lang.String kid) {
        try {
            com.facebook.internal.security.OidcSecurityUtil oidcSecurityUtil = com.facebook.internal.security.OidcSecurityUtil.INSTANCE;
            java.lang.String rawKeyFromEndPoint = com.facebook.internal.security.OidcSecurityUtil.getRawKeyFromEndPoint(kid);
            if (rawKeyFromEndPoint == null) {
                return false;
            }
            com.facebook.internal.security.OidcSecurityUtil oidcSecurityUtil2 = com.facebook.internal.security.OidcSecurityUtil.INSTANCE;
            java.security.PublicKey publicKeyFromString = com.facebook.internal.security.OidcSecurityUtil.getPublicKeyFromString(rawKeyFromEndPoint);
            com.facebook.internal.security.OidcSecurityUtil oidcSecurityUtil3 = com.facebook.internal.security.OidcSecurityUtil.INSTANCE;
            return com.facebook.internal.security.OidcSecurityUtil.verify(publicKeyFromString, headerString + '.' + claimsString, sigString);
        } catch (java.io.IOException | java.security.spec.InvalidKeySpecException unused) {
            return false;
        }
    }

    /* compiled from: AuthenticationToken.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\r\u001a\u0004\u0018\u00010\bH\u0007J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/facebook/AuthenticationToken$Companion;", "", "()V", "AUTHENTICATION_TOKEN_KEY", "", "CLAIMS_KEY", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/AuthenticationToken;", "EXPECTED_NONCE_KEY", "HEADER_KEY", "SIGNATURE_KEY", "TOKEN_STRING_KEY", "getCurrentAuthenticationToken", "setCurrentAuthenticationToken", "", "authenticationToken", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final com.facebook.AuthenticationToken getCurrentAuthenticationToken() {
            return com.facebook.AuthenticationTokenManager.INSTANCE.getInstance().getCurrentAuthenticationTokenField();
        }

        @kotlin.jvm.JvmStatic
        public final void setCurrentAuthenticationToken(com.facebook.AuthenticationToken authenticationToken) {
            com.facebook.AuthenticationTokenManager.INSTANCE.getInstance().setCurrentAuthenticationToken(authenticationToken);
        }
    }
}
