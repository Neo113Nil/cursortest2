package com.paypal.oslo.feature.identity.accountswitch.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountViewModel$unlinkAccount$1", f = "UnlinkAccountViewModel.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, nl = {132}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class UnlinkAccountViewModel$unlinkAccount$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.feature.identity.accountswitch.domain.usecase.UnlinkAccountUseCase unlinkAccountUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor;
            mutableStateFlow.setValue(com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountUiState.Loading.INSTANCE);
            unlinkAccountUseCase = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap;
            this.Camera2StreamConfigurationMap = 1;
            obj = unlinkAccountUseCase.invoke(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Ior ior = (arrow.core.Ior) obj;
        com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountViewModel unlinkAccountViewModel = this.getHighSpeedVideoSizes;
        if (ior instanceof arrow.core.Ior.Left) {
            com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountViewModel.access$handleUnlinkError(unlinkAccountViewModel, (com.paypal.oslo.feature.identity.accountswitch.domain.model.DataResultError) ((arrow.core.Ior.Left) ior).getValue());
        } else if (ior instanceof arrow.core.Ior.Right) {
            com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountViewModel.access$handleUnlinkSuccess(unlinkAccountViewModel, ((java.lang.Boolean) ((arrow.core.Ior.Right) ior).getValue()).booleanValue());
        } else if (ior instanceof arrow.core.Ior.Both) {
            arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
            com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountViewModel.access$handlePartialSuccess(unlinkAccountViewModel, (com.paypal.oslo.feature.identity.accountswitch.domain.model.DataResultError) both.getLeftValue(), ((java.lang.Boolean) both.getRightValue()).booleanValue());
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountViewModel$unlinkAccount$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountViewModel$unlinkAccount$1(this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UnlinkAccountViewModel$unlinkAccount$1(com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountViewModel unlinkAccountViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountViewModel$unlinkAccount$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = unlinkAccountViewModel;
    }
}
