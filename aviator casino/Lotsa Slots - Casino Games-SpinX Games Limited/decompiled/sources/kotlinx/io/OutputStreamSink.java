package kotlinx.io;

/* compiled from: JvmCore.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0012\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0007H\u0016J\b\u0010\r\u001a\u00020\u0007H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lkotlinx/io/OutputStreamSink;", "Lkotlinx/io/RawSink;", "out", "Ljava/io/OutputStream;", "<init>", "(Ljava/io/OutputStream;)V", "write", "", "source", "Lkotlinx/io/Buffer;", "byteCount", "", "flush", "close", "toString", "", "kotlinx-io-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
class OutputStreamSink implements kotlinx.io.RawSink {
    private final java.io.OutputStream out;

    public OutputStreamSink(java.io.OutputStream out) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(out, "out");
        this.out = out;
    }

    @Override // kotlinx.io.RawSink
    public void write(kotlinx.io.Buffer source, long byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        kotlinx.io._UtilKt.checkOffsetAndCount(source.getSizeMut(), 0L, byteCount);
        while (byteCount > 0) {
            kotlinx.io.unsafe.UnsafeBufferOperations unsafeBufferOperations = kotlinx.io.unsafe.UnsafeBufferOperations.INSTANCE;
            if (!(!source.exhausted())) {
                throw new java.lang.IllegalArgumentException("Buffer is empty".toString());
            }
            kotlinx.io.Segment head = source.getHead();
            kotlin.jvm.internal.Intrinsics.checkNotNull(head);
            byte[] dataAsByteArray = head.dataAsByteArray(true);
            int pos = head.getPos();
            int min = (int) java.lang.Math.min(byteCount, head.getLimit() - pos);
            this.out.write(dataAsByteArray, pos, min);
            long j = min;
            byteCount -= j;
            if (min != 0) {
                if (min < 0) {
                    throw new java.lang.IllegalStateException("Returned negative read bytes count");
                }
                if (min > head.getSize()) {
                    throw new java.lang.IllegalStateException("Returned too many bytes");
                }
                source.skip(j);
            }
        }
    }

    @Override // kotlinx.io.RawSink, java.io.Flushable
    public void flush() {
        this.out.flush();
    }

    @Override // kotlinx.io.RawSink, java.lang.AutoCloseable
    public void close() {
        this.out.close();
    }

    public java.lang.String toString() {
        return "RawSink(" + this.out + ')';
    }
}
