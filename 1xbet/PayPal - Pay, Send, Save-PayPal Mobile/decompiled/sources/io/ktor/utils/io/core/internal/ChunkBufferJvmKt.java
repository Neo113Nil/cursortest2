package io.ktor.utils.io.core.internal;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a-\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a%\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lkotlinx/io/Buffer;", "", com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MIN_KEY, "Lkotlin/Function1;", "Ljava/nio/ByteBuffer;", "", "block", "writeDirect", "(Lkotlinx/io/Buffer;ILkotlin/jvm/functions/Function1;)V", "readDirect", "(Lkotlinx/io/Buffer;Lkotlin/jvm/functions/Function1;)V"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ChunkBufferJvmKt {
    public static final void writeDirect(kotlinx.io.Buffer buffer, int i, kotlin.jvm.functions.Function1<? super java.nio.ByteBuffer, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlinx.io.unsafe.UnsafeBufferOperations unsafeBufferOperations = kotlinx.io.unsafe.UnsafeBufferOperations.INSTANCE;
        kotlinx.io.Buffer getHighSpeedVideoFpsRanges = buffer.getGetHighSpeedVideoFpsRanges();
        kotlinx.io.Segment writableSegment = getHighSpeedVideoFpsRanges.writableSegment(i);
        byte[] dataAsByteArray = writableSegment.dataAsByteArray(false);
        int limit = writableSegment.getLimit();
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(dataAsByteArray, limit, dataAsByteArray.length - limit);
        kotlin.jvm.internal.Intrinsics.checkNotNull(wrap);
        function1.invoke(wrap);
        int position = wrap.position() - limit;
        if (position == i) {
            writableSegment.writeBackData(dataAsByteArray, position);
            writableSegment.setLimit(writableSegment.getLimit() + position);
            getHighSpeedVideoFpsRanges.setSizeMut(getHighSpeedVideoFpsRanges.getSizeMut() + position);
            return;
        }
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
            getHighSpeedVideoFpsRanges.setSizeMut(getHighSpeedVideoFpsRanges.getSizeMut() + position);
        } else if (kotlinx.io.SegmentKt.isEmpty(writableSegment)) {
            getHighSpeedVideoFpsRanges.recycleTail();
        }
    }

    public static final void readDirect(kotlinx.io.Buffer buffer, kotlin.jvm.functions.Function1<? super java.nio.ByteBuffer, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlinx.io.unsafe.UnsafeBufferOperations unsafeBufferOperations = kotlinx.io.unsafe.UnsafeBufferOperations.INSTANCE;
        kotlinx.io.Buffer getHighSpeedVideoFpsRanges = buffer.getGetHighSpeedVideoFpsRanges();
        if (getHighSpeedVideoFpsRanges.exhausted()) {
            throw new java.lang.IllegalArgumentException("Buffer is empty".toString());
        }
        kotlinx.io.Segment head = getHighSpeedVideoFpsRanges.getHead();
        kotlin.jvm.internal.Intrinsics.checkNotNull(head);
        byte[] dataAsByteArray = head.dataAsByteArray(true);
        int pos = head.getPos();
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(dataAsByteArray, pos, head.getLimit() - pos);
        kotlin.jvm.internal.Intrinsics.checkNotNull(wrap);
        function1.invoke(wrap);
        int position = wrap.position() - pos;
        if (position != 0) {
            if (position < 0) {
                throw new java.lang.IllegalStateException("Returned negative read bytes count");
            }
            if (position > head.getSize()) {
                throw new java.lang.IllegalStateException("Returned too many bytes");
            }
            getHighSpeedVideoFpsRanges.skip(position);
        }
    }
}
