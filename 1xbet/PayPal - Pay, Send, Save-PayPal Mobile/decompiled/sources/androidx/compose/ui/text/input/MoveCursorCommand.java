package androidx.compose.ui.text.input;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0011"}, d2 = {"Landroidx/compose/ui/text/input/MoveCursorCommand;", "Landroidx/compose/ui/text/input/EditCommand;", "", "amount", "<init>", "(I)V", "Landroidx/compose/ui/text/input/EditingBuffer;", "buffer", "", "applyTo", "(Landroidx/compose/ui/text/input/EditingBuffer;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getAmount"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MoveCursorCommand implements androidx.compose.ui.text.input.EditCommand {
    public static final int $stable = 0;
    private final int amount;

    public MoveCursorCommand(int i) {
        this.amount = i;
    }

    public final int getAmount() {
        return this.amount;
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public final void applyTo(androidx.compose.ui.text.input.EditingBuffer buffer) {
        if (buffer.getCursor$ui_text() == -1) {
            buffer.setCursor$ui_text(buffer.getSelectionStart());
        }
        int selectionStart = buffer.getSelectionStart();
        java.lang.String obj = buffer.toString();
        int i = this.amount;
        int i2 = 0;
        if (i <= 0) {
            int i3 = -i;
            while (i2 < i3) {
                int findPrecedingBreak = androidx.compose.ui.text.JvmCharHelpers_androidKt.findPrecedingBreak(obj, selectionStart);
                if (findPrecedingBreak == -1) {
                    break;
                }
                i2++;
                selectionStart = findPrecedingBreak;
            }
        } else {
            while (i2 < i) {
                int findFollowingBreak = androidx.compose.ui.text.JvmCharHelpers_androidKt.findFollowingBreak(obj, selectionStart);
                if (findFollowingBreak == -1) {
                    break;
                }
                i2++;
                selectionStart = findFollowingBreak;
            }
        }
        buffer.setCursor$ui_text(selectionStart);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof androidx.compose.ui.text.input.MoveCursorCommand) && this.amount == ((androidx.compose.ui.text.input.MoveCursorCommand) other).amount;
    }

    public final int hashCode() {
        return this.amount;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MoveCursorCommand(amount=");
        sb.append(this.amount);
        sb.append(')');
        return sb.toString();
    }
}
