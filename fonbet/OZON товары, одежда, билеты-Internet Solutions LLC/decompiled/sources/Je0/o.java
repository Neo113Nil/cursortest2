package Je0;

import We.B;
import We.L;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class o implements B {

    /* renamed from: a, reason: collision with root package name */
    private static Integer f14685a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final AtomicBoolean f14686b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final AtomicInteger f14687c = new AtomicInteger(0);

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final AtomicInteger f14688d = new AtomicInteger(0);

    /* renamed from: e, reason: collision with root package name */
    private static r f14689e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f14690f = 0;

    public static final class a {
        public static void a() {
            o.f14686b.set(false);
            o.f14687c.set(0);
            o.f14688d.set(0);
            r rVar = o.f14689e;
            if (rVar != null) {
                rVar.b();
            }
            o.f14689e = null;
            o.f14685a = null;
        }
    }

    @Override // We.B
    @NotNull
    public final L intercept(@NotNull B.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        String aVar = chain.request().j().j().toString();
        if (f14685a != null || (!kotlin.text.h.t(aVar, "pbf", false) && !kotlin.text.h.t(aVar, "tiles", false))) {
            return chain.proceed(chain.request());
        }
        long currentTimeMillis = System.currentTimeMillis();
        boolean compareAndSet = f14686b.compareAndSet(false, true);
        AtomicInteger atomicInteger = f14688d;
        p pVar = p.f14691b;
        if (compareAndSet) {
            int i11 = (int) currentTimeMillis;
            f14687c.set(i11);
            atomicInteger.set(i11);
            r rVar = new r(pVar);
            f14689e = rVar;
            rVar.c();
        } else {
            atomicInteger.set((int) currentTimeMillis);
            r rVar2 = f14689e;
            if (rVar2 != null) {
                rVar2.b();
            }
            r rVar3 = new r(pVar);
            f14689e = rVar3;
            rVar3.c();
        }
        L proceed = chain.proceed(chain.request());
        if (proceed.v()) {
            atomicInteger.set((int) System.currentTimeMillis());
        }
        return proceed;
    }
}
