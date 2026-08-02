package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001as\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0014H\u0000¢\u0006\u0004\b\u0018\u0010\u0019"}, d2 = {"", "", "ceilToIntPx", "(F)I", "Landroidx/compose/foundation/text/TextDelegate;", "current", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/TextStyle;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "", "softWrap", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "maxLines", "minLines", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "updateTextDelegate-rm0N8CA", "(Landroidx/compose/foundation/text/TextDelegate;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;ZIIILjava/util/List;)Landroidx/compose/foundation/text/TextDelegate;", "updateTextDelegate"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextDelegateKt {
    public static final int ceilToIntPx(float f) {
        return java.lang.Math.round((float) java.lang.Math.ceil(f));
    }

    /* renamed from: updateTextDelegate-rm0N8CA, reason: not valid java name */
    public static final androidx.compose.foundation.text.TextDelegate m2101updateTextDelegaterm0N8CA(androidx.compose.foundation.text.TextDelegate textDelegate, androidx.compose.ui.text.AnnotatedString annotatedString, androidx.compose.ui.text.TextStyle textStyle, androidx.compose.ui.unit.Density density, androidx.compose.ui.text.font.FontFamily.Resolver resolver, boolean z, int i, int i2, int i3, java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>> list) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(textDelegate.getText(), annotatedString) && kotlin.jvm.internal.Intrinsics.areEqual(textDelegate.getStyle(), textStyle)) {
            if (textDelegate.getSoftWrap() == z) {
                if (androidx.compose.ui.text.style.TextOverflow.m8491equalsimpl0(textDelegate.getOverflow(), i)) {
                    if (textDelegate.getMaxLines() == i2) {
                        if (textDelegate.getMinLines() == i3 && kotlin.jvm.internal.Intrinsics.areEqual(textDelegate.getDensity(), density)) {
                            if (kotlin.jvm.internal.Intrinsics.areEqual(textDelegate.getPlaceholders(), list) && textDelegate.getFontFamilyResolver() == resolver) {
                                return textDelegate;
                            }
                            return new androidx.compose.foundation.text.TextDelegate(annotatedString, textStyle, i2, i3, z, i, density, resolver, list, null);
                        }
                        return new androidx.compose.foundation.text.TextDelegate(annotatedString, textStyle, i2, i3, z, i, density, resolver, list, null);
                    }
                    return new androidx.compose.foundation.text.TextDelegate(annotatedString, textStyle, i2, i3, z, i, density, resolver, list, null);
                }
                return new androidx.compose.foundation.text.TextDelegate(annotatedString, textStyle, i2, i3, z, i, density, resolver, list, null);
            }
            return new androidx.compose.foundation.text.TextDelegate(annotatedString, textStyle, i2, i3, z, i, density, resolver, list, null);
        }
        return new androidx.compose.foundation.text.TextDelegate(annotatedString, textStyle, i2, i3, z, i, density, resolver, list, null);
    }
}
