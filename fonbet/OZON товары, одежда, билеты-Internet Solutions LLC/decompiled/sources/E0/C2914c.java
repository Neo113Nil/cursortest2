package E0;

import F0.C2990k;
import android.view.InputDevice;
import android.view.KeyEvent;
import androidx.compose.ui.platform.P1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import v1.C10179d;

/* renamed from: E0.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2914c extends T0 {
    @Override // E0.T0
    public final boolean a(@NotNull KeyEvent keyEvent, @NotNull c1 c1Var, @NotNull Z0 z02, @NotNull C2990k c2990k, boolean z11, boolean z12, @NotNull Function0<Unit> function0) {
        if (C10179d.b(keyEvent) == 2 && keyEvent.isFromSource(257) && (keyEvent.getFlags() & 2) != 2) {
            c2990k.b0(false);
        }
        return super.a(keyEvent, c1Var, z02, c2990k, z11, z12, function0);
    }

    @Override // E0.T0
    public final boolean b(@NotNull KeyEvent keyEvent, @NotNull c1 c1Var, @NotNull C2990k c2990k, @NotNull j1.i iVar, @NotNull P1 p12) {
        if (super.b(keyEvent, c1Var, c2990k, iVar, p12)) {
            return true;
        }
        InputDevice device = keyEvent.getDevice();
        if (device == null || !device.supportsSource(513) || device.isVirtual() || C10179d.b(keyEvent) != 2 || keyEvent.getSource() == 257) {
            return false;
        }
        if (U0.a(19, keyEvent)) {
            return iVar.d(5);
        }
        if (U0.a(20, keyEvent)) {
            return iVar.d(6);
        }
        if (U0.a(21, keyEvent)) {
            return iVar.d(3);
        }
        if (U0.a(22, keyEvent)) {
            return iVar.d(4);
        }
        if (!U0.a(23, keyEvent)) {
            return false;
        }
        p12.show();
        return true;
    }
}
