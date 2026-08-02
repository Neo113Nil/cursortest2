package com.paypal.oslo.feature.identity.moreoptions.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsViewModel$sideEffectsMiddleware$1$invoke$1", f = "MoreOptionsViewModel.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, nl = {125}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class MoreOptionsViewModel$sideEffectsMiddleware$1$invoke$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsUiState, com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent> getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.identity.moreoptions.domain.usecase.MoreOptionUseCase moreOptionUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            moreOptionUseCase = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRangesFor = 1;
            obj = moreOptionUseCase.invoke(((com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent.FetchOptions) this.getHighResolutionOutputSizeshNQ4ISI).getCurrentOptionType(), this);
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
        com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsUiState, com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent> input = this.getHighSpeedVideoFpsRanges;
        com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsViewModel moreOptionsViewModel = this.getHighSpeedVideoSizes;
        if (either instanceof arrow.core.Either.Right) {
            input.getEventDispatcher().invoke(new com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent.OptionsLoadSuccess(((com.paypal.oslo.feature.identity.moreoptions.domain.model.MoreOptionResult) ((arrow.core.Either.Right) either).getValue()).getOptions()));
        } else if (either instanceof arrow.core.Either.Left) {
            input.getEventDispatcher().invoke(new com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent.OptionsLoadFailure(com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsViewModel.access$toErrorMessage(moreOptionsViewModel, (com.paypal.oslo.feature.identity.moreoptions.domain.model.MoreOptionError) ((arrow.core.Either.Left) either).getValue())));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsViewModel$sideEffectsMiddleware$1$invoke$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsViewModel$sideEffectsMiddleware$1$invoke$1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MoreOptionsViewModel$sideEffectsMiddleware$1$invoke$1(com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsViewModel moreOptionsViewModel, com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent moreOptionsEvent, com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsUiState, com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent> input, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsViewModel$sideEffectsMiddleware$1$invoke$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = moreOptionsViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = moreOptionsEvent;
        this.getHighSpeedVideoFpsRanges = input;
    }
}
