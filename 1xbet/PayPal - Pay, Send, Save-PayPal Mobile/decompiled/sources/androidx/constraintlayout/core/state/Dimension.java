package androidx.constraintlayout.core.state;

/* loaded from: classes.dex */
public class Dimension {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    boolean getHighSpeedVideoFpsRanges;
    float getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.String getInputFormats;
    int getInputSizeshNQ4ISI;
    private final int getOutputFormats;
    public static final java.lang.Object FIXED_DIMENSION = new java.lang.String("FIXED_DIMENSION");
    public static final java.lang.Object WRAP_DIMENSION = new java.lang.String("WRAP_DIMENSION");
    public static final java.lang.Object SPREAD_DIMENSION = new java.lang.String("SPREAD_DIMENSION");
    public static final java.lang.Object PARENT_DIMENSION = new java.lang.String("PARENT_DIMENSION");
    public static final java.lang.Object PERCENT_DIMENSION = new java.lang.String("PERCENT_DIMENSION");
    public static final java.lang.Object RATIO_DIMENSION = new java.lang.String("RATIO_DIMENSION");

    /* loaded from: classes7.dex */
    public enum Type {
        FIXED,
        WRAP,
        MATCH_PARENT,
        MATCH_CONSTRAINT
    }

    public boolean equalsFixedValue(int i) {
        return this.getHighSpeedVideoSizes == null && this.getInputSizeshNQ4ISI == i;
    }

    private Dimension() {
        this.getOutputFormats = -2;
        this.Camera2StreamConfigurationMap = 0;
        this.getHighResolutionOutputSizeshNQ4ISI = Integer.MAX_VALUE;
        this.getHighSpeedVideoFpsRangesFor = 1.0f;
        this.getInputSizeshNQ4ISI = 0;
        this.getInputFormats = null;
        this.getHighSpeedVideoSizes = WRAP_DIMENSION;
        this.getHighSpeedVideoFpsRanges = false;
    }

    private Dimension(java.lang.Object obj) {
        this.getOutputFormats = -2;
        this.Camera2StreamConfigurationMap = 0;
        this.getHighResolutionOutputSizeshNQ4ISI = Integer.MAX_VALUE;
        this.getHighSpeedVideoFpsRangesFor = 1.0f;
        this.getInputSizeshNQ4ISI = 0;
        this.getInputFormats = null;
        this.getHighSpeedVideoFpsRanges = false;
        this.getHighSpeedVideoSizes = obj;
    }

    @java.lang.Deprecated
    public static androidx.constraintlayout.core.state.Dimension Suggested(int i) {
        return createSuggested(i);
    }

    public static androidx.constraintlayout.core.state.Dimension createSuggested(int i) {
        androidx.constraintlayout.core.state.Dimension dimension = new androidx.constraintlayout.core.state.Dimension();
        dimension.suggested(i);
        return dimension;
    }

    @java.lang.Deprecated
    public static androidx.constraintlayout.core.state.Dimension Suggested(java.lang.Object obj) {
        return createSuggested(obj);
    }

    public static androidx.constraintlayout.core.state.Dimension createSuggested(java.lang.Object obj) {
        androidx.constraintlayout.core.state.Dimension dimension = new androidx.constraintlayout.core.state.Dimension();
        dimension.suggested(obj);
        return dimension;
    }

    @java.lang.Deprecated
    public static androidx.constraintlayout.core.state.Dimension Fixed(int i) {
        return createFixed(i);
    }

    public static androidx.constraintlayout.core.state.Dimension createFixed(int i) {
        androidx.constraintlayout.core.state.Dimension dimension = new androidx.constraintlayout.core.state.Dimension(FIXED_DIMENSION);
        dimension.fixed(i);
        return dimension;
    }

    @java.lang.Deprecated
    public static androidx.constraintlayout.core.state.Dimension Fixed(java.lang.Object obj) {
        androidx.constraintlayout.core.state.Dimension dimension = new androidx.constraintlayout.core.state.Dimension(FIXED_DIMENSION);
        dimension.fixed(obj);
        return dimension;
    }

    public static androidx.constraintlayout.core.state.Dimension createFixed(java.lang.Object obj) {
        androidx.constraintlayout.core.state.Dimension dimension = new androidx.constraintlayout.core.state.Dimension(FIXED_DIMENSION);
        dimension.fixed(obj);
        return dimension;
    }

    @java.lang.Deprecated
    public static androidx.constraintlayout.core.state.Dimension Percent(java.lang.Object obj, float f) {
        return createPercent(obj, f);
    }

    public static androidx.constraintlayout.core.state.Dimension createPercent(java.lang.Object obj, float f) {
        androidx.constraintlayout.core.state.Dimension dimension = new androidx.constraintlayout.core.state.Dimension(PERCENT_DIMENSION);
        dimension.percent(obj, f);
        return dimension;
    }

    @java.lang.Deprecated
    public static androidx.constraintlayout.core.state.Dimension Parent() {
        return createParent();
    }

    public static androidx.constraintlayout.core.state.Dimension createParent() {
        return new androidx.constraintlayout.core.state.Dimension(PARENT_DIMENSION);
    }

    @java.lang.Deprecated
    public static androidx.constraintlayout.core.state.Dimension Wrap() {
        return createWrap();
    }

    public static androidx.constraintlayout.core.state.Dimension createWrap() {
        return new androidx.constraintlayout.core.state.Dimension(WRAP_DIMENSION);
    }

    @java.lang.Deprecated
    public static androidx.constraintlayout.core.state.Dimension Spread() {
        return createSpread();
    }

