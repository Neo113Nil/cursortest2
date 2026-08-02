package androidx.compose.ui.node;

@kotlin.Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0000\u0018\u00002\u00020\u0001:\u0002lmB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\u0016J\r\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u0016J\r\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u0016J\u0013\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u001f\u0010\u0016J\u000f\u0010 \u001a\u00020\bH\u0000¢\u0006\u0004\b \u0010\u0016JG\u0010\u0018\u001a\u00060)R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020!2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b\u0018\u0010*J\u001f\u0010,\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020+H\u0002¢\u0006\u0004\b,\u0010-JC\u0010,\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010&\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b,\u0010.J\u0017\u0010/\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b/\u0010\u0010J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0010J\u001f\u0010/\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020$2\u0006\u0010\"\u001a\u00020\u000bH\u0002¢\u0006\u0004\b/\u00100J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u00101J'\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020$2\u0006\u0010\"\u001a\u00020$2\u0006\u0010%\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u00102J<\u0010:\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u00103\u0018\u00012\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u0000042\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020'06H\u0080\b¢\u0006\u0004\b8\u00109J:\u0010=\u001a\u00020\b\"\u0006\b\u0000\u00103\u0018\u00012\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u0000042\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b06H\u0080\b¢\u0006\u0004\b;\u0010<J,\u0010?\u001a\u00020\b2\u0006\u0010>\u001a\u00020!2\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b06H\u0080\b¢\u0006\u0004\b?\u0010<J$\u0010?\u001a\u00020\b2\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b06H\u0080\b¢\u0006\u0004\b?\u0010@J$\u0010A\u001a\u00020\b2\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b06H\u0080\b¢\u0006\u0004\bA\u0010@J:\u0010C\u001a\u00020\b\"\u0006\b\u0000\u00103\u0018\u00012\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u0000042\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b06H\u0080\b¢\u0006\u0004\bB\u0010<J,\u0010D\u001a\u00020\b2\u0006\u0010>\u001a\u00020!2\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b06H\u0080\b¢\u0006\u0004\bD\u0010<J$\u0010D\u001a\u00020\b2\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b06H\u0080\b¢\u0006\u0004\bD\u0010@J(\u0010G\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u00103\u0018\u00012\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u000004H\u0080\b¢\u0006\u0004\bE\u0010FJ(\u0010I\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u00103\u0018\u00012\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u000004H\u0080\b¢\u0006\u0004\bH\u0010FJ\u001b\u0010L\u001a\u00020'2\n\u00105\u001a\u0006\u0012\u0002\b\u000304H\u0000¢\u0006\u0004\bJ\u0010KJ\u0017\u0010M\u001a\u00020'2\u0006\u0010>\u001a\u00020!H\u0000¢\u0006\u0004\bM\u0010KJ\u000f\u0010O\u001a\u00020NH\u0016¢\u0006\u0004\bO\u0010PR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010Q\u001a\u0004\bR\u0010SR\u0014\u0010\f\u001a\u00020T8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u0010UR\u001a\u0010W\u001a\u00020V8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR$\u0010[\u001a\u00020+2\u0006\u0010\u000e\u001a\u00020+8\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\u001a\u0010G\u001a\u00020\u000b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bG\u0010_\u001a\u0004\b`\u0010\rR$\u0010I\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b8\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\bI\u0010_\u001a\u0004\ba\u0010\rR\u0014\u0010d\u001a\u00020'8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bb\u0010cR\u0014\u0010/\u001a\u00020!8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010eR\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010fR\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\f\u0010fR\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00110#8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bg\u0010fR\u001c\u0010i\u001a\b\u0018\u00010)R\u00020\u00008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010hR\u0018\u0010k\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b/\u0010j"}, d2 = {"Landroidx/compose/ui/node/NodeChain;", "", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "Landroidx/compose/ui/node/NodeChain$Logger;", "logger", "", "useLogger$ui", "(Landroidx/compose/ui/node/NodeChain$Logger;)V", "Landroidx/compose/ui/Modifier$Node;", "getHighSpeedVideoSizes", "()Landroidx/compose/ui/Modifier$Node;", "p0", "getHighSpeedVideoFpsRangesFor", "(Landroidx/compose/ui/Modifier$Node;)Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/Modifier;", "m", "updateFrom$ui", "(Landroidx/compose/ui/Modifier;)V", "resetState$ui", "()V", "syncCoordinators", "getHighSpeedVideoFpsRanges", "markAsAttached", "runAttachLifecycle", "", "Landroidx/compose/ui/layout/ModifierInfo;", "getModifierInfo", "()Ljava/util/List;", "markAsDetached$ui", "runDetachLifecycle$ui", "", "p1", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/Modifier$Element;", "p2", "p3", "", "p4", "Landroidx/compose/ui/node/NodeChain$Differ;", "(Landroidx/compose/ui/Modifier$Node;ILandroidx/compose/runtime/collection/MutableVector;Landroidx/compose/runtime/collection/MutableVector;Z)Landroidx/compose/ui/node/NodeChain$Differ;", "Landroidx/compose/ui/node/NodeCoordinator;", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/node/NodeCoordinator;)V", "(ILandroidx/compose/runtime/collection/MutableVector;Landroidx/compose/runtime/collection/MutableVector;Landroidx/compose/ui/Modifier$Node;Z)V", "Camera2StreamConfigurationMap", "(Landroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Node;)Landroidx/compose/ui/Modifier$Node;", "(Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/Modifier$Node;)Landroidx/compose/ui/Modifier$Node;", "(Landroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Node;)V", "T", "Landroidx/compose/ui/node/NodeKind;", "type", "Lkotlin/Function1;", "block", "firstFromHead-aLcG6gQ$ui", "(ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "firstFromHead", "headToTail-aLcG6gQ$ui", "(ILkotlin/jvm/functions/Function1;)V", "headToTail", com.daon.sdk.face.license.License.FEATURE_MASK, "headToTail$ui", "(Lkotlin/jvm/functions/Function1;)V", "headToTailExclusive$ui", "tailToHead-aLcG6gQ$ui", "tailToHead", "tailToHead$ui", "tail-H91voCI$ui", "(I)Ljava/lang/Object;", "tail", "head-H91voCI$ui", "head", "has-H91voCI$ui", "(I)Z", "has", "has$ui", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/node/NodeChain$sentinelHead$1;", "Landroidx/compose/ui/node/NodeChain$sentinelHead$1;", "Landroidx/compose/ui/node/InnerNodeCoordinator;", "innerCoordinator", "Landroidx/compose/ui/node/InnerNodeCoordinator;", "getInnerCoordinator$ui", "()Landroidx/compose/ui/node/InnerNodeCoordinator;", "outerCoordinator", "Landroidx/compose/ui/node/NodeCoordinator;", "getOuterCoordinator$ui", "()Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/Modifier$Node;", "getTail$ui", "getHead$ui", "isUpdating$ui", "()Z", "isUpdating", "()I", "Landroidx/compose/runtime/collection/MutableVector;", "getOutputMinFrameDuration", "Landroidx/compose/ui/node/NodeChain$Differ;", "getOutputFormats", "Landroidx/compose/ui/node/NodeChain$Logger;", "getInputFormats", "Differ", "Logger"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NodeChain {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private androidx.compose.ui.node.NodeChain.Logger getInputFormats;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.ui.node.NodeChain$sentinelHead$1 getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private androidx.compose.ui.node.NodeChain.Differ getOutputFormats;
    private androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.Modifier.Element> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.Modifier.Element> getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.Modifier> getHighResolutionOutputSizeshNQ4ISI;
    private androidx.compose.ui.Modifier.Node head;
    private final androidx.compose.ui.node.InnerNodeCoordinator innerCoordinator;
    private final androidx.compose.ui.node.LayoutNode layoutNode;
    private androidx.compose.ui.node.NodeCoordinator outerCoordinator;
    private final androidx.compose.ui.Modifier.Node tail;

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\b`\u0018\u00002\u00020\u0001J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u0010\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u0010\u0010\u000fJ7\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007H&¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0017\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u0017\u0010\u0018ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/NodeChain$Logger;", "", "", "index", "Landroidx/compose/ui/Modifier$Element;", "prev", io.ktor.http.LinkHeader.Rel.Next, "Landroidx/compose/ui/Modifier$Node;", "node", "", "linearDiffAborted", "(ILandroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Node;)V", "oldIndex", "newIndex", "nodeUpdated", "(IILandroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Node;)V", "nodeReused", "atIndex", "element", "child", "inserted", "nodeInserted", "(IILandroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/Modifier$Node;)V", "nodeRemoved", "(ILandroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier$Node;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public interface Logger {
        void linearDiffAborted(int index, androidx.compose.ui.Modifier.Element prev, androidx.compose.ui.Modifier.Element next, androidx.compose.ui.Modifier.Node node);

        void nodeInserted(int atIndex, int newIndex, androidx.compose.ui.Modifier.Element element, androidx.compose.ui.Modifier.Node child, androidx.compose.ui.Modifier.Node inserted);

        void nodeRemoved(int oldIndex, androidx.compose.ui.Modifier.Element element, androidx.compose.ui.Modifier.Node node);

        void nodeReused(int oldIndex, int newIndex, androidx.compose.ui.Modifier.Element prev, androidx.compose.ui.Modifier.Element next, androidx.compose.ui.Modifier.Node node);

        void nodeUpdated(int oldIndex, int newIndex, androidx.compose.ui.Modifier.Element prev, androidx.compose.ui.Modifier.Element next, androidx.compose.ui.Modifier.Node node);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.Modifier$Node, androidx.compose.ui.node.NodeChain$sentinelHead$1] */
    public NodeChain(androidx.compose.ui.node.LayoutNode layoutNode) {
        this.layoutNode = layoutNode;
        ?? r0 = new androidx.compose.ui.Modifier.Node() { // from class: androidx.compose.ui.node.NodeChain$sentinelHead$1
            public final java.lang.String toString() {
                return "<Head>";
            }
        };
        r0.setAggregateChildKindSet$ui(-1);
        this.getHighSpeedVideoSizes = r0;
        androidx.compose.ui.node.InnerNodeCoordinator innerNodeCoordinator = new androidx.compose.ui.node.InnerNodeCoordinator(layoutNode);
        this.innerCoordinator = innerNodeCoordinator;
        this.outerCoordinator = innerNodeCoordinator;
        androidx.compose.ui.node.TailModifierNode tail = innerNodeCoordinator.getTail();
        this.tail = tail;
        this.head = tail;
        this.getHighResolutionOutputSizeshNQ4ISI = new androidx.compose.runtime.collection.MutableVector<>(new androidx.compose.ui.Modifier[16], 0);
    }

    public static final /* synthetic */ androidx.compose.ui.Modifier.Node access$createAndInsertNodeAsChild(androidx.compose.ui.node.NodeChain nodeChain, androidx.compose.ui.Modifier.Element element, androidx.compose.ui.Modifier.Node node) {
        return Camera2StreamConfigurationMap(element, node);
    }

    public static final /* synthetic */ androidx.compose.ui.Modifier.Node access$detachAndRemoveNode(androidx.compose.ui.node.NodeChain nodeChain, androidx.compose.ui.Modifier.Node node) {
        return Camera2StreamConfigurationMap(node);
    }

    public final androidx.compose.ui.node.LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    /* renamed from: getInnerCoordinator$ui, reason: from getter */
    public final androidx.compose.ui.node.InnerNodeCoordinator getInnerCoordinator() {
        return this.innerCoordinator;
    }

    /* renamed from: getOuterCoordinator$ui, reason: from getter */
    public final androidx.compose.ui.node.NodeCoordinator getOuterCoordinator() {
        return this.outerCoordinator;
    }

    /* renamed from: getTail$ui, reason: from getter */
    public final androidx.compose.ui.Modifier.Node getTail() {
        return this.tail;
    }

    /* renamed from: getHead$ui, reason: from getter */
    public final androidx.compose.ui.Modifier.Node getHead() {
        return this.head;
    }

    public final boolean isUpdating$ui() {
        return getChild() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getHighSpeedVideoFpsRangesFor() {
        return this.head.getAggregateChildKindSet();
    }

    public final void useLogger$ui(androidx.compose.ui.node.NodeChain.Logger logger) {
        this.getInputFormats = logger;
    }

    private final androidx.compose.ui.Modifier.Node getHighSpeedVideoSizes() {
        if (this.head == this.getHighSpeedVideoSizes) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("padChain called on already padded chain");
        }
        androidx.compose.ui.Modifier.Node node = this.head;
        node.setParent$ui(this.getHighSpeedVideoSizes);
        setChild$ui(node);
        return this.getHighSpeedVideoSizes;
    }

    private final androidx.compose.ui.Modifier.Node getHighSpeedVideoFpsRangesFor(androidx.compose.ui.Modifier.Node p0) {
        if (p0 != this.getHighSpeedVideoSizes) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("trimChain called on already trimmed chain");
        }
        androidx.compose.ui.Modifier.Node child = getChild();
        if (child == null) {
            child = this.tail;
        }
        child.setParent$ui(null);
        setChild$ui(null);
        setAggregateChildKindSet$ui(-1);
        updateCoordinator$ui(null);
        if (child == this.getHighSpeedVideoSizes) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("trimChain did not update the head");
        }
        return child;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x008f, code lost:
    
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0090, code lost:
    
        if (r2 >= r1) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0092, code lost:
    
        if (r8 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0094, code lost:
    
        if (r5 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0096, code lost:
    
        getHighResolutionOutputSizeshNQ4ISI(r2, r8, r9, r5, !r18.layoutNode.getApplyingModifierOnAttach$ui());
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00aa, code lost:
    
        androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("structuralUpdate requires a non-null tail");
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b5, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b6, code lost:
    
        androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("expected prior modifier list to be non-empty");
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00be, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateFrom$ui(androidx.compose.ui.Modifier m) {
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.Modifier.Element> highSpeedVideoFpsRanges;
        androidx.compose.ui.node.NodeChain.Logger logger;
        androidx.compose.ui.Modifier.Node highSpeedVideoSizes = getHighSpeedVideoSizes();
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.Modifier.Element> mutableVector = this.getHighSpeedVideoFpsRangesFor;
        int i = 0;
        int size = mutableVector != null ? mutableVector.getSize() : 0;
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.Modifier.Element> mutableVector2 = this.getHighSpeedVideoFpsRanges;
        if (mutableVector2 == null) {
            mutableVector2 = new androidx.compose.runtime.collection.MutableVector<>(new androidx.compose.ui.Modifier.Element[16], 0);
        }
        highSpeedVideoFpsRanges = androidx.compose.ui.node.NodeChainKt.getHighSpeedVideoFpsRanges(m, mutableVector2, this.getHighResolutionOutputSizeshNQ4ISI);
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.Modifier.Element> mutableVector3 = null;
        if (highSpeedVideoFpsRanges.getSize() == size) {
            androidx.compose.ui.Modifier.Node child = highSpeedVideoSizes.getChild();
            int i2 = 0;
            while (true) {
                if (child == null || i2 >= size) {
                    break;
                }
                if (mutableVector == null) {
                    androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("expected prior modifier list to be non-empty");
                    throw new kotlin.KotlinNothingValueException();
                }
                androidx.compose.ui.Modifier.Element element = mutableVector.content[i2];
                androidx.compose.ui.Modifier.Element element2 = highSpeedVideoFpsRanges.content[i2];
                int actionForModifiers = androidx.compose.ui.node.NodeChainKt.actionForModifiers(element, element2);
                if (actionForModifiers == 0) {
                    androidx.compose.ui.node.NodeChain.Logger logger2 = this.getInputFormats;
                    if (logger2 != null) {
                        logger2.linearDiffAborted(i2, element, element2, child);
                    }
                    child = child.getParent();
                } else {
                    if (actionForModifiers == 1) {
                        getHighSpeedVideoSizes(element, element2, child);
                        androidx.compose.ui.node.NodeChain.Logger logger3 = this.getInputFormats;
                        if (logger3 != null) {
                            logger3.nodeUpdated(i2, i2, element, element2, child);
                        }
                    } else if (actionForModifiers == 2 && (logger = this.getInputFormats) != null) {
                        logger.nodeReused(i2, i2, element, element2, child);
                    }
                    child = child.getChild();
                    i2++;
                }
            }
        } else {
            if (this.layoutNode.getApplyingModifierOnAttach$ui() && size == 0) {
                androidx.compose.ui.Modifier.Node node = highSpeedVideoSizes;
                while (i < highSpeedVideoFpsRanges.getSize()) {
                    androidx.compose.ui.Modifier.Element element3 = highSpeedVideoFpsRanges.content[i];
                    androidx.compose.ui.Modifier.Node Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(element3, node);
                    androidx.compose.ui.node.NodeChain.Logger logger4 = this.getInputFormats;
                    if (logger4 != null) {
                        logger4.nodeInserted(0, i, element3, node, Camera2StreamConfigurationMap);
                    }
                    i++;
                    node = Camera2StreamConfigurationMap;
                }
                getHighSpeedVideoFpsRanges();
            } else {
                if (highSpeedVideoFpsRanges.getSize() == 0) {
                    if (mutableVector != null) {
                        androidx.compose.ui.Modifier.Node child2 = highSpeedVideoSizes.getChild();
                        for (int i3 = 0; child2 != null && i3 < mutableVector.getSize(); i3++) {
                            androidx.compose.ui.node.NodeChain.Logger logger5 = this.getInputFormats;
                            if (logger5 != null) {
                                logger5.nodeRemoved(i3, mutableVector.content[i3], child2);
                            }
                            child2 = Camera2StreamConfigurationMap(child2).getChild();
                        }
                        androidx.compose.ui.node.InnerNodeCoordinator innerNodeCoordinator = this.innerCoordinator;
                        androidx.compose.ui.node.LayoutNode parent$ui = this.layoutNode.getParent$ui();
                        innerNodeCoordinator.setWrappedBy$ui(parent$ui != null ? parent$ui.getInnerCoordinator$ui() : null);
                        this.outerCoordinator = this.innerCoordinator;
                        this.getHighSpeedVideoFpsRangesFor = highSpeedVideoFpsRanges;
                        if (mutableVector != null) {
                            mutableVector.clear();
                            mutableVector3 = mutableVector;
                        }
                        this.getHighSpeedVideoFpsRanges = mutableVector3;
                        this.head = getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes);
                        if (i == 0) {
                            syncCoordinators();
                            return;
                        }
                        return;
                    }
                    androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("expected prior modifier list to be non-empty");
                    throw new kotlin.KotlinNothingValueException();
                }
                if (mutableVector == null) {
                    mutableVector = new androidx.compose.runtime.collection.MutableVector<>(new androidx.compose.ui.Modifier.Element[16], 0);
                }
                getHighResolutionOutputSizeshNQ4ISI(0, mutableVector, highSpeedVideoFpsRanges, highSpeedVideoSizes, !this.layoutNode.getApplyingModifierOnAttach$ui());
            }
            i = 1;
            this.getHighSpeedVideoFpsRangesFor = highSpeedVideoFpsRanges;
            if (mutableVector != null) {
            }
            this.getHighSpeedVideoFpsRanges = mutableVector3;
            this.head = getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes);
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
                    kotlin.jvm.internal.Intrinsics.checkNotNull(coordinator, "");
                    layoutModifierNodeCoordinator = (androidx.compose.ui.node.LayoutModifierNodeCoordinator) coordinator;
                    androidx.compose.ui.node.LayoutModifierNode layoutModifierNode = layoutModifierNodeCoordinator.getLayoutModifierNode();
                    layoutModifierNodeCoordinator.setLayoutModifierNode$ui(asLayoutModifierNode);
                    if (layoutModifierNode != parent) {
                        layoutModifierNodeCoordinator.onLayoutModifierNodeChanged();
                    }
                } else {
                    layoutModifierNodeCoordinator = new androidx.compose.ui.node.LayoutModifierNodeCoordinator(this.layoutNode, asLayoutModifierNode);
                    parent.updateCoordinator$ui(layoutModifierNodeCoordinator);
                }
                androidx.compose.ui.node.LayoutModifierNodeCoordinator layoutModifierNodeCoordinator2 = layoutModifierNodeCoordinator;
                innerNodeCoordinator.setWrappedBy$ui(layoutModifierNodeCoordinator2);
                layoutModifierNodeCoordinator.setWrapped$ui(innerNodeCoordinator);
                innerNodeCoordinator = layoutModifierNodeCoordinator2;
            } else {
                parent.updateCoordinator$ui(innerNodeCoordinator);
            }
        }
        androidx.compose.ui.node.LayoutNode parent$ui = this.layoutNode.getParent$ui();
        innerNodeCoordinator.setWrappedBy$ui(parent$ui != null ? parent$ui.getInnerCoordinator$ui() : null);
        this.outerCoordinator = innerNodeCoordinator;
    }

    private final void getHighSpeedVideoFpsRanges() {
        int i = 0;
        for (androidx.compose.ui.Modifier.Node parent = this.tail.getParent(); parent != null && parent != this.getHighSpeedVideoSizes; parent = parent.getParent()) {
            i |= parent.getKindSet();
            parent.setAggregateChildKindSet$ui(i);
        }
    }

    public final java.util.List<androidx.compose.ui.layout.ModifierInfo> getModifierInfo() {
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.Modifier.Element> mutableVector = this.getHighSpeedVideoFpsRangesFor;
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
            mutableVector2.add(new androidx.compose.ui.layout.ModifierInfo(mutableVector.content[i], coordinator, layer));
            head = head.getChild();
            i++;
        }
        return mutableVector2.asMutableList();
    }

    private final androidx.compose.ui.node.NodeChain.Differ getHighSpeedVideoFpsRanges(androidx.compose.ui.Modifier.Node p0, int p1, androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.Modifier.Element> p2, androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.Modifier.Element> p3, boolean p4) {
        androidx.compose.ui.node.NodeChain.Differ differ = this.getOutputFormats;
        if (differ == null) {
            androidx.compose.ui.node.NodeChain.Differ differ2 = new androidx.compose.ui.node.NodeChain.Differ(p0, p1, p2, p3, p4);
            this.getOutputFormats = differ2;
            return differ2;
        }
        differ.getHighSpeedVideoFpsRangesFor(p0);
        differ.getHighSpeedVideoFpsRangesFor(p1);
        differ.getHighSpeedVideoSizes(p2);
        differ.getHighSpeedVideoFpsRangesFor(p3);
        differ.getHighSpeedVideoSizes(p4);
        return differ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.Modifier.Node p0, androidx.compose.ui.node.NodeCoordinator p1) {
        for (androidx.compose.ui.Modifier.Node parent = p0.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.getHighSpeedVideoSizes) {
                androidx.compose.ui.node.LayoutNode parent$ui = this.layoutNode.getParent$ui();
                p1.setWrappedBy$ui(parent$ui != null ? parent$ui.getInnerCoordinator$ui() : null);
                this.outerCoordinator = p1;
                return;
            } else {
                if ((androidx.compose.ui.node.NodeKind.m7621constructorimpl(2) & parent.getKindSet()) != 0) {
                    return;
                }
                parent.updateCoordinator$ui(p1);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0082\u0004\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0014R\u001c\u0010\u001a\u001a\u00020\u00028\u0006@\u0007X\u0086\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0016\u001a\u00020\u00048\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u0018\u0010\u001b\"\u0004\b\u0018\u0010\u0012R\"\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u001c\"\u0004\b\u001a\u0010\u001dR\"\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u001f\u0010\u001c\"\u0004\b\u0018\u0010\u001dR\u001c\u0010\u001f\u001a\u00020\n8\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b \u0010!\"\u0004\b\u001a\u0010\""}, d2 = {"Landroidx/compose/ui/node/NodeChain$Differ;", "Landroidx/compose/ui/node/DiffCallback;", "Landroidx/compose/ui/Modifier$Node;", "p0", "", "p1", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/Modifier$Element;", "p2", "p3", "", "p4", "<init>", "(Landroidx/compose/ui/node/NodeChain;Landroidx/compose/ui/Modifier$Node;ILandroidx/compose/runtime/collection/MutableVector;Landroidx/compose/runtime/collection/MutableVector;Z)V", "areItemsTheSame", "(II)Z", "", "insert", "(I)V", "remove", "(II)V", "same", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/Modifier$Node;", "getHighSpeedVideoFpsRangesFor", "(Landroidx/compose/ui/Modifier$Node;)V", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup, "Landroidx/compose/runtime/collection/MutableVector;", "(Landroidx/compose/runtime/collection/MutableVector;)V", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "getInputSizeshNQ4ISI", "Z", "(Z)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    final class Differ implements androidx.compose.ui.node.DiffCallback {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private androidx.compose.ui.Modifier.Node getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.Modifier.Element> getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private int Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.Modifier.Element> getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
        private boolean getHighSpeedVideoFpsRanges;

        public Differ(androidx.compose.ui.Modifier.Node node, int i, androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.Modifier.Element> mutableVector, androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.Modifier.Element> mutableVector2, boolean z) {
            this.getHighSpeedVideoSizes = node;
            this.Camera2StreamConfigurationMap = i;
            this.getHighResolutionOutputSizeshNQ4ISI = mutableVector;
            this.getHighSpeedVideoFpsRangesFor = mutableVector2;
            this.getHighSpeedVideoFpsRanges = z;
        }

        public final void getHighSpeedVideoFpsRangesFor(androidx.compose.ui.Modifier.Node node) {
            this.getHighSpeedVideoSizes = node;
        }

        public final void getHighSpeedVideoFpsRangesFor(int i) {
            this.Camera2StreamConfigurationMap = i;
        }

        public final void getHighSpeedVideoSizes(androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.Modifier.Element> mutableVector) {
            this.getHighResolutionOutputSizeshNQ4ISI = mutableVector;
        }

        public final void getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.Modifier.Element> mutableVector) {
            this.getHighSpeedVideoFpsRangesFor = mutableVector;
        }

        public final void getHighSpeedVideoSizes(boolean z) {
            this.getHighSpeedVideoFpsRanges = z;
        }

        @Override // androidx.compose.ui.node.DiffCallback
        public final boolean areItemsTheSame(int p0, int p1) {
            return androidx.compose.ui.node.NodeChainKt.actionForModifiers(this.getHighResolutionOutputSizeshNQ4ISI.content[this.Camera2StreamConfigurationMap + p0], this.getHighSpeedVideoFpsRangesFor.content[this.Camera2StreamConfigurationMap + p1]) != 0;
        }

        @Override // androidx.compose.ui.node.DiffCallback
        public final void insert(int p0) {
            int i = this.Camera2StreamConfigurationMap + p0;
            androidx.compose.ui.Modifier.Node node = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = androidx.compose.ui.node.NodeChain.access$createAndInsertNodeAsChild(androidx.compose.ui.node.NodeChain.this, this.getHighSpeedVideoFpsRangesFor.content[i], node);
            androidx.compose.ui.node.NodeChain.Logger logger = androidx.compose.ui.node.NodeChain.this.getInputFormats;
            if (logger != null) {
                logger.nodeInserted(i, i, this.getHighSpeedVideoFpsRangesFor.content[i], node, this.getHighSpeedVideoSizes);
            }
            if (this.getHighSpeedVideoFpsRanges) {
                androidx.compose.ui.Modifier.Node child = this.getHighSpeedVideoSizes.getChild();
                kotlin.jvm.internal.Intrinsics.checkNotNull(child);
                androidx.compose.ui.node.NodeCoordinator coordinator = child.getCoordinator();
                kotlin.jvm.internal.Intrinsics.checkNotNull(coordinator);
                androidx.compose.ui.node.LayoutModifierNode asLayoutModifierNode = androidx.compose.ui.node.DelegatableNodeKt.asLayoutModifierNode(this.getHighSpeedVideoSizes);
                if (asLayoutModifierNode != null) {
                    androidx.compose.ui.node.LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = new androidx.compose.ui.node.LayoutModifierNodeCoordinator(androidx.compose.ui.node.NodeChain.this.getLayoutNode(), asLayoutModifierNode);
                    androidx.compose.ui.node.LayoutModifierNodeCoordinator layoutModifierNodeCoordinator2 = layoutModifierNodeCoordinator;
                    this.getHighSpeedVideoSizes.updateCoordinator$ui(layoutModifierNodeCoordinator2);
                    androidx.compose.ui.node.NodeChain.this.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes, layoutModifierNodeCoordinator2);
                    layoutModifierNodeCoordinator.setWrappedBy$ui(coordinator.getWrappedBy());
                    layoutModifierNodeCoordinator.setWrapped$ui(coordinator);
                    coordinator.setWrappedBy$ui(layoutModifierNodeCoordinator2);
                } else {
                    this.getHighSpeedVideoSizes.updateCoordinator$ui(coordinator);
                }
                this.getHighSpeedVideoSizes.markAsAttached$ui();
                this.getHighSpeedVideoSizes.runAttachLifecycle$ui();
                androidx.compose.ui.node.NodeKindKt.autoInvalidateInsertedNode(this.getHighSpeedVideoSizes);
                return;
            }
            this.getHighSpeedVideoSizes.setInsertedNodeAwaitingAttachForInvalidation$ui(true);
        }

        @Override // androidx.compose.ui.node.DiffCallback
        public final void remove(int p0, int p1) {
            androidx.compose.ui.Modifier.Node child = this.getHighSpeedVideoSizes.getChild();
            kotlin.jvm.internal.Intrinsics.checkNotNull(child);
            androidx.compose.ui.node.NodeChain.Logger logger = androidx.compose.ui.node.NodeChain.this.getInputFormats;
            if (logger != null) {
                logger.nodeRemoved(p1, this.getHighResolutionOutputSizeshNQ4ISI.content[this.Camera2StreamConfigurationMap + p1], child);
            }
            if ((androidx.compose.ui.node.NodeKind.m7621constructorimpl(2) & child.getKindSet()) != 0) {
                androidx.compose.ui.node.NodeCoordinator coordinator = child.getCoordinator();
                kotlin.jvm.internal.Intrinsics.checkNotNull(coordinator);
                androidx.compose.ui.node.NodeCoordinator wrappedBy = coordinator.getWrappedBy();
                androidx.compose.ui.node.NodeCoordinator wrapped = coordinator.getWrapped();
                kotlin.jvm.internal.Intrinsics.checkNotNull(wrapped);
                if (wrappedBy != null) {
                    wrappedBy.setWrapped$ui(wrapped);
                }
                wrapped.setWrappedBy$ui(wrappedBy);
                androidx.compose.ui.node.NodeChain.this.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes, wrapped);
            }
            this.getHighSpeedVideoSizes = androidx.compose.ui.node.NodeChain.access$detachAndRemoveNode(androidx.compose.ui.node.NodeChain.this, child);
        }

        @Override // androidx.compose.ui.node.DiffCallback
        public final void same(int p0, int p1) {
            androidx.compose.ui.Modifier.Node child = this.getHighSpeedVideoSizes.getChild();
            kotlin.jvm.internal.Intrinsics.checkNotNull(child);
            this.getHighSpeedVideoSizes = child;
            androidx.compose.ui.Modifier.Element element = this.getHighResolutionOutputSizeshNQ4ISI.content[this.Camera2StreamConfigurationMap + p0];
            androidx.compose.ui.Modifier.Element element2 = this.getHighSpeedVideoFpsRangesFor.content[this.Camera2StreamConfigurationMap + p1];
            if (kotlin.jvm.internal.Intrinsics.areEqual(element, element2)) {
                androidx.compose.ui.node.NodeChain.Logger logger = androidx.compose.ui.node.NodeChain.this.getInputFormats;
                if (logger != null) {
                    int i = this.Camera2StreamConfigurationMap;
                    logger.nodeReused(i + p0, i + p1, element, element2, this.getHighSpeedVideoSizes);
                    return;
                }
                return;
            }
            androidx.compose.ui.node.NodeChain nodeChain = androidx.compose.ui.node.NodeChain.this;
            androidx.compose.ui.node.NodeChain.getHighSpeedVideoSizes(element, element2, this.getHighSpeedVideoSizes);
            androidx.compose.ui.node.NodeChain.Logger logger2 = androidx.compose.ui.node.NodeChain.this.getInputFormats;
            if (logger2 != null) {
                int i2 = this.Camera2StreamConfigurationMap;
                logger2.nodeUpdated(i2 + p0, i2 + p1, element, element2, this.getHighSpeedVideoSizes);
            }
        }
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(int p0, androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.Modifier.Element> p1, androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.Modifier.Element> p2, androidx.compose.ui.Modifier.Node p3, boolean p4) {
        androidx.compose.ui.node.MyersDiffKt.executeDiff(p1.getSize() - p0, p2.getSize() - p0, getHighSpeedVideoFpsRanges(p3, p0, p1, p2, p4));
        getHighSpeedVideoFpsRanges();
    }

    private static androidx.compose.ui.Modifier.Node Camera2StreamConfigurationMap(androidx.compose.ui.Modifier.Node p0) {
        if (p0.getIsAttached()) {
            androidx.compose.ui.node.NodeKindKt.autoInvalidateRemovedNode(p0);
            p0.runDetachLifecycle$ui();
            p0.markAsDetached$ui();
        }
        return getHighSpeedVideoFpsRanges(p0);
    }

    private static androidx.compose.ui.Modifier.Node getHighSpeedVideoFpsRanges(androidx.compose.ui.Modifier.Node p0) {
        androidx.compose.ui.Modifier.Node child = p0.getChild();
        androidx.compose.ui.Modifier.Node parent = p0.getParent();
        if (child != null) {
            child.setParent$ui(parent);
            p0.setChild$ui(null);
        }
        if (parent != null) {
            parent.setChild$ui(child);
            p0.setParent$ui(null);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(parent);
        return parent;
    }

    private static androidx.compose.ui.Modifier.Node Camera2StreamConfigurationMap(androidx.compose.ui.Modifier.Element p0, androidx.compose.ui.Modifier.Node p1) {
        androidx.compose.ui.node.BackwardsCompatNode backwardsCompatNode;
        if (p0 instanceof androidx.compose.ui.node.ModifierNodeElement) {
            backwardsCompatNode = ((androidx.compose.ui.node.ModifierNodeElement) p0).getGetHighResolutionOutputSizeshNQ4ISI();
            backwardsCompatNode.setKindSet$ui(androidx.compose.ui.node.NodeKindKt.calculateNodeKindSetFromIncludingDelegates(backwardsCompatNode));
        } else {
            backwardsCompatNode = new androidx.compose.ui.node.BackwardsCompatNode(p0);
        }
        if (backwardsCompatNode.getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        backwardsCompatNode.setInsertedNodeAwaitingAttachForInvalidation$ui(true);
        return getHighSpeedVideoSizes(backwardsCompatNode, p1);
    }

    private static androidx.compose.ui.Modifier.Node getHighSpeedVideoSizes(androidx.compose.ui.Modifier.Node p0, androidx.compose.ui.Modifier.Node p1) {
        androidx.compose.ui.Modifier.Node child = p1.getChild();
        if (child != null) {
            child.setParent$ui(p0);
            p0.setChild$ui(child);
        }
        p1.setChild$ui(p0);
        p0.setParent$ui(p1);
        return p0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void getHighSpeedVideoSizes(androidx.compose.ui.Modifier.Element p0, androidx.compose.ui.Modifier.Element p1, androidx.compose.ui.Modifier.Node p2) {
        if ((p0 instanceof androidx.compose.ui.node.ModifierNodeElement) && (p1 instanceof androidx.compose.ui.node.ModifierNodeElement)) {
            androidx.compose.ui.node.NodeChainKt.getHighResolutionOutputSizeshNQ4ISI((androidx.compose.ui.node.ModifierNodeElement) p1, p2);
            if (p2.getIsAttached()) {
                androidx.compose.ui.node.NodeKindKt.autoInvalidateUpdatedNode(p2);
                return;
            } else {
                p2.setUpdatedNodeAwaitingAttachForInvalidation$ui(true);
                return;
            }
        }
        if (p2 instanceof androidx.compose.ui.node.BackwardsCompatNode) {
            ((androidx.compose.ui.node.BackwardsCompatNode) p2).setElement(p1);
            if (p2.getIsAttached()) {
                androidx.compose.ui.node.NodeKindKt.autoInvalidateUpdatedNode(p2);
                return;
            } else {
                p2.setUpdatedNodeAwaitingAttachForInvalidation$ui(true);
                return;
            }
        }
        androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("Unknown Modifier.Node type");
    }

    public final void headToTail$ui(int mask, kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Node, kotlin.Unit> block) {
        if ((getHighSpeedVideoFpsRangesFor() & mask) != 0) {
            for (androidx.compose.ui.Modifier.Node head = getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & mask) != 0) {
                    block.invoke(head);
                }
                if ((head.getAggregateChildKindSet() & mask) == 0) {
                    return;
                }
            }
        }
    }

    public final void headToTail$ui(kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Node, kotlin.Unit> block) {
        for (androidx.compose.ui.Modifier.Node head = getHead(); head != null; head = head.getChild()) {
            block.invoke(head);
        }
    }

    public final void headToTailExclusive$ui(kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Node, kotlin.Unit> block) {
        for (androidx.compose.ui.Modifier.Node head = getHead(); head != null && head != getTail(); head = head.getChild()) {
            block.invoke(head);
        }
    }

    public final void tailToHead$ui(int mask, kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Node, kotlin.Unit> block) {
        if ((getHighSpeedVideoFpsRangesFor() & mask) != 0) {
            for (androidx.compose.ui.Modifier.Node tail = getTail(); tail != null; tail = tail.getParent()) {
                if ((tail.getKindSet() & mask) != 0) {
                    block.invoke(tail);
                }
            }
        }
    }

    public final void tailToHead$ui(kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Node, kotlin.Unit> block) {
        for (androidx.compose.ui.Modifier.Node tail = getTail(); tail != null; tail = tail.getParent()) {
            block.invoke(tail);
        }
    }

    /* renamed from: has-H91voCI$ui, reason: not valid java name */
    public final boolean m7594hasH91voCI$ui(int type) {
        return (type & getHighSpeedVideoFpsRangesFor()) != 0;
    }

    public final boolean has$ui(int mask) {
        return (mask & getHighSpeedVideoFpsRangesFor()) != 0;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
        if (this.head == this.tail) {
            sb.append("]");
        } else {
            androidx.compose.ui.Modifier.Node head = getHead();
            while (true) {
                if (head == null || head == getTail()) {
                    break;
                }
                sb.append(java.lang.String.valueOf(head));
                if (head.getChild() == this.tail) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                head = head.getChild();
            }
        }
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    public final void resetState$ui() {
        for (androidx.compose.ui.Modifier.Node tail = getTail(); tail != null; tail = tail.getParent()) {
            if (tail.getIsAttached()) {
                tail.reset$ui();
            }
        }
        runDetachLifecycle$ui();
        markAsDetached$ui();
    }

    public final void markAsAttached() {
        for (androidx.compose.ui.Modifier.Node head = getHead(); head != null; head = head.getChild()) {
            head.markAsAttached$ui();
        }
    }

    public final void runAttachLifecycle() {
        for (androidx.compose.ui.Modifier.Node head = getHead(); head != null; head = head.getChild()) {
            head.runAttachLifecycle$ui();
            if (head.getInsertedNodeAwaitingAttachForInvalidation()) {
                androidx.compose.ui.node.NodeKindKt.autoInvalidateInsertedNode(head);
            }
            if (head.getUpdatedNodeAwaitingAttachForInvalidation()) {
                androidx.compose.ui.node.NodeKindKt.autoInvalidateUpdatedNode(head);
            }
            head.setInsertedNodeAwaitingAttachForInvalidation$ui(false);
            head.setUpdatedNodeAwaitingAttachForInvalidation$ui(false);
        }
    }

    public final void markAsDetached$ui() {
        for (androidx.compose.ui.Modifier.Node tail = getTail(); tail != null; tail = tail.getParent()) {
            if (tail.getIsAttached()) {
                tail.markAsDetached$ui();
            }
        }
    }

    public final void runDetachLifecycle$ui() {
        for (androidx.compose.ui.Modifier.Node tail = getTail(); tail != null; tail = tail.getParent()) {
            if (tail.getIsAttached()) {
                tail.runDetachLifecycle$ui();
            }
        }
    }

    /* renamed from: firstFromHead-aLcG6gQ$ui, reason: not valid java name */
    public final /* synthetic */ <T> T m7593firstFromHeadaLcG6gQ$ui(int type, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> block) {
        if ((getHighSpeedVideoFpsRangesFor() & type) != 0) {
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
                                if (i != 1) {
                                }
                            }
                        }
                        node = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector);
                    }
                }
                if ((head.getAggregateChildKindSet() & type) == 0) {
                    break;
                }
            }
        }
        return null;
    }

    /* renamed from: headToTail-aLcG6gQ$ui, reason: not valid java name */
    public final /* synthetic */ <T> void m7596headToTailaLcG6gQ$ui(int type, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> block) {
        if ((getHighSpeedVideoFpsRangesFor() & type) != 0) {
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
                            if (i != 1) {
                            }
                        }
                        node = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector);
                    }
                }
                if ((head.getAggregateChildKindSet() & type) == 0) {
                    return;
                }
            }
        }
    }

    /* renamed from: tailToHead-aLcG6gQ$ui, reason: not valid java name */
    public final /* synthetic */ <T> void m7598tailToHeadaLcG6gQ$ui(int type, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> block) {
        if ((getHighSpeedVideoFpsRangesFor() & type) != 0) {
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
                            if (i != 1) {
                            }
                        }
                        node = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector);
                    }
                }
            }
        }
    }

    /* renamed from: tail-H91voCI$ui, reason: not valid java name */
    public final /* synthetic */ <T> T m7597tailH91voCI$ui(int type) {
        if ((getHighSpeedVideoFpsRangesFor() & type) != 0) {
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
                            if (i != 1) {
                            }
                        }
                        obj = (T) androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector);
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: head-H91voCI$ui, reason: not valid java name */
    public final /* synthetic */ <T> T m7595headH91voCI$ui(int type) {
        if ((getHighSpeedVideoFpsRangesFor() & type) != 0) {
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
                            if (i != 1) {
                            }
                        }
                        obj = (T) androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector);
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
