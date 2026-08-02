package n;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import h.AbstractC1986a;

/* loaded from: classes.dex */
public abstract class X extends ViewGroup {

    /* renamed from: k, reason: collision with root package name */
    public boolean f18196k;

    /* renamed from: l, reason: collision with root package name */
    public int f18197l;

    /* renamed from: m, reason: collision with root package name */
    public int f18198m;

    /* renamed from: n, reason: collision with root package name */
    public int f18199n;

    /* renamed from: o, reason: collision with root package name */
    public int f18200o;

    /* renamed from: p, reason: collision with root package name */
    public int f18201p;

    /* renamed from: q, reason: collision with root package name */
    public float f18202q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f18203r;

    /* renamed from: s, reason: collision with root package name */
    public int[] f18204s;

    /* renamed from: t, reason: collision with root package name */
    public int[] f18205t;

    /* renamed from: u, reason: collision with root package name */
    public Drawable f18206u;

    /* renamed from: v, reason: collision with root package name */
    public int f18207v;

    /* renamed from: w, reason: collision with root package name */
    public int f18208w;

    /* renamed from: x, reason: collision with root package name */
    public int f18209x;

    /* renamed from: y, reason: collision with root package name */
    public int f18210y;

    public X(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f18196k = true;
        this.f18197l = -1;
        this.f18198m = 0;
        this.f18200o = 8388659;
        int[] iArr = AbstractC1986a.f17176j;
        v3.e G5 = v3.e.G(context, attributeSet, iArr, 0);
        n1.C.c(this, context, iArr, attributeSet, (TypedArray) G5.f20433m, 0);
        TypedArray typedArray = (TypedArray) G5.f20433m;
        int i = typedArray.getInt(1, -1);
        if (i >= 0) {
            setOrientation(i);
        }
        int i5 = typedArray.getInt(0, -1);
        if (i5 >= 0) {
            setGravity(i5);
        }
        boolean z3 = typedArray.getBoolean(2, true);
        if (!z3) {
            setBaselineAligned(z3);
        }
        this.f18202q = typedArray.getFloat(4, -1.0f);
        this.f18197l = typedArray.getInt(3, -1);
        this.f18203r = typedArray.getBoolean(7, false);
        setDividerDrawable(G5.x(5));
        this.f18209x = typedArray.getInt(8, 0);
        this.f18210y = typedArray.getDimensionPixelSize(6, 0);
        G5.J();
    }

    public final void b(Canvas canvas, int i) {
        this.f18206u.setBounds(getPaddingLeft() + this.f18210y, i, (getWidth() - getPaddingRight()) - this.f18210y, this.f18208w + i);
        this.f18206u.draw(canvas);
    }

    public final void c(Canvas canvas, int i) {
        this.f18206u.setBounds(i, getPaddingTop() + this.f18210y, this.f18207v + i, (getHeight() - getPaddingBottom()) - this.f18210y);
        this.f18206u.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof W;
    }

