package com.paypal.oslo.core.userstore;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.userstore.UserStoreImpl$observeAuthState$1", f = "UserStoreImpl.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class UserStoreImpl$observeAuthState$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.userstore.UserStoreImpl getHighResolutionOutputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.identity.AuthStateProvider authStateProvider;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.userstore.LoggerKt.log, "Started collecting auth state changes", null, null, 6, null);
            authStateProvider = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
            this.Camera2StreamConfigurationMap = 1;
            if (authStateProvider.getUserAccessTokenStateFlow().collect(new com.paypal.oslo.core.userstore.UserStoreImpl$observeAuthState$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new kotlin.KotlinNothingValueException();
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.core.userstore.UserStoreImpl$observeAuthState$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ com.paypal.oslo.core.userstore.UserStoreImpl getHighSpeedVideoFpsRanges;

        /* JADX WARN: Can't wrap try/catch for region: R(7:0|1|(2:3|(4:5|6|7|(1:(1:(1:(5:12|13|14|15|16)(2:19|20))(3:21|22|23))(3:26|27|28))(3:29|(1:31)(2:33|(1:35)(2:37|38))|25)))|43|6|7|(0)(0)) */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00d0, code lost:
        
            if (r14 == r1) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x008f, code lost:
        
            if (r14 != r1) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00b5, code lost:
        
            if (r15 != r1) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00d3, code lost:
        
            r14 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00d4, code lost:
        
            com.paypal.oslo.core.userstore.LoggerKt.log.e("Failed to refresh user profile from auth observer", r14);
            r14 = kotlin.Unit.INSTANCE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00de, code lost:
        
            r14 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00df, code lost:
        
            com.paypal.oslo.core.userstore.LoggerKt.log.e("Failed to refresh user profile from auth observer", r14);
            r14 = kotlin.Unit.INSTANCE;
         */
        /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object emit(com.paypal.oslo.core.identity.UserAccessTokenState userAccessTokenState, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            com.paypal.oslo.core.userstore.UserStoreImpl$observeAuthState$1$1$emit$1 userStoreImpl$observeAuthState$1$1$emit$1;
            int i;
            java.lang.Object highSpeedVideoSizes;
            java.lang.Object highSpeedVideoSizes2;
            java.lang.Object highSpeedVideoSizes3;
            if (continuation instanceof com.paypal.oslo.core.userstore.UserStoreImpl$observeAuthState$1$1$emit$1) {
                userStoreImpl$observeAuthState$1$1$emit$1 = (com.paypal.oslo.core.userstore.UserStoreImpl$observeAuthState$1$1$emit$1) continuation;
                if ((userStoreImpl$observeAuthState$1$1$emit$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                    userStoreImpl$observeAuthState$1$1$emit$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                    java.lang.Object obj = userStoreImpl$observeAuthState$1$1$emit$1.Camera2StreamConfigurationMap;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = userStoreImpl$observeAuthState$1$1$emit$1.getHighSpeedVideoFpsRangesFor;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.userstore.LoggerKt.log, "Auth token state changed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("token_state", userAccessTokenState.toString())), null, 4, null);
                        if (kotlin.jvm.internal.Intrinsics.areEqual(userAccessTokenState, com.paypal.oslo.core.identity.UserAccessTokenState.None.INSTANCE)) {
                            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.userstore.LoggerKt.log, "Auth token cleared, user logged out", null, null, 6, null);
                            com.paypal.oslo.core.userstore.UserStoreImpl userStoreImpl = this.getHighSpeedVideoFpsRanges;
                            com.paypal.oslo.core.userstore.model.UserState.LoggedOut loggedOut = com.paypal.oslo.core.userstore.model.UserState.LoggedOut.INSTANCE;
                            userStoreImpl$observeAuthState$1$1$emit$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(userAccessTokenState);
                            userStoreImpl$observeAuthState$1$1$emit$1.getHighSpeedVideoFpsRangesFor = 1;
                            highSpeedVideoSizes2 = userStoreImpl.getHighSpeedVideoSizes(loggedOut, (kotlin.coroutines.Continuation<? super kotlin.Unit>) userStoreImpl$observeAuthState$1$1$emit$1);
                        } else {
                            if (!(userAccessTokenState instanceof com.paypal.oslo.core.identity.UserAccessTokenState.Exists)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.userstore.LoggerKt.log, "Auth token exists, user logged in", null, null, 6, null);
                            com.paypal.oslo.core.userstore.UserStoreImpl userStoreImpl2 = this.getHighSpeedVideoFpsRanges;
                            com.paypal.oslo.core.userstore.model.UserState.LoggedIn loggedIn = com.paypal.oslo.core.userstore.model.UserState.LoggedIn.INSTANCE;
                            userStoreImpl$observeAuthState$1$1$emit$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(userAccessTokenState);
                            userStoreImpl$observeAuthState$1$1$emit$1.getHighSpeedVideoFpsRangesFor = 2;
                            highSpeedVideoSizes = userStoreImpl2.getHighSpeedVideoSizes(loggedIn, (kotlin.coroutines.Continuation<? super kotlin.Unit>) userStoreImpl$observeAuthState$1$1$emit$1);
                        }
                        return coroutine_suspended;
                    }
                    if (i == 1) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    if (i != 2) {
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    userAccessTokenState = (com.paypal.oslo.core.identity.UserAccessTokenState) userStoreImpl$observeAuthState$1$1$emit$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.userstore.LoggerKt.log, "Fetching user profile", null, null, 6, null);
                    com.paypal.oslo.core.userstore.UserStoreImpl userStoreImpl3 = this.getHighSpeedVideoFpsRanges;
                    userStoreImpl$observeAuthState$1$1$emit$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(userAccessTokenState);
                    userStoreImpl$observeAuthState$1$1$emit$1.getHighSpeedVideoFpsRangesFor = 3;
                    highSpeedVideoSizes3 = userStoreImpl3.getHighSpeedVideoSizes(com.apollographql.apollo.cache.normalized.FetchPolicy.CacheFirst, null, userStoreImpl$observeAuthState$1$1$emit$1);
                }
            }
            userStoreImpl$observeAuthState$1$1$emit$1 = new com.paypal.oslo.core.userstore.UserStoreImpl$observeAuthState$1$1$emit$1(this, continuation);
            java.lang.Object obj2 = userStoreImpl$observeAuthState$1$1$emit$1.Camera2StreamConfigurationMap;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = userStoreImpl$observeAuthState$1$1$emit$1.getHighSpeedVideoFpsRangesFor;
            if (i != 0) {
            }
        }

        AnonymousClass1(com.paypal.oslo.core.userstore.UserStoreImpl userStoreImpl) {
            this.getHighSpeedVideoFpsRanges = userStoreImpl;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.core.userstore.UserStoreImpl$observeAuthState$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.core.userstore.UserStoreImpl$observeAuthState$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserStoreImpl$observeAuthState$1(com.paypal.oslo.core.userstore.UserStoreImpl userStoreImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.userstore.UserStoreImpl$observeAuthState$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = userStoreImpl;
    }
}
