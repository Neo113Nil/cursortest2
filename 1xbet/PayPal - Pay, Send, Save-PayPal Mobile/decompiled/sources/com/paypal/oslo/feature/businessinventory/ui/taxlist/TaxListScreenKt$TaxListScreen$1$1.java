package com.paypal.oslo.feature.businessinventory.ui.taxlist;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenKt$TaxListScreen$1$1", f = "TaxListScreen.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class TaxListScreenKt$TaxListScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.businessinventory.ui.taxlist.UiEffect> effects = this.getHighSpeedVideoSizes.getEffects();
            final kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.Camera2StreamConfigurationMap;
            final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption, kotlin.Unit> function1 = this.getHighSpeedVideoFpsRangesFor;
            final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption, kotlin.Unit> function12 = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRanges = 1;
            if (effects.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenKt$TaxListScreen$1$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.businessinventory.ui.taxlist.UiEffect uiEffect = (com.paypal.oslo.feature.businessinventory.ui.taxlist.UiEffect) obj2;
                    if (uiEffect instanceof com.paypal.oslo.feature.businessinventory.ui.taxlist.UiEffect.CreateTax) {
                        function0.invoke();
                    } else if (uiEffect instanceof com.paypal.oslo.feature.businessinventory.ui.taxlist.UiEffect.EditTax) {
                        function1.invoke(((com.paypal.oslo.feature.businessinventory.ui.taxlist.UiEffect.EditTax) uiEffect).getTax());
                    } else {
                        if (!(uiEffect instanceof com.paypal.oslo.feature.businessinventory.ui.taxlist.UiEffect.SelectTax)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        function12.invoke(((com.paypal.oslo.feature.businessinventory.ui.taxlist.UiEffect.SelectTax) uiEffect).getTax());
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
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenKt$TaxListScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenKt$TaxListScreen$1$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TaxListScreenKt$TaxListScreen$1$1(com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel taxListScreenViewModel, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption, kotlin.Unit> function12, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenKt$TaxListScreen$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = taxListScreenViewModel;
        this.Camera2StreamConfigurationMap = function0;
        this.getHighSpeedVideoFpsRangesFor = function1;
        this.getHighResolutionOutputSizeshNQ4ISI = function12;
    }
}
