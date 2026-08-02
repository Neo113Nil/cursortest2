package com.paypal.oslo.feature.businesshome.data.local;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesshome.data.local.DismissedCardsStorageImpl", f = "DismissedCardsStorageImpl.kt", i = {0, 0, 1, 1, 1, 1}, l = {19, 23}, m = "setDismissedCard", n = {"cardId", "dismissedAtMillis", "cardId", "currentDismissals", "jsonString", "dismissedAtMillis"}, nl = {20, 24}, s = {"L$0", "J$0", "L$0", "L$1", "L$2", "J$0"}, v = 2)
/* loaded from: classes5.dex */
final class DismissedCardsStorageImpl$setDismissedCard$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    long getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.businesshome.data.local.DismissedCardsStorageImpl getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDuration.setDismissedCard(null, 0L, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DismissedCardsStorageImpl$setDismissedCard$1(com.paypal.oslo.feature.businesshome.data.local.DismissedCardsStorageImpl dismissedCardsStorageImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesshome.data.local.DismissedCardsStorageImpl$setDismissedCard$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = dismissedCardsStorageImpl;
    }
}
