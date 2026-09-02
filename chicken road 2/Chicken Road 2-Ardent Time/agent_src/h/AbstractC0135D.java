package h;

/* renamed from: h.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0135D extends android.view.ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3044a;

    /* renamed from: b, reason: collision with root package name */
    public int f3045b;

    /* renamed from: c, reason: collision with root package name */
    public int f3046c;

    /* renamed from: d, reason: collision with root package name */
    public int f3047d;

    /* renamed from: e, reason: collision with root package name */
    public int f3048e;

    /* renamed from: f, reason: collision with root package name */
    public int f3049f;

    /* renamed from: g, reason: collision with root package name */
    public float f3050g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3051h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f3052i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f3053j;

    /* renamed from: k, reason: collision with root package name */
    public android.graphics.drawable.Drawable f3054k;

    /* renamed from: l, reason: collision with root package name */
    public int f3055l;

    /* renamed from: m, reason: collision with root package name */
    public int f3056m;

    /* renamed from: n, reason: collision with root package name */
    public int f3057n;

    /* renamed from: o, reason: collision with root package name */
    public int f3058o;

    public AbstractC0135D(android.content.Context context, android.util.AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f3044a = true;
        this.f3045b = -1;
        this.f3046c = 0;
        this.f3048e = 8388659;
        I0.b H2 = I0.b.H(context, attributeSet, c.AbstractC0095a.f2540i, i2);
        android.content.res.TypedArray typedArray = (android.content.res.TypedArray) H2.f658c;
        int i3 = typedArray.getInt(1, -1);
        if (i3 >= 0) {
            setOrientation(i3);
        }
        int i4 = typedArray.getInt(0, -1);
        if (i4 >= 0) {
            setGravity(i4);
        }
        boolean z2 = typedArray.getBoolean(2, true);
        if (!z2) {
            setBaselineAligned(z2);
        }
        this.f3050g = typedArray.getFloat(4, -1.0f);
        this.f3045b = typedArray.getInt(3, -1);
        this.f3051h = typedArray.getBoolean(7, false);
        setDividerDrawable(H2.A(5));
        this.f3057n = typedArray.getInt(8, 0);
        this.f3058o = typedArray.getDimensionPixelSize(6, 0);
        H2.K();
    }

    public final void b(android.graphics.Canvas canvas, int i2) {
        this.f3054k.setBounds(getPaddingLeft() + this.f3058o, i2, (getWidth() - getPaddingRight()) - this.f3058o, this.f3056m + i2);
        this.f3054k.draw(canvas);
    }

    public final void c(android.graphics.Canvas canvas, int i2) {
        this.f3054k.setBounds(i2, getPaddingTop() + this.f3058o, this.f3055l + i2, (getHeight() - getPaddingBottom()) - this.f3058o);
        this.f3054k.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof h.C0134C;
    }

    @Override // android.view.ViewGroup
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public h.C0134C generateDefaultLayoutParams() {
        int i2 = this.f3047d;
        if (i2 == 0) {
            return new h.C0134C(-2);
        }
        if (i2 == 1) {
            return new h.C0134C(-1);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public h.C0134C generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new h.C0134C(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public h.C0134C generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new h.C0134C(layoutParams);
    }

    public final boolean g(int i2) {
        if (i2 == 0) {
            return (this.f3057n & 1) != 0;
        }
        if (i2 == getChildCount()) {
            return (this.f3057n & 4) != 0;
        }
        if ((this.f3057n & 2) == 0) {
            return false;
        }
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            if (getChildAt(i3).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public int getBaseline() {
        int i2;
        if (this.f3045b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i3 = this.f3045b;
        if (childCount <= i3) {
            throw new java.lang.RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        android.view.View childAt = getChildAt(i3);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f3045b == 0) {
                return -1;
            }
            throw new java.lang.RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i4 = this.f3046c;
        if (this.f3047d == 1 && (i2 = this.f3048e & 112) != 48) {
            if (i2 == 16) {
                i4 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f3049f) / 2;
            } else if (i2 == 80) {
                i4 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f3049f;
            }
        }
        return i4 + ((android.view.ViewGroup.MarginLayoutParams) ((h.C0134C) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f3045b;
    }

    public android.graphics.drawable.Drawable getDividerDrawable() {
        return this.f3054k;
    }

    public int getDividerPadding() {
        return this.f3058o;
    }

    public int getDividerWidth() {
        return this.f3055l;
    }

    public int getGravity() {
        return this.f3048e;
    }

    public int getOrientation() {
        return this.f3047d;
    }

    public int getShowDividers() {
        return this.f3057n;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f3050g;
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        int right;
        int left;
        int i2;
        if (this.f3054k == null) {
            return;
        }
        int i3 = 0;
        if (this.f3047d == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i3 < virtualChildCount) {
                android.view.View childAt = getChildAt(i3);
                if (childAt != null && childAt.getVisibility() != 8 && g(i3)) {
                    b(canvas, (childAt.getTop() - ((android.view.ViewGroup.MarginLayoutParams) ((h.C0134C) childAt.getLayoutParams())).topMargin) - this.f3056m);
                }
                i3++;
            }
            if (g(virtualChildCount)) {
                android.view.View childAt2 = getChildAt(virtualChildCount - 1);
                b(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f3056m : childAt2.getBottom() + ((android.view.ViewGroup.MarginLayoutParams) ((h.C0134C) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean a2 = h.t0.a(this);
        while (i3 < virtualChildCount2) {
            android.view.View childAt3 = getChildAt(i3);
            if (childAt3 != null && childAt3.getVisibility() != 8 && g(i3)) {
                h.C0134C c0134c = (h.C0134C) childAt3.getLayoutParams();
                c(canvas, a2 ? childAt3.getRight() + ((android.view.ViewGroup.MarginLayoutParams) c0134c).rightMargin : (childAt3.getLeft() - ((android.view.ViewGroup.MarginLayoutParams) c0134c).leftMargin) - this.f3055l);
            }
            i3++;
        }
        if (g(virtualChildCount2)) {
            android.view.View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                h.C0134C c0134c2 = (h.C0134C) childAt4.getLayoutParams();
                if (a2) {
                    left = childAt4.getLeft() - ((android.view.ViewGroup.MarginLayoutParams) c0134c2).leftMargin;
                    i2 = this.f3055l;
                    right = left - i2;
                } else {
                    right = childAt4.getRight() + ((android.view.ViewGroup.MarginLayoutParams) c0134c2).rightMargin;
                }
            } else if (a2) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i2 = this.f3055l;
                right = left - i2;
            }
            c(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018c  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20 = 8;
        if (this.f3047d == 1) {
            int paddingLeft = getPaddingLeft();
            int i21 = i4 - i2;
            int paddingRight = i21 - getPaddingRight();
            int paddingRight2 = (i21 - paddingLeft) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i22 = this.f3048e;
            int i23 = i22 & 112;
            int i24 = 8388615 & i22;
            int paddingTop = i23 != 16 ? i23 != 80 ? getPaddingTop() : ((getPaddingTop() + i5) - i3) - this.f3049f : getPaddingTop() + (((i5 - i3) - this.f3049f) / 2);
            int i25 = 0;
            while (i25 < virtualChildCount) {
                android.view.View childAt = getChildAt(i25);
                if (childAt != null && childAt.getVisibility() != i20) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    h.C0134C c0134c = (h.C0134C) childAt.getLayoutParams();
                    int i26 = c0134c.f3043b;
                    if (i26 < 0) {
                        i26 = i24;
                    }
                    java.lang.reflect.Field field = y.x.f8478a;
                    int absoluteGravity = android.view.Gravity.getAbsoluteGravity(i26, getLayoutDirection()) & 7;
                    if (absoluteGravity == 1) {
                        i17 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((android.view.ViewGroup.MarginLayoutParams) c0134c).leftMargin;
                        i18 = ((android.view.ViewGroup.MarginLayoutParams) c0134c).rightMargin;
                    } else if (absoluteGravity != 5) {
                        i19 = ((android.view.ViewGroup.MarginLayoutParams) c0134c).leftMargin + paddingLeft;
                        if (g(i25)) {
                            paddingTop += this.f3056m;
                        }
                        int i27 = paddingTop + ((android.view.ViewGroup.MarginLayoutParams) c0134c).topMargin;
                        childAt.layout(i19, i27, measuredWidth + i19, i27 + measuredHeight);
                        paddingTop = measuredHeight + ((android.view.ViewGroup.MarginLayoutParams) c0134c).bottomMargin + i27;
                    } else {
                        i17 = paddingRight - measuredWidth;
                        i18 = ((android.view.ViewGroup.MarginLayoutParams) c0134c).rightMargin;
                    }
                    i19 = i17 - i18;
                    if (g(i25)) {
                    }
                    int i272 = paddingTop + ((android.view.ViewGroup.MarginLayoutParams) c0134c).topMargin;
                    childAt.layout(i19, i272, measuredWidth + i19, i272 + measuredHeight);
                    paddingTop = measuredHeight + ((android.view.ViewGroup.MarginLayoutParams) c0134c).bottomMargin + i272;
                }
                i25++;
                i20 = 8;
            }
            return;
        }
        boolean a2 = h.t0.a(this);
        int paddingTop2 = getPaddingTop();
        int i28 = i5 - i3;
        int paddingBottom = i28 - getPaddingBottom();
        int paddingBottom2 = (i28 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i29 = this.f3048e;
        int i30 = 8388615 & i29;
        int i31 = i29 & 112;
        boolean z3 = this.f3044a;
        int[] iArr = this.f3052i;
        int[] iArr2 = this.f3053j;
        java.lang.reflect.Field field2 = y.x.f8478a;
        int absoluteGravity2 = android.view.Gravity.getAbsoluteGravity(i30, getLayoutDirection());
        int paddingLeft2 = absoluteGravity2 != 1 ? absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i4) - i2) - this.f3049f : getPaddingLeft() + (((i4 - i2) - this.f3049f) / 2);
        if (a2) {
            i7 = virtualChildCount2 - 1;
            i6 = -1;
        } else {
            i6 = 1;
            i7 = 0;
        }
        int i32 = 0;
        while (i32 < virtualChildCount2) {
            int i33 = (i6 * i32) + i7;
            android.view.View childAt2 = getChildAt(i33);
            if (childAt2 == null) {
                i8 = i7;
                i9 = i6;
                i10 = virtualChildCount2;
                i11 = i31;
                i12 = 1;
            } else {
                i8 = i7;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight2 = childAt2.getMeasuredHeight();
                    h.C0134C c0134c2 = (h.C0134C) childAt2.getLayoutParams();
                    i9 = i6;
                    if (z3) {
                        i10 = virtualChildCount2;
                        if (((android.view.ViewGroup.MarginLayoutParams) c0134c2).height != -1) {
                            i13 = childAt2.getBaseline();
                            i14 = c0134c2.f3043b;
                            if (i14 < 0) {
                                i14 = i31;
                            }
                            i15 = i14 & 112;
                            i11 = i31;
                            if (i15 != 16) {
                                i16 = ((((paddingBottom2 - measuredHeight2) / 2) + paddingTop2) + ((android.view.ViewGroup.MarginLayoutParams) c0134c2).topMargin) - ((android.view.ViewGroup.MarginLayoutParams) c0134c2).bottomMargin;
                            } else if (i15 == 48) {
                                i16 = ((android.view.ViewGroup.MarginLayoutParams) c0134c2).topMargin + paddingTop2;
                                if (i13 != -1) {
                                    i16 = (iArr[1] - i13) + i16;
                                }
                            } else if (i15 != 80) {
                                i16 = paddingTop2;
                            } else {
                                i16 = (paddingBottom - measuredHeight2) - ((android.view.ViewGroup.MarginLayoutParams) c0134c2).bottomMargin;
                                if (i13 != -1) {
                                    i16 -= iArr2[2] - (childAt2.getMeasuredHeight() - i13);
                                }
                            }
                            if (g(i33)) {
                                paddingLeft2 += this.f3055l;
                            }
                            int i34 = paddingLeft2 + ((android.view.ViewGroup.MarginLayoutParams) c0134c2).leftMargin;
                            childAt2.layout(i34, i16, i34 + measuredWidth2, i16 + measuredHeight2);
                            paddingLeft2 = measuredWidth2 + ((android.view.ViewGroup.MarginLayoutParams) c0134c2).rightMargin + i34;
                        }
                    } else {
                        i10 = virtualChildCount2;
                    }
                    i13 = -1;
                    i14 = c0134c2.f3043b;
                    if (i14 < 0) {
                    }
                    i15 = i14 & 112;
                    i11 = i31;
                    if (i15 != 16) {
                    }
                    if (g(i33)) {
                    }
                    int i342 = paddingLeft2 + ((android.view.ViewGroup.MarginLayoutParams) c0134c2).leftMargin;
                    childAt2.layout(i342, i16, i342 + measuredWidth2, i16 + measuredHeight2);
                    paddingLeft2 = measuredWidth2 + ((android.view.ViewGroup.MarginLayoutParams) c0134c2).rightMargin + i342;
                } else {
                    i9 = i6;
                    i10 = virtualChildCount2;
                    i11 = i31;
                }
                i12 = 1;
            }
            i32 += i12;
            i7 = i8;
            i6 = i9;
            virtualChildCount2 = i10;
            i31 = i11;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:175:0x02dc, code lost:
    
        if (((android.view.ViewGroup.MarginLayoutParams) r9).width == (-1)) goto L150;
     */
    /* JADX WARN: Removed duplicated region for block: B:240:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x085d  */
    /* JADX WARN: Removed duplicated region for block: B:354:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0695  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x06b1  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i2, int i3) {
        char c2;
        int i4;
        int max;
        float f2;
        int i5;
        int i6;
        int i7;
        int i8;
        char c3;
        int i9;
        int i10;
        int i11;
        int i12;
        float f3;
        int i13;
        int i14;
        boolean z2;
        int baseline;
        int i15;
        int i16;
        float f4;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z3;
        boolean z4;
        h.C0134C c0134c;
        boolean z5;
        int i22;
        boolean z6;
        int i23;
        int i24;
        int baseline2;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        boolean z7;
        h.C0134C c0134c2;
        boolean z8;
        boolean z9;
        int max2;
        int i36 = -2;
        int i37 = 1073741824;
        int i38 = 8;
        int i39 = Integer.MIN_VALUE;
        float f5 = 0.0f;
        boolean z10 = true;
        if (this.f3047d == 1) {
            this.f3049f = 0;
            int virtualChildCount = getVirtualChildCount();
            int mode = android.view.View.MeasureSpec.getMode(i2);
            int mode2 = android.view.View.MeasureSpec.getMode(i3);
            int i40 = this.f3045b;
            boolean z11 = this.f3051h;
            boolean z12 = true;
            int i41 = 0;
            int i42 = 0;
            int i43 = 0;
            boolean z13 = false;
            int i44 = 0;
            int i45 = 0;
            int i46 = 0;
            boolean z14 = false;
            float f6 = 0.0f;
            while (i41 < virtualChildCount) {
                android.view.View childAt = getChildAt(i41);
                if (childAt == null) {
                    this.f3049f = this.f3049f;
                } else if (childAt.getVisibility() != i38) {
                    if (g(i41)) {
                        this.f3049f += this.f3056m;
                    }
                    h.C0134C c0134c3 = (h.C0134C) childAt.getLayoutParams();
                    float f7 = c0134c3.f3042a;
                    f6 += f7;
                    if (mode2 == i37 && ((android.view.ViewGroup.MarginLayoutParams) c0134c3).height == 0 && f7 > f5) {
                        int i47 = this.f3049f;
                        this.f3049f = java.lang.Math.max(i47, ((android.view.ViewGroup.MarginLayoutParams) c0134c3).topMargin + i47 + ((android.view.ViewGroup.MarginLayoutParams) c0134c3).bottomMargin);
                        i32 = i40;
                        i33 = mode2;
                        i34 = mode;
                        i35 = virtualChildCount;
                        c0134c2 = c0134c3;
                        z8 = true;
                        z7 = true;
                    } else {
                        if (((android.view.ViewGroup.MarginLayoutParams) c0134c3).height != 0 || f7 <= f5) {
                            i31 = i39;
                        } else {
                            ((android.view.ViewGroup.MarginLayoutParams) c0134c3).height = i36;
                            i31 = 0;
                        }
                        int i48 = f6 == f5 ? this.f3049f : 0;
                        i32 = i40;
                        i33 = mode2;
                        i34 = mode;
                        i35 = virtualChildCount;
                        z7 = true;
                        c0134c2 = c0134c3;
                        measureChildWithMargins(childAt, i2, 0, i3, i48);
                        if (i31 != i39) {
                            ((android.view.ViewGroup.MarginLayoutParams) c0134c2).height = i31;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i49 = this.f3049f;
                        this.f3049f = java.lang.Math.max(i49, i49 + measuredHeight + ((android.view.ViewGroup.MarginLayoutParams) c0134c2).topMargin + ((android.view.ViewGroup.MarginLayoutParams) c0134c2).bottomMargin);
                        int i50 = i44;
                        if (z11) {
                            i44 = java.lang.Math.max(measuredHeight, i50);
                        }
                        z8 = z13;
                    }
                    if (i32 >= 0 && i32 == i41 + 1) {
                        this.f3046c = this.f3049f;
                    }
                    float f8 = c0134c2.f3042a;
                    if (i41 < i32 && f8 > 0.0f) {
                        throw new java.lang.RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    mode = i34;
                    if (mode == 1073741824 || ((android.view.ViewGroup.MarginLayoutParams) c0134c2).width != -1) {
                        z9 = false;
                    } else {
                        z9 = z7;
                        z14 = z9;
                    }
                    int i51 = ((android.view.ViewGroup.MarginLayoutParams) c0134c2).leftMargin + ((android.view.ViewGroup.MarginLayoutParams) c0134c2).rightMargin;
                    int measuredWidth = childAt.getMeasuredWidth() + i51;
                    max2 = java.lang.Math.max(i45, measuredWidth);
                    int combineMeasuredStates = android.view.View.combineMeasuredStates(i46, childAt.getMeasuredState());
                    boolean z15 = (z12 && ((android.view.ViewGroup.MarginLayoutParams) c0134c2).width == -1) ? z7 : false;
                    if (f8 > 0.0f) {
                        if (!z9) {
                            i51 = measuredWidth;
                        }
                        i43 = java.lang.Math.max(i43, i51);
                    } else {
                        int i52 = i43;
                        if (!z9) {
                            i51 = measuredWidth;
                        }
                        i42 = java.lang.Math.max(i42, i51);
                        i43 = i52;
                    }
                    z13 = z8;
                    i46 = combineMeasuredStates;
                    z12 = z15;
                    i41++;
                    i40 = i32;
                    i45 = max2;
                    z10 = z7;
                    mode2 = i33;
                    virtualChildCount = i35;
                    i36 = -2;
                    i37 = 1073741824;
                    i38 = 8;
                    i39 = Integer.MIN_VALUE;
                    f5 = 0.0f;
                }
                i32 = i40;
                i33 = mode2;
                i35 = virtualChildCount;
                max2 = i45;
                z7 = true;
                i41++;
                i40 = i32;
                i45 = max2;
                z10 = z7;
                mode2 = i33;
                virtualChildCount = i35;
                i36 = -2;
                i37 = 1073741824;
                i38 = 8;
                i39 = Integer.MIN_VALUE;
                f5 = 0.0f;
            }
            int i53 = mode2;
            int i54 = virtualChildCount;
            boolean z16 = z10;
            int i55 = i42;
            int i56 = i43;
            int i57 = i44;
            int i58 = i45;
            int i59 = i46;
            if (this.f3049f > 0 && g(i54)) {
                this.f3049f += this.f3056m;
            }
            int i60 = i53;
            if (z11 && (i60 == Integer.MIN_VALUE || i60 == 0)) {
                this.f3049f = 0;
                for (int i61 = 0; i61 < i54; i61++) {
                    android.view.View childAt2 = getChildAt(i61);
                    if (childAt2 == null) {
                        this.f3049f = this.f3049f;
                    } else if (childAt2.getVisibility() != 8) {
                        h.C0134C c0134c4 = (h.C0134C) childAt2.getLayoutParams();
                        int i62 = this.f3049f;
                        this.f3049f = java.lang.Math.max(i62, i62 + i57 + ((android.view.ViewGroup.MarginLayoutParams) c0134c4).topMargin + ((android.view.ViewGroup.MarginLayoutParams) c0134c4).bottomMargin);
                    }
                }
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop() + this.f3049f;
            this.f3049f = paddingBottom;
            int resolveSizeAndState = android.view.View.resolveSizeAndState(java.lang.Math.max(paddingBottom, getSuggestedMinimumHeight()), i3, 0);
            int i63 = (16777215 & resolveSizeAndState) - this.f3049f;
            if (z13 || (i63 != 0 && f6 > 0.0f)) {
                float f9 = this.f3050g;
                if (f9 > 0.0f) {
                    f6 = f9;
                }
                this.f3049f = 0;
                int i64 = 0;
                while (i64 < i54) {
                    android.view.View childAt3 = getChildAt(i64);
                    if (childAt3.getVisibility() == 8) {
                        i27 = i60;
                    } else {
                        h.C0134C c0134c5 = (h.C0134C) childAt3.getLayoutParams();
                        float f10 = c0134c5.f3042a;
                        if (f10 > 0.0f) {
                            int i65 = (int) ((i63 * f10) / f6);
                            f6 -= f10;
                            int i66 = i63 - i65;
                            int childMeasureSpec = android.view.ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + ((android.view.ViewGroup.MarginLayoutParams) c0134c5).leftMargin + ((android.view.ViewGroup.MarginLayoutParams) c0134c5).rightMargin, ((android.view.ViewGroup.MarginLayoutParams) c0134c5).width);
                            if (((android.view.ViewGroup.MarginLayoutParams) c0134c5).height == 0) {
                                i30 = 1073741824;
                                if (i60 == 1073741824) {
                                    if (i65 <= 0) {
                                        i65 = 0;
                                    }
                                    childAt3.measure(childMeasureSpec, android.view.View.MeasureSpec.makeMeasureSpec(i65, 1073741824));
                                    i59 = android.view.View.combineMeasuredStates(i59, childAt3.getMeasuredState() & (-256));
                                    i63 = i66;
                                }
                            } else {
                                i30 = 1073741824;
                            }
                            int measuredHeight2 = childAt3.getMeasuredHeight() + i65;
                            if (measuredHeight2 < 0) {
                                measuredHeight2 = 0;
                            }
                            childAt3.measure(childMeasureSpec, android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight2, i30));
                            i59 = android.view.View.combineMeasuredStates(i59, childAt3.getMeasuredState() & (-256));
                            i63 = i66;
                        }
                        int i67 = ((android.view.ViewGroup.MarginLayoutParams) c0134c5).leftMargin + ((android.view.ViewGroup.MarginLayoutParams) c0134c5).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i67;
                        int max3 = java.lang.Math.max(i58, measuredWidth2);
                        i27 = i60;
                        if (mode != 1073741824) {
                            i28 = max3;
                            i29 = -1;
                        } else {
                            i28 = max3;
                            i29 = -1;
                        }
                        i67 = measuredWidth2;
                        i55 = java.lang.Math.max(i55, i67);
                        boolean z17 = (z12 && ((android.view.ViewGroup.MarginLayoutParams) c0134c5).width == i29) ? z16 : false;
                        int i68 = this.f3049f;
                        this.f3049f = java.lang.Math.max(i68, childAt3.getMeasuredHeight() + i68 + ((android.view.ViewGroup.MarginLayoutParams) c0134c5).topMargin + ((android.view.ViewGroup.MarginLayoutParams) c0134c5).bottomMargin);
                        z12 = z17;
                        i58 = i28;
                    }
                    i64++;
                    i60 = i27;
                }
                this.f3049f = getPaddingBottom() + getPaddingTop() + this.f3049f;
                i26 = i55;
            } else {
                i26 = java.lang.Math.max(i55, i56);
                if (z11 && i60 != 1073741824) {
                    for (int i69 = 0; i69 < i54; i69++) {
                        android.view.View childAt4 = getChildAt(i69);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((h.C0134C) childAt4.getLayoutParams()).f3042a > 0.0f) {
                            childAt4.measure(android.view.View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(i57, 1073741824));
                        }
                    }
                }
            }
            int i70 = i58;
            if (z12 || mode == 1073741824) {
                i26 = i70;
            }
            setMeasuredDimension(android.view.View.resolveSizeAndState(java.lang.Math.max(getPaddingRight() + getPaddingLeft() + i26, getSuggestedMinimumWidth()), i2, i59), resolveSizeAndState);
            if (z14) {
                int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                for (int i71 = 0; i71 < i54; i71++) {
                    android.view.View childAt5 = getChildAt(i71);
                    if (childAt5.getVisibility() != 8) {
                        h.C0134C c0134c6 = (h.C0134C) childAt5.getLayoutParams();
                        if (((android.view.ViewGroup.MarginLayoutParams) c0134c6).width == -1) {
                            int i72 = ((android.view.ViewGroup.MarginLayoutParams) c0134c6).height;
                            ((android.view.ViewGroup.MarginLayoutParams) c0134c6).height = childAt5.getMeasuredHeight();
                            measureChildWithMargins(childAt5, makeMeasureSpec, 0, i3, 0);
                            ((android.view.ViewGroup.MarginLayoutParams) c0134c6).height = i72;
                        }
                    }
                }
                return;
            }
            return;
        }
        this.f3049f = 0;
        int virtualChildCount2 = getVirtualChildCount();
        int mode3 = android.view.View.MeasureSpec.getMode(i2);
        int mode4 = android.view.View.MeasureSpec.getMode(i3);
        if (this.f3052i == null || this.f3053j == null) {
            this.f3052i = new int[4];
            this.f3053j = new int[4];
        }
        int[] iArr = this.f3052i;
        int[] iArr2 = this.f3053j;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z18 = this.f3044a;
        boolean z19 = this.f3051h;
        boolean z20 = mode3 == 1073741824;
        boolean z21 = true;
        int i73 = 0;
        float f11 = 0.0f;
        int i74 = 0;
        int i75 = 0;
        int i76 = 0;
        int i77 = 0;
        int i78 = 0;
        boolean z22 = false;
        boolean z23 = false;
        while (i75 < virtualChildCount2) {
            android.view.View childAt6 = getChildAt(i75);
            if (childAt6 == null) {
                this.f3049f = this.f3049f;
                i21 = i75;
                z3 = z19;
                z4 = z18;
            } else {
                int i79 = i73;
                int i80 = i74;
                if (childAt6.getVisibility() == 8) {
                    z4 = z18;
                    i73 = i79;
                    i74 = i80;
                    i21 = i75;
                    z3 = z19;
                } else {
                    if (g(i75)) {
                        this.f3049f += this.f3055l;
                    }
                    h.C0134C c0134c7 = (h.C0134C) childAt6.getLayoutParams();
                    float f12 = c0134c7.f3042a;
                    float f13 = f11 + f12;
                    if (mode3 == 1073741824 && ((android.view.ViewGroup.MarginLayoutParams) c0134c7).width == 0 && f12 > 0.0f) {
                        if (z20) {
                            i25 = i75;
                            this.f3049f = ((android.view.ViewGroup.MarginLayoutParams) c0134c7).leftMargin + ((android.view.ViewGroup.MarginLayoutParams) c0134c7).rightMargin + this.f3049f;
                        } else {
                            i25 = i75;
                            int i81 = this.f3049f;
                            this.f3049f = java.lang.Math.max(i81, ((android.view.ViewGroup.MarginLayoutParams) c0134c7).leftMargin + i81 + ((android.view.ViewGroup.MarginLayoutParams) c0134c7).rightMargin);
                        }
                        if (z18) {
                            int makeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(makeMeasureSpec2, makeMeasureSpec2);
                            c0134c = c0134c7;
                            i18 = i79;
                            i19 = i80;
                            i21 = i25;
                            z3 = z19;
                            z4 = z18;
                        } else {
                            c0134c = c0134c7;
                            i18 = i79;
                            i19 = i80;
                            i21 = i25;
                            i22 = 1073741824;
                            z3 = z19;
                            z4 = z18;
                            z5 = true;
                            if (mode4 == i22 && ((android.view.ViewGroup.MarginLayoutParams) c0134c).height == -1) {
                                z6 = true;
                                z23 = true;
                            } else {
                                z6 = false;
                            }
                            i23 = ((android.view.ViewGroup.MarginLayoutParams) c0134c).topMargin + ((android.view.ViewGroup.MarginLayoutParams) c0134c).bottomMargin;
                            int measuredHeight3 = childAt6.getMeasuredHeight() + i23;
                            int combineMeasuredStates2 = android.view.View.combineMeasuredStates(i76, childAt6.getMeasuredState());
                            if (z4 || (baseline2 = childAt6.getBaseline()) == -1) {
                                i24 = i23;
                            } else {
                                int i82 = c0134c.f3043b;
                                if (i82 < 0) {
                                    i82 = this.f3048e;
                                }
                                int i83 = (((i82 & 112) >> 4) & (-2)) >> 1;
                                i24 = i23;
                                iArr[i83] = java.lang.Math.max(iArr[i83], baseline2);
                                iArr2[i83] = java.lang.Math.max(iArr2[i83], measuredHeight3 - baseline2);
                            }
                            int max4 = java.lang.Math.max(i19, measuredHeight3);
                            boolean z24 = !z21 && ((android.view.ViewGroup.MarginLayoutParams) c0134c).height == -1;
                            if (c0134c.f3042a <= 0.0f) {
                                if (z6) {
                                    measuredHeight3 = i24;
                                }
                                i78 = java.lang.Math.max(i78, measuredHeight3);
                                i73 = i18;
                            } else {
                                if (z6) {
                                    measuredHeight3 = i24;
                                }
                                i73 = java.lang.Math.max(i18, measuredHeight3);
                            }
                            i74 = max4;
                            i76 = combineMeasuredStates2;
                            z22 = z5;
                            z21 = z24;
                            f11 = f13;
                        }
                    } else {
                        int i84 = i75;
                        if (((android.view.ViewGroup.MarginLayoutParams) c0134c7).width == 0) {
                            f4 = 0.0f;
                            if (f12 > 0.0f) {
                                ((android.view.ViewGroup.MarginLayoutParams) c0134c7).width = -2;
                                i17 = 0;
                                i18 = i79;
                                i19 = i80;
                                i20 = i17;
                                i21 = i84;
                                z3 = z19;
                                z4 = z18;
                                measureChildWithMargins(childAt6, i2, f13 != f4 ? this.f3049f : 0, i3, 0);
                                if (i20 == Integer.MIN_VALUE) {
                                    c0134c = c0134c7;
                                    ((android.view.ViewGroup.MarginLayoutParams) c0134c).width = i20;
                                } else {
                                    c0134c = c0134c7;
                                }
                                int measuredWidth3 = childAt6.getMeasuredWidth();
                                if (z20) {
                                    int i85 = this.f3049f;
                                    this.f3049f = java.lang.Math.max(i85, i85 + measuredWidth3 + ((android.view.ViewGroup.MarginLayoutParams) c0134c).leftMargin + ((android.view.ViewGroup.MarginLayoutParams) c0134c).rightMargin);
                                } else {
                                    this.f3049f = ((android.view.ViewGroup.MarginLayoutParams) c0134c).leftMargin + measuredWidth3 + ((android.view.ViewGroup.MarginLayoutParams) c0134c).rightMargin + this.f3049f;
                                }
                                if (z3) {
                                    i77 = java.lang.Math.max(measuredWidth3, i77);
                                }
                            }
                        } else {
                            f4 = 0.0f;
                        }
                        i17 = Integer.MIN_VALUE;
                        i18 = i79;
                        i19 = i80;
                        i20 = i17;
                        i21 = i84;
                        z3 = z19;
                        z4 = z18;
                        measureChildWithMargins(childAt6, i2, f13 != f4 ? this.f3049f : 0, i3, 0);
                        if (i20 == Integer.MIN_VALUE) {
                        }
                        int measuredWidth32 = childAt6.getMeasuredWidth();
                        if (z20) {
                        }
                        if (z3) {
                        }
                    }
                    z5 = z22;
                    i22 = 1073741824;
                    if (mode4 == i22) {
                    }
                    z6 = false;
                    i23 = ((android.view.ViewGroup.MarginLayoutParams) c0134c).topMargin + ((android.view.ViewGroup.MarginLayoutParams) c0134c).bottomMargin;
                    int measuredHeight32 = childAt6.getMeasuredHeight() + i23;
                    int combineMeasuredStates22 = android.view.View.combineMeasuredStates(i76, childAt6.getMeasuredState());
                    if (z4) {
                    }
                    i24 = i23;
                    int max42 = java.lang.Math.max(i19, measuredHeight32);
                    if (z21) {
                    }
                    if (c0134c.f3042a <= 0.0f) {
                    }
                    i74 = max42;
                    i76 = combineMeasuredStates22;
                    z22 = z5;
                    z21 = z24;
                    f11 = f13;
                }
            }
            i75 = i21 + 1;
            z19 = z3;
            z18 = z4;
        }
        int i86 = i74;
        boolean z25 = z19;
        boolean z26 = z18;
        if (this.f3049f > 0 && g(virtualChildCount2)) {
            this.f3049f += this.f3055l;
        }
        int i87 = iArr[1];
        if (i87 == -1 && iArr[0] == -1 && iArr[2] == -1) {
            c2 = 3;
            if (iArr[3] == -1) {
                max = i86;
                i4 = i76;
                if (z25 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
                    this.f3049f = 0;
                    for (i16 = 0; i16 < virtualChildCount2; i16++) {
                        android.view.View childAt7 = getChildAt(i16);
                        if (childAt7 == null) {
                            this.f3049f = this.f3049f;
                        } else if (childAt7.getVisibility() != 8) {
                            h.C0134C c0134c8 = (h.C0134C) childAt7.getLayoutParams();
                            if (z20) {
                                this.f3049f = ((android.view.ViewGroup.MarginLayoutParams) c0134c8).leftMargin + i77 + ((android.view.ViewGroup.MarginLayoutParams) c0134c8).rightMargin + this.f3049f;
                            } else {
                                int i88 = this.f3049f;
                                this.f3049f = java.lang.Math.max(i88, i88 + i77 + ((android.view.ViewGroup.MarginLayoutParams) c0134c8).leftMargin + ((android.view.ViewGroup.MarginLayoutParams) c0134c8).rightMargin);
                            }
                        }
                    }
                }
                int paddingRight = getPaddingRight() + getPaddingLeft() + this.f3049f;
                this.f3049f = paddingRight;
                int resolveSizeAndState2 = android.view.View.resolveSizeAndState(java.lang.Math.max(paddingRight, getSuggestedMinimumWidth()), i2, 0);
                int i89 = (16777215 & resolveSizeAndState2) - this.f3049f;
                if (!z22 || (i89 != 0 && f11 > 0.0f)) {
                    f2 = this.f3050g;
                    if (f2 > 0.0f) {
                        f11 = f2;
                    }
                    iArr[3] = -1;
                    iArr[2] = -1;
                    iArr[1] = -1;
                    iArr[0] = -1;
                    iArr2[3] = -1;
                    iArr2[2] = -1;
                    iArr2[1] = -1;
                    iArr2[0] = -1;
                    this.f3049f = 0;
                    int i90 = i4;
                    max = -1;
                    i5 = 0;
                    while (i5 < virtualChildCount2) {
                        android.view.View childAt8 = getChildAt(i5);
                        if (childAt8 == null || childAt8.getVisibility() == 8) {
                            i10 = i89;
                            i11 = virtualChildCount2;
                        } else {
                            h.C0134C c0134c9 = (h.C0134C) childAt8.getLayoutParams();
                            float f14 = c0134c9.f3042a;
                            if (f14 > 0.0f) {
                                i11 = virtualChildCount2;
                                int i91 = (int) ((i89 * f14) / f11);
                                float f15 = f11 - f14;
                                int i92 = i89 - i91;
                                int childMeasureSpec2 = android.view.ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + ((android.view.ViewGroup.MarginLayoutParams) c0134c9).topMargin + ((android.view.ViewGroup.MarginLayoutParams) c0134c9).bottomMargin, ((android.view.ViewGroup.MarginLayoutParams) c0134c9).height);
                                if (((android.view.ViewGroup.MarginLayoutParams) c0134c9).width == 0) {
                                    i15 = 1073741824;
                                    if (mode3 == 1073741824) {
                                        if (i91 <= 0) {
                                            i91 = 0;
                                        }
                                        childAt8.measure(android.view.View.MeasureSpec.makeMeasureSpec(i91, 1073741824), childMeasureSpec2);
                                        i90 = android.view.View.combineMeasuredStates(i90, childAt8.getMeasuredState() & (-16777216));
                                        f11 = f15;
                                        i12 = i92;
                                    }
                                } else {
                                    i15 = 1073741824;
                                }
                                int measuredWidth4 = childAt8.getMeasuredWidth() + i91;
                                if (measuredWidth4 < 0) {
                                    measuredWidth4 = 0;
                                }
                                childAt8.measure(android.view.View.MeasureSpec.makeMeasureSpec(measuredWidth4, i15), childMeasureSpec2);
                                i90 = android.view.View.combineMeasuredStates(i90, childAt8.getMeasuredState() & (-16777216));
                                f11 = f15;
                                i12 = i92;
                            } else {
                                i12 = i89;
                                i11 = virtualChildCount2;
                            }
                            if (z20) {
                                f3 = f11;
                                this.f3049f = childAt8.getMeasuredWidth() + ((android.view.ViewGroup.MarginLayoutParams) c0134c9).leftMargin + ((android.view.ViewGroup.MarginLayoutParams) c0134c9).rightMargin + this.f3049f;
                                i13 = i12;
                            } else {
                                f3 = f11;
                                int i93 = this.f3049f;
                                i13 = i12;
                                this.f3049f = java.lang.Math.max(i93, childAt8.getMeasuredWidth() + i93 + ((android.view.ViewGroup.MarginLayoutParams) c0134c9).leftMargin + ((android.view.ViewGroup.MarginLayoutParams) c0134c9).rightMargin);
                            }
                            boolean z27 = mode4 != 1073741824 && ((android.view.ViewGroup.MarginLayoutParams) c0134c9).height == -1;
                            int i94 = ((android.view.ViewGroup.MarginLayoutParams) c0134c9).topMargin + ((android.view.ViewGroup.MarginLayoutParams) c0134c9).bottomMargin;
                            int measuredHeight4 = childAt8.getMeasuredHeight() + i94;
                            max = java.lang.Math.max(max, measuredHeight4);
                            if (!z27) {
                                i94 = measuredHeight4;
                            }
                            i73 = java.lang.Math.max(i73, i94);
                            if (z21) {
                                i14 = -1;
                                if (((android.view.ViewGroup.MarginLayoutParams) c0134c9).height == -1) {
                                    z2 = true;
                                    if (!z26 && (baseline = childAt8.getBaseline()) != i14) {
                                        int i95 = c0134c9.f3043b;
                                        if (i95 < 0) {
                                            i95 = this.f3048e;
                                        }
                                        int i96 = (((i95 & 112) >> 4) & (-2)) >> 1;
                                        iArr[i96] = java.lang.Math.max(iArr[i96], baseline);
                                        iArr2[i96] = java.lang.Math.max(iArr2[i96], measuredHeight4 - baseline);
                                    }
                                    z21 = z2;
                                    i10 = i13;
                                    f11 = f3;
                                }
                            } else {
                                i14 = -1;
                            }
                            z2 = false;
                            if (!z26) {
                            }
                            z21 = z2;
                            i10 = i13;
                            f11 = f3;
                        }
                        i5++;
                        i89 = i10;
                        virtualChildCount2 = i11;
                    }
                    i6 = i3;
                    i7 = virtualChildCount2;
                    this.f3049f = getPaddingRight() + getPaddingLeft() + this.f3049f;
                    i8 = iArr[1];
                    if (i8 != -1 && iArr[0] == -1 && iArr[2] == -1) {
                        c3 = 3;
                        if (iArr[3] == -1) {
                            i9 = 0;
                            i4 = i90;
                        }
                    } else {
                        c3 = 3;
                    }
                    i9 = 0;
                    max = java.lang.Math.max(max, java.lang.Math.max(iArr2[c3], java.lang.Math.max(iArr2[0], java.lang.Math.max(iArr2[1], iArr2[2]))) + java.lang.Math.max(iArr[c3], java.lang.Math.max(iArr[0], java.lang.Math.max(i8, iArr[2]))));
                    i4 = i90;
                } else {
                    i73 = java.lang.Math.max(i73, i78);
                    if (z25 && mode3 != 1073741824) {
                        for (int i97 = 0; i97 < virtualChildCount2; i97++) {
                            android.view.View childAt9 = getChildAt(i97);
                            if (childAt9 != null && childAt9.getVisibility() != 8 && ((h.C0134C) childAt9.getLayoutParams()).f3042a > 0.0f) {
                                childAt9.measure(android.view.View.MeasureSpec.makeMeasureSpec(i77, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                            }
                        }
                    }
                    i6 = i3;
                    i7 = virtualChildCount2;
                    i9 = 0;
                }
                if (!z21 || mode4 == 1073741824) {
                    i73 = max;
                }
                setMeasuredDimension((i4 & (-16777216)) | resolveSizeAndState2, android.view.View.resolveSizeAndState(java.lang.Math.max(getPaddingBottom() + getPaddingTop() + i73, getSuggestedMinimumHeight()), i6, i4 << 16));
                if (z23) {
                    return;
                }
                int makeMeasureSpec3 = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
                int i98 = i7;
                while (i9 < i98) {
                    android.view.View childAt10 = getChildAt(i9);
                    if (childAt10.getVisibility() != 8) {
                        h.C0134C c0134c10 = (h.C0134C) childAt10.getLayoutParams();
                        if (((android.view.ViewGroup.MarginLayoutParams) c0134c10).height == -1) {
                            int i99 = ((android.view.ViewGroup.MarginLayoutParams) c0134c10).width;
                            ((android.view.ViewGroup.MarginLayoutParams) c0134c10).width = childAt10.getMeasuredWidth();
                            measureChildWithMargins(childAt10, i2, 0, makeMeasureSpec3, 0);
                            ((android.view.ViewGroup.MarginLayoutParams) c0134c10).width = i99;
                        }
                    }
                    i9++;
                }
                return;
            }
        } else {
            c2 = 3;
        }
        i4 = i76;
        max = java.lang.Math.max(i86, java.lang.Math.max(iArr2[3], java.lang.Math.max(iArr2[0], java.lang.Math.max(iArr2[1], iArr2[2]))) + java.lang.Math.max(iArr[c2], java.lang.Math.max(iArr[0], java.lang.Math.max(i87, iArr[2]))));
        if (z25) {
            this.f3049f = 0;
            while (i16 < virtualChildCount2) {
            }
        }
        int paddingRight2 = getPaddingRight() + getPaddingLeft() + this.f3049f;
        this.f3049f = paddingRight2;
        int resolveSizeAndState22 = android.view.View.resolveSizeAndState(java.lang.Math.max(paddingRight2, getSuggestedMinimumWidth()), i2, 0);
        int i892 = (16777215 & resolveSizeAndState22) - this.f3049f;
        if (z22) {
        }
        f2 = this.f3050g;
        if (f2 > 0.0f) {
        }
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        this.f3049f = 0;
        int i902 = i4;
        max = -1;
        i5 = 0;
        while (i5 < virtualChildCount2) {
        }
        i6 = i3;
        i7 = virtualChildCount2;
        this.f3049f = getPaddingRight() + getPaddingLeft() + this.f3049f;
        i8 = iArr[1];
        if (i8 != -1) {
        }
        c3 = 3;
        i9 = 0;
        max = java.lang.Math.max(max, java.lang.Math.max(iArr2[c3], java.lang.Math.max(iArr2[0], java.lang.Math.max(iArr2[1], iArr2[2]))) + java.lang.Math.max(iArr[c3], java.lang.Math.max(iArr[0], java.lang.Math.max(i8, iArr[2]))));
        i4 = i902;
        if (!z21) {
        }
        i73 = max;
        setMeasuredDimension((i4 & (-16777216)) | resolveSizeAndState22, android.view.View.resolveSizeAndState(java.lang.Math.max(getPaddingBottom() + getPaddingTop() + i73, getSuggestedMinimumHeight()), i6, i4 << 16));
        if (z23) {
        }
    }

    public void setBaselineAligned(boolean z2) {
        this.f3044a = z2;
    }

    public void setBaselineAlignedChildIndex(int i2) {
        if (i2 >= 0 && i2 < getChildCount()) {
            this.f3045b = i2;
            return;
        }
        throw new java.lang.IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(android.graphics.drawable.Drawable drawable) {
        if (drawable == this.f3054k) {
            return;
        }
        this.f3054k = drawable;
        if (drawable != null) {
            this.f3055l = drawable.getIntrinsicWidth();
            this.f3056m = drawable.getIntrinsicHeight();
        } else {
            this.f3055l = 0;
            this.f3056m = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i2) {
        this.f3058o = i2;
    }

    public void setGravity(int i2) {
        if (this.f3048e != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.f3048e = i2;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i2) {
        int i3 = i2 & 8388615;
        int i4 = this.f3048e;
        if ((8388615 & i4) != i3) {
            this.f3048e = i3 | ((-8388616) & i4);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z2) {
        this.f3051h = z2;
    }

    public void setOrientation(int i2) {
        if (this.f3047d != i2) {
            this.f3047d = i2;
            requestLayout();
        }
    }

    public void setShowDividers(int i2) {
        if (i2 != this.f3057n) {
            requestLayout();
        }
        this.f3057n = i2;
    }

    public void setVerticalGravity(int i2) {
        int i3 = i2 & 112;
        int i4 = this.f3048e;
        if ((i4 & 112) != i3) {
            this.f3048e = i3 | (i4 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f2) {
        this.f3050g = java.lang.Math.max(0.0f, f2);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
