package com.unity3d.ads.core.domain;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AndroidGetUniversalRequestSharedData.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData", f = "AndroidGetUniversalRequestSharedData.kt", i = {0}, l = {24}, m = "invoke", n = {"$this$invoke_u24lambda_u240"}, s = {"L$1"})
/* loaded from: classes7.dex */
final class AndroidGetUniversalRequestSharedData$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidGetUniversalRequestSharedData this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidGetUniversalRequestSharedData$invoke$1(AndroidGetUniversalRequestSharedData androidGetUniversalRequestSharedData, Continuation<? super AndroidGetUniversalRequestSharedData$invoke$1> continuation) {
        super(continuation);
        this.this$0 = androidGetUniversalRequestSharedData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(this);
    }
}
