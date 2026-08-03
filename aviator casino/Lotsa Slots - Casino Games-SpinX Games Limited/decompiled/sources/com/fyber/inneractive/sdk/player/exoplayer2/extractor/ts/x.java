package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

/* loaded from: classes3.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f4022a;
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.r[] b;

    public x(java.util.List list) {
        this.f4022a = list;
        this.b = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.r[list.size()];
    }

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.e0 e0Var) {
        for (int i = 0; i < this.b.length; i++) {
            e0Var.a();
            e0Var.b();
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a2 = jVar.a(e0Var.d, 3);
            com.fyber.inneractive.sdk.player.exoplayer2.o oVar = (com.fyber.inneractive.sdk.player.exoplayer2.o) this.f4022a.get(i);
            java.lang.String str = oVar.f;
            com.fyber.inneractive.sdk.player.exoplayer2.util.a.a("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption mime type provided: " + str);
            java.lang.String str2 = oVar.f4044a;
            if (str2 == null) {
                e0Var.b();
                str2 = e0Var.e;
            }
            a2.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(str2, str, oVar.x, oVar.y, oVar.z, null, Long.MAX_VALUE, java.util.Collections.emptyList()));
            this.b[i] = a2;
        }
    }
}
