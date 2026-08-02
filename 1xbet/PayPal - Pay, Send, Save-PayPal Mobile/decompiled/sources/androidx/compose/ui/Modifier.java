package androidx.compose.ui;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\bf\u0018\u0000 \u00132\u00020\u0001:\u0003\u0014\u0015\u0013J7\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0004H&¢\u0006\u0004\b\t\u0010\bJ#\u0010\r\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\nH&¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u000f\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\nH&¢\u0006\u0004\b\u000f\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0096\u0004¢\u0006\u0004\b\u0011\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/Modifier;", "", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "initial", "Lkotlin/Function2;", "Landroidx/compose/ui/Modifier$Element;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "foldIn", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldOut", "Lkotlin/Function1;", "", "predicate", "any", "(Lkotlin/jvm/functions/Function1;)Z", "all", "other", "then", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "Companion", "Element", "Node"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Modifier {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.Modifier.Companion INSTANCE = androidx.compose.ui.Modifier.Companion.getHighSpeedVideoSizes;

    boolean all(kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Element, java.lang.Boolean> predicate);

    boolean any(kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Element, java.lang.Boolean> predicate);

    <R> R foldIn(R initial, kotlin.jvm.functions.Function2<? super R, ? super androidx.compose.ui.Modifier.Element, ? extends R> operation);

    <R> R foldOut(R initial, kotlin.jvm.functions.Function2<? super androidx.compose.ui.Modifier.Element, ? super R, ? extends R> operation);

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static androidx.compose.ui.Modifier then(androidx.compose.ui.Modifier modifier, androidx.compose.ui.Modifier modifier2) {
            return androidx.compose.ui.Modifier.super.then(modifier2);
        }
    }

    default androidx.compose.ui.Modifier then(androidx.compose.ui.Modifier other) {
        return other == INSTANCE ? this : new androidx.compose.ui.CombinedModifier(this, other);
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J7\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0007J#\u0010\f\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000e\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\u000e\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/Modifier$Element;", "Landroidx/compose/ui/Modifier;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "initial", "Lkotlin/Function2;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "foldIn", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldOut", "Lkotlin/Function1;", "", "predicate", "any", "(Lkotlin/jvm/functions/Function1;)Z", "all"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Element extends androidx.compose.ui.Modifier {

        @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class DefaultImpls {
            @java.lang.Deprecated
            public static androidx.compose.ui.Modifier then(androidx.compose.ui.Modifier.Element element, androidx.compose.ui.Modifier modifier) {
                return androidx.compose.ui.Modifier.Element.super.then(modifier);
            }

            @java.lang.Deprecated
            public static <R> R foldIn(androidx.compose.ui.Modifier.Element element, R r, kotlin.jvm.functions.Function2<? super R, ? super androidx.compose.ui.Modifier.Element, ? extends R> function2) {
                return (R) androidx.compose.ui.Modifier.Element.super.foldIn(r, function2);
            }

            @java.lang.Deprecated
            public static <R> R foldOut(androidx.compose.ui.Modifier.Element element, R r, kotlin.jvm.functions.Function2<? super androidx.compose.ui.Modifier.Element, ? super R, ? extends R> function2) {
                return (R) androidx.compose.ui.Modifier.Element.super.foldOut(r, function2);
            }

            @java.lang.Deprecated
            public static boolean any(androidx.compose.ui.Modifier.Element element, kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Element, java.lang.Boolean> function1) {
                return androidx.compose.ui.Modifier.Element.super.any(function1);
            }

            @java.lang.Deprecated
            public static boolean all(androidx.compose.ui.Modifier.Element element, kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Element, java.lang.Boolean> function1) {
                return androidx.compose.ui.Modifier.Element.super.all(function1);
            }
        }

        @Override // androidx.compose.ui.Modifier
        default <R> R foldIn(R initial, kotlin.jvm.functions.Function2<? super R, ? super androidx.compose.ui.Modifier.Element, ? extends R> operation) {
            return operation.invoke(initial, this);
        }

        @Override // androidx.compose.ui.Modifier
        default <R> R foldOut(R initial, kotlin.jvm.functions.Function2<? super androidx.compose.ui.Modifier.Element, ? super R, ? extends R> operation) {
            return operation.invoke(this, initial);
        }

        @Override // androidx.compose.ui.Modifier
        default boolean any(kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Element, java.lang.Boolean> predicate) {
            return predicate.invoke(this).booleanValue();
        }

        @Override // androidx.compose.ui.Modifier
        default boolean all(kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Element, java.lang.Boolean> predicate) {
            return predicate.invoke(this).booleanValue();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u001d\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\u000e\u001a\u00020\u000b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0080\b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0003J\u001b\u0010\u0019\u001a\u00020\u00062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\u001c\u0010\u001dR*\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00008\u0007@BX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u0012\u0004\b#\u0010\u0003\u001a\u0004\b!\u0010\"R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0011\u0010*\u001a\u00020$8G¢\u0006\u0006\u001a\u0004\b(\u0010)R\"\u0010,\u001a\u00020+8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00102\u001a\u00020+8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b2\u0010-\u001a\u0004\b3\u0010/\"\u0004\b4\u00101R$\u00105\u001a\u0004\u0018\u00010\u00008\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b5\u0010 \u001a\u0004\b6\u0010\"\"\u0004\b7\u0010\u001dR$\u00108\u001a\u0004\u0018\u00010\u00008\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b8\u0010 \u001a\u0004\b9\u0010\"\"\u0004\b:\u0010\u001dR$\u0010<\u001a\u0004\u0018\u00010;8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR(\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\b\u0005\u0010B\u001a\u0004\bC\u0010DR\"\u0010E\u001a\u00020\u000b8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010K\u001a\u00020\u000b8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bK\u0010F\u001a\u0004\bL\u0010H\"\u0004\bM\u0010JR\u0016\u0010O\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bN\u0010FR\u0016\u0010%\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b'\u0010FR*\u0010P\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00178\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010\u001aR$\u0010U\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000b8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\bU\u0010F\u001a\u0004\bU\u0010HR\u001a\u0010X\u001a\u00020\u000b8WX\u0096\u0004¢\u0006\f\u0012\u0004\bW\u0010\u0003\u001a\u0004\bV\u0010H"}, d2 = {"Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DelegatableNode;", "<init>", "()V", "Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "", "updateCoordinator$ui", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "Landroidx/compose/ui/node/NodeKind;", "kind", "", "isKind-H91voCI$ui", "(I)Z", "isKind", "markAsAttached$ui", "runAttachLifecycle$ui", "runDetachLifecycle$ui", "markAsDetached$ui", "reset$ui", "onAttach", "onDetach", "onReset", "Lkotlin/Function0;", "effect", "sideEffect", "(Lkotlin/jvm/functions/Function0;)V", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Owner, "setAsDelegateTo$ui", "(Landroidx/compose/ui/Modifier$Node;)V", "p0", "node", "Landroidx/compose/ui/Modifier$Node;", "getNode", "()Landroidx/compose/ui/Modifier$Node;", "getNode$annotations", "Lkotlinx/coroutines/CoroutineScope;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/CoroutineScope;", "getHighSpeedVideoSizes", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "", "kindSet", com.visa.cbp.getEncExpo.warmup, "getKindSet$ui", "()I", "setKindSet$ui", "(I)V", "aggregateChildKindSet", "getAggregateChildKindSet$ui", "setAggregateChildKindSet$ui", "parent", "getParent$ui", "setParent$ui", "child", "getChild$ui", "setChild$ui", "Landroidx/compose/ui/node/ObserverNodeOwnerScope;", "ownerScope", "Landroidx/compose/ui/node/ObserverNodeOwnerScope;", "getOwnerScope$ui", "()Landroidx/compose/ui/node/ObserverNodeOwnerScope;", "setOwnerScope$ui", "(Landroidx/compose/ui/node/ObserverNodeOwnerScope;)V", "Landroidx/compose/ui/node/NodeCoordinator;", "getCoordinator$ui", "()Landroidx/compose/ui/node/NodeCoordinator;", "insertedNodeAwaitingAttachForInvalidation", "Z", "getInsertedNodeAwaitingAttachForInvalidation$ui", "()Z", "setInsertedNodeAwaitingAttachForInvalidation$ui", "(Z)V", "updatedNodeAwaitingAttachForInvalidation", "getUpdatedNodeAwaitingAttachForInvalidation$ui", "setUpdatedNodeAwaitingAttachForInvalidation$ui", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "detachedListener", "Lkotlin/jvm/functions/Function0;", "getDetachedListener$ui", "()Lkotlin/jvm/functions/Function0;", "setDetachedListener$ui", "isAttached", "getShouldAutoInvalidate", "getShouldAutoInvalidate$annotations", "shouldAutoInvalidate"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Node implements androidx.compose.ui.node.DelegatableNode {
        public static final int $stable = 8;
        private androidx.compose.ui.Modifier.Node child;
        private androidx.compose.ui.node.NodeCoordinator coordinator;
        private kotlin.jvm.functions.Function0<kotlin.Unit> detachedListener;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private boolean Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private kotlinx.coroutines.CoroutineScope getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private boolean getHighSpeedVideoFpsRangesFor;
        private boolean insertedNodeAwaitingAttachForInvalidation;
        private boolean isAttached;
        private int kindSet;
        private androidx.compose.ui.node.ObserverNodeOwnerScope ownerScope;
        private androidx.compose.ui.Modifier.Node parent;
        private boolean updatedNodeAwaitingAttachForInvalidation;
        private androidx.compose.ui.Modifier.Node node = this;
        private int aggregateChildKindSet = -1;

        public static /* synthetic */ void getNode$annotations() {
        }

        public static /* synthetic */ void getShouldAutoInvalidate$annotations() {
        }

        public boolean getShouldAutoInvalidate() {
            return true;
        }

        public void onAttach() {
        }

        public void onDetach() {
        }

        public void onReset() {
        }

        @Override // androidx.compose.ui.node.DelegatableNode
        public final androidx.compose.ui.Modifier.Node getNode() {
            return this.node;
        }

        public final kotlinx.coroutines.CoroutineScope getCoroutineScope() {
            kotlinx.coroutines.CoroutineScope coroutineScope = this.getHighSpeedVideoSizes;
            if (coroutineScope != null) {
                return coroutineScope;
            }
            androidx.compose.ui.Modifier.Node node = this;
            kotlinx.coroutines.CoroutineScope CoroutineScope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(androidx.compose.ui.node.DelegatableNodeKt.requireOwner(node).getCoroutineContext().plus(kotlinx.coroutines.JobKt.Job((kotlinx.coroutines.Job) androidx.compose.ui.node.DelegatableNodeKt.requireOwner(node).getCoroutineContext().get(kotlinx.coroutines.Job.INSTANCE))));
            this.getHighSpeedVideoSizes = CoroutineScope;
            return CoroutineScope;
        }

        /* renamed from: getKindSet$ui, reason: from getter */
        public final int getKindSet() {
            return this.kindSet;
        }

        public final void setKindSet$ui(int i) {
            this.kindSet = i;
        }

        /* renamed from: getAggregateChildKindSet$ui, reason: from getter */
        public final int getAggregateChildKindSet() {
            return this.aggregateChildKindSet;
        }

        public final void setAggregateChildKindSet$ui(int i) {
            this.aggregateChildKindSet = i;
        }

        /* renamed from: getParent$ui, reason: from getter */
        public final androidx.compose.ui.Modifier.Node getParent() {
            return this.parent;
        }

        public final void setParent$ui(androidx.compose.ui.Modifier.Node node) {
            this.parent = node;
        }

        /* renamed from: getChild$ui, reason: from getter */
        public final androidx.compose.ui.Modifier.Node getChild() {
            return this.child;
        }

        public final void setChild$ui(androidx.compose.ui.Modifier.Node node) {
            this.child = node;
        }

        /* renamed from: getOwnerScope$ui, reason: from getter */
        public final androidx.compose.ui.node.ObserverNodeOwnerScope getOwnerScope() {
            return this.ownerScope;
        }

        public final void setOwnerScope$ui(androidx.compose.ui.node.ObserverNodeOwnerScope observerNodeOwnerScope) {
            this.ownerScope = observerNodeOwnerScope;
        }

        /* renamed from: getCoordinator$ui, reason: from getter */
        public final androidx.compose.ui.node.NodeCoordinator getCoordinator() {
            return this.coordinator;
        }

        /* renamed from: getInsertedNodeAwaitingAttachForInvalidation$ui, reason: from getter */
        public final boolean getInsertedNodeAwaitingAttachForInvalidation() {
            return this.insertedNodeAwaitingAttachForInvalidation;
        }

        public final void setInsertedNodeAwaitingAttachForInvalidation$ui(boolean z) {
            this.insertedNodeAwaitingAttachForInvalidation = z;
        }

        /* renamed from: getUpdatedNodeAwaitingAttachForInvalidation$ui, reason: from getter */
        public final boolean getUpdatedNodeAwaitingAttachForInvalidation() {
            return this.updatedNodeAwaitingAttachForInvalidation;
        }

        public final void setUpdatedNodeAwaitingAttachForInvalidation$ui(boolean z) {
            this.updatedNodeAwaitingAttachForInvalidation = z;
        }

        public final kotlin.jvm.functions.Function0<kotlin.Unit> getDetachedListener$ui() {
            return this.detachedListener;
        }

        public final void setDetachedListener$ui(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
            this.detachedListener = function0;
        }

        /* renamed from: isAttached, reason: from getter */
        public final boolean getIsAttached() {
            return this.isAttached;
        }

        public void updateCoordinator$ui(androidx.compose.ui.node.NodeCoordinator coordinator) {
            this.coordinator = coordinator;
        }

        /* renamed from: isKind-H91voCI$ui, reason: not valid java name */
        public final boolean m5515isKindH91voCI$ui(int kind) {
            return (kind & getKindSet()) != 0;
        }

        public void markAsAttached$ui() {
            if (this.isAttached) {
                androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("node attached multiple times");
            }
            if (this.coordinator == null) {
                androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("attach invoked on a node without a coordinator");
            }
            this.isAttached = true;
            this.Camera2StreamConfigurationMap = true;
        }

        public void runAttachLifecycle$ui() {
            if (!this.isAttached) {
                androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("Must run markAsAttached() prior to runAttachLifecycle");
            }
            if (!this.Camera2StreamConfigurationMap) {
                androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("Must run runAttachLifecycle() only once after markAsAttached()");
            }
            this.Camera2StreamConfigurationMap = false;
            onAttach();
            this.getHighSpeedVideoFpsRangesFor = true;
        }

        public void runDetachLifecycle$ui() {
            if (!this.isAttached) {
                androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("node detached multiple times");
            }
            if (this.coordinator == null) {
                androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("detach invoked on a node without a coordinator");
            }
            if (!this.getHighSpeedVideoFpsRangesFor) {
                androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
            }
            this.getHighSpeedVideoFpsRangesFor = false;
            kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.detachedListener;
            if (function0 != null) {
                function0.invoke();
            }
            onDetach();
        }

        public void markAsDetached$ui() {
            if (!this.isAttached) {
                androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("Cannot detach a node that is not attached");
            }
            if (this.Camera2StreamConfigurationMap) {
                androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("Must run runAttachLifecycle() before markAsDetached()");
            }
            if (this.getHighSpeedVideoFpsRangesFor) {
                androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("Must run runDetachLifecycle() before markAsDetached()");
            }
            this.isAttached = false;
            kotlinx.coroutines.CoroutineScope coroutineScope = this.getHighSpeedVideoSizes;
            if (coroutineScope != null) {
                kotlinx.coroutines.CoroutineScopeKt.cancel(coroutineScope, new androidx.compose.ui.ModifierNodeDetachedCancellationException());
                this.getHighSpeedVideoSizes = null;
            }
        }

        public void reset$ui() {
            if (!this.isAttached) {
                androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("reset() called on an unattached node");
            }
            onReset();
        }

        public final void sideEffect(kotlin.jvm.functions.Function0<kotlin.Unit> effect) {
            androidx.compose.ui.node.DelegatableNodeKt.requireOwner(this).registerOnEndApplyChangesListener(effect);
        }

        public void setAsDelegateTo$ui(androidx.compose.ui.Modifier.Node owner) {
            this.node = owner;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u00028\u00002\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ7\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u00028\u00002\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ#\u0010\u000f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0011\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0096\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/compose/ui/Modifier$Companion;", "Landroidx/compose/ui/Modifier;", "<init>", "()V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "initial", "Lkotlin/Function2;", "Landroidx/compose/ui/Modifier$Element;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "foldIn", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldOut", "Lkotlin/Function1;", "", "predicate", "any", "(Lkotlin/jvm/functions/Function1;)Z", "all", "other", "then", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion implements androidx.compose.ui.Modifier {
        static final /* synthetic */ androidx.compose.ui.Modifier.Companion getHighSpeedVideoSizes = new androidx.compose.ui.Modifier.Companion();

        @Override // androidx.compose.ui.Modifier
        public final boolean all(kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Element, java.lang.Boolean> predicate) {
            return true;
        }

        @Override // androidx.compose.ui.Modifier
        public final boolean any(kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Element, java.lang.Boolean> predicate) {
            return false;
        }

        @Override // androidx.compose.ui.Modifier
        public final <R> R foldIn(R initial, kotlin.jvm.functions.Function2<? super R, ? super androidx.compose.ui.Modifier.Element, ? extends R> operation) {
            return initial;
        }

        @Override // androidx.compose.ui.Modifier
        public final <R> R foldOut(R initial, kotlin.jvm.functions.Function2<? super androidx.compose.ui.Modifier.Element, ? super R, ? extends R> operation) {
            return initial;
        }

        @Override // androidx.compose.ui.Modifier
        public final androidx.compose.ui.Modifier then(androidx.compose.ui.Modifier other) {
            return other;
        }

        private Companion() {
        }

        public final java.lang.String toString() {
            return "Modifier";
        }
    }
}
