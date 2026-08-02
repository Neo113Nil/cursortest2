package p000;

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
import androidx.lifecycle.C0030a;
import androidx.lifecycle.C0031b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import live.football.scorerepublic.R;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c50 implements ComponentCallbacks, View.OnCreateContextMenuListener, yh0, hi1, oa0, x41 {

    /* JADX INFO: renamed from: e0 */
    public static final Object f1096e0 = new Object();

    /* JADX INFO: renamed from: A */
    public boolean f1097A;

    /* JADX INFO: renamed from: B */
    public int f1098B;

    /* JADX INFO: renamed from: C */
    public t50 f1099C;

    /* JADX INFO: renamed from: D */
    public e50 f1100D;

    /* JADX INFO: renamed from: F */
    public c50 f1102F;

    /* JADX INFO: renamed from: G */
    public int f1103G;

    /* JADX INFO: renamed from: H */
    public int f1104H;

    /* JADX INFO: renamed from: I */
    public String f1105I;

    /* JADX INFO: renamed from: J */
    public boolean f1106J;

    /* JADX INFO: renamed from: K */
    public boolean f1107K;

    /* JADX INFO: renamed from: L */
    public boolean f1108L;

    /* JADX INFO: renamed from: N */
    public boolean f1110N;

    /* JADX INFO: renamed from: O */
    public ViewGroup f1111O;

    /* JADX INFO: renamed from: P */
    public View f1112P;

    /* JADX INFO: renamed from: Q */
    public boolean f1113Q;

    /* JADX INFO: renamed from: S */
    public b50 f1115S;

    /* JADX INFO: renamed from: T */
    public boolean f1116T;

    /* JADX INFO: renamed from: U */
    public boolean f1117U;

    /* JADX INFO: renamed from: V */
    public String f1118V;

    /* JADX INFO: renamed from: W */
    public qh0 f1119W;

    /* JADX INFO: renamed from: X */
    public C0030a f1120X;

    /* JADX INFO: renamed from: Y */
    public c60 f1121Y;

    /* JADX INFO: renamed from: Z */
    public final C0031b f1122Z;

    /* JADX INFO: renamed from: a0 */
    public m81 f1123a0;

    /* JADX INFO: renamed from: b0 */
    public int f1124b0;

    /* JADX INFO: renamed from: c0 */
    public final ArrayList f1125c0;

    /* JADX INFO: renamed from: d0 */
    public final z40 f1126d0;

    /* JADX INFO: renamed from: k */
    public Bundle f1128k;

    /* JADX INFO: renamed from: l */
    public SparseArray f1129l;

    /* JADX INFO: renamed from: m */
    public Bundle f1130m;

    /* JADX INFO: renamed from: o */
    public Bundle f1132o;

    /* JADX INFO: renamed from: p */
    public c50 f1133p;

    /* JADX INFO: renamed from: r */
    public int f1135r;

    /* JADX INFO: renamed from: t */
    public boolean f1137t;

    /* JADX INFO: renamed from: u */
    public boolean f1138u;

    /* JADX INFO: renamed from: v */
    public boolean f1139v;

    /* JADX INFO: renamed from: w */
    public boolean f1140w;

    /* JADX INFO: renamed from: x */
    public boolean f1141x;

    /* JADX INFO: renamed from: y */
    public boolean f1142y;

    /* JADX INFO: renamed from: z */
    public boolean f1143z;

    /* JADX INFO: renamed from: j */
    public int f1127j = -1;

    /* JADX INFO: renamed from: n */
    public String f1131n = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: q */
    public String f1134q = null;

    /* JADX INFO: renamed from: s */
    public Boolean f1136s = null;

    /* JADX INFO: renamed from: E */
    public t50 f1101E = new t50();

    /* JADX INFO: renamed from: M */
    public final boolean f1109M = true;

    /* JADX INFO: renamed from: R */
    public boolean f1114R = true;

    public c50() {
        new RunnableC0897y0(9, this);
        this.f1119W = qh0.f6501n;
        this.f1122Z = new C0031b();
        new AtomicInteger();
        this.f1125c0 = new ArrayList();
        this.f1126d0 = new z40(this);
        m869k();
    }

    /* JADX INFO: renamed from: A */
    public void mo853A(Bundle bundle) {
        this.f1110N = true;
    }

    /* JADX INFO: renamed from: B */
    public void mo854B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f1101E.m4706P();
        this.f1097A = true;
        this.f1121Y = new c60(this, mo861c(), new RunnableC0944za(5, this));
        int i = this.f1124b0;
        View viewInflate = i != 0 ? layoutInflater.inflate(i, viewGroup, false) : null;
        this.f1112P = viewInflate;
        c60 c60Var = this.f1121Y;
        if (viewInflate == null) {
            if (c60Var.f1153m == null) {
                this.f1121Y = null;
                return;
            } else {
                C0270h1.m2191g("Called getViewLifecycleOwner() but onCreateView() returned null");
                return;
            }
        }
        c60Var.m890f();
        if (t50.m4691J(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.f1112P + " for Fragment " + this);
        }
        View view = this.f1112P;
        c60 c60Var2 = this.f1121Y;
        view.getClass();
        view.setTag(R.id.view_tree_lifecycle_owner, c60Var2);
        View view2 = this.f1112P;
        c60 c60Var3 = this.f1121Y;
        view2.getClass();
        view2.setTag(R.id.view_tree_view_model_store_owner, c60Var3);
        View view3 = this.f1112P;
        c60 c60Var4 = this.f1121Y;
        view3.getClass();
        view3.setTag(R.id.view_tree_saved_state_registry_owner, c60Var4);
        this.f1122Z.m448e(this.f1121Y);
    }

    /* JADX INFO: renamed from: C */
    public final AbstractActivityC0790v4 m855C() {
        AbstractActivityC0790v4 abstractActivityC0790v4M865g = m865g();
        if (abstractActivityC0790v4M865g != null) {
            return abstractActivityC0790v4M865g;
        }
        C0042ay.m526c(this, " not attached to an activity.", "Fragment ");
        return null;
    }

    /* JADX INFO: renamed from: D */
    public final Context m856D() {
        e50 e50Var = this.f1100D;
        AbstractActivityC0790v4 abstractActivityC0790v4 = e50Var == null ? null : e50Var.f1952o;
        if (abstractActivityC0790v4 != null) {
            return abstractActivityC0790v4;
        }
        C0042ay.m526c(this, " not attached to a context.", "Fragment ");
        return null;
    }

    /* JADX INFO: renamed from: E */
    public final View m857E() {
        View view = this.f1112P;
        if (view != null) {
            return view;
        }
        C0042ay.m526c(this, " did not return a View from onCreateView() or this was called before onCreateView().", "Fragment ");
        return null;
    }

    /* JADX INFO: renamed from: F */
    public final void m858F(int i, int i2, int i3, int i4) {
        if (this.f1115S == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        m864f().f716b = i;
        m864f().f717c = i2;
        m864f().f718d = i3;
        m864f().f719e = i4;
    }

    @Override // p000.x41
    /* JADX INFO: renamed from: a */
    public final C0086c5 mo859a() {
        return (C0086c5) this.f1123a0.f5011m;
    }

    @Override // p000.oa0
    /* JADX INFO: renamed from: b */
    public final yq0 mo860b() {
        Application application;
        Context applicationContext = m856D().getApplicationContext();
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
        if (application == null && t50.m4691J(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + m856D().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        yq0 yq0Var = new yq0(0);
        LinkedHashMap linkedHashMap = (LinkedHashMap) yq0Var.f7192j;
        if (application != null) {
            linkedHashMap.put(o31.f5610r, application);
        }
        linkedHashMap.put(xe1.f8936b, this);
        linkedHashMap.put(xe1.f8937c, this);
        Bundle bundle = this.f1132o;
        if (bundle != null) {
            linkedHashMap.put(xe1.f8938d, bundle);
        }
        return yq0Var;
    }

    @Override // p000.hi1
    /* JADX INFO: renamed from: c */
    public final gi1 mo861c() {
        if (this.f1099C == null) {
            C0270h1.m2191g("Can't access ViewModels from detached fragment");
            return null;
        }
        if (m867i() == 1) {
            C0270h1.m2191g("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
            return null;
        }
        HashMap map = this.f1099C.f7295O.f8091e;
        gi1 gi1Var = (gi1) map.get(this.f1131n);
        if (gi1Var != null) {
            return gi1Var;
        }
        gi1 gi1Var2 = new gi1();
        map.put(this.f1131n, gi1Var2);
        return gi1Var2;
    }

    @Override // p000.yh0
    /* JADX INFO: renamed from: d */
    public final C0030a mo862d() {
        return this.f1120X;
    }

    /* JADX INFO: renamed from: e */
    public o80 mo863e() {
        return new a50(this);
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    /* JADX INFO: renamed from: f */
    public final b50 m864f() {
        if (this.f1115S == null) {
            b50 b50Var = new b50();
            Object obj = f1096e0;
            b50Var.f721g = obj;
            b50Var.f722h = obj;
            b50Var.f723i = obj;
            b50Var.f724j = 1.0f;
            b50Var.f725k = null;
            this.f1115S = b50Var;
        }
        return this.f1115S;
    }

    /* JADX INFO: renamed from: g */
    public final AbstractActivityC0790v4 m865g() {
        e50 e50Var = this.f1100D;
        if (e50Var == null) {
            return null;
        }
        return e50Var.f1951n;
    }

    /* JADX INFO: renamed from: h */
    public final t50 m866h() {
        if (this.f1100D != null) {
            return this.f1101E;
        }
        C0042ay.m526c(this, " has not been attached yet.", "Fragment ");
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final int m867i() {
        qh0 qh0Var = this.f1119W;
        return (qh0Var == qh0.f6498k || this.f1102F == null) ? qh0Var.ordinal() : Math.min(qh0Var.ordinal(), this.f1102F.m867i());
    }

    /* JADX INFO: renamed from: j */
    public final t50 m868j() {
        t50 t50Var = this.f1099C;
        if (t50Var != null) {
            return t50Var;
        }
        C0042ay.m526c(this, " not associated with a fragment manager.", "Fragment ");
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final void m869k() {
        this.f1120X = new C0030a(this);
        this.f1123a0 = new m81((x41) this);
        ArrayList arrayList = this.f1125c0;
        z40 z40Var = this.f1126d0;
        if (arrayList.contains(z40Var)) {
            return;
        }
        if (this.f1127j >= 0) {
            z40Var.m5858a();
        } else {
            arrayList.add(z40Var);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m870l() {
        m869k();
        this.f1118V = this.f1131n;
        this.f1131n = UUID.randomUUID().toString();
        this.f1137t = false;
        this.f1138u = false;
        this.f1140w = false;
        this.f1141x = false;
        this.f1143z = false;
        this.f1098B = 0;
        this.f1099C = null;
        this.f1101E = new t50();
        this.f1100D = null;
        this.f1103G = 0;
        this.f1104H = 0;
        this.f1105I = null;
        this.f1106J = false;
        this.f1107K = false;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m871m() {
        if (this.f1106J) {
            return true;
        }
        t50 t50Var = this.f1099C;
        if (t50Var != null) {
            c50 c50Var = this.f1102F;
            t50Var.getClass();
            if (c50Var == null ? false : c50Var.m871m()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m872n() {
        return this.f1098B > 0;
    }

    /* JADX INFO: renamed from: o */
    public void mo873o() {
        this.f1110N = true;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f1110N = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        m855C().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f1110N = true;
    }

    /* JADX INFO: renamed from: p */
    public void m874p(int i, int i2, Intent intent) {
        if (t50.m4691J(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    /* JADX INFO: renamed from: q */
    public void mo875q(Context context) {
        this.f1110N = true;
        e50 e50Var = this.f1100D;
        if ((e50Var == null ? null : e50Var.f1951n) != null) {
            this.f1110N = true;
        }
    }

    /* JADX INFO: renamed from: r */
    public void mo876r(Bundle bundle) {
        Bundle bundle2;
        this.f1110N = true;
        Bundle bundle3 = this.f1128k;
        if (bundle3 != null && (bundle2 = bundle3.getBundle("childFragmentManager")) != null) {
            this.f1101E.m4711U(bundle2);
            t50 t50Var = this.f1101E;
            t50Var.f7288H = false;
            t50Var.f7289I = false;
            t50Var.f7295O.f8094h = false;
            t50Var.m4741u(1);
        }
        t50 t50Var2 = this.f1101E;
        if (t50Var2.f7318v >= 1) {
            return;
        }
        t50Var2.f7288H = false;
        t50Var2.f7289I = false;
        t50Var2.f7295O.f8094h = false;
        t50Var2.m4741u(1);
    }

    /* JADX INFO: renamed from: s */
    public void mo877s() {
        this.f1110N = true;
    }

    /* JADX INFO: renamed from: t */
    public void mo878t() {
        this.f1110N = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f1131n);
        if (this.f1103G != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1103G));
        }
        if (this.f1105I != null) {
            sb.append(" tag=");
            sb.append(this.f1105I);
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public LayoutInflater mo879u(Bundle bundle) {
        e50 e50Var = this.f1100D;
        if (e50Var == null) {
            C0270h1.m2191g("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
            return null;
        }
        AbstractActivityC0790v4 abstractActivityC0790v4 = e50Var.f1955r;
        LayoutInflater layoutInflaterCloneInContext = abstractActivityC0790v4.getLayoutInflater().cloneInContext(abstractActivityC0790v4);
        layoutInflaterCloneInContext.setFactory2(this.f1101E.f7302f);
        return layoutInflaterCloneInContext;
    }

    /* JADX INFO: renamed from: v */
    public void mo880v() {
        this.f1110N = true;
    }

    /* JADX INFO: renamed from: w */
    public abstract void mo881w(Bundle bundle);

    /* JADX INFO: renamed from: x */
    public void mo882x() {
        this.f1110N = true;
    }

    /* JADX INFO: renamed from: y */
    public void mo883y() {
        this.f1110N = true;
    }

    /* JADX INFO: renamed from: z */
    public void mo884z(View view) {
    }
}
