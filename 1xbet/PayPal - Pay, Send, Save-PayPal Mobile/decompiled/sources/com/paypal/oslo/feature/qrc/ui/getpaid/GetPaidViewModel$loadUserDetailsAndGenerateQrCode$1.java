package com.paypal.oslo.feature.qrc.ui.getpaid;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidViewModel$loadUserDetailsAndGenerateQrCode$1", f = "GetPaidViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class GetPaidViewModel$loadUserDetailsAndGenerateQrCode$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidViewModel Camera2StreamConfigurationMap;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.userstore.UserStore userStore;
        com.paypal.oslo.core.mvi.MviStateStore mviStateStore;
        com.paypal.oslo.core.mvi.MviStateStore mviStateStore2;
        com.paypal.oslo.core.userstore.model.ProfileName.PersonName personName;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            userStore = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
            com.paypal.oslo.core.userstore.model.UserState value = userStore.getUserState().getValue();
            if (!(value instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded)) {
                return kotlin.Unit.INSTANCE;
            }
            com.paypal.oslo.core.userstore.model.User user = ((com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) value).getUser();
            com.paypal.oslo.core.userstore.model.ProfileName legalName = user.getLegalName();
            java.lang.String fullName = (legalName == null || (personName = legalName.getPersonName()) == null) ? null : personName.getFullName();
            if (fullName == null) {
                fullName = "";
            }
            java.lang.String str = fullName;
            java.lang.String concat = com.paypal.oslo.feature.qrc.domain.utils.Constants.QR_CODE_BASE_URL.concat(java.lang.String.valueOf(user.getId()));
            mviStateStore = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
            com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiState getPaidUiState = (com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiState) mviStateStore.getUiState().getValue();
            if (getPaidUiState instanceof com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiState.Content) {
                com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiModel copy$default = com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiModel.copy$default(((com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiState.Content) getPaidUiState).getUiModel(), str, com.paypal.oslo.feature.qrc.ui.utils.ComposableUtilsKt.extractInitials(str), null, concat, 4, null);
                mviStateStore2 = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
                mviStateStore2.onEvent(new com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidEvent.UserDetailsLoaded(copy$default));
            }
            return kotlin.Unit.INSTANCE;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidViewModel$loadUserDetailsAndGenerateQrCode$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidViewModel$loadUserDetailsAndGenerateQrCode$1(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetPaidViewModel$loadUserDetailsAndGenerateQrCode$1(com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidViewModel getPaidViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidViewModel$loadUserDetailsAndGenerateQrCode$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = getPaidViewModel;
    }
}
