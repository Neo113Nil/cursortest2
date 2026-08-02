package androidx.view.webauthn;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0014\u0010 \u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u001c\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010!\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R\u0014\u0010$\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\"R\u0014\u0010\u0017\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\"R\u0016\u0010#\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001fR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\"\u0010%\u001a\u00020\u00148\u0017@\u0017X\u0096\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0016\"\u0004\b(\u0010)R\"\u0010*\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010\u001a\u001a\u0004\b+\u0010\u0013\"\u0004\b,\u0010-"}, d2 = {"Landroidx/credentials/webauthn/AuthenticatorAttestationResponse;", "Landroidx/credentials/webauthn/AuthenticatorResponse;", "Landroidx/credentials/webauthn/PublicKeyCredentialCreationOptions;", "requestOptions", "", "credentialId", "credentialPublicKey", "", "origin", "", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_UP, "uv", "be", "bs", com.visa.cbp.ConsumerInfo.setSignature, "clientDataHash", "<init>", "(Landroidx/credentials/webauthn/PublicKeyCredentialCreationOptions;[B[BLjava/lang/String;ZZZZLjava/lang/String;[B)V", "defaultAttestationObject$credentials_release", "()[B", "Lorg/json/JSONObject;", "json", "()Lorg/json/JSONObject;", "getOutputFormats", "Landroidx/credentials/webauthn/PublicKeyCredentialCreationOptions;", "getHighSpeedVideoFpsRanges", "[B", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "getInputSizeshNQ4ISI", "Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizesFor", "Z", "getOutputMinFrameDuration", "getInputFormats", "clientJson", "Lorg/json/JSONObject;", "getClientJson", "setClientJson", "(Lorg/json/JSONObject;)V", "attestationObject", "getAttestationObject", "setAttestationObject", "([B)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AuthenticatorAttestationResponse implements androidx.view.webauthn.AuthenticatorResponse {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final byte[] getHighSpeedVideoFpsRangesFor;
    private byte[] attestationObject;
    private org.json.JSONObject clientJson;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final boolean getOutputFormats;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final byte[] getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final boolean getInputFormats;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final byte[] getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final boolean Camera2StreamConfigurationMap;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final java.lang.String getOutputMinFrameDuration;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final androidx.view.webauthn.PublicKeyCredentialCreationOptions getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoSizesFor;

    public AuthenticatorAttestationResponse(androidx.view.webauthn.PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions, byte[] bArr, byte[] bArr2, java.lang.String str, boolean z, boolean z2, boolean z3, boolean z4, java.lang.String str2, byte[] bArr3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicKeyCredentialCreationOptions, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.getHighSpeedVideoFpsRanges = publicKeyCredentialCreationOptions;
        this.getHighSpeedVideoSizes = bArr;
        this.getHighSpeedVideoFpsRangesFor = bArr2;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.Camera2StreamConfigurationMap = z;
        this.getHighSpeedVideoSizesFor = z2;
        this.getInputFormats = z3;
        this.getOutputFormats = z4;
        this.getOutputMinFrameDuration = str2;
        this.getInputSizeshNQ4ISI = bArr3;
        this.clientJson = new org.json.JSONObject();
        getClientJson().put("type", "webauthn.create");
        getClientJson().put(com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, androidx.view.webauthn.WebAuthnUtils.INSTANCE.b64Encode(publicKeyCredentialCreationOptions.getChallenge()));
        getClientJson().put("origin", str);
        if (str2 != null) {
            getClientJson().put("androidPackageName", str2);
        }
        this.attestationObject = defaultAttestationObject$credentials_release();
    }

    public /* synthetic */ AuthenticatorAttestationResponse(androidx.view.webauthn.PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions, byte[] bArr, byte[] bArr2, java.lang.String str, boolean z, boolean z2, boolean z3, boolean z4, java.lang.String str2, byte[] bArr3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(publicKeyCredentialCreationOptions, bArr, bArr2, str, z, z2, z3, z4, (i & 256) != 0 ? null : str2, (i & 512) != 0 ? null : bArr3);
    }

    @Override // androidx.view.webauthn.AuthenticatorResponse
    public final org.json.JSONObject getClientJson() {
        return this.clientJson;
    }

    @Override // androidx.view.webauthn.AuthenticatorResponse
    public final void setClientJson(org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jSONObject, "");
        this.clientJson = jSONObject;
    }

    public final byte[] getAttestationObject() {
        return this.attestationObject;
    }

    public final void setAttestationObject(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        this.attestationObject = bArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public final byte[] defaultAttestationObject$credentials_release() {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("fmt", "none");
        linkedHashMap.put("attStmt", kotlin.collections.MapsKt.emptyMap());
        java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-256");
        byte[] bytes = this.getHighSpeedVideoFpsRanges.getRp().getId().getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] digest = messageDigest.digest(bytes);
        boolean z = this.Camera2StreamConfigurationMap;
        boolean z2 = z;
        if (this.getHighSpeedVideoSizesFor) {
            z2 = (z ? 1 : 0) | 4;
        }
        boolean z3 = z2;
        if (this.getInputFormats) {
            z3 = (z2 ? 1 : 0) | '\b';
        }
        ?? r2 = z3;
        if (this.getOutputFormats) {
            r2 = (z3 ? 1 : 0) | 16;
        }
        byte[] bArr = new byte[16];
        for (int i = 0; i < 16; i++) {
            bArr[i] = 0;
        }
        byte[] bArr2 = this.getHighSpeedVideoSizes;
        byte[] bArr3 = {(byte) (bArr2.length >> 8), (byte) bArr2.length};
        kotlin.jvm.internal.Intrinsics.checkNotNull(digest);
        linkedHashMap.put("authData", kotlin.collections.ArraysKt.plus(kotlin.collections.ArraysKt.plus(kotlin.collections.ArraysKt.plus(kotlin.collections.ArraysKt.plus(kotlin.collections.ArraysKt.plus(kotlin.collections.ArraysKt.plus(digest, new byte[]{(byte) (r2 | 64)}), new byte[]{0, 0, 0, 0}), bArr), bArr3), this.getHighSpeedVideoSizes), this.getHighSpeedVideoFpsRangesFor));
        return new androidx.view.webauthn.Cbor().encode(linkedHashMap);
    }

    @Override // androidx.view.webauthn.AuthenticatorResponse
    public final org.json.JSONObject json() {
        java.lang.String jSONObject = getClientJson().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject, "");
        byte[] bytes = jSONObject.getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        if (this.getInputSizeshNQ4ISI == null) {
            jSONObject2.put("clientDataJSON", androidx.view.webauthn.WebAuthnUtils.INSTANCE.b64Encode(bytes));
        }
        jSONObject2.put("attestationObject", androidx.view.webauthn.WebAuthnUtils.INSTANCE.b64Encode(this.attestationObject));
        jSONObject2.put("transports", new org.json.JSONArray((java.util.Collection) kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"internal", "hybrid"})));
        return jSONObject2;
    }
}
