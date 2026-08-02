package com.paypal.android.threeds.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.threeds.viewmodel.ThreeDsViewModel$authenticateRequest$1", f = "ThreeDsViewModel.kt", i = {}, l = {106}, m = "invokeSuspend", n = {}, nl = {107}, s = {}, v = 2)
/* loaded from: classes10.dex */
final class ThreeDsViewModel$authenticateRequest$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.android.threeds.viewmodel.ThreeDsViewModel Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.android.threeds.data.model.AuthenticationRequest getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.view.MutableLiveData mutableLiveData;
        androidx.view.MutableLiveData mutableLiveData2;
        androidx.view.MutableLiveData mutableLiveData3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableLiveData = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
            mutableLiveData.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
            this.getHighSpeedVideoFpsRangesFor = 1;
            obj = this.Camera2StreamConfigurationMap.getApiRepository().authenticateRequest(this.getHighResolutionOutputSizeshNQ4ISI, this);
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
            com.paypal.android.threeds.data.model.AuthenticationResponse authenticationResponse = (com.paypal.android.threeds.data.model.AuthenticationResponse) ((com.paypal.android.threeds.network.NetworkResponse.Success) networkResponse).getData();
            mutableLiveData3 = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap;
            mutableLiveData3.postValue(authenticationResponse);
        } else {
            if (!(networkResponse instanceof com.paypal.android.threeds.network.NetworkResponse.Error)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.android.threeds.viewmodel.ThreeDsViewModel.access$postNetworkError(this.Camera2StreamConfigurationMap, (com.paypal.android.threeds.network.NetworkResponse.Error) networkResponse);
        }
        mutableLiveData2 = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
        mutableLiveData2.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.android.threeds.viewmodel.ThreeDsViewModel$authenticateRequest$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.android.threeds.viewmodel.ThreeDsViewModel$authenticateRequest$1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ThreeDsViewModel$authenticateRequest$1(com.paypal.android.threeds.viewmodel.ThreeDsViewModel threeDsViewModel, com.paypal.android.threeds.data.model.AuthenticationRequest authenticationRequest, kotlin.coroutines.Continuation<? super com.paypal.android.threeds.viewmodel.ThreeDsViewModel$authenticateRequest$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = threeDsViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = authenticationRequest;
    }
}
