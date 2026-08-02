package io.ktor.utils.io.jvm.nio;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0012\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lio/ktor/utils/io/jvm/nio/ReadableByteChannelSource;", "Lkotlinx/io/RawSource;", "Ljava/nio/channels/ReadableByteChannel;", "p0", "<init>", "(Ljava/nio/channels/ReadableByteChannel;)V", "Lkotlinx/io/Buffer;", "", "p1", "readAtMostTo", "(Lkotlinx/io/Buffer;J)J", "", "close", "()V", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", "Ljava/nio/channels/ReadableByteChannel;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
class ReadableByteChannelSource implements kotlinx.io.RawSource {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.nio.channels.ReadableByteChannel getHighSpeedVideoFpsRanges;

    public ReadableByteChannelSource(java.nio.channels.ReadableByteChannel readableByteChannel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readableByteChannel, "");
        this.getHighSpeedVideoFpsRanges = readableByteChannel;
    }

    @Override // kotlinx.io.RawSource
    public long readAtMostTo(kotlinx.io.Buffer p0, long p1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        if (p1 <= 0) {
            return 0L;
        }
        int min = (int) java.lang.Math.min(p1, androidx.collection.SieveCacheKt.NodeLinkMask);
        kotlinx.io.unsafe.UnsafeBufferOperations unsafeBufferOperations = kotlinx.io.unsafe.UnsafeBufferOperations.INSTANCE;
        kotlinx.io.Segment writableSegment = p0.writableSegment(1);
        byte[] dataAsByteArray = writableSegment.dataAsByteArray(false);
        int limit = writableSegment.getLimit();
        int read = this.getHighSpeedVideoFpsRanges.read(java.nio.ByteBuffer.wrap(dataAsByteArray, limit, java.lang.Math.min(min, dataAsByteArray.length - limit)));
        int max = java.lang.Math.max(read, 0);
        if (max == 1) {
            writableSegment.writeBackData(dataAsByteArray, max);
            writableSegment.setLimit(writableSegment.getLimit() + max);
            p0.setSizeMut(p0.getSizeMut() + max);
        } else {
            if (max < 0 || max > writableSegment.getRemainingCapacity()) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid number of bytes written: ");
                sb.append(max);
                sb.append(". Should be in 0..");
                sb.append(writableSegment.getRemainingCapacity());
                throw new java.lang.IllegalStateException(sb.toString().toString());
            }
            if (max != 0) {
                writableSegment.writeBackData(dataAsByteArray, max);
                writableSegment.setLimit(writableSegment.getLimit() + max);
                p0.setSizeMut(p0.getSizeMut() + max);
            } else if (kotlinx.io.SegmentKt.isEmpty(writableSegment)) {
                p0.recycleTail();
            }
        }
        return read;
    }

    @Override // kotlinx.io.RawSource, java.lang.AutoCloseable
    public void close() {
        this.getHighSpeedVideoFpsRanges.close();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ReadableByteChannelSource(");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(')');
        return sb.toString();
    }
}
