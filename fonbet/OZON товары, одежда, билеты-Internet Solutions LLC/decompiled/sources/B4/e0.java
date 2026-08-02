package B4;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ReentrantLock f2614a = new ReentrantLock(true);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final x0<List<C2581j>> f2615b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final x0<Set<C2581j>> f2616c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f2617d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final M0<List<C2581j>> f2618e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final M0<Set<C2581j>> f2619f;

    public e0() {
        x0<List<C2581j>> a11 = O0.a(kotlin.collections.K.f71697a);
        this.f2615b = a11;
        x0<Set<C2581j>> a12 = O0.a(kotlin.collections.M.f71699a);
        this.f2616c = a12;
        this.f2618e = C2399j.b(a11);
        this.f2619f = C2399j.b(a12);
    }

    @NotNull
    public abstract C2581j a(@NotNull H h11, Bundle bundle);

    @NotNull
    public final M0<List<C2581j>> b() {
        return this.f2618e;
    }

    @NotNull
    public final M0<Set<C2581j>> c() {
        return this.f2619f;
    }

    public final boolean d() {
        return this.f2617d;
    }

    public void e(@NotNull C2581j entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        x0<Set<C2581j>> x0Var = this.f2616c;
        x0Var.setValue(kotlin.collections.e0.c(x0Var.getValue(), entry));
    }

    public final void f(@NotNull C2581j backStackEntry) {
        int i11;
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        ReentrantLock reentrantLock = this.f2614a;
        reentrantLock.lock();
        try {
            ArrayList W02 = C7714v.W0(this.f2618e.getValue());
            ListIterator listIterator = W02.listIterator(W02.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    i11 = -1;
                    break;
                } else if (Intrinsics.d(((C2581j) listIterator.previous()).e(), backStackEntry.e())) {
                    i11 = listIterator.nextIndex();
                    break;
                }
            }
            W02.set(i11, backStackEntry);
            this.f2615b.setValue(W02);
            Unit unit = Unit.f71690a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void g(@NotNull C2581j backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        List<C2581j> value = this.f2618e.getValue();
        ListIterator<C2581j> listIterator = value.listIterator(value.size());
        while (listIterator.hasPrevious()) {
            C2581j previous = listIterator.previous();
            if (Intrinsics.d(previous.e(), backStackEntry.e())) {
                x0<Set<C2581j>> x0Var = this.f2616c;
                x0Var.setValue(kotlin.collections.e0.g(kotlin.collections.e0.g(x0Var.getValue(), previous), backStackEntry));
                f(backStackEntry);
                return;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    public void h(@NotNull C2581j popUpTo, boolean z11) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        ReentrantLock reentrantLock = this.f2614a;
        reentrantLock.lock();
        try {
            x0<List<C2581j>> x0Var = this.f2615b;
            List<C2581j> value = x0Var.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : value) {
                if (Intrinsics.d((C2581j) obj, popUpTo)) {
                    break;
                } else {
                    arrayList.add(obj);
                }
            }
            x0Var.setValue(arrayList);
            Unit unit = Unit.f71690a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public void i(@NotNull C2581j popUpTo, boolean z11) {
        C2581j c2581j;
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        x0<Set<C2581j>> x0Var = this.f2616c;
        Set<C2581j> value = x0Var.getValue();
        boolean z12 = value instanceof Collection;
        M0<List<C2581j>> m02 = this.f2618e;
        if (!z12 || !value.isEmpty()) {
            Iterator<T> it = value.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((C2581j) it.next()) == popUpTo) {
                    List<C2581j> value2 = m02.getValue();
                    if ((value2 instanceof Collection) && value2.isEmpty()) {
                        return;
                    }
                    Iterator<T> it2 = value2.iterator();
                    while (it2.hasNext()) {
                        if (((C2581j) it2.next()) == popUpTo) {
                        }
                    }
                    return;
                }
            }
        }
        x0Var.setValue(kotlin.collections.e0.g(x0Var.getValue(), popUpTo));
        List<C2581j> value3 = m02.getValue();
        ListIterator<C2581j> listIterator = value3.listIterator(value3.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                c2581j = null;
                break;
            }
            c2581j = listIterator.previous();
            C2581j c2581j2 = c2581j;
            if (!Intrinsics.d(c2581j2, popUpTo) && m02.getValue().lastIndexOf(c2581j2) < m02.getValue().lastIndexOf(popUpTo)) {
                break;
            }
        }
        C2581j c2581j3 = c2581j;
        if (c2581j3 != null) {
            x0Var.setValue(kotlin.collections.e0.g(x0Var.getValue(), c2581j3));
        }
        h(popUpTo, z11);
    }

    public void j(@NotNull C2581j entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        x0<Set<C2581j>> x0Var = this.f2616c;
        x0Var.setValue(kotlin.collections.e0.g(x0Var.getValue(), entry));
    }

    public void k(@NotNull C2581j backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        ReentrantLock reentrantLock = this.f2614a;
        reentrantLock.lock();
        try {
            x0<List<C2581j>> x0Var = this.f2615b;
            x0Var.setValue(C7714v.q0(backStackEntry, x0Var.getValue()));
            Unit unit = Unit.f71690a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void l(@NotNull C2581j backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        x0<Set<C2581j>> x0Var = this.f2616c;
        Set<C2581j> value = x0Var.getValue();
        boolean z11 = value instanceof Collection;
        M0<List<C2581j>> m02 = this.f2618e;
        if (!z11 || !value.isEmpty()) {
            Iterator<T> it = value.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((C2581j) it.next()) == backStackEntry) {
                    List<C2581j> value2 = m02.getValue();
                    if (!(value2 instanceof Collection) || !value2.isEmpty()) {
                        Iterator<T> it2 = value2.iterator();
                        while (it2.hasNext()) {
                            if (((C2581j) it2.next()) == backStackEntry) {
                                return;
                            }
                        }
                    }
                }
            }
        }
        C2581j c2581j = (C2581j) C7714v.Z(m02.getValue());
        if (c2581j != null) {
            x0Var.setValue(kotlin.collections.e0.g(x0Var.getValue(), c2581j));
        }
        x0Var.setValue(kotlin.collections.e0.g(x0Var.getValue(), backStackEntry));
        k(backStackEntry);
    }

    public final void m(boolean z11) {
        this.f2617d = z11;
    }
}
