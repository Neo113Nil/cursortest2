package io.ktor.http;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ.\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001a\u0010\r"}, d2 = {"Lio/ktor/http/HttpProtocolVersion;", "", "", "name", "", "major", "minor", "<init>", "(Ljava/lang/String;II)V", "toString", "()Ljava/lang/String;", "component1", "component2", "()I", "component3", "copy", "(Ljava/lang/String;II)Lio/ktor/http/HttpProtocolVersion;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "Ljava/lang/String;", "getName", com.visa.cbp.getEncExpo.warmup, "getMajor", "getMinor", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HttpProtocolVersion {
    private final int major;
    private final int minor;
    private final java.lang.String name;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final io.ktor.http.HttpProtocolVersion.Companion INSTANCE = new io.ktor.http.HttpProtocolVersion.Companion(null);
    private static final io.ktor.http.HttpProtocolVersion HTTP_2_0 = new io.ktor.http.HttpProtocolVersion("HTTP", 2, 0);
    private static final io.ktor.http.HttpProtocolVersion HTTP_1_1 = new io.ktor.http.HttpProtocolVersion("HTTP", 1, 1);
    private static final io.ktor.http.HttpProtocolVersion HTTP_1_0 = new io.ktor.http.HttpProtocolVersion("HTTP", 1, 0);
    private static final io.ktor.http.HttpProtocolVersion SPDY_3 = new io.ktor.http.HttpProtocolVersion("SPDY", 3, 0);
    private static final io.ktor.http.HttpProtocolVersion QUIC = new io.ktor.http.HttpProtocolVersion("QUIC", 1, 0);

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\u00020\t8\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0016\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u0013"}, d2 = {"Lio/ktor/http/HttpProtocolVersion$Companion;", "", "<init>", "()V", "", "name", "", "major", "minor", "Lio/ktor/http/HttpProtocolVersion;", "fromValue", "(Ljava/lang/String;II)Lio/ktor/http/HttpProtocolVersion;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "parse", "(Ljava/lang/CharSequence;)Lio/ktor/http/HttpProtocolVersion;", "HTTP_2_0", "Lio/ktor/http/HttpProtocolVersion;", "getHTTP_2_0", "()Lio/ktor/http/HttpProtocolVersion;", "HTTP_1_1", "getHTTP_1_1", "HTTP_1_0", "getHTTP_1_0", "SPDY_3", "getSPDY_3", "QUIC", "getQUIC"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final io.ktor.http.HttpProtocolVersion getHTTP_2_0() {
            return io.ktor.http.HttpProtocolVersion.HTTP_2_0;
        }

        public final io.ktor.http.HttpProtocolVersion getHTTP_1_1() {
            return io.ktor.http.HttpProtocolVersion.HTTP_1_1;
        }

        public final io.ktor.http.HttpProtocolVersion getHTTP_1_0() {
            return io.ktor.http.HttpProtocolVersion.HTTP_1_0;
        }

        public final io.ktor.http.HttpProtocolVersion getSPDY_3() {
            return io.ktor.http.HttpProtocolVersion.SPDY_3;
        }

        public final io.ktor.http.HttpProtocolVersion getQUIC() {
            return io.ktor.http.HttpProtocolVersion.QUIC;
        }

        public final io.ktor.http.HttpProtocolVersion fromValue(java.lang.String name2, int major, int minor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return (kotlin.jvm.internal.Intrinsics.areEqual(name2, "HTTP") && major == 1 && minor == 0) ? getHTTP_1_0() : (kotlin.jvm.internal.Intrinsics.areEqual(name2, "HTTP") && major == 1 && minor == 1) ? getHTTP_1_1() : (kotlin.jvm.internal.Intrinsics.areEqual(name2, "HTTP") && major == 2 && minor == 0) ? getHTTP_2_0() : new io.ktor.http.HttpProtocolVersion(name2, major, minor);
        }

        public final io.ktor.http.HttpProtocolVersion parse(java.lang.CharSequence value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            java.util.List split$default = kotlin.text.StringsKt.split$default(value, new java.lang.String[]{androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR, "."}, false, 0, 6, (java.lang.Object) null);
            if (split$default.size() == 3) {
                return fromValue((java.lang.String) split$default.get(0), java.lang.Integer.parseInt((java.lang.String) split$default.get(1)), java.lang.Integer.parseInt((java.lang.String) split$default.get(2)));
            }
            throw new java.lang.IllegalStateException("Failed to parse HttpProtocolVersion. Expected format: protocol/major.minor, but actual: ".concat(java.lang.String.valueOf(value)).toString());
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public HttpProtocolVersion(java.lang.String str, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
        this.major = i;
        this.minor = i2;
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.name);
        sb.append(kotlinx.io.files.FileSystemKt.UnixPathSeparator);
        sb.append(this.major);
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        sb.append(this.minor);
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.name.hashCode() * 31) + java.lang.Integer.hashCode(this.major)) * 31) + java.lang.Integer.hashCode(this.minor);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof io.ktor.http.HttpProtocolVersion)) {
            return false;
        }
        io.ktor.http.HttpProtocolVersion httpProtocolVersion = (io.ktor.http.HttpProtocolVersion) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, httpProtocolVersion.name) && this.major == httpProtocolVersion.major && this.minor == httpProtocolVersion.minor;
    }

    public final io.ktor.http.HttpProtocolVersion copy(java.lang.String name2, int major, int minor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return new io.ktor.http.HttpProtocolVersion(name2, major, minor);
    }

    /* renamed from: component3, reason: from getter */
    public final int getMinor() {
        return this.minor;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMajor() {
        return this.major;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    public static /* synthetic */ io.ktor.http.HttpProtocolVersion copy$default(io.ktor.http.HttpProtocolVersion httpProtocolVersion, java.lang.String str, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            str = httpProtocolVersion.name;
        }
        if ((i3 & 2) != 0) {
            i = httpProtocolVersion.major;
        }
        if ((i3 & 4) != 0) {
            i2 = httpProtocolVersion.minor;
        }
        return httpProtocolVersion.copy(str, i, i2);
    }
}
