package com.paypal.oslo.feature.taptopay.data.thales.mapper;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "osloMethod", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/IdentityVerificationMethod;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.thales.mapper.ThalesModelMapperKt$toOslo$2", f = "ThalesModelMapper.kt", i = {0}, l = {154}, m = "invokeSuspend", n = {"osloMethod"}, nl = {-1}, s = {"L$0"}, v = 2)
/* loaded from: classes5.dex */
final class ThalesModelMapperKt$toOslo$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.android.taptopay.domain.model.card.AddCardState getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod identityVerificationMethod = (com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod) this.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.jvm.functions.Function2<com.paypal.android.taptopay.domain.model.card.IdentityVerificationMethod, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> onSelected = ((com.paypal.android.taptopay.domain.model.card.AddCardState.Success.SelectIdentityVerificationMethod) this.getHighResolutionOutputSizeshNQ4ISI).getOnSelected();
            com.paypal.android.taptopay.domain.model.card.IdentityVerificationMethod thales = com.paypal.oslo.feature.taptopay.data.thales.mapper.ThalesModelMapperKt.toThales(identityVerificationMethod);
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(identityVerificationMethod);
            this.getHighSpeedVideoFpsRanges = 1;
            if (onSelected.invoke(thales, this) == coroutine_suspended) {
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
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod identityVerificationMethod, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.data.thales.mapper.ThalesModelMapperKt$toOslo$2) create(identityVerificationMethod, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.taptopay.data.thales.mapper.ThalesModelMapperKt$toOslo$2 thalesModelMapperKt$toOslo$2 = new com.paypal.oslo.feature.taptopay.data.thales.mapper.ThalesModelMapperKt$toOslo$2(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        thalesModelMapperKt$toOslo$2.getHighSpeedVideoFpsRangesFor = obj;
        return thalesModelMapperKt$toOslo$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ThalesModelMapperKt$toOslo$2(com.paypal.android.taptopay.domain.model.card.AddCardState addCardState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.thales.mapper.ThalesModelMapperKt$toOslo$2> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = addCardState;
    }
}
