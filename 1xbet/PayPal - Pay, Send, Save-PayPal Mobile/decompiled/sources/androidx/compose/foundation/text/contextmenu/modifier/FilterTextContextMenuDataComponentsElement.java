package androidx.compose.foundation.text.contextmenu.modifier;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/modifier/FilterTextContextMenuDataComponentsElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text/contextmenu/modifier/FilterTextContextMenuDataComponentsNode;", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuComponent;", "", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class FilterTextContextMenuDataComponentsElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.text.contextmenu.modifier.FilterTextContextMenuDataComponentsNode> {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<androidx.compose.foundation.text.contextmenu.data.TextContextMenuComponent, java.lang.Boolean> getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    public FilterTextContextMenuDataComponentsElement(kotlin.jvm.functions.Function1<? super androidx.compose.foundation.text.contextmenu.data.TextContextMenuComponent, java.lang.Boolean> function1) {
        this.getHighSpeedVideoFpsRangesFor = function1;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final /* bridge */ /* synthetic */ void update(androidx.compose.foundation.text.contextmenu.modifier.FilterTextContextMenuDataComponentsNode filterTextContextMenuDataComponentsNode) {
        filterTextContextMenuDataComponentsNode.getHighSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("filterTextContextMenuDataComponents");
        inspectorInfo.getProperties().set(com.paypal.oslo.feature.activity.analytics.ActivityAnalyticsConstants.Ledger.FILTER, this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof androidx.compose.foundation.text.contextmenu.modifier.FilterTextContextMenuDataComponentsElement) && this.getHighSpeedVideoFpsRangesFor == ((androidx.compose.foundation.text.contextmenu.modifier.FilterTextContextMenuDataComponentsElement) p0).getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.getHighSpeedVideoFpsRangesFor.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: create */
    public final /* synthetic */ androidx.compose.foundation.text.contextmenu.modifier.FilterTextContextMenuDataComponentsNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.foundation.text.contextmenu.modifier.FilterTextContextMenuDataComponentsNode(this.getHighSpeedVideoFpsRangesFor);
    }
}
