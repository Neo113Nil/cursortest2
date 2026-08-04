package p058i;

import A1.K0;
import A1.x0;
import F.AbstractC0213i;
import F.x;
import L.k;
import P.G;
import P.I;
import P.InterfaceC0355k;
import P.U;
import P.b0;
import R4.c;
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
import androidx.appcompat.widget.C0613e;
import androidx.appcompat.widget.C0623j;
import androidx.appcompat.widget.C0644u;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.InterfaceC0608b0;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.j1;
import androidx.appcompat.widget.q1;
import androidx.lifecycle.C0726v;
import androidx.lifecycle.EnumC0719n;
import androidx.lifecycle.InterfaceC0724t;
import com.google.android.gms.common.internal.w;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import p033e3.h;
import p051h.a;
import p078l.b;
import p078l.j;
import p086m.f;
import p086m.g;
import p086m.i;
import p096n1.e;
import p122r.l;
import p155w1.C1017n0;

/* JADX INFO: loaded from: classes.dex */
public final class v extends m implements i, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Object f13754A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Context f13755B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Window f13756C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public r f13757D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final Object f13758E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public AbstractC0904a f13759F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public j f13760G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public CharSequence f13761H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public InterfaceC0608b0 f13762I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public h f13763J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public e f13764K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public b f13765L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public ActionBarContextView f13766M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public PopupWindow f13767N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public n f13768O;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f13770Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public ViewGroup f13771R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public TextView f13772S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public View f13773T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public boolean f13774U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f13775V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f13776W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public boolean f13777X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f13778Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public boolean f13779Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f13780a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f13781b0;
    public u[] c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public u f13782d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f13783e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f13784f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f13785g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f13786h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public Configuration f13787i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final int f13788j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f13789k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f13790l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f13791m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public s f13792n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public s f13793o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f13794p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f13795q0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f13797s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public Rect f13798t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public Rect f13799u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public y f13800v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public OnBackInvokedDispatcher f13801w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public OnBackInvokedCallback f13802x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final l f13752y0 = new l();

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final int[] f13753z0 = {R.attr.windowBackground};

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public static final boolean f13750A0 = !"robolectric".equals(Build.FINGERPRINT);

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public static final boolean f13751B0 = true;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public b0 f13769P = null;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final n f13796r0 = new n(this, 0);

    public v(Context context, Window window, j jVar, Object obj) {
        AbstractActivityC0912i abstractActivityC0912i;
        this.f13788j0 = -100;
        this.f13755B = context;
        this.f13758E = jVar;
        this.f13754A = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (context instanceof AbstractActivityC0912i) {
                        abstractActivityC0912i = (AbstractActivityC0912i) context;
                        break;
                    } else if (context instanceof ContextWrapper) {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
                abstractActivityC0912i = null;
                break;
            }
            if (abstractActivityC0912i != null) {
                this.f13788j0 = ((v) abstractActivityC0912i.getDelegate()).f13788j0;
            }
        }
        if (this.f13788j0 == -100) {
            l lVar = f13752y0;
            Integer num = (Integer) lVar.getOrDefault(this.f13754A.getClass().getName(), null);
            if (num != null) {
                this.f13788j0 = num.intValue();
                lVar.remove(this.f13754A.getClass().getName());
            }
        }
        if (window != null) {
            p(window);
        }
        C0644u.c();
    }

    public static L.j q(Context context) {
        L.j jVar;
        L.j jVar2;
        if (Build.VERSION.SDK_INT >= 33 || (jVar = m.f13714c) == null) {
            return null;
        }
        L.j jVarB = p.b(context.getApplicationContext().getResources().getConfiguration());
        k kVar = jVar.f4186a;
        if (kVar.f4187a.isEmpty()) {
            jVar2 = L.j.f4185b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i7 = 0;
            while (i7 < jVarB.f4186a.f4187a.size() + kVar.f4187a.size()) {
                Locale locale = i7 < kVar.f4187a.size() ? kVar.f4187a.get(i7) : jVarB.f4186a.f4187a.get(i7 - kVar.f4187a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i7++;
            }
            jVar2 = new L.j(new k(L.i.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return jVar2.f4186a.f4187a.isEmpty() ? jVarB : jVar2;
    }

    public static Configuration u(Context context, int i7, L.j jVar, Configuration configuration, boolean z4) {
        int i8;
        if (i7 == 1) {
            i8 = 16;
        } else if (i7 != 2) {
            i8 = z4 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i8 = 32;
        }
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
        uVar2.f13735a = i7;
        uVar2.f13747n = false;
        uVarArr[i7] = uVar2;
        return uVar2;
    }

    public final void B() {
        x();
        if (this.f13776W && this.f13759F == null) {
            Object obj = this.f13754A;
            if (obj instanceof Activity) {
                this.f13759F = new I((Activity) obj, this.f13777X);
            } else if (obj instanceof Dialog) {
                this.f13759F = new I((Dialog) obj);
            }
            AbstractC0904a abstractC0904a = this.f13759F;
            if (abstractC0904a != null) {
                abstractC0904a.o(this.f13797s0);
            }
        }
    }

    public final void C(int i7) {
        this.f13795q0 = (1 << i7) | this.f13795q0;
        if (this.f13794p0) {
            return;
        }
        View decorView = this.f13756C.getDecorView();
        n nVar = this.f13796r0;
        WeakHashMap weakHashMap = U.f5037a;
        decorView.postOnAnimation(nVar);
        this.f13794p0 = true;
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
        if (this.f13793o0 == null) {
            this.f13793o0 = new s(this, context);
        }
        return this.f13793o0.j();
    }

    public final boolean E() {
        boolean z4 = this.f13783e0;
        this.f13783e0 = false;
        u uVarA = A(0);
        if (uVarA.f13746m) {
            if (!z4) {
                t(uVarA, true);
            }
            return true;
        }
        b bVar = this.f13765L;
        if (bVar != null) {
            bVar.a();
            return true;
        }
        B();
        AbstractC0904a abstractC0904a = this.f13759F;
        return abstractC0904a != null && abstractC0904a.b();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0174, code lost:
    
        if (r3.f15120f.getCount() > 0) goto L88;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F(u uVar, KeyEvent keyEvent) {
        int i7;
        ViewGroup.LayoutParams layoutParams;
        if (uVar.f13746m || this.f13786h0) {
            return;
        }
        int i8 = uVar.f13735a;
        Context context = this.f13755B;
        if (i8 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.f13756C.getCallback();
        if (callback != null && !callback.onMenuOpened(i8, uVar.f13742h)) {
            t(uVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null && H(uVar, keyEvent)) {
            t tVar = uVar.f13739e;
            if (tVar != null && !uVar.f13747n) {
                View view = uVar.f13741g;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i7 = -1;
                }
                uVar.f13745l = false;
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i7, -2, 0, 0, 1002, 8519680, -3);
                layoutParams2.gravity = uVar.f13737c;
                layoutParams2.windowAnimations = uVar.f13738d;
                windowManager.addView(uVar.f13739e, layoutParams2);
                uVar.f13746m = true;
                if (i8 == 0) {
                    J();
                }
            }
            if (tVar == null) {
                B();
                AbstractC0904a abstractC0904a = this.f13759F;
                Context contextE = abstractC0904a != null ? abstractC0904a.e() : null;
                if (contextE != null) {
                    context = contextE;
                }
                TypedValue typedValue = new TypedValue();
                Resources.Theme themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(context.getTheme());
                themeNewTheme.resolveAttribute(com.salamadev.nabilalawadi.kisaskoran.R.attr.actionBarPopupTheme, typedValue, true);
                int i9 = typedValue.resourceId;
                if (i9 != 0) {
                    themeNewTheme.applyStyle(i9, true);
                }
                themeNewTheme.resolveAttribute(com.salamadev.nabilalawadi.kisaskoran.R.attr.panelMenuListTheme, typedValue, true);
                int i10 = typedValue.resourceId;
                if (i10 != 0) {
                    themeNewTheme.applyStyle(i10, true);
                } else {
                    themeNewTheme.applyStyle(com.salamadev.nabilalawadi.kisaskoran.R.style.Theme_AppCompat_CompactMenu, true);
                }
                p078l.e eVar = new p078l.e(context, 0);
                eVar.getTheme().setTo(themeNewTheme);
                uVar.j = eVar;
                TypedArray typedArrayObtainStyledAttributes = eVar.obtainStyledAttributes(a.f13338k);
                uVar.f13736b = typedArrayObtainStyledAttributes.getResourceId(86, 0);
                uVar.f13738d = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                typedArrayObtainStyledAttributes.recycle();
                uVar.f13739e = new t(this, uVar.j);
                uVar.f13737c = 81;
            } else if (uVar.f13747n && tVar.getChildCount() > 0) {
                uVar.f13739e.removeAllViews();
            }
            View view2 = uVar.f13741g;
            if (view2 == null) {
                if (uVar.f13742h != null) {
                    if (this.f13764K == null) {
                        this.f13764K = new e(this, 14);
                    }
                    e eVar2 = this.f13764K;
                    if (uVar.f13743i == null) {
                        g gVar = new g(uVar.j);
                        uVar.f13743i = gVar;
                        gVar.f15119e = eVar2;
                        p086m.k kVar = uVar.f13742h;
                        kVar.b(gVar, kVar.f15144a);
                    }
                    g gVar2 = uVar.f13743i;
                    t tVar2 = uVar.f13739e;
                    if (gVar2.f15118d == null) {
                        gVar2.f15118d = (ExpandedMenuView) gVar2.f15116b.inflate(com.salamadev.nabilalawadi.kisaskoran.R.layout.abc_expanded_menu_layout, (ViewGroup) tVar2, false);
                        if (gVar2.f15120f == null) {
                            gVar2.f15120f = new f(gVar2);
                        }
                        gVar2.f15118d.setAdapter((ListAdapter) gVar2.f15120f);
                        gVar2.f15118d.setOnItemClickListener(gVar2);
                    }
                    ExpandedMenuView expandedMenuView = gVar2.f15118d;
                    uVar.f13740f = expandedMenuView;
                    if (expandedMenuView != null) {
                    }
                }
                uVar.f13747n = true;
                return;
            }
            uVar.f13740f = view2;
            if (uVar.f13740f != null) {
                if (uVar.f13741g == null) {
                    g gVar3 = uVar.f13743i;
                    if (gVar3.f15120f == null) {
                        gVar3.f15120f = new f(gVar3);
                    }
                }
                ViewGroup.LayoutParams layoutParams3 = uVar.f13740f.getLayoutParams();
                if (layoutParams3 == null) {
                    layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
                }
                uVar.f13739e.setBackgroundResource(uVar.f13736b);
                ViewParent parent = uVar.f13740f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(uVar.f13740f);
                }
                uVar.f13739e.addView(uVar.f13740f, layoutParams3);
                if (!uVar.f13740f.hasFocus()) {
                    uVar.f13740f.requestFocus();
                }
            }
            uVar.f13747n = true;
            return;
            i7 = -2;
            uVar.f13745l = false;
            WindowManager.LayoutParams layoutParams4 = new WindowManager.LayoutParams(i7, -2, 0, 0, 1002, 8519680, -3);
            layoutParams4.gravity = uVar.f13737c;
            layoutParams4.windowAnimations = uVar.f13738d;
            windowManager.addView(uVar.f13739e, layoutParams4);
            uVar.f13746m = true;
            if (i8 == 0) {
                J();
            }
        }
    }

    public final boolean G(u uVar, int i7, KeyEvent keyEvent) {
        p086m.k kVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((uVar.f13744k || H(uVar, keyEvent)) && (kVar = uVar.f13742h) != null) {
            return kVar.performShortcut(i7, keyEvent, 1);
        }
        return false;
    }

    public final boolean H(u uVar, KeyEvent keyEvent) {
        InterfaceC0608b0 interfaceC0608b0;
        InterfaceC0608b0 interfaceC0608b1;
        Resources.Theme themeNewTheme;
        InterfaceC0608b0 interfaceC0608b2;
        InterfaceC0608b0 interfaceC0608b3;
        if (this.f13786h0) {
            return false;
        }
        if (uVar.f13744k) {
            return true;
        }
        u uVar2 = this.f13782d0;
        if (uVar2 != null && uVar2 != uVar) {
            t(uVar2, false);
        }
        Window.Callback callback = this.f13756C.getCallback();
        int i7 = uVar.f13735a;
        if (callback != null) {
            uVar.f13741g = callback.onCreatePanelView(i7);
        }
        boolean z4 = i7 == 0 || i7 == 108;
        if (z4 && (interfaceC0608b3 = this.f13762I) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0608b3;
            actionBarOverlayLayout.e();
            ((j1) actionBarOverlayLayout.f8230e).f8672l = true;
        }
        if (uVar.f13741g == null && (!z4 || !(this.f13759F instanceof E))) {
            p086m.k kVar = uVar.f13742h;
            if (kVar == null || uVar.f13748o) {
                if (kVar == null) {
                    Context context = this.f13755B;
                    if ((i7 == 0 || i7 == 108) && this.f13762I != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(com.salamadev.nabilalawadi.kisaskoran.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            themeNewTheme.resolveAttribute(com.salamadev.nabilalawadi.kisaskoran.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme.resolveAttribute(com.salamadev.nabilalawadi.kisaskoran.R.attr.actionBarWidgetTheme, typedValue, true);
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
                            p078l.e eVar = new p078l.e(context, 0);
                            eVar.getTheme().setTo(themeNewTheme);
                            context = eVar;
                        }
                    }
                    p086m.k kVar2 = new p086m.k(context);
                    kVar2.f15148e = this;
                    p086m.k kVar3 = uVar.f13742h;
                    if (kVar2 != kVar3) {
                        if (kVar3 != null) {
                            kVar3.r(uVar.f13743i);
                        }
                        uVar.f13742h = kVar2;
                        g gVar = uVar.f13743i;
                        if (gVar != null) {
                            kVar2.b(gVar, kVar2.f15144a);
                        }
                    }
                    if (uVar.f13742h == null) {
                        return false;
                    }
                }
                if (z4 && (interfaceC0608b1 = this.f13762I) != null) {
                    if (this.f13763J == null) {
                        this.f13763J = new h(this);
                    }
                    ((ActionBarOverlayLayout) interfaceC0608b1).f(uVar.f13742h, this.f13763J);
                }
                uVar.f13742h.w();
                if (!callback.onCreatePanelMenu(i7, uVar.f13742h)) {
                    p086m.k kVar4 = uVar.f13742h;
                    if (kVar4 != null) {
                        if (kVar4 != null) {
                            kVar4.r(uVar.f13743i);
                        }
                        uVar.f13742h = null;
                    }
                    if (z4 && (interfaceC0608b0 = this.f13762I) != null) {
                        ((ActionBarOverlayLayout) interfaceC0608b0).f(null, this.f13763J);
                    }
                    return false;
                }
                uVar.f13748o = false;
            }
            uVar.f13742h.w();
            Bundle bundle = uVar.f13749p;
            if (bundle != null) {
                uVar.f13742h.s(bundle);
                uVar.f13749p = null;
            }
            if (!callback.onPreparePanel(0, uVar.f13741g, uVar.f13742h)) {
                if (z4 && (interfaceC0608b2 = this.f13762I) != null) {
                    ((ActionBarOverlayLayout) interfaceC0608b2).f(null, this.f13763J);
                }
                uVar.f13742h.v();
                return false;
            }
            uVar.f13742h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            uVar.f13742h.v();
        }
        uVar.f13744k = true;
        uVar.f13745l = false;
        this.f13782d0 = uVar;
        return true;
    }

    public final void I() {
        if (this.f13770Q) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void J() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z4 = false;
            if (this.f13801w0 != null && (A(0).f13746m || this.f13765L != null)) {
                z4 = true;
            }
            if (z4 && this.f13802x0 == null) {
                this.f13802x0 = q.b(this.f13801w0, this);
            } else {
                if (z4 || (onBackInvokedCallback = this.f13802x0) == null) {
                    return;
                }
                q.c(this.f13801w0, onBackInvokedCallback);
            }
        }
    }

    @Override // p058i.m
    public final void a() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f13755B);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof v) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r6.k() != false) goto L20;
     */
    @Override // p086m.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(p086m.k kVar) {
        ActionMenuView actionMenuView;
        C0623j c0623j;
        InterfaceC0608b0 interfaceC0608b0 = this.f13762I;
        if (interfaceC0608b0 != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0608b0;
            actionBarOverlayLayout.e();
            Toolbar toolbar = ((j1) actionBarOverlayLayout.f8230e).f8662a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f8532a) != null && actionMenuView.f8238J) {
                if (ViewConfiguration.get(this.f13755B).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f13762I;
                    actionBarOverlayLayout2.e();
                    ActionMenuView actionMenuView2 = ((j1) actionBarOverlayLayout2.f8230e).f8662a.f8532a;
                    if (actionMenuView2 != null) {
                        C0623j c0623j2 = actionMenuView2.f8239K;
                        if (c0623j2 != null) {
                            if (c0623j2.f8648L == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.f13756C.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f13762I;
                actionBarOverlayLayout3.e();
                if (((j1) actionBarOverlayLayout3.f8230e).f8662a.p()) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f13762I;
                    actionBarOverlayLayout4.e();
                    ActionMenuView actionMenuView3 = ((j1) actionBarOverlayLayout4.f8230e).f8662a.f8532a;
                    if (actionMenuView3 != null && (c0623j = actionMenuView3.f8239K) != null) {
                        c0623j.h();
                    }
                    if (this.f13786h0) {
                        return;
                    }
                    callback.onPanelClosed(108, A(0).f13742h);
                    return;
                }
                if (callback == null || this.f13786h0) {
                    return;
                }
                if (this.f13794p0 && (1 & this.f13795q0) != 0) {
                    View decorView = this.f13756C.getDecorView();
                    n nVar = this.f13796r0;
                    decorView.removeCallbacks(nVar);
                    nVar.run();
                }
                u uVarA = A(0);
                p086m.k kVar2 = uVarA.f13742h;
                if (kVar2 == null || uVarA.f13748o || !callback.onPreparePanel(0, uVarA.f13741g, kVar2)) {
                    return;
                }
                callback.onMenuOpened(108, uVarA.f13742h);
                ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) this.f13762I;
                actionBarOverlayLayout5.e();
                ((j1) actionBarOverlayLayout5.f8230e).f8662a.v();
                return;
            }
        }
        u uVarA2 = A(0);
        uVarA2.f13747n = true;
        t(uVarA2, false);
        F(uVarA2, null);
    }

    @Override // p058i.m
    public final void c() {
        if (this.f13759F != null) {
            B();
            if (this.f13759F.g()) {
                return;
            }
            C(0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002a  */
    @Override // p086m.i
    public final boolean e(p086m.k kVar, MenuItem menuItem) {
        u uVar;
        Window.Callback callback = this.f13756C.getCallback();
        if (callback != null && !this.f13786h0) {
            p086m.k kVarK = kVar.k();
            u[] uVarArr = this.c0;
            int length = uVarArr != null ? uVarArr.length : 0;
            for (int i7 = 0; i7 < length; i7++) {
                uVar = uVarArr[i7];
                if (uVar != null && uVar.f13742h == kVarK) {
                    if (uVar != null) {
                        return callback.onMenuItemSelected(uVar.f13735a, menuItem);
                    }
                }
            }
            uVar = null;
            if (uVar != null) {
                return callback.onMenuItemSelected(uVar.f13735a, menuItem);
            }
        }
        return false;
    }

    @Override // p058i.m
    public final void f() throws IllegalAccessException {
        String strC;
        this.f13784f0 = true;
        o(false, true);
        y();
        Object obj = this.f13754A;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strC = AbstractC0213i.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e7) {
                    throw new IllegalArgumentException(e7);
                }
            } catch (IllegalArgumentException unused) {
                strC = null;
            }
            if (strC != null) {
                AbstractC0904a abstractC0904a = this.f13759F;
                if (abstractC0904a == null) {
                    this.f13797s0 = true;
                } else {
                    abstractC0904a.o(true);
                }
            }
            synchronized (m.f13719y) {
                m.h(this);
                m.f13718x.add(new WeakReference(this));
            }
        }
        this.f13787i0 = new Configuration(this.f13755B.getResources().getConfiguration());
        this.f13785g0 = true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // p058i.m
    public final void g() {
        if (this.f13754A instanceof Activity) {
            synchronized (m.f13719y) {
                m.h(this);
            }
        }
        if (this.f13794p0) {
            this.f13756C.getDecorView().removeCallbacks(this.f13796r0);
        }
        this.f13786h0 = true;
        if (this.f13788j0 != -100) {
            Object obj = this.f13754A;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f13752y0.put(this.f13754A.getClass().getName(), Integer.valueOf(this.f13788j0));
            } else {
                f13752y0.remove(this.f13754A.getClass().getName());
            }
        } else {
            f13752y0.remove(this.f13754A.getClass().getName());
        }
        AbstractC0904a abstractC0904a = this.f13759F;
        if (abstractC0904a != null) {
            abstractC0904a.j();
        }
        s sVar = this.f13792n0;
        if (sVar != null) {
            sVar.f();
        }
        s sVar2 = this.f13793o0;
        if (sVar2 != null) {
            sVar2.f();
        }
    }

    @Override // p058i.m
    public final boolean i(int i7) {
        if (i7 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i7 = 108;
        } else if (i7 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i7 = 109;
        }
        if (this.f13780a0 && i7 == 108) {
            return false;
        }
        if (this.f13776W && i7 == 1) {
            this.f13776W = false;
        }
        if (i7 == 1) {
            I();
            this.f13780a0 = true;
            return true;
        }
        if (i7 == 2) {
            I();
            this.f13774U = true;
            return true;
        }
        if (i7 == 5) {
            I();
            this.f13775V = true;
            return true;
        }
        if (i7 == 10) {
            I();
            this.f13778Y = true;
            return true;
        }
        if (i7 == 108) {
            I();
            this.f13776W = true;
            return true;
        }
        if (i7 != 109) {
            return this.f13756C.requestFeature(i7);
        }
        I();
        this.f13777X = true;
        return true;
    }

    @Override // p058i.m
    public final void j(int i7) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.f13771R.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f13755B).inflate(i7, viewGroup);
        this.f13757D.a(this.f13756C.getCallback());
    }

    @Override // p058i.m
    public final void k(View view) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.f13771R.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f13757D.a(this.f13756C.getCallback());
    }

    @Override // p058i.m
    public final void l(View view, ViewGroup.LayoutParams layoutParams) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.f13771R.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f13757D.a(this.f13756C.getCallback());
    }

    @Override // p058i.m
    public final void m(CharSequence charSequence) {
        this.f13761H = charSequence;
        InterfaceC0608b0 interfaceC0608b0 = this.f13762I;
        if (interfaceC0608b0 != null) {
            interfaceC0608b0.setWindowTitle(charSequence);
            return;
        }
        AbstractC0904a abstractC0904a = this.f13759F;
        if (abstractC0904a != null) {
            abstractC0904a.s(charSequence);
            return;
        }
        TextView textView = this.f13772S;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0154  */
    /* JADX WARN: Type inference failed for: r3v1, types: [i.j, java.lang.Object] */
    @Override // p058i.m
    public final b n(p078l.a aVar) {
        b bVarOnWindowStartingSupportActionMode;
        boolean z4;
        ViewGroup viewGroup;
        boolean z7 = false;
        int i7 = 1;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        b bVar = this.f13765L;
        if (bVar != null) {
            bVar.a();
        }
        w wVar = new w(6, this, aVar, z7);
        B();
        AbstractC0904a abstractC0904a = this.f13759F;
        ?? r7 = this.f13758E;
        if (abstractC0904a != null) {
            b bVarU = abstractC0904a.u(wVar);
            this.f13765L = bVarU;
            if (bVarU != null) {
                r7.onSupportActionModeStarted(bVarU);
            }
        }
        if (this.f13765L == null) {
            b0 b0Var = this.f13769P;
            if (b0Var != null) {
                b0Var.b();
            }
            b bVar2 = this.f13765L;
            if (bVar2 != null) {
                bVar2.a();
            }
            if (this.f13786h0) {
                bVarOnWindowStartingSupportActionMode = null;
            } else {
                try {
                    bVarOnWindowStartingSupportActionMode = r7.onWindowStartingSupportActionMode(wVar);
                } catch (AbstractMethodError unused) {
                    bVarOnWindowStartingSupportActionMode = null;
                }
            }
            if (bVarOnWindowStartingSupportActionMode != null) {
                this.f13765L = bVarOnWindowStartingSupportActionMode;
            } else {
                if (this.f13766M == null) {
                    boolean z8 = this.f13779Z;
                    Context context = this.f13755B;
                    if (z8) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(com.salamadev.nabilalawadi.kisaskoran.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            Resources.Theme themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            p078l.e eVar = new p078l.e(context, 0);
                            eVar.getTheme().setTo(themeNewTheme);
                            context = eVar;
                        }
                        this.f13766M = new ActionBarContextView(context, null);
                        PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, com.salamadev.nabilalawadi.kisaskoran.R.attr.actionModePopupWindowStyle);
                        this.f13767N = popupWindow;
                        V.k.d(popupWindow, 2);
                        this.f13767N.setContentView(this.f13766M);
                        this.f13767N.setWidth(-1);
                        context.getTheme().resolveAttribute(com.salamadev.nabilalawadi.kisaskoran.R.attr.actionBarSize, typedValue, true);
                        this.f13766M.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                        this.f13767N.setHeight(-2);
                        this.f13768O = new n(this, i7);
                    } else {
                        ViewStubCompat viewStubCompat = (ViewStubCompat) this.f13771R.findViewById(com.salamadev.nabilalawadi.kisaskoran.R.id.action_mode_bar_stub);
                        if (viewStubCompat != null) {
                            B();
                            AbstractC0904a abstractC0904a2 = this.f13759F;
                            Context contextE = abstractC0904a2 != null ? abstractC0904a2.e() : null;
                            if (contextE != null) {
                                context = contextE;
                            }
                            viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                            this.f13766M = (ActionBarContextView) viewStubCompat.a();
                        }
                    }
                }
                if (this.f13766M != null) {
                    b0 b0Var2 = this.f13769P;
                    if (b0Var2 != null) {
                        b0Var2.b();
                    }
                    this.f13766M.e();
                    Context context2 = this.f13766M.getContext();
                    ActionBarContextView actionBarContextView = this.f13766M;
                    p078l.f fVar = new p078l.f();
                    fVar.f14810c = context2;
                    fVar.f14811d = actionBarContextView;
                    fVar.f14812e = wVar;
                    p086m.k kVar = new p086m.k(actionBarContextView.getContext());
                    kVar.f15130C = 1;
                    fVar.f14815y = kVar;
                    kVar.f15148e = fVar;
                    if (((p078l.a) wVar.f11335b).e(fVar, kVar)) {
                        fVar.i();
                        this.f13766M.c(fVar);
                        this.f13765L = fVar;
                        if (!this.f13770Q || (viewGroup = this.f13771R) == null) {
                            z4 = false;
                        } else {
                            WeakHashMap weakHashMap = U.f5037a;
                            if (viewGroup.isLaidOut()) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                        }
                        if (z4) {
                            this.f13766M.setAlpha(0.0f);
                            b0 b0VarA = U.a(this.f13766M);
                            b0VarA.a(1.0f);
                            this.f13769P = b0VarA;
                            b0VarA.d(new o(this, i7));
                        } else {
                            this.f13766M.setAlpha(1.0f);
                            this.f13766M.setVisibility(0);
                            if (this.f13766M.getParent() instanceof View) {
                                View view = (View) this.f13766M.getParent();
                                WeakHashMap weakHashMap2 = U.f5037a;
                                G.c(view);
                            }
                        }
                        if (this.f13767N != null) {
                            this.f13756C.getDecorView().post(this.f13768O);
                        }
                    } else {
                        this.f13765L = null;
                    }
                }
            }
            b bVar3 = this.f13765L;
            if (bVar3 != null) {
                r7.onSupportActionModeStarted(bVar3);
            }
            J();
            this.f13765L = this.f13765L;
        }
        J();
        return this.f13765L;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00e5  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean o(boolean z4, boolean z7) throws IllegalAccessException {
        int i7;
        boolean z8;
        boolean z9;
        boolean z10;
        Object obj;
        Object obj2;
        int i8 = 3;
        if (this.f13786h0) {
            return false;
        }
        int i9 = this.f13788j0;
        if (i9 == -100) {
            i9 = m.f13713b;
        }
        int i10 = i9;
        Context context = this.f13755B;
        int iD = D(i10, context);
        int i11 = Build.VERSION.SDK_INT;
        LongSparseArray longSparseArray = null;
        L.j jVarQ = i11 < 33 ? q(context) : null;
        if (!z7 && jVarQ != null) {
            jVarQ = p.b(context.getResources().getConfiguration());
        }
        Configuration configurationU = u(context, iD, jVarQ, null, false);
        boolean z11 = this.f13791m0;
        Object obj3 = this.f13754A;
        if (z11 || !(obj3 instanceof Activity)) {
            this.f13791m0 = true;
            i7 = this.f13790l0;
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i7 = 0;
            } else {
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj3.getClass()), i11 >= 29 ? 269221888 : 786432);
                    if (activityInfo != null) {
                        this.f13790l0 = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException e7) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e7);
                    this.f13790l0 = 0;
                }
                this.f13791m0 = true;
                i7 = this.f13790l0;
            }
        }
        Configuration configuration = this.f13787i0;
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int i12 = configuration.uiMode & 48;
        int i13 = configurationU.uiMode & 48;
        L.j jVarB = p.b(configuration);
        L.j jVarB2 = jVarQ == null ? null : p.b(configurationU);
        int i14 = i12 != i13 ? 512 : 0;
        if (jVarB2 != null && !jVarB.equals(jVarB2)) {
            i14 |= 8196;
        }
        if (((~i7) & i14) != 0 && z4 && this.f13784f0 && ((f13750A0 || this.f13785g0) && (obj3 instanceof Activity))) {
            Activity activity = (Activity) obj3;
            if (activity.isChild()) {
                z8 = false;
            } else {
                if (Build.VERSION.SDK_INT >= 28) {
                    activity.recreate();
                } else {
                    new Handler(activity.getMainLooper()).post(new K0(activity, i8));
                }
                z8 = true;
            }
        } else {
            z8 = false;
        }
        if (z8 || i14 == 0) {
            z9 = z8;
        } else {
            boolean z12 = (i7 & i14) == i14;
            Resources resources = context.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i13;
            if (jVarB2 != null) {
                p.d(configuration2, jVarB2);
            }
            resources.updateConfiguration(configuration2, null);
            int i15 = Build.VERSION.SDK_INT;
            if (i15 < 26 && i15 < 28) {
                if (!Q0.a.f5746l) {
                    try {
                        Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                        Q0.a.f5745k = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException e8) {
                        Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e8);
                    }
                    Q0.a.f5746l = true;
                }
                Field field = Q0.a.f5745k;
                if (field != null) {
                    try {
                        obj = field.get(resources);
                    } catch (IllegalAccessException e9) {
                        Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e9);
                        obj = null;
                    }
                    if (obj != null) {
                        if (!Q0.a.f5741f) {
                            try {
                                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                Q0.a.f5740e = declaredField2;
                                declaredField2.setAccessible(true);
                            } catch (NoSuchFieldException e10) {
                                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e10);
                            }
                            Q0.a.f5741f = true;
                        }
                        Field field2 = Q0.a.f5740e;
                        if (field2 != null) {
                            try {
                                obj2 = field2.get(obj);
                            } catch (IllegalAccessException e11) {
                                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e11);
                                obj2 = null;
                            }
                        } else {
                            obj2 = null;
                        }
                        if (obj2 != null) {
                            if (!Q0.a.f5743h) {
                                try {
                                    Q0.a.f5742g = Class.forName("android.content.res.ThemedResourceCache");
                                } catch (ClassNotFoundException e12) {
                                    Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e12);
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
                                    } catch (NoSuchFieldException e13) {
                                        Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e13);
                                    }
                                    Q0.a.j = true;
                                }
                                Field field3 = Q0.a.f5744i;
                                if (field3 != null) {
                                    try {
                                        longSparseArray = (LongSparseArray) field3.get(obj2);
                                    } catch (IllegalAccessException e14) {
                                        Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e14);
                                    }
                                    if (longSparseArray != null) {
                                        D.a(longSparseArray);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            int i16 = this.f13789k0;
            if (i16 != 0) {
                context.setTheme(i16);
                z10 = true;
                context.getTheme().applyStyle(this.f13789k0, true);
            } else {
                z10 = true;
            }
            if (z12 && (obj3 instanceof Activity)) {
                Activity activity2 = (Activity) obj3;
                if (activity2 instanceof InterfaceC0724t) {
                    if (((C0726v) ((InterfaceC0724t) activity2).getLifecycle()).f9637c.compareTo(EnumC0719n.f9628c) >= 0) {
                        activity2.onConfigurationChanged(configuration2);
                    }
                } else if (this.f13785g0 && !this.f13786h0) {
                    activity2.onConfigurationChanged(configuration2);
                }
            }
            z9 = z10;
        }
        if (z9 && (obj3 instanceof AbstractActivityC0912i)) {
            if ((i14 & 512) != 0) {
                ((AbstractActivityC0912i) obj3).onNightModeChanged(iD);
            }
            if ((i14 & 4) != 0) {
                ((AbstractActivityC0912i) obj3).onLocalesChanged(jVarQ);
            }
        }
        if (z9 && jVarB2 != null) {
            p.c(p.b(context.getResources().getConfiguration()));
        }
        if (i10 == 0) {
            z(context).t();
        } else {
            s sVar = this.f13792n0;
            if (sVar != null) {
                sVar.f();
            }
        }
        if (i10 == 3) {
            if (this.f13793o0 == null) {
                this.f13793o0 = new s(this, context);
            }
            this.f13793o0.t();
        } else {
            s sVar2 = this.f13793o0;
            if (sVar2 != null) {
                sVar2.f();
            }
        }
        return z9;
    }

    /* JADX WARN: Failed to calculate best type for var: r0v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v1 ??, new type: i.y
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v1 ??, new type: i.y
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v7 ??, new type: android.content.res.TypedArray
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v9 ??, new type: android.content.res.TypedArray
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r10v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v4 ??, new type: android.content.Context
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r20v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r20v0 ??, new type: android.content.Context
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to set immutable type for var: r20v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r20v0 ??, new type: android.content.Context
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v3 ??, new type: android.content.Context
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderAllow(TypeUpdate.java:66)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryWiderObjects(FixTypesVisitor.java:795)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:249)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    @Override // android.view.LayoutInflater.Factory2
    public final android.view.View onCreateView(android.view.View r18, java.lang.String r19, android.content.Context r20, android.util.AttributeSet r21) {
        /*
            Method dump skipped, instruction units count: 776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p058i.v.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0074  */
    public final void p(Window window) {
        Drawable drawableD;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f13756C != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof r) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        r rVar = new r(this, callback);
        this.f13757D = rVar;
        window.setCallback(rVar);
        int[] iArr = f13753z0;
        Context context = this.f13755B;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawableD = null;
        } else {
            C0644u c0644uA = C0644u.a();
            synchronized (c0644uA) {
                drawableD = c0644uA.f8748a.d(context, resourceId, true);
            }
        }
        if (drawableD != null) {
            window.setBackgroundDrawable(drawableD);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f13756C = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f13801w0) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f13802x0) != null) {
            q.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f13802x0 = null;
        }
        Object obj = this.f13754A;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f13801w0 = q.a(activity);
            } else {
                this.f13801w0 = null;
            }
        } else {
            this.f13801w0 = null;
        }
        J();
    }

    public final void r(int i7, u uVar, p086m.k kVar) {
        if (kVar == null) {
            if (uVar == null && i7 >= 0) {
                u[] uVarArr = this.c0;
                if (i7 < uVarArr.length) {
                    uVar = uVarArr[i7];
                }
            }
            if (uVar != null) {
                kVar = uVar.f13742h;
            }
        }
        if ((uVar == null || uVar.f13746m) && !this.f13786h0) {
            r rVar = this.f13757D;
            Window.Callback callback = this.f13756C.getCallback();
            rVar.getClass();
            try {
                rVar.f13729e = true;
                callback.onPanelClosed(i7, kVar);
            } finally {
                rVar.f13729e = false;
            }
        }
    }

    public final void s(p086m.k kVar) {
        C0623j c0623j;
        if (this.f13781b0) {
            return;
        }
        this.f13781b0 = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f13762I;
        actionBarOverlayLayout.e();
        ActionMenuView actionMenuView = ((j1) actionBarOverlayLayout.f8230e).f8662a.f8532a;
        if (actionMenuView != null && (c0623j = actionMenuView.f8239K) != null) {
            c0623j.h();
            C0613e c0613e = c0623j.f8647K;
            if (c0613e != null && c0613e.b()) {
                c0613e.f15205i.dismiss();
            }
        }
        Window.Callback callback = this.f13756C.getCallback();
        if (callback != null && !this.f13786h0) {
            callback.onPanelClosed(108, kVar);
        }
        this.f13781b0 = false;
    }

    public final void t(u uVar, boolean z4) {
        t tVar;
        InterfaceC0608b0 interfaceC0608b0;
        if (z4 && uVar.f13735a == 0 && (interfaceC0608b0 = this.f13762I) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0608b0;
            actionBarOverlayLayout.e();
            if (((j1) actionBarOverlayLayout.f8230e).f8662a.p()) {
                s(uVar.f13742h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f13755B.getSystemService("window");
        if (windowManager != null && uVar.f13746m && (tVar = uVar.f13739e) != null) {
            windowManager.removeView(tVar);
            if (z4) {
                r(uVar.f13735a, uVar, null);
            }
        }
        uVar.f13744k = false;
        uVar.f13745l = false;
        uVar.f13746m = false;
        uVar.f13740f = null;
        uVar.f13747n = true;
        if (this.f13782d0 == uVar) {
            this.f13782d0 = null;
        }
        if (uVar.f13735a == 0) {
            J();
        }
    }

    /* JADX WARN: Code duplicated, block: B:67:0x00f2  */
    public final boolean v(KeyEvent keyEvent) {
        View decorView;
        boolean z4;
        boolean zV;
        boolean zH;
        ActionMenuView actionMenuView;
        C0623j c0623j;
        Object obj = this.f13754A;
        if (((obj instanceof InterfaceC0355k) || (obj instanceof DialogInterfaceC0910g)) && (decorView = this.f13756C.getDecorView()) != null && p003a.a.R(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82) {
            r rVar = this.f13757D;
            Window.Callback callback = this.f13756C.getCallback();
            rVar.getClass();
            try {
                rVar.f13728d = true;
                boolean zDispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                rVar.f13728d = false;
                if (zDispatchKeyEvent) {
                    return true;
                }
            } catch (Throwable th) {
                rVar.f13728d = false;
                throw th;
            }
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            if (keyCode == 4) {
                this.f13783e0 = (keyEvent.getFlags() & 128) != 0;
            } else if (keyCode == 82) {
                if (keyEvent.getRepeatCount() != 0) {
                    return true;
                }
                u uVarA = A(0);
                if (uVarA.f13746m) {
                    return true;
                }
                H(uVarA, keyEvent);
                return true;
            }
        } else if (keyCode != 4) {
            if (keyCode == 82) {
                if (this.f13765L != null) {
                    return true;
                }
                u uVarA2 = A(0);
                InterfaceC0608b0 interfaceC0608b0 = this.f13762I;
                Context context = this.f13755B;
                if (interfaceC0608b0 != null) {
                    ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0608b0;
                    actionBarOverlayLayout.e();
                    Toolbar toolbar = ((j1) actionBarOverlayLayout.f8230e).f8662a;
                    if (toolbar.getVisibility() != 0 || (actionMenuView = toolbar.f8532a) == null || !actionMenuView.f8238J || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                        z4 = uVarA2.f13746m;
                        if (!z4 || uVarA2.f13745l) {
                            t(uVarA2, true);
                            zV = z4;
                        } else {
                            if (uVarA2.f13744k) {
                                if (uVarA2.f13748o) {
                                    uVarA2.f13744k = false;
                                    zH = H(uVarA2, keyEvent);
                                } else {
                                    zH = true;
                                }
                                if (zH) {
                                    F(uVarA2, keyEvent);
                                    zV = true;
                                }
                            }
                            zV = false;
                        }
                    } else {
                        ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f13762I;
                        actionBarOverlayLayout2.e();
                        if (((j1) actionBarOverlayLayout2.f8230e).f8662a.p()) {
                            ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f13762I;
                            actionBarOverlayLayout3.e();
                            ActionMenuView actionMenuView2 = ((j1) actionBarOverlayLayout3.f8230e).f8662a.f8532a;
                            if (actionMenuView2 != null && (c0623j = actionMenuView2.f8239K) != null && c0623j.h()) {
                                zV = true;
                            }
                        } else if (!this.f13786h0 && H(uVarA2, keyEvent)) {
                            ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f13762I;
                            actionBarOverlayLayout4.e();
                            zV = ((j1) actionBarOverlayLayout4.f8230e).f8662a.v();
                        }
                        zV = false;
                    }
                } else {
                    z4 = uVarA2.f13746m;
                    if (z4) {
                    }
                    t(uVarA2, true);
                    zV = z4;
                }
                if (!zV) {
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
        } else if (E()) {
            return true;
        }
        return false;
    }

    public final void w(int i7) {
        u uVarA = A(i7);
        if (uVarA.f13742h != null) {
            Bundle bundle = new Bundle();
            uVarA.f13742h.t(bundle);
            if (bundle.size() > 0) {
                uVarA.f13749p = bundle;
            }
            uVarA.f13742h.w();
            uVarA.f13742h.clear();
        }
        uVarA.f13748o = true;
        uVarA.f13747n = true;
        if ((i7 == 108 || i7 == 0) && this.f13762I != null) {
            u uVarA2 = A(0);
            uVarA2.f13744k = false;
            H(uVarA2, null);
        }
    }

    public final void x() {
        ViewGroup viewGroup;
        if (this.f13770Q) {
            return;
        }
        int[] iArr = a.f13338k;
        Context context = this.f13755B;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            i(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            i(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            i(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            i(10);
        }
        this.f13779Z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        y();
        this.f13756C.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.f13780a0) {
            viewGroup = this.f13778Y ? (ViewGroup) layoutInflaterFrom.inflate(com.salamadev.nabilalawadi.kisaskoran.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(com.salamadev.nabilalawadi.kisaskoran.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f13779Z) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.salamadev.nabilalawadi.kisaskoran.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f13777X = false;
            this.f13776W = false;
        } else if (this.f13776W) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.salamadev.nabilalawadi.kisaskoran.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new p078l.e(context, typedValue.resourceId) : context).inflate(com.salamadev.nabilalawadi.kisaskoran.R.layout.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC0608b0 interfaceC0608b0 = (InterfaceC0608b0) viewGroup.findViewById(com.salamadev.nabilalawadi.kisaskoran.R.id.decor_content_parent);
            this.f13762I = interfaceC0608b0;
            interfaceC0608b0.setWindowCallback(this.f13756C.getCallback());
            if (this.f13777X) {
                ((ActionBarOverlayLayout) this.f13762I).d(109);
            }
            if (this.f13774U) {
                ((ActionBarOverlayLayout) this.f13762I).d(2);
            }
            if (this.f13775V) {
                ((ActionBarOverlayLayout) this.f13762I).d(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f13776W + ", windowActionBarOverlay: " + this.f13777X + ", android:windowIsFloating: " + this.f13779Z + ", windowActionModeOverlay: " + this.f13778Y + ", windowNoTitle: " + this.f13780a0 + " }");
        }
        c cVar = new c(this, 17);
        WeakHashMap weakHashMap = U.f5037a;
        I.u(viewGroup, cVar);
        if (this.f13762I == null) {
            this.f13772S = (TextView) viewGroup.findViewById(com.salamadev.nabilalawadi.kisaskoran.R.id.title);
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
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.salamadev.nabilalawadi.kisaskoran.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f13756C.findViewById(R.id.content);
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
        this.f13756C.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new x0(this, 16));
        this.f13771R = viewGroup;
        Object obj = this.f13754A;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f13761H;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC0608b0 interfaceC0608b1 = this.f13762I;
            if (interfaceC0608b1 != null) {
                interfaceC0608b1.setWindowTitle(title);
            } else {
                AbstractC0904a abstractC0904a = this.f13759F;
                if (abstractC0904a != null) {
                    abstractC0904a.s(title);
                } else {
                    TextView textView = this.f13772S;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f13771R.findViewById(R.id.content);
        View decorView = this.f13756C.getDecorView();
        contentFrameLayout2.f8333x.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        WeakHashMap weakHashMap2 = U.f5037a;
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
        this.f13770Q = true;
        u uVarA = A(0);
        if (this.f13786h0 || uVarA.f13742h != null) {
            return;
        }
        C(108);
    }

    public final void y() {
        if (this.f13756C == null) {
            Object obj = this.f13754A;
            if (obj instanceof Activity) {
                p(((Activity) obj).getWindow());
            }
        }
        if (this.f13756C == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final x z(Context context) {
        if (this.f13792n0 == null) {
            if (C1017n0.f17809f == null) {
                Context applicationContext = context.getApplicationContext();
                C1017n0.f17809f = new C1017n0(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f13792n0 = new s(this, C1017n0.f17809f);
        }
        return this.f13792n0;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
