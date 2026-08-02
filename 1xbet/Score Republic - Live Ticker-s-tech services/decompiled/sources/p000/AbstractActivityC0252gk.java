package p000;

import android.app.PictureInPictureUiState;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.C0030a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import live.football.scorerepublic.R;
import p000.AbstractActivityC0252gk;
import p000.AbstractActivityC0790v4;
import p000.C0101ck;
import p000.gi1;
import p000.ph0;
import p000.yh0;

/* JADX INFO: renamed from: gk */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC0252gk extends AbstractActivityC0214fk implements hi1, oa0, x41 {

    /* JADX INFO: renamed from: C */
    public static final /* synthetic */ int f2772C = 0;

    /* JADX INFO: renamed from: A */
    public final jc1 f2773A;

    /* JADX INFO: renamed from: B */
    public final jc1 f2774B;

    /* JADX INFO: renamed from: k */
    public final p90 f2775k;

    /* JADX INFO: renamed from: l */
    public final qd0 f2776l;

    /* JADX INFO: renamed from: m */
    public final m81 f2777m;

    /* JADX INFO: renamed from: n */
    public gi1 f2778n;

    /* JADX INFO: renamed from: o */
    public final ViewTreeObserverOnDrawListenerC0141dk f2779o;

    /* JADX INFO: renamed from: p */
    public final jc1 f2780p;

    /* JADX INFO: renamed from: q */
    public final C0177ek f2781q;

    /* JADX INFO: renamed from: r */
    public final CopyOnWriteArrayList f2782r;

    /* JADX INFO: renamed from: s */
    public final CopyOnWriteArrayList f2783s;

    /* JADX INFO: renamed from: t */
    public final CopyOnWriteArrayList f2784t;

    /* JADX INFO: renamed from: u */
    public final CopyOnWriteArrayList f2785u;

    /* JADX INFO: renamed from: v */
    public final CopyOnWriteArrayList f2786v;

    /* JADX INFO: renamed from: w */
    public final CopyOnWriteArrayList f2787w;

    /* JADX INFO: renamed from: x */
    public final CopyOnWriteArrayList f2788x;

    /* JADX INFO: renamed from: y */
    public boolean f2789y;

    /* JADX INFO: renamed from: z */
    public boolean f2790z;

    public AbstractActivityC0252gk() {
        p90 p90Var = new p90();
        p90Var.f6027j = new CopyOnWriteArraySet();
        this.f2775k = p90Var;
        final AbstractActivityC0790v4 abstractActivityC0790v4 = (AbstractActivityC0790v4) this;
        int i = 0;
        this.f2776l = new qd0(new RunnableC0842wj(abstractActivityC0790v4, i));
        m81 m81Var = new m81((x41) this);
        this.f2777m = m81Var;
        this.f2779o = new ViewTreeObserverOnDrawListenerC0141dk(abstractActivityC0790v4);
        int i2 = 1;
        this.f2780p = new jc1(new C0879xj(abstractActivityC0790v4, 1));
        new AtomicInteger();
        this.f2781q = new C0177ek(abstractActivityC0790v4);
        this.f2782r = new CopyOnWriteArrayList();
        this.f2783s = new CopyOnWriteArrayList();
        this.f2784t = new CopyOnWriteArrayList();
        this.f2785u = new CopyOnWriteArrayList();
        this.f2786v = new CopyOnWriteArrayList();
        this.f2787w = new CopyOnWriteArrayList();
        this.f2788x = new CopyOnWriteArrayList();
        this.f2773A = new jc1(new C0879xj(abstractActivityC0790v4, 2));
        C0030a c0030a = this.f2430j;
        if (c0030a == null) {
            C0270h1.m2191g("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
            throw null;
        }
        c0030a.m437a(new C0953zj(i, abstractActivityC0790v4));
        this.f2430j.m437a(new C0953zj(i2, abstractActivityC0790v4));
        this.f2430j.m437a(new uh0() { // from class: androidx.activity.ComponentActivity$4
            @Override // p000.uh0
            /* JADX INFO: renamed from: d */
            public final void mo328d(yh0 yh0Var, ph0 ph0Var) {
                int i3 = AbstractActivityC0252gk.f2772C;
                AbstractActivityC0790v4 abstractActivityC0790v5 = abstractActivityC0790v4;
                if (abstractActivityC0790v5.f2778n == null) {
                    C0101ck c0101ck = (C0101ck) abstractActivityC0790v5.getLastNonConfigurationInstance();
                    if (c0101ck != null) {
                        abstractActivityC0790v5.f2778n = c0101ck.f1271a;
                    }
                    if (abstractActivityC0790v5.f2778n == null) {
                        abstractActivityC0790v5.f2778n = new gi1();
                    }
                }
                abstractActivityC0790v5.f2430j.m442f(this);
            }
        });
        m81Var.m3357f();
        xe1.m5636d(this);
        ((C0086c5) m81Var.f5011m).m851e("android:support:activity-result", new C0021ak(i, abstractActivityC0790v4));
        m2117g(new C0065bk(abstractActivityC0790v4, i));
        this.f2774B = new jc1(new C0879xj(abstractActivityC0790v4, 3));
    }

    /* JADX INFO: renamed from: e */
    public static void m2115e(gu0 gu0Var, AbstractActivityC0252gk abstractActivityC0252gk, yh0 yh0Var, ph0 ph0Var) {
        if (ph0Var == ph0.ON_CREATE) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = abstractActivityC0252gk.getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            gu0Var.m2153c(onBackInvokedDispatcher);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m2116f(AbstractActivityC0790v4 abstractActivityC0790v4) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            if (!af0.m187a(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (NullPointerException e2) {
            if (!af0.m187a(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    @Override // p000.x41
    /* JADX INFO: renamed from: a */
    public final C0086c5 mo859a() {
        return (C0086c5) this.f2777m.f5011m;
    }

    @Override // p000.oa0
    /* JADX INFO: renamed from: b */
    public final yq0 mo860b() {
        yq0 yq0Var = new yq0(0);
        LinkedHashMap linkedHashMap = (LinkedHashMap) yq0Var.f7192j;
        if (getApplication() != null) {
            linkedHashMap.put(o31.f5610r, getApplication());
        }
        linkedHashMap.put(xe1.f8936b, this);
        linkedHashMap.put(xe1.f8937c, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(xe1.f8938d, extras);
        }
        return yq0Var;
    }

    @Override // p000.hi1
    /* JADX INFO: renamed from: c */
    public final gi1 mo861c() {
        if (getApplication() == null) {
            C0270h1.m2191g("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        if (this.f2778n == null) {
            C0101ck c0101ck = (C0101ck) getLastNonConfigurationInstance();
            if (c0101ck != null) {
                this.f2778n = c0101ck.f1271a;
            }
            if (this.f2778n == null) {
                this.f2778n = new gi1();
            }
        }
        gi1 gi1Var = this.f2778n;
        gi1Var.getClass();
        return gi1Var;
    }

    @Override // p000.yh0
    /* JADX INFO: renamed from: d */
    public final C0030a mo862d() {
        return this.f2430j;
    }

    /* JADX INFO: renamed from: g */
    public final void m2117g(ju0 ju0Var) {
        p90 p90Var = this.f2775k;
        p90Var.getClass();
        AbstractActivityC0252gk abstractActivityC0252gk = (AbstractActivityC0252gk) p90Var.f6028k;
        if (abstractActivityC0252gk != null) {
            ju0Var.mo715a(abstractActivityC0252gk);
        }
        ((CopyOnWriteArraySet) p90Var.f6027j).add(ju0Var);
    }

    /* JADX INFO: renamed from: h */
    public final gu0 m2118h() {
        return (gu0) this.f2774B.m2847a();
    }

    /* JADX INFO: renamed from: i */
    public final void m2119i() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        decorView6.getClass();
        decorView6.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.f2781q.m1432a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        ((C0149dt) this.f2773A.m2847a()).m3288a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator it = this.f2782r.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((InterfaceC0291hm) it.next()).accept(configuration);
        }
    }

    @Override // p000.AbstractActivityC0214fk, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f2777m.m3358g(bundle);
        p90 p90Var = this.f2775k;
        p90Var.getClass();
        p90Var.f6028k = this;
        Iterator it = ((CopyOnWriteArraySet) p90Var.f6027j).iterator();
        while (it.hasNext()) {
            ((ju0) it.next()).mo715a(this);
        }
        super.onCreate(bundle);
        int i = g11.f2574j;
        e11.m1348b(this);
        getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f2776l.f6472l).iterator();
        while (it.hasNext()) {
            ((m50) it.next()).f4977a.m4731k();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        menuItem.getClass();
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            Iterator it = ((CopyOnWriteArrayList) this.f2776l.f6472l).iterator();
            while (it.hasNext()) {
                if (((m50) it.next()).f4977a.m4736p()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.f2789y = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.f2789y = false;
            Iterator it = this.f2785u.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((InterfaceC0291hm) it.next()).accept(new vq0(z));
            }
        } catch (Throwable th) {
            this.f2789y = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator it = this.f2784t.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((InterfaceC0291hm) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        menu.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.f2776l.f6472l).iterator();
        while (it.hasNext()) {
            ((m50) it.next()).f4977a.m4737q();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.f2790z = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.f2790z = false;
            Iterator it = this.f2786v.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((InterfaceC0291hm) it.next()).accept(new zv0(z));
            }
        } catch (Throwable th) {
            this.f2790z = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        pictureInPictureUiState.getClass();
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        u90 u90VarM4134a = qr0.m4134a(pictureInPictureUiState);
        Iterator it = this.f2787w.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((InterfaceC0291hm) it.next()).accept(u90VarM4134a);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f2776l.f6472l).iterator();
        while (it.hasNext()) {
            ((m50) it.next()).f4977a.m4740t();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (this.f2781q.m1432a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0101ck c0101ck;
        gi1 gi1Var = this.f2778n;
        if (gi1Var == null && (c0101ck = (C0101ck) getLastNonConfigurationInstance()) != null) {
            gi1Var = c0101ck.f1271a;
        }
        if (gi1Var == null) {
            return null;
        }
        C0101ck c0101ck2 = new C0101ck();
        c0101ck2.f1271a = gi1Var;
        return c0101ck2;
    }

    @Override // p000.AbstractActivityC0214fk, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        C0030a c0030a = this.f2430j;
        if (c0030a != null) {
            c0030a.m439c("setCurrentState");
            c0030a.m441e(qh0.f6499l);
        }
        super.onSaveInstanceState(bundle);
        this.f2777m.m3359h(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.f2783s.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((InterfaceC0291hm) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f2788x.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (fe1.m1774a()) {
                wo1.m5378a("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            e60 e60Var = (e60) this.f2780p.m2847a();
            synchronized (e60Var.f1967a) {
                try {
                    e60Var.f1968b = true;
                    ArrayList arrayList = e60Var.f1969c;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((f60) obj).mo1083a();
                    }
                    e60Var.f1969c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        m2119i();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ViewTreeObserverOnDrawListenerC0141dk viewTreeObserverOnDrawListenerC0141dk = this.f2779o;
        viewTreeObserverOnDrawListenerC0141dk.getClass();
        if (!viewTreeObserverOnDrawListenerC0141dk.f1673l) {
            viewTreeObserverOnDrawListenerC0141dk.f1673l = true;
            decorView.getViewTreeObserver().addOnDrawListener(viewTreeObserverOnDrawListenerC0141dk);
        }
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        intent.getClass();
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        intent.getClass();
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.f2789y) {
            return;
        }
        Iterator it = this.f2785u.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((InterfaceC0291hm) it.next()).accept(new vq0(z));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.f2790z) {
            return;
        }
        Iterator it = this.f2786v.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((InterfaceC0291hm) it.next()).accept(new zv0(z));
        }
    }
}
