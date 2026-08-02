package io.ktor.utils.io;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u0006\u0010\u0005\u001a7\u0010\f\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\u0017\u0010\u000b\u001a\u0013\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\n\u0012\u0004\u0012\u00020\u00030\tH\u0086@¢\u0006\u0004\b\f\u0010\r\u001a/\u0010\u000e\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\t¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0019\u0010\u000e\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0001¢\u0006\u0004\b\u000e\u0010\u0011"}, d2 = {"Lio/ktor/utils/io/ByteWriteChannel;", "Ljava/nio/ByteBuffer;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "writeByteBuffer", "(Lio/ktor/utils/io/ByteWriteChannel;Ljava/nio/ByteBuffer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeFully", "", com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MIN_KEY, "Lkotlin/Function1;", "Lkotlin/ParameterName;", "block", "write", "(Lio/ktor/utils/io/ByteWriteChannel;ILkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeAvailable", "(Lio/ktor/utils/io/ByteWriteChannel;ILkotlin/jvm/functions/Function1;)I", "buffer", "(Lio/ktor/utils/io/ByteWriteChannel;Ljava/nio/ByteBuffer;)V"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ByteWriteChannelOperations_jvmKt {
    public static final java.lang.Object writeByteBuffer(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, java.nio.ByteBuffer byteBuffer, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.utils.io.core.OutputArraysJVMKt.writeByteBuffer(byteWriteChannel.getWriteBuffer(), byteBuffer);
        java.lang.Object flush = byteWriteChannel.flush(continuation);
        return flush == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? flush : kotlin.Unit.INSTANCE;
    }

    public static final java.lang.Object writeFully(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, java.nio.ByteBuffer byteBuffer, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.utils.io.core.OutputArraysJVMKt.writeByteBuffer(byteWriteChannel.getWriteBuffer(), byteBuffer);
        java.lang.Object flush = byteWriteChannel.flush(continuation);
        return flush == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? flush : kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object write$default(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, int i, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        return write(byteWriteChannel, i, function1, continuation);
    }

    public static final java.lang.Object write(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, int i, kotlin.jvm.functions.Function1<? super java.nio.ByteBuffer, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.io.unsafe.UnsafeBufferOperations unsafeBufferOperations = kotlinx.io.unsafe.UnsafeBufferOperations.INSTANCE;
        kotlinx.io.Buffer getHighResolutionOutputSizeshNQ4ISI = byteWriteChannel.getWriteBuffer().getGetHighResolutionOutputSizeshNQ4ISI();
        kotlinx.io.Segment writableSegment = getHighResolutionOutputSizeshNQ4ISI.writableSegment(i);
        byte[] dataAsByteArray = writableSegment.dataAsByteArray(false);
        int limit = writableSegment.getLimit();
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(dataAsByteArray, limit, dataAsByteArray.length - limit);
        kotlin.jvm.internal.Intrinsics.checkNotNull(wrap);
        function1.invoke(wrap);
        int position = wrap.position() - limit;
        if (position == i) {
            writableSegment.writeBackData(dataAsByteArray, position);
            writableSegment.setLimit(writableSegment.getLimit() + position);
            getHighResolutionOutputSizeshNQ4ISI.setSizeMut(getHighResolutionOutputSizeshNQ4ISI.getSizeMut() + position);
        } else {
            if (position < 0 || position > writableSegment.getRemainingCapacity()) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid number of bytes written: ");
                sb.append(position);
                sb.append(". Should be in 0..");
                sb.append(writableSegment.getRemainingCapacity());
                throw new java.lang.IllegalStateException(sb.toString().toString());
            }
            if (position != 0) {
                writableSegment.writeBackData(dataAsByteArray, position);
                writableSegment.setLimit(writableSegment.getLimit() + position);
                getHighResolutionOutputSizeshNQ4ISI.setSizeMut(getHighResolutionOutputSizeshNQ4ISI.getSizeMut() + position);
            } else if (kotlinx.io.SegmentKt.isEmpty(writableSegment)) {
                getHighResolutionOutputSizeshNQ4ISI.recycleTail();
            }
        }
        java.lang.Object flush = byteWriteChannel.flush(continuation);
        return flush == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? flush : kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ int writeAvailable$default(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, int i, kotlin.jvm.functions.Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        return writeAvailable(byteWriteChannel, i, function1);
    }

    public static final int writeAvailable(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, int i, kotlin.jvm.functions.Function1<? super java.nio.ByteBuffer, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteWriteChannel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("min should be positive".toString());
        }
        if (i > 1048576) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Min(");
            sb.append(i);
            sb.append(") shouldn't be greater than 1048576");
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        if (byteWriteChannel.isClosedForWrite()) {
            return -1;
        }
        kotlinx.io.unsafe.UnsafeBufferOperations unsafeBufferOperations = kotlinx.io.unsafe.UnsafeBufferOperations.INSTANCE;
        kotlinx.io.Buffer getHighResolutionOutputSizeshNQ4ISI = byteWriteChannel.getWriteBuffer().getGetHighResolutionOutputSizeshNQ4ISI();
        kotlinx.io.Segment writableSegment = getHighResolutionOutputSizeshNQ4ISI.writableSegment(i);
        byte[] dataAsByteArray = writableSegment.dataAsByteArray(false);
        int limit = writableSegment.getLimit();
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(dataAsByteArray, limit, dataAsByteArray.length - limit);
        kotlin.jvm.internal.Intrinsics.checkNotNull(wrap);
        function1.invoke(wrap);
        int position = wrap.position() - limit;
        int position2 = wrap.position() - limit;
        if (position2 == i) {
            writableSegment.writeBackData(dataAsByteArray, position2);
            writableSegment.setLimit(writableSegment.getLimit() + position2);
            getHighResolutionOutputSizeshNQ4ISI.setSizeMut(getHighResolutionOutputSizeshNQ4ISI.getSizeMut() + position2);
            return position;
        }
        if (position2 < 0 || position2 > writableSegment.getRemainingCapacity()) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Invalid number of bytes written: ");
            sb2.append(position2);
            sb2.append(". Should be in 0..");
            sb2.append(writableSegment.getRemainingCapacity());
            throw new java.lang.IllegalStateException(sb2.toString().toString());
        }
        if (position2 != 0) {
            writableSegment.writeBackData(dataAsByteArray, position2);
            writableSegment.setLimit(writableSegment.getLimit() + position2);
            getHighResolutionOutputSizeshNQ4ISI.setSizeMut(getHighResolutionOutputSizeshNQ4ISI.getSizeMut() + position2);
            return position;
        }
        if (kotlinx.io.SegmentKt.isEmpty(writableSegment)) {
            getHighResolutionOutputSizeshNQ4ISI.recycleTail();
        }
        return position;
    }

    public static final void writeAvailable(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, java.nio.ByteBuffer byteBuffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteWriteChannel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteBuffer, "");
        kotlinx.io.SinksJvmKt.write(byteWriteChannel.getWriteBuffer(), byteBuffer);
    }
}
