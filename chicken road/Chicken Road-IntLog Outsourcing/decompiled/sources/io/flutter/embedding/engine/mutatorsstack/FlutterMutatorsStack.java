package io.flutter.embedding.engine.mutatorsstack;

import W1.e;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class FlutterMutatorsStack {
    private List<e> mutators = new ArrayList();
    private Matrix finalMatrix = new Matrix();
    private List<Path> finalClippingPaths = new ArrayList();
    private float finalOpacity = 1.0f;

    public List<Path> getFinalClippingPaths() {
        return this.finalClippingPaths;
    }

    public Matrix getFinalMatrix() {
        return this.finalMatrix;
    }

    public float getFinalOpacity() {
        return this.finalOpacity;
    }

    public List<e> getMutators() {
        return this.mutators;
    }

    public void pushClipPath(Path path) {
        this.mutators.add(new e());
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }

    public void pushClipRRect(int i2, int i3, int i6, int i7, float[] fArr) {
        Rect rect = new Rect(i2, i3, i6, i7);
        this.mutators.add(new e());
        Path path = new Path();
        path.addRoundRect(new RectF(rect), fArr, Path.Direction.CCW);
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }

    public void pushClipRect(int i2, int i3, int i6, int i7) {
        Rect rect = new Rect(i2, i3, i6, i7);
        this.mutators.add(new e());
        Path path = new Path();
        path.addRect(new RectF(rect), Path.Direction.CCW);
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }

    public void pushOpacity(float f3) {
        this.mutators.add(new e());
        this.finalOpacity *= f3;
    }

    public void pushTransform(float[] fArr) {
        Matrix matrix = new Matrix();
        matrix.setValues(fArr);
        this.mutators.add(new e());
        this.finalMatrix.preConcat(matrix);
    }
}
