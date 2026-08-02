package com.zettle.sdk.feature.taptopay.core.transaction;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0011J\u0017\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001d"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/AbortRequestImpl;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/AbortRequest;", "Lcom/zettle/sdk/meta/AppInfo;", "p0", "Lcom/zettle/sdk/feature/taptopay/core/models/SoftspaceReaderInfo;", "p1", "Lcom/zettle/sdk/meta/PlatformInfo;", "p2", "Lcom/zettle/sdk/core/os/LocationData;", "p3", "<init>", "(Lcom/zettle/sdk/meta/AppInfo;Lcom/zettle/sdk/feature/taptopay/core/models/SoftspaceReaderInfo;Lcom/zettle/sdk/meta/PlatformInfo;Lcom/zettle/sdk/core/os/LocationData;)V", "Lcom/izettle/android/net/RequestBody;", "build", "()Lcom/izettle/android/net/RequestBody;", "", "identifier", "(Ljava/lang/String;)Lcom/zettle/sdk/feature/taptopay/core/transaction/AbortRequest;", "Ljava/util/UUID;", "localId", "(Ljava/util/UUID;)Lcom/zettle/sdk/feature/taptopay/core/transaction/AbortRequest;", "reason", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReference;", "references", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReference;)Lcom/zettle/sdk/feature/taptopay/core/transaction/AbortRequest;", "toString", "()Ljava/lang/String;", "Lorg/json/JSONObject;", "getHighSpeedVideoFpsRanges", "Lorg/json/JSONObject;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
final class AbortRequestImpl implements com.zettle.sdk.feature.taptopay.core.transaction.AbortRequest {
    private final org.json.JSONObject getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final org.json.JSONObject Camera2StreamConfigurationMap;

    public AbortRequestImpl(com.zettle.sdk.meta.AppInfo appInfo, com.zettle.sdk.feature.taptopay.core.models.SoftspaceReaderInfo softspaceReaderInfo, com.zettle.sdk.meta.PlatformInfo platformInfo, com.zettle.sdk.core.os.LocationData locationData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(softspaceReaderInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(platformInfo, "");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.zettle.sdk.commons.network.JsonKt.putPlatformInfo(jSONObject, platformInfo);
        com.zettle.sdk.commons.network.JsonKt.putSdkInfo(jSONObject, appInfo);
        com.zettle.sdk.commons.network.JsonKt.putLastLocation(jSONObject, locationData);
        this.getHighResolutionOutputSizeshNQ4ISI = jSONObject;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.putOpt(com.zettle.sdk.commons.network.JsonKt.KEY_REFERENCES_READER_SOFTWARE_VERSION, softspaceReaderInfo.getSdkVersion());
        this.Camera2StreamConfigurationMap = jSONObject2;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.AbortRequest
    public final com.zettle.sdk.feature.taptopay.core.transaction.AbortRequest references(com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        p0.packToObject$core_publicRelease(this.Camera2StreamConfigurationMap);
        this.getHighResolutionOutputSizeshNQ4ISI.put(com.zettle.sdk.commons.network.JsonKt.KEY_REFERENCES, this.Camera2StreamConfigurationMap);
        return this;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.AbortRequest
    public final com.zettle.sdk.feature.taptopay.core.transaction.AbortRequest localId(java.util.UUID p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        this.Camera2StreamConfigurationMap.put(com.zettle.sdk.commons.network.JsonKt.KEY_REFERENCES_LOCAL_TRANSACTION_UUID, p0.toString());
        return this;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.AbortRequest
    public final com.zettle.sdk.feature.taptopay.core.transaction.AbortRequest identifier(java.lang.String p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        this.getHighResolutionOutputSizeshNQ4ISI.put(com.zettle.sdk.commons.network.JsonKt.KEY_READER_IDENTIFIER, p0);
        return this;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.AbortRequest
    public final com.zettle.sdk.feature.taptopay.core.transaction.AbortRequest reason(java.lang.String p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        this.getHighResolutionOutputSizeshNQ4ISI.put(com.zettle.sdk.commons.network.JsonKt.KEY_REVERSAL_REASON, p0);
        return this;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.AbortRequest
    public final com.izettle.android.net.RequestBody build() {
        return com.zettle.sdk.feature.taptopay.core.transaction.TransactionRequestKt.access$toRequestBody(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final java.lang.String toString() {
        java.lang.String jSONObject = this.getHighResolutionOutputSizeshNQ4ISI.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject, "");
        return jSONObject;
    }
}
