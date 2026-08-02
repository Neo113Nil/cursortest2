package Uh0;

import Zg0.g;
import Zg0.i;
import android.app.Application;
import gh0.InterfaceC6736b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class a implements InterfaceC6736b {
    @Override // gh0.InterfaceC6736b
    public final void a(@NotNull Application app, @NotNull g configuration) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        i l11 = configuration.l();
        if (l11 instanceof i.b) {
            Dl0.a.c(app, ((i.b) l11).a(), new Hl0.a("RuStorePushClient"));
        }
    }
}
