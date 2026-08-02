package com.paypal.oslo.feature.wallet.amexandp3.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.amexandp3.ui.ManageAmexViewModel$removeAccount$1", f = "ManageAmexViewModel.kt", i = {}, l = {153}, m = "invokeSuspend", n = {}, nl = {154}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class ManageAmexViewModel$removeAccount$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.wallet.amexandp3.ui.ManageAmexViewModel getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object value;
        com.paypal.oslo.feature.wallet.amexandp3.domain.usecase.RemovePaymentTokenUseCase removePaymentTokenUseCase;
        java.lang.String str;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object value2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        java.lang.Object value3;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        boolean z = false;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizesFor;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false)));
            removePaymentTokenUseCase = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI;
            str = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap;
            this.Camera2StreamConfigurationMap = 1;
            obj = removePaymentTokenUseCase.invoke(str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either = (arrow.core.Either) obj;
        if (either instanceof arrow.core.Either.Right) {
            z = ((java.lang.Boolean) ((arrow.core.Either.Right) either).getValue()).booleanValue();
        } else {
            if (!(either instanceof arrow.core.Either.Left)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        if (z) {
            mutableStateFlow3 = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges;
            com.paypal.oslo.feature.wallet.amexandp3.ui.ManageAmexViewModel manageAmexViewModel = this.getHighSpeedVideoFpsRanges;
            do {
                value3 = mutableStateFlow3.getValue();
                str2 = manageAmexViewModel.getInputFormats;
                str3 = manageAmexViewModel.getOutputFormats;
            } while (!mutableStateFlow3.compareAndSet(value3, new com.paypal.oslo.feature.wallet.amexandp3.ui.ManageAmexViewModel.Navigation.GoBackWithResult(new com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.ManageAmexNavResult(new com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.ManageAmexNavResult.Outcome.Removed(str2, str3)))));
        }
        mutableStateFlow2 = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizesFor;
        do {
            value2 = mutableStateFlow2.getValue();
        } while (!mutableStateFlow2.compareAndSet(value2, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(!z)));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.amexandp3.ui.ManageAmexViewModel$removeAccount$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.amexandp3.ui.ManageAmexViewModel$removeAccount$1(this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ManageAmexViewModel$removeAccount$1(com.paypal.oslo.feature.wallet.amexandp3.ui.ManageAmexViewModel manageAmexViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.amexandp3.ui.ManageAmexViewModel$removeAccount$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = manageAmexViewModel;
    }
}
