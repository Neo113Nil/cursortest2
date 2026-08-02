package P;

import java.util.ArrayList;
import java.util.HashMap;
import r.AbstractC2335m;
import r.C2316B;
import r.C2342u;
import r.C2343v;
import s.AbstractC2351a;

/* loaded from: classes.dex */
public final class P0 {

    /* renamed from: a, reason: collision with root package name */
    public final M0 f4366a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f4367b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f4368c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f4369d;

    /* renamed from: e, reason: collision with root package name */
    public HashMap f4370e;
    public C2343v f;

    /* renamed from: g, reason: collision with root package name */
    public int f4371g;

    /* renamed from: h, reason: collision with root package name */
    public int f4372h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f4373j;

    /* renamed from: k, reason: collision with root package name */
    public int f4374k;

    /* renamed from: l, reason: collision with root package name */
    public int f4375l;

    /* renamed from: m, reason: collision with root package name */
    public int f4376m;

    /* renamed from: n, reason: collision with root package name */
    public int f4377n;

    /* renamed from: o, reason: collision with root package name */
    public int f4378o;

    /* renamed from: p, reason: collision with root package name */
    public final Q f4379p;

    /* renamed from: q, reason: collision with root package name */
    public final Q f4380q;

    /* renamed from: r, reason: collision with root package name */
    public final Q f4381r;

    /* renamed from: s, reason: collision with root package name */
    public C2343v f4382s;

    /* renamed from: t, reason: collision with root package name */
    public int f4383t;

    /* renamed from: u, reason: collision with root package name */
    public int f4384u;

    /* renamed from: v, reason: collision with root package name */
    public int f4385v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f4386w;

    /* renamed from: x, reason: collision with root package name */
    public C2342u f4387x;

    public P0(M0 m02) {
        this.f4366a = m02;
        int[] iArr = m02.f4343k;
        this.f4367b = iArr;
        Object[] objArr = m02.f4345m;
        this.f4368c = objArr;
        this.f4369d = m02.f4351s;
        this.f4370e = m02.f4352t;
        this.f = m02.f4353u;
        int i = m02.f4344l;
        this.f4371g = i;
        this.f4372h = (iArr.length / 5) - i;
        int i5 = m02.f4346n;
        this.f4374k = i5;
        this.f4375l = objArr.length - i5;
        this.f4376m = i;
        this.f4379p = new Q();
        this.f4380q = new Q();
        this.f4381r = new Q();
        this.f4384u = i;
        this.f4385v = -1;
    }

    public static int i(int i, int i5, int i6, int i7) {
        return i > i5 ? -(((i7 - i6) - i) + 1) : i;
    }

