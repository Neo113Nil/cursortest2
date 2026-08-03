package androidx.compose.foundation.gestures;

/* compiled from: AndroidScrollable.android.kt */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/gestures/AndroidConfig;", "Landroidx/compose/foundation/gestures/ScrollConfig;", "()V", "calculateMouseWheelScroll", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/unit/Density;", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "Landroidx/compose/ui/input/pointer/PointerEvent;", "bounds", "Landroidx/compose/ui/unit/IntSize;", "calculateMouseWheelScroll-8xgXZGE", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/input/pointer/PointerEvent;J)J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class AndroidConfig implements androidx.compose.foundation.gestures.ScrollConfig {
    public static final androidx.compose.foundation.gestures.AndroidConfig INSTANCE = new androidx.compose.foundation.gestures.AndroidConfig();

    private AndroidConfig() {
    }

    @Override // androidx.compose.foundation.gestures.ScrollConfig
    /* renamed from: calculateMouseWheelScroll-8xgXZGE, reason: not valid java name */
    public long mo321calculateMouseWheelScroll8xgXZGE(androidx.compose.ui.unit.Density density, androidx.compose.ui.input.pointer.PointerEvent pointerEvent, long j) {
        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
        androidx.compose.ui.geometry.Offset m1860boximpl = androidx.compose.ui.geometry.Offset.m1860boximpl(androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0());
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            m1860boximpl = androidx.compose.ui.geometry.Offset.m1860boximpl(androidx.compose.ui.geometry.Offset.m1876plusMKHz9U(m1860boximpl.getPackedValue(), changes.get(i).getScrollDelta()));
        }
        return androidx.compose.ui.geometry.Offset.m1878timestuRUvjQ(m1860boximpl.getPackedValue(), -density.mo315toPx0680j_4(androidx.compose.ui.unit.Dp.m4478constructorimpl(64)));
    }
}
