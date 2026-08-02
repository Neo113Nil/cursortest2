package androidx.compose.ui.unit;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\t\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003H\u0086\n¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\r\u001a\u00020\n*\u00020\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u0011\u0010\u0011\u001a\u00020\u000e*\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0011\u0010\u0013\u001a\u00020\u0003*\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0010\u001a\u0011\u0010\u0015\u001a\u00020\u0003*\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0010\"\u001b\u0010\u001a\u001a\u00020\u0016*\u00020\u00038G¢\u0006\f\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0017\u0010\u0010"}, d2 = {"", "width", "height", "Landroidx/compose/ui/unit/IntSize;", "IntSize", "(II)J", io.ktor.http.ContentDisposition.Parameters.Size, "times-O0kMr_c", "(IJ)J", "times", "Landroidx/compose/ui/unit/IntRect;", "toIntRect-ozmzZPI", "(J)Landroidx/compose/ui/unit/IntRect;", "toIntRect", "Landroidx/compose/ui/geometry/Size;", "toSize-ozmzZPI", "(J)J", "toSize", "toIntSize-uvyYCjk", "toIntSize", "roundToIntSize-uvyYCjk", "roundToIntSize", "Landroidx/compose/ui/unit/IntOffset;", "getCenter-ozmzZPI", "getCenter-ozmzZPI$annotations", "(J)V", com.dyneti.android.dyscan.DyScanHelperTextPosition.CENTER}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class IntSizeKt {
    /* renamed from: getCenter-ozmzZPI$annotations, reason: not valid java name */
    public static /* synthetic */ void m8779getCenterozmzZPI$annotations(long j) {
    }

    public static final long IntSize(int i, int i2) {
        return androidx.compose.ui.unit.IntSize.m8767constructorimpl((i2 & 4294967295L) | (i << 32));
    }

    /* renamed from: times-O0kMr_c, reason: not valid java name */
    public static final long m8781timesO0kMr_c(int i, long j) {
        return androidx.compose.ui.unit.IntSize.m8774timesYEO4UFw(j, i);
    }

    /* renamed from: toIntRect-ozmzZPI, reason: not valid java name */
    public static final androidx.compose.ui.unit.IntRect m8782toIntRectozmzZPI(long j) {
        return androidx.compose.ui.unit.IntRectKt.m8762IntRectVbeCjmY(androidx.compose.ui.unit.IntOffset.INSTANCE.m8740getZeronOccac(), j);
    }

    /* renamed from: getCenter-ozmzZPI, reason: not valid java name */
    public static final long m8778getCenterozmzZPI(long j) {
        return androidx.compose.ui.unit.IntOffset.m8723constructorimpl(((j >> 33) << 32) | (((j << 32) >> 33) & 4294967295L));
    }

    /* renamed from: toSize-ozmzZPI, reason: not valid java name */
    public static final long m8784toSizeozmzZPI(long j) {
        return androidx.compose.ui.geometry.Size.m5812constructorimpl((java.lang.Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L) | (java.lang.Float.floatToRawIntBits((int) (j >> 32)) << 32));
    }

    /* renamed from: toIntSize-uvyYCjk, reason: not valid java name */
    public static final long m8783toIntSizeuvyYCjk(long j) {
        return androidx.compose.ui.unit.IntSize.m8767constructorimpl((((int) java.lang.Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (((int) java.lang.Float.intBitsToFloat((int) (j >> 32))) << 32));
    }

    /* renamed from: roundToIntSize-uvyYCjk, reason: not valid java name */
    public static final long m8780roundToIntSizeuvyYCjk(long j) {
        return androidx.compose.ui.unit.IntSize.m8767constructorimpl((java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (j >> 32))) << 32));
    }
}
