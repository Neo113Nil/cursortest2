package Wj0;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.O0;
import Ae.x0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.process.lifecycle.ApplicationLifecycleState;

/* loaded from: classes7.dex */
public final class a implements Yj0.a, Vj0.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Xj0.a f33889a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final x0<ApplicationLifecycleState> f33890b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<ApplicationLifecycleState> f33891c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final AY.a f33892d;

    public a(@NotNull Xj0.a lifecycleStateProducer) {
        Intrinsics.checkNotNullParameter(lifecycleStateProducer, "lifecycleStateProducer");
        this.f33889a = lifecycleStateProducer;
        x0<ApplicationLifecycleState> a11 = O0.a(ApplicationLifecycleState.FOREGROUND);
        this.f33890b = a11;
        this.f33891c = C2399j.b(a11);
        this.f33892d = new AY.a(this);
    }

    public static void a(a aVar, ApplicationLifecycleState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        aVar.f33890b.setValue(state);
    }

    @Override // Yj0.a
    @NotNull
    public final ApplicationLifecycleState b() {
        return this.f33890b.getValue();
    }

    @Override // Yj0.a
    @NotNull
    public final InterfaceC2395h<ApplicationLifecycleState> getState() {
        return this.f33891c;
    }

    @Override // Vj0.a
    public final void observe() {
        this.f33889a.a(this.f33892d);
    }
}
