package androidx.constraintlayout.core.utils;

/* loaded from: classes7.dex */
public class GridCore extends androidx.constraintlayout.core.widgets.VirtualLayout {
    public static final int HORIZONTAL = 0;
    public static final int SPANS_RESPECT_WIDGET_ORDER = 2;
    public static final int SUB_GRID_BY_COL_ROW = 1;
    public static final int VERTICAL = 1;
    private int AMEXKernelCallback;
    private int AMEXKernelJNI;
    private int[][] AMEXKernela;
    androidx.constraintlayout.core.widgets.ConstraintWidgetContainer Camera2StreamConfigurationMap;
    private java.lang.String c;
    private int exchange;
    private java.lang.String free;
    private java.lang.String freeTransaction;
    private androidx.constraintlayout.core.widgets.ConstraintWidget[] init;
    private int kernelVersion;
    private int l;
    private java.lang.String requestPINEntry;
    private int resetTransaction;
    private int[][] rsaCipher;
    private float setup;
    private float startTransaction;
    private boolean[][] updateUI;
    private boolean release = false;
    private int requestGoOnline = 0;
    java.util.Set<java.lang.String> getHighResolutionOutputSizeshNQ4ISI = new java.util.HashSet();
    private int sha1 = 0;

    public GridCore() {
        getHighSpeedVideoSizes();
        Camera2StreamConfigurationMap();
    }

    public GridCore(int i, int i2) {
        this.AMEXKernelJNI = i;
        this.resetTransaction = i2;
        if (i > 50) {
            this.AMEXKernelJNI = 3;
        }
        if (i2 > 50) {
            this.resetTransaction = 3;
        }
        getHighSpeedVideoSizes();
        Camera2StreamConfigurationMap();
    }

    public androidx.constraintlayout.core.widgets.ConstraintWidgetContainer getContainer() {
        return this.Camera2StreamConfigurationMap;
    }

    public void setContainer(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer) {
        this.Camera2StreamConfigurationMap = constraintWidgetContainer;
    }

    public void setSpans(java.lang.CharSequence charSequence) {
        java.lang.String str = this.freeTransaction;
        if (str == null || !str.equals(charSequence.toString())) {
            this.release = false;
            this.freeTransaction = charSequence.toString();
        }
    }

    public void setSkips(java.lang.String str) {
        java.lang.String str2 = this.free;
        if (str2 == null || !str2.equals(str)) {
            this.release = false;
            this.free = str;
        }
    }

    public float getHorizontalGaps() {
        return this.startTransaction;
    }

    public void setHorizontalGaps(float f) {
        if (f < 0.0f || this.startTransaction == f) {
            return;
        }
        this.startTransaction = f;
    }

    public float getVerticalGaps() {
        return this.setup;
    }

    public void setVerticalGaps(float f) {
        if (f < 0.0f || this.setup == f) {
            return;
        }
        this.setup = f;
    }

    public java.lang.String getRowWeights() {
        return this.requestPINEntry;
    }

    public void setRowWeights(java.lang.String str) {
        java.lang.String str2 = this.requestPINEntry;
        if (str2 == null || !str2.equals(str)) {
            this.requestPINEntry = str;
        }
    }

    public java.lang.String getColumnWeights() {
        return this.c;
    }

    public void setColumnWeights(java.lang.String str) {
        java.lang.String str2 = this.c;
        if (str2 == null || !str2.equals(str)) {
            this.c = str;
        }
    }

    public int getOrientation() {
        return this.AMEXKernelCallback;
    }

    public void setOrientation(int i) {
        if ((i == 0 || i == 1) && this.AMEXKernelCallback != i) {
            this.AMEXKernelCallback = i;
        }
    }

    public void setRows(int i) {
        if (i > 50 || this.AMEXKernelJNI == i) {
            return;
        }
        this.AMEXKernelJNI = i;
        getHighSpeedVideoSizes();
        getHighSpeedVideoFpsRangesFor();
    }

