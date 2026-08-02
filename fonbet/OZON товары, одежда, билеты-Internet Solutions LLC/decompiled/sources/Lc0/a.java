package Lc0;

import Ae.C2408n0;
import Ae.C2417s0;
import Ae.InterfaceC2395h;
import Nc0.g;
import Sc.InterfaceC4008j;
import Sc.k;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7719a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import xe.C10720e0;
import xe.C10727i;
import xe.J;
import xe.M;
import xe.N;

/* loaded from: classes3.dex */
public final class a extends w0 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f16712a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Bc0.a f16713b;

    /* renamed from: c, reason: collision with root package name */
    private final String f16714c;

    /* renamed from: d, reason: collision with root package name */
    private final String f16715d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f16716e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f16717f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f16718g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final C2417s0 f16719h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f16720i;

    /* renamed from: j, reason: collision with root package name */
    private Long f16721j;

    /* renamed from: Lc0.a$a, reason: collision with other inner class name */
    /* synthetic */ class C0318a extends C7719a implements InterfaceC6511n<Integer, g.a, kotlin.coroutines.d<? super g.a>, Object> {
        @Override // fd.InterfaceC6511n
        public final Object invoke(Integer num, g.a aVar, kotlin.coroutines.d<? super g.a> dVar) {
            return a.e0((a) this.receiver, num.intValue(), aVar);
        }
    }

    static final class b extends AbstractC7737t implements Function0<InterfaceC2395h<? extends Pc0.g>> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ib0.c f16723c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Ib0.c cVar) {
            super(0);
            this.f16723c = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final InterfaceC2395h<? extends Pc0.g> invoke() {
            return new C2408n0(a.this.g0().p(), new Lc0.b(this.f16723c, null));
        }
    }

    static final class c extends AbstractC7737t implements Function1<Boolean, Unit> {
        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            if (!bool.booleanValue()) {
                a.this.g0().q();
            }
            return Unit.f71690a;
        }
    }

    static final class d extends AbstractC7737t implements Function1<Boolean, Unit> {
        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            if (!bool.booleanValue()) {
                a.this.g0().l();
            }
            return Unit.f71690a;
        }
    }

    static final class e extends AbstractC7737t implements Function0<Unit> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            a.this.n0();
            return Unit.f71690a;
        }
    }

    static final class f extends AbstractC7737t implements Function0<M> {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final M invoke() {
            a aVar = a.this;
            return N.g(x0.a(aVar), new Lc0.c(J.f105405n0, aVar));
        }
    }

    public a(boolean z11, @NotNull Bc0.a diModule, String str, Ib0.c cVar, String str2, @NotNull Function0<Unit> onCleared) {
        Intrinsics.checkNotNullParameter(diModule, "diModule");
        Intrinsics.checkNotNullParameter(onCleared, "onCleared");
        this.f16712a = z11;
        this.f16713b = diModule;
        this.f16714c = str;
        this.f16715d = str2;
        this.f16716e = onCleared;
        this.f16717f = k.b(new f());
        e eVar = new e();
        this.f16718g = eVar;
        this.f16719h = new C2417s0(i0().i(), i0().s(), new C0318a(3, this, a.class, "createNavButtonsState", "createNavButtonsState(ILru/ozon/id/nativeauth/main/container/NavigationButtonsHolder$NavButtonsState;)Lru/ozon/id/nativeauth/main/container/NavigationButtonsHolder$NavButtonsState;", 4));
        this.f16720i = k.b(new b(cVar));
        i0().b(eVar);
        n0();
    }

    public static final g.a e0(a aVar, int i11, g.a aVar2) {
        aVar.getClass();
        boolean z11 = false;
        boolean z12 = i11 > 1;
        if (aVar2 == null) {
            if (aVar.f16712a && !z12) {
                z11 = true;
            }
            aVar2 = new g.a(z12, z11);
        }
        return aVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pc0.c g0() {
        return this.f16713b.h().getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n0() {
        String str = this.f16714c;
        if (str == null || h.K(str)) {
            g0().E(this.f16715d);
            return;
        }
        M m11 = (M) this.f16717f.getValue();
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(m11, He.b.f10879b, null, new Lc0.d(this, str, null), 2);
    }

    @NotNull
    public final Bc0.a h0() {
        return this.f16713b;
    }

    @NotNull
    public final Nc0.f i0() {
        return this.f16713b.l().getValue();
    }

    @NotNull
    public final C2417s0 j0() {
        return this.f16719h;
    }

    @NotNull
    public final InterfaceC2395h<Pc0.g> k0() {
        return (InterfaceC2395h) this.f16720i.getValue();
    }

    public final void l0() {
        if (i0().w() != null) {
            Function1<Function1<? super Boolean, Unit>, Unit> w11 = i0().w();
            if (w11 != null) {
                w11.invoke(new d());
                return;
            }
            return;
        }
        if (i0().l() == null) {
            g0().l();
            return;
        }
        Function0<Boolean> l11 = i0().l();
        if (l11 != null ? l11.invoke().booleanValue() : false) {
            return;
        }
        g0().l();
    }

    public final void m0() {
        i0().y(null);
    }

    public final void onBackButtonClicked() {
        long currentTimeMillis = System.currentTimeMillis();
        Long l11 = this.f16721j;
        if (l11 == null || currentTimeMillis - l11.longValue() > 500) {
            this.f16721j = Long.valueOf(currentTimeMillis);
            if (i0().n() != null) {
                Function1<Function1<? super Boolean, Unit>, Unit> n11 = i0().n();
                if (n11 != null) {
                    n11.invoke(new c());
                    return;
                }
                return;
            }
            if (i0().x() == null) {
                g0().q();
                return;
            }
            Function0<Boolean> x11 = i0().x();
            if (x11 != null ? x11.invoke().booleanValue() : false) {
                return;
            }
            g0().q();
        }
    }

    @Override // androidx.lifecycle.w0
    protected final void onCleared() {
        i0().d(this.f16718g);
        this.f16716e.invoke();
        super.onCleared();
    }
}
