package com.paypal.android.threeds.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.threeds.viewmodel.ThreeDsViewModel$sdkDDC$1", f = "ThreeDsViewModel.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, nl = {77}, s = {}, v = 2)
/* loaded from: classes10.dex */
final class ThreeDsViewModel$sdkDDC$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.android.threeds.data.model.SdkDdcRequest getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.android.threeds.viewmodel.ThreeDsViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.view.MutableLiveData mutableLiveData;
        androidx.view.MutableLiveData mutableLiveData2;
        androidx.view.MutableLiveData mutableLiveData3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableLiveData = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor;
            mutableLiveData.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
            this.getHighSpeedVideoFpsRangesFor = 1;
            obj = this.getHighSpeedVideoSizes.getApiRepository().sdkDDC(this.getHighSpeedVideoFpsRanges, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.paypal.android.threeds.network.NetworkResponse networkResponse = (com.paypal.android.threeds.network.NetworkResponse) obj;
        if (networkResponse instanceof com.paypal.android.threeds.network.NetworkResponse.Success) {
            mutableLiveData3 = this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.Object data = ((com.paypal.android.threeds.network.NetworkResponse.Success) networkResponse).getData();
            kotlin.jvm.internal.Intrinsics.checkNotNull(data);
            mutableLiveData3.postValue(data);
        } else {
            if (!(networkResponse instanceof com.paypal.android.threeds.network.NetworkResponse.Error)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.android.threeds.viewmodel.ThreeDsViewModel.access$postNetworkError(this.getHighSpeedVideoSizes, (com.paypal.android.threeds.network.NetworkResponse.Error) networkResponse);
        }
        mutableLiveData2 = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor;
        mutableLiveData2.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.android.threeds.viewmodel.ThreeDsViewModel$sdkDDC$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.android.threeds.viewmodel.ThreeDsViewModel$sdkDDC$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ThreeDsViewModel$sdkDDC$1(com.paypal.android.threeds.viewmodel.ThreeDsViewModel threeDsViewModel, com.paypal.android.threeds.data.model.SdkDdcRequest sdkDdcRequest, kotlin.coroutines.Continuation<? super com.paypal.android.threeds.viewmodel.ThreeDsViewModel$sdkDDC$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = threeDsViewModel;
        this.getHighSpeedVideoFpsRanges = sdkDdcRequest;
    }
}
