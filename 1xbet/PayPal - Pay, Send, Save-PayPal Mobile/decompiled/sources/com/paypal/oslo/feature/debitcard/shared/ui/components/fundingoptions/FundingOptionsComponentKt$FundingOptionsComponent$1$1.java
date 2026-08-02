package com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.FundingOptionsComponentKt$FundingOptionsComponent$1$1", f = "FundingOptionsComponent.kt", i = {}, l = {176}, m = "invokeSuspend", n = {}, nl = {183}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class FundingOptionsComponentKt$FundingOptionsComponent$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.viewmodel.FundingOptionsComponentViewModel getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentUiEffect> uiEffect = this.getHighSpeedVideoFpsRanges.getUiEffect();
            final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> function1 = this.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (uiEffect.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.FundingOptionsComponentKt$FundingOptionsComponent$1$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentUiEffect fundingOptionsComponentUiEffect = (com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentUiEffect) obj2;
                    if (!(fundingOptionsComponentUiEffect instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentUiEffect.FundingSourceSelected)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> function12 = function1;
                    if (function12 != null) {
                        function12.invoke(((com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentUiEffect.FundingSourceSelected) fundingOptionsComponentUiEffect).getFundingSourceId());
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
        return ((com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.FundingOptionsComponentKt$FundingOptionsComponent$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.FundingOptionsComponentKt$FundingOptionsComponent$1$1(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FundingOptionsComponentKt$FundingOptionsComponent$1$1(com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.viewmodel.FundingOptionsComponentViewModel fundingOptionsComponentViewModel, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.FundingOptionsComponentKt$FundingOptionsComponent$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = fundingOptionsComponentViewModel;
        this.Camera2StreamConfigurationMap = function1;
    }
}
