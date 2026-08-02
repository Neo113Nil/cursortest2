package i;

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
import java.util.List;
import l.AbstractC1364b;
import l.AbstractC1374l;
import l.AbstractC1375m;
import w1.C1719l1;
import w1.F0;

/* loaded from: classes.dex */
public final class r implements Window.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final Window.Callback f13719a;

    /* renamed from: b, reason: collision with root package name */
    public C1719l1 f13720b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f13721c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13722d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13723e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v f13724f;

    public r(v vVar, Window.Callback callback) {
        this.f13724f = vVar;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f13719a = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f13721c = true;
            callback.onContentChanged();
        } finally {
            this.f13721c = false;
        }
    }

    public final boolean b(int i7, Menu menu) {
        return this.f13719a.onMenuOpened(i7, menu);
    }

    public final void c(int i7, Menu menu) {
        this.f13719a.onPanelClosed(i7, menu);
    }

    public final void d(List list, Menu menu, int i7) {
        AbstractC1375m.a(this.f13719a, list, menu, i7);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f13719a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z4 = this.f13722d;
        Window.Callback callback = this.f13719a;
        return z4 ? callback.dispatchKeyEvent(keyEvent) : this.f13724f.v(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (this.f13719a.dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        v vVar = this.f13724f;
        vVar.B();
        AbstractC1223a abstractC1223a = vVar.f13753F;
        if (abstractC1223a != null && abstractC1223a.k(keyCode, keyEvent)) {
            return true;
        }
        u uVar = vVar.f13776d0;
        if (uVar != null && vVar.G(uVar, keyEvent.getKeyCode(), keyEvent)) {
            u uVar2 = vVar.f13776d0;
            if (uVar2 == null) {
                return true;
            }
            uVar2.f13739l = true;
            return true;
        }
        if (vVar.f13776d0 == null) {
            u A7 = vVar.A(0);
            vVar.H(A7, keyEvent);
            boolean G2 = vVar.G(A7, keyEvent.getKeyCode(), keyEvent);
            A7.f13738k = false;
            if (G2) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f13719a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f13719a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f13719a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f13719a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f13719a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f13719a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f13721c) {
            this.f13719a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i7, Menu menu) {
        if (i7 != 0 || (menu instanceof m.k)) {
            return this.f13719a.onCreatePanelMenu(i7, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i7) {
        C1719l1 c1719l1 = this.f13720b;
        if (c1719l1 != null) {
            View view = i7 == 0 ? new View(((C1218E) c1719l1.f17771a).f13609a.f8662a.getContext()) : null;
            if (view != null) {
                return view;
            }
        }
        return this.f13719a.onCreatePanelView(i7);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f13719a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i7, MenuItem menuItem) {
        return this.f13719a.onMenuItemSelected(i7, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i7, Menu menu) {
        b(i7, menu);
        v vVar = this.f13724f;
        if (i7 == 108) {
            vVar.B();
            AbstractC1223a abstractC1223a = vVar.f13753F;
            if (abstractC1223a != null) {
                abstractC1223a.c(true);
            }
        } else {
            vVar.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i7, Menu menu) {
        if (this.f13723e) {
            this.f13719a.onPanelClosed(i7, menu);
            return;
        }
        c(i7, menu);
        v vVar = this.f13724f;
        if (i7 == 108) {
            vVar.B();
            AbstractC1223a abstractC1223a = vVar.f13753F;
            if (abstractC1223a != null) {
                abstractC1223a.c(false);
                return;
            }
            return;
        }
        if (i7 != 0) {
            vVar.getClass();
            return;
        }
        u A7 = vVar.A(i7);
        if (A7.f13740m) {
            vVar.t(A7, false);
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z4) {
        l.n.a(this.f13719a, z4);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i7, View view, Menu menu) {
        m.k kVar = menu instanceof m.k ? (m.k) menu : null;
        if (i7 == 0 && kVar == null) {
            return false;
        }
        if (kVar != null) {
            kVar.f15137P = true;
        }
        C1719l1 c1719l1 = this.f13720b;
        if (c1719l1 != null && i7 == 0) {
            C1218E c1218e = (C1218E) c1719l1.f17771a;
            if (!c1218e.f13612d) {
                c1218e.f13609a.f8672l = true;
                c1218e.f13612d = true;
            }
        }
        boolean onPreparePanel = this.f13719a.onPreparePanel(i7, view, menu);
        if (kVar != null) {
            kVar.f15137P = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i7) {
        m.k kVar = this.f13724f.A(0).f13736h;
        if (kVar != null) {
            d(list, kVar, i7);
        } else {
            d(list, menu, i7);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return AbstractC1374l.a(this.f13719a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f13719a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z4) {
        this.f13719a.onWindowFocusChanged(z4);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i7) {
        v vVar = this.f13724f;
        vVar.getClass();
        if (i7 != 0) {
            return AbstractC1374l.b(this.f13719a, callback, i7);
        }
        F0 f02 = new F0(vVar.f13749B, callback);
        AbstractC1364b n2 = vVar.n(f02);
        if (n2 != null) {
            return f02.v(n2);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f13719a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
