package com.microblink.blinkid.view.viewfinder;

/* loaded from: classes10.dex */
public class SimpleRectangleView extends android.view.View {
    private android.graphics.Rect[] getHighResolutionOutputSizeshNQ4ISI;
    private final android.graphics.Paint getHighSpeedVideoFpsRanges;

    public SimpleRectangleView(android.content.Context context) {
        super(context);
        this.getHighSpeedVideoFpsRanges = null;
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        setBackgroundColor(0);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.getHighSpeedVideoFpsRanges = paint;
        paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.ADD));
        paint.setColor(-1);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth((context.getResources().getDisplayMetrics().densityDpi + 79) / 80);
    }

    @Override // android.view.View
    protected final void onDraw(android.graphics.Canvas canvas) {
        android.graphics.Rect[] rectArr = this.getHighResolutionOutputSizeshNQ4ISI;
        if (rectArr != null) {
            for (android.graphics.Rect rect : rectArr) {
                canvas.drawRect(rect, this.getHighSpeedVideoFpsRanges);
            }
        }
    }

    public void setRectangles(android.graphics.Rect[] rectArr) {
        this.getHighResolutionOutputSizeshNQ4ISI = rectArr;
        invalidate();
    }
}
