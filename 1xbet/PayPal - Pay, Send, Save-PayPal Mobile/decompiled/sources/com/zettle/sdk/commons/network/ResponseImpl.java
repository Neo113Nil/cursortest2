package com.zettle.sdk.commons.network;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/zettle/sdk/commons/network/ResponseImpl;", "Lcom/zettle/sdk/commons/network/Response;", "", "p0", "Lorg/json/JSONObject;", "p1", "<init>", "(ILorg/json/JSONObject;)V", "T", "Lcom/zettle/sdk/commons/network/Response$Parser;", "payload", "(Lcom/zettle/sdk/commons/network/Response$Parser;)Ljava/lang/Object;", "", "getHighSpeedVideoFpsRangesFor", "Z", "getHasPayload", "()Z", "getHighResolutionOutputSizeshNQ4ISI", "Lorg/json/JSONObject;", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup, "getStatus", "()I", "getHighSpeedVideoSizes"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
final class ResponseImpl implements com.zettle.sdk.commons.network.Response {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final org.json.JSONObject getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final int getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final boolean getHighResolutionOutputSizeshNQ4ISI;

    public ResponseImpl(int i, org.json.JSONObject jSONObject) {
        this.getHighSpeedVideoSizes = i;
        this.getHighSpeedVideoFpsRanges = jSONObject;
        this.getHighResolutionOutputSizeshNQ4ISI = jSONObject != null;
    }

    @Override // com.zettle.sdk.commons.network.Response
    /* renamed from: getStatus, reason: from getter */
    public final int getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // com.zettle.sdk.commons.network.Response
    /* renamed from: getHasPayload, reason: from getter */
    public final boolean getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // com.zettle.sdk.commons.network.Response
    public final <T> T payload(com.zettle.sdk.commons.network.Response.Parser<T> p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        org.json.JSONObject jSONObject = this.getHighSpeedVideoFpsRanges;
        if (jSONObject == null) {
            throw new java.io.IOException("Response has no payload");
        }
        return p0.parse(jSONObject);
    }
}
