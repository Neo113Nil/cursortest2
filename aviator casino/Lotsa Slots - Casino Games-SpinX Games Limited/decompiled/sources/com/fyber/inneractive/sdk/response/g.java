package com.fyber.inneractive.sdk.response;

/* loaded from: classes3.dex */
public class g extends com.fyber.inneractive.sdk.response.e {
    public long K;
    public com.fyber.inneractive.sdk.model.vast.b L;
    public final java.util.ArrayList O = new java.util.ArrayList();
    public final java.util.LinkedHashMap M = new java.util.LinkedHashMap();
    public final java.util.ArrayList N = new java.util.ArrayList();
    public final java.util.LinkedHashMap P = new java.util.LinkedHashMap();

    @Override // com.fyber.inneractive.sdk.response.e
    public com.fyber.inneractive.sdk.external.InneractiveErrorCode a(com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.config.global.r rVar) {
        return com.fyber.inneractive.sdk.flow.vast.j.a(inneractiveAdRequest, this, rVar);
    }

    @Override // com.fyber.inneractive.sdk.response.e
    public com.fyber.inneractive.sdk.external.InneractiveErrorCode b() {
        return a(null, null);
    }
}
