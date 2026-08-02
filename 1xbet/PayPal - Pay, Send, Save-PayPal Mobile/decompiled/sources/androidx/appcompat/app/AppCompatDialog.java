package androidx.appcompat.app;

/* loaded from: classes3.dex */
public class AppCompatDialog extends androidx.view.ComponentDialog implements androidx.appcompat.app.AppCompatCallback {
    private androidx.appcompat.app.AppCompatDelegate mDelegate;
    private final androidx.core.view.KeyEventDispatcher.Component mKeyDispatcher;

    @Override // androidx.appcompat.app.AppCompatCallback
    public void onSupportActionModeFinished(androidx.appcompat.view.ActionMode actionMode) {
    }

    @Override // androidx.appcompat.app.AppCompatCallback
    public void onSupportActionModeStarted(androidx.appcompat.view.ActionMode actionMode) {
    }

    @Override // androidx.appcompat.app.AppCompatCallback
    public androidx.appcompat.view.ActionMode onWindowStartingSupportActionMode(androidx.appcompat.view.ActionMode.Callback callback) {
        return null;
    }

    public AppCompatDialog(android.content.Context context) {
        this(context, 0);
    }

    public AppCompatDialog(android.content.Context context, int i) {
        super(context, getThemeResId(context, i));
        this.mKeyDispatcher = new androidx.core.view.KeyEventDispatcher.Component() { // from class: androidx.appcompat.app.AppCompatDialog$$ExternalSyntheticLambda0
            @Override // androidx.core.view.KeyEventDispatcher.Component
            public final boolean superDispatchKeyEvent(android.view.KeyEvent keyEvent) {
                return androidx.appcompat.app.AppCompatDialog.this.superDispatchKeyEvent(keyEvent);
            }
        };
        androidx.appcompat.app.AppCompatDelegate delegate = getDelegate();
        delegate.setTheme(getThemeResId(context, i));
        delegate.onCreate(null);
    }

    public AppCompatDialog(android.content.Context context, boolean z, android.content.DialogInterface.OnCancelListener onCancelListener) {
        super(context);
        this.mKeyDispatcher = new androidx.core.view.KeyEventDispatcher.Component() { // from class: androidx.appcompat.app.AppCompatDialog$$ExternalSyntheticLambda0
            @Override // androidx.core.view.KeyEventDispatcher.Component
            public final boolean superDispatchKeyEvent(android.view.KeyEvent keyEvent) {
                return androidx.appcompat.app.AppCompatDialog.this.superDispatchKeyEvent(keyEvent);
            }
        };
        setCancelable(z);
        setOnCancelListener(onCancelListener);
    }

    @Override // androidx.view.ComponentDialog, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        getDelegate().installViewFactory();
        super.onCreate(bundle);
        getDelegate().onCreate(bundle);
    }

    public androidx.appcompat.app.ActionBar getSupportActionBar() {
        return getDelegate().getSupportActionBar();
    }

    @Override // androidx.view.ComponentDialog, android.app.Dialog
    public void setContentView(int i) {
        initializeViewTreeOwners();
        getDelegate().setContentView(i);
    }

    @Override // androidx.view.ComponentDialog, android.app.Dialog
    public void setContentView(android.view.View view) {
        initializeViewTreeOwners();
        getDelegate().setContentView(view);
    }

    @Override // androidx.view.ComponentDialog, android.app.Dialog
    public void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        getDelegate().setContentView(view, layoutParams);
    }

    @Override // android.app.Dialog
    public <T extends android.view.View> T findViewById(int i) {
        return (T) getDelegate().findViewById(i);
    }

    @Override // android.app.Dialog
    public void setTitle(java.lang.CharSequence charSequence) {
        super.setTitle(charSequence);
        getDelegate().setTitle(charSequence);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        getDelegate().setTitle(getContext().getString(i));
    }

    @Override // androidx.view.ComponentDialog, android.app.Dialog
    public void addContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        getDelegate().addContentView(view, layoutParams);
    }

    @Override // androidx.view.ComponentDialog, android.app.Dialog
    public void onStop() {
        super.onStop();
        getDelegate().onStop();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        getDelegate().onDestroy();
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().requestWindowFeature(i);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        getDelegate().invalidateOptionsMenu();
    }

    public androidx.appcompat.app.AppCompatDelegate getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = androidx.appcompat.app.AppCompatDelegate.create(this, this);
        }
        return this.mDelegate;
    }

    private static int getThemeResId(android.content.Context context, int i) {
        if (i != 0) {
            return i;
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(androidx.appcompat.R.attr.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    boolean superDispatchKeyEvent(android.view.KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        return androidx.core.view.KeyEventDispatcher.dispatchKeyEvent(this.mKeyDispatcher, getWindow().getDecorView(), this, keyEvent);
    }
}
