package androidx.compose.ui.geometry;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\b\u001a\u001d\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\u0006\u001a\u001d\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a%\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/compose/ui/geometry/Offset;", "offset", "Landroidx/compose/ui/geometry/Size;", io.ktor.http.ContentDisposition.Parameters.Size, "Landroidx/compose/ui/geometry/Rect;", "Rect-tz77jQw", "(JJ)Landroidx/compose/ui/geometry/Rect;", "Rect", "topLeft", "bottomRight", "Rect-0a9Yr6o", com.dyneti.android.dyscan.DyScanHelperTextPosition.CENTER, "", "radius", "Rect-3MmeM6k", "(JF)Landroidx/compose/ui/geometry/Rect;", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "stop", "fraction", "lerp", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;F)Landroidx/compose/ui/geometry/Rect;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RectKt {
    public static final androidx.compose.ui.geometry.Rect lerp(androidx.compose.ui.geometry.Rect rect, androidx.compose.ui.geometry.Rect rect2, float f) {
        return new androidx.compose.ui.geometry.Rect(androidx.compose.ui.util.MathHelpersKt.lerp(rect.getLeft(), rect2.getLeft(), f), androidx.compose.ui.util.MathHelpersKt.lerp(rect.getTop(), rect2.getTop(), f), androidx.compose.ui.util.MathHelpersKt.lerp(rect.getRight(), rect2.getRight(), f), androidx.compose.ui.util.MathHelpersKt.lerp(rect.getBottom(), rect2.getBottom(), f));
    }

    /* renamed from: Rect-tz77jQw, reason: not valid java name */
    public static final androidx.compose.ui.geometry.Rect m5792Recttz77jQw(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new androidx.compose.ui.geometry.Rect(java.lang.Float.intBitsToFloat(i), java.lang.Float.intBitsToFloat(i2), java.lang.Float.intBitsToFloat(i) + java.lang.Float.intBitsToFloat((int) (j2 >> 32)), java.lang.Float.intBitsToFloat(i2) + java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    /* renamed from: Rect-0a9Yr6o, reason: not valid java name */
    public static final androidx.compose.ui.geometry.Rect m5790Rect0a9Yr6o(long j, long j2) {
        return new androidx.compose.ui.geometry.Rect(java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat((int) (j & 4294967295L)), java.lang.Float.intBitsToFloat((int) (j2 >> 32)), java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    /* renamed from: Rect-3MmeM6k, reason: not valid java name */
    public static final androidx.compose.ui.geometry.Rect m5791Rect3MmeM6k(long j, float f) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new androidx.compose.ui.geometry.Rect(java.lang.Float.intBitsToFloat(i) - f, java.lang.Float.intBitsToFloat(i2) - f, java.lang.Float.intBitsToFloat(i) + f, java.lang.Float.intBitsToFloat(i2) + f);
    }
}
