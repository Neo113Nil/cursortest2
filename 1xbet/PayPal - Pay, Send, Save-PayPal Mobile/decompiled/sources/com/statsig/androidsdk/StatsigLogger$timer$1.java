package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.StatsigLogger$timer$1", f = "StatsigLogger.kt", i = {}, l = {60, 61}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class StatsigLogger$timer$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int label;
    final /* synthetic */ com.statsig.androidsdk.StatsigLogger this$0;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0043, code lost:
    
        if (r6.this$0.flush(r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(60000, r6) != r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        return r0;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0043 -> B:11:0x001e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.CoroutineScope coroutineScope;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.label = 2;
            } else if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
        kotlin.ResultKt.throwOnFailure(obj);
        coroutineScope = this.this$0.coroutineScope;
        if (!kotlinx.coroutines.CoroutineScopeKt.isActive(coroutineScope)) {
            return kotlin.Unit.INSTANCE;
        }
        this.label = 1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.statsig.androidsdk.StatsigLogger$timer$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.statsig.androidsdk.StatsigLogger$timer$1(this.this$0, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StatsigLogger$timer$1(com.statsig.androidsdk.StatsigLogger statsigLogger, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.StatsigLogger$timer$1> continuation) {
        super(2, continuation);
        this.this$0 = statsigLogger;
    }
}
