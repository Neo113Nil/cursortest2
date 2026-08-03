package com.unity3d.ads.core.domain;

/* compiled from: CommonCleanAssets.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonCleanAssets;", "Lcom/unity3d/ads/core/domain/CleanAssets;", "cacheRepository", "Lcom/unity3d/ads/core/data/repository/CacheRepository;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "(Lcom/unity3d/ads/core/data/repository/CacheRepository;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "invoke", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CommonCleanAssets implements com.unity3d.ads.core.domain.CleanAssets {
    private final com.unity3d.ads.core.data.repository.CacheRepository cacheRepository;
    private final com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent;

    public CommonCleanAssets(com.unity3d.ads.core.data.repository.CacheRepository cacheRepository, com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheRepository, "cacheRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.cacheRepository = cacheRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.unity3d.ads.core.domain.CleanAssets
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.ads.core.domain.CommonCleanAssets$invoke$1 commonCleanAssets$invoke$1;
        java.lang.Object coroutine_suspended;
        int i;
        com.unity3d.ads.core.domain.CommonCleanAssets commonCleanAssets;
        long j;
        com.unity3d.ads.core.data.repository.CacheRepository cacheRepository;
        com.unity3d.ads.core.domain.CommonCleanAssets commonCleanAssets2;
        long j2;
        long j3;
        if (continuation instanceof com.unity3d.ads.core.domain.CommonCleanAssets$invoke$1) {
            commonCleanAssets$invoke$1 = (com.unity3d.ads.core.domain.CommonCleanAssets$invoke$1) continuation;
            if ((commonCleanAssets$invoke$1.label & Integer.MIN_VALUE) != 0) {
                commonCleanAssets$invoke$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = commonCleanAssets$invoke$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = commonCleanAssets$invoke$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    long m12261markNowz9LOYto = kotlin.time.TimeSource.Monotonic.INSTANCE.m12261markNowz9LOYto();
                    com.unity3d.ads.core.data.repository.CacheRepository cacheRepository2 = this.cacheRepository;
                    commonCleanAssets$invoke$1.L$0 = this;
                    commonCleanAssets$invoke$1.J$0 = m12261markNowz9LOYto;
                    commonCleanAssets$invoke$1.label = 1;
                    obj = cacheRepository2.getCacheSize(commonCleanAssets$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    commonCleanAssets = this;
                    j = m12261markNowz9LOYto;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j3 = commonCleanAssets$invoke$1.J$1;
                        j2 = commonCleanAssets$invoke$1.J$0;
                        commonCleanAssets2 = (com.unity3d.ads.core.domain.CommonCleanAssets) commonCleanAssets$invoke$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(commonCleanAssets2.sendDiagnosticEvent, "native_clean_assets_task_success_time", kotlin.coroutines.jvm.internal.Boxing.boxDouble(com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m12262boximpl(j2))), null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("size_kb", kotlin.coroutines.jvm.internal.Boxing.boxInt((int) (j3 / 1024)))), null, null, 52, null);
                        return kotlin.Unit.INSTANCE;
                    }
                    j = commonCleanAssets$invoke$1.J$0;
                    commonCleanAssets = (com.unity3d.ads.core.domain.CommonCleanAssets) commonCleanAssets$invoke$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                long longValue = ((java.lang.Number) obj).longValue();
                cacheRepository = commonCleanAssets.cacheRepository;
                commonCleanAssets$invoke$1.L$0 = commonCleanAssets;
                commonCleanAssets$invoke$1.J$0 = j;
                commonCleanAssets$invoke$1.J$1 = longValue;
                commonCleanAssets$invoke$1.label = 2;
                if (cacheRepository.clearCache(commonCleanAssets$invoke$1) != coroutine_suspended) {
                    return coroutine_suspended;
                }
                commonCleanAssets2 = commonCleanAssets;
                j2 = j;
                j3 = longValue;
                com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(commonCleanAssets2.sendDiagnosticEvent, "native_clean_assets_task_success_time", kotlin.coroutines.jvm.internal.Boxing.boxDouble(com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m12262boximpl(j2))), null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("size_kb", kotlin.coroutines.jvm.internal.Boxing.boxInt((int) (j3 / 1024)))), null, null, 52, null);
                return kotlin.Unit.INSTANCE;
            }
        }
        commonCleanAssets$invoke$1 = new com.unity3d.ads.core.domain.CommonCleanAssets$invoke$1(this, continuation);
        java.lang.Object obj2 = commonCleanAssets$invoke$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = commonCleanAssets$invoke$1.label;
        if (i != 0) {
        }
        long longValue2 = ((java.lang.Number) obj2).longValue();
        cacheRepository = commonCleanAssets.cacheRepository;
        commonCleanAssets$invoke$1.L$0 = commonCleanAssets;
        commonCleanAssets$invoke$1.J$0 = j;
        commonCleanAssets$invoke$1.J$1 = longValue2;
        commonCleanAssets$invoke$1.label = 2;
        if (cacheRepository.clearCache(commonCleanAssets$invoke$1) != coroutine_suspended) {
        }
    }
}
