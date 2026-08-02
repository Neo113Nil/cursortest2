package androidx.constraintlayout.core.widgets;

/* loaded from: classes.dex */
public class Guideline extends androidx.constraintlayout.core.widgets.ConstraintWidget {
    public static final int HORIZONTAL = 0;
    public static final int RELATIVE_BEGIN = 1;
    public static final int RELATIVE_END = 2;
    public static final int RELATIVE_PERCENT = 0;
    public static final int RELATIVE_UNKNOWN = -1;
    public static final int VERTICAL = 1;
    private boolean AMEXKernel;
    protected float mRelativePercent = -1.0f;
    protected int mRelativeBegin = -1;
    protected int mRelativeEnd = -1;
    protected boolean mGuidelineUseRtl = true;
    private androidx.constraintlayout.core.widgets.ConstraintAnchor Camera2StreamConfigurationMap = this.mTop;
    private int kernelVersion = 0;
    private int getHighResolutionOutputSizeshNQ4ISI = 0;

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean allowedInBarrier() {
        return true;
    }

    public Guideline() {
        this.mAnchors.clear();
        this.mAnchors.add(this.Camera2StreamConfigurationMap);
        int length = this.mListAnchors.length;
        for (int i = 0; i < length; i++) {
            this.mListAnchors[i] = this.Camera2StreamConfigurationMap;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void copy(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget, java.util.HashMap<androidx.constraintlayout.core.widgets.ConstraintWidget, androidx.constraintlayout.core.widgets.ConstraintWidget> hashMap) {
        super.copy(constraintWidget, hashMap);
        androidx.constraintlayout.core.widgets.Guideline guideline = (androidx.constraintlayout.core.widgets.Guideline) constraintWidget;
        this.mRelativePercent = guideline.mRelativePercent;
        this.mRelativeBegin = guideline.mRelativeBegin;
        this.mRelativeEnd = guideline.mRelativeEnd;
        this.mGuidelineUseRtl = guideline.mGuidelineUseRtl;
        setOrientation(guideline.kernelVersion);
    }

    public int getRelativeBehaviour() {
        if (this.mRelativePercent != -1.0f) {
            return 0;
        }
        if (this.mRelativeBegin != -1) {
            return 1;
        }
        return this.mRelativeEnd != -1 ? 2 : -1;
    }

    public void setOrientation(int i) {
        if (this.kernelVersion != i) {
            this.kernelVersion = i;
            this.mAnchors.clear();
            if (this.kernelVersion == 1) {
                this.Camera2StreamConfigurationMap = this.mLeft;
            } else {
                this.Camera2StreamConfigurationMap = this.mTop;
            }
            this.mAnchors.add(this.Camera2StreamConfigurationMap);
            int length = this.mListAnchors.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.mListAnchors[i2] = this.Camera2StreamConfigurationMap;
            }
        }
    }

    public androidx.constraintlayout.core.widgets.ConstraintAnchor getAnchor() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public java.lang.String getType() {
        return "Guideline";
    }

    public int getOrientation() {
        return this.kernelVersion;
    }

    public void setMinimumPosition(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    public int getMinimumPosition() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    /* renamed from: androidx.constraintlayout.core.widgets.Guideline$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Camera2StreamConfigurationMap;

        static {
            int[] iArr = new int[androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.values().length];
            Camera2StreamConfigurationMap = iArr;
            try {
                iArr[androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                Camera2StreamConfigurationMap[androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                Camera2StreamConfigurationMap[androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                Camera2StreamConfigurationMap[androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                Camera2StreamConfigurationMap[androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                Camera2StreamConfigurationMap[androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                Camera2StreamConfigurationMap[androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                Camera2StreamConfigurationMap[androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                Camera2StreamConfigurationMap[androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.NONE.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public androidx.constraintlayout.core.widgets.ConstraintAnchor getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type type) {
        int i = androidx.constraintlayout.core.widgets.Guideline.AnonymousClass1.Camera2StreamConfigurationMap[type.ordinal()];
        if (i == 1 || i == 2) {
            if (this.kernelVersion == 1) {
                return this.Camera2StreamConfigurationMap;
            }
            return null;
        }
        if ((i == 3 || i == 4) && this.kernelVersion == 0) {
            return this.Camera2StreamConfigurationMap;
        }
        return null;
    }

    public void setGuidePercent(int i) {
        setGuidePercent(i / 100.0f);
    }

    public void setGuidePercent(float f) {
        if (f > -1.0f) {
            this.mRelativePercent = f;
            this.mRelativeBegin = -1;
            this.mRelativeEnd = -1;
        }
    }

    public void setGuideBegin(int i) {
        if (i >= 0) {
            this.mRelativePercent = -1.0f;
            this.mRelativeBegin = i;
            this.mRelativeEnd = -1;
        }
    }

    public void setGuideEnd(int i) {
        if (i >= 0) {
            this.mRelativePercent = -1.0f;
            this.mRelativeBegin = -1;
            this.mRelativeEnd = i;
        }
    }

    public float getRelativePercent() {
        return this.mRelativePercent;
    }

    public int getRelativeBegin() {
        return this.mRelativeBegin;
    }

    public int getRelativeEnd() {
        return this.mRelativeEnd;
    }

    public void setFinalValue(int i) {
        this.Camera2StreamConfigurationMap.setFinalValue(i);
        this.AMEXKernel = true;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean isResolvedHorizontally() {
        return this.AMEXKernel;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean isResolvedVertically() {
        return this.AMEXKernel;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void addToSolver(androidx.constraintlayout.core.LinearSystem linearSystem, boolean z) {
        androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) getParent();
        if (constraintWidgetContainer != null) {
            androidx.constraintlayout.core.widgets.ConstraintAnchor anchor = constraintWidgetContainer.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT);
            androidx.constraintlayout.core.widgets.ConstraintAnchor anchor2 = constraintWidgetContainer.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT);
            boolean z2 = true;
            boolean z3 = this.mParent != null && this.mParent.mListDimensionBehaviors[0] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (this.kernelVersion == 0) {
                anchor = constraintWidgetContainer.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP);
                anchor2 = constraintWidgetContainer.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM);
                if (this.mParent == null || this.mParent.mListDimensionBehaviors[1] != androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                    z2 = false;
                }
            } else {
                z2 = z3;
            }
            if (this.AMEXKernel && this.Camera2StreamConfigurationMap.hasFinalValue()) {
                androidx.constraintlayout.core.SolverVariable createObjectVariable = linearSystem.createObjectVariable(this.Camera2StreamConfigurationMap);
                linearSystem.addEquality(createObjectVariable, this.Camera2StreamConfigurationMap.getFinalValue());
                if (this.mRelativeBegin != -1) {
                    if (z2) {
                        linearSystem.addGreaterThan(linearSystem.createObjectVariable(anchor2), createObjectVariable, 0, 5);
                    }
                } else if (this.mRelativeEnd != -1 && z2) {
                    androidx.constraintlayout.core.SolverVariable createObjectVariable2 = linearSystem.createObjectVariable(anchor2);
                    linearSystem.addGreaterThan(createObjectVariable, linearSystem.createObjectVariable(anchor), 0, 5);
                    linearSystem.addGreaterThan(createObjectVariable2, createObjectVariable, 0, 5);
                }
                this.AMEXKernel = false;
                return;
            }
            if (this.mRelativeBegin != -1) {
                androidx.constraintlayout.core.SolverVariable createObjectVariable3 = linearSystem.createObjectVariable(this.Camera2StreamConfigurationMap);
                linearSystem.addEquality(createObjectVariable3, linearSystem.createObjectVariable(anchor), this.mRelativeBegin, 8);
                if (z2) {
                    linearSystem.addGreaterThan(linearSystem.createObjectVariable(anchor2), createObjectVariable3, 0, 5);
                    return;
                }
                return;
            }
            if (this.mRelativeEnd == -1) {
                if (this.mRelativePercent != -1.0f) {
                    linearSystem.addConstraint(androidx.constraintlayout.core.LinearSystem.createRowDimensionPercent(linearSystem, linearSystem.createObjectVariable(this.Camera2StreamConfigurationMap), linearSystem.createObjectVariable(anchor2), this.mRelativePercent));
                    return;
                }
                return;
            }
            androidx.constraintlayout.core.SolverVariable createObjectVariable4 = linearSystem.createObjectVariable(this.Camera2StreamConfigurationMap);
            androidx.constraintlayout.core.SolverVariable createObjectVariable5 = linearSystem.createObjectVariable(anchor2);
            linearSystem.addEquality(createObjectVariable4, createObjectVariable5, -this.mRelativeEnd, 8);
            if (z2) {
                linearSystem.addGreaterThan(createObjectVariable4, linearSystem.createObjectVariable(anchor), 0, 5);
                linearSystem.addGreaterThan(createObjectVariable5, createObjectVariable4, 0, 5);
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void updateFromSolver(androidx.constraintlayout.core.LinearSystem linearSystem, boolean z) {
        if (getParent() == null) {
            return;
        }
        int objectVariableValue = linearSystem.getObjectVariableValue(this.Camera2StreamConfigurationMap);
        if (this.kernelVersion == 1) {
            setX(objectVariableValue);
            setY(0);
            setHeight(getParent().getHeight());
            setWidth(0);
            return;
        }
        setX(0);
        setY(objectVariableValue);
        setWidth(getParent().getWidth());
        setHeight(0);
    }

    public void cyclePosition() {
        if (this.mRelativeBegin != -1) {
            float x = getX() / getParent().getWidth();
            if (this.kernelVersion == 0) {
                x = getY() / getParent().getHeight();
            }
            setGuidePercent(x);
            return;
        }
        if (this.mRelativePercent == -1.0f) {
            if (this.mRelativeEnd != -1) {
                int x2 = getX();
                if (this.kernelVersion == 0) {
                    x2 = getY();
                }
                setGuideBegin(x2);
                return;
            }
            return;
        }
        int width = getParent().getWidth() - getX();
        if (this.kernelVersion == 0) {
            width = getParent().getHeight() - getY();
        }
        setGuideEnd(width);
    }

    public boolean isPercent() {
        return this.mRelativePercent != -1.0f && this.mRelativeBegin == -1 && this.mRelativeEnd == -1;
    }
}
