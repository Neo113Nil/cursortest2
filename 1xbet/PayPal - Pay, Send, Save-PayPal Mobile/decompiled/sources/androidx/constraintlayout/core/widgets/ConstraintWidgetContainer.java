package androidx.constraintlayout.core.widgets;

/* loaded from: classes.dex */
public class ConstraintWidgetContainer extends androidx.constraintlayout.core.widgets.WidgetContainer {
    int AMEXKernel;
    private int AMEXKernelCallback;
    androidx.constraintlayout.core.widgets.ChainHead[] AMEXKernela;
    int Camera2StreamConfigurationMap;
    int c;
    java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintWidget> exchange;
    private boolean freeTransaction;
    androidx.constraintlayout.core.widgets.analyzer.BasicMeasure getHighResolutionOutputSizeshNQ4ISI;
    int init;
    androidx.constraintlayout.core.widgets.ChainHead[] kernelVersion;
    private java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> l;
    public androidx.constraintlayout.core.widgets.analyzer.DependencyGraph mDependencyGraph;
    public boolean mGroupsWrapOptimized;
    public int mHorizontalChainsSize;
    public boolean mHorizontalWrapOptimized;
    public androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure mMeasure;
    protected androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer mMeasurer;
    public androidx.constraintlayout.core.Metrics mMetrics;
    public boolean mSkipSolver;
    protected androidx.constraintlayout.core.LinearSystem mSystem;
    public int mVerticalChainsSize;
    public boolean mVerticalWrapOptimized;
    public int mWrapFixedHeight;
    public int mWrapFixedWidth;
    int release;
    private boolean requestGoOnline;
    private int requestPINEntry;
    private java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> resetTransaction;
    private java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> sha1;
    private boolean startTransaction;
    private java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> updateUI;

    public boolean handlesInternalConstraints() {
        return false;
    }

    public void invalidateGraph() {
        this.mDependencyGraph.invalidateGraph();
    }

    public void invalidateMeasures() {
        this.mDependencyGraph.invalidateMeasures();
    }

    public boolean directMeasure(boolean z) {
        return this.mDependencyGraph.directMeasure(z);
    }

    public boolean directMeasureSetup(boolean z) {
        return this.mDependencyGraph.directMeasureSetup(z);
    }

    public boolean directMeasureWithOrientation(boolean z, int i) {
        return this.mDependencyGraph.directMeasureWithOrientation(z, i);
    }

    public void defineTerminalWidgets() {
        this.mDependencyGraph.defineTerminalWidgets(getHorizontalDimensionBehaviour(), getVerticalDimensionBehaviour());
    }

    public long measure(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.init = i8;
        this.release = i9;
        return this.getHighResolutionOutputSizeshNQ4ISI.solverMeasure(this, i, i8, i9, i2, i3, i4, i5, i6, i7);
    }

    public void updateHierarchy() {
        this.getHighResolutionOutputSizeshNQ4ISI.updateHierarchy(this);
    }

    public void setMeasurer(androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer measurer) {
        this.mMeasurer = measurer;
        this.mDependencyGraph.setMeasurer(measurer);
    }

    public androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer getMeasurer() {
        return this.mMeasurer;
    }

    public void fillMetrics(androidx.constraintlayout.core.Metrics metrics) {
        this.mMetrics = metrics;
        this.mSystem.fillMetrics(metrics);
    }

