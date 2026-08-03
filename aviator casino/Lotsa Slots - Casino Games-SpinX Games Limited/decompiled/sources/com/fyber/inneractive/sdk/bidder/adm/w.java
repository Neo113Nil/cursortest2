package com.fyber.inneractive.sdk.bidder.adm;

/* loaded from: classes3.dex */
public final class w implements com.fyber.inneractive.sdk.network.p0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.bidder.adm.y f3540a;

    public w(com.fyber.inneractive.sdk.bidder.adm.y yVar) {
        this.f3540a = yVar;
    }

    @Override // com.fyber.inneractive.sdk.network.p0
    public final void a(java.lang.String str) {
        str.hashCode();
        switch (str) {
            case "sdkInitNetworkRequest":
                com.fyber.inneractive.sdk.metrics.d dVar = com.fyber.inneractive.sdk.metrics.d.d;
                dVar.a(this.f3540a.d).f();
                dVar.b(this.f3540a.d).c = java.lang.System.currentTimeMillis();
                break;
            case "sdkGotServerResponse":
                com.fyber.inneractive.sdk.metrics.d.d.a(this.f3540a.d).h();
                break;
            case "sdkParsedResponse":
                com.fyber.inneractive.sdk.metrics.d.d.a(this.f3540a.d).d();
                break;
            case "sdkRequestEndedButWillBeRetried":
                com.fyber.inneractive.sdk.metrics.i b = com.fyber.inneractive.sdk.metrics.d.d.b(this.f3540a.d);
                b.f3797a.put(new com.fyber.inneractive.sdk.metrics.h("retrying"), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - b.c));
                break;
        }
    }
}
