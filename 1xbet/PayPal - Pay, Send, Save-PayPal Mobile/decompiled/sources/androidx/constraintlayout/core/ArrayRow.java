package androidx.constraintlayout.core;

/* loaded from: classes6.dex */
public class ArrayRow implements androidx.constraintlayout.core.LinearSystem.Row {
    public androidx.constraintlayout.core.ArrayRow.ArrayRowVariables variables;
    androidx.constraintlayout.core.SolverVariable getHighResolutionOutputSizeshNQ4ISI = null;
    float getHighSpeedVideoSizes = 0.0f;
    boolean getHighSpeedVideoFpsRanges = false;
    java.util.ArrayList<androidx.constraintlayout.core.SolverVariable> Camera2StreamConfigurationMap = new java.util.ArrayList<>();
    boolean getHighSpeedVideoFpsRangesFor = false;

    public interface ArrayRowVariables {
        void add(androidx.constraintlayout.core.SolverVariable solverVariable, float f, boolean z);

        void clear();

        boolean contains(androidx.constraintlayout.core.SolverVariable solverVariable);

        void display();

        void divideByAmount(float f);

        float get(androidx.constraintlayout.core.SolverVariable solverVariable);

        int getCurrentSize();

        androidx.constraintlayout.core.SolverVariable getVariable(int i);

        float getVariableValue(int i);

        int indexOf(androidx.constraintlayout.core.SolverVariable solverVariable);

        void invert();

        void put(androidx.constraintlayout.core.SolverVariable solverVariable, float f);

        float remove(androidx.constraintlayout.core.SolverVariable solverVariable, boolean z);

        int sizeInBytes();

        float use(androidx.constraintlayout.core.ArrayRow arrayRow, boolean z);
    }

    public ArrayRow() {
    }

    public ArrayRow(androidx.constraintlayout.core.Cache cache) {
        this.variables = new androidx.constraintlayout.core.ArrayLinkedVariables(this, cache);
    }

    final boolean getHighSpeedVideoFpsRanges() {
        androidx.constraintlayout.core.SolverVariable solverVariable = this.getHighResolutionOutputSizeshNQ4ISI;
        if (solverVariable != null) {
            return solverVariable.getOutputFormats == androidx.constraintlayout.core.SolverVariable.Type.UNRESTRICTED || this.getHighSpeedVideoSizes >= 0.0f;
        }
        return false;
    }

