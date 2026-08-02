package De;

import De.x;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import xe.P0;

/* loaded from: classes.dex */
public abstract class x<S extends x<S>> extends AbstractC2861d<S> implements P0 {

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f6653d = AtomicIntegerFieldUpdater.newUpdater(x.class, "cleanedAndPointers$volatile");

    /* renamed from: c, reason: collision with root package name */
    public final long f6654c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public x(long j11, S s11, int i11) {
        super(s11);
        this.f6654c = j11;
        this.cleanedAndPointers$volatile = i11 << 16;
    }

    @Override // De.AbstractC2861d
    public final boolean f() {
        return f6653d.get(this) == k() && d() != 0;
    }

    public final boolean j() {
        return f6653d.addAndGet(this, -65536) == k() && d() != 0;
    }

    public abstract int k();

    public abstract void l(int i11, @NotNull CoroutineContext coroutineContext);

    public final void m() {
        if (f6653d.incrementAndGet(this) == k()) {
            h();
        }
    }

    public final boolean n() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i11;
        do {
            atomicIntegerFieldUpdater = f6653d;
            i11 = atomicIntegerFieldUpdater.get(this);
            if (i11 == k() && d() != 0) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, 65536 + i11));
        return true;
    }
}
