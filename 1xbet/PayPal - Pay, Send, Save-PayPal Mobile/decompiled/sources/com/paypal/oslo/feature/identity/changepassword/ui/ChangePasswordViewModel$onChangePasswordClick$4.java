package com.paypal.oslo.feature.identity.changepassword.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel$onChangePasswordClick$4", f = "ChangePasswordViewModel.kt", i = {1, 1, 1, 1}, l = {92, 114}, m = "invokeSuspend", n = {"this_$iv", "it", "$i$f$fold", "$i$a$-fold-ChangePasswordViewModel$onChangePasswordClick$4$2"}, nl = {96, 115}, s = {"L$0", "L$1", "I$0", "I$1"}, v = 2)
/* loaded from: classes12.dex */
final class ChangePasswordViewModel$onChangePasswordClick$4 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ChangePasswordUiState getHighSpeedVideoSizes;
    int getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel getOutputFormats;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a6, code lost:
    
        if (r4.send(r6, r20) == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00e3, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004f, code lost:
    
        if (r2 != r1) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.identity.changepassword.domain.usecase.ChangePasswordUseCase changePasswordUseCase;
        java.lang.Object invoke;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object value;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object value2;
        kotlinx.coroutines.channels.Channel channel;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            changePasswordUseCase = this.getOutputFormats.getHighResolutionOutputSizeshNQ4ISI;
            this.getInputFormats = 1;
            invoke = changePasswordUseCase.invoke(this.getHighSpeedVideoSizes.getCurrentPassword(), this.getHighSpeedVideoSizes.getNewPassword(), this.getHighSpeedVideoSizes.getConfirmPassword(), this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            invoke = obj;
        }
        arrow.core.Either either = (arrow.core.Either) invoke;
        com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel changePasswordViewModel = this.getOutputFormats;
        if (either instanceof arrow.core.Either.Right) {
            kotlin.Unit unit = (kotlin.Unit) ((arrow.core.Either.Right) either).getValue();
            mutableStateFlow2 = changePasswordViewModel.Camera2StreamConfigurationMap;
            do {
                value2 = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value2, com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ChangePasswordUiState.copy$default((com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ChangePasswordUiState) value2, "", "", "", false, null, null, false, false, false, 496, null)));
            channel = changePasswordViewModel.getHighSpeedVideoFpsRanges;
            com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordUiEffect.PasswordChangedSuccess passwordChangedSuccess = com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordUiEffect.PasswordChangedSuccess.INSTANCE;
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(unit);
            this.getHighSpeedVideoFpsRangesFor = 0;
            this.Camera2StreamConfigurationMap = 0;
            this.getInputFormats = 2;
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.identity.changepassword.domain.model.ChangePasswordError changePasswordError = (com.paypal.oslo.feature.identity.changepassword.domain.model.ChangePasswordError) ((arrow.core.Either.Left) either).getValue();
            mutableStateFlow = changePasswordViewModel.Camera2StreamConfigurationMap;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ChangePasswordUiState.copy$default((com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ChangePasswordUiState) value, null, null, null, false, com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.access$mapErrorToMessage(changePasswordViewModel, changePasswordError), null, false, false, false, 487, null)));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel$onChangePasswordClick$4) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel$onChangePasswordClick$4(this.getOutputFormats, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChangePasswordViewModel$onChangePasswordClick$4(com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel changePasswordViewModel, com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ChangePasswordUiState changePasswordUiState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel$onChangePasswordClick$4> continuation) {
        super(2, continuation);
        this.getOutputFormats = changePasswordViewModel;
        this.getHighSpeedVideoSizes = changePasswordUiState;
    }
}
