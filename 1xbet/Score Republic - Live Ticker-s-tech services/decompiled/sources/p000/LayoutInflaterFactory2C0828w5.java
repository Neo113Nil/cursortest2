package p000;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: w5 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class LayoutInflaterFactory2C0828w5 extends AbstractC0274h5 implements mn0, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: p0 */
    public static final w71 f8382p0 = new w71(0);

    /* JADX INFO: renamed from: q0 */
    public static final int[] f8383q0 = {R.attr.windowBackground};

    /* JADX INFO: renamed from: r0 */
    public static final boolean f8384r0 = !"robolectric".equals(Build.FINGERPRINT);

    /* JADX INFO: renamed from: A */
    public C0347j5 f8385A;

    /* JADX INFO: renamed from: B */
    public C0384k5 f8386B;

    /* JADX INFO: renamed from: C */
    public AbstractC0751u2 f8387C;

    /* JADX INFO: renamed from: D */
    public ActionBarContextView f8388D;

    /* JADX INFO: renamed from: E */
    public PopupWindow f8389E;

    /* JADX INFO: renamed from: F */
    public RunnableC0311i5 f8390F;

    /* JADX INFO: renamed from: H */
    public boolean f8392H;

    /* JADX INFO: renamed from: I */
    public ViewGroup f8393I;

    /* JADX INFO: renamed from: J */
    public TextView f8394J;

    /* JADX INFO: renamed from: K */
    public View f8395K;

    /* JADX INFO: renamed from: L */
    public boolean f8396L;

    /* JADX INFO: renamed from: M */
    public boolean f8397M;

    /* JADX INFO: renamed from: N */
    public boolean f8398N;

    /* JADX INFO: renamed from: O */
    public boolean f8399O;

    /* JADX INFO: renamed from: P */
    public boolean f8400P;

    /* JADX INFO: renamed from: Q */
    public boolean f8401Q;

    /* JADX INFO: renamed from: R */
    public boolean f8402R;

    /* JADX INFO: renamed from: S */
    public boolean f8403S;

    /* JADX INFO: renamed from: T */
    public C0791v5[] f8404T;

    /* JADX INFO: renamed from: U */
    public C0791v5 f8405U;

    /* JADX INFO: renamed from: V */
    public boolean f8406V;

    /* JADX INFO: renamed from: W */
    public boolean f8407W;

    /* JADX INFO: renamed from: X */
    public boolean f8408X;

    /* JADX INFO: renamed from: Y */
    public boolean f8409Y;

    /* JADX INFO: renamed from: Z */
    public Configuration f8410Z;

    /* JADX INFO: renamed from: a0 */
    public final int f8411a0;

    /* JADX INFO: renamed from: b0 */
    public int f8412b0;

    /* JADX INFO: renamed from: c0 */
    public int f8413c0;

    /* JADX INFO: renamed from: d0 */
    public boolean f8414d0;

    /* JADX INFO: renamed from: e0 */
    public C0643r5 f8415e0;

    /* JADX INFO: renamed from: f0 */
    public C0643r5 f8416f0;

    /* JADX INFO: renamed from: g0 */
    public boolean f8417g0;

    /* JADX INFO: renamed from: h0 */
    public int f8418h0;

    /* JADX INFO: renamed from: j0 */
    public boolean f8420j0;

    /* JADX INFO: renamed from: k0 */
    public Rect f8421k0;

    /* JADX INFO: renamed from: l0 */
    public Rect f8422l0;

    /* JADX INFO: renamed from: m0 */
    public C0534o7 f8423m0;

    /* JADX INFO: renamed from: n0 */
    public OnBackInvokedDispatcher f8424n0;

    /* JADX INFO: renamed from: o0 */
    public OnBackInvokedCallback f8425o0;

    /* JADX INFO: renamed from: s */
    public final Object f8426s;

    /* JADX INFO: renamed from: t */
    public final Context f8427t;

    /* JADX INFO: renamed from: u */
    public Window f8428u;

    /* JADX INFO: renamed from: v */
    public WindowCallbackC0606q5 f8429v;

    /* JADX INFO: renamed from: w */
    public hj1 f8430w;

    /* JADX INFO: renamed from: x */
    public vb1 f8431x;

    /* JADX INFO: renamed from: y */
    public CharSequence f8432y;

    /* JADX INFO: renamed from: z */
    public ActionBarOverlayLayout f8433z;

    /* JADX INFO: renamed from: G */
    public ji1 f8391G = null;

    /* JADX INFO: renamed from: i0 */
    public final RunnableC0311i5 f8419i0 = new RunnableC0311i5(this, 0);

    public LayoutInflaterFactory2C0828w5(Context context, Window window, InterfaceC0938z4 interfaceC0938z4, Object obj) {
        AbstractActivityC0790v4 abstractActivityC0790v4 = null;
        this.f8411a0 = -100;
        this.f8427t = context;
        this.f8426s = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof AbstractActivityC0790v4)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    abstractActivityC0790v4 = (AbstractActivityC0790v4) context;
                    break;
                }
            }
            if (abstractActivityC0790v4 != null) {
                this.f8411a0 = ((LayoutInflaterFactory2C0828w5) abstractActivityC0790v4.m5051j()).f8411a0;
            }
        }
        if (this.f8411a0 == -100) {
            String name = this.f8426s.getClass().getName();
            w71 w71Var = f8382p0;
            Integer num = (Integer) w71Var.get(name);
            if (num != null) {
                this.f8411a0 = num.intValue();
                w71Var.remove(this.f8426s.getClass().getName());
            }
        }
        if (window != null) {
            m5246n(window);
        }
        C0939z5.m5860c();
    }

    /* JADX INFO: renamed from: o */
    public static tj0 m5235o(Context context) {
        tj0 tj0Var;
        tj0 tj0Var2;
        if (Build.VERSION.SDK_INT >= 33 || (tj0Var = AbstractC0274h5.f3055l) == null) {
            return null;
        }
        uj0 uj0Var = tj0Var.f7456a;
        tj0 tj0VarM3479b = AbstractC0495n5.m3479b(context.getApplicationContext().getResources().getConfiguration());
        if (uj0Var.f7828a.isEmpty()) {
            tj0Var2 = tj0.f7455b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < tj0VarM3479b.f7456a.f7828a.size() + uj0Var.f7828a.size()) {
                Locale locale = i < uj0Var.f7828a.size() ? uj0Var.f7828a.get(i) : tj0VarM3479b.f7456a.f7828a.get(i - uj0Var.f7828a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            tj0Var2 = new tj0(new uj0(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return tj0Var2.f7456a.f7828a.isEmpty() ? tj0VarM3479b : tj0Var2;
    }

    /* JADX INFO: renamed from: s */
    public static Configuration m5236s(Context context, int i, tj0 tj0Var, Configuration configuration, boolean z) {
        int i2;
        if (i == 1) {
            i2 = 16;
        } else if (i != 2) {
            i2 = z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i2 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (tj0Var != null) {
            AbstractC0495n5.m3481d(configuration2, tj0Var);
        }
        return configuration2;
    }

    /* JADX INFO: renamed from: A */
    public final void m5237A(int i) {
        this.f8418h0 = (1 << i) | this.f8418h0;
        if (this.f8417g0) {
            return;
        }
        View decorView = this.f8428u.getDecorView();
        WeakHashMap weakHashMap = ai1.f194a;
        decorView.postOnAnimation(this.f8419i0);
        this.f8417g0 = true;
    }

    /* JADX INFO: renamed from: B */
    public final int m5238B(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            C0270h1.m2191g("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                            return 0;
                        }
                        if (this.f8416f0 == null) {
                            this.f8416f0 = new C0643r5(this, context);
                        }
                        return this.f8416f0.mo4246e();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return m5254x(context).mo4246e();
                }
            }
            return i;
        }
        return -1;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m5239C() {
        InterfaceC0295hq interfaceC0295hq;
        sd1 sd1Var;
        boolean z = this.f8406V;
        this.f8406V = false;
        C0791v5 c0791v5M5255y = m5255y(0);
        if (!c0791v5M5255y.f8084m) {
            AbstractC0751u2 abstractC0751u2 = this.f8387C;
            if (abstractC0751u2 != null) {
                abstractC0751u2.mo2101a();
                return true;
            }
            m5256z();
            hj1 hj1Var = this.f8430w;
            if (hj1Var == null || (interfaceC0295hq = hj1Var.f3231e) == null || (sd1Var = ((xd1) interfaceC0295hq).f8896a.f436U) == null || sd1Var.f7099k == null) {
                return false;
            }
            sd1 sd1Var2 = ((xd1) interfaceC0295hq).f8896a.f436U;
            rn0 rn0Var = sd1Var2 == null ? null : sd1Var2.f7099k;
            if (rn0Var != null) {
                rn0Var.collapseActionView();
            }
        } else if (!z) {
            m5249r(c0791v5M5255y, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0175, code lost:
    
        if (r2.f7124o.getCount() > 0) goto L88;
     */
    /* JADX INFO: renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5240D(C0791v5 c0791v5, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        boolean z = c0791v5.f8084m;
        int i2 = c0791v5.f8072a;
        if (z || this.f8409Y) {
            return;
        }
        Context context = this.f8427t;
        if (i2 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.f8428u.getCallback();
        if (callback != null && !callback.onMenuOpened(i2, c0791v5.f8079h)) {
            m5249r(c0791v5, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null && m5242F(c0791v5, keyEvent)) {
            C0754u5 c0754u5 = c0791v5.f8076e;
            if (c0754u5 != null && !c0791v5.f8085n) {
                View view = c0791v5.f8078g;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i = -1;
                }
                c0791v5.f8083l = false;
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
                layoutParams2.gravity = c0791v5.f8074c;
                layoutParams2.windowAnimations = c0791v5.f8075d;
                windowManager.addView(c0791v5.f8076e, layoutParams2);
                c0791v5.f8084m = true;
                if (i2 == 0) {
                    m5244H();
                }
            }
            if (c0754u5 == null) {
                m5256z();
                hj1 hj1Var = this.f8430w;
                Context contextM2276b = hj1Var != null ? hj1Var.m2276b() : null;
                if (contextM2276b != null) {
                    context = contextM2276b;
                }
                TypedValue typedValue = new TypedValue();
                Resources.Theme themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(context.getTheme());
                themeNewTheme.resolveAttribute(live.football.scorerepublic.R.attr.actionBarPopupTheme, typedValue, true);
                int i3 = typedValue.resourceId;
                if (i3 != 0) {
                    themeNewTheme.applyStyle(i3, true);
                }
                themeNewTheme.resolveAttribute(live.football.scorerepublic.R.attr.panelMenuListTheme, typedValue, true);
                int i4 = typedValue.resourceId;
                if (i4 != 0) {
                    themeNewTheme.applyStyle(i4, true);
                } else {
                    themeNewTheme.applyStyle(live.football.scorerepublic.R.style.Theme_AppCompat_CompactMenu, true);
                }
                C0771um c0771um = new C0771um(context, 0);
                c0771um.getTheme().setTo(themeNewTheme);
                c0791v5.f8081j = c0771um;
                TypedArray typedArrayObtainStyledAttributes = c0771um.obtainStyledAttributes(mz0.f5196j);
                c0791v5.f8073b = typedArrayObtainStyledAttributes.getResourceId(86, 0);
                c0791v5.f8075d = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                typedArrayObtainStyledAttributes.recycle();
                c0791v5.f8076e = new C0754u5(this, c0791v5.f8081j);
                c0791v5.f8074c = 81;
            } else if (c0791v5.f8085n && c0754u5.getChildCount() > 0) {
                c0791v5.f8076e.removeAllViews();
            }
            View view2 = c0791v5.f8078g;
            if (view2 == null) {
                if (c0791v5.f8079h != null) {
                    if (this.f8386B == null) {
                        this.f8386B = new C0384k5(this);
                    }
                    C0384k5 c0384k5 = this.f8386B;
                    if (c0791v5.f8080i == null) {
                        si0 si0Var = new si0(c0791v5.f8081j);
                        c0791v5.f8080i = si0Var;
                        si0Var.f7123n = c0384k5;
                        on0 on0Var = c0791v5.f8079h;
                        on0Var.m3706b(si0Var, on0Var.f5799j);
                    }
                    si0 si0Var2 = c0791v5.f8080i;
                    C0754u5 c0754u6 = c0791v5.f8076e;
                    if (si0Var2.f7122m == null) {
                        si0Var2.f7122m = (ExpandedMenuView) si0Var2.f7120k.inflate(live.football.scorerepublic.R.layout.abc_expanded_menu_layout, (ViewGroup) c0754u6, false);
                        if (si0Var2.f7124o == null) {
                            si0Var2.f7124o = new ri0(si0Var2);
                        }
                        si0Var2.f7122m.setAdapter((ListAdapter) si0Var2.f7124o);
                        si0Var2.f7122m.setOnItemClickListener(si0Var2);
                    }
                    ExpandedMenuView expandedMenuView = si0Var2.f7122m;
                    c0791v5.f8077f = expandedMenuView;
                    if (expandedMenuView != null) {
                    }
                }
                c0791v5.f8085n = true;
                return;
            }
            c0791v5.f8077f = view2;
            if (c0791v5.f8077f != null) {
                if (c0791v5.f8078g == null) {
                    si0 si0Var3 = c0791v5.f8080i;
                    if (si0Var3.f7124o == null) {
                        si0Var3.f7124o = new ri0(si0Var3);
                    }
                }
                ViewGroup.LayoutParams layoutParams3 = c0791v5.f8077f.getLayoutParams();
                if (layoutParams3 == null) {
                    layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
                }
                c0791v5.f8076e.setBackgroundResource(c0791v5.f8073b);
                ViewParent parent = c0791v5.f8077f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(c0791v5.f8077f);
                }
                c0791v5.f8076e.addView(c0791v5.f8077f, layoutParams3);
                if (!c0791v5.f8077f.hasFocus()) {
                    c0791v5.f8077f.requestFocus();
                }
            }
            c0791v5.f8085n = true;
            return;
            i = -2;
            c0791v5.f8083l = false;
            WindowManager.LayoutParams layoutParams4 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
            layoutParams4.gravity = c0791v5.f8074c;
            layoutParams4.windowAnimations = c0791v5.f8075d;
            windowManager.addView(c0791v5.f8076e, layoutParams4);
            c0791v5.f8084m = true;
            if (i2 == 0) {
                m5244H();
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public final boolean m5241E(C0791v5 c0791v5, int i, KeyEvent keyEvent) {
        on0 on0Var;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((c0791v5.f8082k || m5242F(c0791v5, keyEvent)) && (on0Var = c0791v5.f8079h) != null) {
            return on0Var.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:79:0x010d  */
    /* JADX INFO: renamed from: F */
    public final boolean m5242F(C0791v5 c0791v5, KeyEvent keyEvent) {
        on0 on0Var;
        ActionBarOverlayLayout actionBarOverlayLayout;
        ActionBarOverlayLayout actionBarOverlayLayout2;
        Resources.Theme themeNewTheme;
        ActionBarOverlayLayout actionBarOverlayLayout3;
        ActionBarOverlayLayout actionBarOverlayLayout4;
        if (!this.f8409Y) {
            boolean z = c0791v5.f8082k;
            int i = c0791v5.f8072a;
            if (z) {
                return true;
            }
            C0791v5 c0791v6 = this.f8405U;
            if (c0791v6 != null && c0791v6 != c0791v5) {
                m5249r(c0791v6, false);
            }
            Window.Callback callback = this.f8428u.getCallback();
            if (callback != null) {
                c0791v5.f8078g = callback.onCreatePanelView(i);
            }
            boolean z2 = i == 0 || i == 108;
            if (z2 && (actionBarOverlayLayout4 = this.f8433z) != null) {
                actionBarOverlayLayout4.m355k();
                ((xd1) actionBarOverlayLayout4.f377n).f8907l = true;
            }
            if (c0791v5.f8078g == null) {
                on0 on0Var2 = c0791v5.f8079h;
                if (on0Var2 == null || c0791v5.f8086o) {
                    if (on0Var2 == null) {
                        Context context = this.f8427t;
                        if ((i == 0 || i == 108) && this.f8433z != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(live.football.scorerepublic.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                themeNewTheme.resolveAttribute(live.football.scorerepublic.R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme.resolveAttribute(live.football.scorerepublic.R.attr.actionBarWidgetTheme, typedValue, true);
                                themeNewTheme = null;
                            }
                            if (typedValue.resourceId != 0) {
                                if (themeNewTheme == null) {
                                    themeNewTheme = context.getResources().newTheme();
                                    themeNewTheme.setTo(theme);
                                }
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                            }
                            if (themeNewTheme != null) {
                                C0771um c0771um = new C0771um(context, 0);
                                c0771um.getTheme().setTo(themeNewTheme);
                                context = c0771um;
                            }
                        }
                        on0 on0Var3 = new on0(context);
                        on0Var3.f5803n = this;
                        on0 on0Var4 = c0791v5.f8079h;
                        if (on0Var3 != on0Var4) {
                            if (on0Var4 != null) {
                                on0Var4.m3714r(c0791v5.f8080i);
                            }
                            c0791v5.f8079h = on0Var3;
                            si0 si0Var = c0791v5.f8080i;
                            if (si0Var != null) {
                                on0Var3.m3706b(si0Var, on0Var3.f5799j);
                            }
                        }
                        if (c0791v5.f8079h != null) {
                            if (z2 && (actionBarOverlayLayout2 = this.f8433z) != null) {
                                if (this.f8385A == null) {
                                    this.f8385A = new C0347j5(this);
                                }
                                actionBarOverlayLayout2.m356l(c0791v5.f8079h, this.f8385A);
                            }
                            c0791v5.f8079h.m3719w();
                            if (callback.onCreatePanelMenu(i, c0791v5.f8079h)) {
                                c0791v5.f8086o = false;
                            } else {
                                on0Var = c0791v5.f8079h;
                                if (on0Var != null) {
                                    if (on0Var != null) {
                                        on0Var.m3714r(c0791v5.f8080i);
                                    }
                                    c0791v5.f8079h = null;
                                }
                                if (z2 && (actionBarOverlayLayout = this.f8433z) != null) {
                                    actionBarOverlayLayout.m356l(null, this.f8385A);
                                }
                            }
                        }
                    } else {
                        if (z2) {
                            if (this.f8385A == null) {
                                this.f8385A = new C0347j5(this);
                            }
                            actionBarOverlayLayout2.m356l(c0791v5.f8079h, this.f8385A);
                        }
                        c0791v5.f8079h.m3719w();
                        if (callback.onCreatePanelMenu(i, c0791v5.f8079h)) {
                            on0Var = c0791v5.f8079h;
                            if (on0Var != null) {
                                if (on0Var != null) {
                                    on0Var.m3714r(c0791v5.f8080i);
                                }
                                c0791v5.f8079h = null;
                            }
                            if (z2) {
                                actionBarOverlayLayout.m356l(null, this.f8385A);
                            }
                        } else {
                            c0791v5.f8086o = false;
                        }
                    }
                }
                c0791v5.f8079h.m3719w();
                Bundle bundle = c0791v5.f8087p;
                if (bundle != null) {
                    c0791v5.f8079h.m3715s(bundle);
                    c0791v5.f8087p = null;
                }
                if (!callback.onPreparePanel(0, c0791v5.f8078g, c0791v5.f8079h)) {
                    if (z2 && (actionBarOverlayLayout3 = this.f8433z) != null) {
                        actionBarOverlayLayout3.m356l(null, this.f8385A);
                    }
                    c0791v5.f8079h.m3718v();
                    return false;
                }
                c0791v5.f8079h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                c0791v5.f8079h.m3718v();
            }
            c0791v5.f8082k = true;
            c0791v5.f8083l = false;
            this.f8405U = c0791v5;
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: G */
    public final void m5243G() {
        if (this.f8392H) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m5244H() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.f8424n0 != null && (m5255y(0).f8084m || this.f8387C != null)) {
                z = true;
            }
            if (z && this.f8425o0 == null) {
                this.f8425o0 = AbstractC0569p5.m3849b(this.f8424n0, this);
            } else {
                if (z || (onBackInvokedCallback = this.f8425o0) == null) {
                    return;
                }
                AbstractC0569p5.m3850c(this.f8424n0, onBackInvokedCallback);
                this.f8425o0 = null;
            }
        }
    }

    @Override // p000.AbstractC0274h5
    /* JADX INFO: renamed from: a */
    public final void mo2211a() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f8427t);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof LayoutInflaterFactory2C0828w5) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // p000.AbstractC0274h5
    /* JADX INFO: renamed from: c */
    public final void mo2212c() {
        String strM2810s;
        this.f8407W = true;
        m5245m(false, true);
        m5253w();
        Object obj = this.f8426s;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strM2810s = j22.m2810s(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                strM2810s = null;
            }
            if (strM2810s != null) {
                hj1 hj1Var = this.f8430w;
                if (hj1Var == null) {
                    this.f8420j0 = true;
                } else {
                    hj1Var.m2278d(true);
                }
            }
            synchronized (AbstractC0274h5.f3060q) {
                AbstractC0274h5.m2210e(this);
                AbstractC0274h5.f3059p.add(new WeakReference(this));
            }
        }
        this.f8410Z = new Configuration(this.f8427t.getResources().getConfiguration());
        this.f8408X = true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // p000.AbstractC0274h5
    /* JADX INFO: renamed from: d */
    public final void mo2213d() {
        if (this.f8426s instanceof Activity) {
            synchronized (AbstractC0274h5.f3060q) {
                AbstractC0274h5.m2210e(this);
            }
        }
        if (this.f8417g0) {
            this.f8428u.getDecorView().removeCallbacks(this.f8419i0);
        }
        this.f8409Y = true;
        if (this.f8411a0 != -100) {
            Object obj = this.f8426s;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f8382p0.put(this.f8426s.getClass().getName(), Integer.valueOf(this.f8411a0));
            } else {
                f8382p0.remove(this.f8426s.getClass().getName());
            }
        } else {
            f8382p0.remove(this.f8426s.getClass().getName());
        }
        C0643r5 c0643r5 = this.f8415e0;
        if (c0643r5 != null) {
            c0643r5.m4687c();
        }
        C0643r5 c0643r6 = this.f8416f0;
        if (c0643r6 != null) {
            c0643r6.m4687c();
        }
    }

    @Override // p000.AbstractC0274h5
    /* JADX INFO: renamed from: f */
    public final boolean mo2214f(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.f8402R && i == 108) {
            return false;
        }
        if (this.f8398N && i == 1) {
            this.f8398N = false;
        }
        if (i == 1) {
            m5243G();
            this.f8402R = true;
            return true;
        }
        if (i == 2) {
            m5243G();
            this.f8396L = true;
            return true;
        }
        if (i == 5) {
            m5243G();
            this.f8397M = true;
            return true;
        }
        if (i == 10) {
            m5243G();
            this.f8400P = true;
            return true;
        }
        if (i == 108) {
            m5243G();
            this.f8398N = true;
            return true;
        }
        if (i != 109) {
            return this.f8428u.requestFeature(i);
        }
        m5243G();
        this.f8399O = true;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002a  */
    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final boolean mo311g(on0 on0Var, MenuItem menuItem) {
        C0791v5 c0791v5;
        Window.Callback callback = this.f8428u.getCallback();
        if (callback != null && !this.f8409Y) {
            on0 on0VarMo2020k = on0Var.mo2020k();
            C0791v5[] c0791v5Arr = this.f8404T;
            int length = c0791v5Arr != null ? c0791v5Arr.length : 0;
            for (int i = 0; i < length; i++) {
                c0791v5 = c0791v5Arr[i];
                if (c0791v5 != null && c0791v5.f8079h == on0VarMo2020k) {
                    if (c0791v5 != null) {
                        return callback.onMenuItemSelected(c0791v5.f8072a, menuItem);
                    }
                }
            }
            c0791v5 = null;
            if (c0791v5 != null) {
                return callback.onMenuItemSelected(c0791v5.f8072a, menuItem);
            }
        }
        return false;
    }

    @Override // p000.AbstractC0274h5
    /* JADX INFO: renamed from: h */
    public final void mo2215h(int i) {
        m5252v();
        ViewGroup viewGroup = (ViewGroup) this.f8393I.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f8427t).inflate(i, viewGroup);
        this.f8429v.m4033a(this.f8428u.getCallback());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        if (r6.m4027i() != false) goto L20;
     */
    @Override // p000.mn0
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo313i(on0 on0Var) {
        ActionMenuView actionMenuView;
        C0603q2 c0603q2;
        C0603q2 c0603q3;
        C0603q2 c0603q4;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f8433z;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.m355k();
            Toolbar toolbar = ((xd1) actionBarOverlayLayout.f377n).f8896a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f442j) != null && actionMenuView.f391B) {
                if (ViewConfiguration.get(this.f8427t).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = this.f8433z;
                    actionBarOverlayLayout2.m355k();
                    ActionMenuView actionMenuView2 = ((xd1) actionBarOverlayLayout2.f377n).f8896a.f442j;
                    if (actionMenuView2 != null) {
                        C0603q2 c0603q5 = actionMenuView2.f392C;
                        if (c0603q5 != null) {
                            if (c0603q5.f6321D == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.f8428u.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = this.f8433z;
                actionBarOverlayLayout3.m355k();
                ActionMenuView actionMenuView3 = ((xd1) actionBarOverlayLayout3.f377n).f8896a.f442j;
                if (actionMenuView3 != null && (c0603q3 = actionMenuView3.f392C) != null && c0603q3.m4027i()) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = this.f8433z;
                    actionBarOverlayLayout4.m355k();
                    ActionMenuView actionMenuView4 = ((xd1) actionBarOverlayLayout4.f377n).f8896a.f442j;
                    if (actionMenuView4 != null && (c0603q4 = actionMenuView4.f392C) != null) {
                        c0603q4.m4026c();
                    }
                    if (this.f8409Y) {
                        return;
                    }
                    callback.onPanelClosed(108, m5255y(0).f8079h);
                    return;
                }
                if (callback == null || this.f8409Y) {
                    return;
                }
                if (this.f8417g0 && (1 & this.f8418h0) != 0) {
                    View decorView = this.f8428u.getDecorView();
                    RunnableC0311i5 runnableC0311i5 = this.f8419i0;
                    decorView.removeCallbacks(runnableC0311i5);
                    runnableC0311i5.run();
                }
                C0791v5 c0791v5M5255y = m5255y(0);
                on0 on0Var2 = c0791v5M5255y.f8079h;
                if (on0Var2 == null || c0791v5M5255y.f8086o || !callback.onPreparePanel(0, c0791v5M5255y.f8078g, on0Var2)) {
                    return;
                }
                callback.onMenuOpened(108, c0791v5M5255y.f8079h);
                ActionBarOverlayLayout actionBarOverlayLayout5 = this.f8433z;
                actionBarOverlayLayout5.m355k();
                ActionMenuView actionMenuView5 = ((xd1) actionBarOverlayLayout5.f377n).f8896a.f442j;
                if (actionMenuView5 == null || (c0603q2 = actionMenuView5.f392C) == null) {
                    return;
                }
                c0603q2.m4028l();
                return;
            }
        }
        C0791v5 c0791v5M5255y2 = m5255y(0);
        c0791v5M5255y2.f8085n = true;
        m5249r(c0791v5M5255y2, false);
        m5240D(c0791v5M5255y2, null);
    }

    @Override // p000.AbstractC0274h5
    /* JADX INFO: renamed from: j */
    public final void mo2216j(View view) {
        m5252v();
        ViewGroup viewGroup = (ViewGroup) this.f8393I.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f8429v.m4033a(this.f8428u.getCallback());
    }

    @Override // p000.AbstractC0274h5
    /* JADX INFO: renamed from: k */
    public final void mo2217k(View view, ViewGroup.LayoutParams layoutParams) {
        m5252v();
        ViewGroup viewGroup = (ViewGroup) this.f8393I.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f8429v.m4033a(this.f8428u.getCallback());
    }

    @Override // p000.AbstractC0274h5
    /* JADX INFO: renamed from: l */
    public final void mo2218l(CharSequence charSequence) {
        this.f8432y = charSequence;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f8433z;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setWindowTitle(charSequence);
            return;
        }
        hj1 hj1Var = this.f8430w;
        if (hj1Var == null) {
            TextView textView = this.f8394J;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        xd1 xd1Var = (xd1) hj1Var.f3231e;
        if (xd1Var.f8902g) {
            return;
        }
        Toolbar toolbar = xd1Var.f8896a;
        xd1Var.f8903h = charSequence;
        if ((xd1Var.f8897b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (xd1Var.f8902g) {
                ai1.m253f(toolbar.getRootView(), charSequence);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00da  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public final boolean m5245m(boolean z, boolean z2) {
        int i;
        boolean z3;
        if (this.f8409Y) {
            return false;
        }
        int i2 = this.f8411a0;
        if (i2 == -100) {
            i2 = AbstractC0274h5.f3054k;
        }
        Context context = this.f8427t;
        int iM5238B = m5238B(context, i2);
        tj0 tj0VarM5235o = Build.VERSION.SDK_INT < 33 ? m5235o(context) : null;
        if (!z2 && tj0VarM5235o != null) {
            tj0VarM5235o = AbstractC0495n5.m3479b(context.getResources().getConfiguration());
        }
        Configuration configurationM5236s = m5236s(context, iM5238B, tj0VarM5235o, null, false);
        boolean z4 = this.f8414d0;
        boolean z5 = true;
        Object obj = this.f8426s;
        if (z4 || !(obj instanceof Activity)) {
            this.f8414d0 = true;
            i = this.f8413c0;
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
            } else {
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj.getClass()), 269221888);
                    if (activityInfo != null) {
                        this.f8413c0 = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                    this.f8413c0 = 0;
                }
                this.f8414d0 = true;
                i = this.f8413c0;
            }
        }
        Configuration configuration = this.f8410Z;
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int i3 = configuration.uiMode & 48;
        int i4 = configurationM5236s.uiMode & 48;
        tj0 tj0VarM3479b = AbstractC0495n5.m3479b(configuration);
        tj0 tj0VarM3479b2 = tj0VarM5235o == null ? null : AbstractC0495n5.m3479b(configurationM5236s);
        int i5 = i3 != i4 ? 512 : 0;
        if (tj0VarM3479b2 != null && !tj0VarM3479b.equals(tj0VarM3479b2)) {
            i5 |= 8196;
        }
        if (((~i) & i5) != 0 && z && this.f8407W && ((f8384r0 || this.f8408X) && (obj instanceof Activity))) {
            Activity activity = (Activity) obj;
            if (activity.isChild()) {
                z3 = false;
            } else {
                if (Build.VERSION.SDK_INT >= 31 && (i5 & 8192) != 0) {
                    activity.getWindow().getDecorView().setLayoutDirection(configurationM5236s.getLayoutDirection());
                }
                activity.recreate();
                z3 = true;
            }
        } else {
            z3 = false;
        }
        if (z3 || i5 == 0) {
            z5 = z3;
        } else {
            boolean z6 = (i5 & i) == i5;
            Resources resources = context.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i4;
            if (tj0VarM3479b2 != null) {
                AbstractC0495n5.m3481d(configuration2, tj0VarM3479b2);
            }
            resources.updateConfiguration(configuration2, null);
            int i6 = this.f8412b0;
            if (i6 != 0) {
                context.setTheme(i6);
                context.getTheme().applyStyle(this.f8412b0, true);
            }
            if (z6 && (obj instanceof Activity)) {
                Activity activity2 = (Activity) obj;
                if (activity2 instanceof yh0) {
                    if (((yh0) activity2).mo862d().f551c.compareTo(qh0.f6499l) >= 0) {
                        activity2.onConfigurationChanged(configuration2);
                    }
                } else if (this.f8408X && !this.f8409Y) {
                    activity2.onConfigurationChanged(configuration2);
                }
            }
        }
        if (tj0VarM3479b2 != null) {
            AbstractC0495n5.m3480c(AbstractC0495n5.m3479b(context.getResources().getConfiguration()));
        }
        if (i2 == 0) {
            m5254x(context).m4689h();
        } else {
            C0643r5 c0643r5 = this.f8415e0;
            if (c0643r5 != null) {
                c0643r5.m4687c();
            }
        }
        C0643r5 c0643r6 = this.f8416f0;
        if (i2 == 3) {
            if (c0643r6 == null) {
                this.f8416f0 = new C0643r5(this, context);
            }
            this.f8416f0.m4689h();
        } else if (c0643r6 != null) {
            c0643r6.m4687c();
        }
        return z5;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0074  */
    /* JADX INFO: renamed from: n */
    public final void m5246n(Window window) {
        Drawable drawableM1580d;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f8428u != null) {
            C0270h1.m2191g("AppCompat has already installed itself into the Window");
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof WindowCallbackC0606q5) {
            C0270h1.m2191g("AppCompat has already installed itself into the Window");
            return;
        }
        WindowCallbackC0606q5 windowCallbackC0606q5 = new WindowCallbackC0606q5(this, callback);
        this.f8429v = windowCallbackC0606q5;
        window.setCallback(windowCallbackC0606q5);
        Context context = this.f8427t;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, f8383q0);
        if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawableM1580d = null;
        } else {
            C0939z5 c0939z5M5859a = C0939z5.m5859a();
            synchronized (c0939z5M5859a) {
                drawableM1580d = c0939z5M5859a.f9607a.m1580d(context, resourceId, true);
            }
        }
        if (drawableM1580d != null) {
            window.setBackgroundDrawable(drawableM1580d);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f8428u = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f8424n0) != null) {
            return;
        }
        Object obj = this.f8426s;
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f8425o0) != null) {
            AbstractC0569p5.m3850c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f8425o0 = null;
        }
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f8424n0 = AbstractC0569p5.m3848a(activity);
            } else {
                this.f8424n0 = null;
            }
        } else {
            this.f8424n0 = null;
        }
        m5244H();
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View c0385k6;
        View view2 = null;
        if (this.f8423m0 == null) {
            int[] iArr = mz0.f5196j;
            Context context2 = this.f8427t;
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = typedArrayObtainStyledAttributes.getString(116);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.f8423m0 = new C0534o7();
            } else {
                try {
                    this.f8423m0 = (C0534o7) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f8423m0 = new C0534o7();
                }
            }
        }
        C0534o7 c0534o7 = this.f8423m0;
        int i = gh1.f2738a;
        c0534o7.getClass();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, mz0.f5210x, 0, 0);
        byte b = 4;
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes2.recycle();
        Context c0771um = (resourceId == 0 || ((context instanceof C0771um) && ((C0771um) context).f7854a == resourceId)) ? context : new C0771um(context, resourceId);
        str.getClass();
        switch (str.hashCode()) {
            case -1946472170:
                b = !str.equals("RatingBar") ? (byte) -1 : (byte) 0;
                break;
            case -1455429095:
                b = !str.equals("CheckedTextView") ? (byte) -1 : (byte) 1;
                break;
            case -1346021293:
                b = !str.equals("MultiAutoCompleteTextView") ? (byte) -1 : (byte) 2;
                break;
            case -938935918:
                b = !str.equals("TextView") ? (byte) -1 : (byte) 3;
                break;
            case -937446323:
                if (!str.equals("ImageButton")) {
                    b = -1;
                }
                break;
            case -658531749:
                b = !str.equals("SeekBar") ? (byte) -1 : (byte) 5;
                break;
            case -339785223:
                b = !str.equals("Spinner") ? (byte) -1 : (byte) 6;
                break;
            case 776382189:
                b = !str.equals("RadioButton") ? (byte) -1 : (byte) 7;
                break;
            case 799298502:
                b = !str.equals("ToggleButton") ? (byte) -1 : (byte) 8;
                break;
            case 1125864064:
                b = !str.equals("ImageView") ? (byte) -1 : (byte) 9;
                break;
            case 1413872058:
                b = !str.equals("AutoCompleteTextView") ? (byte) -1 : (byte) 10;
                break;
            case 1601505219:
                b = !str.equals("CheckBox") ? (byte) -1 : (byte) 11;
                break;
            case 1666676343:
                b = !str.equals("EditText") ? (byte) -1 : (byte) 12;
                break;
            case 2001146706:
                b = !str.equals("Button") ? (byte) -1 : (byte) 13;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                c0385k6 = new C0385k6(c0771um, attributeSet);
                break;
            case 1:
                c0385k6 = new C0050b5(c0771um, attributeSet);
                break;
            case 2:
                c0385k6 = new C0238g6(c0771um, attributeSet);
                break;
            case 3:
                c0385k6 = new C0276h7(c0771um, attributeSet);
                break;
            case 4:
                c0385k6 = new C0127d6(c0771um, attributeSet, live.football.scorerepublic.R.attr.imageButtonStyle);
                break;
            case 5:
                c0385k6 = new C0459m6(c0771um, attributeSet);
                break;
            case 6:
                c0385k6 = new C0903y6(c0771um, attributeSet);
                break;
            case 7:
                c0385k6 = new C0348j6(c0771um, attributeSet);
                break;
            case 8:
                c0385k6 = new C0460m7(c0771um, attributeSet);
                break;
            case 9:
                c0385k6 = new C0200f6(c0771um, attributeSet, 0);
                break;
            case 10:
                c0385k6 = new C0827w4(c0771um, attributeSet);
                break;
            case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                c0385k6 = new C0006a5(c0771um, attributeSet);
                break;
            case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                c0385k6 = new C0051b6(c0771um, attributeSet);
                break;
            case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                c0385k6 = new C0901y4(c0771um, attributeSet);
                break;
            default:
                c0385k6 = null;
                break;
        }
        if (c0385k6 == null && context != c0771um) {
            Object[] objArr = c0534o7.f5643a;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = c0771um;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i2 = 0;
                    while (true) {
                        String[] strArr = C0534o7.f5641d;
                        if (i2 < 3) {
                            View viewM3633a = c0534o7.m3633a(c0771um, str, strArr[i2]);
                            if (viewM3633a != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = viewM3633a;
                            } else {
                                i2++;
                            }
                        } else {
                            objArr[0] = null;
                            objArr[1] = null;
                        }
                    }
                } else {
                    View viewM3633a2 = c0534o7.m3633a(c0771um, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = viewM3633a2;
                }
            } catch (Exception unused) {
                objArr[0] = null;
                objArr[1] = null;
            } catch (Throwable th2) {
                objArr[0] = null;
                objArr[1] = null;
                throw th2;
            }
            c0385k6 = view2;
        }
        if (c0385k6 != null) {
            Context context3 = c0385k6.getContext();
            if ((context3 instanceof ContextWrapper) && c0385k6.hasOnClickListeners()) {
                TypedArray typedArrayObtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, C0534o7.f5640c);
                String string2 = typedArrayObtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    c0385k6.setOnClickListener(new ViewOnClickListenerC0497n7(c0385k6, string2));
                }
                typedArrayObtainStyledAttributes3.recycle();
            }
        }
        return c0385k6;
    }

    /* JADX INFO: renamed from: p */
    public final void m5247p(int i, C0791v5 c0791v5, on0 on0Var) {
        if (on0Var == null) {
            if (c0791v5 == null && i >= 0) {
                C0791v5[] c0791v5Arr = this.f8404T;
                if (i < c0791v5Arr.length) {
                    c0791v5 = c0791v5Arr[i];
                }
            }
            if (c0791v5 != null) {
                on0Var = c0791v5.f8079h;
            }
        }
        if ((c0791v5 == null || c0791v5.f8084m) && !this.f8409Y) {
            WindowCallbackC0606q5 windowCallbackC0606q5 = this.f8429v;
            Window.Callback callback = this.f8428u.getCallback();
            windowCallbackC0606q5.getClass();
            try {
                windowCallbackC0606q5.f6381m = true;
                callback.onPanelClosed(i, on0Var);
            } finally {
                windowCallbackC0606q5.f6381m = false;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m5248q(on0 on0Var) {
        C0603q2 c0603q2;
        if (this.f8403S) {
            return;
        }
        this.f8403S = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f8433z;
        actionBarOverlayLayout.m355k();
        ActionMenuView actionMenuView = ((xd1) actionBarOverlayLayout.f377n).f8896a.f442j;
        if (actionMenuView != null && (c0603q2 = actionMenuView.f392C) != null) {
            c0603q2.m4026c();
            C0455m2 c0455m2 = c0603q2.f6320C;
            if (c0455m2 != null && c0455m2.m5814b()) {
                c0455m2.f9404i.dismiss();
            }
        }
        Window.Callback callback = this.f8428u.getCallback();
        if (callback != null && !this.f8409Y) {
            callback.onPanelClosed(108, on0Var);
        }
        this.f8403S = false;
    }

    /* JADX INFO: renamed from: r */
    public final void m5249r(C0791v5 c0791v5, boolean z) {
        C0754u5 c0754u5;
        ActionBarOverlayLayout actionBarOverlayLayout;
        C0603q2 c0603q2;
        if (z && c0791v5.f8072a == 0 && (actionBarOverlayLayout = this.f8433z) != null) {
            actionBarOverlayLayout.m355k();
            ActionMenuView actionMenuView = ((xd1) actionBarOverlayLayout.f377n).f8896a.f442j;
            if (actionMenuView != null && (c0603q2 = actionMenuView.f392C) != null && c0603q2.m4027i()) {
                m5248q(c0791v5.f8079h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f8427t.getSystemService("window");
        if (windowManager != null && c0791v5.f8084m && (c0754u5 = c0791v5.f8076e) != null) {
            windowManager.removeView(c0754u5);
            if (z) {
                m5247p(c0791v5.f8072a, c0791v5, null);
            }
        }
        c0791v5.f8082k = false;
        c0791v5.f8083l = false;
        c0791v5.f8084m = false;
        c0791v5.f8077f = null;
        c0791v5.f8085n = true;
        if (this.f8405U == c0791v5) {
            this.f8405U = null;
        }
        if (c0791v5.f8072a == 0) {
            m5244H();
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0140 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0039  */
    /* JADX WARN: Code duplicated, block: B:21:0x0044 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0046 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x0069 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x006b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:89:0x0115  */
    /* JADX WARN: Code duplicated, block: B:93:0x011f  */
    /* JADX WARN: Code duplicated, block: B:95:0x012d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0131  */
    /* JADX WARN: Code duplicated, block: B:99:0x0139  */
    /* JADX INFO: renamed from: t */
    public final boolean m5250t(KeyEvent keyEvent) {
        int keyCode;
        C0791v5 c0791v5M5255y;
        ActionBarOverlayLayout actionBarOverlayLayout;
        Context context;
        boolean z;
        boolean z2;
        boolean zM5242F;
        AudioManager audioManager;
        Toolbar toolbar;
        ActionMenuView actionMenuView;
        C0603q2 c0603q2;
        C0603q2 c0603q3;
        C0603q2 c0603q4;
        C0791v5 c0791v5M5255y2;
        Object obj = this.f8426s;
        if (((obj instanceof yg0) || (obj instanceof DialogInterfaceC0715t3)) && this.f8428u.getDecorView() != null) {
            WeakHashMap weakHashMap = ai1.f194a;
        }
        if (keyEvent.getKeyCode() == 82) {
            WindowCallbackC0606q5 windowCallbackC0606q5 = this.f8429v;
            Window.Callback callback = this.f8428u.getCallback();
            windowCallbackC0606q5.getClass();
            try {
                windowCallbackC0606q5.f6380l = true;
                boolean zDispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                windowCallbackC0606q5.f6380l = false;
                if (!zDispatchKeyEvent) {
                    keyCode = keyEvent.getKeyCode();
                    if (keyEvent.getAction() == 0) {
                        if (keyCode != 4) {
                            this.f8406V = (keyEvent.getFlags() & 128) != 0;
                            return false;
                        }
                        if (keyCode == 82) {
                            if (keyEvent.getRepeatCount() == 0) {
                                c0791v5M5255y2 = m5255y(0);
                                if (!c0791v5M5255y2.f8084m) {
                                    m5242F(c0791v5M5255y2, keyEvent);
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                    if (keyCode != 4) {
                        if (keyCode == 82) {
                            if (this.f8387C == null) {
                                c0791v5M5255y = m5255y(0);
                                actionBarOverlayLayout = this.f8433z;
                                context = this.f8427t;
                                if (actionBarOverlayLayout != null) {
                                    actionBarOverlayLayout.m355k();
                                    toolbar = ((xd1) actionBarOverlayLayout.f377n).f8896a;
                                    if (toolbar.getVisibility() == 0 || (actionMenuView = toolbar.f442j) == null || !actionMenuView.f391B || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                        z = c0791v5M5255y.f8084m;
                                        if (!z || c0791v5M5255y.f8083l) {
                                            m5249r(c0791v5M5255y, true);
                                            z2 = z;
                                        } else {
                                            if (c0791v5M5255y.f8082k) {
                                                if (c0791v5M5255y.f8086o) {
                                                    c0791v5M5255y.f8082k = false;
                                                    zM5242F = m5242F(c0791v5M5255y, keyEvent);
                                                } else {
                                                    zM5242F = true;
                                                }
                                                if (zM5242F) {
                                                    m5240D(c0791v5M5255y, keyEvent);
                                                    z2 = true;
                                                }
                                            }
                                            z2 = false;
                                        }
                                    } else {
                                        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f8433z;
                                        actionBarOverlayLayout2.m355k();
                                        ActionMenuView actionMenuView2 = ((xd1) actionBarOverlayLayout2.f377n).f8896a.f442j;
                                        if (actionMenuView2 == null || (c0603q3 = actionMenuView2.f392C) == null || !c0603q3.m4027i()) {
                                            if (!this.f8409Y && m5242F(c0791v5M5255y, keyEvent)) {
                                                ActionBarOverlayLayout actionBarOverlayLayout3 = this.f8433z;
                                                actionBarOverlayLayout3.m355k();
                                                ActionMenuView actionMenuView3 = ((xd1) actionBarOverlayLayout3.f377n).f8896a.f442j;
                                                if (actionMenuView3 != null && (c0603q2 = actionMenuView3.f392C) != null && c0603q2.m4028l()) {
                                                    z2 = true;
                                                }
                                            }
                                            z2 = false;
                                        } else {
                                            ActionBarOverlayLayout actionBarOverlayLayout4 = this.f8433z;
                                            actionBarOverlayLayout4.m355k();
                                            ActionMenuView actionMenuView4 = ((xd1) actionBarOverlayLayout4.f377n).f8896a.f442j;
                                            if (actionMenuView4 == null || (c0603q4 = actionMenuView4.f392C) == null || !c0603q4.m4026c()) {
                                                z2 = false;
                                            } else {
                                                z2 = true;
                                            }
                                        }
                                    }
                                } else {
                                    z = c0791v5M5255y.f8084m;
                                    if (z) {
                                    }
                                    m5249r(c0791v5M5255y, true);
                                    z2 = z;
                                }
                                if (z2) {
                                    audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                    if (audioManager != null) {
                                        audioManager.playSoundEffect(0);
                                        return true;
                                    }
                                    Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                    if (m5239C()) {
                        return false;
                    }
                }
            } catch (Throwable th) {
                windowCallbackC0606q5.f6380l = false;
                throw th;
            }
        } else {
            keyCode = keyEvent.getKeyCode();
            if (keyEvent.getAction() == 0) {
                if (keyCode != 4) {
                    this.f8406V = (keyEvent.getFlags() & 128) != 0;
                    return false;
                }
                if (keyCode == 82) {
                    if (keyEvent.getRepeatCount() == 0) {
                        c0791v5M5255y2 = m5255y(0);
                        if (!c0791v5M5255y2.f8084m) {
                            m5242F(c0791v5M5255y2, keyEvent);
                            return true;
                        }
                    }
                }
                return false;
            }
            if (keyCode != 4) {
                if (keyCode == 82) {
                    if (this.f8387C == null) {
                        c0791v5M5255y = m5255y(0);
                        actionBarOverlayLayout = this.f8433z;
                        context = this.f8427t;
                        if (actionBarOverlayLayout != null) {
                            actionBarOverlayLayout.m355k();
                            toolbar = ((xd1) actionBarOverlayLayout.f377n).f8896a;
                            if (toolbar.getVisibility() == 0) {
                                z = c0791v5M5255y.f8084m;
                                if (z) {
                                }
                                m5249r(c0791v5M5255y, true);
                                z2 = z;
                            } else {
                                z = c0791v5M5255y.f8084m;
                                if (z) {
                                }
                                m5249r(c0791v5M5255y, true);
                                z2 = z;
                            }
                        } else {
                            z = c0791v5M5255y.f8084m;
                            if (z) {
                            }
                            m5249r(c0791v5M5255y, true);
                            z2 = z;
                        }
                        if (z2) {
                            audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                            if (audioManager != null) {
                                audioManager.playSoundEffect(0);
                                return true;
                            }
                            Log.w("AppCompatDelegate", "Couldn't get audio manager");
                            return true;
                        }
                    }
                }
                return false;
            }
            if (m5239C()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: u */
    public final void m5251u(int i) {
        C0791v5 c0791v5M5255y = m5255y(i);
        if (c0791v5M5255y.f8079h != null) {
            Bundle bundle = new Bundle();
            c0791v5M5255y.f8079h.m3716t(bundle);
            if (bundle.size() > 0) {
                c0791v5M5255y.f8087p = bundle;
            }
            c0791v5M5255y.f8079h.m3719w();
            c0791v5M5255y.f8079h.clear();
        }
        c0791v5M5255y.f8086o = true;
        c0791v5M5255y.f8085n = true;
        if ((i == 108 || i == 0) && this.f8433z != null) {
            C0791v5 c0791v5M5255y2 = m5255y(0);
            c0791v5M5255y2.f8082k = false;
            m5242F(c0791v5M5255y2, null);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m5252v() {
        ViewGroup viewGroup;
        if (this.f8392H) {
            return;
        }
        Context context = this.f8427t;
        int[] iArr = mz0.f5196j;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            C0270h1.m2191g("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            return;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            mo2214f(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            mo2214f(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            mo2214f(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            mo2214f(10);
        }
        this.f8401Q = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        m5253w();
        this.f8428u.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.f8402R) {
            viewGroup = this.f8400P ? (ViewGroup) layoutInflaterFrom.inflate(live.football.scorerepublic.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(live.football.scorerepublic.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f8401Q) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(live.football.scorerepublic.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f8399O = false;
            this.f8398N = false;
        } else if (this.f8398N) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(live.football.scorerepublic.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C0771um(context, typedValue.resourceId) : context).inflate(live.football.scorerepublic.R.layout.abc_screen_toolbar, (ViewGroup) null);
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) viewGroup.findViewById(live.football.scorerepublic.R.id.decor_content_parent);
            this.f8433z = actionBarOverlayLayout;
            actionBarOverlayLayout.setWindowCallback(this.f8428u.getCallback());
            if (this.f8399O) {
                this.f8433z.m354j(109);
            }
            if (this.f8396L) {
                this.f8433z.m354j(2);
            }
            if (this.f8397M) {
                this.f8433z.m354j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f8398N + ", windowActionBarOverlay: " + this.f8399O + ", android:windowIsFloating: " + this.f8401Q + ", windowActionModeOverlay: " + this.f8400P + ", windowNoTitle: " + this.f8402R + " }");
        }
        C0347j5 c0347j5 = new C0347j5(this);
        WeakHashMap weakHashMap = ai1.f194a;
        uh1.m4921c(viewGroup, c0347j5);
        if (this.f8433z == null) {
            this.f8394J = (TextView) viewGroup.findViewById(live.football.scorerepublic.R.id.title);
        }
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(live.football.scorerepublic.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f8428u.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f8428u.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new C0384k5(this));
        this.f8393I = viewGroup;
        Object obj = this.f8426s;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f8432y;
        if (!TextUtils.isEmpty(title)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f8433z;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setWindowTitle(title);
            } else {
                hj1 hj1Var = this.f8430w;
                if (hj1Var != null) {
                    xd1 xd1Var = (xd1) hj1Var.f3231e;
                    if (!xd1Var.f8902g) {
                        Toolbar toolbar = xd1Var.f8896a;
                        xd1Var.f8903h = title;
                        if ((xd1Var.f8897b & 8) != 0) {
                            toolbar.setTitle(title);
                            if (xd1Var.f8902g) {
                                ai1.m253f(toolbar.getRootView(), title);
                            }
                        }
                    }
                } else {
                    TextView textView = this.f8394J;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f8393I.findViewById(R.id.content);
        View decorView = this.f8428u.getDecorView();
        contentFrameLayout2.f411p.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.f8392H = true;
        C0791v5 c0791v5M5255y = m5255y(0);
        if (this.f8409Y || c0791v5M5255y.f8079h != null) {
            return;
        }
        m5237A(108);
    }

    /* JADX INFO: renamed from: w */
    public final void m5253w() {
        if (this.f8428u == null) {
            Object obj = this.f8426s;
            if (obj instanceof Activity) {
                m5246n(((Activity) obj).getWindow());
            }
        }
        if (this.f8428u != null) {
            return;
        }
        C0270h1.m2191g("We have not been given a Window");
    }

    /* JADX INFO: renamed from: x */
    public final AbstractC0717t5 m5254x(Context context) {
        if (this.f8415e0 == null) {
            if (oq0.f5836n == null) {
                Context applicationContext = context.getApplicationContext();
                oq0.f5836n = new oq0(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f8415e0 = new C0643r5(this, oq0.f5836n);
        }
        return this.f8415e0;
    }

    /* JADX INFO: renamed from: y */
    public final C0791v5 m5255y(int i) {
        C0791v5[] c0791v5Arr = this.f8404T;
        if (c0791v5Arr == null || c0791v5Arr.length <= i) {
            C0791v5[] c0791v5Arr2 = new C0791v5[i + 1];
            if (c0791v5Arr != null) {
                System.arraycopy(c0791v5Arr, 0, c0791v5Arr2, 0, c0791v5Arr.length);
            }
            this.f8404T = c0791v5Arr2;
            c0791v5Arr = c0791v5Arr2;
        }
        C0791v5 c0791v5 = c0791v5Arr[i];
        if (c0791v5 != null) {
            return c0791v5;
        }
        C0791v5 c0791v6 = new C0791v5();
        c0791v6.f8072a = i;
        c0791v6.f8085n = false;
        c0791v5Arr[i] = c0791v6;
        return c0791v6;
    }

    /* JADX INFO: renamed from: z */
    public final void m5256z() {
        m5252v();
        if (this.f8398N && this.f8430w == null) {
            Object obj = this.f8426s;
            if (obj instanceof Activity) {
                this.f8430w = new hj1((Activity) obj, this.f8399O);
            } else if (obj instanceof Dialog) {
                this.f8430w = new hj1((Dialog) obj);
            }
            hj1 hj1Var = this.f8430w;
            if (hj1Var != null) {
                hj1Var.m2278d(this.f8420j0);
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
