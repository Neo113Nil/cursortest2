package androidx.compose.ui.draw;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B(\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u0007*\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR+\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!"}, d2 = {"Landroidx/compose/ui/draw/BlockDropShadowElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/draw/BlockDropShadowNode;", "Landroidx/compose/ui/graphics/Shape;", com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_SHAPE, "Lkotlin/Function1;", "Landroidx/compose/ui/draw/DropShadowScope;", "", "Lkotlin/ExtensionFunctionType;", "block", "<init>", "(Landroidx/compose/ui/graphics/Shape;Lkotlin/jvm/functions/Function1;)V", "create", "()Landroidx/compose/ui/draw/BlockDropShadowNode;", "node", "update", "(Landroidx/compose/ui/draw/BlockDropShadowNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/ui/graphics/Shape;", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "Lkotlin/jvm/functions/Function1;", "getBlock", "()Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BlockDropShadowElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.ui.draw.BlockDropShadowNode> {
    public static final int $stable = 0;
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.draw.DropShadowScope, kotlin.Unit> block;
    private final androidx.compose.ui.graphics.Shape shape;

    /* JADX WARN: Multi-variable type inference failed */
    public BlockDropShadowElement(androidx.compose.ui.graphics.Shape shape, kotlin.jvm.functions.Function1<? super androidx.compose.ui.draw.DropShadowScope, kotlin.Unit> function1) {
        this.shape = shape;
        this.block = function1;
    }

    public final kotlin.jvm.functions.Function1<androidx.compose.ui.draw.DropShadowScope, kotlin.Unit> getBlock() {
        return this.block;
    }

    public final androidx.compose.ui.graphics.Shape getShape() {
        return this.shape;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: create, reason: avoid collision after fix types in other method */
    public final androidx.compose.ui.draw.BlockDropShadowNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.ui.draw.BlockDropShadowNode(this.shape, this.block);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.ui.draw.BlockDropShadowNode node) {
        node.update(this.shape, this.block);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("dropShadow");
        inspectorInfo.getProperties().set(com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_SHAPE, this.shape);
        inspectorInfo.getProperties().set("block", this.block);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.draw.BlockDropShadowElement)) {
            return false;
        }
        androidx.compose.ui.draw.BlockDropShadowElement blockDropShadowElement = (androidx.compose.ui.draw.BlockDropShadowElement) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.shape, blockDropShadowElement.shape) && this.block == blockDropShadowElement.block;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return (this.shape.hashCode() * 31) + this.block.hashCode();
    }
}