    public static androidx.constraintlayout.core.state.Dimension createSpread() {
        return new androidx.constraintlayout.core.state.Dimension(SPREAD_DIMENSION);
    }

    @java.lang.Deprecated
    public static androidx.constraintlayout.core.state.Dimension Ratio(java.lang.String str) {
        return createRatio(str);
    }

    public static androidx.constraintlayout.core.state.Dimension createRatio(java.lang.String str) {
        androidx.constraintlayout.core.state.Dimension dimension = new androidx.constraintlayout.core.state.Dimension(RATIO_DIMENSION);
        dimension.ratio(str);
        return dimension;
    }

    public androidx.constraintlayout.core.state.Dimension percent(java.lang.Object obj, float f) {
        this.getHighSpeedVideoFpsRangesFor = f;
        return this;
    }

    public androidx.constraintlayout.core.state.Dimension min(int i) {
        if (i >= 0) {
            this.Camera2StreamConfigurationMap = i;
        }
        return this;
    }

    public androidx.constraintlayout.core.state.Dimension min(java.lang.Object obj) {
        if (obj == WRAP_DIMENSION) {
            this.Camera2StreamConfigurationMap = -2;
        }
        return this;
    }

    public androidx.constraintlayout.core.state.Dimension max(int i) {
        if (this.getHighResolutionOutputSizeshNQ4ISI >= 0) {
            this.getHighResolutionOutputSizeshNQ4ISI = i;
        }
        return this;
    }

    public androidx.constraintlayout.core.state.Dimension max(java.lang.Object obj) {
        java.lang.Object obj2 = WRAP_DIMENSION;
        if (obj == obj2 && this.getHighSpeedVideoFpsRanges) {
            this.getHighSpeedVideoSizes = obj2;
            this.getHighResolutionOutputSizeshNQ4ISI = Integer.MAX_VALUE;
        }
        return this;
    }

    public androidx.constraintlayout.core.state.Dimension suggested(int i) {
        this.getHighSpeedVideoFpsRanges = true;
        if (i >= 0) {
            this.getHighResolutionOutputSizeshNQ4ISI = i;
        }
        return this;
    }

    public androidx.constraintlayout.core.state.Dimension suggested(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRanges = true;
        return this;
    }

    public androidx.constraintlayout.core.state.Dimension fixed(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        if (obj instanceof java.lang.Integer) {
            this.getInputSizeshNQ4ISI = ((java.lang.Integer) obj).intValue();
            this.getHighSpeedVideoSizes = null;
        }
        return this;
    }

    public androidx.constraintlayout.core.state.Dimension fixed(int i) {
        this.getHighSpeedVideoSizes = null;
        this.getInputSizeshNQ4ISI = i;
        return this;
    }

    public androidx.constraintlayout.core.state.Dimension ratio(java.lang.String str) {
        this.getInputFormats = str;
        return this;
    }

    public void apply(androidx.constraintlayout.core.state.State state, androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget, int i) {
        java.lang.String str = this.getInputFormats;
        if (str != null) {
            constraintWidget.setDimensionRatio(str);
        }
        int i2 = 2;
        if (i == 0) {
            if (this.getHighSpeedVideoFpsRanges) {
                constraintWidget.setHorizontalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                java.lang.Object obj = this.getHighSpeedVideoSizes;
                if (obj == WRAP_DIMENSION) {
                    i2 = 1;
                } else if (obj != PERCENT_DIMENSION) {
                    i2 = 0;
                }
                constraintWidget.setHorizontalMatchStyle(i2, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor);
                return;
            }
            int i3 = this.Camera2StreamConfigurationMap;
            if (i3 > 0) {
                constraintWidget.setMinWidth(i3);
            }
            int i4 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i4 < Integer.MAX_VALUE) {
                constraintWidget.setMaxWidth(i4);
            }
            java.lang.Object obj2 = this.getHighSpeedVideoSizes;
            if (obj2 == WRAP_DIMENSION) {
                constraintWidget.setHorizontalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
                return;
            }
            if (obj2 == PARENT_DIMENSION) {
                constraintWidget.setHorizontalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
                return;
            } else {
                if (obj2 == null) {
                    constraintWidget.setHorizontalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED);
                    constraintWidget.setWidth(this.getInputSizeshNQ4ISI);
                    return;
                }
                return;
            }
        }
        if (this.getHighSpeedVideoFpsRanges) {
            constraintWidget.setVerticalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
            java.lang.Object obj3 = this.getHighSpeedVideoSizes;
            if (obj3 == WRAP_DIMENSION) {
                i2 = 1;
            } else if (obj3 != PERCENT_DIMENSION) {
                i2 = 0;
            }
            constraintWidget.setVerticalMatchStyle(i2, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor);
            return;
        }
        int i5 = this.Camera2StreamConfigurationMap;
        if (i5 > 0) {
            constraintWidget.setMinHeight(i5);
        }
        int i6 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i6 < Integer.MAX_VALUE) {
            constraintWidget.setMaxHeight(i6);
        }
        java.lang.Object obj4 = this.getHighSpeedVideoSizes;
        if (obj4 == WRAP_DIMENSION) {
            constraintWidget.setVerticalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
            return;
        }
        if (obj4 == PARENT_DIMENSION) {
            constraintWidget.setVerticalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
        } else if (obj4 == null) {
            constraintWidget.setVerticalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED);
            constraintWidget.setHeight(this.getInputSizeshNQ4ISI);
        }
    }
}
