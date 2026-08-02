package com.paypal.oslo.feature.taptopay.data.observer.auth;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0001\u0018\u00002\u00020\u0001BC\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0018\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001eR\u0014\u0010\u0015\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010 R\u0014\u0010\"\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010!"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/observer/auth/TapToPaySwitchUserObserver;", "Lcom/paypal/oslo/core/session/LogoutObserver;", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/device/IsNfcSupportedUseCase;", "isNfcSupportedUseCase", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalWipeAllTokensUseCase;", "wipeAllTokensUseCase", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalCloseCardsUseCase;", "closeCardsUseCase", "Lcom/paypal/oslo/feature/taptopay/data/worker/paypal/BackgroundSyncWorkerCanceller;", "backgroundSyncWorkerCanceller", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalSyncAllFailedNotifyCallsUseCase;", "syncFailedNotifyCallsUseCase", "Lkotlinx/coroutines/CoroutineScope;", "applicationScope", "<init>", "(Lcom/paypal/oslo/core/userstore/UserStore;Lcom/paypal/oslo/feature/taptopay/domain/usecase/device/IsNfcSupportedUseCase;Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalWipeAllTokensUseCase;Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalCloseCardsUseCase;Lcom/paypal/oslo/feature/taptopay/data/worker/paypal/BackgroundSyncWorkerCanceller;Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalSyncAllFailedNotifyCallsUseCase;Lkotlinx/coroutines/CoroutineScope;)V", "", "Camera2StreamConfigurationMap", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOutputFormats", "Lcom/paypal/oslo/core/userstore/UserStore;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/device/IsNfcSupportedUseCase;", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalWipeAllTokensUseCase;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalCloseCardsUseCase;", "Lcom/paypal/oslo/feature/taptopay/data/worker/paypal/BackgroundSyncWorkerCanceller;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalSyncAllFailedNotifyCallsUseCase;", "Lkotlinx/coroutines/CoroutineScope;", "getOutputMinFrameDuration"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TapToPaySwitchUserObserver implements com.paypal.oslo.core.session.LogoutObserver {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalSyncAllFailedNotifyCallsUseCase getOutputFormats;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalCloseCardsUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.device.IsNfcSupportedUseCase Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.data.worker.paypal.BackgroundSyncWorkerCanceller getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalWipeAllTokensUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.core.userstore.UserStore getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public TapToPaySwitchUserObserver(com.paypal.oslo.core.userstore.UserStore userStore, com.paypal.oslo.feature.taptopay.domain.usecase.device.IsNfcSupportedUseCase isNfcSupportedUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalWipeAllTokensUseCase payPalWipeAllTokensUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalCloseCardsUseCase payPalCloseCardsUseCase, com.paypal.oslo.feature.taptopay.data.worker.paypal.BackgroundSyncWorkerCanceller backgroundSyncWorkerCanceller, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalSyncAllFailedNotifyCallsUseCase payPalSyncAllFailedNotifyCallsUseCase, @com.paypal.oslo.core.di.annotations.IoApplicationScope kotlinx.coroutines.CoroutineScope coroutineScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(isNfcSupportedUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalWipeAllTokensUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalCloseCardsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backgroundSyncWorkerCanceller, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalSyncAllFailedNotifyCallsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.getHighResolutionOutputSizeshNQ4ISI = userStore;
        this.Camera2StreamConfigurationMap = isNfcSupportedUseCase;
        this.getHighSpeedVideoFpsRangesFor = payPalWipeAllTokensUseCase;
        this.getHighSpeedVideoFpsRanges = payPalCloseCardsUseCase;
        this.getHighSpeedVideoSizes = backgroundSyncWorkerCanceller;
        this.getOutputFormats = payPalSyncAllFailedNotifyCallsUseCase;
        this.getOutputMinFrameDuration = coroutineScope;
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPaySwitchUserObserver.AnonymousClass1(null), 3, null);
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPaySwitchUserObserver$1", f = "TapToPaySwitchUserObserver.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, nl = {79}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPaySwitchUserObserver$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int getHighResolutionOutputSizeshNQ4ISI;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                if (com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPaySwitchUserObserver.this.Camera2StreamConfigurationMap.invoke()) {
                    final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.core.userstore.model.UserState> userState = com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPaySwitchUserObserver.this.getHighResolutionOutputSizeshNQ4ISI.getUserState();
                    kotlinx.coroutines.flow.Flow distinctUntilChanged = kotlinx.coroutines.flow.FlowKt.distinctUntilChanged(new kotlinx.coroutines.flow.Flow<java.lang.Boolean>() { // from class: com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPaySwitchUserObserver$1$invokeSuspend$$inlined$map$1

                        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                        /* renamed from: com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPaySwitchUserObserver$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                            final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighSpeedVideoSizes;

                            /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
                            /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                                com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPaySwitchUserObserver$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                                int i;
                                if (continuation instanceof com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPaySwitchUserObserver$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                                    anonymousClass1 = (com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPaySwitchUserObserver$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                                    if ((anonymousClass1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.getOutputMinFrameDuration -= 2147483648;
                                        java.lang.Object obj2 = anonymousClass1.getHighSpeedVideoSizesFor;
                                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        i = anonymousClass1.getOutputMinFrameDuration;
                                        if (i != 0) {
                                            kotlin.ResultKt.throwOnFailure(obj2);
                                            kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighSpeedVideoSizes;
                                            com.paypal.oslo.core.userstore.model.UserState userState = (com.paypal.oslo.core.userstore.model.UserState) obj;
                                            java.lang.Boolean boxBoolean = kotlin.coroutines.jvm.internal.Boxing.boxBoolean((userState instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) && ((com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) userState).getIntent() == com.paypal.oslo.core.userstore.model.ProfileIntent.SWITCH_ACCOUNT);
                                            anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                            anonymousClass1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                            anonymousClass1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                            anonymousClass1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                            anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = 0;
                                            anonymousClass1.getOutputMinFrameDuration = 1;
                                            if (flowCollector.emit(boxBoolean, anonymousClass1) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        } else {
                                            if (i != 1) {
                                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            int i2 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                                            java.lang.Object obj3 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                                            java.lang.Object obj4 = anonymousClass1.Camera2StreamConfigurationMap;
                                            kotlin.ResultKt.throwOnFailure(obj2);
                                        }
                                        return kotlin.Unit.INSTANCE;
                                    }
                                }
                                anonymousClass1 = new com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPaySwitchUserObserver$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                                java.lang.Object obj22 = anonymousClass1.getHighSpeedVideoSizesFor;
                                java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                i = anonymousClass1.getOutputMinFrameDuration;
                                if (i != 0) {
                                }
                                return kotlin.Unit.INSTANCE;
                            }

                            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPaySwitchUserObserver$1$invokeSuspend$$inlined$map$1$2", f = "TapToPaySwitchUserObserver.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, nl = {49}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                            /* renamed from: com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPaySwitchUserObserver$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                                java.lang.Object Camera2StreamConfigurationMap;
                                int getHighResolutionOutputSizeshNQ4ISI;
                                java.lang.Object getHighSpeedVideoFpsRanges;
                                java.lang.Object getHighSpeedVideoFpsRangesFor;
                                java.lang.Object getHighSpeedVideoSizes;
                                /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
                                int getOutputMinFrameDuration;

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                    this.getHighSpeedVideoSizesFor = obj;
                                    this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
                                    return com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPaySwitchUserObserver$1$invokeSuspend$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                                }

                                public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                                    super(continuation);
                                }
                            }

                            public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                                this.getHighSpeedVideoSizes = flowCollector;
                            }
                        }

                        @Override // kotlinx.coroutines.flow.Flow
                        public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.lang.Boolean> flowCollector, kotlin.coroutines.Continuation continuation) {
                            java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPaySwitchUserObserver$1$invokeSuspend$$inlined$map$1.AnonymousClass2(flowCollector), continuation);
                            return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
                        }
                    });
                    final com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPaySwitchUserObserver tapToPaySwitchUserObserver = com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPaySwitchUserObserver.this;
                    this.getHighResolutionOutputSizeshNQ4ISI = 1;
                    if (distinctUntilChanged.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPaySwitchUserObserver.1.2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                            if (((java.lang.Boolean) obj2).booleanValue()) {
                                java.lang.Object Camera2StreamConfigurationMap = com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPaySwitchUserObserver.this.Camera2StreamConfigurationMap(continuation);
                                return Camera2StreamConfigurationMap == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? Camera2StreamConfigurationMap : kotlin.Unit.INSTANCE;
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "TapToPay switch user observer skipped: NFC not supported", null, null, 6, null);
                    return kotlin.Unit.INSTANCE;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPaySwitchUserObserver.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPaySwitchUserObserver.this.new AnonymousClass1(continuation);
        }

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPaySwitchUserObserver.AnonymousClass1> continuation) {
            super(2, continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(1:(5:12|13|14|15|16)(2:19|20))(5:21|22|23|24|25))(2:33|34))(2:39|40)|35|36))|56|6|7|(0)(0)|35|36|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0158, code lost:
    
        if (r3.invoke(r5) == r6) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x015a, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0100, code lost:
    
        if (r4.invoke(r5) != r6) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c7, code lost:
    
        if (r7.invoke(r5) == r6) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0077, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0173, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0072, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0103, code lost:
    
        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Failed during switch user cleanup", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, r3)), null, r0, 4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0052, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0170, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x004e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x015b, code lost:
    
        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Failed during switch user cleanup", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, r2)), null, r0, 4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0174, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0175, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00cb, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00cc, code lost:
    
        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Failed during switch user cleanup", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, r4)), null, r0, 4, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0103 -> B:23:0x0118). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object Camera2StreamConfigurationMap(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPaySwitchUserObserver$handleSwitchUser$1 tapToPaySwitchUserObserver$handleSwitchUser$1;
        int i;
        java.lang.String str = "sync_failed_notify_calls";
        java.lang.String str2 = "close_cards";
        java.lang.String str3 = "wipe_all_tokens";
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPaySwitchUserObserver$handleSwitchUser$1) {
            tapToPaySwitchUserObserver$handleSwitchUser$1 = (com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPaySwitchUserObserver$handleSwitchUser$1) continuation;
            if ((tapToPaySwitchUserObserver$handleSwitchUser$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                tapToPaySwitchUserObserver$handleSwitchUser$1.getOutputFormats -= 2147483648;
                java.lang.Object obj = tapToPaySwitchUserObserver$handleSwitchUser$1.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = tapToPaySwitchUserObserver$handleSwitchUser$1.getOutputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "TapToPay switch user detected", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("action", "cleaning_up_and_resyncing")), null, 4, null);
                    com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalWipeAllTokensUseCase payPalWipeAllTokensUseCase = this.getHighSpeedVideoFpsRangesFor;
                    tapToPaySwitchUserObserver$handleSwitchUser$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(this);
                    tapToPaySwitchUserObserver$handleSwitchUser$1.Camera2StreamConfigurationMap = "wipe_all_tokens";
                    tapToPaySwitchUserObserver$handleSwitchUser$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(tapToPaySwitchUserObserver$handleSwitchUser$1);
                    tapToPaySwitchUserObserver$handleSwitchUser$1.getHighSpeedVideoFpsRanges = 0;
                    tapToPaySwitchUserObserver$handleSwitchUser$1.getHighSpeedVideoFpsRangesFor = 0;
                    tapToPaySwitchUserObserver$handleSwitchUser$1.getOutputFormats = 1;
                } else if (i == 1) {
                    int i2 = tapToPaySwitchUserObserver$handleSwitchUser$1.getHighSpeedVideoFpsRangesFor;
                    int i3 = tapToPaySwitchUserObserver$handleSwitchUser$1.getHighSpeedVideoFpsRanges;
                    str3 = (java.lang.String) tapToPaySwitchUserObserver$handleSwitchUser$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i4 = tapToPaySwitchUserObserver$handleSwitchUser$1.getHighSpeedVideoFpsRangesFor;
                        int i5 = tapToPaySwitchUserObserver$handleSwitchUser$1.getHighSpeedVideoFpsRanges;
                        str = (java.lang.String) tapToPaySwitchUserObserver$handleSwitchUser$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    int i6 = tapToPaySwitchUserObserver$handleSwitchUser$1.getHighSpeedVideoFpsRangesFor;
                    int i7 = tapToPaySwitchUserObserver$handleSwitchUser$1.getHighSpeedVideoFpsRanges;
                    str2 = (java.lang.String) tapToPaySwitchUserObserver$handleSwitchUser$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    try {
                        com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPaySwitchUserObserver$handleSwitchUser$1 tapToPaySwitchUserObserver$handleSwitchUser$12 = tapToPaySwitchUserObserver$handleSwitchUser$1;
                        this.getHighSpeedVideoSizes.invoke();
                    } catch (java.util.concurrent.CancellationException e) {
                        throw e;
                    } catch (java.lang.Throwable th) {
                        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Failed during switch user cleanup", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "cancel_background_sync")), null, th, 4, null);
                    }
                    com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalSyncAllFailedNotifyCallsUseCase payPalSyncAllFailedNotifyCallsUseCase = this.getOutputFormats;
                    tapToPaySwitchUserObserver$handleSwitchUser$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(this);
                    tapToPaySwitchUserObserver$handleSwitchUser$1.Camera2StreamConfigurationMap = "sync_failed_notify_calls";
                    tapToPaySwitchUserObserver$handleSwitchUser$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(tapToPaySwitchUserObserver$handleSwitchUser$1);
                    tapToPaySwitchUserObserver$handleSwitchUser$1.getHighSpeedVideoFpsRanges = 0;
                    tapToPaySwitchUserObserver$handleSwitchUser$1.getHighSpeedVideoFpsRangesFor = 0;
                    tapToPaySwitchUserObserver$handleSwitchUser$1.getOutputFormats = 3;
                }
                com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalCloseCardsUseCase payPalCloseCardsUseCase = this.getHighSpeedVideoFpsRanges;
                tapToPaySwitchUserObserver$handleSwitchUser$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(this);
                tapToPaySwitchUserObserver$handleSwitchUser$1.Camera2StreamConfigurationMap = "close_cards";
                tapToPaySwitchUserObserver$handleSwitchUser$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(tapToPaySwitchUserObserver$handleSwitchUser$1);
                tapToPaySwitchUserObserver$handleSwitchUser$1.getHighSpeedVideoFpsRanges = 0;
                tapToPaySwitchUserObserver$handleSwitchUser$1.getHighSpeedVideoFpsRangesFor = 0;
                tapToPaySwitchUserObserver$handleSwitchUser$1.getOutputFormats = 2;
            }
        }
        tapToPaySwitchUserObserver$handleSwitchUser$1 = new com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPaySwitchUserObserver$handleSwitchUser$1(this, continuation);
        java.lang.Object obj2 = tapToPaySwitchUserObserver$handleSwitchUser$1.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = tapToPaySwitchUserObserver$handleSwitchUser$1.getOutputFormats;
        if (i != 0) {
        }
        com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalCloseCardsUseCase payPalCloseCardsUseCase2 = this.getHighSpeedVideoFpsRanges;
        tapToPaySwitchUserObserver$handleSwitchUser$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(this);
        tapToPaySwitchUserObserver$handleSwitchUser$1.Camera2StreamConfigurationMap = "close_cards";
        tapToPaySwitchUserObserver$handleSwitchUser$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(tapToPaySwitchUserObserver$handleSwitchUser$1);
        tapToPaySwitchUserObserver$handleSwitchUser$1.getHighSpeedVideoFpsRanges = 0;
        tapToPaySwitchUserObserver$handleSwitchUser$1.getHighSpeedVideoFpsRangesFor = 0;
        tapToPaySwitchUserObserver$handleSwitchUser$1.getOutputFormats = 2;
    }
}
