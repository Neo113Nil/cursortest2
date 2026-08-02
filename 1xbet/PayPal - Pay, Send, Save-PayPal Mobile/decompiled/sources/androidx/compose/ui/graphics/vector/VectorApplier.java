package androidx.compose.ui.graphics.vector;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\f\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorApplier;", "Landroidx/compose/runtime/AbstractApplier;", "Landroidx/compose/ui/graphics/vector/VNode;", "root", "<init>", "(Landroidx/compose/ui/graphics/vector/VNode;)V", "", "index", "instance", "", "insertTopDown", "(ILandroidx/compose/ui/graphics/vector/VNode;)V", "insertBottomUp", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "remove", "(II)V", "onClear", "()V", "from", androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_TO, "move", "(III)V", "Landroidx/compose/ui/graphics/vector/GroupComponent;", "Camera2StreamConfigurationMap", "(Landroidx/compose/ui/graphics/vector/VNode;)Landroidx/compose/ui/graphics/vector/GroupComponent;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VectorApplier extends androidx.compose.runtime.AbstractApplier<androidx.compose.ui.graphics.vector.VNode> {
    public static final int $stable = androidx.compose.runtime.AbstractApplier.$stable;

    @Override // androidx.compose.runtime.Applier
    public final void insertTopDown(int index, androidx.compose.ui.graphics.vector.VNode instance) {
    }

    public VectorApplier(androidx.compose.ui.graphics.vector.VNode vNode) {
        super(vNode);
    }

    @Override // androidx.compose.runtime.Applier
    public final void insertBottomUp(int index, androidx.compose.ui.graphics.vector.VNode instance) {
        Camera2StreamConfigurationMap(getCurrent()).insertAt(index, instance);
    }

    @Override // androidx.compose.runtime.Applier
    public final void remove(int index, int count) {
        Camera2StreamConfigurationMap(getCurrent()).remove(index, count);
    }

    @Override // androidx.compose.runtime.AbstractApplier
    public final void onClear() {
        androidx.compose.ui.graphics.vector.GroupComponent Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(getRoot());
        Camera2StreamConfigurationMap.remove(0, Camera2StreamConfigurationMap.getNumChildren());
    }

    @Override // androidx.compose.runtime.Applier
    public final void move(int from, int to, int count) {
        Camera2StreamConfigurationMap(getCurrent()).move(from, to, count);
    }

    private static androidx.compose.ui.graphics.vector.GroupComponent Camera2StreamConfigurationMap(androidx.compose.ui.graphics.vector.VNode vNode) {
        if (vNode instanceof androidx.compose.ui.graphics.vector.GroupComponent) {
            return (androidx.compose.ui.graphics.vector.GroupComponent) vNode;
        }
        throw new java.lang.IllegalStateException("Cannot only insert VNode into Group".toString());
    }
}
