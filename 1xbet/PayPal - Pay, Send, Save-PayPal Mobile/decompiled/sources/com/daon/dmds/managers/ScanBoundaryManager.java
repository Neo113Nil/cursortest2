package com.daon.dmds.managers;

/* loaded from: classes7.dex */
public class ScanBoundaryManager {
    private com.daon.dmds.managers.ScanBoundaryManager.BoundaryType Camera2StreamConfigurationMap;

    public enum BoundaryType {
        CORNERS,
        RECTANGLE,
        POLYGON,
        OVERLAY
    }

    public ScanBoundaryManager(com.daon.dmds.managers.ScanBoundaryManager.BoundaryType boundaryType) {
        this.Camera2StreamConfigurationMap = boundaryType;
    }

    public void drawBoundary(android.graphics.Canvas canvas, android.graphics.Paint paint, android.graphics.Point point, android.graphics.Point point2, android.graphics.Point point3, android.graphics.Point point4, float f, float f2) {
        com.daon.dmds.managers.ScanBoundaryManager.BoundaryType boundaryType = this.Camera2StreamConfigurationMap;
        if (boundaryType != com.daon.dmds.managers.ScanBoundaryManager.BoundaryType.CORNERS) {
            if (boundaryType == com.daon.dmds.managers.ScanBoundaryManager.BoundaryType.POLYGON) {
                canvas.drawLine(point.x - 0.0f, point.y, point2.x + 0.0f, point2.y, paint);
                canvas.drawLine(point2.x, point2.y, point4.x, point4.y, paint);
                canvas.drawLine(point4.x + 0.0f, point4.y, point3.x - 0.0f, point3.y, paint);
                canvas.drawLine(point3.x, point3.y, point.x, point.y, paint);
                return;
            }
            if (boundaryType == com.daon.dmds.managers.ScanBoundaryManager.BoundaryType.RECTANGLE) {
                android.graphics.Path path = new android.graphics.Path();
                path.moveTo(point.x, point.y);
                path.lineTo(point.x, point.y);
                path.lineTo(point2.x, point2.y);
                path.lineTo(point4.x, point4.y);
                path.lineTo(point3.x, point3.y);
                path.close();
                canvas.drawPath(path, paint);
                return;
            }
            return;
        }
        float f3 = f2 / 2.0f;
        float f4 = point.x;
        float f5 = point.y;
        canvas.drawLine(f4, f5, f4, f5 + f, paint);
        float f6 = point.x;
        float f7 = point.y;
        canvas.drawLine(f6 - f3, f7, f6 + f, f7, paint);
        float f8 = point2.x;
        float f9 = point2.y;
        canvas.drawLine(f8, f9 + f3, f8, f9 + f, paint);
        float f10 = point2.x;
        float f11 = point2.y;
        canvas.drawLine(f10 + f3, f11, f10 - f, f11, paint);
        float f12 = point3.x;
        float f13 = point3.y;
        canvas.drawLine(f12, f13, f12, f13 - f, paint);
        float f14 = point3.x;
        float f15 = point3.y;
        canvas.drawLine(f14 - f3, f15, f14 + f, f15, paint);
        float f16 = point4.x;
        float f17 = point4.y;
        canvas.drawLine(f16, f17, f16, f17 - f, paint);
        float f18 = point4.x;
        float f19 = point4.y;
        canvas.drawLine(f3 + f18, f19, f18 - f, f19, paint);
    }

    public void drawCircle(android.graphics.Canvas canvas, android.graphics.Paint paint, android.graphics.Point point) {
        canvas.drawCircle(point.x, point.y, 40.0f, paint);
    }

    public void setBoundaryType(com.daon.dmds.managers.ScanBoundaryManager.BoundaryType boundaryType) {
        this.Camera2StreamConfigurationMap = boundaryType;
    }
}
