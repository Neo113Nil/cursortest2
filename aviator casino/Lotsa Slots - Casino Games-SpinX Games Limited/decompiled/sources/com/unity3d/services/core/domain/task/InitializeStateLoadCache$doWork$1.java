package com.unity3d.services.core.domain.task;

/* compiled from: InitializeStateLoadCache.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeStateLoadCache", f = "InitializeStateLoadCache.kt", i = {}, l = {32}, m = "doWork-gIAlu-s", n = {}, s = {})
/* loaded from: classes6.dex */
final class InitializeStateLoadCache$doWork$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.unity3d.services.core.domain.task.InitializeStateLoadCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeStateLoadCache$doWork$1(com.unity3d.services.core.domain.task.InitializeStateLoadCache initializeStateLoadCache, kotlin.coroutines.Continuation<? super com.unity3d.services.core.domain.task.InitializeStateLoadCache$doWork$1> continuation) {
        super(continuation);
        this.this$0 = initializeStateLoadCache;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        java.lang.Object m10371doWorkgIAlus = this.this$0.m10371doWorkgIAlus((com.unity3d.services.core.domain.task.InitializeStateLoadCache.Params) null, (kotlin.coroutines.Continuation<? super kotlin.Result<com.unity3d.services.core.domain.task.InitializeStateLoadCache.LoadCacheResult>>) this);
        return m10371doWorkgIAlus == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m10371doWorkgIAlus : kotlin.Result.m10797boximpl(m10371doWorkgIAlus);
    }
}
