package p058i;

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
import p078l.b;
import p078l.l;
import p078l.m;
import p078l.n;
import p086m.k;
import p155w1.C1010l1;
import p155w1.F0;

/* JADX INFO: loaded from: classes.dex */
public final class r implements Window.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Window.Callback f13725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1010l1 f13726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13729e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v f13730f;

    public r(v vVar, Window.Callback callback) {
        this.f13730f = vVar;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f13725a = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f13727c = true;
            callback.onContentChanged();
        } finally {
            this.f13727c = false;
        }
    }

    public final boolean b(int i7, Menu menu) {
        return this.f13725a.onMenuOpened(i7, menu);
    }

    public final void c(int i7, Menu menu) {
        this.f13725a.onPanelClosed(i7, menu);
    }

    public final void d(List list, Menu menu, int i7) {
        m.a(this.f13725a, list, menu, i7);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f13725a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z4 = this.f13728d;
        Window.Callback callback = this.f13725a;
        if (z4) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        return this.f13730f.v(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (this.f13725a.dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        v vVar = this.f13730f;
        vVar.B();
        AbstractC0904a abstractC0904a = vVar.f13759F;
        if (abstractC0904a != null && abstractC0904a.k(keyCode, keyEvent)) {
            return true;
        }
        u uVar = vVar.f13782d0;
        if (uVar != null && vVar.G(uVar, keyEvent.getKeyCode(), keyEvent)) {
            u uVar2 = vVar.f13782d0;
            if (uVar2 == null) {
                return true;
            }
            uVar2.f13745l = true;
            return true;
        }
        if (vVar.f13782d0 == null) {
            u uVarA = vVar.A(0);
            vVar.H(uVarA, keyEvent);
            boolean zG = vVar.G(uVarA, keyEvent.getKeyCode(), keyEvent);
            uVarA.f13744k = false;
            if (zG) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f13725a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f13725a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f13725a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f13725a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f13725a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f13725a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f13727c) {
            this.f13725a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i7, Menu menu) {
        if (i7 != 0 || (menu instanceof k)) {
            return this.f13725a.onCreatePanelMenu(i7, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i7) {
        C1010l1 c1010l1 = this.f13726b;
        if (c1010l1 != null) {
            View view = i7 == 0 ? new View(((E) c1010l1.f17777a).f13615a.f8662a.getContext()) : null;
            if (view != null) {
                return view;
            }
        }
        return this.f13725a.onCreatePanelView(i7);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f13725a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i7, MenuItem menuItem) {
        return this.f13725a.onMenuItemSelected(i7, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i7, Menu menu) {
        b(i7, menu);
        v vVar = this.f13730f;
        if (i7 == 108) {
            vVar.B();
            AbstractC0904a abstractC0904a = vVar.f13759F;
            if (abstractC0904a != null) {
                abstractC0904a.c(true);
            }
        } else {
            vVar.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i7, Menu menu) {
        if (this.f13729e) {
            this.f13725a.onPanelClosed(i7, menu);
            return;
        }
        c(i7, menu);
        v vVar = this.f13730f;
        if (i7 == 108) {
            vVar.B();
            AbstractC0904a abstractC0904a = vVar.f13759F;
            if (abstractC0904a != null) {
                abstractC0904a.c(false);
                return;
            }
            return;
        }
        if (i7 != 0) {
            vVar.getClass();
            return;
        }
        u uVarA = vVar.A(i7);
        if (uVarA.f13746m) {
            vVar.t(uVarA, false);
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z4) {
        n.a(this.f13725a, z4);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i7, View view, Menu menu) {
        k kVar = menu instanceof k ? (k) menu : null;
        if (i7 == 0 && kVar == null) {
            return false;
        }
        if (kVar != null) {
            kVar.f15143P = true;
        }
        C1010l1 c1010l1 = this.f13726b;
        if (c1010l1 != null && i7 == 0) {
            E e7 = (E) c1010l1.f17777a;
            if (!e7.f13618d) {
                e7.f13615a.f8672l = true;
                e7.f13618d = true;
            }
        }
        boolean zOnPreparePanel = this.f13725a.onPreparePanel(i7, view, menu);
        if (kVar != null) {
            kVar.f15143P = false;
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i7) {
        k kVar = this.f13730f.A(0).f13742h;
        if (kVar != null) {
            d(list, kVar, i7);
        } else {
            d(list, menu, i7);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return l.a(this.f13725a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f13725a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z4) {
        this.f13725a.onWindowFocusChanged(z4);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i7) {
        v vVar = this.f13730f;
        vVar.getClass();
        if (i7 != 0) {
            return l.b(this.f13725a, callback, i7);
        }
        F0 f7 = new F0(vVar.f13755B, callback);
        b bVarN = vVar.n(f7);
        if (bVarN != null) {
            return f7.v(bVarN);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f13725a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
