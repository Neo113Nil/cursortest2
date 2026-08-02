package Yj0;

import Ae.C2405m;
import Ae.InterfaceC2395h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.process.lifecycle.ApplicationLifecycleState;

/* loaded from: classes7.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f35138a = new b();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final ApplicationLifecycleState f35139b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final C2405m f35140c;

    static {
        ApplicationLifecycleState applicationLifecycleState = ApplicationLifecycleState.FOREGROUND;
        f35139b = applicationLifecycleState;
        f35140c = new C2405m(applicationLifecycleState);
    }

    @Override // Yj0.a
    @NotNull
    public final ApplicationLifecycleState b() {
        return f35139b;
    }

    @Override // Yj0.a
    @NotNull
    public final InterfaceC2395h<ApplicationLifecycleState> getState() {
        return f35140c;
    }
}
