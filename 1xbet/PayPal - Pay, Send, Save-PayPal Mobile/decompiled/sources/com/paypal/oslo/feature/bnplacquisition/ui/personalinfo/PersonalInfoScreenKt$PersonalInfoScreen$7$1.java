package com.paypal.oslo.feature.bnplacquisition.ui.personalinfo;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoScreenKt$PersonalInfoScreen$7$1", f = "PersonalInfoScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class PersonalInfoScreenKt$PersonalInfoScreen$7$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState> getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState access$PersonalInfoScreen$lambda$1 = com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoScreenKt.access$PersonalInfoScreen$lambda$1(this.getHighSpeedVideoFpsRanges);
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Loading loading = access$PersonalInfoScreen$lambda$1 instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Loading ? (com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Loading) access$PersonalInfoScreen$lambda$1 : null;
        if (loading != null) {
            com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState.Loading loading2 = loading.getData().getApiLoadSuccessful() ? loading : null;
            if (loading2 != null) {
                this.getHighResolutionOutputSizeshNQ4ISI.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.SwitchToSuccess(loading2.getData()));
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoScreenKt$PersonalInfoScreen$7$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoScreenKt$PersonalInfoScreen$7$1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PersonalInfoScreenKt$PersonalInfoScreen$7$1(androidx.compose.runtime.State<? extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiState> state, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel personalInfoViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoScreenKt$PersonalInfoScreen$7$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = state;
        this.getHighResolutionOutputSizeshNQ4ISI = personalInfoViewModel;
    }
}
