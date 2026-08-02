package androidx.fragment.app;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC0741o;
import androidx.lifecycle.C0747v;
import androidx.lifecycle.EnumC0740n;
import androidx.lifecycle.InterfaceC0735i;
import androidx.lifecycle.InterfaceC0745t;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import n0.AbstractC1445a;

/* renamed from: androidx.fragment.app.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC0722v implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC0745t, androidx.lifecycle.Y, InterfaceC0735i, G0.h {

    /* renamed from: i0, reason: collision with root package name */
    public static final Object f9503i0 = new Object();

    /* renamed from: B, reason: collision with root package name */
    public boolean f9505B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f9506C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f9507D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f9508E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f9509F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f9510G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f9511H;

    /* renamed from: I, reason: collision with root package name */
    public int f9512I;

    /* renamed from: J, reason: collision with root package name */
    public Q f9513J;

    /* renamed from: K, reason: collision with root package name */
    public C0726z f9514K;

    /* renamed from: M, reason: collision with root package name */
    public AbstractComponentCallbacksC0722v f9516M;

    /* renamed from: N, reason: collision with root package name */
    public int f9517N;

    /* renamed from: O, reason: collision with root package name */
    public int f9518O;

    /* renamed from: P, reason: collision with root package name */
    public String f9519P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f9520Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f9521R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f9522S;

    /* renamed from: U, reason: collision with root package name */
    public boolean f9524U;

    /* renamed from: V, reason: collision with root package name */
    public ViewGroup f9525V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f9526W;

    /* renamed from: Y, reason: collision with root package name */
    public C0721u f9528Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f9529Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f9531a0;

    /* renamed from: b, reason: collision with root package name */
    public Bundle f9532b;

    /* renamed from: b0, reason: collision with root package name */
    public String f9533b0;

    /* renamed from: c, reason: collision with root package name */
    public SparseArray f9534c;
    public EnumC0740n c0;

    /* renamed from: d, reason: collision with root package name */
    public Bundle f9535d;

    /* renamed from: d0, reason: collision with root package name */
    public C0747v f9536d0;

    /* renamed from: e0, reason: collision with root package name */
    public final androidx.lifecycle.B f9538e0;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f9539f;

    /* renamed from: f0, reason: collision with root package name */
    public G0.g f9540f0;

    /* renamed from: g0, reason: collision with root package name */
    public final ArrayList f9541g0;

    /* renamed from: h0, reason: collision with root package name */
    public final r f9542h0;

    /* renamed from: x, reason: collision with root package name */
    public AbstractComponentCallbacksC0722v f9543x;

    /* renamed from: z, reason: collision with root package name */
    public int f9545z;

    /* renamed from: a, reason: collision with root package name */
    public int f9530a = -1;

    /* renamed from: e, reason: collision with root package name */
    public String f9537e = UUID.randomUUID().toString();

    /* renamed from: y, reason: collision with root package name */
    public String f9544y = null;

    /* renamed from: A, reason: collision with root package name */
    public Boolean f9504A = null;

    /* renamed from: L, reason: collision with root package name */
    public S f9515L = new S();

    /* renamed from: T, reason: collision with root package name */
    public final boolean f9523T = true;

    /* renamed from: X, reason: collision with root package name */
    public boolean f9527X = true;

    public AbstractComponentCallbacksC0722v() {
        new RunnableC0714m(this, 1);
        this.c0 = EnumC0740n.f9630e;
        this.f9538e0 = new androidx.lifecycle.B();
        new AtomicInteger();
        this.f9541g0 = new ArrayList();
        this.f9542h0 = new r(this);
        j();
    }

    public void A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f9515L.P();
        this.f9511H = true;
        getViewModelStore();
    }

    public final Context B() {
        C0726z c0726z = this.f9514K;
        A a2 = c0726z == null ? null : c0726z.f9552b;
        if (a2 != null) {
            return a2;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final void C(int i7, int i8, int i9, int i10) {
        if (this.f9528Y == null && i7 == 0 && i8 == 0 && i9 == 0 && i10 == 0) {
            return;
        }
        f().f9495b = i7;
        f().f9496c = i8;
        f().f9497d = i9;
        f().f9498e = i10;
    }

    public final void D(Intent intent, int i7, Bundle bundle) {
        if (this.f9514K == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        Q i8 = i();
        if (i8.f9369B != null) {
            i8.f9372E.addLast(new FragmentManager$LaunchedFragmentInfo(this.f9537e, i7));
            if (bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            i8.f9369B.a(intent);
            return;
        }
        C0726z c0726z = i8.f9403v;
        c0726z.getClass();
        t6.h.e(intent, "intent");
        if (i7 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        G.h.startActivity(c0726z.f9552b, intent, bundle);
    }

    public C d() {
        return new C0719s(this);
    }

    public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f9517N));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f9518O));
        printWriter.print(" mTag=");
        printWriter.println(this.f9519P);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f9530a);
        printWriter.print(" mWho=");
        printWriter.print(this.f9537e);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f9512I);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f9505B);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f9506C);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f9508E);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f9509F);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f9520Q);
        printWriter.print(" mDetached=");
        printWriter.print(this.f9521R);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f9523T);
        printWriter.print(" mHasMenu=");
        printWriter.println(false);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f9522S);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f9527X);
        if (this.f9513J != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f9513J);
        }
        if (this.f9514K != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f9514K);
        }
        if (this.f9516M != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f9516M);
        }
        if (this.f9539f != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f9539f);
        }
        if (this.f9532b != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f9532b);
        }
        if (this.f9534c != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f9534c);
        }
        if (this.f9535d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f9535d);
        }
        AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v = this.f9543x;
        if (abstractComponentCallbacksC0722v == null) {
            Q q7 = this.f9513J;
            abstractComponentCallbacksC0722v = (q7 == null || (str2 = this.f9544y) == null) ? null : q7.f9385c.q(str2);
        }
        if (abstractComponentCallbacksC0722v != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(abstractComponentCallbacksC0722v);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f9545z);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        C0721u c0721u = this.f9528Y;
        printWriter.println(c0721u == null ? false : c0721u.f9494a);
        C0721u c0721u2 = this.f9528Y;
        if ((c0721u2 == null ? 0 : c0721u2.f9495b) != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            C0721u c0721u3 = this.f9528Y;
            printWriter.println(c0721u3 == null ? 0 : c0721u3.f9495b);
        }
        C0721u c0721u4 = this.f9528Y;
        if ((c0721u4 == null ? 0 : c0721u4.f9496c) != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            C0721u c0721u5 = this.f9528Y;
            printWriter.println(c0721u5 == null ? 0 : c0721u5.f9496c);
        }
        C0721u c0721u6 = this.f9528Y;
        if ((c0721u6 == null ? 0 : c0721u6.f9497d) != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            C0721u c0721u7 = this.f9528Y;
            printWriter.println(c0721u7 == null ? 0 : c0721u7.f9497d);
        }
        C0721u c0721u8 = this.f9528Y;
        if ((c0721u8 == null ? 0 : c0721u8.f9498e) != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            C0721u c0721u9 = this.f9528Y;
            printWriter.println(c0721u9 != null ? c0721u9.f9498e : 0);
        }
        if (this.f9525V != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f9525V);
        }
        C0726z c0726z = this.f9514K;
        if ((c0726z != null ? c0726z.f9552b : null) != null) {
            AbstractC1445a.a(this).b(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f9515L + ":");
        this.f9515L.w(e1.k.e(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final C0721u f() {
        if (this.f9528Y == null) {
            C0721u c0721u = new C0721u();
            Object obj = f9503i0;
            c0721u.f9500g = obj;
            c0721u.f9501h = obj;
            c0721u.f9502i = obj;
            c0721u.j = null;
            this.f9528Y = c0721u;
        }
        return this.f9528Y;
    }

    public final Q g() {
        if (this.f9514K != null) {
            return this.f9515L;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    @Override // androidx.lifecycle.InterfaceC0735i
    public final m0.b getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = B().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + B().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        m0.c cVar = new m0.c();
        LinkedHashMap linkedHashMap = cVar.f15202a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.T.f9608a, application);
        }
        linkedHashMap.put(androidx.lifecycle.M.f9581a, this);
        linkedHashMap.put(androidx.lifecycle.M.f9582b, this);
        Bundle bundle = this.f9539f;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.M.f9583c, bundle);
        }
        return cVar;
    }

    @Override // androidx.lifecycle.InterfaceC0745t
    public final AbstractC0741o getLifecycle() {
        return this.f9536d0;
    }

    @Override // G0.h
    public final G0.f getSavedStateRegistry() {
        return this.f9540f0.f2847b;
    }

    @Override // androidx.lifecycle.Y
    public final androidx.lifecycle.X getViewModelStore() {
        if (this.f9513J == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (h() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap hashMap = this.f9513J.f9381N.f9410f;
        androidx.lifecycle.X x4 = (androidx.lifecycle.X) hashMap.get(this.f9537e);
        if (x4 != null) {
            return x4;
        }
        androidx.lifecycle.X x7 = new androidx.lifecycle.X();
        hashMap.put(this.f9537e, x7);
        return x7;
    }

    public final int h() {
        EnumC0740n enumC0740n = this.c0;
        return (enumC0740n == EnumC0740n.f9627b || this.f9516M == null) ? enumC0740n.ordinal() : Math.min(enumC0740n.ordinal(), this.f9516M.h());
    }

    public final Q i() {
        Q q7 = this.f9513J;
        if (q7 != null) {
            return q7;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final void j() {
        this.f9536d0 = new C0747v(this);
        this.f9540f0 = new G0.g(this);
        ArrayList arrayList = this.f9541g0;
        r rVar = this.f9542h0;
        if (arrayList.contains(rVar)) {
            return;
        }
        if (this.f9530a >= 0) {
            rVar.a();
        } else {
            arrayList.add(rVar);
        }
    }

    public final void k() {
        j();
        this.f9533b0 = this.f9537e;
        this.f9537e = UUID.randomUUID().toString();
        this.f9505B = false;
        this.f9506C = false;
        this.f9508E = false;
        this.f9509F = false;
        this.f9510G = false;
        this.f9512I = 0;
        this.f9513J = null;
        this.f9515L = new S();
        this.f9514K = null;
        this.f9517N = 0;
        this.f9518O = 0;
        this.f9519P = null;
        this.f9520Q = false;
        this.f9521R = false;
    }

    public final boolean l() {
        return this.f9514K != null && this.f9505B;
    }

    public final boolean m() {
        if (!this.f9520Q) {
            Q q7 = this.f9513J;
            if (q7 == null) {
                return false;
            }
            AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v = this.f9516M;
            q7.getClass();
            if (!(abstractComponentCallbacksC0722v == null ? false : abstractComponentCallbacksC0722v.m())) {
                return false;
            }
        }
        return true;
    }

    public final boolean n() {
        return this.f9512I > 0;
    }

    public void o() {
        this.f9524U = true;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f9524U = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C0726z c0726z = this.f9514K;
        A a2 = c0726z == null ? null : c0726z.f9551a;
        if (a2 != null) {
            a2.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f9524U = true;
    }

    public void p(int i7, int i8, Intent intent) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i7 + " resultCode: " + i8 + " data: " + intent);
        }
    }

    public void q(A a2) {
        this.f9524U = true;
        C0726z c0726z = this.f9514K;
        if ((c0726z == null ? null : c0726z.f9551a) != null) {
            this.f9524U = true;
        }
    }

    public void r(Bundle bundle) {
        Bundle bundle2;
        this.f9524U = true;
        Bundle bundle3 = this.f9532b;
        if (bundle3 != null && (bundle2 = bundle3.getBundle("childFragmentManager")) != null) {
            this.f9515L.U(bundle2);
            S s7 = this.f9515L;
            s7.f9374G = false;
            s7.f9375H = false;
            s7.f9381N.f9413i = false;
            s7.u(1);
        }
        S s8 = this.f9515L;
        if (s8.f9402u >= 1) {
            return;
        }
        s8.f9374G = false;
        s8.f9375H = false;
        s8.f9381N.f9413i = false;
        s8.u(1);
    }

    public void s() {
        this.f9524U = true;
    }

    public final void startActivityForResult(Intent intent, int i7) {
        D(intent, i7, null);
    }

    public void t() {
        this.f9524U = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f9537e);
        if (this.f9517N != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f9517N));
        }
        if (this.f9519P != null) {
            sb.append(" tag=");
            sb.append(this.f9519P);
        }
        sb.append(")");
        return sb.toString();
    }

    public void u() {
        this.f9524U = true;
    }

    public LayoutInflater v(Bundle bundle) {
        C0726z c0726z = this.f9514K;
        if (c0726z == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        A a2 = c0726z.f9555e;
        LayoutInflater cloneInContext = a2.getLayoutInflater().cloneInContext(a2);
        cloneInContext.setFactory2(this.f9515L.f9388f);
        return cloneInContext;
    }

    public void w() {
        this.f9524U = true;
    }

    public abstract void x(Bundle bundle);

    public abstract void y();

    public abstract void z();
}
