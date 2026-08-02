package okio;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001\u001fB\u0019\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nB\u0019\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\rB!\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\u0010J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0019"}, d2 = {"Lokio/HashingSink;", "Lokio/ForwardingSink;", "Lokio/Sink;", "sink", "Ljava/security/MessageDigest;", org.bouncycastle.cms.CMSAttributeTableGenerator.DIGEST, "<init>", "(Lokio/Sink;Ljava/security/MessageDigest;)V", "", "algorithm", "(Lokio/Sink;Ljava/lang/String;)V", "Ljavax/crypto/Mac;", "mac", "(Lokio/Sink;Ljavax/crypto/Mac;)V", "Lokio/ByteString;", "key", "(Lokio/Sink;Lokio/ByteString;Ljava/lang/String;)V", "Lokio/Buffer;", "source", "", "byteCount", "", "write", "(Lokio/Buffer;J)V", "-deprecated_hash", "()Lokio/ByteString;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/security/MessageDigest;", "getHighSpeedVideoSizes", "Ljavax/crypto/Mac;", "hash", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HashingSink extends okio.ForwardingSink implements okio.Sink {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okio.HashingSink.Companion INSTANCE = new okio.HashingSink.Companion(null);
    private final java.security.MessageDigest getHighResolutionOutputSizeshNQ4ISI;
    private final javax.crypto.Mac getHighSpeedVideoSizes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashingSink(okio.Sink sink, java.security.MessageDigest messageDigest) {
        super(sink);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageDigest, "");
        this.getHighResolutionOutputSizeshNQ4ISI = messageDigest;
        this.getHighSpeedVideoSizes = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HashingSink(okio.Sink sink, java.lang.String str) {
        this(sink, r3);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance(str);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(messageDigest, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashingSink(okio.Sink sink, javax.crypto.Mac mac) {
        super(sink);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mac, "");
        this.getHighSpeedVideoSizes = mac;
        this.getHighResolutionOutputSizeshNQ4ISI = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HashingSink(okio.Sink sink, okio.ByteString byteString, java.lang.String str) {
        this(sink, r0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
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

    @Override // okio.ForwardingSink, okio.Sink
    public final void write(okio.Buffer source, long byteCount) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        okio.SegmentedByteString.checkOffsetAndCount(source.size(), 0L, byteCount);
        okio.Segment segment = source.head;
        kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
        long j = 0;
        while (j < byteCount) {
            int min = (int) java.lang.Math.min(byteCount - j, segment.limit - segment.pos);
            java.security.MessageDigest messageDigest = this.getHighResolutionOutputSizeshNQ4ISI;
            if (messageDigest != null) {
                messageDigest.update(segment.data, segment.pos, min);
            } else {
                javax.crypto.Mac mac = this.getHighSpeedVideoSizes;
                kotlin.jvm.internal.Intrinsics.checkNotNull(mac);
                mac.update(segment.data, segment.pos, min);
            }
            j += min;
            segment = segment.next;
            kotlin.jvm.internal.Intrinsics.checkNotNull(segment);
        }
        super.write(source, byteCount);
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
    public final okio.ByteString m24448deprecated_hash() {
        return hash();
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\bJ\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0010\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0011\u0010\u000f"}, d2 = {"Lokio/HashingSink$Companion;", "", "<init>", "()V", "Lokio/Sink;", "sink", "Lokio/HashingSink;", "md5", "(Lokio/Sink;)Lokio/HashingSink;", "sha1", "sha256", "sha512", "Lokio/ByteString;", "key", "hmacSha1", "(Lokio/Sink;Lokio/ByteString;)Lokio/HashingSink;", "hmacSha256", "hmacSha512"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final okio.HashingSink md5(okio.Sink sink) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
            return new okio.HashingSink(sink, "MD5");
        }

        @kotlin.jvm.JvmStatic
        public final okio.HashingSink sha1(okio.Sink sink) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
            return new okio.HashingSink(sink, "SHA-1");
        }

        @kotlin.jvm.JvmStatic
        public final okio.HashingSink sha256(okio.Sink sink) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
            return new okio.HashingSink(sink, "SHA-256");
        }

        @kotlin.jvm.JvmStatic
        public final okio.HashingSink sha512(okio.Sink sink) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
            return new okio.HashingSink(sink, "SHA-512");
        }

        @kotlin.jvm.JvmStatic
        public final okio.HashingSink hmacSha1(okio.Sink sink, okio.ByteString key) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            return new okio.HashingSink(sink, key, "HmacSHA1");
        }

        @kotlin.jvm.JvmStatic
        public final okio.HashingSink hmacSha256(okio.Sink sink, okio.ByteString key) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            return new okio.HashingSink(sink, key, org.jose4j.mac.MacUtil.HMAC_SHA256);
        }

        @kotlin.jvm.JvmStatic
        public final okio.HashingSink hmacSha512(okio.Sink sink, okio.ByteString key) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            return new okio.HashingSink(sink, key, org.jose4j.mac.MacUtil.HMAC_SHA512);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final okio.HashingSink sha512(okio.Sink sink) {
        return INSTANCE.sha512(sink);
    }

    @kotlin.jvm.JvmStatic
    public static final okio.HashingSink sha256(okio.Sink sink) {
        return INSTANCE.sha256(sink);
    }

    @kotlin.jvm.JvmStatic
    public static final okio.HashingSink sha1(okio.Sink sink) {
        return INSTANCE.sha1(sink);
    }

    @kotlin.jvm.JvmStatic
    public static final okio.HashingSink md5(okio.Sink sink) {
        return INSTANCE.md5(sink);
    }

    @kotlin.jvm.JvmStatic
    public static final okio.HashingSink hmacSha512(okio.Sink sink, okio.ByteString byteString) {
        return INSTANCE.hmacSha512(sink, byteString);
    }

    @kotlin.jvm.JvmStatic
    public static final okio.HashingSink hmacSha256(okio.Sink sink, okio.ByteString byteString) {
        return INSTANCE.hmacSha256(sink, byteString);
    }

    @kotlin.jvm.JvmStatic
    public static final okio.HashingSink hmacSha1(okio.Sink sink, okio.ByteString byteString) {
        return INSTANCE.hmacSha1(sink, byteString);
    }
}
