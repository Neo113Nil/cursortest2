package com.unity3d.ads.core.data.repository;

/* compiled from: AndroidCacheRepository.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$clearCache$2", f = "AndroidCacheRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class AndroidCacheRepository$clearCache$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int label;
    final /* synthetic */ com.unity3d.ads.core.data.repository.AndroidCacheRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidCacheRepository$clearCache$2(com.unity3d.ads.core.data.repository.AndroidCacheRepository androidCacheRepository, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.repository.AndroidCacheRepository$clearCache$2> continuation) {
        super(2, continuation);
        this.this$0 = androidCacheRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.unity3d.ads.core.data.repository.AndroidCacheRepository$clearCache$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.unity3d.ads.core.data.repository.AndroidCacheRepository$clearCache$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c3 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0070  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.unity3d.ads.core.data.repository.SessionRepository sessionRepository;
        java.io.File file;
        java.io.File file2;
        java.io.File[] listFiles;
        com.unity3d.ads.core.data.repository.SessionRepository sessionRepository2;
        com.unity3d.ads.core.data.repository.SessionRepository sessionRepository3;
        com.unity3d.services.core.network.domain.CleanupDirectory cleanupDirectory;
        java.io.File file3;
        com.unity3d.ads.core.data.repository.SessionRepository sessionRepository4;
        com.unity3d.ads.core.data.repository.SessionRepository sessionRepository5;
        com.unity3d.services.core.network.domain.CleanupDirectory cleanupDirectory2;
        java.io.File file4;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            sessionRepository = this.this$0.sessionRepository;
            boolean cleanCache = sessionRepository.getNativeConfiguration().getDebugSettings().getCleanCache();
            if (!cleanCache) {
                sessionRepository4 = this.this$0.sessionRepository;
                if (sessionRepository4.getNativeConfiguration().hasCachedAssetsConfiguration()) {
                    sessionRepository5 = this.this$0.sessionRepository;
                    gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration cachedAssetsConfiguration = sessionRepository5.getNativeConfiguration().getCachedAssetsConfiguration();
                    cleanupDirectory2 = this.this$0.cleanupDirectory;
                    file4 = this.this$0.cacheDir;
                    cleanupDirectory2.invoke(file4, cachedAssetsConfiguration.getMaxCachedAssetSizeMb(), cachedAssetsConfiguration.getMaxCachedAssetAgeMs());
                    if (!cleanCache) {
                        sessionRepository2 = this.this$0.sessionRepository;
                        if (sessionRepository2.getNativeConfiguration().hasCachedWebviewFilesConfiguration()) {
                            sessionRepository3 = this.this$0.sessionRepository;
                            gatewayprotocol.v1.NativeConfigurationOuterClass.CachedAssetsConfiguration cachedWebviewFilesConfiguration = sessionRepository3.getNativeConfiguration().getCachedWebviewFilesConfiguration();
                            cleanupDirectory = this.this$0.cleanupDirectory;
                            file3 = this.this$0.webviewCacheDir;
                            cleanupDirectory.invoke(file3, cachedWebviewFilesConfiguration.getMaxCachedAssetSizeMb(), cachedWebviewFilesConfiguration.getMaxCachedAssetAgeMs());
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    file2 = this.this$0.webviewCacheDir;
                    listFiles = file2.listFiles();
                    if (listFiles != null) {
                        return null;
                    }
                    for (java.io.File file5 : listFiles) {
                        file5.delete();
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }
            file = this.this$0.cacheDir;
            java.io.File[] listFiles2 = file.listFiles();
            if (listFiles2 != null) {
                for (java.io.File file6 : listFiles2) {
                    file6.delete();
                }
            }
            if (!cleanCache) {
            }
            file2 = this.this$0.webviewCacheDir;
            listFiles = file2.listFiles();
            if (listFiles != null) {
            }
        } else {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
