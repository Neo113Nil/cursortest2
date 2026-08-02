package androidx.compose.foundation.content;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0007R\"\u0010\u0005\u001a\u00020\u00048\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0007R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00128\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/compose/foundation/content/ReceiveContentNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/foundation/content/ReceiveContentListener;", "receiveContentListener", "<init>", "(Landroidx/compose/foundation/content/ReceiveContentListener;)V", "", "updateNode", "Landroidx/compose/foundation/content/ReceiveContentListener;", "getReceiveContentListener", "()Landroidx/compose/foundation/content/ReceiveContentListener;", "setReceiveContentListener", "Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;", "getHighSpeedVideoSizes", "Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "providedValues", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "getProvidedValues", "()Landroidx/compose/ui/modifier/ModifierLocalMap;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ReceiveContentNode extends androidx.compose.ui.node.DelegatingNode implements androidx.compose.ui.modifier.ModifierLocalModifierNode, androidx.compose.ui.node.CompositionLocalConsumerModifierNode {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.foundation.content.internal.ReceiveContentConfiguration getHighSpeedVideoFpsRangesFor;
    private final androidx.compose.ui.modifier.ModifierLocalMap providedValues;
    private androidx.compose.foundation.content.ReceiveContentListener receiveContentListener;

    public ReceiveContentNode(androidx.compose.foundation.content.ReceiveContentListener receiveContentListener) {
        this.receiveContentListener = receiveContentListener;
        androidx.compose.foundation.content.internal.DynamicReceiveContentConfiguration dynamicReceiveContentConfiguration = new androidx.compose.foundation.content.internal.DynamicReceiveContentConfiguration(this);
        this.getHighSpeedVideoFpsRangesFor = dynamicReceiveContentConfiguration;
        this.providedValues = androidx.compose.ui.modifier.ModifierLocalModifierNodeKt.modifierLocalMapOf(kotlin.TuplesKt.to(androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt.getModifierLocalReceiveContent(), dynamicReceiveContentConfiguration));
        delegate(androidx.compose.foundation.content.internal.ReceiveContentDragAndDropNode_androidKt.ReceiveContentDragAndDropNode(dynamicReceiveContentConfiguration, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.content.ReceiveContentNode$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.foundation.content.ReceiveContentNode.$r8$lambda$GFTTeTs8m2fsGx1aE8wiyznvyO8(androidx.compose.foundation.content.ReceiveContentNode.this, (androidx.compose.ui.draganddrop.DragAndDropEvent) obj);
            }
        }));
    }

    public final androidx.compose.foundation.content.ReceiveContentListener getReceiveContentListener() {
        return this.receiveContentListener;
    }

    public final void setReceiveContentListener(androidx.compose.foundation.content.ReceiveContentListener receiveContentListener) {
        this.receiveContentListener = receiveContentListener;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public final androidx.compose.ui.modifier.ModifierLocalMap getProvidedValues() {
        return this.providedValues;
    }

    public final void updateNode(androidx.compose.foundation.content.ReceiveContentListener receiveContentListener) {
        this.receiveContentListener = receiveContentListener;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GFTTeTs8m2fsGx1aE8wiyznvyO8(androidx.compose.foundation.content.ReceiveContentNode receiveContentNode, androidx.compose.ui.draganddrop.DragAndDropEvent dragAndDropEvent) {
        androidx.compose.foundation.content.internal.DragAndDropRequestPermission_androidKt.dragAndDropRequestPermission(receiveContentNode, dragAndDropEvent);
        return kotlin.Unit.INSTANCE;
    }
}
