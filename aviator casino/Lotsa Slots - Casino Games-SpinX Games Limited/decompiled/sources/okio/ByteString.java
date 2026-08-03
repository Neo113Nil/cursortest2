package okio;

/* compiled from: ByteString.kt */
@kotlin.Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 ]2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001]B\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0010H\u0016J\b\u0010\u0018\u001a\u00020\u0010H\u0016J\u0011\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0000H\u0096\u0002J,\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\tH\u0016J\u0015\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u0010H\u0010¢\u0006\u0002\b#J\u000e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0004J\u000e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0000J\u0013\u0010'\u001a\u00020%2\b\u0010\u001a\u001a\u0004\u0018\u00010(H\u0096\u0002J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\tH\u0087\u0002¢\u0006\u0002\b,J\u0015\u0010,\u001a\u00020*2\u0006\u0010+\u001a\u00020\tH\u0007¢\u0006\u0002\b-J\r\u0010.\u001a\u00020\tH\u0010¢\u0006\u0002\b/J\b\u0010\b\u001a\u00020\tH\u0016J\b\u00100\u001a\u00020\u0010H\u0016J\u001d\u00101\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u00102\u0006\u00102\u001a\u00020\u0000H\u0010¢\u0006\u0002\b3J\u0010\u00104\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u0000H\u0016J\u0010\u00105\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u0000H\u0016J\u0010\u00106\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u0000H\u0016J\u001a\u00107\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u00108\u001a\u00020\tH\u0017J\u001a\u00107\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u00108\u001a\u00020\tH\u0007J\r\u00109\u001a\u00020\u0004H\u0010¢\u0006\u0002\b:J\u0015\u0010;\u001a\u00020*2\u0006\u0010<\u001a\u00020\tH\u0010¢\u0006\u0002\b=J\u001a\u0010>\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u00108\u001a\u00020\tH\u0017J\u001a\u0010>\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u00108\u001a\u00020\tH\u0007J\u0006\u0010?\u001a\u00020\u0000J(\u0010@\u001a\u00020%2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010A\u001a\u00020\t2\u0006\u0010 \u001a\u00020\tH\u0016J(\u0010@\u001a\u00020%2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010A\u001a\u00020\t2\u0006\u0010 \u001a\u00020\tH\u0016J\u0010\u0010B\u001a\u00020\u001c2\u0006\u0010C\u001a\u00020DH\u0002J\u0006\u0010E\u001a\u00020\u0000J\u0006\u0010F\u001a\u00020\u0000J\u0006\u0010G\u001a\u00020\u0000J\r\u0010\u000e\u001a\u00020\tH\u0007¢\u0006\u0002\bHJ\u000e\u0010I\u001a\u00020%2\u0006\u0010J\u001a\u00020\u0004J\u000e\u0010I\u001a\u00020%2\u0006\u0010J\u001a\u00020\u0000J\u0010\u0010K\u001a\u00020\u00102\u0006\u0010L\u001a\u00020MH\u0016J\u001c\u0010N\u001a\u00020\u00002\b\b\u0002\u0010O\u001a\u00020\t2\b\b\u0002\u0010P\u001a\u00020\tH\u0017J\b\u0010Q\u001a\u00020\u0000H\u0016J\b\u0010R\u001a\u00020\u0000H\u0016J\b\u0010S\u001a\u00020\u0004H\u0016J\b\u0010T\u001a\u00020\u0010H\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010U\u001a\u00020\u001c2\u0006\u0010V\u001a\u00020WH\u0016J%\u0010U\u001a\u00020\u001c2\u0006\u0010X\u001a\u00020Y2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010 \u001a\u00020\tH\u0010¢\u0006\u0002\bZJ\u0010\u0010[\u001a\u00020\u001c2\u0006\u0010V\u001a\u00020\\H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006^"}, d2 = {"Lokio/ByteString;", "Ljava/io/Serializable;", "", "data", "", "([B)V", "getData$okio", "()[B", "hashCode", "", "getHashCode$okio", "()I", "setHashCode$okio", "(I)V", "size", "utf8", "", "getUtf8$okio", "()Ljava/lang/String;", "setUtf8$okio", "(Ljava/lang/String;)V", "asByteBuffer", "Ljava/nio/ByteBuffer;", "base64", "base64Url", "compareTo", "other", "copyInto", "", "offset", "target", "targetOffset", "byteCount", "digest", "algorithm", "digest$okio", "endsWith", "", "suffix", "equals", "", "get", "", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "getByte", "-deprecated_getByte", "getSize", "getSize$okio", "hex", "hmac", com.ironsource.X3.i.W, "hmac$okio", "hmacSha1", "hmacSha256", "hmacSha512", "indexOf", "fromIndex", "internalArray", "internalArray$okio", "internalGet", "pos", "internalGet$okio", "lastIndexOf", "md5", "rangeEquals", "otherOffset", "readObject", com.unity3d.services.ads.gmascar.utils.ScarConstants.IN_SIGNAL_KEY, "Ljava/io/ObjectInputStream;", "sha1", "sha256", "sha512", "-deprecated_size", "startsWith", "prefix", "string", "charset", "Ljava/nio/charset/Charset;", "substring", "beginIndex", "endIndex", "toAsciiLowercase", "toAsciiUppercase", "toByteArray", "toString", "write", "out", "Ljava/io/OutputStream;", "buffer", "Lokio/Buffer;", "write$okio", "writeObject", "Ljava/io/ObjectOutputStream;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public class ByteString implements java.io.Serializable, java.lang.Comparable<okio.ByteString> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okio.ByteString.Companion INSTANCE = new okio.ByteString.Companion(null);
    public static final okio.ByteString EMPTY = new okio.ByteString(new byte[0]);
    private static final long serialVersionUID = 1;
    private final byte[] data;
    private transient int hashCode;
    private transient java.lang.String utf8;

    @kotlin.jvm.JvmStatic
    public static final okio.ByteString decodeBase64(java.lang.String str) {
        return INSTANCE.decodeBase64(str);
    }

    @kotlin.jvm.JvmStatic
    public static final okio.ByteString decodeHex(java.lang.String str) {
        return INSTANCE.decodeHex(str);
    }

    @kotlin.jvm.JvmStatic
    public static final okio.ByteString encodeString(java.lang.String str, java.nio.charset.Charset charset) {
        return INSTANCE.encodeString(str, charset);
    }

    @kotlin.jvm.JvmStatic
    public static final okio.ByteString encodeUtf8(java.lang.String str) {
        return INSTANCE.encodeUtf8(str);
    }

    @kotlin.jvm.JvmStatic
    public static final okio.ByteString of(java.nio.ByteBuffer byteBuffer) {
        return INSTANCE.of(byteBuffer);
    }

    @kotlin.jvm.JvmStatic
    public static final okio.ByteString of(byte... bArr) {
        return INSTANCE.of(bArr);
    }

    @kotlin.jvm.JvmStatic
    public static final okio.ByteString of(byte[] bArr, int i, int i2) {
        return INSTANCE.of(bArr, i, i2);
    }

    @kotlin.jvm.JvmStatic
    public static final okio.ByteString read(java.io.InputStream inputStream, int i) throws java.io.IOException {
        return INSTANCE.read(inputStream, i);
    }

    public final int indexOf(okio.ByteString other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        return indexOf$default(this, other, 0, 2, (java.lang.Object) null);
    }

    public final int indexOf(byte[] other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        return indexOf$default(this, other, 0, 2, (java.lang.Object) null);
    }

    public final int lastIndexOf(okio.ByteString other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        return lastIndexOf$default(this, other, 0, 2, (java.lang.Object) null);
    }

    public final int lastIndexOf(byte[] other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        return lastIndexOf$default(this, other, 0, 2, (java.lang.Object) null);
    }

    public final okio.ByteString substring() {
        return substring$default(this, 0, 0, 3, null);
    }

    public final okio.ByteString substring(int i) {
        return substring$default(this, i, 0, 2, null);
    }

    public ByteString(byte[] data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
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
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        return new java.lang.String(this.data, charset);
    }

    public final okio.ByteString md5() {
        return digest$okio("MD5");
    }

    public final okio.ByteString sha1() {
        return digest$okio(com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
    }

    public final okio.ByteString sha256() {
        return digest$okio("SHA-256");
    }

    public final okio.ByteString sha512() {
        return digest$okio("SHA-512");
    }

    public okio.ByteString digest$okio(java.lang.String algorithm) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance(algorithm);
        messageDigest.update(this.data, 0, size());
        byte[] digest = messageDigest.digest();
        kotlin.jvm.internal.Intrinsics.checkNotNull(digest);
        return new okio.ByteString(digest);
    }

    public okio.ByteString hmacSha1(okio.ByteString key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        return hmac$okio("HmacSHA1", key);
    }

    public okio.ByteString hmacSha256(okio.ByteString key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        return hmac$okio("HmacSHA256", key);
    }

    public okio.ByteString hmacSha512(okio.ByteString key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        return hmac$okio("HmacSHA512", key);
    }

    public okio.ByteString hmac$okio(java.lang.String algorithm, okio.ByteString key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        try {
            javax.crypto.Mac mac = javax.crypto.Mac.getInstance(algorithm);
            mac.init(new javax.crypto.spec.SecretKeySpec(key.toByteArray(), algorithm));
            byte[] doFinal = mac.doFinal(this.data);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(doFinal, "doFinal(...)");
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
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asReadOnlyBuffer, "asReadOnlyBuffer(...)");
        return asReadOnlyBuffer;
    }

    public void write(java.io.OutputStream out) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(out, "out");
        out.write(this.data);
    }

    public void write$okio(okio.Buffer buffer, int offset, int byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "buffer");
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
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
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
        java.lang.reflect.Field declaredField = okio.ByteString.class.getDeclaredField("data");
        declaredField.setAccessible(true);
        declaredField.set(this, read.data);
    }

    private final void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        out.writeInt(this.data.length);
        out.write(this.data);
    }

    /* compiled from: ByteString.kt */
    @kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\nJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\fJ\u001d\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\b\u0010J\u0015\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\u0012J\u0015\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0015H\u0007¢\u0006\u0002\b\u0016J\u0014\u0010\u0013\u001a\u00020\u00042\n\u0010\u0017\u001a\u00020\u0018\"\u00020\u0019H\u0007J%\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0002\b\u0016J\u001d\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0002\b!J\u000e\u0010\u0007\u001a\u0004\u0018\u00010\u0004*\u00020\tH\u0007J\f\u0010\u000b\u001a\u00020\u0004*\u00020\tH\u0007J\u001b\u0010\"\u001a\u00020\u0004*\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\b\rJ\f\u0010\u0011\u001a\u00020\u0004*\u00020\tH\u0007J\u0019\u0010#\u001a\u00020\u0004*\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0002\b\u001eJ\u0011\u0010$\u001a\u00020\u0004*\u00020\u0015H\u0007¢\u0006\u0002\b\u0013J%\u0010$\u001a\u00020\u0004*\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0002\b\u0013R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lokio/ByteString$Companion;", "", "()V", "EMPTY", "Lokio/ByteString;", "serialVersionUID", "", "decodeBase64", "string", "", "-deprecated_decodeBase64", "decodeHex", "-deprecated_decodeHex", "encodeString", "charset", "Ljava/nio/charset/Charset;", "-deprecated_encodeString", "encodeUtf8", "-deprecated_encodeUtf8", "of", "buffer", "Ljava/nio/ByteBuffer;", "-deprecated_of", "data", "", "", "array", "offset", "", "byteCount", "read", "inputstream", "Ljava/io/InputStream;", "-deprecated_read", "encode", "readByteString", "toByteString", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

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
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
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
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            return new okio.ByteString(bytes);
        }

        @kotlin.jvm.JvmStatic
        public final okio.ByteString read(java.io.InputStream inputStream, int i) throws java.io.IOException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputStream, "<this>");
            if (i < 0) {
                throw new java.lang.IllegalArgumentException(("byteCount < 0: " + i).toString());
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
        public final okio.ByteString m12595deprecated_decodeBase64(java.lang.String string) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string, "string");
            return decodeBase64(string);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "string.decodeHex()", imports = {"okio.ByteString.Companion.decodeHex"}))
        /* renamed from: -deprecated_decodeHex, reason: not valid java name */
        public final okio.ByteString m12596deprecated_decodeHex(java.lang.String string) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string, "string");
            return decodeHex(string);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "string.encode(charset)", imports = {"okio.ByteString.Companion.encode"}))
        /* renamed from: -deprecated_encodeString, reason: not valid java name */
        public final okio.ByteString m12597deprecated_encodeString(java.lang.String string, java.nio.charset.Charset charset) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string, "string");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
            return encodeString(string, charset);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "string.encodeUtf8()", imports = {"okio.ByteString.Companion.encodeUtf8"}))
        /* renamed from: -deprecated_encodeUtf8, reason: not valid java name */
        public final okio.ByteString m12598deprecated_encodeUtf8(java.lang.String string) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string, "string");
            return encodeUtf8(string);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "buffer.toByteString()", imports = {"okio.ByteString.Companion.toByteString"}))
        /* renamed from: -deprecated_of, reason: not valid java name */
        public final okio.ByteString m12599deprecated_of(java.nio.ByteBuffer buffer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "buffer");
            return of(buffer);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "array.toByteString(offset, byteCount)", imports = {"okio.ByteString.Companion.toByteString"}))
        /* renamed from: -deprecated_of, reason: not valid java name */
        public final okio.ByteString m12600deprecated_of(byte[] array, int offset, int byteCount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "array");
            return of(array, offset, byteCount);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "inputstream.readByteString(byteCount)", imports = {"okio.ByteString.Companion.readByteString"}))
        /* renamed from: -deprecated_read, reason: not valid java name */
        public final okio.ByteString m12601deprecated_read(java.io.InputStream inputstream, int byteCount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputstream, "inputstream");
            return read(inputstream, byteCount);
        }

        @kotlin.jvm.JvmStatic
        public final okio.ByteString of(byte... data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
            byte[] copyOf = java.util.Arrays.copyOf(data, data.length);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            return new okio.ByteString(copyOf);
        }

        @kotlin.jvm.JvmStatic
        public final okio.ByteString of(byte[] bArr, int i, int i2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "<this>");
            int resolveDefaultParameter = okio.SegmentedByteString.resolveDefaultParameter(bArr, i2);
            okio.SegmentedByteString.checkOffsetAndCount(bArr.length, i, resolveDefaultParameter);
            return new okio.ByteString(kotlin.collections.ArraysKt.copyOfRange(bArr, i, resolveDefaultParameter + i));
        }

        @kotlin.jvm.JvmStatic
        public final okio.ByteString encodeUtf8(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
            okio.ByteString byteString = new okio.ByteString(okio._JvmPlatformKt.asUtf8ToByteArray(str));
            byteString.setUtf8$okio(str);
            return byteString;
        }

        @kotlin.jvm.JvmStatic
        public final okio.ByteString decodeBase64(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
            byte[] decodeBase64ToArray = okio.Base64.decodeBase64ToArray(str);
            if (decodeBase64ToArray != null) {
                return new okio.ByteString(decodeBase64ToArray);
            }
            return null;
        }

        @kotlin.jvm.JvmStatic
        public final okio.ByteString decodeHex(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
            if (str.length() % 2 != 0) {
                throw new java.lang.IllegalArgumentException(("Unexpected hex string: " + str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) ((okio.internal.ByteString.decodeHexDigit(str.charAt(i2)) << 4) + okio.internal.ByteString.decodeHexDigit(str.charAt(i2 + 1)));
            }
            return new okio.ByteString(bArr);
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to operator function", replaceWith = @kotlin.ReplaceWith(expression = "this[index]", imports = {}))
    /* renamed from: -deprecated_getByte, reason: not valid java name */
    public final byte m12593deprecated_getByte(int index) {
        return getByte(index);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "size", imports = {}))
    /* renamed from: -deprecated_size, reason: not valid java name */
    public final int m12594deprecated_size() {
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
        int i = 0;
        for (byte b : getData()) {
            int i2 = i + 1;
            cArr[i] = okio.internal.ByteString.getHEX_DIGIT_CHARS()[(b >> 4) & 15];
            i += 2;
            cArr[i2] = okio.internal.ByteString.getHEX_DIGIT_CHARS()[b & com.google.common.base.Ascii.SI];
        }
        return kotlin.text.StringsKt.concatToString(cArr);
    }

    public okio.ByteString toAsciiLowercase() {
        for (int i = 0; i < getData().length; i++) {
            byte b = getData()[i];
            if (b >= 65 && b <= 90) {
                byte[] data = getData();
                byte[] copyOf = java.util.Arrays.copyOf(data, data.length);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
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
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
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
        throw new java.lang.IllegalArgumentException(("endIndex > length(" + getData().length + ')').toString());
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
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return copyOf;
    }

    public byte[] internalArray$okio() {
        return getData();
    }

    public boolean rangeEquals(int offset, okio.ByteString other, int otherOffset, int byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        return other.rangeEquals(otherOffset, getData(), offset, byteCount);
    }

    public boolean rangeEquals(int offset, byte[] other, int otherOffset, int byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        return offset >= 0 && offset <= getData().length - byteCount && otherOffset >= 0 && otherOffset <= other.length - byteCount && okio.SegmentedByteString.arrayRangeEquals(getData(), offset, other, otherOffset, byteCount);
    }

    public void copyInto(int offset, byte[] target, int targetOffset, int byteCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(target, "target");
        kotlin.collections.ArraysKt.copyInto(getData(), target, targetOffset, offset, byteCount + offset);
    }

    public final boolean startsWith(okio.ByteString prefix) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prefix, "prefix");
        return rangeEquals(0, prefix, 0, prefix.size());
    }

    public final boolean startsWith(byte[] prefix) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prefix, "prefix");
        return rangeEquals(0, prefix, 0, prefix.length);
    }

    public final boolean endsWith(okio.ByteString suffix) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(suffix, "suffix");
        return rangeEquals(size() - suffix.size(), suffix, 0, suffix.size());
    }

    public final boolean endsWith(byte[] suffix) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(suffix, "suffix");
        return rangeEquals(size() - suffix.length, suffix, 0, suffix.length);
    }

    public int indexOf(byte[] other, int fromIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        int length = getData().length - other.length;
        int max = java.lang.Math.max(fromIndex, 0);
        if (max <= length) {
            while (!okio.SegmentedByteString.arrayRangeEquals(getData(), max, other, 0, other.length)) {
                if (max != length) {
                    max++;
                }
            }
            return max;
        }
        return -1;
    }

    public final int lastIndexOf(okio.ByteString other, int fromIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        return lastIndexOf(other.internalArray$okio(), fromIndex);
    }

    public int lastIndexOf(byte[] other, int fromIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        for (int min = java.lang.Math.min(okio.SegmentedByteString.resolveDefaultParameter(this, fromIndex), getData().length - other.length); -1 < min; min--) {
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

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032 A[ORIG_RETURN, RETURN] */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int compareTo(okio.ByteString other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
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
        if (size < size2) {
        }
    }

    public java.lang.String toString() {
        java.lang.String str;
        if (getData().length == 0) {
            str = "[size=0]";
        } else {
            int codePointIndexToCharIndex = okio.internal.ByteString.codePointIndexToCharIndex(getData(), 64);
            if (codePointIndexToCharIndex == -1) {
                if (getData().length <= 64) {
                    str = "[hex=" + hex() + kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST;
                } else {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("[size=");
                    sb.append(getData().length);
                    sb.append(" hex=");
                    int resolveDefaultParameter = okio.SegmentedByteString.resolveDefaultParameter(this, 64);
                    if (resolveDefaultParameter > getData().length) {
                        throw new java.lang.IllegalArgumentException(("endIndex > length(" + getData().length + ')').toString());
                    }
                    if (resolveDefaultParameter >= 0) {
                        sb.append((resolveDefaultParameter == getData().length ? this : new okio.ByteString(kotlin.collections.ArraysKt.copyOfRange(getData(), 0, resolveDefaultParameter))).hex());
                        sb.append("…]");
                        return sb.toString();
                    }
                    throw new java.lang.IllegalArgumentException("endIndex < beginIndex".toString());
                }
            } else {
                java.lang.String utf8 = utf8();
                java.lang.String substring = utf8.substring(0, codePointIndexToCharIndex);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                java.lang.String replace$default = kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(substring, "\\", "\\\\", false, 4, (java.lang.Object) null), "\n", "\\n", false, 4, (java.lang.Object) null), "\r", "\\r", false, 4, (java.lang.Object) null);
                if (codePointIndexToCharIndex < utf8.length()) {
                    return "[size=" + getData().length + " text=" + replace$default + "…]";
                }
                return "[text=" + replace$default + kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST;
            }
        }
        return str;
    }
}
