package androidx.compose.ui.focus;

@kotlin.Deprecated(message = "Use FocusEventModifierNode instead")
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusEventModifier;", "Landroidx/compose/ui/Modifier$Element;", "Landroidx/compose/ui/focus/FocusState;", "focusState", "", "onFocusEvent", "(Landroidx/compose/ui/focus/FocusState;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface FocusEventModifier extends androidx.compose.ui.Modifier.Element {
    void onFocusEvent(androidx.compose.ui.focus.FocusState focusState);

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static boolean all(androidx.compose.ui.focus.FocusEventModifier focusEventModifier, kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Element, java.lang.Boolean> function1) {
            return androidx.compose.ui.focus.FocusEventModifier.super.all(function1);
        }

        @java.lang.Deprecated
        public static boolean any(androidx.compose.ui.focus.FocusEventModifier focusEventModifier, kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Element, java.lang.Boolean> function1) {
            return androidx.compose.ui.focus.FocusEventModifier.super.any(function1);
        }

        @java.lang.Deprecated
        public static <R> R foldIn(androidx.compose.ui.focus.FocusEventModifier focusEventModifier, R r, kotlin.jvm.functions.Function2<? super R, ? super androidx.compose.ui.Modifier.Element, ? extends R> function2) {
            return (R) androidx.compose.ui.focus.FocusEventModifier.super.foldIn(r, function2);
        }

        @java.lang.Deprecated
        public static <R> R foldOut(androidx.compose.ui.focus.FocusEventModifier focusEventModifier, R r, kotlin.jvm.functions.Function2<? super androidx.compose.ui.Modifier.Element, ? super R, ? extends R> function2) {
            return (R) androidx.compose.ui.focus.FocusEventModifier.super.foldOut(r, function2);
        }

        @java.lang.Deprecated
        public static androidx.compose.ui.Modifier then(androidx.compose.ui.focus.FocusEventModifier focusEventModifier, androidx.compose.ui.Modifier modifier) {
            return androidx.compose.ui.focus.FocusEventModifier.super.then(modifier);
        }
    }
}
