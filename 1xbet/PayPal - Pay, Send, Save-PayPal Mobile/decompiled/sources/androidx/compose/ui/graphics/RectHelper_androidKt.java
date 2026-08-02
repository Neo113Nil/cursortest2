package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\u0007\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\u0007\u001a\u00020\u0000*\u00020\u0004¢\u0006\u0004\b\u0007\u0010\t\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\n¢\u0006\u0004\b\u0002\u0010\u000b\u001a\u0011\u0010\f\u001a\u00020\n*\u00020\u0001¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Landroidx/compose/ui/geometry/Rect;", "Landroid/graphics/Rect;", "toAndroidRect", "(Landroidx/compose/ui/geometry/Rect;)Landroid/graphics/Rect;", "Landroid/graphics/RectF;", "toAndroidRectF", "(Landroidx/compose/ui/geometry/Rect;)Landroid/graphics/RectF;", "toComposeRect", "(Landroid/graphics/Rect;)Landroidx/compose/ui/geometry/Rect;", "(Landroid/graphics/RectF;)Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/IntRect;", "(Landroidx/compose/ui/unit/IntRect;)Landroid/graphics/Rect;", "toComposeIntRect", "(Landroid/graphics/Rect;)Landroidx/compose/ui/unit/IntRect;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RectHelper_androidKt {
    @kotlin.Deprecated(message = "Converting Rect to android.graphics.Rect is lossy, and requires rounding. The behavior of toAndroidRect() truncates to an integral Rect, but you should choose the method of rounding most suitable for your use case.", replaceWith = @kotlin.ReplaceWith(expression = "android.graphics.Rect(left.toInt(), top.toInt(), right.toInt(), bottom.toInt())", imports = {}))
    public static final android.graphics.Rect toAndroidRect(androidx.compose.ui.geometry.Rect rect) {
        return new android.graphics.Rect((int) rect.getLeft(), (int) rect.getTop(), (int) rect.getRight(), (int) rect.getBottom());
    }

    public static final android.graphics.RectF toAndroidRectF(androidx.compose.ui.geometry.Rect rect) {
        return new android.graphics.RectF(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
    }

    public static final androidx.compose.ui.geometry.Rect toComposeRect(android.graphics.Rect rect) {
        return new androidx.compose.ui.geometry.Rect(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final androidx.compose.ui.geometry.Rect toComposeRect(android.graphics.RectF rectF) {
        return new androidx.compose.ui.geometry.Rect(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static final android.graphics.Rect toAndroidRect(androidx.compose.ui.unit.IntRect intRect) {
        return new android.graphics.Rect(intRect.getLeft(), intRect.getTop(), intRect.getRight(), intRect.getBottom());
    }

    public static final androidx.compose.ui.unit.IntRect toComposeIntRect(android.graphics.Rect rect) {
        return new androidx.compose.ui.unit.IntRect(rect.left, rect.top, rect.right, rect.bottom);
    }
}
