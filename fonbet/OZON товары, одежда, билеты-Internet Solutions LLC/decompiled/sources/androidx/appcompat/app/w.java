package androidx.appcompat.app;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.Q;
import androidx.annotation.NonNull;
import androidx.appcompat.view.b;
import androidx.core.view.C5337q;
import androidx.lifecycle.C0;
import ru.ozon.app.android.R;

/* loaded from: classes.dex */
public class w extends androidx.activity.s implements h {
    private j mDelegate;
    private final C5337q.a mKeyDispatcher;

    public w(@NonNull Context context, int i11) {
        super(context, getThemeResId(context, i11));
        this.mKeyDispatcher = new C5337q.a() { // from class: androidx.appcompat.app.v
            @Override // androidx.core.view.C5337q.a
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return w.this.superDispatchKeyEvent(keyEvent);
            }
        };
        j delegate = getDelegate();
        delegate.O(getThemeResId(context, i11));
        delegate.y();
    }

    private static int getThemeResId(Context context, int i11) {
        if (i11 != 0) {
            return i11;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    private void initViewTreeOwners() {
        C0.b(getWindow().getDecorView(), this);
        M4.f.b(getWindow().getDecorView(), this);
        Q.b(getWindow().getDecorView(), this);
    }

    @Override // androidx.activity.s, android.app.Dialog
    public void addContentView(@NonNull View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().e(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        getDelegate().z();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C5337q.b(this.mKeyDispatcher, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
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

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        getDelegate().v();
    }

    @Override // androidx.activity.s, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        getDelegate().u();
        super.onCreate(bundle);
        getDelegate().y();
    }

    @Override // androidx.activity.s, android.app.Dialog
    protected void onStop() {
        super.onStop();
        getDelegate().D();
    }

    @Override // androidx.appcompat.app.h
    public void onSupportActionModeFinished(androidx.appcompat.view.b bVar) {
    }

    @Override // androidx.appcompat.app.h
    public void onSupportActionModeStarted(androidx.appcompat.view.b bVar) {
    }

    @Override // androidx.appcompat.app.h
    public androidx.appcompat.view.b onWindowStartingSupportActionMode(b.a aVar) {
        return null;
    }

    @Override // androidx.activity.s, android.app.Dialog
    public void setContentView(int i11) {
        initViewTreeOwners();
        getDelegate().I(i11);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        getDelegate().P(charSequence);
    }

    boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean supportRequestWindowFeature(int i11) {
        return getDelegate().G(i11);
    }

    @Override // androidx.activity.s, android.app.Dialog
    public void setContentView(@NonNull View view) {
        initViewTreeOwners();
        getDelegate().J(view);
    }

    @Override // android.app.Dialog
    public void setTitle(int i11) {
        super.setTitle(i11);
        getDelegate().P(getContext().getString(i11));
    }

    @Override // androidx.activity.s, android.app.Dialog
    public void setContentView(@NonNull View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().K(view, layoutParams);
    }
}
