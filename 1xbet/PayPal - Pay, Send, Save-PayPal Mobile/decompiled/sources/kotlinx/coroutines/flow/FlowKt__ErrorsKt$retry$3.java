package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "cause", "", "attempt", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$3", f = "Errors.kt", i = {}, l = {91}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class FlowKt__ErrorsKt$retry$3<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function4<kotlinx.coroutines.flow.FlowCollector<? super T>, java.lang.Throwable, java.lang.Long, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
    /* synthetic */ long Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ long getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function2<java.lang.Throwable, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0037, code lost:
    
        if (((java.lang.Boolean) r8).booleanValue() == false) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        boolean z = true;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.Throwable th = (java.lang.Throwable) this.getHighSpeedVideoFpsRanges;
            if (this.Camera2StreamConfigurationMap < this.getHighSpeedVideoFpsRangesFor) {
                kotlin.jvm.functions.Function2<java.lang.Throwable, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> function2 = this.getHighSpeedVideoSizes;
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
                obj = function2.invoke(th, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            z = false;
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
        }
        if (i != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
    }

    @Override // kotlin.jvm.functions.Function4
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Throwable th, java.lang.Long l, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        long longValue = l.longValue();
        kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$3 flowKt__ErrorsKt$retry$3 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$3(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
        flowKt__ErrorsKt$retry$3.getHighSpeedVideoFpsRanges = th;
        flowKt__ErrorsKt$retry$3.Camera2StreamConfigurationMap = longValue;
        return flowKt__ErrorsKt$retry$3.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__ErrorsKt$retry$3(long j, kotlin.jvm.functions.Function2<? super java.lang.Throwable, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$3> continuation) {
        super(4, continuation);
        this.getHighSpeedVideoFpsRangesFor = j;
        this.getHighSpeedVideoSizes = function2;
    }
}
