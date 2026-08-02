package okhttp3.internal.http2;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u00158\u0006¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lokhttp3/internal/http2/Header;", "", "Lokio/ByteString;", "name", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Lokio/ByteString;Lokio/ByteString;)V", "", "(Ljava/lang/String;Ljava/lang/String;)V", "(Lokio/ByteString;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "component1", "()Lokio/ByteString;", "component2", "copy", "(Lokio/ByteString;Lokio/ByteString;)Lokhttp3/internal/http2/Header;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lokio/ByteString;", "hpackSize", com.visa.cbp.getEncExpo.warmup, "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Header {
    public final int hpackSize;
    public final okio.ByteString name;
    public final okio.ByteString value;
    public static final okio.ByteString PSEUDO_PREFIX = okio.ByteString.INSTANCE.encodeUtf8(io.ktor.sse.ServerSentEventKt.COLON);
    public static final java.lang.String RESPONSE_STATUS_UTF8 = ":status";
    public static final okio.ByteString RESPONSE_STATUS = okio.ByteString.INSTANCE.encodeUtf8(RESPONSE_STATUS_UTF8);
    public static final java.lang.String TARGET_METHOD_UTF8 = ":method";
    public static final okio.ByteString TARGET_METHOD = okio.ByteString.INSTANCE.encodeUtf8(TARGET_METHOD_UTF8);
    public static final java.lang.String TARGET_PATH_UTF8 = ":path";
    public static final okio.ByteString TARGET_PATH = okio.ByteString.INSTANCE.encodeUtf8(TARGET_PATH_UTF8);
    public static final java.lang.String TARGET_SCHEME_UTF8 = ":scheme";
    public static final okio.ByteString TARGET_SCHEME = okio.ByteString.INSTANCE.encodeUtf8(TARGET_SCHEME_UTF8);
    public static final java.lang.String TARGET_AUTHORITY_UTF8 = ":authority";
    public static final okio.ByteString TARGET_AUTHORITY = okio.ByteString.INSTANCE.encodeUtf8(TARGET_AUTHORITY_UTF8);

    public Header(okio.ByteString byteString, okio.ByteString byteString2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString2, "");
        this.name = byteString;
        this.value = byteString2;
        this.hpackSize = byteString.size() + 32 + byteString2.size();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(java.lang.String str, java.lang.String str2) {
        this(okio.ByteString.INSTANCE.encodeUtf8(str), okio.ByteString.INSTANCE.encodeUtf8(str2));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(okio.ByteString byteString, java.lang.String str) {
        this(byteString, okio.ByteString.INSTANCE.encodeUtf8(str));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.name.utf8());
        sb.append(": ");
        sb.append(this.value.utf8());
        return sb.toString();
    }

    public final int hashCode() {
        return (this.name.hashCode() * 31) + this.value.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof okhttp3.internal.http2.Header)) {
            return false;
        }
        okhttp3.internal.http2.Header header = (okhttp3.internal.http2.Header) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, header.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, header.value);
    }

    public final okhttp3.internal.http2.Header copy(okio.ByteString name2, okio.ByteString value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        return new okhttp3.internal.http2.Header(name2, value);
    }

    /* renamed from: component2, reason: from getter */
    public final okio.ByteString getValue() {
        return this.value;
    }

    /* renamed from: component1, reason: from getter */
    public final okio.ByteString getName() {
        return this.name;
    }

    public static /* synthetic */ okhttp3.internal.http2.Header copy$default(okhttp3.internal.http2.Header header, okio.ByteString byteString, okio.ByteString byteString2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            byteString = header.name;
        }
        if ((i & 2) != 0) {
            byteString2 = header.value;
        }
        return header.copy(byteString, byteString2);
    }
}
