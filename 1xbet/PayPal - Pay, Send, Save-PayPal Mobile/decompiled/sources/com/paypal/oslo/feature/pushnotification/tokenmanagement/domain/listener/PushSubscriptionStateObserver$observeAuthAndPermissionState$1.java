package com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.listener;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.listener.PushSubscriptionStateObserver$observeAuthAndPermissionState$1", f = "PushSubscriptionStateObserver.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, nl = {151}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class PushSubscriptionStateObserver$observeAuthAndPermissionState$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.listener.PushSubscriptionStateObserver getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.identity.AuthStateProvider authStateProvider;
        dagger.Lazy lazy;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            authStateProvider = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
            kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.core.identity.UserAccessTokenState> userAccessTokenStateFlow = authStateProvider.getUserAccessTokenStateFlow();
            lazy = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (kotlinx.coroutines.flow.FlowKt.combine(userAccessTokenStateFlow, ((com.paypal.oslo.core.pushnotification.domain.PushNotificationPermissionManager) lazy.get()).getPermissionStateFlow(), new com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.listener.PushSubscriptionStateObserver$observeAuthAndPermissionState$1.AnonymousClass1(null)).collect(new com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.listener.PushSubscriptionStateObserver$observeAuthAndPermissionState$1.AnonymousClass2(this.getHighSpeedVideoFpsRanges), this) == coroutine_suspended) {
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

    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/listener/AuthAndPermissionState;", "authState", "Lcom/paypal/oslo/core/identity/UserAccessTokenState;", "permissionGranted", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.listener.PushSubscriptionStateObserver$observeAuthAndPermissionState$1$1", f = "PushSubscriptionStateObserver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.listener.PushSubscriptionStateObserver$observeAuthAndPermissionState$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<com.paypal.oslo.core.identity.UserAccessTokenState, java.lang.Boolean, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.listener.AuthAndPermissionState>, java.lang.Object> {
        /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges;
        /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.core.identity.UserAccessTokenState userAccessTokenState = (com.paypal.oslo.core.identity.UserAccessTokenState) this.getHighSpeedVideoSizes;
            boolean z = this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoFpsRanges != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return new com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.listener.AuthAndPermissionState(userAccessTokenState, z);
        }

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.core.identity.UserAccessTokenState userAccessTokenState, java.lang.Boolean bool, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.listener.AuthAndPermissionState> continuation) {
            boolean booleanValue = bool.booleanValue();
            com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.listener.PushSubscriptionStateObserver$observeAuthAndPermissionState$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.listener.PushSubscriptionStateObserver$observeAuthAndPermissionState$1.AnonymousClass1(continuation);
            anonymousClass1.getHighSpeedVideoSizes = userAccessTokenState;
            anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = booleanValue;
            return anonymousClass1.invokeSuspend(kotlin.Unit.INSTANCE);
        }

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.listener.PushSubscriptionStateObserver$observeAuthAndPermissionState$1.AnonymousClass1> continuation) {
            super(3, continuation);
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.listener.PushSubscriptionStateObserver$observeAuthAndPermissionState$1$2, reason: invalid class name */
    static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.listener.PushSubscriptionStateObserver getHighSpeedVideoSizes;

        /* JADX WARN: Removed duplicated region for block: B:16:0x00b5 A[Catch: all -> 0x003d, CancellationException -> 0x0151, TRY_ENTER, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0151, blocks: (B:12:0x0039, B:13:0x00af, B:16:0x00b5, B:22:0x00cf, B:23:0x0101, B:24:0x0106, B:32:0x004f, B:35:0x0078, B:39:0x010b, B:41:0x0113, B:42:0x0120, B:43:0x0125), top: B:7:0x002e }] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00cb  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object emit(com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.listener.AuthAndPermissionState authAndPermissionState, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.listener.PushSubscriptionStateObserver$observeAuthAndPermissionState$1$2$emit$1 pushSubscriptionStateObserver$observeAuthAndPermissionState$1$2$emit$1;
            int i;
            com.paypal.oslo.core.identity.UserAccessTokenState userAccessTokenState;
            boolean z;
            java.lang.Throwable th;
            dagger.Lazy lazy;
            dagger.Lazy lazy2;
            arrow.core.Either either;
            try {
                if (continuation instanceof com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.listener.PushSubscriptionStateObserver$observeAuthAndPermissionState$1$2$emit$1) {
                    pushSubscriptionStateObserver$observeAuthAndPermissionState$1$2$emit$1 = (com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.listener.PushSubscriptionStateObserver$observeAuthAndPermissionState$1$2$emit$1) continuation;
                    if ((pushSubscriptionStateObserver$observeAuthAndPermissionState$1$2$emit$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                        pushSubscriptionStateObserver$observeAuthAndPermissionState$1$2$emit$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                        java.lang.Object obj = pushSubscriptionStateObserver$observeAuthAndPermissionState$1$2$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = pushSubscriptionStateObserver$observeAuthAndPermissionState$1$2$emit$1.getHighSpeedVideoFpsRangesFor;
                        if (i != 0) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            userAccessTokenState = authAndPermissionState.getHighSpeedVideoFpsRanges;
                            z = authAndPermissionState.getHighSpeedVideoSizes;
                            try {
                                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.pushnotification.LoggerKt.log, "Auth or permission state changed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("auth_state", userAccessTokenState.toString()), kotlin.TuplesKt.to("permission_granted", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z))), null, 4, null);
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.pushnotification.LoggerKt.log, "Error processing state change - continuing observation", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("auth_state", userAccessTokenState.toString()), kotlin.TuplesKt.to("permission_granted", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z))), null, th, 4, null);
                                return kotlin.Unit.INSTANCE;
                            }
                            if (userAccessTokenState instanceof com.paypal.oslo.core.identity.UserAccessTokenState.Exists) {
                                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.pushnotification.LoggerKt.log, "User authenticated - syncing push token and permission state", null, null, 6, null);
                                lazy = this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI;
                                ((com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.UpdateAdobePushConsentUseCase) lazy.get()).invoke();
                                lazy2 = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap;
                                com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.SyncPushNotificationTokenUseCase syncPushNotificationTokenUseCase = (com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase.SyncPushNotificationTokenUseCase) lazy2.get();
                                pushSubscriptionStateObserver$observeAuthAndPermissionState$1$2$emit$1.getHighSpeedVideoSizes = userAccessTokenState;
                                pushSubscriptionStateObserver$observeAuthAndPermissionState$1$2$emit$1.getHighSpeedVideoFpsRanges = z;
                                pushSubscriptionStateObserver$observeAuthAndPermissionState$1$2$emit$1.getHighSpeedVideoFpsRangesFor = 1;
                                java.lang.Object invoke = syncPushNotificationTokenUseCase.invoke(pushSubscriptionStateObserver$observeAuthAndPermissionState$1$2$emit$1);
                                if (invoke == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                obj = invoke;
                            } else {
                                if (!kotlin.jvm.internal.Intrinsics.areEqual(userAccessTokenState, com.paypal.oslo.core.identity.UserAccessTokenState.None.INSTANCE)) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.pushnotification.LoggerKt.log, "User not authenticated - skipping sync", null, null, 6, null);
                                return kotlin.Unit.INSTANCE;
                            }
                        } else {
                            if (i != 1) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            boolean z2 = pushSubscriptionStateObserver$observeAuthAndPermissionState$1$2$emit$1.getHighSpeedVideoFpsRanges;
                            com.paypal.oslo.core.identity.UserAccessTokenState userAccessTokenState2 = (com.paypal.oslo.core.identity.UserAccessTokenState) pushSubscriptionStateObserver$observeAuthAndPermissionState$1$2$emit$1.getHighSpeedVideoSizes;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj);
                            } catch (java.lang.Throwable th3) {
                                th = th3;
                                userAccessTokenState = userAccessTokenState2;
                                z = z2;
                                com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.pushnotification.LoggerKt.log, "Error processing state change - continuing observation", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("auth_state", userAccessTokenState.toString()), kotlin.TuplesKt.to("permission_granted", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z))), null, th, 4, null);
                                return kotlin.Unit.INSTANCE;
                            }
                        }
                        either = (arrow.core.Either) obj;
                        if (!(either instanceof arrow.core.Either.Right)) {
                            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.pushnotification.LoggerKt.log, "Push token and permission state synced successfully", null, null, 6, null);
                        } else if (either instanceof arrow.core.Either.Left) {
                            com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.error.PushNotificationTokenError pushNotificationTokenError = (com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.error.PushNotificationTokenError) ((arrow.core.Either.Left) either).getValue();
                            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.pushnotification.LoggerKt.log, "Failed to sync push token", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.ERROR_TYPE, pushNotificationTokenError.getName()), kotlin.TuplesKt.to("error", pushNotificationTokenError.toString())), null, 4, null);
                        } else {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                }
                if (i != 0) {
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                }
                return kotlin.Unit.INSTANCE;
            } catch (java.util.concurrent.CancellationException e) {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.pushnotification.LoggerKt.log, "Subscription state observer cancelled", null, null, 6, null);
                throw e;
            }
            pushSubscriptionStateObserver$observeAuthAndPermissionState$1$2$emit$1 = new com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.listener.PushSubscriptionStateObserver$observeAuthAndPermissionState$1$2$emit$1(this, continuation);
            java.lang.Object obj2 = pushSubscriptionStateObserver$observeAuthAndPermissionState$1$2$emit$1.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = pushSubscriptionStateObserver$observeAuthAndPermissionState$1$2$emit$1.getHighSpeedVideoFpsRangesFor;
        }

        AnonymousClass2(com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.listener.PushSubscriptionStateObserver pushSubscriptionStateObserver) {
            this.getHighSpeedVideoSizes = pushSubscriptionStateObserver;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.listener.PushSubscriptionStateObserver$observeAuthAndPermissionState$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.listener.PushSubscriptionStateObserver$observeAuthAndPermissionState$1(this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PushSubscriptionStateObserver$observeAuthAndPermissionState$1(com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.listener.PushSubscriptionStateObserver pushSubscriptionStateObserver, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.listener.PushSubscriptionStateObserver$observeAuthAndPermissionState$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = pushSubscriptionStateObserver;
    }
}
