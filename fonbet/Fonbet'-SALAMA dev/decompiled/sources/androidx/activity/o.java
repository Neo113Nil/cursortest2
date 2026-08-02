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
import androidx.lifecycle.AbstractC0741o;
import androidx.lifecycle.C0737k;
import androidx.lifecycle.C0747v;
import androidx.lifecycle.EnumC0739m;
import androidx.lifecycle.EnumC0740n;
import androidx.lifecycle.G;
import androidx.lifecycle.I;
import androidx.lifecycle.InterfaceC0735i;
import androidx.lifecycle.InterfaceC0745t;
import androidx.lifecycle.M;
import androidx.lifecycle.P;
import androidx.lifecycle.T;
import androidx.lifecycle.V;
import androidx.lifecycle.X;
import androidx.lifecycle.Y;
import com.salamadev.khotabaljomo3a.kichkabdelhamid.R;
import e.C0992a;
import f.AbstractC1056b;
import f.AbstractC1062h;
import f.C1057c;
import f.C1058d;
import f.C1061g;
import f.InterfaceC1055a;
import g.AbstractC1118a;
import io.sentry.protocol.SentryThread;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import n3.AbstractC1464a;

/* loaded from: classes.dex */
public abstract class o extends F.m implements Y, InterfaceC0735i, G0.h, B, G.m {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final AbstractC1062h mActivityResultRegistry;
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
    final C0992a mContextAwareHelper = new C0992a();
    private final C0747v mLifecycleRegistry = new C0747v(this);

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
        addOnContextAvailableListener(new e.b() { // from class: androidx.activity.f
            @Override // e.b
            public final void a(o oVar) {
                o.a(androidx.fragment.app.A.this);
            }
        });
    }

    public static void a(androidx.fragment.app.A a2) {
        Bundle a4 = a2.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (a4 != null) {
            AbstractC1062h abstractC1062h = ((o) a2).mActivityResultRegistry;
            abstractC1062h.getClass();
            ArrayList<Integer> integerArrayList = a4.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = a4.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            abstractC1062h.f12754d = a4.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            Bundle bundle = a4.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            Bundle bundle2 = abstractC1062h.f12757g;
            bundle2.putAll(bundle);
            for (int i7 = 0; i7 < stringArrayList.size(); i7++) {
                String str = stringArrayList.get(i7);
                HashMap hashMap = abstractC1062h.f12752b;
                boolean containsKey = hashMap.containsKey(str);
                HashMap hashMap2 = abstractC1062h.f12751a;
                if (containsKey) {
                    Integer num = (Integer) hashMap.remove(str);
                    if (!bundle2.containsKey(str)) {
                        hashMap2.remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i7);
                num2.intValue();
                String str2 = stringArrayList.get(i7);
                hashMap2.put(num2, str2);
                hashMap.put(str2, num2);
            }
        }
    }

    public static Bundle b(androidx.fragment.app.A a2) {
        Bundle bundle = new Bundle();
        AbstractC1062h abstractC1062h = ((o) a2).mActivityResultRegistry;
        abstractC1062h.getClass();
        HashMap hashMap = abstractC1062h.f12752b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(hashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(hashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(abstractC1062h.f12754d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) abstractC1062h.f12757g.clone());
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

    public final void addOnContextAvailableListener(e.b bVar) {
        C0992a c0992a = this.mContextAwareHelper;
        c0992a.getClass();
        t6.h.e(bVar, "listener");
        o oVar = c0992a.f12494b;
        if (oVar != null) {
            bVar.a(oVar);
        }
        c0992a.f12493a.add(bVar);
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

    public final AbstractC1062h getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    @Override // androidx.lifecycle.InterfaceC0735i
    public m0.b getDefaultViewModelCreationExtras() {
        m0.c cVar = new m0.c();
        Application application = getApplication();
        LinkedHashMap linkedHashMap = cVar.f15202a;
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

    @Override // androidx.lifecycle.InterfaceC0745t
    public AbstractC0741o getLifecycle() {
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
        C0992a c0992a = this.mContextAwareHelper;
        c0992a.getClass();
        c0992a.f12494b = this;
        Iterator it = c0992a.f12493a.iterator();
        while (it.hasNext()) {
            ((e.b) it.next()).a(this);
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
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        X x4 = this.mViewModelStore;
        if (x4 == null && (lVar = (l) getLastNonConfigurationInstance()) != null) {
            x4 = lVar.f8106b;
        }
        if (x4 == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        l lVar2 = new l();
        lVar2.f8105a = onRetainCustomNonConfigurationInstance;
        lVar2.f8106b = x4;
        return lVar2;
    }

    @Override // F.m, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        AbstractC0741o lifecycle = getLifecycle();
        if (lifecycle instanceof C0747v) {
            ((C0747v) lifecycle).g();
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
        return this.mContextAwareHelper.f12494b;
    }

    public final <I, O> AbstractC1056b registerForActivityResult(AbstractC1118a abstractC1118a, AbstractC1062h abstractC1062h, InterfaceC1055a interfaceC1055a) {
        String str = "activity_rq#" + this.mNextLocalRequestCode.getAndIncrement();
        abstractC1062h.getClass();
        AbstractC0741o lifecycle = getLifecycle();
        C0747v c0747v = (C0747v) lifecycle;
        if (c0747v.f9637c.compareTo(EnumC0740n.f9629d) >= 0) {
            throw new IllegalStateException("LifecycleOwner " + this + " is attempting to register while current state is " + c0747v.f9637c + ". LifecycleOwners must call register before they are STARTED.");
        }
        abstractC1062h.d(str);
        HashMap hashMap = abstractC1062h.f12753c;
        C1061g c1061g = (C1061g) hashMap.get(str);
        if (c1061g == null) {
            c1061g = new C1061g(lifecycle);
        }
        C1057c c1057c = new C1057c(abstractC1062h, str, interfaceC1055a, abstractC1118a);
        c1061g.f12749a.a(c1057c);
        c1061g.f12750b.add(c1057c);
        hashMap.put(str, c1061g);
        return new C1058d();
    }

    public void removeMenuProvider(InterfaceC0361q interfaceC0361q) {
        this.mMenuHostHelper.b(interfaceC0361q);
    }

    @Override // G.m
    public final void removeOnConfigurationChangedListener(O.a aVar) {
        this.mOnConfigurationChangedListeners.remove(aVar);
    }

    public final void removeOnContextAvailableListener(e.b bVar) {
        C0992a c0992a = this.mContextAwareHelper;
        c0992a.getClass();
        t6.h.e(bVar, "listener");
        c0992a.f12493a.remove(bVar);
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
            if (AbstractC1464a.D()) {
                Trace.beginSection(AbstractC1464a.W("reportFullyDrawn() for ComponentActivity"));
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
    public void startIntentSenderForResult(IntentSender intentSender, int i7, Intent intent, int i8, int i9, int i10) {
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
            Iterator<O.a> it = this.mOnMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                O.a next = it.next();
                t6.h.e(configuration, "newConfig");
                next.accept(new F.p(z4));
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
            Iterator<O.a> it = this.mOnPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                O.a next = it.next();
                t6.h.e(configuration, "newConfig");
                next.accept(new F.I(z4));
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

    public void addMenuProvider(final InterfaceC0361q interfaceC0361q, InterfaceC0745t interfaceC0745t) {
        final C0359o c0359o = this.mMenuHostHelper;
        c0359o.f5095b.add(interfaceC0361q);
        c0359o.f5094a.run();
        AbstractC0741o lifecycle = interfaceC0745t.getLifecycle();
        HashMap hashMap = c0359o.f5096c;
        C0358n c0358n = (C0358n) hashMap.remove(interfaceC0361q);
        if (c0358n != null) {
            c0358n.f5092a.b(c0358n.f5093b);
            c0358n.f5093b = null;
        }
        hashMap.put(interfaceC0361q, new C0358n(lifecycle, new androidx.lifecycle.r() { // from class: P.m
            @Override // androidx.lifecycle.r
            public final void a(InterfaceC0745t interfaceC0745t2, EnumC0739m enumC0739m) {
                EnumC0739m enumC0739m2 = EnumC0739m.ON_DESTROY;
                C0359o c0359o2 = C0359o.this;
                if (enumC0739m == enumC0739m2) {
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

    public void addMenuProvider(final InterfaceC0361q interfaceC0361q, InterfaceC0745t interfaceC0745t, final EnumC0740n enumC0740n) {
        final C0359o c0359o = this.mMenuHostHelper;
        c0359o.getClass();
        AbstractC0741o lifecycle = interfaceC0745t.getLifecycle();
        HashMap hashMap = c0359o.f5096c;
        C0358n c0358n = (C0358n) hashMap.remove(interfaceC0361q);
        if (c0358n != null) {
            c0358n.f5092a.b(c0358n.f5093b);
            c0358n.f5093b = null;
        }
        hashMap.put(interfaceC0361q, new C0358n(lifecycle, new androidx.lifecycle.r() { // from class: P.l
            @Override // androidx.lifecycle.r
            public final void a(InterfaceC0745t interfaceC0745t2, EnumC0739m enumC0739m) {
                C0359o c0359o2 = C0359o.this;
                c0359o2.getClass();
                EnumC0739m.Companion.getClass();
                EnumC0740n enumC0740n2 = enumC0740n;
                t6.h.e(enumC0740n2, SentryThread.JsonKeys.STATE);
                int ordinal = enumC0740n2.ordinal();
                EnumC0739m enumC0739m2 = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : EnumC0739m.ON_RESUME : EnumC0739m.ON_START : EnumC0739m.ON_CREATE;
                Runnable runnable = c0359o2.f5094a;
                CopyOnWriteArrayList copyOnWriteArrayList = c0359o2.f5095b;
                InterfaceC0361q interfaceC0361q2 = interfaceC0361q;
                if (enumC0739m == enumC0739m2) {
                    copyOnWriteArrayList.add(interfaceC0361q2);
                    runnable.run();
                } else if (enumC0739m == EnumC0739m.ON_DESTROY) {
                    c0359o2.b(interfaceC0361q2);
                } else if (enumC0739m == C0737k.a(enumC0740n2)) {
                    copyOnWriteArrayList.remove(interfaceC0361q2);
                    runnable.run();
                }
            }
        }));
    }

    public final <I, O> AbstractC1056b registerForActivityResult(AbstractC1118a abstractC1118a, InterfaceC1055a interfaceC1055a) {
        return registerForActivityResult(abstractC1118a, this.mActivityResultRegistry, interfaceC1055a);
    }
}
