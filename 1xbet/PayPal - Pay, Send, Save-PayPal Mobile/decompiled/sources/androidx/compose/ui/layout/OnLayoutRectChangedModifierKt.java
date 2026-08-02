package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a9\u0010\b\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\t\u001a5\u0010\f\u001a\u00020\u000b*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "throttleMillis", "debounceMillis", "Lkotlin/Function1;", "Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "", com.sun.jna.Callback.METHOD_NAME, "onLayoutRectChanged", "(Landroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/node/DelegatableNode;", "Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;", "registerOnLayoutRectChanged", "(Landroidx/compose/ui/node/DelegatableNode;JJLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnLayoutRectChangedModifierKt {
    public static /* synthetic */ androidx.compose.ui.Modifier onLayoutRectChanged$default(androidx.compose.ui.Modifier modifier, long j, long j2, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = 64;
        }
        return onLayoutRectChanged(modifier, j3, j2, function1);
    }

    public static final androidx.compose.ui.Modifier onLayoutRectChanged(androidx.compose.ui.Modifier modifier, long j, long j2, kotlin.jvm.functions.Function1<? super androidx.compose.ui.spatial.RelativeLayoutBounds, kotlin.Unit> function1) {
        return modifier.then(new androidx.compose.ui.layout.OnLayoutRectChangedElement(j, j2, function1));
    }

    public static final androidx.compose.ui.node.DelegatableNode.RegistrationHandle registerOnLayoutRectChanged(androidx.compose.ui.node.DelegatableNode delegatableNode, long j, long j2, kotlin.jvm.functions.Function1<? super androidx.compose.ui.spatial.RelativeLayoutBounds, kotlin.Unit> function1) {
        androidx.compose.ui.node.LayoutNode requireLayoutNode = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(delegatableNode);
        return androidx.compose.ui.node.LayoutNodeKt.requireOwner(requireLayoutNode).getRectManager().registerOnRectChangedCallback(requireLayoutNode.getSemanticsId(), j, j2, delegatableNode, function1);
    }
}
