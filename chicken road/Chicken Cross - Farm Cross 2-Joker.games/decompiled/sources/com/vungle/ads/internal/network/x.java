package com.vungle.ads.internal.network;

/* loaded from: classes7.dex */
public final class x implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.vungle.ads.internal.w f12062a;

    public x(com.vungle.ads.internal.x xVar) {
        this.f12062a = xVar;
    }

    @Override // com.vungle.ads.internal.network.a
    public final void a(o oVar) {
        this.f12062a.onSuccess();
    }

    @Override // com.vungle.ads.internal.network.a
    public final void a(Throwable th) {
        this.f12062a.a();
    }
}
