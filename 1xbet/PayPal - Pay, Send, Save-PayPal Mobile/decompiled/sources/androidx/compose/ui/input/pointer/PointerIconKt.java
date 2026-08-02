package androidx.compose.ui.input.pointer;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a/\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/input/pointer/PointerIcon;", "icon", "", "overrideDescendants", "pointerHoverIcon", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/input/pointer/PointerIcon;Z)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/node/DpTouchBoundsExpansion;", "touchBoundsExpansion", "stylusHoverIcon", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/input/pointer/PointerIcon;ZLandroidx/compose/ui/node/DpTouchBoundsExpansion;)Landroidx/compose/ui/Modifier;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PointerIconKt {
    public static /* synthetic */ androidx.compose.ui.Modifier pointerHoverIcon$default(androidx.compose.ui.Modifier modifier, androidx.compose.ui.input.pointer.PointerIcon pointerIcon, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return pointerHoverIcon(modifier, pointerIcon, z);
    }

    public static final androidx.compose.ui.Modifier pointerHoverIcon(androidx.compose.ui.Modifier modifier, androidx.compose.ui.input.pointer.PointerIcon pointerIcon, boolean z) {
        return modifier.then(new androidx.compose.ui.input.pointer.PointerHoverIconModifierElement(pointerIcon, z));
    }

    public static /* synthetic */ androidx.compose.ui.Modifier stylusHoverIcon$default(androidx.compose.ui.Modifier modifier, androidx.compose.ui.input.pointer.PointerIcon pointerIcon, boolean z, androidx.compose.ui.node.DpTouchBoundsExpansion dpTouchBoundsExpansion, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            dpTouchBoundsExpansion = null;
        }
        return stylusHoverIcon(modifier, pointerIcon, z, dpTouchBoundsExpansion);
    }

    public static final androidx.compose.ui.Modifier stylusHoverIcon(androidx.compose.ui.Modifier modifier, androidx.compose.ui.input.pointer.PointerIcon pointerIcon, boolean z, androidx.compose.ui.node.DpTouchBoundsExpansion dpTouchBoundsExpansion) {
        return modifier.then(new androidx.compose.ui.input.pointer.StylusHoverIconModifierElement(pointerIcon, z, dpTouchBoundsExpansion));
    }
}
