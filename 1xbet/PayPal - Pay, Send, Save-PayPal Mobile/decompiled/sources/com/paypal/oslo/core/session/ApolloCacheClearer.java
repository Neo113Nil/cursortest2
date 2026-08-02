package com.paypal.oslo.core.session;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0017\b\u0017\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\r\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/core/session/ApolloCacheClearer;", "", "Ldagger/Lazy;", "Lcom/apollographql/apollo/cache/normalized/ApolloStore;", "apolloStore", "Lkotlinx/coroutines/CoroutineDispatcher;", "clearDispatcher", "<init>", "(Ldagger/Lazy;Lkotlinx/coroutines/CoroutineDispatcher;)V", "(Ldagger/Lazy;)V", "", "clearCache", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Ldagger/Lazy;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/CoroutineDispatcher;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ApolloCacheClearer {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final dagger.Lazy<com.apollographql.apollo.cache.normalized.ApolloStore> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher Camera2StreamConfigurationMap;

    public ApolloCacheClearer(dagger.Lazy<com.apollographql.apollo.cache.normalized.ApolloStore> lazy, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.getHighSpeedVideoFpsRangesFor = lazy;
        this.Camera2StreamConfigurationMap = coroutineDispatcher;
    }

    public /* synthetic */ ApolloCacheClearer(dagger.Lazy lazy, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(lazy, (i & 2) != 0 ? kotlinx.coroutines.Dispatchers.getIO() : coroutineDispatcher);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @javax.inject.Inject
    public ApolloCacheClearer(dagger.Lazy<com.apollographql.apollo.cache.normalized.ApolloStore> lazy) {
        this(lazy, kotlinx.coroutines.Dispatchers.getIO());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|26|6|7|(0)(0)|11|12|13|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
    
        com.paypal.oslo.core.session.LoggerKt.log.e("Failed to clear Apollo cache due to an invalid ApolloStore state/config", r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object clearCache(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.core.session.ApolloCacheClearer$clearCache$1 apolloCacheClearer$clearCache$1;
        int i;
        if (continuation instanceof com.paypal.oslo.core.session.ApolloCacheClearer$clearCache$1) {
            apolloCacheClearer$clearCache$1 = (com.paypal.oslo.core.session.ApolloCacheClearer$clearCache$1) continuation;
            if ((apolloCacheClearer$clearCache$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                apolloCacheClearer$clearCache$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = apolloCacheClearer$clearCache$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = apolloCacheClearer$clearCache$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher = this.Camera2StreamConfigurationMap;
                    com.paypal.oslo.core.session.ApolloCacheClearer$clearCache$2 apolloCacheClearer$clearCache$2 = new com.paypal.oslo.core.session.ApolloCacheClearer$clearCache$2(this, null);
                    apolloCacheClearer$clearCache$1.Camera2StreamConfigurationMap = 1;
                    if (kotlinx.coroutines.BuildersKt.withContext(coroutineDispatcher, apolloCacheClearer$clearCache$2, apolloCacheClearer$clearCache$1) == coroutine_suspended) {
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
        apolloCacheClearer$clearCache$1 = new com.paypal.oslo.core.session.ApolloCacheClearer$clearCache$1(this, continuation);
        java.lang.Object obj2 = apolloCacheClearer$clearCache$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = apolloCacheClearer$clearCache$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ void access$performClear(com.paypal.oslo.core.session.ApolloCacheClearer apolloCacheClearer) {
        if (apolloCacheClearer.getHighSpeedVideoFpsRangesFor.get().clearAll()) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.session.LoggerKt.log, "Apollo cache cleared successfully", null, null, 6, null);
        } else {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.session.LoggerKt.log, "Apollo cache clearAll returned false", null, null, 6, null);
        }
    }
}
