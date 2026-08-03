package com.fyber.inneractive.sdk.flow.nativead;

/* loaded from: classes3.dex */
public final class t implements com.fyber.inneractive.sdk.network.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.response.nativead.f f3725a;
    public final com.fyber.inneractive.sdk.flow.nativead.s b;

    public t(com.fyber.inneractive.sdk.response.nativead.f fVar, com.fyber.inneractive.sdk.flow.nativead.s sVar) {
        this.f3725a = fVar;
        this.b = sVar;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(java.lang.Object obj, java.lang.Exception exc, boolean z) {
        android.net.Uri uri = (android.net.Uri) obj;
        if (exc instanceof com.fyber.inneractive.sdk.network.g) {
            return;
        }
        if (exc != null || uri == null) {
            this.b.a(null, exc, this.f3725a);
            return;
        }
        com.fyber.inneractive.sdk.flow.nativead.s sVar = this.b;
        com.fyber.inneractive.sdk.response.nativead.f fVar = this.f3725a;
        sVar.a(new com.fyber.inneractive.sdk.flow.nativead.g(fVar.f4258a, uri), null, fVar);
    }
}