    public ConstraintWidgetContainer() {
        this.getHighResolutionOutputSizeshNQ4ISI = new androidx.constraintlayout.core.widgets.analyzer.BasicMeasure(this);
        this.mDependencyGraph = new androidx.constraintlayout.core.widgets.analyzer.DependencyGraph(this);
        this.mMeasurer = null;
        this.requestGoOnline = false;
        this.mSystem = new androidx.constraintlayout.core.LinearSystem();
        this.mHorizontalChainsSize = 0;
        this.mVerticalChainsSize = 0;
        this.AMEXKernela = new androidx.constraintlayout.core.widgets.ChainHead[4];
        this.kernelVersion = new androidx.constraintlayout.core.widgets.ChainHead[4];
        this.mGroupsWrapOptimized = false;
        this.mHorizontalWrapOptimized = false;
        this.mVerticalWrapOptimized = false;
        this.mWrapFixedWidth = 0;
        this.mWrapFixedHeight = 0;
        this.AMEXKernelCallback = 257;
        this.mSkipSolver = false;
        this.freeTransaction = false;
        this.startTransaction = false;
        this.Camera2StreamConfigurationMap = 0;
        this.sha1 = null;
        this.l = null;
        this.updateUI = null;
        this.resetTransaction = null;
        this.exchange = new java.util.HashSet<>();
        this.mMeasure = new androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure();
    }

    public ConstraintWidgetContainer(int i, int i2, int i3, int i4) {
        super(i, i2, i3, i4);
        this.getHighResolutionOutputSizeshNQ4ISI = new androidx.constraintlayout.core.widgets.analyzer.BasicMeasure(this);
        this.mDependencyGraph = new androidx.constraintlayout.core.widgets.analyzer.DependencyGraph(this);
        this.mMeasurer = null;
        this.requestGoOnline = false;
        this.mSystem = new androidx.constraintlayout.core.LinearSystem();
        this.mHorizontalChainsSize = 0;
        this.mVerticalChainsSize = 0;
        this.AMEXKernela = new androidx.constraintlayout.core.widgets.ChainHead[4];
        this.kernelVersion = new androidx.constraintlayout.core.widgets.ChainHead[4];
        this.mGroupsWrapOptimized = false;
        this.mHorizontalWrapOptimized = false;
        this.mVerticalWrapOptimized = false;
        this.mWrapFixedWidth = 0;
        this.mWrapFixedHeight = 0;
        this.AMEXKernelCallback = 257;
        this.mSkipSolver = false;
        this.freeTransaction = false;
        this.startTransaction = false;
        this.Camera2StreamConfigurationMap = 0;
        this.sha1 = null;
        this.l = null;
        this.updateUI = null;
        this.resetTransaction = null;
        this.exchange = new java.util.HashSet<>();
        this.mMeasure = new androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure();
    }

    public ConstraintWidgetContainer(int i, int i2) {
        super(i, i2);
        this.getHighResolutionOutputSizeshNQ4ISI = new androidx.constraintlayout.core.widgets.analyzer.BasicMeasure(this);
        this.mDependencyGraph = new androidx.constraintlayout.core.widgets.analyzer.DependencyGraph(this);
        this.mMeasurer = null;
        this.requestGoOnline = false;
        this.mSystem = new androidx.constraintlayout.core.LinearSystem();
        this.mHorizontalChainsSize = 0;
        this.mVerticalChainsSize = 0;
        this.AMEXKernela = new androidx.constraintlayout.core.widgets.ChainHead[4];
        this.kernelVersion = new androidx.constraintlayout.core.widgets.ChainHead[4];
        this.mGroupsWrapOptimized = false;
        this.mHorizontalWrapOptimized = false;
        this.mVerticalWrapOptimized = false;
        this.mWrapFixedWidth = 0;
        this.mWrapFixedHeight = 0;
        this.AMEXKernelCallback = 257;
        this.mSkipSolver = false;
        this.freeTransaction = false;
        this.startTransaction = false;
        this.Camera2StreamConfigurationMap = 0;
        this.sha1 = null;
        this.l = null;
        this.updateUI = null;
        this.resetTransaction = null;
        this.exchange = new java.util.HashSet<>();
        this.mMeasure = new androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure();
    }

