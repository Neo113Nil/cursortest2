package kotlinx.io;

/* compiled from: Segment.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0000\u001a\u001c\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a\u001c\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a\f\u0010\u000b\u001a\u00020\f*\u00020\u0002H\u0001¨\u0006\r"}, d2 = {"indexOf", "", "Lkotlinx/io/Segment;", "byte", "", "startOffset", "endOffset", "indexOfBytesInbound", "bytes", "", "indexOfBytesOutbound", "isEmpty", "", "kotlinx-io-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SegmentKt {
    public static final int indexOf(kotlinx.io.Segment segment, byte b, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(segment, "<this>");
        if (i < 0 || i >= segment.getSize()) {
            throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(i).toString());
        }
        if (i > i2 || i2 > segment.getSize()) {
            throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(i2).toString());
        }
        int pos = segment.getPos();
        byte[] dataAsByteArray = segment.dataAsByteArray(true);
        while (i < i2) {
            if (dataAsByteArray[pos + i] == b) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        r11 = r11 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int indexOfBytesInbound(kotlinx.io.Segment segment, byte[] bytes, int i) {
        int indexOf;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(segment, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bytes, "bytes");
        int size = (segment.getSize() - bytes.length) + 1;
        byte b = bytes[0];
        byte[] dataAsByteArray = segment.dataAsByteArray(true);
        while (i < size && (indexOf = indexOf(segment, b, i, size)) >= 0) {
            int length = bytes.length;
            for (int i2 = 1; i2 < length; i2++) {
                if (dataAsByteArray[segment.getPos() + indexOf + i2] != bytes[i2]) {
                    break;
                }
            }
            return indexOf;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        r13 = r13 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int indexOfBytesOutbound(kotlinx.io.Segment segment, byte[] bytes, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(segment, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bytes, "bytes");
        byte b = bytes[0];
        while (i >= 0 && i < segment.getSize() && indexOf(segment, b, i, segment.getSize()) >= 0) {
            byte[] dataAsByteArray = segment.dataAsByteArray(true);
            kotlinx.io.Segment segment2 = segment;
            int i2 = i;
            for (byte b2 : bytes) {
                if (i2 == segment2.getSize()) {
                    segment2 = segment2.getNext();
                    if (segment2 == null) {
                        return -1;
                    }
                    dataAsByteArray = segment2.dataAsByteArray(true);
                    i2 = 0;
                }
                if (b2 != dataAsByteArray[segment2.getPos() + i2]) {
                    break;
                }
                i2++;
            }
            return i;
        }
        return -1;
    }

    public static final boolean isEmpty(kotlinx.io.Segment segment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(segment, "<this>");
        return segment.getSize() == 0;
    }
}
