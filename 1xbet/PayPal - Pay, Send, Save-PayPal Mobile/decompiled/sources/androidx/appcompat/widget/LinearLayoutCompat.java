package androidx.appcompat.widget;

/* loaded from: classes3.dex */
public class LinearLayoutCompat extends android.view.ViewGroup {
    private static final java.lang.String ACCESSIBILITY_CLASS_NAME = "androidx.appcompat.widget.LinearLayoutCompat";
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
    private android.graphics.drawable.Drawable mDivider;
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

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface DividerMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface OrientationMode {
    }

    int getChildrenSkipCount(android.view.View view, int i) {
        return 0;
    }

    int getLocationOffset(android.view.View view) {
        return 0;
    }

    int getNextLocationOffset(android.view.View view) {
        return 0;
    }

    int measureNullChild(int i) {
        return 0;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* loaded from: classes5.dex */
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<androidx.appcompat.widget.LinearLayoutCompat> {
        private int Camera2StreamConfigurationMap;
        private int getHighResolutionOutputSizeshNQ4ISI;
        private int getHighSpeedVideoFpsRanges;
        private int getHighSpeedVideoFpsRangesFor;
        private int getHighSpeedVideoSizes;
        private int getHighSpeedVideoSizesFor;
        private int getInputFormats;
        private int getInputSizeshNQ4ISI;
        private int getOutputFormats;
        private boolean getOutputMinFrameDuration = false;

        @Override // android.view.inspector.InspectionCompanion
        public final void mapProperties(android.view.inspector.PropertyMapper propertyMapper) {
            this.getHighSpeedVideoFpsRanges = propertyMapper.mapBoolean("baselineAligned", android.R.attr.baselineAligned);
            this.getHighSpeedVideoFpsRangesFor = propertyMapper.mapInt("baselineAlignedChildIndex", android.R.attr.baselineAlignedChildIndex);
            this.getHighResolutionOutputSizeshNQ4ISI = propertyMapper.mapGravity("gravity", android.R.attr.gravity);
            this.getOutputFormats = propertyMapper.mapIntEnum("orientation", android.R.attr.orientation, new java.util.function.IntFunction<java.lang.String>() { // from class: androidx.appcompat.widget.LinearLayoutCompat.InspectionCompanion.1
                @Override // java.util.function.IntFunction
                /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                public java.lang.String apply(int i) {
                    if (i == 0) {
                        return "horizontal";
                    }
                    if (i == 1) {
                        return "vertical";
                    }
                    return java.lang.String.valueOf(i);
                }
            });
            this.getInputSizeshNQ4ISI = propertyMapper.mapFloat("weightSum", android.R.attr.weightSum);
            this.Camera2StreamConfigurationMap = propertyMapper.mapObject("divider", androidx.appcompat.R.attr.divider);
            this.getHighSpeedVideoSizes = propertyMapper.mapInt("dividerPadding", androidx.appcompat.R.attr.dividerPadding);
            this.getHighSpeedVideoSizesFor = propertyMapper.mapBoolean("measureWithLargestChild", androidx.appcompat.R.attr.measureWithLargestChild);
            this.getInputFormats = propertyMapper.mapIntFlag("showDividers", androidx.appcompat.R.attr.showDividers, new java.util.function.IntFunction<java.util.Set<java.lang.String>>() { // from class: androidx.appcompat.widget.LinearLayoutCompat.InspectionCompanion.2
                @Override // java.util.function.IntFunction
                /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                public java.util.Set<java.lang.String> apply(int i) {
                    java.util.HashSet hashSet = new java.util.HashSet();
                    if (i == 0) {
                        hashSet.add("none");
                    }
                    if (i == 1) {
                        hashSet.add("beginning");
                    }
                    if (i == 2) {
                        hashSet.add(com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselConstants.PositionIds.MIDDLE);
                    }
                    if (i == 4) {
                        hashSet.add("end");
                    }
                    return hashSet;
                }
            });
            this.getOutputMinFrameDuration = true;
        }

        @Override // android.view.inspector.InspectionCompanion
        public final void readProperties(androidx.appcompat.widget.LinearLayoutCompat linearLayoutCompat, android.view.inspector.PropertyReader propertyReader) {
            if (!this.getOutputMinFrameDuration) {
                throw new android.view.inspector.InspectionCompanion.UninitializedPropertyMapException();
            }
            propertyReader.readBoolean(this.getHighSpeedVideoFpsRanges, linearLayoutCompat.isBaselineAligned());
            propertyReader.readInt(this.getHighSpeedVideoFpsRangesFor, linearLayoutCompat.getBaselineAlignedChildIndex());
            propertyReader.readGravity(this.getHighResolutionOutputSizeshNQ4ISI, linearLayoutCompat.getGravity());
            propertyReader.readIntEnum(this.getOutputFormats, linearLayoutCompat.getOrientation());
            propertyReader.readFloat(this.getInputSizeshNQ4ISI, linearLayoutCompat.getWeightSum());
            propertyReader.readObject(this.Camera2StreamConfigurationMap, linearLayoutCompat.getDividerDrawable());
            propertyReader.readInt(this.getHighSpeedVideoSizes, linearLayoutCompat.getDividerPadding());
            propertyReader.readBoolean(this.getHighSpeedVideoSizesFor, linearLayoutCompat.isMeasureWithLargestChildEnabled());
            propertyReader.readIntFlag(this.getInputFormats, linearLayoutCompat.getShowDividers());
        }
    }

    public LinearLayoutCompat(android.content.Context context) {
        this(context, null);
    }

    public LinearLayoutCompat(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mBaselineAligned = true;
        this.mBaselineAlignedChildIndex = -1;
        this.mBaselineChildTop = 0;
        this.mGravity = 8388659;
        androidx.appcompat.widget.TintTypedArray obtainStyledAttributes = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(context, attributeSet, androidx.appcompat.R.styleable.LinearLayoutCompat, i, 0);
        androidx.core.view.ViewCompat.saveAttributeDataForStyleable(this, context, androidx.appcompat.R.styleable.LinearLayoutCompat, attributeSet, obtainStyledAttributes.getWrappedTypeArray(), i, 0);
        int i2 = obtainStyledAttributes.getInt(androidx.appcompat.R.styleable.LinearLayoutCompat_android_orientation, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = obtainStyledAttributes.getInt(androidx.appcompat.R.styleable.LinearLayoutCompat_android_gravity, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        boolean z = obtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.LinearLayoutCompat_android_baselineAligned, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.mWeightSum = obtainStyledAttributes.getFloat(androidx.appcompat.R.styleable.LinearLayoutCompat_android_weightSum, -1.0f);
        this.mBaselineAlignedChildIndex = obtainStyledAttributes.getInt(androidx.appcompat.R.styleable.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.mUseLargestChild = obtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(obtainStyledAttributes.getDrawable(androidx.appcompat.R.styleable.LinearLayoutCompat_divider));
        this.mShowDividers = obtainStyledAttributes.getInt(androidx.appcompat.R.styleable.LinearLayoutCompat_showDividers, 0);
        this.mDividerPadding = obtainStyledAttributes.getDimensionPixelSize(androidx.appcompat.R.styleable.LinearLayoutCompat_dividerPadding, 0);
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

    public android.graphics.drawable.Drawable getDividerDrawable() {
        return this.mDivider;
    }

    public void setDividerDrawable(android.graphics.drawable.Drawable drawable) {
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

    public int getDividerWidth() {
        return this.mDividerWidth;
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        if (this.mDivider == null) {
            return;
        }
        if (this.mOrientation == 1) {
            drawDividersVertical(canvas);
        } else {
            drawDividersHorizontal(canvas);
        }
    }

    void drawDividersVertical(android.graphics.Canvas canvas) {
        int bottom;
        int virtualChildCount = getVirtualChildCount();
        for (int i = 0; i < virtualChildCount; i++) {
            android.view.View virtualChildAt = getVirtualChildAt(i);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i)) {
                drawHorizontalDivider(canvas, (virtualChildAt.getTop() - ((androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) virtualChildAt.getLayoutParams()).topMargin) - this.mDividerHeight);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            android.view.View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 == null) {
                bottom = (getHeight() - getPaddingBottom()) - this.mDividerHeight;
            } else {
                bottom = virtualChildAt2.getBottom() + ((androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) virtualChildAt2.getLayoutParams()).bottomMargin;
            }
            drawHorizontalDivider(canvas, bottom);
        }
    }

    void drawDividersHorizontal(android.graphics.Canvas canvas) {
        int right;
        int left;
        int i;
        int left2;
        int virtualChildCount = getVirtualChildCount();
        boolean isLayoutRtl = androidx.appcompat.widget.ViewUtils.isLayoutRtl(this);
        for (int i2 = 0; i2 < virtualChildCount; i2++) {
            android.view.View virtualChildAt = getVirtualChildAt(i2);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i2)) {
                androidx.appcompat.widget.LinearLayoutCompat.LayoutParams layoutParams = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) virtualChildAt.getLayoutParams();
                if (isLayoutRtl) {
                    left2 = virtualChildAt.getRight() + layoutParams.rightMargin;
                } else {
                    left2 = (virtualChildAt.getLeft() - layoutParams.leftMargin) - this.mDividerWidth;
                }
                drawVerticalDivider(canvas, left2);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            android.view.View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 != null) {
                androidx.appcompat.widget.LinearLayoutCompat.LayoutParams layoutParams2 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) virtualChildAt2.getLayoutParams();
                if (isLayoutRtl) {
                    left = virtualChildAt2.getLeft() - layoutParams2.leftMargin;
                    i = this.mDividerWidth;
                    right = left - i;
                } else {
                    right = virtualChildAt2.getRight() + layoutParams2.rightMargin;
                }
            } else if (isLayoutRtl) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.mDividerWidth;
                right = left - i;
            }
            drawVerticalDivider(canvas, right);
        }
    }

    void drawHorizontalDivider(android.graphics.Canvas canvas, int i) {
        android.graphics.drawable.Drawable drawable = this.mDivider;
        int paddingLeft = getPaddingLeft();
        int i2 = this.mDividerPadding;
        int width = getWidth();
        int paddingRight = getPaddingRight();
        drawable.setBounds(paddingLeft + i2, i, (width - paddingRight) - this.mDividerPadding, this.mDividerHeight + i);
        this.mDivider.draw(canvas);
    }

    void drawVerticalDivider(android.graphics.Canvas canvas, int i) {
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
            throw new java.lang.RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        android.view.View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.mBaselineAlignedChildIndex == 0) {
                return -1;
            }
            throw new java.lang.RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i3 = this.mBaselineChildTop;
        if (this.mOrientation == 1 && (i = this.mGravity & 112) != 48) {
            if (i == 16) {
                i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.mTotalLength) / 2;
            } else if (i == 80) {
                i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.mTotalLength;
            }
        }
        return i3 + ((androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) childAt.getLayoutParams()).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.mBaselineAlignedChildIndex;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("base aligned child index out of range (0, ");
            sb.append(getChildCount());
            sb.append(")");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        this.mBaselineAlignedChildIndex = i;
    }

    android.view.View getVirtualChildAt(int i) {
        return getChildAt(i);
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.mWeightSum;
    }

    public void setWeightSum(float f) {
        this.mWeightSum = java.lang.Math.max(0.0f, f);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.mOrientation == 1) {
            measureVertical(i, i2);
        } else {
            measureHorizontal(i, i2);
        }
    }

    protected boolean hasDividerBeforeChildAt(int i) {
        if (i == 0) {
            return (this.mShowDividers & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.mShowDividers & 4) != 0;
        }
        if ((this.mShowDividers & 2) != 0) {
            do {
                i--;
                if (i >= 0) {
                }
            } while (getChildAt(i).getVisibility() == 8);
            return true;
        }
        return false;
    }

    void measureVertical(int i, int i2) {
        int i3;
        int i4;
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
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z;
        this.mTotalLength = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = android.view.View.MeasureSpec.getMode(i);
        int mode2 = android.view.View.MeasureSpec.getMode(i2);
        int i19 = this.mBaselineAlignedChildIndex;
        boolean z2 = this.mUseLargestChild;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        boolean z3 = false;
        boolean z4 = false;
        float f = 0.0f;
        boolean z5 = true;
        while (true) {
            int i26 = 8;
            int i27 = i23;
            if (i25 < virtualChildCount) {
                android.view.View virtualChildAt = getVirtualChildAt(i25);
                if (virtualChildAt == null) {
                    this.mTotalLength += measureNullChild(i25);
                    i10 = i20;
                } else {
                    i10 = i20;
                    if (virtualChildAt.getVisibility() == 8) {
                        i25 += getChildrenSkipCount(virtualChildAt, i25);
                    } else {
                        if (hasDividerBeforeChildAt(i25)) {
                            this.mTotalLength += this.mDividerHeight;
                        }
                        androidx.appcompat.widget.LinearLayoutCompat.LayoutParams layoutParams = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) virtualChildAt.getLayoutParams();
                        float f2 = f + layoutParams.weight;
                        if (mode2 == 1073741824 && layoutParams.height == 0 && layoutParams.weight > 0.0f) {
                            int i28 = this.mTotalLength;
                            this.mTotalLength = java.lang.Math.max(i28, layoutParams.topMargin + i28 + layoutParams.bottomMargin);
                            i13 = i22;
                            i18 = i25;
                            i16 = virtualChildCount;
                            z3 = true;
                            i17 = i10;
                            i12 = i21;
                            i14 = mode2;
                            i15 = i27;
                        } else {
                            int i29 = i21;
                            if (layoutParams.height != 0 || layoutParams.weight <= 0.0f) {
                                i11 = Integer.MIN_VALUE;
                            } else {
                                layoutParams.height = -2;
                                i11 = 0;
                            }
                            int i30 = i11;
                            i12 = i29;
                            i13 = i22;
                            i14 = mode2;
                            i15 = i27;
                            i16 = virtualChildCount;
                            int i31 = i24;
                            i17 = i10;
                            i18 = i25;
                            measureChildBeforeLayout(virtualChildAt, i25, i, 0, i2, f2 == 0.0f ? this.mTotalLength : 0);
                            if (i30 != Integer.MIN_VALUE) {
                                layoutParams.height = i30;
                            }
                            int measuredHeight = virtualChildAt.getMeasuredHeight();
                            int i32 = this.mTotalLength;
                            virtualChildAt = virtualChildAt;
                            this.mTotalLength = java.lang.Math.max(i32, i32 + measuredHeight + layoutParams.topMargin + layoutParams.bottomMargin + getNextLocationOffset(virtualChildAt));
                            i24 = z2 ? java.lang.Math.max(measuredHeight, i31) : i31;
                        }
                        if (i19 >= 0 && i19 == i18 + 1) {
                            this.mBaselineChildTop = this.mTotalLength;
                        }
                        if (i18 < i19 && layoutParams.weight > 0.0f) {
                            throw new java.lang.RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        }
                        if (mode == 1073741824 || layoutParams.width != -1) {
                            z = false;
                        } else {
                            z = true;
                            z4 = true;
                        }
                        int i33 = layoutParams.leftMargin + layoutParams.rightMargin;
                        int measuredWidth = virtualChildAt.getMeasuredWidth() + i33;
                        int max = java.lang.Math.max(i15, measuredWidth);
                        int combineMeasuredStates = android.view.View.combineMeasuredStates(i13, virtualChildAt.getMeasuredState());
                        z5 = z5 && layoutParams.width == -1;
                        if (layoutParams.weight > 0.0f) {
                            if (!z) {
                                i33 = measuredWidth;
                            }
                            i20 = java.lang.Math.max(i17, i33);
                            i21 = i12;
                        } else {
                            int i34 = i17;
                            if (!z) {
                                i33 = measuredWidth;
                            }
                            i21 = java.lang.Math.max(i12, i33);
                            i20 = i34;
                        }
                        int childrenSkipCount = getChildrenSkipCount(virtualChildAt, i18) + i18;
                        i23 = max;
                        i22 = combineMeasuredStates;
                        i25 = childrenSkipCount;
                        f = f2;
                        i25++;
                        virtualChildCount = i16;
                        mode2 = i14;
                    }
                }
                i16 = virtualChildCount;
                i23 = i27;
                i20 = i10;
                i14 = mode2;
                i25++;
                virtualChildCount = i16;
                mode2 = i14;
            } else {
                int i35 = i22;
                int i36 = virtualChildCount;
                int i37 = mode2;
                int i38 = i27;
                int i39 = i24;
                if (this.mTotalLength > 0) {
                    i3 = i36;
                    if (hasDividerBeforeChildAt(i3)) {
                        this.mTotalLength += this.mDividerHeight;
                    }
                } else {
                    i3 = i36;
                }
                if (z2 && (i37 == Integer.MIN_VALUE || i37 == 0)) {
                    this.mTotalLength = 0;
                    int i40 = 0;
                    while (i40 < i3) {
                        android.view.View virtualChildAt2 = getVirtualChildAt(i40);
                        if (virtualChildAt2 == null) {
                            this.mTotalLength += measureNullChild(i40);
                        } else if (virtualChildAt2.getVisibility() == i26) {
                            i40 += getChildrenSkipCount(virtualChildAt2, i40);
                        } else {
                            androidx.appcompat.widget.LinearLayoutCompat.LayoutParams layoutParams2 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) virtualChildAt2.getLayoutParams();
                            int i41 = this.mTotalLength;
                            this.mTotalLength = java.lang.Math.max(i41, i41 + i39 + layoutParams2.topMargin + layoutParams2.bottomMargin + getNextLocationOffset(virtualChildAt2));
                        }
                        i40++;
                        i26 = 8;
                    }
                }
                int paddingTop = this.mTotalLength + getPaddingTop() + getPaddingBottom();
                this.mTotalLength = paddingTop;
                int i42 = i35;
                int resolveSizeAndState = android.view.View.resolveSizeAndState(java.lang.Math.max(paddingTop, getSuggestedMinimumHeight()), i2, 0);
                int i43 = (16777215 & resolveSizeAndState) - this.mTotalLength;
                if (z3 || (i43 != 0 && f > 0.0f)) {
                    float f3 = this.mWeightSum;
                    if (f3 > 0.0f) {
                        f = f3;
                    }
                    this.mTotalLength = 0;
                    int i44 = i43;
                    int i45 = 0;
                    while (i45 < i3) {
                        android.view.View virtualChildAt3 = getVirtualChildAt(i45);
                        if (virtualChildAt3.getVisibility() == 8) {
                            i7 = i3;
                        } else {
                            androidx.appcompat.widget.LinearLayoutCompat.LayoutParams layoutParams3 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) virtualChildAt3.getLayoutParams();
                            float f4 = layoutParams3.weight;
                            if (f4 > 0.0f) {
                                int i46 = (int) ((i44 * f4) / f);
                                float f5 = f - f4;
                                int i47 = i44 - i46;
                                i7 = i3;
                                int childMeasureSpec = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams3.leftMargin + layoutParams3.rightMargin, layoutParams3.width);
                                if (layoutParams3.height == 0) {
                                    i9 = 1073741824;
                                    if (i37 == 1073741824) {
                                        if (i46 <= 0) {
                                            i46 = 0;
                                        }
                                        virtualChildAt3.measure(childMeasureSpec, android.view.View.MeasureSpec.makeMeasureSpec(i46, 1073741824));
                                        i42 = android.view.View.combineMeasuredStates(i42, virtualChildAt3.getMeasuredState() & (-256));
                                        f = f5;
                                        i44 = i47;
                                    }
                                } else {
                                    i9 = 1073741824;
                                }
                                int measuredHeight2 = virtualChildAt3.getMeasuredHeight() + i46;
                                if (measuredHeight2 < 0) {
                                    measuredHeight2 = 0;
                                }
                                virtualChildAt3.measure(childMeasureSpec, android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight2, i9));
                                i42 = android.view.View.combineMeasuredStates(i42, virtualChildAt3.getMeasuredState() & (-256));
                                f = f5;
                                i44 = i47;
                            } else {
                                i7 = i3;
                            }
                            int i48 = layoutParams3.leftMargin + layoutParams3.rightMargin;
                            int measuredWidth2 = virtualChildAt3.getMeasuredWidth() + i48;
                            i38 = java.lang.Math.max(i38, measuredWidth2);
                            float f6 = f;
                            if (mode != 1073741824) {
                                i8 = -1;
                                if (layoutParams3.width == -1) {
                                    measuredWidth2 = i48;
                                }
                            } else {
                                i8 = -1;
                            }
                            int max2 = java.lang.Math.max(i21, measuredWidth2);
                            boolean z6 = z5 && layoutParams3.width == i8;
                            int i49 = this.mTotalLength;
                            this.mTotalLength = java.lang.Math.max(i49, virtualChildAt3.getMeasuredHeight() + i49 + layoutParams3.topMargin + layoutParams3.bottomMargin + getNextLocationOffset(virtualChildAt3));
                            z5 = z6;
                            i21 = max2;
                            f = f6;
                        }
                        i45++;
                        i3 = i7;
                    }
                    i4 = i;
                    i5 = i3;
                    this.mTotalLength += getPaddingTop() + getPaddingBottom();
                    i6 = i21;
                } else {
                    i6 = java.lang.Math.max(i21, i20);
                    if (z2 && i37 != 1073741824) {
                        for (int i50 = 0; i50 < i3; i50++) {
                            android.view.View virtualChildAt4 = getVirtualChildAt(i50);
                            if (virtualChildAt4 != null && virtualChildAt4.getVisibility() != 8 && ((androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) virtualChildAt4.getLayoutParams()).weight > 0.0f) {
                                virtualChildAt4.measure(android.view.View.MeasureSpec.makeMeasureSpec(virtualChildAt4.getMeasuredWidth(), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(i39, 1073741824));
                            }
                        }
                    }
                    i4 = i;
                    i5 = i3;
                }
                int i51 = i42;
                int i52 = i38;
                if (z5 || mode == 1073741824) {
                    i6 = i52;
                }
                setMeasuredDimension(android.view.View.resolveSizeAndState(java.lang.Math.max(i6 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i4, i51), resolveSizeAndState);
                if (z4) {
                    forceUniformWidth(i5, i2);
                    return;
                }
                return;
            }
        }
    }

    private void forceUniformWidth(int i, int i2) {
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            android.view.View virtualChildAt = getVirtualChildAt(i3);
            if (virtualChildAt.getVisibility() != 8) {
                androidx.appcompat.widget.LinearLayoutCompat.LayoutParams layoutParams = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) virtualChildAt.getLayoutParams();
                if (layoutParams.width == -1) {
                    int i4 = layoutParams.height;
                    layoutParams.height = virtualChildAt.getMeasuredHeight();
                    measureChildWithMargins(virtualChildAt, makeMeasureSpec, 0, i2, 0);
                    layoutParams.height = i4;
                }
            }
        }
    }

    void measureHorizontal(int i, int i2) {
        int[] iArr;
        int i3;
        int max;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        float f;
        int i9;
        int i10;
        boolean z;
        int baseline;
        int i11;
        char c;
        int i12;
        int i13;
        boolean z2;
        boolean z3;
        android.view.View view;
        boolean z4;
        int baseline2;
        this.mTotalLength = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = android.view.View.MeasureSpec.getMode(i);
        int mode2 = android.view.View.MeasureSpec.getMode(i2);
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
        int i14 = 1073741824;
        boolean z7 = mode == 1073741824;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        boolean z8 = false;
        int i18 = 0;
        int i19 = 0;
        boolean z9 = false;
        int i20 = 0;
        boolean z10 = true;
        float f2 = 0.0f;
        while (true) {
            iArr = iArr3;
            if (i15 >= virtualChildCount) {
                break;
            }
            android.view.View virtualChildAt = getVirtualChildAt(i15);
            if (virtualChildAt == null) {
                this.mTotalLength += measureNullChild(i15);
            } else if (virtualChildAt.getVisibility() == 8) {
                i15 += getChildrenSkipCount(virtualChildAt, i15);
            } else {
                if (hasDividerBeforeChildAt(i15)) {
                    this.mTotalLength += this.mDividerWidth;
                }
                androidx.appcompat.widget.LinearLayoutCompat.LayoutParams layoutParams = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) virtualChildAt.getLayoutParams();
                float f3 = f2 + layoutParams.weight;
                if (mode == i14 && layoutParams.width == 0 && layoutParams.weight > 0.0f) {
                    if (z7) {
                        this.mTotalLength += layoutParams.leftMargin + layoutParams.rightMargin;
                    } else {
                        int i21 = this.mTotalLength;
                        this.mTotalLength = java.lang.Math.max(i21, layoutParams.leftMargin + i21 + layoutParams.rightMargin);
                    }
                    if (z5) {
                        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                        virtualChildAt.measure(makeMeasureSpec, makeMeasureSpec);
                    } else {
                        z8 = true;
                    }
                    i13 = i15;
                    z2 = z6;
                    z3 = z5;
                    view = virtualChildAt;
                    i14 = 1073741824;
                } else {
                    if (layoutParams.width != 0 || layoutParams.weight <= 0.0f) {
                        c = 65534;
                        i12 = Integer.MIN_VALUE;
                    } else {
                        c = 65534;
                        layoutParams.width = -2;
                        i12 = 0;
                    }
                    i13 = i15;
                    int i22 = i12;
                    z2 = z6;
                    z3 = z5;
                    measureChildBeforeLayout(virtualChildAt, i13, i, f3 == 0.0f ? this.mTotalLength : 0, i2, 0);
                    if (i22 != Integer.MIN_VALUE) {
                        layoutParams.width = i22;
                    }
                    int measuredWidth = virtualChildAt.getMeasuredWidth();
                    if (z7) {
                        view = virtualChildAt;
                        this.mTotalLength += layoutParams.leftMargin + measuredWidth + layoutParams.rightMargin + getNextLocationOffset(view);
                    } else {
                        view = virtualChildAt;
                        int i23 = this.mTotalLength;
                        this.mTotalLength = java.lang.Math.max(i23, i23 + measuredWidth + layoutParams.leftMargin + layoutParams.rightMargin + getNextLocationOffset(view));
                    }
                    int i24 = i20;
                    if (z2) {
                        i20 = java.lang.Math.max(measuredWidth, i24);
                    }
                    i14 = 1073741824;
                }
                if (mode2 == i14 || layoutParams.height != -1) {
                    z4 = false;
                } else {
                    z4 = true;
                    z9 = true;
                }
                int i25 = layoutParams.topMargin + layoutParams.bottomMargin;
                int measuredHeight = view.getMeasuredHeight() + i25;
                i16 = android.view.View.combineMeasuredStates(i16, view.getMeasuredState());
                if (z3 && (baseline2 = view.getBaseline()) != -1) {
                    int i26 = ((((layoutParams.gravity < 0 ? this.mGravity : layoutParams.gravity) & 112) >> 4) & (-2)) >> 1;
                    iArr2[i26] = java.lang.Math.max(iArr2[i26], baseline2);
                    iArr[i26] = java.lang.Math.max(iArr[i26], measuredHeight - baseline2);
                }
                i17 = java.lang.Math.max(i17, measuredHeight);
                z10 = z10 && layoutParams.height == -1;
                if (layoutParams.weight > 0.0f) {
                    if (!z4) {
                        i25 = measuredHeight;
                    }
                    i19 = java.lang.Math.max(i19, i25);
                } else {
                    int i27 = i19;
                    if (!z4) {
                        i25 = measuredHeight;
                    }
                    i18 = java.lang.Math.max(i18, i25);
                    i19 = i27;
                }
                int i28 = i13;
                i15 = i28 + getChildrenSkipCount(view, i28);
                f2 = f3;
                i15++;
                iArr3 = iArr;
                z6 = z2;
                z5 = z3;
            }
            z2 = z6;
            z3 = z5;
            i15++;
            iArr3 = iArr;
            z6 = z2;
            z5 = z3;
        }
        boolean z11 = z6;
        boolean z12 = z5;
        int i29 = i17;
        int i30 = i18;
        int i31 = i19;
        int i32 = i20;
        if (this.mTotalLength > 0 && hasDividerBeforeChildAt(virtualChildCount)) {
            this.mTotalLength += this.mDividerWidth;
        }
        int i33 = iArr2[1];
        if (i33 == -1 && iArr2[0] == -1 && iArr2[2] == -1 && iArr2[3] == -1) {
            max = i29;
            i3 = i16;
        } else {
            i3 = i16;
            max = java.lang.Math.max(i29, java.lang.Math.max(iArr2[3], java.lang.Math.max(iArr2[0], java.lang.Math.max(i33, iArr2[2]))) + java.lang.Math.max(iArr[3], java.lang.Math.max(iArr[0], java.lang.Math.max(iArr[1], iArr[2]))));
        }
        if (z11 && (mode == Integer.MIN_VALUE || mode == 0)) {
            this.mTotalLength = 0;
            int i34 = 0;
            while (i34 < virtualChildCount) {
                android.view.View virtualChildAt2 = getVirtualChildAt(i34);
                if (virtualChildAt2 == null) {
                    this.mTotalLength += measureNullChild(i34);
                } else if (virtualChildAt2.getVisibility() == 8) {
                    i34 += getChildrenSkipCount(virtualChildAt2, i34);
                } else {
                    androidx.appcompat.widget.LinearLayoutCompat.LayoutParams layoutParams2 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) virtualChildAt2.getLayoutParams();
                    if (z7) {
                        this.mTotalLength += layoutParams2.leftMargin + i32 + layoutParams2.rightMargin + getNextLocationOffset(virtualChildAt2);
                    } else {
                        int i35 = this.mTotalLength;
                        this.mTotalLength = java.lang.Math.max(i35, i35 + i32 + layoutParams2.leftMargin + layoutParams2.rightMargin + getNextLocationOffset(virtualChildAt2));
                    }
                }
                i34++;
            }
        }
        int paddingLeft = this.mTotalLength + getPaddingLeft() + getPaddingRight();
        this.mTotalLength = paddingLeft;
        int resolveSizeAndState = android.view.View.resolveSizeAndState(java.lang.Math.max(paddingLeft, getSuggestedMinimumWidth()), i, 0);
        int i36 = (16777215 & resolveSizeAndState) - this.mTotalLength;
        if (z8 || (i36 != 0 && f2 > 0.0f)) {
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
            max = -1;
            i4 = i3;
            int i37 = 0;
            while (i37 < virtualChildCount) {
                android.view.View virtualChildAt3 = getVirtualChildAt(i37);
                if (virtualChildAt3 == null || virtualChildAt3.getVisibility() == 8) {
                    i8 = virtualChildCount;
                } else {
                    androidx.appcompat.widget.LinearLayoutCompat.LayoutParams layoutParams3 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) virtualChildAt3.getLayoutParams();
                    float f5 = layoutParams3.weight;
                    if (f5 > 0.0f) {
                        int i38 = (int) ((i36 * f5) / f2);
                        float f6 = f2 - f5;
                        int i39 = i36 - i38;
                        i8 = virtualChildCount;
                        int childMeasureSpec = getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom() + layoutParams3.topMargin + layoutParams3.bottomMargin, layoutParams3.height);
                        if (layoutParams3.width == 0) {
                            i11 = 1073741824;
                            if (mode == 1073741824) {
                                if (i38 <= 0) {
                                    i38 = 0;
                                }
                                virtualChildAt3.measure(android.view.View.MeasureSpec.makeMeasureSpec(i38, 1073741824), childMeasureSpec);
                                i4 = android.view.View.combineMeasuredStates(i4, virtualChildAt3.getMeasuredState() & (-16777216));
                                f2 = f6;
                                i36 = i39;
                            }
                        } else {
                            i11 = 1073741824;
                        }
                        int measuredWidth2 = virtualChildAt3.getMeasuredWidth() + i38;
                        if (measuredWidth2 < 0) {
                            measuredWidth2 = 0;
                        }
                        virtualChildAt3.measure(android.view.View.MeasureSpec.makeMeasureSpec(measuredWidth2, i11), childMeasureSpec);
                        i4 = android.view.View.combineMeasuredStates(i4, virtualChildAt3.getMeasuredState() & (-16777216));
                        f2 = f6;
                        i36 = i39;
                    } else {
                        i8 = virtualChildCount;
                    }
                    if (z7) {
                        f = f2;
                        this.mTotalLength += virtualChildAt3.getMeasuredWidth() + layoutParams3.leftMargin + layoutParams3.rightMargin + getNextLocationOffset(virtualChildAt3);
                        i9 = i36;
                    } else {
                        f = f2;
                        int i40 = this.mTotalLength;
                        i9 = i36;
                        this.mTotalLength = java.lang.Math.max(i40, virtualChildAt3.getMeasuredWidth() + i40 + layoutParams3.leftMargin + layoutParams3.rightMargin + getNextLocationOffset(virtualChildAt3));
                    }
                    boolean z13 = mode2 != 1073741824 && layoutParams3.height == -1;
                    int i41 = layoutParams3.topMargin + layoutParams3.bottomMargin;
                    int measuredHeight2 = virtualChildAt3.getMeasuredHeight() + i41;
                    max = java.lang.Math.max(max, measuredHeight2);
                    if (!z13) {
                        i41 = measuredHeight2;
                    }
                    int max2 = java.lang.Math.max(i30, i41);
                    if (z10) {
                        i10 = -1;
                        if (layoutParams3.height == -1) {
                            z = true;
                            if (!z12 && (baseline = virtualChildAt3.getBaseline()) != i10) {
                                int i42 = ((((layoutParams3.gravity < 0 ? this.mGravity : layoutParams3.gravity) & 112) >> 4) & (-2)) >> 1;
                                iArr2[i42] = java.lang.Math.max(iArr2[i42], baseline);
                                iArr[i42] = java.lang.Math.max(iArr[i42], measuredHeight2 - baseline);
                            }
                            z10 = z;
                            i36 = i9;
                            i30 = max2;
                            f2 = f;
                        }
                    } else {
                        i10 = -1;
                    }
                    z = false;
                    if (!z12) {
                    }
                    z10 = z;
                    i36 = i9;
                    i30 = max2;
                    f2 = f;
                }
                i37++;
                virtualChildCount = i8;
            }
            i5 = i2;
            i6 = virtualChildCount;
            this.mTotalLength += getPaddingLeft() + getPaddingRight();
            int i43 = iArr2[1];
            if (i43 != -1 || iArr2[0] != -1 || iArr2[2] != -1 || iArr2[3] != -1) {
                max = java.lang.Math.max(max, java.lang.Math.max(iArr2[3], java.lang.Math.max(iArr2[0], java.lang.Math.max(i43, iArr2[2]))) + java.lang.Math.max(iArr[3], java.lang.Math.max(iArr[0], java.lang.Math.max(iArr[1], iArr[2]))));
            }
            i7 = i30;
        } else {
            i7 = java.lang.Math.max(i30, i31);
            if (z11 && mode != 1073741824) {
                for (int i44 = 0; i44 < virtualChildCount; i44++) {
                    android.view.View virtualChildAt4 = getVirtualChildAt(i44);
                    if (virtualChildAt4 != null && virtualChildAt4.getVisibility() != 8 && ((androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) virtualChildAt4.getLayoutParams()).weight > 0.0f) {
                        virtualChildAt4.measure(android.view.View.MeasureSpec.makeMeasureSpec(i32, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(virtualChildAt4.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i5 = i2;
            i6 = virtualChildCount;
            i4 = i3;
        }
        if (z10 || mode2 == 1073741824) {
            i7 = max;
        }
        setMeasuredDimension(((-16777216) & i4) | resolveSizeAndState, android.view.View.resolveSizeAndState(java.lang.Math.max(i7 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i5, i4 << 16));
        if (z9) {
            forceUniformHeight(i6, i);
        }
    }

    private void forceUniformHeight(int i, int i2) {
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            android.view.View virtualChildAt = getVirtualChildAt(i3);
            if (virtualChildAt.getVisibility() != 8) {
                androidx.appcompat.widget.LinearLayoutCompat.LayoutParams layoutParams = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) virtualChildAt.getLayoutParams();
                if (layoutParams.height == -1) {
                    int i4 = layoutParams.width;
                    layoutParams.width = virtualChildAt.getMeasuredWidth();
                    measureChildWithMargins(virtualChildAt, i2, 0, makeMeasureSpec, 0);
                    layoutParams.width = i4;
                }
            }
        }
    }

    void measureChildBeforeLayout(android.view.View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.mOrientation == 1) {
            layoutVertical(i, i2, i3, i4);
        } else {
            layoutHorizontal(i, i2, i3, i4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void layoutVertical(int i, int i2, int i3, int i4) {
        int paddingTop;
        int i5;
        int i6;
        int i7;
        int paddingLeft = getPaddingLeft();
        int i8 = i3 - i;
        int paddingRight = getPaddingRight();
        int paddingRight2 = getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i9 = this.mGravity;
        int i10 = i9 & 112;
        if (i10 == 16) {
            paddingTop = getPaddingTop() + (((i4 - i2) - this.mTotalLength) / 2);
        } else if (i10 == 80) {
            paddingTop = ((getPaddingTop() + i4) - i2) - this.mTotalLength;
        } else {
            paddingTop = getPaddingTop();
        }
        int i11 = 0;
        while (i11 < virtualChildCount) {
            android.view.View virtualChildAt = getVirtualChildAt(i11);
            if (virtualChildAt == null) {
                paddingTop += measureNullChild(i11);
            } else if (virtualChildAt.getVisibility() != 8) {
                int measuredWidth = virtualChildAt.getMeasuredWidth();
                int measuredHeight = virtualChildAt.getMeasuredHeight();
                androidx.appcompat.widget.LinearLayoutCompat.LayoutParams layoutParams = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) virtualChildAt.getLayoutParams();
                int i12 = layoutParams.gravity;
                if (i12 < 0) {
                    i12 = 8388615 & i9;
                }
                int absoluteGravity = androidx.core.view.GravityCompat.getAbsoluteGravity(i12, getLayoutDirection()) & 7;
                if (absoluteGravity == 1) {
                    i5 = ((((i8 - paddingLeft) - paddingRight2) - measuredWidth) / 2) + paddingLeft + layoutParams.leftMargin;
                    i6 = layoutParams.rightMargin;
                } else if (absoluteGravity == 5) {
                    i5 = (i8 - paddingRight) - measuredWidth;
                    i6 = layoutParams.rightMargin;
                } else {
                    i7 = layoutParams.leftMargin + paddingLeft;
                    int i13 = i7;
                    if (hasDividerBeforeChildAt(i11)) {
                        paddingTop += this.mDividerHeight;
                    }
                    int i14 = paddingTop + layoutParams.topMargin;
                    setChildFrame(virtualChildAt, i13, i14 + getLocationOffset(virtualChildAt), measuredWidth, measuredHeight);
                    int nextLocationOffset = i14 + measuredHeight + layoutParams.bottomMargin + getNextLocationOffset(virtualChildAt);
                    i11 += getChildrenSkipCount(virtualChildAt, i11);
                    paddingTop = nextLocationOffset;
                }
                i7 = i5 - i6;
                int i132 = i7;
                if (hasDividerBeforeChildAt(i11)) {
                }
                int i142 = paddingTop + layoutParams.topMargin;
                setChildFrame(virtualChildAt, i132, i142 + getLocationOffset(virtualChildAt), measuredWidth, measuredHeight);
                int nextLocationOffset2 = i142 + measuredHeight + layoutParams.bottomMargin + getNextLocationOffset(virtualChildAt);
                i11 += getChildrenSkipCount(virtualChildAt, i11);
                paddingTop = nextLocationOffset2;
            }
            i11++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e7  */
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
        boolean z;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int childrenSkipCount;
        boolean isLayoutRtl = androidx.appcompat.widget.ViewUtils.isLayoutRtl(this);
        int paddingTop = getPaddingTop();
        int i16 = i4 - i2;
        int paddingBottom = getPaddingBottom();
        int paddingBottom2 = getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i17 = this.mGravity;
        boolean z2 = this.mBaselineAligned;
        int[] iArr = this.mMaxAscent;
        int[] iArr2 = this.mMaxDescent;
        int absoluteGravity = androidx.core.view.GravityCompat.getAbsoluteGravity(8388615 & i17, getLayoutDirection());
        boolean z3 = true;
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
            android.view.View virtualChildAt = getVirtualChildAt(i19);
            if (virtualChildAt == null) {
                paddingLeft += measureNullChild(i19);
                i7 = i18;
                z = z3;
                i8 = paddingTop;
                i9 = virtualChildCount;
                i10 = i17;
            } else if (virtualChildAt.getVisibility() != 8) {
                int measuredWidth = virtualChildAt.getMeasuredWidth();
                int measuredHeight = virtualChildAt.getMeasuredHeight();
                androidx.appcompat.widget.LinearLayoutCompat.LayoutParams layoutParams = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) virtualChildAt.getLayoutParams();
                int i20 = i18;
                if (z2) {
                    i9 = virtualChildCount;
                    if (layoutParams.height != -1) {
                        i11 = virtualChildAt.getBaseline();
                        i12 = layoutParams.gravity;
                        if (i12 < 0) {
                            i12 = i17 & 112;
                        }
                        i13 = i12 & 112;
                        i10 = i17;
                        if (i13 != 16) {
                            z = true;
                            i14 = ((((i16 - paddingTop) - paddingBottom2) - measuredHeight) / 2) + paddingTop + layoutParams.topMargin;
                            i15 = layoutParams.bottomMargin;
                        } else {
                            if (i13 == 48) {
                                i14 = layoutParams.topMargin + paddingTop;
                                if (i11 != -1) {
                                    z = true;
                                    i14 += iArr[1] - i11;
                                    if (hasDividerBeforeChildAt(i19)) {
                                        paddingLeft += this.mDividerWidth;
                                    }
                                    int i21 = layoutParams.leftMargin + paddingLeft;
                                    i8 = paddingTop;
                                    setChildFrame(virtualChildAt, getLocationOffset(virtualChildAt) + i21, i14, measuredWidth, measuredHeight);
                                    int i22 = layoutParams.rightMargin;
                                    int nextLocationOffset = getNextLocationOffset(virtualChildAt);
                                    childrenSkipCount = getChildrenSkipCount(virtualChildAt, i19) + i20;
                                    paddingLeft = i21 + i22 + measuredWidth + nextLocationOffset;
                                    i18 = childrenSkipCount + 1;
                                    virtualChildCount = i9;
                                    i17 = i10;
                                    z3 = z;
                                    paddingTop = i8;
                                }
                            } else if (i13 == 80) {
                                i14 = ((i16 - paddingBottom) - measuredHeight) - layoutParams.bottomMargin;
                                if (i11 != -1) {
                                    i15 = iArr2[2] - (virtualChildAt.getMeasuredHeight() - i11);
                                    z = true;
                                }
                            } else {
                                i14 = paddingTop;
                            }
                            z = true;
                            if (hasDividerBeforeChildAt(i19)) {
                            }
                            int i212 = layoutParams.leftMargin + paddingLeft;
                            i8 = paddingTop;
                            setChildFrame(virtualChildAt, getLocationOffset(virtualChildAt) + i212, i14, measuredWidth, measuredHeight);
                            int i222 = layoutParams.rightMargin;
                            int nextLocationOffset2 = getNextLocationOffset(virtualChildAt);
                            childrenSkipCount = getChildrenSkipCount(virtualChildAt, i19) + i20;
                            paddingLeft = i212 + i222 + measuredWidth + nextLocationOffset2;
                            i18 = childrenSkipCount + 1;
                            virtualChildCount = i9;
                            i17 = i10;
                            z3 = z;
                            paddingTop = i8;
                        }
                        i14 -= i15;
                        if (hasDividerBeforeChildAt(i19)) {
                        }
                        int i2122 = layoutParams.leftMargin + paddingLeft;
                        i8 = paddingTop;
                        setChildFrame(virtualChildAt, getLocationOffset(virtualChildAt) + i2122, i14, measuredWidth, measuredHeight);
                        int i2222 = layoutParams.rightMargin;
                        int nextLocationOffset22 = getNextLocationOffset(virtualChildAt);
                        childrenSkipCount = getChildrenSkipCount(virtualChildAt, i19) + i20;
                        paddingLeft = i2122 + i2222 + measuredWidth + nextLocationOffset22;
                        i18 = childrenSkipCount + 1;
                        virtualChildCount = i9;
                        i17 = i10;
                        z3 = z;
                        paddingTop = i8;
                    }
                } else {
                    i9 = virtualChildCount;
                }
                i11 = -1;
                i12 = layoutParams.gravity;
                if (i12 < 0) {
                }
                i13 = i12 & 112;
                i10 = i17;
                if (i13 != 16) {
                }
                i14 -= i15;
                if (hasDividerBeforeChildAt(i19)) {
                }
                int i21222 = layoutParams.leftMargin + paddingLeft;
                i8 = paddingTop;
                setChildFrame(virtualChildAt, getLocationOffset(virtualChildAt) + i21222, i14, measuredWidth, measuredHeight);
                int i22222 = layoutParams.rightMargin;
                int nextLocationOffset222 = getNextLocationOffset(virtualChildAt);
                childrenSkipCount = getChildrenSkipCount(virtualChildAt, i19) + i20;
                paddingLeft = i21222 + i22222 + measuredWidth + nextLocationOffset222;
                i18 = childrenSkipCount + 1;
                virtualChildCount = i9;
                i17 = i10;
                z3 = z;
                paddingTop = i8;
            } else {
                i7 = i18;
                i8 = paddingTop;
                i9 = virtualChildCount;
                i10 = i17;
                z = true;
            }
            childrenSkipCount = i7;
            i18 = childrenSkipCount + 1;
            virtualChildCount = i9;
            i17 = i10;
            z3 = z;
            paddingTop = i8;
        }
    }

    private void setChildFrame(android.view.View view, int i, int i2, int i3, int i4) {
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
                i |= androidx.core.view.GravityCompat.START;
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
        int i2 = i & androidx.core.view.GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
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
    public androidx.appcompat.widget.LinearLayoutCompat.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new androidx.appcompat.widget.LinearLayoutCompat.LayoutParams(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public androidx.appcompat.widget.LinearLayoutCompat.LayoutParams generateDefaultLayoutParams() {
        int i = this.mOrientation;
        if (i == 0) {
            return new androidx.appcompat.widget.LinearLayoutCompat.LayoutParams(-2, -2);
        }
        if (i == 1) {
            return new androidx.appcompat.widget.LinearLayoutCompat.LayoutParams(-1, -2);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public androidx.appcompat.widget.LinearLayoutCompat.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) {
            return new androidx.appcompat.widget.LinearLayoutCompat.LayoutParams((android.view.ViewGroup.MarginLayoutParams) layoutParams);
        }
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            return new androidx.appcompat.widget.LinearLayoutCompat.LayoutParams((android.view.ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new androidx.appcompat.widget.LinearLayoutCompat.LayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof androidx.appcompat.widget.LinearLayoutCompat.LayoutParams;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    public static class LayoutParams extends android.widget.LinearLayout.LayoutParams {
        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(int i, int i2, float f) {
            super(i, i2, f);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }
}
