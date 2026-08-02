package com.google.android.material.canvas;

/* loaded from: classes8.dex */
public class CanvasCompat {

    public interface CanvasOperation {
        void run(android.graphics.Canvas canvas);
    }

    private CanvasCompat() {
    }

    public static int saveLayerAlpha(android.graphics.Canvas canvas, android.graphics.RectF rectF, int i) {
        return canvas.saveLayerAlpha(rectF, i);
    }

    public static int saveLayerAlpha(android.graphics.Canvas canvas, float f, float f2, float f3, float f4, int i) {
        return canvas.saveLayerAlpha(f, f2, f3, f4, i);
    }
}
