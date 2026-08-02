package androidx.compose.foundation.text.handwriting;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function0;", "", com.sun.jna.Callback.METHOD_NAME, "handwritingDetector", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HandwritingDetector_androidKt {
    public static final androidx.compose.ui.Modifier handwritingDetector(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        return androidx.compose.foundation.text.handwriting.StylusHandwriting_androidKt.isStylusHandwritingSupported() ? androidx.compose.ui.input.pointer.PointerIconKt.stylusHoverIcon(modifier, androidx.compose.foundation.text.TextPointerIcon_androidKt.getHandwritingPointerIcon(), false, androidx.compose.foundation.text.handwriting.StylusHandwritingKt.getHandwritingBoundsExpansion()).then(new androidx.compose.foundation.text.handwriting.HandwritingDetectorElement(function0)) : modifier;
    }
}
