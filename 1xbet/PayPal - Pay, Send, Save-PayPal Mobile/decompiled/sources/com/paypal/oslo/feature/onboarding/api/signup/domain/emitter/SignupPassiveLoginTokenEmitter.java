package com.paypal.oslo.feature.onboarding.api.signup.domain.emitter;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/api/signup/domain/emitter/SignupPassiveLoginTokenEmitter;", "", "Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationTokenFragment;", "authenticationTokenFragment", "", "emit", "(Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationTokenFragment;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/SharedFlow;", "getAuthenticationTokenFragmentStream", "()Lkotlinx/coroutines/flow/SharedFlow;", "authenticationTokenFragmentStream"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface SignupPassiveLoginTokenEmitter {
    java.lang.Object emit(com.paypal.oslo.api.graphql.shared.fragment.AuthenticationTokenFragment authenticationTokenFragment, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.api.graphql.shared.fragment.AuthenticationTokenFragment> getAuthenticationTokenFragmentStream();
}
