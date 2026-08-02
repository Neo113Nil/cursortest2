package P;

import java.util.ArrayList;
import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class L0 {

    /* renamed from: a, reason: collision with root package name */
    public final M0 f4331a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f4332b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4333c;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f4334d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4335e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public int f4336g;

    /* renamed from: h, reason: collision with root package name */
    public int f4337h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public final Q f4338j;

    /* renamed from: k, reason: collision with root package name */
    public int f4339k;

    /* renamed from: l, reason: collision with root package name */
    public int f4340l;

    /* renamed from: m, reason: collision with root package name */
    public int f4341m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4342n;

    public L0(M0 m02) {
        this.f4331a = m02;
        this.f4332b = m02.f4343k;
        int i = m02.f4344l;
        this.f4333c = i;
        this.f4334d = m02.f4345m;
        this.f4335e = m02.f4346n;
        this.f4337h = i;
        this.i = -1;
        this.f4338j = new Q();
    }

    public final C0280a a(int i) {
        ArrayList arrayList = this.f4331a.f4351s;
        int e3 = O0.e(arrayList, i, this.f4333c);
        if (e3 >= 0) {
            return (C0280a) arrayList.get(e3);
        }
        C0280a c0280a = new C0280a(i);
        arrayList.add(-(e3 + 1), c0280a);
        return c0280a;
    }

    public final Object b(int[] iArr, int i) {
        int i5 = i * 5;
        int i6 = iArr[i5 + 1];
        if ((268435456 & i6) != 0) {
            return this.f4334d[i5 >= iArr.length ? iArr.length : iArr[i5 + 4] + Integer.bitCount(i6 >> 29)];
        }
        return C0302l.f4480a;
    }

    public final void c() {
        this.f = true;
        M0 m02 = this.f4331a;
        m02.getClass();
        if (this.f4331a != m02 || m02.f4347o <= 0) {
            AbstractC0317t.c("Unexpected reader close()");
        }
        m02.f4347o--;
        this.f4334d = new Object[0];
    }

    public final boolean d(int i) {
        return (this.f4332b[(i * 5) + 1] & 67108864) != 0;
    }

    public final void e() {
        if (this.f4339k == 0) {
            if (!(this.f4336g == this.f4337h)) {
                AbstractC0317t.c("endGroup() not called at the end of a group");
            }
            int i = (this.i * 5) + 2;
            int[] iArr = this.f4332b;
            int i5 = iArr[i];
            this.i = i5;
            int i6 = this.f4333c;
            this.f4337h = i5 < 0 ? i6 : O0.a(iArr, i5) + i5;
            int b3 = this.f4338j.b();
            if (b3 < 0) {
                this.f4340l = 0;
                this.f4341m = 0;
            } else {
                this.f4340l = b3;
                this.f4341m = i5 >= i6 - 1 ? this.f4335e : iArr[((i5 + 1) * 5) + 4];
            }
        }
    }

    public final Object f() {
        int i = this.f4336g;
        if (i < this.f4337h) {
            return b(this.f4332b, i);
        }
        return 0;
    }

    public final int g() {
        int i = this.f4336g;
        if (i >= this.f4337h) {
            return 0;
        }
        return this.f4332b[i * 5];
    }

    public final Object h(int i, int i5) {
        int[] iArr = this.f4332b;
        int c5 = O0.c(iArr, i);
        int i6 = i + 1;
        int i7 = c5 + i5;
        return i7 < (i6 < this.f4333c ? iArr[(i6 * 5) + 4] : this.f4335e) ? this.f4334d[i7] : C0302l.f4480a;
    }

    public final int i(int i) {
        return this.f4332b[i * 5];
    }

    public final boolean j(int i) {
        return (this.f4332b[(i * 5) + 1] & 134217728) != 0;
    }

    public final boolean k(int i) {
        return (this.f4332b[(i * 5) + 1] & 536870912) != 0;
    }

    public final boolean l(int i) {
        return (this.f4332b[(i * 5) + 1] & 1073741824) != 0;
    }

    public final Object m() {
        int i;
        if (this.f4339k > 0 || (i = this.f4340l) >= this.f4341m) {
            this.f4342n = false;
            return C0302l.f4480a;
        }
        this.f4342n = true;
        Object[] objArr = this.f4334d;
        this.f4340l = i + 1;
        return objArr[i];
    }

    public final Object n(int i) {
        int i5 = i * 5;
        int[] iArr = this.f4332b;
        int i6 = iArr[i5 + 1] & 1073741824;
        if (i6 != 0) {
            return i6 != 0 ? this.f4334d[iArr[i5 + 4]] : C0302l.f4480a;
        }
        return null;
    }

    public final int o(int i) {
        return this.f4332b[(i * 5) + 1] & 67108863;
    }

    public final Object p(int[] iArr, int i) {
        int i5 = i * 5;
        int i6 = iArr[i5 + 1];
        if ((536870912 & i6) == 0) {
            return null;
        }
        return this.f4334d[Integer.bitCount(i6 >> 30) + iArr[i5 + 4]];
    }

    public final int q(int i) {
        return this.f4332b[(i * 5) + 2];
    }

    public final void r(int i) {
        if (!(this.f4339k == 0)) {
            AbstractC0317t.c("Cannot reposition while in an empty region");
        }
        this.f4336g = i;
        int[] iArr = this.f4332b;
        int i5 = this.f4333c;
        int i6 = i < i5 ? iArr[(i * 5) + 2] : -1;
        if (i6 != this.i) {
            this.i = i6;
            if (i6 < 0) {
                this.f4337h = i5;
            } else {
                this.f4337h = O0.a(iArr, i6) + i6;
            }
            this.f4340l = 0;
            this.f4341m = 0;
        }
    }

    public final int s() {
        if (!(this.f4339k == 0)) {
            AbstractC0317t.c("Cannot skip while in an empty region");
        }
        int i = this.f4336g;
        int[] iArr = this.f4332b;
        int i5 = (iArr[(i * 5) + 1] & 1073741824) == 0 ? iArr[(i * 5) + 1] & 67108863 : 1;
        this.f4336g = O0.a(iArr, i) + i;
        return i5;
    }

    public final void t() {
        if (!(this.f4339k == 0)) {
            AbstractC0317t.c("Cannot skip the enclosing group while in an empty region");
        }
        this.f4336g = this.f4337h;
        this.f4340l = 0;
        this.f4341m = 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SlotReader(current=");
        sb.append(this.f4336g);
        sb.append(", key=");
        sb.append(g());
        sb.append(", parent=");
        sb.append(this.i);
        sb.append(", end=");
        return AbstractC2107A.t(sb, this.f4337h, ')');
    }

    public final void u() {
        if (this.f4339k <= 0) {
            int i = this.i;
            int i5 = this.f4336g;
            int[] iArr = this.f4332b;
            if (!(iArr[(i5 * 5) + 2] == i)) {
                AbstractC0316s0.a("Invalid slot table detected");
            }
            int i6 = this.f4340l;
            int i7 = this.f4341m;
            Q q5 = this.f4338j;
            if (i6 == 0 && i7 == 0) {
                q5.c(-1);
            } else {
                q5.c(i6);
            }
            this.i = i5;
            this.f4337h = O0.a(iArr, i5) + i5;
            int i8 = i5 + 1;
            this.f4336g = i8;
            this.f4340l = O0.c(iArr, i5);
            this.f4341m = i5 >= this.f4333c - 1 ? this.f4335e : iArr[(i8 * 5) + 4];
        }
    }
}
