package androidx.appcompat.view;

/* loaded from: classes3.dex */
public class WindowCallbackWrapper implements android.view.Window.Callback {
    final android.view.Window.Callback getHighSpeedVideoFpsRangesFor;

    public WindowCallbackWrapper(android.view.Window.Callback callback) {
        if (callback == null) {
            throw new java.lang.IllegalArgumentException("Window callback may not be null");
        }
        this.getHighSpeedVideoFpsRangesFor = callback;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        return this.getHighSpeedVideoFpsRangesFor.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(android.view.KeyEvent keyEvent) {
        return this.getHighSpeedVideoFpsRangesFor.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        return this.getHighSpeedVideoFpsRangesFor.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(android.view.MotionEvent motionEvent) {
        return this.getHighSpeedVideoFpsRangesFor.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(android.view.MotionEvent motionEvent) {
        return this.getHighSpeedVideoFpsRangesFor.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return this.getHighSpeedVideoFpsRangesFor.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public android.view.View onCreatePanelView(int i) {
        return this.getHighSpeedVideoFpsRangesFor.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, android.view.Menu menu) {
        return this.getHighSpeedVideoFpsRangesFor.onCreatePanelMenu(i, menu);
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int i, android.view.View view, android.view.Menu menu) {
        return this.getHighSpeedVideoFpsRangesFor.onPreparePanel(i, view, menu);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int i, android.view.Menu menu) {
        return this.getHighSpeedVideoFpsRangesFor.onMenuOpened(i, menu);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuItemSelected(int i, android.view.MenuItem menuItem) {
        return this.getHighSpeedVideoFpsRangesFor.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public void onWindowAttributesChanged(android.view.WindowManager.LayoutParams layoutParams) {
        this.getHighSpeedVideoFpsRangesFor.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public void onContentChanged() {
        this.getHighSpeedVideoFpsRangesFor.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        this.getHighSpeedVideoFpsRangesFor.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
        this.getHighSpeedVideoFpsRangesFor.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.getHighSpeedVideoFpsRangesFor.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int i, android.view.Menu menu) {
        this.getHighSpeedVideoFpsRangesFor.onPanelClosed(i, menu);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested(android.view.SearchEvent searchEvent) {
        return androidx.appcompat.view.WindowCallbackWrapper.Api23Impl.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRangesFor, searchEvent);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested() {
        return this.getHighSpeedVideoFpsRangesFor.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback) {
        return this.getHighSpeedVideoFpsRangesFor.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback, int i) {
        return androidx.appcompat.view.WindowCallbackWrapper.Api23Impl.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor, callback, i);
    }

    @Override // android.view.Window.Callback
    public void onActionModeStarted(android.view.ActionMode actionMode) {
        this.getHighSpeedVideoFpsRangesFor.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onActionModeFinished(android.view.ActionMode actionMode) {
        this.getHighSpeedVideoFpsRangesFor.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onProvideKeyboardShortcuts(java.util.List<android.view.KeyboardShortcutGroup> list, android.view.Menu menu, int i) {
        androidx.appcompat.view.WindowCallbackWrapper.Api24Impl.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public void onPointerCaptureChanged(boolean z) {
        androidx.appcompat.view.WindowCallbackWrapper.Api26Impl.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor, z);
    }

    public final android.view.Window.Callback getWrapped() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    static class Api23Impl {
        private Api23Impl() {
        }

        static boolean getHighSpeedVideoSizes(android.view.Window.Callback callback, android.view.SearchEvent searchEvent) {
            return callback.onSearchRequested(searchEvent);
        }

        static android.view.ActionMode getHighResolutionOutputSizeshNQ4ISI(android.view.Window.Callback callback, android.view.ActionMode.Callback callback2, int i) {
            return callback.onWindowStartingActionMode(callback2, i);
        }
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static void getHighSpeedVideoFpsRangesFor(android.view.Window.Callback callback, java.util.List<android.view.KeyboardShortcutGroup> list, android.view.Menu menu, int i) {
            callback.onProvideKeyboardShortcuts(list, menu, i);
        }
    }

    static class Api26Impl {
        private Api26Impl() {
        }

        static void getHighSpeedVideoFpsRangesFor(android.view.Window.Callback callback, boolean z) {
            callback.onPointerCaptureChanged(z);
        }
    }
}
