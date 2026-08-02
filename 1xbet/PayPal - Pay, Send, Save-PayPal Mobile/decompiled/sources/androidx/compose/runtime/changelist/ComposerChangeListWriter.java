package androidx.compose.runtime.changelist;

@kotlin.Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u0088\u00012\u00020\u0001:\u0002\u0088\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020$H\u0002J\u0012\u0010&\u001a\u00020$2\b\b\u0002\u0010'\u001a\u00020\u0011H\u0002J\u000e\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020\u001aJ\u000e\u0010*\u001a\u00020$2\u0006\u0010)\u001a\u00020\u001aJ\u0006\u0010+\u001a\u00020$J\b\u0010,\u001a\u00020$H\u0002J\u0010\u0010-\u001a\u00020$2\u0006\u0010.\u001a\u00020/H\u0002J\u0012\u00100\u001a\u00020$2\b\b\u0002\u00101\u001a\u00020\u0011H\u0002J\u001f\u00104\u001a\u00020$2\u0006\u00105\u001a\u00020\u00052\f\u00106\u001a\b\u0012\u0004\u0012\u00020$07H\u0086\bJ\u0017\u00108\u001a\u00020$2\f\u00106\u001a\b\u0012\u0004\u0012\u00020$07H\u0086\bJ\u000e\u00109\u001a\u00020$2\u0006\u0010:\u001a\u00020;J\u000e\u0010<\u001a\u00020$2\u0006\u0010=\u001a\u00020>J\u000e\u0010?\u001a\u00020$2\u0006\u0010=\u001a\u00020>J\u000e\u0010@\u001a\u00020$2\u0006\u0010=\u001a\u00020>J\u0018\u0010A\u001a\u00020$2\b\u0010:\u001a\u0004\u0018\u00010\u00012\u0006\u0010B\u001a\u00020\u001aJ \u0010C\u001a\u00020$2\b\u0010:\u001a\u0004\u0018\u00010\u00012\u0006\u0010.\u001a\u00020/2\u0006\u0010B\u001a\u00020\u001aJ\u0018\u0010D\u001a\u00020$2\u0006\u0010.\u001a\u00020/2\b\u0010:\u001a\u0004\u0018\u00010\u0001J\u000e\u0010E\u001a\u00020$2\u0006\u0010F\u001a\u00020\u001aJ\u0006\u0010G\u001a\u00020$J\u0010\u0010H\u001a\u00020$2\b\u0010I\u001a\u0004\u0018\u00010\u0001J\u0006\u0010J\u001a\u00020$J\u0006\u0010K\u001a\u00020$J\u0006\u0010L\u001a\u00020$J\u0006\u0010M\u001a\u00020$J\u0016\u0010N\u001a\u00020$2\u0006\u0010.\u001a\u00020/2\u0006\u0010O\u001a\u00020PJ\u001e\u0010N\u001a\u00020$2\u0006\u0010.\u001a\u00020/2\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020RJ\u000e\u0010S\u001a\u00020$2\u0006\u0010T\u001a\u00020\u001aJ\"\u0010U\u001a\u00020$2\u0012\u0010V\u001a\u000e\u0012\u0004\u0012\u00020X\u0012\u0004\u0012\u00020$0W2\u0006\u0010Y\u001a\u00020XJ\u0010\u0010Z\u001a\u00020$2\b\u0010[\u001a\u0004\u0018\u00010\u0001J>\u0010\\\u001a\u00020$\"\u0004\b\u0000\u0010]\"\u0004\b\u0001\u0010^2\u0006\u0010:\u001a\u0002H^2\u001d\u00106\u001a\u0019\u0012\u0004\u0012\u0002H]\u0012\u0004\u0012\u0002H^\u0012\u0004\u0012\u00020$0_¢\u0006\u0002\b`¢\u0006\u0002\u0010aJ\u0016\u0010b\u001a\u00020$2\u0006\u0010c\u001a\u00020\u001a2\u0006\u0010F\u001a\u00020\u001aJ\u001e\u0010d\u001a\u00020$2\u0006\u0010O\u001a\u00020\u001a2\u0006\u0010e\u001a\u00020\u001a2\u0006\u0010F\u001a\u00020\u001aJ\u0006\u0010f\u001a\u00020$J\u0006\u0010g\u001a\u00020$J\u0016\u0010h\u001a\u00020$2\u0006\u0010c\u001a\u00020\u001a2\u0006\u0010i\u001a\u00020\u001aJ\b\u0010j\u001a\u00020$H\u0002J\u0018\u0010k\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u001aH\u0002J \u0010l\u001a\u00020$2\u0006\u0010e\u001a\u00020\u001a2\u0006\u0010O\u001a\u00020\u001a2\u0006\u0010F\u001a\u00020\u001aH\u0002J\u0006\u0010m\u001a\u00020$J\u0010\u0010n\u001a\u00020$2\b\u0010[\u001a\u0004\u0018\u00010\u0001J\b\u0010o\u001a\u00020$H\u0002J\u0014\u0010p\u001a\u00020$2\f\u0010q\u001a\b\u0012\u0004\u0012\u00020$07J\u0016\u0010r\u001a\u00020$2\u0006\u0010s\u001a\u00020t2\u0006\u0010.\u001a\u00020/J\u001e\u0010u\u001a\u00020$2\u000e\u0010v\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010w2\u0006\u0010x\u001a\u00020tJ(\u0010y\u001a\u00020$2\b\u0010z\u001a\u0004\u0018\u00010{2\u0006\u0010|\u001a\u00020}2\u0006\u0010O\u001a\u00020~2\u0006\u0010e\u001a\u00020~J \u0010\u007f\u001a\u00020$2\u0007\u0010Y\u001a\u00030\u0080\u00012\u0006\u0010|\u001a\u00020}2\u0007\u0010\u0081\u0001\u001a\u00020~J\u0007\u0010\u0082\u0001\u001a\u00020$J\u001c\u0010\u0083\u0001\u001a\u00020$2\u0007\u0010\u0084\u0001\u001a\u00020\u00052\n\b\u0002\u0010x\u001a\u0004\u0018\u00010tJ\u0007\u0010\u0085\u0001\u001a\u00020$J\u0007\u0010\u0086\u0001\u001a\u00020$J\u0007\u0010\u0087\u0001\u001a\u00020$R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001dX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u000e\u0010\u001f\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u00102\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b3\u0010\u0016¨\u0006\u0089\u0001"}, d2 = {"Landroidx/compose/runtime/changelist/ComposerChangeListWriter;", "", "composer", "Landroidx/compose/runtime/ComposerImpl;", "changeList", "Landroidx/compose/runtime/changelist/ChangeList;", "<init>", "(Landroidx/compose/runtime/ComposerImpl;Landroidx/compose/runtime/changelist/ChangeList;)V", "getChangeList", "()Landroidx/compose/runtime/changelist/ChangeList;", "setChangeList", "(Landroidx/compose/runtime/changelist/ChangeList;)V", "reader", "Landroidx/compose/runtime/SlotReader;", "getReader", "()Landroidx/compose/runtime/SlotReader;", "startedGroup", "", "startedGroups", "Landroidx/compose/runtime/IntStack;", "implicitRootStart", "getImplicitRootStart", "()Z", "setImplicitRootStart", "(Z)V", "writersReaderDelta", "", "pendingUps", "pendingDownNodes", "Landroidx/compose/runtime/Stack;", "Ljava/util/ArrayList;", "removeFrom", "moveFrom", "moveTo", "moveCount", "pushApplierOperationPreamble", "", "pushSlotEditingOperationPreamble", "pushSlotTableOperationPreamble", "useParentSlot", "moveReaderRelativeTo", "location", "moveReaderToAbsolute", "recordSlotEditing", "ensureRootStarted", "ensureGroupStarted", io.ktor.http.LinkHeader.Parameters.Anchor, "Landroidx/compose/runtime/Anchor;", "realizeOperationLocation", "forParent", "pastParent", "getPastParent", "withChangeList", "newChangeList", "block", "Lkotlin/Function0;", "withoutImplicitRootStart", "remember", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Landroidx/compose/runtime/RememberObserverHolder;", "rememberPausingScope", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "Landroidx/compose/runtime/RecomposeScopeImpl;", "startResumingScope", "endResumingScope", "updateValue", "groupSlotIndex", "updateAnchoredValue", "appendValue", "trimValues", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "resetSlots", "updateAuxData", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "endRoot", "endCurrentGroup", "skipToEndOfCurrentGroup", "removeCurrentGroup", "insertSlots", "from", "Landroidx/compose/runtime/SlotTable;", "fixups", "Landroidx/compose/runtime/changelist/FixupList;", "moveCurrentGroup", "offset", "endCompositionScope", "action", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composition;", "composition", "useNode", "node", "updateNode", "T", "V", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "removeNode", "nodeIndex", "moveNode", androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_TO, "releaseMovableContent", "endNodeMovement", "endNodeMovementAndDeleteNode", "group", "realizeNodeMovementOperations", "realizeRemoveNode", "realizeMoveNode", "moveUp", "moveDown", "pushPendingUpsAndDowns", "sideEffect", "effect", "determineMovableContentNodeIndex", "effectiveNodeIndexOut", "Landroidx/compose/runtime/internal/IntRef;", "copyNodesToNewAnchorLocation", "nodes", "", "effectiveNodeIndex", "copySlotTableToAnchorLocation", "resolvedState", "Landroidx/compose/runtime/MovableContentState;", "parentContext", "Landroidx/compose/runtime/CompositionContext;", "Landroidx/compose/runtime/MovableContentStateReference;", "releaseMovableGroupAtCurrent", "Landroidx/compose/runtime/ControlledComposition;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_REFERENCE, "endMovableContentPlacement", "includeOperationsIn", "other", "finalizeComposition", "resetTransientState", "deactivateCurrentGroup", "Companion", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposerChangeListWriter {
    private final androidx.compose.runtime.ComposerImpl Camera2StreamConfigurationMap;
    private androidx.compose.runtime.changelist.ChangeList changeList;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoSizesFor;
    private int getInputFormats;
    private int getInputSizeshNQ4ISI;
    public static final int $stable = 8;
    private final androidx.compose.runtime.IntStack getOutputMinFrameDuration = new androidx.compose.runtime.IntStack();
    private boolean implicitRootStart = true;
    private final java.util.ArrayList<java.lang.Object> getHighSpeedVideoFpsRanges = androidx.compose.runtime.Stack.m5282constructorimpl$default(null, 1, null);
    private int getOutputFormats = -1;
    private int getHighSpeedVideoSizes = -1;
    private int getHighSpeedVideoFpsRangesFor = -1;

    public ComposerChangeListWriter(androidx.compose.runtime.ComposerImpl composerImpl, androidx.compose.runtime.changelist.ChangeList changeList) {
        this.Camera2StreamConfigurationMap = composerImpl;
        this.changeList = changeList;
    }

    public final androidx.compose.runtime.changelist.ChangeList getChangeList() {
        return this.changeList;
    }

    public final void setChangeList(androidx.compose.runtime.changelist.ChangeList changeList) {
        this.changeList = changeList;
    }

    private final androidx.compose.runtime.SlotReader getHighSpeedVideoFpsRangesFor() {
        return this.Camera2StreamConfigurationMap.getReader();
    }

    public final boolean getImplicitRootStart() {
        return this.implicitRootStart;
    }

    public final void setImplicitRootStart(boolean z) {
        this.implicitRootStart = z;
    }

    private final void Camera2StreamConfigurationMap() {
        getHighSpeedVideoFpsRanges();
    }

    private final void getHighResolutionOutputSizeshNQ4ISI() {
        getHighSpeedVideoFpsRangesFor(false);
        recordSlotEditing();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighSpeedVideoSizes(boolean z) {
        getHighSpeedVideoFpsRangesFor(z);
    }

    public final void moveReaderRelativeTo(int location) {
        this.getInputSizeshNQ4ISI += location - getHighSpeedVideoFpsRangesFor().getCurrentGroup();
    }

    public final void moveReaderToAbsolute(int location) {
        this.getInputSizeshNQ4ISI = location;
    }

    public final void recordSlotEditing() {
        androidx.compose.runtime.SlotReader highSpeedVideoFpsRangesFor;
        int parent;
        if (getHighSpeedVideoFpsRangesFor().getGetHighSpeedVideoFpsRanges() <= 0 || this.getOutputMinFrameDuration.peekOr(-2) == (parent = (highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor()).getParent())) {
            return;
        }
        getHighSpeedVideoSizes();
        if (parent > 0) {
            androidx.compose.runtime.Anchor anchor = highSpeedVideoFpsRangesFor.anchor(parent);
            this.getOutputMinFrameDuration.push(parent);
            getHighSpeedVideoFpsRanges(anchor);
        }
    }

    private final void getHighSpeedVideoSizes() {
        if (this.getHighSpeedVideoSizesFor || !this.implicitRootStart) {
            return;
        }
        getHighSpeedVideoSizes(false);
        this.changeList.pushEnsureRootStarted();
        this.getHighSpeedVideoSizesFor = true;
    }

    private final void getHighSpeedVideoFpsRanges(androidx.compose.runtime.Anchor anchor) {
        getHighSpeedVideoSizes(false);
        this.changeList.pushEnsureGroupStarted(anchor);
        this.getHighSpeedVideoSizesFor = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighSpeedVideoFpsRangesFor(boolean z) {
        int parent = z ? getHighSpeedVideoFpsRangesFor().getParent() : getHighSpeedVideoFpsRangesFor().getCurrentGroup();
        int i = parent - this.getInputSizeshNQ4ISI;
        if (i < 0) {
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("Tried to seek backward");
        }
        if (i > 0) {
            this.changeList.pushAdvanceSlotsBy(i);
            this.getInputSizeshNQ4ISI = parent;
        }
    }

    public final boolean getPastParent() {
        return getHighSpeedVideoFpsRangesFor().getParent() - this.getInputSizeshNQ4ISI < 0;
    }

    public final void withChangeList(androidx.compose.runtime.changelist.ChangeList newChangeList, kotlin.jvm.functions.Function0<kotlin.Unit> block) {
        androidx.compose.runtime.changelist.ChangeList changeList = getChangeList();
        try {
            setChangeList(newChangeList);
            block.invoke();
        } finally {
            setChangeList(changeList);
        }
    }

    public final void withoutImplicitRootStart(kotlin.jvm.functions.Function0<kotlin.Unit> block) {
        boolean implicitRootStart = getImplicitRootStart();
        try {
            setImplicitRootStart(false);
            block.invoke();
        } finally {
            setImplicitRootStart(implicitRootStart);
        }
    }

    public final void remember(androidx.compose.runtime.RememberObserverHolder value) {
        this.changeList.pushRemember(value);
    }

    public final void rememberPausingScope(androidx.compose.runtime.RecomposeScopeImpl scope) {
        this.changeList.pushRememberPausingScope(scope);
    }

    public final void startResumingScope(androidx.compose.runtime.RecomposeScopeImpl scope) {
        this.changeList.pushStartResumingScope(scope);
    }

    public final void endResumingScope(androidx.compose.runtime.RecomposeScopeImpl scope) {
        this.changeList.pushEndResumingScope(scope);
    }

    public final void updateValue(java.lang.Object value, int groupSlotIndex) {
        getHighSpeedVideoSizes(true);
        this.changeList.pushUpdateValue(value, groupSlotIndex);
    }

    public final void updateAnchoredValue(java.lang.Object value, androidx.compose.runtime.Anchor anchor, int groupSlotIndex) {
        this.changeList.pushUpdateAnchoredValue(value, anchor, groupSlotIndex);
    }

    public final void appendValue(androidx.compose.runtime.Anchor anchor, java.lang.Object value) {
        this.changeList.pushAppendValue(anchor, value);
    }

    public final void trimValues(int count) {
        if (count > 0) {
            getHighResolutionOutputSizeshNQ4ISI();
            this.changeList.pushTrimValues(count);
        }
    }

    public final void resetSlots() {
        this.changeList.pushResetSlots();
    }

    public final void updateAuxData(java.lang.Object data) {
        getHighSpeedVideoSizes(false);
        this.changeList.pushUpdateAuxData(data);
    }

    public final void endRoot() {
        if (this.getHighSpeedVideoSizesFor) {
            getHighSpeedVideoSizes(false);
            getHighSpeedVideoSizes(false);
            this.changeList.pushEndCurrentGroup();
            this.getHighSpeedVideoSizesFor = false;
        }
    }

    public final void endCurrentGroup() {
        int parent = getHighSpeedVideoFpsRangesFor().getParent();
        if (this.getOutputMinFrameDuration.peekOr(-1) > parent) {
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("Missed recording an endGroup");
        }
        if (this.getOutputMinFrameDuration.peekOr(-1) == parent) {
            getHighSpeedVideoSizes(false);
            this.getOutputMinFrameDuration.pop();
            this.changeList.pushEndCurrentGroup();
        }
    }

    public final void skipToEndOfCurrentGroup() {
        this.changeList.pushSkipToEndOfCurrentGroup();
    }

    public final void removeCurrentGroup() {
        getHighResolutionOutputSizeshNQ4ISI();
        this.changeList.pushRemoveCurrentGroup();
        this.getInputSizeshNQ4ISI += getHighSpeedVideoFpsRangesFor().getGroupSize();
    }

    public final void insertSlots(androidx.compose.runtime.Anchor anchor, androidx.compose.runtime.SlotTable from) {
        getHighSpeedVideoFpsRanges();
        getHighResolutionOutputSizeshNQ4ISI();
        getInputSizeshNQ4ISI();
        this.changeList.pushInsertSlots(anchor, from);
    }

    public final void insertSlots(androidx.compose.runtime.Anchor anchor, androidx.compose.runtime.SlotTable from, androidx.compose.runtime.changelist.FixupList fixups) {
        getHighSpeedVideoFpsRanges();
        getHighResolutionOutputSizeshNQ4ISI();
        getInputSizeshNQ4ISI();
        this.changeList.pushInsertSlots(anchor, from, fixups);
    }

    public final void moveCurrentGroup(int offset) {
        getHighResolutionOutputSizeshNQ4ISI();
        this.changeList.pushMoveCurrentGroup(offset);
    }

    public final void endCompositionScope(kotlin.jvm.functions.Function1<? super androidx.compose.runtime.Composition, kotlin.Unit> action, androidx.compose.runtime.Composition composition) {
        this.changeList.pushEndCompositionScope(action, composition);
    }

    public final void useNode(java.lang.Object node) {
        Camera2StreamConfigurationMap();
        this.changeList.pushUseNode(node);
    }

    public final <T, V> void updateNode(V value, kotlin.jvm.functions.Function2<? super T, ? super V, kotlin.Unit> block) {
        Camera2StreamConfigurationMap();
        this.changeList.pushUpdateNode(value, block);
    }

    public final void removeNode(int nodeIndex, int count) {
        if (count > 0) {
            if (nodeIndex < 0) {
                androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("Invalid remove index ".concat(java.lang.String.valueOf(nodeIndex)));
            }
            if (this.getOutputFormats == nodeIndex) {
                this.getHighResolutionOutputSizeshNQ4ISI += count;
                return;
            }
            getInputSizeshNQ4ISI();
            this.getOutputFormats = nodeIndex;
            this.getHighResolutionOutputSizeshNQ4ISI = count;
        }
    }

    public final void moveNode(int from, int to, int count) {
        if (count > 0) {
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i > 0 && this.getHighSpeedVideoSizes == from - i && this.getHighSpeedVideoFpsRangesFor == to - i) {
                this.getHighResolutionOutputSizeshNQ4ISI = i + count;
                return;
            }
            getInputSizeshNQ4ISI();
            this.getHighSpeedVideoSizes = from;
            this.getHighSpeedVideoFpsRangesFor = to;
            this.getHighResolutionOutputSizeshNQ4ISI = count;
        }
    }

    public final void releaseMovableContent() {
        getHighSpeedVideoFpsRanges();
        if (this.getHighSpeedVideoSizesFor) {
            skipToEndOfCurrentGroup();
            endRoot();
        }
    }

    public final void endNodeMovement() {
        getInputSizeshNQ4ISI();
    }

    public final void endNodeMovementAndDeleteNode(int nodeIndex, int group) {
        endNodeMovement();
        getHighSpeedVideoFpsRanges();
        int nodeCount = getHighSpeedVideoFpsRangesFor().isNode(group) ? 1 : getHighSpeedVideoFpsRangesFor().nodeCount(group);
        if (nodeCount > 0) {
            removeNode(nodeIndex, nodeCount);
        }
    }

    private final void getInputSizeshNQ4ISI() {
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i > 0) {
            int i2 = this.getOutputFormats;
            if (i2 >= 0) {
                Camera2StreamConfigurationMap(i2, i);
                this.getOutputFormats = -1;
            } else {
                getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, i);
                this.getHighSpeedVideoSizes = -1;
                this.getHighSpeedVideoFpsRangesFor = -1;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = 0;
        }
    }

    private final void Camera2StreamConfigurationMap(int i, int i2) {
        Camera2StreamConfigurationMap();
        this.changeList.pushRemoveNode(i, i2);
    }

    private final void getHighSpeedVideoFpsRangesFor(int i, int i2, int i3) {
        Camera2StreamConfigurationMap();
        this.changeList.pushMoveNode(i, i2, i3);
    }

    public final void moveUp() {
        getInputSizeshNQ4ISI();
        if (androidx.compose.runtime.Stack.m5288isNotEmptyimpl(this.getHighSpeedVideoFpsRanges)) {
            androidx.compose.runtime.Stack.m5291popimpl(this.getHighSpeedVideoFpsRanges);
        } else {
            this.getInputFormats++;
        }
    }

    public final void moveDown(java.lang.Object node) {
        getInputSizeshNQ4ISI();
        androidx.compose.runtime.Stack.m5292pushimpl(this.getHighSpeedVideoFpsRanges, node);
    }

    private final void getHighSpeedVideoFpsRanges() {
        int i = this.getInputFormats;
        if (i > 0) {
            this.changeList.pushUps(i);
            this.getInputFormats = 0;
        }
        if (androidx.compose.runtime.Stack.m5288isNotEmptyimpl(this.getHighSpeedVideoFpsRanges)) {
            this.changeList.pushDowns(androidx.compose.runtime.Stack.m5293toArrayimpl(this.getHighSpeedVideoFpsRanges));
            androidx.compose.runtime.Stack.m5280clearimpl(this.getHighSpeedVideoFpsRanges);
        }
    }

    public final void sideEffect(kotlin.jvm.functions.Function0<kotlin.Unit> effect) {
        this.changeList.pushSideEffect(effect);
    }

    public final void determineMovableContentNodeIndex(androidx.compose.runtime.internal.IntRef effectiveNodeIndexOut, androidx.compose.runtime.Anchor anchor) {
        getHighSpeedVideoFpsRanges();
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
        getHighSpeedVideoFpsRanges();
        this.changeList.pushEndMovableContentPlacement();
        this.getInputSizeshNQ4ISI = 0;
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
        getHighSpeedVideoFpsRanges();
        if (this.getOutputMinFrameDuration.tos == 0) {
            return;
        }
        androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("Missed recording an endGroup()");
    }

    public final void resetTransientState() {
        this.getHighSpeedVideoSizesFor = false;
        this.getOutputMinFrameDuration.clear();
        this.getInputSizeshNQ4ISI = 0;
        this.implicitRootStart = true;
        this.getInputFormats = 0;
        androidx.compose.runtime.Stack.m5280clearimpl(this.getHighSpeedVideoFpsRanges);
        this.getOutputFormats = -1;
        this.getHighSpeedVideoSizes = -1;
        this.getHighSpeedVideoFpsRangesFor = -1;
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
    }

    public final void deactivateCurrentGroup() {
        getHighSpeedVideoSizes(false);
        this.changeList.pushDeactivateCurrentGroup();
    }
}
