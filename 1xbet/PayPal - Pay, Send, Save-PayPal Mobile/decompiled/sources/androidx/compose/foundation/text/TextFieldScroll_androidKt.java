package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a;\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/text/TextFieldScrollerPosition;", "scrollerPosition", "Landroidx/compose/ui/text/input/TextFieldValue;", "textFieldValue", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "Lkotlin/Function0;", "Landroidx/compose/foundation/text/TextLayoutResultProxy;", "textLayoutResultProvider", "textFieldScroll", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/TextFieldScrollerPosition;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/OverscrollEffect;", "rememberTextFieldOverscrollEffect", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/OverscrollEffect;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldScroll_androidKt {
    public static final androidx.compose.ui.Modifier textFieldScroll(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.text.TextFieldScrollerPosition textFieldScrollerPosition, androidx.compose.ui.text.input.TextFieldValue textFieldValue, androidx.compose.ui.text.input.VisualTransformation visualTransformation, kotlin.jvm.functions.Function0<androidx.compose.foundation.text.TextLayoutResultProxy> function0) {
        return androidx.compose.foundation.text.TextFieldScrollKt.defaultTextFieldScroll(modifier, textFieldScrollerPosition, textFieldValue, visualTransformation, function0);
    }

    public static final androidx.compose.foundation.OverscrollEffect rememberTextFieldOverscrollEffect(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-73012098, i, -1, "androidx.compose.foundation.text.rememberTextFieldOverscrollEffect (TextFieldScroll.android.kt:37)");
        }
        if (!androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            return null;
        }
        androidx.compose.runtime.ComposerKt.traceEventEnd();
        return null;
    }
}
