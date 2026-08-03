package io.ktor.utils.io.pool;

/* compiled from: ByteBufferPools.kt */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lio/ktor/utils/io/pool/ByteBufferPool;", "Lio/ktor/utils/io/pool/DefaultPool;", "Ljava/nio/ByteBuffer;", "", "capacity", "bufferSize", "<init>", "(II)V", "produceInstance", "()Ljava/nio/ByteBuffer;", com.ironsource.C3232q2.p, "clearInstance", "(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;", "", "validateInstance", "(Ljava/nio/ByteBuffer;)V", "I", "getBufferSize", "()I", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ByteBufferPool extends io.ktor.utils.io.pool.DefaultPool<java.nio.ByteBuffer> {
    private final int bufferSize;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ByteBufferPool() {
        this(r2, r2, 3, null);
        int i = 0;
    }

    public /* synthetic */ ByteBufferPool(int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 2000 : i, (i3 & 2) != 0 ? 4096 : i2);
    }

    public final int getBufferSize() {
        return this.bufferSize;
    }

    public ByteBufferPool(int i, int i2) {
        super(i);
        this.bufferSize = i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.ktor.utils.io.pool.DefaultPool
    public java.nio.ByteBuffer produceInstance() {
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(this.bufferSize);
        kotlin.jvm.internal.Intrinsics.checkNotNull(allocate);
        return allocate;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.ktor.utils.io.pool.DefaultPool
    public java.nio.ByteBuffer clearInstance(java.nio.ByteBuffer instance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
        instance.clear();
        instance.order(java.nio.ByteOrder.BIG_ENDIAN);
        return instance;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.ktor.utils.io.pool.DefaultPool
    public void validateInstance(java.nio.ByteBuffer instance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
        if (instance.capacity() != this.bufferSize) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        if (!(!instance.isDirect())) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
    }
}
