package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\b\u0010\tJ!\u0010\n\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\n\u0010\u0007R\"\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/compose/foundation/layout/ConsumedInsetsModifierNode;", "Landroidx/compose/foundation/layout/InsetsConsumingModifierNode;", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/WindowInsets;", "", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "calculateInsets", "(Landroidx/compose/foundation/layout/WindowInsets;)Landroidx/compose/foundation/layout/WindowInsets;", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function1;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ConsumedInsetsModifierNode extends androidx.compose.foundation.layout.InsetsConsumingModifierNode {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private kotlin.jvm.functions.Function1<? super androidx.compose.foundation.layout.WindowInsets, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;

    public ConsumedInsetsModifierNode(kotlin.jvm.functions.Function1<? super androidx.compose.foundation.layout.WindowInsets, kotlin.Unit> function1) {
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
    }

    @Override // androidx.compose.foundation.layout.InsetsConsumingModifierNode
    public final androidx.compose.foundation.layout.WindowInsets calculateInsets(androidx.compose.foundation.layout.WindowInsets p0) {
        this.getHighResolutionOutputSizeshNQ4ISI.invoke(p0);
        return p0;
    }

    public final void getHighSpeedVideoFpsRangesFor(kotlin.jvm.functions.Function1<? super androidx.compose.foundation.layout.WindowInsets, kotlin.Unit> p0) {
        if (p0 != this.getHighResolutionOutputSizeshNQ4ISI) {
            this.getHighResolutionOutputSizeshNQ4ISI = p0;
        }
    }
}
