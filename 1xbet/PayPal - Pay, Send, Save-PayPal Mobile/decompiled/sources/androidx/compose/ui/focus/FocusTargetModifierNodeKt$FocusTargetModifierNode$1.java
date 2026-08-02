package androidx.compose.ui.focus;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class FocusTargetModifierNodeKt$FocusTargetModifierNode$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<androidx.compose.ui.focus.FocusTargetNode, kotlin.Unit> {
    public final void getHighSpeedVideoSizes(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
        ((androidx.compose.ui.focus.InvalidateSemantics) this.receiver).getHighSpeedVideoFpsRangesFor(focusTargetNode);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
        getHighSpeedVideoSizes(focusTargetNode);
        return kotlin.Unit.INSTANCE;
    }

    FocusTargetModifierNodeKt$FocusTargetModifierNode$1(java.lang.Object obj) {
        super(1, obj, androidx.compose.ui.focus.InvalidateSemantics.class, "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRangesFor(Landroidx/compose/ui/focus/FocusTargetNode;)V", 0);
    }
}
