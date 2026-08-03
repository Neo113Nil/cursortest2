package com.fyber.inneractive.sdk.config;

/* loaded from: classes3.dex */
public final class d implements com.fyber.inneractive.sdk.util.u1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.config.e f3592a;

    public d(com.fyber.inneractive.sdk.config.e eVar) {
        this.f3592a = eVar;
    }

    @Override // com.fyber.inneractive.sdk.util.u1
    public final void a() {
        com.fyber.inneractive.sdk.util.IAlog.a("onVisibleTimeReached: %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        this.f3592a.c = true;
    }
}
