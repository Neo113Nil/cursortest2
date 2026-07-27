package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class g implements r {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.b f5586a;
    public final int b;
    public final e c;
    public final LinkedBlockingDeque d;
    public final d e;
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f;
    public final AtomicInteger g;
    public long h;
    public com.fyber.inneractive.sdk.player.exoplayer2.o i;
    public long j;
    public com.fyber.inneractive.sdk.player.exoplayer2.upstream.a k;
    public int l;
    public boolean m;
    public f n;

    public g(com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar) {
        this.f5586a = bVar;
        ((com.fyber.inneractive.sdk.player.exoplayer2.upstream.l) bVar).getClass();
        this.b = 65536;
        this.c = new e();
        this.d = new LinkedBlockingDeque();
        this.e = new d();
        this.f = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(32);
        this.g = new AtomicInteger();
        this.l = 65536;
    }

    public final void a(boolean z) {
        int andSet = this.g.getAndSet(z ? 0 : 2);
        a();
        e eVar = this.c;
        eVar.m = Long.MIN_VALUE;
        eVar.n = Long.MIN_VALUE;
        if (andSet == 2) {
            this.i = null;
        }
    }

    public final void b() {
        if (this.g.getAndSet(2) == 0) {
            a();
        }
    }

    public final void c() {
        if (this.g.compareAndSet(1, 0)) {
            return;
        }
        a();
    }

    public final long d() {
        long max;
        e eVar = this.c;
        synchronized (eVar) {
            max = Math.max(eVar.m, eVar.n);
        }
        return max;
    }

    public final com.fyber.inneractive.sdk.player.exoplayer2.o e() {
        com.fyber.inneractive.sdk.player.exoplayer2.o oVar;
        e eVar = this.c;
        synchronized (eVar) {
            oVar = eVar.p ? null : eVar.q;
        }
        return oVar;
    }

    public final void f() {
        long j;
        e eVar = this.c;
        synchronized (eVar) {
            int i = eVar.i;
            if (i == 0) {
                j = -1;
            } else {
                int i2 = eVar.k + i;
                int i3 = eVar.f5583a;
                int i4 = (i2 - 1) % i3;
                eVar.k = i2 % i3;
                eVar.j += i;
                eVar.i = 0;
                j = eVar.c[i4] + eVar.d[i4];
            }
        }
        if (j != -1) {
            a(j);
        }
    }

    public final boolean a(boolean z, long j) {
        long j2;
        e eVar = this.c;
        synchronized (eVar) {
            if (eVar.i != 0) {
                long[] jArr = eVar.f;
                int i = eVar.k;
                if (j >= jArr[i]) {
                    if (j <= eVar.n || z) {
                        int i2 = -1;
                        int i3 = 0;
                        while (i != eVar.l && eVar.f[i] <= j) {
                            if ((eVar.e[i] & 1) != 0) {
                                i2 = i3;
                            }
                            i = (i + 1) % eVar.f5583a;
                            i3++;
                        }
                        if (i2 != -1) {
                            int i4 = (eVar.k + i2) % eVar.f5583a;
                            eVar.k = i4;
                            eVar.j += i2;
                            eVar.i -= i2;
                            j2 = eVar.c[i4];
                        }
                    }
                    j2 = -1;
                }
            }
            j2 = -1;
        }
        if (j2 == -1) {
            return false;
        }
        a(j2);
        return true;
    }

    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.p pVar, com.fyber.inneractive.sdk.player.exoplayer2.decoder.c cVar, boolean z, boolean z2, long j) {
        int i;
        long j2;
        char c;
        e eVar = this.c;
        com.fyber.inneractive.sdk.player.exoplayer2.o oVar = this.i;
        d dVar = this.e;
        synchronized (eVar) {
            i = 1;
            if (eVar.i != 0) {
                if (!z) {
                    com.fyber.inneractive.sdk.player.exoplayer2.o[] oVarArr = eVar.h;
                    int i2 = eVar.k;
                    if (oVarArr[i2] == oVar) {
                        if (cVar.c == null && cVar.e == 0) {
                            c = 65533;
                        } else {
                            long j3 = eVar.f[i2];
                            cVar.d = j3;
                            cVar.f5575a = eVar.e[i2];
                            dVar.f5582a = eVar.d[i2];
                            dVar.b = eVar.c[i2];
                            dVar.d = eVar.g[i2];
                            eVar.m = Math.max(eVar.m, j3);
                            int i3 = eVar.i - 1;
                            eVar.i = i3;
                            int i4 = eVar.k + 1;
                            eVar.k = i4;
                            eVar.j++;
                            if (i4 == eVar.f5583a) {
                                eVar.k = 0;
                            }
                            if (i3 > 0) {
                                j2 = eVar.c[eVar.k];
                            } else {
                                j2 = dVar.b + dVar.f5582a;
                            }
                            dVar.c = j2;
                            c = 65532;
                        }
                    }
                }
                pVar.f5699a = eVar.h[eVar.k];
                c = 65531;
            } else if (z2) {
                cVar.f5575a = 4;
                c = 65532;
            } else {
                com.fyber.inneractive.sdk.player.exoplayer2.o oVar2 = eVar.q;
                if (oVar2 == null || (!z && oVar2 == oVar)) {
                    c = 65533;
                } else {
                    pVar.f5699a = oVar2;
                    c = 65531;
                }
            }
        }
        if (c == 65531) {
            this.i = pVar.f5699a;
            return -5;
        }
        if (c != 65532) {
            if (c == 65533) {
                return -3;
            }
            throw new IllegalStateException();
        }
        if (cVar.b(4)) {
            return -4;
        }
        if (cVar.d < j) {
            cVar.f5575a = Integer.MIN_VALUE | cVar.f5575a;
        }
        if (cVar.b(1073741824)) {
            d dVar2 = this.e;
            long j4 = dVar2.b;
            this.f.c(1);
            a(j4, this.f.f5766a, 1);
            long j5 = j4 + 1;
            byte b = this.f.f5766a[0];
            boolean z3 = (b & 128) != 0;
            int i5 = b & Byte.MAX_VALUE;
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b bVar = cVar.b;
            if (bVar.f5574a == null) {
                bVar.f5574a = new byte[16];
            }
            a(j5, bVar.f5574a, i5);
            long j6 = j5 + i5;
            if (z3) {
                this.f.c(2);
                a(j6, this.f.f5766a, 2);
                j6 += 2;
                i = this.f.o();
            }
            int i6 = i;
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b bVar2 = cVar.b;
            int[] iArr = bVar2.b;
            if (iArr == null || iArr.length < i6) {
                iArr = new int[i6];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = bVar2.c;
            if (iArr3 == null || iArr3.length < i6) {
                iArr3 = new int[i6];
            }
            int[] iArr4 = iArr3;
            if (z3) {
                int i7 = i6 * 6;
                this.f.c(i7);
                a(j6, this.f.f5766a, i7);
                j6 += i7;
                this.f.e(0);
                for (int i8 = 0; i8 < i6; i8++) {
                    iArr2[i8] = this.f.o();
                    iArr4[i8] = this.f.m();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = dVar2.f5582a - ((int) (j6 - dVar2.b));
            }
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b bVar3 = cVar.b;
            bVar3.a(i6, iArr2, iArr4, dVar2.d, bVar3.f5574a);
            long j7 = dVar2.b;
            int i9 = (int) (j6 - j7);
            dVar2.b = j7 + i9;
            dVar2.f5582a -= i9;
        }
        int i10 = this.e.f5582a;
        ByteBuffer byteBuffer = cVar.c;
        if (byteBuffer == null) {
            cVar.c = cVar.a(i10);
        } else {
            int capacity = byteBuffer.capacity();
            int position = cVar.c.position();
            int i11 = i10 + position;
            if (capacity < i11) {
                ByteBuffer a2 = cVar.a(i11);
                if (position > 0) {
                    cVar.c.position(0);
                    cVar.c.limit(position);
                    a2.put(cVar.c);
                }
                cVar.c = a2;
            }
        }
        d dVar3 = this.e;
        long j8 = dVar3.b;
        ByteBuffer byteBuffer2 = cVar.c;
        int i12 = dVar3.f5582a;
        while (i12 > 0) {
            a(j8);
            int i13 = (int) (j8 - this.h);
            int min = Math.min(i12, this.b - i13);
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.a aVar = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.a) this.d.peek();
            byteBuffer2.put(aVar.f5727a, aVar.b + i13, min);
            j8 += min;
            i12 -= min;
        }
        a(this.e.c);
        return -4;
    }

    public final void a(long j, byte[] bArr, int i) {
        int i2 = 0;
        while (i2 < i) {
            a(j);
            int i3 = (int) (j - this.h);
            int min = Math.min(i - i2, this.b - i3);
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.a aVar = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.a) this.d.peek();
            System.arraycopy(aVar.f5727a, aVar.b + i3, bArr, i2, min);
            j += min;
            i2 += min;
        }
    }

    public final void a(long j) {
        int i = ((int) (j - this.h)) / this.b;
        for (int i2 = 0; i2 < i; i2++) {
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar = this.f5586a;
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.a aVar = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.a) this.d.remove();
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.l lVar = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.l) bVar;
            synchronized (lVar) {
                com.fyber.inneractive.sdk.player.exoplayer2.upstream.a[] aVarArr = lVar.f5746a;
                aVarArr[0] = aVar;
                lVar.a(aVarArr);
            }
            this.h += this.b;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.r
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
        boolean z;
        if (oVar == null) {
            oVar = null;
        }
        e eVar = this.c;
        synchronized (eVar) {
            z = true;
            if (oVar == null) {
                eVar.p = true;
            } else {
                eVar.p = false;
                com.fyber.inneractive.sdk.player.exoplayer2.o oVar2 = eVar.q;
                int i = z.f5774a;
                if (!oVar.equals(oVar2)) {
                    eVar.q = oVar;
                }
            }
            z = false;
        }
        f fVar = this.n;
        if (fVar == null || !z) {
            return;
        }
        fVar.e();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.r
    public final int a(b bVar, int i, boolean z) {
        int i2 = 0;
        if (!this.g.compareAndSet(0, 1)) {
            int min = Math.min(bVar.f, i);
            bVar.b(min);
            if (min == 0) {
                min = bVar.a(b.g, 0, Math.min(i, 4096), 0, true);
            }
            if (min != -1) {
                bVar.c += min;
            }
            if (min != -1) {
                return min;
            }
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        try {
            int a2 = a(i);
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.a aVar = this.k;
            byte[] bArr = aVar.f5727a;
            int i3 = aVar.b + this.l;
            int i4 = bVar.f;
            if (i4 != 0) {
                int min2 = Math.min(i4, a2);
                System.arraycopy(bVar.d, 0, bArr, i3, min2);
                bVar.b(min2);
                i2 = min2;
            }
            if (i2 == 0) {
                i2 = bVar.a(bArr, i3, a2, 0, true);
            }
            if (i2 != -1) {
                bVar.c += i2;
            }
            if (i2 == -1) {
                if (z) {
                    return -1;
                }
                throw new EOFException();
            }
            this.l += i2;
            this.j += i2;
            return i2;
        } finally {
            c();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.r
    public final void a(int i, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        if (!this.g.compareAndSet(0, 1)) {
            nVar.e(nVar.b + i);
            return;
        }
        while (i > 0) {
            int a2 = a(i);
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.a aVar = this.k;
            nVar.a(aVar.f5727a, aVar.b + this.l, a2);
            this.l += a2;
            this.j += a2;
            i -= a2;
        }
        c();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.r
    public final void a(long j, int i, int i2, int i3, byte[] bArr) {
        if (!this.g.compareAndSet(0, 1)) {
            e eVar = this.c;
            synchronized (eVar) {
                eVar.n = Math.max(eVar.n, j);
            }
            return;
        }
        try {
            if (this.m) {
                if ((i & 1) != 0 && this.c.a(j)) {
                    this.m = false;
                }
                return;
            }
            this.c.a(j, i, (this.j - i2) - i3, i2, bArr);
        } finally {
            c();
        }
    }

    public final void a() {
        e eVar = this.c;
        eVar.j = 0;
        eVar.k = 0;
        eVar.l = 0;
        eVar.i = 0;
        eVar.o = true;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar = this.f5586a;
        LinkedBlockingDeque linkedBlockingDeque = this.d;
        ((com.fyber.inneractive.sdk.player.exoplayer2.upstream.l) bVar).a((com.fyber.inneractive.sdk.player.exoplayer2.upstream.a[]) linkedBlockingDeque.toArray(new com.fyber.inneractive.sdk.player.exoplayer2.upstream.a[linkedBlockingDeque.size()]));
        this.d.clear();
        ((com.fyber.inneractive.sdk.player.exoplayer2.upstream.l) this.f5586a).a();
        this.h = 0L;
        this.j = 0L;
        this.k = null;
        this.l = this.b;
    }

    public final int a(int i) {
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.a aVar;
        if (this.l == this.b) {
            this.l = 0;
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.l lVar = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.l) this.f5586a;
            synchronized (lVar) {
                lVar.c++;
                int i2 = lVar.d;
                if (i2 > 0) {
                    com.fyber.inneractive.sdk.player.exoplayer2.upstream.a[] aVarArr = lVar.e;
                    int i3 = i2 - 1;
                    lVar.d = i3;
                    aVar = aVarArr[i3];
                    aVarArr[i3] = null;
                } else {
                    aVar = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.a(0, new byte[65536]);
                }
            }
            this.k = aVar;
            this.d.add(aVar);
        }
        return Math.min(i, this.b - this.l);
    }
}
