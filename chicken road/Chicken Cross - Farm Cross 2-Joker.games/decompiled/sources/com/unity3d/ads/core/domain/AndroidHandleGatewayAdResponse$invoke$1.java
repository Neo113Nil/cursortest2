package com.unity3d.ads.core.domain;

import com.ironsource.Te;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AndroidHandleGatewayAdResponse.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse", f = "AndroidHandleGatewayAdResponse.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 8}, l = {103, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, 145, 178, 194, 232, 233, 238, 268}, m = "invoke", n = {HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "opportunityId", Te.n, "placementId", "adType", "adPlayer", HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "forceWebViewLoad", HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "opportunityId", Te.n, "placementId", "adType", "adPlayer", "webviewConfiguration", "adScope", "tmpAdObject", HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "forceWebViewLoad", "mark$iv$iv", HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "opportunityId", Te.n, "placementId", "adType", "adPlayer", "webviewConfiguration", "adScope", "tmpAdObject", HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "forceWebViewLoad", "diskWarmSuccess", "opportunityId", Te.n, "adPlayer", HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "opportunityId", Te.n, "placementId", "adType", "adPlayer", "webviewConfiguration", "adScope", "tmpAdObject", "webViewUrl", "base64ImpressionConfiguration", "forceWebViewLoad", "diskWarmSuccess", "mark$iv$iv", HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "opportunityId", Te.n, "placementId", "adPlayer", "webviewConfiguration", "adScope", "adObject", "diskWarmSuccess", "loadAdViewerStartedTime", HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "opportunityId", Te.n, "placementId", "adPlayer", "webviewConfiguration", "adScope", "adObject", "diskWarmSuccess", "loadAdViewerStartedTime", "opportunityId", Te.n, "adPlayer", "loadEvent", "t"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "Z$0", "Z$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "Z$0", "Z$1", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "Z$0", "Z$1", "I$0", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "Z$0", "I$0", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0", "J$0", "L$0", "L$1", "L$2", "L$3", "L$0"})
/* loaded from: classes7.dex */
final class AndroidHandleGatewayAdResponse$invoke$1 extends ContinuationImpl {
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    boolean Z$0;
    boolean Z$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidHandleGatewayAdResponse this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidHandleGatewayAdResponse$invoke$1(AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse, Continuation<? super AndroidHandleGatewayAdResponse$invoke$1> continuation) {
        super(continuation);
        this.this$0 = androidHandleGatewayAdResponse;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(null, null, null, null, null, null, false, false, this);
    }
}
