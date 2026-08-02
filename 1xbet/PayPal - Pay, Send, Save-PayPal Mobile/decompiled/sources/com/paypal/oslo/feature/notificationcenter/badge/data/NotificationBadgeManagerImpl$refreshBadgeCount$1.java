package com.paypal.oslo.feature.notificationcenter.badge.data;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.notificationcenter.badge.data.NotificationBadgeManagerImpl", f = "NotificationBadgeManagerImpl.kt", i = {1, 1, 1, 1, 1, 1}, l = {105, 112}, m = "refreshBadgeCount", n = {"this_$iv", "it$iv", "$i$f$onRight", "$i$a$-also-Either$onRight$1$iv", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "$i$a$-onRight-NotificationBadgeManagerImpl$refreshBadgeCount$3"}, nl = {106, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE}, s = {"L$0", "L$2", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes5.dex */
final class NotificationBadgeManagerImpl$refreshBadgeCount$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.notificationcenter.badge.data.NotificationBadgeManagerImpl getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    int getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDuration = obj;
        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizesFor.refreshBadgeCount(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationBadgeManagerImpl$refreshBadgeCount$1(com.paypal.oslo.feature.notificationcenter.badge.data.NotificationBadgeManagerImpl notificationBadgeManagerImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.notificationcenter.badge.data.NotificationBadgeManagerImpl$refreshBadgeCount$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = notificationBadgeManagerImpl;
    }
}
