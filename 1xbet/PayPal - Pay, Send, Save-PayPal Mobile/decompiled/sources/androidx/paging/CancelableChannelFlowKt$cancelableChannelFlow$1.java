package androidx.paging;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "T", "Landroidx/paging/SimpleProducerScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.CancelableChannelFlowKt$cancelableChannelFlow$1", f = "CancelableChannelFlow.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes7.dex */
final class CancelableChannelFlowKt$cancelableChannelFlow$1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.paging.SimpleProducerScope<T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.Job Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.paging.SimpleProducerScope<T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighSpeedVideoFpsRanges;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final androidx.paging.SimpleProducerScope<T> simpleProducerScope = (androidx.paging.SimpleProducerScope) this.getHighSpeedVideoFpsRangesFor;
            this.Camera2StreamConfigurationMap.invokeOnCompletion(new kotlin.jvm.functions.Function1() { // from class: androidx.paging.CancelableChannelFlowKt$cancelableChannelFlow$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return androidx.paging.CancelableChannelFlowKt$cancelableChannelFlow$1.Camera2StreamConfigurationMap(androidx.paging.SimpleProducerScope.this);
                }
            });
            kotlin.jvm.functions.Function2<androidx.paging.SimpleProducerScope<T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function2 = this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoSizes = 1;
            if (function2.invoke(simpleProducerScope, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(androidx.paging.SimpleProducerScope simpleProducerScope) {
        kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(simpleProducerScope, null, 1, null);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.paging.CancelableChannelFlowKt$cancelableChannelFlow$1) create((androidx.paging.SimpleProducerScope) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.paging.CancelableChannelFlowKt$cancelableChannelFlow$1 cancelableChannelFlowKt$cancelableChannelFlow$1 = new androidx.paging.CancelableChannelFlowKt$cancelableChannelFlow$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
        cancelableChannelFlowKt$cancelableChannelFlow$1.getHighSpeedVideoFpsRangesFor = obj;
        return cancelableChannelFlowKt$cancelableChannelFlow$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CancelableChannelFlowKt$cancelableChannelFlow$1(kotlinx.coroutines.Job job, kotlin.jvm.functions.Function2<? super androidx.paging.SimpleProducerScope<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super androidx.paging.CancelableChannelFlowKt$cancelableChannelFlow$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = job;
        this.getHighSpeedVideoFpsRanges = function2;
    }
}
