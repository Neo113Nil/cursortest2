package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes6.dex */
public class KeyFrameArray {

    public static class CustomArray {
        int getHighResolutionOutputSizeshNQ4ISI;
        int[] getHighSpeedVideoFpsRanges = new int[101];
        androidx.constraintlayout.core.motion.CustomAttribute[] getHighSpeedVideoSizes = new androidx.constraintlayout.core.motion.CustomAttribute[101];

        public CustomArray() {
            clear();
        }

        public void clear() {
            java.util.Arrays.fill(this.getHighSpeedVideoFpsRanges, 999);
            java.util.Arrays.fill(this.getHighSpeedVideoSizes, (java.lang.Object) null);
            this.getHighResolutionOutputSizeshNQ4ISI = 0;
        }

        public void dump() {
            java.io.PrintStream printStream = java.lang.System.out;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("V: ");
            sb.append(java.util.Arrays.toString(java.util.Arrays.copyOf(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI)));
            printStream.println(sb.toString());
            java.lang.System.out.print("K: [");
            int i = 0;
            while (i < this.getHighResolutionOutputSizeshNQ4ISI) {
                java.io.PrintStream printStream2 = java.lang.System.out;
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(i == 0 ? "" : ", ");
                sb2.append(valueAt(i));
                printStream2.print(sb2.toString());
                i++;
            }
            java.lang.System.out.println("]");
        }

        public int size() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public androidx.constraintlayout.core.motion.CustomAttribute valueAt(int i) {
            return this.getHighSpeedVideoSizes[this.getHighSpeedVideoFpsRanges[i]];
        }

        public int keyAt(int i) {
            return this.getHighSpeedVideoFpsRanges[i];
        }

        public void append(int i, androidx.constraintlayout.core.motion.CustomAttribute customAttribute) {
            if (this.getHighSpeedVideoSizes[i] != null) {
                remove(i);
            }
            this.getHighSpeedVideoSizes[i] = customAttribute;
            int[] iArr = this.getHighSpeedVideoFpsRanges;
            int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighResolutionOutputSizeshNQ4ISI = i2 + 1;
            iArr[i2] = i;
            java.util.Arrays.sort(iArr);
        }

        public void remove(int i) {
            this.getHighSpeedVideoSizes[i] = null;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = this.getHighResolutionOutputSizeshNQ4ISI;
                if (i2 < i4) {
                    int[] iArr = this.getHighSpeedVideoFpsRanges;
                    if (i == iArr[i2]) {
                        iArr[i2] = 999;
                        i3++;
                    }
                    if (i2 != i3) {
                        iArr[i2] = iArr[i3];
                    }
                    i3++;
                    i2++;
                } else {
                    this.getHighResolutionOutputSizeshNQ4ISI = i4 - 1;
                    return;
                }
            }
        }
    }

    public static class CustomVar {
        int getHighSpeedVideoFpsRangesFor;
        int[] getHighResolutionOutputSizeshNQ4ISI = new int[101];
        androidx.constraintlayout.core.motion.CustomVariable[] Camera2StreamConfigurationMap = new androidx.constraintlayout.core.motion.CustomVariable[101];

        public CustomVar() {
            clear();
        }

        public void clear() {
            java.util.Arrays.fill(this.getHighResolutionOutputSizeshNQ4ISI, 999);
            java.util.Arrays.fill(this.Camera2StreamConfigurationMap, (java.lang.Object) null);
            this.getHighSpeedVideoFpsRangesFor = 0;
        }

        public void dump() {
            java.io.PrintStream printStream = java.lang.System.out;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("V: ");
            sb.append(java.util.Arrays.toString(java.util.Arrays.copyOf(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor)));
            printStream.println(sb.toString());
            java.lang.System.out.print("K: [");
            int i = 0;
            while (i < this.getHighSpeedVideoFpsRangesFor) {
                java.io.PrintStream printStream2 = java.lang.System.out;
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(i == 0 ? "" : ", ");
                sb2.append(valueAt(i));
                printStream2.print(sb2.toString());
                i++;
            }
            java.lang.System.out.println("]");
        }

        public int size() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public androidx.constraintlayout.core.motion.CustomVariable valueAt(int i) {
            return this.Camera2StreamConfigurationMap[this.getHighResolutionOutputSizeshNQ4ISI[i]];
        }

        public int keyAt(int i) {
            return this.getHighResolutionOutputSizeshNQ4ISI[i];
        }

        public void append(int i, androidx.constraintlayout.core.motion.CustomVariable customVariable) {
            if (this.Camera2StreamConfigurationMap[i] != null) {
                remove(i);
            }
            this.Camera2StreamConfigurationMap[i] = customVariable;
            int[] iArr = this.getHighResolutionOutputSizeshNQ4ISI;
            int i2 = this.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoFpsRangesFor = i2 + 1;
            iArr[i2] = i;
            java.util.Arrays.sort(iArr);
        }

        public void remove(int i) {
            this.Camera2StreamConfigurationMap[i] = null;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = this.getHighSpeedVideoFpsRangesFor;
                if (i2 < i4) {
                    int[] iArr = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (i == iArr[i2]) {
                        iArr[i2] = 999;
                        i3++;
                    }
                    if (i2 != i3) {
                        iArr[i2] = iArr[i3];
                    }
                    i3++;
                    i2++;
                } else {
                    this.getHighSpeedVideoFpsRangesFor = i4 - 1;
                    return;
                }
            }
        }
    }

    static class FloatArray {
        int getHighResolutionOutputSizeshNQ4ISI;
        int[] getHighSpeedVideoFpsRanges;
        float[][] getHighSpeedVideoFpsRangesFor = new float[101][];

        FloatArray() {
            int[] iArr = new int[101];
            this.getHighSpeedVideoFpsRanges = iArr;
            java.util.Arrays.fill(iArr, 999);
            java.util.Arrays.fill(this.getHighSpeedVideoFpsRangesFor, (java.lang.Object) null);
            this.getHighResolutionOutputSizeshNQ4ISI = 0;
        }

        public final void getHighSpeedVideoFpsRangesFor(int i, float[] fArr) {
            int i2;
            float[][] fArr2 = this.getHighSpeedVideoFpsRangesFor;
            if (fArr2[i] != null) {
                fArr2[i] = null;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    i2 = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (i3 >= i2) {
                        break;
                    }
                    int[] iArr = this.getHighSpeedVideoFpsRanges;
                    if (i == iArr[i3]) {
                        iArr[i3] = 999;
                        i4++;
                    }
                    if (i3 != i4) {
                        iArr[i3] = iArr[i4];
                    }
                    i4++;
                    i3++;
                }
                this.getHighResolutionOutputSizeshNQ4ISI = i2 - 1;
            }
            this.getHighSpeedVideoFpsRangesFor[i] = fArr;
            int[] iArr2 = this.getHighSpeedVideoFpsRanges;
            int i5 = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighResolutionOutputSizeshNQ4ISI = i5 + 1;
            iArr2[i5] = i;
            java.util.Arrays.sort(iArr2);
        }
    }
}
