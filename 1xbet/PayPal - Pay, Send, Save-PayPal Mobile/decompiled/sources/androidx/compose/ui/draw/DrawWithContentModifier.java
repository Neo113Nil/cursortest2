package androidx.compose.ui.draw;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B \u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0005*\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bR-\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u00068\u0006@\u0007X\u0086\u000e¢\u0006\f\n\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\t"}, d2 = {"Landroidx/compose/ui/draw/DrawWithContentModifier;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DrawModifierNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "", "Lkotlin/ExtensionFunctionType;", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "draw", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DrawWithContentModifier extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.DrawModifierNode {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.ContentDrawScope, kotlin.Unit> getHighSpeedVideoSizes;

    public DrawWithContentModifier(kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.ContentDrawScope, kotlin.Unit> function1) {
        this.getHighSpeedVideoSizes = function1;
    }

    public final void getHighSpeedVideoFpsRanges(kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.ContentDrawScope, kotlin.Unit> function1) {
        this.getHighSpeedVideoSizes = function1;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void draw(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
        this.getHighSpeedVideoSizes.invoke(contentDrawScope);
    }
}
