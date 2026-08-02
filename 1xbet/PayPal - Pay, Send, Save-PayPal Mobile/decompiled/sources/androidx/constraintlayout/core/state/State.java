package androidx.constraintlayout.core.state;

/* loaded from: classes.dex */
public class State {
    public static final java.lang.Integer PARENT = 0;
    java.util.ArrayList<java.lang.Object> Camera2StreamConfigurationMap;
    java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> getHighResolutionOutputSizeshNQ4ISI;
    androidx.constraintlayout.core.state.CorePixelDp getHighSpeedVideoFpsRanges;
    boolean getHighSpeedVideoSizes;
    private int getOutputFormats;
    public final androidx.constraintlayout.core.state.ConstraintReference mParent;
    private boolean getHighSpeedVideoSizesFor = true;
    protected java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.Reference> mReferences = new java.util.HashMap<>();
    protected java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.HelperReference> mHelperReferences = new java.util.HashMap<>();
    java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.String>> getHighSpeedVideoFpsRangesFor = new java.util.HashMap<>();

    /* loaded from: classes7.dex */
    public enum Constraint {
        LEFT_TO_LEFT,
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT,
        RIGHT_TO_RIGHT,
        START_TO_START,
        START_TO_END,
        END_TO_START,
        END_TO_END,
        TOP_TO_TOP,
        TOP_TO_BOTTOM,
        TOP_TO_BASELINE,
        BOTTOM_TO_TOP,
        BOTTOM_TO_BOTTOM,
        BOTTOM_TO_BASELINE,
        BASELINE_TO_BASELINE,
        BASELINE_TO_TOP,
        BASELINE_TO_BOTTOM,
        CENTER_HORIZONTALLY,
        CENTER_VERTICALLY,
        CIRCULAR_CONSTRAINT
    }

    /* loaded from: classes7.dex */
    public enum Direction {
        LEFT,
        RIGHT,
        START,
        END,
        TOP,
        BOTTOM
    }

    /* loaded from: classes7.dex */
    public enum Helper {
        HORIZONTAL_CHAIN,
        VERTICAL_CHAIN,
        ALIGN_HORIZONTALLY,
        ALIGN_VERTICALLY,
        BARRIER,
        LAYER,
        HORIZONTAL_FLOW,
        VERTICAL_FLOW,
        GRID,
        ROW,
        COLUMN,
        FLOW
    }

    /* loaded from: classes7.dex */
    public enum Chain {
        SPREAD,
        SPREAD_INSIDE,
        PACKED;

        public static java.util.Map<java.lang.String, androidx.constraintlayout.core.state.State.Chain> chainMap;
        public static java.util.Map<java.lang.String, java.lang.Integer> valueMap;

        static {
            androidx.constraintlayout.core.state.State.Chain chain = SPREAD;
            androidx.constraintlayout.core.state.State.Chain chain2 = SPREAD_INSIDE;
            androidx.constraintlayout.core.state.State.Chain chain3 = PACKED;
            chainMap = new java.util.HashMap();
            valueMap = new java.util.HashMap();
            chainMap.put("packed", chain3);
            chainMap.put("spread_inside", chain2);
            chainMap.put("spread", chain);
            valueMap.put("packed", 2);
            valueMap.put("spread_inside", 1);
            valueMap.put("spread", 0);
        }

        public static int getValueByString(java.lang.String str) {
            if (valueMap.containsKey(str)) {
                return valueMap.get(str).intValue();
            }
            return -1;
        }

        public static androidx.constraintlayout.core.state.State.Chain getChainByString(java.lang.String str) {
            if (chainMap.containsKey(str)) {
                return chainMap.get(str);
            }
            return null;
        }
    }

    /* loaded from: classes7.dex */
    public enum Wrap {
        NONE,
        CHAIN,
        ALIGNED;

        public static java.util.Map<java.lang.String, java.lang.Integer> valueMap;
        public static java.util.Map<java.lang.String, androidx.constraintlayout.core.state.State.Wrap> wrapMap;

