package com.unity3d.ads.adplayer;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer", f = "AndroidFullscreenWebViewAdPlayer.kt", i = {}, l = {199, 204, Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE}, m = "destroy", n = {}, s = {})
/* loaded from: classes7.dex */
final class AndroidFullscreenWebViewAdPlayer$destroy$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidFullscreenWebViewAdPlayer$destroy$1(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, Continuation<? super AndroidFullscreenWebViewAdPlayer$destroy$1> continuation) {
        super(continuation);
        this.this$0 = androidFullscreenWebViewAdPlayer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.destroy(this);
    }
}