    public ConstraintWidgetContainer(java.lang.String str, int i, int i2) {
        super(i, i2);
        this.getHighResolutionOutputSizeshNQ4ISI = new androidx.constraintlayout.core.widgets.analyzer.BasicMeasure(this);
        this.mDependencyGraph = new androidx.constraintlayout.core.widgets.analyzer.DependencyGraph(this);
        this.mMeasurer = null;
        this.requestGoOnline = false;
        this.mSystem = new androidx.constraintlayout.core.LinearSystem();
        this.mHorizontalChainsSize = 0;
        this.mVerticalChainsSize = 0;
        this.AMEXKernela = new androidx.constraintlayout.core.widgets.ChainHead[4];
        this.kernelVersion = new androidx.constraintlayout.core.widgets.ChainHead[4];
        this.mGroupsWrapOptimized = false;
        this.mHorizontalWrapOptimized = false;
        this.mVerticalWrapOptimized = false;
        this.mWrapFixedWidth = 0;
        this.mWrapFixedHeight = 0;
        this.AMEXKernelCallback = 257;
        this.mSkipSolver = false;
        this.freeTransaction = false;
        this.startTransaction = false;
        this.Camera2StreamConfigurationMap = 0;
        this.sha1 = null;
        this.l = null;
        this.updateUI = null;
        this.resetTransaction = null;
        this.exchange = new java.util.HashSet<>();
        this.mMeasure = new androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure();
        setDebugName(str);
    }

    public void setOptimizationLevel(int i) {
        this.AMEXKernelCallback = i;
        androidx.constraintlayout.core.LinearSystem.USE_DEPENDENCY_ORDERING = optimizeFor(512);
    }

    public int getOptimizationLevel() {
        return this.AMEXKernelCallback;
    }

    public boolean optimizeFor(int i) {
        return (this.AMEXKernelCallback & i) == i;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public java.lang.String getType() {
        return "ConstraintLayout";
    }

    @Override // androidx.constraintlayout.core.widgets.WidgetContainer, androidx.constraintlayout.core.widgets.ConstraintWidget
    public void reset() {
        this.mSystem.reset();
        this.init = 0;
        this.c = 0;
        this.release = 0;
        this.AMEXKernel = 0;
        this.mSkipSolver = false;
        super.reset();
    }

    public boolean isWidthMeasuredTooSmall() {
        return this.freeTransaction;
    }

    public boolean isHeightMeasuredTooSmall() {
        return this.startTransaction;
    }

    final void Camera2StreamConfigurationMap(androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor) {
        java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> weakReference = this.sha1;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.getFinalValue() > this.sha1.get().getFinalValue()) {
            this.sha1 = new java.lang.ref.WeakReference<>(constraintAnchor);
        }
    }

