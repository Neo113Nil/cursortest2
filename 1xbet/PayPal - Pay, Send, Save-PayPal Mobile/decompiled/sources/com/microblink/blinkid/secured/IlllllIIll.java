package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class IlllllIIll implements com.microblink.blinkid.secured.IIIlllIIll {
    public final android.graphics.Paint IlIllIlIIl;
    public final com.microblink.blinkid.geometry.quadTransform.IdQuadTransformer llIIlIlIIl;

    public IlllllIIll(com.microblink.blinkid.geometry.quadTransform.IdQuadTransformer idQuadTransformer, android.content.Context context) {
        this.llIIlIlIIl = idQuadTransformer;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.IlIllIlIIl = paint;
        paint.setColor(-1);
        paint.setStrokeWidth((context.getResources().getDisplayMetrics().densityDpi + 49) / 50);
        paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
    }

    @Override // com.microblink.blinkid.secured.IIIlllIIll
    public final void llIIlIlIIl(com.microblink.blinkid.geometry.Quadrilateral quadrilateral, android.graphics.Canvas canvas) {
        com.microblink.blinkid.geometry.Quadrilateral sortedQuad = this.llIIlIlIIl.transformQuad(quadrilateral).getSortedQuad();
        canvas.drawRoundRect(new android.graphics.RectF(sortedQuad.getUpperLeft().getX(), sortedQuad.getUpperLeft().getY(), sortedQuad.getLowerRight().getX(), sortedQuad.getLowerRight().getY()), 30.0f, 30.0f, this.IlIllIlIIl);
    }

    @Override // com.microblink.blinkid.secured.IIIlllIIll
    public final android.graphics.Paint llIIlIlIIl() {
        return this.IlIllIlIIl;
    }
}
