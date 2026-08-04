package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import p155w1.C1009l0;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements p086m.j, p086m.z {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public p086m.k f8235G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public Context f8236H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f8237I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f8238J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public C0623j f8239K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public B3.g f8240L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public p086m.i f8241M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f8242N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f8243O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final int f8244P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final int f8245Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public InterfaceC0629m f8246R;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f7 = context.getResources().getDisplayMetrics().density;
        this.f8244P = (int) (56.0f * f7);
        this.f8245Q = (int) (f7 * 4.0f);
        this.f8236H = context;
        this.f8237I = 0;
    }

    public static C0627l k() {
        C0627l c0627l = new C0627l(-2, -2);
        c0627l.f8677a = false;
        ((LinearLayout.LayoutParams) c0627l).gravity = 16;
        return c0627l;
    }

    public static C0627l l(ViewGroup.LayoutParams layoutParams) {
        C0627l c0627l;
        if (layoutParams == null) {
            return k();
        }
        if (layoutParams instanceof C0627l) {
            C0627l c0627l2 = (C0627l) layoutParams;
            c0627l = new C0627l(c0627l2);
            c0627l.f8677a = c0627l2.f8677a;
        } else {
            c0627l = new C0627l(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c0627l).gravity <= 0) {
            ((LinearLayout.LayoutParams) c0627l).gravity = 16;
        }
        return c0627l;
    }

    @Override // p086m.z
    public final void a(p086m.k kVar) {
        this.f8235G = kVar;
    }

    @Override // p086m.j
    public final boolean b(p086m.m mVar) {
        return this.f8235G.q(mVar, null, 0);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0627l;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ C0636p0 generateDefaultLayoutParams() {
        return k();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return k();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return l(layoutParams);
    }

    public Menu getMenu() {
        if (this.f8235G == null) {
            Context context = getContext();
            p086m.k kVar = new p086m.k(context);
            this.f8235G = kVar;
            kVar.f15148e = new A1.x0(this, 12);
            C0623j c0623j = new C0623j(context);
            this.f8239K = c0623j;
            c0623j.f8639C = true;
            c0623j.f8640D = true;
            p086m.w c1009l0 = this.f8240L;
            if (c1009l0 == null) {
                c1009l0 = new C1009l0(14);
            }
            c0623j.f8655e = c1009l0;
            this.f8235G.b(c0623j, this.f8236H);
            C0623j c0623j2 = this.f8239K;
            c0623j2.f8658y = this;
            this.f8235G = c0623j2.f8653c;
        }
        return this.f8235G;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C0623j c0623j = this.f8239K;
        C0621i c0621i = c0623j.f8659z;
        if (c0621i != null) {
            return c0621i.getDrawable();
        }
        if (c0623j.f8638B) {
            return c0623j.f8637A;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f8237I;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* JADX INFO: renamed from: h */
    public final C0636p0 generateLayoutParams(AttributeSet attributeSet) {
        return new C0627l(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ C0636p0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return l(layoutParams);
    }

    public final boolean m(int i7) {
        boolean zB = false;
        if (i7 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i7 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i7);
        if (i7 < getChildCount() && (childAt instanceof InterfaceC0625k)) {
            zB = ((InterfaceC0625k) childAt).b();
        }
        return (i7 <= 0 || !(childAt2 instanceof InterfaceC0625k)) ? zB : zB | ((InterfaceC0625k) childAt2).c();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0623j c0623j = this.f8239K;
        if (c0623j != null) {
            c0623j.f();
            if (this.f8239K.k()) {
                this.f8239K.h();
                this.f8239K.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0623j c0623j = this.f8239K;
        if (c0623j != null) {
            c0623j.h();
            C0613e c0613e = c0623j.f8647K;
            if (c0613e == null || !c0613e.b()) {
                return;
            }
            c0613e.f15205i.dismiss();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i7, int i8, int i9, int i10) {
        int width;
        int paddingLeft;
        if (!this.f8242N) {
            super.onLayout(z4, i7, i8, i9, i10);
            return;
        }
        int childCount = getChildCount();
        int i11 = (i10 - i8) / 2;
        int dividerWidth = getDividerWidth();
        int i12 = i9 - i7;
        int paddingRight = (i12 - getPaddingRight()) - getPaddingLeft();
        boolean zA = q1.a(this);
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                C0627l c0627l = (C0627l) childAt.getLayoutParams();
                if (c0627l.f8677a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m(i15)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zA) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) c0627l).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c0627l).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i16 = i11 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i16, width, measuredHeight + i16);
                    paddingRight -= measuredWidth;
                    i13 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0627l).leftMargin) + ((LinearLayout.LayoutParams) c0627l).rightMargin;
                    m(i15);
                    i14++;
                }
            }
        }
        if (childCount == 1 && i13 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i17 = (i12 / 2) - (measuredWidth2 / 2);
            int i18 = i11 - (measuredHeight2 / 2);
            childAt2.layout(i17, i18, measuredWidth2 + i17, measuredHeight2 + i18);
            return;
        }
        int i19 = i14 - (i13 ^ 1);
        int iMax = Math.max(0, i19 > 0 ? paddingRight / i19 : 0);
        if (zA) {
            int width2 = getWidth() - getPaddingRight();
            for (int i20 = 0; i20 < childCount; i20++) {
                View childAt3 = getChildAt(i20);
                C0627l c0627l2 = (C0627l) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0627l2.f8677a) {
                    int i21 = width2 - ((LinearLayout.LayoutParams) c0627l2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i22 = i11 - (measuredHeight3 / 2);
                    childAt3.layout(i21 - measuredWidth3, i22, i21, measuredHeight3 + i22);
                    width2 = i21 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c0627l2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i23 = 0; i23 < childCount; i23++) {
            View childAt4 = getChildAt(i23);
            C0627l c0627l3 = (C0627l) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0627l3.f8677a) {
                int i24 = paddingLeft2 + ((LinearLayout.LayoutParams) c0627l3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i25 = i11 - (measuredHeight4 / 2);
                childAt4.layout(i24, i25, i24 + measuredWidth4, measuredHeight4 + i25);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) c0627l3).rightMargin + iMax + i24;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v36 */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i7, int i8) {
        int i9;
        boolean z4;
        int i10;
        boolean z7;
        int i11;
        ?? r7;
        int i12;
        p086m.k kVar;
        boolean z8 = this.f8242N;
        boolean z9 = View.MeasureSpec.getMode(i7) == 1073741824;
        this.f8242N = z9;
        if (z8 != z9) {
            this.f8243O = 0;
        }
        int size = View.MeasureSpec.getSize(i7);
        if (this.f8242N && (kVar = this.f8235G) != null && size != this.f8243O) {
            this.f8243O = size;
            kVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.f8242N || childCount <= 0) {
            for (int i13 = 0; i13 < childCount; i13++) {
                C0627l c0627l = (C0627l) getChildAt(i13).getLayoutParams();
                ((LinearLayout.LayoutParams) c0627l).rightMargin = 0;
                ((LinearLayout.LayoutParams) c0627l).leftMargin = 0;
            }
            super.onMeasure(i7, i8);
            return;
        }
        int mode = View.MeasureSpec.getMode(i8);
        int size2 = View.MeasureSpec.getSize(i7);
        int size3 = View.MeasureSpec.getSize(i8);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i8, paddingBottom, -2);
        int i14 = size2 - paddingRight;
        int i15 = this.f8244P;
        int i16 = i14 / i15;
        int i17 = i14 % i15;
        if (i16 == 0) {
            setMeasuredDimension(i14, 0);
            return;
        }
        int i18 = (i17 / i16) + i15;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i19 = 0;
        int iMax2 = 0;
        int i20 = 0;
        boolean z10 = false;
        int i21 = 0;
        long j = 0;
        while (true) {
            i9 = this.f8245Q;
            if (i20 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i20);
            int i22 = size3;
            int i23 = i14;
            if (childAt.getVisibility() != 8) {
                boolean z11 = childAt instanceof ActionMenuItemView;
                int i24 = i19 + 1;
                if (z11) {
                    childAt.setPadding(i9, 0, i9, 0);
                }
                C0627l c0627l2 = (C0627l) childAt.getLayoutParams();
                c0627l2.f8682f = false;
                c0627l2.f8679c = 0;
                c0627l2.f8678b = 0;
                c0627l2.f8680d = false;
                ((LinearLayout.LayoutParams) c0627l2).leftMargin = 0;
                ((LinearLayout.LayoutParams) c0627l2).rightMargin = 0;
                c0627l2.f8681e = z11 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i25 = c0627l2.f8677a ? 1 : i16;
                C0627l c0627l3 = (C0627l) childAt.getLayoutParams();
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z11 ? (ActionMenuItemView) childAt : null;
                boolean z12 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                if (i25 <= 0 || (z12 && i25 < 2)) {
                    i12 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i25 * i18, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i12 = measuredWidth / i18;
                    if (measuredWidth % i18 != 0) {
                        i12++;
                    }
                    if (z12 && i12 < 2) {
                        i12 = 2;
                    }
                }
                c0627l3.f8680d = !c0627l3.f8677a && z12;
                c0627l3.f8678b = i12;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i12 * i18, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i12);
                if (c0627l2.f8680d) {
                    i21++;
                }
                if (c0627l2.f8677a) {
                    z10 = true;
                }
                i16 -= i12;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i12 == 1) {
                    j |= (long) (1 << i20);
                }
                i19 = i24;
            }
            i20++;
            size3 = i22;
            i14 = i23;
            paddingBottom = paddingBottom;
            mode = mode;
        }
        int i26 = mode;
        int i27 = i14;
        int i28 = size3;
        boolean z13 = z10 && i19 == 2;
        boolean z14 = false;
        while (true) {
            if (i21 <= 0 || i16 <= 0) {
                z4 = z14;
                break;
            }
            int i29 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            int i30 = 0;
            int i31 = 0;
            long j3 = 0;
            while (i31 < childCount2) {
                C0627l c0627l4 = (C0627l) getChildAt(i31).getLayoutParams();
                boolean z15 = z14;
                if (c0627l4.f8680d) {
                    int i32 = c0627l4.f8678b;
                    if (i32 < i29) {
                        j3 = 1 << i31;
                        i29 = i32;
                        i30 = 1;
                    } else if (i32 == i29) {
                        j3 |= 1 << i31;
                        i30++;
                    }
                }
                i31++;
                z14 = z15;
            }
            z4 = z14;
            j |= j3;
            if (i30 > i16) {
                break;
            }
            int i33 = i29 + 1;
            int i34 = 0;
            while (i34 < childCount2) {
                View childAt2 = getChildAt(i34);
                C0627l c0627l5 = (C0627l) childAt2.getLayoutParams();
                int i35 = iMax;
                int i36 = childMeasureSpec;
                int i37 = childCount2;
                long j7 = 1 << i34;
                if ((j3 & j7) != 0) {
                    if (z13 && c0627l5.f8681e) {
                        r7 = 1;
                        r7 = 1;
                        if (i16 == 1) {
                            childAt2.setPadding(i9 + i18, 0, i9, 0);
                        }
                    } else {
                        r7 = 1;
                    }
                    c0627l5.f8678b += r7;
                    c0627l5.f8682f = r7;
                    i16--;
                } else if (c0627l5.f8678b == i33) {
                    j |= j7;
                }
                i34++;
                childMeasureSpec = i36;
                iMax = i35;
                childCount2 = i37;
            }
            z14 = true;
        }
        int i38 = iMax;
        int i39 = childMeasureSpec;
        int i40 = childCount2;
        boolean z16 = !z10 && i19 == 1;
        if (i16 <= 0 || j == 0 || (i16 >= i19 - 1 && !z16 && iMax2 <= 1)) {
            i10 = i40;
            z7 = z4;
        } else {
            float fBitCount = Long.bitCount(j);
            if (!z16) {
                if ((j & 1) != 0 && !((C0627l) getChildAt(0).getLayoutParams()).f8681e) {
                    fBitCount -= 0.5f;
                }
                int i41 = i40 - 1;
                if ((j & ((long) (1 << i41))) != 0 && !((C0627l) getChildAt(i41).getLayoutParams()).f8681e) {
                    fBitCount -= 0.5f;
                }
            }
            int i42 = fBitCount > 0.0f ? (int) ((i16 * i18) / fBitCount) : 0;
            boolean z17 = z4;
            i10 = i40;
            for (int i43 = 0; i43 < i10; i43++) {
                if ((j & ((long) (1 << i43))) != 0) {
                    View childAt3 = getChildAt(i43);
                    C0627l c0627l6 = (C0627l) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c0627l6.f8679c = i42;
                        c0627l6.f8682f = true;
                        if (i43 == 0 && !c0627l6.f8681e) {
                            ((LinearLayout.LayoutParams) c0627l6).leftMargin = (-i42) / 2;
                        }
                        z17 = true;
                    } else if (c0627l6.f8677a) {
                        c0627l6.f8679c = i42;
                        c0627l6.f8682f = true;
                        ((LinearLayout.LayoutParams) c0627l6).rightMargin = (-i42) / 2;
                        z17 = true;
                    } else {
                        if (i43 != 0) {
                            ((LinearLayout.LayoutParams) c0627l6).leftMargin = i42 / 2;
                        }
                        if (i43 != i10 - 1) {
                            ((LinearLayout.LayoutParams) c0627l6).rightMargin = i42 / 2;
                        }
                    }
                }
            }
            z7 = z17;
        }
        if (z7) {
            int i44 = 0;
            while (i44 < i10) {
                View childAt4 = getChildAt(i44);
                C0627l c0627l7 = (C0627l) childAt4.getLayoutParams();
                if (c0627l7.f8682f) {
                    i11 = i39;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0627l7.f8678b * i18) + c0627l7.f8679c, 1073741824), i11);
                } else {
                    i11 = i39;
                }
                i44++;
                i39 = i11;
            }
        }
        setMeasuredDimension(i27, i26 != 1073741824 ? i38 : i28);
    }

    public void setExpandedActionViewsExclusive(boolean z4) {
        this.f8239K.f8644H = z4;
    }

    public void setOnMenuItemClickListener(InterfaceC0629m interfaceC0629m) {
        this.f8246R = interfaceC0629m;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C0623j c0623j = this.f8239K;
        C0621i c0621i = c0623j.f8659z;
        if (c0621i != null) {
            c0621i.setImageDrawable(drawable);
        } else {
            c0623j.f8638B = true;
            c0623j.f8637A = drawable;
        }
    }

    public void setOverflowReserved(boolean z4) {
        this.f8238J = z4;
    }

    public void setPopupTheme(int i7) {
        if (this.f8237I != i7) {
            this.f8237I = i7;
            if (i7 == 0) {
                this.f8236H = getContext();
            } else {
                this.f8236H = new ContextThemeWrapper(getContext(), i7);
            }
        }
    }

    public void setPresenter(C0623j c0623j) {
        this.f8239K = c0623j;
        c0623j.f8658y = this;
        this.f8235G = c0623j.f8653c;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0627l(getContext(), attributeSet);
    }
}
