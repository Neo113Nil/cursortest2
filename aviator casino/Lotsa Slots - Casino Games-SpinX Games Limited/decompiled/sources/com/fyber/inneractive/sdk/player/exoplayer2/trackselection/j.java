package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.source.z f4072a;
    public final com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h b;
    public final java.lang.Object c;
    public final com.fyber.inneractive.sdk.player.exoplayer2.t[] d;

    public j(com.fyber.inneractive.sdk.player.exoplayer2.source.z zVar, com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h hVar, com.fyber.inneractive.sdk.player.exoplayer2.trackselection.f fVar, com.fyber.inneractive.sdk.player.exoplayer2.t[] tVarArr) {
        this.f4072a = zVar;
        this.b = hVar;
        this.c = fVar;
        this.d = tVarArr;
    }

    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j jVar, int i) {
        return jVar != null && com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(this.b.b[i], jVar.b.b[i]) && com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(this.d[i], jVar.d[i]);
    }
}
