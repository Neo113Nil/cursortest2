package androidx.constraintlayout.core.widgets.analyzer;

/* loaded from: classes7.dex */
public abstract class WidgetRun implements androidx.constraintlayout.core.widgets.analyzer.Dependency {
    androidx.constraintlayout.core.widgets.analyzer.RunGroup getHighSpeedVideoSizes;
    androidx.constraintlayout.core.widgets.ConstraintWidget getHighSpeedVideoSizesFor;
    protected androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour mDimensionBehavior;
    public int matchConstraintsType;
    androidx.constraintlayout.core.widgets.analyzer.DimensionDependency getHighSpeedVideoFpsRangesFor = new androidx.constraintlayout.core.widgets.analyzer.DimensionDependency(this);
    public int orientation = 0;
    boolean getHighResolutionOutputSizeshNQ4ISI = false;
    public androidx.constraintlayout.core.widgets.analyzer.DependencyNode start = new androidx.constraintlayout.core.widgets.analyzer.DependencyNode(this);
    public androidx.constraintlayout.core.widgets.analyzer.DependencyNode end = new androidx.constraintlayout.core.widgets.analyzer.DependencyNode(this);
    protected androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType mRunType = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.NONE;

    enum RunType {
        NONE,
        START,
        END,
        CENTER
    }

    abstract void Camera2StreamConfigurationMap();

    abstract void applyToWidget();

    abstract void getHighResolutionOutputSizeshNQ4ISI();

    abstract void getHighSpeedVideoFpsRanges();

    abstract boolean getHighSpeedVideoSizes();

    @Override // androidx.constraintlayout.core.widgets.analyzer.Dependency
    public void update(androidx.constraintlayout.core.widgets.analyzer.Dependency dependency) {
    }

    protected void updateRunEnd(androidx.constraintlayout.core.widgets.analyzer.Dependency dependency) {
    }

    protected void updateRunStart(androidx.constraintlayout.core.widgets.analyzer.Dependency dependency) {
    }

    public WidgetRun(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget) {
        this.getHighSpeedVideoSizesFor = constraintWidget;
    }

    public boolean isDimensionResolved() {
        return this.getHighSpeedVideoFpsRangesFor.resolved;
    }

