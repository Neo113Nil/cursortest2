package androidx.compose.ui.focus;

/* compiled from: FocusRestorer.kt */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001J\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0002H\u0016J\f\u0010\u0017\u001a\u00020\u0015*\u00020\u0018H\u0016R\u0019\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/focus/FocusRestorerElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/focus/FocusRestorerNode;", "onRestoreFailed", "Lkotlin/Function0;", "Landroidx/compose/ui/focus/FocusRequester;", "(Lkotlin/jvm/functions/Function0;)V", "getOnRestoreFailed", "()Lkotlin/jvm/functions/Function0;", "component1", "copy", "create", "equals", "", "other", "", "hashCode", "", "toString", "", "update", "", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class FocusRestorerElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.ui.focus.FocusRestorerNode> {
    private final kotlin.jvm.functions.Function0<androidx.compose.ui.focus.FocusRequester> onRestoreFailed;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ androidx.compose.ui.focus.FocusRestorerElement copy$default(androidx.compose.ui.focus.FocusRestorerElement focusRestorerElement, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = focusRestorerElement.onRestoreFailed;
        }
        return focusRestorerElement.copy(function0);
    }

    public final kotlin.jvm.functions.Function0<androidx.compose.ui.focus.FocusRequester> component1() {
        return this.onRestoreFailed;
    }

    public final androidx.compose.ui.focus.FocusRestorerElement copy(kotlin.jvm.functions.Function0<androidx.compose.ui.focus.FocusRequester> onRestoreFailed) {
        return new androidx.compose.ui.focus.FocusRestorerElement(onRestoreFailed);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof androidx.compose.ui.focus.FocusRestorerElement) && kotlin.jvm.internal.Intrinsics.areEqual(this.onRestoreFailed, ((androidx.compose.ui.focus.FocusRestorerElement) other).onRestoreFailed);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        kotlin.jvm.functions.Function0<androidx.compose.ui.focus.FocusRequester> function0 = this.onRestoreFailed;
        if (function0 == null) {
            return 0;
        }
        return function0.hashCode();
    }

    public java.lang.String toString() {
        return "FocusRestorerElement(onRestoreFailed=" + this.onRestoreFailed + ')';
    }

    public final kotlin.jvm.functions.Function0<androidx.compose.ui.focus.FocusRequester> getOnRestoreFailed() {
        return this.onRestoreFailed;
    }

    public FocusRestorerElement(kotlin.jvm.functions.Function0<androidx.compose.ui.focus.FocusRequester> function0) {
        this.onRestoreFailed = function0;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public androidx.compose.ui.focus.FocusRestorerNode create() {
        return new androidx.compose.ui.focus.FocusRestorerNode(this.onRestoreFailed);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(androidx.compose.ui.focus.FocusRestorerNode node) {
        node.setOnRestoreFailed(this.onRestoreFailed);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("focusRestorer");
        inspectorInfo.getProperties().set("onRestoreFailed", this.onRestoreFailed);
    }
}
