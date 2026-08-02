package androidx.compose.foundation.relocation;

@kotlin.Metadata(d1 = {"androidx/compose/foundation/relocation/BringIntoViewRequesterKt__BringIntoViewRequesterKt", "androidx/compose/foundation/relocation/BringIntoViewRequesterKt__BringIntoViewResponderKt"}, k = 4, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BringIntoViewRequesterKt {
    public static final androidx.compose.foundation.relocation.BringIntoViewRequester BringIntoViewRequester() {
        return androidx.compose.foundation.relocation.BringIntoViewRequesterKt__BringIntoViewRequesterKt.BringIntoViewRequester();
    }

    public static final androidx.compose.ui.Modifier bringIntoViewRequester(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.relocation.BringIntoViewRequester bringIntoViewRequester) {
        return androidx.compose.foundation.relocation.BringIntoViewRequesterKt__BringIntoViewRequesterKt.bringIntoViewRequester(modifier, bringIntoViewRequester);
    }

    @kotlin.Deprecated(message = "Use BringIntoViewModifierNode instead")
    public static final androidx.compose.ui.Modifier bringIntoViewResponder(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.relocation.BringIntoViewResponder bringIntoViewResponder) {
        return androidx.compose.foundation.relocation.BringIntoViewRequesterKt__BringIntoViewResponderKt.bringIntoViewResponder(modifier, bringIntoViewResponder);
    }
}
