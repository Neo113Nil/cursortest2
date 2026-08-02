package Lj0;

import fi0.x;
import ru.ozon.tracker.sendEvent.repository.EventRepositoryImpl_Factory;

/* loaded from: classes7.dex */
public final class f implements Jb.e<e> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<sj.d> f17129a;

    /* renamed from: b, reason: collision with root package name */
    private final EventRepositoryImpl_Factory f17130b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<g> f17131c;

    /* renamed from: d, reason: collision with root package name */
    private final Jb.f f17132d;

    public f(Pc.a aVar, EventRepositoryImpl_Factory eventRepositoryImpl_Factory, Pc.a aVar2, Jb.f fVar) {
        this.f17129a = aVar;
        this.f17130b = eventRepositoryImpl_Factory;
        this.f17131c = aVar2;
        this.f17132d = fVar;
    }

    @Override // Pc.a
    public final Object get() {
        return new e(Jb.d.a(this.f17129a), Jb.d.a(this.f17130b), Jb.d.a(this.f17131c), (x) this.f17132d.get());
    }
}
