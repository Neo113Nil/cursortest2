package androidx.appcompat.widget;

/* loaded from: classes3.dex */
class AppCompatTextViewAutoSizeHelper {
    private final androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl getInputSizeshNQ4ISI;
    private final android.content.Context getOutputFormats;
    private final android.widget.TextView getOutputMinFrameDurationlomOqCM;
    private android.text.TextPaint getOutputSizeshNQ4ISI;
    private static final android.graphics.RectF getHighSpeedVideoFpsRangesFor = new android.graphics.RectF();
    private static java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.reflect.Method> getHighSpeedVideoFpsRanges = new java.util.concurrent.ConcurrentHashMap<>();
    private int getHighSpeedVideoSizesFor = 0;
    private boolean getOutputSizes = false;
    private float getHighSpeedVideoSizes = -1.0f;
    private float Camera2StreamConfigurationMap = -1.0f;
    private float getHighResolutionOutputSizeshNQ4ISI = -1.0f;
    private int[] getInputFormats = new int[0];
    private boolean getOutputMinFrameDuration = false;

    static class Impl {
        void getHighResolutionOutputSizeshNQ4ISI(android.text.StaticLayout.Builder builder, android.widget.TextView textView) {
        }

        Impl() {
        }

        boolean Camera2StreamConfigurationMap(android.widget.TextView textView) {
            return ((java.lang.Boolean) androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.getHighSpeedVideoFpsRangesFor(textView, "getHorizontallyScrolling", java.lang.Boolean.FALSE)).booleanValue();
        }
    }

    static class Impl23 extends androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl {
        Impl23() {
        }

