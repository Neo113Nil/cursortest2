package androidx.room.util;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljava/nio/channels/ReadableByteChannel;", "input", "Ljava/nio/channels/FileChannel;", "output", "", "copy", "(Ljava/nio/channels/ReadableByteChannel;Ljava/nio/channels/FileChannel;)V"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FileUtil {
    public static final void copy(java.nio.channels.ReadableByteChannel readableByteChannel, java.nio.channels.FileChannel fileChannel) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readableByteChannel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileChannel, "");
        try {
            fileChannel.transferFrom(readableByteChannel, 0L, Long.MAX_VALUE);
            fileChannel.force(false);
        } finally {
            readableByteChannel.close();
            fileChannel.close();
        }
    }
}
