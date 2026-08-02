package androidx.constraintlayout.core.widgets.analyzer;

/* loaded from: classes7.dex */
public class HorizontalWidgetRun extends androidx.constraintlayout.core.widgets.analyzer.WidgetRun {
    private static int[] Camera2StreamConfigurationMap = new int[2];

    public HorizontalWidgetRun(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget) {
        super(constraintWidget);
        this.start.getOutputFormats = androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type.LEFT;
        this.end.getOutputFormats = androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type.RIGHT;
        this.orientation = 0;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("HorizontalRun ");
        sb.append(this.getHighSpeedVideoSizesFor.getDebugName());
        return sb.toString();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    final void getHighSpeedVideoFpsRanges() {
        this.getHighSpeedVideoSizes = null;
        this.start.clear();
        this.end.clear();
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
        this.getHighSpeedVideoFpsRangesFor.resolved = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    final boolean getHighSpeedVideoSizes() {
        return this.mDimensionBehavior != androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.getHighSpeedVideoSizesFor.mMatchConstraintDefaultWidth == 0;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    final void getHighResolutionOutputSizeshNQ4ISI() {
        androidx.constraintlayout.core.widgets.ConstraintWidget parent;
        androidx.constraintlayout.core.widgets.ConstraintWidget parent2;
        if (this.getHighSpeedVideoSizesFor.measured) {
            this.getHighSpeedVideoFpsRangesFor.resolve(this.getHighSpeedVideoSizesFor.getWidth());
        }
        if (!this.getHighSpeedVideoFpsRangesFor.resolved) {
            this.mDimensionBehavior = this.getHighSpeedVideoSizesFor.getHorizontalDimensionBehaviour();
            if (this.mDimensionBehavior != androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                if (this.mDimensionBehavior == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (parent2 = this.getHighSpeedVideoSizesFor.getParent()) != null && (parent2.getHorizontalDimensionBehaviour() == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED || parent2.getHorizontalDimensionBehaviour() == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT)) {
                    int width = parent2.getWidth();
                    int margin = this.getHighSpeedVideoSizesFor.mLeft.getMargin();
                    int margin2 = this.getHighSpeedVideoSizesFor.mRight.getMargin();
                    addTarget(this.start, parent2.mHorizontalRun.start, this.getHighSpeedVideoSizesFor.mLeft.getMargin());
                    addTarget(this.end, parent2.mHorizontalRun.end, -this.getHighSpeedVideoSizesFor.mRight.getMargin());
                    this.getHighSpeedVideoFpsRangesFor.resolve((width - margin) - margin2);
                    return;
                }
                if (this.mDimensionBehavior == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED) {
                    this.getHighSpeedVideoFpsRangesFor.resolve(this.getHighSpeedVideoSizesFor.getWidth());
                }
            }
        } else if (this.mDimensionBehavior == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (parent = this.getHighSpeedVideoSizesFor.getParent()) != null && (parent.getHorizontalDimensionBehaviour() == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED || parent.getHorizontalDimensionBehaviour() == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT)) {
            addTarget(this.start, parent.mHorizontalRun.start, this.getHighSpeedVideoSizesFor.mLeft.getMargin());
            addTarget(this.end, parent.mHorizontalRun.end, -this.getHighSpeedVideoSizesFor.mRight.getMargin());
            return;
        }
        if (this.getHighSpeedVideoFpsRangesFor.resolved && this.getHighSpeedVideoSizesFor.measured) {
            if (this.getHighSpeedVideoSizesFor.mListAnchors[0].mTarget != null && this.getHighSpeedVideoSizesFor.mListAnchors[1].mTarget != null) {
                if (this.getHighSpeedVideoSizesFor.isInHorizontalChain()) {
                    this.start.Camera2StreamConfigurationMap = this.getHighSpeedVideoSizesFor.mListAnchors[0].getMargin();
                    this.end.Camera2StreamConfigurationMap = -this.getHighSpeedVideoSizesFor.mListAnchors[1].getMargin();
                    return;
                }
                androidx.constraintlayout.core.widgets.analyzer.DependencyNode target = getTarget(this.getHighSpeedVideoSizesFor.mListAnchors[0]);
                if (target != null) {
                    addTarget(this.start, target, this.getHighSpeedVideoSizesFor.mListAnchors[0].getMargin());
                }
                androidx.constraintlayout.core.widgets.analyzer.DependencyNode target2 = getTarget(this.getHighSpeedVideoSizesFor.mListAnchors[1]);
                if (target2 != null) {
                    addTarget(this.end, target2, -this.getHighSpeedVideoSizesFor.mListAnchors[1].getMargin());
                }
                this.start.delegateToWidgetRun = true;
                this.end.delegateToWidgetRun = true;
                return;
            }
            if (this.getHighSpeedVideoSizesFor.mListAnchors[0].mTarget != null) {
                androidx.constraintlayout.core.widgets.analyzer.DependencyNode target3 = getTarget(this.getHighSpeedVideoSizesFor.mListAnchors[0]);
                if (target3 != null) {
                    addTarget(this.start, target3, this.getHighSpeedVideoSizesFor.mListAnchors[0].getMargin());
                    addTarget(this.end, this.start, this.getHighSpeedVideoFpsRangesFor.value);
                    return;
                }
                return;
            }
            if (this.getHighSpeedVideoSizesFor.mListAnchors[1].mTarget != null) {
                androidx.constraintlayout.core.widgets.analyzer.DependencyNode target4 = getTarget(this.getHighSpeedVideoSizesFor.mListAnchors[1]);
                if (target4 != null) {
                    addTarget(this.end, target4, -this.getHighSpeedVideoSizesFor.mListAnchors[1].getMargin());
                    addTarget(this.start, this.end, -this.getHighSpeedVideoFpsRangesFor.value);
                    return;
                }
                return;
            }
            if ((this.getHighSpeedVideoSizesFor instanceof androidx.constraintlayout.core.widgets.Helper) || this.getHighSpeedVideoSizesFor.getParent() == null || this.getHighSpeedVideoSizesFor.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER).mTarget != null) {
                return;
            }
            addTarget(this.start, this.getHighSpeedVideoSizesFor.getParent().mHorizontalRun.start, this.getHighSpeedVideoSizesFor.getX());
            addTarget(this.end, this.start, this.getHighSpeedVideoFpsRangesFor.value);
            return;
        }
        if (this.mDimensionBehavior == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i = this.getHighSpeedVideoSizesFor.mMatchConstraintDefaultWidth;
            if (i == 2) {
                androidx.constraintlayout.core.widgets.ConstraintWidget parent3 = this.getHighSpeedVideoSizesFor.getParent();
                if (parent3 != null) {
                    androidx.constraintlayout.core.widgets.analyzer.DimensionDependency dimensionDependency = parent3.mVerticalRun.getHighSpeedVideoFpsRangesFor;
                    this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizesFor.add(dimensionDependency);
                    dimensionDependency.getHighSpeedVideoSizes.add(this.getHighSpeedVideoFpsRangesFor);
                    this.getHighSpeedVideoFpsRangesFor.delegateToWidgetRun = true;
                    this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes.add(this.start);
                    this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes.add(this.end);
                }
            } else if (i == 3) {
                if (this.getHighSpeedVideoSizesFor.mMatchConstraintDefaultHeight == 3) {
                    this.start.updateDelegate = this;
                    this.end.updateDelegate = this;
                    this.getHighSpeedVideoSizesFor.mVerticalRun.start.updateDelegate = this;
                    this.getHighSpeedVideoSizesFor.mVerticalRun.end.updateDelegate = this;
                    this.getHighSpeedVideoFpsRangesFor.updateDelegate = this;
                    if (this.getHighSpeedVideoSizesFor.isInVerticalChain()) {
                        this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizesFor.add(this.getHighSpeedVideoSizesFor.mVerticalRun.getHighSpeedVideoFpsRangesFor);
                        this.getHighSpeedVideoSizesFor.mVerticalRun.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes.add(this.getHighSpeedVideoFpsRangesFor);
                        this.getHighSpeedVideoSizesFor.mVerticalRun.getHighSpeedVideoFpsRangesFor.updateDelegate = this;
                        this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizesFor.add(this.getHighSpeedVideoSizesFor.mVerticalRun.start);
                        this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizesFor.add(this.getHighSpeedVideoSizesFor.mVerticalRun.end);
                        this.getHighSpeedVideoSizesFor.mVerticalRun.start.getHighSpeedVideoSizes.add(this.getHighSpeedVideoFpsRangesFor);
                        this.getHighSpeedVideoSizesFor.mVerticalRun.end.getHighSpeedVideoSizes.add(this.getHighSpeedVideoFpsRangesFor);
                    } else if (this.getHighSpeedVideoSizesFor.isInHorizontalChain()) {
                        this.getHighSpeedVideoSizesFor.mVerticalRun.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizesFor.add(this.getHighSpeedVideoFpsRangesFor);
                        this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes.add(this.getHighSpeedVideoSizesFor.mVerticalRun.getHighSpeedVideoFpsRangesFor);
                    } else {
                        this.getHighSpeedVideoSizesFor.mVerticalRun.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizesFor.add(this.getHighSpeedVideoFpsRangesFor);
                    }
                } else {
                    androidx.constraintlayout.core.widgets.analyzer.DimensionDependency dimensionDependency2 = this.getHighSpeedVideoSizesFor.mVerticalRun.getHighSpeedVideoFpsRangesFor;
                    this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizesFor.add(dimensionDependency2);
                    dimensionDependency2.getHighSpeedVideoSizes.add(this.getHighSpeedVideoFpsRangesFor);
                    this.getHighSpeedVideoSizesFor.mVerticalRun.start.getHighSpeedVideoSizes.add(this.getHighSpeedVideoFpsRangesFor);
                    this.getHighSpeedVideoSizesFor.mVerticalRun.end.getHighSpeedVideoSizes.add(this.getHighSpeedVideoFpsRangesFor);
                    this.getHighSpeedVideoFpsRangesFor.delegateToWidgetRun = true;
                    this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes.add(this.start);
                    this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes.add(this.end);
                    this.start.getHighSpeedVideoSizesFor.add(this.getHighSpeedVideoFpsRangesFor);
                    this.end.getHighSpeedVideoSizesFor.add(this.getHighSpeedVideoFpsRangesFor);
                }
            }
        }
        if (this.getHighSpeedVideoSizesFor.mListAnchors[0].mTarget != null && this.getHighSpeedVideoSizesFor.mListAnchors[1].mTarget != null) {
            if (this.getHighSpeedVideoSizesFor.isInHorizontalChain()) {
                this.start.Camera2StreamConfigurationMap = this.getHighSpeedVideoSizesFor.mListAnchors[0].getMargin();
                this.end.Camera2StreamConfigurationMap = -this.getHighSpeedVideoSizesFor.mListAnchors[1].getMargin();
                return;
            }
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode target5 = getTarget(this.getHighSpeedVideoSizesFor.mListAnchors[0]);
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode target6 = getTarget(this.getHighSpeedVideoSizesFor.mListAnchors[1]);
            if (target5 != null) {
                target5.addDependency(this);
            }
            if (target6 != null) {
                target6.addDependency(this);
            }
            this.mRunType = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.CENTER;
            return;
        }
        if (this.getHighSpeedVideoSizesFor.mListAnchors[0].mTarget != null) {
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode target7 = getTarget(this.getHighSpeedVideoSizesFor.mListAnchors[0]);
            if (target7 != null) {
                addTarget(this.start, target7, this.getHighSpeedVideoSizesFor.mListAnchors[0].getMargin());
                addTarget(this.end, this.start, 1, this.getHighSpeedVideoFpsRangesFor);
                return;
            }
            return;
        }
        if (this.getHighSpeedVideoSizesFor.mListAnchors[1].mTarget != null) {
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode target8 = getTarget(this.getHighSpeedVideoSizesFor.mListAnchors[1]);
            if (target8 != null) {
                addTarget(this.end, target8, -this.getHighSpeedVideoSizesFor.mListAnchors[1].getMargin());
                addTarget(this.start, this.end, -1, this.getHighSpeedVideoFpsRangesFor);
                return;
            }
            return;
        }
        if ((this.getHighSpeedVideoSizesFor instanceof androidx.constraintlayout.core.widgets.Helper) || this.getHighSpeedVideoSizesFor.getParent() == null) {
            return;
        }
        addTarget(this.start, this.getHighSpeedVideoSizesFor.getParent().mHorizontalRun.start, this.getHighSpeedVideoSizesFor.getX());
        addTarget(this.end, this.start, 1, this.getHighSpeedVideoFpsRangesFor);
    }

    private static void getHighSpeedVideoFpsRanges(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 == 1) {
                    iArr[0] = i6;
                    iArr[1] = (int) ((i6 * f) + 0.5f);
                    return;
                }
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* renamed from: androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Camera2StreamConfigurationMap;

        static {
            int[] iArr = new int[androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.values().length];
            Camera2StreamConfigurationMap = iArr;
            try {
                iArr[androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.START.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                Camera2StreamConfigurationMap[androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.END.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                Camera2StreamConfigurationMap[androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.CENTER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x02df, code lost:
    
        if (r11 != 1) goto L123;
     */
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.Dependency
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void update(androidx.constraintlayout.core.widgets.analyzer.Dependency dependency) {
        float f;
        float dimensionRatio;
        float f2;
        int i;
        int i2 = androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun.AnonymousClass1.Camera2StreamConfigurationMap[this.mRunType.ordinal()];
        if (i2 == 1) {
            updateRunStart(dependency);
        } else if (i2 == 2) {
            updateRunEnd(dependency);
        } else if (i2 == 3) {
            updateRunCenter(dependency, this.getHighSpeedVideoSizesFor.mLeft, this.getHighSpeedVideoSizesFor.mRight, 0);
            return;
        }
        if (!this.getHighSpeedVideoFpsRangesFor.resolved && this.mDimensionBehavior == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i3 = this.getHighSpeedVideoSizesFor.mMatchConstraintDefaultWidth;
            if (i3 == 2) {
                androidx.constraintlayout.core.widgets.ConstraintWidget parent = this.getHighSpeedVideoSizesFor.getParent();
                if (parent != null && parent.mHorizontalRun.getHighSpeedVideoFpsRangesFor.resolved) {
                    this.getHighSpeedVideoFpsRangesFor.resolve((int) ((parent.mHorizontalRun.getHighSpeedVideoFpsRangesFor.value * this.getHighSpeedVideoSizesFor.mMatchConstraintPercentWidth) + 0.5f));
                }
            } else if (i3 == 3) {
                if (this.getHighSpeedVideoSizesFor.mMatchConstraintDefaultHeight == 0 || this.getHighSpeedVideoSizesFor.mMatchConstraintDefaultHeight == 3) {
                    androidx.constraintlayout.core.widgets.analyzer.DependencyNode dependencyNode = this.getHighSpeedVideoSizesFor.mVerticalRun.start;
                    androidx.constraintlayout.core.widgets.analyzer.DependencyNode dependencyNode2 = this.getHighSpeedVideoSizesFor.mVerticalRun.end;
                    boolean z = this.getHighSpeedVideoSizesFor.mLeft.mTarget != null;
                    boolean z2 = this.getHighSpeedVideoSizesFor.mTop.mTarget != null;
                    boolean z3 = this.getHighSpeedVideoSizesFor.mRight.mTarget != null;
                    boolean z4 = this.getHighSpeedVideoSizesFor.mBottom.mTarget != null;
                    int dimensionRatioSide = this.getHighSpeedVideoSizesFor.getDimensionRatioSide();
                    if (z && z2 && z3 && z4) {
                        float dimensionRatio2 = this.getHighSpeedVideoSizesFor.getDimensionRatio();
                        if (dependencyNode.resolved && dependencyNode2.resolved) {
                            if (this.start.readyToSolve && this.end.readyToSolve) {
                                getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap, this.start.getHighSpeedVideoSizesFor.get(0).value + this.start.Camera2StreamConfigurationMap, this.end.getHighSpeedVideoSizesFor.get(0).value - this.end.Camera2StreamConfigurationMap, dependencyNode.Camera2StreamConfigurationMap + dependencyNode.value, dependencyNode2.value - dependencyNode2.Camera2StreamConfigurationMap, dimensionRatio2, dimensionRatioSide);
                                this.getHighSpeedVideoFpsRangesFor.resolve(Camera2StreamConfigurationMap[0]);
                                this.getHighSpeedVideoSizesFor.mVerticalRun.getHighSpeedVideoFpsRangesFor.resolve(Camera2StreamConfigurationMap[1]);
                                return;
                            }
                            return;
                        }
                        if (this.start.resolved && this.end.resolved) {
                            if (!dependencyNode.readyToSolve || !dependencyNode2.readyToSolve) {
                                return;
                            }
                            getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap, this.start.value + this.start.Camera2StreamConfigurationMap, this.end.value - this.end.Camera2StreamConfigurationMap, dependencyNode.Camera2StreamConfigurationMap + dependencyNode.getHighSpeedVideoSizesFor.get(0).value, dependencyNode2.getHighSpeedVideoSizesFor.get(0).value - dependencyNode2.Camera2StreamConfigurationMap, dimensionRatio2, dimensionRatioSide);
                            this.getHighSpeedVideoFpsRangesFor.resolve(Camera2StreamConfigurationMap[0]);
                            this.getHighSpeedVideoSizesFor.mVerticalRun.getHighSpeedVideoFpsRangesFor.resolve(Camera2StreamConfigurationMap[1]);
                        }
                        if (!this.start.readyToSolve || !this.end.readyToSolve || !dependencyNode.readyToSolve || !dependencyNode2.readyToSolve) {
                            return;
                        }
                        getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap, this.start.getHighSpeedVideoSizesFor.get(0).value + this.start.Camera2StreamConfigurationMap, this.end.getHighSpeedVideoSizesFor.get(0).value - this.end.Camera2StreamConfigurationMap, dependencyNode.Camera2StreamConfigurationMap + dependencyNode.getHighSpeedVideoSizesFor.get(0).value, dependencyNode2.getHighSpeedVideoSizesFor.get(0).value - dependencyNode2.Camera2StreamConfigurationMap, dimensionRatio2, dimensionRatioSide);
                        this.getHighSpeedVideoFpsRangesFor.resolve(Camera2StreamConfigurationMap[0]);
                        this.getHighSpeedVideoSizesFor.mVerticalRun.getHighSpeedVideoFpsRangesFor.resolve(Camera2StreamConfigurationMap[1]);
                    } else if (z && z3) {
                        if (!this.start.readyToSolve || !this.end.readyToSolve) {
                            return;
                        }
                        float dimensionRatio3 = this.getHighSpeedVideoSizesFor.getDimensionRatio();
                        int i4 = this.start.getHighSpeedVideoSizesFor.get(0).value + this.start.Camera2StreamConfigurationMap;
                        int i5 = this.end.getHighSpeedVideoSizesFor.get(0).value - this.end.Camera2StreamConfigurationMap;
                        if (dimensionRatioSide == -1 || dimensionRatioSide == 0) {
                            int limitedDimension = getLimitedDimension(i5 - i4, 0);
                            int i6 = (int) ((limitedDimension * dimensionRatio3) + 0.5f);
                            int limitedDimension2 = getLimitedDimension(i6, 1);
                            if (i6 != limitedDimension2) {
                                limitedDimension = (int) ((limitedDimension2 / dimensionRatio3) + 0.5f);
                            }
                            this.getHighSpeedVideoFpsRangesFor.resolve(limitedDimension);
                            this.getHighSpeedVideoSizesFor.mVerticalRun.getHighSpeedVideoFpsRangesFor.resolve(limitedDimension2);
                        } else if (dimensionRatioSide == 1) {
                            int limitedDimension3 = getLimitedDimension(i5 - i4, 0);
                            int i7 = (int) ((limitedDimension3 / dimensionRatio3) + 0.5f);
                            int limitedDimension4 = getLimitedDimension(i7, 1);
                            if (i7 != limitedDimension4) {
                                limitedDimension3 = (int) ((limitedDimension4 * dimensionRatio3) + 0.5f);
                            }
                            this.getHighSpeedVideoFpsRangesFor.resolve(limitedDimension3);
                            this.getHighSpeedVideoSizesFor.mVerticalRun.getHighSpeedVideoFpsRangesFor.resolve(limitedDimension4);
                        }
                    } else if (z2 && z4) {
                        if (!dependencyNode.readyToSolve || !dependencyNode2.readyToSolve) {
                            return;
                        }
                        float dimensionRatio4 = this.getHighSpeedVideoSizesFor.getDimensionRatio();
                        int i8 = dependencyNode.getHighSpeedVideoSizesFor.get(0).value + dependencyNode.Camera2StreamConfigurationMap;
                        int i9 = dependencyNode2.getHighSpeedVideoSizesFor.get(0).value - dependencyNode2.Camera2StreamConfigurationMap;
                        if (dimensionRatioSide != -1) {
                            if (dimensionRatioSide == 0) {
                                int limitedDimension5 = getLimitedDimension(i9 - i8, 1);
                                int i10 = (int) ((limitedDimension5 * dimensionRatio4) + 0.5f);
                                int limitedDimension6 = getLimitedDimension(i10, 0);
                                if (i10 != limitedDimension6) {
                                    limitedDimension5 = (int) ((limitedDimension6 / dimensionRatio4) + 0.5f);
                                }
                                this.getHighSpeedVideoFpsRangesFor.resolve(limitedDimension6);
                                this.getHighSpeedVideoSizesFor.mVerticalRun.getHighSpeedVideoFpsRangesFor.resolve(limitedDimension5);
                            }
                        }
                        int limitedDimension7 = getLimitedDimension(i9 - i8, 1);
                        int i11 = (int) ((limitedDimension7 / dimensionRatio4) + 0.5f);
                        int limitedDimension8 = getLimitedDimension(i11, 0);
                        if (i11 != limitedDimension8) {
                            limitedDimension7 = (int) ((limitedDimension8 * dimensionRatio4) + 0.5f);
                        }
                        this.getHighSpeedVideoFpsRangesFor.resolve(limitedDimension8);
                        this.getHighSpeedVideoSizesFor.mVerticalRun.getHighSpeedVideoFpsRangesFor.resolve(limitedDimension7);
                    }
                } else {
                    int dimensionRatioSide2 = this.getHighSpeedVideoSizesFor.getDimensionRatioSide();
                    if (dimensionRatioSide2 == -1) {
                        f = this.getHighSpeedVideoSizesFor.mVerticalRun.getHighSpeedVideoFpsRangesFor.value;
                        dimensionRatio = this.getHighSpeedVideoSizesFor.getDimensionRatio();
                    } else if (dimensionRatioSide2 == 0) {
                        f2 = this.getHighSpeedVideoSizesFor.mVerticalRun.getHighSpeedVideoFpsRangesFor.value / this.getHighSpeedVideoSizesFor.getDimensionRatio();
                        i = (int) (f2 + 0.5f);
                        this.getHighSpeedVideoFpsRangesFor.resolve(i);
                    } else if (dimensionRatioSide2 == 1) {
                        f = this.getHighSpeedVideoSizesFor.mVerticalRun.getHighSpeedVideoFpsRangesFor.value;
                        dimensionRatio = this.getHighSpeedVideoSizesFor.getDimensionRatio();
                    } else {
                        i = 0;
                        this.getHighSpeedVideoFpsRangesFor.resolve(i);
                    }
                    f2 = f * dimensionRatio;
                    i = (int) (f2 + 0.5f);
                    this.getHighSpeedVideoFpsRangesFor.resolve(i);
                }
            }
        }
        if (this.start.readyToSolve && this.end.readyToSolve) {
            if (this.start.resolved && this.end.resolved && this.getHighSpeedVideoFpsRangesFor.resolved) {
                return;
            }
            if (!this.getHighSpeedVideoFpsRangesFor.resolved && this.mDimensionBehavior == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.getHighSpeedVideoSizesFor.mMatchConstraintDefaultWidth == 0 && !this.getHighSpeedVideoSizesFor.isInHorizontalChain()) {
                androidx.constraintlayout.core.widgets.analyzer.DependencyNode dependencyNode3 = this.start.getHighSpeedVideoSizesFor.get(0);
                androidx.constraintlayout.core.widgets.analyzer.DependencyNode dependencyNode4 = this.end.getHighSpeedVideoSizesFor.get(0);
                int i12 = dependencyNode3.value + this.start.Camera2StreamConfigurationMap;
                int i13 = dependencyNode4.value + this.end.Camera2StreamConfigurationMap;
                this.start.resolve(i12);
                this.end.resolve(i13);
                this.getHighSpeedVideoFpsRangesFor.resolve(i13 - i12);
                return;
            }
            if (!this.getHighSpeedVideoFpsRangesFor.resolved && this.mDimensionBehavior == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.matchConstraintsType == 1 && this.start.getHighSpeedVideoSizesFor.size() > 0 && this.end.getHighSpeedVideoSizesFor.size() > 0) {
                int min = java.lang.Math.min((this.end.getHighSpeedVideoSizesFor.get(0).value + this.end.Camera2StreamConfigurationMap) - (this.start.getHighSpeedVideoSizesFor.get(0).value + this.start.Camera2StreamConfigurationMap), this.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI);
                int i14 = this.getHighSpeedVideoSizesFor.mMatchConstraintMaxWidth;
                int max = java.lang.Math.max(this.getHighSpeedVideoSizesFor.mMatchConstraintMinWidth, min);
                if (i14 > 0) {
                    max = java.lang.Math.min(i14, max);
                }
                this.getHighSpeedVideoFpsRangesFor.resolve(max);
            }
            if (this.getHighSpeedVideoFpsRangesFor.resolved) {
                androidx.constraintlayout.core.widgets.analyzer.DependencyNode dependencyNode5 = this.start.getHighSpeedVideoSizesFor.get(0);
                androidx.constraintlayout.core.widgets.analyzer.DependencyNode dependencyNode6 = this.end.getHighSpeedVideoSizesFor.get(0);
                int i15 = dependencyNode5.value + this.start.Camera2StreamConfigurationMap;
                int i16 = dependencyNode6.value + this.end.Camera2StreamConfigurationMap;
                float horizontalBiasPercent = this.getHighSpeedVideoSizesFor.getHorizontalBiasPercent();
                if (dependencyNode5 == dependencyNode6) {
                    i15 = dependencyNode5.value;
                    i16 = dependencyNode6.value;
                    horizontalBiasPercent = 0.5f;
                }
                this.start.resolve((int) (i15 + 0.5f + (((i16 - i15) - this.getHighSpeedVideoFpsRangesFor.value) * horizontalBiasPercent)));
                this.end.resolve(this.start.value + this.getHighSpeedVideoFpsRangesFor.value);
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void applyToWidget() {
        if (this.start.resolved) {
            this.getHighSpeedVideoSizesFor.setX(this.start.value);
        }
    }
}
