package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u000b"}, d2 = {"Landroidx/compose/foundation/layout/PaddingValuesConsumingModifierNode;", "Landroidx/compose/foundation/layout/InsetsConsumingModifierNode;", "Landroidx/compose/foundation/layout/PaddingValues;", "p0", "<init>", "(Landroidx/compose/foundation/layout/PaddingValues;)V", "", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/foundation/layout/WindowInsets;", "calculateInsets", "(Landroidx/compose/foundation/layout/WindowInsets;)Landroidx/compose/foundation/layout/WindowInsets;", "Landroidx/compose/foundation/layout/PaddingValues;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class PaddingValuesConsumingModifierNode extends androidx.compose.foundation.layout.InsetsConsumingModifierNode {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private androidx.compose.foundation.layout.PaddingValues getHighSpeedVideoFpsRanges;

    public PaddingValuesConsumingModifierNode(androidx.compose.foundation.layout.PaddingValues paddingValues) {
        this.getHighSpeedVideoFpsRanges = paddingValues;
    }

    public final void getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.layout.PaddingValues p0) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(p0, this.getHighSpeedVideoFpsRanges)) {
            return;
        }
        this.getHighSpeedVideoFpsRanges = p0;
        insetsInvalidated();
    }

    @Override // androidx.compose.foundation.layout.InsetsConsumingModifierNode
    public final androidx.compose.foundation.layout.WindowInsets calculateInsets(androidx.compose.foundation.layout.WindowInsets p0) {
        return androidx.compose.foundation.layout.WindowInsetsKt.add(p0, androidx.compose.foundation.layout.WindowInsetsKt.asInsets(this.getHighSpeedVideoFpsRanges));
    }
}