        static {
            androidx.constraintlayout.core.state.State.Wrap wrap = NONE;
            androidx.constraintlayout.core.state.State.Wrap wrap2 = CHAIN;
            androidx.constraintlayout.core.state.State.Wrap wrap3 = ALIGNED;
            wrapMap = new java.util.HashMap();
            valueMap = new java.util.HashMap();
            wrapMap.put("none", wrap);
            wrapMap.put("chain", wrap2);
            wrapMap.put("aligned", wrap3);
            valueMap.put("none", 0);
            valueMap.put("chain", 3);
            valueMap.put("aligned", 2);
        }

        public static int getValueByString(java.lang.String str) {
            if (valueMap.containsKey(str)) {
                return valueMap.get(str).intValue();
            }
            return -1;
        }

        public static androidx.constraintlayout.core.state.State.Wrap getChainByString(java.lang.String str) {
            if (wrapMap.containsKey(str)) {
                return wrapMap.get(str);
            }
            return null;
        }
    }

    public State() {
        androidx.constraintlayout.core.state.ConstraintReference constraintReference = new androidx.constraintlayout.core.state.ConstraintReference(this);
        this.mParent = constraintReference;
        this.getOutputFormats = 0;
        this.Camera2StreamConfigurationMap = new java.util.ArrayList<>();
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList<>();
        this.getHighSpeedVideoSizes = true;
        java.lang.Integer num = PARENT;
        constraintReference.setKey(num);
        this.mReferences.put(num, constraintReference);
    }

    public void setDpToPixel(androidx.constraintlayout.core.state.CorePixelDp corePixelDp) {
        this.getHighSpeedVideoFpsRanges = corePixelDp;
    }

    @java.lang.Deprecated
    public void setLtr(boolean z) {
        this.getHighSpeedVideoSizesFor = z;
    }

    @java.lang.Deprecated
    public boolean isLtr() {
        return this.getHighSpeedVideoSizesFor;
    }

    public void setRtl(boolean z) {
        this.getHighSpeedVideoSizesFor = !z;
    }

    public boolean isRtl() {
        return !this.getHighSpeedVideoSizesFor;
    }

    public void reset() {
        java.util.Iterator<java.lang.Object> it = this.mReferences.keySet().iterator();
        while (it.hasNext()) {
            this.mReferences.get(it.next()).getConstraintWidget().reset();
        }
        this.mReferences.clear();
        this.mReferences.put(PARENT, this.mParent);
        this.mHelperReferences.clear();
        this.getHighSpeedVideoFpsRangesFor.clear();
        this.Camera2StreamConfigurationMap.clear();
        this.getHighSpeedVideoSizes = true;
    }

    public int convertDimension(java.lang.Object obj) {
        if (obj instanceof java.lang.Float) {
            return java.lang.Math.round(((java.lang.Float) obj).floatValue());
        }
        if (obj instanceof java.lang.Integer) {
            return ((java.lang.Integer) obj).intValue();
        }
        return 0;
    }

    public androidx.constraintlayout.core.state.ConstraintReference createConstraintReference(java.lang.Object obj) {
        return new androidx.constraintlayout.core.state.ConstraintReference(this);
    }

    public boolean sameFixedWidth(int i) {
        return this.mParent.getWidth().equalsFixedValue(i);
    }

    public boolean sameFixedHeight(int i) {
        return this.mParent.getHeight().equalsFixedValue(i);
    }

    public androidx.constraintlayout.core.state.State width(androidx.constraintlayout.core.state.Dimension dimension) {
        return setWidth(dimension);
    }

    public androidx.constraintlayout.core.state.State height(androidx.constraintlayout.core.state.Dimension dimension) {
        return setHeight(dimension);
    }

    public androidx.constraintlayout.core.state.State setWidth(androidx.constraintlayout.core.state.Dimension dimension) {
        this.mParent.setWidth(dimension);
        return this;
    }

    public androidx.constraintlayout.core.state.State setHeight(androidx.constraintlayout.core.state.Dimension dimension) {
        this.mParent.setHeight(dimension);
        return this;
    }

    final androidx.constraintlayout.core.state.Reference getHighSpeedVideoSizes(java.lang.Object obj) {
        return this.mReferences.get(obj);
    }

    public androidx.constraintlayout.core.state.ConstraintReference constraints(java.lang.Object obj) {
        androidx.constraintlayout.core.state.Reference reference = this.mReferences.get(obj);
        if (reference == null) {
            reference = createConstraintReference(obj);
            this.mReferences.put(obj, reference);
            reference.setKey(obj);
        }
        if (reference instanceof androidx.constraintlayout.core.state.ConstraintReference) {
            return (androidx.constraintlayout.core.state.ConstraintReference) reference;
        }
        return null;
    }

