package P40;

import Jb.e;
import x40.C10656a;

/* loaded from: classes3.dex */
public final class c implements e<b> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<C10656a> f21839a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<S80.b> f21840b;

    public c(Pc.a<C10656a> aVar, Pc.a<S80.b> aVar2) {
        this.f21839a = aVar;
        this.f21840b = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        return new b(this.f21839a.get(), this.f21840b.get());
    }
}
