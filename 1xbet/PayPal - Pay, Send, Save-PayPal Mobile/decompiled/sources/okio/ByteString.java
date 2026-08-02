package okio;

@kotlin.Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0016\u0018\u0000 p2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001pB\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\tJ\r\u0010\u000f\u001a\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0000¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0000¢\u0006\u0004\b\u0012\u0010\u0010J\r\u0010\u0013\u001a\u00020\u0000¢\u0006\u0004\b\u0013\u0010\u0010J\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001e\u0010\tJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001f\u0010\tJ\u000f\u0010 \u001a\u00020\u0000H\u0016¢\u0006\u0004\b \u0010\u0010J\u000f\u0010!\u001a\u00020\u0000H\u0016¢\u0006\u0004\b!\u0010\u0010J#\u0010%\u001a\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\"H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020(2\u0006\u0010'\u001a\u00020\"H\u0010¢\u0006\u0004\b)\u0010*J\u0018\u0010,\u001a\u00020(2\u0006\u0010+\u001a\u00020\"H\u0086\u0002¢\u0006\u0004\b,\u0010*J\u000f\u0010-\u001a\u00020\"H\u0010¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0003H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0003H\u0010¢\u0006\u0004\b1\u00100J\u000f\u00103\u001a\u000202H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00108\u001a\u0002072\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b8\u00109J'\u0010>\u001a\u0002072\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020\"2\u0006\u0010=\u001a\u00020\"H\u0010¢\u0006\u0004\b>\u0010?J/\u0010C\u001a\u00020B2\u0006\u0010<\u001a\u00020\"2\u0006\u0010@\u001a\u00020\u00002\u0006\u0010A\u001a\u00020\"2\u0006\u0010=\u001a\u00020\"H\u0016¢\u0006\u0004\bC\u0010DJ/\u0010C\u001a\u00020B2\u0006\u0010<\u001a\u00020\"2\u0006\u0010@\u001a\u00020\u00032\u0006\u0010A\u001a\u00020\"2\u0006\u0010=\u001a\u00020\"H\u0016¢\u0006\u0004\bC\u0010EJ3\u0010H\u001a\u0002072\b\b\u0002\u0010<\u001a\u00020\"2\u0006\u0010F\u001a\u00020\u00032\b\b\u0002\u0010G\u001a\u00020\"2\u0006\u0010=\u001a\u00020\"H\u0016¢\u0006\u0004\bH\u0010IJ\u0015\u0010K\u001a\u00020B2\u0006\u0010J\u001a\u00020\u0000¢\u0006\u0004\bK\u0010LJ\u0015\u0010K\u001a\u00020B2\u0006\u0010J\u001a\u00020\u0003¢\u0006\u0004\bK\u0010MJ\u0015\u0010O\u001a\u00020B2\u0006\u0010N\u001a\u00020\u0000¢\u0006\u0004\bO\u0010LJ\u0015\u0010O\u001a\u00020B2\u0006\u0010N\u001a\u00020\u0003¢\u0006\u0004\bO\u0010MJ\u001f\u0010Q\u001a\u00020\"2\u0006\u0010@\u001a\u00020\u00002\b\b\u0002\u0010P\u001a\u00020\"¢\u0006\u0004\bQ\u0010RJ!\u0010Q\u001a\u00020\"2\u0006\u0010@\u001a\u00020\u00032\b\b\u0002\u0010P\u001a\u00020\"H\u0016¢\u0006\u0004\bQ\u0010SJ\u001f\u0010T\u001a\u00020\"2\u0006\u0010@\u001a\u00020\u00002\b\b\u0002\u0010P\u001a\u00020\"¢\u0006\u0004\bT\u0010RJ!\u0010T\u001a\u00020\"2\u0006\u0010@\u001a\u00020\u00032\b\b\u0002\u0010P\u001a\u00020\"H\u0016¢\u0006\u0004\bT\u0010SJ\u001a\u0010V\u001a\u00020B2\b\u0010@\u001a\u0004\u0018\u00010UH\u0096\u0002¢\u0006\u0004\bV\u0010WJ\u000f\u0010X\u001a\u00020\"H\u0016¢\u0006\u0004\bX\u0010.J\u0018\u0010Y\u001a\u00020\"2\u0006\u0010@\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\bY\u0010ZJ\u000f\u0010[\u001a\u00020\u0007H\u0016¢\u0006\u0004\b[\u0010\tJ\u0017\u0010^\u001a\u0002072\u0006\u0010]\u001a\u00020\\H\u0002¢\u0006\u0004\b^\u0010_J\u0017\u0010a\u001a\u0002072\u0006\u00106\u001a\u00020`H\u0002¢\u0006\u0004\ba\u0010bJ\u0017\u0010c\u001a\u00020(2\u0006\u0010+\u001a\u00020\"H\u0007¢\u0006\u0004\bc\u0010*J\u000f\u0010d\u001a\u00020\"H\u0007¢\u0006\u0004\bd\u0010.R\u001a\u0010\u0004\u001a\u00020\u00038\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010e\u001a\u0004\bf\u00100R\"\u0010X\u001a\u00020\"8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bX\u0010g\u001a\u0004\bh\u0010.\"\u0004\bi\u0010jR$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\b\u0010k\u001a\u0004\bl\u0010\t\"\u0004\bm\u0010nR\u0011\u0010o\u001a\u00020\"8G¢\u0006\u0006\u001a\u0004\bo\u0010."}, d2 = {"Lokio/ByteString;", "Ljava/io/Serializable;", "", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "([B)V", "", "utf8", "()Ljava/lang/String;", "Ljava/nio/charset/Charset;", io.ktor.http.auth.HttpAuthHeader.Parameters.Charset, "string", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "base64", "md5", "()Lokio/ByteString;", "sha1", "sha256", "sha512", "algorithm", "digest$okio", "(Ljava/lang/String;)Lokio/ByteString;", "key", "hmacSha1", "(Lokio/ByteString;)Lokio/ByteString;", "hmacSha256", "hmacSha512", "hmac$okio", "(Ljava/lang/String;Lokio/ByteString;)Lokio/ByteString;", "base64Url", "hex", "toAsciiLowercase", "toAsciiUppercase", "", "beginIndex", "endIndex", "substring", "(II)Lokio/ByteString;", "pos", "", "internalGet$okio", "(I)B", "index", "getByte", "getSize$okio", "()I", "toByteArray", "()[B", "internalArray$okio", "Ljava/nio/ByteBuffer;", "asByteBuffer", "()Ljava/nio/ByteBuffer;", "Ljava/io/OutputStream;", "out", "", "write", "(Ljava/io/OutputStream;)V", "Lokio/Buffer;", "buffer", "offset", "byteCount", "write$okio", "(Lokio/Buffer;II)V", "other", "otherOffset", "", "rangeEquals", "(ILokio/ByteString;II)Z", "(I[BII)Z", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "targetOffset", "copyInto", "(I[BII)V", "prefix", "startsWith", "(Lokio/ByteString;)Z", "([B)Z", "suffix", "endsWith", "fromIndex", "indexOf", "(Lokio/ByteString;I)I", "([BI)I", "lastIndexOf", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "compareTo", "(Lokio/ByteString;)I", "toString", "Ljava/io/ObjectInputStream;", "in", "readObject", "(Ljava/io/ObjectInputStream;)V", "Ljava/io/ObjectOutputStream;", "writeObject", "(Ljava/io/ObjectOutputStream;)V", "-deprecated_getByte", "-deprecated_size", "[B", "getData$okio", com.visa.cbp.getEncExpo.warmup, "getHashCode$okio", "setHashCode$okio", "(I)V", "Ljava/lang/String;", "getUtf8$okio", "setUtf8$okio", "(Ljava/lang/String;)V", io.ktor.http.ContentDisposition.Parameters.Size, "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public class ByteString implements java.io.Serializable, java.lang.Comparable<okio.ByteString> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okio.ByteString.Companion INSTANCE = new okio.ByteString.Companion(null);
    public static final okio.ByteString EMPTY = new okio.ByteString(new byte[0]);
    private static final long serialVersionUID = 1;
    private final byte[] data;
    private transient int hashCode;
    private transient java.lang.String utf8;

    public ByteString(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        this.data = bArr;
    }

    /* renamed from: getData$okio, reason: from getter */
    public final byte[] getData() {
        return this.data;
    }

    /* renamed from: getHashCode$okio, reason: from getter */
    public final int getHashCode() {
        return this.hashCode;
    }

    public final void setHashCode$okio(int i) {
        this.hashCode = i;
    }

    /* renamed from: getUtf8$okio, reason: from getter */
    public final java.lang.String getUtf8() {
        return this.utf8;
    }

    public final void setUtf8$okio(java.lang.String str) {
        this.utf8 = str;
    }

    public java.lang.String string(java.nio.charset.Charset charset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "");
        return new java.lang.String(this.data, charset);
    }

    public final okio.ByteString md5() {
        return digest$okio("MD5");
    }

    public final okio.ByteString sha1() {
        return digest$okio("SHA-1");
    }

    public final okio.ByteString sha256() {
        return digest$okio("SHA-256");
    }

    public final okio.ByteString sha512() {
        return digest$okio("SHA-512");
    }

    public okio.ByteString digest$okio(java.lang.String algorithm) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(algorithm, "");
        java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance(algorithm);
        messageDigest.update(this.data, 0, size());
        byte[] digest = messageDigest.digest();
        kotlin.jvm.internal.Intrinsics.checkNotNull(digest);
        return new okio.ByteString(digest);
    }

    public okio.ByteString hmacSha1(okio.ByteString key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return hmac$okio("HmacSHA1", key);
    }

    public okio.ByteString hmacSha256(okio.ByteString key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return hmac$okio(org.jose4j.mac.MacUtil.HMAC_SHA256, key);
    }

    public okio.ByteString hmacSha512(okio.ByteString key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return hmac$okio(org.jose4j.mac.MacUtil.HMAC_SHA512, key);
    }

    public okio.ByteString hmac$okio(java.lang.String algorithm, okio.ByteString key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(algorithm, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        try {
            javax.crypto.Mac mac = javax.crypto.Mac.getInstance(algorithm);
            mac.init(new javax.crypto.spec.SecretKeySpec(key.toByteArray(), algorithm));
            byte[] doFinal = mac.doFinal(this.data);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(doFinal, "");
            return new okio.ByteString(doFinal);
        } catch (java.security.InvalidKeyException e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    public static /* synthetic */ okio.ByteString substring$default(okio.ByteString byteString, int i, int i2, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
        }
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = okio.SegmentedByteString.getDEFAULT__ByteString_size();
        }
        return byteString.substring(i, i2);
    }

    public final byte getByte(int index) {
        return internalGet$okio(index);
    }

    public final int size() {
        return getSize$okio();
    }

    public java.nio.ByteBuffer asByteBuffer() {
        java.nio.ByteBuffer asReadOnlyBuffer = java.nio.ByteBuffer.wrap(this.data).asReadOnlyBuffer();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asReadOnlyBuffer, "");
        return asReadOnlyBuffer;
    }

    public void write(java.io.OutputStream out) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(out, "");
        out.write(this.data);
    }

    public void write$okio(okio.Buffer buffer, int offset, int byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        okio.internal.ByteString.commonWrite(this, buffer, offset, byteCount);
    }

    public static /* synthetic */ void copyInto$default(okio.ByteString byteString, int i, byte[] bArr, int i2, int i3, int i4, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copyInto");
        }
        if ((i4 & 1) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        byteString.copyInto(i, bArr, i2, i3);
    }

    public static /* synthetic */ int indexOf$default(okio.ByteString byteString, okio.ByteString byteString2, int i, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return byteString.indexOf(byteString2, i);
    }

    public final int indexOf(okio.ByteString other, int fromIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "");
        return indexOf(other.internalArray$okio(), fromIndex);
    }

    public static /* synthetic */ int indexOf$default(okio.ByteString byteString, byte[] bArr, int i, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return byteString.indexOf(bArr, i);
    }

    public static /* synthetic */ int lastIndexOf$default(okio.ByteString byteString, okio.ByteString byteString2, int i, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if ((i2 & 2) != 0) {
            i = okio.SegmentedByteString.getDEFAULT__ByteString_size();
        }
        return byteString.lastIndexOf(byteString2, i);
    }

    public static /* synthetic */ int lastIndexOf$default(okio.ByteString byteString, byte[] bArr, int i, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if ((i2 & 2) != 0) {
            i = okio.SegmentedByteString.getDEFAULT__ByteString_size();
        }
        return byteString.lastIndexOf(bArr, i);
    }

    private final void readObject(java.io.ObjectInputStream in) throws java.io.IOException {
        okio.ByteString read = INSTANCE.read(in, in.readInt());
        java.lang.reflect.Field declaredField = okio.ByteString.class.getDeclaredField(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        declaredField.setAccessible(true);
        declaredField.set(this, read.data);
    }

    private final void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeInt(this.data.length);
        out.write(this.data);
    }

    @kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00020\u0004\"\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ'\u0010\b\u001a\u00020\u0007*\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nH\u0007¢\u0006\u0004\b\b\u0010\rJ\u0013\u0010\b\u001a\u00020\u0007*\u00020\u000eH\u0007¢\u0006\u0004\b\b\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\u0007*\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u0007*\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0007*\u00020\u0010H\u0007¢\u0006\u0004\b\u0017\u0010\u0012J\u0013\u0010\u0018\u001a\u00020\u0007*\u00020\u0010H\u0007¢\u0006\u0004\b\u0018\u0010\u0012J\u001b\u0010\u001a\u001a\u00020\u0007*\u00020\u00192\u0006\u0010\f\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001c\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u001d\u0010\u0012J\u0017\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u001e\u0010\u0012J\u001f\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u001f\u0010\u0016J\u0017\u0010 \u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0010H\u0007¢\u0006\u0004\b \u0010\u0012J\u0017\u0010\"\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\"\u0010\u000fJ'\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0007¢\u0006\u0004\b\"\u0010\rJ\u001f\u0010%\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\nH\u0007¢\u0006\u0004\b%\u0010\u001bR\u0014\u0010'\u001a\u00020&8\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010(R\u0011\u0010)\u001a\u00020\u00078\u0006¢\u0006\u0006\n\u0004\b)\u0010*"}, d2 = {"Lokio/ByteString$Companion;", "", "<init>", "()V", "", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lokio/ByteString;", "of", "([B)Lokio/ByteString;", "", "offset", "byteCount", "([BII)Lokio/ByteString;", "Ljava/nio/ByteBuffer;", "(Ljava/nio/ByteBuffer;)Lokio/ByteString;", "", "encodeUtf8", "(Ljava/lang/String;)Lokio/ByteString;", "Ljava/nio/charset/Charset;", io.ktor.http.auth.HttpAuthHeader.Parameters.Charset, "encodeString", "(Ljava/lang/String;Ljava/nio/charset/Charset;)Lokio/ByteString;", "decodeBase64", "decodeHex", "Ljava/io/InputStream;", "read", "(Ljava/io/InputStream;I)Lokio/ByteString;", "string", "-deprecated_decodeBase64", "-deprecated_decodeHex", "-deprecated_encodeString", "-deprecated_encodeUtf8", "buffer", "-deprecated_of", "array", "inputstream", "-deprecated_read", "", "serialVersionUID", "J", "EMPTY", "Lokio/ByteString;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public static /* synthetic */ okio.ByteString of$default(okio.ByteString.Companion companion, byte[] bArr, int i, int i2, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = okio.SegmentedByteString.getDEFAULT__ByteString_size();
            }
            return companion.of(bArr, i, i2);
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final okio.ByteString of(java.nio.ByteBuffer byteBuffer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteBuffer, "");
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return new okio.ByteString(bArr);
        }

        public static /* synthetic */ okio.ByteString encodeString$default(okio.ByteString.Companion companion, java.lang.String str, java.nio.charset.Charset charset, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                charset = kotlin.text.Charsets.UTF_8;
            }
            return companion.encodeString(str, charset);
        }

        @kotlin.jvm.JvmStatic
        public final okio.ByteString encodeString(java.lang.String str, java.nio.charset.Charset charset) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "");
            byte[] bytes = str.getBytes(charset);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
            return new okio.ByteString(bytes);
        }

        @kotlin.jvm.JvmStatic
        public final okio.ByteString read(java.io.InputStream inputStream, int i) throws java.io.IOException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputStream, "");
            if (i < 0) {
                throw new java.lang.IllegalArgumentException("byteCount < 0: ".concat(java.lang.String.valueOf(i)).toString());
            }
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int read = inputStream.read(bArr, i2, i - i2);
                if (read == -1) {
                    throw new java.io.EOFException();
                }
                i2 += read;
            }
            return new okio.ByteString(bArr);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "string.decodeBase64()", imports = {"okio.ByteString.Companion.decodeBase64"}))
        /* renamed from: -deprecated_decodeBase64, reason: not valid java name */
        public final okio.ByteString m24434deprecated_decodeBase64(java.lang.String string) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string, "");
            return decodeBase64(string);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "string.decodeHex()", imports = {"okio.ByteString.Companion.decodeHex"}))
        /* renamed from: -deprecated_decodeHex, reason: not valid java name */
        public final okio.ByteString m24435deprecated_decodeHex(java.lang.String string) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string, "");
            return decodeHex(string);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "string.encode(charset)", imports = {"okio.ByteString.Companion.encode"}))
        /* renamed from: -deprecated_encodeString, reason: not valid java name */
        public final okio.ByteString m24436deprecated_encodeString(java.lang.String string, java.nio.charset.Charset charset) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "");
            return encodeString(string, charset);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "string.encodeUtf8()", imports = {"okio.ByteString.Companion.encodeUtf8"}))
        /* renamed from: -deprecated_encodeUtf8, reason: not valid java name */
        public final okio.ByteString m24437deprecated_encodeUtf8(java.lang.String string) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string, "");
            return encodeUtf8(string);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "buffer.toByteString()", imports = {"okio.ByteString.Companion.toByteString"}))
        /* renamed from: -deprecated_of, reason: not valid java name */
        public final okio.ByteString m24438deprecated_of(java.nio.ByteBuffer buffer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
            return of(buffer);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "array.toByteString(offset, byteCount)", imports = {"okio.ByteString.Companion.toByteString"}))
        /* renamed from: -deprecated_of, reason: not valid java name */
        public final okio.ByteString m24439deprecated_of(byte[] array, int offset, int byteCount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "");
            return of(array, offset, byteCount);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "inputstream.readByteString(byteCount)", imports = {"okio.ByteString.Companion.readByteString"}))
        /* renamed from: -deprecated_read, reason: not valid java name */
        public final okio.ByteString m24440deprecated_read(java.io.InputStream inputstream, int byteCount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputstream, "");
            return read(inputstream, byteCount);
        }

        @kotlin.jvm.JvmStatic
        public final okio.ByteString of(byte... data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            byte[] copyOf = java.util.Arrays.copyOf(data, data.length);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
            return new okio.ByteString(copyOf);
        }

        @kotlin.jvm.JvmStatic
        public final okio.ByteString of(byte[] bArr, int i, int i2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
            int resolveDefaultParameter = okio.SegmentedByteString.resolveDefaultParameter(bArr, i2);
            okio.SegmentedByteString.checkOffsetAndCount(bArr.length, i, resolveDefaultParameter);
            return new okio.ByteString(kotlin.collections.ArraysKt.copyOfRange(bArr, i, resolveDefaultParameter + i));
        }

        @kotlin.jvm.JvmStatic
        public final okio.ByteString encodeUtf8(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            okio.ByteString byteString = new okio.ByteString(okio._JvmPlatformKt.asUtf8ToByteArray(str));
            byteString.setUtf8$okio(str);
            return byteString;
        }

        @kotlin.jvm.JvmStatic
        public final okio.ByteString decodeBase64(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            byte[] decodeBase64ToArray = okio.Base64.decodeBase64ToArray(str);
            if (decodeBase64ToArray != null) {
                return new okio.ByteString(decodeBase64ToArray);
            }
            return null;
        }

        @kotlin.jvm.JvmStatic
        public final okio.ByteString decodeHex(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            if (str.length() % 2 != 0) {
                throw new java.lang.IllegalArgumentException("Unexpected hex string: ".concat(java.lang.String.valueOf(str)).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) ((okio.internal.ByteStringNonJs.access$decodeHexDigit(str.charAt(i2)) << 4) + okio.internal.ByteStringNonJs.access$decodeHexDigit(str.charAt(i2 + 1)));
            }
            return new okio.ByteString(bArr);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to operator function", replaceWith = @kotlin.ReplaceWith(expression = "this[index]", imports = {}))
    /* renamed from: -deprecated_getByte, reason: not valid java name */
    public final byte m24432deprecated_getByte(int index) {
        return getByte(index);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = io.ktor.http.ContentDisposition.Parameters.Size, imports = {}))
    /* renamed from: -deprecated_size, reason: not valid java name */
    public final int m24433deprecated_size() {
        return size();
    }

    public java.lang.String utf8() {
        java.lang.String utf8 = getUtf8();
        if (utf8 != null) {
            return utf8;
        }
        java.lang.String utf8String = okio._JvmPlatformKt.toUtf8String(internalArray$okio());
        setUtf8$okio(utf8String);
        return utf8String;
    }

    public java.lang.String base64() {
        return okio.Base64.encodeBase64$default(getData(), null, 1, null);
    }

    public java.lang.String base64Url() {
        return okio.Base64.encodeBase64(getData(), okio.Base64.getBASE64_URL_SAFE());
    }

    public java.lang.String hex() {
        char[] cArr = new char[getData().length * 2];
        byte[] data = getData();
        int length = data.length;
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            byte b = data[i2];
            cArr[i] = okio.internal.ByteString.getHEX_DIGIT_CHARS()[(b >> 4) & 15];
            cArr[i + 1] = okio.internal.ByteString.getHEX_DIGIT_CHARS()[b & com.google.common.base.Ascii.SI];
            i2++;
            i += 2;
        }
        return kotlin.text.StringsKt.concatToString(cArr);
    }

    public okio.ByteString toAsciiLowercase() {
        for (int i = 0; i < getData().length; i++) {
            byte b = getData()[i];
            if (b >= 65 && b <= 90) {
                byte[] data = getData();
                byte[] copyOf = java.util.Arrays.copyOf(data, data.length);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
                copyOf[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b2 = copyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        copyOf[i2] = (byte) (b2 + 32);
                    }
                }
                return new okio.ByteString(copyOf);
            }
        }
        return this;
    }

    public okio.ByteString toAsciiUppercase() {
        for (int i = 0; i < getData().length; i++) {
            byte b = getData()[i];
            if (b >= 97 && b <= 122) {
                byte[] data = getData();
                byte[] copyOf = java.util.Arrays.copyOf(data, data.length);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
                copyOf[i] = (byte) (b - 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b2 = copyOf[i2];
                    if (b2 >= 97 && b2 <= 122) {
                        copyOf[i2] = (byte) (b2 - 32);
                    }
                }
                return new okio.ByteString(copyOf);
            }
        }
        return this;
    }

    public okio.ByteString substring(int beginIndex, int endIndex) {
        int resolveDefaultParameter = okio.SegmentedByteString.resolveDefaultParameter(this, endIndex);
        if (beginIndex < 0) {
            throw new java.lang.IllegalArgumentException("beginIndex < 0".toString());
        }
        if (resolveDefaultParameter <= getData().length) {
            if (resolveDefaultParameter - beginIndex >= 0) {
                return (beginIndex == 0 && resolveDefaultParameter == getData().length) ? this : new okio.ByteString(kotlin.collections.ArraysKt.copyOfRange(getData(), beginIndex, resolveDefaultParameter));
            }
            throw new java.lang.IllegalArgumentException("endIndex < beginIndex".toString());
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("endIndex > length(");
        sb.append(getData().length);
        sb.append(')');
        throw new java.lang.IllegalArgumentException(sb.toString().toString());
    }

    public byte internalGet$okio(int pos) {
        return getData()[pos];
    }

    public int getSize$okio() {
        return getData().length;
    }

    public byte[] toByteArray() {
        byte[] data = getData();
        byte[] copyOf = java.util.Arrays.copyOf(data, data.length);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
        return copyOf;
    }

    public byte[] internalArray$okio() {
        return getData();
    }

    public boolean rangeEquals(int offset, okio.ByteString other, int otherOffset, int byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "");
        return other.rangeEquals(otherOffset, getData(), offset, byteCount);
    }

    public boolean rangeEquals(int offset, byte[] other, int otherOffset, int byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "");
        return offset >= 0 && offset <= getData().length - byteCount && otherOffset >= 0 && otherOffset <= other.length - byteCount && okio.SegmentedByteString.arrayRangeEquals(getData(), offset, other, otherOffset, byteCount);
    }

    public void copyInto(int offset, byte[] target, int targetOffset, int byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(target, "");
        kotlin.collections.ArraysKt.copyInto(getData(), target, targetOffset, offset, byteCount + offset);
    }

    public final boolean startsWith(okio.ByteString prefix) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prefix, "");
        return rangeEquals(0, prefix, 0, prefix.size());
    }

    public final boolean startsWith(byte[] prefix) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prefix, "");
        return rangeEquals(0, prefix, 0, prefix.length);
    }

    public final boolean endsWith(okio.ByteString suffix) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(suffix, "");
        return rangeEquals(size() - suffix.size(), suffix, 0, suffix.size());
    }

    public final boolean endsWith(byte[] suffix) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(suffix, "");
        return rangeEquals(size() - suffix.length, suffix, 0, suffix.length);
    }

    public int indexOf(byte[] other, int fromIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "");
        int length = getData().length - other.length;
        int max = java.lang.Math.max(fromIndex, 0);
        if (max > length) {
            return -1;
        }
        while (!okio.SegmentedByteString.arrayRangeEquals(getData(), max, other, 0, other.length)) {
            if (max == length) {
                return -1;
            }
            max++;
        }
        return max;
    }

    public final int lastIndexOf(okio.ByteString other, int fromIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "");
        return lastIndexOf(other.internalArray$okio(), fromIndex);
    }

    public int lastIndexOf(byte[] other, int fromIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "");
        for (int min = java.lang.Math.min(okio.SegmentedByteString.resolveDefaultParameter(this, fromIndex), getData().length - other.length); min >= 0; min--) {
            if (okio.SegmentedByteString.arrayRangeEquals(getData(), min, other, 0, other.length)) {
                return min;
            }
        }
        return -1;
    }

    public boolean equals(java.lang.Object other) {
        if (other == this) {
            return true;
        }
        if (other instanceof okio.ByteString) {
            okio.ByteString byteString = (okio.ByteString) other;
            if (byteString.size() == getData().length && byteString.rangeEquals(0, getData(), 0, getData().length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = getHashCode();
        if (hashCode != 0) {
            return hashCode;
        }
        int hashCode2 = java.util.Arrays.hashCode(getData());
        setHashCode$okio(hashCode2);
        return hashCode2;
    }

    @Override // java.lang.Comparable
    public int compareTo(okio.ByteString other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "");
        int size = size();
        int size2 = other.size();
        int min = java.lang.Math.min(size, size2);
        for (int i = 0; i < min; i++) {
            int i2 = getByte(i) & 255;
            int i3 = other.getByte(i) & 255;
            if (i2 != i3) {
                return i2 < i3 ? -1 : 1;
            }
        }
        if (size == size2) {
            return 0;
        }
        return size < size2 ? -1 : 1;
    }

    public java.lang.String toString() {
        if (getData().length == 0) {
            return "[size=0]";
        }
        int access$codePointIndexToCharIndex = okio.internal.ByteString.access$codePointIndexToCharIndex(getData(), 64);
        if (access$codePointIndexToCharIndex == -1) {
            if (getData().length <= 64) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("[hex=");
                sb.append(hex());
                sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
                return sb.toString();
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("[size=");
            sb2.append(getData().length);
            sb2.append(" hex=");
            int resolveDefaultParameter = okio.SegmentedByteString.resolveDefaultParameter(this, 64);
            if (resolveDefaultParameter > getData().length) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("endIndex > length(");
                sb3.append(getData().length);
                sb3.append(')');
                throw new java.lang.IllegalArgumentException(sb3.toString().toString());
            }
            if (resolveDefaultParameter >= 0) {
                sb2.append((resolveDefaultParameter == getData().length ? this : new okio.ByteString(kotlin.collections.ArraysKt.copyOfRange(getData(), 0, resolveDefaultParameter))).hex());
                sb2.append("…]");
                return sb2.toString();
            }
            throw new java.lang.IllegalArgumentException("endIndex < beginIndex".toString());
        }
        java.lang.String utf8 = utf8();
        java.lang.String substring = utf8.substring(0, access$codePointIndexToCharIndex);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        java.lang.String replace$default = kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(substring, "\\", "\\\\", false, 4, (java.lang.Object) null), com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, "\\n", false, 4, (java.lang.Object) null), "\r", "\\r", false, 4, (java.lang.Object) null);
        if (access$codePointIndexToCharIndex < utf8.length()) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("[size=");
            sb4.append(getData().length);
            sb4.append(" text=");
            sb4.append(replace$default);
            sb4.append("…]");
            return sb4.toString();
        }
        java.lang.StringBuilder sb5 = new java.lang.StringBuilder("[text=");
        sb5.append(replace$default);
        sb5.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        return sb5.toString();
    }

    public final okio.ByteString substring(int i) {
        return substring$default(this, i, 0, 2, null);
    }

    public final okio.ByteString substring() {
        return substring$default(this, 0, 0, 3, null);
    }

    public final int lastIndexOf(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        return lastIndexOf$default(this, bArr, 0, 2, (java.lang.Object) null);
    }

    public final int lastIndexOf(okio.ByteString byteString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        return lastIndexOf$default(this, byteString, 0, 2, (java.lang.Object) null);
    }

    public final int indexOf(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        return indexOf$default(this, bArr, 0, 2, (java.lang.Object) null);
    }

    public final int indexOf(okio.ByteString byteString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        return indexOf$default(this, byteString, 0, 2, (java.lang.Object) null);
    }

    @kotlin.jvm.JvmStatic
    public static final okio.ByteString read(java.io.InputStream inputStream, int i) throws java.io.IOException {
        return INSTANCE.read(inputStream, i);
    }

    @kotlin.jvm.JvmStatic
    public static final okio.ByteString of(byte[] bArr, int i, int i2) {
        return INSTANCE.of(bArr, i, i2);
    }

    @kotlin.jvm.JvmStatic
    public static final okio.ByteString of(byte... bArr) {
        return INSTANCE.of(bArr);
    }

    @kotlin.jvm.JvmStatic
    public static final okio.ByteString of(java.nio.ByteBuffer byteBuffer) {
        return INSTANCE.of(byteBuffer);
    }

    @kotlin.jvm.JvmStatic
    public static final okio.ByteString encodeUtf8(java.lang.String str) {
        return INSTANCE.encodeUtf8(str);
    }

    @kotlin.jvm.JvmStatic
    public static final okio.ByteString encodeString(java.lang.String str, java.nio.charset.Charset charset) {
        return INSTANCE.encodeString(str, charset);
    }

    @kotlin.jvm.JvmStatic
    public static final okio.ByteString decodeHex(java.lang.String str) {
        return INSTANCE.decodeHex(str);
    }

    @kotlin.jvm.JvmStatic
    public static final okio.ByteString decodeBase64(java.lang.String str) {
        return INSTANCE.decodeBase64(str);
    }
}
