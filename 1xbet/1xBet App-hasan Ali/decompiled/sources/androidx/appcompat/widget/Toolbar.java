package androidx.appcompat.widget;

import A0.C;
import S2.f;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import game.betting133.sports1xbet.R;
import h.AbstractC1986a;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import k0.C2023c;
import l.C2039c;
import m.MenuC2070h;
import m.MenuItemC2071i;
import n.A0;
import n.B0;
import n.C2111E;
import n.C2132f;
import n.C2138i;
import n.C2140j;
import n.C2148s;
import n.I0;
import n.InterfaceC2118L;
import n.o0;
import n.r;
import n.v0;
import n.w0;
import n.x0;
import n.y0;
import n.z0;
import r0.AbstractC2346c;
import v3.e;
import z1.d;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: A, reason: collision with root package name */
    public int f6752A;

    /* renamed from: B, reason: collision with root package name */
    public int f6753B;

    /* renamed from: C, reason: collision with root package name */
    public int f6754C;

    /* renamed from: D, reason: collision with root package name */
    public o0 f6755D;

    /* renamed from: E, reason: collision with root package name */
    public int f6756E;

    /* renamed from: F, reason: collision with root package name */
    public int f6757F;

    /* renamed from: G, reason: collision with root package name */
    public final int f6758G;

    /* renamed from: H, reason: collision with root package name */
    public CharSequence f6759H;

    /* renamed from: I, reason: collision with root package name */
    public CharSequence f6760I;
    public ColorStateList J;
    public ColorStateList K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f6761L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f6762M;

    /* renamed from: N, reason: collision with root package name */
    public final ArrayList f6763N;

    /* renamed from: O, reason: collision with root package name */
    public final ArrayList f6764O;

    /* renamed from: P, reason: collision with root package name */
    public final int[] f6765P;

    /* renamed from: Q, reason: collision with root package name */
    public final C2138i f6766Q;

    /* renamed from: R, reason: collision with root package name */
    public ArrayList f6767R;

    /* renamed from: S, reason: collision with root package name */
    public final C2138i f6768S;

    /* renamed from: T, reason: collision with root package name */
    public B0 f6769T;

    /* renamed from: U, reason: collision with root package name */
    public x0 f6770U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f6771V;

    /* renamed from: W, reason: collision with root package name */
    public OnBackInvokedCallback f6772W;

    /* renamed from: a0, reason: collision with root package name */
    public OnBackInvokedDispatcher f6773a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f6774b0;

    /* renamed from: c0, reason: collision with root package name */
    public final C f6775c0;

    /* renamed from: k, reason: collision with root package name */
    public ActionMenuView f6776k;

    /* renamed from: l, reason: collision with root package name */
    public C2111E f6777l;

    /* renamed from: m, reason: collision with root package name */
    public C2111E f6778m;

    /* renamed from: n, reason: collision with root package name */
    public r f6779n;

    /* renamed from: o, reason: collision with root package name */
    public C2148s f6780o;

    /* renamed from: p, reason: collision with root package name */
    public final Drawable f6781p;

    /* renamed from: q, reason: collision with root package name */
    public final CharSequence f6782q;

    /* renamed from: r, reason: collision with root package name */
    public r f6783r;

    /* renamed from: s, reason: collision with root package name */
    public View f6784s;

    /* renamed from: t, reason: collision with root package name */
    public Context f6785t;

    /* renamed from: u, reason: collision with root package name */
    public int f6786u;

    /* renamed from: v, reason: collision with root package name */
    public int f6787v;

    /* renamed from: w, reason: collision with root package name */
    public int f6788w;

    /* renamed from: x, reason: collision with root package name */
    public final int f6789x;

    /* renamed from: y, reason: collision with root package name */
    public final int f6790y;

    /* renamed from: z, reason: collision with root package name */
    public int f6791z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f6758G = 8388627;
        this.f6763N = new ArrayList();
        this.f6764O = new ArrayList();
        this.f6765P = new int[2];
        this.f6766Q = new C2138i(new v0(this, 1));
        this.f6767R = new ArrayList();
        this.f6768S = new C2138i(2, this);
        this.f6775c0 = new C(19, this);
        Context context2 = getContext();
        int[] iArr = AbstractC1986a.f17184r;
        e G5 = e.G(context2, attributeSet, iArr, R.attr.toolbarStyle);
        n1.C.c(this, context, iArr, attributeSet, (TypedArray) G5.f20433m, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) G5.f20433m;
        this.f6787v = typedArray.getResourceId(28, 0);
        this.f6788w = typedArray.getResourceId(19, 0);
        this.f6758G = typedArray.getInteger(0, 8388627);
        this.f6789x = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f6754C = dimensionPixelOffset;
        this.f6753B = dimensionPixelOffset;
        this.f6752A = dimensionPixelOffset;
        this.f6791z = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f6791z = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f6752A = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f6753B = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f6754C = dimensionPixelOffset5;
        }
        this.f6790y = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        o0 o0Var = this.f6755D;
        o0Var.f18305h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            o0Var.f18303e = dimensionPixelSize;
            o0Var.f18299a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            o0Var.f = dimensionPixelSize2;
            o0Var.f18300b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            o0Var.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f6756E = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f6757F = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f6781p = G5.x(4);
        this.f6782q = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f6785t = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable x5 = G5.x(16);
        if (x5 != null) {
            setNavigationIcon(x5);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable x6 = G5.x(11);
        if (x6 != null) {
            setLogo(x6);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(G5.w(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(G5.w(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        G5.J();
    }

    public static y0 g() {
        y0 y0Var = new y0(-2, -2);
        y0Var.f18334b = 0;
        y0Var.f18333a = 8388627;
        return y0Var;
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new C2039c(getContext());
    }

    public static y0 h(ViewGroup.LayoutParams layoutParams) {
        boolean z3 = layoutParams instanceof y0;
        if (z3) {
            y0 y0Var = (y0) layoutParams;
            y0 y0Var2 = new y0(y0Var);
            y0Var2.f18334b = 0;
            y0Var2.f18334b = y0Var.f18334b;
            return y0Var2;
        }
        if (z3) {
            y0 y0Var3 = new y0((y0) layoutParams);
            y0Var3.f18334b = 0;
            return y0Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            y0 y0Var4 = new y0(layoutParams);
            y0Var4.f18334b = 0;
            return y0Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        y0 y0Var5 = new y0(marginLayoutParams);
        y0Var5.f18334b = 0;
        ((ViewGroup.MarginLayoutParams) y0Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) y0Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) y0Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) y0Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return y0Var5;
    }

    public static int j(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i, ArrayList arrayList) {
        boolean z3 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z3) {
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                y0 y0Var = (y0) childAt.getLayoutParams();
                if (y0Var.f18334b == 0 && r(childAt)) {
                    int i6 = y0Var.f18333a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i6, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i7 = childCount - 1; i7 >= 0; i7--) {
            View childAt2 = getChildAt(i7);
            y0 y0Var2 = (y0) childAt2.getLayoutParams();
            if (y0Var2.f18334b == 0 && r(childAt2)) {
                int i8 = y0Var2.f18333a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i8, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z3) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        y0 g5 = layoutParams == null ? g() : !checkLayoutParams(layoutParams) ? h(layoutParams) : (y0) layoutParams;
        g5.f18334b = 1;
        if (!z3 || this.f6784s == null) {
            addView(view, g5);
        } else {
            view.setLayoutParams(g5);
            this.f6764O.add(view);
        }
    }

    public final void c() {
        if (this.f6783r == null) {
            r rVar = new r(getContext());
            this.f6783r = rVar;
            rVar.setImageDrawable(this.f6781p);
            this.f6783r.setContentDescription(this.f6782q);
            y0 g5 = g();
            g5.f18333a = (this.f6789x & 112) | 8388611;
            g5.f18334b = 2;
            this.f6783r.setLayoutParams(g5);
            this.f6783r.setOnClickListener(new f(1, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof y0);
    }

    public final void d() {
        if (this.f6755D == null) {
            o0 o0Var = new o0();
            o0Var.f18299a = 0;
            o0Var.f18300b = 0;
            o0Var.f18301c = Integer.MIN_VALUE;
            o0Var.f18302d = Integer.MIN_VALUE;
            o0Var.f18303e = 0;
            o0Var.f = 0;
            o0Var.f18304g = false;
            o0Var.f18305h = false;
            this.f6755D = o0Var;
        }
    }

    public final void e() {
        if (this.f6776k == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f6776k = actionMenuView;
            actionMenuView.setPopupTheme(this.f6786u);
            this.f6776k.setOnMenuItemClickListener(this.f6768S);
            ActionMenuView actionMenuView2 = this.f6776k;
            C2023c c2023c = new C2023c(5, this);
            actionMenuView2.getClass();
            actionMenuView2.f6731D = c2023c;
            y0 g5 = g();
            g5.f18333a = (this.f6789x & 112) | 8388613;
            this.f6776k.setLayoutParams(g5);
            b(this.f6776k, false);
        }
        ActionMenuView actionMenuView3 = this.f6776k;
        if (actionMenuView3.f6737z == null) {
            MenuC2070h menuC2070h = (MenuC2070h) actionMenuView3.getMenu();
            if (this.f6770U == null) {
                this.f6770U = new x0(this);
            }
            this.f6776k.setExpandedActionViewsExclusive(true);
            menuC2070h.b(this.f6770U, this.f6785t);
            s();
        }
    }

    public final void f() {
        if (this.f6779n == null) {
            this.f6779n = new r(getContext());
            y0 g5 = g();
            g5.f18333a = (this.f6789x & 112) | 8388611;
            this.f6779n.setLayoutParams(g5);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return g();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return h(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        r rVar = this.f6783r;
        if (rVar != null) {
            return rVar.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        r rVar = this.f6783r;
        if (rVar != null) {
            return rVar.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        o0 o0Var = this.f6755D;
        if (o0Var != null) {
            return o0Var.f18304g ? o0Var.f18299a : o0Var.f18300b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f6757F;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        o0 o0Var = this.f6755D;
        if (o0Var != null) {
            return o0Var.f18299a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        o0 o0Var = this.f6755D;
        if (o0Var != null) {
            return o0Var.f18300b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        o0 o0Var = this.f6755D;
        if (o0Var != null) {
            return o0Var.f18304g ? o0Var.f18300b : o0Var.f18299a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f6756E;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        MenuC2070h menuC2070h;
        ActionMenuView actionMenuView = this.f6776k;
        return (actionMenuView == null || (menuC2070h = actionMenuView.f6737z) == null || !menuC2070h.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f6757F, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f6756E, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C2148s c2148s = this.f6780o;
        if (c2148s != null) {
            return c2148s.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C2148s c2148s = this.f6780o;
        if (c2148s != null) {
            return c2148s.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f6776k.getMenu();
    }

    public View getNavButtonView() {
        return this.f6779n;
    }

    public CharSequence getNavigationContentDescription() {
        r rVar = this.f6779n;
        if (rVar != null) {
            return rVar.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        r rVar = this.f6779n;
        if (rVar != null) {
            return rVar.getDrawable();
        }
        return null;
    }

    public C2140j getOuterActionMenuPresenter() {
        return null;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f6776k.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f6785t;
    }

    public int getPopupTheme() {
        return this.f6786u;
    }

    public CharSequence getSubtitle() {
        return this.f6760I;
    }

    public final TextView getSubtitleTextView() {
        return this.f6778m;
    }

    public CharSequence getTitle() {
        return this.f6759H;
    }

    public int getTitleMarginBottom() {
        return this.f6754C;
    }

    public int getTitleMarginEnd() {
        return this.f6752A;
    }

    public int getTitleMarginStart() {
        return this.f6791z;
    }

    public int getTitleMarginTop() {
        return this.f6753B;
    }

    public final TextView getTitleTextView() {
        return this.f6777l;
    }

    public InterfaceC2118L getWrapper() {
        Drawable drawable;
        if (this.f6769T == null) {
            B0 b02 = new B0();
            b02.f18129l = 0;
            b02.f18120a = this;
            b02.f18126h = getTitle();
            b02.i = getSubtitle();
            b02.f18125g = b02.f18126h != null;
            b02.f = getNavigationIcon();
            e G5 = e.G(getContext(), null, AbstractC1986a.f17169a, R.attr.actionBarStyle);
            b02.f18130m = G5.x(15);
            TypedArray typedArray = (TypedArray) G5.f20433m;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                b02.f18125g = true;
                b02.f18126h = text;
                if ((b02.f18121b & 8) != 0) {
                    Toolbar toolbar = b02.f18120a;
                    toolbar.setTitle(text);
                    if (b02.f18125g) {
                        n1.C.e(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                b02.i = text2;
                if ((b02.f18121b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable x5 = G5.x(20);
            if (x5 != null) {
                b02.f18124e = x5;
                b02.c();
            }
            Drawable x6 = G5.x(17);
            if (x6 != null) {
                b02.f18123d = x6;
                b02.c();
            }
            if (b02.f == null && (drawable = b02.f18130m) != null) {
                b02.f = drawable;
                int i = b02.f18121b & 4;
                Toolbar toolbar2 = b02.f18120a;
                if (i != 0) {
                    toolbar2.setNavigationIcon(drawable);
                } else {
                    toolbar2.setNavigationIcon((Drawable) null);
                }
            }
            b02.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = b02.f18122c;
                if (view != null && (b02.f18121b & 16) != 0) {
                    removeView(view);
                }
                b02.f18122c = inflate;
                if (inflate != null && (b02.f18121b & 16) != 0) {
                    addView(inflate);
                }
                b02.a(b02.f18121b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int max = Math.max(dimensionPixelOffset, 0);
                int max2 = Math.max(dimensionPixelOffset2, 0);
                d();
                this.f6755D.a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f6787v = resourceId2;
                C2111E c2111e = this.f6777l;
                if (c2111e != null) {
                    c2111e.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f6788w = resourceId3;
                C2111E c2111e2 = this.f6778m;
                if (c2111e2 != null) {
                    c2111e2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            G5.J();
            if (R.string.abc_action_bar_up_description != b02.f18129l) {
                b02.f18129l = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i5 = b02.f18129l;
                    b02.f18127j = i5 != 0 ? getContext().getString(i5) : null;
                    b02.b();
                }
            }
            b02.f18127j = getNavigationContentDescription();
            setNavigationOnClickListener(new f(b02));
            this.f6769T = b02;
        }
        return this.f6769T;
    }

    public final int i(View view, int i) {
        y0 y0Var = (y0) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i6 = y0Var.f18333a & 112;
        if (i6 != 16 && i6 != 48 && i6 != 80) {
            i6 = this.f6758G & 112;
        }
        if (i6 == 48) {
            return getPaddingTop() - i5;
        }
        if (i6 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) y0Var).bottomMargin) - i5;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i7 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i8 = ((ViewGroup.MarginLayoutParams) y0Var).topMargin;
        if (i7 < i8) {
            i7 = i8;
        } else {
            int i9 = (((height - paddingBottom) - measuredHeight) - i7) - paddingTop;
            int i10 = ((ViewGroup.MarginLayoutParams) y0Var).bottomMargin;
            if (i9 < i10) {
                i7 = Math.max(0, i7 - (i10 - i9));
            }
        }
        return paddingTop + i7;
    }

    public final void l() {
        ArrayList arrayList = this.f6767R;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            getMenu().removeItem(((MenuItem) obj).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f6766Q.f18249l).iterator();
        if (it.hasNext()) {
            ((d) it.next()).getClass();
            throw null;
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f6767R = currentMenuItems2;
    }

    public final boolean m(View view) {
        return view.getParent() == this || this.f6764O.contains(view);
    }

    public final int n(View view, int i, int i5, int[] iArr) {
        y0 y0Var = (y0) view.getLayoutParams();
        int i6 = ((ViewGroup.MarginLayoutParams) y0Var).leftMargin - iArr[0];
        int max = Math.max(0, i6) + i;
        iArr[0] = Math.max(0, -i6);
        int i7 = i(view, i5);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, i7, max + measuredWidth, view.getMeasuredHeight() + i7);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) y0Var).rightMargin + max;
    }

    public final int o(View view, int i, int i5, int[] iArr) {
        y0 y0Var = (y0) view.getLayoutParams();
        int i6 = ((ViewGroup.MarginLayoutParams) y0Var).rightMargin - iArr[1];
        int max = i - Math.max(0, i6);
        iArr[1] = Math.max(0, -i6);
        int i7 = i(view, i5);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, i7, max, view.getMeasuredHeight() + i7);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) y0Var).leftMargin);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        s();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f6775c0);
        s();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f6762M = false;
        }
        if (!this.f6762M) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f6762M = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f6762M = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x028f A[LOOP:0: B:39:0x028d->B:40:0x028f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02a7 A[LOOP:1: B:43:0x02a5->B:44:0x02a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02c8 A[LOOP:2: B:47:0x02c6->B:48:0x02c8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0318 A[LOOP:3: B:56:0x0316->B:57:0x0318, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0218  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z3, int i, int i5, int i6, int i7) {
        int i8;
        int i9;
        int max;
        boolean r5;
        boolean r6;
        boolean z5;
        int i10;
        int i11;
        int paddingTop;
        int i12;
        int i13;
        int i14;
        int i15;
        int size;
        int i16;
        int i17;
        int size2;
        int i18;
        int size3;
        int i19;
        int i20;
        int i21;
        int size4;
        boolean z6 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i22 = width - paddingRight;
        int[] iArr = this.f6765P;
        iArr[1] = 0;
        iArr[0] = 0;
        Field field = n1.C.f18360a;
        int minimumHeight = getMinimumHeight();
        int min = minimumHeight >= 0 ? Math.min(minimumHeight, i7 - i5) : 0;
        if (!r(this.f6779n)) {
            i8 = paddingLeft;
        } else {
            if (z6) {
                i9 = o(this.f6779n, i22, min, iArr);
                i8 = paddingLeft;
                if (r(this.f6783r)) {
                    if (z6) {
                        i9 = o(this.f6783r, i9, min, iArr);
                    } else {
                        i8 = n(this.f6783r, i8, min, iArr);
                    }
                }
                if (r(this.f6776k)) {
                    if (z6) {
                        i8 = n(this.f6776k, i8, min, iArr);
                    } else {
                        i9 = o(this.f6776k, i9, min, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - i8);
                iArr[1] = Math.max(0, currentContentInsetRight - (i22 - i9));
                max = Math.max(i8, currentContentInsetLeft);
                int min2 = Math.min(i9, i22 - currentContentInsetRight);
                if (r(this.f6784s)) {
                    if (z6) {
                        min2 = o(this.f6784s, min2, min, iArr);
                    } else {
                        max = n(this.f6784s, max, min, iArr);
                    }
                }
                if (r(this.f6780o)) {
                    if (z6) {
                        min2 = o(this.f6780o, min2, min, iArr);
                    } else {
                        max = n(this.f6780o, max, min, iArr);
                    }
                }
                r5 = r(this.f6777l);
                r6 = r(this.f6778m);
                if (r5) {
                    z5 = z6;
                    i10 = 0;
                } else {
                    y0 y0Var = (y0) this.f6777l.getLayoutParams();
                    z5 = z6;
                    i10 = this.f6777l.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) y0Var).topMargin + ((ViewGroup.MarginLayoutParams) y0Var).bottomMargin;
                }
                if (!r6) {
                    y0 y0Var2 = (y0) this.f6778m.getLayoutParams();
                    i10 = this.f6778m.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) y0Var2).topMargin + ((ViewGroup.MarginLayoutParams) y0Var2).bottomMargin + i10;
                }
                if (!r5 || r6) {
                    C2111E c2111e = !r5 ? this.f6777l : this.f6778m;
                    C2111E c2111e2 = !r6 ? this.f6778m : this.f6777l;
                    y0 y0Var3 = (y0) c2111e.getLayoutParams();
                    y0 y0Var4 = (y0) c2111e2.getLayoutParams();
                    int i23 = i10;
                    boolean z7 = (!r5 && this.f6777l.getMeasuredWidth() > 0) || (r6 && this.f6778m.getMeasuredWidth() > 0);
                    i11 = this.f6758G & 112;
                    int i24 = max;
                    if (i11 != 48) {
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) y0Var3).topMargin + this.f6753B;
                    } else if (i11 != 80) {
                        int i25 = (((height - paddingTop2) - paddingBottom) - i23) / 2;
                        int i26 = ((ViewGroup.MarginLayoutParams) y0Var3).topMargin + this.f6753B;
                        if (i25 < i26) {
                            i25 = i26;
                        } else {
                            int i27 = (((height - paddingBottom) - i23) - i25) - paddingTop2;
                            int i28 = ((ViewGroup.MarginLayoutParams) y0Var3).bottomMargin;
                            int i29 = this.f6754C;
                            if (i27 < i28 + i29) {
                                i25 = Math.max(0, i25 - ((((ViewGroup.MarginLayoutParams) y0Var4).bottomMargin + i29) - i27));
                            }
                        }
                        paddingTop = paddingTop2 + i25;
                    } else {
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) y0Var4).bottomMargin) - this.f6754C) - i23;
                    }
                    if (z5) {
                        int i30 = (z7 ? this.f6791z : 0) - iArr[0];
                        max = Math.max(0, i30) + i24;
                        iArr[0] = Math.max(0, -i30);
                        if (r5) {
                            y0 y0Var5 = (y0) this.f6777l.getLayoutParams();
                            int measuredWidth = this.f6777l.getMeasuredWidth() + max;
                            int measuredHeight = this.f6777l.getMeasuredHeight() + paddingTop;
                            this.f6777l.layout(max, paddingTop, measuredWidth, measuredHeight);
                            i12 = measuredWidth + this.f6752A;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) y0Var5).bottomMargin;
                        } else {
                            i12 = max;
                        }
                        if (r6) {
                            int i31 = paddingTop + ((ViewGroup.MarginLayoutParams) ((y0) this.f6778m.getLayoutParams())).topMargin;
                            int measuredWidth2 = this.f6778m.getMeasuredWidth() + max;
                            this.f6778m.layout(max, i31, measuredWidth2, this.f6778m.getMeasuredHeight() + i31);
                            i13 = measuredWidth2 + this.f6752A;
                        } else {
                            i13 = max;
                        }
                        if (z7) {
                            max = Math.max(i12, i13);
                        }
                    } else {
                        int i32 = (z7 ? this.f6791z : 0) - iArr[1];
                        min2 -= Math.max(0, i32);
                        iArr[1] = Math.max(0, -i32);
                        if (r5) {
                            y0 y0Var6 = (y0) this.f6777l.getLayoutParams();
                            int measuredWidth3 = min2 - this.f6777l.getMeasuredWidth();
                            int measuredHeight2 = this.f6777l.getMeasuredHeight() + paddingTop;
                            this.f6777l.layout(measuredWidth3, paddingTop, min2, measuredHeight2);
                            i14 = measuredWidth3 - this.f6752A;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) y0Var6).bottomMargin;
                        } else {
                            i14 = min2;
                        }
                        if (r6) {
                            int i33 = paddingTop + ((ViewGroup.MarginLayoutParams) ((y0) this.f6778m.getLayoutParams())).topMargin;
                            this.f6778m.layout(min2 - this.f6778m.getMeasuredWidth(), i33, min2, this.f6778m.getMeasuredHeight() + i33);
                            i15 = min2 - this.f6752A;
                        } else {
                            i15 = min2;
                        }
                        if (z7) {
                            min2 = Math.min(i14, i15);
                        }
                        max = i24;
                    }
                }
                ArrayList arrayList = this.f6763N;
                a(3, arrayList);
                size = arrayList.size();
                i16 = max;
                for (i17 = 0; i17 < size; i17++) {
                    i16 = n((View) arrayList.get(i17), i16, min, iArr);
                }
                a(5, arrayList);
                size2 = arrayList.size();
                for (i18 = 0; i18 < size2; i18++) {
                    min2 = o((View) arrayList.get(i18), min2, min, iArr);
                }
                a(1, arrayList);
                int i34 = iArr[0];
                int i35 = iArr[1];
                size3 = arrayList.size();
                int i36 = i35;
                int i37 = i34;
                i19 = 0;
                int i38 = 0;
                while (i19 < size3) {
                    View view = (View) arrayList.get(i19);
                    y0 y0Var7 = (y0) view.getLayoutParams();
                    int i39 = i19;
                    int i40 = ((ViewGroup.MarginLayoutParams) y0Var7).leftMargin - i37;
                    int i41 = ((ViewGroup.MarginLayoutParams) y0Var7).rightMargin - i36;
                    int max2 = Math.max(0, i40);
                    int max3 = Math.max(0, i41);
                    int max4 = Math.max(0, -i40);
                    int max5 = Math.max(0, -i41);
                    i38 += view.getMeasuredWidth() + max2 + max3;
                    i36 = max5;
                    i37 = max4;
                    i19 = i39 + 1;
                }
                i21 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (i38 / 2);
                int i42 = i38 + i21;
                if (i21 >= i16) {
                    i16 = i42 > min2 ? i21 - (i42 - min2) : i21;
                }
                size4 = arrayList.size();
                for (i20 = 0; i20 < size4; i20++) {
                    i16 = n((View) arrayList.get(i20), i16, min, iArr);
                }
                arrayList.clear();
            }
            i8 = n(this.f6779n, paddingLeft, min, iArr);
        }
        i9 = i22;
        if (r(this.f6783r)) {
        }
        if (r(this.f6776k)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i8);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i22 - i9));
        max = Math.max(i8, currentContentInsetLeft2);
        int min22 = Math.min(i9, i22 - currentContentInsetRight2);
        if (r(this.f6784s)) {
        }
        if (r(this.f6780o)) {
        }
        r5 = r(this.f6777l);
        r6 = r(this.f6778m);
        if (r5) {
        }
        if (!r6) {
        }
        if (!r5) {
        }
        if (!r5) {
        }
        if (!r6) {
        }
        y0 y0Var32 = (y0) c2111e.getLayoutParams();
        y0 y0Var42 = (y0) c2111e2.getLayoutParams();
        int i232 = i10;
        if (r5) {
        }
        i11 = this.f6758G & 112;
        int i242 = max;
        if (i11 != 48) {
        }
        if (z5) {
        }
        ArrayList arrayList2 = this.f6763N;
        a(3, arrayList2);
        size = arrayList2.size();
        i16 = max;
        while (i17 < size) {
        }
        a(5, arrayList2);
        size2 = arrayList2.size();
        while (i18 < size2) {
        }
        a(1, arrayList2);
        int i342 = iArr[0];
        int i352 = iArr[1];
        size3 = arrayList2.size();
        int i362 = i352;
        int i372 = i342;
        i19 = 0;
        int i382 = 0;
        while (i19 < size3) {
        }
        i21 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (i382 / 2);
        int i422 = i382 + i21;
        if (i21 >= i16) {
        }
        size4 = arrayList2.size();
        while (i20 < size4) {
        }
        arrayList2.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i, int i5) {
        char c5;
        Object[] objArr;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z3 = I0.f18161a;
        int i13 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c5 = 0;
        } else {
            c5 = 1;
            objArr = false;
        }
        if (r(this.f6779n)) {
            q(this.f6779n, i, 0, i5, this.f6790y);
            i6 = j(this.f6779n) + this.f6779n.getMeasuredWidth();
            i7 = Math.max(0, k(this.f6779n) + this.f6779n.getMeasuredHeight());
            i8 = View.combineMeasuredStates(0, this.f6779n.getMeasuredState());
        } else {
            i6 = 0;
            i7 = 0;
            i8 = 0;
        }
        if (r(this.f6783r)) {
            q(this.f6783r, i, 0, i5, this.f6790y);
            i6 = j(this.f6783r) + this.f6783r.getMeasuredWidth();
            i7 = Math.max(i7, k(this.f6783r) + this.f6783r.getMeasuredHeight());
            i8 = View.combineMeasuredStates(i8, this.f6783r.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i6);
        int max2 = Math.max(0, currentContentInsetStart - i6);
        Object[] objArr2 = objArr;
        int[] iArr = this.f6765P;
        iArr[objArr2 == true ? 1 : 0] = max2;
        if (r(this.f6776k)) {
            q(this.f6776k, i, max, i5, this.f6790y);
            i9 = j(this.f6776k) + this.f6776k.getMeasuredWidth();
            i7 = Math.max(i7, k(this.f6776k) + this.f6776k.getMeasuredHeight());
            i8 = View.combineMeasuredStates(i8, this.f6776k.getMeasuredState());
        } else {
            i9 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i9);
        iArr[c5] = Math.max(0, currentContentInsetEnd - i9);
        if (r(this.f6784s)) {
            max3 += p(this.f6784s, i, max3, i5, 0, iArr);
            i7 = Math.max(i7, k(this.f6784s) + this.f6784s.getMeasuredHeight());
            i8 = View.combineMeasuredStates(i8, this.f6784s.getMeasuredState());
        }
        if (r(this.f6780o)) {
            max3 += p(this.f6780o, i, max3, i5, 0, iArr);
            i7 = Math.max(i7, k(this.f6780o) + this.f6780o.getMeasuredHeight());
            i8 = View.combineMeasuredStates(i8, this.f6780o.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (((y0) childAt.getLayoutParams()).f18334b == 0 && r(childAt)) {
                max3 += p(childAt, i, max3, i5, 0, iArr);
                int max4 = Math.max(i7, k(childAt) + childAt.getMeasuredHeight());
                i8 = View.combineMeasuredStates(i8, childAt.getMeasuredState());
                i7 = max4;
            } else {
                max3 = max3;
            }
        }
        int i15 = max3;
        int i16 = this.f6753B + this.f6754C;
        int i17 = this.f6791z + this.f6752A;
        if (r(this.f6777l)) {
            p(this.f6777l, i, i15 + i17, i5, i16, iArr);
            int j5 = j(this.f6777l) + this.f6777l.getMeasuredWidth();
            i10 = k(this.f6777l) + this.f6777l.getMeasuredHeight();
            i11 = View.combineMeasuredStates(i8, this.f6777l.getMeasuredState());
            i12 = j5;
        } else {
            i10 = 0;
            i11 = i8;
            i12 = 0;
        }
        if (r(this.f6778m)) {
            i12 = Math.max(i12, p(this.f6778m, i, i15 + i17, i5, i16 + i10, iArr));
            i10 += k(this.f6778m) + this.f6778m.getMeasuredHeight();
            i11 = View.combineMeasuredStates(i11, this.f6778m.getMeasuredState());
        }
        int max5 = Math.max(i7, i10);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i15 + i12;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max5;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & i11);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i5, i11 << 16);
        if (this.f6771V) {
            int childCount2 = getChildCount();
            for (int i18 = 0; i18 < childCount2; i18++) {
                View childAt2 = getChildAt(i18);
                if (!r(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i13);
        }
        i13 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i13);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof A0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        A0 a02 = (A0) parcelable;
        super.onRestoreInstanceState(a02.f19983k);
        ActionMenuView actionMenuView = this.f6776k;
        MenuC2070h menuC2070h = actionMenuView != null ? actionMenuView.f6737z : null;
        int i = a02.f18118m;
        if (i != 0 && this.f6770U != null && menuC2070h != null && (findItem = menuC2070h.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (a02.f18119n) {
            C c5 = this.f6775c0;
            removeCallbacks(c5);
            post(c5);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        d();
        o0 o0Var = this.f6755D;
        boolean z3 = i == 1;
        if (z3 == o0Var.f18304g) {
            return;
        }
        o0Var.f18304g = z3;
        if (!o0Var.f18305h) {
            o0Var.f18299a = o0Var.f18303e;
            o0Var.f18300b = o0Var.f;
            return;
        }
        if (z3) {
            int i5 = o0Var.f18302d;
            if (i5 == Integer.MIN_VALUE) {
                i5 = o0Var.f18303e;
            }
            o0Var.f18299a = i5;
            int i6 = o0Var.f18301c;
            if (i6 == Integer.MIN_VALUE) {
                i6 = o0Var.f;
            }
            o0Var.f18300b = i6;
            return;
        }
        int i7 = o0Var.f18301c;
        if (i7 == Integer.MIN_VALUE) {
            i7 = o0Var.f18303e;
        }
        o0Var.f18299a = i7;
        int i8 = o0Var.f18302d;
        if (i8 == Integer.MIN_VALUE) {
            i8 = o0Var.f;
        }
        o0Var.f18300b = i8;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C2140j c2140j;
        C2132f c2132f;
        MenuItemC2071i menuItemC2071i;
        A0 a02 = new A0(super.onSaveInstanceState());
        x0 x0Var = this.f6770U;
        if (x0Var != null && (menuItemC2071i = x0Var.f18331l) != null) {
            a02.f18118m = menuItemC2071i.f17926a;
        }
        ActionMenuView actionMenuView = this.f6776k;
        a02.f18119n = (actionMenuView == null || (c2140j = actionMenuView.f6730C) == null || (c2132f = c2140j.f18255B) == null || !c2132f.b()) ? false : true;
        return a02;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f6761L = false;
        }
        if (!this.f6761L) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f6761L = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f6761L = false;
        return true;
    }

    public final int p(View view, int i, int i5, int i6, int i7, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i8 = marginLayoutParams.leftMargin - iArr[0];
        int i9 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i9) + Math.max(0, i8);
        iArr[0] = Math.max(0, -i8);
        iArr[1] = Math.max(0, -i9);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + max + i5, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i6, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i7, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void q(View view, int i, int i5, int i6, int i7) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i5, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i6, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i7 >= 0) {
            if (mode != 0) {
                i7 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i7);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean r(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final void s() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a5 = w0.a(this);
            x0 x0Var = this.f6770U;
            boolean z3 = (x0Var == null || x0Var.f18331l == null || a5 == null || !isAttachedToWindow() || !this.f6774b0) ? false : true;
            if (z3 && this.f6773a0 == null) {
                if (this.f6772W == null) {
                    this.f6772W = w0.b(new v0(this, 0));
                }
                w0.c(a5, this.f6772W);
                this.f6773a0 = a5;
                return;
            }
            if (z3 || (onBackInvokedDispatcher = this.f6773a0) == null) {
                return;
            }
            w0.d(onBackInvokedDispatcher, this.f6772W);
            this.f6773a0 = null;
        }
    }

    public void setBackInvokedCallbackEnabled(boolean z3) {
        if (this.f6774b0 != z3) {
            this.f6774b0 = z3;
            s();
        }
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(AbstractC2346c.p(getContext(), i));
    }

    public void setCollapsible(boolean z3) {
        this.f6771V = z3;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f6757F) {
            this.f6757F = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f6756E) {
            this.f6756E = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(AbstractC2346c.p(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(AbstractC2346c.p(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        f();
        this.f6779n.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f6776k.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f6786u != i) {
            this.f6786u = i;
            if (i == 0) {
                this.f6785t = getContext();
            } else {
                this.f6785t = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.f6754C = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f6752A = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f6791z = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f6753B = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        y0 y0Var = new y0(context, attributeSet);
        y0Var.f18333a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1986a.f17170b);
        y0Var.f18333a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        y0Var.f18334b = 0;
        return y0Var;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        r rVar = this.f6783r;
        if (rVar != null) {
            rVar.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f6783r.setImageDrawable(drawable);
        } else {
            r rVar = this.f6783r;
            if (rVar != null) {
                rVar.setImageDrawable(this.f6781p);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f6780o == null) {
                this.f6780o = new C2148s(getContext(), 0);
            }
            if (!m(this.f6780o)) {
                b(this.f6780o, true);
            }
        } else {
            C2148s c2148s = this.f6780o;
            if (c2148s != null && m(c2148s)) {
                removeView(this.f6780o);
                this.f6764O.remove(this.f6780o);
            }
        }
        C2148s c2148s2 = this.f6780o;
        if (c2148s2 != null) {
            c2148s2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f6780o == null) {
            this.f6780o = new C2148s(getContext(), 0);
        }
        C2148s c2148s = this.f6780o;
        if (c2148s != null) {
            c2148s.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            f();
        }
        r rVar = this.f6779n;
        if (rVar != null) {
            rVar.setContentDescription(charSequence);
            AbstractC2346c.E(this.f6779n, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            f();
            if (!m(this.f6779n)) {
                b(this.f6779n, true);
            }
        } else {
            r rVar = this.f6779n;
            if (rVar != null && m(rVar)) {
                removeView(this.f6779n);
                this.f6764O.remove(this.f6779n);
            }
        }
        r rVar2 = this.f6779n;
        if (rVar2 != null) {
            rVar2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C2111E c2111e = this.f6778m;
            if (c2111e != null && m(c2111e)) {
                removeView(this.f6778m);
                this.f6764O.remove(this.f6778m);
            }
        } else {
            if (this.f6778m == null) {
                Context context = getContext();
                C2111E c2111e2 = new C2111E(context, null);
                this.f6778m = c2111e2;
                c2111e2.setSingleLine();
                this.f6778m.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f6788w;
                if (i != 0) {
                    this.f6778m.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.K;
                if (colorStateList != null) {
                    this.f6778m.setTextColor(colorStateList);
                }
            }
            if (!m(this.f6778m)) {
                b(this.f6778m, true);
            }
        }
        C2111E c2111e3 = this.f6778m;
        if (c2111e3 != null) {
            c2111e3.setText(charSequence);
        }
        this.f6760I = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.K = colorStateList;
        C2111E c2111e = this.f6778m;
        if (c2111e != null) {
            c2111e.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C2111E c2111e = this.f6777l;
            if (c2111e != null && m(c2111e)) {
                removeView(this.f6777l);
                this.f6764O.remove(this.f6777l);
            }
        } else {
            if (this.f6777l == null) {
                Context context = getContext();
                C2111E c2111e2 = new C2111E(context, null);
                this.f6777l = c2111e2;
                c2111e2.setSingleLine();
                this.f6777l.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f6787v;
                if (i != 0) {
                    this.f6777l.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.J;
                if (colorStateList != null) {
                    this.f6777l.setTextColor(colorStateList);
                }
            }
            if (!m(this.f6777l)) {
                b(this.f6777l, true);
            }
        }
        C2111E c2111e3 = this.f6777l;
        if (c2111e3 != null) {
            c2111e3.setText(charSequence);
        }
        this.f6759H = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.J = colorStateList;
        C2111E c2111e = this.f6777l;
        if (c2111e != null) {
            c2111e.setTextColor(colorStateList);
        }
    }

    public void setOnMenuItemClickListener(z0 z0Var) {
    }
}
