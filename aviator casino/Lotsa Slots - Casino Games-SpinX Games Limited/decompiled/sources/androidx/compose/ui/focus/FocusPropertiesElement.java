package androidx.compose.ui.focus;

/* compiled from: FocusProperties.kt */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\b\u0010\n\u001a\u00020\u0002H\u0016J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0002H\u0016J\f\u0010\u0016\u001a\u00020\u0014*\u00020\u0017H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/focus/FocusPropertiesElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/focus/FocusPropertiesNode;", "scope", "Landroidx/compose/ui/focus/FocusPropertiesScope;", "(Landroidx/compose/ui/focus/FocusPropertiesScope;)V", "getScope", "()Landroidx/compose/ui/focus/FocusPropertiesScope;", "component1", "copy", "create", "equals", "", "other", "", "hashCode", "", "toString", "", "update", "", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class FocusPropertiesElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.ui.focus.FocusPropertiesNode> {
    private final androidx.compose.ui.focus.FocusPropertiesScope scope;

    public static /* synthetic */ androidx.compose.ui.focus.FocusPropertiesElement copy$default(androidx.compose.ui.focus.FocusPropertiesElement focusPropertiesElement, androidx.compose.ui.focus.FocusPropertiesScope focusPropertiesScope, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            focusPropertiesScope = focusPropertiesElement.scope;
        }
        return focusPropertiesElement.copy(focusPropertiesScope);
    }

    /* renamed from: component1, reason: from getter */
    public final androidx.compose.ui.focus.FocusPropertiesScope getScope() {
        return this.scope;
    }

    public final androidx.compose.ui.focus.FocusPropertiesElement copy(androidx.compose.ui.focus.FocusPropertiesScope scope) {
        return new androidx.compose.ui.focus.FocusPropertiesElement(scope);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof androidx.compose.ui.focus.FocusPropertiesElement) && kotlin.jvm.internal.Intrinsics.areEqual(this.scope, ((androidx.compose.ui.focus.FocusPropertiesElement) other).scope);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.scope.hashCode();
    }

    public java.lang.String toString() {
        return "FocusPropertiesElement(scope=" + this.scope + ')';
    }

    public final androidx.compose.ui.focus.FocusPropertiesScope getScope() {
        return this.scope;
    }

    public FocusPropertiesElement(androidx.compose.ui.focus.FocusPropertiesScope focusPropertiesScope) {
        this.scope = focusPropertiesScope;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public androidx.compose.ui.focus.FocusPropertiesNode create() {
        return new androidx.compose.ui.focus.FocusPropertiesNode(this.scope);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(androidx.compose.ui.focus.FocusPropertiesNode node) {
        node.setFocusPropertiesScope(this.scope);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("focusProperties");
        inspectorInfo.getProperties().set("scope", this.scope);
    }
}
