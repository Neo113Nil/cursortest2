package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u001a\u0018\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0003\u0010\u0004\u001a0\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0080\b¢\u0006\u0004\b\u0003\u0010\n\"\u001a\u0010\u000b\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u001a\u0010\u000f\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000e"}, d2 = {"Landroidx/core/graphics/Insets;", "insets", "Landroidx/compose/ui/layout/ValueInsets;", "ValueInsets", "(Landroidx/core/graphics/Insets;)J", "", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT, com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP, com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT, com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM, "(IIII)J", "ZeroValueInsets", "J", "getZeroValueInsets", "()J", "UnsetValueInsets", "getUnsetValueInsets"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ValueInsets_androidKt {
    private static final long ZeroValueInsets = androidx.compose.ui.layout.ValueInsets.m7476constructorimpl(0);
    private static final long UnsetValueInsets = androidx.compose.ui.layout.ValueInsets.m7476constructorimpl(-1);

    public static final long ValueInsets(androidx.core.graphics.Insets insets) {
        return androidx.compose.ui.layout.ValueInsets.m7476constructorimpl((insets.left << 48) | (insets.top << 32) | (insets.right << 16) | insets.bottom);
    }

    public static final long ValueInsets(int i, int i2, int i3, int i4) {
        return androidx.compose.ui.layout.ValueInsets.m7476constructorimpl((i2 << 32) | (i << 48) | (i3 << 16) | i4);
    }

    public static final long getZeroValueInsets() {
        return ZeroValueInsets;
    }

    public static final long getUnsetValueInsets() {
        return UnsetValueInsets;
    }
}
