package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Landroidx/compose/ui/layout/RectRulers;", "getDisplayCutoutBounds", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)Ljava/util/List;", "NeverProvidedRectRulers", "Landroidx/compose/ui/layout/RectRulers;", "getNeverProvidedRectRulers", "()Landroidx/compose/ui/layout/RectRulers;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WindowInsetsRulersKt {
    private static final androidx.compose.ui.layout.RectRulers NeverProvidedRectRulers = androidx.compose.ui.layout.RectRulersKt.RectRulers();

    public static final java.util.List<androidx.compose.ui.layout.RectRulers> getDisplayCutoutBounds(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        return androidx.compose.ui.layout.WindowInsetsRulers_androidKt.findDisplayCutouts(placementScope);
    }

    public static final androidx.compose.ui.layout.RectRulers getNeverProvidedRectRulers() {
        return NeverProvidedRectRulers;
    }
}
