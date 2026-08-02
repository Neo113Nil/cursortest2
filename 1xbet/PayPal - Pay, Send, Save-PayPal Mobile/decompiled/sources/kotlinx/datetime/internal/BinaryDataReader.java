package kotlinx.datetime.internal;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\nJ\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0016J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$"}, d2 = {"Lkotlinx/datetime/internal/BinaryDataReader;", "", "", com.paypal.oslo.downloads.impl.engine.ResumeHandler.ACCEPT_RANGES_BYTES, "", com.daon.sdk.face.license.License.FEATURE_POSITION, "<init>", "([BI)V", "", "readByte", "()B", "Lkotlin/UByte;", "readUnsignedByte-w2LRezQ", "readUnsignedByte", "readInt", "()I", "", "readLong", "()J", "exactLength", "", "readUtf8String", "(I)Ljava/lang/String;", "fieldSize", "readNullTerminatedUtf8String", "", "readAsciiChar", "()C", "length", "", "skip", "(I)V", "getHighSpeedVideoFpsRangesFor", "[B", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class BinaryDataReader {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final byte[] Camera2StreamConfigurationMap;

    public BinaryDataReader(byte[] bArr, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        this.Camera2StreamConfigurationMap = bArr;
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    public /* synthetic */ BinaryDataReader(byte[] bArr, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, (i2 & 2) != 0 ? 0 : i);
    }

    public final byte readByte() {
        byte[] bArr = this.Camera2StreamConfigurationMap;
        int i = this.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoFpsRangesFor = i + 1;
        return bArr[i];
    }

    /* renamed from: readUnsignedByte-w2LRezQ, reason: not valid java name */
    public final byte m24169readUnsignedBytew2LRezQ() {
        return kotlin.UByte.m23446constructorimpl(readByte());
    }

    public final int readInt() {
        byte[] bArr = this.Camera2StreamConfigurationMap;
        int i = this.getHighSpeedVideoFpsRangesFor;
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        byte b3 = bArr[i + 2];
        byte b4 = bArr[i + 3];
        this.getHighSpeedVideoFpsRangesFor = i + 4;
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        return (b4 & 255) | ((b & 255) << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8);
    }

    public final long readLong() {
        byte[] bArr = this.Camera2StreamConfigurationMap;
        int i = this.getHighSpeedVideoFpsRangesFor;
        long j = bArr[i];
        long j2 = bArr[i + 1];
        long j3 = bArr[i + 2];
        long j4 = bArr[i + 3];
        long j5 = bArr[i + 4];
        long j6 = bArr[i + 5];
        long j7 = bArr[i + 6];
        long j8 = bArr[i + 7];
        this.getHighSpeedVideoFpsRangesFor = i + 8;
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        return ((j & 255) << 56) | ((j2 & 255) << 48) | ((j3 & 255) << 40) | ((j4 & 255) << 32) | ((j5 & 255) << 24) | ((j6 & 255) << 16) | ((j7 & 255) << 8) | (j8 & 255);
    }

    public final java.lang.String readUtf8String(int exactLength) {
        byte[] bArr = this.Camera2StreamConfigurationMap;
        int i = this.getHighSpeedVideoFpsRangesFor;
        java.lang.String decodeToString$default = kotlin.text.StringsKt.decodeToString$default(bArr, i, i + exactLength, false, 4, null);
        this.getHighSpeedVideoFpsRangesFor += exactLength;
        return decodeToString$default;
    }

    public final java.lang.String readNullTerminatedUtf8String(int fieldSize) {
        int i;
        byte[] bArr;
        int i2;
        int i3 = 0;
        while (true) {
            i = this.getHighSpeedVideoFpsRangesFor;
            bArr = this.Camera2StreamConfigurationMap;
            i2 = i + i3;
            if (i2 >= bArr.length || bArr[i2] == 0 || i3 >= fieldSize) {
                break;
            }
            i3++;
        }
        java.lang.String decodeToString$default = kotlin.text.StringsKt.decodeToString$default(bArr, i, i2, false, 4, null);
        this.getHighSpeedVideoFpsRangesFor += fieldSize;
        return decodeToString$default;
    }

    public final char readAsciiChar() {
        return (char) readByte();
    }

    public final void skip(int length) {
        this.getHighSpeedVideoFpsRangesFor += length;
    }
}
