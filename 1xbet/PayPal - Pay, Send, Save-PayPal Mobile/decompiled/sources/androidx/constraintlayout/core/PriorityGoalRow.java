package androidx.constraintlayout.core;

/* loaded from: classes6.dex */
public class PriorityGoalRow extends androidx.constraintlayout.core.ArrayRow {
    private androidx.constraintlayout.core.SolverVariable[] getHighSpeedVideoSizesFor;
    androidx.constraintlayout.core.Cache getInputFormats;
    androidx.constraintlayout.core.PriorityGoalRow.GoalVariableAccessor getInputSizeshNQ4ISI;
    private androidx.constraintlayout.core.SolverVariable[] getOutputFormats;
    private int getOutputMinFrameDuration;
    private int getOutputSizes;

    class GoalVariableAccessor {
        androidx.constraintlayout.core.SolverVariable Camera2StreamConfigurationMap;
        androidx.constraintlayout.core.PriorityGoalRow getHighResolutionOutputSizeshNQ4ISI;

        GoalVariableAccessor(androidx.constraintlayout.core.PriorityGoalRow priorityGoalRow) {
            this.getHighResolutionOutputSizeshNQ4ISI = priorityGoalRow;
        }

        public final void getHighSpeedVideoSizes(androidx.constraintlayout.core.SolverVariable solverVariable) {
            this.Camera2StreamConfigurationMap = solverVariable;
        }

        public final boolean getHighSpeedVideoSizes(androidx.constraintlayout.core.SolverVariable solverVariable, float f) {
            boolean z = true;
            if (!this.Camera2StreamConfigurationMap.inGoal) {
                for (int i = 0; i < 9; i++) {
                    float f2 = solverVariable.Camera2StreamConfigurationMap[i];
                    if (f2 != 0.0f) {
                        float f3 = f2 * f;
                        if (java.lang.Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap[i] = f3;
                    } else {
                        this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap[i] = 0.0f;
                    }
                }
                return true;
            }
            for (int i2 = 0; i2 < 9; i2++) {
                float[] fArr = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap;
                fArr[i2] = fArr[i2] + (solverVariable.Camera2StreamConfigurationMap[i2] * f);
                if (java.lang.Math.abs(this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap[i2]) < 1.0E-4f) {
                    this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap[i2] = 0.0f;
                } else {
                    z = false;
                }
            }
            if (z) {
                androidx.constraintlayout.core.PriorityGoalRow.this.Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap);
            }
            return false;
        }

