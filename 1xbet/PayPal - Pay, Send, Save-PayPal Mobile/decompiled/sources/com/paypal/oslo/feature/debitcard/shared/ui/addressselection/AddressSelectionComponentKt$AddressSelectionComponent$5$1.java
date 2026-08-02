package com.paypal.oslo.feature.debitcard.shared.ui.addressselection;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.shared.ui.addressselection.AddressSelectionComponentKt$AddressSelectionComponent$5$1", f = "AddressSelectionComponent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class AddressSelectionComponentKt$AddressSelectionComponent$5$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState> Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighResolutionOutputSizeshNQ4ISI.invoke(com.paypal.oslo.feature.debitcard.shared.ui.addressselection.AddressSelectionComponentKt.access$AddressSelectionComponent$lambda$1(this.Camera2StreamConfigurationMap));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.debitcard.shared.ui.addressselection.AddressSelectionComponentKt$AddressSelectionComponent$5$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.debitcard.shared.ui.addressselection.AddressSelectionComponentKt$AddressSelectionComponent$5$1(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AddressSelectionComponentKt$AddressSelectionComponent$5$1(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState, kotlin.Unit> function1, androidx.compose.runtime.State<? extends com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState> state, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.ui.addressselection.AddressSelectionComponentKt$AddressSelectionComponent$5$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
        this.Camera2StreamConfigurationMap = state;
    }
}
