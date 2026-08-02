package kotlinx.coroutines;

import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoop\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,547:1\n1#2:548\n*E\n"})
/* renamed from: kotlinx.coroutines.i0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1083i0 extends I {
    public static final /* synthetic */ int d = 0;
    public long a;
    public boolean b;
    public ArrayDeque<Z<?>> c;

    public final void W(boolean z) {
        long j = this.a - (z ? 4294967296L : 1L);
        this.a = j;
        if (j <= 0 && this.b) {
            shutdown();
        }
    }

    public final void X(Z<?> z) {
        ArrayDeque<Z<?>> arrayDeque = this.c;
        if (arrayDeque == null) {
            arrayDeque = new ArrayDeque<>();
            this.c = arrayDeque;
        }
        arrayDeque.addLast(z);
    }

    public final void Y(boolean z) {
        this.a = (z ? 4294967296L : 1L) + this.a;
        if (z) {
            return;
        }
        this.b = true;
    }

    public long Z() {
        return !a0() ? Long.MAX_VALUE : 0L;
    }

    public final boolean a0() {
        Z<?> removeFirstOrNull;
        ArrayDeque<Z<?>> arrayDeque = this.c;
        if (arrayDeque == null || (removeFirstOrNull = arrayDeque.removeFirstOrNull()) == null) {
            return false;
        }
        removeFirstOrNull.run();
        return true;
    }

    @Override // kotlinx.coroutines.I
    public final I limitedParallelism(int i, String str) {
        kotlinx.coroutines.internal.j.a(i);
        return str != null ? new kotlinx.coroutines.internal.q(this, str) : this;
    }

    public void shutdown() {
    }
}
