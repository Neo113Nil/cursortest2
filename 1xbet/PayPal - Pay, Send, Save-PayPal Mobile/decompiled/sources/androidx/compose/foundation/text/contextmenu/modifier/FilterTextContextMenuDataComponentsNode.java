package androidx.compose.foundation.text.contextmenu.modifier;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0007@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/modifier/FilterTextContextMenuDataComponentsNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/TraversableNode;", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuComponent;", "", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRanges", "", "getTraverseKey", "()Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class FilterTextContextMenuDataComponentsNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.TraversableNode {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    kotlin.jvm.functions.Function1<? super androidx.compose.foundation.text.contextmenu.data.TextContextMenuComponent, java.lang.Boolean> getHighSpeedVideoFpsRanges;

    public FilterTextContextMenuDataComponentsNode(kotlin.jvm.functions.Function1<? super androidx.compose.foundation.text.contextmenu.data.TextContextMenuComponent, java.lang.Boolean> function1) {
        this.getHighSpeedVideoFpsRanges = function1;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public final java.lang.Object getTraverseKey() {
        return androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuDataTraverseKey.INSTANCE;
    }
}
