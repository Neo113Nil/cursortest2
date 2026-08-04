package androidx.fragment.app;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.Log;
import android.view.ViewGroup;
import io.sentry.rrweb.RRWebVideoEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import p155w1.P2;

/* JADX INFO: renamed from: androidx.fragment.app.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0692l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f9466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f9467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f9468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f9470e;

    public C0692l(ViewGroup viewGroup) {
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
        ArrayList<C0686f> arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (arrayList.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        ((a0) arrayList.get(p050g6.i.L0(arrayList))).getClass();
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            ((a0) it2.next()).getClass();
            throw null;
        }
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            a0 a0Var = (a0) it3.next();
            arrayList2.add(new C0686f(a0Var, z4));
            new C0691k(a0Var);
            a0Var.getClass();
            if (!z4) {
                throw null;
            }
            throw null;
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : arrayList3) {
            if (!((C0691k) obj).R()) {
                arrayList4.add(obj);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            ((C0691k) it4.next()).getClass();
        }
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            ((C0691k) it5.next()).getClass();
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        Iterator it6 = arrayList2.iterator();
        if (it6.hasNext()) {
            ((C0686f) it6.next()).getClass();
            throw null;
        }
        arrayList7.isEmpty();
        for (C0686f c0686f : arrayList2) {
            Context context = this.f9466a.getContext();
            c0686f.getClass();
            t6.h.d(context, "context");
            P2 p2M0 = c0686f.m0(context);
            if (p2M0 != null) {
                if (((AnimatorSet) p2M0.f17515c) != null) {
                    throw null;
                }
                arrayList6.add(c0686f);
            }
        }
        Iterator it7 = arrayList6.iterator();
        if (it7.hasNext()) {
            ((C0686f) it7.next()).getClass();
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
                    ArrayList<a0> arrayListC1 = p050g6.h.c1(this.f9468c);
                    this.f9468c.clear();
                    for (a0 a0Var : arrayListC1) {
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
                    ArrayList arrayListC2 = p050g6.h.c1(this.f9468c);
                    this.f9468c.clear();
                    Iterator it = arrayListC2.iterator();
                    if (it.hasNext()) {
                        a0 a0Var2 = (a0) it.next();
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + a0Var2);
                        }
                        a0Var2.getClass();
                        throw null;
                    }
                    f();
                    ArrayList arrayListC3 = p050g6.h.c1(this.f9467b);
                    if (arrayListC3.isEmpty()) {
                        return;
                    }
                    this.f9467b.clear();
                    this.f9468c.addAll(arrayListC3);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    b(arrayListC3, this.f9469d);
                    Iterator it2 = arrayListC3.iterator();
                    if (it2.hasNext()) {
                        ((a0) it2.next()).getClass();
                        throw null;
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator it3 = arrayListC3.iterator();
                    while (it3.hasNext()) {
                        ((a0) it3.next()).getClass();
                        p050g6.n.O0(arrayList, null);
                    }
                    if (!arrayList.isEmpty()) {
                        e(arrayListC3);
                        int size = arrayListC3.size();
                        for (int i7 = 0; i7 < size; i7++) {
                            a((a0) arrayListC3.get(i7));
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
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean zIsAttachedToWindow = this.f9466a.isAttachedToWindow();
        synchronized (this.f9467b) {
            try {
                f();
                e(this.f9467b);
                for (a0 a0Var : p050g6.h.c1(this.f9468c)) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.f9466a + " is not attached to window. ") + "Cancelling running operation " + a0Var);
                    }
                    a0Var.a(this.f9466a);
                }
                for (a0 a0Var2 : p050g6.h.c1(this.f9467b)) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.f9466a + " is not attached to window. ") + "Cancelling pending operation " + a0Var2);
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
            p050g6.n.O0(arrayList2, null);
        }
        List listA1 = p050g6.h.a1(p050g6.h.e1(arrayList2));
        int size2 = listA1.size();
        for (int i8 = 0; i8 < size2; i8++) {
            Z z4 = (Z) listA1.get(i8);
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
