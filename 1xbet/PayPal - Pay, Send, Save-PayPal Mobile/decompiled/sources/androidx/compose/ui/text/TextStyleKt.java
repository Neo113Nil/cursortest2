package androidx.compose.ui.text;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\n\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a%\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/compose/ui/text/TextStyle;", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "stop", "", "fraction", "lerp", "(Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;F)Landroidx/compose/ui/text/TextStyle;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "Landroidx/compose/ui/unit/LayoutDirection;", "direction", "resolveDefaults", "(Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/text/TextStyle;", "layoutDirection", "Landroidx/compose/ui/text/style/TextDirection;", "textDirection", "resolveTextDirection-IhaHGbI", "(Landroidx/compose/ui/unit/LayoutDirection;I)I", "resolveTextDirection", "Landroidx/compose/ui/text/PlatformSpanStyle;", "p0", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "p1", "Landroidx/compose/ui/text/PlatformTextStyle;", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/text/PlatformParagraphStyle;)Landroidx/compose/ui/text/PlatformTextStyle;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextStyleKt {
    public static final androidx.compose.ui.text.TextStyle lerp(androidx.compose.ui.text.TextStyle textStyle, androidx.compose.ui.text.TextStyle textStyle2, float f) {
        return new androidx.compose.ui.text.TextStyle(androidx.compose.ui.text.SpanStyleKt.lerp(textStyle.toSpanStyle(), textStyle2.toSpanStyle(), f), androidx.compose.ui.text.ParagraphStyleKt.lerp(textStyle.toParagraphStyle(), textStyle2.toParagraphStyle(), f));
    }

    public static final androidx.compose.ui.text.TextStyle resolveDefaults(androidx.compose.ui.text.TextStyle textStyle, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        return new androidx.compose.ui.text.TextStyle(androidx.compose.ui.text.SpanStyleKt.resolveSpanStyleDefaults(textStyle.getSpanStyle()), androidx.compose.ui.text.ParagraphStyleKt.resolveParagraphStyleDefaults(textStyle.getParagraphStyle(), layoutDirection), textStyle.getPlatformStyle());
    }

    /* renamed from: resolveTextDirection-IhaHGbI, reason: not valid java name */
    public static final int m8085resolveTextDirectionIhaHGbI(androidx.compose.ui.unit.LayoutDirection layoutDirection, int i) {
        if (androidx.compose.ui.text.style.TextDirection.m8456equalsimpl0(i, androidx.compose.ui.text.style.TextDirection.INSTANCE.m8460getContents_7Xco())) {
            int i2 = androidx.compose.ui.text.TextStyleKt.WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i2 == 1) {
                return androidx.compose.ui.text.style.TextDirection.INSTANCE.m8461getContentOrLtrs_7Xco();
            }
            if (i2 != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return androidx.compose.ui.text.style.TextDirection.INSTANCE.m8462getContentOrRtls_7Xco();
        }
        if (!androidx.compose.ui.text.style.TextDirection.m8456equalsimpl0(i, androidx.compose.ui.text.style.TextDirection.INSTANCE.m8465getUnspecifieds_7Xco())) {
            return i;
        }
        int i3 = androidx.compose.ui.text.TextStyleKt.WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        if (i3 == 1) {
            return androidx.compose.ui.text.style.TextDirection.INSTANCE.m8463getLtrs_7Xco();
        }
        if (i3 != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return androidx.compose.ui.text.style.TextDirection.INSTANCE.m8464getRtls_7Xco();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.text.PlatformTextStyle getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.text.PlatformSpanStyle platformSpanStyle, androidx.compose.ui.text.PlatformParagraphStyle platformParagraphStyle) {
        if (platformSpanStyle == null && platformParagraphStyle == null) {
            return null;
        }
        return androidx.compose.ui.text.AndroidTextStyle_androidKt.createPlatformTextStyle(platformSpanStyle, platformParagraphStyle);
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.ui.unit.LayoutDirection.values().length];
            try {
                iArr[androidx.compose.ui.unit.LayoutDirection.Ltr.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.ui.unit.LayoutDirection.Rtl.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
