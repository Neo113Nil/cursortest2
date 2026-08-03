package androidx.compose.ui.platform;

/* compiled from: AndroidComposeView.android.kt */
@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002Bc\u0012\\\u0010\u0003\u001aX\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012$\u0012\"\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000e¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u0004¢\u0006\u0002\u0010\u0011J;\u0010\u001b\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u0014H\u0016J\u0018\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u0014H\u0016R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u0016X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000Rd\u0010\u0003\u001aX\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012$\u0012\"\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000e¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"Landroidx/compose/ui/platform/DragAndDropModifierOnDragListener;", "Landroid/view/View$OnDragListener;", "Landroidx/compose/ui/draganddrop/DragAndDropManager;", "startDrag", "Lkotlin/Function3;", "Landroidx/compose/ui/draganddrop/DragAndDropTransferData;", "Lkotlin/ParameterName;", "name", "transferData", "Landroidx/compose/ui/geometry/Size;", "decorationSize", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "Lkotlin/ExtensionFunctionType;", "drawDragDecoration", "", "(Lkotlin/jvm/functions/Function3;)V", "interestedNodes", "Landroidx/collection/ArraySet;", "Landroidx/compose/ui/draganddrop/DragAndDropModifierNode;", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "rootDragAndDropNode", "Landroidx/compose/ui/draganddrop/DragAndDropNode;", "drag", "drag-12SF9DM", "(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z", "isInterestedNode", "node", "onDrag", com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "Landroid/view/DragEvent;", "registerNodeInterest", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class DragAndDropModifierOnDragListener implements android.view.View.OnDragListener, androidx.compose.ui.draganddrop.DragAndDropManager {
    private final kotlin.jvm.functions.Function3<androidx.compose.ui.draganddrop.DragAndDropTransferData, androidx.compose.ui.geometry.Size, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit>, java.lang.Boolean> startDrag;
    private final androidx.compose.ui.draganddrop.DragAndDropNode rootDragAndDropNode = new androidx.compose.ui.draganddrop.DragAndDropNode(new kotlin.jvm.functions.Function1<androidx.compose.ui.draganddrop.DragAndDropEvent, androidx.compose.ui.draganddrop.DragAndDropTarget>() { // from class: androidx.compose.ui.platform.DragAndDropModifierOnDragListener$rootDragAndDropNode$1
        @Override // kotlin.jvm.functions.Function1
        public final androidx.compose.ui.draganddrop.DragAndDropTarget invoke(androidx.compose.ui.draganddrop.DragAndDropEvent dragAndDropEvent) {
            return null;
        }
    });
    private final androidx.collection.ArraySet<androidx.compose.ui.draganddrop.DragAndDropModifierNode> interestedNodes = new androidx.collection.ArraySet<>(0, 1, null);
    private final androidx.compose.ui.Modifier modifier = new androidx.compose.ui.node.ModifierNodeElement<androidx.compose.ui.draganddrop.DragAndDropNode>() { // from class: androidx.compose.ui.platform.DragAndDropModifierOnDragListener$modifier$1
        @Override // androidx.compose.ui.node.ModifierNodeElement
        public boolean equals(java.lang.Object other) {
            return other == this;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void update(androidx.compose.ui.draganddrop.DragAndDropNode node) {
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public androidx.compose.ui.draganddrop.DragAndDropNode create() {
            androidx.compose.ui.draganddrop.DragAndDropNode dragAndDropNode;
            dragAndDropNode = androidx.compose.ui.platform.DragAndDropModifierOnDragListener.this.rootDragAndDropNode;
            return dragAndDropNode;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
            inspectorInfo.setName("RootDragAndDropNode");
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public int hashCode() {
            androidx.compose.ui.draganddrop.DragAndDropNode dragAndDropNode;
            dragAndDropNode = androidx.compose.ui.platform.DragAndDropModifierOnDragListener.this.rootDragAndDropNode;
            return dragAndDropNode.hashCode();
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    public DragAndDropModifierOnDragListener(kotlin.jvm.functions.Function3<? super androidx.compose.ui.draganddrop.DragAndDropTransferData, ? super androidx.compose.ui.geometry.Size, ? super kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit>, java.lang.Boolean> function3) {
        this.startDrag = function3;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropManager
    public androidx.compose.ui.Modifier getModifier() {
        return this.modifier;
    }

    @Override // android.view.View.OnDragListener
    public boolean onDrag(android.view.View view, android.view.DragEvent event) {
        androidx.compose.ui.draganddrop.DragAndDropEvent dragAndDropEvent = new androidx.compose.ui.draganddrop.DragAndDropEvent(event);
        switch (event.getAction()) {
            case 1:
                boolean acceptDragAndDropTransfer = this.rootDragAndDropNode.acceptDragAndDropTransfer(dragAndDropEvent);
                java.util.Iterator<androidx.compose.ui.draganddrop.DragAndDropModifierNode> it = this.interestedNodes.iterator();
                while (it.hasNext()) {
                    it.next().onStarted(dragAndDropEvent);
                }
                break;
            case 2:
                this.rootDragAndDropNode.onMoved(dragAndDropEvent);
                break;
            case 4:
                this.rootDragAndDropNode.onEnded(dragAndDropEvent);
                break;
            case 5:
                this.rootDragAndDropNode.onEntered(dragAndDropEvent);
                break;
            case 6:
                this.rootDragAndDropNode.onExited(dragAndDropEvent);
                break;
        }
        return false;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropManager
    /* renamed from: drag-12SF9DM */
    public boolean mo1760drag12SF9DM(androidx.compose.ui.draganddrop.DragAndDropTransferData transferData, long decorationSize, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> drawDragDecoration) {
        return this.startDrag.invoke(transferData, androidx.compose.ui.geometry.Size.m1928boximpl(decorationSize), drawDragDecoration).booleanValue();
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropManager
    public void registerNodeInterest(androidx.compose.ui.draganddrop.DragAndDropModifierNode node) {
        this.interestedNodes.add(node);
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropManager
    public boolean isInterestedNode(androidx.compose.ui.draganddrop.DragAndDropModifierNode node) {
        return this.interestedNodes.contains(node);
    }
}
