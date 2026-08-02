package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
class OverlayView extends android.view.View {
    public com.dyneti.android.dyscan.p0 Camera2StreamConfigurationMap;
    public com.dyneti.android.dyscan.y getHighResolutionOutputSizeshNQ4ISI;
    public final android.graphics.Paint getHighSpeedVideoFpsRanges;
    public com.dyneti.android.dyscan.l2 getHighSpeedVideoFpsRangesFor;
    public android.graphics.Bitmap getHighSpeedVideoSizes;
    public boolean getInputFormats;

    public OverlayView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        new android.graphics.Path();
        android.graphics.Paint paint = new android.graphics.Paint();
        this.getHighSpeedVideoFpsRanges = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setStyle(android.graphics.Paint.Style.FILL);
    }

    private void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, com.dyneti.android.dyscan.l lVar, android.graphics.Canvas canvas) {
        com.dyneti.android.dyscan.l2 l2Var = this.getHighSpeedVideoFpsRangesFor;
        boolean z = l2Var.f3321a.r && !(lVar == com.dyneti.android.dyscan.x.l || lVar == com.dyneti.android.dyscan.o0.h);
        float f = 360.0f - (l2Var.e / 2.0f);
        float e = l2Var.e();
        float f2 = lVar.f3318a;
        if (z) {
            f2 = ((f2 * 720.0f) - f) / l2Var.e;
        }
        float width = new android.graphics.Rect((int) ((l2Var.d() * f2) + e), (int) ((l2Var.c() * lVar.c) + l2Var.f()), (int) ((l2Var.d() * (z ? ((lVar.b * 720.0f) - f) / l2Var.e : lVar.b)) + l2Var.e()), (int) ((l2Var.c() * lVar.d) + l2Var.f())).width();
        android.graphics.Paint paint = this.getHighSpeedVideoFpsRanges;
        paint.setTextSize(48.0f);
        paint.getTextBounds(str, 0, str.length(), new android.graphics.Rect());
        paint.setTextSize((width * 48.0f) / r4.width());
        canvas.drawText(str, r0.left, r0.bottom, this.getHighSpeedVideoFpsRanges);
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        int i = 0;
        canvas.drawColor(android.graphics.Color.argb(0, 0, 0, 0));
        com.dyneti.android.dyscan.y yVar = this.getHighResolutionOutputSizeshNQ4ISI;
        if (yVar != null) {
            java.lang.String b = yVar.b();
            com.dyneti.android.dyscan.y yVar2 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (yVar2.h) {
                java.lang.String[] split = b.split(" ");
                if (split.length == 4 && this.getHighResolutionOutputSizeshNQ4ISI.j.size() == 4) {
                    while (i < 4) {
                        getHighResolutionOutputSizeshNQ4ISI(split[i], ((com.dyneti.android.dyscan.d0) this.getHighResolutionOutputSizeshNQ4ISI.j.get(i)).f3296a, canvas);
                        i++;
                    }
                }
            } else if (yVar2.g) {
                java.lang.String[] split2 = b.split(" ");
                if (split2.length == 4 && this.getHighResolutionOutputSizeshNQ4ISI.j.size() == 4) {
                    java.util.Iterator it = this.getHighResolutionOutputSizeshNQ4ISI.j.iterator();
                    float f = 0.0f;
                    while (it.hasNext()) {
                        com.dyneti.android.dyscan.l lVar = ((com.dyneti.android.dyscan.d0) it.next()).f3296a;
                        f += lVar.d - lVar.c;
                    }
                    float f2 = f / 4.0f;
                    com.dyneti.android.dyscan.l lVar2 = this.getHighResolutionOutputSizeshNQ4ISI.i;
                    float f3 = lVar2.d;
                    float f4 = lVar2.c;
                    float f5 = ((f3 - f4) - f) / 3.0f;
                    while (i < 4) {
                        if (i != 0) {
                            f4 = f2 + f5 + f4;
                        }
                        com.dyneti.android.dyscan.l lVar3 = this.getHighResolutionOutputSizeshNQ4ISI.i;
                        getHighResolutionOutputSizeshNQ4ISI(split2[i], new com.dyneti.android.dyscan.l(f4, lVar3.f3318a, f4 + f2, lVar3.b), canvas);
                        i++;
                    }
                }
            } else if (this.getInputFormats) {
                getHighResolutionOutputSizeshNQ4ISI(b, com.dyneti.android.dyscan.x.l, canvas);
            } else {
                getHighResolutionOutputSizeshNQ4ISI(b, yVar2.i, canvas);
            }
        }
        com.dyneti.android.dyscan.p0 p0Var = this.Camera2StreamConfigurationMap;
        if (p0Var != null) {
            if (this.getInputFormats) {
                getHighResolutionOutputSizeshNQ4ISI(p0Var.a(), com.dyneti.android.dyscan.o0.h, canvas);
            } else {
                getHighResolutionOutputSizeshNQ4ISI(p0Var.a(), this.Camera2StreamConfigurationMap.c, canvas);
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.getHighSpeedVideoSizes = android.graphics.Bitmap.createBitmap(i, i2, android.graphics.Bitmap.Config.ARGB_8888);
        new android.graphics.Canvas(this.getHighSpeedVideoSizes);
    }
}
