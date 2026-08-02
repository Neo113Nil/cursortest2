package kotlinx.io.bytestring;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ)\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0005R\u0016\u0010\u0015\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R\u0011\u0010\u001b\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001d\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001a"}, d2 = {"Lkotlinx/io/bytestring/ByteStringBuilder;", "", "", "initialCapacity", "<init>", "(I)V", "Lkotlinx/io/bytestring/ByteString;", "toByteString", "()Lkotlinx/io/bytestring/ByteString;", "", "byte", "", "append", "(B)V", "", "array", "startIndex", "endIndex", "([BII)V", "p0", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "[B", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRanges", "getSize", "()I", io.ktor.http.ContentDisposition.Parameters.Size, "getCapacity", "capacity"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ByteStringBuilder {
    private byte[] getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRanges;

    public ByteStringBuilder(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = new byte[i];
    }

    public /* synthetic */ ByteStringBuilder(int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    /* renamed from: getSize, reason: from getter */
    public final int getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final int getCapacity() {
        return this.getHighResolutionOutputSizeshNQ4ISI.length;
    }

    public final kotlinx.io.bytestring.ByteString toByteString() {
        if (getGetHighSpeedVideoFpsRanges() == 0) {
            return kotlinx.io.bytestring.ByteStringKt.ByteString();
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI.length == getGetHighSpeedVideoFpsRanges()) {
            return kotlinx.io.bytestring.ByteString.INSTANCE.wrap$kotlinx_io_bytestring(this.getHighResolutionOutputSizeshNQ4ISI);
        }
        return new kotlinx.io.bytestring.ByteString(this.getHighResolutionOutputSizeshNQ4ISI, 0, getGetHighSpeedVideoFpsRanges());
    }

    public final void append(byte r4) {
        getHighSpeedVideoFpsRangesFor(getGetHighSpeedVideoFpsRanges() + 1);
        byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
        int i = this.getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoFpsRanges = i + 1;
        bArr[i] = r4;
    }

    public static /* synthetic */ void append$default(kotlinx.io.bytestring.ByteStringBuilder byteStringBuilder, byte[] bArr, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        byteStringBuilder.append(bArr, i, i2);
    }

    public final void append(byte[] array, int startIndex, int endIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "");
        if (startIndex > endIndex) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("startIndex (");
            sb.append(startIndex);
            sb.append(") > endIndex (");
            sb.append(endIndex);
            sb.append(')');
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        if (startIndex < 0 || endIndex > array.length) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("startIndex (");
            sb2.append(startIndex);
            sb2.append(") and endIndex (");
            sb2.append(endIndex);
            sb2.append(") represents an interval out of array's bounds [0..");
            sb2.append(array.length);
            sb2.append(").");
            throw new java.lang.IndexOutOfBoundsException(sb2.toString());
        }
        getHighSpeedVideoFpsRangesFor((this.getHighSpeedVideoFpsRanges + endIndex) - startIndex);
        kotlin.collections.ArraysKt.copyInto(array, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, startIndex, endIndex);
        this.getHighSpeedVideoFpsRanges += endIndex - startIndex;
    }

    private final void getHighSpeedVideoFpsRangesFor(int p0) {
        byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
        if (bArr.length >= p0) {
            return;
        }
        byte[] bArr2 = new byte[java.lang.Math.max(bArr.length == 0 ? 16 : (int) (bArr.length * 1.5d), p0)];
        kotlin.collections.ArraysKt.copyInto$default(this.getHighResolutionOutputSizeshNQ4ISI, bArr2, 0, 0, 0, 14, (java.lang.Object) null);
        this.getHighResolutionOutputSizeshNQ4ISI = bArr2;
    }

    public ByteStringBuilder() {
        this(0, 1, null);
    }
}
