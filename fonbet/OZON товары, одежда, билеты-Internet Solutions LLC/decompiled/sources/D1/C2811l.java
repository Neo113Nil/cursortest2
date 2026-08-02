package D1;

import android.view.View;
import org.jetbrains.annotations.NotNull;

/* renamed from: D1.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2811l {
    @NotNull
    public static final View a(@NotNull InterfaceC2807j interfaceC2807j) {
        if (interfaceC2807j.getNode().isAttached()) {
            return (View) K.b(C2809k.f(interfaceC2807j));
        }
        A1.a.b("Cannot get View because the Modifier node is not currently attached.");
        throw null;
    }
}
