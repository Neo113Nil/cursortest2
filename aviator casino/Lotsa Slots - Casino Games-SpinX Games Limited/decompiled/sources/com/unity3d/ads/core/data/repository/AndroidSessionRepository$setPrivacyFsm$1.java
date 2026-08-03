package com.unity3d.ads.core.data.repository;

/* compiled from: AndroidSessionRepository.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository", f = "AndroidSessionRepository.kt", i = {0, 0}, l = {com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "setPrivacyFsm", n = {"this", "value"}, s = {"L$0", "L$1"})
/* loaded from: classes5.dex */
final class AndroidSessionRepository$setPrivacyFsm$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.unity3d.ads.core.data.repository.AndroidSessionRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidSessionRepository$setPrivacyFsm$1(com.unity3d.ads.core.data.repository.AndroidSessionRepository androidSessionRepository, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacyFsm$1> continuation) {
        super(continuation);
        this.this$0 = androidSessionRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.setPrivacyFsm(null, this);
    }
}
