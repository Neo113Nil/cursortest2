package com.unity3d.ads.core.domain;

/* compiled from: CommonCacheFile.kt */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J3\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonCacheFile;", "Lcom/unity3d/ads/core/domain/CacheFile;", "cacheRepository", "Lcom/unity3d/ads/core/data/repository/CacheRepository;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "(Lcom/unity3d/ads/core/data/repository/CacheRepository;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "invoke", "Lcom/unity3d/ads/core/data/model/CacheResult;", "url", "", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "headers", "Lorg/json/JSONArray;", "priority", "", "(Ljava/lang/String;Lcom/unity3d/ads/core/data/model/AdObject;Lorg/json/JSONArray;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CommonCacheFile implements com.unity3d.ads.core.domain.CacheFile {
    private final com.unity3d.ads.core.data.repository.CacheRepository cacheRepository;
    private final com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent;

    public CommonCacheFile(com.unity3d.ads.core.data.repository.CacheRepository cacheRepository, com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheRepository, "cacheRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.cacheRepository = cacheRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // com.unity3d.ads.core.domain.CacheFile
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object invoke(java.lang.String str, com.unity3d.ads.core.data.model.AdObject adObject, org.json.JSONArray jSONArray, int i, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.CacheResult> continuation) {
        com.unity3d.ads.core.domain.CommonCacheFile$invoke$1 commonCacheFile$invoke$1;
        int i2;
        com.unity3d.ads.core.domain.CommonCacheFile commonCacheFile;
        com.unity3d.ads.core.data.model.AdObject adObject2;
        long j;
        com.unity3d.ads.core.data.model.CacheResult cacheResult;
        java.lang.String str2;
        if (continuation instanceof com.unity3d.ads.core.domain.CommonCacheFile$invoke$1) {
            commonCacheFile$invoke$1 = (com.unity3d.ads.core.domain.CommonCacheFile$invoke$1) continuation;
            if ((commonCacheFile$invoke$1.label & Integer.MIN_VALUE) != 0) {
                commonCacheFile$invoke$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = commonCacheFile$invoke$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = commonCacheFile$invoke$1.label;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    long m12261markNowz9LOYto = kotlin.time.TimeSource.Monotonic.INSTANCE.m12261markNowz9LOYto();
                    com.unity3d.ads.core.data.repository.CacheRepository cacheRepository = this.cacheRepository;
                    commonCacheFile$invoke$1.L$0 = this;
                    commonCacheFile$invoke$1.L$1 = adObject;
                    commonCacheFile$invoke$1.J$0 = m12261markNowz9LOYto;
                    commonCacheFile$invoke$1.label = 1;
                    obj = cacheRepository.getFile(str, jSONArray, i, commonCacheFile$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    commonCacheFile = this;
                    adObject2 = adObject;
                    j = m12261markNowz9LOYto;
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = commonCacheFile$invoke$1.J$0;
                    com.unity3d.ads.core.data.model.AdObject adObject3 = (com.unity3d.ads.core.data.model.AdObject) commonCacheFile$invoke$1.L$1;
                    commonCacheFile = (com.unity3d.ads.core.domain.CommonCacheFile) commonCacheFile$invoke$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    adObject2 = adObject3;
                }
                cacheResult = (com.unity3d.ads.core.data.model.CacheResult) obj;
                if (!(cacheResult instanceof com.unity3d.ads.core.data.model.CacheResult.Success)) {
                    com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent = commonCacheFile.sendDiagnosticEvent;
                    java.lang.Double boxDouble = kotlin.coroutines.jvm.internal.Boxing.boxDouble(com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m12262boximpl(j)));
                    com.unity3d.ads.core.data.model.CacheResult.Success success = (com.unity3d.ads.core.data.model.CacheResult.Success) cacheResult;
                    com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_load_cache_success_time", boxDouble, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cache_source", success.getSource().toString()), kotlin.TuplesKt.to("protocol", success.getCachedFile().getProtocol())), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("size_kb", kotlin.coroutines.jvm.internal.Boxing.boxInt((int) (success.getCachedFile().getContentLength() / 1024)))), adObject2, null, 32, null);
                } else if (cacheResult instanceof com.unity3d.ads.core.data.model.CacheResult.Failure) {
                    com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent2 = commonCacheFile.sendDiagnosticEvent;
                    java.lang.Double boxDouble2 = kotlin.coroutines.jvm.internal.Boxing.boxDouble(com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m12262boximpl(j)));
                    kotlin.Pair[] pairArr = new kotlin.Pair[3];
                    com.unity3d.ads.core.data.model.CacheResult.Failure failure = (com.unity3d.ads.core.data.model.CacheResult.Failure) cacheResult;
                    pairArr[0] = kotlin.TuplesKt.to("cache_source", failure.getSource().toString());
                    pairArr[1] = kotlin.TuplesKt.to("reason", failure.getError().toString());
                    java.lang.Throwable reason = failure.getReason();
                    if (reason == null || (str2 = reason.getMessage()) == null) {
                        str2 = "";
                    }
                    pairArr[2] = kotlin.TuplesKt.to("reason_debug", str2);
                    com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, "native_load_cache_failure_time", boxDouble2, kotlin.collections.MapsKt.mapOf(pairArr), null, adObject2, null, 40, null);
                }
                return cacheResult;
            }
        }
        commonCacheFile$invoke$1 = new com.unity3d.ads.core.domain.CommonCacheFile$invoke$1(this, continuation);
        java.lang.Object obj2 = commonCacheFile$invoke$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = commonCacheFile$invoke$1.label;
        if (i2 != 0) {
        }
        cacheResult = (com.unity3d.ads.core.data.model.CacheResult) obj2;
        if (!(cacheResult instanceof com.unity3d.ads.core.data.model.CacheResult.Success)) {
        }
        return cacheResult;
    }
}
