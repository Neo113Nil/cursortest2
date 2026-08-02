package androidx.compose.ui.node;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/LayoutAwareModifierNode;", "Landroidx/compose/ui/node/DelegatableNode;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "", "onPlaced", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "Landroidx/compose/ui/unit/IntSize;", io.ktor.http.ContentDisposition.Parameters.Size, "onRemeasured-ozmzZPI", "(J)V", "onRemeasured"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface LayoutAwareModifierNode extends androidx.compose.ui.node.DelegatableNode {
    default void onPlaced(androidx.compose.ui.layout.LayoutCoordinates coordinates) {
    }

    /* renamed from: onRemeasured-ozmzZPI */
    default void mo1407onRemeasuredozmzZPI(long size) {
    }
}
