package com.paypal.oslo.feature.identity.login.data.observer;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/data/observer/SignupPassiveLoginTokenObserverImpl;", "Lcom/paypal/oslo/feature/identity/login/domain/observer/SignupPassiveLoginTokenObserver;", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/emitter/SignupPassiveLoginTokenEmitter;", "signupPassiveLoginTokenEmitter", "Lcom/paypal/oslo/feature/identity/storage/IdentityTokenStorage;", "tokenStorage", "Lcom/paypal/oslo/feature/identity/login/ElapsedRealtimeProvider;", "elapsedRealtimeProvider", "<init>", "(Lcom/paypal/oslo/feature/onboarding/api/signup/domain/emitter/SignupPassiveLoginTokenEmitter;Lcom/paypal/oslo/feature/identity/storage/IdentityTokenStorage;Lcom/paypal/oslo/feature/identity/login/ElapsedRealtimeProvider;)V", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/feature/identity/login/domain/observer/SignUpPassiveLoginEvent;", "observeUserAccessToken", "()Lkotlinx/coroutines/flow/Flow;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/emitter/SignupPassiveLoginTokenEmitter;", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/identity/storage/IdentityTokenStorage;", "Lcom/paypal/oslo/feature/identity/login/ElapsedRealtimeProvider;", "getHighSpeedVideoSizes", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/concurrent/atomic/AtomicBoolean;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SignupPassiveLoginTokenObserverImpl implements com.paypal.oslo.feature.identity.login.domain.observer.SignupPassiveLoginTokenObserver {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.identity.storage.IdentityTokenStorage Camera2StreamConfigurationMap;
    private final java.util.concurrent.atomic.AtomicBoolean getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.onboarding.api.signup.domain.emitter.SignupPassiveLoginTokenEmitter getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.login.ElapsedRealtimeProvider getHighSpeedVideoSizes;

    @javax.inject.Inject
    public SignupPassiveLoginTokenObserverImpl(com.paypal.oslo.feature.onboarding.api.signup.domain.emitter.SignupPassiveLoginTokenEmitter signupPassiveLoginTokenEmitter, com.paypal.oslo.feature.identity.storage.IdentityTokenStorage identityTokenStorage, com.paypal.oslo.feature.identity.login.ElapsedRealtimeProvider elapsedRealtimeProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signupPassiveLoginTokenEmitter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identityTokenStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elapsedRealtimeProvider, "");
        this.getHighSpeedVideoFpsRangesFor = signupPassiveLoginTokenEmitter;
        this.Camera2StreamConfigurationMap = identityTokenStorage;
        this.getHighSpeedVideoSizes = elapsedRealtimeProvider;
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    @Override // com.paypal.oslo.feature.identity.login.domain.observer.SignupPassiveLoginTokenObserver
    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.identity.login.domain.observer.SignUpPassiveLoginEvent> observeUserAccessToken() {
        return kotlinx.coroutines.flow.FlowKt.callbackFlow(new com.paypal.oslo.feature.identity.login.data.observer.SignupPassiveLoginTokenObserverImpl$observeUserAccessToken$1(this, null));
    }
}
