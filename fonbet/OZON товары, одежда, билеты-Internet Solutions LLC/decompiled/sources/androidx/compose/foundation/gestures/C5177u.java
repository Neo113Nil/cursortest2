package androidx.compose.foundation.gestures;

import androidx.compose.ui.platform.c2;
import androidx.recyclerview.widget.LinearLayoutManager;
import fd.InterfaceC6511n;
import java.util.List;
import k1.C7459e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;
import r0.C9140t;
import r0.EnumC9142v;
import x1.C10638m;
import x1.C10639n;
import x1.C10641p;
import x1.EnumC10640o;
import x1.InterfaceC10628c;

/* renamed from: androidx.compose.foundation.gestures.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5177u {

    /* renamed from: a, reason: collision with root package name */
    private static final float f39245a = ((float) 0.125d) / 18;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f39246b = 0;

    /* renamed from: androidx.compose.foundation.gestures.u$a */
    /* loaded from: classes8.dex */
    static final class a extends AbstractC7737t implements InterfaceC6511n<x1.x, x1.x, C7459e, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC7737t f39247b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super C7459e, Unit> function1) {
            super(3);
            this.f39247b = (AbstractC7737t) function1;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
        @Override // fd.InterfaceC6511n
        public final Unit invoke(x1.x xVar, x1.x xVar2, C7459e c7459e) {
            c7459e.getClass();
            this.f39247b.invoke(C7459e.a(xVar2.f()));
            return Unit.f71690a;
        }
    }

    /* renamed from: androidx.compose.foundation.gestures.u$b */
    /* loaded from: classes8.dex */
    static final class b extends AbstractC7737t implements Function1<x1.x, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC7737t f39248b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function0<Unit> function0) {
            super(1);
            this.f39248b = (AbstractC7737t) function0;
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(x1.x xVar) {
            this.f39248b.invoke();
            return Unit.f71690a;
        }
    }

    /* renamed from: androidx.compose.foundation.gestures.u$c */
    /* loaded from: classes8.dex */
    static final class c extends AbstractC7737t implements Function0<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f39249b = new c(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c7, code lost:
    
        if (x1.C10639n.j(r11) != false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0064 -> B:10:0x0069). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(@NotNull InterfaceC10628c interfaceC10628c, long j11, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C5173p c5173p;
        int i11;
        kotlin.jvm.internal.L l11;
        InterfaceC10628c interfaceC10628c2;
        Object i02;
        x1.x xVar;
        x1.x xVar2;
        if (cVar instanceof C5173p) {
            c5173p = (C5173p) cVar;
            int i12 = c5173p.f39218g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c5173p.f39218g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c5173p.f39217f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c5173p.f39218g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    if (!k(interfaceC10628c.b1(), j11)) {
                        l11 = new kotlin.jvm.internal.L();
                        l11.f71786a = j11;
                        interfaceC10628c2 = interfaceC10628c;
                        c5173p.f39215d = interfaceC10628c2;
                        c5173p.f39216e = l11;
                        c5173p.f39218g = 1;
                        i02 = interfaceC10628c2.i0(EnumC10640o.Main, c5173p);
                        if (i02 != aVar) {
                        }
                    }
                    return null;
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.jvm.internal.L l12 = c5173p.f39216e;
                InterfaceC10628c interfaceC10628c3 = c5173p.f39215d;
                Sc.s.b(obj);
                kotlin.jvm.internal.L l13 = l12;
                interfaceC10628c2 = interfaceC10628c3;
                C10638m c10638m = (C10638m) obj;
                List<x1.x> b11 = c10638m.b();
                int size = b11.size();
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    if (i14 < size) {
                        xVar = null;
                        break;
                    }
                    xVar = b11.get(i14);
                    if (x1.w.c(xVar.d(), l13.f71786a)) {
                        break;
                    }
                    i14++;
                }
                x1.x xVar3 = xVar;
                if (xVar3 == null) {
                    if (C10639n.c(xVar3)) {
                        List<x1.x> b12 = c10638m.b();
                        int size2 = b12.size();
                        while (true) {
                            if (i13 >= size2) {
                                xVar2 = null;
                                break;
                            }
                            xVar2 = b12.get(i13);
                            if (xVar2.g()) {
                                break;
                            }
                            i13++;
                        }
                        x1.x xVar4 = xVar2;
                        if (xVar4 != null) {
                            l13.f71786a = xVar4.d();
                            l11 = l13;
                            c5173p.f39215d = interfaceC10628c2;
                            c5173p.f39216e = l11;
                            c5173p.f39218g = 1;
                            i02 = interfaceC10628c2.i0(EnumC10640o.Main, c5173p);
                            if (i02 != aVar) {
                                return aVar;
                            }
                            kotlin.jvm.internal.L l14 = l11;
                            obj = i02;
                            l13 = l14;
                        }
                    }
                    C10638m c10638m2 = (C10638m) obj;
                    List<x1.x> b112 = c10638m2.b();
                    int size3 = b112.size();
                    int i132 = 0;
                    int i142 = 0;
                    while (true) {
                        if (i142 < size3) {
                        }
                        i142++;
                    }
                    x1.x xVar32 = xVar;
                    if (xVar32 == null) {
                        xVar32 = null;
                    }
                }
                if (xVar32 == null || xVar32.n()) {
                    return null;
                }
                return xVar32;
            }
        }
        c5173p = new C5173p(cVar);
        Object obj2 = c5173p.f39217f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c5173p.f39218g;
        if (i11 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0158 -> B:11:0x015e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(@NotNull InterfaceC10628c interfaceC10628c, long j11, int i11, @NotNull Function2 function2, @NotNull kotlin.coroutines.jvm.internal.a aVar) {
        C5174q c5174q;
        int i12;
        float l11;
        kotlin.jvm.internal.L l12;
        Function2 function22;
        U u11;
        InterfaceC10628c interfaceC10628c2;
        C5174q c5174q2;
        kotlin.jvm.internal.L l13;
        float f7;
        U u12;
        int size;
        int i13;
        x1.x xVar;
        x1.x xVar2;
        x1.x xVar3;
        int i14;
        Object i02;
        if (aVar instanceof C5174q) {
            c5174q = (C5174q) aVar;
            int i15 = c5174q.f39226k;
            if ((i15 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c5174q.f39226k = i15 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c5174q.f39225j;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i12 = c5174q.f39226k;
                int i16 = 1;
                if (i12 != 0) {
                    Sc.s.b(obj);
                    EnumC9142v enumC9142v = EnumC9142v.Horizontal;
                    if (!k(interfaceC10628c.b1(), j11)) {
                        l11 = l(interfaceC10628c.b(), i11);
                        l12 = new kotlin.jvm.internal.L();
                        l12.f71786a = j11;
                        function22 = function2;
                        u11 = new U(enumC9142v);
                        interfaceC10628c2 = interfaceC10628c;
                        c5174q.f39219d = function22;
                        c5174q.f39220e = interfaceC10628c2;
                        c5174q.f39221f = l12;
                        c5174q.f39222g = u11;
                        c5174q.f39223h = null;
                        c5174q.f39224i = l11;
                        c5174q.f39226k = i16;
                        i02 = interfaceC10628c2.i0(EnumC10640o.Main, c5174q);
                        if (i02 != aVar2) {
                        }
                        return aVar2;
                    }
                    return null;
                }
                if (i12 == 1) {
                    float f11 = c5174q.f39224i;
                    U u13 = (U) c5174q.f39222g;
                    kotlin.jvm.internal.L l14 = c5174q.f39221f;
                    InterfaceC10628c interfaceC10628c3 = c5174q.f39220e;
                    Function2 function23 = c5174q.f39219d;
                    Sc.s.b(obj);
                    f7 = f11;
                    interfaceC10628c2 = interfaceC10628c3;
                    c5174q2 = c5174q;
                    u12 = u13;
                    function22 = function23;
                    l13 = l14;
                    C5174q c5174q3 = c5174q2;
                    C10638m c10638m = (C10638m) obj;
                    List<x1.x> b11 = c10638m.b();
                    size = b11.size();
                    i13 = 0;
                    while (true) {
                        if (i13 < size) {
                        }
                        i13 = i14 + 1;
                    }
                    xVar2 = xVar;
                    if (xVar2 != null) {
                        if (C10639n.c(xVar2)) {
                        }
                        c5174q.f39219d = function22;
                        c5174q.f39220e = interfaceC10628c2;
                        c5174q.f39221f = l12;
                        c5174q.f39222g = u11;
                        c5174q.f39223h = null;
                        c5174q.f39224i = l11;
                        c5174q.f39226k = i16;
                        i02 = interfaceC10628c2.i0(EnumC10640o.Main, c5174q);
                        if (i02 != aVar2) {
                        }
                        return aVar2;
                    }
                    return null;
                }
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                float f12 = c5174q.f39224i;
                x1.x xVar4 = c5174q.f39223h;
                U u14 = (U) c5174q.f39222g;
                l12 = c5174q.f39221f;
                InterfaceC10628c interfaceC10628c4 = c5174q.f39220e;
                Function2 function24 = c5174q.f39219d;
                Sc.s.b(obj);
                u11 = u14;
                l11 = f12;
                interfaceC10628c2 = interfaceC10628c4;
                if (!xVar4.n()) {
                    function22 = function24;
                    i16 = 1;
                    c5174q.f39219d = function22;
                    c5174q.f39220e = interfaceC10628c2;
                    c5174q.f39221f = l12;
                    c5174q.f39222g = u11;
                    c5174q.f39223h = null;
                    c5174q.f39224i = l11;
                    c5174q.f39226k = i16;
                    i02 = interfaceC10628c2.i0(EnumC10640o.Main, c5174q);
                    if (i02 != aVar2) {
                        c5174q2 = c5174q;
                        u12 = u11;
                        obj = i02;
                        l13 = l12;
                        f7 = l11;
                        C5174q c5174q32 = c5174q2;
                        C10638m c10638m2 = (C10638m) obj;
                        List<x1.x> b112 = c10638m2.b();
                        size = b112.size();
                        i13 = 0;
                        while (true) {
                            if (i13 < size) {
                                xVar = null;
                                break;
                            }
                            xVar = b112.get(i13);
                            i14 = i13;
                            if (x1.w.c(xVar.d(), l13.f71786a)) {
                                break;
                            }
                            i13 = i14 + 1;
                        }
                        xVar2 = xVar;
                        if (xVar2 != null && !xVar2.n()) {
                            if (C10639n.c(xVar2)) {
                                List<x1.x> b12 = c10638m2.b();
                                int size2 = b12.size();
                                int i17 = 0;
                                while (true) {
                                    if (i17 >= size2) {
                                        xVar3 = null;
                                        break;
                                    }
                                    xVar3 = b12.get(i17);
                                    if (xVar3.g()) {
                                        break;
                                    }
                                    i17++;
                                }
                                x1.x xVar5 = xVar3;
                                if (xVar5 != null) {
                                    l13.f71786a = xVar5.d();
                                    u11 = u12;
                                    c5174q = c5174q32;
                                    l11 = f7;
                                    l12 = l13;
                                    i16 = 1;
                                }
                            } else {
                                C7459e a11 = u12.a(xVar2, f7);
                                if (a11 != null) {
                                    function22.invoke(xVar2, new Float(C7459e.g(a11.n())));
                                    if (xVar2.n()) {
                                        return xVar2;
                                    }
                                    u12.b();
                                    u11 = u12;
                                    c5174q = c5174q32;
                                    l11 = f7;
                                    l12 = l13;
                                    i16 = 1;
                                } else {
                                    EnumC10640o enumC10640o = EnumC10640o.Final;
                                    c5174q32.f39219d = function22;
                                    c5174q32.f39220e = interfaceC10628c2;
                                    c5174q32.f39221f = l13;
                                    c5174q32.f39222g = u12;
                                    c5174q32.f39223h = xVar2;
                                    c5174q32.f39224i = f7;
                                    c5174q32.f39226k = 2;
                                    if (interfaceC10628c2.i0(enumC10640o, c5174q32) != aVar2) {
                                        function24 = function22;
                                        u11 = u12;
                                        c5174q = c5174q32;
                                        xVar4 = xVar2;
                                        l11 = f7;
                                        l12 = l13;
                                        if (!xVar4.n()) {
                                        }
                                    }
                                }
                            }
                            c5174q.f39219d = function22;
                            c5174q.f39220e = interfaceC10628c2;
                            c5174q.f39221f = l12;
                            c5174q.f39222g = u11;
                            c5174q.f39223h = null;
                            c5174q.f39224i = l11;
                            c5174q.f39226k = i16;
                            i02 = interfaceC10628c2.i0(EnumC10640o.Main, c5174q);
                            if (i02 != aVar2) {
                            }
                        }
                    }
                    return aVar2;
                }
                return null;
            }
        }
        c5174q = new C5174q(aVar);
        Object obj2 = c5174q.f39225j;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i12 = c5174q.f39226k;
        int i162 = 1;
        if (i12 != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r10v2, types: [T, x1.x] */
    /* JADX WARN: Type inference failed for: r10v6, types: [x1.x] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(@NotNull InterfaceC10628c interfaceC10628c, long j11, @NotNull kotlin.coroutines.jvm.internal.a aVar) {
        r rVar;
        int i11;
        x1.x xVar;
        x1.x xVar2;
        kotlin.jvm.internal.M m11;
        if (aVar instanceof r) {
            rVar = (r) aVar;
            int i12 = rVar.f39230g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                rVar.f39230g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = rVar.f39229f;
                Object obj2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = rVar.f39230g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    if (!k(interfaceC10628c.b1(), j11)) {
                        List<x1.x> b11 = interfaceC10628c.b1().b();
                        int size = b11.size();
                        int i13 = 0;
                        while (true) {
                            if (i13 >= size) {
                                xVar = null;
                                break;
                            }
                            xVar = b11.get(i13);
                            if (x1.w.c(xVar.d(), j11)) {
                                break;
                            }
                            i13++;
                        }
                        xVar2 = xVar;
                        if (xVar2 != 0) {
                            kotlin.jvm.internal.M m12 = new kotlin.jvm.internal.M();
                            kotlin.jvm.internal.M m13 = new kotlin.jvm.internal.M();
                            m13.f71787a = xVar2;
                            long e11 = interfaceC10628c.b().e();
                            try {
                                Function2 c5175s = new C5175s(m13, m12, null);
                                rVar.f39227d = xVar2;
                                rVar.f39228e = m12;
                                rVar.f39230g = 1;
                                if (interfaceC10628c.k1(e11, c5175s, rVar) == obj2) {
                                    return obj2;
                                }
                            } catch (C10641p unused) {
                                m11 = m12;
                            }
                        }
                    }
                    return null;
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                m11 = rVar.f39228e;
                xVar2 = rVar.f39227d;
                try {
                    Sc.s.b(obj);
                    return null;
                } catch (C10641p unused2) {
                }
                x1.x xVar3 = (x1.x) m11.f71787a;
                return xVar3 != null ? xVar2 : xVar3;
            }
        }
        rVar = new r(aVar);
        Object obj3 = rVar.f39229f;
        Object obj22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = rVar.f39230g;
        if (i11 != 0) {
        }
        x1.x xVar32 = (x1.x) m11.f71787a;
        if (xVar32 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0149 -> B:11:0x014f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(@NotNull InterfaceC10628c interfaceC10628c, long j11, @NotNull Function2 function2, @NotNull kotlin.coroutines.jvm.internal.a aVar) {
        C5176t c5176t;
        int i11;
        Function2 function22;
        kotlin.jvm.internal.L l11;
        C5176t c5176t2;
        float f7;
        U u11;
        InterfaceC10628c interfaceC10628c2;
        kotlin.jvm.internal.L l12;
        C5176t c5176t3;
        float f11;
        U u12;
        int size;
        int i12;
        x1.x xVar;
        x1.x xVar2;
        x1.x xVar3;
        int i13;
        Object i02;
        if (aVar instanceof C5176t) {
            c5176t = (C5176t) aVar;
            int i14 = c5176t.f39244k;
            if ((i14 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c5176t.f39244k = i14 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c5176t.f39243j;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c5176t.f39244k;
                int i15 = 1;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    if (!k(interfaceC10628c.b1(), j11)) {
                        float b11 = interfaceC10628c.b().b();
                        kotlin.jvm.internal.L l13 = new kotlin.jvm.internal.L();
                        l13.f71786a = j11;
                        function22 = function2;
                        l11 = l13;
                        c5176t2 = c5176t;
                        f7 = b11;
                        u11 = new U(null);
                        interfaceC10628c2 = interfaceC10628c;
                        c5176t2.f39237d = function22;
                        c5176t2.f39238e = interfaceC10628c2;
                        c5176t2.f39239f = l11;
                        c5176t2.f39240g = u11;
                        c5176t2.f39241h = null;
                        c5176t2.f39242i = f7;
                        c5176t2.f39244k = i15;
                        i02 = interfaceC10628c2.i0(EnumC10640o.Main, c5176t2);
                        if (i02 != aVar2) {
                        }
                        return aVar2;
                    }
                    return null;
                }
                if (i11 == 1) {
                    float f12 = c5176t.f39242i;
                    U u13 = (U) c5176t.f39240g;
                    kotlin.jvm.internal.L l14 = c5176t.f39239f;
                    InterfaceC10628c interfaceC10628c3 = c5176t.f39238e;
                    Function2 function23 = c5176t.f39237d;
                    Sc.s.b(obj);
                    f11 = f12;
                    interfaceC10628c2 = interfaceC10628c3;
                    c5176t3 = c5176t;
                    u12 = u13;
                    function22 = function23;
                    l12 = l14;
                    C10638m c10638m = (C10638m) obj;
                    List<x1.x> b12 = c10638m.b();
                    size = b12.size();
                    i12 = 0;
                    while (true) {
                        if (i12 < size) {
                        }
                        i12 = i13 + 1;
                    }
                    xVar2 = xVar;
                    if (xVar2 != null) {
                        if (C10639n.c(xVar2)) {
                        }
                        c5176t2.f39237d = function22;
                        c5176t2.f39238e = interfaceC10628c2;
                        c5176t2.f39239f = l11;
                        c5176t2.f39240g = u11;
                        c5176t2.f39241h = null;
                        c5176t2.f39242i = f7;
                        c5176t2.f39244k = i15;
                        i02 = interfaceC10628c2.i0(EnumC10640o.Main, c5176t2);
                        if (i02 != aVar2) {
                        }
                        return aVar2;
                    }
                    return null;
                }
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                float f13 = c5176t.f39242i;
                x1.x xVar4 = c5176t.f39241h;
                U u14 = (U) c5176t.f39240g;
                l11 = c5176t.f39239f;
                InterfaceC10628c interfaceC10628c4 = c5176t.f39238e;
                Function2 function24 = c5176t.f39237d;
                Sc.s.b(obj);
                u11 = u14;
                c5176t2 = c5176t;
                f7 = f13;
                interfaceC10628c2 = interfaceC10628c4;
                if (!xVar4.n()) {
                    function22 = function24;
                    i15 = 1;
                    c5176t2.f39237d = function22;
                    c5176t2.f39238e = interfaceC10628c2;
                    c5176t2.f39239f = l11;
                    c5176t2.f39240g = u11;
                    c5176t2.f39241h = null;
                    c5176t2.f39242i = f7;
                    c5176t2.f39244k = i15;
                    i02 = interfaceC10628c2.i0(EnumC10640o.Main, c5176t2);
                    if (i02 != aVar2) {
                        float f14 = f7;
                        u12 = u11;
                        obj = i02;
                        l12 = l11;
                        c5176t3 = c5176t2;
                        f11 = f14;
                        C10638m c10638m2 = (C10638m) obj;
                        List<x1.x> b122 = c10638m2.b();
                        size = b122.size();
                        i12 = 0;
                        while (true) {
                            if (i12 < size) {
                                xVar = null;
                                break;
                            }
                            xVar = b122.get(i12);
                            i13 = i12;
                            if (x1.w.c(xVar.d(), l12.f71786a)) {
                                break;
                            }
                            i12 = i13 + 1;
                        }
                        xVar2 = xVar;
                        if (xVar2 != null && !xVar2.n()) {
                            if (C10639n.c(xVar2)) {
                                List<x1.x> b13 = c10638m2.b();
                                int size2 = b13.size();
                                int i16 = 0;
                                while (true) {
                                    if (i16 >= size2) {
                                        xVar3 = null;
                                        break;
                                    }
                                    xVar3 = b13.get(i16);
                                    if (xVar3.g()) {
                                        break;
                                    }
                                    i16++;
                                }
                                x1.x xVar5 = xVar3;
                                if (xVar5 != null) {
                                    l12.f71786a = xVar5.d();
                                    u11 = u12;
                                    f7 = f11;
                                    c5176t2 = c5176t3;
                                    l11 = l12;
                                    i15 = 1;
                                }
                            } else {
                                C7459e a11 = u12.a(xVar2, f11);
                                if (a11 != null) {
                                    function22.invoke(xVar2, a11);
                                    if (xVar2.n()) {
                                        return xVar2;
                                    }
                                    u12.b();
                                    u11 = u12;
                                    f7 = f11;
                                    c5176t2 = c5176t3;
                                    l11 = l12;
                                    i15 = 1;
                                } else {
                                    EnumC10640o enumC10640o = EnumC10640o.Final;
                                    c5176t3.f39237d = function22;
                                    c5176t3.f39238e = interfaceC10628c2;
                                    c5176t3.f39239f = l12;
                                    c5176t3.f39240g = u12;
                                    c5176t3.f39241h = xVar2;
                                    c5176t3.f39242i = f11;
                                    c5176t3.f39244k = 2;
                                    if (interfaceC10628c2.i0(enumC10640o, c5176t3) != aVar2) {
                                        function24 = function22;
                                        u11 = u12;
                                        f7 = f11;
                                        xVar4 = xVar2;
                                        c5176t2 = c5176t3;
                                        l11 = l12;
                                        if (!xVar4.n()) {
                                        }
                                    }
                                }
                            }
                            c5176t2.f39237d = function22;
                            c5176t2.f39238e = interfaceC10628c2;
                            c5176t2.f39239f = l11;
                            c5176t2.f39240g = u11;
                            c5176t2.f39241h = null;
                            c5176t2.f39242i = f7;
                            c5176t2.f39244k = i15;
                            i02 = interfaceC10628c2.i0(EnumC10640o.Main, c5176t2);
                            if (i02 != aVar2) {
                            }
                        }
                    }
                    return aVar2;
                }
                return null;
            }
        }
        c5176t = new C5176t(aVar);
        Object obj2 = c5176t.f39243j;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c5176t.f39244k;
        int i152 = 1;
        if (i11 != 0) {
        }
    }

    public static final Object f(@NotNull x1.F f7, @NotNull Function1<? super C7459e, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Function2<? super x1.x, ? super C7459e, Unit> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object b11 = C9140t.b(f7, new v(c.f39249b, new kotlin.jvm.internal.L(), null, new a(function1), function2, function02, new b(function0), null), dVar);
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (b11 != aVar) {
            b11 = Unit.f71690a;
        }
        return b11 == aVar ? b11 : Unit.f71690a;
    }

    public static final Object g(@NotNull x1.F f7, @NotNull Function1 function1, @NotNull Function0 function0, @NotNull Function0 function02, @NotNull Function2 function2, @NotNull kotlin.coroutines.jvm.internal.j jVar) {
        Object b11 = C9140t.b(f7, new y(function0, function02, function2, function1, null), jVar);
        return b11 == Wc.a.COROUTINE_SUSPENDED ? b11 : Unit.f71690a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0047 -> B:10:0x004a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(@NotNull InterfaceC10628c interfaceC10628c, long j11, @NotNull Function1 function1, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        z zVar;
        int i11;
        x1.x xVar;
        if (cVar instanceof z) {
            zVar = (z) cVar;
            int i12 = zVar.f39281g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                zVar.f39281g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = zVar.f39280f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = zVar.f39281g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    zVar.f39278d = interfaceC10628c;
                    zVar.f39279e = function1;
                    zVar.f39281g = 1;
                    obj = b(interfaceC10628c, j11, zVar);
                    if (obj == aVar) {
                    }
                    xVar = (x1.x) obj;
                    if (xVar == null) {
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Function1 function12 = zVar.f39279e;
                    InterfaceC10628c interfaceC10628c2 = zVar.f39278d;
                    Sc.s.b(obj);
                    function1 = function12;
                    interfaceC10628c = interfaceC10628c2;
                    xVar = (x1.x) obj;
                    if (xVar == null) {
                        if (C10639n.c(xVar)) {
                            return Boolean.TRUE;
                        }
                        function1.invoke(xVar);
                        j11 = xVar.d();
                        zVar.f39278d = interfaceC10628c;
                        zVar.f39279e = function1;
                        zVar.f39281g = 1;
                        obj = b(interfaceC10628c, j11, zVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                        xVar = (x1.x) obj;
                        if (xVar == null) {
                            return Boolean.FALSE;
                        }
                    }
                }
            }
        }
        zVar = new z(cVar);
        Object obj2 = zVar.f39280f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = zVar.f39281g;
        if (i11 != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0100, code lost:
    
        if ((r8 != null ? r8 == r0.EnumC9142v.Vertical ? k1.C7459e.h(r4) : k1.C7459e.g(r4) : k1.C7459e.e(r4)) == 0.0f) goto L55;
     */
    /* JADX WARN: Path cross not found for [B:40:0x00bc, B:52:0x00e5], limit reached: 69 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x007e -> B:10:0x0084). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object j(@NotNull InterfaceC10628c interfaceC10628c, long j11, @NotNull Function1 function1, @NotNull kotlin.coroutines.jvm.internal.a aVar) {
        A a11;
        int i11;
        long j12;
        EnumC9142v enumC9142v;
        A a12;
        InterfaceC10628c interfaceC10628c2;
        Function1 function12;
        x1.x xVar;
        EnumC9142v enumC9142v2;
        InterfaceC10628c interfaceC10628c3;
        kotlin.jvm.internal.L l11;
        Object i02;
        InterfaceC10628c interfaceC10628c4;
        x1.x xVar2;
        x1.x xVar3;
        if (aVar instanceof A) {
            a11 = (A) aVar;
            int i12 = a11.f38945j;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                a11.f38945j = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = a11.f38944i;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = a11.f38945j;
                int i13 = 1;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    EnumC9142v enumC9142v3 = EnumC9142v.Horizontal;
                    j12 = j11;
                    if (!k(interfaceC10628c.b1(), j12)) {
                        enumC9142v = enumC9142v3;
                        a12 = a11;
                        interfaceC10628c2 = interfaceC10628c;
                        function12 = function1;
                        kotlin.jvm.internal.L l12 = new kotlin.jvm.internal.L();
                        l12.f71786a = j12;
                        interfaceC10628c3 = interfaceC10628c2;
                        enumC9142v2 = enumC9142v;
                        l11 = l12;
                        a12.f38939d = function12;
                        a12.f38940e = interfaceC10628c2;
                        a12.f38941f = enumC9142v2;
                        a12.f38942g = interfaceC10628c3;
                        a12.f38943h = l11;
                        a12.f38945j = i13;
                        i02 = interfaceC10628c3.i0(EnumC10640o.Main, a12);
                        if (i02 == aVar2) {
                        }
                    }
                    xVar = null;
                    return Boolean.valueOf(xVar != null);
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                l11 = a11.f38943h;
                interfaceC10628c3 = a11.f38942g;
                enumC9142v2 = a11.f38941f;
                InterfaceC10628c interfaceC10628c5 = a11.f38940e;
                Function1 function13 = a11.f38939d;
                Sc.s.b(obj);
                A a13 = a11;
                function12 = function13;
                C10638m c10638m = (C10638m) obj;
                List<x1.x> b11 = c10638m.b();
                int size = b11.size();
                int i14 = 0;
                while (true) {
                    if (i14 < size) {
                        interfaceC10628c4 = interfaceC10628c3;
                        xVar2 = null;
                        break;
                    }
                    xVar2 = b11.get(i14);
                    interfaceC10628c4 = interfaceC10628c3;
                    if (x1.w.c(xVar2.d(), l11.f71786a)) {
                        break;
                    }
                    i14++;
                    interfaceC10628c3 = interfaceC10628c4;
                }
                x1.x xVar4 = xVar2;
                if (xVar4 == null) {
                    if (C10639n.c(xVar4)) {
                        List<x1.x> b12 = c10638m.b();
                        int size2 = b12.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 >= size2) {
                                xVar3 = null;
                                break;
                            }
                            xVar3 = b12.get(i15);
                            if (xVar3.g()) {
                                break;
                            }
                            i15++;
                        }
                        x1.x xVar5 = xVar3;
                        if (xVar5 != null) {
                            l11.f71786a = xVar5.d();
                            interfaceC10628c3 = interfaceC10628c4;
                            interfaceC10628c2 = interfaceC10628c5;
                            a12 = a13;
                            i13 = 1;
                            a12.f38939d = function12;
                            a12.f38940e = interfaceC10628c2;
                            a12.f38941f = enumC9142v2;
                            a12.f38942g = interfaceC10628c3;
                            a12.f38943h = l11;
                            a12.f38945j = i13;
                            i02 = interfaceC10628c3.i0(EnumC10640o.Main, a12);
                            if (i02 == aVar2) {
                                return aVar2;
                            }
                            A a14 = a12;
                            interfaceC10628c5 = interfaceC10628c2;
                            obj = i02;
                            a13 = a14;
                            C10638m c10638m2 = (C10638m) obj;
                            List<x1.x> b112 = c10638m2.b();
                            int size3 = b112.size();
                            int i142 = 0;
                            while (true) {
                                if (i142 < size3) {
                                }
                                i142++;
                                interfaceC10628c3 = interfaceC10628c4;
                            }
                            x1.x xVar42 = xVar2;
                            if (xVar42 == null) {
                                xVar42 = null;
                            }
                        }
                    } else {
                        long g10 = C10639n.g(xVar42);
                    }
                }
                if (xVar42 != null && !xVar42.n()) {
                    if (C10639n.c(xVar42)) {
                        xVar = xVar42;
                        return Boolean.valueOf(xVar != null);
                    }
                    function12.invoke(xVar42);
                    enumC9142v = enumC9142v2;
                    j12 = xVar42.d();
                    interfaceC10628c2 = interfaceC10628c5;
                    a12 = a13;
                    i13 = 1;
                    kotlin.jvm.internal.L l122 = new kotlin.jvm.internal.L();
                    l122.f71786a = j12;
                    interfaceC10628c3 = interfaceC10628c2;
                    enumC9142v2 = enumC9142v;
                    l11 = l122;
                    a12.f38939d = function12;
                    a12.f38940e = interfaceC10628c2;
                    a12.f38941f = enumC9142v2;
                    a12.f38942g = interfaceC10628c3;
                    a12.f38943h = l11;
                    a12.f38945j = i13;
                    i02 = interfaceC10628c3.i0(EnumC10640o.Main, a12);
                    if (i02 == aVar2) {
                    }
                }
                xVar = null;
                return Boolean.valueOf(xVar != null);
            }
        }
        a11 = new A(aVar);
        Object obj2 = a11.f38944i;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = a11.f38945j;
        int i132 = 1;
        if (i11 != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(C10638m c10638m, long j11) {
        x1.x xVar;
        List<x1.x> b11 = c10638m.b();
        int size = b11.size();
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                xVar = null;
                break;
            }
            xVar = b11.get(i11);
            if (x1.w.c(xVar.d(), j11)) {
                break;
            }
            i11++;
        }
        x1.x xVar2 = xVar;
        if (xVar2 != null && xVar2.g()) {
            z11 = true;
        }
        return true ^ z11;
    }

    public static final float l(@NotNull c2 c2Var, int i11) {
        return i11 == 2 ? c2Var.b() * f39245a : c2Var.b();
    }
}
