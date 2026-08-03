package com.fyber.inneractive.sdk.network;

/* loaded from: classes3.dex */
public final class r implements com.fyber.inneractive.sdk.network.p0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.network.s f3854a;

    public r(com.fyber.inneractive.sdk.network.s sVar) {
        this.f3854a = sVar;
    }

    @Override // com.fyber.inneractive.sdk.network.p0
    public final void a(java.lang.String str) {
        str.hashCode();
        switch (str) {
            case "sdkInitNetworkRequest":
                com.fyber.inneractive.sdk.metrics.d.d.a(this.f3854a.d).f();
                break;
            case "sdkGotServerResponse":
                com.fyber.inneractive.sdk.metrics.d.d.a(this.f3854a.d).g();
                break;
            case "sdkParsedResponse":
                com.fyber.inneractive.sdk.metrics.d.d.a(this.f3854a.d).d();
                break;
        }
    }
}
