package androidx.compose.foundation.text;

/* compiled from: TextLayoutResultProxy.kt */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0006"}, d2 = {"coerceIn", "Landroidx/compose/ui/geometry/Offset;", "rect", "Landroidx/compose/ui/geometry/Rect;", "coerceIn-3MmeM6k", "(JLandroidx/compose/ui/geometry/Rect;)J", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextLayoutResultProxyKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: coerceIn-3MmeM6k, reason: not valid java name */
    public static final long m957coerceIn3MmeM6k(long j, androidx.compose.ui.geometry.Rect rect) {
        float right;
        float bottom;
        if (androidx.compose.ui.geometry.Offset.m1871getXimpl(j) < rect.getLeft()) {
            right = rect.getLeft();
        } else {
            right = androidx.compose.ui.geometry.Offset.m1871getXimpl(j) > rect.getRight() ? rect.getRight() : androidx.compose.ui.geometry.Offset.m1871getXimpl(j);
        }
        if (androidx.compose.ui.geometry.Offset.m1872getYimpl(j) < rect.getTop()) {
            bottom = rect.getTop();
        } else {
            bottom = androidx.compose.ui.geometry.Offset.m1872getYimpl(j) > rect.getBottom() ? rect.getBottom() : androidx.compose.ui.geometry.Offset.m1872getYimpl(j);
        }
        return androidx.compose.ui.geometry.OffsetKt.Offset(right, bottom);
    }
}
