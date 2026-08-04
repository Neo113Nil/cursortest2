package androidx.activity;

import android.os.Build;
import android.util.Log;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.AbstractComponentCallbacksC0701v;
import androidx.fragment.app.C0681a;
import androidx.fragment.app.C0692l;
import androidx.fragment.app.H;
import androidx.fragment.app.Q;
import androidx.fragment.app.W;
import androidx.fragment.app.Z;
import androidx.fragment.app.a0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f8080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p050g6.f f8081b = new p050g6.f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public H f8082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f8083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f8084e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f8085f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f8086g;

    public A(Runnable runnable) {
        this.f8080a = runnable;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33) {
            this.f8083d = i7 >= 34 ? w.f8134a.a(new r(this, 0), new r(this, 1), new s(this, 0), new s(this, 1)) : u.f8129a.a(new s(this, 2));
        }
    }

    public final void a() {
        Object objPrevious;
        H h6 = this.f8082c;
        if (h6 == null) {
            p050g6.f fVar = this.f8081b;
            fVar.getClass();
            ListIterator listIterator = fVar.listIterator(fVar.f13306c);
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((H) objPrevious).f9356a);
            h6 = (H) objPrevious;
        }
        this.f8082c = null;
        if (h6 == null) {
            this.f8080a.run();
            return;
        }
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        Q q7 = h6.f9359d;
        if (zIsLoggable) {
            Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + q7);
        }
        q7.A(true);
        C0681a c0681a = q7.f9390h;
        H h7 = q7.f9391i;
        if (c0681a == null) {
            if (h7.f9356a) {
                if (Log.isLoggable("FragmentManager", 3)) {
                    Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                }
                q7.Q();
                return;
            } else {
                if (Log.isLoggable("FragmentManager", 3)) {
                    Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                }
                q7.f9389g.a();
                return;
            }
        }
        ArrayList arrayList = q7.f9394m;
        if (!arrayList.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(Q.F(q7.f9390h));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (it.next() != null) {
                    throw new ClassCastException();
                }
                Iterator it2 = linkedHashSet.iterator();
                if (it2.hasNext()) {
                    throw null;
                }
            }
        }
        Iterator it3 = q7.f9390h.f9431a.iterator();
        while (it3.hasNext()) {
            AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v = ((W) it3.next()).f9420b;
            if (abstractComponentCallbacksC0701v != null) {
                abstractComponentCallbacksC0701v.f9507D = false;
            }
        }
        for (C0692l c0692l : q7.f(new ArrayList(Collections.singletonList(q7.f9390h)), 0, 1)) {
            c0692l.getClass();
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
            }
            ArrayList arrayList2 = c0692l.f9468c;
            c0692l.e(arrayList2);
            c0692l.getClass();
            t6.h.e(arrayList2, "operations");
            ArrayList arrayList3 = new ArrayList();
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                ((a0) it4.next()).getClass();
                p050g6.n.O0(arrayList3, null);
            }
            List listA1 = p050g6.h.a1(p050g6.h.e1(arrayList3));
            int size = listA1.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((Z) listA1.get(i7)).a(c0692l.f9466a);
            }
            int size2 = arrayList2.size();
            for (int i8 = 0; i8 < size2; i8++) {
                c0692l.a((a0) arrayList2.get(i8));
            }
            List listA2 = p050g6.h.a1(arrayList2);
            if (listA2.size() > 0) {
                ((a0) listA2.get(0)).getClass();
                throw null;
            }
        }
        q7.f9390h = null;
        q7.e0();
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Op is being set to null");
            Log.d("FragmentManager", "OnBackPressedCallback enabled=" + h7.f9356a + " for  FragmentManager " + q7);
        }
    }

    public final void b(boolean z4) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f8084e;
        OnBackInvokedCallback onBackInvokedCallback = this.f8083d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        u uVar = u.f8129a;
        if (z4 && !this.f8085f) {
            uVar.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f8085f = true;
        } else {
            if (z4 || !this.f8085f) {
                return;
            }
            uVar.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f8085f = false;
        }
    }

    public final void c() {
        boolean z4 = this.f8086g;
        boolean z7 = false;
        p050g6.f fVar = this.f8081b;
        if (fVar == null || !fVar.isEmpty()) {
            Iterator<E> it = fVar.iterator();
            while (it.hasNext()) {
                if (((H) it.next()).f9356a) {
                    z7 = true;
                    break;
                }
            }
        }
        this.f8086g = z7;
        if (z7 == z4 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        b(z7);
    }
}
