package androidx.compose.ui.focus;

/* compiled from: FocusModifier.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0007\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0003"}, d2 = {"focusModifier", "Landroidx/compose/ui/Modifier;", "focusTarget", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FocusModifierKt {
    public static final androidx.compose.ui.Modifier focusTarget(androidx.compose.ui.Modifier modifier) {
        return modifier.then(androidx.compose.ui.focus.FocusTargetNode.FocusTargetElement.INSTANCE);
    }

    @kotlin.Deprecated(message = "Replaced by focusTarget", replaceWith = @kotlin.ReplaceWith(expression = "focusTarget()", imports = {"androidx.compose.ui.focus.focusTarget"}))
    public static final androidx.compose.ui.Modifier focusModifier(androidx.compose.ui.Modifier modifier) {
        return focusTarget(modifier);
    }
}
