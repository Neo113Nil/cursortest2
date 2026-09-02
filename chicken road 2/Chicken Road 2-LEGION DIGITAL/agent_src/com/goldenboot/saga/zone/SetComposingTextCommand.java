package com.goldenboot.saga.zone;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0018¨\u0006\u001f"}, d2 = {"Lcom/goldenboot/saga/zone/VibrationPipe;", "Lcom/goldenboot/saga/zone/DimenCommand;", "Lcom/goldenboot/saga/zone/WatcherDelta;", "annotatedString", "", "newCursorPosition", "<init>", "(Lcom/goldenboot/saga/zone/WatcherDelta;I)V", "", "text", "(Ljava/lang/String;I)V", "Lcom/goldenboot/saga/zone/PatternFacilitator;", "buffer", "Lcom/goldenboot/saga/zone/DpadBuilder;", "evictLayout", "(Lcom/goldenboot/saga/zone/PatternFacilitator;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcom/goldenboot/saga/zone/WatcherDelta;", "growPayload", "()Lcom/goldenboot/saga/zone/WatcherDelta;", "I", "injectMetric", "detachStream", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.goldenboot.saga.zone.VibrationPipe, reason: from toString */
/* loaded from: classes.dex */
public final class SetComposingTextCommand implements DimenCommand {
    public static final int injectMetric = 0;

    /* renamed from: evictLayout, reason: from kotlin metadata */
    private final WatcherDelta annotatedString;

    /* renamed from: growPayload, reason: from kotlin metadata and from toString */
    private final int newCursorPosition;

    public SetComposingTextCommand(WatcherDelta watcherDelta, int i) {
        this.annotatedString = watcherDelta;
        this.newCursorPosition = i;
    }

    public final String detachStream() {
        return this.annotatedString.getText();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetComposingTextCommand)) {
            return false;
        }
        SetComposingTextCommand setComposingTextCommand = (SetComposingTextCommand) other;
        return Intrinsics.areEqual(detachStream(), setComposingTextCommand.detachStream()) && this.newCursorPosition == setComposingTextCommand.newCursorPosition;
    }

    @Override // com.goldenboot.saga.zone.DimenCommand
    public void evictLayout(PatternFacilitator buffer) {
        if (buffer.peekRevision()) {
            int compositionStart = buffer.getCompositionStart();
            buffer.reduceScope(buffer.getCompositionStart(), buffer.getCompositionEnd(), detachStream());
            if (detachStream().length() > 0) {
                buffer.notifyMessage(compositionStart, detachStream().length() + compositionStart);
            }
        } else {
            int selectionStart = buffer.getSelectionStart();
            buffer.reduceScope(buffer.getSelectionStart(), buffer.getSelectionEnd(), detachStream());
            if (detachStream().length() > 0) {
                buffer.notifyMessage(selectionStart, detachStream().length() + selectionStart);
            }
        }
        int updateTimer = buffer.updateTimer();
        int i = this.newCursorPosition;
        buffer.connectPatch(CellEntry.peekRevision(i > 0 ? (updateTimer + i) - 1 : (updateTimer + i) - detachStream().length(), 0, buffer.applyTask()));
    }

    /* renamed from: growPayload, reason: from getter */
    public final WatcherDelta getAnnotatedString() {
        return this.annotatedString;
    }

    public int hashCode() {
        return (detachStream().hashCode() * 31) + this.newCursorPosition;
    }

    /* renamed from: injectMetric, reason: from getter */
    public final int getNewCursorPosition() {
        return this.newCursorPosition;
    }

    public String toString() {
        return "SetComposingTextCommand(text='" + detachStream() + "', newCursorPosition=" + this.newCursorPosition + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SetComposingTextCommand(String str, int i) {
        this(new WatcherDelta(str, null, 2, 0 == true ? 1 : 0), i);
    }
}
