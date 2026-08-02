package androidx.compose.foundation.lazy.layout;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\f\u001a\u00020\u00038\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\r8\u0017X\u0097D¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010"}, d2 = {"Landroidx/compose/foundation/lazy/layout/TraversablePrefetchStateNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/TraversableNode;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "p0", "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;)V", "Camera2StreamConfigurationMap", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "getHighResolutionOutputSizeshNQ4ISI", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "()Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class TraversablePrefetchStateNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.TraversableNode {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoSizes = "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode";

    public TraversablePrefetchStateNode(androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState lazyLayoutPrefetchState) {
        this.getHighSpeedVideoFpsRanges = lazyLayoutPrefetchState;
    }

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final void getHighSpeedVideoSizes(androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState lazyLayoutPrefetchState) {
        this.getHighSpeedVideoFpsRanges = lazyLayoutPrefetchState;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from getter and merged with bridge method [inline-methods] */
    public final java.lang.String getTraverseKey() {
        return this.getHighSpeedVideoSizes;
    }
}
