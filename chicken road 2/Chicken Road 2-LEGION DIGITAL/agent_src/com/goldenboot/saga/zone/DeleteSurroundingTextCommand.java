package com.goldenboot.saga.zone;

import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0018\u0010\u0012¨\u0006\u0019"}, d2 = {"Lcom/goldenboot/saga/zone/TouchTimer;", "Lcom/goldenboot/saga/zone/DimenCommand;", "", "lengthBeforeCursor", "lengthAfterCursor", "<init>", "(II)V", "Lcom/goldenboot/saga/zone/PatternFacilitator;", "buffer", "Lcom/goldenboot/saga/zone/DpadBuilder;", "evictLayout", "(Lcom/goldenboot/saga/zone/PatternFacilitator;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "I", "injectMetric", "growPayload", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.goldenboot.saga.zone.TouchTimer, reason: from toString */
/* loaded from: classes.dex */
public final class DeleteSurroundingTextCommand implements DimenCommand {
    public static final int injectMetric = 0;

    /* renamed from: evictLayout, reason: from kotlin metadata and from toString */
    private final int lengthBeforeCursor;

    /* renamed from: growPayload, reason: from kotlin metadata and from toString */
    private final int lengthAfterCursor;

    public DeleteSurroundingTextCommand(int i, int i2) {
        this.lengthBeforeCursor = i;
        this.lengthAfterCursor = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        EmitterUpgrade.releaseHeader("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeleteSurroundingTextCommand)) {
            return false;
        }
        DeleteSurroundingTextCommand deleteSurroundingTextCommand = (DeleteSurroundingTextCommand) other;
        return this.lengthBeforeCursor == deleteSurroundingTextCommand.lengthBeforeCursor && this.lengthAfterCursor == deleteSurroundingTextCommand.lengthAfterCursor;
    }

    @Override // com.goldenboot.saga.zone.DimenCommand
    public void evictLayout(PatternFacilitator buffer) {
        int selectionEnd = buffer.getSelectionEnd();
        int i = this.lengthAfterCursor;
        int i2 = selectionEnd + i;
        if (((selectionEnd ^ i2) & (i ^ i2)) < 0) {
            i2 = buffer.applyTask();
        }
        buffer.injectMetric(buffer.getSelectionEnd(), Math.min(i2, buffer.applyTask()));
        int selectionStart = buffer.getSelectionStart();
        int i3 = this.lengthBeforeCursor;
        int i4 = selectionStart - i3;
        if (((i3 ^ selectionStart) & (selectionStart ^ i4)) < 0) {
            i4 = 0;
        }
        buffer.injectMetric(Math.max(0, i4), buffer.getSelectionStart());
    }

    /* renamed from: growPayload, reason: from getter */
    public final int getLengthAfterCursor() {
        return this.lengthAfterCursor;
    }

    public int hashCode() {
        return (this.lengthBeforeCursor * 31) + this.lengthAfterCursor;
    }

    /* renamed from: injectMetric, reason: from getter */
    public final int getLengthBeforeCursor() {
        return this.lengthBeforeCursor;
    }

    public String toString() {
        return "DeleteSurroundingTextCommand(lengthBeforeCursor=" + this.lengthBeforeCursor + ", lengthAfterCursor=" + this.lengthAfterCursor + ')';
    }
}
