package androidx.constraintlayout.core.widgets;

/* loaded from: classes7.dex */
public class Flow extends androidx.constraintlayout.core.widgets.VirtualLayout {
    public static final int HORIZONTAL_ALIGN_CENTER = 2;
    public static final int HORIZONTAL_ALIGN_END = 1;
    public static final int HORIZONTAL_ALIGN_START = 0;
    public static final int VERTICAL_ALIGN_BASELINE = 3;
    public static final int VERTICAL_ALIGN_BOTTOM = 1;
    public static final int VERTICAL_ALIGN_CENTER = 2;
    public static final int VERTICAL_ALIGN_TOP = 0;
    public static final int WRAP_ALIGNED = 2;
    public static final int WRAP_CHAIN = 1;
    public static final int WRAP_CHAIN_NEW = 3;
    public static final int WRAP_NONE = 0;
    private androidx.constraintlayout.core.widgets.ConstraintWidget[] c;
    private int requestPINEntry = -1;
    private int newContext = -1;
    private int AMEXKernela = -1;
    private int resetTransaction = -1;
    private int sha1 = -1;
    private int rsaCipher = -1;
    private float requestGoOnline = 0.5f;
    private float AMEXKernelProvider = 0.5f;
    private float startTransaction = 0.5f;
    private float exchange = 0.5f;
    private float updateUI = 0.5f;
    private float AMEXKernelJNI = 0.5f;
    private int l = 0;
    private int version = 0;
    private int AMEXKernelCallback = 2;
    private int start = 2;
    private int setup = 0;
    private int free = -1;
    private int freeTransaction = 0;
    private java.util.ArrayList<androidx.constraintlayout.core.widgets.Flow.WidgetsList> init = new java.util.ArrayList<>();
    private androidx.constraintlayout.core.widgets.ConstraintWidget[] getHighResolutionOutputSizeshNQ4ISI = null;
    private androidx.constraintlayout.core.widgets.ConstraintWidget[] Camera2StreamConfigurationMap = null;
    private int[] kernelVersion = null;
    private int release = 0;

    @Override // androidx.constraintlayout.core.widgets.HelperWidget, androidx.constraintlayout.core.widgets.ConstraintWidget
    public void copy(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget, java.util.HashMap<androidx.constraintlayout.core.widgets.ConstraintWidget, androidx.constraintlayout.core.widgets.ConstraintWidget> hashMap) {
        super.copy(constraintWidget, hashMap);
        androidx.constraintlayout.core.widgets.Flow flow = (androidx.constraintlayout.core.widgets.Flow) constraintWidget;
        this.requestPINEntry = flow.requestPINEntry;
        this.newContext = flow.newContext;
        this.AMEXKernela = flow.AMEXKernela;
        this.resetTransaction = flow.resetTransaction;
        this.sha1 = flow.sha1;
        this.rsaCipher = flow.rsaCipher;
        this.requestGoOnline = flow.requestGoOnline;
        this.AMEXKernelProvider = flow.AMEXKernelProvider;
        this.startTransaction = flow.startTransaction;
        this.exchange = flow.exchange;
        this.updateUI = flow.updateUI;
        this.AMEXKernelJNI = flow.AMEXKernelJNI;
        this.l = flow.l;
        this.version = flow.version;
        this.AMEXKernelCallback = flow.AMEXKernelCallback;
        this.start = flow.start;
        this.setup = flow.setup;
        this.free = flow.free;
        this.freeTransaction = flow.freeTransaction;
    }

    public void setOrientation(int i) {
        this.freeTransaction = i;
    }

    public void setFirstHorizontalStyle(int i) {
        this.AMEXKernela = i;
    }

    public void setFirstVerticalStyle(int i) {
        this.resetTransaction = i;
    }

    public void setLastHorizontalStyle(int i) {
        this.sha1 = i;
    }

    public void setLastVerticalStyle(int i) {
        this.rsaCipher = i;
    }

    public void setHorizontalStyle(int i) {
        this.requestPINEntry = i;
    }

    public void setVerticalStyle(int i) {
        this.newContext = i;
    }

    public void setHorizontalBias(float f) {
        this.requestGoOnline = f;
    }

    public void setVerticalBias(float f) {
        this.AMEXKernelProvider = f;
    }

    public void setFirstHorizontalBias(float f) {
        this.startTransaction = f;
    }

    public void setFirstVerticalBias(float f) {
        this.exchange = f;
    }

    public void setLastHorizontalBias(float f) {
        this.updateUI = f;
    }

    public void setLastVerticalBias(float f) {
        this.AMEXKernelJNI = f;
    }

    public void setHorizontalAlign(int i) {
        this.AMEXKernelCallback = i;
    }

    public void setVerticalAlign(int i) {
        this.start = i;
    }

    public void setWrapMode(int i) {
        this.setup = i;
    }

    public void setHorizontalGap(int i) {
        this.l = i;
    }

    public void setVerticalGap(int i) {
        this.version = i;
    }

    public void setMaxElementsWrap(int i) {
        this.free = i;
    }

