package androidx.fragment.app;

import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.EnumC0718m;
import androidx.lifecycle.EnumC0719n;
import com.salamadev.nabilalawadi.kisaskoran.R;
import io.sentry.protocol.SentryThread;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p155w1.V0;

/* JADX INFO: loaded from: classes.dex */
public final class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V0 f9414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p072k1.g f9415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC0701v f9416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9417d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9418e = -1;

    public V(V0 v6, p072k1.g gVar, AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v) {
        this.f9414a = v6;
        this.f9415b = gVar;
        this.f9416c = abstractComponentCallbacksC0701v;
    }

    public final void a() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v = this.f9416c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + abstractComponentCallbacksC0701v);
        }
        Bundle bundle = abstractComponentCallbacksC0701v.f9532b;
        if (bundle != null) {
            bundle.getBundle("savedInstanceState");
        }
        abstractComponentCallbacksC0701v.f9515L.P();
        abstractComponentCallbacksC0701v.f9530a = 3;
        abstractComponentCallbacksC0701v.f9524U = false;
        abstractComponentCallbacksC0701v.o();
        if (!abstractComponentCallbacksC0701v.f9524U) {
            throw new c0("Fragment " + abstractComponentCallbacksC0701v + " did not call through to super.onActivityCreated()");
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + abstractComponentCallbacksC0701v);
        }
        abstractComponentCallbacksC0701v.f9532b = null;
        S s7 = abstractComponentCallbacksC0701v.f9515L;
        s7.f9374G = false;
        s7.f9375H = false;
        s7.f9381N.f9413i = false;
        s7.u(4);
        this.f9414a.A(abstractComponentCallbacksC0701v, false);
    }

    public final void b() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v = this.f9416c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "moveto ATTACHED: " + abstractComponentCallbacksC0701v);
        }
        AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v2 = abstractComponentCallbacksC0701v.f9543x;
        V v6 = null;
        p072k1.g gVar = this.f9415b;
        if (abstractComponentCallbacksC0701v2 != null) {
            V v7 = (V) ((HashMap) gVar.f14681b).get(abstractComponentCallbacksC0701v2.f9537e);
            if (v7 == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0701v + " declared target fragment " + abstractComponentCallbacksC0701v.f9543x + " that does not belong to this FragmentManager!");
            }
            abstractComponentCallbacksC0701v.f9544y = abstractComponentCallbacksC0701v.f9543x.f9537e;
            abstractComponentCallbacksC0701v.f9543x = null;
            v6 = v7;
        } else {
            String str = abstractComponentCallbacksC0701v.f9544y;
            if (str != null && (v6 = (V) ((HashMap) gVar.f14681b).get(str)) == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(abstractComponentCallbacksC0701v);
                sb.append(" declared target fragment ");
                throw new IllegalStateException(p031e1.k.i(sb, abstractComponentCallbacksC0701v.f9544y, " that does not belong to this FragmentManager!"));
            }
        }
        if (v6 != null) {
            v6.j();
        }
        Q q7 = abstractComponentCallbacksC0701v.f9513J;
        abstractComponentCallbacksC0701v.f9514K = q7.f9403v;
        abstractComponentCallbacksC0701v.f9516M = q7.f9405x;
        V0 v8 = this.f9414a;
        v8.G(abstractComponentCallbacksC0701v, false);
        ArrayList arrayList = abstractComponentCallbacksC0701v.f9541g0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((r) it.next()).a();
        }
        arrayList.clear();
        abstractComponentCallbacksC0701v.f9515L.b(abstractComponentCallbacksC0701v.f9514K, abstractComponentCallbacksC0701v.d(), abstractComponentCallbacksC0701v);
        abstractComponentCallbacksC0701v.f9530a = 0;
        abstractComponentCallbacksC0701v.f9524U = false;
        abstractComponentCallbacksC0701v.q(abstractComponentCallbacksC0701v.f9514K.f9552b);
        if (!abstractComponentCallbacksC0701v.f9524U) {
            throw new c0("Fragment " + abstractComponentCallbacksC0701v + " did not call through to super.onAttach()");
        }
        Iterator it2 = abstractComponentCallbacksC0701v.f9513J.f9396o.iterator();
        while (it2.hasNext()) {
            ((U) it2.next()).a(abstractComponentCallbacksC0701v);
        }
        S s7 = abstractComponentCallbacksC0701v.f9515L;
        s7.f9374G = false;
        s7.f9375H = false;
        s7.f9381N.f9413i = false;
        s7.u(0);
        v8.B(abstractComponentCallbacksC0701v, false);
    }

    public final int c() {
        C0692l c0692l;
        Object obj;
        Object next;
        AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v = this.f9416c;
        if (abstractComponentCallbacksC0701v.f9513J == null) {
            return abstractComponentCallbacksC0701v.f9530a;
        }
        int iMin = this.f9418e;
        int iOrdinal = abstractComponentCallbacksC0701v.c0.ordinal();
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (abstractComponentCallbacksC0701v.f9508E) {
            iMin = abstractComponentCallbacksC0701v.f9509F ? Math.max(this.f9418e, 2) : this.f9418e < 4 ? Math.min(iMin, abstractComponentCallbacksC0701v.f9530a) : Math.min(iMin, 1);
        }
        if (!abstractComponentCallbacksC0701v.f9505B) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0701v.f9525V;
        if (viewGroup != null) {
            t6.h.d(abstractComponentCallbacksC0701v.i().I(), "fragmentManager.specialEffectsControllerFactory");
            Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
            if (tag instanceof C0692l) {
                c0692l = (C0692l) tag;
            } else {
                c0692l = new C0692l(viewGroup);
                viewGroup.setTag(R.id.special_effects_controller_view_tag, c0692l);
            }
            c0692l.getClass();
            Iterator it = c0692l.f9467b.iterator();
            do {
                obj = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                ((a0) next).getClass();
            } while (!t6.h.a(null, abstractComponentCallbacksC0701v));
            for (Object obj2 : c0692l.f9468c) {
                ((a0) obj2).getClass();
                if (t6.h.a(null, abstractComponentCallbacksC0701v)) {
                    obj = obj2;
                    break;
                }
            }
        }
        if (abstractComponentCallbacksC0701v.f9506C) {
            iMin = abstractComponentCallbacksC0701v.n() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (abstractComponentCallbacksC0701v.f9526W && abstractComponentCallbacksC0701v.f9530a < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (abstractComponentCallbacksC0701v.f9507D && abstractComponentCallbacksC0701v.f9525V != null) {
            iMin = Math.max(iMin, 3);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + abstractComponentCallbacksC0701v);
        }
        return iMin;
    }

    public final void d() {
        Bundle bundle;
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v = this.f9416c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "moveto CREATED: " + abstractComponentCallbacksC0701v);
        }
        Bundle bundle2 = abstractComponentCallbacksC0701v.f9532b;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
        if (abstractComponentCallbacksC0701v.f9531a0) {
            abstractComponentCallbacksC0701v.f9530a = 1;
            Bundle bundle4 = abstractComponentCallbacksC0701v.f9532b;
            if (bundle4 == null || (bundle = bundle4.getBundle("childFragmentManager")) == null) {
                return;
            }
            abstractComponentCallbacksC0701v.f9515L.U(bundle);
            S s7 = abstractComponentCallbacksC0701v.f9515L;
            s7.f9374G = false;
            s7.f9375H = false;
            s7.f9381N.f9413i = false;
            s7.u(1);
            return;
        }
        V0 v6 = this.f9414a;
        v6.H(abstractComponentCallbacksC0701v, false);
        abstractComponentCallbacksC0701v.f9515L.P();
        abstractComponentCallbacksC0701v.f9530a = 1;
        abstractComponentCallbacksC0701v.f9524U = false;
        abstractComponentCallbacksC0701v.f9536d0.a(new C0699t(abstractComponentCallbacksC0701v));
        abstractComponentCallbacksC0701v.r(bundle3);
        abstractComponentCallbacksC0701v.f9531a0 = true;
        if (abstractComponentCallbacksC0701v.f9524U) {
            abstractComponentCallbacksC0701v.f9536d0.e(EnumC0718m.ON_CREATE);
            v6.C(abstractComponentCallbacksC0701v, false);
        } else {
            throw new c0("Fragment " + abstractComponentCallbacksC0701v + " did not call through to super.onCreate()");
        }
    }

    public final void e() {
        String resourceName;
        AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v = this.f9416c;
        if (abstractComponentCallbacksC0701v.f9508E) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0701v);
        }
        Bundle bundle = abstractComponentCallbacksC0701v.f9532b;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterV = abstractComponentCallbacksC0701v.v(bundle2);
        ViewGroup viewGroup2 = abstractComponentCallbacksC0701v.f9525V;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i7 = abstractComponentCallbacksC0701v.f9518O;
            if (i7 != 0) {
                if (i7 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + abstractComponentCallbacksC0701v + " for a container view with no id");
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC0701v.f9513J.f9404w.b(i7);
                if (viewGroup == null) {
                    if (!abstractComponentCallbacksC0701v.f9510G) {
                        try {
                            resourceName = abstractComponentCallbacksC0701v.B().getResources().getResourceName(abstractComponentCallbacksC0701v.f9518O);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC0701v.f9518O) + " (" + resourceName + ") for fragment " + abstractComponentCallbacksC0701v);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    p071k0.c cVar = p071k0.d.f14662a;
                    p071k0.d.b(new p071k0.e(abstractComponentCallbacksC0701v, viewGroup, 1));
                    p071k0.d.a(abstractComponentCallbacksC0701v).getClass();
                }
            }
        }
        abstractComponentCallbacksC0701v.f9525V = viewGroup;
        abstractComponentCallbacksC0701v.A(layoutInflaterV, viewGroup, bundle2);
        abstractComponentCallbacksC0701v.f9530a = 2;
    }

    public final void f() {
        AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701vQ;
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v = this.f9416c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "movefrom CREATED: " + abstractComponentCallbacksC0701v);
        }
        boolean zIsChangingConfigurations = true;
        boolean z4 = abstractComponentCallbacksC0701v.f9506C && !abstractComponentCallbacksC0701v.n();
        p072k1.g gVar = this.f9415b;
        if (z4) {
            gVar.Q(abstractComponentCallbacksC0701v.f9537e, null);
        }
        if (!z4) {
            T t7 = (T) gVar.f14683d;
            if (!((t7.f9408d.containsKey(abstractComponentCallbacksC0701v.f9537e) && t7.f9411g) ? t7.f9412h : true)) {
                String str = abstractComponentCallbacksC0701v.f9544y;
                if (str != null && (abstractComponentCallbacksC0701vQ = gVar.q(str)) != null && abstractComponentCallbacksC0701vQ.f9522S) {
                    abstractComponentCallbacksC0701v.f9543x = abstractComponentCallbacksC0701vQ;
                }
                abstractComponentCallbacksC0701v.f9530a = 0;
                return;
            }
        }
        C0705z c0705z = abstractComponentCallbacksC0701v.f9514K;
        if (c0705z != null) {
            zIsChangingConfigurations = ((T) gVar.f14683d).f9412h;
        } else {
            A a2 = c0705z.f9552b;
            if (a2 != null) {
                zIsChangingConfigurations = true ^ a2.isChangingConfigurations();
            }
        }
        if (z4 || zIsChangingConfigurations) {
            ((T) gVar.f14683d).c(abstractComponentCallbacksC0701v, false);
        }
        abstractComponentCallbacksC0701v.f9515L.l();
        abstractComponentCallbacksC0701v.f9536d0.e(EnumC0718m.ON_DESTROY);
        abstractComponentCallbacksC0701v.f9530a = 0;
        abstractComponentCallbacksC0701v.f9524U = false;
        abstractComponentCallbacksC0701v.f9531a0 = false;
        abstractComponentCallbacksC0701v.s();
        if (!abstractComponentCallbacksC0701v.f9524U) {
            throw new c0("Fragment " + abstractComponentCallbacksC0701v + " did not call through to super.onDestroy()");
        }
        this.f9414a.D(abstractComponentCallbacksC0701v, false);
        for (V v6 : gVar.t()) {
            if (v6 != null) {
                String str2 = abstractComponentCallbacksC0701v.f9537e;
                AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v2 = v6.f9416c;
                if (str2.equals(abstractComponentCallbacksC0701v2.f9544y)) {
                    abstractComponentCallbacksC0701v2.f9543x = abstractComponentCallbacksC0701v;
                    abstractComponentCallbacksC0701v2.f9544y = null;
                }
            }
        }
        String str3 = abstractComponentCallbacksC0701v.f9544y;
        if (str3 != null) {
            abstractComponentCallbacksC0701v.f9543x = gVar.q(str3);
        }
        gVar.I(this);
    }

    public final void g() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v = this.f9416c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + abstractComponentCallbacksC0701v);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0701v.f9525V;
        abstractComponentCallbacksC0701v.f9515L.u(1);
        abstractComponentCallbacksC0701v.f9530a = 1;
        abstractComponentCallbacksC0701v.f9524U = false;
        abstractComponentCallbacksC0701v.t();
        if (!abstractComponentCallbacksC0701v.f9524U) {
            throw new c0("Fragment " + abstractComponentCallbacksC0701v + " did not call through to super.onDestroyView()");
        }
        p122r.m mVar = p095n0.a.a(abstractComponentCallbacksC0701v).f15300b.f15297d;
        int i7 = mVar.f16017c;
        for (int i8 = 0; i8 < i7; i8++) {
            ((p095n0.b) mVar.f16016b[i8]).j();
        }
        abstractComponentCallbacksC0701v.f9511H = false;
        this.f9414a.M(abstractComponentCallbacksC0701v, false);
        abstractComponentCallbacksC0701v.f9525V = null;
        abstractComponentCallbacksC0701v.f9538e0.i(null);
        abstractComponentCallbacksC0701v.f9509F = false;
    }

    public final void h() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v = this.f9416c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + abstractComponentCallbacksC0701v);
        }
        abstractComponentCallbacksC0701v.f9530a = -1;
        abstractComponentCallbacksC0701v.f9524U = false;
        abstractComponentCallbacksC0701v.u();
        if (!abstractComponentCallbacksC0701v.f9524U) {
            throw new c0("Fragment " + abstractComponentCallbacksC0701v + " did not call through to super.onDetach()");
        }
        S s7 = abstractComponentCallbacksC0701v.f9515L;
        if (!s7.f9376I) {
            s7.l();
            abstractComponentCallbacksC0701v.f9515L = new S();
        }
        this.f9414a.E(abstractComponentCallbacksC0701v, false);
        abstractComponentCallbacksC0701v.f9530a = -1;
        abstractComponentCallbacksC0701v.f9514K = null;
        abstractComponentCallbacksC0701v.f9516M = null;
        abstractComponentCallbacksC0701v.f9513J = null;
        if (!abstractComponentCallbacksC0701v.f9506C || abstractComponentCallbacksC0701v.n()) {
            T t7 = (T) this.f9415b.f14683d;
            boolean z4 = true;
            if (t7.f9408d.containsKey(abstractComponentCallbacksC0701v.f9537e) && t7.f9411g) {
                z4 = t7.f9412h;
            }
            if (!z4) {
                return;
            }
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0701v);
        }
        abstractComponentCallbacksC0701v.k();
    }

    public final void i() {
        AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v = this.f9416c;
        if (abstractComponentCallbacksC0701v.f9508E && abstractComponentCallbacksC0701v.f9509F && !abstractComponentCallbacksC0701v.f9511H) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0701v);
            }
            Bundle bundle = abstractComponentCallbacksC0701v.f9532b;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            abstractComponentCallbacksC0701v.A(abstractComponentCallbacksC0701v.v(bundle2), null, bundle2);
        }
    }

    public final void j() {
        p072k1.g gVar = this.f9415b;
        boolean z4 = this.f9417d;
        AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v = this.f9416c;
        if (z4) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + abstractComponentCallbacksC0701v);
                return;
            }
            return;
        }
        try {
            this.f9417d = true;
            boolean z7 = false;
            while (true) {
                int iC = c();
                int i7 = abstractComponentCallbacksC0701v.f9530a;
                if (iC == i7) {
                    if (!z7 && i7 == -1 && abstractComponentCallbacksC0701v.f9506C && !abstractComponentCallbacksC0701v.n()) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + abstractComponentCallbacksC0701v);
                        }
                        ((T) gVar.f14683d).c(abstractComponentCallbacksC0701v, true);
                        gVar.I(this);
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0701v);
                        }
                        abstractComponentCallbacksC0701v.k();
                    }
                    if (abstractComponentCallbacksC0701v.f9529Z) {
                        Q q7 = abstractComponentCallbacksC0701v.f9513J;
                        if (q7 != null && abstractComponentCallbacksC0701v.f9505B && Q.K(abstractComponentCallbacksC0701v)) {
                            q7.f9373F = true;
                        }
                        abstractComponentCallbacksC0701v.f9529Z = false;
                        abstractComponentCallbacksC0701v.f9515L.o();
                    }
                    return;
                }
                if (iC <= i7) {
                    switch (i7 - 1) {
                        case -1:
                            h();
                            break;
                        case 0:
                            f();
                            break;
                        case 1:
                            g();
                            abstractComponentCallbacksC0701v.f9530a = 1;
                            break;
                        case 2:
                            abstractComponentCallbacksC0701v.f9509F = false;
                            abstractComponentCallbacksC0701v.f9530a = 2;
                            break;
                        case 3:
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + abstractComponentCallbacksC0701v);
                            }
                            abstractComponentCallbacksC0701v.f9530a = 3;
                            break;
                        case 4:
                            o();
                            break;
                        case 5:
                            abstractComponentCallbacksC0701v.f9530a = 5;
                            break;
                        case 6:
                            k();
                            break;
                    }
                } else {
                    switch (i7 + 1) {
                        case 0:
                            b();
                            break;
                        case 1:
                            d();
                            break;
                        case 2:
                            i();
                            e();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            abstractComponentCallbacksC0701v.f9530a = 4;
                            break;
                        case 5:
                            n();
                            break;
                        case 6:
                            abstractComponentCallbacksC0701v.f9530a = 6;
                            break;
                        case 7:
                            m();
                            break;
                    }
                }
                z7 = true;
            }
        } finally {
            this.f9417d = false;
        }
    }

    public final void k() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v = this.f9416c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "movefrom RESUMED: " + abstractComponentCallbacksC0701v);
        }
        abstractComponentCallbacksC0701v.f9515L.u(5);
        abstractComponentCallbacksC0701v.f9536d0.e(EnumC0718m.ON_PAUSE);
        abstractComponentCallbacksC0701v.f9530a = 6;
        abstractComponentCallbacksC0701v.f9524U = true;
        this.f9414a.F(abstractComponentCallbacksC0701v, false);
    }

    public final void l(ClassLoader classLoader) {
        AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v = this.f9416c;
        Bundle bundle = abstractComponentCallbacksC0701v.f9532b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (abstractComponentCallbacksC0701v.f9532b.getBundle("savedInstanceState") == null) {
            abstractComponentCallbacksC0701v.f9532b.putBundle("savedInstanceState", new Bundle());
        }
        try {
            abstractComponentCallbacksC0701v.f9534c = abstractComponentCallbacksC0701v.f9532b.getSparseParcelableArray("viewState");
            abstractComponentCallbacksC0701v.f9535d = abstractComponentCallbacksC0701v.f9532b.getBundle("viewRegistryState");
            FragmentState fragmentState = (FragmentState) abstractComponentCallbacksC0701v.f9532b.getParcelable(SentryThread.JsonKeys.STATE);
            if (fragmentState != null) {
                abstractComponentCallbacksC0701v.f9544y = fragmentState.f9342C;
                abstractComponentCallbacksC0701v.f9545z = fragmentState.f9343D;
                abstractComponentCallbacksC0701v.f9527X = fragmentState.f9344E;
            }
            if (abstractComponentCallbacksC0701v.f9527X) {
                return;
            }
            abstractComponentCallbacksC0701v.f9526W = true;
        } catch (BadParcelableException e7) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + abstractComponentCallbacksC0701v, e7);
        }
    }

    public final void m() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v = this.f9416c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "moveto RESUMED: " + abstractComponentCallbacksC0701v);
        }
        C0700u c0700u = abstractComponentCallbacksC0701v.f9528Y;
        View view = c0700u == null ? null : c0700u.j;
        if (view != null) {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            }
        }
        abstractComponentCallbacksC0701v.f().j = null;
        abstractComponentCallbacksC0701v.f9515L.P();
        abstractComponentCallbacksC0701v.f9515L.A(true);
        abstractComponentCallbacksC0701v.f9530a = 7;
        abstractComponentCallbacksC0701v.f9524U = false;
        abstractComponentCallbacksC0701v.w();
        if (!abstractComponentCallbacksC0701v.f9524U) {
            throw new c0("Fragment " + abstractComponentCallbacksC0701v + " did not call through to super.onResume()");
        }
        abstractComponentCallbacksC0701v.f9536d0.e(EnumC0718m.ON_RESUME);
        S s7 = abstractComponentCallbacksC0701v.f9515L;
        s7.f9374G = false;
        s7.f9375H = false;
        s7.f9381N.f9413i = false;
        s7.u(7);
        this.f9414a.I(abstractComponentCallbacksC0701v, false);
        this.f9415b.Q(abstractComponentCallbacksC0701v.f9537e, null);
        abstractComponentCallbacksC0701v.f9532b = null;
        abstractComponentCallbacksC0701v.f9534c = null;
        abstractComponentCallbacksC0701v.f9535d = null;
    }

    public final void n() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v = this.f9416c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "moveto STARTED: " + abstractComponentCallbacksC0701v);
        }
        abstractComponentCallbacksC0701v.f9515L.P();
        abstractComponentCallbacksC0701v.f9515L.A(true);
        abstractComponentCallbacksC0701v.f9530a = 5;
        abstractComponentCallbacksC0701v.f9524U = false;
        abstractComponentCallbacksC0701v.y();
        if (!abstractComponentCallbacksC0701v.f9524U) {
            throw new c0("Fragment " + abstractComponentCallbacksC0701v + " did not call through to super.onStart()");
        }
        abstractComponentCallbacksC0701v.f9536d0.e(EnumC0718m.ON_START);
        S s7 = abstractComponentCallbacksC0701v.f9515L;
        s7.f9374G = false;
        s7.f9375H = false;
        s7.f9381N.f9413i = false;
        s7.u(5);
        this.f9414a.K(abstractComponentCallbacksC0701v, false);
    }

    public final void o() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v = this.f9416c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "movefrom STARTED: " + abstractComponentCallbacksC0701v);
        }
        S s7 = abstractComponentCallbacksC0701v.f9515L;
        s7.f9375H = true;
        s7.f9381N.f9413i = true;
        s7.u(4);
        abstractComponentCallbacksC0701v.f9536d0.e(EnumC0718m.ON_STOP);
        abstractComponentCallbacksC0701v.f9530a = 4;
        abstractComponentCallbacksC0701v.f9524U = false;
        abstractComponentCallbacksC0701v.z();
        if (abstractComponentCallbacksC0701v.f9524U) {
            this.f9414a.L(abstractComponentCallbacksC0701v, false);
            return;
        }
        throw new c0("Fragment " + abstractComponentCallbacksC0701v + " did not call through to super.onStop()");
    }

    public V(V0 v6, p072k1.g gVar, ClassLoader classLoader, J j, Bundle bundle) {
        this.f9414a = v6;
        this.f9415b = gVar;
        FragmentState fragmentState = (FragmentState) bundle.getParcelable(SentryThread.JsonKeys.STATE);
        AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701vA = j.a(fragmentState.f9345a);
        abstractComponentCallbacksC0701vA.f9537e = fragmentState.f9346b;
        abstractComponentCallbacksC0701vA.f9508E = fragmentState.f9347c;
        abstractComponentCallbacksC0701vA.f9510G = true;
        abstractComponentCallbacksC0701vA.f9517N = fragmentState.f9348d;
        abstractComponentCallbacksC0701vA.f9518O = fragmentState.f9349e;
        abstractComponentCallbacksC0701vA.f9519P = fragmentState.f9350f;
        abstractComponentCallbacksC0701vA.f9522S = fragmentState.f9351x;
        abstractComponentCallbacksC0701vA.f9506C = fragmentState.f9352y;
        abstractComponentCallbacksC0701vA.f9521R = fragmentState.f9353z;
        abstractComponentCallbacksC0701vA.f9520Q = fragmentState.f9340A;
        abstractComponentCallbacksC0701vA.c0 = EnumC0719n.values()[fragmentState.f9341B];
        abstractComponentCallbacksC0701vA.f9544y = fragmentState.f9342C;
        abstractComponentCallbacksC0701vA.f9545z = fragmentState.f9343D;
        abstractComponentCallbacksC0701vA.f9527X = fragmentState.f9344E;
        this.f9416c = abstractComponentCallbacksC0701vA;
        abstractComponentCallbacksC0701vA.f9532b = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        Q q7 = abstractComponentCallbacksC0701vA.f9513J;
        if (q7 != null && (q7.f9374G || q7.f9375H)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        abstractComponentCallbacksC0701vA.f9539f = bundle2;
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Instantiated fragment " + abstractComponentCallbacksC0701vA);
        }
    }

    public V(V0 v6, p072k1.g gVar, AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v, Bundle bundle) {
        this.f9414a = v6;
        this.f9415b = gVar;
        this.f9416c = abstractComponentCallbacksC0701v;
        abstractComponentCallbacksC0701v.f9534c = null;
        abstractComponentCallbacksC0701v.f9535d = null;
        abstractComponentCallbacksC0701v.f9512I = 0;
        abstractComponentCallbacksC0701v.f9509F = false;
        abstractComponentCallbacksC0701v.f9505B = false;
        AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v2 = abstractComponentCallbacksC0701v.f9543x;
        abstractComponentCallbacksC0701v.f9544y = abstractComponentCallbacksC0701v2 != null ? abstractComponentCallbacksC0701v2.f9537e : null;
        abstractComponentCallbacksC0701v.f9543x = null;
        abstractComponentCallbacksC0701v.f9532b = bundle;
        abstractComponentCallbacksC0701v.f9539f = bundle.getBundle("arguments");
    }
}
