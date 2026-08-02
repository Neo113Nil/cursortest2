package androidx.compose.ui.geometry;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\n\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001a\u001d\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\t\u001a\u001d\u0010\n\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/compose/ui/geometry/MutableRect;", "Landroidx/compose/ui/geometry/Rect;", "toRect", "(Landroidx/compose/ui/geometry/MutableRect;)Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/geometry/Offset;", "offset", "Landroidx/compose/ui/geometry/Size;", io.ktor.http.ContentDisposition.Parameters.Size, "MutableRect-tz77jQw", "(JJ)Landroidx/compose/ui/geometry/MutableRect;", "MutableRect", "topLeft", "bottomRight", "MutableRect-0a9Yr6o", com.dyneti.android.dyscan.DyScanHelperTextPosition.CENTER, "", "radius", "MutableRect-3MmeM6k", "(JF)Landroidx/compose/ui/geometry/MutableRect;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MutableRectKt {
    public static final androidx.compose.ui.geometry.Rect toRect(androidx.compose.ui.geometry.MutableRect mutableRect) {
        return new androidx.compose.ui.geometry.Rect(mutableRect.getLeft(), mutableRect.getTop(), mutableRect.getRight(), mutableRect.getBottom());
    }

    /* renamed from: MutableRect-tz77jQw, reason: not valid java name */
    public static final androidx.compose.ui.geometry.MutableRect m5740MutableRecttz77jQw(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new androidx.compose.ui.geometry.MutableRect(java.lang.Float.intBitsToFloat(i), java.lang.Float.intBitsToFloat(i2), java.lang.Float.intBitsToFloat(i) + java.lang.Float.intBitsToFloat((int) (j2 >> 32)), java.lang.Float.intBitsToFloat(i2) + java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    /* renamed from: MutableRect-0a9Yr6o, reason: not valid java name */
    public static final androidx.compose.ui.geometry.MutableRect m5738MutableRect0a9Yr6o(long j, long j2) {
        return new androidx.compose.ui.geometry.MutableRect(java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat((int) (j & 4294967295L)), java.lang.Float.intBitsToFloat((int) (j2 >> 32)), java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    /* renamed from: MutableRect-3MmeM6k, reason: not valid java name */
    public static final androidx.compose.ui.geometry.MutableRect m5739MutableRect3MmeM6k(long j, float f) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new androidx.compose.ui.geometry.MutableRect(java.lang.Float.intBitsToFloat(i) - f, java.lang.Float.intBitsToFloat(i2) - f, java.lang.Float.intBitsToFloat(i) + f, java.lang.Float.intBitsToFloat(i2) + f);
    }
}
