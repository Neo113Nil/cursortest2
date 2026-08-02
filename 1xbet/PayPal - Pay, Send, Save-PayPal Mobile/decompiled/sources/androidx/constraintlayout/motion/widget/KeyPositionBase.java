package androidx.constraintlayout.motion.widget;

/* loaded from: classes7.dex */
abstract class KeyPositionBase extends androidx.constraintlayout.motion.widget.Key {
    protected static final float SELECTION_SLOPE = 20.0f;
    int getOutputSizes = UNSET;

    @Override // androidx.constraintlayout.motion.widget.Key
    void getAttributeNames(java.util.HashSet<java.lang.String> hashSet) {
    }

    public abstract boolean intersects(int i, int i2, android.graphics.RectF rectF, android.graphics.RectF rectF2, float f, float f2);

    abstract void positionAttributes(android.view.View view, android.graphics.RectF rectF, android.graphics.RectF rectF2, float f, float f2, java.lang.String[] strArr, float[] fArr);

    KeyPositionBase() {
    }
}
