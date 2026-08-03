package com.moloco.sdk.publisher;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.publisher.Moloco", f = "Moloco.kt", i = {0}, l = {504, com.ironsource.mediationsdk.logger.IronSourceError.ERROR_CODE_INIT_FAILED}, m = "clearState$moloco_sdk_release", n = {"this"}, s = {"L$0"})
/* loaded from: classes5.dex */
public final class Moloco$clearState$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.moloco.sdk.publisher.Moloco this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Moloco$clearState$1(com.moloco.sdk.publisher.Moloco moloco, kotlin.coroutines.Continuation<? super com.moloco.sdk.publisher.Moloco$clearState$1> continuation) {
        super(continuation);
        this.this$0 = moloco;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.clearState$moloco_sdk_release(this);
    }
}
