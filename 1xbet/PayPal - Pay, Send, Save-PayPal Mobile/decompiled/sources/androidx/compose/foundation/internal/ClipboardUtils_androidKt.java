package androidx.compose.foundation.internal;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0004\u001a\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0080@¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0000H\u0080@¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0015\u0010\t\u001a\u00020\b*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\f\u001a\u00020\b*\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000e\u001a\u00020\b*\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\r\u001a\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u0004H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u0004*\u0004\u0018\u00010\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/compose/ui/platform/ClipEntry;", "", "readText", "(Landroidx/compose/ui/platform/ClipEntry;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/text/AnnotatedString;", "readAnnotatedString", "toClipEntry", "(Landroidx/compose/ui/text/AnnotatedString;)Landroidx/compose/ui/platform/ClipEntry;", "", "hasText", "(Landroidx/compose/ui/platform/ClipEntry;)Z", "Landroidx/compose/ui/platform/Clipboard;", "isReadSupported", "(Landroidx/compose/ui/platform/Clipboard;)Z", "isWriteSupported", "", "convertToCharSequence", "(Landroidx/compose/ui/text/AnnotatedString;)Ljava/lang/CharSequence;", "convertToAnnotatedString", "(Ljava/lang/CharSequence;)Landroidx/compose/ui/text/AnnotatedString;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ClipboardUtils_androidKt {
    public static final boolean isReadSupported(androidx.compose.ui.platform.Clipboard clipboard) {
        return true;
    }

    public static final boolean isWriteSupported(androidx.compose.ui.platform.Clipboard clipboard) {
        return true;
    }

    public static final java.lang.Object readText(androidx.compose.ui.platform.ClipEntry clipEntry, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return androidx.compose.foundation.internal.ClipboardUtils.readText(clipEntry);
    }

    public static final java.lang.Object readAnnotatedString(androidx.compose.ui.platform.ClipEntry clipEntry, kotlin.coroutines.Continuation<? super androidx.compose.ui.text.AnnotatedString> continuation) {
        return androidx.compose.foundation.internal.ClipboardUtils.readAnnotatedString(clipEntry);
    }

    public static final androidx.compose.ui.platform.ClipEntry toClipEntry(androidx.compose.ui.text.AnnotatedString annotatedString) {
        return androidx.compose.foundation.internal.ClipboardUtils.toClipEntry(annotatedString);
    }

    public static final boolean hasText(androidx.compose.ui.platform.ClipEntry clipEntry) {
        return androidx.compose.foundation.internal.ClipboardUtils.hasText(clipEntry);
    }

    public static final java.lang.CharSequence convertToCharSequence(androidx.compose.ui.text.AnnotatedString annotatedString) {
        if (annotatedString.getSpanStyles().isEmpty()) {
            return annotatedString.getText();
        }
        android.text.SpannableString spannableString = new android.text.SpannableString(annotatedString.getText());
        androidx.compose.foundation.internal.EncodeHelper encodeHelper = new androidx.compose.foundation.internal.EncodeHelper();
        java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.SpanStyle>> spanStyles = annotatedString.getSpanStyles();
        int size = spanStyles.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.SpanStyle> range = spanStyles.get(i);
            androidx.compose.ui.text.SpanStyle component1 = range.component1();
            int start = range.getStart();
            int end = range.getEnd();
            encodeHelper.reset();
            encodeHelper.encode(component1);
            spannableString.setSpan(new android.text.Annotation("androidx.compose.text.SpanStyle", encodeHelper.encodedString()), start, end, 33);
        }
        return spannableString;
    }

    public static final androidx.compose.ui.text.AnnotatedString convertToAnnotatedString(java.lang.CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof android.text.Spanned)) {
            return new androidx.compose.ui.text.AnnotatedString(charSequence.toString(), null, 2, null);
        }
        android.text.Spanned spanned = (android.text.Spanned) charSequence;
        int i = 0;
        android.text.Annotation[] annotationArr = (android.text.Annotation[]) spanned.getSpans(0, spanned.length(), android.text.Annotation.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int lastIndex = kotlin.collections.ArraysKt.getLastIndex(annotationArr);
        if (lastIndex >= 0) {
            while (true) {
                android.text.Annotation annotation = annotationArr[i];
                if (kotlin.jvm.internal.Intrinsics.areEqual(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                    arrayList.add(new androidx.compose.ui.text.AnnotatedString.Range(new androidx.compose.foundation.internal.DecodeHelper(annotation.getValue()).decodeSpanStyle(), spanned.getSpanStart(annotation), spanned.getSpanEnd(annotation)));
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return new androidx.compose.ui.text.AnnotatedString(charSequence.toString(), arrayList, null, 4, null);
    }
}
