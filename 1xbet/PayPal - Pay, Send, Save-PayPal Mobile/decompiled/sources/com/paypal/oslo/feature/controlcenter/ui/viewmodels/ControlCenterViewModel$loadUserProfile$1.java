package com.paypal.oslo.feature.controlcenter.ui.viewmodels;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel$loadUserProfile$1", f = "ControlCenterViewModel.kt", i = {}, l = {152}, m = "invokeSuspend", n = {}, nl = {159}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class ControlCenterViewModel$loadUserProfile$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.controlcenter.domain.usecase.GetUserProfileUseCase getUserProfileUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            getUserProfileUseCase = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
            kotlinx.coroutines.flow.Flow<arrow.core.Ior<com.paypal.oslo.feature.controlcenter.domain.model.UserProfileError, com.paypal.oslo.feature.controlcenter.domain.model.UserProfile>> invoke = getUserProfileUseCase.invoke();
            final com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel controlCenterViewModel = this.getHighSpeedVideoSizes;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (invoke.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel$loadUserProfile$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    arrow.core.Ior ior = (arrow.core.Ior) obj2;
                    if (ior instanceof arrow.core.Ior.Left) {
                        com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel.access$handleProfileLoadError(com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel.this, (com.paypal.oslo.feature.controlcenter.domain.model.UserProfileError) ((arrow.core.Ior.Left) ior).getValue());
                    } else if (ior instanceof arrow.core.Ior.Right) {
                        com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel.access$handleProfileLoadSuccess(com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel.this, (com.paypal.oslo.feature.controlcenter.domain.model.UserProfile) ((arrow.core.Ior.Right) ior).getValue());
                    } else {
                        if (!(ior instanceof arrow.core.Ior.Both)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                        com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel.access$handleProfileLoadPartialSuccess(com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel.this, (com.paypal.oslo.feature.controlcenter.domain.model.UserProfileError) both.getLeftValue(), (com.paypal.oslo.feature.controlcenter.domain.model.UserProfile) both.getRightValue());
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
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

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel$loadUserProfile$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel$loadUserProfile$1(this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ControlCenterViewModel$loadUserProfile$1(com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel controlCenterViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel$loadUserProfile$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = controlCenterViewModel;
    }
}
