package androidx.compose.foundation.text.handwriting;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "handwritingHandler", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HandwritingHandler_androidKt {
    public static final androidx.compose.ui.Modifier handwritingHandler(androidx.compose.ui.Modifier modifier) {
        return androidx.compose.foundation.text.handwriting.StylusHandwriting_androidKt.isStylusHandwritingSupported() ? modifier.then(new androidx.compose.foundation.text.handwriting.HandwritingHandlerElement()) : modifier;
    }
}
