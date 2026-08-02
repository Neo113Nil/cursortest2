package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.core.widget.NestedScrollView;
import java.util.WeakHashMap;
import live.football.scorerepublic.R;
import p000.C0159e2;
import p000.C0270h1;
import p000.C0271h2;
import p000.C0308i2;
import p000.C0603q2;
import p000.InterfaceC0234g2;
import p000.InterfaceC0295hq;
import p000.RunnableC0196f2;
import p000.ai1;
import p000.ak1;
import p000.do0;
import p000.hj1;
import p000.ij1;
import p000.j22;
import p000.jj1;
import p000.ki1;
import p000.kj1;
import p000.lj1;
import p000.mj1;
import p000.nj1;
import p000.oj1;
import p000.on0;
import p000.sd1;
import p000.tr0;
import p000.uh1;
import p000.ur0;
import p000.vr0;
import p000.wd0;
import p000.xd1;
import p000.xj1;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements tr0, ur0 {

    /* JADX INFO: renamed from: L */
    public static final int[] f359L = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* JADX INFO: renamed from: M */
    public static final ak1 f360M;

    /* JADX INFO: renamed from: N */
    public static final Rect f361N;

    /* JADX INFO: renamed from: A */
    public ak1 f362A;

    /* JADX INFO: renamed from: B */
    public ak1 f363B;

    /* JADX INFO: renamed from: C */
    public ak1 f364C;

    /* JADX INFO: renamed from: D */
    public InterfaceC0234g2 f365D;

    /* JADX INFO: renamed from: E */
    public OverScroller f366E;

    /* JADX INFO: renamed from: F */
    public ViewPropertyAnimator f367F;

    /* JADX INFO: renamed from: G */
    public final C0159e2 f368G;

    /* JADX INFO: renamed from: H */
    public final RunnableC0196f2 f369H;

    /* JADX INFO: renamed from: I */
    public final RunnableC0196f2 f370I;

    /* JADX INFO: renamed from: J */
    public final vr0 f371J;

    /* JADX INFO: renamed from: K */
    public final C0308i2 f372K;

    /* JADX INFO: renamed from: j */
    public int f373j;

    /* JADX INFO: renamed from: k */
    public int f374k;

    /* JADX INFO: renamed from: l */
    public ContentFrameLayout f375l;

    /* JADX INFO: renamed from: m */
    public ActionBarContainer f376m;

    /* JADX INFO: renamed from: n */
    public InterfaceC0295hq f377n;

    /* JADX INFO: renamed from: o */
    public Drawable f378o;

    /* JADX INFO: renamed from: p */
    public boolean f379p;

    /* JADX INFO: renamed from: q */
    public boolean f380q;

    /* JADX INFO: renamed from: r */
    public boolean f381r;

    /* JADX INFO: renamed from: s */
    public boolean f382s;

    /* JADX INFO: renamed from: t */
    public int f383t;

    /* JADX INFO: renamed from: u */
    public int f384u;

    /* JADX INFO: renamed from: v */
    public final Rect f385v;

    /* JADX INFO: renamed from: w */
    public final Rect f386w;

    /* JADX INFO: renamed from: x */
    public final Rect f387x;

    /* JADX INFO: renamed from: y */
    public final Rect f388y;

    /* JADX INFO: renamed from: z */
    public ak1 f389z;

    static {
        oj1 jj1Var;
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            jj1Var = new nj1();
        } else if (i >= 35) {
            jj1Var = new mj1();
        } else if (i >= 34) {
            jj1Var = new lj1();
        } else if (i >= 31) {
            jj1Var = new kj1();
        } else {
            jj1Var = i >= 30 ? new jj1() : new ij1();
        }
        jj1Var.mo2655d(wd0.m5318a(0, 1, 0, 1));
        f360M = jj1Var.mo2654b();
        f361N = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f374k = 0;
        this.f385v = new Rect();
        this.f386w = new Rect();
        this.f387x = new Rect();
        this.f388y = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        ak1 ak1Var = ak1.f228b;
        this.f389z = ak1Var;
        this.f362A = ak1Var;
        this.f363B = ak1Var;
        this.f364C = ak1Var;
        this.f368G = new C0159e2(0, this);
        this.f369H = new RunnableC0196f2(this, 0);
        this.f370I = new RunnableC0196f2(this, 1);
        m353i(context);
        this.f371J = new vr0();
        C0308i2 c0308i2 = new C0308i2(context);
        c0308i2.setWillNotDraw(true);
        this.f372K = c0308i2;
        addView(c0308i2);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m345g(View view, Rect rect, boolean z) {
        boolean z2;
        C0271h2 c0271h2 = (C0271h2) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) c0271h2).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) c0271h2).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) c0271h2).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) c0271h2).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) c0271h2).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) c0271h2).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) c0271h2).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) c0271h2).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    @Override // p000.tr0
    /* JADX INFO: renamed from: a */
    public final void mo346a(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // p000.tr0
    /* JADX INFO: renamed from: b */
    public final void mo347b(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // p000.ur0
    /* JADX INFO: renamed from: c */
    public final void mo348c(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        mo350e(nestedScrollView, i, i2, i3, i4, i5);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0271h2;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f378o != null) {
            if (this.f376m.getVisibility() == 0) {
                translationY = (int) (this.f376m.getTranslationY() + this.f376m.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.f378o.setBounds(0, translationY, getWidth(), this.f378o.getIntrinsicHeight() + translationY);
            this.f378o.draw(canvas);
        }
    }

    @Override // p000.tr0
    /* JADX INFO: renamed from: e */
    public final void mo350e(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(nestedScrollView, i, i2, i3, i4);
        }
    }

    @Override // p000.tr0
    /* JADX INFO: renamed from: f */
    public final boolean mo351f(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0271h2(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0271h2(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f376m;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        vr0 vr0Var = this.f371J;
        return vr0Var.f8255b | vr0Var.f8254a;
    }

    public CharSequence getTitle() {
        m355k();
        return ((xd1) this.f377n).f8896a.getTitle();
    }

    /* JADX INFO: renamed from: h */
    public final void m352h() {
        removeCallbacks(this.f369H);
        removeCallbacks(this.f370I);
        ViewPropertyAnimator viewPropertyAnimator = this.f367F;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m353i(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f359L);
        this.f373j = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f378o = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f366E = new OverScroller(context);
    }

    /* JADX INFO: renamed from: j */
    public final void m354j(int i) {
        m355k();
        if (i == 2) {
            ((xd1) this.f377n).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((xd1) this.f377n).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m355k() {
        InterfaceC0295hq wrapper;
        if (this.f375l == null) {
            this.f375l = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f376m = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof InterfaceC0295hq) {
                wrapper = (InterfaceC0295hq) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    C0270h1.m2191g("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                    return;
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f377n = wrapper;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m356l(Menu menu, do0 do0Var) {
        m355k();
        xd1 xd1Var = (xd1) this.f377n;
        Toolbar toolbar = xd1Var.f8896a;
        if (xd1Var.f8908m == null) {
            xd1Var.f8908m = new C0603q2(toolbar.getContext());
        }
        C0603q2 c0603q2 = xd1Var.f8908m;
        c0603q2.f6328n = do0Var;
        on0 on0Var = (on0) menu;
        if (on0Var == null && toolbar.f442j == null) {
            return;
        }
        toolbar.m373f();
        on0 on0Var2 = toolbar.f442j.f399y;
        if (on0Var2 == on0Var) {
            return;
        }
        if (on0Var2 != null) {
            on0Var2.m3714r(toolbar.f435T);
            on0Var2.m3714r(toolbar.f436U);
        }
        if (toolbar.f436U == null) {
            toolbar.f436U = new sd1(toolbar);
        }
        c0603q2.f6340z = true;
        Context context = toolbar.f451s;
        if (on0Var != null) {
            on0Var.m3706b(c0603q2, context);
            on0Var.m3706b(toolbar.f436U, toolbar.f451s);
        } else {
            c0603q2.mo1486h(context, null);
            toolbar.f436U.mo1486h(toolbar.f451s, null);
            c0603q2.mo1485g();
            toolbar.f436U.mo1485g();
        }
        toolbar.f442j.setPopupTheme(toolbar.f452t);
        toolbar.f442j.setPresenter(c0603q2);
        toolbar.f435T = c0603q2;
        toolbar.m383t();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        m355k();
        ak1 ak1VarM270b = ak1.m270b(windowInsets, this);
        xj1 xj1Var = ak1VarM270b.f229a;
        boolean zM345g = m345g(this.f376m, new Rect(xj1Var.mo3938k().f8515a, xj1Var.mo3938k().f8516b, xj1Var.mo3938k().f8517c, xj1Var.mo3938k().f8518d), false);
        WeakHashMap weakHashMap = ai1.f194a;
        Rect rect = this.f385v;
        uh1.m4920b(this, ak1VarM270b, rect);
        ak1 ak1VarMo4533o = xj1Var.mo4533o(rect.left, rect.top, rect.right, rect.bottom);
        this.f389z = ak1VarMo4533o;
        boolean z = true;
        if (!this.f362A.equals(ak1VarMo4533o)) {
            this.f362A = this.f389z;
            zM345g = true;
        }
        Rect rect2 = this.f386w;
        if (rect2.equals(rect)) {
            z = zM345g;
        } else {
            rect2.set(rect);
        }
        if (z) {
            requestLayout();
        }
        return xj1Var.mo4358a().f229a.mo4102c().f229a.mo4101b().m271a();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m353i(getContext());
        WeakHashMap weakHashMap = ai1.f194a;
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m352h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0271h2 c0271h2 = (C0271h2) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c0271h2).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c0271h2).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:24:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:25:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:28:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:30:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:31:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:33:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:34:0x0104  */
    /* JADX WARN: Code duplicated, block: B:36:0x0108  */
    /* JADX WARN: Code duplicated, block: B:37:0x010e  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        ak1 ak1Var;
        int i3;
        oj1 ij1Var;
        m355k();
        measureChildWithMargins(this.f376m, i, 0, i2, 0);
        C0271h2 c0271h2 = (C0271h2) this.f376m.getLayoutParams();
        int iMax = Math.max(0, this.f376m.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0271h2).leftMargin + ((ViewGroup.MarginLayoutParams) c0271h2).rightMargin);
        int iMax2 = Math.max(0, this.f376m.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0271h2).topMargin + ((ViewGroup.MarginLayoutParams) c0271h2).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f376m.getMeasuredState());
        WeakHashMap weakHashMap = ai1.f194a;
        boolean z = (getWindowSystemUiVisibility() & 256) != 0;
        if (z) {
            measuredHeight = this.f373j;
            if (this.f380q && this.f376m.getTabContainer() != null) {
                measuredHeight += this.f373j;
            }
        } else {
            measuredHeight = this.f376m.getVisibility() != 8 ? this.f376m.getMeasuredHeight() : 0;
        }
        Rect rect = this.f385v;
        Rect rect2 = this.f387x;
        rect2.set(rect);
        this.f363B = this.f389z;
        if (this.f379p || z) {
            wd0 wd0VarM5318a = wd0.m5318a(this.f363B.f229a.mo3938k().f8515a, this.f363B.f229a.mo3938k().f8516b + measuredHeight, this.f363B.f229a.mo3938k().f8517c, this.f363B.f229a.mo3938k().f8518d);
            ak1Var = this.f363B;
            i3 = Build.VERSION.SDK_INT;
            if (i3 >= 36) {
                ij1Var = new nj1(ak1Var);
            } else if (i3 >= 35) {
                ij1Var = new mj1(ak1Var);
            } else if (i3 >= 34) {
                ij1Var = new lj1(ak1Var);
            } else if (i3 >= 31) {
                ij1Var = new kj1(ak1Var);
            } else if (i3 >= 30) {
                ij1Var = new jj1(ak1Var);
            } else {
                ij1Var = new ij1(ak1Var);
            }
            ij1Var.mo2655d(wd0VarM5318a);
            this.f363B = ij1Var.mo2654b();
        } else {
            C0308i2 c0308i2 = this.f372K;
            ak1 ak1Var2 = f360M;
            Rect rect3 = this.f388y;
            uh1.m4920b(c0308i2, ak1Var2, rect3);
            if (rect3.equals(f361N)) {
                wd0 wd0VarM5318a2 = wd0.m5318a(this.f363B.f229a.mo3938k().f8515a, this.f363B.f229a.mo3938k().f8516b + measuredHeight, this.f363B.f229a.mo3938k().f8517c, this.f363B.f229a.mo3938k().f8518d);
                ak1Var = this.f363B;
                i3 = Build.VERSION.SDK_INT;
                if (i3 >= 36) {
                    ij1Var = new nj1(ak1Var);
                } else if (i3 >= 35) {
                    ij1Var = new mj1(ak1Var);
                } else if (i3 >= 34) {
                    ij1Var = new lj1(ak1Var);
                } else if (i3 >= 31) {
                    ij1Var = new kj1(ak1Var);
                } else if (i3 >= 30) {
                    ij1Var = new jj1(ak1Var);
                } else {
                    ij1Var = new ij1(ak1Var);
                }
                ij1Var.mo2655d(wd0VarM5318a2);
                this.f363B = ij1Var.mo2654b();
            } else {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f363B = this.f363B.f229a.mo4533o(0, measuredHeight, 0, 0);
            }
        }
        m345g(this.f375l, rect2, true);
        if (!this.f364C.equals(this.f363B)) {
            ak1 ak1Var3 = this.f363B;
            this.f364C = ak1Var3;
            ai1.m249b(this.f375l, ak1Var3);
        }
        measureChildWithMargins(this.f375l, i, 0, i2, 0);
        C0271h2 c0271h3 = (C0271h2) this.f375l.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f375l.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0271h3).leftMargin + ((ViewGroup.MarginLayoutParams) c0271h3).rightMargin);
        int iMax4 = Math.max(iMax2, this.f375l.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0271h3).topMargin + ((ViewGroup.MarginLayoutParams) c0271h3).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f375l.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f381r || !z) {
            return false;
        }
        this.f366E.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f366E.getFinalY() > this.f376m.getHeight()) {
            m352h();
            this.f370I.run();
        } else {
            m352h();
            this.f369H.run();
        }
        this.f382s = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f383t + i2;
        this.f383t = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        hj1 hj1Var;
        ki1 ki1Var;
        this.f371J.f8254a = i;
        this.f383t = getActionBarHideOffset();
        m352h();
        InterfaceC0234g2 interfaceC0234g2 = this.f365D;
        if (interfaceC0234g2 == null || (ki1Var = (hj1Var = (hj1) interfaceC0234g2).f3245s) == null) {
            return;
        }
        ki1Var.m3045a();
        hj1Var.f3245s = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f376m.getVisibility() != 0) {
            return false;
        }
        return this.f381r;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f381r || this.f382s) {
            return;
        }
        if (this.f383t <= this.f376m.getHeight()) {
            m352h();
            postDelayed(this.f369H, 600L);
        } else {
            m352h();
            postDelayed(this.f370I, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        m355k();
        int i2 = this.f384u ^ i;
        this.f384u = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        InterfaceC0234g2 interfaceC0234g2 = this.f365D;
        if (interfaceC0234g2 != null) {
            hj1 hj1Var = (hj1) interfaceC0234g2;
            hj1Var.f3241o = !z2;
            if (z || !z2) {
                if (hj1Var.f3242p) {
                    hj1Var.f3242p = false;
                    hj1Var.m2280f(true);
                }
            } else if (!hj1Var.f3242p) {
                hj1Var.f3242p = true;
                hj1Var.m2280f(true);
            }
        }
        if ((i2 & 256) == 0 || this.f365D == null) {
            return;
        }
        WeakHashMap weakHashMap = ai1.f194a;
        requestApplyInsets();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f374k = i;
        InterfaceC0234g2 interfaceC0234g2 = this.f365D;
        if (interfaceC0234g2 != null) {
            ((hj1) interfaceC0234g2).f3240n = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        m352h();
        this.f376m.setTranslationY(-Math.max(0, Math.min(i, this.f376m.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0234g2 interfaceC0234g2) {
        this.f365D = interfaceC0234g2;
        if (getWindowToken() != null) {
            ((hj1) this.f365D).f3240n = this.f374k;
            int i = this.f384u;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = ai1.f194a;
                requestApplyInsets();
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f380q = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f381r) {
            this.f381r = z;
            if (z) {
                return;
            }
            m352h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        m355k();
        xd1 xd1Var = (xd1) this.f377n;
        xd1Var.f8899d = i != 0 ? j22.m2807p(xd1Var.f8896a.getContext(), i) : null;
        xd1Var.m5623c();
    }

    public void setLogo(int i) {
        m355k();
        xd1 xd1Var = (xd1) this.f377n;
        xd1Var.f8900e = i != 0 ? j22.m2807p(xd1Var.f8896a.getContext(), i) : null;
        xd1Var.m5623c();
    }

    public void setOverlayMode(boolean z) {
        this.f379p = z;
    }

    public void setWindowCallback(Window.Callback callback) {
        m355k();
        ((xd1) this.f377n).f8906k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        m355k();
        xd1 xd1Var = (xd1) this.f377n;
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

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0271h2(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        m355k();
        xd1 xd1Var = (xd1) this.f377n;
        xd1Var.f8899d = drawable;
        xd1Var.m5623c();
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // p000.tr0
    /* JADX INFO: renamed from: d */
    public final void mo349d(int i, int i2, int[] iArr, int i3) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }
}
