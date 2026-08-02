package androidx.compose.runtime.tooling;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\nH\u0000¢\u0006\u0004\b\b\u0010\u000b\u001a+\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\f\u0010\r\u001a0\u0010\u0014\u001a\u0004\u0018\u00010\u0013*\u00020\u000e2\u0019\u0010\u0012\u001a\u0015\u0012\u000b\u0012\t\u0018\u00010\u0001¢\u0006\u0002\b\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u0003*\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/compose/runtime/SlotWriter;", "", "child", "", "group", "parent", "", "Landroidx/compose/runtime/tooling/ComposeStackTraceFrame;", "buildTrace", "(Landroidx/compose/runtime/SlotWriter;Ljava/lang/Object;ILjava/lang/Integer;)Ljava/util/List;", "Landroidx/compose/runtime/SlotReader;", "(Landroidx/compose/runtime/SlotReader;)Ljava/util/List;", "traceForGroup", "(Landroidx/compose/runtime/SlotReader;ILjava/lang/Object;)Ljava/util/List;", "Landroidx/compose/runtime/SlotTable;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "", com.paypal.oslo.feature.activity.analytics.ActivityAnalyticsConstants.Ledger.FILTER, "Landroidx/compose/runtime/tooling/ObjectLocation;", "findLocation", "(Landroidx/compose/runtime/SlotTable;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/tooling/ObjectLocation;", "Landroidx/compose/runtime/CompositionContext;", "context", "findSubcompositionContextGroup", "(Landroidx/compose/runtime/SlotTable;Landroidx/compose/runtime/CompositionContext;)Ljava/lang/Integer;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposeStackTraceBuilderKt {
    public static /* synthetic */ java.util.List buildTrace$default(androidx.compose.runtime.SlotWriter slotWriter, java.lang.Object obj, int i, java.lang.Integer num, int i2, java.lang.Object obj2) {
        if ((i2 & 1) != 0) {
            obj = null;
        }
        if ((i2 & 2) != 0) {
            i = slotWriter.getCurrentGroup();
        }
        if ((i2 & 4) != 0) {
            num = null;
        }
        return buildTrace(slotWriter, obj, i, num);
    }

    public static final java.util.List<androidx.compose.runtime.tooling.ComposeStackTraceFrame> buildTrace(androidx.compose.runtime.SlotWriter slotWriter, java.lang.Object obj, int i, java.lang.Integer num) {
        int parent;
        int groupKey;
        java.lang.Object empty;
        if (!slotWriter.getClosed() && slotWriter.getSize$runtime() != 0) {
            androidx.compose.runtime.tooling.WriterTraceBuilder writerTraceBuilder = new androidx.compose.runtime.tooling.WriterTraceBuilder(slotWriter);
            if (num != null) {
                parent = num.intValue();
            } else {
                parent = slotWriter.getParent() < 0 ? slotWriter.parent(i) : slotWriter.getParent();
            }
            if (obj == null) {
                obj = java.lang.Integer.valueOf(slotWriter.groupSlotIndex(i));
            }
            if (slotWriter.isValid(i)) {
                groupKey = slotWriter.groupKey(i);
            } else {
                int parent2 = parent >= 0 ? slotWriter.parent(parent) : parent;
                groupKey = slotWriter.groupKey(parent);
                int i2 = parent;
                parent = parent2;
                i = i2;
            }
            while (i >= 0) {
                if (slotWriter.hasObjectKey(i)) {
                    empty = slotWriter.groupObjectKey(i);
                } else {
                    empty = androidx.compose.runtime.Composer.INSTANCE.getEmpty();
                }
                writerTraceBuilder.processEdge(groupKey, empty, slotWriter.sourceInformationOf$runtime(i), obj);
                obj = slotWriter.anchor(i);
                if (parent >= 0) {
                    int parent3 = slotWriter.parent(parent);
                    groupKey = slotWriter.groupKey(parent);
                    int i3 = parent;
                    parent = parent3;
                    i = i3;
                } else {
                    i = parent;
                }
            }
            return writerTraceBuilder.trace();
        }
        return kotlin.collections.CollectionsKt.emptyList();
    }

    public static final java.util.List<androidx.compose.runtime.tooling.ComposeStackTraceFrame> buildTrace(androidx.compose.runtime.SlotReader slotReader) {
        java.lang.Object empty;
        if (!slotReader.getClosed() && slotReader.getGetHighSpeedVideoFpsRanges() != 0) {
            androidx.compose.runtime.tooling.ReaderTraceBuilder readerTraceBuilder = new androidx.compose.runtime.tooling.ReaderTraceBuilder(slotReader);
            int parent = slotReader.getParent();
            java.lang.Object valueOf = java.lang.Integer.valueOf(slotReader.getSlot());
            while (parent >= 0) {
                if (slotReader.hasObjectKey(parent)) {
                    empty = slotReader.groupObjectKey(parent);
                } else {
                    empty = androidx.compose.runtime.Composer.INSTANCE.getEmpty();
                }
                readerTraceBuilder.processEdge(slotReader.groupKey(parent), empty, slotReader.getTable().sourceInformationOf(parent), valueOf);
                valueOf = slotReader.anchor(parent);
                parent = slotReader.parent(parent);
            }
            return readerTraceBuilder.trace();
        }
        return kotlin.collections.CollectionsKt.emptyList();
    }

    public static final java.util.List<androidx.compose.runtime.tooling.ComposeStackTraceFrame> traceForGroup(androidx.compose.runtime.SlotReader slotReader, int i, java.lang.Object obj) {
        java.lang.Object empty;
        androidx.compose.runtime.tooling.ReaderTraceBuilder readerTraceBuilder = new androidx.compose.runtime.tooling.ReaderTraceBuilder(slotReader);
        int parent = slotReader.parent(i);
        androidx.compose.runtime.Anchor anchor = slotReader.anchor(i);
        while (i >= 0) {
            if (slotReader.hasObjectKey(i)) {
                empty = slotReader.groupObjectKey(i);
            } else {
                empty = androidx.compose.runtime.Composer.INSTANCE.getEmpty();
            }
            readerTraceBuilder.processEdge(slotReader.groupKey(i), empty, slotReader.getTable().sourceInformationOf(i), obj);
            if (parent >= 0) {
                androidx.compose.runtime.Anchor anchor2 = anchor;
                anchor = slotReader.anchor(parent);
                i = parent;
                parent = slotReader.parent(parent);
                obj = anchor2;
            } else {
                i = parent;
                obj = anchor;
            }
        }
        return readerTraceBuilder.trace();
    }

    private static final java.lang.Integer getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.SlotReader slotReader, androidx.compose.runtime.CompositionContext compositionContext, int i, int i2) {
        java.lang.Integer highSpeedVideoFpsRangesFor;
        while (true) {
            if (i >= i2) {
                return null;
            }
            int groupSize = slotReader.groupSize(i) + i;
            if (slotReader.hasMark(i) && slotReader.groupKey(i) == 206 && kotlin.jvm.internal.Intrinsics.areEqual(slotReader.groupObjectKey(i), androidx.compose.runtime.ComposerKt.getReference())) {
                java.lang.Object groupGet = slotReader.groupGet(i, 0);
                androidx.compose.runtime.RememberObserverHolder rememberObserverHolder = groupGet instanceof androidx.compose.runtime.RememberObserverHolder ? (androidx.compose.runtime.RememberObserverHolder) groupGet : null;
                java.lang.Object wrapped = rememberObserverHolder != null ? rememberObserverHolder.getWrapped() : null;
                androidx.compose.runtime.ComposerImpl.CompositionContextHolder compositionContextHolder = wrapped instanceof androidx.compose.runtime.ComposerImpl.CompositionContextHolder ? (androidx.compose.runtime.ComposerImpl.CompositionContextHolder) wrapped : null;
                if (compositionContextHolder != null && kotlin.jvm.internal.Intrinsics.areEqual(compositionContextHolder.getRef(), compositionContext)) {
                    return java.lang.Integer.valueOf(i);
                }
            }
            if (slotReader.containsMark(i) && (highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(slotReader, compositionContext, i + 1, groupSize)) != null) {
                return java.lang.Integer.valueOf(highSpeedVideoFpsRangesFor.intValue());
            }
            i = groupSize;
        }
    }

    public static final androidx.compose.runtime.tooling.ObjectLocation findLocation(androidx.compose.runtime.SlotTable slotTable, kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Boolean> function1) {
        androidx.compose.runtime.SlotReader openReader = slotTable.openReader();
        for (int i = 0; i < slotTable.getGroupsSize(); i++) {
            try {
                if (openReader.isNode(i) && function1.invoke(openReader.node(i)).booleanValue()) {
                    return new androidx.compose.runtime.tooling.ObjectLocation(i, null);
                }
                int slotSize = openReader.slotSize(i);
                for (int i2 = 0; i2 < slotSize; i2++) {
                    if (function1.invoke(openReader.groupGet(i, i2)).booleanValue()) {
                        return new androidx.compose.runtime.tooling.ObjectLocation(i, java.lang.Integer.valueOf(i2));
                    }
                }
            } finally {
                openReader.close();
            }
        }
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        return null;
    }

    public static final java.lang.Integer findSubcompositionContextGroup(androidx.compose.runtime.SlotTable slotTable, androidx.compose.runtime.CompositionContext compositionContext) {
        androidx.compose.runtime.SlotReader openReader = slotTable.openReader();
        try {
            return getHighSpeedVideoFpsRangesFor(openReader, compositionContext, 0, openReader.getGetHighSpeedVideoFpsRanges());
        } finally {
            openReader.close();
        }
    }
}
