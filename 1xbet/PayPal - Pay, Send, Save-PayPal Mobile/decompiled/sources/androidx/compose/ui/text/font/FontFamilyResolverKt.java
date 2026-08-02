package androidx.compose.ui.text.font;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001a\u0010\u0001\u001a\u00020\u00008\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0006\u001a\u00020\u00058\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/ui/text/font/TypefaceRequestCache;", "GlobalTypefaceRequestCache", "Landroidx/compose/ui/text/font/TypefaceRequestCache;", "getGlobalTypefaceRequestCache", "()Landroidx/compose/ui/text/font/TypefaceRequestCache;", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "GlobalAsyncTypefaceCache", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "getGlobalAsyncTypefaceCache", "()Landroidx/compose/ui/text/font/AsyncTypefaceCache;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FontFamilyResolverKt {
    private static final androidx.compose.ui.text.font.TypefaceRequestCache GlobalTypefaceRequestCache = new androidx.compose.ui.text.font.TypefaceRequestCache();
    private static final androidx.compose.ui.text.font.AsyncTypefaceCache GlobalAsyncTypefaceCache = new androidx.compose.ui.text.font.AsyncTypefaceCache();

    public static final androidx.compose.ui.text.font.TypefaceRequestCache getGlobalTypefaceRequestCache() {
        return GlobalTypefaceRequestCache;
    }

    public static final androidx.compose.ui.text.font.AsyncTypefaceCache getGlobalAsyncTypefaceCache() {
        return GlobalAsyncTypefaceCache;
    }
}
