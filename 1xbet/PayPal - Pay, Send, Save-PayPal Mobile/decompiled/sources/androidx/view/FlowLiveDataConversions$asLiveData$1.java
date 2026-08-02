package androidx.view;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "T", "Landroidx/lifecycle/LiveDataScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.lifecycle.FlowLiveDataConversions$asLiveData$1", f = "FlowLiveData.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes7.dex */
final class FlowLiveDataConversions$asLiveData$1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.view.LiveDataScope<T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.flow.Flow<T> getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final androidx.view.LiveDataScope liveDataScope = (androidx.view.LiveDataScope) this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoFpsRanges = 1;
            if (this.getHighResolutionOutputSizeshNQ4ISI.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: androidx.lifecycle.FlowLiveDataConversions$asLiveData$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    java.lang.Object emit = liveDataScope.emit(t, continuation);
                    return emit == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : kotlin.Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
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

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.view.FlowLiveDataConversions$asLiveData$1) create((androidx.view.LiveDataScope) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.view.FlowLiveDataConversions$asLiveData$1 flowLiveDataConversions$asLiveData$1 = new androidx.view.FlowLiveDataConversions$asLiveData$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        flowLiveDataConversions$asLiveData$1.getHighSpeedVideoSizes = obj;
        return flowLiveDataConversions$asLiveData$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlowLiveDataConversions$asLiveData$1(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.coroutines.Continuation<? super androidx.view.FlowLiveDataConversions$asLiveData$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = flow;
    }
}
