package androidx.constraintlayout.widget;

/* loaded from: classes7.dex */
public class ConstraintLayout extends android.view.ViewGroup {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_DRAW_CONSTRAINTS = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final boolean OPTIMIZE_HEIGHT_CHANGE = false;
    private static final java.lang.String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final java.lang.String VERSION = "ConstraintLayout-2.2.0-alpha04";
    private static androidx.constraintlayout.widget.SharedValues sSharedValues;
    android.util.SparseArray<android.view.View> mChildrenByIds;
    private java.util.ArrayList<androidx.constraintlayout.widget.ConstraintHelper> mConstraintHelpers;
    protected androidx.constraintlayout.widget.ConstraintLayoutStates mConstraintLayoutSpec;
    private androidx.constraintlayout.widget.ConstraintSet mConstraintSet;
    private int mConstraintSetId;
    private java.util.HashMap<java.lang.String, java.lang.Integer> mDesignIds;
    protected boolean mDirtyHierarchy;
    private int mLastMeasureHeight;
    int mLastMeasureHeightMode;
    int mLastMeasureHeightSize;
    private int mLastMeasureWidth;
    int mLastMeasureWidthMode;
    int mLastMeasureWidthSize;
    public androidx.constraintlayout.core.widgets.ConstraintWidgetContainer mLayoutWidget;
    private int mMaxHeight;
    private int mMaxWidth;
    androidx.constraintlayout.widget.ConstraintLayout.Measurer mMeasurer;
    private androidx.constraintlayout.core.Metrics mMetrics;
    private int mMinHeight;
    private int mMinWidth;
    private java.util.ArrayList<androidx.constraintlayout.widget.ConstraintLayout.ValueModifier> mModifiers;
    private int mOnMeasureHeightMeasureSpec;
    private int mOnMeasureWidthMeasureSpec;
    private int mOptimizationLevel;
    private android.util.SparseArray<androidx.constraintlayout.core.widgets.ConstraintWidget> mTempMapIdToWidget;

    public interface ValueModifier {
        boolean update(int i, int i2, int i3, android.view.View view, androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public static androidx.constraintlayout.widget.SharedValues getSharedValues() {
        if (sSharedValues == null) {
            sSharedValues = new androidx.constraintlayout.widget.SharedValues();
        }
        return sSharedValues;
    }

    public void setDesignInformation(int i, java.lang.Object obj, java.lang.Object obj2) {
        if (i == 0 && (obj instanceof java.lang.String) && (obj2 instanceof java.lang.Integer)) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new java.util.HashMap<>();
            }
            java.lang.String str = (java.lang.String) obj;
            int indexOf = str.indexOf(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.mDesignIds.put(str, java.lang.Integer.valueOf(((java.lang.Integer) obj2).intValue()));
        }
    }

    public java.lang.Object getDesignInformation(int i, java.lang.Object obj) {
        if (i != 0 || !(obj instanceof java.lang.String)) {
            return null;
        }
        java.lang.String str = (java.lang.String) obj;
        java.util.HashMap<java.lang.String, java.lang.Integer> hashMap = this.mDesignIds;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.mDesignIds.get(str);
    }

    public ConstraintLayout(android.content.Context context) {
        super(context);
        this.mChildrenByIds = new android.util.SparseArray<>();
        this.mConstraintHelpers = new java.util.ArrayList<>(4);
        this.mLayoutWidget = new androidx.constraintlayout.core.widgets.ConstraintWidgetContainer();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new java.util.HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new android.util.SparseArray<>();
        this.mMeasurer = new androidx.constraintlayout.widget.ConstraintLayout.Measurer(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(null, 0, 0);
    }

    public ConstraintLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mChildrenByIds = new android.util.SparseArray<>();
        this.mConstraintHelpers = new java.util.ArrayList<>(4);
        this.mLayoutWidget = new androidx.constraintlayout.core.widgets.ConstraintWidgetContainer();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new java.util.HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new android.util.SparseArray<>();
        this.mMeasurer = new androidx.constraintlayout.widget.ConstraintLayout.Measurer(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, 0, 0);
    }

    public ConstraintLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mChildrenByIds = new android.util.SparseArray<>();
        this.mConstraintHelpers = new java.util.ArrayList<>(4);
        this.mLayoutWidget = new androidx.constraintlayout.core.widgets.ConstraintWidgetContainer();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new java.util.HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new android.util.SparseArray<>();
        this.mMeasurer = new androidx.constraintlayout.widget.ConstraintLayout.Measurer(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, i, 0);
    }

