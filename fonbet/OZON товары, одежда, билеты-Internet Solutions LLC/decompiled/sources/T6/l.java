package T6;

import android.content.Context;

/* loaded from: classes9.dex */
public final class l implements U6.b<k> {

    /* renamed from: a, reason: collision with root package name */
    private final U6.c f26691a;

    /* renamed from: b, reason: collision with root package name */
    private final j f26692b;

    public l(U6.c cVar, j jVar) {
        this.f26691a = cVar;
        this.f26692b = jVar;
    }

    @Override // Pc.a
    public final Object get() {
        return new k((Context) this.f26691a.get(), (i) this.f26692b.get());
    }
}
