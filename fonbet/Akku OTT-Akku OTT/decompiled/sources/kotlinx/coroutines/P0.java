package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nExecutors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Executors.kt\nkotlinx/coroutines/ResumeUndispatchedRunnable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,211:1\n1#2:212\n*E\n"})
/* loaded from: classes5.dex */
public final class P0 implements Runnable {
    public final C1101n0 a;
    public final C1100n b;

    public P0(C1101n0 c1101n0, C1100n c1100n) {
        this.a = c1101n0;
        this.b = c1100n;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.A(this.a, Unit.INSTANCE);
    }
}