    public static void y(P0 p02) {
        int i = p02.f4385v;
        int r5 = p02.r(i);
        int[] iArr = p02.f4367b;
        int i5 = (r5 * 5) + 1;
        int i6 = iArr[i5];
        if ((i6 & 134217728) != 0) {
            return;
        }
        int i7 = (i6 & (-134217729)) | 134217728;
        iArr[i5] = i7;
        if ((67108864 & i7) != 0) {
            return;
        }
        p02.S(p02.D(iArr, i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        r2 = r8.f4367b;
        r3 = r9 * 5;
        r4 = r0 * 5;
        r5 = r1 * 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        if (r9 >= r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
    
        X3.l.s0(r4 + r3, r3, r5, r2, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
    
        X3.l.s0(r5, r5 + r4, r3 + r4, r2, r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(int i) {
        C0280a c0280a;
        int i5;
        C0280a c0280a2;
        int i6;
        int i7;
        int i8 = this.f4372h;
        int i9 = this.f4371g;
        if (i9 != i) {
            if (!this.f4369d.isEmpty()) {
                int o5 = o() - this.f4372h;
                if (i9 < i) {
                    for (int b3 = O0.b(this.f4369d, i9, o5); b3 < this.f4369d.size() && (i6 = (c0280a2 = (C0280a) this.f4369d.get(b3)).f4439a) < 0 && (i7 = i6 + o5) < i; b3++) {
                        c0280a2.f4439a = i7;
                    }
                } else {
                    for (int b5 = O0.b(this.f4369d, i, o5); b5 < this.f4369d.size() && (i5 = (c0280a = (C0280a) this.f4369d.get(b5)).f4439a) >= 0; b5++) {
                        c0280a.f4439a = -(o5 - i5);
                    }
                }
            }
            if (i < i9) {
                i9 = i + i8;
            }
            int o6 = o();
            if (i9 >= o6) {
                AbstractC0317t.c("Check failed");
            }
            while (i9 < o6) {
                int i10 = (i9 * 5) + 2;
                int i11 = this.f4367b[i10];
                int p5 = i11 > -2 ? i11 : (p() + i11) - (-2);
                if (p5 >= i) {
                    p5 = -((p() - p5) - (-2));
                }
                if (p5 != i11) {
                    this.f4367b[i10] = p5;
                }
                i9++;
                if (i9 == i) {
                    i9 += i8;
                }
            }
        }
        this.f4371g = i;
    }

    public final void B(int i, int i5) {
        int i6 = this.f4375l;
        int i7 = this.f4374k;
        int i8 = this.f4376m;
        if (i7 != i) {
            Object[] objArr = this.f4368c;
            if (i < i7) {
                System.arraycopy(objArr, i, objArr, i + i6, i7 - i);
            } else {
                int i9 = i7 + i6;
                System.arraycopy(objArr, i9, objArr, i7, (i + i6) - i9);
            }
        }
        int min = Math.min(i5 + 1, p());
        if (i8 != min) {
            int length = this.f4368c.length - i6;
            if (min < i8) {
                int r5 = r(min);
                int r6 = r(i8);
                int i10 = this.f4371g;
                while (r5 < r6) {
                    int i11 = (r5 * 5) + 4;
                    int i12 = this.f4367b[i11];
                    if (!(i12 >= 0)) {
                        AbstractC0317t.c("Unexpected anchor value, expected a positive anchor");
                    }
                    this.f4367b[i11] = -((length - i12) + 1);
                    r5++;
                    if (r5 == i10) {
                        r5 += this.f4372h;
                    }
                }
            } else {
                int r7 = r(i8);
                int r8 = r(min);
                while (r7 < r8) {
                    int i13 = (r7 * 5) + 4;
                    int i14 = this.f4367b[i13];
                    if (!(i14 < 0)) {
                        AbstractC0317t.c("Unexpected anchor value, expected a negative anchor");
                    }
                    this.f4367b[i13] = i14 + length + 1;
                    r7++;
                    if (r7 == this.f4371g) {
                        r7 += this.f4372h;
                    }
                }
            }
            this.f4376m = min;
        }
        this.f4374k = i;
    }

    public final Object C(int i) {
        int r5 = r(i);
        int[] iArr = this.f4367b;
        if ((iArr[(r5 * 5) + 1] & 1073741824) != 0) {
            return this.f4368c[h(g(iArr, r5))];
        }
        return null;
    }

    public final int D(int[] iArr, int i) {
        int i5 = iArr[(r(i) * 5) + 2];
        return i5 > -2 ? i5 : (p() + i5) - (-2);
    }

    public final Object E(Object obj) {
        if (this.f4377n > 0) {
            w(1, this.f4385v);
        }
        Object[] objArr = this.f4368c;
        int i = this.i;
        this.i = i + 1;
        Object obj2 = objArr[h(i)];
        if (this.i > this.f4373j) {
            AbstractC0317t.c("Writing to an invalid slot");
        }
        this.f4368c[h(this.i - 1)] = obj;
        return obj2;
    }

    public final void F() {
        int i;
        C2342u c2342u = this.f4387x;
        if (c2342u != null) {
            while (c2342u.f19051b != 0) {
                int A3 = AbstractC0329z.A(c2342u);
                int r5 = r(A3);
                int i5 = A3 + 1;
                int t5 = t(A3) + A3;
                while (true) {
                    if (i5 >= t5) {
                        i = 0;
                        break;
                    } else {
                        if ((this.f4367b[(r(i5) * 5) + 1] & 201326592) != 0) {
                            i = 1;
                            break;
                        }
                        i5 += t(i5);
                    }
                }
                int[] iArr = this.f4367b;
                int i6 = (r5 * 5) + 1;
                int i7 = iArr[i6];
                if (((67108864 & i7) == 0 ? 0 : 1) != i) {
                    iArr[i6] = (i << 26) | ((-67108865) & i7);
                    int D5 = D(iArr, A3);
                    if (D5 >= 0) {
                        AbstractC0329z.h(c2342u, D5);
                    }
                }
            }
        }
    }

    public final boolean G() {
        if (!(this.f4377n == 0)) {
            AbstractC0317t.c("Cannot remove group while inserting");
        }
        int i = this.f4383t;
        int i5 = this.i;
        int g5 = g(this.f4367b, r(i));
        int K = K();
        N(this.f4385v);
        C2342u c2342u = this.f4387x;
        if (c2342u != null) {
            while (true) {
                int i6 = c2342u.f19051b;
                if (i6 == 0) {
                    break;
                }
                if (i6 == 0) {
                    AbstractC2351a.e("IntList is empty.");
                    throw null;
                }
                if (c2342u.f19050a[0] < i) {
                    break;
                }
                AbstractC0329z.A(c2342u);
            }
        }
        boolean H5 = H(i, this.f4383t - i);
        I(g5, this.i - g5, i - 1);
        this.f4383t = i;
        this.i = i5;
        this.f4378o -= K;
        return H5;
    }

    public final boolean H(int i, int i5) {
        if (i5 > 0) {
            ArrayList arrayList = this.f4369d;
            A(i);
            if (!arrayList.isEmpty()) {
                HashMap hashMap = this.f4370e;
                int i6 = i + i5;
                int b3 = O0.b(this.f4369d, i6, o() - this.f4372h);
                if (b3 >= this.f4369d.size()) {
                    b3--;
                }
                int i7 = b3 + 1;
                int i8 = 0;
                while (b3 >= 0) {
                    C0280a c0280a = (C0280a) this.f4369d.get(b3);
                    int c5 = c(c0280a);
                    if (c5 < i) {
                        break;
                    }
                    if (c5 < i6) {
                        c0280a.f4439a = Integer.MIN_VALUE;
                        if (hashMap != null) {
                        }
                        if (i8 == 0) {
                            i8 = b3 + 1;
                        }
                        i7 = b3;
                    }
                    b3--;
                }
                r0 = i7 < i8;
                if (r0) {
                    this.f4369d.subList(i7, i8).clear();
                }
            }
            this.f4371g = i;
            this.f4372h += i5;
            int i9 = this.f4376m;
            if (i9 > i) {
                this.f4376m = Math.max(i, i9 - i5);
            }
            int i10 = this.f4384u;
            if (i10 >= this.f4371g) {
                this.f4384u = i10 - i5;
            }
            int i11 = this.f4385v;
            if (i11 >= 0 && (this.f4367b[(r(i11) * 5) + 1] & 67108864) != 0) {
                S(i11);
            }
        }
        return r0;
    }

    public final void I(int i, int i5, int i6) {
        if (i5 > 0) {
            int i7 = this.f4375l;
            int i8 = i + i5;
            B(i8, i6);
            this.f4374k = i;
            this.f4375l = i7 + i5;
            X3.l.B0(this.f4368c, i, i8);
            int i9 = this.f4373j;
            if (i9 >= i) {
                this.f4373j = i9 - i5;
            }
        }
    }

    public final Object J(int i, int i5, Object obj) {
        int M5 = M(this.f4367b, r(i));
        int g5 = g(this.f4367b, r(i + 1));
        int i6 = M5 + i5;
        if (i6 < M5 || i6 >= g5) {
            AbstractC0317t.c("Write to an invalid slot index " + i5 + " for group " + i);
        }
        int h3 = h(i6);
        Object[] objArr = this.f4368c;
        Object obj2 = objArr[h3];
        objArr[h3] = obj;
        return obj2;
    }

    public final int K() {
        int r5 = r(this.f4383t);
        int a5 = O0.a(this.f4367b, r5) + this.f4383t;
        this.f4383t = a5;
        this.i = g(this.f4367b, r(a5));
        int i = this.f4367b[(r5 * 5) + 1];
        if ((1073741824 & i) != 0) {
            return 1;
        }
        return i & 67108863;
    }

    public final void L() {
        int i = this.f4384u;
        this.f4383t = i;
        this.i = g(this.f4367b, r(i));
    }

    public final int M(int[] iArr, int i) {
        if (i >= o()) {
            return this.f4368c.length - this.f4375l;
        }
        int c5 = O0.c(iArr, i);
        return c5 < 0 ? (this.f4368c.length - this.f4375l) + c5 + 1 : c5;
    }

    public final P N(int i) {
        C0280a Q5;
        HashMap hashMap = this.f4370e;
        if (hashMap == null || (Q5 = Q(i)) == null) {
            return null;
        }
        return (P) hashMap.get(Q5);
    }

    public final void O() {
        if (this.f4377n != 0) {
            AbstractC0317t.c("Key must be supplied when inserting");
        }
        Z z3 = C0302l.f4480a;
        P(0, z3, z3, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void P(int i, Object obj, Object obj2, boolean z3) {
        int i5;
        int i6 = this.f4385v;
        Object[] objArr = this.f4377n > 0;
        this.f4381r.c(this.f4378o);
        Z z5 = C0302l.f4480a;
        if (objArr == true) {
            int i7 = this.f4383t;
            int g5 = g(this.f4367b, r(i7));
            v(1);
            this.i = g5;
            this.f4373j = g5;
            int r5 = r(i7);
            int i8 = obj != z5 ? 1 : 0;
            int i9 = (z3 || obj2 == z5) ? 0 : 1;
            int i10 = i(g5, this.f4374k, this.f4375l, this.f4368c.length);
            if (i10 >= 0 && this.f4376m < i7) {
                i10 = -(((this.f4368c.length - this.f4375l) - i10) + 1);
            }
            int[] iArr = this.f4367b;
            int i11 = this.f4385v;
            int i12 = r5 * 5;
            iArr[i12] = i;
            iArr[i12 + 1] = ((z3 ? 1 : 0) << 30) | (i8 << 29) | (i9 << 28);
            iArr[i12 + 2] = i11;
            iArr[i12 + 3] = 0;
            iArr[i12 + 4] = i10;
            int i13 = (z3 ? 1 : 0) + i8 + i9;
            if (i13 > 0) {
                w(i13, i7);
                Object[] objArr2 = this.f4368c;
                int i14 = this.i;
                if (z3) {
                    objArr2[i14] = obj2;
                    i14++;
                }
                if (i8 != 0) {
                    objArr2[i14] = obj;
                    i14++;
                }
                if (i9 != 0) {
                    objArr2[i14] = obj2;
                    i14++;
                }
                this.i = i14;
            }
            this.f4378o = 0;
            i5 = i7 + 1;
            this.f4385v = i7;
            this.f4383t = i5;
            if (i6 >= 0) {
                N(i6);
            }
        } else {
            this.f4379p.c(i6);
            this.f4380q.c((o() - this.f4372h) - this.f4384u);
            int i15 = this.f4383t;
            int r6 = r(i15);
            if (!kotlin.jvm.internal.l.a(obj2, z5)) {
                if (z3) {
                    T(this.f4383t, obj2);
                } else {
                    R(obj2);
                }
            }
            this.i = M(this.f4367b, r6);
            this.f4373j = g(this.f4367b, r(this.f4383t + 1));
            int[] iArr2 = this.f4367b;
            int i16 = r6 * 5;
            this.f4378o = iArr2[i16 + 1] & 67108863;
            this.f4385v = i15;
            this.f4383t = i15 + 1;
            i5 = i15 + iArr2[i16 + 3];
        }
        this.f4384u = i5;
    }

    public final C0280a Q(int i) {
        ArrayList arrayList;
        int e3;
        if (i < 0 || i >= p() || (e3 = O0.e((arrayList = this.f4369d), i, p())) < 0) {
            return null;
        }
        return (C0280a) arrayList.get(e3);
    }

    public final void R(Object obj) {
        int r5 = r(this.f4383t);
        int i = (r5 * 5) + 1;
        if ((this.f4367b[i] & 268435456) == 0) {
            AbstractC0317t.c("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.f4368c;
        int[] iArr = this.f4367b;
        objArr[h(Integer.bitCount(iArr[i] >> 29) + g(iArr, r5))] = obj;
    }

    public final void S(int i) {
        if (i >= 0) {
            C2342u c2342u = this.f4387x;
            if (c2342u == null) {
                c2342u = new C2342u();
                this.f4387x = c2342u;
            }
            AbstractC0329z.h(c2342u, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if ((r1[(r0 * 5) + 1] & 1073741824) != 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T(int i, Object obj) {
        int r5 = r(i);
        int[] iArr = this.f4367b;
        boolean z3 = r5 < iArr.length;
        if (!z3) {
            AbstractC0317t.c("Updating the node of a group at " + i + " that was not created with as a node group");
        }
        this.f4368c[h(g(this.f4367b, r5))] = obj;
    }

    public final void a(int i) {
        boolean z3 = false;
        if (!(i >= 0)) {
            AbstractC0317t.c("Cannot seek backwards");
        }
        if (!(this.f4377n <= 0)) {
            AbstractC0316s0.b("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i5 = this.f4383t + i;
        if (i5 >= this.f4385v && i5 <= this.f4384u) {
            z3 = true;
        }
        if (!z3) {
            AbstractC0317t.c("Cannot seek outside the current group (" + this.f4385v + '-' + this.f4384u + ')');
        }
        this.f4383t = i5;
        int g5 = g(this.f4367b, r(i5));
        this.i = g5;
        this.f4373j = g5;
    }

    public final C0280a b(int i) {
        ArrayList arrayList = this.f4369d;
        int e3 = O0.e(arrayList, i, p());
        if (e3 >= 0) {
            return (C0280a) arrayList.get(e3);
        }
        if (i > this.f4371g) {
            i = -(p() - i);
        }
        C0280a c0280a = new C0280a(i);
        arrayList.add(-(e3 + 1), c0280a);
        return c0280a;
    }

    public final int c(C0280a c0280a) {
        int i = c0280a.f4439a;
        return i < 0 ? p() + i : i;
    }

    public final void d() {
        int i = this.f4377n;
        this.f4377n = i + 1;
        if (i == 0) {
            this.f4380q.c((o() - this.f4372h) - this.f4384u);
        }
    }

    public final void e(boolean z3) {
        this.f4386w = true;
        if (z3 && this.f4379p.f4389b == 0) {
            A(p());
            B(this.f4368c.length - this.f4375l, this.f4371g);
            int i = this.f4374k;
            X3.l.B0(this.f4368c, i, this.f4375l + i);
            F();
        }
        int[] iArr = this.f4367b;
        int i5 = this.f4371g;
        Object[] objArr = this.f4368c;
        int i6 = this.f4374k;
        ArrayList arrayList = this.f4369d;
        HashMap hashMap = this.f4370e;
        C2343v c2343v = this.f;
        M0 m02 = this.f4366a;
        m02.getClass();
        if (!m02.f4349q) {
            AbstractC0316s0.a("Unexpected writer close()");
        }
        m02.f4349q = false;
        m02.f4343k = iArr;
        m02.f4344l = i5;
        m02.f4345m = objArr;
        m02.f4346n = i6;
        m02.f4351s = arrayList;
        m02.f4352t = hashMap;
        m02.f4353u = c2343v;
    }

    public final int f(int i) {
        return g(this.f4367b, r(i));
    }

    public final int g(int[] iArr, int i) {
        if (i >= o()) {
            return this.f4368c.length - this.f4375l;
        }
        int i5 = iArr[(i * 5) + 4];
        return i5 < 0 ? (this.f4368c.length - this.f4375l) + i5 + 1 : i5;
    }

    public final int h(int i) {
        return (this.f4375l * (i < this.f4374k ? 0 : 1)) + i;
    }

    public final void j() {
        C2316B c2316b;
        boolean z3 = this.f4377n > 0;
        int i = this.f4383t;
        int i5 = this.f4384u;
        int i6 = this.f4385v;
        int r5 = r(i6);
        int i7 = this.f4378o;
        int i8 = i - i6;
        int i9 = r5 * 5;
        int i10 = i9 + 1;
        boolean z5 = (this.f4367b[i10] & 1073741824) != 0;
        Q q5 = this.f4381r;
        if (z3) {
            C2343v c2343v = this.f4382s;
            if (c2343v != null && (c2316b = (C2316B) c2343v.b(i6)) != null) {
                Object[] objArr = c2316b.f18904a;
                int i11 = c2316b.f18905b;
                for (int i12 = 0; i12 < i11; i12++) {
                    E(objArr[i12]);
                }
            }
            int[] iArr = this.f4367b;
            iArr[i9 + 3] = i8;
            O0.d(r5, i7, iArr);
            int b3 = q5.b();
            if (z5) {
                i7 = 1;
            }
            this.f4378o = b3 + i7;
            int D5 = D(this.f4367b, i6);
            this.f4385v = D5;
            int p5 = D5 < 0 ? p() : r(D5 + 1);
            int g5 = p5 >= 0 ? g(this.f4367b, p5) : 0;
            this.i = g5;
            this.f4373j = g5;
            return;
        }
        if (i != i5) {
            AbstractC0317t.c("Expected to be at the end of a group");
        }
        int[] iArr2 = this.f4367b;
        int i13 = i9 + 3;
        int i14 = iArr2[i13];
        int i15 = iArr2[i10] & 67108863;
        iArr2[i13] = i8;
        O0.d(r5, i7, iArr2);
        int b5 = this.f4379p.b();
        this.f4384u = (o() - this.f4372h) - this.f4380q.b();
        this.f4385v = b5;
        int D6 = D(this.f4367b, i6);
        int b6 = q5.b();
        this.f4378o = b6;
        if (D6 == b5) {
            this.f4378o = b6 + (z5 ? 0 : i7 - i15);
            return;
        }
        int i16 = i8 - i14;
        int i17 = z5 ? 0 : i7 - i15;
        if (i16 != 0 || i17 != 0) {
            while (D6 != 0 && D6 != b5 && (i17 != 0 || i16 != 0)) {
                int r6 = r(D6);
                if (i16 != 0) {
                    int[] iArr3 = this.f4367b;
                    int i18 = (r6 * 5) + 3;
                    iArr3[i18] = iArr3[i18] + i16;
                }
                if (i17 != 0) {
                    int[] iArr4 = this.f4367b;
                    O0.d(r6, (iArr4[(r6 * 5) + 1] & 67108863) + i17, iArr4);
                }
                int[] iArr5 = this.f4367b;
                if ((iArr5[(r6 * 5) + 1] & 1073741824) != 0) {
                    i17 = 0;
                }
                D6 = D(iArr5, D6);
            }
        }
        this.f4378o += i17;
    }

    public final void k() {
        if (this.f4377n <= 0) {
            AbstractC0316s0.b("Unbalanced begin/end insert");
        }
        int i = this.f4377n - 1;
        this.f4377n = i;
        if (i == 0) {
            if (this.f4381r.f4389b != this.f4379p.f4389b) {
                AbstractC0317t.c("startGroup/endGroup mismatch while inserting");
            }
            this.f4384u = (o() - this.f4372h) - this.f4380q.b();
        }
    }

    public final void l(int i) {
        boolean z3 = false;
        if (!(this.f4377n <= 0)) {
            AbstractC0317t.c("Cannot call ensureStarted() while inserting");
        }
        int i5 = this.f4385v;
        if (i5 != i) {
            if (i >= i5 && i < this.f4384u) {
                z3 = true;
            }
            if (!z3) {
                AbstractC0317t.c("Started group at " + i + " must be a subgroup of the group at " + i5);
            }
            int i6 = this.f4383t;
            int i7 = this.i;
            int i8 = this.f4373j;
            this.f4383t = i;
            O();
            this.f4383t = i6;
            this.i = i7;
            this.f4373j = i8;
        }
    }

    public final void m(int i, int i5, int i6) {
        if (i >= this.f4371g) {
            i = -((p() - i) + 2);
        }
        while (i6 < i5) {
            this.f4367b[(r(i6) * 5) + 2] = i;
            int i7 = this.f4367b[(r(i6) * 5) + 3] + i6;
            m(i6, i7, i6 + 1);
            i6 = i7;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f0, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(int i, i4.e eVar) {
        int i5;
        int i6;
        C0280a c0280a;
        i4.e eVar2 = eVar;
        int D5 = D(this.f4367b, i);
        int p5 = p();
        int t5 = t(i) + i;
        int i7 = i;
        r.w wVar = null;
        C2342u c2342u = null;
        loop0: while (i7 < t5) {
            int i8 = i7 + 1;
            int f = f(i8);
            for (int f5 = f(i7); f5 < f; f5++) {
                Object obj = this.f4368c[h(f5)];
                if ((obj instanceof H0) && (c0280a = ((H0) obj).f4320b) != null && c0280a.a()) {
                    int c5 = c(c0280a);
                    if (wVar == null) {
                        int[] iArr = AbstractC2335m.f19017a;
                        wVar = new r.w();
                    }
                    if (c2342u == null) {
                        c2342u = new C2342u();
                    }
                    wVar.a(c5);
                    c2342u.a(c5);
                    c2342u.a(f5);
                } else {
                    eVar2.invoke(Integer.valueOf(f5), obj);
                }
            }
            int D6 = i8 < p5 ? D(this.f4367b, i8) : -1;
            if (D6 != i7) {
                while (true) {
                    if (c2342u == null || wVar == null || !wVar.e(i7)) {
                        i5 = p5;
                    } else {
                        int i9 = c2342u.f19051b;
                        int i10 = i9 / 2;
                        int i11 = 0;
                        int i12 = 0;
                        while (i11 < i10) {
                            int i13 = i11 * 2;
                            int i14 = p5;
                            int c6 = c2342u.c(i13);
                            if (c6 == i7) {
                                int c7 = c2342u.c(i13 + 1);
                                eVar2.invoke(Integer.valueOf(c7), this.f4368c[h(c7)]);
                            } else if (i13 != i12) {
                                int i15 = i12 + 1;
                                c2342u.e(i12, c6);
                                i12 += 2;
                                c2342u.e(i15, c2342u.c(i13 + 1));
                            } else {
                                i12 += 2;
                            }
                            i11++;
                            eVar2 = eVar;
                            p5 = i14;
                        }
                        i5 = p5;
                        if (i12 != i9) {
                            if (i12 < 0 || i12 > (i6 = c2342u.f19051b) || i9 < 0 || i9 > i6) {
                                break loop0;
                            }
                            if (i9 < i12) {
                                AbstractC2351a.c("The end index must be < start index");
                                throw null;
                            }
                            if (i9 != i12) {
                                if (i9 < i6) {
                                    int[] iArr2 = c2342u.f19050a;
                                    X3.l.s0(i12, i9, i6, iArr2, iArr2);
                                }
                                c2342u.f19051b -= i9 - i12;
                            }
                        }
                    }
                    if (i7 != i && D5 != D6) {
                        i7 = D5;
                        p5 = i5;
                        D5 = D(this.f4367b, D5);
                        eVar2 = eVar;
                    }
                }
            } else {
                i5 = p5;
            }
            eVar2 = eVar;
            D5 = D6;
            i7 = i8;
            p5 = i5;
        }
    }

    public final int o() {
        return this.f4367b.length / 5;
    }

    public final int p() {
        return o() - this.f4372h;
    }

    public final Object q(int i) {
        int r5 = r(i);
        int[] iArr = this.f4367b;
        int i5 = (r5 * 5) + 1;
        if ((iArr[i5] & 268435456) == 0) {
            return C0302l.f4480a;
        }
        return this.f4368c[Integer.bitCount(iArr[i5] >> 29) + g(iArr, r5)];
    }

    public final int r(int i) {
        return (this.f4372h * (i < this.f4371g ? 0 : 1)) + i;
    }

    public final Object s(int i) {
        int r5 = r(i);
        int[] iArr = this.f4367b;
        int i5 = r5 * 5;
        int i6 = iArr[i5 + 1];
        if ((536870912 & i6) == 0) {
            return null;
        }
        return this.f4368c[Integer.bitCount(i6 >> 30) + iArr[i5 + 4]];
    }

    public final int t(int i) {
        return O0.a(this.f4367b, r(i));
    }

    public final String toString() {
        return "SlotWriter(current = " + this.f4383t + " end=" + this.f4384u + " size = " + p() + " gap=" + this.f4371g + '-' + (this.f4371g + this.f4372h) + ')';
    }

    public final boolean u(int i, int i5) {
        int o5;
        int t5;
        if (i5 == this.f4385v) {
            o5 = this.f4384u;
        } else {
            Q q5 = this.f4379p;
            if (i5 > q5.a(0)) {
                t5 = t(i5);
            } else {
                int[] iArr = q5.f4388a;
                int min = Math.min(iArr.length, q5.f4389b);
                int i6 = 0;
                while (true) {
                    if (i6 >= min) {
                        i6 = -1;
                        break;
                    }
                    if (iArr[i6] == i5) {
                        break;
                    }
                    i6++;
                }
                if (i6 < 0) {
                    t5 = t(i5);
                } else {
                    o5 = (o() - this.f4372h) - this.f4380q.f4388a[i6];
                }
            }
            o5 = t5 + i5;
        }
        return i > i5 && i < o5;
    }

    public final void v(int i) {
        if (i > 0) {
            int i5 = this.f4383t;
            A(i5);
            int i6 = this.f4371g;
            int i7 = this.f4372h;
            int[] iArr = this.f4367b;
            int length = iArr.length / 5;
            int i8 = length - i7;
            if (i7 < i) {
                int max = Math.max(Math.max(length * 2, i8 + i), 32);
                int[] iArr2 = new int[max * 5];
                int i9 = max - i8;
                X3.l.s0(0, 0, i6 * 5, iArr, iArr2);
                X3.l.s0((i6 + i9) * 5, (i7 + i6) * 5, length * 5, iArr, iArr2);
                this.f4367b = iArr2;
                i7 = i9;
            }
            int i10 = this.f4384u;
            if (i10 >= i6) {
                this.f4384u = i10 + i;
            }
            int i11 = i6 + i;
            this.f4371g = i11;
            this.f4372h = i7 - i;
            int i12 = i(i8 > 0 ? f(i5 + i) : 0, this.f4376m >= i6 ? this.f4374k : 0, this.f4375l, this.f4368c.length);
            for (int i13 = i6; i13 < i11; i13++) {
                this.f4367b[(i13 * 5) + 4] = i12;
            }
            int i14 = this.f4376m;
            if (i14 >= i6) {
                this.f4376m = i14 + i;
            }
        }
    }

    public final void w(int i, int i5) {
        if (i > 0) {
            B(this.i, i5);
            int i6 = this.f4374k;
            int i7 = this.f4375l;
            if (i7 < i) {
                Object[] objArr = this.f4368c;
                int length = objArr.length;
                int i8 = length - i7;
                int max = Math.max(Math.max(length * 2, i8 + i), 32);
                Object[] objArr2 = new Object[max];
                for (int i9 = 0; i9 < max; i9++) {
                    objArr2[i9] = null;
                }
                int i10 = max - i8;
                int i11 = i7 + i6;
                System.arraycopy(objArr, 0, objArr2, 0, i6);
                System.arraycopy(objArr, i11, objArr2, i6 + i10, length - i11);
                this.f4368c = objArr2;
                i7 = i10;
            }
            int i12 = this.f4373j;
            if (i12 >= i6) {
                this.f4373j = i12 + i;
            }
            this.f4374k = i6 + i;
            this.f4375l = i7 - i;
        }
    }

    public final boolean x(int i) {
        return (this.f4367b[(r(i) * 5) + 1] & 1073741824) != 0;
    }

    public final void z(M0 m02, int i) {
        if (this.f4377n <= 0) {
            AbstractC0317t.c("Check failed");
        }
        if (i == 0 && this.f4383t == 0 && this.f4366a.f4344l == 0) {
            int[] iArr = m02.f4343k;
            int i5 = iArr[(i * 5) + 3];
            int i6 = m02.f4344l;
            if (i5 == i6) {
                int[] iArr2 = this.f4367b;
                Object[] objArr = this.f4368c;
                ArrayList arrayList = this.f4369d;
                HashMap hashMap = this.f4370e;
                C2343v c2343v = this.f;
                Object[] objArr2 = m02.f4345m;
                int i7 = m02.f4346n;
                HashMap hashMap2 = m02.f4352t;
                C2343v c2343v2 = m02.f4353u;
                this.f4367b = iArr;
                this.f4368c = objArr2;
                this.f4369d = m02.f4351s;
                this.f4371g = i6;
                this.f4372h = (iArr.length / 5) - i6;
                this.f4374k = i7;
                this.f4375l = objArr2.length - i7;
                this.f4376m = i6;
                this.f4370e = hashMap2;
                this.f = c2343v2;
                m02.f4343k = iArr2;
                m02.f4344l = 0;
                m02.f4345m = objArr;
                m02.f4346n = 0;
                m02.f4351s = arrayList;
                m02.f4352t = hashMap;
                m02.f4353u = c2343v;
                return;
            }
        }
        P0 f = m02.f();
        try {
            AbstractC0329z.s(f, i, this, true, true, false);
            f.e(true);
        } catch (Throwable th) {
            f.e(false);
            throw th;
        }
    }
}
