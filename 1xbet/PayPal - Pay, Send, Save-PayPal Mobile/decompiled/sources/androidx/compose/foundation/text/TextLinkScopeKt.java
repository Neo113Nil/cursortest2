package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003*\u0018\b\u0000\u0010\u0006\"\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0012\u0004\u0012\u00020\u00050\u0004"}, d2 = {"Landroidx/compose/ui/text/TextLinkStyles;", "", "getHighSpeedVideoSizes", "(Landroidx/compose/ui/text/TextLinkStyles;)Z", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/LinkAnnotation;", "LinkRange"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextLinkScopeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHighSpeedVideoSizes(androidx.compose.ui.text.TextLinkStyles textLinkStyles) {
        if (textLinkStyles != null) {
            return textLinkStyles.getStyle() == null && textLinkStyles.getFocusedStyle() == null && textLinkStyles.getHoveredStyle() == null && textLinkStyles.getPressedStyle() == null;
        }
        return true;
    }
}