    public androidx.constraintlayout.core.state.helpers.GuidelineReference horizontalGuideline(java.lang.Object obj) {
        return guideline(obj, 0);
    }

    public androidx.constraintlayout.core.state.helpers.GuidelineReference verticalGuideline(java.lang.Object obj) {
        return guideline(obj, 1);
    }

    public androidx.constraintlayout.core.state.helpers.GuidelineReference guideline(java.lang.Object obj, int i) {
        androidx.constraintlayout.core.state.ConstraintReference constraints = constraints(obj);
        if (constraints.getFacade() == null || !(constraints.getFacade() instanceof androidx.constraintlayout.core.state.helpers.GuidelineReference)) {
            androidx.constraintlayout.core.state.helpers.GuidelineReference guidelineReference = new androidx.constraintlayout.core.state.helpers.GuidelineReference(this);
            guidelineReference.setOrientation(i);
            guidelineReference.setKey(obj);
            constraints.setFacade(guidelineReference);
        }
        return (androidx.constraintlayout.core.state.helpers.GuidelineReference) constraints.getFacade();
    }

    public androidx.constraintlayout.core.state.helpers.BarrierReference barrier(java.lang.Object obj, androidx.constraintlayout.core.state.State.Direction direction) {
        androidx.constraintlayout.core.state.ConstraintReference constraints = constraints(obj);
        if (constraints.getFacade() == null || !(constraints.getFacade() instanceof androidx.constraintlayout.core.state.helpers.BarrierReference)) {
            androidx.constraintlayout.core.state.helpers.BarrierReference barrierReference = new androidx.constraintlayout.core.state.helpers.BarrierReference(this);
            barrierReference.setBarrierDirection(direction);
            constraints.setFacade(barrierReference);
        }
        return (androidx.constraintlayout.core.state.helpers.BarrierReference) constraints.getFacade();
    }

    public androidx.constraintlayout.core.state.helpers.GridReference getGrid(java.lang.Object obj, java.lang.String str) {
        androidx.constraintlayout.core.state.ConstraintReference constraints = constraints(obj);
        if (constraints.getFacade() == null || !(constraints.getFacade() instanceof androidx.constraintlayout.core.state.helpers.GridReference)) {
            androidx.constraintlayout.core.state.State.Helper helper = androidx.constraintlayout.core.state.State.Helper.GRID;
            if (str.charAt(0) == 'r') {
                helper = androidx.constraintlayout.core.state.State.Helper.ROW;
            } else if (str.charAt(0) == 'c') {
                helper = androidx.constraintlayout.core.state.State.Helper.COLUMN;
            }
            constraints.setFacade(new androidx.constraintlayout.core.state.helpers.GridReference(this, helper));
        }
        return (androidx.constraintlayout.core.state.helpers.GridReference) constraints.getFacade();
    }

    public androidx.constraintlayout.core.state.helpers.FlowReference getFlow(java.lang.Object obj, boolean z) {
        androidx.constraintlayout.core.state.helpers.FlowReference flowReference;
        androidx.constraintlayout.core.state.ConstraintReference constraints = constraints(obj);
        if (constraints.getFacade() == null || !(constraints.getFacade() instanceof androidx.constraintlayout.core.state.helpers.FlowReference)) {
            if (z) {
                flowReference = new androidx.constraintlayout.core.state.helpers.FlowReference(this, androidx.constraintlayout.core.state.State.Helper.VERTICAL_FLOW);
            } else {
                flowReference = new androidx.constraintlayout.core.state.helpers.FlowReference(this, androidx.constraintlayout.core.state.State.Helper.HORIZONTAL_FLOW);
            }
            constraints.setFacade(flowReference);
        }
        return (androidx.constraintlayout.core.state.helpers.FlowReference) constraints.getFacade();
    }

    public androidx.constraintlayout.core.state.helpers.VerticalChainReference verticalChain() {
        return (androidx.constraintlayout.core.state.helpers.VerticalChainReference) helper(null, androidx.constraintlayout.core.state.State.Helper.VERTICAL_CHAIN);
    }

