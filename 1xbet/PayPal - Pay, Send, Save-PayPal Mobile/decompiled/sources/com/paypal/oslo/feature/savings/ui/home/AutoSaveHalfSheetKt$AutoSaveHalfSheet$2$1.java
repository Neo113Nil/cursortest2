package com.paypal.oslo.feature.savings.ui.home;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetKt$AutoSaveHalfSheet$2$1", f = "AutoSaveHalfSheet.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class AutoSaveHalfSheetKt$AutoSaveHalfSheet$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetAction, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetKt.access$AutoSaveHalfSheet$lambda$0(this.getHighSpeedVideoSizes) instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState.MoveToAutoSaveSetup) {
            com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState access$AutoSaveHalfSheet$lambda$0 = com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetKt.access$AutoSaveHalfSheet$lambda$0(this.getHighSpeedVideoSizes);
            kotlin.jvm.internal.Intrinsics.checkNotNull(access$AutoSaveHalfSheet$lambda$0, "");
            this.getHighSpeedVideoFpsRangesFor.invoke(new com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetAction.SetUp(((com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState.MoveToAutoSaveSetup) access$AutoSaveHalfSheet$lambda$0).getGoal()));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetKt$AutoSaveHalfSheet$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetKt$AutoSaveHalfSheet$2$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AutoSaveHalfSheetKt$AutoSaveHalfSheet$2$1(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetAction, kotlin.Unit> function1, androidx.compose.runtime.State<? extends com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState> state, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetKt$AutoSaveHalfSheet$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = function1;
        this.getHighSpeedVideoSizes = state;
    }
}
