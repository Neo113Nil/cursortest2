package androidx.compose.ui.node;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\f\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0015"}, d2 = {"Landroidx/compose/ui/node/UiApplier;", "Landroidx/compose/runtime/AbstractApplier;", "Landroidx/compose/ui/node/LayoutNode;", "root", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "", "index", "instance", "", "insertTopDown", "(ILandroidx/compose/ui/node/LayoutNode;)V", "insertBottomUp", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "remove", "(II)V", "from", androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_TO, "move", "(III)V", "onClear", "()V", "onEndChanges", "reuse"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UiApplier extends androidx.compose.runtime.AbstractApplier<androidx.compose.ui.node.LayoutNode> {
    public static final int $stable = androidx.compose.runtime.AbstractApplier.$stable;

    @Override // androidx.compose.runtime.Applier
    public final void insertTopDown(int index, androidx.compose.ui.node.LayoutNode instance) {
    }

    public UiApplier(androidx.compose.ui.node.LayoutNode layoutNode) {
        super(layoutNode);
    }

    @Override // androidx.compose.runtime.Applier
    public final void insertBottomUp(int index, androidx.compose.ui.node.LayoutNode instance) {
        getCurrent().insertAt$ui(index, instance);
    }

    @Override // androidx.compose.runtime.Applier
    public final void remove(int index, int count) {
        getCurrent().removeAt$ui(index, count);
    }

    @Override // androidx.compose.runtime.Applier
    public final void move(int from, int to, int count) {
        getCurrent().move$ui(from, to, count);
    }

    @Override // androidx.compose.runtime.AbstractApplier
    public final void onClear() {
        getRoot().removeAll$ui();
    }

    @Override // androidx.compose.runtime.Applier
    public final void onEndChanges() {
        super.onEndChanges();
        androidx.compose.ui.node.Owner owner = getRoot().getOwner();
        if (owner != null) {
            owner.onEndApplyChanges();
        }
    }

    @Override // androidx.compose.runtime.Applier
    public final void reuse() {
        getCurrent().onReuse();
    }
}
