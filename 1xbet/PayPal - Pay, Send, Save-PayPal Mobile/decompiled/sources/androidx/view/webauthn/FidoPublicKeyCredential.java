package androidx.view.webauthn;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u000b"}, d2 = {"Landroidx/credentials/webauthn/FidoPublicKeyCredential;", "", "", "rawId", "Landroidx/credentials/webauthn/AuthenticatorResponse;", "response", "", "authenticatorAttachment", "<init>", "([BLandroidx/credentials/webauthn/AuthenticatorResponse;Ljava/lang/String;)V", "json", "()Ljava/lang/String;", "[B", "getRawId", "()[B", "Landroidx/credentials/webauthn/AuthenticatorResponse;", "getResponse", "()Landroidx/credentials/webauthn/AuthenticatorResponse;", "Ljava/lang/String;", "getAuthenticatorAttachment"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FidoPublicKeyCredential {
    private final java.lang.String authenticatorAttachment;
    private final byte[] rawId;
    private final androidx.view.webauthn.AuthenticatorResponse response;

    public FidoPublicKeyCredential(byte[] bArr, androidx.view.webauthn.AuthenticatorResponse authenticatorResponse, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticatorResponse, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.rawId = bArr;
        this.response = authenticatorResponse;
        this.authenticatorAttachment = str;
    }

    public final byte[] getRawId() {
        return this.rawId;
    }

    public final androidx.view.webauthn.AuthenticatorResponse getResponse() {
        return this.response;
    }

    public final java.lang.String getAuthenticatorAttachment() {
        return this.authenticatorAttachment;
    }

    public final java.lang.String json() {
        java.lang.String b64Encode = androidx.view.webauthn.WebAuthnUtils.INSTANCE.b64Encode(this.rawId);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("id", b64Encode);
        jSONObject.put("rawId", b64Encode);
        jSONObject.put("type", "public-key");
        jSONObject.put("authenticatorAttachment", this.authenticatorAttachment);
        jSONObject.put("response", this.response.json());
        jSONObject.put("clientExtensionResults", new org.json.JSONObject());
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject2, "");
        return jSONObject2;
    }
}
