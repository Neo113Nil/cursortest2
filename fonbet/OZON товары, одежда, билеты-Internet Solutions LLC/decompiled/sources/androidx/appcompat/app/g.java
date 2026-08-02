package androidx.appcompat.app;

import M4.c;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ActivityC5043j;
import androidx.activity.Q;
import androidx.annotation.NonNull;
import androidx.appcompat.view.b;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.h0;
import androidx.core.app.v;
import androidx.lifecycle.C0;
import androidx.lifecycle.D0;
import f.InterfaceC6389b;

/* loaded from: classes.dex */
public class g extends androidx.fragment.app.r implements h, v.a {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private j mDelegate;
    private Resources mResources;

    final class a implements c.b {
        a() {
        }

        @Override // M4.c.b
        @NonNull
        public final Bundle saveState() {
            Bundle bundle = new Bundle();
            g.this.getDelegate().getClass();
            return bundle;
        }
    }

    final class b implements InterfaceC6389b {
        b() {
        }

        @Override // f.InterfaceC6389b
        public final void a(@NonNull ActivityC5043j activityC5043j) {
            g gVar = g.this;
            j delegate = gVar.getDelegate();
            delegate.u();
            gVar.getSavedStateRegistry().b(g.DELEGATE_TAG);
            delegate.y();
        }
    }

    public g() {
        initDelegate();
    }

    private void initDelegate() {
        getSavedStateRegistry().g(DELEGATE_TAG, new a());
        addOnContextAvailableListener(new b());
    }

    private void initViewTreeOwners() {
        C0.b(getWindow().getDecorView(), this);
        D0.b(getWindow().getDecorView(), this);
        M4.f.b(getWindow().getDecorView(), this);
        Q.b(getWindow().getDecorView(), this);
    }

    private boolean performMenuItemShortcut(KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.activity.ActivityC5043j, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().e(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(getDelegate().h(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        AbstractC5051a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.a()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.g, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC5051a supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.j(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i11) {
        return (T) getDelegate().j(i11);
    }

    @NonNull
    public j getDelegate() {
        if (this.mDelegate == null) {
            int i11 = j.f37132j;
            this.mDelegate = new l(this, this);
        }
        return this.mDelegate;
    }

    public InterfaceC5052b getDrawerToggleDelegate() {
        return getDelegate().n();
    }

    @Override // android.app.Activity
    @NonNull
    public MenuInflater getMenuInflater() {
        return getDelegate().q();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = this.mResources;
        if (resources == null) {
            int i11 = h0.f37937a;
        }
        return resources == null ? super.getResources() : resources;
    }

    public AbstractC5051a getSupportActionBar() {
        return getDelegate().t();
    }

    @Override // androidx.core.app.v.a
    public Intent getSupportParentActivityIntent() {
        return androidx.core.app.j.b(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().v();
    }

    @Override // androidx.activity.ActivityC5043j, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getDelegate().x(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(@NonNull androidx.core.app.v vVar) {
        vVar.c(this);
    }

    @Override // androidx.fragment.app.r, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        getDelegate().z();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i11, KeyEvent keyEvent) {
        if (performMenuItemShortcut(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i11, keyEvent);
    }

    protected void onLocalesChanged(@NonNull androidx.core.os.i iVar) {
    }

    @Override // androidx.fragment.app.r, androidx.activity.ActivityC5043j, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i11, @NonNull MenuItem menuItem) {
        if (super.onMenuItemSelected(i11, menuItem)) {
            return true;
        }
        AbstractC5051a supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.d() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i11, Menu menu) {
        return super.onMenuOpened(i11, menu);
    }

    protected void onNightModeChanged(int i11) {
    }

    @Override // androidx.activity.ActivityC5043j, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i11, @NonNull Menu menu) {
        super.onPanelClosed(i11, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().A();
    }

    @Override // androidx.fragment.app.r, android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        getDelegate().B();
    }

    public void onPrepareSupportNavigateUpTaskStack(@NonNull androidx.core.app.v vVar) {
    }

    @Override // androidx.fragment.app.r, android.app.Activity
    protected void onStart() {
        super.onStart();
        getDelegate().C();
    }

    @Override // androidx.fragment.app.r, android.app.Activity
    protected void onStop() {
        super.onStop();
        getDelegate().D();
    }

    @Override // androidx.appcompat.app.h
    public void onSupportActionModeFinished(@NonNull androidx.appcompat.view.b bVar) {
    }

    @Override // androidx.appcompat.app.h
    public void onSupportActionModeStarted(@NonNull androidx.appcompat.view.b bVar) {
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (!supportShouldUpRecreateTask(supportParentActivityIntent)) {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
        androidx.core.app.v e11 = androidx.core.app.v.e(this);
        onCreateSupportNavigateUpTaskStack(e11);
        onPrepareSupportNavigateUpTaskStack(e11);
        e11.h();
        try {
            androidx.core.app.b.a(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i11) {
        super.onTitleChanged(charSequence, i11);
        getDelegate().P(charSequence);
    }

    @Override // androidx.appcompat.app.h
    public androidx.appcompat.view.b onWindowStartingSupportActionMode(@NonNull b.a aVar) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        AbstractC5051a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.k()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.ActivityC5043j, android.app.Activity
    public void setContentView(int i11) {
        initViewTreeOwners();
        getDelegate().I(i11);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        getDelegate().N(toolbar);
    }

    @Deprecated
    public void setSupportProgress(int i11) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z11) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z11) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z11) {
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i11) {
        super.setTheme(i11);
        getDelegate().O(i11);
    }

    public androidx.appcompat.view.b startSupportActionMode(@NonNull b.a aVar) {
        return getDelegate().Q(aVar);
    }

    @Override // androidx.fragment.app.r
    public void supportInvalidateOptionsMenu() {
        getDelegate().v();
    }

    public void supportNavigateUpTo(@NonNull Intent intent) {
        navigateUpTo(intent);
    }

    public boolean supportRequestWindowFeature(int i11) {
        return getDelegate().G(i11);
    }

    public boolean supportShouldUpRecreateTask(@NonNull Intent intent) {
        return shouldUpRecreateTask(intent);
    }

    public g(int i11) {
        super(i11);
        initDelegate();
    }

    @Override // androidx.activity.ActivityC5043j, android.app.Activity
    public void setContentView(View view) {
        initViewTreeOwners();
        getDelegate().J(view);
    }

    @Override // androidx.activity.ActivityC5043j, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().K(view, layoutParams);
    }
}
