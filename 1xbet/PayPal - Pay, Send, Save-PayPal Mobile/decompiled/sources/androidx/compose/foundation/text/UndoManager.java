package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001!B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0014\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0015R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001c\u001a\u00020\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010 "}, d2 = {"Landroidx/compose/foundation/text/UndoManager;", "", "", "maxStoredCharacters", "<init>", "(I)V", "Landroidx/compose/ui/text/input/TextFieldValue;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "now", "", "snapshotIfNeeded", "(Landroidx/compose/ui/text/input/TextFieldValue;J)V", "forceNextSnapshot", "()V", "makeSnapshot", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "getHighSpeedVideoSizes", "undo", "()Landroidx/compose/ui/text/input/TextFieldValue;", "redo", com.visa.cbp.getEncExpo.warmup, "getMaxStoredCharacters", "()I", "Landroidx/compose/foundation/text/UndoManager$Entry;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/foundation/text/UndoManager$Entry;", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/Long;", "", "Z", "Entry"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UndoManager {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private androidx.compose.foundation.text.UndoManager.Entry getHighSpeedVideoFpsRangesFor;
    private java.lang.Long getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private int getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private androidx.compose.foundation.text.UndoManager.Entry getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private boolean Camera2StreamConfigurationMap;
    private final int maxStoredCharacters;

    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\f\u001a\u0004\u0018\u00010\u00008\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u0007\u0010\u000bR\"\u0010\u0011\u001a\u00020\u00038\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\f\u0010\u0010"}, d2 = {"Landroidx/compose/foundation/text/UndoManager$Entry;", "", "p0", "Landroidx/compose/ui/text/input/TextFieldValue;", "p1", "<init>", "(Landroidx/compose/foundation/text/UndoManager$Entry;Landroidx/compose/ui/text/input/TextFieldValue;)V", "getHighSpeedVideoSizes", "Landroidx/compose/foundation/text/UndoManager$Entry;", "getHighSpeedVideoFpsRanges", "()Landroidx/compose/foundation/text/UndoManager$Entry;", "()V", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/ui/text/input/TextFieldValue;", "getHighResolutionOutputSizeshNQ4ISI", "()Landroidx/compose/ui/text/input/TextFieldValue;", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Entry {

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private androidx.compose.ui.text.input.TextFieldValue Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private androidx.compose.foundation.text.UndoManager.Entry getHighSpeedVideoFpsRangesFor;

        public Entry(androidx.compose.foundation.text.UndoManager.Entry entry, androidx.compose.ui.text.input.TextFieldValue textFieldValue) {
            this.getHighSpeedVideoFpsRangesFor = entry;
            this.Camera2StreamConfigurationMap = textFieldValue;
        }

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from getter */
        public final androidx.compose.ui.text.input.TextFieldValue getCamera2StreamConfigurationMap() {
            return this.Camera2StreamConfigurationMap;
        }

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from getter */
        public final androidx.compose.foundation.text.UndoManager.Entry getGetHighSpeedVideoFpsRangesFor() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public final void getHighSpeedVideoFpsRangesFor(androidx.compose.ui.text.input.TextFieldValue textFieldValue) {
            this.Camera2StreamConfigurationMap = textFieldValue;
        }

        public final void getHighSpeedVideoSizes() {
            this.getHighSpeedVideoFpsRangesFor = null;
        }
    }

    public UndoManager(int i) {
        this.maxStoredCharacters = i;
    }

    public /* synthetic */ UndoManager(int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength : i);
    }

    public final int getMaxStoredCharacters() {
        return this.maxStoredCharacters;
    }

    public static /* synthetic */ void snapshotIfNeeded$default(androidx.compose.foundation.text.UndoManager undoManager, androidx.compose.ui.text.input.TextFieldValue textFieldValue, long j, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = androidx.compose.foundation.text.UndoManager_jvmKt.timeNowMillis();
        }
        undoManager.snapshotIfNeeded(textFieldValue, j);
    }

    public final void snapshotIfNeeded(androidx.compose.ui.text.input.TextFieldValue value, long now) {
        if (!this.Camera2StreamConfigurationMap) {
            java.lang.Long l = this.getHighResolutionOutputSizeshNQ4ISI;
            if (now <= (l != null ? l.longValue() : 0L) + androidx.compose.foundation.text.UndoManagerKt.getSNAPSHOTS_INTERVAL_MILLIS()) {
                return;
            }
        }
        this.getHighResolutionOutputSizeshNQ4ISI = java.lang.Long.valueOf(now);
        makeSnapshot(value);
    }

    public final void forceNextSnapshot() {
        this.Camera2StreamConfigurationMap = true;
    }

    public final void makeSnapshot(androidx.compose.ui.text.input.TextFieldValue value) {
        androidx.compose.ui.text.input.TextFieldValue camera2StreamConfigurationMap;
        this.Camera2StreamConfigurationMap = false;
        androidx.compose.foundation.text.UndoManager.Entry entry = this.getHighSpeedVideoFpsRanges;
        if (kotlin.jvm.internal.Intrinsics.areEqual(value, entry != null ? entry.getCamera2StreamConfigurationMap() : null)) {
            return;
        }
        java.lang.String text = value.getText();
        androidx.compose.foundation.text.UndoManager.Entry entry2 = this.getHighSpeedVideoFpsRanges;
        if (kotlin.jvm.internal.Intrinsics.areEqual(text, (entry2 == null || (camera2StreamConfigurationMap = entry2.getCamera2StreamConfigurationMap()) == null) ? null : camera2StreamConfigurationMap.getText())) {
            androidx.compose.foundation.text.UndoManager.Entry entry3 = this.getHighSpeedVideoFpsRanges;
            if (entry3 != null) {
                entry3.getHighSpeedVideoFpsRangesFor(value);
                return;
            }
            return;
        }
        this.getHighSpeedVideoFpsRanges = new androidx.compose.foundation.text.UndoManager.Entry(this.getHighSpeedVideoFpsRanges, value);
        this.getHighSpeedVideoFpsRangesFor = null;
        int length = this.getHighSpeedVideoSizes + value.getText().length();
        this.getHighSpeedVideoSizes = length;
        if (length > this.maxStoredCharacters) {
            getHighSpeedVideoSizes();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d A[LOOP:0: B:5:0x000d->B:10:0x001d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022 A[EDGE_INSN: B:11:0x0022->B:12:0x0022 BREAK  A[LOOP:0: B:5:0x000d->B:10:0x001d], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void getHighSpeedVideoSizes() {
        androidx.compose.foundation.text.UndoManager.Entry entry;
        androidx.compose.foundation.text.UndoManager.Entry entry2 = this.getHighSpeedVideoFpsRanges;
        if ((entry2 != null ? entry2.getGetHighSpeedVideoFpsRangesFor() : null) != null) {
            while (true) {
                if (entry2 != null) {
                    androidx.compose.foundation.text.UndoManager.Entry getHighSpeedVideoFpsRangesFor = entry2.getGetHighSpeedVideoFpsRangesFor();
                    if (getHighSpeedVideoFpsRangesFor != null) {
                        entry = getHighSpeedVideoFpsRangesFor.getGetHighSpeedVideoFpsRangesFor();
                        if (entry != null) {
                            break;
                        } else {
                            entry2 = entry2.getGetHighSpeedVideoFpsRangesFor();
                        }
                    }
                }
                entry = null;
                if (entry != null) {
                }
            }
            if (entry2 != null) {
                entry2.getHighSpeedVideoSizes();
            }
        }
    }

    public final androidx.compose.ui.text.input.TextFieldValue undo() {
        androidx.compose.foundation.text.UndoManager.Entry getHighSpeedVideoFpsRangesFor;
        androidx.compose.foundation.text.UndoManager.Entry entry = this.getHighSpeedVideoFpsRanges;
        if (entry == null || (getHighSpeedVideoFpsRangesFor = entry.getGetHighSpeedVideoFpsRangesFor()) == null) {
            return null;
        }
        this.getHighSpeedVideoFpsRanges = getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoSizes -= entry.getCamera2StreamConfigurationMap().getText().length();
        this.getHighSpeedVideoFpsRangesFor = new androidx.compose.foundation.text.UndoManager.Entry(this.getHighSpeedVideoFpsRangesFor, entry.getCamera2StreamConfigurationMap());
        return getHighSpeedVideoFpsRangesFor.getCamera2StreamConfigurationMap();
    }

    public final androidx.compose.ui.text.input.TextFieldValue redo() {
        androidx.compose.foundation.text.UndoManager.Entry entry = this.getHighSpeedVideoFpsRangesFor;
        if (entry == null) {
            return null;
        }
        this.getHighSpeedVideoFpsRangesFor = entry.getGetHighSpeedVideoFpsRangesFor();
        this.getHighSpeedVideoFpsRanges = new androidx.compose.foundation.text.UndoManager.Entry(this.getHighSpeedVideoFpsRanges, entry.getCamera2StreamConfigurationMap());
        this.getHighSpeedVideoSizes += entry.getCamera2StreamConfigurationMap().getText().length();
        return entry.getCamera2StreamConfigurationMap();
    }

    public UndoManager() {
        this(0, 1, null);
    }
}
