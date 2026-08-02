package okhttp3.internal.cache2;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lokhttp3/internal/cache2/FileOperator;", "", "Ljava/nio/channels/FileChannel;", "fileChannel", "<init>", "(Ljava/nio/channels/FileChannel;)V", "", "pos", "Lokio/Buffer;", "source", "byteCount", "", "write", "(JLokio/Buffer;J)V", "sink", "read", "getHighSpeedVideoFpsRanges", "Ljava/nio/channels/FileChannel;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class FileOperator {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.nio.channels.FileChannel getHighSpeedVideoFpsRangesFor;

    public FileOperator(java.nio.channels.FileChannel fileChannel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileChannel, "");
        this.getHighSpeedVideoFpsRangesFor = fileChannel;
    }

    public final void write(long pos, okio.Buffer source, long byteCount) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        if (byteCount < 0 || byteCount > source.size()) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        while (byteCount > 0) {
            long transferFrom = this.getHighSpeedVideoFpsRangesFor.transferFrom(source, pos, byteCount);
            pos += transferFrom;
            byteCount -= transferFrom;
        }
    }

    public final void read(long pos, okio.Buffer sink, long byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
        if (byteCount < 0) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        while (byteCount > 0) {
            long transferTo = this.getHighSpeedVideoFpsRangesFor.transferTo(pos, byteCount, sink);
            pos += transferTo;
            byteCount -= transferTo;
        }
    }
}
