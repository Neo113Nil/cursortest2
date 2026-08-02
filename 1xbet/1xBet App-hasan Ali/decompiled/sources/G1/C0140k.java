package G1;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.C0493w;
import androidx.lifecycle.EnumC0487p;
import androidx.lifecycle.InterfaceC0482k;
import androidx.lifecycle.InterfaceC0491u;
import androidx.lifecycle.T;
import androidx.lifecycle.U;
import androidx.lifecycle.X;
import androidx.lifecycle.Y;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* renamed from: G1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0140k implements InterfaceC0491u, Y, InterfaceC0482k, U1.e {

    /* renamed from: k, reason: collision with root package name */
    public final Context f1898k;

    /* renamed from: l, reason: collision with root package name */
    public y f1899l;

    /* renamed from: m, reason: collision with root package name */
    public final Bundle f1900m;

    /* renamed from: n, reason: collision with root package name */
    public EnumC0487p f1901n;

    /* renamed from: o, reason: collision with root package name */
    public final r f1902o;

    /* renamed from: p, reason: collision with root package name */
    public final String f1903p;

    /* renamed from: q, reason: collision with root package name */
    public final Bundle f1904q;

    /* renamed from: r, reason: collision with root package name */
    public final C0493w f1905r = new C0493w(this, true);

    /* renamed from: s, reason: collision with root package name */
    public final G.v f1906s = new G.v(new W1.a(this, new O3.l(5, this)));

    /* renamed from: t, reason: collision with root package name */
    public boolean f1907t;

    /* renamed from: u, reason: collision with root package name */
    public EnumC0487p f1908u;

    /* renamed from: v, reason: collision with root package name */
    public final androidx.lifecycle.O f1909v;

    public C0140k(Context context, y yVar, Bundle bundle, EnumC0487p enumC0487p, r rVar, String str, Bundle bundle2) {
        this.f1898k = context;
        this.f1899l = yVar;
        this.f1900m = bundle;
        this.f1901n = enumC0487p;
        this.f1902o = rVar;
        this.f1903p = str;
        this.f1904q = bundle2;
        W3.m E5 = G4.d.E(new C0139j(this, 0));
        G4.d.E(new C0139j(this, 1));
        this.f1908u = EnumC0487p.f7059l;
        this.f1909v = (androidx.lifecycle.O) E5.getValue();
    }

    @Override // U1.e
    public final v3.g b() {
        return (v3.g) this.f1906s.f1750m;
    }

    public final Bundle c() {
        Bundle bundle = this.f1900m;
        if (bundle == null) {
            return null;
        }
        return new Bundle(bundle);
    }

    @Override // androidx.lifecycle.InterfaceC0482k
    public final U d() {
        return this.f1909v;
    }

    @Override // androidx.lifecycle.InterfaceC0482k
    public final D1.b e() {
        D1.c cVar = new D1.c();
        Context context = this.f1898k;
        Object applicationContext = context != null ? context.getApplicationContext() : null;
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        LinkedHashMap linkedHashMap = cVar.f924a;
        if (application != null) {
            linkedHashMap.put(T.f7039e, application);
        }
        linkedHashMap.put(androidx.lifecycle.L.f7019a, this);
        linkedHashMap.put(androidx.lifecycle.L.f7020b, this);
        Bundle c5 = c();
        if (c5 != null) {
            linkedHashMap.put(androidx.lifecycle.L.f7021c, c5);
        }
        return cVar;
    }

    public final boolean equals(Object obj) {
        Set<String> keySet;
        if (obj != null && (obj instanceof C0140k)) {
            C0140k c0140k = (C0140k) obj;
            if (kotlin.jvm.internal.l.a(this.f1903p, c0140k.f1903p) && kotlin.jvm.internal.l.a(this.f1899l, c0140k.f1899l) && kotlin.jvm.internal.l.a(this.f1905r, c0140k.f1905r) && kotlin.jvm.internal.l.a((v3.g) this.f1906s.f1750m, (v3.g) c0140k.f1906s.f1750m)) {
                Bundle bundle = this.f1900m;
                Bundle bundle2 = c0140k.f1900m;
                if (kotlin.jvm.internal.l.a(bundle, bundle2)) {
                    return true;
                }
                if (bundle != null && (keySet = bundle.keySet()) != null) {
                    Set<String> set = keySet;
                    if ((set instanceof Collection) && set.isEmpty()) {
                        return true;
                    }
                    for (String str : set) {
                        if (!kotlin.jvm.internal.l.a(bundle.get(str), bundle2 != null ? bundle2.get(str) : null)) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.lifecycle.Y
    public final X f() {
        if (!this.f1907t) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (this.f1905r.f7068g == EnumC0487p.f7058k) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
        r rVar = this.f1902o;
        if (rVar == null) {
            throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
        }
        String str = this.f1903p;
        kotlin.jvm.internal.l.f("backStackEntryId", str);
        LinkedHashMap linkedHashMap = rVar.f1933a;
        X x5 = (X) linkedHashMap.get(str);
        if (x5 != null) {
            return x5;
        }
        X x6 = new X();
        linkedHashMap.put(str, x6);
        return x6;
    }

    @Override // androidx.lifecycle.InterfaceC0491u
    public final androidx.lifecycle.L g() {
        return this.f1905r;
    }

    public final void h(EnumC0487p enumC0487p) {
        kotlin.jvm.internal.l.f("maxState", enumC0487p);
        this.f1908u = enumC0487p;
        i();
    }

    public final int hashCode() {
        Set<String> keySet;
        int hashCode = this.f1899l.hashCode() + (this.f1903p.hashCode() * 31);
        Bundle bundle = this.f1900m;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                int i = hashCode * 31;
                Object obj = bundle.get((String) it.next());
                hashCode = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return ((v3.g) this.f1906s.f1750m).hashCode() + ((this.f1905r.hashCode() + (hashCode * 31)) * 31);
    }

    public final void i() {
        if (!this.f1907t) {
            G.v vVar = this.f1906s;
            vVar.n();
            this.f1907t = true;
            if (this.f1902o != null) {
                androidx.lifecycle.L.e(this);
            }
            vVar.o(this.f1904q);
        }
        int ordinal = this.f1901n.ordinal();
        int ordinal2 = this.f1908u.ordinal();
        C0493w c0493w = this.f1905r;
        if (ordinal < ordinal2) {
            c0493w.r(this.f1901n);
        } else {
            c0493w.r(this.f1908u);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C0140k.class.getSimpleName());
        sb.append("(" + this.f1903p + ')');
        sb.append(" destination=");
        sb.append(this.f1899l);
        String sb2 = sb.toString();
        kotlin.jvm.internal.l.e("sb.toString()", sb2);
        return sb2;
    }
}
