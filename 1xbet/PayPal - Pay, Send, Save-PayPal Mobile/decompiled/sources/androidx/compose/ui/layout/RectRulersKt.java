package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0017\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0001\u0010\u0005\u001a%\u0010\t\u001a\u00020\u0000*\u00020\u00062\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0007\"\u00020\u0000¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\u000b\u001a\u00020\u0000*\u00020\u00062\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0007\"\u00020\u0000¢\u0006\u0004\b\u000b\u0010\n"}, d2 = {"Landroidx/compose/ui/layout/RectRulers;", "RectRulers", "()Landroidx/compose/ui/layout/RectRulers;", "", "name", "(Ljava/lang/String;)Landroidx/compose/ui/layout/RectRulers;", "Landroidx/compose/ui/layout/RectRulers$Companion;", "", "rulers", "innermostOf", "(Landroidx/compose/ui/layout/RectRulers$Companion;[Landroidx/compose/ui/layout/RectRulers;)Landroidx/compose/ui/layout/RectRulers;", "outermostOf"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RectRulersKt {
    public static final androidx.compose.ui.layout.RectRulers RectRulers() {
        return new androidx.compose.ui.layout.RectRulersImpl(null);
    }

    public static final androidx.compose.ui.layout.RectRulers RectRulers(java.lang.String str) {
        return new androidx.compose.ui.layout.RectRulersImpl(str);
    }

    public static final androidx.compose.ui.layout.RectRulers innermostOf(androidx.compose.ui.layout.RectRulers.Companion companion, androidx.compose.ui.layout.RectRulers... rectRulersArr) {
        return new androidx.compose.ui.layout.InnerRectRulers(rectRulersArr);
    }

    public static final androidx.compose.ui.layout.RectRulers outermostOf(androidx.compose.ui.layout.RectRulers.Companion companion, androidx.compose.ui.layout.RectRulers... rectRulersArr) {
        return new androidx.compose.ui.layout.OuterRectRulers(rectRulersArr);
    }
}
