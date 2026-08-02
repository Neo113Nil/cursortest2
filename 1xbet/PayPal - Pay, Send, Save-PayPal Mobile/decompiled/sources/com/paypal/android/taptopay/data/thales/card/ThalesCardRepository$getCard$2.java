package com.paypal.android.taptopay.data.thales.card;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "Lcom/paypal/android/taptopay/domain/Result;", "Lcom/paypal/android/taptopay/domain/model/card/DigitizedCard;", "Lcom/paypal/android/taptopay/domain/model/card/GetCardError;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$getCard$2", f = "ThalesCardRepository.kt", i = {}, l = {my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class ThalesCardRepository$getCard$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<? extends com.paypal.android.taptopay.domain.model.card.DigitizedCard, com.paypal.android.taptopay.domain.model.card.GetCardError>>, java.lang.Object> {
    final /* synthetic */ com.paypal.android.taptopay.data.thales.card.ThalesCardRepository Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            try {
                str = com.gemalto.mfs.mwsdk.dcm.DigitalizedCardManager.getTokenizedCardId(this.getHighResolutionOutputSizeshNQ4ISI);
            } catch (java.lang.Throwable unused) {
                str = null;
            }
            if (str == null) {
                return new com.paypal.android.taptopay.domain.Result.Failure(com.paypal.android.taptopay.domain.model.card.GetCardError.CardNotFound.INSTANCE);
            }
            this.getHighSpeedVideoFpsRanges = 1;
            obj = com.paypal.android.taptopay.data.thales.card.ThalesCardRepository.access$getThalesGetDigitizedCardUseCase(this.Camera2StreamConfigurationMap).invoke(str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return new com.paypal.android.taptopay.domain.Result.Success(obj);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<? extends com.paypal.android.taptopay.domain.model.card.DigitizedCard, com.paypal.android.taptopay.domain.model.card.GetCardError>> continuation) {
        return ((com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$getCard$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$getCard$2(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ThalesCardRepository$getCard$2(java.lang.String str, com.paypal.android.taptopay.data.thales.card.ThalesCardRepository thalesCardRepository, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$getCard$2> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.Camera2StreamConfigurationMap = thalesCardRepository;
    }
}
