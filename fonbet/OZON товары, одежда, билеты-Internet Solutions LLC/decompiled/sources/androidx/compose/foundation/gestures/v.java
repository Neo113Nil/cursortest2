package androidx.compose.foundation.gestures;

import fd.InterfaceC6511n;
import java.util.List;
import k1.C7459e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;
import r0.C9115P;
import r0.EnumC9142v;
import x1.C10638m;
import x1.C10639n;
import x1.EnumC10640o;
import x1.InterfaceC10628c;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$9", f = "DragGestureDetector.kt", l = {247, 253, 972, 1014, 1025}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class v extends kotlin.coroutines.jvm.internal.i implements Function2<InterfaceC10628c, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    Object f39250d;

    /* renamed from: e, reason: collision with root package name */
    Object f39251e;

    /* renamed from: f, reason: collision with root package name */
    Object f39252f;

    /* renamed from: g, reason: collision with root package name */
    kotlin.jvm.internal.L f39253g;

    /* renamed from: h, reason: collision with root package name */
    Object f39254h;

    /* renamed from: i, reason: collision with root package name */
    x1.x f39255i;

    /* renamed from: j, reason: collision with root package name */
    boolean f39256j;

    /* renamed from: k, reason: collision with root package name */
    float f39257k;

    /* renamed from: l, reason: collision with root package name */
    int f39258l;

    /* renamed from: m, reason: collision with root package name */
    private /* synthetic */ Object f39259m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ AbstractC7737t f39260n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.L f39261o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ EnumC9142v f39262p;

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ AbstractC7737t f39263q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ AbstractC7737t f39264r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ AbstractC7737t f39265s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ AbstractC7737t f39266t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    v(Function0<Boolean> function0, kotlin.jvm.internal.L l11, EnumC9142v enumC9142v, InterfaceC6511n<? super x1.x, ? super x1.x, ? super C7459e, Unit> interfaceC6511n, Function2<? super x1.x, ? super C7459e, Unit> function2, Function0<Unit> function02, Function1<? super x1.x, Unit> function1, kotlin.coroutines.d<? super v> dVar) {
        super(2, dVar);
        this.f39260n = (AbstractC7737t) function0;
        this.f39261o = l11;
        this.f39262p = enumC9142v;
        this.f39263q = (AbstractC7737t) interfaceC6511n;
        this.f39264r = (AbstractC7737t) function2;
        this.f39265s = (AbstractC7737t) function02;
        this.f39266t = (AbstractC7737t) function1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
    /* JADX WARN: Type inference failed for: r4v0, types: [fd.n, kotlin.jvm.internal.t] */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.t] */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        ?? r62 = this.f39265s;
        ?? r72 = this.f39266t;
        v vVar = new v(this.f39260n, this.f39261o, this.f39262p, this.f39263q, this.f39264r, r62, r72, dVar);
        vVar.f39259m = obj;
        return vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC10628c interfaceC10628c, kotlin.coroutines.d<? super Unit> dVar) {
        return ((v) create(interfaceC10628c, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x00bd, code lost:
    
        if (r6 == r1) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0260, code lost:
    
        if (r9 == r1) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x02df, code lost:
    
        if ((r4 != null ? r4 == r0.EnumC9142v.Vertical ? k1.C7459e.h(r8) : k1.C7459e.g(r8) : k1.C7459e.e(r8)) == 0.0f) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0137, code lost:
    
        if (r15 == r1) goto L91;
     */
    /* JADX WARN: Path cross not found for [B:38:0x029b, B:49:0x02c4], limit reached: 135 */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0108  */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.t] */
    /* JADX WARN: Type inference failed for: r4v1, types: [fd.n, kotlin.jvm.internal.t] */
    /* JADX WARN: Type inference failed for: r8v2, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:104:0x01f0 -> B:59:0x01f2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0260 -> B:9:0x0263). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x0103 -> B:62:0x01fb). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        InterfaceC10628c interfaceC10628c;
        Object c11;
        x1.x xVar;
        Object d11;
        InterfaceC10628c interfaceC10628c2;
        boolean z11;
        x1.x xVar2;
        kotlin.jvm.internal.L l11;
        long d12;
        boolean k11;
        x1.x xVar3;
        Object obj2;
        kotlin.jvm.internal.L l12;
        U u11;
        InterfaceC10628c interfaceC10628c3;
        kotlin.jvm.internal.L l13;
        float f7;
        x1.x xVar4;
        x1.x xVar5;
        x1.x xVar6;
        x1.x xVar7;
        boolean k12;
        InterfaceC10628c interfaceC10628c4;
        Function2 function2;
        EnumC9142v enumC9142v;
        InterfaceC10628c interfaceC10628c5;
        kotlin.jvm.internal.L l14;
        x1.x xVar8;
        Object i02;
        Function2 function22;
        C10638m c10638m;
        x1.x xVar9;
        x1.x xVar10;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f39258l;
        kotlin.jvm.internal.L l15 = this.f39261o;
        x1.x xVar11 = null;
        EnumC9142v enumC9142v2 = this.f39262p;
        int i12 = 3;
        if (i11 == 0) {
            Sc.s.b(obj);
            interfaceC10628c = (InterfaceC10628c) this.f39259m;
            EnumC10640o enumC10640o = EnumC10640o.Initial;
            this.f39259m = interfaceC10628c;
            this.f39258l = 1;
            c11 = C9115P.c(interfaceC10628c, false, enumC10640o, this);
        } else if (i11 == 1) {
            interfaceC10628c = (InterfaceC10628c) this.f39259m;
            Sc.s.b(obj);
            c11 = obj;
        } else if (i11 == 2) {
            z11 = this.f39256j;
            x1.x xVar12 = (x1.x) this.f39250d;
            InterfaceC10628c interfaceC10628c6 = (InterfaceC10628c) this.f39259m;
            Sc.s.b(obj);
            interfaceC10628c2 = interfaceC10628c6;
            xVar = xVar12;
            d11 = obj;
            xVar2 = (x1.x) d11;
            l15.f71786a = 0L;
            if (!z11) {
                l11 = l15;
                if (xVar != null) {
                }
                return Unit.f71690a;
            }
            long d13 = xVar2.d();
            int l16 = xVar2.l();
            k12 = C5177u.k(interfaceC10628c2.b1(), d13);
            if (!k12) {
            }
        } else {
            if (i11 == 3) {
                f7 = this.f39257k;
                U u12 = (U) this.f39254h;
                l13 = this.f39253g;
                kotlin.jvm.internal.L l17 = (kotlin.jvm.internal.L) this.f39252f;
                InterfaceC10628c interfaceC10628c7 = (InterfaceC10628c) this.f39251e;
                x1.x xVar13 = (x1.x) this.f39250d;
                InterfaceC10628c interfaceC10628c8 = (InterfaceC10628c) this.f39259m;
                Sc.s.b(obj);
                u11 = u12;
                xVar2 = xVar13;
                l12 = l17;
                interfaceC10628c2 = interfaceC10628c7;
                interfaceC10628c3 = interfaceC10628c8;
                obj2 = obj;
                C10638m c10638m2 = (C10638m) obj2;
                List<x1.x> b11 = c10638m2.b();
                int size = b11.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size) {
                        l11 = l15;
                        xVar4 = null;
                        break;
                    }
                    xVar4 = b11.get(i13);
                    List<x1.x> list = b11;
                    l11 = l15;
                    int i14 = i13;
                    if (x1.w.c(xVar4.d(), l13.f71786a)) {
                        break;
                    }
                    i13 = i14 + 1;
                    b11 = list;
                    l15 = l11;
                }
                x1.x xVar14 = xVar4;
                if (xVar14 != null && !xVar14.n()) {
                    if (C10639n.c(xVar14)) {
                        List<x1.x> b12 = c10638m2.b();
                        int size2 = b12.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 >= size2) {
                                xVar7 = null;
                                break;
                            }
                            xVar7 = b12.get(i15);
                            if (xVar7.g()) {
                                break;
                            }
                            i15++;
                        }
                        x1.x xVar15 = xVar7;
                        if (xVar15 != null) {
                            l13.f71786a = xVar15.d();
                        }
                    } else {
                        C7459e a11 = u11.a(xVar14, f7);
                        if (a11 == null) {
                            EnumC10640o enumC10640o2 = EnumC10640o.Final;
                            this.f39259m = interfaceC10628c3;
                            this.f39250d = xVar2;
                            this.f39251e = interfaceC10628c2;
                            this.f39252f = l12;
                            this.f39253g = l13;
                            this.f39254h = u11;
                            this.f39255i = xVar14;
                            this.f39257k = f7;
                            this.f39258l = 4;
                            if (interfaceC10628c2.i0(enumC10640o2, this) != aVar) {
                                xVar5 = xVar2;
                                xVar6 = xVar14;
                                if (!xVar6.n()) {
                                }
                            }
                            return aVar;
                        }
                        long n11 = a11.n();
                        xVar14.a();
                        l12.f71786a = n11;
                        if (xVar14.n()) {
                            xVar = xVar14;
                            interfaceC10628c2 = interfaceC10628c3;
                            if (xVar != null) {
                            }
                            if (xVar != null) {
                            }
                            return Unit.f71690a;
                        }
                        u11.b();
                    }
                    l15 = l11;
                    xVar11 = null;
                    i12 = 3;
                    this.f39259m = interfaceC10628c3;
                    this.f39250d = xVar2;
                    this.f39251e = interfaceC10628c2;
                    this.f39252f = l12;
                    this.f39253g = l13;
                    this.f39254h = u11;
                    this.f39255i = xVar11;
                    this.f39257k = f7;
                    this.f39258l = i12;
                    obj2 = interfaceC10628c2.i0(EnumC10640o.Main, this);
                }
                interfaceC10628c2 = interfaceC10628c3;
                xVar = null;
                if (xVar != null) {
                }
                if (xVar != null) {
                }
                return Unit.f71690a;
            }
            if (i11 != 4) {
                if (i11 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                l14 = this.f39253g;
                interfaceC10628c5 = (InterfaceC10628c) this.f39252f;
                EnumC9142v enumC9142v3 = (EnumC9142v) this.f39251e;
                function2 = (Function2) this.f39250d;
                interfaceC10628c4 = (InterfaceC10628c) this.f39259m;
                Sc.s.b(obj);
                xVar8 = null;
                enumC9142v = enumC9142v3;
                i02 = obj;
                C10638m c10638m3 = (C10638m) i02;
                List<x1.x> b13 = c10638m3.b();
                int size3 = b13.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size3) {
                        c10638m = c10638m3;
                        xVar9 = xVar8;
                        break;
                    }
                    xVar9 = b13.get(i16);
                    c10638m = c10638m3;
                    if (x1.w.c(xVar9.d(), l14.f71786a)) {
                        break;
                    }
                    i16++;
                    c10638m3 = c10638m;
                }
                x1.x xVar16 = xVar9;
                if (xVar16 == null) {
                    xVar16 = xVar8;
                } else if (C10639n.c(xVar16)) {
                    List<x1.x> b14 = c10638m.b();
                    int size4 = b14.size();
                    int i17 = 0;
                    while (true) {
                        if (i17 >= size4) {
                            xVar10 = xVar8;
                            break;
                        }
                        xVar10 = b14.get(i17);
                        if (xVar10.g()) {
                            break;
                        }
                        i17++;
                    }
                    x1.x xVar17 = xVar10;
                    if (xVar17 != null) {
                        l14.f71786a = xVar17.d();
                        this.f39259m = interfaceC10628c4;
                        this.f39250d = function2;
                        this.f39251e = enumC9142v;
                        this.f39252f = interfaceC10628c5;
                        this.f39253g = l14;
                        xVar8 = null;
                        this.f39254h = null;
                        this.f39255i = null;
                        this.f39258l = 5;
                        i02 = interfaceC10628c5.i0(EnumC10640o.Main, this);
                    }
                } else {
                    long g10 = C10639n.g(xVar16);
                }
                if (xVar16 == null || xVar16.n()) {
                    xVar3 = xVar8;
                } else if (C10639n.c(xVar16)) {
                    xVar3 = xVar16;
                } else {
                    function2.invoke(xVar16, C7459e.a(C10639n.f(xVar16)));
                    xVar16.a();
                    interfaceC10628c2 = interfaceC10628c4;
                    enumC9142v2 = enumC9142v;
                    d12 = xVar16.d();
                    function22 = function2;
                    l14 = new kotlin.jvm.internal.L();
                    l14.f71786a = d12;
                    function2 = function22;
                    enumC9142v = enumC9142v2;
                    interfaceC10628c5 = interfaceC10628c2;
                    interfaceC10628c4 = interfaceC10628c5;
                    this.f39259m = interfaceC10628c4;
                    this.f39250d = function2;
                    this.f39251e = enumC9142v;
                    this.f39252f = interfaceC10628c5;
                    this.f39253g = l14;
                    xVar8 = null;
                    this.f39254h = null;
                    this.f39255i = null;
                    this.f39258l = 5;
                    i02 = interfaceC10628c5.i0(EnumC10640o.Main, this);
                }
                if (xVar3 != null) {
                    this.f39265s.invoke();
                } else {
                    this.f39266t.invoke(xVar3);
                }
                return Unit.f71690a;
            }
            f7 = this.f39257k;
            xVar6 = this.f39255i;
            U u13 = (U) this.f39254h;
            kotlin.jvm.internal.L l18 = this.f39253g;
            kotlin.jvm.internal.L l19 = (kotlin.jvm.internal.L) this.f39252f;
            InterfaceC10628c interfaceC10628c9 = (InterfaceC10628c) this.f39251e;
            xVar5 = (x1.x) this.f39250d;
            InterfaceC10628c interfaceC10628c10 = (InterfaceC10628c) this.f39259m;
            Sc.s.b(obj);
            u11 = u13;
            l13 = l18;
            interfaceC10628c3 = interfaceC10628c10;
            interfaceC10628c2 = interfaceC10628c9;
            l12 = l19;
            l11 = l15;
            if (!xVar6.n()) {
                interfaceC10628c2 = interfaceC10628c3;
                xVar2 = xVar5;
                xVar = null;
                if (xVar != null && !xVar.n()) {
                    l15 = l11;
                    xVar11 = null;
                    i12 = 3;
                    long d132 = xVar2.d();
                    int l162 = xVar2.l();
                    k12 = C5177u.k(interfaceC10628c2.b1(), d132);
                    if (!k12) {
                        l11 = l15;
                        xVar = xVar11;
                        if (xVar != null) {
                            l15 = l11;
                            xVar11 = null;
                            i12 = 3;
                            long d1322 = xVar2.d();
                            int l1622 = xVar2.l();
                            k12 = C5177u.k(interfaceC10628c2.b1(), d1322);
                            if (!k12) {
                                f7 = C5177u.l(interfaceC10628c2.b(), l1622);
                                l13 = new kotlin.jvm.internal.L();
                                l13.f71786a = d1322;
                                l12 = l15;
                                u11 = new U(enumC9142v2);
                                interfaceC10628c3 = interfaceC10628c2;
                                this.f39259m = interfaceC10628c3;
                                this.f39250d = xVar2;
                                this.f39251e = interfaceC10628c2;
                                this.f39252f = l12;
                                this.f39253g = l13;
                                this.f39254h = u11;
                                this.f39255i = xVar11;
                                this.f39257k = f7;
                                this.f39258l = i12;
                                obj2 = interfaceC10628c2.i0(EnumC10640o.Main, this);
                            }
                        }
                    }
                }
                if (xVar != null) {
                    kotlin.jvm.internal.L l21 = l11;
                    this.f39263q.invoke(xVar2, xVar, C7459e.a(l21.f71786a));
                    C7459e a12 = C7459e.a(l21.f71786a);
                    ?? r32 = this.f39264r;
                    r32.invoke(xVar, a12);
                    d12 = xVar.d();
                    k11 = C5177u.k(interfaceC10628c2.b1(), d12);
                    function22 = r32;
                    if (k11) {
                        xVar3 = null;
                        if (xVar3 != null) {
                        }
                    }
                    l14 = new kotlin.jvm.internal.L();
                    l14.f71786a = d12;
                    function2 = function22;
                    enumC9142v = enumC9142v2;
                    interfaceC10628c5 = interfaceC10628c2;
                    interfaceC10628c4 = interfaceC10628c5;
                    this.f39259m = interfaceC10628c4;
                    this.f39250d = function2;
                    this.f39251e = enumC9142v;
                    this.f39252f = interfaceC10628c5;
                    this.f39253g = l14;
                    xVar8 = null;
                    this.f39254h = null;
                    this.f39255i = null;
                    this.f39258l = 5;
                    i02 = interfaceC10628c5.i0(EnumC10640o.Main, this);
                }
                return Unit.f71690a;
            }
            xVar2 = xVar5;
            l15 = l11;
            xVar11 = null;
            i12 = 3;
            this.f39259m = interfaceC10628c3;
            this.f39250d = xVar2;
            this.f39251e = interfaceC10628c2;
            this.f39252f = l12;
            this.f39253g = l13;
            this.f39254h = u11;
            this.f39255i = xVar11;
            this.f39257k = f7;
            this.f39258l = i12;
            obj2 = interfaceC10628c2.i0(EnumC10640o.Main, this);
        }
        xVar = (x1.x) c11;
        boolean booleanValue = ((Boolean) this.f39260n.invoke()).booleanValue();
        if (!booleanValue) {
            xVar.a();
        }
        this.f39259m = interfaceC10628c;
        this.f39250d = xVar;
        this.f39256j = booleanValue;
        this.f39258l = 2;
        d11 = C9115P.d(interfaceC10628c, null, this, 2);
        if (d11 != aVar) {
            interfaceC10628c2 = interfaceC10628c;
            z11 = booleanValue;
            xVar2 = (x1.x) d11;
            l15.f71786a = 0L;
            if (!z11) {
            }
            long d13222 = xVar2.d();
            int l16222 = xVar2.l();
            k12 = C5177u.k(interfaceC10628c2.b1(), d13222);
            if (!k12) {
            }
        }
        return aVar;
    }
}
