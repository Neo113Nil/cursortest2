package androidx.compose.ui;

/* compiled from: Modifier.kt */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u0000 \u00112\u00020\u0001:\u0003\u0011\u0012\u0013J\u001c\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H&J\u001c\u0010\u0007\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H&J5\u0010\b\u001a\u0002H\t\"\u0004\b\u0000\u0010\t2\u0006\u0010\n\u001a\u0002H\t2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\t0\fH&¢\u0006\u0002\u0010\rJ5\u0010\u000e\u001a\u0002H\t\"\u0004\b\u0000\u0010\t2\u0006\u0010\n\u001a\u0002H\t2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u0002H\t0\fH&¢\u0006\u0002\u0010\rJ\u0011\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0096\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "all", "", "predicate", "Lkotlin/Function1;", "Landroidx/compose/ui/Modifier$Element;", "any", "foldIn", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldOut", "then", "other", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "Element", "Node", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Modifier {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.Modifier.Companion INSTANCE = androidx.compose.ui.Modifier.Companion.$$INSTANCE;

    boolean all(kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Element, java.lang.Boolean> predicate);

    boolean any(kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Element, java.lang.Boolean> predicate);

    <R> R foldIn(R initial, kotlin.jvm.functions.Function2<? super R, ? super androidx.compose.ui.Modifier.Element, ? extends R> operation);

    <R> R foldOut(R initial, kotlin.jvm.functions.Function2<? super androidx.compose.ui.Modifier.Element, ? super R, ? extends R> operation);

    androidx.compose.ui.Modifier then(androidx.compose.ui.Modifier other);

    /* compiled from: Modifier.kt */
    /* renamed from: androidx.compose.ui.Modifier$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        static {
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
        }

        public static androidx.compose.ui.Modifier $default$then(androidx.compose.ui.Modifier _this, androidx.compose.ui.Modifier modifier) {
            return modifier == androidx.compose.ui.Modifier.INSTANCE ? _this : new androidx.compose.ui.CombinedModifier(_this, modifier);
        }
    }

    /* compiled from: Modifier.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static androidx.compose.ui.Modifier then(androidx.compose.ui.Modifier modifier, androidx.compose.ui.Modifier modifier2) {
            return androidx.compose.ui.Modifier.CC.$default$then(modifier, modifier2);
        }
    }

    /* compiled from: Modifier.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0005H\u0016J\u001c\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0005H\u0016J5\u0010\u0007\u001a\u0002H\b\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u0002H\b2\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u0002H\b0\u000bH\u0016¢\u0006\u0002\u0010\fJ5\u0010\r\u001a\u0002H\b\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u0002H\b2\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\b0\u000bH\u0016¢\u0006\u0002\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/Modifier$Element;", "Landroidx/compose/ui/Modifier;", "all", "", "predicate", "Lkotlin/Function1;", "any", "foldIn", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldOut", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Element extends androidx.compose.ui.Modifier {
        @Override // androidx.compose.ui.Modifier
        boolean all(kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Element, java.lang.Boolean> predicate);

        @Override // androidx.compose.ui.Modifier
        boolean any(kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Element, java.lang.Boolean> predicate);

        @Override // androidx.compose.ui.Modifier
        <R> R foldIn(R initial, kotlin.jvm.functions.Function2<? super R, ? super androidx.compose.ui.Modifier.Element, ? extends R> operation);

        @Override // androidx.compose.ui.Modifier
        <R> R foldOut(R initial, kotlin.jvm.functions.Function2<? super androidx.compose.ui.Modifier.Element, ? super R, ? extends R> operation);

        /* compiled from: Modifier.kt */
        /* renamed from: androidx.compose.ui.Modifier$Element$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static java.lang.Object $default$foldIn(androidx.compose.ui.Modifier.Element _this, java.lang.Object obj, kotlin.jvm.functions.Function2 function2) {
                return function2.invoke(obj, _this);
            }

            public static java.lang.Object $default$foldOut(androidx.compose.ui.Modifier.Element _this, java.lang.Object obj, kotlin.jvm.functions.Function2 function2) {
                return function2.invoke(_this, obj);
            }

            public static boolean $default$any(androidx.compose.ui.Modifier.Element _this, kotlin.jvm.functions.Function1 function1) {
                return ((java.lang.Boolean) function1.invoke(_this)).booleanValue();
            }

            public static boolean $default$all(androidx.compose.ui.Modifier.Element _this, kotlin.jvm.functions.Function1 function1) {
                return ((java.lang.Boolean) function1.invoke(_this)).booleanValue();
            }
        }

        /* compiled from: Modifier.kt */
        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class DefaultImpls {
            @java.lang.Deprecated
            public static androidx.compose.ui.Modifier then(androidx.compose.ui.Modifier.Element element, androidx.compose.ui.Modifier modifier) {
                return androidx.compose.ui.Modifier.CC.$default$then(element, modifier);
            }

            @java.lang.Deprecated
            public static <R> R foldIn(androidx.compose.ui.Modifier.Element element, R r, kotlin.jvm.functions.Function2<? super R, ? super androidx.compose.ui.Modifier.Element, ? extends R> function2) {
                return (R) androidx.compose.ui.Modifier.Element.CC.$default$foldIn(element, r, function2);
            }

            @java.lang.Deprecated
            public static <R> R foldOut(androidx.compose.ui.Modifier.Element element, R r, kotlin.jvm.functions.Function2<? super androidx.compose.ui.Modifier.Element, ? super R, ? extends R> function2) {
                return (R) androidx.compose.ui.Modifier.Element.CC.$default$foldOut(element, r, function2);
            }

            @java.lang.Deprecated
            public static boolean any(androidx.compose.ui.Modifier.Element element, kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Element, java.lang.Boolean> function1) {
                return androidx.compose.ui.Modifier.Element.CC.$default$any(element, function1);
            }

            @java.lang.Deprecated
            public static boolean all(androidx.compose.ui.Modifier.Element element, kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Element, java.lang.Boolean> function1) {
                return androidx.compose.ui.Modifier.Element.CC.$default$all(element, function1);
            }
        }
    }

    /* compiled from: Modifier.kt */
    @kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001f\u00106\u001a\u00020\u00182\n\u00107\u001a\u0006\u0012\u0002\b\u000308H\u0080\bø\u0001\u0000¢\u0006\u0004\b9\u0010:J\r\u0010;\u001a\u00020<H\u0010¢\u0006\u0002\b=J\r\u0010>\u001a\u00020<H\u0010¢\u0006\u0002\b?J\b\u0010@\u001a\u00020<H\u0016J\b\u0010A\u001a\u00020<H\u0016J\b\u0010B\u001a\u00020<H\u0016J\r\u0010C\u001a\u00020<H\u0010¢\u0006\u0002\bDJ\r\u0010E\u001a\u00020<H\u0010¢\u0006\u0002\bFJ\r\u0010G\u001a\u00020<H\u0010¢\u0006\u0002\bHJ\u0015\u0010I\u001a\u00020<2\u0006\u0010J\u001a\u00020\u0000H\u0000¢\u0006\u0002\bKJ\u0016\u0010L\u001a\u00020<2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020<0NH\u0007J\u0017\u0010O\u001a\u00020<2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0010¢\u0006\u0002\bPR\u001a\u0010\u0003\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0000X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u0018@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR$\u0010!\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000@BX\u0086\u000e¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0002\u001a\u0004\b#\u0010\u000bR\u000e\u0010$\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010&\u001a\u0004\u0018\u00010'X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001c\u0010,\u001a\u0004\u0018\u00010\u0000X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u000b\"\u0004\b.\u0010\rR\u0010\u0010/\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u00100\u001a\u00020\u00188VX\u0096\u0004¢\u0006\f\u0012\u0004\b1\u0010\u0002\u001a\u0004\b2\u0010\u001aR\u001a\u00103\u001a\u00020\u0018X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001a\"\u0004\b5\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006Q"}, d2 = {"Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DelegatableNode;", "()V", "aggregateChildKindSet", "", "getAggregateChildKindSet$ui_release", "()I", "setAggregateChildKindSet$ui_release", "(I)V", "child", "getChild$ui_release", "()Landroidx/compose/ui/Modifier$Node;", "setChild$ui_release", "(Landroidx/compose/ui/Modifier$Node;)V", "<set-?>", "Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "getCoordinator$ui_release", "()Landroidx/compose/ui/node/NodeCoordinator;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "insertedNodeAwaitingAttachForInvalidation", "", "getInsertedNodeAwaitingAttachForInvalidation$ui_release", "()Z", "setInsertedNodeAwaitingAttachForInvalidation$ui_release", "(Z)V", "isAttached", "kindSet", "getKindSet$ui_release", "setKindSet$ui_release", "node", "getNode$annotations", "getNode", "onAttachRunExpected", "onDetachRunExpected", "ownerScope", "Landroidx/compose/ui/node/ObserverNodeOwnerScope;", "getOwnerScope$ui_release", "()Landroidx/compose/ui/node/ObserverNodeOwnerScope;", "setOwnerScope$ui_release", "(Landroidx/compose/ui/node/ObserverNodeOwnerScope;)V", "parent", "getParent$ui_release", "setParent$ui_release", "scope", "shouldAutoInvalidate", "getShouldAutoInvalidate$annotations", "getShouldAutoInvalidate", "updatedNodeAwaitingAttachForInvalidation", "getUpdatedNodeAwaitingAttachForInvalidation$ui_release", "setUpdatedNodeAwaitingAttachForInvalidation$ui_release", "isKind", "kind", "Landroidx/compose/ui/node/NodeKind;", "isKind-H91voCI$ui_release", "(I)Z", "markAsAttached", "", "markAsAttached$ui_release", "markAsDetached", "markAsDetached$ui_release", "onAttach", "onDetach", "onReset", "reset", "reset$ui_release", "runAttachLifecycle", "runAttachLifecycle$ui_release", "runDetachLifecycle", "runDetachLifecycle$ui_release", "setAsDelegateTo", "owner", "setAsDelegateTo$ui_release", "sideEffect", "effect", "Lkotlin/Function0;", "updateCoordinator", "updateCoordinator$ui_release", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Node implements androidx.compose.ui.node.DelegatableNode {
        public static final int $stable = 8;
        private androidx.compose.ui.Modifier.Node child;
        private androidx.compose.ui.node.NodeCoordinator coordinator;
        private boolean insertedNodeAwaitingAttachForInvalidation;
        private boolean isAttached;
        private int kindSet;
        private boolean onAttachRunExpected;
        private boolean onDetachRunExpected;
        private androidx.compose.ui.node.ObserverNodeOwnerScope ownerScope;
        private androidx.compose.ui.Modifier.Node parent;
        private kotlinx.coroutines.CoroutineScope scope;
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
            kotlinx.coroutines.CoroutineScope coroutineScope = this.scope;
            if (coroutineScope != null) {
                return coroutineScope;
            }
            androidx.compose.ui.Modifier.Node node = this;
            kotlinx.coroutines.CoroutineScope CoroutineScope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(androidx.compose.ui.node.DelegatableNodeKt.requireOwner(node).getCoroutineContext().plus(kotlinx.coroutines.JobKt.Job((kotlinx.coroutines.Job) androidx.compose.ui.node.DelegatableNodeKt.requireOwner(node).getCoroutineContext().get(kotlinx.coroutines.Job.INSTANCE))));
            this.scope = CoroutineScope;
            return CoroutineScope;
        }

        /* renamed from: getKindSet$ui_release, reason: from getter */
        public final int getKindSet() {
            return this.kindSet;
        }

        public final void setKindSet$ui_release(int i) {
            this.kindSet = i;
        }

        /* renamed from: getAggregateChildKindSet$ui_release, reason: from getter */
        public final int getAggregateChildKindSet() {
            return this.aggregateChildKindSet;
        }

        public final void setAggregateChildKindSet$ui_release(int i) {
            this.aggregateChildKindSet = i;
        }

        /* renamed from: getParent$ui_release, reason: from getter */
        public final androidx.compose.ui.Modifier.Node getParent() {
            return this.parent;
        }

        public final void setParent$ui_release(androidx.compose.ui.Modifier.Node node) {
            this.parent = node;
        }

        /* renamed from: getChild$ui_release, reason: from getter */
        public final androidx.compose.ui.Modifier.Node getChild() {
            return this.child;
        }

        public final void setChild$ui_release(androidx.compose.ui.Modifier.Node node) {
            this.child = node;
        }

        /* renamed from: getOwnerScope$ui_release, reason: from getter */
        public final androidx.compose.ui.node.ObserverNodeOwnerScope getOwnerScope() {
            return this.ownerScope;
        }

        public final void setOwnerScope$ui_release(androidx.compose.ui.node.ObserverNodeOwnerScope observerNodeOwnerScope) {
            this.ownerScope = observerNodeOwnerScope;
        }

        /* renamed from: getCoordinator$ui_release, reason: from getter */
        public final androidx.compose.ui.node.NodeCoordinator getCoordinator() {
            return this.coordinator;
        }

        /* renamed from: getInsertedNodeAwaitingAttachForInvalidation$ui_release, reason: from getter */
        public final boolean getInsertedNodeAwaitingAttachForInvalidation() {
            return this.insertedNodeAwaitingAttachForInvalidation;
        }

        public final void setInsertedNodeAwaitingAttachForInvalidation$ui_release(boolean z) {
            this.insertedNodeAwaitingAttachForInvalidation = z;
        }

        /* renamed from: getUpdatedNodeAwaitingAttachForInvalidation$ui_release, reason: from getter */
        public final boolean getUpdatedNodeAwaitingAttachForInvalidation() {
            return this.updatedNodeAwaitingAttachForInvalidation;
        }

        public final void setUpdatedNodeAwaitingAttachForInvalidation$ui_release(boolean z) {
            this.updatedNodeAwaitingAttachForInvalidation = z;
        }

        /* renamed from: isAttached, reason: from getter */
        public final boolean getIsAttached() {
            return this.isAttached;
        }

        public void updateCoordinator$ui_release(androidx.compose.ui.node.NodeCoordinator coordinator) {
            this.coordinator = coordinator;
        }

        /* renamed from: isKind-H91voCI$ui_release, reason: not valid java name */
        public final boolean m1749isKindH91voCI$ui_release(int kind) {
            return (kind & getKindSet()) != 0;
        }

        public void markAsAttached$ui_release() {
            if (!(!this.isAttached)) {
                throw new java.lang.IllegalStateException("node attached multiple times".toString());
            }
            if (this.coordinator == null) {
                throw new java.lang.IllegalStateException("attach invoked on a node without a coordinator".toString());
            }
            this.isAttached = true;
            this.onAttachRunExpected = true;
        }

        public void runAttachLifecycle$ui_release() {
            if (!this.isAttached) {
                throw new java.lang.IllegalStateException("Must run markAsAttached() prior to runAttachLifecycle".toString());
            }
            if (!this.onAttachRunExpected) {
                throw new java.lang.IllegalStateException("Must run runAttachLifecycle() only once after markAsAttached()".toString());
            }
            this.onAttachRunExpected = false;
            onAttach();
            this.onDetachRunExpected = true;
        }

        public void runDetachLifecycle$ui_release() {
            if (!this.isAttached) {
                throw new java.lang.IllegalStateException("node detached multiple times".toString());
            }
            if (this.coordinator == null) {
                throw new java.lang.IllegalStateException("detach invoked on a node without a coordinator".toString());
            }
            if (!this.onDetachRunExpected) {
                throw new java.lang.IllegalStateException("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()".toString());
            }
            this.onDetachRunExpected = false;
            onDetach();
        }

        public void markAsDetached$ui_release() {
            if (!this.isAttached) {
                throw new java.lang.IllegalStateException("Cannot detach a node that is not attached".toString());
            }
            if (!(!this.onAttachRunExpected)) {
                throw new java.lang.IllegalStateException("Must run runAttachLifecycle() before markAsDetached()".toString());
            }
            if (!(!this.onDetachRunExpected)) {
                throw new java.lang.IllegalStateException("Must run runDetachLifecycle() before markAsDetached()".toString());
            }
            this.isAttached = false;
            kotlinx.coroutines.CoroutineScope coroutineScope = this.scope;
            if (coroutineScope != null) {
                kotlinx.coroutines.CoroutineScopeKt.cancel(coroutineScope, new androidx.compose.ui.ModifierNodeDetachedCancellationException());
                this.scope = null;
            }
        }

        public void reset$ui_release() {
            if (!this.isAttached) {
                throw new java.lang.IllegalStateException("reset() called on an unattached node".toString());
            }
            onReset();
        }

        public final void sideEffect(kotlin.jvm.functions.Function0<kotlin.Unit> effect) {
            androidx.compose.ui.node.DelegatableNodeKt.requireOwner(this).registerOnEndApplyChangesListener(effect);
        }

        public final void setAsDelegateTo$ui_release(androidx.compose.ui.Modifier.Node owner) {
            this.node = owner;
        }
    }

    /* compiled from: Modifier.kt */
    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006H\u0016J\u001c\u0010\b\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006H\u0016J5\u0010\t\u001a\u0002H\n\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000b\u001a\u0002H\n2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002H\n0\rH\u0016¢\u0006\u0002\u0010\u000eJ5\u0010\u000f\u001a\u0002H\n\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000b\u001a\u0002H\n2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u0002H\n0\rH\u0016¢\u0006\u0002\u0010\u000eJ\u0011\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0096\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0016¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/Modifier$Companion;", "Landroidx/compose/ui/Modifier;", "()V", "all", "", "predicate", "Lkotlin/Function1;", "Landroidx/compose/ui/Modifier$Element;", "any", "foldIn", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldOut", "then", "other", "toString", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion implements androidx.compose.ui.Modifier {
        static final /* synthetic */ androidx.compose.ui.Modifier.Companion $$INSTANCE = new androidx.compose.ui.Modifier.Companion();

        @Override // androidx.compose.ui.Modifier
        public boolean all(kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Element, java.lang.Boolean> predicate) {
            return true;
        }

        @Override // androidx.compose.ui.Modifier
        public boolean any(kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Element, java.lang.Boolean> predicate) {
            return false;
        }

        @Override // androidx.compose.ui.Modifier
        public <R> R foldIn(R initial, kotlin.jvm.functions.Function2<? super R, ? super androidx.compose.ui.Modifier.Element, ? extends R> operation) {
            return initial;
        }

        @Override // androidx.compose.ui.Modifier
        public <R> R foldOut(R initial, kotlin.jvm.functions.Function2<? super androidx.compose.ui.Modifier.Element, ? super R, ? extends R> operation) {
            return initial;
        }

        @Override // androidx.compose.ui.Modifier
        public androidx.compose.ui.Modifier then(androidx.compose.ui.Modifier other) {
            return other;
        }

        private Companion() {
        }

        public java.lang.String toString() {
            return "Modifier";
        }
    }
}
