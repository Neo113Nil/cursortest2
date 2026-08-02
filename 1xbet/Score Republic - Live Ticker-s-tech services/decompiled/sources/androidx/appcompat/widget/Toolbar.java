package androidx.appcompat.widget;

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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import live.football.scorerepublic.R;
import p000.C0127d6;
import p000.C0200f6;
import p000.C0276h7;
import p000.C0603q2;
import p000.InterfaceC0295hq;
import p000.RunnableC0897y0;
import p000.ViewOnClickListenerC0123d2;
import p000.ai1;
import p000.an0;
import p000.j22;
import p000.jg0;
import p000.m50;
import p000.mz0;
import p000.on0;
import p000.oq0;
import p000.qd0;
import p000.qd1;
import p000.rd1;
import p000.rn0;
import p000.sd1;
import p000.td1;
import p000.ud1;
import p000.vb1;
import p000.vd1;
import p000.x31;
import p000.xd1;
import p000.xh1;
import p000.y00;
import p000.yd1;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* JADX INFO: renamed from: A */
    public int f416A;

    /* JADX INFO: renamed from: B */
    public int f417B;

    /* JADX INFO: renamed from: C */
    public x31 f418C;

    /* JADX INFO: renamed from: D */
    public int f419D;

    /* JADX INFO: renamed from: E */
    public int f420E;

    /* JADX INFO: renamed from: F */
    public final int f421F;

    /* JADX INFO: renamed from: G */
    public CharSequence f422G;

    /* JADX INFO: renamed from: H */
    public CharSequence f423H;

    /* JADX INFO: renamed from: I */
    public ColorStateList f424I;

    /* JADX INFO: renamed from: J */
    public ColorStateList f425J;

    /* JADX INFO: renamed from: K */
    public boolean f426K;

    /* JADX INFO: renamed from: L */
    public boolean f427L;

    /* JADX INFO: renamed from: M */
    public final ArrayList f428M;

    /* JADX INFO: renamed from: N */
    public final ArrayList f429N;

    /* JADX INFO: renamed from: O */
    public final int[] f430O;

    /* JADX INFO: renamed from: P */
    public final qd0 f431P;

    /* JADX INFO: renamed from: Q */
    public ArrayList f432Q;

    /* JADX INFO: renamed from: R */
    public final jg0 f433R;

    /* JADX INFO: renamed from: S */
    public xd1 f434S;

    /* JADX INFO: renamed from: T */
    public C0603q2 f435T;

    /* JADX INFO: renamed from: U */
    public sd1 f436U;

    /* JADX INFO: renamed from: V */
    public boolean f437V;

    /* JADX INFO: renamed from: W */
    public OnBackInvokedCallback f438W;

    /* JADX INFO: renamed from: a0 */
    public OnBackInvokedDispatcher f439a0;

    /* JADX INFO: renamed from: b0 */
    public boolean f440b0;

    /* JADX INFO: renamed from: c0 */
    public final RunnableC0897y0 f441c0;

    /* JADX INFO: renamed from: j */
    public ActionMenuView f442j;

    /* JADX INFO: renamed from: k */
    public C0276h7 f443k;

    /* JADX INFO: renamed from: l */
    public C0276h7 f444l;

    /* JADX INFO: renamed from: m */
    public C0127d6 f445m;

    /* JADX INFO: renamed from: n */
    public C0200f6 f446n;

    /* JADX INFO: renamed from: o */
    public final Drawable f447o;

    /* JADX INFO: renamed from: p */
    public final CharSequence f448p;

    /* JADX INFO: renamed from: q */
    public C0127d6 f449q;

    /* JADX INFO: renamed from: r */
    public View f450r;

    /* JADX INFO: renamed from: s */
    public Context f451s;

    /* JADX INFO: renamed from: t */
    public int f452t;

    /* JADX INFO: renamed from: u */
    public int f453u;

    /* JADX INFO: renamed from: v */
    public int f454v;

    /* JADX INFO: renamed from: w */
    public final int f455w;

    /* JADX INFO: renamed from: x */
    public final int f456x;

    /* JADX INFO: renamed from: y */
    public int f457y;

    /* JADX INFO: renamed from: z */
    public int f458z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f421F = 8388627;
        this.f428M = new ArrayList();
        this.f429N = new ArrayList();
        this.f430O = new int[2];
        this.f431P = new qd0(new qd1(this, 1));
        this.f432Q = new ArrayList();
        this.f433R = new jg0(16, this);
        this.f441c0 = new RunnableC0897y0(26, this);
        Context context2 = getContext();
        int[] iArr = mz0.f5209w;
        oq0 oq0VarM3731n = oq0.m3731n(context2, attributeSet, iArr, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) oq0VarM3731n.f5841l;
        WeakHashMap weakHashMap = ai1.f194a;
        xh1.m5663b(this, context, iArr, attributeSet, typedArray, R.attr.toolbarStyle, 0);
        TypedArray typedArray2 = (TypedArray) oq0VarM3731n.f5841l;
        this.f453u = typedArray2.getResourceId(28, 0);
        this.f454v = typedArray2.getResourceId(19, 0);
        this.f421F = typedArray2.getInteger(0, 8388627);
        this.f455w = typedArray2.getInteger(2, 48);
        int dimensionPixelOffset = typedArray2.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray2.hasValue(27) ? typedArray2.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f417B = dimensionPixelOffset;
        this.f416A = dimensionPixelOffset;
        this.f458z = dimensionPixelOffset;
        this.f457y = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray2.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f457y = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray2.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f458z = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray2.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f416A = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray2.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f417B = dimensionPixelOffset5;
        }
        this.f456x = typedArray2.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray2.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray2.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray2.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray2.getDimensionPixelSize(8, 0);
        m371d();
        x31 x31Var = this.f418C;
        x31Var.f8784h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            x31Var.f8781e = dimensionPixelSize;
            x31Var.f8777a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            x31Var.f8782f = dimensionPixelSize2;
            x31Var.f8778b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            x31Var.m5499a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f419D = typedArray2.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f420E = typedArray2.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f447o = oq0VarM3731n.m3735e(4);
        this.f448p = typedArray2.getText(3);
        CharSequence text = typedArray2.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray2.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f451s = getContext();
        setPopupTheme(typedArray2.getResourceId(17, 0));
        Drawable drawableM3735e = oq0VarM3731n.m3735e(16);
        if (drawableM3735e != null) {
            setNavigationIcon(drawableM3735e);
        }
        CharSequence text3 = typedArray2.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableM3735e2 = oq0VarM3731n.m3735e(11);
        if (drawableM3735e2 != null) {
            setLogo(drawableM3735e2);
        }
        CharSequence text4 = typedArray2.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray2.hasValue(29)) {
            setTitleTextColor(oq0VarM3731n.m3734d(29));
        }
        if (typedArray2.hasValue(20)) {
            setSubtitleTextColor(oq0VarM3731n.m3734d(20));
        }
        if (typedArray2.hasValue(14)) {
            getMenuInflater().inflate(typedArray2.getResourceId(14, 0), getMenu());
        }
        oq0VarM3731n.m3742o();
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
        return new vb1(getContext());
    }

    /* JADX INFO: renamed from: h */
    public static td1 m364h() {
        td1 td1Var = new td1(-2, -2);
        td1Var.f7438b = 0;
        td1Var.f7437a = 8388627;
        return td1Var;
    }

    /* JADX INFO: renamed from: i */
    public static td1 m365i(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof td1;
        if (z) {
            td1 td1Var = (td1) layoutParams;
            td1 td1Var2 = new td1(td1Var);
            td1Var2.f7438b = 0;
            td1Var2.f7438b = td1Var.f7438b;
            return td1Var2;
        }
        if (z) {
            td1 td1Var3 = new td1((td1) layoutParams);
            td1Var3.f7438b = 0;
            return td1Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            td1 td1Var4 = new td1(layoutParams);
            td1Var4.f7438b = 0;
            return td1Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        td1 td1Var5 = new td1(marginLayoutParams);
        td1Var5.f7438b = 0;
        ((ViewGroup.MarginLayoutParams) td1Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) td1Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) td1Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) td1Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return td1Var5;
    }

    /* JADX INFO: renamed from: k */
    public static int m366k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    /* JADX INFO: renamed from: l */
    public static int m367l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* JADX INFO: renamed from: a */
    public final void m368a(ArrayList arrayList, int i) {
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                td1 td1Var = (td1) childAt.getLayoutParams();
                if (td1Var.f7438b == 0 && m382s(childAt)) {
                    int i3 = td1Var.f7437a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
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
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            td1 td1Var2 = (td1) childAt2.getLayoutParams();
            if (td1Var2.f7438b == 0 && m382s(childAt2)) {
                int i5 = td1Var2.f7437a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m369b(View view, boolean z) {
        td1 td1VarM365i;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            td1VarM365i = m364h();
        } else {
            td1VarM365i = !checkLayoutParams(layoutParams) ? m365i(layoutParams) : (td1) layoutParams;
        }
        td1VarM365i.f7438b = 1;
        if (!z || this.f450r == null) {
            addView(view, td1VarM365i);
        } else {
            view.setLayoutParams(td1VarM365i);
            this.f429N.add(view);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m370c() {
        if (this.f449q == null) {
            C0127d6 c0127d6 = new C0127d6(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f449q = c0127d6;
            c0127d6.setImageDrawable(this.f447o);
            this.f449q.setContentDescription(this.f448p);
            td1 td1VarM364h = m364h();
            td1VarM364h.f7437a = (this.f455w & 112) | 8388611;
            td1VarM364h.f7438b = 2;
            this.f449q.setLayoutParams(td1VarM364h);
            this.f449q.setOnClickListener(new ViewOnClickListenerC0123d2(2, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof td1);
    }

    /* JADX INFO: renamed from: d */
    public final void m371d() {
        if (this.f418C == null) {
            x31 x31Var = new x31();
            x31Var.f8777a = 0;
            x31Var.f8778b = 0;
            x31Var.f8779c = Integer.MIN_VALUE;
            x31Var.f8780d = Integer.MIN_VALUE;
            x31Var.f8781e = 0;
            x31Var.f8782f = 0;
            x31Var.f8783g = false;
            x31Var.f8784h = false;
            this.f418C = x31Var;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m372e() {
        m373f();
        ActionMenuView actionMenuView = this.f442j;
        if (actionMenuView.f399y == null) {
            on0 on0Var = (on0) actionMenuView.getMenu();
            if (this.f436U == null) {
                this.f436U = new sd1(this);
            }
            this.f442j.setExpandedActionViewsExclusive(true);
            on0Var.m3706b(this.f436U, this.f451s);
            m383t();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m373f() {
        if (this.f442j == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f442j = actionMenuView;
            actionMenuView.setPopupTheme(this.f452t);
            this.f442j.setOnMenuItemClickListener(this.f433R);
            ActionMenuView actionMenuView2 = this.f442j;
            an0 an0Var = new an0(9, this);
            actionMenuView2.getClass();
            actionMenuView2.f393D = an0Var;
            td1 td1VarM364h = m364h();
            td1VarM364h.f7437a = (this.f455w & 112) | 8388613;
            this.f442j.setLayoutParams(td1VarM364h);
            m369b(this.f442j, false);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m374g() {
        if (this.f445m == null) {
            this.f445m = new C0127d6(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            td1 td1VarM364h = m364h();
            td1VarM364h.f7437a = (this.f455w & 112) | 8388611;
            this.f445m.setLayoutParams(td1VarM364h);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m364h();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        td1 td1Var = new td1(context, attributeSet);
        td1Var.f7437a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mz0.f5188b);
        td1Var.f7437a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        td1Var.f7438b = 0;
        return td1Var;
    }

    public CharSequence getCollapseContentDescription() {
        C0127d6 c0127d6 = this.f449q;
        if (c0127d6 != null) {
            return c0127d6.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C0127d6 c0127d6 = this.f449q;
        if (c0127d6 != null) {
            return c0127d6.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        x31 x31Var = this.f418C;
        if (x31Var != null) {
            return x31Var.f8783g ? x31Var.f8777a : x31Var.f8778b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f420E;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        x31 x31Var = this.f418C;
        if (x31Var != null) {
            return x31Var.f8777a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        x31 x31Var = this.f418C;
        if (x31Var != null) {
            return x31Var.f8778b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        x31 x31Var = this.f418C;
        if (x31Var != null) {
            return x31Var.f8783g ? x31Var.f8778b : x31Var.f8777a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f419D;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        on0 on0Var;
        ActionMenuView actionMenuView = this.f442j;
        return (actionMenuView == null || (on0Var = actionMenuView.f399y) == null || !on0Var.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f420E, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f419D, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C0200f6 c0200f6 = this.f446n;
        if (c0200f6 != null) {
            return c0200f6.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C0200f6 c0200f6 = this.f446n;
        if (c0200f6 != null) {
            return c0200f6.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m372e();
        return this.f442j.getMenu();
    }

    public View getNavButtonView() {
        return this.f445m;
    }

    public CharSequence getNavigationContentDescription() {
        C0127d6 c0127d6 = this.f445m;
        if (c0127d6 != null) {
            return c0127d6.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C0127d6 c0127d6 = this.f445m;
        if (c0127d6 != null) {
            return c0127d6.getDrawable();
        }
        return null;
    }

    public C0603q2 getOuterActionMenuPresenter() {
        return this.f435T;
    }

    public Drawable getOverflowIcon() {
        m372e();
        return this.f442j.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f451s;
    }

    public int getPopupTheme() {
        return this.f452t;
    }

    public CharSequence getSubtitle() {
        return this.f423H;
    }

    public final TextView getSubtitleTextView() {
        return this.f444l;
    }

    public CharSequence getTitle() {
        return this.f422G;
    }

    public int getTitleMarginBottom() {
        return this.f417B;
    }

    public int getTitleMarginEnd() {
        return this.f458z;
    }

    public int getTitleMarginStart() {
        return this.f457y;
    }

    public int getTitleMarginTop() {
        return this.f416A;
    }

    public final TextView getTitleTextView() {
        return this.f443k;
    }

    public InterfaceC0295hq getWrapper() {
        Drawable drawable;
        if (this.f434S == null) {
            xd1 xd1Var = new xd1();
            xd1Var.f8909n = 0;
            xd1Var.f8896a = this;
            xd1Var.f8903h = getTitle();
            xd1Var.f8904i = getSubtitle();
            xd1Var.f8902g = xd1Var.f8903h != null;
            xd1Var.f8901f = getNavigationIcon();
            oq0 oq0VarM3731n = oq0.m3731n(getContext(), null, mz0.f5187a, R.attr.actionBarStyle);
            TypedArray typedArray = (TypedArray) oq0VarM3731n.f5841l;
            xd1Var.f8910o = oq0VarM3731n.m3735e(15);
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                xd1Var.f8902g = true;
                xd1Var.f8903h = text;
                if ((xd1Var.f8897b & 8) != 0) {
                    setTitle(text);
                    if (xd1Var.f8902g) {
                        ai1.m253f(getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                xd1Var.f8904i = text2;
                if ((xd1Var.f8897b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable drawableM3735e = oq0VarM3731n.m3735e(20);
            if (drawableM3735e != null) {
                xd1Var.f8900e = drawableM3735e;
                xd1Var.m5623c();
            }
            Drawable drawableM3735e2 = oq0VarM3731n.m3735e(17);
            if (drawableM3735e2 != null) {
                xd1Var.f8899d = drawableM3735e2;
                xd1Var.m5623c();
            }
            if (xd1Var.f8901f == null && (drawable = xd1Var.f8910o) != null) {
                xd1Var.f8901f = drawable;
                if ((xd1Var.f8897b & 4) != 0) {
                    setNavigationIcon(drawable);
                } else {
                    setNavigationIcon((Drawable) null);
                }
            }
            xd1Var.m5621a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = xd1Var.f8898c;
                if (view != null && (xd1Var.f8897b & 16) != 0) {
                    removeView(view);
                }
                xd1Var.f8898c = viewInflate;
                if (viewInflate != null && (xd1Var.f8897b & 16) != 0) {
                    addView(viewInflate);
                }
                xd1Var.m5621a(xd1Var.f8897b | 16);
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
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                m371d();
                this.f418C.m5499a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f453u = resourceId2;
                C0276h7 c0276h7 = this.f443k;
                if (c0276h7 != null) {
                    c0276h7.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f454v = resourceId3;
                C0276h7 c0276h8 = this.f444l;
                if (c0276h8 != null) {
                    c0276h8.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            oq0VarM3731n.m3742o();
            if (R.string.abc_action_bar_up_description != xd1Var.f8909n) {
                xd1Var.f8909n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i = xd1Var.f8909n;
                    xd1Var.f8905j = i != 0 ? getContext().getString(i) : null;
                    xd1Var.m5622b();
                }
            }
            xd1Var.f8905j = getNavigationContentDescription();
            setNavigationOnClickListener(new y00(xd1Var));
            this.f434S = xd1Var;
        }
        return this.f434S;
    }

    /* JADX INFO: renamed from: j */
    public final int m375j(View view, int i) {
        td1 td1Var = (td1) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = td1Var.f7437a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.f421F & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) td1Var).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) td1Var).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) td1Var).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        }
        return paddingTop + iMax;
    }

    /* JADX INFO: renamed from: m */
    public final void m376m() {
        ArrayList arrayList = this.f432Q;
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
        Iterator it = ((CopyOnWriteArrayList) this.f431P.f6472l).iterator();
        while (it.hasNext()) {
            ((m50) it.next()).f4977a.m4731k();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f432Q = currentMenuItems2;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m377n(View view) {
        return view.getParent() == this || this.f429N.contains(view);
    }

    /* JADX INFO: renamed from: o */
    public final int m378o(View view, int i, int i2, int[] iArr) {
        td1 td1Var = (td1) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) td1Var).leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int iM375j = m375j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iM375j, iMax + measuredWidth, view.getMeasuredHeight() + iM375j);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) td1Var).rightMargin + iMax;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m383t();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f441c0);
        m383t();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f427L = false;
        }
        if (!this.f427L) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f427L = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f427L = false;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x024b  */
    /* JADX WARN: Code duplicated, block: B:102:0x024e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0270  */
    /* JADX WARN: Code duplicated, block: B:105:0x0273  */
    /* JADX WARN: Code duplicated, block: B:108:0x0285 A[LOOP:0: B:107:0x0283->B:108:0x0285, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x029d A[LOOP:1: B:110:0x029b->B:111:0x029d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:114:0x02bd A[LOOP:2: B:113:0x02bb->B:114:0x02bd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:118:0x0303 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x0305  */
    /* JADX WARN: Code duplicated, block: B:120:0x0309  */
    /* JADX WARN: Code duplicated, block: B:123:0x0310 A[LOOP:3: B:122:0x030e->B:123:0x0310, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:20:0x0060  */
    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    /* JADX WARN: Code duplicated, block: B:28:0x0079  */
    /* JADX WARN: Code duplicated, block: B:29:0x007e  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:48:0x0115  */
    /* JADX WARN: Code duplicated, block: B:51:0x011b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x011d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0120  */
    /* JADX WARN: Code duplicated, block: B:55:0x0124  */
    /* JADX WARN: Code duplicated, block: B:56:0x0127  */
    /* JADX WARN: Code duplicated, block: B:59:0x0139  */
    /* JADX WARN: Code duplicated, block: B:61:0x0141 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:68:0x015a  */
    /* JADX WARN: Code duplicated, block: B:70:0x015e  */
    /* JADX WARN: Code duplicated, block: B:72:0x016f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0171  */
    /* JADX WARN: Code duplicated, block: B:75:0x017d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0189  */
    /* JADX WARN: Code duplicated, block: B:78:0x0193  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:86:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:88:0x01df  */
    /* JADX WARN: Code duplicated, block: B:89:0x0203  */
    /* JADX WARN: Code duplicated, block: B:91:0x0206  */
    /* JADX WARN: Code duplicated, block: B:93:0x020e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0210  */
    /* JADX WARN: Code duplicated, block: B:96:0x0214  */
    /* JADX WARN: Code duplicated, block: B:99:0x0228  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iM378o;
        int iM379p;
        int iMax;
        int iMin;
        boolean zM382s;
        boolean zM382s2;
        int measuredHeight;
        C0276h7 c0276h7;
        C0276h7 c0276h8;
        td1 td1Var;
        td1 td1Var2;
        int i5;
        boolean z2;
        int i6;
        int i7;
        int paddingTop;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int iMax2;
        int i14;
        int i15;
        int i16;
        int i17;
        ArrayList arrayList;
        int size;
        int iM378o2;
        int i18;
        int size2;
        int i19;
        int i20;
        int size3;
        int i21;
        int i22;
        int measuredWidth;
        int i23;
        int i24;
        int i25;
        int size4;
        C0200f6 c0200f6;
        View view;
        ActionMenuView actionMenuView;
        C0127d6 c0127d6;
        boolean z3 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i26 = width - paddingRight;
        int[] iArr = this.f430O;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = ai1.f194a;
        int minimumHeight = getMinimumHeight();
        int iMin2 = minimumHeight >= 0 ? Math.min(minimumHeight, i4 - i2) : 0;
        if (m382s(this.f445m)) {
            C0127d6 c0127d7 = this.f445m;
            if (z3) {
                iM379p = m379p(c0127d7, i26, iMin2, iArr);
                iM378o = paddingLeft;
            } else {
                iM378o = m378o(c0127d7, paddingLeft, iMin2, iArr);
            }
            if (m382s(this.f449q)) {
                c0127d6 = this.f449q;
                if (z3) {
                    iM379p = m379p(c0127d6, iM379p, iMin2, iArr);
                } else {
                    iM378o = m378o(c0127d6, iM378o, iMin2, iArr);
                }
            }
            if (m382s(this.f442j)) {
                actionMenuView = this.f442j;
                if (z3) {
                    iM378o = m378o(actionMenuView, iM378o, iMin2, iArr);
                } else {
                    iM379p = m379p(actionMenuView, iM379p, iMin2, iArr);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iM378o);
            iArr[1] = Math.max(0, currentContentInsetRight - (i26 - iM379p));
            iMax = Math.max(iM378o, currentContentInsetLeft);
            iMin = Math.min(iM379p, i26 - currentContentInsetRight);
            if (m382s(this.f450r)) {
                view = this.f450r;
                if (z3) {
                    iMin = m379p(view, iMin, iMin2, iArr);
                } else {
                    iMax = m378o(view, iMax, iMin2, iArr);
                }
            }
            if (m382s(this.f446n)) {
                c0200f6 = this.f446n;
                if (z3) {
                    iMin = m379p(c0200f6, iMin, iMin2, iArr);
                } else {
                    iMax = m378o(c0200f6, iMax, iMin2, iArr);
                }
            }
            zM382s = m382s(this.f443k);
            zM382s2 = m382s(this.f444l);
            if (zM382s) {
                td1 td1Var3 = (td1) this.f443k.getLayoutParams();
                measuredHeight = this.f443k.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) td1Var3).topMargin + ((ViewGroup.MarginLayoutParams) td1Var3).bottomMargin;
            } else {
                measuredHeight = 0;
            }
            if (zM382s2) {
                td1 td1Var4 = (td1) this.f444l.getLayoutParams();
                measuredHeight = this.f444l.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) td1Var4).topMargin + ((ViewGroup.MarginLayoutParams) td1Var4).bottomMargin + measuredHeight;
            }
            if (zM382s || zM382s2) {
                if (zM382s) {
                    c0276h7 = this.f443k;
                } else {
                    c0276h7 = this.f444l;
                }
                if (zM382s2) {
                    c0276h8 = this.f444l;
                } else {
                    c0276h8 = this.f443k;
                }
                td1Var = (td1) c0276h7.getLayoutParams();
                td1Var2 = (td1) c0276h8.getLayoutParams();
                i5 = measuredHeight;
                z2 = (!zM382s && this.f443k.getMeasuredWidth() > 0) || (zM382s2 && this.f444l.getMeasuredWidth() > 0);
                i6 = this.f421F & 112;
                i7 = iMax;
                if (i6 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) td1Var).topMargin + this.f416A;
                } else if (i6 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                    i14 = ((ViewGroup.MarginLayoutParams) td1Var).topMargin + this.f416A;
                    if (iMax2 < i14) {
                        iMax2 = i14;
                    } else {
                        i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                        i16 = ((ViewGroup.MarginLayoutParams) td1Var).bottomMargin;
                        i17 = this.f417B;
                        if (i15 < i16 + i17) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) td1Var2).bottomMargin + i17) - i15));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) td1Var2).bottomMargin) - this.f417B) - i5;
                }
                if (z3) {
                    if (z2) {
                        i11 = this.f457y;
                    } else {
                        i11 = 0;
                    }
                    int i27 = i11 - iArr[1];
                    iMin -= Math.max(0, i27);
                    iArr[1] = Math.max(0, -i27);
                    if (zM382s) {
                        td1 td1Var5 = (td1) this.f443k.getLayoutParams();
                        int measuredWidth2 = iMin - this.f443k.getMeasuredWidth();
                        int measuredHeight2 = this.f443k.getMeasuredHeight() + paddingTop;
                        this.f443k.layout(measuredWidth2, paddingTop, iMin, measuredHeight2);
                        i12 = measuredWidth2 - this.f458z;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) td1Var5).bottomMargin;
                    } else {
                        i12 = iMin;
                    }
                    if (zM382s2) {
                        int i28 = paddingTop + ((ViewGroup.MarginLayoutParams) ((td1) this.f444l.getLayoutParams())).topMargin;
                        this.f444l.layout(iMin - this.f444l.getMeasuredWidth(), i28, iMin, this.f444l.getMeasuredHeight() + i28);
                        i13 = iMin - this.f458z;
                    } else {
                        i13 = iMin;
                    }
                    if (z2) {
                        iMin = Math.min(i12, i13);
                    }
                    iMax = i7;
                } else {
                    if (z2) {
                        i8 = this.f457y;
                    } else {
                        i8 = 0;
                    }
                    int i29 = i8 - iArr[0];
                    iMax = Math.max(0, i29) + i7;
                    iArr[0] = Math.max(0, -i29);
                    if (zM382s) {
                        td1 td1Var6 = (td1) this.f443k.getLayoutParams();
                        int measuredWidth3 = this.f443k.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.f443k.getMeasuredHeight() + paddingTop;
                        this.f443k.layout(iMax, paddingTop, measuredWidth3, measuredHeight3);
                        i9 = measuredWidth3 + this.f458z;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) td1Var6).bottomMargin;
                    } else {
                        i9 = iMax;
                    }
                    if (zM382s2) {
                        int i30 = paddingTop + ((ViewGroup.MarginLayoutParams) ((td1) this.f444l.getLayoutParams())).topMargin;
                        int measuredWidth4 = this.f444l.getMeasuredWidth() + iMax;
                        this.f444l.layout(iMax, i30, measuredWidth4, this.f444l.getMeasuredHeight() + i30);
                        i10 = measuredWidth4 + this.f458z;
                    } else {
                        i10 = iMax;
                    }
                    if (z2) {
                        iMax = Math.max(i9, i10);
                    }
                }
            }
            arrayList = this.f428M;
            m368a(arrayList, 3);
            size = arrayList.size();
            iM378o2 = iMax;
            for (i18 = 0; i18 < size; i18++) {
                iM378o2 = m378o((View) arrayList.get(i18), iM378o2, iMin2, iArr);
            }
            m368a(arrayList, 5);
            size2 = arrayList.size();
            for (i19 = 0; i19 < size2; i19++) {
                iMin = m379p((View) arrayList.get(i19), iMin, iMin2, iArr);
            }
            m368a(arrayList, 1);
            int i31 = iArr[0];
            i20 = iArr[1];
            size3 = arrayList.size();
            i21 = i31;
            i22 = 0;
            measuredWidth = 0;
            while (i22 < size3) {
                View view2 = (View) arrayList.get(i22);
                td1 td1Var7 = (td1) view2.getLayoutParams();
                int i32 = i20;
                int i33 = ((ViewGroup.MarginLayoutParams) td1Var7).leftMargin - i21;
                int i34 = ((ViewGroup.MarginLayoutParams) td1Var7).rightMargin - i32;
                int iMax3 = Math.max(0, i33);
                int iMax4 = Math.max(0, i34);
                int iMax5 = Math.max(0, -i33);
                int iMax6 = Math.max(0, -i34);
                measuredWidth += view2.getMeasuredWidth() + iMax3 + iMax4;
                i22++;
                i21 = iMax5;
                i20 = iMax6;
            }
            i24 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
            i25 = measuredWidth + i24;
            if (i24 >= iM378o2) {
                if (i25 > iMin) {
                    iM378o2 = i24 - (i25 - iMin);
                } else {
                    iM378o2 = i24;
                }
            }
            size4 = arrayList.size();
            for (i23 = 0; i23 < size4; i23++) {
                iM378o2 = m378o((View) arrayList.get(i23), iM378o2, iMin2, iArr);
            }
            arrayList.clear();
        }
        iM378o = paddingLeft;
        iM379p = i26;
        if (m382s(this.f449q)) {
            c0127d6 = this.f449q;
            if (z3) {
                iM379p = m379p(c0127d6, iM379p, iMin2, iArr);
            } else {
                iM378o = m378o(c0127d6, iM378o, iMin2, iArr);
            }
        }
        if (m382s(this.f442j)) {
            actionMenuView = this.f442j;
            if (z3) {
                iM378o = m378o(actionMenuView, iM378o, iMin2, iArr);
            } else {
                iM379p = m379p(actionMenuView, iM379p, iMin2, iArr);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iM378o);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i26 - iM379p));
        iMax = Math.max(iM378o, currentContentInsetLeft2);
        iMin = Math.min(iM379p, i26 - currentContentInsetRight2);
        if (m382s(this.f450r)) {
            view = this.f450r;
            if (z3) {
                iMin = m379p(view, iMin, iMin2, iArr);
            } else {
                iMax = m378o(view, iMax, iMin2, iArr);
            }
        }
        if (m382s(this.f446n)) {
            c0200f6 = this.f446n;
            if (z3) {
                iMin = m379p(c0200f6, iMin, iMin2, iArr);
            } else {
                iMax = m378o(c0200f6, iMax, iMin2, iArr);
            }
        }
        zM382s = m382s(this.f443k);
        zM382s2 = m382s(this.f444l);
        if (zM382s) {
            td1 td1Var8 = (td1) this.f443k.getLayoutParams();
            measuredHeight = this.f443k.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) td1Var8).topMargin + ((ViewGroup.MarginLayoutParams) td1Var8).bottomMargin;
        } else {
            measuredHeight = 0;
        }
        if (zM382s2) {
            td1 td1Var9 = (td1) this.f444l.getLayoutParams();
            measuredHeight = this.f444l.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) td1Var9).topMargin + ((ViewGroup.MarginLayoutParams) td1Var9).bottomMargin + measuredHeight;
        }
        if (zM382s) {
            if (zM382s) {
                c0276h7 = this.f443k;
            } else {
                c0276h7 = this.f444l;
            }
            if (zM382s2) {
                c0276h8 = this.f444l;
            } else {
                c0276h8 = this.f443k;
            }
            td1Var = (td1) c0276h7.getLayoutParams();
            td1Var2 = (td1) c0276h8.getLayoutParams();
            i5 = measuredHeight;
            if (zM382s) {
            }
            i6 = this.f421F & 112;
            i7 = iMax;
            if (i6 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) td1Var).topMargin + this.f416A;
            } else if (i6 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                i14 = ((ViewGroup.MarginLayoutParams) td1Var).topMargin + this.f416A;
                if (iMax2 < i14) {
                    iMax2 = i14;
                } else {
                    i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                    i16 = ((ViewGroup.MarginLayoutParams) td1Var).bottomMargin;
                    i17 = this.f417B;
                    if (i15 < i16 + i17) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) td1Var2).bottomMargin + i17) - i15));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) td1Var2).bottomMargin) - this.f417B) - i5;
            }
            if (z3) {
                if (z2) {
                    i11 = this.f457y;
                } else {
                    i11 = 0;
                }
                int i210 = i11 - iArr[1];
                iMin -= Math.max(0, i210);
                iArr[1] = Math.max(0, -i210);
                if (zM382s) {
                    td1 td1Var10 = (td1) this.f443k.getLayoutParams();
                    int measuredWidth5 = iMin - this.f443k.getMeasuredWidth();
                    int measuredHeight4 = this.f443k.getMeasuredHeight() + paddingTop;
                    this.f443k.layout(measuredWidth5, paddingTop, iMin, measuredHeight4);
                    i12 = measuredWidth5 - this.f458z;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) td1Var10).bottomMargin;
                } else {
                    i12 = iMin;
                }
                if (zM382s2) {
                    int i211 = paddingTop + ((ViewGroup.MarginLayoutParams) ((td1) this.f444l.getLayoutParams())).topMargin;
                    this.f444l.layout(iMin - this.f444l.getMeasuredWidth(), i211, iMin, this.f444l.getMeasuredHeight() + i211);
                    i13 = iMin - this.f458z;
                } else {
                    i13 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i12, i13);
                }
                iMax = i7;
            } else {
                if (z2) {
                    i8 = this.f457y;
                } else {
                    i8 = 0;
                }
                int i212 = i8 - iArr[0];
                iMax = Math.max(0, i212) + i7;
                iArr[0] = Math.max(0, -i212);
                if (zM382s) {
                    td1 td1Var11 = (td1) this.f443k.getLayoutParams();
                    int measuredWidth6 = this.f443k.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.f443k.getMeasuredHeight() + paddingTop;
                    this.f443k.layout(iMax, paddingTop, measuredWidth6, measuredHeight5);
                    i9 = measuredWidth6 + this.f458z;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) td1Var11).bottomMargin;
                } else {
                    i9 = iMax;
                }
                if (zM382s2) {
                    int i35 = paddingTop + ((ViewGroup.MarginLayoutParams) ((td1) this.f444l.getLayoutParams())).topMargin;
                    int measuredWidth7 = this.f444l.getMeasuredWidth() + iMax;
                    this.f444l.layout(iMax, i35, measuredWidth7, this.f444l.getMeasuredHeight() + i35);
                    i10 = measuredWidth7 + this.f458z;
                } else {
                    i10 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i9, i10);
                }
            }
        } else {
            if (zM382s) {
                c0276h7 = this.f443k;
            } else {
                c0276h7 = this.f444l;
            }
            if (zM382s2) {
                c0276h8 = this.f444l;
            } else {
                c0276h8 = this.f443k;
            }
            td1Var = (td1) c0276h7.getLayoutParams();
            td1Var2 = (td1) c0276h8.getLayoutParams();
            i5 = measuredHeight;
            if (zM382s) {
            }
            i6 = this.f421F & 112;
            i7 = iMax;
            if (i6 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) td1Var).topMargin + this.f416A;
            } else if (i6 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                i14 = ((ViewGroup.MarginLayoutParams) td1Var).topMargin + this.f416A;
                if (iMax2 < i14) {
                    iMax2 = i14;
                } else {
                    i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                    i16 = ((ViewGroup.MarginLayoutParams) td1Var).bottomMargin;
                    i17 = this.f417B;
                    if (i15 < i16 + i17) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) td1Var2).bottomMargin + i17) - i15));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) td1Var2).bottomMargin) - this.f417B) - i5;
            }
            if (z3) {
                if (z2) {
                    i11 = this.f457y;
                } else {
                    i11 = 0;
                }
                int i213 = i11 - iArr[1];
                iMin -= Math.max(0, i213);
                iArr[1] = Math.max(0, -i213);
                if (zM382s) {
                    td1 td1Var12 = (td1) this.f443k.getLayoutParams();
                    int measuredWidth8 = iMin - this.f443k.getMeasuredWidth();
                    int measuredHeight6 = this.f443k.getMeasuredHeight() + paddingTop;
                    this.f443k.layout(measuredWidth8, paddingTop, iMin, measuredHeight6);
                    i12 = measuredWidth8 - this.f458z;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) td1Var12).bottomMargin;
                } else {
                    i12 = iMin;
                }
                if (zM382s2) {
                    int i214 = paddingTop + ((ViewGroup.MarginLayoutParams) ((td1) this.f444l.getLayoutParams())).topMargin;
                    this.f444l.layout(iMin - this.f444l.getMeasuredWidth(), i214, iMin, this.f444l.getMeasuredHeight() + i214);
                    i13 = iMin - this.f458z;
                } else {
                    i13 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i12, i13);
                }
                iMax = i7;
            } else {
                if (z2) {
                    i8 = this.f457y;
                } else {
                    i8 = 0;
                }
                int i215 = i8 - iArr[0];
                iMax = Math.max(0, i215) + i7;
                iArr[0] = Math.max(0, -i215);
                if (zM382s) {
                    td1 td1Var13 = (td1) this.f443k.getLayoutParams();
                    int measuredWidth9 = this.f443k.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.f443k.getMeasuredHeight() + paddingTop;
                    this.f443k.layout(iMax, paddingTop, measuredWidth9, measuredHeight7);
                    i9 = measuredWidth9 + this.f458z;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) td1Var13).bottomMargin;
                } else {
                    i9 = iMax;
                }
                if (zM382s2) {
                    int i36 = paddingTop + ((ViewGroup.MarginLayoutParams) ((td1) this.f444l.getLayoutParams())).topMargin;
                    int measuredWidth10 = this.f444l.getMeasuredWidth() + iMax;
                    this.f444l.layout(iMax, i36, measuredWidth10, this.f444l.getMeasuredHeight() + i36);
                    i10 = measuredWidth10 + this.f458z;
                } else {
                    i10 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i9, i10);
                }
            }
        }
        arrayList = this.f428M;
        m368a(arrayList, 3);
        size = arrayList.size();
        iM378o2 = iMax;
        while (i18 < size) {
            iM378o2 = m378o((View) arrayList.get(i18), iM378o2, iMin2, iArr);
        }
        m368a(arrayList, 5);
        size2 = arrayList.size();
        while (i19 < size2) {
            iMin = m379p((View) arrayList.get(i19), iMin, iMin2, iArr);
        }
        m368a(arrayList, 1);
        int i37 = iArr[0];
        i20 = iArr[1];
        size3 = arrayList.size();
        i21 = i37;
        i22 = 0;
        measuredWidth = 0;
        while (i22 < size3) {
            View view3 = (View) arrayList.get(i22);
            td1 td1Var14 = (td1) view3.getLayoutParams();
            int i38 = i20;
            int i39 = ((ViewGroup.MarginLayoutParams) td1Var14).leftMargin - i21;
            int i310 = ((ViewGroup.MarginLayoutParams) td1Var14).rightMargin - i38;
            int iMax7 = Math.max(0, i39);
            int iMax8 = Math.max(0, i310);
            int iMax9 = Math.max(0, -i39);
            int iMax10 = Math.max(0, -i310);
            measuredWidth += view3.getMeasuredWidth() + iMax7 + iMax8;
            i22++;
            i21 = iMax9;
            i20 = iMax10;
        }
        i24 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
        i25 = measuredWidth + i24;
        if (i24 >= iM378o2) {
            if (i25 > iMin) {
                iM378o2 = i24 - (i25 - iMin);
            } else {
                iM378o2 = i24;
            }
        }
        size4 = arrayList.size();
        while (i23 < size4) {
            iM378o2 = m378o((View) arrayList.get(i23), iM378o2, iMin2, iArr);
        }
        arrayList.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        char c;
        Object[] objArr;
        int iM366k;
        int iMax;
        int iCombineMeasuredStates;
        int iM366k2;
        int iM367l;
        int iCombineMeasuredStates2;
        int iMax2;
        int i3 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c = 0;
        } else {
            c = 1;
            objArr = false;
        }
        if (m382s(this.f445m)) {
            m381r(this.f445m, i, 0, i2, this.f456x);
            iM366k = m366k(this.f445m) + this.f445m.getMeasuredWidth();
            iMax = Math.max(0, m367l(this.f445m) + this.f445m.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f445m.getMeasuredState());
        } else {
            iM366k = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (m382s(this.f449q)) {
            m381r(this.f449q, i, 0, i2, this.f456x);
            iM366k = m366k(this.f449q) + this.f449q.getMeasuredWidth();
            iMax = Math.max(iMax, m367l(this.f449q) + this.f449q.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f449q.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iM366k);
        int iMax4 = Math.max(0, currentContentInsetStart - iM366k);
        Object[] objArr2 = objArr;
        int[] iArr = this.f430O;
        iArr[objArr2 == true ? 1 : 0] = iMax4;
        if (m382s(this.f442j)) {
            m381r(this.f442j, i, iMax3, i2, this.f456x);
            iM366k2 = m366k(this.f442j) + this.f442j.getMeasuredWidth();
            iMax = Math.max(iMax, m367l(this.f442j) + this.f442j.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f442j.getMeasuredState());
        } else {
            iM366k2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iM366k2);
        iArr[c] = Math.max(0, currentContentInsetEnd - iM366k2);
        if (m382s(this.f450r)) {
            iMax5 += m380q(this.f450r, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, m367l(this.f450r) + this.f450r.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f450r.getMeasuredState());
        }
        if (m382s(this.f446n)) {
            iMax5 += m380q(this.f446n, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, m367l(this.f446n) + this.f446n.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f446n.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((td1) childAt.getLayoutParams()).f7438b == 0 && m382s(childAt)) {
                iMax5 += m380q(childAt, i, iMax5, i2, 0, iArr);
                int iMax6 = Math.max(iMax, m367l(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i5 = iMax5;
        int i6 = this.f416A + this.f417B;
        int i7 = this.f457y + this.f458z;
        if (m382s(this.f443k)) {
            m380q(this.f443k, i, i5 + i7, i2, i6, iArr);
            int iM366k3 = m366k(this.f443k) + this.f443k.getMeasuredWidth();
            iM367l = m367l(this.f443k) + this.f443k.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f443k.getMeasuredState());
            iMax2 = iM366k3;
        } else {
            iM367l = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (m382s(this.f444l)) {
            iMax2 = Math.max(iMax2, m380q(this.f444l, i, i5 + i7, i2, i6 + iM367l, iArr));
            iM367l += m367l(this.f444l) + this.f444l.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f444l.getMeasuredState());
        }
        int iMax7 = Math.max(iMax, iM367l);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i5 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16);
        if (!this.f437V) {
            i3 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i8 = 0; i8 < childCount2; i8++) {
            View childAt2 = getChildAt(i8);
            if (m382s(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i3 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i3);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof vd1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        vd1 vd1Var = (vd1) parcelable;
        super.onRestoreInstanceState(vd1Var.f2565j);
        ActionMenuView actionMenuView = this.f442j;
        on0 on0Var = actionMenuView != null ? actionMenuView.f399y : null;
        int i = vd1Var.f8182l;
        if (i != 0 && this.f436U != null && on0Var != null && (menuItemFindItem = on0Var.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (vd1Var.f8183m) {
            RunnableC0897y0 runnableC0897y0 = this.f441c0;
            removeCallbacks(runnableC0897y0);
            post(runnableC0897y0);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        m371d();
        x31 x31Var = this.f418C;
        boolean z = i == 1;
        if (z == x31Var.f8783g) {
            return;
        }
        x31Var.f8783g = z;
        if (!x31Var.f8784h) {
            x31Var.f8777a = x31Var.f8781e;
            x31Var.f8778b = x31Var.f8782f;
            return;
        }
        if (z) {
            int i2 = x31Var.f8780d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = x31Var.f8781e;
            }
            x31Var.f8777a = i2;
            int i3 = x31Var.f8779c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = x31Var.f8782f;
            }
            x31Var.f8778b = i3;
            return;
        }
        int i4 = x31Var.f8779c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = x31Var.f8781e;
        }
        x31Var.f8777a = i4;
        int i5 = x31Var.f8780d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = x31Var.f8782f;
        }
        x31Var.f8778b = i5;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0603q2 c0603q2;
        rn0 rn0Var;
        vd1 vd1Var = new vd1(super.onSaveInstanceState());
        sd1 sd1Var = this.f436U;
        if (sd1Var != null && (rn0Var = sd1Var.f7099k) != null) {
            vd1Var.f8182l = rn0Var.f6903j;
        }
        ActionMenuView actionMenuView = this.f442j;
        vd1Var.f8183m = (actionMenuView == null || (c0603q2 = actionMenuView.f392C) == null || !c0603q2.m4027i()) ? false : true;
        return vd1Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f426K = false;
        }
        if (!this.f426K) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f426K = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f426K = false;
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final int m379p(View view, int i, int i2, int[] iArr) {
        td1 td1Var = (td1) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) td1Var).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iM375j = m375j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iM375j, iMax, view.getMeasuredHeight() + iM375j);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) td1Var).leftMargin);
    }

    /* JADX INFO: renamed from: q */
    public final int m380q(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    /* JADX INFO: renamed from: r */
    public final void m381r(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* JADX INFO: renamed from: s */
    public final boolean m382s(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.f440b0 != z) {
            this.f440b0 = z;
            m383t();
        }
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m370c();
        }
        C0127d6 c0127d6 = this.f449q;
        if (c0127d6 != null) {
            c0127d6.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            m370c();
            this.f449q.setImageDrawable(drawable);
        } else {
            C0127d6 c0127d6 = this.f449q;
            if (c0127d6 != null) {
                c0127d6.setImageDrawable(this.f447o);
            }
        }
    }

    public void setCollapsible(boolean z) {
        this.f437V = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f420E) {
            this.f420E = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f419D) {
            this.f419D = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(Drawable drawable) {
        C0200f6 c0200f6 = this.f446n;
        if (drawable != null) {
            if (c0200f6 == null) {
                this.f446n = new C0200f6(getContext(), null, 0);
            }
            if (!m377n(this.f446n)) {
                m369b(this.f446n, true);
            }
        } else if (c0200f6 != null && m377n(c0200f6)) {
            removeView(this.f446n);
            this.f429N.remove(this.f446n);
        }
        C0200f6 c0200f7 = this.f446n;
        if (c0200f7 != null) {
            c0200f7.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f446n == null) {
            this.f446n = new C0200f6(getContext(), null, 0);
        }
        C0200f6 c0200f6 = this.f446n;
        if (c0200f6 != null) {
            c0200f6.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m374g();
        }
        C0127d6 c0127d6 = this.f445m;
        if (c0127d6 != null) {
            c0127d6.setContentDescription(charSequence);
            yd1.m5788a(this.f445m, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m374g();
            if (!m377n(this.f445m)) {
                m369b(this.f445m, true);
            }
        } else {
            C0127d6 c0127d6 = this.f445m;
            if (c0127d6 != null && m377n(c0127d6)) {
                removeView(this.f445m);
                this.f429N.remove(this.f445m);
            }
        }
        C0127d6 c0127d7 = this.f445m;
        if (c0127d7 != null) {
            c0127d7.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m374g();
        this.f445m.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        m372e();
        this.f442j.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f452t != i) {
            this.f452t = i;
            if (i == 0) {
                this.f451s = getContext();
            } else {
                this.f451s = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        C0276h7 c0276h7 = this.f444l;
        if (!zIsEmpty) {
            if (c0276h7 == null) {
                Context context = getContext();
                C0276h7 c0276h8 = new C0276h7(context, null);
                this.f444l = c0276h8;
                c0276h8.setSingleLine();
                this.f444l.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f454v;
                if (i != 0) {
                    this.f444l.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f425J;
                if (colorStateList != null) {
                    this.f444l.setTextColor(colorStateList);
                }
            }
            if (!m377n(this.f444l)) {
                m369b(this.f444l, true);
            }
        } else if (c0276h7 != null && m377n(c0276h7)) {
            removeView(this.f444l);
            this.f429N.remove(this.f444l);
        }
        C0276h7 c0276h9 = this.f444l;
        if (c0276h9 != null) {
            c0276h9.setText(charSequence);
        }
        this.f423H = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f425J = colorStateList;
        C0276h7 c0276h7 = this.f444l;
        if (c0276h7 != null) {
            c0276h7.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        C0276h7 c0276h7 = this.f443k;
        if (!zIsEmpty) {
            if (c0276h7 == null) {
                Context context = getContext();
                C0276h7 c0276h8 = new C0276h7(context, null);
                this.f443k = c0276h8;
                c0276h8.setSingleLine();
                this.f443k.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f453u;
                if (i != 0) {
                    this.f443k.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f424I;
                if (colorStateList != null) {
                    this.f443k.setTextColor(colorStateList);
                }
            }
            if (!m377n(this.f443k)) {
                m369b(this.f443k, true);
            }
        } else if (c0276h7 != null && m377n(c0276h7)) {
            removeView(this.f443k);
            this.f429N.remove(this.f443k);
        }
        C0276h7 c0276h9 = this.f443k;
        if (c0276h9 != null) {
            c0276h9.setText(charSequence);
        }
        this.f422G = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.f417B = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f458z = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f457y = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f416A = i;
        requestLayout();
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f424I = colorStateList;
        C0276h7 c0276h7 = this.f443k;
        if (c0276h7 != null) {
            c0276h7.setTextColor(colorStateList);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m383t() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherM4342a = rd1.m4342a(this);
            sd1 sd1Var = this.f436U;
            int i = 0;
            boolean z = (sd1Var == null || sd1Var.f7099k == null || onBackInvokedDispatcherM4342a == null || !isAttachedToWindow() || !this.f440b0) ? false : true;
            if (z && this.f439a0 == null) {
                if (this.f438W == null) {
                    this.f438W = rd1.m4343b(new qd1(this, i));
                }
                rd1.m4344c(onBackInvokedDispatcherM4342a, this.f438W);
                this.f439a0 = onBackInvokedDispatcherM4342a;
                return;
            }
            if (z || (onBackInvokedDispatcher = this.f439a0) == null) {
                return;
            }
            rd1.m4345d(onBackInvokedDispatcher, this.f438W);
            this.f439a0 = null;
        }
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(j22.m2807p(getContext(), i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m365i(layoutParams);
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(j22.m2807p(getContext(), i));
    }

    public void setOnMenuItemClickListener(ud1 ud1Var) {
    }

    public void setLogo(int i) {
        setLogo(j22.m2807p(getContext(), i));
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }
}
