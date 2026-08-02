package androidx.compose.ui.focus;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tR\"\u0010\r\u001a\u00020\u00038\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000b\u0010\u0006"}, d2 = {"Landroidx/compose/ui/focus/FocusRequesterNode;", "Landroidx/compose/ui/focus/FocusRequesterModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/focus/FocusRequester;", "p0", "<init>", "(Landroidx/compose/ui/focus/FocusRequester;)V", "", "onAttach", "()V", "onDetach", "getHighSpeedVideoSizes", "Landroidx/compose/ui/focus/FocusRequester;", "getHighSpeedVideoFpsRanges", "()Landroidx/compose/ui/focus/FocusRequester;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class FocusRequesterNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.focus.FocusRequesterModifierNode {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private androidx.compose.ui.focus.FocusRequester getHighSpeedVideoFpsRanges;

    public FocusRequesterNode(androidx.compose.ui.focus.FocusRequester focusRequester) {
        this.getHighSpeedVideoFpsRanges = focusRequester;
    }

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from getter */
    public final androidx.compose.ui.focus.FocusRequester getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final void getHighSpeedVideoSizes(androidx.compose.ui.focus.FocusRequester focusRequester) {
        this.getHighSpeedVideoFpsRanges = focusRequester;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        super.onAttach();
        this.getHighSpeedVideoFpsRanges.getFocusRequesterNodes$ui().add(this);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        this.getHighSpeedVideoFpsRanges.getFocusRequesterNodes$ui().remove(this);
        super.onDetach();
    }
}
