package com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.listener;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001BC\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/listener/PushSubscriptionStateObserver;", "Lcom/paypal/oslo/core/session/LogoutObserver;", "Lcom/paypal/oslo/core/identity/AuthStateProvider;", "authStateProvider", "Ldagger/Lazy;", "Lcom/paypal/oslo/core/pushnotification/domain/PushNotificationPermissionManager;", "permissionManager", "Lkotlinx/coroutines/CoroutineScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/usecase/SyncPushNotificationTokenUseCase;", "syncPushNotificationTokenUseCase", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/usecase/UpdateAdobePushConsentUseCase;", "updateAdobePushConsentUseCase", "<init>", "(Lcom/paypal/oslo/core/identity/AuthStateProvider;Ldagger/Lazy;Lkotlinx/coroutines/CoroutineScope;Ldagger/Lazy;Ldagger/Lazy;)V", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/identity/AuthStateProvider;", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "Ldagger/Lazy;", "Lkotlinx/coroutines/CoroutineScope;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PushSubscriptionStateObserver implements com.paypal.oslo.core.session.LogoutObserver {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final dagger.Lazy<com.paypal.oslo.core.pushnotification.domain.PushNotificationPermissionManager> getHighSpeedVideoFpsRanges;
    private final dagger.Lazy<com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.UpdateAdobePushConsentUseCase> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.identity.AuthStateProvider getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final dagger.Lazy<com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.SyncPushNotificationTokenUseCase> Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public PushSubscriptionStateObserver(com.paypal.oslo.core.identity.AuthStateProvider authStateProvider, dagger.Lazy<com.paypal.oslo.core.pushnotification.domain.PushNotificationPermissionManager> lazy, kotlinx.coroutines.CoroutineScope coroutineScope, dagger.Lazy<com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.SyncPushNotificationTokenUseCase> lazy2, dagger.Lazy<com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.UpdateAdobePushConsentUseCase> lazy3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authStateProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy3, "");
        this.getHighSpeedVideoFpsRangesFor = authStateProvider;
        this.getHighSpeedVideoFpsRanges = lazy;
        this.getHighSpeedVideoSizes = coroutineScope;
        this.Camera2StreamConfigurationMap = lazy2;
        this.getHighResolutionOutputSizeshNQ4ISI = lazy3;
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.listener.PushSubscriptionStateObserver$observeAuthAndPermissionState$1(this, null), 3, null);
    }
}
