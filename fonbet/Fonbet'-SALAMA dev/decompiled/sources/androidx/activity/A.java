package androidx.activity;

import android.os.Build;
import android.util.Log;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.AbstractComponentCallbacksC0722v;
import androidx.fragment.app.C0702a;
import androidx.fragment.app.C0713l;
import androidx.fragment.app.H;
import androidx.fragment.app.Q;
import androidx.fragment.app.W;
import androidx.fragment.app.Z;
import androidx.fragment.app.a0;
import g6.AbstractC1159h;
import g6.AbstractC1165n;
import g6.C1157f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f8080a;

    /* renamed from: b, reason: collision with root package name */
    public final C1157f f8081b = new C1157f();

    /* renamed from: c, reason: collision with root package name */
    public H f8082c;

    /* renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f8083d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f8084e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8085f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8086g;

    public A(Runnable runnable) {
        this.f8080a = runnable;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33) {
            this.f8083d = i7 >= 34 ? w.f8134a.a(new r(this, 0), new r(this, 1), new s(this, 0), new s(this, 1)) : u.f8129a.a(new s(this, 2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    public final void a() {
        H h6;
        H h7 = this.f8082c;
        if (h7 == null) {
            C1157f c1157f = this.f8081b;
            c1157f.getClass();
            ListIterator listIterator = c1157f.listIterator(c1157f.f13300c);
            while (true) {
                if (listIterator.hasPrevious()) {
                    h6 = listIterator.previous();
                    if (((H) h6).f9356a) {
                        break;
                    }
                } else {
                    h6 = 0;
                    break;
                }
            }
            h7 = h6;
        }
        this.f8082c = null;
        if (h7 == null) {
            this.f8080a.run();
            return;
        }
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        Q q7 = h7.f9359d;
        if (isLoggable) {
            Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + q7);
        }
        q7.A(true);
        C0702a c0702a = q7.f9390h;
        H h8 = q7.f9391i;
        if (c0702a == null) {
            if (h8.f9356a) {
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
            AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v = ((W) it3.next()).f9420b;
            if (abstractComponentCallbacksC0722v != null) {
                abstractComponentCallbacksC0722v.f9507D = false;
            }
        }
        Iterator it4 = q7.f(new ArrayList(Collections.singletonList(q7.f9390h)), 0, 1).iterator();
        while (it4.hasNext()) {
            C0713l c0713l = (C0713l) it4.next();
            c0713l.getClass();
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
            }
            ArrayList arrayList2 = c0713l.f9468c;
            c0713l.e(arrayList2);
            c0713l.getClass();
            t6.h.e(arrayList2, "operations");
            ArrayList arrayList3 = new ArrayList();
            Iterator it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                ((a0) it5.next()).getClass();
                AbstractC1165n.O0(arrayList3, null);
            }
            List a12 = AbstractC1159h.a1(AbstractC1159h.e1(arrayList3));
            int size = a12.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((Z) a12.get(i7)).a(c0713l.f9466a);
            }
            int size2 = arrayList2.size();
            for (int i8 = 0; i8 < size2; i8++) {
                c0713l.a((a0) arrayList2.get(i8));
            }
            List a13 = AbstractC1159h.a1(arrayList2);
            if (a13.size() > 0) {
                ((a0) a13.get(0)).getClass();
                throw null;
            }
        }
        q7.f9390h = null;
        q7.e0();
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Op is being set to null");
            Log.d("FragmentManager", "OnBackPressedCallback enabled=" + h8.f9356a + " for  FragmentManager " + q7);
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
        C1157f c1157f = this.f8081b;
        if (c1157f == null || !c1157f.isEmpty()) {
            Iterator<E> it = c1157f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((H) it.next()).f9356a) {
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
