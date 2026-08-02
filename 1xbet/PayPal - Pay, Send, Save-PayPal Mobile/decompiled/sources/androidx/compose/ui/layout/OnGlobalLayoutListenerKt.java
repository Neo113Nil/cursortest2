package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/ui/node/DelegatableNode;", "", "throttleMillis", "debounceMillis", "Lkotlin/Function1;", "Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "", com.sun.jna.Callback.METHOD_NAME, "Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;", "registerOnGlobalLayoutListener", "(Landroidx/compose/ui/node/DelegatableNode;JJLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnGlobalLayoutListenerKt {
    public static final androidx.compose.ui.node.DelegatableNode.RegistrationHandle registerOnGlobalLayoutListener(androidx.compose.ui.node.DelegatableNode delegatableNode, long j, long j2, kotlin.jvm.functions.Function1<? super androidx.compose.ui.spatial.RelativeLayoutBounds, kotlin.Unit> function1) {
        androidx.compose.ui.node.LayoutNode requireLayoutNode = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(delegatableNode);
        return androidx.compose.ui.node.LayoutNodeKt.requireOwner(requireLayoutNode).getRectManager().registerOnGlobalLayoutCallback(requireLayoutNode.getSemanticsId(), j, j2, delegatableNode.getNode(), function1);
    }
}