    public ConstraintLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mChildrenByIds = new android.util.SparseArray<>();
        this.mConstraintHelpers = new java.util.ArrayList<>(4);
        this.mLayoutWidget = new androidx.constraintlayout.core.widgets.ConstraintWidgetContainer();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new java.util.HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new android.util.SparseArray<>();
        this.mMeasurer = new androidx.constraintlayout.widget.ConstraintLayout.Measurer(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, i, i2);
    }

    @Override // android.view.View
    public void setId(int i) {
        this.mChildrenByIds.remove(getId());
        super.setId(i);
        this.mChildrenByIds.put(getId(), this);
    }

    class Measurer implements androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer {
        int Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        androidx.constraintlayout.widget.ConstraintLayout getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;
        int getInputFormats;
        int getOutputMinFrameDuration;

        public final void Camera2StreamConfigurationMap(int i, int i2, int i3, int i4, int i5, int i6) {
            this.getOutputMinFrameDuration = i3;
            this.getHighSpeedVideoFpsRangesFor = i4;
            this.getInputFormats = i5;
            this.Camera2StreamConfigurationMap = i6;
            this.getHighSpeedVideoSizes = i;
            this.getHighResolutionOutputSizeshNQ4ISI = i2;
        }

        Measurer(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
            this.getHighSpeedVideoFpsRanges = constraintLayout;
        }

        @Override // androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer
        public final void measure(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure measure) {
            long j;
            int makeMeasureSpec;
            int makeMeasureSpec2;
            int max;
            int i;
            int i2;
            int baseline;
            int i3;
            int childMeasureSpec;
            if (constraintWidget != null) {
                if (constraintWidget.getVisibility() == 8 && !constraintWidget.isInPlaceholder()) {
                    measure.measuredWidth = 0;
                    measure.measuredHeight = 0;
                    measure.measuredBaseline = 0;
                    return;
                }
                if (constraintWidget.getParent() != null) {
                    if (androidx.constraintlayout.widget.ConstraintLayout.this.mMetrics != null) {
                        androidx.constraintlayout.widget.ConstraintLayout.this.mMetrics.mNumberOfMeasures++;
                        j = java.lang.System.nanoTime();
                    } else {
                        j = 0;
                    }
                    androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour = measure.horizontalBehavior;
                    androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = measure.verticalBehavior;
                    int i4 = measure.horizontalDimension;
                    int i5 = measure.verticalDimension;
                    int i6 = this.getOutputMinFrameDuration + this.getHighSpeedVideoFpsRangesFor;
                    int i7 = this.getInputFormats;
                    android.view.View view = (android.view.View) constraintWidget.getCompanionWidget();
                    int i8 = androidx.constraintlayout.widget.ConstraintLayout.AnonymousClass1.getHighSpeedVideoFpsRangesFor[dimensionBehaviour.ordinal()];
                    if (i8 != 1) {
                        if (i8 == 2) {
                            childMeasureSpec = android.view.ViewGroup.getChildMeasureSpec(this.getHighSpeedVideoSizes, i7, -2);
                        } else if (i8 == 3) {
                            childMeasureSpec = android.view.ViewGroup.getChildMeasureSpec(this.getHighSpeedVideoSizes, i7 + constraintWidget.getHorizontalMargin(), -1);
                        } else if (i8 != 4) {
                            makeMeasureSpec = 0;
                        } else {
                            makeMeasureSpec = android.view.ViewGroup.getChildMeasureSpec(this.getHighSpeedVideoSizes, i7, -2);
                            boolean z = constraintWidget.mMatchConstraintDefaultWidth == 1;
                            if (measure.measureStrategy == androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.TRY_GIVEN_DIMENSIONS || measure.measureStrategy == androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.USE_GIVEN_DIMENSIONS) {
                                boolean z2 = view.getMeasuredHeight() == constraintWidget.getHeight();
                                if (measure.measureStrategy == androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.USE_GIVEN_DIMENSIONS || !z || ((z && z2) || (view instanceof androidx.constraintlayout.widget.Placeholder) || constraintWidget.isResolvedHorizontally())) {
                                    makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(constraintWidget.getWidth(), 1073741824);
                                }
                            }
                        }
                        makeMeasureSpec = childMeasureSpec;
                    } else {
                        makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                    }
                    int i9 = androidx.constraintlayout.widget.ConstraintLayout.AnonymousClass1.getHighSpeedVideoFpsRangesFor[dimensionBehaviour2.ordinal()];
                    if (i9 == 1) {
                        makeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
                    } else if (i9 == 2) {
                        makeMeasureSpec2 = android.view.ViewGroup.getChildMeasureSpec(this.getHighResolutionOutputSizeshNQ4ISI, i6, -2);
                    } else if (i9 == 3) {
                        makeMeasureSpec2 = android.view.ViewGroup.getChildMeasureSpec(this.getHighResolutionOutputSizeshNQ4ISI, i6 + constraintWidget.getVerticalMargin(), -1);
                    } else if (i9 != 4) {
                        makeMeasureSpec2 = 0;
                    } else {
                        makeMeasureSpec2 = android.view.ViewGroup.getChildMeasureSpec(this.getHighResolutionOutputSizeshNQ4ISI, i6, -2);
                        boolean z3 = constraintWidget.mMatchConstraintDefaultHeight == 1;
                        if (measure.measureStrategy == androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.TRY_GIVEN_DIMENSIONS || measure.measureStrategy == androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.USE_GIVEN_DIMENSIONS) {
                            boolean z4 = view.getMeasuredWidth() == constraintWidget.getWidth();
                            if (measure.measureStrategy == androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.USE_GIVEN_DIMENSIONS || !z3 || ((z3 && z4) || (view instanceof androidx.constraintlayout.widget.Placeholder) || constraintWidget.isResolvedVertically())) {
                                makeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(constraintWidget.getHeight(), 1073741824);
                            }
                        }
                    }
                    androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) constraintWidget.getParent();
                    if (constraintWidgetContainer != null && androidx.constraintlayout.core.widgets.Optimizer.enabled(androidx.constraintlayout.widget.ConstraintLayout.this.mOptimizationLevel, 256) && view.getMeasuredWidth() == constraintWidget.getWidth() && view.getMeasuredWidth() < constraintWidgetContainer.getWidth() && view.getMeasuredHeight() == constraintWidget.getHeight() && view.getMeasuredHeight() < constraintWidgetContainer.getHeight() && view.getBaseline() == constraintWidget.getBaselineDistance() && !constraintWidget.isMeasureRequested() && getHighSpeedVideoFpsRangesFor(constraintWidget.getLastHorizontalMeasureSpec(), makeMeasureSpec, constraintWidget.getWidth()) && getHighSpeedVideoFpsRangesFor(constraintWidget.getLastVerticalMeasureSpec(), makeMeasureSpec2, constraintWidget.getHeight())) {
                        measure.measuredWidth = constraintWidget.getWidth();
                        measure.measuredHeight = constraintWidget.getHeight();
                        measure.measuredBaseline = constraintWidget.getBaselineDistance();
                        return;
                    }
                    boolean z5 = dimensionBehaviour == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    boolean z6 = dimensionBehaviour2 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    boolean z7 = dimensionBehaviour2 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT || dimensionBehaviour2 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
                    boolean z8 = dimensionBehaviour == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT || dimensionBehaviour == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
                    boolean z9 = z5 && constraintWidget.mDimensionRatio > 0.0f;
                    boolean z10 = z6 && constraintWidget.mDimensionRatio > 0.0f;
                    if (view != null) {
                        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) view.getLayoutParams();
                        long j2 = j;
                        if (measure.measureStrategy != androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.TRY_GIVEN_DIMENSIONS && measure.measureStrategy != androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.USE_GIVEN_DIMENSIONS && z5 && constraintWidget.mMatchConstraintDefaultWidth == 0 && z6 && constraintWidget.mMatchConstraintDefaultHeight == 0) {
                            i3 = -1;
                            baseline = 0;
                            max = 0;
                            i2 = 0;
                        } else {
                            if ((view instanceof androidx.constraintlayout.widget.VirtualLayout) && (constraintWidget instanceof androidx.constraintlayout.core.widgets.VirtualLayout)) {
                                ((androidx.constraintlayout.widget.VirtualLayout) view).onMeasure((androidx.constraintlayout.core.widgets.VirtualLayout) constraintWidget, makeMeasureSpec, makeMeasureSpec2);
                            } else {
                                view.measure(makeMeasureSpec, makeMeasureSpec2);
                            }
                            constraintWidget.setLastMeasureSpec(makeMeasureSpec, makeMeasureSpec2);
                            int measuredWidth = view.getMeasuredWidth();
                            int measuredHeight = view.getMeasuredHeight();
                            int baseline2 = view.getBaseline();
                            max = constraintWidget.mMatchConstraintMinWidth > 0 ? java.lang.Math.max(constraintWidget.mMatchConstraintMinWidth, measuredWidth) : measuredWidth;
                            if (constraintWidget.mMatchConstraintMaxWidth > 0) {
                                max = java.lang.Math.min(constraintWidget.mMatchConstraintMaxWidth, max);
                            }
                            if (constraintWidget.mMatchConstraintMinHeight > 0) {
                                i2 = java.lang.Math.max(constraintWidget.mMatchConstraintMinHeight, measuredHeight);
                                i = makeMeasureSpec2;
                            } else {
                                i = makeMeasureSpec2;
                                i2 = measuredHeight;
                            }
                            if (constraintWidget.mMatchConstraintMaxHeight > 0) {
                                i2 = java.lang.Math.min(constraintWidget.mMatchConstraintMaxHeight, i2);
                            }
                            if (!androidx.constraintlayout.core.widgets.Optimizer.enabled(androidx.constraintlayout.widget.ConstraintLayout.this.mOptimizationLevel, 1)) {
                                if (z9 && z7) {
                                    max = (int) ((i2 * constraintWidget.mDimensionRatio) + 0.5f);
                                } else if (z10 && z8) {
                                    i2 = (int) ((max / constraintWidget.mDimensionRatio) + 0.5f);
                                }
                            }
                            if (measuredWidth == max && measuredHeight == i2) {
                                baseline = baseline2;
                            } else {
                                if (measuredWidth != max) {
                                    makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(max, 1073741824);
                                }
                                int makeMeasureSpec3 = measuredHeight != i2 ? android.view.View.MeasureSpec.makeMeasureSpec(i2, 1073741824) : i;
                                view.measure(makeMeasureSpec, makeMeasureSpec3);
                                constraintWidget.setLastMeasureSpec(makeMeasureSpec, makeMeasureSpec3);
                                max = view.getMeasuredWidth();
                                i2 = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                            }
                            i3 = -1;
                        }
                        boolean z11 = baseline != i3;
                        measure.measuredNeedsSolverPass = (max == measure.horizontalDimension && i2 == measure.verticalDimension) ? false : true;
                        if (layoutParams.getOutputMinFrameDuration) {
                            z11 = true;
                        }
                        if (z11 && baseline != -1 && constraintWidget.getBaselineDistance() != baseline) {
                            measure.measuredNeedsSolverPass = true;
                        }
                        measure.measuredWidth = max;
                        measure.measuredHeight = i2;
                        measure.measuredHasBaseline = z11;
                        measure.measuredBaseline = baseline;
                        if (androidx.constraintlayout.widget.ConstraintLayout.this.mMetrics != null) {
                            long nanoTime = java.lang.System.nanoTime();
                            androidx.constraintlayout.widget.ConstraintLayout.this.mMetrics.measuresWidgetsDuration += nanoTime - j2;
                        }
                    }
                }
            }
        }

        private static boolean getHighSpeedVideoFpsRangesFor(int i, int i2, int i3) {
            if (i == i2) {
                return true;
            }
            int mode = android.view.View.MeasureSpec.getMode(i);
            int mode2 = android.view.View.MeasureSpec.getMode(i2);
            int size = android.view.View.MeasureSpec.getSize(i2);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
            }
            return false;
        }

        @Override // androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer
        public final void didMeasures() {
            int childCount = this.getHighSpeedVideoFpsRanges.getChildCount();
            for (int i = 0; i < childCount; i++) {
                android.view.View childAt = this.getHighSpeedVideoFpsRanges.getChildAt(i);
                if (childAt instanceof androidx.constraintlayout.widget.Placeholder) {
                    ((androidx.constraintlayout.widget.Placeholder) childAt).updatePostMeasure(this.getHighSpeedVideoFpsRanges);
                }
            }
            int size = this.getHighSpeedVideoFpsRanges.mConstraintHelpers.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    ((androidx.constraintlayout.widget.ConstraintHelper) this.getHighSpeedVideoFpsRanges.mConstraintHelpers.get(i2)).updatePostMeasure(this.getHighSpeedVideoFpsRanges);
                }
            }
        }
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRangesFor;

        static {
            int[] iArr = new int[androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.values().length];
            getHighSpeedVideoFpsRangesFor = iArr;
            try {
                iArr[androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    private void init(android.util.AttributeSet attributeSet, int i, int i2) {
        this.mLayoutWidget.setCompanionWidget(this);
        this.mLayoutWidget.setMeasurer(this.mMeasurer);
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_android_minWidth) {
                    this.mMinWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_android_minHeight) {
                    this.mMinHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_android_maxWidth) {
                    this.mMaxWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_android_maxHeight) {
                    this.mMaxHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.mOptimizationLevel = obtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layoutDescription) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            parseLayoutDescription(resourceId);
                        } catch (android.content.res.Resources.NotFoundException unused) {
                            this.mConstraintLayoutSpec = null;
                        }
                    }
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_constraintSet) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        androidx.constraintlayout.widget.ConstraintSet constraintSet = new androidx.constraintlayout.widget.ConstraintSet();
                        this.mConstraintSet = constraintSet;
                        constraintSet.load(getContext(), resourceId2);
                    } catch (android.content.res.Resources.NotFoundException unused2) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.mLayoutWidget.setOptimizationLevel(this.mOptimizationLevel);
    }

    protected void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = new androidx.constraintlayout.widget.ConstraintLayoutStates(getContext(), this, i);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(android.view.View view) {
        super.onViewAdded(view);
        androidx.constraintlayout.core.widgets.ConstraintWidget viewWidget = getViewWidget(view);
        if ((view instanceof androidx.constraintlayout.widget.Guideline) && !(viewWidget instanceof androidx.constraintlayout.core.widgets.Guideline)) {
            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) view.getLayoutParams();
            layoutParams.coroutineCreation = new androidx.constraintlayout.core.widgets.Guideline();
            layoutParams.getHighSpeedVideoSizes = true;
            ((androidx.constraintlayout.core.widgets.Guideline) layoutParams.coroutineCreation).setOrientation(layoutParams.orientation);
        }
        if (view instanceof androidx.constraintlayout.widget.ConstraintHelper) {
            androidx.constraintlayout.widget.ConstraintHelper constraintHelper = (androidx.constraintlayout.widget.ConstraintHelper) view;
            constraintHelper.validateParams();
            ((androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) view.getLayoutParams()).getHighSpeedVideoSizesFor = true;
            if (!this.mConstraintHelpers.contains(constraintHelper)) {
                this.mConstraintHelpers.add(constraintHelper);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(android.view.View view) {
        super.onViewRemoved(view);
        this.mChildrenByIds.remove(view.getId());
        this.mLayoutWidget.remove(getViewWidget(view));
        this.mConstraintHelpers.remove(view);
        this.mDirtyHierarchy = true;
    }

    public void setMinWidth(int i) {
        if (i == this.mMinWidth) {
            return;
        }
        this.mMinWidth = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.mMinHeight) {
            return;
        }
        this.mMinHeight = i;
        requestLayout();
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public void setMaxWidth(int i) {
        if (i == this.mMaxWidth) {
            return;
        }
        this.mMaxWidth = i;
        requestLayout();
    }

    public void setMaxHeight(int i) {
        if (i == this.mMaxHeight) {
            return;
        }
        this.mMaxHeight = i;
        requestLayout();
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    private boolean updateHierarchy() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            setChildrenConstraints();
        }
        return z;
    }

    private void setChildrenConstraints() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            androidx.constraintlayout.core.widgets.ConstraintWidget viewWidget = getViewWidget(getChildAt(i));
            if (viewWidget != null) {
                viewWidget.reset();
            }
        }
        if (isInEditMode) {
            for (int i2 = 0; i2 < childCount; i2++) {
                android.view.View childAt = getChildAt(i2);
                try {
                    java.lang.String resourceName = getResources().getResourceName(childAt.getId());
                    setDesignInformation(0, resourceName, java.lang.Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    getTargetWidget(childAt.getId()).setDebugName(resourceName);
                } catch (android.content.res.Resources.NotFoundException unused) {
                }
            }
        }
        if (this.mConstraintSetId != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                android.view.View childAt2 = getChildAt(i3);
                if (childAt2.getId() == this.mConstraintSetId && (childAt2 instanceof androidx.constraintlayout.widget.Constraints)) {
                    this.mConstraintSet = ((androidx.constraintlayout.widget.Constraints) childAt2).getConstraintSet();
                }
            }
        }
        androidx.constraintlayout.widget.ConstraintSet constraintSet = this.mConstraintSet;
        if (constraintSet != null) {
            constraintSet.getHighSpeedVideoSizes(this, true);
        }
        this.mLayoutWidget.removeAllChildren();
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                this.mConstraintHelpers.get(i4).updatePreLayout(this);
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            android.view.View childAt3 = getChildAt(i5);
            if (childAt3 instanceof androidx.constraintlayout.widget.Placeholder) {
                ((androidx.constraintlayout.widget.Placeholder) childAt3).updatePreLayout(this);
            }
        }
        this.mTempMapIdToWidget.clear();
        this.mTempMapIdToWidget.put(0, this.mLayoutWidget);
        this.mTempMapIdToWidget.put(getId(), this.mLayoutWidget);
        for (int i6 = 0; i6 < childCount; i6++) {
            android.view.View childAt4 = getChildAt(i6);
            this.mTempMapIdToWidget.put(childAt4.getId(), getViewWidget(childAt4));
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            android.view.View childAt5 = getChildAt(i7);
            androidx.constraintlayout.core.widgets.ConstraintWidget viewWidget2 = getViewWidget(childAt5);
            if (viewWidget2 != null) {
                androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) childAt5.getLayoutParams();
                this.mLayoutWidget.add(viewWidget2);
                applyConstraintsFromLayoutParams(isInEditMode, childAt5, viewWidget2, layoutParams, this.mTempMapIdToWidget);
            }
        }
    }

    public void applyConstraintsFromLayoutParams(boolean z, android.view.View view, androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget, androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams, android.util.SparseArray<androidx.constraintlayout.core.widgets.ConstraintWidget> sparseArray) {
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget2;
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget3;
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget4;
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget5;
        layoutParams.validate();
        layoutParams.helped = false;
        constraintWidget.setVisibility(view.getVisibility());
        if (layoutParams.getInputFormats) {
            constraintWidget.setInPlaceholder(true);
            constraintWidget.setVisibility(8);
        }
        constraintWidget.setCompanionWidget(view);
        if (view instanceof androidx.constraintlayout.widget.ConstraintHelper) {
            ((androidx.constraintlayout.widget.ConstraintHelper) view).resolveRtl(constraintWidget, this.mLayoutWidget.isRtl());
        }
        if (layoutParams.getHighSpeedVideoSizes) {
            androidx.constraintlayout.core.widgets.Guideline guideline = (androidx.constraintlayout.core.widgets.Guideline) constraintWidget;
            int i = layoutParams.getOutputStallDuration;
            int i2 = layoutParams.getOutputStallDurationlomOqCM;
            float f = layoutParams.getOutputMinFrameDurationlomOqCM;
            if (f != -1.0f) {
                guideline.setGuidePercent(f);
                return;
            } else if (i != -1) {
                guideline.setGuideBegin(i);
                return;
            } else {
                if (i2 != -1) {
                    guideline.setGuideEnd(i2);
                    return;
                }
                return;
            }
        }
        int i3 = layoutParams.isOutputSupportedFor;
        int i4 = layoutParams.isOutputSupportedForhNQ4ISI;
        int i5 = layoutParams.getValidOutputFormatsForInputhNQ4ISI;
        int i6 = layoutParams.toString;
        int i7 = layoutParams.getInputSizeshNQ4ISI;
        int i8 = layoutParams.getOutputSizes;
        float f2 = layoutParams.getOutputSizeshNQ4ISI;
        if (layoutParams.circleConstraint != -1) {
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget6 = sparseArray.get(layoutParams.circleConstraint);
            if (constraintWidget6 != null) {
                constraintWidget.connectCircularConstraint(constraintWidget6, layoutParams.circleAngle, layoutParams.circleRadius);
            }
        } else {
            if (i3 != -1) {
                androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget7 = sparseArray.get(i3);
                if (constraintWidget7 != null) {
                    constraintWidget.immediateConnect(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT, constraintWidget7, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT, layoutParams.leftMargin, i7);
                }
            } else if (i4 != -1 && (constraintWidget2 = sparseArray.get(i4)) != null) {
                constraintWidget.immediateConnect(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT, constraintWidget2, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT, layoutParams.leftMargin, i7);
            }
            if (i5 != -1) {
                androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget8 = sparseArray.get(i5);
                if (constraintWidget8 != null) {
                    constraintWidget.immediateConnect(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT, constraintWidget8, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT, layoutParams.rightMargin, i8);
                }
            } else if (i6 != -1 && (constraintWidget3 = sparseArray.get(i6)) != null) {
                constraintWidget.immediateConnect(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT, constraintWidget3, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT, layoutParams.rightMargin, i8);
            }
            if (layoutParams.topToTop != -1) {
                androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget9 = sparseArray.get(layoutParams.topToTop);
                if (constraintWidget9 != null) {
                    constraintWidget.immediateConnect(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP, constraintWidget9, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP, layoutParams.topMargin, layoutParams.goneTopMargin);
                }
            } else if (layoutParams.topToBottom != -1 && (constraintWidget4 = sparseArray.get(layoutParams.topToBottom)) != null) {
                constraintWidget.immediateConnect(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP, constraintWidget4, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM, layoutParams.topMargin, layoutParams.goneTopMargin);
            }
            if (layoutParams.bottomToTop != -1) {
                androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget10 = sparseArray.get(layoutParams.bottomToTop);
                if (constraintWidget10 != null) {
                    constraintWidget.immediateConnect(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM, constraintWidget10, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP, layoutParams.bottomMargin, layoutParams.goneBottomMargin);
                }
            } else if (layoutParams.bottomToBottom != -1 && (constraintWidget5 = sparseArray.get(layoutParams.bottomToBottom)) != null) {
                constraintWidget.immediateConnect(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM, constraintWidget5, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM, layoutParams.bottomMargin, layoutParams.goneBottomMargin);
            }
            if (layoutParams.baselineToBaseline != -1) {
                setWidgetBaseline(constraintWidget, layoutParams, sparseArray, layoutParams.baselineToBaseline, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE);
            } else if (layoutParams.baselineToTop != -1) {
                setWidgetBaseline(constraintWidget, layoutParams, sparseArray, layoutParams.baselineToTop, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP);
            } else if (layoutParams.baselineToBottom != -1) {
                setWidgetBaseline(constraintWidget, layoutParams, sparseArray, layoutParams.baselineToBottom, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM);
            }
            if (f2 >= 0.0f) {
                constraintWidget.setHorizontalBiasPercent(f2);
            }
            if (layoutParams.verticalBias >= 0.0f) {
                constraintWidget.setVerticalBiasPercent(layoutParams.verticalBias);
            }
        }
        if (z && (layoutParams.editorAbsoluteX != -1 || layoutParams.editorAbsoluteY != -1)) {
            constraintWidget.setOrigin(layoutParams.editorAbsoluteX, layoutParams.editorAbsoluteY);
        }
        if (!layoutParams.getHighSpeedVideoFpsRangesFor) {
            if (layoutParams.width == -1) {
                if (layoutParams.constrainedWidth) {
                    constraintWidget.setHorizontalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                } else {
                    constraintWidget.setHorizontalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
                }
                constraintWidget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT).mMargin = layoutParams.leftMargin;
                constraintWidget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT).mMargin = layoutParams.rightMargin;
            } else {
                constraintWidget.setHorizontalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                constraintWidget.setWidth(0);
            }
        } else {
            constraintWidget.setHorizontalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED);
            constraintWidget.setWidth(layoutParams.width);
            if (layoutParams.width == -2) {
                constraintWidget.setHorizontalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
            }
        }
        if (!layoutParams.unwrapAs) {
            if (layoutParams.height == -1) {
                if (layoutParams.constrainedHeight) {
                    constraintWidget.setVerticalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                } else {
                    constraintWidget.setVerticalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
                }
                constraintWidget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP).mMargin = layoutParams.topMargin;
                constraintWidget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM).mMargin = layoutParams.bottomMargin;
            } else {
                constraintWidget.setVerticalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                constraintWidget.setHeight(0);
            }
        } else {
            constraintWidget.setVerticalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED);
            constraintWidget.setHeight(layoutParams.height);
            if (layoutParams.height == -2) {
                constraintWidget.setVerticalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
            }
        }
        constraintWidget.setDimensionRatio(layoutParams.dimensionRatio);
        constraintWidget.setHorizontalWeight(layoutParams.horizontalWeight);
        constraintWidget.setVerticalWeight(layoutParams.verticalWeight);
        constraintWidget.setHorizontalChainStyle(layoutParams.horizontalChainStyle);
        constraintWidget.setVerticalChainStyle(layoutParams.verticalChainStyle);
        constraintWidget.setWrapBehaviorInParent(layoutParams.wrapBehaviorInParent);
        constraintWidget.setHorizontalMatchStyle(layoutParams.matchConstraintDefaultWidth, layoutParams.matchConstraintMinWidth, layoutParams.matchConstraintMaxWidth, layoutParams.matchConstraintPercentWidth);
        constraintWidget.setVerticalMatchStyle(layoutParams.matchConstraintDefaultHeight, layoutParams.matchConstraintMinHeight, layoutParams.matchConstraintMaxHeight, layoutParams.matchConstraintPercentHeight);
    }

    private void setWidgetBaseline(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget, androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams, android.util.SparseArray<androidx.constraintlayout.core.widgets.ConstraintWidget> sparseArray, int i, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type type) {
        android.view.View view = this.mChildrenByIds.get(i);
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget2 = sparseArray.get(i);
        if (constraintWidget2 == null || view == null || !(view.getLayoutParams() instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams)) {
            return;
        }
        layoutParams.getOutputMinFrameDuration = true;
        if (type == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE) {
            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) view.getLayoutParams();
            layoutParams2.getOutputMinFrameDuration = true;
            layoutParams2.coroutineCreation.setHasBaseline(true);
        }
        constraintWidget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE).connect(constraintWidget2.getAnchor(type), layoutParams.baselineMargin, layoutParams.goneBaselineMargin, true);
        constraintWidget.setHasBaseline(true);
        constraintWidget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP).reset();
        constraintWidget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM).reset();
    }

    private androidx.constraintlayout.core.widgets.ConstraintWidget getTargetWidget(int i) {
        if (i == 0) {
            return this.mLayoutWidget;
        }
        android.view.View view = this.mChildrenByIds.get(i);
        if (view == null && (view = findViewById(i)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        return ((androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) view.getLayoutParams()).coroutineCreation;
    }

    public final androidx.constraintlayout.core.widgets.ConstraintWidget getViewWidget(android.view.View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) {
            return ((androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) view.getLayoutParams()).coroutineCreation;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) {
            return ((androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) view.getLayoutParams()).coroutineCreation;
        }
        return null;
    }

    public void fillMetrics(androidx.constraintlayout.core.Metrics metrics) {
        this.mMetrics = metrics;
        this.mLayoutWidget.fillMetrics(metrics);
    }

    public void resolveSystem(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer, int i, int i2, int i3) {
        int i4;
        int mode = android.view.View.MeasureSpec.getMode(i2);
        int size = android.view.View.MeasureSpec.getSize(i2);
        int mode2 = android.view.View.MeasureSpec.getMode(i3);
        int size2 = android.view.View.MeasureSpec.getSize(i3);
        int max = java.lang.Math.max(0, getPaddingTop());
        int max2 = java.lang.Math.max(0, getPaddingBottom());
        int i5 = max + max2;
        int paddingWidth = getPaddingWidth();
        this.mMeasurer.Camera2StreamConfigurationMap(i2, i3, max, max2, paddingWidth, i5);
        int max3 = java.lang.Math.max(0, getPaddingStart());
        int max4 = java.lang.Math.max(0, getPaddingEnd());
        if (max3 > 0 || max4 > 0) {
            i4 = isRtl() ? max4 : max3;
        } else {
            i4 = java.lang.Math.max(0, getPaddingLeft());
        }
        int i6 = size - paddingWidth;
        int i7 = size2 - i5;
        setSelfDimensionBehaviour(constraintWidgetContainer, mode, i6, mode2, i7);
        constraintWidgetContainer.measure(i, mode, i6, mode2, i7, this.mLastMeasureWidth, this.mLastMeasureHeight, i4, max);
    }

    public void resolveMeasuredDimension(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        int i5 = this.mMeasurer.Camera2StreamConfigurationMap;
        int resolveSizeAndState = resolveSizeAndState(i3 + this.mMeasurer.getInputFormats, i, 0);
        int resolveSizeAndState2 = resolveSizeAndState(i4 + i5, i2, 0);
        int min = java.lang.Math.min(this.mMaxWidth, resolveSizeAndState & 16777215);
        int min2 = java.lang.Math.min(this.mMaxHeight, resolveSizeAndState2 & 16777215);
        if (z) {
            min |= 16777216;
        }
        if (z2) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.mLastMeasureWidth = min;
        this.mLastMeasureHeight = min2;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        long j;
        if (this.mMetrics != null) {
            j = java.lang.System.nanoTime();
            this.mMetrics.mChildCount = getChildCount();
            this.mMetrics.mMeasureCalls++;
        } else {
            j = 0;
        }
        boolean dynamicUpdateConstraints = this.mDirtyHierarchy | dynamicUpdateConstraints(i, i2);
        this.mDirtyHierarchy = dynamicUpdateConstraints;
        if (!dynamicUpdateConstraints) {
            int childCount = getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                if (getChildAt(i3).isLayoutRequested()) {
                    this.mDirtyHierarchy = true;
                    break;
                }
                i3++;
            }
        }
        this.mOnMeasureWidthMeasureSpec = i;
        this.mOnMeasureHeightMeasureSpec = i2;
        this.mLayoutWidget.setRtl(isRtl());
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            if (updateHierarchy()) {
                this.mLayoutWidget.updateHierarchy();
            }
        }
        this.mLayoutWidget.fillMetrics(this.mMetrics);
        resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, i, i2);
        resolveMeasuredDimension(i, i2, this.mLayoutWidget.getWidth(), this.mLayoutWidget.getHeight(), this.mLayoutWidget.isWidthMeasuredTooSmall(), this.mLayoutWidget.isHeightMeasuredTooSmall());
        androidx.constraintlayout.core.Metrics metrics = this.mMetrics;
        if (metrics != null) {
            metrics.mMeasureDuration += java.lang.System.nanoTime() - j;
        }
    }

    public boolean isRtl() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    private int getPaddingWidth() {
        int max = java.lang.Math.max(0, getPaddingLeft());
        int max2 = java.lang.Math.max(0, getPaddingRight());
        int max3 = java.lang.Math.max(0, getPaddingStart()) + java.lang.Math.max(0, getPaddingEnd());
        return max3 > 0 ? max3 : max + max2;
    }

    protected void setSelfDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer, int i, int i2, int i3, int i4) {
        int i5 = this.mMeasurer.Camera2StreamConfigurationMap;
        int i6 = this.mMeasurer.getInputFormats;
        androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
        androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
        int childCount = getChildCount();
        if (i == Integer.MIN_VALUE) {
            dimensionBehaviour = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (childCount == 0) {
                i2 = java.lang.Math.max(0, this.mMinWidth);
            }
        } else if (i != 0) {
            if (i == 1073741824) {
                i2 = java.lang.Math.min(this.mMaxWidth - i6, i2);
            }
            i2 = 0;
        } else {
            dimensionBehaviour = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (childCount == 0) {
                i2 = java.lang.Math.max(0, this.mMinWidth);
            }
            i2 = 0;
        }
        if (i3 == Integer.MIN_VALUE) {
            dimensionBehaviour2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (childCount == 0) {
                i4 = java.lang.Math.max(0, this.mMinHeight);
            }
        } else if (i3 != 0) {
            if (i3 == 1073741824) {
                i4 = java.lang.Math.min(this.mMaxHeight - i5, i4);
            }
            i4 = 0;
        } else {
            dimensionBehaviour2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (childCount == 0) {
                i4 = java.lang.Math.max(0, this.mMinHeight);
            }
            i4 = 0;
        }
        if (i2 != constraintWidgetContainer.getWidth() || i4 != constraintWidgetContainer.getHeight()) {
            constraintWidgetContainer.invalidateMeasures();
        }
        constraintWidgetContainer.setX(0);
        constraintWidgetContainer.setY(0);
        constraintWidgetContainer.setMaxWidth(this.mMaxWidth - i6);
        constraintWidgetContainer.setMaxHeight(this.mMaxHeight - i5);
        constraintWidgetContainer.setMinWidth(0);
        constraintWidgetContainer.setMinHeight(0);
        constraintWidgetContainer.setHorizontalDimensionBehaviour(dimensionBehaviour);
        constraintWidgetContainer.setWidth(i2);
        constraintWidgetContainer.setVerticalDimensionBehaviour(dimensionBehaviour2);
        constraintWidgetContainer.setHeight(i4);
        constraintWidgetContainer.setMinWidth(this.mMinWidth - i6);
        constraintWidgetContainer.setMinHeight(this.mMinHeight - i5);
    }

    public void setState(int i, int i2, int i3) {
        androidx.constraintlayout.widget.ConstraintLayoutStates constraintLayoutStates = this.mConstraintLayoutSpec;
        if (constraintLayoutStates != null) {
            constraintLayoutStates.updateConstraints(i, i2, i3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        android.view.View content;
        androidx.constraintlayout.core.Metrics metrics = this.mMetrics;
        if (metrics != null) {
            metrics.mNumberOfLayouts++;
        }
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            android.view.View childAt = getChildAt(i5);
            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = layoutParams.coroutineCreation;
            if ((childAt.getVisibility() != 8 || layoutParams.getHighSpeedVideoSizes || layoutParams.getHighSpeedVideoSizesFor || layoutParams.getOutputFormats || isInEditMode) && !layoutParams.getInputFormats) {
                int x = constraintWidget.getX();
                int y = constraintWidget.getY();
                int width = constraintWidget.getWidth() + x;
                int height = constraintWidget.getHeight() + y;
                childAt.layout(x, y, width, height);
                if ((childAt instanceof androidx.constraintlayout.widget.Placeholder) && (content = ((androidx.constraintlayout.widget.Placeholder) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(x, y, width, height);
                }
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                this.mConstraintHelpers.get(i6).updatePostLayout(this);
            }
        }
    }

    public void setOptimizationLevel(int i) {
        this.mOptimizationLevel = i;
        this.mLayoutWidget.setOptimizationLevel(i);
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.getOptimizationLevel();
    }

    @Override // android.view.ViewGroup
    public androidx.constraintlayout.widget.ConstraintLayout.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public androidx.constraintlayout.widget.ConstraintLayout.LayoutParams generateDefaultLayoutParams() {
        return new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;
    }

    public void setConstraintSet(androidx.constraintlayout.widget.ConstraintSet constraintSet) {
        this.mConstraintSet = constraintSet;
    }

    public android.view.View getViewById(int i) {
        return this.mChildrenByIds.get(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        java.lang.Object tag;
        int size;
        java.util.ArrayList<androidx.constraintlayout.widget.ConstraintHelper> arrayList = this.mConstraintHelpers;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                this.mConstraintHelpers.get(i).updatePreDraw(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                android.view.View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof java.lang.String)) {
                    java.lang.String[] split = ((java.lang.String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = java.lang.Integer.parseInt(split[0]);
                        int parseInt2 = java.lang.Integer.parseInt(split[1]);
                        int parseInt3 = java.lang.Integer.parseInt(split[2]);
                        int i3 = (int) ((parseInt / 1080.0f) * width);
                        int i4 = (int) ((parseInt2 / 1920.0f) * height);
                        android.graphics.Paint paint = new android.graphics.Paint();
                        paint.setColor(androidx.core.internal.view.SupportMenu.CATEGORY_MASK);
                        float f = i3;
                        float f2 = i4;
                        float f3 = i3 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float parseInt4 = i4 + ((int) ((java.lang.Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, parseInt4, paint);
                        canvas.drawLine(f3, parseInt4, f, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f3, f2, paint);
                    }
                }
            }
        }
    }

    public void setOnConstraintsChanged(androidx.constraintlayout.widget.ConstraintsChangedListener constraintsChangedListener) {
        androidx.constraintlayout.widget.ConstraintLayoutStates constraintLayoutStates = this.mConstraintLayoutSpec;
        if (constraintLayoutStates != null) {
            constraintLayoutStates.setOnConstraintsChanged(constraintsChangedListener);
        }
    }

    public void loadLayoutDescription(int i) {
        if (i != 0) {
            try {
                this.mConstraintLayoutSpec = new androidx.constraintlayout.widget.ConstraintLayoutStates(getContext(), this, i);
                return;
            } catch (android.content.res.Resources.NotFoundException unused) {
                this.mConstraintLayoutSpec = null;
                return;
            }
        }
        this.mConstraintLayoutSpec = null;
    }

    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {
        public static final int BASELINE = 5;
        public static final int BOTTOM = 4;
        public static final int CHAIN_PACKED = 2;
        public static final int CHAIN_SPREAD = 0;
        public static final int CHAIN_SPREAD_INSIDE = 1;
        public static final int CIRCLE = 8;
        public static final int END = 7;
        public static final int GONE_UNSET = Integer.MIN_VALUE;
        public static final int HORIZONTAL = 0;
        public static final int LEFT = 1;
        public static final int MATCH_CONSTRAINT = 0;
        public static final int MATCH_CONSTRAINT_PERCENT = 2;
        public static final int MATCH_CONSTRAINT_SPREAD = 0;
        public static final int MATCH_CONSTRAINT_WRAP = 1;
        public static final int PARENT_ID = 0;
        public static final int RIGHT = 2;
        public static final int START = 6;
        public static final int TOP = 3;
        public static final int UNSET = -1;
        public static final int VERTICAL = 1;
        public static final int WRAP_BEHAVIOR_HORIZONTAL_ONLY = 1;
        public static final int WRAP_BEHAVIOR_INCLUDED = 0;
        public static final int WRAP_BEHAVIOR_SKIPPED = 3;
        public static final int WRAP_BEHAVIOR_VERTICAL_ONLY = 2;
        float Camera2StreamConfigurationMap;
        public int baselineMargin;
        public int baselineToBaseline;
        public int baselineToBottom;
        public int baselineToTop;
        public int bottomToBottom;
        public int bottomToTop;
        public float circleAngle;
        public int circleConstraint;
        public int circleRadius;
        public boolean constrainedHeight;
        public boolean constrainedWidth;
        public java.lang.String constraintTag;
        boolean coroutineBoundary;
        androidx.constraintlayout.core.widgets.ConstraintWidget coroutineCreation;
        public java.lang.String dimensionRatio;
        public int editorAbsoluteX;
        public int editorAbsoluteY;
        public int endToEnd;
        public int endToStart;
        int getHighResolutionOutputSizeshNQ4ISI;
        boolean getHighSpeedVideoFpsRanges;
        boolean getHighSpeedVideoFpsRangesFor;
        boolean getHighSpeedVideoSizes;
        boolean getHighSpeedVideoSizesFor;
        boolean getInputFormats;
        int getInputSizeshNQ4ISI;
        boolean getOutputFormats;
        boolean getOutputMinFrameDuration;
        float getOutputMinFrameDurationlomOqCM;
        int getOutputSizes;
        float getOutputSizeshNQ4ISI;
        int getOutputStallDuration;
        int getOutputStallDurationlomOqCM;
        int getValidOutputFormatsForInputhNQ4ISI;
        public int goneBaselineMargin;
        public int goneBottomMargin;
        public int goneEndMargin;
        public int goneLeftMargin;
        public int goneRightMargin;
        public int goneStartMargin;
        public int goneTopMargin;
        public int guideBegin;
        public int guideEnd;
        public float guidePercent;
        public boolean guidelineUseRtl;
        public boolean helped;
        public float horizontalBias;
        public int horizontalChainStyle;
        public float horizontalWeight;
        int isOutputSupportedFor;
        int isOutputSupportedForhNQ4ISI;
        public int leftToLeft;
        public int leftToRight;
        public int matchConstraintDefaultHeight;
        public int matchConstraintDefaultWidth;
        public int matchConstraintMaxHeight;
        public int matchConstraintMaxWidth;
        public int matchConstraintMinHeight;
        public int matchConstraintMinWidth;
        public float matchConstraintPercentHeight;
        public float matchConstraintPercentWidth;
        public int orientation;
        public int rightToLeft;
        public int rightToRight;
        public int startToEnd;
        public int startToStart;
        int toString;
        public int topToBottom;
        public int topToTop;
        boolean unwrapAs;
        public float verticalBias;
        public int verticalChainStyle;
        public float verticalWeight;
        public int wrapBehaviorInParent;

        public androidx.constraintlayout.core.widgets.ConstraintWidget getConstraintWidget() {
            return this.coroutineCreation;
        }

        public void setWidgetDebugName(java.lang.String str) {
            this.coroutineCreation.setDebugName(str);
        }

        public void reset() {
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = this.coroutineCreation;
            if (constraintWidget != null) {
                constraintWidget.reset();
            }
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.guideBegin = -1;
            this.guideEnd = -1;
            this.guidePercent = -1.0f;
            this.guidelineUseRtl = true;
            this.leftToLeft = -1;
            this.leftToRight = -1;
            this.rightToLeft = -1;
            this.rightToRight = -1;
            this.topToTop = -1;
            this.topToBottom = -1;
            this.bottomToTop = -1;
            this.bottomToBottom = -1;
            this.baselineToBaseline = -1;
            this.baselineToTop = -1;
            this.baselineToBottom = -1;
            this.circleConstraint = -1;
            this.circleRadius = 0;
            this.circleAngle = 0.0f;
            this.startToEnd = -1;
            this.startToStart = -1;
            this.endToStart = -1;
            this.endToEnd = -1;
            this.goneLeftMargin = Integer.MIN_VALUE;
            this.goneTopMargin = Integer.MIN_VALUE;
            this.goneRightMargin = Integer.MIN_VALUE;
            this.goneBottomMargin = Integer.MIN_VALUE;
            this.goneStartMargin = Integer.MIN_VALUE;
            this.goneEndMargin = Integer.MIN_VALUE;
            this.goneBaselineMargin = Integer.MIN_VALUE;
            this.baselineMargin = 0;
            this.coroutineBoundary = true;
            this.getHighSpeedVideoFpsRanges = true;
            this.horizontalBias = 0.5f;
            this.verticalBias = 0.5f;
            this.dimensionRatio = null;
            this.Camera2StreamConfigurationMap = 0.0f;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            this.horizontalWeight = -1.0f;
            this.verticalWeight = -1.0f;
            this.horizontalChainStyle = 0;
            this.verticalChainStyle = 0;
            this.matchConstraintDefaultWidth = 0;
            this.matchConstraintDefaultHeight = 0;
            this.matchConstraintMinWidth = 0;
            this.matchConstraintMinHeight = 0;
            this.matchConstraintMaxWidth = 0;
            this.matchConstraintMaxHeight = 0;
            this.matchConstraintPercentWidth = 1.0f;
            this.matchConstraintPercentHeight = 1.0f;
            this.editorAbsoluteX = -1;
            this.editorAbsoluteY = -1;
            this.orientation = -1;
            this.constrainedWidth = false;
            this.constrainedHeight = false;
            this.constraintTag = null;
            this.wrapBehaviorInParent = 0;
            this.getHighSpeedVideoFpsRangesFor = true;
            this.unwrapAs = true;
            this.getOutputMinFrameDuration = false;
            this.getHighSpeedVideoSizes = false;
            this.getHighSpeedVideoSizesFor = false;
            this.getInputFormats = false;
            this.getOutputFormats = false;
            this.isOutputSupportedFor = -1;
            this.isOutputSupportedForhNQ4ISI = -1;
            this.getValidOutputFormatsForInputhNQ4ISI = -1;
            this.toString = -1;
            this.getInputSizeshNQ4ISI = Integer.MIN_VALUE;
            this.getOutputSizes = Integer.MIN_VALUE;
            this.getOutputSizeshNQ4ISI = 0.5f;
            this.coroutineCreation = new androidx.constraintlayout.core.widgets.ConstraintWidget();
            this.helped = false;
            if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
                this.leftMargin = marginLayoutParams.leftMargin;
                this.rightMargin = marginLayoutParams.rightMargin;
                this.topMargin = marginLayoutParams.topMargin;
                this.bottomMargin = marginLayoutParams.bottomMargin;
                setMarginStart(marginLayoutParams.getMarginStart());
                setMarginEnd(marginLayoutParams.getMarginEnd());
            }
            if (layoutParams instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) {
                androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams;
                this.guideBegin = layoutParams2.guideBegin;
                this.guideEnd = layoutParams2.guideEnd;
                this.guidePercent = layoutParams2.guidePercent;
                this.guidelineUseRtl = layoutParams2.guidelineUseRtl;
                this.leftToLeft = layoutParams2.leftToLeft;
                this.leftToRight = layoutParams2.leftToRight;
                this.rightToLeft = layoutParams2.rightToLeft;
                this.rightToRight = layoutParams2.rightToRight;
                this.topToTop = layoutParams2.topToTop;
                this.topToBottom = layoutParams2.topToBottom;
                this.bottomToTop = layoutParams2.bottomToTop;
                this.bottomToBottom = layoutParams2.bottomToBottom;
                this.baselineToBaseline = layoutParams2.baselineToBaseline;
                this.baselineToTop = layoutParams2.baselineToTop;
                this.baselineToBottom = layoutParams2.baselineToBottom;
                this.circleConstraint = layoutParams2.circleConstraint;
                this.circleRadius = layoutParams2.circleRadius;
                this.circleAngle = layoutParams2.circleAngle;
                this.startToEnd = layoutParams2.startToEnd;
                this.startToStart = layoutParams2.startToStart;
                this.endToStart = layoutParams2.endToStart;
                this.endToEnd = layoutParams2.endToEnd;
                this.goneLeftMargin = layoutParams2.goneLeftMargin;
                this.goneTopMargin = layoutParams2.goneTopMargin;
                this.goneRightMargin = layoutParams2.goneRightMargin;
                this.goneBottomMargin = layoutParams2.goneBottomMargin;
                this.goneStartMargin = layoutParams2.goneStartMargin;
                this.goneEndMargin = layoutParams2.goneEndMargin;
                this.goneBaselineMargin = layoutParams2.goneBaselineMargin;
                this.baselineMargin = layoutParams2.baselineMargin;
                this.horizontalBias = layoutParams2.horizontalBias;
                this.verticalBias = layoutParams2.verticalBias;
                this.dimensionRatio = layoutParams2.dimensionRatio;
                this.Camera2StreamConfigurationMap = layoutParams2.Camera2StreamConfigurationMap;
                this.getHighResolutionOutputSizeshNQ4ISI = layoutParams2.getHighResolutionOutputSizeshNQ4ISI;
                this.horizontalWeight = layoutParams2.horizontalWeight;
                this.verticalWeight = layoutParams2.verticalWeight;
                this.horizontalChainStyle = layoutParams2.horizontalChainStyle;
                this.verticalChainStyle = layoutParams2.verticalChainStyle;
                this.constrainedWidth = layoutParams2.constrainedWidth;
                this.constrainedHeight = layoutParams2.constrainedHeight;
                this.matchConstraintDefaultWidth = layoutParams2.matchConstraintDefaultWidth;
                this.matchConstraintDefaultHeight = layoutParams2.matchConstraintDefaultHeight;
                this.matchConstraintMinWidth = layoutParams2.matchConstraintMinWidth;
                this.matchConstraintMaxWidth = layoutParams2.matchConstraintMaxWidth;
                this.matchConstraintMinHeight = layoutParams2.matchConstraintMinHeight;
                this.matchConstraintMaxHeight = layoutParams2.matchConstraintMaxHeight;
                this.matchConstraintPercentWidth = layoutParams2.matchConstraintPercentWidth;
                this.matchConstraintPercentHeight = layoutParams2.matchConstraintPercentHeight;
                this.editorAbsoluteX = layoutParams2.editorAbsoluteX;
                this.editorAbsoluteY = layoutParams2.editorAbsoluteY;
                this.orientation = layoutParams2.orientation;
                this.getHighSpeedVideoFpsRangesFor = layoutParams2.getHighSpeedVideoFpsRangesFor;
                this.unwrapAs = layoutParams2.unwrapAs;
                this.getOutputMinFrameDuration = layoutParams2.getOutputMinFrameDuration;
                this.getHighSpeedVideoSizes = layoutParams2.getHighSpeedVideoSizes;
                this.isOutputSupportedFor = layoutParams2.isOutputSupportedFor;
                this.isOutputSupportedForhNQ4ISI = layoutParams2.isOutputSupportedForhNQ4ISI;
                this.getValidOutputFormatsForInputhNQ4ISI = layoutParams2.getValidOutputFormatsForInputhNQ4ISI;
                this.toString = layoutParams2.toString;
                this.getInputSizeshNQ4ISI = layoutParams2.getInputSizeshNQ4ISI;
                this.getOutputSizes = layoutParams2.getOutputSizes;
                this.getOutputSizeshNQ4ISI = layoutParams2.getOutputSizeshNQ4ISI;
                this.constraintTag = layoutParams2.constraintTag;
                this.wrapBehaviorInParent = layoutParams2.wrapBehaviorInParent;
                this.coroutineCreation = layoutParams2.coroutineCreation;
                this.coroutineBoundary = layoutParams2.coroutineBoundary;
                this.getHighSpeedVideoFpsRanges = layoutParams2.getHighSpeedVideoFpsRanges;
            }
        }

        static class Table {
            public static final android.util.SparseIntArray Camera2StreamConfigurationMap;

            private Table() {
            }

            static {
                android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
                Camera2StreamConfigurationMap = sparseIntArray;
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintWidth, 64);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintHeight, 65);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_toTopOf, 52);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_toBottomOf, 53);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintCircle, 2);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_guidelineUseRtl, 67);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_android_orientation, 1);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_goneMarginBaseline, 55);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_marginBaseline, 54);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintTag, 51);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_wrapBehaviorInParent, 66);
            }
        }

        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.guideBegin = -1;
            this.guideEnd = -1;
            this.guidePercent = -1.0f;
            this.guidelineUseRtl = true;
            this.leftToLeft = -1;
            this.leftToRight = -1;
            this.rightToLeft = -1;
            this.rightToRight = -1;
            this.topToTop = -1;
            this.topToBottom = -1;
            this.bottomToTop = -1;
            this.bottomToBottom = -1;
            this.baselineToBaseline = -1;
            this.baselineToTop = -1;
            this.baselineToBottom = -1;
            this.circleConstraint = -1;
            this.circleRadius = 0;
            this.circleAngle = 0.0f;
            this.startToEnd = -1;
            this.startToStart = -1;
            this.endToStart = -1;
            this.endToEnd = -1;
            this.goneLeftMargin = Integer.MIN_VALUE;
            this.goneTopMargin = Integer.MIN_VALUE;
            this.goneRightMargin = Integer.MIN_VALUE;
            this.goneBottomMargin = Integer.MIN_VALUE;
            this.goneStartMargin = Integer.MIN_VALUE;
            this.goneEndMargin = Integer.MIN_VALUE;
            this.goneBaselineMargin = Integer.MIN_VALUE;
            this.baselineMargin = 0;
            this.coroutineBoundary = true;
            this.getHighSpeedVideoFpsRanges = true;
            this.horizontalBias = 0.5f;
            this.verticalBias = 0.5f;
            this.dimensionRatio = null;
            this.Camera2StreamConfigurationMap = 0.0f;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            this.horizontalWeight = -1.0f;
            this.verticalWeight = -1.0f;
            this.horizontalChainStyle = 0;
            this.verticalChainStyle = 0;
            this.matchConstraintDefaultWidth = 0;
            this.matchConstraintDefaultHeight = 0;
            this.matchConstraintMinWidth = 0;
            this.matchConstraintMinHeight = 0;
            this.matchConstraintMaxWidth = 0;
            this.matchConstraintMaxHeight = 0;
            this.matchConstraintPercentWidth = 1.0f;
            this.matchConstraintPercentHeight = 1.0f;
            this.editorAbsoluteX = -1;
            this.editorAbsoluteY = -1;
            this.orientation = -1;
            this.constrainedWidth = false;
            this.constrainedHeight = false;
            this.constraintTag = null;
            this.wrapBehaviorInParent = 0;
            this.getHighSpeedVideoFpsRangesFor = true;
            this.unwrapAs = true;
            this.getOutputMinFrameDuration = false;
            this.getHighSpeedVideoSizes = false;
            this.getHighSpeedVideoSizesFor = false;
            this.getInputFormats = false;
            this.getOutputFormats = false;
            this.isOutputSupportedFor = -1;
            this.isOutputSupportedForhNQ4ISI = -1;
            this.getValidOutputFormatsForInputhNQ4ISI = -1;
            this.toString = -1;
            this.getInputSizeshNQ4ISI = Integer.MIN_VALUE;
            this.getOutputSizes = Integer.MIN_VALUE;
            this.getOutputSizeshNQ4ISI = 0.5f;
            this.coroutineCreation = new androidx.constraintlayout.core.widgets.ConstraintWidget();
            this.helped = false;
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = androidx.constraintlayout.widget.ConstraintLayout.LayoutParams.Table.Camera2StreamConfigurationMap.get(index);
                switch (i2) {
                    case 1:
                        this.orientation = obtainStyledAttributes.getInt(index, this.orientation);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.circleConstraint);
                        this.circleConstraint = resourceId;
                        if (resourceId == -1) {
                            this.circleConstraint = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.circleRadius = obtainStyledAttributes.getDimensionPixelSize(index, this.circleRadius);
                        break;
                    case 4:
                        float f = obtainStyledAttributes.getFloat(index, this.circleAngle) % 360.0f;
                        this.circleAngle = f;
                        if (f < 0.0f) {
                            this.circleAngle = (360.0f - f) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.guideBegin = obtainStyledAttributes.getDimensionPixelOffset(index, this.guideBegin);
                        break;
                    case 6:
                        this.guideEnd = obtainStyledAttributes.getDimensionPixelOffset(index, this.guideEnd);
                        break;
                    case 7:
                        this.guidePercent = obtainStyledAttributes.getFloat(index, this.guidePercent);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.leftToLeft);
                        this.leftToLeft = resourceId2;
                        if (resourceId2 == -1) {
                            this.leftToLeft = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.leftToRight);
                        this.leftToRight = resourceId3;
                        if (resourceId3 == -1) {
                            this.leftToRight = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.rightToLeft);
                        this.rightToLeft = resourceId4;
                        if (resourceId4 == -1) {
                            this.rightToLeft = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.rightToRight);
                        this.rightToRight = resourceId5;
                        if (resourceId5 == -1) {
                            this.rightToRight = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.topToTop);
                        this.topToTop = resourceId6;
                        if (resourceId6 == -1) {
                            this.topToTop = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.topToBottom);
                        this.topToBottom = resourceId7;
                        if (resourceId7 == -1) {
                            this.topToBottom = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.bottomToTop);
                        this.bottomToTop = resourceId8;
                        if (resourceId8 == -1) {
                            this.bottomToTop = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.bottomToBottom);
                        this.bottomToBottom = resourceId9;
                        if (resourceId9 == -1) {
                            this.bottomToBottom = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.baselineToBaseline);
                        this.baselineToBaseline = resourceId10;
                        if (resourceId10 == -1) {
                            this.baselineToBaseline = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.startToEnd);
                        this.startToEnd = resourceId11;
                        if (resourceId11 == -1) {
                            this.startToEnd = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.startToStart);
                        this.startToStart = resourceId12;
                        if (resourceId12 == -1) {
                            this.startToStart = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.endToStart);
                        this.endToStart = resourceId13;
                        if (resourceId13 == -1) {
                            this.endToStart = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.endToEnd);
                        this.endToEnd = resourceId14;
                        if (resourceId14 == -1) {
                            this.endToEnd = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.goneLeftMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneLeftMargin);
                        break;
                    case 22:
                        this.goneTopMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneTopMargin);
                        break;
                    case 23:
                        this.goneRightMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneRightMargin);
                        break;
                    case 24:
                        this.goneBottomMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneBottomMargin);
                        break;
                    case 25:
                        this.goneStartMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneStartMargin);
                        break;
                    case 26:
                        this.goneEndMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneEndMargin);
                        break;
                    case 27:
                        this.constrainedWidth = obtainStyledAttributes.getBoolean(index, this.constrainedWidth);
                        break;
                    case 28:
                        this.constrainedHeight = obtainStyledAttributes.getBoolean(index, this.constrainedHeight);
                        break;
                    case 29:
                        this.horizontalBias = obtainStyledAttributes.getFloat(index, this.horizontalBias);
                        break;
                    case 30:
                        this.verticalBias = obtainStyledAttributes.getFloat(index, this.verticalBias);
                        break;
                    case 31:
                        this.matchConstraintDefaultWidth = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 32:
                        this.matchConstraintDefaultHeight = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 33:
                        try {
                            this.matchConstraintMinWidth = obtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMinWidth);
                            break;
                        } catch (java.lang.Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.matchConstraintMinWidth) == -2) {
                                this.matchConstraintMinWidth = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.matchConstraintMaxWidth = obtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMaxWidth);
                            break;
                        } catch (java.lang.Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.matchConstraintMaxWidth) == -2) {
                                this.matchConstraintMaxWidth = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.matchConstraintPercentWidth = java.lang.Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.matchConstraintPercentWidth));
                        this.matchConstraintDefaultWidth = 2;
                        break;
                    case 36:
                        try {
                            this.matchConstraintMinHeight = obtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMinHeight);
                            break;
                        } catch (java.lang.Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.matchConstraintMinHeight) == -2) {
                                this.matchConstraintMinHeight = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.matchConstraintMaxHeight = obtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMaxHeight);
                            break;
                        } catch (java.lang.Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.matchConstraintMaxHeight) == -2) {
                                this.matchConstraintMaxHeight = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.matchConstraintPercentHeight = java.lang.Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.matchConstraintPercentHeight));
                        this.matchConstraintDefaultHeight = 2;
                        break;
                    default:
                        switch (i2) {
                            case 44:
                                androidx.constraintlayout.widget.ConstraintSet.getHighResolutionOutputSizeshNQ4ISI(this, obtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.horizontalWeight = obtainStyledAttributes.getFloat(index, this.horizontalWeight);
                                break;
                            case 46:
                                this.verticalWeight = obtainStyledAttributes.getFloat(index, this.verticalWeight);
                                break;
                            case 47:
                                this.horizontalChainStyle = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.verticalChainStyle = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.editorAbsoluteX = obtainStyledAttributes.getDimensionPixelOffset(index, this.editorAbsoluteX);
                                break;
                            case 50:
                                this.editorAbsoluteY = obtainStyledAttributes.getDimensionPixelOffset(index, this.editorAbsoluteY);
                                break;
                            case 51:
                                this.constraintTag = obtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = obtainStyledAttributes.getResourceId(index, this.baselineToTop);
                                this.baselineToTop = resourceId15;
                                if (resourceId15 == -1) {
                                    this.baselineToTop = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                int resourceId16 = obtainStyledAttributes.getResourceId(index, this.baselineToBottom);
                                this.baselineToBottom = resourceId16;
                                if (resourceId16 == -1) {
                                    this.baselineToBottom = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                this.baselineMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.baselineMargin);
                                break;
                            case 55:
                                this.goneBaselineMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneBaselineMargin);
                                break;
                            default:
                                switch (i2) {
                                    case 64:
                                        androidx.constraintlayout.widget.ConstraintSet.getHighResolutionOutputSizeshNQ4ISI(this, obtainStyledAttributes, index, 0);
                                        this.coroutineBoundary = true;
                                        break;
                                    case 65:
                                        androidx.constraintlayout.widget.ConstraintSet.getHighResolutionOutputSizeshNQ4ISI(this, obtainStyledAttributes, index, 1);
                                        this.getHighSpeedVideoFpsRanges = true;
                                        break;
                                    case 66:
                                        this.wrapBehaviorInParent = obtainStyledAttributes.getInt(index, this.wrapBehaviorInParent);
                                        break;
                                    case 67:
                                        this.guidelineUseRtl = obtainStyledAttributes.getBoolean(index, this.guidelineUseRtl);
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
            validate();
        }

        public void validate() {
            this.getHighSpeedVideoSizes = false;
            this.getHighSpeedVideoFpsRangesFor = true;
            this.unwrapAs = true;
            if (this.width == -2 && this.constrainedWidth) {
                this.getHighSpeedVideoFpsRangesFor = false;
                if (this.matchConstraintDefaultWidth == 0) {
                    this.matchConstraintDefaultWidth = 1;
                }
            }
            if (this.height == -2 && this.constrainedHeight) {
                this.unwrapAs = false;
                if (this.matchConstraintDefaultHeight == 0) {
                    this.matchConstraintDefaultHeight = 1;
                }
            }
            if (this.width == 0 || this.width == -1) {
                this.getHighSpeedVideoFpsRangesFor = false;
                if (this.width == 0 && this.matchConstraintDefaultWidth == 1) {
                    this.width = -2;
                    this.constrainedWidth = true;
                }
            }
            if (this.height == 0 || this.height == -1) {
                this.unwrapAs = false;
                if (this.height == 0 && this.matchConstraintDefaultHeight == 1) {
                    this.height = -2;
                    this.constrainedHeight = true;
                }
            }
            if (this.guidePercent == -1.0f && this.guideBegin == -1 && this.guideEnd == -1) {
                return;
            }
            this.getHighSpeedVideoSizes = true;
            this.getHighSpeedVideoFpsRangesFor = true;
            this.unwrapAs = true;
            if (!(this.coroutineCreation instanceof androidx.constraintlayout.core.widgets.Guideline)) {
                this.coroutineCreation = new androidx.constraintlayout.core.widgets.Guideline();
            }
            ((androidx.constraintlayout.core.widgets.Guideline) this.coroutineCreation).setOrientation(this.orientation);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.guideBegin = -1;
            this.guideEnd = -1;
            this.guidePercent = -1.0f;
            this.guidelineUseRtl = true;
            this.leftToLeft = -1;
            this.leftToRight = -1;
            this.rightToLeft = -1;
            this.rightToRight = -1;
            this.topToTop = -1;
            this.topToBottom = -1;
            this.bottomToTop = -1;
            this.bottomToBottom = -1;
            this.baselineToBaseline = -1;
            this.baselineToTop = -1;
            this.baselineToBottom = -1;
            this.circleConstraint = -1;
            this.circleRadius = 0;
            this.circleAngle = 0.0f;
            this.startToEnd = -1;
            this.startToStart = -1;
            this.endToStart = -1;
            this.endToEnd = -1;
            this.goneLeftMargin = Integer.MIN_VALUE;
            this.goneTopMargin = Integer.MIN_VALUE;
            this.goneRightMargin = Integer.MIN_VALUE;
            this.goneBottomMargin = Integer.MIN_VALUE;
            this.goneStartMargin = Integer.MIN_VALUE;
            this.goneEndMargin = Integer.MIN_VALUE;
            this.goneBaselineMargin = Integer.MIN_VALUE;
            this.baselineMargin = 0;
            this.coroutineBoundary = true;
            this.getHighSpeedVideoFpsRanges = true;
            this.horizontalBias = 0.5f;
            this.verticalBias = 0.5f;
            this.dimensionRatio = null;
            this.Camera2StreamConfigurationMap = 0.0f;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            this.horizontalWeight = -1.0f;
            this.verticalWeight = -1.0f;
            this.horizontalChainStyle = 0;
            this.verticalChainStyle = 0;
            this.matchConstraintDefaultWidth = 0;
            this.matchConstraintDefaultHeight = 0;
            this.matchConstraintMinWidth = 0;
            this.matchConstraintMinHeight = 0;
            this.matchConstraintMaxWidth = 0;
            this.matchConstraintMaxHeight = 0;
            this.matchConstraintPercentWidth = 1.0f;
            this.matchConstraintPercentHeight = 1.0f;
            this.editorAbsoluteX = -1;
            this.editorAbsoluteY = -1;
            this.orientation = -1;
            this.constrainedWidth = false;
            this.constrainedHeight = false;
            this.constraintTag = null;
            this.wrapBehaviorInParent = 0;
            this.getHighSpeedVideoFpsRangesFor = true;
            this.unwrapAs = true;
            this.getOutputMinFrameDuration = false;
            this.getHighSpeedVideoSizes = false;
            this.getHighSpeedVideoSizesFor = false;
            this.getInputFormats = false;
            this.getOutputFormats = false;
            this.isOutputSupportedFor = -1;
            this.isOutputSupportedForhNQ4ISI = -1;
            this.getValidOutputFormatsForInputhNQ4ISI = -1;
            this.toString = -1;
            this.getInputSizeshNQ4ISI = Integer.MIN_VALUE;
            this.getOutputSizes = Integer.MIN_VALUE;
            this.getOutputSizeshNQ4ISI = 0.5f;
            this.coroutineCreation = new androidx.constraintlayout.core.widgets.ConstraintWidget();
            this.helped = false;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0079  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0081  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void resolveLayoutDirection(int i) {
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = this.leftMargin;
            int i7 = this.rightMargin;
            super.resolveLayoutDirection(i);
            boolean z = false;
            boolean z2 = 1 == getLayoutDirection();
            this.getValidOutputFormatsForInputhNQ4ISI = -1;
            this.toString = -1;
            this.isOutputSupportedFor = -1;
            this.isOutputSupportedForhNQ4ISI = -1;
            this.getInputSizeshNQ4ISI = this.goneLeftMargin;
            this.getOutputSizes = this.goneRightMargin;
            float f = this.horizontalBias;
            this.getOutputSizeshNQ4ISI = f;
            int i8 = this.guideBegin;
            this.getOutputStallDuration = i8;
            int i9 = this.guideEnd;
            this.getOutputStallDurationlomOqCM = i9;
            float f2 = this.guidePercent;
            this.getOutputMinFrameDurationlomOqCM = f2;
            if (z2) {
                int i10 = this.startToEnd;
                if (i10 != -1) {
                    this.getValidOutputFormatsForInputhNQ4ISI = i10;
                } else {
                    int i11 = this.startToStart;
                    if (i11 != -1) {
                        this.toString = i11;
                    }
                    i2 = this.endToStart;
                    if (i2 != -1) {
                        this.isOutputSupportedForhNQ4ISI = i2;
                        z = true;
                    }
                    i3 = this.endToEnd;
                    if (i3 != -1) {
                        this.isOutputSupportedFor = i3;
                        z = true;
                    }
                    i4 = this.goneStartMargin;
                    if (i4 != Integer.MIN_VALUE) {
                        this.getOutputSizes = i4;
                    }
                    i5 = this.goneEndMargin;
                    if (i5 != Integer.MIN_VALUE) {
                        this.getInputSizeshNQ4ISI = i5;
                    }
                    if (z) {
                        this.getOutputSizeshNQ4ISI = 1.0f - f;
                    }
                    if (this.getHighSpeedVideoSizes && this.orientation == 1 && this.guidelineUseRtl) {
                        if (f2 == -1.0f) {
                            this.getOutputMinFrameDurationlomOqCM = 1.0f - f2;
                            this.getOutputStallDuration = -1;
                            this.getOutputStallDurationlomOqCM = -1;
                        } else if (i8 != -1) {
                            this.getOutputStallDurationlomOqCM = i8;
                            this.getOutputStallDuration = -1;
                            this.getOutputMinFrameDurationlomOqCM = -1.0f;
                        } else if (i9 != -1) {
                            this.getOutputStallDuration = i9;
                            this.getOutputStallDurationlomOqCM = -1;
                            this.getOutputMinFrameDurationlomOqCM = -1.0f;
                        }
                    }
                }
                z = true;
                i2 = this.endToStart;
                if (i2 != -1) {
                }
                i3 = this.endToEnd;
                if (i3 != -1) {
                }
                i4 = this.goneStartMargin;
                if (i4 != Integer.MIN_VALUE) {
                }
                i5 = this.goneEndMargin;
                if (i5 != Integer.MIN_VALUE) {
                }
                if (z) {
                }
                if (this.getHighSpeedVideoSizes) {
                    if (f2 == -1.0f) {
                    }
                }
            } else {
                int i12 = this.startToEnd;
                if (i12 != -1) {
                    this.isOutputSupportedForhNQ4ISI = i12;
                }
                int i13 = this.startToStart;
                if (i13 != -1) {
                    this.isOutputSupportedFor = i13;
                }
                int i14 = this.endToStart;
                if (i14 != -1) {
                    this.getValidOutputFormatsForInputhNQ4ISI = i14;
                }
                int i15 = this.endToEnd;
                if (i15 != -1) {
                    this.toString = i15;
                }
                int i16 = this.goneStartMargin;
                if (i16 != Integer.MIN_VALUE) {
                    this.getInputSizeshNQ4ISI = i16;
                }
                int i17 = this.goneEndMargin;
                if (i17 != Integer.MIN_VALUE) {
                    this.getOutputSizes = i17;
                }
            }
            if (this.endToStart == -1 && this.endToEnd == -1 && this.startToStart == -1 && this.startToEnd == -1) {
                int i18 = this.rightToLeft;
                if (i18 != -1) {
                    this.getValidOutputFormatsForInputhNQ4ISI = i18;
                    if (this.rightMargin <= 0 && i7 > 0) {
                        this.rightMargin = i7;
                    }
                } else {
                    int i19 = this.rightToRight;
                    if (i19 != -1) {
                        this.toString = i19;
                        if (this.rightMargin <= 0 && i7 > 0) {
                            this.rightMargin = i7;
                        }
                    }
                }
                int i20 = this.leftToLeft;
                if (i20 != -1) {
                    this.isOutputSupportedFor = i20;
                    if (this.leftMargin > 0 || i6 <= 0) {
                        return;
                    }
                    this.leftMargin = i6;
                    return;
                }
                int i21 = this.leftToRight;
                if (i21 != -1) {
                    this.isOutputSupportedForhNQ4ISI = i21;
                    if (this.leftMargin > 0 || i6 <= 0) {
                        return;
                    }
                    this.leftMargin = i6;
                }
            }
        }

        public java.lang.String getConstraintTag() {
            return this.constraintTag;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        markHierarchyDirty();
        super.requestLayout();
    }

    @Override // android.view.View
    public void forceLayout() {
        markHierarchyDirty();
        super.forceLayout();
    }

    private void markHierarchyDirty() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
    }

    public java.lang.String getSceneString() {
        int id;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.mLayoutWidget.stringId == null) {
            int id2 = getId();
            if (id2 != -1) {
                this.mLayoutWidget.stringId = getContext().getResources().getResourceEntryName(id2);
            } else {
                this.mLayoutWidget.stringId = "parent";
            }
        }
        if (this.mLayoutWidget.getDebugName() == null) {
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer = this.mLayoutWidget;
            constraintWidgetContainer.setDebugName(constraintWidgetContainer.stringId);
            this.mLayoutWidget.getDebugName();
        }
        java.util.Iterator<androidx.constraintlayout.core.widgets.ConstraintWidget> it = this.mLayoutWidget.getChildren().iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.core.widgets.ConstraintWidget next = it.next();
            android.view.View view = (android.view.View) next.getCompanionWidget();
            if (view != null) {
                if (next.stringId == null && (id = view.getId()) != -1) {
                    next.stringId = getContext().getResources().getResourceEntryName(id);
                }
                if (next.getDebugName() == null) {
                    next.setDebugName(next.stringId);
                    next.getDebugName();
                }
            }
        }
        this.mLayoutWidget.getSceneString(sb);
        return sb.toString();
    }

    public void addValueModifier(androidx.constraintlayout.widget.ConstraintLayout.ValueModifier valueModifier) {
        if (this.mModifiers == null) {
            this.mModifiers = new java.util.ArrayList<>();
        }
        this.mModifiers.add(valueModifier);
    }

    void removeValueModifier(androidx.constraintlayout.widget.ConstraintLayout.ValueModifier valueModifier) {
        if (valueModifier == null) {
            return;
        }
        this.mModifiers.remove(valueModifier);
    }

    protected boolean dynamicUpdateConstraints(int i, int i2) {
        boolean z = false;
        if (this.mModifiers == null) {
            return false;
        }
        int size = android.view.View.MeasureSpec.getSize(i);
        int size2 = android.view.View.MeasureSpec.getSize(i2);
        java.util.Iterator<androidx.constraintlayout.widget.ConstraintLayout.ValueModifier> it = this.mModifiers.iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.widget.ConstraintLayout.ValueModifier next = it.next();
            java.util.Iterator<androidx.constraintlayout.core.widgets.ConstraintWidget> it2 = this.mLayoutWidget.getChildren().iterator();
            while (it2.hasNext()) {
                android.view.View view = (android.view.View) it2.next().getCompanionWidget();
                z |= next.update(size, size2, view.getId(), view, (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) view.getLayoutParams());
            }
        }
        return z;
    }
}
