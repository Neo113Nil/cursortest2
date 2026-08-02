package i;

import F.AbstractC0213i;
import F.K;
import F.L;
import android.R;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.C0;
import androidx.appcompat.widget.C0665u;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.o1;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import l.AbstractC1364b;
import l.C1367e;
import l.C1372j;
import l.InterfaceC1363a;
import w1.C1722m0;

/* renamed from: i.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC1231i extends androidx.fragment.app.A implements InterfaceC1232j, K {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private m mDelegate;
    private Resources mResources;

    @Override // androidx.activity.o, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d();
        v vVar = (v) getDelegate();
        vVar.x();
        ((ViewGroup) vVar.f13765R.findViewById(R.id.content)).addView(view, layoutParams);
        vVar.f13751D.a(vVar.f13750C.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        Configuration configuration;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        v vVar = (v) getDelegate();
        vVar.f13778f0 = true;
        int i15 = vVar.f13782j0;
        if (i15 == -100) {
            i15 = m.f13707b;
        }
        int D7 = vVar.D(i15, context);
        if (m.d(context) && m.d(context)) {
            if (!L.b.c()) {
                synchronized (m.f13714z) {
                    try {
                        L.j jVar = m.f13708c;
                        if (jVar == null) {
                            if (m.f13709d == null) {
                                m.f13709d = L.j.a(P6.b.E(context));
                            }
                            if (!m.f13709d.f4186a.f4187a.isEmpty()) {
                                m.f13708c = m.f13709d;
                            }
                        } else if (!jVar.equals(m.f13709d)) {
                            L.j jVar2 = m.f13708c;
                            m.f13709d = jVar2;
                            P6.b.C(context, jVar2.f4186a.f4187a.toLanguageTags());
                        }
                    } finally {
                    }
                }
            } else if (!m.f13711f) {
                m.f13706a.execute(new A0.g(context, 2));
            }
        }
        L.j q7 = v.q(context);
        if (v.f13745B0 && (context instanceof ContextThemeWrapper)) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(v.u(context, D7, q7, null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof C1367e) {
            try {
                ((C1367e) context).a(v.u(context, D7, q7, null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (v.f13744A0) {
            int i16 = Build.VERSION.SDK_INT;
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (configuration3.equals(configuration4)) {
                configuration = null;
            } else {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configuration3.diff(configuration4) != 0) {
                    float f7 = configuration3.fontScale;
                    float f8 = configuration4.fontScale;
                    if (f7 != f8) {
                        configuration.fontScale = f8;
                    }
                    int i17 = configuration3.mcc;
                    int i18 = configuration4.mcc;
                    if (i17 != i18) {
                        configuration.mcc = i18;
                    }
                    int i19 = configuration3.mnc;
                    int i20 = configuration4.mnc;
                    if (i19 != i20) {
                        configuration.mnc = i20;
                    }
                    p.a(configuration3, configuration4, configuration);
                    int i21 = configuration3.touchscreen;
                    int i22 = configuration4.touchscreen;
                    if (i21 != i22) {
                        configuration.touchscreen = i22;
                    }
                    int i23 = configuration3.keyboard;
                    int i24 = configuration4.keyboard;
                    if (i23 != i24) {
                        configuration.keyboard = i24;
                    }
                    int i25 = configuration3.keyboardHidden;
                    int i26 = configuration4.keyboardHidden;
                    if (i25 != i26) {
                        configuration.keyboardHidden = i26;
                    }
                    int i27 = configuration3.navigation;
                    int i28 = configuration4.navigation;
                    if (i27 != i28) {
                        configuration.navigation = i28;
                    }
                    int i29 = configuration3.navigationHidden;
                    int i30 = configuration4.navigationHidden;
                    if (i29 != i30) {
                        configuration.navigationHidden = i30;
                    }
                    int i31 = configuration3.orientation;
                    int i32 = configuration4.orientation;
                    if (i31 != i32) {
                        configuration.orientation = i32;
                    }
                    int i33 = configuration3.screenLayout & 15;
                    int i34 = configuration4.screenLayout & 15;
                    if (i33 != i34) {
                        configuration.screenLayout |= i34;
                    }
                    int i35 = configuration3.screenLayout & 192;
                    int i36 = configuration4.screenLayout & 192;
                    if (i35 != i36) {
                        configuration.screenLayout |= i36;
                    }
                    int i37 = configuration3.screenLayout & 48;
                    int i38 = configuration4.screenLayout & 48;
                    if (i37 != i38) {
                        configuration.screenLayout |= i38;
                    }
                    int i39 = configuration3.screenLayout & 768;
                    int i40 = configuration4.screenLayout & 768;
                    if (i39 != i40) {
                        configuration.screenLayout |= i40;
                    }
                    if (i16 >= 26) {
                        i7 = configuration3.colorMode;
                        int i41 = i7 & 3;
                        i8 = configuration4.colorMode;
                        if (i41 != (i8 & 3)) {
                            i13 = configuration.colorMode;
                            i14 = configuration4.colorMode;
                            configuration.colorMode = i13 | (i14 & 3);
                        }
                        i9 = configuration3.colorMode;
                        int i42 = i9 & 12;
                        i10 = configuration4.colorMode;
                        if (i42 != (i10 & 12)) {
                            i11 = configuration.colorMode;
                            i12 = configuration4.colorMode;
                            configuration.colorMode = i11 | (i12 & 12);
                        }
                    }
                    int i43 = configuration3.uiMode & 15;
                    int i44 = configuration4.uiMode & 15;
                    if (i43 != i44) {
                        configuration.uiMode |= i44;
                    }
                    int i45 = configuration3.uiMode & 48;
                    int i46 = configuration4.uiMode & 48;
                    if (i45 != i46) {
                        configuration.uiMode |= i46;
                    }
                    int i47 = configuration3.screenWidthDp;
                    int i48 = configuration4.screenWidthDp;
                    if (i47 != i48) {
                        configuration.screenWidthDp = i48;
                    }
                    int i49 = configuration3.screenHeightDp;
                    int i50 = configuration4.screenHeightDp;
                    if (i49 != i50) {
                        configuration.screenHeightDp = i50;
                    }
                    int i51 = configuration3.smallestScreenWidthDp;
                    int i52 = configuration4.smallestScreenWidthDp;
                    if (i51 != i52) {
                        configuration.smallestScreenWidthDp = i52;
                    }
                    int i53 = configuration3.densityDpi;
                    int i54 = configuration4.densityDpi;
                    if (i53 != i54) {
                        configuration.densityDpi = i54;
                    }
                }
            }
            Configuration u4 = v.u(context, D7, q7, configuration, true);
            C1367e c1367e = new C1367e(context, com.salamadev.khotabaljomo3a.kichkabdelhamid.R.style.Theme_AppCompat_Empty);
            c1367e.a(u4);
            try {
                if (context.getTheme() != null) {
                    Resources.Theme theme = c1367e.getTheme();
                    if (i16 >= 29) {
                        H.l.a(theme);
                    } else {
                        synchronized (H.b.f3154e) {
                            if (!H.b.f3156g) {
                                try {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                    H.b.f3155f = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                } catch (NoSuchMethodException e7) {
                                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e7);
                                }
                                H.b.f3156g = true;
                            }
                            Method method = H.b.f3155f;
                            if (method != null) {
                                try {
                                    method.invoke(theme, null);
                                } catch (IllegalAccessException | InvocationTargetException e8) {
                                    Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e8);
                                    H.b.f3155f = null;
                                }
                            }
                        }
                    }
                }
            } catch (NullPointerException unused3) {
            }
            context = c1367e;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        AbstractC1223a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.a()) {
                super.closeOptionsMenu();
            }
        }
    }

    public final void d() {
        View decorView = getWindow().getDecorView();
        t6.h.e(decorView, "<this>");
        decorView.setTag(com.salamadev.khotabaljomo3a.kichkabdelhamid.R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        t6.h.e(decorView2, "<this>");
        decorView2.setTag(com.salamadev.khotabaljomo3a.kichkabdelhamid.R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        t6.h.e(decorView3, "<this>");
        decorView3.setTag(com.salamadev.khotabaljomo3a.kichkabdelhamid.R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        t6.h.e(decorView4, "<this>");
        decorView4.setTag(com.salamadev.khotabaljomo3a.kichkabdelhamid.R.id.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    @Override // F.m, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC1223a supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.l(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i7) {
        v vVar = (v) getDelegate();
        vVar.x();
        return (T) vVar.f13750C.findViewById(i7);
    }

    public m getDelegate() {
        if (this.mDelegate == null) {
            ExecutorC1215B executorC1215B = m.f13706a;
            this.mDelegate = new v(this, null, this, this);
        }
        return this.mDelegate;
    }

    public InterfaceC1224b getDrawerToggleDelegate() {
        ((v) getDelegate()).getClass();
        return new C1722m0(18);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        v vVar = (v) getDelegate();
        if (vVar.f13754G == null) {
            vVar.B();
            AbstractC1223a abstractC1223a = vVar.f13753F;
            vVar.f13754G = new C1372j(abstractC1223a != null ? abstractC1223a.e() : vVar.f13749B);
        }
        return vVar.f13754G;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = this.mResources;
        if (resources == null) {
            int i7 = o1.f8729a;
        }
        return resources == null ? super.getResources() : resources;
    }

    public AbstractC1223a getSupportActionBar() {
        v vVar = (v) getDelegate();
        vVar.B();
        return vVar.f13753F;
    }

    @Override // F.K
    public Intent getSupportParentActivityIntent() {
        return AbstractC0213i.a(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().c();
    }

    @Override // androidx.activity.o, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        v vVar = (v) getDelegate();
        if (vVar.f13770W && vVar.f13764Q) {
            vVar.B();
            AbstractC1223a abstractC1223a = vVar.f13753F;
            if (abstractC1223a != null) {
                abstractC1223a.i();
            }
        }
        C0665u a2 = C0665u.a();
        Context context = vVar.f13749B;
        synchronized (a2) {
            C0 c0 = a2.f8748a;
            synchronized (c0) {
                r.f fVar = (r.f) c0.f8323b.get(context);
                if (fVar != null) {
                    fVar.a();
                }
            }
        }
        vVar.f13781i0 = new Configuration(vVar.f13749B.getResources().getConfiguration());
        vVar.o(false, false);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(L l7) {
        l7.getClass();
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = AbstractC0213i.a(this);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            AbstractActivityC1231i abstractActivityC1231i = l7.f2428b;
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(abstractActivityC1231i.getPackageManager());
            }
            ArrayList arrayList = l7.f2427a;
            int size = arrayList.size();
            try {
                for (Intent b7 = AbstractC0213i.b(abstractActivityC1231i, component); b7 != null; b7 = AbstractC0213i.b(abstractActivityC1231i, b7.getComponent())) {
                    arrayList.add(size, b7);
                }
                arrayList.add(supportParentActivityIntent);
            } catch (PackageManager.NameNotFoundException e7) {
                Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                throw new IllegalArgumentException(e7);
            }
        }
    }

    @Override // androidx.fragment.app.A, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getDelegate().g();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i7, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i7, keyEvent);
        }
        return true;
    }

    @Override // androidx.fragment.app.A, androidx.activity.o, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i7, MenuItem menuItem) {
        if (super.onMenuItemSelected(i7, menuItem)) {
            return true;
        }
        AbstractC1223a supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.d() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i7, Menu menu) {
        return super.onMenuOpened(i7, menu);
    }

    @Override // androidx.activity.o, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i7, Menu menu) {
        super.onPanelClosed(i7, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((v) getDelegate()).x();
    }

    @Override // androidx.fragment.app.A, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        v vVar = (v) getDelegate();
        vVar.B();
        AbstractC1223a abstractC1223a = vVar.f13753F;
        if (abstractC1223a != null) {
            abstractC1223a.q(true);
        }
    }

    @Override // androidx.fragment.app.A, android.app.Activity
    public void onStart() {
        super.onStart();
        ((v) getDelegate()).o(true, false);
    }

    @Override // androidx.fragment.app.A, android.app.Activity
    public void onStop() {
        super.onStop();
        v vVar = (v) getDelegate();
        vVar.B();
        AbstractC1223a abstractC1223a = vVar.f13753F;
        if (abstractC1223a != null) {
            abstractC1223a.q(false);
        }
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (supportShouldUpRecreateTask(supportParentActivityIntent)) {
            L l7 = new L(this);
            onCreateSupportNavigateUpTaskStack(l7);
            onPrepareSupportNavigateUpTaskStack(l7);
            ArrayList arrayList = l7.f2427a;
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            AbstractActivityC1231i abstractActivityC1231i = l7.f2428b;
            if (!G.h.startActivities(abstractActivityC1231i, intentArr, null)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                abstractActivityC1231i.startActivity(intent);
            }
            try {
                finishAffinity();
            } catch (IllegalStateException unused) {
                finish();
            }
        } else {
            supportNavigateUpTo(supportParentActivityIntent);
        }
        return true;
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i7) {
        super.onTitleChanged(charSequence, i7);
        getDelegate().m(charSequence);
    }

    @Override // i.InterfaceC1232j
    public AbstractC1364b onWindowStartingSupportActionMode(InterfaceC1363a interfaceC1363a) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        AbstractC1223a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.m()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.o, android.app.Activity
    public void setContentView(int i7) {
        d();
        getDelegate().j(i7);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        v vVar = (v) getDelegate();
        if (vVar.f13748A instanceof Activity) {
            vVar.B();
            AbstractC1223a abstractC1223a = vVar.f13753F;
            if (abstractC1223a instanceof C1222I) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            vVar.f13754G = null;
            if (abstractC1223a != null) {
                abstractC1223a.j();
            }
            vVar.f13753F = null;
            if (toolbar != null) {
                Object obj = vVar.f13748A;
                C1218E c1218e = new C1218E(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : vVar.f13755H, vVar.f13751D);
                vVar.f13753F = c1218e;
                vVar.f13751D.f13720b = c1218e.f13611c;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                vVar.f13751D.f13720b = null;
            }
            vVar.c();
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i7) {
        super.setTheme(i7);
        ((v) getDelegate()).f13783k0 = i7;
    }

    public AbstractC1364b startSupportActionMode(InterfaceC1363a interfaceC1363a) {
        return getDelegate().n(interfaceC1363a);
    }

    public void supportInvalidateOptionsMenu() {
        getDelegate().c();
    }

    public void supportNavigateUpTo(Intent intent) {
        navigateUpTo(intent);
    }

    public boolean supportRequestWindowFeature(int i7) {
        return getDelegate().i(i7);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return shouldUpRecreateTask(intent);
    }

    @Override // androidx.activity.o, android.app.Activity
    public void setContentView(View view) {
        d();
        getDelegate().k(view);
    }

    @Override // androidx.activity.o, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d();
        getDelegate().l(view, layoutParams);
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public void onLocalesChanged(L.j jVar) {
    }

    public void onNightModeChanged(int i7) {
    }

    public void onPrepareSupportNavigateUpTaskStack(L l7) {
    }

    @Override // i.InterfaceC1232j
    public void onSupportActionModeFinished(AbstractC1364b abstractC1364b) {
    }

    @Override // i.InterfaceC1232j
    public void onSupportActionModeStarted(AbstractC1364b abstractC1364b) {
    }

    @Deprecated
    public void setSupportProgress(int i7) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z4) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z4) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z4) {
    }
}
