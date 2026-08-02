package ai0;

import android.annotation.NonNull;
import android.annotation.Nullable;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class f implements Window.Callback {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Window.Callback f36804a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ArrayList f36805b;

    public f(@NotNull Window.Callback originalCallback) {
        Intrinsics.checkNotNullParameter(originalCallback, "originalCallback");
        this.f36804a = originalCallback;
        this.f36805b = new ArrayList();
    }

    public final void a(@NotNull Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f36805b.add(action);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f36804a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f36804a.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f36804a.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f36804a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f36804a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f36804a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f36804a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f36804a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f36804a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        ArrayList arrayList = this.f36805b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Function0) it.next()).invoke();
        }
        arrayList.clear();
        this.f36804a.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i11, @NonNull @NotNull Menu p12) {
        Intrinsics.checkNotNullParameter(p12, "p1");
        return this.f36804a.onCreatePanelMenu(i11, p12);
    }

    @Override // android.view.Window.Callback
    @Nullable
    public final View onCreatePanelView(int i11) {
        return this.f36804a.onCreatePanelView(i11);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f36804a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i11, @NonNull @NotNull MenuItem p12) {
        Intrinsics.checkNotNullParameter(p12, "p1");
        return this.f36804a.onMenuItemSelected(i11, p12);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i11, @NonNull @NotNull Menu p12) {
        Intrinsics.checkNotNullParameter(p12, "p1");
        return this.f36804a.onMenuOpened(i11, p12);
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i11, @NonNull @NotNull Menu p12) {
        Intrinsics.checkNotNullParameter(p12, "p1");
        this.f36804a.onPanelClosed(i11, p12);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i11, @Nullable View view, @NonNull @NotNull Menu p22) {
        Intrinsics.checkNotNullParameter(p22, "p2");
        return this.f36804a.onPreparePanel(i11, view, p22);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f36804a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f36804a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z11) {
        this.f36804a.onWindowFocusChanged(z11);
    }

    @Override // android.view.Window.Callback
    @Nullable
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f36804a.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f36804a.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    @Nullable
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i11) {
        return this.f36804a.onWindowStartingActionMode(callback, i11);
    }
}
