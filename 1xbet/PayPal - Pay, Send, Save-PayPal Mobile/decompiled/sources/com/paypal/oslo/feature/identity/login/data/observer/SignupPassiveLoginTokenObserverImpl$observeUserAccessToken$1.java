package com.paypal.oslo.feature.identity.login.data.observer;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/paypal/oslo/feature/identity/login/domain/observer/SignUpPassiveLoginEvent;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.login.data.observer.SignupPassiveLoginTokenObserverImpl$observeUserAccessToken$1", f = "SignupPassiveLoginTokenObserverImpl.kt", i = {0, 1}, l = {62, 100}, m = "invokeSuspend", n = {"$this$callbackFlow", "$this$callbackFlow"}, nl = {63, 104}, s = {"L$0", "L$0"}, v = 2)
/* loaded from: classes12.dex */
final class SignupPassiveLoginTokenObserverImpl$observeUserAccessToken$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.identity.login.domain.observer.SignUpPassiveLoginEvent>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.identity.login.data.observer.SignupPassiveLoginTokenObserverImpl getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        if (r0.send(com.paypal.oslo.feature.identity.login.domain.observer.SignUpPassiveLoginEvent.PassiveLoginObservationAlreadyStarted.INSTANCE, r12) != r1) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0094, code lost:
    
        if (kotlinx.coroutines.channels.ProduceKt.awaitClose(r0, new com.paypal.oslo.feature.identity.login.data.observer.SignupPassiveLoginTokenObserverImpl$observeUserAccessToken$1$$ExternalSyntheticLambda0(), r12) == r1) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        com.paypal.oslo.feature.onboarding.api.signup.domain.emitter.SignupPassiveLoginTokenEmitter signupPassiveLoginTokenEmitter;
        kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i != 0) {
            if (i == 1) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(producerScope, null, 1, null);
                return kotlin.Unit.INSTANCE;
            }
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.Unit.INSTANCE;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        atomicBoolean = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
        if (atomicBoolean.compareAndSet(false, true)) {
            signupPassiveLoginTokenEmitter = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor;
            kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.m24097catch(kotlinx.coroutines.flow.FlowKt.onEach(signupPassiveLoginTokenEmitter.getAuthenticationTokenFragmentStream(), new com.paypal.oslo.feature.identity.login.data.observer.SignupPassiveLoginTokenObserverImpl$observeUserAccessToken$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, producerScope, null)), new com.paypal.oslo.feature.identity.login.data.observer.SignupPassiveLoginTokenObserverImpl$observeUserAccessToken$1.AnonymousClass2(producerScope, null)), producerScope);
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(producerScope);
            this.getHighSpeedVideoSizes = 2;
        } else {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Signup token observation already started, skipping duplicate call", null, null, 6, null);
            this.Camera2StreamConfigurationMap = producerScope;
            this.getHighSpeedVideoSizes = 1;
        }
        return coroutine_suspended;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "authenticationTokenFragment", "Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationTokenFragment;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.login.data.observer.SignupPassiveLoginTokenObserverImpl$observeUserAccessToken$1$1", f = "SignupPassiveLoginTokenObserverImpl.kt", i = {0, 0, 1, 1}, l = {76, 85}, m = "invokeSuspend", n = {"authenticationTokenFragment", "tokenData", "authenticationTokenFragment", "tokenData"}, nl = {78, 86}, s = {"L$0", "L$1", "L$0", "L$1"}, v = 2)
    /* renamed from: com.paypal.oslo.feature.identity.login.data.observer.SignupPassiveLoginTokenObserverImpl$observeUserAccessToken$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.api.graphql.shared.fragment.AuthenticationTokenFragment, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        java.lang.Object Camera2StreamConfigurationMap;
        final /* synthetic */ com.paypal.oslo.feature.identity.login.data.observer.SignupPassiveLoginTokenObserverImpl getHighResolutionOutputSizeshNQ4ISI;
        /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
        final /* synthetic */ kotlinx.coroutines.channels.ProducerScope<com.paypal.oslo.feature.identity.login.domain.observer.SignUpPassiveLoginEvent> getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;

        /* JADX WARN: Code restructure failed: missing block: B:13:0x00b5, code lost:
        
            if (r14.getHighSpeedVideoFpsRangesFor.send(new com.paypal.oslo.feature.identity.login.domain.observer.SignUpPassiveLoginEvent.PassiveLoginSuccess(r2), r14) == r1) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x00bb, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:
        
            if (r15.saveUserAccessToken(r2, r14) != r1) goto L12;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.identity.login.ElapsedRealtimeProvider elapsedRealtimeProvider;
            com.paypal.oslo.feature.identity.storage.model.UserAccessTokenData userAccessTokenData;
            com.paypal.oslo.feature.identity.storage.IdentityTokenStorage identityTokenStorage;
            com.paypal.oslo.api.graphql.shared.fragment.AuthenticationTokenFragment authenticationTokenFragment = (com.paypal.oslo.api.graphql.shared.fragment.AuthenticationTokenFragment) this.getHighSpeedVideoFpsRanges;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoSizes;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                java.lang.String token = authenticationTokenFragment.getToken();
                com.paypal.oslo.feature.identity.foundation.model.AuthenticationTier authenticationTier = com.paypal.oslo.feature.identity.foundation.model.AuthenticationTier.USER_ACCESS_TOKEN_AUTHENTICATED_STATE;
                elapsedRealtimeProvider = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
                userAccessTokenData = new com.paypal.oslo.feature.identity.storage.model.UserAccessTokenData(token, authenticationTier, elapsedRealtimeProvider.elapsedRealtimeMillis() + (authenticationTokenFragment.getExpiresInSec() * 1000), null, 8, null);
                identityTokenStorage = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
                this.getHighSpeedVideoFpsRanges = authenticationTokenFragment;
                this.Camera2StreamConfigurationMap = userAccessTokenData;
                this.getHighSpeedVideoSizes = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                userAccessTokenData = (com.paypal.oslo.feature.identity.storage.model.UserAccessTokenData) this.Camera2StreamConfigurationMap;
                kotlin.ResultKt.throwOnFailure(obj);
            }
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Signup passive login token saved successfully", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("tokenLength", kotlin.coroutines.jvm.internal.Boxing.boxInt(authenticationTokenFragment.getToken().length())), kotlin.TuplesKt.to("authenticationTier", com.paypal.oslo.feature.identity.foundation.model.AuthenticationTier.USER_ACCESS_TOKEN_AUTHENTICATED_STATE.getValue())), null, 4, null);
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(authenticationTokenFragment);
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(userAccessTokenData);
            this.getHighSpeedVideoSizes = 2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.api.graphql.shared.fragment.AuthenticationTokenFragment authenticationTokenFragment, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.identity.login.data.observer.SignupPassiveLoginTokenObserverImpl$observeUserAccessToken$1.AnonymousClass1) create(authenticationTokenFragment, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.identity.login.data.observer.SignupPassiveLoginTokenObserverImpl$observeUserAccessToken$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.identity.login.data.observer.SignupPassiveLoginTokenObserverImpl$observeUserAccessToken$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
            anonymousClass1.getHighSpeedVideoFpsRanges = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(com.paypal.oslo.feature.identity.login.data.observer.SignupPassiveLoginTokenObserverImpl signupPassiveLoginTokenObserverImpl, kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.identity.login.domain.observer.SignUpPassiveLoginEvent> producerScope, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.login.data.observer.SignupPassiveLoginTokenObserverImpl$observeUserAccessToken$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighResolutionOutputSizeshNQ4ISI = signupPassiveLoginTokenObserverImpl;
            this.getHighSpeedVideoFpsRangesFor = producerScope;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/paypal/oslo/api/graphql/shared/fragment/AuthenticationTokenFragment;", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.login.data.observer.SignupPassiveLoginTokenObserverImpl$observeUserAccessToken$1$2", f = "SignupPassiveLoginTokenObserverImpl.kt", i = {0}, l = {96}, m = "invokeSuspend", n = {com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY}, nl = {97}, s = {"L$0"}, v = 2)
    /* renamed from: com.paypal.oslo.feature.identity.login.data.observer.SignupPassiveLoginTokenObserverImpl$observeUserAccessToken$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.api.graphql.shared.fragment.AuthenticationTokenFragment>, java.lang.Throwable, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ kotlinx.coroutines.channels.ProducerScope<com.paypal.oslo.feature.identity.login.domain.observer.SignUpPassiveLoginEvent> getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Throwable th = (java.lang.Throwable) this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoSizes;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.identity.LoggerKt.log;
                java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(th.getClass()).getSimpleName();
                if (simpleName == null) {
                    simpleName = "Unknown";
                }
                com.paypal.android.logger.Logger.e$default(logger, "Error in signup passive login token observation flow", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", simpleName)), null, th, 4, null);
                this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(th);
                this.getHighSpeedVideoSizes = 1;
                if (this.getHighSpeedVideoFpsRangesFor.send(new com.paypal.oslo.feature.identity.login.domain.observer.SignUpPassiveLoginEvent.PassiveLoginCanceled(th), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.api.graphql.shared.fragment.AuthenticationTokenFragment> flowCollector, java.lang.Throwable th, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            com.paypal.oslo.feature.identity.login.data.observer.SignupPassiveLoginTokenObserverImpl$observeUserAccessToken$1.AnonymousClass2 anonymousClass2 = new com.paypal.oslo.feature.identity.login.data.observer.SignupPassiveLoginTokenObserverImpl$observeUserAccessToken$1.AnonymousClass2(this.getHighSpeedVideoFpsRangesFor, continuation);
            anonymousClass2.getHighResolutionOutputSizeshNQ4ISI = th;
            return anonymousClass2.invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.identity.login.domain.observer.SignUpPassiveLoginEvent> producerScope, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.login.data.observer.SignupPassiveLoginTokenObserverImpl$observeUserAccessToken$1.AnonymousClass2> continuation) {
            super(3, continuation);
            this.getHighSpeedVideoFpsRangesFor = producerScope;
        }
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges() {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Signup passive login token observation flow closed", null, null, 6, null);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.identity.login.domain.observer.SignUpPassiveLoginEvent> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.login.data.observer.SignupPassiveLoginTokenObserverImpl$observeUserAccessToken$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.identity.login.data.observer.SignupPassiveLoginTokenObserverImpl$observeUserAccessToken$1 signupPassiveLoginTokenObserverImpl$observeUserAccessToken$1 = new com.paypal.oslo.feature.identity.login.data.observer.SignupPassiveLoginTokenObserverImpl$observeUserAccessToken$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        signupPassiveLoginTokenObserverImpl$observeUserAccessToken$1.Camera2StreamConfigurationMap = obj;
        return signupPassiveLoginTokenObserverImpl$observeUserAccessToken$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SignupPassiveLoginTokenObserverImpl$observeUserAccessToken$1(com.paypal.oslo.feature.identity.login.data.observer.SignupPassiveLoginTokenObserverImpl signupPassiveLoginTokenObserverImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.login.data.observer.SignupPassiveLoginTokenObserverImpl$observeUserAccessToken$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = signupPassiveLoginTokenObserverImpl;
    }
}
