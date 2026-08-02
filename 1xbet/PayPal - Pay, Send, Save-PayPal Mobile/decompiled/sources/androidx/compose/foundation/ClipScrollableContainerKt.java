package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0006\u001a\u00020\u00058\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "clipScrollableContainer", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/Orientation;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/Dp;", "MaxSupportedElevation", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getMaxSupportedElevation", "()F"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ClipScrollableContainerKt {
    private static final float MaxSupportedElevation = androidx.compose.ui.unit.Dp.m8601constructorimpl(30.0f);

    public static final androidx.compose.ui.Modifier clipScrollableContainer(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.gestures.Orientation orientation) {
        androidx.compose.ui.Modifier clip;
        if (orientation == androidx.compose.foundation.gestures.Orientation.Vertical) {
            clip = androidx.compose.ui.draw.ClipKt.clip(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.foundation.VerticalScrollableClipShape.INSTANCE);
        } else {
            clip = androidx.compose.ui.draw.ClipKt.clip(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.foundation.HorizontalScrollableClipShape.INSTANCE);
        }
        return modifier.then(clip);
    }

    public static final float getMaxSupportedElevation() {
        return MaxSupportedElevation;
    }
}
