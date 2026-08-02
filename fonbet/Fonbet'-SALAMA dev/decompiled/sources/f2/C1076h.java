package f2;

import c2.C0796b;
import e2.C1007d;

/* renamed from: f2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1076h {

    /* renamed from: a, reason: collision with root package name */
    public final C1007d f12857a;

    /* renamed from: b, reason: collision with root package name */
    public final g2.m f12858b;

    /* renamed from: c, reason: collision with root package name */
    public final g2.b f12859c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1075g f12860d;

    /* renamed from: e, reason: collision with root package name */
    public final long f12861e;

    /* renamed from: f, reason: collision with root package name */
    public final long f12862f;

    public C1076h(long j, g2.m mVar, g2.b bVar, C1007d c1007d, long j3, InterfaceC1075g interfaceC1075g) {
        this.f12861e = j;
        this.f12858b = mVar;
        this.f12859c = bVar;
        this.f12862f = j3;
        this.f12857a = c1007d;
        this.f12860d = interfaceC1075g;
    }

    public final C1076h a(long j, g2.m mVar) {
        long l7;
        InterfaceC1075g c3 = this.f12858b.c();
        InterfaceC1075g c4 = mVar.c();
        if (c3 == null) {
            return new C1076h(j, mVar, this.f12859c, this.f12857a, this.f12862f, c3);
        }
        if (!c3.s()) {
            return new C1076h(j, mVar, this.f12859c, this.f12857a, this.f12862f, c4);
        }
        long v6 = c3.v(j);
        if (v6 == 0) {
            return new C1076h(j, mVar, this.f12859c, this.f12857a, this.f12862f, c4);
        }
        long u4 = c3.u();
        long b7 = c3.b(u4);
        long j3 = v6 + u4;
        long j7 = j3 - 1;
        long e7 = c3.e(j7, j) + c3.b(j7);
        long u7 = c4.u();
        long b8 = c4.b(u7);
        long j8 = this.f12862f;
        if (e7 != b8) {
            if (e7 < b8) {
                throw new C0796b();
            }
            if (b8 < b7) {
                l7 = j8 - (c4.l(b7, j) - u4);
                return new C1076h(j, mVar, this.f12859c, this.f12857a, l7, c4);
            }
            j3 = c3.l(b8, j);
        }
        l7 = (j3 - u7) + j8;
        return new C1076h(j, mVar, this.f12859c, this.f12857a, l7, c4);
    }

    public final long b(long j) {
        InterfaceC1075g interfaceC1075g = this.f12860d;
        long j3 = this.f12861e;
        return (interfaceC1075g.w(j3, j) + (interfaceC1075g.f(j3, j) + this.f12862f)) - 1;
    }

    public final long c(long j) {
        return this.f12860d.e(j - this.f12862f, this.f12861e) + d(j);
    }

    public final long d(long j) {
        return this.f12860d.b(j - this.f12862f);
    }
}
