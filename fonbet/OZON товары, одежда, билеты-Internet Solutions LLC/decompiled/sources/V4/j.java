package V4;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* loaded from: classes8.dex */
final class j implements TypeEvaluator<Rect> {
    @Override // android.animation.TypeEvaluator
    public final Rect evaluate(float f7, Rect rect, Rect rect2) {
        Rect rect3 = rect;
        Rect rect4 = rect2;
        return new Rect(rect3.left + ((int) ((rect4.left - r0) * f7)), rect3.top + ((int) ((rect4.top - r1) * f7)), rect3.right + ((int) ((rect4.right - r2) * f7)), rect3.bottom + ((int) ((rect4.bottom - r6) * f7)));
    }
}
