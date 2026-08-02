package androidx.constraintlayout.helper.widget;

/* loaded from: classes7.dex */
public class Grid extends androidx.constraintlayout.widget.VirtualLayout {
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;
    private int Camera2StreamConfigurationMap;
    private float CoroutineDebuggingKt;
    private int[] getHighResolutionOutputSizeshNQ4ISI;
    java.util.Set<java.lang.Integer> getHighSpeedVideoFpsRanges;
    androidx.constraintlayout.widget.ConstraintLayout getHighSpeedVideoFpsRangesFor;
    private android.view.View[] getHighSpeedVideoSizes;
    private final int getHighSpeedVideoSizesFor;
    private int getInputFormats;
    private int getInputSizeshNQ4ISI;
    private float getOutputFormats;
    private final int getOutputMinFrameDuration;
    private boolean[][] getOutputMinFrameDurationlomOqCM;
    private java.lang.String getOutputSizes;
    private int getOutputSizeshNQ4ISI;
    private int getOutputStallDuration;
    private int getOutputStallDurationlomOqCM;
    private boolean getValidOutputFormatsForInputhNQ4ISI;
    private boolean isOutputSupportedFor;
    private java.lang.String isOutputSupportedForhNQ4ISI;
    private java.lang.String toString;
    private java.lang.String unwrapAs;

    public Grid(android.content.Context context) {
        super(context);
        this.getOutputMinFrameDuration = 50;
        this.getHighSpeedVideoSizesFor = 50;
        this.getInputFormats = 0;
        this.getHighSpeedVideoFpsRanges = new java.util.HashSet();
    }

    public Grid(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.getOutputMinFrameDuration = 50;
        this.getHighSpeedVideoSizesFor = 50;
        this.getInputFormats = 0;
        this.getHighSpeedVideoFpsRanges = new java.util.HashSet();
    }

