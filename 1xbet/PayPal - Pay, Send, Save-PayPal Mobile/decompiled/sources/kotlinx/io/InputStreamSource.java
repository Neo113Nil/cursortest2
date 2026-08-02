package kotlinx.io;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0012\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lkotlinx/io/InputStreamSource;", "Lkotlinx/io/RawSource;", "Ljava/io/InputStream;", "p0", "<init>", "(Ljava/io/InputStream;)V", "Lkotlinx/io/Buffer;", "", "p1", "readAtMostTo", "(Lkotlinx/io/Buffer;J)J", "", "close", "()V", "", "toString", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "Ljava/io/InputStream;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
class InputStreamSource implements kotlinx.io.RawSource {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.io.InputStream getHighSpeedVideoSizes;

    public InputStreamSource(java.io.InputStream inputStream) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputStream, "");
        this.getHighSpeedVideoSizes = inputStream;
    }

    @Override // kotlinx.io.RawSource
    public long readAtMostTo(kotlinx.io.Buffer p0, long p1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        if (p1 == 0) {
            return 0L;
        }
        if (p1 >= 0) {
            try {
                kotlinx.io.unsafe.UnsafeBufferOperations unsafeBufferOperations = kotlinx.io.unsafe.UnsafeBufferOperations.INSTANCE;
                kotlinx.io.Segment writableSegment = p0.writableSegment(1);
                byte[] dataAsByteArray = writableSegment.dataAsByteArray(false);
                long read = this.getHighSpeedVideoSizes.read(dataAsByteArray, writableSegment.getLimit(), (int) java.lang.Math.min(p1, dataAsByteArray.length - r4));
                int i = read != -1 ? (int) read : 0;
                if (i == 1) {
                    writableSegment.writeBackData(dataAsByteArray, i);
                    writableSegment.setLimit(writableSegment.getLimit() + i);
                    p0.setSizeMut(p0.getSizeMut() + i);
                    return read;
                }
                if (i < 0 || i > writableSegment.getRemainingCapacity()) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid number of bytes written: ");
                    sb.append(i);
                    sb.append(". Should be in 0..");
                    sb.append(writableSegment.getRemainingCapacity());
                    throw new java.lang.IllegalStateException(sb.toString().toString());
                }
                if (i != 0) {
                    writableSegment.writeBackData(dataAsByteArray, i);
                    writableSegment.setLimit(writableSegment.getLimit() + i);
                    p0.setSizeMut(p0.getSizeMut() + i);
                    return read;
                }
                if (kotlinx.io.SegmentKt.isEmpty(writableSegment)) {
                    p0.recycleTail();
                }
                return read;
            } catch (java.lang.AssertionError e) {
                if (kotlinx.io.JvmCoreKt.isAndroidGetsocknameError(e)) {
                    throw new java.io.IOException(e);
                }
                throw e;
            }
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("byteCount (");
        sb2.append(p1);
        sb2.append(") < 0");
        throw new java.lang.IllegalArgumentException(sb2.toString().toString());
    }

    @Override // kotlinx.io.RawSource, java.lang.AutoCloseable
    public void close() {
        this.getHighSpeedVideoSizes.close();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RawSource(");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(')');
        return sb.toString();
    }
}
