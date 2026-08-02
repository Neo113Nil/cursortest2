package com.paypal.oslo.feature.publicprofile.ui.publicprofile.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.publicprofile.ui.publicprofile.viewmodel.PublicProfileViewModel$blockContact$1", f = "PublicProfileViewModel.kt", i = {}, l = {155}, m = "invokeSuspend", n = {}, nl = {193}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class PublicProfileViewModel$blockContact$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.publicprofile.ui.publicprofile.viewmodel.PublicProfileViewModel Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent, kotlin.Unit> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.publicprofile.domain.usecase.BlockContactUseCase blockContactUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            blockContactUseCase = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRangesFor = 1;
            obj = blockContactUseCase.invoke(this.getHighResolutionOutputSizeshNQ4ISI, this);
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
        kotlin.jvm.functions.Function1<com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent, kotlin.Unit> function1 = this.getHighSpeedVideoSizes;
        if (either instanceof arrow.core.Either.Right) {
            function1.invoke(com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.BlockContactSucceeded.INSTANCE);
        } else if (either instanceof arrow.core.Either.Left) {
            function1.invoke(new com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.BlockContactFailed((com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError) ((arrow.core.Either.Left) either).getValue()));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.publicprofile.ui.publicprofile.viewmodel.PublicProfileViewModel$blockContact$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.publicprofile.ui.publicprofile.viewmodel.PublicProfileViewModel$blockContact$1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PublicProfileViewModel$blockContact$1(com.paypal.oslo.feature.publicprofile.ui.publicprofile.viewmodel.PublicProfileViewModel publicProfileViewModel, java.lang.String str, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.publicprofile.ui.publicprofile.viewmodel.PublicProfileViewModel$blockContact$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = publicProfileViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoSizes = function1;
    }
}
