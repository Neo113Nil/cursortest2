package androidx.compose.foundation.text.handwriting;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001bR\u0014\u0010\u0012\u001a\u00020\u001d8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"Landroidx/compose/foundation/text/handwriting/HandwritingDetectorNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Lkotlin/Function0;", "", "p0", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/input/pointer/PointerEvent;", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "p1", "Landroidx/compose/ui/unit/IntSize;", "p2", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPointerEvent", "onCancelPointerInput", "()V", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function0;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManager;", "Lkotlin/Lazy;", "getHighSpeedVideoFpsRanges", "()Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManager;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/foundation/text/handwriting/StylusHandwritingNode;", "Landroidx/compose/foundation/text/handwriting/StylusHandwritingNode;", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/node/TouchBoundsExpansion;", "getTouchBoundsExpansion-RZrCHBk", "()J"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class HandwritingDetectorNode extends androidx.compose.ui.node.DelegatingNode implements androidx.compose.ui.node.PointerInputModifierNode {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.Lazy getHighResolutionOutputSizeshNQ4ISI = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.handwriting.HandwritingDetectorNode$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            androidx.compose.foundation.text.input.internal.ComposeInputMethodManager ComposeInputMethodManager;
            ComposeInputMethodManager = androidx.compose.foundation.text.input.internal.ComposeInputMethodManager_androidKt.ComposeInputMethodManager(androidx.compose.ui.node.DelegatableNode_androidKt.requireView(androidx.compose.foundation.text.handwriting.HandwritingDetectorNode.this));
            return ComposeInputMethodManager;
        }
    });

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.foundation.text.handwriting.StylusHandwritingNode Camera2StreamConfigurationMap = (androidx.compose.foundation.text.handwriting.StylusHandwritingNode) delegate(new androidx.compose.foundation.text.handwriting.StylusHandwritingNode(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.handwriting.HandwritingDetectorNode$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return androidx.compose.foundation.text.handwriting.HandwritingDetectorNode.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.text.handwriting.HandwritingDetectorNode.this);
        }
    }));

    public HandwritingDetectorNode(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.getHighSpeedVideoFpsRangesFor = function0;
    }

    private final androidx.compose.foundation.text.input.internal.ComposeInputMethodManager getHighSpeedVideoFpsRanges() {
        return (androidx.compose.foundation.text.input.internal.ComposeInputMethodManager) this.getHighResolutionOutputSizeshNQ4ISI.getValue();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public final void mo1262onPointerEventH0pRuoY(androidx.compose.ui.input.pointer.PointerEvent p0, androidx.compose.ui.input.pointer.PointerEventPass p1, long p2) {
        this.Camera2StreamConfigurationMap.mo1262onPointerEventH0pRuoY(p0, p1, p2);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void onCancelPointerInput() {
        this.Camera2StreamConfigurationMap.onCancelPointerInput();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: getTouchBoundsExpansion-RZrCHBk, reason: not valid java name */
    public final long mo2167getTouchBoundsExpansionRZrCHBk() {
        return this.Camera2StreamConfigurationMap.mo2167getTouchBoundsExpansionRZrCHBk();
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.text.handwriting.HandwritingDetectorNode handwritingDetectorNode) {
        handwritingDetectorNode.getHighSpeedVideoFpsRangesFor.invoke();
        handwritingDetectorNode.getHighSpeedVideoFpsRanges().prepareStylusHandwritingDelegation();
        return kotlin.Unit.INSTANCE;
    }
}
