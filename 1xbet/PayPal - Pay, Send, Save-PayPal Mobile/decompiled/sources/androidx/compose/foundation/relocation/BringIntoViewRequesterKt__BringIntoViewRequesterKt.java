package androidx.compose.foundation.relocation;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0019\u0010\u0005\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "BringIntoViewRequester", "()Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "Landroidx/compose/ui/Modifier;", "p0", "bringIntoViewRequester", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/relocation/BringIntoViewRequester;)Landroidx/compose/ui/Modifier;"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/compose/foundation/relocation/BringIntoViewRequesterKt")
/* loaded from: classes.dex */
final /* synthetic */ class BringIntoViewRequesterKt__BringIntoViewRequesterKt {
    public static final androidx.compose.foundation.relocation.BringIntoViewRequester BringIntoViewRequester() {
        return new androidx.compose.foundation.relocation.BringIntoViewRequesterImpl();
    }

    public static final androidx.compose.ui.Modifier bringIntoViewRequester(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.relocation.BringIntoViewRequester bringIntoViewRequester) {
        return modifier.then(new androidx.compose.foundation.relocation.BringIntoViewRequesterElement(bringIntoViewRequester));
    }
}
