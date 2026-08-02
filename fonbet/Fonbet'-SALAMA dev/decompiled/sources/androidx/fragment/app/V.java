package androidx.fragment.app;

import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.EnumC0739m;
import androidx.lifecycle.EnumC0740n;
import com.salamadev.khotabaljomo3a.kichkabdelhamid.R;
import io.sentry.protocol.SentryThread;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import k0.AbstractC1326d;
import k0.C1325c;
import k0.C1327e;
import n0.AbstractC1445a;
import w1.V0;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final V0 f9414a;

    /* renamed from: b, reason: collision with root package name */
    public final k1.g f9415b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC0722v f9416c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9417d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f9418e = -1;

    public V(V0 v02, k1.g gVar, AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v) {
        this.f9414a = v02;
        this.f9415b = gVar;
        this.f9416c = abstractComponentCallbacksC0722v;
    }

    public final void a() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v = this.f9416c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + abstractComponentCallbacksC0722v);
        }
        Bundle bundle = abstractComponentCallbacksC0722v.f9532b;
        if (bundle != null) {
            bundle.getBundle("savedInstanceState");
        }
        abstractComponentCallbacksC0722v.f9515L.P();
        abstractComponentCallbacksC0722v.f9530a = 3;
        abstractComponentCallbacksC0722v.f9524U = false;
        abstractComponentCallbacksC0722v.o();
        if (!abstractComponentCallbacksC0722v.f9524U) {
            throw new c0("Fragment " + abstractComponentCallbacksC0722v + " did not call through to super.onActivityCreated()");
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + abstractComponentCallbacksC0722v);
        }
        abstractComponentCallbacksC0722v.f9532b = null;
        S s7 = abstractComponentCallbacksC0722v.f9515L;
        s7.f9374G = false;
        s7.f9375H = false;
        s7.f9381N.f9413i = false;
        s7.u(4);
        this.f9414a.A(abstractComponentCallbacksC0722v, false);
    }

    public final void b() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v = this.f9416c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto ATTACHED: " + abstractComponentCallbacksC0722v);
        }
        AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v2 = abstractComponentCallbacksC0722v.f9543x;
        V v6 = null;
        k1.g gVar = this.f9415b;
        if (abstractComponentCallbacksC0722v2 != null) {
            V v7 = (V) ((HashMap) gVar.f14675b).get(abstractComponentCallbacksC0722v2.f9537e);
            if (v7 == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0722v + " declared target fragment " + abstractComponentCallbacksC0722v.f9543x + " that does not belong to this FragmentManager!");
            }
            abstractComponentCallbacksC0722v.f9544y = abstractComponentCallbacksC0722v.f9543x.f9537e;
            abstractComponentCallbacksC0722v.f9543x = null;
            v6 = v7;
        } else {
            String str = abstractComponentCallbacksC0722v.f9544y;
            if (str != null && (v6 = (V) ((HashMap) gVar.f14675b).get(str)) == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(abstractComponentCallbacksC0722v);
                sb.append(" declared target fragment ");
                throw new IllegalStateException(e1.k.i(sb, abstractComponentCallbacksC0722v.f9544y, " that does not belong to this FragmentManager!"));
            }
        }
        if (v6 != null) {
            v6.j();
        }
        Q q7 = abstractComponentCallbacksC0722v.f9513J;
        abstractComponentCallbacksC0722v.f9514K = q7.f9403v;
        abstractComponentCallbacksC0722v.f9516M = q7.f9405x;
        V0 v02 = this.f9414a;
        v02.G(abstractComponentCallbacksC0722v, false);
        ArrayList arrayList = abstractComponentCallbacksC0722v.f9541g0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((r) it.next()).a();
        }
        arrayList.clear();
        abstractComponentCallbacksC0722v.f9515L.b(abstractComponentCallbacksC0722v.f9514K, abstractComponentCallbacksC0722v.d(), abstractComponentCallbacksC0722v);
        abstractComponentCallbacksC0722v.f9530a = 0;
        abstractComponentCallbacksC0722v.f9524U = false;
        abstractComponentCallbacksC0722v.q(abstractComponentCallbacksC0722v.f9514K.f9552b);
        if (!abstractComponentCallbacksC0722v.f9524U) {
            throw new c0("Fragment " + abstractComponentCallbacksC0722v + " did not call through to super.onAttach()");
        }
        Iterator it2 = abstractComponentCallbacksC0722v.f9513J.f9396o.iterator();
        while (it2.hasNext()) {
            ((U) it2.next()).a(abstractComponentCallbacksC0722v);
        }
        S s7 = abstractComponentCallbacksC0722v.f9515L;
        s7.f9374G = false;
        s7.f9375H = false;
        s7.f9381N.f9413i = false;
        s7.u(0);
        v02.B(abstractComponentCallbacksC0722v, false);
    }

    public final int c() {
        C0713l c0713l;
        Object obj;
        Object obj2;
        AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v = this.f9416c;
        if (abstractComponentCallbacksC0722v.f9513J == null) {
            return abstractComponentCallbacksC0722v.f9530a;
        }
        int i7 = this.f9418e;
        int ordinal = abstractComponentCallbacksC0722v.c0.ordinal();
        if (ordinal == 1) {
            i7 = Math.min(i7, 0);
        } else if (ordinal == 2) {
            i7 = Math.min(i7, 1);
        } else if (ordinal == 3) {
            i7 = Math.min(i7, 5);
        } else if (ordinal != 4) {
            i7 = Math.min(i7, -1);
        }
        if (abstractComponentCallbacksC0722v.f9508E) {
            i7 = abstractComponentCallbacksC0722v.f9509F ? Math.max(this.f9418e, 2) : this.f9418e < 4 ? Math.min(i7, abstractComponentCallbacksC0722v.f9530a) : Math.min(i7, 1);
        }
        if (!abstractComponentCallbacksC0722v.f9505B) {
            i7 = Math.min(i7, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0722v.f9525V;
        if (viewGroup != null) {
            t6.h.d(abstractComponentCallbacksC0722v.i().I(), "fragmentManager.specialEffectsControllerFactory");
            Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
            if (tag instanceof C0713l) {
                c0713l = (C0713l) tag;
            } else {
                c0713l = new C0713l(viewGroup);
                viewGroup.setTag(R.id.special_effects_controller_view_tag, c0713l);
            }
            c0713l.getClass();
            Iterator it = c0713l.f9467b.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                ((a0) obj2).getClass();
                if (t6.h.a(null, abstractComponentCallbacksC0722v)) {
                    break;
                }
            }
            Iterator it2 = c0713l.f9468c.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                ((a0) next).getClass();
                if (t6.h.a(null, abstractComponentCallbacksC0722v)) {
                    obj = next;
                    break;
                }
            }
        }
        if (abstractComponentCallbacksC0722v.f9506C) {
            i7 = abstractComponentCallbacksC0722v.n() ? Math.min(i7, 1) : Math.min(i7, -1);
        }
        if (abstractComponentCallbacksC0722v.f9526W && abstractComponentCallbacksC0722v.f9530a < 5) {
            i7 = Math.min(i7, 4);
        }
        if (abstractComponentCallbacksC0722v.f9507D && abstractComponentCallbacksC0722v.f9525V != null) {
            i7 = Math.max(i7, 3);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i7 + " for " + abstractComponentCallbacksC0722v);
        }
        return i7;
    }

    public final void d() {
        Bundle bundle;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v = this.f9416c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto CREATED: " + abstractComponentCallbacksC0722v);
        }
        Bundle bundle2 = abstractComponentCallbacksC0722v.f9532b;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
        if (abstractComponentCallbacksC0722v.f9531a0) {
            abstractComponentCallbacksC0722v.f9530a = 1;
            Bundle bundle4 = abstractComponentCallbacksC0722v.f9532b;
            if (bundle4 == null || (bundle = bundle4.getBundle("childFragmentManager")) == null) {
                return;
            }
            abstractComponentCallbacksC0722v.f9515L.U(bundle);
            S s7 = abstractComponentCallbacksC0722v.f9515L;
            s7.f9374G = false;
            s7.f9375H = false;
            s7.f9381N.f9413i = false;
            s7.u(1);
            return;
        }
        V0 v02 = this.f9414a;
        v02.H(abstractComponentCallbacksC0722v, false);
        abstractComponentCallbacksC0722v.f9515L.P();
        abstractComponentCallbacksC0722v.f9530a = 1;
        abstractComponentCallbacksC0722v.f9524U = false;
        abstractComponentCallbacksC0722v.f9536d0.a(new C0720t(abstractComponentCallbacksC0722v));
        abstractComponentCallbacksC0722v.r(bundle3);
        abstractComponentCallbacksC0722v.f9531a0 = true;
        if (abstractComponentCallbacksC0722v.f9524U) {
            abstractComponentCallbacksC0722v.f9536d0.e(EnumC0739m.ON_CREATE);
            v02.C(abstractComponentCallbacksC0722v, false);
        } else {
            throw new c0("Fragment " + abstractComponentCallbacksC0722v + " did not call through to super.onCreate()");
        }
    }

    public final void e() {
        String str;
        AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v = this.f9416c;
        if (abstractComponentCallbacksC0722v.f9508E) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0722v);
        }
        Bundle bundle = abstractComponentCallbacksC0722v.f9532b;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater v6 = abstractComponentCallbacksC0722v.v(bundle2);
        ViewGroup viewGroup2 = abstractComponentCallbacksC0722v.f9525V;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i7 = abstractComponentCallbacksC0722v.f9518O;
            if (i7 != 0) {
                if (i7 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + abstractComponentCallbacksC0722v + " for a container view with no id");
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC0722v.f9513J.f9404w.b(i7);
                if (viewGroup == null) {
                    if (!abstractComponentCallbacksC0722v.f9510G) {
                        try {
                            str = abstractComponentCallbacksC0722v.B().getResources().getResourceName(abstractComponentCallbacksC0722v.f9518O);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC0722v.f9518O) + " (" + str + ") for fragment " + abstractComponentCallbacksC0722v);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    C1325c c1325c = AbstractC1326d.f14656a;
                    AbstractC1326d.b(new C1327e(abstractComponentCallbacksC0722v, viewGroup, 1));
                    AbstractC1326d.a(abstractComponentCallbacksC0722v).getClass();
                }
            }
        }
        abstractComponentCallbacksC0722v.f9525V = viewGroup;
        abstractComponentCallbacksC0722v.A(v6, viewGroup, bundle2);
        abstractComponentCallbacksC0722v.f9530a = 2;
    }

    public final void f() {
        AbstractComponentCallbacksC0722v q7;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v = this.f9416c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom CREATED: " + abstractComponentCallbacksC0722v);
        }
        boolean z4 = true;
        boolean z7 = abstractComponentCallbacksC0722v.f9506C && !abstractComponentCallbacksC0722v.n();
        k1.g gVar = this.f9415b;
        if (z7) {
            gVar.Q(abstractComponentCallbacksC0722v.f9537e, null);
        }
        if (!z7) {
            T t7 = (T) gVar.f14677d;
            if (!((t7.f9408d.containsKey(abstractComponentCallbacksC0722v.f9537e) && t7.f9411g) ? t7.f9412h : true)) {
                String str = abstractComponentCallbacksC0722v.f9544y;
                if (str != null && (q7 = gVar.q(str)) != null && q7.f9522S) {
                    abstractComponentCallbacksC0722v.f9543x = q7;
                }
                abstractComponentCallbacksC0722v.f9530a = 0;
                return;
            }
        }
        C0726z c0726z = abstractComponentCallbacksC0722v.f9514K;
        if (c0726z != null) {
            z4 = ((T) gVar.f14677d).f9412h;
        } else {
            A a2 = c0726z.f9552b;
            if (a2 != null) {
                z4 = true ^ a2.isChangingConfigurations();
            }
        }
        if (z7 || z4) {
            ((T) gVar.f14677d).c(abstractComponentCallbacksC0722v, false);
        }
        abstractComponentCallbacksC0722v.f9515L.l();
        abstractComponentCallbacksC0722v.f9536d0.e(EnumC0739m.ON_DESTROY);
        abstractComponentCallbacksC0722v.f9530a = 0;
        abstractComponentCallbacksC0722v.f9524U = false;
        abstractComponentCallbacksC0722v.f9531a0 = false;
        abstractComponentCallbacksC0722v.s();
        if (!abstractComponentCallbacksC0722v.f9524U) {
            throw new c0("Fragment " + abstractComponentCallbacksC0722v + " did not call through to super.onDestroy()");
        }
        this.f9414a.D(abstractComponentCallbacksC0722v, false);
        Iterator it = gVar.t().iterator();
        while (it.hasNext()) {
            V v6 = (V) it.next();
            if (v6 != null) {
                String str2 = abstractComponentCallbacksC0722v.f9537e;
                AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v2 = v6.f9416c;
                if (str2.equals(abstractComponentCallbacksC0722v2.f9544y)) {
                    abstractComponentCallbacksC0722v2.f9543x = abstractComponentCallbacksC0722v;
                    abstractComponentCallbacksC0722v2.f9544y = null;
                }
            }
        }
        String str3 = abstractComponentCallbacksC0722v.f9544y;
        if (str3 != null) {
            abstractComponentCallbacksC0722v.f9543x = gVar.q(str3);
        }
        gVar.I(this);
    }

    public final void g() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v = this.f9416c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + abstractComponentCallbacksC0722v);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0722v.f9525V;
        abstractComponentCallbacksC0722v.f9515L.u(1);
        abstractComponentCallbacksC0722v.f9530a = 1;
        abstractComponentCallbacksC0722v.f9524U = false;
        abstractComponentCallbacksC0722v.t();
        if (!abstractComponentCallbacksC0722v.f9524U) {
            throw new c0("Fragment " + abstractComponentCallbacksC0722v + " did not call through to super.onDestroyView()");
        }
        r.m mVar = AbstractC1445a.a(abstractComponentCallbacksC0722v).f15294b.f15291d;
        int i7 = mVar.f16011c;
        for (int i8 = 0; i8 < i7; i8++) {
            ((n0.b) mVar.f16010b[i8]).j();
        }
        abstractComponentCallbacksC0722v.f9511H = false;
        this.f9414a.M(abstractComponentCallbacksC0722v, false);
        abstractComponentCallbacksC0722v.f9525V = null;
        abstractComponentCallbacksC0722v.f9538e0.i(null);
        abstractComponentCallbacksC0722v.f9509F = false;
    }

    public final void h() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v = this.f9416c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + abstractComponentCallbacksC0722v);
        }
        abstractComponentCallbacksC0722v.f9530a = -1;
        abstractComponentCallbacksC0722v.f9524U = false;
        abstractComponentCallbacksC0722v.u();
        if (!abstractComponentCallbacksC0722v.f9524U) {
            throw new c0("Fragment " + abstractComponentCallbacksC0722v + " did not call through to super.onDetach()");
        }
        S s7 = abstractComponentCallbacksC0722v.f9515L;
        if (!s7.f9376I) {
            s7.l();
            abstractComponentCallbacksC0722v.f9515L = new S();
        }
        this.f9414a.E(abstractComponentCallbacksC0722v, false);
        abstractComponentCallbacksC0722v.f9530a = -1;
        abstractComponentCallbacksC0722v.f9514K = null;
        abstractComponentCallbacksC0722v.f9516M = null;
        abstractComponentCallbacksC0722v.f9513J = null;
        if (!abstractComponentCallbacksC0722v.f9506C || abstractComponentCallbacksC0722v.n()) {
            T t7 = (T) this.f9415b.f14677d;
            boolean z4 = true;
            if (t7.f9408d.containsKey(abstractComponentCallbacksC0722v.f9537e) && t7.f9411g) {
                z4 = t7.f9412h;
            }
            if (!z4) {
                return;
            }
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0722v);
        }
        abstractComponentCallbacksC0722v.k();
    }

    public final void i() {
        AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v = this.f9416c;
        if (abstractComponentCallbacksC0722v.f9508E && abstractComponentCallbacksC0722v.f9509F && !abstractComponentCallbacksC0722v.f9511H) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0722v);
            }
            Bundle bundle = abstractComponentCallbacksC0722v.f9532b;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            abstractComponentCallbacksC0722v.A(abstractComponentCallbacksC0722v.v(bundle2), null, bundle2);
        }
    }

    public final void j() {
        k1.g gVar = this.f9415b;
        boolean z4 = this.f9417d;
        AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v = this.f9416c;
        if (z4) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + abstractComponentCallbacksC0722v);
                return;
            }
            return;
        }
        try {
            this.f9417d = true;
            boolean z7 = false;
            while (true) {
                int c3 = c();
                int i7 = abstractComponentCallbacksC0722v.f9530a;
                if (c3 == i7) {
                    if (!z7 && i7 == -1 && abstractComponentCallbacksC0722v.f9506C && !abstractComponentCallbacksC0722v.n()) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + abstractComponentCallbacksC0722v);
                        }
                        ((T) gVar.f14677d).c(abstractComponentCallbacksC0722v, true);
                        gVar.I(this);
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0722v);
                        }
                        abstractComponentCallbacksC0722v.k();
                    }
                    if (abstractComponentCallbacksC0722v.f9529Z) {
                        Q q7 = abstractComponentCallbacksC0722v.f9513J;
                        if (q7 != null && abstractComponentCallbacksC0722v.f9505B && Q.K(abstractComponentCallbacksC0722v)) {
                            q7.f9373F = true;
                        }
                        abstractComponentCallbacksC0722v.f9529Z = false;
                        abstractComponentCallbacksC0722v.f9515L.o();
                    }
                    this.f9417d = false;
                    return;
                }
                if (c3 <= i7) {
                    switch (i7 - 1) {
                        case -1:
                            h();
                            break;
                        case 0:
                            f();
                            break;
                        case 1:
                            g();
                            abstractComponentCallbacksC0722v.f9530a = 1;
                            break;
                        case 2:
                            abstractComponentCallbacksC0722v.f9509F = false;
                            abstractComponentCallbacksC0722v.f9530a = 2;
                            break;
                        case 3:
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + abstractComponentCallbacksC0722v);
                            }
                            abstractComponentCallbacksC0722v.f9530a = 3;
                            break;
                        case 4:
                            o();
                            break;
                        case 5:
                            abstractComponentCallbacksC0722v.f9530a = 5;
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
                            abstractComponentCallbacksC0722v.f9530a = 4;
                            break;
                        case 5:
                            n();
                            break;
                        case 6:
                            abstractComponentCallbacksC0722v.f9530a = 6;
                            break;
                        case 7:
                            m();
                            break;
                    }
                }
                z7 = true;
            }
        } catch (Throwable th) {
            this.f9417d = false;
            throw th;
        }
    }

    public final void k() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v = this.f9416c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom RESUMED: " + abstractComponentCallbacksC0722v);
        }
        abstractComponentCallbacksC0722v.f9515L.u(5);
        abstractComponentCallbacksC0722v.f9536d0.e(EnumC0739m.ON_PAUSE);
        abstractComponentCallbacksC0722v.f9530a = 6;
        abstractComponentCallbacksC0722v.f9524U = true;
        this.f9414a.F(abstractComponentCallbacksC0722v, false);
    }

    public final void l(ClassLoader classLoader) {
        AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v = this.f9416c;
        Bundle bundle = abstractComponentCallbacksC0722v.f9532b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (abstractComponentCallbacksC0722v.f9532b.getBundle("savedInstanceState") == null) {
            abstractComponentCallbacksC0722v.f9532b.putBundle("savedInstanceState", new Bundle());
        }
        try {
            abstractComponentCallbacksC0722v.f9534c = abstractComponentCallbacksC0722v.f9532b.getSparseParcelableArray("viewState");
            abstractComponentCallbacksC0722v.f9535d = abstractComponentCallbacksC0722v.f9532b.getBundle("viewRegistryState");
            FragmentState fragmentState = (FragmentState) abstractComponentCallbacksC0722v.f9532b.getParcelable(SentryThread.JsonKeys.STATE);
            if (fragmentState != null) {
                abstractComponentCallbacksC0722v.f9544y = fragmentState.f9342C;
                abstractComponentCallbacksC0722v.f9545z = fragmentState.f9343D;
                abstractComponentCallbacksC0722v.f9527X = fragmentState.f9344E;
            }
            if (abstractComponentCallbacksC0722v.f9527X) {
                return;
            }
            abstractComponentCallbacksC0722v.f9526W = true;
        } catch (BadParcelableException e7) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + abstractComponentCallbacksC0722v, e7);
        }
    }

    public final void m() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v = this.f9416c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto RESUMED: " + abstractComponentCallbacksC0722v);
        }
        C0721u c0721u = abstractComponentCallbacksC0722v.f9528Y;
        View view = c0721u == null ? null : c0721u.j;
        if (view != null) {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            }
        }
        abstractComponentCallbacksC0722v.f().j = null;
        abstractComponentCallbacksC0722v.f9515L.P();
        abstractComponentCallbacksC0722v.f9515L.A(true);
        abstractComponentCallbacksC0722v.f9530a = 7;
        abstractComponentCallbacksC0722v.f9524U = false;
        abstractComponentCallbacksC0722v.w();
        if (!abstractComponentCallbacksC0722v.f9524U) {
            throw new c0("Fragment " + abstractComponentCallbacksC0722v + " did not call through to super.onResume()");
        }
        abstractComponentCallbacksC0722v.f9536d0.e(EnumC0739m.ON_RESUME);
        S s7 = abstractComponentCallbacksC0722v.f9515L;
        s7.f9374G = false;
        s7.f9375H = false;
        s7.f9381N.f9413i = false;
        s7.u(7);
        this.f9414a.I(abstractComponentCallbacksC0722v, false);
        this.f9415b.Q(abstractComponentCallbacksC0722v.f9537e, null);
        abstractComponentCallbacksC0722v.f9532b = null;
        abstractComponentCallbacksC0722v.f9534c = null;
        abstractComponentCallbacksC0722v.f9535d = null;
    }

    public final void n() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v = this.f9416c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto STARTED: " + abstractComponentCallbacksC0722v);
        }
        abstractComponentCallbacksC0722v.f9515L.P();
        abstractComponentCallbacksC0722v.f9515L.A(true);
        abstractComponentCallbacksC0722v.f9530a = 5;
        abstractComponentCallbacksC0722v.f9524U = false;
        abstractComponentCallbacksC0722v.y();
        if (!abstractComponentCallbacksC0722v.f9524U) {
            throw new c0("Fragment " + abstractComponentCallbacksC0722v + " did not call through to super.onStart()");
        }
        abstractComponentCallbacksC0722v.f9536d0.e(EnumC0739m.ON_START);
        S s7 = abstractComponentCallbacksC0722v.f9515L;
        s7.f9374G = false;
        s7.f9375H = false;
        s7.f9381N.f9413i = false;
        s7.u(5);
        this.f9414a.K(abstractComponentCallbacksC0722v, false);
    }

    public final void o() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v = this.f9416c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom STARTED: " + abstractComponentCallbacksC0722v);
        }
        S s7 = abstractComponentCallbacksC0722v.f9515L;
        s7.f9375H = true;
        s7.f9381N.f9413i = true;
        s7.u(4);
        abstractComponentCallbacksC0722v.f9536d0.e(EnumC0739m.ON_STOP);
        abstractComponentCallbacksC0722v.f9530a = 4;
        abstractComponentCallbacksC0722v.f9524U = false;
        abstractComponentCallbacksC0722v.z();
        if (abstractComponentCallbacksC0722v.f9524U) {
            this.f9414a.L(abstractComponentCallbacksC0722v, false);
            return;
        }
        throw new c0("Fragment " + abstractComponentCallbacksC0722v + " did not call through to super.onStop()");
    }

    public V(V0 v02, k1.g gVar, ClassLoader classLoader, J j, Bundle bundle) {
        this.f9414a = v02;
        this.f9415b = gVar;
        FragmentState fragmentState = (FragmentState) bundle.getParcelable(SentryThread.JsonKeys.STATE);
        AbstractComponentCallbacksC0722v a2 = j.a(fragmentState.f9345a);
        a2.f9537e = fragmentState.f9346b;
        a2.f9508E = fragmentState.f9347c;
        a2.f9510G = true;
        a2.f9517N = fragmentState.f9348d;
        a2.f9518O = fragmentState.f9349e;
        a2.f9519P = fragmentState.f9350f;
        a2.f9522S = fragmentState.f9351x;
        a2.f9506C = fragmentState.f9352y;
        a2.f9521R = fragmentState.f9353z;
        a2.f9520Q = fragmentState.f9340A;
        a2.c0 = EnumC0740n.values()[fragmentState.f9341B];
        a2.f9544y = fragmentState.f9342C;
        a2.f9545z = fragmentState.f9343D;
        a2.f9527X = fragmentState.f9344E;
        this.f9416c = a2;
        a2.f9532b = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        Q q7 = a2.f9513J;
        if (q7 != null && (q7.f9374G || q7.f9375H)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        a2.f9539f = bundle2;
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a2);
        }
    }

    public V(V0 v02, k1.g gVar, AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v, Bundle bundle) {
        this.f9414a = v02;
        this.f9415b = gVar;
        this.f9416c = abstractComponentCallbacksC0722v;
        abstractComponentCallbacksC0722v.f9534c = null;
        abstractComponentCallbacksC0722v.f9535d = null;
        abstractComponentCallbacksC0722v.f9512I = 0;
        abstractComponentCallbacksC0722v.f9509F = false;
        abstractComponentCallbacksC0722v.f9505B = false;
        AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v2 = abstractComponentCallbacksC0722v.f9543x;
        abstractComponentCallbacksC0722v.f9544y = abstractComponentCallbacksC0722v2 != null ? abstractComponentCallbacksC0722v2.f9537e : null;
        abstractComponentCallbacksC0722v.f9543x = null;
        abstractComponentCallbacksC0722v.f9532b = bundle;
        abstractComponentCallbacksC0722v.f9539f = bundle.getBundle("arguments");
    }
}
