package androidx.compose.ui.text.style;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a%\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/text/style/TextIndent;", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "stop", "", "fraction", "lerp", "(Landroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/style/TextIndent;F)Landroidx/compose/ui/text/style/TextIndent;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextIndentKt {
    public static final androidx.compose.ui.text.style.TextIndent lerp(androidx.compose.ui.text.style.TextIndent textIndent, androidx.compose.ui.text.style.TextIndent textIndent2, float f) {
        return new androidx.compose.ui.text.style.TextIndent(androidx.compose.ui.text.SpanStyleKt.m7988lerpTextUnitInheritableC3pnCVY(textIndent.getFirstLine(), textIndent2.getFirstLine(), f), androidx.compose.ui.text.SpanStyleKt.m7988lerpTextUnitInheritableC3pnCVY(textIndent.getRestLine(), textIndent2.getRestLine(), f), null);
    }
}
