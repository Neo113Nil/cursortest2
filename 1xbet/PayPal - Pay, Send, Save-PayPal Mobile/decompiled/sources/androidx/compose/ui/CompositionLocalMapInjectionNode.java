package androidx.compose.ui;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR*\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00028\u0007@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0005"}, d2 = {"Landroidx/compose/ui/CompositionLocalMapInjectionNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/runtime/CompositionLocalMap;", "map", "<init>", "(Landroidx/compose/runtime/CompositionLocalMap;)V", "", "onAttach", "()V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Landroidx/compose/runtime/CompositionLocalMap;", "getMap", "()Landroidx/compose/runtime/CompositionLocalMap;", "setMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CompositionLocalMapInjectionNode extends androidx.compose.ui.Modifier.Node {
    public static final int $stable = 8;
    private androidx.compose.runtime.CompositionLocalMap map;

    public CompositionLocalMapInjectionNode(androidx.compose.runtime.CompositionLocalMap compositionLocalMap) {
        this.map = compositionLocalMap;
    }

    public final androidx.compose.runtime.CompositionLocalMap getMap() {
        return this.map;
    }

    public final void setMap(androidx.compose.runtime.CompositionLocalMap compositionLocalMap) {
        this.map = compositionLocalMap;
        androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(this).setCompositionLocalMap(compositionLocalMap);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(this).setCompositionLocalMap(this.map);
    }
}
