package io.ktor.utils.io.streams;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0011\u0010\u0005\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\n\u001a\u00020\t*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a*\u0010\n\u001a\u00020\t*\u00020\u00072\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\f¢\u0006\u0002\b\u000e¢\u0006\u0004\b\n\u0010\u0010\u001a\u001b\u0010\u0013\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0011\u0010\u0016\u001a\u00020\u0015*\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017"}, d2 = {"Ljava/io/InputStream;", "Lkotlinx/io/Source;", "Lio/ktor/utils/io/core/Input;", "asInput", "(Ljava/io/InputStream;)Lkotlinx/io/Source;", "inputStream", "(Lkotlinx/io/Source;)Ljava/io/InputStream;", "Ljava/io/OutputStream;", "packet", "", "writePacket", "(Ljava/io/OutputStream;Lkotlinx/io/Source;)V", "Lkotlin/Function1;", "Lkotlinx/io/Sink;", "Lkotlin/ExtensionFunctionType;", "block", "(Ljava/io/OutputStream;Lkotlin/jvm/functions/Function1;)V", "", com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MIN_KEY, "readPacketAtLeast", "(Ljava/io/InputStream;I)Lkotlinx/io/Source;", "Lio/ktor/utils/io/ByteWriteChannel;", "asByteWriteChannel", "(Ljava/io/OutputStream;)Lio/ktor/utils/io/ByteWriteChannel;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class StreamsKt {
    public static final kotlinx.io.Source asInput(java.io.InputStream inputStream) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputStream, "");
        return kotlinx.io.CoreKt.buffered(kotlinx.io.JvmCoreKt.asSource(inputStream));
    }

    public static final java.io.InputStream inputStream(kotlinx.io.Source source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        return kotlinx.io.SourcesJvmKt.asInputStream(source);
    }

    public static final void writePacket(java.io.OutputStream outputStream, kotlinx.io.Source source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outputStream, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        source.transferTo(kotlinx.io.JvmCoreKt.asSink(outputStream));
    }

    public static final void writePacket(java.io.OutputStream outputStream, kotlin.jvm.functions.Function1<? super kotlinx.io.Sink, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outputStream, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlinx.io.Buffer buffer = new kotlinx.io.Buffer();
        function1.invoke(buffer);
        writePacket(outputStream, buffer);
    }

    public static /* synthetic */ kotlinx.io.Source readPacketAtLeast$default(java.io.InputStream inputStream, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        return readPacketAtLeast(inputStream, i);
    }

    public static final kotlinx.io.Source readPacketAtLeast(java.io.InputStream inputStream, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputStream, "");
        kotlinx.io.Buffer buffer = new kotlinx.io.Buffer();
        kotlinx.io.unsafe.UnsafeBufferOperations unsafeBufferOperations = kotlinx.io.unsafe.UnsafeBufferOperations.INSTANCE;
        kotlinx.io.Segment writableSegment = buffer.writableSegment(i);
        byte[] dataAsByteArray = writableSegment.dataAsByteArray(false);
        int limit = writableSegment.getLimit();
        int read = inputStream.read(dataAsByteArray, limit, dataAsByteArray.length - limit);
        int i2 = read >= 0 ? read : 0;
        if (i2 == i) {
            writableSegment.writeBackData(dataAsByteArray, i2);
            writableSegment.setLimit(writableSegment.getLimit() + i2);
            buffer.setSizeMut(buffer.getSizeMut() + i2);
        } else {
            if (i2 < 0 || i2 > writableSegment.getRemainingCapacity()) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid number of bytes written: ");
                sb.append(i2);
                sb.append(". Should be in 0..");
                sb.append(writableSegment.getRemainingCapacity());
                throw new java.lang.IllegalStateException(sb.toString().toString());
            }
            if (i2 != 0) {
                writableSegment.writeBackData(dataAsByteArray, i2);
                writableSegment.setLimit(writableSegment.getLimit() + i2);
                buffer.setSizeMut(buffer.getSizeMut() + i2);
            } else if (kotlinx.io.SegmentKt.isEmpty(writableSegment)) {
                buffer.recycleTail();
            }
        }
        return buffer;
    }

    public static final io.ktor.utils.io.ByteWriteChannel asByteWriteChannel(java.io.OutputStream outputStream) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outputStream, "");
        return io.ktor.utils.io.SinkByteWriteChannelKt.asByteWriteChannel(kotlinx.io.JvmCoreKt.asSink(outputStream));
    }
}
