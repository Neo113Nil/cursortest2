package kotlinx.io;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a-\u0010\t\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lkotlinx/io/Buffer;", "Lkotlinx/io/bytestring/ByteString;", "snapshot", "(Lkotlinx/io/Buffer;)Lkotlinx/io/bytestring/ByteString;", "", "byte", "", "startIndex", "endIndex", "indexOf", "(Lkotlinx/io/Buffer;BJJ)J"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class BuffersKt {
    public static final kotlinx.io.bytestring.ByteString snapshot(kotlinx.io.Buffer buffer) {
        kotlinx.io.unsafe.SegmentReadContext unused;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        if (buffer.getSizeMut() == 0) {
            return kotlinx.io.bytestring.ByteStringKt.ByteString();
        }
        if (buffer.getSizeMut() > androidx.collection.SieveCacheKt.NodeLinkMask) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Buffer is too long (");
            sb.append(buffer.getSizeMut());
            sb.append(") to be converted into a byte string.");
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        kotlinx.io.bytestring.ByteStringBuilder byteStringBuilder = new kotlinx.io.bytestring.ByteStringBuilder((int) buffer.getSizeMut());
        kotlinx.io.unsafe.UnsafeBufferOperations unsafeBufferOperations = kotlinx.io.unsafe.UnsafeBufferOperations.INSTANCE;
        for (kotlinx.io.Segment head = buffer.getHead(); head != null; head = head.getNext()) {
            unused = kotlinx.io.unsafe.UnsafeBufferOperationsKt.SegmentReadContextImpl;
            byteStringBuilder.append(head.dataAsByteArray(true), head.getPos(), head.getLimit());
        }
        return byteStringBuilder.toByteString();
    }

    public static /* synthetic */ long indexOf$default(kotlinx.io.Buffer buffer, byte b, long j, long j2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = buffer.getSizeMut();
        }
        return indexOf(buffer, b, j3, j2);
    }

    public static final long indexOf(kotlinx.io.Buffer buffer, byte b, long j, long j2) {
        long j3;
        int indexOf;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        long min = java.lang.Math.min(j2, buffer.getSizeMut());
        kotlinx.io._UtilKt.checkBounds(buffer.getSizeMut(), j, min);
        if (j == min || buffer.getHead() == null) {
            return -1L;
        }
        if (buffer.getSizeMut() - j < j) {
            kotlinx.io.Segment tail = buffer.getTail();
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
                kotlin.jvm.internal.Intrinsics.checkNotNull(tail);
                indexOf = kotlinx.io.SegmentKt.indexOf(tail, b, java.lang.Math.max((int) (j - j3), 0), java.lang.Math.min(tail.getSize(), (int) (min - j3)));
                if (indexOf == -1) {
                    j3 += tail.getSize();
                    tail = tail.getNext();
                    if (tail == null || j3 >= min) {
                        return -1L;
                    }
                }
            }
            throw new java.lang.IllegalStateException("Check failed.");
        }
        kotlinx.io.Segment head = buffer.getHead();
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
            kotlin.jvm.internal.Intrinsics.checkNotNull(head);
            indexOf = kotlinx.io.SegmentKt.indexOf(head, b, java.lang.Math.max((int) (j - j3), 0), java.lang.Math.min(head.getSize(), (int) (min - j3)));
            if (indexOf == -1) {
                j3 += head.getSize();
                head = head.getNext();
                if (head == null || j3 >= min) {
                    return -1L;
                }
            }
        }
        throw new java.lang.IllegalStateException("Check failed.");
        return j3 + indexOf;
    }
}
