package androidx.compose.ui.text.platform;

/* compiled from: AndroidParagraphIntrinsics.android.kt */
@kotlin.Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aP\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\f0\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0000\u001a&\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"hasEmojiCompat", "", "Landroidx/compose/ui/text/TextStyle;", "getHasEmojiCompat", "(Landroidx/compose/ui/text/TextStyle;)Z", "ActualParagraphIntrinsics", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "text", "", "style", "spanStyles", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "placeholders", "Landroidx/compose/ui/text/Placeholder;", "density", "Landroidx/compose/ui/unit/Density;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "resolveTextDirectionHeuristics", "", "textDirection", "Landroidx/compose/ui/text/style/TextDirection;", "localeList", "Landroidx/compose/ui/text/intl/LocaleList;", "resolveTextDirectionHeuristics-HklW4sA", "(ILandroidx/compose/ui/text/intl/LocaleList;)I", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidParagraphIntrinsics_androidKt {
    /* renamed from: resolveTextDirectionHeuristics-HklW4sA$default, reason: not valid java name */
    public static /* synthetic */ int m4217resolveTextDirectionHeuristicsHklW4sA$default(int i, androidx.compose.ui.text.intl.LocaleList localeList, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            localeList = null;
        }
        return m4216resolveTextDirectionHeuristicsHklW4sA(i, localeList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        if (r5 == null) goto L22;
     */
    /* renamed from: resolveTextDirectionHeuristics-HklW4sA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int m4216resolveTextDirectionHeuristicsHklW4sA(int i, androidx.compose.ui.text.intl.LocaleList localeList) {
        java.util.Locale locale;
        if (androidx.compose.ui.text.style.TextDirection.m4370equalsimpl0(i, androidx.compose.ui.text.style.TextDirection.INSTANCE.m4375getContentOrLtrs_7Xco())) {
            return 2;
        }
        if (!androidx.compose.ui.text.style.TextDirection.m4370equalsimpl0(i, androidx.compose.ui.text.style.TextDirection.INSTANCE.m4376getContentOrRtls_7Xco())) {
            if (androidx.compose.ui.text.style.TextDirection.m4370equalsimpl0(i, androidx.compose.ui.text.style.TextDirection.INSTANCE.m4377getLtrs_7Xco())) {
                return 0;
            }
            if (androidx.compose.ui.text.style.TextDirection.m4370equalsimpl0(i, androidx.compose.ui.text.style.TextDirection.INSTANCE.m4378getRtls_7Xco())) {
                return 1;
            }
            if (androidx.compose.ui.text.style.TextDirection.m4370equalsimpl0(i, androidx.compose.ui.text.style.TextDirection.INSTANCE.m4374getContents_7Xco()) || androidx.compose.ui.text.style.TextDirection.m4370equalsimpl0(i, androidx.compose.ui.text.style.TextDirection.INSTANCE.m4379getUnspecifieds_7Xco())) {
                if (localeList != null) {
                    androidx.compose.ui.text.intl.PlatformLocale platformLocale = localeList.get(0).getPlatformLocale();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(platformLocale, "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale");
                    locale = ((androidx.compose.ui.text.intl.AndroidLocale) platformLocale).getJavaLocale();
                }
                locale = java.util.Locale.getDefault();
                int layoutDirectionFromLocale = androidx.core.text.TextUtilsCompat.getLayoutDirectionFromLocale(locale);
                if (layoutDirectionFromLocale == 0 || layoutDirectionFromLocale != 1) {
                    return 2;
                }
            } else {
                throw new java.lang.IllegalStateException("Invalid TextDirection.".toString());
            }
        }
        return 3;
    }

    public static final androidx.compose.ui.text.ParagraphIntrinsics ActualParagraphIntrinsics(java.lang.String str, androidx.compose.ui.text.TextStyle textStyle, java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.SpanStyle>> list, java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>> list2, androidx.compose.ui.unit.Density density, androidx.compose.ui.text.font.FontFamily.Resolver resolver) {
        return new androidx.compose.ui.text.platform.AndroidParagraphIntrinsics(str, textStyle, list, list2, resolver, density);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHasEmojiCompat(androidx.compose.ui.text.TextStyle textStyle) {
        androidx.compose.ui.text.PlatformParagraphStyle paragraphStyle;
        androidx.compose.ui.text.PlatformTextStyle platformStyle = textStyle.getPlatformStyle();
        return !(((platformStyle == null || (paragraphStyle = platformStyle.getParagraphStyle()) == null) ? null : androidx.compose.ui.text.EmojiSupportMatch.m3828boximpl(paragraphStyle.getEmojiSupportMatch())) == null ? false : androidx.compose.ui.text.EmojiSupportMatch.m3831equalsimpl0(r1.getValue(), androidx.compose.ui.text.EmojiSupportMatch.INSTANCE.m3836getNone_3YsG6Y()));
    }
}
