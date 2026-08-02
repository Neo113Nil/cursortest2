package com.github.mikephil.charting.renderer.scatter;

/* loaded from: classes8.dex */
public class CrossShapeRenderer implements com.github.mikephil.charting.renderer.scatter.IShapeRenderer {
    @Override // com.github.mikephil.charting.renderer.scatter.IShapeRenderer
    public void renderShape(android.graphics.Canvas canvas, com.github.mikephil.charting.interfaces.datasets.IScatterDataSet iScatterDataSet, com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler, float f, float f2, android.graphics.Paint paint) {
        float scatterShapeSize = iScatterDataSet.getScatterShapeSize() / 2.0f;
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(com.github.mikephil.charting.utils.Utils.convertDpToPixel(1.0f));
        canvas.drawLine(f - scatterShapeSize, f2, f + scatterShapeSize, f2, paint);
        canvas.drawLine(f, f2 - scatterShapeSize, f, f2 + scatterShapeSize, paint);
    }
}
