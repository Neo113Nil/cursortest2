package com.fyber.inneractive.sdk.network;

/* loaded from: classes4.dex */
public final class r implements p0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f5508a;

    public r(s sVar) {
        this.f5508a = sVar;
    }

    @Override // com.fyber.inneractive.sdk.network.p0
    public final void a(String str) {
        str.hashCode();
        switch (str) {
            case "sdkInitNetworkRequest":
                com.fyber.inneractive.sdk.metrics.d.d.a(this.f5508a.d).f();
                break;
            case "sdkGotServerResponse":
                com.fyber.inneractive.sdk.metrics.d.d.a(this.f5508a.d).g();
                break;
            case "sdkParsedResponse":
                com.fyber.inneractive.sdk.metrics.d.d.a(this.f5508a.d).d();
                break;
        }
    }
}
