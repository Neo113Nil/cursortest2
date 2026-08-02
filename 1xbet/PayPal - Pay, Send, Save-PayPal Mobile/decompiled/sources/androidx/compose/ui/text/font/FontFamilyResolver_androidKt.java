package androidx.compose.ui.text.font;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007\u001a\u0015\u0010\b\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\u0004\u001aA\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011*\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroid/content/Context;", "context", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "createFontFamilyResolver", "(Landroid/content/Context;)Landroidx/compose/ui/text/font/FontFamily$Resolver;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;)Landroidx/compose/ui/text/font/FontFamily$Resolver;", "emptyCacheFontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily;", "fontFamily", "Landroidx/compose/ui/text/font/FontWeight;", "fontWeight", "Landroidx/compose/ui/text/font/FontStyle;", "fontStyle", "Landroidx/compose/ui/text/font/FontSynthesis;", "fontSynthesis", "Landroidx/compose/runtime/State;", "Landroid/graphics/Typeface;", "resolveAsTypeface-Wqqsr6A", "(Landroidx/compose/ui/text/font/FontFamily$Resolver;Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;II)Landroidx/compose/runtime/State;", "resolveAsTypeface"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FontFamilyResolver_androidKt {
    public static final androidx.compose.ui.text.font.FontFamily.Resolver createFontFamilyResolver(android.content.Context context) {
        return new androidx.compose.ui.text.font.FontFamilyResolverImpl(new androidx.compose.ui.text.font.AndroidFontLoader(context), androidx.compose.ui.text.font.AndroidFontResolveInterceptor_androidKt.AndroidFontResolveInterceptor(context), null, null, null, 28, null);
    }

    public static final androidx.compose.ui.text.font.FontFamily.Resolver createFontFamilyResolver(android.content.Context context, kotlin.coroutines.CoroutineContext coroutineContext) {
        return new androidx.compose.ui.text.font.FontFamilyResolverImpl(new androidx.compose.ui.text.font.AndroidFontLoader(context), androidx.compose.ui.text.font.AndroidFontResolveInterceptor_androidKt.AndroidFontResolveInterceptor(context), androidx.compose.ui.text.font.FontFamilyResolverKt.getGlobalTypefaceRequestCache(), new androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter(androidx.compose.ui.text.font.FontFamilyResolverKt.getGlobalAsyncTypefaceCache(), coroutineContext), null, 16, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.ui.text.font.FontFamily.Resolver emptyCacheFontFamilyResolver(android.content.Context context) {
        return new androidx.compose.ui.text.font.FontFamilyResolverImpl(new androidx.compose.ui.text.font.AndroidFontLoader(context), null, new androidx.compose.ui.text.font.TypefaceRequestCache(), new androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter(new androidx.compose.ui.text.font.AsyncTypefaceCache(), null, 2, 0 == true ? 1 : 0), null, 18, null);
    }

    /* renamed from: resolveAsTypeface-Wqqsr6A$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.runtime.State m8128resolveAsTypefaceWqqsr6A$default(androidx.compose.ui.text.font.FontFamily.Resolver resolver, androidx.compose.ui.text.font.FontFamily fontFamily, androidx.compose.ui.text.font.FontWeight fontWeight, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            fontFamily = null;
        }
        if ((i3 & 2) != 0) {
            fontWeight = androidx.compose.ui.text.font.FontWeight.INSTANCE.getNormal();
        }
        if ((i3 & 4) != 0) {
            i = androidx.compose.ui.text.font.FontStyle.INSTANCE.m8159getNormal_LCdwA();
        }
        if ((i3 & 8) != 0) {
            i2 = androidx.compose.ui.text.font.FontSynthesis.INSTANCE.m8169getAllGVVA2EU();
        }
        return m8127resolveAsTypefaceWqqsr6A(resolver, fontFamily, fontWeight, i, i2);
    }

    /* renamed from: resolveAsTypeface-Wqqsr6A, reason: not valid java name */
    public static final androidx.compose.runtime.State<android.graphics.Typeface> m8127resolveAsTypefaceWqqsr6A(androidx.compose.ui.text.font.FontFamily.Resolver resolver, androidx.compose.ui.text.font.FontFamily fontFamily, androidx.compose.ui.text.font.FontWeight fontWeight, int i, int i2) {
        androidx.compose.runtime.State mo8125resolveDPcqOEQ = resolver.mo8125resolveDPcqOEQ(fontFamily, fontWeight, i, i2);
        kotlin.jvm.internal.Intrinsics.checkNotNull(mo8125resolveDPcqOEQ, "");
        return mo8125resolveDPcqOEQ;
    }
}
