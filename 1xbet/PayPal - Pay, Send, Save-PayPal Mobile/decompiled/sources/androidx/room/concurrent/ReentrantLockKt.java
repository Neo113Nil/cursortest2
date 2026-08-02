package androidx.room.concurrent;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00060\u0001j\u0002`\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"T", "Ljava/util/concurrent/locks/ReentrantLock;", "Landroidx/room/concurrent/getHighSpeedVideoFpsRanges;", "Lkotlin/Function0;", "block", "withLock", "(Ljava/util/concurrent/locks/ReentrantLock;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReentrantLockKt {
    public static final <T> T withLock(java.util.concurrent.locks.ReentrantLock reentrantLock, kotlin.jvm.functions.Function0<? extends T> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reentrantLock, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        reentrantLock.lock();
        try {
            return function0.invoke();
        } finally {
            reentrantLock.unlock();
        }
    }
}
