package com.unity3d.ads.core.domain;

/* compiled from: CommonGetIsFileCache.kt */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonGetIsFileCache;", "Lcom/unity3d/ads/core/domain/GetIsFileCache;", "cacheRepository", "Lcom/unity3d/ads/core/data/repository/CacheRepository;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "(Lcom/unity3d/ads/core/data/repository/CacheRepository;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "invoke", "", "url", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CommonGetIsFileCache implements com.unity3d.ads.core.domain.GetIsFileCache {
    private final com.unity3d.ads.core.data.repository.CacheRepository cacheRepository;
    private final com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent;

    public CommonGetIsFileCache(com.unity3d.ads.core.data.repository.CacheRepository cacheRepository, com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheRepository, "cacheRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.cacheRepository = cacheRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.unity3d.ads.core.domain.GetIsFileCache
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object invoke(java.lang.String str, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        com.unity3d.ads.core.domain.CommonGetIsFileCache$invoke$1 commonGetIsFileCache$invoke$1;
        int i;
        com.unity3d.ads.core.domain.CommonGetIsFileCache commonGetIsFileCache;
        long j;
        if (continuation instanceof com.unity3d.ads.core.domain.CommonGetIsFileCache$invoke$1) {
            commonGetIsFileCache$invoke$1 = (com.unity3d.ads.core.domain.CommonGetIsFileCache$invoke$1) continuation;
            if ((commonGetIsFileCache$invoke$1.label & Integer.MIN_VALUE) != 0) {
                commonGetIsFileCache$invoke$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = commonGetIsFileCache$invoke$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = commonGetIsFileCache$invoke$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    long m12261markNowz9LOYto = kotlin.time.TimeSource.Monotonic.INSTANCE.m12261markNowz9LOYto();
                    java.lang.String substringAfterLast$default = kotlin.text.StringsKt.substringAfterLast$default(str, com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING, (java.lang.String) null, 2, (java.lang.Object) null);
                    com.unity3d.ads.core.data.repository.CacheRepository cacheRepository = this.cacheRepository;
                    commonGetIsFileCache$invoke$1.L$0 = this;
                    commonGetIsFileCache$invoke$1.J$0 = m12261markNowz9LOYto;
                    commonGetIsFileCache$invoke$1.label = 1;
                    obj = cacheRepository.doesFileExist(substringAfterLast$default, commonGetIsFileCache$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    commonGetIsFileCache = this;
                    j = m12261markNowz9LOYto;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = commonGetIsFileCache$invoke$1.J$0;
                    commonGetIsFileCache = (com.unity3d.ads.core.domain.CommonGetIsFileCache) commonGetIsFileCache$invoke$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
                com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(commonGetIsFileCache.sendDiagnosticEvent, !booleanValue ? "native_show_is_file_cached_success_time" : "native_show_is_file_cached_failure_time", kotlin.coroutines.jvm.internal.Boxing.boxDouble(com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m12262boximpl(j))), null, null, null, null, 60, null);
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(booleanValue);
            }
        }
        commonGetIsFileCache$invoke$1 = new com.unity3d.ads.core.domain.CommonGetIsFileCache$invoke$1(this, continuation);
        java.lang.Object obj2 = commonGetIsFileCache$invoke$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = commonGetIsFileCache$invoke$1.label;
        if (i != 0) {
        }
        boolean booleanValue2 = ((java.lang.Boolean) obj2).booleanValue();
        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(commonGetIsFileCache.sendDiagnosticEvent, !booleanValue2 ? "native_show_is_file_cached_success_time" : "native_show_is_file_cached_failure_time", kotlin.coroutines.jvm.internal.Boxing.boxDouble(com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m12262boximpl(j))), null, null, null, null, 60, null);
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(booleanValue2);
    }
}
