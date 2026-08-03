package androidx.compose.ui.node;

/* compiled from: NodeChain.kt */
@kotlin.Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u001c\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u0002mnB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010%\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u0010H\u0002J\u0018\u0010(\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u0010H\u0002J\u0010\u0010*\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u0010H\u0002J?\u0010,\u001a\u0004\u0018\u0001H-\"\u0006\b\u0000\u0010-\u0018\u00012\f\u0010.\u001a\b\u0012\u0004\u0012\u0002H-0/2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u0002H-\u0012\u0004\u0012\u00020\u001901H\u0080\bø\u0001\u0000¢\u0006\u0004\b2\u00103J@\u00104\u001a\u00060\rR\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u00105\u001a\u00020\u00062\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u00108\u001a\u00020\u0019H\u0002J\f\u00109\u001a\b\u0012\u0004\u0012\u00020;0:J\u001e\u0010<\u001a\u00020\u00192\n\u0010.\u001a\u0006\u0012\u0002\b\u00030/H\u0000ø\u0001\u0000¢\u0006\u0004\b=\u0010>J\u0015\u0010<\u001a\u00020\u00192\u0006\u0010?\u001a\u00020\u0006H\u0000¢\u0006\u0002\b@J+\u0010\u0011\u001a\u0004\u0018\u0001H-\"\u0006\b\u0000\u0010-\u0018\u00012\f\u0010.\u001a\b\u0012\u0004\u0012\u0002H-0/H\u0080\bø\u0001\u0000¢\u0006\u0004\bA\u0010BJ\"\u0010C\u001a\u00020D2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020D01H\u0080\b¢\u0006\u0002\bEJ=\u0010C\u001a\u00020D\"\u0006\b\u0000\u0010-\u0018\u00012\f\u0010.\u001a\b\u0012\u0004\u0012\u0002H-0/2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u0002H-\u0012\u0004\u0012\u00020D01H\u0080\bø\u0001\u0000¢\u0006\u0004\bF\u0010GJ*\u0010C\u001a\u00020D2\u0006\u0010?\u001a\u00020\u00062\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020D01H\u0080\b¢\u0006\u0002\bEJ\"\u0010H\u001a\u00020D2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020D01H\u0080\b¢\u0006\u0002\bIJ\u0018\u0010J\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u00102\u0006\u0010'\u001a\u00020\u0010H\u0002J\u0018\u0010K\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u0010H\u0002J\u0006\u0010L\u001a\u00020DJ\r\u0010M\u001a\u00020DH\u0000¢\u0006\u0002\bNJ\b\u0010O\u001a\u00020\u0010H\u0002J\u0018\u0010P\u001a\u00020D2\u0006\u0010Q\u001a\u00020\u00102\u0006\u0010R\u001a\u00020\u001fH\u0002J\u0010\u0010S\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u0010H\u0002J\r\u0010T\u001a\u00020DH\u0000¢\u0006\u0002\bUJ\u0006\u0010V\u001a\u00020DJ\r\u0010W\u001a\u00020DH\u0000¢\u0006\u0002\bXJ<\u0010Y\u001a\u00020D2\u0006\u00105\u001a\u00020\u00062\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010#\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u0019H\u0002J\b\u0010Z\u001a\u00020DH\u0002J\u0006\u0010[\u001a\u00020DJ+\u0010#\u001a\u0004\u0018\u0001H-\"\u0006\b\u0000\u0010-\u0018\u00012\f\u0010.\u001a\b\u0012\u0004\u0012\u0002H-0/H\u0080\bø\u0001\u0000¢\u0006\u0004\b\\\u0010BJ\"\u0010]\u001a\u00020D2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020D01H\u0080\b¢\u0006\u0002\b^J=\u0010]\u001a\u00020D\"\u0006\b\u0000\u0010-\u0018\u00012\f\u0010.\u001a\b\u0012\u0004\u0012\u0002H-0/2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u0002H-\u0012\u0004\u0012\u00020D01H\u0080\bø\u0001\u0000¢\u0006\u0004\b_\u0010GJ*\u0010]\u001a\u00020D2\u0006\u0010?\u001a\u00020\u00062\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020D01H\u0080\b¢\u0006\u0002\b^J\b\u0010`\u001a\u00020aH\u0016J\u0010\u0010b\u001a\u00020\u00102\u0006\u0010c\u001a\u00020\u0010H\u0002J\u0015\u0010d\u001a\u00020D2\u0006\u0010e\u001a\u00020fH\u0000¢\u0006\u0002\bgJ \u0010h\u001a\u00020D2\u0006\u0010i\u001a\u00020\u000b2\u0006\u0010j\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u0010H\u0002J\u0017\u0010k\u001a\u00020D2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0000¢\u0006\u0002\blR\u0014\u0010\u0005\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0018\u00010\rR\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0015X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010 \u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u001f@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u0010X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006o"}, d2 = {"Landroidx/compose/ui/node/NodeChain;", "", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "(Landroidx/compose/ui/node/LayoutNode;)V", "aggregateChildKindSet", "", "getAggregateChildKindSet", "()I", "buffer", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/Modifier$Element;", "cachedDiffer", "Landroidx/compose/ui/node/NodeChain$Differ;", "current", "<set-?>", "Landroidx/compose/ui/Modifier$Node;", "head", "getHead$ui_release", "()Landroidx/compose/ui/Modifier$Node;", "innerCoordinator", "Landroidx/compose/ui/node/InnerNodeCoordinator;", "getInnerCoordinator$ui_release", "()Landroidx/compose/ui/node/InnerNodeCoordinator;", "isUpdating", "", "()Z", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "logger", "Landroidx/compose/ui/node/NodeChain$Logger;", "Landroidx/compose/ui/node/NodeCoordinator;", "outerCoordinator", "getOuterCoordinator$ui_release", "()Landroidx/compose/ui/node/NodeCoordinator;", "tail", "getTail$ui_release", "createAndInsertNodeAsChild", "element", "parent", "createAndInsertNodeAsParent", "child", "detachAndRemoveNode", "node", "firstFromHead", "T", "type", "Landroidx/compose/ui/node/NodeKind;", "block", "Lkotlin/Function1;", "firstFromHead-aLcG6gQ$ui_release", "(ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "getDiffer", "offset", "before", "after", "shouldAttachOnInsert", "getModifierInfo", "", "Landroidx/compose/ui/layout/ModifierInfo;", "has", "has-H91voCI$ui_release", "(I)Z", "mask", "has$ui_release", "head-H91voCI$ui_release", "(I)Ljava/lang/Object;", "headToTail", "", "headToTail$ui_release", "headToTail-aLcG6gQ$ui_release", "(ILkotlin/jvm/functions/Function1;)V", "headToTailExclusive", "headToTailExclusive$ui_release", "insertChild", "insertParent", "markAsAttached", "markAsDetached", "markAsDetached$ui_release", "padChain", "propagateCoordinator", "start", "coordinator", "removeNode", "resetState", "resetState$ui_release", "runAttachLifecycle", "runDetachLifecycle", "runDetachLifecycle$ui_release", "structuralUpdate", "syncAggregateChildKindSet", "syncCoordinators", "tail-H91voCI$ui_release", "tailToHead", "tailToHead$ui_release", "tailToHead-aLcG6gQ$ui_release", "toString", "", "trimChain", "paddedHead", "updateFrom", com.fyber.inneractive.sdk.external.InneractiveMediationDefs.GENDER_MALE, "Landroidx/compose/ui/Modifier;", "updateFrom$ui_release", "updateNode", "prev", io.ktor.http.LinkHeader.Rel.Next, "useLogger", "useLogger$ui_release", "Differ", "Logger", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NodeChain {
    public static final int $stable = 8;
    private androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.Modifier.Element> buffer;
    private androidx.compose.ui.node.NodeChain.Differ cachedDiffer;
    private androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.Modifier.Element> current;
    private androidx.compose.ui.Modifier.Node head;
    private final androidx.compose.ui.node.InnerNodeCoordinator innerCoordinator;
    private final androidx.compose.ui.node.LayoutNode layoutNode;
    private androidx.compose.ui.node.NodeChain.Logger logger;
    private androidx.compose.ui.node.NodeCoordinator outerCoordinator;
    private final androidx.compose.ui.Modifier.Node tail;

    /* compiled from: NodeChain.kt */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b`\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH&J0\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH&J \u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH&J0\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH&J0\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/NodeChain$Logger;", "", "linearDiffAborted", "", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", "prev", "Landroidx/compose/ui/Modifier$Element;", io.ktor.http.LinkHeader.Rel.Next, "node", "Landroidx/compose/ui/Modifier$Node;", "nodeInserted", "atIndex", "newIndex", "element", "child", "inserted", "nodeRemoved", "oldIndex", "nodeReused", "nodeUpdated", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Logger {
        void linearDiffAborted(int index, androidx.compose.ui.Modifier.Element prev, androidx.compose.ui.Modifier.Element next, androidx.compose.ui.Modifier.Node node);

        void nodeInserted(int atIndex, int newIndex, androidx.compose.ui.Modifier.Element element, androidx.compose.ui.Modifier.Node child, androidx.compose.ui.Modifier.Node inserted);

        void nodeRemoved(int oldIndex, androidx.compose.ui.Modifier.Element element, androidx.compose.ui.Modifier.Node node);

        void nodeReused(int oldIndex, int newIndex, androidx.compose.ui.Modifier.Element prev, androidx.compose.ui.Modifier.Element next, androidx.compose.ui.Modifier.Node node);

        void nodeUpdated(int oldIndex, int newIndex, androidx.compose.ui.Modifier.Element prev, androidx.compose.ui.Modifier.Element next, androidx.compose.ui.Modifier.Node node);
    }

    public NodeChain(androidx.compose.ui.node.LayoutNode layoutNode) {
        this.layoutNode = layoutNode;
        androidx.compose.ui.node.InnerNodeCoordinator innerNodeCoordinator = new androidx.compose.ui.node.InnerNodeCoordinator(layoutNode);
        this.innerCoordinator = innerNodeCoordinator;
        this.outerCoordinator = innerNodeCoordinator;
        androidx.compose.ui.node.TailModifierNode tail = innerNodeCoordinator.getTail();
        this.tail = tail;
        this.head = tail;
    }

    public final androidx.compose.ui.node.LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    /* renamed from: getInnerCoordinator$ui_release, reason: from getter */
    public final androidx.compose.ui.node.InnerNodeCoordinator getInnerCoordinator() {
        return this.innerCoordinator;
    }

    /* renamed from: getOuterCoordinator$ui_release, reason: from getter */
    public final androidx.compose.ui.node.NodeCoordinator getOuterCoordinator() {
        return this.outerCoordinator;
    }

    /* renamed from: getTail$ui_release, reason: from getter */
    public final androidx.compose.ui.Modifier.Node getTail() {
        return this.tail;
    }

    /* renamed from: getHead$ui_release, reason: from getter */
    public final androidx.compose.ui.Modifier.Node getHead() {
        return this.head;
    }

    private final boolean isUpdating() {
        androidx.compose.ui.node.NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$1;
        androidx.compose.ui.Modifier.Node node = this.head;
        nodeChainKt$SentinelHead$1 = androidx.compose.ui.node.NodeChainKt.SentinelHead;
        return node == nodeChainKt$SentinelHead$1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getAggregateChildKindSet() {
        return this.head.getAggregateChildKindSet();
    }

    public final void useLogger$ui_release(androidx.compose.ui.node.NodeChain.Logger logger) {
        this.logger = logger;
    }

    private final androidx.compose.ui.Modifier.Node padChain() {
        androidx.compose.ui.node.NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$1;
        androidx.compose.ui.node.NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$12;
        androidx.compose.ui.node.NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$13;
        androidx.compose.ui.node.NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$14;
        androidx.compose.ui.Modifier.Node node = this.head;
        nodeChainKt$SentinelHead$1 = androidx.compose.ui.node.NodeChainKt.SentinelHead;
        if (node == nodeChainKt$SentinelHead$1) {
            throw new java.lang.IllegalStateException("padChain called on already padded chain".toString());
        }
        androidx.compose.ui.Modifier.Node node2 = this.head;
        nodeChainKt$SentinelHead$12 = androidx.compose.ui.node.NodeChainKt.SentinelHead;
        node2.setParent$ui_release(nodeChainKt$SentinelHead$12);
        nodeChainKt$SentinelHead$13 = androidx.compose.ui.node.NodeChainKt.SentinelHead;
        nodeChainKt$SentinelHead$13.setChild$ui_release(node2);
        nodeChainKt$SentinelHead$14 = androidx.compose.ui.node.NodeChainKt.SentinelHead;
        return nodeChainKt$SentinelHead$14;
    }

    private final androidx.compose.ui.Modifier.Node trimChain(androidx.compose.ui.Modifier.Node paddedHead) {
        androidx.compose.ui.node.NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$1;
        androidx.compose.ui.node.NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$12;
        androidx.compose.ui.node.NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$13;
        androidx.compose.ui.node.NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$14;
        androidx.compose.ui.node.NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$15;
        androidx.compose.ui.node.NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$16;
        nodeChainKt$SentinelHead$1 = androidx.compose.ui.node.NodeChainKt.SentinelHead;
        if (paddedHead == nodeChainKt$SentinelHead$1) {
            nodeChainKt$SentinelHead$12 = androidx.compose.ui.node.NodeChainKt.SentinelHead;
            androidx.compose.ui.Modifier.Node child$ui_release = nodeChainKt$SentinelHead$12.getChild();
            if (child$ui_release == null) {
                child$ui_release = this.tail;
            }
            child$ui_release.setParent$ui_release(null);
            nodeChainKt$SentinelHead$13 = androidx.compose.ui.node.NodeChainKt.SentinelHead;
            nodeChainKt$SentinelHead$13.setChild$ui_release(null);
            nodeChainKt$SentinelHead$14 = androidx.compose.ui.node.NodeChainKt.SentinelHead;
            nodeChainKt$SentinelHead$14.setAggregateChildKindSet$ui_release(-1);
            nodeChainKt$SentinelHead$15 = androidx.compose.ui.node.NodeChainKt.SentinelHead;
            nodeChainKt$SentinelHead$15.updateCoordinator$ui_release(null);
            nodeChainKt$SentinelHead$16 = androidx.compose.ui.node.NodeChainKt.SentinelHead;
            if (child$ui_release != nodeChainKt$SentinelHead$16) {
                return child$ui_release;
            }
            throw new java.lang.IllegalStateException("trimChain did not update the head".toString());
        }
        throw new java.lang.IllegalStateException("trimChain called on already trimmed chain".toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0092, code lost:
    
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0093, code lost:
    
        if (r2 >= r1) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0095, code lost:
    
        if (r8 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0097, code lost:
    
        if (r5 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0099, code lost:
    
        structuralUpdate(r2, r8, r9, r5, r18.layoutNode.isAttached());
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b6, code lost:
    
        throw new java.lang.IllegalStateException("structuralUpdate requires a non-null tail".toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c0, code lost:
    
        throw new java.lang.IllegalStateException("expected prior modifier list to be non-empty".toString());
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateFrom$ui_release(androidx.compose.ui.Modifier m) {
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.Modifier.Element> fillVector;
        androidx.compose.ui.node.NodeChain.Logger logger;
        androidx.compose.ui.Modifier.Node padChain = padChain();
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.Modifier.Element> mutableVector = this.current;
        int i = 0;
        int size = mutableVector != null ? mutableVector.getSize() : 0;
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.Modifier.Element> mutableVector2 = this.buffer;
        if (mutableVector2 == null) {
            mutableVector2 = new androidx.compose.runtime.collection.MutableVector<>(new androidx.compose.ui.Modifier.Element[16], 0);
        }
        fillVector = androidx.compose.ui.node.NodeChainKt.fillVector(m, mutableVector2);
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.Modifier.Element> mutableVector3 = null;
        if (fillVector.getSize() == size) {
            androidx.compose.ui.Modifier.Node child = padChain.getChild();
            int i2 = 0;
            while (true) {
                if (child == null || i2 >= size) {
                    break;
                }
                if (mutableVector == null) {
                    throw new java.lang.IllegalStateException("expected prior modifier list to be non-empty".toString());
                }
                androidx.compose.ui.Modifier.Element element = mutableVector.getContent()[i2];
                androidx.compose.ui.Modifier.Element element2 = fillVector.getContent()[i2];
                int actionForModifiers = androidx.compose.ui.node.NodeChainKt.actionForModifiers(element, element2);
                if (actionForModifiers == 0) {
                    androidx.compose.ui.node.NodeChain.Logger logger2 = this.logger;
                    if (logger2 != null) {
                        logger2.linearDiffAborted(i2, element, element2, child);
                    }
                    child = child.getParent();
                } else {
                    if (actionForModifiers == 1) {
                        updateNode(element, element2, child);
                        androidx.compose.ui.node.NodeChain.Logger logger3 = this.logger;
                        if (logger3 != null) {
                            logger3.nodeUpdated(i2, i2, element, element2, child);
                        }
                    } else if (actionForModifiers == 2 && (logger = this.logger) != null) {
                        logger.nodeReused(i2, i2, element, element2, child);
                    }
                    child = child.getChild();
                    i2++;
                }
            }
        } else {
            if (!this.layoutNode.isAttached() && size == 0) {
                androidx.compose.ui.Modifier.Node node = padChain;
                while (i < fillVector.getSize()) {
                    androidx.compose.ui.Modifier.Element element3 = fillVector.getContent()[i];
                    androidx.compose.ui.Modifier.Node createAndInsertNodeAsChild = createAndInsertNodeAsChild(element3, node);
                    androidx.compose.ui.node.NodeChain.Logger logger4 = this.logger;
                    if (logger4 != null) {
                        logger4.nodeInserted(0, i, element3, node, createAndInsertNodeAsChild);
                    }
                    i++;
                    node = createAndInsertNodeAsChild;
                }
                syncAggregateChildKindSet();
            } else {
                if (fillVector.getSize() == 0) {
                    if (mutableVector == null) {
                        throw new java.lang.IllegalStateException("expected prior modifier list to be non-empty".toString());
                    }
                    androidx.compose.ui.Modifier.Node child2 = padChain.getChild();
                    for (int i3 = 0; child2 != null && i3 < mutableVector.getSize(); i3++) {
                        androidx.compose.ui.node.NodeChain.Logger logger5 = this.logger;
                        if (logger5 != null) {
                            logger5.nodeRemoved(i3, mutableVector.getContent()[i3], child2);
                        }
                        child2 = detachAndRemoveNode(child2).getChild();
                    }
                    androidx.compose.ui.node.InnerNodeCoordinator innerNodeCoordinator = this.innerCoordinator;
                    androidx.compose.ui.node.LayoutNode parent$ui_release = this.layoutNode.getParent$ui_release();
                    innerNodeCoordinator.setWrappedBy$ui_release(parent$ui_release != null ? parent$ui_release.getInnerCoordinator$ui_release() : null);
                    this.outerCoordinator = this.innerCoordinator;
                    this.current = fillVector;
                    if (mutableVector != null) {
                        mutableVector.clear();
                        mutableVector3 = mutableVector;
                    }
                    this.buffer = mutableVector3;
                    this.head = trimChain(padChain);
                    if (i == 0) {
                        syncCoordinators();
                        return;
                    }
                    return;
                }
                if (mutableVector == null) {
                    mutableVector = new androidx.compose.runtime.collection.MutableVector<>(new androidx.compose.ui.Modifier.Element[16], 0);
                }
                structuralUpdate(0, mutableVector, fillVector, padChain, this.layoutNode.isAttached());
            }
            i = 1;
            this.current = fillVector;
            if (mutableVector != null) {
            }
            this.buffer = mutableVector3;
            this.head = trimChain(padChain);
            if (i == 0) {
            }
        }
    }

    public final void syncCoordinators() {
        androidx.compose.ui.node.LayoutModifierNodeCoordinator layoutModifierNodeCoordinator;
        androidx.compose.ui.node.InnerNodeCoordinator innerNodeCoordinator = this.innerCoordinator;
        for (androidx.compose.ui.Modifier.Node parent = this.tail.getParent(); parent != null; parent = parent.getParent()) {
            androidx.compose.ui.node.LayoutModifierNode asLayoutModifierNode = androidx.compose.ui.node.DelegatableNodeKt.asLayoutModifierNode(parent);
            if (asLayoutModifierNode != null) {
                if (parent.getCoordinator() != null) {
                    androidx.compose.ui.node.NodeCoordinator coordinator = parent.getCoordinator();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(coordinator, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                    layoutModifierNodeCoordinator = (androidx.compose.ui.node.LayoutModifierNodeCoordinator) coordinator;
                    androidx.compose.ui.node.LayoutModifierNode layoutModifierNode = layoutModifierNodeCoordinator.getLayoutModifierNode();
                    layoutModifierNodeCoordinator.setLayoutModifierNode$ui_release(asLayoutModifierNode);
                    if (layoutModifierNode != parent) {
                        layoutModifierNodeCoordinator.onLayoutModifierNodeChanged();
                    }
                } else {
                    layoutModifierNodeCoordinator = new androidx.compose.ui.node.LayoutModifierNodeCoordinator(this.layoutNode, asLayoutModifierNode);
                    parent.updateCoordinator$ui_release(layoutModifierNodeCoordinator);
                }
                androidx.compose.ui.node.LayoutModifierNodeCoordinator layoutModifierNodeCoordinator2 = layoutModifierNodeCoordinator;
                innerNodeCoordinator.setWrappedBy$ui_release(layoutModifierNodeCoordinator2);
                layoutModifierNodeCoordinator.setWrapped$ui_release(innerNodeCoordinator);
                innerNodeCoordinator = layoutModifierNodeCoordinator2;
            } else {
                parent.updateCoordinator$ui_release(innerNodeCoordinator);
            }
        }
        androidx.compose.ui.node.LayoutNode parent$ui_release = this.layoutNode.getParent$ui_release();
        innerNodeCoordinator.setWrappedBy$ui_release(parent$ui_release != null ? parent$ui_release.getInnerCoordinator$ui_release() : null);
        this.outerCoordinator = innerNodeCoordinator;
    }

    private final void syncAggregateChildKindSet() {
        androidx.compose.ui.node.NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$1;
        int i = 0;
        for (androidx.compose.ui.Modifier.Node parent = this.tail.getParent(); parent != null; parent = parent.getParent()) {
            nodeChainKt$SentinelHead$1 = androidx.compose.ui.node.NodeChainKt.SentinelHead;
            if (parent == nodeChainKt$SentinelHead$1) {
                return;
            }
            i |= parent.getKindSet();
            parent.setAggregateChildKindSet$ui_release(i);
        }
    }

    public final java.util.List<androidx.compose.ui.layout.ModifierInfo> getModifierInfo() {
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.Modifier.Element> mutableVector = this.current;
        if (mutableVector == null) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        int i = 0;
        androidx.compose.runtime.collection.MutableVector mutableVector2 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.layout.ModifierInfo[mutableVector.getSize()], 0);
        androidx.compose.ui.Modifier.Node head = getHead();
        while (head != null && head != getTail()) {
            androidx.compose.ui.node.NodeCoordinator coordinator = head.getCoordinator();
            if (coordinator == null) {
                throw new java.lang.IllegalArgumentException("getModifierInfo called on node with no coordinator".toString());
            }
            androidx.compose.ui.node.OwnedLayer layer = coordinator.getLayer();
            androidx.compose.ui.node.OwnedLayer layer2 = this.innerCoordinator.getLayer();
            androidx.compose.ui.Modifier.Node child = head.getChild();
            if (child != this.tail || head.getCoordinator() == child.getCoordinator()) {
                layer2 = null;
            }
            if (layer == null) {
                layer = layer2;
            }
            mutableVector2.add(new androidx.compose.ui.layout.ModifierInfo(mutableVector.getContent()[i], coordinator, layer));
            head = head.getChild();
            i++;
        }
        return mutableVector2.asMutableList();
    }

    private final androidx.compose.ui.node.NodeChain.Differ getDiffer(androidx.compose.ui.Modifier.Node head, int offset, androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.Modifier.Element> before, androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.Modifier.Element> after, boolean shouldAttachOnInsert) {
        androidx.compose.ui.node.NodeChain.Differ differ = this.cachedDiffer;
        if (differ == null) {
            androidx.compose.ui.node.NodeChain.Differ differ2 = new androidx.compose.ui.node.NodeChain.Differ(head, offset, before, after, shouldAttachOnInsert);
            this.cachedDiffer = differ2;
            return differ2;
        }
        differ.setNode(head);
        differ.setOffset(offset);
        differ.setBefore(before);
        differ.setAfter(after);
        differ.setShouldAttachOnInsert(shouldAttachOnInsert);
        return differ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void propagateCoordinator(androidx.compose.ui.Modifier.Node start, androidx.compose.ui.node.NodeCoordinator coordinator) {
        androidx.compose.ui.node.NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$1;
        for (androidx.compose.ui.Modifier.Node parent = start.getParent(); parent != null; parent = parent.getParent()) {
            nodeChainKt$SentinelHead$1 = androidx.compose.ui.node.NodeChainKt.SentinelHead;
            if (parent == nodeChainKt$SentinelHead$1) {
                androidx.compose.ui.node.LayoutNode parent$ui_release = this.layoutNode.getParent$ui_release();
                coordinator.setWrappedBy$ui_release(parent$ui_release != null ? parent$ui_release.getInnerCoordinator$ui_release() : null);
                this.outerCoordinator = coordinator;
                return;
            } else {
                if ((androidx.compose.ui.node.NodeKind.m3613constructorimpl(2) & parent.getKindSet()) != 0) {
                    return;
                }
                parent.updateCoordinator$ui_release(coordinator);
            }
        }
    }

    /* compiled from: NodeChain.kt */
    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0018\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0005H\u0016J\u0010\u0010\"\u001a\u00020#2\u0006\u0010!\u001a\u00020\u0005H\u0016J\u0018\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005H\u0016J\u0018\u0010&\u001a\u00020#2\u0006\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0005H\u0016R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006'"}, d2 = {"Landroidx/compose/ui/node/NodeChain$Differ;", "Landroidx/compose/ui/node/DiffCallback;", "node", "Landroidx/compose/ui/Modifier$Node;", "offset", "", "before", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/Modifier$Element;", "after", "shouldAttachOnInsert", "", "(Landroidx/compose/ui/node/NodeChain;Landroidx/compose/ui/Modifier$Node;ILandroidx/compose/runtime/collection/MutableVector;Landroidx/compose/runtime/collection/MutableVector;Z)V", "getAfter", "()Landroidx/compose/runtime/collection/MutableVector;", "setAfter", "(Landroidx/compose/runtime/collection/MutableVector;)V", "getBefore", "setBefore", "getNode", "()Landroidx/compose/ui/Modifier$Node;", "setNode", "(Landroidx/compose/ui/Modifier$Node;)V", "getOffset", "()I", "setOffset", "(I)V", "getShouldAttachOnInsert", "()Z", "setShouldAttachOnInsert", "(Z)V", "areItemsTheSame", "oldIndex", "newIndex", "insert", "", "remove", "atIndex", "same", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class Differ implements androidx.compose.ui.node.DiffCallback {
        private androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.Modifier.Element> after;
        private androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.Modifier.Element> before;
        private androidx.compose.ui.Modifier.Node node;
        private int offset;
        private boolean shouldAttachOnInsert;

        public Differ(androidx.compose.ui.Modifier.Node node, int i, androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.Modifier.Element> mutableVector, androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.Modifier.Element> mutableVector2, boolean z) {
            this.node = node;
            this.offset = i;
            this.before = mutableVector;
            this.after = mutableVector2;
            this.shouldAttachOnInsert = z;
        }

        public final androidx.compose.ui.Modifier.Node getNode() {
            return this.node;
        }

        public final void setNode(androidx.compose.ui.Modifier.Node node) {
            this.node = node;
        }

        public final int getOffset() {
            return this.offset;
        }

        public final void setOffset(int i) {
            this.offset = i;
        }

        public final androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.Modifier.Element> getBefore() {
            return this.before;
        }

        public final void setBefore(androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.Modifier.Element> mutableVector) {
            this.before = mutableVector;
        }

        public final androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.Modifier.Element> getAfter() {
            return this.after;
        }

        public final void setAfter(androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.Modifier.Element> mutableVector) {
            this.after = mutableVector;
        }

        public final boolean getShouldAttachOnInsert() {
            return this.shouldAttachOnInsert;
        }

        public final void setShouldAttachOnInsert(boolean z) {
            this.shouldAttachOnInsert = z;
        }

        @Override // androidx.compose.ui.node.DiffCallback
        public boolean areItemsTheSame(int oldIndex, int newIndex) {
            return androidx.compose.ui.node.NodeChainKt.actionForModifiers(this.before.getContent()[this.offset + oldIndex], this.after.getContent()[this.offset + newIndex]) != 0;
        }

        @Override // androidx.compose.ui.node.DiffCallback
        public void insert(int newIndex) {
            int i = this.offset + newIndex;
            androidx.compose.ui.Modifier.Node node = this.node;
            this.node = androidx.compose.ui.node.NodeChain.this.createAndInsertNodeAsChild(this.after.getContent()[i], node);
            androidx.compose.ui.node.NodeChain.Logger logger = androidx.compose.ui.node.NodeChain.this.logger;
            if (logger != null) {
                logger.nodeInserted(i, i, this.after.getContent()[i], node, this.node);
            }
            if (this.shouldAttachOnInsert) {
                androidx.compose.ui.Modifier.Node child = this.node.getChild();
                kotlin.jvm.internal.Intrinsics.checkNotNull(child);
                androidx.compose.ui.node.NodeCoordinator coordinator = child.getCoordinator();
                kotlin.jvm.internal.Intrinsics.checkNotNull(coordinator);
                androidx.compose.ui.node.LayoutModifierNode asLayoutModifierNode = androidx.compose.ui.node.DelegatableNodeKt.asLayoutModifierNode(this.node);
                if (asLayoutModifierNode != null) {
                    androidx.compose.ui.node.LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = new androidx.compose.ui.node.LayoutModifierNodeCoordinator(androidx.compose.ui.node.NodeChain.this.getLayoutNode(), asLayoutModifierNode);
                    androidx.compose.ui.node.LayoutModifierNodeCoordinator layoutModifierNodeCoordinator2 = layoutModifierNodeCoordinator;
                    this.node.updateCoordinator$ui_release(layoutModifierNodeCoordinator2);
                    androidx.compose.ui.node.NodeChain.this.propagateCoordinator(this.node, layoutModifierNodeCoordinator2);
                    layoutModifierNodeCoordinator.setWrappedBy$ui_release(coordinator.getWrappedBy());
                    layoutModifierNodeCoordinator.setWrapped$ui_release(coordinator);
                    coordinator.setWrappedBy$ui_release(layoutModifierNodeCoordinator2);
                } else {
                    this.node.updateCoordinator$ui_release(coordinator);
                }
                this.node.markAsAttached$ui_release();
                this.node.runAttachLifecycle$ui_release();
                androidx.compose.ui.node.NodeKindKt.autoInvalidateInsertedNode(this.node);
                return;
            }
            this.node.setInsertedNodeAwaitingAttachForInvalidation$ui_release(true);
        }

        @Override // androidx.compose.ui.node.DiffCallback
        public void remove(int atIndex, int oldIndex) {
            androidx.compose.ui.Modifier.Node child = this.node.getChild();
            kotlin.jvm.internal.Intrinsics.checkNotNull(child);
            androidx.compose.ui.node.NodeChain.Logger logger = androidx.compose.ui.node.NodeChain.this.logger;
            if (logger != null) {
                androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.Modifier.Element> mutableVector = this.before;
                logger.nodeRemoved(oldIndex, mutableVector.getContent()[this.offset + oldIndex], child);
            }
            if ((androidx.compose.ui.node.NodeKind.m3613constructorimpl(2) & child.getKindSet()) != 0) {
                androidx.compose.ui.node.NodeCoordinator coordinator = child.getCoordinator();
                kotlin.jvm.internal.Intrinsics.checkNotNull(coordinator);
                androidx.compose.ui.node.NodeCoordinator wrappedBy = coordinator.getWrappedBy();
                androidx.compose.ui.node.NodeCoordinator wrapped = coordinator.getWrapped();
                kotlin.jvm.internal.Intrinsics.checkNotNull(wrapped);
                if (wrappedBy != null) {
                    wrappedBy.setWrapped$ui_release(wrapped);
                }
                wrapped.setWrappedBy$ui_release(wrappedBy);
                androidx.compose.ui.node.NodeChain.this.propagateCoordinator(this.node, wrapped);
            }
            this.node = androidx.compose.ui.node.NodeChain.this.detachAndRemoveNode(child);
        }

        @Override // androidx.compose.ui.node.DiffCallback
        public void same(int oldIndex, int newIndex) {
            androidx.compose.ui.Modifier.Node child = this.node.getChild();
            kotlin.jvm.internal.Intrinsics.checkNotNull(child);
            this.node = child;
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.Modifier.Element> mutableVector = this.before;
            androidx.compose.ui.Modifier.Element element = mutableVector.getContent()[this.offset + oldIndex];
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.Modifier.Element> mutableVector2 = this.after;
            androidx.compose.ui.Modifier.Element element2 = mutableVector2.getContent()[this.offset + newIndex];
            if (!kotlin.jvm.internal.Intrinsics.areEqual(element, element2)) {
                androidx.compose.ui.node.NodeChain.this.updateNode(element, element2, this.node);
                androidx.compose.ui.node.NodeChain.Logger logger = androidx.compose.ui.node.NodeChain.this.logger;
                if (logger != null) {
                    int i = this.offset;
                    logger.nodeUpdated(i + oldIndex, i + newIndex, element, element2, this.node);
                    return;
                }
                return;
            }
            androidx.compose.ui.node.NodeChain.Logger logger2 = androidx.compose.ui.node.NodeChain.this.logger;
            if (logger2 != null) {
                int i2 = this.offset;
                logger2.nodeReused(i2 + oldIndex, i2 + newIndex, element, element2, this.node);
            }
        }
    }

    private final void structuralUpdate(int offset, androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.Modifier.Element> before, androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.Modifier.Element> after, androidx.compose.ui.Modifier.Node tail, boolean shouldAttachOnInsert) {
        androidx.compose.ui.node.MyersDiffKt.executeDiff(before.getSize() - offset, after.getSize() - offset, getDiffer(tail, offset, before, after, shouldAttachOnInsert));
        syncAggregateChildKindSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.ui.Modifier.Node detachAndRemoveNode(androidx.compose.ui.Modifier.Node node) {
        if (node.getIsAttached()) {
            androidx.compose.ui.node.NodeKindKt.autoInvalidateRemovedNode(node);
            node.runDetachLifecycle$ui_release();
            node.markAsDetached$ui_release();
        }
        return removeNode(node);
    }

    private final androidx.compose.ui.Modifier.Node removeNode(androidx.compose.ui.Modifier.Node node) {
        androidx.compose.ui.Modifier.Node child = node.getChild();
        androidx.compose.ui.Modifier.Node parent = node.getParent();
        if (child != null) {
            child.setParent$ui_release(parent);
            node.setChild$ui_release(null);
        }
        if (parent != null) {
            parent.setChild$ui_release(child);
            node.setParent$ui_release(null);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(parent);
        return parent;
    }

    private final androidx.compose.ui.Modifier.Node createAndInsertNodeAsParent(androidx.compose.ui.Modifier.Element element, androidx.compose.ui.Modifier.Node child) {
        androidx.compose.ui.node.BackwardsCompatNode backwardsCompatNode;
        if (element instanceof androidx.compose.ui.node.ModifierNodeElement) {
            backwardsCompatNode = ((androidx.compose.ui.node.ModifierNodeElement) element).create();
            backwardsCompatNode.setKindSet$ui_release(androidx.compose.ui.node.NodeKindKt.calculateNodeKindSetFromIncludingDelegates(backwardsCompatNode));
        } else {
            backwardsCompatNode = new androidx.compose.ui.node.BackwardsCompatNode(element);
        }
        if (!(!backwardsCompatNode.getIsAttached())) {
            throw new java.lang.IllegalStateException("createAndInsertNodeAsParent called on an attached node".toString());
        }
        backwardsCompatNode.setInsertedNodeAwaitingAttachForInvalidation$ui_release(true);
        return insertParent(backwardsCompatNode, child);
    }

    private final androidx.compose.ui.Modifier.Node insertParent(androidx.compose.ui.Modifier.Node node, androidx.compose.ui.Modifier.Node child) {
        androidx.compose.ui.Modifier.Node parent = child.getParent();
        if (parent != null) {
            parent.setChild$ui_release(node);
            node.setParent$ui_release(parent);
        }
        child.setParent$ui_release(node);
        node.setChild$ui_release(child);
        return node;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.ui.Modifier.Node createAndInsertNodeAsChild(androidx.compose.ui.Modifier.Element element, androidx.compose.ui.Modifier.Node parent) {
        androidx.compose.ui.node.BackwardsCompatNode backwardsCompatNode;
        if (element instanceof androidx.compose.ui.node.ModifierNodeElement) {
            backwardsCompatNode = ((androidx.compose.ui.node.ModifierNodeElement) element).create();
            backwardsCompatNode.setKindSet$ui_release(androidx.compose.ui.node.NodeKindKt.calculateNodeKindSetFromIncludingDelegates(backwardsCompatNode));
        } else {
            backwardsCompatNode = new androidx.compose.ui.node.BackwardsCompatNode(element);
        }
        if (!(!backwardsCompatNode.getIsAttached())) {
            throw new java.lang.IllegalStateException("A ModifierNodeElement cannot return an already attached node from create() ".toString());
        }
        backwardsCompatNode.setInsertedNodeAwaitingAttachForInvalidation$ui_release(true);
        return insertChild(backwardsCompatNode, parent);
    }

    private final androidx.compose.ui.Modifier.Node insertChild(androidx.compose.ui.Modifier.Node node, androidx.compose.ui.Modifier.Node parent) {
        androidx.compose.ui.Modifier.Node child = parent.getChild();
        if (child != null) {
            child.setParent$ui_release(node);
            node.setChild$ui_release(child);
        }
        parent.setChild$ui_release(node);
        node.setParent$ui_release(parent);
        return node;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateNode(androidx.compose.ui.Modifier.Element prev, androidx.compose.ui.Modifier.Element next, androidx.compose.ui.Modifier.Node node) {
        if ((prev instanceof androidx.compose.ui.node.ModifierNodeElement) && (next instanceof androidx.compose.ui.node.ModifierNodeElement)) {
            androidx.compose.ui.node.NodeChainKt.updateUnsafe((androidx.compose.ui.node.ModifierNodeElement) next, node);
            if (node.getIsAttached()) {
                androidx.compose.ui.node.NodeKindKt.autoInvalidateUpdatedNode(node);
                return;
            } else {
                node.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(true);
                return;
            }
        }
        if (node instanceof androidx.compose.ui.node.BackwardsCompatNode) {
            ((androidx.compose.ui.node.BackwardsCompatNode) node).setElement(next);
            if (node.getIsAttached()) {
                androidx.compose.ui.node.NodeKindKt.autoInvalidateUpdatedNode(node);
                return;
            } else {
                node.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(true);
                return;
            }
        }
        throw new java.lang.IllegalStateException("Unknown Modifier.Node type".toString());
    }

    public final void headToTail$ui_release(int mask, kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Node, kotlin.Unit> block) {
        if ((getAggregateChildKindSet() & mask) == 0) {
            return;
        }
        for (androidx.compose.ui.Modifier.Node head = getHead(); head != null; head = head.getChild()) {
            if ((head.getKindSet() & mask) != 0) {
                block.invoke(head);
            }
            if ((head.getAggregateChildKindSet() & mask) == 0) {
                return;
            }
        }
    }

    public final void headToTail$ui_release(kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Node, kotlin.Unit> block) {
        for (androidx.compose.ui.Modifier.Node head = getHead(); head != null; head = head.getChild()) {
            block.invoke(head);
        }
    }

    public final void headToTailExclusive$ui_release(kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Node, kotlin.Unit> block) {
        for (androidx.compose.ui.Modifier.Node head = getHead(); head != null && head != getTail(); head = head.getChild()) {
            block.invoke(head);
        }
    }

    public final void tailToHead$ui_release(int mask, kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Node, kotlin.Unit> block) {
        if ((getAggregateChildKindSet() & mask) == 0) {
            return;
        }
        for (androidx.compose.ui.Modifier.Node tail = getTail(); tail != null; tail = tail.getParent()) {
            if ((tail.getKindSet() & mask) != 0) {
                block.invoke(tail);
            }
        }
    }

    public final void tailToHead$ui_release(kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Node, kotlin.Unit> block) {
        for (androidx.compose.ui.Modifier.Node tail = getTail(); tail != null; tail = tail.getParent()) {
            block.invoke(tail);
        }
    }

    /* renamed from: has-H91voCI$ui_release, reason: not valid java name */
    public final boolean m3576hasH91voCI$ui_release(int type) {
        return (type & getAggregateChildKindSet()) != 0;
    }

    public final boolean has$ui_release(int mask) {
        return (mask & getAggregateChildKindSet()) != 0;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(com.ironsource.X3.j.d);
        if (this.head == this.tail) {
            sb.append(com.ironsource.X3.j.e);
        } else {
            androidx.compose.ui.Modifier.Node head = getHead();
            while (true) {
                if (head == null || head == getTail()) {
                    break;
                }
                sb.append(java.lang.String.valueOf(head));
                if (head.getChild() == this.tail) {
                    sb.append(com.ironsource.X3.j.e);
                    break;
                }
                sb.append(",");
                head = head.getChild();
            }
        }
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final void resetState$ui_release() {
        int size;
        for (androidx.compose.ui.Modifier.Node tail = getTail(); tail != null; tail = tail.getParent()) {
            if (tail.getIsAttached()) {
                tail.reset$ui_release();
            }
        }
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.Modifier.Element> mutableVector = this.current;
        if (mutableVector != null && (size = mutableVector.getSize()) > 0) {
            androidx.compose.ui.Modifier.Element[] content = mutableVector.getContent();
            int i = 0;
            do {
                androidx.compose.ui.Modifier.Element element = content[i];
                if (element instanceof androidx.compose.ui.input.pointer.SuspendPointerInputElement) {
                    mutableVector.set(i, new androidx.compose.ui.node.ForceUpdateElement((androidx.compose.ui.node.ModifierNodeElement) element));
                }
                i++;
            } while (i < size);
        }
        runDetachLifecycle$ui_release();
        markAsDetached$ui_release();
    }

    public final void markAsAttached() {
        for (androidx.compose.ui.Modifier.Node head = getHead(); head != null; head = head.getChild()) {
            head.markAsAttached$ui_release();
        }
    }

    public final void runAttachLifecycle() {
        for (androidx.compose.ui.Modifier.Node head = getHead(); head != null; head = head.getChild()) {
            head.runAttachLifecycle$ui_release();
            if (head.getInsertedNodeAwaitingAttachForInvalidation()) {
                androidx.compose.ui.node.NodeKindKt.autoInvalidateInsertedNode(head);
            }
            if (head.getUpdatedNodeAwaitingAttachForInvalidation()) {
                androidx.compose.ui.node.NodeKindKt.autoInvalidateUpdatedNode(head);
            }
            head.setInsertedNodeAwaitingAttachForInvalidation$ui_release(false);
            head.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(false);
        }
    }

    public final void markAsDetached$ui_release() {
        for (androidx.compose.ui.Modifier.Node tail = getTail(); tail != null; tail = tail.getParent()) {
            if (tail.getIsAttached()) {
                tail.markAsDetached$ui_release();
            }
        }
    }

    public final void runDetachLifecycle$ui_release() {
        for (androidx.compose.ui.Modifier.Node tail = getTail(); tail != null; tail = tail.getParent()) {
            if (tail.getIsAttached()) {
                tail.runDetachLifecycle$ui_release();
            }
        }
    }

    /* renamed from: firstFromHead-aLcG6gQ$ui_release, reason: not valid java name */
    public final /* synthetic */ <T> T m3575firstFromHeadaLcG6gQ$ui_release(int type, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> block) {
        if ((getAggregateChildKindSet() & type) != 0) {
            for (androidx.compose.ui.Modifier.Node head = getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & type) != 0) {
                    androidx.compose.ui.Modifier.Node node = head;
                    androidx.compose.runtime.collection.MutableVector mutableVector = null;
                    while (node != null) {
                        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
                        if (node instanceof java.lang.Object) {
                            if (block.invoke(node).booleanValue()) {
                                return (T) node;
                            }
                        } else {
                            java.lang.Object obj = node;
                            if ((((androidx.compose.ui.Modifier.Node) node).getKindSet() & type) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                                int i = 0;
                                for (androidx.compose.ui.Modifier.Node delegate = node.getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & type) != 0) {
                                        i++;
                                        if (i == 1) {
                                            node = delegate;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                            }
                                            java.lang.Object obj2 = node;
                                            if (node != null) {
                                                if (mutableVector != null) {
                                                    mutableVector.add(node);
                                                }
                                                node = (java.lang.Object) null;
                                            }
                                            if (mutableVector != null) {
                                                mutableVector.add(delegate);
                                            }
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                        }
                        node = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector);
                    }
                }
                if ((head.getAggregateChildKindSet() & type) == 0) {
                    break;
                }
            }
        }
        return null;
    }

    /* renamed from: headToTail-aLcG6gQ$ui_release, reason: not valid java name */
    public final /* synthetic */ <T> void m3578headToTailaLcG6gQ$ui_release(int type, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> block) {
        if ((getAggregateChildKindSet() & type) != 0) {
            for (androidx.compose.ui.Modifier.Node head = getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & type) != 0) {
                    androidx.compose.ui.Modifier.Node node = head;
                    androidx.compose.runtime.collection.MutableVector mutableVector = null;
                    while (node != null) {
                        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
                        if (node instanceof java.lang.Object) {
                            block.invoke(node);
                        } else if ((node.getKindSet() & type) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                            int i = 0;
                            for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                if ((delegate.getKindSet() & type) != 0) {
                                    i++;
                                    if (i == 1) {
                                        node = delegate;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                        }
                                        if (node != null) {
                                            if (mutableVector != null) {
                                                mutableVector.add(node);
                                            }
                                            node = null;
                                        }
                                        if (mutableVector != null) {
                                            mutableVector.add(delegate);
                                        }
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        node = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector);
                    }
                }
                if ((head.getAggregateChildKindSet() & type) == 0) {
                    return;
                }
            }
        }
    }

    /* renamed from: tailToHead-aLcG6gQ$ui_release, reason: not valid java name */
    public final /* synthetic */ <T> void m3580tailToHeadaLcG6gQ$ui_release(int type, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> block) {
        if ((getAggregateChildKindSet() & type) != 0) {
            for (androidx.compose.ui.Modifier.Node tail = getTail(); tail != null; tail = tail.getParent()) {
                if ((tail.getKindSet() & type) != 0) {
                    androidx.compose.ui.Modifier.Node node = tail;
                    androidx.compose.runtime.collection.MutableVector mutableVector = null;
                    while (node != null) {
                        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
                        if (node instanceof java.lang.Object) {
                            block.invoke(node);
                        } else if ((node.getKindSet() & type) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                            int i = 0;
                            for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                if ((delegate.getKindSet() & type) != 0) {
                                    i++;
                                    if (i == 1) {
                                        node = delegate;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                        }
                                        if (node != null) {
                                            if (mutableVector != null) {
                                                mutableVector.add(node);
                                            }
                                            node = null;
                                        }
                                        if (mutableVector != null) {
                                            mutableVector.add(delegate);
                                        }
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        node = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector);
                    }
                }
            }
        }
    }

    /* renamed from: tail-H91voCI$ui_release, reason: not valid java name */
    public final /* synthetic */ <T> T m3579tailH91voCI$ui_release(int type) {
        if ((getAggregateChildKindSet() & type) != 0) {
            for (androidx.compose.ui.Modifier.Node tail = getTail(); tail != null; tail = tail.getParent()) {
                if ((tail.getKindSet() & type) != 0) {
                    java.lang.Object obj = (T) tail;
                    androidx.compose.runtime.collection.MutableVector mutableVector = null;
                    while (obj != null) {
                        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
                        if (obj instanceof java.lang.Object) {
                            return (T) obj;
                        }
                        java.lang.Object obj2 = obj;
                        if ((((androidx.compose.ui.Modifier.Node) obj).getKindSet() & type) != 0 && (obj instanceof androidx.compose.ui.node.DelegatingNode)) {
                            int i = 0;
                            for (androidx.compose.ui.Modifier.Node delegate = obj.getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                if ((delegate.getKindSet() & type) != 0) {
                                    i++;
                                    if (i == 1) {
                                        obj = (T) delegate;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                        }
                                        java.lang.Object obj3 = obj;
                                        if (obj != null) {
                                            if (mutableVector != null) {
                                                mutableVector.add(obj);
                                            }
                                            obj = (T) null;
                                        }
                                        if (mutableVector != null) {
                                            mutableVector.add(delegate);
                                        }
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        obj = (T) androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector);
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: head-H91voCI$ui_release, reason: not valid java name */
    public final /* synthetic */ <T> T m3577headH91voCI$ui_release(int type) {
        if ((getAggregateChildKindSet() & type) != 0) {
            for (androidx.compose.ui.Modifier.Node head = getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & type) != 0) {
                    java.lang.Object obj = (T) head;
                    androidx.compose.runtime.collection.MutableVector mutableVector = null;
                    while (obj != null) {
                        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
                        if (obj instanceof java.lang.Object) {
                            return (T) obj;
                        }
                        java.lang.Object obj2 = obj;
                        if ((((androidx.compose.ui.Modifier.Node) obj).getKindSet() & type) != 0 && (obj instanceof androidx.compose.ui.node.DelegatingNode)) {
                            int i = 0;
                            for (androidx.compose.ui.Modifier.Node delegate = obj.getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                if ((delegate.getKindSet() & type) != 0) {
                                    i++;
                                    if (i == 1) {
                                        obj = (T) delegate;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                        }
                                        java.lang.Object obj3 = obj;
                                        if (obj != null) {
                                            if (mutableVector != null) {
                                                mutableVector.add(obj);
                                            }
                                            obj = (T) null;
                                        }
                                        if (mutableVector != null) {
                                            mutableVector.add(delegate);
                                        }
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        obj = (T) androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector);
                    }
                }
                if ((head.getAggregateChildKindSet() & type) == 0) {
                    break;
                }
            }
        }
        return null;
    }
}
