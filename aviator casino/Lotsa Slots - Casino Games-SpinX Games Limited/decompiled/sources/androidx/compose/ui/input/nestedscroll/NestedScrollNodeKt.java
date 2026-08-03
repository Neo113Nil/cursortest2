package androidx.compose.ui.input.nestedscroll;

/* compiled from: NestedScrollNode.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n\"\u001c\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u000b"}, d2 = {"ModifierLocalNestedScroll", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "getModifierLocalNestedScroll", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "nestedScrollModifierNode", "Landroidx/compose/ui/node/DelegatableNode;", "connection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "dispatcher", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NestedScrollNodeKt {
    private static final androidx.compose.ui.modifier.ProvidableModifierLocal<androidx.compose.ui.input.nestedscroll.NestedScrollNode> ModifierLocalNestedScroll = androidx.compose.ui.modifier.ModifierLocalKt.modifierLocalOf(new kotlin.jvm.functions.Function0<androidx.compose.ui.input.nestedscroll.NestedScrollNode>() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollNodeKt$ModifierLocalNestedScroll$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.compose.ui.input.nestedscroll.NestedScrollNode invoke() {
            return null;
        }
    });

    public static final androidx.compose.ui.modifier.ProvidableModifierLocal<androidx.compose.ui.input.nestedscroll.NestedScrollNode> getModifierLocalNestedScroll() {
        return ModifierLocalNestedScroll;
    }

    public static final androidx.compose.ui.node.DelegatableNode nestedScrollModifierNode(androidx.compose.ui.input.nestedscroll.NestedScrollConnection nestedScrollConnection, androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher nestedScrollDispatcher) {
        return new androidx.compose.ui.input.nestedscroll.NestedScrollNode(nestedScrollConnection, nestedScrollDispatcher);
    }
}
