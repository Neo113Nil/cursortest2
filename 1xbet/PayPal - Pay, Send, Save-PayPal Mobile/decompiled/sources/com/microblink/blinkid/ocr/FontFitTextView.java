package com.microblink.blinkid.ocr;

/* loaded from: classes10.dex */
public class FontFitTextView extends androidx.appcompat.widget.AppCompatEditText {
    private final android.graphics.Paint getHighSpeedVideoFpsRanges;

    public FontFitTextView(android.content.Context context) {
        super(context);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.getHighSpeedVideoFpsRanges = paint;
        paint.set(getPaint());
    }

    private void Camera2StreamConfigurationMap(java.lang.String str, int i) {
        float measureText;
        if (i <= 0) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        float f = getResources().getDisplayMetrics().density;
        float f2 = 32.0f * f;
        float f3 = f * 6.0f;
        this.getHighSpeedVideoFpsRanges.set(getPaint());
        while (f2 - f3 > 0.5f) {
            float f4 = (f2 + f3) / 2.0f;
            this.getHighSpeedVideoFpsRanges.setTextSize(f4);
            java.lang.String[] split = str.split(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
            if (split == null || split.length == 0) {
                measureText = this.getHighSpeedVideoFpsRanges.measureText(str);
            } else {
                measureText = this.getHighSpeedVideoFpsRanges.measureText(split[0]);
                for (int i2 = 1; i2 < split.length; i2++) {
                    float measureText2 = this.getHighSpeedVideoFpsRanges.measureText(split[i2]);
                    if (measureText2 > measureText) {
                        measureText = measureText2;
                    }
                }
            }
            if (measureText >= (i - paddingLeft) - paddingRight) {
                f2 = f4;
            } else {
                f3 = f4;
            }
        }
        setTextSize(0, f3);
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = android.view.View.MeasureSpec.getSize(i);
        int measuredHeight = getMeasuredHeight();
        Camera2StreamConfigurationMap(getText().toString(), size);
        setMeasuredDimension(size, measuredHeight);
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        if (i != i3) {
            Camera2StreamConfigurationMap(getText().toString(), i);
        }
    }

    @Override // android.widget.TextView
    protected final void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        Camera2StreamConfigurationMap(charSequence.toString(), getWidth());
    }

    public FontFitTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.getHighSpeedVideoFpsRanges = paint;
        paint.set(getPaint());
    }
}
