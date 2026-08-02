package com.paypal.oslo.feature.cashin.ui.screens;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cashin.ui.screens.CashInMapScreenKt$CashInMapScreen$5$1", f = "CashInMapScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class CashInMapScreenKt$CashInMapScreen$5$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState> getHighSpeedVideoFpsRanges;
    final /* synthetic */ android.content.Context getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.String searchError = com.paypal.oslo.feature.cashin.ui.screens.CashInMapScreenKt.access$CashInMapScreen$lambda$1(this.getHighSpeedVideoFpsRanges).getSearchError();
        if (searchError != null) {
            android.widget.Toast.makeText(this.getHighSpeedVideoSizes, searchError, 1).show();
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.cashin.LoggerKt.log, "Cash-in search error", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorMessage", searchError)), null, 4, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.cashin.ui.screens.CashInMapScreenKt$CashInMapScreen$5$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.cashin.ui.screens.CashInMapScreenKt$CashInMapScreen$5$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CashInMapScreenKt$CashInMapScreen$5$1(androidx.compose.runtime.State<com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState> state, android.content.Context context, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cashin.ui.screens.CashInMapScreenKt$CashInMapScreen$5$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = state;
        this.getHighSpeedVideoSizes = context;
    }
}
