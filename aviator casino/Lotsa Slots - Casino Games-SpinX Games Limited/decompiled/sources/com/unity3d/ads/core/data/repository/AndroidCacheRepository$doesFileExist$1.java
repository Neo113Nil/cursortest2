package com.unity3d.ads.core.data.repository;

/* compiled from: AndroidCacheRepository.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository", f = "AndroidCacheRepository.kt", i = {}, l = {100}, m = "doesFileExist", n = {}, s = {})
/* loaded from: classes5.dex */
final class AndroidCacheRepository$doesFileExist$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.unity3d.ads.core.data.repository.AndroidCacheRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidCacheRepository$doesFileExist$1(com.unity3d.ads.core.data.repository.AndroidCacheRepository androidCacheRepository, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.repository.AndroidCacheRepository$doesFileExist$1> continuation) {
        super(continuation);
        this.this$0 = androidCacheRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.doesFileExist(null, this);
    }
}
