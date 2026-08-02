package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\n\u001a\u0004\u0018\u00010\t*\u0004\u0018\u00010\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\f\u001a\u00020\b*\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\r*\n\u0010\u000f\"\u00020\u000e2\u00020\u000e"}, d2 = {"Landroid/content/ClipData;", "Landroidx/compose/ui/platform/ClipEntry;", "toClipEntry", "(Landroid/content/ClipData;)Landroidx/compose/ui/platform/ClipEntry;", "Landroid/content/ClipDescription;", "Landroidx/compose/ui/platform/ClipMetadata;", "toClipMetadata", "(Landroid/content/ClipDescription;)Landroidx/compose/ui/platform/ClipMetadata;", "", "Landroidx/compose/ui/text/AnnotatedString;", "convertToAnnotatedString", "(Ljava/lang/CharSequence;)Landroidx/compose/ui/text/AnnotatedString;", "convertToCharSequence", "(Landroidx/compose/ui/text/AnnotatedString;)Ljava/lang/CharSequence;", "Landroid/content/ClipboardManager;", "getHighSpeedVideoFpsRanges"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidClipboardManager_androidKt {
    public static final androidx.compose.ui.platform.ClipEntry toClipEntry(android.content.ClipData clipData) {
        return new androidx.compose.ui.platform.ClipEntry(clipData);
    }

    public static final androidx.compose.ui.platform.ClipMetadata toClipMetadata(android.content.ClipDescription clipDescription) {
        return new androidx.compose.ui.platform.ClipMetadata(clipDescription);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.ui.text.AnnotatedString convertToAnnotatedString(java.lang.CharSequence charSequence) {
        java.util.List list = null;
        java.lang.Object[] objArr = 0;
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof android.text.Spanned)) {
            return new androidx.compose.ui.text.AnnotatedString(charSequence.toString(), list, 2, objArr == true ? 1 : 0);
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
                    arrayList.add(new androidx.compose.ui.text.AnnotatedString.Range(new androidx.compose.ui.platform.DecodeHelper(annotation.getValue()).decodeSpanStyle(), spanned.getSpanStart(annotation), spanned.getSpanEnd(annotation)));
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return new androidx.compose.ui.text.AnnotatedString(charSequence.toString(), arrayList, null, 4, null);
    }

    public static final java.lang.CharSequence convertToCharSequence(androidx.compose.ui.text.AnnotatedString annotatedString) {
        if (annotatedString.getSpanStyles().isEmpty()) {
            return annotatedString.getText();
        }
        android.text.SpannableString spannableString = new android.text.SpannableString(annotatedString.getText());
        androidx.compose.ui.platform.EncodeHelper encodeHelper = new androidx.compose.ui.platform.EncodeHelper();
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
}
