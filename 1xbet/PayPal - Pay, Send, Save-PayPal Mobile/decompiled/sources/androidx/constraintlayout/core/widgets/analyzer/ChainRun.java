package androidx.constraintlayout.core.widgets.analyzer;

/* loaded from: classes7.dex */
public class ChainRun extends androidx.constraintlayout.core.widgets.analyzer.WidgetRun {
    private int Camera2StreamConfigurationMap;
    java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> getHighSpeedVideoFpsRanges;

    public ChainRun(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget, int i) {
        super(constraintWidget);
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget2;
        this.getHighSpeedVideoFpsRanges = new java.util.ArrayList<>();
        this.orientation = i;
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget3 = this.getHighSpeedVideoSizesFor;
        androidx.constraintlayout.core.widgets.ConstraintWidget previousChainMember = constraintWidget3.getPreviousChainMember(this.orientation);
        while (true) {
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget4 = previousChainMember;
            constraintWidget2 = constraintWidget3;
            constraintWidget3 = constraintWidget4;
            if (constraintWidget3 == null) {
                break;
            } else {
                previousChainMember = constraintWidget3.getPreviousChainMember(this.orientation);
            }
        }
        this.getHighSpeedVideoSizesFor = constraintWidget2;
        this.getHighSpeedVideoFpsRanges.add(constraintWidget2.getRun(this.orientation));
        androidx.constraintlayout.core.widgets.ConstraintWidget nextChainMember = constraintWidget2.getNextChainMember(this.orientation);
        while (nextChainMember != null) {
            this.getHighSpeedVideoFpsRanges.add(nextChainMember.getRun(this.orientation));
            nextChainMember = nextChainMember.getNextChainMember(this.orientation);
        }
        java.util.Iterator<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> it = this.getHighSpeedVideoFpsRanges.iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun next = it.next();
            if (this.orientation == 0) {
                next.getHighSpeedVideoSizesFor.horizontalChainRun = this;
            } else if (this.orientation == 1) {
                next.getHighSpeedVideoSizesFor.verticalChainRun = this;
            }
        }
        if (this.orientation == 0 && ((androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) this.getHighSpeedVideoSizesFor.getParent()).isRtl() && this.getHighSpeedVideoFpsRanges.size() > 1) {
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> arrayList = this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoSizesFor = arrayList.get(arrayList.size() - 1).getHighSpeedVideoSizesFor;
        }
        this.Camera2StreamConfigurationMap = this.orientation == 0 ? this.getHighSpeedVideoSizesFor.getHorizontalChainStyle() : this.getHighSpeedVideoSizesFor.getVerticalChainStyle();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ChainRun ");
        sb.append(this.orientation == 0 ? "horizontal : " : "vertical : ");
        java.util.Iterator<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> it = this.getHighSpeedVideoFpsRanges.iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun next = it.next();
            sb.append("<");
            sb.append(next);
            sb.append("> ");
        }
        return sb.toString();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    final boolean getHighSpeedVideoSizes() {
        int size = this.getHighSpeedVideoFpsRanges.size();
        for (int i = 0; i < size; i++) {
            if (!this.getHighSpeedVideoFpsRanges.get(i).getHighSpeedVideoSizes()) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public long getWrapDimension() {
        int size = this.getHighSpeedVideoFpsRanges.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j = j + r4.start.Camera2StreamConfigurationMap + this.getHighSpeedVideoFpsRanges.get(i).getWrapDimension() + r4.end.Camera2StreamConfigurationMap;
        }
        return j;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    final void getHighSpeedVideoFpsRanges() {
        this.getHighSpeedVideoSizes = null;
        java.util.Iterator<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> it = this.getHighSpeedVideoFpsRanges.iterator();
        while (it.hasNext()) {
            it.next().getHighSpeedVideoFpsRanges();
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    final void Camera2StreamConfigurationMap() {
        this.start.resolved = false;
        this.end.resolved = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:283:0x03dc, code lost:
    
        r2 = r2 - r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ca, code lost:
    
        if (r3.getHighSpeedVideoFpsRangesFor.resolved != false) goto L55;
     */
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.Dependency
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void update(androidx.constraintlayout.core.widgets.analyzer.Dependency dependency) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        float f;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        float f2;
        int i11;
        int i12;
        int i13;
        if (this.start.resolved && this.end.resolved) {
            androidx.constraintlayout.core.widgets.ConstraintWidget parent = this.getHighSpeedVideoSizesFor.getParent();
            boolean isRtl = parent instanceof androidx.constraintlayout.core.widgets.ConstraintWidgetContainer ? ((androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) parent).isRtl() : false;
            int i14 = this.end.value - this.start.value;
            int size = this.getHighSpeedVideoFpsRanges.size();
            int i15 = 0;
            while (true) {
                i = -1;
                i2 = 8;
                if (i15 >= size) {
                    i15 = -1;
                    break;
                } else if (this.getHighSpeedVideoFpsRanges.get(i15).getHighSpeedVideoSizesFor.getVisibility() != 8) {
                    break;
                } else {
                    i15++;
                }
            }
            int i16 = size - 1;
            int i17 = i16;
            while (true) {
                if (i17 < 0) {
                    break;
                }
                if (this.getHighSpeedVideoFpsRanges.get(i17).getHighSpeedVideoSizesFor.getVisibility() != 8) {
                    i = i17;
                    break;
                }
                i17--;
            }
            int i18 = 0;
            while (i18 < 2) {
                int i19 = 0;
                i4 = 0;
                i5 = 0;
                int i20 = 0;
                f = 0.0f;
                while (i19 < size) {
                    androidx.constraintlayout.core.widgets.analyzer.WidgetRun widgetRun = this.getHighSpeedVideoFpsRanges.get(i19);
                    if (widgetRun.getHighSpeedVideoSizesFor.getVisibility() != i2) {
                        i20++;
                        if (i19 > 0 && i19 >= i15) {
                            i4 += widgetRun.start.Camera2StreamConfigurationMap;
                        }
                        int i21 = widgetRun.getHighSpeedVideoFpsRangesFor.value;
                        boolean z = widgetRun.mDimensionBehavior != androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                        if (z) {
                            if (this.orientation == 0 && !widgetRun.getHighSpeedVideoSizesFor.mHorizontalRun.getHighSpeedVideoFpsRangesFor.resolved) {
                                return;
                            }
                            if (this.orientation == 1 && !widgetRun.getHighSpeedVideoSizesFor.mVerticalRun.getHighSpeedVideoFpsRangesFor.resolved) {
                                return;
                            }
                        } else {
                            if (widgetRun.matchConstraintsType == 1 && i18 == 0) {
                                i21 = widgetRun.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI;
                                i5++;
                            }
                            z = true;
                        }
                        if (z) {
                            i4 += i21;
                        } else {
                            i5++;
                            float f3 = widgetRun.getHighSpeedVideoSizesFor.mWeight[this.orientation];
                            if (f3 >= 0.0f) {
                                f += f3;
                            }
                        }
                        if (i19 < i16 && i19 < i) {
                            i4 += -widgetRun.end.Camera2StreamConfigurationMap;
                        }
                    }
                    i19++;
                    i2 = 8;
                }
                if (i4 < i14 || i5 == 0) {
                    i3 = i20;
                    break;
                } else {
                    i18++;
                    i2 = 8;
                }
            }
            i3 = 0;
            i4 = 0;
            i5 = 0;
            f = 0.0f;
            int i22 = this.start.value;
            if (isRtl) {
                i22 = this.end.value;
            }
            if (i4 > i14) {
                int i23 = (int) (((i4 - i14) / 2.0f) + 0.5f);
                i22 = isRtl ? i22 + i23 : i22 - i23;
            }
            if (i5 > 0) {
                float f4 = i14 - i4;
                int i24 = (int) ((f4 / i5) + 0.5f);
                int i25 = 0;
                int i26 = 0;
                while (i25 < size) {
                    androidx.constraintlayout.core.widgets.analyzer.WidgetRun widgetRun2 = this.getHighSpeedVideoFpsRanges.get(i25);
                    int i27 = i24;
                    if (widgetRun2.getHighSpeedVideoSizesFor.getVisibility() == 8 || widgetRun2.mDimensionBehavior != androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || widgetRun2.getHighSpeedVideoFpsRangesFor.resolved) {
                        i10 = i22;
                        f2 = f4;
                        i11 = i4;
                    } else {
                        int i28 = f > 0.0f ? (int) (((widgetRun2.getHighSpeedVideoSizesFor.mWeight[this.orientation] * f4) / f) + 0.5f) : i27;
                        if (this.orientation == 0) {
                            i12 = widgetRun2.getHighSpeedVideoSizesFor.mMatchConstraintMaxWidth;
                            f2 = f4;
                            i13 = widgetRun2.getHighSpeedVideoSizesFor.mMatchConstraintMinWidth;
                        } else {
                            f2 = f4;
                            i12 = widgetRun2.getHighSpeedVideoSizesFor.mMatchConstraintMaxHeight;
                            i13 = widgetRun2.getHighSpeedVideoSizesFor.mMatchConstraintMinHeight;
                        }
                        i11 = i4;
                        i10 = i22;
                        int max = java.lang.Math.max(i13, widgetRun2.matchConstraintsType == 1 ? java.lang.Math.min(i28, widgetRun2.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI) : i28);
                        if (i12 > 0) {
                            max = java.lang.Math.min(i12, max);
                        }
                        if (max != i28) {
                            i26++;
                            i28 = max;
                        }
                        widgetRun2.getHighSpeedVideoFpsRangesFor.resolve(i28);
                    }
                    i25++;
                    i24 = i27;
                    f4 = f2;
                    i4 = i11;
                    i22 = i10;
                }
                i6 = i22;
                int i29 = i4;
                if (i26 > 0) {
                    i5 -= i26;
                    int i30 = 0;
                    for (int i31 = 0; i31 < size; i31++) {
                        androidx.constraintlayout.core.widgets.analyzer.WidgetRun widgetRun3 = this.getHighSpeedVideoFpsRanges.get(i31);
                        if (widgetRun3.getHighSpeedVideoSizesFor.getVisibility() != 8) {
                            if (i31 > 0 && i31 >= i15) {
                                i30 += widgetRun3.start.Camera2StreamConfigurationMap;
                            }
                            i30 += widgetRun3.getHighSpeedVideoFpsRangesFor.value;
                            if (i31 < i16 && i31 < i) {
                                i30 += -widgetRun3.end.Camera2StreamConfigurationMap;
                            }
                        }
                    }
                    i4 = i30;
                } else {
                    i4 = i29;
                }
                i8 = 2;
                if (this.Camera2StreamConfigurationMap == 2 && i26 == 0) {
                    i7 = 0;
                    this.Camera2StreamConfigurationMap = 0;
                } else {
                    i7 = 0;
                }
            } else {
                i6 = i22;
                i7 = 0;
                i8 = 2;
            }
            if (i4 > i14) {
                this.Camera2StreamConfigurationMap = i8;
            }
            if (i3 > 0 && i5 == 0 && i15 == i) {
                this.Camera2StreamConfigurationMap = i8;
            }
            int i32 = this.Camera2StreamConfigurationMap;
            if (i32 == 1) {
                if (i3 > 1) {
                    i9 = (i14 - i4) / (i3 - 1);
                } else {
                    i9 = i3 == 1 ? (i14 - i4) / 2 : i7;
                }
                if (i5 > 0) {
                    i9 = i7;
                }
                int i33 = i6;
                for (int i34 = i7; i34 < size; i34++) {
                    androidx.constraintlayout.core.widgets.analyzer.WidgetRun widgetRun4 = this.getHighSpeedVideoFpsRanges.get(isRtl ? size - (i34 + 1) : i34);
                    if (widgetRun4.getHighSpeedVideoSizesFor.getVisibility() == 8) {
                        widgetRun4.start.resolve(i33);
                        widgetRun4.end.resolve(i33);
                    } else {
                        if (i34 > 0) {
                            i33 = isRtl ? i33 - i9 : i33 + i9;
                        }
                        if (i34 > 0 && i34 >= i15) {
                            if (isRtl) {
                                i33 -= widgetRun4.start.Camera2StreamConfigurationMap;
                            } else {
                                i33 += widgetRun4.start.Camera2StreamConfigurationMap;
                            }
                        }
                        if (isRtl) {
                            widgetRun4.end.resolve(i33);
                        } else {
                            widgetRun4.start.resolve(i33);
                        }
                        int i35 = widgetRun4.getHighSpeedVideoFpsRangesFor.value;
                        if (widgetRun4.mDimensionBehavior == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && widgetRun4.matchConstraintsType == 1) {
                            i35 = widgetRun4.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI;
                        }
                        i33 = isRtl ? i33 - i35 : i33 + i35;
                        if (isRtl) {
                            widgetRun4.start.resolve(i33);
                        } else {
                            widgetRun4.end.resolve(i33);
                        }
                        widgetRun4.getHighResolutionOutputSizeshNQ4ISI = true;
                        if (i34 < i16 && i34 < i) {
                            if (isRtl) {
                                i33 -= -widgetRun4.end.Camera2StreamConfigurationMap;
                            } else {
                                i33 += -widgetRun4.end.Camera2StreamConfigurationMap;
                            }
                        }
                    }
                }
                return;
            }
            if (i32 == 0) {
                int i36 = (i14 - i4) / (i3 + 1);
                if (i5 > 0) {
                    i36 = i7;
                }
                int i37 = i6;
                for (int i38 = i7; i38 < size; i38++) {
                    androidx.constraintlayout.core.widgets.analyzer.WidgetRun widgetRun5 = this.getHighSpeedVideoFpsRanges.get(isRtl ? size - (i38 + 1) : i38);
                    if (widgetRun5.getHighSpeedVideoSizesFor.getVisibility() == 8) {
                        widgetRun5.start.resolve(i37);
                        widgetRun5.end.resolve(i37);
                    } else {
                        int i39 = isRtl ? i37 - i36 : i37 + i36;
                        if (i38 > 0 && i38 >= i15) {
                            if (isRtl) {
                                i39 -= widgetRun5.start.Camera2StreamConfigurationMap;
                            } else {
                                i39 += widgetRun5.start.Camera2StreamConfigurationMap;
                            }
                        }
                        if (isRtl) {
                            widgetRun5.end.resolve(i39);
                        } else {
                            widgetRun5.start.resolve(i39);
                        }
                        int i40 = widgetRun5.getHighSpeedVideoFpsRangesFor.value;
                        if (widgetRun5.mDimensionBehavior == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && widgetRun5.matchConstraintsType == 1) {
                            i40 = java.lang.Math.min(i40, widgetRun5.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI);
                        }
                        i37 = isRtl ? i39 - i40 : i39 + i40;
                        if (isRtl) {
                            widgetRun5.start.resolve(i37);
                        } else {
                            widgetRun5.end.resolve(i37);
                        }
                        if (i38 < i16 && i38 < i) {
                            if (isRtl) {
                                i37 -= -widgetRun5.end.Camera2StreamConfigurationMap;
                            } else {
                                i37 += -widgetRun5.end.Camera2StreamConfigurationMap;
                            }
                        }
                    }
                }
                return;
            }
            if (i32 == 2) {
                float horizontalBiasPercent = this.orientation == 0 ? this.getHighSpeedVideoSizesFor.getHorizontalBiasPercent() : this.getHighSpeedVideoSizesFor.getVerticalBiasPercent();
                if (isRtl) {
                    horizontalBiasPercent = 1.0f - horizontalBiasPercent;
                }
                int i41 = (int) (((i14 - i4) * horizontalBiasPercent) + 0.5f);
                if (i41 < 0 || i5 > 0) {
                    i41 = i7;
                }
                int i42 = isRtl ? i6 - i41 : i6 + i41;
                for (int i43 = i7; i43 < size; i43++) {
                    androidx.constraintlayout.core.widgets.analyzer.WidgetRun widgetRun6 = this.getHighSpeedVideoFpsRanges.get(isRtl ? size - (i43 + 1) : i43);
                    if (widgetRun6.getHighSpeedVideoSizesFor.getVisibility() == 8) {
                        widgetRun6.start.resolve(i42);
                        widgetRun6.end.resolve(i42);
                    } else {
                        if (i43 > 0 && i43 >= i15) {
                            if (isRtl) {
                                i42 -= widgetRun6.start.Camera2StreamConfigurationMap;
                            } else {
                                i42 += widgetRun6.start.Camera2StreamConfigurationMap;
                            }
                        }
                        if (isRtl) {
                            widgetRun6.end.resolve(i42);
                        } else {
                            widgetRun6.start.resolve(i42);
                        }
                        int i44 = widgetRun6.getHighSpeedVideoFpsRangesFor.value;
                        if (widgetRun6.mDimensionBehavior == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && widgetRun6.matchConstraintsType == 1) {
                            i44 = widgetRun6.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI;
                        }
                        i42 += i44;
                        if (isRtl) {
                            widgetRun6.start.resolve(i42);
                        } else {
                            widgetRun6.end.resolve(i42);
                        }
                        if (i43 < i16 && i43 < i) {
                            if (isRtl) {
                                i42 -= -widgetRun6.end.Camera2StreamConfigurationMap;
                            } else {
                                i42 += -widgetRun6.end.Camera2StreamConfigurationMap;
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void applyToWidget() {
        for (int i = 0; i < this.getHighSpeedVideoFpsRanges.size(); i++) {
            this.getHighSpeedVideoFpsRanges.get(i).applyToWidget();
        }
    }

    private androidx.constraintlayout.core.widgets.ConstraintWidget getHighSpeedVideoFpsRangesFor() {
        for (int i = 0; i < this.getHighSpeedVideoFpsRanges.size(); i++) {
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun widgetRun = this.getHighSpeedVideoFpsRanges.get(i);
            if (widgetRun.getHighSpeedVideoSizesFor.getVisibility() != 8) {
                return widgetRun.getHighSpeedVideoSizesFor;
            }
        }
        return null;
    }

    private androidx.constraintlayout.core.widgets.ConstraintWidget getInputFormats() {
        for (int size = this.getHighSpeedVideoFpsRanges.size() - 1; size >= 0; size--) {
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun widgetRun = this.getHighSpeedVideoFpsRanges.get(size);
            if (widgetRun.getHighSpeedVideoSizesFor.getVisibility() != 8) {
                return widgetRun.getHighSpeedVideoSizesFor;
            }
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    final void getHighResolutionOutputSizeshNQ4ISI() {
        java.util.Iterator<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> it = this.getHighSpeedVideoFpsRanges.iterator();
        while (it.hasNext()) {
            it.next().getHighResolutionOutputSizeshNQ4ISI();
        }
        int size = this.getHighSpeedVideoFpsRanges.size();
        if (size <= 0) {
            return;
        }
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = this.getHighSpeedVideoFpsRanges.get(0).getHighSpeedVideoSizesFor;
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget2 = this.getHighSpeedVideoFpsRanges.get(size - 1).getHighSpeedVideoSizesFor;
        if (this.orientation == 0) {
            androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor = constraintWidget.mLeft;
            androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor2 = constraintWidget2.mRight;
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode target = getTarget(constraintAnchor, 0);
            int margin = constraintAnchor.getMargin();
            androidx.constraintlayout.core.widgets.ConstraintWidget highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
            if (highSpeedVideoFpsRangesFor != null) {
                margin = highSpeedVideoFpsRangesFor.mLeft.getMargin();
            }
            if (target != null) {
                addTarget(this.start, target, margin);
            }
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode target2 = getTarget(constraintAnchor2, 0);
            int margin2 = constraintAnchor2.getMargin();
            androidx.constraintlayout.core.widgets.ConstraintWidget inputFormats = getInputFormats();
            if (inputFormats != null) {
                margin2 = inputFormats.mRight.getMargin();
            }
            if (target2 != null) {
                addTarget(this.end, target2, -margin2);
            }
        } else {
            androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor3 = constraintWidget.mTop;
            androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor4 = constraintWidget2.mBottom;
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode target3 = getTarget(constraintAnchor3, 1);
            int margin3 = constraintAnchor3.getMargin();
            androidx.constraintlayout.core.widgets.ConstraintWidget highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor();
            if (highSpeedVideoFpsRangesFor2 != null) {
                margin3 = highSpeedVideoFpsRangesFor2.mTop.getMargin();
            }
            if (target3 != null) {
                addTarget(this.start, target3, margin3);
            }
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode target4 = getTarget(constraintAnchor4, 1);
            int margin4 = constraintAnchor4.getMargin();
            androidx.constraintlayout.core.widgets.ConstraintWidget inputFormats2 = getInputFormats();
            if (inputFormats2 != null) {
                margin4 = inputFormats2.mBottom.getMargin();
            }
            if (target4 != null) {
                addTarget(this.end, target4, -margin4);
            }
        }
        this.start.updateDelegate = this;
        this.end.updateDelegate = this;
    }
}
