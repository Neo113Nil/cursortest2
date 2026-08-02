package androidx.compose.material.ripple;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import D1.B;
import D1.C2809k;
import D1.C2820u;
import D1.InterfaceC2803h;
import D1.InterfaceC2819t;
import O0.i;
import Z1.r;
import androidx.collection.J;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l1.InterfaceC7813c0;
import n1.InterfaceC8410c;
import org.jetbrains.annotations.NotNull;
import t0.n;
import t0.o;
import t0.s;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/material/ripple/RippleNode;", "Landroidx/compose/ui/e$c;", "LD1/h;", "LD1/t;", "LD1/B;", "Ll1/c0;", "color", "Ll1/c0;", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class RippleNode extends e.c implements InterfaceC2803h, InterfaceC2819t, B {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final o f40093a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f40094b;

    /* renamed from: c, reason: collision with root package name */
    private final float f40095c;

    @NotNull
    private final InterfaceC7813c0 color;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final AbstractC7737t f40096d;

    /* renamed from: e, reason: collision with root package name */
    private c f40097e;

    /* renamed from: f, reason: collision with root package name */
    private float f40098f;

    /* renamed from: h, reason: collision with root package name */
    private boolean f40100h;

    /* renamed from: g, reason: collision with root package name */
    private long f40099g = 0;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final J<s> f40101i = new J<>((Object) null);

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material.ripple.RippleNode$onAttach$1", f = "Ripple.kt", l = {378}, m = "invokeSuspend")
    static final class a extends j implements Function2<M, d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f40102d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f40103e;

        /* renamed from: androidx.compose.material.ripple.RippleNode$a$a, reason: collision with other inner class name */
        static final class C0741a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ RippleNode f40105a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ M f40106b;

            C0741a(RippleNode rippleNode, M m11) {
                this.f40105a = rippleNode;
                this.f40106b = m11;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(Object obj, d dVar) {
                n nVar = (n) obj;
                boolean z11 = nVar instanceof s;
                RippleNode rippleNode = this.f40105a;
                if (!z11) {
                    RippleNode.M1(rippleNode, nVar, this.f40106b);
                } else if (rippleNode.f40100h) {
                    rippleNode.T1((s) nVar);
                } else {
                    rippleNode.f40101i.b(nVar);
                }
                return Unit.f71690a;
            }
        }

        a(d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final d<Unit> create(Object obj, @NotNull d<?> dVar) {
            a aVar = RippleNode.this.new a(dVar);
            aVar.f40103e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f40102d;
            if (i11 == 0) {
                Sc.s.b(obj);
                M m11 = (M) this.f40103e;
                RippleNode rippleNode = RippleNode.this;
                InterfaceC2395h<n> interactions = rippleNode.f40093a.getInteractions();
                C0741a c0741a = new C0741a(rippleNode, m11);
                this.f40102d = 1;
                if (interactions.collect(c0741a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RippleNode(o oVar, boolean z11, float f7, InterfaceC7813c0 interfaceC7813c0, Function0 function0) {
        this.f40093a = oVar;
        this.f40094b = z11;
        this.f40095c = f7;
        this.color = interfaceC7813c0;
        this.f40096d = (AbstractC7737t) function0;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
    public static final void M1(RippleNode rippleNode, n nVar, M m11) {
        c cVar = rippleNode.f40097e;
        if (cVar == null) {
            cVar = new c(rippleNode.f40094b, rippleNode.f40096d);
            C2820u.a(rippleNode);
            rippleNode.f40097e = cVar;
        }
        cVar.c(nVar, m11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T1(s sVar) {
        if (sVar instanceof s.b) {
            N1((s.b) sVar, this.f40099g, this.f40098f);
        } else if (sVar instanceof s.c) {
            U1(((s.c) sVar).a());
        } else if (sVar instanceof s.a) {
            U1(((s.a) sVar).a());
        }
    }

    @Override // D1.B
    public final void E(long j11) {
        this.f40100h = true;
        Z1.d E11 = C2809k.f(this).E();
        this.f40099g = r.b(j11);
        float f7 = this.f40095c;
        this.f40098f = Float.isNaN(f7) ? O0.n.a(E11, this.f40094b, this.f40099g) : E11.v1(f7);
        J<s> j12 = this.f40101i;
        Object[] objArr = j12.f38646a;
        int i11 = j12.f38647b;
        for (int i12 = 0; i12 < i11; i12++) {
            T1((s) objArr[i12]);
        }
        j12.c();
    }

    public abstract void N1(@NotNull s.b bVar, long j11, float f7);

    public abstract void O1(@NotNull InterfaceC8410c interfaceC8410c);

    /* renamed from: P1, reason: from getter */
    protected final boolean getF40094b() {
        return this.f40094b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function0<O0.i>, kotlin.jvm.internal.t] */
    @NotNull
    protected final Function0<i> Q1() {
        return this.f40096d;
    }

    public final long R1() {
        return this.color.mo7invoke0d7_KjU();
    }

    /* renamed from: S1, reason: from getter */
    protected final long getF40099g() {
        return this.f40099g;
    }

    public abstract void U1(@NotNull s.b bVar);

    @Override // D1.InterfaceC2819t
    public final void draw(@NotNull InterfaceC8410c interfaceC8410c) {
        ((D1.J) interfaceC8410c).F0();
        c cVar = this.f40097e;
        if (cVar != null) {
            cVar.b(interfaceC8410c, this.f40098f, this.color.mo7invoke0d7_KjU());
        }
        O1(interfaceC8410c);
    }

    @Override // androidx.compose.ui.e.c
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.e.c
    public final void onAttach() {
        C10727i.c(getCoroutineScope(), null, null, new a(null), 3);
    }
}
