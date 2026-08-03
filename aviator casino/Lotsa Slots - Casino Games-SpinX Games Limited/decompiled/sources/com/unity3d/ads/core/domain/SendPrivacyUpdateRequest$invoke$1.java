package com.unity3d.ads.core.domain;

/* compiled from: SendPrivacyUpdateRequest.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.SendPrivacyUpdateRequest", f = "SendPrivacyUpdateRequest.kt", i = {0}, l = {21, 23}, m = "invoke", n = {"this"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class SendPrivacyUpdateRequest$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.unity3d.ads.core.domain.SendPrivacyUpdateRequest this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SendPrivacyUpdateRequest$invoke$1(com.unity3d.ads.core.domain.SendPrivacyUpdateRequest sendPrivacyUpdateRequest, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.SendPrivacyUpdateRequest$invoke$1> continuation) {
        super(continuation);
        this.this$0 = sendPrivacyUpdateRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(0, null, this);
    }
}
