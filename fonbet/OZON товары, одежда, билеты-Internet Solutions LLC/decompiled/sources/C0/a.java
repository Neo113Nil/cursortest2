package C0;

import D1.AbstractC2813m;
import D1.C0;
import Sc.s;
import j1.e;
import java.util.List;
import k1.C7459e;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.i;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import r0.C9115P;
import r0.C9140t;
import x1.C10638m;
import x1.EnumC10640o;
import x1.F;
import x1.InterfaceC10628c;
import x1.L;
import x1.N;
import x1.S;
import x1.w;
import x1.x;

/* loaded from: classes8.dex */
public class a extends AbstractC2813m implements C0, e {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private Function0<Boolean> f4282c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f4283d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final N f4284e;

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1", f = "StylusHandwriting.kt", l = {132}, m = "invokeSuspend")
    /* renamed from: C0.a$a, reason: collision with other inner class name */
    static final class C0105a extends j implements Function2<F, d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f4285d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f4286e;

        @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1$1", f = "StylusHandwriting.kt", l = {134, 158, 186}, m = "invokeSuspend")
        /* renamed from: C0.a$a$a, reason: collision with other inner class name */
        static final class C0106a extends i implements Function2<InterfaceC10628c, d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            x f4288d;

            /* renamed from: e, reason: collision with root package name */
            EnumC10640o f4289e;

            /* renamed from: f, reason: collision with root package name */
            int f4290f;

