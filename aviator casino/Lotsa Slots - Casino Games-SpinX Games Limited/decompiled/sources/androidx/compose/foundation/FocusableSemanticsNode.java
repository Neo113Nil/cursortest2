package androidx.compose.foundation;

/* compiled from: Focusable.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006J\f\u0010\f\u001a\u00020\n*\u00020\rH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Landroidx/compose/foundation/FocusableSemanticsNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/focus/FocusRequesterModifierNode;", "()V", "isFocused", "", "semanticsConfigurationCache", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "setFocus", "", "focused", "applySemantics", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class FocusableSemanticsNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.SemanticsModifierNode, androidx.compose.ui.focus.FocusRequesterModifierNode {
    private boolean isFocused;
    private androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfigurationCache = new androidx.compose.ui.semantics.SemanticsConfiguration();

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    /* renamed from: getShouldClearDescendantSemantics */
    public /* synthetic */ boolean getIsClearingSemantics() {
        return androidx.compose.ui.node.SemanticsModifierNode.CC.$default$getShouldClearDescendantSemantics(this);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public /* synthetic */ boolean getShouldMergeDescendantSemantics() {
        return androidx.compose.ui.node.SemanticsModifierNode.CC.$default$getShouldMergeDescendantSemantics(this);
    }

    public final void setFocus(boolean focused) {
        this.isFocused = focused;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setFocused(semanticsPropertyReceiver, this.isFocused);
        androidx.compose.ui.semantics.SemanticsPropertiesKt.requestFocus$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.foundation.FocusableSemanticsNode$applySemantics$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Boolean invoke() {
                return java.lang.Boolean.valueOf(androidx.compose.ui.focus.FocusRequesterModifierNodeKt.requestFocus(androidx.compose.foundation.FocusableSemanticsNode.this));
            }
        }, 1, null);
    }
}
