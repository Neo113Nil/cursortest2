package kotlinx.io.unsafe;

/* compiled from: UnsafeBufferOperations.kt */
@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u0005Jn\u0010\u0010\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2K\u0010\u0011\u001aG\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00050\u0012H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001J;\u0010\u0010\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00050\u0017H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001Jv\u0010\u001a\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u00052K\u0010\u001c\u001aG\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00050\u0012H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0003 \u0001Ja\u0010\u001a\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000526\u0010\u001c\u001a2\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00050\u0017H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0003 \u0001J[\u0010 \u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b28\u0010!\u001a4\u0012\u0013\u0012\u00110\"¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001e\u0012\u0015\u0012\u0013\u0018\u00010\u0019¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\t0\u0017H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001Jx\u0010 \u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020%2M\u0010!\u001aI\u0012\u0013\u0012\u00110\"¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001e\u0012\u0015\u0012\u0013\u0018\u00010\u0019¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(&\u0012\u0013\u0012\u00110%¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b('\u0012\u0004\u0012\u00020\t0\u0012H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0003 \u0001JL\u0010(\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b26\u0010)\u001a2\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\t0\u0017H\u0086\bø\u0001\u0000R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006*"}, d2 = {"Lkotlinx/io/unsafe/UnsafeBufferOperations;", "", "<init>", "()V", "maxSafeWriteCapacity", "", "getMaxSafeWriteCapacity", "()I", "moveToTail", "", "buffer", "Lkotlinx/io/Buffer;", "bytes", "", "startIndex", "endIndex", "readFromHead", "readAction", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "startIndexInclusive", "endIndexExclusive", "Lkotlin/Function2;", "Lkotlinx/io/unsafe/SegmentReadContext;", "Lkotlinx/io/Segment;", "writeToTail", "minimumCapacity", "writeAction", "Lkotlinx/io/unsafe/SegmentWriteContext;", "context", "tail", "iterate", "iterationAction", "Lkotlinx/io/unsafe/BufferIterationContext;", "head", "offset", "", com.ironsource.D1.i, "startOfTheSegmentOffset", "forEachSegment", "action", "kotlinx-io-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UnsafeBufferOperations {
    public static final kotlinx.io.unsafe.UnsafeBufferOperations INSTANCE = new kotlinx.io.unsafe.UnsafeBufferOperations();

    public final int getMaxSafeWriteCapacity() {
        return 8192;
    }

    private UnsafeBufferOperations() {
    }

    public static /* synthetic */ void moveToTail$default(kotlinx.io.unsafe.UnsafeBufferOperations unsafeBufferOperations, kotlinx.io.Buffer buffer, byte[] bArr, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = bArr.length;
        }
        unsafeBufferOperations.moveToTail(buffer, bArr, i, i2);
    }

    public final void moveToTail(kotlinx.io.Buffer buffer, byte[] bytes, int startIndex, int endIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "buffer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bytes, "bytes");
        kotlinx.io._UtilKt.checkBounds(bytes.length, startIndex, endIndex);
        kotlinx.io.Segment new$kotlinx_io_core = kotlinx.io.Segment.INSTANCE.new$kotlinx_io_core(bytes, startIndex, endIndex, kotlinx.io.AlwaysSharedCopyTracker.INSTANCE, false);
        kotlinx.io.Segment tail = buffer.getTail();
        if (tail == null) {
            buffer.setHead(new$kotlinx_io_core);
            buffer.setTail(new$kotlinx_io_core);
        } else {
            buffer.setTail(tail.push$kotlinx_io_core(new$kotlinx_io_core));
        }
        buffer.setSizeMut(buffer.getSizeMut() + (endIndex - startIndex));
    }

    public final int readFromHead(kotlinx.io.Buffer buffer, kotlin.jvm.functions.Function3<? super byte[], ? super java.lang.Integer, ? super java.lang.Integer, java.lang.Integer> readAction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "buffer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readAction, "readAction");
        if (!(!buffer.exhausted())) {
            throw new java.lang.IllegalArgumentException("Buffer is empty".toString());
        }
        kotlinx.io.Segment head = buffer.getHead();
        kotlin.jvm.internal.Intrinsics.checkNotNull(head);
        int intValue = readAction.invoke(head.dataAsByteArray(true), java.lang.Integer.valueOf(head.getPos()), java.lang.Integer.valueOf(head.getLimit())).intValue();
        if (intValue != 0) {
            if (intValue < 0) {
                throw new java.lang.IllegalStateException("Returned negative read bytes count");
            }
            if (intValue > head.getSize()) {
                throw new java.lang.IllegalStateException("Returned too many bytes");
            }
            buffer.skip(intValue);
        }
        return intValue;
    }

    public final int readFromHead(kotlinx.io.Buffer buffer, kotlin.jvm.functions.Function2<? super kotlinx.io.unsafe.SegmentReadContext, ? super kotlinx.io.Segment, java.lang.Integer> readAction) {
        kotlinx.io.unsafe.SegmentReadContext segmentReadContext;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "buffer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readAction, "readAction");
        if (!(!buffer.exhausted())) {
            throw new java.lang.IllegalArgumentException("Buffer is empty".toString());
        }
        kotlinx.io.Segment head = buffer.getHead();
        kotlin.jvm.internal.Intrinsics.checkNotNull(head);
        segmentReadContext = kotlinx.io.unsafe.UnsafeBufferOperationsKt.SegmentReadContextImpl;
        int intValue = readAction.invoke(segmentReadContext, head).intValue();
        if (intValue != 0) {
            if (intValue < 0) {
                throw new java.lang.IllegalStateException("Returned negative read bytes count");
            }
            if (intValue > head.getSize()) {
                throw new java.lang.IllegalStateException("Returned too many bytes");
            }
            buffer.skip(intValue);
        }
        return intValue;
    }

    public final int writeToTail(kotlinx.io.Buffer buffer, int minimumCapacity, kotlin.jvm.functions.Function3<? super byte[], ? super java.lang.Integer, ? super java.lang.Integer, java.lang.Integer> writeAction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "buffer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writeAction, "writeAction");
        kotlinx.io.Segment writableSegment = buffer.writableSegment(minimumCapacity);
        byte[] dataAsByteArray = writableSegment.dataAsByteArray(false);
        int intValue = writeAction.invoke(dataAsByteArray, java.lang.Integer.valueOf(writableSegment.getLimit()), java.lang.Integer.valueOf(dataAsByteArray.length)).intValue();
        if (intValue == minimumCapacity) {
            writableSegment.writeBackData(dataAsByteArray, intValue);
            writableSegment.setLimit(writableSegment.getLimit() + intValue);
            buffer.setSizeMut(buffer.getSizeMut() + intValue);
            return intValue;
        }
        if (intValue < 0 || intValue > writableSegment.getRemainingCapacity()) {
            throw new java.lang.IllegalStateException(("Invalid number of bytes written: " + intValue + ". Should be in 0.." + writableSegment.getRemainingCapacity()).toString());
        }
        if (intValue != 0) {
            writableSegment.writeBackData(dataAsByteArray, intValue);
            writableSegment.setLimit(writableSegment.getLimit() + intValue);
            buffer.setSizeMut(buffer.getSizeMut() + intValue);
            return intValue;
        }
        if (kotlinx.io.SegmentKt.isEmpty(writableSegment)) {
            buffer.recycleTail();
        }
        return intValue;
    }

    public final int writeToTail(kotlinx.io.Buffer buffer, int minimumCapacity, kotlin.jvm.functions.Function2<? super kotlinx.io.unsafe.SegmentWriteContext, ? super kotlinx.io.Segment, java.lang.Integer> writeAction) {
        kotlinx.io.unsafe.SegmentWriteContext segmentWriteContext;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "buffer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writeAction, "writeAction");
        kotlinx.io.Segment writableSegment = buffer.writableSegment(minimumCapacity);
        segmentWriteContext = kotlinx.io.unsafe.UnsafeBufferOperationsKt.SegmentWriteContextImpl;
        int intValue = writeAction.invoke(segmentWriteContext, writableSegment).intValue();
        if (intValue == minimumCapacity) {
            writableSegment.setLimit(writableSegment.getLimit() + intValue);
            buffer.setSizeMut(buffer.getSizeMut() + intValue);
            return intValue;
        }
        if (intValue < 0 || intValue > writableSegment.getRemainingCapacity()) {
            throw new java.lang.IllegalStateException(("Invalid number of bytes written: " + intValue + ". Should be in 0.." + writableSegment.getRemainingCapacity()).toString());
        }
        if (intValue != 0) {
            writableSegment.setLimit(writableSegment.getLimit() + intValue);
            buffer.setSizeMut(buffer.getSizeMut() + intValue);
            return intValue;
        }
        if (kotlinx.io.SegmentKt.isEmpty(writableSegment)) {
            buffer.recycleTail();
        }
        return intValue;
    }

    public final void iterate(kotlinx.io.Buffer buffer, kotlin.jvm.functions.Function2<? super kotlinx.io.unsafe.BufferIterationContext, ? super kotlinx.io.Segment, kotlin.Unit> iterationAction) {
        kotlinx.io.unsafe.BufferIterationContext bufferIterationContext;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "buffer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterationAction, "iterationAction");
        bufferIterationContext = kotlinx.io.unsafe.UnsafeBufferOperationsKt.BufferIterationContextImpl;
        iterationAction.invoke(bufferIterationContext, buffer.getHead());
    }

    public final void iterate(kotlinx.io.Buffer buffer, long offset, kotlin.jvm.functions.Function3<? super kotlinx.io.unsafe.BufferIterationContext, ? super kotlinx.io.Segment, ? super java.lang.Long, kotlin.Unit> iterationAction) {
        kotlinx.io.unsafe.BufferIterationContext bufferIterationContext;
        kotlinx.io.unsafe.BufferIterationContext bufferIterationContext2;
        kotlinx.io.unsafe.BufferIterationContext bufferIterationContext3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "buffer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterationAction, "iterationAction");
        long j = 0;
        if (offset < 0) {
            throw new java.lang.IllegalArgumentException(("Offset must be non-negative: " + offset).toString());
        }
        if (offset >= buffer.getSizeMut()) {
            throw new java.lang.IndexOutOfBoundsException("Offset should be less than buffer's size (" + buffer.getSizeMut() + "): " + offset);
        }
        if (buffer.getHead() == null) {
            bufferIterationContext3 = kotlinx.io.unsafe.UnsafeBufferOperationsKt.BufferIterationContextImpl;
            iterationAction.invoke(bufferIterationContext3, null, -1L);
            return;
        }
        if (buffer.getSizeMut() - offset < offset) {
            kotlinx.io.Segment tail = buffer.getTail();
            long sizeMut = buffer.getSizeMut();
            while (tail != null && sizeMut > offset) {
                sizeMut -= tail.getLimit() - tail.getPos();
                if (sizeMut <= offset) {
                    break;
                } else {
                    tail = tail.getPrev();
                }
            }
            bufferIterationContext2 = kotlinx.io.unsafe.UnsafeBufferOperationsKt.BufferIterationContextImpl;
            iterationAction.invoke(bufferIterationContext2, tail, java.lang.Long.valueOf(sizeMut));
            return;
        }
        kotlinx.io.Segment head = buffer.getHead();
        while (head != null) {
            long limit = (head.getLimit() - head.getPos()) + j;
            if (limit > offset) {
                break;
            }
            head = head.getNext();
            j = limit;
        }
        bufferIterationContext = kotlinx.io.unsafe.UnsafeBufferOperationsKt.BufferIterationContextImpl;
        iterationAction.invoke(bufferIterationContext, head, java.lang.Long.valueOf(j));
    }

    public final void forEachSegment(kotlinx.io.Buffer buffer, kotlin.jvm.functions.Function2<? super kotlinx.io.unsafe.SegmentReadContext, ? super kotlinx.io.Segment, kotlin.Unit> action) {
        kotlinx.io.unsafe.SegmentReadContext segmentReadContext;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "buffer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        for (kotlinx.io.Segment head = buffer.getHead(); head != null; head = head.getNext()) {
            segmentReadContext = kotlinx.io.unsafe.UnsafeBufferOperationsKt.SegmentReadContextImpl;
            action.invoke(segmentReadContext, head);
        }
    }
}
