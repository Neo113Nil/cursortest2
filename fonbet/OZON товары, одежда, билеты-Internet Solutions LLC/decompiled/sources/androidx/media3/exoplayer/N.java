package androidx.media3.exoplayer;

import F3.C2999d;
import F3.C3011p;
import F3.InterfaceC3017w;
import F3.InterfaceC3018x;
import j3.AbstractC7252H;

/* loaded from: classes.dex */
final class N {

    /* renamed from: a, reason: collision with root package name */
    public final Object f43663a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f43664b;

    /* renamed from: c, reason: collision with root package name */
    public final F3.U[] f43665c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f43666d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f43667e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f43668f;

    /* renamed from: g, reason: collision with root package name */
    public O f43669g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f43670h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean[] f43671i;

    /* renamed from: j, reason: collision with root package name */
    private final k0[] f43672j;

    /* renamed from: k, reason: collision with root package name */
    private final I3.E f43673k;

    /* renamed from: l, reason: collision with root package name */
    private final f0 f43674l;

    /* renamed from: m, reason: collision with root package name */
    private N f43675m;

    /* renamed from: n, reason: collision with root package name */
    private F3.d0 f43676n;

    /* renamed from: o, reason: collision with root package name */
    private I3.F f43677o;

    /* renamed from: p, reason: collision with root package name */
    private long f43678p;

    public N(k0[] k0VarArr, long j11, I3.E e11, J3.b bVar, f0 f0Var, O o11, I3.F f7) {
        this.f43672j = k0VarArr;
        this.f43678p = j11;
        this.f43673k = e11;
        this.f43674l = f0Var;
        InterfaceC3018x.b bVar2 = o11.f43679a;
        this.f43664b = bVar2.f8751a;
        this.f43669g = o11;
        this.f43676n = F3.d0.f8643d;
        this.f43677o = f7;
        this.f43665c = new F3.U[k0VarArr.length];
        this.f43671i = new boolean[k0VarArr.length];
        InterfaceC3017w e12 = f0Var.e(bVar2, bVar, o11.f43680b);
        long j12 = o11.f43682d;
        this.f43663a = j12 != -9223372036854775807L ? new C2999d(e12, !o11.f43684f, 0L, j12) : e12;
    }

    private void d() {
        if (this.f43675m != null) {
            return;
        }
        int i11 = 0;
        while (true) {
            I3.F f7 = this.f43677o;
            if (i11 >= f7.f11822a) {
                return;
            }
            boolean b11 = f7.b(i11);
            I3.y yVar = this.f43677o.f11824c[i11];
            if (b11 && yVar != null) {
                yVar.disable();
            }
            i11++;
        }
    }

    private void e() {
        if (this.f43675m != null) {
            return;
        }
        int i11 = 0;
        while (true) {
            I3.F f7 = this.f43677o;
            if (i11 >= f7.f11822a) {
                return;
            }
            boolean b11 = f7.b(i11);
            I3.y yVar = this.f43677o.f11824c[i11];
            if (b11 && yVar != null) {
                yVar.a();
            }
            i11++;
        }
    }

