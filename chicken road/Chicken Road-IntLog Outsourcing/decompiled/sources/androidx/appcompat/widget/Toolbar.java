package androidx.appcompat.widget;

import B4.i;
import E.G;
import U.e;
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
import com.chickyneer.roadway.R;
import g.AbstractC0444a;
import h.AbstractC0477a;
import j.C1197d;
import java.lang.reflect.Field;
import java.util.ArrayList;
import k.j;
import l.C1234f;
import l.C1237i;
import l.C1243o;
import l.C1244p;
import l.C1246s;
import l.InterfaceC1249v;
import l.N;
import l.i0;
import l.j0;
import l.k0;
import l.l0;
import l.m0;
import l.n0;
import l.t0;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f4256A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f4257B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f4258C;

    /* renamed from: D, reason: collision with root package name */
    public final ArrayList f4259D;

    /* renamed from: E, reason: collision with root package name */
    public final ArrayList f4260E;

    /* renamed from: F, reason: collision with root package name */
    public final int[] f4261F;

    /* renamed from: G, reason: collision with root package name */
    public final e f4262G;

    /* renamed from: H, reason: collision with root package name */
    public n0 f4263H;

    /* renamed from: I, reason: collision with root package name */
    public j0 f4264I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f4265J;

    /* renamed from: K, reason: collision with root package name */
    public final B.a f4266K;

    /* renamed from: a, reason: collision with root package name */
    public ActionMenuView f4267a;

    /* renamed from: b, reason: collision with root package name */
    public C1246s f4268b;

    /* renamed from: c, reason: collision with root package name */
    public C1246s f4269c;

    /* renamed from: d, reason: collision with root package name */
    public C1243o f4270d;

    /* renamed from: e, reason: collision with root package name */
    public C1244p f4271e;

    /* renamed from: f, reason: collision with root package name */
    public final Drawable f4272f;

    /* renamed from: g, reason: collision with root package name */
    public final CharSequence f4273g;

    /* renamed from: h, reason: collision with root package name */
    public C1243o f4274h;

    /* renamed from: i, reason: collision with root package name */
    public View f4275i;

    /* renamed from: j, reason: collision with root package name */
    public Context f4276j;

    /* renamed from: k, reason: collision with root package name */
    public int f4277k;

    /* renamed from: l, reason: collision with root package name */
    public int f4278l;

    /* renamed from: m, reason: collision with root package name */
    public int f4279m;

    /* renamed from: n, reason: collision with root package name */
    public final int f4280n;

    /* renamed from: o, reason: collision with root package name */
    public final int f4281o;

    /* renamed from: p, reason: collision with root package name */
    public int f4282p;

    /* renamed from: q, reason: collision with root package name */
    public int f4283q;

    /* renamed from: r, reason: collision with root package name */
    public int f4284r;

    /* renamed from: s, reason: collision with root package name */
    public int f4285s;

    /* renamed from: t, reason: collision with root package name */
    public N f4286t;

    /* renamed from: u, reason: collision with root package name */
    public int f4287u;

    /* renamed from: v, reason: collision with root package name */
    public int f4288v;

    /* renamed from: w, reason: collision with root package name */
    public final int f4289w;

    /* renamed from: x, reason: collision with root package name */
    public CharSequence f4290x;

    /* renamed from: y, reason: collision with root package name */
    public CharSequence f4291y;
    public ColorStateList z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f4289w = 8388627;
        this.f4259D = new ArrayList();
        this.f4260E = new ArrayList();
        this.f4261F = new int[2];
        this.f4262G = new e(this);
        this.f4266K = new B.a(16, this);
        i M5 = i.M(getContext(), attributeSet, AbstractC0444a.f5712t, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) M5.f312c;
        this.f4278l = typedArray.getResourceId(28, 0);
        this.f4279m = typedArray.getResourceId(19, 0);
        this.f4289w = typedArray.getInteger(0, 8388627);
        this.f4280n = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f4285s = dimensionPixelOffset;
        this.f4284r = dimensionPixelOffset;
        this.f4283q = dimensionPixelOffset;
        this.f4282p = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f4282p = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f4283q = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f4284r = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f4285s = dimensionPixelOffset5;
        }
        this.f4281o = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        N n6 = this.f4286t;
        n6.f10812h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            n6.f10809e = dimensionPixelSize;
            n6.f10805a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            n6.f10810f = dimensionPixelSize2;
            n6.f10806b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            n6.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f4287u = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f4288v = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f4272f = M5.F(4);
        this.f4273g = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f4276j = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable F2 = M5.F(16);
        if (F2 != null) {
            setNavigationIcon(F2);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable F5 = M5.F(11);
        if (F5 != null) {
            setLogo(F5);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(M5.E(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(M5.E(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        M5.P();
    }

    public static k0 g() {
        k0 k0Var = new k0(-2, -2);
        k0Var.f10902b = 0;
        k0Var.f10901a = 8388627;
        return k0Var;
    }

    private MenuInflater getMenuInflater() {
        return new C1197d(getContext());
    }

    public static k0 h(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof k0;
        if (z) {
            k0 k0Var = (k0) layoutParams;
            k0 k0Var2 = new k0(k0Var);
            k0Var2.f10902b = 0;
            k0Var2.f10902b = k0Var.f10902b;
            return k0Var2;
        }
        if (z) {
            k0 k0Var3 = new k0((k0) layoutParams);
            k0Var3.f10902b = 0;
            return k0Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            k0 k0Var4 = new k0(layoutParams);
            k0Var4.f10902b = 0;
            return k0Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        k0 k0Var5 = new k0(marginLayoutParams);
        k0Var5.f10902b = 0;
        ((ViewGroup.MarginLayoutParams) k0Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) k0Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) k0Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) k0Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return k0Var5;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(ArrayList arrayList, int i2) {
        Field field = G.f566a;
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                k0 k0Var = (k0) childAt.getLayoutParams();
                if (k0Var.f10902b == 0 && r(childAt) && i(k0Var.f10901a) == absoluteGravity) {
                    arrayList.add(childAt);
                }
            }
            return;
        }
        for (int i6 = childCount - 1; i6 >= 0; i6--) {
            View childAt2 = getChildAt(i6);
            k0 k0Var2 = (k0) childAt2.getLayoutParams();
            if (k0Var2.f10902b == 0 && r(childAt2) && i(k0Var2.f10901a) == absoluteGravity) {
                arrayList.add(childAt2);
            }
        }
    }

    public final void b(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        k0 g6 = layoutParams == null ? g() : !checkLayoutParams(layoutParams) ? h(layoutParams) : (k0) layoutParams;
        g6.f10902b = 1;
        if (!z || this.f4275i == null) {
            addView(view, g6);
        } else {
            view.setLayoutParams(g6);
            this.f4260E.add(view);
        }
    }

    public final void c() {
        if (this.f4274h == null) {
            C1243o c1243o = new C1243o(getContext());
            this.f4274h = c1243o;
            c1243o.setImageDrawable(this.f4272f);
            this.f4274h.setContentDescription(this.f4273g);
            k0 g6 = g();
            g6.f10901a = (this.f4280n & 112) | 8388611;
            g6.f10902b = 2;
            this.f4274h.setLayoutParams(g6);
            this.f4274h.setOnClickListener(new i0(this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof k0);
    }

    public final void d() {
        if (this.f4286t == null) {
            N n6 = new N();
            n6.f10805a = 0;
            n6.f10806b = 0;
            n6.f10807c = Integer.MIN_VALUE;
            n6.f10808d = Integer.MIN_VALUE;
            n6.f10809e = 0;
            n6.f10810f = 0;
            n6.f10811g = false;
            n6.f10812h = false;
            this.f4286t = n6;
        }
    }

    public final void e() {
        if (this.f4267a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f4267a = actionMenuView;
            actionMenuView.setPopupTheme(this.f4277k);
            this.f4267a.setOnMenuItemClickListener(this.f4262G);
            this.f4267a.getClass();
            k0 g6 = g();
            g6.f10901a = (this.f4280n & 112) | 8388613;
            this.f4267a.setLayoutParams(g6);
            b(this.f4267a, false);
        }
        ActionMenuView actionMenuView2 = this.f4267a;
        if (actionMenuView2.f4155p == null) {
            k.i iVar = (k.i) actionMenuView2.getMenu();
            if (this.f4264I == null) {
                this.f4264I = new j0(this);
            }
            this.f4267a.setExpandedActionViewsExclusive(true);
            iVar.b(this.f4264I, this.f4276j);
        }
    }

    public final void f() {
        if (this.f4270d == null) {
            this.f4270d = new C1243o(getContext());
            k0 g6 = g();
            g6.f10901a = (this.f4280n & 112) | 8388611;
            this.f4270d.setLayoutParams(g6);
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
        C1243o c1243o = this.f4274h;
        if (c1243o != null) {
            return c1243o.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C1243o c1243o = this.f4274h;
        if (c1243o != null) {
            return c1243o.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        N n6 = this.f4286t;
        if (n6 != null) {
            return n6.f10811g ? n6.f10805a : n6.f10806b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i2 = this.f4288v;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        N n6 = this.f4286t;
        if (n6 != null) {
            return n6.f10805a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        N n6 = this.f4286t;
        if (n6 != null) {
            return n6.f10806b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        N n6 = this.f4286t;
        if (n6 != null) {
            return n6.f10811g ? n6.f10806b : n6.f10805a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i2 = this.f4287u;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        k.i iVar;
        ActionMenuView actionMenuView = this.f4267a;
        return (actionMenuView == null || (iVar = actionMenuView.f4155p) == null || !iVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f4288v, 0));
    }

    public int getCurrentContentInsetLeft() {
        Field field = G.f566a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        Field field = G.f566a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f4287u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C1244p c1244p = this.f4271e;
        if (c1244p != null) {
            return c1244p.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C1244p c1244p = this.f4271e;
        if (c1244p != null) {
            return c1244p.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f4267a.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        C1243o c1243o = this.f4270d;
        if (c1243o != null) {
            return c1243o.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C1243o c1243o = this.f4270d;
        if (c1243o != null) {
            return c1243o.getDrawable();
        }
        return null;
    }

    public C1237i getOuterActionMenuPresenter() {
        return null;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f4267a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f4276j;
    }

    public int getPopupTheme() {
        return this.f4277k;
    }

    public CharSequence getSubtitle() {
        return this.f4291y;
    }

    public final TextView getSubtitleTextView() {
        return this.f4269c;
    }

    public CharSequence getTitle() {
        return this.f4290x;
    }

    public int getTitleMarginBottom() {
        return this.f4285s;
    }

    public int getTitleMarginEnd() {
        return this.f4283q;
    }

    public int getTitleMarginStart() {
        return this.f4282p;
    }

    public int getTitleMarginTop() {
        return this.f4284r;
    }

    public final TextView getTitleTextView() {
        return this.f4268b;
    }

    public InterfaceC1249v getWrapper() {
        Drawable drawable;
        if (this.f4263H == null) {
            n0 n0Var = new n0();
            n0Var.f10922l = 0;
            n0Var.f10911a = this;
            n0Var.f10918h = getTitle();
            n0Var.f10919i = getSubtitle();
            n0Var.f10917g = n0Var.f10918h != null;
            n0Var.f10916f = getNavigationIcon();
            i M5 = i.M(getContext(), null, AbstractC0444a.f5693a, R.attr.actionBarStyle);
            n0Var.f10923m = M5.F(15);
            TypedArray typedArray = (TypedArray) M5.f312c;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                n0Var.f10917g = true;
                n0Var.f10918h = text;
                if ((n0Var.f10912b & 8) != 0) {
                    n0Var.f10911a.setTitle(text);
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                n0Var.f10919i = text2;
                if ((n0Var.f10912b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable F2 = M5.F(20);
            if (F2 != null) {
                n0Var.f10915e = F2;
                n0Var.c();
            }
            Drawable F5 = M5.F(17);
            if (F5 != null) {
                n0Var.f10914d = F5;
                n0Var.c();
            }
            if (n0Var.f10916f == null && (drawable = n0Var.f10923m) != null) {
                n0Var.f10916f = drawable;
                int i2 = n0Var.f10912b & 4;
                Toolbar toolbar = n0Var.f10911a;
                if (i2 != 0) {
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            n0Var.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = n0Var.f10913c;
                if (view != null && (n0Var.f10912b & 16) != 0) {
                    removeView(view);
                }
                n0Var.f10913c = inflate;
                if (inflate != null && (n0Var.f10912b & 16) != 0) {
                    addView(inflate);
                }
                n0Var.a(n0Var.f10912b | 16);
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
                this.f4286t.a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f4278l = resourceId2;
                C1246s c1246s = this.f4268b;
                if (c1246s != null) {
                    c1246s.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f4279m = resourceId3;
                C1246s c1246s2 = this.f4269c;
                if (c1246s2 != null) {
                    c1246s2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            M5.P();
            if (R.string.abc_action_bar_up_description != n0Var.f10922l) {
                n0Var.f10922l = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i3 = n0Var.f10922l;
                    n0Var.f10920j = i3 != 0 ? getContext().getString(i3) : null;
                    n0Var.b();
                }
            }
            n0Var.f10920j = getNavigationContentDescription();
            setNavigationOnClickListener(new i0(n0Var));
            this.f4263H = n0Var;
        }
        return this.f4263H;
    }

    public final int i(int i2) {
        Field field = G.f566a;
        int layoutDirection = getLayoutDirection();
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, layoutDirection) & 7;
        return (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) ? absoluteGravity : layoutDirection == 1 ? 5 : 3;
    }

    public final int j(View view, int i2) {
        k0 k0Var = (k0) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i3 = i2 > 0 ? (measuredHeight - i2) / 2 : 0;
        int i6 = k0Var.f10901a & 112;
        if (i6 != 16 && i6 != 48 && i6 != 80) {
            i6 = this.f4289w & 112;
        }
        if (i6 == 48) {
            return getPaddingTop() - i3;
        }
        if (i6 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) k0Var).bottomMargin) - i3;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i7 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i8 = ((ViewGroup.MarginLayoutParams) k0Var).topMargin;
        if (i7 < i8) {
            i7 = i8;
        } else {
            int i9 = (((height - paddingBottom) - measuredHeight) - i7) - paddingTop;
            int i10 = ((ViewGroup.MarginLayoutParams) k0Var).bottomMargin;
            if (i9 < i10) {
                i7 = Math.max(0, i7 - (i10 - i9));
            }
        }
        return paddingTop + i7;
    }

    public final boolean m(View view) {
        return view.getParent() == this || this.f4260E.contains(view);
    }

    public final int n(View view, int i2, int i3, int[] iArr) {
        k0 k0Var = (k0) view.getLayoutParams();
        int i6 = ((ViewGroup.MarginLayoutParams) k0Var).leftMargin - iArr[0];
        int max = Math.max(0, i6) + i2;
        iArr[0] = Math.max(0, -i6);
        int j2 = j(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, j2, max + measuredWidth, view.getMeasuredHeight() + j2);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) k0Var).rightMargin + max;
    }

    public final int o(View view, int i2, int i3, int[] iArr) {
        k0 k0Var = (k0) view.getLayoutParams();
        int i6 = ((ViewGroup.MarginLayoutParams) k0Var).rightMargin - iArr[1];
        int max = i2 - Math.max(0, i6);
        iArr[1] = Math.max(0, -i6);
        int j2 = j(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, j2, max, view.getMeasuredHeight() + j2);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) k0Var).leftMargin);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f4266K);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f4258C = false;
        }
        if (!this.f4258C) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f4258C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f4258C = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x029b A[LOOP:0: B:40:0x0299->B:41:0x029b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02b8 A[LOOP:1: B:44:0x02b6->B:45:0x02b8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02d6 A[LOOP:2: B:48:0x02d4->B:49:0x02d6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0325 A[LOOP:3: B:57:0x0323->B:58:0x0325, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0222  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z, int i2, int i3, int i6, int i7) {
        int i8;
        int i9;
        boolean r5;
        boolean r6;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z5;
        int i14;
        int i15;
        int i16;
        int paddingTop;
        int i17;
        int i18;
        int i19;
        int i20;
        int size;
        int i21;
        int i22;
        int size2;
        int i23;
        int size3;
        int i24;
        int i25;
        int size4;
        int i26;
        Field field = G.f566a;
        boolean z6 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i27 = width - paddingRight;
        int[] iArr = this.f4261F;
        iArr[1] = 0;
        iArr[0] = 0;
        int minimumHeight = getMinimumHeight();
        int min = minimumHeight >= 0 ? Math.min(minimumHeight, i7 - i3) : 0;
        if (!r(this.f4270d)) {
            i8 = paddingLeft;
        } else {
            if (z6) {
                i9 = o(this.f4270d, i27, min, iArr);
                i8 = paddingLeft;
                if (r(this.f4274h)) {
                    if (z6) {
                        i9 = o(this.f4274h, i9, min, iArr);
                    } else {
                        i8 = n(this.f4274h, i8, min, iArr);
                    }
                }
                if (r(this.f4267a)) {
                    if (z6) {
                        i8 = n(this.f4267a, i8, min, iArr);
                    } else {
                        i9 = o(this.f4267a, i9, min, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - i8);
                iArr[1] = Math.max(0, currentContentInsetRight - (i27 - i9));
                int max = Math.max(i8, currentContentInsetLeft);
                int min2 = Math.min(i9, i27 - currentContentInsetRight);
                if (r(this.f4275i)) {
                    if (z6) {
                        min2 = o(this.f4275i, min2, min, iArr);
                    } else {
                        max = n(this.f4275i, max, min, iArr);
                    }
                }
                if (r(this.f4271e)) {
                    if (z6) {
                        min2 = o(this.f4271e, min2, min, iArr);
                    } else {
                        max = n(this.f4271e, max, min, iArr);
                    }
                }
                r5 = r(this.f4268b);
                r6 = r(this.f4269c);
                if (r5) {
                    i10 = paddingRight;
                    i11 = 0;
                } else {
                    k0 k0Var = (k0) this.f4268b.getLayoutParams();
                    i10 = paddingRight;
                    i11 = ((ViewGroup.MarginLayoutParams) k0Var).bottomMargin + this.f4268b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) k0Var).topMargin;
                }
                if (r6) {
                    i12 = width;
                } else {
                    k0 k0Var2 = (k0) this.f4269c.getLayoutParams();
                    i12 = width;
                    i11 += this.f4269c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) k0Var2).topMargin + ((ViewGroup.MarginLayoutParams) k0Var2).bottomMargin;
                }
                if (!r5 || r6) {
                    C1246s c1246s = !r5 ? this.f4268b : this.f4269c;
                    C1246s c1246s2 = !r6 ? this.f4269c : this.f4268b;
                    k0 k0Var3 = (k0) c1246s.getLayoutParams();
                    k0 k0Var4 = (k0) c1246s2.getLayoutParams();
                    if ((r5 || this.f4268b.getMeasuredWidth() <= 0) && (!r6 || this.f4269c.getMeasuredWidth() <= 0)) {
                        i13 = paddingLeft;
                        z5 = false;
                    } else {
                        i13 = paddingLeft;
                        z5 = true;
                    }
                    i14 = this.f4289w & 112;
                    i15 = min;
                    if (i14 != 48) {
                        i16 = max;
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) k0Var3).topMargin + this.f4284r;
                    } else if (i14 != 80) {
                        int i28 = (((height - paddingTop2) - paddingBottom) - i11) / 2;
                        i16 = max;
                        int i29 = ((ViewGroup.MarginLayoutParams) k0Var3).topMargin + this.f4284r;
                        if (i28 < i29) {
                            i28 = i29;
                        } else {
                            int i30 = (((height - paddingBottom) - i11) - i28) - paddingTop2;
                            int i31 = ((ViewGroup.MarginLayoutParams) k0Var3).bottomMargin;
                            int i32 = this.f4285s;
                            if (i30 < i31 + i32) {
                                i28 = Math.max(0, i28 - ((((ViewGroup.MarginLayoutParams) k0Var4).bottomMargin + i32) - i30));
                            }
                        }
                        paddingTop = paddingTop2 + i28;
                    } else {
                        i16 = max;
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) k0Var4).bottomMargin) - this.f4285s) - i11;
                    }
                    if (z6) {
                        int i33 = (z5 ? this.f4282p : 0) - iArr[0];
                        int max2 = Math.max(0, i33) + i16;
                        iArr[0] = Math.max(0, -i33);
                        if (r5) {
                            k0 k0Var5 = (k0) this.f4268b.getLayoutParams();
                            int measuredWidth = this.f4268b.getMeasuredWidth() + max2;
                            int measuredHeight = this.f4268b.getMeasuredHeight() + paddingTop;
                            this.f4268b.layout(max2, paddingTop, measuredWidth, measuredHeight);
                            i17 = measuredWidth + this.f4283q;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) k0Var5).bottomMargin;
                        } else {
                            i17 = max2;
                        }
                        if (r6) {
                            int i34 = paddingTop + ((ViewGroup.MarginLayoutParams) ((k0) this.f4269c.getLayoutParams())).topMargin;
                            int measuredWidth2 = this.f4269c.getMeasuredWidth() + max2;
                            this.f4269c.layout(max2, i34, measuredWidth2, this.f4269c.getMeasuredHeight() + i34);
                            i18 = measuredWidth2 + this.f4283q;
                        } else {
                            i18 = max2;
                        }
                        max = z5 ? Math.max(i17, i18) : max2;
                    } else {
                        int i35 = (z5 ? this.f4282p : 0) - iArr[1];
                        min2 -= Math.max(0, i35);
                        iArr[1] = Math.max(0, -i35);
                        if (r5) {
                            k0 k0Var6 = (k0) this.f4268b.getLayoutParams();
                            int measuredWidth3 = min2 - this.f4268b.getMeasuredWidth();
                            int measuredHeight2 = this.f4268b.getMeasuredHeight() + paddingTop;
                            this.f4268b.layout(measuredWidth3, paddingTop, min2, measuredHeight2);
                            i19 = measuredWidth3 - this.f4283q;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) k0Var6).bottomMargin;
                        } else {
                            i19 = min2;
                        }
                        if (r6) {
                            int i36 = paddingTop + ((ViewGroup.MarginLayoutParams) ((k0) this.f4269c.getLayoutParams())).topMargin;
                            this.f4269c.layout(min2 - this.f4269c.getMeasuredWidth(), i36, min2, this.f4269c.getMeasuredHeight() + i36);
                            i20 = min2 - this.f4283q;
                        } else {
                            i20 = min2;
                        }
                        if (z5) {
                            min2 = Math.min(i19, i20);
                        }
                        max = i16;
                    }
                } else {
                    i13 = paddingLeft;
                    i15 = min;
                }
                ArrayList arrayList = this.f4259D;
                a(arrayList, 3);
                size = arrayList.size();
                i21 = max;
                for (i22 = 0; i22 < size; i22++) {
                    i21 = n((View) arrayList.get(i22), i21, i15, iArr);
                }
                int i37 = i15;
                a(arrayList, 5);
                size2 = arrayList.size();
                for (i23 = 0; i23 < size2; i23++) {
                    min2 = o((View) arrayList.get(i23), min2, i37, iArr);
                }
                a(arrayList, 1);
                int i38 = iArr[0];
                int i39 = iArr[1];
                size3 = arrayList.size();
                int i40 = i39;
                int i41 = i38;
                i24 = 0;
                int i42 = 0;
                while (i24 < size3) {
                    View view = (View) arrayList.get(i24);
                    k0 k0Var7 = (k0) view.getLayoutParams();
                    int i43 = ((ViewGroup.MarginLayoutParams) k0Var7).leftMargin - i41;
                    int i44 = ((ViewGroup.MarginLayoutParams) k0Var7).rightMargin - i40;
                    int max3 = Math.max(0, i43);
                    int max4 = Math.max(0, i44);
                    int max5 = Math.max(0, -i43);
                    int max6 = Math.max(0, -i44);
                    i42 += view.getMeasuredWidth() + max3 + max4;
                    i24++;
                    i40 = max6;
                    i41 = max5;
                }
                i25 = ((((i12 - i13) - i10) / 2) + i13) - (i42 / 2);
                int i45 = i42 + i25;
                if (i25 >= i21) {
                    i21 = i45 > min2 ? i25 - (i45 - min2) : i25;
                }
                size4 = arrayList.size();
                for (i26 = 0; i26 < size4; i26++) {
                    i21 = n((View) arrayList.get(i26), i21, i37, iArr);
                }
                arrayList.clear();
            }
            i8 = n(this.f4270d, paddingLeft, min, iArr);
        }
        i9 = i27;
        if (r(this.f4274h)) {
        }
        if (r(this.f4267a)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i8);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i27 - i9));
        int max7 = Math.max(i8, currentContentInsetLeft2);
        int min22 = Math.min(i9, i27 - currentContentInsetRight2);
        if (r(this.f4275i)) {
        }
        if (r(this.f4271e)) {
        }
        r5 = r(this.f4268b);
        r6 = r(this.f4269c);
        if (r5) {
        }
        if (r6) {
        }
        if (r5) {
        }
        if (!r5) {
        }
        if (!r6) {
        }
        k0 k0Var32 = (k0) c1246s.getLayoutParams();
        k0 k0Var42 = (k0) c1246s2.getLayoutParams();
        if (r5) {
        }
        i13 = paddingLeft;
        z5 = false;
        i14 = this.f4289w & 112;
        i15 = min;
        if (i14 != 48) {
        }
        if (z6) {
        }
        ArrayList arrayList2 = this.f4259D;
        a(arrayList2, 3);
        size = arrayList2.size();
        i21 = max7;
        while (i22 < size) {
        }
        int i372 = i15;
        a(arrayList2, 5);
        size2 = arrayList2.size();
        while (i23 < size2) {
        }
        a(arrayList2, 1);
        int i382 = iArr[0];
        int i392 = iArr[1];
        size3 = arrayList2.size();
        int i402 = i392;
        int i412 = i382;
        i24 = 0;
        int i422 = 0;
        while (i24 < size3) {
        }
        i25 = ((((i12 - i13) - i10) / 2) + i13) - (i422 / 2);
        int i452 = i422 + i25;
        if (i25 >= i21) {
        }
        size4 = arrayList2.size();
        while (i26 < size4) {
        }
        arrayList2.clear();
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean a6 = t0.a(this);
        int i13 = !a6 ? 1 : 0;
        int i14 = 0;
        if (r(this.f4270d)) {
            q(this.f4270d, i2, 0, i3, this.f4281o);
            i6 = k(this.f4270d) + this.f4270d.getMeasuredWidth();
            i7 = Math.max(0, l(this.f4270d) + this.f4270d.getMeasuredHeight());
            i8 = View.combineMeasuredStates(0, this.f4270d.getMeasuredState());
        } else {
            i6 = 0;
            i7 = 0;
            i8 = 0;
        }
        if (r(this.f4274h)) {
            q(this.f4274h, i2, 0, i3, this.f4281o);
            i6 = k(this.f4274h) + this.f4274h.getMeasuredWidth();
            i7 = Math.max(i7, l(this.f4274h) + this.f4274h.getMeasuredHeight());
            i8 = View.combineMeasuredStates(i8, this.f4274h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i6);
        int max2 = Math.max(0, currentContentInsetStart - i6);
        int[] iArr = this.f4261F;
        iArr[a6 ? 1 : 0] = max2;
        if (r(this.f4267a)) {
            q(this.f4267a, i2, max, i3, this.f4281o);
            i9 = k(this.f4267a) + this.f4267a.getMeasuredWidth();
            i7 = Math.max(i7, l(this.f4267a) + this.f4267a.getMeasuredHeight());
            i8 = View.combineMeasuredStates(i8, this.f4267a.getMeasuredState());
        } else {
            i9 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i9);
        iArr[i13] = Math.max(0, currentContentInsetEnd - i9);
        if (r(this.f4275i)) {
            max3 += p(this.f4275i, i2, max3, i3, 0, iArr);
            i7 = Math.max(i7, l(this.f4275i) + this.f4275i.getMeasuredHeight());
            i8 = View.combineMeasuredStates(i8, this.f4275i.getMeasuredState());
        }
        if (r(this.f4271e)) {
            max3 += p(this.f4271e, i2, max3, i3, 0, iArr);
            i7 = Math.max(i7, l(this.f4271e) + this.f4271e.getMeasuredHeight());
            i8 = View.combineMeasuredStates(i8, this.f4271e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (((k0) childAt.getLayoutParams()).f10902b == 0 && r(childAt)) {
                max3 += p(childAt, i2, max3, i3, 0, iArr);
                i7 = Math.max(i7, l(childAt) + childAt.getMeasuredHeight());
                i8 = View.combineMeasuredStates(i8, childAt.getMeasuredState());
            }
        }
        int i16 = this.f4284r + this.f4285s;
        int i17 = this.f4282p + this.f4283q;
        if (r(this.f4268b)) {
            p(this.f4268b, i2, max3 + i17, i3, i16, iArr);
            int k3 = k(this.f4268b) + this.f4268b.getMeasuredWidth();
            i10 = l(this.f4268b) + this.f4268b.getMeasuredHeight();
            i11 = View.combineMeasuredStates(i8, this.f4268b.getMeasuredState());
            i12 = k3;
        } else {
            i10 = 0;
            i11 = i8;
            i12 = 0;
        }
        if (r(this.f4269c)) {
            i12 = Math.max(i12, p(this.f4269c, i2, max3 + i17, i3, i10 + i16, iArr));
            i10 += l(this.f4269c) + this.f4269c.getMeasuredHeight();
            i11 = View.combineMeasuredStates(i11, this.f4269c.getMeasuredState());
        }
        int max4 = Math.max(i7, i10);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max4;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + max3 + i12, getSuggestedMinimumWidth()), i2, (-16777216) & i11);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i3, i11 << 16);
        if (this.f4265J) {
            int childCount2 = getChildCount();
            for (int i18 = 0; i18 < childCount2; i18++) {
                View childAt2 = getChildAt(i18);
                if (!r(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i14);
        }
        i14 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i14);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof m0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        m0 m0Var = (m0) parcelable;
        super.onRestoreInstanceState(m0Var.f1370a);
        ActionMenuView actionMenuView = this.f4267a;
        k.i iVar = actionMenuView != null ? actionMenuView.f4155p : null;
        int i2 = m0Var.f10906c;
        if (i2 != 0 && this.f4264I != null && iVar != null && (findItem = iVar.findItem(i2)) != null) {
            findItem.expandActionView();
        }
        if (m0Var.f10907d) {
            B.a aVar = this.f4266K;
            removeCallbacks(aVar);
            post(aVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        d();
        N n6 = this.f4286t;
        boolean z = i2 == 1;
        if (z == n6.f10811g) {
            return;
        }
        n6.f10811g = z;
        if (!n6.f10812h) {
            n6.f10805a = n6.f10809e;
            n6.f10806b = n6.f10810f;
            return;
        }
        if (z) {
            int i3 = n6.f10808d;
            if (i3 == Integer.MIN_VALUE) {
                i3 = n6.f10809e;
            }
            n6.f10805a = i3;
            int i6 = n6.f10807c;
            if (i6 == Integer.MIN_VALUE) {
                i6 = n6.f10810f;
            }
            n6.f10806b = i6;
            return;
        }
        int i7 = n6.f10807c;
        if (i7 == Integer.MIN_VALUE) {
            i7 = n6.f10809e;
        }
        n6.f10805a = i7;
        int i8 = n6.f10808d;
        if (i8 == Integer.MIN_VALUE) {
            i8 = n6.f10810f;
        }
        n6.f10806b = i8;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C1237i c1237i;
        C1234f c1234f;
        j jVar;
        m0 m0Var = new m0(super.onSaveInstanceState());
        j0 j0Var = this.f4264I;
        if (j0Var != null && (jVar = j0Var.f10893b) != null) {
            m0Var.f10906c = jVar.f10608a;
        }
        ActionMenuView actionMenuView = this.f4267a;
        m0Var.f10907d = (actionMenuView == null || (c1237i = actionMenuView.f4158s) == null || (c1234f = c1237i.f10885r) == null || !c1234f.b()) ? false : true;
        return m0Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f4257B = false;
        }
        if (!this.f4257B) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f4257B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f4257B = false;
        }
        return true;
    }

    public final int p(View view, int i2, int i3, int i6, int i7, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i8 = marginLayoutParams.leftMargin - iArr[0];
        int i9 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i9) + Math.max(0, i8);
        iArr[0] = Math.max(0, -i8);
        iArr[1] = Math.max(0, -i9);
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + max + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i6, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i7, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void q(View view, int i2, int i3, int i6, int i7) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
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

    public void setCollapseContentDescription(int i2) {
        setCollapseContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setCollapseIcon(int i2) {
        setCollapseIcon(AbstractC0477a.a(getContext(), i2));
    }

    public void setCollapsible(boolean z) {
        this.f4265J = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f4288v) {
            this.f4288v = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f4287u) {
            this.f4287u = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i2) {
        setLogo(AbstractC0477a.a(getContext(), i2));
    }

    public void setLogoDescription(int i2) {
        setLogoDescription(getContext().getText(i2));
    }

    public void setNavigationContentDescription(int i2) {
        setNavigationContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setNavigationIcon(int i2) {
        setNavigationIcon(AbstractC0477a.a(getContext(), i2));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        f();
        this.f4270d.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f4267a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i2) {
        if (this.f4277k != i2) {
            this.f4277k = i2;
            if (i2 == 0) {
                this.f4276j = getContext();
            } else {
                this.f4276j = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setSubtitle(int i2) {
        setSubtitle(getContext().getText(i2));
    }

    public void setSubtitleTextColor(int i2) {
        setSubtitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setTitle(int i2) {
        setTitle(getContext().getText(i2));
    }

    public void setTitleMarginBottom(int i2) {
        this.f4285s = i2;
        requestLayout();
    }

    public void setTitleMarginEnd(int i2) {
        this.f4283q = i2;
        requestLayout();
    }

    public void setTitleMarginStart(int i2) {
        this.f4282p = i2;
        requestLayout();
    }

    public void setTitleMarginTop(int i2) {
        this.f4284r = i2;
        requestLayout();
    }

    public void setTitleTextColor(int i2) {
        setTitleTextColor(ColorStateList.valueOf(i2));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        k0 k0Var = new k0(context, attributeSet);
        k0Var.f10901a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0444a.f5694b);
        k0Var.f10901a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        k0Var.f10902b = 0;
        return k0Var;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        C1243o c1243o = this.f4274h;
        if (c1243o != null) {
            c1243o.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f4274h.setImageDrawable(drawable);
        } else {
            C1243o c1243o = this.f4274h;
            if (c1243o != null) {
                c1243o.setImageDrawable(this.f4272f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f4271e == null) {
                this.f4271e = new C1244p(getContext(), 0);
            }
            if (!m(this.f4271e)) {
                b(this.f4271e, true);
            }
        } else {
            C1244p c1244p = this.f4271e;
            if (c1244p != null && m(c1244p)) {
                removeView(this.f4271e);
                this.f4260E.remove(this.f4271e);
            }
        }
        C1244p c1244p2 = this.f4271e;
        if (c1244p2 != null) {
            c1244p2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f4271e == null) {
            this.f4271e = new C1244p(getContext(), 0);
        }
        C1244p c1244p = this.f4271e;
        if (c1244p != null) {
            c1244p.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            f();
        }
        C1243o c1243o = this.f4270d;
        if (c1243o != null) {
            c1243o.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            f();
            if (!m(this.f4270d)) {
                b(this.f4270d, true);
            }
        } else {
            C1243o c1243o = this.f4270d;
            if (c1243o != null && m(c1243o)) {
                removeView(this.f4270d);
                this.f4260E.remove(this.f4270d);
            }
        }
        C1243o c1243o2 = this.f4270d;
        if (c1243o2 != null) {
            c1243o2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C1246s c1246s = this.f4269c;
            if (c1246s != null && m(c1246s)) {
                removeView(this.f4269c);
                this.f4260E.remove(this.f4269c);
            }
        } else {
            if (this.f4269c == null) {
                Context context = getContext();
                C1246s c1246s2 = new C1246s(context, null);
                this.f4269c = c1246s2;
                c1246s2.setSingleLine();
                this.f4269c.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f4279m;
                if (i2 != 0) {
                    this.f4269c.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.f4256A;
                if (colorStateList != null) {
                    this.f4269c.setTextColor(colorStateList);
                }
            }
            if (!m(this.f4269c)) {
                b(this.f4269c, true);
            }
        }
        C1246s c1246s3 = this.f4269c;
        if (c1246s3 != null) {
            c1246s3.setText(charSequence);
        }
        this.f4291y = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f4256A = colorStateList;
        C1246s c1246s = this.f4269c;
        if (c1246s != null) {
            c1246s.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C1246s c1246s = this.f4268b;
            if (c1246s != null && m(c1246s)) {
                removeView(this.f4268b);
                this.f4260E.remove(this.f4268b);
            }
        } else {
            if (this.f4268b == null) {
                Context context = getContext();
                C1246s c1246s2 = new C1246s(context, null);
                this.f4268b = c1246s2;
                c1246s2.setSingleLine();
                this.f4268b.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f4278l;
                if (i2 != 0) {
                    this.f4268b.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.z;
                if (colorStateList != null) {
                    this.f4268b.setTextColor(colorStateList);
                }
            }
            if (!m(this.f4268b)) {
                b(this.f4268b, true);
            }
        }
        C1246s c1246s3 = this.f4268b;
        if (c1246s3 != null) {
            c1246s3.setText(charSequence);
        }
        this.f4290x = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.z = colorStateList;
        C1246s c1246s = this.f4268b;
        if (c1246s != null) {
            c1246s.setTextColor(colorStateList);
        }
    }

    public void setOnMenuItemClickListener(l0 l0Var) {
    }
}
