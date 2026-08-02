package com.github.mikephil.charting.renderer.scatter;

/* loaded from: classes8.dex */
public class CircleShapeRenderer implements com.github.mikephil.charting.renderer.scatter.IShapeRenderer {
    @Override // com.github.mikephil.charting.renderer.scatter.IShapeRenderer
    public void renderShape(android.graphics.Canvas canvas, com.github.mikephil.charting.interfaces.datasets.IScatterDataSet iScatterDataSet, com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler, float f, float f2, android.graphics.Paint paint) {
        float scatterShapeSize = iScatterDataSet.getScatterShapeSize();
        float f3 = scatterShapeSize / 2.0f;
        float convertDpToPixel = com.github.mikephil.charting.utils.Utils.convertDpToPixel(iScatterDataSet.getScatterShapeHoleRadius());
        float f4 = (scatterShapeSize - (convertDpToPixel * 2.0f)) / 2.0f;
        float f5 = f4 / 2.0f;
        int scatterShapeHoleColor = iScatterDataSet.getScatterShapeHoleColor();
        if (scatterShapeSize > 0.0d) {
            paint.setStyle(android.graphics.Paint.Style.STROKE);
            paint.setStrokeWidth(f4);
            canvas.drawCircle(f, f2, f5 + convertDpToPixel, paint);
            if (scatterShapeHoleColor != 1122867) {
                paint.setStyle(android.graphics.Paint.Style.FILL);
                paint.setColor(scatterShapeHoleColor);
                canvas.drawCircle(f, f2, convertDpToPixel, paint);
                return;
            }
            return;
        }
        paint.setStyle(android.graphics.Paint.Style.FILL);
        canvas.drawCircle(f, f2, f3, paint);
    }
}
