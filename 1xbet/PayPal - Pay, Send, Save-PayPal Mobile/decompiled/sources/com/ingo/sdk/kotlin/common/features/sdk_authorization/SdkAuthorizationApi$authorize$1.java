package com.ingo.sdk.kotlin.common.features.sdk_authorization;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.ingo.sdk.kotlin.common.features.sdk_authorization.SdkAuthorizationApi", f = "SdkAuthorizationApi.kt", i = {0}, l = {125, 68}, m = com.paypal.oslo.feature.smartroute.analytics.SmartRouteAnalyticsConstants.Action.AUTHORIZE, n = {"url"}, s = {"L$0"})
/* loaded from: classes9.dex */
final class SdkAuthorizationApi$authorize$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.ingo.sdk.kotlin.common.features.sdk_authorization.SdkAuthorizationApi getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.authorize(null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SdkAuthorizationApi$authorize$1(com.ingo.sdk.kotlin.common.features.sdk_authorization.SdkAuthorizationApi sdkAuthorizationApi, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.features.sdk_authorization.SdkAuthorizationApi$authorize$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = sdkAuthorizationApi;
    }
}
