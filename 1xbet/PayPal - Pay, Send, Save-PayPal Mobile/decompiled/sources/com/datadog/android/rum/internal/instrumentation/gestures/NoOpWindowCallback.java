package com.datadog.android.rum.internal.instrumentation.gestures;

@kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\bJ\u0019\u0010\u0011\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\bJ\u0019\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0003J\u000f\u0010\u0019\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u0003J\u001f\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0014H\u0016¢\u0006\u0004\b#\u0010\u0003J\u001f\u0010&\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010(\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b(\u0010\u001fJ\u001f\u0010)\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b)\u0010*J)\u0010,\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010+\u001a\u0004\u0018\u00010 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0006H\u0016¢\u0006\u0004\b.\u0010/J\u0019\u0010.\u001a\u00020\u00062\b\u00101\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\b.\u00102J\u0019\u00105\u001a\u00020\u00142\b\u00104\u001a\u0004\u0018\u000103H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020\u00142\u0006\u00107\u001a\u00020\u0006H\u0016¢\u0006\u0004\b8\u00109J\u001b\u0010<\u001a\u0004\u0018\u00010\u00122\b\u0010;\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\b<\u0010=J#\u0010<\u001a\u0004\u0018\u00010\u00122\b\u0010;\u001a\u0004\u0018\u00010:2\u0006\u0010>\u001a\u00020\u001aH\u0016¢\u0006\u0004\b<\u0010?"}, d2 = {"Lcom/datadog/android/rum/internal/instrumentation/gestures/NoOpWindowCallback;", "Landroid/view/Window$Callback;", "<init>", "()V", "Landroid/view/MotionEvent;", "event", "", "dispatchGenericMotionEvent", "(Landroid/view/MotionEvent;)Z", "Landroid/view/KeyEvent;", "dispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "dispatchKeyShortcutEvent", "Landroid/view/accessibility/AccessibilityEvent;", "dispatchPopulateAccessibilityEvent", "(Landroid/view/accessibility/AccessibilityEvent;)Z", "dispatchTouchEvent", "dispatchTrackballEvent", "Landroid/view/ActionMode;", "mode", "", "onActionModeFinished", "(Landroid/view/ActionMode;)V", "onActionModeStarted", "onAttachedToWindow", "onContentChanged", "", "featureId", "Landroid/view/Menu;", "menu", "onCreatePanelMenu", "(ILandroid/view/Menu;)Z", "Landroid/view/View;", "onCreatePanelView", "(I)Landroid/view/View;", "onDetachedFromWindow", "Landroid/view/MenuItem;", "item", "onMenuItemSelected", "(ILandroid/view/MenuItem;)Z", "onMenuOpened", "onPanelClosed", "(ILandroid/view/Menu;)V", "view", "onPreparePanel", "(ILandroid/view/View;Landroid/view/Menu;)Z", "onSearchRequested", "()Z", "Landroid/view/SearchEvent;", "searchEvent", "(Landroid/view/SearchEvent;)Z", "Landroid/view/WindowManager$LayoutParams;", "attrs", "onWindowAttributesChanged", "(Landroid/view/WindowManager$LayoutParams;)V", "hasFocus", "onWindowFocusChanged", "(Z)V", "Landroid/view/ActionMode$Callback;", com.sun.jna.Callback.METHOD_NAME, "onWindowStartingActionMode", "(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode;", "type", "(Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NoOpWindowCallback implements android.view.Window.Callback {
    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(android.view.MotionEvent event) {
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(android.view.KeyEvent event) {
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent event) {
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent event) {
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(android.view.MotionEvent event) {
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(android.view.MotionEvent event) {
        return false;
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(android.view.ActionMode mode) {
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(android.view.ActionMode mode) {
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // android.view.Window.Callback
    public final android.view.View onCreatePanelView(int featureId) {
        return null;
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(android.view.SearchEvent searchEvent) {
        return false;
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(android.view.WindowManager.LayoutParams attrs) {
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean hasFocus) {
    }

    @Override // android.view.Window.Callback
    public final android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.Window.Callback
    public final android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback, int type) {
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int featureId, android.view.View view, android.view.Menu menu) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menu, "");
        return false;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int featureId, android.view.Menu menu) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menu, "");
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int featureId, android.view.Menu menu) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menu, "");
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int featureId, android.view.MenuItem item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int featureId, android.view.Menu menu) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menu, "");
        return false;
    }
}
