package kotlinx.io;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a!\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a+\u0010\u000e\u001a\u00020\r*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a#\u0010\u0012\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013\u001a-\u0010\u0016\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0019\u0010\u001b\u001a\u00020\u001a*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0018¢\u0006\u0004\b\u0003\u0010\u001e\u001a\u0011\u0010 \u001a\u00020\u001f*\u00020\u0000¢\u0006\u0004\b \u0010!"}, d2 = {"Lkotlinx/io/Buffer;", "Ljava/io/InputStream;", "input", "transferFrom", "(Lkotlinx/io/Buffer;Ljava/io/InputStream;)Lkotlinx/io/Buffer;", "", "byteCount", "write", "(Lkotlinx/io/Buffer;Ljava/io/InputStream;J)Lkotlinx/io/Buffer;", "p0", "p1", "", "p2", "", "Camera2StreamConfigurationMap", "(Lkotlinx/io/Buffer;Ljava/io/InputStream;JZ)V", "Ljava/io/OutputStream;", "out", "readTo", "(Lkotlinx/io/Buffer;Ljava/io/OutputStream;J)V", "startIndex", "endIndex", "copyTo", "(Lkotlinx/io/Buffer;Ljava/io/OutputStream;JJ)V", "Ljava/nio/ByteBuffer;", "sink", "", "readAtMostTo", "(Lkotlinx/io/Buffer;Ljava/nio/ByteBuffer;)I", "source", "(Lkotlinx/io/Buffer;Ljava/nio/ByteBuffer;)Lkotlinx/io/Buffer;", "Ljava/nio/channels/ByteChannel;", "asByteChannel", "(Lkotlinx/io/Buffer;)Ljava/nio/channels/ByteChannel;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BuffersJvmKt {
    public static final kotlinx.io.Buffer transferFrom(kotlinx.io.Buffer buffer, java.io.InputStream inputStream) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputStream, "");
        Camera2StreamConfigurationMap(buffer, inputStream, Long.MAX_VALUE, true);
        return buffer;
    }

    public static final kotlinx.io.Buffer write(kotlinx.io.Buffer buffer, java.io.InputStream inputStream, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputStream, "");
        if (j >= 0) {
            Camera2StreamConfigurationMap(buffer, inputStream, j, false);
            return buffer;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("byteCount (");
        sb.append(j);
        sb.append(") < 0");
        throw new java.lang.IllegalArgumentException(sb.toString().toString());
    }

    private static final void Camera2StreamConfigurationMap(kotlinx.io.Buffer buffer, java.io.InputStream inputStream, long j, boolean z) {
        long j2 = j;
        boolean z2 = false;
        while (!z2) {
            if (j2 <= 0 && !z) {
                return;
            }
            kotlinx.io.unsafe.UnsafeBufferOperations unsafeBufferOperations = kotlinx.io.unsafe.UnsafeBufferOperations.INSTANCE;
            kotlinx.io.Segment writableSegment = buffer.writableSegment(1);
            byte[] dataAsByteArray = writableSegment.dataAsByteArray(false);
            int read = inputStream.read(dataAsByteArray, writableSegment.getLimit(), (int) java.lang.Math.min(j2, dataAsByteArray.length - r7));
            if (read != -1) {
                j2 -= read;
            } else {
                if (!z) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Stream exhausted before ");
                    sb.append(j);
                    sb.append(" bytes were read.");
                    throw new java.io.EOFException(sb.toString());
                }
                read = 0;
                z2 = true;
            }
            if (read == 1) {
                writableSegment.writeBackData(dataAsByteArray, read);
                writableSegment.setLimit(writableSegment.getLimit() + read);
                buffer.setSizeMut(buffer.getSizeMut() + read);
            } else {
                if (read < 0 || read > writableSegment.getRemainingCapacity()) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Invalid number of bytes written: ");
                    sb2.append(read);
                    sb2.append(". Should be in 0..");
                    sb2.append(writableSegment.getRemainingCapacity());
                    throw new java.lang.IllegalStateException(sb2.toString().toString());
                }
                if (read != 0) {
                    writableSegment.writeBackData(dataAsByteArray, read);
                    writableSegment.setLimit(writableSegment.getLimit() + read);
                    buffer.setSizeMut(buffer.getSizeMut() + read);
                } else if (kotlinx.io.SegmentKt.isEmpty(writableSegment)) {
                    buffer.recycleTail();
                }
            }
        }
    }

    public static /* synthetic */ void readTo$default(kotlinx.io.Buffer buffer, java.io.OutputStream outputStream, long j, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = buffer.getSizeMut();
        }
        readTo(buffer, outputStream, j);
    }

    public static final void readTo(kotlinx.io.Buffer buffer, java.io.OutputStream outputStream, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outputStream, "");
        kotlinx.io._UtilKt.checkOffsetAndCount(buffer.getSizeMut(), 0L, j);
        while (j > 0) {
            kotlinx.io.unsafe.UnsafeBufferOperations unsafeBufferOperations = kotlinx.io.unsafe.UnsafeBufferOperations.INSTANCE;
            if (buffer.exhausted()) {
                throw new java.lang.IllegalArgumentException("Buffer is empty".toString());
            }
            kotlinx.io.Segment head = buffer.getHead();
            kotlin.jvm.internal.Intrinsics.checkNotNull(head);
            byte[] dataAsByteArray = head.dataAsByteArray(true);
            int pos = head.getPos();
            int min = (int) java.lang.Math.min(j, head.getLimit() - pos);
            outputStream.write(dataAsByteArray, pos, min);
            long j2 = min;
            j -= j2;
            if (min != 0) {
                if (min < 0) {
                    throw new java.lang.IllegalStateException("Returned negative read bytes count");
                }
                if (min > head.getSize()) {
                    throw new java.lang.IllegalStateException("Returned too many bytes");
                }
                buffer.skip(j2);
            }
        }
    }

    public static /* synthetic */ void copyTo$default(kotlinx.io.Buffer buffer, java.io.OutputStream outputStream, long j, long j2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = buffer.getSizeMut();
        }
        copyTo(buffer, outputStream, j3, j2);
    }

    public static final void copyTo(kotlinx.io.Buffer buffer, java.io.OutputStream outputStream, long j, long j2) {
        kotlinx.io.unsafe.BufferIterationContext bufferIterationContext;
        kotlinx.io.unsafe.BufferIterationContext bufferIterationContext2;
        kotlinx.io.unsafe.BufferIterationContext bufferIterationContext3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outputStream, "");
        kotlinx.io._UtilKt.checkBounds(buffer.getSizeMut(), j, j2);
        if (j != j2) {
            long j3 = j2 - j;
            kotlinx.io.unsafe.UnsafeBufferOperations unsafeBufferOperations = kotlinx.io.unsafe.UnsafeBufferOperations.INSTANCE;
            if (j < 0) {
                throw new java.lang.IllegalArgumentException("Offset must be non-negative: ".concat(java.lang.String.valueOf(j)).toString());
            }
            if (j >= buffer.getSizeMut()) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Offset should be less than buffer's size (");
                sb.append(buffer.getSizeMut());
                sb.append("): ");
                sb.append(j);
                throw new java.lang.IndexOutOfBoundsException(sb.toString());
            }
            if (buffer.getHead() == null) {
                bufferIterationContext3 = kotlinx.io.unsafe.UnsafeBufferOperationsKt.BufferIterationContextImpl;
                kotlinx.io.Segment segment = null;
                kotlin.jvm.internal.Intrinsics.checkNotNull(null);
                int i = (int) (j + 1);
                while (j3 > 0) {
                    byte[] dataAsByteArray = segment.dataAsByteArray(true);
                    int pos = segment.getPos();
                    int min = (int) java.lang.Math.min((segment.getLimit() - pos) - i, j3);
                    outputStream.write(dataAsByteArray, pos + i, min);
                    j3 -= min;
                    segment = bufferIterationContext3.next(segment);
                    if (segment == null) {
                        return;
                    } else {
                        i = 0;
                    }
                }
                return;
            }
            if (buffer.getSizeMut() - j < j) {
                kotlinx.io.Segment tail = buffer.getTail();
                long sizeMut = buffer.getSizeMut();
                while (tail != null && sizeMut > j) {
                    sizeMut -= tail.getLimit() - tail.getPos();
                    if (sizeMut <= j) {
                        break;
                    } else {
                        tail = tail.getPrev();
                    }
                }
                bufferIterationContext2 = kotlinx.io.unsafe.UnsafeBufferOperationsKt.BufferIterationContextImpl;
                kotlin.jvm.internal.Intrinsics.checkNotNull(tail);
                int i2 = (int) (j - sizeMut);
                while (j3 > 0) {
                    byte[] dataAsByteArray2 = tail.dataAsByteArray(true);
                    int pos2 = tail.getPos();
                    int min2 = (int) java.lang.Math.min((tail.getLimit() - pos2) - i2, j3);
                    outputStream.write(dataAsByteArray2, pos2 + i2, min2);
                    j3 -= min2;
                    tail = bufferIterationContext2.next(tail);
                    if (tail == null) {
                        return;
                    } else {
                        i2 = 0;
                    }
                }
                return;
            }
            kotlinx.io.Segment head = buffer.getHead();
            long j4 = 0;
            while (head != null) {
                long limit = (head.getLimit() - head.getPos()) + j4;
                if (limit > j) {
                    break;
                }
                head = head.getNext();
                j4 = limit;
            }
            bufferIterationContext = kotlinx.io.unsafe.UnsafeBufferOperationsKt.BufferIterationContextImpl;
            kotlin.jvm.internal.Intrinsics.checkNotNull(head);
            int i3 = (int) (j - j4);
            while (j3 > 0) {
                byte[] dataAsByteArray3 = head.dataAsByteArray(true);
                int pos3 = head.getPos();
                int min3 = (int) java.lang.Math.min((head.getLimit() - pos3) - i3, j3);
                outputStream.write(dataAsByteArray3, pos3 + i3, min3);
                j3 -= min3;
                head = bufferIterationContext.next(head);
                if (head == null) {
                    return;
                } else {
                    i3 = 0;
                }
            }
        }
    }

    public static final int readAtMostTo(kotlinx.io.Buffer buffer, java.nio.ByteBuffer byteBuffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (buffer.exhausted()) {
            return -1;
        }
        kotlinx.io.unsafe.UnsafeBufferOperations unsafeBufferOperations = kotlinx.io.unsafe.UnsafeBufferOperations.INSTANCE;
        if (buffer.exhausted()) {
            throw new java.lang.IllegalArgumentException("Buffer is empty".toString());
        }
        kotlinx.io.Segment head = buffer.getHead();
        kotlin.jvm.internal.Intrinsics.checkNotNull(head);
        byte[] dataAsByteArray = head.dataAsByteArray(true);
        int pos = head.getPos();
        int min = java.lang.Math.min(byteBuffer.remaining(), head.getLimit() - pos);
        byteBuffer.put(dataAsByteArray, pos, min);
        if (min == 0) {
            return min;
        }
        if (min < 0) {
            throw new java.lang.IllegalStateException("Returned negative read bytes count");
        }
        if (min > head.getSize()) {
            throw new java.lang.IllegalStateException("Returned too many bytes");
        }
        buffer.skip(min);
        return min;
    }

    public static final kotlinx.io.Buffer transferFrom(kotlinx.io.Buffer buffer, java.nio.ByteBuffer byteBuffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteBuffer, "");
        int remaining = byteBuffer.remaining();
        while (remaining > 0) {
            kotlinx.io.unsafe.UnsafeBufferOperations unsafeBufferOperations = kotlinx.io.unsafe.UnsafeBufferOperations.INSTANCE;
            kotlinx.io.Segment writableSegment = buffer.writableSegment(1);
            byte[] dataAsByteArray = writableSegment.dataAsByteArray(false);
            int limit = writableSegment.getLimit();
            int min = java.lang.Math.min(remaining, dataAsByteArray.length - limit);
            byteBuffer.get(dataAsByteArray, limit, min);
            remaining -= min;
            if (min == 1) {
                writableSegment.writeBackData(dataAsByteArray, min);
                writableSegment.setLimit(writableSegment.getLimit() + min);
                buffer.setSizeMut(buffer.getSizeMut() + min);
            } else {
                if (min < 0 || min > writableSegment.getRemainingCapacity()) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid number of bytes written: ");
                    sb.append(min);
                    sb.append(". Should be in 0..");
                    sb.append(writableSegment.getRemainingCapacity());
                    throw new java.lang.IllegalStateException(sb.toString().toString());
                }
                if (min != 0) {
                    writableSegment.writeBackData(dataAsByteArray, min);
                    writableSegment.setLimit(writableSegment.getLimit() + min);
                    buffer.setSizeMut(buffer.getSizeMut() + min);
                } else if (kotlinx.io.SegmentKt.isEmpty(writableSegment)) {
                    buffer.recycleTail();
                }
            }
        }
        return buffer;
    }

    public static final java.nio.channels.ByteChannel asByteChannel(final kotlinx.io.Buffer buffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        return new java.nio.channels.ByteChannel() { // from class: kotlinx.io.BuffersJvmKt$asByteChannel$1
            @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
            }

            @Override // java.nio.channels.Channel
            public final boolean isOpen() {
                return true;
            }

            @Override // java.nio.channels.ReadableByteChannel
            public final int read(java.nio.ByteBuffer sink) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
                return kotlinx.io.BuffersJvmKt.readAtMostTo(kotlinx.io.Buffer.this, sink);
            }

            @Override // java.nio.channels.WritableByteChannel
            public final int write(java.nio.ByteBuffer source) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
                long sizeMut = kotlinx.io.Buffer.this.getSizeMut();
                kotlinx.io.BuffersJvmKt.transferFrom(kotlinx.io.Buffer.this, source);
                return (int) (kotlinx.io.Buffer.this.getSizeMut() - sizeMut);
            }
        };
    }
}
