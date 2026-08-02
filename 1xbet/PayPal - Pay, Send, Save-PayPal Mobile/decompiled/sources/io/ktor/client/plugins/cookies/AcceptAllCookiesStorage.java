package io.ktor.client.plugins.cookies;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001fB\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u0003*\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0014\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"Lio/ktor/client/plugins/cookies/AcceptAllCookiesStorage;", "Lio/ktor/client/plugins/cookies/CookiesStorage;", "Lkotlin/Function0;", "", "clock", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Lio/ktor/http/Url;", "requestUrl", "", "Lio/ktor/http/Cookie;", "get", "(Lio/ktor/http/Url;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cookie", "", "addCookie", "(Lio/ktor/http/Url;Lio/ktor/http/Cookie;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "()V", "p0", "Camera2StreamConfigurationMap", "(Lio/ktor/http/Cookie;J)Ljava/lang/Long;", "Lkotlin/jvm/functions/Function0;", "getHighSpeedVideoFpsRanges", "", "Lio/ktor/client/plugins/cookies/AcceptAllCookiesStorage$CookieWithTimestamp;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/List;", "Lkotlinx/coroutines/sync/Mutex;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/sync/Mutex;", "CookieWithTimestamp"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AcceptAllCookiesStorage implements io.ktor.client.plugins.cookies.CookiesStorage {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<java.lang.Long> getHighSpeedVideoFpsRanges;
    private final java.util.List<io.ktor.client.plugins.cookies.AcceptAllCookiesStorage.CookieWithTimestamp> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.sync.Mutex Camera2StreamConfigurationMap;
    private volatile /* synthetic */ long oldestCookie;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public AcceptAllCookiesStorage(kotlin.jvm.functions.Function0<java.lang.Long> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.getHighSpeedVideoFpsRanges = function0;
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList();
        this.oldestCookie = 0L;
        this.Camera2StreamConfigurationMap = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
    }

    public /* synthetic */ AcceptAllCookiesStorage(kotlin.jvm.functions.Function0 function0, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new kotlin.jvm.functions.Function0() { // from class: io.ktor.client.plugins.cookies.AcceptAllCookiesStorage$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                long timeMillis;
                timeMillis = io.ktor.util.date.DateJvmKt.getTimeMillis();
                return java.lang.Long.valueOf(timeMillis);
            }
        } : function0);
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lio/ktor/client/plugins/cookies/AcceptAllCookiesStorage$CookieWithTimestamp;", "", "Lio/ktor/http/Cookie;", "p0", "", "p1", "<init>", "(Lio/ktor/http/Cookie;J)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Lio/ktor/http/Cookie;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "J"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final /* data */ class CookieWithTimestamp {

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        final io.ktor.http.Cookie getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        final long getHighSpeedVideoFpsRangesFor;

        public CookieWithTimestamp(io.ktor.http.Cookie cookie, long j) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cookie, "");
            this.getHighResolutionOutputSizeshNQ4ISI = cookie;
            this.getHighSpeedVideoFpsRangesFor = j;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CookieWithTimestamp(getHighResolutionOutputSizeshNQ4ISI=");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb.append(", getHighSpeedVideoFpsRangesFor=");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return (this.getHighResolutionOutputSizeshNQ4ISI.hashCode() * 31) + java.lang.Long.hashCode(this.getHighSpeedVideoFpsRangesFor);
        }

        public final boolean equals(java.lang.Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof io.ktor.client.plugins.cookies.AcceptAllCookiesStorage.CookieWithTimestamp)) {
                return false;
            }
            io.ktor.client.plugins.cookies.AcceptAllCookiesStorage.CookieWithTimestamp cookieWithTimestamp = (io.ktor.client.plugins.cookies.AcceptAllCookiesStorage.CookieWithTimestamp) p0;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, cookieWithTimestamp.getHighResolutionOutputSizeshNQ4ISI) && this.getHighSpeedVideoFpsRangesFor == cookieWithTimestamp.getHighSpeedVideoFpsRangesFor;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061 A[Catch: all -> 0x00f0, TryCatch #0 {all -> 0x00f0, blocks: (B:11:0x004f, B:13:0x0061, B:14:0x0078, B:16:0x007e, B:19:0x008e, B:24:0x0099, B:25:0x009b, B:26:0x00aa, B:28:0x00b0, B:31:0x00bf, B:36:0x00c3, B:37:0x00d8, B:39:0x00de, B:41:0x00ea), top: B:10:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b0 A[Catch: all -> 0x00f0, TryCatch #0 {all -> 0x00f0, blocks: (B:11:0x004f, B:13:0x0061, B:14:0x0078, B:16:0x007e, B:19:0x008e, B:24:0x0099, B:25:0x009b, B:26:0x00aa, B:28:0x00b0, B:31:0x00bf, B:36:0x00c3, B:37:0x00d8, B:39:0x00de, B:41:0x00ea), top: B:10:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00de A[Catch: all -> 0x00f0, LOOP:2: B:37:0x00d8->B:39:0x00de, LOOP_END, TryCatch #0 {all -> 0x00f0, blocks: (B:11:0x004f, B:13:0x0061, B:14:0x0078, B:16:0x007e, B:19:0x008e, B:24:0x0099, B:25:0x009b, B:26:0x00aa, B:28:0x00b0, B:31:0x00bf, B:36:0x00c3, B:37:0x00d8, B:39:0x00de, B:41:0x00ea), top: B:10:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // io.ktor.client.plugins.cookies.CookiesStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object get(io.ktor.http.Url url, kotlin.coroutines.Continuation<? super java.util.List<io.ktor.http.Cookie>> continuation) {
        io.ktor.client.plugins.cookies.AcceptAllCookiesStorage$get$1 acceptAllCookiesStorage$get$1;
        int i;
        kotlinx.coroutines.sync.Mutex mutex;
        final long longValue;
        java.util.Iterator it;
        try {
            if (continuation instanceof io.ktor.client.plugins.cookies.AcceptAllCookiesStorage$get$1) {
                acceptAllCookiesStorage$get$1 = (io.ktor.client.plugins.cookies.AcceptAllCookiesStorage$get$1) continuation;
                if ((acceptAllCookiesStorage$get$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                    acceptAllCookiesStorage$get$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                    java.lang.Object obj = acceptAllCookiesStorage$get$1.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = acceptAllCookiesStorage$get$1.getHighSpeedVideoFpsRangesFor;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        mutex = this.Camera2StreamConfigurationMap;
                        acceptAllCookiesStorage$get$1.getHighSpeedVideoFpsRanges = url;
                        acceptAllCookiesStorage$get$1.getHighSpeedVideoSizes = mutex;
                        acceptAllCookiesStorage$get$1.getHighSpeedVideoFpsRangesFor = 1;
                        if (mutex.lock(null, acceptAllCookiesStorage$get$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlinx.coroutines.sync.Mutex mutex2 = (kotlinx.coroutines.sync.Mutex) acceptAllCookiesStorage$get$1.getHighSpeedVideoSizes;
                        io.ktor.http.Url url2 = (io.ktor.http.Url) acceptAllCookiesStorage$get$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj);
                        mutex = mutex2;
                        url = url2;
                    }
                    longValue = this.getHighSpeedVideoFpsRanges.invoke().longValue();
                    if (longValue >= this.oldestCookie) {
                        kotlin.collections.CollectionsKt.removeAll((java.util.List) this.getHighResolutionOutputSizeshNQ4ISI, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.cookies.AcceptAllCookiesStorage$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return java.lang.Boolean.valueOf(io.ktor.client.plugins.cookies.AcceptAllCookiesStorage.$r8$lambda$w8Yv9HtC6ieW7XXYv76Ed7gwfCQ(io.ktor.client.plugins.cookies.AcceptAllCookiesStorage.this, longValue, (io.ktor.client.plugins.cookies.AcceptAllCookiesStorage.CookieWithTimestamp) obj2));
                            }
                        });
                        long j = Long.MAX_VALUE;
                        for (io.ktor.client.plugins.cookies.AcceptAllCookiesStorage.CookieWithTimestamp cookieWithTimestamp : this.getHighResolutionOutputSizeshNQ4ISI) {
                            java.lang.Long Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(cookieWithTimestamp.getHighResolutionOutputSizeshNQ4ISI, cookieWithTimestamp.getHighSpeedVideoFpsRangesFor);
                            if (Camera2StreamConfigurationMap != null) {
                                j = java.lang.Math.min(j, Camera2StreamConfigurationMap.longValue());
                            }
                        }
                        this.oldestCookie = j;
                    }
                    java.util.List<io.ktor.client.plugins.cookies.AcceptAllCookiesStorage.CookieWithTimestamp> list = this.getHighResolutionOutputSizeshNQ4ISI;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj2 : list) {
                        if (io.ktor.client.plugins.cookies.CookiesStorageKt.matches(((io.ktor.client.plugins.cookies.AcceptAllCookiesStorage.CookieWithTimestamp) obj2).getHighResolutionOutputSizeshNQ4ISI, url)) {
                            arrayList.add(obj2);
                        }
                    }
                    java.util.ArrayList arrayList2 = arrayList;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                    it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(((io.ktor.client.plugins.cookies.AcceptAllCookiesStorage.CookieWithTimestamp) it.next()).getHighResolutionOutputSizeshNQ4ISI);
                    }
                    return arrayList3;
                }
            }
            longValue = this.getHighSpeedVideoFpsRanges.invoke().longValue();
            if (longValue >= this.oldestCookie) {
            }
            java.util.List<io.ktor.client.plugins.cookies.AcceptAllCookiesStorage.CookieWithTimestamp> list2 = this.getHighResolutionOutputSizeshNQ4ISI;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            while (r0.hasNext()) {
            }
            java.util.ArrayList arrayList22 = arrayList4;
            java.util.ArrayList arrayList32 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList22, 10));
            it = arrayList22.iterator();
            while (it.hasNext()) {
            }
            return arrayList32;
        } finally {
            mutex.unlock(null);
        }
        acceptAllCookiesStorage$get$1 = new io.ktor.client.plugins.cookies.AcceptAllCookiesStorage$get$1(this, continuation);
        java.lang.Object obj3 = acceptAllCookiesStorage$get$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = acceptAllCookiesStorage$get$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008e A[Catch: all -> 0x00a4, TryCatch #0 {all -> 0x00a4, blocks: (B:11:0x0064, B:13:0x008e, B:15:0x009a, B:16:0x009c), top: B:10:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // io.ktor.client.plugins.cookies.CookiesStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object addCookie(final io.ktor.http.Url url, final io.ktor.http.Cookie cookie, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.plugins.cookies.AcceptAllCookiesStorage$addCookie$1 acceptAllCookiesStorage$addCookie$1;
        int i;
        kotlinx.coroutines.sync.Mutex mutex;
        java.lang.Long Camera2StreamConfigurationMap;
        try {
            if (continuation instanceof io.ktor.client.plugins.cookies.AcceptAllCookiesStorage$addCookie$1) {
                acceptAllCookiesStorage$addCookie$1 = (io.ktor.client.plugins.cookies.AcceptAllCookiesStorage$addCookie$1) continuation;
                if ((acceptAllCookiesStorage$addCookie$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                    acceptAllCookiesStorage$addCookie$1.getHighSpeedVideoFpsRanges -= 2147483648;
                    java.lang.Object obj = acceptAllCookiesStorage$addCookie$1.Camera2StreamConfigurationMap;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = acceptAllCookiesStorage$addCookie$1.getHighSpeedVideoFpsRanges;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (kotlin.text.StringsKt.isBlank(cookie.getName())) {
                            return kotlin.Unit.INSTANCE;
                        }
                        mutex = this.Camera2StreamConfigurationMap;
                        acceptAllCookiesStorage$addCookie$1.getHighSpeedVideoSizes = url;
                        acceptAllCookiesStorage$addCookie$1.getHighSpeedVideoFpsRangesFor = cookie;
                        acceptAllCookiesStorage$addCookie$1.getHighResolutionOutputSizeshNQ4ISI = mutex;
                        acceptAllCookiesStorage$addCookie$1.getHighSpeedVideoFpsRanges = 1;
                        if (mutex.lock(null, acceptAllCookiesStorage$addCookie$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlinx.coroutines.sync.Mutex mutex2 = (kotlinx.coroutines.sync.Mutex) acceptAllCookiesStorage$addCookie$1.getHighResolutionOutputSizeshNQ4ISI;
                        cookie = (io.ktor.http.Cookie) acceptAllCookiesStorage$addCookie$1.getHighSpeedVideoFpsRangesFor;
                        io.ktor.http.Url url2 = (io.ktor.http.Url) acceptAllCookiesStorage$addCookie$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                        mutex = mutex2;
                        url = url2;
                    }
                    kotlin.collections.CollectionsKt.removeAll((java.util.List) this.getHighResolutionOutputSizeshNQ4ISI, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.cookies.AcceptAllCookiesStorage$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return java.lang.Boolean.valueOf(io.ktor.client.plugins.cookies.AcceptAllCookiesStorage.$r8$lambda$hgdnnBcat2RvEQiyBjcfO3S_r2w(io.ktor.http.Cookie.this, url, (io.ktor.client.plugins.cookies.AcceptAllCookiesStorage.CookieWithTimestamp) obj2));
                        }
                    });
                    long longValue = this.getHighSpeedVideoFpsRanges.invoke().longValue();
                    this.getHighResolutionOutputSizeshNQ4ISI.add(new io.ktor.client.plugins.cookies.AcceptAllCookiesStorage.CookieWithTimestamp(io.ktor.client.plugins.cookies.CookiesStorageKt.fillDefaults(cookie, url), longValue));
                    Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(cookie, longValue);
                    if (Camera2StreamConfigurationMap != null) {
                        long longValue2 = Camera2StreamConfigurationMap.longValue();
                        if (this.oldestCookie > longValue2) {
                            this.oldestCookie = longValue2;
                        }
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    }
                    mutex.unlock(null);
                    return kotlin.Unit.INSTANCE;
                }
            }
            kotlin.collections.CollectionsKt.removeAll((java.util.List) this.getHighResolutionOutputSizeshNQ4ISI, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.cookies.AcceptAllCookiesStorage$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return java.lang.Boolean.valueOf(io.ktor.client.plugins.cookies.AcceptAllCookiesStorage.$r8$lambda$hgdnnBcat2RvEQiyBjcfO3S_r2w(io.ktor.http.Cookie.this, url, (io.ktor.client.plugins.cookies.AcceptAllCookiesStorage.CookieWithTimestamp) obj2));
                }
            });
            long longValue3 = this.getHighSpeedVideoFpsRanges.invoke().longValue();
            this.getHighResolutionOutputSizeshNQ4ISI.add(new io.ktor.client.plugins.cookies.AcceptAllCookiesStorage.CookieWithTimestamp(io.ktor.client.plugins.cookies.CookiesStorageKt.fillDefaults(cookie, url), longValue3));
            Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(cookie, longValue3);
            if (Camera2StreamConfigurationMap != null) {
            }
            mutex.unlock(null);
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            mutex.unlock(null);
            throw th;
        }
        acceptAllCookiesStorage$addCookie$1 = new io.ktor.client.plugins.cookies.AcceptAllCookiesStorage$addCookie$1(this, continuation);
        java.lang.Object obj2 = acceptAllCookiesStorage$addCookie$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = acceptAllCookiesStorage$addCookie$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
    }

    private static java.lang.Long Camera2StreamConfigurationMap(io.ktor.http.Cookie cookie, long j) {
        if (cookie.getMaxAgeInt() != null) {
            return java.lang.Long.valueOf(j + (r0.intValue() * 1000));
        }
        io.ktor.util.date.GMTDate expires = cookie.getExpires();
        if (expires != null) {
            return java.lang.Long.valueOf(expires.getTimestamp());
        }
        return null;
    }

    public static /* synthetic */ boolean $r8$lambda$hgdnnBcat2RvEQiyBjcfO3S_r2w(io.ktor.http.Cookie cookie, io.ktor.http.Url url, io.ktor.client.plugins.cookies.AcceptAllCookiesStorage.CookieWithTimestamp cookieWithTimestamp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cookieWithTimestamp, "");
        io.ktor.http.Cookie cookie2 = cookieWithTimestamp.getHighResolutionOutputSizeshNQ4ISI;
        return kotlin.jvm.internal.Intrinsics.areEqual(cookie2.getName(), cookie.getName()) && io.ktor.client.plugins.cookies.CookiesStorageKt.matches(cookie2, url);
    }

    public static /* synthetic */ boolean $r8$lambda$w8Yv9HtC6ieW7XXYv76Ed7gwfCQ(io.ktor.client.plugins.cookies.AcceptAllCookiesStorage acceptAllCookiesStorage, long j, io.ktor.client.plugins.cookies.AcceptAllCookiesStorage.CookieWithTimestamp cookieWithTimestamp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cookieWithTimestamp, "");
        java.lang.Long Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(cookieWithTimestamp.getHighResolutionOutputSizeshNQ4ISI, cookieWithTimestamp.getHighSpeedVideoFpsRangesFor);
        return Camera2StreamConfigurationMap != null && Camera2StreamConfigurationMap.longValue() < j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AcceptAllCookiesStorage() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