    public float getMaxElementsWrap() {
        return this.free;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getHighSpeedVideoFpsRanges(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget, int i) {
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.getHorizontalDimensionBehaviour() == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            if (constraintWidget.mMatchConstraintDefaultWidth == 0) {
                return 0;
            }
            if (constraintWidget.mMatchConstraintDefaultWidth == 2) {
                int i2 = (int) (constraintWidget.mMatchConstraintPercentWidth * i);
                if (i2 != constraintWidget.getWidth()) {
                    constraintWidget.setMeasureRequested(true);
                    measure(constraintWidget, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED, i2, constraintWidget.getVerticalDimensionBehaviour(), constraintWidget.getHeight());
                }
                return i2;
            }
            if (constraintWidget.mMatchConstraintDefaultWidth == 1) {
                return constraintWidget.getWidth();
            }
            if (constraintWidget.mMatchConstraintDefaultWidth == 3) {
                return (int) ((constraintWidget.getHeight() * constraintWidget.mDimensionRatio) + 0.5f);
            }
        }
        return constraintWidget.getWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int Camera2StreamConfigurationMap(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget, int i) {
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.getVerticalDimensionBehaviour() == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            if (constraintWidget.mMatchConstraintDefaultHeight == 0) {
                return 0;
            }
            if (constraintWidget.mMatchConstraintDefaultHeight == 2) {
                int i2 = (int) (constraintWidget.mMatchConstraintPercentHeight * i);
                if (i2 != constraintWidget.getHeight()) {
                    constraintWidget.setMeasureRequested(true);
                    measure(constraintWidget, constraintWidget.getHorizontalDimensionBehaviour(), constraintWidget.getWidth(), androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED, i2);
                }
                return i2;
            }
            if (constraintWidget.mMatchConstraintDefaultHeight == 1) {
                return constraintWidget.getHeight();
            }
            if (constraintWidget.mMatchConstraintDefaultHeight == 3) {
                return (int) ((constraintWidget.getWidth() * constraintWidget.mDimensionRatio) + 0.5f);
            }
        }
        return constraintWidget.getHeight();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03c1  */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v54 */
    /* JADX WARN: Type inference failed for: r1v82 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:260:0x046e -> B:205:0x047e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:261:0x0470 -> B:205:0x047e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:263:0x0476 -> B:205:0x047e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:264:0x0478 -> B:205:0x047e). Please report as a decompilation issue!!! */
    @Override // androidx.constraintlayout.core.widgets.VirtualLayout
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void measure(int i, int i2, int i3, int i4) {
        int[] iArr;
        int i5;
        int i6;
        androidx.constraintlayout.core.widgets.Flow.WidgetsList widgetsList;
        int i7;
        boolean z;
        int i8;
        int[] iArr2;
        ?? r1;
        boolean z2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor;
        int paddingRight;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        boolean z3;
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor2;
        int i33;
        int i34;
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget2;
        int i35;
        int i36;
        if (this.mWidgetsCount > 0 && !measureChildren()) {
            setMeasure(0, 0);
            needsCallbackFromSolver(false);
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingRight2 = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int[] iArr3 = new int[2];
        int i37 = (i2 - paddingLeft) - paddingRight2;
        int i38 = this.freeTransaction;
        if (i38 == 1) {
            i37 = (i4 - paddingTop) - paddingBottom;
        }
        int i39 = i37;
        if (i38 == 0) {
            if (this.requestPINEntry == -1) {
                this.requestPINEntry = 0;
            }
            if (this.newContext == -1) {
                this.newContext = 0;
            }
        } else {
            if (this.requestPINEntry == -1) {
                this.requestPINEntry = 0;
            }
            if (this.newContext == -1) {
                this.newContext = 0;
            }
        }
        androidx.constraintlayout.core.widgets.ConstraintWidget[] constraintWidgetArr = this.mWidgets;
        int i40 = 0;
        for (int i41 = 0; i41 < this.mWidgetsCount; i41++) {
            if (this.mWidgets[i41].getVisibility() == 8) {
                i40++;
            }
        }
        int i42 = this.mWidgetsCount;
        if (i40 > 0) {
            constraintWidgetArr = new androidx.constraintlayout.core.widgets.ConstraintWidget[this.mWidgetsCount - i40];
            i42 = 0;
            for (int i43 = 0; i43 < this.mWidgetsCount; i43++) {
                androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget3 = this.mWidgets[i43];
                if (constraintWidget3.getVisibility() != 8) {
                    constraintWidgetArr[i42] = constraintWidget3;
                    i42++;
                }
            }
        }
        androidx.constraintlayout.core.widgets.ConstraintWidget[] constraintWidgetArr2 = constraintWidgetArr;
        int i44 = i42;
        this.c = constraintWidgetArr2;
        this.release = i44;
        int i45 = this.setup;
        if (i45 != 0) {
            if (i45 == 1) {
                iArr = iArr3;
                i5 = paddingLeft;
                i6 = paddingRight2;
                int i46 = this.freeTransaction;
                if (i44 != 0) {
                    this.init.clear();
                    androidx.constraintlayout.core.widgets.Flow.WidgetsList widgetsList2 = new androidx.constraintlayout.core.widgets.Flow.WidgetsList(i46, this.mLeft, this.mTop, this.mRight, this.mBottom, i39);
                    this.init.add(widgetsList2);
                    if (i46 == 0) {
                        i12 = 0;
                        int i47 = 0;
                        int i48 = 0;
                        while (i48 < i44) {
                            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget4 = constraintWidgetArr2[i48];
                            int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(constraintWidget4, i39);
                            if (constraintWidget4.getHorizontalDimensionBehaviour() == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                                i12++;
                            }
                            int i49 = i12;
                            boolean z4 = (i47 == i39 || (this.l + i47) + highSpeedVideoFpsRanges > i39) && widgetsList2.getHighSpeedVideoFpsRangesFor != null;
                            if ((!z4 && i48 > 0 && (i21 = this.free) > 0 && i48 % i21 == 0) || z4) {
                                widgetsList2 = new androidx.constraintlayout.core.widgets.Flow.WidgetsList(i46, this.mLeft, this.mTop, this.mRight, this.mBottom, i39);
                                widgetsList2.getInputSizeshNQ4ISI = i48;
                                this.init.add(widgetsList2);
                            } else if (i48 > 0) {
                                i47 += this.l + highSpeedVideoFpsRanges;
                                widgetsList2.getHighSpeedVideoSizes(constraintWidget4);
                                i48++;
                                i12 = i49;
                            }
                            i47 = highSpeedVideoFpsRanges;
                            widgetsList2.getHighSpeedVideoSizes(constraintWidget4);
                            i48++;
                            i12 = i49;
                        }
                    } else {
                        i12 = 0;
                        int i50 = 0;
                        int i51 = 0;
                        while (i51 < i44) {
                            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget5 = constraintWidgetArr2[i51];
                            int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(constraintWidget5, i39);
                            if (constraintWidget5.getVerticalDimensionBehaviour() == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                                i12++;
                            }
                            int i52 = i12;
                            boolean z5 = (i50 == i39 || (this.version + i50) + Camera2StreamConfigurationMap > i39) && widgetsList2.getHighSpeedVideoFpsRangesFor != null;
                            if ((!z5 && i51 > 0 && (i13 = this.free) > 0 && i51 % i13 == 0) || z5) {
                                widgetsList2 = new androidx.constraintlayout.core.widgets.Flow.WidgetsList(i46, this.mLeft, this.mTop, this.mRight, this.mBottom, i39);
                                widgetsList2.getInputSizeshNQ4ISI = i51;
                                this.init.add(widgetsList2);
                            } else if (i51 > 0) {
                                i50 += this.version + Camera2StreamConfigurationMap;
                                widgetsList2.getHighSpeedVideoSizes(constraintWidget5);
                                i51++;
                                i12 = i52;
                            }
                            i50 = Camera2StreamConfigurationMap;
                            widgetsList2.getHighSpeedVideoSizes(constraintWidget5);
                            i51++;
                            i12 = i52;
                        }
                    }
                    int size = this.init.size();
                    androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor3 = this.mLeft;
                    androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor4 = this.mTop;
                    androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor5 = this.mRight;
                    androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor6 = this.mBottom;
                    int paddingLeft2 = getPaddingLeft();
                    int paddingTop2 = getPaddingTop();
                    int paddingRight3 = getPaddingRight();
                    int paddingBottom2 = getPaddingBottom();
                    boolean z6 = getHorizontalDimensionBehaviour() == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || getVerticalDimensionBehaviour() == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    if (i12 > 0 && z6) {
                        for (int i53 = 0; i53 < size; i53++) {
                            androidx.constraintlayout.core.widgets.Flow.WidgetsList widgetsList3 = this.init.get(i53);
                            if (i46 == 0) {
                                if (widgetsList3.getInputFormats != 0) {
                                    i20 = widgetsList3.getHighSpeedVideoSizesFor;
                                } else {
                                    i20 = widgetsList3.getHighSpeedVideoSizesFor - androidx.constraintlayout.core.widgets.Flow.this.l;
                                }
                                widgetsList3.Camera2StreamConfigurationMap(i39 - i20);
                            } else {
                                if (widgetsList3.getInputFormats != 1) {
                                    i19 = widgetsList3.getHighSpeedVideoSizes;
                                } else {
                                    i19 = widgetsList3.getHighSpeedVideoSizes - androidx.constraintlayout.core.widgets.Flow.this.version;
                                }
                                widgetsList3.Camera2StreamConfigurationMap(i39 - i19);
                            }
                        }
                    }
                    int i54 = 0;
                    int i55 = 0;
                    int i56 = 0;
                    while (i54 < size) {
                        androidx.constraintlayout.core.widgets.Flow.WidgetsList widgetsList4 = this.init.get(i54);
                        if (i46 == 0) {
                            if (i54 < size - 1) {
                                constraintAnchor6 = this.init.get(i54 + 1).getHighSpeedVideoFpsRangesFor.mTop;
                                i14 = size;
                                paddingBottom2 = 0;
                            } else {
                                constraintAnchor6 = this.mBottom;
                                paddingBottom2 = getPaddingBottom();
                                i14 = size;
                            }
                            androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor7 = widgetsList4.getHighSpeedVideoFpsRangesFor.mBottom;
                            widgetsList4.Camera2StreamConfigurationMap(i46, constraintAnchor3, constraintAnchor4, constraintAnchor5, constraintAnchor6, paddingLeft2, paddingTop2, paddingRight3, paddingBottom2, i39);
                            if (widgetsList4.getInputFormats != 0) {
                                i17 = widgetsList4.getHighSpeedVideoSizesFor;
                            } else {
                                i17 = widgetsList4.getHighSpeedVideoSizesFor - androidx.constraintlayout.core.widgets.Flow.this.l;
                            }
                            int max = java.lang.Math.max(i55, i17);
                            if (widgetsList4.getInputFormats != 1) {
                                i18 = widgetsList4.getHighSpeedVideoSizes;
                            } else {
                                i18 = widgetsList4.getHighSpeedVideoSizes - androidx.constraintlayout.core.widgets.Flow.this.version;
                            }
                            int i57 = i18 + i56;
                            if (i54 > 0) {
                                i57 += this.version;
                            }
                            i55 = max;
                            i56 = i57;
                            paddingTop2 = 0;
                            constraintAnchor4 = constraintAnchor7;
                        } else {
                            i14 = size;
                            if (i54 < i14 - 1) {
                                constraintAnchor = this.init.get(i54 + 1).getHighSpeedVideoFpsRangesFor.mLeft;
                                paddingRight = 0;
                            } else {
                                constraintAnchor = this.mRight;
                                paddingRight = getPaddingRight();
                            }
                            androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor8 = widgetsList4.getHighSpeedVideoFpsRangesFor.mRight;
                            widgetsList4.Camera2StreamConfigurationMap(i46, constraintAnchor3, constraintAnchor4, constraintAnchor, constraintAnchor6, paddingLeft2, paddingTop2, paddingRight, paddingBottom2, i39);
                            if (widgetsList4.getInputFormats != 0) {
                                i15 = widgetsList4.getHighSpeedVideoSizesFor;
                            } else {
                                i15 = widgetsList4.getHighSpeedVideoSizesFor - androidx.constraintlayout.core.widgets.Flow.this.l;
                            }
                            int i58 = i15 + i55;
                            if (widgetsList4.getInputFormats != 1) {
                                i16 = widgetsList4.getHighSpeedVideoSizes;
                            } else {
                                i16 = widgetsList4.getHighSpeedVideoSizes - androidx.constraintlayout.core.widgets.Flow.this.version;
                            }
                            int max2 = java.lang.Math.max(i56, i16);
                            if (i54 > 0) {
                                i58 += this.l;
                            }
                            i55 = i58;
                            i56 = max2;
                            constraintAnchor3 = constraintAnchor8;
                            paddingLeft2 = 0;
                            paddingRight3 = paddingRight;
                            constraintAnchor5 = constraintAnchor;
                        }
                        i54++;
                        size = i14;
                    }
                    iArr[0] = i55;
                    iArr[1] = i56;
                }
            } else if (i45 == 2) {
                iArr = iArr3;
                i5 = paddingLeft;
                i6 = paddingRight2;
                int i59 = this.freeTransaction;
                if (i59 == 0) {
                    int i60 = this.free;
                    if (i60 <= 0) {
                        i60 = 0;
                        int i61 = 0;
                        for (int i62 = 0; i62 < i44; i62++) {
                            if (i62 > 0) {
                                i61 += this.l;
                            }
                            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget6 = constraintWidgetArr2[i62];
                            if (constraintWidget6 != null) {
                                i61 += getHighSpeedVideoFpsRanges(constraintWidget6, i39);
                                if (i61 > i39) {
                                    break;
                                } else {
                                    i60++;
                                }
                            }
                        }
                    }
                    i22 = i60;
                    i8 = 0;
                } else {
                    i8 = this.free;
                    if (i8 <= 0) {
                        i8 = 0;
                        int i63 = 0;
                        for (int i64 = 0; i64 < i44; i64++) {
                            if (i64 > 0) {
                                i63 += this.version;
                            }
                            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget7 = constraintWidgetArr2[i64];
                            if (constraintWidget7 != null) {
                                i63 += Camera2StreamConfigurationMap(constraintWidget7, i39);
                                if (i63 > i39) {
                                    break;
                                } else {
                                    i8++;
                                }
                            }
                        }
                    }
                    i22 = 0;
                }
                if (this.kernelVersion == null) {
                    this.kernelVersion = new int[2];
                }
                if ((i8 != 0 || i59 != 1) && (i22 != 0 || i59 != 0)) {
                    i23 = i39;
                    i24 = i44;
                    z3 = false;
                    while (!z3) {
                        if (i59 == 0) {
                            i8 = (int) java.lang.Math.ceil(i24 / i22);
                        } else {
                            i22 = (int) java.lang.Math.ceil(i24 / i8);
                        }
                        androidx.constraintlayout.core.widgets.ConstraintWidget[] constraintWidgetArr3 = this.Camera2StreamConfigurationMap;
                        if (constraintWidgetArr3 == null || constraintWidgetArr3.length < i22) {
                            this.Camera2StreamConfigurationMap = new androidx.constraintlayout.core.widgets.ConstraintWidget[i22];
                        } else {
                            java.util.Arrays.fill(constraintWidgetArr3, (java.lang.Object) null);
                        }
                        androidx.constraintlayout.core.widgets.ConstraintWidget[] constraintWidgetArr4 = this.getHighResolutionOutputSizeshNQ4ISI;
                        if (constraintWidgetArr4 == null || constraintWidgetArr4.length < i8) {
                            this.getHighResolutionOutputSizeshNQ4ISI = new androidx.constraintlayout.core.widgets.ConstraintWidget[i8];
                        } else {
                            java.util.Arrays.fill(constraintWidgetArr4, (java.lang.Object) null);
                        }
                        for (int i65 = 0; i65 < i22; i65++) {
                            for (int i66 = 0; i66 < i8; i66++) {
                                int i67 = (i66 * i22) + i65;
                                if (i59 == 1) {
                                    i67 = (i65 * i8) + i66;
                                }
                                if (i67 < constraintWidgetArr2.length && (constraintWidget = constraintWidgetArr2[i67]) != null) {
                                    int highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(constraintWidget, i23);
                                    androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget8 = this.Camera2StreamConfigurationMap[i65];
                                    if (constraintWidget8 == null || constraintWidget8.getWidth() < highSpeedVideoFpsRanges2) {
                                        this.Camera2StreamConfigurationMap[i65] = constraintWidget;
                                    }
                                    int Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(constraintWidget, i23);
                                    androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget9 = this.getHighResolutionOutputSizeshNQ4ISI[i66];
                                    if (constraintWidget9 == null || constraintWidget9.getHeight() < Camera2StreamConfigurationMap2) {
                                        this.getHighResolutionOutputSizeshNQ4ISI[i66] = constraintWidget;
                                    }
                                }
                            }
                        }
                        int i68 = 0;
                        for (int i69 = 0; i69 < i22; i69++) {
                            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget10 = this.Camera2StreamConfigurationMap[i69];
                            if (constraintWidget10 != null) {
                                if (i69 > 0) {
                                    i68 += this.l;
                                }
                                i68 += getHighSpeedVideoFpsRanges(constraintWidget10, i23);
                            }
                        }
                        int i70 = 0;
                        for (int i71 = 0; i71 < i8; i71++) {
                            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget11 = this.getHighResolutionOutputSizeshNQ4ISI[i71];
                            if (constraintWidget11 != null) {
                                if (i71 > 0) {
                                    i70 += this.version;
                                }
                                i70 += Camera2StreamConfigurationMap(constraintWidget11, i23);
                            }
                        }
                        iArr[0] = i68;
                        iArr[1] = i70;
                        if (i59 != 0) {
                            if (i70 > i23 && i8 > 1) {
                                i8--;
                            }
                            z3 = true;
                        } else {
                            if (i68 > i23 && i22 > 1) {
                                i22--;
                            }
                            z3 = true;
                        }
                        while (!z3) {
                        }
                    }
                    iArr2 = this.kernelVersion;
                    iArr2[0] = i22;
                    z = true;
                    iArr2[z ? 1 : 0] = i8;
                    r1 = z;
                } else {
                    i23 = i39;
                    i24 = i44;
                    z3 = true;
                    while (!z3) {
                    }
                    iArr2 = this.kernelVersion;
                    iArr2[0] = i22;
                    z = true;
                    iArr2[z ? 1 : 0] = i8;
                    r1 = z;
                }
            } else if (i45 == 3) {
                int i72 = this.freeTransaction;
                if (i44 != 0) {
                    this.init.clear();
                    int i73 = i39;
                    boolean z7 = true;
                    iArr = iArr3;
                    androidx.constraintlayout.core.widgets.Flow.WidgetsList widgetsList5 = new androidx.constraintlayout.core.widgets.Flow.WidgetsList(i72, this.mLeft, this.mTop, this.mRight, this.mBottom, i73);
                    this.init.add(widgetsList5);
                    if (i72 == 0) {
                        i25 = 0;
                        int i74 = 0;
                        int i75 = 0;
                        int i76 = 0;
                        while (i76 < i44) {
                            int i77 = i74 + 1;
                            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget12 = constraintWidgetArr2[i76];
                            int i78 = i73;
                            int highSpeedVideoFpsRanges3 = getHighSpeedVideoFpsRanges(constraintWidget12, i78);
                            if (constraintWidget12.getHorizontalDimensionBehaviour() == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                                i25++;
                            }
                            int i79 = i25;
                            boolean z8 = ((i75 == i78 || (this.l + i75) + highSpeedVideoFpsRanges3 > i78) && widgetsList5.getHighSpeedVideoFpsRangesFor != null) ? z7 : false;
                            if ((z8 || i76 <= 0 || (i36 = this.free) <= 0 || i77 <= i36) && !z8) {
                                i73 = i78;
                                constraintWidget2 = constraintWidget12;
                                i35 = i76;
                                if (i35 > 0) {
                                    i75 += this.l + highSpeedVideoFpsRanges3;
                                    i74 = i77;
                                    widgetsList5.getHighSpeedVideoSizes(constraintWidget2);
                                    i76 = i35 + 1;
                                    i25 = i79;
                                    z7 = true;
                                }
                            } else {
                                i73 = i78;
                                constraintWidget2 = constraintWidget12;
                                i35 = i76;
                                widgetsList5 = new androidx.constraintlayout.core.widgets.Flow.WidgetsList(i72, this.mLeft, this.mTop, this.mRight, this.mBottom, i73);
                                widgetsList5.getInputSizeshNQ4ISI = i35;
                                this.init.add(widgetsList5);
                                i77 = 1;
                            }
                            i74 = i77;
                            i75 = highSpeedVideoFpsRanges3;
                            widgetsList5.getHighSpeedVideoSizes(constraintWidget2);
                            i76 = i35 + 1;
                            i25 = i79;
                            z7 = true;
                        }
                    } else {
                        i25 = 0;
                        int i80 = 0;
                        int i81 = 0;
                        int i82 = 0;
                        while (i82 < i44) {
                            int i83 = i80 + 1;
                            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget13 = constraintWidgetArr2[i82];
                            int i84 = i73;
                            int Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap(constraintWidget13, i84);
                            if (constraintWidget13.getVerticalDimensionBehaviour() == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                                i25++;
                            }
                            int i85 = i25;
                            boolean z9 = (i81 == i84 || (this.version + i81) + Camera2StreamConfigurationMap3 > i84) && widgetsList5.getHighSpeedVideoFpsRangesFor != null;
                            if ((z9 || i82 <= 0 || (i26 = this.free) <= 0 || i83 <= i26) && !z9) {
                                i73 = i84;
                                if (i82 > 0) {
                                    i81 += this.version + Camera2StreamConfigurationMap3;
                                    i80 = i83;
                                    widgetsList5.getHighSpeedVideoSizes(constraintWidget13);
                                    i82++;
                                    i25 = i85;
                                }
                            } else {
                                i73 = i84;
                                widgetsList5 = new androidx.constraintlayout.core.widgets.Flow.WidgetsList(i72, this.mLeft, this.mTop, this.mRight, this.mBottom, i84);
                                widgetsList5.getInputSizeshNQ4ISI = i82;
                                this.init.add(widgetsList5);
                                i83 = 1;
                            }
                            i80 = i83;
                            i81 = Camera2StreamConfigurationMap3;
                            widgetsList5.getHighSpeedVideoSizes(constraintWidget13);
                            i82++;
                            i25 = i85;
                        }
                    }
                    int size2 = this.init.size();
                    androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor9 = this.mLeft;
                    androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor10 = this.mTop;
                    androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor11 = this.mRight;
                    androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor12 = this.mBottom;
                    int paddingLeft3 = getPaddingLeft();
                    int paddingTop3 = getPaddingTop();
                    int paddingRight4 = getPaddingRight();
                    int paddingBottom3 = getPaddingBottom();
                    boolean z10 = getHorizontalDimensionBehaviour() == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || getVerticalDimensionBehaviour() == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    if (i25 > 0 && z10) {
                        int i86 = 0;
                        while (i86 < size2) {
                            androidx.constraintlayout.core.widgets.Flow.WidgetsList widgetsList6 = this.init.get(i86);
                            if (i72 == 0) {
                                if (widgetsList6.getInputFormats != 0) {
                                    i34 = widgetsList6.getHighSpeedVideoSizesFor;
                                } else {
                                    i34 = widgetsList6.getHighSpeedVideoSizesFor - androidx.constraintlayout.core.widgets.Flow.this.l;
                                }
                                i32 = i73;
                                widgetsList6.Camera2StreamConfigurationMap(i32 - i34);
                                constraintAnchor2 = constraintAnchor9;
                            } else {
                                i32 = i73;
                                constraintAnchor2 = constraintAnchor9;
                                if (widgetsList6.getInputFormats != 1) {
                                    i33 = widgetsList6.getHighSpeedVideoSizes;
                                } else {
                                    i33 = widgetsList6.getHighSpeedVideoSizes - androidx.constraintlayout.core.widgets.Flow.this.version;
                                }
                                widgetsList6.Camera2StreamConfigurationMap(i32 - i33);
                            }
                            i86++;
                            i73 = i32;
                            constraintAnchor9 = constraintAnchor2;
                        }
                    }
                    int i87 = i73;
                    androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor13 = constraintAnchor9;
                    int i88 = 0;
                    int i89 = 0;
                    int i90 = 0;
                    while (i88 < size2) {
                        int i91 = paddingRight2;
                        androidx.constraintlayout.core.widgets.Flow.WidgetsList widgetsList7 = this.init.get(i88);
                        if (i72 == 0) {
                            if (i88 < size2 - 1) {
                                constraintAnchor12 = this.init.get(i88 + 1).getHighSpeedVideoFpsRangesFor.mTop;
                                i27 = paddingLeft;
                                paddingBottom3 = 0;
                            } else {
                                constraintAnchor12 = this.mBottom;
                                paddingBottom3 = getPaddingBottom();
                                i27 = paddingLeft;
                            }
                            androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor14 = widgetsList7.getHighSpeedVideoFpsRangesFor.mBottom;
                            widgetsList7.Camera2StreamConfigurationMap(i72, constraintAnchor13, constraintAnchor10, constraintAnchor11, constraintAnchor12, paddingLeft3, paddingTop3, paddingRight4, paddingBottom3, i87);
                            if (widgetsList7.getInputFormats != 0) {
                                i30 = widgetsList7.getHighSpeedVideoSizesFor;
                            } else {
                                i30 = widgetsList7.getHighSpeedVideoSizesFor - androidx.constraintlayout.core.widgets.Flow.this.l;
                            }
                            int max3 = java.lang.Math.max(i89, i30);
                            if (widgetsList7.getInputFormats != 1) {
                                i31 = widgetsList7.getHighSpeedVideoSizes;
                            } else {
                                i31 = widgetsList7.getHighSpeedVideoSizes - androidx.constraintlayout.core.widgets.Flow.this.version;
                            }
                            int i92 = i31 + i90;
                            if (i88 > 0) {
                                i92 += this.version;
                            }
                            i89 = max3;
                            i90 = i92;
                            constraintAnchor10 = constraintAnchor14;
                            paddingTop3 = 0;
                        } else {
                            i27 = paddingLeft;
                            if (i88 < size2 - 1) {
                                constraintAnchor11 = this.init.get(i88 + 1).getHighSpeedVideoFpsRangesFor.mLeft;
                                paddingRight4 = 0;
                            } else {
                                constraintAnchor11 = this.mRight;
                                paddingRight4 = getPaddingRight();
                            }
                            androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor15 = widgetsList7.getHighSpeedVideoFpsRangesFor.mRight;
                            widgetsList7.Camera2StreamConfigurationMap(i72, constraintAnchor13, constraintAnchor10, constraintAnchor11, constraintAnchor12, paddingLeft3, paddingTop3, paddingRight4, paddingBottom3, i87);
                            if (widgetsList7.getInputFormats != 0) {
                                i28 = widgetsList7.getHighSpeedVideoSizesFor;
                            } else {
                                i28 = widgetsList7.getHighSpeedVideoSizesFor - androidx.constraintlayout.core.widgets.Flow.this.l;
                            }
                            int i93 = i28 + i89;
                            if (widgetsList7.getInputFormats != 1) {
                                i29 = widgetsList7.getHighSpeedVideoSizes;
                            } else {
                                i29 = widgetsList7.getHighSpeedVideoSizes - androidx.constraintlayout.core.widgets.Flow.this.version;
                            }
                            int max4 = java.lang.Math.max(i90, i29);
                            if (i88 > 0) {
                                i93 += this.l;
                            }
                            i89 = i93;
                            i90 = max4;
                            constraintAnchor13 = constraintAnchor15;
                            paddingLeft3 = 0;
                        }
                        i88++;
                        paddingRight2 = i91;
                        paddingLeft = i27;
                    }
                    i5 = paddingLeft;
                    i6 = paddingRight2;
                    iArr[0] = i89;
                    iArr[1] = i90;
                } else {
                    iArr = iArr3;
                    i5 = paddingLeft;
                    i6 = paddingRight2;
                }
            } else {
                iArr = iArr3;
                i5 = paddingLeft;
                i6 = paddingRight2;
                r1 = 1;
            }
            r1 = 1;
        } else {
            iArr = iArr3;
            i5 = paddingLeft;
            i6 = paddingRight2;
            int i94 = this.freeTransaction;
            if (i44 != 0) {
                if (this.init.size() == 0) {
                    widgetsList = new androidx.constraintlayout.core.widgets.Flow.WidgetsList(i94, this.mLeft, this.mTop, this.mRight, this.mBottom, i39);
                    this.init.add(widgetsList);
                } else {
                    widgetsList = this.init.get(0);
                    widgetsList.Camera2StreamConfigurationMap = 0;
                    widgetsList.getHighSpeedVideoFpsRangesFor = null;
                    widgetsList.getHighSpeedVideoSizesFor = 0;
                    widgetsList.getHighSpeedVideoSizes = 0;
                    widgetsList.getInputSizeshNQ4ISI = 0;
                    widgetsList.getHighResolutionOutputSizeshNQ4ISI = 0;
                    widgetsList.getHighSpeedVideoFpsRanges = 0;
                    widgetsList.Camera2StreamConfigurationMap(i94, this.mLeft, this.mTop, this.mRight, this.mBottom, getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom(), i39);
                }
                for (int i95 = 0; i95 < i44; i95++) {
                    widgetsList.getHighSpeedVideoSizes(constraintWidgetArr2[i95]);
                }
                if (widgetsList.getInputFormats != 0) {
                    i7 = widgetsList.getHighSpeedVideoSizesFor;
                } else {
                    i7 = widgetsList.getHighSpeedVideoSizesFor - androidx.constraintlayout.core.widgets.Flow.this.l;
                }
                iArr[0] = i7;
                z = true;
                if (widgetsList.getInputFormats != 1) {
                    i8 = widgetsList.getHighSpeedVideoSizes;
                } else {
                    i8 = widgetsList.getHighSpeedVideoSizes - androidx.constraintlayout.core.widgets.Flow.this.version;
                }
                iArr2 = iArr;
                iArr2[z ? 1 : 0] = i8;
                r1 = z;
            }
            r1 = 1;
        }
        int i96 = iArr[0] + i5 + i6;
        int i97 = iArr[r1] + paddingTop + paddingBottom;
        if (i == 1073741824) {
            i9 = i3;
            z2 = r1;
            i10 = i2;
        } else {
            if (i == Integer.MIN_VALUE) {
                z2 = r1;
                i10 = java.lang.Math.min(i96, i2);
            } else {
                z2 = r1;
                if (i == 0) {
                    i10 = i96;
                } else {
                    i9 = i3;
                    i10 = 0;
                }
            }
            i9 = i3;
        }
        if (i9 == 1073741824) {
            i11 = i4;
        } else if (i9 == Integer.MIN_VALUE) {
            i11 = java.lang.Math.min(i97, i4);
        } else {
            i11 = i9 == 0 ? i97 : 0;
        }
        setMeasure(i10, i11);
        setWidth(i10);
        setHeight(i11);
        needsCallbackFromSolver(this.mWidgetsCount > 0 ? z2 : false);
    }

    class WidgetsList {
        int getInputFormats;
        private androidx.constraintlayout.core.widgets.ConstraintAnchor getOutputMinFrameDuration;
        private int getOutputMinFrameDurationlomOqCM;
        private androidx.constraintlayout.core.widgets.ConstraintAnchor getOutputSizes;
        private int getOutputSizeshNQ4ISI;
        private int getOutputStallDuration;
        private int getOutputStallDurationlomOqCM;
        private androidx.constraintlayout.core.widgets.ConstraintAnchor isOutputSupportedForhNQ4ISI;
        private int toString;
        private androidx.constraintlayout.core.widgets.ConstraintAnchor unwrapAs;
        androidx.constraintlayout.core.widgets.ConstraintWidget getHighSpeedVideoFpsRangesFor = null;
        int Camera2StreamConfigurationMap = 0;
        int getHighSpeedVideoSizesFor = 0;
        int getHighSpeedVideoSizes = 0;
        int getInputSizeshNQ4ISI = 0;
        int getHighResolutionOutputSizeshNQ4ISI = 0;
        int getHighSpeedVideoFpsRanges = 0;

        WidgetsList(int i, androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor, androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor2, androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor3, androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor4, int i2) {
            this.getOutputSizeshNQ4ISI = 0;
            this.toString = 0;
            this.getOutputStallDuration = 0;
            this.getOutputMinFrameDurationlomOqCM = 0;
            this.getOutputStallDurationlomOqCM = 0;
            this.getInputFormats = i;
            this.getOutputSizes = constraintAnchor;
            this.isOutputSupportedForhNQ4ISI = constraintAnchor2;
            this.unwrapAs = constraintAnchor3;
            this.getOutputMinFrameDuration = constraintAnchor4;
            this.getOutputSizeshNQ4ISI = androidx.constraintlayout.core.widgets.Flow.this.getPaddingLeft();
            this.toString = androidx.constraintlayout.core.widgets.Flow.this.getPaddingTop();
            this.getOutputStallDuration = androidx.constraintlayout.core.widgets.Flow.this.getPaddingRight();
            this.getOutputMinFrameDurationlomOqCM = androidx.constraintlayout.core.widgets.Flow.this.getPaddingBottom();
            this.getOutputStallDurationlomOqCM = i2;
        }

        public final void Camera2StreamConfigurationMap(int i, androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor, androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor2, androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor3, androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor4, int i2, int i3, int i4, int i5, int i6) {
            this.getInputFormats = i;
            this.getOutputSizes = constraintAnchor;
            this.isOutputSupportedForhNQ4ISI = constraintAnchor2;
            this.unwrapAs = constraintAnchor3;
            this.getOutputMinFrameDuration = constraintAnchor4;
            this.getOutputSizeshNQ4ISI = i2;
            this.toString = i3;
            this.getOutputStallDuration = i4;
            this.getOutputMinFrameDurationlomOqCM = i5;
            this.getOutputStallDurationlomOqCM = i6;
        }

        public final void getHighSpeedVideoSizes(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget) {
            if (this.getInputFormats == 0) {
                int highSpeedVideoFpsRanges = androidx.constraintlayout.core.widgets.Flow.this.getHighSpeedVideoFpsRanges(constraintWidget, this.getOutputStallDurationlomOqCM);
                if (constraintWidget.getHorizontalDimensionBehaviour() == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.getHighSpeedVideoFpsRanges++;
                    highSpeedVideoFpsRanges = 0;
                }
                this.getHighSpeedVideoSizesFor += highSpeedVideoFpsRanges + (constraintWidget.getVisibility() != 8 ? androidx.constraintlayout.core.widgets.Flow.this.l : 0);
                int Camera2StreamConfigurationMap = androidx.constraintlayout.core.widgets.Flow.this.Camera2StreamConfigurationMap(constraintWidget, this.getOutputStallDurationlomOqCM);
                if (this.getHighSpeedVideoFpsRangesFor == null || this.Camera2StreamConfigurationMap < Camera2StreamConfigurationMap) {
                    this.getHighSpeedVideoFpsRangesFor = constraintWidget;
                    this.Camera2StreamConfigurationMap = Camera2StreamConfigurationMap;
                    this.getHighSpeedVideoSizes = Camera2StreamConfigurationMap;
                }
            } else {
                int highSpeedVideoFpsRanges2 = androidx.constraintlayout.core.widgets.Flow.this.getHighSpeedVideoFpsRanges(constraintWidget, this.getOutputStallDurationlomOqCM);
                int Camera2StreamConfigurationMap2 = androidx.constraintlayout.core.widgets.Flow.this.Camera2StreamConfigurationMap(constraintWidget, this.getOutputStallDurationlomOqCM);
                if (constraintWidget.getVerticalDimensionBehaviour() == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.getHighSpeedVideoFpsRanges++;
                    Camera2StreamConfigurationMap2 = 0;
                }
                this.getHighSpeedVideoSizes += Camera2StreamConfigurationMap2 + (constraintWidget.getVisibility() != 8 ? androidx.constraintlayout.core.widgets.Flow.this.version : 0);
                if (this.getHighSpeedVideoFpsRangesFor == null || this.Camera2StreamConfigurationMap < highSpeedVideoFpsRanges2) {
                    this.getHighSpeedVideoFpsRangesFor = constraintWidget;
                    this.Camera2StreamConfigurationMap = highSpeedVideoFpsRanges2;
                    this.getHighSpeedVideoSizesFor = highSpeedVideoFpsRanges2;
                }
            }
            this.getHighResolutionOutputSizeshNQ4ISI++;
        }

        public final void getHighSpeedVideoFpsRanges(boolean z, int i, boolean z2) {
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget;
            float f;
            int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
            for (int i3 = 0; i3 < i2 && this.getInputSizeshNQ4ISI + i3 < androidx.constraintlayout.core.widgets.Flow.this.release; i3++) {
                androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget2 = androidx.constraintlayout.core.widgets.Flow.this.c[this.getInputSizeshNQ4ISI + i3];
                if (constraintWidget2 != null) {
                    constraintWidget2.resetAnchors();
                }
            }
            if (i2 == 0 || this.getHighSpeedVideoFpsRangesFor == null) {
                return;
            }
            boolean z3 = z2 && i == 0;
            int i4 = -1;
            int i5 = -1;
            for (int i6 = 0; i6 < i2; i6++) {
                int i7 = z ? (i2 - 1) - i6 : i6;
                if (this.getInputSizeshNQ4ISI + i7 >= androidx.constraintlayout.core.widgets.Flow.this.release) {
                    break;
                }
                androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget3 = androidx.constraintlayout.core.widgets.Flow.this.c[this.getInputSizeshNQ4ISI + i7];
                if (constraintWidget3 != null && constraintWidget3.getVisibility() == 0) {
                    if (i4 == -1) {
                        i4 = i6;
                    }
                    i5 = i6;
                }
            }
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget4 = null;
            if (this.getInputFormats == 0) {
                androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget5 = this.getHighSpeedVideoFpsRangesFor;
                constraintWidget5.setVerticalChainStyle(androidx.constraintlayout.core.widgets.Flow.this.newContext);
                int i8 = this.toString;
                if (i > 0) {
                    i8 += androidx.constraintlayout.core.widgets.Flow.this.version;
                }
                constraintWidget5.mTop.connect(this.isOutputSupportedForhNQ4ISI, i8);
                if (z2) {
                    constraintWidget5.mBottom.connect(this.getOutputMinFrameDuration, this.getOutputMinFrameDurationlomOqCM);
                }
                if (i > 0) {
                    this.isOutputSupportedForhNQ4ISI.mOwner.mBottom.connect(constraintWidget5.mTop, 0);
                }
                if (androidx.constraintlayout.core.widgets.Flow.this.start == 3 && !constraintWidget5.hasBaseline()) {
                    for (int i9 = 0; i9 < i2; i9++) {
                        int i10 = z ? (i2 - 1) - i9 : i9;
                        if (this.getInputSizeshNQ4ISI + i10 >= androidx.constraintlayout.core.widgets.Flow.this.release) {
                            break;
                        }
                        constraintWidget = androidx.constraintlayout.core.widgets.Flow.this.c[this.getInputSizeshNQ4ISI + i10];
                        if (constraintWidget.hasBaseline()) {
                            break;
                        }
                    }
                }
                constraintWidget = constraintWidget5;
                for (int i11 = 0; i11 < i2; i11++) {
                    int i12 = z ? (i2 - 1) - i11 : i11;
                    if (this.getInputSizeshNQ4ISI + i12 >= androidx.constraintlayout.core.widgets.Flow.this.release) {
                        return;
                    }
                    androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget6 = androidx.constraintlayout.core.widgets.Flow.this.c[this.getInputSizeshNQ4ISI + i12];
                    if (constraintWidget6 != null) {
                        if (i11 == 0) {
                            constraintWidget6.connect(constraintWidget6.mLeft, this.getOutputSizes, this.getOutputSizeshNQ4ISI);
                        }
                        if (i12 == 0) {
                            int i13 = androidx.constraintlayout.core.widgets.Flow.this.requestPINEntry;
                            float f2 = androidx.constraintlayout.core.widgets.Flow.this.requestGoOnline;
                            if (z) {
                                f2 = 1.0f - f2;
                            }
                            if (this.getInputSizeshNQ4ISI != 0 || androidx.constraintlayout.core.widgets.Flow.this.AMEXKernela == -1) {
                                if (z2 && androidx.constraintlayout.core.widgets.Flow.this.sha1 != -1) {
                                    i13 = androidx.constraintlayout.core.widgets.Flow.this.sha1;
                                    if (z) {
                                        f = androidx.constraintlayout.core.widgets.Flow.this.updateUI;
                                        f2 = 1.0f - f;
                                    } else {
                                        f2 = androidx.constraintlayout.core.widgets.Flow.this.updateUI;
                                    }
                                }
                                constraintWidget6.setHorizontalChainStyle(i13);
                                constraintWidget6.setHorizontalBiasPercent(f2);
                            } else {
                                i13 = androidx.constraintlayout.core.widgets.Flow.this.AMEXKernela;
                                if (z) {
                                    f = androidx.constraintlayout.core.widgets.Flow.this.startTransaction;
                                    f2 = 1.0f - f;
                                    constraintWidget6.setHorizontalChainStyle(i13);
                                    constraintWidget6.setHorizontalBiasPercent(f2);
                                } else {
                                    f2 = androidx.constraintlayout.core.widgets.Flow.this.startTransaction;
                                    constraintWidget6.setHorizontalChainStyle(i13);
                                    constraintWidget6.setHorizontalBiasPercent(f2);
                                }
                            }
                        }
                        if (i11 == i2 - 1) {
                            constraintWidget6.connect(constraintWidget6.mRight, this.unwrapAs, this.getOutputStallDuration);
                        }
                        if (constraintWidget4 != null) {
                            constraintWidget6.mLeft.connect(constraintWidget4.mRight, androidx.constraintlayout.core.widgets.Flow.this.l);
                            if (i11 == i4) {
                                constraintWidget6.mLeft.setGoneMargin(this.getOutputSizeshNQ4ISI);
                            }
                            constraintWidget4.mRight.connect(constraintWidget6.mLeft, 0);
                            if (i11 == i5 + 1) {
                                constraintWidget4.mRight.setGoneMargin(this.getOutputStallDuration);
                            }
                        }
                        if (constraintWidget6 != constraintWidget5) {
                            if (androidx.constraintlayout.core.widgets.Flow.this.start != 3 || !constraintWidget.hasBaseline() || constraintWidget6 == constraintWidget || !constraintWidget6.hasBaseline()) {
                                int i14 = androidx.constraintlayout.core.widgets.Flow.this.start;
                                if (i14 == 0) {
                                    constraintWidget6.mTop.connect(constraintWidget5.mTop, 0);
                                } else if (i14 == 1) {
                                    constraintWidget6.mBottom.connect(constraintWidget5.mBottom, 0);
                                } else if (z3) {
                                    constraintWidget6.mTop.connect(this.isOutputSupportedForhNQ4ISI, this.toString);
                                    constraintWidget6.mBottom.connect(this.getOutputMinFrameDuration, this.getOutputMinFrameDurationlomOqCM);
                                } else {
                                    constraintWidget6.mTop.connect(constraintWidget5.mTop, 0);
                                    constraintWidget6.mBottom.connect(constraintWidget5.mBottom, 0);
                                }
                            } else {
                                constraintWidget6.mBaseline.connect(constraintWidget.mBaseline, 0);
                            }
                        }
                        constraintWidget4 = constraintWidget6;
                    }
                }
                return;
            }
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget7 = this.getHighSpeedVideoFpsRangesFor;
            constraintWidget7.setHorizontalChainStyle(androidx.constraintlayout.core.widgets.Flow.this.requestPINEntry);
            int i15 = this.getOutputSizeshNQ4ISI;
            if (i > 0) {
                i15 += androidx.constraintlayout.core.widgets.Flow.this.l;
            }
            if (z) {
                constraintWidget7.mRight.connect(this.unwrapAs, i15);
                if (z2) {
                    constraintWidget7.mLeft.connect(this.getOutputSizes, this.getOutputStallDuration);
                }
                if (i > 0) {
                    this.unwrapAs.mOwner.mLeft.connect(constraintWidget7.mRight, 0);
                }
            } else {
                constraintWidget7.mLeft.connect(this.getOutputSizes, i15);
                if (z2) {
                    constraintWidget7.mRight.connect(this.unwrapAs, this.getOutputStallDuration);
                }
                if (i > 0) {
                    this.getOutputSizes.mOwner.mRight.connect(constraintWidget7.mLeft, 0);
                }
            }
            for (int i16 = 0; i16 < i2 && this.getInputSizeshNQ4ISI + i16 < androidx.constraintlayout.core.widgets.Flow.this.release; i16++) {
                androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget8 = androidx.constraintlayout.core.widgets.Flow.this.c[this.getInputSizeshNQ4ISI + i16];
                if (constraintWidget8 != null) {
                    if (i16 == 0) {
                        constraintWidget8.connect(constraintWidget8.mTop, this.isOutputSupportedForhNQ4ISI, this.toString);
                        int i17 = androidx.constraintlayout.core.widgets.Flow.this.newContext;
                        float f3 = androidx.constraintlayout.core.widgets.Flow.this.AMEXKernelProvider;
                        if (this.getInputSizeshNQ4ISI != 0 || androidx.constraintlayout.core.widgets.Flow.this.resetTransaction == -1) {
                            if (z2 && androidx.constraintlayout.core.widgets.Flow.this.rsaCipher != -1) {
                                i17 = androidx.constraintlayout.core.widgets.Flow.this.rsaCipher;
                                f3 = androidx.constraintlayout.core.widgets.Flow.this.AMEXKernelJNI;
                            }
                        } else {
                            i17 = androidx.constraintlayout.core.widgets.Flow.this.resetTransaction;
                            f3 = androidx.constraintlayout.core.widgets.Flow.this.exchange;
                        }
                        constraintWidget8.setVerticalChainStyle(i17);
                        constraintWidget8.setVerticalBiasPercent(f3);
                    }
                    if (i16 == i2 - 1) {
                        constraintWidget8.connect(constraintWidget8.mBottom, this.getOutputMinFrameDuration, this.getOutputMinFrameDurationlomOqCM);
                    }
                    if (constraintWidget4 != null) {
                        constraintWidget8.mTop.connect(constraintWidget4.mBottom, androidx.constraintlayout.core.widgets.Flow.this.version);
                        if (i16 == i4) {
                            constraintWidget8.mTop.setGoneMargin(this.toString);
                        }
                        constraintWidget4.mBottom.connect(constraintWidget8.mTop, 0);
                        if (i16 == i5 + 1) {
                            constraintWidget4.mBottom.setGoneMargin(this.getOutputMinFrameDurationlomOqCM);
                        }
                    }
                    if (constraintWidget8 != constraintWidget7) {
                        if (z) {
                            int i18 = androidx.constraintlayout.core.widgets.Flow.this.AMEXKernelCallback;
                            if (i18 == 0) {
                                constraintWidget8.mRight.connect(constraintWidget7.mRight, 0);
                            } else if (i18 == 1) {
                                constraintWidget8.mLeft.connect(constraintWidget7.mLeft, 0);
                            } else if (i18 == 2) {
                                constraintWidget8.mLeft.connect(constraintWidget7.mLeft, 0);
                                constraintWidget8.mRight.connect(constraintWidget7.mRight, 0);
                            }
                        } else {
                            int i19 = androidx.constraintlayout.core.widgets.Flow.this.AMEXKernelCallback;
                            if (i19 == 0) {
                                constraintWidget8.mLeft.connect(constraintWidget7.mLeft, 0);
                            } else if (i19 == 1) {
                                constraintWidget8.mRight.connect(constraintWidget7.mRight, 0);
                            } else if (i19 == 2) {
                                if (z3) {
                                    constraintWidget8.mLeft.connect(this.getOutputSizes, this.getOutputSizeshNQ4ISI);
                                    constraintWidget8.mRight.connect(this.unwrapAs, this.getOutputStallDuration);
                                } else {
                                    constraintWidget8.mLeft.connect(constraintWidget7.mLeft, 0);
                                    constraintWidget8.mRight.connect(constraintWidget7.mRight, 0);
                                }
                            }
                            constraintWidget4 = constraintWidget8;
                        }
                    }
                    constraintWidget4 = constraintWidget8;
                }
            }
        }

        public final void Camera2StreamConfigurationMap(int i) {
            int i2 = this.getHighSpeedVideoFpsRanges;
            if (i2 == 0) {
                return;
            }
            int i3 = this.getHighResolutionOutputSizeshNQ4ISI;
            int i4 = i / i2;
            for (int i5 = 0; i5 < i3 && this.getInputSizeshNQ4ISI + i5 < androidx.constraintlayout.core.widgets.Flow.this.release; i5++) {
                androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = androidx.constraintlayout.core.widgets.Flow.this.c[this.getInputSizeshNQ4ISI + i5];
                if (this.getInputFormats == 0) {
                    if (constraintWidget != null && constraintWidget.getHorizontalDimensionBehaviour() == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mMatchConstraintDefaultWidth == 0) {
                        androidx.constraintlayout.core.widgets.Flow.this.measure(constraintWidget, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED, i4, constraintWidget.getVerticalDimensionBehaviour(), constraintWidget.getHeight());
                    }
                } else if (constraintWidget != null && constraintWidget.getVerticalDimensionBehaviour() == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mMatchConstraintDefaultHeight == 0) {
                    androidx.constraintlayout.core.widgets.Flow.this.measure(constraintWidget, constraintWidget.getHorizontalDimensionBehaviour(), constraintWidget.getWidth(), androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED, i4);
                }
            }
            this.getHighSpeedVideoSizesFor = 0;
            this.getHighSpeedVideoSizes = 0;
            this.getHighSpeedVideoFpsRangesFor = null;
            this.Camera2StreamConfigurationMap = 0;
            int i6 = this.getHighResolutionOutputSizeshNQ4ISI;
            for (int i7 = 0; i7 < i6 && this.getInputSizeshNQ4ISI + i7 < androidx.constraintlayout.core.widgets.Flow.this.release; i7++) {
                androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget2 = androidx.constraintlayout.core.widgets.Flow.this.c[this.getInputSizeshNQ4ISI + i7];
                if (this.getInputFormats != 0) {
                    int highSpeedVideoFpsRanges = androidx.constraintlayout.core.widgets.Flow.this.getHighSpeedVideoFpsRanges(constraintWidget2, this.getOutputStallDurationlomOqCM);
                    int Camera2StreamConfigurationMap = androidx.constraintlayout.core.widgets.Flow.this.Camera2StreamConfigurationMap(constraintWidget2, this.getOutputStallDurationlomOqCM);
                    int i8 = androidx.constraintlayout.core.widgets.Flow.this.version;
                    if (constraintWidget2.getVisibility() == 8) {
                        i8 = 0;
                    }
                    this.getHighSpeedVideoSizes += Camera2StreamConfigurationMap + i8;
                    if (this.getHighSpeedVideoFpsRangesFor == null || this.Camera2StreamConfigurationMap < highSpeedVideoFpsRanges) {
                        this.getHighSpeedVideoFpsRangesFor = constraintWidget2;
                        this.Camera2StreamConfigurationMap = highSpeedVideoFpsRanges;
                        this.getHighSpeedVideoSizesFor = highSpeedVideoFpsRanges;
                    }
                } else {
                    int width = constraintWidget2.getWidth();
                    int i9 = androidx.constraintlayout.core.widgets.Flow.this.l;
                    if (constraintWidget2.getVisibility() == 8) {
                        i9 = 0;
                    }
                    this.getHighSpeedVideoSizesFor += width + i9;
                    int Camera2StreamConfigurationMap2 = androidx.constraintlayout.core.widgets.Flow.this.Camera2StreamConfigurationMap(constraintWidget2, this.getOutputStallDurationlomOqCM);
                    if (this.getHighSpeedVideoFpsRangesFor == null || this.Camera2StreamConfigurationMap < Camera2StreamConfigurationMap2) {
                        this.getHighSpeedVideoFpsRangesFor = constraintWidget2;
                        this.Camera2StreamConfigurationMap = Camera2StreamConfigurationMap2;
                        this.getHighSpeedVideoSizes = Camera2StreamConfigurationMap2;
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void addToSolver(androidx.constraintlayout.core.LinearSystem linearSystem, boolean z) {
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget;
        float f;
        int i;
        super.addToSolver(linearSystem, z);
        boolean z2 = getParent() != null && ((androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) getParent()).isRtl();
        int i2 = this.setup;
        if (i2 != 0) {
            if (i2 == 1) {
                int size = this.init.size();
                int i3 = 0;
                while (i3 < size) {
                    this.init.get(i3).getHighSpeedVideoFpsRanges(z2, i3, i3 == size + (-1));
                    i3++;
                }
            } else if (i2 != 2) {
                if (i2 == 3) {
                    int size2 = this.init.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        this.init.get(i4).getHighSpeedVideoFpsRanges(z2, i4, i4 == size2 + (-1));
                        i4++;
                    }
                }
            } else if (this.kernelVersion != null && this.Camera2StreamConfigurationMap != null && this.getHighResolutionOutputSizeshNQ4ISI != null) {
                for (int i5 = 0; i5 < this.release; i5++) {
                    this.c[i5].resetAnchors();
                }
                int[] iArr = this.kernelVersion;
                int i6 = iArr[0];
                int i7 = iArr[1];
                float f2 = this.requestGoOnline;
                androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget2 = null;
                int i8 = 0;
                while (i8 < i6) {
                    if (z2) {
                        i = (i6 - i8) - 1;
                        f = 1.0f - this.requestGoOnline;
                    } else {
                        f = f2;
                        i = i8;
                    }
                    androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget3 = this.Camera2StreamConfigurationMap[i];
                    if (constraintWidget3 != null && constraintWidget3.getVisibility() != 8) {
                        if (i8 == 0) {
                            constraintWidget3.connect(constraintWidget3.mLeft, this.mLeft, getPaddingLeft());
                            constraintWidget3.setHorizontalChainStyle(this.requestPINEntry);
                            constraintWidget3.setHorizontalBiasPercent(f);
                        }
                        if (i8 == i6 - 1) {
                            constraintWidget3.connect(constraintWidget3.mRight, this.mRight, getPaddingRight());
                        }
                        if (i8 > 0 && constraintWidget2 != null) {
                            constraintWidget3.connect(constraintWidget3.mLeft, constraintWidget2.mRight, this.l);
                            constraintWidget2.connect(constraintWidget2.mRight, constraintWidget3.mLeft, 0);
                        }
                        constraintWidget2 = constraintWidget3;
                    }
                    i8++;
                    f2 = f;
                }
                for (int i9 = 0; i9 < i7; i9++) {
                    androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget4 = this.getHighResolutionOutputSizeshNQ4ISI[i9];
                    if (constraintWidget4 != null && constraintWidget4.getVisibility() != 8) {
                        if (i9 == 0) {
                            constraintWidget4.connect(constraintWidget4.mTop, this.mTop, getPaddingTop());
                            constraintWidget4.setVerticalChainStyle(this.newContext);
                            constraintWidget4.setVerticalBiasPercent(this.AMEXKernelProvider);
                        }
                        if (i9 == i7 - 1) {
                            constraintWidget4.connect(constraintWidget4.mBottom, this.mBottom, getPaddingBottom());
                        }
                        if (i9 > 0 && constraintWidget2 != null) {
                            constraintWidget4.connect(constraintWidget4.mTop, constraintWidget2.mBottom, this.version);
                            constraintWidget2.connect(constraintWidget2.mBottom, constraintWidget4.mTop, 0);
                        }
                        constraintWidget2 = constraintWidget4;
                    }
                }
                for (int i10 = 0; i10 < i6; i10++) {
                    for (int i11 = 0; i11 < i7; i11++) {
                        int i12 = (i11 * i6) + i10;
                        if (this.freeTransaction == 1) {
                            i12 = (i10 * i7) + i11;
                        }
                        androidx.constraintlayout.core.widgets.ConstraintWidget[] constraintWidgetArr = this.c;
                        if (i12 < constraintWidgetArr.length && (constraintWidget = constraintWidgetArr[i12]) != null && constraintWidget.getVisibility() != 8) {
                            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget5 = this.Camera2StreamConfigurationMap[i10];
                            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget6 = this.getHighResolutionOutputSizeshNQ4ISI[i11];
                            if (constraintWidget != constraintWidget5) {
                                constraintWidget.connect(constraintWidget.mLeft, constraintWidget5.mLeft, 0);
                                constraintWidget.connect(constraintWidget.mRight, constraintWidget5.mRight, 0);
                            }
                            if (constraintWidget != constraintWidget6) {
                                constraintWidget.connect(constraintWidget.mTop, constraintWidget6.mTop, 0);
                                constraintWidget.connect(constraintWidget.mBottom, constraintWidget6.mBottom, 0);
                            }
                        }
                    }
                }
            }
        } else if (this.init.size() > 0) {
            this.init.get(0).getHighSpeedVideoFpsRanges(z2, 0, true);
        }
        needsCallbackFromSolver(false);
    }
}
