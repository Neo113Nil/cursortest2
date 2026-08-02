package kotlinx.io.bytestring;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0010\u0012\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00020\u0000\"\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00020\u0006\"\u00020\u0007¢\u0006\u0004\b\b\u0010\u0005\u001a\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\t\u001a#\u0010\r\u001a\u00020\u000b*\u00020\u00032\u0006\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e\u001a#\u0010\r\u001a\u00020\u000b*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u0010\u001a#\u0010\r\u001a\u00020\u000b*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u0012\u001a#\u0010\u0013\u001a\u00020\u000b*\u00020\u00032\u0006\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u000e\u001a#\u0010\u0013\u001a\u00020\u000b*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0010\u001a#\u0010\u0013\u001a\u00020\u000b*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0012\u001a\u0019\u0010\u0015\u001a\u00020\u0014*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0019\u0010\u0015\u001a\u00020\u0014*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0015\u0010\u0017\u001a\u0019\u0010\u0018\u001a\u00020\u0014*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0000¢\u0006\u0004\b\u0018\u0010\u0016\u001a\u0019\u0010\u0018\u001a\u00020\u0014*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0018\u0010\u0017\u001a3\u0010\u001d\u001a\u00020\u0014*\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a3\u0010\u001f\u001a\u00020\u0014*\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a\u0011\u0010!\u001a\u00020\u0014*\u00020\u0003¢\u0006\u0004\b!\u0010\"\u001a\u0011\u0010#\u001a\u00020\u0014*\u00020\u0003¢\u0006\u0004\b#\u0010\"\u001a\u0011\u0010%\u001a\u00020$*\u00020\u0003¢\u0006\u0004\b%\u0010&\u001a\u0011\u0010'\u001a\u00020\u0003*\u00020$¢\u0006\u0004\b'\u0010(\u001a\u0019\u0010*\u001a\u00020\u0014*\u00020\u00032\u0006\u0010)\u001a\u00020\u0000¢\u0006\u0004\b*\u0010\u0016\"\u0015\u0010.\u001a\u00020+*\u00020\u00038G¢\u0006\u0006\u001a\u0004\b,\u0010-"}, d2 = {"", "", com.paypal.oslo.downloads.impl.engine.ResumeHandler.ACCEPT_RANGES_BYTES, "Lkotlinx/io/bytestring/ByteString;", "ByteString", "([B)Lkotlinx/io/bytestring/ByteString;", "Lkotlin/UByteArray;", "Lkotlin/UByte;", "ByteString-GBYM_sE", "()Lkotlinx/io/bytestring/ByteString;", "byte", "", "startIndex", "indexOf", "(Lkotlinx/io/bytestring/ByteString;BI)I", "byteString", "(Lkotlinx/io/bytestring/ByteString;Lkotlinx/io/bytestring/ByteString;I)I", "byteArray", "(Lkotlinx/io/bytestring/ByteString;[BI)I", "lastIndexOf", "", "startsWith", "(Lkotlinx/io/bytestring/ByteString;[B)Z", "(Lkotlinx/io/bytestring/ByteString;Lkotlinx/io/bytestring/ByteString;)Z", "endsWith", "p0", "p1", "p2", "p3", "getHighSpeedVideoSizes", "(Lkotlinx/io/bytestring/ByteString;ILkotlinx/io/bytestring/ByteString;II)Z", "getHighResolutionOutputSizeshNQ4ISI", "(Lkotlinx/io/bytestring/ByteString;I[BII)Z", "isEmpty", "(Lkotlinx/io/bytestring/ByteString;)Z", "isNotEmpty", "", "decodeToString", "(Lkotlinx/io/bytestring/ByteString;)Ljava/lang/String;", "encodeToByteString", "(Ljava/lang/String;)Lkotlinx/io/bytestring/ByteString;", "array", "contentEquals", "Lkotlin/ranges/IntRange;", "getIndices", "(Lkotlinx/io/bytestring/ByteString;)Lkotlin/ranges/IntRange;", "indices"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ByteStringKt {
    public static final kotlinx.io.bytestring.ByteString ByteString(byte... bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        if (bArr.length == 0) {
            return kotlinx.io.bytestring.ByteString.INSTANCE.getEMPTY$kotlinx_io_bytestring();
        }
        return kotlinx.io.bytestring.ByteString.INSTANCE.wrap$kotlinx_io_bytestring(bArr);
    }

    /* renamed from: ByteString-GBYM_sE, reason: not valid java name */
    public static final kotlinx.io.bytestring.ByteString m24210ByteStringGBYM_sE(byte... bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        if (kotlin.UByteArray.m23462isEmptyimpl(bArr)) {
            return kotlinx.io.bytestring.ByteString.INSTANCE.getEMPTY$kotlinx_io_bytestring();
        }
        return kotlinx.io.bytestring.ByteString.INSTANCE.wrap$kotlinx_io_bytestring(bArr);
    }

    public static final kotlinx.io.bytestring.ByteString ByteString() {
        return kotlinx.io.bytestring.ByteString.INSTANCE.getEMPTY$kotlinx_io_bytestring();
    }

    public static final kotlin.ranges.IntRange getIndices(kotlinx.io.bytestring.ByteString byteString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        return kotlin.ranges.RangesKt.until(0, byteString.getSize());
    }

    public static /* synthetic */ int indexOf$default(kotlinx.io.bytestring.ByteString byteString, byte b, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return indexOf(byteString, b, i);
    }

    public static final int indexOf(kotlinx.io.bytestring.ByteString byteString, byte b, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        byte[] getHighSpeedVideoFpsRanges = byteString.getGetHighSpeedVideoFpsRanges();
        int size = byteString.getSize();
        for (int max = java.lang.Math.max(i, 0); max < size; max++) {
            if (getHighSpeedVideoFpsRanges[max] == b) {
                return max;
            }
        }
        return -1;
    }

    public static /* synthetic */ int indexOf$default(kotlinx.io.bytestring.ByteString byteString, kotlinx.io.bytestring.ByteString byteString2, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return indexOf(byteString, byteString2, i);
    }

    public static final int indexOf(kotlinx.io.bytestring.ByteString byteString, kotlinx.io.bytestring.ByteString byteString2, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString2, "");
        if (isEmpty(byteString2)) {
            return java.lang.Math.max(java.lang.Math.min(i, byteString.getSize()), 0);
        }
        byte[] getHighSpeedVideoFpsRanges = byteString.getGetHighSpeedVideoFpsRanges();
        byte b = byteString2.get(0);
        int max = java.lang.Math.max(i, 0);
        int size = byteString.getSize() - byteString2.getSize();
        if (max > size) {
            return -1;
        }
        while (true) {
            if (getHighSpeedVideoFpsRanges[max] == b && getHighSpeedVideoSizes(byteString, max, byteString2, 0, byteString2.getSize())) {
                return max;
            }
            if (max == size) {
                return -1;
            }
            max++;
        }
    }

    public static /* synthetic */ int indexOf$default(kotlinx.io.bytestring.ByteString byteString, byte[] bArr, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return indexOf(byteString, bArr, i);
    }

    public static final int indexOf(kotlinx.io.bytestring.ByteString byteString, byte[] bArr, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        if (bArr.length == 0) {
            return java.lang.Math.max(java.lang.Math.min(i, byteString.getSize()), 0);
        }
        byte[] getHighSpeedVideoFpsRanges = byteString.getGetHighSpeedVideoFpsRanges();
        byte b = bArr[0];
        int max = java.lang.Math.max(0, i);
        int size = byteString.getSize() - bArr.length;
        if (max > size) {
            return -1;
        }
        while (true) {
            if (getHighSpeedVideoFpsRanges[max] == b && getHighResolutionOutputSizeshNQ4ISI(byteString, max, bArr, 0, bArr.length)) {
                return max;
            }
            if (max == size) {
                return -1;
            }
            max++;
        }
    }

    public static /* synthetic */ int lastIndexOf$default(kotlinx.io.bytestring.ByteString byteString, byte b, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return lastIndexOf(byteString, b, i);
    }

    public static final int lastIndexOf(kotlinx.io.bytestring.ByteString byteString, byte b, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        byte[] getHighSpeedVideoFpsRanges = byteString.getGetHighSpeedVideoFpsRanges();
        int size = byteString.getSize() - 1;
        int max = java.lang.Math.max(0, i);
        if (max > size) {
            return -1;
        }
        while (getHighSpeedVideoFpsRanges[size] != b) {
            if (size == max) {
                return -1;
            }
            size--;
        }
        return size;
    }

    public static /* synthetic */ int lastIndexOf$default(kotlinx.io.bytestring.ByteString byteString, kotlinx.io.bytestring.ByteString byteString2, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return lastIndexOf(byteString, byteString2, i);
    }

    public static final int lastIndexOf(kotlinx.io.bytestring.ByteString byteString, kotlinx.io.bytestring.ByteString byteString2, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString2, "");
        if (isEmpty(byteString2)) {
            return byteString.getSize();
        }
        int size = byteString.getSize() - byteString2.getSize();
        int max = java.lang.Math.max(0, i);
        if (max > size) {
            return -1;
        }
        while (!getHighSpeedVideoSizes(byteString, size, byteString2, 0, byteString2.getSize())) {
            if (size == max) {
                return -1;
            }
            size--;
        }
        return size;
    }

    public static /* synthetic */ int lastIndexOf$default(kotlinx.io.bytestring.ByteString byteString, byte[] bArr, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return lastIndexOf(byteString, bArr, i);
    }

    public static final int lastIndexOf(kotlinx.io.bytestring.ByteString byteString, byte[] bArr, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        if (bArr.length == 0) {
            return byteString.getSize();
        }
        int size = byteString.getSize() - bArr.length;
        int max = java.lang.Math.max(0, i);
        if (max > size) {
            return -1;
        }
        while (!getHighResolutionOutputSizeshNQ4ISI(byteString, size, bArr, 0, bArr.length)) {
            if (size == max) {
                return -1;
            }
            size--;
        }
        return size;
    }

    public static final boolean startsWith(kotlinx.io.bytestring.ByteString byteString, byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        if (bArr.length > byteString.getSize()) {
            return false;
        }
        return getHighResolutionOutputSizeshNQ4ISI(byteString, 0, bArr, 0, bArr.length);
    }

    public static final boolean startsWith(kotlinx.io.bytestring.ByteString byteString, kotlinx.io.bytestring.ByteString byteString2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString2, "");
        if (byteString2.getSize() > byteString.getSize()) {
            return false;
        }
        return byteString2.getSize() == byteString.getSize() ? byteString.equals(byteString2) : getHighSpeedVideoSizes(byteString, 0, byteString2, 0, byteString2.getSize());
    }

    public static final boolean endsWith(kotlinx.io.bytestring.ByteString byteString, byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        if (bArr.length > byteString.getSize()) {
            return false;
        }
        return getHighResolutionOutputSizeshNQ4ISI(byteString, byteString.getSize() - bArr.length, bArr, 0, bArr.length);
    }

    public static final boolean endsWith(kotlinx.io.bytestring.ByteString byteString, kotlinx.io.bytestring.ByteString byteString2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString2, "");
        if (byteString2.getSize() > byteString.getSize()) {
            return false;
        }
        return byteString2.getSize() == byteString.getSize() ? byteString.equals(byteString2) : getHighSpeedVideoSizes(byteString, byteString.getSize() - byteString2.getSize(), byteString2, 0, byteString2.getSize());
    }

    private static final boolean getHighSpeedVideoSizes(kotlinx.io.bytestring.ByteString byteString, int i, kotlinx.io.bytestring.ByteString byteString2, int i2, int i3) {
        byte[] getHighSpeedVideoFpsRanges = byteString.getGetHighSpeedVideoFpsRanges();
        byte[] getHighSpeedVideoFpsRanges2 = byteString2.getGetHighSpeedVideoFpsRanges();
        for (int i4 = 0; i4 < i3; i4++) {
            if (getHighSpeedVideoFpsRanges[i + i4] != getHighSpeedVideoFpsRanges2[i4]) {
                return false;
            }
        }
        return true;
    }

    private static final boolean getHighResolutionOutputSizeshNQ4ISI(kotlinx.io.bytestring.ByteString byteString, int i, byte[] bArr, int i2, int i3) {
        byte[] getHighSpeedVideoFpsRanges = byteString.getGetHighSpeedVideoFpsRanges();
        for (int i4 = 0; i4 < i3; i4++) {
            if (getHighSpeedVideoFpsRanges[i + i4] != bArr[i4]) {
                return false;
            }
        }
        return true;
    }

    public static final boolean isEmpty(kotlinx.io.bytestring.ByteString byteString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        return byteString.getSize() == 0;
    }

    public static final boolean isNotEmpty(kotlinx.io.bytestring.ByteString byteString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        return !isEmpty(byteString);
    }

    public static final java.lang.String decodeToString(kotlinx.io.bytestring.ByteString byteString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        return kotlin.text.StringsKt.decodeToString(byteString.getGetHighSpeedVideoFpsRanges());
    }

    public static final kotlinx.io.bytestring.ByteString encodeToByteString(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlinx.io.bytestring.ByteString.INSTANCE.wrap$kotlinx_io_bytestring(kotlin.text.StringsKt.encodeToByteArray(str));
    }

    public static final boolean contentEquals(kotlinx.io.bytestring.ByteString byteString, byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        return java.util.Arrays.equals(byteString.getGetHighSpeedVideoFpsRanges(), bArr);
    }
}
