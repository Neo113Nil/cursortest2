package androidx.compose.ui.text;

/* compiled from: TextStyle.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001e\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002\u001a\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b\u001a\u0016\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f\u001a\"\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0011H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"createPlatformTextStyleInternal", "Landroidx/compose/ui/text/PlatformTextStyle;", "platformSpanStyle", "Landroidx/compose/ui/text/PlatformSpanStyle;", "platformParagraphStyle", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "lerp", "Landroidx/compose/ui/text/TextStyle;", "start", "stop", "fraction", "", "resolveDefaults", "style", "direction", "Landroidx/compose/ui/unit/LayoutDirection;", "resolveTextDirection", "Landroidx/compose/ui/text/style/TextDirection;", "layoutDirection", "textDirection", "resolveTextDirection-IhaHGbI", "(Landroidx/compose/ui/unit/LayoutDirection;I)I", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextStyleKt {

    /* compiled from: TextStyle.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
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

    public static final androidx.compose.ui.text.TextStyle lerp(androidx.compose.ui.text.TextStyle textStyle, androidx.compose.ui.text.TextStyle textStyle2, float f) {
        return new androidx.compose.ui.text.TextStyle(androidx.compose.ui.text.SpanStyleKt.lerp(textStyle.toSpanStyle(), textStyle2.toSpanStyle(), f), androidx.compose.ui.text.ParagraphStyleKt.lerp(textStyle.toParagraphStyle(), textStyle2.toParagraphStyle(), f));
    }

    public static final androidx.compose.ui.text.TextStyle resolveDefaults(androidx.compose.ui.text.TextStyle textStyle, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        return new androidx.compose.ui.text.TextStyle(androidx.compose.ui.text.SpanStyleKt.resolveSpanStyleDefaults(textStyle.getSpanStyle()), androidx.compose.ui.text.ParagraphStyleKt.resolveParagraphStyleDefaults(textStyle.getParagraphStyle(), layoutDirection), textStyle.getPlatformStyle());
    }

    /* renamed from: resolveTextDirection-IhaHGbI, reason: not valid java name */
    public static final int m4010resolveTextDirectionIhaHGbI(androidx.compose.ui.unit.LayoutDirection layoutDirection, int i) {
        if (androidx.compose.ui.text.style.TextDirection.m4370equalsimpl0(i, androidx.compose.ui.text.style.TextDirection.INSTANCE.m4374getContents_7Xco())) {
            int i2 = androidx.compose.ui.text.TextStyleKt.WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i2 == 1) {
                return androidx.compose.ui.text.style.TextDirection.INSTANCE.m4375getContentOrLtrs_7Xco();
            }
            if (i2 == 2) {
                return androidx.compose.ui.text.style.TextDirection.INSTANCE.m4376getContentOrRtls_7Xco();
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
        if (!androidx.compose.ui.text.style.TextDirection.m4370equalsimpl0(i, androidx.compose.ui.text.style.TextDirection.INSTANCE.m4379getUnspecifieds_7Xco())) {
            return i;
        }
        int i3 = androidx.compose.ui.text.TextStyleKt.WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        if (i3 == 1) {
            return androidx.compose.ui.text.style.TextDirection.INSTANCE.m4377getLtrs_7Xco();
        }
        if (i3 == 2) {
            return androidx.compose.ui.text.style.TextDirection.INSTANCE.m4378getRtls_7Xco();
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.text.PlatformTextStyle createPlatformTextStyleInternal(androidx.compose.ui.text.PlatformSpanStyle platformSpanStyle, androidx.compose.ui.text.PlatformParagraphStyle platformParagraphStyle) {
        if (platformSpanStyle == null && platformParagraphStyle == null) {
            return null;
        }
        return androidx.compose.ui.text.AndroidTextStyle_androidKt.createPlatformTextStyle(platformSpanStyle, platformParagraphStyle);
    }
}
