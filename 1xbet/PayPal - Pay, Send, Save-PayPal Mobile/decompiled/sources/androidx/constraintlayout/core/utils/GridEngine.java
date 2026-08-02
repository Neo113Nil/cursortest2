package androidx.constraintlayout.core.utils;

/* loaded from: classes7.dex */
public class GridEngine {
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;
    private int Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private int[][] getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes = 0;
    private boolean[][] getHighSpeedVideoSizesFor;
    private int getInputFormats;
    private int getInputSizeshNQ4ISI;
    private java.lang.String getOutputFormats;
    private int getOutputMinFrameDuration;
    private java.lang.String getOutputStallDurationlomOqCM;

    public GridEngine() {
    }

    public GridEngine(int i, int i2) {
        this.getOutputMinFrameDuration = i;
        this.getHighSpeedVideoFpsRanges = i2;
        if (i > 50) {
            this.getOutputMinFrameDuration = 3;
        }
        if (i2 > 50) {
            this.getHighSpeedVideoFpsRanges = 3;
        }
        Camera2StreamConfigurationMap();
        getHighResolutionOutputSizeshNQ4ISI();
    }

    public GridEngine(int i, int i2, int i3) {
        this.getOutputMinFrameDuration = i;
        this.getHighSpeedVideoFpsRanges = i2;
        this.Camera2StreamConfigurationMap = i3;
        if (i > 50) {
            this.getOutputMinFrameDuration = 3;
        }
        if (i2 > 50) {
            this.getHighSpeedVideoFpsRanges = 3;
        }
        Camera2StreamConfigurationMap();
        int i4 = this.getInputSizeshNQ4ISI * this.getHighResolutionOutputSizeshNQ4ISI;
        if (i3 > i4 || i3 <= 0) {
            this.Camera2StreamConfigurationMap = i4;
        }
        getHighResolutionOutputSizeshNQ4ISI();
        getHighResolutionOutputSizeshNQ4ISI(false);
    }

    private void getHighResolutionOutputSizeshNQ4ISI() {
        boolean[][] zArr = (boolean[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Boolean.TYPE, this.getInputSizeshNQ4ISI, this.getHighResolutionOutputSizeshNQ4ISI);
        this.getHighSpeedVideoSizesFor = zArr;
        for (boolean[] zArr2 : zArr) {
            java.util.Arrays.fill(zArr2, true);
        }
        int i = this.Camera2StreamConfigurationMap;
        if (i > 0) {
            int[][] iArr = (int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Integer.TYPE, i, 4);
            this.getHighSpeedVideoFpsRangesFor = iArr;
            for (int[] iArr2 : iArr) {
                java.util.Arrays.fill(iArr2, -1);
            }
        }
    }

    private static int[][] getHighSpeedVideoSizes(java.lang.String str) {
        if (str == null) {
            return null;
        }
        java.lang.String[] split = str.split(",");
        int[][] iArr = (int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Integer.TYPE, split.length, 3);
        for (int i = 0; i < split.length; i++) {
            java.lang.String[] split2 = split[i].trim().split(io.ktor.sse.ServerSentEventKt.COLON);
            java.lang.String[] split3 = split2[1].split("x");
            iArr[i][0] = java.lang.Integer.parseInt(split2[0]);
            iArr[i][1] = java.lang.Integer.parseInt(split3[0]);
            iArr[i][2] = java.lang.Integer.parseInt(split3[1]);
        }
        return iArr;
    }

    private void getHighResolutionOutputSizeshNQ4ISI(boolean z) {
        int[][] highSpeedVideoSizes;
        int[][] highSpeedVideoSizes2;
        if (z) {
            for (int i = 0; i < this.getHighSpeedVideoSizesFor.length; i++) {
                int i2 = 0;
                while (true) {
                    boolean[][] zArr = this.getHighSpeedVideoSizesFor;
                    if (i2 < zArr[0].length) {
                        zArr[i][i2] = true;
                        i2++;
                    }
                }
            }
            for (int i3 = 0; i3 < this.getHighSpeedVideoFpsRangesFor.length; i3++) {
                int i4 = 0;
                while (true) {
                    int[][] iArr = this.getHighSpeedVideoFpsRangesFor;
                    if (i4 < iArr[0].length) {
                        iArr[i3][i4] = -1;
                        i4++;
                    }
                }
            }
        }
        this.getHighSpeedVideoSizes = 0;
        java.lang.String str = this.getOutputFormats;
        if (str != null && !str.trim().isEmpty() && (highSpeedVideoSizes2 = getHighSpeedVideoSizes(this.getOutputFormats)) != null) {
            Camera2StreamConfigurationMap(highSpeedVideoSizes2);
        }
        java.lang.String str2 = this.getOutputStallDurationlomOqCM;
        if (str2 != null && !str2.trim().isEmpty() && (highSpeedVideoSizes = getHighSpeedVideoSizes(this.getOutputStallDurationlomOqCM)) != null) {
            getHighSpeedVideoFpsRanges(highSpeedVideoSizes);
        }
        getHighSpeedVideoFpsRanges();
    }

    private void getHighSpeedVideoSizes(int i, int i2, int i3, int i4, int i5) {
        int[] iArr = this.getHighSpeedVideoFpsRangesFor[i];
        iArr[0] = i3;
        iArr[1] = i2;
        iArr[2] = (i3 + i5) - 1;
        iArr[3] = (i2 + i4) - 1;
    }

    private void getHighSpeedVideoFpsRanges(int[][] iArr) {
        int i;
        int i2;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            int[] iArr2 = iArr[i3];
            int i4 = iArr2[0];
            int i5 = this.getInputFormats;
            if (i5 == 1) {
                i = i4 % this.getInputSizeshNQ4ISI;
            } else {
                i = i4 / this.getHighResolutionOutputSizeshNQ4ISI;
            }
            if (i5 == 1) {
                i2 = i4 / this.getInputSizeshNQ4ISI;
            } else {
                i2 = i4 % this.getHighResolutionOutputSizeshNQ4ISI;
            }
            int i6 = i2;
            if (!Camera2StreamConfigurationMap(i, i6, iArr2[1], iArr2[2])) {
                return;
            }
            int[] iArr3 = iArr[i3];
            getHighSpeedVideoSizes(i3, i, i6, iArr3[1], iArr3[2]);
        }
    }

