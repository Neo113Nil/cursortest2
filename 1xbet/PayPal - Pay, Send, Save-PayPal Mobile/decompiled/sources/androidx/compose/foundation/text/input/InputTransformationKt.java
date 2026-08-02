package androidx.compose.foundation.text.input;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0019\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a5\u0010\b\u001a\u00020\u0000*\u00020\u00002\"\u0010\u0007\u001a\u001e\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0006\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0006\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/compose/foundation/text/input/InputTransformation;", io.ktor.http.LinkHeader.Rel.Next, "then", "(Landroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/foundation/text/input/InputTransformation;)Landroidx/compose/foundation/text/input/InputTransformation;", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "transformation", "byValue", "(Landroidx/compose/foundation/text/input/InputTransformation;Lkotlin/jvm/functions/Function2;)Landroidx/compose/foundation/text/input/InputTransformation;", "Landroidx/compose/ui/text/intl/Locale;", "locale", "allCaps", "(Landroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/ui/text/intl/Locale;)Landroidx/compose/foundation/text/input/InputTransformation;", "", "maxLength", "(Landroidx/compose/foundation/text/input/InputTransformation;I)Landroidx/compose/foundation/text/input/InputTransformation;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InputTransformationKt {
    public static final androidx.compose.foundation.text.input.InputTransformation then(androidx.compose.foundation.text.input.InputTransformation inputTransformation, androidx.compose.foundation.text.input.InputTransformation inputTransformation2) {
        return new androidx.compose.foundation.text.input.FilterChain(inputTransformation, inputTransformation2);
    }

    public static final androidx.compose.foundation.text.input.InputTransformation byValue(androidx.compose.foundation.text.input.InputTransformation inputTransformation, kotlin.jvm.functions.Function2<? super java.lang.CharSequence, ? super java.lang.CharSequence, ? extends java.lang.CharSequence> function2) {
        return then(inputTransformation, new androidx.compose.foundation.text.input.InputTransformationByValue(function2));
    }

    public static final androidx.compose.foundation.text.input.InputTransformation allCaps(androidx.compose.foundation.text.input.InputTransformation inputTransformation, androidx.compose.ui.text.intl.Locale locale) {
        return then(inputTransformation, new androidx.compose.foundation.text.input.AllCapsTransformation(locale));
    }

    public static final androidx.compose.foundation.text.input.InputTransformation maxLength(androidx.compose.foundation.text.input.InputTransformation inputTransformation, int i) {
        return then(inputTransformation, new androidx.compose.foundation.text.input.MaxLengthFilter(i));
    }
}
