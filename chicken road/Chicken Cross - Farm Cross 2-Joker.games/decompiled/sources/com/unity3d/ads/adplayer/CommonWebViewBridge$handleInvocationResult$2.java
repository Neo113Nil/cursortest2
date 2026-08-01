package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.model.WebViewEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: CommonWebViewBridge.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
/* synthetic */ class CommonWebViewBridge$handleInvocationResult$2 extends FunctionReferenceImpl implements Function2<WebViewEvent, Continuation<? super Unit>, Object>, SuspendFunction {
    CommonWebViewBridge$handleInvocationResult$2(Object obj) {
        super(2, obj, CommonWebViewBridge.class, "sendEvent", "sendEvent(Lcom/unity3d/ads/adplayer/model/WebViewEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(WebViewEvent webViewEvent, Continuation<? super Unit> continuation) {
        return ((CommonWebViewBridge) this.receiver).sendEvent(webViewEvent, continuation);
    }
}
