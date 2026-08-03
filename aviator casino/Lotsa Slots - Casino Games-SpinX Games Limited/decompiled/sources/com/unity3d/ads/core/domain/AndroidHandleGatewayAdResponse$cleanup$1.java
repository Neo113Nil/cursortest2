package com.unity3d.ads.core.domain;

/* compiled from: AndroidHandleGatewayAdResponse.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse", f = "AndroidHandleGatewayAdResponse.kt", i = {0}, l = {235, 241}, m = "cleanup", n = {"adPlayer"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class AndroidHandleGatewayAdResponse$cleanup$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidHandleGatewayAdResponse$cleanup$1(com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$cleanup$1> continuation) {
        super(continuation);
        this.this$0 = androidHandleGatewayAdResponse;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object cleanup;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        cleanup = this.this$0.cleanup(null, null, null, null, this);
        return cleanup;
    }
}
