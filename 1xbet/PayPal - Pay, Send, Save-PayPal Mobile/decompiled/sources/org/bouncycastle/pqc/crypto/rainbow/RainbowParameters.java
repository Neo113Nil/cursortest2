package org.bouncycastle.pqc.crypto.rainbow;

/* loaded from: classes17.dex */
public class RainbowParameters implements org.bouncycastle.crypto.CipherParameters {
    private int[] Camera2StreamConfigurationMap;
    private final int[] getHighResolutionOutputSizeshNQ4ISI;

    public RainbowParameters(int[] iArr) {
        int[] iArr2;
        int i;
        this.getHighResolutionOutputSizeshNQ4ISI = new int[]{6, 12, 17, 22, 33};
        this.Camera2StreamConfigurationMap = iArr;
        if (iArr == null) {
            throw new java.lang.IllegalArgumentException("no layers defined.");
        }
        if (iArr.length <= 1) {
            throw new java.lang.IllegalArgumentException("Rainbow needs at least 1 layer, such that v1 < v2.");
        }
        int i2 = 0;
        do {
            iArr2 = this.Camera2StreamConfigurationMap;
            if (i2 >= iArr2.length - 1) {
                return;
            }
            i = iArr2[i2];
            i2++;
        } while (i < iArr2[i2]);
        throw new java.lang.IllegalArgumentException("v[i] has to be smaller than v[i+1]");
    }

    public int[] getVi() {
        return this.Camera2StreamConfigurationMap;
    }

    public int getNumOfLayers() {
        return this.Camera2StreamConfigurationMap.length - 1;
    }

    public int getDocLength() {
        int[] iArr = this.Camera2StreamConfigurationMap;
        return iArr[iArr.length - 1] - iArr[0];
    }

    public RainbowParameters() {
        int[] iArr = {6, 12, 17, 22, 33};
        this.getHighResolutionOutputSizeshNQ4ISI = iArr;
        this.Camera2StreamConfigurationMap = iArr;
    }
}
