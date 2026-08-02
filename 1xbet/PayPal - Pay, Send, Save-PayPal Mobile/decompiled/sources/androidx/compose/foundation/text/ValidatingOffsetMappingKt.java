package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a%\u0010\n\u001a\u00020\t*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u000f\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0011\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0010\"\u001a\u0010\u0013\u001a\u00020\u00128\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/compose/ui/text/input/VisualTransformation;", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/input/TransformedText;", "filterWithValidation", "(Landroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/ui/text/AnnotatedString;)Landroidx/compose/ui/text/input/TransformedText;", "", "originalLength", "limit", "", "throwIfNotValidTransform", "(Landroidx/compose/ui/text/input/TransformedText;II)V", "p0", "p1", "p2", "getHighSpeedVideoSizes", "(III)V", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/text/input/OffsetMapping;", "ValidatingEmptyOffsetMappingIdentity", "Landroidx/compose/ui/text/input/OffsetMapping;", "getValidatingEmptyOffsetMappingIdentity", "()Landroidx/compose/ui/text/input/OffsetMapping;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ValidatingOffsetMappingKt {
    private static final androidx.compose.ui.text.input.OffsetMapping ValidatingEmptyOffsetMappingIdentity = new androidx.compose.foundation.text.ValidatingOffsetMapping(androidx.compose.ui.text.input.OffsetMapping.INSTANCE.getIdentity(), 0, 0);

    public static final androidx.compose.ui.text.input.OffsetMapping getValidatingEmptyOffsetMappingIdentity() {
        return ValidatingEmptyOffsetMappingIdentity;
    }

    public static final androidx.compose.ui.text.input.TransformedText filterWithValidation(androidx.compose.ui.text.input.VisualTransformation visualTransformation, androidx.compose.ui.text.AnnotatedString annotatedString) {
        androidx.compose.ui.text.input.TransformedText filter = visualTransformation.filter(annotatedString);
        throwIfNotValidTransform$default(filter, annotatedString.length(), 0, 2, null);
        return new androidx.compose.ui.text.input.TransformedText(filter.getText(), new androidx.compose.foundation.text.ValidatingOffsetMapping(filter.getOffsetMapping(), annotatedString.length(), filter.getText().length()));
    }

    public static /* synthetic */ void throwIfNotValidTransform$default(androidx.compose.ui.text.input.TransformedText transformedText, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 100;
        }
        throwIfNotValidTransform(transformedText, i, i2);
    }

    public static final void throwIfNotValidTransform(androidx.compose.ui.text.input.TransformedText transformedText, int i, int i2) {
        int length = transformedText.getText().length();
        int min = java.lang.Math.min(i, i2);
        for (int i3 = 0; i3 < min; i3++) {
            Camera2StreamConfigurationMap(transformedText.getOffsetMapping().originalToTransformed(i3), length, i3);
        }
        Camera2StreamConfigurationMap(transformedText.getOffsetMapping().originalToTransformed(i), length, i);
        int min2 = java.lang.Math.min(length, i2);
        for (int i4 = 0; i4 < min2; i4++) {
            getHighSpeedVideoSizes(transformedText.getOffsetMapping().transformedToOriginal(i4), i, i4);
        }
        getHighSpeedVideoSizes(transformedText.getOffsetMapping().transformedToOriginal(length), i, length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighSpeedVideoSizes(int i, int i2, int i3) {
        if (i < 0 || i > i2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OffsetMapping.transformedToOriginal returned invalid mapping: ");
            sb.append(i3);
            sb.append(" -> ");
            sb.append(i);
            sb.append(" is not in range of original text [0, ");
            sb.append(i2);
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalStateException(sb.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Camera2StreamConfigurationMap(int i, int i2, int i3) {
        if (i < 0 || i > i2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OffsetMapping.originalToTransformed returned invalid mapping: ");
            sb.append(i3);
            sb.append(" -> ");
            sb.append(i);
            sb.append(" is not in range of transformed text [0, ");
            sb.append(i2);
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalStateException(sb.toString());
        }
    }
}
