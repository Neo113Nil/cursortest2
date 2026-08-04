package p018c2;

import A1.X;
import D1.h;
import p151v2.t;
import p155w1.V0;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f10307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f10308c;

    public b0(long j) {
        X x4 = c0.j;
        int i7 = t.f17159a;
        this.f10306a = ((long) 4) * ((j * 44100) / 1000000);
        a(0L);
    }

    public final void a(long j) {
        X x4 = c0.j;
        int i7 = t.f17159a;
        this.f10308c = t.k(((long) 4) * ((j * 44100) / 1000000), 0L, this.f10306a);
    }

    @Override // p018c2.W
    public final boolean b() {
        return true;
    }

    @Override // p018c2.W
    public final int d(long j) {
        long j3 = this.f10308c;
        a(j);
        return (int) ((this.f10308c - j3) / ((long) c0.f10313l.length));
    }

    @Override // p018c2.W
    public final int e(V0 v6, h hVar, int i7) {
        if (!this.f10307b || (i7 & 2) != 0) {
            v6.f17569c = c0.j;
            this.f10307b = true;
            return -5;
        }
        long j = this.f10308c;
        long j3 = this.f10306a - j;
        if (j3 == 0) {
            hVar.b(4);
            return -4;
        }
        X x4 = c0.j;
        int i8 = t.f17159a;
        hVar.f1699f = ((j / ((long) 4)) * 1000000) / 44100;
        hVar.b(1);
        byte[] bArr = c0.f10313l;
        int iMin = (int) Math.min(bArr.length, j3);
        if ((4 & i7) == 0) {
            hVar.z(iMin);
            hVar.f1697d.put(bArr, 0, iMin);
        }
        if ((i7 & 1) == 0) {
            this.f10308c += (long) iMin;
        }
        return -4;
    }

    @Override // p018c2.W
    public final void c() {
    }
}
