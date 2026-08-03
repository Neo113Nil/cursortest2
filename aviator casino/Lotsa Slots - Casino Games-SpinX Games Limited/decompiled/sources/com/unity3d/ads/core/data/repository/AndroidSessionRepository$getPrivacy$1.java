package com.unity3d.ads.core.data.repository;

/* compiled from: AndroidSessionRepository.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository", f = "AndroidSessionRepository.kt", i = {}, l = {com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE}, m = "getPrivacy", n = {}, s = {})
/* loaded from: classes5.dex */
final class AndroidSessionRepository$getPrivacy$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.unity3d.ads.core.data.repository.AndroidSessionRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidSessionRepository$getPrivacy$1(com.unity3d.ads.core.data.repository.AndroidSessionRepository androidSessionRepository, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacy$1> continuation) {
        super(continuation);
        this.this$0 = androidSessionRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getPrivacy(this);
    }
}
