package androidx.compose.runtime.changelist;

/* compiled from: ComposerChangeListWriter.kt */
@kotlin.Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 |2\u00020\u0001:\u0001|B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001e\u0010!\u001a\u00020\"2\u000e\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010$2\u0006\u0010%\u001a\u00020&J(\u0010'\u001a\u00020\"2\b\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-J\u0006\u0010/\u001a\u00020\"J\u0016\u00100\u001a\u00020\"2\u0006\u00101\u001a\u00020&2\u0006\u00102\u001a\u000203J\"\u00104\u001a\u00020\"2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\"062\u0006\u00108\u001a\u000207J\u0006\u00109\u001a\u00020\"J\u0006\u0010:\u001a\u00020\"J\u0006\u0010;\u001a\u00020\"J\u0016\u0010<\u001a\u00020\"2\u0006\u0010=\u001a\u00020\u00122\u0006\u0010>\u001a\u00020\u0012J\u0006\u0010?\u001a\u00020\"J\u0010\u0010@\u001a\u00020\"2\u0006\u00102\u001a\u000203H\u0002J\b\u0010A\u001a\u00020\"H\u0002J\u0006\u0010B\u001a\u00020\"J\u001a\u0010C\u001a\u00020\"2\u0006\u0010D\u001a\u00020\u00052\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&J\u0016\u0010E\u001a\u00020\"2\u0006\u00102\u001a\u0002032\u0006\u0010,\u001a\u00020FJ\u001e\u0010E\u001a\u00020\"2\u0006\u00102\u001a\u0002032\u0006\u0010,\u001a\u00020F2\u0006\u0010G\u001a\u00020HJ\u000e\u0010I\u001a\u00020\"2\u0006\u0010J\u001a\u00020\u0012J\u0010\u0010K\u001a\u00020\"2\b\u0010L\u001a\u0004\u0018\u00010\u0001J\u001e\u0010M\u001a\u00020\"2\u0006\u0010,\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\u00122\u0006\u0010N\u001a\u00020\u0012J\u000e\u0010O\u001a\u00020\"2\u0006\u0010P\u001a\u00020\u0012J\u000e\u0010Q\u001a\u00020\"2\u0006\u0010P\u001a\u00020\u0012J\u0006\u0010R\u001a\u00020\"J\b\u0010S\u001a\u00020\"H\u0002J\b\u0010T\u001a\u00020\"H\u0002J\b\u0010U\u001a\u00020\"H\u0002J\u0012\u0010V\u001a\u00020\"2\b\b\u0002\u0010W\u001a\u00020\fH\u0002J \u0010X\u001a\u00020\"2\u0006\u0010.\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\u00122\u0006\u0010N\u001a\u00020\u0012H\u0002J\b\u0010Y\u001a\u00020\"H\u0002J\u0012\u0010Z\u001a\u00020\"2\b\b\u0002\u0010[\u001a\u00020\fH\u0002J\u0018\u0010\\\u001a\u00020\"2\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0006\u0010]\u001a\u00020\"J\u0006\u0010^\u001a\u00020\"J\u001e\u0010_\u001a\u00020\"2\u0006\u00108\u001a\u00020`2\u0006\u0010*\u001a\u00020+2\u0006\u0010a\u001a\u00020-J\u000e\u0010b\u001a\u00020\"2\u0006\u0010c\u001a\u00020dJ\u0006\u0010e\u001a\u00020\"J\u0016\u0010f\u001a\u00020\"2\u0006\u0010=\u001a\u00020\u00122\u0006\u0010N\u001a\u00020\u0012J\u0006\u0010g\u001a\u00020\"J\u0006\u0010h\u001a\u00020\"J\u0014\u0010i\u001a\u00020\"2\f\u0010j\u001a\b\u0012\u0004\u0012\u00020\"0kJ\u0006\u0010l\u001a\u00020\"J\u0010\u0010m\u001a\u00020\"2\b\u0010n\u001a\u0004\u0018\u00010\u0001J>\u0010o\u001a\u00020\"\"\u0004\b\u0000\u0010p\"\u0004\b\u0001\u0010q2\u0006\u0010c\u001a\u0002Hq2\u001d\u0010r\u001a\u0019\u0012\u0004\u0012\u0002Hp\u0012\u0004\u0012\u0002Hq\u0012\u0004\u0012\u00020\"0s¢\u0006\u0002\bt¢\u0006\u0002\u0010uJ\u0018\u0010v\u001a\u00020\"2\b\u0010c\u001a\u0004\u0018\u00010\u00012\u0006\u0010w\u001a\u00020\u0012J\u0010\u0010x\u001a\u00020\"2\b\u0010L\u001a\u0004\u0018\u00010\u0001J\u001f\u0010y\u001a\u00020\"2\u0006\u0010z\u001a\u00020\u00052\f\u0010r\u001a\b\u0012\u0004\u0012\u00020\"0kH\u0086\bJ\u0017\u0010{\u001a\u00020\"2\f\u0010r\u001a\b\u0012\u0004\u0012\u00020\"0kH\u0086\bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006}"}, d2 = {"Landroidx/compose/runtime/changelist/ComposerChangeListWriter;", "", "composer", "Landroidx/compose/runtime/ComposerImpl;", "changeList", "Landroidx/compose/runtime/changelist/ChangeList;", "(Landroidx/compose/runtime/ComposerImpl;Landroidx/compose/runtime/changelist/ChangeList;)V", "getChangeList", "()Landroidx/compose/runtime/changelist/ChangeList;", "setChangeList", "(Landroidx/compose/runtime/changelist/ChangeList;)V", "implicitRootStart", "", "getImplicitRootStart", "()Z", "setImplicitRootStart", "(Z)V", "moveCount", "", "moveFrom", "moveTo", "pendingDownNodes", "Landroidx/compose/runtime/Stack;", "pendingUps", "reader", "Landroidx/compose/runtime/SlotReader;", "getReader", "()Landroidx/compose/runtime/SlotReader;", "removeFrom", "startedGroup", "startedGroups", "Landroidx/compose/runtime/IntStack;", "writersReaderDelta", "copyNodesToNewAnchorLocation", "", "nodes", "", "effectiveNodeIndex", "Landroidx/compose/runtime/internal/IntRef;", "copySlotTableToAnchorLocation", "resolvedState", "Landroidx/compose/runtime/MovableContentState;", "parentContext", "Landroidx/compose/runtime/CompositionContext;", com.google.firebase.messaging.Constants.MessagePayloadKeys.FROM, "Landroidx/compose/runtime/MovableContentStateReference;", "to", "deactivateCurrentGroup", "determineMovableContentNodeIndex", "effectiveNodeIndexOut", io.ktor.http.LinkHeader.Parameters.Anchor, "Landroidx/compose/runtime/Anchor;", "endCompositionScope", "action", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composition;", "composition", "endCurrentGroup", "endMovableContentPlacement", "endNodeMovement", "endNodeMovementAndDeleteNode", "nodeIndex", "group", "endRoot", "ensureGroupStarted", "ensureRootStarted", "finalizeComposition", "includeOperationsIn", "other", "insertSlots", "Landroidx/compose/runtime/SlotTable;", "fixups", "Landroidx/compose/runtime/changelist/FixupList;", "moveCurrentGroup", "offset", "moveDown", "node", "moveNode", com.helpshift.HelpshiftEvent.DATA_MESSAGE_COUNT, "moveReaderRelativeTo", com.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION, "moveReaderToAbsolute", "moveUp", "pushApplierOperationPreamble", "pushPendingUpsAndDowns", "pushSlotEditingOperationPreamble", "pushSlotTableOperationPreamble", "useParentSlot", "realizeMoveNode", "realizeNodeMovementOperations", "realizeOperationLocation", "forParent", "realizeRemoveNode", "recordSlotEditing", "releaseMovableContent", "releaseMovableGroupAtCurrent", "Landroidx/compose/runtime/ControlledComposition;", "reference", "remember", "value", "Landroidx/compose/runtime/RememberObserver;", "removeCurrentGroup", "removeNode", "resetSlots", "resetTransientState", "sideEffect", "effect", "Lkotlin/Function0;", "skipToEndOfCurrentGroup", "updateAuxData", "data", "updateNode", "T", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "block", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "updateValue", "groupSlotIndex", "useNode", "withChangeList", "newChangeList", "withoutImplicitRootStart", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ComposerChangeListWriter {
    private static final int invalidGroupLocation = -2;
    private androidx.compose.runtime.changelist.ChangeList changeList;
    private final androidx.compose.runtime.ComposerImpl composer;
    private int moveCount;
    private int pendingUps;
    private boolean startedGroup;
    private int writersReaderDelta;
    public static final int $stable = 8;
    private final androidx.compose.runtime.IntStack startedGroups = new androidx.compose.runtime.IntStack();
    private boolean implicitRootStart = true;
    private androidx.compose.runtime.Stack<java.lang.Object> pendingDownNodes = new androidx.compose.runtime.Stack<>();
    private int removeFrom = -1;
    private int moveFrom = -1;
    private int moveTo = -1;

    public ComposerChangeListWriter(androidx.compose.runtime.ComposerImpl composerImpl, androidx.compose.runtime.changelist.ChangeList changeList) {
        this.composer = composerImpl;
        this.changeList = changeList;
    }

    public final androidx.compose.runtime.changelist.ChangeList getChangeList() {
        return this.changeList;
    }

    public final void setChangeList(androidx.compose.runtime.changelist.ChangeList changeList) {
        this.changeList = changeList;
    }

    private final androidx.compose.runtime.SlotReader getReader() {
        return this.composer.getReader();
    }

    public final boolean getImplicitRootStart() {
        return this.implicitRootStart;
    }

    public final void setImplicitRootStart(boolean z) {
        this.implicitRootStart = z;
    }

    private final void pushApplierOperationPreamble() {
        pushPendingUpsAndDowns();
    }

    private final void pushSlotEditingOperationPreamble() {
        realizeOperationLocation$default(this, false, 1, null);
        recordSlotEditing();
    }

    static /* synthetic */ void pushSlotTableOperationPreamble$default(androidx.compose.runtime.changelist.ComposerChangeListWriter composerChangeListWriter, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        composerChangeListWriter.pushSlotTableOperationPreamble(z);
    }

    private final void pushSlotTableOperationPreamble(boolean useParentSlot) {
        realizeOperationLocation(useParentSlot);
    }

    public final void moveReaderRelativeTo(int location) {
        this.writersReaderDelta += location - getReader().getCurrentGroup();
    }

    public final void moveReaderToAbsolute(int location) {
        this.writersReaderDelta = location;
    }

    public final void recordSlotEditing() {
        androidx.compose.runtime.SlotReader reader;
        int parent;
        if (getReader().getGroupsSize() <= 0 || this.startedGroups.peekOr(-2) == (parent = (reader = getReader()).getParent())) {
            return;
        }
        ensureRootStarted();
        if (parent > 0) {
            androidx.compose.runtime.Anchor anchor = reader.anchor(parent);
            this.startedGroups.push(parent);
            ensureGroupStarted(anchor);
        }
    }

    private final void ensureRootStarted() {
        if (this.startedGroup || !this.implicitRootStart) {
            return;
        }
        pushSlotTableOperationPreamble$default(this, false, 1, null);
        this.changeList.pushEnsureRootStarted();
        this.startedGroup = true;
    }

    private final void ensureGroupStarted(androidx.compose.runtime.Anchor anchor) {
        pushSlotTableOperationPreamble$default(this, false, 1, null);
        this.changeList.pushEnsureGroupStarted(anchor);
        this.startedGroup = true;
    }

    static /* synthetic */ void realizeOperationLocation$default(androidx.compose.runtime.changelist.ComposerChangeListWriter composerChangeListWriter, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        composerChangeListWriter.realizeOperationLocation(z);
    }

    private final void realizeOperationLocation(boolean forParent) {
        int parent = forParent ? getReader().getParent() : getReader().getCurrentGroup();
        int i = parent - this.writersReaderDelta;
        if (!(i >= 0)) {
            androidx.compose.runtime.ComposerKt.composeRuntimeError("Tried to seek backward".toString());
            throw new kotlin.KotlinNothingValueException();
        }
        if (i > 0) {
            this.changeList.pushAdvanceSlotsBy(i);
            this.writersReaderDelta = parent;
        }
    }

    public final void withChangeList(androidx.compose.runtime.changelist.ChangeList newChangeList, kotlin.jvm.functions.Function0<kotlin.Unit> block) {
        androidx.compose.runtime.changelist.ChangeList changeList = getChangeList();
        try {
            setChangeList(newChangeList);
            block.invoke();
        } finally {
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            setChangeList(changeList);
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        }
    }

    public final void withoutImplicitRootStart(kotlin.jvm.functions.Function0<kotlin.Unit> block) {
        boolean implicitRootStart = getImplicitRootStart();
        try {
            setImplicitRootStart(false);
            block.invoke();
        } finally {
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            setImplicitRootStart(implicitRootStart);
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        }
    }

    public final void remember(androidx.compose.runtime.RememberObserver value) {
        this.changeList.pushRemember(value);
    }

    public final void updateValue(java.lang.Object value, int groupSlotIndex) {
        pushSlotTableOperationPreamble(true);
        this.changeList.pushUpdateValue(value, groupSlotIndex);
    }

    public final void resetSlots() {
        this.changeList.pushResetSlots();
    }

    public final void updateAuxData(java.lang.Object data) {
        pushSlotTableOperationPreamble$default(this, false, 1, null);
        this.changeList.pushUpdateAuxData(data);
    }

    public final void endRoot() {
        if (this.startedGroup) {
            pushSlotTableOperationPreamble$default(this, false, 1, null);
            pushSlotTableOperationPreamble$default(this, false, 1, null);
            this.changeList.pushEndCurrentGroup();
            this.startedGroup = false;
        }
    }

    public final void endCurrentGroup() {
        int parent = getReader().getParent();
        if (this.startedGroups.peekOr(-1) <= parent) {
            if (this.startedGroups.peekOr(-1) == parent) {
                pushSlotTableOperationPreamble$default(this, false, 1, null);
                this.startedGroups.pop();
                this.changeList.pushEndCurrentGroup();
                return;
            }
            return;
        }
        androidx.compose.runtime.ComposerKt.composeRuntimeError("Missed recording an endGroup".toString());
        throw new kotlin.KotlinNothingValueException();
    }

    public final void skipToEndOfCurrentGroup() {
        this.changeList.pushSkipToEndOfCurrentGroup();
    }

    public final void removeCurrentGroup() {
        pushSlotEditingOperationPreamble();
        this.changeList.pushRemoveCurrentGroup();
        this.writersReaderDelta += getReader().getGroupSize();
    }

    public final void insertSlots(androidx.compose.runtime.Anchor anchor, androidx.compose.runtime.SlotTable from) {
        pushPendingUpsAndDowns();
        pushSlotEditingOperationPreamble();
        this.changeList.pushInsertSlots(anchor, from);
    }

    public final void insertSlots(androidx.compose.runtime.Anchor anchor, androidx.compose.runtime.SlotTable from, androidx.compose.runtime.changelist.FixupList fixups) {
        pushPendingUpsAndDowns();
        pushSlotEditingOperationPreamble();
        this.changeList.pushInsertSlots(anchor, from, fixups);
    }

    public final void moveCurrentGroup(int offset) {
        pushSlotEditingOperationPreamble();
        this.changeList.pushMoveCurrentGroup(offset);
    }

    public final void endCompositionScope(kotlin.jvm.functions.Function1<? super androidx.compose.runtime.Composition, kotlin.Unit> action, androidx.compose.runtime.Composition composition) {
        this.changeList.pushEndCompositionScope(action, composition);
    }

    public final void useNode(java.lang.Object node) {
        pushApplierOperationPreamble();
        this.changeList.pushUseNode(node);
    }

    public final <T, V> void updateNode(V value, kotlin.jvm.functions.Function2<? super T, ? super V, kotlin.Unit> block) {
        pushApplierOperationPreamble();
        this.changeList.pushUpdateNode(value, block);
    }

    public final void removeNode(int nodeIndex, int count) {
        if (count > 0) {
            if (!(nodeIndex >= 0)) {
                androidx.compose.runtime.ComposerKt.composeRuntimeError(("Invalid remove index " + nodeIndex).toString());
                throw new kotlin.KotlinNothingValueException();
            }
            if (this.removeFrom == nodeIndex) {
                this.moveCount += count;
                return;
            }
            realizeNodeMovementOperations();
            this.removeFrom = nodeIndex;
            this.moveCount = count;
        }
    }

    public final void moveNode(int from, int to, int count) {
        if (count > 0) {
            int i = this.moveCount;
            if (i > 0 && this.moveFrom == from - i && this.moveTo == to - i) {
                this.moveCount = i + count;
                return;
            }
            realizeNodeMovementOperations();
            this.moveFrom = from;
            this.moveTo = to;
            this.moveCount = count;
        }
    }

    public final void releaseMovableContent() {
        pushPendingUpsAndDowns();
        if (this.startedGroup) {
            skipToEndOfCurrentGroup();
            endRoot();
        }
    }

    public final void endNodeMovement() {
        realizeNodeMovementOperations();
    }

    public final void endNodeMovementAndDeleteNode(int nodeIndex, int group) {
        endNodeMovement();
        pushPendingUpsAndDowns();
        int nodeCount = getReader().isNode(group) ? 1 : getReader().nodeCount(group);
        if (nodeCount > 0) {
            removeNode(nodeIndex, nodeCount);
        }
    }

    private final void realizeNodeMovementOperations() {
        int i = this.moveCount;
        if (i > 0) {
            int i2 = this.removeFrom;
            if (i2 >= 0) {
                realizeRemoveNode(i2, i);
                this.removeFrom = -1;
            } else {
                realizeMoveNode(this.moveTo, this.moveFrom, i);
                this.moveFrom = -1;
                this.moveTo = -1;
            }
            this.moveCount = 0;
        }
    }

    private final void realizeRemoveNode(int removeFrom, int moveCount) {
        pushApplierOperationPreamble();
        this.changeList.pushRemoveNode(removeFrom, moveCount);
    }

    private final void realizeMoveNode(int to, int from, int count) {
        pushApplierOperationPreamble();
        this.changeList.pushMoveNode(to, from, count);
    }

    public final void moveUp() {
        if (this.pendingDownNodes.isNotEmpty()) {
            this.pendingDownNodes.pop();
        } else {
            this.pendingUps++;
        }
    }

    public final void moveDown(java.lang.Object node) {
        this.pendingDownNodes.push(node);
    }

    private final void pushPendingUpsAndDowns() {
        int i = this.pendingUps;
        if (i > 0) {
            this.changeList.pushUps(i);
            this.pendingUps = 0;
        }
        if (this.pendingDownNodes.isNotEmpty()) {
            this.changeList.pushDowns(this.pendingDownNodes.toArray());
            this.pendingDownNodes.clear();
        }
    }

    public final void sideEffect(kotlin.jvm.functions.Function0<kotlin.Unit> effect) {
        this.changeList.pushSideEffect(effect);
    }

    public final void determineMovableContentNodeIndex(androidx.compose.runtime.internal.IntRef effectiveNodeIndexOut, androidx.compose.runtime.Anchor anchor) {
        pushPendingUpsAndDowns();
        this.changeList.pushDetermineMovableContentNodeIndex(effectiveNodeIndexOut, anchor);
    }

    public final void copyNodesToNewAnchorLocation(java.util.List<? extends java.lang.Object> nodes, androidx.compose.runtime.internal.IntRef effectiveNodeIndex) {
        this.changeList.pushCopyNodesToNewAnchorLocation(nodes, effectiveNodeIndex);
    }

    public final void copySlotTableToAnchorLocation(androidx.compose.runtime.MovableContentState resolvedState, androidx.compose.runtime.CompositionContext parentContext, androidx.compose.runtime.MovableContentStateReference from, androidx.compose.runtime.MovableContentStateReference to) {
        this.changeList.pushCopySlotTableToAnchorLocation(resolvedState, parentContext, from, to);
    }

    public final void releaseMovableGroupAtCurrent(androidx.compose.runtime.ControlledComposition composition, androidx.compose.runtime.CompositionContext parentContext, androidx.compose.runtime.MovableContentStateReference reference) {
        this.changeList.pushReleaseMovableGroupAtCurrent(composition, parentContext, reference);
    }

    public final void endMovableContentPlacement() {
        this.changeList.pushEndMovableContentPlacement();
        this.writersReaderDelta = 0;
    }

    public static /* synthetic */ void includeOperationsIn$default(androidx.compose.runtime.changelist.ComposerChangeListWriter composerChangeListWriter, androidx.compose.runtime.changelist.ChangeList changeList, androidx.compose.runtime.internal.IntRef intRef, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            intRef = null;
        }
        composerChangeListWriter.includeOperationsIn(changeList, intRef);
    }

    public final void includeOperationsIn(androidx.compose.runtime.changelist.ChangeList other, androidx.compose.runtime.internal.IntRef effectiveNodeIndex) {
        this.changeList.pushExecuteOperationsIn(other, effectiveNodeIndex);
    }

    public final void finalizeComposition() {
        pushPendingUpsAndDowns();
        if (this.startedGroups.isEmpty()) {
            return;
        }
        androidx.compose.runtime.ComposerKt.composeRuntimeError("Missed recording an endGroup()".toString());
        throw new kotlin.KotlinNothingValueException();
    }

    public final void resetTransientState() {
        this.startedGroup = false;
        this.startedGroups.clear();
        this.writersReaderDelta = 0;
    }

    public final void deactivateCurrentGroup() {
        pushSlotTableOperationPreamble$default(this, false, 1, null);
        this.changeList.pushDeactivateCurrentGroup();
    }
}
