package androidx.compose.ui.input.pointer;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerIcon;", "", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface PointerIcon {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.input.pointer.PointerIcon.Companion INSTANCE = androidx.compose.ui.input.pointer.PointerIcon.Companion.Camera2StreamConfigurationMap;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerIcon$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/input/pointer/PointerIcon;", "Default", "Landroidx/compose/ui/input/pointer/PointerIcon;", "getDefault", "()Landroidx/compose/ui/input/pointer/PointerIcon;", "Crosshair", "getCrosshair", "Text", "getText", "Hand", "getHand"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ androidx.compose.ui.input.pointer.PointerIcon.Companion Camera2StreamConfigurationMap = new androidx.compose.ui.input.pointer.PointerIcon.Companion();
        private static final androidx.compose.ui.input.pointer.PointerIcon Default = androidx.compose.ui.input.pointer.PointerIcon_androidKt.getPointerIconDefault();
        private static final androidx.compose.ui.input.pointer.PointerIcon Crosshair = androidx.compose.ui.input.pointer.PointerIcon_androidKt.getPointerIconCrosshair();
        private static final androidx.compose.ui.input.pointer.PointerIcon Text = androidx.compose.ui.input.pointer.PointerIcon_androidKt.getPointerIconText();
        private static final androidx.compose.ui.input.pointer.PointerIcon Hand = androidx.compose.ui.input.pointer.PointerIcon_androidKt.getPointerIconHand();

        private Companion() {
        }

        public final androidx.compose.ui.input.pointer.PointerIcon getDefault() {
            return Default;
        }

        public final androidx.compose.ui.input.pointer.PointerIcon getCrosshair() {
            return Crosshair;
        }

        public final androidx.compose.ui.input.pointer.PointerIcon getText() {
            return Text;
        }

        public final androidx.compose.ui.input.pointer.PointerIcon getHand() {
            return Hand;
        }
    }
}
