package com.paypal.oslo.feature.identity.login.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/data/repository/InContextLoginProviderImpl;", "Lcom/paypal/oslo/feature/identity/login/domain/repository/InContextLoginProvider;", "Lcom/paypal/oslo/feature/identity/storage/IdentityTokenStorage;", "identityTokenStorage", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "featureGate", "<init>", "(Lcom/paypal/oslo/feature/identity/storage/IdentityTokenStorage;Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;)V", "", "isInContextLoginEnabled", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/identity/storage/IdentityTokenStorage;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class InContextLoginProviderImpl implements com.paypal.oslo.feature.identity.login.domain.repository.InContextLoginProvider {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.contract.FeatureGate Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.storage.IdentityTokenStorage getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public InContextLoginProviderImpl(com.paypal.oslo.feature.identity.storage.IdentityTokenStorage identityTokenStorage, com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identityTokenStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        this.getHighSpeedVideoFpsRanges = identityTokenStorage;
        this.Camera2StreamConfigurationMap = featureGate;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        if ((r5 == null ? r5.getAuthenticationTier() : null) == com.paypal.oslo.feature.identity.foundation.model.AuthenticationTier.USER_ACCESS_TOKEN_LONG_LIVED_SESSION) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.identity.login.domain.repository.InContextLoginProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object isInContextLoginEnabled(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        com.paypal.oslo.feature.identity.login.data.repository.InContextLoginProviderImpl$isInContextLoginEnabled$1 inContextLoginProviderImpl$isInContextLoginEnabled$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.identity.login.data.repository.InContextLoginProviderImpl$isInContextLoginEnabled$1) {
            inContextLoginProviderImpl$isInContextLoginEnabled$1 = (com.paypal.oslo.feature.identity.login.data.repository.InContextLoginProviderImpl$isInContextLoginEnabled$1) continuation;
            if ((inContextLoginProviderImpl$isInContextLoginEnabled$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                inContextLoginProviderImpl$isInContextLoginEnabled$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = inContextLoginProviderImpl$isInContextLoginEnabled$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = inContextLoginProviderImpl$isInContextLoginEnabled$1.Camera2StreamConfigurationMap;
                boolean z = true;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (this.Camera2StreamConfigurationMap.checkGate(com.paypal.oslo.feature.identity.remoteconfig.AuthFeatureGates.INSTANCE.getNativeInContextLoginEnabled())) {
                        com.paypal.oslo.feature.identity.storage.IdentityTokenStorage identityTokenStorage = this.getHighSpeedVideoFpsRanges;
                        inContextLoginProviderImpl$isInContextLoginEnabled$1.Camera2StreamConfigurationMap = 1;
                        obj = identityTokenStorage.getUserAccessToken(inContextLoginProviderImpl$isInContextLoginEnabled$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    z = false;
                    return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
                }
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                com.paypal.oslo.feature.identity.storage.model.UserAccessTokenData userAccessTokenData = (com.paypal.oslo.feature.identity.storage.model.UserAccessTokenData) obj;
            }
        }
        inContextLoginProviderImpl$isInContextLoginEnabled$1 = new com.paypal.oslo.feature.identity.login.data.repository.InContextLoginProviderImpl$isInContextLoginEnabled$1(this, continuation);
        java.lang.Object obj2 = inContextLoginProviderImpl$isInContextLoginEnabled$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = inContextLoginProviderImpl$isInContextLoginEnabled$1.Camera2StreamConfigurationMap;
        boolean z2 = true;
        if (i != 0) {
        }
        com.paypal.oslo.feature.identity.storage.model.UserAccessTokenData userAccessTokenData2 = (com.paypal.oslo.feature.identity.storage.model.UserAccessTokenData) obj2;
    }
}
