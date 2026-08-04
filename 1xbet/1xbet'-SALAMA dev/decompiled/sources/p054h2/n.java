package p054h2;

import A1.X;
import D1.h;
import W5.AbstractC0486a1;
import Z4.b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import p018c2.W;
import p151v2.a;
import p151v2.t;
import p155w1.V0;

/* JADX INFO: loaded from: classes.dex */
public final class n implements W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f13462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13463c = -1;

    public n(r rVar, int i7) {
        this.f13462b = rVar;
        this.f13461a = i7;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0036  */
    public final void a() {
        a.f(this.f13463c == -1);
        r rVar = this.f13462b;
        rVar.c();
        rVar.f13505b0.getClass();
        int[] iArr = rVar.f13505b0;
        int i7 = this.f13461a;
        int i8 = iArr[i7];
        if (i8 != -1) {
            boolean[] zArr = rVar.f13510e0;
            if (zArr[i8]) {
                i8 = -2;
            } else {
                zArr[i8] = true;
            }
        } else if (rVar.f13503a0.contains(rVar.f13501Z.a(i7))) {
            i8 = -3;
        } else {
            i8 = -2;
        }
        this.f13463c = i8;
    }

    @Override // p018c2.W
    public final boolean b() {
        if (this.f13463c != -3) {
            if (f()) {
                int i7 = this.f13463c;
                r rVar = this.f13462b;
                if (rVar.t() || !rVar.f13488M[i7].s(rVar.f13517k0)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // p018c2.W
    public final void c() throws IOException {
        int i7 = this.f13463c;
        r rVar = this.f13462b;
        if (i7 == -2) {
            rVar.c();
            throw new b(AbstractC0486a1.h("Unable to bind a sample queue to TrackGroup with mime type ", rVar.f13501Z.a(this.f13461a).f10344d[0].f283C, "."));
        }
        if (i7 == -1) {
            rVar.x();
        } else if (i7 != -3) {
            rVar.x();
            rVar.f13488M[i7].u();
        }
    }

    @Override // p018c2.W
    public final int d(long j) {
        if (!f()) {
            return 0;
        }
        int i7 = this.f13463c;
        r rVar = this.f13462b;
        if (rVar.t()) {
            return 0;
        }
        q qVar = rVar.f13488M[i7];
        int iP = qVar.p(j, rVar.f13517k0);
        ArrayList arrayList = rVar.f13480E;
        Object next = null;
        if (arrayList == null) {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                do {
                    next = it.next();
                } while (it.hasNext());
            }
        } else if (!arrayList.isEmpty()) {
            next = arrayList.get(arrayList.size() - 1);
        }
        k kVar = (k) next;
        if (kVar != null && !kVar.f13425b0) {
            iP = Math.min(iP, kVar.e(i7) - qVar.n());
        }
        qVar.A(iP);
        return iP;
    }

    @Override // p018c2.W
    public final int e(V0 v6, h hVar, int i7) {
        X x4;
        int iX = -3;
        if (this.f13463c == -3) {
            hVar.b(4);
            return -4;
        }
        if (f()) {
            int i8 = this.f13463c;
            r rVar = this.f13462b;
            if (!rVar.t()) {
                ArrayList arrayList = rVar.f13480E;
                int i9 = 0;
                if (!arrayList.isEmpty()) {
                    int i10 = 0;
                    loop0: while (i10 < arrayList.size() - 1) {
                        int i11 = ((k) arrayList.get(i10)).f13399B;
                        int length = rVar.f13488M.length;
                        for (int i12 = 0; i12 < length; i12++) {
                            if (rVar.f13510e0[i12] && rVar.f13488M[i12].w() == i11) {
                                break loop0;
                            }
                        }
                        i10++;
                    }
                    t.J(arrayList, 0, i10);
                    k kVar = (k) arrayList.get(0);
                    X x7 = kVar.f12602d;
                    if (!x7.equals(rVar.f13499X)) {
                        rVar.f13477B.b(rVar.f13504b, x7, kVar.f12603e, kVar.f12604f, kVar.f12605x);
                    }
                    rVar.f13499X = x7;
                }
                if ((arrayList.isEmpty() || ((k) arrayList.get(0)).f13425b0) && (iX = rVar.f13488M[i8].x(v6, hVar, i7, rVar.f13517k0)) == -5) {
                    X xD = (X) v6.f17569c;
                    xD.getClass();
                    if (i8 == rVar.f13494S) {
                        int iW = rVar.f13488M[i8].w();
                        while (i9 < arrayList.size() && ((k) arrayList.get(i9)).f13399B != iW) {
                            i9++;
                        }
                        if (i9 < arrayList.size()) {
                            x4 = ((k) arrayList.get(i9)).f12602d;
                        } else {
                            x4 = rVar.f13498W;
                            x4.getClass();
                        }
                        xD = xD.d(x4);
                    }
                    v6.f17569c = xD;
                }
            }
        }
        return iX;
    }

    public final boolean f() {
        int i7 = this.f13463c;
        return (i7 == -1 || i7 == -3 || i7 == -2) ? false : true;
    }
}
