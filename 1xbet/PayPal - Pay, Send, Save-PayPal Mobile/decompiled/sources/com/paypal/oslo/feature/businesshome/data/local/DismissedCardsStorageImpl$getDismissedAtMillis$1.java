package com.paypal.oslo.feature.businesshome.data.local;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesshome.data.local.DismissedCardsStorageImpl", f = "DismissedCardsStorageImpl.kt", i = {0}, l = {27}, m = "getDismissedAtMillis", n = {"cardId"}, nl = {-1}, s = {"L$0"}, v = 2)
/* loaded from: classes5.dex */
final class DismissedCardsStorageImpl$getDismissedAtMillis$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.businesshome.data.local.DismissedCardsStorageImpl Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.getDismissedAtMillis(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DismissedCardsStorageImpl$getDismissedAtMillis$1(com.paypal.oslo.feature.businesshome.data.local.DismissedCardsStorageImpl dismissedCardsStorageImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesshome.data.local.DismissedCardsStorageImpl$getDismissedAtMillis$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = dismissedCardsStorageImpl;
    }
}
