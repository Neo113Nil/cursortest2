package io.ktor.utils.io.jvm.javaio;

/* compiled from: Blocking.kt */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\b\u001a\u00020\u0007*\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/ktor/utils/io/ByteReadChannel;", "Lkotlinx/coroutines/Job;", "parent", "Ljava/io/InputStream;", "toInputStream", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlinx/coroutines/Job;)Ljava/io/InputStream;", "Lio/ktor/utils/io/ByteWriteChannel;", "Ljava/io/OutputStream;", "toOutputStream", "(Lio/ktor/utils/io/ByteWriteChannel;)Ljava/io/OutputStream;", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BlockingKt {
    public static /* synthetic */ java.io.InputStream toInputStream$default(io.ktor.utils.io.ByteReadChannel byteReadChannel, kotlinx.coroutines.Job job, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            job = null;
        }
        return toInputStream(byteReadChannel, job);
    }

    public static final java.io.InputStream toInputStream(final io.ktor.utils.io.ByteReadChannel byteReadChannel, kotlinx.coroutines.Job job) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteReadChannel, "<this>");
        return new java.io.InputStream() { // from class: io.ktor.utils.io.jvm.javaio.BlockingKt$toInputStream$1
            @Override // java.io.InputStream
            public int read() {
                if (io.ktor.utils.io.ByteReadChannel.this.isClosedForRead()) {
                    return -1;
                }
                if (io.ktor.utils.io.ByteReadChannel.this.getReadBuffer().exhausted()) {
                    blockingWait();
                }
                if (io.ktor.utils.io.ByteReadChannel.this.isClosedForRead()) {
                    return -1;
                }
                return io.ktor.utils.io.ByteReadChannel.this.getReadBuffer().readByte() & 255;
            }

            @Override // java.io.InputStream
            public int read(byte[] b, int off, int len) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(b, "b");
                if (io.ktor.utils.io.ByteReadChannel.this.isClosedForRead()) {
                    return -1;
                }
                if (io.ktor.utils.io.ByteReadChannel.this.getReadBuffer().exhausted()) {
                    blockingWait();
                }
                int readAtMostTo = io.ktor.utils.io.ByteReadChannel.this.getReadBuffer().readAtMostTo(b, off, java.lang.Math.min(io.ktor.utils.io.ByteReadChannelOperationsKt.getAvailableForRead(io.ktor.utils.io.ByteReadChannel.this), len) + off);
                return readAtMostTo >= 0 ? readAtMostTo : io.ktor.utils.io.ByteReadChannel.this.isClosedForRead() ? -1 : 0;
            }

            private final void blockingWait() {
                kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new io.ktor.utils.io.jvm.javaio.BlockingKt$toInputStream$1$blockingWait$1(io.ktor.utils.io.ByteReadChannel.this, null), 1, null);
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                io.ktor.utils.io.ByteReadChannelKt.cancel(io.ktor.utils.io.ByteReadChannel.this);
            }
        };
    }

    public static final java.io.OutputStream toOutputStream(final io.ktor.utils.io.ByteWriteChannel byteWriteChannel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteWriteChannel, "<this>");
        return new java.io.OutputStream() { // from class: io.ktor.utils.io.jvm.javaio.BlockingKt$toOutputStream$1
            @Override // java.io.OutputStream
            public void write(int b) {
                kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new io.ktor.utils.io.jvm.javaio.BlockingKt$toOutputStream$1$write$1(io.ktor.utils.io.ByteWriteChannel.this, b, null), 1, null);
            }

            @Override // java.io.OutputStream
            public void write(byte[] b, int off, int len) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(b, "b");
                kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new io.ktor.utils.io.jvm.javaio.BlockingKt$toOutputStream$1$write$2(io.ktor.utils.io.ByteWriteChannel.this, b, off, len, null), 1, null);
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() {
                kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new io.ktor.utils.io.jvm.javaio.BlockingKt$toOutputStream$1$flush$1(io.ktor.utils.io.ByteWriteChannel.this, null), 1, null);
            }

            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new io.ktor.utils.io.jvm.javaio.BlockingKt$toOutputStream$1$close$1(io.ktor.utils.io.ByteWriteChannel.this, null), 1, null);
            }
        };
    }
}
