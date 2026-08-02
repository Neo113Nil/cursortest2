package c;

import A0.N0;
import android.app.Application;
import android.app.PictureInPictureUiState;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.C0493w;
import androidx.lifecycle.EnumC0486o;
import androidx.lifecycle.EnumC0487p;
import androidx.lifecycle.I;
import androidx.lifecycle.InterfaceC0482k;
import androidx.lifecycle.InterfaceC0489s;
import androidx.lifecycle.InterfaceC0491u;
import androidx.lifecycle.L;
import androidx.lifecycle.T;
import androidx.lifecycle.U;
import androidx.lifecycle.X;
import androidx.lifecycle.Y;
import com.google.android.gms.internal.ads.P9;
import d1.AbstractActivityC1910a;
import d1.C1911b;
import game.betting133.sports1xbet.R;
import i4.InterfaceC2015a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import m1.InterfaceC2083a;
import n.C2138i;
import t3.AbstractC2425d;

/* renamed from: c.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0531j extends AbstractActivityC1910a implements Y, InterfaceC0482k, U1.e, InterfaceC0520G, I1.c {

    /* renamed from: A, reason: collision with root package name */
    public boolean f7336A;

    /* renamed from: B, reason: collision with root package name */
    public final W3.m f7337B;

    /* renamed from: C, reason: collision with root package name */
    public final W3.m f7338C;

    /* renamed from: D, reason: collision with root package name */
    public final W3.m f7339D;

    /* renamed from: l, reason: collision with root package name */
    public final P9 f7340l;

    /* renamed from: m, reason: collision with root package name */
    public final C2138i f7341m;

    /* renamed from: n, reason: collision with root package name */
    public final G.v f7342n;

    /* renamed from: o, reason: collision with root package name */
    public X f7343o;

    /* renamed from: p, reason: collision with root package name */
    public final ViewTreeObserverOnDrawListenerC0529h f7344p;

    /* renamed from: q, reason: collision with root package name */
    public final W3.m f7345q;

    /* renamed from: r, reason: collision with root package name */
    public final C0530i f7346r;

    /* renamed from: s, reason: collision with root package name */
    public final CopyOnWriteArrayList f7347s;

    /* renamed from: t, reason: collision with root package name */
    public final CopyOnWriteArrayList f7348t;

    /* renamed from: u, reason: collision with root package name */
    public final CopyOnWriteArrayList f7349u;

    /* renamed from: v, reason: collision with root package name */
    public final CopyOnWriteArrayList f7350v;

    /* renamed from: w, reason: collision with root package name */
    public final CopyOnWriteArrayList f7351w;

    /* renamed from: x, reason: collision with root package name */
    public final CopyOnWriteArrayList f7352x;

    /* renamed from: y, reason: collision with root package name */
    public final CopyOnWriteArrayList f7353y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f7354z;

    public AbstractActivityC0531j() {
        P9 p9 = new P9();
        this.f7340l = p9;
        this.f7341m = new C2138i(new RunnableC0523b(this, 1));
        G.v vVar = new G.v(new W1.a(this, new O3.l(5, this)));
        this.f7342n = vVar;
        this.f7344p = new ViewTreeObserverOnDrawListenerC0529h(this);
        this.f7345q = G4.d.E(new C0524c(this, 1));
        new AtomicInteger();
        this.f7346r = new C0530i();
        this.f7347s = new CopyOnWriteArrayList();
        this.f7348t = new CopyOnWriteArrayList();
        this.f7349u = new CopyOnWriteArrayList();
        this.f7350v = new CopyOnWriteArrayList();
        this.f7351w = new CopyOnWriteArrayList();
        this.f7352x = new CopyOnWriteArrayList();
        this.f7353y = new CopyOnWriteArrayList();
        this.f7337B = G4.d.E(new C0524c(this, 2));
        C0493w c0493w = this.f16854k;
        if (c0493w == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        final int i = 0;
        c0493w.a(new InterfaceC0489s(this) { // from class: c.e

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ AbstractActivityC0531j f7324l;

            {
                this.f7324l = this;
            }

            @Override // androidx.lifecycle.InterfaceC0489s
            public final void h(InterfaceC0491u interfaceC0491u, EnumC0486o enumC0486o) {
                Window window;
                View peekDecorView;
                switch (i) {
                    case 0:
                        if (enumC0486o == EnumC0486o.ON_STOP && (window = this.f7324l.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                            peekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        AbstractActivityC0531j abstractActivityC0531j = this.f7324l;
                        if (enumC0486o == EnumC0486o.ON_DESTROY) {
                            abstractActivityC0531j.f7340l.f11072l = null;
                            if (!abstractActivityC0531j.isChangingConfigurations()) {
                                abstractActivityC0531j.f().a();
                            }
                            ViewTreeObserverOnDrawListenerC0529h viewTreeObserverOnDrawListenerC0529h = abstractActivityC0531j.f7344p;
                            AbstractActivityC0531j abstractActivityC0531j2 = viewTreeObserverOnDrawListenerC0529h.f7330n;
                            abstractActivityC0531j2.getWindow().getDecorView().removeCallbacks(viewTreeObserverOnDrawListenerC0529h);
                            abstractActivityC0531j2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(viewTreeObserverOnDrawListenerC0529h);
                            break;
                        }
                        break;
                }
            }
        });
        final int i5 = 1;
        this.f16854k.a(new InterfaceC0489s(this) { // from class: c.e

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ AbstractActivityC0531j f7324l;

            {
                this.f7324l = this;
            }

            @Override // androidx.lifecycle.InterfaceC0489s
            public final void h(InterfaceC0491u interfaceC0491u, EnumC0486o enumC0486o) {
                Window window;
                View peekDecorView;
                switch (i5) {
                    case 0:
                        if (enumC0486o == EnumC0486o.ON_STOP && (window = this.f7324l.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                            peekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        AbstractActivityC0531j abstractActivityC0531j = this.f7324l;
                        if (enumC0486o == EnumC0486o.ON_DESTROY) {
                            abstractActivityC0531j.f7340l.f11072l = null;
                            if (!abstractActivityC0531j.isChangingConfigurations()) {
                                abstractActivityC0531j.f().a();
                            }
                            ViewTreeObserverOnDrawListenerC0529h viewTreeObserverOnDrawListenerC0529h = abstractActivityC0531j.f7344p;
                            AbstractActivityC0531j abstractActivityC0531j2 = viewTreeObserverOnDrawListenerC0529h.f7330n;
                            abstractActivityC0531j2.getWindow().getDecorView().removeCallbacks(viewTreeObserverOnDrawListenerC0529h);
                            abstractActivityC0531j2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(viewTreeObserverOnDrawListenerC0529h);
                            break;
                        }
                        break;
                }
            }
        });
        this.f16854k.a(new U1.b(this, 1));
        vVar.n();
        L.e(this);
        if (Build.VERSION.SDK_INT == 23) {
            this.f16854k.a(new z(this));
        }
        ((v3.g) vVar.f1750m).C("android:support:activity-result", new N0(2, this));
        C0527f c0527f = new C0527f(this);
        AbstractActivityC0531j abstractActivityC0531j = (AbstractActivityC0531j) p9.f11072l;
        if (abstractActivityC0531j != null) {
            c0527f.a(abstractActivityC0531j);
        }
        ((CopyOnWriteArraySet) p9.f11071k).add(c0527f);
        this.f7338C = G4.d.E(new C0524c(this, 3));
        this.f7339D = G4.d.E(new C0524c(this, 4));
    }

    public static void h(AbstractActivityC0531j abstractActivityC0531j) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e3) {
            if (!kotlin.jvm.internal.l.a(e3.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e3;
            }
        } catch (NullPointerException e5) {
            if (!kotlin.jvm.internal.l.a(e5.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e5;
            }
        }
    }

    @Override // c.InterfaceC0520G
    public final C0519F a() {
        return (C0519F) this.f7339D.getValue();
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        i();
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.l.e("getDecorView(...)", decorView);
        this.f7344p.a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // U1.e
    public final v3.g b() {
        return (v3.g) this.f7342n.f1750m;
    }

    @Override // I1.c
    public final m2.g c() {
        return a().a().f7304c;
    }

    @Override // androidx.lifecycle.InterfaceC0482k
    public final U d() {
        return (U) this.f7338C.getValue();
    }

    @Override // androidx.lifecycle.InterfaceC0482k
    public final D1.b e() {
        D1.c cVar = new D1.c();
        Application application = getApplication();
        LinkedHashMap linkedHashMap = cVar.f924a;
        if (application != null) {
            linkedHashMap.put(T.f7039e, getApplication());
        }
        linkedHashMap.put(L.f7019a, this);
        linkedHashMap.put(L.f7020b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(L.f7021c, extras);
        }
        return cVar;
    }

    @Override // androidx.lifecycle.Y
    public final X f() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f7343o == null) {
            C0528g c0528g = (C0528g) getLastNonConfigurationInstance();
            if (c0528g != null) {
                this.f7343o = c0528g.f7326a;
            }
            if (this.f7343o == null) {
                this.f7343o = new X();
            }
        }
        X x5 = this.f7343o;
        kotlin.jvm.internal.l.c(x5);
        return x5;
    }

    @Override // androidx.lifecycle.InterfaceC0491u
    public final L g() {
        return this.f16854k;
    }

    public final void i() {
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.l.e("getDecorView(...)", decorView);
        L.l(decorView, this);
        View decorView2 = getWindow().getDecorView();
        kotlin.jvm.internal.l.e("getDecorView(...)", decorView2);
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        kotlin.jvm.internal.l.e("getDecorView(...)", decorView3);
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        kotlin.jvm.internal.l.e("getDecorView(...)", decorView4);
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        kotlin.jvm.internal.l.e("getDecorView(...)", decorView5);
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        kotlin.jvm.internal.l.e("getDecorView(...)", decorView6);
        decorView6.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i5, Intent intent) {
        if (this.f7346r.a(i, i5, intent)) {
            return;
        }
        super.onActivityResult(i, i5, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        ((I1.a) this.f7337B.getValue()).a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        kotlin.jvm.internal.l.f("newConfig", configuration);
        super.onConfigurationChanged(configuration);
        Iterator it = this.f7347s.iterator();
        kotlin.jvm.internal.l.e("iterator(...)", it);
        while (it.hasNext()) {
            ((InterfaceC2083a) it.next()).accept(configuration);
        }
    }

    @Override // d1.AbstractActivityC1910a, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f7342n.o(bundle);
        P9 p9 = this.f7340l;
        p9.getClass();
        p9.f11072l = this;
        Iterator it = ((CopyOnWriteArraySet) p9.f11071k).iterator();
        while (it.hasNext()) {
            ((C0527f) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i = I.f7012l;
        androidx.lifecycle.G.b(this);
        getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        kotlin.jvm.internal.l.f("menu", menu);
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f7341m.f18249l).iterator();
        if (!it.hasNext()) {
            return true;
        }
        ((z1.d) it.next()).getClass();
        throw null;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        kotlin.jvm.internal.l.f("item", menuItem);
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f7341m.f18249l).iterator();
        if (!it.hasNext()) {
            return false;
        }
        ((z1.d) it.next()).getClass();
        throw null;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z3) {
        if (this.f7354z) {
            return;
        }
        Iterator it = this.f7350v.iterator();
        kotlin.jvm.internal.l.e("iterator(...)", it);
        while (it.hasNext()) {
            ((InterfaceC2083a) it.next()).accept(new C1911b(z3));
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        kotlin.jvm.internal.l.f("intent", intent);
        super.onNewIntent(intent);
        Iterator it = this.f7349u.iterator();
        kotlin.jvm.internal.l.e("iterator(...)", it);
        while (it.hasNext()) {
            ((InterfaceC2083a) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        kotlin.jvm.internal.l.f("menu", menu);
        Iterator it = ((CopyOnWriteArrayList) this.f7341m.f18249l).iterator();
        if (it.hasNext()) {
            ((z1.d) it.next()).getClass();
            throw null;
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z3) {
        if (this.f7336A) {
            return;
        }
        Iterator it = this.f7351w.iterator();
        kotlin.jvm.internal.l.e("iterator(...)", it);
        while (it.hasNext()) {
            ((InterfaceC2083a) it.next()).accept(new d1.m(z3));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        Q1.j jVar;
        kotlin.jvm.internal.l.f("pipState", pictureInPictureUiState);
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            pictureInPictureUiState.isStashed();
            pictureInPictureUiState.isTransitioningToPip();
            jVar = new Q1.j(26);
        } else if (i >= 31) {
            pictureInPictureUiState.isStashed();
            jVar = new Q1.j(26);
        } else {
            jVar = new Q1.j(26);
        }
        Iterator it = this.f7352x.iterator();
        kotlin.jvm.internal.l.e("iterator(...)", it);
        while (it.hasNext()) {
            ((InterfaceC2083a) it.next()).accept(jVar);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        kotlin.jvm.internal.l.f("menu", menu);
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f7341m.f18249l).iterator();
        if (!it.hasNext()) {
            return true;
        }
        ((z1.d) it.next()).getClass();
        throw null;
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        kotlin.jvm.internal.l.f("permissions", strArr);
        kotlin.jvm.internal.l.f("grantResults", iArr);
        if (this.f7346r.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0528g c0528g;
        X x5 = this.f7343o;
        if (x5 == null && (c0528g = (C0528g) getLastNonConfigurationInstance()) != null) {
            x5 = c0528g.f7326a;
        }
        if (x5 == null) {
            return null;
        }
        C0528g c0528g2 = new C0528g();
        c0528g2.f7326a = x5;
        return c0528g2;
    }

    @Override // d1.AbstractActivityC1910a, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        kotlin.jvm.internal.l.f("outState", bundle);
        C0493w c0493w = this.f16854k;
        if (c0493w != null) {
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry", c0493w);
            c0493w.r(EnumC0487p.f7060m);
        }
        super.onSaveInstanceState(bundle);
        this.f7342n.p(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.f7348t.iterator();
        kotlin.jvm.internal.l.e("iterator(...)", it);
        while (it.hasNext()) {
            ((InterfaceC2083a) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f7353y.iterator();
        kotlin.jvm.internal.l.e("iterator(...)", it);
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (AbstractC2425d.y()) {
                AbstractC2425d.k("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            v vVar = (v) this.f7345q.getValue();
            synchronized (vVar.f7367b) {
                try {
                    vVar.f7368c = true;
                    ArrayList arrayList = vVar.f7369d;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((InterfaceC2015a) obj).invoke();
                    }
                    vVar.f7369d.clear();
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
    public final void setContentView(int i) {
        i();
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.l.e("getDecorView(...)", decorView);
        this.f7344p.a(decorView);
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        kotlin.jvm.internal.l.f("intent", intent);
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i5, int i6, int i7) {
        kotlin.jvm.internal.l.f("intent", intentSender);
        super.startIntentSenderForResult(intentSender, i, intent, i5, i6, i7);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        kotlin.jvm.internal.l.f("intent", intent);
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i5, int i6, int i7, Bundle bundle) {
        kotlin.jvm.internal.l.f("intent", intentSender);
        super.startIntentSenderForResult(intentSender, i, intent, i5, i6, i7, bundle);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z3, Configuration configuration) {
        kotlin.jvm.internal.l.f("newConfig", configuration);
        this.f7354z = true;
        try {
            super.onMultiWindowModeChanged(z3, configuration);
            this.f7354z = false;
            Iterator it = this.f7350v.iterator();
            kotlin.jvm.internal.l.e("iterator(...)", it);
            while (it.hasNext()) {
                ((InterfaceC2083a) it.next()).accept(new C1911b(z3));
            }
        } catch (Throwable th) {
            this.f7354z = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z3, Configuration configuration) {
        kotlin.jvm.internal.l.f("newConfig", configuration);
        this.f7336A = true;
        try {
            super.onPictureInPictureModeChanged(z3, configuration);
            this.f7336A = false;
            Iterator it = this.f7351w.iterator();
            kotlin.jvm.internal.l.e("iterator(...)", it);
            while (it.hasNext()) {
                ((InterfaceC2083a) it.next()).accept(new d1.m(z3));
            }
        } catch (Throwable th) {
            this.f7336A = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        i();
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.l.e("getDecorView(...)", decorView);
        this.f7344p.a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        i();
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.l.e("getDecorView(...)", decorView);
        this.f7344p.a(decorView);
        super.setContentView(view, layoutParams);
    }
}
