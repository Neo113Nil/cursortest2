package androidx.compose.foundation.text2.input;

/* compiled from: CodepointTransformation.kt */
@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u001c\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\nH\u0000¨\u0006\u000b"}, d2 = {"mask", "Landroidx/compose/foundation/text2/input/CodepointTransformation;", "Landroidx/compose/foundation/text2/input/CodepointTransformation$Companion;", com.google.firebase.analytics.FirebaseAnalytics.Param.CHARACTER, "", "toVisualText", "", "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "codepointTransformation", "offsetMappingCalculator", "Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CodepointTransformationKt {
    public static final androidx.compose.foundation.text2.input.CodepointTransformation mask(androidx.compose.foundation.text2.input.CodepointTransformation.Companion companion, char c) {
        return new androidx.compose.foundation.text2.input.MaskCodepointTransformation(c);
    }

    public static final java.lang.CharSequence toVisualText(androidx.compose.foundation.text2.input.TextFieldCharSequence textFieldCharSequence, androidx.compose.foundation.text2.input.CodepointTransformation codepointTransformation, androidx.compose.foundation.text2.input.internal.OffsetMappingCalculator offsetMappingCalculator) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i = 0;
        boolean z = false;
        int i2 = 0;
        while (i < textFieldCharSequence.length()) {
            int codePointAt = androidx.compose.foundation.text2.input.internal.CodepointHelpers_jvmKt.codePointAt(textFieldCharSequence, i);
            int transform = codepointTransformation.transform(i2, codePointAt);
            int charCount = androidx.compose.foundation.text2.input.internal.CodepointHelpers_jvmKt.charCount(codePointAt);
            if (transform != codePointAt) {
                offsetMappingCalculator.recordEditOperation(sb.length(), sb.length() + charCount, androidx.compose.foundation.text2.input.internal.CodepointHelpers_jvmKt.charCount(transform));
                z = true;
            }
            androidx.compose.foundation.text.StringHelpers_jvmKt.appendCodePointX(sb, transform);
            i += charCount;
            i2++;
        }
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return z ? sb2 : textFieldCharSequence;
    }
}
