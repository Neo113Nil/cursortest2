package P;

import K0.C0196a;
import Q.C0336a;
import a0.C0446b;
import android.os.Trace;
import e2.C1930k;
import i4.InterfaceC2015a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import r.C2315A;
import r.C2321G;
import r.C2322H;
import r.C2343v;
import t3.AbstractC2425d;

/* renamed from: P.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0327y implements InterfaceC0319u {

    /* renamed from: A, reason: collision with root package name */
    public int f4581A;

    /* renamed from: B, reason: collision with root package name */
    public final C1930k f4582B;

    /* renamed from: C, reason: collision with root package name */
    public final Q2.C0 f4583C;

    /* renamed from: D, reason: collision with root package name */
    public final C0315s f4584D;

    /* renamed from: E, reason: collision with root package name */
    public int f4585E;

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC0321v f4586k;

    /* renamed from: l, reason: collision with root package name */
    public final v3.e f4587l;

    /* renamed from: m, reason: collision with root package name */
    public final AtomicReference f4588m = new AtomicReference(null);

    /* renamed from: n, reason: collision with root package name */
    public final Object f4589n = new Object();

    /* renamed from: o, reason: collision with root package name */
    public final r.J f4590o;

    /* renamed from: p, reason: collision with root package name */
    public final M0 f4591p;

    /* renamed from: q, reason: collision with root package name */
    public final C2321G f4592q;

    /* renamed from: r, reason: collision with root package name */
    public final C2322H f4593r;

    /* renamed from: s, reason: collision with root package name */
    public final C2322H f4594s;

    /* renamed from: t, reason: collision with root package name */
    public final C2321G f4595t;

    /* renamed from: u, reason: collision with root package name */
    public final C0336a f4596u;

    /* renamed from: v, reason: collision with root package name */
    public final C0336a f4597v;

    /* renamed from: w, reason: collision with root package name */
    public final C2321G f4598w;

    /* renamed from: x, reason: collision with root package name */
    public C2321G f4599x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f4600y;

    /* renamed from: z, reason: collision with root package name */
    public C0327y f4601z;

    public C0327y(AbstractC0321v abstractC0321v, v3.e eVar) {
        this.f4586k = abstractC0321v;
        this.f4587l = eVar;
        r.J j5 = new r.J(new C2322H());
        this.f4590o = j5;
        M0 m02 = new M0();
        if (abstractC0321v.c()) {
            m02.f4353u = new C2343v();
        }
        if (abstractC0321v.e()) {
            m02.d();
        }
        this.f4591p = m02;
        this.f4592q = AbstractC2425d.o();
        this.f4593r = new C2322H();
        this.f4594s = new C2322H();
        this.f4595t = AbstractC2425d.o();
        C0336a c0336a = new C0336a();
        this.f4596u = c0336a;
        C0336a c0336a2 = new C0336a();
        this.f4597v = c0336a2;
        this.f4598w = AbstractC2425d.o();
        this.f4599x = AbstractC2425d.o();
        C1930k c1930k = new C1930k(12, abstractC0321v);
        this.f4582B = c1930k;
        this.f4583C = new Q2.C0();
        C0315s c0315s = new C0315s(eVar, abstractC0321v, m02, j5, c0336a, c0336a2, c1930k, this);
        abstractC0321v.m(c0315s);
        this.f4584D = c0315s;
        boolean z3 = abstractC0321v instanceof F0;
        int i = AbstractC0296i.f4475a;
    }

    public final void A(i4.e eVar) {
        boolean i = i();
        p();
        AbstractC0321v abstractC0321v = this.f4586k;
        if (!i) {
            abstractC0321v.a(this, eVar);
            return;
        }
        C0315s c0315s = this.f4584D;
        c0315s.f4556z = 100;
        c0315s.f4555y = true;
        abstractC0321v.a(this, eVar);
        c0315s.u();
    }

    public final void a() {
        this.f4588m.set(null);
        this.f4596u.f.s0();
        this.f4597v.f.s0();
        r.J j5 = this.f4590o;
        if (j5.f18950k.g()) {
            return;
        }
        Q2.C0 c02 = this.f4583C;
        try {
            c02.e(j5, this.f4584D.A());
            c02.b();
        } finally {
            c02.a();
        }
    }

    public final void b(Object obj, boolean z3) {
        int i;
        Object g5 = this.f4592q.g(obj);
        if (g5 == null) {
            return;
        }
        boolean z5 = g5 instanceof C2322H;
        T t5 = T.f4396k;
        C2322H c2322h = this.f4593r;
        C2322H c2322h2 = this.f4594s;
        C2321G c2321g = this.f4598w;
        if (!z5) {
            C0326x0 c0326x0 = (C0326x0) g5;
            if (AbstractC2425d.E(c2321g, obj, c0326x0) || c0326x0.c(obj) == t5) {
                return;
            }
            if (c0326x0.f4580g == null || z3) {
                c2322h.a(c0326x0);
                return;
            } else {
                c2322h2.a(c0326x0);
                return;
            }
        }
        C2322H c2322h3 = (C2322H) g5;
        Object[] objArr = c2322h3.f18934b;
        long[] jArr = c2322h3.f18933a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            long j5 = jArr[i5];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = 8;
                int i7 = 8 - ((~(i5 - length)) >>> 31);
                int i8 = 0;
                while (i8 < i7) {
                    if ((j5 & 255) < 128) {
                        C0326x0 c0326x02 = (C0326x0) objArr[(i5 << 3) + i8];
                        if (!AbstractC2425d.E(c2321g, obj, c0326x02)) {
                            i = i6;
                            if (c0326x02.c(obj) != t5) {
                                if (c0326x02.f4580g == null || z3) {
                                    c2322h.a(c0326x02);
                                } else {
                                    c2322h2.a(c0326x02);
                                }
                            }
                            j5 >>= i;
                            i8++;
                            i6 = i;
                        }
                    }
                    i = i6;
                    j5 >>= i;
                    i8++;
                    i6 = i;
                }
                if (i7 != i6) {
                    return;
                }
            }
            if (i5 == length) {
                return;
            } else {
                i5++;
            }
        }
    }

    public final void c(Set set, boolean z3) {
        long j5;
        long j6;
        long j7;
        char c5;
        int i;
        long[] jArr;
        String str;
        long[] jArr2;
        String str2;
        long j8;
        boolean c6;
        String str3;
        long j9;
        long[] jArr3;
        long[] jArr4;
        int i5;
        long j10;
        boolean z5;
        int i6;
        long j11;
        long[] jArr5;
        long[] jArr6;
        char c7;
        long j12;
        int i7;
        int i8;
        long[] jArr7;
        boolean z6 = set instanceof R.h;
        C2321G c2321g = this.f4595t;
        Object obj = null;
        int i9 = 8;
        if (z6) {
            C2322H c2322h = ((R.h) set).f5119k;
            Object[] objArr = c2322h.f18934b;
            long[] jArr8 = c2322h.f18933a;
            int length = jArr8.length - 2;
            if (length >= 0) {
                int i10 = 0;
                j5 = 128;
                j6 = 255;
                while (true) {
                    long j13 = jArr8[i10];
                    char c8 = 7;
                    j7 = -9187201950435737472L;
                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        int i12 = 0;
                        while (i12 < i11) {
                            if ((j13 & 255) < 128) {
                                Object obj2 = objArr[(i10 << 3) + i12];
                                c7 = c8;
                                if (obj2 instanceof C0326x0) {
                                    ((C0326x0) obj2).c(obj);
                                } else {
                                    b(obj2, z3);
                                    Object g5 = c2321g.g(obj2);
                                    if (g5 != null) {
                                        if (g5 instanceof C2322H) {
                                            C2322H c2322h2 = (C2322H) g5;
                                            Object[] objArr2 = c2322h2.f18934b;
                                            long[] jArr9 = c2322h2.f18933a;
                                            int length2 = jArr9.length - 2;
                                            if (length2 >= 0) {
                                                int i13 = i9;
                                                i7 = length;
                                                int i14 = 0;
                                                while (true) {
                                                    long j14 = jArr9[i14];
                                                    j12 = j13;
                                                    long[] jArr10 = jArr9;
                                                    if ((((~j14) << c7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i15 = 8 - ((~(i14 - length2)) >>> 31);
                                                        int i16 = 0;
                                                        while (i16 < i15) {
                                                            if ((j14 & 255) < 128) {
                                                                jArr7 = jArr8;
                                                                b((H) objArr2[(i14 << 3) + i16], z3);
                                                            } else {
                                                                jArr7 = jArr8;
                                                            }
                                                            j14 >>= i13;
                                                            i16++;
                                                            jArr8 = jArr7;
                                                        }
                                                        jArr6 = jArr8;
                                                        if (i15 != i13) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr6 = jArr8;
                                                    }
                                                    if (i14 == length2) {
                                                        break;
                                                    }
                                                    i14++;
                                                    jArr9 = jArr10;
                                                    j13 = j12;
                                                    jArr8 = jArr6;
                                                    i13 = 8;
                                                }
                                            }
                                        } else {
                                            jArr6 = jArr8;
                                            j12 = j13;
                                            i7 = length;
                                            b((H) g5, z3);
                                        }
                                        i8 = 8;
                                    }
                                }
                                jArr6 = jArr8;
                                j12 = j13;
                                i7 = length;
                                i8 = 8;
                            } else {
                                jArr6 = jArr8;
                                c7 = c8;
                                j12 = j13;
                                i7 = length;
                                i8 = i9;
                            }
                            j13 = j12 >> i8;
                            i12++;
                            length = i7;
                            i9 = i8;
                            c8 = c7;
                            jArr8 = jArr6;
                            obj = null;
                        }
                        jArr5 = jArr8;
                        c5 = c8;
                        int i17 = length;
                        if (i11 != i9) {
                            break;
                        } else {
                            length = i17;
                        }
                    } else {
                        jArr5 = jArr8;
                        c5 = 7;
                    }
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                    jArr8 = jArr5;
                    obj = null;
                    i9 = 8;
                }
            } else {
                j5 = 128;
                j6 = 255;
                j7 = -9187201950435737472L;
                c5 = 7;
            }
        } else {
            j5 = 128;
            j6 = 255;
            j7 = -9187201950435737472L;
            c5 = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof C0326x0) {
                    ((C0326x0) obj3).c(null);
                } else {
                    b(obj3, z3);
                    Object g6 = c2321g.g(obj3);
                    if (g6 != null) {
                        if (g6 instanceof C2322H) {
                            C2322H c2322h3 = (C2322H) g6;
                            Object[] objArr3 = c2322h3.f18934b;
                            long[] jArr11 = c2322h3.f18933a;
                            int length3 = jArr11.length - 2;
                            if (length3 >= 0) {
                                while (true) {
                                    long j15 = jArr11[i];
                                    if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i18 = 8 - ((~(i - length3)) >>> 31);
                                        for (int i19 = 0; i19 < i18; i19++) {
                                            if ((j15 & 255) < 128) {
                                                b((H) objArr3[(i << 3) + i19], z3);
                                            }
                                            j15 >>= 8;
                                        }
                                        if (i18 != 8) {
                                            break;
                                        }
                                    }
                                    i = i != length3 ? i + 1 : 0;
                                }
                            }
                        } else {
                            b((H) g6, z3);
                        }
                    }
                }
            }
        }
        String str4 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>";
        C2321G c2321g2 = this.f4592q;
        C2322H c2322h4 = this.f4593r;
        if (z3) {
            C2322H c2322h5 = this.f4594s;
            if (c2322h5.h()) {
                long[] jArr12 = c2321g2.f18928a;
                int length4 = jArr12.length - 2;
                if (length4 >= 0) {
                    int i20 = 0;
                    while (true) {
                        long j16 = jArr12[i20];
                        if ((((~j16) << c5) & j16 & j7) != j7) {
                            int i21 = 8 - ((~(i20 - length4)) >>> 31);
                            int i22 = 0;
                            while (i22 < i21) {
                                if ((j16 & j6) < j5) {
                                    int i23 = (i20 << 3) + i22;
                                    Object obj4 = c2321g2.f18929b[i23];
                                    Object obj5 = c2321g2.f18930c[i23];
                                    if (obj5 instanceof C2322H) {
                                        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>", obj5);
                                        C2322H c2322h6 = (C2322H) obj5;
                                        Object[] objArr4 = c2322h6.f18934b;
                                        long[] jArr13 = c2322h6.f18933a;
                                        int length5 = jArr13.length - 2;
                                        if (length5 >= 0) {
                                            j10 = j16;
                                            int i24 = 0;
                                            while (true) {
                                                long j17 = jArr13[i24];
                                                jArr4 = jArr12;
                                                i5 = length4;
                                                if ((((~j17) << c5) & j17 & j7) != j7) {
                                                    int i25 = 8 - ((~(i24 - length5)) >>> 31);
                                                    for (int i26 = 0; i26 < i25; i26 = i6 + 1) {
                                                        if ((j17 & j6) < j5) {
                                                            i6 = i26;
                                                            int i27 = (i24 << 3) + i6;
                                                            j11 = j17;
                                                            C0326x0 c0326x0 = (C0326x0) objArr4[i27];
                                                            if (c2322h5.c(c0326x0) || c2322h4.c(c0326x0)) {
                                                                c2322h6.l(i27);
                                                            }
                                                        } else {
                                                            i6 = i26;
                                                            j11 = j17;
                                                        }
                                                        j17 = j11 >> 8;
                                                    }
                                                    if (i25 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i24 == length5) {
                                                    break;
                                                }
                                                i24++;
                                                length4 = i5;
                                                jArr12 = jArr4;
                                            }
                                        } else {
                                            jArr4 = jArr12;
                                            i5 = length4;
                                            j10 = j16;
                                        }
                                        z5 = c2322h6.g();
                                    } else {
                                        jArr4 = jArr12;
                                        i5 = length4;
                                        j10 = j16;
                                        kotlin.jvm.internal.l.d("null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap", obj5);
                                        C0326x0 c0326x02 = (C0326x0) obj5;
                                        z5 = c2322h5.c(c0326x02) || c2322h4.c(c0326x02);
                                    }
                                    if (z5) {
                                        c2321g2.l(i23);
                                    }
                                } else {
                                    jArr4 = jArr12;
                                    i5 = length4;
                                    j10 = j16;
                                }
                                j16 = j10 >> 8;
                                i22++;
                                length4 = i5;
                                jArr12 = jArr4;
                            }
                            jArr3 = jArr12;
                            int i28 = length4;
                            if (i21 != 8) {
                                break;
                            } else {
                                length4 = i28;
                            }
                        } else {
                            jArr3 = jArr12;
                        }
                        if (i20 == length4) {
                            break;
                        }
                        i20++;
                        jArr12 = jArr3;
                    }
                }
                c2322h5.b();
                h();
                return;
            }
        }
        if (c2322h4.h()) {
            long[] jArr14 = c2321g2.f18928a;
            int length6 = jArr14.length - 2;
            if (length6 >= 0) {
                int i29 = 0;
                while (true) {
                    long j18 = jArr14[i29];
                    if ((((~j18) << c5) & j18 & j7) != j7) {
                        int i30 = 8 - ((~(i29 - length6)) >>> 31);
                        int i31 = 0;
                        while (i31 < i30) {
                            if ((j18 & j6) < j5) {
                                int i32 = (i29 << 3) + i31;
                                Object obj6 = c2321g2.f18929b[i32];
                                Object obj7 = c2321g2.f18930c[i32];
                                if (obj7 instanceof C2322H) {
                                    kotlin.jvm.internal.l.d(str4, obj7);
                                    C2322H c2322h7 = (C2322H) obj7;
                                    Object[] objArr5 = c2322h7.f18934b;
                                    long[] jArr15 = c2322h7.f18933a;
                                    int length7 = jArr15.length - 2;
                                    jArr2 = jArr14;
                                    if (length7 >= 0) {
                                        j8 = j18;
                                        int i33 = 0;
                                        while (true) {
                                            long j19 = jArr15[i33];
                                            Object[] objArr6 = objArr5;
                                            long[] jArr16 = jArr15;
                                            if ((((~j19) << c5) & j19 & j7) != j7) {
                                                int i34 = 8 - ((~(i33 - length7)) >>> 31);
                                                int i35 = 0;
                                                while (i35 < i34) {
                                                    if ((j19 & j6) < j5) {
                                                        str3 = str4;
                                                        int i36 = (i33 << 3) + i35;
                                                        j9 = j19;
                                                        if (c2322h4.c((C0326x0) objArr6[i36])) {
                                                            c2322h7.l(i36);
                                                        }
                                                    } else {
                                                        str3 = str4;
                                                        j9 = j19;
                                                    }
                                                    i35++;
                                                    str4 = str3;
                                                    j19 = j9 >> 8;
                                                }
                                                str2 = str4;
                                                if (i34 != 8) {
                                                    break;
                                                }
                                            } else {
                                                str2 = str4;
                                            }
                                            if (i33 == length7) {
                                                break;
                                            }
                                            i33++;
                                            objArr5 = objArr6;
                                            jArr15 = jArr16;
                                            str4 = str2;
                                        }
                                    } else {
                                        str2 = str4;
                                        j8 = j18;
                                    }
                                    c6 = c2322h7.g();
                                } else {
                                    jArr2 = jArr14;
                                    str2 = str4;
                                    j8 = j18;
                                    kotlin.jvm.internal.l.d("null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap", obj7);
                                    c6 = c2322h4.c((C0326x0) obj7);
                                }
                                if (c6) {
                                    c2321g2.l(i32);
                                }
                            } else {
                                jArr2 = jArr14;
                                str2 = str4;
                                j8 = j18;
                            }
                            i31++;
                            j18 = j8 >> 8;
                            jArr14 = jArr2;
                            str4 = str2;
                        }
                        jArr = jArr14;
                        str = str4;
                        if (i30 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr14;
                        str = str4;
                    }
                    if (i29 == length6) {
                        break;
                    }
                    i29++;
                    jArr14 = jArr;
                    str4 = str;
                }
            }
            h();
            c2322h4.b();
        }
    }

    public final void d() {
        synchronized (this.f4589n) {
            try {
                e(this.f4596u);
                n();
            } catch (Throwable th) {
                try {
                    if (!this.f4590o.f18950k.g()) {
                        Q2.C0 c02 = this.f4583C;
                        try {
                            c02.e(this.f4590o, this.f4584D.A());
                            c02.b();
                            c02.a();
                        } catch (Throwable th2) {
                            c02.a();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    a();
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x01da A[Catch: all -> 0x01de, TRY_LEAVE, TryCatch #9 {all -> 0x01de, blocks: (B:130:0x01d2, B:132:0x01da), top: B:129:0x01d2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(C0336a c0336a) {
        Q2.C0 c02;
        long[] jArr;
        int i;
        long[] jArr2;
        Q2.C0 c03;
        long j5;
        char c5;
        long j6;
        int i5;
        boolean z3;
        C0336a c0336a2 = this.f4597v;
        C0315s c0315s = this.f4584D;
        C0446b A3 = c0315s.A();
        Q2.C0 c04 = this.f4583C;
        c04.e(this.f4590o, A3);
        try {
            if (c0336a.f.u0()) {
                try {
                    if (c0336a2.f.u0()) {
                        c04.b();
                    }
                    return;
                } finally {
                }
            }
            try {
                Trace.beginSection("Compose:applyChanges");
                try {
                    v3.e eVar = this.f4587l;
                    P0 f = this.f4591p.f();
                    int i6 = 0;
                    try {
                        c0336a.s0(eVar, f, c04, c0315s.A());
                        f.e(true);
                        eVar.i();
                        Trace.endSection();
                        c04.c();
                        R.e eVar2 = (R.e) c04.f4907g;
                        if (eVar2.f5108m != 0) {
                            Trace.beginSection("Compose:sideeffects");
                            try {
                                Object[] objArr = eVar2.f5106k;
                                int i7 = eVar2.f5108m;
                                for (int i8 = 0; i8 < i7; i8++) {
                                    ((InterfaceC2015a) objArr[i8]).invoke();
                                }
                                eVar2.h();
                                Trace.endSection();
                            } finally {
                                Trace.endSection();
                            }
                        }
                        if (this.f4600y) {
                            Trace.beginSection("Compose:unobserve");
                            try {
                                this.f4600y = false;
                                C2321G c2321g = this.f4592q;
                                long[] jArr3 = c2321g.f18928a;
                                int length = jArr3.length - 2;
                                if (length >= 0) {
                                    int i9 = 0;
                                    while (true) {
                                        long j7 = jArr3[i9];
                                        char c6 = 7;
                                        long j8 = -9187201950435737472L;
                                        if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i10 = 8;
                                            int i11 = 8 - ((~(i9 - length)) >>> 31);
                                            int i12 = i6;
                                            while (i12 < i11) {
                                                if ((j7 & 255) < 128) {
                                                    c5 = c6;
                                                    int i13 = (i9 << 3) + i12;
                                                    j6 = j8;
                                                    Object obj = c2321g.f18929b[i13];
                                                    Object obj2 = c2321g.f18930c[i13];
                                                    if (obj2 instanceof C2322H) {
                                                        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>", obj2);
                                                        C2322H c2322h = (C2322H) obj2;
                                                        Object[] objArr2 = c2322h.f18934b;
                                                        long[] jArr4 = c2322h.f18933a;
                                                        int i14 = i10;
                                                        int length2 = jArr4.length - 2;
                                                        i = i12;
                                                        jArr2 = jArr3;
                                                        c03 = c04;
                                                        if (length2 >= 0) {
                                                            int i15 = 0;
                                                            while (true) {
                                                                try {
                                                                    long j9 = jArr4[i15];
                                                                    j5 = j7;
                                                                    if ((((~j9) << c5) & j9 & j6) != j6) {
                                                                        int i16 = 8 - ((~(i15 - length2)) >>> 31);
                                                                        for (int i17 = 0; i17 < i16; i17++) {
                                                                            if ((j9 & 255) < 128) {
                                                                                int i18 = (i15 << 3) + i17;
                                                                                if (!((C0326x0) objArr2[i18]).b()) {
                                                                                    c2322h.l(i18);
                                                                                }
                                                                            }
                                                                            j9 >>= i14;
                                                                        }
                                                                        if (i16 != i14) {
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (i15 == length2) {
                                                                        break;
                                                                    }
                                                                    i15++;
                                                                    i14 = 8;
                                                                    j7 = j5;
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    throw th;
                                                                }
                                                            }
                                                        } else {
                                                            j5 = j7;
                                                        }
                                                        z3 = c2322h.g();
                                                    } else {
                                                        i = i12;
                                                        jArr2 = jArr3;
                                                        c03 = c04;
                                                        j5 = j7;
                                                        kotlin.jvm.internal.l.d("null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap", obj2);
                                                        z3 = !((C0326x0) obj2).b();
                                                    }
                                                    if (z3) {
                                                        c2321g.l(i13);
                                                    }
                                                    i5 = 8;
                                                } else {
                                                    i = i12;
                                                    jArr2 = jArr3;
                                                    c03 = c04;
                                                    j5 = j7;
                                                    c5 = c6;
                                                    j6 = j8;
                                                    i5 = i10;
                                                }
                                                j7 = j5 >> i5;
                                                i12 = i + 1;
                                                i10 = i5;
                                                c6 = c5;
                                                j8 = j6;
                                                c04 = c03;
                                                jArr3 = jArr2;
                                            }
                                            jArr = jArr3;
                                            c02 = c04;
                                            if (i11 != i10) {
                                                break;
                                            }
                                        } else {
                                            jArr = jArr3;
                                            c02 = c04;
                                        }
                                        if (i9 == length) {
                                            break;
                                        }
                                        i9++;
                                        c04 = c02;
                                        jArr3 = jArr;
                                        i6 = 0;
                                    }
                                } else {
                                    c02 = c04;
                                }
                                h();
                                Trace.endSection();
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else {
                            c02 = c04;
                        }
                        try {
                            if (c0336a2.f.u0()) {
                                c02.b();
                            }
                        } finally {
                            c02.a();
                        }
                    } catch (Throwable th3) {
                        try {
                            f.e(false);
                            throw th3;
                        } catch (Throwable th4) {
                            th = th4;
                            Trace.endSection();
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
                try {
                    if (c0336a2.f.u0()) {
                        c04.b();
                    }
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th7) {
            th = th7;
            if (c0336a2.f.u0()) {
            }
            throw th;
        }
    }

    public final void f() {
        synchronized (this.f4589n) {
            try {
                if (this.f4597v.f.v0()) {
                    e(this.f4597v);
                }
            } catch (Throwable th) {
                try {
                    if (!this.f4590o.f18950k.g()) {
                        Q2.C0 c02 = this.f4583C;
                        try {
                            c02.e(this.f4590o, this.f4584D.A());
                            c02.b();
                            c02.a();
                        } catch (Throwable th2) {
                            c02.a();
                            throw th2;
                        }
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    public final void g() {
        Q2.C0 c02;
        synchronized (this.f4589n) {
            try {
                this.f4584D.f4552v = null;
                if (!this.f4590o.f18950k.g()) {
                    c02 = this.f4583C;
                    try {
                        c02.e(this.f4590o, this.f4584D.A());
                        c02.b();
                        c02.a();
                    } finally {
                    }
                }
            } catch (Throwable th) {
                try {
                    if (!this.f4590o.f18950k.g()) {
                        c02 = this.f4583C;
                        try {
                            c02.e(this.f4590o, this.f4584D.A());
                            c02.b();
                            c02.a();
                        } finally {
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    a();
                    throw th2;
                }
            }
        }
    }

    public final void h() {
        char c5;
        long j5;
        long j6;
        long j7;
        long[] jArr;
        long[] jArr2;
        int i;
        long j8;
        char c6;
        long j9;
        long j10;
        int i5;
        boolean z3;
        int i6;
        long j11;
        C2321G c2321g = this.f4595t;
        long[] jArr3 = c2321g.f18928a;
        int length = jArr3.length - 2;
        char c7 = 7;
        long j12 = -9187201950435737472L;
        int i7 = 8;
        if (length >= 0) {
            int i8 = 0;
            long j13 = 128;
            while (true) {
                long j14 = jArr3[i8];
                j6 = 255;
                if ((((~j14) << c7) & j14 & j12) != j12) {
                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                    int i10 = 0;
                    while (i10 < i9) {
                        if ((j14 & 255) < j13) {
                            c6 = c7;
                            int i11 = (i8 << 3) + i10;
                            j9 = j12;
                            Object obj = c2321g.f18929b[i11];
                            Object obj2 = c2321g.f18930c[i11];
                            boolean z5 = obj2 instanceof C2322H;
                            C2321G c2321g2 = this.f4592q;
                            if (z5) {
                                kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>", obj2);
                                C2322H c2322h = (C2322H) obj2;
                                Object[] objArr = c2322h.f18934b;
                                long[] jArr4 = c2322h.f18933a;
                                j10 = j13;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j8 = j14;
                                    int i12 = i7;
                                    int i13 = 0;
                                    while (true) {
                                        long j15 = jArr4[i13];
                                        jArr2 = jArr3;
                                        i = length;
                                        if ((((~j15) << c6) & j15 & j9) != j9) {
                                            int i14 = 8 - ((~(i13 - length2)) >>> 31);
                                            int i15 = 0;
                                            while (i15 < i14) {
                                                if ((j15 & 255) < j10) {
                                                    i6 = i15;
                                                    int i16 = (i13 << 3) + i6;
                                                    j11 = j15;
                                                    if (!c2321g2.c((H) objArr[i16])) {
                                                        c2322h.l(i16);
                                                    }
                                                } else {
                                                    i6 = i15;
                                                    j11 = j15;
                                                }
                                                j15 = j11 >> i12;
                                                i15 = i6 + 1;
                                            }
                                            if (i14 != i12) {
                                                break;
                                            }
                                        }
                                        if (i13 == length2) {
                                            break;
                                        }
                                        i13++;
                                        jArr3 = jArr2;
                                        length = i;
                                        i12 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i = length;
                                    j8 = j14;
                                }
                                z3 = c2322h.g();
                            } else {
                                jArr2 = jArr3;
                                i = length;
                                j8 = j14;
                                j10 = j13;
                                kotlin.jvm.internal.l.d("null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap", obj2);
                                z3 = !c2321g2.c((H) obj2);
                            }
                            if (z3) {
                                c2321g.l(i11);
                            }
                            i5 = 8;
                        } else {
                            jArr2 = jArr3;
                            i = length;
                            j8 = j14;
                            c6 = c7;
                            j9 = j12;
                            j10 = j13;
                            i5 = i7;
                        }
                        j14 = j8 >> i5;
                        i10++;
                        i7 = i5;
                        c7 = c6;
                        j12 = j9;
                        j13 = j10;
                        jArr3 = jArr2;
                        length = i;
                    }
                    jArr = jArr3;
                    int i17 = length;
                    c5 = c7;
                    j5 = j12;
                    j7 = j13;
                    if (i9 != i7) {
                        break;
                    } else {
                        length = i17;
                    }
                } else {
                    jArr = jArr3;
                    c5 = c7;
                    j5 = j12;
                    j7 = j13;
                }
                if (i8 == length) {
                    break;
                }
                i8++;
                c7 = c5;
                j12 = j5;
                j13 = j7;
                jArr3 = jArr;
                i7 = 8;
            }
        } else {
            c5 = 7;
            j5 = -9187201950435737472L;
            j6 = 255;
            j7 = 128;
        }
        C2322H c2322h2 = this.f4594s;
        if (!c2322h2.h()) {
            return;
        }
        Object[] objArr2 = c2322h2.f18934b;
        long[] jArr5 = c2322h2.f18933a;
        int length3 = jArr5.length - 2;
        if (length3 < 0) {
            return;
        }
        int i18 = 0;
        while (true) {
            long j16 = jArr5[i18];
            if ((((~j16) << c5) & j16 & j5) != j5) {
                int i19 = 8 - ((~(i18 - length3)) >>> 31);
                for (int i20 = 0; i20 < i19; i20++) {
                    if ((j16 & j6) < j7) {
                        int i21 = (i18 << 3) + i20;
                        if (!(((C0326x0) objArr2[i21]).f4580g != null)) {
                            c2322h2.l(i21);
                        }
                    }
                    j16 >>= 8;
                }
                if (i19 != 8) {
                    return;
                }
            }
            if (i18 == length3) {
                return;
            } else {
                i18++;
            }
        }
    }

    public final boolean i() {
        boolean z3;
        synchronized (this.f4589n) {
            z3 = true;
            if (this.f4585E != 1) {
                z3 = false;
            }
            if (z3) {
                this.f4585E = 0;
            }
        }
        return z3;
    }

    public final void j(i4.e eVar) {
        try {
            synchronized (this.f4589n) {
                m();
                C2321G c2321g = this.f4599x;
                this.f4599x = AbstractC2425d.o();
                try {
                    C0315s c0315s = this.f4584D;
                    if (!c0315s.f4537e.f.u0()) {
                        AbstractC0317t.c("Expected applyChanges() to have been called");
                    }
                    c0315s.f4527P = null;
                    try {
                        c0315s.o(c2321g, eVar);
                    } finally {
                        c0315s.f4527P = null;
                    }
                } catch (Throwable th) {
                    this.f4599x = c2321g;
                    throw th;
                }
            }
        } catch (Throwable th2) {
            try {
                if (!this.f4590o.f18950k.g()) {
                    Q2.C0 c02 = this.f4583C;
                    try {
                        c02.e(this.f4590o, this.f4584D.A());
                        c02.b();
                        c02.a();
                    } catch (Throwable th3) {
                        c02.a();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                a();
                throw th4;
            }
        }
    }

    public final void k() {
        Q2.C0 c02;
        synchronized (this.f4589n) {
            try {
                boolean z3 = this.f4591p.f4344l > 0;
                try {
                    try {
                        if (!z3) {
                            if (!this.f4590o.f18950k.g()) {
                            }
                            this.f4592q.a();
                            this.f4595t.a();
                            this.f4599x.a();
                            this.f4596u.f.s0();
                            this.f4597v.f.s0();
                            C0315s c0315s = this.f4584D;
                            c0315s.f4518E.clear();
                            c0315s.f4549s.clear();
                            c0315s.f4537e.f.s0();
                            c0315s.f4552v = null;
                            this.f4585E = 1;
                        }
                        c02.e(this.f4590o, this.f4584D.A());
                        if (z3) {
                            P0 f = this.f4591p.f();
                            try {
                                f.n(f.f4383t, new O3.o(this.f4583C, f));
                                f.e(true);
                                this.f4587l.i();
                                c02.c();
                            } catch (Throwable th) {
                                f.e(false);
                                throw th;
                            }
                        }
                        c02.b();
                        c02.a();
                        this.f4592q.a();
                        this.f4595t.a();
                        this.f4599x.a();
                        this.f4596u.f.s0();
                        this.f4597v.f.s0();
                        C0315s c0315s2 = this.f4584D;
                        c0315s2.f4518E.clear();
                        c0315s2.f4549s.clear();
                        c0315s2.f4537e.f.s0();
                        c0315s2.f4552v = null;
                        this.f4585E = 1;
                    } catch (Throwable th2) {
                        c02.a();
                        throw th2;
                    }
                    c02 = this.f4583C;
                } finally {
                    Trace.endSection();
                }
                Trace.beginSection("Compose:deactivate");
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void l() {
        synchronized (this.f4589n) {
            try {
                if (this.f4584D.f4519F) {
                    AbstractC0316s0.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.f4585E != 3) {
                    this.f4585E = 3;
                    int i = AbstractC0296i.f4475a;
                    C0336a c0336a = this.f4584D.f4523L;
                    if (c0336a != null) {
                        e(c0336a);
                    }
                    boolean z3 = this.f4591p.f4344l > 0;
                    if (z3 || !this.f4590o.f18950k.g()) {
                        Q2.C0 c02 = this.f4583C;
                        try {
                            c02.e(this.f4590o, this.f4584D.A());
                            if (z3) {
                                P0 f = this.f4591p.f();
                                try {
                                    f.n(f.f4383t, new C0196a(2, this.f4583C));
                                    f.G();
                                    f.e(true);
                                    this.f4587l.q();
                                    this.f4587l.i();
                                    c02.c();
                                } catch (Throwable th) {
                                    f.e(false);
                                    throw th;
                                }
                            }
                            c02.b();
                            c02.a();
                        } catch (Throwable th2) {
                            c02.a();
                            throw th2;
                        }
                    }
                    C0315s c0315s = this.f4584D;
                    c0315s.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        c0315s.f4534b.p(c0315s);
                        c0315s.f4518E.clear();
                        c0315s.f4549s.clear();
                        c0315s.f4537e.f.s0();
                        c0315s.f4552v = null;
                        c0315s.f4533a.q();
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.f4586k.q(this);
    }

    public final void m() {
        AtomicReference atomicReference = this.f4588m;
        Object obj = AbstractC0329z.f4605a;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                AbstractC0317t.d("pending composition has not been applied");
                throw new D2.e();
            }
            if (andSet instanceof Set) {
                c((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                AbstractC0317t.d("corrupt pendingModifications drain: " + atomicReference);
                throw new D2.e();
            }
            for (Set set : (Set[]) andSet) {
                c(set, true);
            }
        }
    }

    public final void n() {
        AtomicReference atomicReference = this.f4588m;
        Object andSet = atomicReference.getAndSet(null);
        if (kotlin.jvm.internal.l.a(andSet, AbstractC0329z.f4605a)) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                c(set, false);
            }
            return;
        }
        if (andSet == null) {
            AbstractC0317t.d("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw new D2.e();
        }
        AbstractC0317t.d("corrupt pendingModifications drain: " + atomicReference);
        throw new D2.e();
    }

    public final void o() {
        AtomicReference atomicReference = this.f4588m;
        Object andSet = atomicReference.getAndSet(X3.x.f6092k);
        if (kotlin.jvm.internal.l.a(andSet, AbstractC0329z.f4605a) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            AbstractC0317t.d("corrupt pendingModifications drain: " + atomicReference);
            throw new D2.e();
        }
        for (Set set : (Set[]) andSet) {
            c(set, false);
        }
    }

    public final void p() {
        int i = this.f4585E;
        if (i == 0) {
            return;
        }
        AbstractC0316s0.b(i != 1 ? i != 2 ? i != 3 ? "" : "The composition is disposed" : "A previous pausable composition for this composition was cancelled. This composition must be disposed." : "The composition should be activated before setting content.");
    }

    public final void q(ArrayList arrayList) {
        C0315s c0315s = this.f4584D;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0287d0) ((W3.h) arrayList.get(i)).f6036k).getClass();
            if (!kotlin.jvm.internal.l.a(null, this)) {
                AbstractC0317t.c("Check failed");
                break;
            }
        }
        try {
            c0315s.getClass();
            try {
                c0315s.C(arrayList);
                c0315s.i();
            } catch (Throwable th) {
                c0315s.a();
                throw th;
            }
        } catch (Throwable th2) {
            r.J j5 = this.f4590o;
            try {
                if (!j5.f18950k.g()) {
                    Q2.C0 c02 = this.f4583C;
                    try {
                        c02.e(j5, c0315s.A());
                        c02.b();
                        c02.a();
                    } catch (Throwable th3) {
                        c02.a();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                a();
                throw th4;
            }
        }
    }

    public final T r(C0326x0 c0326x0, Object obj) {
        C0327y c0327y;
        int i = c0326x0.f4576b;
        if ((i & 2) != 0) {
            c0326x0.f4576b = i | 4;
        }
        C0280a c0280a = c0326x0.f4577c;
        if (c0280a == null || !c0280a.a()) {
            return T.f4396k;
        }
        if (this.f4591p.g(c0280a)) {
            if (c0326x0.f4578d == null) {
                return T.f4396k;
            }
            T t5 = t(c0326x0, c0280a, obj);
            if (t5 != T.f4396k) {
                this.f4582B.d();
            }
            return t5;
        }
        synchronized (this.f4589n) {
            c0327y = this.f4601z;
        }
        if (c0327y != null) {
            C0315s c0315s = c0327y.f4584D;
            if (c0315s.f4519F && c0315s.d0(c0326x0, obj)) {
                return T.f4399n;
            }
        }
        return T.f4396k;
    }

    public final void s() {
        C0327y c0327y;
        synchronized (this.f4589n) {
            try {
                for (Object obj : this.f4591p.f4345m) {
                    C0326x0 c0326x0 = obj instanceof C0326x0 ? (C0326x0) obj : null;
                    if (c0326x0 != null && (c0327y = c0326x0.f4575a) != null) {
                        c0327y.r(c0326x0, null);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final T t(C0326x0 c0326x0, C0280a c0280a, Object obj) {
        C0327y c0327y;
        int i;
        synchronized (this.f4589n) {
            try {
                C0327y c0327y2 = this.f4601z;
                if (c0327y2 != null) {
                    M0 m02 = this.f4591p;
                    int i5 = this.f4581A;
                    if (m02.f4349q) {
                        AbstractC0317t.c("Writer is active");
                    }
                    if (i5 < 0 || i5 >= m02.f4344l) {
                        AbstractC0317t.c("Invalid group index");
                    }
                    if (m02.g(c0280a)) {
                        int i6 = m02.f4343k[(i5 * 5) + 3] + i5;
                        int i7 = c0280a.f4439a;
                        c0327y = (i5 <= i7 && i7 < i6) ? c0327y2 : null;
                    }
                    c0327y2 = null;
                }
                if (c0327y == null) {
                    C0315s c0315s = this.f4584D;
                    if (c0315s.f4519F && c0315s.d0(c0326x0, obj)) {
                        return T.f4399n;
                    }
                    if (obj == null) {
                        this.f4599x.m(c0326x0, Z.f4433o);
                    } else if (obj instanceof H) {
                        Object g5 = this.f4599x.g(c0326x0);
                        if (g5 != null) {
                            if (g5 instanceof C2322H) {
                                C2322H c2322h = (C2322H) g5;
                                Object[] objArr = c2322h.f18934b;
                                long[] jArr = c2322h.f18933a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i8 = 0;
                                    loop0: while (true) {
                                        long j5 = jArr[i8];
                                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i9 = 8;
                                            int i10 = 8 - ((~(i8 - length)) >>> 31);
                                            int i11 = 0;
                                            while (i11 < i10) {
                                                if ((j5 & 255) < 128) {
                                                    i = i9;
                                                    if (objArr[(i8 << 3) + i11] == Z.f4433o) {
                                                        break loop0;
                                                    }
                                                } else {
                                                    i = i9;
                                                }
                                                j5 >>= i;
                                                i11++;
                                                i9 = i;
                                            }
                                            if (i10 != i9) {
                                                break;
                                            }
                                        }
                                        if (i8 == length) {
                                            break;
                                        }
                                        i8++;
                                    }
                                }
                            } else if (g5 == Z.f4433o) {
                            }
                        }
                        AbstractC2425d.h(this.f4599x, c0326x0, obj);
                    } else {
                        this.f4599x.m(c0326x0, Z.f4433o);
                    }
                }
                if (c0327y != null) {
                    return c0327y.t(c0326x0, c0280a, obj);
                }
                this.f4586k.j(this);
                return this.f4584D.f4519F ? T.f4398m : T.f4397l;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void u(Object obj) {
        Object g5 = this.f4592q.g(obj);
        if (g5 == null) {
            return;
        }
        boolean z3 = g5 instanceof C2322H;
        C2321G c2321g = this.f4598w;
        if (!z3) {
            C0326x0 c0326x0 = (C0326x0) g5;
            if (c0326x0.c(obj) == T.f4399n) {
                AbstractC2425d.h(c2321g, obj, c0326x0);
                return;
            }
            return;
        }
        C2322H c2322h = (C2322H) g5;
        Object[] objArr = c2322h.f18934b;
        long[] jArr = c2322h.f18933a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j5 = jArr[i];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = 8 - ((~(i - length)) >>> 31);
                for (int i6 = 0; i6 < i5; i6++) {
                    if ((255 & j5) < 128) {
                        C0326x0 c0326x02 = (C0326x0) objArr[(i << 3) + i6];
                        if (c0326x02.c(obj) == T.f4399n) {
                            AbstractC2425d.h(c2321g, obj, c0326x02);
                        }
                    }
                    j5 >>= 8;
                }
                if (i5 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean v(Set set) {
        boolean z3 = set instanceof R.h;
        C2321G c2321g = this.f4595t;
        C2321G c2321g2 = this.f4592q;
        if (z3) {
            C2322H c2322h = ((R.h) set).f5119k;
            Object[] objArr = c2322h.f18934b;
            long[] jArr = c2322h.f18933a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                loop0: while (true) {
                    long j5 = jArr[i];
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8 - ((~(i - length)) >>> 31);
                        for (int i6 = 0; i6 < i5; i6++) {
                            if ((255 & j5) < 128) {
                                Object obj = objArr[(i << 3) + i6];
                                if (c2321g2.c(obj) || c2321g.c(obj)) {
                                    break loop0;
                                }
                            }
                            j5 >>= 8;
                        }
                        if (i5 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        } else {
            for (Object obj2 : set) {
                if (c2321g2.c(obj2) || c2321g.c(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean w() {
        boolean z3;
        synchronized (this.f4589n) {
            z3 = false;
            m();
            try {
                C2321G c2321g = this.f4599x;
                this.f4599x = AbstractC2425d.o();
                try {
                    C0315s c0315s = this.f4584D;
                    Q.K k5 = c0315s.f4537e.f;
                    if (!k5.u0()) {
                        AbstractC0317t.c("Expected applyChanges() to have been called");
                    }
                    if (c2321g.f18932e > 0 || !c0315s.f4549s.isEmpty()) {
                        c0315s.f4527P = null;
                        try {
                            c0315s.o(c2321g, null);
                            c0315s.f4527P = null;
                            z3 = k5.v0();
                        } catch (Throwable th) {
                            c0315s.f4527P = null;
                            throw th;
                        }
                    }
                    if (!z3) {
                        n();
                    }
                } catch (Throwable th2) {
                    this.f4599x = c2321g;
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    if (!this.f4590o.f18950k.g()) {
                        Q2.C0 c02 = this.f4583C;
                        try {
                            c02.e(this.f4590o, this.f4584D.A());
                            c02.b();
                            c02.a();
                        } catch (Throwable th4) {
                            c02.a();
                            throw th4;
                        }
                    }
                    throw th3;
                } catch (Throwable th5) {
                    a();
                    throw th5;
                }
            }
        }
        return z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.Set[]] */
    public final void x(R.h hVar) {
        R.h hVar2;
        while (true) {
            Object obj = this.f4588m.get();
            if (obj == null || obj.equals(AbstractC0329z.f4605a)) {
                hVar2 = hVar;
            } else if (obj instanceof Set) {
                hVar2 = new Set[]{obj, hVar};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.f4588m).toString());
                }
                Set[] setArr = (Set[]) obj;
                int length = setArr.length;
                ?? copyOf = Arrays.copyOf(setArr, length + 1);
                copyOf[length] = hVar;
                hVar2 = copyOf;
            }
            AtomicReference atomicReference = this.f4588m;
            while (!atomicReference.compareAndSet(obj, hVar2)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
            if (obj == null) {
                synchronized (this.f4589n) {
                    n();
                }
                return;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(Object obj) {
        C0326x0 y5;
        int i;
        boolean z3;
        boolean z5;
        boolean z6;
        int i5;
        C0315s c0315s = this.f4584D;
        if (c0315s.f4514A > 0 || (y5 = c0315s.y()) == null) {
            return;
        }
        boolean z7 = true;
        int i6 = y5.f4576b | 1;
        y5.f4576b = i6;
        if ((i6 & 32) == 0) {
            C2315A c2315a = y5.f;
            if (c2315a == null) {
                c2315a = new C2315A();
                y5.f = c2315a;
            }
            int i7 = y5.f4579e;
            int c5 = c2315a.c(obj);
            if (c5 < 0) {
                c5 = ~c5;
                i = -1;
            } else {
                i = c2315a.f18901c[c5];
            }
            c2315a.f18900b[c5] = obj;
            c2315a.f18901c[c5] = i7;
            if (i == y5.f4579e) {
                z3 = true;
                this.f4582B.d();
                if (z3) {
                    if (obj instanceof Z.v) {
                        ((Z.v) obj).g(1);
                    }
                    AbstractC2425d.h(this.f4592q, obj, y5);
                    if (obj instanceof H) {
                        H h3 = (H) obj;
                        G i8 = h3.i();
                        C2321G c2321g = this.f4595t;
                        AbstractC2425d.F(c2321g, obj);
                        C2315A c2315a2 = i8.f4314e;
                        Object[] objArr = c2315a2.f18900b;
                        long[] jArr = c2315a2.f18899a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i9 = 0;
                            while (true) {
                                long j5 = jArr[i9];
                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i10 = 8;
                                    int i11 = 8 - ((~(i9 - length)) >>> 31);
                                    int i12 = 0;
                                    while (i12 < i11) {
                                        if ((j5 & 255) < 128) {
                                            i5 = i10;
                                            Z.u uVar = (Z.u) objArr[(i9 << 3) + i12];
                                            if (uVar instanceof Z.v) {
                                                z6 = true;
                                                ((Z.v) uVar).g(1);
                                            } else {
                                                z6 = true;
                                            }
                                            AbstractC2425d.h(c2321g, uVar, obj);
                                        } else {
                                            z6 = z7;
                                            i5 = i10;
                                        }
                                        j5 >>= i5;
                                        i12++;
                                        z7 = z6;
                                        i10 = i5;
                                    }
                                    z5 = z7;
                                    if (i11 != i10) {
                                        break;
                                    }
                                } else {
                                    z5 = z7;
                                }
                                if (i9 == length) {
                                    break;
                                }
                                i9++;
                                z7 = z5;
                            }
                        }
                        Object obj2 = i8.f;
                        C2321G c2321g2 = y5.f4580g;
                        if (c2321g2 == null) {
                            c2321g2 = new C2321G();
                            y5.f4580g = c2321g2;
                        }
                        c2321g2.m(h3, obj2);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        z3 = false;
        this.f4582B.d();
        if (z3) {
        }
    }

    public final void z(Object obj) {
        synchronized (this.f4589n) {
            try {
                u(obj);
                Object g5 = this.f4595t.g(obj);
                if (g5 != null) {
                    if (g5 instanceof C2322H) {
                        C2322H c2322h = (C2322H) g5;
                        Object[] objArr = c2322h.f18934b;
                        long[] jArr = c2322h.f18933a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j5 = jArr[i];
                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i5 = 8 - ((~(i - length)) >>> 31);
                                    for (int i6 = 0; i6 < i5; i6++) {
                                        if ((255 & j5) < 128) {
                                            u((H) objArr[(i << 3) + i6]);
                                        }
                                        j5 >>= 8;
                                    }
                                    if (i5 != 8) {
                                        break;
                                    }
                                }
                                if (i == length) {
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        }
                    } else {
                        u((H) g5);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