    public Grid(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.getOutputMinFrameDuration = 50;
        this.getHighSpeedVideoSizesFor = 50;
        this.getInputFormats = 0;
        this.getHighSpeedVideoFpsRanges = new java.util.HashSet();
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public void init(android.util.AttributeSet attributeSet) {
        super.init(attributeSet);
        this.mUseViewMeasure = true;
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.R.styleable.Grid);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == androidx.constraintlayout.widget.R.styleable.Grid_grid_rows) {
                    this.getOutputSizeshNQ4ISI = obtainStyledAttributes.getInteger(index, 0);
                } else if (index == androidx.constraintlayout.widget.R.styleable.Grid_grid_columns) {
                    this.getInputSizeshNQ4ISI = obtainStyledAttributes.getInteger(index, 0);
                } else if (index == androidx.constraintlayout.widget.R.styleable.Grid_grid_spans) {
                    this.toString = obtainStyledAttributes.getString(index);
                } else if (index == androidx.constraintlayout.widget.R.styleable.Grid_grid_skips) {
                    this.unwrapAs = obtainStyledAttributes.getString(index);
                } else if (index == androidx.constraintlayout.widget.R.styleable.Grid_grid_rowWeights) {
                    this.isOutputSupportedForhNQ4ISI = obtainStyledAttributes.getString(index);
                } else if (index == androidx.constraintlayout.widget.R.styleable.Grid_grid_columnWeights) {
                    this.getOutputSizes = obtainStyledAttributes.getString(index);
                } else if (index == androidx.constraintlayout.widget.R.styleable.Grid_grid_orientation) {
                    this.getOutputStallDurationlomOqCM = obtainStyledAttributes.getInt(index, 0);
                } else if (index == androidx.constraintlayout.widget.R.styleable.Grid_grid_horizontalGaps) {
                    this.getOutputFormats = obtainStyledAttributes.getDimension(index, 0.0f);
                } else if (index == androidx.constraintlayout.widget.R.styleable.Grid_grid_verticalGaps) {
                    this.CoroutineDebuggingKt = obtainStyledAttributes.getDimension(index, 0.0f);
                } else if (index == androidx.constraintlayout.widget.R.styleable.Grid_grid_validateInputs) {
                    this.isOutputSupportedFor = obtainStyledAttributes.getBoolean(index, false);
                } else if (index == androidx.constraintlayout.widget.R.styleable.Grid_grid_useRtl) {
                    this.getValidOutputFormatsForInputhNQ4ISI = obtainStyledAttributes.getBoolean(index, false);
                }
            }
            getHighSpeedVideoFpsRanges();
            getHighSpeedVideoSizes();
            obtainStyledAttributes.recycle();
        }
    }

    private void getHighSpeedVideoFpsRanges() {
        int i;
        int i2 = this.getOutputSizeshNQ4ISI;
        if (i2 == 0 || (i = this.getInputSizeshNQ4ISI) == 0) {
            int i3 = this.getInputSizeshNQ4ISI;
            if (i3 > 0) {
                this.Camera2StreamConfigurationMap = i3;
                this.getOutputStallDuration = ((this.mCount + this.Camera2StreamConfigurationMap) - 1) / this.getInputSizeshNQ4ISI;
                return;
            } else {
                if (i2 > 0) {
                    this.getOutputStallDuration = i2;
                    int i4 = this.mCount;
                    this.Camera2StreamConfigurationMap = ((i4 + r1) - 1) / this.getOutputSizeshNQ4ISI;
                    return;
                }
                this.getOutputStallDuration = (int) (java.lang.Math.sqrt(this.mCount) + 1.5d);
                int i5 = this.mCount;
                this.Camera2StreamConfigurationMap = ((i5 + r1) - 1) / this.getOutputStallDuration;
                return;
            }
        }
        this.getOutputStallDuration = i2;
        this.Camera2StreamConfigurationMap = i;
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.getHighSpeedVideoFpsRangesFor = (androidx.constraintlayout.widget.ConstraintLayout) getParent();
        getHighSpeedVideoFpsRangesFor(false);
    }

    private boolean getHighSpeedVideoFpsRangesFor(boolean z) {
        int i;
        int i2;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int i6;
        int[][] highResolutionOutputSizeshNQ4ISI;
        boolean z4;
        int i7;
        int i8;
        int[][] highResolutionOutputSizeshNQ4ISI2;
        boolean z5;
        int i9;
        int i10;
        if (this.getHighSpeedVideoFpsRangesFor == null || this.getOutputStallDuration <= 0 || this.Camera2StreamConfigurationMap <= 0) {
            return false;
        }
        if (z) {
            for (int i11 = 0; i11 < this.getOutputMinFrameDurationlomOqCM.length; i11++) {
                int i12 = 0;
                while (true) {
                    boolean[][] zArr = this.getOutputMinFrameDurationlomOqCM;
                    if (i12 < zArr[0].length) {
                        zArr[i11][i12] = true;
                        i12++;
                    }
                }
            }
            this.getHighSpeedVideoFpsRanges.clear();
        }
        this.getInputFormats = 0;
        int max = java.lang.Math.max(this.getOutputStallDuration, this.Camera2StreamConfigurationMap);
        android.view.View[] viewArr = this.getHighSpeedVideoSizes;
        if (viewArr == null) {
            this.getHighSpeedVideoSizes = new android.view.View[max];
            int i13 = 0;
            while (true) {
                android.view.View[] viewArr2 = this.getHighSpeedVideoSizes;
                if (i13 >= viewArr2.length) {
                    break;
                }
                viewArr2[i13] = Camera2StreamConfigurationMap();
                i13++;
            }
        } else if (max != viewArr.length) {
            android.view.View[] viewArr3 = new android.view.View[max];
            for (int i14 = 0; i14 < max; i14++) {
                android.view.View[] viewArr4 = this.getHighSpeedVideoSizes;
                if (i14 < viewArr4.length) {
                    viewArr3[i14] = viewArr4[i14];
                } else {
                    viewArr3[i14] = Camera2StreamConfigurationMap();
                }
            }
            int i15 = max;
            while (true) {
                android.view.View[] viewArr5 = this.getHighSpeedVideoSizes;
                if (i15 >= viewArr5.length) {
                    break;
                }
                this.getHighSpeedVideoFpsRangesFor.removeView(viewArr5[i15]);
                i15++;
            }
            this.getHighSpeedVideoSizes = viewArr3;
        }
        this.getHighResolutionOutputSizeshNQ4ISI = new int[max];
        int i16 = 0;
        while (true) {
            android.view.View[] viewArr6 = this.getHighSpeedVideoSizes;
            if (i16 >= viewArr6.length) {
                break;
            }
            this.getHighResolutionOutputSizeshNQ4ISI[i16] = viewArr6[i16].getId();
            i16++;
        }
        int id = getId();
        int max2 = java.lang.Math.max(this.getOutputStallDuration, this.Camera2StreamConfigurationMap);
        float[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(this.getOutputStallDuration, this.isOutputSupportedForhNQ4ISI);
        if (this.getOutputStallDuration == 1) {
            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) this.getHighSpeedVideoSizes[0].getLayoutParams();
            getHighSpeedVideoSizes(this.getHighSpeedVideoSizes[0]);
            layoutParams.topToTop = id;
            layoutParams.bottomToBottom = id;
            this.getHighSpeedVideoSizes[0].setLayoutParams(layoutParams);
        } else {
            int i17 = 0;
            while (true) {
                i = this.getOutputStallDuration;
                if (i17 >= i) {
                    break;
                }
                androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) this.getHighSpeedVideoSizes[i17].getLayoutParams();
                getHighSpeedVideoSizes(this.getHighSpeedVideoSizes[i17]);
                if (highSpeedVideoFpsRangesFor != null) {
                    layoutParams2.verticalWeight = highSpeedVideoFpsRangesFor[i17];
                }
                if (i17 > 0) {
                    layoutParams2.topToBottom = this.getHighResolutionOutputSizeshNQ4ISI[i17 - 1];
                } else {
                    layoutParams2.topToTop = id;
                }
                if (i17 < this.getOutputStallDuration - 1) {
                    layoutParams2.bottomToTop = this.getHighResolutionOutputSizeshNQ4ISI[i17 + 1];
                } else {
                    layoutParams2.bottomToBottom = id;
                }
                if (i17 > 0) {
                    layoutParams2.topMargin = (int) this.getOutputFormats;
                }
                this.getHighSpeedVideoSizes[i17].setLayoutParams(layoutParams2);
                i17++;
            }
            while (i < max2) {
                androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams3 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) this.getHighSpeedVideoSizes[i].getLayoutParams();
                getHighSpeedVideoSizes(this.getHighSpeedVideoSizes[i]);
                layoutParams3.topToTop = id;
                layoutParams3.bottomToBottom = id;
                this.getHighSpeedVideoSizes[i].setLayoutParams(layoutParams3);
                i++;
            }
        }
        int id2 = getId();
        int max3 = java.lang.Math.max(this.getOutputStallDuration, this.Camera2StreamConfigurationMap);
        float[] highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap, this.getOutputSizes);
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams4 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) this.getHighSpeedVideoSizes[0].getLayoutParams();
        if (this.Camera2StreamConfigurationMap == 1) {
            getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes[0]);
            layoutParams4.leftToLeft = id2;
            layoutParams4.rightToRight = id2;
            this.getHighSpeedVideoSizes[0].setLayoutParams(layoutParams4);
        } else {
            int i18 = 0;
            while (true) {
                i2 = this.Camera2StreamConfigurationMap;
                if (i18 >= i2) {
                    break;
                }
                androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams5 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) this.getHighSpeedVideoSizes[i18].getLayoutParams();
                getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes[i18]);
                if (highSpeedVideoFpsRangesFor2 != null) {
                    layoutParams5.horizontalWeight = highSpeedVideoFpsRangesFor2[i18];
                }
                if (i18 > 0) {
                    layoutParams5.leftToRight = this.getHighResolutionOutputSizeshNQ4ISI[i18 - 1];
                } else {
                    layoutParams5.leftToLeft = id2;
                }
                if (i18 < this.Camera2StreamConfigurationMap - 1) {
                    layoutParams5.rightToLeft = this.getHighResolutionOutputSizeshNQ4ISI[i18 + 1];
                } else {
                    layoutParams5.rightToRight = id2;
                }
                if (i18 > 0) {
                    layoutParams5.leftMargin = (int) this.getOutputFormats;
                }
                this.getHighSpeedVideoSizes[i18].setLayoutParams(layoutParams5);
                i18++;
            }
            while (i2 < max3) {
                androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams6 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) this.getHighSpeedVideoSizes[i2].getLayoutParams();
                getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes[i2]);
                layoutParams6.leftToLeft = id2;
                layoutParams6.rightToRight = id2;
                this.getHighSpeedVideoSizes[i2].setLayoutParams(layoutParams6);
                i2++;
            }
        }
        java.lang.String str = this.unwrapAs;
        if (str == null || str.trim().isEmpty() || (highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(this.unwrapAs)) == null) {
            z2 = true;
        } else {
            int i19 = 0;
            while (true) {
                if (i19 >= highResolutionOutputSizeshNQ4ISI2.length) {
                    z5 = true;
                    break;
                }
                int[] iArr = highResolutionOutputSizeshNQ4ISI2[i19];
                int i20 = iArr[0];
                int i21 = this.getOutputStallDurationlomOqCM;
                if (i21 == 1) {
                    i9 = i20 % this.getOutputStallDuration;
                } else {
                    i9 = i20 / this.Camera2StreamConfigurationMap;
                }
                if (i21 == 1) {
                    i10 = i20 / this.getOutputStallDuration;
                } else {
                    i10 = i20 % this.Camera2StreamConfigurationMap;
                }
                if (!getHighSpeedVideoSizes(i9, i10, iArr[1], iArr[2])) {
                    z5 = false;
                    break;
                }
                i19++;
            }
            z2 = z5;
        }
        java.lang.String str2 = this.toString;
        if (str2 != null && !str2.trim().isEmpty() && (highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(this.toString)) != null) {
            int[] iArr2 = this.mIds;
            android.view.View[] views = getViews(this.getHighSpeedVideoFpsRangesFor);
            int i22 = 0;
            while (true) {
                if (i22 >= highResolutionOutputSizeshNQ4ISI.length) {
                    z4 = true;
                    break;
                }
                int[] iArr3 = highResolutionOutputSizeshNQ4ISI[i22];
                int i23 = iArr3[0];
                int i24 = this.getOutputStallDurationlomOqCM;
                if (i24 == 1) {
                    i7 = i23 % this.getOutputStallDuration;
                } else {
                    i7 = i23 / this.Camera2StreamConfigurationMap;
                }
                if (i24 == 1) {
                    i8 = i23 / this.getOutputStallDuration;
                } else {
                    i8 = i23 % this.Camera2StreamConfigurationMap;
                }
                int i25 = i8;
                if (!getHighSpeedVideoSizes(i7, i25, iArr3[1], iArr3[2])) {
                    z4 = false;
                    break;
                }
                android.view.View view = views[i22];
                int[] iArr4 = highResolutionOutputSizeshNQ4ISI[i22];
                Camera2StreamConfigurationMap(view, i7, i25, iArr4[1], iArr4[2]);
                this.getHighSpeedVideoFpsRanges.add(java.lang.Integer.valueOf(iArr2[i22]));
                i22++;
            }
            z2 &= z4;
        }
        android.view.View[] views2 = getViews(this.getHighSpeedVideoFpsRangesFor);
        int i26 = 0;
        while (true) {
            if (i26 >= this.mCount) {
                z3 = true;
                break;
            }
            if (!this.getHighSpeedVideoFpsRanges.contains(java.lang.Integer.valueOf(this.mIds[i26]))) {
                boolean z6 = false;
                int i27 = 0;
                while (true) {
                    if (z6) {
                        break;
                    }
                    i27 = this.getInputFormats;
                    int i28 = this.getOutputStallDuration;
                    int i29 = this.Camera2StreamConfigurationMap;
                    if (i27 >= i28 * i29) {
                        i27 = -1;
                        break;
                    }
                    int i30 = this.getOutputStallDurationlomOqCM;
                    if (i30 == 1) {
                        i5 = i27 % i28;
                    } else {
                        i5 = i27 / i29;
                    }
                    if (i30 == 1) {
                        i6 = i27 / i28;
                    } else {
                        i6 = i27 % i29;
                    }
                    boolean[] zArr2 = this.getOutputMinFrameDurationlomOqCM[i5];
                    if (zArr2[i6]) {
                        zArr2[i6] = false;
                        z6 = true;
                    }
                    this.getInputFormats = i27 + 1;
                }
                int i31 = this.getOutputStallDurationlomOqCM;
                if (i31 == 1) {
                    i3 = i27 % this.getOutputStallDuration;
                } else {
                    i3 = i27 / this.Camera2StreamConfigurationMap;
                }
                if (i31 == 1) {
                    i4 = i27 / this.getOutputStallDuration;
                } else {
                    i4 = i27 % this.Camera2StreamConfigurationMap;
                }
                int i32 = i4;
                if (i27 == -1) {
                    z3 = false;
                    break;
                }
                Camera2StreamConfigurationMap(views2[i26], i3, i32, 1, 1);
            }
            i26++;
        }
        return (z3 && z2) || !this.isOutputSupportedFor;
    }

    private void getHighSpeedVideoSizes() {
        boolean[][] zArr = (boolean[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Boolean.TYPE, this.getOutputStallDuration, this.Camera2StreamConfigurationMap);
        this.getOutputMinFrameDurationlomOqCM = zArr;
        for (boolean[] zArr2 : zArr) {
            java.util.Arrays.fill(zArr2, true);
        }
    }

    private static float[] getHighSpeedVideoFpsRangesFor(int i, java.lang.String str) {
        float[] fArr = null;
        if (str != null && !str.trim().isEmpty()) {
            java.lang.String[] split = str.split(",");
            if (split.length != i) {
                return null;
            }
            fArr = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                fArr[i2] = java.lang.Float.parseFloat(split[i2].trim());
            }
        }
        return fArr;
    }

    private static int[][] getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
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

    private boolean getHighSpeedVideoSizes(int i, int i2, int i3, int i4) {
        for (int i5 = i; i5 < i + i3; i5++) {
            for (int i6 = i2; i6 < i2 + i4; i6++) {
                boolean[][] zArr = this.getOutputMinFrameDurationlomOqCM;
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

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (isInEditMode()) {
            android.graphics.Paint paint = new android.graphics.Paint();
            paint.setColor(androidx.core.internal.view.SupportMenu.CATEGORY_MASK);
            paint.setStyle(android.graphics.Paint.Style.STROKE);
            int top = getTop();
            int left = getLeft();
            int bottom = getBottom();
            int right = getRight();
            for (android.view.View view : this.getHighSpeedVideoSizes) {
                int left2 = view.getLeft();
                int top2 = view.getTop();
                int right2 = view.getRight();
                int bottom2 = view.getBottom();
                canvas.drawRect(left2 - left, 0.0f, right2 - left, bottom - top, paint);
                canvas.drawRect(0.0f, top2 - top, right - left, bottom2 - top, paint);
            }
        }
    }

    private android.view.View Camera2StreamConfigurationMap() {
        android.view.View view = new android.view.View(getContext());
        view.setId(android.view.View.generateViewId());
        view.setVisibility(4);
        this.getHighSpeedVideoFpsRangesFor.addView(view, new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(0, 0));
        return view;
    }

    public int getRows() {
        return this.getOutputSizeshNQ4ISI;
    }

    public void setRows(int i) {
        if (i > 50 || this.getOutputSizeshNQ4ISI == i) {
            return;
        }
        this.getOutputSizeshNQ4ISI = i;
        getHighSpeedVideoFpsRanges();
        getHighSpeedVideoSizes();
        getHighSpeedVideoFpsRangesFor(false);
        invalidate();
    }

    public int getColumns() {
        return this.getInputSizeshNQ4ISI;
    }

    public void setColumns(int i) {
        if (i > 50 || this.getInputSizeshNQ4ISI == i) {
            return;
        }
        this.getInputSizeshNQ4ISI = i;
        getHighSpeedVideoFpsRanges();
        getHighSpeedVideoSizes();
        getHighSpeedVideoFpsRangesFor(false);
        invalidate();
    }

    public int getOrientation() {
        return this.getOutputStallDurationlomOqCM;
    }

    public void setOrientation(int i) {
        if ((i == 0 || i == 1) && this.getOutputStallDurationlomOqCM != i) {
            this.getOutputStallDurationlomOqCM = i;
            getHighSpeedVideoFpsRangesFor(true);
            invalidate();
        }
    }

    public java.lang.String getSpans() {
        return this.toString;
    }

    public void setSpans(java.lang.CharSequence charSequence) {
        java.lang.String str = this.toString;
        if (str == null || !str.contentEquals(charSequence)) {
            this.toString = charSequence.toString();
            getHighSpeedVideoFpsRangesFor(true);
            invalidate();
        }
    }

    public java.lang.String getSkips() {
        return this.unwrapAs;
    }

    public void setSkips(java.lang.String str) {
        java.lang.String str2 = this.unwrapAs;
        if (str2 == null || !str2.equals(str)) {
            this.unwrapAs = str;
            getHighSpeedVideoFpsRangesFor(true);
            invalidate();
        }
    }

    public java.lang.String getRowWeights() {
        return this.isOutputSupportedForhNQ4ISI;
    }

    public void setRowWeights(java.lang.String str) {
        java.lang.String str2 = this.isOutputSupportedForhNQ4ISI;
        if (str2 == null || !str2.equals(str)) {
            this.isOutputSupportedForhNQ4ISI = str;
            getHighSpeedVideoFpsRangesFor(true);
            invalidate();
        }
    }

    public java.lang.String getColumnWeights() {
        return this.getOutputSizes;
    }

    public void setColumnWeights(java.lang.String str) {
        java.lang.String str2 = this.getOutputSizes;
        if (str2 == null || !str2.equals(str)) {
            this.getOutputSizes = str;
            getHighSpeedVideoFpsRangesFor(true);
            invalidate();
        }
    }

    public float getHorizontalGaps() {
        return this.getOutputFormats;
    }

    public void setHorizontalGaps(float f) {
        if (f < 0.0f || this.getOutputFormats == f) {
            return;
        }
        this.getOutputFormats = f;
        getHighSpeedVideoFpsRangesFor(true);
        invalidate();
    }

    public float getVerticalGaps() {
        return this.CoroutineDebuggingKt;
    }

    public void setVerticalGaps(float f) {
        if (f < 0.0f || this.CoroutineDebuggingKt == f) {
            return;
        }
        this.CoroutineDebuggingKt = f;
        getHighSpeedVideoFpsRangesFor(true);
        invalidate();
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(android.view.View view) {
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) view.getLayoutParams();
        layoutParams.horizontalWeight = -1.0f;
        layoutParams.leftToRight = -1;
        layoutParams.leftToLeft = -1;
        layoutParams.rightToLeft = -1;
        layoutParams.rightToRight = -1;
        layoutParams.leftMargin = -1;
        view.setLayoutParams(layoutParams);
    }

    private static void getHighSpeedVideoSizes(android.view.View view) {
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) view.getLayoutParams();
        layoutParams.verticalWeight = -1.0f;
        layoutParams.topToBottom = -1;
        layoutParams.topToTop = -1;
        layoutParams.bottomToTop = -1;
        layoutParams.bottomToBottom = -1;
        layoutParams.topMargin = -1;
        view.setLayoutParams(layoutParams);
    }

    private void Camera2StreamConfigurationMap(android.view.View view, int i, int i2, int i3, int i4) {
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) view.getLayoutParams();
        layoutParams.leftToLeft = this.getHighResolutionOutputSizeshNQ4ISI[i2];
        layoutParams.topToTop = this.getHighResolutionOutputSizeshNQ4ISI[i];
        layoutParams.rightToRight = this.getHighResolutionOutputSizeshNQ4ISI[(i2 + i4) - 1];
        layoutParams.bottomToBottom = this.getHighResolutionOutputSizeshNQ4ISI[(i + i3) - 1];
        view.setLayoutParams(layoutParams);
    }
}