    public void setColumns(int i) {
        if (i > 50 || this.resetTransaction == i) {
            return;
        }
        this.resetTransaction = i;
        getHighSpeedVideoSizes();
        getHighSpeedVideoFpsRangesFor();
    }

    public int getFlags() {
        return this.exchange;
    }

    public void setFlags(int i) {
        this.exchange = i;
    }

    private void getHighSpeedVideoFpsRangesFor(int[][] iArr) {
        int i;
        int i2;
        for (int[] iArr2 : iArr) {
            int i3 = iArr2[0];
            int i4 = this.AMEXKernelCallback;
            if (i4 == 1) {
                i = i3 % this.l;
            } else {
                i = i3 / this.kernelVersion;
            }
            if (i4 == 1) {
                i2 = i3 / this.l;
            } else {
                i2 = i3 % this.kernelVersion;
            }
            if (!getHighSpeedVideoSizes(i, i2, iArr2[1], iArr2[2])) {
                return;
            }
        }
    }

    private boolean getHighSpeedVideoSizes(int i, int i2, int i3, int i4) {
        for (int i5 = i; i5 < i + i3; i5++) {
            for (int i6 = i2; i6 < i2 + i4; i6++) {
                boolean[][] zArr = this.updateUI;
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

    private static float[] getHighResolutionOutputSizeshNQ4ISI(int i, java.lang.String str) {
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        java.lang.String[] split = str.split(",");
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 < split.length) {
                try {
                    fArr[i2] = java.lang.Float.parseFloat(split[i2]);
                } catch (java.lang.Exception e) {
                    java.io.PrintStream printStream = java.lang.System.err;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Error parsing `");
                    sb.append(split[i2]);
                    sb.append("`: ");
                    sb.append(e.getMessage());
                    printStream.println(sb.toString());
                }
            }
            fArr[i2] = 1.0f;
        }
        return fArr;
    }

    private void getHighSpeedVideoSizes() {
        int i;
        int i2 = this.AMEXKernelJNI;
        if (i2 == 0 || (i = this.resetTransaction) == 0) {
            int i3 = this.resetTransaction;
            if (i3 > 0) {
                this.kernelVersion = i3;
                this.l = ((this.mWidgetsCount + this.kernelVersion) - 1) / this.resetTransaction;
                return;
            } else {
                if (i2 > 0) {
                    this.l = i2;
                    int i4 = this.mWidgetsCount;
                    this.kernelVersion = ((i4 + r1) - 1) / this.AMEXKernelJNI;
                    return;
                }
                this.l = (int) (java.lang.Math.sqrt(this.mWidgetsCount) + 1.5d);
                int i5 = this.mWidgetsCount;
                this.kernelVersion = ((i5 + r1) - 1) / this.l;
                return;
            }
        }
        this.l = i2;
        this.kernelVersion = i;
    }

    private static androidx.constraintlayout.core.widgets.ConstraintWidget getHighSpeedVideoFpsRanges() {
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = new androidx.constraintlayout.core.widgets.ConstraintWidget();
        constraintWidget.mListDimensionBehaviors[0] = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        constraintWidget.mListDimensionBehaviors[1] = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        constraintWidget.stringId = java.lang.String.valueOf(constraintWidget.hashCode());
        return constraintWidget;
    }

    private void getHighResolutionOutputSizeshNQ4ISI(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget, int i, int i2, int i3, int i4) {
        constraintWidget.mLeft.connect(this.init[i2].mLeft, 0);
        constraintWidget.mTop.connect(this.init[i].mTop, 0);
        constraintWidget.mRight.connect(this.init[(i2 + i4) - 1].mRight, 0);
        constraintWidget.mBottom.connect(this.init[(i + i3) - 1].mBottom, 0);
    }

    private void getHighSpeedVideoFpsRangesFor() {
        boolean[][] zArr = (boolean[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Boolean.TYPE, this.l, this.kernelVersion);
        this.updateUI = zArr;
        for (boolean[] zArr2 : zArr) {
            java.util.Arrays.fill(zArr2, true);
        }
        if (this.mWidgetsCount > 0) {
            int[][] iArr = (int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Integer.TYPE, this.mWidgetsCount, 4);
            this.AMEXKernela = iArr;
            for (int[] iArr2 : iArr) {
                java.util.Arrays.fill(iArr2, -1);
            }
        }
    }

    private int[][] getHighSpeedVideoSizes(java.lang.String str, boolean z) {
        try {
            java.lang.String[] split = str.split(",");
            java.util.Arrays.sort(split, new java.util.Comparator() { // from class: androidx.constraintlayout.core.utils.GridCore$$ExternalSyntheticLambda0
                @Override // java.util.Comparator
                public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.constraintlayout.core.utils.GridCore.getHighSpeedVideoFpsRangesFor((java.lang.String) obj, (java.lang.String) obj2);
                }
            });
            int[][] iArr = (int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Integer.TYPE, split.length, 3);
            if (this.l != 1 && this.kernelVersion != 1) {
                for (int i = 0; i < split.length; i++) {
                    java.lang.String[] split2 = split[i].trim().split(io.ktor.sse.ServerSentEventKt.COLON);
                    java.lang.String[] split3 = split2[1].split("x");
                    iArr[i][0] = java.lang.Integer.parseInt(split2[0]);
                    if ((this.exchange & 1) > 0) {
                        iArr[i][1] = java.lang.Integer.parseInt(split3[1]);
                        iArr[i][2] = java.lang.Integer.parseInt(split3[0]);
                    } else {
                        iArr[i][1] = java.lang.Integer.parseInt(split3[0]);
                        iArr[i][2] = java.lang.Integer.parseInt(split3[1]);
                    }
                }
                return iArr;
            }
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < split.length; i4++) {
                java.lang.String[] split4 = split[i4].trim().split(io.ktor.sse.ServerSentEventKt.COLON);
                iArr[i4][0] = java.lang.Integer.parseInt(split4[0]);
                int[] iArr2 = iArr[i4];
                iArr2[1] = 1;
                iArr2[2] = 1;
                if (this.kernelVersion == 1) {
                    iArr2[1] = java.lang.Integer.parseInt(split4[1]);
                    i2 += iArr[i4][1];
                    if (z) {
                        i2--;
                    }
                }
                if (this.l == 1) {
                    iArr[i4][2] = java.lang.Integer.parseInt(split4[1]);
                    i3 += iArr[i4][2];
                    if (z) {
                        i3--;
                    }
                }
            }
            if (i2 != 0 && !this.release) {
                setRows(this.l + i2);
            }
            if (i3 != 0 && !this.release) {
                setColumns(this.kernelVersion + i3);
            }
            this.release = true;
            return iArr;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    static /* synthetic */ int getHighSpeedVideoFpsRangesFor(java.lang.String str, java.lang.String str2) {
        return java.lang.Integer.parseInt(str.split(io.ktor.sse.ServerSentEventKt.COLON)[0]) - java.lang.Integer.parseInt(str2.split(io.ktor.sse.ServerSentEventKt.COLON)[0]);
    }

    private void getHighSpeedVideoFpsRangesFor(boolean z) {
        int[][] highSpeedVideoSizes;
        int[][] highSpeedVideoSizes2;
        if (z) {
            for (int i = 0; i < this.updateUI.length; i++) {
                int i2 = 0;
                while (true) {
                    boolean[][] zArr = this.updateUI;
                    if (i2 < zArr[0].length) {
                        zArr[i][i2] = true;
                        i2++;
                    }
                }
            }
            for (int i3 = 0; i3 < this.AMEXKernela.length; i3++) {
                int i4 = 0;
                while (true) {
                    int[][] iArr = this.AMEXKernela;
                    if (i4 < iArr[0].length) {
                        iArr[i3][i4] = -1;
                        i4++;
                    }
                }
            }
        }
        this.requestGoOnline = 0;
        java.lang.String str = this.free;
        if (str != null && !str.trim().isEmpty() && (highSpeedVideoSizes2 = getHighSpeedVideoSizes(this.free, false)) != null) {
            getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes2);
        }
        java.lang.String str2 = this.freeTransaction;
        if (str2 == null || str2.trim().isEmpty() || (highSpeedVideoSizes = getHighSpeedVideoSizes(this.freeTransaction, true)) == null) {
            return;
        }
        Camera2StreamConfigurationMap(highSpeedVideoSizes);
    }

    private void Camera2StreamConfigurationMap() {
        boolean[][] zArr;
        int[][] iArr = this.AMEXKernela;
        boolean z = false;
        if (iArr != null && iArr.length == this.mWidgetsCount && (zArr = this.updateUI) != null && zArr.length == this.l && zArr[0].length == this.kernelVersion) {
            z = true;
        }
        if (!z) {
            getHighSpeedVideoFpsRangesFor();
        }
        getHighSpeedVideoFpsRangesFor(z);
    }

    @Override // androidx.constraintlayout.core.widgets.VirtualLayout
    public void measure(int i, int i2, int i3, int i4) {
        int[][] highSpeedVideoSizes;
        super.measure(i, i2, i3, i4);
        this.Camera2StreamConfigurationMap = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) getParent();
        if (this.l > 0 && this.kernelVersion > 0) {
            int i5 = 0;
            this.requestGoOnline = 0;
            java.lang.String str = this.free;
            if (str != null && !str.trim().isEmpty() && (highSpeedVideoSizes = getHighSpeedVideoSizes(this.free, false)) != null) {
                getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes);
            }
            java.lang.String str2 = this.freeTransaction;
            if (str2 != null && !str2.trim().isEmpty()) {
                this.rsaCipher = getHighSpeedVideoSizes(this.freeTransaction, true);
            }
            int max = java.lang.Math.max(this.l, this.kernelVersion);
            androidx.constraintlayout.core.widgets.ConstraintWidget[] constraintWidgetArr = this.init;
            if (constraintWidgetArr == null) {
                this.init = new androidx.constraintlayout.core.widgets.ConstraintWidget[max];
                while (true) {
                    androidx.constraintlayout.core.widgets.ConstraintWidget[] constraintWidgetArr2 = this.init;
                    if (i5 >= constraintWidgetArr2.length) {
                        break;
                    }
                    constraintWidgetArr2[i5] = getHighSpeedVideoFpsRanges();
                    i5++;
                }
            } else if (max != constraintWidgetArr.length) {
                androidx.constraintlayout.core.widgets.ConstraintWidget[] constraintWidgetArr3 = new androidx.constraintlayout.core.widgets.ConstraintWidget[max];
                while (i5 < max) {
                    androidx.constraintlayout.core.widgets.ConstraintWidget[] constraintWidgetArr4 = this.init;
                    if (i5 < constraintWidgetArr4.length) {
                        constraintWidgetArr3[i5] = constraintWidgetArr4[i5];
                    } else {
                        constraintWidgetArr3[i5] = getHighSpeedVideoFpsRanges();
                    }
                    i5++;
                }
                while (true) {
                    androidx.constraintlayout.core.widgets.ConstraintWidget[] constraintWidgetArr5 = this.init;
                    if (max >= constraintWidgetArr5.length) {
                        break;
                    }
                    this.Camera2StreamConfigurationMap.remove(constraintWidgetArr5[max]);
                    max++;
                }
                this.init = constraintWidgetArr3;
            }
            int[][] iArr = this.rsaCipher;
            if (iArr != null) {
                Camera2StreamConfigurationMap(iArr);
            }
        }
        this.Camera2StreamConfigurationMap.add(this.init);
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void addToSolver(androidx.constraintlayout.core.LinearSystem linearSystem, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int[][] iArr;
        int i5;
        int i6;
        int i7;
        super.addToSolver(linearSystem, z);
        int max = java.lang.Math.max(this.l, this.kernelVersion);
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = this.init[0];
        float[] highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(this.l, this.requestPINEntry);
        if (this.l == 1) {
            constraintWidget.setVerticalWeight(-1.0f);
            constraintWidget.mTop.reset();
            constraintWidget.mBottom.reset();
            constraintWidget.mBaseline.reset();
            constraintWidget.mTop.connect(this.mTop, 0);
            constraintWidget.mBottom.connect(this.mBottom, 0);
        } else {
            int i8 = 0;
            while (true) {
                i = this.l;
                if (i8 >= i) {
                    break;
                }
                androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget2 = this.init[i8];
                constraintWidget2.setVerticalWeight(-1.0f);
                constraintWidget2.mTop.reset();
                constraintWidget2.mBottom.reset();
                constraintWidget2.mBaseline.reset();
                if (highResolutionOutputSizeshNQ4ISI != null) {
                    constraintWidget2.setVerticalWeight(highResolutionOutputSizeshNQ4ISI[i8]);
                }
                if (i8 > 0) {
                    constraintWidget2.mTop.connect(this.init[i8 - 1].mBottom, 0);
                } else {
                    constraintWidget2.mTop.connect(this.mTop, 0);
                }
                if (i8 < this.l - 1) {
                    constraintWidget2.mBottom.connect(this.init[i8 + 1].mTop, 0);
                } else {
                    constraintWidget2.mBottom.connect(this.mBottom, 0);
                }
                if (i8 > 0) {
                    constraintWidget2.mTop.mMargin = (int) this.setup;
                }
                i8++;
            }
            while (i < max) {
                androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget3 = this.init[i];
                constraintWidget3.setVerticalWeight(-1.0f);
                constraintWidget3.mTop.reset();
                constraintWidget3.mBottom.reset();
                constraintWidget3.mBaseline.reset();
                constraintWidget3.mTop.connect(this.mTop, 0);
                constraintWidget3.mBottom.connect(this.mBottom, 0);
                i++;
            }
        }
        int max2 = java.lang.Math.max(this.l, this.kernelVersion);
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget4 = this.init[0];
        float[] highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(this.kernelVersion, this.c);
        if (this.kernelVersion == 1) {
            constraintWidget4.setHorizontalWeight(-1.0f);
            constraintWidget4.mLeft.reset();
            constraintWidget4.mRight.reset();
            constraintWidget4.mLeft.connect(this.mLeft, 0);
            constraintWidget4.mRight.connect(this.mRight, 0);
        } else {
            int i9 = 0;
            while (true) {
                i2 = this.kernelVersion;
                if (i9 >= i2) {
                    break;
                }
                androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget5 = this.init[i9];
                constraintWidget5.setHorizontalWeight(-1.0f);
                constraintWidget5.mLeft.reset();
                constraintWidget5.mRight.reset();
                if (highResolutionOutputSizeshNQ4ISI2 != null) {
                    constraintWidget5.setHorizontalWeight(highResolutionOutputSizeshNQ4ISI2[i9]);
                }
                if (i9 > 0) {
                    constraintWidget5.mLeft.connect(this.init[i9 - 1].mRight, 0);
                } else {
                    constraintWidget5.mLeft.connect(this.mLeft, 0);
                }
                if (i9 < this.kernelVersion - 1) {
                    constraintWidget5.mRight.connect(this.init[i9 + 1].mLeft, 0);
                } else {
                    constraintWidget5.mRight.connect(this.mRight, 0);
                }
                if (i9 > 0) {
                    constraintWidget5.mLeft.mMargin = (int) this.startTransaction;
                }
                i9++;
            }
            while (i2 < max2) {
                androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget6 = this.init[i2];
                constraintWidget6.setHorizontalWeight(-1.0f);
                constraintWidget6.mLeft.reset();
                constraintWidget6.mRight.reset();
                constraintWidget6.mLeft.connect(this.mLeft, 0);
                constraintWidget6.mRight.connect(this.mRight, 0);
                i2++;
            }
        }
        for (int i10 = 0; i10 < this.mWidgetsCount; i10++) {
            if (!this.getHighResolutionOutputSizeshNQ4ISI.contains(this.mWidgets[i10].stringId)) {
                boolean z2 = false;
                int i11 = 0;
                while (true) {
                    if (z2) {
                        break;
                    }
                    i11 = this.requestGoOnline;
                    int i12 = this.l;
                    int i13 = this.kernelVersion;
                    if (i11 >= i12 * i13) {
                        i11 = -1;
                        break;
                    }
                    int i14 = this.AMEXKernelCallback;
                    if (i14 == 1) {
                        i6 = i11 % i12;
                    } else {
                        i6 = i11 / i13;
                    }
                    if (i14 == 1) {
                        i7 = i11 / i12;
                    } else {
                        i7 = i11 % i13;
                    }
                    boolean[] zArr = this.updateUI[i6];
                    if (zArr[i7]) {
                        zArr[i7] = false;
                        z2 = true;
                    }
                    this.requestGoOnline = i11 + 1;
                }
                int i15 = this.AMEXKernelCallback;
                if (i15 == 1) {
                    i3 = i11 % this.l;
                } else {
                    i3 = i11 / this.kernelVersion;
                }
                int i16 = i3;
                if (i15 == 1) {
                    i4 = i11 / this.l;
                } else {
                    i4 = i11 % this.kernelVersion;
                }
                int i17 = i4;
                if (i11 == -1) {
                    return;
                }
                if ((this.exchange & 2) > 0 && (iArr = this.rsaCipher) != null && (i5 = this.sha1) < iArr.length) {
                    int[] iArr2 = iArr[i5];
                    if (iArr2[0] == i11) {
                        this.updateUI[i16][i17] = true;
                        if (getHighSpeedVideoSizes(i16, i17, iArr2[1], iArr2[2])) {
                            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget7 = this.mWidgets[i10];
                            int[] iArr3 = this.rsaCipher[this.sha1];
                            getHighResolutionOutputSizeshNQ4ISI(constraintWidget7, i16, i17, iArr3[1], iArr3[2]);
                            this.sha1++;
                        }
                    }
                }
                getHighResolutionOutputSizeshNQ4ISI(this.mWidgets[i10], i16, i17, 1, 1);
            }
        }
    }

    private void Camera2StreamConfigurationMap(int[][] iArr) {
        int i;
        int i2;
        if ((this.exchange & 2) > 0) {
            return;
        }
        for (int i3 = 0; i3 < iArr.length; i3++) {
            int[] iArr2 = iArr[i3];
            int i4 = iArr2[0];
            int i5 = this.AMEXKernelCallback;
            if (i5 == 1) {
                i = i4 % this.l;
            } else {
                i = i4 / this.kernelVersion;
            }
            int i6 = i;
            if (i5 == 1) {
                i2 = i4 / this.l;
            } else {
                i2 = i4 % this.kernelVersion;
            }
            int i7 = i2;
            if (!getHighSpeedVideoSizes(i6, i7, iArr2[1], iArr2[2])) {
                return;
            }
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = this.mWidgets[i3];
            int[] iArr3 = iArr[i3];
            getHighResolutionOutputSizeshNQ4ISI(constraintWidget, i6, i7, iArr3[1], iArr3[2]);
            this.getHighResolutionOutputSizeshNQ4ISI.add(this.mWidgets[i3].stringId);
        }
    }
}
