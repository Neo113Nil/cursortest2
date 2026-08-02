package com.paypal.oslo.feature.oneonboarding.data.repository;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/data/repository/PostAccountCreationHandler;", "", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/emitter/SignupPassiveLoginTokenEmitter;", "signupPassiveLoginTokenEmitter", "Lcom/paypal/oslo/feature/identity/api/IdentityManagement;", "identityManagement", "Lkotlinx/coroutines/CoroutineScope;", "applicationScope", "<init>", "(Lcom/paypal/oslo/feature/onboarding/api/signup/domain/emitter/SignupPassiveLoginTokenEmitter;Lcom/paypal/oslo/feature/identity/api/IdentityManagement;Lkotlinx/coroutines/CoroutineScope;)V", "Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationTokenFragment;", "tokenFragment", "", "handle", "(Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationTokenFragment;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/emitter/SignupPassiveLoginTokenEmitter;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/identity/api/IdentityManagement;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/CoroutineScope;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PostAccountCreationHandler {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.api.IdentityManagement getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.onboarding.api.signup.domain.emitter.SignupPassiveLoginTokenEmitter getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public PostAccountCreationHandler(com.paypal.oslo.feature.onboarding.api.signup.domain.emitter.SignupPassiveLoginTokenEmitter signupPassiveLoginTokenEmitter, com.paypal.oslo.feature.identity.api.IdentityManagement identityManagement, @com.paypal.oslo.core.di.annotations.IoApplicationScope kotlinx.coroutines.CoroutineScope coroutineScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signupPassiveLoginTokenEmitter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identityManagement, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.getHighResolutionOutputSizeshNQ4ISI = signupPassiveLoginTokenEmitter;
        this.getHighSpeedVideoFpsRangesFor = identityManagement;
        this.Camera2StreamConfigurationMap = coroutineScope;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object handle(com.paypal.oslo.api.graphql.shared.fragment.AuthenticationTokenFragment authenticationTokenFragment, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.oneonboarding.data.repository.PostAccountCreationHandler$handle$1 postAccountCreationHandler$handle$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.oneonboarding.data.repository.PostAccountCreationHandler$handle$1) {
            postAccountCreationHandler$handle$1 = (com.paypal.oslo.feature.oneonboarding.data.repository.PostAccountCreationHandler$handle$1) continuation;
            if ((postAccountCreationHandler$handle$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                postAccountCreationHandler$handle$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = postAccountCreationHandler$handle$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = postAccountCreationHandler$handle$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.onboarding.api.signup.domain.emitter.SignupPassiveLoginTokenEmitter signupPassiveLoginTokenEmitter = this.getHighResolutionOutputSizeshNQ4ISI;
                    postAccountCreationHandler$handle$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(authenticationTokenFragment);
                    postAccountCreationHandler$handle$1.getHighSpeedVideoFpsRangesFor = 1;
                    if (signupPassiveLoginTokenEmitter.emit(authenticationTokenFragment, postAccountCreationHandler$handle$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.Camera2StreamConfigurationMap, null, null, new com.paypal.oslo.feature.oneonboarding.data.repository.PostAccountCreationHandler$handle$2(this, null), 3, null);
                return kotlin.Unit.INSTANCE;
            }
        }
        postAccountCreationHandler$handle$1 = new com.paypal.oslo.feature.oneonboarding.data.repository.PostAccountCreationHandler$handle$1(this, continuation);
        java.lang.Object obj2 = postAccountCreationHandler$handle$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = postAccountCreationHandler$handle$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.Camera2StreamConfigurationMap, null, null, new com.paypal.oslo.feature.oneonboarding.data.repository.PostAccountCreationHandler$handle$2(this, null), 3, null);
        return kotlin.Unit.INSTANCE;
    }
}
