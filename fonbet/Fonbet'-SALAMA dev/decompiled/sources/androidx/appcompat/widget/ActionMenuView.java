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
import w1.C1718l0;

/* loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements m.j, m.z {

    /* renamed from: G, reason: collision with root package name */
    public m.k f8235G;

    /* renamed from: H, reason: collision with root package name */
    public Context f8236H;

    /* renamed from: I, reason: collision with root package name */
    public int f8237I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f8238J;

    /* renamed from: K, reason: collision with root package name */
    public C0644j f8239K;

    /* renamed from: L, reason: collision with root package name */
    public B3.g f8240L;

    /* renamed from: M, reason: collision with root package name */
    public m.i f8241M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f8242N;

    /* renamed from: O, reason: collision with root package name */
    public int f8243O;

    /* renamed from: P, reason: collision with root package name */
    public final int f8244P;

    /* renamed from: Q, reason: collision with root package name */
    public final int f8245Q;

    /* renamed from: R, reason: collision with root package name */
    public InterfaceC0650m f8246R;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f7 = context.getResources().getDisplayMetrics().density;
        this.f8244P = (int) (56.0f * f7);
        this.f8245Q = (int) (f7 * 4.0f);
        this.f8236H = context;
        this.f8237I = 0;
    }

    public static C0648l k() {
        C0648l c0648l = new C0648l(-2, -2);
        c0648l.f8677a = false;
        ((LinearLayout.LayoutParams) c0648l).gravity = 16;
        return c0648l;
    }

    public static C0648l l(ViewGroup.LayoutParams layoutParams) {
        C0648l c0648l;
        if (layoutParams == null) {
            return k();
        }
        if (layoutParams instanceof C0648l) {
            C0648l c0648l2 = (C0648l) layoutParams;
            c0648l = new C0648l(c0648l2);
            c0648l.f8677a = c0648l2.f8677a;
        } else {
            c0648l = new C0648l(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c0648l).gravity <= 0) {
            ((LinearLayout.LayoutParams) c0648l).gravity = 16;
        }
        return c0648l;
    }

    @Override // m.z
    public final void a(m.k kVar) {
        this.f8235G = kVar;
    }

    @Override // m.j
    public final boolean b(m.m mVar) {
        return this.f8235G.q(mVar, null, 0);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0648l;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ C0657p0 generateDefaultLayoutParams() {
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
            m.k kVar = new m.k(context);
            this.f8235G = kVar;
            kVar.f15142e = new A1.x0(this, 12);
            C0644j c0644j = new C0644j(context);
            this.f8239K = c0644j;
            c0644j.f8639C = true;
            c0644j.f8640D = true;
            m.w wVar = this.f8240L;
            if (wVar == null) {
                wVar = new C1718l0(14);
            }
            c0644j.f8655e = wVar;
            this.f8235G.b(c0644j, this.f8236H);
            C0644j c0644j2 = this.f8239K;
            c0644j2.f8658y = this;
            this.f8235G = c0644j2.f8653c;
        }
        return this.f8235G;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C0644j c0644j = this.f8239K;
        C0642i c0642i = c0644j.f8659z;
        if (c0642i != null) {
            return c0642i.getDrawable();
        }
        if (c0644j.f8638B) {
            return c0644j.f8637A;
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
    /* renamed from: h */
    public final C0657p0 generateLayoutParams(AttributeSet attributeSet) {
        return new C0648l(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ C0657p0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return l(layoutParams);
    }

    public final boolean m(int i7) {
        boolean z4 = false;
        if (i7 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i7 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i7);
        if (i7 < getChildCount() && (childAt instanceof InterfaceC0646k)) {
            z4 = ((InterfaceC0646k) childAt).b();
        }
        return (i7 <= 0 || !(childAt2 instanceof InterfaceC0646k)) ? z4 : z4 | ((InterfaceC0646k) childAt2).c();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0644j c0644j = this.f8239K;
        if (c0644j != null) {
            c0644j.f();
            if (this.f8239K.k()) {
                this.f8239K.h();
                this.f8239K.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0644j c0644j = this.f8239K;
        if (c0644j != null) {
            c0644j.h();
            C0634e c0634e = c0644j.f8647K;
            if (c0634e == null || !c0634e.b()) {
                return;
            }
            c0634e.f15199i.dismiss();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i7, int i8, int i9, int i10) {
        int width;
        int i11;
        if (!this.f8242N) {
            super.onLayout(z4, i7, i8, i9, i10);
            return;
        }
        int childCount = getChildCount();
        int i12 = (i10 - i8) / 2;
        int dividerWidth = getDividerWidth();
        int i13 = i9 - i7;
        int paddingRight = (i13 - getPaddingRight()) - getPaddingLeft();
        boolean a2 = q1.a(this);
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                C0648l c0648l = (C0648l) childAt.getLayoutParams();
                if (c0648l.f8677a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m(i16)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a2) {
                        i11 = getPaddingLeft() + ((LinearLayout.LayoutParams) c0648l).leftMargin;
                        width = i11 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c0648l).rightMargin;
                        i11 = width - measuredWidth;
                    }
                    int i17 = i12 - (measuredHeight / 2);
                    childAt.layout(i11, i17, width, measuredHeight + i17);
                    paddingRight -= measuredWidth;
                    i14 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0648l).leftMargin) + ((LinearLayout.LayoutParams) c0648l).rightMargin;
                    m(i16);
                    i15++;
                }
            }
        }
        if (childCount == 1 && i14 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i18 = (i13 / 2) - (measuredWidth2 / 2);
            int i19 = i12 - (measuredHeight2 / 2);
            childAt2.layout(i18, i19, measuredWidth2 + i18, measuredHeight2 + i19);
            return;
        }
        int i20 = i15 - (i14 ^ 1);
        int max = Math.max(0, i20 > 0 ? paddingRight / i20 : 0);
        if (a2) {
            int width2 = getWidth() - getPaddingRight();
            for (int i21 = 0; i21 < childCount; i21++) {
                View childAt3 = getChildAt(i21);
                C0648l c0648l2 = (C0648l) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0648l2.f8677a) {
                    int i22 = width2 - ((LinearLayout.LayoutParams) c0648l2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i23 = i12 - (measuredHeight3 / 2);
                    childAt3.layout(i22 - measuredWidth3, i23, i22, measuredHeight3 + i23);
                    width2 = i22 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c0648l2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i24 = 0; i24 < childCount; i24++) {
            View childAt4 = getChildAt(i24);
            C0648l c0648l3 = (C0648l) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0648l3.f8677a) {
                int i25 = paddingLeft + ((LinearLayout.LayoutParams) c0648l3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i26 = i12 - (measuredHeight4 / 2);
                childAt4.layout(i25, i26, i25 + measuredWidth4, measuredHeight4 + i26);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) c0648l3).rightMargin + max + i25;
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
        int i12;
        int i13;
        ?? r42;
        int i14;
        int i15;
        int i16;
        m.k kVar;
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
            for (int i17 = 0; i17 < childCount; i17++) {
                C0648l c0648l = (C0648l) getChildAt(i17).getLayoutParams();
                ((LinearLayout.LayoutParams) c0648l).rightMargin = 0;
                ((LinearLayout.LayoutParams) c0648l).leftMargin = 0;
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
        int i18 = size2 - paddingRight;
        int i19 = this.f8244P;
        int i20 = i18 / i19;
        int i21 = i18 % i19;
        if (i20 == 0) {
            setMeasuredDimension(i18, 0);
            return;
        }
        int i22 = (i21 / i20) + i19;
        int childCount2 = getChildCount();
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        boolean z10 = false;
        int i27 = 0;
        long j = 0;
        while (true) {
            i9 = this.f8245Q;
            if (i26 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i26);
            int i28 = size3;
            int i29 = i18;
            if (childAt.getVisibility() == 8) {
                i14 = mode;
                i15 = paddingBottom;
            } else {
                boolean z11 = childAt instanceof ActionMenuItemView;
                int i30 = i24 + 1;
                if (z11) {
                    childAt.setPadding(i9, 0, i9, 0);
                }
                C0648l c0648l2 = (C0648l) childAt.getLayoutParams();
                c0648l2.f8682f = false;
                c0648l2.f8679c = 0;
                c0648l2.f8678b = 0;
                c0648l2.f8680d = false;
                ((LinearLayout.LayoutParams) c0648l2).leftMargin = 0;
                ((LinearLayout.LayoutParams) c0648l2).rightMargin = 0;
                c0648l2.f8681e = z11 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i31 = c0648l2.f8677a ? 1 : i20;
                C0648l c0648l3 = (C0648l) childAt.getLayoutParams();
                i14 = mode;
                i15 = paddingBottom;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z11 ? (ActionMenuItemView) childAt : null;
                boolean z12 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                if (i31 <= 0 || (z12 && i31 < 2)) {
                    i16 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i31 * i22, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i16 = measuredWidth / i22;
                    if (measuredWidth % i22 != 0) {
                        i16++;
                    }
                    if (z12 && i16 < 2) {
                        i16 = 2;
                    }
                }
                c0648l3.f8680d = !c0648l3.f8677a && z12;
                c0648l3.f8678b = i16;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i16 * i22, 1073741824), makeMeasureSpec);
                i25 = Math.max(i25, i16);
                if (c0648l2.f8680d) {
                    i27++;
                }
                if (c0648l2.f8677a) {
                    z10 = true;
                }
                i20 -= i16;
                i23 = Math.max(i23, childAt.getMeasuredHeight());
                if (i16 == 1) {
                    j |= 1 << i26;
                }
                i24 = i30;
            }
            i26++;
            size3 = i28;
            i18 = i29;
            paddingBottom = i15;
            mode = i14;
        }
        int i32 = mode;
        int i33 = i18;
        int i34 = size3;
        boolean z13 = z10 && i24 == 2;
        boolean z14 = false;
        while (i27 > 0 && i20 > 0) {
            int i35 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            int i36 = 0;
            int i37 = 0;
            long j3 = 0;
            while (i37 < childCount2) {
                C0648l c0648l4 = (C0648l) getChildAt(i37).getLayoutParams();
                boolean z15 = z14;
                if (c0648l4.f8680d) {
                    int i38 = c0648l4.f8678b;
                    if (i38 < i35) {
                        j3 = 1 << i37;
                        i35 = i38;
                        i36 = 1;
                    } else if (i38 == i35) {
                        j3 |= 1 << i37;
                        i36++;
                    }
                }
                i37++;
                z14 = z15;
            }
            z4 = z14;
            j |= j3;
            if (i36 > i20) {
                break;
            }
            int i39 = i35 + 1;
            int i40 = 0;
            while (i40 < childCount2) {
                View childAt2 = getChildAt(i40);
                C0648l c0648l5 = (C0648l) childAt2.getLayoutParams();
                int i41 = i23;
                int i42 = childMeasureSpec;
                int i43 = childCount2;
                long j7 = 1 << i40;
                if ((j3 & j7) != 0) {
                    if (z13 && c0648l5.f8681e) {
                        r42 = 1;
                        r42 = 1;
                        if (i20 == 1) {
                            childAt2.setPadding(i9 + i22, 0, i9, 0);
                        }
                    } else {
                        r42 = 1;
                    }
                    c0648l5.f8678b += r42;
                    c0648l5.f8682f = r42;
                    i20--;
                } else if (c0648l5.f8678b == i39) {
                    j |= j7;
                }
                i40++;
                childMeasureSpec = i42;
                i23 = i41;
                childCount2 = i43;
            }
            z14 = true;
        }
        z4 = z14;
        int i44 = i23;
        int i45 = childMeasureSpec;
        int i46 = childCount2;
        boolean z16 = !z10 && i24 == 1;
        if (i20 <= 0 || j == 0 || (i20 >= i24 - 1 && !z16 && i25 <= 1)) {
            i10 = i46;
            z7 = z4;
        } else {
            float bitCount = Long.bitCount(j);
            if (!z16) {
                if ((j & 1) != 0 && !((C0648l) getChildAt(0).getLayoutParams()).f8681e) {
                    bitCount -= 0.5f;
                }
                int i47 = i46 - 1;
                if ((j & (1 << i47)) != 0 && !((C0648l) getChildAt(i47).getLayoutParams()).f8681e) {
                    bitCount -= 0.5f;
                }
            }
            int i48 = bitCount > 0.0f ? (int) ((i20 * i22) / bitCount) : 0;
            boolean z17 = z4;
            i10 = i46;
            for (int i49 = 0; i49 < i10; i49++) {
                if ((j & (1 << i49)) != 0) {
                    View childAt3 = getChildAt(i49);
                    C0648l c0648l6 = (C0648l) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c0648l6.f8679c = i48;
                        c0648l6.f8682f = true;
                        if (i49 == 0 && !c0648l6.f8681e) {
                            ((LinearLayout.LayoutParams) c0648l6).leftMargin = (-i48) / 2;
                        }
                        z17 = true;
                    } else {
                        if (c0648l6.f8677a) {
                            c0648l6.f8679c = i48;
                            c0648l6.f8682f = true;
                            ((LinearLayout.LayoutParams) c0648l6).rightMargin = (-i48) / 2;
                            z17 = true;
                        } else {
                            if (i49 != 0) {
                                ((LinearLayout.LayoutParams) c0648l6).leftMargin = i48 / 2;
                            }
                            if (i49 != i10 - 1) {
                                ((LinearLayout.LayoutParams) c0648l6).rightMargin = i48 / 2;
                            }
                        }
                    }
                }
            }
            z7 = z17;
        }
        if (z7) {
            int i50 = 0;
            while (i50 < i10) {
                View childAt4 = getChildAt(i50);
                C0648l c0648l7 = (C0648l) childAt4.getLayoutParams();
                if (c0648l7.f8682f) {
                    i13 = i45;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0648l7.f8678b * i22) + c0648l7.f8679c, 1073741824), i13);
                } else {
                    i13 = i45;
                }
                i50++;
                i45 = i13;
            }
        }
        if (i32 != 1073741824) {
            i12 = i33;
            i11 = i44;
        } else {
            i11 = i34;
            i12 = i33;
        }
        setMeasuredDimension(i12, i11);
    }

    public void setExpandedActionViewsExclusive(boolean z4) {
        this.f8239K.f8644H = z4;
    }

    public void setOnMenuItemClickListener(InterfaceC0650m interfaceC0650m) {
        this.f8246R = interfaceC0650m;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C0644j c0644j = this.f8239K;
        C0642i c0642i = c0644j.f8659z;
        if (c0642i != null) {
            c0642i.setImageDrawable(drawable);
        } else {
            c0644j.f8638B = true;
            c0644j.f8637A = drawable;
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

    public void setPresenter(C0644j c0644j) {
        this.f8239K = c0644j;
        c0644j.f8658y = this;
        this.f8235G = c0644j.f8653c;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0648l(getContext(), attributeSet);
    }
}
