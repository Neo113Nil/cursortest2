package com.zettle.sdk.io;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\u0016\u001a\u00020\u00152\n\u0010\u0004\u001a\u0006*\u00020\u00140\u0014H\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\r8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/zettle/sdk/io/WritableFileChannelImpl;", "Lcom/zettle/sdk/io/WritableFileChannel;", "Ljava/nio/channels/WritableByteChannel;", "Ljava/nio/channels/FileChannel;", "p0", "<init>", "(Ljava/nio/channels/FileChannel;)V", "", "close", "()V", "", "isOpen", "()Z", "", "seek", "(J)V", "p1", "p2", "transferTo", "(Lcom/zettle/sdk/io/WritableFileChannel;JJ)V", "Ljava/nio/ByteBuffer;", "", "write", "(Ljava/nio/ByteBuffer;)I", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/nio/channels/FileChannel;", "getHighSpeedVideoFpsRanges", "getLength", "()J", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
final class WritableFileChannelImpl implements com.zettle.sdk.io.WritableFileChannel, java.nio.channels.WritableByteChannel {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.nio.channels.FileChannel getHighSpeedVideoFpsRanges;

    public WritableFileChannelImpl(java.nio.channels.FileChannel fileChannel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileChannel, "");
        this.getHighSpeedVideoFpsRanges = fileChannel;
    }

    @Override // com.zettle.sdk.io.WritableFileChannel
    public final long getLength() {
        return this.getHighSpeedVideoFpsRanges.size();
    }

    @Override // com.zettle.sdk.io.WritableFileChannel
    public final void transferTo(com.zettle.sdk.io.WritableFileChannel p0, long p1, long p2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        this.getHighSpeedVideoFpsRanges.transferTo(p1, p2, p0);
    }

    @Override // com.zettle.sdk.io.WritableFileChannel
    public final void seek(long p0) {
        this.getHighSpeedVideoFpsRanges.position(p0);
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(java.nio.ByteBuffer p0) {
        return this.getHighSpeedVideoFpsRanges.write(p0);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return this.getHighSpeedVideoFpsRanges.isOpen();
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.getHighSpeedVideoFpsRanges.close();
    }
}
