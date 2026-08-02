package com.paypal.android.taptopay.data.thales.card;

@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.data.thales.card.ThalesCardRepository", f = "ThalesCardRepository.kt", i = {}, l = {androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_DIMENSION}, m = "isDefaultCard", n = {}, s = {})
/* loaded from: classes4.dex */
final class ThalesCardRepository$isDefaultCard$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.android.taptopay.data.thales.card.ThalesCardRepository getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.isDefaultCard(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ThalesCardRepository$isDefaultCard$1(com.paypal.android.taptopay.data.thales.card.ThalesCardRepository thalesCardRepository, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$isDefaultCard$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = thalesCardRepository;
    }
}
