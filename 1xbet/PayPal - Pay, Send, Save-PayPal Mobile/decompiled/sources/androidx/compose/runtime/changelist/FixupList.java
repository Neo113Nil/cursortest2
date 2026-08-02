package androidx.compose.runtime.changelist;

@kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\u0003J3\u0010\u0012\u001a\u00020\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u001b\u001a\u00020\b2\u000e\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\u0003J@\u0010$\u001a\u00020\b\"\u0004\b\u0000\u0010\u001e\"\u0004\b\u0001\u0010\u001f2\u0006\u0010 \u001a\u00028\u00002\u001d\u0010#\u001a\u0019\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0!¢\u0006\u0002\b\"¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020&2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010,R\u0011\u00102\u001a\u00020\u00178G¢\u0006\u0006\u001a\u0004\b0\u00101"}, d2 = {"Landroidx/compose/runtime/changelist/FixupList;", "Landroidx/compose/runtime/changelist/OperationsDebugStringFormattable;", "<init>", "()V", "", "isEmpty", "()Z", "isNotEmpty", "", "clear", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "Landroidx/compose/runtime/changelist/OperationErrorContext;", "errorContext", "executeAndFlushAllPendingFixups", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;Landroidx/compose/runtime/changelist/OperationErrorContext;)V", "Lkotlin/Function0;", "", "factory", "", "insertIndex", "Landroidx/compose/runtime/Anchor;", "groupAnchor", "createAndInsertNode", "(Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Anchor;)V", "endNodeInsert", "V", "T", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "block", "updateNode", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "", "linePrefix", "toDebugString", "(Ljava/lang/String;)Ljava/lang/String;", "Landroidx/compose/runtime/changelist/Operations;", "getHighSpeedVideoSizes", "Landroidx/compose/runtime/changelist/Operations;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "getSize", "()I", io.ktor.http.ContentDisposition.Parameters.Size}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FixupList extends androidx.compose.runtime.changelist.OperationsDebugStringFormattable {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.runtime.changelist.Operations getHighResolutionOutputSizeshNQ4ISI = new androidx.compose.runtime.changelist.Operations();

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.runtime.changelist.Operations Camera2StreamConfigurationMap = new androidx.compose.runtime.changelist.Operations();

    public final int getSize() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getOpCodesSize();
    }

    public final boolean isEmpty() {
        return this.getHighResolutionOutputSizeshNQ4ISI.isEmpty();
    }

    public final boolean isNotEmpty() {
        return this.getHighResolutionOutputSizeshNQ4ISI.isNotEmpty();
    }

    public final void clear() {
        this.Camera2StreamConfigurationMap.clear();
        this.getHighResolutionOutputSizeshNQ4ISI.clear();
    }

    public final void executeAndFlushAllPendingFixups(androidx.compose.runtime.Applier<?> applier, androidx.compose.runtime.SlotWriter slots, androidx.compose.runtime.RememberManager rememberManager, androidx.compose.runtime.changelist.OperationErrorContext errorContext) {
        if (!this.Camera2StreamConfigurationMap.isEmpty()) {
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        this.getHighResolutionOutputSizeshNQ4ISI.executeAndFlushAllPendingOperations(applier, slots, rememberManager, errorContext);
    }

    public final void createAndInsertNode(kotlin.jvm.functions.Function0<? extends java.lang.Object> factory, int insertIndex, androidx.compose.runtime.Anchor groupAnchor) {
        androidx.compose.runtime.changelist.Operations operations = this.getHighResolutionOutputSizeshNQ4ISI;
        androidx.compose.runtime.changelist.Operation.InsertNodeFixup insertNodeFixup = androidx.compose.runtime.changelist.Operation.InsertNodeFixup.INSTANCE;
        operations.pushOp(insertNodeFixup);
        androidx.compose.runtime.changelist.Operations m5363constructorimpl = androidx.compose.runtime.changelist.Operations.WriteScope.m5363constructorimpl(operations);
        androidx.compose.runtime.changelist.Operation.InsertNodeFixup insertNodeFixup2 = androidx.compose.runtime.changelist.Operation.InsertNodeFixup.INSTANCE;
        androidx.compose.runtime.changelist.Operations.WriteScope.m5371setObjectDKhxnng(m5363constructorimpl, androidx.compose.runtime.changelist.Operation.ObjectParameter.m5338constructorimpl(0), factory);
        androidx.compose.runtime.changelist.Operation.InsertNodeFixup insertNodeFixup3 = androidx.compose.runtime.changelist.Operation.InsertNodeFixup.INSTANCE;
        m5363constructorimpl.intArgs[m5363constructorimpl.intArgsSize - m5363constructorimpl.opCodes[m5363constructorimpl.opCodesSize - 1].getInts()] = insertIndex;
        androidx.compose.runtime.changelist.Operation.InsertNodeFixup insertNodeFixup4 = androidx.compose.runtime.changelist.Operation.InsertNodeFixup.INSTANCE;
        androidx.compose.runtime.changelist.Operations.WriteScope.m5371setObjectDKhxnng(m5363constructorimpl, androidx.compose.runtime.changelist.Operation.ObjectParameter.m5338constructorimpl(1), groupAnchor);
        operations.ensureAllArgumentsPushedFor(insertNodeFixup);
        androidx.compose.runtime.changelist.Operations operations2 = this.Camera2StreamConfigurationMap;
        androidx.compose.runtime.changelist.Operation.PostInsertNodeFixup postInsertNodeFixup = androidx.compose.runtime.changelist.Operation.PostInsertNodeFixup.INSTANCE;
        operations2.pushOp(postInsertNodeFixup);
        androidx.compose.runtime.changelist.Operations m5363constructorimpl2 = androidx.compose.runtime.changelist.Operations.WriteScope.m5363constructorimpl(operations2);
        androidx.compose.runtime.changelist.Operation.PostInsertNodeFixup postInsertNodeFixup2 = androidx.compose.runtime.changelist.Operation.PostInsertNodeFixup.INSTANCE;
        m5363constructorimpl2.intArgs[m5363constructorimpl2.intArgsSize - m5363constructorimpl2.opCodes[m5363constructorimpl2.opCodesSize - 1].getInts()] = insertIndex;
        androidx.compose.runtime.changelist.Operation.PostInsertNodeFixup postInsertNodeFixup3 = androidx.compose.runtime.changelist.Operation.PostInsertNodeFixup.INSTANCE;
        androidx.compose.runtime.changelist.Operations.WriteScope.m5371setObjectDKhxnng(m5363constructorimpl2, androidx.compose.runtime.changelist.Operation.ObjectParameter.m5338constructorimpl(0), groupAnchor);
        operations2.ensureAllArgumentsPushedFor(postInsertNodeFixup);
    }

    public final void endNodeInsert() {
        if (!this.Camera2StreamConfigurationMap.isNotEmpty()) {
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("Cannot end node insertion, there are no pending operations that can be realized.");
        }
        this.Camera2StreamConfigurationMap.popInto(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final <V, T> void updateNode(V value, kotlin.jvm.functions.Function2<? super T, ? super V, kotlin.Unit> block) {
        androidx.compose.runtime.changelist.Operations operations = this.getHighResolutionOutputSizeshNQ4ISI;
        androidx.compose.runtime.changelist.Operation.UpdateNode updateNode = androidx.compose.runtime.changelist.Operation.UpdateNode.INSTANCE;
        operations.pushOp(updateNode);
        androidx.compose.runtime.changelist.Operations m5363constructorimpl = androidx.compose.runtime.changelist.Operations.WriteScope.m5363constructorimpl(operations);
        androidx.compose.runtime.changelist.Operation.UpdateNode updateNode2 = androidx.compose.runtime.changelist.Operation.UpdateNode.INSTANCE;
        androidx.compose.runtime.changelist.Operations.WriteScope.m5371setObjectDKhxnng(m5363constructorimpl, androidx.compose.runtime.changelist.Operation.ObjectParameter.m5338constructorimpl(0), value);
        androidx.compose.runtime.changelist.Operation.UpdateNode updateNode3 = androidx.compose.runtime.changelist.Operation.UpdateNode.INSTANCE;
        int m5338constructorimpl = androidx.compose.runtime.changelist.Operation.ObjectParameter.m5338constructorimpl(1);
        kotlin.jvm.internal.Intrinsics.checkNotNull(block, "");
        androidx.compose.runtime.changelist.Operations.WriteScope.m5371setObjectDKhxnng(m5363constructorimpl, m5338constructorimpl, (kotlin.jvm.functions.Function2) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(block, 2));
        operations.ensureAllArgumentsPushedFor(updateNode);
    }

    @Override // androidx.compose.runtime.changelist.OperationsDebugStringFormattable
    public final java.lang.String toDebugString(java.lang.String linePrefix) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("FixupList instance containing ");
        sb2.append(getSize());
        sb2.append(" operations");
        sb.append(sb2.toString());
        if (sb.length() > 0) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder(":\n");
            sb3.append(this.getHighResolutionOutputSizeshNQ4ISI.toDebugString(linePrefix));
            sb.append(sb3.toString());
        }
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }
}