    private void Camera2StreamConfigurationMap(int[][] iArr) {
        int i;
        int i2;
        for (int[] iArr2 : iArr) {
            int i3 = iArr2[0];
            int i4 = this.getInputFormats;
            if (i4 == 1) {
                i = i3 % this.getInputSizeshNQ4ISI;
            } else {
                i = i3 / this.getHighResolutionOutputSizeshNQ4ISI;
            }
            if (i4 == 1) {
                i2 = i3 / this.getInputSizeshNQ4ISI;
            } else {
                i2 = i3 % this.getHighResolutionOutputSizeshNQ4ISI;
            }
            if (!Camera2StreamConfigurationMap(i, i2, iArr2[1], iArr2[2])) {
                return;
            }
        }
    }

    private boolean Camera2StreamConfigurationMap(int i, int i2, int i3, int i4) {
        for (int i5 = i; i5 < i + i3; i5++) {
            for (int i6 = i2; i6 < i2 + i4; i6++) {
                boolean[][] zArr = this.getHighSpeedVideoSizesFor;
                if (i5 < zArr.length && i6 < zArr[0].length) {
                    boolean[] zArr2 = zArr[i5];
                    if (zArr2[i6]) {
                        zArr2[i6] = false;
                    }
                }
                return false;
            }
        }
        return true;
    }

    private void getHighSpeedVideoFpsRanges() {
        int i;
        int i2;
        int i3;
        int i4;
        for (int i5 = 0; i5 < this.Camera2StreamConfigurationMap; i5++) {
            if (leftOfWidget(i5) == -1) {
                boolean z = false;
                int i6 = 0;
                while (true) {
                    if (z) {
                        break;
                    }
                    i6 = this.getHighSpeedVideoSizes;
                    int i7 = this.getInputSizeshNQ4ISI;
                    int i8 = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (i6 >= i7 * i8) {
                        i6 = -1;
                        break;
                    }
                    int i9 = this.getInputFormats;
                    if (i9 == 1) {
                        i3 = i6 % i7;
                    } else {
                        i3 = i6 / i8;
                    }
                    if (i9 == 1) {
                        i4 = i6 / i7;
                    } else {
                        i4 = i6 % i8;
                    }
                    boolean[] zArr = this.getHighSpeedVideoSizesFor[i3];
                    if (zArr[i4]) {
                        zArr[i4] = false;
                        z = true;
                    }
                    this.getHighSpeedVideoSizes = i6 + 1;
                }
                int i10 = this.getInputFormats;
                if (i10 == 1) {
                    i = i6 % this.getInputSizeshNQ4ISI;
                } else {
                    i = i6 / this.getHighResolutionOutputSizeshNQ4ISI;
                }
                if (i10 == 1) {
                    i2 = i6 / this.getInputSizeshNQ4ISI;
                } else {
                    i2 = i6 % this.getHighResolutionOutputSizeshNQ4ISI;
                }
                int i11 = i2;
                if (i6 == -1) {
                    return;
                } else {
                    getHighSpeedVideoSizes(i5, i, i11, 1, 1);
                }
            }
        }
    }