    public androidx.constraintlayout.core.state.helpers.VerticalChainReference verticalChain(java.lang.Object... objArr) {
        androidx.constraintlayout.core.state.helpers.VerticalChainReference verticalChainReference = (androidx.constraintlayout.core.state.helpers.VerticalChainReference) helper(null, androidx.constraintlayout.core.state.State.Helper.VERTICAL_CHAIN);
        verticalChainReference.add(objArr);
        return verticalChainReference;
    }

    public androidx.constraintlayout.core.state.helpers.HorizontalChainReference horizontalChain() {
        return (androidx.constraintlayout.core.state.helpers.HorizontalChainReference) helper(null, androidx.constraintlayout.core.state.State.Helper.HORIZONTAL_CHAIN);
    }

    public androidx.constraintlayout.core.state.helpers.HorizontalChainReference horizontalChain(java.lang.Object... objArr) {
        androidx.constraintlayout.core.state.helpers.HorizontalChainReference horizontalChainReference = (androidx.constraintlayout.core.state.helpers.HorizontalChainReference) helper(null, androidx.constraintlayout.core.state.State.Helper.HORIZONTAL_CHAIN);
        horizontalChainReference.add(objArr);
        return horizontalChainReference;
    }

    public androidx.constraintlayout.core.state.helpers.FlowReference getVerticalFlow() {
        return (androidx.constraintlayout.core.state.helpers.FlowReference) helper(null, androidx.constraintlayout.core.state.State.Helper.VERTICAL_FLOW);
    }

    public androidx.constraintlayout.core.state.helpers.FlowReference getVerticalFlow(java.lang.Object... objArr) {
        androidx.constraintlayout.core.state.helpers.FlowReference flowReference = (androidx.constraintlayout.core.state.helpers.FlowReference) helper(null, androidx.constraintlayout.core.state.State.Helper.VERTICAL_FLOW);
        flowReference.add(objArr);
        return flowReference;
    }

    public androidx.constraintlayout.core.state.helpers.FlowReference getHorizontalFlow() {
        return (androidx.constraintlayout.core.state.helpers.FlowReference) helper(null, androidx.constraintlayout.core.state.State.Helper.HORIZONTAL_FLOW);
    }

    public androidx.constraintlayout.core.state.helpers.FlowReference getHorizontalFlow(java.lang.Object... objArr) {
        androidx.constraintlayout.core.state.helpers.FlowReference flowReference = (androidx.constraintlayout.core.state.helpers.FlowReference) helper(null, androidx.constraintlayout.core.state.State.Helper.HORIZONTAL_FLOW);
        flowReference.add(objArr);
        return flowReference;
    }

    public androidx.constraintlayout.core.state.helpers.AlignHorizontallyReference centerHorizontally(java.lang.Object... objArr) {
        androidx.constraintlayout.core.state.helpers.AlignHorizontallyReference alignHorizontallyReference = (androidx.constraintlayout.core.state.helpers.AlignHorizontallyReference) helper(null, androidx.constraintlayout.core.state.State.Helper.ALIGN_HORIZONTALLY);
        alignHorizontallyReference.add(objArr);
        return alignHorizontallyReference;
    }

    public androidx.constraintlayout.core.state.helpers.AlignVerticallyReference centerVertically(java.lang.Object... objArr) {
        androidx.constraintlayout.core.state.helpers.AlignVerticallyReference alignVerticallyReference = (androidx.constraintlayout.core.state.helpers.AlignVerticallyReference) helper(null, androidx.constraintlayout.core.state.State.Helper.ALIGN_VERTICALLY);
        alignVerticallyReference.add(objArr);
        return alignVerticallyReference;
    }

    public void directMapping() {
        for (java.lang.Object obj : this.mReferences.keySet()) {
            androidx.constraintlayout.core.state.ConstraintReference constraints = constraints(obj);
            if (constraints instanceof androidx.constraintlayout.core.state.ConstraintReference) {
                constraints.setView(obj);
            }
        }
    }

    public void map(java.lang.Object obj, java.lang.Object obj2) {
        androidx.constraintlayout.core.state.ConstraintReference constraints = constraints(obj);
        if (constraints != null) {
            constraints.setView(obj2);
        }
    }

