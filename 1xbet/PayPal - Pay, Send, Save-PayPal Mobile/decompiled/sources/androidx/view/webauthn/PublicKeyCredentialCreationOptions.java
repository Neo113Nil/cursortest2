package androidx.view.webauthn;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010!\u001a\u00020 8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R(\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u001a8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u0010\u001d\u001a\u0004\b)\u0010\u001f\"\u0004\b*\u0010+R\"\u0010-\u001a\u00020,8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00103\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u0010\u0005"}, d2 = {"Landroidx/credentials/webauthn/PublicKeyCredentialCreationOptions;", "", "", "requestJson", "<init>", "(Ljava/lang/String;)V", "Lorg/json/JSONObject;", "json", "Lorg/json/JSONObject;", "getJson", "()Lorg/json/JSONObject;", "Landroidx/credentials/webauthn/PublicKeyCredentialRpEntity;", "rp", "Landroidx/credentials/webauthn/PublicKeyCredentialRpEntity;", "getRp", "()Landroidx/credentials/webauthn/PublicKeyCredentialRpEntity;", "Landroidx/credentials/webauthn/PublicKeyCredentialUserEntity;", "user", "Landroidx/credentials/webauthn/PublicKeyCredentialUserEntity;", "getUser", "()Landroidx/credentials/webauthn/PublicKeyCredentialUserEntity;", "", com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, "[B", "getChallenge", "()[B", "", "Landroidx/credentials/webauthn/PublicKeyCredentialParameters;", "pubKeyCredParams", "Ljava/util/List;", "getPubKeyCredParams", "()Ljava/util/List;", "", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "J", "getTimeout", "()J", "setTimeout", "(J)V", "Landroidx/credentials/webauthn/PublicKeyCredentialDescriptor;", "excludeCredentials", "getExcludeCredentials", "setExcludeCredentials", "(Ljava/util/List;)V", "Landroidx/credentials/webauthn/AuthenticatorSelectionCriteria;", "authenticatorSelection", "Landroidx/credentials/webauthn/AuthenticatorSelectionCriteria;", "getAuthenticatorSelection", "()Landroidx/credentials/webauthn/AuthenticatorSelectionCriteria;", "setAuthenticatorSelection", "(Landroidx/credentials/webauthn/AuthenticatorSelectionCriteria;)V", "attestation", "Ljava/lang/String;", "getAttestation", "()Ljava/lang/String;", "setAttestation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PublicKeyCredentialCreationOptions {
    private java.lang.String attestation;
    private androidx.view.webauthn.AuthenticatorSelectionCriteria authenticatorSelection;
    private final byte[] challenge;
    private java.util.List<androidx.view.webauthn.PublicKeyCredentialDescriptor> excludeCredentials;
    private final org.json.JSONObject json;
    private final java.util.List<androidx.view.webauthn.PublicKeyCredentialParameters> pubKeyCredParams;
    private final androidx.view.webauthn.PublicKeyCredentialRpEntity rp;
    private long timeout;
    private final androidx.view.webauthn.PublicKeyCredentialUserEntity user;

    public PublicKeyCredentialCreationOptions(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        this.json = jSONObject;
        java.lang.String string = jSONObject.getString(com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE);
        androidx.view.webauthn.WebAuthnUtils.Companion companion = androidx.view.webauthn.WebAuthnUtils.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(string);
        this.challenge = companion.b64Decode(string);
        org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("rp");
        java.lang.String string2 = jSONObject2.getString("name");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "");
        java.lang.String string3 = jSONObject2.getString("id");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "");
        this.rp = new androidx.view.webauthn.PublicKeyCredentialRpEntity(string2, string3);
        org.json.JSONObject jSONObject3 = jSONObject.getJSONObject("user");
        androidx.view.webauthn.WebAuthnUtils.Companion companion2 = androidx.view.webauthn.WebAuthnUtils.INSTANCE;
        java.lang.String string4 = jSONObject3.getString("id");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string4, "");
        byte[] b64Decode = companion2.b64Decode(string4);
        java.lang.String string5 = jSONObject3.getString("name");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string5, "");
        java.lang.String string6 = jSONObject3.getString("displayName");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string6, "");
        this.user = new androidx.view.webauthn.PublicKeyCredentialUserEntity(string5, b64Decode, string6);
        org.json.JSONArray jSONArray = jSONObject.getJSONArray("pubKeyCredParams");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            org.json.JSONObject jSONObject4 = jSONArray.getJSONObject(i);
            java.lang.String string7 = jSONObject4.getString("type");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string7, "");
            arrayList.add(new androidx.view.webauthn.PublicKeyCredentialParameters(string7, jSONObject4.getLong("alg")));
        }
        this.pubKeyCredParams = kotlin.collections.CollectionsKt.toList(arrayList);
        this.timeout = this.json.optLong(com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, 0L);
        this.excludeCredentials = kotlin.collections.CollectionsKt.emptyList();
        this.authenticatorSelection = new androidx.view.webauthn.AuthenticatorSelectionCriteria(com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_AUTHENTICATOR_ATTACHMENT, com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_RESIDENT_KEY, false, null, 12, null);
        java.lang.String optString = this.json.optString("attestation", "none");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optString, "");
        this.attestation = optString;
    }

    public final org.json.JSONObject getJson() {
        return this.json;
    }

    public final androidx.view.webauthn.PublicKeyCredentialRpEntity getRp() {
        return this.rp;
    }

    public final androidx.view.webauthn.PublicKeyCredentialUserEntity getUser() {
        return this.user;
    }

    public final byte[] getChallenge() {
        return this.challenge;
    }

    public final java.util.List<androidx.view.webauthn.PublicKeyCredentialParameters> getPubKeyCredParams() {
        return this.pubKeyCredParams;
    }

    public final long getTimeout() {
        return this.timeout;
    }

    public final void setTimeout(long j) {
        this.timeout = j;
    }

    public final java.util.List<androidx.view.webauthn.PublicKeyCredentialDescriptor> getExcludeCredentials() {
        return this.excludeCredentials;
    }

    public final void setExcludeCredentials(java.util.List<androidx.view.webauthn.PublicKeyCredentialDescriptor> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.excludeCredentials = list;
    }

    public final androidx.view.webauthn.AuthenticatorSelectionCriteria getAuthenticatorSelection() {
        return this.authenticatorSelection;
    }

    public final void setAuthenticatorSelection(androidx.view.webauthn.AuthenticatorSelectionCriteria authenticatorSelectionCriteria) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticatorSelectionCriteria, "");
        this.authenticatorSelection = authenticatorSelectionCriteria;
    }

    public final java.lang.String getAttestation() {
        return this.attestation;
    }

    public final void setAttestation(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.attestation = str;
    }
}
