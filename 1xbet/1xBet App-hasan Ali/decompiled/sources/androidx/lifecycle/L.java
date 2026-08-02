package androidx.lifecycle;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.internal.ads.C1071hd;
import game.betting133.sports1xbet.R;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;
import p4.AbstractC2282w;
import t3.AbstractC2425d;

/* loaded from: classes.dex */
public abstract class L {

    /* renamed from: a, reason: collision with root package name */
    public static final Q1.j f7019a = new Q1.j(19);

    /* renamed from: b, reason: collision with root package name */
    public static final Q1.j f7020b = new Q1.j(20);

    /* renamed from: c, reason: collision with root package name */
    public static final Q1.j f7021c = new Q1.j(21);

    /* renamed from: d, reason: collision with root package name */
    public static final F1.c f7022d = new F1.c();

    public L() {
        new AtomicReference(null);
    }

    public static final void b(S s2, v3.g gVar, L l5) {
        kotlin.jvm.internal.l.f("registry", gVar);
        kotlin.jvm.internal.l.f("lifecycle", l5);
        K k5 = (K) s2.getCloseable("androidx.lifecycle.savedstate.vm.tag");
        if (k5 == null || k5.f7018m) {
            return;
        }
        k5.m(l5, gVar);
        m(l5, gVar);
    }

    public static final K c(v3.g gVar, L l5, String str, Bundle bundle) {
        J j5;
        kotlin.jvm.internal.l.f("registry", gVar);
        kotlin.jvm.internal.l.f("lifecycle", l5);
        Bundle u5 = gVar.u(str);
        if (u5 != null) {
            bundle = u5;
        }
        if (bundle == null) {
            j5 = new J();
        } else {
            ClassLoader classLoader = J.class.getClassLoader();
            kotlin.jvm.internal.l.c(classLoader);
            bundle.setClassLoader(classLoader);
            Y3.g gVar2 = new Y3.g(bundle.size());
            for (String str2 : bundle.keySet()) {
                kotlin.jvm.internal.l.c(str2);
                gVar2.put(str2, bundle.get(str2));
            }
            j5 = new J(X3.z.Q(gVar2));
        }
        K k5 = new K(str, j5);
        k5.m(l5, gVar);
        m(l5, gVar);
        return k5;
    }

    public static final J d(D1.b bVar) {
        J j5;
        kotlin.jvm.internal.l.f("<this>", bVar);
        U1.e eVar = (U1.e) bVar.a(f7019a);
        if (eVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        Y y5 = (Y) bVar.a(f7020b);
        if (y5 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) bVar.a(f7021c);
        String str = (String) bVar.a(W.f7041b);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        U1.d A3 = eVar.b().A();
        Bundle bundle2 = null;
        M m5 = A3 instanceof M ? (M) A3 : null;
        if (m5 == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LinkedHashMap linkedHashMap = i(y5).f7027a;
        J j6 = (J) linkedHashMap.get(str);
        if (j6 != null) {
            return j6;
        }
        m5.b();
        Bundle bundle3 = m5.f7025c;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = AbstractC2425d.l((W3.h[]) Arrays.copyOf(new W3.h[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                m5.f7025c = null;
            }
            bundle2 = bundle4;
        }
        if (bundle2 != null) {
            bundle = bundle2;
        }
        if (bundle == null) {
            j5 = new J();
        } else {
            ClassLoader classLoader = J.class.getClassLoader();
            kotlin.jvm.internal.l.c(classLoader);
            bundle.setClassLoader(classLoader);
            Y3.g gVar = new Y3.g(bundle.size());
            for (String str2 : bundle.keySet()) {
                kotlin.jvm.internal.l.c(str2);
                gVar.put(str2, bundle.get(str2));
            }
            j5 = new J(X3.z.Q(gVar));
        }
        linkedHashMap.put(str, j5);
        return j5;
    }

    public static final void e(U1.e eVar) {
        EnumC0487p h3 = eVar.g().h();
        if (h3 != EnumC0487p.f7059l && h3 != EnumC0487p.f7060m) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (eVar.b().A() == null) {
            M m5 = new M(eVar.b(), (Y) eVar);
            eVar.b().C("androidx.lifecycle.internal.SavedStateHandlesProvider", m5);
            eVar.g().a(new C0476e(1, m5));
        }
    }

    public static final InterfaceC0491u f(View view) {
        kotlin.jvm.internal.l.f("<this>", view);
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            InterfaceC0491u interfaceC0491u = tag instanceof InterfaceC0491u ? (InterfaceC0491u) tag : null;
            if (interfaceC0491u != null) {
                return interfaceC0491u;
            }
            Object v4 = G4.d.v(view);
            view = v4 instanceof View ? (View) v4 : null;
        }
        return null;
    }

    public static final Y g(View view) {
        kotlin.jvm.internal.l.f("<this>", view);
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            Y y5 = tag instanceof Y ? (Y) tag : null;
            if (y5 != null) {
                return y5;
            }
            Object v4 = G4.d.v(view);
            view = v4 instanceof View ? (View) v4 : null;
        }
        return null;
    }

    public static final N i(Y y5) {
        W e3 = Q1.j.e(y5, new G1.q(1), 4);
        return (N) ((C1071hd) e3.f7042a).h(kotlin.jvm.internal.x.a(N.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final F1.a j(S s2) {
        F1.a aVar;
        synchronized (f7022d) {
            aVar = (F1.a) s2.getCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (aVar == null) {
                a4.h hVar = a4.i.f6649k;
                try {
                    w4.e eVar = p4.D.f18743a;
                    hVar = u4.m.f20109a.f18897p;
                } catch (W3.g | IllegalStateException unused) {
                }
                F1.a aVar2 = new F1.a(hVar.m(AbstractC2282w.b()));
                s2.addCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", aVar2);
                aVar = aVar2;
            }
        }
        return aVar;
    }

    public static final void l(View view, InterfaceC0491u interfaceC0491u) {
        kotlin.jvm.internal.l.f("<this>", view);
        view.setTag(R.id.view_tree_lifecycle_owner, interfaceC0491u);
    }

    public static void m(L l5, v3.g gVar) {
        EnumC0487p h3 = l5.h();
        if (h3 == EnumC0487p.f7059l || h3.compareTo(EnumC0487p.f7061n) >= 0) {
            gVar.D();
        } else {
            l5.a(new C0479h(l5, gVar));
        }
    }

    public abstract void a(InterfaceC0490t interfaceC0490t);

    public abstract EnumC0487p h();

    public abstract void k(InterfaceC0490t interfaceC0490t);
}
