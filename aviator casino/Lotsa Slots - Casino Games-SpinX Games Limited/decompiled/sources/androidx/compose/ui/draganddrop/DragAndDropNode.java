package androidx.compose.ui.draganddrop;

/* compiled from: DragAndDropNode.kt */
@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 (2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001(B*\u0012#\u0010\u0004\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0005¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0006H\u0016J;\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0017\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00160\u0005¢\u0006\u0002\b\u001dH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010!\u001a\u00020\u0016H\u0016J\u0010\u0010\"\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0010\u0010#\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0010\u0010$\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0010\u0010%\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0010\u0010&\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0010\u0010'\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u0006H\u0016R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010\u0004\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006)"}, d2 = {"Landroidx/compose/ui/draganddrop/DragAndDropNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/TraversableNode;", "Landroidx/compose/ui/draganddrop/DragAndDropModifierNode;", "onDragAndDropStart", "Lkotlin/Function1;", "Landroidx/compose/ui/draganddrop/DragAndDropEvent;", "Lkotlin/ParameterName;", "name", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "Landroidx/compose/ui/draganddrop/DragAndDropTarget;", "(Lkotlin/jvm/functions/Function1;)V", "lastChildDragAndDropModifierNode", "thisDragAndDropTarget", "traverseKey", "", "getTraverseKey", "()Ljava/lang/Object;", "acceptDragAndDropTransfer", "", "startEvent", "drag", "", "transferData", "Landroidx/compose/ui/draganddrop/DragAndDropTransferData;", "decorationSize", "Landroidx/compose/ui/geometry/Size;", "drawDragDecoration", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/ExtensionFunctionType;", "drag-12SF9DM", "(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)V", "onChanged", "onDetach", "onDrop", "onEnded", "onEntered", "onExited", "onMoved", "onStarted", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DragAndDropNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.TraversableNode, androidx.compose.ui.draganddrop.DragAndDropModifierNode {
    private androidx.compose.ui.draganddrop.DragAndDropModifierNode lastChildDragAndDropModifierNode;
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.draganddrop.DragAndDropEvent, androidx.compose.ui.draganddrop.DragAndDropTarget> onDragAndDropStart;
    private androidx.compose.ui.draganddrop.DragAndDropTarget thisDragAndDropTarget;
    private final java.lang.Object traverseKey = androidx.compose.ui.draganddrop.DragAndDropNode.Companion.DragAndDropTraversableKey.INSTANCE;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.draganddrop.DragAndDropNode.Companion INSTANCE = new androidx.compose.ui.draganddrop.DragAndDropNode.Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public DragAndDropNode(kotlin.jvm.functions.Function1<? super androidx.compose.ui.draganddrop.DragAndDropEvent, ? extends androidx.compose.ui.draganddrop.DragAndDropTarget> function1) {
        this.onDragAndDropStart = function1;
    }

    /* compiled from: DragAndDropNode.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u00042\u0014\b\u0004\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006H\u0082\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/draganddrop/DragAndDropNode$Companion;", "", "()V", "firstChildOrNull", "Landroidx/compose/ui/draganddrop/DragAndDropModifierNode;", "predicate", "Lkotlin/Function1;", "", "DragAndDropTraversableKey", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: DragAndDropNode.kt */
        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draganddrop/DragAndDropNode$Companion$DragAndDropTraversableKey;", "", "()V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        private static final class DragAndDropTraversableKey {
            public static final androidx.compose.ui.draganddrop.DragAndDropNode.Companion.DragAndDropTraversableKey INSTANCE = new androidx.compose.ui.draganddrop.DragAndDropNode.Companion.DragAndDropTraversableKey();

            private DragAndDropTraversableKey() {
            }
        }

        private Companion() {
        }

        private final androidx.compose.ui.draganddrop.DragAndDropModifierNode firstChildOrNull(androidx.compose.ui.draganddrop.DragAndDropModifierNode dragAndDropModifierNode, final kotlin.jvm.functions.Function1<? super androidx.compose.ui.draganddrop.DragAndDropModifierNode, java.lang.Boolean> function1) {
            if (!dragAndDropModifierNode.getNode().getIsAttached()) {
                return null;
            }
            final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
            androidx.compose.ui.node.TraversableNodeKt.traverseDescendants(dragAndDropModifierNode, androidx.compose.ui.draganddrop.DragAndDropNode.Companion.DragAndDropTraversableKey.INSTANCE, new kotlin.jvm.functions.Function1<androidx.compose.ui.node.TraversableNode, androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction>() { // from class: androidx.compose.ui.draganddrop.DragAndDropNode$Companion$firstChildOrNull$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                public final androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction invoke(androidx.compose.ui.node.TraversableNode traversableNode) {
                    if ((traversableNode instanceof androidx.compose.ui.draganddrop.DragAndDropModifierNode) && function1.invoke(traversableNode).booleanValue()) {
                        objectRef.element = traversableNode;
                        return androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal;
                    }
                    return androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
                }
            });
            return (androidx.compose.ui.draganddrop.DragAndDropModifierNode) objectRef.element;
        }
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public java.lang.Object getTraverseKey() {
        return this.traverseKey;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.thisDragAndDropTarget = null;
        this.lastChildDragAndDropModifierNode = null;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropModifierNode
    /* renamed from: drag-12SF9DM */
    public void mo1761drag12SF9DM(androidx.compose.ui.draganddrop.DragAndDropTransferData transferData, long decorationSize, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> drawDragDecoration) {
        androidx.compose.ui.node.DelegatableNodeKt.requireOwner(this).getDragAndDropManager().mo1760drag12SF9DM(transferData, decorationSize, drawDragDecoration);
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropModifierNode
    public boolean acceptDragAndDropTransfer(final androidx.compose.ui.draganddrop.DragAndDropEvent startEvent) {
        if (!getIsAttached()) {
            return false;
        }
        if (this.thisDragAndDropTarget != null) {
            throw new java.lang.IllegalStateException("DragAndDropTarget self reference must be null at the start of a drag and drop session".toString());
        }
        this.thisDragAndDropTarget = this.onDragAndDropStart.invoke(startEvent);
        final kotlin.jvm.internal.Ref.BooleanRef booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
        androidx.compose.ui.node.TraversableNodeKt.traverseChildren(this, new kotlin.jvm.functions.Function1<androidx.compose.ui.draganddrop.DragAndDropNode, java.lang.Boolean>() { // from class: androidx.compose.ui.draganddrop.DragAndDropNode$acceptDragAndDropTransfer$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Boolean invoke(androidx.compose.ui.draganddrop.DragAndDropNode dragAndDropNode) {
                kotlin.jvm.internal.Ref.BooleanRef booleanRef2 = kotlin.jvm.internal.Ref.BooleanRef.this;
                boolean z = booleanRef2.element;
                boolean acceptDragAndDropTransfer = dragAndDropNode.acceptDragAndDropTransfer(startEvent);
                androidx.compose.ui.draganddrop.DragAndDropNode dragAndDropNode2 = this;
                if (acceptDragAndDropTransfer) {
                    androidx.compose.ui.node.DelegatableNodeKt.requireOwner(dragAndDropNode2).getDragAndDropManager().registerNodeInterest(dragAndDropNode);
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                booleanRef2.element = z | acceptDragAndDropTransfer;
                return true;
            }
        });
        return booleanRef.element || this.thisDragAndDropTarget != null;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void onStarted(androidx.compose.ui.draganddrop.DragAndDropEvent event) {
        androidx.compose.ui.draganddrop.DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
        if (dragAndDropTarget == null) {
            androidx.compose.ui.draganddrop.DragAndDropModifierNode dragAndDropModifierNode = this.lastChildDragAndDropModifierNode;
            if (dragAndDropModifierNode != null) {
                dragAndDropModifierNode.onStarted(event);
                return;
            }
            return;
        }
        dragAndDropTarget.onStarted(event);
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void onEntered(androidx.compose.ui.draganddrop.DragAndDropEvent event) {
        androidx.compose.ui.draganddrop.DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
        if (dragAndDropTarget == null) {
            androidx.compose.ui.draganddrop.DragAndDropModifierNode dragAndDropModifierNode = this.lastChildDragAndDropModifierNode;
            if (dragAndDropModifierNode != null) {
                dragAndDropModifierNode.onEntered(event);
                return;
            }
            return;
        }
        dragAndDropTarget.onEntered(event);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMoved(final androidx.compose.ui.draganddrop.DragAndDropEvent event) {
        androidx.compose.ui.draganddrop.DragAndDropModifierNode dragAndDropModifierNode;
        boolean m1763containsUv8p0NA;
        androidx.compose.ui.draganddrop.DragAndDropModifierNode dragAndDropModifierNode2 = this.lastChildDragAndDropModifierNode;
        if (dragAndDropModifierNode2 != null) {
            m1763containsUv8p0NA = androidx.compose.ui.draganddrop.DragAndDropNodeKt.m1763containsUv8p0NA(dragAndDropModifierNode2, androidx.compose.ui.draganddrop.DragAndDrop_androidKt.getPositionInRoot(event));
            if (m1763containsUv8p0NA) {
                dragAndDropModifierNode = dragAndDropModifierNode2;
                if (dragAndDropModifierNode == null && dragAndDropModifierNode2 == null) {
                    androidx.compose.ui.draganddrop.DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
                    if (dragAndDropTarget != null) {
                        dragAndDropTarget.onExited(event);
                    }
                    androidx.compose.ui.draganddrop.DragAndDropNodeKt.dispatchEntered(dragAndDropModifierNode, event);
                } else if (dragAndDropModifierNode != null && dragAndDropModifierNode2 != null) {
                    dragAndDropModifierNode2.onExited(event);
                    androidx.compose.ui.draganddrop.DragAndDropTarget dragAndDropTarget2 = this.thisDragAndDropTarget;
                    if (dragAndDropTarget2 != null) {
                        androidx.compose.ui.draganddrop.DragAndDropNodeKt.dispatchEntered(dragAndDropTarget2, event);
                    }
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(dragAndDropModifierNode, dragAndDropModifierNode2)) {
                    if (dragAndDropModifierNode2 != null) {
                        dragAndDropModifierNode2.onExited(event);
                    }
                    if (dragAndDropModifierNode != null) {
                        androidx.compose.ui.draganddrop.DragAndDropNodeKt.dispatchEntered(dragAndDropModifierNode, event);
                    }
                } else if (dragAndDropModifierNode != null) {
                    dragAndDropModifierNode.onMoved(event);
                } else {
                    androidx.compose.ui.draganddrop.DragAndDropTarget dragAndDropTarget3 = this.thisDragAndDropTarget;
                    if (dragAndDropTarget3 != null) {
                        dragAndDropTarget3.onMoved(event);
                    }
                }
                this.lastChildDragAndDropModifierNode = dragAndDropModifierNode;
            }
        }
        androidx.compose.ui.draganddrop.DragAndDropNode dragAndDropNode = this;
        if (dragAndDropNode.getNode().getIsAttached()) {
            final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
            androidx.compose.ui.node.TraversableNodeKt.traverseDescendants(dragAndDropNode, androidx.compose.ui.draganddrop.DragAndDropNode.Companion.DragAndDropTraversableKey.INSTANCE, new kotlin.jvm.functions.Function1<androidx.compose.ui.node.TraversableNode, androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction>() { // from class: androidx.compose.ui.draganddrop.DragAndDropNode$onMoved$$inlined$firstChildOrNull$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                public final androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction invoke(androidx.compose.ui.node.TraversableNode traversableNode) {
                    boolean m1763containsUv8p0NA2;
                    if (traversableNode instanceof androidx.compose.ui.draganddrop.DragAndDropModifierNode) {
                        androidx.compose.ui.draganddrop.DragAndDropModifierNode dragAndDropModifierNode3 = (androidx.compose.ui.draganddrop.DragAndDropModifierNode) traversableNode;
                        if (androidx.compose.ui.node.DelegatableNodeKt.requireOwner(this).getDragAndDropManager().isInterestedNode(dragAndDropModifierNode3)) {
                            m1763containsUv8p0NA2 = androidx.compose.ui.draganddrop.DragAndDropNodeKt.m1763containsUv8p0NA(dragAndDropModifierNode3, androidx.compose.ui.draganddrop.DragAndDrop_androidKt.getPositionInRoot(event));
                            if (m1763containsUv8p0NA2) {
                                kotlin.jvm.internal.Ref.ObjectRef.this.element = traversableNode;
                                return androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal;
                            }
                        }
                    }
                    return androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
                }
            });
            dragAndDropModifierNode = (androidx.compose.ui.draganddrop.DragAndDropModifierNode) objectRef.element;
        } else {
            dragAndDropModifierNode = null;
        }
        if (dragAndDropModifierNode == null) {
        }
        if (dragAndDropModifierNode != null) {
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(dragAndDropModifierNode, dragAndDropModifierNode2)) {
        }
        this.lastChildDragAndDropModifierNode = dragAndDropModifierNode;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void onChanged(androidx.compose.ui.draganddrop.DragAndDropEvent event) {
        androidx.compose.ui.draganddrop.DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
        if (dragAndDropTarget == null) {
            androidx.compose.ui.draganddrop.DragAndDropModifierNode dragAndDropModifierNode = this.lastChildDragAndDropModifierNode;
            if (dragAndDropModifierNode != null) {
                dragAndDropModifierNode.onChanged(event);
                return;
            }
            return;
        }
        dragAndDropTarget.onChanged(event);
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void onExited(androidx.compose.ui.draganddrop.DragAndDropEvent event) {
        androidx.compose.ui.draganddrop.DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
        if (dragAndDropTarget != null) {
            dragAndDropTarget.onExited(event);
        }
        androidx.compose.ui.draganddrop.DragAndDropModifierNode dragAndDropModifierNode = this.lastChildDragAndDropModifierNode;
        if (dragAndDropModifierNode != null) {
            dragAndDropModifierNode.onExited(event);
        }
        this.lastChildDragAndDropModifierNode = null;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public boolean onDrop(androidx.compose.ui.draganddrop.DragAndDropEvent event) {
        androidx.compose.ui.draganddrop.DragAndDropModifierNode dragAndDropModifierNode = this.lastChildDragAndDropModifierNode;
        if (dragAndDropModifierNode == null) {
            androidx.compose.ui.draganddrop.DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
            if (dragAndDropTarget != null) {
                return dragAndDropTarget.onDrop(event);
            }
            return false;
        }
        return dragAndDropModifierNode.onDrop(event);
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void onEnded(final androidx.compose.ui.draganddrop.DragAndDropEvent event) {
        if (getNode().getIsAttached()) {
            androidx.compose.ui.node.TraversableNodeKt.traverseChildren(this, new kotlin.jvm.functions.Function1<androidx.compose.ui.draganddrop.DragAndDropNode, java.lang.Boolean>() { // from class: androidx.compose.ui.draganddrop.DragAndDropNode$onEnded$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Boolean invoke(androidx.compose.ui.draganddrop.DragAndDropNode dragAndDropNode) {
                    dragAndDropNode.onEnded(androidx.compose.ui.draganddrop.DragAndDropEvent.this);
                    return true;
                }
            });
            androidx.compose.ui.draganddrop.DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
            if (dragAndDropTarget != null) {
                dragAndDropTarget.onEnded(event);
            }
            this.thisDragAndDropTarget = null;
            this.lastChildDragAndDropModifierNode = null;
        }
    }
}
