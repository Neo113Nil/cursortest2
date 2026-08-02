package com.zettle.sdk.feature.taptopay.core.transaction;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001a"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/FinalizeRequestImpl;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/FinalizeRequest;", "Lcom/zettle/sdk/feature/taptopay/core/models/SoftspaceReaderInfo;", "p0", "Lcom/zettle/sdk/meta/PlatformInfo;", "p1", "Lcom/zettle/sdk/core/os/LocationData;", "p2", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/models/SoftspaceReaderInfo;Lcom/zettle/sdk/meta/PlatformInfo;Lcom/zettle/sdk/core/os/LocationData;)V", "Lcom/izettle/android/net/RequestBody;", "build", "()Lcom/izettle/android/net/RequestBody;", "", "identifier", "(Ljava/lang/String;)Lcom/zettle/sdk/feature/taptopay/core/transaction/FinalizeRequest;", "Ljava/util/UUID;", "localId", "(Ljava/util/UUID;)Lcom/zettle/sdk/feature/taptopay/core/transaction/FinalizeRequest;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReference;", "references", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReference;)Lcom/zettle/sdk/feature/taptopay/core/transaction/FinalizeRequest;", "toString", "()Ljava/lang/String;", "Lorg/json/JSONObject;", "getHighSpeedVideoSizes", "Lorg/json/JSONObject;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
final class FinalizeRequestImpl implements com.zettle.sdk.feature.taptopay.core.transaction.FinalizeRequest {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final org.json.JSONObject getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final org.json.JSONObject Camera2StreamConfigurationMap;

    public FinalizeRequestImpl(com.zettle.sdk.feature.taptopay.core.models.SoftspaceReaderInfo softspaceReaderInfo, com.zettle.sdk.meta.PlatformInfo platformInfo, com.zettle.sdk.core.os.LocationData locationData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(softspaceReaderInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(platformInfo, "");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.zettle.sdk.commons.network.JsonKt.putPlatformInfo(jSONObject, platformInfo);
        com.zettle.sdk.commons.network.JsonKt.putLastLocation(jSONObject, locationData);
        this.getHighSpeedVideoSizes = jSONObject;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.putOpt(com.zettle.sdk.commons.network.JsonKt.KEY_REFERENCES_READER_SOFTWARE_VERSION, softspaceReaderInfo.getSdkVersion());
        this.Camera2StreamConfigurationMap = jSONObject2;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.FinalizeRequest
    public final com.zettle.sdk.feature.taptopay.core.transaction.FinalizeRequest identifier(java.lang.String p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        this.getHighSpeedVideoSizes.put(com.zettle.sdk.commons.network.JsonKt.KEY_READER_IDENTIFIER, "com.softspace.1");
        return this;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.FinalizeRequest
    public final com.zettle.sdk.feature.taptopay.core.transaction.FinalizeRequest references(com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        p0.packToObject$core_publicRelease(this.Camera2StreamConfigurationMap);
        this.getHighSpeedVideoSizes.put(com.zettle.sdk.commons.network.JsonKt.KEY_REFERENCES, this.Camera2StreamConfigurationMap);
        return this;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.FinalizeRequest
    public final com.zettle.sdk.feature.taptopay.core.transaction.FinalizeRequest localId(java.util.UUID p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        this.Camera2StreamConfigurationMap.putOpt(com.zettle.sdk.commons.network.JsonKt.KEY_REFERENCES_LOCAL_TRANSACTION_UUID, p0.toString());
        return this;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.FinalizeRequest
    public final com.izettle.android.net.RequestBody build() {
        return com.zettle.sdk.feature.taptopay.core.transaction.TransactionRequestKt.access$toRequestBody(this.getHighSpeedVideoSizes);
    }

    public final java.lang.String toString() {
        java.lang.String jSONObject = this.getHighSpeedVideoSizes.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject, "");
        return jSONObject;
    }
}
