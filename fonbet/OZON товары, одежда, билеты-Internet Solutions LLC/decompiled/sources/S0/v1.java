package S0;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class v1<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AtomicReference<a1.g> f25572a = new AtomicReference<>(a1.h.a());

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f25573b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private T f25574c;

    public final T a() {
        long id2 = Thread.currentThread().getId();
        return id2 == C3939a.a() ? this.f25574c : (T) this.f25572a.get().b(id2);
    }

    public final void b(T t2) {
        long id2 = Thread.currentThread().getId();
        if (id2 == C3939a.a()) {
            this.f25574c = t2;
            return;
        }
        synchronized (this.f25573b) {
            a1.g gVar = this.f25572a.get();
            if (gVar.d(id2, t2)) {
                return;
            }
            this.f25572a.set(gVar.c(id2, t2));
            Unit unit = Unit.f71690a;
        }
    }
}
