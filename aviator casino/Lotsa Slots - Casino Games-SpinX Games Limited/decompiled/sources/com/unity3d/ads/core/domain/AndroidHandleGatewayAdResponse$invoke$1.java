package com.unity3d.ads.core.domain;

/* compiled from: AndroidHandleGatewayAdResponse.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse", f = "AndroidHandleGatewayAdResponse.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 5}, l = {96, 113, 144, 187, 191, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE}, m = "invoke", n = {"this", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "opportunityId", com.ironsource.Ve.n, "placementId", "adType", "adPlayer", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "this", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "opportunityId", com.ironsource.Ve.n, "placementId", "adType", "adPlayer", "webviewConfiguration", "tmpAdObject", "this", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "opportunityId", com.ironsource.Ve.n, "placementId", "adType", "adPlayer", "tmpAdObject", "webViewUrl", "base64ImpressionConfiguration", "mark$iv$iv", "this", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "opportunityId", com.ironsource.Ve.n, "placementId", "adPlayer", "adObject", "loadAdViewerStartedTime", "this", "opportunityId", com.ironsource.Ve.n, "adPlayer", "adObject", "loadEvent", "t"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0"})
/* loaded from: classes5.dex */
final class AndroidHandleGatewayAdResponse$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    long J$0;
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    java.lang.Object L$4;
    java.lang.Object L$5;
    java.lang.Object L$6;
    java.lang.Object L$7;
    java.lang.Object L$8;
    java.lang.Object L$9;
    boolean Z$0;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidHandleGatewayAdResponse$invoke$1(com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$1> continuation) {
        super(continuation);
        this.this$0 = androidHandleGatewayAdResponse;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(null, null, null, null, null, null, false, this);
    }
}
