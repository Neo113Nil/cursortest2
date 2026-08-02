package androidx.compose.ui;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003"}, d2 = {"Landroidx/compose/ui/KeepScreenOnNode;", "Landroidx/compose/ui/Modifier$Node;", "<init>", "()V", "", "onAttach", "onDetach"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class KeepScreenOnNode extends androidx.compose.ui.Modifier.Node {
    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        androidx.compose.ui.node.DelegatableNodeKt.requireOwner(this).incrementKeepScreenOnCount();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        androidx.compose.ui.node.DelegatableNodeKt.requireOwner(this).decrementKeepScreenOnCount();
    }
}
