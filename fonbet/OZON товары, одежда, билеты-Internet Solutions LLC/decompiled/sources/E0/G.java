package E0;

import S0.C3985t0;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private AtomicReference<xe.B0> f7032a = new AtomicReference<>(null);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C3985t0 f7033b = S0.C0.a(0.0f);

    public static final void b(G g10, float f7) {
        g10.f7033b.h(f7);
    }

    public final void c() {
        xe.B0 andSet = this.f7032a.getAndSet(null);
        if (andSet != null) {
            andSet.j(null);
        }
    }

    public final float d() {
        return this.f7033b.getFloatValue();
    }

    public final Object e(@NotNull kotlin.coroutines.jvm.internal.j jVar) {
        Object d11 = xe.N.d(new F(this, null), jVar);
        return d11 == Wc.a.COROUTINE_SUSPENDED ? d11 : Unit.f71690a;
    }
}
