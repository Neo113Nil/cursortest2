package okio;

@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u000fH\u0016J\b\u0010\u0014\u001a\u00020\u0001H\u0016J\b\u0010\u0015\u001a\u00020\u0001H\u0016J\u0015\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u000fH\u0010¢\u0006\u0002\b\u0018J\u001d\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0001H\u0010¢\u0006\u0002\b\u001bJ\b\u0010\u001c\u001a\u00020\u000fH\u0016J\u001c\u0010\u001d\u001a\u00020\u00012\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0016J\u0015\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001fH\u0010¢\u0006\u0002\b$J\r\u0010%\u001a\u00020\u001fH\u0010¢\u0006\u0002\b&J\b\u0010'\u001a\u00020\u0004H\u0016J\b\u0010(\u001a\u00020)H\u0016J\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0016J%\u0010*\u001a\u00020+2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u001f2\u0006\u00101\u001a\u00020\u001fH\u0010¢\u0006\u0002\b2J(\u00103\u001a\u0002042\u0006\u00100\u001a\u00020\u001f2\u0006\u00105\u001a\u00020\u00012\u0006\u00106\u001a\u00020\u001f2\u0006\u00101\u001a\u00020\u001fH\u0016J(\u00103\u001a\u0002042\u0006\u00100\u001a\u00020\u001f2\u0006\u00105\u001a\u00020\u00042\u0006\u00106\u001a\u00020\u001f2\u0006\u00101\u001a\u00020\u001fH\u0016J,\u00107\u001a\u00020+2\b\b\u0002\u00100\u001a\u00020\u001f2\u0006\u00108\u001a\u00020\u00042\b\b\u0002\u00109\u001a\u00020\u001f2\u0006\u00101\u001a\u00020\u001fH\u0016J\u001a\u0010:\u001a\u00020\u001f2\u0006\u00105\u001a\u00020\u00042\b\b\u0002\u0010;\u001a\u00020\u001fH\u0016J\u001a\u0010<\u001a\u00020\u001f2\u0006\u00105\u001a\u00020\u00042\b\b\u0002\u0010;\u001a\u00020\u001fH\u0016J\b\u0010=\u001a\u00020\u0001H\u0002J\r\u0010>\u001a\u00020\u0004H\u0010¢\u0006\u0002\b?J\u0013\u0010@\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010AH\u0096\u0002J\b\u0010B\u001a\u00020\u001fH\u0016J\b\u0010C\u001a\u00020\u000fH\u0016J\b\u0010D\u001a\u00020EH\u0002R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006F"}, d2 = {"Lokio/SegmentedByteString;", "Lokio/ByteString;", "segments", "", "", "directory", "", "<init>", "([[B[I)V", "getSegments$okio", "()[[B", "[[B", "getDirectory$okio", "()[I", "string", "", io.ktor.http.auth.HttpAuthHeader.Parameters.Charset, "Ljava/nio/charset/Charset;", "base64", "hex", "toAsciiLowercase", "toAsciiUppercase", org.bouncycastle.cms.CMSAttributeTableGenerator.DIGEST, "algorithm", "digest$okio", "hmac", "key", "hmac$okio", "base64Url", "substring", "beginIndex", "", "endIndex", "internalGet", "", "pos", "internalGet$okio", "getSize", "getSize$okio", "toByteArray", "asByteBuffer", "Ljava/nio/ByteBuffer;", "write", "", "out", "Ljava/io/OutputStream;", "buffer", "Lokio/Buffer;", "offset", "byteCount", "write$okio", "rangeEquals", "", "other", "otherOffset", "copyInto", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "targetOffset", "indexOf", "fromIndex", "lastIndexOf", "toByteString", "internalArray", "internalArray$okio", "equals", "", "hashCode", "toString", "writeReplace", "Ljava/lang/Object;", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* renamed from: okio.SegmentedByteString, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0706SegmentedByteString extends okio.ByteString {
    private final transient byte[][] getHighResolutionOutputSizeshNQ4ISI;
    private final transient int[] getHighSpeedVideoFpsRangesFor;

    /* renamed from: getSegments$okio, reason: from getter */
    public final byte[][] getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    /* renamed from: getDirectory$okio, reason: from getter */
    public final int[] getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0706SegmentedByteString(byte[][] bArr, int[] iArr) {
        super(okio.ByteString.EMPTY.getData());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iArr, "");
        this.getHighResolutionOutputSizeshNQ4ISI = bArr;
        this.getHighSpeedVideoFpsRangesFor = iArr;
    }

    @Override // okio.ByteString
    public final okio.ByteString digest$okio(java.lang.String algorithm) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(algorithm, "");
        java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance(algorithm);
        int length = getGetHighResolutionOutputSizeshNQ4ISI().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = getGetHighSpeedVideoFpsRangesFor()[length + i];
            int i4 = getGetHighSpeedVideoFpsRangesFor()[i];
            messageDigest.update(getGetHighResolutionOutputSizeshNQ4ISI()[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] digest = messageDigest.digest();
        kotlin.jvm.internal.Intrinsics.checkNotNull(digest);
        return new okio.ByteString(digest);
    }

    @Override // okio.ByteString
    public final okio.ByteString hmac$okio(java.lang.String algorithm, okio.ByteString key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(algorithm, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        try {
            javax.crypto.Mac mac = javax.crypto.Mac.getInstance(algorithm);
            mac.init(new javax.crypto.spec.SecretKeySpec(key.toByteArray(), algorithm));
            int length = getGetHighResolutionOutputSizeshNQ4ISI().length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = getGetHighSpeedVideoFpsRangesFor()[length + i];
                int i4 = getGetHighSpeedVideoFpsRangesFor()[i];
                mac.update(getGetHighResolutionOutputSizeshNQ4ISI()[i], i3, i4 - i2);
                i++;
                i2 = i4;
            }
            byte[] doFinal = mac.doFinal();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(doFinal, "");
            return new okio.ByteString(doFinal);
        } catch (java.security.InvalidKeyException e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    @Override // okio.ByteString
    public final java.nio.ByteBuffer asByteBuffer() {
        java.nio.ByteBuffer asReadOnlyBuffer = java.nio.ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asReadOnlyBuffer, "");
        return asReadOnlyBuffer;
    }

    @Override // okio.ByteString
    public final byte[] internalArray$okio() {
        return toByteArray();
    }

    @Override // okio.ByteString
    public final okio.ByteString substring(int beginIndex, int endIndex) {
        okio.C0706SegmentedByteString c0706SegmentedByteString = this;
        int resolveDefaultParameter = okio.SegmentedByteString.resolveDefaultParameter(c0706SegmentedByteString, endIndex);
        if (beginIndex < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("beginIndex=");
            sb.append(beginIndex);
            sb.append(" < 0");
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        if (resolveDefaultParameter > size()) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("endIndex=");
            sb2.append(resolveDefaultParameter);
            sb2.append(" > length(");
            sb2.append(size());
            sb2.append(')');
            throw new java.lang.IllegalArgumentException(sb2.toString().toString());
        }
        int i = resolveDefaultParameter - beginIndex;
        if (i < 0) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("endIndex=");
            sb3.append(resolveDefaultParameter);
            sb3.append(" < beginIndex=");
            sb3.append(beginIndex);
            throw new java.lang.IllegalArgumentException(sb3.toString().toString());
        }
        if (beginIndex == 0 && resolveDefaultParameter == size()) {
            return c0706SegmentedByteString;
        }
        if (beginIndex == resolveDefaultParameter) {
            return okio.ByteString.EMPTY;
        }
        int segment = okio.internal.SegmentedByteString.segment(this, beginIndex);
        int segment2 = okio.internal.SegmentedByteString.segment(this, resolveDefaultParameter - 1);
        byte[][] bArr = (byte[][]) kotlin.collections.ArraysKt.copyOfRange(getGetHighResolutionOutputSizeshNQ4ISI(), segment, segment2 + 1);
        byte[][] bArr2 = bArr;
        int[] iArr = new int[bArr2.length * 2];
        if (segment <= segment2) {
            int i2 = segment;
            int i3 = 0;
            while (true) {
                iArr[i3] = java.lang.Math.min(getGetHighSpeedVideoFpsRangesFor()[i2] - beginIndex, i);
                iArr[bArr2.length + i3] = getGetHighSpeedVideoFpsRangesFor()[getGetHighResolutionOutputSizeshNQ4ISI().length + i2];
                if (i2 == segment2) {
                    break;
                }
                i2++;
                i3++;
            }
        }
        int i4 = segment != 0 ? getGetHighSpeedVideoFpsRangesFor()[segment - 1] : 0;
        int length = bArr2.length;
        iArr[length] = iArr[length] + (beginIndex - i4);
        return new okio.C0706SegmentedByteString(bArr, iArr);
    }

    @Override // okio.ByteString
    public final byte internalGet$okio(int pos) {
        okio.SegmentedByteString.checkOffsetAndCount(getGetHighSpeedVideoFpsRangesFor()[getGetHighResolutionOutputSizeshNQ4ISI().length - 1], pos, 1L);
        int segment = okio.internal.SegmentedByteString.segment(this, pos);
        return getGetHighResolutionOutputSizeshNQ4ISI()[segment][(pos - (segment == 0 ? 0 : getGetHighSpeedVideoFpsRangesFor()[segment - 1])) + getGetHighSpeedVideoFpsRangesFor()[getGetHighResolutionOutputSizeshNQ4ISI().length + segment]];
    }

    @Override // okio.ByteString
    public final int getSize$okio() {
        return getGetHighSpeedVideoFpsRangesFor()[getGetHighResolutionOutputSizeshNQ4ISI().length - 1];
    }

    @Override // okio.ByteString
    public final byte[] toByteArray() {
        byte[] bArr = new byte[size()];
        int length = getGetHighResolutionOutputSizeshNQ4ISI().length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int i4 = getGetHighSpeedVideoFpsRangesFor()[length + i];
            int i5 = getGetHighSpeedVideoFpsRangesFor()[i];
            int i6 = i5 - i2;
            kotlin.collections.ArraysKt.copyInto(getGetHighResolutionOutputSizeshNQ4ISI()[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // okio.ByteString
    public final void write(java.io.OutputStream out) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(out, "");
        int length = getGetHighResolutionOutputSizeshNQ4ISI().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = getGetHighSpeedVideoFpsRangesFor()[length + i];
            int i4 = getGetHighSpeedVideoFpsRangesFor()[i];
            out.write(getGetHighResolutionOutputSizeshNQ4ISI()[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
    }

    @Override // okio.ByteString
    public final void write$okio(okio.Buffer buffer, int offset, int byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        int i = offset + byteCount;
        int segment = okio.internal.SegmentedByteString.segment(this, offset);
        while (offset < i) {
            int i2 = segment == 0 ? 0 : getGetHighSpeedVideoFpsRangesFor()[segment - 1];
            int i3 = getGetHighSpeedVideoFpsRangesFor()[segment];
            int i4 = getGetHighSpeedVideoFpsRangesFor()[getGetHighResolutionOutputSizeshNQ4ISI().length + segment];
            int min = java.lang.Math.min(i, (i3 - i2) + i2) - offset;
            int i5 = i4 + (offset - i2);
            okio.Segment segment2 = new okio.Segment(getGetHighResolutionOutputSizeshNQ4ISI()[segment], i5, i5 + min, true, false);
            if (buffer.head == null) {
                segment2.prev = segment2;
                segment2.next = segment2.prev;
                buffer.head = segment2.next;
            } else {
                okio.Segment segment3 = buffer.head;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment3);
                okio.Segment segment4 = segment3.prev;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment4);
                segment4.push(segment2);
            }
            offset += min;
            segment++;
        }
        buffer.setSize$okio(buffer.size() + byteCount);
    }

    @Override // okio.ByteString
    public final boolean rangeEquals(int offset, okio.ByteString other, int otherOffset, int byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "");
        if (offset < 0 || offset > size() - byteCount) {
            return false;
        }
        int i = byteCount + offset;
        int segment = okio.internal.SegmentedByteString.segment(this, offset);
        while (offset < i) {
            int i2 = segment == 0 ? 0 : getGetHighSpeedVideoFpsRangesFor()[segment - 1];
            int i3 = getGetHighSpeedVideoFpsRangesFor()[segment];
            int i4 = getGetHighSpeedVideoFpsRangesFor()[getGetHighResolutionOutputSizeshNQ4ISI().length + segment];
            int min = java.lang.Math.min(i, (i3 - i2) + i2) - offset;
            if (!other.rangeEquals(otherOffset, getGetHighResolutionOutputSizeshNQ4ISI()[segment], i4 + (offset - i2), min)) {
                return false;
            }
            otherOffset += min;
            offset += min;
            segment++;
        }
        return true;
    }

    @Override // okio.ByteString
    public final boolean rangeEquals(int offset, byte[] other, int otherOffset, int byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "");
        if (offset < 0 || offset > size() - byteCount || otherOffset < 0 || otherOffset > other.length - byteCount) {
            return false;
        }
        int i = byteCount + offset;
        int segment = okio.internal.SegmentedByteString.segment(this, offset);
        while (offset < i) {
            int i2 = segment == 0 ? 0 : getGetHighSpeedVideoFpsRangesFor()[segment - 1];
            int i3 = getGetHighSpeedVideoFpsRangesFor()[segment];
            int i4 = getGetHighSpeedVideoFpsRangesFor()[getGetHighResolutionOutputSizeshNQ4ISI().length + segment];
            int min = java.lang.Math.min(i, (i3 - i2) + i2) - offset;
            if (!okio.SegmentedByteString.arrayRangeEquals(getGetHighResolutionOutputSizeshNQ4ISI()[segment], i4 + (offset - i2), other, otherOffset, min)) {
                return false;
            }
            otherOffset += min;
            offset += min;
            segment++;
        }
        return true;
    }

    @Override // okio.ByteString
    public final void copyInto(int offset, byte[] target, int targetOffset, int byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(target, "");
        long j = byteCount;
        okio.SegmentedByteString.checkOffsetAndCount(size(), offset, j);
        okio.SegmentedByteString.checkOffsetAndCount(target.length, targetOffset, j);
        int i = byteCount + offset;
        int segment = okio.internal.SegmentedByteString.segment(this, offset);
        while (offset < i) {
            int i2 = segment == 0 ? 0 : getGetHighSpeedVideoFpsRangesFor()[segment - 1];
            int i3 = getGetHighSpeedVideoFpsRangesFor()[segment];
            int i4 = getGetHighSpeedVideoFpsRangesFor()[getGetHighResolutionOutputSizeshNQ4ISI().length + segment];
            int min = java.lang.Math.min(i, (i3 - i2) + i2) - offset;
            int i5 = i4 + (offset - i2);
            kotlin.collections.ArraysKt.copyInto(getGetHighResolutionOutputSizeshNQ4ISI()[segment], target, targetOffset, i5, i5 + min);
            targetOffset += min;
            offset += min;
            segment++;
        }
    }

    @Override // okio.ByteString
    public final boolean equals(java.lang.Object other) {
        if (other == this) {
            return true;
        }
        if (other instanceof okio.ByteString) {
            okio.ByteString byteString = (okio.ByteString) other;
            if (byteString.size() == size() && rangeEquals(0, byteString, 0, size())) {
                return true;
            }
        }
        return false;
    }

    @Override // okio.ByteString
    public final int hashCode() {
        int hashCode = getHashCode();
        if (hashCode != 0) {
            return hashCode;
        }
        int length = getGetHighResolutionOutputSizeshNQ4ISI().length;
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        while (i < length) {
            int i4 = getGetHighSpeedVideoFpsRangesFor()[length + i];
            int i5 = getGetHighSpeedVideoFpsRangesFor()[i];
            byte[] bArr = getGetHighResolutionOutputSizeshNQ4ISI()[i];
            for (int i6 = i4; i6 < (i5 - i3) + i4; i6++) {
                i2 = (i2 * 31) + bArr[i6];
            }
            i++;
            i3 = i5;
        }
        setHashCode$okio(i2);
        return i2;
    }

    private final java.lang.Object writeReplace() {
        okio.ByteString byteString = new okio.ByteString(toByteArray());
        kotlin.jvm.internal.Intrinsics.checkNotNull(byteString, "");
        return byteString;
    }

    @Override // okio.ByteString
    public final java.lang.String base64() {
        return new okio.ByteString(toByteArray()).base64();
    }

    @Override // okio.ByteString
    public final java.lang.String base64Url() {
        return new okio.ByteString(toByteArray()).base64Url();
    }

    @Override // okio.ByteString
    public final java.lang.String hex() {
        return new okio.ByteString(toByteArray()).hex();
    }

    @Override // okio.ByteString
    public final int indexOf(byte[] other, int fromIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "");
        return new okio.ByteString(toByteArray()).indexOf(other, fromIndex);
    }

    @Override // okio.ByteString
    public final int lastIndexOf(byte[] other, int fromIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "");
        return new okio.ByteString(toByteArray()).lastIndexOf(other, fromIndex);
    }

    @Override // okio.ByteString
    public final java.lang.String string(java.nio.charset.Charset charset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "");
        return new okio.ByteString(toByteArray()).string(charset);
    }

    @Override // okio.ByteString
    public final okio.ByteString toAsciiLowercase() {
        return new okio.ByteString(toByteArray()).toAsciiLowercase();
    }

    @Override // okio.ByteString
    public final okio.ByteString toAsciiUppercase() {
        return new okio.ByteString(toByteArray()).toAsciiUppercase();
    }

    @Override // okio.ByteString
    public final java.lang.String toString() {
        return new okio.ByteString(toByteArray()).toString();
    }
}
