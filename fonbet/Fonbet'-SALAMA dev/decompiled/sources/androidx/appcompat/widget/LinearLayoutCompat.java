package androidx.appcompat.widget;

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
import h.AbstractC1174a;
import java.util.WeakHashMap;
import w1.C1726n0;

/* loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {

    /* renamed from: A, reason: collision with root package name */
    public int[] f8365A;

    /* renamed from: B, reason: collision with root package name */
    public Drawable f8366B;

    /* renamed from: C, reason: collision with root package name */
    public int f8367C;

    /* renamed from: D, reason: collision with root package name */
    public int f8368D;

    /* renamed from: E, reason: collision with root package name */
    public int f8369E;

    /* renamed from: F, reason: collision with root package name */
    public int f8370F;

    /* renamed from: a, reason: collision with root package name */
    public boolean f8371a;

    /* renamed from: b, reason: collision with root package name */
    public int f8372b;

    /* renamed from: c, reason: collision with root package name */
    public int f8373c;

    /* renamed from: d, reason: collision with root package name */
    public int f8374d;

    /* renamed from: e, reason: collision with root package name */
    public int f8375e;

    /* renamed from: f, reason: collision with root package name */
    public int f8376f;

    /* renamed from: x, reason: collision with root package name */
    public float f8377x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f8378y;

    /* renamed from: z, reason: collision with root package name */
    public int[] f8379z;

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f8371a = true;
        this.f8372b = -1;
        this.f8373c = 0;
        this.f8375e = 8388659;
        int[] iArr = AbstractC1174a.f13336o;
        C1726n0 F7 = C1726n0.F(context, attributeSet, iArr, i7);
        P.U.g(this, context, iArr, attributeSet, (TypedArray) F7.f17806c, i7);
        TypedArray typedArray = (TypedArray) F7.f17806c;
        int i8 = typedArray.getInt(1, -1);
        if (i8 >= 0) {
            setOrientation(i8);
        }
        int i9 = typedArray.getInt(0, -1);
        if (i9 >= 0) {
            setGravity(i9);
        }
        boolean z4 = typedArray.getBoolean(2, true);
        if (!z4) {
            setBaselineAligned(z4);
        }
        this.f8377x = typedArray.getFloat(4, -1.0f);
        this.f8372b = typedArray.getInt(3, -1);
        this.f8378y = typedArray.getBoolean(7, false);
        setDividerDrawable(F7.u(5));
        this.f8369E = typedArray.getInt(8, 0);
        this.f8370F = typedArray.getDimensionPixelSize(6, 0);
        F7.H();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0657p0;
    }

    public final void e(Canvas canvas, int i7) {
        this.f8366B.setBounds(getPaddingLeft() + this.f8370F, i7, (getWidth() - getPaddingRight()) - this.f8370F, this.f8368D + i7);
        this.f8366B.draw(canvas);
    }

    public final void f(Canvas canvas, int i7) {
        this.f8366B.setBounds(i7, getPaddingTop() + this.f8370F, this.f8367C + i7, (getHeight() - getPaddingBottom()) - this.f8370F);
        this.f8366B.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C0657p0 generateDefaultLayoutParams() {
        int i7 = this.f8374d;
        if (i7 == 0) {
            return new C0657p0(-2, -2);
        }
        if (i7 == 1) {
            return new C0657p0(-1, -2);
        }
        return null;
    }

    @Override // android.view.View
    public int getBaseline() {
        int i7;
        if (this.f8372b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i8 = this.f8372b;
        if (childCount <= i8) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i8);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f8372b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i9 = this.f8373c;
        if (this.f8374d == 1 && (i7 = this.f8375e & 112) != 48) {
            if (i7 == 16) {
                i9 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f8376f) / 2;
            } else if (i7 == 80) {
                i9 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f8376f;
            }
        }
        return i9 + ((LinearLayout.LayoutParams) ((C0657p0) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f8372b;
    }

    public Drawable getDividerDrawable() {
        return this.f8366B;
    }

    public int getDividerPadding() {
        return this.f8370F;
    }

    public int getDividerWidth() {
        return this.f8367C;
    }

    public int getGravity() {
        return this.f8375e;
    }

    public int getOrientation() {
        return this.f8374d;
    }

    public int getShowDividers() {
        return this.f8369E;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f8377x;
    }

    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C0657p0 generateLayoutParams(AttributeSet attributeSet) {
        return new C0657p0(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public C0657p0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0657p0(layoutParams);
    }

    public final boolean j(int i7) {
        if (i7 == 0) {
            return (this.f8369E & 1) != 0;
        }
        if (i7 == getChildCount()) {
            return (this.f8369E & 4) != 0;
        }
        if ((this.f8369E & 2) == 0) {
            return false;
        }
        for (int i8 = i7 - 1; i8 >= 0; i8--) {
            if (getChildAt(i8).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i7;
        if (this.f8366B == null) {
            return;
        }
        int i8 = 0;
        if (this.f8374d == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i8 < virtualChildCount) {
                View childAt = getChildAt(i8);
                if (childAt != null && childAt.getVisibility() != 8 && j(i8)) {
                    e(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((C0657p0) childAt.getLayoutParams())).topMargin) - this.f8368D);
                }
                i8++;
            }
            if (j(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                e(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f8368D : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((C0657p0) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean a2 = q1.a(this);
        while (i8 < virtualChildCount2) {
            View childAt3 = getChildAt(i8);
            if (childAt3 != null && childAt3.getVisibility() != 8 && j(i8)) {
                C0657p0 c0657p0 = (C0657p0) childAt3.getLayoutParams();
                f(canvas, a2 ? childAt3.getRight() + ((LinearLayout.LayoutParams) c0657p0).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) c0657p0).leftMargin) - this.f8367C);
            }
            i8++;
        }
        if (j(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                C0657p0 c0657p02 = (C0657p0) childAt4.getLayoutParams();
                if (a2) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) c0657p02).leftMargin;
                    i7 = this.f8367C;
                    right = left - i7;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) c0657p02).rightMargin;
                }
            } else if (a2) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i7 = this.f8367C;
                right = left - i7;
            }
            f(canvas, right);
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

    /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018c  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z4, int i7, int i8, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25 = 8;
        if (this.f8374d == 1) {
            int paddingLeft = getPaddingLeft();
            int i26 = i9 - i7;
            int paddingRight = i26 - getPaddingRight();
            int paddingRight2 = (i26 - paddingLeft) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i27 = this.f8375e;
            int i28 = i27 & 112;
            int i29 = 8388615 & i27;
            int paddingTop = i28 != 16 ? i28 != 80 ? getPaddingTop() : ((getPaddingTop() + i10) - i8) - this.f8376f : getPaddingTop() + (((i10 - i8) - this.f8376f) / 2);
            int i30 = 0;
            while (i30 < virtualChildCount) {
                View childAt = getChildAt(i30);
                if (childAt != null && childAt.getVisibility() != i25) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    C0657p0 c0657p0 = (C0657p0) childAt.getLayoutParams();
                    int i31 = ((LinearLayout.LayoutParams) c0657p0).gravity;
                    if (i31 < 0) {
                        i31 = i29;
                    }
                    WeakHashMap weakHashMap = P.U.f5037a;
                    int absoluteGravity = Gravity.getAbsoluteGravity(i31, getLayoutDirection()) & 7;
                    if (absoluteGravity == 1) {
                        i22 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) c0657p0).leftMargin;
                        i23 = ((LinearLayout.LayoutParams) c0657p0).rightMargin;
                    } else if (absoluteGravity != 5) {
                        i24 = ((LinearLayout.LayoutParams) c0657p0).leftMargin + paddingLeft;
                        if (j(i30)) {
                            paddingTop += this.f8368D;
                        }
                        int i32 = paddingTop + ((LinearLayout.LayoutParams) c0657p0).topMargin;
                        childAt.layout(i24, i32, measuredWidth + i24, i32 + measuredHeight);
                        paddingTop = measuredHeight + ((LinearLayout.LayoutParams) c0657p0).bottomMargin + i32;
                    } else {
                        i22 = paddingRight - measuredWidth;
                        i23 = ((LinearLayout.LayoutParams) c0657p0).rightMargin;
                    }
                    i24 = i22 - i23;
                    if (j(i30)) {
                    }
                    int i322 = paddingTop + ((LinearLayout.LayoutParams) c0657p0).topMargin;
                    childAt.layout(i24, i322, measuredWidth + i24, i322 + measuredHeight);
                    paddingTop = measuredHeight + ((LinearLayout.LayoutParams) c0657p0).bottomMargin + i322;
                }
                i30++;
                i25 = 8;
            }
            return;
        }
        boolean a2 = q1.a(this);
        int paddingTop2 = getPaddingTop();
        int i33 = i10 - i8;
        int paddingBottom = i33 - getPaddingBottom();
        int paddingBottom2 = (i33 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i34 = this.f8375e;
        int i35 = 8388615 & i34;
        int i36 = i34 & 112;
        boolean z7 = this.f8371a;
        int[] iArr = this.f8379z;
        int[] iArr2 = this.f8365A;
        WeakHashMap weakHashMap2 = P.U.f5037a;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i35, getLayoutDirection());
        int paddingLeft2 = absoluteGravity2 != 1 ? absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i9) - i7) - this.f8376f : getPaddingLeft() + (((i9 - i7) - this.f8376f) / 2);
        if (a2) {
            i12 = virtualChildCount2 - 1;
            i11 = -1;
        } else {
            i11 = 1;
            i12 = 0;
        }
        int i37 = 0;
        while (i37 < virtualChildCount2) {
            int i38 = (i11 * i37) + i12;
            View childAt2 = getChildAt(i38);
            if (childAt2 == null) {
                i13 = i12;
                i14 = i11;
                i15 = virtualChildCount2;
                i16 = i36;
                i17 = 1;
            } else {
                i13 = i12;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight2 = childAt2.getMeasuredHeight();
                    C0657p0 c0657p02 = (C0657p0) childAt2.getLayoutParams();
                    i14 = i11;
                    if (z7) {
                        i15 = virtualChildCount2;
                        if (((LinearLayout.LayoutParams) c0657p02).height != -1) {
                            i18 = childAt2.getBaseline();
                            i19 = ((LinearLayout.LayoutParams) c0657p02).gravity;
                            if (i19 < 0) {
                                i19 = i36;
                            }
                            i20 = i19 & 112;
                            i16 = i36;
                            if (i20 != 16) {
                                i21 = ((((paddingBottom2 - measuredHeight2) / 2) + paddingTop2) + ((LinearLayout.LayoutParams) c0657p02).topMargin) - ((LinearLayout.LayoutParams) c0657p02).bottomMargin;
                            } else if (i20 == 48) {
                                i21 = ((LinearLayout.LayoutParams) c0657p02).topMargin + paddingTop2;
                                if (i18 != -1) {
                                    i21 = (iArr[1] - i18) + i21;
                                }
                            } else if (i20 != 80) {
                                i21 = paddingTop2;
                            } else {
                                i21 = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) c0657p02).bottomMargin;
                                if (i18 != -1) {
                                    i21 -= iArr2[2] - (childAt2.getMeasuredHeight() - i18);
                                }
                            }
                            if (j(i38)) {
                                paddingLeft2 += this.f8367C;
                            }
                            int i39 = paddingLeft2 + ((LinearLayout.LayoutParams) c0657p02).leftMargin;
                            childAt2.layout(i39, i21, i39 + measuredWidth2, i21 + measuredHeight2);
                            paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) c0657p02).rightMargin + i39;
                        }
                    } else {
                        i15 = virtualChildCount2;
                    }
                    i18 = -1;
                    i19 = ((LinearLayout.LayoutParams) c0657p02).gravity;
                    if (i19 < 0) {
                    }
                    i20 = i19 & 112;
                    i16 = i36;
                    if (i20 != 16) {
                    }
                    if (j(i38)) {
                    }
                    int i392 = paddingLeft2 + ((LinearLayout.LayoutParams) c0657p02).leftMargin;
                    childAt2.layout(i392, i21, i392 + measuredWidth2, i21 + measuredHeight2);
                    paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) c0657p02).rightMargin + i392;
                } else {
                    i14 = i11;
                    i15 = virtualChildCount2;
                    i16 = i36;
                }
                i17 = 1;
            }
            i37 += i17;
            i12 = i13;
            i11 = i14;
            virtualChildCount2 = i15;
            i36 = i16;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x02e0, code lost:
    
        if (((android.widget.LinearLayout.LayoutParams) r13).width == (-1)) goto L148;
     */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0860  */
    /* JADX WARN: Removed duplicated region for block: B:352:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x06b4  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i7, int i8) {
        char c3;
        int i9;
        int max;
        float f7;
        int i10;
        int i11;
        int i12;
        int i13;
        char c4;
        int i14;
        int i15;
        int i16;
        int i17;
        float f8;
        int i18;
        int i19;
        boolean z4;
        int baseline;
        int i20;
        int i21;
        float f9;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        boolean z7;
        boolean z8;
        C0657p0 c0657p0;
        boolean z9;
        int i27;
        boolean z10;
        int i28;
        int i29;
        int baseline2;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        boolean z11;
        C0657p0 c0657p02;
        boolean z12;
        int i39;
        boolean z13;
        int max2;
        int i40 = -2;
        int i41 = 1073741824;
        int i42 = 8;
        int i43 = Integer.MIN_VALUE;
        float f10 = 0.0f;
        boolean z14 = true;
        if (this.f8374d == 1) {
            this.f8376f = 0;
            int virtualChildCount = getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i7);
            int mode2 = View.MeasureSpec.getMode(i8);
            int i44 = this.f8372b;
            boolean z15 = this.f8378y;
            boolean z16 = true;
            int i45 = 0;
            int i46 = 0;
            int i47 = 0;
            boolean z17 = false;
            int i48 = 0;
            int i49 = 0;
            int i50 = 0;
            boolean z18 = false;
            float f11 = 0.0f;
            while (i45 < virtualChildCount) {
                View childAt = getChildAt(i45);
                if (childAt == null) {
                    this.f8376f = this.f8376f;
                } else if (childAt.getVisibility() != i42) {
                    if (j(i45)) {
                        this.f8376f += this.f8368D;
                    }
                    C0657p0 c0657p03 = (C0657p0) childAt.getLayoutParams();
                    float f12 = ((LinearLayout.LayoutParams) c0657p03).weight;
                    f11 += f12;
                    if (mode2 == i41 && ((LinearLayout.LayoutParams) c0657p03).height == 0 && f12 > f10) {
                        int i51 = this.f8376f;
                        this.f8376f = Math.max(i51, ((LinearLayout.LayoutParams) c0657p03).topMargin + i51 + ((LinearLayout.LayoutParams) c0657p03).bottomMargin);
                        i35 = i44;
                        i36 = mode2;
                        i37 = mode;
                        i38 = virtualChildCount;
                        c0657p02 = c0657p03;
                        z12 = true;
                        z11 = true;
                    } else {
                        if (((LinearLayout.LayoutParams) c0657p03).height != 0 || f12 <= f10) {
                            i34 = i43;
                        } else {
                            ((LinearLayout.LayoutParams) c0657p03).height = i40;
                            i34 = 0;
                        }
                        int i52 = f11 == f10 ? this.f8376f : 0;
                        i35 = i44;
                        i36 = mode2;
                        i37 = mode;
                        i38 = virtualChildCount;
                        z11 = true;
                        c0657p02 = c0657p03;
                        measureChildWithMargins(childAt, i7, 0, i8, i52);
                        if (i34 != i43) {
                            ((LinearLayout.LayoutParams) c0657p02).height = i34;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i53 = this.f8376f;
                        this.f8376f = Math.max(i53, i53 + measuredHeight + ((LinearLayout.LayoutParams) c0657p02).topMargin + ((LinearLayout.LayoutParams) c0657p02).bottomMargin);
                        int i54 = i48;
                        if (z15) {
                            i48 = Math.max(measuredHeight, i54);
                        }
                        z12 = z17;
                    }
                    if (i35 >= 0 && i35 == i45 + 1) {
                        this.f8373c = this.f8376f;
                    }
                    if (i45 < i35 && ((LinearLayout.LayoutParams) c0657p02).weight > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    i39 = i37;
                    if (i39 == 1073741824 || ((LinearLayout.LayoutParams) c0657p02).width != -1) {
                        z13 = false;
                    } else {
                        z13 = z11;
                        z18 = z13;
                    }
                    int i55 = ((LinearLayout.LayoutParams) c0657p02).leftMargin + ((LinearLayout.LayoutParams) c0657p02).rightMargin;
                    int measuredWidth = childAt.getMeasuredWidth() + i55;
                    max2 = Math.max(i49, measuredWidth);
                    int combineMeasuredStates = View.combineMeasuredStates(i50, childAt.getMeasuredState());
                    boolean z19 = (z16 && ((LinearLayout.LayoutParams) c0657p02).width == -1) ? z11 : false;
                    if (((LinearLayout.LayoutParams) c0657p02).weight > 0.0f) {
                        if (!z13) {
                            i55 = measuredWidth;
                        }
                        i47 = Math.max(i47, i55);
                    } else {
                        int i56 = i47;
                        if (!z13) {
                            i55 = measuredWidth;
                        }
                        i46 = Math.max(i46, i55);
                        i47 = i56;
                    }
                    z17 = z12;
                    i50 = combineMeasuredStates;
                    z16 = z19;
                    i45++;
                    mode = i39;
                    i49 = max2;
                    i44 = i35;
                    z14 = z11;
                    mode2 = i36;
                    virtualChildCount = i38;
                    i40 = -2;
                    i41 = 1073741824;
                    i42 = 8;
                    i43 = Integer.MIN_VALUE;
                    f10 = 0.0f;
                }
                i35 = i44;
                i36 = mode2;
                i39 = mode;
                i38 = virtualChildCount;
                max2 = i49;
                z11 = true;
                i45++;
                mode = i39;
                i49 = max2;
                i44 = i35;
                z14 = z11;
                mode2 = i36;
                virtualChildCount = i38;
                i40 = -2;
                i41 = 1073741824;
                i42 = 8;
                i43 = Integer.MIN_VALUE;
                f10 = 0.0f;
            }
            int i57 = mode2;
            int i58 = mode;
            int i59 = virtualChildCount;
            boolean z20 = z14;
            int i60 = i46;
            int i61 = i47;
            int i62 = i48;
            int i63 = i49;
            int i64 = i50;
            if (this.f8376f > 0 && j(i59)) {
                this.f8376f += this.f8368D;
            }
            int i65 = i57;
            if (z15 && (i65 == Integer.MIN_VALUE || i65 == 0)) {
                this.f8376f = 0;
                for (int i66 = 0; i66 < i59; i66++) {
                    View childAt2 = getChildAt(i66);
                    if (childAt2 == null) {
                        this.f8376f = this.f8376f;
                    } else if (childAt2.getVisibility() != 8) {
                        C0657p0 c0657p04 = (C0657p0) childAt2.getLayoutParams();
                        int i67 = this.f8376f;
                        this.f8376f = Math.max(i67, i67 + i62 + ((LinearLayout.LayoutParams) c0657p04).topMargin + ((LinearLayout.LayoutParams) c0657p04).bottomMargin);
                    }
                }
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop() + this.f8376f;
            this.f8376f = paddingBottom;
            int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i8, 0);
            int i68 = (16777215 & resolveSizeAndState) - this.f8376f;
            if (z17 || (i68 != 0 && f11 > 0.0f)) {
                float f13 = this.f8377x;
                if (f13 > 0.0f) {
                    f11 = f13;
                }
                this.f8376f = 0;
                int i69 = 0;
                while (i69 < i59) {
                    View childAt3 = getChildAt(i69);
                    if (childAt3.getVisibility() == 8) {
                        i31 = i65;
                    } else {
                        C0657p0 c0657p05 = (C0657p0) childAt3.getLayoutParams();
                        float f14 = ((LinearLayout.LayoutParams) c0657p05).weight;
                        if (f14 > 0.0f) {
                            int i70 = (int) ((i68 * f14) / f11);
                            f11 -= f14;
                            int i71 = i68 - i70;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft() + ((LinearLayout.LayoutParams) c0657p05).leftMargin + ((LinearLayout.LayoutParams) c0657p05).rightMargin, ((LinearLayout.LayoutParams) c0657p05).width);
                            if (((LinearLayout.LayoutParams) c0657p05).height == 0) {
                                i33 = 1073741824;
                                if (i65 == 1073741824) {
                                    if (i70 <= 0) {
                                        i70 = 0;
                                    }
                                    childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i70, 1073741824));
                                    i64 = View.combineMeasuredStates(i64, childAt3.getMeasuredState() & (-256));
                                    i68 = i71;
                                }
                            } else {
                                i33 = 1073741824;
                            }
                            int measuredHeight2 = childAt3.getMeasuredHeight() + i70;
                            if (measuredHeight2 < 0) {
                                measuredHeight2 = 0;
                            }
                            childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, i33));
                            i64 = View.combineMeasuredStates(i64, childAt3.getMeasuredState() & (-256));
                            i68 = i71;
                        }
                        int i72 = ((LinearLayout.LayoutParams) c0657p05).leftMargin + ((LinearLayout.LayoutParams) c0657p05).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i72;
                        int max3 = Math.max(i63, measuredWidth2);
                        if (i58 != 1073741824) {
                            i31 = i65;
                            i32 = -1;
                        } else {
                            i31 = i65;
                            i32 = -1;
                        }
                        i72 = measuredWidth2;
                        i60 = Math.max(i60, i72);
                        boolean z21 = (z16 && ((LinearLayout.LayoutParams) c0657p05).width == i32) ? z20 : false;
                        int i73 = this.f8376f;
                        this.f8376f = Math.max(i73, childAt3.getMeasuredHeight() + i73 + ((LinearLayout.LayoutParams) c0657p05).topMargin + ((LinearLayout.LayoutParams) c0657p05).bottomMargin);
                        z16 = z21;
                        i63 = max3;
                    }
                    i69++;
                    i65 = i31;
                }
                this.f8376f = getPaddingBottom() + getPaddingTop() + this.f8376f;
            } else {
                i60 = Math.max(i60, i61);
                if (z15 && i65 != 1073741824) {
                    for (int i74 = 0; i74 < i59; i74++) {
                        View childAt4 = getChildAt(i74);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((C0657p0) childAt4.getLayoutParams())).weight > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i62, 1073741824));
                        }
                    }
                }
            }
            int i75 = i63;
            if (z16 || i58 == 1073741824) {
                i60 = i75;
            }
            setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + i60, getSuggestedMinimumWidth()), i7, i64), resolveSizeAndState);
            if (z18) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                for (int i76 = 0; i76 < i59; i76++) {
                    View childAt5 = getChildAt(i76);
                    if (childAt5.getVisibility() != 8) {
                        C0657p0 c0657p06 = (C0657p0) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) c0657p06).width == -1) {
                            int i77 = ((LinearLayout.LayoutParams) c0657p06).height;
                            ((LinearLayout.LayoutParams) c0657p06).height = childAt5.getMeasuredHeight();
                            measureChildWithMargins(childAt5, makeMeasureSpec, 0, i8, 0);
                            ((LinearLayout.LayoutParams) c0657p06).height = i77;
                        }
                    }
                }
                return;
            }
            return;
        }
        this.f8376f = 0;
        int virtualChildCount2 = getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i7);
        int mode4 = View.MeasureSpec.getMode(i8);
        if (this.f8379z == null || this.f8365A == null) {
            this.f8379z = new int[4];
            this.f8365A = new int[4];
        }
        int[] iArr = this.f8379z;
        int[] iArr2 = this.f8365A;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z22 = this.f8371a;
        boolean z23 = this.f8378y;
        boolean z24 = mode3 == 1073741824;
        boolean z25 = true;
        int i78 = 0;
        float f15 = 0.0f;
        int i79 = 0;
        int i80 = 0;
        int i81 = 0;
        int i82 = 0;
        int i83 = 0;
        boolean z26 = false;
        boolean z27 = false;
        while (i80 < virtualChildCount2) {
            View childAt6 = getChildAt(i80);
            if (childAt6 == null) {
                this.f8376f = this.f8376f;
                i26 = i80;
                z7 = z23;
                z8 = z22;
            } else {
                int i84 = i78;
                int i85 = i79;
                if (childAt6.getVisibility() == 8) {
                    z8 = z22;
                    i78 = i84;
                    i79 = i85;
                    i26 = i80;
                    z7 = z23;
                } else {
                    if (j(i80)) {
                        this.f8376f += this.f8367C;
                    }
                    C0657p0 c0657p07 = (C0657p0) childAt6.getLayoutParams();
                    float f16 = ((LinearLayout.LayoutParams) c0657p07).weight;
                    float f17 = f15 + f16;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) c0657p07).width == 0 && f16 > 0.0f) {
                        if (z24) {
                            i30 = i80;
                            this.f8376f = ((LinearLayout.LayoutParams) c0657p07).leftMargin + ((LinearLayout.LayoutParams) c0657p07).rightMargin + this.f8376f;
                        } else {
                            i30 = i80;
                            int i86 = this.f8376f;
                            this.f8376f = Math.max(i86, ((LinearLayout.LayoutParams) c0657p07).leftMargin + i86 + ((LinearLayout.LayoutParams) c0657p07).rightMargin);
                        }
                        if (z22) {
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(makeMeasureSpec2, makeMeasureSpec2);
                            c0657p0 = c0657p07;
                            i23 = i84;
                            i24 = i85;
                            i26 = i30;
                            z7 = z23;
                            z8 = z22;
                        } else {
                            c0657p0 = c0657p07;
                            i23 = i84;
                            i24 = i85;
                            i26 = i30;
                            i27 = 1073741824;
                            z7 = z23;
                            z8 = z22;
                            z9 = true;
                            if (mode4 == i27 && ((LinearLayout.LayoutParams) c0657p0).height == -1) {
                                z10 = true;
                                z27 = true;
                            } else {
                                z10 = false;
                            }
                            i28 = ((LinearLayout.LayoutParams) c0657p0).topMargin + ((LinearLayout.LayoutParams) c0657p0).bottomMargin;
                            int measuredHeight3 = childAt6.getMeasuredHeight() + i28;
                            int combineMeasuredStates2 = View.combineMeasuredStates(i81, childAt6.getMeasuredState());
                            if (z8 || (baseline2 = childAt6.getBaseline()) == -1) {
                                i29 = i28;
                            } else {
                                int i87 = ((LinearLayout.LayoutParams) c0657p0).gravity;
                                if (i87 < 0) {
                                    i87 = this.f8375e;
                                }
                                int i88 = (((i87 & 112) >> 4) & (-2)) >> 1;
                                i29 = i28;
                                iArr[i88] = Math.max(iArr[i88], baseline2);
                                iArr2[i88] = Math.max(iArr2[i88], measuredHeight3 - baseline2);
                            }
                            int max4 = Math.max(i24, measuredHeight3);
                            boolean z28 = !z25 && ((LinearLayout.LayoutParams) c0657p0).height == -1;
                            if (((LinearLayout.LayoutParams) c0657p0).weight <= 0.0f) {
                                if (z10) {
                                    measuredHeight3 = i29;
                                }
                                i83 = Math.max(i83, measuredHeight3);
                                i78 = i23;
                            } else {
                                if (z10) {
                                    measuredHeight3 = i29;
                                }
                                i78 = Math.max(i23, measuredHeight3);
                            }
                            i79 = max4;
                            i81 = combineMeasuredStates2;
                            z26 = z9;
                            z25 = z28;
                            f15 = f17;
                        }
                    } else {
                        int i89 = i80;
                        if (((LinearLayout.LayoutParams) c0657p07).width == 0) {
                            f9 = 0.0f;
                            if (f16 > 0.0f) {
                                ((LinearLayout.LayoutParams) c0657p07).width = -2;
                                i22 = 0;
                                i23 = i84;
                                i24 = i85;
                                i25 = i22;
                                i26 = i89;
                                z7 = z23;
                                z8 = z22;
                                measureChildWithMargins(childAt6, i7, f17 != f9 ? this.f8376f : 0, i8, 0);
                                if (i25 == Integer.MIN_VALUE) {
                                    c0657p0 = c0657p07;
                                    ((LinearLayout.LayoutParams) c0657p0).width = i25;
                                } else {
                                    c0657p0 = c0657p07;
                                }
                                int measuredWidth3 = childAt6.getMeasuredWidth();
                                if (z24) {
                                    int i90 = this.f8376f;
                                    this.f8376f = Math.max(i90, i90 + measuredWidth3 + ((LinearLayout.LayoutParams) c0657p0).leftMargin + ((LinearLayout.LayoutParams) c0657p0).rightMargin);
                                } else {
                                    this.f8376f = ((LinearLayout.LayoutParams) c0657p0).leftMargin + measuredWidth3 + ((LinearLayout.LayoutParams) c0657p0).rightMargin + this.f8376f;
                                }
                                if (z7) {
                                    i82 = Math.max(measuredWidth3, i82);
                                }
                            }
                        } else {
                            f9 = 0.0f;
                        }
                        i22 = Integer.MIN_VALUE;
                        i23 = i84;
                        i24 = i85;
                        i25 = i22;
                        i26 = i89;
                        z7 = z23;
                        z8 = z22;
                        measureChildWithMargins(childAt6, i7, f17 != f9 ? this.f8376f : 0, i8, 0);
                        if (i25 == Integer.MIN_VALUE) {
                        }
                        int measuredWidth32 = childAt6.getMeasuredWidth();
                        if (z24) {
                        }
                        if (z7) {
                        }
                    }
                    z9 = z26;
                    i27 = 1073741824;
                    if (mode4 == i27) {
                    }
                    z10 = false;
                    i28 = ((LinearLayout.LayoutParams) c0657p0).topMargin + ((LinearLayout.LayoutParams) c0657p0).bottomMargin;
                    int measuredHeight32 = childAt6.getMeasuredHeight() + i28;
                    int combineMeasuredStates22 = View.combineMeasuredStates(i81, childAt6.getMeasuredState());
                    if (z8) {
                    }
                    i29 = i28;
                    int max42 = Math.max(i24, measuredHeight32);
                    if (z25) {
                    }
                    if (((LinearLayout.LayoutParams) c0657p0).weight <= 0.0f) {
                    }
                    i79 = max42;
                    i81 = combineMeasuredStates22;
                    z26 = z9;
                    z25 = z28;
                    f15 = f17;
                }
            }
            i80 = i26 + 1;
            z23 = z7;
            z22 = z8;
        }
        int i91 = i79;
        boolean z29 = z23;
        boolean z30 = z22;
        if (this.f8376f > 0 && j(virtualChildCount2)) {
            this.f8376f += this.f8367C;
        }
        int i92 = iArr[1];
        if (i92 == -1 && iArr[0] == -1 && iArr[2] == -1) {
            c3 = 3;
            if (iArr[3] == -1) {
                max = i91;
                i9 = i81;
                if (z29 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
                    this.f8376f = 0;
                    for (i21 = 0; i21 < virtualChildCount2; i21++) {
                        View childAt7 = getChildAt(i21);
                        if (childAt7 == null) {
                            this.f8376f = this.f8376f;
                        } else if (childAt7.getVisibility() != 8) {
                            C0657p0 c0657p08 = (C0657p0) childAt7.getLayoutParams();
                            if (z24) {
                                this.f8376f = ((LinearLayout.LayoutParams) c0657p08).leftMargin + i82 + ((LinearLayout.LayoutParams) c0657p08).rightMargin + this.f8376f;
                            } else {
                                int i93 = this.f8376f;
                                this.f8376f = Math.max(i93, i93 + i82 + ((LinearLayout.LayoutParams) c0657p08).leftMargin + ((LinearLayout.LayoutParams) c0657p08).rightMargin);
                            }
                        }
                    }
                }
                int paddingRight = getPaddingRight() + getPaddingLeft() + this.f8376f;
                this.f8376f = paddingRight;
                int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i7, 0);
                int i94 = (16777215 & resolveSizeAndState2) - this.f8376f;
                if (!z26 || (i94 != 0 && f15 > 0.0f)) {
                    f7 = this.f8377x;
                    if (f7 > 0.0f) {
                        f15 = f7;
                    }
                    iArr[3] = -1;
                    iArr[2] = -1;
                    iArr[1] = -1;
                    iArr[0] = -1;
                    iArr2[3] = -1;
                    iArr2[2] = -1;
                    iArr2[1] = -1;
                    iArr2[0] = -1;
                    this.f8376f = 0;
                    int i95 = i9;
                    max = -1;
                    i10 = 0;
                    while (i10 < virtualChildCount2) {
                        View childAt8 = getChildAt(i10);
                        if (childAt8 == null || childAt8.getVisibility() == 8) {
                            i15 = i94;
                            i16 = virtualChildCount2;
                        } else {
                            C0657p0 c0657p09 = (C0657p0) childAt8.getLayoutParams();
                            float f18 = ((LinearLayout.LayoutParams) c0657p09).weight;
                            if (f18 > 0.0f) {
                                i16 = virtualChildCount2;
                                int i96 = (int) ((i94 * f18) / f15);
                                float f19 = f15 - f18;
                                int i97 = i94 - i96;
                                int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i8, getPaddingBottom() + getPaddingTop() + ((LinearLayout.LayoutParams) c0657p09).topMargin + ((LinearLayout.LayoutParams) c0657p09).bottomMargin, ((LinearLayout.LayoutParams) c0657p09).height);
                                if (((LinearLayout.LayoutParams) c0657p09).width == 0) {
                                    i20 = 1073741824;
                                    if (mode3 == 1073741824) {
                                        if (i96 <= 0) {
                                            i96 = 0;
                                        }
                                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(i96, 1073741824), childMeasureSpec2);
                                        i95 = View.combineMeasuredStates(i95, childAt8.getMeasuredState() & (-16777216));
                                        f15 = f19;
                                        i17 = i97;
                                    }
                                } else {
                                    i20 = 1073741824;
                                }
                                int measuredWidth4 = childAt8.getMeasuredWidth() + i96;
                                if (measuredWidth4 < 0) {
                                    measuredWidth4 = 0;
                                }
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i20), childMeasureSpec2);
                                i95 = View.combineMeasuredStates(i95, childAt8.getMeasuredState() & (-16777216));
                                f15 = f19;
                                i17 = i97;
                            } else {
                                i17 = i94;
                                i16 = virtualChildCount2;
                            }
                            if (z24) {
                                f8 = f15;
                                this.f8376f = childAt8.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0657p09).leftMargin + ((LinearLayout.LayoutParams) c0657p09).rightMargin + this.f8376f;
                                i18 = i17;
                            } else {
                                f8 = f15;
                                int i98 = this.f8376f;
                                i18 = i17;
                                this.f8376f = Math.max(i98, childAt8.getMeasuredWidth() + i98 + ((LinearLayout.LayoutParams) c0657p09).leftMargin + ((LinearLayout.LayoutParams) c0657p09).rightMargin);
                            }
                            boolean z31 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) c0657p09).height == -1;
                            int i99 = ((LinearLayout.LayoutParams) c0657p09).topMargin + ((LinearLayout.LayoutParams) c0657p09).bottomMargin;
                            int measuredHeight4 = childAt8.getMeasuredHeight() + i99;
                            max = Math.max(max, measuredHeight4);
                            if (!z31) {
                                i99 = measuredHeight4;
                            }
                            i78 = Math.max(i78, i99);
                            if (z25) {
                                i19 = -1;
                                if (((LinearLayout.LayoutParams) c0657p09).height == -1) {
                                    z4 = true;
                                    if (!z30 && (baseline = childAt8.getBaseline()) != i19) {
                                        int i100 = ((LinearLayout.LayoutParams) c0657p09).gravity;
                                        if (i100 < 0) {
                                            i100 = this.f8375e;
                                        }
                                        int i101 = (((i100 & 112) >> 4) & (-2)) >> 1;
                                        iArr[i101] = Math.max(iArr[i101], baseline);
                                        iArr2[i101] = Math.max(iArr2[i101], measuredHeight4 - baseline);
                                    }
                                    z25 = z4;
                                    i15 = i18;
                                    f15 = f8;
                                }
                            } else {
                                i19 = -1;
                            }
                            z4 = false;
                            if (!z30) {
                            }
                            z25 = z4;
                            i15 = i18;
                            f15 = f8;
                        }
                        i10++;
                        i94 = i15;
                        virtualChildCount2 = i16;
                    }
                    i11 = i8;
                    i12 = virtualChildCount2;
                    this.f8376f = getPaddingRight() + getPaddingLeft() + this.f8376f;
                    i13 = iArr[1];
                    if (i13 != -1 && iArr[0] == -1 && iArr[2] == -1) {
                        c4 = 3;
                        if (iArr[3] == -1) {
                            i14 = 0;
                            i9 = i95;
                        }
                    } else {
                        c4 = 3;
                    }
                    i14 = 0;
                    max = Math.max(max, Math.max(iArr2[c4], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c4], Math.max(iArr[0], Math.max(i13, iArr[2]))));
                    i9 = i95;
                } else {
                    i78 = Math.max(i78, i83);
                    if (z29 && mode3 != 1073741824) {
                        for (int i102 = 0; i102 < virtualChildCount2; i102++) {
                            View childAt9 = getChildAt(i102);
                            if (childAt9 != null && childAt9.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((C0657p0) childAt9.getLayoutParams())).weight > 0.0f) {
                                childAt9.measure(View.MeasureSpec.makeMeasureSpec(i82, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                            }
                        }
                    }
                    i11 = i8;
                    i12 = virtualChildCount2;
                    i14 = 0;
                }
                if (!z25 || mode4 == 1073741824) {
                    i78 = max;
                }
                setMeasuredDimension((i9 & (-16777216)) | resolveSizeAndState2, View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + i78, getSuggestedMinimumHeight()), i11, i9 << 16));
                if (z27) {
                    return;
                }
                int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
                int i103 = i12;
                while (i14 < i103) {
                    View childAt10 = getChildAt(i14);
                    if (childAt10.getVisibility() != 8) {
                        C0657p0 c0657p010 = (C0657p0) childAt10.getLayoutParams();
                        if (((LinearLayout.LayoutParams) c0657p010).height == -1) {
                            int i104 = ((LinearLayout.LayoutParams) c0657p010).width;
                            ((LinearLayout.LayoutParams) c0657p010).width = childAt10.getMeasuredWidth();
                            measureChildWithMargins(childAt10, i7, 0, makeMeasureSpec3, 0);
                            ((LinearLayout.LayoutParams) c0657p010).width = i104;
                        }
                    }
                    i14++;
                }
                return;
            }
        } else {
            c3 = 3;
        }
        i9 = i81;
        max = Math.max(i91, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c3], Math.max(iArr[0], Math.max(i92, iArr[2]))));
        if (z29) {
            this.f8376f = 0;
            while (i21 < virtualChildCount2) {
            }
        }
        int paddingRight2 = getPaddingRight() + getPaddingLeft() + this.f8376f;
        this.f8376f = paddingRight2;
        int resolveSizeAndState22 = View.resolveSizeAndState(Math.max(paddingRight2, getSuggestedMinimumWidth()), i7, 0);
        int i942 = (16777215 & resolveSizeAndState22) - this.f8376f;
        if (z26) {
        }
        f7 = this.f8377x;
        if (f7 > 0.0f) {
        }
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        this.f8376f = 0;
        int i952 = i9;
        max = -1;
        i10 = 0;
        while (i10 < virtualChildCount2) {
        }
        i11 = i8;
        i12 = virtualChildCount2;
        this.f8376f = getPaddingRight() + getPaddingLeft() + this.f8376f;
        i13 = iArr[1];
        if (i13 != -1) {
        }
        c4 = 3;
        i14 = 0;
        max = Math.max(max, Math.max(iArr2[c4], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c4], Math.max(iArr[0], Math.max(i13, iArr[2]))));
        i9 = i952;
        if (!z25) {
        }
        i78 = max;
        setMeasuredDimension((i9 & (-16777216)) | resolveSizeAndState22, View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + i78, getSuggestedMinimumHeight()), i11, i9 << 16));
        if (z27) {
        }
    }

    public void setBaselineAligned(boolean z4) {
        this.f8371a = z4;
    }

    public void setBaselineAlignedChildIndex(int i7) {
        if (i7 >= 0 && i7 < getChildCount()) {
            this.f8372b = i7;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f8366B) {
            return;
        }
        this.f8366B = drawable;
        if (drawable != null) {
            this.f8367C = drawable.getIntrinsicWidth();
            this.f8368D = drawable.getIntrinsicHeight();
        } else {
            this.f8367C = 0;
            this.f8368D = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i7) {
        this.f8370F = i7;
    }

    public void setGravity(int i7) {
        if (this.f8375e != i7) {
            if ((8388615 & i7) == 0) {
                i7 |= 8388611;
            }
            if ((i7 & 112) == 0) {
                i7 |= 48;
            }
            this.f8375e = i7;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i7) {
        int i8 = i7 & 8388615;
        int i9 = this.f8375e;
        if ((8388615 & i9) != i8) {
            this.f8375e = i8 | ((-8388616) & i9);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z4) {
        this.f8378y = z4;
    }

    public void setOrientation(int i7) {
        if (this.f8374d != i7) {
            this.f8374d = i7;
            requestLayout();
        }
    }

    public void setShowDividers(int i7) {
        if (i7 != this.f8369E) {
            requestLayout();
        }
        this.f8369E = i7;
    }

    public void setVerticalGravity(int i7) {
        int i8 = i7 & 112;
        int i9 = this.f8375e;
        if ((i9 & 112) != i8) {
            this.f8375e = i8 | (i9 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f7) {
        this.f8377x = Math.max(0.0f, f7);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
