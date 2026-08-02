package androidx.compose.ui.text.font;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a=\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000e\u001a\u0015\u0010\u000f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroid/content/Context;", "context", "Landroidx/compose/ui/text/font/FontFamily;", "fontFamily", "", "Lkotlin/Pair;", "Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "styles", "Landroidx/compose/ui/text/font/Typeface;", "Typeface", "(Landroid/content/Context;Landroidx/compose/ui/text/font/FontFamily;Ljava/util/List;)Landroidx/compose/ui/text/font/Typeface;", "Landroid/graphics/Typeface;", "typeface", "(Landroid/graphics/Typeface;)Landroidx/compose/ui/text/font/Typeface;", "FontFamily", "(Landroid/graphics/Typeface;)Landroidx/compose/ui/text/font/FontFamily;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidTypeface_androidKt {
    public static /* synthetic */ androidx.compose.ui.text.font.Typeface Typeface$default(android.content.Context context, androidx.compose.ui.text.font.FontFamily fontFamily, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            list = null;
        }
        return Typeface(context, fontFamily, list);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "This API is deprecated with the introduction of async fonts which cannot resolve in this context. To preload fonts, use FontFamily.Resolver.", replaceWith = @kotlin.ReplaceWith(expression = "FontFamily.Resolver.preload(fontFamily, Font.AndroidResourceLoader(context))", imports = {}))
    public static final androidx.compose.ui.text.font.Typeface Typeface(android.content.Context context, androidx.compose.ui.text.font.FontFamily fontFamily, java.util.List<kotlin.Pair<androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontStyle>> list) {
        if (fontFamily instanceof androidx.compose.ui.text.font.FontListFontFamily) {
            return new androidx.compose.ui.text.platform.AndroidFontListTypeface((androidx.compose.ui.text.font.FontListFontFamily) fontFamily, context, list, null, 8, null);
        }
        if (fontFamily instanceof androidx.compose.ui.text.font.GenericFontFamily) {
            return new androidx.compose.ui.text.platform.AndroidGenericFontFamilyTypeface((androidx.compose.ui.text.font.GenericFontFamily) fontFamily);
        }
        if (fontFamily instanceof androidx.compose.ui.text.font.DefaultFontFamily) {
            return new androidx.compose.ui.text.platform.AndroidDefaultTypeface();
        }
        if (fontFamily instanceof androidx.compose.ui.text.font.LoadedFontFamily) {
            return ((androidx.compose.ui.text.font.LoadedFontFamily) fontFamily).getTypeface();
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final androidx.compose.ui.text.font.Typeface Typeface(android.graphics.Typeface typeface) {
        return new androidx.compose.ui.text.platform.AndroidTypefaceWrapper(typeface);
    }

    public static final androidx.compose.ui.text.font.FontFamily FontFamily(android.graphics.Typeface typeface) {
        return androidx.compose.ui.text.font.FontFamilyKt.FontFamily(Typeface(typeface));
    }
}
