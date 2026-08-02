package Y80;

import B4.C2577f;
import B4.C2584m;
import B4.H;
import B4.L;
import B90.k0;
import Sc.s;
import Y80.l;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.J;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k;
import androidx.fragment.app.G;
import androidx.fragment.app.Q;
import androidx.fragment.app.r;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.B;
import androidx.lifecycle.E;
import androidx.lifecycle.I0;
import j80.C7308a;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.H0;
import xe.L0;
import xe.M;

/* loaded from: classes3.dex */
public class g {

    /* renamed from: g, reason: collision with root package name */
    private static boolean f34801g;

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<l> f34802a;

    /* renamed from: c, reason: collision with root package name */
    private B0 f34804c;

    /* renamed from: d, reason: collision with root package name */
    private B0 f34805d;

    /* renamed from: e, reason: collision with root package name */
    private B0 f34806e;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private m f34803b = new m();

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Handler f34807f = new Handler(Looper.getMainLooper());

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.navjet.JetNav$pop$1", f = "JetNav.kt", l = {431}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f34808d;

        /* renamed from: Y80.g$a$a, reason: collision with other inner class name */
        public static final class C0640a extends AbstractC7737t implements Function0<Unit> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ g f34810b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0640a(g gVar) {
                super(0);
                this.f34810b = gVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                C2584m f72996o = this.f34810b.Y0().getF72996o();
                if (f72996o != null) {
                    f72996o.N();
                }
                return Unit.f71690a;
            }
        }

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return g.this.new a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f34808d;
            if (i11 == 0) {
                s.b(obj);
                g gVar = g.this;
                AbstractC5434v m11 = gVar.Y0().m();
                if (m11 != null) {
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    C10720e0 c10720e0 = C10720e0.f105451a;
                    L0 x11 = De.s.f6650a.x();
                    boolean t2 = x11.t(getContext());
                    if (!t2) {
                        if (m11.b() == AbstractC5434v.b.DESTROYED) {
                            throw new E(null);
                        }
                        if (m11.b().compareTo(bVar) >= 0) {
                            C2584m f72996o = gVar.Y0().getF72996o();
                            if (f72996o != null) {
                                f72996o.N();
                            }
                            Unit unit = Unit.f71690a;
                        }
                    }
                    C0640a c0640a = new C0640a(gVar);
                    this.f34808d = 1;
                    if (I0.a(m11, bVar, t2, x11, c0640a, this) == aVar) {
                        return aVar;
                    }
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.navjet.JetNav$popOver$1", f = "JetNav.kt", l = {431}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f34811d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentCallbacksC5392m f34813f;

        public static final class a extends AbstractC7737t implements Function0<Unit> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ g f34814b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ComponentCallbacksC5392m f34815c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(g gVar, ComponentCallbacksC5392m componentCallbacksC5392m) {
                super(0);
                this.f34814b = gVar;
                this.f34815c = componentCallbacksC5392m;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                G v11 = this.f34814b.Y0().v();
                if (v11 != null) {
                    Q p11 = v11.p();
                    ComponentCallbacksC5392m componentCallbacksC5392m = this.f34815c;
                    Intrinsics.f(componentCallbacksC5392m);
                    p11.q(componentCallbacksC5392m);
                    p11.l();
                }
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ComponentCallbacksC5392m componentCallbacksC5392m, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f34813f = componentCallbacksC5392m;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return g.this.new b(this.f34813f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f34811d;
            if (i11 == 0) {
                s.b(obj);
                g gVar = g.this;
                AbstractC5434v m11 = gVar.Y0().m();
                if (m11 != null) {
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    C10720e0 c10720e0 = C10720e0.f105451a;
                    L0 x11 = De.s.f6650a.x();
                    boolean t2 = x11.t(getContext());
                    ComponentCallbacksC5392m componentCallbacksC5392m = this.f34813f;
                    if (!t2) {
                        if (m11.b() == AbstractC5434v.b.DESTROYED) {
                            throw new E(null);
                        }
                        if (m11.b().compareTo(bVar) >= 0) {
                            G v11 = gVar.Y0().v();
                            if (v11 != null) {
                                Q p11 = v11.p();
                                Intrinsics.f(componentCallbacksC5392m);
                                p11.q(componentCallbacksC5392m);
                                p11.l();
                            }
                            Unit unit = Unit.f71690a;
                        }
                    }
                    a aVar2 = new a(gVar, componentCallbacksC5392m);
                    this.f34811d = 1;
                    if (I0.a(m11, bVar, t2, x11, aVar2, this) == aVar) {
                        return aVar;
                    }
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

    public static void a(g gVar, int i11, Bundle bundle) {
        gVar.c1(i11, false, bundle);
    }

    private final void c1(int i11, boolean z11, Bundle bundle) {
        g gVar;
        AbstractC5434v m11 = Y0().m();
        B0 b02 = null;
        AbstractC5434v.b b11 = m11 != null ? m11.b() : null;
        L80.a.a("PINPADER_PERF", System.currentTimeMillis() + " JetNav navigate currentState=" + b11);
        if (b11 == AbstractC5434v.b.STARTED || b11 == AbstractC5434v.b.RESUMED) {
            h1(i11, z11, bundle);
            return;
        }
        B0 b03 = this.f34804c;
        if (b03 != null) {
            ((H0) b03).j(null);
        }
        B f7 = Y0().f();
        if (f7 != null) {
            gVar = this;
            b02 = C10727i.c(f7, null, null, new f(gVar, i11, bundle, z11, null), 3);
        } else {
            gVar = this;
        }
        gVar.f34804c = b02;
    }

    private final void g1(C2584m c2584m, int i11, Bundle bundle) {
        Y80.b bVar = new Y80.b(c2584m, i11, bundle);
        if (Intrinsics.d(Looper.myLooper(), Looper.getMainLooper())) {
            L80.a.a("PINPADER_PERF", System.currentTimeMillis() + " JetNav main  RUN ");
            bVar.run();
            return;
        }
        L80.a.a("PINPADER_PERF", System.currentTimeMillis() + " JetNav post  RUN ");
        this.f34807f.post(new k0(bVar, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h1(final int i11, boolean z11, final Bundle bundle) {
        H y11;
        L80.a.a("PINPADER_PERF", System.currentTimeMillis() + " JetNav navigateStarted");
        C2584m f72996o = Y0().getF72996o();
        if (f72996o == null) {
            if (z11) {
                this.f34807f.post(new Runnable() { // from class: Y80.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.a(g.this, i11, bundle);
                    }
                });
                return;
            }
            return;
        }
        L A11 = f72996o.A();
        if (A11.C(Y0().getF72988Q(), A11, false) == null || (y11 = f72996o.y()) == null || f72996o.A().F() != y11.m()) {
            g1(f72996o, i11, bundle);
            return;
        }
        L A12 = f72996o.A();
        H C11 = A12.C(Y0().getF72988Q(), A12, false);
        Intrinsics.g(C11, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        L l11 = (L) C11;
        C2577f i12 = l11.i(i11);
        Integer valueOf = i12 != null ? Integer.valueOf(i12.b()) : null;
        if (valueOf != null) {
            l11.J(valueOf.intValue());
            Integer e11 = Y0().e();
            g1(f72996o, e11 != null ? e11.intValue() : 0, bundle);
        }
    }

    public static void i1(g gVar, int i11, Bundle bundle, int i12) {
        if ((i12 & 2) != 0) {
            bundle = null;
        }
        gVar.c1(i11, true, bundle);
    }

    public final List<ComponentCallbacksC5392m> A0() {
        Object obj;
        G childFragmentManager;
        G n11 = Y0().n();
        if (n11 != null && n11.r0().size() > 0) {
            List<ComponentCallbacksC5392m> r02 = n11.r0();
            Intrinsics.checkNotNullExpressionValue(r02, "getFragments(...)");
            Iterator<T> it = r02.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((ComponentCallbacksC5392m) obj) instanceof E4.k) {
                    break;
                }
            }
            ComponentCallbacksC5392m componentCallbacksC5392m = (ComponentCallbacksC5392m) obj;
            if (componentCallbacksC5392m != null && (childFragmentManager = componentCallbacksC5392m.getChildFragmentManager()) != null) {
                return childFragmentManager.r0();
            }
        }
        return null;
    }

    public final void E() {
        ComponentCallbacksC5392m L02 = L0();
        B0 b02 = this.f34806e;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        B f7 = Y0().f();
        this.f34806e = f7 != null ? C10727i.c(f7, null, null, new b(L02, null), 3) : null;
    }

    public final boolean H0(@NotNull final ComponentCallbacksC5392m toRemove) {
        Intrinsics.checkNotNullParameter(toRemove, "toRemove");
        final G v11 = Y0().v();
        if (v11 == null) {
            return false;
        }
        try {
            H30.k.b(new Function0() { // from class: Y80.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Q p11 = G.this.p();
                    p11.q(toRemove);
                    p11.k();
                    return Unit.f71690a;
                }
            });
            return false;
        } catch (Exception e11) {
            L80.a.b("JetNav", "error removing over fragment e=" + e11);
            return false;
        }
    }

    public final ComponentCallbacksC5392m L0() {
        List<ComponentCallbacksC5392m> r02;
        G v11 = Y0().v();
        if (v11 == null || (r02 = v11.r0()) == null) {
            return null;
        }
        return (ComponentCallbacksC5392m) C7714v.Z(r02);
    }

    public final void M0(@NotNull l80.f navProvider) {
        Intrinsics.checkNotNullParameter(navProvider, "navProvider");
        if (Y0().equals(navProvider)) {
            this.f34802a = null;
        }
    }

    public final void O() {
        this.f34803b.b(false);
        B0 b02 = this.f34804c;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
    }

    public final ComponentCallbacksC5392m U() {
        Object obj;
        G childFragmentManager;
        List<ComponentCallbacksC5392m> r02;
        G n11 = Y0().n();
        if (n11 != null) {
            List<ComponentCallbacksC5392m> r03 = n11.r0();
            Intrinsics.checkNotNullExpressionValue(r03, "getFragments(...)");
            if (!r03.isEmpty()) {
                List<ComponentCallbacksC5392m> r04 = n11.r0();
                Intrinsics.checkNotNullExpressionValue(r04, "getFragments(...)");
                Iterator<T> it = r04.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((ComponentCallbacksC5392m) obj) instanceof E4.k) {
                        break;
                    }
                }
                ComponentCallbacksC5392m componentCallbacksC5392m = (ComponentCallbacksC5392m) obj;
                if (componentCallbacksC5392m != null && (childFragmentManager = componentCallbacksC5392m.getChildFragmentManager()) != null && (r02 = childFragmentManager.r0()) != null) {
                    return (ComponentCallbacksC5392m) C7714v.Z(r02);
                }
            }
        }
        return null;
    }

    public final void W0() {
        G v11 = Y0().v();
        if (v11 != null) {
            Q p11 = v11.p();
            Intrinsics.checkNotNullExpressionValue(p11, "beginTransaction(...)");
            List<ComponentCallbacksC5392m> r02 = v11.r0();
            Intrinsics.checkNotNullExpressionValue(r02, "getFragments(...)");
            Iterator<T> it = r02.iterator();
            while (it.hasNext()) {
                p11.q((ComponentCallbacksC5392m) it.next());
            }
            p11.l();
        }
    }

    @NotNull
    protected final Handler X0() {
        return this.f34807f;
    }

    @NotNull
    public final l Y0() {
        l lVar;
        WeakReference<l> weakReference = this.f34802a;
        if (weakReference != null && (lVar = weakReference.get()) != null) {
            return lVar;
        }
        l.f34852b0.getClass();
        return l.a.a();
    }

    @NotNull
    public final m Z0() {
        return this.f34803b;
    }

    public final boolean a1(int i11) {
        C2584m f72996o = Y0().getF72996o();
        return f72996o != null && f72996o.A().F() == i11;
    }

    public final void b() {
        l Y02 = Y0();
        l.f34852b0.getClass();
        if (Y02.equals(l.a.a())) {
            f34801g = true;
        } else {
            f34801g = false;
            Y02.b();
        }
    }

    public final boolean b1() {
        H y11;
        C2584m f72996o = Y0().getF72996o();
        return (f72996o == null || (y11 = f72996o.y()) == null || f72996o.A().F() != y11.m()) ? false : true;
    }

    @NotNull
    public final Map<Integer, List<ComponentCallbacksC5392m>> d() {
        return Y0().d();
    }

    public final void d1(int i11) {
        Integer num = (Integer) C7714v.M(Y0().q());
        this.f34803b.b(num == null || num.intValue() != i11);
        com.google.android.material.bottomnavigation.c t2 = Y0().t();
        if (t2 != null) {
            t2.setSelectedItemId(i11);
        }
    }

    public final void e1(@NotNull final DialogInterfaceOnCancelListenerC5390k dialogFragment) {
        Intrinsics.checkNotNullParameter(dialogFragment, "dialogFragment");
        final G v11 = Y0().v();
        if (v11 != null) {
            try {
                H30.k.b(new Function0() { // from class: Y80.c
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        DialogInterfaceOnCancelListenerC5390k dialogInterfaceOnCancelListenerC5390k = DialogInterfaceOnCancelListenerC5390k.this;
                        dialogInterfaceOnCancelListenerC5390k.showNow(v11, dialogInterfaceOnCancelListenerC5390k.getClass().getSimpleName() + " + " + System.currentTimeMillis());
                        return Unit.f71690a;
                    }
                });
            } catch (Exception unused) {
                L80.a.b("JetNav", "error creating over fragment");
            }
        }
    }

    public final void f1(@NotNull final E30.c fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        L80.a.a("PINPADER_PERF", "navigateOverFragmentScreen " + Y0().v());
        final G v11 = Y0().v();
        if (v11 != null) {
            try {
                final C7308a c7308a = (C7308a) this;
                H30.k.b(new Function0() { // from class: Y80.e
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        C7308a c7308a2 = C7308a.this;
                        L80.a.a("PINPADER_PERF", "navigateOverFragmentScreen " + c7308a2.Y0().getF72990S());
                        Integer f72990s = c7308a2.Y0().getF72990S();
                        if (f72990s != null) {
                            int intValue = f72990s.intValue();
                            Q p11 = v11.p();
                            E30.c cVar = fragment;
                            p11.b(intValue, cVar, String.valueOf(cVar.getClass()));
                            p11.l();
                        }
                        return Unit.f71690a;
                    }
                });
            } catch (Exception unused) {
                L80.a.b("JSContext", "error creating over fragment");
            }
        }
    }

    public final ComponentCallbacksC5392m h0() {
        Object obj;
        G childFragmentManager;
        List<ComponentCallbacksC5392m> r02;
        G n11 = Y0().n();
        if (n11 != null) {
            List<ComponentCallbacksC5392m> r03 = n11.r0();
            Intrinsics.checkNotNullExpressionValue(r03, "getFragments(...)");
            if (!r03.isEmpty()) {
                List<ComponentCallbacksC5392m> r04 = n11.r0();
                Intrinsics.checkNotNullExpressionValue(r04, "getFragments(...)");
                Iterator<T> it = r04.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((ComponentCallbacksC5392m) obj) instanceof E4.k) {
                        break;
                    }
                }
                ComponentCallbacksC5392m componentCallbacksC5392m = (ComponentCallbacksC5392m) obj;
                if (componentCallbacksC5392m != null && (childFragmentManager = componentCallbacksC5392m.getChildFragmentManager()) != null && (r02 = childFragmentManager.r0()) != null) {
                    return r02.size() > 1 ? (ComponentCallbacksC5392m) C7714v.Z(C7714v.E(r02)) : (ComponentCallbacksC5392m) C7714v.Z(r02);
                }
            }
        }
        return null;
    }

    public final List<ComponentCallbacksC5392m> i0() {
        G v11 = Y0().v();
        if (v11 != null) {
            return v11.r0();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    public final boolean j1() {
        r activity;
        J onBackPressedDispatcher;
        G childFragmentManager;
        E4.k kVar;
        ComponentCallbacksC5392m U10;
        r activity2;
        J onBackPressedDispatcher2;
        Integer num = (Integer) C7714v.M(Y0().q());
        com.google.android.material.bottomnavigation.c t2 = Y0().t();
        if (t2 == null) {
            G n11 = Y0().n();
            E4.k kVar2 = null;
            if (n11 != null && n11.r0().size() > 0) {
                List<ComponentCallbacksC5392m> r02 = n11.r0();
                Intrinsics.checkNotNullExpressionValue(r02, "getFragments(...)");
                Iterator it = r02.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        kVar = 0;
                        break;
                    }
                    kVar = it.next();
                    if (((ComponentCallbacksC5392m) kVar) instanceof E4.k) {
                        break;
                    }
                }
                if (kVar instanceof E4.k) {
                    kVar2 = kVar;
                }
            }
            ComponentCallbacksC5392m U11 = U();
            if (((kVar2 == null || (childFragmentManager = kVar2.getChildFragmentManager()) == null) ? 0 : childFragmentManager.l0()) > 1) {
                if (!((U11 == null || (activity = U11.getActivity()) == null || (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) == null || !onBackPressedDispatcher.j()) ? false : true)) {
                    C2584m f72996o = Y0().getF72996o();
                    if (f72996o != null) {
                        f72996o.N();
                    }
                    return true;
                }
            }
        } else if (!b1() || (U10 = U()) == null || (activity2 = U10.getActivity()) == null || (onBackPressedDispatcher2 = activity2.getOnBackPressedDispatcher()) == null || !onBackPressedDispatcher2.j()) {
            boolean b12 = b1();
            m mVar = this.f34803b;
            if (b12 && mVar.a() && num != null) {
                t2.setSelectedItemId(num.intValue());
                mVar.b(false);
                return true;
            }
            if (b1() && !mVar.a()) {
                int selectedItemId = t2.getSelectedItemId();
                if ((num == null || selectedItemId != num.intValue()) && num != null) {
                    t2.setSelectedItemId(num.intValue());
                    return true;
                }
            }
        }
        return false;
    }

    public final void k1(@NotNull l80.f jetNavProvider) {
        Intrinsics.checkNotNullParameter(jetNavProvider, "jetNavProvider");
        this.f34802a = new WeakReference<>(jetNavProvider);
        if (f34801g) {
            b();
        }
    }

    public final void pop() {
        if (b1()) {
            return;
        }
        B0 b02 = this.f34805d;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        B f7 = Y0().f();
        this.f34805d = f7 != null ? C10727i.c(f7, null, null, new a(null), 3) : null;
    }
}
