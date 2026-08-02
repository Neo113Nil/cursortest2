package com.zettle.sdk.io;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0012\u0010\u0018J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0010R\u0014\u0010\u001c\u001a\u00020\u00198WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u000eR\u0014\u0010 \u001a\u00020\f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010#"}, d2 = {"Lcom/zettle/sdk/io/FileWriterImpl;", "Lcom/zettle/sdk/io/FileWriter;", "Ljava/io/File;", "p0", "<init>", "(Ljava/io/File;)V", "", "close", "()V", "", "readByte", "()B", "", "readLong", "()J", "seek", "(J)V", "setLength", "write", "(B)V", "", "", "p1", "p2", "([BII)V", "Lcom/zettle/sdk/io/WritableFileChannel;", "getChannel", "()Lcom/zettle/sdk/io/WritableFileChannel;", "getHighSpeedVideoFpsRanges", "getLength", "getHighSpeedVideoSizes", "getPointer", "getHighSpeedVideoFpsRangesFor", "Lkotlin/Lazy;", "Ljava/io/RandomAccessFile;", "Lkotlin/Lazy;", "Camera2StreamConfigurationMap"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
final class FileWriterImpl implements com.zettle.sdk.io.FileWriter {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.Lazy<java.io.RandomAccessFile> Camera2StreamConfigurationMap;

    public FileWriterImpl(final java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        this.Camera2StreamConfigurationMap = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<java.io.RandomAccessFile>() { // from class: com.zettle.sdk.io.FileWriterImpl$raf$1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
            public final java.io.RandomAccessFile invoke() {
                if (!file.exists()) {
                    file.createNewFile();
                }
                return new java.io.RandomAccessFile(file, "rwd");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    @Override // com.zettle.sdk.io.FileWriter
    public final long getLength() {
        return this.Camera2StreamConfigurationMap.getValue().length();
    }

    @Override // com.zettle.sdk.io.FileWriter
    public final long getPointer() {
        return this.Camera2StreamConfigurationMap.getValue().getFilePointer();
    }

    @Override // com.zettle.sdk.io.FileWriter
    public final com.zettle.sdk.io.WritableFileChannel getChannel() {
        com.zettle.sdk.io.WritableFileChannel.Companion companion = com.zettle.sdk.io.WritableFileChannel.INSTANCE;
        java.nio.channels.FileChannel channel = this.Camera2StreamConfigurationMap.getValue().getChannel();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(channel, "");
        return companion.create(channel);
    }

    @Override // com.zettle.sdk.io.FileWriter
    public final void setLength(long p0) {
        this.Camera2StreamConfigurationMap.getValue().setLength(p0);
    }

    @Override // com.zettle.sdk.io.FileWriter
    public final long readLong() {
        return this.Camera2StreamConfigurationMap.getValue().readLong();
    }

    @Override // com.zettle.sdk.io.FileWriter
    public final byte readByte() {
        return this.Camera2StreamConfigurationMap.getValue().readByte();
    }

    @Override // com.zettle.sdk.io.FileWriter
    public final void seek(long p0) {
        this.Camera2StreamConfigurationMap.getValue().seek(p0);
    }

    @Override // com.zettle.sdk.io.FileWriter
    public final void write(byte p0) {
        this.Camera2StreamConfigurationMap.getValue().writeByte(p0);
    }

    @Override // com.zettle.sdk.io.FileWriter
    public final void write(long p0) {
        this.Camera2StreamConfigurationMap.getValue().writeLong(p0);
    }

    @Override // com.zettle.sdk.io.FileWriter
    public final void write(byte[] p0, int p1, int p2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        this.Camera2StreamConfigurationMap.getValue().write(p0, p1, p2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.Camera2StreamConfigurationMap.isInitialized()) {
            this.Camera2StreamConfigurationMap.getValue().close();
        }
    }
}
