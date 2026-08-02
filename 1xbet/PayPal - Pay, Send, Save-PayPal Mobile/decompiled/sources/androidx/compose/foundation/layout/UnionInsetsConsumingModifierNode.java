package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u0005R\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/compose/foundation/layout/UnionInsetsConsumingModifierNode;", "Landroidx/compose/foundation/layout/InsetsConsumingModifierNode;", "Landroidx/compose/foundation/layout/WindowInsets;", "p0", "<init>", "(Landroidx/compose/foundation/layout/WindowInsets;)V", "calculateInsets", "(Landroidx/compose/foundation/layout/WindowInsets;)Landroidx/compose/foundation/layout/WindowInsets;", "", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "Landroidx/compose/foundation/layout/WindowInsets;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class UnionInsetsConsumingModifierNode extends androidx.compose.foundation.layout.InsetsConsumingModifierNode {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private androidx.compose.foundation.layout.WindowInsets getHighSpeedVideoFpsRangesFor;

    public UnionInsetsConsumingModifierNode(androidx.compose.foundation.layout.WindowInsets windowInsets) {
        this.getHighSpeedVideoFpsRangesFor = windowInsets;
    }

    @Override // androidx.compose.foundation.layout.InsetsConsumingModifierNode
    public final androidx.compose.foundation.layout.WindowInsets calculateInsets(androidx.compose.foundation.layout.WindowInsets p0) {
        return androidx.compose.foundation.layout.WindowInsetsKt.union(p0, this.getHighSpeedVideoFpsRangesFor);
    }

    public final void getHighSpeedVideoSizes(androidx.compose.foundation.layout.WindowInsets p0) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(p0, this.getHighSpeedVideoFpsRangesFor)) {
            return;
        }
        this.getHighSpeedVideoFpsRangesFor = p0;
        insetsInvalidated();
    }
}
