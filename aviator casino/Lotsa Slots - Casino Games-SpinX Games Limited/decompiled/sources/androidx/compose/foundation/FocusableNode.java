package androidx.compose.foundation;

/* compiled from: Focusable.kt */
@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u000f\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001d\u001a\u00020\u00182\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\f\u0010\u001e\u001a\u00020\u0018*\u00020\u001fH\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Landroidx/compose/foundation/FocusableNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;)V", "bringIntoViewRequester", "Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "bringIntoViewRequesterNode", "Landroidx/compose/foundation/relocation/BringIntoViewRequesterNode;", "focusState", "Landroidx/compose/ui/focus/FocusState;", "focusableInteractionNode", "Landroidx/compose/foundation/FocusableInteractionNode;", "focusablePinnableContainer", "Landroidx/compose/foundation/FocusablePinnableContainerNode;", "focusableSemanticsNode", "Landroidx/compose/foundation/FocusableSemanticsNode;", "focusedBoundsNode", "Landroidx/compose/foundation/FocusedBoundsNode;", "onFocusEvent", "", "onGloballyPositioned", com.ironsource.Y3.f, "Landroidx/compose/ui/layout/LayoutCoordinates;", "onPlaced", "update", "applySemantics", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class FocusableNode extends androidx.compose.ui.node.DelegatingNode implements androidx.compose.ui.focus.FocusEventModifierNode, androidx.compose.ui.node.LayoutAwareModifierNode, androidx.compose.ui.node.SemanticsModifierNode, androidx.compose.ui.node.GlobalPositionAwareModifierNode {
    private final androidx.compose.foundation.relocation.BringIntoViewRequester bringIntoViewRequester;
    private final androidx.compose.foundation.relocation.BringIntoViewRequesterNode bringIntoViewRequesterNode;
    private androidx.compose.ui.focus.FocusState focusState;
    private final androidx.compose.foundation.FocusableInteractionNode focusableInteractionNode;
    private final androidx.compose.foundation.FocusableSemanticsNode focusableSemanticsNode = (androidx.compose.foundation.FocusableSemanticsNode) delegate(new androidx.compose.foundation.FocusableSemanticsNode());
    private final androidx.compose.foundation.FocusablePinnableContainerNode focusablePinnableContainer = (androidx.compose.foundation.FocusablePinnableContainerNode) delegate(new androidx.compose.foundation.FocusablePinnableContainerNode());
    private final androidx.compose.foundation.FocusedBoundsNode focusedBoundsNode = (androidx.compose.foundation.FocusedBoundsNode) delegate(new androidx.compose.foundation.FocusedBoundsNode());

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    /* renamed from: getShouldClearDescendantSemantics */
    public /* synthetic */ boolean getIsClearingSemantics() {
        return androidx.compose.ui.node.SemanticsModifierNode.CC.$default$getShouldClearDescendantSemantics(this);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public /* synthetic */ boolean getShouldMergeDescendantSemantics() {
        return androidx.compose.ui.node.SemanticsModifierNode.CC.$default$getShouldMergeDescendantSemantics(this);
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI, reason: not valid java name */
    public /* synthetic */ void mo268onRemeasuredozmzZPI(long j) {
        androidx.compose.ui.node.LayoutAwareModifierNode.CC.m3531$default$onRemeasuredozmzZPI(this, j);
    }

    public FocusableNode(androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource) {
        this.focusableInteractionNode = (androidx.compose.foundation.FocusableInteractionNode) delegate(new androidx.compose.foundation.FocusableInteractionNode(mutableInteractionSource));
        androidx.compose.foundation.relocation.BringIntoViewRequester BringIntoViewRequester = androidx.compose.foundation.relocation.BringIntoViewRequesterKt.BringIntoViewRequester();
        this.bringIntoViewRequester = BringIntoViewRequester;
        this.bringIntoViewRequesterNode = (androidx.compose.foundation.relocation.BringIntoViewRequesterNode) delegate(new androidx.compose.foundation.relocation.BringIntoViewRequesterNode(BringIntoViewRequester));
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public void onPlaced(androidx.compose.ui.layout.LayoutCoordinates coordinates) {
        this.bringIntoViewRequesterNode.onPlaced(coordinates);
    }

    public final void update(androidx.compose.foundation.interaction.MutableInteractionSource interactionSource) {
        this.focusableInteractionNode.update(interactionSource);
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public void onFocusEvent(androidx.compose.ui.focus.FocusState focusState) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.focusState, focusState)) {
            return;
        }
        boolean isFocused = focusState.isFocused();
        if (isFocused) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new androidx.compose.foundation.FocusableNode$onFocusEvent$1(this, null), 3, null);
        }
        if (getIsAttached()) {
            androidx.compose.ui.node.SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        this.focusableInteractionNode.setFocus(isFocused);
        this.focusedBoundsNode.setFocus(isFocused);
        this.focusablePinnableContainer.setFocus(isFocused);
        this.focusableSemanticsNode.setFocus(isFocused);
        this.focusState = focusState;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        this.focusableSemanticsNode.applySemantics(semanticsPropertyReceiver);
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(androidx.compose.ui.layout.LayoutCoordinates coordinates) {
        this.focusedBoundsNode.onGloballyPositioned(coordinates);
    }
}
