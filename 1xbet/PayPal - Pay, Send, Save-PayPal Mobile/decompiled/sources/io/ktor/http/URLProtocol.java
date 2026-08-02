package io.ktor.http;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000 \u001a2\u00060\u0001j\u0002`\u0002:\u0001\u001aB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0015\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\f"}, d2 = {"Lio/ktor/http/URLProtocol;", "Ljava/io/Serializable;", "Lio/ktor/utils/io/getHighSpeedVideoFpsRangesFor;", "", "name", "", "defaultPort", "<init>", "(Ljava/lang/String;I)V", "component1", "()Ljava/lang/String;", "component2", "()I", "copy", "(Ljava/lang/String;I)Lio/ktor/http/URLProtocol;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getName", com.visa.cbp.getEncExpo.warmup, "getDefaultPort", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class URLProtocol implements java.io.Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final io.ktor.http.URLProtocol.Companion INSTANCE = new io.ktor.http.URLProtocol.Companion(null);
    private static final io.ktor.http.URLProtocol HTTP;
    private static final io.ktor.http.URLProtocol HTTPS;
    private static final io.ktor.http.URLProtocol SOCKS;
    private static final io.ktor.http.URLProtocol WS;
    private static final io.ktor.http.URLProtocol WSS;
    private static final java.util.Map<java.lang.String, io.ktor.http.URLProtocol> byName;
    private final int defaultPort;
    private final java.lang.String name;

    public URLProtocol(java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
        this.defaultPort = i;
        java.lang.String str2 = str;
        for (int i2 = 0; i2 < str2.length(); i2++) {
            if (!io.ktor.util.CharsetKt.isLowerCase(str2.charAt(i2))) {
                throw new java.lang.IllegalArgumentException("All characters should be lower case".toString());
            }
        }
    }

    public final int getDefaultPort() {
        return this.defaultPort;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u000f\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\fR\u001a\u0010\u0011\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\u001a\u0010\u0013\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0014\u0010\fR&\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Lio/ktor/http/URLProtocol$Companion;", "", "<init>", "()V", "", "name", "Lio/ktor/http/URLProtocol;", "createOrDefault", "(Ljava/lang/String;)Lio/ktor/http/URLProtocol;", "HTTP", "Lio/ktor/http/URLProtocol;", "getHTTP", "()Lio/ktor/http/URLProtocol;", "HTTPS", "getHTTPS", "WS", "getWS", "WSS", "getWSS", "SOCKS", "getSOCKS", "", "byName", "Ljava/util/Map;", "getByName", "()Ljava/util/Map;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final io.ktor.http.URLProtocol getHTTP() {
            return io.ktor.http.URLProtocol.HTTP;
        }

        public final io.ktor.http.URLProtocol getHTTPS() {
            return io.ktor.http.URLProtocol.HTTPS;
        }

        public final io.ktor.http.URLProtocol getWS() {
            return io.ktor.http.URLProtocol.WS;
        }

        public final io.ktor.http.URLProtocol getWSS() {
            return io.ktor.http.URLProtocol.WSS;
        }

        public final io.ktor.http.URLProtocol getSOCKS() {
            return io.ktor.http.URLProtocol.SOCKS;
        }

        public final java.util.Map<java.lang.String, io.ktor.http.URLProtocol> getByName() {
            return io.ktor.http.URLProtocol.byName;
        }

        public final io.ktor.http.URLProtocol createOrDefault(java.lang.String name2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            java.lang.String lowerCasePreservingASCIIRules = io.ktor.util.TextKt.toLowerCasePreservingASCIIRules(name2);
            io.ktor.http.URLProtocol uRLProtocol = io.ktor.http.URLProtocol.INSTANCE.getByName().get(lowerCasePreservingASCIIRules);
            return uRLProtocol == null ? new io.ktor.http.URLProtocol(lowerCasePreservingASCIIRules, 0) : uRLProtocol;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        io.ktor.http.URLProtocol uRLProtocol = new io.ktor.http.URLProtocol("http", 80);
        HTTP = uRLProtocol;
        io.ktor.http.URLProtocol uRLProtocol2 = new io.ktor.http.URLProtocol("https", 443);
        HTTPS = uRLProtocol2;
        io.ktor.http.URLProtocol uRLProtocol3 = new io.ktor.http.URLProtocol("ws", 80);
        WS = uRLProtocol3;
        io.ktor.http.URLProtocol uRLProtocol4 = new io.ktor.http.URLProtocol("wss", 443);
        WSS = uRLProtocol4;
        io.ktor.http.URLProtocol uRLProtocol5 = new io.ktor.http.URLProtocol("socks", 1080);
        SOCKS = uRLProtocol5;
        java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new io.ktor.http.URLProtocol[]{uRLProtocol, uRLProtocol2, uRLProtocol3, uRLProtocol4, uRLProtocol5});
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listOf, 10)), 16));
        for (java.lang.Object obj : listOf) {
            linkedHashMap.put(((io.ktor.http.URLProtocol) obj).name, obj);
        }
        byName = linkedHashMap;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("URLProtocol(name=");
        sb.append(this.name);
        sb.append(", defaultPort=");
        sb.append(this.defaultPort);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (this.name.hashCode() * 31) + java.lang.Integer.hashCode(this.defaultPort);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof io.ktor.http.URLProtocol)) {
            return false;
        }
        io.ktor.http.URLProtocol uRLProtocol = (io.ktor.http.URLProtocol) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, uRLProtocol.name) && this.defaultPort == uRLProtocol.defaultPort;
    }

    public final io.ktor.http.URLProtocol copy(java.lang.String name2, int defaultPort) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return new io.ktor.http.URLProtocol(name2, defaultPort);
    }

    /* renamed from: component2, reason: from getter */
    public final int getDefaultPort() {
        return this.defaultPort;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    public static /* synthetic */ io.ktor.http.URLProtocol copy$default(io.ktor.http.URLProtocol uRLProtocol, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = uRLProtocol.name;
        }
        if ((i2 & 2) != 0) {
            i = uRLProtocol.defaultPort;
        }
        return uRLProtocol.copy(str, i);
    }
}
