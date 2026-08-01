package com.unity3d.ads.adplayer;

import com.google.protobuf.ByteString;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.log.Logger;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: CommonWebViewBridge.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/unity3d/ads/adplayer/model/WebViewEvent;", "e", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocationResult$3", f = "CommonWebViewBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class CommonWebViewBridge$handleInvocationResult$3 extends SuspendLambda implements Function3<FlowCollector<? super WebViewEvent>, Throwable, Continuation<? super Unit>, Object> {
    final /* synthetic */ Invocation $invocation;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CommonWebViewBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonWebViewBridge$handleInvocationResult$3(CommonWebViewBridge commonWebViewBridge, Invocation invocation, Continuation<? super CommonWebViewBridge$handleInvocationResult$3> continuation) {
        super(3, continuation);
        this.this$0 = commonWebViewBridge;
        this.$invocation = invocation;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super WebViewEvent> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        CommonWebViewBridge$handleInvocationResult$3 commonWebViewBridge$handleInvocationResult$3 = new CommonWebViewBridge$handleInvocationResult$3(this.this$0, this.$invocation, continuation);
        commonWebViewBridge$handleInvocationResult$3.L$0 = th;
        return commonWebViewBridge$handleInvocationResult$3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Logger logger;
        SendDiagnosticEvent sendDiagnosticEvent;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            Throwable th = (Throwable) this.L$0;
            logger = this.this$0.logger;
            logger.error("Error delivering flow event", th);
            sendDiagnosticEvent = this.this$0.sendDiagnosticEvent;
            Pair[] pairArr = new Pair[2];
            String message = th.getMessage();
            if (message == null) {
                message = th.getClass().getSimpleName();
            }
            pairArr[0] = TuplesKt.to("reason_debug", message);
            pairArr[1] = TuplesKt.to("webview_invocation", this.$invocation.getLocation());
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_webview_invocation_error", (Double) null, MapsKt.mapOf(pairArr), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, (Object) null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
