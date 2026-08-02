package androidx.compose.foundation.text.input.internal.undo;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u0000 #*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001#B1\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u001d\u001a\u00020\u001a8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001a8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\"\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b \u0010!"}, d2 = {"Landroidx/compose/foundation/text/input/internal/undo/UndoManager;", "T", "", "", "initialUndoStack", "initialRedoStack", "", "capacity", "<init>", "(Ljava/util/List;Ljava/util/List;I)V", "undoableAction", "", "record", "(Ljava/lang/Object;)V", "undo", "()Ljava/lang/Object;", "redo", "clearHistory", "()V", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "", "getCanUndo$foundation", "()Z", "canUndo", "getCanRedo$foundation", "canRedo", "getSize", "()I", io.ktor.http.ContentDisposition.Parameters.Size, "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UndoManager<T> {
    private final int Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.runtime.snapshots.SnapshotStateList<T> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private androidx.compose.runtime.snapshots.SnapshotStateList<T> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.foundation.text.input.internal.undo.UndoManager.Companion INSTANCE = new androidx.compose.foundation.text.input.internal.undo.UndoManager.Companion(null);
    public static final int $stable = 8;

    public UndoManager(java.util.List<? extends T> list, java.util.List<? extends T> list2, int i) {
        this.Camera2StreamConfigurationMap = i;
        if (i < 0) {
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException("Capacity must be a positive integer");
        }
        if (list2.size() + list.size() > i) {
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException("Initial list of undo and redo operations have a size greater than the given capacity.");
        }
        androidx.compose.runtime.snapshots.SnapshotStateList<T> snapshotStateList = new androidx.compose.runtime.snapshots.SnapshotStateList<>();
        snapshotStateList.addAll(list);
        this.getHighResolutionOutputSizeshNQ4ISI = snapshotStateList;
        androidx.compose.runtime.snapshots.SnapshotStateList<T> snapshotStateList2 = new androidx.compose.runtime.snapshots.SnapshotStateList<>();
        snapshotStateList2.addAll(list2);
        this.getHighSpeedVideoFpsRanges = snapshotStateList2;
    }

    public /* synthetic */ UndoManager(java.util.List list, java.util.List list2, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i2 & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2, (i2 & 4) != 0 ? 100 : i);
    }

    public final boolean getCanUndo$foundation() {
        return !this.getHighResolutionOutputSizeshNQ4ISI.isEmpty();
    }

    public final boolean getCanRedo$foundation() {
        return !this.getHighSpeedVideoFpsRanges.isEmpty();
    }

    public final int getSize() {
        return this.getHighResolutionOutputSizeshNQ4ISI.size() + this.getHighSpeedVideoFpsRanges.size();
    }

    public final void record(T undoableAction) {
        this.getHighSpeedVideoFpsRanges.clear();
        while (getSize() > this.Camera2StreamConfigurationMap - 1) {
            kotlin.collections.CollectionsKt.removeFirst(this.getHighResolutionOutputSizeshNQ4ISI);
        }
        this.getHighResolutionOutputSizeshNQ4ISI.add(undoableAction);
    }

    public final T undo() {
        if (!getCanUndo$foundation()) {
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalStateException("It's an error to call undo while there is nothing to undo. Please first check `canUndo` value before calling the `undo` function.");
        }
        T t = (T) kotlin.collections.CollectionsKt.removeLast(this.getHighResolutionOutputSizeshNQ4ISI);
        this.getHighSpeedVideoFpsRanges.add(t);
        return t;
    }

    public final T redo() {
        if (!getCanRedo$foundation()) {
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalStateException("It's an error to call redo while there is nothing to redo. Please first check `canRedo` value before calling the `redo` function.");
        }
        T t = (T) kotlin.collections.CollectionsKt.removeLast(this.getHighSpeedVideoFpsRanges);
        this.getHighResolutionOutputSizeshNQ4ISI.add(t);
        return t;
    }

    public final void clearHistory() {
        this.getHighResolutionOutputSizeshNQ4ISI.clear();
        this.getHighSpeedVideoFpsRanges.clear();
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J>\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0004\u0012\u00020\u00010\u0005\"\u0006\b\u0001\u0010\u0004\u0018\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00010\u0005H\u0086\b¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/foundation/text/input/internal/undo/UndoManager$Companion;", "", "<init>", "()V", "T", "Landroidx/compose/runtime/saveable/Saver;", "itemSaver", "Landroidx/compose/foundation/text/input/internal/undo/UndoManager;", "createSaver", "(Landroidx/compose/runtime/saveable/Saver;)Landroidx/compose/runtime/saveable/Saver;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final /* synthetic */ <T> androidx.compose.runtime.saveable.Saver<androidx.compose.foundation.text.input.internal.undo.UndoManager<T>, java.lang.Object> createSaver(final androidx.compose.runtime.saveable.Saver<T, java.lang.Object> itemSaver) {
            kotlin.jvm.internal.Intrinsics.needClassReification();
            return new androidx.compose.runtime.saveable.Saver<androidx.compose.foundation.text.input.internal.undo.UndoManager<T>, java.lang.Object>() { // from class: androidx.compose.foundation.text.input.internal.undo.UndoManager$Companion$createSaver$1
                @Override // androidx.compose.runtime.saveable.Saver
                public final java.lang.Object save(androidx.compose.runtime.saveable.SaverScope saverScope, androidx.compose.foundation.text.input.internal.undo.UndoManager<T> undoManager) {
                    int i;
                    androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList;
                    androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList2;
                    androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList3;
                    androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList4;
                    androidx.compose.runtime.saveable.Saver<T, java.lang.Object> saver = itemSaver;
                    java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
                    i = ((androidx.compose.foundation.text.input.internal.undo.UndoManager) undoManager).Camera2StreamConfigurationMap;
                    createListBuilder.add(java.lang.Integer.valueOf(i));
                    snapshotStateList = ((androidx.compose.foundation.text.input.internal.undo.UndoManager) undoManager).getHighResolutionOutputSizeshNQ4ISI;
                    createListBuilder.add(java.lang.Integer.valueOf(snapshotStateList.size()));
                    snapshotStateList2 = ((androidx.compose.foundation.text.input.internal.undo.UndoManager) undoManager).getHighSpeedVideoFpsRanges;
                    createListBuilder.add(java.lang.Integer.valueOf(snapshotStateList2.size()));
                    snapshotStateList3 = ((androidx.compose.foundation.text.input.internal.undo.UndoManager) undoManager).getHighResolutionOutputSizeshNQ4ISI;
                    androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList5 = snapshotStateList3;
                    int size = snapshotStateList5.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        createListBuilder.add(saver.save(saverScope, snapshotStateList5.get(i2)));
                    }
                    snapshotStateList4 = ((androidx.compose.foundation.text.input.internal.undo.UndoManager) undoManager).getHighSpeedVideoFpsRanges;
                    androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList6 = snapshotStateList4;
                    int size2 = snapshotStateList6.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        createListBuilder.add(saver.save(saverScope, snapshotStateList6.get(i3)));
                    }
                    return kotlin.collections.CollectionsKt.build(createListBuilder);
                }

                @Override // androidx.compose.runtime.saveable.Saver
                public final androidx.compose.foundation.text.input.internal.undo.UndoManager<T> restore(java.lang.Object value) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(value, "");
                    java.util.List list = (java.util.List) value;
                    int intValue = ((java.lang.Number) list.get(0)).intValue();
                    int intValue2 = ((java.lang.Number) list.get(1)).intValue();
                    int intValue3 = ((java.lang.Number) list.get(2)).intValue();
                    androidx.compose.runtime.saveable.Saver<T, java.lang.Object> saver = itemSaver;
                    java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
                    int i = 3;
                    while (i < intValue2 + 3) {
                        T restore = saver.restore(list.get(i));
                        kotlin.jvm.internal.Intrinsics.checkNotNull(restore);
                        createListBuilder.add(restore);
                        i++;
                    }
                    java.util.List build = kotlin.collections.CollectionsKt.build(createListBuilder);
                    androidx.compose.runtime.saveable.Saver<T, java.lang.Object> saver2 = itemSaver;
                    java.util.List createListBuilder2 = kotlin.collections.CollectionsKt.createListBuilder();
                    while (i < intValue2 + intValue3 + 3) {
                        T restore2 = saver2.restore(list.get(i));
                        kotlin.jvm.internal.Intrinsics.checkNotNull(restore2);
                        createListBuilder2.add(restore2);
                        i++;
                    }
                    return new androidx.compose.foundation.text.input.internal.undo.UndoManager<>(build, kotlin.collections.CollectionsKt.build(createListBuilder2), intValue);
                }
            };
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public UndoManager() {
        this(null, null, 0, 7, null);
    }
}
