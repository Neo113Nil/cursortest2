package com.zettle.sdk.feature.taptopay.core.transaction;

@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0011J\u0017\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010#\u001a\u00020\"\"\u0004\b\u0000\u0010 *\b\u0012\u0004\u0012\u00028\u00000!H\u0002¢\u0006\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010&R\u0014\u0010)\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010&"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/SignatureRequestImpl;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/SignatureRequest;", "Lcom/zettle/sdk/meta/AppInfo;", "p0", "Lcom/zettle/sdk/feature/taptopay/core/models/SoftspaceReaderInfo;", "p1", "Lcom/zettle/sdk/meta/PlatformInfo;", "p2", "Lcom/zettle/sdk/core/os/LocationData;", "p3", "<init>", "(Lcom/zettle/sdk/meta/AppInfo;Lcom/zettle/sdk/feature/taptopay/core/models/SoftspaceReaderInfo;Lcom/zettle/sdk/meta/PlatformInfo;Lcom/zettle/sdk/core/os/LocationData;)V", "Lcom/izettle/android/net/RequestBody;", "build", "()Lcom/izettle/android/net/RequestBody;", "", "identifier", "(Ljava/lang/String;)Lcom/zettle/sdk/feature/taptopay/core/transaction/SignatureRequest;", "Ljava/util/UUID;", "localId", "(Ljava/util/UUID;)Lcom/zettle/sdk/feature/taptopay/core/transaction/SignatureRequest;", "protocolState", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReference;", "references", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReference;)Lcom/zettle/sdk/feature/taptopay/core/transaction/SignatureRequest;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/Signature;", "signature", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/models/Signature;)Lcom/zettle/sdk/feature/taptopay/core/transaction/SignatureRequest;", "skipSignature", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/SignatureRequest;", "toString", "()Ljava/lang/String;", "T", "", "Lorg/json/JSONArray;", "getHighSpeedVideoFpsRangesFor", "(Ljava/util/List;)Lorg/json/JSONArray;", "Lorg/json/JSONObject;", "Lorg/json/JSONObject;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
final class SignatureRequestImpl implements com.zettle.sdk.feature.taptopay.core.transaction.SignatureRequest {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final org.json.JSONObject getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final org.json.JSONObject getHighSpeedVideoSizes;

    public SignatureRequestImpl(com.zettle.sdk.meta.AppInfo appInfo, com.zettle.sdk.feature.taptopay.core.models.SoftspaceReaderInfo softspaceReaderInfo, com.zettle.sdk.meta.PlatformInfo platformInfo, com.zettle.sdk.core.os.LocationData locationData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(softspaceReaderInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(platformInfo, "");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.zettle.sdk.commons.network.JsonKt.putSdkInfo(jSONObject, appInfo);
        com.zettle.sdk.commons.network.JsonKt.putLastLocation(jSONObject, locationData);
        com.zettle.sdk.commons.network.JsonKt.putPlatformInfo(jSONObject, platformInfo);
        this.getHighSpeedVideoFpsRanges = jSONObject;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.putOpt(com.zettle.sdk.commons.network.JsonKt.KEY_REFERENCES_READER_SOFTWARE_VERSION, softspaceReaderInfo.getSdkVersion());
        this.getHighSpeedVideoSizes = jSONObject2;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.SignatureRequest
    public final com.zettle.sdk.feature.taptopay.core.transaction.SignatureRequest references(com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        p0.packToObject$core_publicRelease(this.getHighSpeedVideoSizes);
        this.getHighSpeedVideoFpsRanges.put(com.zettle.sdk.commons.network.JsonKt.KEY_REFERENCES, this.getHighSpeedVideoSizes);
        return this;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.SignatureRequest
    public final com.zettle.sdk.feature.taptopay.core.transaction.SignatureRequest localId(java.util.UUID p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        this.getHighSpeedVideoSizes.put(com.zettle.sdk.commons.network.JsonKt.KEY_REFERENCES_LOCAL_TRANSACTION_UUID, p0.toString());
        return this;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.SignatureRequest
    public final com.zettle.sdk.feature.taptopay.core.transaction.SignatureRequest signature(com.zettle.sdk.feature.taptopay.core.transaction.models.Signature p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        this.getHighSpeedVideoFpsRanges.putOpt(com.zettle.sdk.commons.network.JsonKt.KEY_SIGNATURE_POINTS, getHighSpeedVideoFpsRangesFor(p0.getPoints$core_publicRelease()));
        return this;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.SignatureRequest
    public final com.zettle.sdk.feature.taptopay.core.transaction.SignatureRequest skipSignature() {
        this.getHighSpeedVideoFpsRanges.put(com.zettle.sdk.commons.network.JsonKt.KEY_SIGNATURE_SKIPPED, true);
        return this;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.SignatureRequest
    public final com.zettle.sdk.feature.taptopay.core.transaction.SignatureRequest protocolState(java.lang.String p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        this.getHighSpeedVideoFpsRanges.put(com.zettle.sdk.commons.network.JsonKt.KEY_EMV_PROTOCOL_STATE, p0);
        return this;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.SignatureRequest
    public final com.zettle.sdk.feature.taptopay.core.transaction.SignatureRequest identifier(java.lang.String p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        this.getHighSpeedVideoFpsRanges.put(com.zettle.sdk.commons.network.JsonKt.KEY_READER_IDENTIFIER, p0);
        return this;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.SignatureRequest
    public final com.izettle.android.net.RequestBody build() {
        return com.zettle.sdk.feature.taptopay.core.transaction.TransactionRequestKt.access$toRequestBody(this.getHighSpeedVideoFpsRanges);
    }

    public final java.lang.String toString() {
        java.lang.String jSONObject = this.getHighSpeedVideoFpsRanges.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject, "");
        return jSONObject;
    }

    private final <T> org.json.JSONArray getHighSpeedVideoFpsRangesFor(java.util.List<? extends T> list) {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (java.lang.Object obj : list) {
            if (obj instanceof java.util.List) {
                jSONArray.put(getHighSpeedVideoFpsRangesFor((java.util.List) obj));
            } else if (obj instanceof kotlin.Triple) {
                jSONArray.put(getHighSpeedVideoFpsRangesFor(kotlin.TuplesKt.toList((kotlin.Triple) obj)));
            } else {
                jSONArray.put(obj);
            }
        }
        return jSONArray;
    }
}
