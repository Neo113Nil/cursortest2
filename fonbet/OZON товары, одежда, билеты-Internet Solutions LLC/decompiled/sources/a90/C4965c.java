package a90;

import b90.C5597d;
import ru.ozon.fintech.network.domain.ExternalNetworkSettings;

/* renamed from: a90.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4965c implements Jb.e<C4964b> {

    /* renamed from: a, reason: collision with root package name */
    private final Jb.f f36463a;

    /* renamed from: b, reason: collision with root package name */
    private final Jb.f f36464b;

    public C4965c(Jb.f fVar, Jb.f fVar2) {
        this.f36463a = fVar;
        this.f36464b = fVar2;
    }

    @Override // Pc.a
    public final Object get() {
        return new C4964b((ExternalNetworkSettings) this.f36463a.get(), (C5597d) this.f36464b.get());
    }
}
