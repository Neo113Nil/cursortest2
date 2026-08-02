package com.paypal.oslo.feature.controlcenter.ui.viewmodels;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel$launchNameFormatting$1", f = "ControlCenterViewModel.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE}, m = "invokeSuspend", n = {}, nl = {174}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class ControlCenterViewModel$launchNameFormatting$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.controlcenter.domain.model.UserProfile getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.controlcenter.domain.usecase.FormatUserDisplayNameUseCase formatUserDisplayNameUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            formatUserDisplayNameUseCase = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            obj = formatUserDisplayNameUseCase.invoke(this.getHighSpeedVideoFpsRanges, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.getHighSpeedVideoSizes.processEvent(new com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.DisplayNameFormatted((java.lang.String) obj));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel$launchNameFormatting$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel$launchNameFormatting$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ControlCenterViewModel$launchNameFormatting$1(com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel controlCenterViewModel, com.paypal.oslo.feature.controlcenter.domain.model.UserProfile userProfile, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel$launchNameFormatting$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = controlCenterViewModel;
        this.getHighSpeedVideoFpsRanges = userProfile;
    }
}
