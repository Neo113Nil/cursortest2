package kotlinx.io.unsafe;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u001a@\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\b\u0010\t\u001aH\u0010\f\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0003 \u0001¢\u0006\u0004\b\f\u0010\r\u001a|\u0010\u0015\u001a\u00020\u0014*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000e2>\u0010\u0006\u001a:\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000e¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\u0010H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0003 \u0001¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lkotlinx/io/unsafe/UnsafeBufferOperations;", "Lkotlinx/io/Buffer;", "buffer", "Lkotlin/Function1;", "Ljava/nio/ByteBuffer;", "", "readAction", "", "readFromHead", "(Lkotlinx/io/unsafe/UnsafeBufferOperations;Lkotlinx/io/Buffer;Lkotlin/jvm/functions/Function1;)I", "minimumCapacity", "writeAction", "writeToTail", "(Lkotlinx/io/unsafe/UnsafeBufferOperations;Lkotlinx/io/Buffer;ILkotlin/jvm/functions/Function1;)I", "", "iovec", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "iovecSize", "", "readBulk", "(Lkotlinx/io/unsafe/UnsafeBufferOperations;Lkotlinx/io/Buffer;[Ljava/nio/ByteBuffer;Lkotlin/jvm/functions/Function2;)J"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class UnsafeBufferOperationsJvmKt {
    public static final long readBulk(kotlinx.io.unsafe.UnsafeBufferOperations unsafeBufferOperations, kotlinx.io.Buffer buffer, java.nio.ByteBuffer[] byteBufferArr, kotlin.jvm.functions.Function2<? super java.nio.ByteBuffer[], ? super java.lang.Integer, java.lang.Long> function2) {
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unsafeBufferOperations, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteBufferArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        kotlinx.io.Segment head = buffer.getHead();
        if (head == null) {
            throw new java.lang.IllegalArgumentException("buffer is empty.");
        }
        if (byteBufferArr.length == 0) {
            throw new java.lang.IllegalArgumentException("iovec is empty.");
        }
        int i2 = 0;
        long j = 0;
        while (true) {
            int pos = head.getPos();
            int limit = head.getLimit() - pos;
            i = i2 + 1;
            byteBufferArr[i2] = java.nio.ByteBuffer.wrap(head.dataAsByteArray(true), pos, limit).slice().asReadOnlyBuffer();
            j += limit;
            head = head.getNext();
            if (head == null || i >= byteBufferArr.length) {
                break;
            }
            i2 = i;
        }
        long longValue = function2.invoke(byteBufferArr, java.lang.Integer.valueOf(i)).longValue();
        if (longValue == 0) {
            return longValue;
        }
        if (longValue < 0 || longValue > j) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("readAction should return a value in range [0, ");
            sb.append(j);
            sb.append("], but returned: ");
            sb.append(longValue);
            throw new java.lang.IllegalStateException(sb.toString());
        }
        buffer.skip(longValue);
        return longValue;
    }

    public static final int readFromHead(kotlinx.io.unsafe.UnsafeBufferOperations unsafeBufferOperations, kotlinx.io.Buffer buffer, kotlin.jvm.functions.Function1<? super java.nio.ByteBuffer, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unsafeBufferOperations, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        if (buffer.exhausted()) {
            throw new java.lang.IllegalArgumentException("Buffer is empty".toString());
        }
        kotlinx.io.Segment head = buffer.getHead();
        kotlin.jvm.internal.Intrinsics.checkNotNull(head);
        byte[] dataAsByteArray = head.dataAsByteArray(true);
        int pos = head.getPos();
        java.nio.ByteBuffer asReadOnlyBuffer = java.nio.ByteBuffer.wrap(dataAsByteArray, pos, head.getLimit() - pos).slice().asReadOnlyBuffer();
        kotlin.jvm.internal.Intrinsics.checkNotNull(asReadOnlyBuffer);
        function1.invoke(asReadOnlyBuffer);
        int position = asReadOnlyBuffer.position();
        if (position == 0) {
            return position;
        }
        if (position < 0) {
            throw new java.lang.IllegalStateException("Returned negative read bytes count");
        }
        if (position > head.getSize()) {
            throw new java.lang.IllegalStateException("Returned too many bytes");
        }
        buffer.skip(position);
        return position;
    }

    public static final int writeToTail(kotlinx.io.unsafe.UnsafeBufferOperations unsafeBufferOperations, kotlinx.io.Buffer buffer, int i, kotlin.jvm.functions.Function1<? super java.nio.ByteBuffer, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unsafeBufferOperations, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlinx.io.Segment writableSegment = buffer.writableSegment(i);
        byte[] dataAsByteArray = writableSegment.dataAsByteArray(false);
        int limit = writableSegment.getLimit();
        java.nio.ByteBuffer slice = java.nio.ByteBuffer.wrap(dataAsByteArray, limit, dataAsByteArray.length - limit).slice();
        kotlin.jvm.internal.Intrinsics.checkNotNull(slice);
        function1.invoke(slice);
        int position = slice.position();
        if (position == i) {
            writableSegment.writeBackData(dataAsByteArray, position);
            writableSegment.setLimit(writableSegment.getLimit() + position);
            buffer.setSizeMut(buffer.getSizeMut() + position);
            return position;
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
            buffer.setSizeMut(buffer.getSizeMut() + position);
            return position;
        }
        if (kotlinx.io.SegmentKt.isEmpty(writableSegment)) {
            buffer.recycleTail();
        }
        return position;
    }
}