    private void Camera2StreamConfigurationMap() {
        int i;
        int i2 = this.getOutputMinFrameDuration;
        if (i2 == 0 || (i = this.getHighSpeedVideoFpsRanges) == 0) {
            int i3 = this.getHighSpeedVideoFpsRanges;
            if (i3 > 0) {
                this.getHighResolutionOutputSizeshNQ4ISI = i3;
                this.getInputSizeshNQ4ISI = ((this.Camera2StreamConfigurationMap + i3) - 1) / i3;
                return;
            } else if (i2 > 0) {
                this.getInputSizeshNQ4ISI = i2;
                this.getHighResolutionOutputSizeshNQ4ISI = ((this.Camera2StreamConfigurationMap + i2) - 1) / i2;
                return;
            } else {
                int sqrt = (int) (java.lang.Math.sqrt(this.Camera2StreamConfigurationMap) + 1.5d);
                this.getInputSizeshNQ4ISI = sqrt;
                this.getHighResolutionOutputSizeshNQ4ISI = ((this.Camera2StreamConfigurationMap + sqrt) - 1) / sqrt;
                return;
            }
        }
        this.getInputSizeshNQ4ISI = i2;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    public void setup() {
        boolean[][] zArr;
        int[][] iArr = this.getHighSpeedVideoFpsRangesFor;
        boolean z = false;
        if (iArr != null && iArr.length == this.Camera2StreamConfigurationMap && (zArr = this.getHighSpeedVideoSizesFor) != null && zArr.length == this.getInputSizeshNQ4ISI && zArr[0].length == this.getHighResolutionOutputSizeshNQ4ISI) {
            z = true;
        }
        if (!z) {
            getHighResolutionOutputSizeshNQ4ISI();
        }
        getHighResolutionOutputSizeshNQ4ISI(z);
    }

    public void setSpans(java.lang.CharSequence charSequence) {
        java.lang.String str = this.getOutputStallDurationlomOqCM;
        if (str == null || !str.equals(charSequence.toString())) {
            this.getOutputStallDurationlomOqCM = charSequence.toString();
        }
    }

    public void setSkips(java.lang.String str) {
        java.lang.String str2 = this.getOutputFormats;
        if (str2 == null || !str2.equals(str)) {
            this.getOutputFormats = str;
        }
    }

    public void setOrientation(int i) {
        if ((i == 0 || i == 1) && this.getInputFormats != i) {
            this.getInputFormats = i;
        }
    }

    public void setNumWidgets(int i) {
        if (i > this.getInputSizeshNQ4ISI * this.getHighResolutionOutputSizeshNQ4ISI) {
            return;
        }
        this.Camera2StreamConfigurationMap = i;
    }

    public void setRows(int i) {
        if (i > 50 || this.getOutputMinFrameDuration == i) {
            return;
        }
        this.getOutputMinFrameDuration = i;
        Camera2StreamConfigurationMap();
    }

    public void setColumns(int i) {
        if (i > 50 || this.getHighSpeedVideoFpsRanges == i) {
            return;
        }
        this.getHighSpeedVideoFpsRanges = i;
        Camera2StreamConfigurationMap();
    }

    public int leftOfWidget(int i) {
        int[][] iArr = this.getHighSpeedVideoFpsRangesFor;
        if (iArr == null || i >= iArr.length) {
            return 0;
        }
        return iArr[i][0];
    }

    public int topOfWidget(int i) {
        int[][] iArr = this.getHighSpeedVideoFpsRangesFor;
        if (iArr == null || i >= iArr.length) {
            return 0;
        }
        return iArr[i][1];
    }

    public int rightOfWidget(int i) {
        int[][] iArr = this.getHighSpeedVideoFpsRangesFor;
        if (iArr == null || i >= iArr.length) {
            return 0;
        }
        return iArr[i][2];
    }

    public int bottomOfWidget(int i) {
        int[][] iArr = this.getHighSpeedVideoFpsRangesFor;
        if (iArr == null || i >= iArr.length) {
            return 0;
        }
        return iArr[i][3];
    }
}
