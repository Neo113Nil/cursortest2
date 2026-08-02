package androidx.compose.ui.focus;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nR\"\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/compose/ui/focus/FocusChangedNode;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusState;", "", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "onFocusEvent", "(Landroidx/compose/ui/focus/FocusState;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function1;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/ui/focus/FocusState;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class FocusChangedNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.focus.FocusEventModifierNode {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    kotlin.jvm.functions.Function1<? super androidx.compose.ui.focus.FocusState, kotlin.Unit> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private androidx.compose.ui.focus.FocusState getHighSpeedVideoFpsRanges;

    public FocusChangedNode(kotlin.jvm.functions.Function1<? super androidx.compose.ui.focus.FocusState, kotlin.Unit> function1) {
        this.Camera2StreamConfigurationMap = function1;
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public final void onFocusEvent(androidx.compose.ui.focus.FocusState p0) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, p0)) {
            return;
        }
        this.getHighSpeedVideoFpsRanges = p0;
        this.Camera2StreamConfigurationMap.invoke(p0);
    }
}
