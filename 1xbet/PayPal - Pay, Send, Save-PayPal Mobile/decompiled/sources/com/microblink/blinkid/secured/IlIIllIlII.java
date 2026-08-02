package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class IlIIllIlII implements com.microblink.blinkid.secured.IIIlllIIll {
    public final android.graphics.Paint llIIlIlIIl;

    public IlIIllIlII() {
        this.llIIlIlIIl = null;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.llIIlIlIIl = paint;
        paint.setAlpha(100);
    }

    @Override // com.microblink.blinkid.secured.IIIlllIIll
    public final void llIIlIlIIl(com.microblink.blinkid.geometry.Quadrilateral quadrilateral, android.graphics.Canvas canvas) {
        android.graphics.Paint paint = this.llIIlIlIIl;
        android.graphics.Path path = new android.graphics.Path();
        path.moveTo(quadrilateral.getUpperLeft().getX(), quadrilateral.getUpperLeft().getY());
        path.lineTo(canvas.getWidth(), 0.0f);
        path.lineTo(0.0f, 0.0f);
        path.lineTo(quadrilateral.getUpperRight().getX(), quadrilateral.getUpperRight().getY());
        canvas.drawPath(path, paint);
        android.graphics.Path path2 = new android.graphics.Path();
        path2.moveTo(quadrilateral.getUpperRight().getX(), quadrilateral.getUpperRight().getY());
        path2.lineTo(0.0f, 0.0f);
        path2.lineTo(0.0f, canvas.getHeight());
        path2.lineTo(quadrilateral.getLowerRight().getX(), quadrilateral.getLowerRight().getY());
        canvas.drawPath(path2, paint);
        android.graphics.Path path3 = new android.graphics.Path();
        path3.moveTo(quadrilateral.getLowerRight().getX(), quadrilateral.getLowerRight().getY());
        path3.lineTo(0.0f, canvas.getHeight());
        path3.lineTo(canvas.getWidth(), canvas.getHeight());
        path3.lineTo(quadrilateral.getLowerLeft().getX(), quadrilateral.getLowerLeft().getY());
        canvas.drawPath(path3, paint);
        android.graphics.Path path4 = new android.graphics.Path();
        path4.moveTo(quadrilateral.getLowerLeft().getX(), quadrilateral.getLowerLeft().getY());
        path4.lineTo(canvas.getWidth(), canvas.getHeight());
        path4.lineTo(canvas.getWidth(), 0.0f);
        path4.lineTo(quadrilateral.getUpperLeft().getX(), quadrilateral.getUpperLeft().getY());
        canvas.drawPath(path4, paint);
    }

    @Override // com.microblink.blinkid.secured.IIIlllIIll
    public final android.graphics.Paint llIIlIlIIl() {
        return this.llIIlIlIIl;
    }
}
