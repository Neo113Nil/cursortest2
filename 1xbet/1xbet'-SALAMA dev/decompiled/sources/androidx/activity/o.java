package androidx.activity;

import A1.K0;
import P.C0358n;
import P.C0359o;
import P.InterfaceC0361q;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC0720o;
import androidx.lifecycle.C0716k;
import androidx.lifecycle.C0726v;
import androidx.lifecycle.EnumC0718m;
import androidx.lifecycle.EnumC0719n;
import androidx.lifecycle.G;
import androidx.lifecycle.I;
import androidx.lifecycle.InterfaceC0714i;
import androidx.lifecycle.InterfaceC0724t;
import androidx.lifecycle.M;
import androidx.lifecycle.P;
import androidx.lifecycle.T;
import androidx.lifecycle.V;
import androidx.lifecycle.X;
import androidx.lifecycle.Y;
import com.salamadev.nabilalawadi.kisaskoran.R;
import io.sentry.protocol.SentryThread;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class o extends F.m implements Y, InterfaceC0714i, G0.h, B, G.m {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final p037f.h mActivityResultRegistry;
    private int mContentLayoutId;
    private V mDefaultFactory;
    private boolean mDispatchingOnMultiWindowModeChanged;
    private boolean mDispatchingOnPictureInPictureModeChanged;
    final q mFullyDrawnReporter;
    private final C0359o mMenuHostHelper;
    private final AtomicInteger mNextLocalRequestCode;
    private A mOnBackPressedDispatcher;
    private final CopyOnWriteArrayList<O.a> mOnConfigurationChangedListeners;
    private final CopyOnWriteArrayList<O.a> mOnMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<O.a> mOnNewIntentListeners;
    private final CopyOnWriteArrayList<O.a> mOnPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<O.a> mOnTrimMemoryListeners;
    final m mReportFullyDrawnExecutor;
    final G0.g mSavedStateRegistryController;
    private X mViewModelStore;
    final p029e.a mContextAwareHelper = new p029e.a();
    private final C0726v mLifecycleRegistry = new C0726v(this);

    public o() {
        final androidx.fragment.app.A a2 = (androidx.fragment.app.A) this;
        this.mMenuHostHelper = new C0359o(new K0(a2, 19));
        G0.g gVar = new G0.g(this);
        this.mSavedStateRegistryController = gVar;
        this.mOnBackPressedDispatcher = null;
        n nVar = new n(a2);
        this.mReportFullyDrawnExecutor = nVar;
        this.mFullyDrawnReporter = new q(nVar, new d(a2, 0));
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new h(a2);
        this.mOnConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.mOnNewIntentListeners = new CopyOnWriteArrayList<>();
        this.mOnMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mDispatchingOnMultiWindowModeChanged = false;
        this.mDispatchingOnPictureInPictureModeChanged = false;
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().a(new i(a2, 1));
        getLifecycle().a(new i(a2, 0));
        getLifecycle().a(new i(a2, 2));
        gVar.a();
        M.d(this);
        getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new e(a2, 0));
        addOnContextAvailableListener(new p029e.b() { // from class: androidx.activity.f
            @Override // p029e.b
            public final void a(o oVar) {
                o.a(a2);
            }
        });
    }

    public static void a(androidx.fragment.app.A a2) {
        Bundle bundleA = a2.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (bundleA != null) {
            p037f.h hVar = ((o) a2).mActivityResultRegistry;
            hVar.getClass();
            ArrayList<Integer> integerArrayList = bundleA.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            hVar.f12760d = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            Bundle bundle = bundleA.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            Bundle bundle2 = hVar.f12763g;
            bundle2.putAll(bundle);
            for (int i7 = 0; i7 < stringArrayList.size(); i7++) {
                String str = stringArrayList.get(i7);
                HashMap map = hVar.f12758b;
                boolean zContainsKey = map.containsKey(str);
                HashMap map2 = hVar.f12757a;
                if (zContainsKey) {
                    Integer num = (Integer) map.remove(str);
                    if (!bundle2.containsKey(str)) {
                        map2.remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i7);
                num2.intValue();
                String str2 = stringArrayList.get(i7);
                map2.put(num2, str2);
                map.put(str2, num2);
            }
        }
    }

    public static Bundle b(androidx.fragment.app.A a2) {
        Bundle bundle = new Bundle();
        p037f.h hVar = ((o) a2).mActivityResultRegistry;
        hVar.getClass();
        HashMap map = hVar.f12758b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(map.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(map.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(hVar.f12760d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) hVar.f12763g.clone());
        return bundle;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.b(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    public void addMenuProvider(InterfaceC0361q interfaceC0361q) {
        C0359o c0359o = this.mMenuHostHelper;
        c0359o.f5095b.add(interfaceC0361q);
        c0359o.f5094a.run();
    }

    @Override // G.m
    public final void addOnConfigurationChangedListener(O.a aVar) {
        this.mOnConfigurationChangedListeners.add(aVar);
    }

    public final void addOnContextAvailableListener(p029e.b bVar) {
        p029e.a aVar = this.mContextAwareHelper;
        aVar.getClass();
        t6.h.e(bVar, "listener");
        o oVar = aVar.f12500b;
        if (oVar != null) {
            bVar.a(oVar);
        }
        aVar.f12499a.add(bVar);
    }

    public final void addOnMultiWindowModeChangedListener(O.a aVar) {
        this.mOnMultiWindowModeChangedListeners.add(aVar);
    }

    public final void addOnNewIntentListener(O.a aVar) {
        this.mOnNewIntentListeners.add(aVar);
    }

    public final void addOnPictureInPictureModeChangedListener(O.a aVar) {
        this.mOnPictureInPictureModeChangedListeners.add(aVar);
    }

    public final void addOnTrimMemoryListener(O.a aVar) {
        this.mOnTrimMemoryListeners.add(aVar);
    }

    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            l lVar = (l) getLastNonConfigurationInstance();
            if (lVar != null) {
                this.mViewModelStore = lVar.f8106b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new X();
            }
        }
    }

    public final p037f.h getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    @Override // androidx.lifecycle.InterfaceC0714i
    public p087m0.b getDefaultViewModelCreationExtras() {
        p087m0.c cVar = new p087m0.c();
        Application application = getApplication();
        LinkedHashMap linkedHashMap = cVar.f15208a;
        if (application != null) {
            linkedHashMap.put(T.f9608a, getApplication());
        }
        linkedHashMap.put(M.f9581a, this);
        linkedHashMap.put(M.f9582b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            linkedHashMap.put(M.f9583c, getIntent().getExtras());
        }
        return cVar;
    }

    public V getDefaultViewModelProviderFactory() {
        if (this.mDefaultFactory == null) {
            this.mDefaultFactory = new P(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.mDefaultFactory;
    }

    public q getFullyDrawnReporter() {
        return this.mFullyDrawnReporter;
    }

    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        l lVar = (l) getLastNonConfigurationInstance();
        if (lVar != null) {
            return lVar.f8105a;
        }
        return null;
    }

    @Override // androidx.lifecycle.InterfaceC0724t
    public AbstractC0720o getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // androidx.activity.B
    public final A getOnBackPressedDispatcher() {
        if (this.mOnBackPressedDispatcher == null) {
            this.mOnBackPressedDispatcher = new A(new j(this));
            getLifecycle().a(new i(this, 3));
        }
        return this.mOnBackPressedDispatcher;
    }

    @Override // G0.h
    public final G0.f getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f2847b;
    }

    @Override // androidx.lifecycle.Y
    public X getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        ensureViewModelStore();
        return this.mViewModelStore;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        t6.h.e(decorView, "<this>");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        t6.h.e(decorView2, "<this>");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        t6.h.e(decorView3, "<this>");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        t6.h.e(decorView4, "<this>");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        t6.h.e(decorView5, "<this>");
        decorView5.setTag(R.id.report_drawn, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i7, int i8, Intent intent) {
        if (this.mActivityResultRegistry.a(i7, i8, intent)) {
            return;
        }
        super.onActivityResult(i7, i8, intent);
    }

    @Override // android.app.Activity
    @Deprecated
    public void onBackPressed() {
        getOnBackPressedDispatcher().a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<O.a> it = this.mOnConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // F.m, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.mSavedStateRegistryController.b(bundle);
        p029e.a aVar = this.mContextAwareHelper;
        aVar.getClass();
        aVar.f12500b = this;
        Iterator it = aVar.f12499a.iterator();
        while (it.hasNext()) {
            ((p029e.b) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i7 = I.f9570b;
        G.b(this);
        int i8 = this.mContentLayoutId;
        if (i8 != 0) {
            setContentView(i8);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i7, Menu menu) {
        if (i7 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i7, menu);
        C0359o c0359o = this.mMenuHostHelper;
        getMenuInflater();
        Iterator it = c0359o.f5095b.iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.I) ((InterfaceC0361q) it.next())).f9360a.k();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i7, MenuItem menuItem) {
        if (super.onMenuItemSelected(i7, menuItem)) {
            return true;
        }
        if (i7 == 0) {
            return this.mMenuHostHelper.a();
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z4) {
        if (this.mDispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<O.a> it = this.mOnMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new F.p(z4));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator<O.a> it = this.mOnNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i7, Menu menu) {
        Iterator it = this.mMenuHostHelper.f5095b.iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.I) ((InterfaceC0361q) it.next())).f9360a.q();
        }
        super.onPanelClosed(i7, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z4) {
        if (this.mDispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<O.a> it = this.mOnPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new F.I(z4));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i7, View view, Menu menu) {
        if (i7 != 0) {
            return true;
        }
        super.onPreparePanel(i7, view, menu);
        Iterator it = this.mMenuHostHelper.f5095b.iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.I) ((InterfaceC0361q) it.next())).f9360a.t();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        if (this.mActivityResultRegistry.a(i7, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i7, strArr, iArr);
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        l lVar;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        X x4 = this.mViewModelStore;
        if (x4 == null && (lVar = (l) getLastNonConfigurationInstance()) != null) {
            x4 = lVar.f8106b;
        }
        if (x4 == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        l lVar2 = new l();
        lVar2.f8105a = objOnRetainCustomNonConfigurationInstance;
        lVar2.f8106b = x4;
        return lVar2;
    }

    @Override // F.m, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        AbstractC0720o lifecycle = getLifecycle();
        if (lifecycle instanceof C0726v) {
            ((C0726v) lifecycle).g();
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i7) {
        super.onTrimMemory(i7);
        Iterator<O.a> it = this.mOnTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i7));
        }
    }

    public Context peekAvailableContext() {
        return this.mContextAwareHelper.f12500b;
    }

    public final <I, O> p037f.b registerForActivityResult(p045g.a aVar, p037f.h hVar, p037f.a aVar2) {
        String str = "activity_rq#" + this.mNextLocalRequestCode.getAndIncrement();
        hVar.getClass();
        AbstractC0720o lifecycle = getLifecycle();
        C0726v c0726v = (C0726v) lifecycle;
        if (c0726v.f9637c.compareTo(EnumC0719n.f9629d) >= 0) {
            throw new IllegalStateException("LifecycleOwner " + this + " is attempting to register while current state is " + c0726v.f9637c + ". LifecycleOwners must call register before they are STARTED.");
        }
        hVar.d(str);
        HashMap map = hVar.f12759c;
        p037f.g gVar = (p037f.g) map.get(str);
        if (gVar == null) {
            gVar = new p037f.g(lifecycle);
        }
        p037f.c cVar = new p037f.c(hVar, str, aVar2, aVar);
        gVar.f12755a.a(cVar);
        gVar.f12756b.add(cVar);
        map.put(str, gVar);
        return new p037f.d();
    }

    public void removeMenuProvider(InterfaceC0361q interfaceC0361q) {
        this.mMenuHostHelper.b(interfaceC0361q);
    }

    @Override // G.m
    public final void removeOnConfigurationChangedListener(O.a aVar) {
        this.mOnConfigurationChangedListeners.remove(aVar);
    }

    public final void removeOnContextAvailableListener(p029e.b bVar) {
        p029e.a aVar = this.mContextAwareHelper;
        aVar.getClass();
        t6.h.e(bVar, "listener");
        aVar.f12499a.remove(bVar);
    }

    public final void removeOnMultiWindowModeChangedListener(O.a aVar) {
        this.mOnMultiWindowModeChangedListeners.remove(aVar);
    }

    public final void removeOnNewIntentListener(O.a aVar) {
        this.mOnNewIntentListeners.remove(aVar);
    }

    public final void removeOnPictureInPictureModeChangedListener(O.a aVar) {
        this.mOnPictureInPictureModeChangedListeners.remove(aVar);
    }

    public final void removeOnTrimMemoryListener(O.a aVar) {
        this.mOnTrimMemoryListeners.remove(aVar);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (p097n3.a.D()) {
                Trace.beginSection(p097n3.a.W("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            q qVar = this.mFullyDrawnReporter;
            synchronized (qVar.f8114a) {
                try {
                    qVar.f8115b = true;
                    Iterator it = qVar.f8116c.iterator();
                    while (it.hasNext()) {
                        ((s6.a) it.next()).invoke();
                    }
                    qVar.f8116c.clear();
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
    public void setContentView(int i7) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.b(getWindow().getDecorView());
        super.setContentView(i7);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i7) {
        super.startActivityForResult(intent, i7);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i7, Intent intent, int i8, int i9, int i10) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i7, intent, i8, i9, i10);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i7, Bundle bundle) {
        super.startActivityForResult(intent, i7, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i7, Intent intent, int i8, int i9, int i10, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i7, intent, i8, i9, i10, bundle);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z4, Configuration configuration) {
        this.mDispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z4, configuration);
            this.mDispatchingOnMultiWindowModeChanged = false;
            for (O.a aVar : this.mOnMultiWindowModeChangedListeners) {
                t6.h.e(configuration, "newConfig");
                aVar.accept(new F.p(z4));
            }
        } catch (Throwable th) {
            this.mDispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z4, Configuration configuration) {
        this.mDispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z4, configuration);
            this.mDispatchingOnPictureInPictureModeChanged = false;
            for (O.a aVar : this.mOnPictureInPictureModeChangedListeners) {
                t6.h.e(configuration, "newConfig");
                aVar.accept(new F.I(z4));
            }
        } catch (Throwable th) {
            this.mDispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.b(getWindow().getDecorView());
        super.setContentView(view);
    }

    public void addMenuProvider(final InterfaceC0361q interfaceC0361q, InterfaceC0724t interfaceC0724t) {
        final C0359o c0359o = this.mMenuHostHelper;
        c0359o.f5095b.add(interfaceC0361q);
        c0359o.f5094a.run();
        AbstractC0720o lifecycle = interfaceC0724t.getLifecycle();
        HashMap map = c0359o.f5096c;
        C0358n c0358n = (C0358n) map.remove(interfaceC0361q);
        if (c0358n != null) {
            c0358n.f5092a.b(c0358n.f5093b);
            c0358n.f5093b = null;
        }
        map.put(interfaceC0361q, new C0358n(lifecycle, new androidx.lifecycle.r() { // from class: P.m
            @Override // androidx.lifecycle.r
            public final void a(InterfaceC0724t interfaceC0724t2, EnumC0718m enumC0718m) {
                EnumC0718m enumC0718m2 = EnumC0718m.ON_DESTROY;
                C0359o c0359o2 = c0359o;
                if (enumC0718m == enumC0718m2) {
                    c0359o2.b(interfaceC0361q);
                } else {
                    c0359o2.getClass();
                }
            }
        }));
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.b(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    public void addMenuProvider(final InterfaceC0361q interfaceC0361q, InterfaceC0724t interfaceC0724t, final EnumC0719n enumC0719n) {
        final C0359o c0359o = this.mMenuHostHelper;
        c0359o.getClass();
        AbstractC0720o lifecycle = interfaceC0724t.getLifecycle();
        HashMap map = c0359o.f5096c;
        C0358n c0358n = (C0358n) map.remove(interfaceC0361q);
        if (c0358n != null) {
            c0358n.f5092a.b(c0358n.f5093b);
            c0358n.f5093b = null;
        }
        map.put(interfaceC0361q, new C0358n(lifecycle, new androidx.lifecycle.r() { // from class: P.l
            @Override // androidx.lifecycle.r
            public final void a(InterfaceC0724t interfaceC0724t2, EnumC0718m enumC0718m) {
                EnumC0718m enumC0718m2;
                C0359o c0359o2 = c0359o;
                c0359o2.getClass();
                EnumC0718m.Companion.getClass();
                EnumC0719n enumC0719n2 = enumC0719n;
                t6.h.e(enumC0719n2, SentryThread.JsonKeys.STATE);
                int iOrdinal = enumC0719n2.ordinal();
                if (iOrdinal == 2) {
                    enumC0718m2 = EnumC0718m.ON_CREATE;
                } else if (iOrdinal != 3) {
                    enumC0718m2 = iOrdinal != 4 ? null : EnumC0718m.ON_RESUME;
                } else {
                    enumC0718m2 = EnumC0718m.ON_START;
                }
                Runnable runnable = c0359o2.f5094a;
                CopyOnWriteArrayList copyOnWriteArrayList = c0359o2.f5095b;
                InterfaceC0361q interfaceC0361q2 = interfaceC0361q;
                if (enumC0718m == enumC0718m2) {
                    copyOnWriteArrayList.add(interfaceC0361q2);
                    runnable.run();
                } else if (enumC0718m == EnumC0718m.ON_DESTROY) {
                    c0359o2.b(interfaceC0361q2);
                } else if (enumC0718m == C0716k.a(enumC0719n2)) {
                    copyOnWriteArrayList.remove(interfaceC0361q2);
                    runnable.run();
                }
            }
        }));
    }

    public final <I, O> p037f.b registerForActivityResult(p045g.a aVar, p037f.a aVar2) {
        return registerForActivityResult(aVar, this.mActivityResultRegistry, aVar2);
    }
}