    public java.lang.String toString() {
        return getHighSpeedVideoFpsRangesFor();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final java.lang.String getHighSpeedVideoFpsRangesFor() {
        java.lang.String obj;
        boolean z;
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            obj = "0";
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            obj = sb.toString();
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(obj);
        sb2.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.EQUALS_SIGN_WITH_SPACES);
        java.lang.String obj2 = sb2.toString();
        if (this.getHighSpeedVideoSizes != 0.0f) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(obj2);
            sb3.append(this.getHighSpeedVideoSizes);
            obj2 = sb3.toString();
            z = true;
        } else {
            z = false;
        }
        int currentSize = this.variables.getCurrentSize();
        for (int i = 0; i < currentSize; i++) {
            androidx.constraintlayout.core.SolverVariable variable = this.variables.getVariable(i);
            if (variable != null) {
                float variableValue = this.variables.getVariableValue(i);
                if (variableValue != 0.0f) {
                    java.lang.String obj3 = variable.toString();
                    if (!z) {
                        if (variableValue < 0.0f) {
                            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                            sb4.append(obj2);
                            sb4.append("- ");
                            obj2 = sb4.toString();
                            variableValue *= -1.0f;
                        }
                        if (variableValue == 1.0f) {
                            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                            sb5.append(obj2);
                            sb5.append(obj3);
                            obj2 = sb5.toString();
                        } else {
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                            sb6.append(obj2);
                            sb6.append(variableValue);
                            sb6.append(" ");
                            sb6.append(obj3);
                            obj2 = sb6.toString();
                        }
                        z = true;
                    } else if (variableValue > 0.0f) {
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                        sb7.append(obj2);
                        sb7.append(" + ");
                        obj2 = sb7.toString();
                        if (variableValue == 1.0f) {
                        }
                        z = true;
                    } else {
                        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                        sb8.append(obj2);
                        sb8.append(" - ");
                        obj2 = sb8.toString();
                        variableValue *= -1.0f;
                        if (variableValue == 1.0f) {
                        }
                        z = true;
                    }
                }
            }
        }
        if (z) {
            return obj2;
        }
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
        sb9.append(obj2);
        sb9.append(androidx.camera.core.processing.util.GLUtils.VERSION_UNKNOWN);
        return sb9.toString();
    }

    public void reset() {
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.variables.clear();
        this.getHighSpeedVideoSizes = 0.0f;
        this.getHighSpeedVideoFpsRangesFor = false;
    }

    final boolean getHighSpeedVideoFpsRanges(androidx.constraintlayout.core.SolverVariable solverVariable) {
        return this.variables.contains(solverVariable);
    }

    public androidx.constraintlayout.core.ArrayRow createRowEquals(androidx.constraintlayout.core.SolverVariable solverVariable, int i) {
        if (i < 0) {
            this.getHighSpeedVideoSizes = i * (-1);
            this.variables.put(solverVariable, 1.0f);
            return this;
        }
        this.getHighSpeedVideoSizes = i;
        this.variables.put(solverVariable, -1.0f);
        return this;
    }

    public androidx.constraintlayout.core.ArrayRow createRowEquals(androidx.constraintlayout.core.SolverVariable solverVariable, androidx.constraintlayout.core.SolverVariable solverVariable2, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            } else {
                z = false;
            }
            this.getHighSpeedVideoSizes = i;
            if (z) {
                this.variables.put(solverVariable, 1.0f);
                this.variables.put(solverVariable2, -1.0f);
                return this;
            }
        }
        this.variables.put(solverVariable, -1.0f);
        this.variables.put(solverVariable2, 1.0f);
        return this;
    }

    final androidx.constraintlayout.core.ArrayRow Camera2StreamConfigurationMap(androidx.constraintlayout.core.SolverVariable solverVariable, int i) {
        this.variables.put(solverVariable, i);
        return this;
    }

    public androidx.constraintlayout.core.ArrayRow createRowGreaterThan(androidx.constraintlayout.core.SolverVariable solverVariable, androidx.constraintlayout.core.SolverVariable solverVariable2, androidx.constraintlayout.core.SolverVariable solverVariable3, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            } else {
                z = false;
            }
            this.getHighSpeedVideoSizes = i;
            if (z) {
                this.variables.put(solverVariable, 1.0f);
                this.variables.put(solverVariable2, -1.0f);
                this.variables.put(solverVariable3, -1.0f);
                return this;
            }
        }
        this.variables.put(solverVariable, -1.0f);
        this.variables.put(solverVariable2, 1.0f);
        this.variables.put(solverVariable3, 1.0f);
        return this;
    }

    public androidx.constraintlayout.core.ArrayRow createRowGreaterThan(androidx.constraintlayout.core.SolverVariable solverVariable, int i, androidx.constraintlayout.core.SolverVariable solverVariable2) {
        this.getHighSpeedVideoSizes = i;
        this.variables.put(solverVariable, -1.0f);
        return this;
    }

    public androidx.constraintlayout.core.ArrayRow createRowLowerThan(androidx.constraintlayout.core.SolverVariable solverVariable, androidx.constraintlayout.core.SolverVariable solverVariable2, androidx.constraintlayout.core.SolverVariable solverVariable3, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            } else {
                z = false;
            }
            this.getHighSpeedVideoSizes = i;
            if (z) {
                this.variables.put(solverVariable, 1.0f);
                this.variables.put(solverVariable2, -1.0f);
                this.variables.put(solverVariable3, 1.0f);
                return this;
            }
        }
        this.variables.put(solverVariable, -1.0f);
        this.variables.put(solverVariable2, 1.0f);
        this.variables.put(solverVariable3, -1.0f);
        return this;
    }

    public androidx.constraintlayout.core.ArrayRow createRowEqualMatchDimensions(float f, float f2, float f3, androidx.constraintlayout.core.SolverVariable solverVariable, androidx.constraintlayout.core.SolverVariable solverVariable2, androidx.constraintlayout.core.SolverVariable solverVariable3, androidx.constraintlayout.core.SolverVariable solverVariable4) {
        this.getHighSpeedVideoSizes = 0.0f;
        if (f2 == 0.0f || f == f3) {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable4, 1.0f);
            this.variables.put(solverVariable3, -1.0f);
            return this;
        }
        if (f == 0.0f) {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            return this;
        }
        if (f3 == 0.0f) {
            this.variables.put(solverVariable3, 1.0f);
            this.variables.put(solverVariable4, -1.0f);
            return this;
        }
        float f4 = (f / f2) / (f3 / f2);
        this.variables.put(solverVariable, 1.0f);
        this.variables.put(solverVariable2, -1.0f);
        this.variables.put(solverVariable4, f4);
        this.variables.put(solverVariable3, -f4);
        return this;
    }

    public androidx.constraintlayout.core.ArrayRow createRowEqualDimension(float f, float f2, float f3, androidx.constraintlayout.core.SolverVariable solverVariable, int i, androidx.constraintlayout.core.SolverVariable solverVariable2, int i2, androidx.constraintlayout.core.SolverVariable solverVariable3, int i3, androidx.constraintlayout.core.SolverVariable solverVariable4, int i4) {
        if (f2 == 0.0f || f == f3) {
            this.getHighSpeedVideoSizes = ((-i) - i2) + i3 + i4;
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable4, 1.0f);
            this.variables.put(solverVariable3, -1.0f);
            return this;
        }
        float f4 = (f / f2) / (f3 / f2);
        this.getHighSpeedVideoSizes = ((-i) - i2) + (i3 * f4) + (i4 * f4);
        this.variables.put(solverVariable, 1.0f);
        this.variables.put(solverVariable2, -1.0f);
        this.variables.put(solverVariable4, f4);
        this.variables.put(solverVariable3, -f4);
        return this;
    }

    public androidx.constraintlayout.core.ArrayRow addError(androidx.constraintlayout.core.LinearSystem linearSystem, int i) {
        this.variables.put(linearSystem.createErrorVariable(i, "ep"), 1.0f);
        this.variables.put(linearSystem.createErrorVariable(i, "em"), -1.0f);
        return this;
    }

    public androidx.constraintlayout.core.ArrayRow createRowDimensionRatio(androidx.constraintlayout.core.SolverVariable solverVariable, androidx.constraintlayout.core.SolverVariable solverVariable2, androidx.constraintlayout.core.SolverVariable solverVariable3, androidx.constraintlayout.core.SolverVariable solverVariable4, float f) {
        this.variables.put(solverVariable, -1.0f);
        this.variables.put(solverVariable2, 1.0f);
        this.variables.put(solverVariable3, f);
        this.variables.put(solverVariable4, -f);
        return this;
    }

    public androidx.constraintlayout.core.ArrayRow createRowWithAngle(androidx.constraintlayout.core.SolverVariable solverVariable, androidx.constraintlayout.core.SolverVariable solverVariable2, androidx.constraintlayout.core.SolverVariable solverVariable3, androidx.constraintlayout.core.SolverVariable solverVariable4, float f) {
        this.variables.put(solverVariable3, 0.5f);
        this.variables.put(solverVariable4, 0.5f);
        this.variables.put(solverVariable, -0.5f);
        this.variables.put(solverVariable2, -0.5f);
        this.getHighSpeedVideoSizes = -f;
        return this;
    }

    final void getHighResolutionOutputSizeshNQ4ISI() {
        float f = this.getHighSpeedVideoSizes;
        if (f < 0.0f) {
            this.getHighSpeedVideoSizes = f * (-1.0f);
            this.variables.invert();
        }
    }

    final boolean getHighSpeedVideoFpsRangesFor(androidx.constraintlayout.core.LinearSystem linearSystem) {
        boolean z;
        androidx.constraintlayout.core.SolverVariable highSpeedVideoSizes = getHighSpeedVideoSizes();
        if (highSpeedVideoSizes == null) {
            z = true;
        } else {
            getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes);
            z = false;
        }
        if (this.variables.getCurrentSize() == 0) {
            this.getHighSpeedVideoFpsRangesFor = true;
        }
        return z;
    }

    private androidx.constraintlayout.core.SolverVariable getHighSpeedVideoSizes() {
        boolean highSpeedVideoSizes;
        boolean highSpeedVideoSizes2;
        int currentSize = this.variables.getCurrentSize();
        androidx.constraintlayout.core.SolverVariable solverVariable = null;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        androidx.constraintlayout.core.SolverVariable solverVariable2 = null;
        for (int i = 0; i < currentSize; i++) {
            float variableValue = this.variables.getVariableValue(i);
            androidx.constraintlayout.core.SolverVariable variable = this.variables.getVariable(i);
            if (variable.getOutputFormats == androidx.constraintlayout.core.SolverVariable.Type.UNRESTRICTED) {
                if (solverVariable == null) {
                    highSpeedVideoSizes2 = getHighSpeedVideoSizes(variable);
                } else if (f > variableValue) {
                    highSpeedVideoSizes2 = getHighSpeedVideoSizes(variable);
                } else if (!z && getHighSpeedVideoSizes(variable)) {
                    f = variableValue;
                    solverVariable = variable;
                    z = true;
                }
                z = highSpeedVideoSizes2;
                f = variableValue;
                solverVariable = variable;
            } else if (solverVariable == null && variableValue < 0.0f) {
                if (solverVariable2 == null) {
                    highSpeedVideoSizes = getHighSpeedVideoSizes(variable);
                } else if (f2 > variableValue) {
                    highSpeedVideoSizes = getHighSpeedVideoSizes(variable);
                } else if (!z2 && getHighSpeedVideoSizes(variable)) {
                    f2 = variableValue;
                    solverVariable2 = variable;
                    z2 = true;
                }
                z2 = highSpeedVideoSizes;
                f2 = variableValue;
                solverVariable2 = variable;
            }
        }
        return solverVariable != null ? solverVariable : solverVariable2;
    }

    private static boolean getHighSpeedVideoSizes(androidx.constraintlayout.core.SolverVariable solverVariable) {
        return solverVariable.usageInRowCount <= 1;
    }

    final void getHighResolutionOutputSizeshNQ4ISI(androidx.constraintlayout.core.SolverVariable solverVariable) {
        androidx.constraintlayout.core.SolverVariable solverVariable2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (solverVariable2 != null) {
            this.variables.put(solverVariable2, -1.0f);
            this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes = -1;
            this.getHighResolutionOutputSizeshNQ4ISI = null;
        }
        float remove = this.variables.remove(solverVariable, true) * (-1.0f);
        this.getHighResolutionOutputSizeshNQ4ISI = solverVariable;
        if (remove == 1.0f) {
            return;
        }
        this.getHighSpeedVideoSizes /= remove;
        this.variables.divideByAmount(remove);
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public boolean isEmpty() {
        return this.getHighResolutionOutputSizeshNQ4ISI == null && this.getHighSpeedVideoSizes == 0.0f && this.variables.getCurrentSize() == 0;
    }

    public void updateFromRow(androidx.constraintlayout.core.LinearSystem linearSystem, androidx.constraintlayout.core.ArrayRow arrayRow, boolean z) {
        this.getHighSpeedVideoSizes += arrayRow.getHighSpeedVideoSizes * this.variables.use(arrayRow, z);
        if (z) {
            arrayRow.getHighResolutionOutputSizeshNQ4ISI.removeFromRow(this);
        }
        if (androidx.constraintlayout.core.LinearSystem.SIMPLIFY_SYNONYMS && this.getHighResolutionOutputSizeshNQ4ISI != null && this.variables.getCurrentSize() == 0) {
            this.getHighSpeedVideoFpsRangesFor = true;
            linearSystem.hasSimpleDefinition = true;
        }
    }

    public void updateFromFinalVariable(androidx.constraintlayout.core.LinearSystem linearSystem, androidx.constraintlayout.core.SolverVariable solverVariable, boolean z) {
        if (solverVariable == null || !solverVariable.isFinalValue) {
            return;
        }
        this.getHighSpeedVideoSizes += solverVariable.computedValue * this.variables.get(solverVariable);
        this.variables.remove(solverVariable, z);
        if (z) {
            solverVariable.removeFromRow(this);
        }
        if (androidx.constraintlayout.core.LinearSystem.SIMPLIFY_SYNONYMS && this.variables.getCurrentSize() == 0) {
            this.getHighSpeedVideoFpsRangesFor = true;
            linearSystem.hasSimpleDefinition = true;
        }
    }

    public void updateFromSynonymVariable(androidx.constraintlayout.core.LinearSystem linearSystem, androidx.constraintlayout.core.SolverVariable solverVariable, boolean z) {
        if (solverVariable == null || !solverVariable.getOutputMinFrameDuration) {
            return;
        }
        float f = this.variables.get(solverVariable);
        this.getHighSpeedVideoSizes += solverVariable.getInputFormats * f;
        this.variables.remove(solverVariable, z);
        if (z) {
            solverVariable.removeFromRow(this);
        }
        this.variables.add(linearSystem.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges[solverVariable.getHighSpeedVideoSizesFor], f, z);
        if (androidx.constraintlayout.core.LinearSystem.SIMPLIFY_SYNONYMS && this.variables.getCurrentSize() == 0) {
            this.getHighSpeedVideoFpsRangesFor = true;
            linearSystem.hasSimpleDefinition = true;
        }
    }

    private androidx.constraintlayout.core.SolverVariable getHighSpeedVideoFpsRanges(boolean[] zArr, androidx.constraintlayout.core.SolverVariable solverVariable) {
        int currentSize = this.variables.getCurrentSize();
        androidx.constraintlayout.core.SolverVariable solverVariable2 = null;
        float f = 0.0f;
        for (int i = 0; i < currentSize; i++) {
            float variableValue = this.variables.getVariableValue(i);
            if (variableValue < 0.0f) {
                androidx.constraintlayout.core.SolverVariable variable = this.variables.getVariable(i);
                if ((zArr == null || !zArr[variable.id]) && variable != solverVariable && ((variable.getOutputFormats == androidx.constraintlayout.core.SolverVariable.Type.SLACK || variable.getOutputFormats == androidx.constraintlayout.core.SolverVariable.Type.ERROR) && variableValue < f)) {
                    f = variableValue;
                    solverVariable2 = variable;
                }
            }
        }
        return solverVariable2;
    }

    public androidx.constraintlayout.core.SolverVariable pickPivot(androidx.constraintlayout.core.SolverVariable solverVariable) {
        return getHighSpeedVideoFpsRanges(null, solverVariable);
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public androidx.constraintlayout.core.SolverVariable getPivotCandidate(androidx.constraintlayout.core.LinearSystem linearSystem, boolean[] zArr) {
        return getHighSpeedVideoFpsRanges(zArr, null);
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void clear() {
        this.variables.clear();
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.getHighSpeedVideoSizes = 0.0f;
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void initFromRow(androidx.constraintlayout.core.LinearSystem.Row row) {
        if (row instanceof androidx.constraintlayout.core.ArrayRow) {
            androidx.constraintlayout.core.ArrayRow arrayRow = (androidx.constraintlayout.core.ArrayRow) row;
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            this.variables.clear();
            for (int i = 0; i < arrayRow.variables.getCurrentSize(); i++) {
                this.variables.add(arrayRow.variables.getVariable(i), arrayRow.variables.getVariableValue(i), true);
            }
        }
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public void addError(androidx.constraintlayout.core.SolverVariable solverVariable) {
        float f;
        if (solverVariable.strength != 1) {
            if (solverVariable.strength == 2) {
                f = 1000.0f;
            } else if (solverVariable.strength == 3) {
                f = 1000000.0f;
            } else if (solverVariable.strength == 4) {
                f = 1.0E9f;
            } else if (solverVariable.strength == 5) {
                f = 1.0E12f;
            }
            this.variables.put(solverVariable, f);
        }
        f = 1.0f;
        this.variables.put(solverVariable, f);
    }

    @Override // androidx.constraintlayout.core.LinearSystem.Row
    public androidx.constraintlayout.core.SolverVariable getKey() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void updateFromSystem(androidx.constraintlayout.core.LinearSystem linearSystem) {
        if (linearSystem.getHighResolutionOutputSizeshNQ4ISI.length != 0) {
            boolean z = false;
            while (!z) {
                int currentSize = this.variables.getCurrentSize();
                for (int i = 0; i < currentSize; i++) {
                    androidx.constraintlayout.core.SolverVariable variable = this.variables.getVariable(i);
                    if (variable.getHighSpeedVideoSizes != -1 || variable.isFinalValue || variable.getOutputMinFrameDuration) {
                        this.Camera2StreamConfigurationMap.add(variable);
                    }
                }
                int size = this.Camera2StreamConfigurationMap.size();
                if (size > 0) {
                    for (int i2 = 0; i2 < size; i2++) {
                        androidx.constraintlayout.core.SolverVariable solverVariable = this.Camera2StreamConfigurationMap.get(i2);
                        if (solverVariable.isFinalValue) {
                            updateFromFinalVariable(linearSystem, solverVariable, true);
                        } else if (solverVariable.getOutputMinFrameDuration) {
                            updateFromSynonymVariable(linearSystem, solverVariable, true);
                        } else {
                            updateFromRow(linearSystem, linearSystem.getHighResolutionOutputSizeshNQ4ISI[solverVariable.getHighSpeedVideoSizes], true);
                        }
                    }
                    this.Camera2StreamConfigurationMap.clear();
                } else {
                    z = true;
                }
            }
            if (androidx.constraintlayout.core.LinearSystem.SIMPLIFY_SYNONYMS && this.getHighResolutionOutputSizeshNQ4ISI != null && this.variables.getCurrentSize() == 0) {
                this.getHighSpeedVideoFpsRangesFor = true;
                linearSystem.hasSimpleDefinition = true;
            }
        }
    }
}
