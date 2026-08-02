package androidx.constraintlayout.core;

/* loaded from: classes6.dex */
public class SolverVariable implements java.lang.Comparable<androidx.constraintlayout.core.SolverVariable> {
    public static final int STRENGTH_BARRIER = 6;
    public static final int STRENGTH_CENTERING = 7;
    public static final int STRENGTH_EQUALITY = 5;
    public static final int STRENGTH_FIXED = 8;
    public static final int STRENGTH_HIGH = 3;
    public static final int STRENGTH_HIGHEST = 4;
    public static final int STRENGTH_LOW = 1;
    public static final int STRENGTH_MEDIUM = 2;
    public static final int STRENGTH_NONE = 0;
    private static int getOutputSizeshNQ4ISI = 1;
    float[] Camera2StreamConfigurationMap;
    public float computedValue;
    androidx.constraintlayout.core.ArrayRow[] getHighResolutionOutputSizeshNQ4ISI;
    java.util.HashSet<androidx.constraintlayout.core.ArrayRow> getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    float getInputFormats;
    float[] getInputSizeshNQ4ISI;
    androidx.constraintlayout.core.SolverVariable.Type getOutputFormats;
    boolean getOutputMinFrameDuration;
    private java.lang.String getOutputStallDurationlomOqCM;
    public int id;
    public boolean inGoal;
    public boolean isFinalValue;
    public int strength;
    public int usageInRowCount;

    public enum Type {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    static void getHighSpeedVideoSizes() {
        getOutputSizeshNQ4ISI++;
    }

    public SolverVariable(java.lang.String str, androidx.constraintlayout.core.SolverVariable.Type type) {
        this.id = -1;
        this.getHighSpeedVideoSizes = -1;
        this.strength = 0;
        this.isFinalValue = false;
        this.getInputSizeshNQ4ISI = new float[9];
        this.Camera2StreamConfigurationMap = new float[9];
        this.getHighResolutionOutputSizeshNQ4ISI = new androidx.constraintlayout.core.ArrayRow[16];
        this.getHighSpeedVideoFpsRangesFor = 0;
        this.usageInRowCount = 0;
        this.getOutputMinFrameDuration = false;
        this.getHighSpeedVideoSizesFor = -1;
        this.getInputFormats = 0.0f;
        this.getHighSpeedVideoFpsRanges = null;
        this.getOutputStallDurationlomOqCM = str;
        this.getOutputFormats = type;
    }

    public SolverVariable(androidx.constraintlayout.core.SolverVariable.Type type, java.lang.String str) {
        this.id = -1;
        this.getHighSpeedVideoSizes = -1;
        this.strength = 0;
        this.isFinalValue = false;
        this.getInputSizeshNQ4ISI = new float[9];
        this.Camera2StreamConfigurationMap = new float[9];
        this.getHighResolutionOutputSizeshNQ4ISI = new androidx.constraintlayout.core.ArrayRow[16];
        this.getHighSpeedVideoFpsRangesFor = 0;
        this.usageInRowCount = 0;
        this.getOutputMinFrameDuration = false;
        this.getHighSpeedVideoSizesFor = -1;
        this.getInputFormats = 0.0f;
        this.getHighSpeedVideoFpsRanges = null;
        this.getOutputFormats = type;
    }

    public final void addToRow(androidx.constraintlayout.core.ArrayRow arrayRow) {
        int i = 0;
        while (true) {
            int i2 = this.getHighSpeedVideoFpsRangesFor;
            if (i < i2) {
                if (this.getHighResolutionOutputSizeshNQ4ISI[i] == arrayRow) {
                    return;
                } else {
                    i++;
                }
            } else {
                androidx.constraintlayout.core.ArrayRow[] arrayRowArr = this.getHighResolutionOutputSizeshNQ4ISI;
                if (i2 >= arrayRowArr.length) {
                    this.getHighResolutionOutputSizeshNQ4ISI = (androidx.constraintlayout.core.ArrayRow[]) java.util.Arrays.copyOf(arrayRowArr, arrayRowArr.length * 2);
                }
                androidx.constraintlayout.core.ArrayRow[] arrayRowArr2 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i3 = this.getHighSpeedVideoFpsRangesFor;
                arrayRowArr2[i3] = arrayRow;
                this.getHighSpeedVideoFpsRangesFor = i3 + 1;
                return;
            }
        }
    }

