package com.github.mikephil.charting.renderer.scatter;

/* loaded from: classes8.dex */
public class XShapeRenderer implements com.github.mikephil.charting.renderer.scatter.IShapeRenderer {
    @Override // com.github.mikephil.charting.renderer.scatter.IShapeRenderer
    public void renderShape(android.graphics.Canvas canvas, com.github.mikephil.charting.interfaces.datasets.IScatterDataSet iScatterDataSet, com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler, float f, float f2, android.graphics.Paint paint) {
        float scatterShapeSize = iScatterDataSet.getScatterShapeSize() / 2.0f;
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(com.github.mikephil.charting.utils.Utils.convertDpToPixel(1.0f));
        float f3 = f - scatterShapeSize;
        float f4 = f2 - scatterShapeSize;
        float f5 = f + scatterShapeSize;
        float f6 = scatterShapeSize + f2;
        canvas.drawLine(f3, f4, f5, f6, paint);
        canvas.drawLine(f5, f4, f3, f6, paint);
    }
}
