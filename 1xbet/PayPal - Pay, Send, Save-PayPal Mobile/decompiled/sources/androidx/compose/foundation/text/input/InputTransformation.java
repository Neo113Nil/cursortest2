package androidx.compose.foundation.text.input;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u0000 \r2\u00020\u0001:\u0001\rJ\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0003*\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u0004\u0018\u00010\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/input/InputTransformation;", "", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "", "applySemantics", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "Landroidx/compose/foundation/text/input/TextFieldBuffer;", "transformInput", "(Landroidx/compose/foundation/text/input/TextFieldBuffer;)V", "Landroidx/compose/foundation/text/KeyboardOptions;", "getKeyboardOptions", "()Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardOptions", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface InputTransformation {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.foundation.text.input.InputTransformation.Companion INSTANCE = androidx.compose.foundation.text.input.InputTransformation.Companion.getHighSpeedVideoFpsRanges;

    default void applySemantics(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
    }

    default androidx.compose.foundation.text.KeyboardOptions getKeyboardOptions() {
        return null;
    }

    void transformInput(androidx.compose.foundation.text.input.TextFieldBuffer textFieldBuffer);

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/foundation/text/input/InputTransformation$Companion;", "Landroidx/compose/foundation/text/input/InputTransformation;", "<init>", "()V", "Landroidx/compose/foundation/text/input/TextFieldBuffer;", "", "transformInput", "(Landroidx/compose/foundation/text/input/TextFieldBuffer;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion implements androidx.compose.foundation.text.input.InputTransformation {
        static final /* synthetic */ androidx.compose.foundation.text.input.InputTransformation.Companion getHighSpeedVideoFpsRanges = new androidx.compose.foundation.text.input.InputTransformation.Companion();

        @Override // androidx.compose.foundation.text.input.InputTransformation
        public final void transformInput(androidx.compose.foundation.text.input.TextFieldBuffer textFieldBuffer) {
        }

        private Companion() {
        }
    }
}
