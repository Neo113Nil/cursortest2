package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
class CornerView extends android.view.View {
    public java.util.ArrayList Camera2StreamConfigurationMap;
    public final android.graphics.RectF getHighResolutionOutputSizeshNQ4ISI;
    public final android.graphics.Path[] getHighSpeedVideoFpsRanges;
    public boolean getHighSpeedVideoFpsRangesFor;
    public final android.graphics.Paint getHighSpeedVideoSizes;
    public int getHighSpeedVideoSizesFor;
    public int getInputFormats;
    public boolean getInputSizeshNQ4ISI;
    public int getOutputFormats;
    public boolean getOutputMinFrameDuration;
    public com.dyneti.android.dyscan.l2 getOutputMinFrameDurationlomOqCM;
    public boolean getOutputSizes;
    public final com.dyneti.android.dyscan.t1 getOutputSizeshNQ4ISI;
    public final float getOutputStallDuration;

    public CornerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.getHighSpeedVideoFpsRanges = new android.graphics.Path[4];
        this.Camera2StreamConfigurationMap = new java.util.ArrayList();
        this.getHighSpeedVideoFpsRangesFor = false;
        this.getHighSpeedVideoSizesFor = android.graphics.Color.argb(255, 128, 128, 128);
        this.getInputFormats = android.graphics.Color.argb(255, 0, 255, 255);
        this.getOutputFormats = android.graphics.Color.argb(255, 0, 255, 0);
        this.getInputSizeshNQ4ISI = true;
        this.getOutputMinFrameDuration = false;
        this.getOutputSizes = false;
        this.getOutputStallDuration = 15.0f;
        this.getOutputSizeshNQ4ISI = com.dyneti.android.dyscan.t1.a();
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.getHighSpeedVideoSizes = paint;
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(15.0f);
        paint.setColor(this.getHighSpeedVideoSizesFor);
        for (int i = 0; i < 4; i++) {
            this.getHighSpeedVideoFpsRanges[i] = new android.graphics.Path();
        }
        this.getHighResolutionOutputSizeshNQ4ISI = new android.graphics.RectF();
    }

    public final void getHighSpeedVideoFpsRanges(java.util.ArrayList arrayList, boolean z) {
        this.getHighSpeedVideoFpsRangesFor = z;
        boolean[] zArr = {false, false, false, false};
        for (int i = 0; i < arrayList.size(); i++) {
            zArr[((com.dyneti.android.dyscan.f2) arrayList.get(i)).a()] = true;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (int i2 = 0; i2 < 4; i2++) {
            if (zArr[i2]) {
                arrayList2.add(java.lang.Integer.valueOf(i2));
            }
        }
        int size = arrayList2.size();
        if (size >= 3) {
            com.dyneti.android.dyscan.t1 t1Var = this.getOutputSizeshNQ4ISI;
            if (t1Var.i == null) {
                t1Var.i = java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - t1Var.f3341a);
            }
        }
        if (size > 0 && size < 3) {
            com.dyneti.android.dyscan.g.a(getContext(), size);
        }
        this.Camera2StreamConfigurationMap = arrayList2;
        postInvalidate();
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        float f;
        float f2 = 0.0f;
        float width = this.getInputSizeshNQ4ISI ? (getWidth() * 30.0f) / 720.0f : 0.0f;
        com.dyneti.android.dyscan.l2 l2Var = this.getOutputMinFrameDurationlomOqCM;
        this.getHighResolutionOutputSizeshNQ4ISI.set(l2Var.e(), l2Var.f(), l2Var.d() + l2Var.e(), l2Var.c() + l2Var.f());
        float f3 = this.getOutputMinFrameDuration ? this.getOutputStallDuration + 5.0f : 0.0f;
        android.graphics.RectF rectF = this.getHighResolutionOutputSizeshNQ4ISI;
        rectF.top -= f3;
        rectF.bottom += f3;
        rectF.left -= f3;
        rectF.right += f3;
        if (this.getOutputSizes) {
            f2 = rectF.height() - 120.0f;
            f = this.getHighResolutionOutputSizeshNQ4ISI.width() - 120.0f;
        } else {
            f = 0.0f;
        }
        this.getHighSpeedVideoFpsRanges[0].rewind();
        android.graphics.Path path = this.getHighSpeedVideoFpsRanges[0];
        android.graphics.RectF rectF2 = this.getHighResolutionOutputSizeshNQ4ISI;
        float f4 = f2 / 2.0f;
        path.moveTo(rectF2.left, ((rectF2.top + rectF2.bottom) / 2.0f) - f4);
        android.graphics.Path path2 = this.getHighSpeedVideoFpsRanges[0];
        android.graphics.RectF rectF3 = this.getHighResolutionOutputSizeshNQ4ISI;
        path2.lineTo(rectF3.left, rectF3.top + width);
        android.graphics.Path path3 = this.getHighSpeedVideoFpsRanges[0];
        android.graphics.RectF rectF4 = this.getHighResolutionOutputSizeshNQ4ISI;
        float f5 = rectF4.left;
        float f6 = rectF4.top;
        path3.quadTo(f5, f6, f5 + width, f6);
        android.graphics.Path path4 = this.getHighSpeedVideoFpsRanges[0];
        android.graphics.RectF rectF5 = this.getHighResolutionOutputSizeshNQ4ISI;
        float f7 = f / 2.0f;
        path4.lineTo(((rectF5.left + rectF5.right) / 2.0f) - f7, rectF5.top);
        this.getHighSpeedVideoFpsRanges[1].rewind();
        android.graphics.Path path5 = this.getHighSpeedVideoFpsRanges[1];
        android.graphics.RectF rectF6 = this.getHighResolutionOutputSizeshNQ4ISI;
        path5.moveTo(((rectF6.left + rectF6.right) / 2.0f) + f7, rectF6.top);
        android.graphics.Path path6 = this.getHighSpeedVideoFpsRanges[1];
        android.graphics.RectF rectF7 = this.getHighResolutionOutputSizeshNQ4ISI;
        path6.lineTo(rectF7.right - width, rectF7.top);
        android.graphics.Path path7 = this.getHighSpeedVideoFpsRanges[1];
        android.graphics.RectF rectF8 = this.getHighResolutionOutputSizeshNQ4ISI;
        float f8 = rectF8.right;
        float f9 = rectF8.top;
        path7.quadTo(f8, f9, f8, f9 + width);
        android.graphics.Path path8 = this.getHighSpeedVideoFpsRanges[1];
        android.graphics.RectF rectF9 = this.getHighResolutionOutputSizeshNQ4ISI;
        path8.lineTo(rectF9.right, ((rectF9.top + rectF9.bottom) / 2.0f) - f4);
        this.getHighSpeedVideoFpsRanges[2].rewind();
        android.graphics.Path path9 = this.getHighSpeedVideoFpsRanges[2];
        android.graphics.RectF rectF10 = this.getHighResolutionOutputSizeshNQ4ISI;
        path9.moveTo(rectF10.right, ((rectF10.top + rectF10.bottom) / 2.0f) + f4);
        android.graphics.Path path10 = this.getHighSpeedVideoFpsRanges[2];
        android.graphics.RectF rectF11 = this.getHighResolutionOutputSizeshNQ4ISI;
        path10.lineTo(rectF11.right, rectF11.bottom - width);
        android.graphics.Path path11 = this.getHighSpeedVideoFpsRanges[2];
        android.graphics.RectF rectF12 = this.getHighResolutionOutputSizeshNQ4ISI;
        float f10 = rectF12.right;
        float f11 = rectF12.bottom;
        path11.quadTo(f10, f11, f10 - width, f11);
        android.graphics.Path path12 = this.getHighSpeedVideoFpsRanges[2];
        android.graphics.RectF rectF13 = this.getHighResolutionOutputSizeshNQ4ISI;
        path12.lineTo(((rectF13.left + rectF13.right) / 2.0f) + f7, rectF13.bottom);
        this.getHighSpeedVideoFpsRanges[3].rewind();
        android.graphics.Path path13 = this.getHighSpeedVideoFpsRanges[3];
        android.graphics.RectF rectF14 = this.getHighResolutionOutputSizeshNQ4ISI;
        path13.moveTo(((rectF14.left + rectF14.right) / 2.0f) - f7, rectF14.bottom);
        android.graphics.Path path14 = this.getHighSpeedVideoFpsRanges[3];
        android.graphics.RectF rectF15 = this.getHighResolutionOutputSizeshNQ4ISI;
        path14.lineTo(rectF15.left + width, rectF15.bottom);
        android.graphics.Path path15 = this.getHighSpeedVideoFpsRanges[3];
        android.graphics.RectF rectF16 = this.getHighResolutionOutputSizeshNQ4ISI;
        float f12 = rectF16.left;
        float f13 = rectF16.bottom;
        path15.quadTo(f12, f13, f12, f13 - width);
        android.graphics.Path path16 = this.getHighSpeedVideoFpsRanges[3];
        android.graphics.RectF rectF17 = this.getHighResolutionOutputSizeshNQ4ISI;
        path16.lineTo(rectF17.left, ((rectF17.top + rectF17.bottom) / 2.0f) + f4);
        for (int i = 0; i < 4; i++) {
            if (!this.getHighSpeedVideoFpsRangesFor) {
                this.getHighSpeedVideoSizes.setColor(this.getHighSpeedVideoSizesFor);
                java.util.Iterator it = this.Camera2StreamConfigurationMap.iterator();
                while (it.hasNext()) {
                    if (((java.lang.Integer) it.next()).intValue() == i || this.Camera2StreamConfigurationMap.size() >= 3) {
                        this.getHighSpeedVideoSizes.setColor(this.getInputFormats);
                        break;
                    }
                }
            } else {
                this.getHighSpeedVideoSizes.setColor(this.getOutputFormats);
            }
            canvas.drawPath(this.getHighSpeedVideoFpsRanges[i], this.getHighSpeedVideoSizes);
        }
    }
}
