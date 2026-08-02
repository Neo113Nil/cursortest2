package io.ktor.utils.io.core.internal;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Lio/ktor/utils/io/core/internal/CharArraySequence;", "", "", "array", "", "offset", "length", "<init>", "([CII)V", "index", "", "get", "(I)C", "startIndex", "endIndex", "subSequence", "(II)Ljava/lang/CharSequence;", "Camera2StreamConfigurationMap", "[C", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRanges", "getLength", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CharArraySequence implements java.lang.CharSequence {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final char[] getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRanges;
    private final int length;

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return get(i);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return this.length;
    }

    public CharArraySequence(char[] cArr, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cArr, "");
        this.getHighSpeedVideoSizes = cArr;
        this.getHighSpeedVideoFpsRanges = i;
        this.length = i2;
    }

    public final int getLength() {
        return this.length;
    }

    public final char get(int index) {
        if (index < this.length) {
            return this.getHighSpeedVideoSizes[index + this.getHighSpeedVideoFpsRanges];
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("String index out of bounds: ");
        sb.append(index);
        sb.append(" > ");
        sb.append(this.length);
        throw new java.lang.IndexOutOfBoundsException(sb.toString());
    }

    @Override // java.lang.CharSequence
    public final java.lang.CharSequence subSequence(int startIndex, int endIndex) {
        if (startIndex < 0) {
            throw new java.lang.IllegalArgumentException("startIndex shouldn't be negative: ".concat(java.lang.String.valueOf(startIndex)).toString());
        }
        int i = this.length;
        if (startIndex > i) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("startIndex is too large: ");
            sb.append(startIndex);
            sb.append(" > ");
            sb.append(this.length);
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        if (startIndex + endIndex > i) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("endIndex is too large: ");
            sb2.append(endIndex);
            sb2.append(" > ");
            sb2.append(this.length);
            throw new java.lang.IllegalArgumentException(sb2.toString().toString());
        }
        if (endIndex < startIndex) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("endIndex should be greater or equal to startIndex: ");
            sb3.append(startIndex);
            sb3.append(" > ");
            sb3.append(endIndex);
            throw new java.lang.IllegalArgumentException(sb3.toString().toString());
        }
        return new io.ktor.utils.io.core.internal.CharArraySequence(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges + startIndex, endIndex - startIndex);
    }
}
