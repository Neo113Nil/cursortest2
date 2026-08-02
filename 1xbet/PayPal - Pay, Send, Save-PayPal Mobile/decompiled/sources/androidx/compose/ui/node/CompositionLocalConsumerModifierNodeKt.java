package androidx.compose.ui.node;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/runtime/CompositionLocal;", com.google.android.gms.common.internal.ImagesContract.LOCAL, "currentValueOf", "(Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CompositionLocalConsumerModifierNodeKt {
    public static final <T> T currentValueOf(androidx.compose.ui.node.CompositionLocalConsumerModifierNode compositionLocalConsumerModifierNode, androidx.compose.runtime.CompositionLocal<T> compositionLocal) {
        if (!compositionLocalConsumerModifierNode.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        return (T) androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(compositionLocalConsumerModifierNode).getCompositionLocalMap().get(compositionLocal);
    }
}
