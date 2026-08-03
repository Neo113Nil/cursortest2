package androidx.compose.ui.input.pointer;

/* compiled from: PointerIcon.android.kt */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u000e\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f\u001a\u000e\u0010\n\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003\"\u0014\u0010\u0006\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0003\"\u0014\u0010\b\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0003¨\u0006\u000f"}, d2 = {"pointerIconCrosshair", "Landroidx/compose/ui/input/pointer/PointerIcon;", "getPointerIconCrosshair", "()Landroidx/compose/ui/input/pointer/PointerIcon;", "pointerIconDefault", "getPointerIconDefault", "pointerIconHand", "getPointerIconHand", "pointerIconText", "getPointerIconText", "PointerIcon", "pointerIcon", "Landroid/view/PointerIcon;", "pointerIconType", "", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
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
