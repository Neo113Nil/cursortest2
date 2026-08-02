package com.paypal.oslo.core.session;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB\u001f\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000b\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0016\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/core/session/CronetCacheClearer;", "", "Ljava/io/File;", "cacheDir", "Ldagger/Lazy;", "Lcom/paypal/oslo/core/network/http/config/HttpConfig;", "httpConfig", "Lkotlinx/coroutines/CoroutineDispatcher;", "clearDispatcher", "Lcom/paypal/oslo/core/session/FileOperations;", "fileOperations", "<init>", "(Ljava/io/File;Ldagger/Lazy;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/paypal/oslo/core/session/FileOperations;)V", "(Ljava/io/File;Ldagger/Lazy;)V", "", "clearCache", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/io/File;", "getHighSpeedVideoFpsRanges", "Ldagger/Lazy;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/CoroutineDispatcher;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/session/FileOperations;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CronetCacheClearer {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.session.FileOperations getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.io.File getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final dagger.Lazy<com.paypal.oslo.core.network.http.config.HttpConfig> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher Camera2StreamConfigurationMap;

    public CronetCacheClearer(java.io.File file, dagger.Lazy<com.paypal.oslo.core.network.http.config.HttpConfig> lazy, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, com.paypal.oslo.core.session.FileOperations fileOperations) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileOperations, "");
        this.getHighSpeedVideoFpsRanges = file;
        this.getHighSpeedVideoSizes = lazy;
        this.Camera2StreamConfigurationMap = coroutineDispatcher;
        this.getHighSpeedVideoFpsRangesFor = fileOperations;
    }

    public /* synthetic */ CronetCacheClearer(java.io.File file, dagger.Lazy lazy, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, com.paypal.oslo.core.session.FileOperations fileOperations, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(file, lazy, (i & 4) != 0 ? kotlinx.coroutines.Dispatchers.getIO() : coroutineDispatcher, (i & 8) != 0 ? com.paypal.oslo.core.session.FileOperations.INSTANCE.getDefault() : fileOperations);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @javax.inject.Inject
    public CronetCacheClearer(java.io.File file, dagger.Lazy<com.paypal.oslo.core.network.http.config.HttpConfig> lazy) {
        this(file, lazy, kotlinx.coroutines.Dispatchers.getIO(), com.paypal.oslo.core.session.FileOperations.INSTANCE.getDefault());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|26|6|7|(0)(0)|11|12|13|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        com.paypal.oslo.core.session.LoggerKt.log.e("Failed to clear Cronet cache due to file-system permissions", r6);
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
        com.paypal.oslo.core.session.CronetCacheClearer$clearCache$1 cronetCacheClearer$clearCache$1;
        int i;
        if (continuation instanceof com.paypal.oslo.core.session.CronetCacheClearer$clearCache$1) {
            cronetCacheClearer$clearCache$1 = (com.paypal.oslo.core.session.CronetCacheClearer$clearCache$1) continuation;
            if ((cronetCacheClearer$clearCache$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                cronetCacheClearer$clearCache$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = cronetCacheClearer$clearCache$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cronetCacheClearer$clearCache$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher = this.Camera2StreamConfigurationMap;
                    com.paypal.oslo.core.session.CronetCacheClearer$clearCache$2 cronetCacheClearer$clearCache$2 = new com.paypal.oslo.core.session.CronetCacheClearer$clearCache$2(this, null);
                    cronetCacheClearer$clearCache$1.getHighSpeedVideoFpsRanges = 1;
                    if (kotlinx.coroutines.BuildersKt.withContext(coroutineDispatcher, cronetCacheClearer$clearCache$2, cronetCacheClearer$clearCache$1) == coroutine_suspended) {
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
        cronetCacheClearer$clearCache$1 = new com.paypal.oslo.core.session.CronetCacheClearer$clearCache$1(this, continuation);
        java.lang.Object obj2 = cronetCacheClearer$clearCache$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cronetCacheClearer$clearCache$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void access$performClear(com.paypal.oslo.core.session.CronetCacheClearer cronetCacheClearer) {
        java.io.File file;
        java.lang.String obj;
        com.paypal.oslo.core.network.http.config.CacheType cacheType = cronetCacheClearer.getHighSpeedVideoSizes.get().getCacheType();
        if (cacheType instanceof com.paypal.oslo.core.network.http.config.CacheType.FileCache) {
            java.lang.String cacheDir = ((com.paypal.oslo.core.network.http.config.CacheType.FileCache) cacheType).getCacheDir();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(cacheDir);
            sb.append("_cronet");
            obj = sb.toString();
        } else {
            if (!(cacheType instanceof com.paypal.oslo.core.network.http.config.CacheType.FileCacheNoHttp)) {
                if (!(cacheType instanceof com.paypal.oslo.core.network.http.config.CacheType.InMemoryCache) && !kotlin.jvm.internal.Intrinsics.areEqual(cacheType, com.paypal.oslo.core.network.http.config.CacheType.NoCache.INSTANCE)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.session.LoggerKt.log, "Cronet file cache not configured, nothing to clear", null, null, 6, null);
                file = null;
                if (file == null) {
                    if (!cronetCacheClearer.getHighSpeedVideoFpsRangesFor.exists(file)) {
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.session.LoggerKt.log, "Cronet cache directory does not exist, nothing to clear", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("path", file.getAbsolutePath())), null, 4, null);
                        return;
                    }
                    try {
                        java.io.File[] listFiles = cronetCacheClearer.getHighSpeedVideoFpsRangesFor.listFiles(file);
                        if (listFiles == null) {
                            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.session.LoggerKt.log, "Failed to list Cronet cache directory contents", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("path", file.getAbsolutePath())), null, 4, null);
                            return;
                        }
                        int i = 0;
                        int i2 = 0;
                        for (java.io.File file2 : listFiles) {
                            try {
                                if (cronetCacheClearer.getHighSpeedVideoFpsRangesFor.deleteRecursively(file2)) {
                                    i2++;
                                } else {
                                    i++;
                                }
                            } catch (java.lang.SecurityException e) {
                                i++;
                                com.paypal.oslo.core.session.LoggerKt.log.e("SecurityException while deleting Cronet cache entry", e);
                            }
                        }
                        if (i == 0) {
                            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.session.LoggerKt.log, "Cronet cache cleared successfully", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("deletedFiles", java.lang.Integer.valueOf(i2))), null, 4, null);
                            return;
                        } else {
                            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.session.LoggerKt.log, "Failed to delete some Cronet cache files", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("deletedFiles", java.lang.Integer.valueOf(i2)), kotlin.TuplesKt.to("failedFiles", java.lang.Integer.valueOf(i))), null, 4, null);
                            return;
                        }
                    } catch (java.lang.SecurityException e2) {
                        com.paypal.oslo.core.session.LoggerKt.log.e("SecurityException while listing Cronet cache directory contents", e2);
                        return;
                    }
                }
                return;
            }
            java.lang.String cacheDir2 = ((com.paypal.oslo.core.network.http.config.CacheType.FileCacheNoHttp) cacheType).getCacheDir();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(cacheDir2);
            sb2.append("_cronet");
            obj = sb2.toString();
        }
        file = cronetCacheClearer.getHighSpeedVideoFpsRangesFor.createFile(cronetCacheClearer.getHighSpeedVideoFpsRanges, obj);
        if (file == null) {
        }
    }
}
