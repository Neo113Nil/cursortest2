package com.github.mikephil.charting.renderer.scatter;

/* loaded from: classes8.dex */
public class SquareShapeRenderer implements com.github.mikephil.charting.renderer.scatter.IShapeRenderer {
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
            float f6 = f - convertDpToPixel;
            float f7 = f2 - convertDpToPixel;
            float f8 = f + convertDpToPixel;
            float f9 = f2 + convertDpToPixel;
            canvas.drawRect(f6 - f5, f7 - f5, f8 + f5, f9 + f5, paint);
            if (scatterShapeHoleColor != 1122867) {
                paint.setStyle(android.graphics.Paint.Style.FILL);
                paint.setColor(scatterShapeHoleColor);
                canvas.drawRect(f6, f7, f8, f9, paint);
                return;
            }
            return;
        }
        paint.setStyle(android.graphics.Paint.Style.FILL);
        canvas.drawRect(f - f3, f2 - f3, f + f3, f2 + f3, paint);
    }
}