    public final long a(I3.F f7, long j11) {
        return b(f7, j11, false, new boolean[this.f43672j.length]);
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [F3.w, java.lang.Object] */
    public final long b(I3.F f7, long j11, boolean z11, boolean[] zArr) {
        k0[] k0VarArr;
        F3.U[] uArr;
        int i11 = 0;
        while (true) {
            boolean z12 = true;
            if (i11 >= f7.f11822a) {
                break;
            }
            if (z11 || !f7.a(this.f43677o, i11)) {
                z12 = false;
            }
            this.f43671i[i11] = z12;
            i11++;
        }
        int i12 = 0;
        while (true) {
            k0VarArr = this.f43672j;
            int length = k0VarArr.length;
            uArr = this.f43665c;
            if (i12 >= length) {
                break;
            }
            if (((AbstractC5444f) k0VarArr[i12]).v() == -2) {
                uArr[i12] = null;
            }
            i12++;
        }
        d();
        this.f43677o = f7;
        e();
        long selectTracks = this.f43663a.selectTracks(f7.f11824c, this.f43671i, this.f43665c, zArr, j11);
        for (int i13 = 0; i13 < k0VarArr.length; i13++) {
            if (((AbstractC5444f) k0VarArr[i13]).v() == -2 && this.f43677o.b(i13)) {
                uArr[i13] = new C3011p();
            }
        }
        this.f43668f = false;
        for (int i14 = 0; i14 < uArr.length; i14++) {
            if (uArr[i14] != null) {
                G10.a.h(f7.b(i14));
                if (((AbstractC5444f) k0VarArr[i14]).v() != -2) {
                    this.f43668f = true;
                }
            } else {
                G10.a.h(f7.f11824c[i14] == null);
            }
        }
        return selectTracks;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [F3.V, java.lang.Object] */
    public final void c(M m11) {
        G10.a.h(this.f43675m == null);
        this.f43663a.continueLoading(m11);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [F3.V, java.lang.Object] */
    public final long f() {
        if (!this.f43667e) {
            return this.f43669g.f43680b;
        }
        long bufferedPositionUs = this.f43668f ? this.f43663a.getBufferedPositionUs() : Long.MIN_VALUE;
        return bufferedPositionUs == Long.MIN_VALUE ? this.f43669g.f43683e : bufferedPositionUs;
    }

    public final N g() {
        return this.f43675m;
    }

    public final long h() {
        return this.f43678p;
    }

    public final long i() {
        return this.f43669g.f43680b + this.f43678p;
    }

    public final F3.d0 j() {
        return this.f43676n;
    }

    public final I3.F k() {
        return this.f43677o;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [F3.w, java.lang.Object] */
    public final void l(float f7, AbstractC7252H abstractC7252H, boolean z11) throws C5449k {
        this.f43667e = true;
        this.f43676n = this.f43663a.getTrackGroups();
        I3.F q11 = q(f7, abstractC7252H, z11);
        O o11 = this.f43669g;
        long j11 = o11.f43683e;
        long j12 = o11.f43680b;
        if (j11 != -9223372036854775807L && j12 >= j11) {
            j12 = Math.max(0L, j11 - 1);
        }
        long a11 = a(q11, j12);
        long j13 = this.f43678p;
        O o12 = this.f43669g;
        this.f43678p = (o12.f43680b - a11) + j13;
        this.f43669g = o12.b(a11);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [F3.V, java.lang.Object] */
    public final boolean m() {
        if (this.f43667e) {
            return !this.f43668f || this.f43663a.getBufferedPositionUs() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean n() {
        if (this.f43667e) {
            return m() || f() - this.f43669g.f43680b >= -9223372036854775807L;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [F3.V, java.lang.Object] */
    public final void o(long j11) {
        G10.a.h(this.f43675m == null);
        if (this.f43667e) {
            this.f43663a.reevaluateBuffer(j11 - this.f43678p);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [F3.w, java.lang.Object] */
    public final void p() {
        d();
        ?? r02 = this.f43663a;
        try {
            boolean z11 = r02 instanceof C2999d;
            f0 f0Var = this.f43674l;
            if (z11) {
                f0Var.p(((C2999d) r02).f8633a);
            } else {
                f0Var.p(r02);
            }
        } catch (RuntimeException e11) {
            m3.s.d("MediaPeriodHolder", "Period release failed.", e11);
        }
    }

    public final I3.F q(float f7, AbstractC7252H abstractC7252H, boolean z11) throws C5449k {
        I3.y[] yVarArr;
        F3.d0 d0Var = this.f43676n;
        O o11 = this.f43669g;
        I3.E e11 = this.f43673k;
        k0[] k0VarArr = this.f43672j;
        I3.F i11 = e11.i(k0VarArr, d0Var, o11.f43679a, abstractC7252H);
        int i12 = 0;
        while (true) {
            int i13 = i11.f11822a;
            yVarArr = i11.f11824c;
            if (i12 >= i13) {
                break;
            }
            if (i11.b(i12)) {
                if (yVarArr[i12] == null && ((AbstractC5444f) k0VarArr[i12]).v() != -2) {
                    r5 = false;
                }
                G10.a.h(r5);
            } else {
                G10.a.h(yVarArr[i12] == null);
            }
            i12++;
        }
        for (I3.y yVar : yVarArr) {
            if (yVar != null) {
                yVar.o(f7);
                yVar.q(z11);
            }
        }
        return i11;
    }

    public final void r(N n11) {
        if (n11 == this.f43675m) {
            return;
        }
        d();
        this.f43675m = n11;
        e();
    }

    public final void s(long j11) {
        this.f43678p = j11;
    }

    public final long t(long j11) {
        return j11 - this.f43678p;
    }

    public final long u(long j11) {
        return j11 + this.f43678p;
    }

    public final void v() {
        Object obj = this.f43663a;
        if (obj instanceof C2999d) {
            long j11 = this.f43669g.f43682d;
            if (j11 == -9223372036854775807L) {
                j11 = Long.MIN_VALUE;
            }
            ((C2999d) obj).f(j11);
        }
    }
}
