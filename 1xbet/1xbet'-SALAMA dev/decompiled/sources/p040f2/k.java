package p040f2;

import A1.X;
import D1.h;
import g2.g;
import p018c2.W;
import p151v2.t;
import p155w1.V0;

/* JADX INFO: loaded from: classes.dex */
public final class k implements W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X f12882a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f12884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12885d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g f12886e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f12887f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f12888x;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V0 f12883b = new V0(21);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f12889y = -9223372036854775807L;

    public k(g gVar, X x4, boolean z4) {
        this.f12882a = x4;
        this.f12886e = gVar;
        this.f12884c = gVar.f13145b;
        a(gVar, z4);
    }

    public final void a(g gVar, boolean z4) {
        int i7 = this.f12888x;
        long j = -9223372036854775807L;
        long j3 = i7 == 0 ? -9223372036854775807L : this.f12884c[i7 - 1];
        this.f12885d = z4;
        this.f12886e = gVar;
        long[] jArr = gVar.f13145b;
        this.f12884c = jArr;
        long j7 = this.f12889y;
        if (j7 == -9223372036854775807L) {
            if (j3 != -9223372036854775807L) {
                this.f12888x = t.b(jArr, j3, false);
            }
        } else {
            int iB = t.b(jArr, j7, true);
            this.f12888x = iB;
            if (this.f12885d && iB == this.f12884c.length) {
                j = j7;
            }
            this.f12889y = j;
        }
    }

    @Override // p018c2.W
    public final boolean b() {
        return true;
    }

    @Override // p018c2.W
    public final int d(long j) {
        int iMax = Math.max(this.f12888x, t.b(this.f12884c, j, true));
        int i7 = iMax - this.f12888x;
        this.f12888x = iMax;
        return i7;
    }

    @Override // p018c2.W
    public final int e(V0 v6, h hVar, int i7) {
        int i8 = this.f12888x;
        boolean z4 = i8 == this.f12884c.length;
        if (z4 && !this.f12885d) {
            hVar.f1675b = 4;
            return -4;
        }
        if ((i7 & 2) != 0 || !this.f12887f) {
            v6.f17569c = this.f12882a;
            this.f12887f = true;
            return -5;
        }
        if (z4) {
            return -3;
        }
        if ((i7 & 1) == 0) {
            this.f12888x = i8 + 1;
        }
        if ((i7 & 4) == 0) {
            byte[] bArrO = this.f12883b.O(this.f12886e.f13144a[i8]);
            hVar.z(bArrO.length);
            hVar.f1697d.put(bArrO);
        }
        hVar.f1699f = this.f12884c[i8];
        hVar.f1675b = 1;
        return -4;
    }

    @Override // p018c2.W
    public final void c() {
    }
}