    public void setTag(java.lang.String str, java.lang.String str2) {
        java.util.ArrayList<java.lang.String> arrayList;
        androidx.constraintlayout.core.state.ConstraintReference constraints = constraints(str);
        if (constraints instanceof androidx.constraintlayout.core.state.ConstraintReference) {
            constraints.setTag(str2);
            if (!this.getHighSpeedVideoFpsRangesFor.containsKey(str2)) {
                arrayList = new java.util.ArrayList<>();
                this.getHighSpeedVideoFpsRangesFor.put(str2, arrayList);
            } else {
                arrayList = this.getHighSpeedVideoFpsRangesFor.get(str2);
            }
            arrayList.add(str);
        }
    }

    public java.util.ArrayList<java.lang.String> getIdsForTag(java.lang.String str) {
        if (this.getHighSpeedVideoFpsRangesFor.containsKey(str)) {
            return this.getHighSpeedVideoFpsRangesFor.get(str);
        }
        return null;
    }

    public void apply(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer) {
        androidx.constraintlayout.core.state.HelperReference helperReference;
        androidx.constraintlayout.core.widgets.HelperWidget helperWidget;
        androidx.constraintlayout.core.widgets.HelperWidget helperWidget2;
        constraintWidgetContainer.removeAllChildren();
        this.mParent.getWidth().apply(this, constraintWidgetContainer, 0);
        this.mParent.getHeight().apply(this, constraintWidgetContainer, 1);
        for (java.lang.Object obj : this.mHelperReferences.keySet()) {
            androidx.constraintlayout.core.widgets.HelperWidget helperWidget3 = this.mHelperReferences.get(obj).getHelperWidget();
            if (helperWidget3 != null) {
                androidx.constraintlayout.core.state.Reference reference = this.mReferences.get(obj);
                if (reference == null) {
                    reference = constraints(obj);
                }
                reference.setConstraintWidget(helperWidget3);
            }
        }
        for (java.lang.Object obj2 : this.mReferences.keySet()) {
            androidx.constraintlayout.core.state.Reference reference2 = this.mReferences.get(obj2);
            if (reference2 != this.mParent && (reference2.getFacade() instanceof androidx.constraintlayout.core.state.HelperReference) && (helperWidget2 = ((androidx.constraintlayout.core.state.HelperReference) reference2.getFacade()).getHelperWidget()) != null) {
                androidx.constraintlayout.core.state.Reference reference3 = this.mReferences.get(obj2);
                if (reference3 == null) {
                    reference3 = constraints(obj2);
                }
                reference3.setConstraintWidget(helperWidget2);
            }
        }
        java.util.Iterator<java.lang.Object> it = this.mReferences.keySet().iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.core.state.Reference reference4 = this.mReferences.get(it.next());
            if (reference4 != this.mParent) {
                androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = reference4.getConstraintWidget();
                constraintWidget.setDebugName(reference4.getKey().toString());
                constraintWidget.setParent(null);
                if (reference4.getFacade() instanceof androidx.constraintlayout.core.state.helpers.GuidelineReference) {
                    reference4.apply();
                }
                constraintWidgetContainer.add(constraintWidget);
            } else {
                reference4.setConstraintWidget(constraintWidgetContainer);
            }
        }
        java.util.Iterator<java.lang.Object> it2 = this.mHelperReferences.keySet().iterator();
        while (it2.hasNext()) {
            androidx.constraintlayout.core.state.HelperReference helperReference2 = this.mHelperReferences.get(it2.next());
            if (helperReference2.getHelperWidget() != null) {
                java.util.Iterator<java.lang.Object> it3 = helperReference2.mReferences.iterator();
                while (it3.hasNext()) {
                    helperReference2.getHelperWidget().add(this.mReferences.get(it3.next()).getConstraintWidget());
                }
                helperReference2.apply();
            } else {
                helperReference2.apply();
            }
        }
        java.util.Iterator<java.lang.Object> it4 = this.mReferences.keySet().iterator();
        while (it4.hasNext()) {
            androidx.constraintlayout.core.state.Reference reference5 = this.mReferences.get(it4.next());
            if (reference5 != this.mParent && (reference5.getFacade() instanceof androidx.constraintlayout.core.state.HelperReference) && (helperWidget = (helperReference = (androidx.constraintlayout.core.state.HelperReference) reference5.getFacade()).getHelperWidget()) != null) {
                java.util.Iterator<java.lang.Object> it5 = helperReference.mReferences.iterator();
                while (it5.hasNext()) {
                    java.lang.Object next = it5.next();
                    androidx.constraintlayout.core.state.Reference reference6 = this.mReferences.get(next);
                    if (reference6 != null) {
                        helperWidget.add(reference6.getConstraintWidget());
                    } else if (next instanceof androidx.constraintlayout.core.state.Reference) {
                        helperWidget.add(((androidx.constraintlayout.core.state.Reference) next).getConstraintWidget());
                    } else {
                        java.lang.System.out.println("couldn't find reference for ".concat(java.lang.String.valueOf(next)));
                    }
                }
                reference5.apply();
            }
        }
        for (java.lang.Object obj3 : this.mReferences.keySet()) {
            androidx.constraintlayout.core.state.Reference reference7 = this.mReferences.get(obj3);
            reference7.apply();
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget2 = reference7.getConstraintWidget();
            if (constraintWidget2 != null && obj3 != null) {
                constraintWidget2.stringId = obj3.toString();
            }
        }
    }

    public void baselineNeededFor(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap.add(obj);
        this.getHighSpeedVideoSizes = true;
    }

    public boolean isBaselineNeeded(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget) {
        if (this.getHighSpeedVideoSizes) {
            this.getHighResolutionOutputSizeshNQ4ISI.clear();
            java.util.Iterator<java.lang.Object> it = this.Camera2StreamConfigurationMap.iterator();
            while (it.hasNext()) {
                androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget2 = this.mReferences.get(it.next()).getConstraintWidget();
                if (constraintWidget2 != null) {
                    this.getHighResolutionOutputSizeshNQ4ISI.add(constraintWidget2);
                }
            }
            this.getHighSpeedVideoSizes = false;
        }
        return this.getHighResolutionOutputSizeshNQ4ISI.contains(constraintWidget);
    }

    public androidx.constraintlayout.core.state.HelperReference helper(java.lang.Object obj, androidx.constraintlayout.core.state.State.Helper helper) {
        androidx.constraintlayout.core.state.HelperReference horizontalChainReference;
        if (obj == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("__HELPER_KEY_");
            int i = this.getOutputFormats;
            this.getOutputFormats = i + 1;
            sb.append(i);
            sb.append("__");
            obj = sb.toString();
        }
        androidx.constraintlayout.core.state.HelperReference helperReference = this.mHelperReferences.get(obj);
        if (helperReference == null) {
            switch (helper) {
                case HORIZONTAL_CHAIN:
                    horizontalChainReference = new androidx.constraintlayout.core.state.helpers.HorizontalChainReference(this);
                    helperReference = horizontalChainReference;
                    break;
                case VERTICAL_CHAIN:
                    horizontalChainReference = new androidx.constraintlayout.core.state.helpers.VerticalChainReference(this);
                    helperReference = horizontalChainReference;
                    break;
                case ALIGN_HORIZONTALLY:
                    horizontalChainReference = new androidx.constraintlayout.core.state.helpers.AlignHorizontallyReference(this);
                    helperReference = horizontalChainReference;
                    break;
                case ALIGN_VERTICALLY:
                    horizontalChainReference = new androidx.constraintlayout.core.state.helpers.AlignVerticallyReference(this);
                    helperReference = horizontalChainReference;
                    break;
                case BARRIER:
                    horizontalChainReference = new androidx.constraintlayout.core.state.helpers.BarrierReference(this);
                    helperReference = horizontalChainReference;
                    break;
                case LAYER:
                default:
                    helperReference = new androidx.constraintlayout.core.state.HelperReference(this, helper);
                    break;
                case HORIZONTAL_FLOW:
                case VERTICAL_FLOW:
                    helperReference = new androidx.constraintlayout.core.state.helpers.FlowReference(this, helper);
                    break;
                case GRID:
                case ROW:
                case COLUMN:
                    helperReference = new androidx.constraintlayout.core.state.helpers.GridReference(this, helper);
                    break;
            }
            helperReference.setKey(obj);
            this.mHelperReferences.put(obj, helperReference);
        }
        return helperReference;
    }
}
