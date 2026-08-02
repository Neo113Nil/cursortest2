package com.zettle.sdk.io;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\bf\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/zettle/sdk/io/WritableFileChannel;", "Ljava/nio/channels/WritableByteChannel;", "", "pos", "", "seek", "(J)V", "channel", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "transferTo", "(Lcom/zettle/sdk/io/WritableFileChannel;JJ)V", "getLength", "()J", "length", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface WritableFileChannel extends java.nio.channels.WritableByteChannel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.io.WritableFileChannel.Companion INSTANCE = com.zettle.sdk.io.WritableFileChannel.Companion.Camera2StreamConfigurationMap;

    long getLength();

    void seek(long pos);

    void transferTo(com.zettle.sdk.io.WritableFileChannel channel, long pos, long count);

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/io/WritableFileChannel$Companion;", "", "<init>", "()V", "Ljava/nio/channels/FileChannel;", "fileChannel", "Lcom/zettle/sdk/io/WritableFileChannel;", "create", "(Ljava/nio/channels/FileChannel;)Lcom/zettle/sdk/io/WritableFileChannel;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.zettle.sdk.io.WritableFileChannel.Companion Camera2StreamConfigurationMap = new com.zettle.sdk.io.WritableFileChannel.Companion();

        private Companion() {
        }

        public final com.zettle.sdk.io.WritableFileChannel create(java.nio.channels.FileChannel fileChannel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileChannel, "");
            return new com.zettle.sdk.io.WritableFileChannelImpl(fileChannel);
        }
    }
}
