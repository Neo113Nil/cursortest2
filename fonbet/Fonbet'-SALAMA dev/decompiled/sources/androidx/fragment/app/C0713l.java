package androidx.fragment.app;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.Log;
import android.view.ViewGroup;
import g6.AbstractC1159h;
import g6.AbstractC1160i;
import g6.AbstractC1165n;
import io.sentry.rrweb.RRWebVideoEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import w1.P2;

/* renamed from: androidx.fragment.app.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0713l {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f9466a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f9467b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f9468c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9469d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9470e;

    public C0713l(ViewGroup viewGroup) {
        t6.h.e(viewGroup, RRWebVideoEvent.JsonKeys.CONTAINER);
        this.f9466a = viewGroup;
        this.f9467b = new ArrayList();
        this.f9468c = new ArrayList();
    }

    public final void a(a0 a0Var) {
        t6.h.e(a0Var, "operation");
        if (a0Var.f9449b) {
            throw null;
        }
    }

    public final void b(ArrayList arrayList, boolean z4) {
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            ((a0) it.next()).getClass();
            throw null;
        }
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        if (listIterator.hasPrevious()) {
            ((a0) listIterator.previous()).getClass();
            throw null;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Executing operations from " + ((Object) null) + " to " + ((Object) null));
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (arrayList.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        ((a0) arrayList.get(AbstractC1160i.L0(arrayList))).getClass();
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            ((a0) it2.next()).getClass();
            throw null;
        }
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            a0 a0Var = (a0) it3.next();
            arrayList2.add(new C0707f(a0Var, z4));
            new C0712k(a0Var);
            a0Var.getClass();
            if (!z4) {
                throw null;
            }
            throw null;
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            Object next = it4.next();
            if (!((C0712k) next).R()) {
                arrayList4.add(next);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it5 = arrayList4.iterator();
        while (it5.hasNext()) {
            ((C0712k) it5.next()).getClass();
        }
        Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            ((C0712k) it6.next()).getClass();
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        Iterator it7 = arrayList2.iterator();
        if (it7.hasNext()) {
            ((C0707f) it7.next()).getClass();
            throw null;
        }
        arrayList7.isEmpty();
        Iterator it8 = arrayList2.iterator();
        while (it8.hasNext()) {
            C0707f c0707f = (C0707f) it8.next();
            Context context = this.f9466a.getContext();
            c0707f.getClass();
            t6.h.d(context, "context");
            P2 m02 = c0707f.m0(context);
            if (m02 != null) {
                if (((AnimatorSet) m02.f17509c) != null) {
                    throw null;
                }
                arrayList6.add(c0707f);
            }
        }
        Iterator it9 = arrayList6.iterator();
        if (it9.hasNext()) {
            ((C0707f) it9.next()).getClass();
            throw null;
        }
    }

    public final void c() {
        if (this.f9470e) {
            return;
        }
        if (!this.f9466a.isAttachedToWindow()) {
            d();
            this.f9469d = false;
            return;
        }
        synchronized (this.f9467b) {
            try {
                if (this.f9467b.isEmpty()) {
                    ArrayList c1 = AbstractC1159h.c1(this.f9468c);
                    this.f9468c.clear();
                    Iterator it = c1.iterator();
                    while (it.hasNext()) {
                        a0 a0Var = (a0) it.next();
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + a0Var + " with no incoming pendingOperations");
                        }
                        ViewGroup viewGroup = this.f9466a;
                        a0Var.getClass();
                        t6.h.e(viewGroup, RRWebVideoEvent.JsonKeys.CONTAINER);
                        a0Var.a(viewGroup);
                        this.f9468c.add(a0Var);
                    }
                } else {
                    ArrayList c12 = AbstractC1159h.c1(this.f9468c);
                    this.f9468c.clear();
                    Iterator it2 = c12.iterator();
                    if (it2.hasNext()) {
                        a0 a0Var2 = (a0) it2.next();
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + a0Var2);
                        }
                        a0Var2.getClass();
                        throw null;
                    }
                    f();
                    ArrayList c13 = AbstractC1159h.c1(this.f9467b);
                    if (c13.isEmpty()) {
                        return;
                    }
                    this.f9467b.clear();
                    this.f9468c.addAll(c13);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    b(c13, this.f9469d);
                    Iterator it3 = c13.iterator();
                    if (it3.hasNext()) {
                        ((a0) it3.next()).getClass();
                        throw null;
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator it4 = c13.iterator();
                    while (it4.hasNext()) {
                        ((a0) it4.next()).getClass();
                        AbstractC1165n.O0(arrayList, null);
                    }
                    if (!arrayList.isEmpty()) {
                        e(c13);
                        int size = c13.size();
                        for (int i7 = 0; i7 < size; i7++) {
                            a((a0) c13.get(i7));
                        }
                    }
                    this.f9469d = false;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        String str;
        String str2;
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean isAttachedToWindow = this.f9466a.isAttachedToWindow();
        synchronized (this.f9467b) {
            try {
                f();
                e(this.f9467b);
                Iterator it = AbstractC1159h.c1(this.f9468c).iterator();
                while (it.hasNext()) {
                    a0 a0Var = (a0) it.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        if (isAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f9466a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + a0Var);
                    }
                    a0Var.a(this.f9466a);
                }
                Iterator it2 = AbstractC1159h.c1(this.f9467b).iterator();
                while (it2.hasNext()) {
                    a0 a0Var2 = (a0) it2.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        if (isAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.f9466a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + a0Var2);
                    }
                    a0Var2.a(this.f9466a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            a0 a0Var = (a0) arrayList.get(i7);
            if (!a0Var.f9448a) {
                a0Var.f9448a = true;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((a0) it.next()).getClass();
            AbstractC1165n.O0(arrayList2, null);
        }
        List a12 = AbstractC1159h.a1(AbstractC1159h.e1(arrayList2));
        int size2 = a12.size();
        for (int i8 = 0; i8 < size2; i8++) {
            Z z4 = (Z) a12.get(i8);
            z4.getClass();
            ViewGroup viewGroup = this.f9466a;
            t6.h.e(viewGroup, RRWebVideoEvent.JsonKeys.CONTAINER);
            if (!z4.f9430a) {
                z4.c(viewGroup);
            }
            z4.f9430a = true;
        }
    }

    public final void f() {
        Iterator it = this.f9467b.iterator();
        while (it.hasNext()) {
            ((a0) it.next()).getClass();
        }
    }
}