    @Override // android.view.ViewGroup
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public W generateDefaultLayoutParams() {
        int i = this.f18199n;
        if (i == 0) {
            return new W(-2, -2);
        }
        if (i == 1) {
            return new W(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public W generateLayoutParams(AttributeSet attributeSet) {
        return new W(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public W generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof W ? new W((W) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new W((ViewGroup.MarginLayoutParams) layoutParams) : new W(layoutParams);
    }

    public final boolean g(int i) {
        if (i == 0) {
            return (this.f18209x & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.f18209x & 4) != 0;
        }
        if ((this.f18209x & 2) != 0) {
            for (int i5 = i - 1; i5 >= 0; i5--) {
                if (getChildAt(i5).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.f18197l < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i5 = this.f18197l;
        if (childCount <= i5) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i5);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f18197l == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i6 = this.f18198m;
        if (this.f18199n == 1 && (i = this.f18200o & 112) != 48) {
            if (i == 16) {
                i6 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f18201p) / 2;
            } else if (i == 80) {
                i6 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f18201p;
            }
        }
        return i6 + ((LinearLayout.LayoutParams) ((W) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f18197l;
    }

    public Drawable getDividerDrawable() {
        return this.f18206u;
    }

    public int getDividerPadding() {
        return this.f18210y;
    }

    public int getDividerWidth() {
        return this.f18207v;
    }

    public int getGravity() {
        return this.f18200o;
    }

    public int getOrientation() {
        return this.f18199n;
    }

    public int getShowDividers() {
        return this.f18209x;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f18202q;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        if (this.f18206u == null) {
            return;
        }
        int i5 = 0;
        if (this.f18199n == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i5 < virtualChildCount) {
                View childAt = getChildAt(i5);
                if (childAt != null && childAt.getVisibility() != 8 && g(i5)) {
                    b(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((W) childAt.getLayoutParams())).topMargin) - this.f18208w);
                }
                i5++;
            }
            if (g(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                b(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f18208w : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((W) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z3 = I0.f18161a;
        boolean z5 = getLayoutDirection() == 1;
        while (i5 < virtualChildCount2) {
            View childAt3 = getChildAt(i5);
            if (childAt3 != null && childAt3.getVisibility() != 8 && g(i5)) {
                W w5 = (W) childAt3.getLayoutParams();
                c(canvas, z5 ? childAt3.getRight() + ((LinearLayout.LayoutParams) w5).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) w5).leftMargin) - this.f18207v);
            }
            i5++;
        }
        if (g(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                W w6 = (W) childAt4.getLayoutParams();
                if (z5) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) w6).leftMargin;
                    i = this.f18207v;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) w6).rightMargin;
                }
            } else if (z5) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.f18207v;
                right = left - i;
            }
            c(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0190  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z3, int i, int i5, int i6, int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        char c5;
        int i17;
        int i18;
        int i19;
        int i20 = 8;
        char c6 = 2;
        if (this.f18199n == 1) {
            int paddingLeft = getPaddingLeft();
            int i21 = i6 - i;
            int paddingRight = i21 - getPaddingRight();
            int paddingRight2 = (i21 - paddingLeft) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i22 = this.f18200o;
            int i23 = i22 & 112;
            int i24 = 8388615 & i22;
            int paddingTop = i23 != 16 ? i23 != 80 ? getPaddingTop() : ((getPaddingTop() + i7) - i5) - this.f18201p : getPaddingTop() + (((i7 - i5) - this.f18201p) / 2);
            int i25 = 0;
            while (i25 < virtualChildCount) {
                View childAt = getChildAt(i25);
                if (childAt == null || childAt.getVisibility() == i20) {
                    c5 = c6;
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    W w5 = (W) childAt.getLayoutParams();
                    c5 = c6;
                    int i26 = ((LinearLayout.LayoutParams) w5).gravity;
                    if (i26 < 0) {
                        i26 = i24;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i26, getLayoutDirection()) & 7;
                    if (absoluteGravity == 1) {
                        i17 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) w5).leftMargin;
                        i18 = ((LinearLayout.LayoutParams) w5).rightMargin;
                    } else if (absoluteGravity != 5) {
                        i19 = ((LinearLayout.LayoutParams) w5).leftMargin + paddingLeft;
                        if (g(i25)) {
                            paddingTop += this.f18208w;
                        }
                        int i27 = paddingTop + ((LinearLayout.LayoutParams) w5).topMargin;
                        childAt.layout(i19, i27, measuredWidth + i19, i27 + measuredHeight);
                        paddingTop = measuredHeight + ((LinearLayout.LayoutParams) w5).bottomMargin + i27;
                    } else {
                        i17 = paddingRight - measuredWidth;
                        i18 = ((LinearLayout.LayoutParams) w5).rightMargin;
                    }
                    i19 = i17 - i18;
                    if (g(i25)) {
                    }
                    int i272 = paddingTop + ((LinearLayout.LayoutParams) w5).topMargin;
                    childAt.layout(i19, i272, measuredWidth + i19, i272 + measuredHeight);
                    paddingTop = measuredHeight + ((LinearLayout.LayoutParams) w5).bottomMargin + i272;
                }
                i25++;
                c6 = c5;
                i20 = 8;
            }
            return;
        }
        boolean z5 = I0.f18161a;
        boolean z6 = getLayoutDirection() == 1;
        int paddingTop2 = getPaddingTop();
        int i28 = i7 - i5;
        int paddingBottom = i28 - getPaddingBottom();
        int paddingBottom2 = (i28 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i29 = this.f18200o;
        int i30 = 8388615 & i29;
        int i31 = i29 & 112;
        boolean z7 = this.f18196k;
        int[] iArr = this.f18204s;
        int[] iArr2 = this.f18205t;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i30, getLayoutDirection());
        int paddingLeft2 = absoluteGravity2 != 1 ? absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i6) - i) - this.f18201p : getPaddingLeft() + (((i6 - i) - this.f18201p) / 2);
        if (z6) {
            i9 = virtualChildCount2 - 1;
            i8 = -1;
        } else {
            i8 = 1;
            i9 = 0;
        }
        int i32 = 0;
        while (i32 < virtualChildCount2) {
            int i33 = (i8 * i32) + i9;
            View childAt2 = getChildAt(i33);
            if (childAt2 == null) {
                i10 = i9;
            } else {
                i10 = i9;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight2 = childAt2.getMeasuredHeight();
                    W w6 = (W) childAt2.getLayoutParams();
                    int i34 = paddingLeft2;
                    if (z7) {
                        i11 = paddingTop2;
                        if (((LinearLayout.LayoutParams) w6).height != -1) {
                            i12 = childAt2.getBaseline();
                            i13 = ((LinearLayout.LayoutParams) w6).gravity;
                            if (i13 < 0) {
                                i13 = i31;
                            }
                            i14 = i13 & 112;
                            if (i14 == 16) {
                                if (i14 == 48) {
                                    i15 = i11 + ((LinearLayout.LayoutParams) w6).topMargin;
                                    if (i12 != -1) {
                                        i15 = (iArr[1] - i12) + i15;
                                    }
                                } else if (i14 != 80) {
                                    i15 = i11;
                                } else {
                                    i15 = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) w6).bottomMargin;
                                    if (i12 != -1) {
                                        i16 = iArr2[2] - (childAt2.getMeasuredHeight() - i12);
                                    }
                                }
                                int i35 = (g(i33) ? i34 + this.f18207v : i34) + ((LinearLayout.LayoutParams) w6).leftMargin;
                                childAt2.layout(i35, i15, i35 + measuredWidth2, i15 + measuredHeight2);
                                paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) w6).rightMargin + i35;
                                i32++;
                                i9 = i10;
                                paddingTop2 = i11;
                            } else {
                                i15 = ((paddingBottom2 - measuredHeight2) / 2) + i11 + ((LinearLayout.LayoutParams) w6).topMargin;
                                i16 = ((LinearLayout.LayoutParams) w6).bottomMargin;
                            }
                            i15 -= i16;
                            int i352 = (g(i33) ? i34 + this.f18207v : i34) + ((LinearLayout.LayoutParams) w6).leftMargin;
                            childAt2.layout(i352, i15, i352 + measuredWidth2, i15 + measuredHeight2);
                            paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) w6).rightMargin + i352;
                            i32++;
                            i9 = i10;
                            paddingTop2 = i11;
                        }
                    } else {
                        i11 = paddingTop2;
                    }
                    i12 = -1;
                    i13 = ((LinearLayout.LayoutParams) w6).gravity;
                    if (i13 < 0) {
                    }
                    i14 = i13 & 112;
                    if (i14 == 16) {
                    }
                    i15 -= i16;
                    int i3522 = (g(i33) ? i34 + this.f18207v : i34) + ((LinearLayout.LayoutParams) w6).leftMargin;
                    childAt2.layout(i3522, i15, i3522 + measuredWidth2, i15 + measuredHeight2);
                    paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) w6).rightMargin + i3522;
                    i32++;
                    i9 = i10;
                    paddingTop2 = i11;
                }
            }
            i11 = paddingTop2;
            i32++;
            i9 = i10;
            paddingTop2 = i11;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:222:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0148  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z3;
        int baseline;
        int i12;
        int i13;
        int[] iArr;
        int i14;
        int i15;
        boolean z5;
        boolean z6;
        W w5;
        int i16;
        int[] iArr2;
        int i17;
        View view;
        int i18;
        boolean z7;
        boolean z8;
        int max;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        boolean z9;
        int i27;
        int i28;
        int i29;
        View view2;
        boolean z10;
        boolean z11;
        X x5 = this;
        int i30 = -2;
        int i31 = 1073741824;
        int i32 = 8;
        int i33 = 0;
        if (x5.f18199n == 1) {
            x5.f18201p = 0;
            int virtualChildCount = x5.getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i5);
            int i34 = x5.f18197l;
            boolean z12 = x5.f18203r;
            int i35 = 0;
            int i36 = 0;
            int i37 = 0;
            boolean z13 = false;
            int i38 = 0;
            boolean z14 = false;
            boolean z15 = true;
            float f = 0.0f;
            int i39 = 0;
            while (i35 < virtualChildCount) {
                int i40 = mode;
                View childAt = x5.getChildAt(i35);
                if (childAt == null) {
                    x5.f18201p = x5.f18201p;
                } else if (childAt.getVisibility() != i32) {
                    if (x5.g(i35)) {
                        x5.f18201p += x5.f18208w;
                    }
                    W w6 = (W) childAt.getLayoutParams();
                    float f5 = ((LinearLayout.LayoutParams) w6).weight;
                    f += f5;
                    if (mode2 == i31 && ((LinearLayout.LayoutParams) w6).height == 0 && f5 > 0.0f) {
                        int i41 = x5.f18201p;
                        x5.f18201p = Math.max(i41, ((LinearLayout.LayoutParams) w6).topMargin + i41 + ((LinearLayout.LayoutParams) w6).bottomMargin);
                        view2 = childAt;
                        i26 = mode2;
                        i27 = i34;
                        z9 = z12;
                        i28 = i35;
                        z13 = true;
                        i29 = i40;
                    } else {
                        if (((LinearLayout.LayoutParams) w6).height != 0 || f5 <= 0.0f) {
                            i23 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) w6).height = i30;
                            i23 = 0;
                        }
                        if (f == 0.0f) {
                            i24 = i35;
                            i25 = x5.f18201p;
                        } else {
                            i24 = i35;
                            i25 = 0;
                        }
                        i26 = mode2;
                        z9 = z12;
                        i27 = i34;
                        i28 = i24;
                        i29 = i40;
                        x5.measureChildWithMargins(childAt, i, 0, i5, i25);
                        if (i23 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) w6).height = i23;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i42 = x5.f18201p;
                        view2 = childAt;
                        x5.f18201p = Math.max(i42, i42 + measuredHeight + ((LinearLayout.LayoutParams) w6).topMargin + ((LinearLayout.LayoutParams) w6).bottomMargin);
                        if (z9) {
                            i39 = Math.max(measuredHeight, i39);
                        }
                    }
                    if (i27 >= 0 && i27 == i28 + 1) {
                        x5.f18198m = x5.f18201p;
                    }
                    if (i28 < i27 && ((LinearLayout.LayoutParams) w6).weight > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    if (i29 == 1073741824 || ((LinearLayout.LayoutParams) w6).width != -1) {
                        z10 = false;
                    } else {
                        z10 = true;
                        z14 = true;
                    }
                    int i43 = ((LinearLayout.LayoutParams) w6).leftMargin + ((LinearLayout.LayoutParams) w6).rightMargin;
                    int measuredWidth = view2.getMeasuredWidth() + i43;
                    int max2 = Math.max(i33, measuredWidth);
                    int measuredState = view2.getMeasuredState();
                    boolean z16 = z10;
                    int combineMeasuredStates = View.combineMeasuredStates(i38, measuredState);
                    if (z15) {
                        i38 = combineMeasuredStates;
                        if (((LinearLayout.LayoutParams) w6).width == -1) {
                            z11 = true;
                            if (((LinearLayout.LayoutParams) w6).weight <= 0.0f) {
                                if (!z16) {
                                    i43 = measuredWidth;
                                }
                                i37 = Math.max(i37, i43);
                            } else {
                                if (!z16) {
                                    i43 = measuredWidth;
                                }
                                i36 = Math.max(i36, i43);
                            }
                            z15 = z11;
                            i33 = max2;
                            i35 = i28 + 1;
                            i34 = i27;
                            mode = i29;
                            z12 = z9;
                            mode2 = i26;
                            i30 = -2;
                            i31 = 1073741824;
                            i32 = 8;
                        }
                    } else {
                        i38 = combineMeasuredStates;
                    }
                    z11 = false;
                    if (((LinearLayout.LayoutParams) w6).weight <= 0.0f) {
                    }
                    z15 = z11;
                    i33 = max2;
                    i35 = i28 + 1;
                    i34 = i27;
                    mode = i29;
                    z12 = z9;
                    mode2 = i26;
                    i30 = -2;
                    i31 = 1073741824;
                    i32 = 8;
                }
                i26 = mode2;
                i27 = i34;
                z9 = z12;
                i28 = i35;
                i29 = i40;
                i35 = i28 + 1;
                i34 = i27;
                mode = i29;
                z12 = z9;
                mode2 = i26;
                i30 = -2;
                i31 = 1073741824;
                i32 = 8;
            }
            int i44 = mode;
            int i45 = mode2;
            boolean z17 = z12;
            int i46 = i38;
            int i47 = i5;
            if (x5.f18201p > 0 && x5.g(virtualChildCount)) {
                x5.f18201p += x5.f18208w;
            }
            if (z17 && (i45 == Integer.MIN_VALUE || i45 == 0)) {
                x5.f18201p = 0;
                for (int i48 = 0; i48 < virtualChildCount; i48++) {
                    View childAt2 = x5.getChildAt(i48);
                    if (childAt2 == null) {
                        x5.f18201p = x5.f18201p;
                    } else if (childAt2.getVisibility() != 8) {
                        W w7 = (W) childAt2.getLayoutParams();
                        int i49 = x5.f18201p;
                        x5.f18201p = Math.max(i49, i49 + i39 + ((LinearLayout.LayoutParams) w7).topMargin + ((LinearLayout.LayoutParams) w7).bottomMargin);
                    }
                }
            }
            int paddingBottom = x5.getPaddingBottom() + x5.getPaddingTop() + x5.f18201p;
            x5.f18201p = paddingBottom;
            int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, x5.getSuggestedMinimumHeight()), i47, 0);
            int i50 = (resolveSizeAndState & 16777215) - x5.f18201p;
            if (z13 || (i50 != 0 && f > 0.0f)) {
                float f6 = x5.f18202q;
                if (f6 > 0.0f) {
                    f = f6;
                }
                x5.f18201p = 0;
                int i51 = i46;
                int i52 = 0;
                while (i52 < virtualChildCount) {
                    View childAt3 = x5.getChildAt(i52);
                    if (childAt3.getVisibility() == 8) {
                        i20 = i52;
                    } else {
                        W w8 = (W) childAt3.getLayoutParams();
                        float f7 = ((LinearLayout.LayoutParams) w8).weight;
                        if (f7 > 0.0f) {
                            int i53 = (int) ((i50 * f7) / f);
                            f -= f7;
                            i50 -= i53;
                            i20 = i52;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, x5.getPaddingRight() + x5.getPaddingLeft() + ((LinearLayout.LayoutParams) w8).leftMargin + ((LinearLayout.LayoutParams) w8).rightMargin, ((LinearLayout.LayoutParams) w8).width);
                            if (((LinearLayout.LayoutParams) w8).height == 0) {
                                i22 = 1073741824;
                                if (i45 == 1073741824) {
                                    if (i53 <= 0) {
                                        i53 = 0;
                                    }
                                    childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i53, 1073741824));
                                    i51 = View.combineMeasuredStates(i51, childAt3.getMeasuredState() & (-256));
                                }
                            } else {
                                i22 = 1073741824;
                            }
                            int measuredHeight2 = childAt3.getMeasuredHeight() + i53;
                            if (measuredHeight2 < 0) {
                                measuredHeight2 = 0;
                            }
                            childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, i22));
                            i51 = View.combineMeasuredStates(i51, childAt3.getMeasuredState() & (-256));
                        } else {
                            i20 = i52;
                        }
                        int i54 = ((LinearLayout.LayoutParams) w8).leftMargin + ((LinearLayout.LayoutParams) w8).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i54;
                        i33 = Math.max(i33, measuredWidth2);
                        if (i44 != 1073741824) {
                            i21 = -1;
                            if (((LinearLayout.LayoutParams) w8).width == -1) {
                                measuredWidth2 = i54;
                            }
                        } else {
                            i21 = -1;
                        }
                        i36 = Math.max(i36, measuredWidth2);
                        boolean z18 = z15 && ((LinearLayout.LayoutParams) w8).width == i21;
                        int i55 = x5.f18201p;
                        x5.f18201p = Math.max(i55, childAt3.getMeasuredHeight() + i55 + ((LinearLayout.LayoutParams) w8).topMargin + ((LinearLayout.LayoutParams) w8).bottomMargin);
                        z15 = z18;
                    }
                    i52 = i20 + 1;
                }
                x5.f18201p = x5.getPaddingBottom() + x5.getPaddingTop() + x5.f18201p;
                i46 = i51;
            } else {
                i36 = Math.max(i36, i37);
                if (z17 && i45 != 1073741824) {
                    for (int i56 = 0; i56 < virtualChildCount; i56++) {
                        View childAt4 = x5.getChildAt(i56);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((W) childAt4.getLayoutParams())).weight > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i39, 1073741824));
                        }
                    }
                }
            }
            if (z15 || i44 == 1073741824) {
                i36 = i33;
            }
            x5.setMeasuredDimension(View.resolveSizeAndState(Math.max(x5.getPaddingRight() + x5.getPaddingLeft() + i36, x5.getSuggestedMinimumWidth()), i, i46), resolveSizeAndState);
            if (z14) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(x5.getMeasuredWidth(), 1073741824);
                int i57 = 0;
                while (i57 < virtualChildCount) {
                    View childAt5 = x5.getChildAt(i57);
                    if (childAt5.getVisibility() != 8) {
                        W w9 = (W) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) w9).width == -1) {
                            int i58 = ((LinearLayout.LayoutParams) w9).height;
                            ((LinearLayout.LayoutParams) w9).height = childAt5.getMeasuredHeight();
                            x5.measureChildWithMargins(childAt5, makeMeasureSpec, 0, i47, 0);
                            ((LinearLayout.LayoutParams) w9).height = i58;
                        }
                    }
                    i57++;
                    i47 = i5;
                }
                return;
            }
            return;
        }
        int i59 = i;
        x5.f18201p = 0;
        int virtualChildCount2 = x5.getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i59);
        int mode4 = View.MeasureSpec.getMode(i5);
        if (x5.f18204s == null || x5.f18205t == null) {
            x5.f18204s = new int[4];
            x5.f18205t = new int[4];
        }
        int[] iArr3 = x5.f18204s;
        int[] iArr4 = x5.f18205t;
        iArr3[3] = -1;
        char c5 = 2;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z19 = x5.f18196k;
        boolean z20 = x5.f18203r;
        boolean z21 = mode3 == 1073741824;
        float f8 = 0.0f;
        boolean z22 = true;
        int i60 = 0;
        int i61 = 0;
        int i62 = 0;
        int i63 = 0;
        int i64 = 0;
        int i65 = 0;
        boolean z23 = false;
        boolean z24 = false;
        while (i60 < virtualChildCount2) {
            char c6 = c5;
            View childAt6 = x5.getChildAt(i60);
            if (childAt6 == null) {
                x5.f18201p = x5.f18201p;
                i15 = i60;
                i19 = i62;
                iArr2 = iArr3;
                iArr = iArr4;
                z5 = z19;
                z6 = z20;
            } else {
                int i66 = i61;
                if (childAt6.getVisibility() == 8) {
                    i59 = i;
                    i15 = i60;
                    i19 = i62;
                    iArr = iArr4;
                    z5 = z19;
                    z6 = z20;
                    i61 = i66;
                    iArr2 = iArr3;
                } else {
                    if (x5.g(i60)) {
                        x5.f18201p += x5.f18207v;
                    }
                    W w10 = (W) childAt6.getLayoutParams();
                    float f9 = ((LinearLayout.LayoutParams) w10).weight;
                    f8 += f9;
                    int i67 = i60;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) w10).width == 0 && f9 > 0.0f) {
                        if (z21) {
                            x5.f18201p = ((LinearLayout.LayoutParams) w10).leftMargin + ((LinearLayout.LayoutParams) w10).rightMargin + x5.f18201p;
                        } else {
                            int i68 = x5.f18201p;
                            x5.f18201p = Math.max(i68, ((LinearLayout.LayoutParams) w10).leftMargin + i68 + ((LinearLayout.LayoutParams) w10).rightMargin);
                        }
                        if (z19) {
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(makeMeasureSpec2, makeMeasureSpec2);
                            view = childAt6;
                            z5 = z19;
                            z6 = z20;
                            i16 = i66;
                            i15 = i67;
                            w5 = w10;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i59 = i;
                            i17 = i62;
                            i14 = i63;
                        } else {
                            view = childAt6;
                            z5 = z19;
                            z6 = z20;
                            z24 = true;
                            i16 = i66;
                            i15 = i67;
                            i18 = 1073741824;
                            w5 = w10;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i59 = i;
                            i17 = i62;
                            i14 = i63;
                            if (mode4 == i18 && ((LinearLayout.LayoutParams) w5).height == -1) {
                                z7 = true;
                                z23 = true;
                            } else {
                                z7 = false;
                            }
                            int i69 = ((LinearLayout.LayoutParams) w5).topMargin + ((LinearLayout.LayoutParams) w5).bottomMargin;
                            int measuredHeight3 = view.getMeasuredHeight() + i69;
                            i65 = View.combineMeasuredStates(i65, view.getMeasuredState());
                            if (z5) {
                                z8 = z7;
                            } else {
                                int baseline2 = view.getBaseline();
                                z8 = z7;
                                if (baseline2 != -1) {
                                    int i70 = ((LinearLayout.LayoutParams) w5).gravity;
                                    if (i70 < 0) {
                                        i70 = x5.f18200o;
                                    }
                                    int i71 = (((i70 & 112) >> 4) & (-2)) >> 1;
                                    iArr2[i71] = Math.max(iArr2[i71], baseline2);
                                    iArr[i71] = Math.max(iArr[i71], measuredHeight3 - baseline2);
                                }
                            }
                            int max3 = Math.max(i16, measuredHeight3);
                            boolean z25 = !z22 && ((LinearLayout.LayoutParams) w5).height == -1;
                            if (((LinearLayout.LayoutParams) w5).weight <= 0.0f) {
                                if (!z8) {
                                    i69 = measuredHeight3;
                                }
                                i63 = Math.max(i14, i69);
                                max = i17;
                            } else {
                                if (!z8) {
                                    i69 = measuredHeight3;
                                }
                                max = Math.max(i17, i69);
                                i63 = i14;
                            }
                            int i72 = max;
                            i61 = max3;
                            i19 = i72;
                            z22 = z25;
                        }
                    } else {
                        if (((LinearLayout.LayoutParams) w10).width != 0 || f9 <= 0.0f) {
                            i13 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) w10).width = -2;
                            i13 = 0;
                        }
                        iArr = iArr4;
                        i14 = i63;
                        i15 = i67;
                        z5 = z19;
                        z6 = z20;
                        int i73 = i13;
                        w5 = w10;
                        i16 = i66;
                        i59 = i;
                        iArr2 = iArr3;
                        i17 = i62;
                        x5.measureChildWithMargins(childAt6, i59, f8 == 0.0f ? x5.f18201p : 0, i5, 0);
                        if (i73 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) w5).width = i73;
                        }
                        int measuredWidth3 = childAt6.getMeasuredWidth();
                        if (z21) {
                            view = childAt6;
                            x5.f18201p = ((LinearLayout.LayoutParams) w5).leftMargin + measuredWidth3 + ((LinearLayout.LayoutParams) w5).rightMargin + x5.f18201p;
                        } else {
                            view = childAt6;
                            int i74 = x5.f18201p;
                            x5.f18201p = Math.max(i74, i74 + measuredWidth3 + ((LinearLayout.LayoutParams) w5).leftMargin + ((LinearLayout.LayoutParams) w5).rightMargin);
                        }
                        if (z6) {
                            i64 = Math.max(measuredWidth3, i64);
                        }
                    }
                    i18 = 1073741824;
                    if (mode4 == i18) {
                    }
                    z7 = false;
                    int i692 = ((LinearLayout.LayoutParams) w5).topMargin + ((LinearLayout.LayoutParams) w5).bottomMargin;
                    int measuredHeight32 = view.getMeasuredHeight() + i692;
                    i65 = View.combineMeasuredStates(i65, view.getMeasuredState());
                    if (z5) {
                    }
                    int max32 = Math.max(i16, measuredHeight32);
                    if (z22) {
                    }
                    if (((LinearLayout.LayoutParams) w5).weight <= 0.0f) {
                    }
                    int i722 = max;
                    i61 = max32;
                    i19 = i722;
                    z22 = z25;
                }
            }
            i62 = i19;
            i60 = i15 + 1;
            c5 = c6;
            iArr3 = iArr2;
            iArr4 = iArr;
            z19 = z5;
            z20 = z6;
        }
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        char c7 = c5;
        boolean z26 = z19;
        boolean z27 = z20;
        int i75 = i61;
        int i76 = i62;
        int i77 = i63;
        if (x5.f18201p > 0 && x5.g(virtualChildCount2)) {
            x5.f18201p += x5.f18207v;
        }
        int i78 = iArr5[1];
        int max4 = (i78 == -1 && iArr5[0] == -1 && iArr5[c7] == -1 && iArr5[3] == -1) ? i75 : Math.max(i75, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c7]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i78, iArr5[c7]))));
        if (z27 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
            x5.f18201p = 0;
            for (int i79 = 0; i79 < virtualChildCount2; i79++) {
                View childAt7 = x5.getChildAt(i79);
                if (childAt7 == null) {
                    x5.f18201p = x5.f18201p;
                } else if (childAt7.getVisibility() != 8) {
                    W w11 = (W) childAt7.getLayoutParams();
                    if (z21) {
                        x5.f18201p = ((LinearLayout.LayoutParams) w11).leftMargin + i64 + ((LinearLayout.LayoutParams) w11).rightMargin + x5.f18201p;
                    } else {
                        int i80 = x5.f18201p;
                        x5.f18201p = Math.max(i80, i80 + i64 + ((LinearLayout.LayoutParams) w11).leftMargin + ((LinearLayout.LayoutParams) w11).rightMargin);
                    }
                }
            }
        }
        int paddingRight = x5.getPaddingRight() + x5.getPaddingLeft() + x5.f18201p;
        x5.f18201p = paddingRight;
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, x5.getSuggestedMinimumWidth()), i59, 0);
        int i81 = (resolveSizeAndState2 & 16777215) - x5.f18201p;
        if (z24 || (i81 != 0 && f8 > 0.0f)) {
            float f10 = x5.f18202q;
            if (f10 > 0.0f) {
                f8 = f10;
            }
            iArr5[3] = -1;
            iArr5[c7] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[c7] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            x5.f18201p = 0;
            max4 = -1;
            int i82 = 0;
            while (i82 < virtualChildCount2) {
                View childAt8 = x5.getChildAt(i82);
                if (childAt8 == null || childAt8.getVisibility() == 8) {
                    i10 = resolveSizeAndState2;
                } else {
                    W w12 = (W) childAt8.getLayoutParams();
                    float f11 = ((LinearLayout.LayoutParams) w12).weight;
                    if (f11 > 0.0f) {
                        int i83 = (int) ((i81 * f11) / f8);
                        f8 -= f11;
                        i81 -= i83;
                        i10 = resolveSizeAndState2;
                        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i5, x5.getPaddingBottom() + x5.getPaddingTop() + ((LinearLayout.LayoutParams) w12).topMargin + ((LinearLayout.LayoutParams) w12).bottomMargin, ((LinearLayout.LayoutParams) w12).height);
                        if (((LinearLayout.LayoutParams) w12).width == 0) {
                            i12 = 1073741824;
                            if (mode3 == 1073741824) {
                                if (i83 <= 0) {
                                    i83 = 0;
                                }
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(i83, 1073741824), childMeasureSpec2);
                                i65 = View.combineMeasuredStates(i65, childAt8.getMeasuredState() & (-16777216));
                            }
                        } else {
                            i12 = 1073741824;
                        }
                        int measuredWidth4 = childAt8.getMeasuredWidth() + i83;
                        if (measuredWidth4 < 0) {
                            measuredWidth4 = 0;
                        }
                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i12), childMeasureSpec2);
                        i65 = View.combineMeasuredStates(i65, childAt8.getMeasuredState() & (-16777216));
                    } else {
                        i10 = resolveSizeAndState2;
                    }
                    if (z21) {
                        x5.f18201p = childAt8.getMeasuredWidth() + ((LinearLayout.LayoutParams) w12).leftMargin + ((LinearLayout.LayoutParams) w12).rightMargin + x5.f18201p;
                    } else {
                        int i84 = x5.f18201p;
                        x5.f18201p = Math.max(i84, childAt8.getMeasuredWidth() + i84 + ((LinearLayout.LayoutParams) w12).leftMargin + ((LinearLayout.LayoutParams) w12).rightMargin);
                    }
                    boolean z28 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) w12).height == -1;
                    int i85 = ((LinearLayout.LayoutParams) w12).topMargin + ((LinearLayout.LayoutParams) w12).bottomMargin;
                    int measuredHeight4 = childAt8.getMeasuredHeight() + i85;
                    max4 = Math.max(max4, measuredHeight4);
                    if (!z28) {
                        i85 = measuredHeight4;
                    }
                    int max5 = Math.max(i76, i85);
                    if (z22) {
                        i11 = -1;
                        if (((LinearLayout.LayoutParams) w12).height == -1) {
                            z3 = true;
                            if (!z26 && (baseline = childAt8.getBaseline()) != i11) {
                                int i86 = ((LinearLayout.LayoutParams) w12).gravity;
                                if (i86 < 0) {
                                    i86 = x5.f18200o;
                                }
                                int i87 = (((i86 & 112) >> 4) & (-2)) >> 1;
                                iArr5[i87] = Math.max(iArr5[i87], baseline);
                                iArr6[i87] = Math.max(iArr6[i87], measuredHeight4 - baseline);
                            }
                            z22 = z3;
                            i76 = max5;
                        }
                    } else {
                        i11 = -1;
                    }
                    z3 = false;
                    if (!z26) {
                    }
                    z22 = z3;
                    i76 = max5;
                }
                i82++;
                resolveSizeAndState2 = i10;
            }
            i6 = resolveSizeAndState2;
            i7 = -16777216;
            x5.f18201p = x5.getPaddingRight() + x5.getPaddingLeft() + x5.f18201p;
            int i88 = iArr5[1];
            if (i88 == -1 && iArr5[0] == -1 && iArr5[c7] == -1 && iArr5[3] == -1) {
                i8 = 0;
            } else {
                i8 = 0;
                max4 = Math.max(max4, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c7]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i88, iArr5[c7]))));
            }
            i9 = i76;
        } else {
            i9 = Math.max(i76, i77);
            if (z27 && mode3 != 1073741824) {
                for (int i89 = 0; i89 < virtualChildCount2; i89++) {
                    View childAt9 = x5.getChildAt(i89);
                    if (childAt9 != null && childAt9.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((W) childAt9.getLayoutParams())).weight > 0.0f) {
                        childAt9.measure(View.MeasureSpec.makeMeasureSpec(i64, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i6 = resolveSizeAndState2;
            i7 = -16777216;
            i8 = 0;
        }
        if (!z22 && mode4 != 1073741824) {
            max4 = i9;
        }
        x5.setMeasuredDimension(i6 | (i65 & i7), View.resolveSizeAndState(Math.max(x5.getPaddingBottom() + x5.getPaddingTop() + max4, x5.getSuggestedMinimumHeight()), i5, i65 << 16));
        if (z23) {
            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(x5.getMeasuredHeight(), 1073741824);
            int i90 = i8;
            while (i90 < virtualChildCount2) {
                View childAt10 = x5.getChildAt(i90);
                if (childAt10.getVisibility() != 8) {
                    W w13 = (W) childAt10.getLayoutParams();
                    if (((LinearLayout.LayoutParams) w13).height == -1) {
                        int i91 = ((LinearLayout.LayoutParams) w13).width;
                        ((LinearLayout.LayoutParams) w13).width = childAt10.getMeasuredWidth();
                        x5.measureChildWithMargins(childAt10, i59, 0, makeMeasureSpec3, 0);
                        ((LinearLayout.LayoutParams) w13).width = i91;
                    }
                }
                i90++;
                x5 = this;
                i59 = i;
            }
        }
    }

    public void setBaselineAligned(boolean z3) {
        this.f18196k = z3;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.f18197l = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f18206u) {
            return;
        }
        this.f18206u = drawable;
        if (drawable != null) {
            this.f18207v = drawable.getIntrinsicWidth();
            this.f18208w = drawable.getIntrinsicHeight();
        } else {
            this.f18207v = 0;
            this.f18208w = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.f18210y = i;
    }

    public void setGravity(int i) {
        if (this.f18200o != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f18200o = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i5 = i & 8388615;
        int i6 = this.f18200o;
        if ((8388615 & i6) != i5) {
            this.f18200o = i5 | ((-8388616) & i6);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z3) {
        this.f18203r = z3;
    }

    public void setOrientation(int i) {
        if (this.f18199n != i) {
            this.f18199n = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f18209x) {
            requestLayout();
        }
        this.f18209x = i;
    }

    public void setVerticalGravity(int i) {
        int i5 = i & 112;
        int i6 = this.f18200o;
        if ((i6 & 112) != i5) {
            this.f18200o = i5 | (i6 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f18202q = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
