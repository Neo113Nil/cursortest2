package androidx.compose.ui.node;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a-\u0010\u0006\u001a\u00020\u0004\"\f\b\u0000\u0010\u0002*\u00020\u0000*\u00020\u0001*\u00028\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/ObserverModifierNode;", "T", "Lkotlin/Function0;", "", "block", "observeReads", "(Landroidx/compose/ui/Modifier$Node;Lkotlin/jvm/functions/Function0;)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ObserverModifierNodeKt {
    public static final <T extends androidx.compose.ui.Modifier.Node & androidx.compose.ui.node.ObserverModifierNode> void observeReads(T t, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        androidx.compose.ui.node.ObserverNodeOwnerScope ownerScope = t.getOwnerScope();
        if (ownerScope == null) {
            ownerScope = new androidx.compose.ui.node.ObserverNodeOwnerScope(t);
            t.setOwnerScope$ui(ownerScope);
        }
        androidx.compose.ui.node.OwnerSnapshotObserver snapshotObserver = androidx.compose.ui.node.DelegatableNodeKt.requireOwner(t).getSnapshotObserver();
        kotlin.jvm.functions.Function1<androidx.compose.ui.node.ObserverNodeOwnerScope, kotlin.Unit> onObserveReadsChanged$ui = androidx.compose.ui.node.ObserverNodeOwnerScope.INSTANCE.getOnObserveReadsChanged$ui();
        snapshotObserver.getHighResolutionOutputSizeshNQ4ISI.observeReads(ownerScope, onObserveReadsChanged$ui, function0);
    }
}
