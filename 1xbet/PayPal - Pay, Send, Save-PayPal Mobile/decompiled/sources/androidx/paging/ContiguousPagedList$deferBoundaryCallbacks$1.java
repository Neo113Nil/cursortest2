package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.ContiguousPagedList$deferBoundaryCallbacks$1", f = "ContiguousPagedList.jvmAndAndroid.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes7.dex */
final class ContiguousPagedList$deferBoundaryCallbacks$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ boolean Camera2StreamConfigurationMap;
    final /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.paging.ContiguousPagedList<K, V> getHighSpeedVideoFpsRanges;
    final /* synthetic */ boolean getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (this.Camera2StreamConfigurationMap) {
            this.getHighSpeedVideoFpsRanges.getBoundaryCallback$paging_common().onZeroItemsLoaded();
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            ((androidx.paging.ContiguousPagedList) this.getHighSpeedVideoFpsRanges).getHighSpeedVideoSizes = true;
        }
        if (this.getHighSpeedVideoFpsRangesFor) {
            ((androidx.paging.ContiguousPagedList) this.getHighSpeedVideoFpsRanges).getHighResolutionOutputSizeshNQ4ISI = true;
        }
        this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(false);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.paging.ContiguousPagedList$deferBoundaryCallbacks$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.paging.ContiguousPagedList$deferBoundaryCallbacks$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContiguousPagedList$deferBoundaryCallbacks$1(boolean z, androidx.paging.ContiguousPagedList<K, V> contiguousPagedList, boolean z2, boolean z3, kotlin.coroutines.Continuation<? super androidx.paging.ContiguousPagedList$deferBoundaryCallbacks$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = z;
        this.getHighSpeedVideoFpsRanges = contiguousPagedList;
        this.getHighResolutionOutputSizeshNQ4ISI = z2;
        this.getHighSpeedVideoFpsRangesFor = z3;
    }
}
