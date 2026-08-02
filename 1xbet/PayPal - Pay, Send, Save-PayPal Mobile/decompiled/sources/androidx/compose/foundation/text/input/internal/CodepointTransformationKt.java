package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\u000b\u001a\u00020\n*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/compose/foundation/text/input/internal/CodepointTransformation$Companion;", "", "character", "Landroidx/compose/foundation/text/input/internal/CodepointTransformation;", com.daon.sdk.face.license.License.FEATURE_MASK, "(Landroidx/compose/foundation/text/input/internal/CodepointTransformation$Companion;C)Landroidx/compose/foundation/text/input/internal/CodepointTransformation;", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "codepointTransformation", "Landroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;", "offsetMappingCalculator", "", "toVisualText", "(Landroidx/compose/foundation/text/input/TextFieldCharSequence;Landroidx/compose/foundation/text/input/internal/CodepointTransformation;Landroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;)Ljava/lang/CharSequence;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CodepointTransformationKt {
    public static final androidx.compose.foundation.text.input.internal.CodepointTransformation mask(androidx.compose.foundation.text.input.internal.CodepointTransformation.Companion companion, char c) {
        return new androidx.compose.foundation.text.input.internal.MaskCodepointTransformation(c);
    }

    public static final java.lang.CharSequence toVisualText(androidx.compose.foundation.text.input.TextFieldCharSequence textFieldCharSequence, androidx.compose.foundation.text.input.internal.CodepointTransformation codepointTransformation, androidx.compose.foundation.text.input.internal.OffsetMappingCalculator offsetMappingCalculator) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i = 0;
        boolean z = false;
        int i2 = 0;
        while (i < textFieldCharSequence.length()) {
            int codePointAt = androidx.compose.foundation.text.input.internal.CodepointHelpers_jvmKt.codePointAt(textFieldCharSequence, i);
            int transform = codepointTransformation.transform(i2, codePointAt);
            int charCount = androidx.compose.foundation.text.input.internal.CodepointHelpers_jvmKt.charCount(codePointAt);
            if (transform != codePointAt) {
                offsetMappingCalculator.recordEditOperation(sb.length(), sb.length() + charCount, androidx.compose.foundation.text.input.internal.CodepointHelpers_jvmKt.charCount(transform));
                z = true;
            }
            androidx.compose.foundation.text.StringHelpers_jvmKt.appendCodePointX(sb, transform);
            i += charCount;
            i2++;
        }
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return z ? obj : textFieldCharSequence;
    }
}
