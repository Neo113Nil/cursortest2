package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
class BGView extends android.view.View {
    public android.graphics.Paint Camera2StreamConfigurationMap;
    public int getHighResolutionOutputSizeshNQ4ISI;
    public android.graphics.RectF getHighSpeedVideoFpsRanges;
    public android.graphics.RectF getHighSpeedVideoFpsRangesFor;
    public android.graphics.Path getHighSpeedVideoSizes;
    public int getInputFormats;
    public com.dyneti.android.dyscan.l2 getInputSizeshNQ4ISI;
    public boolean getOutputFormats;

    public BGView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.getHighResolutionOutputSizeshNQ4ISI = -7829368;
        this.getInputFormats = 115;
        this.getOutputFormats = true;
        android.graphics.Path path = new android.graphics.Path();
        this.getHighSpeedVideoSizes = path;
        path.setFillType(android.graphics.Path.FillType.EVEN_ODD);
        this.Camera2StreamConfigurationMap = new android.graphics.Paint();
        this.getHighSpeedVideoFpsRangesFor = new android.graphics.RectF();
        this.getHighSpeedVideoFpsRanges = new android.graphics.RectF();
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        android.graphics.Path path = new android.graphics.Path();
        this.getHighSpeedVideoSizes = path;
        path.setFillType(android.graphics.Path.FillType.EVEN_ODD);
        this.Camera2StreamConfigurationMap = new android.graphics.Paint(1);
        this.getHighSpeedVideoFpsRangesFor = new android.graphics.RectF();
        this.getHighSpeedVideoFpsRanges = new android.graphics.RectF();
        this.getHighSpeedVideoFpsRangesFor.set(0.0f, 0.0f, getWidth(), getHeight());
        this.getHighSpeedVideoSizes.addRect(this.getHighSpeedVideoFpsRangesFor, android.graphics.Path.Direction.CW);
        float width = this.getOutputFormats ? (getWidth() * 30.0f) / 720.0f : 0.0f;
        com.dyneti.android.dyscan.l2 l2Var = this.getInputSizeshNQ4ISI;
        this.getHighSpeedVideoFpsRanges.set(l2Var.e(), l2Var.f(), l2Var.d() + l2Var.e(), l2Var.c() + l2Var.f());
        this.getHighSpeedVideoSizes.addRoundRect(this.getHighSpeedVideoFpsRanges, new float[]{width, width, width, width, width, width, width, width}, android.graphics.Path.Direction.CCW);
        this.Camera2StreamConfigurationMap.setColor(this.getHighResolutionOutputSizeshNQ4ISI);
        this.Camera2StreamConfigurationMap.setAlpha(this.getInputFormats);
        canvas.drawPath(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap);
    }
}
