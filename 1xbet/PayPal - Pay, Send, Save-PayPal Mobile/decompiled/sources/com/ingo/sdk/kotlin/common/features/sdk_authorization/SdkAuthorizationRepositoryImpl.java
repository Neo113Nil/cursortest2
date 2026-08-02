package com.ingo.sdk.kotlin.common.features.sdk_authorization;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/sdk_authorization/SdkAuthorizationRepositoryImpl;", "Lcom/ingo/sdk/kotlin/common/features/sdk_authorization/SdkAuthorizationRepository;", "Lcom/ingo/sdk/kotlin/common/features/sdk_authorization/SdkAuthorizationApi;", "sdkAuthorizationApi", "<init>", "(Lcom/ingo/sdk/kotlin/common/features/sdk_authorization/SdkAuthorizationApi;)V", "", "ingoSdkVersion", "partnerAppName", "partnerAppVersion", "Lcom/ingo/sdk/kotlin/common/core/functional/Either;", "Lcom/ingo/sdk/kotlin/common/core/exception/Failure;", "", com.paypal.oslo.feature.smartroute.analytics.SmartRouteAnalyticsConstants.Action.AUTHORIZE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/ingo/sdk/kotlin/common/features/sdk_authorization/SdkAuthorizationApi;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SdkAuthorizationRepositoryImpl implements com.ingo.sdk.kotlin.common.features.sdk_authorization.SdkAuthorizationRepository {
    private final com.ingo.sdk.kotlin.common.features.sdk_authorization.SdkAuthorizationApi Camera2StreamConfigurationMap;

    public SdkAuthorizationRepositoryImpl(com.ingo.sdk.kotlin.common.features.sdk_authorization.SdkAuthorizationApi sdkAuthorizationApi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkAuthorizationApi, "");
        this.Camera2StreamConfigurationMap = sdkAuthorizationApi;
    }

    @Override // com.ingo.sdk.kotlin.common.features.sdk_authorization.SdkAuthorizationRepository
    public final java.lang.Object authorize(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.core.functional.Either<? extends com.ingo.sdk.kotlin.common.core.exception.Failure, ? extends java.lang.Object>> continuation) {
        return this.Camera2StreamConfigurationMap.authorize(str, str2, str3, continuation);
    }
}
