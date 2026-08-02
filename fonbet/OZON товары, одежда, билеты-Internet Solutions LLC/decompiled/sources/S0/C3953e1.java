package S0;

import Hj0.C3156m;
import S0.InterfaceC3967k;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: S0.e1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3953e1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3947c1 f25378a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private int[] f25379b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private Object[] f25380c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private ArrayList<C3945c> f25381d;

    /* renamed from: e, reason: collision with root package name */
    private HashMap<C3945c, V> f25382e;

    /* renamed from: f, reason: collision with root package name */
    private androidx.collection.C<androidx.collection.D> f25383f;

    /* renamed from: g, reason: collision with root package name */
    private int f25384g;

    /* renamed from: h, reason: collision with root package name */
    private int f25385h;

    /* renamed from: i, reason: collision with root package name */
    private int f25386i;

    /* renamed from: j, reason: collision with root package name */
    private int f25387j;

    /* renamed from: k, reason: collision with root package name */
    private int f25388k;

    /* renamed from: l, reason: collision with root package name */
    private int f25389l;

    /* renamed from: m, reason: collision with root package name */
    private int f25390m;

    /* renamed from: n, reason: collision with root package name */
    private int f25391n;

    /* renamed from: o, reason: collision with root package name */
    private int f25392o;

    /* renamed from: s, reason: collision with root package name */
    private androidx.collection.C<androidx.collection.J<Object>> f25396s;

    /* renamed from: t, reason: collision with root package name */
    private int f25397t;

    /* renamed from: u, reason: collision with root package name */
    private int f25398u;

    /* renamed from: w, reason: collision with root package name */
    private boolean f25400w;

    /* renamed from: x, reason: collision with root package name */
    private D0 f25401x;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final W f25393p = new W();

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final W f25394q = new W();

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final W f25395r = new W();

    /* renamed from: v, reason: collision with root package name */
    private int f25399v = -1;

    /* renamed from: S0.e1$a */
    public static final class a {
        public static final /* synthetic */ List a(C3953e1 c3953e1, int i11, C3953e1 c3953e12) {
            return b(c3953e1, i11, c3953e12, true, true, false);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static List b(C3953e1 c3953e1, int i11, C3953e1 c3953e12, boolean z11, boolean z12, boolean z13) {
            boolean z14;
            kotlin.collections.K k11;
            int e02 = c3953e1.e0(i11);
            int i12 = i11 + e02;
            int b11 = C3953e1.b(c3953e1, i11);
            int b12 = C3953e1.b(c3953e1, i12);
            int i13 = b12 - b11;
            boolean a11 = C3953e1.a(c3953e1, i11);
            c3953e12.i0(e02);
            c3953e12.j0(i13, c3953e12.U());
            if (c3953e1.f25384g < i12) {
                c3953e1.p0(i12);
            }
            if (c3953e1.f25388k < b12) {
                c3953e1.r0(b12, i12);
            }
            int[] iArr = c3953e12.f25379b;
            int U10 = c3953e12.U();
            int i14 = U10 * 5;
            C7705l.p(i14, i11 * 5, c3953e1.f25379b, iArr, i12 * 5);
            Object[] objArr = c3953e12.f25380c;
            int i15 = c3953e12.f25386i;
            C7705l.r(c3953e1.f25380c, i15, objArr, b11, b12);
            int W11 = c3953e12.W();
            iArr[i14 + 2] = W11;
            int i16 = U10 - i11;
            int i17 = U10 + e02;
            int J11 = i15 - c3953e12.J(iArr, U10);
            int i18 = c3953e12.f25390m;
            int i19 = c3953e12.f25389l;
            int length = objArr.length;
            int i21 = i18;
            int i22 = U10;
            while (true) {
                z14 = false;
                if (i22 >= i17) {
                    break;
                }
                if (i22 != U10) {
                    int i23 = (i22 * 5) + 2;
                    iArr[i23] = iArr[i23] + i16;
                }
                int i24 = J11;
                int i25 = i17;
                iArr[(i22 * 5) + 4] = C3953e1.e(c3953e12, c3953e12.J(iArr, i22) + i24, i21 >= i22 ? c3953e12.f25388k : 0, i19, length);
                if (i22 == i21) {
                    i21++;
                }
                i22++;
                i17 = i25;
                J11 = i24;
            }
            int i26 = i17;
            c3953e12.f25390m = i21;
            int h11 = C3156m.h(c3953e1.f25381d, i11, c3953e1.X());
            int h12 = C3156m.h(c3953e1.f25381d, i12, c3953e1.X());
            if (h11 < h12) {
                ArrayList arrayList = c3953e1.f25381d;
                ArrayList arrayList2 = new ArrayList(h12 - h11);
                for (int i27 = h11; i27 < h12; i27++) {
                    C3945c c3945c = (C3945c) arrayList.get(i27);
                    c3945c.c(c3945c.a() + i16);
                    arrayList2.add(c3945c);
                }
                c3953e12.f25381d.addAll(C3156m.h(c3953e12.f25381d, c3953e12.U(), c3953e12.X()), arrayList2);
                arrayList.subList(h11, h12).clear();
                k11 = arrayList2;
            } else {
                k11 = kotlin.collections.K.f71697a;
            }
            if (!k11.isEmpty()) {
                HashMap hashMap = c3953e1.f25382e;
                HashMap hashMap2 = c3953e12.f25382e;
                if (hashMap != null && hashMap2 != null) {
                    int size = k11.size();
                    for (int i28 = 0; i28 < size; i28++) {
                        C3945c c3945c2 = (C3945c) k11.get(i28);
                        V v11 = (V) hashMap.get(c3945c2);
                        if (v11 != null) {
                            hashMap.remove(c3945c2);
                            hashMap2.put(c3945c2, v11);
                        }
                    }
                }
            }
            int W12 = c3953e12.W();
            V B11 = C3953e1.B(c3953e12, W11);
            if (B11 != null) {
                int i29 = W12 + 1;
                int U11 = c3953e12.U();
                int i31 = -1;
                while (i29 < U11) {
                    i31 = i29;
                    i29 = C3156m.d(c3953e12.f25379b, i29) + i29;
                }
                B11.a(c3953e12, i31, U11);
            }
            int v02 = c3953e1.v0(i11);
            if (z13) {
                if (z11) {
                    boolean z15 = v02 >= 0;
                    if (z15) {
                        c3953e1.O0();
                        c3953e1.D(v02 - c3953e1.U());
                        c3953e1.O0();
                    }
                    c3953e1.D(i11 - c3953e1.U());
                    boolean z02 = c3953e1.z0();
                    if (z15) {
                        c3953e1.G0();
                        c3953e1.M();
                        c3953e1.G0();
                        c3953e1.M();
                    }
                    z14 = z02;
                } else {
                    z14 = c3953e1.A0(i11, e02);
                    c3953e1.B0(b11, i13, i11 - 1);
                }
            }
            if (z14) {
                r.j("Unexpectedly removed anchors");
                throw null;
            }
            c3953e12.f25392o += C3156m.g(iArr, U10) ? 1 : C3156m.i(iArr, U10);
            if (z12) {
                c3953e12.f25397t = i26;
                c3953e12.f25386i = i15 + i13;
            }
            if (a11) {
                c3953e12.W0(W11);
            }
            return k11;
        }

        static /* synthetic */ List c(C3953e1 c3953e1, int i11, C3953e1 c3953e12, boolean z11) {
            return b(c3953e1, i11, c3953e12, false, z11, true);
        }
    }

    public C3953e1(@NotNull C3947c1 c3947c1) {
        this.f25378a = c3947c1;
        this.f25379b = c3947c1.o();
        this.f25380c = c3947c1.r();
        this.f25381d = c3947c1.m();
        this.f25382e = c3947c1.t();
        this.f25383f = c3947c1.n();
        this.f25384g = c3947c1.q();
        this.f25385h = (this.f25379b.length / 5) - c3947c1.q();
        this.f25388k = c3947c1.s();
        this.f25389l = this.f25380c.length - c3947c1.s();
        this.f25390m = c3947c1.q();
        this.f25398u = c3947c1.q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean A0(int i11, int i12) {
        if (i12 > 0) {
            ArrayList<C3945c> arrayList = this.f25381d;
            p0(i11);
            if (!arrayList.isEmpty()) {
                HashMap<C3945c, V> hashMap = this.f25382e;
                int i13 = i11 + i12;
                int h11 = C3156m.h(this.f25381d, i13, Q() - this.f25385h);
                if (h11 >= this.f25381d.size()) {
                    h11--;
                }
                int i14 = h11 + 1;
                int i15 = 0;
                while (h11 >= 0) {
                    C3945c c3945c = this.f25381d.get(h11);
                    int F11 = F(c3945c);
                    if (F11 < i11) {
                        break;
                    }
                    if (F11 < i13) {
                        c3945c.c(LinearLayoutManager.INVALID_OFFSET);
                        if (hashMap != null) {
                            hashMap.remove(c3945c);
                        }
                        if (i15 == 0) {
                            i15 = h11 + 1;
                        }
                        i14 = h11;
                    }
                    h11--;
                }
                r0 = i14 < i15;
                if (r0) {
                    this.f25381d.subList(i14, i15).clear();
                }
            }
            this.f25384g = i11;
            this.f25385h += i12;
            int i16 = this.f25390m;
            if (i16 > i11) {
                this.f25390m = Math.max(i11, i16 - i12);
            }
            int i17 = this.f25398u;
            if (i17 >= this.f25384g) {
                this.f25398u = i17 - i12;
            }
            int i18 = this.f25399v;
            if (i18 >= 0 && C3156m.a(this.f25379b, b0(i18))) {
                W0(i18);
            }
        }
        return r0;
    }

    public static final V B(C3953e1 c3953e1, int i11) {
        C3945c T02;
        HashMap<C3945c, V> hashMap = c3953e1.f25382e;
        if (hashMap == null || (T02 = c3953e1.T0(i11)) == null) {
            return null;
        }
        return hashMap.get(T02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B0(int i11, int i12, int i13) {
        if (i12 > 0) {
            int i14 = this.f25389l;
            int i15 = i11 + i12;
            r0(i15, i13);
            this.f25388k = i11;
            this.f25389l = i14 + i12;
            C7705l.x(this.f25380c, null, i11, i15);
            int i16 = this.f25387j;
            if (i16 >= i11) {
                this.f25387j = i16 - i12;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int I0(int[] iArr, int i11) {
        if (i11 >= Q()) {
            return this.f25380c.length - this.f25389l;
        }
        int m11 = C3156m.m(iArr, i11);
        return m11 < 0 ? (this.f25380c.length - this.f25389l) + m11 + 1 : m11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int J(int[] iArr, int i11) {
        if (i11 >= Q()) {
            return this.f25380c.length - this.f25389l;
        }
        int b11 = C3156m.b(iArr, i11);
        return b11 < 0 ? (this.f25380c.length - this.f25389l) + b11 + 1 : b11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int K(int i11) {
        return i11 < this.f25388k ? i11 : i11 + this.f25389l;
    }

    private static int L(int i11, int i12, int i13, int i14) {
        return i11 > i12 ? -(((i14 - i13) - i11) + 1) : i11;
    }

    private final void P(int i11, int i12, int i13) {
        if (i11 >= this.f25384g) {
            i11 = -((X() - i11) + 2);
        }
        while (i13 < i12) {
            this.f25379b[(b0(i13) * 5) + 2] = i11;
            int d11 = C3156m.d(this.f25379b, b0(i13)) + i13;
            P(i13, d11, i13 + 1);
            i13 = d11;
        }
    }

    private final int Q() {
        return this.f25379b.length / 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void Q0(int i11, Object obj, Object obj2, boolean z11) {
        int d11;
        C3945c T02;
        int i12 = this.f25399v;
        Object[] objArr = this.f25391n > 0;
        this.f25395r.j(this.f25392o);
        if (objArr == true) {
            int i13 = this.f25397t;
            int J11 = J(this.f25379b, b0(i13));
            i0(1);
            this.f25386i = J11;
            this.f25387j = J11;
            int b02 = b0(i13);
            int i14 = obj != InterfaceC3967k.a.a() ? 1 : 0;
            int i15 = (z11 || obj2 == InterfaceC3967k.a.a()) ? 0 : 1;
            int L11 = L(J11, this.f25388k, this.f25389l, this.f25380c.length);
            if (L11 >= 0 && this.f25390m < i13) {
                L11 = -(((this.f25380c.length - this.f25389l) - L11) + 1);
            }
            int[] iArr = this.f25379b;
            int i16 = this.f25399v;
            int i17 = z11 ? 1073741824 : 0;
            int i18 = i14 != 0 ? 536870912 : 0;
            int i19 = i15 != 0 ? 268435456 : 0;
            int i21 = b02 * 5;
            iArr[i21] = i11;
            iArr[i21 + 1] = i17 | i18 | i19;
            iArr[i21 + 2] = i16;
            iArr[i21 + 3] = 0;
            iArr[i21 + 4] = L11;
            int i22 = (z11 ? 1 : 0) + i14 + i15;
            if (i22 > 0) {
                j0(i22, i13);
                Object[] objArr2 = this.f25380c;
                int i23 = this.f25386i;
                if (z11) {
                    objArr2[i23] = obj2;
                    i23++;
                }
                if (i14 != 0) {
                    objArr2[i23] = obj;
                    i23++;
                }
                if (i15 != 0) {
                    objArr2[i23] = obj2;
                    i23++;
                }
                this.f25386i = i23;
            }
            this.f25392o = 0;
            d11 = i13 + 1;
            this.f25399v = i13;
            this.f25397t = d11;
            if (i12 >= 0) {
                HashMap<C3945c, V> hashMap = this.f25382e;
                V v11 = null;
                if (hashMap != null && (T02 = T0(i12)) != null) {
                    v11 = hashMap.get(T02);
                }
                if (v11 != null) {
                    v11.f(this, i13);
                }
            }
        } else {
            this.f25393p.j(i12);
            this.f25394q.j((Q() - this.f25385h) - this.f25398u);
            int i24 = this.f25397t;
            int b03 = b0(i24);
            if (!Intrinsics.d(obj2, InterfaceC3967k.a.a())) {
                if (z11) {
                    Y0(this.f25397t, obj2);
                } else {
                    V0(obj2);
                }
            }
            this.f25386i = I0(this.f25379b, b03);
            this.f25387j = J(this.f25379b, b0(this.f25397t + 1));
            this.f25392o = C3156m.i(this.f25379b, b03);
            this.f25399v = i24;
            this.f25397t = i24 + 1;
            d11 = i24 + C3156m.d(this.f25379b, b03);
        }
        this.f25398u = d11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W0(int i11) {
        if (i11 >= 0) {
            D0 d02 = this.f25401x;
            if (d02 == null) {
                d02 = new D0(0);
                this.f25401x = d02;
            }
            d02.a(i11);
        }
    }

    private final void Y0(int i11, Object obj) {
        int b02 = b0(i11);
        int[] iArr = this.f25379b;
        if (b02 < iArr.length && C3156m.g(iArr, b02)) {
            this.f25380c[K(J(this.f25379b, b02))] = obj;
            return;
        }
        r.j("Updating the node of a group at " + i11 + " that was not created with as a node group");
        throw null;
    }

    public static final boolean a(C3953e1 c3953e1, int i11) {
        if (i11 >= 0) {
            return (c3953e1.f25379b[(c3953e1.b0(i11) * 5) + 1] & 201326592) != 0;
        }
        c3953e1.getClass();
        return false;
    }

    public static final int b(C3953e1 c3953e1, int i11) {
        return c3953e1.J(c3953e1.f25379b, c3953e1.b0(i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int b0(int i11) {
        return i11 < this.f25384g ? i11 : i11 + this.f25385h;
    }

    public static final /* synthetic */ int e(C3953e1 c3953e1, int i11, int i12, int i13, int i14) {
        c3953e1.getClass();
        return L(i11, i12, i13, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i0(int i11) {
        if (i11 > 0) {
            int i12 = this.f25397t;
            p0(i12);
            int i13 = this.f25384g;
            int i14 = this.f25385h;
            int[] iArr = this.f25379b;
            int length = iArr.length / 5;
            int i15 = length - i14;
            if (i14 < i11) {
                int max = Math.max(Math.max(length * 2, i15 + i11), 32);
                int[] iArr2 = new int[max * 5];
                int i16 = max - i15;
                C7705l.p(0, 0, iArr, iArr2, i13 * 5);
                C7705l.p((i13 + i16) * 5, (i14 + i13) * 5, iArr, iArr2, length * 5);
                this.f25379b = iArr2;
                i14 = i16;
            }
            int i17 = this.f25398u;
            if (i17 >= i13) {
                this.f25398u = i17 + i11;
            }
            int i18 = i13 + i11;
            this.f25384g = i18;
            this.f25385h = i14 - i11;
            int L11 = L(i15 > 0 ? J(this.f25379b, b0(i12 + i11)) : 0, this.f25390m >= i13 ? this.f25388k : 0, this.f25389l, this.f25380c.length);
            for (int i19 = i13; i19 < i18; i19++) {
                this.f25379b[(i19 * 5) + 4] = L11;
            }
            int i21 = this.f25390m;
            if (i21 >= i13) {
                this.f25390m = i21 + i11;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j0(int i11, int i12) {
        if (i11 > 0) {
            r0(this.f25386i, i12);
            int i13 = this.f25388k;
            int i14 = this.f25389l;
            if (i14 < i11) {
                Object[] objArr = this.f25380c;
                int length = objArr.length;
                int i15 = length - i14;
                int max = Math.max(Math.max(length * 2, i15 + i11), 32);
                Object[] objArr2 = new Object[max];
                for (int i16 = 0; i16 < max; i16++) {
                    objArr2[i16] = null;
                }
                int i17 = max - i15;
                C7705l.r(objArr, 0, objArr2, 0, i13);
                C7705l.r(objArr, i13 + i17, objArr2, i14 + i13, length);
                this.f25380c = objArr2;
                i14 = i17;
            }
            int i18 = this.f25387j;
            if (i18 >= i13) {
                this.f25387j = i18 + i11;
            }
            this.f25388k = i13 + i11;
            this.f25389l = i14 - i11;
        }
    }

    public static void m0(C3953e1 c3953e1) {
        int i11 = c3953e1.f25399v;
        int b02 = c3953e1.b0(i11);
        int[] iArr = c3953e1.f25379b;
        int i12 = (b02 * 5) + 1;
        int i13 = iArr[i12];
        if ((i13 & 134217728) != 0) {
            return;
        }
        iArr[i12] = i13 | 134217728;
        if (C3156m.a(iArr, b02)) {
            return;
        }
        c3953e1.W0(c3953e1.w0(c3953e1.f25379b, i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0063, code lost:
    
        r2 = r7.f25379b;
        r3 = r8 * 5;
        r4 = r0 * 5;
        r5 = r1 * 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006b, code lost:
    
        if (r8 >= r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006d, code lost:
    
        kotlin.collections.C7705l.p(r4 + r3, r3, r2, r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0072, code lost:
    
        kotlin.collections.C7705l.p(r5, r5 + r4, r2, r2, r3 + r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p0(int i11) {
        C3945c c3945c;
        int a11;
        C3945c c3945c2;
        int a12;
        int i12;
        int i13 = this.f25385h;
        int i14 = this.f25384g;
        if (i14 != i11) {
            if (!this.f25381d.isEmpty()) {
                int Q11 = Q() - this.f25385h;
                if (i14 < i11) {
                    for (int h11 = C3156m.h(this.f25381d, i14, Q11); h11 < this.f25381d.size() && (a12 = (c3945c2 = this.f25381d.get(h11)).a()) < 0 && (i12 = a12 + Q11) < i11; h11++) {
                        c3945c2.c(i12);
                    }
                } else {
                    for (int h12 = C3156m.h(this.f25381d, i11, Q11); h12 < this.f25381d.size() && (a11 = (c3945c = this.f25381d.get(h12)).a()) >= 0; h12++) {
                        c3945c.c(-(Q11 - a11));
                    }
                }
            }
            if (i11 < i14) {
                i14 = i11 + i13;
            }
            int Q12 = Q();
            r.u(i14 < Q12);
            while (i14 < Q12) {
                int k11 = C3156m.k(this.f25379b, i14);
                int X9 = k11 > -2 ? k11 : (X() + k11) - (-2);
                if (X9 >= i11) {
                    X9 = -((X() - X9) - (-2));
                }
                if (X9 != k11) {
                    this.f25379b[(i14 * 5) + 2] = X9;
                }
                i14++;
                if (i14 == i11) {
                    i14 += i13;
                }
            }
        }
        this.f25384g = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r0(int i11, int i12) {
        int i13 = this.f25389l;
        int i14 = this.f25388k;
        int i15 = this.f25390m;
        if (i14 != i11) {
            Object[] objArr = this.f25380c;
            if (i11 < i14) {
                C7705l.r(objArr, i11 + i13, objArr, i11, i14);
            } else {
                C7705l.r(objArr, i14, objArr, i14 + i13, i11 + i13);
            }
        }
        int min = Math.min(i12 + 1, X());
        if (i15 != min) {
            int length = this.f25380c.length - i13;
            if (min < i15) {
                int b02 = b0(min);
                int b03 = b0(i15);
                int i16 = this.f25384g;
                while (b02 < b03) {
                    int b11 = C3156m.b(this.f25379b, b02);
                    if (b11 < 0) {
                        r.j("Unexpected anchor value, expected a positive anchor");
                        throw null;
                    }
                    this.f25379b[(b02 * 5) + 4] = -((length - b11) + 1);
                    b02++;
                    if (b02 == i16) {
                        b02 += this.f25385h;
                    }
                }
            } else {
                int b04 = b0(i15);
                int b05 = b0(min);
                while (b04 < b05) {
                    int b12 = C3156m.b(this.f25379b, b04);
                    if (b12 >= 0) {
                        r.j("Unexpected anchor value, expected a negative anchor");
                        throw null;
                    }
                    this.f25379b[(b04 * 5) + 4] = b12 + length + 1;
                    b04++;
                    if (b04 == this.f25384g) {
                        b04 += this.f25385h;
                    }
                }
            }
            this.f25390m = min;
        }
        this.f25388k = i11;
    }

    private final int w0(int[] iArr, int i11) {
        int k11 = C3156m.k(iArr, b0(i11));
        return k11 > -2 ? k11 : (X() + k11) - (-2);
    }

    private final Object x0(Object obj) {
        if (this.f25391n > 0) {
            j0(1, this.f25399v);
        }
        Object[] objArr = this.f25380c;
        int i11 = this.f25386i;
        this.f25386i = i11 + 1;
        Object obj2 = objArr[K(i11)];
        int i12 = this.f25386i;
        if (i12 <= this.f25387j) {
            this.f25380c[K(i12 - 1)] = obj;
            return obj2;
        }
        r.j("Writing to an invalid slot");
        throw null;
    }

    private final void y0() {
        boolean z11;
        D0 d02 = this.f25401x;
        if (d02 != null) {
            while (d02.b()) {
                int d11 = d02.d();
                int b02 = b0(d11);
                int i11 = d11 + 1;
                int e02 = e0(d11) + d11;
                while (true) {
                    if (i11 >= e02) {
                        z11 = false;
                        break;
                    } else {
                        if ((this.f25379b[(b0(i11) * 5) + 1] & 201326592) != 0) {
                            z11 = true;
                            break;
                        }
                        i11 += e0(i11);
                    }
                }
                if (C3156m.a(this.f25379b, b02) != z11) {
                    int[] iArr = this.f25379b;
                    int i12 = (b02 * 5) + 1;
                    if (z11) {
                        iArr[i12] = iArr[i12] | 67108864;
                    } else {
                        iArr[i12] = iArr[i12] & (-67108865);
                    }
                    int w02 = w0(iArr, d11);
                    if (w02 >= 0) {
                        d02.a(w02);
                    }
                }
            }
        }
    }

    public final void C0() {
        if (!(this.f25391n == 0)) {
            r.j("Cannot reset when inserting");
            throw null;
        }
        y0();
        this.f25397t = 0;
        this.f25398u = Q() - this.f25385h;
        this.f25386i = 0;
        this.f25387j = 0;
        this.f25392o = 0;
    }

    public final void D(int i11) {
        boolean z11 = false;
        if (!(i11 >= 0)) {
            r.j("Cannot seek backwards");
            throw null;
        }
        if (!(this.f25391n <= 0)) {
            B0.b("Cannot call seek() while inserting");
            throw null;
        }
        if (i11 == 0) {
            return;
        }
        int i12 = this.f25397t + i11;
        if (i12 >= this.f25399v && i12 <= this.f25398u) {
            z11 = true;
        }
        if (z11) {
            this.f25397t = i12;
            int J11 = J(this.f25379b, b0(i12));
            this.f25386i = J11;
            this.f25387j = J11;
            return;
        }
        r.j("Cannot seek outside the current group (" + this.f25399v + '-' + this.f25398u + ')');
        throw null;
    }

    public final Object D0(int i11, int i12, Object obj) {
        int K11 = K(J0(i11, i12));
        Object[] objArr = this.f25380c;
        Object obj2 = objArr[K11];
        objArr[K11] = obj;
        return obj2;
    }

    @NotNull
    public final C3945c E(int i11) {
        int p11;
        ArrayList<C3945c> arrayList = this.f25381d;
        p11 = C3156m.p(arrayList, i11, X());
        if (p11 >= 0) {
            return arrayList.get(p11);
        }
        if (i11 > this.f25384g) {
            i11 = -(X() - i11);
        }
        C3945c c3945c = new C3945c(i11);
        arrayList.add(-(p11 + 1), c3945c);
        return c3945c;
    }

    public final Object E0(int i11, Object obj) {
        return D0(this.f25397t, i11, obj);
    }

    public final int F(@NotNull C3945c c3945c) {
        int a11 = c3945c.a();
        return a11 < 0 ? X() + a11 : a11;
    }

    public final int F0() {
        int b02 = b0(this.f25397t);
        int d11 = C3156m.d(this.f25379b, b02) + this.f25397t;
        this.f25397t = d11;
        this.f25386i = J(this.f25379b, b0(d11));
        if (C3156m.g(this.f25379b, b02)) {
            return 1;
        }
        return C3156m.i(this.f25379b, b02);
    }

    public final void G(@NotNull C3945c c3945c, Object obj) {
        if (this.f25391n != 0) {
            r.j("Can only append a slot if not current inserting");
            throw null;
        }
        int i11 = this.f25386i;
        int i12 = this.f25387j;
        int F11 = F(c3945c);
        int J11 = J(this.f25379b, b0(F11 + 1));
        this.f25386i = J11;
        this.f25387j = J11;
        j0(1, F11);
        if (i11 >= J11) {
            i11++;
            i12++;
        }
        this.f25380c[J11] = obj;
        this.f25386i = i11;
        this.f25387j = i12;
    }

    public final void G0() {
        int i11 = this.f25398u;
        this.f25397t = i11;
        this.f25386i = J(this.f25379b, b0(i11));
    }

    public final void H() {
        int i11 = this.f25391n;
        this.f25391n = i11 + 1;
        if (i11 == 0) {
            this.f25394q.j((Q() - this.f25385h) - this.f25398u);
        }
    }

    public final Object H0(@NotNull C3945c c3945c) {
        int F11 = F(c3945c);
        int I02 = I0(this.f25379b, b0(F11));
        if (I02 >= J(this.f25379b, b0(F11 + 1))) {
            return InterfaceC3967k.a.a();
        }
        return this.f25380c[K(I02)];
    }

    public final void I(boolean z11) {
        this.f25400w = true;
        if (z11 && this.f25393p.d()) {
            p0(X());
            r0(this.f25380c.length - this.f25389l, this.f25384g);
            int i11 = this.f25388k;
            C7705l.x(this.f25380c, null, i11, this.f25389l + i11);
            y0();
        }
        this.f25378a.h(this, this.f25379b, this.f25384g, this.f25380c, this.f25388k, this.f25381d, this.f25382e, this.f25383f);
    }

    public final int J0(int i11, int i12) {
        int I02 = I0(this.f25379b, b0(i11));
        int i13 = I02 + i12;
        if (i13 >= I02 && i13 < J(this.f25379b, b0(i11 + 1))) {
            return i13;
        }
        r.j("Write to an invalid slot index " + i12 + " for group " + i11);
        throw null;
    }

    public final int K0(int i11) {
        return J(this.f25379b, b0(e0(i11) + i11));
    }

    public final int L0(int i11) {
        return J(this.f25379b, b0(i11 + 1));
    }

    public final void M() {
        androidx.collection.J<Object> c11;
        boolean z11 = this.f25391n > 0;
        int i11 = this.f25397t;
        int i12 = this.f25398u;
        int i13 = this.f25399v;
        int b02 = b0(i13);
        int i14 = this.f25392o;
        int i15 = i11 - i13;
        boolean g10 = C3156m.g(this.f25379b, b02);
        W w11 = this.f25395r;
        if (z11) {
            androidx.collection.C<androidx.collection.J<Object>> c12 = this.f25396s;
            if (c12 != null && (c11 = c12.c(i13)) != null) {
                Object[] objArr = c11.f38646a;
                int i16 = c11.f38647b;
                for (int i17 = 0; i17 < i16; i17++) {
                    x0(objArr[i17]);
                }
                c12.i(i13);
            }
            C3156m.n(b02, i15, this.f25379b);
            C3156m.o(b02, i14, this.f25379b);
            int i18 = w11.i();
            if (g10) {
                i14 = 1;
            }
            this.f25392o = i18 + i14;
            int w02 = w0(this.f25379b, i13);
            this.f25399v = w02;
            int X9 = w02 < 0 ? X() : b0(w02 + 1);
            int J11 = X9 >= 0 ? J(this.f25379b, X9) : 0;
            this.f25386i = J11;
            this.f25387j = J11;
            return;
        }
        if (i11 != i12) {
            r.j("Expected to be at the end of a group");
            throw null;
        }
        int d11 = C3156m.d(this.f25379b, b02);
        int i19 = C3156m.i(this.f25379b, b02);
        C3156m.n(b02, i15, this.f25379b);
        C3156m.o(b02, i14, this.f25379b);
        int i21 = this.f25393p.i();
        this.f25398u = (Q() - this.f25385h) - this.f25394q.i();
        this.f25399v = i21;
        int w03 = w0(this.f25379b, i13);
        int i22 = w11.i();
        this.f25392o = i22;
        if (w03 == i21) {
            this.f25392o = i22 + (g10 ? 0 : i14 - i19);
            return;
        }
        int i23 = i15 - d11;
        int i24 = g10 ? 0 : i14 - i19;
        if (i23 != 0 || i24 != 0) {
            while (w03 != 0 && w03 != i21 && (i24 != 0 || i23 != 0)) {
                int b03 = b0(w03);
                if (i23 != 0) {
                    C3156m.n(b03, C3156m.d(this.f25379b, b03) + i23, this.f25379b);
                }
                if (i24 != 0) {
                    int[] iArr = this.f25379b;
                    C3156m.o(b03, C3156m.i(iArr, b03) + i24, iArr);
                }
                if (C3156m.g(this.f25379b, b03)) {
                    i24 = 0;
                }
                w03 = w0(this.f25379b, w03);
            }
        }
        this.f25392o += i24;
    }

    public final int M0(int i11) {
        return I0(this.f25379b, b0(i11));
    }

    public final void N() {
        int i11 = this.f25391n;
        if (!(i11 > 0)) {
            B0.b("Unbalanced begin/end insert");
            throw null;
        }
        int i12 = i11 - 1;
        this.f25391n = i12;
        if (i12 == 0) {
            if (this.f25395r.b() == this.f25393p.b()) {
                this.f25398u = (Q() - this.f25385h) - this.f25394q.i();
            } else {
                r.j("startGroup/endGroup mismatch while inserting");
                throw null;
            }
        }
    }

    public final void N0(int i11, Object obj, Object obj2) {
        Q0(i11, obj, obj2, false);
    }

    public final void O(int i11) {
        boolean z11 = false;
        if (!(this.f25391n <= 0)) {
            r.j("Cannot call ensureStarted() while inserting");
            throw null;
        }
        int i12 = this.f25399v;
        if (i12 != i11) {
            if (i11 >= i12 && i11 < this.f25398u) {
                z11 = true;
            }
            if (!z11) {
                r.j("Started group at " + i11 + " must be a subgroup of the group at " + i12);
                throw null;
            }
            int i13 = this.f25397t;
            int i14 = this.f25386i;
            int i15 = this.f25387j;
            this.f25397t = i11;
            O0();
            this.f25397t = i13;
            this.f25386i = i14;
            this.f25387j = i15;
        }
    }

    public final void O0() {
        if (this.f25391n == 0) {
            Q0(0, InterfaceC3967k.a.a(), InterfaceC3967k.a.a(), false);
        } else {
            r.j("Key must be supplied when inserting");
            throw null;
        }
    }

    public final void P0(int i11, Object obj) {
        Q0(i11, obj, InterfaceC3967k.a.a(), false);
    }

    public final boolean R() {
        return this.f25400w;
    }

    public final void R0(int i11, InterfaceC3967k.a.C0506a c0506a) {
        Q0(i11, c0506a, InterfaceC3967k.a.a(), true);
    }

    public final boolean S() {
        return this.f25383f != null;
    }

    public final void S0(int i11) {
        r.u(i11 > 0);
        int i12 = this.f25399v;
        int I02 = I0(this.f25379b, b0(i12));
        int J11 = J(this.f25379b, b0(i12 + 1)) - i11;
        r.u(J11 >= I02);
        B0(J11, i11, i12);
        int i13 = this.f25386i;
        if (i13 >= I02) {
            this.f25386i = i13 - i11;
        }
    }

    public final boolean T() {
        return this.f25382e != null;
    }

    public final C3945c T0(int i11) {
        if (i11 < 0 || i11 >= X()) {
            return null;
        }
        return C3156m.c(this.f25381d, i11, X());
    }

    public final int U() {
        return this.f25397t;
    }

    public final void U0(Object obj) {
        if (this.f25391n <= 0 || this.f25386i == this.f25388k) {
            x0(obj);
            return;
        }
        androidx.collection.C<androidx.collection.J<Object>> c11 = this.f25396s;
        if (c11 == null) {
            c11 = new androidx.collection.C<>();
        }
        this.f25396s = c11;
        int i11 = this.f25399v;
        androidx.collection.J<Object> c12 = c11.c(i11);
        if (c12 == null) {
            c12 = new androidx.collection.J<>((Object) null);
            c11.j(i11, c12);
        }
        c12.b(obj);
    }

    public final int V() {
        return this.f25398u;
    }

    public final void V0(Object obj) {
        int b02 = b0(this.f25397t);
        if (!C3156m.e(this.f25379b, b02)) {
            r.j("Updating the data of a group that was not created with a data slot");
            throw null;
        }
        Object[] objArr = this.f25380c;
        int[] iArr = this.f25379b;
        int J11 = J(iArr, b02);
        int i11 = 1;
        switch (iArr[(b02 * 5) + 1] >> 29) {
            case 0:
                i11 = 0;
                break;
            case 1:
            case 2:
            case 4:
                break;
            case 3:
            case 5:
            case 6:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        objArr[K(i11 + J11)] = obj;
    }

    public final int W() {
        return this.f25399v;
    }

    public final int X() {
        return Q() - this.f25385h;
    }

    public final void X0(@NotNull C3945c c3945c, Object obj) {
        c3945c.getClass();
        Y0(F(c3945c), obj);
    }

    public final int Y() {
        return this.f25380c.length - this.f25389l;
    }

    @NotNull
    public final C3947c1 Z() {
        return this.f25378a;
    }

    public final void Z0() {
        C3947c1 c3947c1 = this.f25378a;
        this.f25382e = c3947c1.t();
        this.f25383f = c3947c1.n();
    }

    public final Object a0(int i11) {
        int b02 = b0(i11);
        if (!C3156m.e(this.f25379b, b02)) {
            return InterfaceC3967k.a.a();
        }
        Object[] objArr = this.f25380c;
        int[] iArr = this.f25379b;
        int J11 = J(iArr, b02);
        int i12 = 1;
        switch (iArr[(b02 * 5) + 1] >> 29) {
            case 0:
                i12 = 0;
                break;
            case 1:
            case 2:
            case 4:
                break;
            case 3:
            case 5:
            case 6:
                i12 = 2;
                break;
            default:
                i12 = 3;
                break;
        }
        return objArr[i12 + J11];
    }

    public final int c0(int i11) {
        return this.f25379b[b0(i11) * 5];
    }

    public final Object d0(int i11) {
        int b02 = b0(i11);
        if (C3156m.f(this.f25379b, b02)) {
            return this.f25380c[C3156m.j(this.f25379b, b02)];
        }
        return null;
    }

    public final int e0(int i11) {
        return C3156m.d(this.f25379b, b0(i11));
    }

    public final boolean f0(int i11) {
        return g0(i11, this.f25397t);
    }

    public final boolean g0(int i11, int i12) {
        int Q11;
        int e02;
        if (i12 == this.f25399v) {
            Q11 = this.f25398u;
        } else {
            W w11 = this.f25393p;
            if (i12 > w11.h(0)) {
                e02 = e0(i12);
            } else {
                int c11 = w11.c(i12);
                if (c11 < 0) {
                    e02 = e0(i12);
                } else {
                    Q11 = (Q() - this.f25385h) - this.f25394q.f(c11);
                }
            }
            Q11 = e02 + i12;
        }
        return i11 > i12 && i11 < Q11;
    }

    public final boolean h0(int i11) {
        int i12 = this.f25399v;
        if (i11 <= i12 || i11 >= this.f25398u) {
            return i12 == 0 && i11 == 0;
        }
        return true;
    }

    public final boolean k0() {
        int i11 = this.f25397t;
        return i11 < this.f25398u && C3156m.g(this.f25379b, b0(i11));
    }

    public final boolean l0(int i11) {
        return C3156m.g(this.f25379b, b0(i11));
    }

    @NotNull
    public final void n0(@NotNull C3947c1 c3947c1, int i11) {
        r.u(this.f25391n > 0);
        if (i11 != 0 || this.f25397t != 0 || this.f25378a.q() != 0 || C3156m.d(c3947c1.o(), i11) != c3947c1.q()) {
            C3953e1 z11 = c3947c1.z();
            try {
                a.a(z11, i11, this);
                z11.I(true);
                return;
            } catch (Throwable th2) {
                z11.I(false);
                throw th2;
            }
        }
        int[] iArr = this.f25379b;
        Object[] objArr = this.f25380c;
        ArrayList<C3945c> arrayList = this.f25381d;
        HashMap<C3945c, V> hashMap = this.f25382e;
        androidx.collection.C<androidx.collection.D> c11 = this.f25383f;
        int[] o11 = c3947c1.o();
        int q11 = c3947c1.q();
        Object[] r11 = c3947c1.r();
        int s11 = c3947c1.s();
        HashMap<C3945c, V> t2 = c3947c1.t();
        androidx.collection.C<androidx.collection.D> n11 = c3947c1.n();
        this.f25379b = o11;
        this.f25380c = r11;
        this.f25381d = c3947c1.m();
        this.f25384g = q11;
        this.f25385h = (o11.length / 5) - q11;
        this.f25388k = s11;
        this.f25389l = r11.length - s11;
        this.f25390m = q11;
        this.f25382e = t2;
        this.f25383f = n11;
        c3947c1.B(iArr, 0, objArr, 0, arrayList, hashMap, c11);
    }

    public final void o0(int i11) {
        C3945c c3945c;
        int F11;
        Throwable th2 = null;
        if (!(this.f25391n == 0)) {
            r.j("Cannot move a group while inserting");
            throw null;
        }
        if (!(i11 >= 0)) {
            r.j("Parameter offset is out of bounds");
            throw null;
        }
        if (i11 == 0) {
            return;
        }
        int i12 = this.f25397t;
        int i13 = this.f25399v;
        int i14 = this.f25398u;
        int i15 = i12;
        for (int i16 = i11; i16 > 0; i16--) {
            i15 += C3156m.d(this.f25379b, b0(i15));
            if (i15 > i14) {
                r.j("Parameter offset is out of bounds");
                throw null;
            }
        }
        int d11 = C3156m.d(this.f25379b, b0(i15));
        int J11 = J(this.f25379b, b0(this.f25397t));
        int J12 = J(this.f25379b, b0(i15));
        int i17 = i15 + d11;
        int J13 = J(this.f25379b, b0(i17));
        int i18 = J13 - J12;
        j0(i18, Math.max(this.f25397t - 1, 0));
        i0(d11);
        int[] iArr = this.f25379b;
        int b02 = b0(i17) * 5;
        C7705l.p(b0(i12) * 5, b02, iArr, iArr, (d11 * 5) + b02);
        if (i18 > 0) {
            Object[] objArr = this.f25380c;
            C7705l.r(objArr, J11, objArr, K(J12 + i18), K(J13 + i18));
        }
        int i19 = J12 + i18;
        int i21 = i19 - J11;
        int i22 = this.f25388k;
        int i23 = this.f25389l;
        int length = this.f25380c.length;
        int i24 = this.f25390m;
        int i25 = i12 + d11;
        int i26 = i12;
        while (i26 < i25) {
            Throwable th3 = th2;
            int b03 = b0(i26);
            int i27 = i25;
            int i28 = i26;
            iArr[(b03 * 5) + 4] = L(L(J(iArr, b03) - i21, i24 < b03 ? 0 : i22, i23, length), this.f25388k, this.f25389l, this.f25380c.length);
            i26 = i28 + 1;
            i25 = i27;
            th2 = th3;
            i21 = i21;
        }
        Throwable th4 = th2;
        int i29 = i17 + d11;
        int X9 = X();
        int h11 = C3156m.h(this.f25381d, i17, X9);
        ArrayList arrayList = new ArrayList();
        if (h11 >= 0) {
            while (h11 < this.f25381d.size() && (F11 = F((c3945c = this.f25381d.get(h11)))) >= i17 && F11 < i29) {
                arrayList.add(c3945c);
                this.f25381d.remove(h11);
            }
        }
        int i31 = i12 - i17;
        int size = arrayList.size();
        for (int i32 = 0; i32 < size; i32++) {
            C3945c c3945c2 = (C3945c) arrayList.get(i32);
            int F12 = F(c3945c2) + i31;
            if (F12 >= this.f25384g) {
                c3945c2.c(-(X9 - F12));
            } else {
                c3945c2.c(F12);
            }
            this.f25381d.add(C3156m.h(this.f25381d, F12, X9), c3945c2);
        }
        if (A0(i17, d11)) {
            r.j("Unexpectedly removed anchors");
            throw th4;
        }
        P(i13, this.f25398u, i12);
        if (i18 > 0) {
            B0(i19, i18, i17 - 1);
        }
    }

    @NotNull
    public final List q0(@NotNull C3947c1 c3947c1) {
        r.u(this.f25391n <= 0 && e0(this.f25397t + 1) == 1);
        int i11 = this.f25397t;
        int i12 = this.f25386i;
        int i13 = this.f25387j;
        D(1);
        O0();
        H();
        C3953e1 z11 = c3947c1.z();
        try {
            List c11 = a.c(z11, 2, this, true);
            z11.I(true);
            N();
            M();
            this.f25397t = i11;
            this.f25386i = i12;
            this.f25387j = i13;
            return c11;
        } catch (Throwable th2) {
            z11.I(false);
            throw th2;
        }
    }

    @NotNull
    public final List s0(@NotNull C3945c c3945c, @NotNull C3953e1 c3953e1) {
        r.u(c3953e1.f25391n > 0);
        r.u(this.f25391n == 0);
        r.u(c3945c.b());
        int F11 = F(c3945c) + 1;
        int i11 = this.f25397t;
        r.u(i11 <= F11 && F11 < this.f25398u);
        int w02 = w0(this.f25379b, F11);
        int e02 = e0(F11);
        int u02 = l0(F11) ? 1 : u0(F11);
        List c11 = a.c(this, F11, c3953e1, false);
        W0(w02);
        boolean z11 = u02 > 0;
        while (w02 >= i11) {
            int b02 = b0(w02);
            int[] iArr = this.f25379b;
            C3156m.n(b02, C3156m.d(iArr, b02) - e02, iArr);
            if (z11) {
                if (C3156m.g(this.f25379b, b02)) {
                    z11 = false;
                } else {
                    int[] iArr2 = this.f25379b;
                    C3156m.o(b02, C3156m.i(iArr2, b02) - u02, iArr2);
                }
            }
            w02 = w0(this.f25379b, w02);
        }
        if (z11) {
            r.u(this.f25392o >= u02);
            this.f25392o -= u02;
        }
        return c11;
    }

    public final Object t0(int i11) {
        int b02 = b0(i11);
        if (C3156m.g(this.f25379b, b02)) {
            return this.f25380c[K(J(this.f25379b, b02))];
        }
        return null;
    }

    @NotNull
    public final String toString() {
        return "SlotWriter(current = " + this.f25397t + " end=" + this.f25398u + " size = " + X() + " gap=" + this.f25384g + '-' + (this.f25384g + this.f25385h) + ')';
    }

    public final int u0(int i11) {
        return C3156m.i(this.f25379b, b0(i11));
    }

    public final int v0(int i11) {
        return w0(this.f25379b, i11);
    }

    public final boolean z0() {
        C3945c T02;
        C3945c T03;
        V v11 = null;
        if (this.f25391n != 0) {
            r.j("Cannot remove group while inserting");
            throw null;
        }
        int i11 = this.f25397t;
        int i12 = this.f25386i;
        int J11 = J(this.f25379b, b0(i11));
        int F02 = F0();
        int i13 = this.f25399v;
        HashMap<C3945c, V> hashMap = this.f25382e;
        if (hashMap != null && (T03 = T0(i13)) != null) {
            v11 = hashMap.get(T03);
        }
        if (v11 != null && (T02 = T0(i11)) != null) {
            v11.e(T02);
        }
        D0 d02 = this.f25401x;
        if (d02 != null) {
            while (d02.b() && d02.c() >= i11) {
                d02.d();
            }
        }
        boolean A02 = A0(i11, this.f25397t - i11);
        B0(J11, this.f25386i - J11, i11 - 1);
        this.f25397t = i11;
        this.f25386i = i12;
        this.f25392o -= F02;
        return A02;
    }
}
