package androidx.compose.ui.input.pointer;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007\"\u001a\u0010\b\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u001a\u0010\f\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000b\"\u001a\u0010\u000e\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b\"\u001a\u0010\u0010\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u000b"}, d2 = {"Landroid/view/PointerIcon;", "pointerIcon", "Landroidx/compose/ui/input/pointer/PointerIcon;", "PointerIcon", "(Landroid/view/PointerIcon;)Landroidx/compose/ui/input/pointer/PointerIcon;", "", "pointerIconType", "(I)Landroidx/compose/ui/input/pointer/PointerIcon;", "pointerIconDefault", "Landroidx/compose/ui/input/pointer/PointerIcon;", "getPointerIconDefault", "()Landroidx/compose/ui/input/pointer/PointerIcon;", "pointerIconCrosshair", "getPointerIconCrosshair", "pointerIconText", "getPointerIconText", "pointerIconHand", "getPointerIconHand"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PointerIcon_androidKt {
    private static final androidx.compose.ui.input.pointer.PointerIcon pointerIconDefault = new androidx.compose.ui.input.pointer.AndroidPointerIconType(1000);
    private static final androidx.compose.ui.input.pointer.PointerIcon pointerIconCrosshair = new androidx.compose.ui.input.pointer.AndroidPointerIconType(1007);
    private static final androidx.compose.ui.input.pointer.PointerIcon pointerIconText = new androidx.compose.ui.input.pointer.AndroidPointerIconType(1008);
    private static final androidx.compose.ui.input.pointer.PointerIcon pointerIconHand = new androidx.compose.ui.input.pointer.AndroidPointerIconType(1002);

    public static final androidx.compose.ui.input.pointer.PointerIcon PointerIcon(android.view.PointerIcon pointerIcon) {
        return new androidx.compose.ui.input.pointer.AndroidPointerIcon(pointerIcon);
    }

    public static final androidx.compose.ui.input.pointer.PointerIcon PointerIcon(int i) {
        return new androidx.compose.ui.input.pointer.AndroidPointerIconType(i);
    }

    public static final androidx.compose.ui.input.pointer.PointerIcon getPointerIconDefault() {
        return pointerIconDefault;
    }

    public static final androidx.compose.ui.input.pointer.PointerIcon getPointerIconCrosshair() {
        return pointerIconCrosshair;
    }

    public static final androidx.compose.ui.input.pointer.PointerIcon getPointerIconText() {
        return pointerIconText;
    }

    public static final androidx.compose.ui.input.pointer.PointerIcon getPointerIconHand() {
        return pointerIconHand;
    }
}