    public final void removeFromRow(androidx.constraintlayout.core.ArrayRow arrayRow) {
        int i = this.getHighSpeedVideoFpsRangesFor;
        int i2 = 0;
        while (i2 < i) {
            if (this.getHighResolutionOutputSizeshNQ4ISI[i2] == arrayRow) {
                while (i2 < i - 1) {
                    androidx.constraintlayout.core.ArrayRow[] arrayRowArr = this.getHighResolutionOutputSizeshNQ4ISI;
                    int i3 = i2 + 1;
                    arrayRowArr[i2] = arrayRowArr[i3];
                    i2 = i3;
                }
                this.getHighSpeedVideoFpsRangesFor--;
                return;
            }
            i2++;
        }
    }

    public final void updateReferencesWithNewDefinition(androidx.constraintlayout.core.LinearSystem linearSystem, androidx.constraintlayout.core.ArrayRow arrayRow) {
        int i = this.getHighSpeedVideoFpsRangesFor;
        for (int i2 = 0; i2 < i; i2++) {
            this.getHighResolutionOutputSizeshNQ4ISI[i2].updateFromRow(linearSystem, arrayRow, false);
        }
        this.getHighSpeedVideoFpsRangesFor = 0;
    }

    public void setFinalValue(androidx.constraintlayout.core.LinearSystem linearSystem, float f) {
        this.computedValue = f;
        this.isFinalValue = true;
        this.getOutputMinFrameDuration = false;
        this.getHighSpeedVideoSizesFor = -1;
        this.getInputFormats = 0.0f;
        int i = this.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoSizes = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.getHighResolutionOutputSizeshNQ4ISI[i2].updateFromFinalVariable(linearSystem, this, false);
        }
        this.getHighSpeedVideoFpsRangesFor = 0;
    }

    public void setSynonym(androidx.constraintlayout.core.LinearSystem linearSystem, androidx.constraintlayout.core.SolverVariable solverVariable, float f) {
        this.getOutputMinFrameDuration = true;
        this.getHighSpeedVideoSizesFor = solverVariable.id;
        this.getInputFormats = f;
        int i = this.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoSizes = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.getHighResolutionOutputSizeshNQ4ISI[i2].updateFromSynonymVariable(linearSystem, this, false);
        }
        this.getHighSpeedVideoFpsRangesFor = 0;
        linearSystem.displayReadableRows();
    }

    public void reset() {
        this.getOutputStallDurationlomOqCM = null;
        this.getOutputFormats = androidx.constraintlayout.core.SolverVariable.Type.UNKNOWN;
        this.strength = 0;
        this.id = -1;
        this.getHighSpeedVideoSizes = -1;
        this.computedValue = 0.0f;
        this.isFinalValue = false;
        this.getOutputMinFrameDuration = false;
        this.getHighSpeedVideoSizesFor = -1;
        this.getInputFormats = 0.0f;
        int i = this.getHighSpeedVideoFpsRangesFor;
        for (int i2 = 0; i2 < i; i2++) {
            this.getHighResolutionOutputSizeshNQ4ISI[i2] = null;
        }
        this.getHighSpeedVideoFpsRangesFor = 0;
        this.usageInRowCount = 0;
        this.inGoal = false;
        java.util.Arrays.fill(this.Camera2StreamConfigurationMap, 0.0f);
    }

    public java.lang.String getName() {
        return this.getOutputStallDurationlomOqCM;
    }

    public void setName(java.lang.String str) {
        this.getOutputStallDurationlomOqCM = str;
    }

    public void setType(androidx.constraintlayout.core.SolverVariable.Type type, java.lang.String str) {
        this.getOutputFormats = type;
    }

    @Override // java.lang.Comparable
    public int compareTo(androidx.constraintlayout.core.SolverVariable solverVariable) {
        return this.id - solverVariable.id;
    }

    public java.lang.String toString() {
        if (this.getOutputStallDurationlomOqCM != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("");
            sb.append(this.getOutputStallDurationlomOqCM);
            return sb.toString();
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("");
        sb2.append(this.id);
        return sb2.toString();
    }
}
