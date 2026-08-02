package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroidx/lifecycle/EmittedSource;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2", f = "CoroutineLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes7.dex */
final class CoroutineLiveDataKt$addDisposableSource$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super androidx.view.EmittedSource>, java.lang.Object> {
    final /* synthetic */ androidx.view.MediatorLiveData<T> Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.view.LiveData<T> getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        final androidx.view.MediatorLiveData<T> mediatorLiveData = this.Camera2StreamConfigurationMap;
        mediatorLiveData.addSource(this.getHighSpeedVideoFpsRanges, new androidx.view.CoroutineLiveDataKt$sam$androidx_lifecycle_Observer$0(new kotlin.jvm.functions.Function1() { // from class: androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return androidx.view.CoroutineLiveDataKt$addDisposableSource$2.getHighSpeedVideoSizes(androidx.view.MediatorLiveData.this, obj2);
            }
        }));
        return new androidx.view.EmittedSource(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap);
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(androidx.view.MediatorLiveData mediatorLiveData, java.lang.Object obj) {
        mediatorLiveData.setValue(obj);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super androidx.view.EmittedSource> continuation) {
        return ((androidx.view.CoroutineLiveDataKt$addDisposableSource$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.view.CoroutineLiveDataKt$addDisposableSource$2(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CoroutineLiveDataKt$addDisposableSource$2(androidx.view.MediatorLiveData<T> mediatorLiveData, androidx.view.LiveData<T> liveData, kotlin.coroutines.Continuation<? super androidx.view.CoroutineLiveDataKt$addDisposableSource$2> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = mediatorLiveData;
        this.getHighSpeedVideoFpsRanges = liveData;
    }
}
