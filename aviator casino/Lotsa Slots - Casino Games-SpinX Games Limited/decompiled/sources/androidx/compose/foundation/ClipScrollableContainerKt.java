package androidx.compose.foundation;

/* compiled from: ClipScrollableContainer.kt */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\t\u001a\u00020\nH\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"HorizontalScrollableClipModifier", "Landroidx/compose/ui/Modifier;", "MaxSupportedElevation", "Landroidx/compose/ui/unit/Dp;", "getMaxSupportedElevation", "()F", "F", "VerticalScrollableClipModifier", "clipScrollableContainer", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ClipScrollableContainerKt {
    private static final float MaxSupportedElevation = androidx.compose.ui.unit.Dp.m4478constructorimpl(30);
    private static final androidx.compose.ui.Modifier HorizontalScrollableClipModifier = androidx.compose.ui.draw.ClipKt.clip(androidx.compose.ui.Modifier.INSTANCE, new androidx.compose.ui.graphics.Shape() { // from class: androidx.compose.foundation.ClipScrollableContainerKt$HorizontalScrollableClipModifier$1
        @Override // androidx.compose.ui.graphics.Shape
        /* renamed from: createOutline-Pq9zytI, reason: not valid java name */
        public androidx.compose.ui.graphics.Outline mo262createOutlinePq9zytI(long size, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.unit.Density density) {
            float mo309roundToPx0680j_4 = density.mo309roundToPx0680j_4(androidx.compose.foundation.ClipScrollableContainerKt.getMaxSupportedElevation());
            return new androidx.compose.ui.graphics.Outline.Rectangle(new androidx.compose.ui.geometry.Rect(0.0f, -mo309roundToPx0680j_4, androidx.compose.ui.geometry.Size.m1940getWidthimpl(size), androidx.compose.ui.geometry.Size.m1937getHeightimpl(size) + mo309roundToPx0680j_4));
        }
    });
    private static final androidx.compose.ui.Modifier VerticalScrollableClipModifier = androidx.compose.ui.draw.ClipKt.clip(androidx.compose.ui.Modifier.INSTANCE, new androidx.compose.ui.graphics.Shape() { // from class: androidx.compose.foundation.ClipScrollableContainerKt$VerticalScrollableClipModifier$1
        @Override // androidx.compose.ui.graphics.Shape
        /* renamed from: createOutline-Pq9zytI */
        public androidx.compose.ui.graphics.Outline mo262createOutlinePq9zytI(long size, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.unit.Density density) {
            float mo309roundToPx0680j_4 = density.mo309roundToPx0680j_4(androidx.compose.foundation.ClipScrollableContainerKt.getMaxSupportedElevation());
            return new androidx.compose.ui.graphics.Outline.Rectangle(new androidx.compose.ui.geometry.Rect(-mo309roundToPx0680j_4, 0.0f, androidx.compose.ui.geometry.Size.m1940getWidthimpl(size) + mo309roundToPx0680j_4, androidx.compose.ui.geometry.Size.m1937getHeightimpl(size)));
        }
    });

    public static final androidx.compose.ui.Modifier clipScrollableContainer(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.gestures.Orientation orientation) {
        androidx.compose.ui.Modifier modifier2;
        if (orientation == androidx.compose.foundation.gestures.Orientation.Vertical) {
            modifier2 = VerticalScrollableClipModifier;
        } else {
            modifier2 = HorizontalScrollableClipModifier;
        }
        return modifier.then(modifier2);
    }

    public static final float getMaxSupportedElevation() {
        return MaxSupportedElevation;
    }
}
