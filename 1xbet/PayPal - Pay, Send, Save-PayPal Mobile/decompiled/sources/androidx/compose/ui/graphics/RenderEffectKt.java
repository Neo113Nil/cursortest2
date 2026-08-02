package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000¢\u0006\u0004\b\f\u0010\r"}, d2 = {"", "radiusX", "radiusY", "Landroidx/compose/ui/graphics/TileMode;", "edgeTreatment", "Landroidx/compose/ui/graphics/BlurEffect;", "BlurEffect-3YTHUZs", "(FFI)Landroidx/compose/ui/graphics/BlurEffect;", "BlurEffect", "offsetX", "offsetY", "Landroidx/compose/ui/graphics/OffsetEffect;", "OffsetEffect", "(FF)Landroidx/compose/ui/graphics/OffsetEffect;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RenderEffectKt {
    /* renamed from: BlurEffect-3YTHUZs$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.graphics.BlurEffect m6303BlurEffect3YTHUZs$default(float f, float f2, int i, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            i = androidx.compose.ui.graphics.TileMode.INSTANCE.m6361getClamp3opZhB0();
        }
        return m6302BlurEffect3YTHUZs(f, f2, i);
    }

    /* renamed from: BlurEffect-3YTHUZs, reason: not valid java name */
    public static final androidx.compose.ui.graphics.BlurEffect m6302BlurEffect3YTHUZs(float f, float f2, int i) {
        return new androidx.compose.ui.graphics.BlurEffect(null, f, f2, i, null);
    }

    public static final androidx.compose.ui.graphics.OffsetEffect OffsetEffect(float f, float f2) {
        return new androidx.compose.ui.graphics.OffsetEffect(null, androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(f2) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f) << 32)), null);
    }
}
