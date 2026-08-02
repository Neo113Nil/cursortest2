package com.google.android.material.progressindicator;

/* loaded from: classes8.dex */
abstract class DrawingDelegate<S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec> {
    S spec;

    abstract void adjustCanvas(android.graphics.Canvas canvas, android.graphics.Rect rect, float f, boolean z, boolean z2);

    abstract void drawStopIndicator(android.graphics.Canvas canvas, android.graphics.Paint paint, int i, int i2);

    abstract void fillIndicator(android.graphics.Canvas canvas, android.graphics.Paint paint, com.google.android.material.progressindicator.DrawingDelegate.ActiveIndicator activeIndicator, int i);

    abstract void fillTrack(android.graphics.Canvas canvas, android.graphics.Paint paint, float f, float f2, int i, int i2, int i3);

    abstract int getPreferredHeight();

    abstract int getPreferredWidth();

    public DrawingDelegate(S s) {
        this.spec = s;
    }

    void validateSpecAndAdjustCanvas(android.graphics.Canvas canvas, android.graphics.Rect rect, float f, boolean z, boolean z2) {
        this.spec.validateSpec();
        adjustCanvas(canvas, rect, f, z, z2);
    }

    protected static class ActiveIndicator {
        int color;
        float endFraction;
        int gapSize;
        float startFraction;

        protected ActiveIndicator() {
        }
    }
}
