package androidx.constraintlayout.utils.widget;

/* loaded from: classes7.dex */
public class MockView extends android.view.View {
    private int Camera2StreamConfigurationMap;
    private android.graphics.Paint getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private boolean getHighSpeedVideoSizes;
    private android.graphics.Rect getHighSpeedVideoSizesFor;
    private int getInputFormats;
    private android.graphics.Paint getInputSizeshNQ4ISI;
    private android.graphics.Paint getOutputFormats;
    private int getOutputMinFrameDuration;
    protected java.lang.String mText;

    public MockView(android.content.Context context) {
        super(context);
        this.getHighResolutionOutputSizeshNQ4ISI = new android.graphics.Paint();
        this.getOutputFormats = new android.graphics.Paint();
        this.getInputSizeshNQ4ISI = new android.graphics.Paint();
        this.getHighSpeedVideoFpsRanges = true;
        this.getHighSpeedVideoSizes = true;
        this.mText = null;
        this.getHighSpeedVideoSizesFor = new android.graphics.Rect();
        this.getHighSpeedVideoFpsRangesFor = android.graphics.Color.argb(255, 0, 0, 0);
        this.getInputFormats = android.graphics.Color.argb(255, 200, 200, 200);
        this.getOutputMinFrameDuration = android.graphics.Color.argb(255, 50, 50, 50);
        this.Camera2StreamConfigurationMap = 4;
        getHighSpeedVideoFpsRanges(context, null);
    }

    public MockView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.getHighResolutionOutputSizeshNQ4ISI = new android.graphics.Paint();
        this.getOutputFormats = new android.graphics.Paint();
        this.getInputSizeshNQ4ISI = new android.graphics.Paint();
        this.getHighSpeedVideoFpsRanges = true;
        this.getHighSpeedVideoSizes = true;
        this.mText = null;
        this.getHighSpeedVideoSizesFor = new android.graphics.Rect();
        this.getHighSpeedVideoFpsRangesFor = android.graphics.Color.argb(255, 0, 0, 0);
        this.getInputFormats = android.graphics.Color.argb(255, 200, 200, 200);
        this.getOutputMinFrameDuration = android.graphics.Color.argb(255, 50, 50, 50);
        this.Camera2StreamConfigurationMap = 4;
        getHighSpeedVideoFpsRanges(context, attributeSet);
    }

    public MockView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.getHighResolutionOutputSizeshNQ4ISI = new android.graphics.Paint();
        this.getOutputFormats = new android.graphics.Paint();
        this.getInputSizeshNQ4ISI = new android.graphics.Paint();
        this.getHighSpeedVideoFpsRanges = true;
        this.getHighSpeedVideoSizes = true;
        this.mText = null;
        this.getHighSpeedVideoSizesFor = new android.graphics.Rect();
        this.getHighSpeedVideoFpsRangesFor = android.graphics.Color.argb(255, 0, 0, 0);
        this.getInputFormats = android.graphics.Color.argb(255, 200, 200, 200);
        this.getOutputMinFrameDuration = android.graphics.Color.argb(255, 50, 50, 50);
        this.Camera2StreamConfigurationMap = 4;
        getHighSpeedVideoFpsRanges(context, attributeSet);
    }

    private void getHighSpeedVideoFpsRanges(android.content.Context context, android.util.AttributeSet attributeSet) {
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.R.styleable.MockView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == androidx.constraintlayout.widget.R.styleable.MockView_mock_label) {
                    this.mText = obtainStyledAttributes.getString(index);
                } else if (index == androidx.constraintlayout.widget.R.styleable.MockView_mock_showDiagonals) {
                    this.getHighSpeedVideoFpsRanges = obtainStyledAttributes.getBoolean(index, this.getHighSpeedVideoFpsRanges);
                } else if (index == androidx.constraintlayout.widget.R.styleable.MockView_mock_diagonalsColor) {
                    this.getHighSpeedVideoFpsRangesFor = obtainStyledAttributes.getColor(index, this.getHighSpeedVideoFpsRangesFor);
                } else if (index == androidx.constraintlayout.widget.R.styleable.MockView_mock_labelBackgroundColor) {
                    this.getOutputMinFrameDuration = obtainStyledAttributes.getColor(index, this.getOutputMinFrameDuration);
                } else if (index == androidx.constraintlayout.widget.R.styleable.MockView_mock_labelColor) {
                    this.getInputFormats = obtainStyledAttributes.getColor(index, this.getInputFormats);
                } else if (index == androidx.constraintlayout.widget.R.styleable.MockView_mock_showLabel) {
                    this.getHighSpeedVideoSizes = obtainStyledAttributes.getBoolean(index, this.getHighSpeedVideoSizes);
                }
            }
            obtainStyledAttributes.recycle();
        }
        if (this.mText == null) {
            try {
                this.mText = context.getResources().getResourceEntryName(getId());
            } catch (java.lang.Exception unused) {
            }
        }
        this.getHighResolutionOutputSizeshNQ4ISI.setColor(this.getHighSpeedVideoFpsRangesFor);
        this.getHighResolutionOutputSizeshNQ4ISI.setAntiAlias(true);
        this.getOutputFormats.setColor(this.getInputFormats);
        this.getOutputFormats.setAntiAlias(true);
        this.getInputSizeshNQ4ISI.setColor(this.getOutputMinFrameDuration);
        this.Camera2StreamConfigurationMap = java.lang.Math.round(this.Camera2StreamConfigurationMap * (getResources().getDisplayMetrics().xdpi / 160.0f));
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.getHighSpeedVideoFpsRanges) {
            width--;
            height--;
            float f = width;
            float f2 = height;
            canvas.drawLine(0.0f, 0.0f, f, f2, this.getHighResolutionOutputSizeshNQ4ISI);
            canvas.drawLine(0.0f, f2, f, 0.0f, this.getHighResolutionOutputSizeshNQ4ISI);
            canvas.drawLine(0.0f, 0.0f, f, 0.0f, this.getHighResolutionOutputSizeshNQ4ISI);
            canvas.drawLine(f, 0.0f, f, f2, this.getHighResolutionOutputSizeshNQ4ISI);
            canvas.drawLine(f, f2, 0.0f, f2, this.getHighResolutionOutputSizeshNQ4ISI);
            canvas.drawLine(0.0f, f2, 0.0f, 0.0f, this.getHighResolutionOutputSizeshNQ4ISI);
        }
        java.lang.String str = this.mText;
        if (str == null || !this.getHighSpeedVideoSizes) {
            return;
        }
        this.getOutputFormats.getTextBounds(str, 0, str.length(), this.getHighSpeedVideoSizesFor);
        float width2 = (width - this.getHighSpeedVideoSizesFor.width()) / 2.0f;
        float height2 = ((height - this.getHighSpeedVideoSizesFor.height()) / 2.0f) + this.getHighSpeedVideoSizesFor.height();
        this.getHighSpeedVideoSizesFor.offset((int) width2, (int) height2);
        android.graphics.Rect rect = this.getHighSpeedVideoSizesFor;
        rect.set(rect.left - this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizesFor.top - this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizesFor.right + this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizesFor.bottom + this.Camera2StreamConfigurationMap);
        canvas.drawRect(this.getHighSpeedVideoSizesFor, this.getInputSizeshNQ4ISI);
        canvas.drawText(this.mText, width2, height2, this.getOutputFormats);
    }
}
