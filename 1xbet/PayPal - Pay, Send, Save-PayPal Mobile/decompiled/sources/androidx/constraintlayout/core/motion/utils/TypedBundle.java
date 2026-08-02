package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes6.dex */
public class TypedBundle {
    int[] getInputSizeshNQ4ISI = new int[10];
    int[] getOutputStallDurationlomOqCM = new int[10];
    int Camera2StreamConfigurationMap = 0;
    int[] getInputFormats = new int[10];
    float[] getOutputFormats = new float[10];
    int getHighSpeedVideoSizes = 0;
    int[] getHighSpeedVideoSizesFor = new int[5];
    java.lang.String[] getOutputMinFrameDurationlomOqCM = new java.lang.String[5];
    int getHighSpeedVideoFpsRanges = 0;
    int[] getHighSpeedVideoFpsRangesFor = new int[4];
    boolean[] getOutputMinFrameDuration = new boolean[4];
    int getHighResolutionOutputSizeshNQ4ISI = 0;

    public int getInteger(int i) {
        for (int i2 = 0; i2 < this.Camera2StreamConfigurationMap; i2++) {
            if (this.getInputSizeshNQ4ISI[i2] == i) {
                return this.getOutputStallDurationlomOqCM[i2];
            }
        }
        return -1;
    }

    public void add(int i, int i2) {
        int i3 = this.Camera2StreamConfigurationMap;
        int[] iArr = this.getInputSizeshNQ4ISI;
        if (i3 >= iArr.length) {
            this.getInputSizeshNQ4ISI = java.util.Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.getOutputStallDurationlomOqCM;
            this.getOutputStallDurationlomOqCM = java.util.Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.getInputSizeshNQ4ISI;
        int i4 = this.Camera2StreamConfigurationMap;
        iArr3[i4] = i;
        int[] iArr4 = this.getOutputStallDurationlomOqCM;
        this.Camera2StreamConfigurationMap = i4 + 1;
        iArr4[i4] = i2;
    }

    public void add(int i, float f) {
        int i2 = this.getHighSpeedVideoSizes;
        int[] iArr = this.getInputFormats;
        if (i2 >= iArr.length) {
            this.getInputFormats = java.util.Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.getOutputFormats;
            this.getOutputFormats = java.util.Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.getInputFormats;
        int i3 = this.getHighSpeedVideoSizes;
        iArr2[i3] = i;
        float[] fArr2 = this.getOutputFormats;
        this.getHighSpeedVideoSizes = i3 + 1;
        fArr2[i3] = f;
    }

    public void addIfNotNull(int i, java.lang.String str) {
        if (str != null) {
            add(i, str);
        }
    }

    public void add(int i, java.lang.String str) {
        int i2 = this.getHighSpeedVideoFpsRanges;
        int[] iArr = this.getHighSpeedVideoSizesFor;
        if (i2 >= iArr.length) {
            this.getHighSpeedVideoSizesFor = java.util.Arrays.copyOf(iArr, iArr.length * 2);
            java.lang.String[] strArr = this.getOutputMinFrameDurationlomOqCM;
            this.getOutputMinFrameDurationlomOqCM = (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.getHighSpeedVideoSizesFor;
        int i3 = this.getHighSpeedVideoFpsRanges;
        iArr2[i3] = i;
        java.lang.String[] strArr2 = this.getOutputMinFrameDurationlomOqCM;
        this.getHighSpeedVideoFpsRanges = i3 + 1;
        strArr2[i3] = str;
    }

    public void add(int i, boolean z) {
        int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
        int[] iArr = this.getHighSpeedVideoFpsRangesFor;
        if (i2 >= iArr.length) {
            this.getHighSpeedVideoFpsRangesFor = java.util.Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = java.util.Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.getHighSpeedVideoFpsRangesFor;
        int i3 = this.getHighResolutionOutputSizeshNQ4ISI;
        iArr2[i3] = i;
        boolean[] zArr2 = this.getOutputMinFrameDuration;
        this.getHighResolutionOutputSizeshNQ4ISI = i3 + 1;
        zArr2[i3] = z;
    }

    public void applyDelta(androidx.constraintlayout.core.motion.utils.TypedValues typedValues) {
        for (int i = 0; i < this.Camera2StreamConfigurationMap; i++) {
            typedValues.setValue(this.getInputSizeshNQ4ISI[i], this.getOutputStallDurationlomOqCM[i]);
        }
        for (int i2 = 0; i2 < this.getHighSpeedVideoSizes; i2++) {
            typedValues.setValue(this.getInputFormats[i2], this.getOutputFormats[i2]);
        }
        for (int i3 = 0; i3 < this.getHighSpeedVideoFpsRanges; i3++) {
            typedValues.setValue(this.getHighSpeedVideoSizesFor[i3], this.getOutputMinFrameDurationlomOqCM[i3]);
        }
        for (int i4 = 0; i4 < this.getHighResolutionOutputSizeshNQ4ISI; i4++) {
            typedValues.setValue(this.getHighSpeedVideoFpsRangesFor[i4], this.getOutputMinFrameDuration[i4]);
        }
    }

    public void applyDelta(androidx.constraintlayout.core.motion.utils.TypedBundle typedBundle) {
        for (int i = 0; i < this.Camera2StreamConfigurationMap; i++) {
            typedBundle.add(this.getInputSizeshNQ4ISI[i], this.getOutputStallDurationlomOqCM[i]);
        }
        for (int i2 = 0; i2 < this.getHighSpeedVideoSizes; i2++) {
            typedBundle.add(this.getInputFormats[i2], this.getOutputFormats[i2]);
        }
        for (int i3 = 0; i3 < this.getHighSpeedVideoFpsRanges; i3++) {
            typedBundle.add(this.getHighSpeedVideoSizesFor[i3], this.getOutputMinFrameDurationlomOqCM[i3]);
        }
        for (int i4 = 0; i4 < this.getHighResolutionOutputSizeshNQ4ISI; i4++) {
            typedBundle.add(this.getHighSpeedVideoFpsRangesFor[i4], this.getOutputMinFrameDuration[i4]);
        }
    }

    public void clear() {
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
        this.getHighSpeedVideoFpsRanges = 0;
        this.getHighSpeedVideoSizes = 0;
        this.Camera2StreamConfigurationMap = 0;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TypedBundle{mCountInt=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", mCountFloat=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", mCountString=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", mCountBoolean=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}
