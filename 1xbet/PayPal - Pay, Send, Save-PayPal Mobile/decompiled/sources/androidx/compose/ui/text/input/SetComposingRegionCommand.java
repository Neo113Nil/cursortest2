package androidx.compose.ui.text.input;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\u0012"}, d2 = {"Landroidx/compose/ui/text/input/SetComposingRegionCommand;", "Landroidx/compose/ui/text/input/EditCommand;", "", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "<init>", "(II)V", "Landroidx/compose/ui/text/input/EditingBuffer;", "buffer", "", "applyTo", "(Landroidx/compose/ui/text/input/EditingBuffer;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getStart", "getEnd"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SetComposingRegionCommand implements androidx.compose.ui.text.input.EditCommand {
    public static final int $stable = 0;
    private final int end;
    private final int start;

    public SetComposingRegionCommand(int i, int i2) {
        this.start = i;
        this.end = i2;
    }

    public final int getEnd() {
        return this.end;
    }

    public final int getStart() {
        return this.start;
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public final void applyTo(androidx.compose.ui.text.input.EditingBuffer buffer) {
        if (buffer.hasComposition$ui_text()) {
            buffer.commitComposition$ui_text();
        }
        int coerceIn = kotlin.ranges.RangesKt.coerceIn(this.start, 0, buffer.getLength$ui_text());
        int coerceIn2 = kotlin.ranges.RangesKt.coerceIn(this.end, 0, buffer.getLength$ui_text());
        if (coerceIn != coerceIn2) {
            if (coerceIn < coerceIn2) {
                buffer.setComposition$ui_text(coerceIn, coerceIn2);
            } else {
                buffer.setComposition$ui_text(coerceIn2, coerceIn);
            }
        }
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.text.input.SetComposingRegionCommand)) {
            return false;
        }
        androidx.compose.ui.text.input.SetComposingRegionCommand setComposingRegionCommand = (androidx.compose.ui.text.input.SetComposingRegionCommand) other;
        return this.start == setComposingRegionCommand.start && this.end == setComposingRegionCommand.end;
    }

    public final int hashCode() {
        return (this.start * 31) + this.end;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SetComposingRegionCommand(start=");
        sb.append(this.start);
        sb.append(", end=");
        sb.append(this.end);
        sb.append(')');
        return sb.toString();
    }
}
