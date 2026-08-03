package com.fyber.inneractive.sdk.network;

/* loaded from: classes3.dex */
public final class o1 extends com.fyber.inneractive.sdk.network.l {
    public final okhttp3.Response g;

    public o1(com.fyber.inneractive.sdk.network.l lVar, okhttp3.Response response) {
        this.g = response;
        this.d = lVar.d;
        this.c = lVar.c;
        this.e = lVar.e;
        this.f3845a = lVar.f3845a;
    }

    @Override // com.fyber.inneractive.sdk.network.l
    public final void a() {
        super.a();
        okhttp3.Response response = this.g;
        if (response != null) {
            response.close();
        }
    }
}
