package androidx.compose.ui.focus;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a%\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusState;", "", "onFocusChanged", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FocusChangedModifierKt {
    public static final androidx.compose.ui.Modifier onFocusChanged(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1<? super androidx.compose.ui.focus.FocusState, kotlin.Unit> function1) {
        return modifier.then(new androidx.compose.ui.focus.FocusChangedElement(function1));
    }
}
