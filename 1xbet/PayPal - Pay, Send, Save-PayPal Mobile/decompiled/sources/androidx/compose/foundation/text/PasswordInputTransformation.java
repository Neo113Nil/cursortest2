package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\b\u001a\u00020\u0003*\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR+\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8A@CX\u0081\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/compose/foundation/text/PasswordInputTransformation;", "Landroidx/compose/foundation/text/input/InputTransformation;", "Lkotlin/Function0;", "", "scheduleHide", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/foundation/text/input/TextFieldBuffer;", "transformInput", "(Landroidx/compose/foundation/text/input/TextFieldBuffer;)V", "hide", "()V", "Lkotlin/jvm/functions/Function0;", "getScheduleHide", "()Lkotlin/jvm/functions/Function0;", "", "<set-?>", "revealCodepointIndex$delegate", "Landroidx/compose/runtime/MutableIntState;", "getRevealCodepointIndex$foundation", "()I", "setRevealCodepointIndex", "(I)V", "revealCodepointIndex"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PasswordInputTransformation implements androidx.compose.foundation.text.input.InputTransformation {
    public static final int $stable = 0;

    /* renamed from: revealCodepointIndex$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableIntState revealCodepointIndex = androidx.compose.runtime.SnapshotIntStateKt.mutableIntStateOf(-1);
    private final kotlin.jvm.functions.Function0<kotlin.Unit> scheduleHide;

    public PasswordInputTransformation(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.scheduleHide = function0;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getScheduleHide() {
        return this.scheduleHide;
    }

    private final void setRevealCodepointIndex(int i) {
        this.revealCodepointIndex.setIntValue(i);
    }

    public final int getRevealCodepointIndex$foundation() {
        return this.revealCodepointIndex.getIntValue();
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public final void transformInput(androidx.compose.foundation.text.input.TextFieldBuffer textFieldBuffer) {
        if (textFieldBuffer.getChanges().getChangeCount() != 1 || androidx.compose.ui.text.TextRange.m8035getLengthimpl(textFieldBuffer.getChanges().mo2178getRangejx7JFs(0)) != 1 || textFieldBuffer.hasSelection()) {
            setRevealCodepointIndex(-1);
            return;
        }
        int m8037getMinimpl = androidx.compose.ui.text.TextRange.m8037getMinimpl(textFieldBuffer.getChanges().mo2178getRangejx7JFs(0));
        if (getRevealCodepointIndex$foundation() != m8037getMinimpl) {
            this.scheduleHide.invoke();
            setRevealCodepointIndex(m8037getMinimpl);
        }
    }

    public final void hide() {
        setRevealCodepointIndex(-1);
    }
}
