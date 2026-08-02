package androidx.compose.ui.draganddrop;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/node/TraversableNode;", "T", "child", "Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;", "invoke", "(Landroidx/compose/ui/node/TraversableNode;)Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DragAndDropNodeKt$firstDescendantOrNull$1<T> extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<T, androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction> {
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<T> $getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function1<T, java.lang.Boolean> $getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Incorrect types in method signature: (TT;)Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction; */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction invoke(androidx.compose.ui.node.TraversableNode traversableNode) {
        if (this.$getHighSpeedVideoFpsRangesFor.invoke(traversableNode).booleanValue()) {
            this.$getHighResolutionOutputSizeshNQ4ISI.element = traversableNode;
            return androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal;
        }
        return androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DragAndDropNodeKt$firstDescendantOrNull$1(kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> function1, kotlin.jvm.internal.Ref.ObjectRef<T> objectRef) {
        super(1);
        this.$getHighSpeedVideoFpsRangesFor = function1;
        this.$getHighResolutionOutputSizeshNQ4ISI = objectRef;
    }
}
