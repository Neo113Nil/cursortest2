package androidx.compose.ui.text.input;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\u0012"}, d2 = {"Landroidx/compose/ui/text/input/DeleteSurroundingTextInCodePointsCommand;", "Landroidx/compose/ui/text/input/EditCommand;", "", "lengthBeforeCursor", "lengthAfterCursor", "<init>", "(II)V", "Landroidx/compose/ui/text/input/EditingBuffer;", "buffer", "", "applyTo", "(Landroidx/compose/ui/text/input/EditingBuffer;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getLengthBeforeCursor", "getLengthAfterCursor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DeleteSurroundingTextInCodePointsCommand implements androidx.compose.ui.text.input.EditCommand {
    public static final int $stable = 0;
    private final int lengthAfterCursor;
    private final int lengthBeforeCursor;

    public DeleteSurroundingTextInCodePointsCommand(int i, int i2) {
        this.lengthBeforeCursor = i;
        this.lengthAfterCursor = i2;
        if (i < 0 || i2 < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ");
            sb.append(i);
            sb.append(" and ");
            sb.append(i2);
            sb.append(" respectively.");
            androidx.compose.ui.text.internal.InlineClassHelperKt.throwIllegalArgumentException(sb.toString());
        }
    }

    public final int getLengthBeforeCursor() {
        return this.lengthBeforeCursor;
    }

    public final int getLengthAfterCursor() {
        return this.lengthAfterCursor;
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public final void applyTo(androidx.compose.ui.text.input.EditingBuffer buffer) {
        int i = this.lengthBeforeCursor;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i4 < i) {
                int i5 = i3 + 1;
                if (buffer.getSelectionStart() > i5) {
                    i3 = androidx.compose.ui.text.input.EditCommandKt.access$isSurrogatePair(buffer.get$ui_text((buffer.getSelectionStart() - i5) + (-1)), buffer.get$ui_text(buffer.getSelectionStart() - i5)) ? i3 + 2 : i5;
                    i4++;
                } else {
                    i3 = buffer.getSelectionStart();
                    break;
                }
            } else {
                break;
            }
        }
        int i6 = this.lengthAfterCursor;
        int i7 = 0;
        while (true) {
            if (i7 >= i6) {
                break;
            }
            int i8 = i2 + 1;
            if (buffer.getSelectionEnd() + i8 < buffer.getLength$ui_text()) {
                i2 = androidx.compose.ui.text.input.EditCommandKt.access$isSurrogatePair(buffer.get$ui_text((buffer.getSelectionEnd() + i8) + (-1)), buffer.get$ui_text(buffer.getSelectionEnd() + i8)) ? i2 + 2 : i8;
                i7++;
            } else {
                i2 = buffer.getLength$ui_text() - buffer.getSelectionEnd();
                break;
            }
        }
        buffer.delete$ui_text(buffer.getSelectionEnd(), buffer.getSelectionEnd() + i2);
        buffer.delete$ui_text(buffer.getSelectionStart() - i3, buffer.getSelectionStart());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.text.input.DeleteSurroundingTextInCodePointsCommand)) {
            return false;
        }
        androidx.compose.ui.text.input.DeleteSurroundingTextInCodePointsCommand deleteSurroundingTextInCodePointsCommand = (androidx.compose.ui.text.input.DeleteSurroundingTextInCodePointsCommand) other;
        return this.lengthBeforeCursor == deleteSurroundingTextInCodePointsCommand.lengthBeforeCursor && this.lengthAfterCursor == deleteSurroundingTextInCodePointsCommand.lengthAfterCursor;
    }

    public final int hashCode() {
        return (this.lengthBeforeCursor * 31) + this.lengthAfterCursor;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb.append(this.lengthBeforeCursor);
        sb.append(", lengthAfterCursor=");
        sb.append(this.lengthAfterCursor);
        sb.append(')');
        return sb.toString();
    }
}
