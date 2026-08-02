package Hj0;

import Qj0.l0;
import android.content.Context;
import mi0.C8332b;
import mi0.InterfaceC8333c;
import mi0.InterfaceC8336f;
import mi0.InterfaceC8339i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.hardwareinfo.DeviceInfoManager;
import ru.ozon.tracker.sendEvent.EventManager;
import ru.ozon.tracker.sendEvent.repository.EventRepositoryImpl;

/* loaded from: classes7.dex */
public interface M {

    public interface a {
        @NotNull
        M a(@NotNull Context context, @NotNull fi0.x xVar);
    }

    @NotNull
    DeviceInfoManager a();

    @NotNull
    ru.ozon.tracker.performance.d b();

    @NotNull
    Vj0.a c();

    @NotNull
    InterfaceC8339i d();

    @NotNull
    InterfaceC8336f e();

    @NotNull
    EventRepositoryImpl f();

    @NotNull
    l0 g();

    @NotNull
    fi0.f getCustomPropertyTracker();

    @NotNull
    EventManager h();

    @NotNull
    InterfaceC8333c i();

    @NotNull
    fi0.s j();

    @NotNull
    ek0.a k();

    @NotNull
    Qj0.V l();

    @NotNull
    C8332b m();
}
