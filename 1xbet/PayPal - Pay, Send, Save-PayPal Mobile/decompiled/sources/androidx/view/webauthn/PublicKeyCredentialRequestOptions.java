package androidx.view.webauthn;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018"}, d2 = {"Landroidx/credentials/webauthn/PublicKeyCredentialRequestOptions;", "", "", "requestJson", "<init>", "(Ljava/lang/String;)V", "Lorg/json/JSONObject;", "json", "Lorg/json/JSONObject;", "getJson", "()Lorg/json/JSONObject;", "", com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, "[B", "getChallenge", "()[B", "", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "J", "getTimeout", "()J", "rpId", "Ljava/lang/String;", "getRpId", "()Ljava/lang/String;", "userVerification", "getUserVerification"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PublicKeyCredentialRequestOptions {
    private final byte[] challenge;
    private final org.json.JSONObject json;
    private final java.lang.String rpId;
    private final long timeout;
    private final java.lang.String userVerification;

    public PublicKeyCredentialRequestOptions(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        this.json = jSONObject;
        java.lang.String string = jSONObject.getString(com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE);
        androidx.view.webauthn.WebAuthnUtils.Companion companion = androidx.view.webauthn.WebAuthnUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(string);
        this.challenge = companion.b64Decode(string);
        this.timeout = jSONObject.optLong(com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, 0L);
        java.lang.String optString = jSONObject.optString("rpId", "");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optString, "");
        this.rpId = optString;
        java.lang.String optString2 = jSONObject.optString("userVerification", "preferred");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optString2, "");
        this.userVerification = optString2;
    }

    public final org.json.JSONObject getJson() {
        return this.json;
    }

    public final byte[] getChallenge() {
        return this.challenge;
    }

    public final long getTimeout() {
        return this.timeout;
    }

    public final java.lang.String getRpId() {
        return this.rpId;
    }

    public final java.lang.String getUserVerification() {
        return this.userVerification;
    }
}
