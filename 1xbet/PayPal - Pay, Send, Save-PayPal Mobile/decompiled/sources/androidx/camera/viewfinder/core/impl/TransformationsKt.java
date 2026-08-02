package androidx.camera.viewfinder.core.impl;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000¢\u0006\u0004\b\t\u0010\u0005\"\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"", "scaleX", "scaleY", "Landroidx/camera/viewfinder/core/impl/ScaleFactorF;", "ScaleFactorF", "(FF)J", "x", "y", "Landroidx/camera/viewfinder/core/impl/OffsetF;", "OffsetF", "Landroid/graphics/RectF;", "getHighSpeedVideoFpsRanges", "Landroid/graphics/RectF;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TransformationsKt {
    private static final android.graphics.RectF getHighSpeedVideoFpsRanges = new android.graphics.RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    public static final long OffsetF(float f, float f2) {
        return androidx.camera.viewfinder.core.impl.OffsetF.m1050constructorimpl((java.lang.Float.floatToRawIntBits(f2) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f) << 32));
    }

    public static final long ScaleFactorF(float f, float f2) {
        return androidx.camera.viewfinder.core.impl.ScaleFactorF.m1059constructorimpl((java.lang.Float.floatToRawIntBits(f2) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f) << 32));
    }
}
