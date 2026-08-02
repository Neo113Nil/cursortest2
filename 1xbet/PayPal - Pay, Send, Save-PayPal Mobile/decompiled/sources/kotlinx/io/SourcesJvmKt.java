package kotlinx.io;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\n\u001a\u00020\u0005*\u00020\b2\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a!\u0010\n\u001a\u00020\u0005*\u00020\b2\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\r\u001a\u0011\u0010\u000f\u001a\u00020\u000e*\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0019\u0010\u0014\u001a\u00020\u0013*\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0011\u0010\u0017\u001a\u00020\u0016*\u00020\b¢\u0006\u0004\b\u0017\u0010\u0018"}, d2 = {"Lkotlinx/io/Buffer;", "", "p0", "Ljava/nio/charset/Charset;", "p1", "", "getHighSpeedVideoFpsRangesFor", "(Lkotlinx/io/Buffer;JLjava/nio/charset/Charset;)Ljava/lang/String;", "Lkotlinx/io/Source;", io.ktor.http.auth.HttpAuthHeader.Parameters.Charset, "readString", "(Lkotlinx/io/Source;Ljava/nio/charset/Charset;)Ljava/lang/String;", "byteCount", "(Lkotlinx/io/Source;JLjava/nio/charset/Charset;)Ljava/lang/String;", "Ljava/io/InputStream;", "asInputStream", "(Lkotlinx/io/Source;)Ljava/io/InputStream;", "Ljava/nio/ByteBuffer;", "sink", "", "readAtMostTo", "(Lkotlinx/io/Source;Ljava/nio/ByteBuffer;)I", "Ljava/nio/channels/ReadableByteChannel;", "asByteChannel", "(Lkotlinx/io/Source;)Ljava/nio/channels/ReadableByteChannel;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SourcesJvmKt {
    public static /* synthetic */ boolean $r8$lambda$aU5GkkcU0m2r0GOMGzbja0s9GVE() {
        return false;
    }

    public static /* synthetic */ boolean $r8$lambda$x8O8kvplpwOH41Zk3t0rGQyJTSg() {
        return false;
    }

    private static final java.lang.String getHighSpeedVideoFpsRangesFor(kotlinx.io.Buffer buffer, long j, java.nio.charset.Charset charset) {
        java.lang.String str;
        int i;
        if (j < 0 || j > androidx.collection.SieveCacheKt.NodeLinkMask) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("byteCount (");
            sb.append(j);
            sb.append(") is not within the range [0..2147483647)");
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        if (buffer.getSizeMut() < j) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Buffer contains less bytes then required (byteCount: ");
            sb2.append(j);
            sb2.append(", size: ");
            sb2.append(buffer.getSizeMut());
            sb2.append(')');
            throw new java.io.EOFException(sb2.toString());
        }
        if (j == 0) {
            return "";
        }
        kotlinx.io.unsafe.UnsafeBufferOperations unsafeBufferOperations = kotlinx.io.unsafe.UnsafeBufferOperations.INSTANCE;
        if (buffer.exhausted()) {
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
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "");
        for (long j = 1; source.request(j); j *= 2) {
        }
        return getHighSpeedVideoFpsRangesFor(source.getGetHighResolutionOutputSizeshNQ4ISI(), source.getGetHighResolutionOutputSizeshNQ4ISI().getSizeMut(), charset);
    }

    public static final java.lang.String readString(kotlinx.io.Source source, long j, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "");
        source.require(j);
        return getHighSpeedVideoFpsRangesFor(source.getGetHighResolutionOutputSizeshNQ4ISI(), j, charset);
    }

    public static final java.io.InputStream asInputStream(final kotlinx.io.Source source) {
        final kotlin.jvm.internal.MutablePropertyReference0Impl mutablePropertyReference0Impl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        if (source instanceof kotlinx.io.RealSource) {
            mutablePropertyReference0Impl = new kotlin.jvm.internal.MutablePropertyReference0Impl(source) { // from class: kotlinx.io.SourcesJvmKt$asInputStream$isClosed$1
                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                public final java.lang.Object get() {
                    return java.lang.Boolean.valueOf(((kotlinx.io.RealSource) this.receiver).closed);
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                public final void set(java.lang.Object obj) {
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
                    return java.lang.Boolean.valueOf(kotlinx.io.SourcesJvmKt.$r8$lambda$x8O8kvplpwOH41Zk3t0rGQyJTSg());
                }
            };
        }
        return new java.io.InputStream() { // from class: kotlinx.io.SourcesJvmKt$asInputStream$1
            @Override // java.io.InputStream
            public final int read() {
                if (mutablePropertyReference0Impl.invoke().booleanValue()) {
                    throw new java.io.IOException("Underlying source is closed.");
                }
                if (source.exhausted()) {
                    return -1;
                }
                return source.readByte() & 255;
            }

            @Override // java.io.InputStream
            public final int read(byte[] data, int offset, int byteCount) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
                if (mutablePropertyReference0Impl.invoke().booleanValue()) {
                    throw new java.io.IOException("Underlying source is closed.");
                }
                kotlinx.io._UtilKt.checkOffsetAndCount(data.length, offset, byteCount);
                return source.readAtMostTo(data, offset, byteCount + offset);
            }

            @Override // java.io.InputStream
            public final int available() {
                if (mutablePropertyReference0Impl.invoke().booleanValue()) {
                    throw new java.io.IOException("Underlying source is closed.");
                }
                return (int) java.lang.Math.min(source.getGetHighResolutionOutputSizeshNQ4ISI().getSizeMut(), androidx.collection.SieveCacheKt.NodeLinkMask);
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                source.close();
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(source);
                sb.append(".asInputStream()");
                return sb.toString();
            }
        };
    }

    public static final int readAtMostTo(kotlinx.io.Source source, java.nio.ByteBuffer byteBuffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (source.getGetHighResolutionOutputSizeshNQ4ISI().getSizeMut() == 0) {
            source.request(8192L);
            if (source.getGetHighResolutionOutputSizeshNQ4ISI().getSizeMut() == 0) {
                return -1;
            }
        }
        return kotlinx.io.BuffersJvmKt.readAtMostTo(source.getGetHighResolutionOutputSizeshNQ4ISI(), byteBuffer);
    }

    public static final java.nio.channels.ReadableByteChannel asByteChannel(final kotlinx.io.Source source) {
        final kotlin.jvm.internal.MutablePropertyReference0Impl mutablePropertyReference0Impl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        if (source instanceof kotlinx.io.RealSource) {
            mutablePropertyReference0Impl = new kotlin.jvm.internal.MutablePropertyReference0Impl(source) { // from class: kotlinx.io.SourcesJvmKt$asByteChannel$isClosed$1
                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                public final java.lang.Object get() {
                    return java.lang.Boolean.valueOf(((kotlinx.io.RealSource) this.receiver).closed);
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                public final void set(java.lang.Object obj) {
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
                    return java.lang.Boolean.valueOf(kotlinx.io.SourcesJvmKt.$r8$lambda$aU5GkkcU0m2r0GOMGzbja0s9GVE());
                }
            };
        }
        return new java.nio.channels.ReadableByteChannel() { // from class: kotlinx.io.SourcesJvmKt$asByteChannel$1
            @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                kotlinx.io.Source.this.close();
            }

            @Override // java.nio.channels.Channel
            public final boolean isOpen() {
                return !mutablePropertyReference0Impl.invoke().booleanValue();
            }

            @Override // java.nio.channels.ReadableByteChannel
            public final int read(java.nio.ByteBuffer sink) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
                return kotlinx.io.SourcesJvmKt.readAtMostTo(kotlinx.io.Source.this, sink);
            }
        };
    }
}
