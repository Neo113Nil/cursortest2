package androidx.compose.ui.focus;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nR\"\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/compose/ui/focus/FocusEventNode;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusState;", "", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "onFocusEvent", "(Landroidx/compose/ui/focus/FocusState;)V", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class FocusEventNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.focus.FocusEventModifierNode {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    kotlin.jvm.functions.Function1<? super androidx.compose.ui.focus.FocusState, kotlin.Unit> getHighSpeedVideoSizes;

    public FocusEventNode(kotlin.jvm.functions.Function1<? super androidx.compose.ui.focus.FocusState, kotlin.Unit> function1) {
        this.getHighSpeedVideoSizes = function1;
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public final void onFocusEvent(androidx.compose.ui.focus.FocusState p0) {
        this.getHighSpeedVideoSizes.invoke(p0);
    }
}
