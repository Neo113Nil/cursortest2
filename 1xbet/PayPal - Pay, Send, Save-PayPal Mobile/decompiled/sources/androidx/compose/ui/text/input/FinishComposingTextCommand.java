package androidx.compose.ui.text.input;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/compose/ui/text/input/FinishComposingTextCommand;", "Landroidx/compose/ui/text/input/EditCommand;", "<init>", "()V", "Landroidx/compose/ui/text/input/EditingBuffer;", "buffer", "", "applyTo", "(Landroidx/compose/ui/text/input/EditingBuffer;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FinishComposingTextCommand implements androidx.compose.ui.text.input.EditCommand {
    public static final int $stable = 0;

    @Override // androidx.compose.ui.text.input.EditCommand
    public final void applyTo(androidx.compose.ui.text.input.EditingBuffer buffer) {
        buffer.commitComposition$ui_text();
    }

    public final boolean equals(java.lang.Object other) {
        return other instanceof androidx.compose.ui.text.input.FinishComposingTextCommand;
    }

    public final int hashCode() {
        return kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(getClass()).hashCode();
    }

    public final java.lang.String toString() {
        return "FinishComposingTextCommand()";
    }
}
