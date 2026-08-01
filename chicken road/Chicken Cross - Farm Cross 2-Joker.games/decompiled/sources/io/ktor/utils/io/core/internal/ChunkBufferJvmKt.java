package io.ktor.utils.io.core.internal;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.io.Buffer;
import kotlinx.io.Segment;
import kotlinx.io.SegmentKt;
import kotlinx.io.unsafe.UnsafeBufferOperations;

/* compiled from: ChunkBufferJvm.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a-\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a%\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlinx/io/Buffer;", "", "min", "Lkotlin/Function1;", "Ljava/nio/ByteBuffer;", "", "block", "writeDirect", "(Lkotlinx/io/Buffer;ILkotlin/jvm/functions/Function1;)V", "readDirect", "(Lkotlinx/io/Buffer;Lkotlin/jvm/functions/Function1;)V", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ChunkBufferJvmKt {
    public static final void writeDirect(Buffer buffer, int i, Function1<? super ByteBuffer, Unit> block) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        UnsafeBufferOperations unsafeBufferOperations = UnsafeBufferOperations.INSTANCE;
        Buffer bufferField = buffer.getBufferField();
        Segment writableSegment = bufferField.writableSegment(i);
        byte[] dataAsByteArray = writableSegment.dataAsByteArray(false);
        int limit = writableSegment.getLimit();
        ByteBuffer wrap = ByteBuffer.wrap(dataAsByteArray, limit, dataAsByteArray.length - limit);
        Intrinsics.checkNotNull(wrap);
        block.invoke(wrap);
        int position = wrap.position() - limit;
        if (position == i) {
            writableSegment.writeBackData(dataAsByteArray, position);
            writableSegment.setLimit(writableSegment.getLimit() + position);
            bufferField.setSizeMut(bufferField.getSizeMut() + position);
        } else {
            if (position < 0 || position > writableSegment.getRemainingCapacity()) {
                throw new IllegalStateException(("Invalid number of bytes written: " + position + ". Should be in 0.." + writableSegment.getRemainingCapacity()).toString());
            }
            if (position != 0) {
                writableSegment.writeBackData(dataAsByteArray, position);
                writableSegment.setLimit(writableSegment.getLimit() + position);
                bufferField.setSizeMut(bufferField.getSizeMut() + position);
            } else if (SegmentKt.isEmpty(writableSegment)) {
                bufferField.recycleTail();
            }
        }
    }

    public static final void readDirect(Buffer buffer, Function1<? super ByteBuffer, Unit> block) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        UnsafeBufferOperations unsafeBufferOperations = UnsafeBufferOperations.INSTANCE;
        Buffer bufferField = buffer.getBufferField();
        if (bufferField.exhausted()) {
            throw new IllegalArgumentException("Buffer is empty".toString());
        }
        Segment head = bufferField.getHead();
        Intrinsics.checkNotNull(head);
        byte[] dataAsByteArray = head.dataAsByteArray(true);
        int pos = head.getPos();
        ByteBuffer wrap = ByteBuffer.wrap(dataAsByteArray, pos, head.getLimit() - pos);
        Intrinsics.checkNotNull(wrap);
        block.invoke(wrap);
        int position = wrap.position() - pos;
        if (position != 0) {
            if (position < 0) {
                throw new IllegalStateException("Returned negative read bytes count");
            }
            if (position > head.getSize()) {
                throw new IllegalStateException("Returned too many bytes");
            }
            bufferField.skip(position);
        }
    }
}
