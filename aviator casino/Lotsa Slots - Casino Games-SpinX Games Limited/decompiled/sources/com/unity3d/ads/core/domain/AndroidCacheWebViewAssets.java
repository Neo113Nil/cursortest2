package com.unity3d.ads.core.domain;

/* compiled from: AndroidCacheWebViewAssets.kt */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0002J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u0016R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidCacheWebViewAssets;", "Lcom/unity3d/ads/core/domain/CacheWebViewAssets;", "cacheRepository", "Lcom/unity3d/ads/core/data/repository/CacheRepository;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "(Lcom/unity3d/ads/core/data/repository/CacheRepository;Lcom/unity3d/ads/core/data/repository/SessionRepository;)V", "_cached", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Ljava/io/File;", "cached", "", "getCached", "()Ljava/util/Map;", "getFilename", "url", "type", "invoke", "", "webviewConfiguration", "Lcom/unity3d/ads/core/data/model/WebViewConfiguration;", "(Lcom/unity3d/ads/core/data/model/WebViewConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidCacheWebViewAssets implements com.unity3d.ads.core.domain.CacheWebViewAssets {
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.io.File> _cached;
    private final com.unity3d.ads.core.data.repository.CacheRepository cacheRepository;
    private final com.unity3d.ads.core.data.repository.SessionRepository sessionRepository;

    public AndroidCacheWebViewAssets(com.unity3d.ads.core.data.repository.CacheRepository cacheRepository, com.unity3d.ads.core.data.repository.SessionRepository sessionRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheRepository, "cacheRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        this.cacheRepository = cacheRepository;
        this.sessionRepository = sessionRepository;
        this._cached = new java.util.concurrent.ConcurrentHashMap<>();
    }

    @Override // com.unity3d.ads.core.domain.CacheWebViewAssets
    public java.util.Map<java.lang.String, java.io.File> getCached() {
        return this._cached;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00f1 -> B:11:0x00f4). Please report as a decompilation issue!!! */
    @Override // com.unity3d.ads.core.domain.CacheWebViewAssets
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object invoke(com.unity3d.ads.core.data.model.WebViewConfiguration webViewConfiguration, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.ads.core.domain.AndroidCacheWebViewAssets$invoke$1 androidCacheWebViewAssets$invoke$1;
        int i;
        com.unity3d.ads.core.domain.AndroidCacheWebViewAssets androidCacheWebViewAssets;
        com.unity3d.ads.core.data.model.WebViewConfiguration webViewConfiguration2;
        com.unity3d.ads.core.domain.AndroidCacheWebViewAssets androidCacheWebViewAssets2;
        java.util.Iterator it;
        com.unity3d.ads.core.data.model.CacheResult cacheResult;
        if (continuation instanceof com.unity3d.ads.core.domain.AndroidCacheWebViewAssets$invoke$1) {
            androidCacheWebViewAssets$invoke$1 = (com.unity3d.ads.core.domain.AndroidCacheWebViewAssets$invoke$1) continuation;
            if ((androidCacheWebViewAssets$invoke$1.label & Integer.MIN_VALUE) != 0) {
                androidCacheWebViewAssets$invoke$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = androidCacheWebViewAssets$invoke$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidCacheWebViewAssets$invoke$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!this.sessionRepository.getNativeConfiguration().getFeatureFlags().getShouldHandleWebviewCaching()) {
                        return kotlin.Unit.INSTANCE;
                    }
                    if (webViewConfiguration.getEntryPoint().length() > 0) {
                        com.unity3d.ads.core.data.repository.CacheRepository cacheRepository = this.cacheRepository;
                        java.lang.String entryPoint = webViewConfiguration.getEntryPoint();
                        java.lang.String type = webViewConfiguration.getType();
                        androidCacheWebViewAssets$invoke$1.L$0 = this;
                        androidCacheWebViewAssets$invoke$1.L$1 = webViewConfiguration;
                        androidCacheWebViewAssets$invoke$1.label = 1;
                        obj = cacheRepository.getWebviewFile(entryPoint, type, androidCacheWebViewAssets$invoke$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        androidCacheWebViewAssets = this;
                    } else {
                        androidCacheWebViewAssets = this;
                        webViewConfiguration2 = webViewConfiguration;
                        androidCacheWebViewAssets2 = androidCacheWebViewAssets;
                        it = webViewConfiguration.getAdditionalFiles().iterator();
                        while (it.hasNext()) {
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        java.lang.String str = (java.lang.String) androidCacheWebViewAssets$invoke$1.L$3;
                        it = (java.util.Iterator) androidCacheWebViewAssets$invoke$1.L$2;
                        webViewConfiguration2 = (com.unity3d.ads.core.data.model.WebViewConfiguration) androidCacheWebViewAssets$invoke$1.L$1;
                        androidCacheWebViewAssets2 = (com.unity3d.ads.core.domain.AndroidCacheWebViewAssets) androidCacheWebViewAssets$invoke$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.unity3d.ads.core.data.model.CacheResult cacheResult2 = (com.unity3d.ads.core.data.model.CacheResult) obj;
                        if (cacheResult2 instanceof com.unity3d.ads.core.data.model.CacheResult.Success) {
                            com.unity3d.ads.core.data.model.CacheResult.Success success = (com.unity3d.ads.core.data.model.CacheResult.Success) cacheResult2;
                            if (success.getCachedFile().getFile() != null) {
                                androidCacheWebViewAssets2._cached.put(androidCacheWebViewAssets2.getFilename(str, webViewConfiguration2.getType()), success.getCachedFile().getFile());
                            }
                        }
                        while (it.hasNext()) {
                            str = (java.lang.String) it.next();
                            if (str.length() > 0) {
                                com.unity3d.ads.core.data.repository.CacheRepository cacheRepository2 = androidCacheWebViewAssets2.cacheRepository;
                                java.lang.String type2 = webViewConfiguration2.getType();
                                androidCacheWebViewAssets$invoke$1.L$0 = androidCacheWebViewAssets2;
                                androidCacheWebViewAssets$invoke$1.L$1 = webViewConfiguration2;
                                androidCacheWebViewAssets$invoke$1.L$2 = it;
                                androidCacheWebViewAssets$invoke$1.L$3 = str;
                                androidCacheWebViewAssets$invoke$1.label = 2;
                                obj = cacheRepository2.getWebviewFile(str, type2, androidCacheWebViewAssets$invoke$1);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                com.unity3d.ads.core.data.model.CacheResult cacheResult22 = (com.unity3d.ads.core.data.model.CacheResult) obj;
                                if (cacheResult22 instanceof com.unity3d.ads.core.data.model.CacheResult.Success) {
                                }
                                while (it.hasNext()) {
                                }
                            }
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    webViewConfiguration = (com.unity3d.ads.core.data.model.WebViewConfiguration) androidCacheWebViewAssets$invoke$1.L$1;
                    androidCacheWebViewAssets = (com.unity3d.ads.core.domain.AndroidCacheWebViewAssets) androidCacheWebViewAssets$invoke$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                cacheResult = (com.unity3d.ads.core.data.model.CacheResult) obj;
                if (cacheResult instanceof com.unity3d.ads.core.data.model.CacheResult.Success) {
                    com.unity3d.ads.core.data.model.CacheResult.Success success2 = (com.unity3d.ads.core.data.model.CacheResult.Success) cacheResult;
                    if (success2.getCachedFile().getFile() != null) {
                        androidCacheWebViewAssets._cached.put(androidCacheWebViewAssets.getFilename(webViewConfiguration.getEntryPoint(), webViewConfiguration.getType()), success2.getCachedFile().getFile());
                    }
                }
                webViewConfiguration2 = webViewConfiguration;
                androidCacheWebViewAssets2 = androidCacheWebViewAssets;
                it = webViewConfiguration.getAdditionalFiles().iterator();
                while (it.hasNext()) {
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        androidCacheWebViewAssets$invoke$1 = new com.unity3d.ads.core.domain.AndroidCacheWebViewAssets$invoke$1(this, continuation);
        java.lang.Object obj2 = androidCacheWebViewAssets$invoke$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidCacheWebViewAssets$invoke$1.label;
        if (i != 0) {
        }
        cacheResult = (com.unity3d.ads.core.data.model.CacheResult) obj2;
        if (cacheResult instanceof com.unity3d.ads.core.data.model.CacheResult.Success) {
        }
        webViewConfiguration2 = webViewConfiguration;
        androidCacheWebViewAssets2 = androidCacheWebViewAssets;
        it = webViewConfiguration.getAdditionalFiles().iterator();
        while (it.hasNext()) {
        }
        return kotlin.Unit.INSTANCE;
    }

    private final java.lang.String getFilename(java.lang.String url, java.lang.String type) {
        return type + kotlinx.io.files.FileSystemKt.UnixPathSeparator + kotlin.text.StringsKt.substringAfterLast$default(kotlin.text.StringsKt.substringBefore$default(url, '?', (java.lang.String) null, 2, (java.lang.Object) null), kotlinx.io.files.FileSystemKt.UnixPathSeparator, (java.lang.String) null, 2, (java.lang.Object) null);
    }
}
