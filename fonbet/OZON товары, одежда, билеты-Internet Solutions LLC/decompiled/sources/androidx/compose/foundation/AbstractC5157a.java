package androidx.compose.foundation;

import D1.AbstractC2813m;
import D1.C0;
import D1.C2809k;
import D1.E0;
import D1.I0;
import D1.InterfaceC2807j;
import I1.C3222a;
import I1.D;
import android.view.KeyEvent;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import n0.C8394o;
import n0.C8400u;
import n0.C8402w;
import n0.InterfaceC8369J;
import org.jetbrains.annotations.NotNull;
import r0.InterfaceC9143w;
import t0.s;
import v1.C10176a;
import v1.C10178c;
import v1.C10179d;
import v1.C10181f;
import v1.InterfaceC10180e;
import x1.C10638m;
import x1.EnumC10640o;
import x1.F;
import x1.L;
import x1.N;
import x1.S;
import xe.C10727i;
import xe.M;

/* renamed from: androidx.compose.foundation.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5157a extends AbstractC2813m implements C0, InterfaceC10180e, j1.e, E0, I0 {

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    public static final C0722a f38880t = new C0722a();

    /* renamed from: c, reason: collision with root package name */
    private t0.q f38881c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC8369J f38882d;

    /* renamed from: e, reason: collision with root package name */
    private String f38883e;

    /* renamed from: f, reason: collision with root package name */
    private I1.i f38884f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f38885g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private Function0<Unit> f38886h;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final C8402w f38888j;

    /* renamed from: k, reason: collision with root package name */
    private N f38889k;

    /* renamed from: l, reason: collision with root package name */
    private InterfaceC2807j f38890l;

    /* renamed from: m, reason: collision with root package name */
    private s.b f38891m;

    /* renamed from: n, reason: collision with root package name */
    private t0.j f38892n;

    /* renamed from: q, reason: collision with root package name */
    private t0.q f38895q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f38896r;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private final C0722a f38897s;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final C8400u f38887i = new C8400u();

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f38893o = new LinkedHashMap();

    /* renamed from: p, reason: collision with root package name */
    private long f38894p = 0;

    /* renamed from: androidx.compose.foundation.a$a, reason: collision with other inner class name */
    public static final class C0722a {
    }

    /* renamed from: androidx.compose.foundation.a$b */
    static final class b extends AbstractC7737t implements Function0<Boolean> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            AbstractC5157a.this.W1().invoke();
            return Boolean.TRUE;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.AbstractClickableNode$onKeyEvent$1", f = "Clickable.kt", l = {1074}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.a$c */
    /* loaded from: classes8.dex */
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f38899d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ s.b f38901f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(s.b bVar, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f38901f = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return AbstractC5157a.this.new c(this.f38901f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f38899d;
            if (i11 == 0) {
                Sc.s.b(obj);
                t0.q qVar = AbstractC5157a.this.f38881c;
                if (qVar != null) {
                    this.f38899d = 1;
                    if (qVar.emit(this.f38901f, this) == aVar) {
                        return aVar;
                    }
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

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.AbstractClickableNode$onKeyEvent$2$1", f = "Clickable.kt", l = {1085}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.a$d */
    /* loaded from: classes8.dex */
    static final class d extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f38902d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ s.b f38904f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(s.b bVar, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f38904f = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return AbstractC5157a.this.new d(this.f38904f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f38902d;
            if (i11 == 0) {
                Sc.s.b(obj);
                t0.q qVar = AbstractC5157a.this.f38881c;
                if (qVar != null) {
                    s.c cVar = new s.c(this.f38904f);
                    this.f38902d = 1;
                    if (qVar.emit(cVar, this) == aVar) {
                        return aVar;
                    }
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

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.AbstractClickableNode$onPointerEvent$1", f = "Clickable.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.a$e */
    /* loaded from: classes8.dex */
    static final class e extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {
        e(kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return AbstractC5157a.this.new e(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            AbstractC5157a.N1(AbstractC5157a.this);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.AbstractClickableNode$onPointerEvent$2", f = "Clickable.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.a$f */
    /* loaded from: classes8.dex */
    static final class f extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {
        f(kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return AbstractC5157a.this.new f(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            AbstractC5157a.O1(AbstractC5157a.this);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.AbstractClickableNode$onPointerEvent$3", f = "Clickable.kt", l = {1042}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.a$g */
    static final class g extends kotlin.coroutines.jvm.internal.j implements Function2<F, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f38907d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f38908e;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            g gVar = AbstractC5157a.this.new g(dVar);
            gVar.f38908e = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(F f7, kotlin.coroutines.d<? super Unit> dVar) {
            return ((g) create(f7, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f38907d;
            if (i11 == 0) {
                Sc.s.b(obj);
                F f7 = (F) this.f38908e;
                this.f38907d = 1;
                if (AbstractC5157a.this.T1(f7, this) == aVar) {
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

    public AbstractC5157a(t0.q qVar, InterfaceC8369J interfaceC8369J, boolean z11, String str, I1.i iVar, Function0 function0) {
        this.f38881c = qVar;
        this.f38882d = interfaceC8369J;
        this.f38883e = str;
        this.f38884f = iVar;
        this.f38885g = z11;
        this.f38886h = function0;
        this.f38888j = new C8402w(this.f38881c);
        t0.q qVar2 = this.f38881c;
        this.f38895q = qVar2;
        this.f38896r = qVar2 == null && this.f38882d != null;
        this.f38897s = f38880t;
    }

    public static final void N1(AbstractC5157a abstractC5157a) {
        if (abstractC5157a.f38892n == null) {
            t0.j jVar = new t0.j();
            t0.q qVar = abstractC5157a.f38881c;
            if (qVar != null) {
                C10727i.c(abstractC5157a.getCoroutineScope(), null, null, new androidx.compose.foundation.b(qVar, jVar, null), 3);
            }
            abstractC5157a.f38892n = jVar;
        }
    }

    public static final void O1(AbstractC5157a abstractC5157a) {
        t0.j jVar = abstractC5157a.f38892n;
        if (jVar != null) {
            t0.k kVar = new t0.k(jVar);
            t0.q qVar = abstractC5157a.f38881c;
            if (qVar != null) {
                C10727i.c(abstractC5157a.getCoroutineScope(), null, null, new androidx.compose.foundation.c(qVar, kVar, null), 3);
            }
            abstractC5157a.f38892n = null;
        }
    }

    private final void Y1() {
        InterfaceC8369J interfaceC8369J;
        if (this.f38890l == null && (interfaceC8369J = this.f38882d) != null) {
            if (this.f38881c == null) {
                this.f38881c = t0.p.a();
            }
            this.f38888j.N1(this.f38881c);
            t0.q qVar = this.f38881c;
            Intrinsics.f(qVar);
            InterfaceC2807j b11 = interfaceC8369J.b(qVar);
            I1(b11);
            this.f38890l = b11;
        }
    }

    @Override // D1.I0
    @NotNull
    public final Object K0() {
        return this.f38897s;
    }

    @Override // j1.e
    public final void L(@NotNull j1.w wVar) {
        if (wVar.a()) {
            Y1();
        }
        if (this.f38885g) {
            this.f38888j.L(wVar);
        }
    }

    public void S1(@NotNull D d11) {
    }

    public abstract Object T1(@NotNull F f7, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    protected final void U1() {
        t0.q qVar = this.f38881c;
        LinkedHashMap linkedHashMap = this.f38893o;
        if (qVar != null) {
            s.b bVar = this.f38891m;
            if (bVar != null) {
                qVar.tryEmit(new s.a(bVar));
            }
            t0.j jVar = this.f38892n;
            if (jVar != null) {
                qVar.tryEmit(new t0.k(jVar));
            }
            Iterator it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                qVar.tryEmit(new s.a((s.b) it.next()));
            }
        }
        this.f38891m = null;
        this.f38892n = null;
        linkedHashMap.clear();
    }

    protected final boolean V1() {
        return this.f38885g;
    }

    @NotNull
    protected final Function0<Unit> W1() {
        return this.f38886h;
    }

    protected final Object X1(@NotNull InterfaceC9143w interfaceC9143w, long j11, @NotNull kotlin.coroutines.jvm.internal.j jVar) {
        Object d11;
        t0.q qVar = this.f38881c;
        return (qVar == null || (d11 = xe.N.d(new androidx.compose.foundation.d(interfaceC9143w, j11, qVar, this, null), jVar)) != Wc.a.COROUTINE_SUSPENDED) ? Unit.f71690a : d11;
    }

    protected final void Z1() {
        N n11 = this.f38889k;
        if (n11 != null) {
            n11.v0();
            Unit unit = Unit.f71690a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0082, code lost:
    
        if (r3.f38890l == null) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void a2(t0.q qVar, InterfaceC8369J interfaceC8369J, boolean z11, String str, I1.i iVar, @NotNull Function0<Unit> function0) {
        boolean z12;
        InterfaceC2807j interfaceC2807j;
        boolean z13 = false;
        boolean z14 = true;
        if (Intrinsics.d(this.f38895q, qVar)) {
            z12 = false;
        } else {
            U1();
            this.f38895q = qVar;
            this.f38881c = qVar;
            z12 = true;
        }
        if (!Intrinsics.d(this.f38882d, interfaceC8369J)) {
            this.f38882d = interfaceC8369J;
            z12 = true;
        }
        boolean z15 = this.f38885g;
        C8402w c8402w = this.f38888j;
        if (z15 != z11) {
            InterfaceC2807j interfaceC2807j2 = this.f38887i;
            if (z11) {
                I1(interfaceC2807j2);
                I1(c8402w);
            } else {
                L1(interfaceC2807j2);
                L1(c8402w);
                U1();
            }
            C2809k.f(this).x0();
            this.f38885g = z11;
        }
        if (!Intrinsics.d(this.f38883e, str)) {
            this.f38883e = str;
            C2809k.f(this).x0();
        }
        if (!Intrinsics.d(this.f38884f, iVar)) {
            this.f38884f = iVar;
            C2809k.f(this).x0();
        }
        this.f38886h = function0;
        boolean z16 = this.f38896r;
        t0.q qVar2 = this.f38895q;
        if (z16 != (qVar2 == null && this.f38882d != null)) {
            if (qVar2 == null && this.f38882d != null) {
                z13 = true;
            }
            this.f38896r = z13;
            if (!z13) {
            }
        }
        z14 = z12;
        if (z14 && ((interfaceC2807j = this.f38890l) != null || !this.f38896r)) {
            if (interfaceC2807j != null) {
                L1(interfaceC2807j);
            }
            this.f38890l = null;
            Y1();
        }
        c8402w.N1(this.f38881c);
    }

    @Override // D1.E0
    public final void applySemantics(@NotNull D d11) {
        I1.i iVar = this.f38884f;
        if (iVar != null) {
            I1.z.q(d11, iVar.b());
        }
        String str = this.f38883e;
        b bVar = new b();
        int i11 = I1.z.f11793b;
        d11.b(I1.k.k(), new C3222a(str, bVar));
        if (this.f38885g) {
            this.f38888j.applySemantics(d11);
        } else {
            d11.b(I1.u.d(), Unit.f71690a);
        }
        S1(d11);
    }

    @Override // v1.InterfaceC10180e
    public final boolean g1(@NotNull KeyEvent keyEvent) {
        int b11;
        int b12;
        Y1();
        boolean z11 = this.f38885g;
        LinkedHashMap linkedHashMap = this.f38893o;
        if (z11) {
            int i11 = C8394o.f76211b;
            if (C10178c.a(C10179d.b(keyEvent), 2) && ((b12 = C10181f.b(C10179d.a(keyEvent))) == 23 || b12 == 66 || b12 == 160)) {
                if (!linkedHashMap.containsKey(C10176a.m(C10179d.a(keyEvent)))) {
                    s.b bVar = new s.b(this.f38894p);
                    linkedHashMap.put(C10176a.m(C10179d.a(keyEvent)), bVar);
                    if (this.f38881c != null) {
                        C10727i.c(getCoroutineScope(), null, null, new c(bVar, null), 3);
                    }
                    return true;
                }
                return false;
            }
        }
        if (this.f38885g) {
            int i12 = C8394o.f76211b;
            if (C10178c.a(C10179d.b(keyEvent), 1) && ((b11 = C10181f.b(C10179d.a(keyEvent))) == 23 || b11 == 66 || b11 == 160)) {
                s.b bVar2 = (s.b) linkedHashMap.remove(C10176a.m(C10179d.a(keyEvent)));
                if (bVar2 != null && this.f38881c != null) {
                    C10727i.c(getCoroutineScope(), null, null, new d(bVar2, null), 3);
                }
                this.f38886h.invoke();
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.e.c
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // D1.E0
    public final boolean getShouldMergeDescendantSemantics() {
        return true;
    }

    @Override // v1.InterfaceC10180e
    public final boolean j0(@NotNull KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.compose.ui.e.c
    public final void onAttach() {
        if (!this.f38896r) {
            Y1();
        }
        if (this.f38885g) {
            I1(this.f38887i);
            I1(this.f38888j);
        }
    }

    @Override // androidx.compose.ui.e.c
    public final void onDetach() {
        U1();
        if (this.f38895q == null) {
            this.f38881c = null;
        }
        InterfaceC2807j interfaceC2807j = this.f38890l;
        if (interfaceC2807j != null) {
            L1(interfaceC2807j);
        }
        this.f38890l = null;
    }

    @Override // D1.C0
    public final void p1(@NotNull C10638m c10638m, @NotNull EnumC10640o enumC10640o, long j11) {
        long j12 = ((j11 >> 33) << 32) | (((j11 << 32) >> 33) & 4294967295L);
        this.f38894p = P9.a.a((int) (j12 >> 32), (int) (j12 & 4294967295L));
        Y1();
        if (this.f38885g && enumC10640o == EnumC10640o.Main) {
            int e11 = c10638m.e();
            if (e11 == 4) {
                C10727i.c(getCoroutineScope(), null, null, new e(null), 3);
            } else if (e11 == 5) {
                C10727i.c(getCoroutineScope(), null, null, new f(null), 3);
            }
        }
        if (this.f38889k == null) {
            g gVar = new g(null);
            int i11 = L.f104834b;
            S s11 = new S(null, null, null, gVar);
            I1(s11);
            this.f38889k = s11;
        }
        N n11 = this.f38889k;
        if (n11 != null) {
            n11.p1(c10638m, enumC10640o, j11);
        }
    }

    @Override // D1.C0
    public final void r0() {
        t0.j jVar;
        t0.q qVar = this.f38881c;
        if (qVar != null && (jVar = this.f38892n) != null) {
            qVar.tryEmit(new t0.k(jVar));
        }
        this.f38892n = null;
        N n11 = this.f38889k;
        if (n11 != null) {
            n11.r0();
        }
    }
}