    public void addHorizontalWrapMinVariable(androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor) {
        java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> weakReference = this.l;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.getFinalValue() > this.l.get().getFinalValue()) {
            this.l = new java.lang.ref.WeakReference<>(constraintAnchor);
        }
    }

    final void getHighSpeedVideoFpsRanges(androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor) {
        java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> weakReference = this.updateUI;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.getFinalValue() > this.updateUI.get().getFinalValue()) {
            this.updateUI = new java.lang.ref.WeakReference<>(constraintAnchor);
        }
    }

    public void addHorizontalWrapMaxVariable(androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor) {
        java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> weakReference = this.resetTransaction;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.getFinalValue() > this.resetTransaction.get().getFinalValue()) {
            this.resetTransaction = new java.lang.ref.WeakReference<>(constraintAnchor);
        }
    }

    private void Camera2StreamConfigurationMap(androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor, androidx.constraintlayout.core.SolverVariable solverVariable) {
        this.mSystem.addGreaterThan(this.mSystem.createObjectVariable(constraintAnchor), solverVariable, 0, 5);
    }

    private void getHighSpeedVideoFpsRangesFor(androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor, androidx.constraintlayout.core.SolverVariable solverVariable) {
        this.mSystem.addGreaterThan(solverVariable, this.mSystem.createObjectVariable(constraintAnchor), 0, 5);
    }

    public boolean addChildrenToSolver(androidx.constraintlayout.core.LinearSystem linearSystem) {
        boolean optimizeFor = optimizeFor(64);
        addToSolver(linearSystem, optimizeFor);
        int size = this.mChildren.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = this.mChildren.get(i);
            constraintWidget.setInBarrier(0, false);
            constraintWidget.setInBarrier(1, false);
            if (constraintWidget instanceof androidx.constraintlayout.core.widgets.Barrier) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget2 = this.mChildren.get(i2);
                if (constraintWidget2 instanceof androidx.constraintlayout.core.widgets.Barrier) {
                    ((androidx.constraintlayout.core.widgets.Barrier) constraintWidget2).markWidgets();
                }
            }
        }
        this.exchange.clear();
        for (int i3 = 0; i3 < size; i3++) {
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget3 = this.mChildren.get(i3);
            if (constraintWidget3.getHighResolutionOutputSizeshNQ4ISI()) {
                if (constraintWidget3 instanceof androidx.constraintlayout.core.widgets.VirtualLayout) {
                    this.exchange.add(constraintWidget3);
                } else {
                    constraintWidget3.addToSolver(linearSystem, optimizeFor);
                }
            }
        }
        while (this.exchange.size() > 0) {
            int size2 = this.exchange.size();
            java.util.Iterator<androidx.constraintlayout.core.widgets.ConstraintWidget> it = this.exchange.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                androidx.constraintlayout.core.widgets.VirtualLayout virtualLayout = (androidx.constraintlayout.core.widgets.VirtualLayout) it.next();
                if (virtualLayout.contains(this.exchange)) {
                    virtualLayout.addToSolver(linearSystem, optimizeFor);
                    this.exchange.remove(virtualLayout);
                    break;
                }
            }
            if (size2 == this.exchange.size()) {
                java.util.Iterator<androidx.constraintlayout.core.widgets.ConstraintWidget> it2 = this.exchange.iterator();
                while (it2.hasNext()) {
                    it2.next().addToSolver(linearSystem, optimizeFor);
                }
                this.exchange.clear();
            }
        }
        if (androidx.constraintlayout.core.LinearSystem.USE_DEPENDENCY_ORDERING) {
            java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintWidget> hashSet = new java.util.HashSet<>();
            for (int i4 = 0; i4 < size; i4++) {
                androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget4 = this.mChildren.get(i4);
                if (!constraintWidget4.getHighResolutionOutputSizeshNQ4ISI()) {
                    hashSet.add(constraintWidget4);
                }
            }
            addChildrenToSolverByDependency(this, linearSystem, hashSet, getHorizontalDimensionBehaviour() == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT ? 0 : 1, false);
            java.util.Iterator<androidx.constraintlayout.core.widgets.ConstraintWidget> it3 = hashSet.iterator();
            while (it3.hasNext()) {
                androidx.constraintlayout.core.widgets.ConstraintWidget next = it3.next();
                androidx.constraintlayout.core.widgets.Optimizer.getHighSpeedVideoFpsRanges(this, linearSystem, next);
                next.addToSolver(linearSystem, optimizeFor);
            }
        } else {
            for (int i5 = 0; i5 < size; i5++) {
                androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget5 = this.mChildren.get(i5);
                if (constraintWidget5 instanceof androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) {
                    androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidget5.mListDimensionBehaviors[0];
                    androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = constraintWidget5.mListDimensionBehaviors[1];
                    if (dimensionBehaviour == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                        constraintWidget5.setHorizontalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED);
                    }
                    if (dimensionBehaviour2 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                        constraintWidget5.setVerticalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED);
                    }
                    constraintWidget5.addToSolver(linearSystem, optimizeFor);
                    if (dimensionBehaviour == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                        constraintWidget5.setHorizontalDimensionBehaviour(dimensionBehaviour);
                    }
                    if (dimensionBehaviour2 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                        constraintWidget5.setVerticalDimensionBehaviour(dimensionBehaviour2);
                    }
                } else {
                    androidx.constraintlayout.core.widgets.Optimizer.getHighSpeedVideoFpsRanges(this, linearSystem, constraintWidget5);
                    if (!constraintWidget5.getHighResolutionOutputSizeshNQ4ISI()) {
                        constraintWidget5.addToSolver(linearSystem, optimizeFor);
                    }
                }
            }
        }
        if (this.mHorizontalChainsSize > 0) {
            androidx.constraintlayout.core.widgets.Chain.applyChainConstraints(this, linearSystem, null, 0);
        }
        if (this.mVerticalChainsSize > 0) {
            androidx.constraintlayout.core.widgets.Chain.applyChainConstraints(this, linearSystem, null, 1);
        }
        return true;
    }

    public boolean updateChildrenFromSolver(androidx.constraintlayout.core.LinearSystem linearSystem, boolean[] zArr) {
        zArr[2] = false;
        boolean optimizeFor = optimizeFor(64);
        updateFromSolver(linearSystem, optimizeFor);
        int size = this.mChildren.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = this.mChildren.get(i);
            constraintWidget.updateFromSolver(linearSystem, optimizeFor);
            if (constraintWidget.hasDimensionOverride()) {
                z = true;
            }
        }
        return z;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void updateFromRuns(boolean z, boolean z2) {
        super.updateFromRuns(z, z2);
        int size = this.mChildren.size();
        for (int i = 0; i < size; i++) {
            this.mChildren.get(i).updateFromRuns(z, z2);
        }
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.init = i;
        this.release = i2;
        this.c = i3;
        this.AMEXKernel = i4;
    }

    public void setRtl(boolean z) {
        this.requestGoOnline = z;
    }

    public boolean isRtl() {
        return this.requestGoOnline;
    }

    public static boolean measure(int i, androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer measurer, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure measure, int i2) {
        int i3;
        int i4;
        if (measurer == null) {
            return false;
        }
        if (constraintWidget.getVisibility() == 8 || (constraintWidget instanceof androidx.constraintlayout.core.widgets.Guideline) || (constraintWidget instanceof androidx.constraintlayout.core.widgets.Barrier)) {
            measure.measuredWidth = 0;
            measure.measuredHeight = 0;
            return false;
        }
        measure.horizontalBehavior = constraintWidget.getHorizontalDimensionBehaviour();
        measure.verticalBehavior = constraintWidget.getVerticalDimensionBehaviour();
        measure.horizontalDimension = constraintWidget.getWidth();
        measure.verticalDimension = constraintWidget.getHeight();
        measure.measuredNeedsSolverPass = false;
        measure.measureStrategy = i2;
        boolean z = measure.horizontalBehavior == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z2 = measure.verticalBehavior == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z3 = z && constraintWidget.mDimensionRatio > 0.0f;
        boolean z4 = z2 && constraintWidget.mDimensionRatio > 0.0f;
        if (z && constraintWidget.hasDanglingDimension(0) && constraintWidget.mMatchConstraintDefaultWidth == 0 && !z3) {
            measure.horizontalBehavior = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (z2 && constraintWidget.mMatchConstraintDefaultHeight == 0) {
                measure.horizontalBehavior = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
            }
            z = false;
        }
        if (z2 && constraintWidget.hasDanglingDimension(1) && constraintWidget.mMatchConstraintDefaultHeight == 0 && !z4) {
            measure.verticalBehavior = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (z && constraintWidget.mMatchConstraintDefaultWidth == 0) {
                measure.verticalBehavior = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
            }
            z2 = false;
        }
        if (constraintWidget.isResolvedHorizontally()) {
            measure.horizontalBehavior = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
            z = false;
        }
        if (constraintWidget.isResolvedVertically()) {
            measure.verticalBehavior = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
            z2 = false;
        }
        if (z3) {
            if (constraintWidget.mResolvedMatchConstraintDefault[0] == 4) {
                measure.horizontalBehavior = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
            } else if (!z2) {
                if (measure.verticalBehavior == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED) {
                    i4 = measure.verticalDimension;
                } else {
                    measure.horizontalBehavior = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    measurer.measure(constraintWidget, measure);
                    i4 = measure.measuredHeight;
                }
                measure.horizontalBehavior = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
                measure.horizontalDimension = (int) (constraintWidget.getDimensionRatio() * i4);
            }
        }
        if (z4) {
            if (constraintWidget.mResolvedMatchConstraintDefault[1] == 4) {
                measure.verticalBehavior = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
            } else if (!z) {
                if (measure.horizontalBehavior == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED) {
                    i3 = measure.horizontalDimension;
                } else {
                    measure.verticalBehavior = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    measurer.measure(constraintWidget, measure);
                    i3 = measure.measuredWidth;
                }
                measure.verticalBehavior = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
                if (constraintWidget.getDimensionRatioSide() == -1) {
                    measure.verticalDimension = (int) (i3 / constraintWidget.getDimensionRatio());
                } else {
                    measure.verticalDimension = (int) (constraintWidget.getDimensionRatio() * i3);
                }
            }
        }
        measurer.measure(constraintWidget, measure);
        constraintWidget.setWidth(measure.measuredWidth);
        constraintWidget.setHeight(measure.measuredHeight);
        constraintWidget.setHasBaseline(measure.measuredHasBaseline);
        constraintWidget.setBaselineDistance(measure.measuredBaseline);
        measure.measureStrategy = androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.SELF_DIMENSIONS;
        return measure.measuredNeedsSolverPass;
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0327  */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // androidx.constraintlayout.core.widgets.WidgetContainer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void layout() {
        int i;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        ?? r6;
        boolean z4;
        int i3;
        int i4 = 0;
        this.mX = 0;
        this.mY = 0;
        this.freeTransaction = false;
        this.startTransaction = false;
        int size = this.mChildren.size();
        int max = java.lang.Math.max(0, getWidth());
        int max2 = java.lang.Math.max(0, getHeight());
        androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.mListDimensionBehaviors[1];
        androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = this.mListDimensionBehaviors[0];
        androidx.constraintlayout.core.Metrics metrics = this.mMetrics;
        if (metrics != null) {
            metrics.layouts++;
        }
        if (this.requestPINEntry == 0 && androidx.constraintlayout.core.widgets.Optimizer.enabled(this.AMEXKernelCallback, 1)) {
            androidx.constraintlayout.core.widgets.analyzer.Direct.solvingPass(this, getMeasurer());
            for (int i5 = 0; i5 < size; i5++) {
                androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = this.mChildren.get(i5);
                if (constraintWidget.isMeasureRequested() && !(constraintWidget instanceof androidx.constraintlayout.core.widgets.Guideline) && !(constraintWidget instanceof androidx.constraintlayout.core.widgets.Barrier) && !(constraintWidget instanceof androidx.constraintlayout.core.widgets.VirtualLayout) && !constraintWidget.isInVirtualLayout()) {
                    androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = constraintWidget.getDimensionBehaviour(0);
                    androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = constraintWidget.getDimensionBehaviour(1);
                    if (dimensionBehaviour3 != androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || constraintWidget.mMatchConstraintDefaultWidth == 1 || dimensionBehaviour4 != androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || constraintWidget.mMatchConstraintDefaultHeight == 1) {
                        measure(0, constraintWidget, this.mMeasurer, new androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure(), androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.SELF_DIMENSIONS);
                    }
                }
            }
        }
        if (size <= 2 || !((dimensionBehaviour2 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) && androidx.constraintlayout.core.widgets.Optimizer.enabled(this.AMEXKernelCallback, 1024) && androidx.constraintlayout.core.widgets.analyzer.Grouping.simpleSolvingPass(this, getMeasurer()))) {
            i = max2;
            i2 = max;
            z = false;
        } else {
            if (dimensionBehaviour2 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                if (max < getWidth() && max > 0) {
                    setWidth(max);
                    this.freeTransaction = true;
                } else {
                    max = getWidth();
                }
            }
            if (dimensionBehaviour == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                if (max2 < getHeight() && max2 > 0) {
                    setHeight(max2);
                    this.startTransaction = true;
                } else {
                    max2 = getHeight();
                }
            }
            i = max2;
            i2 = max;
            z = true;
        }
        boolean z5 = optimizeFor(64) || optimizeFor(128);
        this.mSystem.graphOptimizer = false;
        this.mSystem.newgraphOptimizer = false;
        if (this.AMEXKernelCallback != 0 && z5) {
            this.mSystem.newgraphOptimizer = true;
        }
        java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> arrayList = this.mChildren;
        boolean z6 = getHorizontalDimensionBehaviour() == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || getVerticalDimensionBehaviour() == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        getHighSpeedVideoSizes();
        for (int i6 = 0; i6 < size; i6++) {
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget2 = this.mChildren.get(i6);
            if (constraintWidget2 instanceof androidx.constraintlayout.core.widgets.WidgetContainer) {
                ((androidx.constraintlayout.core.widgets.WidgetContainer) constraintWidget2).layout();
            }
        }
        boolean optimizeFor = optimizeFor(64);
        boolean z7 = z;
        int i7 = 0;
        boolean z8 = true;
        while (z8) {
            int i8 = i7 + 1;
            try {
                this.mSystem.reset();
                getHighSpeedVideoSizes();
                createObjectVariables(this.mSystem);
                for (int i9 = i4; i9 < size; i9++) {
                    this.mChildren.get(i9).createObjectVariables(this.mSystem);
                }
                z8 = addChildrenToSolver(this.mSystem);
                java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> weakReference = this.sha1;
                if (weakReference != null && weakReference.get() != null) {
                    Camera2StreamConfigurationMap(this.sha1.get(), this.mSystem.createObjectVariable(this.mTop));
                    this.sha1 = null;
                }
                java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> weakReference2 = this.updateUI;
                if (weakReference2 != null && weakReference2.get() != null) {
                    getHighSpeedVideoFpsRangesFor(this.updateUI.get(), this.mSystem.createObjectVariable(this.mBottom));
                    this.updateUI = null;
                }
                java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> weakReference3 = this.l;
                if (weakReference3 != null && weakReference3.get() != null) {
                    Camera2StreamConfigurationMap(this.l.get(), this.mSystem.createObjectVariable(this.mLeft));
                    this.l = null;
                }
                java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> weakReference4 = this.resetTransaction;
                if (weakReference4 != null && weakReference4.get() != null) {
                    getHighSpeedVideoFpsRangesFor(this.resetTransaction.get(), this.mSystem.createObjectVariable(this.mRight));
                    this.resetTransaction = null;
                }
                if (z8) {
                    this.mSystem.minimize();
                }
            } catch (java.lang.Exception e) {
                e.printStackTrace();
                java.lang.System.out.println("EXCEPTION : ".concat(java.lang.String.valueOf(e)));
            }
            if (z8) {
                z2 = updateChildrenFromSolver(this.mSystem, androidx.constraintlayout.core.widgets.Optimizer.getHighSpeedVideoSizes);
            } else {
                updateFromSolver(this.mSystem, optimizeFor);
                for (int i10 = 0; i10 < size; i10++) {
                    this.mChildren.get(i10).updateFromSolver(this.mSystem, optimizeFor);
                }
                z2 = false;
            }
            if (z6 && i8 < 8 && androidx.constraintlayout.core.widgets.Optimizer.getHighSpeedVideoSizes[2]) {
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (i11 < size) {
                    androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget3 = this.mChildren.get(i11);
                    i13 = java.lang.Math.max(i13, constraintWidget3.mX + constraintWidget3.getWidth());
                    i12 = java.lang.Math.max(i12, constraintWidget3.mY + constraintWidget3.getHeight());
                    i11++;
                    z2 = z2;
                }
                z3 = z2;
                int max3 = java.lang.Math.max(this.mMinWidth, i13);
                int max4 = java.lang.Math.max(this.mMinHeight, i12);
                if (dimensionBehaviour2 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT && getWidth() < max3) {
                    setWidth(max3);
                    this.mListDimensionBehaviors[0] = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    z7 = true;
                    z3 = true;
                }
                if (dimensionBehaviour == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT && getHeight() < max4) {
                    setHeight(max4);
                    this.mListDimensionBehaviors[1] = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    z7 = true;
                    z3 = true;
                }
            } else {
                z3 = z2;
            }
            int max5 = java.lang.Math.max(this.mMinWidth, getWidth());
            if (max5 > getWidth()) {
                setWidth(max5);
                this.mListDimensionBehaviors[0] = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
                z7 = true;
                z3 = true;
            }
            int max6 = java.lang.Math.max(this.mMinHeight, getHeight());
            if (max6 > getHeight()) {
                setHeight(max6);
                r6 = 1;
                this.mListDimensionBehaviors[1] = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
                z7 = true;
                z3 = true;
            } else {
                r6 = 1;
            }
            if (!z7) {
                if (this.mListDimensionBehaviors[0] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT && i2 > 0 && getWidth() > i2) {
                    this.freeTransaction = r6;
                    this.mListDimensionBehaviors[0] = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
                    setWidth(i2);
                    z7 = r6;
                    z3 = z7;
                }
                if (this.mListDimensionBehaviors[r6] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT && i > 0 && getHeight() > i) {
                    this.startTransaction = r6;
                    this.mListDimensionBehaviors[r6] = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
                    setHeight(i);
                    i3 = 8;
                    z4 = true;
                    z7 = true;
                    z8 = i8 <= i3 ? false : z4;
                    i7 = i8;
                    i4 = 0;
                }
            }
            z4 = z3;
            i3 = 8;
            if (i8 <= i3) {
            }
            i7 = i8;
            i4 = 0;
        }
        this.mChildren = arrayList;
        if (z7) {
            this.mListDimensionBehaviors[0] = dimensionBehaviour2;
            this.mListDimensionBehaviors[1] = dimensionBehaviour;
        }
        resetSolverVariables(this.mSystem.getCache());
    }

    public java.util.ArrayList<androidx.constraintlayout.core.widgets.Guideline> getVerticalGuidelines() {
        java.util.ArrayList<androidx.constraintlayout.core.widgets.Guideline> arrayList = new java.util.ArrayList<>();
        int size = this.mChildren.size();
        for (int i = 0; i < size; i++) {
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = this.mChildren.get(i);
            if (constraintWidget instanceof androidx.constraintlayout.core.widgets.Guideline) {
                androidx.constraintlayout.core.widgets.Guideline guideline = (androidx.constraintlayout.core.widgets.Guideline) constraintWidget;
                if (guideline.getOrientation() == 1) {
                    arrayList.add(guideline);
                }
            }
        }
        return arrayList;
    }

    public java.util.ArrayList<androidx.constraintlayout.core.widgets.Guideline> getHorizontalGuidelines() {
        java.util.ArrayList<androidx.constraintlayout.core.widgets.Guideline> arrayList = new java.util.ArrayList<>();
        int size = this.mChildren.size();
        for (int i = 0; i < size; i++) {
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = this.mChildren.get(i);
            if (constraintWidget instanceof androidx.constraintlayout.core.widgets.Guideline) {
                androidx.constraintlayout.core.widgets.Guideline guideline = (androidx.constraintlayout.core.widgets.Guideline) constraintWidget;
                if (guideline.getOrientation() == 0) {
                    arrayList.add(guideline);
                }
            }
        }
        return arrayList;
    }

    public androidx.constraintlayout.core.LinearSystem getSystem() {
        return this.mSystem;
    }

    private void getHighSpeedVideoSizes() {
        this.mHorizontalChainsSize = 0;
        this.mVerticalChainsSize = 0;
    }

    public void setPass(int i) {
        this.requestPINEntry = i;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void getSceneString(java.lang.StringBuilder sb) {
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(this.stringId);
        sb2.append(":{\n");
        sb.append(sb2.toString());
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("  actualWidth:");
        sb3.append(this.d);
        sb.append(sb3.toString());
        sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("  actualHeight:");
        sb4.append(this.getOutputSizeshNQ4ISI);
        sb.append(sb4.toString());
        sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        java.util.Iterator<androidx.constraintlayout.core.widgets.ConstraintWidget> it = getChildren().iterator();
        while (it.hasNext()) {
            it.next().getSceneString(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
