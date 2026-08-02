package com.zettle.sdk.io;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005H&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0005H&¢\u0006\u0004\b\r\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H&¢\u0006\u0004\b\u000e\u0010\u0014J\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0005H&¢\u0006\u0004\b\u000e\u0010\u000bR\u0014\u0010\u0018\u001a\u00020\u00158'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00058'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/io/FileWriter;", "Ljava/io/Closeable;", "", "readByte", "()B", "", "readLong", "()J", "pointer", "", "seek", "(J)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "setLength", "write", "(B)V", "", "", "offset", io.ktor.http.ContentDisposition.Parameters.Size, "([BII)V", "Lcom/zettle/sdk/io/WritableFileChannel;", "getChannel", "()Lcom/zettle/sdk/io/WritableFileChannel;", "channel", "getLength", "length", "getPointer", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface FileWriter extends java.io.Closeable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.io.FileWriter.Companion INSTANCE = com.zettle.sdk.io.FileWriter.Companion.getHighSpeedVideoFpsRangesFor;

    com.zettle.sdk.io.WritableFileChannel getChannel();

    long getLength();

    long getPointer();

    byte readByte();

    long readLong();

    void seek(long pointer);

    void setLength(long value);

    void write(byte value);

    void write(long value);

    void write(byte[] value, int offset, int size);

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/io/FileWriter$Companion;", "", "<init>", "()V", "Ljava/io/File;", "file", "Lcom/zettle/sdk/io/FileWriter;", "create", "(Ljava/io/File;)Lcom/zettle/sdk/io/FileWriter;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.zettle.sdk.io.FileWriter.Companion getHighSpeedVideoFpsRangesFor = new com.zettle.sdk.io.FileWriter.Companion();

        private Companion() {
        }

        public final com.zettle.sdk.io.FileWriter create(java.io.File file) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
            return new com.zettle.sdk.io.FileWriterImpl(file);
        }
    }
}
