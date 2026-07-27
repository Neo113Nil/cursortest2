package c;

import Y1.C0077a;
import android.app.Application;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.A;
import androidx.lifecycle.s;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import androidx.lifecycle.y;
import androidx.lifecycle.z;
import com.chicken.jump.road.pump.R;
import d.C0260a;
import e.C0282c;
import e.C0284e;
import e.InterfaceC0281b;
import e2.C0289d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import n.C1137c;
import n.C1138d;
import n.C1140f;
import s.AbstractActivityC1181b;
import s.C1182c;

/* loaded from: classes.dex */
public abstract class k extends AbstractActivityC1181b implements A, androidx.lifecycle.b, V.g, q, t.d {

    /* renamed from: b, reason: collision with root package name */
    public final C0260a f2502b;

    /* renamed from: c, reason: collision with root package name */
    public final J1.i f2503c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.m f2504d;

    /* renamed from: e, reason: collision with root package name */
    public final V.f f2505e;
    public z f;

    /* renamed from: g, reason: collision with root package name */
    public R0.n f2506g;

    /* renamed from: h, reason: collision with root package name */
    public final j f2507h;

    /* renamed from: i, reason: collision with root package name */
    public final V.f f2508i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicInteger f2509j;

    /* renamed from: k, reason: collision with root package name */
    public final f f2510k;

    /* renamed from: l, reason: collision with root package name */
    public final CopyOnWriteArrayList f2511l;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArrayList f2512m;

    /* renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArrayList f2513n;

    /* renamed from: o, reason: collision with root package name */
    public final CopyOnWriteArrayList f2514o;

    /* renamed from: p, reason: collision with root package name */
    public final CopyOnWriteArrayList f2515p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2516q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2517r;

