package h2;

import A1.X;
import W5.AbstractC0486a1;
import c2.I;
import c2.W;
import java.util.ArrayList;
import java.util.Iterator;
import v2.AbstractC1664a;
import v2.t;
import w1.V0;

/* renamed from: h2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1192n implements W {

    /* renamed from: a, reason: collision with root package name */
    public final int f13455a;

    /* renamed from: b, reason: collision with root package name */
    public final C1196r f13456b;

    /* renamed from: c, reason: collision with root package name */
    public int f13457c = -1;

    public C1192n(C1196r c1196r, int i7) {
        this.f13456b = c1196r;
        this.f13455a = i7;
    }

    public final void a() {
        AbstractC1664a.f(this.f13457c == -1);
        C1196r c1196r = this.f13456b;
        c1196r.c();
        c1196r.f13499b0.getClass();
        int[] iArr = c1196r.f13499b0;
        int i7 = this.f13455a;
        int i8 = iArr[i7];
        if (i8 == -1) {
            if (c1196r.f13497a0.contains(c1196r.f13495Z.a(i7))) {
                i8 = -3;
            }
            i8 = -2;
        } else {
            boolean[] zArr = c1196r.f13504e0;
            if (!zArr[i8]) {
                zArr[i8] = true;
            }
            i8 = -2;
        }
        this.f13457c = i8;
    }

    @Override // c2.W
    public final boolean b() {
        if (this.f13457c != -3) {
            if (f()) {
                int i7 = this.f13457c;
                C1196r c1196r = this.f13456b;
                if (c1196r.t() || !c1196r.f13482M[i7].s(c1196r.f13511k0)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // c2.W
    public final void c() {
        int i7 = this.f13457c;
        C1196r c1196r = this.f13456b;
        if (i7 == -2) {
            c1196r.c();
            throw new Z4.b(AbstractC0486a1.h("Unable to bind a sample queue to TrackGroup with mime type ", c1196r.f13495Z.a(this.f13455a).f10344d[0].f283C, "."));
        }
        if (i7 == -1) {
            c1196r.x();
        } else if (i7 != -3) {
            c1196r.x();
            c1196r.f13482M[i7].u();
        }
    }

    @Override // c2.W
    public final int d(long j) {
        if (!f()) {
            return 0;
        }
        int i7 = this.f13457c;
        C1196r c1196r = this.f13456b;
        if (c1196r.t()) {
            return 0;
        }
        C1195q c1195q = c1196r.f13482M[i7];
        int p5 = c1195q.p(j, c1196r.f13511k0);
        ArrayList arrayList = c1196r.f13474E;
        Object obj = null;
        if (arrayList == null) {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                do {
                    obj = it.next();
                } while (it.hasNext());
            }
        } else if (!arrayList.isEmpty()) {
            obj = arrayList.get(arrayList.size() - 1);
        }
        C1189k c1189k = (C1189k) obj;
        if (c1189k != null && !c1189k.f13419b0) {
            p5 = Math.min(p5, c1189k.e(i7) - c1195q.n());
        }
        c1195q.A(p5);
        return p5;
    }

    @Override // c2.W
    public final int e(V0 v02, D1.h hVar, int i7) {
        X x4;
        X x7;
        int i8 = -3;
        if (this.f13457c == -3) {
            hVar.b(4);
            return -4;
        }
        if (f()) {
            int i9 = this.f13457c;
            C1196r c1196r = this.f13456b;
            if (!c1196r.t()) {
                ArrayList arrayList = c1196r.f13474E;
                int i10 = 0;
                if (!arrayList.isEmpty()) {
                    int i11 = 0;
                    loop0: while (i11 < arrayList.size() - 1) {
                        int i12 = ((C1189k) arrayList.get(i11)).f13393B;
                        int length = c1196r.f13482M.length;
                        for (int i13 = 0; i13 < length; i13++) {
                            if (c1196r.f13504e0[i13] && c1196r.f13482M[i13].w() == i12) {
                                break loop0;
                            }
                        }
                        i11++;
                    }
                    t.J(arrayList, 0, i11);
                    C1189k c1189k = (C1189k) arrayList.get(0);
                    X x8 = c1189k.f12596d;
                    if (x8.equals(c1196r.f13493X)) {
                        x7 = x8;
                    } else {
                        I i14 = c1196r.f13471B;
                        Object obj = c1189k.f12598f;
                        long j = c1189k.f12599x;
                        int i15 = c1196r.f13498b;
                        int i16 = c1189k.f12597e;
                        x7 = x8;
                        i14.b(i15, x8, i16, obj, j);
                    }
                    c1196r.f13493X = x7;
                }
                if ((arrayList.isEmpty() || ((C1189k) arrayList.get(0)).f13419b0) && (i8 = c1196r.f13482M[i9].x(v02, hVar, i7, c1196r.f13511k0)) == -5) {
                    X x9 = (X) v02.f17563c;
                    x9.getClass();
                    if (i9 == c1196r.f13488S) {
                        int w7 = c1196r.f13482M[i9].w();
                        while (i10 < arrayList.size() && ((C1189k) arrayList.get(i10)).f13393B != w7) {
                            i10++;
                        }
                        if (i10 < arrayList.size()) {
                            x4 = ((C1189k) arrayList.get(i10)).f12596d;
                        } else {
                            x4 = c1196r.f13492W;
                            x4.getClass();
                        }
                        x9 = x9.d(x4);
                    }
                    v02.f17563c = x9;
                }
            }
        }
        return i8;
    }

    public final boolean f() {
        int i7 = this.f13457c;
        return (i7 == -1 || i7 == -3 || i7 == -2) ? false : true;
    }
}
