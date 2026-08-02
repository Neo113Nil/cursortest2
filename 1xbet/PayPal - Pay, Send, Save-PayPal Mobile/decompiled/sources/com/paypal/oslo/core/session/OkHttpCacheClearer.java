package com.paypal.oslo.core.session;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0017\b\u0017\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0007\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/core/session/OkHttpCacheClearer;", "", "Ldagger/Lazy;", "Lcom/paypal/oslo/core/network/http/DynamicOkHttpClientProvider;", "dynamicOkHttpClientProviderLazy", "Lkotlinx/coroutines/CoroutineDispatcher;", "clearDispatcher", "<init>", "(Ldagger/Lazy;Lkotlinx/coroutines/CoroutineDispatcher;)V", "dynamicOkHttpClientProvider", "(Ldagger/Lazy;)V", "", "clearCache", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Ldagger/Lazy;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/CoroutineDispatcher;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class OkHttpCacheClearer {
    private final dagger.Lazy<com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher getHighResolutionOutputSizeshNQ4ISI;

    public OkHttpCacheClearer(dagger.Lazy<com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider> lazy, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.getHighSpeedVideoFpsRangesFor = lazy;
        this.getHighResolutionOutputSizeshNQ4ISI = coroutineDispatcher;
    }

    public /* synthetic */ OkHttpCacheClearer(dagger.Lazy lazy, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(lazy, (i & 2) != 0 ? kotlinx.coroutines.Dispatchers.getIO() : coroutineDispatcher);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @javax.inject.Inject
    public OkHttpCacheClearer(dagger.Lazy<com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider> lazy) {
        this(lazy, kotlinx.coroutines.Dispatchers.getIO());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|26|6|7|(0)(0)|11|12|13|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        com.paypal.oslo.core.session.LoggerKt.log.e("Failed to clear OkHttp cache", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        throw r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object clearCache(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.core.session.OkHttpCacheClearer$clearCache$1 okHttpCacheClearer$clearCache$1;
        int i;
        if (continuation instanceof com.paypal.oslo.core.session.OkHttpCacheClearer$clearCache$1) {
            okHttpCacheClearer$clearCache$1 = (com.paypal.oslo.core.session.OkHttpCacheClearer$clearCache$1) continuation;
            if ((okHttpCacheClearer$clearCache$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                okHttpCacheClearer$clearCache$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = okHttpCacheClearer$clearCache$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = okHttpCacheClearer$clearCache$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher = this.getHighResolutionOutputSizeshNQ4ISI;
                    com.paypal.oslo.core.session.OkHttpCacheClearer$clearCache$2 okHttpCacheClearer$clearCache$2 = new com.paypal.oslo.core.session.OkHttpCacheClearer$clearCache$2(this, null);
                    okHttpCacheClearer$clearCache$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    if (kotlinx.coroutines.BuildersKt.withContext(coroutineDispatcher, okHttpCacheClearer$clearCache$2, okHttpCacheClearer$clearCache$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        okHttpCacheClearer$clearCache$1 = new com.paypal.oslo.core.session.OkHttpCacheClearer$clearCache$1(this, continuation);
        java.lang.Object obj2 = okHttpCacheClearer$clearCache$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = okHttpCacheClearer$clearCache$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ void access$performClear(com.paypal.oslo.core.session.OkHttpCacheClearer okHttpCacheClearer) {
        okhttp3.Cache cache = okHttpCacheClearer.getHighSpeedVideoFpsRangesFor.get().getOkHttpClient().cache();
        if (cache == null) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.session.LoggerKt.log, "OkHttp cache not configured, nothing to clear", null, null, 6, null);
        } else {
            cache.evictAll();
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.session.LoggerKt.log, "OkHttp cache cleared successfully", null, null, 6, null);
        }
    }
}
