package okio;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0001 B\u0019\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nB\u0019\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\rB!\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001f\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0018"}, d2 = {"Lokio/HashingSource;", "Lokio/ForwardingSource;", "Lokio/Source;", "source", "Ljava/security/MessageDigest;", org.bouncycastle.cms.CMSAttributeTableGenerator.DIGEST, "<init>", "(Lokio/Source;Ljava/security/MessageDigest;)V", "", "algorithm", "(Lokio/Source;Ljava/lang/String;)V", "Ljavax/crypto/Mac;", "mac", "(Lokio/Source;Ljavax/crypto/Mac;)V", "Lokio/ByteString;", "key", "(Lokio/Source;Lokio/ByteString;Ljava/lang/String;)V", "Lokio/Buffer;", "sink", "", "byteCount", "read", "(Lokio/Buffer;J)J", "-deprecated_hash", "()Lokio/ByteString;", "Camera2StreamConfigurationMap", "Ljava/security/MessageDigest;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Ljavax/crypto/Mac;", "getHighSpeedVideoSizes", "hash", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HashingSource extends okio.ForwardingSource implements okio.Source {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okio.HashingSource.Companion INSTANCE = new okio.HashingSource.Companion(null);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.security.MessageDigest getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final javax.crypto.Mac getHighSpeedVideoSizes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashingSource(okio.Source source, java.security.MessageDigest messageDigest) {
        super(source);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageDigest, "");
        this.getHighResolutionOutputSizeshNQ4ISI = messageDigest;
        this.getHighSpeedVideoSizes = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HashingSource(okio.Source source, java.lang.String str) {
        this(source, r3);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance(str);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(messageDigest, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashingSource(okio.Source source, javax.crypto.Mac mac) {
        super(source);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mac, "");
        this.getHighSpeedVideoSizes = mac;
        this.getHighResolutionOutputSizeshNQ4ISI = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HashingSource(okio.Source source, okio.ByteString byteString, java.lang.String str) {
        this(source, r0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        try {
            javax.crypto.Mac mac = javax.crypto.Mac.getInstance(str);
            mac.init(new javax.crypto.spec.SecretKeySpec(byteString.toByteArray(), str));
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkNotNull(mac);
        } catch (java.security.InvalidKeyException e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    @Override // okio.ForwardingSource, okio.Source
    public final long read(okio.Buffer sink, long byteCount) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
        long read = super.read(sink, byteCount);
        if (read != -1) {
            long size = sink.size() - read;
            long size2 = sink.size();
            okio.Segment segment = sink.head;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
            while (size2 > size) {
                segment = segment.prev;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                size2 -= segment.limit - segment.pos;
            }
            while (size2 < sink.size()) {
                int i = (int) ((segment.pos + size) - size2);
                java.security.MessageDigest messageDigest = this.getHighResolutionOutputSizeshNQ4ISI;
                if (messageDigest != null) {
                    messageDigest.update(segment.data, i, segment.limit - i);
                } else {
                    javax.crypto.Mac mac = this.getHighSpeedVideoSizes;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(mac);
                    mac.update(segment.data, i, segment.limit - i);
                }
                size2 += segment.limit - segment.pos;
                segment = segment.next;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
                size = size2;
            }
        }
        return read;
    }

    public final okio.ByteString hash() {
        byte[] doFinal;
        java.security.MessageDigest messageDigest = this.getHighResolutionOutputSizeshNQ4ISI;
        if (messageDigest != null) {
            doFinal = messageDigest.digest();
        } else {
            javax.crypto.Mac mac = this.getHighSpeedVideoSizes;
            kotlin.jvm.internal.Intrinsics.checkNotNull(mac);
            doFinal = mac.doFinal();
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(doFinal);
        return new okio.ByteString(doFinal);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "hash", imports = {}))
    /* renamed from: -deprecated_hash, reason: not valid java name */
    public final okio.ByteString m24449deprecated_hash() {
        return hash();
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\bJ\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0010\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0011\u0010\u000f"}, d2 = {"Lokio/HashingSource$Companion;", "", "<init>", "()V", "Lokio/Source;", "source", "Lokio/HashingSource;", "md5", "(Lokio/Source;)Lokio/HashingSource;", "sha1", "sha256", "sha512", "Lokio/ByteString;", "key", "hmacSha1", "(Lokio/Source;Lokio/ByteString;)Lokio/HashingSource;", "hmacSha256", "hmacSha512"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final okio.HashingSource md5(okio.Source source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            return new okio.HashingSource(source, "MD5");
        }

        @kotlin.jvm.JvmStatic
        public final okio.HashingSource sha1(okio.Source source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            return new okio.HashingSource(source, "SHA-1");
        }

        @kotlin.jvm.JvmStatic
        public final okio.HashingSource sha256(okio.Source source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            return new okio.HashingSource(source, "SHA-256");
        }

        @kotlin.jvm.JvmStatic
        public final okio.HashingSource sha512(okio.Source source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            return new okio.HashingSource(source, "SHA-512");
        }

        @kotlin.jvm.JvmStatic
        public final okio.HashingSource hmacSha1(okio.Source source, okio.ByteString key) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            return new okio.HashingSource(source, key, "HmacSHA1");
        }

        @kotlin.jvm.JvmStatic
        public final okio.HashingSource hmacSha256(okio.Source source, okio.ByteString key) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            return new okio.HashingSource(source, key, org.jose4j.mac.MacUtil.HMAC_SHA256);
        }

        @kotlin.jvm.JvmStatic
        public final okio.HashingSource hmacSha512(okio.Source source, okio.ByteString key) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            return new okio.HashingSource(source, key, org.jose4j.mac.MacUtil.HMAC_SHA512);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final okio.HashingSource sha512(okio.Source source) {
        return INSTANCE.sha512(source);
    }

    @kotlin.jvm.JvmStatic
    public static final okio.HashingSource sha256(okio.Source source) {
        return INSTANCE.sha256(source);
    }

    @kotlin.jvm.JvmStatic
    public static final okio.HashingSource sha1(okio.Source source) {
        return INSTANCE.sha1(source);
    }

    @kotlin.jvm.JvmStatic
    public static final okio.HashingSource md5(okio.Source source) {
        return INSTANCE.md5(source);
    }

    @kotlin.jvm.JvmStatic
    public static final okio.HashingSource hmacSha512(okio.Source source, okio.ByteString byteString) {
        return INSTANCE.hmacSha512(source, byteString);
    }

    @kotlin.jvm.JvmStatic
    public static final okio.HashingSource hmacSha256(okio.Source source, okio.ByteString byteString) {
        return INSTANCE.hmacSha256(source, byteString);
    }

    @kotlin.jvm.JvmStatic
    public static final okio.HashingSource hmacSha1(okio.Source source, okio.ByteString byteString) {
        return INSTANCE.hmacSha1(source, byteString);
    }
}
