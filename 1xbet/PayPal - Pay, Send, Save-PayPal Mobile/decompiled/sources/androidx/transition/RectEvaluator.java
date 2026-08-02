package androidx.transition;

/* loaded from: classes3.dex */
class RectEvaluator implements android.animation.TypeEvaluator<android.graphics.Rect> {
    private android.graphics.Rect getHighSpeedVideoSizes;

    @Override // android.animation.TypeEvaluator
    public /* synthetic */ android.graphics.Rect evaluate(float f, android.graphics.Rect rect, android.graphics.Rect rect2) {
        android.graphics.Rect rect3 = rect;
        android.graphics.Rect rect4 = rect2;
        int i = rect3.left + ((int) ((rect4.left - rect3.left) * f));
        int i2 = rect3.top + ((int) ((rect4.top - rect3.top) * f));
        int i3 = rect3.right + ((int) ((rect4.right - rect3.right) * f));
        int i4 = rect3.bottom + ((int) ((rect4.bottom - rect3.bottom) * f));
        android.graphics.Rect rect5 = this.getHighSpeedVideoSizes;
        if (rect5 == null) {
            return new android.graphics.Rect(i, i2, i3, i4);
        }
        rect5.set(i, i2, i3, i4);
        return this.getHighSpeedVideoSizes;
    }

    RectEvaluator() {
    }

    RectEvaluator(android.graphics.Rect rect) {
        this.getHighSpeedVideoSizes = rect;
    }
}
