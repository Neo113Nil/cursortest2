package okio;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Lokio/JvmFileHandle;", "Lokio/FileHandle;", "", "readWrite", "Ljava/io/RandomAccessFile;", "randomAccessFile", "<init>", "(ZLjava/io/RandomAccessFile;)V", "", io.ktor.http.ContentDisposition.Parameters.Size, "", "protectedResize", "(J)V", "protectedSize", "()J", "fileOffset", "", "array", "", "arrayOffset", "byteCount", "protectedRead", "(J[BII)I", "protectedWrite", "(J[BII)V", "protectedFlush", "()V", "protectedClose", "getHighSpeedVideoFpsRangesFor", "Ljava/io/RandomAccessFile;"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class JvmFileHandle extends okio.FileHandle {
    private final java.io.RandomAccessFile getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmFileHandle(boolean z, java.io.RandomAccessFile randomAccessFile) {
        super(z);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(randomAccessFile, "");
        this.getHighSpeedVideoFpsRangesFor = randomAccessFile;
    }

    @Override // okio.FileHandle
    protected final void protectedResize(long size) {
        synchronized (this) {
            long size2 = size();
            long j = size - size2;
            if (j > 0) {
                int i = (int) j;
                protectedWrite(size2, new byte[i], 0, i);
            } else {
                this.getHighSpeedVideoFpsRangesFor.setLength(size);
            }
        }
    }

    @Override // okio.FileHandle
    protected final long protectedSize() {
        long length;
        synchronized (this) {
            length = this.getHighSpeedVideoFpsRangesFor.length();
        }
        return length;
    }

    @Override // okio.FileHandle
    protected final int protectedRead(long fileOffset, byte[] array, int arrayOffset, int byteCount) {
        synchronized (this) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "");
            this.getHighSpeedVideoFpsRangesFor.seek(fileOffset);
            int i = 0;
            while (true) {
                if (i >= byteCount) {
                    break;
                }
                int read = this.getHighSpeedVideoFpsRangesFor.read(array, arrayOffset, byteCount - i);
                if (read != -1) {
                    i += read;
                } else if (i == 0) {
                    return -1;
                }
            }
            return i;
        }
    }

    @Override // okio.FileHandle
    protected final void protectedWrite(long fileOffset, byte[] array, int arrayOffset, int byteCount) {
        synchronized (this) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "");
            this.getHighSpeedVideoFpsRangesFor.seek(fileOffset);
            this.getHighSpeedVideoFpsRangesFor.write(array, arrayOffset, byteCount);
        }
    }

    @Override // okio.FileHandle
    protected final void protectedFlush() {
        synchronized (this) {
            this.getHighSpeedVideoFpsRangesFor.getFD().sync();
        }
    }

    @Override // okio.FileHandle
    protected final void protectedClose() {
        synchronized (this) {
            this.getHighSpeedVideoFpsRangesFor.close();
        }
    }
}
