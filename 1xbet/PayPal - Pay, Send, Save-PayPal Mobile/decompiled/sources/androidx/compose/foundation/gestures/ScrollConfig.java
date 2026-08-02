package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\r\u001a\u00020\n*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollConfig;", "", "Landroidx/compose/ui/input/pointer/PointerEvent;", "event", "", "isPreciseWheelScroll", "(Landroidx/compose/ui/input/pointer/PointerEvent;)Z", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/IntSize;", "bounds", "Landroidx/compose/ui/geometry/Offset;", "calculateMouseWheelScroll-8xgXZGE", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/input/pointer/PointerEvent;J)J", "calculateMouseWheelScroll", "isSmoothScrollingEnabled", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ScrollConfig {
    /* renamed from: calculateMouseWheelScroll-8xgXZGE */
    long mo1431calculateMouseWheelScroll8xgXZGE(androidx.compose.ui.unit.Density density, androidx.compose.ui.input.pointer.PointerEvent pointerEvent, long j);

    default boolean isPreciseWheelScroll(androidx.compose.ui.input.pointer.PointerEvent event) {
        return false;
    }

    default boolean isSmoothScrollingEnabled() {
        return true;
    }
}
