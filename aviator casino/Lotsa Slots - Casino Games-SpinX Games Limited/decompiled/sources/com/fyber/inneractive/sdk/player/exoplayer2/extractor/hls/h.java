package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

/* loaded from: classes3.dex */
public final class h extends com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.b {
    public static final java.util.concurrent.atomic.AtomicInteger G = new java.util.concurrent.atomic.AtomicInteger();
    public int A;
    public int B;
    public boolean C;
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.n D;
    public volatile boolean E;
    public volatile boolean F;
    public final int j;
    public final int k;
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a l;
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.h m;
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.k n;
    public final boolean o;
    public final boolean p;
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.v q;
    public final java.lang.String r;
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.i s;
    public final boolean t;
    public final boolean u;
    public final java.util.List v;
    public final boolean w;
    public final com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.n x;
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n y;
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.i z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h(com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar2, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar, java.util.List list, int i, java.lang.Object obj, long j, long j2, int i2, int i3, boolean z, com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.h hVar2, byte[] bArr, byte[] bArr2) {
        super(i, i2, j, j2, aVar.b, r10, kVar, obj);
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.h aVar2 = (bArr == null || bArr2 == null) ? hVar : new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.a(hVar, bArr, bArr2);
        this.k = i3;
        this.n = kVar2;
        this.l = aVar;
        this.v = list;
        this.p = z;
        this.q = vVar;
        this.o = aVar2 instanceof com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.a;
        java.lang.String lastPathSegment = kVar.f4091a.getLastPathSegment();
        this.r = lastPathSegment;
        boolean z2 = lastPathSegment.endsWith(".aac") || lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3") || lastPathSegment.endsWith(".mp3");
        this.w = z2;
        if (hVar2 != null) {
            this.x = hVar2.x;
            this.y = hVar2.y;
            this.s = hVar2.z;
            boolean z3 = hVar2.l != aVar;
            this.t = z3;
            this.u = hVar2.k != i3 || z3;
        } else {
            this.x = z2 ? new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.n() : null;
            this.y = z2 ? new com.fyber.inneractive.sdk.player.exoplayer2.util.n(10) : null;
            this.s = null;
            this.t = false;
            this.u = true;
        }
        this.m = hVar;
        this.j = G.getAndIncrement();
    }

    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.metadata.b a2;
        bVar.e = 0;
        if (!bVar.a(this.y.f4112a, 0, 10, true)) {
            return -9223372036854775807L;
        }
        this.y.c(10);
        if (this.y.l() != com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.n.b) {
            return -9223372036854775807L;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = this.y;
        nVar.e(nVar.b + 3);
        int i = this.y.i();
        int i2 = i + 10;
        if (i2 > this.y.a()) {
            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.y;
            byte[] bArr = nVar2.f4112a;
            nVar2.c(i2);
            java.lang.System.arraycopy(bArr, 0, this.y.f4112a, 0, 10);
        }
        if (!bVar.a(this.y.f4112a, 10, i, true) || (a2 = this.x.a(i, this.y.f4112a)) == null) {
            return -9223372036854775807L;
        }
        int length = a2.f4040a.length;
        for (int i3 = 0; i3 < length; i3++) {
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o oVar = a2.f4040a[i3];
            if (oVar instanceof com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.q) {
                com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.q qVar = (com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.q) oVar;
                if ("com.apple.streaming.transportStreamTimestamp".equals(qVar.b)) {
                    java.lang.System.arraycopy(qVar.c, 0, this.y.f4112a, 0, 8);
                    this.y.c(8);
                    return this.y.g();
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final void b() {
        this.E = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a
    public final long c() {
        return this.B;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00f2  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void load() {
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar2;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.i pVar;
        boolean z;
        int i;
        java.lang.String str;
        java.lang.String str2;
        boolean z2 = false;
        if (this.z == null && !this.w) {
            if ("text/vtt".equals(this.l.b.f) || this.r.endsWith(".webvtt") || this.r.endsWith(".vtt")) {
                pVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.p(this.c.y, this.q);
            } else if (this.u) {
                if (!this.r.endsWith(".mp4")) {
                    if (!this.r.startsWith(".m4", r0.length() - 4)) {
                        java.util.List list = this.v;
                        if (list != null) {
                            i = 48;
                        } else {
                            list = java.util.Collections.emptyList();
                            i = 16;
                        }
                        java.lang.String str3 = this.c.c;
                        if (!android.text.TextUtils.isEmpty(str3)) {
                            if (str3 != null) {
                                for (java.lang.String str4 : str3.split(",")) {
                                    str = com.fyber.inneractive.sdk.player.exoplayer2.util.i.a(str4);
                                    if (str != null && "audio".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str))) {
                                        break;
                                    }
                                }
                            }
                            str = null;
                            if (!"audio/mp4a-latm".equals(str)) {
                                i |= 2;
                            }
                            if (str3 != null) {
                                for (java.lang.String str5 : str3.split(",")) {
                                    str2 = com.fyber.inneractive.sdk.player.exoplayer2.util.i.a(str5);
                                    if (str2 != null && "video".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str2))) {
                                        break;
                                    }
                                }
                            }
                            str2 = null;
                            if (!"video/avc".equals(str2)) {
                                i |= 4;
                            }
                        }
                        pVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.b0(2, this.q, new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.e(i, list));
                    }
                }
                pVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.m(this.q);
            } else {
                pVar = this.s;
                z = false;
                if (z) {
                    pVar.a(this.D);
                }
                this.z = pVar;
            }
            z = true;
            if (z) {
            }
            this.z = pVar;
        }
        if (this.s != this.z && !this.C && (kVar2 = this.n) != null) {
            int i2 = this.A;
            int i3 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f4120a;
            if (i2 != 0) {
                long j = kVar2.d;
                long j2 = j == -1 ? -1L : j - i2;
                android.net.Uri uri = kVar2.f4091a;
                long j3 = kVar2.c + i2;
                kVar2 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.k(uri, j3, j3, j2, kVar2.e, kVar2.f);
            }
            try {
                com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar = this.m;
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.b(hVar, kVar2.b, hVar.a(kVar2));
                while (!this.E && this.z.a(bVar, (com.fyber.inneractive.sdk.player.exoplayer2.extractor.o) null) == 0) {
                    try {
                    } finally {
                        this.A = (int) (bVar.c - this.n.b);
                    }
                }
                com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(this.h);
                this.C = true;
            } finally {
            }
        }
        if (this.E) {
            return;
        }
        if (this.o) {
            kVar = this.f4050a;
            if (this.B != 0) {
                z2 = true;
            }
        } else {
            kVar = this.f4050a;
            int i4 = this.B;
            int i5 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f4120a;
            if (i4 != 0) {
                long j4 = kVar.d;
                long j5 = j4 != -1 ? j4 - i4 : -1L;
                android.net.Uri uri2 = kVar.f4091a;
                long j6 = kVar.c + i4;
                kVar = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.k(uri2, j6, j6, j5, kVar.e, kVar.f);
            }
        }
        if (this.p) {
            com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar = this.q;
            if (vVar.f4118a == Long.MAX_VALUE) {
                vVar.c(this.f);
            }
        } else {
            com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar2 = this.q;
            synchronized (vVar2) {
                while (vVar2.c == -9223372036854775807L) {
                    vVar2.wait();
                }
            }
        }
        try {
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar2 = this.h;
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar2 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.b(hVar2, kVar.b, hVar2.a(kVar));
            if (this.z == null) {
                long a2 = a(bVar2);
                this.z = a(a2 != -9223372036854775807L ? this.q.b(a2) : this.f);
            }
            if (z2) {
                bVar2.a(this.B);
            }
            while (!this.E && this.z.a(bVar2, (com.fyber.inneractive.sdk.player.exoplayer2.extractor.o) null) == 0) {
                try {
                } finally {
                    this.B = (int) (bVar2.c - this.f4050a.b);
                }
            }
            com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(this.h);
            this.F = true;
        } finally {
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final boolean a() {
        return this.E;
    }

    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.i a(long j) {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.i aVar;
        if (this.r.endsWith(".aac")) {
            aVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.c(j);
        } else if (!this.r.endsWith(".ac3") && !this.r.endsWith(".ec3")) {
            if (this.r.endsWith(".mp3")) {
                aVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.c(j);
            } else {
                throw new java.lang.IllegalArgumentException("Unkown extension for audio file: " + this.r);
            }
        } else {
            aVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.a(j);
        }
        aVar.a(this.D);
        return aVar;
    }
}
