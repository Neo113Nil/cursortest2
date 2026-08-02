package Ae;

import Be.AbstractC2635g;
import Be.C2629a;
import Be.w;
import De.C2862e;
import androidx.recyclerview.widget.LinearLayoutManager;
import fd.InterfaceC6511n;
import fd.InterfaceC6512o;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;
import ze.C11115c;
import ze.EnumC11113a;

/* renamed from: Ae.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2399j {
    @NotNull
    public static final <T> InterfaceC2395h<T> A(@NotNull Function2<? super InterfaceC2397i<? super T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        return new A0(function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> InterfaceC2395h<T> B(@NotNull InterfaceC2395h<? extends T> interfaceC2395h, @NotNull CoroutineContext coroutineContext) {
        if (coroutineContext.get(xe.B0.f105374o0) == null) {
            return coroutineContext.equals(kotlin.coroutines.g.f71771a) ? interfaceC2395h : interfaceC2395h instanceof Be.w ? w.a.a((Be.w) interfaceC2395h, coroutineContext, 0, null, 6) : new Be.l(interfaceC2395h, coroutineContext, 0, null, 12);
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + coroutineContext).toString());
    }

    @NotNull
    public static final <T> xe.B0 C(@NotNull InterfaceC2395h<? extends T> interfaceC2395h, @NotNull xe.M m11) {
        return C10727i.c(m11, null, null, new C2409o(interfaceC2395h, null), 3);
    }

    @NotNull
    public static final Be.m D(@NotNull InterfaceC2395h interfaceC2395h, @NotNull Function2 function2) {
        int i11 = Z.f942b;
        return Q(interfaceC2395h, new Y(function2, null));
    }

    @NotNull
    public static final Be.n E(@NotNull Iterable iterable) {
        int i11 = Z.f942b;
        return new Be.n(iterable, kotlin.coroutines.g.f71771a, -2, EnumC11113a.SUSPEND);
    }

    @NotNull
    public static final Be.n F(@NotNull InterfaceC2395h... interfaceC2395hArr) {
        int i11 = Z.f942b;
        return E(C7705l.d(interfaceC2395hArr));
    }

    @NotNull
    public static final <T> B0<T> G(@NotNull B0<? extends T> b02, @NotNull Function2<? super InterfaceC2397i<? super T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        return new S0(b02, function2);
    }

    @NotNull
    public static final <T> InterfaceC2395h<T> H(@NotNull ze.w<? extends T> wVar) {
        return new C2387d(wVar, false);
    }

    public static G I(Be.u uVar, Function2 function2) {
        return new G(uVar, new F(function2, null));
    }

    @NotNull
    public static final Be.u J(@NotNull InterfaceC2395h interfaceC2395h, long j11) {
        if (j11 > 0) {
            return new Be.u(new C2416s(j11, interfaceC2395h, null));
        }
        throw new IllegalArgumentException("Sample period should be positive");
    }

    @NotNull
    public static final <T> B0<T> K(@NotNull InterfaceC2395h<? extends T> interfaceC2395h, @NotNull xe.M m11, @NotNull I0 i02, int i11) {
        return C2402k0.b(interfaceC2395h, m11, i02, i11);
    }

    public static B0 L(zf0.g gVar, C2862e c2862e, I0 i02) {
        return C2402k0.b(gVar, c2862e, i02, 0);
    }

    @NotNull
    public static final <T> M0<T> M(@NotNull InterfaceC2395h<? extends T> interfaceC2395h, @NotNull xe.M m11, @NotNull I0 i02, T t2) {
        return C2402k0.c(interfaceC2395h, m11, i02, t2);
    }

    public static final Object N(@NotNull InterfaceC2395h interfaceC2395h, @NotNull xe.M m11, @NotNull kotlin.coroutines.jvm.internal.j jVar) {
        return C2402k0.d(interfaceC2395h, m11, jVar);
    }

    @NotNull
    public static final N O(@NotNull InterfaceC2395h interfaceC2395h, int i11) {
        if (i11 > 0) {
            return new N(interfaceC2395h, i11);
        }
        throw new IllegalArgumentException(T7.E.a(i11, "Requested element count ", " should be positive").toString());
    }

    @NotNull
    public static final Be.u P(@NotNull InterfaceC2395h interfaceC2395h, long j11) {
        return new Be.u(new C2418t(j11, interfaceC2395h, null));
    }

    @NotNull
    public static final Be.m Q(@NotNull InterfaceC2395h interfaceC2395h, @NotNull InterfaceC6511n interfaceC6511n) {
        int i11 = Z.f942b;
        return new Be.m(interfaceC6511n, interfaceC2395h, kotlin.coroutines.g.f71771a, -2, EnumC11113a.SUSPEND);
    }

    @NotNull
    public static final <T, R> InterfaceC2395h<R> R(@NotNull InterfaceC2395h<? extends T> interfaceC2395h, @NotNull InterfaceC6511n<? super InterfaceC2397i<? super R>, ? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> interfaceC6511n) {
        return new A0(new S(interfaceC2395h, interfaceC6511n, null));
    }

    @NotNull
    public static final <T> B0<T> a(@NotNull w0<T> w0Var) {
        return new y0(w0Var, null);
    }

    @NotNull
    public static final <T> M0<T> b(@NotNull x0<T> x0Var) {
        return new z0(x0Var, null);
    }

    @NotNull
    public static final <T> InterfaceC2395h<T> c(@NotNull InterfaceC2395h<? extends T> interfaceC2395h, int i11, @NotNull EnumC11113a enumC11113a) {
        if (i11 < 0 && i11 != -2 && i11 != -1) {
            throw new IllegalArgumentException(Ej.b.a(i11, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ").toString());
        }
        if (i11 == -1 && enumC11113a != EnumC11113a.SUSPEND) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i11 == -1) {
            enumC11113a = EnumC11113a.DROP_OLDEST;
            i11 = 0;
        }
        int i12 = i11;
        EnumC11113a enumC11113a2 = enumC11113a;
        return interfaceC2395h instanceof Be.w ? w.a.a((Be.w) interfaceC2395h, null, i12, enumC11113a2, 1) : new Be.l(interfaceC2395h, null, i12, enumC11113a2, 2);
    }

    public static /* synthetic */ InterfaceC2395h d(InterfaceC2395h interfaceC2395h, int i11, int i12) {
        if ((i12 & 1) != 0) {
            i11 = -2;
        }
        return c(interfaceC2395h, i11, EnumC11113a.SUSPEND);
    }

    @NotNull
    public static final <T> InterfaceC2395h<T> e(@NotNull Function2<? super ze.u<? super T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        return new C2383b(function2, kotlin.coroutines.g.f71771a, -2, EnumC11113a.SUSPEND);
    }

    @NotNull
    public static final <T> InterfaceC2395h<T> f(@NotNull Function2<? super ze.u<? super T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        return new C2389e(function2, kotlin.coroutines.g.f71771a, -2, EnumC11113a.SUSPEND);
    }

    public static final Object g(@NotNull InterfaceC2395h<?> interfaceC2395h, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object collect = interfaceC2395h.collect(Be.y.f3695a, dVar);
        return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
    }

    public static final <T> Object h(@NotNull InterfaceC2395h<? extends T> interfaceC2395h, @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object g10 = g(d(D(interfaceC2395h, function2), 0, 2), dVar);
        return g10 == Wc.a.COROUTINE_SUSPENDED ? g10 : Unit.f71690a;
    }

    @NotNull
    public static final C2414q0 i(@NotNull InterfaceC2395h interfaceC2395h, @NotNull InterfaceC2395h interfaceC2395h2, @NotNull InterfaceC2395h interfaceC2395h3, @NotNull InterfaceC6512o interfaceC6512o) {
        return new C2414q0(new InterfaceC2395h[]{interfaceC2395h, interfaceC2395h2, interfaceC2395h3}, interfaceC6512o);
    }

    @NotNull
    public static final <T1, T2, R> InterfaceC2395h<R> j(@NotNull InterfaceC2395h<? extends T1> interfaceC2395h, @NotNull InterfaceC2395h<? extends T2> interfaceC2395h2, @NotNull InterfaceC6512o<? super InterfaceC2397i<? super R>, ? super T1, ? super T2, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> interfaceC6512o) {
        return new A0(new u0(new InterfaceC2395h[]{interfaceC2395h, interfaceC2395h2}, null, interfaceC6512o));
    }

    @NotNull
    public static final InterfaceC2395h k(@NotNull C11115c c11115c) {
        return new C2387d(c11115c, true);
    }

    @NotNull
    public static final <T> InterfaceC2395h<T> l(@NotNull InterfaceC2395h<? extends T> interfaceC2395h, long j11) {
        return C2420u.a(interfaceC2395h, j11);
    }

    @NotNull
    public static final Be.u m(@NotNull B0 b02, @NotNull Function1 function1) {
        return new Be.u(new C2413q(function1, b02, null));
    }

    @NotNull
    public static final <T> InterfaceC2395h<T> n(@NotNull InterfaceC2395h<? extends T> interfaceC2395h, long j11) {
        return C2420u.a(interfaceC2395h, xe.Y.e(j11));
    }

    @NotNull
    public static final <T> InterfaceC2395h<T> o(@NotNull InterfaceC2395h<? extends T> interfaceC2395h) {
        return C2423x.a(interfaceC2395h);
    }

    @NotNull
    public static final <T> InterfaceC2395h<T> p(@NotNull InterfaceC2395h<? extends T> interfaceC2395h, @NotNull Function2<? super T, ? super T, Boolean> function2) {
        return C2423x.b(interfaceC2395h, function2);
    }

    @NotNull
    public static final <T, K> InterfaceC2395h<T> q(@NotNull InterfaceC2395h<? extends T> interfaceC2395h, @NotNull Function1<? super T, ? extends K> function1) {
        return C2423x.c(interfaceC2395h, function1);
    }

    public static final <T> Object r(@NotNull InterfaceC2397i<? super T> interfaceC2397i, @NotNull InterfaceC2395h<? extends T> interfaceC2395h, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        if (interfaceC2397i instanceof T0) {
            throw ((T0) interfaceC2397i).f915a;
        }
        Object collect = interfaceC2395h.collect(interfaceC2397i, dVar);
        return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
    }

    public static final Object s(@NotNull InterfaceC2397i interfaceC2397i, @NotNull ze.w wVar, @NotNull kotlin.coroutines.jvm.internal.j jVar) {
        return C2407n.b(interfaceC2397i, wVar, jVar);
    }

    @NotNull
    public static final <T> InterfaceC2395h<T> t() {
        return C2393g.f990a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object u(@NotNull InterfaceC2395h<? extends T> interfaceC2395h, @NotNull kotlin.coroutines.d<? super T> dVar) {
        C2386c0 c2386c0;
        int i11;
        T t2;
        kotlin.jvm.internal.M m11;
        C2629a e11;
        C2382a0 c2382a0;
        T t11;
        if (dVar instanceof C2386c0) {
            c2386c0 = (C2386c0) dVar;
            int i12 = c2386c0.f963g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c2386c0.f963g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c2386c0.f962f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c2386c0.f963g;
                t2 = (T) Be.z.f3696a;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    kotlin.jvm.internal.M m12 = new kotlin.jvm.internal.M();
                    m12.f71787a = t2;
                    C2382a0 c2382a02 = new C2382a0(m12);
                    try {
                        c2386c0.f960d = m12;
                        c2386c0.f961e = c2382a02;
                        c2386c0.f963g = 1;
                        if (interfaceC2395h.collect(c2382a02, c2386c0) == aVar) {
                            return aVar;
                        }
                        m11 = m12;
                    } catch (C2629a e12) {
                        m11 = m12;
                        e11 = e12;
                        c2382a0 = c2382a02;
                        if (e11.f3566a != c2382a0) {
                            throw e11;
                        }
                        t11 = m11.f71787a;
                        if (t11 == t2) {
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c2382a0 = c2386c0.f961e;
                    m11 = c2386c0.f960d;
                    try {
                        Sc.s.b(obj);
                    } catch (C2629a e13) {
                        e11 = e13;
                        if (e11.f3566a != c2382a0) {
                        }
                        t11 = m11.f71787a;
                        if (t11 == t2) {
                        }
                    }
                }
                t11 = m11.f71787a;
                if (t11 == t2) {
                    return t11;
                }
                throw new NoSuchElementException("Expected at least one element");
            }
        }
        c2386c0 = new C2386c0(dVar);
        Object obj2 = c2386c0.f962f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c2386c0.f963g;
        t2 = (T) Be.z.f3696a;
        if (i11 != 0) {
        }
        t11 = m11.f71787a;
        if (t11 == t2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object v(@NotNull InterfaceC2395h<? extends T> interfaceC2395h, @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super T> dVar) {
        C2388d0 c2388d0;
        int i11;
        T t2;
        Function2<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> function22;
        kotlin.jvm.internal.M m11;
        C2629a e11;
        C2384b0 c2384b0;
        T t11;
        if (dVar instanceof C2388d0) {
            c2388d0 = (C2388d0) dVar;
            int i12 = c2388d0.f971h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c2388d0.f971h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c2388d0.f970g;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c2388d0.f971h;
                t2 = (T) Be.z.f3696a;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    kotlin.jvm.internal.M m12 = new kotlin.jvm.internal.M();
                    m12.f71787a = t2;
                    C2384b0 c2384b02 = new C2384b0(function2, m12);
                    try {
                        c2388d0.f967d = function2;
                        c2388d0.f968e = m12;
                        c2388d0.f969f = c2384b02;
                        c2388d0.f971h = 1;
                        if (interfaceC2395h.collect(c2384b02, c2388d0) == aVar) {
                            return aVar;
                        }
                        function22 = function2;
                        m11 = m12;
                    } catch (C2629a e12) {
                        function22 = function2;
                        m11 = m12;
                        e11 = e12;
                        c2384b0 = c2384b02;
                        if (e11.f3566a != c2384b0) {
                            throw e11;
                        }
                        t11 = m11.f71787a;
                        if (t11 == t2) {
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c2384b0 = c2388d0.f969f;
                    m11 = c2388d0.f968e;
                    function22 = c2388d0.f967d;
                    try {
                        Sc.s.b(obj);
                    } catch (C2629a e13) {
                        e11 = e13;
                        if (e11.f3566a != c2384b0) {
                        }
                        t11 = m11.f71787a;
                        if (t11 == t2) {
                        }
                    }
                }
                t11 = m11.f71787a;
                if (t11 == t2) {
                    return t11;
                }
                throw new NoSuchElementException("Expected at least one element matching the predicate " + function22);
            }
        }
        c2388d0 = new C2388d0(dVar);
        Object obj2 = c2388d0.f970g;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c2388d0.f971h;
        t2 = (T) Be.z.f3696a;
        if (i11 != 0) {
        }
        t11 = m11.f71787a;
        if (t11 == t2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object w(@NotNull InterfaceC2395h<? extends T> interfaceC2395h, @NotNull kotlin.coroutines.d<? super T> dVar) {
        C2394g0 c2394g0;
        int i11;
        kotlin.jvm.internal.M m11;
        C2629a e11;
        C2390e0 c2390e0;
        if (dVar instanceof C2394g0) {
            c2394g0 = (C2394g0) dVar;
            int i12 = c2394g0.f994g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c2394g0.f994g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c2394g0.f993f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c2394g0.f994g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    kotlin.jvm.internal.M m12 = new kotlin.jvm.internal.M();
                    C2390e0 c2390e02 = new C2390e0(m12);
                    try {
                        c2394g0.f991d = m12;
                        c2394g0.f992e = c2390e02;
                        c2394g0.f994g = 1;
                        if (interfaceC2395h.collect(c2390e02, c2394g0) == aVar) {
                            return aVar;
                        }
                        m11 = m12;
                    } catch (C2629a e12) {
                        m11 = m12;
                        e11 = e12;
                        c2390e0 = c2390e02;
                        if (e11.f3566a != c2390e0) {
                        }
                        return m11.f71787a;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c2390e0 = c2394g0.f992e;
                    m11 = c2394g0.f991d;
                    try {
                        Sc.s.b(obj);
                    } catch (C2629a e13) {
                        e11 = e13;
                        if (e11.f3566a != c2390e0) {
                            throw e11;
                        }
                        return m11.f71787a;
                    }
                }
                return m11.f71787a;
            }
        }
        c2394g0 = new C2394g0(dVar);
        Object obj2 = c2394g0.f993f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c2394g0.f994g;
        if (i11 != 0) {
        }
        return m11.f71787a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object x(@NotNull InterfaceC2395h interfaceC2395h, @NotNull Function2 function2, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C2396h0 c2396h0;
        int i11;
        kotlin.jvm.internal.M m11;
        C2629a e11;
        C2392f0 c2392f0;
        if (cVar instanceof C2396h0) {
            c2396h0 = (C2396h0) cVar;
            int i12 = c2396h0.f998g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c2396h0.f998g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c2396h0.f997f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c2396h0.f998g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    kotlin.jvm.internal.M m12 = new kotlin.jvm.internal.M();
                    C2392f0 c2392f02 = new C2392f0(function2, m12);
                    try {
                        c2396h0.f995d = m12;
                        c2396h0.f996e = c2392f02;
                        c2396h0.f998g = 1;
                        if (((AbstractC2635g) interfaceC2395h).collect(c2392f02, c2396h0) == aVar) {
                            return aVar;
                        }
                        m11 = m12;
                    } catch (C2629a e12) {
                        m11 = m12;
                        e11 = e12;
                        c2392f0 = c2392f02;
                        if (e11.f3566a != c2392f0) {
                            throw e11;
                        }
                        return m11.f71787a;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c2392f0 = c2396h0.f996e;
                    m11 = c2396h0.f995d;
                    try {
                        Sc.s.b(obj);
                    } catch (C2629a e13) {
                        e11 = e13;
                        if (e11.f3566a != c2392f0) {
                        }
                        return m11.f71787a;
                    }
                }
                return m11.f71787a;
            }
        }
        c2396h0 = new C2396h0(cVar);
        Object obj2 = c2396h0.f997f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c2396h0.f998g;
        if (i11 != 0) {
        }
        return m11.f71787a;
    }

    @NotNull
    public static final W y(@NotNull InterfaceC2395h interfaceC2395h, @NotNull Function2 function2) {
        int i11 = Z.f942b;
        return new W(new U(interfaceC2395h, function2));
    }
}
