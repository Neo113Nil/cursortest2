package com.fyber.inneractive.sdk.response.nativead;

/* loaded from: classes3.dex */
public final class j extends com.fyber.inneractive.sdk.response.g {
    public final com.fyber.inneractive.sdk.response.nativead.k Q = new com.fyber.inneractive.sdk.response.nativead.k();

    @Override // com.fyber.inneractive.sdk.response.g, com.fyber.inneractive.sdk.response.e
    public final com.fyber.inneractive.sdk.external.InneractiveErrorCode a(com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.config.global.r rVar) {
        com.fyber.inneractive.sdk.external.InneractiveErrorCode a2 = this.Q.d() ? com.fyber.inneractive.sdk.flow.vast.j.a(inneractiveAdRequest, this, rVar) : null;
        if (a2 != null) {
            return a2;
        }
        this.Q.getClass();
        return null;
    }

    @Override // com.fyber.inneractive.sdk.response.g, com.fyber.inneractive.sdk.response.e
    public final com.fyber.inneractive.sdk.external.InneractiveErrorCode b() {
        return a(null, null);
    }
}
