package com.paypal.oslo.feature.taptopay.domain.observer.paypal;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.domain.observer.paypal.PurgeCardDataOnCardDeletedObserver$1$2", f = "PurgeCardDataOnCardDeletedObserver.kt", i = {0, 0, 1, 1, 2, 2}, l = {92, 93, 94}, m = "emit", n = {com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.DELETED, "payPalCardId", com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.DELETED, "payPalCardId", com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.DELETED, "payPalCardId"}, nl = {93, 94, 95}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"}, v = 2)
/* loaded from: classes15.dex */
final class PurgeCardDataOnCardDeletedObserver$1$2$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.observer.paypal.PurgeCardDataOnCardDeletedObserver.AnonymousClass1.AnonymousClass2<T> Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.emit(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PurgeCardDataOnCardDeletedObserver$1$2$emit$1(com.paypal.oslo.feature.taptopay.domain.observer.paypal.PurgeCardDataOnCardDeletedObserver.AnonymousClass1.AnonymousClass2<? super T> anonymousClass2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.domain.observer.paypal.PurgeCardDataOnCardDeletedObserver$1$2$emit$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = anonymousClass2;
    }
}
