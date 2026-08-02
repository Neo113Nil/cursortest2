package androidx.compose.ui.draganddrop;

@kotlin.Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 N2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001NBD\u0012!\b\u0002\u0010\f\u001a\u001b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\u0002\b\u000b\u0012\u0018\b\u0002\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u0017J'\u0010!\u001a\u00020\n*\u00020\b2\u0006\u0010\u0019\u001a\u00020\t2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c¢\u0006\u0004\b\u001f\u0010 J8\u0010*\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\n0\r¢\u0006\u0002\b\u000bH\u0017¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u000eH\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\n2\u0006\u0010.\u001a\u00020\u000eH\u0016¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\n2\u0006\u0010.\u001a\u00020\u000eH\u0016¢\u0006\u0004\b1\u00100J\u0017\u00102\u001a\u00020\n2\u0006\u0010.\u001a\u00020\u000eH\u0016¢\u0006\u0004\b2\u00100J\u0017\u00103\u001a\u00020\n2\u0006\u0010.\u001a\u00020\u000eH\u0016¢\u0006\u0004\b3\u00100J\u0017\u00104\u001a\u00020\n2\u0006\u0010.\u001a\u00020\u000eH\u0016¢\u0006\u0004\b4\u00100J\u0017\u00105\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020\u000eH\u0016¢\u0006\u0004\b5\u0010-J\u0017\u00106\u001a\u00020\n2\u0006\u0010.\u001a\u00020\u000eH\u0016¢\u0006\u0004\b6\u00100R/\u00109\u001a\u001b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\u0002\b\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b7\u00108R$\u0010<\u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001a\u0010>\u001a\u00020=8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020B8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0018\u00107\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bC\u0010ER\u0018\u0010:\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b<\u0010FR\u0011\u0010G\u001a\u00020\u001d8G¢\u0006\u0006\u001a\u0004\bG\u0010HR\"\u0010\u0015\u001a\u00020\u00148\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010\u0017R\u0014\u0010M\u001a\u00020\u001d8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010H"}, d2 = {"Landroidx/compose/ui/draganddrop/DragAndDropNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/TraversableNode;", "Landroidx/compose/ui/draganddrop/DragAndDropModifierNode;", "Landroidx/compose/ui/draganddrop/DragAndDropSourceModifierNode;", "Landroidx/compose/ui/draganddrop/DragAndDropTargetModifierNode;", "Landroidx/compose/ui/draganddrop/DragAndDropTarget;", "Lkotlin/Function2;", "Landroidx/compose/ui/draganddrop/DragAndDropStartTransferScope;", "Landroidx/compose/ui/geometry/Offset;", "", "Lkotlin/ExtensionFunctionType;", "onStartTransfer", "Lkotlin/Function1;", "Landroidx/compose/ui/draganddrop/DragAndDropEvent;", "onDropTargetValidate", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "onDetach", "()V", "Landroidx/compose/ui/unit/IntSize;", io.ktor.http.ContentDisposition.Parameters.Size, "onRemeasured-ozmzZPI", "(J)V", "onRemeasured", "offset", "requestDragAndDropTransfer-k-4lQ0M", "requestDragAndDropTransfer", "Lkotlin/Function0;", "", "isTransferStarted", "startDragAndDropTransfer-d-4ec7I", "(Landroidx/compose/ui/draganddrop/DragAndDropStartTransferScope;JLkotlin/jvm/functions/Function0;)V", "startDragAndDropTransfer", "Landroidx/compose/ui/draganddrop/DragAndDropTransferData;", "transferData", "Landroidx/compose/ui/geometry/Size;", "decorationSize", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawDragDecoration", "drag-12SF9DM", "(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)V", "drag", "startEvent", "acceptDragAndDropTransfer", "(Landroidx/compose/ui/draganddrop/DragAndDropEvent;)Z", "event", "onStarted", "(Landroidx/compose/ui/draganddrop/DragAndDropEvent;)V", "onEntered", "onMoved", "onChanged", "onExited", "onDrop", "onEnded", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function2;", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRanges", "", "traverseKey", "Ljava/lang/Object;", "getTraverseKey", "()Ljava/lang/Object;", "Landroidx/compose/ui/draganddrop/DragAndDropManager;", "getHighSpeedVideoSizes", "()Landroidx/compose/ui/draganddrop/DragAndDropManager;", "Landroidx/compose/ui/draganddrop/DragAndDropNode;", "Landroidx/compose/ui/draganddrop/DragAndDropTarget;", "hasEligibleDropTarget", "()Z", "J", "getSize-YbymL2g$ui", "()J", "setSize-ozmzZPI$ui", "isRequestDragAndDropTransferRequired", "Companion_"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DragAndDropNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.TraversableNode, androidx.compose.ui.draganddrop.DragAndDropModifierNode, androidx.compose.ui.draganddrop.DragAndDropSourceModifierNode, androidx.compose.ui.draganddrop.DragAndDropTargetModifierNode, androidx.compose.ui.draganddrop.DragAndDropTarget {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.draganddrop.DragAndDropEvent, androidx.compose.ui.draganddrop.DragAndDropTarget> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private kotlin.jvm.functions.Function2<? super androidx.compose.ui.draganddrop.DragAndDropStartTransferScope, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private androidx.compose.ui.draganddrop.DragAndDropTarget Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private androidx.compose.ui.draganddrop.DragAndDropNode getHighResolutionOutputSizeshNQ4ISI;
    private long size;
    private final java.lang.Object traverseKey;
    private static final androidx.compose.ui.draganddrop.DragAndDropNode.Companion_ Companion_ = new androidx.compose.ui.draganddrop.DragAndDropNode.Companion_(null);
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public DragAndDropNode(kotlin.jvm.functions.Function2<? super androidx.compose.ui.draganddrop.DragAndDropStartTransferScope, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function2, kotlin.jvm.functions.Function1<? super androidx.compose.ui.draganddrop.DragAndDropEvent, ? extends androidx.compose.ui.draganddrop.DragAndDropTarget> function1) {
        this.getHighSpeedVideoFpsRangesFor = function2;
        this.getHighSpeedVideoFpsRanges = function1;
        this.traverseKey = new java.lang.Object() { // from class: androidx.compose.ui.draganddrop.DragAndDropNode$Companion$DragAndDropTraversableKey
        };
        this.size = androidx.compose.ui.unit.IntSize.INSTANCE.m8777getZeroYbymL2g();
    }

    public /* synthetic */ DragAndDropNode(kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function1 function1, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function2, (i & 2) != 0 ? null : function1);
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/draganddrop/DragAndDropNode$Companion_;", "", "<init>", "()V", "DragAndDropTraversableKey"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion_ {
        private Companion_() {
        }

        public /* synthetic */ Companion_(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public final java.lang.Object getTraverseKey() {
        return this.traverseKey;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.ui.draganddrop.DragAndDropManager getHighSpeedVideoSizes() {
        return androidx.compose.ui.node.DelegatableNodeKt.requireOwner(this).getDragAndDropManager();
    }

    public final boolean hasEligibleDropTarget() {
        return (this.getHighResolutionOutputSizeshNQ4ISI == null && this.Camera2StreamConfigurationMap == null) ? false : true;
    }

    /* renamed from: getSize-YbymL2g$ui, reason: not valid java name and from getter */
    public final long getSize() {
        return this.size;
    }

    /* renamed from: setSize-ozmzZPI$ui, reason: not valid java name */
    public final void m5530setSizeozmzZPI$ui(long j) {
        this.size = j;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        this.Camera2StreamConfigurationMap = null;
        this.getHighResolutionOutputSizeshNQ4ISI = null;
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public final void mo1407onRemeasuredozmzZPI(long size) {
        this.size = size;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropSourceModifierNode
    public final boolean isRequestDragAndDropTransferRequired() {
        return getHighSpeedVideoSizes().isRequestDragAndDropTransferRequired();
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropSourceModifierNode
    /* renamed from: requestDragAndDropTransfer-k-4lQ0M, reason: not valid java name */
    public final void mo5529requestDragAndDropTransferk4lQ0M(long offset) {
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("Check failed.");
        }
        getHighSpeedVideoSizes().mo5525requestDragAndDropTransferUv8p0NA(this, offset);
    }

    /* renamed from: startDragAndDropTransfer-d-4ec7I, reason: not valid java name */
    public final void m5531startDragAndDropTransferd4ec7I(final androidx.compose.ui.draganddrop.DragAndDropStartTransferScope dragAndDropStartTransferScope, final long j, final kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        final androidx.compose.ui.layout.LayoutCoordinates coordinates = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(this).getCoordinates();
        androidx.compose.ui.draganddrop.DragAndDropNodeKt.access$traverseSelfAndDescendants(this, new kotlin.jvm.functions.Function1<androidx.compose.ui.draganddrop.DragAndDropNode, androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction>() { // from class: androidx.compose.ui.draganddrop.DragAndDropNode$startDragAndDropTransfer$1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
            public final androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction invoke(androidx.compose.ui.draganddrop.DragAndDropNode dragAndDropNode) {
                kotlin.jvm.functions.Function2 function2;
                if (dragAndDropNode.getIsAttached()) {
                    function2 = dragAndDropNode.getHighSpeedVideoFpsRangesFor;
                    if (function2 == null) {
                        return androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
                    }
                    if (!androidx.compose.ui.geometry.Offset.m5749equalsimpl0(j, androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0())) {
                        long mo7362localPositionOfR5De75A = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(dragAndDropNode).getCoordinates().mo7362localPositionOfR5De75A(coordinates, j);
                        if (!androidx.compose.ui.geometry.SizeKt.m5842toRectuvyYCjk(androidx.compose.ui.unit.IntSizeKt.m8784toSizeozmzZPI(dragAndDropNode.getSize())).m5778containsk4lQ0M(mo7362localPositionOfR5De75A)) {
                            return androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
                        }
                        function2.invoke(dragAndDropStartTransferScope, androidx.compose.ui.geometry.Offset.m5741boximpl(mo7362localPositionOfR5De75A));
                    } else {
                        function2.invoke(dragAndDropStartTransferScope, androidx.compose.ui.geometry.Offset.m5741boximpl(androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0()));
                    }
                    if (function0.invoke().booleanValue()) {
                        return androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal;
                    }
                    return androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
                }
                return androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropModifierNode
    @kotlin.Deprecated(message = "Use DragAndDropSourceModifierNode.requestDragAndDropTransfer instead")
    /* renamed from: drag-12SF9DM */
    public final void mo5527drag12SF9DM(final androidx.compose.ui.draganddrop.DragAndDropTransferData transferData, final long decorationSize, final kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> drawDragDecoration) {
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("Check failed.");
        }
        this.getHighSpeedVideoFpsRangesFor = new kotlin.jvm.functions.Function2<androidx.compose.ui.draganddrop.DragAndDropStartTransferScope, androidx.compose.ui.geometry.Offset, kotlin.Unit>() { // from class: androidx.compose.ui.draganddrop.DragAndDropNode$drag$1
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.draganddrop.DragAndDropStartTransferScope dragAndDropStartTransferScope, androidx.compose.ui.geometry.Offset offset) {
                getHighResolutionOutputSizeshNQ4ISI(dragAndDropStartTransferScope, offset.m5762unboximpl());
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.draganddrop.DragAndDropStartTransferScope dragAndDropStartTransferScope, long j) {
                dragAndDropStartTransferScope.mo5526startDragAndDropTransfer12SF9DM(androidx.compose.ui.draganddrop.DragAndDropTransferData.this, decorationSize, drawDragDecoration);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }
        };
        getHighSpeedVideoSizes().mo5525requestDragAndDropTransferUv8p0NA(this, androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0());
        this.getHighSpeedVideoFpsRangesFor = null;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropModifierNode
    public final boolean acceptDragAndDropTransfer(final androidx.compose.ui.draganddrop.DragAndDropEvent startEvent) {
        final kotlin.jvm.internal.Ref.BooleanRef booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
        androidx.compose.ui.draganddrop.DragAndDropNodeKt.access$traverseSelfAndDescendants(this, new kotlin.jvm.functions.Function1<androidx.compose.ui.draganddrop.DragAndDropNode, androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction>() { // from class: androidx.compose.ui.draganddrop.DragAndDropNode$acceptDragAndDropTransfer$1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
            public final androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction invoke(androidx.compose.ui.draganddrop.DragAndDropNode dragAndDropNode) {
                androidx.compose.ui.draganddrop.DragAndDropTarget dragAndDropTarget;
                kotlin.jvm.functions.Function1 function1;
                androidx.compose.ui.draganddrop.DragAndDropTarget dragAndDropTarget2;
                androidx.compose.ui.draganddrop.DragAndDropManager highSpeedVideoSizes;
                if (dragAndDropNode.getIsAttached()) {
                    dragAndDropTarget = dragAndDropNode.Camera2StreamConfigurationMap;
                    if (dragAndDropTarget != null) {
                        androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                    }
                    function1 = dragAndDropNode.getHighSpeedVideoFpsRanges;
                    dragAndDropNode.Camera2StreamConfigurationMap = function1 != null ? (androidx.compose.ui.draganddrop.DragAndDropTarget) function1.invoke(androidx.compose.ui.draganddrop.DragAndDropEvent.this) : null;
                    dragAndDropTarget2 = dragAndDropNode.Camera2StreamConfigurationMap;
                    boolean z = dragAndDropTarget2 != null;
                    if (z) {
                        highSpeedVideoSizes = this.getHighSpeedVideoSizes();
                        highSpeedVideoSizes.registerTargetInterest(dragAndDropNode);
                    }
                    kotlin.jvm.internal.Ref.BooleanRef booleanRef2 = booleanRef;
                    booleanRef2.element = booleanRef2.element || z;
                    return androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
                }
                return androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
        return booleanRef.element;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public final void onStarted(androidx.compose.ui.draganddrop.DragAndDropEvent event) {
        androidx.compose.ui.draganddrop.DragAndDropNode dragAndDropNode = this;
        do {
            androidx.compose.ui.draganddrop.DragAndDropTarget dragAndDropTarget = dragAndDropNode.Camera2StreamConfigurationMap;
            if (dragAndDropTarget == null) {
                dragAndDropNode = dragAndDropNode.getHighResolutionOutputSizeshNQ4ISI;
            } else {
                dragAndDropTarget.onStarted(event);
                return;
            }
        } while (dragAndDropNode != null);
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public final void onEntered(androidx.compose.ui.draganddrop.DragAndDropEvent event) {
        androidx.compose.ui.draganddrop.DragAndDropNode dragAndDropNode = this;
        do {
            androidx.compose.ui.draganddrop.DragAndDropTarget dragAndDropTarget = dragAndDropNode.Camera2StreamConfigurationMap;
            if (dragAndDropTarget == null) {
                dragAndDropNode = dragAndDropNode.getHighResolutionOutputSizeshNQ4ISI;
            } else {
                dragAndDropTarget.onEntered(event);
                return;
            }
        } while (dragAndDropNode != null);
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public final void onMoved(final androidx.compose.ui.draganddrop.DragAndDropEvent event) {
        androidx.compose.ui.node.TraversableNode traversableNode;
        androidx.compose.ui.draganddrop.DragAndDropNode dragAndDropNode;
        androidx.compose.ui.draganddrop.DragAndDropNode dragAndDropNode2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (dragAndDropNode2 == null || !androidx.compose.ui.draganddrop.DragAndDropNodeKt.m5532access$containsUv8p0NA(dragAndDropNode2, androidx.compose.ui.draganddrop.DragAndDrop_androidKt.getPositionInRoot(event))) {
            androidx.compose.ui.draganddrop.DragAndDropNode dragAndDropNode3 = this;
            if (dragAndDropNode3.getNode().getIsAttached()) {
                final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
                androidx.compose.ui.node.TraversableNodeKt.traverseDescendants(dragAndDropNode3, new kotlin.jvm.functions.Function1<androidx.compose.ui.draganddrop.DragAndDropNode, androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction>() { // from class: androidx.compose.ui.draganddrop.DragAndDropNode$onMoved$$inlined$firstDescendantOrNull$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public final androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction invoke(androidx.compose.ui.draganddrop.DragAndDropNode dragAndDropNode4) {
                        androidx.compose.ui.draganddrop.DragAndDropManager highSpeedVideoSizes;
                        androidx.compose.ui.draganddrop.DragAndDropNode dragAndDropNode5 = dragAndDropNode4;
                        highSpeedVideoSizes = this.getHighSpeedVideoSizes();
                        if (highSpeedVideoSizes.isInterestedTarget(dragAndDropNode5) && androidx.compose.ui.draganddrop.DragAndDropNodeKt.m5532access$containsUv8p0NA(dragAndDropNode5, androidx.compose.ui.draganddrop.DragAndDrop_androidKt.getPositionInRoot(event))) {
                            kotlin.jvm.internal.Ref.ObjectRef.this.element = dragAndDropNode4;
                            return androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal;
                        }
                        return androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                });
                traversableNode = (androidx.compose.ui.node.TraversableNode) objectRef.element;
            } else {
                traversableNode = null;
            }
            dragAndDropNode = (androidx.compose.ui.draganddrop.DragAndDropNode) traversableNode;
        } else {
            dragAndDropNode = dragAndDropNode2;
        }
        if (dragAndDropNode != null && dragAndDropNode2 == null) {
            androidx.compose.ui.draganddrop.DragAndDropNodeKt.access$dispatchEntered(dragAndDropNode, event);
            androidx.compose.ui.draganddrop.DragAndDropTarget dragAndDropTarget = this.Camera2StreamConfigurationMap;
            if (dragAndDropTarget != null) {
                dragAndDropTarget.onExited(event);
            }
        } else if (dragAndDropNode == null && dragAndDropNode2 != null) {
            androidx.compose.ui.draganddrop.DragAndDropTarget dragAndDropTarget2 = this.Camera2StreamConfigurationMap;
            if (dragAndDropTarget2 != null) {
                androidx.compose.ui.draganddrop.DragAndDropNodeKt.access$dispatchEntered(dragAndDropTarget2, event);
            }
            dragAndDropNode2.onExited(event);
        } else if (!kotlin.jvm.internal.Intrinsics.areEqual(dragAndDropNode, dragAndDropNode2)) {
            if (dragAndDropNode != null) {
                androidx.compose.ui.draganddrop.DragAndDropNodeKt.access$dispatchEntered(dragAndDropNode, event);
            }
            if (dragAndDropNode2 != null) {
                dragAndDropNode2.onExited(event);
            }
        } else if (dragAndDropNode != null) {
            dragAndDropNode.onMoved(event);
        } else {
            androidx.compose.ui.draganddrop.DragAndDropTarget dragAndDropTarget3 = this.Camera2StreamConfigurationMap;
            if (dragAndDropTarget3 != null) {
                dragAndDropTarget3.onMoved(event);
            }
        }
        this.getHighResolutionOutputSizeshNQ4ISI = dragAndDropNode;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public final void onChanged(androidx.compose.ui.draganddrop.DragAndDropEvent event) {
        androidx.compose.ui.draganddrop.DragAndDropNode dragAndDropNode = this;
        do {
            androidx.compose.ui.draganddrop.DragAndDropTarget dragAndDropTarget = dragAndDropNode.Camera2StreamConfigurationMap;
            if (dragAndDropTarget == null) {
                dragAndDropNode = dragAndDropNode.getHighResolutionOutputSizeshNQ4ISI;
            } else {
                dragAndDropTarget.onChanged(event);
                return;
            }
        } while (dragAndDropNode != null);
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public final void onExited(androidx.compose.ui.draganddrop.DragAndDropEvent event) {
        androidx.compose.ui.draganddrop.DragAndDropTarget dragAndDropTarget = this.Camera2StreamConfigurationMap;
        if (dragAndDropTarget != null) {
            dragAndDropTarget.onExited(event);
        }
        androidx.compose.ui.draganddrop.DragAndDropNode dragAndDropNode = this.getHighResolutionOutputSizeshNQ4ISI;
        if (dragAndDropNode != null) {
            dragAndDropNode.onExited(event);
        }
        this.getHighResolutionOutputSizeshNQ4ISI = null;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public final boolean onDrop(androidx.compose.ui.draganddrop.DragAndDropEvent event) {
        androidx.compose.ui.draganddrop.DragAndDropNode dragAndDropNode = this;
        while (true) {
            androidx.compose.ui.draganddrop.DragAndDropNode dragAndDropNode2 = dragAndDropNode.getHighResolutionOutputSizeshNQ4ISI;
            if (dragAndDropNode2 == null) {
                break;
            }
            dragAndDropNode = dragAndDropNode2;
        }
        androidx.compose.ui.draganddrop.DragAndDropTarget dragAndDropTarget = dragAndDropNode.Camera2StreamConfigurationMap;
        if (dragAndDropTarget != null) {
            return dragAndDropTarget.onDrop(event);
        }
        return false;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public final void onEnded(final androidx.compose.ui.draganddrop.DragAndDropEvent event) {
        androidx.compose.ui.draganddrop.DragAndDropNodeKt.access$traverseSelfAndDescendants(this, new kotlin.jvm.functions.Function1<androidx.compose.ui.draganddrop.DragAndDropNode, androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction>() { // from class: androidx.compose.ui.draganddrop.DragAndDropNode$onEnded$1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
            public final androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction invoke(androidx.compose.ui.draganddrop.DragAndDropNode dragAndDropNode) {
                androidx.compose.ui.draganddrop.DragAndDropTarget dragAndDropTarget;
                if (dragAndDropNode.getNode().getIsAttached()) {
                    dragAndDropTarget = dragAndDropNode.Camera2StreamConfigurationMap;
                    if (dragAndDropTarget != null) {
                        dragAndDropTarget.onEnded(androidx.compose.ui.draganddrop.DragAndDropEvent.this);
                    }
                    dragAndDropNode.Camera2StreamConfigurationMap = null;
                    dragAndDropNode.getHighResolutionOutputSizeshNQ4ISI = null;
                    return androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
                }
                return androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
            }

            {
                super(1);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DragAndDropNode() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
