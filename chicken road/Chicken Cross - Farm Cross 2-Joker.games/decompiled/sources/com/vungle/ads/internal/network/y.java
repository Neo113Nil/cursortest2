package com.vungle.ads.internal.network;

/* loaded from: classes7.dex */
public final class y implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.vungle.ads.internal.w f12063a;

    public y(com.vungle.ads.internal.y yVar) {
        this.f12063a = yVar;
    }

    @Override // com.vungle.ads.internal.network.a
    public final void a(o oVar) {
        this.f12063a.onSuccess();
    }

    @Override // com.vungle.ads.internal.network.a
    public final void a(Throwable th) {
        this.f12063a.a();
    }
}