    public k() {
        C0260a c0260a = new C0260a();
        this.f2502b = c0260a;
        this.f2503c = new J1.i(new G0.m(4, this));
        androidx.lifecycle.m mVar = new androidx.lifecycle.m(this);
        this.f2504d = mVar;
        V.f fVar = new V.f(this);
        this.f2505e = fVar;
        Object obj = null;
        this.f2506g = null;
        j jVar = new j(this);
        this.f2507h = jVar;
        this.f2508i = new V.f(jVar, new H2.n(1, this));
        this.f2509j = new AtomicInteger();
        this.f2510k = new f(this);
        this.f2511l = new CopyOnWriteArrayList();
        this.f2512m = new CopyOnWriteArrayList();
        this.f2513n = new CopyOnWriteArrayList();
        this.f2514o = new CopyOnWriteArrayList();
        this.f2515p = new CopyOnWriteArrayList();
        this.f2516q = false;
        this.f2517r = false;
        mVar.a(new g(this, 0));
        mVar.a(new g(this, 1));
        mVar.a(new g(this, 2));
        fVar.b();
        v.a(this);
        V.e eVar = (V.e) fVar.f1608c;
        V.d dVar = new V.d() { // from class: c.c
            @Override // V.d
            public final Bundle a() {
                k kVar = k.this;
                kVar.getClass();
                Bundle bundle = new Bundle();
                f fVar2 = kVar.f2510k;
                fVar2.getClass();
                HashMap hashMap = fVar2.f2489b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(hashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(hashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(fVar2.f2491d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) fVar2.f2493g.clone());
                return bundle;
            }
        };
        C1140f c1140f = (C1140f) eVar.f1604c;
        C1137c b3 = c1140f.b("android:support:activity-result");
        if (b3 != null) {
            obj = b3.f10118b;
        } else {
            C1137c c1137c = new C1137c("android:support:activity-result", dVar);
            c1140f.f10127d++;
            C1137c c1137c2 = c1140f.f10125b;
            if (c1137c2 == null) {
                c1140f.f10124a = c1137c;
                c1140f.f10125b = c1137c;
            } else {
                c1137c2.f10119c = c1137c;
                c1137c.f10120d = c1137c2;
                c1140f.f10125b = c1137c;
            }
        }
        if (((V.d) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
        d dVar2 = new d(this);
        if (c0260a.f4820b != null) {
            dVar2.a();
        }
        c0260a.f4819a.add(dVar2);
    }

    @Override // c.q
    public final R0.n a() {
        if (this.f2506g == null) {
            A.b bVar = new A.b(12, this);
            R0.n nVar = new R0.n();
            nVar.f1223b = bVar;
            nVar.f1224c = new C0289d();
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 33) {
                nVar.f1226e = i3 >= 34 ? p.f2525a.a(new l(nVar, 0), new l(nVar, 1), new m(nVar, 0), new m(nVar, 1)) : n.f2520a.a(new m(nVar, 2));
            }
            this.f2506g = nVar;
            this.f2504d.a(new g(this, 3));
        }
        return this.f2506g;
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        g();
        this.f2507h.a(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    @Override // V.g
    public final V.e b() {
        return (V.e) this.f2505e.f1608c;
    }

    @Override // androidx.lifecycle.b
    public final Q.b c() {
        Q.c cVar = new Q.c(Q.a.f1155b);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = (LinkedHashMap) cVar.f1156a;
        if (application != null) {
            linkedHashMap.put(y.f2344a, getApplication());
        }
        linkedHashMap.put(v.f2334a, this);
        linkedHashMap.put(v.f2335b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            linkedHashMap.put(v.f2336c, getIntent().getExtras());
        }
        return cVar;
    }

    @Override // androidx.lifecycle.A
    public final z d() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f == null) {
            i iVar = (i) getLastNonConfigurationInstance();
            if (iVar != null) {
                this.f = iVar.f2497a;
            }
            if (this.f == null) {
                this.f = new z(0);
            }
        }
        return this.f;
    }

    @Override // androidx.lifecycle.k
    public final androidx.lifecycle.m e() {
        return this.f2504d;
    }

    public final void g() {
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.j.e(decorView, "<this>");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        kotlin.jvm.internal.j.e(decorView2, "<this>");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        kotlin.jvm.internal.j.e(decorView3, "<this>");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        kotlin.jvm.internal.j.e(decorView4, "<this>");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        kotlin.jvm.internal.j.e(decorView5, "<this>");
        decorView5.setTag(R.id.report_drawn, this);
    }

    public final A0.j h(C0077a c0077a, InterfaceC0281b interfaceC0281b) {
        int i3;
        HashMap hashMap;
        String str = "activity_rq#" + this.f2509j.getAndIncrement();
        f fVar = this.f2510k;
        fVar.getClass();
        androidx.lifecycle.m mVar = this.f2504d;
        if (mVar.f2313c.compareTo(androidx.lifecycle.f.f2306d) >= 0) {
            throw new IllegalStateException("LifecycleOwner " + this + " is attempting to register while current state is " + mVar.f2313c + ". LifecycleOwners must call register before they are STARTED.");
        }
        HashMap hashMap2 = fVar.f2489b;
        if (((Integer) hashMap2.get(str)) == null) {
            int nextInt = q2.e.f10269a.a().nextInt(2147418112);
            while (true) {
                i3 = nextInt + 65536;
                hashMap = fVar.f2488a;
                if (!hashMap.containsKey(Integer.valueOf(i3))) {
                    break;
                }
                nextInt = q2.e.f10269a.a().nextInt(2147418112);
            }
            hashMap.put(Integer.valueOf(i3), str);
            hashMap2.put(str, Integer.valueOf(i3));
        }
        HashMap hashMap3 = fVar.f2490c;
        C0284e c0284e = (C0284e) hashMap3.get(str);
        if (c0284e == null) {
            c0284e = new C0284e(mVar);
        }
        C0282c c0282c = new C0282c(fVar, str, interfaceC0281b, c0077a);
        c0284e.f4860a.a(c0282c);
        c0284e.f4861b.add(c0282c);
        hashMap3.put(str, c0284e);
        return new A0.j(fVar, str, c0077a);
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i3, int i4, Intent intent) {
        if (this.f2510k.a(i3, i4, intent)) {
            return;
        }
        super.onActivityResult(i3, i4, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        a().b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.f2511l.iterator();
        while (it.hasNext()) {
            ((C.a) it.next()).accept(configuration);
        }
    }

    @Override // s.AbstractActivityC1181b, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f2505e.c(bundle);
        C0260a c0260a = this.f2502b;
        c0260a.getClass();
        c0260a.f4820b = this;
        Iterator it = c0260a.f4819a.iterator();
        while (it.hasNext()) {
            ((d) it.next()).a();
        }
        super.onCreate(bundle);
        int i3 = u.f2332b;
        s.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i3, Menu menu) {
        if (i3 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i3, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f2503c.f729b).iterator();
        if (!it.hasNext()) {
            return true;
        }
        ((P.i) it.next()).getClass();
        throw null;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i3, MenuItem menuItem) {
        if (super.onMenuItemSelected(i3, menuItem)) {
            return true;
        }
        if (i3 != 0) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2503c.f729b).iterator();
        if (!it.hasNext()) {
            return false;
        }
        ((P.i) it.next()).getClass();
        throw null;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z3) {
        if (this.f2516q) {
            return;
        }
        Iterator it = this.f2514o.iterator();
        while (it.hasNext()) {
            ((C.a) it.next()).accept(new C1182c(z3));
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.f2513n.iterator();
        while (it.hasNext()) {
            ((C.a) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i3, Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.f2503c.f729b).iterator();
        if (it.hasNext()) {
            ((P.i) it.next()).getClass();
            throw null;
        }
        super.onPanelClosed(i3, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z3) {
        if (this.f2517r) {
            return;
        }
        Iterator it = this.f2515p.iterator();
        while (it.hasNext()) {
            ((C.a) it.next()).accept(new s.n(z3));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i3, View view, Menu menu) {
        if (i3 != 0) {
            return true;
        }
        super.onPreparePanel(i3, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f2503c.f729b).iterator();
        if (!it.hasNext()) {
            return true;
        }
        ((P.i) it.next()).getClass();
        throw null;
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i3, String[] strArr, int[] iArr) {
        if (this.f2510k.a(i3, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i3, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        i iVar;
        z zVar = this.f;
        if (zVar == null && (iVar = (i) getLastNonConfigurationInstance()) != null) {
            zVar = iVar.f2497a;
        }
        if (zVar == null) {
            return null;
        }
        i iVar2 = new i();
        iVar2.f2497a = zVar;
        return iVar2;
    }

    @Override // s.AbstractActivityC1181b, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        androidx.lifecycle.m mVar = this.f2504d;
        if (mVar != null) {
            androidx.lifecycle.f fVar = androidx.lifecycle.f.f2305c;
            mVar.d("setCurrentState");
            mVar.f(fVar);
        }
        super.onSaveInstanceState(bundle);
        V.e eVar = (V.e) this.f2505e.f1608c;
        eVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) eVar.f1605d;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C1140f c1140f = (C1140f) eVar.f1604c;
        c1140f.getClass();
        C1138d c1138d = new C1138d(c1140f);
        c1140f.f10126c.put(c1138d, Boolean.FALSE);
        while (c1138d.hasNext()) {
            Map.Entry entry = (Map.Entry) c1138d.next();
            bundle2.putBundle((String) entry.getKey(), ((V.d) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i3) {
        super.onTrimMemory(i3);
        Iterator it = this.f2512m.iterator();
        while (it.hasNext()) {
            ((C.a) it.next()).accept(Integer.valueOf(i3));
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (X0.a.x()) {
                Trace.beginSection(X0.a.M("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            V.f fVar = this.f2508i;
            synchronized (fVar.f1606a) {
                try {
                    fVar.f1607b = true;
                    Iterator it = ((ArrayList) fVar.f1608c).iterator();
                    while (it.hasNext()) {
                        ((o2.a) it.next()).invoke();
                    }
                    ((ArrayList) fVar.f1608c).clear();
                } finally {
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i3) {
        g();
        this.f2507h.a(getWindow().getDecorView());
        super.setContentView(i3);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z3, Configuration newConfig) {
        this.f2516q = true;
        try {
            super.onMultiWindowModeChanged(z3, newConfig);
            this.f2516q = false;
            Iterator it = this.f2514o.iterator();
            while (it.hasNext()) {
                C.a aVar = (C.a) it.next();
                kotlin.jvm.internal.j.e(newConfig, "newConfig");
                aVar.accept(new C1182c(z3));
            }
        } catch (Throwable th) {
            this.f2516q = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z3, Configuration newConfig) {
        this.f2517r = true;
        try {
            super.onPictureInPictureModeChanged(z3, newConfig);
            this.f2517r = false;
            Iterator it = this.f2515p.iterator();
            while (it.hasNext()) {
                C.a aVar = (C.a) it.next();
                kotlin.jvm.internal.j.e(newConfig, "newConfig");
                aVar.accept(new s.n(z3));
            }
        } catch (Throwable th) {
            this.f2517r = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        g();
        this.f2507h.a(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        g();
        this.f2507h.a(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }
}
