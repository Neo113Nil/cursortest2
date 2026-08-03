package androidx.compose.foundation.text;

/* compiled from: ValidatingOffsetMapping.kt */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\t"}, d2 = {"ValidatingEmptyOffsetMappingIdentity", "Landroidx/compose/ui/text/input/OffsetMapping;", "getValidatingEmptyOffsetMappingIdentity", "()Landroidx/compose/ui/text/input/OffsetMapping;", "filterWithValidation", "Landroidx/compose/ui/text/input/TransformedText;", "Landroidx/compose/ui/text/input/VisualTransformation;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ValidatingOffsetMappingKt {
    private static final androidx.compose.ui.text.input.OffsetMapping ValidatingEmptyOffsetMappingIdentity = new androidx.compose.foundation.text.ValidatingOffsetMapping(androidx.compose.ui.text.input.OffsetMapping.INSTANCE.getIdentity(), 0, 0);

    public static final androidx.compose.ui.text.input.OffsetMapping getValidatingEmptyOffsetMappingIdentity() {
        return ValidatingEmptyOffsetMappingIdentity;
    }

    public static final androidx.compose.ui.text.input.TransformedText filterWithValidation(androidx.compose.ui.text.input.VisualTransformation visualTransformation, androidx.compose.ui.text.AnnotatedString annotatedString) {
        androidx.compose.ui.text.input.TransformedText filter = visualTransformation.filter(annotatedString);
        return new androidx.compose.ui.text.input.TransformedText(filter.getText(), new androidx.compose.foundation.text.ValidatingOffsetMapping(filter.getOffsetMapping(), annotatedString.length(), filter.getText().length()));
    }
}
