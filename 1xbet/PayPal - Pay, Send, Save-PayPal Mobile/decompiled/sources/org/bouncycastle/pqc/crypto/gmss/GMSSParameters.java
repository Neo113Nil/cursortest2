package org.bouncycastle.pqc.crypto.gmss;

/* loaded from: classes17.dex */
public class GMSSParameters {
    private int[] Camera2StreamConfigurationMap;
    private int[] getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private int[] getHighSpeedVideoFpsRangesFor;

    public int[] getWinternitzParameter() {
        return org.bouncycastle.util.Arrays.clone(this.Camera2StreamConfigurationMap);
    }

    public int getNumOfLayers() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public int[] getK() {
        return org.bouncycastle.util.Arrays.clone(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public int[] getHeightOfTrees() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoFpsRangesFor);
    }

    private void Camera2StreamConfigurationMap(int i, int[] iArr, int[] iArr2, int[] iArr3) throws java.lang.IllegalArgumentException {
        java.lang.String str;
        boolean z;
        this.getHighSpeedVideoFpsRanges = i;
        if (i == iArr2.length && i == iArr.length && i == iArr3.length) {
            z = true;
            str = "";
        } else {
            str = "Unexpected parameterset format";
            z = false;
        }
        for (int i2 = 0; i2 < this.getHighSpeedVideoFpsRanges; i2++) {
            int i3 = iArr3[i2];
            if (i3 < 2 || (iArr[i2] - i3) % 2 != 0) {
                str = "Wrong parameter K (K >= 2 and H-K even required)!";
                z = false;
            }
            if (iArr[i2] < 4 || iArr2[i2] < 2) {
                str = "Wrong parameter H or w (H > 3 and w > 1 required)!";
                z = false;
            }
        }
        if (!z) {
            throw new java.lang.IllegalArgumentException(str);
        }
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.util.Arrays.clone(iArr);
        this.Camera2StreamConfigurationMap = org.bouncycastle.util.Arrays.clone(iArr2);
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.util.Arrays.clone(iArr3);
    }

    public GMSSParameters(int i, int[] iArr, int[] iArr2, int[] iArr3) throws java.lang.IllegalArgumentException {
        Camera2StreamConfigurationMap(i, iArr, iArr2, iArr3);
    }

    public GMSSParameters(int i) throws java.lang.IllegalArgumentException {
        if (i <= 10) {
            Camera2StreamConfigurationMap(1, new int[]{10}, new int[]{3}, new int[]{2});
        } else if (i <= 20) {
            Camera2StreamConfigurationMap(2, new int[]{10, 10}, new int[]{5, 4}, new int[]{2, 2});
        } else {
            Camera2StreamConfigurationMap(4, new int[]{10, 10, 10, 10}, new int[]{9, 9, 9, 3}, new int[]{2, 2, 2, 2});
        }
    }
}
