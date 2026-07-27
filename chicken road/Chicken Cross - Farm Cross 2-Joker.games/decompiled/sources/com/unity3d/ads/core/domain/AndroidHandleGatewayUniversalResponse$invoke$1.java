package com.unity3d.ads.core.domain;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AndroidHandleGatewayUniversalResponse.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayUniversalResponse", f = "AndroidHandleGatewayUniversalResponse.kt", i = {0, 1}, l = {49, 55, 58}, m = "invoke", n = {"mutableData", "mutableData"}, s = {"L$0", "L$0"})
/* loaded from: classes7.dex */
final class AndroidHandleGatewayUniversalResponse$invoke$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidHandleGatewayUniversalResponse this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidHandleGatewayUniversalResponse$invoke$1(AndroidHandleGatewayUniversalResponse androidHandleGatewayUniversalResponse, Continuation<? super AndroidHandleGatewayUniversalResponse$invoke$1> continuation) {
        super(continuation);
        this.this$0 = androidHandleGatewayUniversalResponse;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(null, this);
    }
}
