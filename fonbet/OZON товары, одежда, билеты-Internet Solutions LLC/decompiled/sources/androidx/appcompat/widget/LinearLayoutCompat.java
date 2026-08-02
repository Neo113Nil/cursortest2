package androidx.appcompat.widget;

import Gl.C3124a;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import i.C6977a;

/* loaded from: classes8.dex */
public class LinearLayoutCompat extends ViewGroup {
    private static final String ACCESSIBILITY_CLASS_NAME = "androidx.appcompat.widget.LinearLayoutCompat";
    public static final int HORIZONTAL = 0;
    private static final int INDEX_BOTTOM = 2;
    private static final int INDEX_CENTER_VERTICAL = 0;
    private static final int INDEX_FILL = 3;
    private static final int INDEX_TOP = 1;
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    public static final int VERTICAL = 1;
    private static final int VERTICAL_GRAVITY_COUNT = 4;
    private boolean mBaselineAligned;
    private int mBaselineAlignedChildIndex;
    private int mBaselineChildTop;
    private Drawable mDivider;
    private int mDividerHeight;
    private int mDividerPadding;
    private int mDividerWidth;
    private int mGravity;
    private int[] mMaxAscent;
    private int[] mMaxDescent;
    private int mOrientation;
    private int mShowDividers;
    private int mTotalLength;
    private boolean mUseLargestChild;
    private float mWeightSum;

    public static class a extends LinearLayout.LayoutParams {
    }

    public LinearLayoutCompat(@NonNull Context context) {
        this(context, null);
    }

