package kotlinx.io.bytestring;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001.B\u001b\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010 \u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0002H\u0000¢\u0006\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010+\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0011\u0010-\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b,\u0010\u0012"}, d2 = {"Lkotlinx/io/bytestring/ByteString;", "", "", "p0", "", "p1", "<init>", "([B)V", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "startIndex", "endIndex", "([BII)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "index", "", "get", "(I)B", "toByteArray", "(II)[B", "destination", "destinationOffset", "", "copyInto", "([BIII)V", "substring", "(II)Lkotlinx/io/bytestring/ByteString;", "compareTo", "(Lkotlinx/io/bytestring/ByteString;)I", "", "toString", "()Ljava/lang/String;", "getBackingArrayReference", "()[B", "getHighSpeedVideoFpsRanges", "[B", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes", "getSize", io.ktor.http.ContentDisposition.Parameters.Size, "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ByteString implements java.lang.Comparable<kotlinx.io.bytestring.ByteString> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlinx.io.bytestring.ByteString.Companion INSTANCE = new kotlinx.io.bytestring.ByteString.Companion(null);
    private static final kotlinx.io.bytestring.ByteString EMPTY = new kotlinx.io.bytestring.ByteString(new byte[0]);
    private static final char[] getHighSpeedVideoFpsRangesFor;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    @kotlinx.io.bytestring.BenignDataRace
    private int getHighSpeedVideoSizes;
    private final byte[] getHighSpeedVideoFpsRanges;

    private ByteString(byte[] bArr) {
        this.getHighSpeedVideoFpsRanges = bArr;
    }

    public /* synthetic */ ByteString(byte[] bArr, int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? bArr.length : i2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ByteString(byte[] bArr, int i, int i2) {
        this(kotlin.collections.ArraysKt.copyOfRange(bArr, i, i2));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0019\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00068\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lkotlinx/io/bytestring/ByteString$Companion;", "", "<init>", "()V", "", "byteArray", "Lkotlinx/io/bytestring/ByteString;", "wrap$kotlinx_io_bytestring", "([B)Lkotlinx/io/bytestring/ByteString;", "EMPTY", "Lkotlinx/io/bytestring/ByteString;", "getEMPTY$kotlinx_io_bytestring", "()Lkotlinx/io/bytestring/ByteString;", "", "getHighSpeedVideoFpsRangesFor", "[C", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.io.bytestring.ByteString getEMPTY$kotlinx_io_bytestring() {
            return kotlinx.io.bytestring.ByteString.EMPTY;
        }

        public final kotlinx.io.bytestring.ByteString wrap$kotlinx_io_bytestring(byte[] byteArray) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteArray, "");
            kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
            return new kotlinx.io.bytestring.ByteString(byteArray, defaultConstructorMarker, defaultConstructorMarker);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        char[] charArray = "0123456789abcdef".toCharArray();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(charArray, "");
        getHighSpeedVideoFpsRangesFor = charArray;
    }

    public final int getSize() {
        return this.getHighSpeedVideoFpsRanges.length;
    }

    public final boolean equals(java.lang.Object other) {
        int i;
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        kotlinx.io.bytestring.ByteString byteString = (kotlinx.io.bytestring.ByteString) other;
        byte[] bArr = byteString.getHighSpeedVideoFpsRanges;
        int length = bArr.length;
        byte[] bArr2 = this.getHighSpeedVideoFpsRanges;
        if (length != bArr2.length) {
            return false;
        }
        int i2 = byteString.getHighSpeedVideoSizes;
        if (i2 == 0 || (i = this.getHighSpeedVideoSizes) == 0 || i2 == i) {
            return java.util.Arrays.equals(bArr2, bArr);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.getHighSpeedVideoSizes;
        if (i != 0) {
            return i;
        }
        int hashCode = java.util.Arrays.hashCode(this.getHighSpeedVideoFpsRanges);
        this.getHighSpeedVideoSizes = hashCode;
        return hashCode;
    }

    public final byte get(int index) {
        if (index < 0 || index >= getSize()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("index (");
            sb.append(index);
            sb.append(") is out of byte string bounds: [0..");
            sb.append(getSize());
            sb.append(')');
            throw new java.lang.IndexOutOfBoundsException(sb.toString());
        }
        return this.getHighSpeedVideoFpsRanges[index];
    }

    public static /* synthetic */ byte[] toByteArray$default(kotlinx.io.bytestring.ByteString byteString, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = byteString.getSize();
        }
        return byteString.toByteArray(i, i2);
    }

    public final byte[] toByteArray(int startIndex, int endIndex) {
        if (startIndex > endIndex) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("startIndex (");
            sb.append(startIndex);
            sb.append(") > endIndex (");
            sb.append(endIndex);
            sb.append(')');
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        return kotlin.collections.ArraysKt.copyOfRange(this.getHighSpeedVideoFpsRanges, startIndex, endIndex);
    }

    public static /* synthetic */ void copyInto$default(kotlinx.io.bytestring.ByteString byteString, byte[] bArr, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = byteString.getSize();
        }
        byteString.copyInto(bArr, i, i2, i3);
    }

    public final void copyInto(byte[] destination, int destinationOffset, int startIndex, int endIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
        if (startIndex > endIndex) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("startIndex (");
            sb.append(startIndex);
            sb.append(") > endIndex (");
            sb.append(endIndex);
            sb.append(')');
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        kotlin.collections.ArraysKt.copyInto(this.getHighSpeedVideoFpsRanges, destination, destinationOffset, startIndex, endIndex);
    }

    public static /* synthetic */ kotlinx.io.bytestring.ByteString substring$default(kotlinx.io.bytestring.ByteString byteString, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i2 = byteString.getSize();
        }
        return byteString.substring(i, i2);
    }

    public final kotlinx.io.bytestring.ByteString substring(int startIndex, int endIndex) {
        if (startIndex == endIndex) {
            return EMPTY;
        }
        return new kotlinx.io.bytestring.ByteString(this.getHighSpeedVideoFpsRanges, startIndex, endIndex);
    }

    @Override // java.lang.Comparable
    public final int compareTo(kotlinx.io.bytestring.ByteString other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "");
        if (other == this) {
            return 0;
        }
        byte[] bArr = this.getHighSpeedVideoFpsRanges;
        byte[] bArr2 = other.getHighSpeedVideoFpsRanges;
        int min = java.lang.Math.min(getSize(), other.getSize());
        for (int i = 0; i < min; i++) {
            int compare = kotlin.jvm.internal.Intrinsics.compare(kotlin.UByte.m23446constructorimpl(bArr[i]) & 255, kotlin.UByte.m23446constructorimpl(bArr2[i]) & 255);
            if (compare != 0) {
                return compare;
            }
        }
        return kotlin.jvm.internal.Intrinsics.compare(getSize(), other.getSize());
    }

    public final java.lang.String toString() {
        if (kotlinx.io.bytestring.ByteStringKt.isEmpty(this)) {
            return "ByteString(size=0)";
        }
        java.lang.String valueOf = java.lang.String.valueOf(getSize());
        java.lang.StringBuilder sb = new java.lang.StringBuilder(valueOf.length() + 22 + (getSize() * 2));
        sb.append("ByteString(size=");
        sb.append(valueOf);
        sb.append(" hex=");
        byte[] bArr = this.getHighSpeedVideoFpsRanges;
        int size = getSize();
        for (int i = 0; i < size; i++) {
            byte b = bArr[i];
            char[] cArr = getHighSpeedVideoFpsRangesFor;
            sb.append(cArr[(b >>> 4) & 15]);
            sb.append(cArr[b & com.google.common.base.Ascii.SI]);
        }
        sb.append(')');
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    /* renamed from: getBackingArrayReference, reason: from getter */
    public final byte[] getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public /* synthetic */ ByteString(byte[] bArr, java.lang.Object obj, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr);
    }
}
