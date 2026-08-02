package S0;

import c1.AbstractC5705I;
import c1.AbstractC5706J;
import c1.AbstractC5715f;
import c1.C5721l;
import c1.InterfaceC5704H;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class I<T> extends AbstractC5705I implements J<T> {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function0<T> f25215b;

    /* renamed from: c, reason: collision with root package name */
    private final l1<T> f25216c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private a<T> f25217d = new a<>();

    public static final class a<T> extends AbstractC5706J {

        /* renamed from: h, reason: collision with root package name */
        @NotNull
        private static final Object f25218h = new Object();

        /* renamed from: c, reason: collision with root package name */
        private int f25219c;

        /* renamed from: d, reason: collision with root package name */
        private int f25220d;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private androidx.collection.I f25221e = androidx.collection.P.a();

        /* renamed from: f, reason: collision with root package name */
        private Object f25222f = f25218h;

        /* renamed from: g, reason: collision with root package name */
        private int f25223g;

        @Override // c1.AbstractC5706J
        public final void a(@NotNull AbstractC5706J abstractC5706J) {
            Intrinsics.g(abstractC5706J, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
            a aVar = (a) abstractC5706J;
            this.f25221e = aVar.f25221e;
            this.f25222f = aVar.f25222f;
            this.f25223g = aVar.f25223g;
        }

        @Override // c1.AbstractC5706J
        @NotNull
        public final AbstractC5706J b() {
            return new a();
        }

        public final T h() {
            return (T) this.f25222f;
        }

        @NotNull
        public final androidx.collection.O<InterfaceC5704H> i() {
            return this.f25221e;
        }

        public final Object j() {
            return this.f25222f;
        }

        public final boolean k(@NotNull J<?> j11, @NotNull AbstractC5715f abstractC5715f) {
            boolean z11;
            boolean z12;
            synchronized (C5721l.D()) {
                z11 = true;
                if (this.f25219c == abstractC5715f.f()) {
                    if (this.f25220d == abstractC5715f.j()) {
                        z12 = false;
                    }
                }
                z12 = true;
            }
            if (this.f25222f == f25218h || (z12 && this.f25223g != l(j11, abstractC5715f))) {
                z11 = false;
            }
            if (!z11 || !z12) {
                return z11;
            }
            synchronized (C5721l.D()) {
                this.f25219c = abstractC5715f.f();
                this.f25220d = abstractC5715f.j();
                Unit unit = Unit.f71690a;
            }
            return z11;
        }

        public final int l(@NotNull J<?> j11, @NotNull AbstractC5715f abstractC5715f) {
            androidx.collection.I i11;
            int i12;
            int i13;
            int i14;
            synchronized (C5721l.D()) {
                i11 = this.f25221e;
            }
            int i15 = 7;
            if (i11.f38643e == 0) {
                return 7;
            }
            U0.b<K> b11 = o1.b();
            int m11 = b11.m();
            if (m11 > 0) {
                K[] l11 = b11.l();
                int i16 = 0;
                do {
                    l11[i16].start();
                    i16++;
                } while (i16 < m11);
            }
            try {
                Object[] objArr = i11.f38640b;
                int[] iArr = i11.f38641c;
                long[] jArr = i11.f38639a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    i12 = 7;
                    int i17 = 0;
                    while (true) {
                        long j12 = jArr[i17];
                        if ((((~j12) << i15) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i18 = 8;
                            int i19 = 8 - ((~(i17 - length)) >>> 31);
                            i13 = i15;
                            int i21 = 0;
                            while (i21 < i19) {
                                if ((j12 & 255) < 128) {
                                    int i22 = (i17 << 3) + i21;
                                    Object obj = objArr[i22];
                                    int i23 = iArr[i22];
                                    i14 = i18;
                                    InterfaceC5704H interfaceC5704H = (InterfaceC5704H) obj;
                                    if (i23 == 1) {
                                        AbstractC5706J y11 = interfaceC5704H instanceof I ? ((I) interfaceC5704H).y(abstractC5715f) : C5721l.B(interfaceC5704H.k(), abstractC5715f);
                                        i12 = (((i12 * 31) + System.identityHashCode(y11)) * 31) + y11.d();
                                    }
                                } else {
                                    i14 = i18;
                                }
                                j12 >>= i14;
                                i21++;
                                i18 = i14;
                            }
                            if (i19 != i18) {
                                break;
                            }
                        } else {
                            i13 = i15;
                        }
                        if (i17 == length) {
                            i15 = i12;
                            break;
                        }
                        i17++;
                        i15 = i13;
                    }
                }
                i12 = i15;
                Unit unit = Unit.f71690a;
                int m12 = b11.m();
                if (m12 > 0) {
                    K[] l12 = b11.l();
                    int i24 = 0;
                    do {
                        l12[i24].a();
                        i24++;
                    } while (i24 < m12);
                }
                return i12;
            } catch (Throwable th2) {
                int m13 = b11.m();
                if (m13 > 0) {
                    K[] l13 = b11.l();
                    int i25 = 0;
                    do {
                        l13[i25].a();
                        i25++;
                    } while (i25 < m13);
                }
                throw th2;
            }
        }

        public final void m(@NotNull androidx.collection.I i11) {
            this.f25221e = i11;
        }

        public final void n(Object obj) {
            this.f25222f = obj;
        }

        public final void o(int i11) {
            this.f25223g = i11;
        }

        public final void p(int i11) {
            this.f25219c = i11;
        }

        public final void q(int i11) {
            this.f25220d = i11;
        }
    }

    static final class b extends AbstractC7737t implements Function1<Object, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ I<T> f25224b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ a1.d f25225c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.collection.I<InterfaceC5704H> f25226d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f25227e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(I<T> i11, a1.d dVar, androidx.collection.I<InterfaceC5704H> i12, int i13) {
            super(1);
            this.f25224b = i11;
            this.f25225c = dVar;
            this.f25226d = i12;
            this.f25227e = i13;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Object obj) {
            if (obj == this.f25224b) {
                throw new IllegalStateException("A derived state calculation cannot read itself");
            }
            if (obj instanceof InterfaceC5704H) {
                int a11 = this.f25225c.a() - this.f25227e;
                androidx.collection.I<InterfaceC5704H> i11 = this.f25226d;
                int a12 = i11.a(obj);
                i11.h(Math.min(a11, a12 >= 0 ? i11.f38641c[a12] : Integer.MAX_VALUE), obj);
            }
            return Unit.f71690a;
        }
    }

    public I(l1 l1Var, @NotNull Function0 function0) {
        this.f25215b = function0;
        this.f25216c = l1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final a<T> z(a<T> aVar, AbstractC5715f abstractC5715f, boolean z11, Function0<? extends T> function0) {
        v1 v1Var;
        int i11;
        v1 v1Var2;
        l1<T> l1Var;
        v1 v1Var3;
        v1 v1Var4;
        boolean z12;
        int i12;
        v1 v1Var5;
        a<T> aVar2 = aVar;
        boolean z13 = true;
        if (!aVar2.k(this, abstractC5715f)) {
            androidx.collection.I i13 = new androidx.collection.I((Object) null);
            v1Var = o1.f25496a;
            a1.d dVar = (a1.d) v1Var.a();
            if (dVar == null) {
                i11 = 0;
                dVar = new a1.d(0);
                v1Var3 = o1.f25496a;
                v1Var3.b(dVar);
            } else {
                i11 = 0;
            }
            int a11 = dVar.a();
            U0.b<K> b11 = o1.b();
            int m11 = b11.m();
            if (m11 > 0) {
                K[] l11 = b11.l();
                int i14 = i11;
                do {
                    l11[i14].start();
                    i14++;
                } while (i14 < m11);
            }
            try {
                dVar.b(a11 + 1);
                Object c11 = AbstractC5715f.a.c(function0, new b(this, dVar, i13, a11));
                dVar.b(a11);
                int m12 = b11.m();
                if (m12 > 0) {
                    K[] l12 = b11.l();
                    do {
                        l12[i11].a();
                        i11++;
                    } while (i11 < m12);
                }
                synchronized (C5721l.D()) {
                    try {
                        AbstractC5715f C11 = C5721l.C();
                        if (aVar2.j() == a.f25218h || (l1Var = this.f25216c) == 0 || !l1Var.a(c11, aVar2.j())) {
                            aVar2 = (a) C5721l.G(this.f25217d, this, C11);
                            aVar2.m(i13);
                            aVar2.o(aVar2.l(this, C11));
                            aVar2.n(c11);
                        } else {
                            aVar2.m(i13);
                            aVar2.o(aVar2.l(this, C11));
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                v1Var2 = o1.f25496a;
                a1.d dVar2 = (a1.d) v1Var2.a();
                if (dVar2 == null || dVar2.a() != 0) {
                    return aVar2;
                }
                C5721l.C().o();
                synchronized (C5721l.D()) {
                    AbstractC5715f C12 = C5721l.C();
                    aVar2.p(C12.f());
                    aVar2.q(C12.j());
                    Unit unit = Unit.f71690a;
                }
                return aVar2;
            } catch (Throwable th3) {
                int m13 = b11.m();
                if (m13 > 0) {
                    K[] l13 = b11.l();
                    int i15 = i11;
                    do {
                        l13[i15].a();
                        i15++;
                    } while (i15 < m13);
                }
                throw th3;
            }
        }
        if (z11) {
            U0.b<K> b12 = o1.b();
            int m14 = b12.m();
            if (m14 > 0) {
                K[] l14 = b12.l();
                int i16 = 0;
                do {
                    l14[i16].start();
                    i16++;
                } while (i16 < m14);
            }
            try {
                androidx.collection.O<InterfaceC5704H> i17 = aVar2.i();
                v1Var4 = o1.f25496a;
                a1.d dVar3 = (a1.d) v1Var4.a();
                if (dVar3 == null) {
                    dVar3 = new a1.d(0);
                    v1Var5 = o1.f25496a;
                    v1Var5.b(dVar3);
                }
                int a12 = dVar3.a();
                Object[] objArr = i17.f38640b;
                int[] iArr = i17.f38641c;
                long[] jArr = i17.f38639a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i18 = 0;
                    while (true) {
                        long j11 = jArr[i18];
                        boolean z14 = z13;
                        if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i19 = 8;
                            int i21 = 8 - ((~(i18 - length)) >>> 31);
                            z12 = z14;
                            int i22 = 0;
                            while (i22 < i21) {
                                if ((j11 & 255) < 128) {
                                    int i23 = (i18 << 3) + i22;
                                    try {
                                        i12 = i19;
                                        InterfaceC5704H interfaceC5704H = (InterfaceC5704H) objArr[i23];
                                        dVar3.b(a12 + iArr[i23]);
                                        Function1<Object, Unit> h11 = abstractC5715f.h();
                                        if (h11 != null) {
                                            h11.invoke(interfaceC5704H);
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        int m15 = b12.m();
                                        if (m15 > 0) {
                                            K[] l15 = b12.l();
                                            int i24 = 0;
                                            do {
                                                l15[i24].a();
                                                i24++;
                                            } while (i24 < m15);
                                        }
                                        throw th;
                                    }
                                } else {
                                    i12 = i19;
                                }
                                j11 >>= i12;
                                i22++;
                                i19 = i12;
                            }
                            if (i21 != i19) {
                                break;
                            }
                        } else {
                            z12 = z14;
                        }
                        if (i18 == length) {
                            break;
                        }
                        i18++;
                        z13 = z12;
                    }
                }
                dVar3.b(a12);
                Unit unit2 = Unit.f71690a;
                int m16 = b12.m();
                if (m16 > 0) {
                    K[] l16 = b12.l();
                    int i25 = 0;
                    do {
                        l16[i25].a();
                        i25++;
                    } while (i25 < m16);
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
        return aVar2;
    }

    @Override // S0.J
    public final l1<T> a() {
        return this.f25216c;
    }

    @Override // c1.InterfaceC5704H
    public final void b(@NotNull AbstractC5706J abstractC5706J) {
        this.f25217d = (a) abstractC5706J;
    }

    @Override // S0.A1
    public final T getValue() {
        Function1<Object, Unit> h11 = C5721l.C().h();
        if (h11 != null) {
            h11.invoke(this);
        }
        AbstractC5715f C11 = C5721l.C();
        return (T) z((a) C5721l.B(this.f25217d, C11), C11, true, this.f25215b).j();
    }

    @Override // c1.InterfaceC5704H
    @NotNull
    public final AbstractC5706J k() {
        return this.f25217d;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DerivedState(value=");
        a aVar = (a) C5721l.A(this.f25217d);
        sb2.append(aVar.k(this, C5721l.C()) ? String.valueOf(aVar.j()) : "<Not calculated>");
        sb2.append(")@");
        sb2.append(hashCode());
        return sb2.toString();
    }

    @Override // S0.J
    @NotNull
    public final a u() {
        AbstractC5715f C11 = C5721l.C();
        return z((a) C5721l.B(this.f25217d, C11), C11, false, this.f25215b);
    }

    @NotNull
    public final a y(@NotNull AbstractC5715f abstractC5715f) {
        return z((a) C5721l.B(this.f25217d, abstractC5715f), abstractC5715f, false, this.f25215b);
    }
}
