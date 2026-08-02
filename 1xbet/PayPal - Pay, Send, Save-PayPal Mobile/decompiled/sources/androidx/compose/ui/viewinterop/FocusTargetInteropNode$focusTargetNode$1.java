package androidx.compose.ui.viewinterop;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class FocusTargetInteropNode$focusTargetNode$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<androidx.compose.ui.focus.FocusState, androidx.compose.ui.focus.FocusState, kotlin.Unit> {
    public final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.focus.FocusState focusState, androidx.compose.ui.focus.FocusState focusState2) {
        androidx.compose.ui.viewinterop.FocusTargetInteropNode.getHighSpeedVideoFpsRanges((androidx.compose.ui.viewinterop.FocusTargetInteropNode) this.receiver, focusState, focusState2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.focus.FocusState focusState, androidx.compose.ui.focus.FocusState focusState2) {
        getHighResolutionOutputSizeshNQ4ISI(focusState, focusState2);
        return kotlin.Unit.INSTANCE;
    }

    FocusTargetInteropNode$focusTargetNode$1(java.lang.Object obj) {
        super(2, obj, androidx.compose.ui.viewinterop.FocusTargetInteropNode.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0);
    }
}
