package com.paypal.oslo.feature.dataprivacy.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataDeletionViewModel$onContinueConfirmed$1", f = "DataDeletionViewModel.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, nl = {55}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class DataDeletionViewModel$onContinueConfirmed$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataDeletionViewModel Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.feature.dataprivacy.domain.usecase.GetLinkedAccountsUseCase getLinkedAccountsUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                getLinkedAccountsUseCase = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
                this.getHighSpeedVideoFpsRangesFor = 1;
                obj = getLinkedAccountsUseCase.invoke(this);
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
            if (ior instanceof arrow.core.Ior.Right) {
                com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataDeletionViewModel.access$handleLinkedAccounts(this.Camera2StreamConfigurationMap, (java.util.List) ((arrow.core.Ior.Right) ior).getValue());
            } else if (ior instanceof arrow.core.Ior.Both) {
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.dataprivacy.LoggerKt.log, "getLinkedAccounts partial success", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("left_value", ((com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError) ((arrow.core.Ior.Both) ior).getLeftValue()).toString())), null, 4, null);
                com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataDeletionViewModel.access$handleLinkedAccounts(this.Camera2StreamConfigurationMap, (java.util.List) ((arrow.core.Ior.Both) ior).getRightValue());
            } else {
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.dataprivacy.LoggerKt.log, "getLinkedAccounts failed, failing open to linked accounts screen", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", ((com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError) ((arrow.core.Ior.Left) ior).getValue()).toString())), null, 4, null);
                mutableStateFlow2 = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap;
                mutableStateFlow2.setValue(new com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataDeletionUiState.NavigateToLinkedAccounts(kotlin.collections.CollectionsKt.emptyList()));
            }
        } catch (java.util.concurrent.CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            com.paypal.oslo.feature.dataprivacy.LoggerKt.log.e("getLinkedAccounts failed unexpectedly, failing open", th);
            mutableStateFlow = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap;
            mutableStateFlow.setValue(new com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataDeletionUiState.NavigateToLinkedAccounts(kotlin.collections.CollectionsKt.emptyList()));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataDeletionViewModel$onContinueConfirmed$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataDeletionViewModel$onContinueConfirmed$1(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataDeletionViewModel$onContinueConfirmed$1(com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataDeletionViewModel dataDeletionViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataDeletionViewModel$onContinueConfirmed$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = dataDeletionViewModel;
    }
}
