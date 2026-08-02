package androidx.compose.foundation.text.handwriting;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001b\u0010\u0010\u001a\u00020\r8CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/compose/foundation/text/handwriting/HandwritingHandlerNode;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "<init>", "()V", "Landroidx/compose/ui/focus/FocusState;", "p0", "", "onFocusEvent", "(Landroidx/compose/ui/focus/FocusState;)V", "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/focus/FocusState;", "getHighSpeedVideoSizes", "Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManager;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/Lazy;", "Camera2StreamConfigurationMap", "()Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManager;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class HandwritingHandlerNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.focus.FocusEventModifierNode {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private androidx.compose.ui.focus.FocusState getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.Lazy Camera2StreamConfigurationMap = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.handwriting.HandwritingHandlerNode$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            androidx.compose.foundation.text.input.internal.ComposeInputMethodManager ComposeInputMethodManager;
            ComposeInputMethodManager = androidx.compose.foundation.text.input.internal.ComposeInputMethodManager_androidKt.ComposeInputMethodManager(androidx.compose.ui.node.DelegatableNode_androidKt.requireView(androidx.compose.foundation.text.handwriting.HandwritingHandlerNode.this));
            return ComposeInputMethodManager;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.foundation.text.input.internal.ComposeInputMethodManager Camera2StreamConfigurationMap() {
        return (androidx.compose.foundation.text.input.internal.ComposeInputMethodManager) this.Camera2StreamConfigurationMap.getValue();
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public final void onFocusEvent(androidx.compose.ui.focus.FocusState p0) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, p0)) {
            return;
        }
        this.getHighSpeedVideoSizes = p0;
        if (p0.getHasFocus()) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new androidx.compose.foundation.text.handwriting.HandwritingHandlerNode$onFocusEvent$1(this, null), 3, null);
        }
    }
}
