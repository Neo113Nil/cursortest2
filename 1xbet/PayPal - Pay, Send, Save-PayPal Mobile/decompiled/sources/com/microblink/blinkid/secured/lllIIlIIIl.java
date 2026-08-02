package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class lllIIlIIIl implements com.microblink.blinkid.secured.IIIlllIIll {
    public final android.graphics.Paint IllIIIllII;
    public float llIIlIlIIl = 0.3f;
    public int IlIllIlIIl = -1;

    public lllIIlIIIl(android.content.Context context) {
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.IllIIIllII = paint;
        paint.setStrokeWidth((context.getResources().getDisplayMetrics().densityDpi + 49) / 50);
        paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
    }

    @Override // com.microblink.blinkid.secured.IIIlllIIll
    public final android.graphics.Paint llIIlIlIIl() {
        return this.IllIIIllII;
    }

    @Override // com.microblink.blinkid.secured.IIIlllIIll
    public final void llIIlIlIIl(com.microblink.blinkid.geometry.Quadrilateral quadrilateral, android.graphics.Canvas canvas) {
        com.microblink.blinkid.geometry.Point clamp;
        com.microblink.blinkid.geometry.Point point;
        com.microblink.blinkid.geometry.Point point2;
        com.microblink.blinkid.geometry.Point point3;
        float max = java.lang.Math.max(canvas.getWidth() / 8, canvas.getHeight() / 8);
        com.microblink.blinkid.geometry.Point operatorMultiply = quadrilateral.getUpperRight().operatorMinus(quadrilateral.getUpperLeft()).operatorMultiply(this.llIIlIlIIl);
        com.microblink.blinkid.geometry.Point operatorMultiply2 = quadrilateral.getLowerLeft().operatorMinus(quadrilateral.getUpperLeft()).operatorMultiply(this.llIIlIlIIl);
        com.microblink.blinkid.geometry.Point operatorMultiply3 = quadrilateral.getLowerRight().operatorMinus(quadrilateral.getLowerLeft()).operatorMultiply(this.llIIlIlIIl);
        com.microblink.blinkid.geometry.Point operatorMultiply4 = quadrilateral.getLowerRight().operatorMinus(quadrilateral.getUpperRight()).operatorMultiply(this.llIIlIlIIl);
        int i = this.IlIllIlIIl;
        if (i > 0) {
            point = operatorMultiply.normalize(i);
            point2 = operatorMultiply2.normalize(this.IlIllIlIIl);
            point3 = operatorMultiply4.normalize(this.IlIllIlIIl);
            clamp = operatorMultiply3.normalize(this.IlIllIlIIl);
        } else {
            float min = java.lang.Math.min(java.lang.Math.min(java.lang.Math.min(java.lang.Math.min(max, operatorMultiply.norm()), operatorMultiply2.norm()), operatorMultiply3.norm()), operatorMultiply4.norm());
            com.microblink.blinkid.geometry.Point clamp2 = operatorMultiply.clamp(min);
            com.microblink.blinkid.geometry.Point clamp3 = operatorMultiply2.clamp(min);
            com.microblink.blinkid.geometry.Point clamp4 = operatorMultiply4.clamp(min);
            clamp = operatorMultiply3.clamp(min);
            point = clamp2;
            point2 = clamp3;
            point3 = clamp4;
        }
        this.IllIIIllII.setColor(quadrilateral.getColor());
        llIIlIlIIl(canvas, quadrilateral.getUpperLeft(), quadrilateral.getUpperLeft().operatorPlus(point), quadrilateral.getUpperLeft().operatorPlus(point2));
        llIIlIlIIl(canvas, quadrilateral.getUpperRight(), quadrilateral.getUpperRight().operatorMinus(point), quadrilateral.getUpperRight().operatorPlus(point3));
        llIIlIlIIl(canvas, quadrilateral.getLowerLeft(), quadrilateral.getLowerLeft().operatorMinus(point2), quadrilateral.getLowerLeft().operatorPlus(clamp));
        llIIlIlIIl(canvas, quadrilateral.getLowerRight(), quadrilateral.getLowerRight().operatorMinus(point3), quadrilateral.getLowerRight().operatorMinus(clamp));
    }

    public final void llIIlIlIIl(android.graphics.Canvas canvas, com.microblink.blinkid.geometry.Point point, com.microblink.blinkid.geometry.Point point2, com.microblink.blinkid.geometry.Point point3) {
        canvas.drawLine(point.getX(), point.getY(), point2.getX(), point2.getY(), this.IllIIIllII);
        canvas.drawLine(point.getX(), point.getY(), point3.getX(), point3.getY(), this.IllIIIllII);
    }
}
