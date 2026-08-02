package p000;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import live.football.scorerepublic.R;

/* JADX INFO: renamed from: q5 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class WindowCallbackC0606q5 implements Window.Callback {

    /* JADX INFO: renamed from: j */
    public final Window.Callback f6378j;

    /* JADX INFO: renamed from: k */
    public boolean f6379k;

    /* JADX INFO: renamed from: l */
    public boolean f6380l;

    /* JADX INFO: renamed from: m */
    public boolean f6381m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ LayoutInflaterFactory2C0828w5 f6382n;

    public WindowCallbackC0606q5(LayoutInflaterFactory2C0828w5 layoutInflaterFactory2C0828w5, Window.Callback callback) {
        this.f6382n = layoutInflaterFactory2C0828w5;
        if (callback != null) {
            this.f6378j = callback;
        } else {
            C0270h1.m2190f("Window callback may not be null");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m4033a(Window.Callback callback) {
        try {
            this.f6379k = true;
            callback.onContentChanged();
        } finally {
            this.f6379k = false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4034b(int i, Menu menu) {
        return this.f6378j.onMenuOpened(i, menu);
    }

    /* JADX INFO: renamed from: c */
    public final void m4035c(int i, Menu menu) {
        this.f6378j.onPanelClosed(i, menu);
    }

    /* JADX INFO: renamed from: d */
    public final void m4036d(List list, Menu menu, int i) {
        dj1.m1229a(this.f6378j, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f6378j.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = this.f6380l;
        Window.Callback callback = this.f6378j;
        if (z) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        return this.f6382n.m5250t(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        C0791v5 c0791v5;
        boolean zM5241E;
        on0 on0Var;
        boolean zPerformShortcut;
        if (!this.f6378j.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            LayoutInflaterFactory2C0828w5 layoutInflaterFactory2C0828w5 = this.f6382n;
            layoutInflaterFactory2C0828w5.m5256z();
            hj1 hj1Var = layoutInflaterFactory2C0828w5.f8430w;
            if (hj1Var == null) {
                c0791v5 = layoutInflaterFactory2C0828w5.f8405U;
                if (c0791v5 != null || !layoutInflaterFactory2C0828w5.m5241E(c0791v5, keyEvent.getKeyCode(), keyEvent)) {
                    if (layoutInflaterFactory2C0828w5.f8405U == null) {
                        C0791v5 c0791v5M5255y = layoutInflaterFactory2C0828w5.m5255y(0);
                        layoutInflaterFactory2C0828w5.m5242F(c0791v5M5255y, keyEvent);
                        zM5241E = layoutInflaterFactory2C0828w5.m5241E(c0791v5M5255y, keyEvent.getKeyCode(), keyEvent);
                        c0791v5M5255y.f8082k = false;
                        if (zM5241E) {
                        }
                    }
                    return false;
                }
                C0791v5 c0791v6 = layoutInflaterFactory2C0828w5.f8405U;
                if (c0791v6 != null) {
                    c0791v6.f8083l = true;
                    return true;
                }
            } else {
                gj1 gj1Var = hj1Var.f3235i;
                if (gj1Var == null || (on0Var = gj1Var.f2768m) == null) {
                    zPerformShortcut = false;
                } else {
                    on0Var.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
                    zPerformShortcut = on0Var.performShortcut(keyCode, keyEvent, 0);
                }
                if (!zPerformShortcut) {
                    c0791v5 = layoutInflaterFactory2C0828w5.f8405U;
                    if (c0791v5 != null) {
                        if (layoutInflaterFactory2C0828w5.f8405U == null) {
                            C0791v5 c0791v5M5255y2 = layoutInflaterFactory2C0828w5.m5255y(0);
                            layoutInflaterFactory2C0828w5.m5242F(c0791v5M5255y2, keyEvent);
                            zM5241E = layoutInflaterFactory2C0828w5.m5241E(c0791v5M5255y2, keyEvent.getKeyCode(), keyEvent);
                            c0791v5M5255y2.f8082k = false;
                            if (zM5241E) {
                            }
                        }
                        return false;
                    }
                    if (layoutInflaterFactory2C0828w5.f8405U == null) {
                        C0791v5 c0791v5M5255y3 = layoutInflaterFactory2C0828w5.m5255y(0);
                        layoutInflaterFactory2C0828w5.m5242F(c0791v5M5255y3, keyEvent);
                        zM5241E = layoutInflaterFactory2C0828w5.m5241E(c0791v5M5255y3, keyEvent.getKeyCode(), keyEvent);
                        c0791v5M5255y3.f8082k = false;
                        if (zM5241E) {
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f6378j.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f6378j.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f6378j.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f6378j.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f6378j.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f6378j.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f6379k) {
            this.f6378j.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof on0)) {
            return this.f6378j.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return this.f6378j.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f6378j.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f6378j.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        m4034b(i, menu);
        if (i == 108) {
            LayoutInflaterFactory2C0828w5 layoutInflaterFactory2C0828w5 = this.f6382n;
            layoutInflaterFactory2C0828w5.m5256z();
            hj1 hj1Var = layoutInflaterFactory2C0828w5.f8430w;
            if (hj1Var != null) {
                ArrayList arrayList = hj1Var.f3239m;
                if (true != hj1Var.f3238l) {
                    hj1Var.f3238l = true;
                    if (arrayList.size() > 0) {
                        arrayList.get(0).getClass();
                        dd0.m1158c();
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.f6381m) {
            this.f6378j.onPanelClosed(i, menu);
            return;
        }
        m4035c(i, menu);
        LayoutInflaterFactory2C0828w5 layoutInflaterFactory2C0828w5 = this.f6382n;
        if (i != 108) {
            if (i == 0) {
                C0791v5 c0791v5M5255y = layoutInflaterFactory2C0828w5.m5255y(i);
                if (c0791v5M5255y.f8084m) {
                    layoutInflaterFactory2C0828w5.m5249r(c0791v5M5255y, false);
                    return;
                }
                return;
            }
            return;
        }
        layoutInflaterFactory2C0828w5.m5256z();
        hj1 hj1Var = layoutInflaterFactory2C0828w5.f8430w;
        if (hj1Var != null) {
            ArrayList arrayList = hj1Var.f3239m;
            if (hj1Var.f3238l) {
                hj1Var.f3238l = false;
                if (arrayList.size() <= 0) {
                    return;
                }
                arrayList.get(0).getClass();
                dd0.m1158c();
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        ej1.m1431a(this.f6378j, z);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        on0 on0Var = menu instanceof on0 ? (on0) menu : null;
        if (i == 0 && on0Var == null) {
            return false;
        }
        if (on0Var != null) {
            on0Var.f5798G = true;
        }
        boolean zOnPreparePanel = this.f6378j.onPreparePanel(i, view, menu);
        if (on0Var != null) {
            on0Var.f5798G = false;
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        on0 on0Var = this.f6382n.m5255y(0).f8079h;
        if (on0Var != null) {
            m4036d(list, on0Var, i);
        } else {
            m4036d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return cj1.m948a(this.f6378j, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f6378j.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.f6378j.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        ViewGroup viewGroup;
        LayoutInflaterFactory2C0828w5 layoutInflaterFactory2C0828w5 = this.f6382n;
        Context context = layoutInflaterFactory2C0828w5.f8427t;
        if (i != 0) {
            return cj1.m949b(this.f6378j, callback, i);
        }
        f71 f71Var = new f71(context, callback);
        AbstractC0751u2 abstractC0751u2 = layoutInflaterFactory2C0828w5.f8387C;
        if (abstractC0751u2 != null) {
            abstractC0751u2.mo2101a();
        }
        C0312i6 c0312i6 = new C0312i6(layoutInflaterFactory2C0828w5, f71Var);
        layoutInflaterFactory2C0828w5.m5256z();
        hj1 hj1Var = layoutInflaterFactory2C0828w5.f8430w;
        int i2 = 1;
        if (hj1Var != null) {
            gj1 gj1Var = hj1Var.f3235i;
            if (gj1Var != null) {
                gj1Var.mo2101a();
            }
            hj1Var.f3229c.setHideOnContentScrollEnabled(false);
            hj1Var.f3232f.m342e();
            gj1 gj1Var2 = new gj1(hj1Var, hj1Var.f3232f.getContext(), c0312i6);
            on0 on0Var = gj1Var2.f2768m;
            on0Var.m3719w();
            try {
                boolean zM1674u = ((f71) gj1Var2.f2769n.f3447k).m1674u(gj1Var2, on0Var);
                on0Var.m3718v();
                if (zM1674u) {
                    hj1Var.f3235i = gj1Var2;
                    gj1Var2.mo2107h();
                    hj1Var.f3232f.m340c(gj1Var2);
                    hj1Var.m2275a(true);
                } else {
                    gj1Var2 = null;
                }
                layoutInflaterFactory2C0828w5.f8387C = gj1Var2;
            } catch (Throwable th) {
                on0Var.m3718v();
                throw th;
            }
        }
        if (layoutInflaterFactory2C0828w5.f8387C == null) {
            ji1 ji1Var = layoutInflaterFactory2C0828w5.f8391G;
            if (ji1Var != null) {
                ji1Var.m2913b();
            }
            AbstractC0751u2 abstractC0751u3 = layoutInflaterFactory2C0828w5.f8387C;
            if (abstractC0751u3 != null) {
                abstractC0751u3.mo2101a();
            }
            if (layoutInflaterFactory2C0828w5.f8388D == null) {
                if (layoutInflaterFactory2C0828w5.f8401Q) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = context.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        C0771um c0771um = new C0771um(context, 0);
                        c0771um.getTheme().setTo(themeNewTheme);
                        context = c0771um;
                    }
                    layoutInflaterFactory2C0828w5.f8388D = new ActionBarContextView(context, null);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    layoutInflaterFactory2C0828w5.f8389E = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    layoutInflaterFactory2C0828w5.f8389E.setContentView(layoutInflaterFactory2C0828w5.f8388D);
                    layoutInflaterFactory2C0828w5.f8389E.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    layoutInflaterFactory2C0828w5.f8388D.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    layoutInflaterFactory2C0828w5.f8389E.setHeight(-2);
                    layoutInflaterFactory2C0828w5.f8390F = new RunnableC0311i5(layoutInflaterFactory2C0828w5, i2);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) layoutInflaterFactory2C0828w5.f8393I.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        layoutInflaterFactory2C0828w5.m5256z();
                        hj1 hj1Var2 = layoutInflaterFactory2C0828w5.f8430w;
                        Context contextM2276b = hj1Var2 != null ? hj1Var2.m2276b() : null;
                        if (contextM2276b != null) {
                            context = contextM2276b;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                        layoutInflaterFactory2C0828w5.f8388D = (ActionBarContextView) viewStubCompat.m384a();
                    }
                }
            }
            if (layoutInflaterFactory2C0828w5.f8388D != null) {
                ji1 ji1Var2 = layoutInflaterFactory2C0828w5.f8391G;
                if (ji1Var2 != null) {
                    ji1Var2.m2913b();
                }
                layoutInflaterFactory2C0828w5.f8388D.m342e();
                Context context2 = layoutInflaterFactory2C0828w5.f8388D.getContext();
                ActionBarContextView actionBarContextView = layoutInflaterFactory2C0828w5.f8388D;
                w91 w91Var = new w91();
                w91Var.f8464l = context2;
                w91Var.f8465m = actionBarContextView;
                w91Var.f8466n = c0312i6;
                on0 on0Var2 = new on0(actionBarContextView.getContext());
                on0Var2.f5810u = 1;
                w91Var.f8469q = on0Var2;
                on0Var2.f5803n = w91Var;
                if (((f71) c0312i6.f3447k).m1674u(w91Var, on0Var2)) {
                    w91Var.mo2107h();
                    layoutInflaterFactory2C0828w5.f8388D.m340c(w91Var);
                    layoutInflaterFactory2C0828w5.f8387C = w91Var;
                    boolean z = layoutInflaterFactory2C0828w5.f8392H && (viewGroup = layoutInflaterFactory2C0828w5.f8393I) != null && viewGroup.isLaidOut();
                    ActionBarContextView actionBarContextView2 = layoutInflaterFactory2C0828w5.f8388D;
                    if (z) {
                        actionBarContextView2.setAlpha(0.0f);
                        ji1 ji1VarM248a = ai1.m248a(layoutInflaterFactory2C0828w5.f8388D);
                        ji1VarM248a.m2912a(1.0f);
                        layoutInflaterFactory2C0828w5.f8391G = ji1VarM248a;
                        ji1VarM248a.m2915d(new C0421l5(i2, layoutInflaterFactory2C0828w5));
                    } else {
                        actionBarContextView2.setAlpha(1.0f);
                        layoutInflaterFactory2C0828w5.f8388D.setVisibility(0);
                        if (layoutInflaterFactory2C0828w5.f8388D.getParent() instanceof View) {
                            View view = (View) layoutInflaterFactory2C0828w5.f8388D.getParent();
                            WeakHashMap weakHashMap = ai1.f194a;
                            view.requestApplyInsets();
                        }
                    }
                    if (layoutInflaterFactory2C0828w5.f8389E != null) {
                        layoutInflaterFactory2C0828w5.f8428u.getDecorView().post(layoutInflaterFactory2C0828w5.f8390F);
                    }
                } else {
                    layoutInflaterFactory2C0828w5.f8387C = null;
                }
            }
            layoutInflaterFactory2C0828w5.m5244H();
            layoutInflaterFactory2C0828w5.f8387C = layoutInflaterFactory2C0828w5.f8387C;
        }
        layoutInflaterFactory2C0828w5.m5244H();
        AbstractC0751u2 abstractC0751u4 = layoutInflaterFactory2C0828w5.f8387C;
        if (abstractC0751u4 != null) {
            return f71Var.m1664j(abstractC0751u4);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f6378j.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
