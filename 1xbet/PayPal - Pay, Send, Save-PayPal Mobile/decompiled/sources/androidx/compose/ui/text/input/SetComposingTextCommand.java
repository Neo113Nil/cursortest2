package androidx.compose.ui.text.input;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\t\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0018"}, d2 = {"Landroidx/compose/ui/text/input/SetComposingTextCommand;", "Landroidx/compose/ui/text/input/EditCommand;", "Landroidx/compose/ui/text/AnnotatedString;", "annotatedString", "", "newCursorPosition", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;I)V", "", "text", "(Ljava/lang/String;I)V", "Landroidx/compose/ui/text/input/EditingBuffer;", "buffer", "", "applyTo", "(Landroidx/compose/ui/text/input/EditingBuffer;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/text/AnnotatedString;", "getAnnotatedString", "()Landroidx/compose/ui/text/AnnotatedString;", com.visa.cbp.getEncExpo.warmup, "getNewCursorPosition", "getText"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SetComposingTextCommand implements androidx.compose.ui.text.input.EditCommand {
    public static final int $stable = 0;
    private final androidx.compose.ui.text.AnnotatedString annotatedString;
    private final int newCursorPosition;

    public SetComposingTextCommand(androidx.compose.ui.text.AnnotatedString annotatedString, int i) {
        this.annotatedString = annotatedString;
        this.newCursorPosition = i;
    }

    public final androidx.compose.ui.text.AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    public final int getNewCursorPosition() {
        return this.newCursorPosition;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SetComposingTextCommand(java.lang.String str, int i) {
        this(new androidx.compose.ui.text.AnnotatedString(str, null, 2, 0 == true ? 1 : 0), i);
    }

    public final java.lang.String getText() {
        return this.annotatedString.getText();
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public final void applyTo(androidx.compose.ui.text.input.EditingBuffer buffer) {
        if (buffer.hasComposition$ui_text()) {
            int compositionStart = buffer.getCompositionStart();
            buffer.replace$ui_text(buffer.getCompositionStart(), buffer.getCompositionEnd(), getText());
            if (getText().length() > 0) {
                buffer.setComposition$ui_text(compositionStart, getText().length() + compositionStart);
            }
        } else {
            int selectionStart = buffer.getSelectionStart();
            buffer.replace$ui_text(buffer.getSelectionStart(), buffer.getSelectionEnd(), getText());
            if (getText().length() > 0) {
                buffer.setComposition$ui_text(selectionStart, getText().length() + selectionStart);
            }
        }
        int cursor$ui_text = buffer.getCursor$ui_text();
        int i = this.newCursorPosition;
        buffer.setCursor$ui_text(kotlin.ranges.RangesKt.coerceIn(i > 0 ? (cursor$ui_text + i) - 1 : (cursor$ui_text + i) - getText().length(), 0, buffer.getLength$ui_text()));
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.text.input.SetComposingTextCommand)) {
            return false;
        }
        androidx.compose.ui.text.input.SetComposingTextCommand setComposingTextCommand = (androidx.compose.ui.text.input.SetComposingTextCommand) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(getText(), setComposingTextCommand.getText()) && this.newCursorPosition == setComposingTextCommand.newCursorPosition;
    }

    public final int hashCode() {
        return (getText().hashCode() * 31) + this.newCursorPosition;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SetComposingTextCommand(text='");
        sb.append(getText());
        sb.append("', newCursorPosition=");
        sb.append(this.newCursorPosition);
        sb.append(')');
        return sb.toString();
    }
}
