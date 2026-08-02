package androidx.compose.foundation.text.input;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001!B#\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0012R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R/\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u00028C@CX\u0083\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u0014\u0010\u0010R\u0011\u0010\u001e\u001a\u00020\u001b8G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010 \u001a\u00020\u001b8G¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001d"}, d2 = {"Landroidx/compose/foundation/text/input/TextUndoManager;", "", "Landroidx/compose/foundation/text/input/internal/undo/TextUndoOperation;", "initialStagingUndo", "Landroidx/compose/foundation/text/input/internal/undo/UndoManager;", "undoManager", "<init>", "(Landroidx/compose/foundation/text/input/internal/undo/TextUndoOperation;Landroidx/compose/foundation/text/input/internal/undo/UndoManager;)V", "Landroidx/compose/foundation/text/input/TextFieldState;", "state", "", "undo", "(Landroidx/compose/foundation/text/input/TextFieldState;)V", "redo", "op", "record", "(Landroidx/compose/foundation/text/input/internal/undo/TextUndoOperation;)V", "clearHistory", "()V", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Landroidx/compose/foundation/text/input/internal/undo/UndoManager;", "getHighSpeedVideoFpsRanges", "p0", "Landroidx/compose/runtime/MutableState;", "getHighResolutionOutputSizeshNQ4ISI", "()Landroidx/compose/foundation/text/input/internal/undo/TextUndoOperation;", "", "getCanUndo", "()Z", "canUndo", "getCanRedo", "canRedo", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextUndoManager {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.foundation.text.input.internal.undo.UndoManager<androidx.compose.foundation.text.input.internal.undo.TextUndoOperation> getHighSpeedVideoFpsRanges;
    public static final int $stable = 8;

    public TextUndoManager(androidx.compose.foundation.text.input.internal.undo.TextUndoOperation textUndoOperation, androidx.compose.foundation.text.input.internal.undo.UndoManager<androidx.compose.foundation.text.input.internal.undo.TextUndoOperation> undoManager) {
        this.getHighSpeedVideoFpsRanges = undoManager;
        this.getHighSpeedVideoSizes = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(textUndoOperation, null, 2, null);
    }

    public /* synthetic */ TextUndoManager(androidx.compose.foundation.text.input.internal.undo.TextUndoOperation textUndoOperation, androidx.compose.foundation.text.input.internal.undo.UndoManager undoManager, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : textUndoOperation, (i & 2) != 0 ? new androidx.compose.foundation.text.input.internal.undo.UndoManager(null, null, 100, 3, null) : undoManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final androidx.compose.foundation.text.input.internal.undo.TextUndoOperation getHighResolutionOutputSizeshNQ4ISI() {
        return (androidx.compose.foundation.text.input.internal.undo.TextUndoOperation) this.getHighSpeedVideoSizes.getValue();
    }

    private final void getHighSpeedVideoSizes(androidx.compose.foundation.text.input.internal.undo.TextUndoOperation textUndoOperation) {
        this.getHighSpeedVideoSizes.setValue(textUndoOperation);
    }

    public final boolean getCanUndo() {
        return this.getHighSpeedVideoFpsRanges.getCanUndo$foundation() || getHighResolutionOutputSizeshNQ4ISI() != null;
    }

    public final boolean getCanRedo() {
        return this.getHighSpeedVideoFpsRanges.getCanRedo$foundation() && getHighResolutionOutputSizeshNQ4ISI() == null;
    }

    public final void undo(androidx.compose.foundation.text.input.TextFieldState state) {
        if (getCanUndo()) {
            getHighSpeedVideoFpsRangesFor();
            androidx.compose.foundation.text.input.internal.undo.TextUndoOperationKt.undo(state, this.getHighSpeedVideoFpsRanges.undo());
        }
    }

    public final void redo(androidx.compose.foundation.text.input.TextFieldState state) {
        if (getCanRedo()) {
            androidx.compose.foundation.text.input.internal.undo.TextUndoOperationKt.redo(state, this.getHighSpeedVideoFpsRanges.redo());
        }
    }

    public final void record(androidx.compose.foundation.text.input.internal.undo.TextUndoOperation op) {
        androidx.compose.runtime.snapshots.Snapshot.Companion companion = androidx.compose.runtime.snapshots.Snapshot.INSTANCE;
        androidx.compose.runtime.snapshots.Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        androidx.compose.runtime.snapshots.Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            androidx.compose.foundation.text.input.internal.undo.TextUndoOperation highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
            if (highResolutionOutputSizeshNQ4ISI == null) {
                getHighSpeedVideoSizes(op);
                return;
            }
            androidx.compose.foundation.text.input.internal.undo.TextUndoOperation merge = androidx.compose.foundation.text.input.TextUndoManagerKt.merge(highResolutionOutputSizeshNQ4ISI, op);
            if (merge != null) {
                getHighSpeedVideoSizes(merge);
            } else {
                getHighSpeedVideoFpsRangesFor();
                getHighSpeedVideoSizes(op);
            }
        } finally {
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
        }
    }

    public final void clearHistory() {
        getHighSpeedVideoSizes(null);
        this.getHighSpeedVideoFpsRanges.clearHistory();
    }

    private final void getHighSpeedVideoFpsRangesFor() {
        androidx.compose.runtime.snapshots.Snapshot.Companion companion = androidx.compose.runtime.snapshots.Snapshot.INSTANCE;
        androidx.compose.runtime.snapshots.Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        androidx.compose.runtime.snapshots.Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            androidx.compose.foundation.text.input.internal.undo.TextUndoOperation highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
            if (highResolutionOutputSizeshNQ4ISI != null) {
                this.getHighSpeedVideoFpsRanges.record(highResolutionOutputSizeshNQ4ISI);
            }
            getHighSpeedVideoSizes(null);
        } finally {
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TextUndoManager() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
