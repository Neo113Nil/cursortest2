package com.paypal.oslo.feature.balance.ui.onholddetails;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/ProduceStateScope;", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.ui.onholddetails.TaxOnHoldDetailsKt$TaxOnHoldDetailsContent$formattedDate$2$1", f = "TaxOnHoldDetails.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class TaxOnHoldDetailsKt$TaxOnHoldDetailsContent$formattedDate$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.runtime.ProduceStateScope<java.lang.String>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.String, java.lang.String> Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.balance.ui.onholddetails.TaxOnHoldState getHighResolutionOutputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.runtime.ProduceStateScope produceStateScope = (androidx.compose.runtime.ProduceStateScope) this.getHighSpeedVideoFpsRanges;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        produceStateScope.setValue(this.Camera2StreamConfigurationMap.invoke(this.getHighResolutionOutputSizeshNQ4ISI.getDateLimit()));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(androidx.compose.runtime.ProduceStateScope<java.lang.String> produceStateScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.balance.ui.onholddetails.TaxOnHoldDetailsKt$TaxOnHoldDetailsContent$formattedDate$2$1) create(produceStateScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.balance.ui.onholddetails.TaxOnHoldDetailsKt$TaxOnHoldDetailsContent$formattedDate$2$1 taxOnHoldDetailsKt$TaxOnHoldDetailsContent$formattedDate$2$1 = new com.paypal.oslo.feature.balance.ui.onholddetails.TaxOnHoldDetailsKt$TaxOnHoldDetailsContent$formattedDate$2$1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        taxOnHoldDetailsKt$TaxOnHoldDetailsContent$formattedDate$2$1.getHighSpeedVideoFpsRanges = obj;
        return taxOnHoldDetailsKt$TaxOnHoldDetailsContent$formattedDate$2$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TaxOnHoldDetailsKt$TaxOnHoldDetailsContent$formattedDate$2$1(kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.String> function1, com.paypal.oslo.feature.balance.ui.onholddetails.TaxOnHoldState taxOnHoldState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.ui.onholddetails.TaxOnHoldDetailsKt$TaxOnHoldDetailsContent$formattedDate$2$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = function1;
        this.getHighResolutionOutputSizeshNQ4ISI = taxOnHoldState;
    }
}
