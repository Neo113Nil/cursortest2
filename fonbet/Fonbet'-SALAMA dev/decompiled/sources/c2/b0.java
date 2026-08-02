package c2;

import w1.V0;

/* loaded from: classes.dex */
public final class b0 implements W {

    /* renamed from: a, reason: collision with root package name */
    public final long f10306a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10307b;

    /* renamed from: c, reason: collision with root package name */
    public long f10308c;

    public b0(long j) {
        A1.X x4 = c0.j;
        int i7 = v2.t.f17153a;
        this.f10306a = 4 * ((j * 44100) / 1000000);
        a(0L);
    }

    public final void a(long j) {
        A1.X x4 = c0.j;
        int i7 = v2.t.f17153a;
        this.f10308c = v2.t.k(4 * ((j * 44100) / 1000000), 0L, this.f10306a);
    }

    @Override // c2.W
    public final boolean b() {
        return true;
    }

    @Override // c2.W
    public final int d(long j) {
        long j3 = this.f10308c;
        a(j);
        return (int) ((this.f10308c - j3) / c0.f10313l.length);
    }

    @Override // c2.W
    public final int e(V0 v02, D1.h hVar, int i7) {
        if (!this.f10307b || (i7 & 2) != 0) {
            v02.f17563c = c0.j;
            this.f10307b = true;
            return -5;
        }
        long j = this.f10308c;
        long j3 = this.f10306a - j;
        if (j3 == 0) {
            hVar.b(4);
            return -4;
        }
        A1.X x4 = c0.j;
        int i8 = v2.t.f17153a;
        hVar.f1699f = ((j / 4) * 1000000) / 44100;
        hVar.b(1);
        byte[] bArr = c0.f10313l;
        int min = (int) Math.min(bArr.length, j3);
        if ((4 & i7) == 0) {
            hVar.z(min);
            hVar.f1697d.put(bArr, 0, min);
        }
        if ((i7 & 1) == 0) {
            this.f10308c += min;
        }
        return -4;
    }

    @Override // c2.W
    public final void c() {
    }
}
