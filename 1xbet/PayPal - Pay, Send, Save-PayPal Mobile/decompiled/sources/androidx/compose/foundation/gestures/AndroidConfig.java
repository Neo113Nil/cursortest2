package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0007*\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\tJ#\u0010\u0012\u001a\u00020\u000f*\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/compose/foundation/gestures/AndroidConfig;", "Landroidx/compose/foundation/gestures/ScrollConfig;", "Landroid/view/ViewConfiguration;", "viewConfiguration", "<init>", "(Landroid/view/ViewConfiguration;)V", "Landroidx/compose/ui/unit/Density;", "", "getVerticalScrollFactor$foundation", "(Landroidx/compose/ui/unit/Density;)F", "getHorizontalScrollFactor$foundation", "Landroidx/compose/ui/input/pointer/PointerEvent;", "event", "Landroidx/compose/ui/unit/IntSize;", "bounds", "Landroidx/compose/ui/geometry/Offset;", "calculateMouseWheelScroll-8xgXZGE", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/input/pointer/PointerEvent;J)J", "calculateMouseWheelScroll", "Landroid/view/ViewConfiguration;", "getViewConfiguration", "()Landroid/view/ViewConfiguration;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidConfig implements androidx.compose.foundation.gestures.ScrollConfig {
    public static final int $stable = 8;
    private final android.view.ViewConfiguration viewConfiguration;

    public AndroidConfig(android.view.ViewConfiguration viewConfiguration) {
        this.viewConfiguration = viewConfiguration;
    }

    public final android.view.ViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }

    public final float getVerticalScrollFactor$foundation(androidx.compose.ui.unit.Density density) {
        if (android.os.Build.VERSION.SDK_INT > 26) {
            return androidx.compose.foundation.gestures.ViewConfigurationApi26Impl.INSTANCE.getHighSpeedVideoFpsRanges(this.viewConfiguration);
        }
        return density.mo1418toPx0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(64.0f));
    }

    public final float getHorizontalScrollFactor$foundation(androidx.compose.ui.unit.Density density) {
        if (android.os.Build.VERSION.SDK_INT > 26) {
            return androidx.compose.foundation.gestures.ViewConfigurationApi26Impl.INSTANCE.getHighResolutionOutputSizeshNQ4ISI(this.viewConfiguration);
        }
        return density.mo1418toPx0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(64.0f));
    }

    @Override // androidx.compose.foundation.gestures.ScrollConfig
    /* renamed from: calculateMouseWheelScroll-8xgXZGE, reason: not valid java name */
    public final long mo1431calculateMouseWheelScroll8xgXZGE(androidx.compose.ui.unit.Density density, androidx.compose.ui.input.pointer.PointerEvent pointerEvent, long j) {
        float f = -getVerticalScrollFactor$foundation(density);
        float f2 = -getHorizontalScrollFactor$foundation(density);
        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
        androidx.compose.ui.geometry.Offset m5741boximpl = androidx.compose.ui.geometry.Offset.m5741boximpl(androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0());
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            m5741boximpl = androidx.compose.ui.geometry.Offset.m5741boximpl(androidx.compose.ui.geometry.Offset.m5757plusMKHz9U(m5741boximpl.m5762unboximpl(), changes.get(i).getScrollDelta()));
        }
        long m5762unboximpl = m5741boximpl.m5762unboximpl();
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (m5762unboximpl >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (m5762unboximpl & 4294967295L));
        return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(intBitsToFloat * f2) << 32) | (java.lang.Float.floatToRawIntBits(intBitsToFloat2 * f) & 4294967295L));
    }
}