            /* renamed from: g, reason: collision with root package name */
            private /* synthetic */ Object f4291g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ a f4292h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0106a(a aVar, d<? super C0106a> dVar) {
                super(2, dVar);
                this.f4292h = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final d<Unit> create(Object obj, @NotNull d<?> dVar) {
                C0106a c0106a = new C0106a(this.f4292h, dVar);
                c0106a.f4291g = obj;
                return c0106a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC10628c interfaceC10628c, d<? super Unit> dVar) {
                return ((C0106a) create(interfaceC10628c, dVar)).invokeSuspend(Unit.f71690a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:23:0x0169, code lost:
            
                if (r4 != r1) goto L67;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x016b, code lost:
            
                return r1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:57:0x00d0, code lost:
            
                if (r10 != r1) goto L40;
             */
            /* JADX WARN: Code restructure failed: missing block: B:88:0x0054, code lost:
            
                if (r9 == r1) goto L66;
             */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0169 -> B:7:0x016c). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00d0 -> B:29:0x00d4). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(@NotNull Object obj) {
                InterfaceC10628c interfaceC10628c;
                Object c11;
                InterfaceC10628c interfaceC10628c2;
                EnumC10640o enumC10640o;
                x xVar;
                Object i02;
                x xVar2;
                x xVar3;
                InterfaceC10628c interfaceC10628c3;
                x xVar4;
                Object i03;
                x xVar5;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f4290f;
                a aVar2 = this.f4292h;
                int i12 = 2;
                if (i11 == 0) {
                    s.b(obj);
                    interfaceC10628c = (InterfaceC10628c) this.f4291g;
                    EnumC10640o enumC10640o2 = EnumC10640o.Initial;
                    this.f4291g = interfaceC10628c;
                    this.f4290f = 1;
                    c11 = C9115P.c(interfaceC10628c, true, enumC10640o2, this);
                } else if (i11 == 1) {
                    interfaceC10628c = (InterfaceC10628c) this.f4291g;
                    s.b(obj);
                    c11 = obj;
                } else if (i11 == 2) {
                    enumC10640o = this.f4289e;
                    xVar = this.f4288d;
                    interfaceC10628c2 = (InterfaceC10628c) this.f4291g;
                    s.b(obj);
                    i02 = obj;
                    List<x> b11 = ((C10638m) i02).b();
                    int size = b11.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 >= size) {
                            xVar2 = null;
                            break;
                        }
                        xVar2 = b11.get(i13);
                        x xVar6 = xVar2;
                        if (!xVar6.n() && w.c(xVar6.d(), xVar.d()) && xVar6.g()) {
                            break;
                        }
                        i13++;
                    }
                    x xVar7 = xVar2;
                    if (xVar7 == null || xVar7.m() - xVar.m() >= interfaceC10628c2.b().e()) {
                        xVar7 = null;
                    } else if (C7459e.e(C7459e.j(xVar7.f(), xVar.f())) <= interfaceC10628c2.b().a()) {
                        i12 = 2;
                        this.f4291g = interfaceC10628c2;
                        this.f4288d = xVar;
                        this.f4289e = enumC10640o;
                        this.f4290f = i12;
                        i02 = interfaceC10628c2.i0(enumC10640o, this);
                    }
                    if (xVar7 == null || !aVar2.O1().invoke().booleanValue()) {
                        return Unit.f71690a;
                    }
                    xVar7.a();
                    xVar3 = xVar;
                    interfaceC10628c3 = interfaceC10628c2;
                    EnumC10640o enumC10640o3 = EnumC10640o.Initial;
                    this.f4291g = interfaceC10628c3;
                    this.f4288d = xVar3;
                    xVar4 = null;
                    this.f4289e = null;
                    this.f4290f = 3;
                    i03 = interfaceC10628c3.i0(enumC10640o3, this);
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    xVar3 = this.f4288d;
                    interfaceC10628c3 = (InterfaceC10628c) this.f4291g;
                    s.b(obj);
                    i03 = obj;
                    xVar4 = null;
                    List<x> b12 = ((C10638m) i03).b();
                    int size2 = b12.size();
                    int i14 = 0;
                    while (true) {
                        if (i14 >= size2) {
                            xVar5 = xVar4;
                            break;
                        }
                        xVar5 = b12.get(i14);
                        x xVar8 = xVar5;
                        if (!xVar8.n() && w.c(xVar8.d(), xVar3.d()) && xVar8.g()) {
                            break;
                        }
                        i14++;
                    }
                    x xVar9 = xVar5;
                    if (xVar9 == null) {
                        return Unit.f71690a;
                    }
                    xVar9.a();
                    EnumC10640o enumC10640o32 = EnumC10640o.Initial;
                    this.f4291g = interfaceC10628c3;
                    this.f4288d = xVar3;
                    xVar4 = null;
                    this.f4289e = null;
                    this.f4290f = 3;
                    i03 = interfaceC10628c3.i0(enumC10640o32, this);
                }
                x xVar10 = (x) c11;
                if (xVar10.l() != 3 && xVar10.l() != 4) {
                    return Unit.f71690a;
                }
                EnumC10640o enumC10640o4 = (aVar2.f4283d || (C7459e.g(xVar10.f()) >= 0.0f && C7459e.g(xVar10.f()) < ((float) ((int) (interfaceC10628c.a() >> 32))) && C7459e.h(xVar10.f()) >= 0.0f && C7459e.h(xVar10.f()) < ((float) ((int) (interfaceC10628c.a() & 4294967295L))))) ? EnumC10640o.Initial : EnumC10640o.Main;
                interfaceC10628c2 = interfaceC10628c;
                enumC10640o = enumC10640o4;
                xVar = xVar10;
                this.f4291g = interfaceC10628c2;
                this.f4288d = xVar;
                this.f4289e = enumC10640o;
                this.f4290f = i12;
                i02 = interfaceC10628c2.i0(enumC10640o, this);
            }
        }

        C0105a(d<? super C0105a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final d<Unit> create(Object obj, @NotNull d<?> dVar) {
            C0105a c0105a = a.this.new C0105a(dVar);
            c0105a.f4286e = obj;
            return c0105a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(F f7, d<? super Unit> dVar) {
            return ((C0105a) create(f7, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f4285d;
            if (i11 == 0) {
                s.b(obj);
                F f7 = (F) this.f4286e;
                C0106a c0106a = new C0106a(a.this, null);
                this.f4285d = 1;
                if (C9140t.b(f7, c0106a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    public a(@NotNull Function0<Boolean> function0) {
        this.f4282c = function0;
        C0105a c0105a = new C0105a(null);
        int i11 = L.f104834b;
        S s11 = new S(null, null, null, c0105a);
        I1(s11);
        this.f4284e = s11;
    }

    @Override // j1.e
    public final void L(@NotNull j1.w wVar) {
        this.f4283d = wVar.a();
    }

    @NotNull
    public final Function0<Boolean> O1() {
        return this.f4282c;
    }

    public final void P1(@NotNull Function0<Boolean> function0) {
        this.f4282c = function0;
    }

    @Override // D1.C0
    public final void p1(@NotNull C10638m c10638m, @NotNull EnumC10640o enumC10640o, long j11) {
        this.f4284e.p1(c10638m, enumC10640o, j11);
    }

    @Override // D1.C0
    public final void r0() {
        this.f4284e.r0();
    }

    public final void v0() {
        this.f4284e.v0();
    }
}
