package bk0;

import fi0.x;
import pf0.i;

/* loaded from: classes7.dex */
public final class f implements Jb.e<e> {

    /* renamed from: a, reason: collision with root package name */
    private final Jb.f f56093a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<i> f56094b;

    public f(Jb.f fVar, Pc.a aVar) {
        this.f56093a = fVar;
        this.f56094b = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        return new e((x) this.f56093a.get(), this.f56094b.get());
    }
}
