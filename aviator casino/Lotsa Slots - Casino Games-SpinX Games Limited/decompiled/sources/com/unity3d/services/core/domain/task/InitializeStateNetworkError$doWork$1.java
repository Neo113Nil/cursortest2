package com.unity3d.services.core.domain.task;

/* compiled from: InitializeStateNetworkError.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeStateNetworkError", f = "InitializeStateNetworkError.kt", i = {}, l = {33}, m = "doWork-gIAlu-s", n = {}, s = {})
/* loaded from: classes6.dex */
final class InitializeStateNetworkError$doWork$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.unity3d.services.core.domain.task.InitializeStateNetworkError this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeStateNetworkError$doWork$1(com.unity3d.services.core.domain.task.InitializeStateNetworkError initializeStateNetworkError, kotlin.coroutines.Continuation<? super com.unity3d.services.core.domain.task.InitializeStateNetworkError$doWork$1> continuation) {
        super(continuation);
        this.this$0 = initializeStateNetworkError;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        java.lang.Object m10373doWorkgIAlus = this.this$0.m10373doWorkgIAlus((com.unity3d.services.core.domain.task.InitializeStateNetworkError.Params) null, (kotlin.coroutines.Continuation<? super kotlin.Result<kotlin.Unit>>) this);
        return m10373doWorkgIAlus == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m10373doWorkgIAlus : kotlin.Result.m10797boximpl(m10373doWorkgIAlus);
    }
}
