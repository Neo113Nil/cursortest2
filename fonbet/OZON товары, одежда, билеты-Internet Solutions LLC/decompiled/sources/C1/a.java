package C1;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class a extends h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private j<?> f4297a;

    public a(@NotNull j<?> jVar) {
        super(0);
        this.f4297a = jVar;
    }

    @Override // C1.h
    public final boolean a(@NotNull c<?> cVar) {
        return cVar == this.f4297a.getKey();
    }

    @Override // C1.h
    public final Object b(@NotNull m mVar) {
        if (mVar == this.f4297a.getKey()) {
            return this.f4297a.getValue();
        }
        A1.a.b("Check failed.");
        throw null;
    }

    public final void c(@NotNull j<?> jVar) {
        this.f4297a = jVar;
    }
}
