package androidx.compose.foundation.text;

/* compiled from: UndoManager.kt */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0019B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013J\b\u0010\u0015\u001a\u00020\u0010H\u0002J\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\bJ\b\u0010\u0018\u001a\u0004\u0018\u00010\u0013R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/text/UndoManager;", "", "maxStoredCharacters", "", "(I)V", "forceNextSnapshot", "", "lastSnapshot", "", "Ljava/lang/Long;", "getMaxStoredCharacters", "()I", "redoStack", "Landroidx/compose/foundation/text/UndoManager$Entry;", "storedCharacters", "undoStack", "", "makeSnapshot", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "redo", "removeLastUndo", "snapshotIfNeeded", "now", "undo", "Entry", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UndoManager {
    public static final int $stable = 8;
    private boolean forceNextSnapshot;
    private java.lang.Long lastSnapshot;
    private final int maxStoredCharacters;
    private androidx.compose.foundation.text.UndoManager.Entry redoStack;
    private int storedCharacters;
    private androidx.compose.foundation.text.UndoManager.Entry undoStack;

    public UndoManager() {
        this(0, 1, null);
    }

    public UndoManager(int i) {
        this.maxStoredCharacters = i;
    }

    public /* synthetic */ UndoManager(int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 100000 : i);
    }

    public final int getMaxStoredCharacters() {
        return this.maxStoredCharacters;
    }

    /* compiled from: UndoManager.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0000X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/foundation/text/UndoManager$Entry;", "", io.ktor.http.LinkHeader.Rel.Next, "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "(Landroidx/compose/foundation/text/UndoManager$Entry;Landroidx/compose/ui/text/input/TextFieldValue;)V", "getNext", "()Landroidx/compose/foundation/text/UndoManager$Entry;", "setNext", "(Landroidx/compose/foundation/text/UndoManager$Entry;)V", "getValue", "()Landroidx/compose/ui/text/input/TextFieldValue;", "setValue", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Entry {
        private androidx.compose.foundation.text.UndoManager.Entry next;
        private androidx.compose.ui.text.input.TextFieldValue value;

        public Entry(androidx.compose.foundation.text.UndoManager.Entry entry, androidx.compose.ui.text.input.TextFieldValue textFieldValue) {
            this.next = entry;
            this.value = textFieldValue;
        }

        public /* synthetic */ Entry(androidx.compose.foundation.text.UndoManager.Entry entry, androidx.compose.ui.text.input.TextFieldValue textFieldValue, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : entry, textFieldValue);
        }

        public final androidx.compose.foundation.text.UndoManager.Entry getNext() {
            return this.next;
        }

        public final void setNext(androidx.compose.foundation.text.UndoManager.Entry entry) {
            this.next = entry;
        }

        public final androidx.compose.ui.text.input.TextFieldValue getValue() {
            return this.value;
        }

        public final void setValue(androidx.compose.ui.text.input.TextFieldValue textFieldValue) {
            this.value = textFieldValue;
        }
    }

    public static /* synthetic */ void snapshotIfNeeded$default(androidx.compose.foundation.text.UndoManager undoManager, androidx.compose.ui.text.input.TextFieldValue textFieldValue, long j, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = androidx.compose.foundation.text.UndoManager_jvmKt.timeNowMillis();
        }
        undoManager.snapshotIfNeeded(textFieldValue, j);
    }

    public final void snapshotIfNeeded(androidx.compose.ui.text.input.TextFieldValue value, long now) {
        if (!this.forceNextSnapshot) {
            java.lang.Long l = this.lastSnapshot;
            if (now <= (l != null ? l.longValue() : 0L) + androidx.compose.foundation.text.UndoManagerKt.getSNAPSHOTS_INTERVAL_MILLIS()) {
                return;
            }
        }
        this.lastSnapshot = java.lang.Long.valueOf(now);
        makeSnapshot(value);
    }

    public final void forceNextSnapshot() {
        this.forceNextSnapshot = true;
    }

    public final void makeSnapshot(androidx.compose.ui.text.input.TextFieldValue value) {
        androidx.compose.ui.text.input.TextFieldValue value2;
        this.forceNextSnapshot = false;
        androidx.compose.foundation.text.UndoManager.Entry entry = this.undoStack;
        if (kotlin.jvm.internal.Intrinsics.areEqual(value, entry != null ? entry.getValue() : null)) {
            return;
        }
        java.lang.String text = value.getText();
        androidx.compose.foundation.text.UndoManager.Entry entry2 = this.undoStack;
        if (kotlin.jvm.internal.Intrinsics.areEqual(text, (entry2 == null || (value2 = entry2.getValue()) == null) ? null : value2.getText())) {
            androidx.compose.foundation.text.UndoManager.Entry entry3 = this.undoStack;
            if (entry3 == null) {
                return;
            }
            entry3.setValue(value);
            return;
        }
        this.undoStack = new androidx.compose.foundation.text.UndoManager.Entry(this.undoStack, value);
        this.redoStack = null;
        int length = this.storedCharacters + value.getText().length();
        this.storedCharacters = length;
        if (length > this.maxStoredCharacters) {
            removeLastUndo();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001e A[LOOP:0: B:7:0x000e->B:12:0x001e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0023 A[EDGE_INSN: B:13:0x0023->B:14:0x0023 BREAK  A[LOOP:0: B:7:0x000e->B:12:0x001e], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void removeLastUndo() {
        androidx.compose.foundation.text.UndoManager.Entry entry;
        androidx.compose.foundation.text.UndoManager.Entry entry2 = this.undoStack;
        if ((entry2 != null ? entry2.getNext() : null) == null) {
            return;
        }
        while (true) {
            if (entry2 != null) {
                androidx.compose.foundation.text.UndoManager.Entry next = entry2.getNext();
                if (next != null) {
                    entry = next.getNext();
                    if (entry != null) {
                        break;
                    } else {
                        entry2 = entry2.getNext();
                    }
                }
            }
            entry = null;
            if (entry != null) {
            }
        }
        if (entry2 == null) {
            return;
        }
        entry2.setNext(null);
    }

    public final androidx.compose.ui.text.input.TextFieldValue undo() {
        androidx.compose.foundation.text.UndoManager.Entry next;
        androidx.compose.foundation.text.UndoManager.Entry entry = this.undoStack;
        if (entry == null || (next = entry.getNext()) == null) {
            return null;
        }
        this.undoStack = next;
        this.storedCharacters -= entry.getValue().getText().length();
        this.redoStack = new androidx.compose.foundation.text.UndoManager.Entry(this.redoStack, entry.getValue());
        return next.getValue();
    }

    public final androidx.compose.ui.text.input.TextFieldValue redo() {
        androidx.compose.foundation.text.UndoManager.Entry entry = this.redoStack;
        if (entry == null) {
            return null;
        }
        this.redoStack = entry.getNext();
        this.undoStack = new androidx.compose.foundation.text.UndoManager.Entry(this.undoStack, entry.getValue());
        this.storedCharacters += entry.getValue().getText().length();
        return entry.getValue();
    }
}
