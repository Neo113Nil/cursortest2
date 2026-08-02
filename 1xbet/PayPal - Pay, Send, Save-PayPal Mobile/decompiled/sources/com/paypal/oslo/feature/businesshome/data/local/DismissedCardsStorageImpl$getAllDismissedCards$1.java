package com.paypal.oslo.feature.businesshome.data.local;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesshome.data.local.DismissedCardsStorageImpl", f = "DismissedCardsStorageImpl.kt", i = {}, l = {31}, m = "getAllDismissedCards", n = {}, nl = {32}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class DismissedCardsStorageImpl$getAllDismissedCards$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.businesshome.data.local.DismissedCardsStorageImpl Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.getAllDismissedCards(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DismissedCardsStorageImpl$getAllDismissedCards$1(com.paypal.oslo.feature.businesshome.data.local.DismissedCardsStorageImpl dismissedCardsStorageImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesshome.data.local.DismissedCardsStorageImpl$getAllDismissedCards$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = dismissedCardsStorageImpl;
    }
}