    private void forceUniformHeight(int i11, int i12) {
        int i13;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        int i14 = 0;
        while (i14 < i11) {
            View virtualChildAt = getVirtualChildAt(i14);
            if (virtualChildAt.getVisibility() != 8) {
                a aVar = (a) virtualChildAt.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).height == -1) {
                    int i15 = ((LinearLayout.LayoutParams) aVar).width;
                    ((LinearLayout.LayoutParams) aVar).width = virtualChildAt.getMeasuredWidth();
                    i13 = i12;
                    measureChildWithMargins(virtualChildAt, i13, 0, makeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) aVar).width = i15;
                    i14++;
                    i12 = i13;
                }
            }
            i13 = i12;
            i14++;
            i12 = i13;
        }
    }

    private void forceUniformWidth(int i11, int i12) {
        int i13;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int i14 = 0;
        while (i14 < i11) {
            View virtualChildAt = getVirtualChildAt(i14);
            if (virtualChildAt.getVisibility() != 8) {
                a aVar = (a) virtualChildAt.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).width == -1) {
                    int i15 = ((LinearLayout.LayoutParams) aVar).height;
                    ((LinearLayout.LayoutParams) aVar).height = virtualChildAt.getMeasuredHeight();
                    i13 = i12;
                    measureChildWithMargins(virtualChildAt, makeMeasureSpec, 0, i13, 0);
                    ((LinearLayout.LayoutParams) aVar).height = i15;
                    i14++;
                    i12 = i13;
                }
            }
            i13 = i12;
            i14++;
            i12 = i13;
        }
    }

    private void setChildFrame(View view, int i11, int i12, int i13, int i14) {
        view.layout(i11, i12, i13 + i11, i14 + i12);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    void drawDividersHorizontal(Canvas canvas) {
        int right;
        int left;
        int i11;
        int virtualChildCount = getVirtualChildCount();
        int i12 = i0.f37951d;
        boolean z11 = getLayoutDirection() == 1;
        for (int i13 = 0; i13 < virtualChildCount; i13++) {
            View virtualChildAt = getVirtualChildAt(i13);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i13)) {
                a aVar = (a) virtualChildAt.getLayoutParams();
                drawVerticalDivider(canvas, z11 ? virtualChildAt.getRight() + ((LinearLayout.LayoutParams) aVar).rightMargin : (virtualChildAt.getLeft() - ((LinearLayout.LayoutParams) aVar).leftMargin) - this.mDividerWidth);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 != null) {
                a aVar2 = (a) virtualChildAt2.getLayoutParams();
                if (z11) {
                    left = virtualChildAt2.getLeft() - ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    i11 = this.mDividerWidth;
                    right = left - i11;
                } else {
                    right = virtualChildAt2.getRight() + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                }
            } else if (z11) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i11 = this.mDividerWidth;
                right = left - i11;
            }
            drawVerticalDivider(canvas, right);
        }
    }

    void drawDividersVertical(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i11 = 0; i11 < virtualChildCount; i11++) {
            View virtualChildAt = getVirtualChildAt(i11);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i11)) {
                drawHorizontalDivider(canvas, (virtualChildAt.getTop() - ((LinearLayout.LayoutParams) ((a) virtualChildAt.getLayoutParams())).topMargin) - this.mDividerHeight);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            drawHorizontalDivider(canvas, virtualChildAt2 == null ? (getHeight() - getPaddingBottom()) - this.mDividerHeight : virtualChildAt2.getBottom() + ((LinearLayout.LayoutParams) ((a) virtualChildAt2.getLayoutParams())).bottomMargin);
        }
    }

    void drawHorizontalDivider(Canvas canvas, int i11) {
        this.mDivider.setBounds(getPaddingLeft() + this.mDividerPadding, i11, (getWidth() - getPaddingRight()) - this.mDividerPadding, this.mDividerHeight + i11);
        this.mDivider.draw(canvas);
    }

    void drawVerticalDivider(Canvas canvas, int i11) {
        this.mDivider.setBounds(i11, getPaddingTop() + this.mDividerPadding, this.mDividerWidth + i11, (getHeight() - getPaddingBottom()) - this.mDividerPadding);
        this.mDivider.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i11;
        if (this.mBaselineAlignedChildIndex < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i12 = this.mBaselineAlignedChildIndex;
        if (childCount <= i12) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i12);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.mBaselineAlignedChildIndex == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i13 = this.mBaselineChildTop;
        if (this.mOrientation == 1 && (i11 = this.mGravity & 112) != 48) {
            if (i11 == 16) {
                i13 = C3124a.a(((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom(), this.mTotalLength, 2, i13);
            } else if (i11 == 80) {
                i13 = ((getBottom() - getTop()) - getPaddingBottom()) - this.mTotalLength;
            }
        }
        return i13 + ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.mBaselineAlignedChildIndex;
    }

    int getChildrenSkipCount(View view, int i11) {
        return 0;
    }

    public Drawable getDividerDrawable() {
        return this.mDivider;
    }

    public int getDividerPadding() {
        return this.mDividerPadding;
    }

    public int getDividerWidth() {
        return this.mDividerWidth;
    }

    public int getGravity() {
        return this.mGravity;
    }

    int getLocationOffset(View view) {
        return 0;
    }

    int getNextLocationOffset(View view) {
        return 0;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public int getShowDividers() {
        return this.mShowDividers;
    }

    View getVirtualChildAt(int i11) {
        return getChildAt(i11);
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.mWeightSum;
    }

    protected boolean hasDividerBeforeChildAt(int i11) {
        if (i11 == 0) {
            return (this.mShowDividers & 1) != 0;
        }
        if (i11 == getChildCount()) {
            return (this.mShowDividers & 4) != 0;
        }
        if ((this.mShowDividers & 2) != 0) {
            for (int i12 = i11 - 1; i12 >= 0; i12--) {
                if (getChildAt(i12).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isBaselineAligned() {
        return this.mBaselineAligned;
    }

    public boolean isMeasureWithLargestChildEnabled() {
        return this.mUseLargestChild;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void layoutHorizontal(int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        boolean z11;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        int a11;
        int i25;
        boolean z12 = true;
        int i26 = i0.f37951d;
        Object[] objArr = getLayoutDirection() == 1;
        int paddingTop = getPaddingTop();
        int i27 = i14 - i12;
        int paddingBottom = i27 - getPaddingBottom();
        int paddingBottom2 = (i27 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i28 = this.mGravity;
        int i29 = i28 & 112;
        boolean z13 = this.mBaselineAligned;
        int[] iArr = this.mMaxAscent;
        int[] iArr2 = this.mMaxDescent;
        int absoluteGravity = Gravity.getAbsoluteGravity(8388615 & i28, getLayoutDirection());
        int i31 = 2;
        int paddingLeft = absoluteGravity != 1 ? absoluteGravity != 5 ? getPaddingLeft() : ((getPaddingLeft() + i13) - i11) - this.mTotalLength : C3124a.a(i13 - i11, this.mTotalLength, 2, getPaddingLeft());
        if (objArr == true) {
            i15 = virtualChildCount - 1;
            i16 = -1;
        } else {
            i15 = 0;
            i16 = 1;
        }
        int i32 = 0;
        while (i32 < virtualChildCount) {
            int i33 = (i16 * i32) + i15;
            int i34 = i32;
            View virtualChildAt = getVirtualChildAt(i33);
            if (virtualChildAt == null) {
                paddingLeft += measureNullChild(i33);
                i19 = i34;
                z11 = z12;
                i17 = paddingTop;
                i18 = paddingBottom;
            } else {
                z11 = z12;
                int i35 = i31;
                if (virtualChildAt.getVisibility() != 8) {
                    int measuredWidth = virtualChildAt.getMeasuredWidth();
                    int measuredHeight = virtualChildAt.getMeasuredHeight();
                    a aVar = (a) virtualChildAt.getLayoutParams();
                    int i36 = paddingLeft;
                    if (z13) {
                        i21 = measuredWidth;
                        if (((LinearLayout.LayoutParams) aVar).height != -1) {
                            i22 = virtualChildAt.getBaseline();
                            i23 = ((LinearLayout.LayoutParams) aVar).gravity;
                            if (i23 < 0) {
                                i23 = i29;
                            }
                            i24 = i23 & 112;
                            i18 = paddingBottom;
                            if (i24 != 16) {
                                a11 = (C3124a.a(paddingBottom2, measuredHeight, i35, paddingTop) + ((LinearLayout.LayoutParams) aVar).topMargin) - ((LinearLayout.LayoutParams) aVar).bottomMargin;
                            } else if (i24 == 48) {
                                a11 = ((LinearLayout.LayoutParams) aVar).topMargin + paddingTop;
                                if (i22 != -1) {
                                    a11 = (iArr[z11 ? 1 : 0] - i22) + a11;
                                }
                            } else if (i24 != 80) {
                                i25 = paddingTop;
                                int i37 = (hasDividerBeforeChildAt(i33) ? i36 + this.mDividerWidth : i36) + ((LinearLayout.LayoutParams) aVar).leftMargin;
                                i17 = paddingTop;
                                int i38 = i21;
                                setChildFrame(virtualChildAt, getLocationOffset(virtualChildAt) + i37, i25, i38, measuredHeight);
                                int nextLocationOffset = ((LinearLayout.LayoutParams) aVar).rightMargin + i38 + getNextLocationOffset(virtualChildAt) + i37;
                                i19 = getChildrenSkipCount(virtualChildAt, i33) + i34;
                                paddingLeft = nextLocationOffset;
                            } else {
                                a11 = (i18 - measuredHeight) - ((LinearLayout.LayoutParams) aVar).bottomMargin;
                                if (i22 != -1) {
                                    a11 -= iArr2[i35] - (virtualChildAt.getMeasuredHeight() - i22);
                                }
                            }
                            i25 = a11;
                            int i372 = (hasDividerBeforeChildAt(i33) ? i36 + this.mDividerWidth : i36) + ((LinearLayout.LayoutParams) aVar).leftMargin;
                            i17 = paddingTop;
                            int i382 = i21;
                            setChildFrame(virtualChildAt, getLocationOffset(virtualChildAt) + i372, i25, i382, measuredHeight);
                            int nextLocationOffset2 = ((LinearLayout.LayoutParams) aVar).rightMargin + i382 + getNextLocationOffset(virtualChildAt) + i372;
                            i19 = getChildrenSkipCount(virtualChildAt, i33) + i34;
                            paddingLeft = nextLocationOffset2;
                        }
                    } else {
                        i21 = measuredWidth;
                    }
                    i22 = -1;
                    i23 = ((LinearLayout.LayoutParams) aVar).gravity;
                    if (i23 < 0) {
                    }
                    i24 = i23 & 112;
                    i18 = paddingBottom;
                    if (i24 != 16) {
                    }
                    i25 = a11;
                    int i3722 = (hasDividerBeforeChildAt(i33) ? i36 + this.mDividerWidth : i36) + ((LinearLayout.LayoutParams) aVar).leftMargin;
                    i17 = paddingTop;
                    int i3822 = i21;
                    setChildFrame(virtualChildAt, getLocationOffset(virtualChildAt) + i3722, i25, i3822, measuredHeight);
                    int nextLocationOffset22 = ((LinearLayout.LayoutParams) aVar).rightMargin + i3822 + getNextLocationOffset(virtualChildAt) + i3722;
                    i19 = getChildrenSkipCount(virtualChildAt, i33) + i34;
                    paddingLeft = nextLocationOffset22;
                } else {
                    i17 = paddingTop;
                    i18 = paddingBottom;
                    i19 = i34;
                }
            }
            i32 = i19 + 1;
            z12 = z11;
            paddingBottom = i18;
            paddingTop = i17;
            i31 = 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void layoutVertical(int i11, int i12, int i13, int i14) {
        int a11;
        int i15;
        int i16;
        int paddingLeft = getPaddingLeft();
        int i17 = i13 - i11;
        int paddingRight = i17 - getPaddingRight();
        int paddingRight2 = (i17 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i18 = this.mGravity;
        int i19 = i18 & 112;
        int i21 = i18 & 8388615;
        int paddingTop = i19 != 16 ? i19 != 80 ? getPaddingTop() : ((getPaddingTop() + i14) - i12) - this.mTotalLength : C3124a.a(i14 - i12, this.mTotalLength, 2, getPaddingTop());
        int i22 = 0;
        while (i22 < virtualChildCount) {
            int i23 = paddingTop;
            View virtualChildAt = getVirtualChildAt(i22);
            if (virtualChildAt == null) {
                paddingTop = measureNullChild(i22) + i23;
            } else if (virtualChildAt.getVisibility() != 8) {
                int measuredWidth = virtualChildAt.getMeasuredWidth();
                int measuredHeight = virtualChildAt.getMeasuredHeight();
                a aVar = (a) virtualChildAt.getLayoutParams();
                int i24 = ((LinearLayout.LayoutParams) aVar).gravity;
                if (i24 < 0) {
                    i24 = i21;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i24, getLayoutDirection()) & 7;
                if (absoluteGravity == 1) {
                    a11 = C3124a.a(paddingRight2, measuredWidth, 2, paddingLeft) + ((LinearLayout.LayoutParams) aVar).leftMargin;
                    i15 = ((LinearLayout.LayoutParams) aVar).rightMargin;
                } else if (absoluteGravity != 5) {
                    i16 = ((LinearLayout.LayoutParams) aVar).leftMargin + paddingLeft;
                    if (hasDividerBeforeChildAt(i22)) {
                        i23 += this.mDividerHeight;
                    }
                    int i25 = ((LinearLayout.LayoutParams) aVar).topMargin + i23;
                    setChildFrame(virtualChildAt, i16, getLocationOffset(virtualChildAt) + i25, measuredWidth, measuredHeight);
                    int nextLocationOffset = measuredHeight + ((LinearLayout.LayoutParams) aVar).bottomMargin + getNextLocationOffset(virtualChildAt) + i25;
                    i22 += getChildrenSkipCount(virtualChildAt, i22);
                    paddingTop = nextLocationOffset;
                } else {
                    a11 = paddingRight - measuredWidth;
                    i15 = ((LinearLayout.LayoutParams) aVar).rightMargin;
                }
                i16 = a11 - i15;
                if (hasDividerBeforeChildAt(i22)) {
                }
                int i252 = ((LinearLayout.LayoutParams) aVar).topMargin + i23;
                setChildFrame(virtualChildAt, i16, getLocationOffset(virtualChildAt) + i252, measuredWidth, measuredHeight);
                int nextLocationOffset2 = measuredHeight + ((LinearLayout.LayoutParams) aVar).bottomMargin + getNextLocationOffset(virtualChildAt) + i252;
                i22 += getChildrenSkipCount(virtualChildAt, i22);
                paddingTop = nextLocationOffset2;
            } else {
                paddingTop = i23;
            }
            i22++;
        }
    }

    void measureChildBeforeLayout(View view, int i11, int i12, int i13, int i14, int i15) {
        measureChildWithMargins(view, i12, i13, i14, i15);
    }

    /* JADX WARN: Removed duplicated region for block: B:180:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void measureHorizontal(int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int max;
        int i18;
        int i19;
        int i21;
        int i22;
        boolean z11;
        int baseline;
        int i23;
        int i24;
        int i25;
        float f7;
        char c11;
        int i26;
        boolean z12;
        int i27;
        int i28;
        int[] iArr;
        int i29;
        boolean z13;
        int[] iArr2;
        View view;
        int i31;
        boolean z14;
        boolean z15;
        int baseline2;
        this.mTotalLength = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        if (this.mMaxAscent == null || this.mMaxDescent == null) {
            this.mMaxAscent = new int[4];
            this.mMaxDescent = new int[4];
        }
        int[] iArr3 = this.mMaxAscent;
        int[] iArr4 = this.mMaxDescent;
        iArr3[3] = -1;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z16 = this.mBaselineAligned;
        boolean z17 = this.mUseLargestChild;
        int i32 = 1073741824;
        boolean z18 = mode == 1073741824;
        boolean z19 = z17;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        boolean z21 = false;
        int i36 = 0;
        boolean z22 = false;
        boolean z23 = true;
        float f11 = 0.0f;
        int i37 = 0;
        int i38 = 0;
        while (true) {
            i13 = i34;
            if (i33 >= virtualChildCount) {
                break;
            }
            boolean z24 = z16;
            View virtualChildAt = getVirtualChildAt(i33);
            if (virtualChildAt == null) {
                this.mTotalLength += measureNullChild(i33);
            } else if (virtualChildAt.getVisibility() == 8) {
                i33 += getChildrenSkipCount(virtualChildAt, i33);
            } else {
                if (hasDividerBeforeChildAt(i33)) {
                    this.mTotalLength += this.mDividerWidth;
                }
                a aVar = (a) virtualChildAt.getLayoutParams();
                float f12 = ((LinearLayout.LayoutParams) aVar).weight;
                float f13 = f11 + f12;
                if (mode == i32 && ((LinearLayout.LayoutParams) aVar).width == 0 && f12 > 0.0f) {
                    if (z18) {
                        this.mTotalLength = ((LinearLayout.LayoutParams) aVar).leftMargin + ((LinearLayout.LayoutParams) aVar).rightMargin + this.mTotalLength;
                    } else {
                        int i39 = this.mTotalLength;
                        this.mTotalLength = Math.max(i39, ((LinearLayout.LayoutParams) aVar).leftMargin + i39 + ((LinearLayout.LayoutParams) aVar).rightMargin);
                    }
                    if (z24) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                        virtualChildAt.measure(makeMeasureSpec, makeMeasureSpec);
                        i28 = mode;
                        iArr = iArr3;
                        iArr2 = iArr4;
                        i29 = i13;
                        z13 = z19;
                        view = virtualChildAt;
                    } else {
                        i28 = mode;
                        iArr = iArr3;
                        iArr2 = iArr4;
                        z21 = true;
                        i29 = i13;
                        i31 = 1073741824;
                        z13 = z19;
                        view = virtualChildAt;
                        if (mode2 == i31 && ((LinearLayout.LayoutParams) aVar).height == -1) {
                            z14 = true;
                            z22 = true;
                        } else {
                            z14 = false;
                        }
                        int i41 = ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin;
                        int measuredHeight = view.getMeasuredHeight() + i41;
                        i36 = View.combineMeasuredStates(i36, view.getMeasuredState());
                        if (z24 || (baseline2 = view.getBaseline()) == -1) {
                            z15 = z14;
                        } else {
                            int i42 = ((LinearLayout.LayoutParams) aVar).gravity;
                            if (i42 < 0) {
                                i42 = this.mGravity;
                            }
                            int i43 = (((i42 & 112) >> 4) & (-2)) >> 1;
                            z15 = z14;
                            iArr[i43] = Math.max(iArr[i43], baseline2);
                            iArr2[i43] = Math.max(iArr2[i43], measuredHeight - baseline2);
                        }
                        i34 = Math.max(i29, measuredHeight);
                        z23 = !z23 && ((LinearLayout.LayoutParams) aVar).height == -1;
                        if (((LinearLayout.LayoutParams) aVar).weight <= 0.0f) {
                            if (z15) {
                                measuredHeight = i41;
                            }
                            i38 = Math.max(i38, measuredHeight);
                        } else {
                            if (z15) {
                                measuredHeight = i41;
                            }
                            i37 = Math.max(i37, measuredHeight);
                        }
                        i33 += getChildrenSkipCount(view, i33);
                        f11 = f13;
                        i33++;
                        z19 = z13;
                        iArr4 = iArr2;
                        z16 = z24;
                        iArr3 = iArr;
                        mode = i28;
                        i32 = 1073741824;
                    }
                } else {
                    if (((LinearLayout.LayoutParams) aVar).width != 0 || f12 <= 0.0f) {
                        c11 = 65534;
                        i26 = LinearLayoutManager.INVALID_OFFSET;
                    } else {
                        c11 = 65534;
                        ((LinearLayout.LayoutParams) aVar).width = -2;
                        i26 = 0;
                    }
                    if (f13 == 0.0f) {
                        z12 = z19;
                        i27 = this.mTotalLength;
                    } else {
                        z12 = z19;
                        i27 = 0;
                    }
                    i28 = mode;
                    iArr = iArr3;
                    i29 = i13;
                    int i44 = i26;
                    z13 = z12;
                    iArr2 = iArr4;
                    measureChildBeforeLayout(virtualChildAt, i33, i11, i27, i12, 0);
                    view = virtualChildAt;
                    if (i44 != Integer.MIN_VALUE) {
                        ((LinearLayout.LayoutParams) aVar).width = i44;
                    }
                    int measuredWidth = view.getMeasuredWidth();
                    if (z18) {
                        this.mTotalLength = ((LinearLayout.LayoutParams) aVar).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) aVar).rightMargin + getNextLocationOffset(view) + this.mTotalLength;
                    } else {
                        int i45 = this.mTotalLength;
                        this.mTotalLength = Math.max(i45, i45 + measuredWidth + ((LinearLayout.LayoutParams) aVar).leftMargin + ((LinearLayout.LayoutParams) aVar).rightMargin + getNextLocationOffset(view));
                    }
                    if (z13) {
                        i35 = Math.max(measuredWidth, i35);
                    }
                }
                i31 = 1073741824;
                if (mode2 == i31) {
                }
                z14 = false;
                int i412 = ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin;
                int measuredHeight2 = view.getMeasuredHeight() + i412;
                i36 = View.combineMeasuredStates(i36, view.getMeasuredState());
                if (z24) {
                }
                z15 = z14;
                i34 = Math.max(i29, measuredHeight2);
                if (z23) {
                }
                if (((LinearLayout.LayoutParams) aVar).weight <= 0.0f) {
                }
                i33 += getChildrenSkipCount(view, i33);
                f11 = f13;
                i33++;
                z19 = z13;
                iArr4 = iArr2;
                z16 = z24;
                iArr3 = iArr;
                mode = i28;
                i32 = 1073741824;
            }
            i28 = mode;
            iArr = iArr3;
            iArr2 = iArr4;
            i34 = i13;
            z13 = z19;
            i33++;
            z19 = z13;
            iArr4 = iArr2;
            z16 = z24;
            iArr3 = iArr;
            mode = i28;
            i32 = 1073741824;
        }
        boolean z25 = z16;
        int i46 = mode;
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        int i47 = i36;
        boolean z26 = z19;
        if (this.mTotalLength > 0 && hasDividerBeforeChildAt(virtualChildCount)) {
            this.mTotalLength += this.mDividerWidth;
        }
        int i48 = iArr5[1];
        int max2 = (i48 == -1 && iArr5[0] == -1 && iArr5[2] == -1 && iArr5[3] == -1) ? i13 : Math.max(i13, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[2]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i48, iArr5[2]))));
        if (z26) {
            i15 = i46;
            if (i15 == Integer.MIN_VALUE || i15 == 0) {
                this.mTotalLength = 0;
                int i49 = 0;
                while (i49 < virtualChildCount) {
                    View virtualChildAt2 = getVirtualChildAt(i49);
                    if (virtualChildAt2 == null) {
                        this.mTotalLength += measureNullChild(i49);
                    } else if (virtualChildAt2.getVisibility() == 8) {
                        i49 += getChildrenSkipCount(virtualChildAt2, i49);
                    } else {
                        a aVar2 = (a) virtualChildAt2.getLayoutParams();
                        if (z18) {
                            i25 = max2;
                            this.mTotalLength = ((LinearLayout.LayoutParams) aVar2).leftMargin + i35 + ((LinearLayout.LayoutParams) aVar2).rightMargin + getNextLocationOffset(virtualChildAt2) + this.mTotalLength;
                            f7 = f11;
                            i49++;
                            max2 = i25;
                            f11 = f7;
                        } else {
                            i25 = max2;
                            int i51 = this.mTotalLength;
                            f7 = f11;
                            this.mTotalLength = Math.max(i51, i51 + i35 + ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin + getNextLocationOffset(virtualChildAt2));
                            i49++;
                            max2 = i25;
                            f11 = f7;
                        }
                    }
                    i25 = max2;
                    f7 = f11;
                    i49++;
                    max2 = i25;
                    f11 = f7;
                }
            }
            i14 = max2;
        } else {
            i14 = max2;
            i15 = i46;
        }
        float f14 = f11;
        int paddingRight = getPaddingRight() + getPaddingLeft() + this.mTotalLength;
        this.mTotalLength = paddingRight;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i11, 0);
        int i52 = (16777215 & resolveSizeAndState) - this.mTotalLength;
        if (z21 || (i52 != 0 && f14 > 0.0f)) {
            float f15 = this.mWeightSum;
            if (f15 > 0.0f) {
                f14 = f15;
            }
            iArr5[3] = -1;
            iArr5[2] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[2] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            this.mTotalLength = 0;
            int i53 = i47;
            int i54 = -1;
            int i55 = 0;
            while (i55 < virtualChildCount) {
                View virtualChildAt3 = getVirtualChildAt(i55);
                if (virtualChildAt3 == null || virtualChildAt3.getVisibility() == 8) {
                    i21 = resolveSizeAndState;
                } else {
                    a aVar3 = (a) virtualChildAt3.getLayoutParams();
                    float f16 = ((LinearLayout.LayoutParams) aVar3).weight;
                    if (f16 > 0.0f) {
                        int i56 = (int) ((i52 * f16) / f14);
                        f14 -= f16;
                        i52 -= i56;
                        i21 = resolveSizeAndState;
                        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin, ((LinearLayout.LayoutParams) aVar3).height);
                        if (((LinearLayout.LayoutParams) aVar3).width == 0) {
                            i24 = 1073741824;
                            if (i15 == 1073741824) {
                                if (i56 <= 0) {
                                    i56 = 0;
                                }
                                virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(i56, 1073741824), childMeasureSpec);
                                i53 = View.combineMeasuredStates(i53, virtualChildAt3.getMeasuredState() & (-16777216));
                            }
                        } else {
                            i24 = 1073741824;
                        }
                        int measuredWidth2 = virtualChildAt3.getMeasuredWidth() + i56;
                        if (measuredWidth2 < 0) {
                            measuredWidth2 = 0;
                        }
                        virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, i24), childMeasureSpec);
                        i53 = View.combineMeasuredStates(i53, virtualChildAt3.getMeasuredState() & (-16777216));
                    } else {
                        i21 = resolveSizeAndState;
                    }
                    if (z18) {
                        this.mTotalLength = virtualChildAt3.getMeasuredWidth() + ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin + getNextLocationOffset(virtualChildAt3) + this.mTotalLength;
                    } else {
                        int i57 = this.mTotalLength;
                        this.mTotalLength = Math.max(i57, virtualChildAt3.getMeasuredWidth() + i57 + ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin + getNextLocationOffset(virtualChildAt3));
                    }
                    boolean z27 = mode2 != 1073741824 && ((LinearLayout.LayoutParams) aVar3).height == -1;
                    int i58 = ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin;
                    int measuredHeight3 = virtualChildAt3.getMeasuredHeight() + i58;
                    i54 = Math.max(i54, measuredHeight3);
                    if (!z27) {
                        i58 = measuredHeight3;
                    }
                    int max3 = Math.max(i37, i58);
                    if (z23) {
                        i22 = -1;
                        if (((LinearLayout.LayoutParams) aVar3).height == -1) {
                            z11 = true;
                            if (z25 && (baseline = virtualChildAt3.getBaseline()) != i22) {
                                i23 = ((LinearLayout.LayoutParams) aVar3).gravity;
                                if (i23 < 0) {
                                    i23 = this.mGravity;
                                }
                                int i59 = (((i23 & 112) >> 4) & (-2)) >> 1;
                                iArr5[i59] = Math.max(iArr5[i59], baseline);
                                iArr6[i59] = Math.max(iArr6[i59], measuredHeight3 - baseline);
                            }
                            i37 = max3;
                            z23 = z11;
                        }
                    } else {
                        i22 = -1;
                    }
                    z11 = false;
                    if (z25) {
                        i23 = ((LinearLayout.LayoutParams) aVar3).gravity;
                        if (i23 < 0) {
                        }
                        int i592 = (((i23 & 112) >> 4) & (-2)) >> 1;
                        iArr5[i592] = Math.max(iArr5[i592], baseline);
                        iArr6[i592] = Math.max(iArr6[i592], measuredHeight3 - baseline);
                    }
                    i37 = max3;
                    z23 = z11;
                }
                i55++;
                resolveSizeAndState = i21;
            }
            i16 = resolveSizeAndState;
            i17 = -16777216;
            this.mTotalLength = getPaddingRight() + getPaddingLeft() + this.mTotalLength;
            int i61 = iArr5[1];
            max = (i61 == -1 && iArr5[0] == -1 && iArr5[2] == -1 && iArr5[3] == -1) ? i54 : Math.max(i54, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[2]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i61, iArr5[2]))));
            i18 = i53;
            i19 = i37;
        } else {
            i19 = Math.max(i37, i38);
            if (z26 && i15 != 1073741824) {
                for (int i62 = 0; i62 < virtualChildCount; i62++) {
                    View virtualChildAt4 = getVirtualChildAt(i62);
                    if (virtualChildAt4 != null && virtualChildAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((a) virtualChildAt4.getLayoutParams())).weight > 0.0f) {
                        virtualChildAt4.measure(View.MeasureSpec.makeMeasureSpec(i35, 1073741824), View.MeasureSpec.makeMeasureSpec(virtualChildAt4.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i16 = resolveSizeAndState;
            i18 = i47;
            max = i14;
            i17 = -16777216;
        }
        if (!z23 && mode2 != 1073741824) {
            max = i19;
        }
        setMeasuredDimension(i16 | (i18 & i17), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max, getSuggestedMinimumHeight()), i12, i18 << 16));
        if (z22) {
            forceUniformHeight(virtualChildCount, i11);
        }
    }

    int measureNullChild(int i11) {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void measureVertical(int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        boolean z11;
        int i27;
        View view;
        int max;
        boolean z12;
        int max2;
        int i28;
        this.mTotalLength = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int i29 = this.mBaselineAlignedChildIndex;
        boolean z13 = this.mUseLargestChild;
        int i31 = 0;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        boolean z14 = false;
        boolean z15 = false;
        float f7 = 0.0f;
        boolean z16 = true;
        while (true) {
            int i37 = 8;
            if (i31 >= virtualChildCount) {
                float f11 = f7;
                int i38 = i32;
                int i39 = virtualChildCount;
                int i41 = mode2;
                boolean z17 = z13;
                int i42 = i33;
                int i43 = i34;
                int i44 = i35;
                if (this.mTotalLength > 0) {
                    i13 = i39;
                    if (hasDividerBeforeChildAt(i13)) {
                        this.mTotalLength += this.mDividerHeight;
                    }
                } else {
                    i13 = i39;
                }
                int i45 = i41;
                if (z17 && (i45 == Integer.MIN_VALUE || i45 == 0)) {
                    this.mTotalLength = 0;
                    int i46 = 0;
                    while (i46 < i13) {
                        View virtualChildAt = getVirtualChildAt(i46);
                        if (virtualChildAt == null) {
                            this.mTotalLength += measureNullChild(i46);
                        } else if (virtualChildAt.getVisibility() == i37) {
                            i46 += getChildrenSkipCount(virtualChildAt, i46);
                        } else {
                            a aVar = (a) virtualChildAt.getLayoutParams();
                            int i47 = this.mTotalLength;
                            this.mTotalLength = Math.max(i47, i47 + i42 + ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin + getNextLocationOffset(virtualChildAt));
                        }
                        i46++;
                        i37 = 8;
                    }
                }
                int paddingBottom = getPaddingBottom() + getPaddingTop() + this.mTotalLength;
                this.mTotalLength = paddingBottom;
                int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i12, 0);
                int i48 = (16777215 & resolveSizeAndState) - this.mTotalLength;
                if (z14 || (i48 != 0 && f11 > 0.0f)) {
                    float f12 = this.mWeightSum;
                    if (f12 <= 0.0f) {
                        f12 = f11;
                    }
                    this.mTotalLength = 0;
                    float f13 = f12;
                    int i49 = i48;
                    int i51 = 0;
                    while (i51 < i13) {
                        View virtualChildAt2 = getVirtualChildAt(i51);
                        if (virtualChildAt2.getVisibility() == 8) {
                            i15 = i45;
                            i16 = i51;
                        } else {
                            a aVar2 = (a) virtualChildAt2.getLayoutParams();
                            float f14 = ((LinearLayout.LayoutParams) aVar2).weight;
                            if (f14 > 0.0f) {
                                i16 = i51;
                                int i52 = (int) ((i49 * f14) / f13);
                                f13 -= f14;
                                i49 -= i52;
                                int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, getPaddingRight() + getPaddingLeft() + ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin, ((LinearLayout.LayoutParams) aVar2).width);
                                if (((LinearLayout.LayoutParams) aVar2).height == 0) {
                                    i18 = 1073741824;
                                    if (i45 == 1073741824) {
                                        i15 = i45;
                                        virtualChildAt2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i52 > 0 ? i52 : 0, 1073741824));
                                        i44 = View.combineMeasuredStates(i44, virtualChildAt2.getMeasuredState() & (-256));
                                    }
                                } else {
                                    i18 = 1073741824;
                                }
                                i15 = i45;
                                int measuredHeight = virtualChildAt2.getMeasuredHeight() + i52;
                                if (measuredHeight < 0) {
                                    measuredHeight = 0;
                                }
                                virtualChildAt2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight, i18));
                                i44 = View.combineMeasuredStates(i44, virtualChildAt2.getMeasuredState() & (-256));
                            } else {
                                i15 = i45;
                                i16 = i51;
                            }
                            int i53 = ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                            int measuredWidth = virtualChildAt2.getMeasuredWidth() + i53;
                            i43 = Math.max(i43, measuredWidth);
                            if (mode != 1073741824) {
                                i17 = -1;
                                if (((LinearLayout.LayoutParams) aVar2).width == -1) {
                                    measuredWidth = i53;
                                }
                            } else {
                                i17 = -1;
                            }
                            int max3 = Math.max(i36, measuredWidth);
                            boolean z18 = z16 && ((LinearLayout.LayoutParams) aVar2).width == i17;
                            int i54 = this.mTotalLength;
                            this.mTotalLength = Math.max(i54, virtualChildAt2.getMeasuredHeight() + i54 + ((LinearLayout.LayoutParams) aVar2).topMargin + ((LinearLayout.LayoutParams) aVar2).bottomMargin + getNextLocationOffset(virtualChildAt2));
                            i36 = max3;
                            z16 = z18;
                        }
                        i51 = i16 + 1;
                        i45 = i15;
                    }
                    this.mTotalLength = getPaddingBottom() + getPaddingTop() + this.mTotalLength;
                    i14 = i36;
                } else {
                    i14 = Math.max(i36, i38);
                    if (z17 && i45 != 1073741824) {
                        for (int i55 = 0; i55 < i13; i55++) {
                            View virtualChildAt3 = getVirtualChildAt(i55);
                            if (virtualChildAt3 != null && virtualChildAt3.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((a) virtualChildAt3.getLayoutParams())).weight > 0.0f) {
                                virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(virtualChildAt3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i42, 1073741824));
                            }
                        }
                    }
                }
                if (!z16 && mode != 1073741824) {
                    i43 = i14;
                }
                setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + i43, getSuggestedMinimumWidth()), i11, i44), resolveSizeAndState);
                if (z15) {
                    forceUniformWidth(i13, i12);
                    return;
                }
                return;
            }
            float f15 = f7;
            View virtualChildAt4 = getVirtualChildAt(i31);
            if (virtualChildAt4 == null) {
                this.mTotalLength += measureNullChild(i31);
            } else if (virtualChildAt4.getVisibility() == 8) {
                i31 += getChildrenSkipCount(virtualChildAt4, i31);
            } else {
                if (hasDividerBeforeChildAt(i31)) {
                    this.mTotalLength += this.mDividerHeight;
                }
                a aVar3 = (a) virtualChildAt4.getLayoutParams();
                float f16 = ((LinearLayout.LayoutParams) aVar3).weight;
                float f17 = f15 + f16;
                if (mode2 == 1073741824 && ((LinearLayout.LayoutParams) aVar3).height == 0 && f16 > 0.0f) {
                    int i56 = this.mTotalLength;
                    this.mTotalLength = Math.max(i56, ((LinearLayout.LayoutParams) aVar3).topMargin + i56 + ((LinearLayout.LayoutParams) aVar3).bottomMargin);
                    i27 = i32;
                    max = i33;
                    i23 = virtualChildCount;
                    i24 = mode2;
                    z14 = true;
                    view = virtualChildAt4;
                    i26 = i34;
                    i25 = i35;
                    z11 = z13;
                } else {
                    if (((LinearLayout.LayoutParams) aVar3).height != 0 || f16 <= 0.0f) {
                        i19 = LinearLayoutManager.INVALID_OFFSET;
                    } else {
                        ((LinearLayout.LayoutParams) aVar3).height = -2;
                        i19 = 0;
                    }
                    if (f17 == 0.0f) {
                        int i57 = i35;
                        i22 = this.mTotalLength;
                        i21 = i57;
                    } else {
                        i21 = i35;
                        i22 = 0;
                    }
                    int i58 = i33;
                    i23 = virtualChildCount;
                    i24 = mode2;
                    i25 = i21;
                    i26 = i34;
                    z11 = z13;
                    i27 = i32;
                    measureChildBeforeLayout(virtualChildAt4, i31, i11, 0, i12, i22);
                    view = virtualChildAt4;
                    if (i19 != Integer.MIN_VALUE) {
                        ((LinearLayout.LayoutParams) aVar3).height = i19;
                    }
                    int measuredHeight2 = view.getMeasuredHeight();
                    int i59 = this.mTotalLength;
                    this.mTotalLength = Math.max(i59, i59 + measuredHeight2 + ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin + getNextLocationOffset(view));
                    max = z11 ? Math.max(measuredHeight2, i58) : i58;
                }
                if (i29 >= 0 && i29 == i31 + 1) {
                    this.mBaselineChildTop = this.mTotalLength;
                }
                if (i31 < i29 && ((LinearLayout.LayoutParams) aVar3).weight > 0.0f) {
                    throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                }
                if (mode == 1073741824 || ((LinearLayout.LayoutParams) aVar3).width != -1) {
                    z12 = false;
                } else {
                    z12 = true;
                    z15 = true;
                }
                int i61 = ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin;
                int measuredWidth2 = view.getMeasuredWidth() + i61;
                max2 = Math.max(i26, measuredWidth2);
                int i62 = max;
                int combineMeasuredStates = View.combineMeasuredStates(i25, view.getMeasuredState());
                if (z16) {
                    i28 = combineMeasuredStates;
                    if (((LinearLayout.LayoutParams) aVar3).width == -1) {
                        z16 = true;
                        if (((LinearLayout.LayoutParams) aVar3).weight <= 0.0f) {
                            if (!z12) {
                                i61 = measuredWidth2;
                            }
                            i27 = Math.max(i27, i61);
                        } else {
                            if (!z12) {
                                i61 = measuredWidth2;
                            }
                            i36 = Math.max(i36, i61);
                        }
                        i31 += getChildrenSkipCount(view, i31);
                        f7 = f17;
                        i33 = i62;
                        i35 = i28;
                        i31++;
                        i34 = max2;
                        i32 = i27;
                        z13 = z11;
                        mode2 = i24;
                        virtualChildCount = i23;
                    }
                } else {
                    i28 = combineMeasuredStates;
                }
                z16 = false;
                if (((LinearLayout.LayoutParams) aVar3).weight <= 0.0f) {
                }
                i31 += getChildrenSkipCount(view, i31);
                f7 = f17;
                i33 = i62;
                i35 = i28;
                i31++;
                i34 = max2;
                i32 = i27;
                z13 = z11;
                mode2 = i24;
                virtualChildCount = i23;
            }
            i27 = i32;
            i23 = virtualChildCount;
            i24 = mode2;
            z11 = z13;
            f7 = f15;
            max2 = i34;
            i31++;
            i34 = max2;
            i32 = i27;
            z13 = z11;
            mode2 = i24;
            virtualChildCount = i23;
        }
    }

    @Override // android.view.View
    protected void onDraw(@NonNull Canvas canvas) {
        if (this.mDivider == null) {
            return;
        }
        if (this.mOrientation == 1) {
            drawDividersVertical(canvas);
        } else {
            drawDividersHorizontal(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        if (this.mOrientation == 1) {
            layoutVertical(i11, i12, i13, i14);
        } else {
            layoutHorizontal(i11, i12, i13, i14);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        if (this.mOrientation == 1) {
            measureVertical(i11, i12);
        } else {
            measureHorizontal(i11, i12);
        }
    }

    public void setBaselineAligned(boolean z11) {
        this.mBaselineAligned = z11;
    }

    public void setBaselineAlignedChildIndex(int i11) {
        if (i11 >= 0 && i11 < getChildCount()) {
            this.mBaselineAlignedChildIndex = i11;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.mDivider) {
            return;
        }
        this.mDivider = drawable;
        if (drawable != null) {
            this.mDividerWidth = drawable.getIntrinsicWidth();
            this.mDividerHeight = drawable.getIntrinsicHeight();
        } else {
            this.mDividerWidth = 0;
            this.mDividerHeight = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i11) {
        this.mDividerPadding = i11;
    }

    public void setGravity(int i11) {
        if (this.mGravity != i11) {
            if ((8388615 & i11) == 0) {
                i11 |= 8388611;
            }
            if ((i11 & 112) == 0) {
                i11 |= 48;
            }
            this.mGravity = i11;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i11) {
        int i12 = i11 & 8388615;
        int i13 = this.mGravity;
        if ((8388615 & i13) != i12) {
            this.mGravity = i12 | ((-8388616) & i13);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z11) {
        this.mUseLargestChild = z11;
    }

    public void setOrientation(int i11) {
        if (this.mOrientation != i11) {
            this.mOrientation = i11;
            requestLayout();
        }
    }

    public void setShowDividers(int i11) {
        if (i11 != this.mShowDividers) {
            requestLayout();
        }
        this.mShowDividers = i11;
    }

    public void setVerticalGravity(int i11) {
        int i12 = i11 & 112;
        int i13 = this.mGravity;
        if ((i13 & 112) != i12) {
            this.mGravity = i12 | (i13 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f7) {
        this.mWeightSum = Math.max(0.0f, f7);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public LinearLayoutCompat(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public a generateDefaultLayoutParams() {
        int i11 = this.mOrientation;
        if (i11 == 0) {
            return new a(-2, -2);
        }
        if (i11 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    public LinearLayoutCompat(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.mBaselineAligned = true;
        this.mBaselineAlignedChildIndex = -1;
        this.mBaselineChildTop = 0;
        this.mGravity = 8388659;
        int[] iArr = C6977a.f65660n;
        b0 v11 = b0.v(context, attributeSet, iArr, i11, 0);
        androidx.core.view.Y.B(this, context, iArr, attributeSet, v11.r(), i11);
        int k11 = v11.k(1, -1);
        if (k11 >= 0) {
            setOrientation(k11);
        }
        int k12 = v11.k(0, -1);
        if (k12 >= 0) {
            setGravity(k12);
        }
        boolean a11 = v11.a(2, true);
        if (!a11) {
            setBaselineAligned(a11);
        }
        this.mWeightSum = v11.i();
        this.mBaselineAlignedChildIndex = v11.k(3, -1);
        this.mUseLargestChild = v11.a(7, false);
        setDividerDrawable(v11.g(5));
        this.mShowDividers = v11.k(8, 0);
        this.mDividerPadding = v11.f(6, 0);
        v11.x();
    }

    @Override // android.view.ViewGroup
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof a) {
            return new a((a) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new a((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new a(layoutParams);
    }
}
