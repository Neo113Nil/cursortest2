package com.paypal.oslo.feature.taptopay.domain.observer.paypal;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.domain.observer.paypal.PurgeCardDataOnCardDeletedObserver", f = "PurgeCardDataOnCardDeletedObserver.kt", i = {0}, l = {110}, m = "deleteCardArt", n = {"payPalCardId"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
final class PurgeCardDataOnCardDeletedObserver$deleteCardArt$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.observer.paypal.PurgeCardDataOnCardDeletedObserver getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.taptopay.domain.observer.paypal.PurgeCardDataOnCardDeletedObserver.access$deleteCardArt(this.getHighSpeedVideoFpsRanges, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PurgeCardDataOnCardDeletedObserver$deleteCardArt$1(com.paypal.oslo.feature.taptopay.domain.observer.paypal.PurgeCardDataOnCardDeletedObserver purgeCardDataOnCardDeletedObserver, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.domain.observer.paypal.PurgeCardDataOnCardDeletedObserver$deleteCardArt$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = purgeCardDataOnCardDeletedObserver;
    }
}
