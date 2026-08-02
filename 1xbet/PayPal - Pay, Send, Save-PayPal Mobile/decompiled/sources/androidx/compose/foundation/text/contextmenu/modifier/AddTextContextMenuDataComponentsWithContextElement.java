package androidx.compose.foundation.text.contextmenu.modifier;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B&\u0012\u001d\u0010\b\u001a\u0019\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\b\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\u0006*\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R+\u0010\u0017\u001a\u0019\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\b\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/modifier/AddTextContextMenuDataComponentsWithContextElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text/contextmenu/modifier/AddTextContextMenuDataComponentsWithContextNode;", "Lkotlin/Function2;", "Landroidx/compose/foundation/text/contextmenu/builder/TextContextMenuBuilderScope;", "Landroid/content/Context;", "", "Lkotlin/ExtensionFunctionType;", "p0", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function2;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AddTextContextMenuDataComponentsWithContextElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.text.contextmenu.modifier.AddTextContextMenuDataComponentsWithContextNode> {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function2<androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope, android.content.Context, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    public AddTextContextMenuDataComponentsWithContextElement(kotlin.jvm.functions.Function2<? super androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope, ? super android.content.Context, kotlin.Unit> function2) {
        this.getHighResolutionOutputSizeshNQ4ISI = function2;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final /* bridge */ /* synthetic */ void update(androidx.compose.foundation.text.contextmenu.modifier.AddTextContextMenuDataComponentsWithContextNode addTextContextMenuDataComponentsWithContextNode) {
        addTextContextMenuDataComponentsWithContextNode.getHighSpeedVideoFpsRangesFor = this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("addTextContextMenuDataComponentsWithResources");
        inspectorInfo.getProperties().set("builder", this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof androidx.compose.foundation.text.contextmenu.modifier.AddTextContextMenuDataComponentsWithContextElement) && this.getHighResolutionOutputSizeshNQ4ISI == ((androidx.compose.foundation.text.contextmenu.modifier.AddTextContextMenuDataComponentsWithContextElement) p0).getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final /* synthetic */ androidx.compose.foundation.text.contextmenu.modifier.AddTextContextMenuDataComponentsWithContextNode create() {
        return new androidx.compose.foundation.text.contextmenu.modifier.AddTextContextMenuDataComponentsWithContextNode(this.getHighResolutionOutputSizeshNQ4ISI);
    }
}
