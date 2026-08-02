package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\t\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u00118\u0017X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/compose/ui/layout/OnSizeChangedNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/IntSize;", "", "onSizeChanged", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "update", io.ktor.http.ContentDisposition.Parameters.Size, "onRemeasured-ozmzZPI", "(J)V", "onRemeasured", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function1;", "Camera2StreamConfigurationMap", "", "shouldAutoInvalidate", "Z", "getShouldAutoInvalidate", "()Z", "getHighSpeedVideoFpsRangesFor", "J"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnSizeChangedNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.LayoutAwareModifierNode {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.IntSize, kotlin.Unit> Camera2StreamConfigurationMap;
    private final boolean shouldAutoInvalidate = true;
    private long getHighSpeedVideoFpsRangesFor = androidx.compose.ui.unit.IntSize.m8767constructorimpl(-9223372034707292160L);

    public OnSizeChangedNode(kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.IntSize, kotlin.Unit> function1) {
        this.Camera2StreamConfigurationMap = function1;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    public final void update(kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.IntSize, kotlin.Unit> onSizeChanged) {
        this.Camera2StreamConfigurationMap = onSizeChanged;
        this.getHighSpeedVideoFpsRangesFor = androidx.compose.ui.unit.IntSize.m8767constructorimpl(-9223372034707292160L);
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public final void mo1407onRemeasuredozmzZPI(long size) {
        if (androidx.compose.ui.unit.IntSize.m8770equalsimpl0(this.getHighSpeedVideoFpsRangesFor, size)) {
            return;
        }
        this.Camera2StreamConfigurationMap.invoke(androidx.compose.ui.unit.IntSize.m8764boximpl(size));
        this.getHighSpeedVideoFpsRangesFor = size;
    }
}
