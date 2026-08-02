package androidx.compose.runtime.changelist;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a/\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\f2\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0002¢\u0006\u0004\b\b\u0010\r\u001a/\u0010\b\u001a\u00020\u000e*\u00020\u000e2\b\u0010\u0001\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0004\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\b\u0010\u0010\u001a\u001b\u0010\b\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\u0011*\f\b\u0000\u0010\u0012\"\u00020\u00052\u00020\u0005"}, d2 = {"Landroidx/compose/runtime/SlotWriter;", "p0", "Landroidx/compose/runtime/Applier;", "", "p1", "", "p2", "", "getHighSpeedVideoFpsRanges", "(Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/Applier;I)V", "Camera2StreamConfigurationMap", "(Landroidx/compose/runtime/SlotWriter;)I", "Landroidx/compose/runtime/Anchor;", "(Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/Anchor;Landroidx/compose/runtime/Applier;)I", "", "Landroidx/compose/runtime/changelist/OperationErrorContext;", "(Ljava/lang/Throwable;Landroidx/compose/runtime/changelist/OperationErrorContext;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/Anchor;)Ljava/lang/Throwable;", "(Landroidx/compose/runtime/changelist/OperationErrorContext;Landroidx/compose/runtime/SlotWriter;)Landroidx/compose/runtime/changelist/OperationErrorContext;", "IntParameter"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OperationKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighSpeedVideoFpsRanges(androidx.compose.runtime.SlotWriter slotWriter, androidx.compose.runtime.Applier<java.lang.Object> applier, int i) {
        while (!slotWriter.indexInParent(i)) {
            slotWriter.skipToGroupEnd();
            if (slotWriter.isNode(slotWriter.getParent())) {
                applier.up();
            }
            slotWriter.endGroup();
        }
    }

    private static final int Camera2StreamConfigurationMap(androidx.compose.runtime.SlotWriter slotWriter) {
        int currentGroup = slotWriter.getCurrentGroup();
        int parent = slotWriter.getParent();
        while (parent >= 0 && !slotWriter.isNode(parent)) {
            parent = slotWriter.parent(parent);
        }
        int i = parent + 1;
        int i2 = 0;
        while (i < currentGroup) {
            if (slotWriter.indexInGroup(currentGroup, i)) {
                if (slotWriter.isNode(i)) {
                    i2 = 0;
                }
                i++;
            } else {
                i2 += slotWriter.isNode(i) ? 1 : slotWriter.nodeCount(i);
                i += slotWriter.groupSize(i);
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getHighSpeedVideoFpsRanges(androidx.compose.runtime.SlotWriter slotWriter, androidx.compose.runtime.Anchor anchor, androidx.compose.runtime.Applier<java.lang.Object> applier) {
        int anchorIndex = slotWriter.anchorIndex(anchor);
        if (slotWriter.getCurrentGroup() >= anchorIndex) {
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        getHighSpeedVideoFpsRanges(slotWriter, applier, anchorIndex);
        int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(slotWriter);
        while (slotWriter.getCurrentGroup() < anchorIndex) {
            if (slotWriter.indexInCurrentGroup(anchorIndex)) {
                if (slotWriter.isNode()) {
                    applier.down(slotWriter.node(slotWriter.getCurrentGroup()));
                    Camera2StreamConfigurationMap = 0;
                }
                slotWriter.startGroup();
            } else {
                Camera2StreamConfigurationMap += slotWriter.skipGroup();
            }
        }
        if (slotWriter.getCurrentGroup() != anchorIndex) {
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        return Camera2StreamConfigurationMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Throwable getHighSpeedVideoFpsRanges(java.lang.Throwable th, final androidx.compose.runtime.changelist.OperationErrorContext operationErrorContext, final androidx.compose.runtime.SlotWriter slotWriter, final androidx.compose.runtime.Anchor anchor) {
        return operationErrorContext == null ? th : androidx.compose.runtime.tooling.ComposeStackTraceKt.attachComposeStackTrace(th, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.runtime.changelist.OperationKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                androidx.compose.runtime.tooling.ComposeStackTrace highSpeedVideoFpsRanges;
                highSpeedVideoFpsRanges = androidx.compose.runtime.changelist.OperationKt.getHighSpeedVideoFpsRanges(androidx.compose.runtime.Anchor.this, slotWriter, operationErrorContext);
                return highSpeedVideoFpsRanges;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.tooling.ComposeStackTrace getHighSpeedVideoFpsRanges(androidx.compose.runtime.Anchor anchor, androidx.compose.runtime.SlotWriter slotWriter, androidx.compose.runtime.changelist.OperationErrorContext operationErrorContext) {
        if (anchor != null) {
            slotWriter.seek(anchor);
        }
        java.util.List buildTrace$default = androidx.compose.runtime.tooling.ComposeStackTraceBuilderKt.buildTrace$default(slotWriter, null, 0, null, 7, null);
        androidx.compose.runtime.tooling.ComposeStackTraceFrame composeStackTraceFrame = (androidx.compose.runtime.tooling.ComposeStackTraceFrame) kotlin.collections.CollectionsKt.lastOrNull(buildTrace$default);
        java.lang.Integer groupOffset = composeStackTraceFrame != null ? composeStackTraceFrame.getGroupOffset() : null;
        java.util.List<androidx.compose.runtime.tooling.ComposeStackTraceFrame> buildStackTrace = operationErrorContext.buildStackTrace(groupOffset);
        if (groupOffset != null && !buildStackTrace.isEmpty()) {
            buildStackTrace = kotlin.collections.CollectionsKt.plus((java.util.Collection) kotlin.collections.CollectionsKt.listOf(androidx.compose.runtime.tooling.ComposeStackTraceFrame.copy$default((androidx.compose.runtime.tooling.ComposeStackTraceFrame) kotlin.collections.CollectionsKt.first((java.util.List) buildStackTrace), 0, null, groupOffset, 3, null)), (java.lang.Iterable) kotlin.collections.CollectionsKt.drop(buildStackTrace, 1));
        }
        return new androidx.compose.runtime.tooling.ComposeStackTrace(kotlin.collections.CollectionsKt.plus((java.util.Collection) buildTrace$default, (java.lang.Iterable) buildStackTrace));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.changelist.OperationErrorContext getHighSpeedVideoFpsRanges(final androidx.compose.runtime.changelist.OperationErrorContext operationErrorContext, final androidx.compose.runtime.SlotWriter slotWriter) {
        return new androidx.compose.runtime.changelist.OperationErrorContext() { // from class: androidx.compose.runtime.changelist.OperationKt$withCurrentStackTrace$1
            @Override // androidx.compose.runtime.changelist.OperationErrorContext
            public final java.util.List<androidx.compose.runtime.tooling.ComposeStackTraceFrame> buildStackTrace(java.lang.Integer currentOffset) {
                java.util.List<androidx.compose.runtime.tooling.ComposeStackTraceFrame> buildStackTrace = androidx.compose.runtime.changelist.OperationErrorContext.this.buildStackTrace(null);
                int parent = slotWriter.getParent();
                if (parent < 0) {
                    return buildStackTrace;
                }
                androidx.compose.runtime.SlotWriter slotWriter2 = slotWriter;
                return kotlin.collections.CollectionsKt.plus((java.util.Collection) androidx.compose.runtime.tooling.ComposeStackTraceBuilderKt.buildTrace(slotWriter2, currentOffset, parent, java.lang.Integer.valueOf(slotWriter2.parent(parent))), (java.lang.Iterable) buildStackTrace);
            }
        };
    }
}
