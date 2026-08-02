package com.github.mikephil.charting.renderer.scatter;

/* loaded from: classes8.dex */
public class ChevronUpShapeRenderer implements com.github.mikephil.charting.renderer.scatter.IShapeRenderer {
    @Override // com.github.mikephil.charting.renderer.scatter.IShapeRenderer
    public void renderShape(android.graphics.Canvas canvas, com.github.mikephil.charting.interfaces.datasets.IScatterDataSet iScatterDataSet, com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler, float f, float f2, android.graphics.Paint paint) {
        float scatterShapeSize = iScatterDataSet.getScatterShapeSize() / 2.0f;
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(com.github.mikephil.charting.utils.Utils.convertDpToPixel(1.0f));
        float f3 = scatterShapeSize * 2.0f;
        float f4 = f2 - f3;
        canvas.drawLine(f, f4, f + f3, f2, paint);
        canvas.drawLine(f, f4, f - f3, f2, paint);
    }
}
