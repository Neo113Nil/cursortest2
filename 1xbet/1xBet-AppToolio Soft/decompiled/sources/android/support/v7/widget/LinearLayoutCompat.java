package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.annotation.RestrictTo;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.InputDeviceCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.appcompat.R;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.gms.common.util.CrashUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {
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

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface DividerMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface OrientationMode {
    }

    int getChildrenSkipCount(View view, int i) {
        return 0;
    }

    int getLocationOffset(View view) {
        return 0;
    }

    int getNextLocationOffset(View view) {
        return 0;
    }

    int measureNullChild(int i) {
        return 0;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public LinearLayoutCompat(Context context) {
        this(context, null);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mBaselineAligned = true;
        this.mBaselineAlignedChildIndex = -1;
        this.mBaselineChildTop = 0;
        this.mGravity = 8388659;
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, R.styleable.LinearLayoutCompat, i, 0);
        int i2 = obtainStyledAttributes.getInt(R.styleable.LinearLayoutCompat_android_orientation, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = obtainStyledAttributes.getInt(R.styleable.LinearLayoutCompat_android_gravity, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        boolean z = obtainStyledAttributes.getBoolean(R.styleable.LinearLayoutCompat_android_baselineAligned, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.mWeightSum = obtainStyledAttributes.getFloat(R.styleable.LinearLayoutCompat_android_weightSum, -1.0f);
        this.mBaselineAlignedChildIndex = obtainStyledAttributes.getInt(R.styleable.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.mUseLargestChild = obtainStyledAttributes.getBoolean(R.styleable.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(obtainStyledAttributes.getDrawable(R.styleable.LinearLayoutCompat_divider));
        this.mShowDividers = obtainStyledAttributes.getInt(R.styleable.LinearLayoutCompat_showDividers, 0);
        this.mDividerPadding = obtainStyledAttributes.getDimensionPixelSize(R.styleable.LinearLayoutCompat_dividerPadding, 0);
        obtainStyledAttributes.recycle();
    }

    public void setShowDividers(int i) {
        if (i != this.mShowDividers) {
            requestLayout();
        }
        this.mShowDividers = i;
    }

    public int getShowDividers() {
        return this.mShowDividers;
    }

    public Drawable getDividerDrawable() {
        return this.mDivider;
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

    public void setDividerPadding(int i) {
        this.mDividerPadding = i;
    }

    public int getDividerPadding() {
        return this.mDividerPadding;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getDividerWidth() {
        return this.mDividerWidth;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.mDivider == null) {
            return;
        }
        if (this.mOrientation == 1) {
            drawDividersVertical(canvas);
        } else {
            drawDividersHorizontal(canvas);
        }
    }

    void drawDividersVertical(Canvas canvas) {
        int bottom;
        int virtualChildCount = getVirtualChildCount();
        for (int i = 0; i < virtualChildCount; i++) {
            View virtualChildAt = getVirtualChildAt(i);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i)) {
                drawHorizontalDivider(canvas, (virtualChildAt.getTop() - ((LayoutParams) virtualChildAt.getLayoutParams()).topMargin) - this.mDividerHeight);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 == null) {
                bottom = (getHeight() - getPaddingBottom()) - this.mDividerHeight;
            } else {
                bottom = virtualChildAt2.getBottom() + ((LayoutParams) virtualChildAt2.getLayoutParams()).bottomMargin;
            }
            drawHorizontalDivider(canvas, bottom);
        }
    }

    void drawDividersHorizontal(Canvas canvas) {
        int right;
        int left;
        int virtualChildCount = getVirtualChildCount();
        boolean isLayoutRtl = ViewUtils.isLayoutRtl(this);
        for (int i = 0; i < virtualChildCount; i++) {
            View virtualChildAt = getVirtualChildAt(i);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i)) {
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                if (isLayoutRtl) {
                    left = virtualChildAt.getRight() + layoutParams.rightMargin;
                } else {
                    left = (virtualChildAt.getLeft() - layoutParams.leftMargin) - this.mDividerWidth;
                }
                drawVerticalDivider(canvas, left);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 != null) {
                LayoutParams layoutParams2 = (LayoutParams) virtualChildAt2.getLayoutParams();
                if (isLayoutRtl) {
                    right = (virtualChildAt2.getLeft() - layoutParams2.leftMargin) - this.mDividerWidth;
                } else {
                    right = virtualChildAt2.getRight() + layoutParams2.rightMargin;
                }
            } else if (isLayoutRtl) {
                right = getPaddingLeft();
            } else {
                right = (getWidth() - getPaddingRight()) - this.mDividerWidth;
            }
            drawVerticalDivider(canvas, right);
        }
    }

    void drawHorizontalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(getPaddingLeft() + this.mDividerPadding, i, (getWidth() - getPaddingRight()) - this.mDividerPadding, this.mDividerHeight + i);
        this.mDivider.draw(canvas);
    }

    void drawVerticalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(i, getPaddingTop() + this.mDividerPadding, this.mDividerWidth + i, (getHeight() - getPaddingBottom()) - this.mDividerPadding);
        this.mDivider.draw(canvas);
    }

    public boolean isBaselineAligned() {
        return this.mBaselineAligned;
    }

    public void setBaselineAligned(boolean z) {
        this.mBaselineAligned = z;
    }

    public boolean isMeasureWithLargestChildEnabled() {
        return this.mUseLargestChild;
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.mUseLargestChild = z;
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.mBaselineAlignedChildIndex < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.mBaselineAlignedChildIndex;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.mBaselineAlignedChildIndex == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i3 = this.mBaselineChildTop;
        if (this.mOrientation == 1 && (i = this.mGravity & 112) != 48) {
            if (i == 16) {
                i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.mTotalLength) / 2;
            } else if (i == 80) {
                i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.mTotalLength;
            }
        }
        return i3 + ((LayoutParams) childAt.getLayoutParams()).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.mBaselineAlignedChildIndex;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
        }
        this.mBaselineAlignedChildIndex = i;
    }

    View getVirtualChildAt(int i) {
        return getChildAt(i);
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.mWeightSum;
    }

    public void setWeightSum(float f) {
        this.mWeightSum = Math.max(0.0f, f);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.mOrientation == 1) {
            measureVertical(i, i2);
        } else {
            measureHorizontal(i, i2);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    protected boolean hasDividerBeforeChildAt(int i) {
        if (i == 0) {
            return (this.mShowDividers & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.mShowDividers & 4) != 0;
        }
        if ((this.mShowDividers & 2) == 0) {
            return false;
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (getChildAt(i2).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x0333  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void measureVertical(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        float f;
        int i9;
        int i10;
        boolean z;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        View view;
        int max;
        boolean z2;
        int max2;
        this.mTotalLength = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i20 = this.mBaselineAlignedChildIndex;
        boolean z3 = this.mUseLargestChild;
        float f2 = 0.0f;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        boolean z4 = false;
        boolean z5 = true;
        boolean z6 = false;
        while (true) {
            int i27 = 8;
            int i28 = i24;
            if (i26 < virtualChildCount) {
                View virtualChildAt = getVirtualChildAt(i26);
                if (virtualChildAt == null) {
                    this.mTotalLength += measureNullChild(i26);
                    i15 = virtualChildCount;
                    i24 = i28;
                    i16 = mode2;
                } else {
                    int i29 = i21;
                    if (virtualChildAt.getVisibility() == 8) {
                        i26 += getChildrenSkipCount(virtualChildAt, i26);
                        i15 = virtualChildCount;
                        i24 = i28;
                        i21 = i29;
                        i16 = mode2;
                    } else {
                        if (hasDividerBeforeChildAt(i26)) {
                            this.mTotalLength += this.mDividerHeight;
                        }
                        LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                        float f3 = f2 + layoutParams.weight;
                        if (mode2 == 1073741824 && layoutParams.height == 0 && layoutParams.weight > 0.0f) {
                            int i30 = this.mTotalLength;
                            this.mTotalLength = Math.max(i30, layoutParams.topMargin + i30 + layoutParams.bottomMargin);
                            max = i23;
                            view = virtualChildAt;
                            i18 = i25;
                            i15 = virtualChildCount;
                            i13 = i29;
                            i14 = i22;
                            z4 = true;
                            i19 = i26;
                            i16 = mode2;
                            i17 = i28;
                        } else {
                            int i31 = i22;
                            if (layoutParams.height != 0 || layoutParams.weight <= 0.0f) {
                                i12 = Integer.MIN_VALUE;
                            } else {
                                layoutParams.height = -2;
                                i12 = 0;
                            }
                            i13 = i29;
                            int i32 = i12;
                            i14 = i31;
                            int i33 = i23;
                            i15 = virtualChildCount;
                            i16 = mode2;
                            i17 = i28;
                            i18 = i25;
                            i19 = i26;
                            measureChildBeforeLayout(virtualChildAt, i26, i, 0, i2, f3 == 0.0f ? this.mTotalLength : 0);
                            if (i32 != Integer.MIN_VALUE) {
                                layoutParams.height = i32;
                            }
                            int measuredHeight = virtualChildAt.getMeasuredHeight();
                            int i34 = this.mTotalLength;
                            view = virtualChildAt;
                            this.mTotalLength = Math.max(i34, i34 + measuredHeight + layoutParams.topMargin + layoutParams.bottomMargin + getNextLocationOffset(view));
                            max = z3 ? Math.max(measuredHeight, i33) : i33;
                        }
                        if (i20 >= 0 && i20 == i19 + 1) {
                            this.mBaselineChildTop = this.mTotalLength;
                        }
                        if (i19 < i20 && layoutParams.weight > 0.0f) {
                            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        }
                        if (mode == 1073741824 || layoutParams.width != -1) {
                            z2 = false;
                        } else {
                            z2 = true;
                            z6 = true;
                        }
                        int i35 = layoutParams.leftMargin + layoutParams.rightMargin;
                        int measuredWidth = view.getMeasuredWidth() + i35;
                        int max3 = Math.max(i14, measuredWidth);
                        int combineMeasuredStates = View.combineMeasuredStates(i13, view.getMeasuredState());
                        boolean z7 = z5 && layoutParams.width == -1;
                        if (layoutParams.weight > 0.0f) {
                            if (!z2) {
                                i35 = measuredWidth;
                            }
                            i17 = Math.max(i17, i35);
                            max2 = i18;
                        } else {
                            if (!z2) {
                                i35 = measuredWidth;
                            }
                            max2 = Math.max(i18, i35);
                        }
                        int childrenSkipCount = getChildrenSkipCount(view, i19) + i19;
                        i23 = max;
                        z5 = z7;
                        i24 = i17;
                        f2 = f3;
                        i25 = max2;
                        i21 = combineMeasuredStates;
                        i26 = childrenSkipCount;
                        i22 = max3;
                    }
                }
                i26++;
                mode2 = i16;
                virtualChildCount = i15;
            } else {
                int i36 = i21;
                int i37 = i23;
                int i38 = i25;
                int i39 = virtualChildCount;
                int i40 = i22;
                int i41 = mode2;
                if (this.mTotalLength > 0) {
                    i3 = i39;
                    if (hasDividerBeforeChildAt(i3)) {
                        this.mTotalLength += this.mDividerHeight;
                    }
                } else {
                    i3 = i39;
                }
                if (z3) {
                    i4 = i41;
                    if (i4 == Integer.MIN_VALUE || i4 == 0) {
                        this.mTotalLength = 0;
                        int i42 = 0;
                        while (i42 < i3) {
                            View virtualChildAt2 = getVirtualChildAt(i42);
                            if (virtualChildAt2 == null) {
                                this.mTotalLength += measureNullChild(i42);
                            } else if (virtualChildAt2.getVisibility() == i27) {
                                i42 += getChildrenSkipCount(virtualChildAt2, i42);
                            } else {
                                LayoutParams layoutParams2 = (LayoutParams) virtualChildAt2.getLayoutParams();
                                int i43 = this.mTotalLength;
                                this.mTotalLength = Math.max(i43, i43 + i37 + layoutParams2.topMargin + layoutParams2.bottomMargin + getNextLocationOffset(virtualChildAt2));
                            }
                            i42++;
                            i27 = 8;
                        }
                    }
                } else {
                    i4 = i41;
                }
                this.mTotalLength += getPaddingTop() + getPaddingBottom();
                int resolveSizeAndState = View.resolveSizeAndState(Math.max(this.mTotalLength, getSuggestedMinimumHeight()), i2, 0);
                int i44 = (16777215 & resolveSizeAndState) - this.mTotalLength;
                if (z4 || (i44 != 0 && f2 > 0.0f)) {
                    float f4 = this.mWeightSum;
                    if (f4 > 0.0f) {
                        f2 = f4;
                    }
                    this.mTotalLength = 0;
                    float f5 = f2;
                    int i45 = 0;
                    int i46 = i38;
                    i5 = i36;
                    while (i45 < i3) {
                        View virtualChildAt3 = getVirtualChildAt(i45);
                        if (virtualChildAt3.getVisibility() == 8) {
                            f = f5;
                        } else {
                            LayoutParams layoutParams3 = (LayoutParams) virtualChildAt3.getLayoutParams();
                            float f6 = layoutParams3.weight;
                            if (f6 > 0.0f) {
                                int i47 = (int) ((i44 * f6) / f5);
                                i8 = i44 - i47;
                                f = f5 - f6;
                                int childMeasureSpec = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams3.leftMargin + layoutParams3.rightMargin, layoutParams3.width);
                                if (layoutParams3.height == 0) {
                                    i11 = CrashUtils.ErrorDialogData.SUPPRESSED;
                                    if (i4 == 1073741824) {
                                        if (i47 <= 0) {
                                            i47 = 0;
                                        }
                                        virtualChildAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i47, CrashUtils.ErrorDialogData.SUPPRESSED));
                                        i5 = View.combineMeasuredStates(i5, virtualChildAt3.getMeasuredState() & InputDeviceCompat.SOURCE_ANY);
                                    }
                                } else {
                                    i11 = CrashUtils.ErrorDialogData.SUPPRESSED;
                                }
                                int measuredHeight2 = virtualChildAt3.getMeasuredHeight() + i47;
                                if (measuredHeight2 < 0) {
                                    measuredHeight2 = 0;
                                }
                                virtualChildAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, i11));
                                i5 = View.combineMeasuredStates(i5, virtualChildAt3.getMeasuredState() & InputDeviceCompat.SOURCE_ANY);
                            } else {
                                i8 = i44;
                                f = f5;
                            }
                            int i48 = layoutParams3.leftMargin + layoutParams3.rightMargin;
                            int measuredWidth2 = virtualChildAt3.getMeasuredWidth() + i48;
                            i40 = Math.max(i40, measuredWidth2);
                            if (mode != 1073741824) {
                                i9 = i5;
                                i10 = -1;
                                if (layoutParams3.width == -1) {
                                    z = true;
                                    if (!z) {
                                        i48 = measuredWidth2;
                                    }
                                    i46 = Math.max(i46, i48);
                                    boolean z8 = !z5 && layoutParams3.width == i10;
                                    int i49 = this.mTotalLength;
                                    this.mTotalLength = Math.max(i49, virtualChildAt3.getMeasuredHeight() + i49 + layoutParams3.topMargin + layoutParams3.bottomMargin + getNextLocationOffset(virtualChildAt3));
                                    z5 = z8;
                                    i44 = i8;
                                    i5 = i9;
                                }
                            } else {
                                i9 = i5;
                                i10 = -1;
                            }
                            z = false;
                            if (!z) {
                            }
                            i46 = Math.max(i46, i48);
                            if (z5) {
                            }
                            int i492 = this.mTotalLength;
                            this.mTotalLength = Math.max(i492, virtualChildAt3.getMeasuredHeight() + i492 + layoutParams3.topMargin + layoutParams3.bottomMargin + getNextLocationOffset(virtualChildAt3));
                            z5 = z8;
                            i44 = i8;
                            i5 = i9;
                        }
                        i45++;
                        f5 = f;
                    }
                    i6 = i;
                    this.mTotalLength += getPaddingTop() + getPaddingBottom();
                    i7 = i46;
                } else {
                    i7 = Math.max(i38, i28);
                    if (z3 && i4 != 1073741824) {
                        for (int i50 = 0; i50 < i3; i50++) {
                            View virtualChildAt4 = getVirtualChildAt(i50);
                            if (virtualChildAt4 != null && virtualChildAt4.getVisibility() != 8 && ((LayoutParams) virtualChildAt4.getLayoutParams()).weight > 0.0f) {
                                virtualChildAt4.measure(View.MeasureSpec.makeMeasureSpec(virtualChildAt4.getMeasuredWidth(), CrashUtils.ErrorDialogData.SUPPRESSED), View.MeasureSpec.makeMeasureSpec(i37, CrashUtils.ErrorDialogData.SUPPRESSED));
                            }
                        }
                    }
                    i5 = i36;
                    i6 = i;
                }
                if (z5 || mode == 1073741824) {
                    i7 = i40;
                }
                setMeasuredDimension(View.resolveSizeAndState(Math.max(i7 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i6, i5), resolveSizeAndState);
                if (z6) {
                    forceUniformWidth(i3, i2);
                    return;
                }
                return;
            }
        }
    }

    private void forceUniformWidth(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), CrashUtils.ErrorDialogData.SUPPRESSED);
        for (int i3 = 0; i3 < i; i3++) {
            View virtualChildAt = getVirtualChildAt(i3);
            if (virtualChildAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                if (layoutParams.width == -1) {
                    int i4 = layoutParams.height;
                    layoutParams.height = virtualChildAt.getMeasuredHeight();
                    measureChildWithMargins(virtualChildAt, makeMeasureSpec, 0, i2, 0);
                    layoutParams.height = i4;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:202:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void measureHorizontal(int i, int i2) {
        int[] iArr;
        int i3;
        int i4;
        int i5;
        int i6;
        int max;
        int i7;
        int i8;
        int i9;
        float f;
        int i10;
        int i11;
        boolean z;
        int baseline;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z2;
        boolean z3;
        View view;
        int i16;
        boolean z4;
        int i17;
        int i18;
        this.mTotalLength = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (this.mMaxAscent == null || this.mMaxDescent == null) {
            this.mMaxAscent = new int[4];
            this.mMaxDescent = new int[4];
        }
        int[] iArr2 = this.mMaxAscent;
        int[] iArr3 = this.mMaxDescent;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        iArr3[3] = -1;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        boolean z5 = this.mBaselineAligned;
        boolean z6 = this.mUseLargestChild;
        int i19 = CrashUtils.ErrorDialogData.SUPPRESSED;
        boolean z7 = mode == 1073741824;
        float f2 = 0.0f;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        boolean z8 = false;
        int i25 = 0;
        boolean z9 = true;
        boolean z10 = false;
        while (true) {
            iArr = iArr3;
            if (i20 >= virtualChildCount) {
                break;
            }
            View virtualChildAt = getVirtualChildAt(i20);
            if (virtualChildAt == null) {
                this.mTotalLength += measureNullChild(i20);
                z2 = z6;
                z3 = z5;
            } else if (virtualChildAt.getVisibility() == 8) {
                i20 += getChildrenSkipCount(virtualChildAt, i20);
                z2 = z6;
                z3 = z5;
            } else {
                if (hasDividerBeforeChildAt(i20)) {
                    this.mTotalLength += this.mDividerWidth;
                }
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                float f3 = f2 + layoutParams.weight;
                if (mode == i19 && layoutParams.width == 0 && layoutParams.weight > 0.0f) {
                    if (z7) {
                        this.mTotalLength += layoutParams.leftMargin + layoutParams.rightMargin;
                    } else {
                        int i26 = this.mTotalLength;
                        this.mTotalLength = Math.max(i26, layoutParams.leftMargin + i26 + layoutParams.rightMargin);
                    }
                    if (z5) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                        virtualChildAt.measure(makeMeasureSpec, makeMeasureSpec);
                        i15 = i20;
                        z2 = z6;
                        z3 = z5;
                        view = virtualChildAt;
                        i16 = CrashUtils.ErrorDialogData.SUPPRESSED;
                        if (mode2 == i16) {
                        }
                        z4 = false;
                        int i27 = layoutParams.topMargin + layoutParams.bottomMargin;
                        int measuredHeight = view.getMeasuredHeight() + i27;
                        int combineMeasuredStates = View.combineMeasuredStates(i25, view.getMeasuredState());
                        if (z3) {
                        }
                        int max2 = Math.max(i17, measuredHeight);
                        if (z9) {
                        }
                        if (layoutParams.weight <= 0.0f) {
                        }
                        i22 = max2;
                        i25 = combineMeasuredStates;
                        z9 = r6;
                        i20 = getChildrenSkipCount(view, i18) + i18;
                        f2 = f3;
                    } else {
                        i15 = i20;
                        z2 = z6;
                        z3 = z5;
                        view = virtualChildAt;
                        i16 = CrashUtils.ErrorDialogData.SUPPRESSED;
                        z8 = true;
                        if (mode2 == i16) {
                        }
                        z4 = false;
                        int i272 = layoutParams.topMargin + layoutParams.bottomMargin;
                        int measuredHeight2 = view.getMeasuredHeight() + i272;
                        int combineMeasuredStates2 = View.combineMeasuredStates(i25, view.getMeasuredState());
                        if (z3) {
                        }
                        int max22 = Math.max(i17, measuredHeight2);
                        if (z9) {
                        }
                        if (layoutParams.weight <= 0.0f) {
                        }
                        i22 = max22;
                        i25 = combineMeasuredStates2;
                        z9 = r6;
                        i20 = getChildrenSkipCount(view, i18) + i18;
                        f2 = f3;
                    }
                } else {
                    if (layoutParams.width != 0 || layoutParams.weight <= 0.0f) {
                        i14 = Integer.MIN_VALUE;
                    } else {
                        layoutParams.width = -2;
                        i14 = 0;
                    }
                    i15 = i20;
                    int i28 = i14;
                    z2 = z6;
                    z3 = z5;
                    measureChildBeforeLayout(virtualChildAt, i15, i, f3 == 0.0f ? this.mTotalLength : 0, i2, 0);
                    if (i28 != Integer.MIN_VALUE) {
                        layoutParams.width = i28;
                    }
                    int measuredWidth = virtualChildAt.getMeasuredWidth();
                    if (z7) {
                        view = virtualChildAt;
                        this.mTotalLength += layoutParams.leftMargin + measuredWidth + layoutParams.rightMargin + getNextLocationOffset(view);
                    } else {
                        view = virtualChildAt;
                        int i29 = this.mTotalLength;
                        this.mTotalLength = Math.max(i29, i29 + measuredWidth + layoutParams.leftMargin + layoutParams.rightMargin + getNextLocationOffset(view));
                    }
                    if (z2) {
                        i21 = Math.max(measuredWidth, i21);
                        i16 = CrashUtils.ErrorDialogData.SUPPRESSED;
                        if (mode2 == i16 && layoutParams.height == -1) {
                            z4 = true;
                            z10 = true;
                        } else {
                            z4 = false;
                        }
                        int i2722 = layoutParams.topMargin + layoutParams.bottomMargin;
                        int measuredHeight22 = view.getMeasuredHeight() + i2722;
                        int combineMeasuredStates22 = View.combineMeasuredStates(i25, view.getMeasuredState());
                        if (z3) {
                            i17 = i22;
                        } else {
                            int baseline2 = view.getBaseline();
                            if (baseline2 != -1) {
                                int i30 = ((((layoutParams.gravity < 0 ? this.mGravity : layoutParams.gravity) & 112) >> 4) & (-2)) >> 1;
                                iArr2[i30] = Math.max(iArr2[i30], baseline2);
                                iArr[i30] = Math.max(iArr[i30], measuredHeight22 - baseline2);
                                i17 = i22;
                            } else {
                                i17 = i22;
                            }
                        }
                        int max222 = Math.max(i17, measuredHeight22);
                        boolean z11 = !z9 && layoutParams.height == -1;
                        if (layoutParams.weight <= 0.0f) {
                            if (!z4) {
                                i2722 = measuredHeight22;
                            }
                            i24 = Math.max(i24, i2722);
                            i18 = i15;
                        } else {
                            int i31 = i24;
                            if (z4) {
                                measuredHeight22 = i2722;
                            }
                            i23 = Math.max(i23, measuredHeight22);
                            i24 = i31;
                            i18 = i15;
                        }
                        i22 = max222;
                        i25 = combineMeasuredStates22;
                        z9 = z11;
                        i20 = getChildrenSkipCount(view, i18) + i18;
                        f2 = f3;
                    }
                    i16 = CrashUtils.ErrorDialogData.SUPPRESSED;
                    if (mode2 == i16) {
                    }
                    z4 = false;
                    int i27222 = layoutParams.topMargin + layoutParams.bottomMargin;
                    int measuredHeight222 = view.getMeasuredHeight() + i27222;
                    int combineMeasuredStates222 = View.combineMeasuredStates(i25, view.getMeasuredState());
                    if (z3) {
                    }
                    int max2222 = Math.max(i17, measuredHeight222);
                    if (z9) {
                    }
                    if (layoutParams.weight <= 0.0f) {
                    }
                    i22 = max2222;
                    i25 = combineMeasuredStates222;
                    z9 = z11;
                    i20 = getChildrenSkipCount(view, i18) + i18;
                    f2 = f3;
                }
            }
            i20++;
            iArr3 = iArr;
            z6 = z2;
            z5 = z3;
            i19 = CrashUtils.ErrorDialogData.SUPPRESSED;
        }
        boolean z12 = z6;
        boolean z13 = z5;
        int i32 = i22;
        int i33 = i23;
        int i34 = i24;
        int i35 = i25;
        if (this.mTotalLength > 0 && hasDividerBeforeChildAt(virtualChildCount)) {
            this.mTotalLength += this.mDividerWidth;
        }
        if (iArr2[1] == -1 && iArr2[0] == -1 && iArr2[2] == -1 && iArr2[3] == -1) {
            i3 = i35;
        } else {
            i3 = i35;
            i32 = Math.max(i32, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
        }
        if (z12 && (mode == Integer.MIN_VALUE || mode == 0)) {
            this.mTotalLength = 0;
            int i36 = 0;
            while (i36 < virtualChildCount) {
                View virtualChildAt2 = getVirtualChildAt(i36);
                if (virtualChildAt2 == null) {
                    this.mTotalLength += measureNullChild(i36);
                    i13 = i32;
                } else if (virtualChildAt2.getVisibility() == 8) {
                    i36 += getChildrenSkipCount(virtualChildAt2, i36);
                    i13 = i32;
                } else {
                    LayoutParams layoutParams2 = (LayoutParams) virtualChildAt2.getLayoutParams();
                    if (z7) {
                        this.mTotalLength += layoutParams2.leftMargin + i21 + layoutParams2.rightMargin + getNextLocationOffset(virtualChildAt2);
                        i13 = i32;
                    } else {
                        int i37 = this.mTotalLength;
                        i13 = i32;
                        this.mTotalLength = Math.max(i37, i37 + i21 + layoutParams2.leftMargin + layoutParams2.rightMargin + getNextLocationOffset(virtualChildAt2));
                    }
                }
                i36++;
                i32 = i13;
            }
            i4 = i32;
        } else {
            i4 = i32;
        }
        this.mTotalLength += getPaddingLeft() + getPaddingRight();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(this.mTotalLength, getSuggestedMinimumWidth()), i, 0);
        int i38 = (16777215 & resolveSizeAndState) - this.mTotalLength;
        if (z8 || (i38 != 0 && f2 > 0.0f)) {
            float f4 = this.mWeightSum;
            if (f4 > 0.0f) {
                f2 = f4;
            }
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            this.mTotalLength = 0;
            int i39 = i33;
            int i40 = i3;
            int i41 = -1;
            float f5 = f2;
            int i42 = 0;
            while (i42 < virtualChildCount) {
                View virtualChildAt3 = getVirtualChildAt(i42);
                if (virtualChildAt3 == null) {
                    i8 = i38;
                    i9 = virtualChildCount;
                } else if (virtualChildAt3.getVisibility() == 8) {
                    i8 = i38;
                    i9 = virtualChildCount;
                } else {
                    LayoutParams layoutParams3 = (LayoutParams) virtualChildAt3.getLayoutParams();
                    float f6 = layoutParams3.weight;
                    if (f6 > 0.0f) {
                        int i43 = (int) ((i38 * f6) / f5);
                        float f7 = f5 - f6;
                        int i44 = i38 - i43;
                        i9 = virtualChildCount;
                        int childMeasureSpec = getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom() + layoutParams3.topMargin + layoutParams3.bottomMargin, layoutParams3.height);
                        if (layoutParams3.width == 0) {
                            i12 = CrashUtils.ErrorDialogData.SUPPRESSED;
                            if (mode == 1073741824) {
                                if (i43 <= 0) {
                                    i43 = 0;
                                }
                                virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(i43, CrashUtils.ErrorDialogData.SUPPRESSED), childMeasureSpec);
                                i40 = View.combineMeasuredStates(i40, virtualChildAt3.getMeasuredState() & ViewCompat.MEASURED_STATE_MASK);
                                f5 = f7;
                                i8 = i44;
                            }
                        } else {
                            i12 = CrashUtils.ErrorDialogData.SUPPRESSED;
                        }
                        int measuredWidth2 = virtualChildAt3.getMeasuredWidth() + i43;
                        if (measuredWidth2 < 0) {
                            measuredWidth2 = 0;
                        }
                        virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, i12), childMeasureSpec);
                        i40 = View.combineMeasuredStates(i40, virtualChildAt3.getMeasuredState() & ViewCompat.MEASURED_STATE_MASK);
                        f5 = f7;
                        i8 = i44;
                    } else {
                        i8 = i38;
                        i9 = virtualChildCount;
                    }
                    if (z7) {
                        this.mTotalLength += virtualChildAt3.getMeasuredWidth() + layoutParams3.leftMargin + layoutParams3.rightMargin + getNextLocationOffset(virtualChildAt3);
                        f = f5;
                        i10 = CrashUtils.ErrorDialogData.SUPPRESSED;
                    } else {
                        int i45 = this.mTotalLength;
                        f = f5;
                        this.mTotalLength = Math.max(i45, virtualChildAt3.getMeasuredWidth() + i45 + layoutParams3.leftMargin + layoutParams3.rightMargin + getNextLocationOffset(virtualChildAt3));
                        i10 = CrashUtils.ErrorDialogData.SUPPRESSED;
                    }
                    boolean z14 = mode2 != i10 && layoutParams3.height == -1;
                    int i46 = layoutParams3.topMargin + layoutParams3.bottomMargin;
                    int measuredHeight3 = virtualChildAt3.getMeasuredHeight() + i46;
                    i41 = Math.max(i41, measuredHeight3);
                    if (!z14) {
                        i46 = measuredHeight3;
                    }
                    int max3 = Math.max(i39, i46);
                    if (z9) {
                        i11 = -1;
                        if (layoutParams3.height == -1) {
                            z = true;
                            if (z13 && (baseline = virtualChildAt3.getBaseline()) != i11) {
                                int i47 = ((((layoutParams3.gravity >= 0 ? this.mGravity : layoutParams3.gravity) & 112) >> 4) & (-2)) >> 1;
                                iArr2[i47] = Math.max(iArr2[i47], baseline);
                                iArr[i47] = Math.max(iArr[i47], measuredHeight3 - baseline);
                            }
                            i39 = max3;
                            z9 = z;
                            f5 = f;
                        }
                    } else {
                        i11 = -1;
                    }
                    z = false;
                    if (z13) {
                        int i472 = ((((layoutParams3.gravity >= 0 ? this.mGravity : layoutParams3.gravity) & 112) >> 4) & (-2)) >> 1;
                        iArr2[i472] = Math.max(iArr2[i472], baseline);
                        iArr[i472] = Math.max(iArr[i472], measuredHeight3 - baseline);
                    }
                    i39 = max3;
                    z9 = z;
                    f5 = f;
                }
                i42++;
                i38 = i8;
                virtualChildCount = i9;
            }
            i5 = virtualChildCount;
            i6 = i2;
            this.mTotalLength += getPaddingLeft() + getPaddingRight();
            max = (iArr2[1] == -1 && iArr2[0] == -1 && iArr2[2] == -1 && iArr2[3] == -1) ? i41 : Math.max(i41, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
            i3 = i40;
            i7 = i39;
        } else {
            i7 = Math.max(i33, i34);
            if (z12 && mode != 1073741824) {
                for (int i48 = 0; i48 < virtualChildCount; i48++) {
                    View virtualChildAt4 = getVirtualChildAt(i48);
                    if (virtualChildAt4 != null && virtualChildAt4.getVisibility() != 8 && ((LayoutParams) virtualChildAt4.getLayoutParams()).weight > 0.0f) {
                        virtualChildAt4.measure(View.MeasureSpec.makeMeasureSpec(i21, CrashUtils.ErrorDialogData.SUPPRESSED), View.MeasureSpec.makeMeasureSpec(virtualChildAt4.getMeasuredHeight(), CrashUtils.ErrorDialogData.SUPPRESSED));
                    }
                }
            }
            i5 = virtualChildCount;
            max = i4;
            i6 = i2;
        }
        if (z9 || mode2 == 1073741824) {
            i7 = max;
        }
        setMeasuredDimension(resolveSizeAndState | (i3 & ViewCompat.MEASURED_STATE_MASK), View.resolveSizeAndState(Math.max(i7 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i6, i3 << 16));
        if (z10) {
            forceUniformHeight(i5, i);
        }
    }

    private void forceUniformHeight(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), CrashUtils.ErrorDialogData.SUPPRESSED);
        for (int i3 = 0; i3 < i; i3++) {
            View virtualChildAt = getVirtualChildAt(i3);
            if (virtualChildAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                if (layoutParams.height == -1) {
                    int i4 = layoutParams.width;
                    layoutParams.width = virtualChildAt.getMeasuredWidth();
                    measureChildWithMargins(virtualChildAt, i2, 0, makeMeasureSpec, 0);
                    layoutParams.width = i4;
                }
            }
        }
    }

    void measureChildBeforeLayout(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.mOrientation == 1) {
            layoutVertical(i, i2, i3, i4);
        } else {
            layoutHorizontal(i, i2, i3, i4);
        }
    }

    void layoutVertical(int i, int i2, int i3, int i4) {
        int paddingTop;
        int i5;
        int paddingLeft = getPaddingLeft();
        int i6 = i3 - i;
        int paddingRight = i6 - getPaddingRight();
        int paddingRight2 = (i6 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i7 = this.mGravity;
        int i8 = i7 & 112;
        int i9 = i7 & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        if (i8 == 16) {
            paddingTop = getPaddingTop() + (((i4 - i2) - this.mTotalLength) / 2);
        } else if (i8 == 80) {
            paddingTop = ((getPaddingTop() + i4) - i2) - this.mTotalLength;
        } else {
            paddingTop = getPaddingTop();
        }
        int i10 = 0;
        while (i10 < virtualChildCount) {
            View virtualChildAt = getVirtualChildAt(i10);
            if (virtualChildAt == null) {
                paddingTop += measureNullChild(i10);
            } else if (virtualChildAt.getVisibility() != 8) {
                int measuredWidth = virtualChildAt.getMeasuredWidth();
                int measuredHeight = virtualChildAt.getMeasuredHeight();
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                int i11 = layoutParams.gravity;
                if (i11 < 0) {
                    i11 = i9;
                }
                int absoluteGravity = GravityCompat.getAbsoluteGravity(i11, ViewCompat.getLayoutDirection(this)) & 7;
                if (absoluteGravity == 1) {
                    i5 = ((((paddingRight2 - measuredWidth) / 2) + paddingLeft) + layoutParams.leftMargin) - layoutParams.rightMargin;
                } else if (absoluteGravity == 5) {
                    i5 = (paddingRight - measuredWidth) - layoutParams.rightMargin;
                } else {
                    i5 = layoutParams.leftMargin + paddingLeft;
                }
                if (hasDividerBeforeChildAt(i10)) {
                    paddingTop += this.mDividerHeight;
                }
                int i12 = paddingTop + layoutParams.topMargin;
                setChildFrame(virtualChildAt, i5, i12 + getLocationOffset(virtualChildAt), measuredWidth, measuredHeight);
                int nextLocationOffset = i12 + measuredHeight + layoutParams.bottomMargin + getNextLocationOffset(virtualChildAt);
                i10 += getChildrenSkipCount(virtualChildAt, i10);
                paddingTop = nextLocationOffset;
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void layoutHorizontal(int i, int i2, int i3, int i4) {
        int paddingLeft;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean isLayoutRtl = ViewUtils.isLayoutRtl(this);
        int paddingTop = getPaddingTop();
        int i15 = i4 - i2;
        int paddingBottom = i15 - getPaddingBottom();
        int paddingBottom2 = (i15 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i16 = this.mGravity;
        int i17 = i16 & 112;
        boolean z = this.mBaselineAligned;
        int[] iArr = this.mMaxAscent;
        int[] iArr2 = this.mMaxDescent;
        int absoluteGravity = GravityCompat.getAbsoluteGravity(8388615 & i16, ViewCompat.getLayoutDirection(this));
        if (absoluteGravity == 1) {
            paddingLeft = getPaddingLeft() + (((i3 - i) - this.mTotalLength) / 2);
        } else if (absoluteGravity == 5) {
            paddingLeft = ((getPaddingLeft() + i3) - i) - this.mTotalLength;
        } else {
            paddingLeft = getPaddingLeft();
        }
        if (isLayoutRtl) {
            i5 = virtualChildCount - 1;
            i6 = -1;
        } else {
            i5 = 0;
            i6 = 1;
        }
        int i18 = 0;
        while (i18 < virtualChildCount) {
            int i19 = i5 + (i6 * i18);
            View virtualChildAt = getVirtualChildAt(i19);
            if (virtualChildAt == null) {
                paddingLeft += measureNullChild(i19);
                i7 = paddingTop;
                i8 = virtualChildCount;
                i9 = i17;
            } else if (virtualChildAt.getVisibility() != 8) {
                int measuredWidth = virtualChildAt.getMeasuredWidth();
                int measuredHeight = virtualChildAt.getMeasuredHeight();
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                if (z) {
                    i10 = i18;
                    i8 = virtualChildCount;
                    if (layoutParams.height != -1) {
                        i11 = virtualChildAt.getBaseline();
                        i12 = layoutParams.gravity;
                        if (i12 < 0) {
                            i12 = i17;
                        }
                        i13 = i12 & 112;
                        i9 = i17;
                        if (i13 != 16) {
                            i14 = ((((paddingBottom2 - measuredHeight) / 2) + paddingTop) + layoutParams.topMargin) - layoutParams.bottomMargin;
                        } else if (i13 == 48) {
                            int i20 = layoutParams.topMargin + paddingTop;
                            i14 = i11 != -1 ? i20 + (iArr[1] - i11) : i20;
                        } else if (i13 != 80) {
                            i14 = paddingTop;
                        } else {
                            int i21 = (paddingBottom - measuredHeight) - layoutParams.bottomMargin;
                            i14 = i11 != -1 ? i21 - (iArr2[2] - (virtualChildAt.getMeasuredHeight() - i11)) : i21;
                        }
                        if (hasDividerBeforeChildAt(i19)) {
                            paddingLeft += this.mDividerWidth;
                        }
                        int i22 = layoutParams.leftMargin + paddingLeft;
                        i7 = paddingTop;
                        setChildFrame(virtualChildAt, i22 + getLocationOffset(virtualChildAt), i14, measuredWidth, measuredHeight);
                        int nextLocationOffset = i22 + measuredWidth + layoutParams.rightMargin + getNextLocationOffset(virtualChildAt);
                        i18 = i10 + getChildrenSkipCount(virtualChildAt, i19);
                        paddingLeft = nextLocationOffset;
                    }
                } else {
                    i10 = i18;
                    i8 = virtualChildCount;
                }
                i11 = -1;
                i12 = layoutParams.gravity;
                if (i12 < 0) {
                }
                i13 = i12 & 112;
                i9 = i17;
                if (i13 != 16) {
                }
                if (hasDividerBeforeChildAt(i19)) {
                }
                int i222 = layoutParams.leftMargin + paddingLeft;
                i7 = paddingTop;
                setChildFrame(virtualChildAt, i222 + getLocationOffset(virtualChildAt), i14, measuredWidth, measuredHeight);
                int nextLocationOffset2 = i222 + measuredWidth + layoutParams.rightMargin + getNextLocationOffset(virtualChildAt);
                i18 = i10 + getChildrenSkipCount(virtualChildAt, i19);
                paddingLeft = nextLocationOffset2;
            } else {
                i7 = paddingTop;
                i8 = virtualChildCount;
                i9 = i17;
            }
            i18++;
            virtualChildCount = i8;
            i17 = i9;
            paddingTop = i7;
        }
    }

    private void setChildFrame(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    public void setOrientation(int i) {
        if (this.mOrientation != i) {
            this.mOrientation = i;
            requestLayout();
        }
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public void setGravity(int i) {
        if (this.mGravity != i) {
            if ((8388615 & i) == 0) {
                i |= GravityCompat.START;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.mGravity = i;
            requestLayout();
        }
    }

    public int getGravity() {
        return this.mGravity;
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        int i3 = this.mGravity;
        if ((8388615 & i3) != i2) {
            this.mGravity = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.mGravity;
        if ((i3 & 112) != i2) {
            this.mGravity = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        int i = this.mOrientation;
        if (i == 0) {
            return new LayoutParams(-2, -2);
        }
        if (i == 1) {
            return new LayoutParams(-1, -2);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(LinearLayoutCompat.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(LinearLayoutCompat.class.getName());
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public int gravity;
        public float weight;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.gravity = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.LinearLayoutCompat_Layout);
            this.weight = obtainStyledAttributes.getFloat(R.styleable.LinearLayoutCompat_Layout_android_layout_weight, 0.0f);
            this.gravity = obtainStyledAttributes.getInt(R.styleable.LinearLayoutCompat_Layout_android_layout_gravity, -1);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.gravity = -1;
            this.weight = 0.0f;
        }

        public LayoutParams(int i, int i2, float f) {
            super(i, i2);
            this.gravity = -1;
            this.weight = f;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.gravity = -1;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.gravity = -1;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.gravity = -1;
            this.weight = layoutParams.weight;
            this.gravity = layoutParams.gravity;
        }
    }
}
