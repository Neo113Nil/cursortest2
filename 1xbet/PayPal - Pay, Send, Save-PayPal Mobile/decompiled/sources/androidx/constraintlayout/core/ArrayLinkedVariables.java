package androidx.constraintlayout.core;

/* loaded from: classes6.dex */
public class ArrayLinkedVariables implements androidx.constraintlayout.core.ArrayRow.ArrayRowVariables {
    private static float Camera2StreamConfigurationMap = 0.001f;
    private final androidx.constraintlayout.core.ArrayRow getOutputMinFrameDuration;
    protected final androidx.constraintlayout.core.Cache mCache;
    int getHighResolutionOutputSizeshNQ4ISI = 0;
    private int getOutputSizeshNQ4ISI = 8;
    private androidx.constraintlayout.core.SolverVariable getHighSpeedVideoSizesFor = null;
    private int[] getHighSpeedVideoFpsRangesFor = new int[8];
    private int[] getHighSpeedVideoFpsRanges = new int[8];
    private float[] getHighSpeedVideoSizes = new float[8];
    private int getOutputFormats = -1;
    private int getInputFormats = -1;
    private boolean getInputSizeshNQ4ISI = false;

    ArrayLinkedVariables(androidx.constraintlayout.core.ArrayRow arrayRow, androidx.constraintlayout.core.Cache cache) {
        this.getOutputMinFrameDuration = arrayRow;
        this.mCache = cache;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final void put(androidx.constraintlayout.core.SolverVariable solverVariable, float f) {
        if (f == 0.0f) {
            remove(solverVariable, true);
            return;
        }
        int i = this.getOutputFormats;
        if (i == -1) {
            this.getOutputFormats = 0;
            this.getHighSpeedVideoSizes[0] = f;
            this.getHighSpeedVideoFpsRangesFor[0] = solverVariable.id;
            this.getHighSpeedVideoFpsRanges[this.getOutputFormats] = -1;
            solverVariable.usageInRowCount++;
            solverVariable.addToRow(this.getOutputMinFrameDuration);
            this.getHighResolutionOutputSizeshNQ4ISI++;
            if (this.getInputSizeshNQ4ISI) {
                return;
            }
            int i2 = this.getInputFormats + 1;
            this.getInputFormats = i2;
            int[] iArr = this.getHighSpeedVideoFpsRangesFor;
            if (i2 >= iArr.length) {
                this.getInputSizeshNQ4ISI = true;
                this.getInputFormats = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.getHighResolutionOutputSizeshNQ4ISI; i4++) {
            if (this.getHighSpeedVideoFpsRangesFor[i] == solverVariable.id) {
                this.getHighSpeedVideoSizes[i] = f;
                return;
            }
            if (this.getHighSpeedVideoFpsRangesFor[i] < solverVariable.id) {
                i3 = i;
            }
            i = this.getHighSpeedVideoFpsRanges[i];
        }
        int i5 = this.getInputFormats;
        if (this.getInputSizeshNQ4ISI) {
            int[] iArr2 = this.getHighSpeedVideoFpsRangesFor;
            if (iArr2[i5] != -1) {
                i5 = iArr2.length;
            }
        } else {
            i5++;
        }
        int[] iArr3 = this.getHighSpeedVideoFpsRangesFor;
        if (i5 >= iArr3.length && this.getHighResolutionOutputSizeshNQ4ISI < iArr3.length) {
            int i6 = 0;
            while (true) {
                int[] iArr4 = this.getHighSpeedVideoFpsRangesFor;
                if (i6 >= iArr4.length) {
                    break;
                }
                if (iArr4[i6] == -1) {
                    i5 = i6;
                    break;
                }
                i6++;
            }
        }
        int[] iArr5 = this.getHighSpeedVideoFpsRangesFor;
        if (i5 >= iArr5.length) {
            i5 = iArr5.length;
            int i7 = this.getOutputSizeshNQ4ISI * 2;
            this.getOutputSizeshNQ4ISI = i7;
            this.getInputSizeshNQ4ISI = false;
            this.getInputFormats = i5 - 1;
            this.getHighSpeedVideoSizes = java.util.Arrays.copyOf(this.getHighSpeedVideoSizes, i7);
            this.getHighSpeedVideoFpsRangesFor = java.util.Arrays.copyOf(this.getHighSpeedVideoFpsRangesFor, this.getOutputSizeshNQ4ISI);
            this.getHighSpeedVideoFpsRanges = java.util.Arrays.copyOf(this.getHighSpeedVideoFpsRanges, this.getOutputSizeshNQ4ISI);
        }
        this.getHighSpeedVideoFpsRangesFor[i5] = solverVariable.id;
        this.getHighSpeedVideoSizes[i5] = f;
        if (i3 != -1) {
            int[] iArr6 = this.getHighSpeedVideoFpsRanges;
            iArr6[i5] = iArr6[i3];
            iArr6[i3] = i5;
        } else {
            this.getHighSpeedVideoFpsRanges[i5] = this.getOutputFormats;
            this.getOutputFormats = i5;
        }
        solverVariable.usageInRowCount++;
        solverVariable.addToRow(this.getOutputMinFrameDuration);
        int i8 = this.getHighResolutionOutputSizeshNQ4ISI + 1;
        this.getHighResolutionOutputSizeshNQ4ISI = i8;
        if (!this.getInputSizeshNQ4ISI) {
            this.getInputFormats++;
        }
        int[] iArr7 = this.getHighSpeedVideoFpsRangesFor;
        if (i8 >= iArr7.length) {
            this.getInputSizeshNQ4ISI = true;
        }
        if (this.getInputFormats >= iArr7.length) {
            this.getInputSizeshNQ4ISI = true;
            this.getInputFormats = iArr7.length - 1;
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void add(androidx.constraintlayout.core.SolverVariable solverVariable, float f, boolean z) {
        float f2 = Camera2StreamConfigurationMap;
        if (f <= (-f2) || f >= f2) {
            int i = this.getOutputFormats;
            if (i == -1) {
                this.getOutputFormats = 0;
                this.getHighSpeedVideoSizes[0] = f;
                this.getHighSpeedVideoFpsRangesFor[0] = solverVariable.id;
                this.getHighSpeedVideoFpsRanges[this.getOutputFormats] = -1;
                solverVariable.usageInRowCount++;
                solverVariable.addToRow(this.getOutputMinFrameDuration);
                this.getHighResolutionOutputSizeshNQ4ISI++;
                if (this.getInputSizeshNQ4ISI) {
                    return;
                }
                int i2 = this.getInputFormats + 1;
                this.getInputFormats = i2;
                int[] iArr = this.getHighSpeedVideoFpsRangesFor;
                if (i2 >= iArr.length) {
                    this.getInputSizeshNQ4ISI = true;
                    this.getInputFormats = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.getHighResolutionOutputSizeshNQ4ISI; i4++) {
                if (this.getHighSpeedVideoFpsRangesFor[i] == solverVariable.id) {
                    float[] fArr = this.getHighSpeedVideoSizes;
                    float f3 = fArr[i] + f;
                    float f4 = Camera2StreamConfigurationMap;
                    if (f3 > (-f4) && f3 < f4) {
                        f3 = 0.0f;
                    }
                    fArr[i] = f3;
                    if (f3 == 0.0f) {
                        if (i == this.getOutputFormats) {
                            this.getOutputFormats = this.getHighSpeedVideoFpsRanges[i];
                        } else {
                            int[] iArr2 = this.getHighSpeedVideoFpsRanges;
                            iArr2[i3] = iArr2[i];
                        }
                        if (z) {
                            solverVariable.removeFromRow(this.getOutputMinFrameDuration);
                        }
                        if (this.getInputSizeshNQ4ISI) {
                            this.getInputFormats = i;
                        }
                        solverVariable.usageInRowCount--;
                        this.getHighResolutionOutputSizeshNQ4ISI--;
                        return;
                    }
                    return;
                }
                if (this.getHighSpeedVideoFpsRangesFor[i] < solverVariable.id) {
                    i3 = i;
                }
                i = this.getHighSpeedVideoFpsRanges[i];
            }
            int i5 = this.getInputFormats;
            if (this.getInputSizeshNQ4ISI) {
                int[] iArr3 = this.getHighSpeedVideoFpsRangesFor;
                if (iArr3[i5] != -1) {
                    i5 = iArr3.length;
                }
            } else {
                i5++;
            }
            int[] iArr4 = this.getHighSpeedVideoFpsRangesFor;
            if (i5 >= iArr4.length && this.getHighResolutionOutputSizeshNQ4ISI < iArr4.length) {
                int i6 = 0;
                while (true) {
                    int[] iArr5 = this.getHighSpeedVideoFpsRangesFor;
                    if (i6 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i6] == -1) {
                        i5 = i6;
                        break;
                    }
                    i6++;
                }
            }
            int[] iArr6 = this.getHighSpeedVideoFpsRangesFor;
            if (i5 >= iArr6.length) {
                i5 = iArr6.length;
                int i7 = this.getOutputSizeshNQ4ISI * 2;
                this.getOutputSizeshNQ4ISI = i7;
                this.getInputSizeshNQ4ISI = false;
                this.getInputFormats = i5 - 1;
                this.getHighSpeedVideoSizes = java.util.Arrays.copyOf(this.getHighSpeedVideoSizes, i7);
                this.getHighSpeedVideoFpsRangesFor = java.util.Arrays.copyOf(this.getHighSpeedVideoFpsRangesFor, this.getOutputSizeshNQ4ISI);
                this.getHighSpeedVideoFpsRanges = java.util.Arrays.copyOf(this.getHighSpeedVideoFpsRanges, this.getOutputSizeshNQ4ISI);
            }
            this.getHighSpeedVideoFpsRangesFor[i5] = solverVariable.id;
            this.getHighSpeedVideoSizes[i5] = f;
            if (i3 != -1) {
                int[] iArr7 = this.getHighSpeedVideoFpsRanges;
                iArr7[i5] = iArr7[i3];
                iArr7[i3] = i5;
            } else {
                this.getHighSpeedVideoFpsRanges[i5] = this.getOutputFormats;
                this.getOutputFormats = i5;
            }
            solverVariable.usageInRowCount++;
            solverVariable.addToRow(this.getOutputMinFrameDuration);
            this.getHighResolutionOutputSizeshNQ4ISI++;
            if (!this.getInputSizeshNQ4ISI) {
                this.getInputFormats++;
            }
            int i8 = this.getInputFormats;
            int[] iArr8 = this.getHighSpeedVideoFpsRangesFor;
            if (i8 >= iArr8.length) {
                this.getInputSizeshNQ4ISI = true;
                this.getInputFormats = iArr8.length - 1;
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float use(androidx.constraintlayout.core.ArrayRow arrayRow, boolean z) {
        float f = get(arrayRow.getHighResolutionOutputSizeshNQ4ISI);
        remove(arrayRow.getHighResolutionOutputSizeshNQ4ISI, z);
        androidx.constraintlayout.core.ArrayRow.ArrayRowVariables arrayRowVariables = arrayRow.variables;
        int currentSize = arrayRowVariables.getCurrentSize();
        for (int i = 0; i < currentSize; i++) {
            androidx.constraintlayout.core.SolverVariable variable = arrayRowVariables.getVariable(i);
            add(variable, arrayRowVariables.get(variable) * f, z);
        }
        return f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final float remove(androidx.constraintlayout.core.SolverVariable solverVariable, boolean z) {
        if (this.getHighSpeedVideoSizesFor == solverVariable) {
            this.getHighSpeedVideoSizesFor = null;
        }
        int i = this.getOutputFormats;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.getHighResolutionOutputSizeshNQ4ISI) {
            if (this.getHighSpeedVideoFpsRangesFor[i] == solverVariable.id) {
                if (i == this.getOutputFormats) {
                    this.getOutputFormats = this.getHighSpeedVideoFpsRanges[i];
                } else {
                    int[] iArr = this.getHighSpeedVideoFpsRanges;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    solverVariable.removeFromRow(this.getOutputMinFrameDuration);
                }
                solverVariable.usageInRowCount--;
                this.getHighResolutionOutputSizeshNQ4ISI--;
                this.getHighSpeedVideoFpsRangesFor[i] = -1;
                if (this.getInputSizeshNQ4ISI) {
                    this.getInputFormats = i;
                }
                return this.getHighSpeedVideoSizes[i];
            }
            i2++;
            i3 = i;
            i = this.getHighSpeedVideoFpsRanges[i];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final void clear() {
        int i = this.getOutputFormats;
        for (int i2 = 0; i != -1 && i2 < this.getHighResolutionOutputSizeshNQ4ISI; i2++) {
            androidx.constraintlayout.core.SolverVariable solverVariable = this.mCache.getHighSpeedVideoFpsRanges[this.getHighSpeedVideoFpsRangesFor[i]];
            if (solverVariable != null) {
                solverVariable.removeFromRow(this.getOutputMinFrameDuration);
            }
            i = this.getHighSpeedVideoFpsRanges[i];
        }
        this.getOutputFormats = -1;
        this.getInputFormats = -1;
        this.getInputSizeshNQ4ISI = false;
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public boolean contains(androidx.constraintlayout.core.SolverVariable solverVariable) {
        int i = this.getOutputFormats;
        if (i == -1) {
            return false;
        }
        for (int i2 = 0; i != -1 && i2 < this.getHighResolutionOutputSizeshNQ4ISI; i2++) {
            if (this.getHighSpeedVideoFpsRangesFor[i] == solverVariable.id) {
                return true;
            }
            i = this.getHighSpeedVideoFpsRanges[i];
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int indexOf(androidx.constraintlayout.core.SolverVariable solverVariable) {
        int i = this.getOutputFormats;
        if (i == -1) {
            return -1;
        }
        for (int i2 = 0; i != -1 && i2 < this.getHighResolutionOutputSizeshNQ4ISI; i2++) {
            if (this.getHighSpeedVideoFpsRangesFor[i] == solverVariable.id) {
                return i;
            }
            i = this.getHighSpeedVideoFpsRanges[i];
        }
        return -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void invert() {
        int i = this.getOutputFormats;
        for (int i2 = 0; i != -1 && i2 < this.getHighResolutionOutputSizeshNQ4ISI; i2++) {
            float[] fArr = this.getHighSpeedVideoSizes;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.getHighSpeedVideoFpsRanges[i];
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void divideByAmount(float f) {
        int i = this.getOutputFormats;
        for (int i2 = 0; i != -1 && i2 < this.getHighResolutionOutputSizeshNQ4ISI; i2++) {
            float[] fArr = this.getHighSpeedVideoSizes;
            fArr[i] = fArr[i] / f;
            i = this.getHighSpeedVideoFpsRanges[i];
        }
    }

    public int getHead() {
        return this.getOutputFormats;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int getCurrentSize() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final int getId(int i) {
        return this.getHighSpeedVideoFpsRangesFor[i];
    }

    public final float getValue(int i) {
        return this.getHighSpeedVideoSizes[i];
    }

    public final int getNextIndice(int i) {
        return this.getHighSpeedVideoFpsRanges[i];
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public androidx.constraintlayout.core.SolverVariable getVariable(int i) {
        int i2 = this.getOutputFormats;
        for (int i3 = 0; i2 != -1 && i3 < this.getHighResolutionOutputSizeshNQ4ISI; i3++) {
            if (i3 == i) {
                return this.mCache.getHighSpeedVideoFpsRanges[this.getHighSpeedVideoFpsRangesFor[i2]];
            }
            i2 = this.getHighSpeedVideoFpsRanges[i2];
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float getVariableValue(int i) {
        int i2 = this.getOutputFormats;
        for (int i3 = 0; i2 != -1 && i3 < this.getHighResolutionOutputSizeshNQ4ISI; i3++) {
            if (i3 == i) {
                return this.getHighSpeedVideoSizes[i2];
            }
            i2 = this.getHighSpeedVideoFpsRanges[i2];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final float get(androidx.constraintlayout.core.SolverVariable solverVariable) {
        int i = this.getOutputFormats;
        for (int i2 = 0; i != -1 && i2 < this.getHighResolutionOutputSizeshNQ4ISI; i2++) {
            if (this.getHighSpeedVideoFpsRangesFor[i] == solverVariable.id) {
                return this.getHighSpeedVideoSizes[i];
            }
            i = this.getHighSpeedVideoFpsRanges[i];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int sizeInBytes() {
        return (this.getHighSpeedVideoFpsRangesFor.length * 12) + 36;
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
        int i = this.getOutputFormats;
        java.lang.String str = "";
        for (int i2 = 0; i != -1 && i2 < this.getHighResolutionOutputSizeshNQ4ISI; i2++) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(" -> ");
            java.lang.String obj = sb.toString();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(obj);
            sb2.append(this.getHighSpeedVideoSizes[i]);
            sb2.append(" : ");
            java.lang.String obj2 = sb2.toString();
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(obj2);
            sb3.append(this.mCache.getHighSpeedVideoFpsRanges[this.getHighSpeedVideoFpsRangesFor[i]]);
            str = sb3.toString();
            i = this.getHighSpeedVideoFpsRanges[i];
        }
        return str;
    }
}
