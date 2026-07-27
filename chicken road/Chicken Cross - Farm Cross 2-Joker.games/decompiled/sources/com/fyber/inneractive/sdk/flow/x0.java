package com.fyber.inneractive.sdk.flow;

/* loaded from: classes4.dex */
public final class x0 {
    public static final x0 c = new x0(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f5419a;
    public final int b;

    public x0(com.fyber.inneractive.sdk.response.e eVar) {
        this.f5419a = -1;
        this.b = -1;
        if (eVar != null) {
            this.f5419a = eVar.L;
            this.b = eVar.K;
        }
    }

    public final boolean a() {
        return this.f5419a >= 0;
    }

    public static x0 a(com.fyber.inneractive.sdk.player.f fVar) {
        return fVar != null ? fVar.n : c;
    }
}