    public boolean isCenterConnection() {
        int size = this.start.getHighSpeedVideoSizesFor.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (this.start.getHighSpeedVideoSizesFor.get(i2).getHighResolutionOutputSizeshNQ4ISI != this) {
                i++;
            }
        }
        int size2 = this.end.getHighSpeedVideoSizesFor.size();
        for (int i3 = 0; i3 < size2; i3++) {
            if (this.end.getHighSpeedVideoSizesFor.get(i3).getHighResolutionOutputSizeshNQ4ISI != this) {
                i++;
            }
        }
        return i >= 2;
    }

    public long wrapSize(int i) {
        if (!this.getHighSpeedVideoFpsRangesFor.resolved) {
            return 0L;
        }
        long j = this.getHighSpeedVideoFpsRangesFor.value;
        if (isCenterConnection()) {
            return j + (this.start.Camera2StreamConfigurationMap - this.end.Camera2StreamConfigurationMap);
        }
        if (i == 0) {
            return j + this.start.Camera2StreamConfigurationMap;
        }
        return j - this.end.Camera2StreamConfigurationMap;
    }

    protected final androidx.constraintlayout.core.widgets.analyzer.DependencyNode getTarget(androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor) {
        if (constraintAnchor.mTarget == null) {
            return null;
        }
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = constraintAnchor.mTarget.mOwner;
        int i = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.AnonymousClass1.getHighSpeedVideoFpsRanges[constraintAnchor.mTarget.mType.ordinal()];
        if (i == 1) {
            return constraintWidget.mHorizontalRun.start;
        }
        if (i == 2) {
            return constraintWidget.mHorizontalRun.end;
        }
        if (i == 3) {
            return constraintWidget.mVerticalRun.start;
        }
        if (i == 4) {
            return constraintWidget.mVerticalRun.baseline;
        }
        if (i != 5) {
            return null;
        }
        return constraintWidget.mVerticalRun.end;
    }

    /* renamed from: androidx.constraintlayout.core.widgets.analyzer.WidgetRun$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRanges;

        static {
            int[] iArr = new int[androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.values().length];
            getHighSpeedVideoFpsRanges = iArr;
            try {
                iArr[androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    protected void updateRunCenter(androidx.constraintlayout.core.widgets.analyzer.Dependency dependency, androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor, androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor2, int i) {
        float verticalBiasPercent;
        androidx.constraintlayout.core.widgets.analyzer.WidgetRun widgetRun;
        float f;
        int i2;
        androidx.constraintlayout.core.widgets.analyzer.DependencyNode target = getTarget(constraintAnchor);
        androidx.constraintlayout.core.widgets.analyzer.DependencyNode target2 = getTarget(constraintAnchor2);
        if (target.resolved && target2.resolved) {
            int margin = target.value + constraintAnchor.getMargin();
            int margin2 = target2.value - constraintAnchor2.getMargin();
            int i3 = margin2 - margin;
            if (!this.getHighSpeedVideoFpsRangesFor.resolved && this.mDimensionBehavior == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                int i4 = this.matchConstraintsType;
                if (i4 == 0) {
                    this.getHighSpeedVideoFpsRangesFor.resolve(getLimitedDimension(i3, i));
                } else if (i4 == 1) {
                    this.getHighSpeedVideoFpsRangesFor.resolve(java.lang.Math.min(getLimitedDimension(this.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI, i), i3));
                } else if (i4 == 2) {
                    androidx.constraintlayout.core.widgets.ConstraintWidget parent = this.getHighSpeedVideoSizesFor.getParent();
                    if (parent != null) {
                        if (i == 0) {
                            widgetRun = parent.mHorizontalRun;
                        } else {
                            widgetRun = parent.mVerticalRun;
                        }
                        if (widgetRun.getHighSpeedVideoFpsRangesFor.resolved) {
                            if (i == 0) {
                                f = this.getHighSpeedVideoSizesFor.mMatchConstraintPercentWidth;
                            } else {
                                f = this.getHighSpeedVideoSizesFor.mMatchConstraintPercentHeight;
                            }
                            this.getHighSpeedVideoFpsRangesFor.resolve(getLimitedDimension((int) ((widgetRun.getHighSpeedVideoFpsRangesFor.value * f) + 0.5f), i));
                        }
                    }
                } else if (i4 == 3 && (this.getHighSpeedVideoSizesFor.mHorizontalRun.mDimensionBehavior != androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.getHighSpeedVideoSizesFor.mHorizontalRun.matchConstraintsType != 3 || this.getHighSpeedVideoSizesFor.mVerticalRun.mDimensionBehavior != androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.getHighSpeedVideoSizesFor.mVerticalRun.matchConstraintsType != 3)) {
                    if ((i == 0 ? this.getHighSpeedVideoSizesFor.mVerticalRun : this.getHighSpeedVideoSizesFor.mHorizontalRun).getHighSpeedVideoFpsRangesFor.resolved) {
                        float dimensionRatio = this.getHighSpeedVideoSizesFor.getDimensionRatio();
                        if (i == 1) {
                            i2 = (int) ((r2.getHighSpeedVideoFpsRangesFor.value / dimensionRatio) + 0.5f);
                        } else {
                            i2 = (int) ((dimensionRatio * r2.getHighSpeedVideoFpsRangesFor.value) + 0.5f);
                        }
                        this.getHighSpeedVideoFpsRangesFor.resolve(i2);
                    }
                }
            }
            if (this.getHighSpeedVideoFpsRangesFor.resolved) {
                if (this.getHighSpeedVideoFpsRangesFor.value == i3) {
                    this.start.resolve(margin);
                    this.end.resolve(margin2);
                    return;
                }
                if (i == 0) {
                    verticalBiasPercent = this.getHighSpeedVideoSizesFor.getHorizontalBiasPercent();
                } else {
                    verticalBiasPercent = this.getHighSpeedVideoSizesFor.getVerticalBiasPercent();
                }
                if (target == target2) {
                    margin = target.value;
                    margin2 = target2.value;
                    verticalBiasPercent = 0.5f;
                }
                this.start.resolve((int) (margin + 0.5f + (((margin2 - margin) - this.getHighSpeedVideoFpsRangesFor.value) * verticalBiasPercent)));
                this.end.resolve(this.start.value + this.getHighSpeedVideoFpsRangesFor.value);
            }
        }
    }

    protected final int getLimitedDimension(int i, int i2) {
        if (i2 == 0) {
            int i3 = this.getHighSpeedVideoSizesFor.mMatchConstraintMaxWidth;
            int max = java.lang.Math.max(this.getHighSpeedVideoSizesFor.mMatchConstraintMinWidth, i);
            if (i3 > 0) {
                max = java.lang.Math.min(i3, i);
            }
            if (max != i) {
                return max;
            }
        } else {
            int i4 = this.getHighSpeedVideoSizesFor.mMatchConstraintMaxHeight;
            int max2 = java.lang.Math.max(this.getHighSpeedVideoSizesFor.mMatchConstraintMinHeight, i);
            if (i4 > 0) {
                max2 = java.lang.Math.min(i4, i);
            }
            if (max2 != i) {
                return max2;
            }
        }
        return i;
    }

    protected final androidx.constraintlayout.core.widgets.analyzer.DependencyNode getTarget(androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor, int i) {
        if (constraintAnchor.mTarget == null) {
            return null;
        }
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = constraintAnchor.mTarget.mOwner;
        androidx.constraintlayout.core.widgets.analyzer.WidgetRun widgetRun = i == 0 ? constraintWidget.mHorizontalRun : constraintWidget.mVerticalRun;
        int i2 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.AnonymousClass1.getHighSpeedVideoFpsRanges[constraintAnchor.mTarget.mType.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return widgetRun.end;
        }
        return widgetRun.start;
    }

    protected final void addTarget(androidx.constraintlayout.core.widgets.analyzer.DependencyNode dependencyNode, androidx.constraintlayout.core.widgets.analyzer.DependencyNode dependencyNode2, int i) {
        dependencyNode.getHighSpeedVideoSizesFor.add(dependencyNode2);
        dependencyNode.Camera2StreamConfigurationMap = i;
        dependencyNode2.getHighSpeedVideoSizes.add(dependencyNode);
    }

    protected final void addTarget(androidx.constraintlayout.core.widgets.analyzer.DependencyNode dependencyNode, androidx.constraintlayout.core.widgets.analyzer.DependencyNode dependencyNode2, int i, androidx.constraintlayout.core.widgets.analyzer.DimensionDependency dimensionDependency) {
        dependencyNode.getHighSpeedVideoSizesFor.add(dependencyNode2);
        dependencyNode.getHighSpeedVideoSizesFor.add(this.getHighSpeedVideoFpsRangesFor);
        dependencyNode.getHighSpeedVideoFpsRangesFor = i;
        dependencyNode.getHighSpeedVideoFpsRanges = dimensionDependency;
        dependencyNode2.getHighSpeedVideoSizes.add(dependencyNode);
        dimensionDependency.getHighSpeedVideoSizes.add(dependencyNode);
    }

    public long getWrapDimension() {
        if (this.getHighSpeedVideoFpsRangesFor.resolved) {
            return this.getHighSpeedVideoFpsRangesFor.value;
        }
        return 0L;
    }

    public boolean isResolved() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }
}
