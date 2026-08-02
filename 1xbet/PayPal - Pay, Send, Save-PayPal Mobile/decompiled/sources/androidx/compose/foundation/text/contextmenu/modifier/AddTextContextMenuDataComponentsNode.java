package androidx.compose.foundation.text.contextmenu.modifier;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B \u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006¢\u0006\u0004\b\b\u0010\tR3\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u00068\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\tR\u0014\u0010\u0011\u001a\u00020\u000e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/modifier/AddTextContextMenuDataComponentsNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/TraversableNode;", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/contextmenu/builder/TextContextMenuBuilderScope;", "", "Lkotlin/ExtensionFunctionType;", "builder", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/jvm/functions/Function1;", "getBuilder", "()Lkotlin/jvm/functions/Function1;", "setBuilder", "", "getTraverseKey", "()Ljava/lang/Object;", "traverseKey"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AddTextContextMenuDataComponentsNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.TraversableNode {
    public static final int $stable = 8;
    private kotlin.jvm.functions.Function1<? super androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope, kotlin.Unit> builder;

    public AddTextContextMenuDataComponentsNode(kotlin.jvm.functions.Function1<? super androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope, kotlin.Unit> function1) {
        this.builder = function1;
    }

    public final kotlin.jvm.functions.Function1<androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope, kotlin.Unit> getBuilder() {
        return this.builder;
    }

    public final void setBuilder(kotlin.jvm.functions.Function1<? super androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope, kotlin.Unit> function1) {
        this.builder = function1;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public final java.lang.Object getTraverseKey() {
        return androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuDataTraverseKey.INSTANCE;
    }
}
