package Hj0;

import kotlin.jvm.internal.Intrinsics;
import ru.ozon.tracker.sendEvent.runner.DelayTimeProviderKt;
import ru.ozon.tracker.sendEvent.runner.EventDelayedTaskLauncher;

/* renamed from: Hj0.p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3159p implements Jb.e<EventDelayedTaskLauncher> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<xe.M> f11188a;

    /* renamed from: b, reason: collision with root package name */
    private final Jb.f f11189b;

    public C3159p(Bl0.D d11, Pc.a aVar, Jb.f fVar) {
        this.f11188a = aVar;
        this.f11189b = fVar;
    }

    @Override // Pc.a
    public final Object get() {
        xe.M trackerScope = this.f11188a.get();
        fi0.x settings = (fi0.x) this.f11189b.get();
        Intrinsics.checkNotNullParameter(trackerScope, "trackerScope");
        Intrinsics.checkNotNullParameter(settings, "settings");
        return new EventDelayedTaskLauncher(DelayTimeProviderKt.fastEventDelayTimeProvider(trackerScope, settings), new hi0.f(trackerScope));
    }
}
