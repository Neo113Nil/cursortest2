package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a%\u0010\u000b\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\t0\bj\u0002`\n\u0018\u00010\u0007*\u00020\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\f\"\u001a\u0010\u000e\u001a\u00020\r8\u0000X\u0080T¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/core/view/inputmethod/InputContentInfoCompat;", "Landroid/os/Bundle;", "extras", "Landroidx/compose/foundation/content/TransferableContent;", "toTransferableContent", "(Landroidx/core/view/inputmethod/InputContentInfoCompat;Landroid/os/Bundle;)Landroidx/compose/foundation/content/TransferableContent;", "Landroid/text/Spanned;", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "Landroidx/compose/foundation/text/input/PlacedAnnotation;", "toAnnotationList", "(Landroid/text/Spanned;)Ljava/util/List;", "", "SIC_DEBUG", "Z", "getSIC_DEBUG$annotations", "()V"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StatelessInputConnection_androidKt {
    public static final boolean SIC_DEBUG = false;

    public static /* synthetic */ void getSIC_DEBUG$annotations() {
    }

    public static final androidx.compose.foundation.content.TransferableContent toTransferableContent(androidx.core.view.inputmethod.InputContentInfoCompat inputContentInfoCompat, android.os.Bundle bundle) {
        androidx.compose.ui.platform.ClipEntry clipEntry = androidx.compose.ui.platform.AndroidClipboardManager_androidKt.toClipEntry(new android.content.ClipData(inputContentInfoCompat.getDescription(), new android.content.ClipData.Item(inputContentInfoCompat.getContentUri())));
        int m1377getKeyboardkB6V9T0 = androidx.compose.foundation.content.TransferableContent.Source.INSTANCE.m1377getKeyboardkB6V9T0();
        androidx.compose.ui.platform.ClipMetadata clipMetadata = androidx.compose.ui.platform.AndroidClipboardManager_androidKt.toClipMetadata(inputContentInfoCompat.getDescription());
        android.net.Uri linkUri = inputContentInfoCompat.getLinkUri();
        if (bundle == null) {
            bundle = android.os.Bundle.EMPTY;
        }
        return new androidx.compose.foundation.content.TransferableContent(clipEntry, clipMetadata, m1377getKeyboardkB6V9T0, new androidx.compose.foundation.content.PlatformTransferableContent(linkUri, bundle), null);
    }

    public static final java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.AnnotatedString.Annotation>> toAnnotationList(android.text.Spanned spanned) {
        androidx.compose.ui.text.SpanStyle spanStyle;
        androidx.compose.ui.text.font.FontFamily fontFamily;
        androidx.compose.ui.text.font.GenericFontFamily FontFamily;
        androidx.compose.ui.text.SpanStyle spanStyle2;
        java.util.ArrayList arrayList = null;
        for (java.lang.Object obj : spanned.getSpans(0, spanned.length(), java.lang.Object.class)) {
            if (obj instanceof android.text.style.BackgroundColorSpan) {
                spanStyle = new androidx.compose.ui.text.SpanStyle(0L, 0L, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, (androidx.compose.ui.text.font.FontFamily) null, (java.lang.String) null, 0L, (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, androidx.compose.ui.graphics.ColorKt.Color(((android.text.style.BackgroundColorSpan) obj).getBackgroundColor()), (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.text.PlatformSpanStyle) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, 63487, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            } else if (obj instanceof android.text.style.ForegroundColorSpan) {
                spanStyle = new androidx.compose.ui.text.SpanStyle(androidx.compose.ui.graphics.ColorKt.Color(((android.text.style.ForegroundColorSpan) obj).getForegroundColor()), 0L, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, (androidx.compose.ui.text.font.FontFamily) null, (java.lang.String) null, 0L, (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.text.PlatformSpanStyle) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, org.apache.commons.imaging.formats.jpeg.JpegConstants.COM_MARKER, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            } else if (obj instanceof android.text.style.StrikethroughSpan) {
                spanStyle = new androidx.compose.ui.text.SpanStyle(0L, 0L, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, (androidx.compose.ui.text.font.FontFamily) null, (java.lang.String) null, 0L, (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, androidx.compose.ui.text.style.TextDecoration.INSTANCE.getLineThrough(), (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.text.PlatformSpanStyle) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, 61439, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            } else if (!(obj instanceof android.text.style.StyleSpan)) {
                if (obj instanceof android.text.style.TypefaceSpan) {
                    android.text.style.TypefaceSpan typefaceSpan = (android.text.style.TypefaceSpan) obj;
                    java.lang.String family = typefaceSpan.getFamily();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(family, androidx.compose.ui.text.font.FontFamily.INSTANCE.getCursive().getName())) {
                        FontFamily = androidx.compose.ui.text.font.FontFamily.INSTANCE.getCursive();
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(family, androidx.compose.ui.text.font.FontFamily.INSTANCE.getMonospace().getName())) {
                        FontFamily = androidx.compose.ui.text.font.FontFamily.INSTANCE.getMonospace();
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(family, androidx.compose.ui.text.font.FontFamily.INSTANCE.getSansSerif().getName())) {
                        FontFamily = androidx.compose.ui.text.font.FontFamily.INSTANCE.getSansSerif();
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(family, androidx.compose.ui.text.font.FontFamily.INSTANCE.getSerif().getName())) {
                        FontFamily = androidx.compose.ui.text.font.FontFamily.INSTANCE.getSerif();
                    } else {
                        java.lang.String family2 = typefaceSpan.getFamily();
                        java.lang.String str = family2;
                        if (str != null && str.length() != 0) {
                            android.graphics.Typeface create = android.graphics.Typeface.create(family2, 0);
                            if (kotlin.jvm.internal.Intrinsics.areEqual(create, android.graphics.Typeface.DEFAULT) || kotlin.jvm.internal.Intrinsics.areEqual(create, android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, 0))) {
                                create = null;
                            }
                            if (create != null) {
                                FontFamily = androidx.compose.ui.text.font.AndroidTypeface_androidKt.FontFamily(create);
                            }
                        }
                        fontFamily = null;
                        spanStyle = new androidx.compose.ui.text.SpanStyle(0L, 0L, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, fontFamily, (java.lang.String) null, 0L, (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.text.PlatformSpanStyle) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, 65503, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                    }
                    fontFamily = FontFamily;
                    spanStyle = new androidx.compose.ui.text.SpanStyle(0L, 0L, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, fontFamily, (java.lang.String) null, 0L, (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.text.PlatformSpanStyle) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, 65503, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                } else {
                    spanStyle = obj instanceof android.text.style.UnderlineSpan ? new androidx.compose.ui.text.SpanStyle(0L, 0L, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, (androidx.compose.ui.text.font.FontFamily) null, (java.lang.String) null, 0L, (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, androidx.compose.ui.text.style.TextDecoration.INSTANCE.getUnderline(), (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.text.PlatformSpanStyle) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, 61439, (kotlin.jvm.internal.DefaultConstructorMarker) null) : null;
                }
            } else {
                int style = ((android.text.style.StyleSpan) obj).getStyle();
                if (style == 1) {
                    spanStyle2 = new androidx.compose.ui.text.SpanStyle(0L, 0L, androidx.compose.ui.text.font.FontWeight.INSTANCE.getBold(), (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, (androidx.compose.ui.text.font.FontFamily) null, (java.lang.String) null, 0L, (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.text.PlatformSpanStyle) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, 65531, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                } else if (style == 2) {
                    spanStyle2 = new androidx.compose.ui.text.SpanStyle(0L, 0L, (androidx.compose.ui.text.font.FontWeight) null, androidx.compose.ui.text.font.FontStyle.m8149boximpl(androidx.compose.ui.text.font.FontStyle.INSTANCE.m8158getItalic_LCdwA()), (androidx.compose.ui.text.font.FontSynthesis) null, (androidx.compose.ui.text.font.FontFamily) null, (java.lang.String) null, 0L, (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.text.PlatformSpanStyle) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, 65527, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                } else {
                    spanStyle2 = style != 3 ? null : new androidx.compose.ui.text.SpanStyle(0L, 0L, androidx.compose.ui.text.font.FontWeight.INSTANCE.getBold(), androidx.compose.ui.text.font.FontStyle.m8149boximpl(androidx.compose.ui.text.font.FontStyle.INSTANCE.m8158getItalic_LCdwA()), (androidx.compose.ui.text.font.FontSynthesis) null, (androidx.compose.ui.text.font.FontFamily) null, (java.lang.String) null, 0L, (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.text.PlatformSpanStyle) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, 65523, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                }
                spanStyle = spanStyle2;
            }
            if (spanStyle != null) {
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                }
                arrayList.add(new androidx.compose.ui.text.AnnotatedString.Range<>(spanStyle, spanned.getSpanStart(obj), spanned.getSpanEnd(obj)));
            }
        }
        return arrayList;
    }

    public static final /* synthetic */ android.view.inputmethod.ExtractedText access$toExtractedText(androidx.compose.foundation.text.input.TextFieldCharSequence textFieldCharSequence) {
        android.view.inputmethod.ExtractedText extractedText = new android.view.inputmethod.ExtractedText();
        androidx.compose.foundation.text.input.TextFieldCharSequence textFieldCharSequence2 = textFieldCharSequence;
        extractedText.text = textFieldCharSequence2;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = textFieldCharSequence.length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = androidx.compose.ui.text.TextRange.m8037getMinimpl(textFieldCharSequence.getSelection());
        extractedText.selectionEnd = androidx.compose.ui.text.TextRange.m8036getMaximpl(textFieldCharSequence.getSelection());
        extractedText.flags = !kotlin.text.StringsKt.contains$default((java.lang.CharSequence) textFieldCharSequence2, '\n', false, 2, (java.lang.Object) null) ? 1 : 0;
        return extractedText;
    }
}
