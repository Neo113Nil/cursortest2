package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "pivotFractionX", "pivotFractionY", "Landroidx/compose/ui/graphics/TransformOrigin;", "TransformOrigin", "(FF)J"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TransformOriginKt {
    public static final long TransformOrigin(float f, float f2) {
        return androidx.compose.ui.graphics.TransformOrigin.m6368constructorimpl((java.lang.Float.floatToRawIntBits(f2) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f) << 32));
    }
}
