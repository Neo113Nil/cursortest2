package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class IIIlIIIIll implements com.microblink.blinkid.secured.IIIlllIIll {
    public final android.graphics.Paint IlIllIlIIl;
    public final android.graphics.Paint llIIlIlIIl;

    public IIIlIIIIll() {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.llIIlIlIIl = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.IlIllIlIIl = paint2;
        paint.setStrokeWidth(5.0f);
        paint.setAntiAlias(true);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint2.setStyle(android.graphics.Paint.Style.FILL);
    }

    @Override // com.microblink.blinkid.secured.IIIlllIIll
    public final android.graphics.Paint llIIlIlIIl() {
        return null;
    }

    @Override // com.microblink.blinkid.secured.IIIlllIIll
    public final void llIIlIlIIl(com.microblink.blinkid.geometry.Quadrilateral quadrilateral, android.graphics.Canvas canvas) {
        if (quadrilateral.isDefaultQuad()) {
            return;
        }
        int color = quadrilateral.getColor();
        this.llIIlIlIIl.setColor(color);
        this.IlIllIlIIl.setColor(color);
        this.IlIllIlIIl.setAlpha(java.lang.Math.min(android.graphics.Color.alpha(color), 75));
        com.microblink.blinkid.geometry.Point upperLeft = quadrilateral.getUpperLeft();
        com.microblink.blinkid.geometry.Point upperRight = quadrilateral.getUpperRight();
        com.microblink.blinkid.geometry.Point lowerLeft = quadrilateral.getLowerLeft();
        com.microblink.blinkid.geometry.Point lowerRight = quadrilateral.getLowerRight();
        android.graphics.Path path = new android.graphics.Path();
        path.moveTo(upperLeft.getX(), upperLeft.getY());
        path.lineTo(upperRight.getX(), upperRight.getY());
        path.lineTo(lowerRight.getX(), lowerRight.getY());
        path.lineTo(lowerLeft.getX(), lowerLeft.getY());
        path.close();
        canvas.drawPath(path, this.llIIlIlIIl);
        canvas.drawPath(path, this.IlIllIlIIl);
    }
}
