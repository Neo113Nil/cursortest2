package kotlinx.io.bytestring;

/* compiled from: ByteString.kt */
@kotlin.Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0012\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00020\u0003\"\u00020\u0004\u001a\u0019\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00020\u0005\"\u00020\u0006¢\u0006\u0004\b\u0007\u0010\b\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0007\u001a\u001c\u0010\r\u001a\u00020\u000e*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u001a\u001c\u0010\r\u001a\u00020\u000e*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u001a\u001c\u0010\r\u001a\u00020\u000e*\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u001a\u001c\u0010\u0013\u001a\u00020\u000e*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u001a\u001c\u0010\u0013\u001a\u00020\u000e*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u001a\u001c\u0010\u0013\u001a\u00020\u000e*\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u001a\u0012\u0010\u0014\u001a\u00020\u0015*\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0003\u001a\u0012\u0010\u0014\u001a\u00020\u0015*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001\u001a\u0012\u0010\u0016\u001a\u00020\u0015*\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0003\u001a\u0012\u0010\u0016\u001a\u00020\u0015*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001\u001a0\u0010\u0017\u001a\u00020\u0015*\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00012\b\b\u0002\u0010\u001a\u001a\u00020\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\u000eH\u0002\u001a0\u0010\u0017\u001a\u00020\u0015*\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\u000eH\u0002\u001a\n\u0010\u001c\u001a\u00020\u0015*\u00020\u0001\u001a\n\u0010\u001d\u001a\u00020\u0015*\u00020\u0001\u001a\n\u0010\u001e\u001a\u00020\u001f*\u00020\u0001\u001a\n\u0010 \u001a\u00020\u0001*\u00020\u001f\u001a\u0012\u0010!\u001a\u00020\u0015*\u00020\u00012\u0006\u0010\"\u001a\u00020\u0003\"\u0015\u0010\t\u001a\u00020\n*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006#"}, d2 = {"ByteString", "Lkotlinx/io/bytestring/ByteString;", "bytes", "", "", "Lkotlin/UByteArray;", "Lkotlin/UByte;", "ByteString-GBYM_sE", "([B)Lkotlinx/io/bytestring/ByteString;", "indices", "Lkotlin/ranges/IntRange;", "getIndices", "(Lkotlinx/io/bytestring/ByteString;)Lkotlin/ranges/IntRange;", "indexOf", "", "byte", "startIndex", "byteString", "byteArray", "lastIndexOf", "startsWith", "", "endsWith", "rangeEquals", "offset", "other", "otherOffset", "byteCount", "isEmpty", "isNotEmpty", "decodeToString", "", "encodeToByteString", "contentEquals", "array", "kotlinx-io-bytestring"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ByteStringKt {
    public static final kotlinx.io.bytestring.ByteString ByteString(byte... bytes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (bytes.length == 0) {
            return kotlinx.io.bytestring.ByteString.INSTANCE.getEMPTY$kotlinx_io_bytestring();
        }
        return kotlinx.io.bytestring.ByteString.INSTANCE.wrap$kotlinx_io_bytestring(bytes);
    }

    /* renamed from: ByteString-GBYM_sE, reason: not valid java name */
    public static final kotlinx.io.bytestring.ByteString m12396ByteStringGBYM_sE(byte... bytes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (kotlin.UByteArray.m10880isEmptyimpl(bytes)) {
            return kotlinx.io.bytestring.ByteString.INSTANCE.getEMPTY$kotlinx_io_bytestring();
        }
        return kotlinx.io.bytestring.ByteString.INSTANCE.wrap$kotlinx_io_bytestring(bytes);
    }

    public static final kotlinx.io.bytestring.ByteString ByteString() {
        return kotlinx.io.bytestring.ByteString.INSTANCE.getEMPTY$kotlinx_io_bytestring();
    }

    public static final kotlin.ranges.IntRange getIndices(kotlinx.io.bytestring.ByteString byteString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "<this>");
        return kotlin.ranges.RangesKt.until(0, byteString.getSize());
    }

    public static /* synthetic */ int indexOf$default(kotlinx.io.bytestring.ByteString byteString, byte b, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return indexOf(byteString, b, i);
    }

    public static final int indexOf(kotlinx.io.bytestring.ByteString byteString, byte b, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "<this>");
        byte[] data = byteString.getData();
        int size = byteString.getSize();
        for (int max = java.lang.Math.max(i, 0); max < size; max++) {
            if (data[max] == b) {
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
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString2, "byteString");
        if (isEmpty(byteString2)) {
            return java.lang.Math.max(java.lang.Math.min(i, byteString.getSize()), 0);
        }
        byte[] data = byteString.getData();
        byte b = byteString2.get(0);
        int max = java.lang.Math.max(i, 0);
        int size = byteString.getSize() - byteString2.getSize();
        if (max > size) {
            return -1;
        }
        while (true) {
            if (data[max] == b && rangeEquals$default(byteString, max, byteString2, 0, 0, 12, (java.lang.Object) null)) {
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

    public static final int indexOf(kotlinx.io.bytestring.ByteString byteString, byte[] byteArray, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        if (byteArray.length == 0) {
            return java.lang.Math.max(java.lang.Math.min(i, byteString.getSize()), 0);
        }
        byte[] data = byteString.getData();
        byte b = byteArray[0];
        int max = java.lang.Math.max(0, i);
        int size = byteString.getSize() - byteArray.length;
        if (max > size) {
            return -1;
        }
        while (true) {
            if (data[max] == b && rangeEquals$default(byteString, max, byteArray, 0, 0, 12, (java.lang.Object) null)) {
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
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "<this>");
        byte[] data = byteString.getData();
        int size = byteString.getSize() - 1;
        int max = java.lang.Math.max(0, i);
        if (max > size) {
            return -1;
        }
        while (data[size] != b) {
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
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString2, "byteString");
        if (isEmpty(byteString2)) {
            return byteString.getSize();
        }
        int size = byteString.getSize() - byteString2.getSize();
        int max = java.lang.Math.max(0, i);
        if (max > size) {
            return -1;
        }
        while (!rangeEquals$default(byteString, size, byteString2, 0, 0, 8, (java.lang.Object) null)) {
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

    public static final int lastIndexOf(kotlinx.io.bytestring.ByteString byteString, byte[] byteArray, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        if (byteArray.length == 0) {
            return byteString.getSize();
        }
        int size = byteString.getSize() - byteArray.length;
        int max = java.lang.Math.max(0, i);
        if (max > size) {
            return -1;
        }
        while (!rangeEquals$default(byteString, size, byteArray, 0, 0, 8, (java.lang.Object) null)) {
            if (size == max) {
                return -1;
            }
            size--;
        }
        return size;
    }

    public static final boolean startsWith(kotlinx.io.bytestring.ByteString byteString, byte[] byteArray) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        if (byteArray.length > byteString.getSize()) {
            return false;
        }
        return rangeEquals$default(byteString, 0, byteArray, 0, 0, 12, (java.lang.Object) null);
    }

    public static final boolean startsWith(kotlinx.io.bytestring.ByteString byteString, kotlinx.io.bytestring.ByteString byteString2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString2, "byteString");
        if (byteString2.getSize() > byteString.getSize()) {
            return false;
        }
        return byteString2.getSize() == byteString.getSize() ? byteString.equals(byteString2) : rangeEquals$default(byteString, 0, byteString2, 0, 0, 12, (java.lang.Object) null);
    }

    public static final boolean endsWith(kotlinx.io.bytestring.ByteString byteString, byte[] byteArray) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        if (byteArray.length > byteString.getSize()) {
            return false;
        }
        return rangeEquals$default(byteString, byteString.getSize() - byteArray.length, byteArray, 0, 0, 12, (java.lang.Object) null);
    }

    public static final boolean endsWith(kotlinx.io.bytestring.ByteString byteString, kotlinx.io.bytestring.ByteString byteString2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString2, "byteString");
        if (byteString2.getSize() > byteString.getSize()) {
            return false;
        }
        return byteString2.getSize() == byteString.getSize() ? byteString.equals(byteString2) : rangeEquals$default(byteString, byteString.getSize() - byteString2.getSize(), byteString2, 0, 0, 12, (java.lang.Object) null);
    }

    static /* synthetic */ boolean rangeEquals$default(kotlinx.io.bytestring.ByteString byteString, int i, kotlinx.io.bytestring.ByteString byteString2, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = byteString2.getSize() - i2;
        }
        return rangeEquals(byteString, i, byteString2, i2, i3);
    }

    private static final boolean rangeEquals(kotlinx.io.bytestring.ByteString byteString, int i, kotlinx.io.bytestring.ByteString byteString2, int i2, int i3) {
        byte[] data = byteString.getData();
        byte[] data2 = byteString2.getData();
        for (int i4 = 0; i4 < i3; i4++) {
            if (data[i + i4] != data2[i2 + i4]) {
                return false;
            }
        }
        return true;
    }

    static /* synthetic */ boolean rangeEquals$default(kotlinx.io.bytestring.ByteString byteString, int i, byte[] bArr, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = bArr.length - i2;
        }
        return rangeEquals(byteString, i, bArr, i2, i3);
    }

    private static final boolean rangeEquals(kotlinx.io.bytestring.ByteString byteString, int i, byte[] bArr, int i2, int i3) {
        byte[] data = byteString.getData();
        for (int i4 = 0; i4 < i3; i4++) {
            if (data[i + i4] != bArr[i2 + i4]) {
                return false;
            }
        }
        return true;
    }

    public static final boolean isEmpty(kotlinx.io.bytestring.ByteString byteString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "<this>");
        return byteString.getSize() == 0;
    }

    public static final boolean isNotEmpty(kotlinx.io.bytestring.ByteString byteString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "<this>");
        return !isEmpty(byteString);
    }

    public static final java.lang.String decodeToString(kotlinx.io.bytestring.ByteString byteString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "<this>");
        return kotlin.text.StringsKt.decodeToString(byteString.getData());
    }

    public static final kotlinx.io.bytestring.ByteString encodeToByteString(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return kotlinx.io.bytestring.ByteString.INSTANCE.wrap$kotlinx_io_bytestring(kotlin.text.StringsKt.encodeToByteArray(str));
    }

    public static final boolean contentEquals(kotlinx.io.bytestring.ByteString byteString, byte[] array) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "array");
        return java.util.Arrays.equals(byteString.getData(), array);
    }
}
