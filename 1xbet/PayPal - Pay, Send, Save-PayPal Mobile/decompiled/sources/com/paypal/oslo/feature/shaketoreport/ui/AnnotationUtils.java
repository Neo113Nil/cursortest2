package com.paypal.oslo.feature.shaketoreport.ui;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\r\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/shaketoreport/ui/AnnotationUtils;", "", "<init>", "()V", "", "Lcom/paypal/oslo/feature/shaketoreport/ui/DrawPath;", "paths", "Landroidx/compose/ui/geometry/Offset;", "tapPosition", "", "threshold", "findPathAtPosition-d-4ec7I", "(Ljava/util/List;JF)Lcom/paypal/oslo/feature/shaketoreport/ui/DrawPath;", "findPathAtPosition", "Landroid/graphics/Bitmap;", "originalBitmap", "drawingPaths", "Landroidx/compose/ui/unit/IntSize;", "canvasSize", "createAnnotatedBitmap-H0pRuoY", "(Landroid/graphics/Bitmap;Ljava/util/List;J)Landroid/graphics/Bitmap;", "createAnnotatedBitmap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AnnotationUtils {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.shaketoreport.ui.AnnotationUtils INSTANCE = new com.paypal.oslo.feature.shaketoreport.ui.AnnotationUtils();

    private AnnotationUtils() {
    }

    /* renamed from: findPathAtPosition-d-4ec7I, reason: not valid java name */
    public final com.paypal.oslo.feature.shaketoreport.ui.DrawPath m19324findPathAtPositiond4ec7I(java.util.List<com.paypal.oslo.feature.shaketoreport.ui.DrawPath> paths, long tapPosition, float threshold) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paths, "");
        java.util.Iterator<T> it = paths.iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            java.util.List<androidx.compose.ui.geometry.Offset> points = ((com.paypal.oslo.feature.shaketoreport.ui.DrawPath) obj).getPoints();
            if (!(points instanceof java.util.Collection) || !points.isEmpty()) {
                java.util.Iterator<T> it2 = points.iterator();
                while (it2.hasNext()) {
                    long m5762unboximpl = ((androidx.compose.ui.geometry.Offset) it2.next()).m5762unboximpl();
                    float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (m5762unboximpl >> 32)) - java.lang.Float.intBitsToFloat((int) (tapPosition >> 32));
                    float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (m5762unboximpl & 4294967295L)) - java.lang.Float.intBitsToFloat((int) (tapPosition & 4294967295L));
                    if (((float) java.lang.Math.sqrt((intBitsToFloat * intBitsToFloat) + (intBitsToFloat2 * intBitsToFloat2))) < threshold) {
                        break loop0;
                    }
                }
            }
        }
        return (com.paypal.oslo.feature.shaketoreport.ui.DrawPath) obj;
    }

    /* renamed from: createAnnotatedBitmap-H0pRuoY, reason: not valid java name */
    public final android.graphics.Bitmap m19323createAnnotatedBitmapH0pRuoY(android.graphics.Bitmap originalBitmap, java.util.List<com.paypal.oslo.feature.shaketoreport.ui.DrawPath> drawingPaths, long canvasSize) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(originalBitmap, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawingPaths, "");
        boolean z = true;
        android.graphics.Bitmap copy = originalBitmap.copy(android.graphics.Bitmap.Config.ARGB_8888, true);
        android.graphics.Canvas canvas = new android.graphics.Canvas(copy);
        float width = copy.getWidth() / ((int) (canvasSize >> 32));
        float height = copy.getHeight() / ((int) (canvasSize & 4294967295L));
        for (com.paypal.oslo.feature.shaketoreport.ui.DrawPath drawPath : drawingPaths) {
            android.graphics.Paint paint = new android.graphics.Paint();
            paint.setColor(drawPath.getColor());
            paint.setStrokeWidth(drawPath.getStrokeWidth() * width);
            paint.setStyle(android.graphics.Paint.Style.STROKE);
            paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
            paint.setStrokeJoin(android.graphics.Paint.Join.ROUND);
            paint.setAntiAlias(z);
            int size = drawPath.getPoints().size();
            int i = 0;
            while (i < size - 1) {
                long m5762unboximpl = drawPath.getPoints().get(i).m5762unboximpl();
                int i2 = i + 1;
                long m5762unboximpl2 = drawPath.getPoints().get(i2).m5762unboximpl();
                canvas.drawLine(java.lang.Float.intBitsToFloat((int) (m5762unboximpl >> 32)) * width, java.lang.Float.intBitsToFloat((int) (m5762unboximpl & 4294967295L)) * height, java.lang.Float.intBitsToFloat((int) (m5762unboximpl2 >> 32)) * width, java.lang.Float.intBitsToFloat((int) (m5762unboximpl2 & 4294967295L)) * height, paint);
                i = i2;
                z = true;
            }
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(copy);
        return copy;
    }
}
