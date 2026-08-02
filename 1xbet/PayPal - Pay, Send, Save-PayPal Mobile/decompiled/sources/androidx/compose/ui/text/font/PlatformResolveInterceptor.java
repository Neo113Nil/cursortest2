package androidx.compose.ui.text.font;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013J\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0011\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/font/PlatformResolveInterceptor;", "", "Landroidx/compose/ui/text/font/FontFamily;", "fontFamily", "interceptFontFamily", "(Landroidx/compose/ui/text/font/FontFamily;)Landroidx/compose/ui/text/font/FontFamily;", "Landroidx/compose/ui/text/font/FontWeight;", "fontWeight", "interceptFontWeight", "(Landroidx/compose/ui/text/font/FontWeight;)Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "fontStyle", "interceptFontStyle-T2F_aPo", "(I)I", "interceptFontStyle", "Landroidx/compose/ui/text/font/FontSynthesis;", "fontSynthesis", "interceptFontSynthesis-Mscr08Y", "interceptFontSynthesis", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface PlatformResolveInterceptor {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.text.font.PlatformResolveInterceptor.Companion INSTANCE = androidx.compose.ui.text.font.PlatformResolveInterceptor.Companion.getHighSpeedVideoFpsRangesFor;

    default androidx.compose.ui.text.font.FontFamily interceptFontFamily(androidx.compose.ui.text.font.FontFamily fontFamily) {
        return fontFamily;
    }

    /* renamed from: interceptFontStyle-T2F_aPo, reason: not valid java name */
    default int m8178interceptFontStyleT2F_aPo(int fontStyle) {
        return fontStyle;
    }

    /* renamed from: interceptFontSynthesis-Mscr08Y, reason: not valid java name */
    default int m8179interceptFontSynthesisMscr08Y(int fontSynthesis) {
        return fontSynthesis;
    }

    default androidx.compose.ui.text.font.FontWeight interceptFontWeight(androidx.compose.ui.text.font.FontWeight fontWeight) {
        return fontWeight;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/text/font/PlatformResolveInterceptor$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/font/PlatformResolveInterceptor;", "Default", "Landroidx/compose/ui/text/font/PlatformResolveInterceptor;", "getDefault$ui_text", "()Landroidx/compose/ui/text/font/PlatformResolveInterceptor;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ androidx.compose.ui.text.font.PlatformResolveInterceptor.Companion getHighSpeedVideoFpsRangesFor = new androidx.compose.ui.text.font.PlatformResolveInterceptor.Companion();
        private static final androidx.compose.ui.text.font.PlatformResolveInterceptor Default = new androidx.compose.ui.text.font.PlatformResolveInterceptor() { // from class: androidx.compose.ui.text.font.PlatformResolveInterceptor$Companion$Default$1
        };

        private Companion() {
        }

        public final androidx.compose.ui.text.font.PlatformResolveInterceptor getDefault$ui_text() {
            return Default;
        }
    }
}
