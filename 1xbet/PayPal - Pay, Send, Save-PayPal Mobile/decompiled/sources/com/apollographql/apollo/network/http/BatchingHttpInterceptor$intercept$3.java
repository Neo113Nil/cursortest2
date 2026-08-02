package com.apollographql.apollo.network.http;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.network.http.BatchingHttpInterceptor$intercept$3", f = "BatchingHttpInterceptor.kt", i = {}, l = {116, 117}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class BatchingHttpInterceptor$intercept$3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.apollographql.apollo.network.http.BatchingHttpInterceptor Camera2StreamConfigurationMap;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0056, code lost:
    
        if (r11 == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay((r4 - (r6 % r8)) - 1, r10) != r0) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        long j;
        long j2;
        long j3;
        java.lang.Object highSpeedVideoSizes;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            j = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges;
            j2 = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
            long m23953getInWholeMillisecondsimpl = kotlin.time.Duration.m23953getInWholeMillisecondsimpl(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m24033elapsedNowUwyO8pc(j2));
            j3 = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoSizes = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.getHighSpeedVideoSizes = 2;
        highSpeedVideoSizes = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes(true, this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.apollographql.apollo.network.http.BatchingHttpInterceptor$intercept$3) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.apollographql.apollo.network.http.BatchingHttpInterceptor$intercept$3(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BatchingHttpInterceptor$intercept$3(com.apollographql.apollo.network.http.BatchingHttpInterceptor batchingHttpInterceptor, kotlin.coroutines.Continuation<? super com.apollographql.apollo.network.http.BatchingHttpInterceptor$intercept$3> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = batchingHttpInterceptor;
    }
}
