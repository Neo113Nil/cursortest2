package kotlinx.io;

/* compiled from: SourcesJvm.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u001a\u0012\u0010\u0007\u001a\u00020\u0001*\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u001a\u0010\u0007\u001a\u00020\u0001*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\n\u0010\t\u001a\u00020\n*\u00020\b\u001a\u0012\u0010\u000b\u001a\u00020\f*\u00020\b2\u0006\u0010\r\u001a\u00020\u000e\u001a\n\u0010\u000f\u001a\u00020\u0010*\u00020\b¨\u0006\u0011"}, d2 = {"readStringImpl", "", "Lkotlinx/io/Buffer;", "byteCount", "", "charset", "Ljava/nio/charset/Charset;", "readString", "Lkotlinx/io/Source;", "asInputStream", "Ljava/io/InputStream;", "readAtMostTo", "", "sink", "Ljava/nio/ByteBuffer;", "asByteChannel", "Ljava/nio/channels/ReadableByteChannel;", "kotlinx-io-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SourcesJvmKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean asByteChannel$lambda$3() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean asInputStream$lambda$2() {
        return false;
    }

    private static final java.lang.String readStringImpl(kotlinx.io.Buffer buffer, long j, java.nio.charset.Charset charset) {
        java.lang.String str;
        int i;
        if (j < 0 || j > 2147483647L) {
            throw new java.lang.IllegalArgumentException(("byteCount (" + j + ") is not within the range [0..2147483647)").toString());
        }
        if (buffer.getSizeMut() < j) {
            throw new java.io.EOFException("Buffer contains less bytes then required (byteCount: " + j + ", size: " + buffer.getSizeMut() + ')');
        }
        if (j == 0) {
            return "";
        }
        kotlinx.io.unsafe.UnsafeBufferOperations unsafeBufferOperations = kotlinx.io.unsafe.UnsafeBufferOperations.INSTANCE;
        if (!(!buffer.exhausted())) {
            throw new java.lang.IllegalArgumentException("Buffer is empty".toString());
        }
        kotlinx.io.Segment head = buffer.getHead();
        kotlin.jvm.internal.Intrinsics.checkNotNull(head);
        byte[] dataAsByteArray = head.dataAsByteArray(true);
        int pos = head.getPos();
        if (head.getLimit() - pos >= j) {
            i = (int) j;
            str = new java.lang.String(dataAsByteArray, pos, i, charset);
        } else {
            str = null;
            i = 0;
        }
        if (i != 0) {
            if (i < 0) {
                throw new java.lang.IllegalStateException("Returned negative read bytes count");
            }
            if (i > head.getSize()) {
                throw new java.lang.IllegalStateException("Returned too many bytes");
            }
            buffer.skip(i);
        }
        return str == null ? new java.lang.String(kotlinx.io.SourcesKt.readByteArray(buffer, (int) j), charset) : str;
    }

    public static final java.lang.String readString(kotlinx.io.Source source, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        for (long j = 1; source.request(j); j *= 2) {
        }
        return readStringImpl(source.getBufferField(), source.getBufferField().getSizeMut(), charset);
    }

    public static final java.lang.String readString(kotlinx.io.Source source, long j, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        source.require(j);
        return readStringImpl(source.getBufferField(), j, charset);
    }

    public static final java.io.InputStream asInputStream(final kotlinx.io.Source source) {
        final kotlin.jvm.internal.MutablePropertyReference0Impl mutablePropertyReference0Impl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "<this>");
        if (source instanceof kotlinx.io.RealSource) {
            mutablePropertyReference0Impl = new kotlin.jvm.internal.MutablePropertyReference0Impl(source) { // from class: kotlinx.io.SourcesJvmKt$asInputStream$isClosed$1
                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                public java.lang.Object get() {
                    return java.lang.Boolean.valueOf(((kotlinx.io.RealSource) this.receiver).closed);
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                public void set(java.lang.Object obj) {
                    ((kotlinx.io.RealSource) this.receiver).closed = ((java.lang.Boolean) obj).booleanValue();
                }
            };
        } else {
            if (!(source instanceof kotlinx.io.Buffer)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            mutablePropertyReference0Impl = new kotlin.jvm.functions.Function0() { // from class: kotlinx.io.SourcesJvmKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    boolean asInputStream$lambda$2;
                    asInputStream$lambda$2 = kotlinx.io.SourcesJvmKt.asInputStream$lambda$2();
                    return java.lang.Boolean.valueOf(asInputStream$lambda$2);
                }
            };
        }
        return new java.io.InputStream() { // from class: kotlinx.io.SourcesJvmKt$asInputStream$1
            @Override // java.io.InputStream
            public int read() {
                if (mutablePropertyReference0Impl.invoke().booleanValue()) {
                    throw new java.io.IOException("Underlying source is closed.");
                }
                if (source.exhausted()) {
                    return -1;
                }
                return source.readByte() & 255;
            }

            @Override // java.io.InputStream
            public int read(byte[] data, int offset, int byteCount) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
                if (mutablePropertyReference0Impl.invoke().booleanValue()) {
                    throw new java.io.IOException("Underlying source is closed.");
                }
                kotlinx.io._UtilKt.checkOffsetAndCount(data.length, offset, byteCount);
                return source.readAtMostTo(data, offset, byteCount + offset);
            }

            @Override // java.io.InputStream
            public int available() {
                if (mutablePropertyReference0Impl.invoke().booleanValue()) {
                    throw new java.io.IOException("Underlying source is closed.");
                }
                return (int) java.lang.Math.min(source.getBufferField().getSizeMut(), Integer.MAX_VALUE);
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                source.close();
            }

            public java.lang.String toString() {
                return source + ".asInputStream()";
            }
        };
    }

    public static final int readAtMostTo(kotlinx.io.Source source, java.nio.ByteBuffer sink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        if (source.getBufferField().getSizeMut() == 0) {
            source.request(android.support.v4.media.session.PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (source.getBufferField().getSizeMut() == 0) {
                return -1;
            }
        }
        return kotlinx.io.BuffersJvmKt.readAtMostTo(source.getBufferField(), sink);
    }

    public static final java.nio.channels.ReadableByteChannel asByteChannel(final kotlinx.io.Source source) {
        final kotlin.jvm.internal.MutablePropertyReference0Impl mutablePropertyReference0Impl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "<this>");
        if (source instanceof kotlinx.io.RealSource) {
            mutablePropertyReference0Impl = new kotlin.jvm.internal.MutablePropertyReference0Impl(source) { // from class: kotlinx.io.SourcesJvmKt$asByteChannel$isClosed$1
                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                public java.lang.Object get() {
                    return java.lang.Boolean.valueOf(((kotlinx.io.RealSource) this.receiver).closed);
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                public void set(java.lang.Object obj) {
                    ((kotlinx.io.RealSource) this.receiver).closed = ((java.lang.Boolean) obj).booleanValue();
                }
            };
        } else {
            if (!(source instanceof kotlinx.io.Buffer)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            mutablePropertyReference0Impl = new kotlin.jvm.functions.Function0() { // from class: kotlinx.io.SourcesJvmKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    boolean asByteChannel$lambda$3;
                    asByteChannel$lambda$3 = kotlinx.io.SourcesJvmKt.asByteChannel$lambda$3();
                    return java.lang.Boolean.valueOf(asByteChannel$lambda$3);
                }
            };
        }
        return new java.nio.channels.ReadableByteChannel() { // from class: kotlinx.io.SourcesJvmKt$asByteChannel$1
            @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                kotlinx.io.Source.this.close();
            }

            @Override // java.nio.channels.Channel
            public boolean isOpen() {
                return !mutablePropertyReference0Impl.invoke().booleanValue();
            }

            @Override // java.nio.channels.ReadableByteChannel
            public int read(java.nio.ByteBuffer sink) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
                return kotlinx.io.SourcesJvmKt.readAtMostTo(kotlinx.io.Source.this, sink);
            }
        };
    }
}