        @Override // androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl
        void getHighResolutionOutputSizeshNQ4ISI(android.text.StaticLayout.Builder builder, android.widget.TextView textView) {
            builder.setTextDirection((android.text.TextDirectionHeuristic) androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.getHighSpeedVideoFpsRangesFor(textView, "getTextDirectionHeuristic", android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    static class Impl29 extends androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl23 {
        Impl29() {
        }

        @Override // androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl
        boolean Camera2StreamConfigurationMap(android.widget.TextView textView) {
            return textView.isHorizontallyScrollable();
        }

        @Override // androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl23, androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl
        void getHighResolutionOutputSizeshNQ4ISI(android.text.StaticLayout.Builder builder, android.widget.TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }
    }

    AppCompatTextViewAutoSizeHelper(android.widget.TextView textView) {
        this.getOutputMinFrameDurationlomOqCM = textView;
        this.getOutputFormats = textView.getContext();
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            this.getInputSizeshNQ4ISI = new androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl29();
        } else {
            this.getInputSizeshNQ4ISI = new androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl23();
        }
    }

    void getHighSpeedVideoSizes(android.util.AttributeSet attributeSet, int i) {
        int resourceId;
        android.content.res.TypedArray obtainStyledAttributes = this.getOutputFormats.obtainStyledAttributes(attributeSet, androidx.appcompat.R.styleable.AppCompatTextView, i, 0);
        android.widget.TextView textView = this.getOutputMinFrameDurationlomOqCM;
        androidx.core.view.ViewCompat.saveAttributeDataForStyleable(textView, textView.getContext(), androidx.appcompat.R.styleable.AppCompatTextView, attributeSet, obtainStyledAttributes, i, 0);
        if (obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.AppCompatTextView_autoSizeTextType)) {
            this.getHighSpeedVideoSizesFor = obtainStyledAttributes.getInt(androidx.appcompat.R.styleable.AppCompatTextView_autoSizeTextType, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.AppCompatTextView_autoSizeStepGranularity) ? obtainStyledAttributes.getDimension(androidx.appcompat.R.styleable.AppCompatTextView_autoSizeStepGranularity, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.AppCompatTextView_autoSizeMinTextSize) ? obtainStyledAttributes.getDimension(androidx.appcompat.R.styleable.AppCompatTextView_autoSizeMinTextSize, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.AppCompatTextView_autoSizeMaxTextSize) ? obtainStyledAttributes.getDimension(androidx.appcompat.R.styleable.AppCompatTextView_autoSizeMaxTextSize, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.AppCompatTextView_autoSizePresetSizes) && (resourceId = obtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.AppCompatTextView_autoSizePresetSizes, 0)) > 0) {
            android.content.res.TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            Camera2StreamConfigurationMap(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (getOutputStallDurationlomOqCM()) {
            if (this.getHighSpeedVideoSizesFor == 1) {
                if (!this.getOutputMinFrameDuration) {
                    android.util.DisplayMetrics displayMetrics = this.getOutputFormats.getResources().getDisplayMetrics();
                    if (dimension2 == -1.0f) {
                        dimension2 = android.util.TypedValue.applyDimension(2, 12.0f, displayMetrics);
                    }
                    if (dimension3 == -1.0f) {
                        dimension3 = android.util.TypedValue.applyDimension(2, 112.0f, displayMetrics);
                    }
                    if (dimension == -1.0f) {
                        dimension = 1.0f;
                    }
                    getHighSpeedVideoFpsRanges(dimension2, dimension3, dimension);
                }
                getInputSizeshNQ4ISI();
                return;
            }
            return;
        }
        this.getHighSpeedVideoSizesFor = 0;
    }

    void getHighResolutionOutputSizeshNQ4ISI(int i) {
        if (getOutputStallDurationlomOqCM()) {
            if (i == 0) {
                getOutputMinFrameDuration();
                return;
            }
            if (i == 1) {
                android.util.DisplayMetrics displayMetrics = this.getOutputFormats.getResources().getDisplayMetrics();
                getHighSpeedVideoFpsRanges(android.util.TypedValue.applyDimension(2, 12.0f, displayMetrics), android.util.TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                if (getInputSizeshNQ4ISI()) {
                    getHighResolutionOutputSizeshNQ4ISI();
                    return;
                }
                return;
            }
            throw new java.lang.IllegalArgumentException("Unknown auto-size text type: ".concat(java.lang.String.valueOf(i)));
        }
    }

    void getHighSpeedVideoSizes(int i, int i2, int i3, int i4) throws java.lang.IllegalArgumentException {
        if (getOutputStallDurationlomOqCM()) {
            android.util.DisplayMetrics displayMetrics = this.getOutputFormats.getResources().getDisplayMetrics();
            getHighSpeedVideoFpsRanges(android.util.TypedValue.applyDimension(i4, i, displayMetrics), android.util.TypedValue.applyDimension(i4, i2, displayMetrics), android.util.TypedValue.applyDimension(i4, i3, displayMetrics));
            if (getInputSizeshNQ4ISI()) {
                getHighResolutionOutputSizeshNQ4ISI();
            }
        }
    }

    void getHighSpeedVideoSizes(int[] iArr, int i) throws java.lang.IllegalArgumentException {
        if (getOutputStallDurationlomOqCM()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = java.util.Arrays.copyOf(iArr, length);
                } else {
                    android.util.DisplayMetrics displayMetrics = this.getOutputFormats.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = java.lang.Math.round(android.util.TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                this.getInputFormats = Camera2StreamConfigurationMap(iArr2);
                if (!getHighSpeedVideoSizesFor()) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("None of the preset sizes is valid: ");
                    sb.append(java.util.Arrays.toString(iArr));
                    throw new java.lang.IllegalArgumentException(sb.toString());
                }
            } else {
                this.getOutputMinFrameDuration = false;
            }
            if (getInputSizeshNQ4ISI()) {
                getHighResolutionOutputSizeshNQ4ISI();
            }
        }
    }

    int getOutputFormats() {
        return this.getHighSpeedVideoSizesFor;
    }

    int getHighSpeedVideoSizes() {
        return java.lang.Math.round(this.getHighSpeedVideoSizes);
    }

    int getHighSpeedVideoFpsRangesFor() {
        return java.lang.Math.round(this.Camera2StreamConfigurationMap);
    }

    int getHighSpeedVideoFpsRanges() {
        return java.lang.Math.round(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    int[] Camera2StreamConfigurationMap() {
        return this.getInputFormats;
    }

    private void Camera2StreamConfigurationMap(android.content.res.TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.getInputFormats = Camera2StreamConfigurationMap(iArr);
            getHighSpeedVideoSizesFor();
        }
    }

    private boolean getHighSpeedVideoSizesFor() {
        boolean z = this.getInputFormats.length > 0;
        this.getOutputMinFrameDuration = z;
        if (z) {
            this.getHighSpeedVideoSizesFor = 1;
            this.Camera2StreamConfigurationMap = r0[0];
            this.getHighResolutionOutputSizeshNQ4ISI = r0[r1 - 1];
            this.getHighSpeedVideoSizes = -1.0f;
        }
        return z;
    }

    private int[] Camera2StreamConfigurationMap(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            java.util.Arrays.sort(iArr);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i : iArr) {
                if (i > 0 && java.util.Collections.binarySearch(arrayList, java.lang.Integer.valueOf(i)) < 0) {
                    arrayList.add(java.lang.Integer.valueOf(i));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i2 = 0; i2 < size; i2++) {
                    iArr2[i2] = ((java.lang.Integer) arrayList.get(i2)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    private void getHighSpeedVideoFpsRanges(float f, float f2, float f3) throws java.lang.IllegalArgumentException {
        if (f <= 0.0f) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Minimum auto-size text size (");
            sb.append(f);
            sb.append("px) is less or equal to (0px)");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (f2 <= f) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Maximum auto-size text size (");
            sb2.append(f2);
            sb2.append("px) is less or equal to minimum auto-size text size (");
            sb2.append(f);
            sb2.append("px)");
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
        if (f3 <= 0.0f) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("The auto-size step granularity (");
            sb3.append(f3);
            sb3.append("px) is less or equal to (0px)");
            throw new java.lang.IllegalArgumentException(sb3.toString());
        }
        this.getHighSpeedVideoSizesFor = 1;
        this.Camera2StreamConfigurationMap = f;
        this.getHighResolutionOutputSizeshNQ4ISI = f2;
        this.getHighSpeedVideoSizes = f3;
        this.getOutputMinFrameDuration = false;
    }

    private boolean getInputSizeshNQ4ISI() {
        if (getOutputStallDurationlomOqCM() && this.getHighSpeedVideoSizesFor == 1) {
            if (!this.getOutputMinFrameDuration || this.getInputFormats.length == 0) {
                int floor = ((int) java.lang.Math.floor((this.getHighResolutionOutputSizeshNQ4ISI - this.Camera2StreamConfigurationMap) / this.getHighSpeedVideoSizes)) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = java.lang.Math.round(this.Camera2StreamConfigurationMap + (i * this.getHighSpeedVideoSizes));
                }
                this.getInputFormats = Camera2StreamConfigurationMap(iArr);
            }
            this.getOutputSizes = true;
        } else {
            this.getOutputSizes = false;
        }
        return this.getOutputSizes;
    }

    void getHighResolutionOutputSizeshNQ4ISI() {
        int measuredWidth;
        if (getInputFormats()) {
            if (this.getOutputSizes) {
                if (this.getOutputMinFrameDurationlomOqCM.getMeasuredHeight() <= 0 || this.getOutputMinFrameDurationlomOqCM.getMeasuredWidth() <= 0) {
                    return;
                }
                if (this.getInputSizeshNQ4ISI.Camera2StreamConfigurationMap(this.getOutputMinFrameDurationlomOqCM)) {
                    measuredWidth = 1048576;
                } else {
                    measuredWidth = (this.getOutputMinFrameDurationlomOqCM.getMeasuredWidth() - this.getOutputMinFrameDurationlomOqCM.getTotalPaddingLeft()) - this.getOutputMinFrameDurationlomOqCM.getTotalPaddingRight();
                }
                int height = (this.getOutputMinFrameDurationlomOqCM.getHeight() - this.getOutputMinFrameDurationlomOqCM.getCompoundPaddingBottom()) - this.getOutputMinFrameDurationlomOqCM.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                android.graphics.RectF rectF = getHighSpeedVideoFpsRangesFor;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(rectF);
                    if (highSpeedVideoFpsRanges != this.getOutputMinFrameDurationlomOqCM.getTextSize()) {
                        getHighSpeedVideoFpsRangesFor(0, highSpeedVideoFpsRanges);
                    }
                }
            }
            this.getOutputSizes = true;
        }
    }

    private void getOutputMinFrameDuration() {
        this.getHighSpeedVideoSizesFor = 0;
        this.Camera2StreamConfigurationMap = -1.0f;
        this.getHighResolutionOutputSizeshNQ4ISI = -1.0f;
        this.getHighSpeedVideoSizes = -1.0f;
        this.getInputFormats = new int[0];
        this.getOutputSizes = false;
    }

    void getHighSpeedVideoFpsRangesFor(int i, float f) {
        android.content.res.Resources resources;
        android.content.Context context = this.getOutputFormats;
        if (context == null) {
            resources = android.content.res.Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        getHighSpeedVideoFpsRanges(android.util.TypedValue.applyDimension(i, f, resources.getDisplayMetrics()));
    }

    private void getHighSpeedVideoFpsRanges(float f) {
        if (f != this.getOutputMinFrameDurationlomOqCM.getPaint().getTextSize()) {
            this.getOutputMinFrameDurationlomOqCM.getPaint().setTextSize(f);
            boolean isInLayout = this.getOutputMinFrameDurationlomOqCM.isInLayout();
            if (this.getOutputMinFrameDurationlomOqCM.getLayout() != null) {
                this.getOutputSizes = false;
                try {
                    java.lang.reflect.Method highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges("nullLayouts");
                    if (highSpeedVideoFpsRanges != null) {
                        highSpeedVideoFpsRanges.invoke(this.getOutputMinFrameDurationlomOqCM, new java.lang.Object[0]);
                    }
                } catch (java.lang.Exception unused) {
                }
                if (!isInLayout) {
                    this.getOutputMinFrameDurationlomOqCM.requestLayout();
                } else {
                    this.getOutputMinFrameDurationlomOqCM.forceLayout();
                }
                this.getOutputMinFrameDurationlomOqCM.invalidate();
            }
        }
    }

    private int getHighSpeedVideoFpsRanges(android.graphics.RectF rectF) {
        int length = this.getInputFormats.length;
        if (length == 0) {
            throw new java.lang.IllegalStateException("No available text sizes to choose from.");
        }
        int i = 1;
        int i2 = length - 1;
        int i3 = 0;
        while (i <= i2) {
            int i4 = (i + i2) / 2;
            if (getHighSpeedVideoSizes(this.getInputFormats[i4], rectF)) {
                int i5 = i4 + 1;
                i3 = i;
                i = i5;
            } else {
                i3 = i4 - 1;
                i2 = i3;
            }
        }
        return this.getInputFormats[i3];
    }

    void getHighSpeedVideoFpsRanges(int i) {
        android.text.TextPaint textPaint = this.getOutputSizeshNQ4ISI;
        if (textPaint == null) {
            this.getOutputSizeshNQ4ISI = new android.text.TextPaint();
        } else {
            textPaint.reset();
        }
        this.getOutputSizeshNQ4ISI.set(this.getOutputMinFrameDurationlomOqCM.getPaint());
        this.getOutputSizeshNQ4ISI.setTextSize(i);
    }

    android.text.StaticLayout Camera2StreamConfigurationMap(java.lang.CharSequence charSequence, android.text.Layout.Alignment alignment, int i, int i2) {
        return androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Api23Impl.getHighSpeedVideoFpsRangesFor(charSequence, alignment, i, i2, this.getOutputMinFrameDurationlomOqCM, this.getOutputSizeshNQ4ISI, this.getInputSizeshNQ4ISI);
    }

    private boolean getHighSpeedVideoSizes(int i, android.graphics.RectF rectF) {
        java.lang.CharSequence transformation;
        java.lang.CharSequence text = this.getOutputMinFrameDurationlomOqCM.getText();
        android.text.method.TransformationMethod transformationMethod = this.getOutputMinFrameDurationlomOqCM.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.getOutputMinFrameDurationlomOqCM)) != null) {
            text = transformation;
        }
        int maxLines = this.getOutputMinFrameDurationlomOqCM.getMaxLines();
        getHighSpeedVideoFpsRanges(i);
        android.text.StaticLayout Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(text, (android.text.Layout.Alignment) getHighSpeedVideoFpsRangesFor(this.getOutputMinFrameDurationlomOqCM, "getLayoutAlignment", android.text.Layout.Alignment.ALIGN_NORMAL), java.lang.Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (Camera2StreamConfigurationMap.getLineCount() <= maxLines && Camera2StreamConfigurationMap.getLineEnd(Camera2StreamConfigurationMap.getLineCount() - 1) == text.length())) && ((float) Camera2StreamConfigurationMap.getHeight()) <= rectF.bottom;
    }

    static <T> T getHighSpeedVideoFpsRangesFor(java.lang.Object obj, java.lang.String str, T t) {
        try {
            return (T) getHighSpeedVideoFpsRanges(str).invoke(obj, new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            return t;
        }
    }

    private static java.lang.reflect.Method getHighSpeedVideoFpsRanges(java.lang.String str) {
        try {
            java.lang.reflect.Method method = getHighSpeedVideoFpsRanges.get(str);
            if (method == null && (method = android.widget.TextView.class.getDeclaredMethod(str, new java.lang.Class[0])) != null) {
                method.setAccessible(true);
                getHighSpeedVideoFpsRanges.put(str, method);
            }
            return method;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    boolean getInputFormats() {
        return getOutputStallDurationlomOqCM() && this.getHighSpeedVideoSizesFor != 0;
    }

    private boolean getOutputStallDurationlomOqCM() {
        return !(this.getOutputMinFrameDurationlomOqCM instanceof androidx.appcompat.widget.AppCompatEditText);
    }

    static final class Api23Impl {
        private Api23Impl() {
        }

        static android.text.StaticLayout getHighSpeedVideoFpsRangesFor(java.lang.CharSequence charSequence, android.text.Layout.Alignment alignment, int i, int i2, android.widget.TextView textView, android.text.TextPaint textPaint, androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl impl) {
            android.text.StaticLayout.Builder obtain = android.text.StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i);
            android.text.StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i2 == -1) {
                i2 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i2);
            try {
                impl.getHighResolutionOutputSizeshNQ4ISI(obtain, textView);
            } catch (java.lang.ClassCastException unused) {
            }
            return obtain.build();
        }
    }
}