        public final boolean getHighResolutionOutputSizeshNQ4ISI() {
            for (int i = 8; i >= 0; i--) {
                float f = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap[i];
                if (f > 0.0f) {
                    return false;
                }
                if (f < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean getHighSpeedVideoFpsRanges(androidx.constraintlayout.core.SolverVariable solverVariable) {
            for (int i = 8; i >= 0; i--) {
                float f = solverVariable.Camera2StreamConfigurationMap[i];
                float f2 = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap[i];
                if (f2 != f) {
                    return f2 < f;
                }
            }
            return false;
        }

        public final void Camera2StreamConfigurationMap() {
            java.util.Arrays.fill(this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap, 0.0f);
        }

        public java.lang.String toString() {
            java.lang.String str = "[ ";
            if (this.Camera2StreamConfigurationMap != null) {
                for (int i = 0; i < 9; i++) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(str);
                    sb.append(this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap[i]);
                    sb.append(" ");
                    str = sb.toString();
                }
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append("] ");
            sb2.append(this.Camera2StreamConfigurationMap);
            return sb2.toString();
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public void clear() {
        this.getOutputMinFrameDuration = 0;
        this.getHighSpeedVideoSizes = 0.0f;
    }

    public PriorityGoalRow(androidx.constraintlayout.core.Cache cache) {
        super(cache);
        this.getOutputSizes = 128;
        this.getOutputFormats = new androidx.constraintlayout.core.SolverVariable[128];
        this.getHighSpeedVideoSizesFor = new androidx.constraintlayout.core.SolverVariable[128];
        this.getOutputMinFrameDuration = 0;
        this.getInputSizeshNQ4ISI = new androidx.constraintlayout.core.PriorityGoalRow.GoalVariableAccessor(this);
        this.getInputFormats = cache;
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public boolean isEmpty() {
        return this.getOutputMinFrameDuration == 0;
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public androidx.constraintlayout.core.SolverVariable getPivotCandidate(androidx.constraintlayout.core.LinearSystem linearSystem, boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.getOutputMinFrameDuration; i2++) {
            androidx.constraintlayout.core.SolverVariable solverVariable = this.getOutputFormats[i2];
            if (!zArr[solverVariable.id]) {
                this.getInputSizeshNQ4ISI.getHighSpeedVideoSizes(solverVariable);
                if (i == -1) {
                    if (!this.getInputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI()) {
                    }
                    i = i2;
                } else {
                    if (!this.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(this.getOutputFormats[i])) {
                    }
                    i = i2;
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.getOutputFormats[i];
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public void addError(androidx.constraintlayout.core.SolverVariable solverVariable) {
        this.getInputSizeshNQ4ISI.getHighSpeedVideoSizes(solverVariable);
        this.getInputSizeshNQ4ISI.Camera2StreamConfigurationMap();
        solverVariable.Camera2StreamConfigurationMap[solverVariable.strength] = 1.0f;
        getHighSpeedVideoSizes(solverVariable);
    }

    private void getHighSpeedVideoSizes(androidx.constraintlayout.core.SolverVariable solverVariable) {
        int i;
        int i2 = this.getOutputMinFrameDuration;
        androidx.constraintlayout.core.SolverVariable[] solverVariableArr = this.getOutputFormats;
        if (i2 + 1 > solverVariableArr.length) {
            androidx.constraintlayout.core.SolverVariable[] solverVariableArr2 = (androidx.constraintlayout.core.SolverVariable[]) java.util.Arrays.copyOf(solverVariableArr, solverVariableArr.length * 2);
            this.getOutputFormats = solverVariableArr2;
            this.getHighSpeedVideoSizesFor = (androidx.constraintlayout.core.SolverVariable[]) java.util.Arrays.copyOf(solverVariableArr2, solverVariableArr2.length * 2);
        }
        androidx.constraintlayout.core.SolverVariable[] solverVariableArr3 = this.getOutputFormats;
        int i3 = this.getOutputMinFrameDuration;
        solverVariableArr3[i3] = solverVariable;
        int i4 = i3 + 1;
        this.getOutputMinFrameDuration = i4;
        if (i4 > 1 && solverVariable.id > solverVariable.id) {
            int i5 = 0;
            while (true) {
                i = this.getOutputMinFrameDuration;
                if (i5 >= i) {
                    break;
                }
                this.getHighSpeedVideoSizesFor[i5] = this.getOutputFormats[i5];
                i5++;
            }
            java.util.Arrays.sort(this.getHighSpeedVideoSizesFor, 0, i, new java.util.Comparator<androidx.constraintlayout.core.SolverVariable>() { // from class: androidx.constraintlayout.core.PriorityGoalRow.1
                @Override // java.util.Comparator
                public /* bridge */ /* synthetic */ int compare(androidx.constraintlayout.core.SolverVariable solverVariable2, androidx.constraintlayout.core.SolverVariable solverVariable3) {
                    return solverVariable2.id - solverVariable3.id;
                }
            });
            for (int i6 = 0; i6 < this.getOutputMinFrameDuration; i6++) {
                this.getOutputFormats[i6] = this.getHighSpeedVideoSizesFor[i6];
            }
        }
        solverVariable.inGoal = true;
        solverVariable.addToRow(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Camera2StreamConfigurationMap(androidx.constraintlayout.core.SolverVariable solverVariable) {
        int i = 0;
        while (i < this.getOutputMinFrameDuration) {
            if (this.getOutputFormats[i] == solverVariable) {
                while (true) {
                    int i2 = this.getOutputMinFrameDuration - 1;
                    if (i < i2) {
                        androidx.constraintlayout.core.SolverVariable[] solverVariableArr = this.getOutputFormats;
                        int i3 = i + 1;
                        solverVariableArr[i] = solverVariableArr[i3];
                        i = i3;
                    } else {
                        this.getOutputMinFrameDuration = i2;
                        solverVariable.inGoal = false;
                        return;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow
    public void updateFromRow(androidx.constraintlayout.core.LinearSystem linearSystem, androidx.constraintlayout.core.ArrayRow arrayRow, boolean z) {
        androidx.constraintlayout.core.SolverVariable solverVariable = arrayRow.getHighResolutionOutputSizeshNQ4ISI;
        if (solverVariable == null) {
            return;
        }
        androidx.constraintlayout.core.ArrayRow.ArrayRowVariables arrayRowVariables = arrayRow.variables;
        int currentSize = arrayRowVariables.getCurrentSize();
        for (int i = 0; i < currentSize; i++) {
            androidx.constraintlayout.core.SolverVariable variable = arrayRowVariables.getVariable(i);
            float variableValue = arrayRowVariables.getVariableValue(i);
            this.getInputSizeshNQ4ISI.getHighSpeedVideoSizes(variable);
            if (this.getInputSizeshNQ4ISI.getHighSpeedVideoSizes(solverVariable, variableValue)) {
                getHighSpeedVideoSizes(variable);
            }
            this.getHighSpeedVideoSizes += arrayRow.getHighSpeedVideoSizes * variableValue;
        }
        Camera2StreamConfigurationMap(solverVariable);
    }

    @Override // androidx.constraintlayout.core.ArrayRow
    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(" goal -> (");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(") : ");
        java.lang.String obj = sb.toString();
        for (int i = 0; i < this.getOutputMinFrameDuration; i++) {
            this.getInputSizeshNQ4ISI.getHighSpeedVideoSizes(this.getOutputFormats[i]);
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(obj);
            sb2.append(this.getInputSizeshNQ4ISI);
            sb2.append(" ");
            obj = sb2.toString();
        }
        return obj;
    }
}
