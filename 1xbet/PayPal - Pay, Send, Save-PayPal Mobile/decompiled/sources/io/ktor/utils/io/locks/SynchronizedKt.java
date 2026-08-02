package io.ktor.utils.io.locks;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a/\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0004*\u00060\u0000j\u0002`\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a3\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\n\u0010\u000b\u001a\u00060\tj\u0002`\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\r*\n\u0010\u000e\"\u00020\t2\u00020\t*\n\u0010\u000f\"\u00020\u00002\u00020\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Ljava/util/concurrent/locks/ReentrantLock;", "Lio/ktor/utils/io/locks/Camera2StreamConfigurationMap;", "reentrantLock", "()Ljava/util/concurrent/locks/ReentrantLock;", "T", "Lkotlin/Function0;", "block", "withLock", "(Ljava/util/concurrent/locks/ReentrantLock;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "", "Lio/ktor/utils/io/locks/SynchronizedObject;", "lock", "synchronized", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "SynchronizedObject", "Camera2StreamConfigurationMap"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SynchronizedKt {
    public static /* synthetic */ void ReentrantLock$annotations() {
    }

    public static /* synthetic */ void SynchronizedObject$annotations() {
    }

    public static final java.util.concurrent.locks.ReentrantLock reentrantLock() {
        return new java.util.concurrent.locks.ReentrantLock();
    }

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

    /* renamed from: synchronized, reason: not valid java name */
    public static final <T> T m23428synchronized(java.lang.Object obj, kotlin.jvm.functions.Function0<? extends T> function0) {
        T invoke;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        synchronized (obj) {
            invoke = function0.invoke();
        }
        return invoke;
    }
}
