package com.unity3d.ads.adplayer;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: WebViewAdPlayer.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.adplayer.WebViewAdPlayer", f = "WebViewAdPlayer.kt", i = {0, 0, 1, 1}, l = {180, 181, 196}, m = "requestShow", n = {"unityAdsShowOptions", "it", "unityAdsShowOptions", "it"}, s = {"L$0", "L$2", "L$0", "L$2"})
/* loaded from: classes7.dex */
final class WebViewAdPlayer$requestShow$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WebViewAdPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebViewAdPlayer$requestShow$1(WebViewAdPlayer webViewAdPlayer, Continuation<? super WebViewAdPlayer$requestShow$1> continuation) {
        super(continuation);
        this.this$0 = webViewAdPlayer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.requestShow(null, this);
    }
}
