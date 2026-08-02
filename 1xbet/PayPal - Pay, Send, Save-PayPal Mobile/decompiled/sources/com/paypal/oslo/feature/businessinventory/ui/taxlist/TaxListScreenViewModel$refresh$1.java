package com.paypal.oslo.feature.businessinventory.ui.taxlist;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel$refresh$1", f = "TaxListScreenViewModel.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, nl = {109}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class TaxListScreenViewModel$refresh$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.feature.businessinventory.domain.usecase.SyncTaxOptionsUseCase syncTaxOptionsUseCase;
        com.paypal.oslo.feature.businessinventory.domain.ItemLibraryAnalytics itemLibraryAnalytics;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        com.paypal.oslo.feature.businessinventory.domain.ItemLibraryAnalytics itemLibraryAnalytics2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow5;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighSpeedVideoFpsRangesFor.getOutputFormats;
            mutableStateFlow.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
            syncTaxOptionsUseCase = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges;
            this.Camera2StreamConfigurationMap = 1;
            obj = syncTaxOptionsUseCase.invoke(this);
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
        com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel taxListScreenViewModel = this.getHighSpeedVideoFpsRangesFor;
        if (either.isRight()) {
            itemLibraryAnalytics2 = taxListScreenViewModel.Camera2StreamConfigurationMap;
            itemLibraryAnalytics2.logTaxListLoad(true);
            mutableStateFlow4 = taxListScreenViewModel.getHighSpeedVideoSizesFor;
            mutableStateFlow4.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
            mutableStateFlow5 = taxListScreenViewModel.getOutputFormats;
            mutableStateFlow5.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
        }
        com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel taxListScreenViewModel2 = this.getHighSpeedVideoFpsRangesFor;
        if (either.isLeft()) {
            java.lang.Throwable th = (java.lang.Throwable) ((arrow.core.Either.Left) either).getValue();
            itemLibraryAnalytics = taxListScreenViewModel2.Camera2StreamConfigurationMap;
            itemLibraryAnalytics.logTaxListLoad(false);
            mutableStateFlow2 = taxListScreenViewModel2.getHighSpeedVideoSizesFor;
            mutableStateFlow2.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
            mutableStateFlow3 = taxListScreenViewModel2.getOutputFormats;
            mutableStateFlow3.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
            com.paypal.oslo.feature.businessinventory.LoggerKt.log.e("TaxListScreenViewModel failed to refresh", th);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel$refresh$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel$refresh$1(this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TaxListScreenViewModel$refresh$1(com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel taxListScreenViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel$refresh$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = taxListScreenViewModel;
    }
}
