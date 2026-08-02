package okhttp3.logging;

@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\t\u0018\u0000 /2\u00020\u0001:\u000301/B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ!\u0010\f\u001a\u00020\b2\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u000b\"\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010!\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b!\u0010$R\u0014\u0010'\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010)R\u001c\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00060(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010)R\"\u0010\u000f\u001a\u00020\u000e8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010,\u001a\u0004\b-\u0010\u0013\"\u0004\b\u000f\u0010."}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor;", "Lokhttp3/Interceptor;", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "logger", "<init>", "(Lokhttp3/logging/HttpLoggingInterceptor$Logger;)V", "", "name", "", "redactHeader", "(Ljava/lang/String;)V", "", "redactQueryParams", "([Ljava/lang/String;)V", "Lokhttp3/logging/HttpLoggingInterceptor$Level;", "level", "setLevel", "(Lokhttp3/logging/HttpLoggingInterceptor$Level;)Lokhttp3/logging/HttpLoggingInterceptor;", "-deprecated_level", "()Lokhttp3/logging/HttpLoggingInterceptor$Level;", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "Lokhttp3/HttpUrl;", "url", "redactUrl$logging_interceptor", "(Lokhttp3/HttpUrl;)Ljava/lang/String;", "Lokhttp3/Headers;", "p0", "", "p1", "getHighSpeedVideoSizes", "(Lokhttp3/Headers;I)V", "", "(Lokhttp3/Headers;)Z", "getHighSpeedVideoFpsRanges", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "getHighSpeedVideoFpsRangesFor", "", "Ljava/util/Set;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "Lokhttp3/logging/HttpLoggingInterceptor$Level;", "getLevel", "(Lokhttp3/logging/HttpLoggingInterceptor$Level;)V", "Companion", "Level", "Logger"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HttpLoggingInterceptor implements okhttp3.Interceptor {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private volatile java.util.Set<java.lang.String> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final okhttp3.logging.HttpLoggingInterceptor.Logger getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private volatile java.util.Set<java.lang.String> getHighResolutionOutputSizeshNQ4ISI;
    private volatile okhttp3.logging.HttpLoggingInterceptor.Level level;

    public HttpLoggingInterceptor(okhttp3.logging.HttpLoggingInterceptor.Logger logger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "");
        this.getHighSpeedVideoFpsRangesFor = logger;
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.SetsKt.emptySet();
        this.Camera2StreamConfigurationMap = kotlin.collections.SetsKt.emptySet();
        this.level = okhttp3.logging.HttpLoggingInterceptor.Level.NONE;
    }

    public /* synthetic */ HttpLoggingInterceptor(okhttp3.logging.HttpLoggingInterceptor.Logger logger, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? okhttp3.logging.HttpLoggingInterceptor.Logger.DEFAULT : logger);
    }

    public final okhttp3.logging.HttpLoggingInterceptor.Level getLevel() {
        return this.level;
    }

    public final void level(okhttp3.logging.HttpLoggingInterceptor.Level level) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(level, "");
        this.level = level;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Level;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "BASIC", "HEADERS", "BODY"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Level {
        public static final okhttp3.logging.HttpLoggingInterceptor.Level BASIC;
        public static final okhttp3.logging.HttpLoggingInterceptor.Level BODY;
        private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
        public static final okhttp3.logging.HttpLoggingInterceptor.Level HEADERS;
        public static final okhttp3.logging.HttpLoggingInterceptor.Level NONE;
        private static final /* synthetic */ okhttp3.logging.HttpLoggingInterceptor.Level[] getHighResolutionOutputSizeshNQ4ISI;

        private Level(java.lang.String str, int i) {
        }

        static {
            okhttp3.logging.HttpLoggingInterceptor.Level level = new okhttp3.logging.HttpLoggingInterceptor.Level("NONE", 0);
            NONE = level;
            okhttp3.logging.HttpLoggingInterceptor.Level level2 = new okhttp3.logging.HttpLoggingInterceptor.Level("BASIC", 1);
            BASIC = level2;
            okhttp3.logging.HttpLoggingInterceptor.Level level3 = new okhttp3.logging.HttpLoggingInterceptor.Level("HEADERS", 2);
            HEADERS = level3;
            okhttp3.logging.HttpLoggingInterceptor.Level level4 = new okhttp3.logging.HttpLoggingInterceptor.Level("BODY", 3);
            BODY = level4;
            okhttp3.logging.HttpLoggingInterceptor.Level[] levelArr = {level, level2, level3, level4};
            getHighResolutionOutputSizeshNQ4ISI = levelArr;
            Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(levelArr);
        }

        public static okhttp3.logging.HttpLoggingInterceptor.Level[] values() {
            return (okhttp3.logging.HttpLoggingInterceptor.Level[]) getHighResolutionOutputSizeshNQ4ISI.clone();
        }

        public static okhttp3.logging.HttpLoggingInterceptor.Level valueOf(java.lang.String str) {
            return (okhttp3.logging.HttpLoggingInterceptor.Level) java.lang.Enum.valueOf(okhttp3.logging.HttpLoggingInterceptor.Level.class, str);
        }

        public static kotlin.enums.EnumEntries<okhttp3.logging.HttpLoggingInterceptor.Level> getEntries() {
            return Camera2StreamConfigurationMap;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "", "", "message", "", "log", "(Ljava/lang/String;)V", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Logger {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final okhttp3.logging.HttpLoggingInterceptor.Logger.Companion INSTANCE = okhttp3.logging.HttpLoggingInterceptor.Logger.Companion.getHighSpeedVideoFpsRanges;
        public static final okhttp3.logging.HttpLoggingInterceptor.Logger DEFAULT = new okhttp3.logging.HttpLoggingInterceptor.Logger.Companion.DefaultLogger();

        void log(java.lang.String message);

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger$Companion;", "", "<init>", "()V", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "DEFAULT", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "DefaultLogger"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            static final /* synthetic */ okhttp3.logging.HttpLoggingInterceptor.Logger.Companion getHighSpeedVideoFpsRanges = new okhttp3.logging.HttpLoggingInterceptor.Logger.Companion();

            private Companion() {
            }

            @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger$Companion$DefaultLogger;", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "<init>", "()V", "", "p0", "", "log", "(Ljava/lang/String;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
            static final class DefaultLogger implements okhttp3.logging.HttpLoggingInterceptor.Logger {
                @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
                public final void log(java.lang.String p0) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
                    okhttp3.internal.platform.Platform.log$default(okhttp3.internal.platform.Platform.INSTANCE.get(), p0, 0, null, 6, null);
                }
            }
        }
    }

    public final void redactHeader(java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        java.util.TreeSet treeSet = new java.util.TreeSet(kotlin.text.StringsKt.getCASE_INSENSITIVE_ORDER(kotlin.jvm.internal.StringCompanionObject.INSTANCE));
        java.util.TreeSet treeSet2 = treeSet;
        kotlin.collections.CollectionsKt.addAll(treeSet2, this.getHighResolutionOutputSizeshNQ4ISI);
        treeSet2.add(name2);
        this.getHighResolutionOutputSizeshNQ4ISI = treeSet;
    }

    public final void redactQueryParams(java.lang.String... name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        java.util.TreeSet treeSet = new java.util.TreeSet(kotlin.text.StringsKt.getCASE_INSENSITIVE_ORDER(kotlin.jvm.internal.StringCompanionObject.INSTANCE));
        java.util.TreeSet treeSet2 = treeSet;
        kotlin.collections.CollectionsKt.addAll(treeSet2, this.Camera2StreamConfigurationMap);
        kotlin.collections.CollectionsKt.addAll(treeSet2, name2);
        this.Camera2StreamConfigurationMap = treeSet;
    }

    public final okhttp3.logging.HttpLoggingInterceptor setLevel(okhttp3.logging.HttpLoggingInterceptor.Level level) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(level, "");
        this.level = level;
        return this;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to var", replaceWith = @kotlin.ReplaceWith(expression = "level", imports = {}))
    /* renamed from: -deprecated_level, reason: not valid java name and from getter */
    public final okhttp3.logging.HttpLoggingInterceptor.Level getLevel() {
        return this.level;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00fa A[LOOP:0: B:35:0x00f8->B:36:0x00fa, LOOP_END] */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws java.io.IOException {
        java.lang.String str;
        boolean z;
        boolean z2;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.Long l;
        okio.GzipSource gzipSource;
        java.lang.String str5;
        int size;
        int i;
        java.lang.Long l2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
        okhttp3.logging.HttpLoggingInterceptor.Level level = this.level;
        okhttp3.Request request = chain.request();
        if (level == okhttp3.logging.HttpLoggingInterceptor.Level.NONE) {
            return chain.proceed(request);
        }
        boolean z3 = level == okhttp3.logging.HttpLoggingInterceptor.Level.BODY;
        boolean z4 = z3 || level == okhttp3.logging.HttpLoggingInterceptor.Level.HEADERS;
        okhttp3.RequestBody body = request.body();
        okhttp3.Connection connection = chain.connection();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("--> ");
        sb.append(request.method());
        sb.append(' ');
        sb.append(redactUrl$logging_interceptor(request.url()));
        if (connection != null) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(" ");
            sb2.append(connection.protocol());
            str = sb2.toString();
        } else {
            str = "";
        }
        sb.append(str);
        java.lang.String obj = sb.toString();
        if (!z4 && body != null) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(obj);
            sb3.append(" (");
            sb3.append(body.contentLength());
            sb3.append("-byte body)");
            obj = sb3.toString();
        }
        this.getHighSpeedVideoFpsRangesFor.log(obj);
        if (z4) {
            okhttp3.Headers headers = request.headers();
            if (body != null) {
                okhttp3.MediaType getHighSpeedVideoFpsRanges = body.getGetHighSpeedVideoFpsRanges();
                if (getHighSpeedVideoFpsRanges == null || headers.get("Content-Type") != null) {
                    z = z4;
                } else {
                    z = z4;
                    this.getHighSpeedVideoFpsRangesFor.log("Content-Type: ".concat(java.lang.String.valueOf(getHighSpeedVideoFpsRanges)));
                }
                if (body.contentLength() != -1 && headers.get("Content-Length") == null) {
                    okhttp3.logging.HttpLoggingInterceptor.Logger logger = this.getHighSpeedVideoFpsRangesFor;
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Content-Length: ");
                    str5 = "-byte body)";
                    str3 = " ";
                    sb4.append(body.contentLength());
                    logger.log(sb4.toString());
                    size = headers.size();
                    for (i = 0; i < size; i++) {
                        getHighSpeedVideoSizes(headers, i);
                    }
                    if (z3 || body == null) {
                        z2 = z3;
                        str2 = com.statsig.androidsdk.HttpUtils.ENCODING_GZIP;
                        okhttp3.logging.HttpLoggingInterceptor.Logger logger2 = this.getHighSpeedVideoFpsRangesFor;
                        java.lang.StringBuilder sb5 = new java.lang.StringBuilder("--> END ");
                        sb5.append(request.method());
                        logger2.log(sb5.toString());
                    } else {
                        if (getHighSpeedVideoSizes(request.headers())) {
                            okhttp3.logging.HttpLoggingInterceptor.Logger logger3 = this.getHighSpeedVideoFpsRangesFor;
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("--> END ");
                            sb6.append(request.method());
                            sb6.append(" (encoded body omitted)");
                            logger3.log(sb6.toString());
                        } else if (body.isDuplex()) {
                            okhttp3.logging.HttpLoggingInterceptor.Logger logger4 = this.getHighSpeedVideoFpsRangesFor;
                            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("--> END ");
                            sb7.append(request.method());
                            sb7.append(" (duplex request body omitted)");
                            logger4.log(sb7.toString());
                        } else if (body.isOneShot()) {
                            okhttp3.logging.HttpLoggingInterceptor.Logger logger5 = this.getHighSpeedVideoFpsRangesFor;
                            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("--> END ");
                            sb8.append(request.method());
                            sb8.append(" (one-shot body omitted)");
                            logger5.log(sb8.toString());
                        } else {
                            okio.Buffer buffer = new okio.Buffer();
                            body.writeTo(buffer);
                            if (kotlin.text.StringsKt.equals(com.statsig.androidsdk.HttpUtils.ENCODING_GZIP, headers.get("Content-Encoding"), true)) {
                                l2 = java.lang.Long.valueOf(buffer.size());
                                gzipSource = new okio.GzipSource(buffer);
                                try {
                                    okio.Buffer buffer2 = new okio.Buffer();
                                    buffer2.writeAll(gzipSource);
                                    kotlin.io.CloseableKt.closeFinally(gzipSource, null);
                                    buffer = buffer2;
                                } finally {
                                }
                            } else {
                                l2 = null;
                            }
                            java.nio.charset.Charset charsetOrUtf8 = okhttp3.internal.Internal.charsetOrUtf8(body.getGetHighSpeedVideoFpsRanges());
                            this.getHighSpeedVideoFpsRangesFor.log("");
                            z2 = z3;
                            str2 = com.statsig.androidsdk.HttpUtils.ENCODING_GZIP;
                            if (!okhttp3.internal.IsProbablyUtf8Kt.isProbablyUtf8(buffer, 16L)) {
                                okhttp3.logging.HttpLoggingInterceptor.Logger logger6 = this.getHighSpeedVideoFpsRangesFor;
                                java.lang.StringBuilder sb9 = new java.lang.StringBuilder("--> END ");
                                sb9.append(request.method());
                                sb9.append(" (binary ");
                                sb9.append(body.contentLength());
                                sb9.append("-byte body omitted)");
                                logger6.log(sb9.toString());
                            } else if (l2 != null) {
                                okhttp3.logging.HttpLoggingInterceptor.Logger logger7 = this.getHighSpeedVideoFpsRangesFor;
                                java.lang.StringBuilder sb10 = new java.lang.StringBuilder("--> END ");
                                sb10.append(request.method());
                                sb10.append(" (");
                                sb10.append(buffer.size());
                                sb10.append("-byte, ");
                                sb10.append(l2.longValue());
                                sb10.append("-gzipped-byte body)");
                                logger7.log(sb10.toString());
                            } else {
                                this.getHighSpeedVideoFpsRangesFor.log(buffer.readString(charsetOrUtf8));
                                okhttp3.logging.HttpLoggingInterceptor.Logger logger8 = this.getHighSpeedVideoFpsRangesFor;
                                java.lang.StringBuilder sb11 = new java.lang.StringBuilder("--> END ");
                                sb11.append(request.method());
                                sb11.append(" (");
                                sb11.append(body.contentLength());
                                sb11.append(str5);
                                logger8.log(sb11.toString());
                            }
                        }
                        z2 = z3;
                        str2 = com.statsig.androidsdk.HttpUtils.ENCODING_GZIP;
                    }
                }
            } else {
                z = z4;
            }
            str5 = "-byte body)";
            str3 = " ";
            size = headers.size();
            while (i < size) {
            }
            if (z3) {
            }
            z2 = z3;
            str2 = com.statsig.androidsdk.HttpUtils.ENCODING_GZIP;
            okhttp3.logging.HttpLoggingInterceptor.Logger logger22 = this.getHighSpeedVideoFpsRangesFor;
            java.lang.StringBuilder sb52 = new java.lang.StringBuilder("--> END ");
            sb52.append(request.method());
            logger22.log(sb52.toString());
        } else {
            z = z4;
            z2 = z3;
            str2 = com.statsig.androidsdk.HttpUtils.ENCODING_GZIP;
            str3 = " ";
        }
        long nanoTime = java.lang.System.nanoTime();
        try {
            okhttp3.Response proceed = chain.proceed(request);
            long millis = java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(java.lang.System.nanoTime() - nanoTime);
            okhttp3.ResponseBody body2 = proceed.body();
            kotlin.jvm.internal.Intrinsics.checkNotNull(body2);
            long getHighSpeedVideoSizes = body2.getGetHighSpeedVideoSizes();
            if (getHighSpeedVideoSizes != -1) {
                java.lang.StringBuilder sb12 = new java.lang.StringBuilder();
                sb12.append(getHighSpeedVideoSizes);
                sb12.append("-byte");
                str4 = sb12.toString();
            } else {
                str4 = "unknown-length";
            }
            okhttp3.logging.HttpLoggingInterceptor.Logger logger9 = this.getHighSpeedVideoFpsRangesFor;
            java.lang.StringBuilder sb13 = new java.lang.StringBuilder();
            java.lang.StringBuilder sb14 = new java.lang.StringBuilder("<-- ");
            sb14.append(proceed.code());
            sb13.append(sb14.toString());
            if (proceed.message().length() > 0) {
                java.lang.StringBuilder sb15 = new java.lang.StringBuilder(str3);
                sb15.append(proceed.message());
                sb13.append(sb15.toString());
            }
            java.lang.StringBuilder sb16 = new java.lang.StringBuilder(str3);
            sb16.append(redactUrl$logging_interceptor(proceed.request().url()));
            sb16.append(" (");
            sb16.append(millis);
            sb16.append("ms");
            sb13.append(sb16.toString());
            if (!z) {
                java.lang.StringBuilder sb17 = new java.lang.StringBuilder(", ");
                sb17.append(str4);
                sb17.append(" body");
                sb13.append(sb17.toString());
            }
            sb13.append(")");
            logger9.log(sb13.toString());
            if (z) {
                okhttp3.Headers headers2 = proceed.headers();
                int size2 = headers2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    getHighSpeedVideoSizes(headers2, i2);
                }
                if (!z2 || !okhttp3.internal.http.HttpHeaders.promisesBody(proceed)) {
                    this.getHighSpeedVideoFpsRangesFor.log("<-- END HTTP");
                } else {
                    if (getHighSpeedVideoSizes(proceed.headers())) {
                        this.getHighSpeedVideoFpsRangesFor.log("<-- END HTTP (encoded body omitted)");
                        return proceed;
                    }
                    okhttp3.MediaType getHighSpeedVideoFpsRangesFor = proceed.body().getGetHighSpeedVideoFpsRangesFor();
                    if (getHighSpeedVideoFpsRangesFor != null && kotlin.jvm.internal.Intrinsics.areEqual(getHighSpeedVideoFpsRangesFor.type(), "text") && kotlin.jvm.internal.Intrinsics.areEqual(getHighSpeedVideoFpsRangesFor.subtype(), "event-stream")) {
                        this.getHighSpeedVideoFpsRangesFor.log("<-- END HTTP (streaming)");
                        return proceed;
                    }
                    okio.BufferedSource getHighResolutionOutputSizeshNQ4ISI = body2.getGetHighResolutionOutputSizeshNQ4ISI();
                    getHighResolutionOutputSizeshNQ4ISI.request(Long.MAX_VALUE);
                    long millis2 = java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(java.lang.System.nanoTime() - nanoTime);
                    okio.Buffer buffer3 = getHighResolutionOutputSizeshNQ4ISI.getBuffer();
                    if (kotlin.text.StringsKt.equals(str2, headers2.get("Content-Encoding"), true)) {
                        long size3 = buffer3.size();
                        gzipSource = new okio.GzipSource(buffer3.clone());
                        try {
                            okio.Buffer buffer4 = new okio.Buffer();
                            buffer4.writeAll(gzipSource);
                            kotlin.io.CloseableKt.closeFinally(gzipSource, null);
                            l = java.lang.Long.valueOf(size3);
                            buffer3 = buffer4;
                        } finally {
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    } else {
                        l = null;
                    }
                    java.nio.charset.Charset charsetOrUtf82 = okhttp3.internal.Internal.charsetOrUtf8(body2.getGetHighSpeedVideoFpsRangesFor());
                    if (!okhttp3.internal.IsProbablyUtf8Kt.isProbablyUtf8(buffer3, 16L)) {
                        this.getHighSpeedVideoFpsRangesFor.log("");
                        okhttp3.logging.HttpLoggingInterceptor.Logger logger10 = this.getHighSpeedVideoFpsRangesFor;
                        java.lang.StringBuilder sb18 = new java.lang.StringBuilder("<-- END HTTP (");
                        sb18.append(millis2);
                        sb18.append("ms, binary ");
                        sb18.append(buffer3.size());
                        sb18.append("-byte body omitted)");
                        logger10.log(sb18.toString());
                        return proceed;
                    }
                    if (getHighSpeedVideoSizes != 0) {
                        this.getHighSpeedVideoFpsRangesFor.log("");
                        this.getHighSpeedVideoFpsRangesFor.log(buffer3.clone().readString(charsetOrUtf82));
                    }
                    okhttp3.logging.HttpLoggingInterceptor.Logger logger11 = this.getHighSpeedVideoFpsRangesFor;
                    java.lang.StringBuilder sb19 = new java.lang.StringBuilder();
                    java.lang.StringBuilder sb20 = new java.lang.StringBuilder("<-- END HTTP (");
                    sb20.append(millis2);
                    sb20.append("ms, ");
                    sb20.append(buffer3.size());
                    sb20.append("-byte");
                    sb19.append(sb20.toString());
                    if (l != null) {
                        java.lang.StringBuilder sb21 = new java.lang.StringBuilder(", ");
                        sb21.append(l.longValue());
                        sb21.append("-gzipped-byte");
                        sb19.append(sb21.toString());
                    }
                    sb19.append(" body)");
                    logger11.log(sb19.toString());
                    return proceed;
                }
            }
            return proceed;
        } catch (java.lang.Exception e) {
            long millis3 = java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(java.lang.System.nanoTime() - nanoTime);
            okhttp3.logging.HttpLoggingInterceptor.Logger logger12 = this.getHighSpeedVideoFpsRangesFor;
            java.lang.StringBuilder sb22 = new java.lang.StringBuilder();
            java.lang.StringBuilder sb23 = new java.lang.StringBuilder("<-- HTTP FAILED: ");
            sb23.append(e);
            sb23.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
            sb22.append(sb23.toString());
            java.lang.StringBuilder sb24 = new java.lang.StringBuilder(str3);
            sb24.append(redactUrl$logging_interceptor(request.url()));
            sb24.append(" (");
            sb24.append(millis3);
            sb24.append("ms)");
            sb22.append(sb24.toString());
            logger12.log(sb22.toString());
            throw e;
        }
    }

    public final java.lang.String redactUrl$logging_interceptor(okhttp3.HttpUrl url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        if (this.Camera2StreamConfigurationMap.isEmpty() || url.querySize() == 0) {
            return url.toString();
        }
        okhttp3.HttpUrl.Builder query = url.newBuilder().query(null);
        int querySize = url.querySize();
        for (int i = 0; i < querySize; i++) {
            java.lang.String queryParameterName = url.queryParameterName(i);
            query.addEncodedQueryParameter(queryParameterName, this.Camera2StreamConfigurationMap.contains(queryParameterName) ? "██" : url.queryParameterValue(i));
        }
        return query.toString();
    }

    private final void getHighSpeedVideoSizes(okhttp3.Headers p0, int p1) {
        java.lang.String value = this.getHighResolutionOutputSizeshNQ4ISI.contains(p0.name(p1)) ? "██" : p0.value(p1);
        okhttp3.logging.HttpLoggingInterceptor.Logger logger = this.getHighSpeedVideoFpsRangesFor;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(p0.name(p1));
        sb.append(": ");
        sb.append(value);
        logger.log(sb.toString());
    }

    private static boolean getHighSpeedVideoSizes(okhttp3.Headers p0) {
        java.lang.String str = p0.get("Content-Encoding");
        return (str == null || kotlin.text.StringsKt.equals(str, "identity", true) || kotlin.text.StringsKt.equals(str, com.statsig.androidsdk.HttpUtils.ENCODING_GZIP, true)) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpLoggingInterceptor() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
