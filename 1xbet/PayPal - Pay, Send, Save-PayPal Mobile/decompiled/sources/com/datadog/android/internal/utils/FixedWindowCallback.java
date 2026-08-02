package com.datadog.android.internal.utils;

/* loaded from: classes7.dex */
public class FixedWindowCallback implements android.view.Window.Callback {
    private final android.view.Window.Callback getHighResolutionOutputSizeshNQ4ISI;

    public FixedWindowCallback(android.view.Window.Callback callback) {
        this.getHighResolutionOutputSizeshNQ4ISI = callback;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(android.view.MotionEvent motionEvent) {
        return this.getHighResolutionOutputSizeshNQ4ISI.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        return this.getHighResolutionOutputSizeshNQ4ISI.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(android.view.KeyEvent keyEvent) {
        return this.getHighResolutionOutputSizeshNQ4ISI.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return this.getHighResolutionOutputSizeshNQ4ISI.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        return this.getHighResolutionOutputSizeshNQ4ISI.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(android.view.MotionEvent motionEvent) {
        return this.getHighResolutionOutputSizeshNQ4ISI.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public void onActionModeFinished(android.view.ActionMode actionMode) {
        this.getHighResolutionOutputSizeshNQ4ISI.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onActionModeStarted(android.view.ActionMode actionMode) {
        this.getHighResolutionOutputSizeshNQ4ISI.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
        this.getHighResolutionOutputSizeshNQ4ISI.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public void onContentChanged() {
        this.getHighResolutionOutputSizeshNQ4ISI.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, android.view.Menu menu) {
        return this.getHighResolutionOutputSizeshNQ4ISI.onCreatePanelMenu(i, menu);
    }

    @Override // android.view.Window.Callback
    public android.view.View onCreatePanelView(int i) {
        return this.getHighResolutionOutputSizeshNQ4ISI.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.getHighResolutionOutputSizeshNQ4ISI.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public boolean onMenuItemSelected(int i, android.view.MenuItem menuItem) {
        return this.getHighResolutionOutputSizeshNQ4ISI.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int i, android.view.Menu menu) {
        return this.getHighResolutionOutputSizeshNQ4ISI.onMenuOpened(i, menu);
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int i, android.view.Menu menu) {
        this.getHighResolutionOutputSizeshNQ4ISI.onPanelClosed(i, menu);
    }

    @Override // android.view.Window.Callback
    public void onPointerCaptureChanged(boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI.onPointerCaptureChanged(z);
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int i, android.view.View view, android.view.Menu menu) {
        return this.getHighResolutionOutputSizeshNQ4ISI.onPreparePanel(i, view, menu);
    }

    @Override // android.view.Window.Callback
    public void onProvideKeyboardShortcuts(java.util.List<android.view.KeyboardShortcutGroup> list, android.view.Menu menu, int i) {
        this.getHighResolutionOutputSizeshNQ4ISI.onProvideKeyboardShortcuts(list, menu, i);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested() {
        return this.getHighResolutionOutputSizeshNQ4ISI.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested(android.view.SearchEvent searchEvent) {
        return this.getHighResolutionOutputSizeshNQ4ISI.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    public void onWindowAttributesChanged(android.view.WindowManager.LayoutParams layoutParams) {
        this.getHighResolutionOutputSizeshNQ4ISI.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback) {
        return this.getHighResolutionOutputSizeshNQ4ISI.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback, int i) {
        return this.getHighResolutionOutputSizeshNQ4ISI.onWindowStartingActionMode(callback, i);
    }
}
