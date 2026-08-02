package C1;

import S0.C3991w0;
import S0.D1;
import S0.n1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class n extends h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final c<?> f4310a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C3991w0 f4311b;

    public n(@NotNull c<?> cVar) {
        super(0);
        C3991w0 f7;
        this.f4310a = cVar;
        f7 = n1.f(null, D1.f25195a);
        this.f4311b = f7;
    }

    @Override // C1.h
    public final boolean a(@NotNull c<?> cVar) {
        return cVar == this.f4310a;
    }

    @Override // C1.h
    public final Object b(@NotNull m mVar) {
        if (!(mVar == this.f4310a)) {
            A1.a.b("Check failed.");
            throw null;
        }
        T value = this.f4311b.getValue();
        if (value == 0) {
            return null;
        }
        return value;
    }

    public final <T> void c(@NotNull c<T> cVar, T t2) {
        if (cVar == this.f4310a) {
            this.f4311b.setValue(t2);
        } else {
            A1.a.b("Check failed.");
            throw null;
        }
    }
}
