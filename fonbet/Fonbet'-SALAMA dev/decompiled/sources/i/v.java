package i;

import A1.K0;
import A1.x0;
import F.AbstractC0213i;
import P.InterfaceC0355k;
import P.U;
import P.b0;
import a.AbstractC0603a;
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
import android.os.Handler;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.LongSparseArray;
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
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.AppCompatToggleButton;
import androidx.appcompat.widget.C0634e;
import androidx.appcompat.widget.C0644j;
import androidx.appcompat.widget.C0665u;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.InterfaceC0629b0;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.j1;
import androidx.appcompat.widget.o1;
import androidx.appcompat.widget.q1;
import androidx.lifecycle.C0747v;
import androidx.lifecycle.EnumC0740n;
import androidx.lifecycle.InterfaceC0745t;
import e3.C1023h;
import h.AbstractC1174a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import l.AbstractC1364b;
import l.C1367e;
import l.C1368f;
import l.C1372j;
import l.InterfaceC1363a;
import m.C1422f;
import m.C1423g;
import n1.C1450e;
import w1.C1726n0;

/* loaded from: classes.dex */
public final class v extends m implements m.i, LayoutInflater.Factory2 {

    /* renamed from: A, reason: collision with root package name */
    public final Object f13748A;

    /* renamed from: B, reason: collision with root package name */
    public final Context f13749B;

    /* renamed from: C, reason: collision with root package name */
    public Window f13750C;

    /* renamed from: D, reason: collision with root package name */
    public r f13751D;

    /* renamed from: E, reason: collision with root package name */
    public final Object f13752E;

    /* renamed from: F, reason: collision with root package name */
    public AbstractC1223a f13753F;

    /* renamed from: G, reason: collision with root package name */
    public C1372j f13754G;

    /* renamed from: H, reason: collision with root package name */
    public CharSequence f13755H;

    /* renamed from: I, reason: collision with root package name */
    public InterfaceC0629b0 f13756I;

    /* renamed from: J, reason: collision with root package name */
    public C1023h f13757J;

    /* renamed from: K, reason: collision with root package name */
    public C1450e f13758K;

    /* renamed from: L, reason: collision with root package name */
    public AbstractC1364b f13759L;

    /* renamed from: M, reason: collision with root package name */
    public ActionBarContextView f13760M;

    /* renamed from: N, reason: collision with root package name */
    public PopupWindow f13761N;

    /* renamed from: O, reason: collision with root package name */
    public n f13762O;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f13764Q;

    /* renamed from: R, reason: collision with root package name */
    public ViewGroup f13765R;

    /* renamed from: S, reason: collision with root package name */
    public TextView f13766S;

    /* renamed from: T, reason: collision with root package name */
    public View f13767T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f13768U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f13769V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f13770W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f13771X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f13772Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f13773Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f13774a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f13775b0;
    public u[] c0;

    /* renamed from: d0, reason: collision with root package name */
    public u f13776d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f13777e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f13778f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f13779g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f13780h0;

    /* renamed from: i0, reason: collision with root package name */
    public Configuration f13781i0;

    /* renamed from: j0, reason: collision with root package name */
    public final int f13782j0;

    /* renamed from: k0, reason: collision with root package name */
    public int f13783k0;

    /* renamed from: l0, reason: collision with root package name */
    public int f13784l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f13785m0;

    /* renamed from: n0, reason: collision with root package name */
    public s f13786n0;

    /* renamed from: o0, reason: collision with root package name */
    public s f13787o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f13788p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f13789q0;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f13791s0;

    /* renamed from: t0, reason: collision with root package name */
    public Rect f13792t0;

    /* renamed from: u0, reason: collision with root package name */
    public Rect f13793u0;

    /* renamed from: v0, reason: collision with root package name */
    public y f13794v0;

    /* renamed from: w0, reason: collision with root package name */
    public OnBackInvokedDispatcher f13795w0;

    /* renamed from: x0, reason: collision with root package name */
    public OnBackInvokedCallback f13796x0;

    /* renamed from: y0, reason: collision with root package name */
    public static final r.l f13746y0 = new r.l();

    /* renamed from: z0, reason: collision with root package name */
    public static final int[] f13747z0 = {R.attr.windowBackground};

    /* renamed from: A0, reason: collision with root package name */
    public static final boolean f13744A0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: B0, reason: collision with root package name */
    public static final boolean f13745B0 = true;

    /* renamed from: P, reason: collision with root package name */
    public b0 f13763P = null;

    /* renamed from: r0, reason: collision with root package name */
    public final n f13790r0 = new n(this, 0);

