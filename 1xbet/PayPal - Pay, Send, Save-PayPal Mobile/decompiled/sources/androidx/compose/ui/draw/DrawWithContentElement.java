package androidx.compose.ui.draw;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B \u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\fJ\u0013\u0010\u000e\u001a\u00020\u0005*\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0007\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u00068\u0006¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/compose/ui/draw/DrawWithContentElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/draw/DrawWithContentModifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "", "Lkotlin/ExtensionFunctionType;", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "getHighSpeedVideoFpsRangesFor", "()Landroidx/compose/ui/draw/DrawWithContentModifier;", "(Landroidx/compose/ui/draw/DrawWithContentModifier;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DrawWithContentElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.ui.draw.DrawWithContentModifier> {
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.drawscope.ContentDrawScope, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    public DrawWithContentElement(kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.ContentDrawScope, kotlin.Unit> function1) {
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
    public androidx.compose.ui.draw.DrawWithContentModifier getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.ui.draw.DrawWithContentModifier(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
    public void update(androidx.compose.ui.draw.DrawWithContentModifier p0) {
        p0.getHighSpeedVideoFpsRanges(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("drawWithContent");
        inspectorInfo.getProperties().set("onDraw", this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof androidx.compose.ui.draw.DrawWithContentElement) && this.getHighResolutionOutputSizeshNQ4ISI == ((androidx.compose.ui.draw.DrawWithContentElement) p0).getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
    }
}
