package androidx.constraintlayout.core;

/* loaded from: classes6.dex */
public class SolverVariableValues implements androidx.constraintlayout.core.ArrayRow.ArrayRowVariables {
    private static float getInputSizeshNQ4ISI = 0.001f;
    private final androidx.constraintlayout.core.ArrayRow getOutputStallDurationlomOqCM;
    protected final androidx.constraintlayout.core.Cache mCache;
    private final int getOutputStallDuration = -1;
    private int getOutputMinFrameDurationlomOqCM = 16;
    private int getOutputFormats = 16;
    int[] getHighSpeedVideoSizes = new int[16];
    int[] getHighSpeedVideoFpsRangesFor = new int[16];
    int[] getOutputMinFrameDuration = new int[16];
    float[] getHighSpeedVideoSizesFor = new float[16];
    int[] getInputFormats = new int[16];
    int[] getHighSpeedVideoFpsRanges = new int[16];
    int getHighResolutionOutputSizeshNQ4ISI = 0;
    int Camera2StreamConfigurationMap = -1;

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int sizeInBytes() {
        return 0;
    }

    SolverVariableValues(androidx.constraintlayout.core.ArrayRow arrayRow, androidx.constraintlayout.core.Cache cache) {
        this.getOutputStallDurationlomOqCM = arrayRow;
        this.mCache = cache;
        clear();
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int getCurrentSize() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public androidx.constraintlayout.core.SolverVariable getVariable(int i) {
        int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i2 == 0) {
            return null;
        }
        int i3 = this.Camera2StreamConfigurationMap;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i && i3 != -1) {
                return this.mCache.getHighSpeedVideoFpsRanges[this.getOutputMinFrameDuration[i3]];
            }
            i3 = this.getHighSpeedVideoFpsRanges[i3];
            if (i3 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float getVariableValue(int i) {
        int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
        int i3 = this.Camera2StreamConfigurationMap;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i) {
                return this.getHighSpeedVideoSizesFor[i3];
            }
            i3 = this.getHighSpeedVideoFpsRanges[i3];
            if (i3 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public boolean contains(androidx.constraintlayout.core.SolverVariable solverVariable) {
        return indexOf(solverVariable) != -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int indexOf(androidx.constraintlayout.core.SolverVariable solverVariable) {
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0 && solverVariable != null) {
            int i = solverVariable.id;
            int i2 = this.getHighSpeedVideoSizes[i % this.getOutputFormats];
            if (i2 == -1) {
                return -1;
            }
            if (this.getOutputMinFrameDuration[i2] == i) {
                return i2;
            }
            do {
                i2 = this.getHighSpeedVideoFpsRangesFor[i2];
                if (i2 == -1) {
                    break;
                }
            } while (this.getOutputMinFrameDuration[i2] != i);
            if (i2 != -1 && this.getOutputMinFrameDuration[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float get(androidx.constraintlayout.core.SolverVariable solverVariable) {
        int indexOf = indexOf(solverVariable);
        if (indexOf != -1) {
            return this.getHighSpeedVideoSizesFor[indexOf];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void display() {
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.System.out.print("{ ");
        for (int i2 = 0; i2 < i; i2++) {
            androidx.constraintlayout.core.SolverVariable variable = getVariable(i2);
            if (variable != null) {
                java.io.PrintStream printStream = java.lang.System.out;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(variable);
                sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.EQUALS_SIGN_WITH_SPACES);
                sb.append(getVariableValue(i2));
                sb.append(" ");
                printStream.print(sb.toString());
            }
        }
        java.lang.System.out.println(" }");
    }

    public java.lang.String toString() {
        java.lang.String obj;
        java.lang.String obj2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(hashCode());
        sb.append(" { ");
        java.lang.String obj3 = sb.toString();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        for (int i2 = 0; i2 < i; i2++) {
            androidx.constraintlayout.core.SolverVariable variable = getVariable(i2);
            if (variable != null) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(obj3);
                sb2.append(variable);
                sb2.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.EQUALS_SIGN_WITH_SPACES);
                sb2.append(getVariableValue(i2));
                sb2.append(" ");
                java.lang.String obj4 = sb2.toString();
                int indexOf = indexOf(variable);
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                sb3.append(obj4);
                sb3.append("[p: ");
                java.lang.String obj5 = sb3.toString();
                if (this.getInputFormats[indexOf] != -1) {
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                    sb4.append(obj5);
                    sb4.append(this.mCache.getHighSpeedVideoFpsRanges[this.getOutputMinFrameDuration[this.getInputFormats[indexOf]]]);
                    obj = sb4.toString();
                } else {
                    java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                    sb5.append(obj5);
                    sb5.append("none");
                    obj = sb5.toString();
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(obj);
                sb6.append(", n: ");
                java.lang.String obj6 = sb6.toString();
                if (this.getHighSpeedVideoFpsRanges[indexOf] != -1) {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    sb7.append(obj6);
                    sb7.append(this.mCache.getHighSpeedVideoFpsRanges[this.getOutputMinFrameDuration[this.getHighSpeedVideoFpsRanges[indexOf]]]);
                    obj2 = sb7.toString();
                } else {
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                    sb8.append(obj6);
                    sb8.append("none");
                    obj2 = sb8.toString();
                }
                java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
                sb9.append(obj2);
                sb9.append("]");
                obj3 = sb9.toString();
            }
        }
        java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
        sb10.append(obj3);
        sb10.append(" }");
        return sb10.toString();
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void clear() {
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        for (int i2 = 0; i2 < i; i2++) {
            androidx.constraintlayout.core.SolverVariable variable = getVariable(i2);
            if (variable != null) {
                variable.removeFromRow(this.getOutputStallDurationlomOqCM);
            }
        }
        for (int i3 = 0; i3 < this.getOutputMinFrameDurationlomOqCM; i3++) {
            this.getOutputMinFrameDuration[i3] = -1;
            this.getHighSpeedVideoFpsRangesFor[i3] = -1;
        }
        for (int i4 = 0; i4 < this.getOutputFormats; i4++) {
            this.getHighSpeedVideoSizes[i4] = -1;
        }
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
        this.Camera2StreamConfigurationMap = -1;
    }

    private void getHighSpeedVideoSizes(androidx.constraintlayout.core.SolverVariable solverVariable, int i) {
        int[] iArr;
        int i2 = solverVariable.id % this.getOutputFormats;
        int[] iArr2 = this.getHighSpeedVideoSizes;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            iArr2[i2] = i;
        } else {
            while (true) {
                iArr = this.getHighSpeedVideoFpsRangesFor;
                int i4 = iArr[i3];
                if (i4 == -1) {
                    break;
                } else {
                    i3 = i4;
                }
            }
            iArr[i3] = i;
        }
        this.getHighSpeedVideoFpsRangesFor[i] = -1;
    }

    private void getHighSpeedVideoSizes(int i, androidx.constraintlayout.core.SolverVariable solverVariable, float f) {
        this.getOutputMinFrameDuration[i] = solverVariable.id;
        this.getHighSpeedVideoSizesFor[i] = f;
        this.getInputFormats[i] = -1;
        this.getHighSpeedVideoFpsRanges[i] = -1;
        solverVariable.addToRow(this.getOutputStallDurationlomOqCM);
        solverVariable.usageInRowCount++;
        this.getHighResolutionOutputSizeshNQ4ISI++;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void put(androidx.constraintlayout.core.SolverVariable solverVariable, float f) {
        float f2 = getInputSizeshNQ4ISI;
        if (f > (-f2) && f < f2) {
            remove(solverVariable, true);
            return;
        }
        int i = 0;
        if (this.getHighResolutionOutputSizeshNQ4ISI == 0) {
            getHighSpeedVideoSizes(0, solverVariable, f);
            getHighSpeedVideoSizes(solverVariable, 0);
            this.Camera2StreamConfigurationMap = 0;
            return;
        }
        int indexOf = indexOf(solverVariable);
        if (indexOf != -1) {
            this.getHighSpeedVideoSizesFor[indexOf] = f;
            return;
        }
        int i2 = this.getHighResolutionOutputSizeshNQ4ISI + 1;
        int i3 = this.getOutputMinFrameDurationlomOqCM;
        if (i2 >= i3) {
            int i4 = i3 * 2;
            this.getOutputMinFrameDuration = java.util.Arrays.copyOf(this.getOutputMinFrameDuration, i4);
            this.getHighSpeedVideoSizesFor = java.util.Arrays.copyOf(this.getHighSpeedVideoSizesFor, i4);
            this.getInputFormats = java.util.Arrays.copyOf(this.getInputFormats, i4);
            this.getHighSpeedVideoFpsRanges = java.util.Arrays.copyOf(this.getHighSpeedVideoFpsRanges, i4);
            this.getHighSpeedVideoFpsRangesFor = java.util.Arrays.copyOf(this.getHighSpeedVideoFpsRangesFor, i4);
            for (int i5 = this.getOutputMinFrameDurationlomOqCM; i5 < i4; i5++) {
                this.getOutputMinFrameDuration[i5] = -1;
                this.getHighSpeedVideoFpsRangesFor[i5] = -1;
            }
            this.getOutputMinFrameDurationlomOqCM = i4;
        }
        int i6 = this.getHighResolutionOutputSizeshNQ4ISI;
        int i7 = this.Camera2StreamConfigurationMap;
        int i8 = -1;
        for (int i9 = 0; i9 < i6; i9++) {
            if (this.getOutputMinFrameDuration[i7] == solverVariable.id) {
                this.getHighSpeedVideoSizesFor[i7] = f;
                return;
            }
            if (this.getOutputMinFrameDuration[i7] < solverVariable.id) {
                i8 = i7;
            }
            i7 = this.getHighSpeedVideoFpsRanges[i7];
            if (i7 == -1) {
                break;
            }
        }
        while (true) {
            if (i >= this.getOutputMinFrameDurationlomOqCM) {
                i = -1;
                break;
            } else if (this.getOutputMinFrameDuration[i] == -1) {
                break;
            } else {
                i++;
            }
        }
        getHighSpeedVideoSizes(i, solverVariable, f);
        if (i8 != -1) {
            this.getInputFormats[i] = i8;
            int[] iArr = this.getHighSpeedVideoFpsRanges;
            iArr[i] = iArr[i8];
            iArr[i8] = i;
        } else {
            this.getInputFormats[i] = -1;
            if (this.getHighResolutionOutputSizeshNQ4ISI > 0) {
                this.getHighSpeedVideoFpsRanges[i] = this.Camera2StreamConfigurationMap;
                this.Camera2StreamConfigurationMap = i;
            } else {
                this.getHighSpeedVideoFpsRanges[i] = -1;
            }
        }
        int i10 = this.getHighSpeedVideoFpsRanges[i];
        if (i10 != -1) {
            this.getInputFormats[i10] = i;
        }
        getHighSpeedVideoSizes(solverVariable, i);
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float remove(androidx.constraintlayout.core.SolverVariable solverVariable, boolean z) {
        int[] iArr;
        int i;
        int indexOf = indexOf(solverVariable);
        if (indexOf == -1) {
            return 0.0f;
        }
        int i2 = solverVariable.id % this.getOutputFormats;
        int i3 = this.getHighSpeedVideoSizes[i2];
        if (i3 != -1) {
            int i4 = solverVariable.id;
            if (this.getOutputMinFrameDuration[i3] == i4) {
                int[] iArr2 = this.getHighSpeedVideoSizes;
                int[] iArr3 = this.getHighSpeedVideoFpsRangesFor;
                iArr2[i2] = iArr3[i3];
                iArr3[i3] = -1;
            } else {
                while (true) {
                    iArr = this.getHighSpeedVideoFpsRangesFor;
                    i = iArr[i3];
                    if (i == -1 || this.getOutputMinFrameDuration[i] == i4) {
                        break;
                    }
                    i3 = i;
                }
                if (i != -1 && this.getOutputMinFrameDuration[i] == i4) {
                    iArr[i3] = iArr[i];
                    iArr[i] = -1;
                }
            }
        }
        float f = this.getHighSpeedVideoSizesFor[indexOf];
        if (this.Camera2StreamConfigurationMap == indexOf) {
            this.Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRanges[indexOf];
        }
        this.getOutputMinFrameDuration[indexOf] = -1;
        int[] iArr4 = this.getInputFormats;
        int i5 = iArr4[indexOf];
        if (i5 != -1) {
            int[] iArr5 = this.getHighSpeedVideoFpsRanges;
            iArr5[i5] = iArr5[indexOf];
        }
        int i6 = this.getHighSpeedVideoFpsRanges[indexOf];
        if (i6 != -1) {
            iArr4[i6] = iArr4[indexOf];
        }
        this.getHighResolutionOutputSizeshNQ4ISI--;
        solverVariable.usageInRowCount--;
        if (z) {
            solverVariable.removeFromRow(this.getOutputStallDurationlomOqCM);
        }
        return f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void add(androidx.constraintlayout.core.SolverVariable solverVariable, float f, boolean z) {
        float f2 = getInputSizeshNQ4ISI;
        if (f <= (-f2) || f >= f2) {
            int indexOf = indexOf(solverVariable);
            if (indexOf == -1) {
                put(solverVariable, f);
                return;
            }
            float[] fArr = this.getHighSpeedVideoSizesFor;
            float f3 = fArr[indexOf] + f;
            fArr[indexOf] = f3;
            float f4 = getInputSizeshNQ4ISI;
            if (f3 <= (-f4) || f3 >= f4) {
                return;
            }
            fArr[indexOf] = 0.0f;
            remove(solverVariable, z);
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float use(androidx.constraintlayout.core.ArrayRow arrayRow, boolean z) {
        float f = get(arrayRow.getHighResolutionOutputSizeshNQ4ISI);
        remove(arrayRow.getHighResolutionOutputSizeshNQ4ISI, z);
        androidx.constraintlayout.core.SolverVariableValues solverVariableValues = (androidx.constraintlayout.core.SolverVariableValues) arrayRow.variables;
        int currentSize = solverVariableValues.getCurrentSize();
        int i = solverVariableValues.Camera2StreamConfigurationMap;
        int i2 = 0;
        int i3 = 0;
        while (i2 < currentSize) {
            if (solverVariableValues.getOutputMinFrameDuration[i3] != -1) {
                add(this.mCache.getHighSpeedVideoFpsRanges[solverVariableValues.getOutputMinFrameDuration[i3]], solverVariableValues.getHighSpeedVideoSizesFor[i3] * f, z);
                i2++;
            }
            i3++;
        }
        return f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void invert() {
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        int i2 = this.Camera2StreamConfigurationMap;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.getHighSpeedVideoSizesFor;
            fArr[i2] = fArr[i2] * (-1.0f);
            i2 = this.getHighSpeedVideoFpsRanges[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void divideByAmount(float f) {
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        int i2 = this.Camera2StreamConfigurationMap;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.getHighSpeedVideoSizesFor;
            fArr[i2] = fArr[i2] / f;
            i2 = this.getHighSpeedVideoFpsRanges[i2];
            if (i2 == -1) {
                return;
            }
        }
    }
}
