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
import p000.C0455m2;
import p000.C0566p2;
import p000.C0603q2;
import p000.C0677s2;
import p000.InterfaceC0640r2;
import p000.InterfaceC0714t2;
import p000.an0;
import p000.ei0;
import p000.fi0;
import p000.go0;
import p000.nn0;
import p000.nu1;
import p000.o31;
import p000.on0;
import p000.rn0;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends fi0 implements nn0, go0 {

    /* JADX INFO: renamed from: A */
    public int f390A;

    /* JADX INFO: renamed from: B */
    public boolean f391B;

    /* JADX INFO: renamed from: C */
    public C0603q2 f392C;

    /* JADX INFO: renamed from: D */
    public an0 f393D;

    /* JADX INFO: renamed from: E */
    public boolean f394E;

    /* JADX INFO: renamed from: F */
    public int f395F;

    /* JADX INFO: renamed from: G */
    public final int f396G;

    /* JADX INFO: renamed from: H */
    public final int f397H;

    /* JADX INFO: renamed from: I */
    public InterfaceC0714t2 f398I;

    /* JADX INFO: renamed from: y */
    public on0 f399y;

    /* JADX INFO: renamed from: z */
    public Context f400z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f396G = (int) (56.0f * f);
        this.f397H = (int) (f * 4.0f);
        this.f400z = context;
        this.f390A = 0;
    }

    /* JADX INFO: renamed from: i */
    public static C0677s2 m357i() {
        C0677s2 c0677s2 = new C0677s2(-2, -2);
        c0677s2.f7009a = false;
        ((LinearLayout.LayoutParams) c0677s2).gravity = 16;
        return c0677s2;
    }

    /* JADX INFO: renamed from: j */
    public static C0677s2 m358j(ViewGroup.LayoutParams layoutParams) {
        C0677s2 c0677s2;
        if (layoutParams == null) {
            return m357i();
        }
        if (layoutParams instanceof C0677s2) {
            C0677s2 c0677s3 = (C0677s2) layoutParams;
            c0677s2 = new C0677s2(c0677s3);
            c0677s2.f7009a = c0677s3.f7009a;
        } else {
            c0677s2 = new C0677s2(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c0677s2).gravity <= 0) {
            ((LinearLayout.LayoutParams) c0677s2).gravity = 16;
        }
        return c0677s2;
    }

    @Override // p000.nn0
    /* JADX INFO: renamed from: a */
    public final boolean mo334a(rn0 rn0Var) {
        return this.f399y.m3713q(rn0Var, null, 0);
    }

    @Override // p000.go0
    /* JADX INFO: renamed from: b */
    public final void mo335b(on0 on0Var) {
        this.f399y = on0Var;
    }

    @Override // p000.fi0, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0677s2;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // p000.fi0
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ ei0 generateDefaultLayoutParams() {
        return m357i();
    }

    @Override // p000.fi0
    /* JADX INFO: renamed from: f */
    public final ei0 generateLayoutParams(AttributeSet attributeSet) {
        return new C0677s2(getContext(), attributeSet);
    }

    @Override // p000.fi0
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ ei0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m358j(layoutParams);
    }

    @Override // p000.fi0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m357i();
    }

    @Override // p000.fi0, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0677s2(getContext(), attributeSet);
    }

    public Menu getMenu() {
        if (this.f399y == null) {
            Context context = getContext();
            on0 on0Var = new on0(context);
            this.f399y = on0Var;
            on0Var.f5803n = new nu1(4, this);
            C0603q2 c0603q2 = new C0603q2(context);
            this.f392C = c0603q2;
            c0603q2.f6335u = true;
            c0603q2.f6336v = true;
            c0603q2.f6328n = new o31(10);
            this.f399y.m3706b(c0603q2, this.f400z);
            C0603q2 c0603q3 = this.f392C;
            c0603q3.f6331q = this;
            this.f399y = c0603q3.f6326l;
        }
        return this.f399y;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C0603q2 c0603q2 = this.f392C;
        C0566p2 c0566p2 = c0603q2.f6332r;
        if (c0566p2 != null) {
            return c0566p2.getDrawable();
        }
        if (c0603q2.f6334t) {
            return c0603q2.f6333s;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f390A;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m362k(int i) {
        boolean zMo330b = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC0640r2)) {
            zMo330b = ((InterfaceC0640r2) childAt).mo330b();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC0640r2)) ? zMo330b : ((InterfaceC0640r2) childAt2).mo331c() | zMo330b;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0603q2 c0603q2 = this.f392C;
        if (c0603q2 != null) {
            c0603q2.mo1485g();
            if (this.f392C.m4027i()) {
                this.f392C.m4026c();
                this.f392C.m4028l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0603q2 c0603q2 = this.f392C;
        if (c0603q2 != null) {
            c0603q2.m4026c();
            C0455m2 c0455m2 = c0603q2.f6320C;
            if (c0455m2 == null || !c0455m2.m5814b()) {
                return;
            }
            c0455m2.f9404i.dismiss();
        }
    }

    @Override // p000.fi0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int paddingLeft;
        if (!this.f394E) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i5 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i6 = i3 - i;
        int paddingRight = (i6 - getPaddingRight()) - getPaddingLeft();
        boolean z2 = getLayoutDirection() == 1;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                C0677s2 c0677s2 = (C0677s2) childAt.getLayoutParams();
                if (c0677s2.f7009a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m362k(i9)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z2) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) c0677s2).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c0677s2).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i10 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i10, width, measuredHeight + i10);
                    paddingRight -= measuredWidth;
                    i7 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0677s2).leftMargin) + ((LinearLayout.LayoutParams) c0677s2).rightMargin;
                    m362k(i9);
                    i8++;
                }
            }
        }
        if (childCount == 1 && i7 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i11 = (i6 / 2) - (measuredWidth2 / 2);
            int i12 = i5 - (measuredHeight2 / 2);
            childAt2.layout(i11, i12, measuredWidth2 + i11, measuredHeight2 + i12);
            return;
        }
        int i13 = i8 - (i7 ^ 1);
        int iMax = Math.max(0, i13 > 0 ? paddingRight / i13 : 0);
        if (z2) {
            int width2 = getWidth() - getPaddingRight();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt3 = getChildAt(i14);
                C0677s2 c0677s3 = (C0677s2) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0677s3.f7009a) {
                    int i15 = width2 - ((LinearLayout.LayoutParams) c0677s3).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i16 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i15 - measuredWidth3, i16, i15, measuredHeight3 + i16);
                    width2 = i15 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c0677s3).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt4 = getChildAt(i17);
            C0677s2 c0677s4 = (C0677s2) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0677s4.f7009a) {
                int i18 = paddingLeft2 + ((LinearLayout.LayoutParams) c0677s4).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i19 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i18, i19, i18 + measuredWidth4, measuredHeight4 + i19);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) c0677s4).rightMargin + iMax + i18;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // p000.fi0, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        ?? r11;
        int i5;
        int i6;
        on0 on0Var;
        boolean z = this.f394E;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f394E = z2;
        if (z != z2) {
            this.f395F = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f394E && (on0Var = this.f399y) != null && size != this.f395F) {
            this.f395F = size;
            on0Var.m3712p(true);
        }
        int childCount = getChildCount();
        if (!this.f394E || childCount <= 0) {
            for (int i7 = 0; i7 < childCount; i7++) {
                C0677s2 c0677s2 = (C0677s2) getChildAt(i7).getLayoutParams();
                ((LinearLayout.LayoutParams) c0677s2).rightMargin = 0;
                ((LinearLayout.LayoutParams) c0677s2).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i8 = size2 - paddingRight;
        int i9 = this.f396G;
        int i10 = i8 / i9;
        int i11 = i8 % i9;
        if (i10 == 0) {
            setMeasuredDimension(i8, 0);
            return;
        }
        int i12 = (i11 / i10) + i9;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i13 = 0;
        int iMax2 = 0;
        int i14 = 0;
        boolean z3 = false;
        int i15 = 0;
        long j = 0;
        while (true) {
            i3 = this.f397H;
            if (i14 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i14);
            int i16 = size3;
            int i17 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i5 = i12;
            } else {
                boolean z4 = childAt instanceof ActionMenuItemView;
                i13++;
                if (z4) {
                    childAt.setPadding(i3, 0, i3, 0);
                }
                C0677s2 c0677s3 = (C0677s2) childAt.getLayoutParams();
                c0677s3.f7014f = false;
                c0677s3.f7011c = 0;
                c0677s3.f7010b = 0;
                c0677s3.f7012d = false;
                ((LinearLayout.LayoutParams) c0677s3).leftMargin = 0;
                ((LinearLayout.LayoutParams) c0677s3).rightMargin = 0;
                c0677s3.f7013e = z4 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i18 = c0677s3.f7009a ? 1 : i10;
                C0677s2 c0677s4 = (C0677s2) childAt.getLayoutParams();
                int i19 = i10;
                i5 = i12;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i17, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z4 ? (ActionMenuItemView) childAt : null;
                boolean z5 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z6 = z5;
                if (i18 <= 0 || (z5 && i18 < 2)) {
                    i6 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i5 * i18, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i6 = measuredWidth / i5;
                    if (measuredWidth % i5 != 0) {
                        i6++;
                    }
                    if (z6 && i6 < 2) {
                        i6 = 2;
                    }
                }
                c0677s4.f7012d = !c0677s4.f7009a && z6;
                c0677s4.f7010b = i6;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i6 * i5, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i6);
                if (c0677s3.f7012d) {
                    i15++;
                }
                if (c0677s3.f7009a) {
                    z3 = true;
                }
                i10 = i19 - i6;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i6 == 1) {
                    j |= (long) (1 << i14);
                }
            }
            i14++;
            size3 = i16;
            paddingBottom = i17;
            i12 = i5;
        }
        int i20 = size3;
        int i21 = i10;
        int i22 = i12;
        boolean z7 = z3 && i13 == 2;
        int i23 = i21;
        boolean z8 = false;
        while (true) {
            if (i15 <= 0 || i23 <= 0) {
                i4 = iMax;
                break;
            }
            int i24 = Integer.MAX_VALUE;
            long j2 = 0;
            int i25 = 0;
            int i26 = 0;
            while (i26 < childCount2) {
                int i27 = iMax;
                C0677s2 c0677s5 = (C0677s2) getChildAt(i26).getLayoutParams();
                boolean z9 = z7;
                if (c0677s5.f7012d) {
                    int i28 = c0677s5.f7010b;
                    if (i28 < i24) {
                        j2 = 1 << i26;
                        i24 = i28;
                        i25 = 1;
                    } else if (i28 == i24) {
                        j2 |= 1 << i26;
                        i25++;
                    }
                }
                i26++;
                z7 = z9;
                iMax = i27;
            }
            i4 = iMax;
            boolean z10 = z7;
            j |= j2;
            if (i25 > i23) {
                break;
            }
            int i29 = i24 + 1;
            int i30 = 0;
            while (i30 < childCount2) {
                View childAt2 = getChildAt(i30);
                C0677s2 c0677s6 = (C0677s2) childAt2.getLayoutParams();
                boolean z11 = z3;
                long j3 = 1 << i30;
                if ((j2 & j3) != 0) {
                    if (z10 && c0677s6.f7013e) {
                        r11 = 1;
                        r11 = 1;
                        if (i23 == 1) {
                            childAt2.setPadding(i3 + i22, 0, i3, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    c0677s6.f7010b += r11;
                    c0677s6.f7014f = r11;
                    i23--;
                } else if (c0677s6.f7010b == i29) {
                    j |= j3;
                }
                i30++;
                z3 = z11;
            }
            z7 = z10;
            iMax = i4;
            z8 = true;
        }
        boolean z12 = !z3 && i13 == 1;
        if (i23 > 0 && j != 0 && (i23 < i13 - 1 || z12 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j);
            if (!z12) {
                if ((j & 1) != 0 && !((C0677s2) getChildAt(0).getLayoutParams()).f7013e) {
                    fBitCount -= 0.5f;
                }
                int i31 = childCount2 - 1;
                if ((j & ((long) (1 << i31))) != 0 && !((C0677s2) getChildAt(i31).getLayoutParams()).f7013e) {
                    fBitCount -= 0.5f;
                }
            }
            int i32 = fBitCount > 0.0f ? (int) ((i23 * i22) / fBitCount) : 0;
            boolean z13 = z8;
            for (int i33 = 0; i33 < childCount2; i33++) {
                if ((j & ((long) (1 << i33))) != 0) {
                    View childAt3 = getChildAt(i33);
                    C0677s2 c0677s7 = (C0677s2) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c0677s7.f7011c = i32;
                        c0677s7.f7014f = true;
                        if (i33 == 0 && !c0677s7.f7013e) {
                            ((LinearLayout.LayoutParams) c0677s7).leftMargin = (-i32) / 2;
                        }
                        z13 = true;
                    } else if (c0677s7.f7009a) {
                        c0677s7.f7011c = i32;
                        c0677s7.f7014f = true;
                        ((LinearLayout.LayoutParams) c0677s7).rightMargin = (-i32) / 2;
                        z13 = true;
                    } else {
                        if (i33 != 0) {
                            ((LinearLayout.LayoutParams) c0677s7).leftMargin = i32 / 2;
                        }
                        if (i33 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) c0677s7).rightMargin = i32 / 2;
                        }
                    }
                }
            }
            z8 = z13;
        }
        if (z8) {
            for (int i34 = 0; i34 < childCount2; i34++) {
                View childAt4 = getChildAt(i34);
                C0677s2 c0677s8 = (C0677s2) childAt4.getLayoutParams();
                if (c0677s8.f7014f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0677s8.f7010b * i22) + c0677s8.f7011c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i8, mode != 1073741824 ? i4 : i20);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f392C.f6340z = z;
    }

    public void setOnMenuItemClickListener(InterfaceC0714t2 interfaceC0714t2) {
        this.f398I = interfaceC0714t2;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C0603q2 c0603q2 = this.f392C;
        C0566p2 c0566p2 = c0603q2.f6332r;
        if (c0566p2 != null) {
            c0566p2.setImageDrawable(drawable);
        } else {
            c0603q2.f6334t = true;
            c0603q2.f6333s = drawable;
        }
    }

    public void setOverflowReserved(boolean z) {
        this.f391B = z;
    }

    public void setPopupTheme(int i) {
        if (this.f390A != i) {
            this.f390A = i;
            if (i == 0) {
                this.f400z = getContext();
            } else {
                this.f400z = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C0603q2 c0603q2) {
        this.f392C = c0603q2;
        c0603q2.f6331q = this;
        this.f399y = c0603q2.f6326l;
    }

    @Override // p000.fi0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m358j(layoutParams);
    }
}
