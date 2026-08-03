package kotlinx.io.bytestring;

/* compiled from: ByteString.kt */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001 B\u001b\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u000bJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0096\u0002J\b\u0010\f\u001a\u00020\tH\u0016J\u0011\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\tH\u0086\u0002J\u001a\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tJ,\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\t2\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tJ\u0018\u0010\u001b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tJ\u0011\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0000H\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0003H\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, d2 = {"Lkotlinx/io/bytestring/ByteString;", "", "data", "", "dummy", "", "<init>", "([BLjava/lang/Object;)V", "startIndex", "", "endIndex", "([BII)V", "hashCode", "size", "getSize", "()I", "equals", "", "other", "get", "", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "toByteArray", "copyInto", "", "destination", "destinationOffset", "substring", "compareTo", "toString", "", "getBackingArrayReference", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "kotlinx-io-bytestring"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ByteString implements java.lang.Comparable<kotlinx.io.bytestring.ByteString> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlinx.io.bytestring.ByteString.Companion INSTANCE = new kotlinx.io.bytestring.ByteString.Companion(null);
    private static final kotlinx.io.bytestring.ByteString EMPTY = new kotlinx.io.bytestring.ByteString(new byte[0], null);
    private static final char[] HEX_DIGITS;
    private final byte[] data;

    @kotlinx.io.bytestring.BenignDataRace
    private int hashCode;

    public /* synthetic */ ByteString(byte[] bArr, java.lang.Object obj, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, obj);
    }

    private ByteString(byte[] bArr, java.lang.Object obj) {
        this.data = bArr;
    }

    public /* synthetic */ ByteString(byte[] bArr, int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? bArr.length : i2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ByteString(byte[] data, int i, int i2) {
        this(kotlin.collections.ArraysKt.copyOfRange(data, i, i2), null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
    }

    /* compiled from: ByteString.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0000¢\u0006\u0002\b\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlinx/io/bytestring/ByteString$Companion;", "", "<init>", "()V", "EMPTY", "Lkotlinx/io/bytestring/ByteString;", "getEMPTY$kotlinx_io_bytestring", "()Lkotlinx/io/bytestring/ByteString;", "wrap", "byteArray", "", "wrap$kotlinx_io_bytestring", "HEX_DIGITS", "", "kotlinx-io-bytestring"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final kotlinx.io.bytestring.ByteString getEMPTY$kotlinx_io_bytestring() {
            return kotlinx.io.bytestring.ByteString.EMPTY;
        }

        public final kotlinx.io.bytestring.ByteString wrap$kotlinx_io_bytestring(byte[] byteArray) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteArray, "byteArray");
            kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
            return new kotlinx.io.bytestring.ByteString(byteArray, defaultConstructorMarker, defaultConstructorMarker);
        }
    }

    static {
        char[] charArray = "0123456789abcdef".toCharArray();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        HEX_DIGITS = charArray;
    }

    public final int getSize() {
        return this.data.length;
    }

    public boolean equals(java.lang.Object other) {
        int i;
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        kotlinx.io.bytestring.ByteString byteString = (kotlinx.io.bytestring.ByteString) other;
        byte[] bArr = byteString.data;
        int length = bArr.length;
        byte[] bArr2 = this.data;
        if (length != bArr2.length) {
            return false;
        }
        int i2 = byteString.hashCode;
        if (i2 == 0 || (i = this.hashCode) == 0 || i2 == i) {
            return java.util.Arrays.equals(bArr2, bArr);
        }
        return false;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = java.util.Arrays.hashCode(this.data);
        this.hashCode = hashCode;
        return hashCode;
    }

    public final byte get(int index) {
        if (index < 0 || index >= getSize()) {
            throw new java.lang.IndexOutOfBoundsException("index (" + index + ") is out of byte string bounds: [0.." + getSize() + ')');
        }
        return this.data[index];
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
            throw new java.lang.IllegalArgumentException(("startIndex (" + startIndex + ") > endIndex (" + endIndex + ')').toString());
        }
        return kotlin.collections.ArraysKt.copyOfRange(this.data, startIndex, endIndex);
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
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "destination");
        if (startIndex > endIndex) {
            throw new java.lang.IllegalArgumentException(("startIndex (" + startIndex + ") > endIndex (" + endIndex + ')').toString());
        }
        kotlin.collections.ArraysKt.copyInto(this.data, destination, destinationOffset, startIndex, endIndex);
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
        return new kotlinx.io.bytestring.ByteString(this.data, startIndex, endIndex);
    }

    @Override // java.lang.Comparable
    public int compareTo(kotlinx.io.bytestring.ByteString other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        if (other == this) {
            return 0;
        }
        byte[] bArr = this.data;
        byte[] bArr2 = other.data;
        int min = java.lang.Math.min(getSize(), other.getSize());
        for (int i = 0; i < min; i++) {
            int compare = kotlin.jvm.internal.Intrinsics.compare(kotlin.UByte.m10816constructorimpl(bArr[i]) & 255, kotlin.UByte.m10816constructorimpl(bArr2[i]) & 255);
            if (compare != 0) {
                return compare;
            }
        }
        return kotlin.jvm.internal.Intrinsics.compare(getSize(), other.getSize());
    }

    public java.lang.String toString() {
        if (kotlinx.io.bytestring.ByteStringKt.isEmpty(this)) {
            return "ByteString(size=0)";
        }
        java.lang.String valueOf = java.lang.String.valueOf(getSize());
        java.lang.StringBuilder sb = new java.lang.StringBuilder(valueOf.length() + 22 + (getSize() * 2));
        sb.append("ByteString(size=");
        sb.append(valueOf);
        sb.append(" hex=");
        byte[] bArr = this.data;
        int size = getSize();
        for (int i = 0; i < size; i++) {
            byte b = bArr[i];
            char[] cArr = HEX_DIGITS;
            sb.append(cArr[(b >>> 4) & 15]);
            sb.append(cArr[b & com.google.common.base.Ascii.SI]);
        }
        sb.append(')');
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    /* renamed from: getBackingArrayReference, reason: from getter */
    public final byte[] getData() {
        return this.data;
    }
}
