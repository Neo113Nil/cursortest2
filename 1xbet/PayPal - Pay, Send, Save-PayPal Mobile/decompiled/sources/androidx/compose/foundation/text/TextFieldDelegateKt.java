package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a;\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a5\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0017\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\"\u001a\u0010\u0019\u001a\u00020\u00068\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c"}, d2 = {"Landroidx/compose/ui/text/TextStyle;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "", "text", "", "maxLines", "Landroidx/compose/ui/unit/IntSize;", "computeSizeForDefaultText", "(Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/lang/String;I)J", "Landroidx/compose/ui/text/TextLayoutResult;", "layoutResult", "Landroidx/compose/ui/layout/LayoutCoordinates;", "layoutCoordinates", "focusOffset", "Lkotlin/Function0;", "sizeForDefaultText", "Landroidx/compose/ui/geometry/Rect;", "focusedRectInRoot", "(Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/layout/LayoutCoordinates;ILkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", "DefaultWidthCharCount", com.visa.cbp.getEncExpo.warmup, "EmptyTextReplacement", "Ljava/lang/String;", "getEmptyTextReplacement", "()Ljava/lang/String;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextFieldDelegateKt {
    public static final int DefaultWidthCharCount = 10;
    private static final java.lang.String EmptyTextReplacement = kotlin.text.StringsKt.repeat("H", 10);

    public static final java.lang.String getEmptyTextReplacement() {
        return EmptyTextReplacement;
    }

    public static /* synthetic */ long computeSizeForDefaultText$default(androidx.compose.ui.text.TextStyle textStyle, androidx.compose.ui.unit.Density density, androidx.compose.ui.text.font.FontFamily.Resolver resolver, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 8) != 0) {
            str = EmptyTextReplacement;
        }
        if ((i2 & 16) != 0) {
            i = 1;
        }
        return computeSizeForDefaultText(textStyle, density, resolver, str, i);
    }

    public static final long computeSizeForDefaultText(androidx.compose.ui.text.TextStyle textStyle, androidx.compose.ui.unit.Density density, androidx.compose.ui.text.font.FontFamily.Resolver resolver, java.lang.String str, int i) {
        androidx.compose.ui.text.Paragraph m7897ParagraphUl8oQg4;
        m7897ParagraphUl8oQg4 = androidx.compose.ui.text.ParagraphKt.m7897ParagraphUl8oQg4(str, textStyle, androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), density, resolver, (r22 & 32) != 0 ? kotlin.collections.CollectionsKt.emptyList() : kotlin.collections.CollectionsKt.emptyList(), (r22 & 64) != 0 ? kotlin.collections.CollectionsKt.emptyList() : null, (r22 & 128) != 0 ? Integer.MAX_VALUE : i, (r22 & 256) != 0 ? androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8500getClipgIe3tQ8() : androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8500getClipgIe3tQ8());
        return androidx.compose.ui.unit.IntSize.m8767constructorimpl((androidx.compose.foundation.text.TextDelegateKt.ceilToIntPx(m7897ParagraphUl8oQg4.getMinIntrinsicWidth()) << 32) | (androidx.compose.foundation.text.TextDelegateKt.ceilToIntPx(m7897ParagraphUl8oQg4.getHeight()) & 4294967295L));
    }

    public static final androidx.compose.ui.geometry.Rect focusedRectInRoot(androidx.compose.ui.text.TextLayoutResult textLayoutResult, androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates, int i, kotlin.jvm.functions.Function0<androidx.compose.ui.unit.IntSize> function0) {
        androidx.compose.ui.geometry.Rect rect;
        if (i < textLayoutResult.getLayoutInput().getText().length()) {
            rect = textLayoutResult.getBoundingBox(i);
        } else if (i != 0) {
            rect = textLayoutResult.getBoundingBox(i - 1);
        } else {
            rect = new androidx.compose.ui.geometry.Rect(0.0f, 0.0f, 1.0f, (int) (function0.invoke().m8776unboximpl() & 4294967295L));
        }
        float left = rect.getLeft();
        long mo7364localToRootMKHz9U = layoutCoordinates.mo7364localToRootMKHz9U(androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(rect.getTop()) & 4294967295L) | (java.lang.Float.floatToRawIntBits(left) << 32)));
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (mo7364localToRootMKHz9U >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (mo7364localToRootMKHz9U & 4294967295L));
        long m5744constructorimpl = androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32) | (java.lang.Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
        float right = rect.getRight();
        float left2 = rect.getLeft();
        return androidx.compose.ui.geometry.RectKt.m5792Recttz77jQw(m5744constructorimpl, androidx.compose.ui.geometry.Size.m5812constructorimpl((4294967295L & java.lang.Float.floatToRawIntBits(rect.getBottom() - rect.getTop())) | (java.lang.Float.floatToRawIntBits(right - left2) << 32)));
    }
}
