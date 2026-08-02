package kotlinx.io;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a-\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\n\u001a\u00020\u0001*\u00020\t¢\u0006\u0004\b\n\u0010\u000b\u001a\u0019\u0010\n\u001a\u00020\u0001*\u00020\t2\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\r\u001a#\u0010\u000f\u001a\u00020\u000e*\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010\u001a#\u0010\u000f\u001a\u00020\u000e*\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0012"}, d2 = {"Lkotlinx/io/Sink;", "Lkotlinx/io/bytestring/ByteString;", "byteString", "", "startIndex", "endIndex", "", "write", "(Lkotlinx/io/Sink;Lkotlinx/io/bytestring/ByteString;II)V", "Lkotlinx/io/Source;", "readByteString", "(Lkotlinx/io/Source;)Lkotlinx/io/bytestring/ByteString;", "byteCount", "(Lkotlinx/io/Source;I)Lkotlinx/io/bytestring/ByteString;", "", "indexOf", "(Lkotlinx/io/Source;Lkotlinx/io/bytestring/ByteString;J)J", "Lkotlinx/io/Buffer;", "(Lkotlinx/io/Buffer;Lkotlinx/io/bytestring/ByteString;J)J"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ByteStringsKt {
    public static /* synthetic */ void write$default(kotlinx.io.Sink sink, kotlinx.io.bytestring.ByteString byteString, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = byteString.getSize();
        }
        write(sink, byteString, i, i2);
    }

    public static final void write(kotlinx.io.Sink sink, kotlinx.io.bytestring.ByteString byteString, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        kotlinx.io._UtilKt.checkBounds(byteString.getSize(), i, i2);
        if (i2 == i) {
            return;
        }
        kotlinx.io.Buffer getHighResolutionOutputSizeshNQ4ISI = sink.getGetHighResolutionOutputSizeshNQ4ISI();
        kotlinx.io.bytestring.unsafe.UnsafeByteStringOperations unsafeByteStringOperations = kotlinx.io.bytestring.unsafe.UnsafeByteStringOperations.INSTANCE;
        byte[] getHighSpeedVideoFpsRanges = byteString.getGetHighSpeedVideoFpsRanges();
        while (i < i2) {
            kotlinx.io.unsafe.UnsafeBufferOperations unsafeBufferOperations = kotlinx.io.unsafe.UnsafeBufferOperations.INSTANCE;
            kotlinx.io.Segment writableSegment = getHighResolutionOutputSizeshNQ4ISI.writableSegment(1);
            byte[] dataAsByteArray = writableSegment.dataAsByteArray(false);
            int limit = writableSegment.getLimit();
            int min = java.lang.Math.min(i2 - i, dataAsByteArray.length - limit);
            int i3 = i + min;
            kotlin.collections.ArraysKt.copyInto(getHighSpeedVideoFpsRanges, dataAsByteArray, limit, i, i3);
            if (min == 1) {
                writableSegment.writeBackData(dataAsByteArray, min);
                writableSegment.setLimit(writableSegment.getLimit() + min);
                getHighResolutionOutputSizeshNQ4ISI.setSizeMut(getHighResolutionOutputSizeshNQ4ISI.getSizeMut() + min);
            } else {
                if (min < 0 || min > writableSegment.getRemainingCapacity()) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid number of bytes written: ");
                    sb.append(min);
                    sb.append(". Should be in 0..");
                    sb.append(writableSegment.getRemainingCapacity());
                    throw new java.lang.IllegalStateException(sb.toString().toString());
                }
                if (min != 0) {
                    writableSegment.writeBackData(dataAsByteArray, min);
                    writableSegment.setLimit(writableSegment.getLimit() + min);
                    getHighResolutionOutputSizeshNQ4ISI.setSizeMut(getHighResolutionOutputSizeshNQ4ISI.getSizeMut() + min);
                } else if (kotlinx.io.SegmentKt.isEmpty(writableSegment)) {
                    getHighResolutionOutputSizeshNQ4ISI.recycleTail();
                }
            }
            i = i3;
        }
        sink.hintEmit();
    }

    public static final kotlinx.io.bytestring.ByteString readByteString(kotlinx.io.Source source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        return kotlinx.io.bytestring.unsafe.UnsafeByteStringOperations.INSTANCE.wrapUnsafe(kotlinx.io.SourcesKt.readByteArray(source));
    }

    public static final kotlinx.io.bytestring.ByteString readByteString(kotlinx.io.Source source, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        return kotlinx.io.bytestring.unsafe.UnsafeByteStringOperations.INSTANCE.wrapUnsafe(kotlinx.io.SourcesKt.readByteArray(source, i));
    }

    public static /* synthetic */ long indexOf$default(kotlinx.io.Source source, kotlinx.io.bytestring.ByteString byteString, long j, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        return indexOf(source, byteString, j);
    }

    public static final long indexOf(kotlinx.io.Source source, kotlinx.io.bytestring.ByteString byteString, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        long max = java.lang.Math.max(0L, j);
        if (kotlinx.io.bytestring.ByteStringKt.isEmpty(byteString)) {
            source.request(max);
            return java.lang.Math.min(max, source.getGetHighResolutionOutputSizeshNQ4ISI().getSizeMut());
        }
        while (source.request(byteString.getSize() + max)) {
            long indexOf = indexOf(source.getGetHighResolutionOutputSizeshNQ4ISI(), byteString, max);
            if (indexOf >= 0) {
                return indexOf;
            }
            max = (source.getGetHighResolutionOutputSizeshNQ4ISI().getSizeMut() - byteString.getSize()) + 1;
        }
        return -1L;
    }

    public static /* synthetic */ long indexOf$default(kotlinx.io.Buffer buffer, kotlinx.io.bytestring.ByteString byteString, long j, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        return indexOf(buffer, byteString, j);
    }

    public static final long indexOf(kotlinx.io.Buffer buffer, kotlinx.io.bytestring.ByteString byteString, long j) {
        long j2;
        long j3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        long j4 = 0;
        long max = java.lang.Math.max(0L, java.lang.Math.min(j, buffer.getSizeMut()));
        if (kotlinx.io.bytestring.ByteStringKt.isEmpty(byteString)) {
            return max;
        }
        if (max > buffer.getSizeMut() - byteString.getSize()) {
            return -1L;
        }
        kotlinx.io.bytestring.unsafe.UnsafeByteStringOperations unsafeByteStringOperations = kotlinx.io.bytestring.unsafe.UnsafeByteStringOperations.INSTANCE;
        byte[] getHighSpeedVideoFpsRanges = byteString.getGetHighSpeedVideoFpsRanges();
        if (buffer.getHead() == null) {
            return -1L;
        }
        if (buffer.getSizeMut() - max < max) {
            kotlinx.io.Segment tail = buffer.getTail();
            long sizeMut = buffer.getSizeMut();
            while (tail != null && sizeMut > max) {
                sizeMut -= tail.getLimit() - tail.getPos();
                if (sizeMut <= max) {
                    break;
                }
                tail = tail.getPrev();
            }
            if (sizeMut == -1) {
                return -1L;
            }
            do {
                kotlin.jvm.internal.Intrinsics.checkNotNull(tail);
                int max2 = java.lang.Math.max((int) (max - sizeMut), 0);
                int indexOfBytesInbound = kotlinx.io.SegmentKt.indexOfBytesInbound(tail, getHighSpeedVideoFpsRanges, max2);
                if (indexOfBytesInbound == -1) {
                    int indexOfBytesOutbound = kotlinx.io.SegmentKt.indexOfBytesOutbound(tail, getHighSpeedVideoFpsRanges, java.lang.Math.max(max2, (tail.getSize() - getHighSpeedVideoFpsRanges.length) + 1));
                    if (indexOfBytesOutbound == -1) {
                        sizeMut += tail.getSize();
                        tail = tail.getNext();
                        if (tail == null) {
                            break;
                        }
                    } else {
                        j3 = indexOfBytesOutbound;
                    }
                } else {
                    j3 = indexOfBytesInbound;
                }
                return sizeMut + j3;
            } while (byteString.getSize() + sizeMut <= buffer.getSizeMut());
            return -1L;
        }
        kotlinx.io.Segment head = buffer.getHead();
        while (head != null) {
            long limit = (head.getLimit() - head.getPos()) + j4;
            if (limit > max) {
                break;
            }
            head = head.getNext();
            j4 = limit;
        }
        if (j4 == -1) {
            return -1L;
        }
        do {
            kotlin.jvm.internal.Intrinsics.checkNotNull(head);
            int max3 = java.lang.Math.max((int) (max - j4), 0);
            int indexOfBytesInbound2 = kotlinx.io.SegmentKt.indexOfBytesInbound(head, getHighSpeedVideoFpsRanges, max3);
            if (indexOfBytesInbound2 == -1) {
                int indexOfBytesOutbound2 = kotlinx.io.SegmentKt.indexOfBytesOutbound(head, getHighSpeedVideoFpsRanges, java.lang.Math.max(max3, (head.getSize() - getHighSpeedVideoFpsRanges.length) + 1));
                if (indexOfBytesOutbound2 == -1) {
                    j4 += head.getSize();
                    head = head.getNext();
                    if (head == null) {
                        break;
                    }
                } else {
                    j2 = indexOfBytesOutbound2;
                }
            } else {
                j2 = indexOfBytesInbound2;
            }
            return j4 + j2;
        } while (byteString.getSize() + j4 <= buffer.getSizeMut());
        return -1L;
    }
}
