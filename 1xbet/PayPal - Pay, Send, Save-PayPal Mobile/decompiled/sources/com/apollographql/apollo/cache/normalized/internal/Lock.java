package com.apollographql.apollo.cache.normalized.internal;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/internal/Lock;", "", "<init>", "()V", "T", "Lkotlin/Function0;", "block", "read", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "write", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "getHighSpeedVideoFpsRanges", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Lock {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.concurrent.locks.ReentrantReadWriteLock getHighSpeedVideoSizes = new java.util.concurrent.locks.ReentrantReadWriteLock();

    public final <T> T read(kotlin.jvm.functions.Function0<? extends T> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.getHighSpeedVideoSizes.readLock();
        readLock.lock();
        try {
            return block.invoke();
        } finally {
            readLock.unlock();
        }
    }

    public final <T> T write(kotlin.jvm.functions.Function0<? extends T> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = this.getHighSpeedVideoSizes;
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            readLock.unlock();
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            return block.invoke();
        } finally {
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }
}
