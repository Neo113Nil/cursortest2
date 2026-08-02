package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C1100n;
import kotlinx.coroutines.I;
import kotlinx.coroutines.InterfaceC1053e0;
import kotlinx.coroutines.J;
import kotlinx.coroutines.Q;
import kotlinx.coroutines.U;
import kotlinx.coroutines.W0;

@SourceDebugExtension({"SMAP\nLimitedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LimitedDispatcher.kt\nkotlinx/coroutines/internal/LimitedDispatcher\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n*L\n1#1,135:1\n62#1,8:136\n62#1,8:144\n27#2:152\n27#2:154\n16#3:153\n16#3:155\n*S KotlinDebug\n*F\n+ 1 LimitedDispatcher.kt\nkotlinx/coroutines/internal/LimitedDispatcher\n*L\n44#1:136,8\n51#1:144,8\n75#1:152\n88#1:154\n75#1:153\n88#1:155\n*E\n"})
/* loaded from: classes5.dex */
public final class i extends I implements U {
    public static final /* synthetic */ AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(i.class, "runningWorkers$volatile");
    public final /* synthetic */ U a;
    public final I b;
    public final int c;
    public final String d;
    public final n<Runnable> e;
    public final Object f;
    private volatile /* synthetic */ int runningWorkers$volatile;

    public final class a implements Runnable {
        public Runnable a;

        public a(Runnable runnable) {
            this.a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = 0;
            while (true) {
                try {
                    this.a.run();
                } catch (Throwable th) {
                    J.a(EmptyCoroutineContext.INSTANCE, th);
                }
                i iVar = i.this;
                Runnable W = iVar.W();
                if (W == null) {
                    return;
                }
                this.a = W;
                i++;
                if (i >= 16 && iVar.b.isDispatchNeeded(iVar)) {
                    iVar.b.dispatch(iVar, this);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(I i2, int i3, String str) {
        U u = i2 instanceof U ? (U) i2 : null;
        this.a = u == null ? Q.a : u;
        this.b = i2;
        this.c = i3;
        this.d = str;
        this.e = new n<>();
        this.f = new Object();
    }

    @Override // kotlinx.coroutines.U
    public final void H(long j, C1100n c1100n) {
        this.a.H(j, c1100n);
    }

    public final Runnable W() {
        while (true) {
            Runnable d = this.e.d();
            if (d != null) {
                return d;
            }
            synchronized (this.f) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.e.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean X() {
        synchronized (this.f) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i;
            if (atomicIntegerFieldUpdater.get(this) >= this.c) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // kotlinx.coroutines.U
    public final InterfaceC1053e0 d(long j, W0 w0, CoroutineContext coroutineContext) {
        return this.a.d(j, w0, coroutineContext);
    }

    @Override // kotlinx.coroutines.I
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable W;
        this.e.a(runnable);
        if (i.get(this) >= this.c || !X() || (W = W()) == null) {
            return;
        }
        this.b.dispatch(this, new a(W));
    }

    @Override // kotlinx.coroutines.I
    public final void dispatchYield(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable W;
        this.e.a(runnable);
        if (i.get(this) >= this.c || !X() || (W = W()) == null) {
            return;
        }
        this.b.dispatchYield(this, new a(W));
    }

    @Override // kotlinx.coroutines.I
    public final I limitedParallelism(int i2, String str) {
        j.a(i2);
        return i2 >= this.c ? str != null ? new q(this, str) : this : super.limitedParallelism(i2, str);
    }

    @Override // kotlinx.coroutines.I
    public final String toString() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append(".limitedParallelism(");
        return androidx.collection.i.c(sb, this.c, ')');
    }
}
