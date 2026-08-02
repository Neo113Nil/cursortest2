package com.zettle.sdk.commons.network.service;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0011\n\u0002\b\t\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0006\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR.\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0006\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/zettle/sdk/commons/network/service/ServiceResponse;", "", "", "code", "", "", "", "payload", "<init>", "(ILjava/util/Map;)V", com.visa.cbp.getEncExpo.warmup, "getCode", "()I", "Ljava/util/Map;", "getPayload", "()Ljava/util/Map;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ServiceResponse {
    private final int code;
    private final java.util.Map<java.lang.String, java.lang.String[]> payload;

    public ServiceResponse(int i, java.util.Map<java.lang.String, java.lang.String[]> map) {
        this.code = i;
        this.payload = map;
    }

    public final int getCode() {
        return this.code;
    }

    public final java.util.Map<java.lang.String, java.lang.String[]> getPayload() {
        return this.payload;
    }
}
