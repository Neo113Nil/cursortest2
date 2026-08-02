package androidx.room.concurrent;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/room/concurrent/FileLock;", "", "", "filename", "<init>", "(Ljava/lang/String;)V", "", "lock", "()V", "unlock", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Ljava/nio/channels/FileChannel;", "getHighSpeedVideoFpsRanges", "Ljava/nio/channels/FileChannel;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FileLock {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private java.nio.channels.FileChannel getHighSpeedVideoSizes;

    public FileLock(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(".lck");
        this.getHighSpeedVideoFpsRangesFor = sb.toString();
    }

    public final void lock() {
        if (this.getHighSpeedVideoSizes == null) {
            try {
                java.io.File file = new java.io.File(this.getHighSpeedVideoFpsRangesFor);
                java.io.File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                java.nio.channels.FileChannel channel = new java.io.FileOutputStream(file).getChannel();
                this.getHighSpeedVideoSizes = channel;
                if (channel != null) {
                    channel.lock();
                }
            } catch (java.lang.Throwable th) {
                java.nio.channels.FileChannel fileChannel = this.getHighSpeedVideoSizes;
                if (fileChannel != null) {
                    fileChannel.close();
                }
                this.getHighSpeedVideoSizes = null;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to lock file: '");
                sb.append(this.getHighSpeedVideoFpsRangesFor);
                sb.append("'.");
                throw new java.lang.IllegalStateException(sb.toString(), th);
            }
        }
    }

    public final void unlock() {
        java.nio.channels.FileChannel fileChannel = this.getHighSpeedVideoSizes;
        if (fileChannel == null) {
            return;
        }
        try {
            fileChannel.close();
        } finally {
            this.getHighSpeedVideoSizes = null;
        }
    }
}
