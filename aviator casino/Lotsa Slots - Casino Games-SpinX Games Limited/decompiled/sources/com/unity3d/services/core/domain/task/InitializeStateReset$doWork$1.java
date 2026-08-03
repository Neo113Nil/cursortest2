package com.unity3d.services.core.domain.task;

/* compiled from: InitializeStateReset.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeStateReset", f = "InitializeStateReset.kt", i = {}, l = {33}, m = "doWork-gIAlu-s$suspendImpl", n = {}, s = {})
/* loaded from: classes6.dex */
final class InitializeStateReset$doWork$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.unity3d.services.core.domain.task.InitializeStateReset this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeStateReset$doWork$1(com.unity3d.services.core.domain.task.InitializeStateReset initializeStateReset, kotlin.coroutines.Continuation<? super com.unity3d.services.core.domain.task.InitializeStateReset$doWork$1> continuation) {
        super(continuation);
        this.this$0 = initializeStateReset;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        java.lang.Object m10374doWorkgIAlus$suspendImpl = com.unity3d.services.core.domain.task.InitializeStateReset.m10374doWorkgIAlus$suspendImpl(this.this$0, null, this);
        return m10374doWorkgIAlus$suspendImpl == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m10374doWorkgIAlus$suspendImpl : kotlin.Result.m10797boximpl(m10374doWorkgIAlus$suspendImpl);
    }
}
