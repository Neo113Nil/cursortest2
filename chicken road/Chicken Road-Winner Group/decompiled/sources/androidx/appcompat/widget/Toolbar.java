package androidx.appcompat.widget;

import A0.j;
import D.z;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
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
import com.chicken.jump.road.pump.R;
import g.AbstractC0301a;
import h.AbstractC0323a;
import io.flutter.plugin.editing.k;
import j.d;
import java.lang.reflect.Field;
import java.util.ArrayList;
import k.MenuC1069j;
import k.MenuItemC1070k;
import l.C1087f;
import l.C1090i;
import l.C1097p;
import l.C1098q;
import l.C1101u;
import l.InterfaceC1104x;
import l.Q;
import l.k0;
import l.l0;
import l.m0;
import l.n0;
import l.o0;
import l.p0;
import l.v0;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f2059A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f2060B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f2061C;

    /* renamed from: D, reason: collision with root package name */
    public final ArrayList f2062D;

    /* renamed from: E, reason: collision with root package name */
    public final ArrayList f2063E;

    /* renamed from: F, reason: collision with root package name */
    public final int[] f2064F;

    /* renamed from: G, reason: collision with root package name */
    public final k f2065G;

    /* renamed from: H, reason: collision with root package name */
    public p0 f2066H;

    /* renamed from: I, reason: collision with root package name */
    public l0 f2067I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f2068J;

    /* renamed from: K, reason: collision with root package name */
    public final A.b f2069K;

    /* renamed from: a, reason: collision with root package name */
    public ActionMenuView f2070a;

    /* renamed from: b, reason: collision with root package name */
    public C1101u f2071b;

    /* renamed from: c, reason: collision with root package name */
    public C1101u f2072c;

    /* renamed from: d, reason: collision with root package name */
    public C1097p f2073d;

    /* renamed from: e, reason: collision with root package name */
    public C1098q f2074e;
    public final Drawable f;

    /* renamed from: g, reason: collision with root package name */
    public final CharSequence f2075g;

    /* renamed from: h, reason: collision with root package name */
    public C1097p f2076h;

    /* renamed from: i, reason: collision with root package name */
    public View f2077i;

    /* renamed from: j, reason: collision with root package name */
    public Context f2078j;

    /* renamed from: k, reason: collision with root package name */
    public int f2079k;

    /* renamed from: l, reason: collision with root package name */
    public int f2080l;

    /* renamed from: m, reason: collision with root package name */
    public int f2081m;

    /* renamed from: n, reason: collision with root package name */
    public final int f2082n;

    /* renamed from: o, reason: collision with root package name */
    public final int f2083o;

    /* renamed from: p, reason: collision with root package name */
    public int f2084p;

    /* renamed from: q, reason: collision with root package name */
    public int f2085q;

    /* renamed from: r, reason: collision with root package name */
    public int f2086r;

    /* renamed from: s, reason: collision with root package name */
    public int f2087s;

    /* renamed from: t, reason: collision with root package name */
    public Q f2088t;

    /* renamed from: u, reason: collision with root package name */
    public int f2089u;

    /* renamed from: v, reason: collision with root package name */
    public int f2090v;

    /* renamed from: w, reason: collision with root package name */
    public final int f2091w;

    /* renamed from: x, reason: collision with root package name */
    public CharSequence f2092x;
    public CharSequence y;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f2093z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f2091w = 8388627;
        this.f2062D = new ArrayList();
        this.f2063E = new ArrayList();
        this.f2064F = new int[2];
        this.f2065G = new k(this);
        this.f2069K = new A.b(15, this);
        j I3 = j.I(getContext(), attributeSet, AbstractC0301a.f4944t, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) I3.f67c;
        this.f2080l = typedArray.getResourceId(28, 0);
        this.f2081m = typedArray.getResourceId(19, 0);
        this.f2091w = typedArray.getInteger(0, 8388627);
        this.f2082n = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f2087s = dimensionPixelOffset;
        this.f2086r = dimensionPixelOffset;
        this.f2085q = dimensionPixelOffset;
        this.f2084p = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f2084p = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f2085q = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f2086r = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f2087s = dimensionPixelOffset5;
        }
        this.f2083o = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        Q q3 = this.f2088t;
        q3.f9751h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            q3.f9749e = dimensionPixelSize;
            q3.f9745a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            q3.f = dimensionPixelSize2;
            q3.f9746b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            q3.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f2089u = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f2090v = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f = I3.A(4);
        this.f2075g = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f2078j = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable A3 = I3.A(16);
        if (A3 != null) {
            setNavigationIcon(A3);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable A4 = I3.A(11);
        if (A4 != null) {
            setLogo(A4);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(I3.z(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(I3.z(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        I3.L();
    }

    public static m0 g() {
        m0 m0Var = new m0(-2, -2);
        m0Var.f9836b = 0;
        m0Var.f9835a = 8388627;
        return m0Var;
    }

    private MenuInflater getMenuInflater() {
        return new d(getContext());
    }

    public static m0 h(ViewGroup.LayoutParams layoutParams) {
        boolean z3 = layoutParams instanceof m0;
        if (z3) {
            m0 m0Var = (m0) layoutParams;
            m0 m0Var2 = new m0(m0Var);
            m0Var2.f9836b = 0;
            m0Var2.f9836b = m0Var.f9836b;
            return m0Var2;
        }
        if (z3) {
            m0 m0Var3 = new m0((m0) layoutParams);
            m0Var3.f9836b = 0;
            return m0Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            m0 m0Var4 = new m0(layoutParams);
            m0Var4.f9836b = 0;
            return m0Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        m0 m0Var5 = new m0(marginLayoutParams);
        m0Var5.f9836b = 0;
        ((ViewGroup.MarginLayoutParams) m0Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) m0Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) m0Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) m0Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return m0Var5;
    }

    public static int j(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(ArrayList arrayList, int i3) {
        Field field = z.f259a;
        boolean z3 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i3, getLayoutDirection());
        arrayList.clear();
        if (!z3) {
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                m0 m0Var = (m0) childAt.getLayoutParams();
                if (m0Var.f9836b == 0 && q(childAt)) {
                    int i5 = m0Var.f9835a;
                    Field field2 = z.f259a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, layoutDirection) & 7;
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
        for (int i6 = childCount - 1; i6 >= 0; i6--) {
            View childAt2 = getChildAt(i6);
            m0 m0Var2 = (m0) childAt2.getLayoutParams();
            if (m0Var2.f9836b == 0 && q(childAt2)) {
                int i7 = m0Var2.f9835a;
                Field field3 = z.f259a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i7, layoutDirection2) & 7;
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
        m0 g3 = layoutParams == null ? g() : !checkLayoutParams(layoutParams) ? h(layoutParams) : (m0) layoutParams;
        g3.f9836b = 1;
        if (!z3 || this.f2077i == null) {
            addView(view, g3);
        } else {
            view.setLayoutParams(g3);
            this.f2063E.add(view);
        }
    }

    public final void c() {
        if (this.f2076h == null) {
            C1097p c1097p = new C1097p(getContext());
            this.f2076h = c1097p;
            c1097p.setImageDrawable(this.f);
            this.f2076h.setContentDescription(this.f2075g);
            m0 g3 = g();
            g3.f9835a = (this.f2082n & 112) | 8388611;
            g3.f9836b = 2;
            this.f2076h.setLayoutParams(g3);
            this.f2076h.setOnClickListener(new k0(this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof m0);
    }

    public final void d() {
        if (this.f2088t == null) {
            Q q3 = new Q();
            q3.f9745a = 0;
            q3.f9746b = 0;
            q3.f9747c = Integer.MIN_VALUE;
            q3.f9748d = Integer.MIN_VALUE;
            q3.f9749e = 0;
            q3.f = 0;
            q3.f9750g = false;
            q3.f9751h = false;
            this.f2088t = q3;
        }
    }

    public final void e() {
        if (this.f2070a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f2070a = actionMenuView;
            actionMenuView.setPopupTheme(this.f2079k);
            this.f2070a.setOnMenuItemClickListener(this.f2065G);
            this.f2070a.getClass();
            m0 g3 = g();
            g3.f9835a = (this.f2082n & 112) | 8388613;
            this.f2070a.setLayoutParams(g3);
            b(this.f2070a, false);
        }
        ActionMenuView actionMenuView2 = this.f2070a;
        if (actionMenuView2.f1963p == null) {
            MenuC1069j menuC1069j = (MenuC1069j) actionMenuView2.getMenu();
            if (this.f2067I == null) {
                this.f2067I = new l0(this);
            }
            this.f2070a.setExpandedActionViewsExclusive(true);
            menuC1069j.b(this.f2067I, this.f2078j);
        }
    }

    public final void f() {
        if (this.f2073d == null) {
            this.f2073d = new C1097p(getContext());
            m0 g3 = g();
            g3.f9835a = (this.f2082n & 112) | 8388611;
            this.f2073d.setLayoutParams(g3);
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
        C1097p c1097p = this.f2076h;
        if (c1097p != null) {
            return c1097p.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C1097p c1097p = this.f2076h;
        if (c1097p != null) {
            return c1097p.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        Q q3 = this.f2088t;
        if (q3 != null) {
            return q3.f9750g ? q3.f9745a : q3.f9746b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i3 = this.f2090v;
        return i3 != Integer.MIN_VALUE ? i3 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        Q q3 = this.f2088t;
        if (q3 != null) {
            return q3.f9745a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        Q q3 = this.f2088t;
        if (q3 != null) {
            return q3.f9746b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        Q q3 = this.f2088t;
        if (q3 != null) {
            return q3.f9750g ? q3.f9746b : q3.f9745a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i3 = this.f2089u;
        return i3 != Integer.MIN_VALUE ? i3 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        MenuC1069j menuC1069j;
        ActionMenuView actionMenuView = this.f2070a;
        return (actionMenuView == null || (menuC1069j = actionMenuView.f1963p) == null || !menuC1069j.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f2090v, 0));
    }

    public int getCurrentContentInsetLeft() {
        Field field = z.f259a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        Field field = z.f259a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f2089u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C1098q c1098q = this.f2074e;
        if (c1098q != null) {
            return c1098q.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C1098q c1098q = this.f2074e;
        if (c1098q != null) {
            return c1098q.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f2070a.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        C1097p c1097p = this.f2073d;
        if (c1097p != null) {
            return c1097p.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C1097p c1097p = this.f2073d;
        if (c1097p != null) {
            return c1097p.getDrawable();
        }
        return null;
    }

    public C1090i getOuterActionMenuPresenter() {
        return null;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f2070a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f2078j;
    }

    public int getPopupTheme() {
        return this.f2079k;
    }

    public CharSequence getSubtitle() {
        return this.y;
    }

    public final TextView getSubtitleTextView() {
        return this.f2072c;
    }

    public CharSequence getTitle() {
        return this.f2092x;
    }

    public int getTitleMarginBottom() {
        return this.f2087s;
    }

    public int getTitleMarginEnd() {
        return this.f2085q;
    }

    public int getTitleMarginStart() {
        return this.f2084p;
    }

    public int getTitleMarginTop() {
        return this.f2086r;
    }

    public final TextView getTitleTextView() {
        return this.f2071b;
    }

    public InterfaceC1104x getWrapper() {
        Drawable drawable;
        if (this.f2066H == null) {
            p0 p0Var = new p0();
            p0Var.f9859l = 0;
            p0Var.f9849a = this;
            p0Var.f9855h = getTitle();
            p0Var.f9856i = getSubtitle();
            p0Var.f9854g = p0Var.f9855h != null;
            p0Var.f = getNavigationIcon();
            j I3 = j.I(getContext(), null, AbstractC0301a.f4926a, R.attr.actionBarStyle);
            p0Var.f9860m = I3.A(15);
            TypedArray typedArray = (TypedArray) I3.f67c;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                p0Var.f9854g = true;
                p0Var.f9855h = text;
                if ((p0Var.f9850b & 8) != 0) {
                    p0Var.f9849a.setTitle(text);
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                p0Var.f9856i = text2;
                if ((p0Var.f9850b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable A3 = I3.A(20);
            if (A3 != null) {
                p0Var.f9853e = A3;
                p0Var.c();
            }
            Drawable A4 = I3.A(17);
            if (A4 != null) {
                p0Var.f9852d = A4;
                p0Var.c();
            }
            if (p0Var.f == null && (drawable = p0Var.f9860m) != null) {
                p0Var.f = drawable;
                int i3 = p0Var.f9850b & 4;
                Toolbar toolbar = p0Var.f9849a;
                if (i3 != 0) {
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            p0Var.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = p0Var.f9851c;
                if (view != null && (p0Var.f9850b & 16) != 0) {
                    removeView(view);
                }
                p0Var.f9851c = inflate;
                if (inflate != null && (p0Var.f9850b & 16) != 0) {
                    addView(inflate);
                }
                p0Var.a(p0Var.f9850b | 16);
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
                this.f2088t.a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f2080l = resourceId2;
                C1101u c1101u = this.f2071b;
                if (c1101u != null) {
                    c1101u.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f2081m = resourceId3;
                C1101u c1101u2 = this.f2072c;
                if (c1101u2 != null) {
                    c1101u2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            I3.L();
            if (R.string.abc_action_bar_up_description != p0Var.f9859l) {
                p0Var.f9859l = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i4 = p0Var.f9859l;
                    p0Var.f9857j = i4 != 0 ? getContext().getString(i4) : null;
                    p0Var.b();
                }
            }
            p0Var.f9857j = getNavigationContentDescription();
            setNavigationOnClickListener(new k0(p0Var));
            this.f2066H = p0Var;
        }
        return this.f2066H;
    }

    public final int i(View view, int i3) {
        m0 m0Var = (m0) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i3 > 0 ? (measuredHeight - i3) / 2 : 0;
        int i5 = m0Var.f9835a & 112;
        if (i5 != 16 && i5 != 48 && i5 != 80) {
            i5 = this.f2091w & 112;
        }
        if (i5 == 48) {
            return getPaddingTop() - i4;
        }
        if (i5 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) m0Var).bottomMargin) - i4;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i6 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i7 = ((ViewGroup.MarginLayoutParams) m0Var).topMargin;
        if (i6 < i7) {
            i6 = i7;
        } else {
            int i8 = (((height - paddingBottom) - measuredHeight) - i6) - paddingTop;
            int i9 = ((ViewGroup.MarginLayoutParams) m0Var).bottomMargin;
            if (i8 < i9) {
                i6 = Math.max(0, i6 - (i9 - i8));
            }
        }
        return paddingTop + i6;
    }

    public final boolean l(View view) {
        return view.getParent() == this || this.f2063E.contains(view);
    }

    public final int m(View view, int i3, int i4, int[] iArr) {
        m0 m0Var = (m0) view.getLayoutParams();
        int i5 = ((ViewGroup.MarginLayoutParams) m0Var).leftMargin - iArr[0];
        int max = Math.max(0, i5) + i3;
        iArr[0] = Math.max(0, -i5);
        int i6 = i(view, i4);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, i6, max + measuredWidth, view.getMeasuredHeight() + i6);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) m0Var).rightMargin + max;
    }

    public final int n(View view, int i3, int i4, int[] iArr) {
        m0 m0Var = (m0) view.getLayoutParams();
        int i5 = ((ViewGroup.MarginLayoutParams) m0Var).rightMargin - iArr[1];
        int max = i3 - Math.max(0, i5);
        iArr[1] = Math.max(0, -i5);
        int i6 = i(view, i4);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, i6, max, view.getMeasuredHeight() + i6);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) m0Var).leftMargin);
    }

    public final int o(View view, int i3, int i4, int i5, int i6, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i7 = marginLayoutParams.leftMargin - iArr[0];
        int i8 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i8) + Math.max(0, i7);
        iArr[0] = Math.max(0, -i7);
        iArr[1] = Math.max(0, -i8);
        view.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + max + i4, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i5, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i6, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f2069K);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f2061C = false;
        }
        if (!this.f2061C) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f2061C = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f2061C = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0295 A[LOOP:0: B:40:0x0293->B:41:0x0295, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02ad A[LOOP:1: B:44:0x02ab->B:45:0x02ad, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02cd A[LOOP:2: B:48:0x02cb->B:49:0x02cd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0321 A[LOOP:3: B:57:0x031f->B:58:0x0321, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x021c  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        boolean q3;
        boolean q4;
        int i9;
        int i10;
        int i11;
        boolean z4;
        int paddingTop;
        int i12;
        int i13;
        int max;
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
        int size4;
        int i21;
        Field field = z.f259a;
        boolean z5 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i22 = width - paddingRight;
        int[] iArr = this.f2064F;
        iArr[1] = 0;
        iArr[0] = 0;
        int minimumHeight = getMinimumHeight();
        int min = minimumHeight >= 0 ? Math.min(minimumHeight, i6 - i4) : 0;
        if (!q(this.f2073d)) {
            i7 = paddingLeft;
        } else {
            if (z5) {
                i8 = n(this.f2073d, i22, min, iArr);
                i7 = paddingLeft;
                if (q(this.f2076h)) {
                    if (z5) {
                        i8 = n(this.f2076h, i8, min, iArr);
                    } else {
                        i7 = m(this.f2076h, i7, min, iArr);
                    }
                }
                if (q(this.f2070a)) {
                    if (z5) {
                        i7 = m(this.f2070a, i7, min, iArr);
                    } else {
                        i8 = n(this.f2070a, i8, min, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - i7);
                iArr[1] = Math.max(0, currentContentInsetRight - (i22 - i8));
                int max2 = Math.max(i7, currentContentInsetLeft);
                int min2 = Math.min(i8, i22 - currentContentInsetRight);
                if (q(this.f2077i)) {
                    if (z5) {
                        min2 = n(this.f2077i, min2, min, iArr);
                    } else {
                        max2 = m(this.f2077i, max2, min, iArr);
                    }
                }
                if (q(this.f2074e)) {
                    if (z5) {
                        min2 = n(this.f2074e, min2, min, iArr);
                    } else {
                        max2 = m(this.f2074e, max2, min, iArr);
                    }
                }
                q3 = q(this.f2071b);
                q4 = q(this.f2072c);
                if (q3) {
                    i9 = max2;
                    i10 = 0;
                } else {
                    m0 m0Var = (m0) this.f2071b.getLayoutParams();
                    i9 = max2;
                    i10 = this.f2071b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) m0Var).topMargin + ((ViewGroup.MarginLayoutParams) m0Var).bottomMargin;
                }
                if (!q4) {
                    m0 m0Var2 = (m0) this.f2072c.getLayoutParams();
                    i10 = this.f2072c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) m0Var2).topMargin + ((ViewGroup.MarginLayoutParams) m0Var2).bottomMargin + i10;
                }
                if (!q3 || q4) {
                    C1101u c1101u = !q3 ? this.f2071b : this.f2072c;
                    C1101u c1101u2 = !q4 ? this.f2072c : this.f2071b;
                    m0 m0Var3 = (m0) c1101u.getLayoutParams();
                    m0 m0Var4 = (m0) c1101u2.getLayoutParams();
                    int i23 = i10;
                    boolean z6 = (!q3 && this.f2071b.getMeasuredWidth() > 0) || (q4 && this.f2072c.getMeasuredWidth() > 0);
                    i11 = this.f2091w & 112;
                    z4 = z5;
                    if (i11 != 48) {
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) m0Var3).topMargin + this.f2086r;
                    } else if (i11 != 80) {
                        int i24 = (((height - paddingTop2) - paddingBottom) - i23) / 2;
                        int i25 = ((ViewGroup.MarginLayoutParams) m0Var3).topMargin + this.f2086r;
                        if (i24 < i25) {
                            i24 = i25;
                        } else {
                            int i26 = (((height - paddingBottom) - i23) - i24) - paddingTop2;
                            int i27 = ((ViewGroup.MarginLayoutParams) m0Var3).bottomMargin;
                            int i28 = this.f2087s;
                            if (i26 < i27 + i28) {
                                i24 = Math.max(0, i24 - ((((ViewGroup.MarginLayoutParams) m0Var4).bottomMargin + i28) - i26));
                            }
                        }
                        paddingTop = paddingTop2 + i24;
                    } else {
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) m0Var4).bottomMargin) - this.f2087s) - i23;
                    }
                    if (z4) {
                        int i29 = (z6 ? this.f2084p : 0) - iArr[0];
                        int max3 = Math.max(0, i29) + i9;
                        iArr[0] = Math.max(0, -i29);
                        if (q3) {
                            m0 m0Var5 = (m0) this.f2071b.getLayoutParams();
                            int measuredWidth = this.f2071b.getMeasuredWidth() + max3;
                            int measuredHeight = this.f2071b.getMeasuredHeight() + paddingTop;
                            this.f2071b.layout(max3, paddingTop, measuredWidth, measuredHeight);
                            i12 = measuredWidth + this.f2085q;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) m0Var5).bottomMargin;
                        } else {
                            i12 = max3;
                        }
                        if (q4) {
                            int i30 = paddingTop + ((ViewGroup.MarginLayoutParams) ((m0) this.f2072c.getLayoutParams())).topMargin;
                            int measuredWidth2 = this.f2072c.getMeasuredWidth() + max3;
                            this.f2072c.layout(max3, i30, measuredWidth2, this.f2072c.getMeasuredHeight() + i30);
                            i13 = measuredWidth2 + this.f2085q;
                        } else {
                            i13 = max3;
                        }
                        max = z6 ? Math.max(i12, i13) : max3;
                        ArrayList arrayList = this.f2062D;
                        a(arrayList, 3);
                        size = arrayList.size();
                        i16 = max;
                        for (i17 = 0; i17 < size; i17++) {
                            i16 = m((View) arrayList.get(i17), i16, min, iArr);
                        }
                        a(arrayList, 5);
                        size2 = arrayList.size();
                        for (i18 = 0; i18 < size2; i18++) {
                            min2 = n((View) arrayList.get(i18), min2, min, iArr);
                        }
                        a(arrayList, 1);
                        int i31 = iArr[0];
                        int i32 = iArr[1];
                        size3 = arrayList.size();
                        int i33 = i31;
                        i19 = 0;
                        int i34 = 0;
                        while (i19 < size3) {
                            View view = (View) arrayList.get(i19);
                            m0 m0Var6 = (m0) view.getLayoutParams();
                            int i35 = i32;
                            int i36 = ((ViewGroup.MarginLayoutParams) m0Var6).leftMargin - i33;
                            int i37 = ((ViewGroup.MarginLayoutParams) m0Var6).rightMargin - i35;
                            int max4 = Math.max(0, i36);
                            int max5 = Math.max(0, i37);
                            int max6 = Math.max(0, -i36);
                            int max7 = Math.max(0, -i37);
                            i34 += view.getMeasuredWidth() + max4 + max5;
                            i19++;
                            i33 = max6;
                            i32 = max7;
                        }
                        i20 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (i34 / 2);
                        int i38 = i34 + i20;
                        if (i20 >= i16) {
                            i16 = i38 > min2 ? i20 - (i38 - min2) : i20;
                        }
                        size4 = arrayList.size();
                        for (i21 = 0; i21 < size4; i21++) {
                            i16 = m((View) arrayList.get(i21), i16, min, iArr);
                        }
                        arrayList.clear();
                        return;
                    }
                    int i39 = (z6 ? this.f2084p : 0) - iArr[1];
                    min2 -= Math.max(0, i39);
                    iArr[1] = Math.max(0, -i39);
                    if (q3) {
                        m0 m0Var7 = (m0) this.f2071b.getLayoutParams();
                        int measuredWidth3 = min2 - this.f2071b.getMeasuredWidth();
                        int measuredHeight2 = this.f2071b.getMeasuredHeight() + paddingTop;
                        this.f2071b.layout(measuredWidth3, paddingTop, min2, measuredHeight2);
                        i14 = measuredWidth3 - this.f2085q;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) m0Var7).bottomMargin;
                    } else {
                        i14 = min2;
                    }
                    if (q4) {
                        int i40 = paddingTop + ((ViewGroup.MarginLayoutParams) ((m0) this.f2072c.getLayoutParams())).topMargin;
                        this.f2072c.layout(min2 - this.f2072c.getMeasuredWidth(), i40, min2, this.f2072c.getMeasuredHeight() + i40);
                        i15 = min2 - this.f2085q;
                    } else {
                        i15 = min2;
                    }
                    if (z6) {
                        min2 = Math.min(i14, i15);
                    }
                }
                max = i9;
                ArrayList arrayList2 = this.f2062D;
                a(arrayList2, 3);
                size = arrayList2.size();
                i16 = max;
                while (i17 < size) {
                }
                a(arrayList2, 5);
                size2 = arrayList2.size();
                while (i18 < size2) {
                }
                a(arrayList2, 1);
                int i312 = iArr[0];
                int i322 = iArr[1];
                size3 = arrayList2.size();
                int i332 = i312;
                i19 = 0;
                int i342 = 0;
                while (i19 < size3) {
                }
                i20 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (i342 / 2);
                int i382 = i342 + i20;
                if (i20 >= i16) {
                }
                size4 = arrayList2.size();
                while (i21 < size4) {
                }
                arrayList2.clear();
                return;
            }
            i7 = m(this.f2073d, paddingLeft, min, iArr);
        }
        i8 = i22;
        if (q(this.f2076h)) {
        }
        if (q(this.f2070a)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i7);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i22 - i8));
        int max22 = Math.max(i7, currentContentInsetLeft2);
        int min22 = Math.min(i8, i22 - currentContentInsetRight2);
        if (q(this.f2077i)) {
        }
        if (q(this.f2074e)) {
        }
        q3 = q(this.f2071b);
        q4 = q(this.f2072c);
        if (q3) {
        }
        if (!q4) {
        }
        if (!q3) {
        }
        if (!q3) {
        }
        if (!q4) {
        }
        m0 m0Var32 = (m0) c1101u.getLayoutParams();
        m0 m0Var42 = (m0) c1101u2.getLayoutParams();
        int i232 = i10;
        if (q3) {
        }
        i11 = this.f2091w & 112;
        z4 = z5;
        if (i11 != 48) {
        }
        if (z4) {
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean a3 = v0.a(this);
        int i12 = !a3 ? 1 : 0;
        int i13 = 0;
        if (q(this.f2073d)) {
            p(this.f2073d, i3, 0, i4, this.f2083o);
            i5 = j(this.f2073d) + this.f2073d.getMeasuredWidth();
            i6 = Math.max(0, k(this.f2073d) + this.f2073d.getMeasuredHeight());
            i7 = View.combineMeasuredStates(0, this.f2073d.getMeasuredState());
        } else {
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (q(this.f2076h)) {
            p(this.f2076h, i3, 0, i4, this.f2083o);
            i5 = j(this.f2076h) + this.f2076h.getMeasuredWidth();
            i6 = Math.max(i6, k(this.f2076h) + this.f2076h.getMeasuredHeight());
            i7 = View.combineMeasuredStates(i7, this.f2076h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i5);
        int max2 = Math.max(0, currentContentInsetStart - i5);
        int[] iArr = this.f2064F;
        iArr[a3 ? 1 : 0] = max2;
        if (q(this.f2070a)) {
            p(this.f2070a, i3, max, i4, this.f2083o);
            i8 = j(this.f2070a) + this.f2070a.getMeasuredWidth();
            i6 = Math.max(i6, k(this.f2070a) + this.f2070a.getMeasuredHeight());
            i7 = View.combineMeasuredStates(i7, this.f2070a.getMeasuredState());
        } else {
            i8 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i8);
        iArr[i12] = Math.max(0, currentContentInsetEnd - i8);
        if (q(this.f2077i)) {
            max3 += o(this.f2077i, i3, max3, i4, 0, iArr);
            i6 = Math.max(i6, k(this.f2077i) + this.f2077i.getMeasuredHeight());
            i7 = View.combineMeasuredStates(i7, this.f2077i.getMeasuredState());
        }
        if (q(this.f2074e)) {
            max3 += o(this.f2074e, i3, max3, i4, 0, iArr);
            i6 = Math.max(i6, k(this.f2074e) + this.f2074e.getMeasuredHeight());
            i7 = View.combineMeasuredStates(i7, this.f2074e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (((m0) childAt.getLayoutParams()).f9836b == 0 && q(childAt)) {
                max3 += o(childAt, i3, max3, i4, 0, iArr);
                int max4 = Math.max(i6, k(childAt) + childAt.getMeasuredHeight());
                i7 = View.combineMeasuredStates(i7, childAt.getMeasuredState());
                i6 = max4;
            } else {
                max3 = max3;
            }
        }
        int i15 = max3;
        int i16 = this.f2086r + this.f2087s;
        int i17 = this.f2084p + this.f2085q;
        if (q(this.f2071b)) {
            o(this.f2071b, i3, i15 + i17, i4, i16, iArr);
            int j3 = j(this.f2071b) + this.f2071b.getMeasuredWidth();
            i9 = k(this.f2071b) + this.f2071b.getMeasuredHeight();
            i10 = View.combineMeasuredStates(i7, this.f2071b.getMeasuredState());
            i11 = j3;
        } else {
            i9 = 0;
            i10 = i7;
            i11 = 0;
        }
        if (q(this.f2072c)) {
            i11 = Math.max(i11, o(this.f2072c, i3, i15 + i17, i4, i16 + i9, iArr));
            i9 += k(this.f2072c) + this.f2072c.getMeasuredHeight();
            i10 = View.combineMeasuredStates(i10, this.f2072c.getMeasuredState());
        }
        int max5 = Math.max(i6, i9);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i15 + i11;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max5;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i3, (-16777216) & i10);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i4, i10 << 16);
        if (this.f2068J) {
            int childCount2 = getChildCount();
            for (int i18 = 0; i18 < childCount2; i18++) {
                View childAt2 = getChildAt(i18);
                if (!q(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
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
        if (!(parcelable instanceof o0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o0 o0Var = (o0) parcelable;
        super.onRestoreInstanceState(o0Var.f694a);
        ActionMenuView actionMenuView = this.f2070a;
        MenuC1069j menuC1069j = actionMenuView != null ? actionMenuView.f1963p : null;
        int i3 = o0Var.f9845c;
        if (i3 != 0 && this.f2067I != null && menuC1069j != null && (findItem = menuC1069j.findItem(i3)) != null) {
            findItem.expandActionView();
        }
        if (o0Var.f9846d) {
            A.b bVar = this.f2069K;
            removeCallbacks(bVar);
            post(bVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i3) {
        super.onRtlPropertiesChanged(i3);
        d();
        Q q3 = this.f2088t;
        boolean z3 = i3 == 1;
        if (z3 == q3.f9750g) {
            return;
        }
        q3.f9750g = z3;
        if (!q3.f9751h) {
            q3.f9745a = q3.f9749e;
            q3.f9746b = q3.f;
            return;
        }
        if (z3) {
            int i4 = q3.f9748d;
            if (i4 == Integer.MIN_VALUE) {
                i4 = q3.f9749e;
            }
            q3.f9745a = i4;
            int i5 = q3.f9747c;
            if (i5 == Integer.MIN_VALUE) {
                i5 = q3.f;
            }
            q3.f9746b = i5;
            return;
        }
        int i6 = q3.f9747c;
        if (i6 == Integer.MIN_VALUE) {
            i6 = q3.f9749e;
        }
        q3.f9745a = i6;
        int i7 = q3.f9748d;
        if (i7 == Integer.MIN_VALUE) {
            i7 = q3.f;
        }
        q3.f9746b = i7;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C1090i c1090i;
        C1087f c1087f;
        MenuItemC1070k menuItemC1070k;
        o0 o0Var = new o0(super.onSaveInstanceState());
        l0 l0Var = this.f2067I;
        if (l0Var != null && (menuItemC1070k = l0Var.f9830b) != null) {
            o0Var.f9845c = menuItemC1070k.f9601a;
        }
        ActionMenuView actionMenuView = this.f2070a;
        o0Var.f9846d = (actionMenuView == null || (c1090i = actionMenuView.f1966s) == null || (c1087f = c1090i.f9816r) == null || !c1087f.b()) ? false : true;
        return o0Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2060B = false;
        }
        if (!this.f2060B) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f2060B = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f2060B = false;
        return true;
    }

    public final void p(View view, int i3, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i4, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i5, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i6 >= 0) {
            if (mode != 0) {
                i6 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i6);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean q(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public void setCollapseContentDescription(int i3) {
        setCollapseContentDescription(i3 != 0 ? getContext().getText(i3) : null);
    }

    public void setCollapseIcon(int i3) {
        setCollapseIcon(AbstractC0323a.a(getContext(), i3));
    }

    public void setCollapsible(boolean z3) {
        this.f2068J = z3;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i3) {
        if (i3 < 0) {
            i3 = Integer.MIN_VALUE;
        }
        if (i3 != this.f2090v) {
            this.f2090v = i3;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i3) {
        if (i3 < 0) {
            i3 = Integer.MIN_VALUE;
        }
        if (i3 != this.f2089u) {
            this.f2089u = i3;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i3) {
        setLogo(AbstractC0323a.a(getContext(), i3));
    }

    public void setLogoDescription(int i3) {
        setLogoDescription(getContext().getText(i3));
    }

    public void setNavigationContentDescription(int i3) {
        setNavigationContentDescription(i3 != 0 ? getContext().getText(i3) : null);
    }

    public void setNavigationIcon(int i3) {
        setNavigationIcon(AbstractC0323a.a(getContext(), i3));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        f();
        this.f2073d.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f2070a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i3) {
        if (this.f2079k != i3) {
            this.f2079k = i3;
            if (i3 == 0) {
                this.f2078j = getContext();
            } else {
                this.f2078j = new ContextThemeWrapper(getContext(), i3);
            }
        }
    }

    public void setSubtitle(int i3) {
        setSubtitle(getContext().getText(i3));
    }

    public void setSubtitleTextColor(int i3) {
        setSubtitleTextColor(ColorStateList.valueOf(i3));
    }

    public void setTitle(int i3) {
        setTitle(getContext().getText(i3));
    }

    public void setTitleMarginBottom(int i3) {
        this.f2087s = i3;
        requestLayout();
    }

    public void setTitleMarginEnd(int i3) {
        this.f2085q = i3;
        requestLayout();
    }

    public void setTitleMarginStart(int i3) {
        this.f2084p = i3;
        requestLayout();
    }

    public void setTitleMarginTop(int i3) {
        this.f2086r = i3;
        requestLayout();
    }

    public void setTitleTextColor(int i3) {
        setTitleTextColor(ColorStateList.valueOf(i3));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        m0 m0Var = new m0(context, attributeSet);
        m0Var.f9835a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0301a.f4927b);
        m0Var.f9835a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        m0Var.f9836b = 0;
        return m0Var;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        C1097p c1097p = this.f2076h;
        if (c1097p != null) {
            c1097p.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f2076h.setImageDrawable(drawable);
        } else {
            C1097p c1097p = this.f2076h;
            if (c1097p != null) {
                c1097p.setImageDrawable(this.f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f2074e == null) {
                this.f2074e = new C1098q(getContext(), 0);
            }
            if (!l(this.f2074e)) {
                b(this.f2074e, true);
            }
        } else {
            C1098q c1098q = this.f2074e;
            if (c1098q != null && l(c1098q)) {
                removeView(this.f2074e);
                this.f2063E.remove(this.f2074e);
            }
        }
        C1098q c1098q2 = this.f2074e;
        if (c1098q2 != null) {
            c1098q2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f2074e == null) {
            this.f2074e = new C1098q(getContext(), 0);
        }
        C1098q c1098q = this.f2074e;
        if (c1098q != null) {
            c1098q.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            f();
        }
        C1097p c1097p = this.f2073d;
        if (c1097p != null) {
            c1097p.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            f();
            if (!l(this.f2073d)) {
                b(this.f2073d, true);
            }
        } else {
            C1097p c1097p = this.f2073d;
            if (c1097p != null && l(c1097p)) {
                removeView(this.f2073d);
                this.f2063E.remove(this.f2073d);
            }
        }
        C1097p c1097p2 = this.f2073d;
        if (c1097p2 != null) {
            c1097p2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C1101u c1101u = this.f2072c;
            if (c1101u != null && l(c1101u)) {
                removeView(this.f2072c);
                this.f2063E.remove(this.f2072c);
            }
        } else {
            if (this.f2072c == null) {
                Context context = getContext();
                C1101u c1101u2 = new C1101u(context, null);
                this.f2072c = c1101u2;
                c1101u2.setSingleLine();
                this.f2072c.setEllipsize(TextUtils.TruncateAt.END);
                int i3 = this.f2081m;
                if (i3 != 0) {
                    this.f2072c.setTextAppearance(context, i3);
                }
                ColorStateList colorStateList = this.f2059A;
                if (colorStateList != null) {
                    this.f2072c.setTextColor(colorStateList);
                }
            }
            if (!l(this.f2072c)) {
                b(this.f2072c, true);
            }
        }
        C1101u c1101u3 = this.f2072c;
        if (c1101u3 != null) {
            c1101u3.setText(charSequence);
        }
        this.y = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f2059A = colorStateList;
        C1101u c1101u = this.f2072c;
        if (c1101u != null) {
            c1101u.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C1101u c1101u = this.f2071b;
            if (c1101u != null && l(c1101u)) {
                removeView(this.f2071b);
                this.f2063E.remove(this.f2071b);
            }
        } else {
            if (this.f2071b == null) {
                Context context = getContext();
                C1101u c1101u2 = new C1101u(context, null);
                this.f2071b = c1101u2;
                c1101u2.setSingleLine();
                this.f2071b.setEllipsize(TextUtils.TruncateAt.END);
                int i3 = this.f2080l;
                if (i3 != 0) {
                    this.f2071b.setTextAppearance(context, i3);
                }
                ColorStateList colorStateList = this.f2093z;
                if (colorStateList != null) {
                    this.f2071b.setTextColor(colorStateList);
                }
            }
            if (!l(this.f2071b)) {
                b(this.f2071b, true);
            }
        }
        C1101u c1101u3 = this.f2071b;
        if (c1101u3 != null) {
            c1101u3.setText(charSequence);
        }
        this.f2092x = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f2093z = colorStateList;
        C1101u c1101u = this.f2071b;
        if (c1101u != null) {
            c1101u.setTextColor(colorStateList);
        }
    }

    public void setOnMenuItemClickListener(n0 n0Var) {
    }
}
