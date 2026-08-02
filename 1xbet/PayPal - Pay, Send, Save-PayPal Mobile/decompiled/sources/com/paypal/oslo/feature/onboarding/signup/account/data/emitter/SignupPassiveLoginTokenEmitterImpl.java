package com.paypal.oslo.feature.onboarding.signup.account.data.emitter;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/account/data/emitter/SignupPassiveLoginTokenEmitterImpl;", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/emitter/SignupPassiveLoginTokenEmitter;", "<init>", "()V", "Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationTokenFragment;", "authenticationTokenFragment", "", "emit", "(Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationTokenFragment;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/SharedFlow;", "authenticationTokenFragmentStream", "Lkotlinx/coroutines/flow/SharedFlow;", "getAuthenticationTokenFragmentStream", "()Lkotlinx/coroutines/flow/SharedFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SignupPassiveLoginTokenEmitterImpl implements com.paypal.oslo.feature.onboarding.api.signup.domain.emitter.SignupPassiveLoginTokenEmitter {
    public static final int $stable = 8;
    private final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.api.graphql.shared.fragment.AuthenticationTokenFragment> authenticationTokenFragmentStream;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.api.graphql.shared.fragment.AuthenticationTokenFragment> getHighSpeedVideoSizes;

    @javax.inject.Inject
    public SignupPassiveLoginTokenEmitterImpl() {
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.api.graphql.shared.fragment.AuthenticationTokenFragment> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(1, 0, null, 4, null);
        this.getHighSpeedVideoSizes = MutableSharedFlow$default;
        this.authenticationTokenFragmentStream = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
    }

    @Override // com.paypal.oslo.feature.onboarding.api.signup.domain.emitter.SignupPassiveLoginTokenEmitter
    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.api.graphql.shared.fragment.AuthenticationTokenFragment> getAuthenticationTokenFragmentStream() {
        return this.authenticationTokenFragmentStream;
    }

    @Override // com.paypal.oslo.feature.onboarding.api.signup.domain.emitter.SignupPassiveLoginTokenEmitter
    public final java.lang.Object emit(com.paypal.oslo.api.graphql.shared.fragment.AuthenticationTokenFragment authenticationTokenFragment, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object emit = this.getHighSpeedVideoSizes.emit(authenticationTokenFragment, continuation);
        return emit == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : kotlin.Unit.INSTANCE;
    }
}
