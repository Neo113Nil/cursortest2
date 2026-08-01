package kotlinx.io;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.io.bytestring.ByteString;
import kotlinx.io.bytestring.ByteStringBuilder;
import kotlinx.io.bytestring.ByteStringKt;
import kotlinx.io.unsafe.SegmentReadContext;
import kotlinx.io.unsafe.UnsafeBufferOperations;
import kotlinx.io.unsafe.UnsafeBufferOperationsKt;

/* compiled from: Buffers.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a&\u0010\u0003\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004¨\u0006\t"}, d2 = {"snapshot", "Lkotlinx/io/bytestring/ByteString;", "Lkotlinx/io/Buffer;", "indexOf", "", "byte", "", "startIndex", "endIndex", "kotlinx-io-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BuffersKt {
    public static final ByteString snapshot(Buffer buffer) {
        SegmentReadContext unused;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.getSizeMut() == 0) {
            return ByteStringKt.ByteString();
        }
        if (buffer.getSizeMut() > 2147483647L) {
            throw new IllegalStateException(("Buffer is too long (" + buffer.getSizeMut() + ") to be converted into a byte string.").toString());
        }
        ByteStringBuilder byteStringBuilder = new ByteStringBuilder((int) buffer.getSizeMut());
        UnsafeBufferOperations unsafeBufferOperations = UnsafeBufferOperations.INSTANCE;
        for (Segment head = buffer.getHead(); head != null; head = head.getNext()) {
            unused = UnsafeBufferOperationsKt.SegmentReadContextImpl;
            byteStringBuilder.append(head.dataAsByteArray(true), head.getPos(), head.getLimit());
        }
        return byteStringBuilder.toByteString();
    }

    public static /* synthetic */ long indexOf$default(Buffer buffer, byte b, long j, long j2, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = buffer.getSizeMut();
        }
        return indexOf(buffer, b, j3, j2);
    }

    public static final long indexOf(Buffer buffer, byte b, long j, long j2) {
        long j3;
        int indexOf;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        long min = Math.min(j2, buffer.getSizeMut());
        _UtilKt.checkBounds(buffer.getSizeMut(), j, min);
        if (j == min || buffer.getHead() == null) {
            return -1L;
        }
        if (buffer.getSizeMut() - j < j) {
            Segment tail = buffer.getTail();
            j3 = buffer.getSizeMut();
            while (tail != null && j3 > j) {
                j3 -= tail.getLimit() - tail.getPos();
                if (j3 <= j) {
                    break;
                }
                tail = tail.getPrev();
            }
            if (j3 == -1) {
                return -1L;
            }
            while (min > j3) {
                Intrinsics.checkNotNull(tail);
                indexOf = SegmentKt.indexOf(tail, b, Math.max((int) (j - j3), 0), Math.min(tail.getSize(), (int) (min - j3)));
                if (indexOf == -1) {
                    j3 += tail.getSize();
                    tail = tail.getNext();
                    if (tail == null || j3 >= min) {
                        return -1L;
                    }
                }
            }
            throw new IllegalStateException("Check failed.");
        }
        Segment head = buffer.getHead();
        j3 = 0;
        while (head != null) {
            long limit = (head.getLimit() - head.getPos()) + j3;
            if (limit > j) {
                break;
            }
            head = head.getNext();
            j3 = limit;
        }
        if (j3 == -1) {
            return -1L;
        }
        while (min > j3) {
            Intrinsics.checkNotNull(head);
            indexOf = SegmentKt.indexOf(head, b, Math.max((int) (j - j3), 0), Math.min(head.getSize(), (int) (min - j3)));
            if (indexOf == -1) {
                j3 += head.getSize();
                head = head.getNext();
                if (head == null || j3 >= min) {
                    return -1L;
                }
            }
        }
        throw new IllegalStateException("Check failed.");
        return j3 + indexOf;
    }
}
