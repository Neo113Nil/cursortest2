package androidx.compose.ui.text.platform;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a#\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001aY\u0010\u0017\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r0\f2\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\r0\f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\"\u0018\u0010\u001c\u001a\u00020\u0019*\u00020\n8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/compose/ui/text/style/TextDirection;", "textDirection", "Landroidx/compose/ui/text/intl/LocaleList;", "localeList", "", "resolveTextDirectionHeuristics-HklW4sA", "(ILandroidx/compose/ui/text/intl/LocaleList;)I", "resolveTextDirectionHeuristics", "", "text", "Landroidx/compose/ui/text/TextStyle;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "annotations", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "ActualParagraphIntrinsics", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;Ljava/util/List;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;)Landroidx/compose/ui/text/ParagraphIntrinsics;", "", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/compose/ui/text/TextStyle;)Z", "getHighSpeedVideoFpsRangesFor"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidParagraphIntrinsics_androidKt {
    /* renamed from: resolveTextDirectionHeuristics-HklW4sA$default, reason: not valid java name */
    public static /* synthetic */ int m8286resolveTextDirectionHeuristicsHklW4sA$default(int i, androidx.compose.ui.text.intl.LocaleList localeList, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            localeList = null;
        }
        return m8285resolveTextDirectionHeuristicsHklW4sA(i, localeList);
    }

    /* renamed from: resolveTextDirectionHeuristics-HklW4sA, reason: not valid java name */
    public static final int m8285resolveTextDirectionHeuristicsHklW4sA(int i, androidx.compose.ui.text.intl.LocaleList localeList) {
        java.util.Locale locale;
        if (androidx.compose.ui.text.style.TextDirection.m8456equalsimpl0(i, androidx.compose.ui.text.style.TextDirection.INSTANCE.m8461getContentOrLtrs_7Xco())) {
            return 2;
        }
        if (androidx.compose.ui.text.style.TextDirection.m8456equalsimpl0(i, androidx.compose.ui.text.style.TextDirection.INSTANCE.m8462getContentOrRtls_7Xco())) {
            return 3;
        }
        if (androidx.compose.ui.text.style.TextDirection.m8456equalsimpl0(i, androidx.compose.ui.text.style.TextDirection.INSTANCE.m8463getLtrs_7Xco())) {
            return 0;
        }
        if (androidx.compose.ui.text.style.TextDirection.m8456equalsimpl0(i, androidx.compose.ui.text.style.TextDirection.INSTANCE.m8464getRtls_7Xco())) {
            return 1;
        }
        if (androidx.compose.ui.text.style.TextDirection.m8456equalsimpl0(i, androidx.compose.ui.text.style.TextDirection.INSTANCE.m8460getContents_7Xco()) || androidx.compose.ui.text.style.TextDirection.m8456equalsimpl0(i, androidx.compose.ui.text.style.TextDirection.INSTANCE.m8465getUnspecifieds_7Xco())) {
            if (localeList == null || (locale = localeList.get(0).getPlatformLocale()) == null) {
                locale = java.util.Locale.getDefault();
            }
            int layoutDirectionFromLocale = androidx.core.text.TextUtilsCompat.getLayoutDirectionFromLocale(locale);
            return (layoutDirectionFromLocale == 0 || layoutDirectionFromLocale != 1) ? 2 : 3;
        }
        throw new java.lang.IllegalStateException("Invalid TextDirection.".toString());
    }

    public static final androidx.compose.ui.text.ParagraphIntrinsics ActualParagraphIntrinsics(java.lang.String str, androidx.compose.ui.text.TextStyle textStyle, java.util.List<? extends androidx.compose.ui.text.AnnotatedString.Range<? extends androidx.compose.ui.text.AnnotatedString.Annotation>> list, java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>> list2, androidx.compose.ui.unit.Density density, androidx.compose.ui.text.font.FontFamily.Resolver resolver) {
        return new androidx.compose.ui.text.platform.AndroidParagraphIntrinsics(str, textStyle, list, list2, resolver, density);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.text.TextStyle textStyle) {
        androidx.compose.ui.text.PlatformParagraphStyle paragraphStyle;
        androidx.compose.ui.text.PlatformTextStyle platformStyle = textStyle.getPlatformStyle();
        return !(((platformStyle == null || (paragraphStyle = platformStyle.getParagraphStyle()) == null) ? null : androidx.compose.ui.text.EmojiSupportMatch.m7864boximpl(paragraphStyle.getEmojiSupportMatch())) == null ? false : androidx.compose.ui.text.EmojiSupportMatch.m7867equalsimpl0(r1.getGetHighSpeedVideoFpsRangesFor(), androidx.compose.ui.text.EmojiSupportMatch.INSTANCE.m7873getNone_3YsG6Y()));
    }
}