    public v(Context context, Window window, InterfaceC1232j interfaceC1232j, Object obj) {
        AbstractActivityC1231i abstractActivityC1231i;
        this.f13782j0 = -100;
        this.f13749B = context;
        this.f13752E = interfaceC1232j;
        this.f13748A = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof AbstractActivityC1231i)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    abstractActivityC1231i = (AbstractActivityC1231i) context;
                    break;
                }
            }
            abstractActivityC1231i = null;
            if (abstractActivityC1231i != null) {
                this.f13782j0 = ((v) abstractActivityC1231i.getDelegate()).f13782j0;
            }
        }
        if (this.f13782j0 == -100) {
            r.l lVar = f13746y0;
            Integer num = (Integer) lVar.getOrDefault(this.f13748A.getClass().getName(), null);
            if (num != null) {
                this.f13782j0 = num.intValue();
                lVar.remove(this.f13748A.getClass().getName());
            }
        }
        if (window != null) {
            p(window);
        }
        C0665u.c();
    }

    public static L.j q(Context context) {
        L.j jVar;
        L.j jVar2;
        if (Build.VERSION.SDK_INT >= 33 || (jVar = m.f13708c) == null) {
            return null;
        }
        L.j b7 = p.b(context.getApplicationContext().getResources().getConfiguration());
        L.k kVar = jVar.f4186a;
        if (kVar.f4187a.isEmpty()) {
            jVar2 = L.j.f4185b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i7 = 0;
            while (i7 < b7.f4186a.f4187a.size() + kVar.f4187a.size()) {
                Locale locale = i7 < kVar.f4187a.size() ? kVar.f4187a.get(i7) : b7.f4186a.f4187a.get(i7 - kVar.f4187a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i7++;
            }
            jVar2 = new L.j(new L.k(L.i.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return jVar2.f4186a.f4187a.isEmpty() ? b7 : jVar2;
    }

    public static Configuration u(Context context, int i7, L.j jVar, Configuration configuration, boolean z4) {
        int i8 = i7 != 1 ? i7 != 2 ? z4 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i8 | (configuration2.uiMode & (-49));
        if (jVar != null) {
            p.d(configuration2, jVar);
        }
        return configuration2;
    }

    public final u A(int i7) {
        u[] uVarArr = this.c0;
        if (uVarArr == null || uVarArr.length <= i7) {
            u[] uVarArr2 = new u[i7 + 1];
            if (uVarArr != null) {
                System.arraycopy(uVarArr, 0, uVarArr2, 0, uVarArr.length);
            }
            this.c0 = uVarArr2;
            uVarArr = uVarArr2;
        }
        u uVar = uVarArr[i7];
        if (uVar != null) {
            return uVar;
        }
        u uVar2 = new u();
        uVar2.f13729a = i7;
        uVar2.f13741n = false;
        uVarArr[i7] = uVar2;
        return uVar2;
    }

    public final void B() {
        x();
        if (this.f13770W && this.f13753F == null) {
            Object obj = this.f13748A;
            if (obj instanceof Activity) {
                this.f13753F = new C1222I((Activity) obj, this.f13771X);
            } else if (obj instanceof Dialog) {
                this.f13753F = new C1222I((Dialog) obj);
            }
            AbstractC1223a abstractC1223a = this.f13753F;
            if (abstractC1223a != null) {
                abstractC1223a.o(this.f13791s0);
            }
        }
    }

    public final void C(int i7) {
        this.f13789q0 = (1 << i7) | this.f13789q0;
        if (this.f13788p0) {
            return;
        }
        View decorView = this.f13750C.getDecorView();
        n nVar = this.f13790r0;
        WeakHashMap weakHashMap = U.f5037a;
        decorView.postOnAnimation(nVar);
        this.f13788p0 = true;
    }

    public final int D(int i7, Context context) {
        if (i7 == -100) {
            return -1;
        }
        if (i7 == -1) {
            return i7;
        }
        if (i7 == 0) {
            if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                return -1;
            }
            return z(context).j();
        }
        if (i7 == 1 || i7 == 2) {
            return i7;
        }
        if (i7 != 3) {
            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
        }
        if (this.f13787o0 == null) {
            this.f13787o0 = new s(this, context);
        }
        return this.f13787o0.j();
    }

    public final boolean E() {
        boolean z4 = this.f13777e0;
        this.f13777e0 = false;
        u A7 = A(0);
        if (A7.f13740m) {
            if (!z4) {
                t(A7, true);
            }
            return true;
        }
        AbstractC1364b abstractC1364b = this.f13759L;
        if (abstractC1364b != null) {
            abstractC1364b.a();
            return true;
        }
        B();
        AbstractC1223a abstractC1223a = this.f13753F;
        return abstractC1223a != null && abstractC1223a.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0174, code lost:
    
        if (r3.f15114f.getCount() > 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0154, code lost:
    
        if (r3 != null) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F(u uVar, KeyEvent keyEvent) {
        int i7;
        ViewGroup.LayoutParams layoutParams;
        if (uVar.f13740m || this.f13780h0) {
            return;
        }
        int i8 = uVar.f13729a;
        Context context = this.f13749B;
        if (i8 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.f13750C.getCallback();
        if (callback != null && !callback.onMenuOpened(i8, uVar.f13736h)) {
            t(uVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || !H(uVar, keyEvent)) {
            return;
        }
        t tVar = uVar.f13733e;
        if (tVar == null || uVar.f13741n) {
            if (tVar == null) {
                B();
                AbstractC1223a abstractC1223a = this.f13753F;
                Context e7 = abstractC1223a != null ? abstractC1223a.e() : null;
                if (e7 != null) {
                    context = e7;
                }
                TypedValue typedValue = new TypedValue();
                Resources.Theme newTheme = context.getResources().newTheme();
                newTheme.setTo(context.getTheme());
                newTheme.resolveAttribute(com.salamadev.khotabaljomo3a.kichkabdelhamid.R.attr.actionBarPopupTheme, typedValue, true);
                int i9 = typedValue.resourceId;
                if (i9 != 0) {
                    newTheme.applyStyle(i9, true);
                }
                newTheme.resolveAttribute(com.salamadev.khotabaljomo3a.kichkabdelhamid.R.attr.panelMenuListTheme, typedValue, true);
                int i10 = typedValue.resourceId;
                if (i10 != 0) {
                    newTheme.applyStyle(i10, true);
                } else {
                    newTheme.applyStyle(com.salamadev.khotabaljomo3a.kichkabdelhamid.R.style.Theme_AppCompat_CompactMenu, true);
                }
                C1367e c1367e = new C1367e(context, 0);
                c1367e.getTheme().setTo(newTheme);
                uVar.j = c1367e;
                TypedArray obtainStyledAttributes = c1367e.obtainStyledAttributes(AbstractC1174a.f13332k);
                uVar.f13730b = obtainStyledAttributes.getResourceId(86, 0);
                uVar.f13732d = obtainStyledAttributes.getResourceId(1, 0);
                obtainStyledAttributes.recycle();
                uVar.f13733e = new t(this, uVar.j);
                uVar.f13731c = 81;
            } else if (uVar.f13741n && tVar.getChildCount() > 0) {
                uVar.f13733e.removeAllViews();
            }
            View view = uVar.f13735g;
            if (view == null) {
                if (uVar.f13736h != null) {
                    if (this.f13758K == null) {
                        this.f13758K = new C1450e(this, 14);
                    }
                    C1450e c1450e = this.f13758K;
                    if (uVar.f13737i == null) {
                        C1423g c1423g = new C1423g(uVar.j);
                        uVar.f13737i = c1423g;
                        c1423g.f15113e = c1450e;
                        m.k kVar = uVar.f13736h;
                        kVar.b(c1423g, kVar.f15138a);
                    }
                    C1423g c1423g2 = uVar.f13737i;
                    t tVar2 = uVar.f13733e;
                    if (c1423g2.f15112d == null) {
                        c1423g2.f15112d = (ExpandedMenuView) c1423g2.f15110b.inflate(com.salamadev.khotabaljomo3a.kichkabdelhamid.R.layout.abc_expanded_menu_layout, (ViewGroup) tVar2, false);
                        if (c1423g2.f15114f == null) {
                            c1423g2.f15114f = new C1422f(c1423g2);
                        }
                        c1423g2.f15112d.setAdapter((ListAdapter) c1423g2.f15114f);
                        c1423g2.f15112d.setOnItemClickListener(c1423g2);
                    }
                    ExpandedMenuView expandedMenuView = c1423g2.f15112d;
                    uVar.f13734f = expandedMenuView;
                }
                uVar.f13741n = true;
                return;
            }
            uVar.f13734f = view;
            if (uVar.f13734f != null) {
                if (uVar.f13735g == null) {
                    C1423g c1423g3 = uVar.f13737i;
                    if (c1423g3.f15114f == null) {
                        c1423g3.f15114f = new C1422f(c1423g3);
                    }
                }
                ViewGroup.LayoutParams layoutParams2 = uVar.f13734f.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                uVar.f13733e.setBackgroundResource(uVar.f13730b);
                ViewParent parent = uVar.f13734f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(uVar.f13734f);
                }
                uVar.f13733e.addView(uVar.f13734f, layoutParams2);
                if (!uVar.f13734f.hasFocus()) {
                    uVar.f13734f.requestFocus();
                }
            }
            uVar.f13741n = true;
            return;
        }
        View view2 = uVar.f13735g;
        if (view2 != null && (layoutParams = view2.getLayoutParams()) != null && layoutParams.width == -1) {
            i7 = -1;
            uVar.f13739l = false;
            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i7, -2, 0, 0, 1002, 8519680, -3);
            layoutParams3.gravity = uVar.f13731c;
            layoutParams3.windowAnimations = uVar.f13732d;
            windowManager.addView(uVar.f13733e, layoutParams3);
            uVar.f13740m = true;
            if (i8 != 0) {
                J();
                return;
            }
            return;
        }
        i7 = -2;
        uVar.f13739l = false;
        WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i7, -2, 0, 0, 1002, 8519680, -3);
        layoutParams32.gravity = uVar.f13731c;
        layoutParams32.windowAnimations = uVar.f13732d;
        windowManager.addView(uVar.f13733e, layoutParams32);
        uVar.f13740m = true;
        if (i8 != 0) {
        }
    }

    public final boolean G(u uVar, int i7, KeyEvent keyEvent) {
        m.k kVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((uVar.f13738k || H(uVar, keyEvent)) && (kVar = uVar.f13736h) != null) {
            return kVar.performShortcut(i7, keyEvent, 1);
        }
        return false;
    }

    public final boolean H(u uVar, KeyEvent keyEvent) {
        InterfaceC0629b0 interfaceC0629b0;
        InterfaceC0629b0 interfaceC0629b02;
        Resources.Theme theme;
        InterfaceC0629b0 interfaceC0629b03;
        InterfaceC0629b0 interfaceC0629b04;
        if (this.f13780h0) {
            return false;
        }
        if (uVar.f13738k) {
            return true;
        }
        u uVar2 = this.f13776d0;
        if (uVar2 != null && uVar2 != uVar) {
            t(uVar2, false);
        }
        Window.Callback callback = this.f13750C.getCallback();
        int i7 = uVar.f13729a;
        if (callback != null) {
            uVar.f13735g = callback.onCreatePanelView(i7);
        }
        boolean z4 = i7 == 0 || i7 == 108;
        if (z4 && (interfaceC0629b04 = this.f13756I) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0629b04;
            actionBarOverlayLayout.e();
            ((j1) actionBarOverlayLayout.f8230e).f8672l = true;
        }
        if (uVar.f13735g == null && (!z4 || !(this.f13753F instanceof C1218E))) {
            m.k kVar = uVar.f13736h;
            if (kVar == null || uVar.f13742o) {
                if (kVar == null) {
                    Context context = this.f13749B;
                    if ((i7 == 0 || i7 == 108) && this.f13756I != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(com.salamadev.khotabaljomo3a.kichkabdelhamid.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(com.salamadev.khotabaljomo3a.kichkabdelhamid.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(com.salamadev.khotabaljomo3a.kichkabdelhamid.R.attr.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            C1367e c1367e = new C1367e(context, 0);
                            c1367e.getTheme().setTo(theme);
                            context = c1367e;
                        }
                    }
                    m.k kVar2 = new m.k(context);
                    kVar2.f15142e = this;
                    m.k kVar3 = uVar.f13736h;
                    if (kVar2 != kVar3) {
                        if (kVar3 != null) {
                            kVar3.r(uVar.f13737i);
                        }
                        uVar.f13736h = kVar2;
                        C1423g c1423g = uVar.f13737i;
                        if (c1423g != null) {
                            kVar2.b(c1423g, kVar2.f15138a);
                        }
                    }
                    if (uVar.f13736h == null) {
                        return false;
                    }
                }
                if (z4 && (interfaceC0629b02 = this.f13756I) != null) {
                    if (this.f13757J == null) {
                        this.f13757J = new C1023h(this);
                    }
                    ((ActionBarOverlayLayout) interfaceC0629b02).f(uVar.f13736h, this.f13757J);
                }
                uVar.f13736h.w();
                if (!callback.onCreatePanelMenu(i7, uVar.f13736h)) {
                    m.k kVar4 = uVar.f13736h;
                    if (kVar4 != null) {
                        if (kVar4 != null) {
                            kVar4.r(uVar.f13737i);
                        }
                        uVar.f13736h = null;
                    }
                    if (z4 && (interfaceC0629b0 = this.f13756I) != null) {
                        ((ActionBarOverlayLayout) interfaceC0629b0).f(null, this.f13757J);
                    }
                    return false;
                }
                uVar.f13742o = false;
            }
            uVar.f13736h.w();
            Bundle bundle = uVar.f13743p;
            if (bundle != null) {
                uVar.f13736h.s(bundle);
                uVar.f13743p = null;
            }
            if (!callback.onPreparePanel(0, uVar.f13735g, uVar.f13736h)) {
                if (z4 && (interfaceC0629b03 = this.f13756I) != null) {
                    ((ActionBarOverlayLayout) interfaceC0629b03).f(null, this.f13757J);
                }
                uVar.f13736h.v();
                return false;
            }
            uVar.f13736h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            uVar.f13736h.v();
        }
        uVar.f13738k = true;
        uVar.f13739l = false;
        this.f13776d0 = uVar;
        return true;
    }

    public final void I() {
        if (this.f13764Q) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void J() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z4 = false;
            if (this.f13795w0 != null && (A(0).f13740m || this.f13759L != null)) {
                z4 = true;
            }
            if (z4 && this.f13796x0 == null) {
                this.f13796x0 = q.b(this.f13795w0, this);
            } else {
                if (z4 || (onBackInvokedCallback = this.f13796x0) == null) {
                    return;
                }
                q.c(this.f13795w0, onBackInvokedCallback);
            }
        }
    }

    @Override // i.m
    public final void a() {
        LayoutInflater from = LayoutInflater.from(this.f13749B);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            if (from.getFactory2() instanceof v) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r6.k() != false) goto L20;
     */
    @Override // m.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(m.k kVar) {
        ActionMenuView actionMenuView;
        C0644j c0644j;
        InterfaceC0629b0 interfaceC0629b0 = this.f13756I;
        if (interfaceC0629b0 != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0629b0;
            actionBarOverlayLayout.e();
            Toolbar toolbar = ((j1) actionBarOverlayLayout.f8230e).f8662a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f8532a) != null && actionMenuView.f8238J) {
                if (ViewConfiguration.get(this.f13749B).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f13756I;
                    actionBarOverlayLayout2.e();
                    ActionMenuView actionMenuView2 = ((j1) actionBarOverlayLayout2.f8230e).f8662a.f8532a;
                    if (actionMenuView2 != null) {
                        C0644j c0644j2 = actionMenuView2.f8239K;
                        if (c0644j2 != null) {
                            if (c0644j2.f8648L == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.f13750C.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f13756I;
                actionBarOverlayLayout3.e();
                if (((j1) actionBarOverlayLayout3.f8230e).f8662a.p()) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f13756I;
                    actionBarOverlayLayout4.e();
                    ActionMenuView actionMenuView3 = ((j1) actionBarOverlayLayout4.f8230e).f8662a.f8532a;
                    if (actionMenuView3 != null && (c0644j = actionMenuView3.f8239K) != null) {
                        c0644j.h();
                    }
                    if (this.f13780h0) {
                        return;
                    }
                    callback.onPanelClosed(108, A(0).f13736h);
                    return;
                }
                if (callback == null || this.f13780h0) {
                    return;
                }
                if (this.f13788p0 && (1 & this.f13789q0) != 0) {
                    View decorView = this.f13750C.getDecorView();
                    n nVar = this.f13790r0;
                    decorView.removeCallbacks(nVar);
                    nVar.run();
                }
                u A7 = A(0);
                m.k kVar2 = A7.f13736h;
                if (kVar2 == null || A7.f13742o || !callback.onPreparePanel(0, A7.f13735g, kVar2)) {
                    return;
                }
                callback.onMenuOpened(108, A7.f13736h);
                ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) this.f13756I;
                actionBarOverlayLayout5.e();
                ((j1) actionBarOverlayLayout5.f8230e).f8662a.v();
                return;
            }
        }
        u A8 = A(0);
        A8.f13741n = true;
        t(A8, false);
        F(A8, null);
    }

    @Override // i.m
    public final void c() {
        if (this.f13753F != null) {
            B();
            if (this.f13753F.g()) {
                return;
            }
            C(0);
        }
    }

    @Override // m.i
    public final boolean e(m.k kVar, MenuItem menuItem) {
        u uVar;
        Window.Callback callback = this.f13750C.getCallback();
        if (callback != null && !this.f13780h0) {
            m.k k7 = kVar.k();
            u[] uVarArr = this.c0;
            int length = uVarArr != null ? uVarArr.length : 0;
            int i7 = 0;
            while (true) {
                if (i7 < length) {
                    uVar = uVarArr[i7];
                    if (uVar != null && uVar.f13736h == k7) {
                        break;
                    }
                    i7++;
                } else {
                    uVar = null;
                    break;
                }
            }
            if (uVar != null) {
                return callback.onMenuItemSelected(uVar.f13729a, menuItem);
            }
        }
        return false;
    }

    @Override // i.m
    public final void f() {
        String str;
        this.f13778f0 = true;
        o(false, true);
        y();
        Object obj = this.f13748A;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = AbstractC0213i.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e7) {
                    throw new IllegalArgumentException(e7);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                AbstractC1223a abstractC1223a = this.f13753F;
                if (abstractC1223a == null) {
                    this.f13791s0 = true;
                } else {
                    abstractC1223a.o(true);
                }
            }
            synchronized (m.f13713y) {
                m.h(this);
                m.f13712x.add(new WeakReference(this));
            }
        }
        this.f13781i0 = new Configuration(this.f13749B.getResources().getConfiguration());
        this.f13779g0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // i.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g() {
        AbstractC1223a abstractC1223a;
        s sVar;
        s sVar2;
        if (this.f13748A instanceof Activity) {
            synchronized (m.f13713y) {
                m.h(this);
            }
        }
        if (this.f13788p0) {
            this.f13750C.getDecorView().removeCallbacks(this.f13790r0);
        }
        this.f13780h0 = true;
        if (this.f13782j0 != -100) {
            Object obj = this.f13748A;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f13746y0.put(this.f13748A.getClass().getName(), Integer.valueOf(this.f13782j0));
                abstractC1223a = this.f13753F;
                if (abstractC1223a != null) {
                    abstractC1223a.j();
                }
                sVar = this.f13786n0;
                if (sVar != null) {
                    sVar.f();
                }
                sVar2 = this.f13787o0;
                if (sVar2 == null) {
                    sVar2.f();
                    return;
                }
                return;
            }
        }
        f13746y0.remove(this.f13748A.getClass().getName());
        abstractC1223a = this.f13753F;
        if (abstractC1223a != null) {
        }
        sVar = this.f13786n0;
        if (sVar != null) {
        }
        sVar2 = this.f13787o0;
        if (sVar2 == null) {
        }
    }

    @Override // i.m
    public final boolean i(int i7) {
        if (i7 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i7 = 108;
        } else if (i7 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i7 = 109;
        }
        if (this.f13774a0 && i7 == 108) {
            return false;
        }
        if (this.f13770W && i7 == 1) {
            this.f13770W = false;
        }
        if (i7 == 1) {
            I();
            this.f13774a0 = true;
            return true;
        }
        if (i7 == 2) {
            I();
            this.f13768U = true;
            return true;
        }
        if (i7 == 5) {
            I();
            this.f13769V = true;
            return true;
        }
        if (i7 == 10) {
            I();
            this.f13772Y = true;
            return true;
        }
        if (i7 == 108) {
            I();
            this.f13770W = true;
            return true;
        }
        if (i7 != 109) {
            return this.f13750C.requestFeature(i7);
        }
        I();
        this.f13771X = true;
        return true;
    }

    @Override // i.m
    public final void j(int i7) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.f13765R.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f13749B).inflate(i7, viewGroup);
        this.f13751D.a(this.f13750C.getCallback());
    }

    @Override // i.m
    public final void k(View view) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.f13765R.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f13751D.a(this.f13750C.getCallback());
    }

    @Override // i.m
    public final void l(View view, ViewGroup.LayoutParams layoutParams) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.f13765R.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f13751D.a(this.f13750C.getCallback());
    }

    @Override // i.m
    public final void m(CharSequence charSequence) {
        this.f13755H = charSequence;
        InterfaceC0629b0 interfaceC0629b0 = this.f13756I;
        if (interfaceC0629b0 != null) {
            interfaceC0629b0.setWindowTitle(charSequence);
            return;
        }
        AbstractC1223a abstractC1223a = this.f13753F;
        if (abstractC1223a != null) {
            abstractC1223a.s(charSequence);
            return;
        }
        TextView textView = this.f13766S;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0173  */
    /* JADX WARN: Type inference failed for: r3v1, types: [i.j, java.lang.Object] */
    @Override // i.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC1364b n(InterfaceC1363a interfaceC1363a) {
        AbstractC1364b onWindowStartingSupportActionMode;
        boolean z4;
        ViewGroup viewGroup;
        AbstractC1364b abstractC1364b;
        boolean z7 = false;
        int i7 = 1;
        if (interfaceC1363a == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        AbstractC1364b abstractC1364b2 = this.f13759L;
        if (abstractC1364b2 != null) {
            abstractC1364b2.a();
        }
        com.google.android.gms.common.internal.w wVar = new com.google.android.gms.common.internal.w(6, this, interfaceC1363a, z7);
        B();
        AbstractC1223a abstractC1223a = this.f13753F;
        ?? r32 = this.f13752E;
        if (abstractC1223a != null) {
            AbstractC1364b u4 = abstractC1223a.u(wVar);
            this.f13759L = u4;
            if (u4 != null) {
                r32.onSupportActionModeStarted(u4);
            }
        }
        if (this.f13759L == null) {
            b0 b0Var = this.f13763P;
            if (b0Var != null) {
                b0Var.b();
            }
            AbstractC1364b abstractC1364b3 = this.f13759L;
            if (abstractC1364b3 != null) {
                abstractC1364b3.a();
            }
            if (!this.f13780h0) {
                try {
                    onWindowStartingSupportActionMode = r32.onWindowStartingSupportActionMode(wVar);
                } catch (AbstractMethodError unused) {
                }
                if (onWindowStartingSupportActionMode == null) {
                    this.f13759L = onWindowStartingSupportActionMode;
                } else {
                    if (this.f13760M == null) {
                        boolean z8 = this.f13773Z;
                        Context context = this.f13749B;
                        if (z8) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(com.salamadev.khotabaljomo3a.kichkabdelhamid.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                Resources.Theme newTheme = context.getResources().newTheme();
                                newTheme.setTo(theme);
                                newTheme.applyStyle(typedValue.resourceId, true);
                                C1367e c1367e = new C1367e(context, 0);
                                c1367e.getTheme().setTo(newTheme);
                                context = c1367e;
                            }
                            this.f13760M = new ActionBarContextView(context, null);
                            PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, com.salamadev.khotabaljomo3a.kichkabdelhamid.R.attr.actionModePopupWindowStyle);
                            this.f13761N = popupWindow;
                            V.k.d(popupWindow, 2);
                            this.f13761N.setContentView(this.f13760M);
                            this.f13761N.setWidth(-1);
                            context.getTheme().resolveAttribute(com.salamadev.khotabaljomo3a.kichkabdelhamid.R.attr.actionBarSize, typedValue, true);
                            this.f13760M.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                            this.f13761N.setHeight(-2);
                            this.f13762O = new n(this, i7);
                        } else {
                            ViewStubCompat viewStubCompat = (ViewStubCompat) this.f13765R.findViewById(com.salamadev.khotabaljomo3a.kichkabdelhamid.R.id.action_mode_bar_stub);
                            if (viewStubCompat != null) {
                                B();
                                AbstractC1223a abstractC1223a2 = this.f13753F;
                                Context e7 = abstractC1223a2 != null ? abstractC1223a2.e() : null;
                                if (e7 != null) {
                                    context = e7;
                                }
                                viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                                this.f13760M = (ActionBarContextView) viewStubCompat.a();
                            }
                        }
                    }
                    if (this.f13760M != null) {
                        b0 b0Var2 = this.f13763P;
                        if (b0Var2 != null) {
                            b0Var2.b();
                        }
                        this.f13760M.e();
                        Context context2 = this.f13760M.getContext();
                        ActionBarContextView actionBarContextView = this.f13760M;
                        C1368f c1368f = new C1368f();
                        c1368f.f14804c = context2;
                        c1368f.f14805d = actionBarContextView;
                        c1368f.f14806e = wVar;
                        m.k kVar = new m.k(actionBarContextView.getContext());
                        kVar.f15124C = 1;
                        c1368f.f14809y = kVar;
                        kVar.f15142e = c1368f;
                        if (((InterfaceC1363a) wVar.f11335b).e(c1368f, kVar)) {
                            c1368f.i();
                            this.f13760M.c(c1368f);
                            this.f13759L = c1368f;
                            if (this.f13764Q && (viewGroup = this.f13765R) != null) {
                                WeakHashMap weakHashMap = U.f5037a;
                                if (viewGroup.isLaidOut()) {
                                    z4 = true;
                                    if (z4) {
                                        this.f13760M.setAlpha(1.0f);
                                        this.f13760M.setVisibility(0);
                                        if (this.f13760M.getParent() instanceof View) {
                                            View view = (View) this.f13760M.getParent();
                                            WeakHashMap weakHashMap2 = U.f5037a;
                                            P.G.c(view);
                                        }
                                    } else {
                                        this.f13760M.setAlpha(0.0f);
                                        b0 a2 = U.a(this.f13760M);
                                        a2.a(1.0f);
                                        this.f13763P = a2;
                                        a2.d(new o(this, i7));
                                    }
                                    if (this.f13761N != null) {
                                        this.f13750C.getDecorView().post(this.f13762O);
                                    }
                                }
                            }
                            z4 = false;
                            if (z4) {
                            }
                            if (this.f13761N != null) {
                            }
                        } else {
                            this.f13759L = null;
                        }
                    }
                }
                abstractC1364b = this.f13759L;
                if (abstractC1364b != null) {
                    r32.onSupportActionModeStarted(abstractC1364b);
                }
                J();
                this.f13759L = this.f13759L;
            }
            onWindowStartingSupportActionMode = null;
            if (onWindowStartingSupportActionMode == null) {
            }
            abstractC1364b = this.f13759L;
            if (abstractC1364b != null) {
            }
            J();
            this.f13759L = this.f13759L;
        }
        J();
        return this.f13759L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0237 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0186  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean o(boolean z4, boolean z7) {
        int i7;
        Configuration configuration;
        L.j b7;
        int i8;
        boolean z8;
        boolean z9;
        boolean z10;
        Object obj;
        Object obj2;
        Activity activity;
        int i9 = 3;
        if (this.f13780h0) {
            return false;
        }
        int i10 = this.f13782j0;
        if (i10 == -100) {
            i10 = m.f13707b;
        }
        int i11 = i10;
        Context context = this.f13749B;
        int D7 = D(i11, context);
        int i12 = Build.VERSION.SDK_INT;
        LongSparseArray longSparseArray = null;
        L.j q7 = i12 < 33 ? q(context) : null;
        if (!z7 && q7 != null) {
            q7 = p.b(context.getResources().getConfiguration());
        }
        Configuration u4 = u(context, D7, q7, null, false);
        boolean z11 = this.f13785m0;
        Object obj3 = this.f13748A;
        if (!z11 && (obj3 instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i7 = 0;
                configuration = this.f13781i0;
                if (configuration == null) {
                    configuration = context.getResources().getConfiguration();
                }
                int i13 = configuration.uiMode & 48;
                int i14 = u4.uiMode & 48;
                L.j b8 = p.b(configuration);
                b7 = q7 != null ? null : p.b(u4);
                i8 = i13 == i14 ? 512 : 0;
                if (b7 != null && !b8.equals(b7)) {
                    i8 |= 8196;
                }
                if (((~i7) & i8) != 0 && z4 && this.f13778f0 && ((f13744A0 || this.f13779g0) && (obj3 instanceof Activity))) {
                    activity = (Activity) obj3;
                    if (!activity.isChild()) {
                        if (Build.VERSION.SDK_INT >= 28) {
                            activity.recreate();
                        } else {
                            new Handler(activity.getMainLooper()).post(new K0(activity, i9));
                        }
                        z8 = true;
                        if (!z8 || i8 == 0) {
                            z9 = z8;
                        } else {
                            boolean z12 = (i7 & i8) == i8;
                            Resources resources = context.getResources();
                            Configuration configuration2 = new Configuration(resources.getConfiguration());
                            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i14;
                            if (b7 != null) {
                                p.d(configuration2, b7);
                            }
                            resources.updateConfiguration(configuration2, null);
                            int i15 = Build.VERSION.SDK_INT;
                            if (i15 < 26 && i15 < 28) {
                                if (!Q0.a.f5746l) {
                                    try {
                                        Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                                        Q0.a.f5745k = declaredField;
                                        declaredField.setAccessible(true);
                                    } catch (NoSuchFieldException e7) {
                                        Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e7);
                                    }
                                    Q0.a.f5746l = true;
                                }
                                Field field = Q0.a.f5745k;
                                if (field != null) {
                                    try {
                                        obj = field.get(resources);
                                    } catch (IllegalAccessException e8) {
                                        Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e8);
                                        obj = null;
                                    }
                                    if (obj != null) {
                                        if (!Q0.a.f5741f) {
                                            try {
                                                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                                Q0.a.f5740e = declaredField2;
                                                declaredField2.setAccessible(true);
                                            } catch (NoSuchFieldException e9) {
                                                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e9);
                                            }
                                            Q0.a.f5741f = true;
                                        }
                                        Field field2 = Q0.a.f5740e;
                                        if (field2 != null) {
                                            try {
                                                obj2 = field2.get(obj);
                                            } catch (IllegalAccessException e10) {
                                                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e10);
                                            }
                                            if (obj2 != null) {
                                                if (!Q0.a.f5743h) {
                                                    try {
                                                        Q0.a.f5742g = Class.forName("android.content.res.ThemedResourceCache");
                                                    } catch (ClassNotFoundException e11) {
                                                        Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e11);
                                                    }
                                                    Q0.a.f5743h = true;
                                                }
                                                Class cls = Q0.a.f5742g;
                                                if (cls != null) {
                                                    if (!Q0.a.j) {
                                                        try {
                                                            Field declaredField3 = cls.getDeclaredField("mUnthemedEntries");
                                                            Q0.a.f5744i = declaredField3;
                                                            declaredField3.setAccessible(true);
                                                        } catch (NoSuchFieldException e12) {
                                                            Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e12);
                                                        }
                                                        Q0.a.j = true;
                                                    }
                                                    Field field3 = Q0.a.f5744i;
                                                    if (field3 != null) {
                                                        try {
                                                            longSparseArray = (LongSparseArray) field3.get(obj2);
                                                        } catch (IllegalAccessException e13) {
                                                            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e13);
                                                        }
                                                        if (longSparseArray != null) {
                                                            AbstractC1217D.a(longSparseArray);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        obj2 = null;
                                        if (obj2 != null) {
                                        }
                                    }
                                }
                            }
                            int i16 = this.f13783k0;
                            if (i16 != 0) {
                                context.setTheme(i16);
                                z10 = true;
                                context.getTheme().applyStyle(this.f13783k0, true);
                            } else {
                                z10 = true;
                            }
                            if (z12 && (obj3 instanceof Activity)) {
                                Activity activity2 = (Activity) obj3;
                                if (activity2 instanceof InterfaceC0745t) {
                                    if (((C0747v) ((InterfaceC0745t) activity2).getLifecycle()).f9637c.compareTo(EnumC0740n.f9628c) >= 0) {
                                        activity2.onConfigurationChanged(configuration2);
                                    }
                                } else if (this.f13779g0 && !this.f13780h0) {
                                    activity2.onConfigurationChanged(configuration2);
                                }
                            }
                            z9 = z10;
                        }
                        if (z9 && (obj3 instanceof AbstractActivityC1231i)) {
                            if ((i8 & 512) != 0) {
                                ((AbstractActivityC1231i) obj3).onNightModeChanged(D7);
                            }
                            if ((i8 & 4) != 0) {
                                ((AbstractActivityC1231i) obj3).onLocalesChanged(q7);
                            }
                        }
                        if (z9 && b7 != null) {
                            p.c(p.b(context.getResources().getConfiguration()));
                        }
                        if (i11 == 0) {
                            z(context).t();
                        } else {
                            s sVar = this.f13786n0;
                            if (sVar != null) {
                                sVar.f();
                            }
                        }
                        if (i11 == 3) {
                            if (this.f13787o0 == null) {
                                this.f13787o0 = new s(this, context);
                            }
                            this.f13787o0.t();
                        } else {
                            s sVar2 = this.f13787o0;
                            if (sVar2 != null) {
                                sVar2.f();
                            }
                        }
                        return z9;
                    }
                }
                z8 = false;
                if (z8) {
                }
                z9 = z8;
                if (z9) {
                    if ((i8 & 512) != 0) {
                    }
                    if ((i8 & 4) != 0) {
                    }
                }
                if (z9) {
                    p.c(p.b(context.getResources().getConfiguration()));
                }
                if (i11 == 0) {
                }
                if (i11 == 3) {
                }
                return z9;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj3.getClass()), i12 >= 29 ? 269221888 : 786432);
                if (activityInfo != null) {
                    this.f13784l0 = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e14) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e14);
                this.f13784l0 = 0;
            }
        }
        this.f13785m0 = true;
        i7 = this.f13784l0;
        configuration = this.f13781i0;
        if (configuration == null) {
        }
        int i132 = configuration.uiMode & 48;
        int i142 = u4.uiMode & 48;
        L.j b82 = p.b(configuration);
        if (q7 != null) {
        }
        if (i132 == i142) {
        }
        if (b7 != null) {
            i8 |= 8196;
        }
        if (((~i7) & i8) != 0) {
            activity = (Activity) obj3;
            if (!activity.isChild()) {
            }
        }
        z8 = false;
        if (z8) {
        }
        z9 = z8;
        if (z9) {
        }
        if (z9) {
        }
        if (i11 == 0) {
        }
        if (i11 == 3) {
        }
        return z9;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0115, code lost:
    
        if (r2.equals("ImageButton") == false) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v3 */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View appCompatRatingBar;
        int i7;
        String str2 = str;
        char c3 = 4;
        View view2 = null;
        if (this.f13794v0 == null) {
            int[] iArr = AbstractC1174a.f13332k;
            Context context2 = this.f13749B;
            String string = context2.obtainStyledAttributes(iArr).getString(116);
            if (string == null) {
                this.f13794v0 = new y();
            } else {
                try {
                    this.f13794v0 = (y) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f13794v0 = new y();
                }
            }
        }
        y yVar = this.f13794v0;
        int i8 = o1.f8729a;
        yVar.getClass();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1174a.f13320A, 0, 0);
        int resourceId = obtainStyledAttributes.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        Context c1367e = (resourceId == 0 || ((context instanceof C1367e) && ((C1367e) context).f14799a == resourceId)) ? context : new C1367e(context, resourceId);
        str.getClass();
        switch (str.hashCode()) {
            case -1946472170:
                if (str2.equals("RatingBar")) {
                    c3 = 0;
                    break;
                }
                c3 = 65535;
                break;
            case -1455429095:
                if (str2.equals("CheckedTextView")) {
                    c3 = 1;
                    break;
                }
                c3 = 65535;
                break;
            case -1346021293:
                if (str2.equals("MultiAutoCompleteTextView")) {
                    c3 = 2;
                    break;
                }
                c3 = 65535;
                break;
            case -938935918:
                if (str2.equals("TextView")) {
                    c3 = 3;
                    break;
                }
                c3 = 65535;
                break;
            case -937446323:
                break;
            case -658531749:
                if (str2.equals("SeekBar")) {
                    c3 = 5;
                    break;
                }
                c3 = 65535;
                break;
            case -339785223:
                if (str2.equals("Spinner")) {
                    c3 = 6;
                    break;
                }
                c3 = 65535;
                break;
            case 776382189:
                if (str2.equals("RadioButton")) {
                    c3 = 7;
                    break;
                }
                c3 = 65535;
                break;
            case 799298502:
                if (str2.equals("ToggleButton")) {
                    c3 = '\b';
                    break;
                }
                c3 = 65535;
                break;
            case 1125864064:
                if (str2.equals("ImageView")) {
                    c3 = '\t';
                    break;
                }
                c3 = 65535;
                break;
            case 1413872058:
                if (str2.equals("AutoCompleteTextView")) {
                    c3 = '\n';
                    break;
                }
                c3 = 65535;
                break;
            case 1601505219:
                if (str2.equals("CheckBox")) {
                    c3 = 11;
                    break;
                }
                c3 = 65535;
                break;
            case 1666676343:
                if (str2.equals("EditText")) {
                    c3 = '\f';
                    break;
                }
                c3 = 65535;
                break;
            case 2001146706:
                if (str2.equals("Button")) {
                    c3 = '\r';
                    break;
                }
                c3 = 65535;
                break;
            default:
                c3 = 65535;
                break;
        }
        switch (c3) {
            case 0:
                appCompatRatingBar = new AppCompatRatingBar(c1367e, attributeSet, com.salamadev.khotabaljomo3a.kichkabdelhamid.R.attr.ratingBarStyle);
                break;
            case 1:
                appCompatRatingBar = new AppCompatCheckedTextView(c1367e, attributeSet, com.salamadev.khotabaljomo3a.kichkabdelhamid.R.attr.checkedTextViewStyle);
                break;
            case 2:
                appCompatRatingBar = new AppCompatMultiAutoCompleteTextView(c1367e, attributeSet, com.salamadev.khotabaljomo3a.kichkabdelhamid.R.attr.autoCompleteTextViewStyle);
                break;
            case 3:
                appCompatRatingBar = new AppCompatTextView(c1367e, attributeSet);
                break;
            case 4:
                appCompatRatingBar = new AppCompatImageButton(c1367e, attributeSet, com.salamadev.khotabaljomo3a.kichkabdelhamid.R.attr.imageButtonStyle);
                break;
            case 5:
                appCompatRatingBar = new AppCompatSeekBar(c1367e, attributeSet, com.salamadev.khotabaljomo3a.kichkabdelhamid.R.attr.seekBarStyle);
                break;
            case 6:
                appCompatRatingBar = new AppCompatSpinner(c1367e, attributeSet, com.salamadev.khotabaljomo3a.kichkabdelhamid.R.attr.spinnerStyle);
                break;
            case 7:
                appCompatRatingBar = new AppCompatRadioButton(c1367e, attributeSet, com.salamadev.khotabaljomo3a.kichkabdelhamid.R.attr.radioButtonStyle);
                break;
            case '\b':
                appCompatRatingBar = new AppCompatToggleButton(c1367e, attributeSet, R.attr.buttonStyleToggle);
                break;
            case '\t':
                appCompatRatingBar = new AppCompatImageView(c1367e, attributeSet, 0);
                break;
            case '\n':
                appCompatRatingBar = new AppCompatAutoCompleteTextView(c1367e, attributeSet, com.salamadev.khotabaljomo3a.kichkabdelhamid.R.attr.autoCompleteTextViewStyle);
                break;
            case 11:
                appCompatRatingBar = new AppCompatCheckBox(c1367e, attributeSet, com.salamadev.khotabaljomo3a.kichkabdelhamid.R.attr.checkboxStyle);
                break;
            case '\f':
                appCompatRatingBar = new AppCompatEditText(c1367e, attributeSet, com.salamadev.khotabaljomo3a.kichkabdelhamid.R.attr.editTextStyle);
                break;
            case '\r':
                appCompatRatingBar = new AppCompatButton(c1367e, attributeSet);
                break;
            default:
                appCompatRatingBar = null;
                break;
        }
        if (appCompatRatingBar == null && context != c1367e) {
            Object[] objArr = yVar.f13809a;
            if (str2.equals("view")) {
                str2 = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = c1367e;
                objArr[1] = attributeSet;
                if (-1 == str2.indexOf(46)) {
                    int i9 = 0;
                    while (true) {
                        String[] strArr = y.f13807g;
                        if (i9 < 3) {
                            View a2 = yVar.a(c1367e, str2, strArr[i9]);
                            if (a2 != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = a2;
                            } else {
                                i9++;
                            }
                        }
                    }
                } else {
                    View a4 = yVar.a(c1367e, str2, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = a4;
                }
            } catch (Exception unused) {
            } finally {
                objArr[0] = null;
                objArr[1] = null;
            }
            appCompatRatingBar = view2;
        }
        if (appCompatRatingBar != null) {
            Context context3 = appCompatRatingBar.getContext();
            if (context3 instanceof ContextWrapper) {
                WeakHashMap weakHashMap = U.f5037a;
                if (appCompatRatingBar.hasOnClickListeners()) {
                    TypedArray obtainStyledAttributes2 = context3.obtainStyledAttributes(attributeSet, y.f13803c);
                    String string2 = obtainStyledAttributes2.getString(0);
                    if (string2 != null) {
                        appCompatRatingBar.setOnClickListener(new x(appCompatRatingBar, string2));
                    }
                    obtainStyledAttributes2.recycle();
                }
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray obtainStyledAttributes3 = c1367e.obtainStyledAttributes(attributeSet, y.f13804d);
                if (obtainStyledAttributes3.hasValue(0)) {
                    boolean z4 = obtainStyledAttributes3.getBoolean(0, false);
                    WeakHashMap weakHashMap2 = U.f5037a;
                    i7 = 0;
                    new P.D(com.salamadev.khotabaljomo3a.kichkabdelhamid.R.id.tag_accessibility_heading, Boolean.class, 0, 28, 3).d(appCompatRatingBar, Boolean.valueOf(z4));
                } else {
                    i7 = 0;
                }
                obtainStyledAttributes3.recycle();
                TypedArray obtainStyledAttributes4 = c1367e.obtainStyledAttributes(attributeSet, y.f13805e);
                if (obtainStyledAttributes4.hasValue(i7)) {
                    U.i(appCompatRatingBar, obtainStyledAttributes4.getString(i7));
                }
                obtainStyledAttributes4.recycle();
                TypedArray obtainStyledAttributes5 = c1367e.obtainStyledAttributes(attributeSet, y.f13806f);
                if (obtainStyledAttributes5.hasValue(i7)) {
                    boolean z7 = obtainStyledAttributes5.getBoolean(i7, i7);
                    WeakHashMap weakHashMap3 = U.f5037a;
                    new P.D(com.salamadev.khotabaljomo3a.kichkabdelhamid.R.id.tag_screen_reader_focusable, Boolean.class, i7, 28, 0).d(appCompatRatingBar, Boolean.valueOf(z7));
                }
                obtainStyledAttributes5.recycle();
            }
        }
        return appCompatRatingBar;
    }

    public final void p(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f13750C != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof r) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        r rVar = new r(this, callback);
        this.f13751D = rVar;
        window.setCallback(rVar);
        int[] iArr = f13747z0;
        Context context = this.f13749B;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = null;
        } else {
            C0665u a2 = C0665u.a();
            synchronized (a2) {
                drawable = a2.f8748a.d(context, resourceId, true);
            }
        }
        if (drawable != null) {
            window.setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.f13750C = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f13795w0) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f13796x0) != null) {
            q.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f13796x0 = null;
        }
        Object obj = this.f13748A;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f13795w0 = q.a(activity);
                J();
            }
        }
        this.f13795w0 = null;
        J();
    }

    public final void r(int i7, u uVar, m.k kVar) {
        if (kVar == null) {
            if (uVar == null && i7 >= 0) {
                u[] uVarArr = this.c0;
                if (i7 < uVarArr.length) {
                    uVar = uVarArr[i7];
                }
            }
            if (uVar != null) {
                kVar = uVar.f13736h;
            }
        }
        if ((uVar == null || uVar.f13740m) && !this.f13780h0) {
            r rVar = this.f13751D;
            Window.Callback callback = this.f13750C.getCallback();
            rVar.getClass();
            try {
                rVar.f13723e = true;
                callback.onPanelClosed(i7, kVar);
            } finally {
                rVar.f13723e = false;
            }
        }
    }

    public final void s(m.k kVar) {
        C0644j c0644j;
        if (this.f13775b0) {
            return;
        }
        this.f13775b0 = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f13756I;
        actionBarOverlayLayout.e();
        ActionMenuView actionMenuView = ((j1) actionBarOverlayLayout.f8230e).f8662a.f8532a;
        if (actionMenuView != null && (c0644j = actionMenuView.f8239K) != null) {
            c0644j.h();
            C0634e c0634e = c0644j.f8647K;
            if (c0634e != null && c0634e.b()) {
                c0634e.f15199i.dismiss();
            }
        }
        Window.Callback callback = this.f13750C.getCallback();
        if (callback != null && !this.f13780h0) {
            callback.onPanelClosed(108, kVar);
        }
        this.f13775b0 = false;
    }

    public final void t(u uVar, boolean z4) {
        t tVar;
        InterfaceC0629b0 interfaceC0629b0;
        if (z4 && uVar.f13729a == 0 && (interfaceC0629b0 = this.f13756I) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0629b0;
            actionBarOverlayLayout.e();
            if (((j1) actionBarOverlayLayout.f8230e).f8662a.p()) {
                s(uVar.f13736h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f13749B.getSystemService("window");
        if (windowManager != null && uVar.f13740m && (tVar = uVar.f13733e) != null) {
            windowManager.removeView(tVar);
            if (z4) {
                r(uVar.f13729a, uVar, null);
            }
        }
        uVar.f13738k = false;
        uVar.f13739l = false;
        uVar.f13740m = false;
        uVar.f13734f = null;
        uVar.f13741n = true;
        if (this.f13776d0 == uVar) {
            this.f13776d0 = null;
        }
        if (uVar.f13729a == 0) {
            J();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00ef, code lost:
    
        if (r7.h() != false) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean v(KeyEvent keyEvent) {
        View decorView;
        boolean z4;
        boolean z7;
        ActionMenuView actionMenuView;
        Object obj = this.f13748A;
        if (((obj instanceof InterfaceC0355k) || (obj instanceof DialogInterfaceC1229g)) && (decorView = this.f13750C.getDecorView()) != null && AbstractC0603a.R(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82) {
            r rVar = this.f13751D;
            Window.Callback callback = this.f13750C.getCallback();
            rVar.getClass();
            try {
                rVar.f13722d = true;
                if (callback.dispatchKeyEvent(keyEvent)) {
                    return true;
                }
            } finally {
                rVar.f13722d = false;
            }
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            if (keyCode == 4) {
                this.f13777e0 = (keyEvent.getFlags() & 128) != 0;
            } else if (keyCode == 82) {
                if (keyEvent.getRepeatCount() != 0) {
                    return true;
                }
                u A7 = A(0);
                if (A7.f13740m) {
                    return true;
                }
                H(A7, keyEvent);
                return true;
            }
        } else if (keyCode != 4) {
            if (keyCode == 82) {
                if (this.f13759L != null) {
                    return true;
                }
                u A8 = A(0);
                InterfaceC0629b0 interfaceC0629b0 = this.f13756I;
                Context context = this.f13749B;
                if (interfaceC0629b0 != null) {
                    ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0629b0;
                    actionBarOverlayLayout.e();
                    Toolbar toolbar = ((j1) actionBarOverlayLayout.f8230e).f8662a;
                    if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f8532a) != null && actionMenuView.f8238J && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                        ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f13756I;
                        actionBarOverlayLayout2.e();
                        if (((j1) actionBarOverlayLayout2.f8230e).f8662a.p()) {
                            ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f13756I;
                            actionBarOverlayLayout3.e();
                            ActionMenuView actionMenuView2 = ((j1) actionBarOverlayLayout3.f8230e).f8662a.f8532a;
                            if (actionMenuView2 != null) {
                                C0644j c0644j = actionMenuView2.f8239K;
                                if (c0644j != null) {
                                }
                            }
                        } else if (!this.f13780h0 && H(A8, keyEvent)) {
                            ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f13756I;
                            actionBarOverlayLayout4.e();
                            z4 = ((j1) actionBarOverlayLayout4.f8230e).f8662a.v();
                            if (!z4) {
                                return true;
                            }
                            AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                            if (audioManager != null) {
                                audioManager.playSoundEffect(0);
                                return true;
                            }
                            Log.w("AppCompatDelegate", "Couldn't get audio manager");
                            return true;
                        }
                        z4 = false;
                        if (!z4) {
                        }
                    }
                }
                boolean z8 = A8.f13740m;
                if (z8 || A8.f13739l) {
                    t(A8, true);
                    z4 = z8;
                    if (!z4) {
                    }
                } else {
                    if (A8.f13738k) {
                        if (A8.f13742o) {
                            A8.f13738k = false;
                            z7 = H(A8, keyEvent);
                        } else {
                            z7 = true;
                        }
                        if (z7) {
                            F(A8, keyEvent);
                            z4 = true;
                            if (!z4) {
                            }
                        }
                    }
                    z4 = false;
                    if (!z4) {
                    }
                }
            }
        } else if (E()) {
            return true;
        }
        return false;
    }

    public final void w(int i7) {
        u A7 = A(i7);
        if (A7.f13736h != null) {
            Bundle bundle = new Bundle();
            A7.f13736h.t(bundle);
            if (bundle.size() > 0) {
                A7.f13743p = bundle;
            }
            A7.f13736h.w();
            A7.f13736h.clear();
        }
        A7.f13742o = true;
        A7.f13741n = true;
        if ((i7 == 108 || i7 == 0) && this.f13756I != null) {
            u A8 = A(0);
            A8.f13738k = false;
            H(A8, null);
        }
    }

    public final void x() {
        ViewGroup viewGroup;
        if (this.f13764Q) {
            return;
        }
        int[] iArr = AbstractC1174a.f13332k;
        Context context = this.f13749B;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!obtainStyledAttributes.hasValue(117)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(126, false)) {
            i(1);
        } else if (obtainStyledAttributes.getBoolean(117, false)) {
            i(108);
        }
        if (obtainStyledAttributes.getBoolean(118, false)) {
            i(109);
        }
        if (obtainStyledAttributes.getBoolean(119, false)) {
            i(10);
        }
        this.f13773Z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        y();
        this.f13750C.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        if (this.f13774a0) {
            viewGroup = this.f13772Y ? (ViewGroup) from.inflate(com.salamadev.khotabaljomo3a.kichkabdelhamid.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(com.salamadev.khotabaljomo3a.kichkabdelhamid.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f13773Z) {
            viewGroup = (ViewGroup) from.inflate(com.salamadev.khotabaljomo3a.kichkabdelhamid.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f13771X = false;
            this.f13770W = false;
        } else if (this.f13770W) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.salamadev.khotabaljomo3a.kichkabdelhamid.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C1367e(context, typedValue.resourceId) : context).inflate(com.salamadev.khotabaljomo3a.kichkabdelhamid.R.layout.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC0629b0 interfaceC0629b0 = (InterfaceC0629b0) viewGroup.findViewById(com.salamadev.khotabaljomo3a.kichkabdelhamid.R.id.decor_content_parent);
            this.f13756I = interfaceC0629b0;
            interfaceC0629b0.setWindowCallback(this.f13750C.getCallback());
            if (this.f13771X) {
                ((ActionBarOverlayLayout) this.f13756I).d(109);
            }
            if (this.f13768U) {
                ((ActionBarOverlayLayout) this.f13756I).d(2);
            }
            if (this.f13769V) {
                ((ActionBarOverlayLayout) this.f13756I).d(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f13770W + ", windowActionBarOverlay: " + this.f13771X + ", android:windowIsFloating: " + this.f13773Z + ", windowActionModeOverlay: " + this.f13772Y + ", windowNoTitle: " + this.f13774a0 + " }");
        }
        R4.c cVar = new R4.c(this, 17);
        WeakHashMap weakHashMap = U.f5037a;
        P.I.u(viewGroup, cVar);
        if (this.f13756I == null) {
            this.f13766S = (TextView) viewGroup.findViewById(com.salamadev.khotabaljomo3a.kichkabdelhamid.R.id.title);
        }
        Method method = q1.f8734a;
        try {
            Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method2.isAccessible()) {
                method2.setAccessible(true);
            }
            method2.invoke(viewGroup, null);
        } catch (IllegalAccessException e7) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e7);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e8) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e8);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.salamadev.khotabaljomo3a.kichkabdelhamid.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f13750C.findViewById(R.id.content);
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
        this.f13750C.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new x0(this, 16));
        this.f13765R = viewGroup;
        Object obj = this.f13748A;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f13755H;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC0629b0 interfaceC0629b02 = this.f13756I;
            if (interfaceC0629b02 != null) {
                interfaceC0629b02.setWindowTitle(title);
            } else {
                AbstractC1223a abstractC1223a = this.f13753F;
                if (abstractC1223a != null) {
                    abstractC1223a.s(title);
                } else {
                    TextView textView = this.f13766S;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f13765R.findViewById(R.id.content);
        View decorView = this.f13750C.getDecorView();
        contentFrameLayout2.f8333x.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        WeakHashMap weakHashMap2 = U.f5037a;
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (obtainStyledAttributes2.hasValue(122)) {
            obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (obtainStyledAttributes2.hasValue(123)) {
            obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (obtainStyledAttributes2.hasValue(120)) {
            obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (obtainStyledAttributes2.hasValue(121)) {
            obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        obtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.f13764Q = true;
        u A7 = A(0);
        if (this.f13780h0 || A7.f13736h != null) {
            return;
        }
        C(108);
    }

    public final void y() {
        if (this.f13750C == null) {
            Object obj = this.f13748A;
            if (obj instanceof Activity) {
                p(((Activity) obj).getWindow());
            }
        }
        if (this.f13750C == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final F.x z(Context context) {
        if (this.f13786n0 == null) {
            if (C1726n0.f17803f == null) {
                Context applicationContext = context.getApplicationContext();
                C1726n0.f17803f = new C1726n0(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f13786n0 = new s(this, C1726n0.f17803f);
        }
        return this.f13786n0;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
