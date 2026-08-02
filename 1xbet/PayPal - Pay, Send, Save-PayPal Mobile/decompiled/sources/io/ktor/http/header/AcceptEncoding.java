package io.ktor.http.header;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Lio/ktor/http/header/AcceptEncoding;", "Lio/ktor/http/HeaderValueWithParameters;", "", "acceptEncoding", "", "Lio/ktor/http/HeaderValueParam;", "parameters", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "qValue", "(Ljava/lang/String;D)V", "withQValue", "(D)Lio/ktor/http/header/AcceptEncoding;", "pattern", "", "match", "(Lio/ktor/http/header/AcceptEncoding;)Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/String;", "getAcceptEncoding", "()Ljava/lang/String;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AcceptEncoding extends io.ktor.http.HeaderValueWithParameters {
    private static final io.ktor.http.header.AcceptEncoding All;
    private static final io.ktor.http.header.AcceptEncoding Br;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final io.ktor.http.header.AcceptEncoding.Companion INSTANCE = new io.ktor.http.header.AcceptEncoding.Companion(null);
    private static final io.ktor.http.header.AcceptEncoding Compress;
    private static final io.ktor.http.header.AcceptEncoding Deflate;
    private static final io.ktor.http.header.AcceptEncoding Gzip;
    private static final io.ktor.http.header.AcceptEncoding Identity;
    private static final io.ktor.http.header.AcceptEncoding Zstd;
    private final java.lang.String acceptEncoding;

    public final java.lang.String getAcceptEncoding() {
        return this.acceptEncoding;
    }

    public /* synthetic */ AcceptEncoding(java.lang.String str, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (java.util.List<io.ktor.http.HeaderValueParam>) ((i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcceptEncoding(java.lang.String str, java.util.List<io.ktor.http.HeaderValueParam> list) {
        super(str, list);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.acceptEncoding = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AcceptEncoding(java.lang.String str, double d) {
        this(str, (java.util.List<io.ktor.http.HeaderValueParam>) kotlin.collections.CollectionsKt.listOf(new io.ktor.http.HeaderValueParam("q", java.lang.String.valueOf(d))));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0010\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\u0012\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\rR\u001a\u0010\u0014\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0015\u0010\rR\u001a\u0010\u0016\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0017\u0010\rR\u001a\u0010\u0018\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0019\u0010\r"}, d2 = {"Lio/ktor/http/header/AcceptEncoding$Companion;", "", "<init>", "()V", "", "Lio/ktor/http/header/AcceptEncoding;", "encodings", "", "mergeAcceptEncodings", "([Lio/ktor/http/header/AcceptEncoding;)Ljava/lang/String;", "Gzip", "Lio/ktor/http/header/AcceptEncoding;", "getGzip", "()Lio/ktor/http/header/AcceptEncoding;", "Compress", "getCompress", "Deflate", "getDeflate", "Br", "getBr", "Zstd", "getZstd", "Identity", "getIdentity", "All", "getAll"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final io.ktor.http.header.AcceptEncoding getGzip() {
            return io.ktor.http.header.AcceptEncoding.Gzip;
        }

        public final io.ktor.http.header.AcceptEncoding getCompress() {
            return io.ktor.http.header.AcceptEncoding.Compress;
        }

        public final io.ktor.http.header.AcceptEncoding getDeflate() {
            return io.ktor.http.header.AcceptEncoding.Deflate;
        }

        public final io.ktor.http.header.AcceptEncoding getBr() {
            return io.ktor.http.header.AcceptEncoding.Br;
        }

        public final io.ktor.http.header.AcceptEncoding getZstd() {
            return io.ktor.http.header.AcceptEncoding.Zstd;
        }

        public final io.ktor.http.header.AcceptEncoding getIdentity() {
            return io.ktor.http.header.AcceptEncoding.Identity;
        }

        public final io.ktor.http.header.AcceptEncoding getAll() {
            return io.ktor.http.header.AcceptEncoding.All;
        }

        public final java.lang.String mergeAcceptEncodings(io.ktor.http.header.AcceptEncoding... encodings) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encodings, "");
            return kotlin.collections.ArraysKt.joinToString$default(encodings, ", ", (java.lang.CharSequence) null, (java.lang.CharSequence) null, 0, (java.lang.CharSequence) null, (kotlin.jvm.functions.Function1) null, 62, (java.lang.Object) null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i = 2;
        Gzip = new io.ktor.http.header.AcceptEncoding(com.statsig.androidsdk.HttpUtils.ENCODING_GZIP, 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        Compress = new io.ktor.http.header.AcceptEncoding("compress", 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        Deflate = new io.ktor.http.header.AcceptEncoding("deflate", 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        Br = new io.ktor.http.header.AcceptEncoding("br", 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        Zstd = new io.ktor.http.header.AcceptEncoding("zstd", 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        Identity = new io.ktor.http.header.AcceptEncoding("identity", 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        All = new io.ktor.http.header.AcceptEncoding("*", 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
    }

    public final io.ktor.http.header.AcceptEncoding withQValue(double qValue) {
        return kotlin.jvm.internal.Intrinsics.areEqual(java.lang.String.valueOf(qValue), parameter("q")) ? this : new io.ktor.http.header.AcceptEncoding(this.acceptEncoding, qValue);
    }

    public final boolean match(io.ktor.http.header.AcceptEncoding pattern) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pattern, "");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(pattern.acceptEncoding, "*") && !kotlin.text.StringsKt.equals(pattern.acceptEncoding, this.acceptEncoding, true)) {
            return false;
        }
        for (io.ktor.http.HeaderValueParam headerValueParam : pattern.getParameters()) {
            java.lang.String name2 = headerValueParam.getName();
            java.lang.String value = headerValueParam.getValue();
            if (kotlin.jvm.internal.Intrinsics.areEqual(name2, "*")) {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(value, "*")) {
                    java.util.List<io.ktor.http.HeaderValueParam> parameters = getParameters();
                    if (!(parameters instanceof java.util.Collection) || !parameters.isEmpty()) {
                        java.util.Iterator<T> it = parameters.iterator();
                        while (it.hasNext()) {
                            if (kotlin.text.StringsKt.equals(((io.ktor.http.HeaderValueParam) it.next()).getValue(), value, true)) {
                                break;
                            }
                        }
                    }
                    return false;
                }
                continue;
            } else {
                java.lang.String parameter = parameter(name2);
                if (kotlin.jvm.internal.Intrinsics.areEqual(value, "*")) {
                    if (parameter == null) {
                        return false;
                    }
                } else if (!kotlin.text.StringsKt.equals(parameter, value, true)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean equals(java.lang.Object other) {
        if (!(other instanceof io.ktor.http.header.AcceptEncoding)) {
            return false;
        }
        io.ktor.http.header.AcceptEncoding acceptEncoding = (io.ktor.http.header.AcceptEncoding) other;
        return kotlin.text.StringsKt.equals(this.acceptEncoding, acceptEncoding.acceptEncoding, true) && kotlin.jvm.internal.Intrinsics.areEqual(getParameters(), acceptEncoding.getParameters());
    }

    public final int hashCode() {
        java.lang.String lowerCase = this.acceptEncoding.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return lowerCase.hashCode() + (getParameters().hashCode() * 31);
    }
}
