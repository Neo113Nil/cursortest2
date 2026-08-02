package f2;

import A1.X;
import c2.W;
import v2.t;
import w1.V0;

/* renamed from: f2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1079k implements W {

    /* renamed from: a, reason: collision with root package name */
    public final X f12876a;

    /* renamed from: c, reason: collision with root package name */
    public long[] f12878c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f12879d;

    /* renamed from: e, reason: collision with root package name */
    public g2.g f12880e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f12881f;

    /* renamed from: x, reason: collision with root package name */
    public int f12882x;

    /* renamed from: b, reason: collision with root package name */
    public final V0 f12877b = new V0(21);

    /* renamed from: y, reason: collision with root package name */
    public long f12883y = -9223372036854775807L;

    public C1079k(g2.g gVar, X x4, boolean z4) {
        this.f12876a = x4;
        this.f12880e = gVar;
        this.f12878c = gVar.f13139b;
        a(gVar, z4);
    }

    public final void a(g2.g gVar, boolean z4) {
        int i7 = this.f12882x;
        long j = -9223372036854775807L;
        long j3 = i7 == 0 ? -9223372036854775807L : this.f12878c[i7 - 1];
        this.f12879d = z4;
        this.f12880e = gVar;
        long[] jArr = gVar.f13139b;
        this.f12878c = jArr;
        long j7 = this.f12883y;
        if (j7 == -9223372036854775807L) {
            if (j3 != -9223372036854775807L) {
                this.f12882x = t.b(jArr, j3, false);
            }
        } else {
            int b7 = t.b(jArr, j7, true);
            this.f12882x = b7;
            if (this.f12879d && b7 == this.f12878c.length) {
                j = j7;
            }
            this.f12883y = j;
        }
    }

    @Override // c2.W
    public final boolean b() {
        return true;
    }

    @Override // c2.W
    public final int d(long j) {
        int max = Math.max(this.f12882x, t.b(this.f12878c, j, true));
        int i7 = max - this.f12882x;
        this.f12882x = max;
        return i7;
    }

    @Override // c2.W
    public final int e(V0 v02, D1.h hVar, int i7) {
        int i8 = this.f12882x;
        boolean z4 = i8 == this.f12878c.length;
        if (z4 && !this.f12879d) {
            hVar.f1675b = 4;
            return -4;
        }
        if ((i7 & 2) != 0 || !this.f12881f) {
            v02.f17563c = this.f12876a;
            this.f12881f = true;
            return -5;
        }
        if (z4) {
            return -3;
        }
        if ((i7 & 1) == 0) {
            this.f12882x = i8 + 1;
        }
        if ((i7 & 4) == 0) {
            byte[] O7 = this.f12877b.O(this.f12880e.f13138a[i8]);
            hVar.z(O7.length);
            hVar.f1697d.put(O7);
        }
        hVar.f1699f = this.f12878c[i8];
        hVar.f1675b = 1;
        return -4;
    }

    @Override // c2.W
    public final void c() {
    }
}
