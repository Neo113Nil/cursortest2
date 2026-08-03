package io.flutter.embedding.engine.mutatorsstack;

@androidx.annotation.Keep
/* loaded from: classes.dex */
public class FlutterMutatorsStack {
    private java.util.List<m0.j> mutators = new java.util.ArrayList();
    private android.graphics.Matrix finalMatrix = new android.graphics.Matrix();
    private java.util.List<android.graphics.Path> finalClippingPaths = new java.util.ArrayList();
    private float finalOpacity = 1.0f;

    public java.util.List<android.graphics.Path> getFinalClippingPaths() {
        return this.finalClippingPaths;
    }

    public android.graphics.Matrix getFinalMatrix() {
        return this.finalMatrix;
    }

    public float getFinalOpacity() {
        return this.finalOpacity;
    }

    public java.util.List<m0.j> getMutators() {
        return this.mutators;
    }

    public void pushClipPath(android.graphics.Path path) {
        this.mutators.add(new m0.j(23, false));
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }

    public void pushClipRRect(int i2, int i3, int i4, int i5, float[] fArr) {
        android.graphics.Rect rect = new android.graphics.Rect(i2, i3, i4, i5);
        this.mutators.add(new m0.j(23, false));
        android.graphics.Path path = new android.graphics.Path();
        path.addRoundRect(new android.graphics.RectF(rect), fArr, android.graphics.Path.Direction.CCW);
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }

    public void pushClipRect(int i2, int i3, int i4, int i5) {
        android.graphics.Rect rect = new android.graphics.Rect(i2, i3, i4, i5);
        this.mutators.add(new m0.j(23, false));
        android.graphics.Path path = new android.graphics.Path();
        path.addRect(new android.graphics.RectF(rect), android.graphics.Path.Direction.CCW);
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }

    public void pushOpacity(float f2) {
        this.mutators.add(new m0.j(23, false));
        this.finalOpacity *= f2;
    }

    public void pushTransform(float[] fArr) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setValues(fArr);
        this.mutators.add(new m0.j(23, false));
        this.finalMatrix.preConcat(matrix);
    }
}
