package androidx.constraintlayout.core.widgets.analyzer;

/* loaded from: classes7.dex */
public class VerticalWidgetRun extends androidx.constraintlayout.core.widgets.analyzer.WidgetRun {
    androidx.constraintlayout.core.widgets.analyzer.DimensionDependency Camera2StreamConfigurationMap;
    public androidx.constraintlayout.core.widgets.analyzer.DependencyNode baseline;

    public VerticalWidgetRun(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget) {
        super(constraintWidget);
        this.baseline = new androidx.constraintlayout.core.widgets.analyzer.DependencyNode(this);
        this.Camera2StreamConfigurationMap = null;
        this.start.getOutputFormats = androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type.TOP;
        this.end.getOutputFormats = androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type.BOTTOM;
        this.baseline.getOutputFormats = androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type.BASELINE;
        this.orientation = 1;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("VerticalRun ");
        sb.append(this.getHighSpeedVideoSizesFor.getDebugName());
        return sb.toString();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    final void getHighSpeedVideoFpsRanges() {
        this.getHighSpeedVideoSizes = null;
        this.start.clear();
        this.end.clear();
        this.baseline.clear();
        this.getHighSpeedVideoFpsRangesFor.clear();
        this.getHighResolutionOutputSizeshNQ4ISI = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    final void Camera2StreamConfigurationMap() {
        this.getHighResolutionOutputSizeshNQ4ISI = false;
        this.start.clear();
        this.start.resolved = false;
        this.end.clear();
        this.end.resolved = false;
        this.baseline.clear();
        this.baseline.resolved = false;
        this.getHighSpeedVideoFpsRangesFor.resolved = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    final boolean getHighSpeedVideoSizes() {
        return this.mDimensionBehavior != androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.getHighSpeedVideoSizesFor.mMatchConstraintDefaultHeight == 0;
    }

    /* renamed from: androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRanges;

        static {
            int[] iArr = new int[androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.values().length];
            getHighSpeedVideoFpsRanges = iArr;
            try {
                iArr[androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.START.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.END.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.CENTER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.Dependency
    public void update(androidx.constraintlayout.core.widgets.analyzer.Dependency dependency) {
        float f;
        float dimensionRatio;
        float f2;
        int i;
        int i2 = androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun.AnonymousClass1.getHighSpeedVideoFpsRanges[this.mRunType.ordinal()];
        if (i2 == 1) {
            updateRunStart(dependency);
        } else if (i2 == 2) {
            updateRunEnd(dependency);
        } else if (i2 == 3) {
            updateRunCenter(dependency, this.getHighSpeedVideoSizesFor.mTop, this.getHighSpeedVideoSizesFor.mBottom, 1);
            return;
        }
        if (this.getHighSpeedVideoFpsRangesFor.readyToSolve && !this.getHighSpeedVideoFpsRangesFor.resolved && this.mDimensionBehavior == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i3 = this.getHighSpeedVideoSizesFor.mMatchConstraintDefaultHeight;
            if (i3 != 2) {
                if (i3 == 3 && this.getHighSpeedVideoSizesFor.mHorizontalRun.getHighSpeedVideoFpsRangesFor.resolved) {
                    int dimensionRatioSide = this.getHighSpeedVideoSizesFor.getDimensionRatioSide();
                    if (dimensionRatioSide == -1) {
                        f = this.getHighSpeedVideoSizesFor.mHorizontalRun.getHighSpeedVideoFpsRangesFor.value;
                        dimensionRatio = this.getHighSpeedVideoSizesFor.getDimensionRatio();
                    } else if (dimensionRatioSide == 0) {
                        f2 = this.getHighSpeedVideoSizesFor.mHorizontalRun.getHighSpeedVideoFpsRangesFor.value * this.getHighSpeedVideoSizesFor.getDimensionRatio();
                        i = (int) (f2 + 0.5f);
                        this.getHighSpeedVideoFpsRangesFor.resolve(i);
                    } else if (dimensionRatioSide == 1) {
                        f = this.getHighSpeedVideoSizesFor.mHorizontalRun.getHighSpeedVideoFpsRangesFor.value;
                        dimensionRatio = this.getHighSpeedVideoSizesFor.getDimensionRatio();
                    } else {
                        i = 0;
                        this.getHighSpeedVideoFpsRangesFor.resolve(i);
                    }
                    f2 = f / dimensionRatio;
                    i = (int) (f2 + 0.5f);
                    this.getHighSpeedVideoFpsRangesFor.resolve(i);
                }
            } else {
                androidx.constraintlayout.core.widgets.ConstraintWidget parent = this.getHighSpeedVideoSizesFor.getParent();
                if (parent != null && parent.mVerticalRun.getHighSpeedVideoFpsRangesFor.resolved) {
                    this.getHighSpeedVideoFpsRangesFor.resolve((int) ((parent.mVerticalRun.getHighSpeedVideoFpsRangesFor.value * this.getHighSpeedVideoSizesFor.mMatchConstraintPercentHeight) + 0.5f));
                }
            }
        }
        if (this.start.readyToSolve && this.end.readyToSolve) {
            if (this.start.resolved && this.end.resolved && this.getHighSpeedVideoFpsRangesFor.resolved) {
                return;
            }
            if (!this.getHighSpeedVideoFpsRangesFor.resolved && this.mDimensionBehavior == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.getHighSpeedVideoSizesFor.mMatchConstraintDefaultWidth == 0 && !this.getHighSpeedVideoSizesFor.isInVerticalChain()) {
                androidx.constraintlayout.core.widgets.analyzer.DependencyNode dependencyNode = this.start.getHighSpeedVideoSizesFor.get(0);
                androidx.constraintlayout.core.widgets.analyzer.DependencyNode dependencyNode2 = this.end.getHighSpeedVideoSizesFor.get(0);
                int i4 = dependencyNode.value + this.start.Camera2StreamConfigurationMap;
                int i5 = dependencyNode2.value + this.end.Camera2StreamConfigurationMap;
                this.start.resolve(i4);
                this.end.resolve(i5);
                this.getHighSpeedVideoFpsRangesFor.resolve(i5 - i4);
                return;
            }
            if (!this.getHighSpeedVideoFpsRangesFor.resolved && this.mDimensionBehavior == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.matchConstraintsType == 1 && this.start.getHighSpeedVideoSizesFor.size() > 0 && this.end.getHighSpeedVideoSizesFor.size() > 0) {
                int i6 = (this.end.getHighSpeedVideoSizesFor.get(0).value + this.end.Camera2StreamConfigurationMap) - (this.start.getHighSpeedVideoSizesFor.get(0).value + this.start.Camera2StreamConfigurationMap);
                if (i6 < this.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI) {
                    this.getHighSpeedVideoFpsRangesFor.resolve(i6);
                } else {
                    this.getHighSpeedVideoFpsRangesFor.resolve(this.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI);
                }
            }
            if (!this.getHighSpeedVideoFpsRangesFor.resolved || this.start.getHighSpeedVideoSizesFor.size() <= 0 || this.end.getHighSpeedVideoSizesFor.size() <= 0) {
                return;
            }
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode dependencyNode3 = this.start.getHighSpeedVideoSizesFor.get(0);
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode dependencyNode4 = this.end.getHighSpeedVideoSizesFor.get(0);
            int i7 = dependencyNode3.value + this.start.Camera2StreamConfigurationMap;
            int i8 = dependencyNode4.value + this.end.Camera2StreamConfigurationMap;
            float verticalBiasPercent = this.getHighSpeedVideoSizesFor.getVerticalBiasPercent();
            if (dependencyNode3 == dependencyNode4) {
                i7 = dependencyNode3.value;
                i8 = dependencyNode4.value;
                verticalBiasPercent = 0.5f;
            }
            this.start.resolve((int) (i7 + 0.5f + (((i8 - i7) - this.getHighSpeedVideoFpsRangesFor.value) * verticalBiasPercent)));
            this.end.resolve(this.start.value + this.getHighSpeedVideoFpsRangesFor.value);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    final void getHighResolutionOutputSizeshNQ4ISI() {
        androidx.constraintlayout.core.widgets.ConstraintWidget parent;
        androidx.constraintlayout.core.widgets.ConstraintWidget parent2;
        if (this.getHighSpeedVideoSizesFor.measured) {
            this.getHighSpeedVideoFpsRangesFor.resolve(this.getHighSpeedVideoSizesFor.getHeight());
        }
        if (!this.getHighSpeedVideoFpsRangesFor.resolved) {
            this.mDimensionBehavior = this.getHighSpeedVideoSizesFor.getVerticalDimensionBehaviour();
            if (this.getHighSpeedVideoSizesFor.hasBaseline()) {
                this.Camera2StreamConfigurationMap = new androidx.constraintlayout.core.widgets.analyzer.BaselineDimensionDependency(this);
            }
            if (this.mDimensionBehavior != androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                if (this.mDimensionBehavior == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (parent2 = this.getHighSpeedVideoSizesFor.getParent()) != null && parent2.getVerticalDimensionBehaviour() == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED) {
                    int height = parent2.getHeight();
                    int margin = this.getHighSpeedVideoSizesFor.mTop.getMargin();
                    int margin2 = this.getHighSpeedVideoSizesFor.mBottom.getMargin();
                    addTarget(this.start, parent2.mVerticalRun.start, this.getHighSpeedVideoSizesFor.mTop.getMargin());
                    addTarget(this.end, parent2.mVerticalRun.end, -this.getHighSpeedVideoSizesFor.mBottom.getMargin());
                    this.getHighSpeedVideoFpsRangesFor.resolve((height - margin) - margin2);
                    return;
                }
                if (this.mDimensionBehavior == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED) {
                    this.getHighSpeedVideoFpsRangesFor.resolve(this.getHighSpeedVideoSizesFor.getHeight());
                }
            }
        } else if (this.mDimensionBehavior == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (parent = this.getHighSpeedVideoSizesFor.getParent()) != null && parent.getVerticalDimensionBehaviour() == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED) {
            addTarget(this.start, parent.mVerticalRun.start, this.getHighSpeedVideoSizesFor.mTop.getMargin());
            addTarget(this.end, parent.mVerticalRun.end, -this.getHighSpeedVideoSizesFor.mBottom.getMargin());
            return;
        }
        if (this.getHighSpeedVideoFpsRangesFor.resolved && this.getHighSpeedVideoSizesFor.measured) {
            if (this.getHighSpeedVideoSizesFor.mListAnchors[2].mTarget != null && this.getHighSpeedVideoSizesFor.mListAnchors[3].mTarget != null) {
                if (this.getHighSpeedVideoSizesFor.isInVerticalChain()) {
                    this.start.Camera2StreamConfigurationMap = this.getHighSpeedVideoSizesFor.mListAnchors[2].getMargin();
                    this.end.Camera2StreamConfigurationMap = -this.getHighSpeedVideoSizesFor.mListAnchors[3].getMargin();
                } else {
                    androidx.constraintlayout.core.widgets.analyzer.DependencyNode target = getTarget(this.getHighSpeedVideoSizesFor.mListAnchors[2]);
                    if (target != null) {
                        addTarget(this.start, target, this.getHighSpeedVideoSizesFor.mListAnchors[2].getMargin());
                    }
                    androidx.constraintlayout.core.widgets.analyzer.DependencyNode target2 = getTarget(this.getHighSpeedVideoSizesFor.mListAnchors[3]);
                    if (target2 != null) {
                        addTarget(this.end, target2, -this.getHighSpeedVideoSizesFor.mListAnchors[3].getMargin());
                    }
                    this.start.delegateToWidgetRun = true;
                    this.end.delegateToWidgetRun = true;
                }
                if (this.getHighSpeedVideoSizesFor.hasBaseline()) {
                    addTarget(this.baseline, this.start, this.getHighSpeedVideoSizesFor.getBaselineDistance());
                    return;
                }
                return;
            }
            if (this.getHighSpeedVideoSizesFor.mListAnchors[2].mTarget != null) {
                androidx.constraintlayout.core.widgets.analyzer.DependencyNode target3 = getTarget(this.getHighSpeedVideoSizesFor.mListAnchors[2]);
                if (target3 != null) {
                    addTarget(this.start, target3, this.getHighSpeedVideoSizesFor.mListAnchors[2].getMargin());
                    addTarget(this.end, this.start, this.getHighSpeedVideoFpsRangesFor.value);
                    if (this.getHighSpeedVideoSizesFor.hasBaseline()) {
                        addTarget(this.baseline, this.start, this.getHighSpeedVideoSizesFor.getBaselineDistance());
                        return;
                    }
                    return;
                }
                return;
            }
            if (this.getHighSpeedVideoSizesFor.mListAnchors[3].mTarget != null) {
                androidx.constraintlayout.core.widgets.analyzer.DependencyNode target4 = getTarget(this.getHighSpeedVideoSizesFor.mListAnchors[3]);
                if (target4 != null) {
                    addTarget(this.end, target4, -this.getHighSpeedVideoSizesFor.mListAnchors[3].getMargin());
                    addTarget(this.start, this.end, -this.getHighSpeedVideoFpsRangesFor.value);
                }
                if (this.getHighSpeedVideoSizesFor.hasBaseline()) {
                    addTarget(this.baseline, this.start, this.getHighSpeedVideoSizesFor.getBaselineDistance());
                    return;
                }
                return;
            }
            if (this.getHighSpeedVideoSizesFor.mListAnchors[4].mTarget != null) {
                androidx.constraintlayout.core.widgets.analyzer.DependencyNode target5 = getTarget(this.getHighSpeedVideoSizesFor.mListAnchors[4]);
                if (target5 != null) {
                    addTarget(this.baseline, target5, 0);
                    addTarget(this.start, this.baseline, -this.getHighSpeedVideoSizesFor.getBaselineDistance());
                    addTarget(this.end, this.start, this.getHighSpeedVideoFpsRangesFor.value);
                    return;
                }
                return;
            }
            if ((this.getHighSpeedVideoSizesFor instanceof androidx.constraintlayout.core.widgets.Helper) || this.getHighSpeedVideoSizesFor.getParent() == null || this.getHighSpeedVideoSizesFor.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER).mTarget != null) {
                return;
            }
            addTarget(this.start, this.getHighSpeedVideoSizesFor.getParent().mVerticalRun.start, this.getHighSpeedVideoSizesFor.getY());
            addTarget(this.end, this.start, this.getHighSpeedVideoFpsRangesFor.value);
            if (this.getHighSpeedVideoSizesFor.hasBaseline()) {
                addTarget(this.baseline, this.start, this.getHighSpeedVideoSizesFor.getBaselineDistance());
                return;
            }
            return;
        }
        if (!this.getHighSpeedVideoFpsRangesFor.resolved && this.mDimensionBehavior == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i = this.getHighSpeedVideoSizesFor.mMatchConstraintDefaultHeight;
            if (i != 2) {
                if (i == 3 && !this.getHighSpeedVideoSizesFor.isInVerticalChain() && this.getHighSpeedVideoSizesFor.mMatchConstraintDefaultWidth != 3) {
                    androidx.constraintlayout.core.widgets.analyzer.DimensionDependency dimensionDependency = this.getHighSpeedVideoSizesFor.mHorizontalRun.getHighSpeedVideoFpsRangesFor;
                    this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizesFor.add(dimensionDependency);
                    dimensionDependency.getHighSpeedVideoSizes.add(this.getHighSpeedVideoFpsRangesFor);
                    this.getHighSpeedVideoFpsRangesFor.delegateToWidgetRun = true;
                    this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes.add(this.start);
                    this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes.add(this.end);
                }
            } else {
                androidx.constraintlayout.core.widgets.ConstraintWidget parent3 = this.getHighSpeedVideoSizesFor.getParent();
                if (parent3 != null) {
                    androidx.constraintlayout.core.widgets.analyzer.DimensionDependency dimensionDependency2 = parent3.mVerticalRun.getHighSpeedVideoFpsRangesFor;
                    this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizesFor.add(dimensionDependency2);
                    dimensionDependency2.getHighSpeedVideoSizes.add(this.getHighSpeedVideoFpsRangesFor);
                    this.getHighSpeedVideoFpsRangesFor.delegateToWidgetRun = true;
                    this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes.add(this.start);
                    this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes.add(this.end);
                }
            }
        } else {
            this.getHighSpeedVideoFpsRangesFor.addDependency(this);
        }
        if (this.getHighSpeedVideoSizesFor.mListAnchors[2].mTarget != null && this.getHighSpeedVideoSizesFor.mListAnchors[3].mTarget != null) {
            if (this.getHighSpeedVideoSizesFor.isInVerticalChain()) {
                this.start.Camera2StreamConfigurationMap = this.getHighSpeedVideoSizesFor.mListAnchors[2].getMargin();
                this.end.Camera2StreamConfigurationMap = -this.getHighSpeedVideoSizesFor.mListAnchors[3].getMargin();
            } else {
                androidx.constraintlayout.core.widgets.analyzer.DependencyNode target6 = getTarget(this.getHighSpeedVideoSizesFor.mListAnchors[2]);
                androidx.constraintlayout.core.widgets.analyzer.DependencyNode target7 = getTarget(this.getHighSpeedVideoSizesFor.mListAnchors[3]);
                if (target6 != null) {
                    target6.addDependency(this);
                }
                if (target7 != null) {
                    target7.addDependency(this);
                }
                this.mRunType = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.CENTER;
            }
            if (this.getHighSpeedVideoSizesFor.hasBaseline()) {
                addTarget(this.baseline, this.start, 1, this.Camera2StreamConfigurationMap);
            }
        } else if (this.getHighSpeedVideoSizesFor.mListAnchors[2].mTarget != null) {
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode target8 = getTarget(this.getHighSpeedVideoSizesFor.mListAnchors[2]);
            if (target8 != null) {
                addTarget(this.start, target8, this.getHighSpeedVideoSizesFor.mListAnchors[2].getMargin());
                addTarget(this.end, this.start, 1, this.getHighSpeedVideoFpsRangesFor);
                if (this.getHighSpeedVideoSizesFor.hasBaseline()) {
                    addTarget(this.baseline, this.start, 1, this.Camera2StreamConfigurationMap);
                }
                if (this.mDimensionBehavior == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.getHighSpeedVideoSizesFor.getDimensionRatio() > 0.0f && this.getHighSpeedVideoSizesFor.mHorizontalRun.mDimensionBehavior == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.getHighSpeedVideoSizesFor.mHorizontalRun.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes.add(this.getHighSpeedVideoFpsRangesFor);
                    this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizesFor.add(this.getHighSpeedVideoSizesFor.mHorizontalRun.getHighSpeedVideoFpsRangesFor);
                    this.getHighSpeedVideoFpsRangesFor.updateDelegate = this;
                }
            }
        } else if (this.getHighSpeedVideoSizesFor.mListAnchors[3].mTarget != null) {
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode target9 = getTarget(this.getHighSpeedVideoSizesFor.mListAnchors[3]);
            if (target9 != null) {
                addTarget(this.end, target9, -this.getHighSpeedVideoSizesFor.mListAnchors[3].getMargin());
                addTarget(this.start, this.end, -1, this.getHighSpeedVideoFpsRangesFor);
                if (this.getHighSpeedVideoSizesFor.hasBaseline()) {
                    addTarget(this.baseline, this.start, 1, this.Camera2StreamConfigurationMap);
                }
            }
        } else if (this.getHighSpeedVideoSizesFor.mListAnchors[4].mTarget != null) {
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode target10 = getTarget(this.getHighSpeedVideoSizesFor.mListAnchors[4]);
            if (target10 != null) {
                addTarget(this.baseline, target10, 0);
                addTarget(this.start, this.baseline, -1, this.Camera2StreamConfigurationMap);
                addTarget(this.end, this.start, 1, this.getHighSpeedVideoFpsRangesFor);
            }
        } else if (!(this.getHighSpeedVideoSizesFor instanceof androidx.constraintlayout.core.widgets.Helper) && this.getHighSpeedVideoSizesFor.getParent() != null) {
            addTarget(this.start, this.getHighSpeedVideoSizesFor.getParent().mVerticalRun.start, this.getHighSpeedVideoSizesFor.getY());
            addTarget(this.end, this.start, 1, this.getHighSpeedVideoFpsRangesFor);
            if (this.getHighSpeedVideoSizesFor.hasBaseline()) {
                addTarget(this.baseline, this.start, 1, this.Camera2StreamConfigurationMap);
            }
            if (this.mDimensionBehavior == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.getHighSpeedVideoSizesFor.getDimensionRatio() > 0.0f && this.getHighSpeedVideoSizesFor.mHorizontalRun.mDimensionBehavior == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                this.getHighSpeedVideoSizesFor.mHorizontalRun.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes.add(this.getHighSpeedVideoFpsRangesFor);
                this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizesFor.add(this.getHighSpeedVideoSizesFor.mHorizontalRun.getHighSpeedVideoFpsRangesFor);
                this.getHighSpeedVideoFpsRangesFor.updateDelegate = this;
            }
        }
        if (this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizesFor.size() == 0) {
            this.getHighSpeedVideoFpsRangesFor.readyToSolve = true;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void applyToWidget() {
        if (this.start.resolved) {
            this.getHighSpeedVideoSizesFor.setY(this.start.value);
        }
    }
}
