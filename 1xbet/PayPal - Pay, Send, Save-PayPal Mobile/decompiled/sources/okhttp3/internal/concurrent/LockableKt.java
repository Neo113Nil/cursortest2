package okhttp3.internal.concurrent;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u001c\u0010\b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0080\b¢\u0006\u0004\b\b\u0010\t\u001a\u0014\u0010\n\u001a\u00020\u0001*\u00020\u0000H\u0080\b¢\u0006\u0004\b\n\u0010\u0003\u001a\u0014\u0010\u000b\u001a\u00020\u0001*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u000b\u0010\u0003\u001a8\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f*\u00020\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lokhttp3/internal/concurrent/Lockable;", "", "wait", "(Lokhttp3/internal/concurrent/Lockable;)V", "notify", "notifyAll", "", "nanos", "awaitNanos", "(Lokhttp3/internal/concurrent/Lockable;J)V", "assertLockNotHeld", "assertLockHeld", "T", "Lkotlin/Function0;", "action", "withLock", "(Lokhttp3/internal/concurrent/Lockable;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class LockableKt {
    public static final void wait(okhttp3.internal.concurrent.Lockable lockable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lockable, "");
        lockable.wait();
    }

    public static final void notify(okhttp3.internal.concurrent.Lockable lockable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lockable, "");
        lockable.notify();
    }

    public static final void notifyAll(okhttp3.internal.concurrent.Lockable lockable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lockable, "");
        lockable.notifyAll();
    }

    public static final void awaitNanos(okhttp3.internal.concurrent.Lockable lockable, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lockable, "");
        long j2 = j / 1000000;
        if (j2 > 0 || j > 0) {
            lockable.wait(j2, (int) (j - (1000000 * j2)));
        }
    }

    public static final void assertLockNotHeld(okhttp3.internal.concurrent.Lockable lockable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lockable, "");
        if (okhttp3.internal._UtilJvmKt.assertionsEnabled && java.lang.Thread.holdsLock(lockable)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Thread ");
            sb.append(java.lang.Thread.currentThread().getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(lockable);
            throw new java.lang.AssertionError(sb.toString());
        }
    }

    public static final void assertLockHeld(okhttp3.internal.concurrent.Lockable lockable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lockable, "");
        if (!okhttp3.internal._UtilJvmKt.assertionsEnabled || java.lang.Thread.holdsLock(lockable)) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Thread ");
        sb.append(java.lang.Thread.currentThread().getName());
        sb.append(" MUST hold lock on ");
        sb.append(lockable);
        throw new java.lang.AssertionError(sb.toString());
    }

    public static final <T> T withLock(okhttp3.internal.concurrent.Lockable lockable, kotlin.jvm.functions.Function0<? extends T> function0) {
        T invoke;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lockable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        synchronized (lockable) {
            invoke = function0.invoke();
        }
        return invoke;
    }
}
