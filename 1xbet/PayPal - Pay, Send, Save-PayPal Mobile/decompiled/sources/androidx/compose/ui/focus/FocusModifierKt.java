package androidx.compose.ui.focus;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "focusTarget", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "focusModifier"}, k = 2, mv = {2, 0, 0}, xi = 48)
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
