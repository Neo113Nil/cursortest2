package com.fyber.inneractive.sdk.bidder.adm;

import com.fyber.inneractive.sdk.network.p0;

/* loaded from: classes4.dex */
public final class w implements p0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f5189a;

    public w(y yVar) {
        this.f5189a = yVar;
    }

    @Override // com.fyber.inneractive.sdk.network.p0
    public final void a(String str) {
        str.hashCode();
        switch (str) {
            case "sdkInitNetworkRequest":
                com.fyber.inneractive.sdk.metrics.d dVar = com.fyber.inneractive.sdk.metrics.d.d;
                dVar.a(this.f5189a.d).f();
                dVar.b(this.f5189a.d).c = System.currentTimeMillis();
                break;
            case "sdkGotServerResponse":
                com.fyber.inneractive.sdk.metrics.d.d.a(this.f5189a.d).h();
                break;
            case "sdkParsedResponse":
                com.fyber.inneractive.sdk.metrics.d.d.a(this.f5189a.d).d();
                break;
            case "sdkRequestEndedButWillBeRetried":
                com.fyber.inneractive.sdk.metrics.i b = com.fyber.inneractive.sdk.metrics.d.d.b(this.f5189a.d);
                b.f5451a.put(new com.fyber.inneractive.sdk.metrics.h("retrying"), Long.valueOf(System.currentTimeMillis() - b.c));
                break;
        }
    }
}
