package com.unity3d.ads.core.data.repository;

/* compiled from: AndroidCacheRepository.kt */
@kotlin.Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\u0011\u0010\u0019\u001a\u00020\u001aH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001bJ\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010 J\u0011\u0010!\u001a\u00020\"H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001bJ+\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001f2\b\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010(\u001a\u00020)H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010*J3\u0010+\u001a\u00020$2\u0006\u0010,\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u001f2\b\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010(\u001a\u00020)H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010-J\u000e\u0010.\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u001fJ!\u0010/\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001f2\u0006\u00100\u001a\u00020\u001fH\u0096@ø\u0001\u0000¢\u0006\u0002\u00101J\u0010\u00102\u001a\u00020\u00152\u0006\u00103\u001a\u00020\u001fH\u0002J\u0010\u00104\u001a\u00020\u001d2\u0006\u00105\u001a\u000206H\u0016J\u0019\u00107\u001a\u00020$2\u0006\u0010\u001e\u001a\u00020\u001fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010 R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u00068"}, d2 = {"Lcom/unity3d/ads/core/data/repository/AndroidCacheRepository;", "Lcom/unity3d/ads/core/data/repository/CacheRepository;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "getCacheDirectory", "Lcom/unity3d/ads/core/domain/GetCacheDirectory;", "localCacheDataSource", "Lcom/unity3d/ads/core/data/datasource/CacheDataSource;", "remoteCacheDataSource", "context", "Landroid/content/Context;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "cleanupDirectory", "Lcom/unity3d/services/core/network/domain/CleanupDirectory;", "downloadPriorityQueue", "Lcom/unity3d/ads/core/domain/work/DownloadPriorityQueue;", "createFile", "Lcom/unity3d/ads/core/domain/CreateFile;", "(Lkotlinx/coroutines/CoroutineDispatcher;Lcom/unity3d/ads/core/domain/GetCacheDirectory;Lcom/unity3d/ads/core/data/datasource/CacheDataSource;Lcom/unity3d/ads/core/data/datasource/CacheDataSource;Landroid/content/Context;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/services/core/network/domain/CleanupDirectory;Lcom/unity3d/ads/core/domain/work/DownloadPriorityQueue;Lcom/unity3d/ads/core/domain/CreateFile;)V", "cacheDir", "Ljava/io/File;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "webviewCacheDir", "clearCache", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doesFileExist", "", "fileName", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCacheSize", "", "getFile", "Lcom/unity3d/ads/core/data/model/CacheResult;", "url", "headers", "Lorg/json/JSONArray;", "priority", "", "(Ljava/lang/String;Lorg/json/JSONArray;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFileInternal", "cacheDirectory", "(Ljava/io/File;Ljava/lang/String;Lorg/json/JSONArray;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFilename", "getWebviewFile", "type", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initCacheDir", "dirName", "removeFile", "cachedFile", "Lcom/unity3d/ads/core/data/model/CachedFile;", "retrieveFile", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidCacheRepository implements com.unity3d.ads.core.data.repository.CacheRepository {
    private final java.io.File cacheDir;
    private final com.unity3d.services.core.network.domain.CleanupDirectory cleanupDirectory;
    private final android.content.Context context;
    private final com.unity3d.ads.core.domain.CreateFile createFile;
    private final com.unity3d.ads.core.domain.work.DownloadPriorityQueue downloadPriorityQueue;
    private final com.unity3d.ads.core.domain.GetCacheDirectory getCacheDirectory;
    private final com.unity3d.ads.core.data.datasource.CacheDataSource localCacheDataSource;
    private final com.unity3d.ads.core.data.datasource.CacheDataSource remoteCacheDataSource;
    private final kotlinx.coroutines.CoroutineScope scope;
    private final com.unity3d.ads.core.data.repository.SessionRepository sessionRepository;
    private final java.io.File webviewCacheDir;

    public AndroidCacheRepository(kotlinx.coroutines.CoroutineDispatcher ioDispatcher, com.unity3d.ads.core.domain.GetCacheDirectory getCacheDirectory, com.unity3d.ads.core.data.datasource.CacheDataSource localCacheDataSource, com.unity3d.ads.core.data.datasource.CacheDataSource remoteCacheDataSource, android.content.Context context, com.unity3d.ads.core.data.repository.SessionRepository sessionRepository, com.unity3d.services.core.network.domain.CleanupDirectory cleanupDirectory, com.unity3d.ads.core.domain.work.DownloadPriorityQueue downloadPriorityQueue, com.unity3d.ads.core.domain.CreateFile createFile) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCacheDirectory, "getCacheDirectory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localCacheDataSource, "localCacheDataSource");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(remoteCacheDataSource, "remoteCacheDataSource");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cleanupDirectory, "cleanupDirectory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadPriorityQueue, "downloadPriorityQueue");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createFile, "createFile");
        this.getCacheDirectory = getCacheDirectory;
        this.localCacheDataSource = localCacheDataSource;
        this.remoteCacheDataSource = remoteCacheDataSource;
        this.context = context;
        this.sessionRepository = sessionRepository;
        this.cleanupDirectory = cleanupDirectory;
        this.downloadPriorityQueue = downloadPriorityQueue;
        this.createFile = createFile;
        this.scope = kotlinx.coroutines.CoroutineScopeKt.plus(kotlinx.coroutines.CoroutineScopeKt.plus(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(ioDispatcher), new kotlinx.coroutines.CoroutineName("CacheRepository")), kotlinx.coroutines.NonCancellable.INSTANCE);
        this.cacheDir = initCacheDir(com.unity3d.services.UnityAdsConstants.DefaultUrls.CACHE_DIR_NAME);
        this.webviewCacheDir = initCacheDir(com.unity3d.services.UnityAdsConstants.DefaultUrls.CACHE_WEBVIEW_DIR_NAME);
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public java.lang.Object getFile(java.lang.String str, org.json.JSONArray jSONArray, int i, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.CacheResult> continuation) {
        return getFileInternal(this.cacheDir, str, jSONArray, i, continuation);
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public java.lang.Object getWebviewFile(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.CacheResult> continuation) {
        java.io.File invoke = this.createFile.invoke(this.webviewCacheDir, str2);
        invoke.mkdirs();
        return getFileInternal(invoke, str, null, 0, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object getFileInternal(java.io.File file, java.lang.String str, org.json.JSONArray jSONArray, int i, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.CacheResult> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.scope.getCoroutineContext(), new com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2(this, str, file, i, null), continuation);
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public java.lang.Object retrieveFile(java.lang.String str, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.CacheResult> continuation) {
        return com.unity3d.ads.core.data.datasource.CacheDataSource.DefaultImpls.getFile$default(this.localCacheDataSource, this.cacheDir, str, null, null, continuation, 12, null);
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public boolean removeFile(com.unity3d.ads.core.data.model.CachedFile cachedFile) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cachedFile, "cachedFile");
        java.io.File file = cachedFile.getFile();
        if (file != null) {
            if (!file.exists()) {
                file = null;
            }
            if (file != null) {
                return file.delete();
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object doesFileExist(java.lang.String str, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        com.unity3d.ads.core.data.repository.AndroidCacheRepository$doesFileExist$1 androidCacheRepository$doesFileExist$1;
        int i;
        if (continuation instanceof com.unity3d.ads.core.data.repository.AndroidCacheRepository$doesFileExist$1) {
            androidCacheRepository$doesFileExist$1 = (com.unity3d.ads.core.data.repository.AndroidCacheRepository$doesFileExist$1) continuation;
            if ((androidCacheRepository$doesFileExist$1.label & Integer.MIN_VALUE) != 0) {
                androidCacheRepository$doesFileExist$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = androidCacheRepository$doesFileExist$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidCacheRepository$doesFileExist$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidCacheRepository$doesFileExist$1.label = 1;
                    obj = retrieveFile(str, androidCacheRepository$doesFileExist$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(obj instanceof com.unity3d.ads.core.data.model.CacheResult.Success);
            }
        }
        androidCacheRepository$doesFileExist$1 = new com.unity3d.ads.core.data.repository.AndroidCacheRepository$doesFileExist$1(this, continuation);
        java.lang.Object obj2 = androidCacheRepository$doesFileExist$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidCacheRepository$doesFileExist$1.label;
        if (i != 0) {
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(obj2 instanceof com.unity3d.ads.core.data.model.CacheResult.Success);
    }

    public final java.lang.String getFilename(java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        java.lang.String substringAfterLast = kotlin.text.StringsKt.substringAfterLast(kotlin.text.StringsKt.substringAfterLast$default(kotlin.text.StringsKt.substringBefore$default(url, '?', (java.lang.String) null, 2, (java.lang.Object) null), kotlinx.io.files.FileSystemKt.UnixPathSeparator, (java.lang.String) null, 2, (java.lang.Object) null), '.', "");
        if (!kotlin.text.StringsKt.isBlank(substringAfterLast)) {
            return com.unity3d.ads.core.extensions.StringExtensionsKt.getSHA256Hash(url) + '.' + substringAfterLast;
        }
        return com.unity3d.ads.core.extensions.StringExtensionsKt.getSHA256Hash(url);
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public java.lang.Object clearCache(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.scope.getCoroutineContext(), new com.unity3d.ads.core.data.repository.AndroidCacheRepository$clearCache$2(this, null), continuation);
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public java.lang.Object getCacheSize(kotlin.coroutines.Continuation<? super java.lang.Long> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.scope.getCoroutineContext(), new com.unity3d.ads.core.data.repository.AndroidCacheRepository$getCacheSize$2(this, null), continuation);
    }

    private final java.io.File initCacheDir(java.lang.String dirName) {
        com.unity3d.ads.core.domain.GetCacheDirectory getCacheDirectory = this.getCacheDirectory;
        java.io.File cacheDir = this.context.getCacheDir();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cacheDir, "context.cacheDir");
        java.io.File invoke = getCacheDirectory.invoke(cacheDir, dirName);
        invoke.mkdirs();
        return invoke;
    }
}
