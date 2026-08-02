package Wa;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ReentrantLock f33415a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f33416b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f33417c;

    /* renamed from: d, reason: collision with root package name */
    private final Condition f33418d;

    public d(ReentrantLock lock) {
        Intrinsics.checkNotNullParameter(lock, "lock");
        this.f33415a = lock;
        this.f33416b = false;
        this.f33418d = lock.newCondition();
    }

    public final void a() {
        ReentrantLock reentrantLock = this.f33415a;
        reentrantLock.lock();
        while (!this.f33416b) {
            try {
                this.f33418d.await();
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
        Unit unit = Unit.f71690a;
        reentrantLock.unlock();
    }

    public final boolean b(long j11) {
        boolean z11;
        if (j11 <= 0) {
            a();
            return true;
        }
        ReentrantLock reentrantLock = this.f33415a;
        reentrantLock.lock();
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j12 = elapsedRealtime + j11;
            while (true) {
                z11 = this.f33416b;
                if (z11 || elapsedRealtime >= j12) {
                    break;
                }
                this.f33418d.await(j12 - elapsedRealtime, TimeUnit.MILLISECONDS);
                if (this.f33417c) {
                    elapsedRealtime = SystemClock.elapsedRealtime();
                    j12 = elapsedRealtime + j11;
                    this.f33417c = false;
                } else {
                    elapsedRealtime = SystemClock.elapsedRealtime();
                }
            }
            boolean z12 = z11;
            reentrantLock.unlock();
            return z12;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void c(boolean z11) {
        ReentrantLock reentrantLock = this.f33415a;
        reentrantLock.lock();
        try {
            this.f33416b = z11;
            this.f33418d.signalAll();
            Unit unit = Unit.f71690a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void d() {
        ReentrantLock reentrantLock = this.f33415a;
        reentrantLock.lock();
        try {
            this.f33417c = true;
            this.f33418d.signalAll();
            Unit unit = Unit.f71690a;
        } finally {
            reentrantLock.unlock();
        }
    }
}
