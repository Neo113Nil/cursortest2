package androidx.compose.ui.text.font;

/* compiled from: FontFamilyResolver.kt */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011J\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/font/PlatformResolveInterceptor;", "", "interceptFontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "fontFamily", "interceptFontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "fontStyle", "interceptFontStyle-T2F_aPo", "(I)I", "interceptFontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "fontSynthesis", "interceptFontSynthesis-Mscr08Y", "interceptFontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontWeight", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface PlatformResolveInterceptor {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.text.font.PlatformResolveInterceptor.Companion INSTANCE = androidx.compose.ui.text.font.PlatformResolveInterceptor.Companion.$$INSTANCE;

    /* compiled from: FontFamilyResolver.kt */
    /* renamed from: androidx.compose.ui.text.font.PlatformResolveInterceptor$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static androidx.compose.ui.text.font.FontFamily $default$interceptFontFamily(androidx.compose.ui.text.font.PlatformResolveInterceptor _this, androidx.compose.ui.text.font.FontFamily fontFamily) {
            return fontFamily;
        }

        /* renamed from: $default$interceptFontStyle-T2F_aPo, reason: not valid java name */
        public static int m4101$default$interceptFontStyleT2F_aPo(androidx.compose.ui.text.font.PlatformResolveInterceptor _this, int i) {
            return i;
        }

        /* renamed from: $default$interceptFontSynthesis-Mscr08Y, reason: not valid java name */
        public static int m4102$default$interceptFontSynthesisMscr08Y(androidx.compose.ui.text.font.PlatformResolveInterceptor _this, int i) {
            return i;
        }

        public static androidx.compose.ui.text.font.FontWeight $default$interceptFontWeight(androidx.compose.ui.text.font.PlatformResolveInterceptor _this, androidx.compose.ui.text.font.FontWeight fontWeight) {
            return fontWeight;
        }
    }

    androidx.compose.ui.text.font.FontFamily interceptFontFamily(androidx.compose.ui.text.font.FontFamily fontFamily);

    /* renamed from: interceptFontStyle-T2F_aPo */
    int mo4027interceptFontStyleT2F_aPo(int fontStyle);

    /* renamed from: interceptFontSynthesis-Mscr08Y */
    int mo4028interceptFontSynthesisMscr08Y(int fontSynthesis);

    androidx.compose.ui.text.font.FontWeight interceptFontWeight(androidx.compose.ui.text.font.FontWeight fontWeight);

    /* compiled from: FontFamilyResolver.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/font/PlatformResolveInterceptor$Companion;", "", "()V", androidx.webkit.Profile.DEFAULT_PROFILE_NAME, "Landroidx/compose/ui/text/font/PlatformResolveInterceptor;", "getDefault$ui_text_release", "()Landroidx/compose/ui/text/font/PlatformResolveInterceptor;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ androidx.compose.ui.text.font.PlatformResolveInterceptor.Companion $$INSTANCE = new androidx.compose.ui.text.font.PlatformResolveInterceptor.Companion();
        private static final androidx.compose.ui.text.font.PlatformResolveInterceptor Default = new androidx.compose.ui.text.font.PlatformResolveInterceptor() { // from class: androidx.compose.ui.text.font.PlatformResolveInterceptor$Companion$Default$1
            @Override // androidx.compose.ui.text.font.PlatformResolveInterceptor
            public /* synthetic */ androidx.compose.ui.text.font.FontFamily interceptFontFamily(androidx.compose.ui.text.font.FontFamily fontFamily) {
                return androidx.compose.ui.text.font.PlatformResolveInterceptor.CC.$default$interceptFontFamily(this, fontFamily);
            }

            @Override // androidx.compose.ui.text.font.PlatformResolveInterceptor
            /* renamed from: interceptFontStyle-T2F_aPo */
            public /* synthetic */ int mo4027interceptFontStyleT2F_aPo(int i) {
                return androidx.compose.ui.text.font.PlatformResolveInterceptor.CC.m4101$default$interceptFontStyleT2F_aPo(this, i);
            }

            @Override // androidx.compose.ui.text.font.PlatformResolveInterceptor
            /* renamed from: interceptFontSynthesis-Mscr08Y */
            public /* synthetic */ int mo4028interceptFontSynthesisMscr08Y(int i) {
                return androidx.compose.ui.text.font.PlatformResolveInterceptor.CC.m4102$default$interceptFontSynthesisMscr08Y(this, i);
            }

            @Override // androidx.compose.ui.text.font.PlatformResolveInterceptor
            public /* synthetic */ androidx.compose.ui.text.font.FontWeight interceptFontWeight(androidx.compose.ui.text.font.FontWeight fontWeight) {
                return androidx.compose.ui.text.font.PlatformResolveInterceptor.CC.$default$interceptFontWeight(this, fontWeight);
            }
        };

        private Companion() {
        }

        public final androidx.compose.ui.text.font.PlatformResolveInterceptor getDefault$ui_text_release() {
            return Default;
        }
    }
}
