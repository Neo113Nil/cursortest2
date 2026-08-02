package androidx.compose.runtime.changelist;

@kotlin.Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\u0003J3\u0010\u0012\u001a\u00020\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001d\u0010\u001bJ\u001f\u0010!\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u001e2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J'\u0010%\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u001e2\u0006\u0010$\u001a\u00020#2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\u00020\b2\u0006\u0010$\u001a\u00020#2\b\u0010\u0015\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\u00020\b2\u0006\u0010)\u001a\u00020\u001f¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\b¢\u0006\u0004\b,\u0010\u0003J\r\u0010-\u001a\u00020\b¢\u0006\u0004\b-\u0010\u0003J\u0017\u0010/\u001a\u00020\b2\b\u0010.\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\b¢\u0006\u0004\b1\u0010\u0003J\u0015\u00102\u001a\u00020\b2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b2\u00103J\r\u00104\u001a\u00020\b¢\u0006\u0004\b4\u0010\u0003J\r\u00105\u001a\u00020\b¢\u0006\u0004\b5\u0010\u0003J\r\u00106\u001a\u00020\b¢\u0006\u0004\b6\u0010\u0003J\u001d\u00109\u001a\u00020\b2\u0006\u0010$\u001a\u00020#2\u0006\u00108\u001a\u000207¢\u0006\u0004\b9\u0010:J%\u00109\u001a\u00020\b2\u0006\u0010$\u001a\u00020#2\u0006\u00108\u001a\u0002072\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b9\u0010=J\u0015\u0010?\u001a\u00020\b2\u0006\u0010>\u001a\u00020\u001f¢\u0006\u0004\b?\u0010+J)\u0010D\u001a\u00020\b2\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\b0@2\u0006\u0010C\u001a\u00020A¢\u0006\u0004\bD\u0010EJ\u0017\u0010G\u001a\u00020\b2\b\u0010F\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\bG\u00100J@\u0010M\u001a\u00020\b\"\u0004\b\u0000\u0010H\"\u0004\b\u0001\u0010I2\u0006\u0010\u0015\u001a\u00028\u00012\u001d\u0010L\u001a\u0019\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0J¢\u0006\u0002\bK¢\u0006\u0004\bM\u0010NJ\u001d\u0010Q\u001a\u00020\b2\u0006\u0010O\u001a\u00020\u001f2\u0006\u0010P\u001a\u00020\u001f¢\u0006\u0004\bQ\u0010RJ%\u0010T\u001a\u00020\b2\u0006\u0010S\u001a\u00020\u001f2\u0006\u00108\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\u001f¢\u0006\u0004\bT\u0010UJ\u0015\u0010W\u001a\u00020\b2\u0006\u0010V\u001a\u00020\u001f¢\u0006\u0004\bW\u0010+J\u0015\u0010X\u001a\u00020\b2\u0006\u0010)\u001a\u00020\u001f¢\u0006\u0004\bX\u0010+J\u001d\u0010[\u001a\u00020\b2\u000e\u0010Z\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0Y¢\u0006\u0004\b[\u0010\\J\u001b\u0010_\u001a\u00020\b2\f\u0010^\u001a\b\u0012\u0004\u0012\u00020\b0]¢\u0006\u0004\b_\u0010`J\u001d\u0010c\u001a\u00020\b2\u0006\u0010b\u001a\u00020a2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\bc\u0010dJ%\u0010g\u001a\u00020\b2\u000e\u0010Z\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0e2\u0006\u0010f\u001a\u00020a¢\u0006\u0004\bg\u0010hJ/\u0010n\u001a\u00020\b2\b\u0010j\u001a\u0004\u0018\u00010i2\u0006\u0010l\u001a\u00020k2\u0006\u00108\u001a\u00020m2\u0006\u0010S\u001a\u00020m¢\u0006\u0004\bn\u0010oJ%\u0010r\u001a\u00020\b2\u0006\u0010C\u001a\u00020p2\u0006\u0010l\u001a\u00020k2\u0006\u0010q\u001a\u00020m¢\u0006\u0004\br\u0010sJ\r\u0010t\u001a\u00020\b¢\u0006\u0004\bt\u0010\u0003J!\u0010v\u001a\u00020\b2\u0006\u0010u\u001a\u00020\u00002\n\b\u0002\u0010f\u001a\u0004\u0018\u00010a¢\u0006\u0004\bv\u0010wJ\u0017\u0010z\u001a\u00020x2\u0006\u0010y\u001a\u00020xH\u0016¢\u0006\u0004\bz\u0010{R\u0014\u0010\u007f\u001a\u00020|8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u0014\u0010\u0082\u0001\u001a\u00020\u001f8G¢\u0006\b\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001"}, d2 = {"Landroidx/compose/runtime/changelist/ChangeList;", "Landroidx/compose/runtime/changelist/OperationsDebugStringFormattable;", "<init>", "()V", "", "isEmpty", "()Z", "isNotEmpty", "", "clear", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "Landroidx/compose/runtime/changelist/OperationErrorContext;", "errorContext", "executeAndFlushAllPendingChanges", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;Landroidx/compose/runtime/changelist/OperationErrorContext;)V", "Landroidx/compose/runtime/RememberObserverHolder;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "pushRemember", "(Landroidx/compose/runtime/RememberObserverHolder;)V", "Landroidx/compose/runtime/RecomposeScopeImpl;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "pushRememberPausingScope", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", "pushStartResumingScope", "pushEndResumingScope", "", "", "groupSlotIndex", "pushUpdateValue", "(Ljava/lang/Object;I)V", "Landroidx/compose/runtime/Anchor;", io.ktor.http.LinkHeader.Parameters.Anchor, "pushUpdateAnchoredValue", "(Ljava/lang/Object;Landroidx/compose/runtime/Anchor;I)V", "pushAppendValue", "(Landroidx/compose/runtime/Anchor;Ljava/lang/Object;)V", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "pushTrimValues", "(I)V", "pushResetSlots", "pushDeactivateCurrentGroup", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "pushUpdateAuxData", "(Ljava/lang/Object;)V", "pushEnsureRootStarted", "pushEnsureGroupStarted", "(Landroidx/compose/runtime/Anchor;)V", "pushEndCurrentGroup", "pushSkipToEndOfCurrentGroup", "pushRemoveCurrentGroup", "Landroidx/compose/runtime/SlotTable;", "from", "pushInsertSlots", "(Landroidx/compose/runtime/Anchor;Landroidx/compose/runtime/SlotTable;)V", "Landroidx/compose/runtime/changelist/FixupList;", "fixups", "(Landroidx/compose/runtime/Anchor;Landroidx/compose/runtime/SlotTable;Landroidx/compose/runtime/changelist/FixupList;)V", "offset", "pushMoveCurrentGroup", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composition;", "action", "composition", "pushEndCompositionScope", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composition;)V", "node", "pushUseNode", "T", "V", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "block", "pushUpdateNode", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "removeFrom", "moveCount", "pushRemoveNode", "(II)V", androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_TO, "pushMoveNode", "(III)V", "distance", "pushAdvanceSlotsBy", "pushUps", "", "nodes", "pushDowns", "([Ljava/lang/Object;)V", "Lkotlin/Function0;", "effect", "pushSideEffect", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/runtime/internal/IntRef;", "effectiveNodeIndexOut", "pushDetermineMovableContentNodeIndex", "(Landroidx/compose/runtime/internal/IntRef;Landroidx/compose/runtime/Anchor;)V", "", "effectiveNodeIndex", "pushCopyNodesToNewAnchorLocation", "(Ljava/util/List;Landroidx/compose/runtime/internal/IntRef;)V", "Landroidx/compose/runtime/MovableContentState;", "resolvedState", "Landroidx/compose/runtime/CompositionContext;", "parentContext", "Landroidx/compose/runtime/MovableContentStateReference;", "pushCopySlotTableToAnchorLocation", "(Landroidx/compose/runtime/MovableContentState;Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/MovableContentStateReference;Landroidx/compose/runtime/MovableContentStateReference;)V", "Landroidx/compose/runtime/ControlledComposition;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_REFERENCE, "pushReleaseMovableGroupAtCurrent", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/MovableContentStateReference;)V", "pushEndMovableContentPlacement", "changeList", "pushExecuteOperationsIn", "(Landroidx/compose/runtime/changelist/ChangeList;Landroidx/compose/runtime/internal/IntRef;)V", "", "linePrefix", "toDebugString", "(Ljava/lang/String;)Ljava/lang/String;", "Landroidx/compose/runtime/changelist/Operations;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/runtime/changelist/Operations;", "getHighSpeedVideoFpsRangesFor", "getSize", "()I", io.ktor.http.ContentDisposition.Parameters.Size}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChangeList extends androidx.compose.runtime.changelist.OperationsDebugStringFormattable {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.runtime.changelist.Operations getHighSpeedVideoFpsRangesFor = new androidx.compose.runtime.changelist.Operations();

    public final int getSize() {
        return this.getHighSpeedVideoFpsRangesFor.getOpCodesSize();
    }

    public final boolean isEmpty() {
        return this.getHighSpeedVideoFpsRangesFor.isEmpty();
    }

    public final boolean isNotEmpty() {
        return this.getHighSpeedVideoFpsRangesFor.isNotEmpty();
    }

    public final void clear() {
        this.getHighSpeedVideoFpsRangesFor.clear();
    }

    public final void executeAndFlushAllPendingChanges(androidx.compose.runtime.Applier<?> applier, androidx.compose.runtime.SlotWriter slots, androidx.compose.runtime.RememberManager rememberManager, androidx.compose.runtime.changelist.OperationErrorContext errorContext) {
        this.getHighSpeedVideoFpsRangesFor.executeAndFlushAllPendingOperations(applier, slots, rememberManager, errorContext);
    }

    public final void pushRemember(androidx.compose.runtime.RememberObserverHolder value) {
        androidx.compose.runtime.changelist.Operations operations = this.getHighSpeedVideoFpsRangesFor;
        androidx.compose.runtime.changelist.Operation.Remember remember = androidx.compose.runtime.changelist.Operation.Remember.INSTANCE;
        operations.pushOp(remember);
        androidx.compose.runtime.changelist.Operations m5363constructorimpl = androidx.compose.runtime.changelist.Operations.WriteScope.m5363constructorimpl(operations);
        androidx.compose.runtime.changelist.Operation.Remember remember2 = androidx.compose.runtime.changelist.Operation.Remember.INSTANCE;
        androidx.compose.runtime.changelist.Operations.WriteScope.m5371setObjectDKhxnng(m5363constructorimpl, androidx.compose.runtime.changelist.Operation.ObjectParameter.m5338constructorimpl(0), value);
        operations.ensureAllArgumentsPushedFor(remember);
    }

    public final void pushRememberPausingScope(androidx.compose.runtime.RecomposeScopeImpl scope) {
        androidx.compose.runtime.changelist.Operations operations = this.getHighSpeedVideoFpsRangesFor;
        androidx.compose.runtime.changelist.Operation.RememberPausingScope rememberPausingScope = androidx.compose.runtime.changelist.Operation.RememberPausingScope.INSTANCE;
        operations.pushOp(rememberPausingScope);
        androidx.compose.runtime.changelist.Operations m5363constructorimpl = androidx.compose.runtime.changelist.Operations.WriteScope.m5363constructorimpl(operations);
        androidx.compose.runtime.changelist.Operation.RememberPausingScope rememberPausingScope2 = androidx.compose.runtime.changelist.Operation.RememberPausingScope.INSTANCE;
        androidx.compose.runtime.changelist.Operations.WriteScope.m5371setObjectDKhxnng(m5363constructorimpl, androidx.compose.runtime.changelist.Operation.ObjectParameter.m5338constructorimpl(0), scope);
        operations.ensureAllArgumentsPushedFor(rememberPausingScope);
    }

    public final void pushStartResumingScope(androidx.compose.runtime.RecomposeScopeImpl scope) {
        androidx.compose.runtime.changelist.Operations operations = this.getHighSpeedVideoFpsRangesFor;
        androidx.compose.runtime.changelist.Operation.StartResumingScope startResumingScope = androidx.compose.runtime.changelist.Operation.StartResumingScope.INSTANCE;
        operations.pushOp(startResumingScope);
        androidx.compose.runtime.changelist.Operations m5363constructorimpl = androidx.compose.runtime.changelist.Operations.WriteScope.m5363constructorimpl(operations);
        androidx.compose.runtime.changelist.Operation.StartResumingScope startResumingScope2 = androidx.compose.runtime.changelist.Operation.StartResumingScope.INSTANCE;
        androidx.compose.runtime.changelist.Operations.WriteScope.m5371setObjectDKhxnng(m5363constructorimpl, androidx.compose.runtime.changelist.Operation.ObjectParameter.m5338constructorimpl(0), scope);
        operations.ensureAllArgumentsPushedFor(startResumingScope);
    }

    public final void pushEndResumingScope(androidx.compose.runtime.RecomposeScopeImpl scope) {
        androidx.compose.runtime.changelist.Operations operations = this.getHighSpeedVideoFpsRangesFor;
        androidx.compose.runtime.changelist.Operation.EndResumingScope endResumingScope = androidx.compose.runtime.changelist.Operation.EndResumingScope.INSTANCE;
        operations.pushOp(endResumingScope);
        androidx.compose.runtime.changelist.Operations m5363constructorimpl = androidx.compose.runtime.changelist.Operations.WriteScope.m5363constructorimpl(operations);
        androidx.compose.runtime.changelist.Operation.EndResumingScope endResumingScope2 = androidx.compose.runtime.changelist.Operation.EndResumingScope.INSTANCE;
        androidx.compose.runtime.changelist.Operations.WriteScope.m5371setObjectDKhxnng(m5363constructorimpl, androidx.compose.runtime.changelist.Operation.ObjectParameter.m5338constructorimpl(0), scope);
        operations.ensureAllArgumentsPushedFor(endResumingScope);
    }

    public final void pushUpdateValue(java.lang.Object value, int groupSlotIndex) {
        androidx.compose.runtime.changelist.Operations operations = this.getHighSpeedVideoFpsRangesFor;
        androidx.compose.runtime.changelist.Operation.UpdateValue updateValue = androidx.compose.runtime.changelist.Operation.UpdateValue.INSTANCE;
        operations.pushOp(updateValue);
        androidx.compose.runtime.changelist.Operations m5363constructorimpl = androidx.compose.runtime.changelist.Operations.WriteScope.m5363constructorimpl(operations);
        androidx.compose.runtime.changelist.Operation.UpdateValue updateValue2 = androidx.compose.runtime.changelist.Operation.UpdateValue.INSTANCE;
        androidx.compose.runtime.changelist.Operations.WriteScope.m5371setObjectDKhxnng(m5363constructorimpl, androidx.compose.runtime.changelist.Operation.ObjectParameter.m5338constructorimpl(0), value);
        androidx.compose.runtime.changelist.Operation.UpdateValue updateValue3 = androidx.compose.runtime.changelist.Operation.UpdateValue.INSTANCE;
        m5363constructorimpl.intArgs[m5363constructorimpl.intArgsSize - m5363constructorimpl.opCodes[m5363constructorimpl.opCodesSize - 1].getInts()] = groupSlotIndex;
        operations.ensureAllArgumentsPushedFor(updateValue);
    }

    public final void pushUpdateAnchoredValue(java.lang.Object value, androidx.compose.runtime.Anchor anchor, int groupSlotIndex) {
        androidx.compose.runtime.changelist.Operations operations = this.getHighSpeedVideoFpsRangesFor;
        androidx.compose.runtime.changelist.Operation.UpdateAnchoredValue updateAnchoredValue = androidx.compose.runtime.changelist.Operation.UpdateAnchoredValue.INSTANCE;
        operations.pushOp(updateAnchoredValue);
        androidx.compose.runtime.changelist.Operations m5363constructorimpl = androidx.compose.runtime.changelist.Operations.WriteScope.m5363constructorimpl(operations);
        androidx.compose.runtime.changelist.Operation.UpdateAnchoredValue updateAnchoredValue2 = androidx.compose.runtime.changelist.Operation.UpdateAnchoredValue.INSTANCE;
        int m5338constructorimpl = androidx.compose.runtime.changelist.Operation.ObjectParameter.m5338constructorimpl(0);
        androidx.compose.runtime.changelist.Operation.UpdateAnchoredValue updateAnchoredValue3 = androidx.compose.runtime.changelist.Operation.UpdateAnchoredValue.INSTANCE;
        androidx.compose.runtime.changelist.Operations.WriteScope.m5372setObjects4uCC6AY(m5363constructorimpl, m5338constructorimpl, value, androidx.compose.runtime.changelist.Operation.ObjectParameter.m5338constructorimpl(1), anchor);
        androidx.compose.runtime.changelist.Operation.UpdateAnchoredValue updateAnchoredValue4 = androidx.compose.runtime.changelist.Operation.UpdateAnchoredValue.INSTANCE;
        m5363constructorimpl.intArgs[m5363constructorimpl.intArgsSize - m5363constructorimpl.opCodes[m5363constructorimpl.opCodesSize - 1].getInts()] = groupSlotIndex;
        operations.ensureAllArgumentsPushedFor(updateAnchoredValue);
    }

    public final void pushAppendValue(androidx.compose.runtime.Anchor anchor, java.lang.Object value) {
        androidx.compose.runtime.changelist.Operations operations = this.getHighSpeedVideoFpsRangesFor;
        androidx.compose.runtime.changelist.Operation.AppendValue appendValue = androidx.compose.runtime.changelist.Operation.AppendValue.INSTANCE;
        operations.pushOp(appendValue);
        androidx.compose.runtime.changelist.Operations m5363constructorimpl = androidx.compose.runtime.changelist.Operations.WriteScope.m5363constructorimpl(operations);
        androidx.compose.runtime.changelist.Operation.AppendValue appendValue2 = androidx.compose.runtime.changelist.Operation.AppendValue.INSTANCE;
        int m5338constructorimpl = androidx.compose.runtime.changelist.Operation.ObjectParameter.m5338constructorimpl(0);
        androidx.compose.runtime.changelist.Operation.AppendValue appendValue3 = androidx.compose.runtime.changelist.Operation.AppendValue.INSTANCE;
        androidx.compose.runtime.changelist.Operations.WriteScope.m5372setObjects4uCC6AY(m5363constructorimpl, m5338constructorimpl, anchor, androidx.compose.runtime.changelist.Operation.ObjectParameter.m5338constructorimpl(1), value);
        operations.ensureAllArgumentsPushedFor(appendValue);
    }

    public final void pushTrimValues(int count) {
        androidx.compose.runtime.changelist.Operations operations = this.getHighSpeedVideoFpsRangesFor;
        androidx.compose.runtime.changelist.Operation.TrimParentValues trimParentValues = androidx.compose.runtime.changelist.Operation.TrimParentValues.INSTANCE;
        operations.pushOp(trimParentValues);
        androidx.compose.runtime.changelist.Operations m5363constructorimpl = androidx.compose.runtime.changelist.Operations.WriteScope.m5363constructorimpl(operations);
        androidx.compose.runtime.changelist.Operation.TrimParentValues trimParentValues2 = androidx.compose.runtime.changelist.Operation.TrimParentValues.INSTANCE;
        m5363constructorimpl.intArgs[m5363constructorimpl.intArgsSize - m5363constructorimpl.opCodes[m5363constructorimpl.opCodesSize - 1].getInts()] = count;
        operations.ensureAllArgumentsPushedFor(trimParentValues);
    }

    public final void pushResetSlots() {
        this.getHighSpeedVideoFpsRangesFor.push(androidx.compose.runtime.changelist.Operation.ResetSlots.INSTANCE);
    }

    public final void pushDeactivateCurrentGroup() {
        this.getHighSpeedVideoFpsRangesFor.push(androidx.compose.runtime.changelist.Operation.DeactivateCurrentGroup.INSTANCE);
    }

    public final void pushUpdateAuxData(java.lang.Object data) {
        androidx.compose.runtime.changelist.Operations operations = this.getHighSpeedVideoFpsRangesFor;
        androidx.compose.runtime.changelist.Operation.UpdateAuxData updateAuxData = androidx.compose.runtime.changelist.Operation.UpdateAuxData.INSTANCE;
        operations.pushOp(updateAuxData);
        androidx.compose.runtime.changelist.Operations m5363constructorimpl = androidx.compose.runtime.changelist.Operations.WriteScope.m5363constructorimpl(operations);
        androidx.compose.runtime.changelist.Operation.UpdateAuxData updateAuxData2 = androidx.compose.runtime.changelist.Operation.UpdateAuxData.INSTANCE;
        androidx.compose.runtime.changelist.Operations.WriteScope.m5371setObjectDKhxnng(m5363constructorimpl, androidx.compose.runtime.changelist.Operation.ObjectParameter.m5338constructorimpl(0), data);
        operations.ensureAllArgumentsPushedFor(updateAuxData);
    }

    public final void pushEnsureRootStarted() {
        this.getHighSpeedVideoFpsRangesFor.push(androidx.compose.runtime.changelist.Operation.EnsureRootGroupStarted.INSTANCE);
    }

    public final void pushEnsureGroupStarted(androidx.compose.runtime.Anchor anchor) {
        androidx.compose.runtime.changelist.Operations operations = this.getHighSpeedVideoFpsRangesFor;
        androidx.compose.runtime.changelist.Operation.EnsureGroupStarted ensureGroupStarted = androidx.compose.runtime.changelist.Operation.EnsureGroupStarted.INSTANCE;
        operations.pushOp(ensureGroupStarted);
        androidx.compose.runtime.changelist.Operations m5363constructorimpl = androidx.compose.runtime.changelist.Operations.WriteScope.m5363constructorimpl(operations);
        androidx.compose.runtime.changelist.Operation.EnsureGroupStarted ensureGroupStarted2 = androidx.compose.runtime.changelist.Operation.EnsureGroupStarted.INSTANCE;
        androidx.compose.runtime.changelist.Operations.WriteScope.m5371setObjectDKhxnng(m5363constructorimpl, androidx.compose.runtime.changelist.Operation.ObjectParameter.m5338constructorimpl(0), anchor);
        operations.ensureAllArgumentsPushedFor(ensureGroupStarted);
    }

    public final void pushEndCurrentGroup() {
        this.getHighSpeedVideoFpsRangesFor.push(androidx.compose.runtime.changelist.Operation.EndCurrentGroup.INSTANCE);
    }

    public final void pushSkipToEndOfCurrentGroup() {
        this.getHighSpeedVideoFpsRangesFor.push(androidx.compose.runtime.changelist.Operation.SkipToEndOfCurrentGroup.INSTANCE);
    }

    public final void pushRemoveCurrentGroup() {
        this.getHighSpeedVideoFpsRangesFor.push(androidx.compose.runtime.changelist.Operation.RemoveCurrentGroup.INSTANCE);
    }

    public final void pushInsertSlots(androidx.compose.runtime.Anchor anchor, androidx.compose.runtime.SlotTable from) {
        androidx.compose.runtime.changelist.Operations operations = this.getHighSpeedVideoFpsRangesFor;
        androidx.compose.runtime.changelist.Operation.InsertSlots insertSlots = androidx.compose.runtime.changelist.Operation.InsertSlots.INSTANCE;
        operations.pushOp(insertSlots);
        androidx.compose.runtime.changelist.Operations m5363constructorimpl = androidx.compose.runtime.changelist.Operations.WriteScope.m5363constructorimpl(operations);
        androidx.compose.runtime.changelist.Operation.InsertSlots insertSlots2 = androidx.compose.runtime.changelist.Operation.InsertSlots.INSTANCE;
        int m5338constructorimpl = androidx.compose.runtime.changelist.Operation.ObjectParameter.m5338constructorimpl(0);
        androidx.compose.runtime.changelist.Operation.InsertSlots insertSlots3 = androidx.compose.runtime.changelist.Operation.InsertSlots.INSTANCE;
        androidx.compose.runtime.changelist.Operations.WriteScope.m5372setObjects4uCC6AY(m5363constructorimpl, m5338constructorimpl, anchor, androidx.compose.runtime.changelist.Operation.ObjectParameter.m5338constructorimpl(1), from);
        operations.ensureAllArgumentsPushedFor(insertSlots);
    }

    public final void pushInsertSlots(androidx.compose.runtime.Anchor anchor, androidx.compose.runtime.SlotTable from, androidx.compose.runtime.changelist.FixupList fixups) {
        androidx.compose.runtime.changelist.Operations operations = this.getHighSpeedVideoFpsRangesFor;
        androidx.compose.runtime.changelist.Operation.InsertSlotsWithFixups insertSlotsWithFixups = androidx.compose.runtime.changelist.Operation.InsertSlotsWithFixups.INSTANCE;
        operations.pushOp(insertSlotsWithFixups);
        androidx.compose.runtime.changelist.Operations m5363constructorimpl = androidx.compose.runtime.changelist.Operations.WriteScope.m5363constructorimpl(operations);
        androidx.compose.runtime.changelist.Operation.InsertSlotsWithFixups insertSlotsWithFixups2 = androidx.compose.runtime.changelist.Operation.InsertSlotsWithFixups.INSTANCE;
        int m5338constructorimpl = androidx.compose.runtime.changelist.Operation.ObjectParameter.m5338constructorimpl(0);
        androidx.compose.runtime.changelist.Operation.InsertSlotsWithFixups insertSlotsWithFixups3 = androidx.compose.runtime.changelist.Operation.InsertSlotsWithFixups.INSTANCE;
        int m5338constructorimpl2 = androidx.compose.runtime.changelist.Operation.ObjectParameter.m5338constructorimpl(1);
        androidx.compose.runtime.changelist.Operation.InsertSlotsWithFixups insertSlotsWithFixups4 = androidx.compose.runtime.changelist.Operation.InsertSlotsWithFixups.INSTANCE;
        androidx.compose.runtime.changelist.Operations.WriteScope.m5374setObjectst7hvbck(m5363constructorimpl, m5338constructorimpl, anchor, m5338constructorimpl2, from, androidx.compose.runtime.changelist.Operation.ObjectParameter.m5338constructorimpl(2), fixups);
        operations.ensureAllArgumentsPushedFor(insertSlotsWithFixups);
    }

    public final void pushMoveCurrentGroup(int offset) {
        androidx.compose.runtime.changelist.Operations operations = this.getHighSpeedVideoFpsRangesFor;
        androidx.compose.runtime.changelist.Operation.MoveCurrentGroup moveCurrentGroup = androidx.compose.runtime.changelist.Operation.MoveCurrentGroup.INSTANCE;
        operations.pushOp(moveCurrentGroup);
        androidx.compose.runtime.changelist.Operations m5363constructorimpl = androidx.compose.runtime.changelist.Operations.WriteScope.m5363constructorimpl(operations);
        androidx.compose.runtime.changelist.Operation.MoveCurrentGroup moveCurrentGroup2 = androidx.compose.runtime.changelist.Operation.MoveCurrentGroup.INSTANCE;
        m5363constructorimpl.intArgs[m5363constructorimpl.intArgsSize - m5363constructorimpl.opCodes[m5363constructorimpl.opCodesSize - 1].getInts()] = offset;
        operations.ensureAllArgumentsPushedFor(moveCurrentGroup);
    }

    public final void pushEndCompositionScope(kotlin.jvm.functions.Function1<? super androidx.compose.runtime.Composition, kotlin.Unit> action, androidx.compose.runtime.Composition composition) {
        androidx.compose.runtime.changelist.Operations operations = this.getHighSpeedVideoFpsRangesFor;
        androidx.compose.runtime.changelist.Operation.EndCompositionScope endCompositionScope = androidx.compose.runtime.changelist.Operation.EndCompositionScope.INSTANCE;
        operations.pushOp(endCompositionScope);
        androidx.compose.runtime.changelist.Operations m5363constructorimpl = androidx.compose.runtime.changelist.Operations.WriteScope.m5363constructorimpl(operations);
        androidx.compose.runtime.changelist.Operation.EndCompositionScope endCompositionScope2 = androidx.compose.runtime.changelist.Operation.EndCompositionScope.INSTANCE;
        int m5338constructorimpl = androidx.compose.runtime.changelist.Operation.ObjectParameter.m5338constructorimpl(0);
        androidx.compose.runtime.changelist.Operation.EndCompositionScope endCompositionScope3 = androidx.compose.runtime.changelist.Operation.EndCompositionScope.INSTANCE;
        androidx.compose.runtime.changelist.Operations.WriteScope.m5372setObjects4uCC6AY(m5363constructorimpl, m5338constructorimpl, action, androidx.compose.runtime.changelist.Operation.ObjectParameter.m5338constructorimpl(1), composition);
        operations.ensureAllArgumentsPushedFor(endCompositionScope);
    }

    public final void pushUseNode(java.lang.Object node) {
        if (node instanceof androidx.compose.runtime.ComposeNodeLifecycleCallback) {
            this.getHighSpeedVideoFpsRangesFor.push(androidx.compose.runtime.changelist.Operation.UseCurrentNode.INSTANCE);
        }
    }

    public final <T, V> void pushUpdateNode(V value, kotlin.jvm.functions.Function2<? super T, ? super V, kotlin.Unit> block) {
        androidx.compose.runtime.changelist.Operations operations = this.getHighSpeedVideoFpsRangesFor;
        androidx.compose.runtime.changelist.Operation.UpdateNode updateNode = androidx.compose.runtime.changelist.Operation.UpdateNode.INSTANCE;
        operations.pushOp(updateNode);
        androidx.compose.runtime.changelist.Operations m5363constructorimpl = androidx.compose.runtime.changelist.Operations.WriteScope.m5363constructorimpl(operations);
        androidx.compose.runtime.changelist.Operation.UpdateNode updateNode2 = androidx.compose.runtime.changelist.Operation.UpdateNode.INSTANCE;
        int m5338constructorimpl = androidx.compose.runtime.changelist.Operation.ObjectParameter.m5338constructorimpl(0);
        androidx.compose.runtime.changelist.Operation.UpdateNode updateNode3 = androidx.compose.runtime.changelist.Operation.UpdateNode.INSTANCE;
        int m5338constructorimpl2 = androidx.compose.runtime.changelist.Operation.ObjectParameter.m5338constructorimpl(1);
        kotlin.jvm.internal.Intrinsics.checkNotNull(block, "");
        androidx.compose.runtime.changelist.Operations.WriteScope.m5372setObjects4uCC6AY(m5363constructorimpl, m5338constructorimpl, value, m5338constructorimpl2, (kotlin.jvm.functions.Function2) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(block, 2));
        operations.ensureAllArgumentsPushedFor(updateNode);
    }

    public final void pushRemoveNode(int removeFrom, int moveCount) {
        androidx.compose.runtime.changelist.Operations operations = this.getHighSpeedVideoFpsRangesFor;
        androidx.compose.runtime.changelist.Operation.RemoveNode removeNode = androidx.compose.runtime.changelist.Operation.RemoveNode.INSTANCE;
        operations.pushOp(removeNode);
        androidx.compose.runtime.changelist.Operations m5363constructorimpl = androidx.compose.runtime.changelist.Operations.WriteScope.m5363constructorimpl(operations);
        androidx.compose.runtime.changelist.Operation.RemoveNode removeNode2 = androidx.compose.runtime.changelist.Operation.RemoveNode.INSTANCE;
        androidx.compose.runtime.changelist.Operation.RemoveNode removeNode3 = androidx.compose.runtime.changelist.Operation.RemoveNode.INSTANCE;
        int ints = m5363constructorimpl.intArgsSize - m5363constructorimpl.opCodes[m5363constructorimpl.opCodesSize - 1].getInts();
        int[] iArr = m5363constructorimpl.intArgs;
        iArr[ints] = removeFrom;
        iArr[ints + 1] = moveCount;
        operations.ensureAllArgumentsPushedFor(removeNode);
    }

    public final void pushMoveNode(int to, int from, int count) {
        androidx.compose.runtime.changelist.Operations operations = this.getHighSpeedVideoFpsRangesFor;
        androidx.compose.runtime.changelist.Operation.MoveNode moveNode = androidx.compose.runtime.changelist.Operation.MoveNode.INSTANCE;
        operations.pushOp(moveNode);
        androidx.compose.runtime.changelist.Operations m5363constructorimpl = androidx.compose.runtime.changelist.Operations.WriteScope.m5363constructorimpl(operations);
        androidx.compose.runtime.changelist.Operation.MoveNode moveNode2 = androidx.compose.runtime.changelist.Operation.MoveNode.INSTANCE;
        androidx.compose.runtime.changelist.Operation.MoveNode moveNode3 = androidx.compose.runtime.changelist.Operation.MoveNode.INSTANCE;
        androidx.compose.runtime.changelist.Operation.MoveNode moveNode4 = androidx.compose.runtime.changelist.Operation.MoveNode.INSTANCE;
        int ints = m5363constructorimpl.intArgsSize - m5363constructorimpl.opCodes[m5363constructorimpl.opCodesSize - 1].getInts();
        int[] iArr = m5363constructorimpl.intArgs;
        iArr[ints + 1] = to;
        iArr[ints] = from;
        iArr[ints + 2] = count;
        operations.ensureAllArgumentsPushedFor(moveNode);
    }

    public final void pushAdvanceSlotsBy(int distance) {
        androidx.compose.runtime.changelist.Operations operations = this.getHighSpeedVideoFpsRangesFor;
        androidx.compose.runtime.changelist.Operation.AdvanceSlotsBy advanceSlotsBy = androidx.compose.runtime.changelist.Operation.AdvanceSlotsBy.INSTANCE;
        operations.pushOp(advanceSlotsBy);
        androidx.compose.runtime.changelist.Operations m5363constructorimpl = androidx.compose.runtime.changelist.Operations.WriteScope.m5363constructorimpl(operations);
        androidx.compose.runtime.changelist.Operation.AdvanceSlotsBy advanceSlotsBy2 = androidx.compose.runtime.changelist.Operation.AdvanceSlotsBy.INSTANCE;
        m5363constructorimpl.intArgs[m5363constructorimpl.intArgsSize - m5363constructorimpl.opCodes[m5363constructorimpl.opCodesSize - 1].getInts()] = distance;
        operations.ensureAllArgumentsPushedFor(advanceSlotsBy);
    }

    public final void pushUps(int count) {
        androidx.compose.runtime.changelist.Operations operations = this.getHighSpeedVideoFpsRangesFor;
        androidx.compose.runtime.changelist.Operation.Ups ups = androidx.compose.runtime.changelist.Operation.Ups.INSTANCE;
        operations.pushOp(ups);
        androidx.compose.runtime.changelist.Operations m5363constructorimpl = androidx.compose.runtime.changelist.Operations.WriteScope.m5363constructorimpl(operations);
        androidx.compose.runtime.changelist.Operation.Ups ups2 = androidx.compose.runtime.changelist.Operation.Ups.INSTANCE;
        m5363constructorimpl.intArgs[m5363constructorimpl.intArgsSize - m5363constructorimpl.opCodes[m5363constructorimpl.opCodesSize - 1].getInts()] = count;
        operations.ensureAllArgumentsPushedFor(ups);
    }

    public final void pushDowns(java.lang.Object[] nodes) {
        if (nodes.length == 0) {
            return;
        }
        androidx.compose.runtime.changelist.Operations operations = this.getHighSpeedVideoFpsRangesFor;
        androidx.compose.runtime.changelist.Operation.Downs downs = androidx.compose.runtime.changelist.Operation.Downs.INSTANCE;
        operations.pushOp(downs);
        androidx.compose.runtime.changelist.Operations m5363constructorimpl = androidx.compose.runtime.changelist.Operations.WriteScope.m5363constructorimpl(operations);
        androidx.compose.runtime.changelist.Operation.Downs downs2 = androidx.compose.runtime.changelist.Operation.Downs.INSTANCE;
        androidx.compose.runtime.changelist.Operations.WriteScope.m5371setObjectDKhxnng(m5363constructorimpl, androidx.compose.runtime.changelist.Operation.ObjectParameter.m5338constructorimpl(0), nodes);
        operations.ensureAllArgumentsPushedFor(downs);
    }

    public final void pushSideEffect(kotlin.jvm.functions.Function0<kotlin.Unit> effect) {
        androidx.compose.runtime.changelist.Operations operations = this.getHighSpeedVideoFpsRangesFor;
        androidx.compose.runtime.changelist.Operation.SideEffect sideEffect = androidx.compose.runtime.changelist.Operation.SideEffect.INSTANCE;
        operations.pushOp(sideEffect);
        androidx.compose.runtime.changelist.Operations m5363constructorimpl = androidx.compose.runtime.changelist.Operations.WriteScope.m5363constructorimpl(operations);
        androidx.compose.runtime.changelist.Operation.SideEffect sideEffect2 = androidx.compose.runtime.changelist.Operation.SideEffect.INSTANCE;
        androidx.compose.runtime.changelist.Operations.WriteScope.m5371setObjectDKhxnng(m5363constructorimpl, androidx.compose.runtime.changelist.Operation.ObjectParameter.m5338constructorimpl(0), effect);
        operations.ensureAllArgumentsPushedFor(sideEffect);
    }

    public final void pushDetermineMovableContentNodeIndex(androidx.compose.runtime.internal.IntRef effectiveNodeIndexOut, androidx.compose.runtime.Anchor anchor) {
        androidx.compose.runtime.changelist.Operations operations = this.getHighSpeedVideoFpsRangesFor;
        androidx.compose.runtime.changelist.Operation.DetermineMovableContentNodeIndex determineMovableContentNodeIndex = androidx.compose.runtime.changelist.Operation.DetermineMovableContentNodeIndex.INSTANCE;
        operations.pushOp(determineMovableContentNodeIndex);
        androidx.compose.runtime.changelist.Operations m5363constructorimpl = androidx.compose.runtime.changelist.Operations.WriteScope.m5363constructorimpl(operations);
        androidx.compose.runtime.changelist.Operation.DetermineMovableContentNodeIndex determineMovableContentNodeIndex2 = androidx.compose.runtime.changelist.Operation.DetermineMovableContentNodeIndex.INSTANCE;
        int m5338constructorimpl = androidx.compose.runtime.changelist.Operation.ObjectParameter.m5338constructorimpl(0);
        androidx.compose.runtime.changelist.Operation.DetermineMovableContentNodeIndex determineMovableContentNodeIndex3 = androidx.compose.runtime.changelist.Operation.DetermineMovableContentNodeIndex.INSTANCE;
        androidx.compose.runtime.changelist.Operations.WriteScope.m5372setObjects4uCC6AY(m5363constructorimpl, m5338constructorimpl, effectiveNodeIndexOut, androidx.compose.runtime.changelist.Operation.ObjectParameter.m5338constructorimpl(1), anchor);
        operations.ensureAllArgumentsPushedFor(determineMovableContentNodeIndex);
    }

    public final void pushCopyNodesToNewAnchorLocation(java.util.List<? extends java.lang.Object> nodes, androidx.compose.runtime.internal.IntRef effectiveNodeIndex) {
        if (nodes.isEmpty()) {
            return;
        }
        androidx.compose.runtime.changelist.Operations operations = this.getHighSpeedVideoFpsRangesFor;
        androidx.compose.runtime.changelist.Operation.CopyNodesToNewAnchorLocation copyNodesToNewAnchorLocation = androidx.compose.runtime.changelist.Operation.CopyNodesToNewAnchorLocation.INSTANCE;
        operations.pushOp(copyNodesToNewAnchorLocation);
        androidx.compose.runtime.changelist.Operations m5363constructorimpl = androidx.compose.runtime.changelist.Operations.WriteScope.m5363constructorimpl(operations);
        androidx.compose.runtime.changelist.Operation.CopyNodesToNewAnchorLocation copyNodesToNewAnchorLocation2 = androidx.compose.runtime.changelist.Operation.CopyNodesToNewAnchorLocation.INSTANCE;
        int m5338constructorimpl = androidx.compose.runtime.changelist.Operation.ObjectParameter.m5338constructorimpl(1);
        androidx.compose.runtime.changelist.Operation.CopyNodesToNewAnchorLocation copyNodesToNewAnchorLocation3 = androidx.compose.runtime.changelist.Operation.CopyNodesToNewAnchorLocation.INSTANCE;
        androidx.compose.runtime.changelist.Operations.WriteScope.m5372setObjects4uCC6AY(m5363constructorimpl, m5338constructorimpl, nodes, androidx.compose.runtime.changelist.Operation.ObjectParameter.m5338constructorimpl(0), effectiveNodeIndex);
        operations.ensureAllArgumentsPushedFor(copyNodesToNewAnchorLocation);
    }

    public final void pushCopySlotTableToAnchorLocation(androidx.compose.runtime.MovableContentState resolvedState, androidx.compose.runtime.CompositionContext parentContext, androidx.compose.runtime.MovableContentStateReference from, androidx.compose.runtime.MovableContentStateReference to) {
        androidx.compose.runtime.changelist.Operations operations = this.getHighSpeedVideoFpsRangesFor;
        androidx.compose.runtime.changelist.Operation.CopySlotTableToAnchorLocation copySlotTableToAnchorLocation = androidx.compose.runtime.changelist.Operation.CopySlotTableToAnchorLocation.INSTANCE;
        operations.pushOp(copySlotTableToAnchorLocation);
        androidx.compose.runtime.changelist.Operations m5363constructorimpl = androidx.compose.runtime.changelist.Operations.WriteScope.m5363constructorimpl(operations);
        androidx.compose.runtime.changelist.Operation.CopySlotTableToAnchorLocation copySlotTableToAnchorLocation2 = androidx.compose.runtime.changelist.Operation.CopySlotTableToAnchorLocation.INSTANCE;
        int m5338constructorimpl = androidx.compose.runtime.changelist.Operation.ObjectParameter.m5338constructorimpl(0);
        androidx.compose.runtime.changelist.Operation.CopySlotTableToAnchorLocation copySlotTableToAnchorLocation3 = androidx.compose.runtime.changelist.Operation.CopySlotTableToAnchorLocation.INSTANCE;
        int m5338constructorimpl2 = androidx.compose.runtime.changelist.Operation.ObjectParameter.m5338constructorimpl(1);
        androidx.compose.runtime.changelist.Operation.CopySlotTableToAnchorLocation copySlotTableToAnchorLocation4 = androidx.compose.runtime.changelist.Operation.CopySlotTableToAnchorLocation.INSTANCE;
        int m5338constructorimpl3 = androidx.compose.runtime.changelist.Operation.ObjectParameter.m5338constructorimpl(3);
        androidx.compose.runtime.changelist.Operation.CopySlotTableToAnchorLocation copySlotTableToAnchorLocation5 = androidx.compose.runtime.changelist.Operation.CopySlotTableToAnchorLocation.INSTANCE;
        androidx.compose.runtime.changelist.Operations.WriteScope.m5373setObjectsOGa0p1M(m5363constructorimpl, m5338constructorimpl, resolvedState, m5338constructorimpl2, parentContext, m5338constructorimpl3, to, androidx.compose.runtime.changelist.Operation.ObjectParameter.m5338constructorimpl(2), from);
        operations.ensureAllArgumentsPushedFor(copySlotTableToAnchorLocation);
    }

    public final void pushReleaseMovableGroupAtCurrent(androidx.compose.runtime.ControlledComposition composition, androidx.compose.runtime.CompositionContext parentContext, androidx.compose.runtime.MovableContentStateReference reference) {
        androidx.compose.runtime.changelist.Operations operations = this.getHighSpeedVideoFpsRangesFor;
        androidx.compose.runtime.changelist.Operation.ReleaseMovableGroupAtCurrent releaseMovableGroupAtCurrent = androidx.compose.runtime.changelist.Operation.ReleaseMovableGroupAtCurrent.INSTANCE;
        operations.pushOp(releaseMovableGroupAtCurrent);
        androidx.compose.runtime.changelist.Operations m5363constructorimpl = androidx.compose.runtime.changelist.Operations.WriteScope.m5363constructorimpl(operations);
        androidx.compose.runtime.changelist.Operation.ReleaseMovableGroupAtCurrent releaseMovableGroupAtCurrent2 = androidx.compose.runtime.changelist.Operation.ReleaseMovableGroupAtCurrent.INSTANCE;
        int m5338constructorimpl = androidx.compose.runtime.changelist.Operation.ObjectParameter.m5338constructorimpl(0);
        androidx.compose.runtime.changelist.Operation.ReleaseMovableGroupAtCurrent releaseMovableGroupAtCurrent3 = androidx.compose.runtime.changelist.Operation.ReleaseMovableGroupAtCurrent.INSTANCE;
        int m5338constructorimpl2 = androidx.compose.runtime.changelist.Operation.ObjectParameter.m5338constructorimpl(1);
        androidx.compose.runtime.changelist.Operation.ReleaseMovableGroupAtCurrent releaseMovableGroupAtCurrent4 = androidx.compose.runtime.changelist.Operation.ReleaseMovableGroupAtCurrent.INSTANCE;
        androidx.compose.runtime.changelist.Operations.WriteScope.m5374setObjectst7hvbck(m5363constructorimpl, m5338constructorimpl, composition, m5338constructorimpl2, parentContext, androidx.compose.runtime.changelist.Operation.ObjectParameter.m5338constructorimpl(2), reference);
        operations.ensureAllArgumentsPushedFor(releaseMovableGroupAtCurrent);
    }

    public final void pushEndMovableContentPlacement() {
        this.getHighSpeedVideoFpsRangesFor.push(androidx.compose.runtime.changelist.Operation.EndMovableContentPlacement.INSTANCE);
    }

    public static /* synthetic */ void pushExecuteOperationsIn$default(androidx.compose.runtime.changelist.ChangeList changeList, androidx.compose.runtime.changelist.ChangeList changeList2, androidx.compose.runtime.internal.IntRef intRef, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            intRef = null;
        }
        changeList.pushExecuteOperationsIn(changeList2, intRef);
    }

    public final void pushExecuteOperationsIn(androidx.compose.runtime.changelist.ChangeList changeList, androidx.compose.runtime.internal.IntRef effectiveNodeIndex) {
        if (changeList.isNotEmpty()) {
            androidx.compose.runtime.changelist.Operations operations = this.getHighSpeedVideoFpsRangesFor;
            androidx.compose.runtime.changelist.Operation.ApplyChangeList applyChangeList = androidx.compose.runtime.changelist.Operation.ApplyChangeList.INSTANCE;
            operations.pushOp(applyChangeList);
            androidx.compose.runtime.changelist.Operations m5363constructorimpl = androidx.compose.runtime.changelist.Operations.WriteScope.m5363constructorimpl(operations);
            androidx.compose.runtime.changelist.Operation.ApplyChangeList applyChangeList2 = androidx.compose.runtime.changelist.Operation.ApplyChangeList.INSTANCE;
            int m5338constructorimpl = androidx.compose.runtime.changelist.Operation.ObjectParameter.m5338constructorimpl(0);
            androidx.compose.runtime.changelist.Operation.ApplyChangeList applyChangeList3 = androidx.compose.runtime.changelist.Operation.ApplyChangeList.INSTANCE;
            androidx.compose.runtime.changelist.Operations.WriteScope.m5372setObjects4uCC6AY(m5363constructorimpl, m5338constructorimpl, changeList, androidx.compose.runtime.changelist.Operation.ObjectParameter.m5338constructorimpl(1), effectiveNodeIndex);
            operations.ensureAllArgumentsPushedFor(applyChangeList);
        }
    }

    @Override // androidx.compose.runtime.changelist.OperationsDebugStringFormattable
    public final java.lang.String toDebugString(java.lang.String linePrefix) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ChangeList instance containing ");
        sb.append(getSize());
        sb.append(" operations");
        if (sb.length() > 0) {
            sb.append(":\n");
            sb.append(this.getHighSpeedVideoFpsRangesFor.toDebugString(linePrefix));
        }
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }
}
