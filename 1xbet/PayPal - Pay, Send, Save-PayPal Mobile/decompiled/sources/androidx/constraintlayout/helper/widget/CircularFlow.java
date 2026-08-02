package androidx.constraintlayout.helper.widget;

/* loaded from: classes7.dex */
public class CircularFlow extends androidx.constraintlayout.widget.VirtualLayout {
    private static int getHighResolutionOutputSizeshNQ4ISI;
    private static float getHighSpeedVideoSizes;
    androidx.constraintlayout.widget.ConstraintLayout Camera2StreamConfigurationMap;
    private float[] getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizesFor;
    private java.lang.String getInputFormats;
    private int[] getInputSizeshNQ4ISI;
    private java.lang.Float getOutputFormats;
    private int getOutputMinFrameDuration;
    private java.lang.String getOutputMinFrameDurationlomOqCM;
    private java.lang.Integer getOutputSizes;

    public CircularFlow(android.content.Context context) {
        super(context);
    }

    public CircularFlow(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CircularFlow(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public int[] getRadius() {
        return java.util.Arrays.copyOf(this.getInputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor);
    }

    public float[] getAngles() {
        return java.util.Arrays.copyOf(this.getHighSpeedVideoFpsRanges, this.getOutputMinFrameDuration);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public void init(android.util.AttributeSet attributeSet) {
        super.init(attributeSet);
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_circularflow_viewCenter) {
                    this.getHighSpeedVideoFpsRangesFor = obtainStyledAttributes.getResourceId(index, 0);
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_circularflow_angles) {
                    java.lang.String string = obtainStyledAttributes.getString(index);
                    this.getInputFormats = string;
                    Camera2StreamConfigurationMap(string);
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_circularflow_radiusInDP) {
                    java.lang.String string2 = obtainStyledAttributes.getString(index);
                    this.getOutputMinFrameDurationlomOqCM = string2;
                    getHighSpeedVideoFpsRanges(string2);
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_circularflow_defaultAngle) {
                    java.lang.Float valueOf = java.lang.Float.valueOf(obtainStyledAttributes.getFloat(index, getHighSpeedVideoSizes));
                    this.getOutputFormats = valueOf;
                    setDefaultAngle(valueOf.floatValue());
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_circularflow_defaultRadius) {
                    java.lang.Integer valueOf2 = java.lang.Integer.valueOf(obtainStyledAttributes.getDimensionPixelSize(index, getHighResolutionOutputSizeshNQ4ISI));
                    this.getOutputSizes = valueOf2;
                    setDefaultRadius(valueOf2.intValue());
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        java.lang.String str = this.getInputFormats;
        if (str != null) {
            this.getHighSpeedVideoFpsRanges = new float[1];
            Camera2StreamConfigurationMap(str);
        }
        java.lang.String str2 = this.getOutputMinFrameDurationlomOqCM;
        if (str2 != null) {
            this.getInputSizeshNQ4ISI = new int[1];
            getHighSpeedVideoFpsRanges(str2);
        }
        java.lang.Float f = this.getOutputFormats;
        if (f != null) {
            setDefaultAngle(f.floatValue());
        }
        java.lang.Integer num = this.getOutputSizes;
        if (num != null) {
            setDefaultRadius(num.intValue());
        }
        getHighSpeedVideoFpsRanges();
    }

    private void getHighSpeedVideoFpsRanges() {
        this.Camera2StreamConfigurationMap = (androidx.constraintlayout.widget.ConstraintLayout) getParent();
        for (int i = 0; i < this.mCount; i++) {
            android.view.View viewById = this.Camera2StreamConfigurationMap.getViewById(this.mIds[i]);
            if (viewById != null) {
                int i2 = getHighResolutionOutputSizeshNQ4ISI;
                float f = getHighSpeedVideoSizes;
                int[] iArr = this.getInputSizeshNQ4ISI;
                if (iArr != null && i < iArr.length) {
                    i2 = iArr[i];
                } else {
                    java.lang.Integer num = this.getOutputSizes;
                    if (num != null && num.intValue() != -1) {
                        this.getHighSpeedVideoSizesFor++;
                        if (this.getInputSizeshNQ4ISI == null) {
                            this.getInputSizeshNQ4ISI = new int[1];
                        }
                        int[] radius = getRadius();
                        this.getInputSizeshNQ4ISI = radius;
                        radius[this.getHighSpeedVideoSizesFor - 1] = i2;
                    } else {
                        this.mMap.get(java.lang.Integer.valueOf(viewById.getId()));
                    }
                }
                float[] fArr = this.getHighSpeedVideoFpsRanges;
                if (fArr != null && i < fArr.length) {
                    f = fArr[i];
                } else {
                    java.lang.Float f2 = this.getOutputFormats;
                    if (f2 != null && f2.floatValue() != -1.0f) {
                        this.getOutputMinFrameDuration++;
                        if (this.getHighSpeedVideoFpsRanges == null) {
                            this.getHighSpeedVideoFpsRanges = new float[1];
                        }
                        float[] angles = getAngles();
                        this.getHighSpeedVideoFpsRanges = angles;
                        angles[this.getOutputMinFrameDuration - 1] = f;
                    } else {
                        this.mMap.get(java.lang.Integer.valueOf(viewById.getId()));
                    }
                }
                androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) viewById.getLayoutParams();
                layoutParams.circleAngle = f;
                layoutParams.circleConstraint = this.getHighSpeedVideoFpsRangesFor;
                layoutParams.circleRadius = i2;
                viewById.setLayoutParams(layoutParams);
            }
        }
        applyLayoutFeatures();
    }

    public void addViewToCircularFlow(android.view.View view, int i, float f) {
        if (containsId(view.getId())) {
            return;
        }
        addView(view);
        this.getOutputMinFrameDuration++;
        float[] angles = getAngles();
        this.getHighSpeedVideoFpsRanges = angles;
        angles[this.getOutputMinFrameDuration - 1] = f;
        this.getHighSpeedVideoSizesFor++;
        int[] radius = getRadius();
        this.getInputSizeshNQ4ISI = radius;
        radius[this.getHighSpeedVideoSizesFor - 1] = (int) (i * this.myContext.getResources().getDisplayMetrics().density);
        getHighSpeedVideoFpsRanges();
    }

    public void updateRadius(android.view.View view, int i) {
        if (!isUpdatable(view)) {
            view.getId();
            return;
        }
        int indexFromId = indexFromId(view.getId());
        if (indexFromId > this.getInputSizeshNQ4ISI.length) {
            return;
        }
        int[] radius = getRadius();
        this.getInputSizeshNQ4ISI = radius;
        radius[indexFromId] = (int) (i * this.myContext.getResources().getDisplayMetrics().density);
        getHighSpeedVideoFpsRanges();
    }

    public void updateAngle(android.view.View view, float f) {
        if (!isUpdatable(view)) {
            view.getId();
            return;
        }
        int indexFromId = indexFromId(view.getId());
        if (indexFromId > this.getHighSpeedVideoFpsRanges.length) {
            return;
        }
        float[] angles = getAngles();
        this.getHighSpeedVideoFpsRanges = angles;
        angles[indexFromId] = f;
        getHighSpeedVideoFpsRanges();
    }

    public void updateReference(android.view.View view, int i, float f) {
        if (!isUpdatable(view)) {
            view.getId();
            return;
        }
        int indexFromId = indexFromId(view.getId());
        if (getAngles().length > indexFromId) {
            float[] angles = getAngles();
            this.getHighSpeedVideoFpsRanges = angles;
            angles[indexFromId] = f;
        }
        if (getRadius().length > indexFromId) {
            int[] radius = getRadius();
            this.getInputSizeshNQ4ISI = radius;
            radius[indexFromId] = (int) (i * this.myContext.getResources().getDisplayMetrics().density);
        }
        getHighSpeedVideoFpsRanges();
    }

    public void setDefaultAngle(float f) {
        getHighSpeedVideoSizes = f;
    }

    public void setDefaultRadius(int i) {
        getHighResolutionOutputSizeshNQ4ISI = i;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public int removeView(android.view.View view) {
        int removeView = super.removeView(view);
        if (removeView == -1) {
            return removeView;
        }
        androidx.constraintlayout.widget.ConstraintSet constraintSet = new androidx.constraintlayout.widget.ConstraintSet();
        constraintSet.clone(this.Camera2StreamConfigurationMap);
        constraintSet.clear(view.getId(), 8);
        constraintSet.applyTo(this.Camera2StreamConfigurationMap);
        float[] fArr = this.getHighSpeedVideoFpsRanges;
        if (removeView < fArr.length) {
            if (fArr != null && removeView >= 0 && removeView < this.getOutputMinFrameDuration) {
                float[] fArr2 = new float[fArr.length - 1];
                int i = 0;
                for (int i2 = 0; i2 < fArr.length; i2++) {
                    if (i2 != removeView) {
                        fArr2[i] = fArr[i2];
                        i++;
                    }
                }
                fArr = fArr2;
            }
            this.getHighSpeedVideoFpsRanges = fArr;
            this.getOutputMinFrameDuration--;
        }
        int[] iArr = this.getInputSizeshNQ4ISI;
        if (removeView < iArr.length) {
            if (iArr != null && removeView >= 0 && removeView < this.getHighSpeedVideoSizesFor) {
                int[] iArr2 = new int[iArr.length - 1];
                int i3 = 0;
                for (int i4 = 0; i4 < iArr.length; i4++) {
                    if (i4 != removeView) {
                        iArr2[i3] = iArr[i4];
                        i3++;
                    }
                }
                iArr = iArr2;
            }
            this.getInputSizeshNQ4ISI = iArr;
            this.getHighSpeedVideoSizesFor--;
        }
        getHighSpeedVideoFpsRanges();
        return removeView;
    }

    private void Camera2StreamConfigurationMap(java.lang.String str) {
        if (str == null) {
            return;
        }
        int i = 0;
        this.getOutputMinFrameDuration = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                getHighSpeedVideoSizes(str.substring(i).trim());
                return;
            } else {
                getHighSpeedVideoSizes(str.substring(i, indexOf).trim());
                i = indexOf + 1;
            }
        }
    }

    private void getHighSpeedVideoFpsRanges(java.lang.String str) {
        if (str == null) {
            return;
        }
        int i = 0;
        this.getHighSpeedVideoSizesFor = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                getHighSpeedVideoFpsRangesFor(str.substring(i).trim());
                return;
            } else {
                getHighSpeedVideoFpsRangesFor(str.substring(i, indexOf).trim());
                i = indexOf + 1;
            }
        }
    }

    private void getHighSpeedVideoSizes(java.lang.String str) {
        float[] fArr;
        if (str == null || str.length() == 0 || this.myContext == null || (fArr = this.getHighSpeedVideoFpsRanges) == null) {
            return;
        }
        if (this.getOutputMinFrameDuration + 1 > fArr.length) {
            this.getHighSpeedVideoFpsRanges = java.util.Arrays.copyOf(fArr, fArr.length + 1);
        }
        this.getHighSpeedVideoFpsRanges[this.getOutputMinFrameDuration] = java.lang.Integer.parseInt(str);
        this.getOutputMinFrameDuration++;
    }

    private void getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        int[] iArr;
        if (str == null || str.length() == 0 || this.myContext == null || (iArr = this.getInputSizeshNQ4ISI) == null) {
            return;
        }
        if (this.getHighSpeedVideoSizesFor + 1 > iArr.length) {
            this.getInputSizeshNQ4ISI = java.util.Arrays.copyOf(iArr, iArr.length + 1);
        }
        this.getInputSizeshNQ4ISI[this.getHighSpeedVideoSizesFor] = (int) (java.lang.Integer.parseInt(str) * this.myContext.getResources().getDisplayMetrics().density);
        this.getHighSpeedVideoSizesFor++;
    }

    public boolean isUpdatable(android.view.View view) {
        return containsId(view.getId()) && indexFromId(view.getId()) != -1;
    }
}
