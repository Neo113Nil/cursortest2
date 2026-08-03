package androidx.compose.foundation.lazy;

/* compiled from: LazyItemScopeImpl.kt */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0013\u001a\u00020\u0002H\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0007H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0002H\u0016J\f\u0010\u001c\u001a\u00020\u001a*\u00020\u001dH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/lazy/ParentSizeElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/lazy/ParentSizeNode;", "fraction", "", "widthState", "Landroidx/compose/runtime/State;", "", "heightState", "inspectorName", "", "(FLandroidx/compose/runtime/State;Landroidx/compose/runtime/State;Ljava/lang/String;)V", "getFraction", "()F", "getHeightState", "()Landroidx/compose/runtime/State;", "getInspectorName", "()Ljava/lang/String;", "getWidthState", "create", "equals", "", "other", "", "hashCode", "update", "", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ParentSizeElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.lazy.ParentSizeNode> {
    private final float fraction;
    private final androidx.compose.runtime.State<java.lang.Integer> heightState;
    private final java.lang.String inspectorName;
    private final androidx.compose.runtime.State<java.lang.Integer> widthState;

    public /* synthetic */ ParentSizeElement(float f, androidx.compose.runtime.State state, androidx.compose.runtime.State state2, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(f, (i & 2) != 0 ? null : state, (i & 4) != 0 ? null : state2, str);
    }

    public final float getFraction() {
        return this.fraction;
    }

    public final androidx.compose.runtime.State<java.lang.Integer> getWidthState() {
        return this.widthState;
    }

    public final androidx.compose.runtime.State<java.lang.Integer> getHeightState() {
        return this.heightState;
    }

    public final java.lang.String getInspectorName() {
        return this.inspectorName;
    }

    public ParentSizeElement(float f, androidx.compose.runtime.State<java.lang.Integer> state, androidx.compose.runtime.State<java.lang.Integer> state2, java.lang.String str) {
        this.fraction = f;
        this.widthState = state;
        this.heightState = state2;
        this.inspectorName = str;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public androidx.compose.foundation.lazy.ParentSizeNode create() {
        return new androidx.compose.foundation.lazy.ParentSizeNode(this.fraction, this.widthState, this.heightState);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(androidx.compose.foundation.lazy.ParentSizeNode node) {
        node.setFraction(this.fraction);
        node.setWidthState(this.widthState);
        node.setHeightState(this.heightState);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.foundation.lazy.ParentSizeElement)) {
            return false;
        }
        androidx.compose.foundation.lazy.ParentSizeElement parentSizeElement = (androidx.compose.foundation.lazy.ParentSizeElement) other;
        return this.fraction == parentSizeElement.fraction && kotlin.jvm.internal.Intrinsics.areEqual(this.widthState, parentSizeElement.widthState) && kotlin.jvm.internal.Intrinsics.areEqual(this.heightState, parentSizeElement.heightState);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        androidx.compose.runtime.State<java.lang.Integer> state = this.widthState;
        int hashCode = (state != null ? state.hashCode() : 0) * 31;
        androidx.compose.runtime.State<java.lang.Integer> state2 = this.heightState;
        return ((hashCode + (state2 != null ? state2.hashCode() : 0)) * 31) + java.lang.Float.floatToIntBits(this.fraction);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName(this.inspectorName);
        inspectorInfo.setValue(java.lang.Float.valueOf(this.fraction));
    }
}
