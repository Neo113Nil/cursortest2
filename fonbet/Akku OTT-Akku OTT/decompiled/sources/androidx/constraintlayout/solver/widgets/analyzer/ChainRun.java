package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.compose.runtime.changelist.d;
import androidx.constraintlayout.motion.widget.a;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ChainRun extends WidgetRun {
    private int chainStyle;
    ArrayList<WidgetRun> widgets;

    public ChainRun(ConstraintWidget constraintWidget, int i) {
        super(constraintWidget);
        this.widgets = new ArrayList<>();
        this.orientation = i;
        build();
    }

    private void build() {
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2 = this.widget;
        ConstraintWidget previousChainMember = constraintWidget2.getPreviousChainMember(this.orientation);
        while (true) {
            ConstraintWidget constraintWidget3 = previousChainMember;
            constraintWidget = constraintWidget2;
            constraintWidget2 = constraintWidget3;
            if (constraintWidget2 == null) {
                break;
            } else {
                previousChainMember = constraintWidget2.getPreviousChainMember(this.orientation);
            }
        }
        this.widget = constraintWidget;
        this.widgets.add(constraintWidget.getRun(this.orientation));
        ConstraintWidget nextChainMember = constraintWidget.getNextChainMember(this.orientation);
        while (nextChainMember != null) {
            this.widgets.add(nextChainMember.getRun(this.orientation));
            nextChainMember = nextChainMember.getNextChainMember(this.orientation);
        }
        Iterator<WidgetRun> it = this.widgets.iterator();
        while (it.hasNext()) {
            WidgetRun next = it.next();
            int i = this.orientation;
            if (i == 0) {
                next.widget.horizontalChainRun = this;
            } else if (i == 1) {
                next.widget.verticalChainRun = this;
            }
        }
        if (this.orientation == 0 && ((ConstraintWidgetContainer) this.widget.getParent()).isRtl() && this.widgets.size() > 1) {
            this.widget = ((WidgetRun) a.a(1, this.widgets)).widget;
        }
        this.chainStyle = this.orientation == 0 ? this.widget.getHorizontalChainStyle() : this.widget.getVerticalChainStyle();
    }

    private ConstraintWidget getFirstVisibleWidget() {
        for (int i = 0; i < this.widgets.size(); i++) {
            WidgetRun widgetRun = this.widgets.get(i);
            if (widgetRun.widget.getVisibility() != 8) {
                return widgetRun.widget;
            }
        }
        return null;
    }

    private ConstraintWidget getLastVisibleWidget() {
        for (int size = this.widgets.size() - 1; size >= 0; size--) {
            WidgetRun widgetRun = this.widgets.get(size);
            if (widgetRun.widget.getVisibility() != 8) {
                return widgetRun.widget;
            }
        }
        return null;
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public void apply() {
        Iterator<WidgetRun> it = this.widgets.iterator();
        while (it.hasNext()) {
            it.next().apply();
        }
        int size = this.widgets.size();
        if (size < 1) {
            return;
        }
        ConstraintWidget constraintWidget = this.widgets.get(0).widget;
        ConstraintWidget constraintWidget2 = this.widgets.get(size - 1).widget;
        if (this.orientation == 0) {
            ConstraintAnchor constraintAnchor = constraintWidget.mLeft;
            ConstraintAnchor constraintAnchor2 = constraintWidget2.mRight;
            DependencyNode target = getTarget(constraintAnchor, 0);
            int margin = constraintAnchor.getMargin();
            ConstraintWidget firstVisibleWidget = getFirstVisibleWidget();
            if (firstVisibleWidget != null) {
                margin = firstVisibleWidget.mLeft.getMargin();
            }
            if (target != null) {
                addTarget(this.start, target, margin);
            }
            DependencyNode target2 = getTarget(constraintAnchor2, 0);
            int margin2 = constraintAnchor2.getMargin();
            ConstraintWidget lastVisibleWidget = getLastVisibleWidget();
            if (lastVisibleWidget != null) {
                margin2 = lastVisibleWidget.mRight.getMargin();
            }
            if (target2 != null) {
                addTarget(this.end, target2, -margin2);
            }
        } else {
            ConstraintAnchor constraintAnchor3 = constraintWidget.mTop;
            ConstraintAnchor constraintAnchor4 = constraintWidget2.mBottom;
            DependencyNode target3 = getTarget(constraintAnchor3, 1);
            int margin3 = constraintAnchor3.getMargin();
            ConstraintWidget firstVisibleWidget2 = getFirstVisibleWidget();
            if (firstVisibleWidget2 != null) {
                margin3 = firstVisibleWidget2.mTop.getMargin();
            }
            if (target3 != null) {
                addTarget(this.start, target3, margin3);
            }
            DependencyNode target4 = getTarget(constraintAnchor4, 1);
            int margin4 = constraintAnchor4.getMargin();
            ConstraintWidget lastVisibleWidget2 = getLastVisibleWidget();
            if (lastVisibleWidget2 != null) {
                margin4 = lastVisibleWidget2.mBottom.getMargin();
            }
            if (target4 != null) {
                addTarget(this.end, target4, -margin4);
            }
        }
        this.start.updateDelegate = this;
        this.end.updateDelegate = this;
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public void applyToWidget() {
        for (int i = 0; i < this.widgets.size(); i++) {
            this.widgets.get(i).applyToWidget();
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public void clear() {
        this.runGroup = null;
        Iterator<WidgetRun> it = this.widgets.iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public long getWrapDimension() {
        int size = this.widgets.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j = r4.end.margin + this.widgets.get(i).getWrapDimension() + j + r4.start.margin;
        }
        return j;
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public void reset() {
        this.start.resolved = false;
        this.end.resolved = false;
    }

    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun
    public boolean supportsWrapComputation() {
        int size = this.widgets.size();
        for (int i = 0; i < size; i++) {
            if (!this.widgets.get(i).supportsWrapComputation()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        String concat = "ChainRun ".concat(this.orientation == 0 ? "horizontal : " : "vertical : ");
        Iterator<WidgetRun> it = this.widgets.iterator();
        while (it.hasNext()) {
            WidgetRun next = it.next();
            concat = d.b(d.b(concat, "<") + next, "> ");
        }
        return concat;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x01b8, code lost:
    
        if (r2 != r7) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01e4, code lost:
    
        r12 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01e0, code lost:
    
        r12 = r25 + 1;
        r7 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01de, code lost:
    
        if (r2 != r7) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0414, code lost:
    
        r1 = r1 - r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00d6, code lost:
    
        if (r2.resolved != false) goto L58;
     */
    @Override // androidx.constraintlayout.solver.widgets.analyzer.WidgetRun, androidx.constraintlayout.solver.widgets.analyzer.Dependency
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void update(Dependency dependency) {
        int i;
        int i2;
        boolean z;
        float f;
        float f2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f3;
        int i7;
        int i8;
        float f4;
        int i9;
        int i10;
        int i11;
        int max;
        boolean z2;
        if (this.start.resolved && this.end.resolved) {
            ConstraintWidget parent = this.widget.getParent();
            boolean isRtl = (parent == null || !(parent instanceof ConstraintWidgetContainer)) ? false : ((ConstraintWidgetContainer) parent).isRtl();
            int i12 = this.end.value - this.start.value;
            int size = this.widgets.size();
            int i13 = 0;
            while (true) {
                i = -1;
                i2 = 8;
                if (i13 >= size) {
                    i13 = -1;
                    break;
                } else if (this.widgets.get(i13).widget.getVisibility() != 8) {
                    break;
                } else {
                    i13++;
                }
            }
            int i14 = size - 1;
            int i15 = i14;
            while (true) {
                if (i15 < 0) {
                    break;
                }
                if (this.widgets.get(i15).widget.getVisibility() != 8) {
                    i = i15;
                    break;
                }
                i15--;
            }
            int i16 = 0;
            while (i16 < 2) {
                int i17 = 0;
                i4 = 0;
                i5 = 0;
                int i18 = 0;
                f2 = 0.0f;
                while (i17 < size) {
                    WidgetRun widgetRun = this.widgets.get(i17);
                    if (widgetRun.widget.getVisibility() == i2) {
                        z2 = isRtl;
                    } else {
                        i18++;
                        if (i17 > 0 && i17 >= i13) {
                            i4 += widgetRun.start.margin;
                        }
                        DimensionDependency dimensionDependency = widgetRun.dimension;
                        int i19 = dimensionDependency.value;
                        boolean z3 = widgetRun.dimensionBehavior != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                        if (z3) {
                            int i20 = this.orientation;
                            if (i20 == 0 && !widgetRun.widget.horizontalRun.dimension.resolved) {
                                return;
                            }
                            if (i20 == 1 && !widgetRun.widget.verticalRun.dimension.resolved) {
                                return;
                            } else {
                                z2 = isRtl;
                            }
                        } else {
                            z2 = isRtl;
                            if (widgetRun.matchConstraintsType == 1 && i16 == 0) {
                                i19 = dimensionDependency.wrapValue;
                                i5++;
                            }
                            z3 = true;
                        }
                        if (z3) {
                            i4 += i19;
                        } else {
                            i5++;
                            float f5 = widgetRun.widget.mWeight[this.orientation];
                            if (f5 >= 0.0f) {
                                f2 += f5;
                            }
                        }
                        if (i17 < i14 && i17 < i) {
                            i4 += -widgetRun.end.margin;
                        }
                    }
                    i17++;
                    isRtl = z2;
                    i2 = 8;
                }
                z = isRtl;
                f = 0.0f;
                if (i4 < i12 || i5 == 0) {
                    i3 = i18;
                    break;
                } else {
                    i16++;
                    isRtl = z;
                    i2 = 8;
                }
            }
            z = isRtl;
            f = 0.0f;
            f2 = 0.0f;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            int i21 = this.start.value;
            if (z) {
                i21 = this.end.value;
            }
            float f6 = 0.5f;
            if (i4 > i12) {
                i21 = z ? i21 + ((int) (((i4 - i12) / 2.0f) + 0.5f)) : i21 - ((int) (((i4 - i12) / 2.0f) + 0.5f));
            }
            if (i5 > 0) {
                float f7 = i12 - i4;
                int i22 = (int) ((f7 / i5) + 0.5f);
                int i23 = 0;
                int i24 = 0;
                while (i23 < size) {
                    WidgetRun widgetRun2 = this.widgets.get(i23);
                    float f8 = f6;
                    int i25 = i21;
                    if (widgetRun2.widget.getVisibility() != 8 && widgetRun2.dimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        DimensionDependency dimensionDependency2 = widgetRun2.dimension;
                        if (!dimensionDependency2.resolved) {
                            int i26 = f2 > f ? (int) (((widgetRun2.widget.mWeight[this.orientation] * f7) / f2) + f8) : i22;
                            f4 = f7;
                            if (this.orientation == 0) {
                                ConstraintWidget constraintWidget = widgetRun2.widget;
                                i9 = i22;
                                int i27 = constraintWidget.mMatchConstraintMaxWidth;
                                i10 = i23;
                                i11 = i24;
                                max = Math.max(constraintWidget.mMatchConstraintMinWidth, widgetRun2.matchConstraintsType == 1 ? Math.min(i26, dimensionDependency2.wrapValue) : i26);
                                if (i27 > 0) {
                                    max = Math.min(i27, max);
                                }
                            } else {
                                i9 = i22;
                                i10 = i23;
                                i11 = i24;
                                ConstraintWidget constraintWidget2 = widgetRun2.widget;
                                int i28 = constraintWidget2.mMatchConstraintMaxHeight;
                                max = Math.max(constraintWidget2.mMatchConstraintMinHeight, widgetRun2.matchConstraintsType == 1 ? Math.min(i26, dimensionDependency2.wrapValue) : i26);
                                if (i28 > 0) {
                                    max = Math.min(i28, max);
                                }
                            }
                            widgetRun2.dimension.resolve(i26);
                            i23 = i10 + 1;
                            f6 = f8;
                            i21 = i25;
                            f7 = f4;
                            i22 = i9;
                        }
                    }
                    f4 = f7;
                    i9 = i22;
                    i10 = i23;
                    i24 = i24;
                    i23 = i10 + 1;
                    f6 = f8;
                    i21 = i25;
                    f7 = f4;
                    i22 = i9;
                }
                i6 = i21;
                f3 = f6;
                int i29 = i24;
                if (i29 > 0) {
                    i5 -= i29;
                    i4 = 0;
                    for (int i30 = 0; i30 < size; i30++) {
                        WidgetRun widgetRun3 = this.widgets.get(i30);
                        if (widgetRun3.widget.getVisibility() != 8) {
                            if (i30 > 0 && i30 >= i13) {
                                i4 += widgetRun3.start.margin;
                            }
                            i4 += widgetRun3.dimension.value;
                            if (i30 < i14 && i30 < i) {
                                i4 += -widgetRun3.end.margin;
                            }
                        }
                    }
                }
                i8 = 2;
                if (this.chainStyle == 2 && i29 == 0) {
                    i7 = 0;
                    this.chainStyle = 0;
                } else {
                    i7 = 0;
                }
            } else {
                i6 = i21;
                f3 = 0.5f;
                i7 = 0;
                i8 = 2;
            }
            if (i4 > i12) {
                this.chainStyle = i8;
            }
            if (i3 > 0 && i5 == 0 && i13 == i) {
                this.chainStyle = i8;
            }
            int i31 = this.chainStyle;
            if (i31 == 1) {
                int i32 = i3 > 1 ? (i12 - i4) / (i3 - 1) : i3 == 1 ? (i12 - i4) / 2 : i7;
                if (i5 > 0) {
                    i32 = i7;
                }
                int i33 = i6;
                while (i7 < size) {
                    WidgetRun widgetRun4 = this.widgets.get(z ? size - (i7 + 1) : i7);
                    if (widgetRun4.widget.getVisibility() == 8) {
                        widgetRun4.start.resolve(i33);
                        widgetRun4.end.resolve(i33);
                    } else {
                        if (i7 > 0) {
                            i33 = z ? i33 - i32 : i33 + i32;
                        }
                        if (i7 > 0 && i7 >= i13) {
                            i33 = z ? i33 - widgetRun4.start.margin : i33 + widgetRun4.start.margin;
                        }
                        if (z) {
                            widgetRun4.end.resolve(i33);
                        } else {
                            widgetRun4.start.resolve(i33);
                        }
                        DimensionDependency dimensionDependency3 = widgetRun4.dimension;
                        int i34 = dimensionDependency3.value;
                        if (widgetRun4.dimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && widgetRun4.matchConstraintsType == 1) {
                            i34 = dimensionDependency3.wrapValue;
                        }
                        i33 = z ? i33 - i34 : i33 + i34;
                        if (z) {
                            widgetRun4.start.resolve(i33);
                        } else {
                            widgetRun4.end.resolve(i33);
                        }
                        widgetRun4.resolved = true;
                        if (i7 < i14 && i7 < i) {
                            i33 = z ? i33 - (-widgetRun4.end.margin) : i33 + (-widgetRun4.end.margin);
                        }
                    }
                    i7++;
                }
                return;
            }
            if (i31 == 0) {
                int i35 = (i12 - i4) / (i3 + 1);
                if (i5 > 0) {
                    i35 = i7;
                }
                int i36 = i6;
                while (i7 < size) {
                    WidgetRun widgetRun5 = this.widgets.get(z ? size - (i7 + 1) : i7);
                    if (widgetRun5.widget.getVisibility() == 8) {
                        widgetRun5.start.resolve(i36);
                        widgetRun5.end.resolve(i36);
                    } else {
                        int i37 = z ? i36 - i35 : i36 + i35;
                        if (i7 > 0 && i7 >= i13) {
                            i37 = z ? i37 - widgetRun5.start.margin : i37 + widgetRun5.start.margin;
                        }
                        if (z) {
                            widgetRun5.end.resolve(i37);
                        } else {
                            widgetRun5.start.resolve(i37);
                        }
                        DimensionDependency dimensionDependency4 = widgetRun5.dimension;
                        int i38 = dimensionDependency4.value;
                        if (widgetRun5.dimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && widgetRun5.matchConstraintsType == 1) {
                            i38 = Math.min(i38, dimensionDependency4.wrapValue);
                        }
                        i36 = z ? i37 - i38 : i37 + i38;
                        if (z) {
                            widgetRun5.start.resolve(i36);
                        } else {
                            widgetRun5.end.resolve(i36);
                        }
                        if (i7 < i14 && i7 < i) {
                            i36 = z ? i36 - (-widgetRun5.end.margin) : i36 + (-widgetRun5.end.margin);
                        }
                    }
                    i7++;
                }
                return;
            }
            if (i31 == 2) {
                float horizontalBiasPercent = this.orientation == 0 ? this.widget.getHorizontalBiasPercent() : this.widget.getVerticalBiasPercent();
                if (z) {
                    horizontalBiasPercent = 1.0f - horizontalBiasPercent;
                }
                int i39 = (int) (((i12 - i4) * horizontalBiasPercent) + f3);
                if (i39 < 0 || i5 > 0) {
                    i39 = i7;
                }
                int i40 = z ? i6 - i39 : i6 + i39;
                while (i7 < size) {
                    WidgetRun widgetRun6 = this.widgets.get(z ? size - (i7 + 1) : i7);
                    if (widgetRun6.widget.getVisibility() == 8) {
                        widgetRun6.start.resolve(i40);
                        widgetRun6.end.resolve(i40);
                    } else {
                        if (i7 > 0 && i7 >= i13) {
                            i40 = z ? i40 - widgetRun6.start.margin : i40 + widgetRun6.start.margin;
                        }
                        if (z) {
                            widgetRun6.end.resolve(i40);
                        } else {
                            widgetRun6.start.resolve(i40);
                        }
                        DimensionDependency dimensionDependency5 = widgetRun6.dimension;
                        int i41 = dimensionDependency5.value;
                        if (widgetRun6.dimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && widgetRun6.matchConstraintsType == 1) {
                            i41 = dimensionDependency5.wrapValue;
                        }
                        i40 += i41;
                        if (z) {
                            widgetRun6.start.resolve(i40);
                        } else {
                            widgetRun6.end.resolve(i40);
                        }
                        if (i7 < i14 && i7 < i) {
                            i40 = z ? i40 - (-widgetRun6.end.margin) : i40 + (-widgetRun6.end.margin);
                        }
                    }
                    i7++;
                }
            }
        }
    }
}
