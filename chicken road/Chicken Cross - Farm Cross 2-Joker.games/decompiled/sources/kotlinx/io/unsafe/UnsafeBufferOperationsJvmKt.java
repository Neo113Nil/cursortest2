package kotlinx.io.unsafe;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.io.Buffer;
import kotlinx.io.Segment;
import kotlinx.io.SegmentKt;

/* compiled from: UnsafeBufferOperationsJvm.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001\u001aA\u0010\t\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0003 \u0001\u001az\u0010\f\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000f2>\u0010\u0005\u001a:\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000f¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\r0\u0010H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0003 \u0001¢\u0006\u0002\u0010\u0014\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0015"}, d2 = {"readFromHead", "", "Lkotlinx/io/unsafe/UnsafeBufferOperations;", "buffer", "Lkotlinx/io/Buffer;", "readAction", "Lkotlin/Function1;", "Ljava/nio/ByteBuffer;", "", "writeToTail", "minimumCapacity", "writeAction", "readBulk", "", "iovec", "", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "iovecSize", "(Lkotlinx/io/unsafe/UnsafeBufferOperations;Lkotlinx/io/Buffer;[Ljava/nio/ByteBuffer;Lkotlin/jvm/functions/Function2;)J", "kotlinx-io-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UnsafeBufferOperationsJvmKt {
    public static final long readBulk(UnsafeBufferOperations unsafeBufferOperations, Buffer buffer, ByteBuffer[] iovec, Function2<? super ByteBuffer[], ? super Integer, Long> readAction) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(unsafeBufferOperations, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(iovec, "iovec");
        Intrinsics.checkNotNullParameter(readAction, "readAction");
        Segment head = buffer.getHead();
        if (head == null) {
            throw new IllegalArgumentException("buffer is empty.");
        }
        if (iovec.length == 0) {
            throw new IllegalArgumentException("iovec is empty.");
        }
        long j = 0;
        while (true) {
            int pos = head.getPos();
            int limit = head.getLimit() - pos;
            i2 = i + 1;
            iovec[i] = ByteBuffer.wrap(head.dataAsByteArray(true), pos, limit).slice().asReadOnlyBuffer();
            j += limit;
            head = head.getNext();
            i = (head != null && i2 < iovec.length) ? i2 : 0;
        }
        long longValue = readAction.invoke(iovec, Integer.valueOf(i2)).longValue();
        if (longValue != 0) {
            if (longValue < 0 || longValue > j) {
                throw new IllegalStateException("readAction should return a value in range [0, " + j + "], but returned: " + longValue);
            }
            buffer.skip(longValue);
        }
        return longValue;
    }

    public static final int readFromHead(UnsafeBufferOperations unsafeBufferOperations, Buffer buffer, Function1<? super ByteBuffer, Unit> readAction) {
        Intrinsics.checkNotNullParameter(unsafeBufferOperations, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(readAction, "readAction");
        if (buffer.exhausted()) {
            throw new IllegalArgumentException("Buffer is empty".toString());
        }
        Segment head = buffer.getHead();
        Intrinsics.checkNotNull(head);
        byte[] dataAsByteArray = head.dataAsByteArray(true);
        int pos = head.getPos();
        ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(dataAsByteArray, pos, head.getLimit() - pos).slice().asReadOnlyBuffer();
        Intrinsics.checkNotNull(asReadOnlyBuffer);
        readAction.invoke(asReadOnlyBuffer);
        int position = asReadOnlyBuffer.position();
        if (position != 0) {
            if (position < 0) {
                throw new IllegalStateException("Returned negative read bytes count");
            }
            if (position > head.getSize()) {
                throw new IllegalStateException("Returned too many bytes");
            }
            buffer.skip(position);
        }
        return position;
    }

    public static final int writeToTail(UnsafeBufferOperations unsafeBufferOperations, Buffer buffer, int i, Function1<? super ByteBuffer, Unit> writeAction) {
        Intrinsics.checkNotNullParameter(unsafeBufferOperations, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(writeAction, "writeAction");
        Segment writableSegment = buffer.writableSegment(i);
        byte[] dataAsByteArray = writableSegment.dataAsByteArray(false);
        int limit = writableSegment.getLimit();
        ByteBuffer slice = ByteBuffer.wrap(dataAsByteArray, limit, dataAsByteArray.length - limit).slice();
        Intrinsics.checkNotNull(slice);
        writeAction.invoke(slice);
        int position = slice.position();
        if (position == i) {
            writableSegment.writeBackData(dataAsByteArray, position);
            writableSegment.setLimit(writableSegment.getLimit() + position);
            buffer.setSizeMut(buffer.getSizeMut() + position);
        } else {
            if (position < 0 || position > writableSegment.getRemainingCapacity()) {
                throw new IllegalStateException(("Invalid number of bytes written: " + position + ". Should be in 0.." + writableSegment.getRemainingCapacity()).toString());
            }
            if (position != 0) {
                writableSegment.writeBackData(dataAsByteArray, position);
                writableSegment.setLimit(writableSegment.getLimit() + position);
                buffer.setSizeMut(buffer.getSizeMut() + position);
            } else if (SegmentKt.isEmpty(writableSegment)) {
                buffer.recycleTail();
            }
        }
        return position;
    }
}
