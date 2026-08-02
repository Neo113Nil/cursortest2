package coil3.content.cachecontrol;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0002\u0018\u0017B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0012\u001a\u00020\u00112\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcoil3/network/cachecontrol/CacheControlCacheStrategy;", "Lcoil3/network/CacheStrategy;", "Lkotlin/Function0;", "Lkotlin/time/Instant;", "now", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Lcoil3/network/NetworkResponse;", "cacheResponse", "Lcoil3/network/NetworkRequest;", "networkRequest", "Lcoil3/request/Options;", "options", "Lcoil3/network/CacheStrategy$ReadResult;", "read", "(Lcoil3/network/NetworkResponse;Lcoil3/network/NetworkRequest;Lcoil3/request/Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "networkResponse", "Lcoil3/network/CacheStrategy$WriteResult;", "write", "(Lcoil3/network/NetworkResponse;Lcoil3/network/NetworkRequest;Lcoil3/network/NetworkResponse;Lcoil3/request/Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function0;", "getHighResolutionOutputSizeshNQ4ISI", "Companion_", "Computation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CacheControlCacheStrategy implements coil3.content.CacheStrategy {
    private static final coil3.network.cachecontrol.CacheControlCacheStrategy.Companion_ Companion_ = new coil3.network.cachecontrol.CacheControlCacheStrategy.Companion_(null);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.time.Instant> getHighResolutionOutputSizeshNQ4ISI;

    public CacheControlCacheStrategy(kotlin.jvm.functions.Function0<kotlin.time.Instant> function0) {
        this.getHighResolutionOutputSizeshNQ4ISI = function0;
    }

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: coil3.network.cachecontrol.CacheControlCacheStrategy$1, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<kotlin.time.Instant> {
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
        public final kotlin.time.Instant invoke() {
            return ((kotlin.time.Clock.System) this.receiver).now();
        }

        AnonymousClass1(java.lang.Object obj) {
            super(0, obj, kotlin.time.Clock.System.class, "now", "now()Lkotlin/time/Instant;", 0);
        }
    }

    public /* synthetic */ CacheControlCacheStrategy(coil3.content.cachecontrol.CacheControlCacheStrategy.AnonymousClass1 anonymousClass1, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new coil3.content.cachecontrol.CacheControlCacheStrategy.AnonymousClass1(kotlin.time.Clock.System.INSTANCE) : anonymousClass1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0098, code lost:
    
        if (r5 > 0) goto L30;
     */
    @Override // coil3.content.CacheStrategy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object read(coil3.content.NetworkResponse networkResponse, coil3.content.NetworkRequest networkRequest, coil3.view.Options options, kotlin.coroutines.Continuation<? super coil3.network.CacheStrategy.ReadResult> continuation) {
        long j;
        java.lang.String str;
        coil3.content.NetworkResponse copy;
        coil3.network.cachecontrol.CacheControlCacheStrategy.Computation computation = new coil3.network.cachecontrol.CacheControlCacheStrategy.Computation(networkResponse, networkRequest, this.getHighResolutionOutputSizeshNQ4ISI.invoke());
        coil3.network.cachecontrol.CacheControlCacheStrategy.Companion_ unused = Companion_;
        if (!coil3.network.cachecontrol.CacheControlCacheStrategy.Companion_.getHighSpeedVideoFpsRanges(computation.getHighResolutionOutputSizeshNQ4ISI, computation.getHighSpeedVideoSizes)) {
            return new coil3.network.CacheStrategy.ReadResult(computation.getHighSpeedVideoFpsRanges);
        }
        if (computation.getHighSpeedVideoSizes.getNoCache() || coil3.network.cachecontrol.CacheControlCacheStrategy.Computation.getHighSpeedVideoFpsRangesFor(computation.getHighSpeedVideoFpsRanges)) {
            return new coil3.network.CacheStrategy.ReadResult(computation.getHighSpeedVideoFpsRanges);
        }
        kotlin.time.Instant highSpeedVideoFpsRangesFor = computation.getHighSpeedVideoFpsRangesFor();
        long j2 = 0;
        long max = highSpeedVideoFpsRangesFor != null ? java.lang.Math.max(0L, computation.getOutputSizeshNQ4ISI - highSpeedVideoFpsRangesFor.toEpochMilliseconds()) : 0L;
        int i = computation.getOutputSizes;
        if (i != -1) {
            max = java.lang.Math.max(max, i * 1000);
        }
        long max2 = max + java.lang.Math.max(0L, computation.getOutputSizeshNQ4ISI - computation.getOutputStallDurationlomOqCM) + java.lang.Math.max(0L, computation.Camera2StreamConfigurationMap.toEpochMilliseconds() - computation.getOutputSizeshNQ4ISI);
        if (computation.getHighResolutionOutputSizeshNQ4ISI.getMaxAgeSeconds() != -1) {
            j = computation.getHighResolutionOutputSizeshNQ4ISI.getMaxAgeSeconds() * 1000;
        } else {
            kotlin.time.Instant highResolutionOutputSizeshNQ4ISI = computation.getHighResolutionOutputSizeshNQ4ISI();
            if (highResolutionOutputSizeshNQ4ISI != null) {
                kotlin.time.Instant highSpeedVideoFpsRangesFor2 = computation.getHighSpeedVideoFpsRangesFor();
                j = highResolutionOutputSizeshNQ4ISI.toEpochMilliseconds() - (highSpeedVideoFpsRangesFor2 != null ? highSpeedVideoFpsRangesFor2.toEpochMilliseconds() : computation.getOutputSizeshNQ4ISI);
            }
            j = 0;
        }
        if (computation.getHighSpeedVideoSizes.getMaxAgeSeconds() != -1) {
            j = java.lang.Math.min(j, computation.getHighSpeedVideoSizes.getMaxAgeSeconds() * 1000);
        }
        long minFreshSeconds = computation.getHighSpeedVideoSizes.getMinFreshSeconds() != -1 ? computation.getHighSpeedVideoSizes.getMinFreshSeconds() * 1000 : 0L;
        if (!computation.getHighResolutionOutputSizeshNQ4ISI.getMustRevalidate() && computation.getHighSpeedVideoSizes.getMaxStaleSeconds() != -1) {
            j2 = computation.getHighSpeedVideoSizes.getMaxStaleSeconds() * 1000;
        }
        if (!computation.getHighResolutionOutputSizeshNQ4ISI.getNoCache()) {
            long j3 = minFreshSeconds + max2;
            if (j3 < j2 + j) {
                coil3.network.NetworkHeaders.Builder newBuilder = computation.getHighSpeedVideoFpsRangesFor.getHeaders().newBuilder();
                if (j3 >= j) {
                    newBuilder.add(com.google.common.net.HttpHeaders.WARNING, "110 HttpURLConnection \"Response is stale\"");
                }
                if (max2 > 86400000 && computation.getHighResolutionOutputSizeshNQ4ISI.getMaxAgeSeconds() == -1 && computation.getHighResolutionOutputSizeshNQ4ISI() == null) {
                    newBuilder.add(com.google.common.net.HttpHeaders.WARNING, "113 HttpURLConnection \"Heuristic expiration\"");
                }
                copy = r0.copy((r18 & 1) != 0 ? r0.code : 0, (r18 & 2) != 0 ? r0.requestMillis : 0L, (r18 & 4) != 0 ? r0.responseMillis : 0L, (r18 & 8) != 0 ? r0.headers : newBuilder.build(), (r18 & 16) != 0 ? r0.body : null, (r18 & 32) != 0 ? computation.getHighSpeedVideoFpsRangesFor.delegate : null);
                return new coil3.network.CacheStrategy.ReadResult(copy);
            }
        }
        java.lang.String str2 = computation.getOutputStallDuration;
        if (str2 != null) {
            str = "If-None-Match";
        } else {
            kotlin.time.Instant instant = computation.getInputSizeshNQ4ISI;
            if (instant == null) {
                java.lang.String str3 = computation.getOutputMinFrameDuration;
                if (str3 != null) {
                    instant = kotlinx.datetime.InstantKt.parse(kotlin.time.Instant.INSTANCE, str3, coil3.content.cachecontrol.internal.UtilsKt.getBROWSER_DATE_TIME_FORMAT());
                    computation.getInputSizeshNQ4ISI = instant;
                } else {
                    instant = null;
                }
            }
            str = "If-Modified-Since";
            if (instant != null) {
                str2 = computation.getOutputMinFrameDuration;
            } else if (computation.getHighSpeedVideoFpsRangesFor() != null) {
                str2 = computation.getHighSpeedVideoSizesFor;
            } else {
                return new coil3.network.CacheStrategy.ReadResult(computation.getHighSpeedVideoFpsRanges);
            }
        }
        coil3.content.NetworkRequest networkRequest2 = computation.getHighSpeedVideoFpsRanges;
        coil3.network.NetworkHeaders.Builder newBuilder2 = networkRequest2.getHeaders().newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNull(str2);
        return new coil3.network.CacheStrategy.ReadResult(coil3.content.NetworkRequest.copy$default(networkRequest2, null, null, newBuilder2.add(str, str2).build(), null, null, 27, null));
    }

    @Override // coil3.content.CacheStrategy
    public final java.lang.Object write(coil3.content.NetworkResponse networkResponse, coil3.content.NetworkRequest networkRequest, coil3.content.NetworkResponse networkResponse2, coil3.view.Options options, kotlin.coroutines.Continuation<? super coil3.network.CacheStrategy.WriteResult> continuation) {
        if (!coil3.network.cachecontrol.CacheControlCacheStrategy.Companion_.getHighSpeedVideoFpsRanges(coil3.content.cachecontrol.internal.CacheControl.INSTANCE.parse(networkResponse2.getHeaders()), coil3.content.cachecontrol.internal.CacheControl.INSTANCE.parse(networkRequest.getHeaders()))) {
            return coil3.network.CacheStrategy.WriteResult.DISABLED;
        }
        return coil3.content.CacheStrategy.DEFAULT.write(networkResponse, networkRequest, networkResponse2, options, continuation);
    }

    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u00068C@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u000b\u0010\u001eR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001cR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00068C@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0012R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010\u001cR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u00068C@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b!\u0010\u0012\u001a\u0004\b\u0017\u0010\u001eR\u0016\u0010\u001b\u001a\u00020\"8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010#R\u0016\u0010 \u001a\u00020\"8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b$\u0010#R\u0018\u0010!\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001cR\u0016\u0010$\u001a\u00020%8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010&"}, d2 = {"Lcoil3/network/cachecontrol/CacheControlCacheStrategy$Computation;", "", "Lcoil3/network/NetworkResponse;", "p0", "Lcoil3/network/NetworkRequest;", "p1", "Lkotlin/time/Instant;", "p2", "<init>", "(Lcoil3/network/NetworkResponse;Lcoil3/network/NetworkRequest;Lkotlin/time/Instant;)V", "", "getHighSpeedVideoFpsRangesFor", "(Lcoil3/network/NetworkRequest;)Z", "Lcoil3/network/NetworkResponse;", "getInputFormats", "Lcoil3/network/NetworkRequest;", "getHighSpeedVideoFpsRanges", "getOutputMinFrameDuration", "Lkotlin/time/Instant;", "Camera2StreamConfigurationMap", "Lcoil3/network/cachecontrol/internal/CacheControl;", "getOutputFormats", "Lcoil3/network/cachecontrol/internal/CacheControl;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizesFor", "getHighSpeedVideoSizes", "", "getOutputStallDurationlomOqCM", "Ljava/lang/String;", "getOutputMinFrameDurationlomOqCM", "()Lkotlin/time/Instant;", "getInputSizeshNQ4ISI", "getOutputSizeshNQ4ISI", "getOutputStallDuration", "", "J", "getOutputSizes", "", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class Computation {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        java.lang.String getOutputMinFrameDuration;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        kotlin.time.Instant getInputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        int getOutputSizes;
        final coil3.content.NetworkResponse getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        java.lang.String getOutputStallDuration;

        /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
        final coil3.content.cachecontrol.internal.CacheControl getHighSpeedVideoSizes;

        /* renamed from: getInputFormats, reason: from kotlin metadata */
        final coil3.content.NetworkRequest getHighSpeedVideoFpsRanges;

        /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
        long getOutputStallDurationlomOqCM;

        /* renamed from: getOutputFormats, reason: from kotlin metadata */
        final coil3.content.cachecontrol.internal.CacheControl getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
        final kotlin.time.Instant Camera2StreamConfigurationMap;

        /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
        private kotlin.time.Instant getInputFormats;

        /* renamed from: getOutputSizes, reason: from kotlin metadata */
        long getOutputSizeshNQ4ISI;

        /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private java.lang.String getOutputFormats;

        /* renamed from: getOutputStallDuration, reason: from kotlin metadata */
        private kotlin.time.Instant getOutputMinFrameDurationlomOqCM;

        /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
        java.lang.String getHighSpeedVideoSizesFor;

        public Computation(coil3.content.NetworkResponse networkResponse, coil3.content.NetworkRequest networkRequest, kotlin.time.Instant instant) {
            this.getHighSpeedVideoFpsRangesFor = networkResponse;
            this.getHighSpeedVideoFpsRanges = networkRequest;
            this.Camera2StreamConfigurationMap = instant;
            this.getHighResolutionOutputSizeshNQ4ISI = coil3.content.cachecontrol.internal.CacheControl.INSTANCE.parse(networkResponse.getHeaders());
            this.getHighSpeedVideoSizes = coil3.content.cachecontrol.internal.CacheControl.INSTANCE.parse(networkRequest.getHeaders());
            this.getOutputSizes = -1;
            this.getOutputStallDurationlomOqCM = networkResponse.getRequestMillis();
            this.getOutputSizeshNQ4ISI = networkResponse.getResponseMillis();
            for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> entry : networkResponse.getHeaders().asMap().entrySet()) {
                java.lang.String key = entry.getKey();
                java.lang.String str = (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) entry.getValue());
                if (str != null) {
                    if (kotlin.text.StringsKt.equals(key, com.google.common.net.HttpHeaders.DATE, true)) {
                        this.getHighSpeedVideoSizesFor = str;
                    } else if (kotlin.text.StringsKt.equals(key, com.google.common.net.HttpHeaders.EXPIRES, true)) {
                        this.getOutputFormats = str;
                    } else if (kotlin.text.StringsKt.equals(key, "Last-Modified", true)) {
                        this.getOutputMinFrameDuration = str;
                    } else if (kotlin.text.StringsKt.equals(key, "ETag", true)) {
                        this.getOutputStallDuration = str;
                    } else if (kotlin.text.StringsKt.equals(key, "Age", true)) {
                        this.getOutputSizes = coil3.content.cachecontrol.internal.UtilsKt.toNonNegativeInt(str, -1);
                    }
                }
            }
        }

        final kotlin.time.Instant getHighSpeedVideoFpsRangesFor() {
            kotlin.time.Instant instant = this.getInputFormats;
            if (instant != null) {
                return instant;
            }
            java.lang.String str = this.getHighSpeedVideoSizesFor;
            if (str == null) {
                return null;
            }
            kotlin.time.Instant parse = kotlinx.datetime.InstantKt.parse(kotlin.time.Instant.INSTANCE, str, coil3.content.cachecontrol.internal.UtilsKt.getBROWSER_DATE_TIME_FORMAT());
            this.getInputFormats = parse;
            return parse;
        }

        final kotlin.time.Instant getHighResolutionOutputSizeshNQ4ISI() {
            kotlin.time.Instant instant = this.getOutputMinFrameDurationlomOqCM;
            if (instant != null) {
                return instant;
            }
            java.lang.String str = this.getOutputFormats;
            if (str == null) {
                return null;
            }
            kotlin.time.Instant distant_past = kotlin.jvm.internal.Intrinsics.areEqual(str, "0") ? kotlin.time.Instant.INSTANCE.getDISTANT_PAST() : kotlinx.datetime.InstantKt.parse(kotlin.time.Instant.INSTANCE, str, coil3.content.cachecontrol.internal.UtilsKt.getBROWSER_DATE_TIME_FORMAT());
            this.getOutputMinFrameDurationlomOqCM = distant_past;
            return distant_past;
        }

        static boolean getHighSpeedVideoFpsRangesFor(coil3.content.NetworkRequest p0) {
            return (p0.getHeaders().get("If-Modified-Since") == null && p0.getHeaders().get("If-None-Match") == null) ? false : true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcoil3/network/cachecontrol/CacheControlCacheStrategy$Companion_;", "", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class Companion_ {
        private Companion_() {
        }

        public static final /* synthetic */ boolean getHighSpeedVideoFpsRanges(coil3.content.cachecontrol.internal.CacheControl cacheControl, coil3.content.cachecontrol.internal.CacheControl cacheControl2) {
            return (cacheControl.getNoStore() || cacheControl2.getNoStore()) ? false : true;
        }

        public /* synthetic */ Companion_(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CacheControlCacheStrategy() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
