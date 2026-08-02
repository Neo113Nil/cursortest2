package com.paypal.oslo.feature.businesscustomers.ui.customerprofile;

@kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel$handleEvent$1$openEditCustomer$1", f = "CustomerProfileViewModel.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, nl = {87}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class CustomerProfileViewModel$handleEvent$1$openEditCustomer$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizes.invoke();
            mutableSharedFlow = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
            this.Camera2StreamConfigurationMap = 1;
            if (mutableSharedFlow.emit(new com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileUiEffect.OpenEditCustomer(((com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileUiState) this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes.getValue()).getCustomer()), this) == coroutine_suspended) {
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

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel$handleEvent$1$openEditCustomer$1) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel$handleEvent$1$openEditCustomer$1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomerProfileViewModel$handleEvent$1$openEditCustomer$1(kotlin.jvm.functions.Function0<kotlin.Unit> function0, com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel customerProfileViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel$handleEvent$1$openEditCustomer$1> continuation) {
        super(1, continuation);
        this.getHighSpeedVideoSizes = function0;
        this.getHighResolutionOutputSizeshNQ4ISI = customerProfileViewModel;
    }
}
