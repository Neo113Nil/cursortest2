package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: kotlinx.coroutines.v0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1116v0 extends B0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(C1116v0.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile = 0;
    public final Function1<Throwable, Unit> e;

    /* JADX WARN: Multi-variable type inference failed */
    public C1116v0(Function1<? super Throwable, Unit> function1) {
        this.e = function1;
    }

    @Override // kotlinx.coroutines.B0
    public final boolean i() {
        return true;
    }

    @Override // kotlinx.coroutines.B0
    public final void j(Throwable th) {
        if (f.compareAndSet(this, 0, 1)) {
            this.e.invoke(th);
        }
    }
}
