package P0;

import I.C0160m;
import K0.C0203h;
import K0.F;
import K0.N;
import com.google.android.gms.internal.ads.C1216kp;
import com.google.android.gms.internal.ads.C1617tm;
import com.google.android.gms.internal.ads.InterfaceC1229l1;
import k4.AbstractC2036a;
import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class h implements InterfaceC1229l1 {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f4650k = 2;

    /* renamed from: l, reason: collision with root package name */
    public int f4651l;

    /* renamed from: m, reason: collision with root package name */
    public int f4652m;

    /* renamed from: n, reason: collision with root package name */
    public int f4653n;

    /* renamed from: o, reason: collision with root package name */
    public int f4654o;

    /* renamed from: p, reason: collision with root package name */
    public final Object f4655p;

    public h(int i, int i5, int i6, int i7, int i8, byte[] bArr) {
        this.f4651l = i5;
        this.f4652m = i6;
        this.f4653n = i7;
        this.f4654o = i8;
        this.f4655p = bArr;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1229l1
    public int a() {
        return -1;
    }

    public void b(int i, int i5) {
        long b3 = F.b(i, i5);
        ((M0.e) this.f4655p).m(i, i5, "");
        long Z4 = AbstractC2036a.Z(F.b(this.f4651l, this.f4652m), b3);
        k(N.e(Z4));
        j(N.d(Z4));
        int i6 = this.f4653n;
        if (i6 != -1) {
            long Z5 = AbstractC2036a.Z(F.b(i6, this.f4654o), b3);
            if (N.b(Z5)) {
                this.f4653n = -1;
                this.f4654o = -1;
            } else {
                this.f4653n = N.e(Z5);
                this.f4654o = N.d(Z5);
            }
        }
    }

    public char c(int i) {
        M0.e eVar = (M0.e) this.f4655p;
        C0160m c0160m = (C0160m) eVar.f3593e;
        if (c0160m == null) {
            return ((String) eVar.f3592d).charAt(i);
        }
        if (i < eVar.f3590b) {
            return ((String) eVar.f3592d).charAt(i);
        }
        int c5 = c0160m.f2498b - c0160m.c();
        int i5 = eVar.f3590b;
        if (i >= c5 + i5) {
            return ((String) eVar.f3592d).charAt(i - ((c5 - eVar.f3591c) + i5));
        }
        int i6 = i - i5;
        int i7 = c0160m.f2499c;
        return i6 < i7 ? ((char[]) c0160m.f2501e)[i6] : ((char[]) c0160m.f2501e)[(i6 - i7) + c0160m.f2500d];
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1229l1
    public int d() {
        return this.f4651l;
    }

    public N e() {
        int i = this.f4653n;
        if (i != -1) {
            return new N(F.b(i, this.f4654o));
        }
        return null;
    }

    public void f(int i, int i5, String str) {
        M0.e eVar = (M0.e) this.f4655p;
        if (i < 0 || i > eVar.c()) {
            StringBuilder v4 = AbstractC2107A.v(i, "start (", ") offset is outside of text region ");
            v4.append(eVar.c());
            throw new IndexOutOfBoundsException(v4.toString());
        }
        if (i5 < 0 || i5 > eVar.c()) {
            StringBuilder v5 = AbstractC2107A.v(i5, "end (", ") offset is outside of text region ");
            v5.append(eVar.c());
            throw new IndexOutOfBoundsException(v5.toString());
        }
        if (i > i5) {
            throw new IllegalArgumentException(L1.a.k(i, i5, "Do not set reversed range: ", " > "));
        }
        eVar.m(i, i5, str);
        k(str.length() + i);
        j(str.length() + i);
        this.f4653n = -1;
        this.f4654o = -1;
    }

    public void g(int i, int i5) {
        M0.e eVar = (M0.e) this.f4655p;
        if (i < 0 || i > eVar.c()) {
            StringBuilder v4 = AbstractC2107A.v(i, "start (", ") offset is outside of text region ");
            v4.append(eVar.c());
            throw new IndexOutOfBoundsException(v4.toString());
        }
        if (i5 < 0 || i5 > eVar.c()) {
            StringBuilder v5 = AbstractC2107A.v(i5, "end (", ") offset is outside of text region ");
            v5.append(eVar.c());
            throw new IndexOutOfBoundsException(v5.toString());
        }
        if (i >= i5) {
            throw new IllegalArgumentException(L1.a.k(i, i5, "Do not set reversed or empty range: ", " > "));
        }
        this.f4653n = i;
        this.f4654o = i5;
    }

    public void h(int i, int i5) {
        M0.e eVar = (M0.e) this.f4655p;
        if (i < 0 || i > eVar.c()) {
            StringBuilder v4 = AbstractC2107A.v(i, "start (", ") offset is outside of text region ");
            v4.append(eVar.c());
            throw new IndexOutOfBoundsException(v4.toString());
        }
        if (i5 < 0 || i5 > eVar.c()) {
            StringBuilder v5 = AbstractC2107A.v(i5, "end (", ") offset is outside of text region ");
            v5.append(eVar.c());
            throw new IndexOutOfBoundsException(v5.toString());
        }
        if (i > i5) {
            throw new IllegalArgumentException(L1.a.k(i, i5, "Do not set reversed range: ", " > "));
        }
        k(i);
        j(i5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1229l1
    public int i() {
        C1617tm c1617tm = (C1617tm) this.f4655p;
        int i = this.f4652m;
        if (i == 8) {
            return c1617tm.v();
        }
        if (i == 16) {
            return c1617tm.z();
        }
        int i5 = this.f4653n;
        this.f4653n = i5 + 1;
        if (i5 % 2 != 0) {
            return this.f4654o & 15;
        }
        int v4 = c1617tm.v();
        this.f4654o = v4;
        return (v4 & 240) >> 4;
    }

    public void j(int i) {
        if (!(i >= 0)) {
            Q0.a.a("Cannot set selectionEnd to a negative value: " + i);
        }
        this.f4652m = i;
    }

    public void k(int i) {
        if (!(i >= 0)) {
            Q0.a.a("Cannot set selectionStart to a negative value: " + i);
        }
        this.f4651l = i;
    }

    public String toString() {
        switch (this.f4650k) {
            case 0:
                return ((M0.e) this.f4655p).toString();
            default:
                return super.toString();
        }
    }

    public h(C1216kp c1216kp) {
        C1617tm c1617tm = c1216kp.f14290c;
        this.f4655p = c1617tm;
        c1617tm.j(12);
        this.f4652m = c1617tm.y() & 255;
        this.f4651l = c1617tm.y();
    }

    public h(C0203h c0203h, long j5) {
        String str = c0203h.f2829l;
        M0.e eVar = new M0.e(1, (byte) 0);
        eVar.f3592d = str;
        eVar.f3590b = -1;
        eVar.f3591c = -1;
        this.f4655p = eVar;
        this.f4651l = N.e(j5);
        this.f4652m = N.d(j5);
        this.f4653n = -1;
        this.f4654o = -1;
        int e3 = N.e(j5);
        int d5 = N.d(j5);
        String str2 = c0203h.f2829l;
        if (e3 >= 0 && e3 <= str2.length()) {
            if (d5 < 0 || d5 > str2.length()) {
                StringBuilder v4 = AbstractC2107A.v(d5, "end (", ") offset is outside of text region ");
                v4.append(str2.length());
                throw new IndexOutOfBoundsException(v4.toString());
            }
            if (e3 > d5) {
                throw new IllegalArgumentException(L1.a.k(e3, d5, "Do not set reversed range: ", " > "));
            }
            return;
        }
        StringBuilder v5 = AbstractC2107A.v(e3, "start (", ") offset is outside of text region ");
        v5.append(str2.length());
        throw new IndexOutOfBoundsException(v5.toString());
    }
}
