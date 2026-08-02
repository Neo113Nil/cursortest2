package androidx.compose.ui.viewinterop;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\u0005J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\t\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/compose/ui/viewinterop/FocusTargetInteropNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/ObserverModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "<init>", "()V", "", "onObservedReadsChanged", "Landroidx/compose/ui/layout/PinnableContainer;", "getHighSpeedVideoFpsRanges", "()Landroidx/compose/ui/layout/PinnableContainer;", "Landroidx/compose/ui/focus/FocusTargetNode;", "getHighSpeedVideoSizes", "Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class FocusTargetInteropNode extends androidx.compose.ui.node.DelegatingNode implements androidx.compose.ui.node.ObserverModifierNode, androidx.compose.ui.node.CompositionLocalConsumerModifierNode {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private androidx.compose.ui.layout.PinnableContainer.PinnedHandle getHighSpeedVideoFpsRanges;
    private final androidx.compose.ui.focus.FocusTargetNode getHighSpeedVideoSizes = (androidx.compose.ui.focus.FocusTargetNode) delegate(new androidx.compose.ui.focus.FocusTargetNode(0, true, new androidx.compose.ui.viewinterop.FocusTargetInteropNode$focusTargetNode$1(this), null, 9, null));

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public final void onObservedReadsChanged() {
        androidx.compose.ui.layout.PinnableContainer highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
        if (this.getHighSpeedVideoSizes.getFocusState().isFocused()) {
            androidx.compose.ui.layout.PinnableContainer.PinnedHandle pinnedHandle = this.getHighSpeedVideoFpsRanges;
            if (pinnedHandle != null) {
                pinnedHandle.release();
            }
            this.getHighSpeedVideoFpsRanges = highSpeedVideoFpsRanges != null ? highSpeedVideoFpsRanges.pin() : null;
        }
    }

    private final androidx.compose.ui.layout.PinnableContainer getHighSpeedVideoFpsRanges() {
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        androidx.compose.ui.node.ObserverModifierNodeKt.observeReads(this, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.viewinterop.FocusTargetInteropNode$retrievePinnableContainer$1
            /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.Object] */
            public final void Camera2StreamConfigurationMap() {
                objectRef.element = androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(this, androidx.compose.ui.layout.PinnableContainerKt.getLocalPinnableContainer());
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ kotlin.Unit invoke() {
                Camera2StreamConfigurationMap();
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        return (androidx.compose.ui.layout.PinnableContainer) objectRef.element;
    }

    public static final /* synthetic */ void getHighSpeedVideoFpsRanges(androidx.compose.ui.viewinterop.FocusTargetInteropNode focusTargetInteropNode, androidx.compose.ui.focus.FocusState focusState, androidx.compose.ui.focus.FocusState focusState2) {
        boolean isFocused;
        if (androidx.compose.ui.ComposeUiFlags.isPinningFocusedAndroidViewsEnabled && focusTargetInteropNode.getIsAttached() && (isFocused = focusState2.isFocused()) != focusState.isFocused()) {
            if (isFocused) {
                androidx.compose.ui.layout.PinnableContainer highSpeedVideoFpsRanges = focusTargetInteropNode.getHighSpeedVideoFpsRanges();
                focusTargetInteropNode.getHighSpeedVideoFpsRanges = highSpeedVideoFpsRanges != null ? highSpeedVideoFpsRanges.pin() : null;
            } else {
                androidx.compose.ui.layout.PinnableContainer.PinnedHandle pinnedHandle = focusTargetInteropNode.getHighSpeedVideoFpsRanges;
                if (pinnedHandle != null) {
                    pinnedHandle.release();
                }
                focusTargetInteropNode.getHighSpeedVideoFpsRanges = null;
            }
        }
    }
}
