package androidx.compose.foundation.text;

/* compiled from: TextFieldGestureModifiers.kt */
@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u001a:\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0000¨\u0006\f"}, d2 = {"textFieldFocusModifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "onFocusChanged", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusState;", "", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldGestureModifiersKt {
    public static final androidx.compose.ui.Modifier textFieldFocusModifier(androidx.compose.ui.Modifier modifier, boolean z, androidx.compose.ui.focus.FocusRequester focusRequester, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, kotlin.jvm.functions.Function1<? super androidx.compose.ui.focus.FocusState, kotlin.Unit> function1) {
        return androidx.compose.foundation.FocusableKt.focusable(androidx.compose.ui.focus.FocusChangedModifierKt.onFocusChanged(androidx.compose.ui.focus.FocusRequesterModifierKt.focusRequester(modifier, focusRequester), function1), z, mutableInteractionSource);
    }
}
