package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f4004a;
    public final java.util.List b;

    public e(int i, java.util.List list) {
        this.f4004a = i;
        if (!a(32) && list.isEmpty()) {
            list = java.util.Collections.singletonList(com.fyber.inneractive.sdk.player.exoplayer2.o.a(null, "application/cea-608", 0, null, -1, null, Long.MAX_VALUE, java.util.Collections.emptyList()));
        }
        this.b = list;
    }

    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.f0 a(int i, com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.d0 d0Var) {
        if (i == 2) {
            return new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.s(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j());
        }
        if (i == 3 || i == 4) {
            return new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.s(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.q(d0Var.f4003a));
        }
        if (i == 15) {
            if (a(2)) {
                return null;
            }
            return new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.s(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.d(false, d0Var.f4003a));
        }
        if (i == 21) {
            return new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.s(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.p());
        }
        if (i == 27) {
            if (a(4)) {
                return null;
            }
            return new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.s(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.m(a(d0Var), a(1), a(8)));
        }
        if (i == 36) {
            return new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.s(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.o(a(d0Var)));
        }
        if (i == 89) {
            return new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.s(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.g(d0Var.b));
        }
        if (i != 138) {
            if (i != 129) {
                if (i != 130) {
                    if (i == 134) {
                        if (a(16)) {
                            return null;
                        }
                        return new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.w(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.y());
                    }
                    if (i != 135) {
                        return null;
                    }
                }
            }
            return new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.s(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.b(d0Var.f4003a));
        }
        return new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.s(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.f(d0Var.f4003a));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v4 */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.x a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.d0 d0Var) {
        java.lang.String str;
        int i;
        if (a(32)) {
            return new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.x(this.b);
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(d0Var.c);
        java.util.ArrayList arrayList = this.b;
        while (nVar.c - nVar.b > 0) {
            int j = nVar.j();
            int j2 = nVar.b + nVar.j();
            if (j == 134) {
                arrayList = new java.util.ArrayList();
                int j3 = nVar.j() & 31;
                for (int i2 = 0; i2 < j3; i2++) {
                    java.lang.String b = nVar.b(3);
                    int j4 = nVar.j();
                    if ((j4 & 128) != 0) {
                        i = j4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    arrayList.add(com.fyber.inneractive.sdk.player.exoplayer2.o.a(null, str, 0, b, i, null, Long.MAX_VALUE, java.util.Collections.emptyList()));
                    nVar.e(nVar.b + 2);
                }
            }
            nVar.e(j2);
            arrayList = arrayList;
        }
        return new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.x(arrayList);
    }

    public final boolean a(int i) {
        return (i & this.f4004a) != 0;
    }
}
