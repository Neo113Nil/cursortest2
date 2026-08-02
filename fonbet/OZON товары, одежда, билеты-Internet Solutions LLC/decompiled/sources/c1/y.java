package c1;

import C.C2702w;
import S0.B0;
import S0.C3942b;
import S0.I;
import S0.l1;
import S0.n1;
import androidx.collection.O;
import androidx.collection.X;
import c1.AbstractC5715f;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.U;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC7737t f56285a;

    /* renamed from: c, reason: collision with root package name */
    private boolean f56287c;

    /* renamed from: g, reason: collision with root package name */
    private VL.b f56291g;

    /* renamed from: h, reason: collision with root package name */
    private a f56292h;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final AtomicReference<Object> f56286b = new AtomicReference<>(null);

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function2<Set<? extends Object>, AbstractC5715f, Unit> f56288d = new b();

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function1<Object, Unit> f56289e = new c();

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final U0.b<a> f56290f = new U0.b<>(new a[16]);

    /* renamed from: i, reason: collision with root package name */
    private long f56293i = -1;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final AbstractC7737t f56294a;

        /* renamed from: b, reason: collision with root package name */
        private Object f56295b;

        /* renamed from: c, reason: collision with root package name */
        private androidx.collection.I<Object> f56296c;

        /* renamed from: j, reason: collision with root package name */
        private int f56303j;

        /* renamed from: d, reason: collision with root package name */
        private int f56297d = -1;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private final U0.d<Object, Object> f56298e = new U0.d<>();

        /* renamed from: f, reason: collision with root package name */
        @NotNull
        private final androidx.collection.L<Object, androidx.collection.I<Object>> f56299f = new androidx.collection.L<>((Object) null);

        /* renamed from: g, reason: collision with root package name */
        @NotNull
        private final androidx.collection.M<Object> f56300g = new androidx.collection.M<>((Object) null);

        /* renamed from: h, reason: collision with root package name */
        @NotNull
        private final U0.b<S0.J<?>> f56301h = new U0.b<>(new S0.J[16]);

        /* renamed from: i, reason: collision with root package name */
        @NotNull
        private final C0845a f56302i = new C0845a();

        /* renamed from: k, reason: collision with root package name */
        @NotNull
        private final U0.d<Object, S0.J<?>> f56304k = new U0.d<>();

        /* renamed from: l, reason: collision with root package name */
        @NotNull
        private final HashMap<S0.J<?>, Object> f56305l = new HashMap<>();

        /* renamed from: c1.y$a$a, reason: collision with other inner class name */
        public static final class C0845a implements S0.K {
            C0845a() {
            }

            @Override // S0.K
            public final void a() {
                a aVar = a.this;
                aVar.f56303j--;
            }

            @Override // S0.K
            public final void start() {
                a.this.f56303j++;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull Function1<Object, Unit> function1) {
            this.f56294a = (AbstractC7737t) function1;
        }

        private final void k(Object obj, int i11, Object obj2, androidx.collection.I<Object> i12) {
            if (this.f56303j > 0) {
                return;
            }
            int f7 = i12.f(i11, obj);
            if ((obj instanceof S0.J) && f7 != i11) {
                I.a u11 = ((S0.J) obj).u();
                this.f56305l.put(obj, u11.h());
                O<InterfaceC5704H> i13 = u11.i();
                U0.d<Object, S0.J<?>> dVar = this.f56304k;
                dVar.g(obj);
                Object[] objArr = i13.f38640b;
                long[] jArr = i13.f38639a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i14 = 0;
                    while (true) {
                        long j11 = jArr[i14];
                        if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i15 = 8 - ((~(i14 - length)) >>> 31);
                            for (int i16 = 0; i16 < i15; i16++) {
                                if ((255 & j11) < 128) {
                                    InterfaceC5704H interfaceC5704H = (InterfaceC5704H) objArr[(i14 << 3) + i16];
                                    if (interfaceC5704H instanceof AbstractC5705I) {
                                        ((AbstractC5705I) interfaceC5704H).x(2);
                                    }
                                    dVar.a(interfaceC5704H, obj);
                                }
                                j11 >>= 8;
                            }
                            if (i15 != 8) {
                                break;
                            }
                        }
                        if (i14 == length) {
                            break;
                        } else {
                            i14++;
                        }
                    }
                }
            }
            if (f7 == -1) {
                if (obj instanceof AbstractC5705I) {
                    ((AbstractC5705I) obj).x(2);
                }
                this.f56298e.a(obj, obj2);
            }
        }

        private final void l(Object obj, Object obj2) {
            U0.d<Object, Object> dVar = this.f56298e;
            dVar.f(obj2, obj);
            if (!(obj2 instanceof S0.J) || dVar.c(obj2)) {
                return;
            }
            this.f56304k.g(obj2);
            this.f56305l.remove(obj2);
        }

        public final void c() {
            this.f56298e.b();
            this.f56299f.c();
            this.f56304k.b();
            this.f56305l.clear();
        }

        public final void d(@NotNull Object obj) {
            androidx.collection.I<Object> g10 = this.f56299f.g(obj);
            if (g10 == null) {
                return;
            }
            Object[] objArr = g10.f38640b;
            int[] iArr = g10.f38641c;
            long[] jArr = g10.f38639a;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i11 = 0;
            while (true) {
                long j11 = jArr[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j11) < 128) {
                            int i14 = (i11 << 3) + i13;
                            Object obj2 = objArr[i14];
                            int i15 = iArr[i14];
                            l(obj, obj2);
                        }
                        j11 >>= 8;
                    }
                    if (i12 != 8) {
                        return;
                    }
                }
                if (i11 == length) {
                    return;
                } else {
                    i11++;
                }
            }
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit>, kotlin.jvm.internal.t] */
        @NotNull
        public final Function1<Object, Unit> e() {
            return this.f56294a;
        }

        public final boolean f() {
            return this.f56299f.f38660e != 0;
        }

        /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
        public final void g() {
            androidx.collection.M<Object> m11 = this.f56300g;
            Object[] objArr = m11.f38663b;
            long[] jArr = m11.f38662a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i11 = 0;
                while (true) {
                    long j11 = jArr[i11];
                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i12 = 8 - ((~(i11 - length)) >>> 31);
                        for (int i13 = 0; i13 < i12; i13++) {
                            if ((255 & j11) < 128) {
                                this.f56294a.invoke(objArr[(i11 << 3) + i13]);
                            }
                            j11 >>= 8;
                        }
                        if (i12 != 8) {
                            break;
                        }
                    }
                    if (i11 == length) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            m11.f();
        }

        public final void h(@NotNull Object obj, @NotNull Function1<Object, Unit> function1, @NotNull Function0<Unit> function0) {
            boolean z11;
            int i11;
            int i12;
            Object obj2 = this.f56295b;
            androidx.collection.I<Object> i13 = this.f56296c;
            int i14 = this.f56297d;
            this.f56295b = obj;
            this.f56296c = this.f56299f.b(obj);
            if (this.f56297d == -1) {
                this.f56297d = C5721l.C().f();
            }
            C0845a c0845a = this.f56302i;
            U0.b<S0.K> c11 = n1.c();
            boolean z12 = true;
            try {
                c11.b(c0845a);
                AbstractC5715f.a.c(function0, function1);
                c11.u(c11.m() - 1);
                Object obj3 = this.f56295b;
                Intrinsics.f(obj3);
                int i15 = this.f56297d;
                androidx.collection.I<Object> i16 = this.f56296c;
                if (i16 != null) {
                    long[] jArr = i16.f38639a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i17 = 0;
                        while (true) {
                            long j11 = jArr[i17];
                            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i18 = 8;
                                int i19 = 8 - ((~(i17 - length)) >>> 31);
                                z11 = z12;
                                int i21 = 0;
                                while (i21 < i19) {
                                    if ((j11 & 255) < 128) {
                                        int i22 = (i17 << 3) + i21;
                                        i12 = i18;
                                        Object obj4 = i16.f38640b[i22];
                                        i11 = i21;
                                        boolean z13 = i16.f38641c[i22] != i15 ? z11 : false;
                                        if (z13) {
                                            l(obj3, obj4);
                                        }
                                        if (z13) {
                                            i16.g(i22);
                                        }
                                    } else {
                                        i11 = i21;
                                        i12 = i18;
                                    }
                                    j11 >>= i12;
                                    i21 = i11 + 1;
                                    i18 = i12;
                                }
                                if (i19 != i18) {
                                    break;
                                }
                            } else {
                                z11 = z12;
                            }
                            if (i17 == length) {
                                break;
                            }
                            i17++;
                            z12 = z11;
                        }
                    }
                }
                this.f56295b = obj2;
                this.f56296c = i13;
                this.f56297d = i14;
            } catch (Throwable th2) {
                c11.u(c11.m() - 1);
                throw th2;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x006b, code lost:
        
            if (((c1.AbstractC5705I) r11).w(2) == false) goto L122;
         */
        /* JADX WARN: Removed duplicated region for block: B:267:0x050c  */
        /* JADX WARN: Removed duplicated region for block: B:292:0x055c A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0264  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean i(@NotNull Set<? extends Object> set) {
            U0.d<Object, Object> dVar;
            char c11;
            long j11;
            boolean z11;
            Iterator it;
            String str;
            Object b11;
            int i11;
            Object b12;
            long[] jArr;
            Iterator it2;
            String str2;
            U0.d<Object, S0.J<?>> dVar2;
            long[] jArr2;
            long j12;
            int i12;
            S0.J<?>[] jArr3;
            int i13;
            a aVar;
            S0.J<?>[] jArr4;
            int i14;
            androidx.collection.I<Object> i15;
            long[] jArr5;
            Object[] objArr;
            U0.d<Object, S0.J<?>> dVar3;
            int i16;
            long[] jArr6;
            Object[] objArr2;
            U0.d<Object, S0.J<?>> dVar4;
            U0.d<Object, Object> dVar5;
            int i17;
            int i18;
            long j13;
            int i19;
            Object obj;
            Object b13;
            Object b14;
            int i21;
            int i22;
            int i23;
            Object obj2;
            long j14;
            int i24;
            long[] jArr7;
            long[] jArr8;
            HashMap<S0.J<?>, Object> hashMap = this.f56305l;
            boolean z12 = set instanceof U0.c;
            String str3 = "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>";
            U0.b<S0.J<?>> bVar = this.f56301h;
            U0.d<Object, S0.J<?>> dVar6 = this.f56304k;
            U0.d<Object, Object> dVar7 = this.f56298e;
            androidx.collection.M<Object> m11 = this.f56300g;
            if (z12) {
                X b15 = ((U0.c) set).b();
                Object[] objArr3 = b15.f38663b;
                long[] jArr9 = b15.f38662a;
                int length = jArr9.length - 2;
                if (length >= 0) {
                    int i25 = 0;
                    z11 = false;
                    c11 = 7;
                    j11 = -9187201950435737472L;
                    while (true) {
                        long j15 = jArr9[i25];
                        int i26 = 8;
                        if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i27 = 8 - ((~(i25 - length)) >>> 31);
                            int i28 = 0;
                            while (i28 < i27) {
                                if ((j15 & 255) < 128) {
                                    Object obj3 = objArr3[(i25 << 3) + i28];
                                    jArr6 = jArr9;
                                    if (obj3 instanceof AbstractC5705I) {
                                        objArr2 = objArr3;
                                    } else {
                                        objArr2 = objArr3;
                                    }
                                    if (dVar6.c(obj3) && (b14 = dVar6.d().b(obj3)) != null) {
                                        if (b14 instanceof androidx.collection.M) {
                                            androidx.collection.M m12 = (androidx.collection.M) b14;
                                            Object[] objArr4 = m12.f38663b;
                                            long[] jArr10 = m12.f38662a;
                                            int length2 = jArr10.length - 2;
                                            if (length2 >= 0) {
                                                j13 = j15;
                                                int i29 = 0;
                                                while (true) {
                                                    long j16 = jArr10[i29];
                                                    dVar4 = dVar6;
                                                    dVar5 = dVar7;
                                                    if ((((~j16) << 7) & j16 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i31 = 8 - ((~(i29 - length2)) >>> 31);
                                                        int i32 = 0;
                                                        while (i32 < i31) {
                                                            if ((j16 & 255) < 128) {
                                                                i21 = i32;
                                                                S0.J j17 = (S0.J) objArr4[(i29 << 3) + i32];
                                                                Intrinsics.g(j17, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
                                                                j14 = j16;
                                                                Object obj4 = hashMap.get(j17);
                                                                l1 a11 = j17.a();
                                                                if (a11 == null) {
                                                                    a11 = n1.n();
                                                                }
                                                                i24 = i28;
                                                                if (a11.a(j17.u().h(), obj4)) {
                                                                    i22 = length;
                                                                    i23 = i25;
                                                                    obj2 = obj3;
                                                                    bVar.b(j17);
                                                                } else {
                                                                    Object b16 = dVar5.d().b(j17);
                                                                    if (b16 != null) {
                                                                        if (b16 instanceof androidx.collection.M) {
                                                                            androidx.collection.M m13 = (androidx.collection.M) b16;
                                                                            Object[] objArr5 = m13.f38663b;
                                                                            long[] jArr11 = m13.f38662a;
                                                                            int length3 = jArr11.length - 2;
                                                                            if (length3 >= 0) {
                                                                                i22 = length;
                                                                                i23 = i25;
                                                                                int i33 = 0;
                                                                                while (true) {
                                                                                    long j18 = jArr11[i33];
                                                                                    obj2 = obj3;
                                                                                    Object[] objArr6 = objArr5;
                                                                                    if ((((~j18) << 7) & j18 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                                        int i34 = 8 - ((~(i33 - length3)) >>> 31);
                                                                                        int i35 = 0;
                                                                                        while (i35 < i34) {
                                                                                            if ((j18 & 255) < 128) {
                                                                                                jArr8 = jArr11;
                                                                                                m11.d(objArr6[(i33 << 3) + i35]);
                                                                                                z11 = true;
                                                                                            } else {
                                                                                                jArr8 = jArr11;
                                                                                            }
                                                                                            j18 >>= i26;
                                                                                            i35++;
                                                                                            jArr11 = jArr8;
                                                                                        }
                                                                                        jArr7 = jArr11;
                                                                                        if (i34 != i26) {
                                                                                            break;
                                                                                        }
                                                                                    } else {
                                                                                        jArr7 = jArr11;
                                                                                    }
                                                                                    if (i33 == length3) {
                                                                                        break;
                                                                                    }
                                                                                    i33++;
                                                                                    obj3 = obj2;
                                                                                    objArr5 = objArr6;
                                                                                    jArr11 = jArr7;
                                                                                    i26 = 8;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            i22 = length;
                                                                            i23 = i25;
                                                                            obj2 = obj3;
                                                                            m11.d(b16);
                                                                            z11 = true;
                                                                        }
                                                                    }
                                                                    i22 = length;
                                                                    i23 = i25;
                                                                    obj2 = obj3;
                                                                }
                                                            } else {
                                                                i21 = i32;
                                                                i22 = length;
                                                                i23 = i25;
                                                                obj2 = obj3;
                                                                j14 = j16;
                                                                i24 = i28;
                                                            }
                                                            j16 = j14 >> 8;
                                                            i26 = 8;
                                                            i32 = i21 + 1;
                                                            length = i22;
                                                            i28 = i24;
                                                            i25 = i23;
                                                            obj3 = obj2;
                                                        }
                                                        i17 = length;
                                                        i18 = i25;
                                                        obj = obj3;
                                                        i19 = i28;
                                                        if (i31 != i26) {
                                                            break;
                                                        }
                                                    } else {
                                                        i17 = length;
                                                        i18 = i25;
                                                        obj = obj3;
                                                        i19 = i28;
                                                    }
                                                    if (i29 == length2) {
                                                        break;
                                                    }
                                                    i29++;
                                                    dVar6 = dVar4;
                                                    dVar7 = dVar5;
                                                    length = i17;
                                                    i28 = i19;
                                                    i25 = i18;
                                                    obj3 = obj;
                                                    i26 = 8;
                                                }
                                            }
                                        } else {
                                            dVar4 = dVar6;
                                            dVar5 = dVar7;
                                            i17 = length;
                                            i18 = i25;
                                            obj = obj3;
                                            j13 = j15;
                                            i19 = i28;
                                            S0.J j19 = (S0.J) b14;
                                            Object obj5 = hashMap.get(j19);
                                            l1 a12 = j19.a();
                                            if (a12 == null) {
                                                a12 = n1.n();
                                            }
                                            if (a12.a(j19.u().h(), obj5)) {
                                                bVar.b(j19);
                                            } else {
                                                Object b17 = dVar5.d().b(j19);
                                                if (b17 != null) {
                                                    if (b17 instanceof androidx.collection.M) {
                                                        androidx.collection.M m14 = (androidx.collection.M) b17;
                                                        Object[] objArr7 = m14.f38663b;
                                                        long[] jArr12 = m14.f38662a;
                                                        int length4 = jArr12.length - 2;
                                                        if (length4 >= 0) {
                                                            int i36 = 0;
                                                            while (true) {
                                                                long j21 = jArr12[i36];
                                                                if ((((~j21) << 7) & j21 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                    int i37 = 8 - ((~(i36 - length4)) >>> 31);
                                                                    for (int i38 = 0; i38 < i37; i38++) {
                                                                        if ((j21 & 255) < 128) {
                                                                            m11.d(objArr7[(i36 << 3) + i38]);
                                                                            z11 = true;
                                                                        }
                                                                        j21 >>= 8;
                                                                    }
                                                                    if (i37 != 8) {
                                                                        break;
                                                                    }
                                                                }
                                                                if (i36 == length4) {
                                                                    break;
                                                                }
                                                                i36++;
                                                            }
                                                        }
                                                    } else {
                                                        m11.d(b17);
                                                        z11 = true;
                                                    }
                                                }
                                            }
                                        }
                                        b13 = dVar5.d().b(obj);
                                        if (b13 != null) {
                                            if (b13 instanceof androidx.collection.M) {
                                                androidx.collection.M m15 = (androidx.collection.M) b13;
                                                Object[] objArr8 = m15.f38663b;
                                                long[] jArr13 = m15.f38662a;
                                                int length5 = jArr13.length - 2;
                                                if (length5 >= 0) {
                                                    int i39 = 0;
                                                    while (true) {
                                                        long j22 = jArr13[i39];
                                                        if ((((~j22) << 7) & j22 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i41 = 8 - ((~(i39 - length5)) >>> 31);
                                                            for (int i42 = 0; i42 < i41; i42++) {
                                                                if ((j22 & 255) < 128) {
                                                                    m11.d(objArr8[(i39 << 3) + i42]);
                                                                    z11 = true;
                                                                }
                                                                j22 >>= 8;
                                                            }
                                                            if (i41 != 8) {
                                                                break;
                                                            }
                                                        }
                                                        if (i39 == length5) {
                                                            break;
                                                        }
                                                        i39++;
                                                    }
                                                }
                                            } else {
                                                m11.d(b13);
                                                z11 = true;
                                            }
                                        }
                                        j15 = j13 >> 8;
                                        i28 = i19 + 1;
                                        objArr3 = objArr2;
                                        i26 = 8;
                                        jArr9 = jArr6;
                                        dVar6 = dVar4;
                                        dVar7 = dVar5;
                                        length = i17;
                                        i25 = i18;
                                    }
                                    dVar4 = dVar6;
                                    dVar5 = dVar7;
                                    i17 = length;
                                    i18 = i25;
                                    obj = obj3;
                                    j13 = j15;
                                    i19 = i28;
                                    b13 = dVar5.d().b(obj);
                                    if (b13 != null) {
                                    }
                                    j15 = j13 >> 8;
                                    i28 = i19 + 1;
                                    objArr3 = objArr2;
                                    i26 = 8;
                                    jArr9 = jArr6;
                                    dVar6 = dVar4;
                                    dVar7 = dVar5;
                                    length = i17;
                                    i25 = i18;
                                } else {
                                    jArr6 = jArr9;
                                    objArr2 = objArr3;
                                }
                                dVar4 = dVar6;
                                dVar5 = dVar7;
                                i17 = length;
                                i18 = i25;
                                j13 = j15;
                                i19 = i28;
                                j15 = j13 >> 8;
                                i28 = i19 + 1;
                                objArr3 = objArr2;
                                i26 = 8;
                                jArr9 = jArr6;
                                dVar6 = dVar4;
                                dVar7 = dVar5;
                                length = i17;
                                i25 = i18;
                            }
                            jArr5 = jArr9;
                            objArr = objArr3;
                            dVar3 = dVar6;
                            dVar = dVar7;
                            int i43 = length;
                            int i44 = i25;
                            if (i27 != i26) {
                                break;
                            }
                            length = i43;
                            i16 = i44;
                        } else {
                            jArr5 = jArr9;
                            objArr = objArr3;
                            dVar3 = dVar6;
                            dVar = dVar7;
                            i16 = i25;
                        }
                        if (i16 == length) {
                            break;
                        }
                        i25 = i16 + 1;
                        objArr3 = objArr;
                        jArr9 = jArr5;
                        dVar6 = dVar3;
                        dVar7 = dVar;
                    }
                } else {
                    dVar = dVar7;
                    c11 = 7;
                    j11 = -9187201950435737472L;
                    z11 = false;
                }
            } else {
                U0.d<Object, S0.J<?>> dVar8 = dVar6;
                dVar = dVar7;
                c11 = 7;
                j11 = -9187201950435737472L;
                Iterator it3 = set.iterator();
                z11 = false;
                while (it3.hasNext()) {
                    Object next = it3.next();
                    if (!(next instanceof AbstractC5705I) || ((AbstractC5705I) next).w(2)) {
                        U0.d<Object, S0.J<?>> dVar9 = dVar8;
                        if (dVar9.c(next) && (b12 = dVar9.d().b(next)) != null) {
                            if (b12 instanceof androidx.collection.M) {
                                androidx.collection.M m16 = (androidx.collection.M) b12;
                                Object[] objArr9 = m16.f38663b;
                                long[] jArr14 = m16.f38662a;
                                int length6 = jArr14.length - 2;
                                if (length6 >= 0) {
                                    int i45 = 0;
                                    while (true) {
                                        long j23 = jArr14[i45];
                                        if ((((~j23) << 7) & j23 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i46 = 8 - ((~(i45 - length6)) >>> 31);
                                            int i47 = 0;
                                            while (i47 < i46) {
                                                if ((j23 & 255) < 128) {
                                                    it2 = it3;
                                                    S0.J j24 = (S0.J) objArr9[(i45 << 3) + i47];
                                                    Intrinsics.g(j24, str3);
                                                    str2 = str3;
                                                    Object obj6 = hashMap.get(j24);
                                                    l1 a13 = j24.a();
                                                    if (a13 == null) {
                                                        a13 = n1.n();
                                                    }
                                                    dVar2 = dVar9;
                                                    jArr2 = jArr14;
                                                    if (a13.a(j24.u().h(), obj6)) {
                                                        j12 = j23;
                                                        bVar.b(j24);
                                                    } else {
                                                        Object b18 = dVar.d().b(j24);
                                                        if (b18 != null) {
                                                            if (b18 instanceof androidx.collection.M) {
                                                                androidx.collection.M m17 = (androidx.collection.M) b18;
                                                                Object[] objArr10 = m17.f38663b;
                                                                long[] jArr15 = m17.f38662a;
                                                                int length7 = jArr15.length - 2;
                                                                if (length7 >= 0) {
                                                                    j12 = j23;
                                                                    int i48 = 0;
                                                                    while (true) {
                                                                        long j25 = jArr15[i48];
                                                                        long[] jArr16 = jArr15;
                                                                        if ((((~j25) << 7) & j25 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                            int i49 = 8 - ((~(i48 - length7)) >>> 31);
                                                                            for (int i51 = 0; i51 < i49; i51 = i12 + 1) {
                                                                                if ((j25 & 255) < 128) {
                                                                                    i12 = i51;
                                                                                    m11.d(objArr10[(i48 << 3) + i51]);
                                                                                    z11 = true;
                                                                                } else {
                                                                                    i12 = i51;
                                                                                }
                                                                                j25 >>= 8;
                                                                            }
                                                                            if (i49 != 8) {
                                                                                break;
                                                                            }
                                                                        }
                                                                        if (i48 == length7) {
                                                                            break;
                                                                        }
                                                                        i48++;
                                                                        jArr15 = jArr16;
                                                                    }
                                                                }
                                                            } else {
                                                                j12 = j23;
                                                                m11.d(b18);
                                                                z11 = true;
                                                            }
                                                        }
                                                    }
                                                    j23 = j12 >> 8;
                                                    i47++;
                                                    it3 = it2;
                                                    str3 = str2;
                                                    jArr14 = jArr2;
                                                    dVar9 = dVar2;
                                                } else {
                                                    it2 = it3;
                                                    str2 = str3;
                                                    dVar2 = dVar9;
                                                    jArr2 = jArr14;
                                                }
                                                j12 = j23;
                                                j23 = j12 >> 8;
                                                i47++;
                                                it3 = it2;
                                                str3 = str2;
                                                jArr14 = jArr2;
                                                dVar9 = dVar2;
                                            }
                                            it = it3;
                                            str = str3;
                                            dVar8 = dVar9;
                                            jArr = jArr14;
                                            if (i46 != 8) {
                                                break;
                                            }
                                        } else {
                                            it = it3;
                                            str = str3;
                                            dVar8 = dVar9;
                                            jArr = jArr14;
                                        }
                                        if (i45 == length6) {
                                            break;
                                        }
                                        i45++;
                                        it3 = it;
                                        str3 = str;
                                        jArr14 = jArr;
                                        dVar9 = dVar8;
                                    }
                                }
                            } else {
                                it = it3;
                                str = str3;
                                dVar8 = dVar9;
                                S0.J j26 = (S0.J) b12;
                                Object obj7 = hashMap.get(j26);
                                l1 a14 = j26.a();
                                if (a14 == null) {
                                    a14 = n1.n();
                                }
                                if (a14.a(j26.u().h(), obj7)) {
                                    bVar.b(j26);
                                } else {
                                    Object b19 = dVar.d().b(j26);
                                    if (b19 != null) {
                                        if (b19 instanceof androidx.collection.M) {
                                            androidx.collection.M m18 = (androidx.collection.M) b19;
                                            Object[] objArr11 = m18.f38663b;
                                            long[] jArr17 = m18.f38662a;
                                            int length8 = jArr17.length - 2;
                                            if (length8 >= 0) {
                                                int i52 = 0;
                                                while (true) {
                                                    long j27 = jArr17[i52];
                                                    if ((((~j27) << 7) & j27 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i53 = 8 - ((~(i52 - length8)) >>> 31);
                                                        for (int i54 = 0; i54 < i53; i54++) {
                                                            if ((j27 & 255) < 128) {
                                                                m11.d(objArr11[(i52 << 3) + i54]);
                                                                z11 = true;
                                                            }
                                                            j27 >>= 8;
                                                        }
                                                        if (i53 != 8) {
                                                            break;
                                                        }
                                                    }
                                                    if (i52 == length8) {
                                                        break;
                                                    }
                                                    i52++;
                                                }
                                            }
                                        } else {
                                            m11.d(b19);
                                            z11 = true;
                                        }
                                    }
                                }
                            }
                            b11 = dVar.d().b(next);
                            if (b11 != null) {
                                if (b11 instanceof androidx.collection.M) {
                                    androidx.collection.M m19 = (androidx.collection.M) b11;
                                    Object[] objArr12 = m19.f38663b;
                                    long[] jArr18 = m19.f38662a;
                                    int length9 = jArr18.length - 2;
                                    if (length9 >= 0) {
                                        while (true) {
                                            long j28 = jArr18[i11];
                                            if ((((~j28) << 7) & j28 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i55 = 8 - ((~(i11 - length9)) >>> 31);
                                                for (int i56 = 0; i56 < i55; i56++) {
                                                    if ((j28 & 255) < 128) {
                                                        m11.d(objArr12[(i11 << 3) + i56]);
                                                        z11 = true;
                                                    }
                                                    j28 >>= 8;
                                                }
                                                if (i55 != 8) {
                                                    break;
                                                }
                                            }
                                            i11 = i11 != length9 ? i11 + 1 : 0;
                                        }
                                    }
                                } else {
                                    m11.d(b11);
                                    z11 = true;
                                }
                            }
                        }
                        it = it3;
                        str = str3;
                        dVar8 = dVar9;
                        b11 = dVar.d().b(next);
                        if (b11 != null) {
                        }
                    } else {
                        it = it3;
                        str = str3;
                    }
                    it3 = it;
                    str3 = str;
                }
            }
            if (!bVar.p()) {
                return z11;
            }
            int m21 = bVar.m();
            if (m21 > 0) {
                S0.J<?>[] l11 = bVar.l();
                int i57 = 0;
                while (true) {
                    S0.J<?> j29 = l11[i57];
                    int f7 = C5721l.C().f();
                    Object b21 = dVar.d().b(j29);
                    if (b21 != null) {
                        boolean z13 = b21 instanceof androidx.collection.M;
                        androidx.collection.L<Object, androidx.collection.I<Object>> l12 = this.f56299f;
                        if (z13) {
                            androidx.collection.M m22 = (androidx.collection.M) b21;
                            Object[] objArr13 = m22.f38663b;
                            long[] jArr19 = m22.f38662a;
                            int length10 = jArr19.length - 2;
                            if (length10 >= 0) {
                                int i58 = 0;
                                while (true) {
                                    long j31 = jArr19[i58];
                                    if ((((~j31) << c11) & j31 & j11) != j11) {
                                        int i59 = 8 - ((~(i58 - length10)) >>> 31);
                                        int i61 = 0;
                                        while (i61 < i59) {
                                            if ((j31 & 255) < 128) {
                                                Object obj8 = objArr13[(i58 << 3) + i61];
                                                androidx.collection.I<Object> b22 = l12.b(obj8);
                                                jArr4 = l11;
                                                if (b22 == null) {
                                                    i14 = i57;
                                                    i15 = new androidx.collection.I<>((Object) null);
                                                    l12.i(obj8, i15);
                                                    Unit unit = Unit.f71690a;
                                                } else {
                                                    i14 = i57;
                                                    i15 = b22;
                                                }
                                                k(j29, f7, obj8, i15);
                                            } else {
                                                jArr4 = l11;
                                                i14 = i57;
                                            }
                                            j31 >>= 8;
                                            i61++;
                                            l11 = jArr4;
                                            i57 = i14;
                                        }
                                        jArr3 = l11;
                                        i13 = i57;
                                        aVar = this;
                                        if (i59 != 8) {
                                            break;
                                        }
                                    } else {
                                        jArr3 = l11;
                                        i13 = i57;
                                        aVar = this;
                                    }
                                    if (i58 == length10) {
                                        break;
                                    }
                                    i58++;
                                    l11 = jArr3;
                                    i57 = i13;
                                }
                            } else {
                                jArr3 = l11;
                                i13 = i57;
                            }
                        } else {
                            jArr3 = l11;
                            i13 = i57;
                            androidx.collection.I<Object> b23 = l12.b(b21);
                            if (b23 == null) {
                                b23 = new androidx.collection.I<>((Object) null);
                                l12.i(b21, b23);
                                Unit unit2 = Unit.f71690a;
                            }
                            k(j29, f7, b21, b23);
                        }
                    } else {
                        jArr3 = l11;
                        i13 = i57;
                    }
                    int i62 = i13 + 1;
                    if (i62 >= m21) {
                        break;
                    }
                    i57 = i62;
                    l11 = jArr3;
                }
            }
            bVar.h();
            return z11;
        }

        public final void j(@NotNull Object obj) {
            Object obj2 = this.f56295b;
            Intrinsics.f(obj2);
            int i11 = this.f56297d;
            androidx.collection.I<Object> i12 = this.f56296c;
            if (i12 == null) {
                i12 = new androidx.collection.I<>((Object) null);
                this.f56296c = i12;
                this.f56299f.i(obj2, i12);
                Unit unit = Unit.f71690a;
            }
            k(obj, i11, obj2, i12);
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m(@NotNull Function1<Object, Boolean> function1) {
            long[] jArr;
            long[] jArr2;
            long j11;
            char c11;
            long j12;
            int i11;
            long j13;
            androidx.collection.L<Object, androidx.collection.I<Object>> l11 = this.f56299f;
            long[] jArr3 = l11.f38656a;
            int length = jArr3.length - 2;
            if (length < 0) {
                return;
            }
            int i12 = 0;
            while (true) {
                long j14 = jArr3[i12];
                char c12 = 7;
                long j15 = -9187201950435737472L;
                if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8;
                    int i14 = 8 - ((~(i12 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((j14 & 255) < 128) {
                            int i16 = (i12 << 3) + i15;
                            c11 = c12;
                            Object obj = l11.f38657b[i16];
                            j12 = j15;
                            androidx.collection.I i17 = (androidx.collection.I) l11.f38658c[i16];
                            Boolean invoke = function1.invoke(obj);
                            if (invoke.booleanValue()) {
                                Object[] objArr = i17.f38640b;
                                int[] iArr = i17.f38641c;
                                long[] jArr4 = i17.f38639a;
                                int i18 = i13;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    jArr2 = jArr3;
                                    j11 = j14;
                                    int i19 = 0;
                                    while (true) {
                                        long j16 = jArr4[i19];
                                        long[] jArr5 = jArr4;
                                        if ((((~j16) << c11) & j16 & j12) != j12) {
                                            int i21 = 8 - ((~(i19 - length2)) >>> 31);
                                            for (int i22 = 0; i22 < i21; i22++) {
                                                if ((j16 & 255) < 128) {
                                                    int i23 = (i19 << 3) + i22;
                                                    j13 = j16;
                                                    Object obj2 = objArr[i23];
                                                    int i24 = iArr[i23];
                                                    l(obj, obj2);
                                                } else {
                                                    j13 = j16;
                                                }
                                                j16 = j13 >> i18;
                                            }
                                            if (i21 != i18) {
                                                break;
                                            }
                                        }
                                        if (i19 == length2) {
                                            break;
                                        }
                                        i19++;
                                        jArr4 = jArr5;
                                        i18 = 8;
                                    }
                                    if (invoke.booleanValue()) {
                                        l11.h(i16);
                                    }
                                    i11 = 8;
                                }
                            }
                            jArr2 = jArr3;
                            j11 = j14;
                            if (invoke.booleanValue()) {
                            }
                            i11 = 8;
                        } else {
                            jArr2 = jArr3;
                            j11 = j14;
                            c11 = c12;
                            j12 = j15;
                            i11 = i13;
                        }
                        i15++;
                        i13 = i11;
                        j14 = j11 >> i11;
                        c12 = c11;
                        j15 = j12;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    if (i14 != i13) {
                        return;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i12 == length) {
                    return;
                }
                i12++;
                jArr3 = jArr;
            }
        }
    }

    static final class b extends AbstractC7737t implements Function2<Set<? extends Object>, AbstractC5715f, Unit> {
        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Set<? extends Object> set, AbstractC5715f abstractC5715f) {
            y yVar = y.this;
            y.a(yVar, set);
            if (y.b(yVar)) {
                y.f(yVar);
            }
            return Unit.f71690a;
        }
    }

    static final class c extends AbstractC7737t implements Function1<Object, Unit> {
        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Object obj) {
            y.this.getClass();
            U0.b bVar = y.this.f56290f;
            y yVar = y.this;
            synchronized (bVar) {
                a aVar = yVar.f56292h;
                Intrinsics.f(aVar);
                aVar.j(obj);
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y(@NotNull Function1<? super Function0<Unit>, Unit> function1) {
        this.f56285a = (AbstractC7737t) function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(y yVar, Set set) {
        List p02;
        while (true) {
            AtomicReference<Object> atomicReference = yVar.f56286b;
            Object obj = atomicReference.get();
            if (obj == null) {
                p02 = set;
            } else if (obj instanceof Set) {
                p02 = C7714v.b0(obj, set);
            } else {
                if (!(obj instanceof List)) {
                    S0.r.k("Unexpected notification");
                    throw null;
                }
                p02 = C7714v.p0(C7714v.a0(set), (Collection) obj);
            }
            while (!atomicReference.compareAndSet(obj, p02)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
            return;
        }
    }

    public static final boolean b(y yVar) {
        boolean z11;
        Set<? extends Object> set;
        synchronized (yVar.f56290f) {
            z11 = yVar.f56287c;
        }
        if (z11) {
            return false;
        }
        boolean z12 = false;
        while (true) {
            AtomicReference<Object> atomicReference = yVar.f56286b;
            Object obj = atomicReference.get();
            Set<? extends Object> set2 = null;
            r5 = null;
            Object subList = null;
            if (obj != null) {
                if (obj instanceof Set) {
                    set = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        S0.r.k("Unexpected notification");
                        throw null;
                    }
                    List list = (List) obj;
                    set = (Set) list.get(0);
                    if (list.size() == 2) {
                        subList = list.get(1);
                    } else if (list.size() > 2) {
                        subList = list.subList(1, list.size());
                    }
                }
                Object obj2 = subList;
                while (!atomicReference.compareAndSet(obj, obj2)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                set2 = set;
            }
            if (set2 == null) {
                return z12;
            }
            synchronized (yVar.f56290f) {
                try {
                    U0.b<a> bVar = yVar.f56290f;
                    int m11 = bVar.m();
                    if (m11 > 0) {
                        a[] l11 = bVar.l();
                        int i11 = 0;
                        do {
                            if (!l11[i11].i(set2) && !z12) {
                                z12 = false;
                                i11++;
                            }
                            z12 = true;
                            i11++;
                        } while (i11 < m11);
                    }
                    Unit unit = Unit.f71690a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    public static final void f(y yVar) {
        yVar.getClass();
        yVar.f56285a.invoke(new z(yVar));
    }

    public final void h() {
        synchronized (this.f56290f) {
            try {
                U0.b<a> bVar = this.f56290f;
                int m11 = bVar.m();
                if (m11 > 0) {
                    a[] l11 = bVar.l();
                    int i11 = 0;
                    do {
                        l11[i11].c();
                        i11++;
                    } while (i11 < m11);
                }
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void i(@NotNull Object obj) {
        synchronized (this.f56290f) {
            try {
                U0.b<a> bVar = this.f56290f;
                int m11 = bVar.m();
                int i11 = 0;
                for (int i12 = 0; i12 < m11; i12++) {
                    a aVar = bVar.l()[i12];
                    aVar.d(obj);
                    if (!aVar.f()) {
                        i11++;
                    } else if (i11 > 0) {
                        bVar.l()[i12 - i11] = bVar.l()[i12];
                    }
                }
                int i13 = m11 - i11;
                C7705l.x(bVar.l(), null, i13, m11);
                bVar.y(i13);
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void j(@NotNull Function1<Object, Boolean> function1) {
        synchronized (this.f56290f) {
            try {
                U0.b<a> bVar = this.f56290f;
                int m11 = bVar.m();
                int i11 = 0;
                for (int i12 = 0; i12 < m11; i12++) {
                    a aVar = bVar.l()[i12];
                    aVar.m(function1);
                    if (!aVar.f()) {
                        i11++;
                    } else if (i11 > 0) {
                        bVar.l()[i12 - i11] = bVar.l()[i12];
                    }
                }
                int i13 = m11 - i11;
                C7705l.x(bVar.l(), null, i13, m11);
                bVar.y(i13);
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final <T> void k(@NotNull T t2, @NotNull Function1<? super T, Unit> function1, @NotNull Function0<Unit> function0) {
        a aVar;
        a aVar2;
        synchronized (this.f56290f) {
            U0.b<a> bVar = this.f56290f;
            int m11 = bVar.m();
            if (m11 > 0) {
                a[] l11 = bVar.l();
                int i11 = 0;
                do {
                    aVar = l11[i11];
                    if (aVar.e() == function1) {
                        break;
                    } else {
                        i11++;
                    }
                } while (i11 < m11);
            }
            aVar = null;
            aVar2 = aVar;
            if (aVar2 == null) {
                Intrinsics.g(function1, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
                U.g(1, function1);
                aVar2 = new a(function1);
                bVar.b(aVar2);
            }
        }
        a aVar3 = this.f56292h;
        long j11 = this.f56293i;
        if (j11 == -1 || j11 == C3942b.a()) {
            try {
                this.f56292h = aVar2;
                this.f56293i = C3942b.a();
                aVar2.h(t2, this.f56289e, function0);
                return;
            } finally {
                this.f56292h = aVar3;
                this.f56293i = j11;
            }
        }
        StringBuilder d11 = C2702w.d(j11, "Detected multithreaded access to SnapshotStateObserver: previousThreadId=", "), currentThread={id=");
        d11.append(C3942b.a());
        d11.append(", name=");
        d11.append(Thread.currentThread().getName());
        d11.append("}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
        B0.a(d11.toString());
        throw null;
    }

    public final void l() {
        List list;
        Function2<Set<? extends Object>, AbstractC5715f, Unit> function2 = this.f56288d;
        C5721l.y(C5721l.f56250a);
        synchronized (C5721l.D()) {
            list = C5721l.f56257h;
            C5721l.f56257h = C7714v.q0(function2, list);
            Unit unit = Unit.f71690a;
        }
        this.f56291g = new VL.b((Function2) function2);
    }

    public final void m() {
        VL.b bVar = this.f56291g;
        if (bVar != null) {
            bVar.a();
        }
    }
}
