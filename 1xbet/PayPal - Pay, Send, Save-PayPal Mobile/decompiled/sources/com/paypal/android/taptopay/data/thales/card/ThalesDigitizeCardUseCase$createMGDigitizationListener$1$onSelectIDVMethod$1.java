package com.paypal.android.taptopay.data.thales.card;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/paypal/android/taptopay/domain/model/card/IdentityVerificationMethod;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase$createMGDigitizationListener$1$onSelectIDVMethod$1", f = "ThalesDigitizeCardUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class ThalesDigitizeCardUseCase$createMGDigitizationListener$1$onSelectIDVMethod$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.android.taptopay.domain.model.card.IdentityVerificationMethod, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.gemalto.mfs.mwsdk.mobilegateway.enrollment.IDVMethodSelector Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.Camera2StreamConfigurationMap.select(((com.paypal.android.taptopay.domain.model.card.IdentityVerificationMethod) this.getHighResolutionOutputSizeshNQ4ISI).getId());
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.android.taptopay.domain.model.card.IdentityVerificationMethod identityVerificationMethod, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase$createMGDigitizationListener$1$onSelectIDVMethod$1) create(identityVerificationMethod, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase$createMGDigitizationListener$1$onSelectIDVMethod$1 thalesDigitizeCardUseCase$createMGDigitizationListener$1$onSelectIDVMethod$1 = new com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase$createMGDigitizationListener$1$onSelectIDVMethod$1(this.Camera2StreamConfigurationMap, continuation);
        thalesDigitizeCardUseCase$createMGDigitizationListener$1$onSelectIDVMethod$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return thalesDigitizeCardUseCase$createMGDigitizationListener$1$onSelectIDVMethod$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ThalesDigitizeCardUseCase$createMGDigitizationListener$1$onSelectIDVMethod$1(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.IDVMethodSelector iDVMethodSelector, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase$createMGDigitizationListener$1$onSelectIDVMethod$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = iDVMethodSelector;
    }
}
