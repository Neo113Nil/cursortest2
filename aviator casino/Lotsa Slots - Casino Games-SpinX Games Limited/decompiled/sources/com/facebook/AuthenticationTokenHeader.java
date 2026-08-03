package com.facebook;

/* compiled from: AuthenticationTokenHeader.kt */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 $2\u00020\u0001:\u0001$B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u000f\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB\u001f\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0016J\u0010\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0003H\u0002J\b\u0010\u001c\u001a\u00020\u0003H\u0007J\r\u0010\u001d\u001a\u00020\tH\u0000¢\u0006\u0002\b\u001eJ\b\u0010\u001f\u001a\u00020\u0003H\u0016J\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0014H\u0016R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010¨\u0006%"}, d2 = {"Lcom/facebook/AuthenticationTokenHeader;", "Landroid/os/Parcelable;", "encodedHeaderString", "", "(Ljava/lang/String;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "jsonObject", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "alg", com.google.android.gms.fido.u2f.api.common.ClientData.KEY_TYPE, "kid", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAlg", "()Ljava/lang/String;", "getKid", "getTyp", "describeContents", "", "equals", "", "other", "", "hashCode", "isValidHeader", "headerString", "toEnCodedString", "toJSONObject", "toJSONObject$facebook_core_release", "toString", "writeToParcel", "", "dest", "flags", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class AuthenticationTokenHeader implements android.os.Parcelable {
    private final java.lang.String alg;
    private final java.lang.String kid;
    private final java.lang.String typ;
    public static final android.os.Parcelable.Creator<com.facebook.AuthenticationTokenHeader> CREATOR = new android.os.Parcelable.Creator<com.facebook.AuthenticationTokenHeader>() { // from class: com.facebook.AuthenticationTokenHeader$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.facebook.AuthenticationTokenHeader createFromParcel(android.os.Parcel source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
            return new com.facebook.AuthenticationTokenHeader(source);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.facebook.AuthenticationTokenHeader[] newArray(int size) {
            return new com.facebook.AuthenticationTokenHeader[size];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final java.lang.String getAlg() {
        return this.alg;
    }

    public final java.lang.String getTyp() {
        return this.typ;
    }

    public final java.lang.String getKid() {
        return this.kid;
    }

    public AuthenticationTokenHeader(java.lang.String encodedHeaderString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encodedHeaderString, "encodedHeaderString");
        if (!isValidHeader(encodedHeaderString)) {
            throw new java.lang.IllegalArgumentException("Invalid Header".toString());
        }
        byte[] decodedBytes = android.util.Base64.decode(encodedHeaderString, 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(decodedBytes, "decodedBytes");
        org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(decodedBytes, kotlin.text.Charsets.UTF_8));
        java.lang.String string = jSONObject.getString("alg");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "jsonObj.getString(\"alg\")");
        this.alg = string;
        java.lang.String string2 = jSONObject.getString(com.google.android.gms.fido.u2f.api.common.ClientData.KEY_TYPE);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "jsonObj.getString(\"typ\")");
        this.typ = string2;
        java.lang.String string3 = jSONObject.getString("kid");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "jsonObj.getString(\"kid\")");
        this.kid = string3;
    }

    public AuthenticationTokenHeader(android.os.Parcel parcel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        java.lang.String readString = parcel.readString();
        com.facebook.internal.Validate validate = com.facebook.internal.Validate.INSTANCE;
        this.alg = com.facebook.internal.Validate.notNullOrEmpty(readString, "alg");
        java.lang.String readString2 = parcel.readString();
        com.facebook.internal.Validate validate2 = com.facebook.internal.Validate.INSTANCE;
        this.typ = com.facebook.internal.Validate.notNullOrEmpty(readString2, com.google.android.gms.fido.u2f.api.common.ClientData.KEY_TYPE);
        java.lang.String readString3 = parcel.readString();
        com.facebook.internal.Validate validate3 = com.facebook.internal.Validate.INSTANCE;
        this.kid = com.facebook.internal.Validate.notNullOrEmpty(readString3, "kid");
    }

    public AuthenticationTokenHeader(org.json.JSONObject jsonObject) throws org.json.JSONException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        java.lang.String string = jsonObject.getString("alg");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(\"alg\")");
        this.alg = string;
        java.lang.String string2 = jsonObject.getString(com.google.android.gms.fido.u2f.api.common.ClientData.KEY_TYPE);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "jsonObject.getString(\"typ\")");
        this.typ = string2;
        java.lang.String string3 = jsonObject.getString("kid");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "jsonObject.getString(\"kid\")");
        this.kid = string3;
    }

    public AuthenticationTokenHeader(java.lang.String alg, java.lang.String typ, java.lang.String kid) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alg, "alg");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typ, "typ");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kid, "kid");
        this.alg = alg;
        this.typ = typ;
        this.kid = kid;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.alg);
        dest.writeString(this.typ);
        dest.writeString(this.kid);
    }

    public java.lang.String toString() {
        java.lang.String jSONObject = toJSONObject$facebook_core_release().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject, "headerJsonObject.toString()");
        return jSONObject;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.facebook.AuthenticationTokenHeader)) {
            return false;
        }
        com.facebook.AuthenticationTokenHeader authenticationTokenHeader = (com.facebook.AuthenticationTokenHeader) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.alg, authenticationTokenHeader.alg) && kotlin.jvm.internal.Intrinsics.areEqual(this.typ, authenticationTokenHeader.typ) && kotlin.jvm.internal.Intrinsics.areEqual(this.kid, authenticationTokenHeader.kid);
    }

    public int hashCode() {
        return ((((com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.alg.hashCode()) * 31) + this.typ.hashCode()) * 31) + this.kid.hashCode();
    }

    private final boolean isValidHeader(java.lang.String headerString) {
        com.facebook.internal.Validate validate = com.facebook.internal.Validate.INSTANCE;
        com.facebook.internal.Validate.notEmpty(headerString, "encodedHeaderString");
        byte[] decodedBytes = android.util.Base64.decode(headerString, 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(decodedBytes, "decodedBytes");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(decodedBytes, kotlin.text.Charsets.UTF_8));
            java.lang.String alg = jSONObject.optString("alg");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(alg, "alg");
            boolean z = alg.length() > 0 && kotlin.jvm.internal.Intrinsics.areEqual(alg, "RS256");
            java.lang.String optString = jSONObject.optString("kid");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optString, "jsonObj.optString(\"kid\")");
            boolean z2 = optString.length() > 0;
            java.lang.String optString2 = jSONObject.optString(com.google.android.gms.fido.u2f.api.common.ClientData.KEY_TYPE);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optString2, "jsonObj.optString(\"typ\")");
            return z && z2 && (optString2.length() > 0);
        } catch (org.json.JSONException unused) {
            return false;
        }
    }

    public final org.json.JSONObject toJSONObject$facebook_core_release() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("alg", this.alg);
        jSONObject.put(com.google.android.gms.fido.u2f.api.common.ClientData.KEY_TYPE, this.typ);
        jSONObject.put("kid", this.kid);
        return jSONObject;
    }

    public final java.lang.String toEnCodedString() {
        java.lang.String authenticationTokenHeader = toString();
        java.nio.charset.Charset charset = kotlin.text.Charsets.UTF_8;
        if (authenticationTokenHeader == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] bytes = authenticationTokenHeader.getBytes(charset);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        java.lang.String encodeToString = android.util.Base64.encodeToString(bytes, 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(claimsJsonString.toByteArray(), Base64.DEFAULT)");
        return encodeToString;
    }
}
