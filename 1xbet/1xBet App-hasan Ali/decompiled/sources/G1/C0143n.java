package G1;

import E.C0120z;
import android.util.Log;
import androidx.lifecycle.EnumC0487p;
import androidx.lifecycle.X;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import n.AbstractC2107A;

/* renamed from: G1.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0143n {

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f1916a;

    /* renamed from: b, reason: collision with root package name */
    public final s4.M f1917b;

    /* renamed from: c, reason: collision with root package name */
    public final s4.M f1918c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1919d;

    /* renamed from: e, reason: collision with root package name */
    public final s4.x f1920e;
    public final s4.x f;

    /* renamed from: g, reason: collision with root package name */
    public final O f1921g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ E f1922h;

    public C0143n(E e3, O o5) {
        kotlin.jvm.internal.l.f("navigator", o5);
        this.f1922h = e3;
        this.f1916a = new ReentrantLock(true);
        s4.M b3 = s4.C.b(X3.v.f6090k);
        this.f1917b = b3;
        s4.M b5 = s4.C.b(X3.x.f6092k);
        this.f1918c = b5;
        this.f1920e = new s4.x(b3);
        this.f = new s4.x(b5);
        this.f1921g = o5;
    }

    public final void a(C0140k c0140k) {
        kotlin.jvm.internal.l.f("backStackEntry", c0140k);
        ReentrantLock reentrantLock = this.f1916a;
        reentrantLock.lock();
        try {
            s4.M m5 = this.f1917b;
            ArrayList h02 = X3.m.h0((Collection) m5.getValue(), c0140k);
            m5.getClass();
            m5.j(null, h02);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(C0140k c0140k) {
        r rVar;
        kotlin.jvm.internal.l.f("entry", c0140k);
        E e3 = this.f1922h;
        LinkedHashMap linkedHashMap = e3.f1850z;
        boolean a5 = kotlin.jvm.internal.l.a(linkedHashMap.get(c0140k), Boolean.TRUE);
        s4.M m5 = this.f1918c;
        Set set = (Set) m5.getValue();
        kotlin.jvm.internal.l.f("<this>", set);
        LinkedHashSet linkedHashSet = new LinkedHashSet(X3.z.R(set.size()));
        Iterator it = set.iterator();
        boolean z3 = false;
        while (true) {
            boolean z5 = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (!z3 && kotlin.jvm.internal.l.a(next, c0140k)) {
                z3 = true;
                z5 = false;
            }
            if (z5) {
                linkedHashSet.add(next);
            }
        }
        m5.j(null, linkedHashSet);
        linkedHashMap.remove(c0140k);
        X3.k kVar = e3.f1832g;
        boolean contains = kVar.contains(c0140k);
        s4.M m6 = e3.i;
        if (contains) {
            if (this.f1919d) {
                return;
            }
            e3.t();
            ArrayList n02 = X3.m.n0(kVar);
            s4.M m7 = e3.f1833h;
            m7.getClass();
            m7.j(null, n02);
            ArrayList q5 = e3.q();
            m6.getClass();
            m6.j(null, q5);
            return;
        }
        e3.s(c0140k);
        if (c0140k.f1905r.f7068g.compareTo(EnumC0487p.f7060m) >= 0) {
            c0140k.h(EnumC0487p.f7058k);
        }
        boolean z6 = kVar != null;
        String str = c0140k.f1903p;
        if (!z6 || !kVar.isEmpty()) {
            Iterator it2 = kVar.iterator();
            while (it2.hasNext()) {
                if (kotlin.jvm.internal.l.a(((C0140k) it2.next()).f1903p, str)) {
                    break;
                }
            }
        }
        if (!a5 && (rVar = e3.f1840p) != null) {
            kotlin.jvm.internal.l.f("backStackEntryId", str);
            X x5 = (X) rVar.f1933a.remove(str);
            if (x5 != null) {
                x5.a();
            }
        }
        e3.t();
        ArrayList q6 = e3.q();
        m6.getClass();
        m6.j(null, q6);
    }

    public final void c(C0140k c0140k, boolean z3) {
        kotlin.jvm.internal.l.f("popUpTo", c0140k);
        E e3 = this.f1922h;
        O b3 = e3.f1846v.b(c0140k.f1899l.f1964k);
        e3.f1850z.put(c0140k, Boolean.valueOf(z3));
        if (!b3.equals(this.f1921g)) {
            Object obj = e3.f1847w.get(b3);
            kotlin.jvm.internal.l.c(obj);
            ((C0143n) obj).c(c0140k, z3);
            return;
        }
        C0120z c0120z = e3.f1849y;
        if (c0120z != null) {
            c0120z.c(c0140k);
            d(c0140k);
            return;
        }
        X3.k kVar = e3.f1832g;
        int indexOf = kVar.indexOf(c0140k);
        if (indexOf < 0) {
            Log.i("NavController", "Ignoring pop of " + c0140k + " as it was not found on the current back stack");
            return;
        }
        int i = indexOf + 1;
        if (i != kVar.f6086m) {
            e3.n(((C0140k) kVar.get(i)).f1899l.f1969p, true, false);
        }
        E.p(e3, c0140k);
        d(c0140k);
        e3.u();
        e3.b();
    }

    public final void d(C0140k c0140k) {
        kotlin.jvm.internal.l.f("popUpTo", c0140k);
        ReentrantLock reentrantLock = this.f1916a;
        reentrantLock.lock();
        try {
            s4.M m5 = this.f1917b;
            Iterable iterable = (Iterable) m5.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (kotlin.jvm.internal.l.a((C0140k) obj, c0140k)) {
                    break;
                } else {
                    arrayList.add(obj);
                }
            }
            m5.getClass();
            m5.j(null, arrayList);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void e(C0140k c0140k, boolean z3) {
        Object obj;
        kotlin.jvm.internal.l.f("popUpTo", c0140k);
        s4.M m5 = this.f1918c;
        Iterable iterable = (Iterable) m5.getValue();
        boolean z5 = iterable instanceof Collection;
        s4.x xVar = this.f1920e;
        if (!z5 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((C0140k) it.next()) == c0140k) {
                    Iterable iterable2 = (Iterable) ((s4.M) xVar.f19316k).getValue();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((C0140k) it2.next()) == c0140k) {
                        }
                    }
                    return;
                }
            }
        }
        m5.j(null, X3.C.P((Set) m5.getValue(), c0140k));
        List list = (List) ((s4.M) xVar.f19316k).getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            C0140k c0140k2 = (C0140k) obj;
            if (!kotlin.jvm.internal.l.a(c0140k2, c0140k)) {
                s4.v vVar = xVar.f19316k;
                if (((List) ((s4.M) vVar).getValue()).lastIndexOf(c0140k2) < ((List) ((s4.M) vVar).getValue()).lastIndexOf(c0140k)) {
                    break;
                }
            }
        }
        C0140k c0140k3 = (C0140k) obj;
        if (c0140k3 != null) {
            m5.j(null, X3.C.P((Set) m5.getValue(), c0140k3));
        }
        c(c0140k, z3);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [i4.c, kotlin.jvm.internal.m] */
    public final void f(C0140k c0140k) {
        kotlin.jvm.internal.l.f("backStackEntry", c0140k);
        E e3 = this.f1922h;
        O b3 = e3.f1846v.b(c0140k.f1899l.f1964k);
        if (!b3.equals(this.f1921g)) {
            Object obj = e3.f1847w.get(b3);
            if (obj == null) {
                throw new IllegalStateException(AbstractC2107A.u(new StringBuilder("NavigatorBackStack for "), c0140k.f1899l.f1964k, " should already be created").toString());
            }
            ((C0143n) obj).f(c0140k);
            return;
        }
        ?? r02 = e3.f1848x;
        if (r02 != 0) {
            r02.c(c0140k);
            a(c0140k);
        } else {
            Log.i("NavController", "Ignoring add of destination " + c0140k.f1899l + " outside of the call to navigate(). ");
        }
    }
}
