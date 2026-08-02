package com.paypal.oslo.feature.inappcheckout.ui.profile.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.ui.profile.viewmodel.ProfileViewModel$handleLogout$1", f = "ProfileViewModel.kt", i = {}, l = {141}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class ProfileViewModel$handleLogout$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.profile.viewmodel.ProfileViewModel Camera2StreamConfigurationMap;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.inappcheckout.domain.util.InAppCheckoutStringsProvider inAppCheckoutStringsProvider;
        com.paypal.oslo.feature.inappcheckout.domain.usecase.LogoutUseCase logoutUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.inappcheckout.ui.profile.viewmodel.ProfileViewModel profileViewModel = this.Camera2StreamConfigurationMap;
            inAppCheckoutStringsProvider = profileViewModel.getHighResolutionOutputSizeshNQ4ISI;
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(profileViewModel), null, null, new com.paypal.oslo.feature.inappcheckout.ui.profile.viewmodel.ProfileViewModel$emitEffect$1(profileViewModel, new com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Effect.ShowMessage(inAppCheckoutStringsProvider.stringValue(com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_logging_out)), null), 3, null);
            logoutUseCase = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoSizes = 1;
            obj = logoutUseCase.invoke(this);
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
        com.paypal.oslo.feature.inappcheckout.ui.profile.viewmodel.ProfileViewModel profileViewModel2 = this.Camera2StreamConfigurationMap;
        if (either instanceof arrow.core.Either.Right) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(profileViewModel2), null, null, new com.paypal.oslo.feature.inappcheckout.ui.profile.viewmodel.ProfileViewModel$emitEffect$1(profileViewModel2, com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Effect.LogoutSuccess.INSTANCE, null), 3, null);
        } else if (either instanceof arrow.core.Either.Left) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(profileViewModel2), null, null, new com.paypal.oslo.feature.inappcheckout.ui.profile.viewmodel.ProfileViewModel$emitEffect$1(profileViewModel2, new com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Effect.LogoutError(((com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity) ((arrow.core.Either.Left) either).getValue()).getDescription()), null), 3, null);
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.inappcheckout.ui.profile.viewmodel.ProfileViewModel$handleLogout$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.inappcheckout.ui.profile.viewmodel.ProfileViewModel$handleLogout$1(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProfileViewModel$handleLogout$1(com.paypal.oslo.feature.inappcheckout.ui.profile.viewmodel.ProfileViewModel profileViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.ui.profile.viewmodel.ProfileViewModel$handleLogout$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = profileViewModel;
    }
}
