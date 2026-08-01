package com.unity3d.ads.adplayer;

import androidx.compose.material.TextFieldImplKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CommonWebViewBridge.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.adplayer.CommonWebViewBridge", f = "CommonWebViewBridge.kt", i = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 6}, l = {TextFieldImplKt.AnimationDuration, 158, 160, 164, 166, 181, 186}, m = "handleInvocationResult", n = {"invocation", "callbackId", "invocation", "callbackId", "invocation", "callbackId", "invocation", "callbackId", "invocation", "callbackId", "result", "invocation", "callbackId", "invocation"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$0"})
/* loaded from: classes7.dex */
final class CommonWebViewBridge$handleInvocationResult$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommonWebViewBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonWebViewBridge$handleInvocationResult$1(CommonWebViewBridge commonWebViewBridge, Continuation<? super CommonWebViewBridge$handleInvocationResult$1> continuation) {
        super(continuation);
        this.this$0 = commonWebViewBridge;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object handleInvocationResult;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        handleInvocationResult = this.this$0.handleInvocationResult(null, null, this);
        return handleInvocationResult;
    }
}
