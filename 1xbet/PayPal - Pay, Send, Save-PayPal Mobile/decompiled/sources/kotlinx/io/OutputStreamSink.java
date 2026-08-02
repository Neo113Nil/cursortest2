package kotlinx.io;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0012\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lkotlinx/io/OutputStreamSink;", "Lkotlinx/io/RawSink;", "Ljava/io/OutputStream;", "p0", "<init>", "(Ljava/io/OutputStream;)V", "Lkotlinx/io/Buffer;", "", "p1", "", "write", "(Lkotlinx/io/Buffer;J)V", "flush", "()V", "close", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", "Ljava/io/OutputStream;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
class OutputStreamSink implements kotlinx.io.RawSink {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.io.OutputStream getHighSpeedVideoFpsRangesFor;

    public OutputStreamSink(java.io.OutputStream outputStream) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outputStream, "");
        this.getHighSpeedVideoFpsRangesFor = outputStream;
    }

    @Override // kotlinx.io.RawSink
    public void write(kotlinx.io.Buffer p0, long p1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlinx.io._UtilKt.checkOffsetAndCount(p0.getSizeMut(), 0L, p1);
        while (p1 > 0) {
            kotlinx.io.unsafe.UnsafeBufferOperations unsafeBufferOperations = kotlinx.io.unsafe.UnsafeBufferOperations.INSTANCE;
            if (p0.exhausted()) {
                throw new java.lang.IllegalArgumentException("Buffer is empty".toString());
            }
            kotlinx.io.Segment head = p0.getHead();
            kotlin.jvm.internal.Intrinsics.checkNotNull(head);
            byte[] dataAsByteArray = head.dataAsByteArray(true);
            int pos = head.getPos();
            int min = (int) java.lang.Math.min(p1, head.getLimit() - pos);
            this.getHighSpeedVideoFpsRangesFor.write(dataAsByteArray, pos, min);
            long j = min;
            p1 -= j;
            if (min != 0) {
                if (min < 0) {
                    throw new java.lang.IllegalStateException("Returned negative read bytes count");
                }
                if (min > head.getSize()) {
                    throw new java.lang.IllegalStateException("Returned too many bytes");
                }
                p0.skip(j);
            }
        }
    }

    @Override // kotlinx.io.RawSink, java.io.Flushable
    public void flush() {
        this.getHighSpeedVideoFpsRangesFor.flush();
    }

    @Override // kotlinx.io.RawSink, java.lang.AutoCloseable
    public void close() {
        this.getHighSpeedVideoFpsRangesFor.close();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RawSink(");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(')');
        return sb.toString();
    }
}
