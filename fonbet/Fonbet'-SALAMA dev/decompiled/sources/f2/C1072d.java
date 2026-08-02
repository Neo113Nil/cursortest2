package f2;

import A1.C0014d0;
import A1.C0022h0;
import A1.P0;
import A1.Q0;
import A1.R0;
import d2.C0959b;
import java.util.List;
import v2.AbstractC1664a;
import v2.t;

/* renamed from: f2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1072d extends R0 {

    /* renamed from: A, reason: collision with root package name */
    public final C0022h0 f12813A;

    /* renamed from: B, reason: collision with root package name */
    public final C0014d0 f12814B;

    /* renamed from: b, reason: collision with root package name */
    public final long f12815b;

    /* renamed from: c, reason: collision with root package name */
    public final long f12816c;

    /* renamed from: d, reason: collision with root package name */
    public final long f12817d;

    /* renamed from: e, reason: collision with root package name */
    public final int f12818e;

    /* renamed from: f, reason: collision with root package name */
    public final long f12819f;

    /* renamed from: x, reason: collision with root package name */
    public final long f12820x;

    /* renamed from: y, reason: collision with root package name */
    public final long f12821y;

    /* renamed from: z, reason: collision with root package name */
    public final g2.c f12822z;

    public C1072d(long j, long j3, long j7, int i7, long j8, long j9, long j10, g2.c cVar, C0022h0 c0022h0, C0014d0 c0014d0) {
        AbstractC1664a.h(cVar.f13112d == (c0014d0 != null));
        this.f12815b = j;
        this.f12816c = j3;
        this.f12817d = j7;
        this.f12818e = i7;
        this.f12819f = j8;
        this.f12820x = j9;
        this.f12821y = j10;
        this.f12822z = cVar;
        this.f12813A = c0022h0;
        this.f12814B = c0014d0;
    }

    @Override // A1.R0
    public final int b(Object obj) {
        int intValue;
        if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue() - this.f12818e) >= 0 && intValue < h()) {
            return intValue;
        }
        return -1;
    }

    @Override // A1.R0
    public final P0 f(int i7, P0 p02, boolean z4) {
        AbstractC1664a.g(i7, h());
        g2.c cVar = this.f12822z;
        String str = z4 ? cVar.b(i7).f13142a : null;
        Integer valueOf = z4 ? Integer.valueOf(this.f12818e + i7) : null;
        long d7 = cVar.d(i7);
        long E7 = t.E(cVar.b(i7).f13143b - cVar.b(0).f13143b) - this.f12819f;
        p02.getClass();
        p02.h(str, valueOf, 0, d7, E7, C0959b.f12381f, false);
        return p02;
    }

    @Override // A1.R0
    public final int h() {
        return this.f12822z.f13120m.size();
    }

    @Override // A1.R0
    public final Object l(int i7) {
        AbstractC1664a.g(i7, h());
        return Integer.valueOf(this.f12818e + i7);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b2  */
    @Override // A1.R0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Q0 m(int i7, Q0 q02, long j) {
        InterfaceC1075g c3;
        long b7;
        AbstractC1664a.g(i7, 1);
        g2.c cVar = this.f12822z;
        boolean z4 = cVar.f13112d && cVar.f13113e != -9223372036854775807L && cVar.f13110b == -9223372036854775807L;
        long j3 = this.f12821y;
        if (z4) {
            if (j > 0) {
                j3 += j;
                if (j3 > this.f12820x) {
                    b7 = -9223372036854775807L;
                    q02.b(Q0.f200I, this.f12813A, cVar, this.f12815b, this.f12816c, this.f12817d, true, (cVar.f13112d || cVar.f13113e == -9223372036854775807L || cVar.f13110b != -9223372036854775807L) ? false : true, this.f12814B, b7, this.f12820x, 0, h() - 1, this.f12819f);
                    return q02;
                }
            }
            long j7 = this.f12819f + j3;
            long d7 = cVar.d(0);
            int i8 = 0;
            while (i8 < cVar.f13120m.size() - 1 && j7 >= d7) {
                j7 -= d7;
                i8++;
                d7 = cVar.d(i8);
            }
            g2.h b8 = cVar.b(i8);
            List list = b8.f13144c;
            int size = list.size();
            int i9 = 0;
            while (true) {
                if (i9 >= size) {
                    i9 = -1;
                    break;
                }
                if (((g2.a) list.get(i9)).f13100b == 2) {
                    break;
                }
                i9++;
            }
            if (i9 != -1 && (c3 = ((g2.m) ((g2.a) b8.f13144c.get(i9)).f13101c.get(0)).c()) != null && c3.v(d7) != 0) {
                b7 = (c3.b(c3.l(j7, d7)) + j3) - j7;
                if (cVar.f13112d) {
                }
                q02.b(Q0.f200I, this.f12813A, cVar, this.f12815b, this.f12816c, this.f12817d, true, (cVar.f13112d || cVar.f13113e == -9223372036854775807L || cVar.f13110b != -9223372036854775807L) ? false : true, this.f12814B, b7, this.f12820x, 0, h() - 1, this.f12819f);
                return q02;
            }
        }
        b7 = j3;
        if (cVar.f13112d) {
        }
        q02.b(Q0.f200I, this.f12813A, cVar, this.f12815b, this.f12816c, this.f12817d, true, (cVar.f13112d || cVar.f13113e == -9223372036854775807L || cVar.f13110b != -9223372036854775807L) ? false : true, this.f12814B, b7, this.f12820x, 0, h() - 1, this.f12819f);
        return q02;
    }

    @Override // A1.R0
    public final int o() {
        return 1;
    }
}
