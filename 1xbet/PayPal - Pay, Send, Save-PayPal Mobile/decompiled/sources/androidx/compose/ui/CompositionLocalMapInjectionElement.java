package androidx.compose.ui;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0016\u001a\u00020\n*\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Landroidx/compose/ui/CompositionLocalMapInjectionElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/CompositionLocalMapInjectionNode;", "Landroidx/compose/runtime/CompositionLocalMap;", "map", "<init>", "(Landroidx/compose/runtime/CompositionLocalMap;)V", "create", "()Landroidx/compose/ui/CompositionLocalMapInjectionNode;", "node", "", "update", "(Landroidx/compose/ui/CompositionLocalMapInjectionNode;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "Landroidx/compose/runtime/CompositionLocalMap;", "getMap", "()Landroidx/compose/runtime/CompositionLocalMap;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CompositionLocalMapInjectionElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.ui.CompositionLocalMapInjectionNode> {
    public static final int $stable = 0;
    private final androidx.compose.runtime.CompositionLocalMap map;

    public CompositionLocalMapInjectionElement(androidx.compose.runtime.CompositionLocalMap compositionLocalMap) {
        this.map = compositionLocalMap;
    }

    public final androidx.compose.runtime.CompositionLocalMap getMap() {
        return this.map;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: create */
    public final androidx.compose.ui.CompositionLocalMapInjectionNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.ui.CompositionLocalMapInjectionNode(this.map);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.ui.CompositionLocalMapInjectionNode node) {
        node.setMap(this.map);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.map.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object other) {
        return (other instanceof androidx.compose.ui.CompositionLocalMapInjectionElement) && kotlin.jvm.internal.Intrinsics.areEqual(((androidx.compose.ui.CompositionLocalMapInjectionElement) other).map, this.map);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("<Injected CompositionLocalMap>");
    }
}
