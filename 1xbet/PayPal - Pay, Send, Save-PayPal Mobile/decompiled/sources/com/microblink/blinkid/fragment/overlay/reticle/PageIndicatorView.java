package com.microblink.blinkid.fragment.overlay.reticle;

/* loaded from: classes10.dex */
public class PageIndicatorView extends android.view.View {
    private int Camera2StreamConfigurationMap;
    private float getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private float getHighSpeedVideoFpsRangesFor;
    private android.graphics.Paint getHighSpeedVideoSizes;

    public PageIndicatorView(android.content.Context context) {
        this(context, null, 0);
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        super.draw(canvas);
        float width = canvas.getWidth() / 2.0f;
        float height = canvas.getHeight() / 2.0f;
        int i = this.Camera2StreamConfigurationMap;
        if (i <= 1) {
            if (i == 1) {
                canvas.drawCircle(width, height, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes);
                return;
            }
            return;
        }
        int i2 = i / 2;
        int i3 = 0;
        while (true) {
            int i4 = this.Camera2StreamConfigurationMap;
            if (i3 >= i4) {
                return;
            }
            float f = i3 < i2 ? width - (((this.getHighSpeedVideoFpsRangesFor + this.getHighResolutionOutputSizeshNQ4ISI) * ((i4 - 1) - (i3 * 2))) / 2.0f) : (i4 % 2 == 0 || i3 != i2) ? (((this.getHighSpeedVideoFpsRangesFor + this.getHighResolutionOutputSizeshNQ4ISI) * ((i4 - 1) - (((i4 - i3) - 1) * 2))) / 2.0f) + width : width;
            if (getResources().getConfiguration().getLayoutDirection() == 1) {
                if ((this.Camera2StreamConfigurationMap - i3) - 1 != this.getHighSpeedVideoFpsRanges) {
                    this.getHighSpeedVideoSizes.setAlpha(60);
                } else {
                    this.getHighSpeedVideoSizes.setAlpha(255);
                }
            } else if (i3 != this.getHighSpeedVideoFpsRanges) {
                this.getHighSpeedVideoSizes.setAlpha(60);
            } else {
                this.getHighSpeedVideoSizes.setAlpha(255);
            }
            canvas.drawCircle(f, height, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes);
            i3++;
        }
    }

    public void setActivePage(int i) {
        this.getHighSpeedVideoFpsRanges = i;
    }

    public void setup(int i, int i2) {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.getHighSpeedVideoSizes = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.getHighSpeedVideoSizes.setColor(i);
        this.getHighSpeedVideoSizes.setAntiAlias(true);
        this.Camera2StreamConfigurationMap = java.lang.Math.min(i2, 8);
        android.content.res.Resources resources = getContext().getResources();
        this.getHighSpeedVideoFpsRangesFor = resources.getDimension(com.microblink.blinkid.library.R.dimen.mb_page_indicator_radius);
        this.getHighResolutionOutputSizeshNQ4ISI = resources.getDimension(com.microblink.blinkid.library.R.dimen.mb_page_indicator_margin);
    }

    public PageIndicatorView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PageIndicatorView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.getHighSpeedVideoFpsRanges = 0;
    }
}
