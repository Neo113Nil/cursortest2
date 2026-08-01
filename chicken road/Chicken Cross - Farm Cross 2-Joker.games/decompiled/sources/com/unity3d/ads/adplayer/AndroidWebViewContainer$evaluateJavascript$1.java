package com.unity3d.ads.adplayer;

import androidx.compose.material.TextFieldImplKt;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AndroidWebViewContainer.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer", f = "AndroidWebViewContainer.kt", i = {0, 0, 0}, l = {Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, TextFieldImplKt.AnimationDuration}, m = "evaluateJavascript", n = {"handlerType", "argumentsString", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes7.dex */
final class AndroidWebViewContainer$evaluateJavascript$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidWebViewContainer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidWebViewContainer$evaluateJavascript$1(AndroidWebViewContainer androidWebViewContainer, Continuation<? super AndroidWebViewContainer$evaluateJavascript$1> continuation) {
        super(continuation);
        this.this$0 = androidWebViewContainer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.evaluateJavascript(null, null, this);
    }
}
