package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a#\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\"\u0014\u0010\u0007\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$Builder;", "", "id", "alternateText", "", "appendInlineContent", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Ljava/lang/String;Ljava/lang/String;)V", "INLINE_CONTENT_TAG", "Ljava/lang/String;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InlineTextContentKt {
    public static final java.lang.String INLINE_CONTENT_TAG = "androidx.compose.foundation.text.inlineContent";

    public static /* synthetic */ void appendInlineContent$default(androidx.compose.ui.text.AnnotatedString.Builder builder, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = "�";
        }
        appendInlineContent(builder, str, str2);
    }

    public static final void appendInlineContent(androidx.compose.ui.text.AnnotatedString.Builder builder, java.lang.String str, java.lang.String str2) {
        if (str2.length() <= 0) {
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException("alternateText can't be an empty string.");
        }
        builder.pushStringAnnotation(INLINE_CONTENT_TAG, str);
        builder.append(str2);
        builder.pop();
    }
}
