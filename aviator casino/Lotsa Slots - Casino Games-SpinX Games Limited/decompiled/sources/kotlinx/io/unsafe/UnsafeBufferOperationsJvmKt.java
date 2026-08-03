package kotlinx.io.unsafe;

/* compiled from: UnsafeBufferOperationsJvm.kt */
@kotlin.Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001\u001aA\u0010\t\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0003 \u0001\u001az\u0010\f\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000f2>\u0010\u0005\u001a:\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000f¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\r0\u0010H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0003 \u0001¢\u0006\u0002\u0010\u0014\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0015"}, d2 = {"readFromHead", "", "Lkotlinx/io/unsafe/UnsafeBufferOperations;", "buffer", "Lkotlinx/io/Buffer;", "readAction", "Lkotlin/Function1;", "Ljava/nio/ByteBuffer;", "", "writeToTail", "minimumCapacity", "writeAction", "readBulk", "", "iovec", "", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "iovecSize", "(Lkotlinx/io/unsafe/UnsafeBufferOperations;Lkotlinx/io/Buffer;[Ljava/nio/ByteBuffer;Lkotlin/jvm/functions/Function2;)J", "kotlinx-io-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UnsafeBufferOperationsJvmKt {
    public static final long readBulk(kotlinx.io.unsafe.UnsafeBufferOperations unsafeBufferOperations, kotlinx.io.Buffer buffer, java.nio.ByteBuffer[] iovec, kotlin.jvm.functions.Function2<? super java.nio.ByteBuffer[], ? super java.lang.Integer, java.lang.Long> readAction) {
        int i;
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unsafeBufferOperations, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "buffer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iovec, "iovec");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readAction, "readAction");
        kotlinx.io.Segment head = buffer.getHead();
        if (head == null) {
            throw new java.lang.IllegalArgumentException("buffer is empty.");
        }
        if (iovec.length == 0) {
            throw new java.lang.IllegalArgumentException("iovec is empty.");
        }
        long j = 0;
        while (true) {
            int pos = head.getPos();
            int limit = head.getLimit() - pos;
            i2 = i + 1;
            iovec[i] = java.nio.ByteBuffer.wrap(head.dataAsByteArray(true), pos, limit).slice().asReadOnlyBuffer();
            j += limit;
            head = head.getNext();
            i = (head != null && i2 < iovec.length) ? i2 : 0;
        }
        long longValue = readAction.invoke(iovec, java.lang.Integer.valueOf(i2)).longValue();
        if (longValue != 0) {
            if (longValue < 0 || longValue > j) {
                throw new java.lang.IllegalStateException("readAction should return a value in range [0, " + j + "], but returned: " + longValue);
            }
            buffer.skip(longValue);
        }
        return longValue;
    }

    public static final int readFromHead(kotlinx.io.unsafe.UnsafeBufferOperations unsafeBufferOperations, kotlinx.io.Buffer buffer, kotlin.jvm.functions.Function1<? super java.nio.ByteBuffer, kotlin.Unit> readAction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unsafeBufferOperations, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "buffer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readAction, "readAction");
        if (!(!buffer.exhausted())) {
            throw new java.lang.IllegalArgumentException("Buffer is empty".toString());
        }
        kotlinx.io.Segment head = buffer.getHead();
        kotlin.jvm.internal.Intrinsics.checkNotNull(head);
        byte[] dataAsByteArray = head.dataAsByteArray(true);
        int pos = head.getPos();
        java.nio.ByteBuffer asReadOnlyBuffer = java.nio.ByteBuffer.wrap(dataAsByteArray, pos, head.getLimit() - pos).slice().asReadOnlyBuffer();
        kotlin.jvm.internal.Intrinsics.checkNotNull(asReadOnlyBuffer);
        readAction.invoke(asReadOnlyBuffer);
        int position = asReadOnlyBuffer.position();
        if (position != 0) {
            if (position < 0) {
                throw new java.lang.IllegalStateException("Returned negative read bytes count");
            }
            if (position > head.getSize()) {
                throw new java.lang.IllegalStateException("Returned too many bytes");
            }
            buffer.skip(position);
        }
        return position;
    }

    public static final int writeToTail(kotlinx.io.unsafe.UnsafeBufferOperations unsafeBufferOperations, kotlinx.io.Buffer buffer, int i, kotlin.jvm.functions.Function1<? super java.nio.ByteBuffer, kotlin.Unit> writeAction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unsafeBufferOperations, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "buffer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writeAction, "writeAction");
        kotlinx.io.Segment writableSegment = buffer.writableSegment(i);
        byte[] dataAsByteArray = writableSegment.dataAsByteArray(false);
        int limit = writableSegment.getLimit();
        java.nio.ByteBuffer slice = java.nio.ByteBuffer.wrap(dataAsByteArray, limit, dataAsByteArray.length - limit).slice();
        kotlin.jvm.internal.Intrinsics.checkNotNull(slice);
        writeAction.invoke(slice);
        int position = slice.position();
        if (position == i) {
            writableSegment.writeBackData(dataAsByteArray, position);
            writableSegment.setLimit(writableSegment.getLimit() + position);
            buffer.setSizeMut(buffer.getSizeMut() + position);
        } else {
            if (position < 0 || position > writableSegment.getRemainingCapacity()) {
                throw new java.lang.IllegalStateException(("Invalid number of bytes written: " + position + ". Should be in 0.." + writableSegment.getRemainingCapacity()).toString());
            }
            if (position != 0) {
                writableSegment.writeBackData(dataAsByteArray, position);
                writableSegment.setLimit(writableSegment.getLimit() + position);
                buffer.setSizeMut(buffer.getSizeMut() + position);
            } else if (kotlinx.io.SegmentKt.isEmpty(writableSegment)) {
                buffer.recycleTail();
            }
        }
        return position;
    }
}
